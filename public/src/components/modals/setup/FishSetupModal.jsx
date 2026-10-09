/**
 * FishSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Auto Câu Cá (Auto Fish)
 */
const { useState: useFishState } = React;

window.FishSetupModal = function FishSetupModal({
  account,
  allAccounts = [],
  accounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultFish = {
    mapType: 0,
    rodType: 0,
    sellFishType: 0,
    autoBuyTicket: true,
    backToFarm: true,
    farmIntervalMinutes: 30,
    harvestOnTime: true,
    sellKcx: false,
    sellKcxThreshold: 5,
    excludeFish: ''
  };

  const [fishState, setFishState] = useFishState({
    ...defaultFish,
    ...(account.fishSettings || {})
  });

  const accountList = (allAccounts && allAccounts.length > 0) ? allAccounts : (accounts || []);
  const otherAccounts = accountList.filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = useFishState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [isSubmitting, setIsSubmitting] = useFishState(false);
  const [feedback, setFeedback] = useFishState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  const handleSaveFish = async (e) => {
    if (e) e.preventDefault();
    try {
      setIsSubmitting(true);
      const isBackToFarm = Boolean(fishState.backToFarm);
      const payload = {
        fishSettings: {
          mapType: parseInt(fishState.mapType, 10) || 0,
          rodType: parseInt(fishState.rodType, 10) || 0,
          sellFishType: parseInt(fishState.sellFishType, 10) || 0,
          autoBuyTicket: Boolean(fishState.autoBuyTicket),
          backToFarm: isBackToFarm,
          farmIntervalMinutes: Math.max(1, parseInt(fishState.farmIntervalMinutes, 10) || 30),
          harvestOnTime: isBackToFarm ? Boolean(fishState.harvestOnTime) : false,
          sellKcx: Boolean(fishState.sellKcx),
          sellKcxThreshold: Math.max(1, parseInt(fishState.sellKcxThreshold, 10) || 5),
          excludeFish: String(fishState.excludeFish || '').trim()
        }
      };

      const res = await window.ApiClient.updateAccountSetup(account.id, payload);
      if (res.success) {
        if (window.showAlert) window.showAlert('Đã lưu cấu hình Auto Câu Cá thành công!', 'Thành Công', 'success');
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
      showFeedback(`Đã sao chép cấu hình Auto Câu Cá từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setFishState({ ...defaultFish });
      showFeedback(`Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  const mapOptions = [
    { value: 0, label: 'Map 1: Cá rô, chép vàng, lòng tong', desc: 'Khu thường, cá nhỏ dễ câu' },
    { value: 1, label: 'Map 2: Cá lóc, cá nóc, cua', desc: 'Khu trung cấp, giá trị vừa' },
    { value: 2, label: 'Map 3: Cá mập, chim, đuối, ngựa (VIP)', desc: 'Khu cao cấp, cá hiếm & đắt' }
  ];

  const rodOptions = [
    { value: 0, label: 'Không tự mua (Dùng cần có sẵn)' },
    { value: 1, label: 'Mua Cần VIP (Tự động)' },
    { value: 2, label: 'Mua Cần Sắt (Tự động)' },
    { value: 3, label: 'Mua Cần Tre (Tự động)' }
  ];

  const sellFishOptions = [
    { value: 0, label: 'Bán tại chỗ', desc: 'Bán trực tiếp cho thương lái ngay trong map' },
    { value: 1, label: 'Bán khu sinh thái', desc: 'Di chuyển về khu sinh thái' },
    { value: 2, label: 'Bỏ cá', desc: 'Tự động thả bỏ cá theo danh sách ngoại trừ' }
  ];

  return (
    <window.ModalBase
      title={`Cài Đặt Auto Câu Cá: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'} • Tùy chỉnh map câu, cần câu và bán cá`}
      icon="fish"
      iconColor="var(--apple-blue)"
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
            onClick={handleSaveFish}
            style={{ gap: '6px' }}
          >
            <window.Icon name="check" size={14} />
            {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt Fish'}
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

      <form onSubmit={handleSaveFish} style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
        {/* Toolbar: Copy from other */}
        {otherAccounts.length > 0 && (
          <div className="farm-copy-bar" style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', padding: '10px 14px', background: 'rgba(56, 189, 248, 0.08)', borderRadius: 'var(--radius-sm)', border: '1px dashed rgba(56, 189, 248, 0.3)', gap: '10px', flexWrap: 'wrap' }}>
            <div style={{ fontSize: '0.82rem', color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px' }}>
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

        {/* Section 1: Bản Đồ Câu Cá */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="map-pin" size={14} /> 1. Chọn Bản Đồ Câu Cá
          </div>
          <div style={{ display: 'flex', flexDirection: 'column', gap: '8px' }}>
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
                    borderRadius: 'var(--radius-sm)',
                    background: isSelected ? 'rgba(56, 189, 248, 0.15)' : 'var(--glass-panel-bg)',
                    border: isSelected ? '1px solid var(--apple-blue)' : '1px solid var(--glass-border-subtle)',
                    cursor: 'pointer',
                    transition: 'var(--transition-fast)'
                  }}
                >
                  <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                    <input
                      type="radio"
                      name="fishMap"
                      checked={isSelected}
                      onChange={() => setFishState({ ...fishState, mapType: opt.value })}
                      style={{ accentColor: 'var(--apple-blue)' }}
                    />
                    <span style={{ fontWeight: isSelected ? 600 : 400, color: isSelected ? 'var(--text-primary)' : 'var(--text-secondary)' }}>
                      {opt.label}
                    </span>
                  </div>
                  <small style={{ color: 'var(--text-muted)', fontSize: '0.76rem' }}>{opt.desc}</small>
                </label>
              );
            })}
          </div>
        </div>

        {/* Section 2: Cần Câu & Cơ Chế Bán Cá */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="shopping-bag" size={14} /> 2. Tự Mua Cần Câu & Cơ Chế Bán Cá
          </div>
          <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '14px' }}>
            <div className="form-group" style={{ margin: 0 }}>
              <label>Tự mua cần câu khi hỏng/hết:</label>
              <select
                className="form-control"
                value={fishState.rodType}
                onChange={(e) => setFishState({ ...fishState, rodType: Number(e.target.value) })}
              >
                {rodOptions.map(r => (
                  <option key={r.value} value={r.value}>{r.label}</option>
                ))}
              </select>
            </div>

            <div className="form-group" style={{ margin: 0 }}>
              <label>Cách bán / xử lý cá khi đầy:</label>
              <select
                className="form-control"
                value={fishState.sellFishType}
                onChange={(e) => setFishState({ ...fishState, sellFishType: Number(e.target.value) })}
              >
                {sellFishOptions.map(s => (
                  <option key={s.value} value={s.value}>{s.label}</option>
                ))}
              </select>
            </div>
          </div>

          {Number(fishState.sellFishType) === 2 && (
            <div style={{ marginTop: '12px', padding: '12px', background: 'var(--glass-panel-bg)', borderRadius: 'var(--radius-sm)', border: '1px solid var(--glass-border-subtle)' }}>
              <label style={{ fontSize: '0.82rem', fontWeight: 600, color: 'var(--text-secondary)', display: 'block', marginBottom: '4px' }}>
                Danh sách cá ngoại trừ (Giữ lại không bỏ):
              </label>
              <input
                type="text"
                className="form-control"
                placeholder="Ví dụ: cá rô, cá lóc, cá mập (ngăn cách bằng dấu phẩy)"
                value={fishState.excludeFish || ''}
                onChange={(e) => setFishState({ ...fishState, excludeFish: e.target.value })}
              />
              <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '4px', display: 'block' }}>
                Nhập tên cá muốn giữ lại, bot sẽ thả các loại cá khác khi rương đầy.
              </small>
            </div>
          )}
        </div>

        {/* Section 3: Tùy Chọn Tự Động & Về Nông Trại */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="zap" size={14} /> 3. Tùy Chọn Tự Động & Về Nông Trại
          </div>
          <div className="farm-checkboxes-grid" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(200px, 1fr))', gap: '10px' }}>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={fishState.autoBuyTicket}
                onChange={(e) => setFishState({ ...fishState, autoBuyTicket: e.target.checked })}
              />
              <span>Tự mua vé câu khi hết hạn</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={fishState.backToFarm}
                onChange={(e) => {
                  const isChecked = e.target.checked;
                  setFishState({
                    ...fishState,
                    backToFarm: isChecked,
                    harvestOnTime: isChecked ? fishState.harvestOnTime : false
                  });
                }}
              />
              <span>Tự về chăm farm</span>
            </label>

            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={fishState.sellKcx}
                onChange={(e) => setFishState({ ...fishState, sellKcx: e.target.checked })}
              />
              <span>Bán Kim Cương Xanh (KCX)</span>
            </label>
          </div>

          {fishState.backToFarm && (
            <div style={{ marginTop: '12px', padding: '12px', background: 'rgba(56, 189, 248, 0.05)', border: '1px solid rgba(56, 189, 248, 0.2)', borderRadius: 'var(--radius-sm)', display: 'flex', flexDirection: 'column', gap: '10px' }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', gap: '12px' }}>
                <label style={{ fontSize: '0.82rem', fontWeight: 600, color: 'var(--apple-blue)', margin: 0 }}>
                  Thời gian về chăm farm (phút):
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
                    style={{ width: '80px', textAlign: 'center' }}
                  />
                  <span style={{ fontSize: '0.8rem', color: 'var(--text-muted)' }}>phút</span>
                </div>
              </div>

              <div>
                <label className="farm-checkbox-item" style={{ marginTop: '2px' }}>
                  <input
                    type="checkbox"
                    checked={fishState.harvestOnTime}
                    onChange={(e) => setFishState({ ...fishState, harvestOnTime: e.target.checked })}
                  />
                  <span><strong>Farm thông minh:</strong> Tự động thu hoạch đúng giờ cây chín</span>
                </label>
                <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem', marginTop: '4px', display: 'block' }}>
                  Chỉ tính cây trồng trên đất. Nếu cây chưa chín vẫn về theo chu kỳ đã đặt.
                </small>
              </div>
            </div>
          )}

          {fishState.sellKcx && (
            <div style={{ marginTop: '12px', padding: '12px', background: 'rgba(168, 85, 247, 0.05)', border: '1px solid rgba(168, 85, 247, 0.2)', borderRadius: 'var(--radius-sm)', display: 'flex', alignItems: 'center', justifyContent: 'space-between', gap: '12px' }}>
              <div>
                <label style={{ fontSize: '0.82rem', fontWeight: 600, color: 'var(--apple-purple)', margin: 0, display: 'block' }}>
                  Bán KCX khi đạt số lượng:
                </label>
                <small style={{ color: 'var(--text-muted)', fontSize: '0.74rem' }}>
                  Tự động sang NPC bán khi đạt mốc
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
                style={{ width: '80px', textAlign: 'center' }}
              />
            </div>
          )}
        </div>
      </form>
    </window.ModalBase>
  );
};
