/**
 * DiamondSetupModal Component
 * Dedicated Center-Screen Modal for Auto Kim Cương (Auto KC / Đào Khoáng).
 * Matching the exact look & feel of FarmSetupModal with modern cards, switches,
 * priority radio list, and copy settings functionality.
 */
window.DiamondSetupModal = function DiamondSetupModal({
  account,
  allAccounts = [],
  accounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultDiamond = {
    sellOreOnFull: true,
    autoFarm: true,
    autoDropKcx: false,
    autoDropNhb: false,
    farmIntervalMinutes: 60,
    harvestOnTime: true,
    priorityOrder: 6
  };

  const [diamondState, setDiamondState] = React.useState({
    ...defaultDiamond,
    ...(account.diamondSettings || {})
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

  const handleSaveDiamond = async () => {
    try {
      setIsSubmitting(true);
      const payload = {
        diamondSettings: {
          sellOreOnFull: Boolean(diamondState.sellOreOnFull),
          autoFarm: Boolean(diamondState.autoFarm),
          autoDropKcx: Boolean(diamondState.autoDropKcx),
          autoDropNhb: Boolean(diamondState.autoDropNhb),
          farmIntervalMinutes: Math.max(1, parseInt(diamondState.farmIntervalMinutes, 10) || 60),
          harvestOnTime: Boolean(diamondState.harvestOnTime),
          priorityOrder: parseInt(diamondState.priorityOrder, 10) >= 0 ? parseInt(diamondState.priorityOrder, 10) : 6
        }
      };

      const res = await window.ApiClient.updateAccountSetup(account.id, payload);
      if (res.success) {
        if (res.account && res.account.diamondSettings) {
          setDiamondState({
            ...defaultDiamond,
            ...res.account.diamondSettings
          });
        }
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt Auto KC', 'error');
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
    if (sourceAcc && sourceAcc.diamondSettings) {
      setDiamondState({ ...defaultDiamond, ...sourceAcc.diamondSettings });
      showFeedback(`📋 Đã sao chép cấu hình Auto KC từ nick [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setDiamondState({ ...defaultDiamond });
      showFeedback(`📋 Đã nạp cấu hình mặc định từ nick [${sourceAcc.username}]!`, 'success');
    }
  };

  const priorityOptions = [
    { value: 0, label: 'Vàng', color: '#eab308' },
    { value: 1, label: 'Trắng', color: '#f8fafc' },
    { value: 2, label: 'Đỏ', color: '#ef4444' },
    { value: 3, label: 'Xanh lam', color: '#3b82f6' },
    { value: 4, label: 'Xanh lá', color: '#22c55e' },
    { value: 5, label: 'Tím', color: '#a855f7' },
    { value: 6, label: 'Mặc định (Tự động nhận diện)', color: '#64748b' }
  ];

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '680px', maxHeight: '88vh' }} onClick={(e) => e.stopPropagation()}>
        
        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            💎 Cài Đặt Auto Kim Cương (KC) <span className="modal-title-acc">({account.username})</span>
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {/* Feedback Alert */}
        {feedback && (
          <div className={`alert-box alert-${feedback.type}`} style={{ margin: '14px 20px 0 20px' }}>
            {feedback.msg}
          </div>
        )}

        {/* Body */}
        <div className="center-modal-body" style={{ display: 'flex', flexDirection: 'column', gap: '14px', maxHeight: '76vh', overflowY: 'auto' }}>
          
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
                  title="Sao chép toàn bộ cài đặt Auto Kim Cương của nick đã chọn"
                >
                  📥 Sao Chép
                </button>
              </div>
            </div>
          )}

          {/* Section 1: Tùy chọn Auto KC */}
          <div className="farm-section-card">
            <div className="farm-sec-header">⚙️ 1. Tùy Chọn Auto Đào Khoáng (Bật / Tắt)</div>
            <div className="farm-checkboxes-grid">
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={diamondState.sellOreOnFull}
                  onChange={(e) => setDiamondState({ ...diamondState, sellOreOnFull: e.target.checked })}
                />
                <span>💎 Bán đá khi đầy rương</span>
              </label>

              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={diamondState.autoFarm}
                  onChange={(e) => setDiamondState({ ...diamondState, autoFarm: e.target.checked })}
                />
                <span>🌾 Tự về chăm farm</span>
              </label>

              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={diamondState.autoDropKcx}
                  onChange={(e) => setDiamondState({ ...diamondState, autoDropKcx: e.target.checked })}
                />
                <span>🗑️ Tự bỏ KCX (Kim Cương Xanh)</span>
              </label>

              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={diamondState.autoDropNhb}
                  onChange={(e) => setDiamondState({ ...diamondState, autoDropNhb: e.target.checked })}
                />
                <span>🗑️ Tự bỏ NHB (Ngọc Huyền Bí)</span>
              </label>
            </div>
          </div>

          {/* Section 2: Farm thông minh & Chu kỳ */}
          <div className="farm-section-card">
            <div className="farm-sec-header">⏰ 2. Farm Thông Minh & Chu Kỳ Về Nông Trại</div>
            <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px', alignItems: 'center' }}>
              <div className="form-group" style={{ margin: 0 }}>
                <label style={{ fontSize: '0.82rem', fontWeight: 600, display: 'block', marginBottom: '4px' }}>
                  ⏳ Thời gian về farm (phút):
                </label>
                <input
                  type="number"
                  className="form-control"
                  style={{ height: '36px' }}
                  min="1"
                  max="720"
                  value={diamondState.farmIntervalMinutes}
                  onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                  onChange={(e) => setDiamondState({ ...diamondState, farmIntervalMinutes: e.target.value })}
                  placeholder="60"
                />
                <small style={{ color: '#94a3b8', fontSize: '0.75rem', marginTop: '2px', display: 'block' }}>
                  Mặc định: 60 phút bot sẽ tự về farm chăm sóc một lần.
                </small>
              </div>

              <div style={{ paddingLeft: '8px' }}>
                <label className="farm-checkbox-item" style={{ marginTop: '10px' }}>
                  <input
                    type="checkbox"
                    checked={diamondState.harvestOnTime}
                    onChange={(e) => setDiamondState({ ...diamondState, harvestOnTime: e.target.checked })}
                  />
                  <span>✨ <strong>Thu hoạch đúng giờ</strong> (Farm thông minh)</span>
                </label>
                <small style={{ color: '#94a3b8', fontSize: '0.75rem', marginLeft: '26px', display: 'block' }}>
                  Tự động canh đúng lúc cây trồng chín để bay về thu hoạch.
                </small>
              </div>
            </div>
          </div>

          {/* Section 3: Thứ tự ưu tiên */}
          <div className="farm-section-card">
            <div className="farm-sec-header">⛏️ 3. Thứ Tự Ưu Tiên Loại Đá / Quặng</div>
            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(170px, 1fr))', gap: '8px', marginTop: '6px' }}>
              {priorityOptions.map(opt => {
                const isSelected = Number(diamondState.priorityOrder) === opt.value;
                return (
                  <label
                    key={opt.value}
                    style={{
                      display: 'flex',
                      alignItems: 'center',
                      gap: '8px',
                      padding: '8px 12px',
                      borderRadius: '8px',
                      background: isSelected ? 'rgba(59, 130, 246, 0.18)' : 'rgba(255, 255, 255, 0.03)',
                      border: isSelected ? '1px solid #3b82f6' : '1px solid rgba(255, 255, 255, 0.08)',
                      cursor: 'pointer',
                      transition: 'all 0.2s ease',
                      fontSize: '0.85rem'
                    }}
                  >
                    <input
                      type="radio"
                      name="diamondPriority"
                      checked={isSelected}
                      onChange={() => setDiamondState({ ...diamondState, priorityOrder: opt.value })}
                      style={{ accentColor: '#3b82f6' }}
                    />
                    <span
                      style={{
                        width: '10px',
                        height: '10px',
                        borderRadius: '50%',
                        backgroundColor: opt.color,
                        boxShadow: `0 0 6px ${opt.color}`
                      }}
                    />
                    <span style={{ fontWeight: isSelected ? 600 : 400, color: isSelected ? '#fff' : '#cbd5e1' }}>
                      {opt.label}
                    </span>
                  </label>
                );
              })}
            </div>
          </div>

        </div>

        {/* Footer */}
        <div className="center-modal-footer" style={{ padding: '12px 20px', borderTop: '1px solid rgba(255, 255, 255, 0.08)', display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
          <button
            type="button"
            className="btn btn-secondary"
            onClick={onClose}
          >
            Đóng
          </button>
          <button
            type="button"
            className="btn btn-primary"
            style={{ minWidth: '180px' }}
            onClick={handleSaveDiamond}
            disabled={isSubmitting}
          >
            {isSubmitting ? '⏳ Đang Lưu...' : '💾 Lưu Cài Đặt Auto KC'}
          </button>
        </div>

      </div>
    </div>
  );
};
