/**
 * App Root Component (Application Layer)
 * Wraps providers (AppContext, ModalContext) and conditionally renders
 * Modern AuthPage or DashboardPage based on JWT authentication.
 */
function App() {
  const { dialog, closeDialog } = window.useModals();
  const { isAuthenticated, isAuthLoading, loginUser } = window.useApp();

  // 0. Initial Session Silent Refresh in progress
  if (isAuthLoading) {
    return (
      <div style={{
        minHeight: '100vh',
        background: '#141414',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        flexDirection: 'column',
        gap: '16px',
        color: '#8c8c8c'
      }}>
        <div style={{
          width: '42px',
          height: '42px',
          border: '3px solid rgba(229, 9, 20, 0.2)',
          borderTopColor: '#e50914',
          borderRadius: '50%',
          animation: 'spin 0.8s linear infinite'
        }} />
        <span style={{ fontSize: '13px', letterSpacing: '0.5px' }}>Đang kết nối phiên bảo mật...</span>
      </div>
    );
  }

  // 1. If not authenticated, present the Modern Cinematic Auth Screen
  if (!isAuthenticated) {
    return <window.AuthPage onLoginSuccess={loginUser} />;
  }

  // 2. Authenticated Dashboard Experience (RBAC Separation)
  const [currentHash, setCurrentHash] = React.useState(() => window.location.hash || '');

  React.useEffect(() => {
    const handleHashChange = () => setCurrentHash(window.location.hash || '');
    window.addEventListener('hashchange', handleHashChange);
    return () => window.removeEventListener('hashchange', handleHashChange);
  }, []);

  const isAdmin = currentUser && String(currentUser.role || '').toLowerCase() === 'admin';

  // Security barrier: Regular user trying to access admin dashboard URL
  if (!isAdmin && (currentHash === '#admin' || currentHash.startsWith('#/admin'))) {
    return (
      <div style={{
        minHeight: '100vh',
        background: '#0d0d0d',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        flexDirection: 'column',
        gap: '16px',
        color: '#f5f5f7',
        textAlign: 'center',
        padding: '24px'
      }}>
        <div style={{
          fontSize: '4.5rem',
          fontWeight: 800,
          background: 'linear-gradient(135deg, #ff453a, #ff9f0a)',
          WebkitBackgroundClip: 'text',
          WebkitTextFillColor: 'transparent',
          lineHeight: 1
        }}>
          404
        </div>
        <h2 style={{ fontSize: '1.4rem', margin: 0, fontWeight: 700 }}>Không Tìm Thấy Trang Hoặc Bị Chặn</h2>
        <p style={{ fontSize: '0.88rem', color: '#86868b', maxWidth: '440px', margin: 0 }}>
          Trang quản trị hệ thống chỉ dành riêng cho Quản trị viên máy chủ. Bạn không có quyền truy cập vào đường dẫn này.
        </p>
        <button
          type="button"
          className="btn btn-primary"
          style={{ marginTop: '8px' }}
          onClick={() => { window.location.hash = ''; }}
        >
          Quay Lại Cổng Khách Hàng
        </button>
      </div>
    );
  }

  // Admin view or User view
  const renderDashboard = () => {
    if (isAdmin) {
      // Admin previewing User Portal via hash
      if (currentHash === '#user-portal') {
        return (
          <>
            <div style={{
              background: 'rgba(255, 159, 10, 0.15)',
              borderBottom: '1px solid rgba(255, 159, 10, 0.3)',
              padding: '6px 16px',
              fontSize: '0.78rem',
              color: 'var(--apple-gold)',
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'space-between',
              fontWeight: 600
            }}>
              <span>👁️ Chế độ xem trước Cổng Khách Hàng (Tài khoản Quản Trị Viên)</span>
              <button
                type="button"
                className="btn btn-secondary btn-xs"
                onClick={() => { window.location.hash = ''; }}
              >
                Về Dashboard Admin
              </button>
            </div>
            <window.UserDashboardPage />
          </>
        );
      }
      return <window.DashboardPage />;
    }

    // Default User Portal for regular users
    return <window.UserDashboardPage />;
  };

  return (
    <React.Fragment>
      {renderDashboard()}
      {window.DialogModal && (
        <window.DialogModal
          dialog={dialog}
          onClose={closeDialog}
        />
      )}
    </React.Fragment>
  );
}

function Root() {
  return (
    <window.AppProvider>
      <window.ModalProvider>
        <App />
      </window.ModalProvider>
    </window.AppProvider>
  );
}

// Mount React Root
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Root />);
