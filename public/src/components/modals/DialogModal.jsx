/**
 * DialogModal Component (Presentation Layer)
 * Custom replacement for native browser alert() and confirm() dialogs.
 * Responsive, accessible, and completely styled with CSS classes.
 */
window.DialogModal = function DialogModal({
  dialog,
  onClose
}) {
  if (!dialog || !dialog.open) return null;

  const mode = dialog.mode || 'alert';
  const type = dialog.type || (mode === 'confirm' ? 'warning' : 'info');
  const confirmText = dialog.confirmText || (mode === 'confirm' ? 'Đồng Ý' : 'Đã Hiểu');
  const cancelText = dialog.cancelText || 'Thoát';

  const getIcon = () => {
    switch (type) {
      case 'error':
      case 'danger':
        return '❌';
      case 'warning':
        return '⚠️';
      case 'success':
        return '✅';
      case 'info':
      default:
        return 'ℹ️';
    }
  };

  const getConfirmButtonClass = () => {
    switch (type) {
      case 'error':
      case 'danger':
        return 'btn btn-danger';
      case 'warning':
        return 'btn btn-warning';
      case 'success':
        return 'btn btn-success';
      case 'info':
      default:
        return 'btn btn-primary';
    }
  };

  const handleConfirm = () => {
    const fn = dialog.onConfirm;
    onClose();
    if (typeof fn === 'function') {
      try { fn(); } catch (e) {}
    }
  };

  const handleCancel = () => {
    const fn = dialog.onCancel;
    onClose();
    if (typeof fn === 'function') {
      try { fn(); } catch (e) {}
    }
  };

  return (
    <div className="dialog-overlay" onClick={handleCancel}>
      <div className="dialog-card" onClick={(e) => e.stopPropagation()}>
        <div className="dialog-header">
          <div className={`dialog-icon-badge ${type}`}>
            {getIcon()}
          </div>
          <h3 className="dialog-title">
            {dialog.title || (mode === 'confirm' ? 'Xác Nhận Thao Tác' : 'Thông Báo Hệ Thống')}
          </h3>
        </div>

        <div className="dialog-body">
          {dialog.message}
        </div>

        <div className={`dialog-actions ${mode === 'alert' ? 'single-action' : ''}`}>
          {mode === 'confirm' && (
            <button
              type="button"
              className="btn btn-secondary"
              onClick={handleCancel}
            >
              {cancelText}
            </button>
          )}
          <button
            type="button"
            className={getConfirmButtonClass()}
            onClick={handleConfirm}
            autoFocus
          >
            {confirmText}
          </button>
        </div>
      </div>
    </div>
  );
};
