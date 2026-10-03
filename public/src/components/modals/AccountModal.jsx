/**
 * AccountModal Component (Presentation Layer / Modals)
 * Add and Edit Account Modal form with File Profile, Server and Proxy assignment.
 */
const { useState: useAccModalState } = React;

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
              <select className="form-control" value={fileId} onChange={e => setFileId(e.target.value)}>
                {files.map(f => (
                  <option key={f.id} value={f.id}>{f.name} ({f.totalAccounts || 0}/6 nick)</option>
                ))}
              </select>
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
                <label>🌐 Server Game (Tối đa 3 nick/server):</label>
                <select className="form-control" value={serverId} onChange={e => setServerId(e.target.value)}>
                  <option value="0">Server 1: Hoàn Mỹ</option>
                  <option value="1">Server 2: Diệu Kỳ</option>
                </select>
              </div>

              <div className="form-group">
                <label>🔒 Gán Proxy Kết Nối (Tối đa 6 online/proxy):</label>
                <select className="form-control" value={proxyId} onChange={e => setProxyId(e.target.value)}>
                  <option value="">Không dùng Proxy (IP Server)</option>
                  {proxies.map(p => (
                    <option
                      key={p.id}
                      value={p.id}
                      disabled={p.isExpired}
                    >
                      {p.isExpired ? '⚠️ [ĐÃ HẾT HẠN] ' : ''}
                      {p.name} ({p.type ? p.type.toUpperCase() : 'SOCKS'} - {p.host}:{p.port})
                      {p.isExpired ? ' - Không thể chọn' : ` [Online: ${p.onlineCount || 0}/6]`}
                    </option>
                  ))}
                </select>
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
