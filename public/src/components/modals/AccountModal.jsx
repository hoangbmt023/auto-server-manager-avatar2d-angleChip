/**
 * AccountModal Component (Presentation Layer / Modals)
 * Porsche & Apple Precision Add/Edit Account Form with ModalBase & Vector Icons
 */
const { useState: useAccModalState, useRef: useAccModalRef, useEffect: useAccModalEffect } = React;

/**
 * Reusable CustomSelect dropdown component (CSS-based, overflow-safe, luxury glass theme)
 */
function CustomSelect({
  value,
  onChange,
  options = [],
  placeholder = 'Chọn một tùy chọn...'
}) {
  const [isOpen, setIsOpen] = useAccModalState(false);
  const [dropUp, setDropUp] = useAccModalState(false);
  const wrapperRef = useAccModalRef(null);

  const handleToggle = () => {
    if (!isOpen && wrapperRef.current) {
      const rect = wrapperRef.current.getBoundingClientRect();
      const modalBody = wrapperRef.current.closest('.modal-body') || wrapperRef.current.closest('.modal-card');
      if (modalBody) {
        const bodyRect = modalBody.getBoundingClientRect();
        const spaceBelow = bodyRect.bottom - rect.bottom;
        setDropUp(spaceBelow < 210);
      } else {
        const spaceBelow = window.innerHeight - rect.bottom;
        setDropUp(spaceBelow < 210);
      }
    }
    setIsOpen(!isOpen);
  };

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
        onClick={handleToggle}
        tabIndex="0"
        onKeyDown={(e) => {
          if (e.key === 'Enter' || e.key === ' ') {
            e.preventDefault();
            handleToggle();
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
                <span className="select-badge-expired">HẾT HẠN</span>
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
        <div className="custom-select-arrow">
          <window.Icon name="chevronDown" size={13} color="var(--text-tertiary)" />
        </div>
      </div>

      {isOpen && (
        <div className={`custom-select-menu ${dropUp ? 'drop-up' : 'drop-down'}`}>
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
                    <span className="select-badge-expired">HẾT HẠN</span>
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
  defaultIpSlot = 1,
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
  const [ipSlot, setIpSlot] = useAccModalState(account?.ipSlot !== undefined ? String(account.ipSlot) : String(defaultIpSlot || 1));

  const selectedFile = files.find(f => f.id === fileId) || files.find(f => f.id === activeFileId);
  const totalIps = selectedFile ? Math.max(1, Math.ceil((selectedFile.maxAccounts || 6) / 6)) : 1;
  const ipOptions = [];
  for (let i = 1; i <= totalIps; i++) {
    const slotStats = selectedFile?.ipSlots?.find(s => s.slot === i);
    ipOptions.push({
      value: String(i),
      label: `Tab IP ${i}`,
      sub: slotStats ? `HM: ${slotStats.hmCount}/3 • DK: ${slotStats.dkCount}/3 (${slotStats.total}/6 nick)` : 'Tối đa 6 nick'
    });
  }

  const fileOptions = files.map(f => ({
    value: f.id,
    label: f.name,
    badge: `${f.totalAccounts || 0}/${f.maxAccounts || 6} nick (${f.totalIps || Math.max(1, Math.ceil((f.maxAccounts || 6)/6))} IP)`
  }));

  const serverOptions = [
    { value: '0', label: 'Server 1: Hoàn Mỹ', sub: 'Tối đa 3 nick/server mỗi IP' },
    { value: '1', label: 'Server 2: Diệu Kỳ', sub: 'Tối đa 3 nick/server mỗi IP' }
  ];

  const proxyOptions = [
    {
      value: '',
      label: 'Tab IP Mặc định (Direct IP VPS)',
      sub: 'Dùng trực tiếp IP VPS • Tối đa 3 HM + 3 DK trên toàn hệ thống',
      badge: 'IP Server'
    },
    ...proxies.map(p => ({
      value: p.id,
      label: `Tab Proxy: ${p.name}`,
      sub: `${(p.type || 'SOCKS').toUpperCase()} • ${p.host}:${p.port} (Tối đa 3 HM + 3 DK)`,
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
      ipSlot: parseInt(ipSlot, 10) || 1,
      note: note.trim()
    };

    try {
      const data = await window.ApiClient.saveAccount(payload);
      if (data.success) {
        notifyAlert(data.message || (isEditing ? 'Đã cập nhật thông tin tài khoản thành công!' : 'Đã thêm tài khoản mới thành công!'), 'Thành Công', 'success');
        onSaved(fileId);
      } else {
        notifyAlert(data.message || 'Lỗi lưu tài khoản', 'Lỗi Lưu Tài Khoản', 'error');
      }
    } catch (err) {
      notifyAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  return (
    <window.ModalBase
      title={isEditing ? `Chỉnh Sửa: ${account.username}` : 'Thêm Tài Khoản Mới'}
      subtitle="Gán File hồ sơ, Server và Proxy mạng"
      icon={isEditing ? 'edit' : 'plus'}
      iconColor="var(--apple-blue)"
      size="md"
      onClose={onClose}
      footer={
        <>
          <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy Bỏ</button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit}>
            <window.Icon name="check" size={14} /> Lưu Tài Khoản
          </button>
        </>
      }
    >
      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '18px' }}>
        {/* Expired Proxy Warning */}
        {(() => {
          const currentSelectedProxy = proxies.find(p => p.id === proxyId);
          if (!currentSelectedProxy || !currentSelectedProxy.isExpired) return null;
          return (
            <div className="alert-banner alert-banner-danger alert-banner-compact">
              <div className="alert-banner-icon-wrap">
                <window.Icon name="shield" size={16} color="var(--apple-red)" />
              </div>
              <div className="alert-banner-content">
                <p style={{ margin: 0, fontSize: '0.82rem' }}>
                  <strong style={{ color: 'var(--apple-red)' }}>Proxy đã hết hạn:</strong> Proxy <b>{currentSelectedProxy.name}</b> đã bị lỗi xác thực. Vui lòng đổi sang proxy khác.
                </p>
              </div>
            </div>
          );
        })()}

        <div className="form-row">
          <div className="form-group">
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="folder" size={14} color="var(--apple-blue)" />
              <span>Thuộc File / Profile:</span>
            </label>
            <CustomSelect
              value={fileId}
              onChange={setFileId}
              options={fileOptions}
              placeholder="Chọn File / Profile..."
            />
          </div>

          <div className="form-group">
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="globe" size={14} color="var(--apple-purple)" />
              <span>Tab IP / Proxy Mạng (Tối đa 6 nick/IP):</span>
            </label>
            <CustomSelect
              value={proxyId}
              onChange={setProxyId}
              options={proxyOptions}
              placeholder="Chọn Tab IP / Proxy..."
            />
          </div>
        </div>

        <div className="form-row">
          <div className="form-group">
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="user" size={14} color="var(--apple-blue)" />
              <span>Tên tài khoản (Username):</span>
            </label>
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
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="shield" size={14} color="var(--apple-blue)" />
              <span>Mật khẩu (Password):</span>
            </label>
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
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="server" size={14} color="var(--apple-blue)" />
              <span>Server Game:</span>
            </label>
            <CustomSelect
              value={serverId}
              onChange={setServerId}
              options={serverOptions}
              placeholder="Chọn Server..."
            />
          </div>

          <div className="form-group">
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="edit" size={14} color="var(--apple-blue)" />
              <span>Ghi chú mô tả:</span>
            </label>
            <input
              type="text"
              className="form-control"
              placeholder="VD: Nick câu cá farm chính"
              value={note}
              onChange={e => setNote(e.target.value)}
            />
          </div>
        </div>

        <div className="form-group">
          <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
            <window.Icon name="edit" size={14} color="var(--apple-blue)" />
            <span>Ghi chú:</span>
          </label>
          <input
            type="text"
            className="form-control"
            placeholder="VD: Nick câu cá farm chính"
            value={note}
            onChange={e => setNote(e.target.value)}
          />
        </div>
      </form>
    </window.ModalBase>
  );
};
