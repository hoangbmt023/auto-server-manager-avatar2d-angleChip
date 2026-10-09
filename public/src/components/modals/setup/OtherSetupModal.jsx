/**
 * OtherSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Miscellaneous & Utilities Configuration
 */
window.OtherSetupModal = function OtherSetupModal({
  account,
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const handleSave = () => {
    if (onAccountUpdated) onAccountUpdated();
    if (onClose) onClose();
  };

  return (
    <window.ModalBase
      title={`Tiện Ích & Auto Khác: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'}`}
      icon="cpu"
      iconColor="var(--apple-blue)"
      size="sm"
      onClose={onClose}
      footer={
        <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', width: '100%' }}>
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Đóng
          </button>
          <button type="button" className="btn btn-primary" onClick={handleSave} style={{ gap: '6px' }}>
            <window.Icon name="check" size={14} /> Hoàn Tất
          </button>
        </div>
      }
    >
      <div style={{ display: 'flex', flexDirection: 'column', gap: '12px' }}>
        <div style={{ padding: '12px 14px', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-sm)', border: '1px solid var(--glass-border-subtle)' }}>
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '4px' }}>
            <window.Icon name="heart" size={16} color="var(--apple-red)" />
            <strong style={{ fontSize: '0.88rem', color: 'var(--text-primary)' }}>Tương Tác & Nhận Tim</strong>
          </div>
          <p style={{ margin: 0, fontSize: '0.78rem', color: 'var(--text-muted)' }}>
            Tự động tương tác với bạn bè, nhận tim tình bạn để gia tăng chỉ số.
          </p>
        </div>

        <div style={{ padding: '12px 14px', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-sm)', border: '1px solid var(--glass-border-subtle)' }}>
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '4px' }}>
            <window.Icon name="shield" size={16} color="var(--apple-green)" />
            <strong style={{ fontSize: '0.88rem', color: 'var(--text-primary)' }}>Chống Mất Kết Nối (Anti-Disconnect)</strong>
          </div>
          <p style={{ margin: 0, fontSize: '0.78rem', color: 'var(--text-muted)' }}>
            Duy trì kết nối mạng ổn định với server, tự động khôi phục phiên khi gặp sự cố mạng.
          </p>
        </div>
      </div>
    </window.ModalBase>
  );
};
