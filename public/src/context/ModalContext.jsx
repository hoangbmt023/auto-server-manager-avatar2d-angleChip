/**
 * ModalContext (State Management Layer)
 * Centralizes state management and triggers for all modals and dialogs.
 */
const { createContext, useContext, useState, useCallback, useEffect } = React;

const ModalContext = createContext(null);

window.ModalProvider = function ModalProvider({ children }) {
  const [accountModal, setAccountModal] = useState({ open: false, editing: null });
  const [fileModal, setFileModal] = useState({ open: false, editing: null });
  const [proxyModal, setProxyModal] = useState({ open: false, initialFilter: 'all' });
  const [settingsModal, setSettingsModal] = useState({ open: false, config: null });
  const [setupModal, setSetupModal] = useState({ open: false, account: null, activeTab: 'upThue' });
  const [jreProgress, setJreProgress] = useState({ visible: false, percent: 0, message: '' });
  const [dialog, setDialog] = useState({ open: false });

  // Expose global setter for JRE progress SSE
  useEffect(() => {
    window.__setJreProgress = setJreProgress;
    return () => {
      delete window.__setJreProgress;
    };
  }, []);

  // Custom Dialog Handlers
  const showDialog = useCallback((config) => {
    setDialog({
      open: true,
      ...config
    });
  }, []);

  const closeDialog = useCallback(() => {
    setDialog(prev => ({ ...prev, open: false }));
  }, []);

  const showAlert = useCallback((message, title = 'Thông Báo Hệ Thống', type = 'info') => {
    let inferredType = type;
    const msgStr = String(message || '');
    if (msgStr.includes('❌') || msgStr.includes('HẾT HẠN') || msgStr.toLowerCase().includes('lỗi') || msgStr.toLowerCase().includes('thất bại')) {
      inferredType = 'error';
    } else if (msgStr.includes('⚠️') || msgStr.toLowerCase().includes('cảnh báo')) {
      inferredType = 'warning';
    } else if (msgStr.includes('✓') || msgStr.includes('✅') || msgStr.toLowerCase().includes('thành công')) {
      inferredType = 'success';
    }

    showDialog({
      mode: 'alert',
      type: inferredType,
      title,
      message,
      confirmText: 'Đã Hiểu'
    });
  }, [showDialog]);

  const showConfirm = useCallback((message, onConfirm, title = 'Xác Nhận Thao Tác', type = 'warning', confirmText = 'Đồng Ý', cancelText = 'Thoát') => {
    showDialog({
      mode: 'confirm',
      type,
      title,
      message,
      confirmText,
      cancelText,
      onConfirm
    });
  }, [showDialog]);

  // Backward-compatibility: Expose to window for legacy scripts/modals
  useEffect(() => {
    window.showAlert = showAlert;
    window.showConfirm = showConfirm;
    window.showDialog = showDialog;
  }, [showAlert, showConfirm, showDialog]);

  // Modal Opener Helpers
  const openAccountModal = useCallback((editing = null) => {
    setAccountModal({ open: true, editing });
  }, []);

  const closeAccountModal = useCallback(() => {
    setAccountModal({ open: false, editing: null });
  }, []);

  const openFileModal = useCallback((editing = null) => {
    setFileModal({ open: true, editing });
  }, []);

  const closeFileModal = useCallback(() => {
    setFileModal({ open: false, editing: null });
  }, []);

  const openProxyModal = useCallback((initialFilter = 'all') => {
    setProxyModal({ open: true, initialFilter });
  }, []);

  const closeProxyModal = useCallback(() => {
    setProxyModal({ open: false, initialFilter: 'all' });
  }, []);

  const openSetupModal = useCallback((account, activeTab = 'upThue') => {
    setSetupModal({ open: true, account, activeTab });
  }, []);

  const closeSetupModal = useCallback(() => {
    setSetupModal({ open: false, account: null, activeTab: 'upThue' });
  }, []);

  const openSettingsModal = useCallback(async () => {
    try {
      const data = await window.ApiClient.getConfig();
      if (data.success) {
        setSettingsModal({ open: true, config: data.config });
      }
    } catch (err) {
      showAlert('Lỗi lấy cấu hình: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  }, [showAlert]);

  const closeSettingsModal = useCallback(() => {
    setSettingsModal({ open: false, config: null });
  }, []);

  const value = {
    accountModal,
    setAccountModal,
    openAccountModal,
    closeAccountModal,
    fileModal,
    setFileModal,
    openFileModal,
    closeFileModal,
    proxyModal,
    setProxyModal,
    openProxyModal,
    closeProxyModal,
    settingsModal,
    setSettingsModal,
    openSettingsModal,
    closeSettingsModal,
    setupModal,
    setSetupModal,
    openSetupModal,
    closeSetupModal,
    jreProgress,
    setJreProgress,
    dialog,
    showDialog,
    closeDialog,
    showAlert,
    showConfirm
  };

  return <ModalContext.Provider value={value}>{children}</ModalContext.Provider>;
};

window.useModals = function useModals() {
  const ctx = useContext(ModalContext);
  if (!ctx) throw new Error('useModals must be used within a ModalProvider');
  return ctx;
};
