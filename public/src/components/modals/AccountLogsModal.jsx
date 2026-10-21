/**
 * AccountLogsModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Bot Logs Viewer
 * Completely strips away emulator technical Java stacktraces.
 * Uses standard ModalBase container matching all dashboard forms.
 */
window.AccountLogsModal = function AccountLogsModal({ account, onClose, isAdmin = undefined }) {
  const [logs, setLogs] = React.useState([]);
  const [isLoading, setIsLoading] = React.useState(true);
  const [filter, setFilter] = React.useState('all'); // 'all', 'auto', 'system'
  const [autoScroll, setAutoScroll] = React.useState(true);
  const [showEmulatorLogs, setShowEmulatorLogs] = React.useState(false);
  const logContainerRef = React.useRef(null);

  const currentUser = window.authService?.getCurrentUser ? window.authService.getCurrentUser() : null;
  const isActualAdmin = isAdmin !== undefined
    ? Boolean(isAdmin)
    : (currentUser && String(currentUser.role || '').toUpperCase() === 'ADMIN');

  const isEmulatorLog = (rawText) => {
    if (!rawText) return true;
    const text = String(rawText);
    if (/^\t|\s{2,}(at |org\.|com\.|javax?\.|sun\.|[a-zA-Z0-9_$]+\.[a-zA-Z0-9_$]+)/.test(text)) return true;
    if (/\(null:-1\)/i.test(text) || /:\s*-1\)/i.test(text)) return true;
    if (/Picked up JAVA_TOOL_OPTIONS/i.test(text)) return true;
    if (/org\.microemu|microemu/i.test(text)) return true;
    if (/headless arguments/i.test(text)) return true;
    if (/openJar|loadJar|loadClass/i.test(text)) return true;
    if (/at java\.|at javax\.|at com\.|at org\./i.test(text)) return true;
    if (/Exception in thread|java\.lang\./i.test(text)) return true;
    if (/RecordStoreImpl|Font:|Graphics|MIDlet|UnsatisfiedLinkError|\[B@|\[C@|DeviceDisplay/i.test(text)) return true;
    if (/\[TXR\]|TxRunner|\[CG\]|CoGiao|Bridge\.hidden|\[POP\]\s*hidden popup/i.test(text)) return true;
    if (/(\[.*?\]\s*)?(index|readMapItem|doGetHandler|addElement):\s*\d*/i.test(text)) return true;
    if (/^[=\-─_]{8,}/.test(text) || /(\[.*?\]\s*)[=\-─_]{8,}/.test(text)) return true;
    if (/AVATAR HEADLESS AUTO-LOGIN/i.test(text)) return true;
    if (/TÀI KHOẢN \(WEB\):|SERVER\s*\(WEB\):|MẬT KHẨU \(WEB\):/i.test(text)) return true;
    if (/\[PROXY SETUP\]|\[GIẢ LẬP ANGELCHIP\]|PROXY\s*\(NET\):/i.test(text)) return true;
    if (/\[CÀI ĐẶT AUTO/i.test(text)) return true;
    if (/DEBUG/i.test(text)) return true;
    return false;
  };

  const fetchLogs = React.useCallback(async () => {
    if (!account || !account.id) return;
    try {
      let res = null;
      if (window.accountService && window.accountService.getAccountLogs) {
        res = await window.accountService.getAccountLogs(account.id);
      } else if (window.ApiClient && window.ApiClient.getAccountLogs) {
        res = await window.ApiClient.getAccountLogs(account.id);
      }
      if (res && res.success) {
        setLogs(res.logs || []);
      }
    } catch (err) {
      console.error('Lỗi tải nhật ký bot:', err);
    } finally {
      setIsLoading(false);
    }
  }, [account]);

  // 1. Initial fetch from API once
  React.useEffect(() => {
    fetchLogs();
  }, [fetchLogs]);

  // 2. Realtime SSE listener for new live logs
  React.useEffect(() => {
    if (!account || !account.id) return;

    let es = null;
    try {
      es = new EventSource('/api/events');
      es.addEventListener('log', (e) => {
        try {
          const newLog = JSON.parse(e.data);
          if (!newLog) return;
          const matchesAccount = 
            (newLog.accountId && String(newLog.accountId) === String(account.id)) ||
            (account.username && (newLog.username === account.username || newLog.text?.includes(`[${account.username}]`)));
          
          if (matchesAccount) {
            setLogs(prev => {
              const last = prev[prev.length - 1];
              if (last && last.timestamp === newLog.timestamp && last.text === newLog.text) {
                return prev;
              }
              return [...prev.slice(-999), newLog];
            });
          }
        } catch (err) {}
      });
    } catch (err) {
      console.warn('SSE EventSource failed to connect:', err);
    }

    return () => {
      if (es) es.close();
    };
  }, [account]);

  // 3. Auto scroll to bottom when enabled
  React.useEffect(() => {
    if (autoScroll && logContainerRef.current) {
      logContainerRef.current.scrollTop = logContainerRef.current.scrollHeight;
    }
  }, [logs, autoScroll]);

  // Close on ESC
  React.useEffect(() => {
    const handleKeyDown = (e) => {
      if (e.key === 'Escape' && onClose) onClose();
    };
    window.addEventListener('keydown', handleKeyDown);
    return () => window.removeEventListener('keydown', handleKeyDown);
  }, [onClose]);

  if (!account) return null;

  const filteredLogs = logs.filter(l => {
    const rawText = l.text || '';
    const isEmu = isEmulatorLog(rawText);
    if (!showEmulatorLogs && isEmu) return false;

    if (filter === 'all') return true;
    const text = rawText.toLowerCase();
    if (filter === 'auto') {
      return l.type === 'auto' || text.includes('auto') || text.includes('farm') || text.includes('câu cá') || text.includes('bán đá') || text.includes('kc');
    }
    if (filter === 'system') {
      return l.type === 'system' || text.includes('kết nối') || text.includes('đăng nhập') || text.includes('máy chủ') || text.includes('bắt đầu') || text.includes('dừng');
    }
    return true;
  });

  const getTagInfo = (text = '') => {
    if (isEmulatorLog(text)) {
      return { tag: 'GIẢ LẬP', className: 'account-logs-tag-bot', textClass: 'account-logs-text-default' };
    }
    const lower = text.toLowerCase();
    if (lower.includes('auto farm') || lower.includes('chăm sóc') || lower.includes('thu hoạch') || lower.includes('gieo hạt') || lower.includes('nông trại')) {
      return { tag: 'FARM', className: 'account-logs-tag-farm', textClass: 'account-logs-text-farm' };
    }
    if (lower.includes('câu cá') || lower.includes('mua vé') || lower.includes('giật cần') || lower.includes('bán cá')) {
      return { tag: 'CÂU CÁ', className: 'account-logs-tag-fish', textClass: 'account-logs-text-fish' };
    }
    if (lower.includes('bán đá') || lower.includes('đập đá') || lower.includes('quặng') || lower.includes('kim cương') || lower.includes('kc')) {
      return { tag: 'ĐÁ/KC', className: 'account-logs-tag-ore', textClass: 'account-logs-text-ore' };
    }
    if (lower.includes('kết nối') || lower.includes('đăng nhập') || lower.includes('máy chủ') || lower.includes('hoàn mỹ') || lower.includes('diệu kỳ') || lower.includes('mạng')) {
      return { tag: 'KẾT NỐI', className: 'account-logs-tag-network', textClass: 'account-logs-text-network' };
    }
    if (lower.includes('lỗi') || lower.includes('mất kết nối') || lower.includes('thất bại') || lower.includes('bị chặn')) {
      return { tag: 'LỖI', className: 'account-logs-tag-error', textClass: 'account-logs-text-error' };
    }
    return { tag: 'BOT', className: 'account-logs-tag-bot', textClass: 'account-logs-text-default' };
  };

  return (
    <window.ModalBase
      title="Nhật Ký Hoạt Động Bot"
      subtitle={`Tài khoản: ${account.username}${account.serverName ? ` • Máy chủ ${account.serverName}` : ''}`}
      icon="terminal"
      iconColor="var(--apple-blue)"
      size="lg"
      onClose={onClose}
      footer={
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', width: '100%', gap: '12px' }}>
          <span style={{ fontSize: '0.74rem', color: 'var(--text-tertiary)', lineHeight: 1.4 }}>
            Nhật ký tự động ưu tiên sự kiện bot & hệ thống. Log giả lập được tắt mặc định.
          </span>
          <button type="button" className="btn btn-secondary btn-sm" onClick={onClose}>
            Đóng
          </button>
        </div>
      }
    >
      {/* 1. Toolbar & Filter */}
      <div className="account-logs-toolbar" style={{ borderRadius: 'var(--radius-sm)', marginBottom: '12px', background: 'rgba(255, 255, 255, 0.03)', border: '1px solid var(--glass-border-subtle)' }}>
        <div className="account-logs-filter-group" style={{ display: 'flex', gap: '6px', flexWrap: 'wrap' }}>
          <button
            type="button"
            className={`btn btn-xs ${filter === 'all' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => setFilter('all')}
          >
            Tất Cả ({filteredLogs.length})
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

        <div className="account-logs-options-group" style={{ display: 'flex', alignItems: 'center', gap: '12px' }}>
          {isActualAdmin && (
            <label className="account-logs-auto-refresh-label" style={{ margin: 0, fontSize: '0.75rem', display: 'flex', alignItems: 'center', gap: '5px', cursor: 'pointer' }} title="Bật/Tắt hiển thị mã nguồn và stacktrace chi tiết của giả lập MicroEmulator">
              <input
                type="checkbox"
                checked={showEmulatorLogs}
                onChange={(e) => setShowEmulatorLogs(e.target.checked)}
              />
              <span>Log giả lập</span>
            </label>
          )}
          <label className="account-logs-auto-refresh-label" style={{ margin: 0, fontSize: '0.75rem', display: 'flex', alignItems: 'center', gap: '5px', cursor: 'pointer' }} title="Tự động cuộn xuống dòng nhật ký mới nhất theo thời gian thực">
            <input
              type="checkbox"
              checked={autoScroll}
              onChange={(e) => setAutoScroll(e.target.checked)}
            />
            <span>Tự động cuộn</span>
          </label>
        </div>
      </div>

      {/* 2. Log Viewer Body */}
      <div
        ref={logContainerRef}
        className="account-logs-body"
        style={{
          margin: 0,
          minHeight: '320px',
          maxHeight: '460px',
          borderRadius: 'var(--radius-md)',
          border: '1px solid var(--glass-border-subtle)',
          background: 'rgba(10, 11, 14, 0.96)'
        }}
      >
        {isLoading && logs.length === 0 ? (
          <div className="account-logs-loading" style={{ padding: '48px 16px', textAlign: 'center' }}>
            {window.CircularSpinner ? (
              <window.CircularSpinner size="md" text="Đang tải nhật ký bot..." />
            ) : (
              <div>
                <div className="account-logs-loading-spinner" />
                <span style={{ fontSize: '0.8rem', color: 'var(--text-tertiary)' }}>Đang tải nhật ký bot...</span>
              </div>
            )}
          </div>
        ) : filteredLogs.length === 0 ? (
          <div className="account-logs-empty" style={{ padding: '48px 16px', textAlign: 'center' }}>
            <div style={{ marginBottom: '8px', opacity: 0.6 }}>
              <window.Icon name="terminal" size={36} color="var(--apple-blue)" />
            </div>
            <div className="account-logs-empty-title" style={{ fontWeight: 600, color: 'var(--text-secondary)' }}>
              Chưa Có Sự Kiện Hoạt Động
            </div>
            <div className="account-logs-empty-subtitle" style={{ fontSize: '0.78rem', color: 'var(--text-tertiary)', marginTop: '4px' }}>
              Khi bot chạy hoặc thực hiện auto, toàn bộ sự kiện gieo hạt, thu hoạch, câu cá, kết nối sẽ hiển thị ở đây.
            </div>
          </div>
        ) : (
          filteredLogs.map((log, idx) => {
            const text = log.text || '';
            const tagInfo = getTagInfo(text);

            return (
              <div key={idx} className="account-logs-row">
                <span className="account-logs-time">
                  {log.timestamp || '--:--:--'}
                </span>
                <span className={`account-logs-tag ${tagInfo.className}`}>
                  {tagInfo.tag}
                </span>
                <span className={`account-logs-text ${tagInfo.textClass}`}>
                  {text}
                </span>
              </div>
            );
          })
        )}
      </div>
    </window.ModalBase>
  );
};
