/**
 * TerminalConsole Component (Presentation Layer)
 * Real-time SSE Live Terminal with smart unified Run/Stop control, account filter, and log utilities.
 */
window.TerminalConsole = function TerminalConsole({
  logs = [],
  accounts = [],
  logFilter,
  setLogFilter,
  autoScroll,
  setAutoScroll,
  terminalRef,
  isAnyRunning,
  onStartAllFile,
  onStopAll,
  onRestartAll,
  onClearLogs,
  onDownloadLogs
}) {
  const accountUsernames = Array.from(new Set(accounts.map(a => a.username))).filter(Boolean);

  const classifyLog = (type, text = '') => {
    if (type === 'error' || type === 'err' || text.includes('❌') || text.includes('Error:') || text.includes('LỖI') || text.includes('MẬT KHẨU')) return 'error';
    if (type === 'warn' || text.includes('⚠️') || text.includes('CẢNH BÁO') || text.includes('BẢO TRÌ') || text.includes('MẤT KẾT NỐI') || text.includes('ĐÓNG SOCKET')) return 'warn';
    if (text.includes('💬') || text.includes('[POPUP GAME]')) return 'popup';
    if (text.includes('🔄') || text.includes('[TỰ ĐỘNG ĐĂNG NHẬP') || text.includes('khởi động lại')) return 'retry';
    if (type === 'success' || text.includes('✅') || text.includes('🎉') || text.includes('THÀNH CÔNG') || text.includes('HOÀN THÀNH') || text.includes('MỤC TIÊU')) return 'success';
    if (text.includes('🌾') || text.includes('FARM') || text.includes('nông trại') || text.includes('chăm farm') || text.includes('thu hoạch') || text.includes('Về Farm')) return 'farm';
    if (text.includes('💎') || text.includes('KIM CƯƠNG') || text.includes('Đào Khoáng') || text.includes('KCX') || text.includes('NHB')) return 'diamond';
    if (text.includes('🎣') || text.includes('CÂU CÁ') || text.includes('cần câu') || text.includes('vé câu') || text.includes('cá cắn')) return 'fish';
    if (type === 'info' || text.includes('🚀') || text.includes('[QUY TRÌNH]') || text.includes('Đang kết nối')) return 'info';
    if (type === 'system' || text.includes('[System]')) return 'system';
    return type || 'out';
  };

  const renderLogMessage = (text = '') => {
    const match = text.match(/^(\[[^\]]+\])\s*(.*)$/);
    if (match) {
      return (
        <>
          <span className="log-user-badge">{match[1]}</span>
          <span>{match[2]}</span>
        </>
      );
    }
    return text;
  };

  return (
    <section className="console-card">
      <div className="console-header">
        <div className="console-title">
          <span className="terminal-dots">
            <span className="dot dot-red"></span>
            <span className="dot dot-yellow"></span>
            <span className="dot dot-green"></span>
          </span>
          <h3>Nhật Ký Hoạt Động (Live Terminal)</h3>
        </div>

        {/* Unified & Optimized Action Toolbar */}
        <div className="action-toolbar">
          <select
            className="form-control terminal-filter-select"
            value={logFilter}
            onChange={(e) => setLogFilter(e.target.value)}
          >
            <option value="all">🔍 Tất cả tài khoản</option>
            {accountUsernames.map(u => (
              <option key={u} value={u}>👤 {u}</option>
            ))}
          </select>

          {/* Single Unified Run / Stop File Button */}
          {isAnyRunning ? (
            <button
              type="button"
              className="btn btn-danger btn-sm btn-terminal-action"
              onClick={onStopAll}
              title="Dừng toàn bộ bot đang chạy trong File"
            >
              ⏹️ Dừng Cả File
            </button>
          ) : (
            <button
              type="button"
              className="btn btn-success btn-sm btn-terminal-action"
              onClick={onStartAllFile}
              title="Khởi chạy toàn bộ bot trong File này"
            >
              ▶️ Chạy Cả File
            </button>
          )}

          <button
            type="button"
            className="btn btn-warning btn-sm btn-terminal-action"
            disabled={!isAnyRunning}
            onClick={onRestartAll}
            title="Khởi động lại toàn bộ bot"
          >
            🔄 Khởi Động Lại
          </button>

          <button
            type="button"
            className="btn btn-secondary btn-sm btn-terminal-action"
            onClick={onClearLogs}
            title="Xóa toàn bộ log trên màn hình"
          >
            🗑️ Xóa Log
          </button>

          <button
            type="button"
            className="btn btn-secondary btn-sm btn-terminal-action"
            onClick={onDownloadLogs}
            title="Tải log về máy dạng file text"
          >
            📥 Tải Log
          </button>
        </div>
      </div>

      <div className="terminal-container" ref={terminalRef}>
        <div className="log-list">
          {logs.length === 0 ? (
            <div className="log-item log-system">
              <span className="log-time">[System]</span>
              <span className="log-msg">Chưa có nhật ký hoạt động nào. Hãy ấn Treo Nick để bắt đầu...</span>
            </div>
          ) : (
            logs.map((l, idx) => {
              const logClass = classifyLog(l.type, l.text);
              const key = l.id || `${l.timestamp || ''}-${idx}-${(l.text || '').slice(0, 15)}`;
              return (
                <div key={key} className={`log-item log-${logClass}`}>
                  <span className="log-time">[{l.timestamp || '--:--:--'}]</span>
                  <span className="log-msg">{renderLogMessage(l.text)}</span>
                </div>
              );
            })
          )}
        </div>
      </div>

      <div className="console-footer">
        <div className="auto-scroll-toggle">
          <input
            type="checkbox"
            id="chkAutoScroll"
            checked={autoScroll}
            onChange={(e) => setAutoScroll(e.target.checked)}
          />
          <label htmlFor="chkAutoScroll">Tự động cuộn xuống dòng mới nhất</label>
        </div>
        <div className="log-counter">
          Tổng số dòng: <strong>{logs.length}</strong>
        </div>
      </div>
    </section>
  );
};
