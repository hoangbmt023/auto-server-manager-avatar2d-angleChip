/**
 * ProxyModal, ProxyFormModal & ProxySystemConfigModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Proxy Manager
 * Realtime Health Check, Expiration Flags, Status Filtering & Smart Proxy.vn Auto Allocation.
 * ZERO Inline Styles - 100% Modals CSS Semantic Classes & Full Mobile Responsive.
 */
const { useState: useProxyModalState, useEffect: useProxyModalEffect, useCallback: useProxyModalCallback, useRef: useProxyModalRef } = React;

/**
 * Custom Dropdown Select for Proxy Packages with Lucide Vector Icons and Group Indentation
 */
function ProxyCategorySelect({ value, onChange }) {
  const [isOpen, setIsOpen] = useProxyModalState(false);
  const [dropUp, setDropUp] = useProxyModalState(false);
  const wrapperRef = useProxyModalRef(null);

  const categories = [
    {
      group: 'Datacenter Việt Nam (Tối ưu Game)',
      items: [
        { value: 'DatacenterC', label: 'DatacenterC', desc: 'Share 3 (Tiết kiệm nhất)' },
        { value: 'DatacenterB', label: 'DatacenterB', desc: 'Share 1 (Độc lập 1 người)' },
        { value: 'DatacenterA', label: 'DatacenterA', desc: 'Dùng riêng Private' }
      ]
    },
    {
      group: 'Dân cư Tĩnh Việt Nam (Share 3 IP Nhà Mạng)',
      items: [
        { value: 'FPT', label: 'FPT', desc: 'Dân cư tĩnh FPT Share 3' },
        { value: 'Viettel', label: 'Viettel', desc: 'Dân cư tĩnh Viettel Share 3' },
        { value: 'VNPT', label: 'VNPT', desc: 'Dân cư tĩnh VNPT Share 3' }
      ]
    },
    {
      group: 'Dân cư Tĩnh Dùng Riêng (100% Private)',
      items: [
        { value: 'PRIVATE', label: 'PRIVATE', desc: 'Dân cư tĩnh dùng riêng 100%' }
      ]
    },
    {
      group: 'Proxy Quốc Tế',
      items: [
        { value: 'US', label: 'US', desc: 'Datacenter Mỹ (Giá tốt nhất)' }
      ]
    }
  ];

  // Tìm item đang được chọn
  let currentItem = null;
  for (const g of categories) {
    const found = g.items.find(it => it.value === value);
    if (found) { currentItem = found; break; }
  }

  const handleToggle = () => {
    if (!isOpen && wrapperRef.current) {
      const rect = wrapperRef.current.getBoundingClientRect();
      const modalBody = wrapperRef.current.closest('.modal-body') || wrapperRef.current.closest('.modal-card');
      
      let spaceBelow = window.innerHeight - rect.bottom;
      let spaceAbove = rect.top;
      
      if (modalBody) {
        const bodyRect = modalBody.getBoundingClientRect();
        spaceBelow = bodyRect.bottom - rect.bottom;
        spaceAbove = rect.top - bodyRect.top;
      }
      
      // Nếu phía dưới không đủ chiều cao hiển thị menu (< 240px) và phía trên thoáng hơn thì đổ lên
      setDropUp(spaceBelow < 240 && spaceAbove > spaceBelow);
    }
    setIsOpen(!isOpen);
  };

  useProxyModalEffect(() => {
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

  return (
    <div
      className={`custom-select-wrapper ${isOpen ? 'is-open' : ''}`}
      ref={wrapperRef}
      style={{ zIndex: isOpen ? 1000 : undefined }}
    >
      <div
        className={`custom-select-control ${isOpen ? 'open' : ''}`}
        onClick={handleToggle}
        tabIndex="0"
      >
        <div className="custom-select-value">
          {currentItem ? (
            <span className="select-item-title">
              <span>{currentItem.label} - {currentItem.desc}</span>
            </span>
          ) : (
            <span className="select-placeholder">Chọn gói proxy...</span>
          )}
        </div>
        <div className="custom-select-arrow">
          <window.Icon name="chevronDown" size={13} color="var(--text-tertiary)" />
        </div>
      </div>

      {isOpen && (
        <div className={`custom-select-menu ${dropUp ? 'drop-up' : 'drop-down'}`}>
          {categories.map((grp, gIdx) => (
            <React.Fragment key={gIdx}>
              <div className="custom-select-group-header">
                <span>{grp.group}</span>
              </div>
              {grp.items.map(it => (
                <div
                  key={it.value}
                  className={`custom-select-item is-child ${it.value === value ? 'selected' : ''}`}
                  onClick={(e) => {
                    e.stopPropagation();
                    onChange(it.value);
                    setIsOpen(false);
                  }}
                >
                  <div className="select-item-main">
                    <span className="select-item-title">{it.label}</span>
                  </div>
                  <div className="select-item-sub">
                    {it.desc}
                  </div>
                </div>
              ))}
            </React.Fragment>
          ))}
        </div>
      )}
    </div>
  );
}

/**
 * Standalone popup box modal for Configuring Proxy.vn System Automation
 */
function ProxySystemConfigModal({
  config,
  onClose,
  onSaved
}) {
  const [proxyVnEnabled, setProxyVnEnabled] = useProxyModalState(Boolean(config?.proxyVnEnabled));
  const [apiKey, setApiKey] = useProxyModalState('');
  const [isChangingKey, setIsChangingKey] = useProxyModalState(!config?.hasApiKey);
  const [defaultCategory, setDefaultCategory] = useProxyModalState(config?.defaultCategory || 'DatacenterA');
  const [defaultType, setDefaultType] = useProxyModalState(config?.defaultType || 'SOCKS5');
  const [defaultPeriod, setDefaultPeriod] = useProxyModalState(config?.defaultPeriod ? String(config.defaultPeriod) : '30');
  const [loading, setLoading] = useProxyModalState(false);

  const handleSubmit = async (e) => {
    if (e) e.preventDefault();
    setLoading(true);

    try {
      if (window.ApiClient && typeof window.ApiClient.saveProxySystemConfig === 'function') {
        const payload = {
          proxyVnEnabled,
          defaultCategory,
          defaultType,
          defaultPeriod: parseInt(defaultPeriod, 10) || 30,
          emergencySlotEnabled: false
        };
        // Chỉ gửi apiKey nếu người dùng nhập mới
        if (isChangingKey && apiKey.trim()) {
          payload.apiKey = apiKey.trim();
        }

        const res = await window.ApiClient.saveProxySystemConfig(payload);
        if (res && res.success) {
          if (onSaved) onSaved();
          if (onClose) onClose();
        } else {
          const notify = window.showAlert || alert;
          notify(res?.message || 'Không thể lưu cấu hình hệ thống!', 'Lỗi Cấu Hình', 'error');
        }
      }
    } catch (err) {
      const notify = window.showAlert || alert;
      notify(err.message || 'Lỗi khi lưu cấu hình Proxy hệ thống!', 'Lỗi Hệ Thống', 'error');
    } finally {
      setLoading(false);
    }
  };

  return (
    <window.ModalBase
      title="Cấu Hình Hệ Thống Điều Phối & Proxy.vn"
      subtitle="Thiết lập cơ chế tự động mua, xoay vòng IP và slot khẩn cấp"
      icon="cpu"
      iconColor="var(--apple-blue)"
      size="md"
      zIndex={10020}
      onClose={onClose}
      footer={
        <div className="proxy-form-footer-actions">
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Hủy Bỏ
          </button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit} disabled={loading}>
            <window.Icon name="check" size={14} />
            {loading ? 'Đang lưu...' : 'Lưu Cấu Hình'}
          </button>
        </div>
      }
    >

      <form onSubmit={handleSubmit} className="proxy-form-stack">
        {/* Section 1: Kích Hoạt Tự Động Hóa */}
        <div className="proxy-config-card-sec">
          <div className="proxy-config-card-header">
            <window.Icon name="zap" size={16} color="var(--apple-blue)" />
            <span>Cơ Chế Tự Động Hóa (Auto-Provisioning)</span>
          </div>
          <div className="checkbox-group">
            <input
              type="checkbox"
              id="cfgProxyVnEnabled"
              checked={proxyVnEnabled}
              onChange={(e) => setProxyVnEnabled(e.target.checked)}
            />
            <label htmlFor="cfgProxyVnEnabled">
              <strong>Bật Tự Động Mua Proxy Khi Hết Slot</strong>
            </label>
          </div>
          <p className="proxy-config-desc">
            Khi tất cả Proxy trong hệ thống đã đầy kín (6/6 bot), hệ thống tự động gọi API Proxy.vn mua thêm Proxy mới 30 ngày cho nick vừa thuê.
          </p>
        </div>

        {/* Section 2: Tài Khoản & API Key */}
        <div className="proxy-config-card-sec">
          <div className="proxy-config-card-header">
            <window.Icon name="key" size={16} color="var(--apple-orange)" />
            <span>Tài Khoản & API Key Proxy.vn</span>
          </div>

          {config?.hasApiKey && !isChangingKey ? (
            <div className="proxy-key-status-row">
              <div className="proxy-key-status-badge is-connected">
                <window.Icon name="check-circle" size={15} color="var(--apple-green)" />
                <span>Đã kết nối API Key Proxy.vn</span>
              </div>
              <button
                type="button"
                className="btn btn-secondary btn-sm proxy-change-key-btn"
                onClick={() => setIsChangingKey(true)}
              >
                <window.Icon name="edit" size={12} /> Đổi Key Mới
              </button>
            </div>
          ) : (
            <div className="form-group">
              <label>API Key Proxy.vn:</label>
              <div className="form-row">
                <input
                  type="text"
                  className="form-control"
                  placeholder="Dán API Key lấy từ https://proxy.vn/?home=apiv2"
                  value={apiKey}
                  onChange={(e) => setApiKey(e.target.value)}
                  autoFocus={isChangingKey}
                />
                {config?.hasApiKey && (
                  <button
                    type="button"
                    className="btn btn-secondary btn-sm"
                    onClick={() => {
                      setIsChangingKey(false);
                      setApiKey('');
                    }}
                  >
                    Hủy
                  </button>
                )}
              </div>
              <span className="form-helper-text">
                Khóa bí mật kết nối với tài khoản trên nền tảng <code>https://proxy.vn</code>.
              </span>
            </div>
          )}
        </div>

        {/* Section 3: Quy Chuẩn Gói & Slot Mở Rộng */}
        <div className="proxy-config-card-sec">
          <div className="proxy-config-card-header">
            <window.Icon name="server" size={16} color="var(--apple-purple)" />
            <span>Quy Chuẩn Gói Proxy & Phân Bổ</span>
          </div>

          <div className="form-row">
            <div className="form-group">
              <label>Gói Proxy Mặc Định (Category):</label>
              <ProxyCategorySelect
                value={defaultCategory}
                onChange={(val) => setDefaultCategory(val)}
              />
            </div>

            <div className="form-group">
              <label>Giao Thức Mạng Mặc Định:</label>
              <select
                className="form-control"
                value={defaultType}
                onChange={(e) => setDefaultType(e.target.value)}
              >
                <option value="SOCKS5">SOCKS5 (Tối ưu cho Game Bot)</option>
                <option value="HTTP">HTTP / HTTPS</option>
              </select>
            </div>
          </div>

          <div className="form-row">
            <div className="form-group">
              <label>Thời Hạn Mua Tự Động (Ngày):</label>
              <div className="proxy-period-input-wrap">
                <input
                  type="number"
                  className="form-control"
                  min="1"
                  max="365"
                  value={defaultPeriod}
                  onChange={(e) => setDefaultPeriod(e.target.value)}
                  placeholder="30"
                />
                <span className="proxy-period-unit">ngày</span>
              </div>
            </div>

            <div className="form-group">
              <label>
                <window.Icon name="wallet" size={13} color="var(--apple-pink)" /> Số Tiền Thanh Toán (Proxy.vn):
              </label>
              {(() => {
                const daysNum = Math.max(1, parseInt(defaultPeriod, 10) || 30);
                let unitPrice = 0;

                if (defaultCategory === 'DatacenterC') {
                  unitPrice = 800;
                  if (daysNum >= 5) unitPrice = 640;
                  if (daysNum >= 10) unitPrice = 480;
                  if (daysNum >= 20) unitPrice = 400;
                  if (daysNum >= 30) unitPrice = 320;
                } else if (defaultCategory === 'DatacenterB') {
                  unitPrice = 800;
                  if (daysNum >= 5) unitPrice = 720;
                  if (daysNum >= 10) unitPrice = 640;
                  if (daysNum >= 20) unitPrice = 560;
                  if (daysNum >= 30) unitPrice = 480;
                  if (daysNum >= 45) unitPrice = 440;
                  if (daysNum >= 60) unitPrice = 400;
                  if (daysNum >= 90) unitPrice = 360;
                  if (daysNum >= 120) unitPrice = 320;
                } else if (defaultCategory === 'DatacenterA') {
                  unitPrice = 2800;
                  if (daysNum >= 5) unitPrice = 2560;
                  if (daysNum >= 15) unitPrice = 2400;
                  if (daysNum >= 30) unitPrice = 1600;
                  if (daysNum >= 90) unitPrice = 1440;
                  if (daysNum >= 120) unitPrice = 1360;
                } else if (defaultCategory === 'Viettel' || defaultCategory === 'FPT' || defaultCategory === 'VNPT') {
                  unitPrice = 800;
                  if (daysNum >= 5) unitPrice = 720;
                  if (daysNum >= 10) unitPrice = 640;
                  if (daysNum >= 20) unitPrice = 560;
                  if (daysNum >= 30) unitPrice = 480;
                  if (daysNum >= 45) unitPrice = 440;
                  if (daysNum >= 60) unitPrice = 400;
                  if (daysNum >= 90) unitPrice = 360;
                  if (daysNum >= 120) unitPrice = 320;
                } else if (defaultCategory === 'PRIVATE') {
                  unitPrice = 2600;
                } else if (defaultCategory === 'US') {
                  unitPrice = 480;
                  if (daysNum >= 5) unitPrice = 400;
                  if (daysNum >= 10) unitPrice = 320;
                  if (daysNum >= 20) unitPrice = 240;
                  if (daysNum >= 30) unitPrice = 160;
                } else {
                  unitPrice = 500;
                }

                const totalCost = daysNum * unitPrice;
                const fmtTotal = (typeof window.formatMoney === 'function')
                  ? window.formatMoney(totalCost)
                  : totalCost.toLocaleString('vi-VN');
                const fmtUnit = (typeof window.formatMoney === 'function')
                  ? window.formatMoney(unitPrice)
                  : unitPrice.toLocaleString('vi-VN');

                return (
                  <div className="proxy-cost-estimate-tag">
                    <span className="proxy-cost-amount">{fmtTotal} đ</span>
                    <span className="proxy-cost-sub">({fmtUnit} đ/ngày)</span>
                  </div>
                );
              })()}
            </div>
          </div>
          <span className="form-helper-text">
            Số tiền trên sẽ được tự động thanh toán qua số dư tài khoản Proxy.vn khi kích hoạt mua mới hoặc gia hạn.
          </span>
        </div>
      </form>
    </window.ModalBase>
  );
}

/**
 * Standalone popup box modal for Adding / Editing a Proxy
 */
function ProxyFormModal({
  proxy,
  onSaveProxy,
  onClose,
  onSaved
}) {
  const isEditing = Boolean(proxy);
  const [name, setName] = useProxyModalState(proxy?.name || '');
  const [type, setType] = useProxyModalState(proxy?.type || 'socks');
  const [host, setHost] = useProxyModalState(proxy?.host || '');
  const [port, setPort] = useProxyModalState(proxy?.port ? String(proxy.port) : '');
  const [username, setUsername] = useProxyModalState(proxy?.username || '');
  const [password, setPassword] = useProxyModalState(proxy?.password || '');
  const [showPassword, setShowPassword] = useProxyModalState(false);
  const [fieldErrors, setFieldErrors] = useProxyModalState({});
  const [loading, setLoading] = useProxyModalState(false);

  const clearFieldError = (f) => {
    setFieldErrors(prev => {
      if (!prev || !prev[f]) return prev;
      const next = { ...prev };
      delete next[f];
      return next;
    });
  };

  const handleSubmit = async (e) => {
    if (e) e.preventDefault();

    const feErrors = {};
    if (!host.trim()) {
      feErrors.host = 'Địa chỉ IP / Host của Proxy không được để trống!';
    }
    const pNum = parseInt(port, 10);
    if (!port || isNaN(pNum) || pNum < 1 || pNum > 65535) {
      feErrors.port = `Cổng Port [${port || ''}] không hợp lệ (1 - 65535)!`;
    }

    if (Object.keys(feErrors).length > 0) {
      setFieldErrors(feErrors);
      return;
    }

    setFieldErrors({});
    setLoading(true);
    try {
      const res = await onSaveProxy({
        id: proxy ? proxy.id : undefined,
        name: name.trim() || `${type.toUpperCase()} (${host.trim()}:${pNum})`,
        type,
        host: host.trim(),
        port: pNum,
        username: username.trim(),
        password: password.trim()
      });

      if (res && res.success) {
        if (onSaved) onSaved();
        if (onClose) onClose();
      } else if (res && res.errors && typeof res.errors === 'object') {
        setFieldErrors(res.errors);
      } else if (res && res.message) {
        const notify = window.showAlert || alert;
        notify(res.message, 'Lỗi Lưu Proxy', 'error');
      }
    } catch (err) {
      const notify = window.showAlert || alert;
      notify(err.message || 'Lỗi khi lưu proxy!', 'Lỗi Hệ Thống', 'error');
    } finally {
      setLoading(false);
    }
  };

  return (
    <window.ModalBase
      title={isEditing ? `Sửa Proxy: ${proxy.name}` : 'Thêm Proxy Mới'}
      subtitle="Cấu hình IP, Port, giao thức SOCKS5/HTTP và tài khoản"
      icon="globe"
      iconColor="var(--apple-blue)"
      size="md"
      zIndex={10010}
      onClose={onClose}
      footer={
        <div className="proxy-form-footer-actions">
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Hủy Bỏ
          </button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit} disabled={loading}>
            <window.Icon name="check" size={14} />
            {loading ? 'Đang lưu...' : (isEditing ? 'Cập Nhật Proxy' : 'Lưu Proxy')}
          </button>
        </div>
      }
    >

      <form onSubmit={handleSubmit} className="proxy-form-stack">
        <div className="form-group">
          <label>Tên gợi nhớ Proxy:</label>
          <input
            type="text"
            className={`form-control ${fieldErrors.name ? 'input-error' : ''}`}
            placeholder="VD: Proxy SOCKS5 VN 1, Proxy Xoay..."
            value={name}
            onChange={(e) => {
              setName(e.target.value);
              clearFieldError('name');
            }}
            autoFocus
          />
          {fieldErrors.name && (
            <div className="field-error-msg">
              <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
              <span>{fieldErrors.name}</span>
            </div>
          )}
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Giao thức (Type):</label>
            <select
              className={`form-control ${fieldErrors.type ? 'input-error' : ''}`}
              value={type}
              onChange={(e) => {
                setType(e.target.value);
                clearFieldError('type');
              }}
            >
              <option value="socks">SOCKS5 / SOCKS4</option>
              <option value="http">HTTP / HTTPS</option>
            </select>
            {fieldErrors.type && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.type}</span>
              </div>
            )}
          </div>

          <div className="form-group">
            <label>Cổng Port <span className="proxy-field-required">*</span>:</label>
            <input
              type="number"
              className={`form-control ${fieldErrors.port ? 'input-error' : ''}`}
              placeholder="VD: 1080, 52686"
              value={port}
              onChange={(e) => {
                setPort(e.target.value);
                clearFieldError('port');
              }}
              min="1"
              max="65535"
            />
            {fieldErrors.port && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.port}</span>
              </div>
            )}
          </div>
        </div>

        <div className="form-group">
          <label>Host / IP <span className="proxy-field-required">*</span>:</label>
          <input
            type="text"
            className={`form-control ${fieldErrors.host ? 'input-error' : ''}`}
            placeholder="VD: 171.241.76.244 hoặc vn.proxy.com"
            value={host}
            onChange={(e) => {
              setHost(e.target.value);
              clearFieldError('host');
            }}
          />
          {fieldErrors.host && (
            <div className="field-error-msg">
              <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
              <span>{fieldErrors.host}</span>
            </div>
          )}
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Tài khoản (Username):</label>
            <input
              type="text"
              className={`form-control ${fieldErrors.username ? 'input-error' : ''}`}
              placeholder="Bỏ trống nếu không có"
              value={username}
              onChange={(e) => {
                setUsername(e.target.value);
                clearFieldError('username');
              }}
            />
            {fieldErrors.username && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.username}</span>
              </div>
            )}
          </div>

          <div className="form-group">
            <label>Mật khẩu (Password):</label>
            <div style={{ position: 'relative', display: 'flex', alignItems: 'center' }}>
              <input
                type={showPassword ? 'text' : 'password'}
                className={`form-control ${fieldErrors.password ? 'input-error' : ''}`}
                style={{ paddingRight: '38px' }}
                placeholder="Bỏ trống nếu không có"
                value={password}
                onChange={(e) => {
                  setPassword(e.target.value);
                  clearFieldError('password');
                }}
              />
              <button
                type="button"
                onClick={() => setShowPassword(!showPassword)}
                style={{
                  position: 'absolute',
                  right: '8px',
                  top: '50%',
                  transform: 'translateY(-50%)',
                  background: 'transparent',
                  border: 'none',
                  color: showPassword ? 'var(--apple-blue)' : 'var(--text-tertiary)',
                  cursor: 'pointer',
                  padding: '4px',
                  display: 'flex',
                  alignItems: 'center',
                  justifyContent: 'center',
                  outline: 'none'
                }}
                title={showPassword ? 'Ẩn mật khẩu' : 'Hiện mật khẩu'}
                tabIndex={-1}
              >
                <window.Icon name={showPassword ? 'eye-off' : 'eye'} size={16} />
              </button>
            </div>
            {fieldErrors.password && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.password}</span>
              </div>
            )}
          </div>
        </div>
      </form>
    </window.ModalBase>
  );
}

/**
 * Main Proxy List Manager Modal
 */
window.ProxyModal = function ProxyModal({
  onClose,
  proxies: initialProxies = [],
  onSaveProxy,
  onDeleteProxy,
  initialFilter = 'all',
  onRefreshProxies
}) {
  const [filter, setFilter] = useProxyModalState(initialFilter || 'all');
  const [localProxies, setLocalProxies] = useProxyModalState(initialProxies);
  const [editingProxy, setEditingProxy] = useProxyModalState(null);
  const [showFormModal, setShowFormModal] = useProxyModalState(false);
  const [showSystemConfigModal, setShowSystemConfigModal] = useProxyModalState(false);

  const [testingId, setTestingId] = useProxyModalState(null);
  const [testingAll, setTestingAll] = useProxyModalState(false);
  const [rotatingId, setRotatingId] = useProxyModalState(null);
  const [testNotice, setTestNotice] = useProxyModalState(null);
  const [systemConfig, setSystemConfig] = useProxyModalState(null);

  // Sync prop proxies to local state
  useProxyModalEffect(() => {
    setLocalProxies(initialProxies);
  }, [initialProxies]);

  // Load Proxy System Configuration
  const loadSystemConfig = useProxyModalCallback(async () => {
    try {
      if (window.ApiClient && typeof window.ApiClient.getProxySystemConfig === 'function') {
        const res = await window.ApiClient.getProxySystemConfig();
        if (res && res.success) {
          setSystemConfig(res.data);
        }
      }
    } catch (e) {}
  }, []);

  useProxyModalEffect(() => {
    loadSystemConfig();
  }, [loadSystemConfig]);

  useProxyModalEffect(() => {
    if (initialFilter) {
      setFilter(initialFilter);
    }
  }, [initialFilter]);

  const activeCount = localProxies.filter(p => !p.isExpired).length;
  const expiredCount = localProxies.filter(p => p.isExpired).length;

  const filteredProxies = localProxies.filter(p => {
    if (filter === 'active') return !p.isExpired;
    if (filter === 'expired') return Boolean(p.isExpired);
    return true;
  });

  const openCreateForm = () => {
    setEditingProxy(null);
    setShowFormModal(true);
  };

  const openEditForm = (p) => {
    setEditingProxy(p);
    setShowFormModal(true);
  };

  const handleDelete = async (id, proxyName) => {
    const doDelete = async () => {
      try {
        await onDeleteProxy(id, proxyName);
        if (typeof onRefreshProxies === 'function') {
          onRefreshProxies();
        }
      } catch (err) {
        if (window.showAlert) window.showAlert(err.message || 'Lỗi khi xóa proxy!', 'Lỗi Xóa Proxy', 'error');
        else alert(err.message || 'Lỗi khi xóa proxy!');
      }
    };

    if (window.showConfirm) {
      window.showConfirm(`Bạn có chắc muốn xóa Proxy [${proxyName || id}]?`, doDelete);
    } else {
      if (window.confirm(`Bạn có chắc muốn xóa Proxy [${proxyName || id}]?`)) doDelete();
    }
  };

  const handleTestProxy = async (id, pName) => {
    setTestingId(id);
    setTestNotice(null);
    try {
      const res = await window.ApiClient.testProxy(id);
      if (res.success && !res.isExpired) {
        setTestNotice({
          type: 'success',
          text: `Proxy [${pName}]: Hoạt động tốt (${res.latencyMs || 0}ms)`
        });
        setLocalProxies(prev => prev.map(p => p.id === id ? { ...p, isExpired: false, latencyMs: res.latencyMs } : p));
      } else {
        setTestNotice({
          type: 'error',
          text: `Proxy [${pName}]: ${res.message || 'Không thể kết nối / Hết hạn'}`
        });
        setLocalProxies(prev => prev.map(p => p.id === id ? { ...p, isExpired: true, latencyMs: null, errorReason: res.message } : p));
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `Lỗi kiểm tra [${pName}]: ${err.message}` });
      // Nếu timeout hoặc lỗi mạng, proxy không phản hồi -> đánh dấu lỗi ngay lập tức
      setLocalProxies(prev => prev.map(p => p.id === id ? { ...p, isExpired: true, latencyMs: null, errorReason: err.message } : p));
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } finally {
      setTestingId(null);
    }
  };

  const handleRotateProxy = async (id, pName) => {
    setRotatingId(id);
    setTestNotice(null);
    try {
      if (window.ApiClient && typeof window.ApiClient.rotateProxy === 'function') {
        const res = await window.ApiClient.rotateProxy(id);
        if (res && res.success) {
          setTestNotice({
            type: 'success',
            text: `Proxy [${pName}]: ${res.message || 'Đổi địa chỉ IP mới thành công!'}`
          });
        } else {
          setTestNotice({
            type: 'error',
            text: `Proxy [${pName}]: ${res.message || 'Không thể xoay IP Proxy!'}`
          });
        }
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `Lỗi xoay IP: ${err.message}` });
    } finally {
      setRotatingId(null);
    }
  };

  const handleTestAll = async () => {
    setTestingAll(true);
    setTestNotice({ type: 'info', text: 'Đang kiểm tra toàn bộ danh sách proxy (song song)...' });
    try {
      const res = await window.ApiClient.testAllProxies();
      if (res.success) {
        const deadCount = (res.results || []).filter(r => r.isExpired).length;
        const liveCount = res.results.length - deadCount;
        setTestNotice({
          type: deadCount > 0 ? 'error' : 'success',
          text: `Đã kiểm tra ${res.results.length} Proxy: ${liveCount} Hoạt động, ${deadCount} Hết hạn / Lỗi.`
        });
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `Lỗi kiểm tra tất cả: ${err.message}` });
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } finally {
      setTestingAll(false);
    }
  };

  return (
    <>
      <window.ModalBase
        title={`Quản Lý Danh Sách Proxy (${localProxies.length})`}
        subtitle="Hệ thống tự động điều phối Best-Fit, kiểm tra kết nối và xoay IP"
        icon="globe"
        iconColor="var(--apple-blue)"
        size="lg"
        onClose={onClose}
        footer={
          <div className="proxy-footer-row">
            <div className="proxy-capacity-tip">
              Tối đa 6 nick / Proxy mạng (Đúng chuẩn 3 Hoàn Mỹ + 3 Diệu Kỳ)
            </div>
            <button type="button" className="btn btn-secondary" onClick={onClose}>
              Đóng
            </button>
          </div>
        }
      >
        {/* Banner Quản Lý & Tự Động Hóa Proxy.vn */}
        <div className="proxy-system-banner">
          <div className="proxy-system-banner-left">
            <div className="proxy-system-icon-box">
              <window.Icon name="cpu" size={20} color="var(--apple-blue)" />
            </div>
            <div>
              <div className="proxy-system-banner-title">
                Hệ Thống Điều Phối & Tự Động Hóa Proxy.vn
              </div>
              <div className="proxy-system-strategy-text">
                Thuật toán: <strong>{systemConfig?.allocationStrategy || 'Best-Fit Waterfall 6/6'}</strong> · Gói: <strong>{systemConfig?.defaultCategory || 'DatacenterA'}</strong> · Giao thức: <strong>{systemConfig?.defaultType || 'SOCKS5'}</strong>
              </div>
            </div>
          </div>
          <div className="proxy-header-action-group">
            {systemConfig?.proxyVnEnabled ? (
              <span className="proxy-system-status-pill is-active">
                <span className="proxy-status-dot-live"></span>
                Proxy.vn: Tự Động Mua
              </span>
            ) : (
              <span className="proxy-system-status-pill is-inactive">
                <span className="proxy-status-dot-dead"></span>
                Proxy.vn: Thủ Công
              </span>
            )}
            <button
              type="button"
              className="btn btn-secondary btn-sm proxy-btn-config"
              onClick={() => setShowSystemConfigModal(true)}
              title="Cài đặt thông số Proxy.vn & Tự Động Hóa"
            >
              <window.Icon name="settings" size={13} /> Cấu Hình
            </button>
          </div>
        </div>

        {/* Test Notice Banner */}
        {testNotice && (
          <div className={`proxy-test-notice ${testNotice.type} proxy-test-notice-box`}>
            <window.Icon
              name={testNotice.type === 'success' ? 'check-circle' : (testNotice.type === 'error' ? 'alert-triangle' : 'zap')}
              size={16}
            />
            <span className="proxy-notice-text">{testNotice.text}</span>
            <button
              type="button"
              className="btn-notice-close proxy-notice-close-btn"
              onClick={() => setTestNotice(null)}
            >
              &times;
            </button>
          </div>
        )}

        <div className="proxy-content-container">
          {/* Action & Filter Bar */}
          <div className="proxy-toolbar-row">
            {/* Status Filter Tabs */}
            <div className="segmented-control proxy-filter-tabs">
              <button
                type="button"
                className={`btn btn-sm ${filter === 'all' ? 'active btn-primary' : ''}`}
                onClick={() => setFilter('all')}
              >
                Tất cả ({localProxies.length})
              </button>
              <button
                type="button"
                className={`btn btn-sm ${filter === 'active' ? 'active btn-primary' : ''} proxy-filter-btn`}
                onClick={() => setFilter('active')}
              >
                <span className="proxy-status-dot-live"></span>
                Sống ({activeCount})
              </button>
              <button
                type="button"
                className={`btn btn-sm ${filter === 'expired' ? 'active btn-danger' : ''} proxy-filter-btn`}
                onClick={() => setFilter('expired')}
              >
                <span className="proxy-status-dot-dead"></span>
                Lỗi ({expiredCount})
              </button>
            </div>

            <div className="proxy-header-action-group">
              <button
                type="button"
                className="btn btn-secondary btn-sm"
                onClick={handleTestAll}
                disabled={testingAll || localProxies.length === 0}
                title="Kiểm tra kết nối toàn bộ Proxy"
              >
                <window.Icon name="zap" size={14} color="var(--apple-orange)" />
                {testingAll ? 'Đang test...' : 'Test tất cả'}
              </button>
              <button
                type="button"
                className="btn btn-primary btn-sm"
                onClick={openCreateForm}
              >
                <window.Icon name="plus" size={14} /> Thêm Proxy
              </button>
            </div>
          </div>

          {/* List of Proxies */}
          {filteredProxies.length === 0 ? (
            <div className="proxy-empty-container">
              <div className="proxy-empty-icon-wrap">
                <window.Icon name="globe" size={32} color="var(--text-tertiary)" />
              </div>
              <p className="proxy-empty-msg">
                {filter === 'expired'
                  ? 'Không có Proxy nào bị lỗi hoặc hết hạn.'
                  : (filter === 'active' ? 'Không có Proxy nào đang sống.' : 'Chưa có Proxy nào trong danh sách.')}
              </p>
              {filter !== 'all' ? (
                <button type="button" className="btn btn-secondary btn-sm" onClick={() => setFilter('all')}>
                  Xem tất cả Proxy
                </button>
              ) : (
                <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm}>
                  <window.Icon name="plus" size={14} /> Thêm Proxy Đầu Tiên
                </button>
              )}
            </div>
          ) : (
            <div className="proxy-card-list">
              {filteredProxies.map(p => {
                const isFull = (p.onlineCount || 0) >= 6;
                const isTestingThis = testingId === p.id;
                const isRotatingThis = rotatingId === p.id;
                const isExpired = Boolean(p.isExpired);
                const isDraining = p.status === 'DRAINING';
                const protocolType = (p.type || 'socks').toLowerCase() === 'http' ? 'http' : 'socks';

                // Phân biệt tên tùy chỉnh vs trùng lặp Host:Port
                const endpointText = `${p.host}:${p.port}`;
                const hasCustomName = Boolean(p.name && p.name.trim() !== endpointText);
                const titleText = hasCustomName ? p.name : endpointText;

                return (
                  <div
                    key={p.id}
                    className={`proxy-item-card ${isExpired ? 'is-expired' : ''} ${isDraining ? 'is-draining' : ''}`}
                  >
                    {/* CỘT TRÁI: Tên, Trạng thái, Protocol, Endpoint & Thông tin bổ sung */}
                    <div className="proxy-primary-info">
                      <div className="proxy-headline">
                        <strong className={`proxy-title-text ${isExpired ? 'is-expired' : ''}`}>
                          {titleText}
                        </strong>

                        {isExpired ? (
                          <span className="proxy-badge-status-dead">
                            <window.Icon name="alert-triangle" size={11} /> LỖI / HẾT HẠN
                          </span>
                        ) : (
                          <span className="proxy-badge-status-live">
                            <span className="proxy-status-dot-live"></span>
                            SỐNG {p.latencyMs ? `(${p.latencyMs}ms)` : ''}
                          </span>
                        )}

                        <span className={`proxy-badge-protocol ${protocolType === 'socks' ? 'is-socks' : 'is-http'}`}>
                          {p.type || 'SOCKS5'}
                        </span>
                      </div>

                      <div className="proxy-endpoint-row">
                        {hasCustomName && (
                          <span className="proxy-endpoint-code">{endpointText}</span>
                        )}

                        {/* Metadata tags bổ sung gọn gàng */}
                        {isDraining && (
                          <span className="proxy-badge-draining">
                            <window.Icon name="alert-triangle" size={10} /> DRAINING
                          </span>
                        )}
                        {p.tier && (
                          <span className={p.tier === 'CORE' ? 'proxy-badge-tier-core' : 'proxy-badge-tier-dynamic'}>
                            {p.tier}
                          </span>
                        )}
                        {p.remainingDays !== null && p.remainingDays !== undefined && (
                          <span className={`proxy-badge-expiry ${p.remainingDays <= 3 ? 'is-urgent' : ''}`}>
                            <window.Icon name="clock" size={10} /> Hạn: {p.remainingDays} ngày
                          </span>
                        )}
                        {p.externalId && (
                          <span className="proxy-badge-external">
                            <window.Icon name="link" size={10} /> Proxy.vn #{p.externalId}
                          </span>
                        )}
                      </div>

                      {/* Dòng báo lỗi kết nối nếu có */}
                      {isExpired && p.errorReason && (
                        <div className="proxy-error-callout">
                          {p.errorReason}
                        </div>
                      )}
                    </div>

                    {/* CỘT PHẢI: Số lượng Online/Gán Nick & Cụm nút hành động */}
                    <div className="proxy-right-group">
                      <div className="proxy-stats-col">
                        <span className={`proxy-online-badge ${isFull ? 'is-full' : ((p.onlineCount || 0) > 0 ? 'is-active' : 'is-empty')}`}>
                          Online: {p.onlineCount || 0}/6
                        </span>
                        <div className="proxy-stats-subtext">
                          {p.countHM || 0} HM · {p.countDK || 0} DK ({p.totalAssigned || 0} nick)
                        </div>
                      </div>

                      <div className="proxy-actions-row">
                        <button
                          type="button"
                          className="btn btn-sm btn-secondary proxy-btn-action"
                          onClick={() => handleTestProxy(p.id, p.name)}
                          disabled={isTestingThis}
                          title="Kiểm tra kết nối Proxy"
                        >
                          <window.Icon name="zap" size={13} color="var(--apple-orange)" />
                          {isTestingThis ? 'Test...' : 'Test'}
                        </button>

                        {(p.externalId || p.tier === 'DYNAMIC') && (
                          <button
                            type="button"
                            className="btn btn-sm btn-secondary proxy-btn-action"
                            onClick={() => handleRotateProxy(p.id, p.name)}
                            disabled={isRotatingThis}
                            title="Xoay IP mới từ Proxy.vn"
                          >
                            <window.Icon
                              name="refresh-cw"
                              size={13}
                              className={`proxy-btn-rotate ${isRotatingThis ? 'is-rotating' : ''}`}
                              color="var(--apple-blue)"
                            />
                            {isRotatingThis ? 'Đổi...' : 'Đổi IP'}
                          </button>
                        )}

                        <button
                          type="button"
                          className="btn btn-sm btn-secondary proxy-btn-action"
                          onClick={() => openEditForm(p)}
                          title="Sửa Proxy"
                        >
                          <window.Icon name="edit" size={13} />
                        </button>
                        <button
                          type="button"
                          className="btn btn-sm btn-danger proxy-btn-action"
                          onClick={() => handleDelete(p.id, p.name)}
                          title="Xóa Proxy"
                        >
                          <window.Icon name="trash" size={13} />
                        </button>
                      </div>
                    </div>
                  </div>
                );
              })}
            </div>
          )}
        </div>
      </window.ModalBase>

      {/* Standalone Box Modal for Add/Edit Proxy */}
      {showFormModal && (
        <ProxyFormModal
          proxy={editingProxy}
          onSaveProxy={onSaveProxy}
          onClose={() => setShowFormModal(false)}
          onSaved={() => {
            setShowFormModal(false);
            if (typeof onRefreshProxies === 'function') onRefreshProxies();
          }}
        />
      )}

      {/* Standalone Box Modal for Proxy.vn System Configuration */}
      {showSystemConfigModal && (
        <ProxySystemConfigModal
          config={systemConfig}
          onClose={() => setShowSystemConfigModal(false)}
          onSaved={() => {
            loadSystemConfig();
            if (typeof onRefreshProxies === 'function') onRefreshProxies();
          }}
        />
      )}
    </>
  );
};
