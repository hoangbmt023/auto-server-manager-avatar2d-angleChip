/**
 * DashboardPage Component (Pages Layer)
 * Composes Navbar, StatsRow, TerminalConsole, FileTabs, LimitBanner, AccountsGrid, Checklist & Modals.
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
        onOpenSettings={onOpenSettings}
      />

      {/* 2. Main Content Grid */}
      <main className="dashboard-grid">

        {/* JRE Missing Alert Banner */}
        {status?.java && !status.java.available && (
          <section className="alert-banner">
            <div className="banner-icon">⚠️</div>
            <div className="banner-body">
              <h4>Chưa phát hiện Java Runtime trên máy chủ</h4>
              <p>Hệ thống hỗ trợ tự động tải và giải nén bản Portable OpenJDK 17 tương thích với hosting.</p>
              <div className="banner-actions">
                <button className="btn btn-primary btn-sm" onClick={onInstallJre}>
                  ⚡ Tự động cài Portable Java ngay
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

        {/* Live Terminal Console */}
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

        {/* Expired Proxies Alert Banner (Below Terminal, Above Accounts & File Manager) */}
        {(() => {
          const expiredProxies = (proxies || []).filter(p => p.isExpired);
          if (expiredProxies.length === 0) return null;
          return (
            <section className="alert-banner alert-banner-danger">
              <div className="banner-icon">⚠️</div>
              <div className="banner-body">
                <h4>
                  CẢNH BÁO: Phát hiện {expiredProxies.length} Proxy đã HẾT HẠN hoặc LỖI XÁC THỰC!
                </h4>
                <p>
                  Danh sách proxy hết hạn: <strong>{expiredProxies.map(p => `${p.name} (${p.host}:${p.port})`).join(', ')}</strong>.
                  <br />
                  Các tài khoản gán proxy này sẽ không thể đăng nhập hoặc đã bị ngắt kết nối an toàn.
                </p>
              </div>
              <div className="banner-actions">
                <button
                  className="btn btn-danger btn-sm"
                  onClick={() => setProxyModal({ open: true, initialFilter: 'expired' })}
                >
                  🌐 Quản Lý Proxy (Đã Lọc Hết Hạn)
                </button>
              </div>
            </section>
          );
        })()}

        {/* Accounts & File Manager Panel */}
        <section className="accounts-card">
          <div className="card-header-flex">
            <div className="card-title-group">
              <span className="card-header-icon">👥</span>
              <div>
                <h3>Quản Lý File & Danh Sách Tài Khoản</h3>
                <p className="card-subtitle">Mỗi File chứa tối đa 6 nick (3 Hoàn Mỹ + 3 Diệu Kỳ). Mỗi Proxy gắn tối đa 6 nick online cùng lúc.</p>
              </div>
            </div>
            <div className="header-btn-group">
              <button className="btn btn-secondary btn-sm" onClick={() => setFileModal({ open: true, editing: null })}>
                📁 Quản Lý File {files && files.length > 0 && `(${files.length})`}
              </button>
              <button className="btn btn-outline btn-sm" onClick={() => setProxyModal({ open: true })}>
                🌐 Quản Lý Proxy {proxies && proxies.length > 0 && `(${proxies.length})`}
              </button>
              <button className="btn btn-primary btn-sm" onClick={() => setAccountModal({ open: true, editing: null })}>
                ➕ Thêm Tài Khoản
              </button>
            </div>
          </div>

          {/* File Profiles Tabs */}
          <window.FileTabsBar
            files={files}
            activeFileId={activeFileId}
            onSwitchFile={onSwitchFile}
          />

          {/* Real-time Server Limit Counters */}
          <window.ServerLimitBanner
            runningHm={runningHm}
            runningDk={runningDk}
            runningTotal={runningTotal}
          />

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
