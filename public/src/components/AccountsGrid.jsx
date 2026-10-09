/**
 * AccountsGrid Component (Presentation Layer)
 * Porsche & Apple Precision Server Sections & Bot Grid
 */
window.AccountsGrid = function AccountsGrid({
  accounts = [],
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
  const hmAccounts = accounts.filter(a => (a.serverId === 0 || a.serverId === undefined || a.serverId === null));
  const dkAccounts = accounts.filter(a => a.serverId === 1);

  const hmOnline = hmAccounts.filter(a => a.isRunning).length;
  const dkOnline = dkAccounts.filter(a => a.isRunning).length;

  if (accounts.length === 0) {
    return (
      <div style={{
        padding: '48px 24px',
        textAlign: 'center',
        background: 'var(--glass-matrix-bg)',
        borderRadius: 'var(--radius-lg)',
        border: '1px dashed var(--glass-border-subtle)',
        backdropFilter: 'var(--blur-base)',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        gap: '10px'
      }}>
        <div className="sidebar-icon-box" style={{ width: '48px', height: '48px', margin: '0 auto' }}>
          <window.Icon name="users" size={24} color="var(--text-tertiary)" />
        </div>
        <p style={{ fontSize: '0.98rem', color: 'var(--text-primary)', fontWeight: 600, margin: 0 }}>
          Chưa có tài khoản nào trong File này
        </p>
        <p style={{ fontSize: '0.82rem', color: 'var(--text-secondary)', maxWidth: '420px', margin: 0 }}>
          Mỗi File hỗ trợ tối đa 6 tài khoản (3 nick Hoàn Mỹ + 3 nick Diệu Kỳ). Hãy nhấn nút <strong>Thêm Tài Khoản</strong> ở cột bên trái để bắt đầu.
        </p>
      </div>
    );
  }

  return (
    <div className="accounts-server-grouped" style={{ display: 'flex', flexDirection: 'column', gap: '20px' }}>
      {/* SECTION 1: SERVER HOÀN MỸ */}
      <div className="server-group-section">
        <div className="server-group-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <window.Icon name="server" size={16} color="var(--apple-blue)" />
            <strong style={{ fontSize: '0.92rem', color: 'var(--text-primary)', fontWeight: 600 }}>Server 1: Hoàn Mỹ</strong>
            <span style={{ fontSize: '0.76rem', color: 'var(--text-tertiary)' }}>({hmAccounts.length}/3 nick)</span>
          </div>

          <div style={{ display: 'flex', gap: '8px', alignItems: 'center' }}>
            <span style={{
              padding: '3px 10px',
              borderRadius: '999px',
              fontSize: '0.72rem',
              fontWeight: 600,
              background: hmOnline >= 3 ? 'rgba(255, 69, 58, 0.12)' : (hmOnline > 0 ? 'rgba(48, 209, 88, 0.12)' : 'var(--glass-bg)'),
              color: hmOnline >= 3 ? 'var(--apple-red)' : (hmOnline > 0 ? 'var(--apple-green)' : 'var(--text-tertiary)'),
              border: '1px solid',
              borderColor: hmOnline >= 3 ? 'rgba(255, 69, 58, 0.3)' : (hmOnline > 0 ? 'rgba(48, 209, 88, 0.3)' : 'var(--glass-border-subtle)'),
              display: 'inline-flex',
              alignItems: 'center',
              gap: '4px'
            }}>
              <window.Icon name="activity" size={11} /> {hmOnline} / 3 Online
            </span>
          </div>
        </div>

        {hmAccounts.length === 0 ? (
          <div style={{ padding: '16px 20px', color: 'var(--text-tertiary)', fontSize: '0.82rem', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-sm)', fontStyle: 'italic' }}>
            Chưa có tài khoản nào thuộc Server Hoàn Mỹ trong File này.
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
              />
            ))}
          </div>
        )}
      </div>

      {/* SECTION 2: SERVER DIỆU KỲ */}
      <div className="server-group-section">
        <div className="server-group-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <window.Icon name="server" size={16} color="var(--apple-purple)" />
            <strong style={{ fontSize: '0.92rem', color: 'var(--apple-purple)', fontWeight: 600 }}>Server 2: Diệu Kỳ</strong>
            <span style={{ fontSize: '0.76rem', color: 'var(--text-tertiary)' }}>({dkAccounts.length}/3 nick)</span>
          </div>

          <div style={{ display: 'flex', gap: '8px', alignItems: 'center' }}>
            <span style={{
              padding: '3px 10px',
              borderRadius: '999px',
              fontSize: '0.72rem',
              fontWeight: 600,
              background: dkOnline >= 3 ? 'rgba(255, 69, 58, 0.12)' : (dkOnline > 0 ? 'rgba(48, 209, 88, 0.12)' : 'var(--glass-bg)'),
              color: dkOnline >= 3 ? 'var(--apple-red)' : (dkOnline > 0 ? 'var(--apple-green)' : 'var(--text-tertiary)'),
              border: '1px solid',
              borderColor: dkOnline >= 3 ? 'rgba(255, 69, 58, 0.3)' : (dkOnline > 0 ? 'rgba(48, 209, 88, 0.3)' : 'var(--glass-border-subtle)'),
              display: 'inline-flex',
              alignItems: 'center',
              gap: '4px'
            }}>
              <window.Icon name="activity" size={11} /> {dkOnline} / 3 Online
            </span>
          </div>
        </div>

        {dkAccounts.length === 0 ? (
          <div style={{ padding: '16px 20px', color: 'var(--text-tertiary)', fontSize: '0.82rem', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-sm)', fontStyle: 'italic' }}>
            Chưa có tài khoản nào thuộc Server Diệu Kỳ trong File này.
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
              />
            ))}
          </div>
        )}
      </div>
    </div>
  );
};
