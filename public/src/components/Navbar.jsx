/**
 * Navbar Component (Presentation Layer)
 * Porsche & Apple Minimalist Floating Header with Vector Icons, Status Capsule & User Auth Badge
 */
window.Navbar = function Navbar({
  isAnyRunning,
  runningCount,
  status,
  theme = 'dark',
  toggleTheme,
  onOpenSettings,
  currentUser,
  onLogout
}) {
  const botMemMb = status?.system?.botMemMb || 0;
  const freeMemMb = status?.system?.freeMemMb || 0;
  const totalMemMb = status?.system?.totalMemMb || 0;

  return (
    <header className="navbar">
      <div className="brand">
        <div className="brand-icon">
          <img src="assets/logo.png" className="app-logo-img" alt="AVATAR2D Logo" />
        </div>

        <div className="brand-text">
          <h1>AVATAR2D AUTO</h1>
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

        {/* User Profile Badge (JWT Auth) */}
        {currentUser && (
          <div className="navbar-user-profile" title={`Đăng nhập với ${currentUser.email}`}>
            <div className="navbar-user-avatar">
              {(currentUser.email || 'U')[0].toUpperCase()}
            </div>
            <span className="navbar-user-email">{currentUser.email}</span>
            {onLogout && (
              <button
                type="button"
                className="navbar-logout-btn"
                onClick={onLogout}
                title="Đăng xuất khỏi hệ thống"
                aria-label="Đăng xuất"
              >

                <svg width="15" height="15" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
                  <path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path>
                  <polyline points="16 17 21 12 16 7"></polyline>
                  <line x1="21" y1="12" x2="9" y2="12"></line>
                </svg>
              </button>
            )}
          </div>
        )}

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
