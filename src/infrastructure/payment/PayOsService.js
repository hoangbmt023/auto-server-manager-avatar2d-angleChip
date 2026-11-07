const crypto = require('crypto');
const https = require('https');
const config = require('../../../config');

/**
 * PayOsService (Infrastructure / Payment Gateway Layer)
 * Integrates payOS (https://payos.vn/) for automated 24/7 bank transfer payments via NAPAS QR.
 * Zero fees, instant webhook callback and real-time wallet topup.
 * All credentials are securely configured via environment variables (.env).
 */
class PayOsService {
  constructor() {
    this.baseUrl = 'api-merchant.payos.vn';
  }

  getConfig() {
    const payos = config.payos || {};
    return {
      enabled: Boolean(payos.enabled && payos.clientId && payos.apiKey && payos.checksumKey),
      clientId: payos.clientId || '',
      apiKey: payos.apiKey || '',
      checksumKey: payos.checksumKey || '',
      bankAccount: payos.bankAccount || '',
      bankName: payos.bankName || '',
      accountName: payos.accountName || ''
    };
  }

  /**
   * Sort object keys alphabetically and generate query string for HMAC signature
   */
  createSignatureData(data) {
    const sortedKeys = Object.keys(data).sort();
    return sortedKeys
      .filter(key => data[key] !== undefined && data[key] !== null)
      .map(key => `${key}=${data[key]}`)
      .join('&');
  }

  /**
   * Compute HMAC SHA256 signature
   */
  generateHmacSha256(dataStr, checksumKey) {
    return crypto.createHmac('sha256', checksumKey).update(dataStr).digest('hex');
  }

  /**
   * Create Payment Link via payOS API v2
   */
  async createPaymentLink({ orderCode, amount, description, cancelUrl, returnUrl }) {
    const payosCfg = this.getConfig();
    if (!payosCfg.enabled) {
      throw new Error('Cổng thanh toán payOS chưa được cấu hình hoặc chưa bật trong file .env!');
    }

    const cleanDescription = (description || `NAP ${orderCode}`)
      .normalize('NFD')
      .replace(/[\u0300-\u036f]/g, '')
      .replace(/[^a-zA-Z0-9 ]/g, '')
      .trim()
      .substring(0, 25);

    const payloadToSign = {
      amount: parseInt(amount, 10),
      cancelUrl,
      description: cleanDescription,
      orderCode: parseInt(orderCode, 10),
      returnUrl
    };

    const signatureData = this.createSignatureData(payloadToSign);
    const signature = this.generateHmacSha256(signatureData, payosCfg.checksumKey);

    const requestBody = JSON.stringify({
      ...payloadToSign,
      signature
    });

    return new Promise((resolve, reject) => {
      const options = {
        hostname: this.baseUrl,
        port: 443,
        path: '/v2/payment-requests',
        method: 'POST',
        headers: {
          'x-client-id': payosCfg.clientId,
          'x-api-key': payosCfg.apiKey,
          'Content-Type': 'application/json',
          'Content-Length': Buffer.byteLength(requestBody)
        }
      };

      const req = https.request(options, (res) => {
        let responseBody = '';
        res.on('data', chunk => { responseBody += chunk; });
        res.on('end', () => {
          try {
            const parsed = JSON.parse(responseBody);
            if (res.statusCode >= 200 && res.statusCode < 300 && parsed.code === '00') {
              resolve(parsed.data);
            } else {
              reject(new Error(parsed.desc || parsed.message || `Lỗi payOS HTTP ${res.statusCode}`));
            }
          } catch (e) {
            reject(new Error(`Phản hồi payOS không hợp lệ: ${responseBody.substring(0, 100)}`));
          }
        });
      });

      req.on('error', (err) => {
        reject(new Error(`Kết nối payOS thất bại: ${err.message}`));
      });

      req.write(requestBody);
      req.end();
    });
  }

  /**
   * Get payment link information by order code or payOS paymentLinkId
   */
  async getPaymentLinkInformation(orderId) {
    const payosCfg = this.getConfig();
    if (!payosCfg.enabled) {
      throw new Error('Cổng thanh toán payOS chưa được bật trong file .env!');
    }

    return new Promise((resolve, reject) => {
      const options = {
        hostname: this.baseUrl,
        port: 443,
        path: `/v2/payment-requests/${orderId}`,
        method: 'GET',
        headers: {
          'x-client-id': payosCfg.clientId,
          'x-api-key': payosCfg.apiKey
        }
      };

      const req = https.request(options, (res) => {
        let responseBody = '';
        res.on('data', chunk => { responseBody += chunk; });
        res.on('end', () => {
          try {
            const parsed = JSON.parse(responseBody);
            if (res.statusCode >= 200 && res.statusCode < 300 && parsed.code === '00') {
              resolve(parsed.data);
            } else {
              reject(new Error(parsed.desc || parsed.message || `Lỗi payOS HTTP ${res.statusCode}`));
            }
          } catch (e) {
            reject(new Error(`Phản hồi payOS không hợp lệ: ${responseBody.substring(0, 100)}`));
          }
        });
      });

      req.on('error', (err) => {
        reject(new Error(`Kết nối payOS thất bại: ${err.message}`));
      });

      req.end();
    });
  }

  /**
   * Cancel payment link on payOS
   */
  async cancelPaymentLink(orderId, cancellationReason = 'Người dùng hủy thanh toán') {
    const payosCfg = this.getConfig();
    if (!payosCfg.enabled) return null;

    return new Promise((resolve) => {
      const requestBody = JSON.stringify({ cancellationReason });
      const options = {
        hostname: this.baseUrl,
        port: 443,
        path: `/v2/payment-requests/${orderId}/cancel`,
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Content-Length': Buffer.byteLength(requestBody),
          'x-client-id': payosCfg.clientId,
          'x-api-key': payosCfg.apiKey
        }
      };

      const req = https.request(options, (res) => {
        let responseBody = '';
        res.on('data', chunk => { responseBody += chunk; });
        res.on('end', () => {
          try {
            const parsed = JSON.parse(responseBody);
            resolve(parsed.data || parsed);
          } catch (e) {
            resolve(null);
          }
        });
      });

      req.on('error', () => resolve(null));
      req.write(requestBody);
      req.end();
    });
  }

  /**
   * Verify Webhook payload authenticity
   */
  async verifyWebhookSignature(webhookBody) {
    if (!webhookBody || !webhookBody.data || !webhookBody.signature) {
      return false;
    }

    const payosCfg = this.getConfig();
    if (!payosCfg.checksumKey) return false;

    const dataObj = webhookBody.data;
    const sortedData = Object.keys(dataObj)
      .sort()
      .filter(k => dataObj[k] !== undefined && dataObj[k] !== null)
      .map(k => `${k}=${dataObj[k]}`)
      .join('&');

    const expectedSig = this.generateHmacSha256(sortedData, payosCfg.checksumKey);
    const receivedSig = webhookBody.signature;
    if (!receivedSig || typeof receivedSig !== 'string') return false;

    const expectedBuf = Buffer.from(expectedSig, 'utf8');
    const receivedBuf = Buffer.from(receivedSig, 'utf8');

    if (expectedBuf.length !== receivedBuf.length) return false;
    return crypto.timingSafeEqual(expectedBuf, receivedBuf);
  }
}

module.exports = PayOsService;
