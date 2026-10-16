/**
 * UserDashboardPage Component (Presentation Layer)
 * Dedicated Client / Customer Portal for Avatar bot renting:
 * - Tab 1: "Quản lý" (Account management, assigned files, city online stats, username search, countdown badges)
 * - Tab 2: "Nạp tiền" (VietQR deposit, test deposit, combined transaction history)
 */
window.UserDashboardPage = function UserDashboardPage() {
  const {
    currentUser,
    logoutUser,
    theme,
    toggleTheme,
    accounts = [],
    files = [],
    proxies = [],
    fetchAccounts,
    handleStartAccount,
    handleStopAccount,
    handleDeleteAccount,
    handleTriggerAuto,
    openSetupModal,
    setupModal,
    closeSetupModal,
    handleSaveSetup
  } = window.useApp();
  const { showDialog, showAlert } = window.useModals ? window.useModals() : {};

  const getInitialTab = () => {
    try {
      const isMobileScreen = typeof window !== 'undefined' && window.innerWidth <= 768;
      const searchParams = new URLSearchParams(window.location.search);
      const tabParam = searchParams.get('tab');
      if (tabParam === 'topup' || tabParam === 'management') return tabParam;
      if (tabParam === 'account' && isMobileScreen) return 'account';
      if (window.location.hash.includes('topup')) return 'topup';
      if (window.location.hash.includes('account') && isMobileScreen) return 'account';
    } catch (e) {}
    return 'management';
  };

  const [activeTab, setActiveTab] = React.useState(getInitialTab);
  const [isMobile, setIsMobile] = React.useState(() => typeof window !== 'undefined' && window.innerWidth <= 768);

  const handleSelectTab = React.useCallback((newTab) => {
    const isMobileScreen = typeof window !== 'undefined' && window.innerWidth <= 768;
    // Chặn máy tính (desktop) không cho chuyển vào tab account của điện thoại
    if (newTab === 'account' && !isMobileScreen) {
      newTab = 'management';
    }
    setActiveTab(newTab);
    try {
      const url = new URL(window.location.href);
      url.searchParams.set('tab', newTab);
      url.hash = '';
      window.history.replaceState({}, '', url.toString());
    } catch (e) {}
  }, []);

  // Tự động chuyển về tab Quản lý nếu người dùng resize từ màn hình điện thoại sang máy tính
  React.useEffect(() => {
    const handleResize = () => {
      const mobile = window.innerWidth <= 768;
      setIsMobile(mobile);
      if (!mobile && activeTab === 'account') {
        handleSelectTab('management');
      }
    };
    window.addEventListener('resize', handleResize);
    return () => window.removeEventListener('resize', handleResize);
  }, [activeTab, handleSelectTab]);
  const [balance, setBalance] = React.useState(0);
  const [searchQuery, setSearchQuery] = React.useState('');
  const [rentModalOpen, setRentModalOpen] = React.useState(false);
  const [historyModalOpen, setHistoryModalOpen] = React.useState(false);
  const [editingAccount, setEditingAccount] = React.useState(null);
  const [selectedLogAccount, setSelectedLogAccount] = React.useState(null);

  // Top-up and payOS state
  const [topupAmount, setTopupAmount] = React.useState(100000);
  const [policy, setPolicy] = React.useState({ bonusTiers: [], payos: { enabled: false } });
  const [payosOrder, setPayosOrder] = React.useState(null);
  const [payosLoading, setPayosLoading] = React.useState(false);
  const [recentTransactions, setRecentTransactions] = React.useState([]);
  const [totalTxCount, setTotalTxCount] = React.useState(0);
  const [loadingRecentTx, setLoadingRecentTx] = React.useState(false);

  const { formatMoney, formatDate, formatDateTime, formatExpiration } = window.formatters;

  // Fetch real-time balance
  const refreshBalance = React.useCallback(async () => {
    try {
      if (window.billingService) {
        const res = await window.billingService.getBalance();
        if (res && res.data) {
          setBalance(res.data.balance || 0);
        }
      }
    } catch (e) {}
  }, []);

  // Fetch recent transactions for sidebar (4 newest)
  const fetchRecentTransactions = React.useCallback(async () => {
    setLoadingRecentTx(true);
    try {
      if (window.billingService) {
        const res = await window.billingService.getTransactions({ page: 1, limit: 4 });
        if (res && res.data) {
          const list = Array.isArray(res.data) ? res.data : (res.data.items || []);
          const total = res.data.pagination?.total ?? (typeof res.data.total === 'number' ? res.data.total : list.length);
          setTotalTxCount(total);
          setRecentTransactions(list.slice(0, 4));
        }
      }
    } catch (e) {
    } finally {
      setLoadingRecentTx(false);
    }
  }, []);

  React.useEffect(() => {
    refreshBalance();
    fetchAccounts();

    async function loadPolicy() {
      try {
        if (window.billingService) {
          const res = await window.billingService.getPolicy();
          if (res && res.data) setPolicy(res.data);
        }
      } catch (e) {}
    }
    loadPolicy();
  }, [refreshBalance, fetchAccounts]);



  // Listen for payOS return redirect via URL search or hash query
  React.useEffect(() => {
    const searchParams = new URLSearchParams(window.location.search);
    const hashQuery = window.location.hash.includes('?') ? window.location.hash.split('?')[1] : '';
    const hashParams = new URLSearchParams(hashQuery);

    const rawStatus = (searchParams.get('status') || searchParams.get('payos_status') || hashParams.get('status') || hashParams.get('payos_status') || '').toUpperCase();
    const cancel = searchParams.get('cancel') || hashParams.get('cancel');
    const orderCode = searchParams.get('orderCode') || hashParams.get('orderCode');
    const code = searchParams.get('code') || hashParams.get('code');

    const isCancel = cancel === 'true' || rawStatus === 'CANCELLED';
    const isSuccess = rawStatus === 'PAID' || code === '00';

    if (isCancel || isSuccess) {
      handleSelectTab('topup');

      // Clear payOS callback params from browser URL, maintain ?tab=topup
      try {
        const url = new URL(window.location.href);
        url.searchParams.set('tab', 'topup');
        url.searchParams.delete('orderCode');
        url.searchParams.delete('status');
        url.searchParams.delete('code');
        url.searchParams.delete('id');
        url.searchParams.delete('cancel');
        url.searchParams.delete('payos_status');
        url.hash = '';
        window.history.replaceState({}, document.title, url.toString());
      } catch (e) {}

      if (isCancel) {
        (async () => {
          if (window.billingService && orderCode) {
            try {
              await window.billingService.cancelPayOsOrder(orderCode);
            } catch (err) {
              console.error('Cancel payos order error:', err);
            }
          }
          await fetchRecentTransactions();
        })();

        // 1. POPUP HỦY GIAO DỊCH: Màu vàng (type: warning)
        if (showDialog) {
          showDialog({
            mode: 'alert',
            type: 'warning',
            title: 'Giao Dịch Đã Hủy',
            confirmText: 'Đã Hiểu',
            message: (
              <div className="payos-receipt-box">
                <p className="payos-receipt-desc">
                  Giao dịch nạp tiền đã được hủy theo yêu cầu hoặc đã hết hạn thanh toán.
                </p>
                <div className="payos-receipt-details">
                  <div className="payos-receipt-row">
                    <span className="payos-receipt-label">Mã đơn hàng</span>
                    <strong className="payos-receipt-order-code">#{orderCode || '---'}</strong>
                  </div>
                  <div className="payos-receipt-row">
                    <span className="payos-receipt-label">Trạng thái</span>
                    <span className="tx-status-badge tx-status-cancelled">Đã Hủy</span>
                  </div>
                </div>
                <div className="payos-receipt-notice warn">
                  <window.Icon name="alert" size={14} color="var(--apple-gold)" />
                  <span>Tài khoản ngân hàng của bạn hoàn toàn không bị trừ tiền.</span>
                </div>
              </div>
            )
          });
        }
      } else if (isSuccess) {
        // 2. POPUP THÀNH CÔNG: Màu xanh (type: success)
        (async () => {
          let orderInfo = null;

          if (window.billingService && orderCode) {
            try {
              const verifyRes = await window.billingService.verifyPayOsOrder(orderCode);
              if (verifyRes && verifyRes.data) {
                orderInfo = verifyRes.data;
              }
            } catch (err) {
              console.error('Verify payos error:', err);
            }
          }

          // Làm mới số dư và lịch sử giao dịch chính xác 1 lần
          await Promise.all([
            refreshBalance(),
            fetchRecentTransactions()
          ]);

          // CHỈ hiển thị popup Thành Công khi Backend xác nhận status === 'PAID'
          if (orderInfo && orderInfo.status === 'PAID') {
            const rawAmount = orderInfo?.amount || 0;
            const bonusAmount = orderInfo?.bonusAmount || 0;
            const bonusPercent = orderInfo?.bonusPercent || 0;

            if (showDialog) {
              showDialog({
                mode: 'alert',
                type: 'success',
                title: 'Nạp Tiền Thành Công!',
                confirmText: 'Đã Hiểu',
                message: (
                  <div className="payos-receipt-box">
                    <p className="payos-receipt-desc">
                      Giao dịch qua payOS đã hoàn tất! Tiền đã được tự động cộng vào ví của bạn.
                    </p>
                    <div className="payos-receipt-details">
                      <div className="payos-receipt-row">
                        <span className="payos-receipt-label">Mã đơn hàng</span>
                        <strong className="payos-receipt-order-code">#{orderInfo?.orderCode || orderCode || '---'}</strong>
                      </div>
                      <div className="payos-receipt-row">
                        <span className="payos-receipt-label">Trạng thái</span>
                        <span className="tx-status-badge tx-status-success">Thành Công</span>
                      </div>
                      {rawAmount ? (
                        <div className="payos-receipt-row">
                          <span className="payos-receipt-label">Số tiền nạp</span>
                          <strong className="payos-receipt-amount">+{formatMoney(rawAmount)} đ</strong>
                        </div>
                      ) : null}
                      {bonusAmount > 0 && (
                        <div className="payos-receipt-row">
                          <span className="payos-receipt-label">Thưởng nạp (+{bonusPercent}%)</span>
                          <strong className="payos-receipt-bonus">+{formatMoney(bonusAmount)} đ</strong>
                        </div>
                      )}
                      <div className="payos-receipt-total-row">
                        <span className="payos-receipt-total-label">Số dư ví hiện tại</span>
                        <strong className="payos-receipt-balance">{formatMoney(orderInfo?.balance || balance || 0)} đ</strong>
                      </div>
                    </div>
                  </div>
                )
              });
            }
          } else if (orderInfo && (orderInfo.status === 'CANCELLED' || orderInfo.status === 'FAILED')) {
            if (showDialog) {
              showDialog({
                mode: 'alert',
                type: 'warning',
                title: 'Giao Dịch Đã Hủy Hoặc Thất Bại',
                confirmText: 'Đã Hiểu',
                message: 'Đơn hàng thanh toán đã bị hủy hoặc chưa hoàn tất chuyển khoản.'
              });
            }
          } else if (orderInfo && orderInfo.status === 'PENDING') {
            if (showDialog) {
              showDialog({
                mode: 'alert',
                type: 'info',
                title: 'Giao Dịch Đang Chờ Xử Lý',
                confirmText: 'Đóng',
                message: 'Hệ thống đang chờ ngân hàng xác nhận giao dịch. Số dư ví sẽ được tự động cộng ngay khi nhận được tiền.'
              });
            }
          }
        })();
      }
    }
  }, [refreshBalance, showDialog, balance]);

  const handleCreatePayOsOrder = async (amt) => {
    setPayosLoading(true);
    try {
      if (window.billingService) {
        const res = await window.billingService.createPayOsOrder(amt);
        if (res && res.data && res.data.checkoutUrl) {
          // Chuyển hướng người dùng thẳng qua trang thanh toán của payOS
          window.location.href = res.data.checkoutUrl;
          return;
        }
      }
    } catch (err) {
      if (showDialog) {
        showDialog({
          mode: 'alert',
          type: 'error',
          title: 'Lỗi Thanh Toán payOS',
          message: err.message || 'Không thể tạo phiên thanh toán payOS!',
          confirmText: 'Đóng'
        });
      } else {
        alert(err.message || 'Lỗi khi tạo phiên thanh toán payOS!');
      }
    } finally {
      setPayosLoading(false);
    }
  };

  // Filter accounts for current user
  const userAccounts = (accounts || []).map(a => ({
    ...a,
    isUserView: true
  }));

  // Stats calculation based on user's rented accounts
  const totalRented = userAccounts.length;
  const runningTotal = userAccounts.filter(a => a.isRunning).length;
  const runningHm = userAccounts.filter(a => (a.serverId === 0 || !a.serverId) && a.isRunning).length;
  const runningDk = userAccounts.filter(a => a.serverId === 1 && a.isRunning).length;
  const totalHm = userAccounts.filter(a => (a.serverId === 0 || !a.serverId)).length;
  const totalDk = userAccounts.filter(a => a.serverId === 1).length;

  // Assigned files for this user's accounts
  const assignedFileIds = Array.from(new Set(userAccounts.map(a => a.fileId).filter(Boolean)));
  const assignedFiles = (files || []).filter(f => assignedFileIds.includes(f.id));

  // Search filter: ONLY search by account username
  const displayedAccounts = userAccounts.filter(a => {
    if (!searchQuery.trim()) return true;
    const q = searchQuery.toLowerCase().trim();
    return (a.username || '').toLowerCase().includes(q);
  });

  return (
    <div className="app-container user-dashboard-wrapper">
      {/* 1. Header (UserNavbar) */}
      <window.UserNavbar
        activeTab={activeTab}
        onSelectTab={handleSelectTab}
        balance={balance}
        theme={theme}
        toggleTheme={toggleTheme}
        currentUser={currentUser}
        onOpenHistory={() => setHistoryModalOpen(true)}
        onLogout={logoutUser}
      />

      {/* 2. Main Content Body */}
      <main className="dashboard-content user-dashboard-content">
        {/* TAB 1: QUẢN LÝ TÀI KHOẢN (MANAGEMENT) */}
        {activeTab === 'management' && (
          <section className="accounts-split-layout">
            {/* Left Sidebar Pane */}
            <aside className="accounts-sidebar-pane user-sidebar-pane">
              <div className="sidebar-header">
                <div className="sidebar-title-group">
                  <div className="sidebar-icon-box user-icon-box-primary">
                    <window.Icon name="users" size={18} />
                  </div>
                  <div>
                    <h3>Quản Lý Thuê</h3>
                    <span className="sidebar-sub">Hồ sơ tài nguyên & nick</span>
                  </div>
                </div>
              </div>

              {/* Single Prominent Rental Action Button */}
              <div className="sidebar-actions">
                <button
                  type="button"
                  className="btn btn-primary btn-block user-btn-rent-main"
                  onClick={() => setRentModalOpen(true)}
                >
                  <window.Icon name="zap" size={16} /> Thuê Tài Khoản Mới
                </button>
              </div>

              {/* Assigned File Profiles for this user */}
              <div className="sidebar-file-list-wrap user-file-list-wrap">
                <span className="sidebar-section-lbl">FILE ĐƯỢC CẤP CHO NICK</span>
                <div className="user-file-list-items">
                  {assignedFiles.length === 0 ? (
                    <div className="user-file-empty">
                      Chưa có file nào được cấp (Hãy thuê nick đầu tiên)
                    </div>
                  ) : (
                    assignedFiles.map(f => {
                      const count = userAccounts.filter(a => a.fileId === f.id).length;
                      return (
                        <div key={f.id} className="user-file-item">
                          <div className="user-file-item-left">
                            <window.Icon name="folder" size={14} color="var(--apple-blue)" />
                            <div>
                              <strong className="user-file-title">{f.name}</strong>
                              <div className="user-file-subtitle">
                                {f.modType === 'chipmix' ? 'Bản ChipMix Full' : f.modType === 'fish' ? 'Auto Câu Cá' : 'Auto Nông Trại'}
                              </div>
                            </div>
                          </div>
                          <span className="user-file-badge">
                            {count} nick
                          </span>
                        </div>
                      );
                    })
                  )}
                </div>
              </div>

              {/* City & Online Statistics based on user's rented accounts */}
              <div className="user-stats-card">
                <span className="sidebar-section-lbl user-sidebar-stat-lbl">THỐNG KÊ HOẠT ĐỘNG</span>

                <div className="user-stats-row">
                  <span className="user-stats-label">Tổng số nick thuê:</span>
                  <strong className="user-stats-val">{totalRented} nick</strong>
                </div>

                <div className="user-stats-row">
                  <span className="user-stats-label">Đang Online:</span>
                  <span className={`user-stats-badge ${runningTotal > 0 ? 'online' : 'offline'}`}>
                    {runningTotal} / {totalRented} Online
                  </span>
                </div>

                <div className="user-divider" />

                {/* Server / City Breakdown */}
                <div className="user-city-list">
                  <div className="user-city-item">
                    <span className="user-city-name-hm">
                      <window.Icon name="server" size={12} /> Thành phố Hoàn Mỹ:
                    </span>
                    <span className={runningHm > 0 ? 'color-green fw-bold' : 'color-muted fw-bold'}>
                      {runningHm}/{totalHm} Online
                    </span>
                  </div>

                  <div className="user-city-item">
                    <span className="user-city-name-dk">
                      <window.Icon name="server" size={12} /> Thành phố Diệu Kỳ:
                    </span>
                    <span className={runningDk > 0 ? 'color-green fw-bold' : 'color-muted fw-bold'}>
                      {runningDk}/{totalDk} Online
                    </span>
                  </div>
                </div>
              </div>
            </aside>

            {/* Right Main Pane: Accounts List */}
            <div className="accounts-main-pane">
              <div className="main-pane-header user-pane-header-flex">
                <div className="user-pane-header-left">
                  <div className="sidebar-icon-box user-icon-box-success">
                    <window.Icon name="activity" size={18} />
                  </div>
                  <div>
                    <h3 className="user-content-heading">Danh Sách Tài Khoản Đang Thuê ({userAccounts.length})</h3>
                    <span className="sidebar-sub">Quản lý trạng thái, tự động và thời hạn từng nick</span>
                  </div>
                </div>

                {/* Search Bar - ONLY by username, NO IP filter */}
                <div className="main-search-wrapper user-search-wrapper">
                  <div className="main-search-box">
                    <window.Icon name="search" size={16} color="var(--text-tertiary)" />
                    <input
                      type="text"
                      className="main-search-input"
                      placeholder="Tìm theo tên nick..."
                      value={searchQuery}
                      onChange={(e) => setSearchQuery(e.target.value)}
                    />
                    {searchQuery && (
                      <button
                        type="button"
                        className="search-clear-btn"
                        onClick={() => setSearchQuery('')}
                      >
                        <window.Icon name="x" size={12} />
                      </button>
                    )}
                  </div>
                </div>
              </div>

              {/* Accounts Grid */}
              {displayedAccounts.length === 0 ? (
                <div className="user-accounts-empty">
                  <div className="sidebar-icon-box user-accounts-empty-icon">
                    <window.Icon name="users" size={26} />
                  </div>
                  <h4 className="user-accounts-empty-title">
                    {searchQuery ? `Không tìm thấy nick nào khớp "${searchQuery}"` : 'Bạn chưa có tài khoản bot nào'}
                  </h4>
                  <p className="user-accounts-empty-desc">
                    Hãy bấm nút <strong>Thuê Tài Khoản Mới</strong> để tạo bot tự động chạy không giới hạn ngay bây giờ!
                  </p>
                  <button
                    type="button"
                    className="btn btn-primary user-content-search-input"
                    onClick={() => setRentModalOpen(true)}
                  >
                    <window.Icon name="zap" size={15} /> Thuê Slot Bot Ngay
                  </button>
                </div>
              ) : (
                <div className="accounts-grid user-accounts-grid-wrap">
                  {displayedAccounts.map(acc => (
                    <window.AccountCard
                      key={acc.id}
                      account={acc}
                      proxies={proxies}
                      files={files}
                      onStartAccount={handleStartAccount}
                      onStopAccount={handleStopAccount}
                      onOpenEditAccount={(account) => setEditingAccount(account)}
                      onDeleteAccount={handleDeleteAccount}
                      onOpenSetup={openSetupModal}
                      onTriggerAuto={handleTriggerAuto}
                      onOpenLogs={(account) => setSelectedLogAccount(account)}
                    />
                  ))}
                </div>
              )}
            </div>
          </section>
        )}

        {/* TAB 2: NẠP TIỀN VÍ (TOPUP) */}
        {activeTab === 'topup' && (
          <section className="topup-split-layout">
            {/* Left Sidebar Pane: On-Demand Transaction History Entry */}
            <aside className="topup-sidebar-pane">
              <div className="topup-history-entry-box">
                <div className="topup-history-header">
                  <div className="topup-history-title-group">
                    <div className="sidebar-icon-box user-icon-box-gold">
                      <window.Icon name="clock" size={18} />
                    </div>
                    <div>
                      <h3 className="topup-history-title">Lịch Sử & Biến Động</h3>
                      <span className="topup-history-sub">Biến động nạp tiền & thuê bot</span>
                    </div>
                  </div>
                </div>

                <div className="topup-history-entry-body">
                  <p className="topup-history-entry-text">
                    Tra cứu chi tiết toàn bộ lịch sử nạp tiền qua cổng payOS, chi tiêu thuê bot và các giao dịch hoàn tiền.
                  </p>
                  <button
                    type="button"
                    className="btn btn-secondary btn-block topup-btn-see-more"
                    onClick={() => setHistoryModalOpen(true)}
                  >
                    <window.Icon name="clock" size={15} />
                    <span>Xem Chi Tiết Lịch Sử Giao Dịch</span>
                  </button>
                </div>
              </div>
            </aside>

            {/* Right Pane: Clean Top-up Card */}
            <div className="topup-content-pane">
              <div className="user-topup-card">
                {/* Header */}
                <div className="user-topup-header">
                  <div className="user-topup-header-left">
                    <div className="sidebar-icon-box user-icon-box-gold">
                      <window.Icon name="coins" size={22} />
                    </div>
                    <div>
                      <h3 className="user-topup-title">Nạp Tiền Vào Số Dư Ví</h3>
                      <span className="user-topup-sub">
                        Tự động cộng tiền vào tài khoản để thuê và gia hạn bot bất cứ lúc nào
                      </span>
                    </div>
                  </div>

                  <div className="user-topup-balance-display">
                    <span className="user-topup-balance-lbl">Số dư hiện tại</span>
                    <div className="user-topup-balance-val">
                      {formatMoney(balance)} đ
                    </div>
                  </div>
                </div>

                {/* Quick Preset Selector */}
                <label className="user-topup-presets-label">
                  Chọn Mệnh Giá Nạp:
                </label>
                <div className="user-topup-presets-grid">
                  {(policy.topupPresets || [20000, 50000, 100000, 200000, 500000, 1000000, 2000000]).map(amt => {
                    const isSelected = topupAmount === amt;
                    const tier = (policy.bonusTiers || [])
                      .filter(t => amt >= t.minAmount)
                      .sort((a, b) => b.minAmount - a.minAmount)[0];
                    return (
                      <button
                        key={amt}
                        type="button"
                        onClick={() => setTopupAmount(amt)}
                        className={`user-topup-preset-btn ${isSelected ? 'active' : ''}`}
                      >
                        <span>{formatMoney(amt)} đ</span>
                        {tier && (
                          <span className="user-topup-preset-bonus-tag">
                            +{tier.bonusPercent}% Thưởng
                          </span>
                        )}
                      </button>
                    );
                  })}
                </div>

                {/* Inline Bonus Calculation Box */}
                {(() => {
                  const matchedTier = (policy.bonusTiers || [])
                    .filter(t => topupAmount >= t.minAmount)
                    .sort((a, b) => b.minAmount - a.minAmount)[0];
                  const bonusVal = matchedTier ? Math.round(topupAmount * (matchedTier.bonusPercent / 100)) : 0;
                  const totalReceive = topupAmount + bonusVal;
                  return (
                    <div className="user-topup-calc-box">
                      <div className="user-topup-calc-row">
                        <span className="user-topup-summary-lbl">Thanh toán:</span>
                        <strong className="user-topup-calc-pay-val">{formatMoney(topupAmount)} đ</strong>
                      </div>
                      <div className="user-topup-calc-divider" />
                      <div className="user-topup-calc-row">
                        <div className="user-topup-calc-receive-meta">
                          <span className="user-topup-summary-lbl">Thực nhận:</span>
                          {bonusVal > 0 && (
                            <span className="user-topup-calc-bonus-badge">
                              (+{formatMoney(bonusVal)} đ thưởng)
                            </span>
                          )}
                        </div>
                        <strong className="user-topup-calc-receive-val">{formatMoney(totalReceive)} đ</strong>
                      </div>
                    </div>
                  );
                })()}

                {/* Unified Payment & Checkout Card */}
                <div className="topup-payment-card">
                  <div className="topup-payment-card-header">
                    <span className="topup-payment-card-title">Phương Thức Thanh Toán</span>
                    <span className="badge-cpanel topup-method-badge-fast">
                      <window.Icon name="zap" size={12} color="var(--apple-green)" />
                      <span>Tự Động Duyệt 2s</span>
                    </span>
                  </div>

                  <div className="topup-payment-method-row">
                    <div className="topup-method-radio">
                      <div className="topup-radio-dot" />
                    </div>
                    <div className="topup-method-icon-wrap">
                      <window.Icon name="zap" size={18} color="var(--apple-blue)" />
                    </div>
                    <div className="topup-payment-method-texts">
                      <strong className="topup-method-name">Chuyển Khoản Ngân Hàng QR (payOS / VietQR)</strong>
                      <span className="topup-method-sub">
                        Quét mã VietQR qua mọi ứng dụng ngân hàng & ví điện tử (MB, VCB, TCB, MoMo, ZaloPay...). Tự động cộng tiền tức thì 24/7.
                      </span>
                    </div>
                  </div>

                  <div className="topup-checkout-cta-wrap">
                    <button
                      type="button"
                      className="btn btn-primary topup-btn-checkout-clean"
                      onClick={() => handleCreatePayOsOrder(topupAmount)}
                      disabled={payosLoading}
                    >
                      {payosLoading ? (
                        <>
                          <div className="tx-spinner-circular sm" />
                          <span>Đang Khởi Tạo Phiên Thanh Toán...</span>
                        </>
                      ) : (
                        <>
                          <window.Icon name="zap" size={16} />
                          <span>Thanh Toán Ngay • {formatMoney(topupAmount)} đ</span>
                        </>
                      )}
                    </button>

                    {!policy.payos?.enabled && (
                      <div className="user-topup-payos-warn">
                        <window.Icon name="alert-triangle" size={14} color="var(--apple-orange)" />
                        <em>Cổng payOS đang tắt hoặc chưa cấu hình chìa khóa trong file <code>.env</code>. Vui lòng cấu hình <code>PAYOS_CLIENT_ID</code>, <code>PAYOS_API_KEY</code>, <code>PAYOS_CHECKSUM_KEY</code> và đặt <code>PAYOS_ENABLED=true</code>.</em>
                      </div>
                    )}
                  </div>
                </div>
              </div>
            </div>
          </section>
        )}

        {/* TAB 3: TÀI KHOẢN (ACCOUNT - CHỈ DÀNH RIÊNG CHO MOBILE) */}
        {activeTab === 'account' && isMobile && (
          <section className="user-account-section">
            <div className="user-account-card">
              <div className="user-account-header">
                <div className="user-account-avatar-lg">
                  {(currentUser?.email || 'U')[0].toUpperCase()}
                </div>
                <div className="user-account-meta">
                  <h3 className="user-account-email">{currentUser?.email || 'Tài khoản khách'}</h3>
                  <span className="badge-cpanel user-account-role">Portal Khách Hàng</span>
                </div>
              </div>

              <div className="user-account-details-grid">
                <div className="user-account-detail-box">
                  <span className="user-account-detail-lbl">Số Dư Khả Dụng</span>
                  <strong className="user-account-detail-val gold">{formatMoney(balance)} đ</strong>
                </div>
                <div className="user-account-detail-box">
                  <span className="user-account-detail-lbl">Số Bot Đang Thuê</span>
                  <strong className="user-account-detail-val">{accounts.length} nick</strong>
                </div>
              </div>

              <div className="user-account-actions-list">
                <button
                  type="button"
                  className="user-account-action-row"
                  onClick={() => setHistoryModalOpen(true)}
                >
                  <div className="user-account-action-left">
                    <div className="user-account-action-icon blue">
                      <window.Icon name="clock" size={18} />
                    </div>
                    <div className="user-account-action-text">
                      <strong>Lịch Sử Nạp Tiền & Giao Dịch</strong>
                      <span>Tra cứu chi tiết toàn bộ biến động số dư</span>
                    </div>
                  </div>
                  <window.Icon name="arrow-right" size={16} color="var(--text-tertiary)" />
                </button>

                <div className="user-account-action-row theme-toggle-row">
                  <div className="user-account-action-left">
                    <div className="user-account-action-icon purple">
                      <window.Icon name={theme === 'dark' ? 'moon' : 'sun'} size={18} />
                    </div>
                    <div className="user-account-action-text">
                      <strong>Giao Diện Hệ Thống</strong>
                      <span>Chế độ {theme === 'dark' ? 'Tối (Dark Mode)' : 'Sáng (Light Mode)'}</span>
                    </div>
                  </div>
                  <button
                    type="button"
                    className="btn btn-secondary btn-sm user-account-theme-btn"
                    onClick={toggleTheme}
                  >
                    <window.Icon name={theme === 'dark' ? 'sun' : 'moon'} size={14} />
                    <span>{theme === 'dark' ? 'Bật Sáng' : 'Bật Tối'}</span>
                  </button>
                </div>

                {logoutUser && (
                  <button
                    type="button"
                    className="user-account-action-row logout-row"
                    onClick={logoutUser}
                  >
                    <div className="user-account-action-left">
                      <div className="user-account-action-icon red">
                        <window.Icon name="log-out" size={18} />
                      </div>
                      <div className="user-account-action-text">
                        <strong className="text-danger">Đăng Xuất Khỏi Tài Khoản</strong>
                        <span>Thoát phiên làm việc an toàn</span>
                      </div>
                    </div>
                    <window.Icon name="arrow-right" size={16} color="var(--apple-red)" />
                  </button>
                )}
              </div>
            </div>
          </section>
        )}
      </main>

      {/* 3. Modals Layer */}
      {rentModalOpen && (
        <window.RentSlotModal
          currentBalance={balance}
          onClose={() => setRentModalOpen(false)}
          onRented={() => {
            refreshBalance();
            fetchRecentTransactions();
            fetchAccounts();
          }}
          onOpenTopup={() => handleSelectTab('topup')}
        />
      )}

      {historyModalOpen && (
        <window.TransactionHistoryModal
          currentBalance={balance}
          onClose={() => {
            setHistoryModalOpen(false);
            fetchRecentTransactions();
          }}
          onOpenTopup={() => handleSelectTab('topup')}
        />
      )}

      {/* Edit Account Modal (for note/password edit) */}
      {editingAccount && window.AccountModal && (
        <window.AccountModal
          account={editingAccount}
          files={files}
          proxies={proxies}
          activeFileId={editingAccount.fileId}
          onClose={() => setEditingAccount(null)}
          onSaved={() => {
            setEditingAccount(null);
            fetchAccounts();
          }}
        />
      )}

      {/* Bot Setup Modals (Farm, Diamond, Fish, Sell Ore) */}
      {setupModal?.open && window.AccountSetupModal && (
        <window.AccountSetupModal
          setupModal={setupModal}
          onClose={closeSetupModal}
          onSave={handleSaveSetup}
        />
      )}

      {/* Bot Logs Modal (System & Auto Events Only) */}
      {selectedLogAccount && window.AccountLogsModal && (
        <window.AccountLogsModal
          account={selectedLogAccount}
          onClose={() => setSelectedLogAccount(null)}
        />
      )}

      {/* 4. iPhone-style Liquid Glass Mobile Bottom Navigation */}
      {window.MobileBottomNav && (
        <window.MobileBottomNav
          activeTab={activeTab}
          onSelectTab={handleSelectTab}
        />
      )}
    </div>
  );
};
