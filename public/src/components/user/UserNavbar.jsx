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
  const formatMoney = (val) => Number(val || 0).toLocaleString('vi-VN');

  return (
    <header className="navbar user-portal-navbar">
      {/* Brand & Left Navigation */}
      <div className="brand" style={{ gap: '20px' }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
          <div className="brand-icon">
            <img src="assets/logo.png" className="app-logo-img" alt="AVATAR2D Logo" />
          </div>
          <div className="brand-text">
            <h1 style={{ fontSize: '1.05rem', margin: 0 }}>AVATAR2D</h1>
            <span className="badge-cpanel" style={{ fontSize: '0.66rem' }}>Portal Khách Hàng</span>
          </div>
        </div>

        {/* Navigation Tabs */}
        <nav className="user-nav-tabs" style={{ display: 'flex', gap: '6px' }}>
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
      <div className="nav-status" style={{ gap: '12px' }}>
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
          className="btn btn-icon"
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
                <svg width="15" height="15" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
                  <path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path>
                  <polyline points="16 17 21 12 16 7"></polyline>
                  <line x1="21" y1="12" x2="9" y2="12"></line>
                </svg>
              </button>
            )}
          </div>
        )}
      </div>
    </header>
  );
};
