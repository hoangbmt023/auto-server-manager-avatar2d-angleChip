/**
 * DashboardPage Component (Pages Layer)
 * Porsche & Apple Minimalist Split-Layout (Sidebar on Left, Accounts on Right)
 * Cleaned & decoupled with useApp, useModals, and useCapacityLimits.
 */
window.DashboardPage = function DashboardPage() {
  const {
    status,
    files,
    proxies,
    activeFileId,
    activeFile,
    fileAccounts,
    accounts,
    logs,
    logFilter,
    setLogFilter,
    autoScroll,
    setAutoScroll,
    terminalRef,
    theme,
    toggleTheme,
    runningHm,
    runningDk,
    runningTotal,
    availableJars,
    fetchJars,
    fetchProxies,
    fetchAccounts,
    fetchFiles,
    handleStartAccount,
    handleStopAccount,
    handleStartAllFile,
    handleStopAll,
    handleRestartAll,
    handleSwitchServer,
    handleDeleteAccount,
    handleSwitchFile,
    handleDeleteFile,
    handleSaveProxy,
    handleDeleteProxy,
    handleClearLogs,
    handleDownloadLogs,
    handleInstallJre,
    handleTriggerAuto
  } = window.useApp();

  const {
    accountModal,
    setAccountModal,
    openAccountModal,
    fileModal,
    setFileModal,
    openFileModal,
    proxyModal,
    setProxyModal,
    openProxyModal,
    settingsModal,
    setSettingsModal,
    openSettingsModal,
    setupModal,
    setSetupModal,
    openSetupModal,
    jreProgress
  } = window.useModals();

  const {
    maxHmTotal,
    maxDkTotal,
    maxAccountsTotal,
    fileMaxAccounts,
    fileMaxHm,
    fileMaxDk,
    totalHmCount,
    totalDkCount,
    expiredProxies,
    getSlotCapacity
  } = window.useCapacityLimits(accounts, fileAccounts, proxies, activeFile);

  const isAnyRunning = Boolean(status?.bot?.runningCount > 0 || status?.bot?.running);

  // Per-IP Slot & Search States
  const [activeIpSlot, setActiveIpSlot] = React.useState('all');
  const [searchQuery, setSearchQuery] = React.useState('');
  const [searchOpen, setSearchOpen] = React.useState(false);
  const [ipDropdownOpen, setIpDropdownOpen] = React.useState(false);
  const searchWrapperRef = React.useRef(null);
  const ipDropdownRef = React.useRef(null);

  // Close dropdowns on outside click
  React.useEffect(() => {
    function handleClickOutside(event) {
      if (searchWrapperRef.current && !searchWrapperRef.current.contains(event.target)) {
        setSearchOpen(false);
      }
      if (ipDropdownRef.current && !ipDropdownRef.current.contains(event.target)) {
        setIpDropdownOpen(false);
      }
    }
    document.addEventListener('mousedown', handleClickOutside);
    document.addEventListener('touchstart', handleClickOutside);
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
      document.removeEventListener('touchstart', handleClickOutside);
    };
  }, []);

  // Validate activeIpSlot if proxy was removed
  React.useEffect(() => {
    if (activeIpSlot !== 'all' && activeIpSlot !== 'direct') {
      const exists = (proxies || []).some(p => p.id === activeIpSlot);
      if (!exists) {
        setActiveIpSlot('all');
      }
    }
  }, [proxies, activeIpSlot]);

  // Filter accounts for current active IP tab
  const displayedAccounts = (fileAccounts || []).filter(a => {
    if (activeIpSlot === 'all') return true;
    if (activeIpSlot === 'direct') return !a.proxyId || a.proxyId === '';
    return a.proxyId === activeIpSlot;
  });

  // Global Search results across ALL files
  const searchResults = (accounts || []).filter(a => {
    if (!searchQuery.trim()) return false;
    const q = searchQuery.toLowerCase().trim();
    const u = (a.username || '').toLowerCase();
    const n = (a.note || '').toLowerCase();
    const f = (files || []).find(file => file.id === a.fileId)?.name?.toLowerCase() || '';
    return u.includes(q) || n.includes(q) || f.includes(q);
  });

  const handleSelectSearchAccount = (acc) => {
    const targetSlot = acc.proxyId ? acc.proxyId : 'direct';
    setSearchOpen(false);
    setSearchQuery('');

    if (acc.fileId && acc.fileId !== activeFileId) {
      handleSwitchFile(acc.fileId);
    }

    setActiveIpSlot(targetSlot);

    setTimeout(() => {
      const el = document.getElementById(`acc-card-${acc.id}`);
      if (el) {
        el.scrollIntoView({ behavior: 'smooth', block: 'center' });
      }
    }, 250);
  };

  const slotCapacityAll = getSlotCapacity('all');
  const slotCapacityDirect = getSlotCapacity('direct');
  const currentSlotCapacity = getSlotCapacity(activeIpSlot);

  return (
    <div className="app-container">
      {/* 1. Header / Navbar */}
      <window.Navbar
        isAnyRunning={isAnyRunning}
        runningCount={status?.bot?.runningCount || 0}
        status={status}
        theme={theme}
        toggleTheme={toggleTheme}
        onOpenSettings={openSettingsModal}
      />

      {/* 2. Main Content Grid */}
      <main className="dashboard-grid">

        {/* JRE Missing Alert Banner */}
        {status?.java && !status.java.available && (
          <section className="alert-banner">
            <div className="alert-banner-top" style={{ display: 'flex', alignItems: 'center', gap: '14px', flex: '1 1 auto' }}>
              <div className="alert-banner-icon-wrap">
                <window.Icon name="alert" size={22} color="var(--apple-orange)" />
              </div>
              <div className="alert-banner-content">
                <div className="alert-banner-header">
                  <h4>Chưa phát hiện Java Runtime trên máy chủ</h4>
                </div>
                <p>Hệ thống hỗ trợ tự động tải và giải nén bản Portable OpenJDK 17 tương thích với hosting.</p>
              </div>
            </div>
            <div className="alert-banner-actions">
              <button className="btn btn-primary btn-sm" onClick={handleInstallJre}>
                <window.Icon name="zap" size={14} /> Tự động cài Portable Java ngay
              </button>
            </div>
          </section>
        )}

        {/* JRE Installation Progress */}
        {jreProgress.visible && (
          <div className="progress-container">
            <div className="progress-bar">
              <div className="progress-fill" style={{ width: `${jreProgress.percent}%` }}></div>
            </div>
            <span className="progress-text">{jreProgress.message || 'Đang cài đặt Java...'}</span>
          </div>
        )}

        {/* Live Terminal Console (macOS Window) */}
        <window.TerminalConsole
          logs={logs}
          accounts={accounts}
          logFilter={logFilter}
          setLogFilter={setLogFilter}
          autoScroll={autoScroll}
          setAutoScroll={setAutoScroll}
          terminalRef={terminalRef}
          isAnyRunning={isAnyRunning}
          onStartAllFile={handleStartAllFile}
          onStopAll={handleStopAll}
          onRestartAll={handleRestartAll}
          onClearLogs={handleClearLogs}
          onDownloadLogs={handleDownloadLogs}
        />

        {/* Expired Proxies Alert Banner */}
        {expiredProxies.length > 0 && (
          <section className="alert-banner alert-banner-danger">
            <div className="alert-banner-top" style={{ display: 'flex', alignItems: 'flex-start', gap: '14px', flex: '1 1 auto' }}>
              <div className="alert-banner-icon-wrap">
                <window.Icon name="shield" size={22} color="var(--apple-red)" />
              </div>
              <div className="alert-banner-content">
                <div className="alert-banner-header">
                  <h4>CẢNH BÁO: Phát hiện {expiredProxies.length} Proxy đã HẾT HẠN hoặc LỖI XÁC THỰC!</h4>
                </div>
                <p>
                  Danh sách proxy hết hạn: <strong>{expiredProxies.map(p => `${p.name} (${p.host}:${p.port})`).join(', ')}</strong>.
                  <br />
                  Các tài khoản gán proxy này sẽ không thể đăng nhập hoặc đã bị ngắt kết nối an toàn.
                </p>
              </div>
            </div>
            <div className="alert-banner-actions">
              <button
                className="btn btn-danger btn-sm"
                onClick={() => openProxyModal('expired')}
              >
                <window.Icon name="globe" size={14} /> Quản Lý Proxy Hết Hạn
              </button>
            </div>
          </section>
        )}

        {/* 3. 2-COLUMN SPLIT LAYOUT: LEFT SIDEBAR (File & Control) + RIGHT PANE (Accounts Grid) */}
        <section className="accounts-split-layout">
          {/* Left Sidebar Pane */}
          <aside className="accounts-sidebar-pane">
            <div className="sidebar-header">
              <div className="sidebar-title-group">
                <div className="sidebar-icon-box">
                  <window.Icon name="layers" size={18} />
                </div>
                <div>
                  <h3>Hồ Sơ & Quản Lý</h3>
                  <span className="sidebar-sub">Chọn File hồ sơ hoặc tạo mới</span>
                </div>
              </div>
            </div>

            {/* Quick Management Actions */}
            <div className="sidebar-actions">
              <button
                className="btn btn-primary btn-sm btn-block"
                onClick={() => openAccountModal(null)}
              >
                <window.Icon name="plus" size={14} /> Thêm Tài Khoản
              </button>
              <div className="sidebar-btn-grid">
                <button
                  className="btn btn-secondary btn-sm"
                  onClick={() => openFileModal(null)}
                >
                  <window.Icon name="folder" size={14} /> File {files?.length > 0 && `(${files.length})`}
                </button>
                <button
                  className="btn btn-secondary btn-sm"
                  onClick={() => openProxyModal('all')}
                >
                  <window.Icon name="globe" size={14} /> Proxy {proxies?.length > 0 && `(${proxies.length})`}
                </button>
              </div>
            </div>

            {/* File Profiles Vertical List */}
            <div className="sidebar-file-list-wrap">
              <span className="sidebar-section-lbl">DANH SÁCH FILE BOT</span>
              <window.FileTabsBar
                files={files}
                activeFileId={activeFileId}
                onSwitchFile={handleSwitchFile}
              />
            </div>

            {/* Real-time Server Limit Counters */}
            <window.ServerLimitBanner
              runningHm={runningHm}
              runningDk={runningDk}
              runningTotal={runningTotal}
              maxHm={maxHmTotal}
              maxDk={maxDkTotal}
              maxTotal={maxAccountsTotal}
            />
          </aside>

          {/* Right Main Pane: Accounts Grid */}
          <div className="accounts-main-pane">
            <div className="main-pane-header">
              <div style={{ display: 'flex', alignItems: 'center', gap: '10px', minWidth: '220px' }}>
                <div className="sidebar-icon-box">
                  <window.Icon name="users" size={18} />
                </div>
                <div>
                  <h3 style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
                    {activeFile?.name || 'File Bot'}
                  </h3>
                  <span className="sidebar-sub" style={{ display: 'flex', alignItems: 'center', gap: '6px', flexWrap: 'wrap' }}>
                    <span>{activeFile?.modType === 'chipmix' ? '⚡ Bản ChipMix Full' : activeFile?.modType === 'fish' ? '🎣 Auto Câu Cá' : '💎 Auto Kim Cương'}</span>
                    <span>•</span>
                    <span>Tổng: <strong style={{ color: 'var(--text-primary)' }}>{fileAccounts.length}/{fileMaxAccounts}</strong> nick</span>
                    <span>•</span>
                    <span style={{
                      padding: '1px 7px',
                      borderRadius: '999px',
                      background: 'rgba(10, 132, 255, 0.1)',
                      border: '1px solid rgba(10, 132, 255, 0.25)',
                      color: 'var(--apple-blue)',
                      fontWeight: 600,
                      fontSize: '0.72rem'
                    }}>
                      HM: {totalHmCount}/{fileMaxHm}
                    </span>
                    <span>|</span>
                    <span style={{
                      padding: '1px 7px',
                      borderRadius: '999px',
                      background: 'rgba(191, 90, 242, 0.1)',
                      border: '1px solid rgba(191, 90, 242, 0.25)',
                      color: 'var(--apple-purple)',
                      fontWeight: 600,
                      fontSize: '0.72rem'
                    }}>
                      DK: {totalDkCount}/{fileMaxDk}
                    </span>
                  </span>
                </div>
              </div>

              {/* Header Search & IP Dropdown Selector */}
              <div className="main-pane-tools-cluster">
                {/* 1. Global Search Box */}
                <div className="main-search-wrapper" ref={searchWrapperRef}>
                  <div className="main-search-box">
                    <window.Icon name="search" size={16} color="var(--text-tertiary)" />
                    <input
                      type="text"
                      className="main-search-input"
                      placeholder="Tìm tài khoản, mô tả..."
                      value={searchQuery}
                      onChange={(e) => {
                        setSearchQuery(e.target.value);
                        setSearchOpen(Boolean(e.target.value.trim()));
                      }}
                      onFocus={() => {
                        if (searchQuery.trim()) setSearchOpen(true);
                      }}
                    />
                    {searchQuery && (
                      <button
                        type="button"
                        className="search-clear-btn"
                        onClick={() => {
                          setSearchQuery('');
                          setSearchOpen(false);
                        }}
                        title="Xóa tìm kiếm"
                      >
                        <window.Icon name="x" size={12} />
                      </button>
                    )}
                  </div>

                  {searchOpen && (
                    <div className="search-dropdown-menu">
                      <div className="search-dropdown-header">
                        <span>KẾT QUẢ TÌM KIẾM TOÀN CỤC ({searchResults.length})</span>
                        <span style={{ fontSize: '0.62rem', color: 'var(--text-tertiary)' }}>Nhấp để nhảy tới nick</span>
                      </div>
                      {searchResults.length === 0 ? (
                        <div className="search-no-result">Không tìm thấy tài khoản nào khớp "{searchQuery}"</div>
                      ) : (
                        searchResults.map(acc => {
                          const p = (proxies || []).find(x => x.id === acc.proxyId);
                          const tabName = p ? p.name : 'IP Mặc định';
                          const sName = acc.serverId === 1 ? 'Diệu Kỳ' : 'Hoàn Mỹ';
                          const fileObj = (files || []).find(f => f.id === acc.fileId);
                          return (
                            <div
                              key={acc.id}
                              className="search-result-item"
                              onClick={() => handleSelectSearchAccount(acc)}
                            >
                              <div className="search-result-user">
                                <window.Icon name="user" size={13} color="var(--apple-blue)" />
                                <strong style={{ color: 'var(--text-primary)' }}>{acc.username}</strong>
                                <span className={`badge-server-sm ${acc.serverId === 1 ? 'dk' : 'hm'}`}>
                                  {sName}
                                </span>
                                <span className="badge-file-sm" title={`File hồ sơ: ${fileObj ? fileObj.name : 'Mặc định'}`}>
                                  <window.Icon name="folder" size={10} />
                                  {fileObj ? fileObj.name : 'File'}
                                </span>
                                <span className="badge-ip-slot" title={`Tab mạng: ${tabName}`}>
                                  <window.Icon name={p ? 'shield' : 'globe'} size={10} />
                                  {tabName}
                                </span>
                                {acc.isRunning && (
                                  <span className="badge-online-dot" title="Đang online"></span>
                                )}
                              </div>
                              {acc.note && <div className="search-result-note">{acc.note}</div>}
                            </div>
                          );
                        })
                      )}
                    </div>
                  )}
                </div>

                {/* 2. Dropdown Selector to Switch IP Tabs */}
                <div className="ip-selector-dropdown-wrapper" ref={ipDropdownRef}>
                  <button
                    type="button"
                    className="btn btn-secondary btn-sm ip-dropdown-btn"
                    onClick={() => setIpDropdownOpen(!ipDropdownOpen)}
                  >
                    <window.Icon name="globe" size={15} color="var(--apple-blue)" />
                    <span className="ip-btn-title">{currentSlotCapacity.label}</span>
                    <span className="ip-btn-badge" title="[Online file này / Slot còn lại toàn server]">
                      {currentSlotCapacity.badgeCount}
                    </span>
                    <window.Icon name="chevronDown" size={12} color="var(--text-tertiary)" />
                  </button>

                  {ipDropdownOpen && (
                    <div className="ip-dropdown-menu">
                      <div className="ip-dropdown-header">CHỌN TAB IP QUẢN LÝ (6 NICK/IP TOÀN SERVER)</div>

                      {/* 1. Tất Cả IP */}
                      <div
                        className={`ip-dropdown-item all-item ${activeIpSlot === 'all' ? 'selected' : ''}`}
                        onClick={() => {
                          setActiveIpSlot('all');
                          setIpDropdownOpen(false);
                        }}
                      >
                        <div className="ip-item-title">
                          <strong style={{ color: 'var(--apple-blue)' }}>Tất Cả IP (Toàn Bộ Nick)</strong>
                          <span className="ip-item-count">{slotCapacityAll.badgeCount} slot</span>
                        </div>
                        <div className="ip-item-sub">
                          <span>File này: {slotCapacityAll.fileTotal} nick ({slotCapacityAll.fileRunning} Online)</span> • <span>Server còn: {slotCapacityAll.serverRemaining} slot trống</span>
                        </div>
                      </div>

                      {/* 2. IP Mặc Định */}
                      <div
                        className={`ip-dropdown-item ${activeIpSlot === 'direct' ? 'selected' : ''}`}
                        onClick={() => {
                          setActiveIpSlot('direct');
                          setIpDropdownOpen(false);
                        }}
                      >
                        <div className="ip-item-title">
                          <strong>IP Mặc định (Direct IP)</strong>
                          <span className="ip-item-count">{slotCapacityDirect.badgeCount} slot</span>
                        </div>
                        <div className="ip-item-sub">
                          <span>File này: {slotCapacityDirect.fileTotal} nick (HM: {slotCapacityDirect.directHm}/3 • DK: {slotCapacityDirect.directDk}/3)</span>
                          <span>|</span>
                          <span style={{ color: slotCapacityDirect.serverRemaining > 0 ? 'var(--apple-green)' : 'var(--apple-red)' }}>
                            Toàn server: {slotCapacityDirect.globalRunning}/6 Online (Còn {slotCapacityDirect.serverRemaining} slot)
                          </span>
                        </div>
                      </div>

                      {/* 3. Proxies */}
                      {(proxies || []).map(p => {
                        const slot = getSlotCapacity(p.id);
                        return (
                          <div
                            key={p.id}
                            className={`ip-dropdown-item ${activeIpSlot === p.id ? 'selected' : ''}`}
                            onClick={() => {
                              setActiveIpSlot(p.id);
                              setIpDropdownOpen(false);
                            }}
                          >
                            <div className="ip-item-title">
                              <strong style={{ color: 'var(--apple-purple)' }}>{p.name}</strong>
                              <span className="ip-item-count">{slot.badgeCount} slot</span>
                            </div>
                            <div className="ip-item-sub">
                              <span>File này: {slot.fileTotal} nick (HM: {slot.pHm}/3 • DK: {slot.pDk}/3)</span>
                              <span>|</span>
                              <span style={{ color: slot.serverRemaining > 0 ? 'var(--apple-green)' : 'var(--apple-red)' }}>
                                Toàn server: {slot.globalRunning}/6 Online (Còn {slot.serverRemaining} slot)
                              </span>
                            </div>
                          </div>
                        );
                      })}
                    </div>
                  )}
                </div>
              </div>
            </div>

            {/* Accounts Grid */}
            <window.AccountsGrid
              accounts={displayedAccounts}
              proxies={proxies}
              files={files}
              activeFile={activeFile}
              activeIpSlot={activeIpSlot}
              onStartAccount={handleStartAccount}
              onStopAccount={handleStopAccount}
              onSwitchServer={handleSwitchServer}
              onOpenEditAccount={(acc) => openAccountModal(acc)}
              onDeleteAccount={handleDeleteAccount}
              onOpenSetup={openSetupModal}
              onTriggerAuto={handleTriggerAuto}
            />
          </div>
        </section>
      </main>

      {/* Modals Layer */}
      {accountModal.open && (
        <window.AccountModal
          account={accountModal.editing}
          files={files}
          proxies={proxies}
          activeFileId={activeFileId}
          defaultIpSlot={activeIpSlot === 'all' ? 1 : parseInt(activeIpSlot, 10)}
          onClose={() => setAccountModal({ open: false, editing: null })}
          onSaved={(targetFileId) => {
            setAccountModal({ open: false, editing: null });
            if (targetFileId) handleSwitchFile(targetFileId);
            fetchAccounts();
            fetchFiles();
            fetchProxies();
          }}
        />
      )}

      {fileModal.open && (
        <window.FileModal
          file={fileModal.editing}
          files={files}
          activeFileId={activeFileId}
          availableJars={availableJars}
          fetchJars={fetchJars}
          onSwitchFile={handleSwitchFile}
          onDeleteFile={handleDeleteFile}
          onClose={() => setFileModal({ open: false, editing: null })}
          onSaved={() => {
            setFileModal({ open: false, editing: null });
            fetchFiles();
            fetchAccounts();
          }}
        />
      )}

      {proxyModal?.open && (
        <window.ProxyModal
          proxies={proxies}
          initialFilter={proxyModal.initialFilter || 'all'}
          onClose={() => setProxyModal({ open: false, initialFilter: 'all' })}
          onSaveProxy={handleSaveProxy}
          onDeleteProxy={handleDeleteProxy}
          onRefreshProxies={fetchProxies}
        />
      )}

      {settingsModal.open && (
        <window.SettingsModal
          config={settingsModal.config}
          theme={theme}
          setTheme={window.useApp().setTheme}
          onClose={() => setSettingsModal({ open: false, config: null })}
          onSaved={(newPass) => {
            if (newPass) window.ApiClient.setAuthToken(newPass);
            setSettingsModal({ open: false, config: null });
            window.useApp().fetchStatus();
          }}
        />
      )}

      {setupModal?.open && (
        <window.AccountSetupModal
          account={accounts.find(a => a.id === setupModal.account?.id) || setupModal.account}
          allAccounts={accounts}
          initialFeature={setupModal.activeTab}
          onClose={() => setSetupModal({ open: false, account: null, activeTab: 'upThue' })}
          onAccountUpdated={fetchAccounts}
        />
      )}
    </div>
  );
};
