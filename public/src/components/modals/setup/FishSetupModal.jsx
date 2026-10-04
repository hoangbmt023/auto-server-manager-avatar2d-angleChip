/**
 * FishSetupModal Component
 * Dedicated Center-Screen Modal for Auto Câu Cá (Auto Fish).
 * Matching the exact look & feel of FarmSetupModal and DiamondSetupModal.
 * Fully synchronized with FormCaiDatCauCa.java / AutoCauCa.java decompiled source.
 */
window.FishSetupModal = function FishSetupModal({
  account,
  allAccounts = [],
  accounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultFish = {
    mapType: 0, // 0: Cá rô, chép vàng, lòng tong; 1: Cá lóc, cá nóc, cua; 2: Cá mập, chim, đuối, ngựa
    rodType: 0, // 0: Không tự mua, 1: Mua cần VIP, 2: Mua cần Sắt, 3: Mua cần Tre
    sellFishType: 0, // 0: Bán tại chỗ, 1: Bán khu sinh thái, 2: Bỏ cá
    autoBuyTicket: true,
    backToFarm: true,
    farmIntervalMinutes: 30,
    harvestOnTime: true,
    sellKcx: false,
    sellKcxThreshold: 5,
    excludeFish: ''
  };

  const [fishState, setFishState] = React.useState({
    ...defaultFish,
    ...(account.fishSettings || {})
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

  const handleSaveFish = async (e) => {
    if (e) e.preventDefault();
    try {
      setIsSubmitting(true);
      const payload = {
        fishSettings: {
          mapType: parseInt(fishState.mapType, 10) || 0,
          rodType: parseInt(fishState.rodType, 10) || 0,
          sellFishType: parseInt(fishState.sellFishType, 10) || 0,
          autoBuyTicket: Boolean(fishState.autoBuyTicket),
          backToFarm: Boolean(fishState.backToFarm),
          farmIntervalMinutes: Math.max(1, parseInt(fishState.farmIntervalMinutes, 10) || 30),
          harvestOnTime: Boolean(fishState.harvestOnTime),
          sellKcx: Boolean(fishState.sellKcx),
          sellKcxThreshold: Math.max(1, parseInt(fishState.sellKcxThreshold, 10) || 5),
          excludeFish: String(fishState.excludeFish || '').trim()
        }
      };

      const res = await window.ApiClient.updateAccountSetup(account.id, payload);
      if (res.success) {
        if (res.account && res.account.fishSettings) {
          setFishState({
            ...defaultFish,
            ...res.account.fishSettings
          });
        }
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt Auto Câu Cá', 'error');
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
    if (sourceAcc && sourceAcc.fishSettings) {
      setFishState({ ...defaultFish, ...sourceAcc.fishSettings });
      showFeedback(`📋 Đã sao chép cấu hình Auto Câu Cá từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setFishState({ ...defaultFish });
      showFeedback(`📋 Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  const mapOptions = [
    { value: 0, label: '🐟 Map 1: Cá rô, chép vàng, lòng tong', desc: 'Khu thường, cá nhỏ dễ câu' },
    { value: 1, label: '🦀 Map 2: Cá lóc, cá nóc, cua', desc: 'Khu trung cấp, giá trị vừa' },
    { value: 2, label: '🦈 Map 3: Cá mập, chim, đuối, ngựa (VIP)', desc: 'Khu cao cấp, cá hiếm & đắt' }
  ];

  const rodOptions = [
    { value: 0, label: 'Không tự mua (Dùng cần có sẵn)' },
    { value: 1, label: '⭐ Mua Cần VIP (Tự động)' },
    { value: 2, label: '⛓️ Mua Cần Sắt (Tự động)' },
    { value: 3, label: '🎋 Mua Cần Tre (Tự động)' }
  ];

  const sellFishOptions = [
    { value: 0, label: '🏪 Bán tại chỗ', desc: 'Bán trực tiếp cho thương lái ngay trong map' },
    { value: 1, label: '🌴 Bán khu sinh thái', desc: 'Di chuyển về khu sinh thái để bán giá tốt hơn' },
    { value: 2, label: '🗑️ Bỏ cá', desc: 'Tự động thả bỏ cá theo danh sách ngoại trừ' }
  ];

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '680px', maxHeight: '88vh' }} onClick={(e) => e.stopPropagation()}>
        
        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            🎣 Cài Đặt Auto Câu Cá <span className="modal-title-acc">({account.username})</span>
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {/* Feedback Alert */}
        {feedback && (
          <div className={`alert-box alert-${feedback.type}`} style={{ margin: '14px 20px 0 20px' }}>
            {feedback.msg}
          </div>
        )}

        <form onSubmit={handleSaveFish}>
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
                    title="Sao chép toàn bộ cài đặt Auto Câu Cá của nick đã chọn"
                  >
                    📥 Sao Chép
                  </button>
                </div>
              </div>
            )}

            {/* Section 1: Bản Đồ Câu Cá */}
            <div className="farm-section-card">
              <div className="farm-sec-header">🗺️ 1. Chọn Bản Đồ Câu Cá</div>
              <div style={{ display: 'flex', flexDirection: 'column', gap: '8px', marginTop: '6px' }}>
                {mapOptions.map(opt => {
                  const isSelected = Number(fishState.mapType) === opt.value;
                  return (
                    <label
                      key={opt.value}
                      style={{
                        display: 'flex',
                        alignItems: 'center',
                        justifyContent: 'space-between',
                        padding: '10px 14px',
                        borderRadius: '8px',
                        background: isSelected ? 'rgba(56, 189, 248, 0.15)' : 'rgba(255, 255, 255, 0.03)',
                        border: isSelected ? '1px solid #38bdf8' : '1px solid rgba(255, 255, 255, 0.08)',
                        cursor: 'pointer',
                        transition: 'all 0.2s ease'
                      }}
                    >
                      <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                        <input
                          type="radio"
                          name="fishMap"
                          checked={isSelected}
                          onChange={() => setFishState({ ...fishState, mapType: opt.value })}
                          style={{ accentColor: '#38bdf8' }}
                        />
                        <span style={{ fontWeight: isSelected ? 600 : 400, color: isSelected ? '#fff' : '#cbd5e1' }}>
                          {opt.label}
                        </span>
                      </div>
                      <small style={{ color: '#94a3b8', fontSize: '0.78rem' }}>{opt.desc}</small>
                    </label>
                  );
                })}
              </div>
            </div>

            {/* Section 2: Cần Câu & Cơ Chế Bán Cá */}
            <div className="farm-section-card">
              <div className="farm-sec-header">🎣 2. Tự Mua Cần Câu & Cơ Chế Bán Cá</div>
              <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px', marginTop: '6px' }}>
                
                {/* Tự mua cần câu */}
                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#93c5fd', display: 'block', marginBottom: '6px' }}>
                    🎣 Tự Mua Cần Câu Khi Hỏng/Hết:
                  </label>
                  <select
                    className="form-control"
                    value={fishState.rodType}
                    onChange={(e) => setFishState({ ...fishState, rodType: Number(e.target.value) })}
                    style={{ width: '100%', background: '#0f172a', color: '#f8fafc', border: '1px solid #334155', borderRadius: '6px', padding: '8px 10px' }}
                  >
                    {rodOptions.map(r => (
                      <option key={r.value} value={r.value}>{r.label}</option>
                    ))}
                  </select>
                </div>

                {/* Cài đặt bán cá */}
                <div className="form-group" style={{ margin: 0 }}>
                  <label style={{ fontSize: '0.84rem', fontWeight: 600, color: '#93c5fd', display: 'block', marginBottom: '6px' }}>
                    🏪 Cách Bán / Xử Lý Cá Khi Đầy:
                  </label>
                  <select
                    className="form-control"
                    value={fishState.sellFishType}
                    onChange={(e) => setFishState({ ...fishState, sellFishType: Number(e.target.value) })}
                    style={{ width: '100%', background: '#0f172a', color: '#f8fafc', border: '1px solid #334155', borderRadius: '6px', padding: '8px 10px' }}
                  >
                    {sellFishOptions.map(s => (
                      <option key={s.value} value={s.value}>{s.label}</option>
                    ))}
                  </select>
                </div>

              </div>

              {/* Dynamic input: Danh sách cá ngoại trừ khi chọn Bỏ cá (sellFishType == 2) */}
              {Number(fishState.sellFishType) === 2 && (
                <div style={{ marginTop: '12px', padding: '12px', background: 'rgba(0,0,0,0.25)', borderRadius: '8px' }}>
                  <label style={{ fontSize: '0.82rem', fontWeight: 600, color: '#94a3b8', display: 'block', marginBottom: '4px' }}>
                    🚫 Danh sách cá ngoại trừ (Giữ lại không bỏ):
                  </label>
                  <input
                    type="text"
                    className="form-control"
                    placeholder="Ví dụ: cá rô, cá lóc, cá mập (ngăn cách bằng dấu phẩy)"
                    value={fishState.excludeFish || ''}
                    onChange={(e) => setFishState({ ...fishState, excludeFish: e.target.value })}
                    style={{ height: '36px', background: '#0f172a', color: '#38bdf8', border: '1px solid #334155', borderRadius: '6px', padding: '0 10px', fontSize: '0.85rem' }}
                  />
                  <small style={{ color: '#64748b', fontSize: '0.75rem', marginTop: '4px', display: 'block' }}>
                    Nhập tên cá muốn giữ lại, hệ thống sẽ bỏ các loại cá khác khi rương đầy.
                  </small>
                </div>
              )}
            </div>

            {/* Section 3: Tùy Chọn Tự Động & Về Nông Trại */}
            <div className="farm-section-card">
              <div className="farm-sec-header">⚡ 3. Tùy Chọn Tự Động & Về Nông Trại</div>
              <div className="farm-checkboxes-grid">
                
                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={fishState.autoBuyTicket}
                    onChange={(e) => setFishState({ ...fishState, autoBuyTicket: e.target.checked })}
                  />
                  <span>🎟️ <strong>Tự mua vé câu</strong> khi hết hạn</span>
                </label>

                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={fishState.backToFarm}
                    onChange={(e) => setFishState({ ...fishState, backToFarm: e.target.checked })}
                  />
                  <span>🌾 <strong>Tự về chăm farm</strong></span>
                </label>

                <label className="farm-checkbox-item">
                  <input
                    type="checkbox"
                    checked={fishState.sellKcx}
                    onChange={(e) => setFishState({ ...fishState, sellKcx: e.target.checked })}
                  />
                  <span>💎 <strong>Bán Kim Cương Xanh (KCX)</strong></span>
                </label>

              </div>

              {/* Dynamic fields when backToFarm is enabled */}
              {fishState.backToFarm && (
                <div style={{ marginTop: '12px', padding: '12px', background: 'rgba(56, 189, 248, 0.05)', border: '1px solid rgba(56, 189, 248, 0.2)', borderRadius: '8px', display: 'flex', flexDirection: 'column', gap: '10px' }}>
                  <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', gap: '12px' }}>
                    <label style={{ fontSize: '0.82rem', fontWeight: 600, color: '#38bdf8', margin: 0 }}>
                      ⏳ Thời gian về chăm farm (phút):
                    </label>
                    <div style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                      <input
                        type="number"
                        min="1"
                        max="720"
                        className="form-control"
                        value={fishState.farmIntervalMinutes}
                        onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                        onChange={(e) => setFishState({ ...fishState, farmIntervalMinutes: e.target.value })}
                        style={{ width: '90px', height: '32px', background: '#0f172a', color: '#38bdf8', textAlign: 'center', border: '1px solid #0284c7', borderRadius: '6px', fontWeight: 'bold' }}
                      />
                      <span style={{ fontSize: '0.8rem', color: '#94a3b8' }}>phút</span>
                    </div>
                  </div>

                  <label className="farm-checkbox-item" style={{ marginTop: '2px' }}>
                    <input
                      type="checkbox"
                      checked={fishState.harvestOnTime}
                      onChange={(e) => setFishState({ ...fishState, harvestOnTime: e.target.checked })}
                    />
                    <span>⏰ <strong>Farm thông minh:</strong> Tự động thu hoạch đúng giờ nông sản chín</span>
                  </label>
                </div>
              )}

              {/* Dynamic fields when sellKcx is enabled */}
              {fishState.sellKcx && (
                <div style={{ marginTop: '12px', padding: '12px', background: 'rgba(167, 139, 250, 0.05)', border: '1px solid rgba(167, 139, 250, 0.2)', borderRadius: '8px', display: 'flex', alignItems: 'center', justifyContent: 'space-between', gap: '12px' }}>
                  <div>
                    <label style={{ fontSize: '0.82rem', fontWeight: 600, color: '#a78bfa', margin: 0, display: 'block' }}>
                      💎 Bán KCX khi đạt số lượng:
                    </label>
                    <small style={{ color: '#94a3b8', fontSize: '0.74rem' }}>
                      Tự động di chuyển bán cho NPC khi đủ số lượng
                    </small>
                  </div>
                  <input
                    type="number"
                    min="1"
                    max="1000"
                    className="form-control"
                    value={fishState.sellKcxThreshold}
                    onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                    onChange={(e) => setFishState({ ...fishState, sellKcxThreshold: e.target.value })}
                    style={{ width: '90px', height: '32px', background: '#0f172a', color: '#a78bfa', textAlign: 'center', border: '1px solid #7c3aed', borderRadius: '6px', fontWeight: 'bold' }}
                  />
                </div>
              )}

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
              {isSubmitting ? '⏳ Đang Lưu...' : '💾 Lưu Cài Đặt Auto Fish'}
            </button>
          </div>
        </form>

      </div>
    </div>
  );
};
