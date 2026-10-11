/**
 * RmsInspectorModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass RMS Audit & Diagnostic Engine
 * Tuân thủ OpenDesign System & Clean Architecture:
 * - TUYỆT ĐỐI KHÔNG DÙNG EMOJI ICONS: Toàn bộ icon dùng <window.Icon name="..." /> SVG chuẩn
 * - Dùng window.ModalBase căn giữa màn hình chuẩn, không bị bóp méo nút X
 * - Popup thông báo kết quả dùng window.showAlert (Custom Dialog của hệ thống)
 * - Tự động nạp lại RMS gốc của tài khoản khi ĐÓNG hoặc THOÁT box
 * - Gộp các nút test thành nhóm lựa chọn số vòng linh hoạt (1, 3, 5, 10 vòng)
 * - Tối ưu hóa UI/UX: Hiển thị dạng Card dễ đọc trên điện thoại (không bị chữ bé xíu)
 * - Lược bỏ nút Quét Lại, nút Đóng ở footer, và bỏ rms-test-banner
 */
window.RmsInspectorModal = function RmsInspectorModal({
  isOpen,
  onClose,
  account
}) {
  if (!isOpen || !account) return null;

  const [loading, setLoading] = React.useState(true);
  const [audit, setAudit] = React.useState(null);
  const [error, setError] = React.useState(null);
  const [actionLoading, setActionLoading] = React.useState(false);
  const [copySuccess, setCopySuccess] = React.useState(false);
  const [activeCategory, setActiveCategory] = React.useState('all');
  const [testRounds, setTestRounds] = React.useState(5);

  // Quản lý chế độ Test Ngẫu Nhiên
  const [testMode, setTestMode] = React.useState(false);
  const [testData, setTestData] = React.useState(null);

  const accountId = account?.id;

  // 1. Quét đối chiếu Cài Đặt Gốc từ Web với RMS Game
  const fetchAuditData = React.useCallback(async () => {
    if (!accountId) return;
    setLoading(true);
    setError(null);
    setTestMode(false);
    setTestData(null);
    try {
      const auditRes = await fetch(`/api/accounts/audit-rms?id=${accountId}`);
      const auditJson = await auditRes.json();

      if (!auditRes.ok || !auditJson.success) {
        throw new Error(auditJson.message || 'Không thể kiểm tra file RMS');
      }

      setAudit(auditJson);
    } catch (err) {
      setError(err.message);
    } finally {
      setLoading(false);
    }
  }, [accountId]);

  // Quét 1 lần duy nhất khi mở Modal
  React.useEffect(() => {
    if (isOpen && accountId) {
      fetchAuditData();
      setCopySuccess(false);
    }
  }, [isOpen, accountId, fetchAuditData]);

  // 2. Chạy Random Test (gộp lựa chọn số vòng)
  const handleRandomTest = async (roundsToRun = testRounds) => {
    try {
      setActionLoading(true);
      const res = await fetch('/api/accounts/random-test-rms', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ id: accountId, rounds: roundsToRun })
      });
      const data = await res.json();
      if (!res.ok || !data.success) {
        throw new Error(data.message || 'Lỗi khi chạy Random Test');
      }

      setTestData(data);
      setTestMode(true);

      // Hiển thị Popup custom của hệ thống ra ngoài màn hình
      if (typeof window.showAlert === 'function') {
        window.showAlert(
          data.message,
          data.isSynced ? 'Kiểm Thử RMS Thành Công' : 'Phát Hiện Lỗi RMS',
          data.isSynced ? 'success' : 'error'
        );
      }
    } catch (err) {
      if (typeof window.showAlert === 'function') {
        window.showAlert('Lỗi: ' + err.message, 'Lỗi Kiểm Thử', 'error');
      }
    } finally {
      setActionLoading(false);
    }
  };

  // 3. Khôi phục và Nạp lại RMS Gốc từ Cài đặt Web thật
  const handleRestoreOriginal = async () => {
    try {
      setActionLoading(true);
      const res = await fetch('/api/accounts/restore-original-rms', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ id: accountId })
      });
      const data = await res.json();
      if (!res.ok || !data.success) {
        throw new Error(data.message || 'Lỗi khi khôi phục RMS gốc');
      }

      setTestMode(false);
      setTestData(null);
      setAudit(data);

      if (typeof window.showAlert === 'function') {
        window.showAlert(
          data.message || 'Đã nạp lại thành công RMS gốc từ Cài Đặt Web!',
          'Khôi Phục Cài Đặt Gốc',
          'success'
        );
      }
    } catch (err) {
      if (typeof window.showAlert === 'function') {
        window.showAlert('Lỗi: ' + err.message, 'Lỗi Khôi Phục', 'error');
      }
    } finally {
      setActionLoading(false);
    }
  };

  // 4. Thoát an toàn: Nếu đang ở chế độ Test thì tự động nạp lại RMS gốc trước khi đóng
  const handleSafeClose = async () => {
    if (testMode) {
      try {
        await fetch('/api/accounts/restore-original-rms', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ id: accountId })
        });
      } catch (err) {
        console.error('Lỗi tự động khôi phục RMS gốc khi đóng modal:', err);
      }
    }
    onClose();
  };

  // 5. Sao chép báo cáo chi tiết cho AI
  const handleCopyReport = () => {
    const currentReport = testMode ? testData : audit;
    if (!currentReport) return;

    const reportText = [
      `=== BÁO CÁO KIỂM TRA RMS GAME (CHO AI) ===`,
      `Chế độ: ${testMode ? `TEST NGẪU NHIÊN (${testData?.roundsTested || 1} VÒNG)` : 'CÀI ĐẶT THẬT HIỆN TẠI'}`,
      `Tài khoản: ${account?.username} (ID: ${account?.id})`,
      `Server: ${account?.serverId === 0 ? 'Hoàn Mỹ (0)' : 'Diệu Kỳ (1)'}`,
      `Trạng thái: ${currentReport.isSynced ? 'KHỚP TUYỆT ĐỐI 100% (KHÔNG LỖI)' : `CÓ ${currentReport.mismatchCount} LỖI LỆCH / NGƯỢC DỮ LIỆU`}`,
      ``,
      `--- DANH SÁCH LỆCH DỮ LIỆU (MISMATCHES) ---`,
      ...(currentReport.mismatches && currentReport.mismatches.length > 0
        ? currentReport.mismatches.map((m, idx) =>
            `${idx + 1}. [${m.category.toUpperCase()}] ${m.label} (${m.field}): Web='${m.webValue}' vs Game RMS='${m.rmsValue}' -> [${m.statusText || m.status}]: ${m.message}`
          )
        : ['(Không có lỗi nào - Tất cả các trường đã khớp hoàn toàn)']
      ),
      ``,
      `--- DỮ LIỆU GIẢI MÃ NHỊ PHÂN TỪ RECORDSTORE (.RS) ---`,
      JSON.stringify(currentReport.decoded, null, 2)
    ].join('\n');

    navigator.clipboard.writeText(reportText).then(() => {
      setCopySuccess(true);
      if (typeof window.showAlert === 'function') {
        window.showAlert('Đã sao chép báo cáo chi tiết vào Clipboard! Bạn có thể dán vào khung chat với AI.', 'Đã Sao Chép', 'success');
      }
      setTimeout(() => setCopySuccess(false), 3000);
    }).catch(() => {
      if (typeof window.showAlert === 'function') {
        window.showAlert('Không thể copy tự động, vui lòng thử lại', 'Lỗi', 'error');
      }
    });
  };

  // Lựa chọn nguồn dữ liệu tùy theo đang xem Thật hay đang Test Ngẫu Nhiên
  const activeReport = testMode ? testData : audit;
  const isAllSynced = activeReport?.isSynced;
  const mismatchList = activeReport?.mismatches || [];
  const decoded = activeReport?.decoded || {};

  const webValuesSource = React.useMemo(() => {
    if (testMode && testData?.randomValues) {
      return testData.randomValues;
    }
    return {
      farm: account.farmSettings || {},
      diamond: account.diamondSettings || {},
      sellOre: account.sellOreSettings || {},
      fish: account.fishSettings || {}
    };
  }, [testMode, testData, account]);

  // Gom nhóm danh sách trường dữ liệu để so sánh hiển thị
  const allFieldRows = React.useMemo(() => {
    if (!activeReport) return [];
    const rows = [];
    const mismatchesMap = new Map();
    mismatchList.forEach(m => {
      mismatchesMap.set(`${m.category}_${m.field}`, m);
    });

    const addRow = (category, field, label, webVal, rmsVal) => {
      const isMismatch = mismatchesMap.has(`${category}_${field}`);
      rows.push({
        category,
        field,
        label,
        webVal: String(webVal ?? ''),
        rmsVal: String(rmsVal ?? ''),
        isMismatch,
        mismatchInfo: mismatchesMap.get(`${category}_${field}`)
      });
    };

    // 1. Farm
    const wf = webValuesSource.farm || {};
    const rf = decoded.farm || {};
    addRow('farm', 'mode', 'Cơ chế Farm', wf.mode === 1 ? 'Chăm sóc đầy đủ (1)' : 'Lái buôn hỗ trợ (0)', rf.mode === 1 ? 'Chăm sóc đầy đủ (1)' : 'Lái buôn hỗ trợ (0)');
    addRow('farm', 'backupDishes', 'Món ăn phụ', wf.backupDishes, rf.backupDishes);
    addRow('farm', 'backupSeeds', 'Cây dự bị', wf.backupSeeds, rf.backupSeeds);
    addRow('farm', 'replaceSeedThreshold', 'Ngưỡng mua hạt', wf.replaceSeedThreshold, rf.replaceSeedThreshold);
    addRow('farm', 'fish', 'Nuôi cá', wf.fish, rf.fish);
    addRow('farm', 'animal', 'Nuôi gia súc', wf.animal, rf.animal);
    addRow('farm', 'sellProducts', 'Tự bán nông sản', wf.sellProducts, rf.sellProducts);
    addRow('farm', 'sellThreshold', 'Ngưỡng bán NS', wf.sellThreshold, rf.sellThreshold);
    addRow('farm', 'sellQuantity', 'SL bán mỗi lần', wf.sellQuantity, rf.sellQuantity);
    addRow('farm', 'maxStarfruitLevel', 'Cấp khế tối đa', wf.maxStarfruitLevel, rf.maxStarfruitLevel);
    addRow('farm', 'dailyAttendance', 'Điểm danh hàng ngày', wf.dailyAttendance !== false, rf.dailyAttendance);
    addRow('farm', 'upgradeStarfruit', 'Nâng cấp cây khế', Boolean(wf.upgradeStarfruit), rf.upgradeStarfruit);
    addRow('farm', 'harvestHearts', 'Thu hoạch tim', wf.harvestHearts !== false, rf.harvestHearts);

    // 2. Kim Cương
    const wd = webValuesSource.diamond || {};
    const rd = decoded.diamond || {};
    addRow('diamond', 'sellOreOnFull', 'Bán đá đầy rương', wd.sellOreOnFull !== false, rd.sellOreOnFull);
    addRow('diamond', 'autoFarm', 'Tự về chăm Farm', wd.autoFarm !== false, rd.autoFarm);
    addRow('diamond', 'farmIntervalMinutes', 'Thời gian về farm (phút)', wd.farmIntervalMinutes || 60, rd.farmIntervalMinutes);
    addRow('diamond', 'harvestOnTime', 'Thu hoạch đúng giờ', wd.harvestOnTime !== false, rd.harvestOnTime);
    addRow('diamond', 'priorityOrder', 'Thứ tự ưu tiên', wd.priorityOrder !== undefined ? wd.priorityOrder : 6, rd.priorityOrder);
    addRow('diamond', 'autoDropKcx', 'Tự bỏ KCX', Boolean(wd.autoDropKcx), rd.autoDropKcx);
    addRow('diamond', 'autoDropNhb', 'Tự bỏ NHB', Boolean(wd.autoDropNhb), rd.autoDropNhb);

    // 3. Bán Đá
    const ws = webValuesSource.sellOre || {};
    const rs = decoded.sellOre || {};
    addRow('sellOre', 'sellIntervalMinutes', 'Giãn cách bán (phút)', ws.sellIntervalMinutes || 15, rs.sellIntervalMinutes);
    addRow('sellOre', 'delayMs', 'Quãng nghỉ delay (ms)', ws.delayMs || 100, rs.delayMs);
    addRow('sellOre', 'zoneFrom', 'Khu bán từ', ws.zoneFrom !== undefined ? ws.zoneFrom : 20, rs.zoneFrom);
    addRow('sellOre', 'zoneTo', 'Khu bán đến', ws.zoneTo !== undefined ? ws.zoneTo : 79, rs.zoneTo);
    addRow('sellOre', 'resetTimeOnNhb', 'Reset time khi bán dc NHB', ws.resetTimeOnNhb !== false, rs.resetTimeOnNhb);
    addRow('sellOre', 'resetTimeOnKcx', 'Reset time khi bán dc KCX', Boolean(ws.resetTimeOnKcx), rs.resetTimeOnKcx);
    addRow('sellOre', 'dropNhbIfFailed', 'Bỏ NHB nếu ko bán dc', ws.dropNhbIfFailed !== false, rs.dropNhbIfFailed);
    addRow('sellOre', 'dropKcxIfFailed', 'Bỏ KCX nếu ko bán dc', ws.dropKcxIfFailed !== false, rs.dropKcxIfFailed);

    // 4. Câu Cá
    const wfi = webValuesSource.fish || {};
    const rfi = decoded.fish || {};
    addRow('fish', 'mapType', 'Khu câu', wfi.mapType !== undefined ? wfi.mapType : 0, rfi.mapType);
    addRow('fish', 'sellFishType', 'Cách bán cá', wfi.sellFishType !== undefined ? wfi.sellFishType : 0, rfi.sellFishType);
    addRow('fish', 'autoBuyTicket', 'Tự mua vé câu', wfi.autoBuyTicket !== false, rfi.autoBuyTicket);
    addRow('fish', 'sellKcx', 'Bán KCX khi câu', Boolean(wfi.sellKcx), rfi.sellKcx);
    addRow('fish', 'rodType', 'Loại cần câu', wfi.rodType !== undefined ? wfi.rodType : 0, rfi.rodType);
    addRow('fish', 'backToFarm', 'Tự về Farm chăm cây', wfi.backToFarm !== false, rfi.backToFarm);
    addRow('fish', 'farmIntervalMinutes', 'Thời gian về Farm', wfi.farmIntervalMinutes || 30, rfi.farmIntervalMinutes);
    addRow('fish', 'sellKcxThreshold', 'Ngưỡng bán KCX', wfi.sellKcxThreshold || 5, rfi.sellKcxThreshold);
    addRow('fish', 'harvestOnTime', 'Thu hoạch farm đúng giờ', wfi.harvestOnTime !== false, rfi.harvestOnTime);

    return rows;
  }, [activeReport, webValuesSource, decoded, mismatchList]);

  const CATEGORIES = [
    { id: 'farm', label: 'Auto Farm', icon: 'leaf', color: 'var(--apple-green)' },
    { id: 'diamond', label: 'Auto Kim Cương', icon: 'diamond', color: 'var(--apple-purple)' },
    { id: 'sellOre', label: 'Auto Bán Đá', icon: 'dollar-sign', color: 'var(--apple-orange)' },
    { id: 'fish', label: 'Auto Câu Cá', icon: 'fish', color: 'var(--apple-blue)' }
  ];

  const renderSettingRow = (row) => (
    <div key={`${row.category}_${row.field}`} className={`rms-setting-row ${row.isMismatch ? 'mismatch' : 'synced'}`}>
      <div className="rms-setting-info">
        <span className="rms-setting-name">{row.label}</span>
        <span className="rms-setting-key">{row.category}.{row.field}</span>
      </div>

      <div className="rms-compare-box">
        <span className={`rms-val-chip ${row.isMismatch ? 'diff' : 'match'}`} title={`Web: ${row.webVal}`}>
          <span className="chip-label">Web:</span>
          <span className="chip-text">{row.webVal !== '' ? row.webVal : '(trống)'}</span>
        </span>
        <span className="rms-compare-arrow">
          <window.Icon name="arrow-right" size={12} />
        </span>
        <span className={`rms-val-chip ${row.isMismatch ? 'diff' : 'match'}`} title={`Game RMS: ${row.rmsVal}`}>
          <span className="chip-label">Game:</span>
          <span className="chip-text">{row.rmsVal !== '' ? row.rmsVal : '(chưa có)'}</span>
        </span>
      </div>

      <div className="rms-status-col">
        {row.isMismatch ? (
          row.mismatchInfo?.status === 'BOOLEAN_INVERTED' ? (
            <span className="rms-status-pill inverted" title={row.mismatchInfo?.message}>
              <window.Icon name="refresh" size={11} color="var(--apple-purple)" />
              <span>Bị nạp ngược</span>
            </span>
          ) : row.mismatchInfo?.status === 'MISSING_IN_RMS' ? (
            <span className="rms-status-pill danger" title={row.mismatchInfo?.message}>
              <window.Icon name="alert" size={11} color="var(--apple-red)" />
              <span>Chưa nạp</span>
            </span>
          ) : (
            <span className="rms-status-pill danger" title={row.mismatchInfo?.message}>
              <window.Icon name="alert-triangle" size={11} color="var(--apple-red)" />
              <span>Lệch giá trị</span>
            </span>
          )
        ) : (
          <span className="rms-status-pill success">
            <window.Icon name="check" size={11} color="var(--apple-green)" />
            <span>Khớp 100%</span>
          </span>
        )}
      </div>
    </div>
  );

  return (
    <window.ModalBase
      title={`Kiểm Tra & Chẩn Đoán RMS: ${account.username}`}
      subtitle={`So sánh và đối chiếu dữ liệu Web Settings với RecordStore (.rs) Game nhị phân`}
      icon="search"
      iconColor="var(--apple-blue)"
      size="lg"
      onClose={handleSafeClose}
      footer={
        <div className="rms-modal-footer">
          {/* Nhóm chọn số vòng & Bấm Test ngẫu nhiên */}
          <div className="rms-modal-footer-left">
            <div className="rms-rounds-picker">
              <span className="rms-test-label">Vòng:</span>
              <select
                className="form-control rms-rounds-select"
                value={testRounds}
                onChange={(e) => setTestRounds(Number(e.target.value))}
                disabled={actionLoading}
              >
                <option value={1}>1 vòng</option>
                <option value={3}>3 vòng</option>
                <option value={5}>5 vòng</option>
                <option value={10}>10 vòng</option>
              </select>
            </div>
            <button
              type="button"
              className="btn btn-secondary rms-btn-test"
              onClick={() => handleRandomTest(testRounds)}
              disabled={loading || actionLoading}
              title="Sinh ngẫu nhiên dữ liệu và test kiểm tra ngược/thiếu cờ"
            >
              <window.Icon name="zap" size={14} color="var(--apple-orange)" />
              <span>{actionLoading ? 'Đang test...' : `Bắt Đầu Test (${testRounds} Vòng)`}</span>
            </button>
          </div>

          {/* Nhóm thao tác chính: Copy & Nạp lại RMS gốc */}
          <div className="rms-modal-footer-right">
            <button
              type="button"
              className="btn btn-secondary btn-sm"
              onClick={handleCopyReport}
              disabled={!activeReport}
              title="Sao chép báo cáo chi tiết để gửi cho AI sửa lỗi"
            >
              <window.Icon name="copy" size={14} />
              <span>{copySuccess ? 'Đã Copy' : 'Copy Báo Cáo'}</span>
            </button>
            <button
              type="button"
              className="btn btn-primary"
              disabled={loading || actionLoading}
              onClick={handleRestoreOriginal}
              title="Nạp lại toàn bộ cấu hình thật từ Web vào file RMS của Game"
            >
              <window.Icon name="upload" size={14} />
              <span>{actionLoading ? 'Đang nạp...' : 'Nạp Lại RMS Gốc Từ Web'}</span>
            </button>
          </div>
        </div>
      }
    >
      {/* Audit Banner Status */}
      <div className="rms-audit-banner">
        <div className="rms-audit-banner-meta">
          <span>Bản Mod: <strong className="rms-mod-name">{account?.gameJar || 'avatar.jar'}</strong></span>
          <span>•</span>
          <span>Thư mục RMS: <span className="rms-val-code">{audit?.rmsDir ? audit.rmsDir.split('\\').pop() : 'MicroEmulator'}</span></span>
          {testMode && (
            <>
              <span>•</span>
              <span className="rms-test-pill">TEST CHẾ ĐỘ NGẪU NHIÊN</span>
            </>
          )}
        </div>

        <div className="rms-audit-banner-right">
          {isAllSynced ? (
            <span className="rms-status-pill success">
              <window.Icon name="check-circle" size={13} color="var(--apple-green)" />
              <span>ĐÃ KHỚP 100% (0 LỖI)</span>
            </span>
          ) : (
            <span className="rms-status-pill danger">
              <window.Icon name="alert-triangle" size={13} color="var(--apple-red)" />
              <span>LỆCH {mismatchList.length} TRƯỜNG DỮ LIỆU</span>
            </span>
          )}
        </div>
      </div>

      {/* Summary KPI Cards */}
      <div className="rms-summary-stats">
        <div className="rms-stat-card">
          <span className="rms-stat-label">Tổng Trường Đối Chiếu</span>
          <span className="rms-stat-value">{allFieldRows.length}</span>
        </div>
        <div className="rms-stat-card">
          <span className="rms-stat-label">Khớp Tuyệt Đối</span>
          <span className="rms-stat-value stat-green">
            {allFieldRows.length - mismatchList.length}
          </span>
        </div>
        <div className="rms-stat-card">
          <span className="rms-stat-label">Sai Lệch / Ngược</span>
          <span className={`rms-stat-value ${mismatchList.length > 0 ? 'stat-red' : 'stat-muted'}`}>
            {mismatchList.length}
          </span>
        </div>
        <div className="rms-stat-card">
          <span className="rms-stat-label">Tệp .RS Trên Ổ Cứng</span>
          <span className="rms-stat-value stat-blue">
            {audit?.totalFiles || 0}
          </span>
        </div>
      </div>

      {/* Category Tabs (Filter Pill Group) */}
      <div className="filter-pill-group">
        <button
          type="button"
          className={`filter-pill ${activeCategory === 'all' ? 'active' : ''}`}
          onClick={() => setActiveCategory('all')}
        >
          Tất Cả ({allFieldRows.length})
        </button>
        {mismatchList.length > 0 && (
          <button
            type="button"
            className={`filter-pill filter-pill-danger ${activeCategory === 'mismatch' ? 'active' : ''}`}
            onClick={() => setActiveCategory('mismatch')}
          >
            <window.Icon name="alert-triangle" size={12} color="var(--apple-red)" />
            <span>Chỉ Xem Lỗi ({mismatchList.length})</span>
          </button>
        )}
        {CATEGORIES.map(cat => {
          const count = allFieldRows.filter(r => r.category === cat.id).length;
          return (
            <button
              key={cat.id}
              type="button"
              className={`filter-pill ${activeCategory === cat.id ? 'active' : ''}`}
              onClick={() => setActiveCategory(cat.id)}
            >
              <window.Icon name={cat.icon} size={12} color={activeCategory === cat.id ? '#ffffff' : cat.color} />
              <span>{cat.label} ({count})</span>
            </button>
          );
        })}
      </div>

      {/* Main Content: Section Cards (như các cài đặt auto á) */}
      {loading ? (
        <div className="rms-empty-box">
          <window.Icon name="refresh" size={24} className="spin" color="var(--apple-blue)" />
          <p style={{ marginTop: '10px' }}>Đang giải mã và đối chiếu file RecordStore nhị phân...</p>
        </div>
      ) : error ? (
        <div className="danger-callout-box">
          <strong className="danger-callout-title">Lỗi kiểm tra RMS</strong>
          <span>{error}</span>
        </div>
      ) : allFieldRows.length === 0 ? (
        <div className="rms-empty-box">
          Chưa tìm thấy dữ liệu cấu hình hoặc tệp RecordStore của tài khoản.
        </div>
      ) : (
        <div className="rms-sections-container">
          {activeCategory === 'mismatch' ? (
            <div className="rms-section-card has-error">
              <div className="rms-sec-header">
                <div className="rms-sec-title-group">
                  <window.Icon name="alert-triangle" size={15} color="var(--apple-red)" />
                  <span>Danh Sách Trường Dữ Liệu Bị Sai Lệch ({mismatchList.length})</span>
                </div>
                <span className="rms-sec-badge has-issues">Cần Sửa</span>
              </div>
              <div className="rms-settings-list">
                {allFieldRows.filter(r => r.isMismatch).map(renderSettingRow)}
              </div>
            </div>
          ) : activeCategory === 'all' ? (
            CATEGORIES.map(cat => {
              const catRows = allFieldRows.filter(r => r.category === cat.id);
              const catMismatches = catRows.filter(r => r.isMismatch);
              return (
                <div key={cat.id} className={`rms-section-card ${catMismatches.length > 0 ? 'has-error' : ''}`}>
                  <div className="rms-sec-header">
                    <div className="rms-sec-title-group">
                      <window.Icon name={cat.icon} size={15} color={cat.color} />
                      <span>{cat.label} ({catRows.length} cài đặt)</span>
                    </div>
                    <div>
                      {catMismatches.length === 0 ? (
                        <span className="rms-sec-badge all-good">Khớp {catRows.length}/{catRows.length}</span>
                      ) : (
                        <span className="rms-sec-badge has-issues">Lệch {catMismatches.length}/{catRows.length} trường</span>
                      )}
                    </div>
                  </div>
                  <div className="rms-settings-list">
                    {catRows.map(renderSettingRow)}
                  </div>
                </div>
              );
            })
          ) : (
            (() => {
              const cat = CATEGORIES.find(c => c.id === activeCategory);
              const catRows = allFieldRows.filter(r => r.category === activeCategory);
              const catMismatches = catRows.filter(r => r.isMismatch);
              return (
                <div className={`rms-section-card ${catMismatches.length > 0 ? 'has-error' : ''}`}>
                  <div className="rms-sec-header">
                    <div className="rms-sec-title-group">
                      <window.Icon name={cat?.icon || 'settings'} size={15} color={cat?.color || 'var(--apple-blue)'} />
                      <span>{cat?.label} ({catRows.length} cài đặt)</span>
                    </div>
                    <div>
                      {catMismatches.length === 0 ? (
                        <span className="rms-sec-badge all-good">Khớp {catRows.length}/{catRows.length}</span>
                      ) : (
                        <span className="rms-sec-badge has-issues">Lệch {catMismatches.length}/{catRows.length} trường</span>
                      )}
                    </div>
                  </div>
                  <div className="rms-settings-list">
                    {catRows.map(renderSettingRow)}
                  </div>
                </div>
              );
            })()
          )}
        </div>
      )}
    </window.ModalBase>
  );
};
