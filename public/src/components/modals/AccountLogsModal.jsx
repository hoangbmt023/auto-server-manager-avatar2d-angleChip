/**
 * AccountLogsModal Component (Presentation Layer)
 * Displays user-friendly, filtered system and auto action logs for a specific bot account.
 * Completely strips away emulator technical Java stacktraces.
 */
window.AccountLogsModal = function AccountLogsModal({ account, onClose }) {
  const [logs, setLogs] = React.useState([]);
  const [isLoading, setIsLoading] = React.useState(true);
  const [filter, setFilter] = React.useState('all'); // 'all', 'auto', 'system'
  const [autoRefresh, setAutoRefresh] = React.useState(true);
  const logContainerRef = React.useRef(null);

  const fetchLogs = React.useCallback(async () => {
    if (!account || !account.id) return;
    try {
      if (window.accountService) {
        const res = await window.accountService.getAccountLogs(account.id);
        if (res && res.success) {
          setLogs(res.logs || []);
        }
      }
    } catch (err) {
      console.error('Lỗi tải nhật ký bot:', err);
    } finally {
      setIsLoading(false);
    }
  }, [account]);

  React.useEffect(() => {
    fetchLogs();
    if (!autoRefresh) return;
    const interval = setInterval(fetchLogs, 3000);
    return () => clearInterval(interval);
  }, [fetchLogs, autoRefresh]);

  // Auto scroll to bottom
  React.useEffect(() => {
    if (logContainerRef.current) {
      logContainerRef.current.scrollTop = logContainerRef.current.scrollHeight;
    }
  }, [logs]);

  // Close on ESC
  React.useEffect(() => {
    const handleKeyDown = (e) => {
      if (e.key === 'Escape') onClose();
    };
    window.addEventListener('keydown', handleKeyDown);
    return () => window.removeEventListener('keydown', handleKeyDown);
  }, [onClose]);

  if (!account) return null;

  const filteredLogs = logs.filter(l => {
    if (filter === 'all') return true;
    const text = (l.text || '').toLowerCase();
    if (filter === 'auto') {
      return l.type === 'auto' || text.includes('auto') || text.includes('farm') || text.includes('câu cá') || text.includes('bán đá');
    }
    if (filter === 'system') {
      return l.type === 'system' || text.includes('kết nối') || text.includes('đăng nhập') || text.includes('máy chủ');
    }
    return true;
  });

  return (
    <div className="modal-backdrop-glass" onClick={onClose}>
      <div
        className="modal-container-glass modal-account-logs-dialog"
        onClick={(e) => e.stopPropagation()}
      >
        {/* Header */}
        <div className="modal-header-glass account-logs-header">
          <div className="account-logs-header-left">
            <div className="account-logs-icon-badge">
              <window.Icon name="terminal" size={18} />
            </div>
            <div>
              <h3 className="account-logs-title">Nhật Ký Hoạt Động Bot</h3>
              <p className="account-logs-subtitle">
                Tài khoản: <strong>{account.username}</strong>
              </p>
            </div>
          </div>
          <button type="button" className="btn-icon-close" onClick={onClose}>
            <window.Icon name="x" size={16} />
          </button>
        </div>

        {/* Toolbar & Filter */}
        <div className="account-logs-toolbar">
          <div className="account-logs-filter-group">
            <button
              type="button"
              className={`btn btn-xs ${filter === 'all' ? 'btn-primary' : 'btn-secondary'}`}
              onClick={() => setFilter('all')}
            >
              Tất Cả ({logs.length})
            </button>
            <button
              type="button"
              className={`btn btn-xs ${filter === 'auto' ? 'btn-primary' : 'btn-secondary'}`}
              onClick={() => setFilter('auto')}
            >
              Hành Động Auto
            </button>
            <button
              type="button"
              className={`btn btn-xs ${filter === 'system' ? 'btn-primary' : 'btn-secondary'}`}
              onClick={() => setFilter('system')}
            >
              Hệ Thống & Kết Nối
            </button>
          </div>

          <div className="account-logs-options-group">
            <label className="account-logs-auto-refresh-label">
              <input
                type="checkbox"
                checked={autoRefresh}
                onChange={(e) => setAutoRefresh(e.target.checked)}
              />
              Tự cuộn (3s)
            </label>
            <button
              type="button"
              className="btn btn-xs btn-secondary"
              onClick={fetchLogs}
              title="Làm mới ngay"
            >
              <window.Icon name="refresh" size={11} />
            </button>
          </div>
        </div>

        {/* Log Viewer Content */}
        <div
          ref={logContainerRef}
          className="account-logs-body"
        >
          {isLoading && logs.length === 0 ? (
            <div className="account-logs-loading">
              <div className="account-logs-loading-spinner" />
              Đang tải nhật ký bot...
            </div>
          ) : filteredLogs.length === 0 ? (
            <div className="account-logs-empty">
              <window.Icon name="activity" size={32} />
              <div className="account-logs-empty-title">Chưa Có Sự Kiện Hoạt Động</div>
              <div className="account-logs-empty-subtitle">
                Khi bạn bấm Treo hoặc Auto, toàn bộ sự kiện gieo hạt, thu hoạch, kết nối sẽ hiển thị ở đây.
              </div>
            </div>
          ) : (
            filteredLogs.map((log, idx) => {
              const text = log.text || '';
              let tagType = 'bot';
              let textType = 'default';

              if (text.includes('Auto Farm') || text.includes('chăm sóc') || text.includes('thu hoạch') || text.includes('gieo hạt')) {
                tagType = 'farm';
                textType = 'farm';
              } else if (text.includes('Câu Cá') || text.includes('cá') || text.includes('mua vé')) {
                tagType = 'fish';
                textType = 'fish';
              } else if (text.includes('Bán Đá') || text.includes('đập đá') || text.includes('quặng')) {
                tagType = 'ore';
                textType = 'ore';
              } else if (text.includes('Kết nối') || text.includes('Đăng nhập') || text.includes('Hoàn Mỹ') || text.includes('Diệu Kỳ')) {
                tagType = 'network';
                textType = 'network';
              } else if (text.includes('Lỗi') || text.includes('mất kết nối') || text.includes('thất bại')) {
                tagType = 'error';
                textType = 'error';
              }

              return (
                <div key={idx} className="account-logs-row">
                  <span className="account-logs-time">
                    {log.timestamp || '--:--:--'}
                  </span>
                  <span className={`account-logs-tag account-logs-tag-${tagType}`}>
                    BOT
                  </span>
                  <span className={`account-logs-text account-logs-text-${textType}`}>
                    {text}
                  </span>
                </div>
              );
            })
          )}
        </div>

        {/* Footer */}
        <div className="account-logs-footer">
          <span>Chỉ hiển thị các nhật ký nghiệp vụ bot. Không chứa mã nguồn giả lập kỹ thuật.</span>
          <button type="button" className="btn btn-secondary btn-sm" onClick={onClose}>
            Đóng
          </button>
        </div>
      </div>
    </div>
  );
};
