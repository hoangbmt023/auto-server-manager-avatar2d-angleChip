/**
 * FarmSetupModal Component
 * Dedicated Center-Screen Modal for 8 Auto Farm Sections:
 * 1, 2, 3: Cơ chế Auto & Bổ sung giống
 * 4: Tùy chọn tự động (Checkboxes)
 * 5, 6: Vợ chồng, em bé & nâng cấp cây khế
 * 7: Cấu hình tự động bán nông sản (Trực tiếp mở tab Cây Trồng / Nông Sản)
 * 8: Cấu hình cây trồng & món ăn dự bị (Trực tiếp mở tab Cây Trồng hoặc Món Ăn)
 * + Tính năng Sao chép cài đặt từ tài khoản khác (Copy Settings)
 */
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

  const [farmState, setFarmState] = React.useState({
    ...defaultFarm,
    ...(account.farmSettings || {})
  });

  const otherAccounts = (allAccounts || []).filter(a => a && a.id !== account.id);
  const [copyFromId, setCopyFromId] = React.useState(otherAccounts.length > 0 ? otherAccounts[0].id : '');

  const [catalogTarget, setCatalogTarget] = React.useState(null); // { field, label, category }
  const [isSubmitting, setIsSubmitting] = React.useState(false);
  const [feedback, setFeedback] = React.useState(null);

  const showFeedback = (msg, type = 'success') => {
    setFeedback({ msg, type });
    setTimeout(() => setFeedback(null), 3500);
  };

  const handleSaveFarm = async () => {
    try {
      setIsSubmitting(true);
      const res = await window.ApiClient.updateAccountSetup(account.id, {
        farmSettings: farmState
      });
      if (res.success) {
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
      showFeedback(`📋 Đã sao chép cấu hình Auto Farm từ nick [${sourceAcc.username}]!`, 'success');
    } else if (sourceAcc) {
      setFarmState({ ...defaultFarm });
      showFeedback(`📋 Đã nạp cấu hình mặc định từ nick [${sourceAcc.username}]!`, 'success');
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
      const parts = currentVal.split(',').map(s => s.trim()).filter(Boolean);
      if (!parts.includes(String(item.id))) {
        parts.push(String(item.id));
      }
      newVal = parts.join(',');
    }
    setFarmState(prev => ({
      ...prev,
      [field]: newVal
    }));
  };

  return (
    <div className="center-modal-overlay" onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '750px', maxHeight: '88vh' }} onClick={(e) => e.stopPropagation()}>
        
        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            🌾 Cài Đặt Auto Farm <span className="modal-title-acc">({account.username})</span>
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
        <div className="center-modal-body" style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          
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
                      👤 {a.username} ({a.serverName})
                    </option>
                  ))}
                </select>
                <button
                  type="button"
                  className="btn btn-sm btn-secondary"
                  onClick={handleCopyFromOther}
                  title="Sao chép toàn bộ cài đặt Auto Farm của nick đã chọn"
                >
                  📥 Sao Chép
                </button>
              </div>
            </div>
          )}

          {/* 1, 2 & 3: Cơ Chế Auto & Bổ Sung Giống */}
          <div className="farm-section-card">
            <div className="farm-sec-header">⚙️ 1, 2 & 3. Cơ Chế Auto & Bổ Sung Giống</div>
            <div className="farm-grid-3">
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>1. Cơ chế Auto:</label>
                <select
                  className="form-control"
                  value={farmState.mode}
                  onChange={(e) => setFarmState({ ...farmState, mode: Number(e.target.value) })}
                >
                  <option value={0}>⚡ Lái buôn hỗ trợ (Nhanh)</option>
                  <option value={1}>🌾 Farm bình thường</option>
                </select>
              </div>
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>2. Bổ sung vật nuôi:</label>
                <select
                  className="form-control"
                  value={farmState.animal}
                  onChange={(e) => setFarmState({ ...farmState, animal: Number(e.target.value) })}
                >
                  <option value={0}>🐔 Gà</option>
                  <option value={1}>🦆 Vịt</option>
                  <option value={2}>🐷 Heo</option>
                  <option value={3}>❌ Không mua thêm</option>
                </select>
              </div>
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>3. Bổ sung hồ cá:</label>
                <select
                  className="form-control"
                  value={farmState.fish}
                  onChange={(e) => setFarmState({ ...farmState, fish: Number(e.target.value) })}
                >
                  <option value={0}>🐟 Cá</option>
                  <option value={1}>🐢 Rùa</option>
                  <option value={2}>❌ Không mua thêm</option>
                </select>
              </div>
            </div>
          </div>

          {/* 4. Tùy Chọn Tự Động */}
          <div className="farm-section-card">
            <div className="farm-sec-header">☑️ 4. Tùy Chọn Tự Động (Bật / Tắt)</div>
            <div className="farm-checkboxes-grid">
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.harvestHearts}
                  onChange={(e) => setFarmState({ ...farmState, harvestHearts: e.target.checked })}
                />
                <span>💖 Thu hoạch tim</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.dailyAttendance}
                  onChange={(e) => setFarmState({ ...farmState, dailyAttendance: e.target.checked })}
                />
                <span>🎁 Báo danh hàng ngày</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.deliverOrders}
                  onChange={(e) => setFarmState({ ...farmState, deliverOrders: e.target.checked })}
                />
                <span>📦 Giao đơn hàng TP</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.hatchDragon}
                  onChange={(e) => setFarmState({ ...farmState, hatchDragon: e.target.checked })}
                />
                <span>🥚 Nhiệm vụ ấp rồng</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.trainDragon}
                  onChange={(e) => setFarmState({ ...farmState, trainDragon: e.target.checked })}
                />
                <span>🐉 Nhiệm vụ luyện rồng</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.noBuyWithGold}
                  onChange={(e) => setFarmState({ ...farmState, noBuyWithGold: e.target.checked })}
                />
                <span>🔒 Ko tự mua bằng Lượng</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.buyMilkWithGold}
                  onChange={(e) => setFarmState({ ...farmState, buyMilkWithGold: e.target.checked })}
                />
                <span>🥛 Mua sữa lượng khi thiếu NS</span>
              </label>
              <label className="farm-checkbox-item">
                <input
                  type="checkbox"
                  checked={farmState.upgradeStarfruit}
                  onChange={(e) => setFarmState({ ...farmState, upgradeStarfruit: e.target.checked })}
                />
                <span>🌳 Tự nâng cấp cây khế</span>
              </label>
            </div>
          </div>

          {/* 5 & 6. Vợ Chồng, Em Bé & Cây Khế */}
          <div className="farm-section-card">
            <div className="farm-sec-header">👶 5 & 6. Chức Năng Vợ Chồng, Em Bé & Cây Khế</div>
            <div className="farm-grid-3">
              <label className="farm-checkbox-item" style={{ height: '40px', marginTop: '22px' }}>
                <input
                  type="checkbox"
                  checked={farmState.feedBaby}
                  onChange={(e) => setFarmState({ ...farmState, feedBaby: e.target.checked })}
                />
                <span>🍼 Cho em bé ăn</span>
              </label>
              <label className="farm-checkbox-item" style={{ height: '40px', marginTop: '22px' }}>
                <input
                  type="checkbox"
                  checked={farmState.upgradeBaby}
                  onChange={(e) => setFarmState({ ...farmState, upgradeBaby: e.target.checked })}
                />
                <span>⭐ Nâng cấp em bé</span>
              </label>
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>6. Nâng cây khế đến cấp:</label>
                <input
                  type="number"
                  className="form-control"
                  value={farmState.maxStarfruitLevel}
                  onChange={(e) => setFarmState({ ...farmState, maxStarfruitLevel: Number(e.target.value) })}
                  min="1"
                  max="20"
                />
              </div>
            </div>
          </div>

          {/* 7. Bán Nông Sản Tự Động */}
          <div className="farm-section-card">
            <div className="farm-sec-header">💰 7. Cấu Hình Tự Động Bán Nông Sản</div>
            <div className="form-group" style={{ marginBottom: '12px' }}>
              <label style={{ fontSize: '0.82rem' }}>
                Bán nông sản: (Nhập <strong>-1</strong> để bán tất cả hoặc danh sách ID <code>id1,id2,...</code>)
              </label>
              <div className="farm-id-input-group">
                <input
                  type="text"
                  className="form-control"
                  placeholder="-1 (Tất cả) hoặc 0,1,6,30..."
                  value={farmState.sellProducts}
                  onChange={(e) => setFarmState({ ...farmState, sellProducts: e.target.value })}
                />
                <button
                  type="button"
                  className="btn btn-sm btn-open-catalog"
                  onClick={() => setCatalogTarget({ field: 'sellProducts', label: 'Bán Nông Sản', category: 'plant' })}
                >
                  🔍 Tra Cứu Nông Sản
                </button>
              </div>
            </div>
            <div className="farm-grid-2">
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>Bán khi đạt số lượng trong kho:</label>
                <input
                  type="number"
                  className="form-control"
                  value={farmState.sellThreshold}
                  onChange={(e) => setFarmState({ ...farmState, sellThreshold: Number(e.target.value) })}
                  min="1"
                />
              </div>
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>Số lượng nông sản mỗi lần bán:</label>
                <input
                  type="number"
                  className="form-control"
                  value={farmState.sellQuantity}
                  onChange={(e) => setFarmState({ ...farmState, sellQuantity: Number(e.target.value) })}
                  min="1"
                />
              </div>
            </div>
          </div>

          {/* 8. Cây Trồng & Món Ăn Dự Bị */}
          <div className="farm-section-card">
            <div className="farm-sec-header">🌱 8. Cấu Hình Cây Trồng & Món Ăn Dự Bị</div>
            <div className="form-group" style={{ marginBottom: '12px' }}>
              <label style={{ fontSize: '0.82rem' }}>Cây trồng dự bị (Danh sách ID <code>id1,id2,..</code>):</label>
              <div className="farm-id-input-group">
                <input
                  type="text"
                  className="form-control"
                  placeholder="VD: 6,30,42 (Lúa, Bắp, Khoai tây...)"
                  value={farmState.backupSeeds}
                  onChange={(e) => setFarmState({ ...farmState, backupSeeds: e.target.value })}
                />
                <button
                  type="button"
                  className="btn btn-sm btn-open-catalog"
                  onClick={() => setCatalogTarget({ field: 'backupSeeds', label: 'Cây Trồng Dự Bị', category: 'plant' })}
                >
                  🔍 Chọn Hạt Giống
                </button>
              </div>
            </div>
            <div className="farm-grid-2">
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>Thay thế cây khi đạt số lượng:</label>
                <input
                  type="number"
                  className="form-control"
                  placeholder="0: Không đổi"
                  value={farmState.replaceSeedThreshold}
                  onChange={(e) => setFarmState({ ...farmState, replaceSeedThreshold: Number(e.target.value) })}
                  min="0"
                />
              </div>
              <div className="form-group">
                <label style={{ fontSize: '0.82rem' }}>Món ăn dự bị (ID nấu ăn <code>id1,id2..</code>):</label>
                <div className="farm-id-input-group">
                  <input
                    type="text"
                    className="form-control"
                    placeholder="VD: 1,3,25 (Bánh trứng, Cơm, Pizza...)"
                    value={farmState.backupDishes}
                    onChange={(e) => setFarmState({ ...farmState, backupDishes: e.target.value })}
                  />
                  <button
                    type="button"
                    className="btn btn-sm btn-open-catalog"
                    onClick={() => setCatalogTarget({ field: 'backupDishes', label: 'Món Ăn Dự Bị', category: 'cook' })}
                  >
                    🔍 Chọn Món Ăn
                  </button>
                </div>
              </div>
            </div>
          </div>

          {/* Bottom Actions */}
          <div className="modal-actions" style={{ marginTop: '8px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
            <button
              type="button"
              className="btn btn-primary"
              disabled={isSubmitting}
              onClick={handleSaveFarm}
            >
              {isSubmitting ? 'Đang lưu...' : '💾 Lưu Cài Đặt Auto Farm'}
            </button>
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

    </div>
  );
};
