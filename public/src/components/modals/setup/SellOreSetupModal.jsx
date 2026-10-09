/**
 * SellOreSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Auto Bán Đá (Sell Ore / Jewel)
 */
const { useState: useSellOreState } = React;

window.SellOreSetupModal = function SellOreSetupModal({
  account,
  allAccounts = [],
  accounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultSellOre = {
    sellIntervalMinutes: 15,
    delayMs: 100,
    zoneFrom: 20,
    zoneTo: 79,
    resetTimeOnNhb: true,
    resetTimeOnKcx: false,
    dropNhbIfFailed: true,
    dropKcxIfFailed: true
  };

  const [sellOreState, setSellOreState] = useSellOreState({
    ...defaultSellOre,
    ...(account.sellOreSettings || {})
  });

  const accountList = (allAccounts && allAccounts.length > 0) ? allAccounts : (accounts || []);
  const otherAccounts = accountList.filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = useSellOreState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [isSubmitting, setIsSubmitting] = useSellOreState(false);
  const [feedback, setFeedback] = useSellOreState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  const handleSaveSellOre = async (e) => {
    if (e) e.preventDefault();
    try {
      setIsSubmitting(true);
      const payload = {
        sellOreSettings: {
          sellIntervalMinutes: Math.max(1, parseInt(sellOreState.sellIntervalMinutes, 10) || 15),
          delayMs: Math.max(1, parseInt(sellOreState.delayMs, 10) || 100),
          zoneFrom: Math.max(0, parseInt(sellOreState.zoneFrom, 10) || 20),
          zoneTo: Math.max(0, parseInt(sellOreState.zoneTo, 10) || 79),
          resetTimeOnNhb: Boolean(sellOreState.resetTimeOnNhb),
          resetTimeOnKcx: Boolean(sellOreState.resetTimeOnKcx),
          dropNhbIfFailed: Boolean(sellOreState.dropNhbIfFailed),
          dropKcxIfFailed: Boolean(sellOreState.dropKcxIfFailed)
        }
      };

      const res = await window.ApiClient.updateAccountSetup(account.id, payload);
      if (res.success) {
        if (window.showAlert) window.showAlert('Đã lưu cấu hình Bán Đá thành công!', 'Thành Công', 'success');
        if (res.account && res.account.sellOreSettings) {
          setSellOreState({
            ...defaultSellOre,
            ...res.account.sellOreSettings
          });
        }
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt Auto Bán Đá', 'error');
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleCopyFromOther = () => {
    if (!copyFromId) return;
    const sourceAcc = accountList.find(a => a.id === copyFromId);
    if (sourceAcc && sourceAcc.sellOreSettings) {
      setSellOreState({ ...defaultSellOre, ...sourceAcc.sellOreSettings });
      showFeedback(`Đã sao chép cấu hình Auto Bán Đá từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setSellOreState({ ...defaultSellOre });
      showFeedback(`Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  return (
    <window.ModalBase
      title={`Cài Đặt Auto Bán Đá: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'} • Tùy chỉnh khu vực bán, thời gian & xử lý khoáng sản`}
      icon="hard-drive"
      iconColor="var(--apple-orange)"
      size="md"
      onClose={onClose}
      footer={
        <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%', alignItems: 'center' }}>
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Đóng
          </button>
          <button
            type="button"
            className="btn btn-primary"
            disabled={isSubmitting}
            onClick={handleSaveSellOre}
            style={{ gap: '6px' }}
          >
            <window.Icon name="check" size={14} />
            {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt Bán Đá'}
          </button>
        </div>
      }
    >
      {/* Feedback Alert */}
      {feedback && (
        <div className={`alert alert-${feedback.type === 'error' ? 'danger' : 'success'}`} style={{ marginBottom: '14px' }}>
          {feedback.msg}
        </div>
      )}

      <form onSubmit={handleSaveSellOre} style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
        {/* Toolbar: Copy from other */}
        {otherAccounts.length > 0 && (
          <div className="farm-copy-bar" style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', padding: '10px 14px', background: 'rgba(255, 149, 0, 0.08)', borderRadius: 'var(--radius-sm)', border: '1px dashed rgba(255, 149, 0, 0.3)', gap: '10px', flexWrap: 'wrap' }}>
            <div style={{ fontSize: '0.82rem', color: 'var(--apple-orange)', display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="copy" size={14} />
              <strong>Sao Chép Cài Đặt Từ Nick Khác:</strong>
            </div>
            <div style={{ display: 'flex', alignItems: 'center', gap: '8px', flex: 1, justifyContent: 'flex-end', minWidth: '240px' }}>
              <select
                className="form-control"
                style={{ padding: '4px 8px', fontSize: '0.82rem', height: '32px', flex: 1, maxWidth: '240px' }}
                value={copyFromId}
                onChange={(e) => setCopyFromId(e.target.value)}
              >
                {otherAccounts.map(a => (
                  <option key={a.id} value={a.id}>
                    {a.username} ({a.serverName || 'Hoàn Mỹ'})
                  </option>
                ))}
              </select>
              <button
                type="button"
                className="btn btn-sm btn-secondary"
                onClick={handleCopyFromOther}
                title="Sao chép cài đặt"
                style={{ gap: '4px' }}
              >
                <window.Icon name="download" size={12} /> Sao Chép
              </button>
            </div>
          </div>
        )}

        {/* Section 1: Thời Gian & Quãng Nghỉ */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-orange)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="clock" size={14} /> 1. Thời Gian Bán & Quãng Nghỉ
          </div>
          <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px' }}>
            <div className="form-group" style={{ margin: 0 }}>
              <label>Thời gian bán (phút):</label>
              <input
                type="number"
                min="1"
                max="720"
                className="form-control"
                value={sellOreState.sellIntervalMinutes}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setSellOreState({ ...sellOreState, sellIntervalMinutes: e.target.value })}
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '2px', display: 'block' }}>
                Mặc định: 15 phút
              </small>
            </div>

            <div className="form-group" style={{ margin: 0 }}>
              <label>Quãng nghỉ (ms):</label>
              <input
                type="number"
                min="10"
                max="10000"
                step="10"
                className="form-control"
                value={sellOreState.delayMs}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setSellOreState({ ...sellOreState, delayMs: e.target.value })}
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '2px', display: 'block' }}>
                Mặc định: 100ms
              </small>
            </div>
          </div>
        </div>

        {/* Section 2: Khu Vực Bán Đá */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-orange)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="map-pin" size={14} /> 2. Khu Vực Bán Đá (Thợ Kim Hoàn)
          </div>
          <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px' }}>
            <div className="form-group" style={{ margin: 0 }}>
              <label>Khu bán từ khu:</label>
              <input
                type="number"
                min="0"
                max="200"
                className="form-control"
                value={sellOreState.zoneFrom}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setSellOreState({ ...sellOreState, zoneFrom: e.target.value })}
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '2px', display: 'block' }}>
                Mặc định: Khu 20
              </small>
            </div>

            <div className="form-group" style={{ margin: 0 }}>
              <label>Đến khu:</label>
              <input
                type="number"
                min="0"
                max="200"
                className="form-control"
                value={sellOreState.zoneTo}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setSellOreState({ ...sellOreState, zoneTo: e.target.value })}
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '2px', display: 'block' }}>
                Mặc định: Khu 79
              </small>
            </div>
          </div>
        </div>

        {/* Section 3: Tùy Chọn Bán & Reset Time */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-orange)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="zap" size={14} /> 3. Tùy Chọn Bán & Reset Thời Gian
          </div>
          <div className="farm-checkboxes-grid" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(200px, 1fr))', gap: '10px' }}>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={sellOreState.resetTimeOnNhb}
                onChange={(e) => setSellOreState({ ...sellOreState, resetTimeOnNhb: e.target.checked })}
              />
              <span>Reset time khi bán được NHB</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={sellOreState.resetTimeOnKcx}
                onChange={(e) => setSellOreState({ ...sellOreState, resetTimeOnKcx: e.target.checked })}
              />
              <span>Reset time khi bán được KCX</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={sellOreState.dropNhbIfFailed}
                onChange={(e) => setSellOreState({ ...sellOreState, dropNhbIfFailed: e.target.checked })}
              />
              <span>Bỏ NHB nếu không bán được</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={sellOreState.dropKcxIfFailed}
                onChange={(e) => setSellOreState({ ...sellOreState, dropKcxIfFailed: e.target.checked })}
              />
              <span>Bỏ KCX nếu không bán được</span>
            </label>
          </div>
        </div>
      </form>
    </window.ModalBase>
  );
};
