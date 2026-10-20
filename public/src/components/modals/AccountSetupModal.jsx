/**
 * AccountSetupModal Component (Modals Layer)
 * Router/Dispatcher that renders ONLY the specific feature modal chosen by user:
 * - 'upThue' -> RentalSetupModal
 * - 'farm'   -> FarmSetupModal (Includes FarmIdCatalogModal)
 * - 'fish'   -> FishSetupModal
 * - 'other'  -> OtherSetupModal
 */
window.AccountSetupModal = function AccountSetupModal({
  account,
  allAccounts = [],
  initialFeature = 'upThue',
  setupModal = null,
  onClose,
  onAccountUpdated,
  onSave
}) {
  const effectiveAcc = account || setupModal?.account;
  const feature = initialFeature || setupModal?.activeTab || 'upThue';
  const handleClose = onClose;
  const handleUpdated = onAccountUpdated || onSave;

  if (!effectiveAcc) return null;

  // Kiểm tra quyền gói
  const planFeatures = React.useMemo(() => {
    if (!effectiveAcc.rentalPlan) return null; // Nick Admin/Nội bộ có full quyền
    if (effectiveAcc.allowedFeatures && Array.isArray(effectiveAcc.allowedFeatures)) return effectiveAcc.allowedFeatures;
    if (effectiveAcc.rentalPlan === 'FULL') return ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
    if (effectiveAcc.rentalPlan === 'FISH') return ['fish', 'upThue'];
    return ['farm', 'upThue'];
  }, [effectiveAcc.rentalPlan, effectiveAcc.allowedFeatures]);

  const featureMap = {
    upThue: 'upThue',
    farm: 'farm',
    fish: 'fish',
    diamond: 'diamond',
    kc: 'diamond',
    sellOre: 'sellOre',
    banda: 'sellOre',
    stone: 'sellOre'
  };

  const reqFeature = featureMap[feature] || 'farm';
  const isAllowed = !planFeatures || planFeatures.includes(reqFeature);

  if (!isAllowed) {
    return (
      <div className="modal-backdrop show">
        <div className="modal-dialog modal-dialog-centered">
          <div className="modal-content glass-card">
            <div className="modal-header">
              <div className="modal-title-with-icon">
                <window.Icon name="lock" size={16} color="var(--apple-gold)" />
                <span className="modal-title">Tính Năng Chưa Kích Hoạt</span>
              </div>
              <button type="button" className="close-btn" onClick={handleClose}>
                <window.Icon name="x" size={16} />
              </button>
            </div>
            <div className="modal-body text-center" style={{ padding: '24px 16px' }}>
              <div style={{ marginBottom: '12px' }}>
                <window.Icon name="shield" size={40} color="var(--apple-gold)" />
              </div>
              <h5 style={{ color: 'var(--text-primary)', marginBottom: '8px' }}>Gói [{effectiveAcc.rentalPlan}] Chưa Hỗ Trợ</h5>
              <p style={{ color: 'var(--text-secondary)', fontSize: '0.84rem', margin: '0 0 16px 0', lineHeight: 1.5 }}>
                Tính năng này không nằm trong danh sách chức năng của gói bạn đang thuê. Vui lòng gia hạn hoặc nâng cấp gói dịch vụ để mở khóa đầy đủ tính năng!
              </p>
              <button type="button" className="btn btn-primary" onClick={handleClose}>
                Đã Hiểu
              </button>
            </div>
          </div>
        </div>
      </div>
    );
  }

  if (feature === 'upThue') {
    return (
      <window.RentalSetupModal
        account={effectiveAcc}
        allAccounts={allAccounts}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'farm') {
    return (
      <window.FarmSetupModal
        account={effectiveAcc}
        allAccounts={allAccounts}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'fish') {
    return (
      <window.FishSetupModal
        account={effectiveAcc}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'diamond' || feature === 'kc') {
    return (
      <window.DiamondSetupModal
        account={effectiveAcc}
        accounts={allAccounts}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'sellOre' || feature === 'banda' || feature === 'stone') {
    return (
      <window.SellOreSetupModal
        account={effectiveAcc}
        allAccounts={allAccounts}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  return null;
};
