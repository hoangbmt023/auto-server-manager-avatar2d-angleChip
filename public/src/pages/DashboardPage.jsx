/**
 * DashboardPage Component (Pages Layer)
 * Porsche & Apple Minimalist Split-Layout (Sidebar on Left, Accounts on Right)
 */
window.DashboardPage = function DashboardPage({
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
  uptime,
  formatUptime,
  theme,
  setTheme,
  toggleTheme,
  runningHm,
  runningDk,
  runningTotal,
  jreProgress,
  availableJars,
  fetchJars,
  accountModal,
  setAccountModal,
  fileModal,
  setFileModal,
  proxyModal,
  setProxyModal,
  settingsModal,
  setSettingsModal,
  setupModal,
  setSetupModal,
  onOpenSetup,
  onStartAccount,
  onStopAccount,
  onStartAllFile,
  onStopAll,
  onRestartAll,
  onSwitchServer,
  onDeleteAccount,
  onSwitchFile,
  onDeleteFile,
  onClearLogs,
  onDownloadLogs,
  onInstallJre,
  onOpenSettings,
  onAccountSaved,
  onFileSaved,
  onSaveProxy,
  onDeleteProxy,
  onSettingsSaved,
  onAccountUpdated,
  onTriggerAuto,
  fetchProxies,
  onRefreshProxies
}) {
  const isAnyRunning = Boolean(status?.bot?.runningCount > 0 || status?.bot?.running);

  return (
    <div className="app-container">
      {/* 1. Header / Navbar */}
      <window.Navbar
        isAnyRunning={isAnyRunning}
        runningCount={status?.bot?.runningCount || 0}
        status={status}
        theme={theme}
        toggleTheme={toggleTheme}
        onOpenSettings={onOpenSettings}
      />

      {/* 2. Main Content Grid */}
      <main className="dashboard-grid">

        {/* JRE Missing Alert Banner */}
        {status?.java && !status.java.available && (
          <section className="alert-banner">
            <window.Icon name="alert" size={22} color="var(--apple-orange)" />
            <div className="banner-body">
              <h4>Chưa phát hiện Java Runtime trên máy chủ</h4>
              <p>Hệ thống hỗ trợ tự động tải và giải nén bản Portable OpenJDK 17 tương thích với hosting.</p>
              <div className="banner-actions">
                <button className="btn btn-primary btn-sm" onClick={onInstallJre}>
                  <window.Icon name="zap" size={14} /> Tự động cài Portable Java ngay
                </button>
              </div>
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
          onStartAllFile={onStartAllFile}
          onStopAll={onStopAll}
          onRestartAll={onRestartAll}
          onClearLogs={onClearLogs}
          onDownloadLogs={onDownloadLogs}
        />

        {/* Expired Proxies Alert Banner */}
        {(() => {
          const expiredProxies = (proxies || []).filter(p => p.isExpired);
          if (expiredProxies.length === 0) return null;
          return (
            <section className="alert-banner alert-banner-danger">
              <div className="banner-top-row">
                <div className="banner-title-box">
                  <window.Icon name="shield" size={22} color="var(--apple-red)" />
                  <div className="banner-title-content">
                    <h4>
                      CẢNH BÁO: Phát hiện {expiredProxies.length} Proxy đã HẾT HẠN hoặc LỖI XÁC THỰC!
                    </h4>
                  </div>
                </div>
                <div className="banner-actions">
                  <button
                    className="btn btn-danger btn-sm"
                    onClick={() => setProxyModal({ open: true, initialFilter: 'expired' })}
                  >
                    <window.Icon name="globe" size={14} /> Quản Lý Proxy Hết Hạn
                  </button>
                </div>
              </div>
              <div className="banner-body">
                <p>
                  Danh sách proxy hết hạn: <strong>{expiredProxies.map(p => `${p.name} (${p.host}:${p.port})`).join(', ')}</strong>.
                  <br />
                  Các tài khoản gán proxy này sẽ không thể đăng nhập hoặc đã bị ngắt kết nối an toàn.
                </p>
              </div>
            </section>
          );
        })()}

        {/* 3. 2-COLUMN SPLIT LAYOUT: LEFT SIDEBAR (File & Control) + RIGHT PANE (Accounts Grid) */}
        <section className="accounts-split-layout">
          {/* Left Sidebar Pane: Controls, File Selector, Capacity */}
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
                onClick={() => setAccountModal({ open: true, editing: null })}
              >
                <window.Icon name="plus" size={14} /> Thêm Tài Khoản
              </button>
              <div className="sidebar-btn-grid">
                <button
                  className="btn btn-secondary btn-sm"
                  onClick={() => setFileModal({ open: true, editing: null })}
                >
                  <window.Icon name="folder" size={14} /> File {files?.length > 0 && `(${files.length})`}
                </button>
                <button
                  className="btn btn-secondary btn-sm"
                  onClick={() => setProxyModal({ open: true })}
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
                onSwitchFile={onSwitchFile}
              />
            </div>

            {/* Real-time Server Limit Counters */}
            <window.ServerLimitBanner
              runningHm={runningHm}
              runningDk={runningDk}
              runningTotal={runningTotal}
            />
          </aside>

          {/* Right Main Pane: Accounts Grid */}
          <div className="accounts-main-pane">
            <div className="main-pane-header">
              <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                <div className="sidebar-icon-box">
                  <window.Icon name="users" size={18} />
                </div>
                <div>
                  <h3>{activeFile?.name || 'File Bot'}</h3>
                  <span className="sidebar-sub">
                    {activeFile?.modType === 'chipmix' ? '⚡ Bản ChipMix Full Auto (Câu Cá, KC, Farm)' : activeFile?.modType === 'fish' ? '🎣 Bản Auto Up Câu Cá' : '💎 Bản Auto Up Kim Cương & Bán Đá'} • {fileAccounts.length}/6 tài khoản
                  </span>
                </div>
              </div>
            </div>

            {/* Accounts Grid */}
            <window.AccountsGrid
              accounts={fileAccounts}
              proxies={proxies}
              files={files}
              activeFile={activeFile}
              onStartAccount={onStartAccount}
              onStopAccount={onStopAccount}
              onSwitchServer={onSwitchServer}
              onOpenEditAccount={(acc) => setAccountModal({ open: true, editing: acc })}
              onDeleteAccount={onDeleteAccount}
              onOpenSetup={onOpenSetup}
              onTriggerAuto={onTriggerAuto}
            />
          </div>
        </section>
      </main>

      {/* Modals */}
      {accountModal.open && (
        <window.AccountModal
          account={accountModal.editing}
          files={files}
          proxies={proxies}
          activeFileId={activeFileId}
          onClose={() => setAccountModal({ open: false, editing: null })}
          onSaved={onAccountSaved}
        />
      )}

      {fileModal.open && (
        <window.FileModal
          file={fileModal.editing}
          files={files}
          activeFileId={activeFileId}
          availableJars={availableJars}
          fetchJars={fetchJars}
          onSwitchFile={onSwitchFile}
          onDeleteFile={onDeleteFile}
          onClose={() => setFileModal({ open: false, editing: null })}
          onSaved={onFileSaved}
        />
      )}

      {proxyModal?.open && (
        <window.ProxyModal
          proxies={proxies}
          initialFilter={proxyModal.initialFilter || 'all'}
          onClose={() => setProxyModal({ open: false, initialFilter: 'all' })}
          onSaveProxy={onSaveProxy}
          onDeleteProxy={onDeleteProxy}
          onRefreshProxies={onRefreshProxies || fetchProxies}
        />
      )}

      {settingsModal.open && (
        <window.SettingsModal
          config={settingsModal.config}
          theme={theme}
          setTheme={setTheme}
          onClose={() => setSettingsModal({ open: false, config: null })}
          onSaved={onSettingsSaved}
        />
      )}

      {setupModal?.open && (
        <window.AccountSetupModal
          account={accounts.find(a => a.id === setupModal.account?.id) || setupModal.account}
          allAccounts={accounts}
          initialFeature={setupModal.activeTab}
          onClose={() => setSetupModal({ open: false, account: null, activeTab: 'upThue' })}
          onAccountUpdated={onAccountUpdated}
        />
      )}
    </div>
  );
};
