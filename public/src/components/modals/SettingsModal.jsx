/**
 * SettingsModal Component (Presentation Layer / Modals)
 * Bot AppID, RAM limits, AutoRestart, AutoStart & Dashboard Password form.
 */
const { useState: useSettingsModalState } = React;

window.SettingsModal = function SettingsModal({ config, onClose, onSaved }) {
  const [appId, setAppId] = useSettingsModalState(config?.appId || 'avatar_main');
  const [port, setPort] = useSettingsModalState(config?.port || 3001);
  const [rmsMode, setRmsMode] = useSettingsModalState(config?.rmsMode || 'file');
  const [maxMemory, setMaxMemory] = useSettingsModalState(config?.maxMemoryMb || 256);
  const [autoRestart, setAutoRestart] = useSettingsModalState(Boolean(config?.autoRestart));
  const [autoStart, setAutoStart] = useSettingsModalState(Boolean(config?.autoStart));
  const [password, setPassword] = useSettingsModalState('');

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

    try {
      const data = await window.ApiClient.saveConfig(payload);
      if (data.success) {
        alert('✓ Đã lưu cài đặt thành công!');
        onSaved(password);
      } else {
        alert(data.message || 'Lỗi lưu cấu hình');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  return (
    <div className="modal-overlay" style={{ display: 'flex' }}>
      <div className="modal-card">
        <div className="modal-header">
          <h3>⚙️ Cài Đặt Cấu Hình Bot</h3>
          <button className="btn-close" onClick={onClose}>&times;</button>
        </div>
        <form onSubmit={handleSubmit}>
          <div className="modal-body">
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

            <div className="form-row" style={{ marginTop: '6px' }}>
              <div className="checkbox-group">
                <input
                  type="checkbox"
                  id="modalAutoRestart"
                  checked={autoRestart}
                  onChange={e => setAutoRestart(e.target.checked)}
                />
                <label htmlFor="modalAutoRestart">Tự động khởi động lại khi bot bị crash</label>
              </div>
              <div className="checkbox-group">
                <input
                  type="checkbox"
                  id="modalAutoStart"
                  checked={autoStart}
                  onChange={e => setAutoStart(e.target.checked)}
                />
                <label htmlFor="modalAutoStart">Tự động khôi phục treo bot khi cPanel khởi động web</label>
              </div>
            </div>

            <hr className="divider" />
            <h4 style={{ margin: '12px 0 6px 0', fontSize: '0.95rem' }}>Bảo Mật Truy Cập Web Dashboard</h4>
            <div className="form-group">
              <label>Mật khẩu đăng nhập Web (Để trống nếu không đặt mật khẩu):</label>
              <input
                type="password"
                className="form-control"
                placeholder="Nhập mật khẩu mới bảo vệ web"
                value={password}
                onChange={e => setPassword(e.target.value)}
              />
            </div>
          </div>
          <div className="modal-footer">
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy Bỏ</button>
            <button type="submit" className="btn btn-primary">Lưu Cài Đặt</button>
          </div>
        </form>
      </div>
    </div>
  );
};
