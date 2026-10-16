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
  onOpenLogs
}) {
  const [menuOpen, setMenuOpen] = React.useState(false);
  const [autoMenuOpen, setAutoMenuOpen] = React.useState(false);
  const [moreMenuOpen, setMoreMenuOpen] = React.useState(false);

  const menuRef = React.useRef(null);
  const autoMenuRef = React.useRef(null);
  const moreMenuRef = React.useRef(null);

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
    if (onTriggerAuto) onTriggerAuto(account.id, autoType, action);
  };

  const isAutoRunning = Boolean(autoState.isRunning || (stats.isAutoRunning && stats.autoType));
  const activeAutoType = autoState.autoType || stats.autoType || null;
  const subTask = autoState.subTask || null;

  const isFarmRunning = isAutoRunning && (activeAutoType === 'farm' && !subTask);
  const isDiamondRunning = isAutoRunning && (activeAutoType === 'diamond' || activeAutoType === 'kc');
  const isFishRunning = isAutoRunning && (activeAutoType === 'fish' || activeAutoType === 'cau_ca');
  const isSellOreRunning = isAutoRunning && (activeAutoType === 'sell_ore' || activeAutoType === 'banda' || activeAutoType === 'stone' || subTask === 'sell_ore' || subTask === 'banda');

  return (
    <div className="acc-action-bar">
      {/* Play / Stop Button */}
      {isRunning ? (
        <button
          className="btn btn-sm btn-danger"
          onClick={() => onStopAccount && onStopAccount(account.id, account.username)}
          title="Dừng bot này"
        >
          <window.Icon name="stop" size={13} /> Dừng
        </button>
      ) : (
        <button
          className="btn btn-sm btn-primary"
          onClick={() => onStartAccount && onStartAccount(account.id, account.username)}
          title="Chạy bot này"
        >
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
            <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onOpenEditAccount && onOpenEditAccount(account); }}>
              <window.Icon name="edit" size={14} /> Chỉnh Sửa Nick
            </button>
            <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onOpenLogs && onOpenLogs(account); }}>
              <window.Icon name="terminal" size={14} color="var(--apple-blue)" /> Xem Nhật Ký Bot
            </button>
            <button className="dropdown-item-glass" style={{ color: 'var(--apple-red)' }} onClick={() => { setMoreMenuOpen(false); onDeleteAccount && onDeleteAccount(account.id, account.username); }}>
              <window.Icon name="trash" size={14} color="var(--apple-red)" /> Xóa Tài Khoản
            </button>
            {onInspectRms && !account.isUserView && (
              <>
                <div style={{ height: '1px', background: 'var(--glass-border-subtle)', margin: '4px 0' }} />
                <button className="dropdown-item-glass" onClick={() => { setMoreMenuOpen(false); onInspectRms(account); }}>
                  <window.Icon name="search" size={14} color="var(--apple-blue)" /> Kiểm Tra RMS Game
                </button>
              </>
            )}
          </div>
        )}
      </div>
    </div>
  );
};
