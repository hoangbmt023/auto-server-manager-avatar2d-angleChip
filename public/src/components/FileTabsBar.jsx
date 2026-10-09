/**
 * FileTabsBar Component (Presentation Layer)
 * Porsche & Apple Precision Sidebar File Item Cards
 */
window.FileTabsBar = function FileTabsBar({
  files = [],
  activeFileId,
  onSwitchFile
}) {
  return (
    <div className="file-selector-bar">
      <div className="file-tabs-container">
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
            >
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', width: '100%' }}>
                <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
                  <window.Icon name="folder" size={15} color={isActive ? 'var(--apple-blue)' : 'var(--text-secondary)'} />
                  <strong style={{ fontSize: '0.86rem', fontWeight: 600 }}>{f.name}</strong>
                </div>
                <span style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>({f.totalAccounts || 0}/6)</span>
              </div>

              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', width: '100%', marginTop: '2px' }}>
                <span style={{
                  padding: '2px 7px',
                  borderRadius: '999px',
                  fontSize: '0.66rem',
                  fontWeight: 600,
                  background: isFish ? 'rgba(100, 210, 255, 0.12)' : 'rgba(191, 90, 242, 0.12)',
                  color: isFish ? 'var(--apple-teal)' : 'var(--apple-purple)',
                  display: 'inline-flex',
                  alignItems: 'center',
                  gap: '4px'
                }}>
                  <window.Icon name={isFish ? 'fish' : 'gem'} size={11} />
                  {isFish ? 'Câu Cá' : 'Kim Cương'}
                </span>

                <div style={{ fontSize: '0.7rem', color: 'var(--text-tertiary)', display: 'flex', gap: '6px', alignItems: 'center' }}>
                  <span>HM: {hmOnline}/3</span>
                  <span>•</span>
                  <span>DK: {dkOnline}/3</span>
                  {totalOnline > 0 && (
                    <span style={{ color: 'var(--apple-green)', fontWeight: 700, marginLeft: '2px' }}>
                      🔥 {totalOnline}
                    </span>
                  )}
                </div>
              </div>
            </button>
          );
        })}
      </div>
    </div>
  );
};
