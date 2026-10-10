/**
 * FileModal & FileFormModal Component (Presentation Layer / Modals)
 * Porsche & Apple Minimalist Liquid Glass File & JAR Manager
 * Main File List view with dedicated standalone popup box modal for Add / Edit.
 */
const { useState: useFileModalState, useEffect: useFileModalEffect } = React;

/**
 * Standalone popup box modal for Adding / Editing a File Profile
 */
function FileFormModal({
  file,
  availableJars = [],
  fetchJars,
  onClose,
  onSaved
}) {
  const isEditing = Boolean(file);
  const [name, setName] = useFileModalState(file?.name || '');
  const [gameJar, setGameJar] = useFileModalState(file?.gameJar || (availableJars[0] || 'Avatar_ChipMix_Full_build13.jar'));
  const [modType, setModType] = useFileModalState(
    file?.modType || (
      (file?.gameJar && (file.gameJar.toLowerCase().includes('chip') || file.gameJar.toLowerCase().includes('mix'))) ? 'chipmix' :
      (file?.gameJar && file.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu'
    )
  );
  const [maxAccounts, setMaxAccounts] = useFileModalState(file?.maxAccounts || 6);
  const [uploadStatus, setUploadStatus] = useFileModalState('');
  const [loading, setLoading] = useFileModalState(false);
  const [error, setError] = useFileModalState('');

  const handleFileUpload = async (e) => {
    const uploaded = e.target.files[0];
    if (!uploaded) return;
    const notifyAlert = window.showAlert || alert;
    if (!uploaded.name.endsWith('.jar')) {
      notifyAlert('Vui lòng chọn file có định dạng đuôi .jar!', 'Định Dạng Không Đúng', 'warning');
      return;
    }

    setUploadStatus(`Đang tải lên: ${uploaded.name}...`);
    try {
      const data = await window.ApiClient.uploadJar(uploaded);
      if (data.success) {
        setUploadStatus(`Đã tải lên: ${data.filename}`);
        setGameJar(data.filename);
        const nameLower = data.filename.toLowerCase();
        if (nameLower.includes('chip') || nameLower.includes('mix')) {
          setModType('chipmix');
        } else if (nameLower.includes('fish')) {
          setModType('fish');
        }
        if (fetchJars) fetchJars();
      } else {
        notifyAlert(data.message || 'Lỗi tải lên JAR', 'Lỗi Tải File', 'error');
        setUploadStatus('');
      }
    } catch (err) {
      notifyAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      setUploadStatus('');
    }
  };

  const handleSubmit = async (e) => {
    if (e) e.preventDefault();
    if (!name.trim()) {
      setError('Vui lòng nhập tên File!');
      return;
    }

    const payload = {
      id: file ? file.id : undefined,
      name: name.trim(),
      gameJar,
      modType,
      maxAccounts: Math.max(6, parseInt(maxAccounts || 6, 10))
    };

    setLoading(true);
    setError('');
    try {
      const data = await window.ApiClient.saveFile(payload);
      if (data.success) {
        const notifyAlert = window.showAlert || alert;
        notifyAlert(data.message || (isEditing ? 'Đã cập nhật File thành công!' : 'Đã thêm File mới thành công!'), 'Thành Công', 'success');
        if (onSaved) onSaved();
        if (onClose) onClose();
      } else {
        setError(data.message || 'Lỗi lưu File');
      }
    } catch (err) {
      setError('Lỗi: ' + err.message);
    } finally {
      setLoading(false);
    }
  };

  const calculatedIps = Math.max(1, Math.ceil(parseInt(maxAccounts || 6, 10) / 6));

  return (
    <window.ModalBase
      title={isEditing ? `Sửa File: ${file.name}` : 'Thêm File Profile Mới'}
      subtitle="Thiết lập tên file, cấu hình JAR và chế độ Auto"
      icon="folder"
      iconColor="var(--apple-blue)"
      size="sm"
      zIndex={10010}
      onClose={onClose}
      footer={
        <div style={{ display: 'flex', justifyContent: 'flex-end', gap: '10px', width: '100%' }}>
          <button type="button" className="btn btn-secondary" onClick={onClose}>
            Hủy
          </button>
          <button type="button" className="btn btn-primary" onClick={handleSubmit} disabled={loading} style={{ gap: '6px' }}>
            <window.Icon name="check" size={14} />
            {loading ? 'Đang lưu...' : (isEditing ? 'Lưu Cập Nhật' : 'Thêm File')}
          </button>
        </div>
      }
    >
      {error && <div className="alert alert-danger" style={{ marginBottom: '14px' }}>{error}</div>}

      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
        <div className="form-group">
          <label>Tên File / Nhóm tài khoản <span style={{ color: 'var(--apple-red)' }}>*</span>:</label>
          <input
            type="text"
            className="form-control"
            placeholder="VD: File 1 - Kim Cương, File 2 - Câu Cá..."
            value={name}
            onChange={e => setName(e.target.value)}
            required
            autoFocus
          />
        </div>

        <div className="form-group">
          <label>Số tài khoản tối đa trong File (Số nick):</label>
          <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
            <input
              type="number"
              className="form-control"
              min="6"
              step="6"
              value={maxAccounts}
              onChange={e => setMaxAccounts(e.target.value)}
              style={{ width: '120px' }}
            />
            <div style={{ fontSize: '0.82rem', color: 'var(--text-secondary)' }}>
              = <strong style={{ color: 'var(--apple-blue)' }}>{calculatedIps} Tab IP</strong>
              {' '}(Tối đa <strong style={{ color: 'var(--apple-blue)' }}>{calculatedIps * 3} Hoàn Mỹ</strong> + <strong style={{ color: 'var(--apple-purple)' }}>{calculatedIps * 3} Diệu Kỳ</strong>)
            </div>
          </div>
          <small style={{ color: 'var(--text-tertiary)', display: 'block', marginTop: '4px' }}>
            * Mỗi IP quản lý tối đa 6 tài khoản (3 Hoàn Mỹ + 3 Diệu Kỳ). Ví dụ: 12 nick sẽ có 2 Tab IP.
          </small>
        </div>

        <div className="form-group">
          <label>Loại Bản Mod (Chế độ tự động):</label>
          <div style={{ display: 'grid', gridTemplateColumns: 'repeat(auto-fit, minmax(170px, 1fr))', gap: '10px', marginTop: '4px' }}>
            <label style={{
              display: 'flex',
              alignItems: 'center',
              gap: '10px',
              padding: '12px 14px',
              borderRadius: 'var(--radius-sm)',
              border: '1px solid',
              borderColor: modType === 'chipmix' ? 'var(--apple-green)' : 'var(--glass-border-subtle)',
              background: modType === 'chipmix' ? 'rgba(52, 211, 153, 0.12)' : 'var(--glass-matrix-bg)',
              cursor: 'pointer',
              transition: 'var(--transition-fast)'
            }}>
              <input
                type="radio"
                name="modType"
                value="chipmix"
                checked={modType === 'chipmix'}
                onChange={() => setModType('chipmix')}
                style={{ accentColor: 'var(--apple-green)' }}
              />
              <div>
                <strong style={{ color: 'var(--apple-green)', display: 'block', fontSize: '0.86rem' }}>ChipMix Full</strong>
                <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>Full Câu Cá, KC & Farm</span>
              </div>
            </label>

            <label style={{
              display: 'flex',
              alignItems: 'center',
              gap: '10px',
              padding: '12px 14px',
              borderRadius: 'var(--radius-sm)',
              border: '1px solid',
              borderColor: modType === 'fish' ? 'var(--apple-blue)' : 'var(--glass-border-subtle)',
              background: modType === 'fish' ? 'rgba(56, 189, 248, 0.12)' : 'var(--glass-matrix-bg)',
              cursor: 'pointer',
              transition: 'var(--transition-fast)'
            }}>
              <input
                type="radio"
                name="modType"
                value="fish"
                checked={modType === 'fish'}
                onChange={() => setModType('fish')}
                style={{ accentColor: 'var(--apple-blue)' }}
              />
              <div>
                <strong style={{ color: 'var(--apple-blue)', display: 'block', fontSize: '0.86rem' }}>Auto Câu Cá</strong>
                <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>Menu câu cá & vé</span>
              </div>
            </label>

            <label style={{
              display: 'flex',
              alignItems: 'center',
              gap: '10px',
              padding: '12px 14px',
              borderRadius: 'var(--radius-sm)',
              border: '1px solid',
              borderColor: modType === 'upxu' ? 'var(--apple-purple)' : 'var(--glass-border-subtle)',
              background: modType === 'upxu' ? 'rgba(168, 85, 247, 0.12)' : 'var(--glass-matrix-bg)',
              cursor: 'pointer',
              transition: 'var(--transition-fast)'
            }}>
              <input
                type="radio"
                name="modType"
                value="upxu"
                checked={modType === 'upxu'}
                onChange={() => setModType('upxu')}
                style={{ accentColor: 'var(--apple-purple)' }}
              />
              <div>
                <strong style={{ color: 'var(--apple-purple)', display: 'block', fontSize: '0.86rem' }}>Auto Kim Cương</strong>
                <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>Farm, đào KC & bán đá</span>
              </div>
            </label>
          </div>
        </div>

        <div className="form-group">
          <label>Tệp JAR Game Bản Chạy:</label>
          <div style={{ display: 'flex', gap: '8px', alignItems: 'center' }}>
            <select className="form-control" value={gameJar} onChange={e => setGameJar(e.target.value)} style={{ flex: 1 }}>
              {(availableJars || []).map(j => (
                <option key={j} value={j}>{j}</option>
              ))}
            </select>
            <label className="btn btn-secondary btn-sm" style={{ cursor: 'pointer', margin: 0, whiteSpace: 'nowrap', gap: '6px' }}>
              <window.Icon name="upload" size={13} /> Tải .JAR
              <input type="file" accept=".jar" style={{ display: 'none' }} onChange={handleFileUpload} />
            </label>
          </div>
          {uploadStatus && (
            <small style={{ color: 'var(--apple-green)', display: 'flex', alignItems: 'center', gap: '4px', marginTop: '4px' }}>
              <window.Icon name="check-circle" size={12} /> {uploadStatus}
            </small>
          )}
        </div>
      </form>
    </window.ModalBase>
  );
}

/**
 * Main File List Manager Modal
 */
window.FileModal = function FileModal({
  file,
  files = [],
  activeFileId,
  availableJars = [],
  fetchJars,
  onSwitchFile,
  onDeleteFile,
  onClose,
  onSaved
}) {
  const [editingFile, setEditingFile] = useFileModalState(file || null);
  const [showFormModal, setShowFormModal] = useFileModalState(Boolean(file));

  useFileModalEffect(() => {
    if (file) {
      setEditingFile(file);
      setShowFormModal(true);
    }
  }, [file]);

  const openCreateForm = () => {
    setEditingFile(null);
    setShowFormModal(true);
  };

  const openEditForm = (f) => {
    setEditingFile(f);
    setShowFormModal(true);
  };

  const handleSavedForm = () => {
    setShowFormModal(false);
    setEditingFile(null);
    if (onSaved) onSaved();
  };

  const handleDelete = async (id, fileName) => {
    if (onDeleteFile) {
      onDeleteFile(id, fileName);
    }
  };

  return (
    <>
      <window.ModalBase
        title={`Quản Lý Danh Sách File (${files.length})`}
        subtitle="Mỗi file quản lý tối đa 6 tài khoản bot độc lập"
        icon="folder"
        iconColor="var(--apple-blue)"
        size="lg"
        onClose={onClose}
        footer={
          <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%', alignItems: 'center' }}>
            <div style={{ fontSize: '0.78rem', color: 'var(--text-secondary)' }}>
              Tối đa 6 tài khoản / file (3 Hoàn Mỹ + 3 Diệu Kỳ)
            </div>
            <button type="button" className="btn btn-secondary" onClick={onClose}>
              Đóng
            </button>
          </div>
        }
      >
        <div style={{ display: 'flex', flexDirection: 'column', gap: '14px' }}>
          {/* Action Bar */}
          <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', flexWrap: 'wrap', gap: '10px' }}>
            <span style={{ fontSize: '0.82rem', color: 'var(--text-secondary)' }}>
              Danh sách các hồ sơ file độc lập trong hệ thống
            </span>
            <button
              type="button"
              className="btn btn-primary btn-sm"
              onClick={openCreateForm}
              style={{ display: 'flex', alignItems: 'center', gap: '6px' }}
            >
              <window.Icon name="plus" size={14} /> Thêm File Mới
            </button>
          </div>

          {/* Files List */}
          {files.length === 0 ? (
            <div className="proxy-empty-state" style={{ padding: '36px 20px', background: 'var(--glass-matrix-bg)', borderRadius: 'var(--radius-md)', border: '1px dashed var(--glass-border-subtle)', textAlign: 'center' }}>
              <div style={{ marginBottom: '8px' }}>
                <window.Icon name="folder" size={32} color="var(--text-tertiary)" />
              </div>
              <p style={{ margin: '0 0 12px 0', color: 'var(--text-secondary)', fontSize: '0.88rem' }}>Chưa có file nào trong danh sách.</p>
              <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm} style={{ gap: '6px' }}>
                <window.Icon name="plus" size={14} /> Tạo File Đầu Tiên
              </button>
            </div>
          ) : (
            <div style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
              {files.map(f => {
                const isCurrent = f.id === activeFileId;
                const hmOnline = f.runningHmCount || 0;
                const dkOnline = f.runningDkCount || 0;
                const totalOnline = (f.runningCount !== undefined ? f.runningCount : 0);
                const isFishMod = f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'));

                return (
                  <div
                    key={f.id}
                    style={{
                      display: 'flex',
                      alignItems: 'center',
                      justifyContent: 'space-between',
                      padding: '14px 16px',
                      background: isCurrent ? 'rgba(10, 132, 255, 0.08)' : 'var(--glass-matrix-bg)',
                      borderRadius: 'var(--radius-md)',
                      border: '1px solid',
                      borderColor: isCurrent ? 'rgba(10, 132, 255, 0.4)' : 'var(--glass-border-subtle)',
                      transition: 'var(--transition-fast)'
                    }}
                  >
                    <div style={{ minWidth: 0, flex: 1, paddingRight: '12px' }}>
                      <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '6px', flexWrap: 'wrap' }}>
                        <strong style={{ color: 'var(--text-primary)', fontSize: '0.94rem' }}>{f.name}</strong>
                        <span style={{
                          display: 'inline-flex',
                          alignItems: 'center',
                          gap: '4px',
                          padding: '2px 8px',
                          borderRadius: '6px',
                          fontSize: '0.72rem',
                          fontWeight: 600,
                          background: isFishMod ? 'rgba(10, 132, 255, 0.12)' : 'rgba(191, 90, 242, 0.12)',
                          color: isFishMod ? 'var(--apple-blue)' : 'var(--apple-purple)',
                          border: '1px solid',
                          borderColor: isFishMod ? 'rgba(10, 132, 255, 0.3)' : 'rgba(191, 90, 242, 0.3)'
                        }}>
                          <window.Icon name={isFishMod ? 'fish' : 'diamond'} size={12} />
                          {isFishMod ? 'Auto Câu Cá' : 'Auto Kim Cương'}
                        </span>
                        {isCurrent && (
                          <span style={{
                            padding: '2px 7px',
                            borderRadius: '6px',
                            fontSize: '0.72rem',
                            fontWeight: 600,
                            background: 'rgba(10, 132, 255, 0.18)',
                            color: 'var(--apple-blue)',
                            border: '1px solid rgba(10, 132, 255, 0.4)'
                          }}>
                            Đang mở
                          </span>
                        )}
                        {totalOnline > 0 && (
                          <span style={{
                            display: 'inline-flex',
                            alignItems: 'center',
                            gap: '4px',
                            fontSize: '0.74rem',
                            color: 'var(--apple-green)',
                            fontWeight: 600,
                            background: 'rgba(48, 209, 88, 0.12)',
                            padding: '2px 7px',
                            borderRadius: '6px',
                            border: '1px solid rgba(48, 209, 88, 0.25)'
                          }}>
                            <span style={{ width: '6px', height: '6px', borderRadius: '50%', background: 'var(--apple-green)', display: 'inline-block' }}></span>
                            {totalOnline} online
                          </span>
                        )}
                      </div>
                      <div style={{ fontSize: '0.8rem', color: 'var(--text-secondary)', display: 'flex', gap: '10px', flexWrap: 'wrap', alignItems: 'center' }}>
                        <span>JAR: <strong style={{ color: 'var(--text-primary)' }}>{f.gameJar}</strong></span>
                        <span>•</span>
                        <span>Số lượng: <strong style={{ color: 'var(--text-primary)' }}>{f.totalAccounts || 0}/{f.maxAccounts || 6} nick ({f.totalIps || Math.max(1, Math.ceil((f.maxAccounts || 6)/6))} IP)</strong></span>
                        <span>•</span>
                        <span>HM: {f.hmCount || 0}/{f.maxPerServer || (Math.max(1, Math.ceil((f.maxAccounts || 6)/6))*3)} | DK: {f.dkCount || 0}/{f.maxPerServer || (Math.max(1, Math.ceil((f.maxAccounts || 6)/6))*3)}</span>
                      </div>
                    </div>

                    <div style={{ display: 'flex', alignItems: 'center', gap: '6px', flexShrink: 0 }}>
                      {!isCurrent && onSwitchFile && (
                        <button
                          type="button"
                          className="btn btn-sm btn-outline"
                          onClick={() => {
                            onSwitchFile(f.id);
                            onClose();
                          }}
                          title="Chuyển sang xem File này"
                          style={{ fontSize: '0.78rem', padding: '5px 10px', gap: '4px' }}
                        >
                          <window.Icon name="eye" size={13} /> Xem
                        </button>
                      )}
                      <button
                        type="button"
                        className="btn btn-sm btn-secondary"
                        onClick={() => openEditForm(f)}
                        style={{ padding: '5px 8px' }}
                        title="Chỉnh sửa File"
                      >
                        <window.Icon name="edit" size={13} />
                      </button>
                      {files.length > 1 && (
                        <button
                          type="button"
                          className="btn btn-sm btn-danger"
                          onClick={() => handleDelete(f.id, f.name)}
                          style={{ padding: '5px 8px' }}
                          title="Xóa File này"
                        >
                          <window.Icon name="trash" size={13} />
                        </button>
                      )}
                    </div>
                  </div>
                );
              })}
            </div>
          )}
        </div>
      </window.ModalBase>

      {/* Standalone Box Modal for Add/Edit File */}
      {showFormModal && (
        <FileFormModal
          file={editingFile}
          availableJars={availableJars}
          fetchJars={fetchJars}
          onClose={() => setShowFormModal(false)}
          onSaved={handleSavedForm}
        />
      )}
    </>
  );
};
