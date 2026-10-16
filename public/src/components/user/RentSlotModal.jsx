/**
 * RentSlotModal Component (Presentation Layer)
 * Modern eCommerce & SaaS slot rental modal:
 * - Select Bot Version (Up xu, Full ChipMix, Auto Câu Cá)
 * - Select Duration (1, 3, 6, 12 months with combo discounts)
 * - Enter Voucher code & instant calculation
 * - Real-time breakdown: Giá gốc, Khuyến mãi, Voucher, Tổng tiền, Số dư sau thuê
 * - Auto-allocation confirmation
 * - Zero inline styles, strictly CSS classes.
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

  const { formatMoney } = window.formatters;

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
      if (appliedVoucher.maxDiscountAmount > 0) {
        voucherSavings = Math.min(voucherSavings, appliedVoucher.maxDiscountAmount);
      }
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
      <div className="modal-card rent-slot-modal">
        {/* Modal Header */}
        <div className="modal-header">
          <div className="rent-header-left">
            <div className="sidebar-icon-box rent-icon-blue">
              <window.Icon name="zap" size={20} />
            </div>
            <div>
              <h3 className="rent-title">Thuê Slot Bot Tự Động</h3>
              <span className="rent-sub">
                Hệ thống tự động phân bổ tài nguyên tối ưu cho tài khoản
              </span>
            </div>
          </div>
          <button type="button" className="modal-close-btn" onClick={onClose}>
            <window.Icon name="x" size={16} />
          </button>
        </div>

        {error && (
          <div className="alert-badge-danger rent-alert-danger">
            {error}
          </div>
        )}

        <form onSubmit={handleSubmit} className="rent-form">
          {/* 1. Game Account Credentials */}
          <div className="rent-grid-2col">
            <div className="form-group">
              <label className="rent-field-label">Tên Tài Khoản Avatar *</label>
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
              <label className="rent-field-label">Mật Khẩu Game</label>
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
            <label className="rent-field-label">
              Chọn Phiên Bản Bot
            </label>
            <div className="rent-plan-grid">
              {Object.entries(plans).map(([key, p]) => {
                const isSelected = selectedPlan === key;
                return (
                  <div
                    key={key}
                    onClick={() => setSelectedPlan(key)}
                    className={`rent-plan-item ${isSelected ? 'selected' : ''}`}
                  >
                    <div className="rent-plan-title-row">
                      <strong className={`rent-plan-title-txt ${isSelected ? 'selected' : ''}`}>
                        {p.name}
                      </strong>
                      {isSelected && <window.Icon name="check" size={14} color="var(--apple-blue)" />}
                    </div>
                    <span className="rent-plan-desc-txt">
                      {p.desc}
                    </span>
                    <span className="rent-plan-price-txt">
                      {formatMoney(p.priceMonth)} đ<span className="rent-plan-price-sub">/tháng</span>
                    </span>
                  </div>
                );
              })}
            </div>
          </div>

          {/* 3. Choose Duration (Months) */}
          <div className="form-group">
            <label className="rent-field-label">
              Thời Hạn Thuê
            </label>
            <div className="rent-duration-grid">
              {(Object.keys(durationDiscounts).length > 0 ? Object.keys(durationDiscounts).map(Number).sort((a, b) => a - b) : [1, 3, 6, 12]).map(m => {
                const isSelected = selectedMonths === m;
                const discount = durationDiscounts[m] || 0;
                return (
                  <button
                    key={m}
                    type="button"
                    onClick={() => setSelectedMonths(m)}
                    className={`rent-duration-item ${isSelected ? 'selected' : ''}`}
                  >
                    <span className="rent-duration-label">{m} Tháng</span>
                    {discount > 0 && (
                      <span className={`rent-duration-badge ${isSelected ? 'selected' : ''}`}>
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
            <label className="rent-field-label">Mã Giảm Giá / Voucher</label>
            <div className="rent-voucher-row">
              <input
                type="text"
                className="form-control rent-voucher-input"
                placeholder="Nhập mã voucher (ví dụ: CHAOBANMOI)"
                value={voucherCode}
                onChange={(e) => setVoucherCode(e.target.value.toUpperCase())}
              />
              <button
                type="button"
                className="btn btn-secondary btn-sm rent-voucher-btn"
                onClick={handleApplyVoucher}
                disabled={checkingVoucher || !voucherCode.trim()}
              >
                {checkingVoucher ? 'Đang kiểm tra...' : 'Áp Dụng'}
              </button>
            </div>
            {appliedVoucher && (
              <span className="rent-voucher-applied">
                <window.Icon name="check" size={12} /> Đã áp dụng mã [{appliedVoucher.code}]: Giảm {formatMoney(voucherSavings)} đ
              </span>
            )}
            {voucherError && (
              <span className="rent-voucher-error">
                {voucherError}
              </span>
            )}
          </div>

          {/* 5. Modern eCommerce Pricing Breakdown Card */}
          <div className="rent-summary-box">
            <div className="rent-summary-subtotal">
              <span>Giá gốc ({selectedMonths} tháng x {formatMoney(baseMonthly)}đ):</span>
              <span>{formatMoney(subtotal)} đ</span>
            </div>

            {durationSavings > 0 && (
              <div className="rent-summary-savings">
                <span>Khuyến mãi thời hạn (-{durationDiscountPercent}%):</span>
                <span>-{formatMoney(durationSavings)} đ</span>
              </div>
            )}

            {voucherSavings > 0 && (
              <div className="rent-summary-savings">
                <span>Giảm giá Voucher:</span>
                <span>-{formatMoney(voucherSavings)} đ</span>
              </div>
            )}

            <div className="rent-summary-hr" />

            <div className="rent-summary-total-row">
              <strong className="rent-summary-total-lbl">Tổng Thanh Toán:</strong>
              <strong className="rent-summary-total-val">
                {formatMoney(finalPrice)} đ
              </strong>
            </div>

            <div className="rent-summary-balance-row">
              <span>Số dư hiện tại: <strong>{formatMoney(currentBalance)} đ</strong></span>
              <span>
                Số dư sau thuê: <strong className={isBalanceSufficient ? 'rent-summary-val-green' : 'tx-status-failed'}>
                  {formatMoney(remainingBalanceAfter)} đ
                </strong>
              </span>
            </div>

            {!isBalanceSufficient && (
              <div className="rent-insufficient-box">
                <span className="rent-insufficient-txt">
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
          <div className="rent-action-row">
            <button type="button" className="btn btn-secondary" onClick={onClose} disabled={loading}>
              Hủy
            </button>
            <button
              type="submit"
              className="btn btn-primary rent-submit-btn"
              disabled={loading || !isBalanceSufficient || !username.trim()}
            >
              {loading ? 'Đang Xử Lý...' : 'Xác Nhận Thuê Nick'}
            </button>
          </div>
        </form>
      </div>
    </div>
  );
};
