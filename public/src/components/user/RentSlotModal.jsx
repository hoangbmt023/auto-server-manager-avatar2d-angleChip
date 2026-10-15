/**
 * RentSlotModal Component (Presentation Layer)
 * Modern eCommerce & SaaS slot rental modal:
 * - Select Bot Version (Up xu, Full ChipMix, Auto Câu Cá)
 * - Select Duration (1, 3, 6, 12 months with combo discounts)
 * - Enter Voucher code & instant calculation
 * - Real-time breakdown: Giá gốc, Khuyến mãi, Voucher, Tổng tiền, Số dư sau thuê
 * - Auto-allocation confirmation
 */
window.RentSlotModal = function RentSlotModal({
  onClose,
  onRented,
  currentBalance = 0,
  onOpenTopup
}) {
  const [plans, setPlans] = React.useState({
    UPXU: { name: 'Auto Up Xu Nông Trại', priceMonth: 50000, desc: 'Chăm farm, thu hoạch, giao đơn hàng, bán nông sản tự động' },
    FULL: { name: 'Full Chức Năng ChipMix', priceMonth: 90000, desc: 'Bản đầy đủ: Farm + Câu cá + Đập đá + Bán quặng đa năng' },
    FISH: { name: 'Auto Câu Cá Chuyên Nghiệp', priceMonth: 60000, desc: 'Tự động câu mọi map, tự mua vé & bán cá thông minh' }
  });
  const [durationDiscounts, setDurationDiscounts] = React.useState({ 1: 0, 3: 10, 6: 20, 12: 30 });

  const [username, setUsername] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [selectedPlan, setSelectedPlan] = React.useState('UPXU');
  const [selectedMonths, setSelectedMonths] = React.useState(1);
  const [voucherCode, setVoucherCode] = React.useState('');
  const [appliedVoucher, setAppliedVoucher] = React.useState(null);
  const [voucherError, setVoucherError] = React.useState('');
  const [note, setNote] = React.useState('');
  const [loading, setLoading] = React.useState(false);
  const [checkingVoucher, setCheckingVoucher] = React.useState(false);
  const [error, setError] = React.useState('');

  const formatMoney = (val) => Number(val || 0).toLocaleString('vi-VN');

  // Load plans & discounts from API
  React.useEffect(() => {
    async function fetchPlans() {
      try {
        if (window.rentalService) {
          const res = await window.rentalService.getPlans();
          if (res && res.data) {
            if (res.data.plans) setPlans(res.data.plans);
            if (res.data.durationDiscounts) setDurationDiscounts(res.data.durationDiscounts);
          }
        }
      } catch (e) {}
    }
    fetchPlans();
  }, []);

  // Compute pricing
  const currentPlanConfig = plans[selectedPlan] || plans.UPXU || { priceMonth: 50000, name: 'Up Xu' };
  const baseMonthly = currentPlanConfig.priceMonth || 50000;
  const subtotal = baseMonthly * selectedMonths;

  const durationDiscountPercent = durationDiscounts[selectedMonths] || 0;
  const durationSavings = Math.floor((subtotal * durationDiscountPercent) / 100);
  const amountAfterDuration = subtotal - durationSavings;

  let voucherSavings = 0;
  if (appliedVoucher) {
    if (appliedVoucher.discountPercent > 0) {
      voucherSavings = Math.floor((amountAfterDuration * appliedVoucher.discountPercent) / 100);
    } else if (appliedVoucher.discountAmount > 0) {
      voucherSavings = Math.min(amountAfterDuration, appliedVoucher.discountAmount);
    }
  }

  const finalPrice = Math.max(0, amountAfterDuration - voucherSavings);
  const isBalanceSufficient = currentBalance >= finalPrice;
  const remainingBalanceAfter = currentBalance - finalPrice;

  // Handle Apply Voucher
  const handleApplyVoucher = async () => {
    if (!voucherCode.trim()) return;
    setCheckingVoucher(true);
    setVoucherError('');
    try {
      if (window.billingService) {
        const res = await window.billingService.checkVoucher(voucherCode.trim(), amountAfterDuration);
        if (res && res.data && res.data.isValid) {
          setAppliedVoucher(res.data);
          setVoucherError('');
        } else {
          setAppliedVoucher(null);
          setVoucherError('Mã voucher không hợp lệ!');
        }
      }
    } catch (err) {
      setAppliedVoucher(null);
      setVoucherError(err.message || 'Mã giảm giá không hợp lệ hoặc đã hết hạn!');
    } finally {
      setCheckingVoucher(false);
    }
  };

  // Handle Checkout
  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!username.trim()) {
      setError('Vui lòng nhập tên tài khoản game!');
      return;
    }
    if (!isBalanceSufficient) {
      setError('Số dư ví không đủ để thanh toán. Vui lòng nạp thêm tiền!');
      return;
    }

    setLoading(true);
    setError('');

    try {
      if (window.rentalService) {
        const res = await window.rentalService.checkout({
          username: username.trim(),
          password: password || '',
          plan: selectedPlan,
          durationMonths: selectedMonths,
          voucherCode: appliedVoucher ? appliedVoucher.code : null,
          note: note.trim()
        });

        if (res && res.success) {
          if (onRented) onRented(res.data);
          onClose();
        } else {
          setError(res?.message || 'Có lỗi xảy ra khi thuê bot!');
        }
      }
    } catch (err) {
      setError(err.message || 'Có lỗi xảy ra khi thuê bot!');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="modal-overlay" onClick={(e) => { if (e.target === e.currentTarget) onClose(); }}>
      <div className="modal-card rent-slot-modal" style={{ maxWidth: '640px', width: '92%' }}>
        {/* Modal Header */}
        <div className="modal-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
            <div className="sidebar-icon-box" style={{ background: 'rgba(10, 132, 255, 0.15)', color: 'var(--apple-blue)' }}>
              <window.Icon name="zap" size={20} />
            </div>
            <div>
              <h3 style={{ margin: 0, fontSize: '1.15rem' }}>Thuê Slot Bot Tự Động</h3>
              <span style={{ fontSize: '0.78rem', color: 'var(--text-tertiary)' }}>
                Hệ thống tự động phân bổ tài nguyên tối ưu cho tài khoản
              </span>
            </div>
          </div>
          <button type="button" className="modal-close-btn" onClick={onClose}>
            <window.Icon name="x" size={16} />
          </button>
        </div>

        {error && (
          <div className="alert-badge-danger" style={{ margin: '14px 20px 0', padding: '10px 14px', borderRadius: 'var(--radius-sm)', fontSize: '0.82rem' }}>
            {error}
          </div>
        )}

        <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '18px', padding: '20px' }}>
          {/* 1. Game Account Credentials */}
          <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '12px' }}>
            <div className="form-group">
              <label style={{ fontSize: '0.8rem', fontWeight: 600, color: 'var(--text-secondary)' }}>Tên Tài Khoản Avatar *</label>
              <input
                type="text"
                className="form-control"
                placeholder="Nhập tên đăng nhập game"
                value={username}
                onChange={(e) => setUsername(e.target.value)}
                required
                autoFocus
              />
            </div>
            <div className="form-group">
              <label style={{ fontSize: '0.8rem', fontWeight: 600, color: 'var(--text-secondary)' }}>Mật Khẩu Game</label>
              <input
                type="password"
                className="form-control"
                placeholder="Mật khẩu game (tùy chọn)"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
            </div>
          </div>

          {/* 2. Choose Bot Version (Plan) */}
          <div className="form-group">
            <label style={{ fontSize: '0.8rem', fontWeight: 600, color: 'var(--text-secondary)', marginBottom: '8px', display: 'block' }}>
              Chọn Phiên Bản Bot
            </label>
            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(170px, 1fr))', gap: '10px' }}>
              {Object.entries(plans).map(([key, p]) => {
                const isSelected = selectedPlan === key;
                return (
                  <div
                    key={key}
                    onClick={() => setSelectedPlan(key)}
                    style={{
                      padding: '12px',
                      borderRadius: 'var(--radius-md)',
                      background: isSelected ? 'rgba(10, 132, 255, 0.12)' : 'var(--glass-matrix-bg)',
                      border: `1.5px solid ${isSelected ? 'var(--apple-blue)' : 'var(--glass-border-subtle)'}`,
                      cursor: 'pointer',
                      transition: 'all 0.18s ease',
                      display: 'flex',
                      flexDirection: 'column',
                      gap: '4px'
                    }}
                  >
                    <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                      <strong style={{ fontSize: '0.88rem', color: isSelected ? 'var(--apple-blue)' : 'var(--text-primary)' }}>
                        {p.name}
                      </strong>
                      {isSelected && <window.Icon name="check" size={14} color="var(--apple-blue)" />}
                    </div>
                    <span style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)', minHeight: '32px' }}>
                      {p.desc}
                    </span>
                    <span style={{ fontSize: '0.82rem', fontWeight: 700, color: 'var(--apple-gold)', marginTop: '4px' }}>
                      {formatMoney(p.priceMonth)} đ<span style={{ fontSize: '0.7rem', fontWeight: 400, color: 'var(--text-tertiary)' }}>/tháng</span>
                    </span>
                  </div>
                );
              })}
            </div>
          </div>

          {/* 3. Choose Duration (Months) */}
          <div className="form-group">
            <label style={{ fontSize: '0.8rem', fontWeight: 600, color: 'var(--text-secondary)', marginBottom: '8px', display: 'block' }}>
              Thời Hạn Thuê
            </label>
            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(4, 1fr)', gap: '8px' }}>
              {[1, 3, 6, 12].map(m => {
                const isSelected = selectedMonths === m;
                const discount = durationDiscounts[m] || 0;
                return (
                  <button
                    key={m}
                    type="button"
                    onClick={() => setSelectedMonths(m)}
                    style={{
                      padding: '10px 4px',
                      borderRadius: 'var(--radius-md)',
                      background: isSelected ? 'var(--apple-blue)' : 'var(--glass-matrix-bg)',
                      color: isSelected ? '#fff' : 'var(--text-primary)',
                      border: `1px solid ${isSelected ? 'var(--apple-blue)' : 'var(--glass-border-subtle)'}`,
                      fontWeight: 600,
                      cursor: 'pointer',
                      display: 'flex',
                      flexDirection: 'column',
                      alignItems: 'center',
                      gap: '2px'
                    }}
                  >
                    <span style={{ fontSize: '0.86rem' }}>{m} Tháng</span>
                    {discount > 0 && (
                      <span style={{
                        fontSize: '0.64rem',
                        padding: '1px 5px',
                        borderRadius: '999px',
                        background: isSelected ? 'rgba(255,255,255,0.25)' : 'rgba(48, 209, 88, 0.15)',
                        color: isSelected ? '#fff' : 'var(--apple-green)',
                        fontWeight: 700
                      }}>
                        -{discount}%
                      </span>
                    )}
                  </button>
                );
              })}
            </div>
          </div>

          {/* 4. Voucher Code Input */}
          <div className="form-group">
            <label style={{ fontSize: '0.8rem', fontWeight: 600, color: 'var(--text-secondary)' }}>Mã Giảm Giá / Voucher</label>
            <div style={{ display: 'flex', gap: '8px', marginTop: '4px' }}>
              <input
                type="text"
                className="form-control"
                placeholder="Nhập mã voucher (ví dụ: CHAOBANMOI)"
                value={voucherCode}
                onChange={(e) => setVoucherCode(e.target.value.toUpperCase())}
                style={{ textTransform: 'uppercase' }}
              />
              <button
                type="button"
                className="btn btn-secondary btn-sm"
                onClick={handleApplyVoucher}
                disabled={checkingVoucher || !voucherCode.trim()}
                style={{ minWidth: '90px' }}
              >
                {checkingVoucher ? 'Đang kiểm tra...' : 'Áp Dụng'}
              </button>
            </div>
            {appliedVoucher && (
              <span style={{ fontSize: '0.74rem', color: 'var(--apple-green)', marginTop: '4px', display: 'inline-flex', alignItems: 'center', gap: '4px' }}>
                <window.Icon name="check" size={12} /> Đã áp dụng mã [{appliedVoucher.code}]: Giảm {formatMoney(voucherSavings)} đ
              </span>
            )}
            {voucherError && (
              <span style={{ fontSize: '0.74rem', color: 'var(--apple-red)', marginTop: '4px', display: 'block' }}>
                {voucherError}
              </span>
            )}
          </div>

          {/* 5. Modern eCommerce Pricing Breakdown Card */}
          <div style={{
            background: 'var(--glass-matrix-bg)',
            borderRadius: 'var(--radius-md)',
            border: '1px solid var(--glass-border-subtle)',
            padding: '14px 16px',
            display: 'flex',
            flexDirection: 'column',
            gap: '8px'
          }}>
            <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.82rem', color: 'var(--text-secondary)' }}>
              <span>Giá gốc ({selectedMonths} tháng x {formatMoney(baseMonthly)}đ):</span>
              <span>{formatMoney(subtotal)} đ</span>
            </div>

            {durationSavings > 0 && (
              <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.82rem', color: 'var(--apple-green)' }}>
                <span>Khuyến mãi thời hạn (-{durationDiscountPercent}%):</span>
                <span>-{formatMoney(durationSavings)} đ</span>
              </div>
            )}

            {voucherSavings > 0 && (
              <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.82rem', color: 'var(--apple-green)' }}>
                <span>Giảm giá Voucher:</span>
                <span>-{formatMoney(voucherSavings)} đ</span>
              </div>
            )}

            <div style={{ height: '1px', background: 'var(--glass-border-subtle)', margin: '4px 0' }} />

            <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
              <strong style={{ fontSize: '0.94rem', color: 'var(--text-primary)' }}>Tổng Thanh Toán:</strong>
              <strong style={{ fontSize: '1.25rem', color: 'var(--apple-gold)' }}>
                {formatMoney(finalPrice)} đ
              </strong>
            </div>

            <div style={{ display: 'flex', justifyContent: 'space-between', fontSize: '0.78rem', marginTop: '4px', color: 'var(--text-tertiary)' }}>
              <span>Số dư hiện tại: <strong style={{ color: 'var(--text-primary)' }}>{formatMoney(currentBalance)} đ</strong></span>
              <span>
                Số dư sau thuê: <strong style={{ color: isBalanceSufficient ? 'var(--apple-green)' : 'var(--apple-red)' }}>
                  {formatMoney(remainingBalanceAfter)} đ
                </strong>
              </span>
            </div>

            {!isBalanceSufficient && (
              <div style={{
                marginTop: '6px',
                padding: '8px 12px',
                borderRadius: 'var(--radius-sm)',
                background: 'rgba(255, 69, 58, 0.1)',
                border: '1px solid rgba(255, 69, 58, 0.25)',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'space-between'
              }}>
                <span style={{ fontSize: '0.78rem', color: 'var(--apple-red)', fontWeight: 600 }}>
                  Số dư ví không đủ ({formatMoney(currentBalance)}đ / {formatMoney(finalPrice)}đ)
                </span>
                {onOpenTopup && (
                  <button
                    type="button"
                    className="btn btn-primary btn-xs"
                    onClick={() => { onClose(); onOpenTopup(); }}
                  >
                    Nạp Tiền Ngay
                  </button>
                )}
              </div>
            )}
          </div>

          {/* Action Buttons */}
          <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', marginTop: '6px' }}>
            <button type="button" className="btn btn-secondary" onClick={onClose} disabled={loading}>
              Hủy
            </button>
            <button
              type="submit"
              className="btn btn-primary"
              disabled={loading || !isBalanceSufficient || !username.trim()}
              style={{ minWidth: '150px' }}
            >
              {loading ? 'Đang Xử Lý...' : 'Xác Nhận Thuê Nick'}
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};
