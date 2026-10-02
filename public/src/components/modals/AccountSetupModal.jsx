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
  onClose,
  onAccountUpdated
}) {
  if (!account) return null;

  if (initialFeature === 'upThue') {
    return (
      <window.RentalSetupModal
        account={account}
        allAccounts={allAccounts}
        onClose={onClose}
        onAccountUpdated={onAccountUpdated}
      />
    );
  }

  if (initialFeature === 'farm') {
    return (
      <window.FarmSetupModal
        account={account}
        allAccounts={allAccounts}
        onClose={onClose}
        onAccountUpdated={onAccountUpdated}
      />
    );
  }

  if (initialFeature === 'fish') {
    return (
      <window.FishSetupModal
        account={account}
        onClose={onClose}
        onAccountUpdated={onAccountUpdated}
      />
    );
  }

  if (initialFeature === 'diamond' || initialFeature === 'kc') {
    return (
      <window.DiamondSetupModal
        account={account}
        accounts={allAccounts}
        onClose={onClose}
        onAccountUpdated={onAccountUpdated}
      />
    );
  }

  if (initialFeature === 'sellOre' || initialFeature === 'banda' || initialFeature === 'stone') {
    return (
      <window.SellOreSetupModal
        account={account}
        allAccounts={allAccounts}
        onClose={onClose}
        onAccountUpdated={onAccountUpdated}
      />
    );
  }

  return null;
};
