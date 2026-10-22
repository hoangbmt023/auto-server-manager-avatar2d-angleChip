/**
 * AccountActions Component (Presentation & Adapter Layer)
 * Manages action triggers (Start/Stop, Auto Actions dropdown, Setup menu, Edit/Delete).
 */
window.AccountActions = function AccountActions({
  account,
  isRunning,
  autoState,
  stats,
  modType,
  isFishMod,
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
  const [menuOpen, setMenuOpen] = React.useState(false);
  const [autoMenuOpen, setAutoMenuOpen] = React.useState(false);
  const [moreMenuOpen, setMoreMenuOpen] = React.useState(false);

  const [isStarting, setIsStarting] = React.useState(false);

  const menuRef = React.useRef(null);
  const autoMenuRef = React.useRef(null);
  const moreMenuRef = React.useRef(null);

  const isRentalExpired = Boolean(account.rentalExpiresAt && new Date(account.rentalExpiresAt).getTime() < Date.now());

  // Close dropdown menus on outside click
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
    if (isRentalExpired && action === 'start') {
      if (onRenewAccount) onRenewAccount(account);
      return;
    }
    if (onTriggerAuto) onTriggerAuto(account.id, autoType, action);
  };

  const planFeatures = React.useMemo(() => {
    if (!account.rentalPlan) return null; // Nick Admin/Nội bộ có full quyền
    if (account.allowedFeatures && Array.isArray(account.allowedFeatures)) return account.allowedFeatures;
    if (account.rentalPlan === 'FULL') return ['farm', 'fish', 'diamond', 'sellOre', 'upThue'];
    if (account.rentalPlan === 'FISH') return ['fish', 'upThue'];
    return ['farm', 'upThue'];
  }, [account.rentalPlan, account.allowedFeatures]);

  const canUse = (feat) => !planFeatures || planFeatures.includes(feat);

  const isAutoRunning = Boolean(autoState.isRunning || (stats.isAutoRunning && stats.autoType));
  const activeAutoType = autoState.autoType || stats.autoType || null;
  const subTask = autoState.subTask || null;

  const isFarmRunning = isAutoRunning && (activeAutoType === 'farm' && !subTask);
  const isDiamondRunning = isAutoRunning && (activeAutoType === 'diamond' || activeAutoType === 'kc');
  const isFishRunning = isAutoRunning && (activeAutoType === 'fish' || activeAutoType === 'cau_ca');
  const isSellOreRunning = isAutoRunning && (activeAutoType === 'sell_ore' || activeAutoType === 'banda' || activeAutoType === 'stone' || subTask === 'sell_ore' || subTask === 'banda');

  const allowFish = account.rentalPlan ? canUse('fish') : (canUse('fish') && (modType === 'chipmix' || isFishMod));
  const allowDiamond = account.rentalPlan ? canUse('diamond') : (canUse('diamond') && (modType === 'chipmix' || !isFishMod));
  const allowFarm = canUse('farm');
  const allowSellOre = canUse('sellOre');

  return (
    <div className="acc-action-bar">
      {/* Play / Stop / Renew Button */}
      {isRunning ? (
        <button
          className="btn btn-sm btn-danger"
          disabled={isStarting}
          onClick={async () => {
            if (isStarting) return;
            setIsStarting(true);
            try {
              if (onStopAccount) await onStopAccount(account.id, account.username);
            } finally {
              setTimeout(() => setIsStarting(false), 2000);
            }
          }}
          title="Dừng bot này"
        >
          <window.Icon name="stop" size={13} /> {isStarting ? '...' : 'Dừng'}
        </button>
      ) : isRentalExpired ? (
        <button
          className="btn btn-sm btn-renew-action"
          onClick={() => onRenewAccount && onRenewAccount(account)}
          title="Tài khoản đã hết hạn thuê! Bấm để gia hạn / đổi gói ngay"
        >
          <window.Icon name="zap" size={13} color="#fff" /> Gia Hạn / Đổi Gói
        </button>
      ) : (
        <button
          className="btn btn-sm btn-primary"
          disabled={isStarting}
          onClick={async () => {
            if (isStarting) return;
            setIsStarting(true);
            try {
              if (onStartAccount) await onStartAccount(account.id, account.username);
            } finally {
              setTimeout(() => setIsStarting(false), 2000);
            }
          }}
          title="Chạy bot này"
        >
          <window.Icon name="play" size={13} /> {isStarting ? '...' : 'Treo'}
        </button>
      )}

      {/* Auto Actions Dropdown */}
      <div className="acc-action-dropdown-grow" ref={autoMenuRef}>
        <button
          type="button"
          className={`btn btn-sm btn-auto-trigger ${autoState.isRunning ? 'btn-active' : 'btn-secondary'}`}
          onClick={() => setAutoMenuOpen(!autoMenuOpen)}
        >
          <window.Icon name="zap" size={13} color={autoState.isRunning ? 'var(--apple-blue)' : 'currentColor'} />
          {autoState.isRunning ? 'Đang Auto' : 'Auto'}
          <window.Icon name="chevronDown" size={12} />
        </button>

        {autoMenuOpen && (
          <div className="dropdown-menu-glass">
            <div className="dropdown-header-glass">
              <window.Icon name={account.rentalPlan === 'FULL' ? 'zap' : (account.rentalPlan === 'FISH' || isFishMod) ? 'fish' : 'sprout'} size={12} />
              {account.rentalPlan ? (account.rentalPlanName || `GÓI ${account.rentalPlan}`) : (modType === 'chipmix' ? 'CHIPMIX FULL AUTO' : isFishMod ? 'AUTO UP CÂU CÁ' : 'AUTO UP KIM CƯƠNG')}
            </div>

            {allowFish && (
              <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('fish', isFishRunning ? 'stop' : 'start')}>
                <window.Icon name={isFishRunning ? 'stop' : 'fish'} size={14} />
                {isFishRunning ? 'Dừng Auto Câu cá' : 'Bật Auto Câu cá'}
              </button>
            )}
            {allowDiamond && (
              <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('diamond', isDiamondRunning ? 'stop' : 'start')}>
                <window.Icon name={isDiamondRunning ? 'stop' : 'gem'} size={14} />
                {isDiamondRunning ? 'Dừng Auto KC' : 'Bật Auto KC'}
              </button>
            )}
            {allowFarm && (
              <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('farm', isFarmRunning ? 'stop' : 'start')}>
                <window.Icon name={isFarmRunning ? 'stop' : 'sprout'} size={14} />
                {isFarmRunning ? 'Dừng Auto Farm' : 'Bật Auto Farm'}
              </button>
            )}
            {allowSellOre && (
              <button className="dropdown-item-glass" onClick={() => handleTriggerAutoAction('sell_ore', isSellOreRunning ? 'stop' : 'start')}>
                <window.Icon name={isSellOreRunning ? 'stop' : 'rock'} size={14} />
                {isSellOreRunning ? 'Dừng Auto Bán đá' : 'Bật Auto Bán đá'}
              </button>
            )}

            {autoState.isRunning && (
              <button className="dropdown-item-glass dropdown-item-danger" onClick={() => handleTriggerAutoAction('all', 'stop')}>
                <window.Icon name="stop" size={14} color="var(--apple-red)" /> Dừng Tất Cả Auto
              </button>
            )}
          </div>
        )}
      </div>

      {/* Mod Settings Dropdown */}
      <div className="acc-action-dropdown-rel" ref={menuRef}>
        <button
          type="button"
          className="btn btn-sm btn-secondary btn-settings-trigger"
          onClick={() => setMenuOpen(!menuOpen)}
          title="Cài đặt Mod"
        >
          <window.Icon name="settings" size={13} />
          <window.Icon name="chevronDown" size={11} />
        </button>

        {menuOpen && (
          <div className="dropdown-menu-glass">
            {canUse('upThue') && (
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('upThue')}>
                <window.Icon name="coins" size={14} /> Cài Đặt Úp Thuê
              </button>
            )}
            {allowFarm && (
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('farm')}>
                <window.Icon name="sprout" size={14} /> Cài Đặt Auto Farm
              </button>
            )}
            {allowFish && (
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('fish')}>
                <window.Icon name="fish" size={14} /> Cài Đặt Auto Câu cá
              </button>
            )}
            {allowDiamond && (
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('diamond')}>
                <window.Icon name="gem" size={14} /> Cài Đặt Auto KC
              </button>
            )}
            {allowSellOre && (
              <button className="dropdown-item-glass" onClick={() => handleSelectFeature('sellOre')}>
                <window.Icon name="rock" size={14} /> Cài Đặt Auto Bán đá
              </button>
            )}
          </div>
        )}
      </div>

      {/* More Options Dropdown (Edit, Delete) */}
      <div className="acc-action-dropdown-rel" ref={moreMenuRef}>
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
            {Boolean(account.rentalPlan) && (
              <button
                className="dropdown-item-glass dropdown-item-renew"
                onClick={() => { setMoreMenuOpen(false); onRenewAccount && onRenewAccount(account); }}
              >
                <window.Icon name="clock" size={14} color="var(--apple-gold)" /> Gia Hạn / Đổi Gói
              </button>
            )}
            <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onOpenEditAccount && onOpenEditAccount(account); }}>
              <window.Icon name="edit" size={14} /> Chỉnh Sửa Nick
            </button>
            <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onOpenLogs && onOpenLogs(account); }}>
              <window.Icon name="terminal" size={14} color="var(--apple-blue)" /> Xem Nhật Ký Bot
            </button>
            <button className="dropdown-item-glass dropdown-item-danger" onClick={() => { setMoreMenuOpen(false); onDeleteAccount && onDeleteAccount(account.id, account.username); }}>
              <window.Icon name="trash" size={14} color="var(--apple-red)" /> Xóa Tài Khoản
            </button>
            {(() => {
              const currentUser = window.authService?.getCurrentUser ? window.authService.getCurrentUser() : null;
              const isUser = Boolean(account?.isUserView || (currentUser && String(currentUser.role || '').toUpperCase() !== 'ADMIN'));
              if (!onInspectRms || isUser) return null;
              return (
                <>
                  <div className="dropdown-divider-glass" />
                  <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onInspectRms(account); }}>
                    <window.Icon name="search" size={14} color="var(--apple-blue)" /> Kiểm Tra RMS Game
                  </button>
                </>
              );
            })()}
          </div>
        )}
      </div>
    </div>
  );
};
