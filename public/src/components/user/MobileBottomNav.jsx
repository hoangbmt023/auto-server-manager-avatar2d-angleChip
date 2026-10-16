/**
 * MobileBottomNav Component (Presentation Layer)
 * iPhone-style Liquid Glass Floating Bottom Navigation Bar:
 * - 3 icon-only tabs: Quản Lý (bot), Nạp Tiền (zap), Account (user)
 * - Liquid Glass blur, specular sheen edge, and glowing active pill indicator
 * - Safe area inset bottom handling to prevent overlap with browser search/home bars
 * - Strictly CSS classes, zero inline styles
 */
window.MobileBottomNav = function MobileBottomNav({
  activeTab = 'management',
  onSelectTab
}) {
  const tabs = [
    {
      id: 'management',
      label: 'Quản Lý',
      icon: 'bot',
      size: 20
    },
    {
      id: 'topup',
      label: 'Nạp Tiền',
      icon: 'zap',
      size: 20
    },
    {
      id: 'account',
      label: 'Tài Khoản',
      icon: 'user',
      size: 20
    }
  ];

  return (
    <nav className="mobile-bottom-nav" aria-label="Thanh điều hướng di động">
      <div className="mobile-nav-pill-container">
        {tabs.map((tab) => {
          const isActive = activeTab === tab.id;
          return (
            <button
              key={tab.id}
              type="button"
              className={`mobile-nav-item ${isActive ? 'active' : ''}`}
              onClick={() => onSelectTab && onSelectTab(tab.id)}
              aria-label={tab.label}
              title={tab.label}
            >
              <div className="mobile-nav-icon-wrap">
                <window.Icon name={tab.icon} size={tab.size} />
              </div>
              {isActive && <span className="mobile-nav-active-dot" />}
            </button>
          );
        })}
      </div>
    </nav>
  );
};
