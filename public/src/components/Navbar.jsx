/**
 * Navbar Component (Presentation Layer)
 * Porsche & Apple Minimalist Floating Header with Vector Icons & Status Capsule
 */
window.Navbar = function Navbar({
  isAnyRunning,
  runningCount,
  status,
  theme = 'dark',
  toggleTheme,
  onOpenSettings
}) {
  const botMemMb = status?.system?.botMemMb || 0;
  const freeMemMb = status?.system?.freeMemMb || 0;
  const totalMemMb = status?.system?.totalMemMb || 0;

  return (
    <header className="navbar">
      <div className="brand">
        <div className="brand-icon">
          <window.Icon name="bot" size={20} color="var(--apple-blue)" />
        </div>
        <div className="brand-text">
          <h1>AVATAR BOT MANAGER</h1>
          <span className="badge-cpanel">Precision Architecture • Node.js React 18</span>
        </div>
      </div>

      <div className="nav-status">
        {/* RAM Status Pill */}
        <div className="nav-ram-badge" title={`RAM Bot: ${botMemMb} MB | Server trống: ${freeMemMb} / ${totalMemMb} MB`}>
          <window.Icon name="cpu" size={14} color="var(--text-secondary)" />
          <div className="nav-ram-info">
            <span className="nav-ram-main">RAM: <strong>{botMemMb} MB</strong></span>
            <span className="nav-ram-sub">Trống: {freeMemMb} MB</span>
          </div>
        </div>

        {/* Status Indicator */}
        <div className={`status-indicator ${isAnyRunning ? 'status-running' : 'status-stopped'}`}>
          <span className="pulse-dot"></span>
          <span>{isAnyRunning ? `${runningCount} Online` : 'Đã Dừng'}</span>
        </div>

        {/* Theme Quick Switcher Button */}
        <button
          className="btn btn-icon"
          onClick={toggleTheme}
          title={theme === 'dark' ? 'Chuyển sang Chế độ Sáng' : 'Chuyển sang Chế độ Tối'}
        >
          <window.Icon name={theme === 'dark' ? 'sun' : 'moon'} size={16} />
        </button>

        {/* Settings Button */}
        <button className="btn btn-icon" onClick={onOpenSettings} title="Cài đặt cấu hình">
          <window.Icon name="settings" size={16} />
        </button>
      </div>
    </header>
  );
};
