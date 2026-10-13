/**
 * App Root Component (Application Layer)
 * Wraps providers (AppContext, ModalContext) and conditionally renders
 * GienPhim & Netflix AuthPage or DashboardPage based on JWT authentication.
 */
function App() {
  const { dialog, closeDialog } = window.useModals();
  const { isAuthenticated, loginUser } = window.useApp();

  // 1. If not authenticated, present the GienPhim & Netflix Cinematic Auth Screen
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
