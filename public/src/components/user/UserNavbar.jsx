/**
 * UserNavbar Component (Presentation Layer)
 * Porsche & Apple minimalist client header for User Portal:
 * - Brand logo & title
 * - Nav tabs: "Quản lý" and "Nạp tiền"
 * - Balance pill with quick action to open Combined History
 * - Theme switcher (Light/Dark)
 * - User Profile & Logout
 */
window.UserNavbar = function UserNavbar({
  activeTab = 'management',
  onSelectTab,
  balance = 0,
  theme = 'dark',
  toggleTheme,
  currentUser,
  onOpenHistory,
  onLogout
}) {
  const { formatMoney } = window.formatters;

  return (
    <header className="navbar user-portal-navbar">
      {/* Brand & Left Navigation */}
      <div className="brand user-brand">
        <div className="user-brand-logo">
          <div className="brand-icon">
            <img src="assets/logo.png" className="app-logo-img" alt="AVATAR2D Logo" />
          </div>
          <div className="brand-text">
            <h1 className="user-brand-title">AVATAR2D</h1>
            <span className="badge-cpanel user-brand-badge">Portal Khách Hàng</span>
          </div>
        </div>

        {/* Navigation Tabs */}
        <nav className="user-nav-tabs">
          <button
            type="button"
            className={`user-nav-tab-btn ${activeTab === 'management' ? 'active' : ''}`}
            onClick={() => onSelectTab && onSelectTab('management')}
          >
            <window.Icon name="users" size={15} />
            <span>Quản Lý</span>
          </button>

          <button
            type="button"
            className={`user-nav-tab-btn ${activeTab === 'topup' ? 'active' : ''}`}
            onClick={() => onSelectTab && onSelectTab('topup')}
          >
            <window.Icon name="coins" size={15} />
            <span>Nạp Tiền</span>
          </button>
        </nav>
      </div>

      {/* Right Cluster: Balance, Theme, Profile */}
      <div className="nav-status user-nav-right">
        {/* Balance Capsule Button (Opens Transaction History) */}
        <button
          type="button"
          className="user-balance-btn"
          onClick={onOpenHistory}
          title="Bấm để xem Lịch sử Nạp tiền & Giao dịch"
        >
          <div className="balance-icon-wrap">
            <window.Icon name="coins" size={14} color="var(--apple-gold)" />
          </div>
          <div className="balance-info-wrap">
            <span className="balance-lbl">Số dư ví</span>
            <strong className="balance-amount">{formatMoney(balance)} đ</strong>
          </div>
          <window.Icon name="chevronDown" size={11} color="var(--text-tertiary)" />
        </button>

        {/* Theme Quick Switcher Button */}
        <button
          className="btn btn-icon user-theme-toggle-btn"
          onClick={toggleTheme}
          title={theme === 'dark' ? 'Chuyển sang Chế độ Sáng' : 'Chuyển sang Chế độ Tối'}
        >
          <window.Icon name={theme === 'dark' ? 'sun' : 'moon'} size={16} />
        </button>

        {/* User Profile Badge (JWT Auth) */}
        {currentUser && (
          <div className="navbar-user-profile" title={`Tài khoản: ${currentUser.email}`}>
            <div className="navbar-user-avatar">
              {(currentUser.email || 'U')[0].toUpperCase()}
            </div>
            <span className="navbar-user-email">{currentUser.email}</span>
            {onLogout && (
              <button
                type="button"
                className="navbar-logout-btn"
                onClick={onLogout}
                title="Đăng xuất"
                aria-label="Đăng xuất"
              >
                <window.Icon name="log-out" size={15} />
              </button>
            )}
          </div>
        )}
      </div>
    </header>
  );
};
