/**
 * App Root Component (Application Layer)
 * Wraps providers (AppContext, ModalContext) and renders the Dashboard and Dialogs.
 */
function App() {
  const { dialog, closeDialog } = window.useModals();

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
