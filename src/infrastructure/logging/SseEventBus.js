const EventEmitter = require('events');

/**
 * SseEventBus (Infrastructure Layer)
 * Manages Server-Sent Events (SSE) clients and broadcasts logs and status events.
 */
class SseEventBus extends EventEmitter {
  constructor() {
    super();
    this.clients = new Set();
    this.maxGlobalLogs = 1000;
    this.logs = [];

    // Periodic heartbeat to keep connections alive
    setInterval(() => {
      this.broadcast('ping', { time: Date.now() });
    }, 25000);
  }

  addClient(res) {
    res.writeHead(200, {
      'Content-Type': 'text/event-stream; charset=utf-8',
      'Cache-Control': 'no-cache, no-transform',
      'Connection': 'keep-alive',
      'X-Accel-Buffering': 'no',
      'Access-Control-Allow-Origin': '*'
    });

    res.write(`data: ${JSON.stringify({ type: 'connected', message: 'SSE Live Stream Connected' })}\n\n`);
    this.clients.add(res);

    res.on('close', () => {
      this.clients.delete(res);
    });
  }

  addLog(entry) {
    const formatted = {
      timestamp: entry.timestamp || new Date().toLocaleTimeString('vi-VN', { hour12: false }),
      type: entry.type || 'stdout',
      accountId: entry.accountId || null,
      username: entry.username || null,
      text: (entry.text || '').trimEnd()
    };

    this.logs.push(formatted);
    if (this.logs.length > this.maxGlobalLogs) {
      this.logs.shift();
    }

    this.broadcast('log', formatted);
    this.emit('log', formatted);
  }

  clearLogs() {
    this.logs = [];
    this.broadcast('clear-logs', { success: true });
  }

  broadcast(eventType, data) {
    const payload = `event: ${eventType}\ndata: ${JSON.stringify(data)}\n\n`;
    for (const client of this.clients) {
      try {
        client.write(payload);
      } catch (err) {
        this.clients.delete(client);
      }
    }
  }

  getClientCount() {
    return this.clients.size;
  }
}

module.exports = SseEventBus;
