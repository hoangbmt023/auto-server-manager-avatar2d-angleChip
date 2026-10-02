/**
 * FileTabsBar Component (Presentation Layer)
 * Manages switching between bot profile tabs.
 */
window.FileTabsBar = function FileTabsBar({
  files = [],
  activeFileId,
  onSwitchFile
}) {
  return (
    <div className="file-selector-bar" style={{ display: 'flex', alignItems: 'center', flexWrap: 'wrap', gap: '10px' }}>
      {/* File Tabs */}
      <div className="file-tabs-container" style={{ display: 'flex', gap: '8px', flexWrap: 'wrap', alignItems: 'center', width: '100%' }}>
        {files.map(f => {
          const isActive = f.id === activeFileId;
          const hmOnline = f.runningHmCount !== undefined ? f.runningHmCount : 0;
          const dkOnline = f.runningDkCount !== undefined ? f.runningDkCount : 0;
          const totalOnline = f.runningTotal !== undefined ? f.runningTotal : (f.runningCount || 0);

          const isFish = f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'));

          return (
            <button
              key={f.id}
              className={`file-tab-btn ${isActive ? 'active-file-tab' : ''}`}
              onClick={() => onSwitchFile(f.id)}
              style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-start', padding: '6px 14px' }}
            >
              <div style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                <strong style={{ fontSize: '0.9rem' }}>📁 {f.name}</strong>
                <span style={{
                  padding: '1px 6px',
                  borderRadius: '3px',
                  fontSize: '0.68rem',
                  fontWeight: 600,
                  background: isFish ? 'rgba(56, 189, 248, 0.15)' : 'rgba(168, 85, 247, 0.15)',
                  color: isFish ? '#38bdf8' : '#c084fc',
                  border: '1px solid',
                  borderColor: isFish ? 'rgba(56, 189, 248, 0.3)' : 'rgba(168, 85, 247, 0.3)'
                }}>
                  {isFish ? '🎣 Auto up câu cá' : '💎 Auto Up kim cương'}
                </span>
                <span style={{ fontSize: '0.75rem', opacity: 0.8 }}>({f.totalAccounts || 0}/6 nick)</span>
                {totalOnline > 0 && (
                  <span style={{ fontSize: '0.75rem', color: '#4ade80', fontWeight: 'bold' }}>
                    🔥 {totalOnline} on
                  </span>
                )}
              </div>
              <div style={{ fontSize: '0.72rem', color: isActive ? '#93c5fa' : '#94a3b8', marginTop: '2px', display: 'flex', gap: '8px' }}>
                <span>HM: <strong>{hmOnline}/3</strong></span>
                <span>•</span>
                <span>DK: <strong>{dkOnline}/3</strong></span>
              </div>
            </button>
          );
        })}
      </div>
    </div>
  );
};
