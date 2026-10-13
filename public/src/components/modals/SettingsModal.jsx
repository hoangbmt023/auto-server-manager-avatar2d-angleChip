/**
 * SettingsModal Component (Presentation Layer / Modals)
 * Porsche & Apple Precision System & Theme Configuration
 */
const { useState: useSettingsModalState } = React;

window.SettingsModal = function SettingsModal({ config, theme = 'dark', setTheme, onClose, onSaved }) {
  const [appId, setAppId] = useSettingsModalState(config?.appId || 'avatar_main');
  const [port, setPort] = useSettingsModalState(config?.port || 3001);
  const [rmsMode, setRmsMode] = useSettingsModalState(config?.rmsMode || 'file');
  const [maxMemory, setMaxMemory] = useSettingsModalState(config?.maxMemoryMb || 256);
  const [autoRestart, setAutoRestart] = useSettingsModalState(Boolean(config?.autoRestart));
  const [autoStart, setAutoStart] = useSettingsModalState(Boolean(config?.autoStart));
  const [password, setPassword] = useSettingsModalState('');
  const [selectedTheme, setSelectedTheme] = useSettingsModalState(theme || 'dark');
  const [fieldErrors, setFieldErrors] = useSettingsModalState({});

  const clearFieldError = (f) => {
    setFieldErrors(prev => {
      if (!prev || !prev[f]) return prev;
      const next = { ...prev };
      delete next[f];
      return next;
    });
  };

  const handleThemeChange = (newTheme) => {
    setSelectedTheme(newTheme);
    if (setTheme) {
      setTheme(newTheme);
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    // 1. Validate Frontend
    const feErrors = {};
    const portNum = parseInt(port, 10);
    if (isNaN(portNum) || portNum < 1 || portNum > 65535) {
      feErrors.port = `Cổng Port [${port || ''}] không hợp lệ (1 - 65535)!`;
    }
    const memNum = parseInt(maxMemory, 10);
    if (isNaN(memNum) || memNum < 64) {
      feErrors.maxMemory = 'Giới hạn RAM phải tối thiểu từ 64MB trở lên!';
    }

    if (Object.keys(feErrors).length > 0) {
      setFieldErrors(feErrors);
      return;
    }

    setFieldErrors({});

    const payload = {
      appId: appId.trim(),
      port: portNum || 3001,
      rmsMode,
      maxMemoryMb: memNum || 512,
      autoRestart,
      autoStart
    };

    if (password) {
      payload.password = password;
    }

    try {
      const data = await window.ApiClient.saveConfig(payload);
      if (data.success) {
        onSaved(password);
      } else {
        // 2. Validate Backend
        if (data.errors && typeof data.errors === 'object') {
          setFieldErrors(data.errors);
        } else {
          setFieldErrors({ appId: data.message || 'Lỗi lưu cấu hình' });
        }
      }
    } catch (err) {
      setFieldErrors({ appId: 'Lỗi hệ thống: ' + err.message });
    }
  };

  return (
    <window.ModalBase
      title="Cài Đặt Hệ Thống & Giao Diện"
      subtitle="Cấu hình bộ nhớ, port web và phong cách giao diện"
      icon="settings"
      iconColor="var(--apple-blue)"
      size="md"
      onClose={onClose}
      footer={
        <>
          <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit}>
            <window.Icon name="check" size={14} /> Lưu Cài Đặt
          </button>
        </>
      }
    >
      <form onSubmit={handleSubmit} className="modal-form-stack">
        {/* Theme Selector */}
        <div className="form-group farm-section-card" style={{ marginBottom: 0 }}>
          <label style={{ marginBottom: '8px', display: 'flex', alignItems: 'center', gap: '6px' }}>
            <window.Icon name="sun" size={14} color="var(--apple-blue)" />
            <span>Chế Độ Giao Diện (Theme):</span>
          </label>
          <div className="segmented-control" style={{ width: '100%' }}>
            <button
              type="button"
              className={`btn ${selectedTheme === 'dark' ? 'active btn-primary' : ''}`}
              onClick={() => handleThemeChange('dark')}
            >
              <window.Icon name="moon" size={14} /> Chế Độ Tối (Dark)
            </button>
            <button
              type="button"
              className={`btn ${selectedTheme === 'light' ? 'active btn-primary' : ''}`}
              onClick={() => handleThemeChange('light')}
            >
              <window.Icon name="sun" size={14} /> Chế Độ Sáng (Light)
            </button>
          </div>
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Tên Hồ Sơ / App ID (Lưu RMS):</label>
            <input
              type="text"
              className={`form-control ${fieldErrors.appId ? 'input-error' : ''}`}
              value={appId}
              onChange={e => {
                setAppId(e.target.value);
                clearFieldError('appId');
              }}
            />
            {fieldErrors.appId && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.appId}</span>
              </div>
            )}
          </div>
          <div className="form-group">
            <label>Cổng Port Web Dashboard:</label>
            <input
              type="number"
              className={`form-control ${fieldErrors.port ? 'input-error' : ''}`}
              value={port}
              onChange={e => {
                setPort(e.target.value);
                clearFieldError('port');
              }}
              min="1"
              max="65535"
              placeholder="3001"
            />
            {fieldErrors.port && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.port}</span>
              </div>
            )}
          </div>
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Chế độ lưu RMS:</label>
            <select className="form-control" value={rmsMode} onChange={e => setRmsMode(e.target.value)}>
              <option value="file">Lưu vào File (Khuyên dùng để giữ nick)</option>
              <option value="memory">Lưu vào RAM (Xóa khi tắt bot)</option>
            </select>
          </div>
          <div className="form-group">
            <label>Giới hạn RAM (MB):</label>
            <input
              type="number"
              className={`form-control ${fieldErrors.maxMemory ? 'input-error' : ''}`}
              value={maxMemory}
              onChange={e => {
                setMaxMemory(e.target.value);
                clearFieldError('maxMemory');
              }}
              min="64"
              max="8192"
            />
            {fieldErrors.maxMemory && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.maxMemory}</span>
              </div>
            )}
          </div>
        </div>

        <div className="form-row">
          <div className="checkbox-group" style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <input
              type="checkbox"
              id="modalAutoRestart"
              checked={autoRestart}
              onChange={e => setAutoRestart(e.target.checked)}
            />
            <label htmlFor="modalAutoRestart" style={{ fontSize: '0.82rem', margin: 0 }}>Tự khởi động lại khi bot bị crash</label>
          </div>
          <div className="checkbox-group" style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <input
              type="checkbox"
              id="modalAutoStart"
              checked={autoStart}
              onChange={e => setAutoStart(e.target.checked)}
            />
            <label htmlFor="modalAutoStart" style={{ fontSize: '0.82rem', margin: 0 }}>Tự khôi phục treo bot khi khởi động web</label>
          </div>
        </div>

        <hr className="divider" style={{ borderColor: 'var(--glass-border-subtle)', margin: '2px 0' }} />
        <div className="form-group">
          <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
            <window.Icon name="shield" size={14} color="var(--apple-blue)" />
            <span>Mật khẩu đăng nhập Web (Để trống nếu không đặt mật khẩu):</span>
          </label>
          <input
            type="password"
            className={`form-control ${fieldErrors.password ? 'input-error' : ''}`}
            placeholder="Nhập mật khẩu mới bảo vệ web"
            value={password}
            onChange={e => {
              setPassword(e.target.value);
              clearFieldError('password');
            }}
          />
          {fieldErrors.password && (
            <div className="field-error-msg">
              <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
              <span>{fieldErrors.password}</span>
            </div>
          )}
        </div>
      </form>
    </window.ModalBase>
  );
};
