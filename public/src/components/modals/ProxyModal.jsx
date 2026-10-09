/**
 * ProxyModal & ProxyFormModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Proxy Manager
 * Realtime Health Check, Expiration Flags, and Status Filtering.
 * Main List view with dedicated standalone popup box modal for Add / Edit.
 */
const { useState: useProxyModalState, useEffect: useProxyModalEffect } = React;

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
  const [error, setError] = useProxyModalState('');
  const [loading, setLoading] = useProxyModalState(false);

  const handleSubmit = async (e) => {
    if (e) e.preventDefault();
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
        id: proxy ? proxy.id : undefined,
        name: name.trim() || `${type.toUpperCase()} (${host.trim()}:${pNum})`,
        type,
        host: host.trim(),
        port: pNum,
        username: username.trim(),
        password: password.trim()
      });
      if (onSaved) onSaved();
      if (onClose) onClose();
    } catch (err) {
      setError(err.message || 'Lỗi khi lưu proxy!');
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
        <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', width: '100%' }}>
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Hủy Bỏ
          </button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit} disabled={loading} style={{ gap: '6px' }}>
            <window.Icon name="check" size={14} />
            {loading ? 'Đang lưu...' : (isEditing ? 'Cập Nhật Proxy' : 'Lưu Proxy')}
          </button>
        </div>
      }
    >
      {error && <div className="alert alert-danger" style={{ marginBottom: '14px' }}>{error}</div>}

      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '16px' }}>
        <div className="form-group">
          <label>Tên gợi nhớ Proxy:</label>
          <input
            type="text"
            className="form-control"
            placeholder="VD: Proxy SOCKS5 VN 1, Proxy Xoay..."
            value={name}
            onChange={(e) => setName(e.target.value)}
            autoFocus
          />
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Giao thức (Type):</label>
            <select className="form-control" value={type} onChange={(e) => setType(e.target.value)}>
              <option value="socks">SOCKS5 / SOCKS4</option>
              <option value="http">HTTP / HTTPS</option>
            </select>
          </div>

          <div className="form-group">
            <label>Cổng Port <span style={{ color: 'var(--apple-red)' }}>*</span>:</label>
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
        </div>

        <div className="form-group">
          <label>Host / IP <span style={{ color: 'var(--apple-red)' }}>*</span>:</label>
          <input
            type="text"
            className="form-control"
            placeholder="VD: 171.241.76.244 hoặc vn.proxy.com"
            value={host}
            onChange={(e) => setHost(e.target.value)}
            required
          />
        </div>

        <div className="form-row">
          <div className="form-group">
            <label>Tài khoản (Username):</label>
            <input
              type="text"
              className="form-control"
              placeholder="Bỏ trống nếu không có"
              value={username}
              onChange={(e) => setUsername(e.target.value)}
            />
          </div>

          <div className="form-group">
            <label>Mật khẩu (Password):</label>
            <input
              type="password"
              className="form-control"
              placeholder="Bỏ trống nếu không có"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
            />
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
  proxies = [],
  onSaveProxy,
  onDeleteProxy,
  initialFilter = 'all',
  onRefreshProxies
}) {
  const [filter, setFilter] = useProxyModalState(initialFilter || 'all'); // 'all' | 'active' | 'expired'
  const [editingProxy, setEditingProxy] = useProxyModalState(null);
  const [showFormModal, setShowFormModal] = useProxyModalState(false);

  const [testingId, setTestingId] = useProxyModalState(null);
  const [testingAll, setTestingAll] = useProxyModalState(false);
  const [testNotice, setTestNotice] = useProxyModalState(null); // { type: 'success'|'error'|'info', text: '' }

  useProxyModalEffect(() => {
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
      if (res.success) {
        setTestNotice({
          type: 'success',
          text: `Proxy [${pName}]: ${res.message || 'Hoạt động tốt'}`
        });
      } else {
        setTestNotice({
          type: 'error',
          text: `Proxy [${pName}]: ${res.message || 'Không thể kết nối / Hết hạn'}`
        });
      }
      if (typeof onRefreshProxies === 'function') onRefreshProxies();
    } catch (err) {
      setTestNotice({ type: 'error', text: `Lỗi kiểm tra: ${err.message}` });
    } finally {
      setTestingId(null);
    }
  };

  const handleTestAll = async () => {
    setTestingAll(true);
    setTestNotice({ type: 'info', text: 'Đang kiểm tra toàn bộ danh sách proxy...' });
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
    } finally {
      setTestingAll(false);
    }
  };

  return (
    <>
      <window.ModalBase
        title={`Quản Lý Danh Sách Proxy (${proxies.length})`}
        subtitle="Kiểm tra đường truyền, trạng thái sống/chết và gán tài khoản"
        icon="globe"
        iconColor="var(--apple-blue)"
        size="lg"
        onClose={onClose}
        footer={
          <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%', alignItems: 'center' }}>
            <div style={{ fontSize: '0.78rem', color: 'var(--text-secondary)' }}>
              Tối đa 6 nick / Proxy mạng
            </div>
            <button type="button" className="btn btn-secondary" onClick={onClose}>
              Đóng
            </button>
          </div>
        }
      >
        {/* Test Notice Banner */}
        {testNotice && (
          <div className={`proxy-test-notice ${testNotice.type}`} style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '14px' }}>
            <window.Icon
              name={testNotice.type === 'success' ? 'check-circle' : (testNotice.type === 'error' ? 'alert-triangle' : 'zap')}
              size={16}
            />
            <span style={{ flex: 1, fontSize: '0.84rem' }}>{testNotice.text}</span>
            <button
              type="button"
              className="btn-notice-close"
              onClick={() => setTestNotice(null)}
              style={{ background: 'none', border: 'none', color: 'inherit', cursor: 'pointer', fontSize: '1.1rem' }}
            >
              &times;
            </button>
          </div>
        )}

        <div style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          {/* Action & Filter Bar */}
          <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', flexWrap: 'wrap', gap: '10px' }}>
            {/* Status Filter Tabs */}
            <div className="segmented-control" style={{ display: 'flex', gap: '2px' }}>
              <button
                type="button"
                className={`btn btn-sm ${filter === 'all' ? 'active btn-primary' : ''}`}
                onClick={() => setFilter('all')}
              >
                Tất cả ({proxies.length})
              </button>
              <button
                type="button"
                className={`btn btn-sm ${filter === 'active' ? 'active btn-primary' : ''}`}
                onClick={() => setFilter('active')}
                style={{ gap: '4px' }}
              >
                <span style={{ width: '6px', height: '6px', borderRadius: '50%', background: 'var(--apple-green)', display: 'inline-block' }}></span>
                Sống ({activeCount})
              </button>
              <button
                type="button"
                className={`btn btn-sm ${filter === 'expired' ? 'active btn-danger' : ''}`}
                onClick={() => setFilter('expired')}
                style={{ gap: '4px' }}
              >
                <span style={{ width: '6px', height: '6px', borderRadius: '50%', background: 'var(--apple-red)', display: 'inline-block' }}></span>
                Lỗi ({expiredCount})
              </button>
            </div>

            <div style={{ display: 'flex', gap: '8px' }}>
              <button
                type="button"
                className="btn btn-secondary btn-sm"
                onClick={handleTestAll}
                disabled={testingAll || proxies.length === 0}
                title="Kiểm tra kết nối toàn bộ Proxy"
                style={{ gap: '6px', display: 'inline-flex', alignItems: 'center' }}
              >
                <window.Icon name="zap" size={14} color="var(--apple-orange)" />
                {testingAll ? 'Đang test...' : 'Test tất cả'}
              </button>
              <button
                type="button"
                className="btn btn-primary btn-sm"
                onClick={openCreateForm}
                style={{ gap: '6px', display: 'inline-flex', alignItems: 'center' }}
              >
                <window.Icon name="plus" size={14} /> Thêm Proxy
              </button>
            </div>
          </div>

          {/* List of Proxies */}
          {filteredProxies.length === 0 ? (
            <div className="proxy-empty-state" style={{ padding: '36px 20px', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-md)', border: '1px dashed var(--glass-border-subtle)', textAlign: 'center' }}>
              <div style={{ marginBottom: '8px' }}>
                <window.Icon name="globe" size={32} color="var(--text-tertiary)" />
              </div>
              <p style={{ margin: '0 0 12px 0', color: 'var(--text-secondary)', fontSize: '0.88rem' }}>
                {filter === 'expired'
                  ? 'Không có Proxy nào bị lỗi hoặc hết hạn.'
                  : (filter === 'active' ? 'Không có Proxy nào đang sống.' : 'Chưa có Proxy nào trong danh sách.')}
              </p>
              {filter !== 'all' ? (
                <button type="button" className="btn btn-secondary btn-sm" onClick={() => setFilter('all')}>
                  Xem tất cả Proxy
                </button>
              ) : (
                <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm} style={{ gap: '6px' }}>
                  <window.Icon name="plus" size={14} /> Thêm Proxy Đầu Tiên
                </button>
              )}
            </div>
          ) : (
            <div style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
              {filteredProxies.map(p => {
                const isFull = p.onlineCount >= 6;
                const isTestingThis = testingId === p.id;
                const isExpired = Boolean(p.isExpired);
                const protocolType = (p.type || 'socks').toLowerCase() === 'http' ? 'http' : 'socks';

                return (
                  <div
                    key={p.id}
                    style={{
                      display: 'flex',
                      alignItems: 'center',
                      justifyContent: 'space-between',
                      padding: '14px 16px',
                      background: isExpired ? 'rgba(255, 69, 58, 0.06)' : 'var(--glass-matrix-bg)',
                      borderRadius: 'var(--radius-md)',
                      border: '1px solid',
                      borderColor: isExpired ? 'rgba(255, 69, 58, 0.35)' : 'var(--glass-border-subtle)',
                      flexWrap: 'wrap',
                      gap: '12px',
                      transition: 'var(--transition-fast)'
                    }}
                  >
                    <div style={{ flex: '1 1 240px', minWidth: 0 }}>
                      <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '4px', flexWrap: 'wrap' }}>
                        <strong style={{ color: isExpired ? 'var(--apple-red)' : 'var(--text-primary)', fontSize: '0.94rem' }}>
                          {p.name}
                        </strong>

                        {isExpired ? (
                          <span style={{
                            display: 'inline-flex',
                            alignItems: 'center',
                            gap: '4px',
                            padding: '2px 7px',
                            borderRadius: '4px',
                            fontSize: '0.7rem',
                            fontWeight: 700,
                            background: 'rgba(255, 69, 58, 0.18)',
                            color: 'var(--apple-red)',
                            border: '1px solid rgba(255, 69, 58, 0.35)'
                          }}>
                            <window.Icon name="alert-triangle" size={11} /> LỖI / HẾT HẠN
                          </span>
                        ) : (
                          <span style={{
                            display: 'inline-flex',
                            alignItems: 'center',
                            gap: '4px',
                            padding: '2px 7px',
                            borderRadius: '4px',
                            fontSize: '0.7rem',
                            fontWeight: 700,
                            background: 'rgba(48, 209, 88, 0.15)',
                            color: 'var(--apple-green)',
                            border: '1px solid rgba(48, 209, 88, 0.3)'
                          }}>
                            <span style={{ width: '5px', height: '5px', borderRadius: '50%', background: 'var(--apple-green)' }}></span>
                            SỐNG {p.latencyMs ? `(${p.latencyMs}ms)` : ''}
                          </span>
                        )}

                        <span style={{
                          padding: '2px 6px',
                          borderRadius: '4px',
                          fontSize: '0.7rem',
                          fontWeight: 600,
                          textTransform: 'uppercase',
                          background: protocolType === 'socks' ? 'rgba(191, 90, 242, 0.15)' : 'rgba(255, 159, 10, 0.15)',
                          color: protocolType === 'socks' ? 'var(--apple-purple)' : 'var(--apple-orange)',
                          border: '1px solid',
                          borderColor: protocolType === 'socks' ? 'rgba(191, 90, 242, 0.3)' : 'rgba(255, 159, 10, 0.3)'
                        }}>
                          {p.type || 'SOCKS5'}
                        </span>
                      </div>

                      <div style={{ fontSize: '0.82rem', color: 'var(--text-secondary)', fontFamily: 'var(--font-mono)' }}>
                        {p.host}:{p.port} {p.username ? `(User: ${p.username})` : ''}
                      </div>

                      {isExpired && p.errorReason && (
                        <div style={{ fontSize: '0.74rem', color: 'var(--apple-red)', marginTop: '4px', fontStyle: 'italic' }}>
                          {p.errorReason}
                        </div>
                      )}
                    </div>

                    <div style={{ display: 'flex', alignItems: 'center', gap: '12px', flexShrink: 0 }}>
                      <div style={{ textAlign: 'right' }}>
                        <span style={{
                          display: 'inline-block',
                          padding: '2px 7px',
                          borderRadius: '6px',
                          fontSize: '0.74rem',
                          fontWeight: 600,
                          background: isFull ? 'rgba(255, 69, 58, 0.15)' : (p.onlineCount > 0 ? 'rgba(48, 209, 88, 0.15)' : 'var(--glass-matrix-bg)'),
                          color: isFull ? 'var(--apple-red)' : (p.onlineCount > 0 ? 'var(--apple-green)' : 'var(--text-secondary)'),
                          border: '1px solid',
                          borderColor: isFull ? 'rgba(255, 69, 58, 0.3)' : (p.onlineCount > 0 ? 'rgba(48, 209, 88, 0.3)' : 'var(--glass-border-subtle)')
                        }}>
                          Online: {p.onlineCount || 0}/6
                        </span>
                        <div style={{ fontSize: '0.72rem', color: 'var(--text-secondary)', marginTop: '2px' }}>
                          Gán: {p.totalAssigned || 0} nick
                        </div>
                      </div>

                      <div style={{ display: 'flex', gap: '6px' }}>
                        <button
                          type="button"
                          className="btn btn-sm btn-secondary"
                          onClick={() => handleTestProxy(p.id, p.name)}
                          disabled={isTestingThis}
                          title="Kiểm tra kết nối"
                          style={{ padding: '5px 8px', gap: '4px', display: 'inline-flex', alignItems: 'center' }}
                        >
                          <window.Icon name="zap" size={13} color="var(--apple-orange)" />
                          {isTestingThis ? 'Test...' : 'Test'}
                        </button>
                        <button
                          type="button"
                          className="btn btn-sm btn-secondary"
                          onClick={() => openEditForm(p)}
                          title="Sửa Proxy"
                          style={{ padding: '5px 8px' }}
                        >
                          <window.Icon name="edit" size={13} />
                        </button>
                        <button
                          type="button"
                          className="btn btn-sm btn-danger"
                          onClick={() => handleDelete(p.id, p.name)}
                          title="Xóa Proxy"
                          style={{ padding: '5px 8px' }}
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
    </>
  );
};
