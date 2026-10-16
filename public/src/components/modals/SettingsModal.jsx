/**
 * SettingsModal Component (Presentation Layer / Modals)
 * Porsche & Apple Precision System & Rental Configuration
 * - Tab 1: Hệ Thống (RAM, Port, Theme, Password)
 * - Tab 2: Cấu Hình Thuê Bot (Bảng giá, File đích, Chiến lược chia proxy, Voucher)
 */
const { useState: useSettingsModalState, useEffect: useSettingsModalEffect } = React;
const { formatMoney } = window.formatters;

window.SettingsModal = function SettingsModal({ config, theme = 'dark', setTheme, onClose, onSaved }) {
  const [activeTab, setActiveTab] = useSettingsModalState('system'); // 'system' | 'rental'

  // Tab 1: System settings
  const [appId, setAppId] = useSettingsModalState(config?.appId || 'avatar_main');
  const [port, setPort] = useSettingsModalState(config?.port || 3001);
  const [rmsMode, setRmsMode] = useSettingsModalState(config?.rmsMode || 'file');
  const [maxMemory, setMaxMemory] = useSettingsModalState(config?.maxMemoryMb || 256);
  const [autoRestart, setAutoRestart] = useSettingsModalState(Boolean(config?.autoRestart));
  const [autoStart, setAutoStart] = useSettingsModalState(Boolean(config?.autoStart));
  const [password, setPassword] = useSettingsModalState('');
  const [selectedTheme, setSelectedTheme] = useSettingsModalState(theme || 'dark');
  const [fieldErrors, setFieldErrors] = useSettingsModalState({});

  // Tab 2: Rental Allocation settings
  const [allocationRules, setAllocationRules] = useSettingsModalState(null);
  const [availableFiles, setAvailableFiles] = useSettingsModalState([]);
  const [vouchers, setVouchers] = useSettingsModalState([]);
  const [newVoucherCode, setNewVoucherCode] = useSettingsModalState('');
  const [newVoucherDiscountType, setNewVoucherDiscountType] = useSettingsModalState('PERCENT');
  const [newVoucherValue, setNewVoucherValue] = useSettingsModalState(15);
  const [newVoucherMaxDiscount, setNewVoucherMaxDiscount] = useSettingsModalState(0);
  const [newVoucherMaxUsesPerUser, setNewVoucherMaxUsesPerUser] = useSettingsModalState(1);
  const [newVoucherMaxUses, setNewVoucherMaxUses] = useSettingsModalState(100);
  const [editingVoucherCode, setEditingVoucherCode] = useSettingsModalState(null);
  const [rentalSaveSuccess, setRentalSaveSuccess] = useSettingsModalState('');
  const [newMonthNumber, setNewMonthNumber] = useSettingsModalState(2);
  const [newMonthDiscount, setNewMonthDiscount] = useSettingsModalState(5);
  const [newBonusMinAmount, setNewBonusMinAmount] = useSettingsModalState(100000);
  const [newBonusPercent, setNewBonusPercent] = useSettingsModalState(5);
  const [newPresetAmount, setNewPresetAmount] = useSettingsModalState(50000);
  const [payosEnv, setPayosEnv] = useSettingsModalState(null);

  const clearFieldError = (f) => {
    setFieldErrors(prev => {
      if (!prev || !prev[f]) return prev;
      const next = { ...prev };
      delete next[f];
      return next;
    });
  };

  const handleThemeChange = (newTheme) => {
    setSelectedTheme(newTheme);
    if (setTheme) {
      setTheme(newTheme);
    }
  };

  // Load rental allocation configs when tab clicked
  useSettingsModalEffect(() => {
    async function loadAllocationConfig() {
      try {
        if (window.rentalService) {
          const res = await window.rentalService.getAdminAllocations();
          if (res && res.data) {
            setAllocationRules(res.data.rules);
            setAvailableFiles(res.data.availableFiles || []);
            setVouchers(res.data.vouchers || []);
            if (res.data.payosEnv) setPayosEnv(res.data.payosEnv);
          }
        }
      } catch (e) {}
    }
    loadAllocationConfig();
  }, []);

  const handleSubmitSystem = async (e) => {
    e.preventDefault();

    // 1. Validate Frontend
    const feErrors = {};
    const portNum = parseInt(port, 10);
    if (isNaN(portNum) || portNum < 1 || portNum > 65535) {
      feErrors.port = `Cổng Port [${port || ''}] không hợp lệ (1 - 65535)!`;
    }
    const memNum = parseInt(maxMemory, 10);
    if (isNaN(memNum) || memNum < 64) {
      feErrors.maxMemory = 'Giới hạn RAM phải tối thiểu từ 64MB trở lên!';
    }

    if (Object.keys(feErrors).length > 0) {
      setFieldErrors(feErrors);
      return;
    }

    setFieldErrors({});

    const payload = {
      appId: appId.trim(),
      port: portNum || 3001,
      rmsMode,
      maxMemoryMb: memNum || 512,
      autoRestart,
      autoStart
    };

    if (password) {
      payload.password = password;
    }

    try {
      const data = await window.ApiClient.saveConfig(payload);
      if (data.success) {
        onSaved(password);
      } else {
        if (data.errors && typeof data.errors === 'object') {
          setFieldErrors(data.errors);
        } else {
          setFieldErrors({ appId: data.message || 'Lỗi lưu cấu hình' });
        }
      }
    } catch (err) {
      setFieldErrors({ appId: 'Lỗi hệ thống: ' + err.message });
    }
  };

  // Save Rental Allocation Rules
  const handleSaveRentalRules = async () => {
    setRentalSaveSuccess('');
    try {
      if (window.rentalService && allocationRules) {
        await window.rentalService.updateAdminAllocations(allocationRules);
        setRentalSaveSuccess('Đã lưu cấu hình phân bổ và bảng giá bot thành công!');
        setTimeout(() => setRentalSaveSuccess(''), 3000);
      }
    } catch (err) {
      alert(err.message || 'Lỗi khi lưu cấu hình phân bổ!');
    }
  };

  // Edit Voucher
  const handleStartEditVoucher = (v) => {
    setEditingVoucherCode(v.code);
    setNewVoucherCode(v.code);
    const isPct = (v.discountPercent > 0) || (!v.discountAmount);
    setNewVoucherDiscountType(isPct ? 'PERCENT' : 'FIXED');
    setNewVoucherValue(isPct ? v.discountPercent : v.discountAmount);
    setNewVoucherMaxDiscount(v.maxDiscountAmount || 0);
    setNewVoucherMaxUsesPerUser(v.maxUsesPerUser || 1);
    setNewVoucherMaxUses(v.maxUses || 100);
  };

  const handleCancelEditVoucher = () => {
    setEditingVoucherCode(null);
    setNewVoucherCode('');
    setNewVoucherDiscountType('PERCENT');
    setNewVoucherValue(15);
    setNewVoucherMaxDiscount(0);
    setNewVoucherMaxUsesPerUser(1);
    setNewVoucherMaxUses(100);
  };

  // Create or Update Voucher
  const handleSaveVoucher = async () => {
    if (!newVoucherCode.trim()) return;
    try {
      if (window.rentalService) {
        const isPercent = newVoucherDiscountType === 'PERCENT';
        const numVal = parseInt(newVoucherValue, 10) || 0;
        const maxDisc = isPercent ? (parseInt(newVoucherMaxDiscount, 10) || 0) : 0;
        const payload = {
          code: newVoucherCode.trim().toUpperCase(),
          discountPercent: isPercent ? numVal : 0,
          discountAmount: !isPercent ? numVal : 0,
          maxDiscountAmount: maxDisc,
          maxUses: parseInt(newVoucherMaxUses, 10) || 100,
          maxUsesPerUser: parseInt(newVoucherMaxUsesPerUser, 10) || 1
        };

        if (editingVoucherCode) {
          const res = await window.rentalService.updateVoucher(editingVoucherCode, payload);
          if (res && res.data) {
            setVouchers(prev => prev.map(v => v.code === editingVoucherCode ? res.data : v));
            handleCancelEditVoucher();
          }
        } else {
          const res = await window.rentalService.createVoucher(payload);
          if (res && res.data) {
            setVouchers(prev => [res.data, ...prev]);
            handleCancelEditVoucher();
          }
        }
      }
    } catch (err) {
      alert(err.message || 'Lỗi khi lưu voucher!');
    }
  };

  // Delete Voucher
  const handleDeleteVoucher = async (code) => {
    if (!confirm(`Bạn có chắc chắn muốn xóa mã voucher [${code}]?`)) return;
    try {
      if (window.rentalService) {
        await window.rentalService.deleteVoucher(code);
        setVouchers(prev => prev.filter(v => v.code !== code));
      }
    } catch (err) {
      alert(err.message || 'Lỗi khi xóa voucher!');
    }
  };

  const handleAddDurationDiscount = () => {
    const m = parseInt(newMonthNumber, 10);
    const d = parseInt(newMonthDiscount, 10);
    if (!m || m <= 0) return;
    setAllocationRules(prev => ({
      ...prev,
      durationDiscounts: {
        ...(prev.durationDiscounts || {}),
        [m]: isNaN(d) ? 0 : d
      }
    }));
  };

  const handleDeleteDurationDiscount = (monthKey) => {
    setAllocationRules(prev => {
      const next = { ...(prev.durationDiscounts || {}) };
      delete next[monthKey];
      return { ...prev, durationDiscounts: next };
    });
  };

  const handleAddBonusTier = () => {
    const min = parseInt(newBonusMinAmount, 10);
    const pct = parseInt(newBonusPercent, 10);
    if (!min || min <= 0 || !pct || pct <= 0) return;
    setAllocationRules(prev => {
      const current = prev.topupBonusTiers || [];
      const updated = current.filter(t => t.minAmount !== min);
      updated.push({
        minAmount: min,
        bonusPercent: pct,
        desc: `Nạp từ ${formatMoney(min)}đ tặng ${pct}%`
      });
      updated.sort((a, b) => a.minAmount - b.minAmount);
      return { ...prev, topupBonusTiers: updated };
    });
  };

  const handleDeleteBonusTier = (minAmount) => {
    setAllocationRules(prev => ({
      ...prev,
      topupBonusTiers: (prev.topupBonusTiers || []).filter(t => t.minAmount !== minAmount)
    }));
  };

  const handleAddTopupPreset = () => {
    const val = parseInt(newPresetAmount, 10);
    if (!val || val < 1000) return;
    const current = allocationRules?.topupPresets || [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000];
    if (current.includes(val)) return;
    const updated = [...current, val].sort((a, b) => a - b);
    setAllocationRules(prev => ({ ...prev, topupPresets: updated }));
  };

  const handleDeleteTopupPreset = (amountToDelete) => {
    const current = allocationRules?.topupPresets || [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000];
    const updated = current.filter(a => a !== amountToDelete);
    setAllocationRules(prev => ({ ...prev, topupPresets: updated }));
  };

  const handleMinTopupChange = (minVal) => {
    const val = parseInt(minVal, 10);
    setAllocationRules(prev => ({ ...prev, minTopupAmount: val || 10000 }));
  };

  return (
    <window.ModalBase
      title="Cài Đặt Hệ Thống & Phân Bổ Bot"
      subtitle="Quản trị cấu hình server, bộ nhớ, bảng giá thuê và voucher"
      icon="settings"
      iconColor="var(--apple-blue)"
      size="lg"
      onClose={onClose}
      footer={
        <>
          <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
          {activeTab === 'system' ? (
            <button type="button" className="btn btn-primary" onClick={handleSubmitSystem}>
              <window.Icon name="check" size={14} /> Lưu Cài Đặt Hệ Thống
            </button>
          ) : (
            <button type="button" className="btn btn-primary" onClick={handleSaveRentalRules}>
              <window.Icon name="check" size={14} /> Lưu Cấu Hình Phân Bổ
            </button>
          )}
        </>
      }
    >
      {/* Top Segmented Tab Switcher */}
      <div style={{ display: 'flex', gap: '8px', marginBottom: '16px', borderBottom: '1px solid var(--glass-border-subtle)', paddingBottom: '12px' }}>
        <button
          type="button"
          className={`btn btn-sm ${activeTab === 'system' ? 'btn-primary' : 'btn-secondary'}`}
          onClick={() => setActiveTab('system')}
        >
          <window.Icon name="server" size={14} /> Cài Đặt Hệ Thống
        </button>
        <button
          type="button"
          className={`btn btn-sm ${activeTab === 'rental' ? 'btn-primary' : 'btn-secondary'}`}
          onClick={() => setActiveTab('rental')}
        >
          <window.Icon name="coins" size={14} /> Cấu Hình Phân Bổ & Thuê Bot
        </button>
      </div>

      {/* TAB 1: SYSTEM SETTINGS */}
      {activeTab === 'system' && (
        <form onSubmit={handleSubmitSystem} className="modal-form-stack">
          {/* Theme Selector */}
          <div className="form-group farm-section-card" style={{ marginBottom: 0 }}>
            <label style={{ marginBottom: '8px', display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="sun" size={14} color="var(--apple-blue)" />
              <span>Chế Độ Giao Diện (Theme):</span>
            </label>
            <div className="segmented-control" style={{ width: '100%' }}>
              <button
                type="button"
                className={`btn ${selectedTheme === 'dark' ? 'active btn-primary' : ''}`}
                onClick={() => handleThemeChange('dark')}
              >
                <window.Icon name="moon" size={14} /> Chế Độ Tối (Dark)
              </button>
              <button
                type="button"
                className={`btn ${selectedTheme === 'light' ? 'active btn-primary' : ''}`}
                onClick={() => handleThemeChange('light')}
              >
                <window.Icon name="sun" size={14} /> Chế Độ Sáng (Light)
              </button>
            </div>
          </div>

          <div className="form-row">
            <div className="form-group">
              <label>Tên Hồ Sơ / App ID (Lưu RMS):</label>
              <input
                type="text"
                className={`form-control ${fieldErrors.appId ? 'input-error' : ''}`}
                value={appId}
                onChange={e => {
                  setAppId(e.target.value);
                  clearFieldError('appId');
                }}
              />
              {fieldErrors.appId && (
                <div className="field-error-msg">
                  <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                  <span>{fieldErrors.appId}</span>
                </div>
              )}
            </div>
            <div className="form-group">
              <label>Cổng Port Web Dashboard:</label>
              <input
                type="number"
                className={`form-control ${fieldErrors.port ? 'input-error' : ''}`}
                value={port}
                onChange={e => {
                  setPort(e.target.value);
                  clearFieldError('port');
                }}
                min="1"
                max="65535"
                placeholder="3001"
              />
              {fieldErrors.port && (
                <div className="field-error-msg">
                  <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                  <span>{fieldErrors.port}</span>
                </div>
              )}
            </div>
          </div>

          <div className="form-row">
            <div className="form-group">
              <label>Chế độ lưu RMS:</label>
              <select className="form-control" value={rmsMode} onChange={e => setRmsMode(e.target.value)}>
                <option value="file">Lưu vào File (Khuyên dùng để giữ nick)</option>
                <option value="memory">Lưu vào RAM (Xóa khi tắt bot)</option>
              </select>
            </div>
            <div className="form-group">
              <label>Giới hạn RAM (MB):</label>
              <input
                type="number"
                className={`form-control ${fieldErrors.maxMemory ? 'input-error' : ''}`}
                value={maxMemory}
                onChange={e => {
                  setMaxMemory(e.target.value);
                  clearFieldError('maxMemory');
                }}
                min="64"
                max="8192"
              />
              {fieldErrors.maxMemory && (
                <div className="field-error-msg">
                  <window.Icon name="alert-circle" size={13} color="var(--apple-red)" />
                  <span>{fieldErrors.maxMemory}</span>
                </div>
              )}
            </div>
          </div>

          <div className="form-row">
            <div className="checkbox-group" style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
              <input
                type="checkbox"
                id="modalAutoRestart"
                checked={autoRestart}
                onChange={e => setAutoRestart(e.target.checked)}
              />
              <label htmlFor="modalAutoRestart" style={{ fontSize: '0.82rem', margin: 0 }}>Tự khởi động lại khi bot bị crash</label>
            </div>
            <div className="checkbox-group" style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
              <input
                type="checkbox"
                id="modalAutoStart"
                checked={autoStart}
                onChange={e => setAutoStart(e.target.checked)}
              />
              <label htmlFor="modalAutoStart" style={{ fontSize: '0.82rem', margin: 0 }}>Tự khôi phục treo bot khi khởi động web</label>
            </div>
          </div>

          <hr className="divider" style={{ borderColor: 'var(--glass-border-subtle)', margin: '2px 0' }} />
          <div className="form-group">
            <label style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
              <window.Icon name="shield" size={14} color="var(--apple-blue)" />
              <span>Mật khẩu đăng nhập Web (Để trống nếu không đặt mật khẩu):</span>
            </label>
            <input
              type="password"
              className={`form-control ${fieldErrors.password ? 'input-error' : ''}`}
              placeholder="Nhập mật khẩu mới bảo vệ web"
              value={password}
              onChange={e => {
                setPassword(e.target.value);
                clearFieldError('password');
              }}
            />
          </div>
        </form>
      )}

      {/* TAB 2: RENTAL ALLOCATION & PRICING CONFIGURATION */}
      {activeTab === 'rental' && (
        <div className="modal-form-stack">
          {rentalSaveSuccess && (
            <div style={{ padding: '10px 14px', borderRadius: 'var(--radius-sm)', background: 'rgba(48, 209, 88, 0.15)', color: 'var(--apple-green)', fontWeight: 600, fontSize: '0.84rem' }}>
              {rentalSaveSuccess}
            </div>
          )}

          {allocationRules && (
            <>
              {/* 1. Plans & Pricing per Month */}
              <div className="farm-section-card">
                <span className="sidebar-section-lbl" style={{ marginBottom: '8px' }}>BẢNG GIÁ VÀ FILE PHÂN BỔ MẶC ĐỊNH</span>
                <div style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
                  {Object.entries(allocationRules.plans || {}).map(([key, plan]) => (
                    <div key={key} style={{ display: 'grid', gridTemplateColumns: '1.2fr 1fr 1fr', gap: '10px', alignItems: 'center', background: 'var(--glass-matrix-bg)', padding: '10px 12px', borderRadius: 'var(--radius-sm)' }}>
                      <div>
                        <strong style={{ fontSize: '0.86rem', color: 'var(--text-primary)' }}>{plan.name} ({key})</strong>
                      </div>
                      <div>
                        <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Giá / Tháng (VNĐ):</label>
                        <input
                          type="number"
                          className="form-control"
                          value={plan.priceMonth}
                          onChange={(e) => {
                            const val = parseInt(e.target.value, 10) || 0;
                            setAllocationRules(prev => ({
                              ...prev,
                              plans: {
                                ...prev.plans,
                                [key]: { ...prev.plans[key], priceMonth: val }
                              }
                            }));
                          }}
                        />
                      </div>
                      <div>
                        <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>File Bot Ưu Tiên:</label>
                        <select
                          className="form-control"
                          value={plan.defaultFileId || 'file_1'}
                          onChange={(e) => {
                            const val = e.target.value;
                            setAllocationRules(prev => ({
                              ...prev,
                              plans: {
                                ...prev.plans,
                                [key]: { ...prev.plans[key], defaultFileId: val }
                              }
                            }));
                          }}
                        >
                          {availableFiles.map(f => (
                            <option key={f.id} value={f.id}>{f.name} ({f.modType})</option>
                          ))}
                        </select>
                      </div>
                    </div>
                  ))}
                </div>
              </div>

              {/* 2. Duration Discounts (% Giảm giá theo số tháng thuê) */}
              <div className="farm-section-card" style={{ marginTop: '10px' }}>
                <span className="sidebar-section-lbl" style={{ marginBottom: '8px' }}>CHIẾT KHẤU THỜI HẠN THUÊ BOT (% GIẢM GIÁ THEO SỐ THÁNG)</span>
                <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr auto', gap: '8px', marginBottom: '10px', alignItems: 'flex-end' }}>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Số Tháng Thuê:</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newMonthNumber}
                      onChange={(e) => setNewMonthNumber(e.target.value)}
                      min="1"
                      max="36"
                    />
                  </div>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Mức Giảm Giá (%):</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newMonthDiscount}
                      onChange={(e) => setNewMonthDiscount(e.target.value)}
                      min="0"
                      max="100"
                    />
                  </div>
                  <button
                    type="button"
                    className="btn btn-primary btn-sm"
                    onClick={handleAddDurationDiscount}
                  >
                    + Thêm Kỳ Hạn
                  </button>
                </div>

                <div style={{ display: 'flex', gap: '8px', flexWrap: 'wrap' }}>
                  {Object.entries(allocationRules.durationDiscounts || {}).sort(([a], [b]) => Number(a) - Number(b)).map(([month, discount]) => (
                    <div
                      key={month}
                      style={{
                        padding: '6px 12px',
                        background: 'var(--glass-matrix-bg)',
                        borderRadius: 'var(--radius-sm)',
                        display: 'flex',
                        alignItems: 'center',
                        gap: '8px',
                        fontSize: '0.8rem',
                        border: '1px solid var(--glass-border-subtle)'
                      }}
                    >
                      <span><strong>{month} Tháng</strong>: Giảm <strong>{discount}%</strong></span>
                      <button
                        type="button"
                        style={{ background: 'none', border: 'none', color: 'var(--apple-red)', cursor: 'pointer', padding: 0 }}
                        onClick={() => handleDeleteDurationDiscount(month)}
                        title="Xóa kỳ hạn này"
                      >
                        <window.Icon name="x" size={12} />
                      </button>
                    </div>
                  ))}
                </div>
              </div>

              {/* 3. Top-Up Bonus Policies (% Thưởng nạp tiền) */}
              <div className="farm-section-card" style={{ marginTop: '10px' }}>
                <span className="sidebar-section-lbl" style={{ marginBottom: '8px' }}>CHÍNH SÁCH KHUYẾN MÃI NẠP TIỀN (% THƯỞNG VÍ)</span>
                <p style={{ fontSize: '0.75rem', color: 'var(--text-tertiary)', margin: '0 0 10px 0' }}>
                  Khi người dùng nạp tiền đạt hoặc vượt mốc, hệ thống sẽ tự động cộng thêm % khuyến mãi tương ứng vào ví.
                </p>
                <div style={{ display: 'grid', gridTemplateColumns: '1.4fr 1fr auto', gap: '8px', marginBottom: '10px', alignItems: 'flex-end' }}>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Mốc Nạp Tối Thiểu (VNĐ):</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newBonusMinAmount}
                      onChange={(e) => setNewBonusMinAmount(e.target.value)}
                      step="10000"
                    />
                  </div>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Thưởng Thêm (%):</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newBonusPercent}
                      onChange={(e) => setNewBonusPercent(e.target.value)}
                      min="1"
                      max="100"
                    />
                  </div>
                  <button
                    type="button"
                    className="btn btn-primary btn-sm"
                    onClick={handleAddBonusTier}
                  >
                    + Thêm Mốc Thưởng
                  </button>
                </div>

                <div style={{ display: 'flex', gap: '8px', flexWrap: 'wrap' }}>
                  {(allocationRules.topupBonusTiers || []).map(tier => (
                    <div
                      key={tier.minAmount}
                      style={{
                        padding: '6px 12px',
                        background: 'rgba(50, 215, 75, 0.08)',
                        borderRadius: 'var(--radius-sm)',
                        display: 'flex',
                        alignItems: 'center',
                        gap: '8px',
                        fontSize: '0.8rem',
                        border: '1px solid rgba(50, 215, 75, 0.25)',
                        color: 'var(--apple-green)'
                      }}
                    >
                      <span>Nạp ≥ <strong>{formatMoney(tier.minAmount)}đ</strong>: Tặng <strong>+{tier.bonusPercent}%</strong></span>
                      <button
                        type="button"
                        style={{ background: 'none', border: 'none', color: 'var(--apple-red)', cursor: 'pointer', padding: 0 }}
                        onClick={() => handleDeleteBonusTier(tier.minAmount)}
                        title="Xóa mốc thưởng này"
                      >
                        <window.Icon name="x" size={12} />
                      </button>
                    </div>
                  ))}
                </div>
              </div>

              {/* 4. Top-Up Presets & Minimum Limit (Mệnh Giá Nạp Tiền) */}
              <div className="farm-section-card admin-preset-card">
                <span className="sidebar-section-lbl admin-preset-header">CẤU HÌNH MỆNH GIÁ NẠP TIỀN & HẠN MỨC (TOP-UP PRESETS)</span>
                <p className="admin-preset-desc">
                  Danh sách mệnh giá tiền hiển thị sẵn để người dùng bấm chọn nhanh tại trang Nạp Tiền.
                </p>

                {/* Add new preset */}
                <div className="admin-preset-form-row">
                  <div>
                    <label className="admin-preset-lbl">Thêm Mệnh Giá Mới (VNĐ):</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newPresetAmount}
                      onChange={(e) => setNewPresetAmount(e.target.value)}
                      step="10000"
                      min="1000"
                      placeholder="VD: 50000"
                    />
                  </div>
                  <button
                    type="button"
                    className="btn btn-primary btn-sm"
                    onClick={handleAddTopupPreset}
                  >
                    + Thêm Mệnh Giá
                  </button>
                </div>

                {/* Current Presets Badges */}
                <div className="admin-preset-badge-wrap">
                  {(allocationRules.topupPresets || [10000, 20000, 50000, 100000, 200000, 500000, 1000000, 2000000]).map(amt => (
                    <div key={amt} className="admin-preset-badge">
                      <span><strong>{formatMoney(amt)} đ</strong></span>
                      <button
                        type="button"
                        className="admin-preset-delete-btn"
                        onClick={() => handleDeleteTopupPreset(amt)}
                        title="Xóa mệnh giá này"
                      >
                        <window.Icon name="x" size={12} />
                      </button>
                    </div>
                  ))}
                </div>

                {/* Minimum top-up limit */}
                <div className="admin-min-topup-row">
                  <div>
                    <label className="admin-preset-lbl">Số Tiền Nạp Tối Thiểu (VNĐ):</label>
                    <span className="sidebar-sub">Mức tiền tối thiểu cho phép mỗi giao dịch nạp qua payOS / VietQR</span>
                  </div>
                  <input
                    type="number"
                    className="form-control admin-min-topup-input"
                    value={allocationRules.minTopupAmount || 10000}
                    onChange={(e) => handleMinTopupChange(e.target.value)}
                    step="5000"
                    min="1000"
                  />
                </div>
              </div>

              {/* 5. Automated Payment Gateway: payOS (Configured via ENV) */}
              <div className="farm-section-card" style={{ marginTop: '10px' }}>
                <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: '8px' }}>
                  <span className="sidebar-section-lbl" style={{ margin: 0 }}>CỔNG THANH TOÁN TỰ ĐỘNG payOS (CẤU HÌNH QUA FILE .ENV)</span>
                  <a href="https://payos.vn" target="_blank" rel="noreferrer" style={{ fontSize: '0.75rem', color: 'var(--apple-blue)', textDecoration: 'none' }}>
                    Đăng ký miễn phí tại payos.vn ↗
                  </a>
                </div>
                <p style={{ fontSize: '0.75rem', color: 'var(--text-tertiary)', margin: '0 0 10px 0' }}>
                  Toàn bộ khóa bảo mật payOS được lưu trữ bảo mật trong file <code>.env</code> trên máy chủ, không lưu hoặc nhập trên giao diện web để đảm bảo an toàn.
                </p>

                <div style={{
                  padding: '12px 14px',
                  borderRadius: 'var(--radius-sm)',
                  background: 'var(--glass-matrix-bg)',
                  border: '1px solid var(--glass-border-subtle)',
                  display: 'flex',
                  flexDirection: 'column',
                  gap: '8px',
                  fontSize: '0.8rem'
                }}>
                  <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                    <span style={{ color: 'var(--text-secondary)' }}>Trạng thái cổng payOS:</span>
                    {payosEnv?.configuredInEnv && payosEnv?.enabled ? (
                      <span style={{ color: 'var(--apple-green)', fontWeight: 700, display: 'inline-flex', alignItems: 'center', gap: '4px' }}>
                        <span style={{ width: '8px', height: '8px', borderRadius: '50%', backgroundColor: 'var(--apple-green)' }} />
                        Đang Kích Hoạt Tự Động (24/7)
                      </span>
                    ) : payosEnv?.configuredInEnv && !payosEnv?.enabled ? (
                      <span style={{ color: 'var(--apple-gold)', fontWeight: 700 }}>
                        🟡 Đã có biến trong .env nhưng PAYOS_ENABLED=false
                      </span>
                    ) : (
                      <span style={{ color: 'var(--text-tertiary)', fontWeight: 600 }}>
                        ⚪ Chưa cấu hình trong .env (Dùng VietQR thường)
                      </span>
                    )}
                  </div>

                  {payosEnv?.configuredInEnv && (
                    <>
                      <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                        <span style={{ color: 'var(--text-secondary)' }}>Client ID:</span>
                        <code style={{ color: 'var(--apple-blue)' }}>{payosEnv.clientIdMasked || 'Chưa thiết lập'}</code>
                      </div>
                      <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                        <span style={{ color: 'var(--text-secondary)' }}>Ngân hàng nhận tiền:</span>
                        <strong>{payosEnv.bankName || 'MBBank'} - {payosEnv.bankAccount || 'Chưa thiết lập'}</strong>
                      </div>
                    </>
                  )}

                  <div style={{ borderTop: '1px solid var(--glass-border-subtle)', paddingTop: '8px', display: 'flex', alignItems: 'center', justifyContent: 'space-between' }}>
                    <span style={{ color: 'var(--text-secondary)' }}>Webhook URL (dán trên payos.vn):</span>
                    <code style={{ color: 'var(--apple-gold)', fontSize: '0.74rem' }}>
                      {window.location.origin}/api/billing/payos-webhook
                    </code>
                  </div>
                </div>

                <div style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)', marginTop: '8px' }}>
                  💡 <em>Để bật hoặc đổi tài khoản payOS: Mở file <code>.env</code> (hoặc <code>.env.production</code>) và cập nhật các biến <code>PAYOS_ENABLED=true</code>, <code>PAYOS_CLIENT_ID</code>, <code>PAYOS_API_KEY</code>, <code>PAYOS_CHECKSUM_KEY</code>.</em>
                </div>
              </div>

              {/* 5. Proxy & Server Allocation Strategy */}
              <div className="form-row">
                <div className="form-group">
                  <label>Chiến Lược Chia Proxy Khi Thuê:</label>
                  <select
                    className="form-control"
                    value={allocationRules.proxyStrategy || 'least_loaded'}
                    onChange={(e) => setAllocationRules(prev => ({ ...prev, proxyStrategy: e.target.value }))}
                  >
                    <option value="least_loaded">Tự động chọn proxy ít tài khoản nhất (Khuyên dùng)</option>
                    <option value="round_robin">Xoay vòng ngẫu nhiên qua các proxy</option>
                    <option value="none">Không gán proxy (Chạy IP mặc định)</option>
                  </select>
                </div>
                <div className="form-group">
                  <label>Cân Bằng Server / Thành Phố:</label>
                  <select
                    className="form-control"
                    value={allocationRules.serverBalanceStrategy || 'auto_balance'}
                    onChange={(e) => setAllocationRules(prev => ({ ...prev, serverBalanceStrategy: e.target.value }))}
                  >
                    <option value="auto_balance">Tự cân bằng giữa Hoàn Mỹ và Diệu Kỳ</option>
                    <option value="prefer_hoan_my">Ưu tiên Server 1 (Hoàn Mỹ)</option>
                    <option value="prefer_dieu_ky">Ưu tiên Server 2 (Diệu Kỳ)</option>
                  </select>
                </div>
              </div>

              {/* 3. Voucher Management */}
              <div className="farm-section-card voucher-admin-card">
                <div className="voucher-admin-title">
                  <span className="sidebar-section-lbl">QUẢN LÝ MÃ GIẢM GIÁ (VOUCHER)</span>
                  {editingVoucherCode && (
                    <span className="voucher-editing-badge">
                      (Đang sửa mã: <strong>{editingVoucherCode}</strong>)
                    </span>
                  )}
                </div>

                {/* Add/Edit Voucher Form */}
                <div className="voucher-form-grid">
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">Mã Code:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="VD: GIAM20K"
                      value={newVoucherCode}
                      onChange={(e) => setNewVoucherCode(e.target.value.toUpperCase())}
                      disabled={Boolean(editingVoucherCode)}
                    />
                  </div>
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">Hình Thức Giảm:</label>
                    <select
                      className="form-control"
                      value={newVoucherDiscountType}
                      onChange={(e) => {
                        const nextType = e.target.value;
                        setNewVoucherDiscountType(nextType);
                        if (nextType === 'PERCENT' && newVoucherValue > 100) {
                          setNewVoucherValue(15);
                        } else if (nextType === 'FIXED' && newVoucherValue <= 100) {
                          setNewVoucherValue(20000);
                        }
                      }}
                    >
                      <option value="PERCENT">Theo phần trăm (%)</option>
                      <option value="FIXED">Số tiền thực tế (VNĐ)</option>
                    </select>
                  </div>
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">
                      {newVoucherDiscountType === 'PERCENT' ? 'Mức Giảm (%):' : 'Số Tiền Giảm (đ):'}
                    </label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherValue}
                      onChange={(e) => setNewVoucherValue(e.target.value)}
                      min="1"
                      max={newVoucherDiscountType === 'PERCENT' ? "100" : undefined}
                      placeholder={newVoucherDiscountType === 'PERCENT' ? "15" : "20000"}
                    />
                  </div>
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">
                      {newVoucherDiscountType === 'PERCENT' ? 'Giảm Tối Đa (VNĐ):' : 'Giảm Tối Đa:'}
                    </label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherDiscountType === 'PERCENT' ? (newVoucherMaxDiscount || '') : ''}
                      onChange={(e) => setNewVoucherMaxDiscount(e.target.value)}
                      min="0"
                      step="5000"
                      disabled={newVoucherDiscountType === 'FIXED'}
                      placeholder={newVoucherDiscountType === 'PERCENT' ? "0 = Không giới hạn" : "Không áp dụng"}
                    />
                  </div>
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">Lượt / Mỗi Tài Khoản:</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherMaxUsesPerUser}
                      onChange={(e) => setNewVoucherMaxUsesPerUser(e.target.value)}
                      min="1"
                      placeholder="1"
                    />
                  </div>
                  <div className="voucher-field-group">
                    <label className="voucher-field-label">Tổng Lượt Toàn HT:</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherMaxUses}
                      onChange={(e) => setNewVoucherMaxUses(e.target.value)}
                      min="1"
                      placeholder="100"
                    />
                  </div>
                  <div className="voucher-btn-group">
                    <button
                      type="button"
                      className={`btn btn-sm ${editingVoucherCode ? 'btn-warning' : 'btn-primary'} voucher-create-btn`}
                      onClick={handleSaveVoucher}
                      disabled={!newVoucherCode.trim()}
                    >
                      {editingVoucherCode ? 'Lưu' : '+ Tạo'}
                    </button>
                    {editingVoucherCode && (
                      <button
                        type="button"
                        className="btn btn-secondary btn-sm voucher-create-btn"
                        onClick={handleCancelEditVoucher}
                      >
                        Hủy
                      </button>
                    )}
                  </div>
                </div>

                {/* Voucher List Table */}
                <div className="voucher-table-wrapper">
                  <table className="voucher-table">
                    <thead>
                      <tr className="voucher-table-head-row">
                        <th className="voucher-th">Mã Code</th>
                        <th className="voucher-th">Mức Giảm</th>
                        <th className="voucher-th">Mỗi Tài Khoản</th>
                        <th className="voucher-th">Đã Dùng / Tối Đa</th>
                        <th className="voucher-th">Hành Động</th>
                      </tr>
                    </thead>
                    <tbody>
                      {vouchers.map(v => (
                        <tr
                          key={v.id || v.code}
                          className={`voucher-table-row ${editingVoucherCode === v.code ? 'is-editing' : ''}`}
                        >
                          <td className="voucher-td">
                            <span className="voucher-code-badge">{v.code}</span>
                          </td>
                          <td className="voucher-td">
                            <span className="voucher-discount-tag">
                              {v.discountPercent > 0 ? `${v.discountPercent}%` : `${formatMoney(v.discountAmount)} đ`}
                            </span>
                            {v.discountPercent > 0 && v.maxDiscountAmount > 0 && (
                              <span className="voucher-max-discount-sub">
                                (Tối đa {formatMoney(v.maxDiscountAmount)} đ)
                              </span>
                            )}
                          </td>
                          <td className="voucher-td voucher-per-user-tag">
                            {v.maxUsesPerUser || 1} lần / acc
                          </td>
                          <td className="voucher-td voucher-usage-tag">
                            {v.usedCount || 0} / {v.maxUses || 100}
                          </td>
                          <td className="voucher-td">
                            <div className="voucher-actions-cell">
                              <button
                                type="button"
                                className="btn btn-xs voucher-edit-btn"
                                onClick={() => handleStartEditVoucher(v)}
                                title="Chỉnh sửa mã voucher này"
                              >
                                Sửa
                              </button>
                              <button
                                type="button"
                                className="btn btn-xs btn-danger"
                                onClick={() => handleDeleteVoucher(v.code)}
                                title="Xóa mã voucher này"
                              >
                                Xóa
                              </button>
                            </div>
                          </td>
                        </tr>
                      ))}
                    </tbody>
                  </table>
                </div>
              </div>
            </>
          )}
        </div>
      )}
    </window.ModalBase>
  );
};
