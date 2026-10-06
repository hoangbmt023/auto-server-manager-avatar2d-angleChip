/**
 * SellOreSetupModal Component
 * Dedicated Center-Screen Modal for Auto Bán Đá (Sell Ore / Jewel).
 * Matching the exact look & feel of FarmSetupModal, DiamondSetupModal, and FishSetupModal.
 * Fully synchronized with aa.java / AutoBanDa.java decompiled source.
 */
window.SellOreSetupModal = function SellOreSetupModal({
  account,
  allAccounts = [],
  accounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultSellOre = {
    sellIntervalMinutes: 15, // Thời gian bán (phút)
    delayMs: 100, // Quãng nghỉ (ms)
    zoneFrom: 20, // Khu bán từ khu
    zoneTo: 79, // Đến khu
    resetTimeOnNhb: true, // Reset time khi bán dc NHB
    resetTimeOnKcx: false, // Reset time khi bán dc KCX
    dropNhbIfFailed: true, // Bỏ NHB nếu ko bán dc
    dropKcxIfFailed: true // Bỏ KCX nếu ko bán dc
  };

  const [sellOreState, setSellOreState] = React.useState({
    ...defaultSellOre,
    ...(account.sellOreSettings || {})
  });

  const accountList = (allAccounts && allAccounts.length > 0) ? allAccounts : (accounts || []);
  const otherAccounts = accountList.filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = React.useState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [isSubmitting, setIsSubmitting] = React.useState(false);
  const [feedback, setFeedback] = React.useState(null);

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
      showFeedback(`📋 Đã sao chép cấu hình Auto Bán Đá từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setSellOreState({ ...defaultSellOre });
      showFeedback(`📋 Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '640px', maxHeight: '88vh' }} onClick={(e) => e.stopPropagation()}>
        
        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            🪨 Cài Đặt Auto Bán Đá <span className="modal-title-acc">({account.username})</span>
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {/* Feedback Alert */}
        {feedback && (
          <div className={`alert-box alert-${feedback.type}`} style={{ margin: '14px 20px 0 20px' }}>
            {feedback.msg}
          </div>
        )}

        <form onSubmit={handleSaveSellOre}>
          {/* Body */}
          <div className="center-modal-body" style={{ display: 'flex', flexDirection: 'column', gap: '14px', maxHeight: '74vh', overflowY: 'auto' }}>
            
            {/* Toolbar: Sao Chép Cài Đặt Từ Nick Khác */}
            {otherAccounts.length > 0 && (
              <div className="farm-copy-bar">
                <div className="farm-copy-label">
                  📋 <strong>Sao Chép Cài Đặt Từ Nick Khác:</strong>
                </div>
                <div className="farm-copy-controls">
                  <select
                    className="form-control"
                    style={{ padding: '4px 8px', fontSize: '0.82rem', height: '32px' }}
                    value={copyFromId}
                    onChange={(e) => setCopyFromId(e.target.value)}
                  >
                    {otherAccounts.map(a => (
                      <option key={a.id} value={a.id}>
                        👤 {a.username} ({a.serverName || 'Hoàn Mỹ'})
                      </option>
                    ))}
                  </select>
                  <button
                    type="button"
                    className="btn btn-sm btn-secondary"
                    onClick={handleCopyFromOther}
                    title="Sao chép toàn bộ cài đặt Auto Bán Đá của nick đã chọn"
                  >
                    📥 Sao Chép
                  </button>
                </div>
              </div>
            )}

            {/* Section 1: Thời Gian & Quãng Nghỉ */}
            <div className="farm-section-card">
              <div className="farm-sec-header">⏳ 1. Thời Gian Bán & Quãng Nghỉ</div>
              <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px', marginTop: '6px' }}>
                
                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#93c5fd', display: 'block', marginBottom: '4px' }}>
                    ⏰ Thời Gian Bán (phút):
                  </label>
                  <input
                    type="number"
                    min="1"
                    max="720"
                    className="form-control"
                    value={sellOreState.sellIntervalMinutes}
                    onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                    onChange={(e) => setSellOreState({ ...sellOreState, sellIntervalMinutes: e.target.value })}
                    style={{ height: '36px', background: '#0f172a', color: '#38bdf8', border: '1px solid #334155' }}
                  />
                  <small style={{ color: '#64748b', fontSize: '0.75rem', marginTop: '2px', display: 'block' }}>
                    Mặc định: 15 phút
                  </small>
                </div>

                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#93c5fd', display: 'block', marginBottom: '4px' }}>
                    ⏱️ Quãng Nghỉ (mili-giây):
                  </label>
                  <input
                    type="number"
                    min="10"
                    max="10000"
                    step="10"
                    className="form-control"
                    value={sellOreState.delayMs}
                    onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                    onChange={(e) => setSellOreState({ ...sellOreState, delayMs: e.target.value })}
                    style={{ height: '36px', background: '#0f172a', color: '#facc15', border: '1px solid #334155' }}
                  />
                  <small style={{ color: '#64748b', fontSize: '0.75rem', marginTop: '2px', display: 'block' }}>
                    Mặc định: 100ms
                  </small>
                </div>

              </div>
            </div>

            {/* Section 2: Khu Vực Bán Đá */}
            <div className="farm-section-card">
              <div className="farm-sec-header">🚪 2. Khu Vực Bán Đá (Thợ Kim Hoàn)</div>
              <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px', marginTop: '6px' }}>
                
                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#cbd5e1', display: 'block', marginBottom: '4px' }}>
                    📍 Khu bán từ khu:
                  </label>
                  <input
                    type="number"
                    min="0"
                    max="200"
                    className="form-control"
                    value={sellOreState.zoneFrom}
                    onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                    onChange={(e) => setSellOreState({ ...sellOreState, zoneFrom: e.target.value })}
                    style={{ height: '36px', background: '#0f172a', color: '#f8fafc', border: '1px solid #334155' }}
                  />
                  <small style={{ color: '#64748b', fontSize: '0.75rem', marginTop: '2px', display: 'block' }}>
                    Mặc định: Khu 20
                  </small>
                </div>

                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#cbd5e1', display: 'block', marginBottom: '4px' }}>
                    🎯 Đến khu:
                  </label>
                  <input
                    type="number"
                    min="0"
                    max="200"
                    className="form-control"
                    value={sellOreState.zoneTo}
                    onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                    onChange={(e) => setSellOreState({ ...sellOreState, zoneTo: e.target.value })}
                    style={{ height: '36px', background: '#0f172a', color: '#f8fafc', border: '1px solid #334155' }}
                  />
                  <small style={{ color: '#64748b', fontSize: '0.75rem', marginTop: '2px', display: 'block' }}>
                    Mặc định: Khu 79
                  </small>
                </div>

              </div>
            </div>

            {/* Section 3: Tùy Chọn Bán & Reset Time */}
            <div className="farm-section-card">
              <div className="farm-sec-header">⚡ 3. Tùy Chọn Bán & Reset Thời Gian</div>
              <div className="farm-checkboxes-grid">
                
                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={sellOreState.resetTimeOnNhb}
                    onChange={(e) => setSellOreState({ ...sellOreState, resetTimeOnNhb: e.target.checked })}
                  />
                  <span>🔮 <strong>Reset time</strong> khi bán được NHB (Ngọc Huyền Bí)</span>
                </label>

                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={sellOreState.resetTimeOnKcx}
                    onChange={(e) => setSellOreState({ ...sellOreState, resetTimeOnKcx: e.target.checked })}
                  />
                  <span>💎 <strong>Reset time</strong> khi bán được KCX (Kim Cương Xanh)</span>
                </label>

                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={sellOreState.dropNhbIfFailed}
                    onChange={(e) => setSellOreState({ ...sellOreState, dropNhbIfFailed: e.target.checked })}
                  />
                  <span>🗑️ <strong>Bỏ NHB</strong> nếu không bán được</span>
                </label>

                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={sellOreState.dropKcxIfFailed}
                    onChange={(e) => setSellOreState({ ...sellOreState, dropKcxIfFailed: e.target.checked })}
                  />
                  <span>🗑️ <strong>Bỏ KCX</strong> nếu không bán được</span>
                </label>

              </div>
            </div>

          </div>

          {/* Footer */}
          <div className="center-modal-footer" style={{ padding: '12px 20px', borderTop: '1px solid rgba(255, 255, 255, 0.08)', display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
            <button
              type="button"
              className="btn btn-secondary"
              onClick={onClose}
              disabled={isSubmitting}
            >
              Đóng
            </button>
            <button
              type="submit"
              className="btn btn-primary"
              style={{ minWidth: '180px' }}
              disabled={isSubmitting}
            >
              {isSubmitting ? '⏳ Đang Lưu...' : '💾 Lưu Cài Đặt Bán Đá'}
            </button>
          </div>
        </form>

      </div>
    </div>
  );
};
