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
  accounts = [],
  initialFeature = null,
  setupModal = null,
  onClose,
  onAccountUpdated,
  onSave
}) {
  const effectiveAcc = account || setupModal?.account;
  const feature = setupModal?.activeTab || initialFeature || 'farm';
  const handleClose = onClose;
  const handleUpdated = onAccountUpdated || onSave;
  const accountList = (allAccounts && allAccounts.length > 0) ? allAccounts : (accounts || []);

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
      <window.ModalBase
        title="Tính Năng Chưa Kích Hoạt"
        subtitle={`Gói [${effectiveAcc.rentalPlan}] Chưa Hỗ Trợ`}
        icon="lock"
        iconColor="var(--apple-gold)"
        size="sm"
        onClose={handleClose}
        footer={
          <div style={{ display: 'flex', justifyContent: 'flex-end', width: '100%' }}>
            <button type="button" className="btn btn-primary" onClick={handleClose}>
              Đã Hiểu
            </button>
          </div>
        }
      >
        <div style={{ textAlign: 'center', padding: '16px 8px' }}>
          <div style={{ marginBottom: '14px' }}>
            <window.Icon name="shield" size={44} color="var(--apple-gold)" />
          </div>
          <p style={{ color: 'var(--text-secondary)', fontSize: '0.86rem', margin: '0 0 8px 0', lineHeight: 1.6 }}>
            Tính năng này không nằm trong danh sách chức năng của gói bạn đang thuê.
            Vui lòng gia hạn hoặc nâng cấp gói dịch vụ để mở khóa đầy đủ tính năng!
          </p>
        </div>
      </window.ModalBase>
    );
  }

  if (feature === 'upThue') {
    return (
      <window.RentalSetupModal
        account={effectiveAcc}
        allAccounts={accountList}
        accounts={accountList}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'farm') {
    return (
      <window.FarmSetupModal
        account={effectiveAcc}
        allAccounts={accountList}
        accounts={accountList}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'fish') {
    return (
      <window.FishSetupModal
        account={effectiveAcc}
        allAccounts={accountList}
        accounts={accountList}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'diamond' || feature === 'kc') {
    return (
      <window.DiamondSetupModal
        account={effectiveAcc}
        allAccounts={accountList}
        accounts={accountList}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  if (feature === 'sellOre' || feature === 'banda' || feature === 'stone') {
    return (
      <window.SellOreSetupModal
        account={effectiveAcc}
        allAccounts={accountList}
        accounts={accountList}
        onClose={handleClose}
        onAccountUpdated={handleUpdated}
      />
    );
  }

  return null;
};
