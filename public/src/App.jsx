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

  // 2. Authenticated Dashboard Experience
  return (
    <React.Fragment>
      <window.DashboardPage />
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
