/**
 * RentalSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Rental Configuration:
 * - Xu Up (targetCoins)
 * - Ngày Up (upDays)
 * - Reset Dữ Liệu
 */
const { useState: useRentalState } = React;

window.RentalSetupModal = function RentalSetupModal({
  account,
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const [subTab, setSubTab] = useRentalState('targetCoins'); // 'targetCoins' | 'upDays' | 'reset'
  const [targetCoinsInput, setTargetCoinsInput] = useRentalState(account.targetCoins ? account.targetCoins : '');
  const [upDaysInput, setUpDaysInput] = useRentalState(account.upDays ? account.upDays : '');
  const [isSubmitting, setIsSubmitting] = useRentalState(false);
  const [feedback, setFeedback] = useRentalState(null);

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
        if (window.showAlert) window.showAlert('Đã lưu mục tiêu xu Up Thuê thành công!', 'Thành Công', 'success');
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
        if (window.showAlert) window.showAlert('Đã lưu số ngày Up Thuê thành công!', 'Thành Công', 'success');
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
        if (window.showAlert) window.showAlert('Đã đặt lại dữ liệu Up Thuê thành công!', 'Thành Công', 'success');
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
    <window.ModalBase
      title={`Cài Đặt Up Thuê: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'}`}
      icon="dollar-sign"
      iconColor="var(--apple-green)"
      size="sm"
      onClose={onClose}
    >
      {/* Feedback Banner */}
      {feedback && (
        <div className={`alert alert-${feedback.type === 'error' ? 'danger' : 'success'}`} style={{ marginBottom: '14px' }}>
          {feedback.msg}
        </div>
      )}

      {/* Sub Tabs */}
      <div className="segmented-control" style={{ display: 'flex', width: '100%', marginBottom: '16px' }}>
        <button
          type="button"
          className={`btn ${subTab === 'targetCoins' ? 'active btn-primary' : ''}`}
          onClick={() => setSubTab('targetCoins')}
          style={{ flex: 1, fontSize: '0.8rem', gap: '4px' }}
        >
          <window.Icon name="target" size={13} /> Mục Tiêu Xu
        </button>
        <button
          type="button"
          className={`btn ${subTab === 'upDays' ? 'active btn-primary' : ''}`}
          onClick={() => setSubTab('upDays')}
          style={{ flex: 1, fontSize: '0.8rem', gap: '4px' }}
        >
          <window.Icon name="calendar" size={13} /> Thời Hạn
        </button>
        <button
          type="button"
          className={`btn ${subTab === 'reset' ? 'active btn-danger' : ''}`}
          onClick={() => setSubTab('reset')}
          style={{ flex: 1, fontSize: '0.8rem', gap: '4px' }}
        >
          <window.Icon name="refresh" size={13} /> Reset
        </button>
      </div>

      {subTab === 'targetCoins' && (
        <form onSubmit={handleSaveCoins} style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          <div className="form-group">
            <label>Số xu mục tiêu cần up:</label>
            <input
              type="number"
              className="form-control"
              placeholder="Nhập số xu (VD: 5000000)"
              value={targetCoinsInput}
              onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
              onChange={(e) => setTargetCoinsInput(e.target.value)}
              min="0"
              step="1000"
              autoFocus
            />
            <small style={{ color: 'var(--apple-blue)', marginTop: '4px', display: 'block' }}>
              {Number(targetCoinsInput) > 0 ? `Đang đặt: ${formatNumber(targetCoinsInput)} Xu` : 'Đặt 0 để không giới hạn xu'}
            </small>
          </div>
          <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', marginTop: '6px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button type="submit" className="btn btn-primary" disabled={isSubmitting} style={{ gap: '6px' }}>
              <window.Icon name="check" size={14} />
              {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt'}
            </button>
          </div>
        </form>
      )}

      {subTab === 'upDays' && (
        <form onSubmit={handleSaveDays} style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          <div className="form-group">
            <label>Số ngày up (Thời hạn):</label>
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
            <small style={{ color: 'var(--apple-blue)', marginTop: '4px', display: 'block' }}>
              {Number(upDaysInput) > 0 ? `Thời hạn: ${upDaysInput} ngày` : 'Thời hạn: Vĩnh viễn (0)'}
            </small>
          </div>
          <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', marginTop: '6px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button type="submit" className="btn btn-primary" disabled={isSubmitting} style={{ gap: '6px' }}>
              <window.Icon name="check" size={14} />
              {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt'}
            </button>
          </div>
        </form>
      )}

      {subTab === 'reset' && (
        <div style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          <div style={{ background: 'rgba(255, 69, 58, 0.08)', padding: '14px 16px', borderRadius: 'var(--radius-sm)', border: '1px solid rgba(255, 69, 58, 0.25)' }}>
            <strong style={{ color: 'var(--apple-red)', display: 'block', marginBottom: '4px', fontSize: '0.88rem' }}>
              Xác nhận Reset số liệu up thuê?
            </strong>
            <p style={{ margin: 0, fontSize: '0.8rem', color: 'var(--text-secondary)', lineHeight: 1.4 }}>
              Thao tác này sẽ đặt lại ngày bắt đầu về hôm nay, cập nhật mốc xu ban đầu theo số dư hiện tại và đưa số xu đã cày / số tim thu hoạch về 0.
            </p>
          </div>
          <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', marginTop: '6px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button
              type="button"
              className="btn btn-danger"
              disabled={isSubmitting}
              onClick={handleResetData}
              style={{ gap: '6px' }}
            >
              <window.Icon name="refresh" size={14} />
              {isSubmitting ? 'Đang reset...' : 'Xác Nhận Reset'}
            </button>
          </div>
        </div>
      )}
    </window.ModalBase>
  );
};
