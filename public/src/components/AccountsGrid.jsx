/**
 * AccountsGrid Component (Presentation Layer)
 * Renders accounts grouped by Server (Server 1: Hoàn Mỹ & Server 2: Diệu Kỳ) with per-server online limits (3/3).
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
      <div className="empty-accounts" style={{ padding: '36px 20px', textAlign: 'center', background: 'rgba(255, 255, 255, 0.02)', borderRadius: '12px', border: '1px dashed rgba(255, 255, 255, 0.1)' }}>
        <p style={{ fontSize: '1.05rem', color: '#f8fafc', margin: 0 }}>Chưa có tài khoản nào trong File này.</p>
        <p style={{ marginTop: '8px', fontSize: '0.85rem', color: '#94a3b8' }}>
          Mỗi File hỗ trợ tối đa <strong>6 tài khoản</strong> (chia đều tối đa 3 nick Hoàn Mỹ + 3 nick Diệu Kỳ). Hãy nhấn <strong>➕ Thêm Tài Khoản</strong> ở trên để bắt đầu!
        </p>
      </div>
    );
  }

  return (
    <div className="accounts-server-grouped" style={{ display: 'flex', flexDirection: 'column', gap: '28px' }}>
      {/* SECTION 1: SERVER HOÀN MỸ */}
      <div className="server-group-section">
        <div className="server-group-header" style={{
          display: 'flex',
          justifyContent: 'space-between',
          alignItems: 'center',
          padding: '10px 16px',
          background: 'rgba(59, 130, 246, 0.08)',
          borderLeft: '4px solid #3b82f6',
          borderRadius: '8px',
          marginBottom: '14px'
        }}>
          <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
            <span style={{ fontSize: '1.2rem' }}>🌐</span>
            <strong style={{ fontSize: '1rem', color: '#93c5fd' }}>Server 1: Hoàn Mỹ</strong>
            <span style={{ fontSize: '0.82rem', color: '#cbd5e1' }}>({hmAccounts.length}/3 nick)</span>
          </div>

          <div style={{ display: 'flex', gap: '10px', alignItems: 'center' }}>
            <span style={{
              padding: '3px 10px',
              borderRadius: '6px',
              fontSize: '0.8rem',
              fontWeight: 600,
              background: hmOnline >= 3 ? 'rgba(239, 68, 68, 0.18)' : (hmOnline > 0 ? 'rgba(34, 197, 94, 0.18)' : 'rgba(255, 255, 255, 0.05)'),
              color: hmOnline >= 3 ? '#f87171' : (hmOnline > 0 ? '#4ade80' : '#94a3b8'),
              border: '1px solid',
              borderColor: hmOnline >= 3 ? 'rgba(239, 68, 68, 0.35)' : (hmOnline > 0 ? 'rgba(34, 197, 94, 0.35)' : 'rgba(255, 255, 255, 0.1)')
            }}>
              🔥 Đang Treo: {hmOnline} / 3 nick
            </span>
          </div>
        </div>

        {hmAccounts.length === 0 ? (
          <div style={{ padding: '16px 20px', color: '#64748b', fontSize: '0.85rem', background: 'rgba(255, 255, 255, 0.015)', borderRadius: '8px', fontStyle: 'italic' }}>
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
        <div className="server-group-header" style={{
          display: 'flex',
          justifyContent: 'space-between',
          alignItems: 'center',
          padding: '10px 16px',
          background: 'rgba(168, 85, 247, 0.08)',
          borderLeft: '4px solid #a855f7',
          borderRadius: '8px',
          marginBottom: '14px'
        }}>
          <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
            <span style={{ fontSize: '1.2rem' }}>🌐</span>
            <strong style={{ fontSize: '1rem', color: '#c084fc' }}>Server 2: Diệu Kỳ</strong>
            <span style={{ fontSize: '0.82rem', color: '#cbd5e1' }}>({dkAccounts.length}/3 nick)</span>
          </div>

          <div style={{ display: 'flex', gap: '10px', alignItems: 'center' }}>
            <span style={{
              padding: '3px 10px',
              borderRadius: '6px',
              fontSize: '0.8rem',
              fontWeight: 600,
              background: dkOnline >= 3 ? 'rgba(239, 68, 68, 0.18)' : (dkOnline > 0 ? 'rgba(34, 197, 94, 0.18)' : 'rgba(255, 255, 255, 0.05)'),
              color: dkOnline >= 3 ? '#f87171' : (dkOnline > 0 ? '#4ade80' : '#94a3b8'),
              border: '1px solid',
              borderColor: dkOnline >= 3 ? 'rgba(239, 68, 68, 0.35)' : (dkOnline > 0 ? 'rgba(34, 197, 94, 0.35)' : 'rgba(255, 255, 255, 0.1)')
            }}>
              🔥 Đang Treo: {dkOnline} / 3 nick
            </span>
          </div>
        </div>

        {dkAccounts.length === 0 ? (
          <div style={{ padding: '16px 20px', color: '#64748b', fontSize: '0.85rem', background: 'rgba(255, 255, 255, 0.015)', borderRadius: '8px', fontStyle: 'italic' }}>
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
