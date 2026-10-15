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

  const [activeTab, setActiveTab] = React.useState('management'); // 'management' | 'topup'
  const [balance, setBalance] = React.useState(0);
  const [searchQuery, setSearchQuery] = React.useState('');
  const [rentModalOpen, setRentModalOpen] = React.useState(false);
  const [historyModalOpen, setHistoryModalOpen] = React.useState(false);
  const [editingAccount, setEditingAccount] = React.useState(null);

  // Top-up simulation state
  const [topupAmount, setTopupAmount] = React.useState(100000);
  const [topupLoading, setTopupLoading] = React.useState(false);
  const [topupSuccess, setTopupSuccess] = React.useState('');

  const formatMoney = (val) => Number(val || 0).toLocaleString('vi-VN');

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

  React.useEffect(() => {
    refreshBalance();
    fetchAccounts();
  }, [refreshBalance, fetchAccounts]);

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

  // Handle Quick Deposit
  const handlePerformTopup = async (amountToTopup) => {
    setTopupLoading(true);
    setTopupSuccess('');
    try {
      if (window.billingService) {
        const res = await window.billingService.topup({
          amount: amountToTopup,
          method: 'Chuyển Khoản Ngân Hàng',
          description: `Nạp ${formatMoney(amountToTopup)}đ vào ví tài khoản`
        });
        if (res && res.success) {
          setTopupSuccess(`Nạp thành công ${formatMoney(amountToTopup)}đ vào số dư!`);
          refreshBalance();
        }
      }
    } catch (err) {
      alert(err.message || 'Lỗi khi nạp tiền!');
    } finally {
      setTopupLoading(false);
    }
  };

  return (
    <div className="app-container" style={{ minHeight: '100vh', display: 'flex', flexDirection: 'column' }}>
      {/* 1. Header (UserNavbar) */}
      <window.UserNavbar
        activeTab={activeTab}
        onSelectTab={setActiveTab}
        balance={balance}
        theme={theme}
        toggleTheme={toggleTheme}
        currentUser={currentUser}
        onOpenHistory={() => setHistoryModalOpen(true)}
        onLogout={logoutUser}
      />

      {/* 2. Main Content Body */}
      <main className="dashboard-content" style={{ flex: 1, padding: '24px' }}>
        {/* TAB 1: QUẢN LÝ TÀI KHOẢN (MANAGEMENT) */}
        {activeTab === 'management' && (
          <section className="accounts-split-layout">
            {/* Left Sidebar Pane */}
            <aside className="accounts-sidebar-pane" style={{ maxWidth: '300px' }}>
              <div className="sidebar-header">
                <div className="sidebar-title-group">
                  <div className="sidebar-icon-box" style={{ background: 'rgba(10, 132, 255, 0.15)', color: 'var(--apple-blue)' }}>
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
                  className="btn btn-primary btn-block"
                  style={{ padding: '12px 16px', fontWeight: 700, fontSize: '0.92rem', gap: '8px' }}
                  onClick={() => setRentModalOpen(true)}
                >
                  <window.Icon name="zap" size={16} /> Thuê Tài Khoản Mới
                </button>
              </div>

              {/* Assigned File Profiles for this user */}
              <div className="sidebar-file-list-wrap" style={{ marginTop: '12px' }}>
                <span className="sidebar-section-lbl">FILE ĐƯỢC CẤP CHO NICK</span>
                <div style={{ display: 'flex', flexDirection: 'column', gap: '6px', marginTop: '6px' }}>
                  {assignedFiles.length === 0 ? (
                    <div style={{ padding: '12px', fontSize: '0.78rem', color: 'var(--text-tertiary)', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-sm)' }}>
                      Chưa có file nào được cấp (Hãy thuê nick đầu tiên)
                    </div>
                  ) : (
                    assignedFiles.map(f => {
                      const count = userAccounts.filter(a => a.fileId === f.id).length;
                      return (
                        <div
                          key={f.id}
                          style={{
                            padding: '10px 12px',
                            borderRadius: 'var(--radius-md)',
                            background: 'var(--glass-matrix-bg)',
                            border: '1px solid var(--glass-border-subtle)',
                            display: 'flex',
                            alignItems: 'center',
                            justifyContent: 'space-between'
                          }}
                        >
                          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
                            <window.Icon name="folder" size={14} color="var(--apple-blue)" />
                            <div>
                              <strong style={{ fontSize: '0.84rem', color: 'var(--text-primary)' }}>{f.name}</strong>
                              <div style={{ fontSize: '0.68rem', color: 'var(--text-tertiary)' }}>
                                {f.modType === 'chipmix' ? 'Bản ChipMix Full' : f.modType === 'fish' ? 'Auto Câu Cá' : 'Auto Nông Trại'}
                              </div>
                            </div>
                          </div>
                          <span style={{ fontSize: '0.74rem', padding: '2px 8px', borderRadius: '999px', background: 'rgba(10, 132, 255, 0.1)', color: 'var(--apple-blue)', fontWeight: 600 }}>
                            {count} nick
                          </span>
                        </div>
                      );
                    })
                  )}
                </div>
              </div>

              {/* City & Online Statistics based on user's rented accounts */}
              <div style={{
                marginTop: '16px',
                padding: '14px',
                background: 'var(--glass-matrix-bg)',
                borderRadius: 'var(--radius-md)',
                border: '1px solid var(--glass-border-subtle)',
                display: 'flex',
                flexDirection: 'column',
                gap: '10px'
              }}>
                <span className="sidebar-section-lbl" style={{ margin: 0 }}>THỐNG KÊ HOẠT ĐỘNG</span>

                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontSize: '0.82rem', color: 'var(--text-secondary)' }}>Tổng số nick thuê:</span>
                  <strong style={{ fontSize: '0.92rem', color: 'var(--text-primary)' }}>{totalRented} nick</strong>
                </div>

                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontSize: '0.82rem', color: 'var(--text-secondary)' }}>Đang Online:</span>
                  <span style={{
                    fontSize: '0.78rem',
                    fontWeight: 700,
                    padding: '2px 8px',
                    borderRadius: '999px',
                    color: runningTotal > 0 ? 'var(--apple-green)' : 'var(--text-tertiary)',
                    background: runningTotal > 0 ? 'rgba(48, 209, 88, 0.12)' : 'var(--glass-bg)'
                  }}>
                    {runningTotal} / {totalRented} Online
                  </span>
                </div>

                <div style={{ height: '1px', background: 'var(--glass-border-subtle)', margin: '2px 0' }} />

                {/* Server / City Breakdown */}
                <div style={{ display: 'flex', flexDirection: 'column', gap: '6px' }}>
                  <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.78rem' }}>
                    <span style={{ color: 'var(--apple-blue)', fontWeight: 600, display: 'flex', alignItems: 'center', gap: '4px' }}>
                      <window.Icon name="server" size={12} /> Thành phố Hoàn Mỹ:
                    </span>
                    <span style={{ color: runningHm > 0 ? 'var(--apple-green)' : 'var(--text-secondary)', fontWeight: 600 }}>
                      {runningHm}/{totalHm} Online
                    </span>
                  </div>

                  <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.78rem' }}>
                    <span style={{ color: 'var(--apple-purple)', fontWeight: 600, display: 'flex', alignItems: 'center', gap: '4px' }}>
                      <window.Icon name="server" size={12} /> Thành phố Diệu Kỳ:
                    </span>
                    <span style={{ color: runningDk > 0 ? 'var(--apple-green)' : 'var(--text-secondary)', fontWeight: 600 }}>
                      {runningDk}/{totalDk} Online
                    </span>
                  </div>
                </div>
              </div>
            </aside>

            {/* Right Main Pane: Accounts List */}
            <div className="accounts-main-pane">
              <div className="main-pane-header" style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                  <div className="sidebar-icon-box" style={{ background: 'rgba(48, 209, 88, 0.12)', color: 'var(--apple-green)' }}>
                    <window.Icon name="activity" size={18} />
                  </div>
                  <div>
                    <h3 style={{ margin: 0 }}>Danh Sách Tài Khoản Đang Thuê ({userAccounts.length})</h3>
                    <span className="sidebar-sub">Quản lý trạng thái, tự động và thời hạn từng nick</span>
                  </div>
                </div>

                {/* Search Bar - ONLY by username, NO IP filter */}
                <div className="main-search-wrapper" style={{ maxWidth: '320px', width: '100%' }}>
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
                <div style={{
                  padding: '60px 24px',
                  textAlign: 'center',
                  background: 'var(--glass-matrix-bg)',
                  borderRadius: 'var(--radius-lg)',
                  border: '1px dashed var(--glass-border-subtle)',
                  display: 'flex',
                  flexDirection: 'column',
                  alignItems: 'center',
                  gap: '12px'
                }}>
                  <div className="sidebar-icon-box" style={{ width: '54px', height: '54px', margin: '0 auto', background: 'rgba(10, 132, 255, 0.1)', color: 'var(--apple-blue)' }}>
                    <window.Icon name="users" size={26} />
                  </div>
                  <h4 style={{ margin: 0, fontSize: '1.05rem', color: 'var(--text-primary)' }}>
                    {searchQuery ? `Không tìm thấy nick nào khớp "${searchQuery}"` : 'Bạn chưa có tài khoản bot nào'}
                  </h4>
                  <p style={{ margin: 0, fontSize: '0.84rem', color: 'var(--text-secondary)', maxWidth: '420px' }}>
                    Hãy bấm nút <strong>Thuê Tài Khoản Mới</strong> để tạo bot tự động chạy không giới hạn ngay bây giờ!
                  </p>
                  <button
                    type="button"
                    className="btn btn-primary"
                    style={{ marginTop: '8px' }}
                    onClick={() => setRentModalOpen(true)}
                  >
                    <window.Icon name="zap" size={15} /> Thuê Slot Bot Ngay
                  </button>
                </div>
              ) : (
                <div className="accounts-grid" style={{ marginTop: '16px' }}>
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
                    />
                  ))}
                </div>
              )}
            </div>
          </section>
        )}

        {/* TAB 2: NẠP TIỀN VÍ (TOPUP) */}
        {activeTab === 'topup' && (
          <div style={{ maxWidth: '860px', margin: '0 auto', display: 'flex', flexDirection: 'column', gap: '20px' }}>
            <div style={{
              background: 'var(--glass-matrix-bg)',
              borderRadius: 'var(--radius-lg)',
              border: '1px solid var(--glass-border-subtle)',
              padding: '24px'
            }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: '20px' }}>
                <div style={{ display: 'flex', alignItems: 'center', gap: '12px' }}>
                  <div className="sidebar-icon-box" style={{ background: 'rgba(255, 214, 10, 0.15)', color: 'var(--apple-gold)', width: '44px', height: '44px' }}>
                    <window.Icon name="coins" size={22} />
                  </div>
                  <div>
                    <h3 style={{ margin: 0, fontSize: '1.2rem' }}>Nạp Tiền Vào Số Dư Ví</h3>
                    <span style={{ fontSize: '0.8rem', color: 'var(--text-tertiary)' }}>
                      Tự động cộng tiền vào tài khoản để thuê và gia hạn bot bất cứ lúc nào
                    </span>
                  </div>
                </div>

                <div style={{ textAlign: 'right' }}>
                  <span style={{ fontSize: '0.78rem', color: 'var(--text-tertiary)' }}>Số dư hiện tại</span>
                  <div style={{ fontSize: '1.4rem', fontWeight: 700, color: 'var(--apple-gold)' }}>
                    {formatMoney(balance)} đ
                  </div>
                </div>
              </div>

              {topupSuccess && (
                <div style={{
                  padding: '12px 16px',
                  borderRadius: 'var(--radius-md)',
                  background: 'rgba(48, 209, 88, 0.15)',
                  border: '1px solid rgba(48, 209, 88, 0.3)',
                  color: 'var(--apple-green)',
                  fontWeight: 600,
                  fontSize: '0.88rem',
                  marginBottom: '16px'
                }}>
                  {topupSuccess}
                </div>
              )}

              {/* Quick Preset Selector */}
              <label style={{ fontSize: '0.82rem', fontWeight: 600, color: 'var(--text-secondary)', marginBottom: '8px', display: 'block' }}>
                Chọn Mệnh Giá Nạp Nhanh:
              </label>
              <div style={{ display: 'grid', gridTemplateColumns: 'repeat(4, 1fr)', gap: '10px', marginBottom: '18px' }}>
                {[50000, 100000, 200000, 500000].map(amt => {
                  const isSelected = topupAmount === amt;
                  return (
                    <button
                      key={amt}
                      type="button"
                      onClick={() => setTopupAmount(amt)}
                      style={{
                        padding: '14px 10px',
                        borderRadius: 'var(--radius-md)',
                        background: isSelected ? 'rgba(255, 214, 10, 0.15)' : 'var(--glass-bg)',
                        border: `1.5px solid ${isSelected ? 'var(--apple-gold)' : 'var(--glass-border-subtle)'}`,
                        color: isSelected ? 'var(--apple-gold)' : 'var(--text-primary)',
                        fontWeight: 700,
                        fontSize: '0.95rem',
                        cursor: 'pointer',
                        transition: 'all 0.18s ease'
                      }}
                    >
                      {formatMoney(amt)} đ
                    </button>
                  );
                })}
              </div>

              {/* VietQR Simulated Instructions */}
              <div style={{
                padding: '18px',
                borderRadius: 'var(--radius-md)',
                background: 'rgba(10, 132, 255, 0.06)',
                border: '1px solid rgba(10, 132, 255, 0.2)',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'space-between',
                gap: '16px'
              }}>
                <div>
                  <div style={{ fontSize: '0.92rem', fontWeight: 600, color: 'var(--text-primary)' }}>
                    Chuyển Khoản Ngân Hàng / Quét Mã VietQR
                  </div>
                  <div style={{ fontSize: '0.8rem', color: 'var(--text-secondary)', marginTop: '4px' }}>
                    Cú pháp chuyển khoản: <strong style={{ color: 'var(--apple-blue)' }}>AVT {currentUser?.email?.split('@')[0] || 'USER'}</strong>
                  </div>
                  <div style={{ fontSize: '0.74rem', color: 'var(--text-tertiary)', marginTop: '2px' }}>
                    Hệ thống tự động cộng tiền ngay sau 1-3 phút.
                  </div>
                </div>

                <button
                  type="button"
                  className="btn btn-primary"
                  onClick={() => handlePerformTopup(topupAmount)}
                  disabled={topupLoading}
                  style={{ minWidth: '150px' }}
                >
                  {topupLoading ? 'Đang Nạp...' : `Nạp ${formatMoney(topupAmount)}đ`}
                </button>
              </div>
            </div>

            {/* Embedded Combined Transaction History */}
            <div style={{
              background: 'var(--glass-matrix-bg)',
              borderRadius: 'var(--radius-lg)',
              border: '1px solid var(--glass-border-subtle)',
              padding: '20px'
            }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: '14px' }}>
                <h4 style={{ margin: 0, fontSize: '1.02rem', display: 'flex', alignItems: 'center', gap: '8px' }}>
                  <window.Icon name="coins" size={16} color="var(--apple-gold)" /> Lịch Sử Nạp & Biến Động Số Dư
                </h4>
                <button
                  type="button"
                  className="btn btn-secondary btn-xs"
                  onClick={() => setHistoryModalOpen(true)}
                >
                  Xem Toàn Bộ
                </button>
              </div>

              {/* Render quick snippet */}
              <div style={{ fontSize: '0.82rem', color: 'var(--text-tertiary)', textAlign: 'center', padding: '16px 0' }}>
                Bấm nút <strong>Xem Toàn Bộ</strong> hoặc bấm vào <strong>Số Dư Ví</strong> trên thanh điều hướng để xem chi tiết từng giao dịch.
              </div>
            </div>
          </div>
        )}
      </main>

      {/* 3. Modals Layer */}
      {rentModalOpen && (
        <window.RentSlotModal
          currentBalance={balance}
          onClose={() => setRentModalOpen(false)}
          onRented={() => {
            refreshBalance();
            fetchAccounts();
          }}
          onOpenTopup={() => setActiveTab('topup')}
        />
      )}

      {historyModalOpen && (
        <window.TransactionHistoryModal
          currentBalance={balance}
          onClose={() => setHistoryModalOpen(false)}
          onOpenTopup={() => setActiveTab('topup')}
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
    </div>
  );
};
