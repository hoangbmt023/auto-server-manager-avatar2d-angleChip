/**
 * AccountsGrid Component (Presentation Layer)
 * Porsche & Apple Precision Server Sections & Bot Grid
 */
window.AccountsGrid = function AccountsGrid({
  accounts = [],
  proxies = [],
  files = [],
  activeFile = null,
  activeIpSlot = 'all',
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
  const isAllIps = activeIpSlot === 'all';
  const totalIps = 1 + (proxies || []).length;
  const maxPerServer = isAllIps ? (totalIps * 3) : 3;

  const activeProxy = (proxies || []).find(p => p.id === activeIpSlot);
  const currentTabName = isAllIps
    ? 'File này'
    : (activeIpSlot === 'direct' ? 'Tab IP Mặc định' : `Tab Proxy [${activeProxy ? activeProxy.name : activeIpSlot}]`);

  const hmAccounts = accounts.filter(a => (a.serverId === 0 || a.serverId === undefined || a.serverId === null));
  const dkAccounts = accounts.filter(a => a.serverId === 1);

  const hmOnline = hmAccounts.filter(a => a.isRunning).length;
  const dkOnline = dkAccounts.filter(a => a.isRunning).length;

  if (accounts.length === 0) {
    return (
      <div className="accounts-grid-empty">
        <div className="sidebar-icon-box accounts-grid-empty-icon">
          <window.Icon name="users" size={24} color="var(--text-tertiary)" />
        </div>
        <p className="accounts-grid-empty-title">
          {isAllIps ? 'Chưa có tài khoản nào trong File này' : `Chưa có tài khoản nào trong ${currentTabName}`}
        </p>
        <p className="accounts-grid-empty-desc">
          Mỗi IP hỗ trợ tối đa 6 tài khoản (3 nick Hoàn Mỹ + 3 nick Diệu Kỳ). Hãy nhấn nút <strong>Thêm Tài Khoản</strong> ở cột bên trái để gán vào IP này.
        </p>
      </div>
    );
  }

  return (
    <div className="accounts-server-grouped">
      {/* SECTION 1: SERVER HOÀN MỸ */}
      <div className="server-group-section">
        <div className="server-group-header">
          <div className="server-group-title-wrap">
            <window.Icon name="server" size={16} color="var(--apple-blue)" />
            <strong className="server-group-title">Server 1: Hoàn Mỹ</strong>
            <span className="server-group-count">({hmAccounts.length}/{maxPerServer} nick)</span>
          </div>

          <div className="server-group-actions">
            <span className={`server-group-online-badge ${
              hmOnline >= maxPerServer ? 'badge-danger' : (hmOnline > 0 ? 'badge-success' : 'badge-neutral')
            }`}>
              <window.Icon name="activity" size={11} /> {hmOnline} / {maxPerServer} Online
            </span>
          </div>
        </div>

        {hmAccounts.length === 0 ? (
          <div className="server-group-empty-notice">
            Chưa có tài khoản nào thuộc Server Hoàn Mỹ trong {currentTabName}.
          </div>
        ) : (
          <div className="accounts-grid">
            {hmAccounts.map(acc => (
              <window.AccountCard
                key={acc.id}
                account={acc}
                proxies={proxies}
                files={files}
                activeFile={activeFile}
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
            ))}
          </div>
        )}
      </div>

      {/* SECTION 2: SERVER DIỆU KỲ */}
      <div className="server-group-section">
        <div className="server-group-header">
          <div className="server-group-title-wrap">
            <window.Icon name="server" size={16} color="var(--apple-purple)" />
            <strong className="server-group-title title-dk">Server 2: Diệu Kỳ</strong>
            <span className="server-group-count">({dkAccounts.length}/{maxPerServer} nick)</span>
          </div>

          <div className="server-group-actions">
            <span className={`server-group-online-badge ${
              dkOnline >= maxPerServer ? 'badge-danger' : (dkOnline > 0 ? 'badge-success' : 'badge-neutral')
            }`}>
              <window.Icon name="activity" size={11} /> {dkOnline} / {maxPerServer} Online
            </span>
          </div>
        </div>

        {dkAccounts.length === 0 ? (
          <div className="server-group-empty-notice">
            Chưa có tài khoản nào thuộc Server Diệu Kỳ trong {currentTabName}.
          </div>
        ) : (
          <div className="accounts-grid">
            {dkAccounts.map(acc => (
              <window.AccountCard
                key={acc.id}
                account={acc}
                proxies={proxies}
                files={files}
                activeFile={activeFile}
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
            ))}
          </div>
        )}
      </div>
    </div>
  );
};
