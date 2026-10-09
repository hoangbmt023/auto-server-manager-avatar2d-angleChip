/**
 * FarmSetupModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass Auto Farm Configuration:
 * 1, 2, 3: Cơ chế Auto & Bổ sung giống
 * 4: Tùy chọn tự động (Checkboxes)
 * 5, 6: Vợ chồng, em bé & nâng cấp cây khế
 * 7: Cấu hình tự động bán nông sản
 * 8: Cấu hình cây trồng & món ăn dự bị
 * + Sao chép cài đặt từ tài khoản khác
 */
const { useState: useFarmState } = React;

window.FarmSetupModal = function FarmSetupModal({
  account,
  allAccounts = [],
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  const defaultFarm = {
    mode: 0, // 0: Lái buôn hỗ trợ, 1: Farm bình thường
    animal: 3, // 0: Gà, 1: Vịt, 2: Heo, 3: Không
    fish: 2, // 0: Cá, 1: Rùa, 2: Không
    harvestHearts: true,
    dailyAttendance: true,
    deliverOrders: true,
    hatchDragon: true,
    trainDragon: true,
    noBuyWithGold: true,
    buyMilkWithGold: false,
    upgradeStarfruit: true,
    feedBaby: false,
    upgradeBaby: false,
    maxStarfruitLevel: 10,
    sellProducts: '-1',
    sellThreshold: 100,
    sellQuantity: 50,
    backupSeeds: '',
    replaceSeedThreshold: 0,
    backupDishes: ''
  };

  const [farmState, setFarmState] = useFarmState({
    ...defaultFarm,
    ...(account.farmSettings || {})
  });

  const otherAccounts = (allAccounts || []).filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = useFarmState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [catalogTarget, setCatalogTarget] = useFarmState(null); // { field, label, category }
  const [isSubmitting, setIsSubmitting] = useFarmState(false);
  const [feedback, setFeedback] = useFarmState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  const handleSaveFarm = async () => {
    try {
      setIsSubmitting(true);
      const cleanedFarmState = {
        ...farmState,
        maxStarfruitLevel: farmState.maxStarfruitLevel === '' ? 10 : Number(farmState.maxStarfruitLevel),
        sellThreshold: farmState.sellThreshold === '' ? 100 : Number(farmState.sellThreshold),
        sellQuantity: farmState.sellQuantity === '' ? 50 : Number(farmState.sellQuantity),
        replaceSeedThreshold: farmState.replaceSeedThreshold === '' ? 0 : Number(farmState.replaceSeedThreshold)
      };
      const res = await window.ApiClient.updateAccountSetup(account.id, {
        farmSettings: cleanedFarmState
      });
      if (res.success) {
        if (window.showAlert) window.showAlert('Đã lưu cấu hình Auto Farm thành công!', 'Thành Công', 'success');
        if (onAccountUpdated) onAccountUpdated();
        if (onClose) onClose();
      } else {
        showFeedback(res.message || 'Lỗi lưu cài đặt Farm', 'error');
      }
    } catch (err) {
      showFeedback('Lỗi: ' + err.message, 'error');
    } finally {
      setIsSubmitting(false);
    }
  };

  const handleCopyFromOther = () => {
    if (!copyFromId) return;
    const sourceAcc = (allAccounts || []).find(a => a.id === copyFromId);
    if (sourceAcc && sourceAcc.farmSettings) {
      setFarmState({ ...defaultFarm, ...sourceAcc.farmSettings });
      showFeedback(`Đã sao chép cấu hình Auto Farm từ [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setFarmState({ ...defaultFarm });
      showFeedback(`Đã nạp cấu hình mặc định từ [${sourceAcc.username}]!`, 'success');
    }
  };

  const handleCatalogSelect = (item) => {
    if (!catalogTarget) return;
    const field = catalogTarget.field;
    const currentVal = (farmState[field] || '').trim();
    let newVal = '';
    if (!currentVal || currentVal === '-1') {
      newVal = String(item.id);
    } else {
      let parts = currentVal.split(',').map(s => s.trim()).filter(Boolean);
      if (parts.includes(String(item.id))) {
        parts = parts.filter(p => p !== String(item.id));
      } else {
        parts.push(String(item.id));
      }
      newVal = parts.join(',');
    }
    setFarmState(prev => ({
      ...prev,
      [field]: newVal
    }));
  };

  const renderItemChips = (field, category = 'plant') => {
    const val = (farmState[field] || '').trim();
    if (!val) return null;
    if (val === '-1') {
      return (
        <div style={{ display: 'flex', alignItems: 'center', gap: '6px', marginTop: '6px', fontSize: '0.78rem', color: 'var(--apple-green)' }}>
          <img src="/src/assets/farm/thuhoach.png" style={{ width: 18, height: 18, imageRendering: 'pixelated' }} alt="all" />
          <span>Đang chọn: <strong>Bán tất cả nông sản trong kho (-1)</strong></span>
        </div>
      );
    }
    const ids = val.split(',').map(s => s.trim()).filter(Boolean);
    const allItems = window.AVATAR_FARM_ITEMS || [];
    return (
      <div style={{ display: 'flex', flexWrap: 'wrap', gap: '6px', marginTop: '8px' }}>
        {ids.map(idStr => {
          const item = allItems.find(i => String(i.id) === idStr && (category === 'all' || i.category === category || (category === 'plant' && i.category === 'plant')));
          const name = item ? item.name : `ID: ${idStr}`;
          return (
            <span
              key={idStr}
              style={{
                display: 'inline-flex',
                alignItems: 'center',
                gap: '5px',
                padding: '3px 8px',
                borderRadius: '6px',
                background: 'rgba(255, 255, 255, 0.06)',
                border: '1px solid rgba(255, 255, 255, 0.1)',
                fontSize: '0.76rem',
                color: 'var(--text-primary)'
              }}
            >
              {window.FarmItemGraphic && item ? (
                <window.FarmItemGraphic item={item} size={18} />
              ) : (
                <img src="/src/assets/farm/gieohat.png" style={{ width: 14, height: 14, imageRendering: 'pixelated' }} alt="" />
              )}
              <span>{name}</span>
              <button
                type="button"
                onClick={() => {
                  const updated = ids.filter(x => x !== idStr).join(',');
                  setFarmState(prev => ({ ...prev, [field]: updated }));
                }}
                style={{ background: 'none', border: 'none', color: 'var(--text-tertiary)', cursor: 'pointer', padding: '0 2px', fontSize: '0.85rem' }}
                title="Xóa"
              >
                ×
              </button>
            </span>
          );
        })}
      </div>
    );
  };

  return (
    <window.ModalBase
      title={`Cài Đặt Auto Farm: ${account.username}`}
      subtitle={`Máy chủ ${account.serverName || 'Hoàn Mỹ'} • Tùy chỉnh nông trại, trồng trọt và gia súc`}
      icon="wheat"
      iconColor="var(--apple-green)"
      size="lg"
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
            onClick={handleSaveFarm}
            style={{ gap: '6px' }}
          >
            <window.Icon name="check" size={14} />
            {isSubmitting ? 'Đang lưu...' : 'Lưu Cài Đặt Farm'}
          </button>
        </div>
      }
    >
      {/* Feedback */}
      {feedback && (
        <div className={`alert alert-${feedback.type === 'error' ? 'danger' : 'success'}`} style={{ marginBottom: '14px' }}>
          {feedback.msg}
        </div>
      )}

      <div style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
        {/* Toolbar: Sao Chép Cài Đặt Từ Nick Khác */}
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

        {/* 1, 2 & 3: Cơ Chế Auto & Bổ Sung Giống */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="settings" size={14} /> 1, 2 & 3. Cơ Chế Auto & Bổ Sung Giống
          </div>
          <div className="farm-grid-3" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(180px, 1fr))', gap: '12px' }}>
            <div className="form-group">
              <label>1. Cơ chế Auto:</label>
              <select
                className="form-control"
                value={farmState.mode}
                onChange={(e) => setFarmState({ ...farmState, mode: Number(e.target.value) })}
              >
                <option value={0}>Lái buôn hỗ trợ (Nhanh)</option>
                <option value={1}>Farm bình thường</option>
              </select>
            </div>
            <div className="form-group">
              <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                <img
                  src={
                    farmState.animal === 0 ? '/src/assets/farm/ga.png' :
                    farmState.animal === 1 ? '/src/assets/farm/vit.png' :
                    farmState.animal === 2 ? '/src/assets/farm/heo.png' :
                    '/src/assets/farm/ban.png'
                  }
                  style={{ width: 16, height: 16, imageRendering: 'pixelated' }}
                  alt=""
                />
                <span>2. Bổ sung vật nuôi:</span>
              </label>
              <select
                className="form-control"
                value={farmState.animal}
                onChange={(e) => setFarmState({ ...farmState, animal: Number(e.target.value) })}
              >
                <option value={0}>🐔 Gà</option>
                <option value={1}>🦆 Vịt</option>
                <option value={2}>🐷 Heo</option>
                <option value={3}>⛔ Không mua thêm</option>
              </select>
            </div>
            <div className="form-group">
              <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                <img
                  src={
                    farmState.fish === 0 ? '/src/assets/farm/ca.png' :
                    farmState.fish === 1 ? '/src/assets/farm/rua.png' :
                    '/src/assets/farm/ban.png'
                  }
                  style={{ width: 16, height: 16, imageRendering: 'pixelated' }}
                  alt=""
                />
                <span>3. Bổ sung hồ cá:</span>
              </label>
              <select
                className="form-control"
                value={farmState.fish}
                onChange={(e) => setFarmState({ ...farmState, fish: Number(e.target.value) })}
              >
                <option value={0}>🐟 Cá</option>
                <option value={1}>🐢 Rùa</option>
                <option value={2}>⛔ Không mua thêm</option>
              </select>
            </div>
          </div>
        </div>

        {/* 4. Tùy Chọn Tự Động */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="check-square" size={14} /> 4. Tùy Chọn Tự Động (Bật / Tắt)
          </div>
          <div className="farm-checkboxes-grid" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(200px, 1fr))', gap: '10px' }}>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.harvestHearts}
                onChange={(e) => setFarmState({ ...farmState, harvestHearts: e.target.checked })}
              />
              <span>Thu hoạch tim</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.dailyAttendance}
                onChange={(e) => setFarmState({ ...farmState, dailyAttendance: e.target.checked })}
              />
              <span>Báo danh hàng ngày</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.deliverOrders}
                onChange={(e) => setFarmState({ ...farmState, deliverOrders: e.target.checked })}
              />
              <span>Giao đơn hàng TP</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.hatchDragon}
                onChange={(e) => setFarmState({ ...farmState, hatchDragon: e.target.checked })}
              />
              <span>Nhiệm vụ ấp rồng</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.trainDragon}
                onChange={(e) => setFarmState({ ...farmState, trainDragon: e.target.checked })}
              />
              <span>Nhiệm vụ luyện rồng</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.noBuyWithGold}
                onChange={(e) => setFarmState({ ...farmState, noBuyWithGold: e.target.checked })}
              />
              <span>Không tự mua bằng Lượng</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.buyMilkWithGold}
                onChange={(e) => setFarmState({ ...farmState, buyMilkWithGold: e.target.checked })}
              />
              <span>Mua sữa lượng khi thiếu NS</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.upgradeStarfruit}
                onChange={(e) => setFarmState({ ...farmState, upgradeStarfruit: e.target.checked })}
              />
              <span>Tự nâng cấp cây khế</span>
            </label>
          </div>
        </div>

        {/* 5 & 6. Vợ Chồng, Em Bé & Cây Khế */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="user" size={14} /> 5 & 6. Chức Năng Vợ Chồng, Em Bé & Cây Khế
          </div>
          <div className="farm-grid-3" style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(180px, 1fr))', gap: '12px', alignItems: 'center' }}>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.feedBaby}
                onChange={(e) => setFarmState({ ...farmState, feedBaby: e.target.checked })}
              />
              <span>Cho em bé ăn</span>
            </label>
            <label className="farm-checkbox-item">
              <input
                type="checkbox"
                checked={farmState.upgradeBaby}
                onChange={(e) => setFarmState({ ...farmState, upgradeBaby: e.target.checked })}
              />
              <span>Nâng cấp em bé</span>
            </label>
            <div className="form-group">
              <label>6. Nâng cây khế đến cấp:</label>
              <input
                type="number"
                className="form-control"
                value={farmState.maxStarfruitLevel}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setFarmState({ ...farmState, maxStarfruitLevel: e.target.value })}
                min="1"
                max="20"
              />
            </div>
          </div>
        </div>

        {/* 7. Bán Nông Sản Tự Động */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="dollar-sign" size={14} /> 7. Cấu Hình Tự Động Bán Nông Sản
          </div>
          <div className="form-group" style={{ marginBottom: '12px' }}>
            <label>
              Bán nông sản (Nhập <strong>-1</strong> để bán tất cả hoặc danh sách ID <code>id1,id2,...</code>):
            </label>
            <div className="farm-id-input-group" style={{ display: 'flex', gap: '8px' }}>
              <input
                type="text"
                className="form-control"
                placeholder="-1 (Tất cả) hoặc 0,1,6,30..."
                value={farmState.sellProducts}
                onChange={(e) => setFarmState({ ...farmState, sellProducts: e.target.value })}
                style={{ flex: 1 }}
              />
              <button
                type="button"
                className="btn btn-sm btn-outline"
                onClick={() => setCatalogTarget({ field: 'sellProducts', label: 'Bán Nông Sản', category: 'plant' })}
                style={{ gap: '6px', whiteSpace: 'nowrap' }}
              >
                <window.Icon name="search" size={13} /> Tra Cứu Nông Sản
              </button>
            </div>
            {renderItemChips('sellProducts', 'plant')}
          </div>
          <div className="farm-grid-2" style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '12px' }}>
            <div className="form-group">
              <label>Bán khi đạt số lượng trong kho:</label>
              <input
                type="number"
                className="form-control"
                value={farmState.sellThreshold}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setFarmState({ ...farmState, sellThreshold: e.target.value })}
                min="1"
              />
            </div>
            <div className="form-group">
              <label>Số lượng mỗi lần bán:</label>
              <input
                type="number"
                className="form-control"
                value={farmState.sellQuantity}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setFarmState({ ...farmState, sellQuantity: e.target.value })}
                min="1"
              />
            </div>
          </div>
        </div>

        {/* 8. Cây Trồng & Món Ăn Dự Bị */}
        <div className="farm-section-card" style={{ background: 'var(--glass-matrix-bg)', border: '1px solid var(--glass-border-subtle)', borderRadius: 'var(--radius-md)', padding: '14px 16px' }}>
          <div className="farm-sec-header" style={{ fontSize: '0.88rem', fontWeight: 600, color: 'var(--apple-blue)', display: 'flex', alignItems: 'center', gap: '6px', marginBottom: '12px' }}>
            <window.Icon name="layers" size={14} /> 8. Cấu Hình Cây Trồng & Món Ăn Dự Bị
          </div>
          <div className="form-group" style={{ marginBottom: '12px' }}>
            <label>Cây trồng dự bị (Danh sách ID <code>id1,id2,..</code>):</label>
            <div className="farm-id-input-group" style={{ display: 'flex', gap: '8px' }}>
              <input
                type="text"
                className="form-control"
                placeholder="VD: 6,30,42 (Lúa, Bắp, Khoai tây...)"
                value={farmState.backupSeeds}
                onChange={(e) => setFarmState({ ...farmState, backupSeeds: e.target.value })}
                style={{ flex: 1 }}
              />
              <button
                type="button"
                className="btn btn-sm btn-outline"
                onClick={() => setCatalogTarget({ field: 'backupSeeds', label: 'Cây Trồng Dự Bị', category: 'plant' })}
                style={{ gap: '6px', whiteSpace: 'nowrap' }}
              >
                <window.Icon name="search" size={13} /> Chọn Hạt Giống
              </button>
            </div>
            {renderItemChips('backupSeeds', 'plant')}
          </div>
          <div className="farm-grid-2" style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '12px' }}>
            <div className="form-group">
              <label>Thay thế cây khi đạt số lượng:</label>
              <input
                type="number"
                className="form-control"
                placeholder="0: Không đổi"
                value={farmState.replaceSeedThreshold}
                onFocus={(e) => { if (e.target.value === '0') e.target.select(); }}
                onChange={(e) => setFarmState({ ...farmState, replaceSeedThreshold: e.target.value })}
                min="0"
              />
            </div>
            <div className="form-group">
              <label>Món ăn dự bị (ID nấu ăn <code>id1,id2..</code>):</label>
              <div className="farm-id-input-group" style={{ display: 'flex', gap: '8px' }}>
                <input
                  type="text"
                  className="form-control"
                  placeholder="VD: 1,3,25"
                  value={farmState.backupDishes}
                  onChange={(e) => setFarmState({ ...farmState, backupDishes: e.target.value })}
                  style={{ flex: 1 }}
                />
                <button
                  type="button"
                  className="btn btn-sm btn-outline"
                  onClick={() => setCatalogTarget({ field: 'backupDishes', label: 'Món Ăn Dự Bị', category: 'cook' })}
                  style={{ gap: '6px', whiteSpace: 'nowrap' }}
                >
                  <window.Icon name="search" size={13} /> Chọn Món
                </button>
              </div>
              {renderItemChips('backupDishes', 'cook')}
            </div>
          </div>
        </div>
      </div>

      {/* Tra cứu ID Catalog Sub-Modal */}
      {catalogTarget && (
        <window.FarmIdCatalogModal
          targetFieldName={catalogTarget.field}
          targetLabel={catalogTarget.label}
          currentValue={farmState[catalogTarget.field]}
          initialCategory={catalogTarget.category || 'all'}
          onSelect={handleCatalogSelect}
          onSetAll={() => setFarmState(prev => ({ ...prev, sellProducts: '-1' }))}
          onClose={() => setCatalogTarget(null)}
        />
      )}
    </window.ModalBase>
  );
};
