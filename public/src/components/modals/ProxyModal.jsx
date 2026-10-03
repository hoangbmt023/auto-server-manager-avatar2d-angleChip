/**
 * ProxyModal Component (Presentation Layer)
 * Box-style Proxy Manager: List view with dedicated popup/box form for adding & editing proxies.
 * Includes Live/Expired Health Check, Expiration Flags, and Status Filtering.
 */
window.ProxyModal = function ProxyModal({
  onClose,
  proxies = [],
  onSaveProxy,
  onDeleteProxy,
  initialFilter = 'all',
  onRefreshProxies
}) {
  const [viewMode, setViewMode] = React.useState('list'); // 'list' | 'form'
  const [filter, setFilter] = React.useState(initialFilter || 'all'); // 'all' | 'active' | 'expired'
  const [editingProxy, setEditingProxy] = React.useState(null);

  const [name, setName] = React.useState('');
  const [type, setType] = React.useState('socks');
  const [host, setHost] = React.useState('');
  const [port, setPort] = React.useState('');
  const [username, setUsername] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [error, setError] = React.useState('');
  const [loading, setLoading] = React.useState(false);

  const [testingId, setTestingId] = React.useState(null);
  const [testingAll, setTestingAll] = React.useState(false);
  const [testNotice, setTestNotice] = React.useState(null); // { type: 'success'|'error', text: '' }

  React.useEffect(() => {
    if (initialFilter) {
      setFilter(initialFilter);
    }
  }, [initialFilter]);

  const activeCount = proxies.filter(p => !p.isExpired).length;
  const expiredCount = proxies.filter(p => p.isExpired).length;

  const filteredProxies = proxies.filter(p => {
    if (filter === 'active') return !p.isExpired;
    if (filter === 'expired') return Boolean(p.isExpired);
    return true;
  });

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

  const handleTestProxy = async (id, pName) => {
    setTestingId(id);
    setTestNotice(null);
    try {
      const res = await window.ApiClient.testProxy(id);
      if (res.success) {
        setTestNotice({
          type: 'success',
          text: `🟢 Proxy [${pName}]: ${res.message || 'Hoạt động tốt'}`
        });
      } else {
        setTestNotice({
          type: 'error',
          text: `🔴 Proxy [${pName}]: ${res.message || 'Không thể kết nối / Hết hạn'}`
        });
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `❌ Lỗi kiểm tra: ${err.message}` });
    } finally {
      setTestingId(null);
    }
  };

  const handleTestAll = async () => {
    setTestingAll(true);
    setTestNotice({ type: 'info', text: '⏳ Đang kiểm tra toàn bộ danh sách proxy...' });
    try {
      const res = await window.ApiClient.testAllProxies();
      if (res.success) {
        const deadCount = (res.results || []).filter(r => r.isExpired).length;
        const liveCount = res.results.length - deadCount;
        setTestNotice({
          type: deadCount > 0 ? 'error' : 'success',
          text: `📊 Đã kiểm tra ${res.results.length} Proxy: ${liveCount} Hoạt động, ${deadCount} Hết hạn / Lỗi.`
        });
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `❌ Lỗi kiểm tra tất cả: ${err.message}` });
    } finally {
      setTestingAll(false);
    }
  };

  return (
    <div className="modal-overlay modal-overlay-flex" onClick={onClose}>
      <div className="modal-card modal-card-lg" onClick={(e) => e.stopPropagation()}>
        {/* Header */}
        <div className="modal-header">
          <div className="modal-header-title-group">
            <span className="modal-header-icon">🌐</span>
            <h3 className="modal-header-title">
              {viewMode === 'form'
                ? (editingProxy ? `Sửa Proxy: ${editingProxy.name}` : 'Thêm Proxy Mới')
                : `Quản Lý Danh Sách Proxy (${proxies.length})`}
            </h3>
          </div>
          <button className="btn-close" onClick={onClose}>&times;</button>
        </div>

        {/* Body */}
        <div className="modal-body modal-body-scroll">
          {error && <div className="alert alert-danger">{error}</div>}

          {/* Test Notice Banner */}
          {testNotice && (
            <div className={`proxy-test-notice ${testNotice.type}`}>
              <span>{testNotice.text}</span>
              <button
                type="button"
                className="btn-notice-close"
                onClick={() => setTestNotice(null)}
              >
                &times;
              </button>
            </div>
          )}

          {viewMode === 'list' ? (
            <div>
              {/* Filter Tabs and Action Bar */}
              <div className="proxy-action-bar">
                {/* Status Filter Tabs */}
                <div className="proxy-filter-tabs">
                  <button
                    type="button"
                    className={`btn btn-sm ${filter === 'all' ? 'btn-primary' : 'btn-secondary'}`}
                    onClick={() => setFilter('all')}
                  >
                    Tất cả ({proxies.length})
                  </button>
                  <button
                    type="button"
                    className={`btn btn-sm ${filter === 'active' ? 'btn-success' : 'btn-secondary'}`}
                    onClick={() => setFilter('active')}
                  >
                    🟢 Sống ({activeCount})
                  </button>
                  <button
                    type="button"
                    className={`btn btn-sm ${filter === 'expired' ? 'btn-danger' : 'btn-secondary'}`}
                    onClick={() => setFilter('expired')}
                  >
                    ⚠️ Hết hạn / Lỗi ({expiredCount})
                  </button>
                </div>

                <div className="header-btn-group">
                  <button
                    type="button"
                    className="btn btn-secondary btn-sm"
                    onClick={handleTestAll}
                    disabled={testingAll || proxies.length === 0}
                    title="Kiểm tra kết nối và hạn dùng toàn bộ Proxy"
                  >
                    {testingAll ? '⏳ Đang test...' : '⚡ Test tất cả'}
                  </button>
                  <button
                    type="button"
                    className="btn btn-primary btn-sm"
                    onClick={openCreateForm}
                  >
                    ➕ Thêm Proxy
                  </button>
                </div>
              </div>

              {/* List of Proxies */}
              {filteredProxies.length === 0 ? (
                <div className="proxy-empty-state">
                  <div className="empty-state-icon">🌐</div>
                  <p>
                    {filter === 'expired'
                      ? 'Không có Proxy nào bị hết hạn hoặc lỗi.'
                      : (filter === 'active' ? 'Không có Proxy nào đang hoạt động.' : 'Chưa có Proxy nào trong danh sách.')}
                  </p>
                  {filter !== 'all' ? (
                    <button type="button" className="btn btn-secondary btn-sm" onClick={() => setFilter('all')}>
                      Xem tất cả Proxy
                    </button>
                  ) : (
                    <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm}>
                      ➕ Thêm Proxy Đầu Tiên
                    </button>
                  )}
                </div>
              ) : (
                <div className="items-list-col">
                  {filteredProxies.map(p => {
                    const isFull = p.onlineCount >= 6;
                    const isTestingThis = testingId === p.id;
                    const isExpired = Boolean(p.isExpired);
                    const protocolType = (p.type || 'socks').toLowerCase() === 'http' ? 'http' : 'socks';

                    return (
                      <div
                        key={p.id}
                        className={`proxy-item-card ${isExpired ? 'is-expired' : ''}`}
                      >
                        <div className="proxy-item-info">
                          <div className="proxy-item-header">
                            <strong className="proxy-name">{p.name}</strong>

                            {/* Status Badge */}
                            {isExpired ? (
                              <span className="proxy-status-badge expired">
                                🛑 HẾT HẠN / LỖI
                              </span>
                            ) : (
                              <span className="proxy-status-badge live">
                                🟢 SỐNG {p.latencyMs ? `(${p.latencyMs}ms)` : ''}
                              </span>
                            )}

                            <span className={`proxy-protocol-badge ${protocolType}`}>
                              {p.type || 'SOCKS5'}
                            </span>
                          </div>

                          <div className="proxy-item-host">
                            {p.host}:{p.port} {p.username ? `(User: ${p.username})` : ''}
                          </div>

                          {/* Error / Last check reason if expired */}
                          {isExpired && p.errorReason && (
                            <div className="proxy-item-error">
                              ⚠️ {p.errorReason}
                            </div>
                          )}
                        </div>

                        <div className="proxy-item-actions">
                          <div className="text-right">
                            <span className={`proxy-online-badge ${isFull ? 'full' : (p.onlineCount > 0 ? 'active' : 'empty')}`}>
                              Online: {p.onlineCount || 0} / 6
                            </span>
                            <div className="proxy-assigned-text">
                              Gán: {p.totalAssigned || 0} nick
                            </div>
                          </div>

                          <div className="proxy-btn-group">
                            <button
                              type="button"
                              className={`btn btn-sm ${isExpired ? 'btn-warning' : 'btn-secondary'}`}
                              onClick={() => handleTestProxy(p.id, p.name)}
                              disabled={isTestingThis}
                              title="Kiểm tra kết nối và auth của Proxy"
                            >
                              {isTestingThis ? '⏳ Test...' : (isExpired ? '🔄 Test lại' : '🔍 Test')}
                            </button>
                            <button
                              type="button"
                              className="btn btn-sm btn-secondary"
                              onClick={() => openEditForm(p)}
                              title="Chỉnh sửa Proxy"
                            >
                              ✏️ Sửa
                            </button>
                            <button
                              type="button"
                              className="btn btn-sm btn-danger"
                              onClick={() => handleDelete(p.id, p.name)}
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
            <div className="card-glass form-box-container">
              <div className="form-box-header">
                <h4 className="form-box-title">
                  {editingProxy ? '✏️ Chỉnh Sửa Thông Tin Proxy' : '➕ Nhập Thông Tin Proxy Mới'}
                </h4>
                <button type="button" className="btn btn-sm btn-secondary" onClick={backToList}>
                  ⬅️ Quay lại danh sách
                </button>
              </div>

              <form onSubmit={handleSubmit}>
                <div className="form-grid-2col">
                  <div className="form-group grid-col-span-2">
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
                    <label className="form-label">Host / IP <span className="text-danger">*</span>:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="VD: 171.241.76.244 hoặc vn.proxy.com"
                      value={host}
                      onChange={(e) => setHost(e.target.value)}
                      required
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Cổng Port <span className="text-danger">*</span>:</label>
                    <input
                      type="number"
                      className="form-control"
                      placeholder="VD: 1080, 52686"
                      value={port}
                      onChange={(e) => setPort(e.target.value)}
                      min="1"
                      max="65535"
                      required
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Tài khoản (Username nếu có):</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="Bỏ trống nếu không có"
                      value={username}
                      onChange={(e) => setUsername(e.target.value)}
                    />
                  </div>

                  <div className="form-group">
                    <label className="form-label">Mật khẩu (Password nếu có):</label>
                    <input
                      type="password"
                      className="form-control"
                      placeholder="Bỏ trống nếu không có"
                      value={password}
                      onChange={(e) => setPassword(e.target.value)}
                    />
                  </div>
                </div>

                <div className="form-actions-end">
                  <button type="button" className="btn btn-secondary" onClick={backToList}>
                    Hủy Bỏ
                  </button>
                  <button type="submit" className="btn btn-primary" disabled={loading}>
                    {loading ? 'Đang lưu...' : (editingProxy ? 'Cập Nhật Proxy' : 'Lưu Proxy')}
                  </button>
                </div>
              </form>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
