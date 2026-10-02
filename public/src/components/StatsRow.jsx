/**
 * StatsRow Component (Presentation Layer)
 * Renders the top overview metrics (Uptime, Java Version, RAM, Online bot count).
 */
window.StatsRow = function StatsRow({ uptimeFormatted, status }) {
  const javaVersion = status?.java?.available
    ? (status.java.version.split(' ')[0] + ' ' + (status.java.version.split(' ')[1] || ''))
    : 'Chưa cài đặt';

  const ramInfo = status?.system
    ? `${status.system.freeMemMb} / ${status.system.totalMemMb} MB`
    : '-- / -- MB';

  const runningCount = status?.bot?.runningCount || 0;

  return (
    <section className="stats-row">
      <div className="stat-card">
        <div className="stat-icon">⏱️</div>
        <div className="stat-content">
          <span className="stat-label">Thời Gian Treo</span>
          <span className="stat-value">{uptimeFormatted}</span>
        </div>
      </div>

      <div className="stat-card">
        <div className="stat-icon">☕</div>
        <div className="stat-content">
          <span className="stat-label">Môi Trường Java</span>
          <span className="stat-value text-truncate" title={status?.java?.version || ''}>
            {javaVersion}
          </span>
        </div>
      </div>

      <div className="stat-card">
        <div className="stat-icon">💾</div>
        <div className="stat-content">
          <span className="stat-label">Bộ Nhớ RAM</span>
          <span className="stat-value" style={{ display: 'flex', flexDirection: 'column', gap: '2px' }}>
            <span>Bot: <strong>{status?.system?.botMemMb || 0} MB</strong></span>
            <span style={{ fontSize: '0.72rem', color: '#94a3b8', fontWeight: 400 }}>
              Server trống: {status?.system?.freeMemMb || 0} / {status?.system?.totalMemMb || 0} MB
            </span>
          </span>
        </div>
      </div>

      <div className="stat-card">
        <div className="stat-icon">⚡</div>
        <div className="stat-content">
          <span className="stat-label">Nick Đang Treo</span>
          <span className="stat-value">{runningCount} nick online</span>
        </div>
      </div>
    </section>
  );
};
