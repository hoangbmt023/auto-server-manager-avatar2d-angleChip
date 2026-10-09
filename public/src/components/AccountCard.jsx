/**
 * AccountCard Component (Presentation Layer)
 * Porsche & Apple Minimalist 6-Metric Bot Card with Vector Icons
 */
function formatNumber(num) {
  if (num === null || num === undefined || isNaN(num)) return '0';
  return Number(num).toLocaleString('vi-VN');
}

window.AvatarCharacterView = React.memo(function AvatarCharacterView({
  username = '',
  isRunning = false,
  isError = false,
  isMaintenance = false,
  status = 'offline',
  avatarUrl = null,
  gold = 0,
  size = 54
}) {
  const cleanUser = (username || '').trim();
  const activeStatus = status || (isError ? 'error' : isMaintenance ? 'maintenance' : isRunning ? 'online' : 'offline');

  // Khi bot online trong game và trích xuất được sprite từ engine mod
  if (avatarUrl) {
    return (
      <div
        className={`avatar-chibi-wrapper is-${activeStatus}`}
        style={{
          width: size,
          height: size,
          minWidth: size,
          minHeight: size,
          maxWidth: size,
          maxHeight: size,
          flexShrink: 0,
          display: 'flex',
          alignItems: 'center',
          justifyContent: 'center',
          background: 'transparent',
          border: 'none',
          boxShadow: 'none',
          overflow: 'hidden'
        }}
        title={`Nhân vật TeaMobi Avatar 2D: ${cleanUser}`}
      >
        <img
          src={avatarUrl}
          alt={cleanUser}
          style={{
            width: '100%',
            height: '100%',
            objectFit: 'contain',
            imageRendering: 'pixelated'
          }}
        />
      </div>
    );
  }

  // Khi chưa có avatar / offline: Hiển thị icon Apple glass gọn gàng
  return (
    <div
      className={`avatar-chibi-wrapper is-${activeStatus}`}
      style={{
        width: size,
        height: size,
        minWidth: size,
        minHeight: size,
        maxWidth: size,
        maxHeight: size,
        flexShrink: 0,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        background: 'rgba(255, 255, 255, 0.04)',
        borderRadius: '12px',
        border: '1px solid var(--border-glass)'
      }}
      title={`Tài khoản: ${cleanUser}`}
    >
      <window.Icon
        name={isError ? 'alert-triangle' : isRunning ? 'bot' : 'user'}
        size={22}
        color={isRunning ? 'var(--apple-green)' : 'var(--text-tertiary)'}
      />
    </div>
  );
}, (prev, next) => {
  return prev.avatarUrl === next.avatarUrl &&
         prev.status === next.status &&
         prev.isRunning === next.isRunning &&
         prev.isError === next.isError &&
         prev.isMaintenance === next.isMaintenance &&
         prev.size === next.size &&
         prev.username === next.username;
});

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
  onTriggerAuto
}) {
  const isRunning = Boolean(account.isRunning);
  const serverName = account.serverName || (account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
  const proxyObj = (proxies || []).find(p => p.id === account.proxyId);
  const proxyLabel = proxyObj ? (proxyObj.name || `${proxyObj.host}:${proxyObj.port}`) : 'Direct IP';

  const file = (files || []).find(f => f.id === account.fileId) || activeFile;
  const modType = file?.modType || ((file?.gameJar && file.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu');
  const isFishMod = modType === 'fish';
  const stats = account.stats || {};
  const coins = stats.coins !== undefined && stats.coins !== null ? stats.coins : 0;
  const gold = stats.gold !== undefined && stats.gold !== null ? stats.gold : 0;
  const lockedGold = stats.lockedGold !== undefined && stats.lockedGold !== null ? stats.lockedGold : 0;
  const targetCoins = (stats.targetCoins !== undefined && stats.targetCoins !== null)
    ? stats.targetCoins
    : (account.targetCoins !== undefined ? account.targetCoins : 0);
  const earnedCoins = stats.earnedCoins !== undefined && stats.earnedCoins !== null ? stats.earnedCoins : 0;
  const collectedHearts = stats.collectedHearts !== undefined && stats.collectedHearts !== null ? stats.collectedHearts : 0;
  const startedAt = stats.startedAt && stats.startedAt !== '--' ? stats.startedAt : (isRunning ? 'Hôm nay' : '--');
  const expiresAt = (account.upDays === 0 || stats.expiresAt === 'Vĩnh viễn')
    ? 'Vĩnh viễn'
    : (stats.expiresAt && stats.expiresAt !== '' && stats.expiresAt !== '--' ? stats.expiresAt : (account.upDays > 0 ? `${account.upDays} ngày` : 'Vĩnh viễn'));

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

  const [menuOpen, setMenuOpen] = React.useState(false);
  const [autoMenuOpen, setAutoMenuOpen] = React.useState(false);
  const [moreMenuOpen, setMoreMenuOpen] = React.useState(false);
  const menuRef = React.useRef(null);
  const autoMenuRef = React.useRef(null);
  const moreMenuRef = React.useRef(null);

  // Close dropdown menus when clicking outside
  React.useEffect(() => {
    const handleClickOutside = (e) => {
      if (menuRef.current && !menuRef.current.contains(e.target)) setMenuOpen(false);
      if (autoMenuRef.current && !autoMenuRef.current.contains(e.target)) setAutoMenuOpen(false);
      if (moreMenuRef.current && !moreMenuRef.current.contains(e.target)) setMoreMenuOpen(false);
    };
    if (menuOpen || autoMenuOpen || moreMenuOpen) {
      document.addEventListener('mousedown', handleClickOutside);
    }
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
    };
  }, [menuOpen, autoMenuOpen, moreMenuOpen]);

  const handleSelectFeature = (featureKey) => {
    setMenuOpen(false);
    if (onOpenSetup) onOpenSetup(account, featureKey);
  };

  const handleTriggerAutoAction = (autoType, action) => {
    setAutoMenuOpen(false);
    if (onTriggerAuto) onTriggerAuto(account.id, account.username, autoType, action);
  };

  let cardStyleClass = '';
  let avatarIconName = 'user';
  let statusType = 'offline';
  let statusLabel = 'Tắt';

  if (isError) {
    cardStyleClass = 'error-account';
    avatarIconName = 'alert';
    statusType = 'error';
    statusLabel = 'Lỗi kết nối';
  } else if (isMaintenance) {
    cardStyleClass = 'maintenance-account';
    avatarIconName = 'settings';
    statusType = 'maintenance';
    statusLabel = 'Bảo trì';
  } else if (accountState.state === 'target_reached' || accountState.state === 'completed' || accountState.isCompleted) {
    cardStyleClass = 'completed-account';
    avatarIconName = 'target';
    statusType = 'completed';
    statusLabel = 'Đạt mục tiêu';
  } else if (accountState.state === 'disconnected' || accountState.state === 'other_login') {
    cardStyleClass = 'warn-account';
    avatarIconName = 'shield';
    statusType = 'warn';
    statusLabel = 'Cảnh báo';
  } else if (accountState.state === 'connecting') {
    cardStyleClass = 'connecting-account';
    avatarIconName = 'refresh';
    statusType = 'connecting';
    statusLabel = 'Đang kết nối';
  } else if (isRunning) {
    cardStyleClass = 'active-account';
    avatarIconName = 'bot';
    statusType = 'online';
    statusLabel = 'Online';
  }

  const isAutoRunning = Boolean(autoState.isRunning || (stats.isAutoRunning && stats.autoType));
  const activeAutoType = autoState.autoType || stats.autoType || null;
  const subTask = autoState.subTask || null;

  const isFarmRunning = isAutoRunning && (activeAutoType === 'farm' && !subTask);
  const isDiamondRunning = isAutoRunning && (activeAutoType === 'diamond' || activeAutoType === 'kc');
  const isFishRunning = isAutoRunning && (activeAutoType === 'fish' || activeAutoType === 'cau_ca');
  const isSellOreRunning = isAutoRunning && (activeAutoType === 'sell_ore' || activeAutoType === 'banda' || activeAutoType === 'stone' || subTask === 'sell_ore' || subTask === 'banda');
  const isSellOreSubTaskActive = subTask === 'sell_ore' || subTask === 'banda' || subTask === 'stone';

  return (
    <div className={`account-card-item ${cardStyleClass}`}>
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
          <div style={{ minWidth: 0 }}>
            <div className="acc-username-row">
              <span className="acc-username">{account.username}</span>
              <span
                className={`status-dot ${statusType}`}
                title={statusLabel}
              ></span>
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
            <div style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)', marginTop: '2px', display: 'flex', gap: '6px', alignItems: 'center' }}>
              <span>{serverName}</span>
              <span>•</span>
              <span title={proxyLabel} style={{ display: 'inline-flex', alignItems: 'center', gap: '3px' }}>
                <window.Icon name={proxyObj ? 'shield' : 'globe'} size={11} /> {proxyObj ? (proxyObj.name || 'Proxy') : 'Direct IP'}
              </span>
            </div>
          </div>
        </div>
      </div>

      {/* 2. Full 6-Metric Grid with Vector Icons */}
      <div className="acc-stats-matrix">
        {/* Box 1: Xu Hiện Có */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="coins" size={12} color="var(--apple-gold)" /> Xu Có
          </span>
          <span className="acc-metric-val coins">{formatNumber(coins)}</span>
        </div>

        {/* Box 2: Xu Up Được */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="trending" size={12} color={Number(earnedCoins) < 0 ? 'var(--apple-red)' : 'var(--apple-green)'} /> Xu Up
          </span>
          <span className="acc-metric-val" style={{ color: Number(earnedCoins) < 0 ? 'var(--apple-red)' : 'var(--apple-green)' }}>
            {formatNumber(earnedCoins)}
          </span>
        </div>

        {/* Box 3: Xu Cần Up */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="target" size={12} color="var(--apple-blue)" /> Mục Tiêu
          </span>
          <span className="acc-metric-val">{targetCoins > 0 ? formatNumber(targetCoins) : 'Không đặt'}</span>
        </div>

        {/* Box 4: Tim Thu Được */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="heart" size={12} color="#ff2d55" /> Tim Thu
          </span>
          <span className="acc-metric-val" style={{ color: '#ff2d55' }}>{formatNumber(collectedHearts)}</span>
        </div>

        {/* Box 5: Ngày Bắt Đầu */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="calendar" size={12} color="var(--text-tertiary)" /> Bắt Đầu
          </span>
          <span className="acc-metric-val">{startedAt}</span>
        </div>

        {/* Box 6: Hạn Up */}
        <div className="acc-metric-cell">
          <span className="acc-metric-label">
            <window.Icon name="clock" size={12} color="var(--text-tertiary)" /> Hạn Up
          </span>
          <span className="acc-metric-val">{expiresAt}</span>
        </div>

        {/* Live Auto metrics sub-panel */}
        {isFarmRunning && (
          <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(50, 215, 75, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(50, 215, 75, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between' }}>
            <span style={{ color: 'var(--apple-green)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
              <window.Icon name="sprout" size={13} /> Auto Farm: {stats.farmingStatus || stats.currentAction || 'Đang chăm sóc'}
            </span>
            <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>
              Chờ thu hoạch: {stats.farmingCountdown || stats.farmingTime || '--:--'}
            </span>
          </div>
        )}
        {isFishRunning && (
          <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(100, 210, 255, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(100, 210, 255, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
            <span style={{ color: 'var(--apple-teal)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '4px', whiteSpace: 'nowrap' }}>
              <window.Icon name="fish" size={13} /> {stats.fishCaught || 0} cá ({stats.sharkCaught || 0} mập)
            </span>
            <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)', whiteSpace: 'nowrap' }}>
              Farm: {stats.farmingCountdown || stats.farmingTime || '--:--'}
            </span>
          </div>
        )}
        {isDiamondRunning && (
          <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(191, 90, 242, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(191, 90, 242, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
            <span style={{ color: 'var(--apple-purple)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '4px', whiteSpace: 'nowrap' }}>
              <window.Icon name="gem" size={13} /> KCX: {stats.kcx || '+0'} • NHB: {stats.nhb || '+0'}
            </span>
            <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)', whiteSpace: 'nowrap' }}>
              Farm: {stats.farmingCountdown || stats.farmingTime || '--:--'}
            </span>
          </div>
        )}
        {isSellOreRunning && (
          <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(255, 159, 10, 0.08)', padding: '6px 10px', borderRadius: '0', border: '1px solid rgba(255, 159, 10, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
            <span style={{ color: 'var(--apple-orange)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
              <window.Icon name="rock" size={13} /> Auto Bán Đá: Khu {stats.currentZone || 0}
            </span>
            <span style={{ fontSize: '0.72rem', color: 'var(--apple-orange)', fontWeight: 600, background: 'rgba(255, 159, 10, 0.12)', padding: '2px 6px', borderRadius: '0' }}>
              Chờ bán: {stats.sellOreTime || '--:--'}
            </span>
          </div>
        )}
        {isAutoRunning && !isFishRunning && !isDiamondRunning && !isSellOreRunning && !isFarmRunning && (
          <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(10, 132, 255, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(10, 132, 255, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between' }}>
            <span style={{ color: 'var(--apple-blue)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
              <window.Icon name="zap" size={13} /> Auto: {autoState.autoType || 'Đang chạy'}
            </span>
            <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>
              {autoState.message || stats.autoStatus || 'Hoạt động'}
            </span>
          </div>
        )}
      </div>

      {/* 3. Streamlined Action Capsule Bar */}
      <div className="acc-action-bar">
        {/* Play / Stop Button */}
        {isRunning ? (
          <button className="btn btn-sm btn-danger" onClick={() => onStopAccount(account.id, account.username)} title="Dừng bot này">
            <window.Icon name="stop" size={13} /> Dừng
          </button>
        ) : (
          <button className="btn btn-sm btn-primary" onClick={() => onStartAccount(account.id, account.username)} title="Chạy bot này">
            <window.Icon name="play" size={13} /> Treo
          </button>
        )}

        {/* Auto Actions Dropdown */}
        <div style={{ position: 'relative', flex: 1 }} ref={autoMenuRef}>
          <button
            type="button"
            className={`btn btn-sm ${autoState.isRunning ? 'btn-active' : 'btn-secondary'}`}
            style={{ width: '100%', gap: '4px' }}
            onClick={() => setAutoMenuOpen(!autoMenuOpen)}
          >
            <window.Icon name="zap" size={13} color={autoState.isRunning ? 'var(--apple-blue)' : 'currentColor'} />
            {autoState.isRunning ? 'Đang Auto' : 'Auto'}
            <window.Icon name="chevronDown" size={12} />
          </button>

          {autoMenuOpen && (
            <div className="dropdown-menu-glass">
              <div style={{ padding: '6px 10px', fontSize: '0.7rem', color: 'var(--text-tertiary)', borderBottom: '1px solid var(--glass-border-subtle)', fontWeight: 600, display: 'flex', alignItems: 'center', gap: '5px' }}>
                <window.Icon name={modType === 'chipmix' ? 'zap' : isFishMod ? 'fish' : 'gem'} size={12} />
                {modType === 'chipmix' ? 'CHIPMIX FULL AUTO' : isFishMod ? 'AUTO UP CÂU CÁ' : 'AUTO UP KIM CƯƠNG'}
              </div>
              {modType === 'chipmix' ? (
                <>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('fish', isFishRunning ? 'stop' : 'start')}>
                    <window.Icon name={isFishRunning ? 'stop' : 'fish'} size={14} />
                    {isFishRunning ? 'Dừng Auto Câu Cá' : 'Bật Auto Câu Cá'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('diamond', isDiamondRunning ? 'stop' : 'start')}>
                    <window.Icon name={isDiamondRunning ? 'stop' : 'gem'} size={14} />
                    {isDiamondRunning ? 'Dừng Auto Kim Cương' : 'Bật Auto Kim Cương'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}>
                    <window.Icon name={isFarmRunning ? 'stop' : 'sprout'} size={14} />
                    {isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}>
                    <window.Icon name={isSellOreRunning ? 'stop' : 'rock'} size={14} />
                    {isSellOreRunning ? 'Dừng Bán Đá' : 'Bật Bán Đá'}
                  </button>
                </>
              ) : isFishMod ? (
                <>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('fish', isFishRunning ? 'stop' : 'start')}>
                    <window.Icon name={isFishRunning ? 'stop' : 'fish'} size={14} />
                    {isFishRunning ? 'Dừng Auto Câu Cá' : 'Bật Auto Câu Cá'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}>
                    <window.Icon name={isFarmRunning ? 'stop' : 'sprout'} size={14} />
                    {isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}>
                    <window.Icon name={isSellOreRunning ? 'stop' : 'rock'} size={14} />
                    {isSellOreRunning ? 'Dừng Bán Đá' : 'Bật Bán Đá'}
                  </button>
                </>
              ) : (
                <>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('diamond', isDiamondRunning ? 'stop' : 'start')}>
                    <window.Icon name={isDiamondRunning ? 'stop' : 'gem'} size={14} />
                    {isDiamondRunning ? 'Dừng Auto Kim Cương' : 'Bật Auto Kim Cương'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}>
                    <window.Icon name={isFarmRunning ? 'stop' : 'sprout'} size={14} />
                    {isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}>
                    <window.Icon name={isSellOreRunning ? 'stop' : 'rock'} size={14} />
                    {isSellOreRunning ? 'Dừng Bán Đá' : 'Bật Bán Đá'}
                  </button>
                </>
              )}
              {autoState.isRunning && (
                <button className="dropdown-item-glass" style={{ color: 'var(--apple-red)' }} onClick={() => handleTriggerAutoAction('all', 'stop')}>
                  <window.Icon name="stop" size={14} color="var(--apple-red)" /> Dừng Tất Cả Auto
                </button>
              )}
            </div>
          )}
        </div>

        {/* Mod Settings Dropdown */}
        <div style={{ position: 'relative' }} ref={menuRef}>
          <button
            type="button"
            className="btn btn-sm btn-secondary"
            onClick={() => setMenuOpen(!menuOpen)}
            title="Cài đặt Mod"
            style={{ gap: '3px' }}
          >
            <window.Icon name="settings" size={13} />
            <window.Icon name="chevronDown" size={11} />
          </button>

          {menuOpen && (
            <div className="dropdown-menu-glass">
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('upThue')}>
                <window.Icon name="coins" size={14} /> Cài Đặt Up Thuê
              </button>
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('farm')}>
                <window.Icon name="sprout" size={14} /> Cài Đặt Auto Farm
              </button>
              {modType === 'chipmix' ? (
                <>
                  <button className="dropdown-item-glass" onClick={() => handleSelectFeature('fish')}>
                    <window.Icon name="fish" size={14} /> Cài Đặt Auto Câu Cá
                  </button>
                  <button className="dropdown-item-glass" onClick={() => handleSelectFeature('diamond')}>
                    <window.Icon name="gem" size={14} /> Cài Đặt Auto Kim Cương
                  </button>
                </>
              ) : isFishMod ? (
                <button className="dropdown-item-glass" onClick={() => handleSelectFeature('fish')}>
                  <window.Icon name="fish" size={14} /> Cài Đặt Auto Câu Cá
                </button>
              ) : (
                <button className="dropdown-item-glass" onClick={() => handleSelectFeature('diamond')}>
                  <window.Icon name="gem" size={14} /> Cài Đặt Auto Kim Cương
                </button>
              )}
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('sellOre')}>
                <window.Icon name="rock" size={14} /> Cài Đặt Bán Đá
              </button>
            </div>
          )}
        </div>

        {/* More Options Dropdown (Edit, Delete) */}
        <div style={{ position: 'relative' }} ref={moreMenuRef}>
          <button
            type="button"
            className="btn btn-sm btn-secondary btn-icon-only"
            onClick={() => setMoreMenuOpen(!moreMenuOpen)}
            title="Tùy chọn khác"
          >
            <window.Icon name="more" size={15} />
          </button>

          {moreMenuOpen && (
            <div className="dropdown-menu-glass">
              <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onOpenEditAccount(account); }}>
                <window.Icon name="edit" size={14} /> Chỉnh Sửa Nick
              </button>
              <button className="dropdown-item-glass" style={{ color: 'var(--apple-red)' }} onClick={() => { setMoreMenuOpen(false); onDeleteAccount(account.id, account.username); }}>
                <window.Icon name="trash" size={14} color="var(--apple-red)" /> Xóa Tài Khoản
              </button>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
