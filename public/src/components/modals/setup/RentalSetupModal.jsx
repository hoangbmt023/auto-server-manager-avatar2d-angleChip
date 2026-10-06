/**
 * RentalSetupModal Component
 * Dedicated Center-Screen Modal for Rental / Up Thue Configuration:
 * - 🎯 Xu Up (targetCoins)
 * - ⏳ Ngày Up (upDays)
 * - 🔄 Reset Dữ Liệu
 */
window.RentalSetupModal = function RentalSetupModal({
  account,
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const [subTab, setSubTab] = React.useState('targetCoins'); // 'targetCoins' | 'upDays' | 'reset'
  const [targetCoinsInput, setTargetCoinsInput] = React.useState(account.targetCoins ? account.targetCoins : '');
  const [upDaysInput, setUpDaysInput] = React.useState(account.upDays ? account.upDays : '');
  const [isSubmitting, setIsSubmitting] = React.useState(false);
  const [feedback, setFeedback] = React.useState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  function formatNumber(num) {
    if (num === null || num === undefined || isNaN(num)) return '0';
    return Number(num).toLocaleString('vi-VN');
  }

  const handleSaveCoins = async (e) => {
    if (e) e.preventDefault();
    try {
      setIsSubmitting(true);
      const val = Math.max(0, Number(targetCoinsInput) || 0);
      const res = await window.ApiClient.updateAccountSetup(account.id, { targetCoins: val });
      if (res.success) {
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt', 'error');
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleSaveDays = async (e) => {
    if (e) e.preventDefault();
    try {
      setIsSubmitting(true);
      const val = Math.max(0, Number(upDaysInput) || 0);
      const res = await window.ApiClient.updateAccountSetup(account.id, { upDays: val });
      if (res.success) {
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt', 'error');
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleResetData = async () => {
    try {
      setIsSubmitting(true);
      const res = await window.ApiClient.resetAccountData(account.id);
      if (res.success) {
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi reset dữ liệu', 'error');
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '520px' }} onClick={(e) => e.stopPropagation()}>

        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            💰 Cài Đặt Up Thuê <span className="modal-title-acc">({account.username})</span>
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {/* Feedback */}
        {feedback && (
          <div className={`alert-box alert-${feedback.type}`} style={{ margin: '14px 20px 0 20px' }}>
            {feedback.msg}
          </div>
        )}

        {/* Body */}
        <div className="center-modal-body">
          <div className="acc-setup-tabs">
            <button
              type="button"
              className={`acc-setup-tab-btn ${subTab === 'targetCoins' ? 'active' : ''}`}
              onClick={() => setSubTab('targetCoins')}
            >
              🎯 Cài Đặt Xu Up
            </button>
            <button
              type="button"
              className={`acc-setup-tab-btn ${subTab === 'upDays' ? 'active' : ''}`}
              onClick={() => setSubTab('upDays')}
            >
              ⏳ Cài Đặt Ngày Up
            </button>
            <button
              type="button"
              className={`acc-setup-tab-btn ${subTab === 'reset' ? 'active' : ''}`}
              onClick={() => setSubTab('reset')}
            >
              🔄 Reset Dữ Liệu
            </button>
          </div>

          {subTab === 'targetCoins' && (
            <form onSubmit={handleSaveCoins}>
              <div className="acc-setup-prompt">
                <span className="acc-setup-prompt-title">Nhập số xu cần up:</span>
                <span className="acc-setup-prompt-desc">
                  (Nhập số xu mục tiêu. Khi đạt mốc này, bot sẽ dừng hoặc thông báo. Để <strong>0</strong> để không giới hạn)
                </span>
              </div>
              <div className="form-group" style={{ marginBottom: '16px' }}>
                <input
                  type="number"
                  className="form-control"
                  placeholder="Nhập số xu (VD: 5000000)"
                  value={targetCoinsInput}
                  onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                  onChange={(e) => setTargetCoinsInput(e.target.value)}
                  min="0"
                  step="100"
                  autoFocus
                />
                <div style={{ marginTop: '6px', fontSize: '0.8rem', color: '#60a5fa' }}>
                  {Number(targetCoinsInput) > 0 ? `Đang đặt: ${formatNumber(targetCoinsInput)} Xu` : 'Không giới hạn xu'}
                </div>
              </div>
              <div className="modal-actions">
                <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
                <button type="submit" className="btn btn-primary" disabled={isSubmitting}>
                  {isSubmitting ? 'Đang lưu...' : '✅ Đồng ý'}
                </button>
              </div>
            </form>
          )}

          {subTab === 'upDays' && (
            <form onSubmit={handleSaveDays}>
              <div className="acc-setup-prompt">
                <span className="acc-setup-prompt-title">Nhập số ngày up:</span>
                <span className="acc-setup-prompt-desc">
                  (Số ngày treo nick. Để <strong>0</strong> nếu muốn up <strong>Vĩnh viễn</strong>)
                </span>
              </div>
              <div className="form-group" style={{ marginBottom: '16px' }}>
                <input
                  type="number"
                  className="form-control"
                  placeholder="Nhập số ngày (VD: 30)"
                  value={upDaysInput}
                  onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                  onChange={(e) => setUpDaysInput(e.target.value)}
                  min="0"
                  autoFocus
                />
                <div style={{ marginTop: '6px', fontSize: '0.8rem', color: '#60a5fa' }}>
                  {Number(upDaysInput) > 0 ? `Thời hạn: ${upDaysInput} ngày` : 'Thời hạn: Vĩnh viễn'}
                </div>
              </div>
              <div className="modal-actions">
                <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
                <button type="submit" className="btn btn-primary" disabled={isSubmitting}>
                  {isSubmitting ? 'Đang lưu...' : '✅ Đồng ý'}
                </button>
              </div>
            </form>
          )}

          {subTab === 'reset' && (
            <div>
              <div className="acc-setup-prompt">
                <span className="acc-setup-prompt-title" style={{ color: '#f87171' }}>⚠️ Xác nhận Reset dữ liệu Up Thuê?</span>
                <span className="acc-setup-prompt-desc">
                  Thao tác này sẽ đặt lại ngày bắt đầu up về hôm nay, đưa mốc xu ban đầu về số dư hiện tại, xóa số xu đã cày và số tim thu hoạch về 0.
                </span>
              </div>
              <div className="modal-actions" style={{ marginTop: '20px' }}>
                <button type="button" className="btn btn-secondary" onClick={onClose}>Không</button>
                <button
                  type="button"
                  className="btn btn-danger"
                  disabled={isSubmitting}
                  onClick={handleResetData}
                >
                  {isSubmitting ? 'Đang reset...' : '✅ Đồng ý Reset'}
                </button>
              </div>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
