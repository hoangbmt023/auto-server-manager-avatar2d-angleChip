/**
 * ProxyModal Component (Presentation Layer)
 * Box-style Proxy Manager: List view with dedicated popup/box form for adding & editing proxies.
 */
window.ProxyModal = function ProxyModal({
  onClose,
  proxies = [],
  onSaveProxy,
  onDeleteProxy
}) {
  const [viewMode, setViewMode] = React.useState('list'); // 'list' | 'form'
  const [editingProxy, setEditingProxy] = React.useState(null);

  const [name, setName] = React.useState('');
  const [type, setType] = React.useState('socks');
  const [host, setHost] = React.useState('');
  const [port, setPort] = React.useState('');
  const [username, setUsername] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [error, setError] = React.useState('');
  const [loading, setLoading] = React.useState(false);

  const openCreateForm = () => {
    setEditingProxy(null);
    setName('');
    setType('socks');
    setHost('');
    setPort('');
    setUsername('');
    setPassword('');
    setError('');
    setViewMode('form');
  };

  const openEditForm = (p) => {
    setEditingProxy(p);
    setName(p.name || '');
    setType(p.type || 'socks');
    setHost(p.host || '');
    setPort(p.port ? String(p.port) : '');
    setUsername(p.username || '');
    setPassword(p.password || '');
    setError('');
    setViewMode('form');
  };

  const backToList = () => {
    setEditingProxy(null);
    setError('');
    setViewMode('list');
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!host.trim()) {
      setError('Vui lòng nhập Host / IP Proxy!');
      return;
    }
    const pNum = parseInt(port, 10);
    if (!pNum || isNaN(pNum) || pNum < 1 || pNum > 65535) {
      setError('Cổng Port không hợp lệ (1 - 65535)!');
      return;
    }

    setLoading(true);
    setError('');
    try {
      await onSaveProxy({
        id: editingProxy ? editingProxy.id : undefined,
        name: name.trim() || `${type.toUpperCase()} (${host.trim()}:${pNum})`,
        type,
        host: host.trim(),
        port: pNum,
        username: username.trim(),
        password: password.trim()
      });
      backToList();
    } catch (err) {
      setError(err.message || 'Lỗi khi lưu proxy!');
    } finally {
      setLoading(false);
    }
  };

  const handleDelete = async (id, proxyName) => {
    if (!window.confirm(`Bạn có chắc muốn xóa Proxy [${proxyName}]?`)) return;
    try {
      await onDeleteProxy(id);
    } catch (err) {
      alert(err.message || 'Lỗi khi xóa proxy!');
    }
  };

  return (
    <div className="modal-overlay" style={{ display: 'flex' }} onClick={onClose}>
      <div className="modal-card" onClick={(e) => e.stopPropagation()} style={{ maxWidth: '720px', width: '100%' }}>
        {/* Header */}
        <div className="modal-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <span style={{ fontSize: '1.25rem' }}>🌐</span>
            <h3 style={{ margin: 0, fontSize: '1.1rem' }}>
              {viewMode === 'form'
                ? (editingProxy ? `Sửa Proxy: ${editingProxy.name}` : 'Thêm Proxy Mới')
                : `Quản Lý Danh Sách Proxy (${proxies.length})`}
            </h3>
          </div>
          <button className="btn-close" onClick={onClose}>&times;</button>
        </div>

        {/* Body */}
        <div className="modal-body" style={{ maxHeight: 'calc(85vh - 120px)', overflowY: 'auto' }}>
          {error && <div className="alert alert-danger" style={{ marginBottom: '16px' }}>{error}</div>}

          {viewMode === 'list' ? (
            <div>
              {/* List Top Action Bar */}
              <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '16px', flexWrap: 'wrap', gap: '10px' }}>
                <span style={{ fontSize: '0.85rem', color: '#94a3b8' }}>
                  🛡️ Mỗi Proxy hỗ trợ tối đa <strong>6 tài khoản online</strong> cùng lúc.
                </span>
                <button
                  type="button"
                  className="btn btn-primary btn-sm"
                  onClick={openCreateForm}
                  style={{ display: 'flex', alignItems: 'center', gap: '6px' }}
                >
                  ➕ Thêm Proxy Mới
                </button>
              </div>

              {/* List of Proxies */}
              {proxies.length === 0 ? (
                <div style={{ textAlign: 'center', padding: '40px 20px', color: '#64748b', background: 'rgba(255, 255, 255, 0.02)', borderRadius: '10px', border: '1px dashed rgba(255, 255, 255, 0.08)' }}>
                  <div style={{ fontSize: '2rem', marginBottom: '8px' }}>🌐</div>
                  <p style={{ margin: '0 0 12px 0' }}>Chưa có Proxy nào trong danh sách.</p>
                  <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm}>
                    ➕ Thêm Proxy Đầu Tiên
                  </button>
                </div>
              ) : (
                <div style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
                  {proxies.map(p => {
                    const isFull = p.onlineCount >= 6;
                    return (
                      <div
                        key={p.id}
                        style={{
                          display: 'flex',
                          alignItems: 'center',
                          justifyContent: 'space-between',
                          padding: '14px 16px',
                          background: 'rgba(255, 255, 255, 0.03)',
                          borderRadius: '10px',
                          border: '1px solid rgba(255, 255, 255, 0.08)'
                        }}
                      >
                        <div>
                          <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '4px' }}>
                            <strong style={{ color: '#f8fafc', fontSize: '0.95rem' }}>{p.name}</strong>
                            <span style={{
                              padding: '2px 6px',
                              borderRadius: '4px',
                              fontSize: '0.72rem',
                              fontWeight: 600,
                              textTransform: 'uppercase',
                              background: p.type === 'http' ? 'rgba(234, 179, 8, 0.15)' : 'rgba(168, 85, 247, 0.15)',
                              color: p.type === 'http' ? '#facc15' : '#c084fc',
                              border: '1px solid',
                              borderColor: p.type === 'http' ? 'rgba(234, 179, 8, 0.3)' : 'rgba(168, 85, 247, 0.3)'
                            }}>
                              {p.type || 'SOCKS5'}
                            </span>
                          </div>
                          <div style={{ fontSize: '0.82rem', color: '#94a3b8', fontFamily: 'monospace' }}>
                            {p.host}:{p.port} {p.username ? `(User: ${p.username})` : ''}
                          </div>
                        </div>

                        <div style={{ display: 'flex', alignItems: 'center', gap: '14px' }}>
                          <div style={{ textAlign: 'right' }}>
                            <span style={{
                              display: 'inline-block',
                              padding: '3px 8px',
                              borderRadius: '6px',
                              fontSize: '0.78rem',
                              fontWeight: 600,
                              background: isFull ? 'rgba(239, 68, 68, 0.15)' : (p.onlineCount > 0 ? 'rgba(34, 197, 94, 0.15)' : 'rgba(255, 255, 255, 0.05)'),
                              color: isFull ? '#f87171' : (p.onlineCount > 0 ? '#4ade80' : '#94a3b8'),
                              border: '1px solid',
                              borderColor: isFull ? 'rgba(239, 68, 68, 0.3)' : (p.onlineCount > 0 ? 'rgba(34, 197, 94, 0.3)' : 'rgba(255, 255, 255, 0.1)')
                            }}>
                              Online: {p.onlineCount || 0} / 6
                            </span>
                            <div style={{ fontSize: '0.75rem', color: '#64748b', marginTop: '2px' }}>
                              Gán: {p.totalAssigned || 0} nick
                            </div>
                          </div>

                          <div style={{ display: 'flex', gap: '6px' }}>
                            <button
                              type="button"
                              className="btn btn-sm btn-secondary"
                              onClick={() => openEditForm(p)}
                              style={{ padding: '4px 8px', fontSize: '0.8rem' }}
                              title="Chỉnh sửa Proxy"
                            >
                              ✏️ Sửa
                            </button>
                            <button
                              type="button"
                              className="btn btn-sm btn-danger"
                              onClick={() => handleDelete(p.id, p.name)}
                              style={{ padding: '4px 8px', fontSize: '0.8rem' }}
                              title="Xóa Proxy"
                            >
                              🗑️
                            </button>
                          </div>
                        </div>
                      </div>
                    );
                  })}
                </div>
              )}
            </div>
          ) : (
            /* Dedicated Box Form for Input */
            <div className="card-glass" style={{ padding: '20px', background: 'rgba(255, 255, 255, 0.03)', borderRadius: '12px', border: '1px solid rgba(255, 255, 255, 0.08)' }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: '16px' }}>
                <h4 style={{ margin: 0, fontSize: '1rem', color: '#60a5fa' }}>
                  {editingProxy ? '✏️ Chỉnh Sửa Thông Tin Proxy' : '➕ Nhập Thông Tin Proxy Mới'}
                </h4>
                <button type="button" className="btn btn-sm btn-secondary" onClick={backToList}>
                  ⬅️ Quay lại danh sách
                </button>
              </div>

              <form onSubmit={handleSubmit}>
                <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(200px, 1fr))', gap: '14px' }}>
                  <div className="form-group" style={{ gridColumn: 'span 2' }}>
                    <label className="form-label">Tên gợi nhớ Proxy:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="VD: Proxy SOCKS5 VN 1, Proxy Xoay..."
                      value={name}
                      onChange={(e) => setName(e.target.value)}
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Giao thức (Type):</label>
                    <select className="form-control" value={type} onChange={(e) => setType(e.target.value)}>
                      <option value="socks">SOCKS5 / SOCKS4</option>
                      <option value="http">HTTP / HTTPS</option>
                    </select>
                  </div>

                  <div className="form-group">
                    <label className="form-label">Host / IP <span style={{ color: '#f87171' }}>*</span>:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="1.2.3.4 hoặc proxy.domain.com"
                      value={host}
                      required
                      onChange={(e) => setHost(e.target.value)}
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Port <span style={{ color: '#f87171' }}>*</span>:</label>
                    <input
                      type="number"
                      className="form-control"
                      placeholder="1080"
                      value={port}
                      required
                      onChange={(e) => setPort(e.target.value)}
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Tài khoản (nếu có):</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="Username"
                      value={username}
                      onChange={(e) => setUsername(e.target.value)}
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Mật khẩu (nếu có):</label>
                    <input
                      type="password"
                      className="form-control"
                      placeholder="Password"
                      value={password}
                      onChange={(e) => setPassword(e.target.value)}
                    />
                  </div>
                </div>

                <div style={{ display: 'flex', justifyContent: 'flex-end', marginTop: '20px', gap: '10px' }}>
                  <button type="button" className="btn btn-secondary" onClick={backToList}>
                    Hủy
                  </button>
                  <button type="submit" className="btn btn-primary" disabled={loading}>
                    {loading ? 'Đang lưu...' : (editingProxy ? '💾 Lưu Cập Nhật' : '➕ Thêm Proxy')}
                  </button>
                </div>
              </form>
            </div>
          )}
        </div>

        {/* Footer */}
        <div className="modal-footer" style={{ borderTop: '1px solid rgba(255, 255, 255, 0.08)', padding: '12px 20px', display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
          {viewMode === 'form' ? (
            <button type="button" className="btn btn-outline btn-sm" onClick={backToList}>
              ⬅️ Danh Sách Proxy
            </button>
          ) : <div />}
          <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
        </div>
      </div>
    </div>
  );
};
