/**
 * ModalBase Component (Presentation Layer / Modals)
 * Reusable Porsche & Apple Minimalist Liquid Glass Modal Container
 * Portal-rendered directly onto document.body to prevent stacking context & clipping issues.
 */
window.ModalBase = function ModalBase({
  title,
  subtitle,
  icon = 'settings',
  iconColor = 'var(--apple-blue)',
  size = 'md', // sm (480px), md (640px), lg (800px), xl (960px)
  onClose,
  children,
  footer,
  className = '',
  zIndex = 9999
}) {
  const modalContent = (
    <div
      className="modal-overlay"
      style={{ zIndex }}
      onClick={(e) => {
        if (e.target === e.currentTarget && onClose) {
          onClose();
        }
      }}
    >
      <div
        className={`modal-card modal-size-${size} ${className}`}
        onClick={(e) => e.stopPropagation()}
      >
        <div className="modal-header">
          <div className="modal-title-group">
            <div className="modal-icon-badge">
              <window.Icon name={icon} size={18} color={iconColor} />
            </div>
            <div style={{ minWidth: 0 }}>
              <h3>{title}</h3>
              {subtitle && <span className="modal-subtitle">{subtitle}</span>}
            </div>
          </div>
          {onClose && (
            <button
              type="button"
              className="btn-close"
              onClick={onClose}
              title="Đóng"
            >
              <span style={{ fontSize: '1.2rem', lineHeight: 1 }}>&times;</span>
            </button>
          )}
        </div>

        <div className="modal-body">
          {children}
        </div>

        {footer && (
          <div className="modal-footer">
            {footer}
          </div>
        )}
      </div>
    </div>
  );

  if (typeof ReactDOM !== 'undefined' && ReactDOM.createPortal && document.body) {
    return ReactDOM.createPortal(modalContent, document.body);
  }
  return modalContent;
};
