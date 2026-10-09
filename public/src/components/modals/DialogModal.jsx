/**
 * DialogModal Component (Presentation Layer / Alerts & Confirms)
 * Porsche & Apple Minimalist Liquid Glass Alert & Confirmation Sheets
 * Portal-rendered directly onto document.body with vector iconography
 */
window.DialogModal = function DialogModal({
  dialog,
  onClose
}) {
  if (!dialog || !dialog.open) return null;

  const mode = dialog.mode || 'alert';
  const type = dialog.type || (mode === 'confirm' ? 'warning' : 'info');
  const confirmText = dialog.confirmText || (mode === 'confirm' ? 'Đồng Ý' : 'Đã Hiểu');
  const cancelText = dialog.cancelText || 'Hủy Bỏ';

  const getIconInfo = () => {
    switch (type) {
      case 'error':
      case 'danger':
        return { name: 'alert-triangle', color: 'var(--apple-red)', bg: 'rgba(255, 69, 58, 0.15)', border: 'rgba(255, 69, 58, 0.35)' };
      case 'warning':
        return { name: 'alert-triangle', color: 'var(--apple-orange)', bg: 'rgba(255, 159, 10, 0.15)', border: 'rgba(255, 159, 10, 0.35)' };
      case 'success':
        return { name: 'check-circle', color: 'var(--apple-green)', bg: 'rgba(48, 209, 88, 0.15)', border: 'rgba(48, 209, 88, 0.35)' };
      case 'info':
      default:
        return { name: 'bot', color: 'var(--apple-blue)', bg: 'rgba(10, 132, 255, 0.15)', border: 'rgba(10, 132, 255, 0.35)' };
    }
  };

  const iconInfo = getIconInfo();

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

  const dialogContent = (
    <div className="dialog-overlay" onClick={handleCancel}>
      <div className="dialog-card" onClick={(e) => e.stopPropagation()}>
        <div className="dialog-header">
          <div
            className="dialog-icon-badge"
            style={{
              background: iconInfo.bg,
              borderColor: iconInfo.border,
              boxShadow: `0 0 20px -4px ${iconInfo.bg}`
            }}
          >
            <window.Icon name={iconInfo.name} size={24} color={iconInfo.color} strokeWidth={2.2} />
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
            style={{ gap: '6px' }}
          >
            <window.Icon name={type === 'error' || type === 'danger' ? 'trash' : 'check'} size={14} />
            {confirmText}
          </button>
        </div>
      </div>
    </div>
  );

  if (typeof ReactDOM !== 'undefined' && ReactDOM.createPortal && document.body) {
    return ReactDOM.createPortal(dialogContent, document.body);
  }
  return dialogContent;
};
