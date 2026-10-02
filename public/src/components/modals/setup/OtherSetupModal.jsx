/**
 * OtherSetupModal Component
 * Dedicated Center-Screen Modal for Tiện Ích & Auto Khác.
 */
window.OtherSetupModal = function OtherSetupModal({
  account,
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const [feedback, setFeedback] = React.useState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3000);
  };

  const handleSave = () => {
    if (onAccountUpdated) onAccountUpdated();
    if (onClose) onClose();
  };

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '520px' }} onClick={(e) => e.stopPropagation()}>
        <div className="center-modal-header">
          <div className="center-modal-title">
            🎮 Tiện Ích & Auto Khác <span className="modal-title-acc">({account.username})</span>
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {feedback && (
          <div className={`alert-box alert-${feedback.type}`} style={{ margin: '14px 20px 0 20px' }}>
            {feedback.msg}
          </div>
        )}

        <div className="center-modal-body">
          <div className="acc-setup-prompt">
            <span className="acc-setup-prompt-title">Cấu hình các tiện ích hỗ trợ</span>
            <span className="acc-setup-prompt-desc">Tự động tương tác bạn bè và giữ kết nối 24/7:</span>
          </div>
          <div className="mod-grid-options">
            <div className="mod-opt-card">
              <h4>💖 Auto Hôn & Tương Tác</h4>
              <p>Tự động hôn bạn bè, nhận tim tăng chỉ số tình cảm.</p>
            </div>
            <div className="mod-opt-card">
              <h4>⚡ Auto Đánh Boss & NPC</h4>
              <p>Tự động tìm NPC sự kiện và tấn công Boss khi xuất hiện.</p>
            </div>
            <div className="mod-opt-card">
              <h4>🛡️ Giữ Kết Nối / Chống Mất Kết Nối</h4>
              <p>Duy trì ping ổn định để tài khoản không bị timeout.</p>
            </div>
          </div>
          <div className="modal-actions" style={{ marginTop: '20px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
            <button type="button" className="btn btn-primary" onClick={handleSave}>
              ✅ Đồng ý
            </button>
          </div>
        </div>
      </div>
    </div>
  );
};
