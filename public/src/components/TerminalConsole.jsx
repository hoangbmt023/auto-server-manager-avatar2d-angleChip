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
            logs.map((l, idx) => (
              <div key={idx} className={`log-item log-${l.type || 'out'}`}>
                <span className="log-time">[{l.timestamp || '--:--:--'}]</span>
                <span className="log-msg">{l.text}</span>
              </div>
            ))
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
