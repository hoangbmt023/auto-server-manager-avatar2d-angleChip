/**
 * AccountCard Component (Presentation Layer)
 * Porsche & Apple Minimalist Bot Card - Clean Component orchestrating Sub-Components.
 */
function formatNumber(num) {
  if (num === null || num === undefined || isNaN(num)) return '0';
  return Number(num).toLocaleString('vi-VN');
}

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
  onInspectRms
}) {
  const isRunning = Boolean(account.isRunning);
  const serverName = account.serverName || (account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
  const proxyObj = (proxies || []).find(p => p.id === account.proxyId);

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

  // Rental Expiration Countdown Calculation
  const rentalExpiresAt = account.rentalExpiresAt ? new Date(account.rentalExpiresAt) : null;
  let remainingText = null;
  let remainingBadgeStyle = {};
  const isRentalExpired = Boolean(rentalExpiresAt && rentalExpiresAt.getTime() < Date.now());

  if (rentalExpiresAt) {
    const diffMs = rentalExpiresAt.getTime() - Date.now();
    if (diffMs <= 0) {
      remainingText = 'Đã hết hạn';
      remainingBadgeStyle = {
        background: 'rgba(255, 69, 58, 0.15)',
        color: 'var(--apple-red)',
        border: '1px solid rgba(255, 69, 58, 0.3)'
      };
    } else {
      const days = Math.floor(diffMs / (1000 * 60 * 60 * 24));
      const hours = Math.floor((diffMs % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
      const minutes = Math.floor((diffMs % (1000 * 60 * 60)) / (1000 * 60));

      if (days > 3) {
        remainingText = `Còn ${days} ngày ${hours}h`;
        remainingBadgeStyle = {
          background: 'rgba(48, 209, 88, 0.12)',
          color: 'var(--apple-green)',
          border: '1px solid rgba(48, 209, 88, 0.25)'
        };
      } else if (days > 0) {
        remainingText = `Còn ${days} ngày ${hours}h`;
        remainingBadgeStyle = {
          background: 'rgba(255, 214, 10, 0.12)',
          color: 'var(--apple-gold)',
          border: '1px solid rgba(255, 214, 10, 0.3)'
        };
      } else {
        remainingText = hours > 0 ? `Còn ${hours}h ${minutes}p` : `Còn ${minutes} phút`;
        remainingBadgeStyle = {
          background: 'rgba(255, 69, 58, 0.12)',
          color: 'var(--apple-red)',
          border: '1px solid rgba(255, 69, 58, 0.3)'
        };
      }
    }
  }

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
          <div style={{ minWidth: 0, flex: 1 }}>
            <div className="acc-username-row" style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
              <div style={{ display: 'flex', alignItems: 'center', gap: '6px', minWidth: 0 }}>
                <span className="acc-username" style={{ textOverflow: 'ellipsis', overflow: 'hidden', whiteSpace: 'nowrap' }}>
                  {account.username}
                </span>
                <span className={`status-dot ${statusType}`} title={statusLabel}></span>
              </div>

              {/* Rental Countdown Badge */}
              {remainingText && (
                <span
                  style={{
                    padding: '2px 8px',
                    borderRadius: '999px',
                    fontSize: '0.68rem',
                    fontWeight: 600,
                    display: 'inline-flex',
                    alignItems: 'center',
                    gap: '4px',
                    whiteSpace: 'nowrap',
                    ...remainingBadgeStyle
                  }}
                  title={`Hạn thuê đến: ${rentalExpiresAt.toLocaleString('vi-VN')}`}
                >
                  <window.Icon name="activity" size={10} />
                  {remainingText}
                </span>
              )}
            </div>

            <div className="acc-badges-row" style={{ display: 'flex', gap: '4px', marginTop: '3px', flexWrap: 'wrap' }}>
              {gold > 0 && (
                <span className="btn-xs" style={{ background: 'rgba(100, 210, 255, 0.12)', color: 'var(--apple-teal)', borderRadius: '999px', fontWeight: 600, display: 'inline-flex', alignItems: 'center', gap: '3px' }}>
                  <window.Icon name="gem" size={11} color="var(--apple-teal)" /> {formatNumber(gold)} L
                </span>
              )}
              {lockedGold > 0 && (
                <span className="btn-xs" style={{ background: 'rgba(255, 214, 10, 0.12)', color: 'var(--apple-gold)', borderRadius: '999px', fontWeight: 600, display: 'inline-flex', alignItems: 'center', gap: '3px' }}>
                  <window.Icon name="shield" size={11} color="var(--apple-gold)" /> {formatNumber(lockedGold)} LK
                </span>
              )}
            </div>

            <div style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)', marginTop: '3px', display: 'flex', gap: '6px', alignItems: 'center', flexWrap: 'wrap' }}>
              <span>{serverName}</span>
              <span>•</span>
              <span style={{
                color: proxyObj ? 'var(--apple-purple)' : 'var(--apple-blue)',
                fontWeight: 600,
                display: 'inline-flex',
                alignItems: 'center',
                gap: '3px'
              }}>
                <window.Icon name={proxyObj ? 'shield' : 'globe'} size={11} />
                {proxyObj ? `Tab ${proxyObj.name}` : 'Tab IP Mặc định'}
              </span>
            </div>
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
      />
    </div>
  );
};
