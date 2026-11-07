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
          const isChipMix = f.modType === 'chipmix' || (!f.modType && f.gameJar && (f.gameJar.toLowerCase().includes('chip') || f.gameJar.toLowerCase().includes('mix')));
          const isFish = !isChipMix && (f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish')));
          const badgeClass = isChipMix ? 'badge-chipmix' : isFish ? 'badge-fish' : 'badge-gem';
          const badgeIcon = isChipMix ? 'zap' : isFish ? 'fish' : 'gem';
          const badgeText = isChipMix ? 'Full Auto' : isFish ? 'Auto Câu Cá' : 'Auto Up Kim Cương';

          return (
            <button
              key={f.id}
              className={`file-tab-btn ${isActive ? 'active-file-tab' : ''}`}
              onClick={() => onSwitchFile(f.id)}
            >
              <div className="file-tab-header">
                <div className="file-tab-title-group">
                  <window.Icon name="folder" size={15} color={isActive ? 'var(--apple-blue)' : 'var(--text-secondary)'} />
                  <strong className="file-tab-title">{f.name}</strong>
                </div>
                <span className="file-tab-count">({f.totalAccounts || 0}/6)</span>
              </div>

              <div className="file-tab-meta-row">
                <span className={`file-tab-badge ${badgeClass}`}>
                  <window.Icon name={badgeIcon} size={11} />
                  {badgeText}
                </span>

                <div className="file-tab-online-stats">
                  <span>HM: {hmOnline}/3</span>
                  <span>•</span>
                  <span>DK: {dkOnline}/3</span>
                  {totalOnline > 0 && (
                    <span className="file-tab-online-highlight">
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
