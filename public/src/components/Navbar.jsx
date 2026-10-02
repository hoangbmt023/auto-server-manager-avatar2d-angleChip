/**
 * Navbar Component (Presentation Layer)
 * Header navigation with brand, running status badge & settings trigger.
 */
window.Navbar = function Navbar({ isAnyRunning, runningCount, status, onOpenSettings }) {
  const botMemMb = status?.system?.botMemMb || 0;
  const freeMemMb = status?.system?.freeMemMb || 0;
  const totalMemMb = status?.system?.totalMemMb || 0;

  return (
    <header className="navbar">
      <div className="brand">
        <div className="brand-icon">🐟</div>
        <div className="brand-text">
          <h1>Avatar Bot Manager</h1>
          <span className="badge-cpanel">cPanel Node.js React 18</span>
        </div>
      </div>

      <div className="nav-status">
        {/* RAM Status Pill */}
        <div className="nav-ram-badge" title={`RAM Bot: ${botMemMb} MB | Server trống: ${freeMemMb} / ${totalMemMb} MB`}>
          <span className="nav-ram-icon">💾</span>
          <div className="nav-ram-info">
            <span className="nav-ram-main">RAM Bot: <strong>{botMemMb} MB</strong></span>
            <span className="nav-ram-sub">Trống: {freeMemMb} MB</span>
          </div>
        </div>

        <div className={`status-indicator ${isAnyRunning ? 'status-running' : 'status-stopped'}`}>
          <span className="pulse-dot"></span>
          <span>{isAnyRunning ? `Đang Chạy (${runningCount} nick)` : 'Đã Dừng'}</span>
        </div>
        <button className="btn btn-icon" onClick={onOpenSettings} title="Cài đặt cấu hình">
          ⚙️
        </button>
      </div>
    </header>
  );
};
