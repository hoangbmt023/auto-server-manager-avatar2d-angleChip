/**
 * AccountCard Component (Presentation Layer)
 * Renders individual Avatar account item with real-time in-game player stats.
 * Compact layout with dedicated Mod Setup and Auto Execution Dropdowns.
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
  onTriggerAuto
}) {
  const isRunning = Boolean(account.isRunning);
  const serverName = account.serverName || (account.serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
  const proxyObj = (proxies || []).find(p => p.id === account.proxyId);
  const proxyLabel = proxyObj ? (proxyObj.name || `${proxyObj.host}:${proxyObj.port}`) : 'IP Server';

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
  const menuRef = React.useRef(null);
  const autoMenuRef = React.useRef(null);

  // Close dropdown menus when clicking outside
  React.useEffect(() => {
    const handleClickOutside = (e) => {
      if (menuRef.current && !menuRef.current.contains(e.target)) {
        setMenuOpen(false);
      }
      if (autoMenuRef.current && !autoMenuRef.current.contains(e.target)) {
        setAutoMenuOpen(false);
      }
    };
    if (menuOpen || autoMenuOpen) {
      document.addEventListener('mousedown', handleClickOutside);
    }
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
    };
  }, [menuOpen, autoMenuOpen]);

  const handleSelectFeature = (featureKey) => {
    setMenuOpen(false);
    if (onOpenSetup) {
      onOpenSetup(account, featureKey);
    }
  };

  const handleTriggerAutoAction = (autoType, action) => {
    setAutoMenuOpen(false);
    if (onTriggerAuto) {
      onTriggerAuto(account.id, account.username, autoType, action);
    }
  };

  let cardStyleClass = '';
  let avatarIcon = '👤';

  if (isError) {
    cardStyleClass = 'error-account';
    avatarIcon = '❌';
  } else if (isMaintenance) {
    cardStyleClass = 'maintenance-account';
    avatarIcon = '🛠️';
  } else if (accountState.state === 'target_reached' || accountState.state === 'completed' || accountState.isCompleted) {
    cardStyleClass = 'completed-account';
    avatarIcon = '🏆';
  } else if (accountState.state === 'disconnected' || accountState.state === 'other_login') {
    cardStyleClass = 'warn-account';
    avatarIcon = '⚠️';
  } else if (accountState.state === 'connecting') {
    cardStyleClass = 'connecting-account';
    avatarIcon = '🔄';
  } else if (isRunning) {
    cardStyleClass = 'active-account';
    avatarIcon = '🔥';
  }

  const isAutoRunning = Boolean(autoState.isRunning || (stats.isAutoRunning && stats.autoType));
  const activeAutoType = autoState.autoType || stats.autoType || null;

  const hasDiamondStats = Boolean(
    (stats.farmingCountdown && stats.farmingCountdown !== '--:--') ||
    (stats.kcx && stats.kcx !== '+0') ||
    (stats.nhb && stats.nhb !== '+0')
  );

  const isFarmRunning = isAutoRunning && activeAutoType === 'farm';
  const isFishRunning = (isAutoRunning && (activeAutoType === 'fish' || activeAutoType === 'cau_ca')) || (stats.isFishMod && stats.fishCaught > 0);
  const isSellOreRunning = isAutoRunning && (activeAutoType === 'sell_ore' || activeAutoType === 'banda' || activeAutoType === 'stone');
  const isDiamondRunning = (isAutoRunning && (activeAutoType === 'diamond' || activeAutoType === 'kc')) || (!isFishRunning && !isSellOreRunning && !isFarmRunning && hasDiamondStats);

  return (
    <div className={`account-card-item ${cardStyleClass} ${(menuOpen || autoMenuOpen) ? 'menu-open-active' : ''}`}>
      <div className="acc-header">
        <div className="acc-user-info">
          <div className="acc-avatar-icon">{avatarIcon}</div>
          <div style={{ flex: 1 }}>
            <div className="acc-username-row">
              <span className="acc-username">{account.username}</span>
              {gold > 0 && (
                <span className="badge-luong" title="Lượng (Ngọc)">💎 {formatNumber(gold)} L</span>
              )}
              {lockedGold > 0 && (
                <span className="badge-luong" style={{ background: 'rgba(234,179,8,0.15)', color: '#facc15', borderColor: 'rgba(234,179,8,0.3)' }} title="Lượng Khóa (LK)">
                  🔒 {formatNumber(lockedGold)} LK
                </span>
              )}
            </div>
            <div className="acc-note">{account.note || 'Không có ghi chú'}</div>
            <div className="acc-badges">
              <span className="badge-server">🌐 Server: <strong>{serverName}</strong></span>
              {proxyObj ? (
                <span className="badge-server" style={{ borderColor: 'rgba(168, 85, 247, 0.45)', background: 'rgba(168, 85, 247, 0.12)', color: '#c084fc' }} title={`Proxy: ${proxyObj.type.toUpperCase()} - ${proxyObj.host}:${proxyObj.port}`}>
                  🔒 Proxy: <strong>{proxyObj.name || `${proxyObj.host}:${proxyObj.port}`}</strong>
                </span>
              ) : (
                <span className="badge-server" style={{ borderColor: 'rgba(59, 130, 246, 0.35)', background: 'rgba(59, 130, 246, 0.1)', color: '#93c5fd' }} title="Tài khoản dùng trực tiếp IP máy chủ">
                  🌐 Proxy: <strong>IP Server</strong>
                </span>
              )}

              {isError ? (
                <span className="badge-status-error" title={accountState.message}>
                  ❌ {accountState.message || 'Sai tài khoản hoặc mật khẩu!'}
                </span>
              ) : isMaintenance ? (
                <span className="badge-status-maintenance" title={accountState.message}>
                  🛠️ {accountState.message || 'Server Đang Bảo Trì'}
                </span>
              ) : accountState.state === 'other_login' ? (
                <span className="badge-status-warn" title={accountState.message}>
                  ⚠️ Đăng nhập nơi khác
                </span>
              ) : accountState.state === 'disconnected' ? (
                <span className="badge-status-warn" title={accountState.message}>
                  ⚠️ Mất kết nối, đang thử lại
                </span>
              ) : (accountState.state === 'target_reached' || accountState.state === 'completed' || accountState.isCompleted) ? (
                <span className="badge-server" style={{ borderColor: 'rgba(234, 179, 8, 0.55)', background: 'rgba(234, 179, 8, 0.15)', color: '#facc15', fontWeight: 'bold' }} title={accountState.message || 'Đã đạt yêu cầu up xu!'}>
                  🏆 Đã Đạt Mục Tiêu
                </span>
              ) : isRunning ? (
                <span className="badge-active">
                  ⭐ Đang Treo Online {account.runningPid ? `(PID: ${account.runningPid})` : ''}
                </span>
              ) : (
                <span className="badge-server" style={{ opacity: 0.75 }}>💤 Đang Tắt</span>
              )}

              {/* Real-time Auto Status Badges */}
              {isAutoRunning ? (
                <span className="badge-status-auto-running" title={autoState.message || 'Đang thực hiện Auto'}>
                  {activeAutoType === 'farm' ? '🌾 Đang Auto Farm...' : (activeAutoType === 'diamond' || activeAutoType === 'kc' ? '💎 Đang Auto Kim Cương...' : (activeAutoType === 'fish' || activeAutoType === 'cau_ca' ? '🎣 Đang Auto Câu Cá...' : (isSellOreRunning ? '🪨 Đang Auto Bán Đá...' : '⚡ Đang Chạy Auto...')))}
                </span>
              ) : autoState.status === 'finished' ? (
                <span className="badge-status-auto-finished" title="Bot đã hoàn tất lượt auto">
                  ✅ {activeAutoType === 'farm' ? 'Đã Farm Xong' : (activeAutoType === 'diamond' ? 'Đã Xong Auto KC' : (activeAutoType === 'fish' ? 'Đã Xong Câu Cá' : 'Đã Hoàn Thành Auto'))}
                </span>
              ) : autoState.status === 'stopped' ? (
                <span className="badge-status-auto-stopped" title="Đã dừng tiến trình auto">
                  ⏹️ Đã Dừng Auto
                </span>
              ) : null}
            </div>
          </div>
        </div>
      </div>

      {/* In-Game Player Stats Panel */}
      <div className="acc-stats-panel">
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">💰 Xu Hiện Có (TK):</span>
          <span className="acc-stat-val acc-stat-xu">{formatNumber(coins)} Xu</span>
        </div>
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">🎯 Xu Cần Up:</span>
          <span className="acc-stat-val">{targetCoins > 0 ? `${formatNumber(targetCoins)} Xu` : 'Không đặt'}</span>
        </div>
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">💖 Tim Thu Được:</span>
          <span className="acc-stat-val acc-stat-tim">{formatNumber(collectedHearts)} Tim</span>
        </div>
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">📈 Xu Up Được:</span>
          <span className={`acc-stat-val ${Number(earnedCoins) < 0 ? 'acc-stat-loss' : 'acc-stat-gain'}`}>
            {formatNumber(earnedCoins)} Xu
          </span>
        </div>
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">📅 Ngày Bắt Đầu Up:</span>
          <span className="acc-stat-val">{startedAt && startedAt !== '--' ? startedAt : (isRunning ? 'Hôm nay' : '--')}</span>
        </div>
        <div className="acc-stat-box">
          <span className="acc-stat-lbl">⏳ Ngày Hết Hạn:</span>
          <span className="acc-stat-val">{expiresAt}</span>
        </div>

        {/* THÔNG SỐ LIVE TỪ GAME (CHỈ HIỆN KHI BẬT AUTO CÂU CÁ HOẶC AUTO KIM CƯƠNG / BÁN ĐÁ) */}
        {isFishRunning ? (
          <>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(34, 197, 94, 0.45)', background: 'rgba(34, 197, 94, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#4ade80' }}>⏳ Farming (Về Farm):</span>
              <span className="acc-stat-val" style={{ color: '#86efac', fontWeight: 700, fontSize: '0.95rem', fontFamily: 'monospace' }}>
                {(stats.farmingCountdown && stats.farmingCountdown !== '--:--') ? stats.farmingCountdown : (stats.farmingTime || '--:--')}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(6, 182, 212, 0.45)', background: 'rgba(6, 182, 212, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#22d3ee' }}>🎣 Cá câu được:</span>
              <span className="acc-stat-val" style={{ color: '#67e8f9', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.fishCaught !== undefined ? stats.fishCaught : 0}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(236, 72, 153, 0.45)', background: 'rgba(236, 72, 153, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#f472b6' }}>🦈 Cá mập:</span>
              <span className="acc-stat-val" style={{ color: '#fbcfe8', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.sharkCaught !== undefined ? stats.sharkCaught : 0}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(59, 130, 246, 0.45)', background: 'rgba(59, 130, 246, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#60a5fa' }}>💎 KCX (Kim Cương):</span>
              <span className="acc-stat-val" style={{ color: '#93c5fd', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.kcx !== undefined ? stats.kcx : (stats.fishKcx !== undefined ? stats.fishKcx : '+0')}
              </span>
            </div>
          </>
        ) : isSellOreRunning ? (
          <>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(245, 158, 11, 0.45)', background: 'rgba(245, 158, 11, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#fbbf24' }}>⏳ Thời gian:</span>
              <span className="acc-stat-val" style={{ color: '#fde68a', fontWeight: 700, fontSize: '0.95rem', fontFamily: 'monospace' }}>
                {stats.sellOreTime || '--:--'}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(16, 185, 129, 0.45)', background: 'rgba(16, 185, 129, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#34d399' }}>📍 Khu hiện tại:</span>
              <span className="acc-stat-val" style={{ color: '#6ee7b7', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.currentZone !== undefined && stats.currentZone !== null ? stats.currentZone : 0}
              </span>
            </div>
          </>
        ) : isDiamondRunning ? (
          <>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(59, 130, 246, 0.45)', background: 'rgba(59, 130, 246, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#60a5fa' }}>💎 KCX (Kim Cương):</span>
              <span className="acc-stat-val" style={{ color: '#93c5fd', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.kcx !== undefined ? stats.kcx : '+0'}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(168, 85, 247, 0.45)', background: 'rgba(168, 85, 247, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#c084fc' }}>🔮 NHB (Huyền Bí):</span>
              <span className="acc-stat-val" style={{ color: '#e9d5ff', fontWeight: 700, fontSize: '0.95rem' }}>
                {stats.nhb !== undefined ? stats.nhb : '+0'}
              </span>
            </div>
            <div className="acc-stat-box" style={{ borderColor: 'rgba(34, 197, 94, 0.45)', background: 'rgba(34, 197, 94, 0.12)' }}>
              <span className="acc-stat-lbl" style={{ color: '#4ade80' }}>⏳ Farming (Về Farm):</span>
              <span className="acc-stat-val" style={{ color: '#86efac', fontWeight: 700, fontSize: '0.95rem', fontFamily: 'monospace' }}>
                {(stats.farmingCountdown && stats.farmingCountdown !== '--:--') ? stats.farmingCountdown : (stats.farmingTime || '--:--')}
              </span>
            </div>
          </>
        ) : null}
      </div>

      <div className="acc-actions">
        {isRunning ? (
          <button className="btn btn-sm btn-danger" onClick={() => onStopAccount(account.id, account.username)}>
            ⏹️ Dừng Treo
          </button>
        ) : (
          <button className="btn btn-sm btn-primary" onClick={() => onStartAccount(account.id, account.username)}>
            ▶ Treo Nick Này
          </button>
        )}

        {/* 1. Bật Auto Dropdown Menu Button */}
        <div className="acc-dropdown-wrapper" ref={autoMenuRef}>
          <button
            type="button"
            className={`acc-auto-toggle-btn ${autoState.isRunning ? 'running' : ''} ${autoMenuOpen ? 'active' : ''}`}
            title="Kích hoạt nhanh các chức năng Auto (Auto Farm, Auto Kim Cương, Auto Fish, Auto Bán Đá...)"
            onClick={() => setAutoMenuOpen(!autoMenuOpen)}
          >
            {autoState.isRunning ? (autoState.autoType === 'farm' ? '🌾 Đang Farm...' : (autoState.autoType === 'diamond' ? '💎 Đang Đào KC...' : (autoState.autoType === 'fish' ? '🎣 Đang Câu Cá...' : (isSellOreRunning ? '🪨 Đang Bán Đá...' : '⚡ Đang Chạy Auto...')))) : '🎮 Bật Auto'} {autoMenuOpen ? '▲' : '▼'}
          </button>

          {autoMenuOpen && (
            <div className="acc-floating-menu" style={{ minWidth: '250px' }}>
              <div className="acc-floating-header">
                🎮 Điều Khiển Auto ({account.username})
                <span style={{ display: 'block', fontSize: '0.72rem', color: isFishMod ? '#38bdf8' : '#c084fc', fontWeight: 500 }}>
                  {isFishMod ? '🎣 Auto up câu cá' : '💎 Auto Up kim cương'}
                </span>
              </div>
              
              {isFishMod ? (
                /* HIỆN CÂU CÁ, FARM, BÁN ĐÁ KHI CHỌN BẢN AUTO UP CÂU CÁ (ẨN KIM CƯƠNG) */
                <>
                  {/* Auto Fish Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isFishRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('fish', isFishRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isFishRunning ? '⏹️' : '🐟'}</span>
                    <div className="acc-menu-text">
                      <strong>{isFishRunning ? 'Dừng Auto Câu Cá' : 'Bật Auto Câu Cá'}</strong>
                      <small>{isFishRunning ? 'Đang câu cá -> Nhấn để dừng' : 'Tự động quăng cần & giật cá'}</small>
                    </div>
                  </button>

                  {/* Auto Farm Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isFarmRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isFarmRunning ? '⏹️' : '🌾'}</span>
                    <div className="acc-menu-text">
                      <strong>{isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}</strong>
                      <small>{isFarmRunning ? 'Đang chạy -> Nhấn để dừng' : 'Chăm sóc, tưới, thu hoạch ngay'}</small>
                    </div>
                  </button>

                  {/* Auto Sell Ore Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isSellOreRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isSellOreRunning ? '⏹️' : '🪨'}</span>
                    <div className="acc-menu-text">
                      <strong>{isSellOreRunning ? 'Dừng Auto Bán Đá' : 'Bật Auto Bán Đá'}</strong>
                      <small>{isSellOreRunning ? 'Đang bán đá -> Nhấn để dừng' : 'Tự bán đá & ngọc cho Thợ Kim Hoàn'}</small>
                    </div>
                  </button>
                </>
              ) : (
                /* HIỆN KIM CƯƠNG, FARM, BÁN ĐÁ KHI CHỌN BẢN AUTO UP KIM CƯƠNG (ẨN CÂU CÁ) */
                <>
                  {/* Auto Diamond Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isDiamondRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('diamond', isDiamondRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isDiamondRunning ? '⏹️' : '💎'}</span>
                    <div className="acc-menu-text">
                      <strong>{isDiamondRunning ? 'Dừng Auto Kim Cương' : 'Bật Auto Kim Cương'}</strong>
                      <small>{isDiamondRunning ? 'Đang đào mỏ -> Nhấn để dừng' : 'Tự đào mỏ, bán đá, về farm'}</small>
                    </div>
                  </button>

                  {/* Auto Farm Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isFarmRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isFarmRunning ? '⏹️' : '🌾'}</span>
                    <div className="acc-menu-text">
                      <strong>{isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}</strong>
                      <small>{isFarmRunning ? 'Đang chạy -> Nhấn để dừng' : 'Chăm sóc, tưới, thu hoạch ngay'}</small>
                    </div>
                  </button>

                  {/* Auto Sell Ore Option */}
                  <button
                    type="button"
                    className={`acc-menu-item ${isSellOreRunning ? 'danger' : ''}`}
                    onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}
                  >
                    <span className="acc-menu-icon">{isSellOreRunning ? '⏹️' : '🪨'}</span>
                    <div className="acc-menu-text">
                      <strong>{isSellOreRunning ? 'Dừng Auto Bán Đá' : 'Bật Auto Bán Đá'}</strong>
                      <small>{isSellOreRunning ? 'Đang bán đá -> Nhấn để dừng' : 'Tự bán đá & ngọc cho Thợ Kim Hoàn'}</small>
                    </div>
                  </button>
                </>
              )}

              {/* Stop All Auto Option if running */}
              {autoState.isRunning && (
                <button
                  type="button"
                  className="acc-menu-item danger"
                  style={{ borderTop: '1px solid rgba(255,255,255,0.08)', marginTop: '4px' }}
                  onClick={() => handleTriggerAutoAction('all', 'stop')}
                >
                  <span className="acc-menu-icon">🛑</span>
                  <div className="acc-menu-text">
                    <strong style={{ color: '#f87171' }}>Dừng Tất Cả Auto</strong>
                    <small>Hủy bỏ mọi tác vụ bot đang chạy</small>
                  </div>
                </button>
              )}
            </div>
          )}
        </div>

        {/* 2. Cài Đặt Mod Dropdown Menu Button */}
        <div className="acc-dropdown-wrapper" ref={menuRef}>
          <button
            type="button"
            className={`acc-setup-toggle-btn ${menuOpen ? 'active' : ''}`}
            title="Chọn chức năng cài đặt (Up thuê, Farm, Kim cương, Câu cá, Bán đá...)"
            onClick={() => setMenuOpen(!menuOpen)}
          >
            ⚙️ Cài Đặt Mod {menuOpen ? '▲' : '▼'}
          </button>

          {menuOpen && (
            <div className="acc-floating-menu menu-right">
              <div className="acc-floating-header">Cấu Hình Mod ({account.username})</div>
              <button
                type="button"
                className="acc-menu-item"
                onClick={() => handleSelectFeature('upThue')}
              >
                <span className="acc-menu-icon">💰</span>
                <div className="acc-menu-text">
                  <strong>Cài Đặt Up Thuê</strong>
                  <small>Xu cần up, số ngày up, reset</small>
                </div>
              </button>
              <button
                type="button"
                className="acc-menu-item"
                onClick={() => handleSelectFeature('farm')}
              >
                <span className="acc-menu-icon">🌾</span>
                <div className="acc-menu-text">
                  <strong>Cài Đặt Auto Farm</strong>
                  <small>Tưới nước, bắt sâu, thu hoạch</small>
                </div>
              </button>
              {isFishMod ? (
                <button
                  type="button"
                  className="acc-menu-item"
                  onClick={() => handleSelectFeature('fish')}
                >
                  <span className="acc-menu-icon">🐟</span>
                  <div className="acc-menu-text">
                    <strong>Cài Đặt Auto Câu Cá</strong>
                    <small>Tự câu, cần câu, bán cá, về farm</small>
                  </div>
                </button>
              ) : (
                <button
                  type="button"
                  className="acc-menu-item"
                  onClick={() => handleSelectFeature('diamond')}
                >
                  <span className="acc-menu-icon">💎</span>
                  <div className="acc-menu-text">
                    <strong>Cài Đặt Auto KC</strong>
                    <small>Đào quặng, bán đá, về farm</small>
                  </div>
                </button>
              )}
              <button
                type="button"
                className="acc-menu-item"
                onClick={() => handleSelectFeature('sellOre')}
              >
                <span className="acc-menu-icon">🪨</span>
                <div className="acc-menu-text">
                  <strong>Cài Đặt Auto Bán Đá</strong>
                  <small>Thời gian bán, quãng nghỉ, khu bán, KCX/NHB</small>
                </div>
              </button>
            </div>
          )}
        </div>

        <button className="btn btn-sm btn-secondary" onClick={() => onOpenEditAccount(account)}>
          ✏️ Sửa
        </button>
        <button className="btn btn-sm btn-danger" onClick={() => onDeleteAccount(account.id, account.username)}>
          🗑️
        </button>
      </div>
    </div>
  );
};
