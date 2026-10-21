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
  onOpenTopup,
  accountToRenew = null
}) {
  const isRenewMode = Boolean(accountToRenew);

  const [plans, setPlans] = React.useState({
    UPXU: { name: 'Auto Up Xu Nông Trại', priceMonth: 50000, desc: 'Gói cày xu cơ bản tiết kiệm chi phí cho tài khoản nông dân' },
    FULL: { name: 'Auto Full chức năng', priceMonth: 90000, desc: 'Gói toàn năng hỗ trợ đầy đủ mọi hoạt động kiếm xu và ngọc tự động' },
    FISH: { name: 'Auto Câu Cá Chuyên Nghiệp', priceMonth: 60000, desc: 'Gói chuyên biệt cho cần thủ, tối ưu hoá thời gian và lợi nhuận câu cá' }
  });
  const [durationDiscounts, setDurationDiscounts] = React.useState({ 1: 0, 3: 10, 6: 20, 12: 30 });

  const [username, setUsername] = React.useState(accountToRenew?.username || '');
  const [password, setPassword] = React.useState('');
  const [showPassword, setShowPassword] = React.useState(false);
  const [selectedPlan, setSelectedPlan] = React.useState(accountToRenew?.rentalPlan || 'UPXU');
  const [selectedMonths, setSelectedMonths] = React.useState(1);
  const [voucherCode, setVoucherCode] = React.useState('');
  const [appliedVoucher, setAppliedVoucher] = React.useState(null);
  const [voucherError, setVoucherError] = React.useState('');
  const [note, setNote] = React.useState('');
  const [loading, setLoading] = React.useState(false);
  const [checkingVoucher, setCheckingVoucher] = React.useState(false);
  const [fieldErrors, setFieldErrors] = React.useState({});

  const clearFieldError = (field) => {
    setFieldErrors(prev => {
      if (!prev[field]) return prev;
      const copy = { ...prev };
      delete copy[field];
      return copy;
    });
  };

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
        if (res && res.success && res.data && res.data.isValid) {
          setAppliedVoucher(res.data);
          setVoucherError('');
        } else {
          setAppliedVoucher(null);
          const errorMsg = res?.message || res?.data?.message || 'Mã voucher không hợp lệ hoặc đã hết hạn!';
          setVoucherError(errorMsg);
        }
      }
    } catch (err) {
      setAppliedVoucher(null);
      const errorMsg = err?.response?.data?.message || err?.message || 'Mã voucher không hợp lệ hoặc đã hết hạn!';
      setVoucherError(errorMsg);
    } finally {
      setCheckingVoucher(false);
    }
  };

  // Handle Checkout / Renew (with double-click protection)
  const handleSubmit = async (e) => {
    e.preventDefault();

    // 1. Validate ngay tại tầng Frontend: trường bắt buộc
    const feErrors = {};
    if (!isRenewMode && !username.trim()) {
      feErrors.username = 'Tên tài khoản không được để trống!';
    }

    if (Object.keys(feErrors).length > 0) {
      setFieldErrors(feErrors);
      return;
    }
    setFieldErrors({});

    // 2. Kiểm tra số dư ví khả dụng (nếu không đủ -> hiện Popup hệ thống)
    if (!isBalanceSufficient) {
      const shortage = finalPrice - currentBalance;
      const shortageMsg = `Số dư ví không đủ để thanh toán (Còn thiếu ${formatMoney(shortage)} đ). Bạn có muốn chuyển sang trang Nạp Tiền ngay không?`;
      if (typeof window.showDialog === 'function') {
        window.showDialog({
          mode: 'confirm',
          type: 'warning',
          title: 'Số Dư Ví Không Đủ',
          message: shortageMsg,
          confirmText: 'Nạp Tiền Ngay',
          cancelText: 'Đóng',
          onConfirm: () => {
            onClose();
            if (typeof onOpenTopup === 'function') onOpenTopup();
          }
        });
      } else if (typeof window.showAlert === 'function') {
        window.showAlert(shortageMsg, 'Số Dư Ví Không Đủ', 'warning');
      } else {
        alert(shortageMsg);
      }
      return;
    }

    setLoading(true);

    try {
      if (window.rentalService) {
        let res;
        if (isRenewMode) {
          res = await window.rentalService.renew(accountToRenew.id, {
            durationMonths: selectedMonths,
            voucherCode: appliedVoucher ? appliedVoucher.code : null
          });
        } else {
          res = await window.rentalService.checkout({
            username: username.trim(),
            password: password || '',
            plan: selectedPlan,
            durationMonths: selectedMonths,
            voucherCode: appliedVoucher ? appliedVoucher.code : null,
            note: note.trim()
          });
        }

        if (res && res.success) {
          if (onRented) onRented(res.data, isRenewMode);
          onClose();
        } else {
          // 3. Nếu Backend chặn và trả về field-level errors (Map errors)
          if (res && res.errors && typeof res.errors === 'object' && Object.keys(res.errors).length > 0) {
            setFieldErrors(res.errors);
          } else {
            // Không có field-level error -> Hiện Popup hệ thống đã viết sẵn
            const msg = res?.message || (isRenewMode ? 'Có lỗi xảy ra khi gia hạn bot!' : 'Có lỗi xảy ra khi thuê bot!');
            if (typeof window.showAlert === 'function') {
              window.showAlert(msg, isRenewMode ? 'Lỗi Gia Hạn Bot' : 'Lỗi Thuê Bot', 'error');
            } else if (typeof window.showDialog === 'function') {
              window.showDialog({
                mode: 'alert',
                type: 'error',
                title: isRenewMode ? 'Lỗi Gia Hạn Bot' : 'Lỗi Thuê Bot',
                message: msg,
                confirmText: 'Đã Hiểu'
              });
            } else {
              alert(msg);
            }
          }
        }
      }
    } catch (err) {
      const resData = err?.response?.data || err?.data;
      if (resData && resData.errors && typeof resData.errors === 'object' && Object.keys(resData.errors).length > 0) {
        setFieldErrors(resData.errors);
      } else {
        // Không có field error -> Hiện Popup hệ thống
        const errorMsg = resData?.message || err?.message || (isRenewMode ? 'Có lỗi xảy ra khi gia hạn bot!' : 'Có lỗi xảy ra khi thuê bot!');
        if (typeof window.showAlert === 'function') {
          window.showAlert(errorMsg, isRenewMode ? 'Lỗi Gia Hạn Bot' : 'Lỗi Thuê Bot', 'error');
        } else if (typeof window.showDialog === 'function') {
          window.showDialog({
            mode: 'alert',
            type: 'error',
            title: isRenewMode ? 'Lỗi Gia Hạn Bot' : 'Lỗi Thuê Bot',
            message: errorMsg,
            confirmText: 'Đã Hiểu'
          });
        } else {
          alert(errorMsg);
        }
      }
    } finally {
      setLoading(false);
    }
  };

  const FEATURE_NAMES = {
    farm: 'Auto Farm',
    fish: 'Auto Câu cá',
    diamond: 'Auto KC',
    sellOre: 'Auto Bán đá',
    upThue: 'Cài đặt Úp thuê'
  };

  return (
    <window.ModalBase
      title={isRenewMode ? "Gia Hạn Tài Khoản Bot" : "Thuê Slot Bot Tự Động"}
      subtitle={isRenewMode ? `Gia hạn thời gian chạy cho nick [${accountToRenew.username}]` : "Hệ thống tự động phân bổ tài nguyên tối ưu cho tài khoản"}
      icon={isRenewMode ? "clock" : "zap"}
      iconColor={isRenewMode ? "var(--apple-gold)" : "var(--apple-blue)"}
      size="md"
      onClose={onClose}
    >
      <form onSubmit={handleSubmit} className="rent-form">
        {/* 1. Account Info: Banner in Renewal mode, input fields in Rent mode */}
        {isRenewMode ? (
          <div className="rent-renew-banner">
            <div className="rent-renew-account-info">
              <div className="rent-renew-avatar-box">
                <window.Icon name="user" size={20} />
              </div>
              <div className="rent-renew-account-details">
                <div className="rent-renew-username">
                  {accountToRenew.username}
                </div>
                <div className="rent-renew-server">
                  {accountToRenew.serverName ? `Máy chủ: ${accountToRenew.serverName}` : 'Máy chủ: Hoàn Mỹ'}
                </div>
              </div>
            </div>

            <div className="rent-renew-plan-info">
              <div className="rent-renew-row">
                <span className="rent-renew-row-lbl">Gói cước:</span>
                <span className={`rent-renew-plan-badge badge-plan-${(selectedPlan || '').toLowerCase()}`}>
                  <window.Icon name={selectedPlan === 'FULL' ? 'zap' : (selectedPlan === 'FISH' ? 'fish' : 'sprout')} size={13} />
                  {currentPlanConfig.name || selectedPlan}
                </span>
              </div>
              <div className="rent-renew-row">
                <span className="rent-renew-row-lbl">Đơn giá:</span>
                <div className="rent-renew-price-tag">
                  <strong className="rent-renew-price-val">{formatMoney(baseMonthly)} đ</strong>
                  <span className="rent-renew-price-period">/tháng (cố định)</span>
                </div>
              </div>
            </div>
          </div>
        ) : (
          <div className="rent-grid-2col">
            <div className="form-group">
              <label className="rent-field-label">Tên Tài Khoản Avatar *</label>
              <input
                type="text"
                className={`form-control ${fieldErrors.username ? 'input-error' : ''}`}
                placeholder="Nhập tên đăng nhập game"
                value={username}
                onChange={(e) => {
                  setUsername(e.target.value);
                  clearFieldError('username');
                }}
                autoFocus
              />
              {fieldErrors.username && (
                <div className="field-error-msg">
                  <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                  <span>{fieldErrors.username}</span>
                </div>
              )}
            </div>
            <div className="form-group">
              <label className="rent-field-label">Mật Khẩu Game</label>
              <div className="password-input-wrapper">
                <input
                  type={showPassword ? 'text' : 'password'}
                  className="form-control password-input-field"
                  placeholder="Mật khẩu game (tùy chọn)"
                  value={password}
                  onChange={(e) => setPassword(e.target.value)}
                />
                <button
                  type="button"
                  onClick={() => setShowPassword(!showPassword)}
                  className={`password-toggle-btn ${showPassword ? 'active' : ''}`}
                  title={showPassword ? 'Ẩn mật khẩu' : 'Hiện mật khẩu'}
                  tabIndex={-1}
                >
                  <window.Icon name={showPassword ? 'eye-off' : 'eye'} size={16} />
                </button>
              </div>
            </div>
          </div>
        )}

        {/* 2. Choose Bot Version (Plan) - Only shown in new rent mode */}
        {!isRenewMode && (
          <div className="form-group">
            <label className="rent-field-label">
              Chọn Phiên Bản Bot
            </label>
            <div className="rent-plan-grid">
              {Object.entries(plans).map(([key, p]) => {
                const isSelected = selectedPlan === key;
                const featuresList = p.features || (key === 'FULL' ? ['farm', 'fish', 'diamond', 'sellOre', 'upThue'] : (key === 'FISH' ? ['fish', 'upThue'] : ['farm', 'upThue']));
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
                    {Array.isArray(featuresList) && featuresList.length > 0 && (
                      <div className="rent-plan-features-list">
                        {featuresList.map(fKey => (
                          <span key={fKey} className="rent-plan-feature-tag">
                            ✓ {FEATURE_NAMES[fKey] || fKey}
                          </span>
                        ))}
                      </div>
                    )}
                    <span className="rent-plan-price-txt">
                      {formatMoney(p.priceMonth)} đ<span className="rent-plan-price-sub">/tháng</span>
                    </span>
                  </div>
                );
              })}
            </div>
          </div>
        )}

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
                onChange={(e) => {
                  setVoucherCode(e.target.value.toUpperCase());
                  if (voucherError) setVoucherError('');
                }}
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
                <window.Icon name="alert-circle" size={12} /> {voucherError}
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
              <span className="rent-balance-col">
                <span>Số dư hiện tại:</span>
                <strong className="rent-balance-highlight">{formatMoney(currentBalance)} đ</strong>
              </span>
              <span className="rent-balance-col">
                <span>{isRenewMode ? 'Số dư sau gia hạn:' : 'Số dư sau thuê:'}</span>
                <strong className={isBalanceSufficient ? 'rent-summary-val-green' : 'rent-summary-val-red'}>
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
              disabled={loading}
            >
              {loading
                ? (isRenewMode ? 'Đang Xử Lý Gia Hạn...' : 'Đang Xử Lý...')
                : (isRenewMode ? 'Xác Nhận Gia Hạn' : 'Xác Nhận Thuê Nick')}
            </button>
          </div>
        </form>
    </window.ModalBase>
  );
};
