/**
 * DiamondSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Auto Kim Cương (KC / Đào Khoáng)
 */
const { useState: useDiamondState } = React;

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

  const [diamondState, setDiamondState] = useDiamondState({
    ...defaultDiamond,
    ...(account.diamondSettings || {})
  });

  const accountList = (allAccounts && allAccounts.length > 0) ? allAccounts : (accounts || []);
  const otherAccounts = accountList.filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = useDiamondState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [isSubmitting, setIsSubmitting] = useDiamondState(false);
  const [feedback, setFeedback] = useDiamondState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  const handleSaveDiamond = async () => {
    try {
      setIsSubmitting(true);
      const isAutoFarm = Boolean(diamondState.autoFarm);
      const payload = {
        diamondSettings: {
          sellOreOnFull: Boolean(diamondState.sellOreOnFull),
          autoFarm: isAutoFarm,
          autoDropKcx: Boolean(diamondState.autoDropKcx),
          autoDropNhb: Boolean(diamondState.autoDropNhb),
          farmIntervalMinutes: Math.max(1, parseInt(diamondState.farmIntervalMinutes, 10) || 60),
          harvestOnTime: isAutoFarm ? Boolean(diamondState.harvestOnTime) : false,
          priorityOrder: parseInt(diamondState.priorityOrder, 10) >= 0 ? parseInt(diamondState.priorityOrder, 10) : 6
        }
      };

      const res = await window.ApiClient.updateAccountSetup(account.id, payload);
      if (res.success) {
        if (window.showAlert) window.showAlert('Đã lưu cấu hình Auto Kim Cương thành công!', 'Thành Công', 'success');
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
      showFeedback(`Đã sao chép cấu hình Auto KC từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setDiamondState({ ...defaultDiamond });
      showFeedback(`Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  const priorityOptions = [
    { value: 0, label: 'Vàng', color: '#eab308' },
    { value: 1, label: 'Trắng', color: '#f8fafc' },
    { value: 2, label: 'Đỏ', color: '#ef4444' },
    { value: 3, label: 'Xanh lam', color: '#3b82f6' },
    { value: 4, label: 'Xanh lá', color: '#22c55e' },
    { value: 5, label: 'Tím', color: '#a855f7' },
    { value: 6, label: 'Tự động nhận diện', color: '#64748b' }
  ];

  return (
    <window.ModalBase
      title={`Cài Đặt Auto Kim Cương: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'} • Tùy chỉnh đào khoáng, lọc quặng và về farm`}
      icon="diamond"
      iconColor="var(--apple-purple)"
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
            onClick={handleSaveDiamond}
            style={{ gap: '6px' }}
          >
            <window.Icon name="check" size={14} />
            {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt KC'}
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

      <div style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
        {/* Toolbar: Copy from other */}
        {otherAccounts.length > 0 && (
          <div className="farm-copy-bar" style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', padding: '10px 14px', background: 'rgba(168, 85, 247, 0.08)', borderRadius: 'var(--radius-sm)', border: '1px dashed rgba(168, 85, 247, 0.3)', gap: '10px', flexWrap: 'wrap' }}>
            <div style={{ fontSize: '0.82rem', color: 'var(--apple-purple)', display: 'flex', alignItems: 'center', gap: '6px' }}>
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

        {/* Section 1: Tùy chọn Auto KC */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-purple)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="settings" size={14} /> 1. Tùy Chọn Auto Đào Khoáng (Bật / Tắt)
          </div>
          <div className="farm-checkboxes-grid" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(200px, 1fr))', gap: '10px' }}>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={diamondState.sellOreOnFull}
                onChange={(e) => setDiamondState({ ...diamondState, sellOreOnFull: e.target.checked })}
              />
              <span>Bán đá khi đầy rương</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={diamondState.autoFarm}
                onChange={(e) => {
                  const isChecked = e.target.checked;
                  setDiamondState({
                    ...diamondState,
                    autoFarm: isChecked,
                    harvestOnTime: isChecked ? diamondState.harvestOnTime : false
                  });
                }}
              />
              <span>Tự về chăm farm</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={diamondState.autoDropKcx}
                onChange={(e) => setDiamondState({ ...diamondState, autoDropKcx: e.target.checked })}
              />
              <span>Tự bỏ Kim Cương Xanh (KCX)</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={diamondState.autoDropNhb}
                onChange={(e) => setDiamondState({ ...diamondState, autoDropNhb: e.target.checked })}
              />
              <span>Tự bỏ Ngọc Huyền Bí (NHB)</span>
            </label>
          </div>
        </div>

        {/* Section 2: Farm thông minh & Chu kỳ */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-purple)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="clock" size={14} /> 2. Farm Thông Minh & Chu Kỳ Về Nông Trại
          </div>
          <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px', alignItems: 'center' }}>
            <div className="form-group" style={{ margin: 0 }}>
              <label>Thời gian về farm (phút):</label>
              <input
                type="number"
                className="form-control"
                min="1"
                max="720"
                value={diamondState.farmIntervalMinutes}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setDiamondState({ ...diamondState, farmIntervalMinutes: e.target.value })}
                placeholder="60"
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '2px', display: 'block' }}>
                Mặc định 60 phút sẽ tự về chăm sóc nông trại
              </small>
            </div>

            <div>
              <label
                className="farm-checkbox-item"
                style={{
                  marginTop: '10px',
                  opacity: diamondState.autoFarm ? 1 : 0.45,
                  cursor: diamondState.autoFarm ? 'pointer' : 'not-allowed',
                  pointerEvents: diamondState.autoFarm ? 'auto' : 'none'
                }}
              >
                <input
                  type="checkbox"
                  disabled={!diamondState.autoFarm}
                  checked={Boolean(diamondState.autoFarm && diamondState.harvestOnTime)}
                  onChange={(e) => {
                    if (diamondState.autoFarm) {
                      setDiamondState({ ...diamondState, harvestOnTime: e.target.checked });
                    }
                  }}
                />
                <span><strong>Thu hoạch đúng giờ</strong> (Farm thông minh)</span>
              </label>
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '4px', display: 'block' }}>
                {diamondState.autoFarm
                  ? 'Tự động tính giờ cây chín để về thu hoạch chính xác.'
                  : '(Yêu cầu bật "Tự về chăm farm")'}
              </small>
            </div>
          </div>
        </div>

        {/* Section 3: Thứ tự ưu tiên */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-purple)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="target" size={14} /> 3. Thứ Tự Ưu Tiên Loại Đá / Quặng
          </div>
          <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(160px, 1fr))', gap: '8px' }}>
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
                    borderRadius: 'var(--radius-sm)',
                    background: isSelected ? 'rgba(168, 85, 247, 0.18)' : 'var(--glass-panel-bg)',
                    border: isSelected ? '1px solid var(--apple-purple)' : '1px solid var(--glass-border-subtle)',
                    cursor: 'pointer',
                    transition: 'var(--transition-fast)',
                    fontSize: '0.84rem'
                  }}
                >
                  <input
                    type="radio"
                    name="diamondPriority"
                    checked={isSelected}
                    onChange={() => setDiamondState({ ...diamondState, priorityOrder: opt.value })}
                    style={{ accentColor: 'var(--apple-purple)' }}
                  />
                  <span
                    style={{
                      width: '8px',
                      height: '8px',
                      borderRadius: '50%',
                      backgroundColor: opt.color,
                      display: 'inline-block'
                    }}
                  />
                  <span style={{ fontWeight: isSelected ? 600 : 400, color: isSelected ? 'var(--text-primary)' : 'var(--text-secondary)' }}>
                    {opt.label}
                  </span>
                </label>
              );
            })}
          </div>
        </div>
      </div>
    </window.ModalBase>
  );
};
