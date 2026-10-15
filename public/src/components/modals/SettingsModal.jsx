/**
 * SettingsModal Component (Presentation Layer / Modals)
 * Porsche & Apple Precision System & Rental Configuration
 * - Tab 1: Hệ Thống (RAM, Port, Theme, Password)
 * - Tab 2: Cấu Hình Thuê Bot (Bảng giá, File đích, Chiến lược chia proxy, Voucher)
 */
const { useState: useSettingsModalState, useEffect: useSettingsModalEffect } = React;

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
  const [newVoucherPercent, setNewVoucherPercent] = useSettingsModalState(15);
  const [newVoucherMaxUses, setNewVoucherMaxUses] = useSettingsModalState(100);
  const [rentalSaveSuccess, setRentalSaveSuccess] = useSettingsModalState('');

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

  // Create Voucher
  const handleCreateVoucher = async () => {
    if (!newVoucherCode.trim()) return;
    try {
      if (window.rentalService) {
        const res = await window.rentalService.createVoucher({
          code: newVoucherCode.trim().toUpperCase(),
          discountPercent: parseInt(newVoucherPercent, 10) || 0,
          maxUses: parseInt(newVoucherMaxUses, 10) || 100
        });
        if (res && res.data) {
          setVouchers(prev => [res.data, ...prev]);
          setNewVoucherCode('');
        }
      }
    } catch (err) {
      alert(err.message || 'Lỗi khi tạo voucher!');
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

              {/* 2. Proxy & Server Allocation Strategy */}
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
              <div className="farm-section-card" style={{ marginTop: '10px' }}>
                <span className="sidebar-section-lbl" style={{ marginBottom: '8px' }}>QUẢN LÝ MÃ GIẢM GIÁ (VOUCHER)</span>

                {/* Add Voucher Form */}
                <div style={{ display: 'grid', gridTemplateColumns: '1.2fr 1fr 1fr auto', gap: '8px', marginBottom: '12px', alignItems: 'flex-end' }}>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Mã Code:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="VD: GIAM20"
                      value={newVoucherCode}
                      onChange={(e) => setNewVoucherCode(e.target.value.toUpperCase())}
                    />
                  </div>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Giảm Giá (%):</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherPercent}
                      onChange={(e) => setNewVoucherPercent(e.target.value)}
                      min="1"
                      max="100"
                    />
                  </div>
                  <div>
                    <label style={{ fontSize: '0.72rem', color: 'var(--text-tertiary)' }}>Lượt Dùng Tối Đa:</label>
                    <input
                      type="number"
                      className="form-control"
                      value={newVoucherMaxUses}
                      onChange={(e) => setNewVoucherMaxUses(e.target.value)}
                      min="1"
                    />
                  </div>
                  <button
                    type="button"
                    className="btn btn-primary btn-sm"
                    onClick={handleCreateVoucher}
                    disabled={!newVoucherCode.trim()}
                  >
                    + Tạo Mã
                  </button>
                </div>

                {/* Voucher List Table */}
                <div style={{ maxHeight: '160px', overflowY: 'auto' }}>
                  <table style={{ width: '100%', borderCollapse: 'collapse', fontSize: '0.78rem' }}>
                    <thead>
                      <tr style={{ borderBottom: '1px solid var(--glass-border-subtle)', color: 'var(--text-tertiary)', textAlign: 'left' }}>
                        <th style={{ padding: '6px' }}>Mã Code</th>
                        <th style={{ padding: '6px' }}>Giảm (%)</th>
                        <th style={{ padding: '6px' }}>Đã Dùng</th>
                        <th style={{ padding: '6px' }}>Hành Động</th>
                      </tr>
                    </thead>
                    <tbody>
                      {vouchers.map(v => (
                        <tr key={v.id || v.code} style={{ borderBottom: '1px solid var(--glass-border-subtle)' }}>
                          <td style={{ padding: '6px', fontWeight: 700, color: 'var(--apple-blue)' }}>{v.code}</td>
                          <td style={{ padding: '6px' }}>{v.discountPercent > 0 ? `${v.discountPercent}%` : `${v.discountAmount}đ`}</td>
                          <td style={{ padding: '6px' }}>{v.usedCount} / {v.maxUses}</td>
                          <td style={{ padding: '6px' }}>
                            <button
                              type="button"
                              className="btn btn-xs btn-danger"
                              onClick={() => handleDeleteVoucher(v.code)}
                            >
                              Xóa
                            </button>
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
