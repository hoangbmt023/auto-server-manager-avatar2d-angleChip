/**
 * AccountCard Component (Presentation Layer)
 * Porsche & Apple Minimalist Bot Card - Clean Component orchestrating Sub-Components.
 */
const { formatNumber, formatDateTime } = window.formatters;

window.AccountCard = function AccountCard({
  account,
  proxies = [],
  files = [],
  activeFile = null,
  onStartAccount,
  onStopAccount,
  onOpenEditAccount,
  onDeleteAccount,
  onOpenSetup,
  onTriggerAuto,
  onInspectRms,
  onOpenLogs,
  onRenewAccount
}) {
  const isRunning = Boolean(account.isRunning);
  const serverName = account.serverName || (account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
  const proxyObj = (proxies || []).find(p => p.id === account.proxyId);
  const proxyDisplayName = (proxyObj && proxyObj.name) || account.proxyName || null;

  const file = (files || []).find(f => f.id === account.fileId) || activeFile;
  const modType = file?.modType || ((file?.gameJar && file.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu');
  const isFishMod = modType === 'fish';
  const stats = account.stats || {};
  const gold = stats.gold !== undefined && stats.gold !== null ? stats.gold : 0;
  const lockedGold = stats.lockedGold !== undefined && stats.lockedGold !== null ? stats.lockedGold : 0;

  const accountState = account.accountState || {
    state: isRunning ? 'online' : 'offline',
    message: isRunning ? 'Đang Treo Online' : 'Đang Tắt',
    isError: false,
    isMaintenance: false
  };
  const isError = Boolean(accountState.isError || accountState.state === 'auth_error' || accountState.state === 'account_locked');
  const isMaintenance = Boolean(accountState.isMaintenance || accountState.state === 'maintenance');

  const autoState = account.autoState || {
    isRunning: false,
    autoType: null,
    status: 'idle',
    message: ''
  };

  let cardStyleClass = '';
  let statusType = 'offline';
  let statusLabel = 'Tắt';

  if (isError) {
    cardStyleClass = 'error-account';
    statusType = 'error';
    statusLabel = 'Lỗi kết nối';
  } else if (isMaintenance) {
    cardStyleClass = 'maintenance-account';
    statusType = 'maintenance';
    statusLabel = 'Bảo trì';
  } else if (accountState.state === 'target_reached' || accountState.state === 'completed' || accountState.isCompleted) {
    cardStyleClass = 'completed-account';
    statusType = 'completed';
    statusLabel = 'Đạt mục tiêu';
  } else if (accountState.state === 'disconnected' || accountState.state === 'other_login') {
    cardStyleClass = 'warn-account';
    statusType = 'warn';
    statusLabel = 'Cảnh báo';
  } else if (accountState.state === 'connecting') {
    cardStyleClass = 'connecting-account';
    statusType = 'connecting';
    statusLabel = 'Đang kết nối';
  } else if (isRunning) {
    cardStyleClass = 'active-account';
    statusType = 'online';
    statusLabel = 'Online';
  }

  // Real-time Expiration Countdown Tick (1 second interval)
  const [now, setNow] = React.useState(() => Date.now());
  React.useEffect(() => {
    const timer = setInterval(() => {
      setNow(Date.now());
    }, 1000);
    return () => clearInterval(timer);
  }, []);

  const proxyExpiresAt = (proxyObj && proxyObj.expiresAt) || account.proxyExpiresAt || null;
  const isRentedAccount = Boolean(account.rentalPlan || account.userId);
  const expiryDate = (isRentedAccount && account.rentalExpiresAt) ? account.rentalExpiresAt : (proxyExpiresAt || account.rentalExpiresAt || null);
  const countdown = (window.formatCountdown || window.formatters?.formatCountdown)
    ? (window.formatCountdown || window.formatters?.formatCountdown)(expiryDate, now)
    : null;
  const isRentalExpired = Boolean(account.rentalExpiresAt && new Date(account.rentalExpiresAt).getTime() < now);

  return (
    <div
      id={`acc-card-${account.id}`}
      data-username={account.username}
      className={`account-card-item ${cardStyleClass} ${isRentalExpired ? 'rental-expired-card' : ''}`}
    >
      {/* 1. Header Row */}
      <div className="acc-header">
        <div className="acc-user-info">
          <div className="acc-avatar-icon">
            <window.AvatarCharacterView
              username={account.username}
              isRunning={isRunning}
              isError={isError}
              isMaintenance={isMaintenance}
              status={statusType}
              avatarUrl={account.avatarUrl || stats.avatarUrl}
              gold={gold}
              size={54}
            />
          </div>
          <div className="acc-user-info-text">
            <div className="acc-username-row">
              <div className="acc-username-wrapper">
                {account.isEmptySlot || !account.username ? (
                  <span className="acc-username acc-empty-slot-title">
                    [Slot Trống - Chờ Gắn Nick]
                  </span>
                ) : (
                  <span className="acc-username">
                    {account.username}
                  </span>
                )}
                <span className={`status-dot ${account.isEmptySlot || !account.username ? 'idle' : statusType}`} title={account.isEmptySlot || !account.username ? 'Chờ gắn nick' : statusLabel}></span>
              </div>

              {/* Real-time Expiration Countdown Badge (Proxy / Thuê) */}
              {countdown && expiryDate && (
                <span
                  onClick={() => {
                    if (onRenewAccount && isRentedAccount) {
                      onRenewAccount(account);
                    }
                  }}
                  className={`acc-expiry-badge ${
                    countdown.isExpired
                      ? 'acc-expiry-badge-expired'
                      : (countdown.isUrgent ? 'acc-expiry-badge-urgent' : (countdown.isWarning ? 'acc-expiry-badge-warning' : 'acc-expiry-badge-valid'))
                  } ${onRenewAccount && isRentedAccount ? 'acc-expiry-clickable' : ''}`}
                  title={`Hạn ${isRentedAccount ? 'Thuê Bot' : (proxyExpiresAt ? 'Proxy' : 'Thuê')}: ${window.formatDateTime ? window.formatDateTime(expiryDate) : new Date(expiryDate).toLocaleString('vi-VN')} (${countdown.text})${isRentedAccount ? ' • Bấm để gia hạn ngay' : ''}`}
                >
                  <window.Icon name={countdown.isExpired ? 'refreshCw' : (isRentedAccount ? 'clock' : (proxyExpiresAt ? 'shield' : 'clock'))} size={11} />
                  <span>{countdown.compactText || countdown.shortText}</span>
                  {Boolean(onRenewAccount && isRentedAccount && (countdown.isExpired || countdown.isUrgent)) && (
                    <span className="acc-expiry-renew-tag">
                      {countdown.isExpired ? 'Gia hạn' : '+Hạn'}
                    </span>
                  )}
                </span>
              )}
            </div>

            <div className="acc-badges-row">
              {gold > 0 && (
                <span className="btn-xs acc-badge-teal">
                  <window.Icon name="gem" size={11} color="var(--apple-teal)" /> {formatNumber(gold)} L
                </span>
              )}
              {lockedGold > 0 && (
                <span className="btn-xs acc-badge-gold">
                  <window.Icon name="shield" size={11} color="var(--apple-gold)" /> {formatNumber(lockedGold)} LK
                </span>
              )}
            </div>

            <div className="acc-meta-row">
              <span>{serverName}</span>
              <span>•</span>
              <span className={`acc-meta-tag ${proxyDisplayName ? 'tag-purple' : 'tag-blue'}`}>
                <window.Icon name={proxyDisplayName ? 'shield' : 'globe'} size={11} />
                {proxyDisplayName ? `Tab ${proxyDisplayName}` : 'Tab IP Mặc định'}
              </span>

              {/* Package Name behind Proxy: matches previous 2 items (no border, no br) */}
              {account.rentalPlan && (
                <>
                  <span>•</span>
                  <span
                    className={`acc-meta-tag ${
                      account.rentalPlan === 'FULL'
                        ? 'tag-purple'
                        : (account.rentalPlan === 'FISH' ? 'tag-teal' : 'tag-green')
                    }`}
                  >
                    <window.Icon name={account.rentalPlan === 'FULL' ? 'zap' : account.rentalPlan === 'FISH' ? 'fish' : 'sprout'} size={11} />
                    {account.rentalPlan === 'FULL' ? 'Gói Full' : (account.rentalPlan === 'FISH' ? 'Gói Câu Cá' : (account.rentalPlan === 'UPXU' ? 'Gói Up Xu' : (account.rentalPlanName || `Gói ${account.rentalPlan}`)))}
                  </span>
                </>
              )}
            </div>

            {/* Rented By User Info (Shown if account is rented) */}
            {account.rentedBy && (
              <div className="acc-rented-by">
                <window.Icon name="user" size={11} color="var(--apple-blue)" />
                <span>{account.rentedBy}</span>
              </div>
            )}
          </div>
        </div>
      </div>

      {/* 2. Full 6-Metric Matrix with Live Sub-Panel */}
      <window.AccountStats
        account={account}
        stats={stats}
        autoState={autoState}
        isRunning={isRunning}
      />

      {/* 3. Action Bar (Start/Stop, Auto, Setup, Options) */}
      <window.AccountActions
        account={account}
        isRunning={isRunning}
        autoState={autoState}
        stats={stats}
        modType={modType}
        isFishMod={isFishMod}
        onStartAccount={onStartAccount}
        onStopAccount={onStopAccount}
        onOpenEditAccount={onOpenEditAccount}
        onDeleteAccount={onDeleteAccount}
        onOpenSetup={onOpenSetup}
        onTriggerAuto={onTriggerAuto}
        onInspectRms={onInspectRms}
        onOpenLogs={onOpenLogs}
        onRenewAccount={onRenewAccount}
      />
    </div>
  );
};
