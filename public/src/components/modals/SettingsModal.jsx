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

  const handleThemeChange = (newTheme) => {
    setSelectedTheme(newTheme);
    if (setTheme) {
      setTheme(newTheme);
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    const payload = {
      appId: appId.trim(),
      port: parseInt(port, 10) || 3001,
      rmsMode,
      maxMemoryMb: parseInt(maxMemory, 10),
      autoRestart,
      autoStart
    };

    if (password) {
      payload.password = password;
    }

    const notifyAlert = window.showAlert || alert;
    try {
      const data = await window.ApiClient.saveConfig(payload);
      if (data.success) {
        notifyAlert('Đã lưu cài đặt cấu hình thành công!', 'Thành Công', 'success');
        onSaved(password);
      } else {
        notifyAlert(data.message || 'Lỗi lưu cấu hình', 'Lỗi Cấu Hình', 'error');
      }
    } catch (err) {
      notifyAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
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
      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '16px' }}>
        {/* Theme Selector */}
        <div className="form-group" style={{ background: 'var(--glass-matrix-bg)', padding: '12px 14px', borderRadius: 'var(--radius-sm)', border: '1px solid var(--glass-border-subtle)' }}>
          <label style={{ marginBottom: '8px', display: 'flex', alignItems: 'center', gap: '6px' }}>
            <window.Icon name="sun" size={14} color="var(--apple-blue)" />
            <span>Chế Độ Giao Diện (Theme):</span>
          </label>
          <div className="segmented-control" style={{ width: '100%', display: 'flex' }}>
            <button
              type="button"
              className={`btn ${selectedTheme === 'dark' ? 'active btn-primary' : ''}`}
              style={{ flex: 1, gap: '6px' }}
              onClick={() => handleThemeChange('dark')}
            >
              <window.Icon name="moon" size={14} /> Chế Độ Tối (Dark)
            </button>
            <button
              type="button"
              className={`btn ${selectedTheme === 'light' ? 'active btn-primary' : ''}`}
              style={{ flex: 1, gap: '6px' }}
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
              className="form-control"
              value={appId}
              onChange={e => setAppId(e.target.value)}
            />
          </div>
          <div className="form-group">
            <label>Cổng Port Web Dashboard:</label>
            <input
              type="number"
              className="form-control"
              value={port}
              onChange={e => setPort(e.target.value)}
              min="80"
              max="65535"
              placeholder="3001"
            />
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
              className="form-control"
              value={maxMemory}
              onChange={e => setMaxMemory(e.target.value)}
              min="64"
              max="2048"
            />
          </div>
        </div>

        <div className="form-row" style={{ marginTop: '2px' }}>
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
            className="form-control"
            placeholder="Nhập mật khẩu mới bảo vệ web"
            value={password}
            onChange={e => setPassword(e.target.value)}
          />
        </div>
      </form>
    </window.ModalBase>
  );
};
