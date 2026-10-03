/**
 * AccountModal Component (Presentation Layer / Modals)
 * Add and Edit Account Modal form with File Profile, Server and Proxy assignment.
 */
const { useState: useAccModalState, useRef: useAccModalRef, useEffect: useAccModalEffect } = React;

/**
 * Reusable CustomSelect dropdown component (CSS-based, overflow-safe, dark theme)
 */
function CustomSelect({
  value,
  onChange,
  options = [],
  placeholder = 'Chọn một tùy chọn...'
}) {
  const [isOpen, setIsOpen] = useAccModalState(false);
  const wrapperRef = useAccModalRef(null);

  useAccModalEffect(() => {
    function handleClickOutside(event) {
      if (wrapperRef.current && !wrapperRef.current.contains(event.target)) {
        setIsOpen(false);
      }
    }
    if (isOpen) {
      document.addEventListener('mousedown', handleClickOutside);
      document.addEventListener('touchstart', handleClickOutside);
    }
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
      document.removeEventListener('touchstart', handleClickOutside);
    };
  }, [isOpen]);

  const selectedOption = options.find(opt => opt.value === value);

  return (
    <div className={`custom-select-wrapper ${isOpen ? 'is-open' : ''}`} ref={wrapperRef}>
      <div
        className={`custom-select-control ${isOpen ? 'open' : ''} ${selectedOption?.isExpired ? 'is-expired' : ''}`}
        onClick={() => setIsOpen(!isOpen)}
        tabIndex="0"
        onKeyDown={(e) => {
          if (e.key === 'Enter' || e.key === ' ') {
            e.preventDefault();
            setIsOpen(!isOpen);
          } else if (e.key === 'Escape') {
            setIsOpen(false);
          }
        }}
      >
        <div
          className="custom-select-value"
          title={selectedOption ? `${selectedOption.label} ${selectedOption.sub ? `(${selectedOption.sub})` : ''}` : placeholder}
        >
          {selectedOption ? (
            <React.Fragment>
              {selectedOption.isExpired && (
                <span className="select-badge-expired">⚠️ HẾT HẠN</span>
              )}
              <span className="select-value-text">{selectedOption.label}</span>
              {selectedOption.sub && (
                <span className="select-value-sub">({selectedOption.sub})</span>
              )}
            </React.Fragment>
          ) : (
            <span className="select-placeholder">{placeholder}</span>
          )}
        </div>
        <div className="custom-select-arrow">▾</div>
      </div>

      {isOpen && (
        <div className="custom-select-menu">
          {options.map(opt => (
            <div
              key={opt.value}
              className={`custom-select-item ${opt.value === value ? 'selected' : ''} ${opt.disabled ? 'disabled' : ''}`}
              onClick={(e) => {
                e.stopPropagation();
                if (opt.disabled) return;
                onChange(opt.value);
                setIsOpen(false);
              }}
            >
              <div className="select-item-main">
                <div className="select-item-title-box">
                  {opt.isExpired && (
                    <span className="select-badge-expired">⚠️ HẾT HẠN</span>
                  )}
                  <span className="select-item-title">{opt.label}</span>
                </div>
                {opt.badge && !opt.isExpired && (
                  <span className="select-badge-online">{opt.badge}</span>
                )}
              </div>
              {opt.sub && (
                <div className="select-item-sub">
                  {opt.sub} {opt.disabled ? '• (Không thể chọn)' : ''}
                </div>
              )}
            </div>
          ))}
        </div>
      )}
    </div>
  );
}

window.AccountModal = function AccountModal({
  account,
  files = [],
  proxies = [],
  activeFileId,
  onClose,
  onSaved
}) {
  const isEditing = Boolean(account);
  const [fileId, setFileId] = useAccModalState(account?.fileId || activeFileId || 'file_1');
  const [proxyId, setProxyId] = useAccModalState(account?.proxyId || '');
  const [username, setUsername] = useAccModalState(account?.username || '');
  const [password, setPassword] = useAccModalState('');
  const [serverId, setServerId] = useAccModalState(account?.serverId !== undefined ? String(account.serverId) : '0');
  const [note, setNote] = useAccModalState(account?.note || '');

  const fileOptions = files.map(f => ({
    value: f.id,
    label: f.name,
    badge: `${f.totalAccounts || 0}/6 nick`
  }));

  const serverOptions = [
    { value: '0', label: 'Server 1: Hoàn Mỹ', sub: 'Tối đa 3 nick/server' },
    { value: '1', label: 'Server 2: Diệu Kỳ', sub: 'Tối đa 3 nick/server' }
  ];

  const proxyOptions = [
    {
      value: '',
      label: 'Không dùng Proxy (IP Server)',
      sub: 'Sử dụng trực tiếp IP VPS/Hosting'
    },
    ...proxies.map(p => ({
      value: p.id,
      label: p.name,
      sub: `${(p.type || 'SOCKS').toUpperCase()} • ${p.host}:${p.port}`,
      badge: `Online: ${p.onlineCount || 0}/6`,
      disabled: Boolean(p.isExpired),
      isExpired: Boolean(p.isExpired)
    }))
  ];

  const handleSubmit = async (e) => {
    e.preventDefault();
    const notifyAlert = window.showAlert || alert;

    if (!username.trim()) {
      notifyAlert('Vui lòng nhập tên tài khoản!', 'Thiếu Thông Tin', 'warning');
      return;
    }

    const chosenProxy = proxies.find(p => p.id === proxyId);
    if (chosenProxy && chosenProxy.isExpired) {
      notifyAlert(`Proxy [${chosenProxy.name}] đã bị đánh dấu hết hạn! Vui lòng chọn proxy khác còn hoạt động hoặc "Không dùng Proxy".`, 'Proxy Hết Hạn', 'error');
      return;
    }

    const sId = parseInt(serverId, 10);
    const payload = {
      id: account?.id || undefined,
      fileId,
      proxyId: proxyId || null,
      username: username.trim(),
      password,
      serverId: sId,
      serverName: sId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ',
      note: note.trim()
    };

    try {
      const data = await window.ApiClient.saveAccount(payload);
      if (data.success) {
        onSaved(fileId);
      } else {
        notifyAlert(data.message || 'Lỗi lưu tài khoản', 'Lỗi Lưu Tài Khoản', 'error');
      }
    } catch (err) {
      notifyAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  return (
    <div className="modal-overlay">
      <div className="modal-card modal-card-md">
        <div className="modal-header">
          <h3>{isEditing ? `✏️ Chỉnh Sửa Tài Khoản: ${account.username}` : '➕ Thêm Tài Khoản Avatar Mới'}</h3>
          <button className="btn-close" onClick={onClose}>&times;</button>
        </div>
        <form onSubmit={handleSubmit}>
          <div className="modal-body">
            {/* Expired Proxy Warning at top below header / above File Profile */}
            {(() => {
              const currentSelectedProxy = proxies.find(p => p.id === proxyId);
              if (!currentSelectedProxy || !currentSelectedProxy.isExpired) return null;
              return (
                <div className="proxy-expired-alert account-modal-alert">
                  <span className="alert-icon">⚠️</span>
                  <div className="alert-text">
                    <strong>CẢNH BÁO: PROXY CỦA TÀI KHOẢN NÀY ĐÃ HẾT HẠN!</strong>
                    Proxy <b>{currentSelectedProxy.name}</b> ({currentSelectedProxy.host}:{currentSelectedProxy.port}) đã bị đánh dấu hết hạn / lỗi xác thực. Vui lòng chuyển sang proxy khác hoặc chọn <em>"Không dùng Proxy"</em>.
                  </div>
                </div>
              );
            })()}

            <div className="form-group">
              <label>📁 Thuộc File / Profile (Mỗi file tối đa 6 nick):</label>
              <CustomSelect
                value={fileId}
                onChange={setFileId}
                options={fileOptions}
                placeholder="Chọn File / Profile..."
              />
            </div>

            <div className="form-row">
              <div className="form-group">
                <label>Tên tài khoản (Username):</label>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Nhập nick avatar"
                  value={username}
                  onChange={e => setUsername(e.target.value)}
                  required
                />
              </div>
              <div className="form-group">
                <label>Mật khẩu (Password):</label>
                <input
                  type="password"
                  className="form-control"
                  placeholder={isEditing ? '(Giữ nguyên nếu không đổi)' : 'Nhập mật khẩu'}
                  value={password}
                  onChange={e => setPassword(e.target.value)}
                />
              </div>
            </div>

            <div className="form-row">
              <div className="form-group">
                <label title="Server Game (Tối đa 3 nick/server)">🌐 Server Game (Tối đa 3 nick/server):</label>
                <CustomSelect
                  value={serverId}
                  onChange={setServerId}
                  options={serverOptions}
                  placeholder="Chọn Server..."
                />
              </div>

              <div className="form-group">
                <label title="Gán Proxy Kết Nối (Tối đa 6 online/proxy)">🔒 Gán Proxy Kết Nối (Tối đa 6 online/proxy):</label>
                <CustomSelect
                  value={proxyId}
                  onChange={setProxyId}
                  options={proxyOptions}
                  placeholder="Không dùng Proxy (IP Server)"
                />
              </div>
            </div>

            <div className="form-group">
              <label>Ghi chú:</label>
              <input
                type="text"
                className="form-control"
                placeholder="VD: Nick câu cá farm chính"
                value={note}
                onChange={e => setNote(e.target.value)}
              />
            </div>
          </div>
          <div className="modal-footer">
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy Bỏ</button>
            <button type="submit" className="btn btn-primary">Lưu Tài Khoản</button>
          </div>
        </form>
      </div>
    </div>
  );
};
