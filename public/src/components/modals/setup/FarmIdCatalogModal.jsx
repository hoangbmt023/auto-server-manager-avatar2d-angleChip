/**
 * FarmIdCatalogModal Component
 * Searchable & Categorized ID Catalog Picker for Avatar Farm items (Cây trồng, Nông sản, Món ăn, Vật nuôi).
 */
window.FarmIdCatalogModal = function FarmIdCatalogModal({
  targetFieldName,
  targetLabel,
  currentValue,
  initialCategory = 'all',
  onSelect,
  onSetAll,
  onClose
}) {
  const [search, setSearch] = React.useState('');
  const [category, setCategory] = React.useState(initialCategory || 'all');

  React.useEffect(() => {
    if (initialCategory) {
      setCategory(initialCategory);
    }
  }, [initialCategory]);

  const allItems = window.AVATAR_FARM_ITEMS || [];
  const filteredItems = allItems.filter(item => {
    if (category !== 'all' && item.category !== category) return false;
    if (!search.trim()) return true;
    const q = search.toLowerCase().trim();
    return String(item.id).includes(q) || item.name.toLowerCase().includes(q);
  });

  return (
    <div className="center-modal-overlay" style={{ zIndex: 10005 }} onClick={onClose}>
      <div className="center-modal-card" style={{ maxWidth: '680px', maxHeight: '85vh' }} onClick={(e) => e.stopPropagation()}>
        
        {/* Header */}
        <div className="center-modal-header">
          <div className="center-modal-title">
            📚 Tra Cứu & Chọn Nhanh ID Vật Phẩm Nông Trại
          </div>
          <button type="button" className="center-modal-close" onClick={onClose}>✕</button>
        </div>

        {/* Body */}
        <div className="center-modal-body" style={{ display: 'flex', flexDirection: 'column', gap: '12px' }}>
          
          {/* Search bar */}
          <div className="catalog-search-bar">
            <input
              type="text"
              className="catalog-search-input"
              placeholder="🔍 Nhập tên hoặc ID để tìm (VD: 6, lúa, xoài, cà chua, cơm, bánh trứng...)"
              value={search}
              onChange={(e) => setSearch(e.target.value)}
              autoFocus
            />
            {targetFieldName === 'sellProducts' && onSetAll && (
              <button
                type="button"
                className="btn btn-sm btn-secondary"
                onClick={() => {
                  onSetAll();
                  onClose();
                }}
                title="Bán tất cả nông sản trong kho"
              >
                Bán Tất Cả (-1)
              </button>
            )}
          </div>

          {/* Category tabs */}
          <div className="catalog-cat-tabs">
            {(window.FARM_CATEGORIES || []).map(cat => (
              <button
                key={cat.key}
                type="button"
                className={`catalog-cat-tab ${category === cat.key ? 'active' : ''}`}
                onClick={() => setCategory(cat.key)}
              >
                {cat.label}
              </button>
            ))}
          </div>

          {/* Items Grid */}
          <div className="catalog-items-grid">
            {filteredItems.map(item => (
              <div
                key={`${item.category}_${item.id}`}
                className="catalog-item-card"
                onClick={() => onSelect(item)}
                title={`Nhấn để thêm ID ${item.id} (${item.name})`}
              >
                <div className="catalog-item-icon">{item.icon || '📦'}</div>
                <div className="catalog-item-info">
                  <div className="catalog-item-name">{item.name}</div>
                  <div className="catalog-item-meta">
                    <span className="catalog-item-id-badge">ID: {item.id}</span>
                    {item.time && <span>⏳ {item.time}</span>}
                    {item.yield && <span>📦 +{item.yield}</span>}
                  </div>
                </div>
              </div>
            ))}
            {filteredItems.length === 0 && (
              <div style={{ gridColumn: '1 / -1', textAlign: 'center', padding: '30px', color: 'var(--text-muted)' }}>
                Không tìm thấy vật phẩm nào khớp với từ khóa "{search}"
              </div>
            )}
          </div>

          {/* Footer inside catalog */}
          <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', paddingTop: '10px', borderTop: '1px solid rgba(255,255,255,0.08)' }}>
            <span style={{ fontSize: '0.82rem', color: 'var(--text-muted)' }}>
              Đang chọn cho: <strong>{targetLabel}</strong>
              {currentValue ? ` (Hiện tại: ${currentValue})` : ''}
            </span>
            <button
              type="button"
              className="btn btn-sm btn-primary"
              onClick={onClose}
            >
              ✅ Hoàn Tất
            </button>
          </div>
        </div>

      </div>
    </div>
  );
};
