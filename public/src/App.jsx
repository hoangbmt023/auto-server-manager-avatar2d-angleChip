/**
 * App Root Component (Presentation Layer)
 * Clean Architecture compliant:
 * - Single Responsibility Principle (SRP): App acts strictly as Root Router & Provider orchestrator.
 * - Presentation Separation: Loading, Access Denied, and Admin Banner extracted into clean sub-components.
 * - Zero Inline Style Pollution: Powered 100% by Apple Liquid Glass design tokens.
 */

// 1. Session Loading Screen
function AppLoadingScreen() {
  return (
    <div className="app-loading-screen">
      <div className="app-loading-spinner" />
      <span className="app-loading-text">Hãy tận hưởng dịch vụ của chúng tôi...</span>
    </div>
  );
}

// 2. Access Denied / 404 Guard Screen
function AccessDeniedScreen({ onBack }) {
  return (
    <div className="app-access-denied">
      <div className="app-access-denied-code">404</div>
      <h2 className="app-access-denied-title">Không Tìm Thấy Trang Hoặc Bị Chặn</h2>
      <p className="app-access-denied-desc">
        Trang quản trị hệ thống chỉ dành riêng cho Quản trị viên máy chủ. Bạn không có quyền truy cập vào đường dẫn này.
      </p>
      <button type="button" className="btn btn-primary app-access-denied-btn" onClick={onBack}>
        <window.Icon name="arrow-left" size={15} />
        <span>Quay Lại Cổng Khách Hàng</span>
      </button>
    </div>
  );
}

// 3. Admin Preview Banner
function AdminPreviewBanner({ onExit }) {
  return (
    <div className="admin-preview-banner">
      <div className="admin-preview-left">
        <window.Icon name="eye" size={15} color="var(--apple-gold)" />
        <span>Chế độ xem trước Cổng Khách Hàng (Tài khoản Quản Trị Viên)</span>
      </div>
      <button type="button" className="btn btn-secondary btn-xs admin-preview-exit-btn" onClick={onExit}>
        <window.Icon name="shield" size={13} />
        <span>Về Dashboard Admin</span>
      </button>
    </div>
  );
}

// 4. Main App Routing Engine
function App() {
  const { dialog, closeDialog } = window.useModals();
  const { isAuthenticated, isAuthLoading, loginUser, currentUser } = window.useApp();
  const [currentHash, setCurrentHash] = React.useState(() => window.location.hash || '');

  React.useEffect(() => {
    const handleHashChange = () => setCurrentHash(window.location.hash || '');
    window.addEventListener('hashchange', handleHashChange);
    return () => window.removeEventListener('hashchange', handleHashChange);
  }, []);

  // Smoothly dismiss the single persistent global pre-loader once initial data is ready
  React.useEffect(() => {
    if (!isAuthLoading) {
      const loader = document.getElementById('app-global-loader');
      if (loader) {
        loader.classList.add('fade-out');
        const timer = setTimeout(() => {
          if (loader.parentNode) loader.parentNode.removeChild(loader);
        }, 400);
        return () => clearTimeout(timer);
      }
    }
  }, [isAuthLoading]);

  // 1. Loading State
  if (isAuthLoading) {
    if (typeof document !== 'undefined' && document.getElementById('app-global-loader')) {
      return null;
    }
    return <AppLoadingScreen />;
  }

  // 2. Unauthenticated State
  if (!isAuthenticated) {
    return <window.AuthPage onLoginSuccess={loginUser} />;
  }

  // 3. RBAC & View Routing
  const isAdmin = currentUser && String(currentUser.role || '').toLowerCase() === 'admin';

  // Security barrier: Regular user attempting to access admin hash
  if (!isAdmin && (currentHash === '#admin' || currentHash.startsWith('#/admin'))) {
    return <AccessDeniedScreen onBack={() => { window.location.hash = ''; }} />;
  }

  const renderDashboardView = () => {
    if (isAdmin) {
      if (currentHash === '#user-portal') {
        return (
          <React.Fragment>
            <AdminPreviewBanner onExit={() => { window.location.hash = ''; }} />
            <window.UserDashboardPage />
          </React.Fragment>
        );
      }
      return <window.DashboardPage />;
    }
    return <window.UserDashboardPage />;
  };

  return (
    <React.Fragment>
      {renderDashboardView()}
      {window.DialogModal && (
        <window.DialogModal dialog={dialog} onClose={closeDialog} />
      )}
    </React.Fragment>
  );
}

// 5. Root Provider Wrapper
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
