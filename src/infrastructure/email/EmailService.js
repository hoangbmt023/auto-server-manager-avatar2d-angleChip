const fs = require('fs');
const path = require('path');
const nodemailer = require('nodemailer');
const config = require('../../../config');
const { logger } = require('../logging/Logger');
const { BadRequestException } = require('../../domain/errors');

/**
 * EmailService (Infrastructure Layer - Email)
 * Sends transactional emails via Gmail SMTP using templates/email/ HTML templates.
 * Enforces real SMTP credentials and logs only success/failure status (No OTP codes in logs).
 */
class EmailService {
  constructor(templatesDir = null) {
    this.transporter = null;
    this.isConfigured = false;
    this.templatesDir = templatesDir || path.resolve(__dirname, '../../../templates/email');
    this.initTransporter();
  }

  initTransporter() {
    const { host, port, user, pass } = config.email;
    if (user && pass) {
      try {
        const smtpHost = host || 'smtp.gmail.com';
        const smtpPort = port || 587;

        this.transporter = nodemailer.createTransport({
          host: smtpHost,
          port: smtpPort,
          secure: smtpPort === 465,
          auth: { user, pass }
        });
        this.isConfigured = true;
        logger.info(`[EmailService] SMTP Transporter khởi tạo thành công cho ${smtpHost} (${user})`);
      } catch (err) {
        logger.error(`[EmailService] Lỗi khởi tạo SMTP transporter: ${err.message}`);
        this.transporter = null;
        this.isConfigured = false;
      }
    } else {
      logger.warn('[EmailService] Chưa cấu hình SMTP_USER / SMTP_PASS trong file .env');
    }
  }

  /**
   * Helper to load and compile an HTML email template
   * @param {string} filename - Template file name (e.g. 'activation-otp.html')
   * @param {Record<string, string>} replacements
   * @returns {string}
   */
  _renderTemplate(filename, replacements = {}) {
    const filePath = path.join(this.templatesDir, filename);
    let html = '';

    const logoUrl = config.email.logoUrl || process.env.EMAIL_LOGO_URL || '';
    const logoSrc = logoUrl || 'cid:avatar2d-logo';
    const brandLogoHtml = `<img src="${logoSrc}" alt="Avatar2D Auto" width="34" height="34" style="display: block; width: 34px; height: 34px; border-radius: 8px; border: 0; object-fit: contain;" />`;

    try {
      html = fs.readFileSync(filePath, 'utf8');
    } catch (err) {
      logger.warn(`[EmailService] Không thể đọc file template [${filePath}]: ${err.message}. Sử dụng giao diện dự phòng.`);
      html = `
        <div style="font-family: Arial, sans-serif; background: #ffffff; color: #1e293b; padding: 28px; border-radius: 12px; border: 1px solid #e2e8f0;">
          <div style="display: flex; align-items: center; margin-bottom: 12px;">
            ${brandLogoHtml}
            <span style="color: #0a84ff; font-weight: bold; font-size: 20px; margin-left: 8px;">AVATAR2D <span style="color: #0f172a;">AUTO</span></span>
          </div>
          <p style="margin: 0 0 16px 0; font-size: 13px; color: #64748b;">Hệ thống treo tài khoản Avatar 2D Tự Động</p>
          <p>Mã xác thực của bạn là: <strong style="font-size: 24px; color: #0284c7; letter-spacing: 6px;">{{OTP_CODE}}</strong></p>
        </div>
      `;
    }

    const defaultVars = {
      APP_NAME: 'AVATAR2D AUTO',
      YEAR: String(new Date().getFullYear()),
      BRAND_LOGO_HTML: brandLogoHtml,
      LOGO_SRC: logoSrc,
      ...replacements
    };

    for (const [key, val] of Object.entries(defaultVars)) {
      const reg = new RegExp(`{{${key}}}`, 'g');
      html = html.replace(reg, String(val));
    }

    return html;
  }

  /**
   * Sends OTP for Account Activation (Asynchronous background delivery)
   */
  async sendActivationOtp(toEmail, otpCode, username = 'Thành viên', options = { isAsync: true }) {
    const subject = `[AVATAR2D AUTO] Mã xác thực tài khoản: ${otpCode}`;
    const html = this._renderTemplate('activation-otp.html', {
      EMAIL: toEmail,
      OTP_CODE: otpCode,
      USERNAME: username
    });

    return this.sendMail(toEmail, subject, html, 'ACTIVATION_OTP', options);
  }

  /**
   * Sends OTP for Password Reset (Asynchronous background delivery)
   */
  async sendPasswordResetOtp(toEmail, otpCode, username = 'Thành viên', options = { isAsync: true }) {
    const subject = `[AVATAR2D AUTO] Mã xác thực đặt lại mật khẩu: ${otpCode}`;
    const html = this._renderTemplate('password-reset-otp.html', {
      EMAIL: toEmail,
      OTP_CODE: otpCode,
      USERNAME: username
    });

    return this.sendMail(toEmail, subject, html, 'PASSWORD_RESET_OTP', options);
  }

  /**
   * Internal sender: Enforces SMTP credentials and dispatches mail.
   * By default runs asynchronously in background (isAsync: true) to eliminate HTTP response latency.
   */
  async sendMail(to, subject, html, type, { isAsync = true } = {}) {
    const senderEmail = config.email.user || config.email.from;
    const senderName = 'AVATAR2D AUTO';
    const formattedFrom = `"${senderName}" <${senderEmail}>`;

    if (!this.isConfigured || !this.transporter) {
      const errorMsg = 'Chưa cấu hình tài khoản Gmail gửi thư (Vui lòng điền SMTP_USER và SMTP_PASS vào file .env)!';
      logger.error(`[EmailService] [${type}] Thất bại: ${errorMsg}`);
      throw new BadRequestException(errorMsg);
    }

    const mailOptions = {
      from: formattedFrom,
      to,
      subject,
      html
    };

    // Attach local logo via CID if HTML references 'cid:avatar2d-logo'
    const logoPath = path.resolve(__dirname, '../../../public/assets/logo.png');
    if (html.includes('cid:avatar2d-logo') && fs.existsSync(logoPath)) {
      mailOptions.attachments = [
        {
          filename: 'logo.png',
          path: logoPath,
          cid: 'avatar2d-logo'
        }
      ];
    }

    // Asynchronous non-blocking background dispatch
    if (isAsync) {
      setImmediate(async () => {
        try {
          const info = await this.transporter.sendMail(mailOptions);
          logger.info(`[EmailService] [${type}] [Async] Gửi email thành công tới ${to} (MessageId: ${info.messageId})`);
        } catch (err) {
          logger.error(`[EmailService] [${type}] [Async] Lỗi gửi email tới ${to}: ${err.message}`);
        }
      });
      return { success: true, queued: true };
    }

    try {
      const info = await this.transporter.sendMail(mailOptions);
      logger.info(`[EmailService] [${type}] Gửi email thành công tới ${to} (MessageId: ${info.messageId})`);
      return { success: true, messageId: info.messageId };
    } catch (err) {
      logger.error(`[EmailService] [${type}] Lỗi gửi email tới ${to}: ${err.message}`);
      throw new BadRequestException(`Gửi email thất bại: ${err.message}`);
    }
  }

  isTransporterReady() {
    return this.isConfigured && this.transporter !== null;
  }
}

const defaultEmailService = new EmailService();

module.exports = {
  EmailService,
  defaultEmailService
};
