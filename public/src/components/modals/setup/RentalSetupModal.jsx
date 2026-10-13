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
  const [fieldErrors, setFieldErrors] = useRentalState({});

  const clearFieldError = (f) => {
    setFieldErrors(prev => {
      if (!prev || !prev[f]) return prev;
      const next = { ...prev };
      delete next[f];
      return next;
    });
  };

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
    const val = Number(targetCoinsInput);
    if (isNaN(val) || val < 0) {
      setFieldErrors({ targetCoins: 'Số xu mục tiêu phải là số nguyên >= 0!' });
      return;
    }
    setFieldErrors({});

    try {
      setIsSubmitting(true);
      const res = await window.ApiClient.updateAccountSetup(account.id, { targetCoins: val });
      if (res.success) {
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        if (res.errors && typeof res.errors === 'object') {
          setFieldErrors(res.errors);
        } else {
          showFeedback(res.message || 'Lỗi lưu cài đặt', 'error');
        }
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleSaveDays = async (e) => {
    if (e) e.preventDefault();
    const val = Number(upDaysInput);
    if (isNaN(val) || val < 0) {
      setFieldErrors({ upDays: 'Số ngày thuê phải là số nguyên >= 0!' });
      return;
    }
    setFieldErrors({});

    try {
      setIsSubmitting(true);
      const res = await window.ApiClient.updateAccountSetup(account.id, { upDays: val });
      if (res.success) {
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        if (res.errors && typeof res.errors === 'object') {
          setFieldErrors(res.errors);
        } else {
          showFeedback(res.message || 'Lỗi lưu cài đặt', 'error');
        }
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
        <div className={`alert alert-${feedback.type === 'error' ? 'danger' : 'success'}`}>
          {feedback.msg}
        </div>
      )}

      {/* Sub Tabs */}
      <div className="segmented-control" style={{ marginBottom: '16px' }}>
        <button
          type="button"
          className={`btn ${subTab === 'targetCoins' ? 'active btn-primary' : ''}`}
          onClick={() => setSubTab('targetCoins')}
        >
          <window.Icon name="target" size={13} /> Mục Tiêu Xu
        </button>
        <button
          type="button"
          className={`btn ${subTab === 'upDays' ? 'active btn-primary' : ''}`}
          onClick={() => setSubTab('upDays')}
        >
          <window.Icon name="calendar" size={13} /> Thời Hạn
        </button>
        <button
          type="button"
          className={`btn ${subTab === 'reset' ? 'active btn-danger' : ''}`}
          onClick={() => setSubTab('reset')}
        >
          <window.Icon name="refresh" size={13} /> Reset
        </button>
      </div>

      {subTab === 'targetCoins' && (
        <form onSubmit={handleSaveCoins} className="modal-form-stack">
          <div className="form-group">
            <label>Số xu mục tiêu cần up:</label>
            <input
              type="number"
              className={`form-control ${fieldErrors.targetCoins ? 'input-error' : ''}`}
              placeholder="Nhập số xu (VD: 5000000)"
              value={targetCoinsInput}
              onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
              onChange={(e) => {
                setTargetCoinsInput(e.target.value);
                clearFieldError('targetCoins');
              }}
              min="0"
              step="1000"
              autoFocus
            />
            {fieldErrors.targetCoins && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.targetCoins}</span>
              </div>
            )}
            <small className="form-helper-blue">
              {Number(targetCoinsInput) > 0 ? `Đang đặt: ${formatNumber(targetCoinsInput)} Xu` : 'Đặt 0 để không giới hạn xu'}
            </small>
          </div>
          <div className="modal-actions-end">
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button type="submit" className="btn btn-primary" disabled={isSubmitting}>
              <window.Icon name="check" size={14} />
              {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt'}
            </button>
          </div>
        </form>
      )}

      {subTab === 'upDays' && (
        <form onSubmit={handleSaveDays} className="modal-form-stack">
          <div className="form-group">
            <label>Số ngày up (Thời hạn):</label>
            <input
              type="number"
              className={`form-control ${fieldErrors.upDays ? 'input-error' : ''}`}
              placeholder="Nhập số ngày (VD: 30)"
              value={upDaysInput}
              onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
              onChange={(e) => {
                setUpDaysInput(e.target.value);
                clearFieldError('upDays');
              }}
              min="0"
              autoFocus
            />
            {fieldErrors.upDays && (
              <div className="field-error-msg">
                <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                <span>{fieldErrors.upDays}</span>
              </div>
            )}
            <small className="form-helper-blue">
              {Number(upDaysInput) > 0 ? `Thời hạn: ${upDaysInput} ngày` : 'Thời hạn: Vĩnh viễn (0)'}
            </small>
          </div>
          <div className="modal-actions-end">
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button type="submit" className="btn btn-primary" disabled={isSubmitting}>
              <window.Icon name="check" size={14} />
              {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt'}
            </button>
          </div>
        </form>
      )}

      {subTab === 'reset' && (
        <div className="modal-form-stack">
          <div className="danger-callout-box">
            <strong className="danger-callout-title">
              Xác nhận Reset số liệu up thuê?
            </strong>
            <p style={{ margin: 0, fontSize: '0.8rem', color: 'var(--text-secondary)', lineHeight: 1.4 }}>
              Thao tác này sẽ đặt lại ngày bắt đầu về hôm nay, cập nhật mốc xu ban đầu theo số dư hiện tại và đưa số xu đã cày / số tim thu hoạch về 0.
            </p>
          </div>
          <div className="modal-actions-end">
            <button type="button" className="btn btn-secondary" onClick={onClose}>Hủy</button>
            <button
              type="button"
              className="btn btn-danger"
              disabled={isSubmitting}
              onClick={handleResetData}
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
