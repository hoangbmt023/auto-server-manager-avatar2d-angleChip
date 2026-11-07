/**
 * TerminalConsole Component (Presentation Layer)
 * Porsche & Apple Precision Terminal Window with Unified Theme & Vector Icons
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
    if (text.includes('🔄') || text.includes('[TỰ ĐỘNG ĐĂNG NHẬP') || text.includes('khởi động lại') || text.includes('RESET DỮ LIỆU')) return 'retry';
    if (type === 'success' || text.includes('✅') || text.includes('🎉') || text.includes('THÀNH CÔNG') || text.includes('HOÀN THÀNH') || text.includes('MỤC TIÊU')) return 'success';
    if (text.includes('🌾') || text.includes('FARM') || text.includes('nông trại') || text.includes('chăm farm') || text.includes('thu hoạch') || text.includes('Về Farm') || text.includes('Nông sản') || text.includes('Cây trồng')) return 'farm';
    if (text.includes('💎') || text.includes('KIM CƯƠNG') || text.includes('Đào Khoáng') || text.includes('KCX') || text.includes('NHB') || text.includes('🪨') || text.includes('BÁN ĐÁ')) return 'diamond';
    if (text.includes('🎣') || text.includes('CÂU CÁ') || text.includes('cần câu') || text.includes('vé câu') || text.includes('cá cắn')) return 'fish';
    if (type === 'info' || text.includes('🚀') || text.includes('[QUY TRÌNH]') || text.includes('Đang kết nối') || text.includes('PROXY SETUP') || text.includes('🔍') || text.includes('DIAGNOSTIC')) return 'info';
    if (type === 'system' || text.includes('[System]')) return 'system';
    return type || 'out';
  };

  const renderLogMessage = (text = '') => {
    const match = text.match(/^(\[[^\]]+\])\s*(.*)$/);
    if (match) {
      return (
        <>
          <span className="log-user-badge">{match[1].replace(/\[|\]/g, '')}</span>
          <span>{match[2]}</span>
        </>
      );
    }
    return text;
  };

  const [isScrolledUp, setIsScrolledUp] = React.useState(false);

  const handleScroll = (e) => {
    const el = e.target;
    if (!el) return;
    const isAtBottom = el.scrollHeight - el.scrollTop - el.clientHeight < 35;
    setIsScrolledUp(!isAtBottom);
  };

  const handleToggleAutoScroll = () => {
    const nextState = !autoScroll;
    setAutoScroll(nextState);
    if (nextState && terminalRef.current) {
      terminalRef.current.scrollTop = terminalRef.current.scrollHeight;
      setIsScrolledUp(false);
    }
  };

  const handleScrollToBottom = () => {
    if (terminalRef.current) {
      terminalRef.current.scrollTop = terminalRef.current.scrollHeight;
      setIsScrolledUp(false);
    }
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
          <div style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
            <window.Icon name="terminal" size={15} color="var(--text-tertiary)" />
            <h3>Terminal Console</h3>
          </div>
        </div>

        {/* Action Toolbar Controls with Vector Icons */}
        <div className="action-toolbar">
          <select
            className="form-control terminal-filter-select"
            value={logFilter}
            onChange={(e) => setLogFilter(e.target.value)}
          >
            <option value="all">Tất cả tài khoản</option>
            {accountUsernames.map(u => (
              <option key={u} value={u}>{u}</option>
            ))}
          </select>

          {/* Auto Scroll Lock/Toggle Button */}
          <button
            type="button"
            className={`btn btn-sm ${autoScroll ? 'btn-active' : 'btn-secondary'}`}
            onClick={handleToggleAutoScroll}
            title={autoScroll ? 'Tự động cuộn: Đang BẬT (Nhấn để tạm dừng)' : 'Tự động cuộn: Đang TẮT (Nhấn để bật lại)'}
            style={{ gap: '5px', fontSize: '0.74rem' }}
          >
            <window.Icon
              name={autoScroll ? 'arrow-down' : 'pause'}
              size={12}
              color={autoScroll ? 'var(--apple-blue)' : 'var(--text-tertiary)'}
            />
            <span>{autoScroll ? 'Tự Cuộn' : 'Dừng Cuộn'}</span>
          </button>

          {/* Grouped Batch Run Controls */}
          <div className="segmented-control">
            {isAnyRunning ? (
              <button
                type="button"
                className="btn btn-sm btn-danger"
                style={{ borderRadius: '999px', gap: '5px' }}
                onClick={onStopAll}
                title="Dừng toàn bộ bot trong File"
              >
                <window.Icon name="stop" size={13} /> Dừng File
              </button>
            ) : (
              <button
                type="button"
                className="btn btn-sm btn-success"
                style={{ borderRadius: '999px', gap: '5px' }}
                onClick={onStartAllFile}
                title="Khởi chạy toàn bộ bot trong File"
              >
                <window.Icon name="play" size={13} /> Chạy File
              </button>
            )}

            <button
              type="button"
              className="btn btn-sm"
              disabled={!isAnyRunning}
              onClick={onRestartAll}
              title="Khởi động lại toàn bộ bot"
              style={{ opacity: !isAnyRunning ? 0.4 : 1 }}
            >
              <window.Icon name="refresh" size={13} />
            </button>
          </div>

          {/* Utility Tools */}
          <div className="segmented-control">
            <button
              type="button"
              className="btn btn-sm"
              onClick={onClearLogs}
              title="Xóa log trên màn hình"
            >
              <window.Icon name="trash" size={13} />
            </button>
            <button
              type="button"
              className="btn btn-sm"
              onClick={onDownloadLogs}
              title="Tải file log về máy"
            >
              <window.Icon name="download" size={13} />
            </button>
          </div>
        </div>
      </div>

      <div className="terminal-container" ref={terminalRef} onScroll={handleScroll} style={{ position: 'relative' }}>
        <div className="log-list">
          {logs.length === 0 ? (
            <div className="log-item log-system">
              <span className="log-time">[System]</span>
              <span className="log-msg">Chưa có nhật ký hoạt động. Hãy nhấn Treo Nick để bắt đầu...</span>
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

        {/* Floating Scroll to Bottom pill when user scrolled up */}
        {isScrolledUp && (
          <button
            type="button"
            className="terminal-scroll-bottom-pill"
            onClick={handleScrollToBottom}
            title="Cuộn xuống log mới nhất"
          >
            <window.Icon name="arrow-down" size={12} color="var(--apple-blue)" />
            <span>Mới nhất</span>
          </button>
        )}
      </div>
    </section>
  );
};
