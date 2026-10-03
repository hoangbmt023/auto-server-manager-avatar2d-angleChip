/**
 * FileModal Component (Presentation Layer / Modals)
 * Box-style File Manager: List view with dedicated popup/box form for adding & editing files.
 * No default file restriction (all files can be deleted or edited).
 */
const { useState: useFileModalState, useEffect: useFileModalEffect } = React;

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
  const [viewMode, setViewMode] = useFileModalState(file ? 'form' : 'list'); // 'list' | 'form'
  const [editingFile, setEditingFile] = useFileModalState(file || null);
  const [name, setName] = useFileModalState(file?.name || '');
  const [gameJar, setGameJar] = useFileModalState(file?.gameJar || (availableJars[0] || 'avatar_fish_build40.jar'));
  const [modType, setModType] = useFileModalState(file?.modType || ((file?.gameJar && file.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu'));
  const [uploadStatus, setUploadStatus] = useFileModalState('');
  const [loading, setLoading] = useFileModalState(false);
  const [error, setError] = useFileModalState('');

  useFileModalEffect(() => {
    if (file) {
      setEditingFile(file);
      setName(file.name || '');
      setGameJar(file.gameJar || availableJars[0] || 'avatar_fish_build40.jar');
      setModType(file.modType || ((file.gameJar && file.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu'));
      setViewMode('form');
    }
  }, [file]);

  const openCreateForm = () => {
    setEditingFile(null);
    setName('');
    setGameJar(availableJars[0] || 'avatar_fish_build40.jar');
    setModType('upxu');
    setError('');
    setViewMode('form');
  };

  const openEditForm = (f) => {
    setEditingFile(f);
    setName(f.name || '');
    setGameJar(f.gameJar || availableJars[0] || 'avatar_fish_build40.jar');
    setModType(f.modType || ((f.gameJar && f.gameJar.toLowerCase().includes('fish')) ? 'fish' : 'upxu'));
    setError('');
    setViewMode('form');
  };

  const backToList = () => {
    setEditingFile(null);
    setError('');
    setViewMode('list');
  };

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
        setUploadStatus(`✓ Đã tải lên: ${data.filename}`);
        setGameJar(data.filename);
        if (data.filename.toLowerCase().includes('fish')) {
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
    e.preventDefault();
    if (!name.trim()) {
      setError('Vui lòng nhập tên File!');
      return;
    }

    const payload = {
      id: editingFile ? editingFile.id : undefined,
      name: name.trim(),
      gameJar,
      modType
    };

    setLoading(true);
    setError('');
    try {
      const data = await window.ApiClient.saveFile(payload);
      if (data.success) {
        backToList();
        if (onSaved) onSaved();
      } else {
        setError(data.message || 'Lỗi lưu File');
      }
    } catch (err) {
      setError('Lỗi: ' + err.message);
    } finally {
      setLoading(false);
    }
  };

  const handleDelete = async (id, fileName) => {
    if (onDeleteFile) {
      onDeleteFile(id, fileName);
    }
    if (editingFile && editingFile.id === id) {
      backToList();
    }
  };

  return (
    <div className="modal-overlay" style={{ display: 'flex' }} onClick={onClose}>
      <div className="modal-card" onClick={(e) => e.stopPropagation()} style={{ maxWidth: '720px', width: '100%' }}>
        {/* Header */}
        <div className="modal-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            <span style={{ fontSize: '1.25rem' }}>📁</span>
            <h3 style={{ margin: 0, fontSize: '1.1rem' }}>
              {viewMode === 'form'
                ? (editingFile ? `Sửa File: ${editingFile.name}` : 'Thêm File / Profile JAR Mới')
                : `Quản Lý Danh Sách File (${files.length})`}
            </h3>
          </div>
          <button className="btn-close" onClick={onClose}>&times;</button>
        </div>

        {/* Body */}
        <div className="modal-body" style={{ maxHeight: 'calc(85vh - 120px)', overflowY: 'auto' }}>
          {error && <div className="alert alert-danger" style={{ marginBottom: '16px' }}>{error}</div>}

          {viewMode === 'list' ? (
            <div>
              {/* List Top Action Bar */}
              <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '16px', flexWrap: 'wrap', gap: '10px' }}>
                <span style={{ fontSize: '0.85rem', color: '#94a3b8' }}>
                  Mỗi File chứa tối đa <strong>6 nick</strong> (3 Hoàn Mỹ + 3 Diệu Kỳ). Không bắt buộc Proxy.
                </span>
                <button
                  type="button"
                  className="btn btn-primary btn-sm"
                  onClick={openCreateForm}
                  style={{ display: 'flex', alignItems: 'center', gap: '6px' }}
                >
                  ➕ Thêm File Mới
                </button>
              </div>

              {/* List of Files */}
              {files.length === 0 ? (
                <div style={{ textAlign: 'center', padding: '40px 20px', color: '#64748b', background: 'rgba(255, 255, 255, 0.02)', borderRadius: '10px', border: '1px dashed rgba(255, 255, 255, 0.08)' }}>
                  <div style={{ fontSize: '2rem', marginBottom: '8px' }}>📁</div>
                  <p style={{ margin: '0 0 12px 0' }}>Chưa có File nào trong danh sách.</p>
                  <button type="button" className="btn btn-primary btn-sm" onClick={openCreateForm}>
                    ➕ Thêm File Đầu Tiên
                  </button>
                </div>
              ) : (
                <div style={{ display: 'flex', flexDirection: 'column', gap: '10px' }}>
                  {files.map(f => {
                    const isCurrent = f.id === activeFileId;
                    const hmOnline = f.runningHmCount || 0;
                    const dkOnline = f.runningDkCount || 0;
                    const totalOnline = (f.runningCount !== undefined ? f.runningCount : 0);

                    return (
                      <div
                        key={f.id}
                        style={{
                          display: 'flex',
                          alignItems: 'center',
                          justifyContent: 'space-between',
                          padding: '14px 16px',
                          background: isCurrent ? 'rgba(59, 130, 246, 0.08)' : 'rgba(255, 255, 255, 0.03)',
                          borderRadius: '10px',
                          border: '1px solid',
                          borderColor: isCurrent ? 'rgba(59, 130, 246, 0.4)' : 'rgba(255, 255, 255, 0.08)'
                        }}
                      >
                        <div>
                          <div style={{ display: 'flex', alignItems: 'center', gap: '8px', marginBottom: '4px' }}>
                            <strong style={{ color: '#f8fafc', fontSize: '0.95rem' }}>📁 {f.name}</strong>
                            <span style={{
                              padding: '2px 8px',
                              borderRadius: '4px',
                              fontSize: '0.72rem',
                              fontWeight: 600,
                              background: (f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'))) ? 'rgba(56, 189, 248, 0.15)' : 'rgba(168, 85, 247, 0.15)',
                              color: (f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'))) ? '#38bdf8' : '#c084fc',
                              border: '1px solid',
                              borderColor: (f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'))) ? 'rgba(56, 189, 248, 0.35)' : 'rgba(168, 85, 247, 0.35)'
                            }}>
                              {(f.modType === 'fish' || (!f.modType && f.gameJar && f.gameJar.toLowerCase().includes('fish'))) ? '🎣 Auto up câu cá' : '💎 Auto Up kim cương'}
                            </span>
                            {isCurrent && (
                              <span style={{
                                padding: '2px 6px',
                                borderRadius: '4px',
                                fontSize: '0.72rem',
                                fontWeight: 600,
                                background: 'rgba(59, 130, 246, 0.2)',
                                color: '#60a5fa',
                                border: '1px solid rgba(59, 130, 246, 0.4)'
                              }}>
                                Đang xem
                              </span>
                            )}
                            {totalOnline > 0 && (
                              <span style={{ fontSize: '0.75rem', color: '#4ade80', fontWeight: 'bold' }}>
                                🔥 {totalOnline} on
                              </span>
                            )}
                          </div>
                          <div style={{ fontSize: '0.82rem', color: '#94a3b8', display: 'flex', gap: '10px', flexWrap: 'wrap' }}>
                            <span>JAR: <strong style={{ color: '#cbd5e1' }}>{f.gameJar}</strong></span>
                            <span>•</span>
                            <span>Số lượng: <strong style={{ color: '#cbd5e1' }}>{f.totalAccounts || 0}/6 nick</strong></span>
                            <span>•</span>
                            <span>HM: <strong>{hmOnline}/3</strong> | DK: <strong>{dkOnline}/3</strong></span>
                          </div>
                        </div>

                        <div style={{ display: 'flex', alignItems: 'center', gap: '6px' }}>
                          {!isCurrent && onSwitchFile && (
                            <button
                              type="button"
                              className="btn btn-sm btn-outline"
                              onClick={() => {
                                onSwitchFile(f.id);
                                onClose();
                              }}
                              title="Chuyển đến xem File này trên giao diện"
                              style={{ fontSize: '0.78rem', padding: '4px 10px' }}
                            >
                              👁️ Xem
                            </button>
                          )}
                          <button
                            type="button"
                            className="btn btn-sm btn-secondary"
                            onClick={() => openEditForm(f)}
                            style={{ padding: '4px 8px', fontSize: '0.8rem' }}
                            title="Chỉnh sửa File"
                          >
                            ✏️ Sửa
                          </button>
                          {files.length > 1 && (
                            <button
                              type="button"
                              className="btn btn-sm btn-danger"
                              onClick={() => handleDelete(f.id, f.name)}
                              style={{ padding: '4px 8px', fontSize: '0.8rem' }}
                              title="Xóa File này"
                            >
                              🗑️
                            </button>
                          )}
                        </div>
                      </div>
                    );
                  })}
                </div>
              )}
            </div>
          ) : (
            /* Dedicated Box Form for Input */
            <div className="card-glass" style={{ padding: '20px', background: 'rgba(255, 255, 255, 0.03)', borderRadius: '12px', border: '1px solid rgba(255, 255, 255, 0.08)' }}>
              <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: '16px' }}>
                <h4 style={{ margin: 0, fontSize: '1rem', color: '#60a5fa' }}>
                  {editingFile ? `✏️ Chỉnh Sửa Thông Tin File: ${editingFile.name}` : '➕ Nhập Thông Tin File Mới'}
                </h4>
                <button type="button" className="btn btn-sm btn-secondary" onClick={backToList}>
                  ⬅️ Quay lại danh sách
                </button>
              </div>

              <form onSubmit={handleSubmit}>
                <div style={{ display: 'grid', gridTemplateColumns: '1fr', gap: '14px' }}>
                  <div className="form-group">
                    <label>Tên File / Nhóm tài khoản <span style={{ color: '#f87171' }}>*</span>:</label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="VD: File 1 - Auto Up kim cương, File 2 - Auto up câu cá..."
                      value={name}
                      onChange={e => setName(e.target.value)}
                      required
                    />
                  </div>

                  <div className="form-group">
                    <label>Loại Bản Mod (Tùy chọn hiển thị ở menu Bật Auto):</label>
                    <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '10px', marginTop: '6px' }}>
                      <label style={{
                        display: 'flex',
                        alignItems: 'center',
                        gap: '10px',
                        padding: '10px 14px',
                        borderRadius: '8px',
                        border: '1px solid',
                        borderColor: modType === 'fish' ? '#38bdf8' : 'rgba(255,255,255,0.12)',
                        background: modType === 'fish' ? 'rgba(56, 189, 248, 0.12)' : 'rgba(255,255,255,0.03)',
                        cursor: 'pointer'
                      }}>
                        <input
                          type="radio"
                          name="modType"
                          value="fish"
                          checked={modType === 'fish'}
                          onChange={() => setModType('fish')}
                        />
                        <div>
                          <strong style={{ color: '#38bdf8', display: 'block', fontSize: '0.88rem' }}>🎣 Auto up câu cá</strong>
                          <span style={{ fontSize: '0.72rem', color: '#94a3b8' }}>Chỉ hiện Auto Câu Cá</span>
                        </div>
                      </label>

                      <label style={{
                        display: 'flex',
                        alignItems: 'center',
                        gap: '10px',
                        padding: '10px 14px',
                        borderRadius: '8px',
                        border: '1px solid',
                        borderColor: modType === 'upxu' ? '#c084fc' : 'rgba(255,255,255,0.12)',
                        background: modType === 'upxu' ? 'rgba(168, 85, 247, 0.12)' : 'rgba(255,255,255,0.03)',
                        cursor: 'pointer'
                      }}>
                        <input
                          type="radio"
                          name="modType"
                          value="upxu"
                          checked={modType === 'upxu'}
                          onChange={() => setModType('upxu')}
                        />
                        <div>
                          <strong style={{ color: '#c084fc', display: 'block', fontSize: '0.88rem' }}>💎 Auto Up kim cương</strong>
                          <span style={{ fontSize: '0.72rem', color: '#94a3b8' }}>Hiện Farm, Đào KC, Bán Đá</span>
                        </div>
                      </label>
                    </div>
                  </div>

                  <div className="form-group">
                    <label>Chọn Tệp JAR Game Bản Chạy:</label>
                    <div style={{ display: 'flex', gap: '8px', alignItems: 'center' }}>
                      <select className="form-control" value={gameJar} onChange={e => setGameJar(e.target.value)} style={{ flex: 1 }}>
                        {(availableJars || []).map(j => (
                          <option key={j} value={j}>{j}</option>
                        ))}
                      </select>
                      <label className="btn btn-secondary btn-sm" style={{ cursor: 'pointer', margin: 0, whiteSpace: 'nowrap' }}>
                        📤 Tải .JAR
                        <input type="file" accept=".jar" style={{ display: 'none' }} onChange={handleFileUpload} />
                      </label>
                    </div>
                    {uploadStatus && <small style={{ color: '#34d399', display: 'block', marginTop: '4px' }}>{uploadStatus}</small>}
                  </div>
                </div>

                <div style={{ display: 'flex', justifyContent: 'flex-end', marginTop: '20px', gap: '10px' }}>
                  <button type="button" className="btn btn-secondary" onClick={backToList}>
                    Hủy
                  </button>
                  <button type="submit" className="btn btn-primary" disabled={loading}>
                    {loading ? 'Đang lưu...' : (editingFile ? '💾 Lưu Cập Nhật' : '➕ Thêm File')}
                  </button>
                </div>
              </form>
            </div>
          )}
        </div>

        {/* Footer */}
        <div className="modal-footer" style={{ borderTop: '1px solid rgba(255, 255, 255, 0.08)', padding: '12px 20px', display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
          {viewMode === 'form' ? (
            <button type="button" className="btn btn-outline btn-sm" onClick={backToList}>
              ⬅️ Danh Sách File
            </button>
          ) : <div />}
          <button type="button" className="btn btn-secondary" onClick={onClose}>Đóng</button>
        </div>
      </div>
    </div>
  );
};
