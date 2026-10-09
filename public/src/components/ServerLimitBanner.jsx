/**
 * ServerLimitBanner Component (Presentation Layer)
 * Porsche & Apple Precision Capacity Monitor (Inside Sidebar)
 */
window.ServerLimitBanner = function ServerLimitBanner({ runningHm, runningDk, runningTotal }) {
  return (
    <div className="server-limit-banner">
      <div className="limit-stat-item">
        <div className="limit-label-group">
          <window.Icon name="server" size={13} color="var(--apple-blue)" />
          <span>Server 1 (Hoàn Mỹ):</span>
        </div>
        <span className={`limit-val ${runningHm > 0 ? 'limit-active' : ''}`}>
          {runningHm}/3
        </span>
      </div>

      <div className="limit-stat-item">
        <div className="limit-label-group">
          <window.Icon name="server" size={13} color="var(--apple-purple)" />
          <span>Server 2 (Diệu Kỳ):</span>
        </div>
        <span className={`limit-val ${runningDk > 0 ? 'limit-active' : ''}`}>
          {runningDk}/3
        </span>
      </div>

      <div className="limit-stat-item" style={{ borderTop: '1px solid var(--glass-border-subtle)', paddingTop: '6px', marginTop: '2px' }}>
        <div className="limit-label-group">
          <window.Icon name="activity" size={13} color={runningTotal > 0 ? 'var(--apple-green)' : 'var(--text-tertiary)'} />
          <strong style={{ fontSize: '0.78rem', color: 'var(--text-primary)' }}>Tổng Treo Online:</strong>
        </div>
        <span className={`limit-val ${runningTotal > 0 ? 'limit-active' : ''}`}>
          {runningTotal}/6 nick
        </span>
      </div>
    </div>
  );
};
