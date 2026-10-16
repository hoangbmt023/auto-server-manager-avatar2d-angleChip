/**
 * TransactionHistoryModal Component (Presentation Layer)
 * Combined Transaction & Top-up History with Modern Infinite Scroll & Pagination:
 * - Fetches initial 15 latest transactions.
 * - Infinite scroll: automatically fetches next 15 items when scrolling to the bottom.
 * - Circular spinner for initial and incremental loading (reusable helper).
 * - Real-time type filter calling API: ALL, TOPUP, RENTAL/RENEWAL with race condition guard.
 * - Clock icon for history instead of coins.
 * - Adheres strictly to CSS classes, zero inline styles.
 */

// Reusable Circular Spinner Component (can be used as block or inline inside buttons)
function CircularSpinner({ size = 'md', text = '', inline = false }) {
  if (inline) {
    return (
      <span className="tx-spinner-inline-wrap">
        <span className={`tx-spinner-circular ${size}`} />
        {text && <span className="tx-spinner-text">{text}</span>}
      </span>
    );
  }
  return (
    <div className={`tx-loading-box ${size === 'sm' ? 'tx-loading-box-sm' : ''}`}>
      <div className={`tx-spinner-circular ${size}`} />
      {text && <span className="tx-loading-text">{text}</span>}
    </div>
  );
}
window.CircularSpinner = CircularSpinner;

window.TransactionHistoryModal = function TransactionHistoryModal({
  onClose,
  currentBalance = 0
}) {
  const [transactions, setTransactions] = React.useState([]);
  const [page, setPage] = React.useState(1);
  const [hasMore, setHasMore] = React.useState(true);
  const [loading, setLoading] = React.useState(true);
  const [loadingMore, setLoadingMore] = React.useState(false);
  const [filterType, setFilterType] = React.useState('ALL');

  const scrollContainerRef = React.useRef(null);
  const requestIdRef = React.useRef(0);
  const { formatMoney, formatDateTime } = window.formatters;

  // Unified fetch function for initial load, filter change, and infinite scroll
  const fetchPage = React.useCallback(async (targetPage, currentFilter, isAppend = false) => {
    const currentRequestId = ++requestIdRef.current;

    if (isAppend) {
      setLoadingMore(true);
    } else {
      setLoading(true);
    }

    try {
      if (window.billingService) {
        const res = await window.billingService.getTransactions({
          page: targetPage,
          limit: 15,
          type: currentFilter
        });

        // Guard against race conditions from rapid tab switching
        if (currentRequestId !== requestIdRef.current) {
          return;
        }

        if (res && res.data) {
          const newItems = Array.isArray(res.data) ? res.data : (res.data.items || []);
          const pagination = res.data.pagination || {};
          const moreAvailable = pagination.hasMore !== undefined
            ? Boolean(pagination.hasMore)
            : newItems.length === 15;

          if (isAppend) {
            setTransactions(prev => {
              // Avoid duplicate IDs if concurrent or overlapping requests
              const existingIds = new Set(prev.map(item => item.id));
              const filteredNew = newItems.filter(item => !existingIds.has(item.id));
              return [...prev, ...filteredNew];
            });
          } else {
            setTransactions(newItems);
          }

          setPage(targetPage);
          setHasMore(moreAvailable);
        }
      }
    } catch (e) {
      console.error('Lỗi khi tải lịch sử giao dịch:', e);
    } finally {
      if (currentRequestId === requestIdRef.current) {
        if (isAppend) {
          setLoadingMore(false);
        } else {
          setLoading(false);
        }
      }
    }
  }, []);

  // Initial load
  React.useEffect(() => {
    fetchPage(1, 'ALL', false);
  }, [fetchPage]);

  // Tab filter switch with smooth transition and race-condition immunity
  const handleFilterChange = (newType) => {
    if (filterType === newType || loading) return;
    setFilterType(newType);
    setPage(1);
    setHasMore(true);
    if (scrollContainerRef.current) {
      scrollContainerRef.current.scrollTop = 0;
    }
    fetchPage(1, newType, false);
  };

  // Infinite scroll trigger when reaching near bottom of list
  const handleScroll = React.useCallback((e) => {
    const container = e.currentTarget;
    const distanceToBottom = container.scrollHeight - container.scrollTop - container.clientHeight;

    if (distanceToBottom < 60) {
      if (!loading && !loadingMore && hasMore) {
        fetchPage(page + 1, filterType, true);
      }
    }
  }, [loading, loadingMore, hasMore, page, filterType, fetchPage]);

  const getTypeBadge = (type) => {
    switch (type) {
      case 'TOPUP':
        return { label: 'Nạp Tiền', className: 'tx-status-badge tx-type-topup' };
      case 'RENTAL':
        return { label: 'Thuê Bot', className: 'tx-status-badge tx-type-rental' };
      case 'RENEWAL':
        return { label: 'Gia Hạn', className: 'tx-status-badge tx-type-renewal' };
      case 'REFUND':
        return { label: 'Hoàn Tiền', className: 'tx-status-badge tx-type-refund' };
      default:
        return { label: type, className: 'tx-status-badge tx-status-cancelled' };
    }
  };

  const getStatusBadge = (status) => {
    const s = String(status || 'SUCCESS').toUpperCase();
    switch (s) {
      case 'SUCCESS':
        return { label: 'Thành công', className: 'tx-status-badge tx-status-success' };
      case 'PENDING':
        return { label: 'Chờ xử lý', className: 'tx-status-badge tx-status-pending' };
      case 'FAILED':
        return { label: 'Thất bại', className: 'tx-status-badge tx-status-failed' };
      case 'CANCELLED':
        return { label: 'Đã hủy', className: 'tx-status-badge tx-status-cancelled' };
      default:
        return { label: s, className: 'tx-status-badge tx-status-cancelled' };
    }
  };

  return (
    <window.ModalBase
      title="Lịch Sử Nạp Tiền & Giao Dịch"
      subtitle={
        <span className="tx-modal-subtitle-text">
          Số dư khả dụng: <strong className="tx-balance-val">{formatMoney(currentBalance)} đ</strong>
        </span>
      }
      icon="clock"
      iconColor="var(--apple-blue)"
      size="xl"
      className="tx-history-modal-dialog"
      onClose={onClose}
    >
      {/* Filter toolbar: 3 buttons matching topup button dimensions, without + Nạp tiền */}
      <div className="tx-modal-toolbar">
        <div className="tx-filter-bar">
          <button
            type="button"
            className={`btn ${filterType === 'ALL' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => handleFilterChange('ALL')}
          >
            Tất Cả
          </button>
          <button
            type="button"
            className={`btn ${filterType === 'TOPUP' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => handleFilterChange('TOPUP')}
          >
            Nạp Tiền
          </button>
          <button
            type="button"
            className={`btn ${filterType === 'RENTAL' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => handleFilterChange('RENTAL')}
          >
            Thuê & Gia Hạn
          </button>
        </div>
      </div>

      {/* Content area with stable min-height and infinite scroll */}
      <div
        className="tx-modal-body-content"
        ref={scrollContainerRef}
        onScroll={handleScroll}
      >
        {loading ? (
          <CircularSpinner size="md" text="Đang tải lịch sử giao dịch..." />
        ) : transactions.length === 0 ? (
          <div className="tx-empty-box">
            <window.Icon name="clock" size={36} color="var(--glass-border-subtle)" />
            <p className="tx-empty-text">Chưa có giao dịch nào!</p>
          </div>
        ) : (
          <>
            <div className="table-responsive tx-table-container">
              <table className="tx-table">
                <thead>
                  <tr className="tx-th-row">
                    <th className="tx-th-cell">Thời Gian</th>
                    <th className="tx-th-cell">Loại GD</th>
                    <th className="tx-th-cell">Trạng Thái</th>
                    <th className="tx-th-cell">Nội Dung</th>
                    <th className="tx-th-cell-right">Số Tiền</th>
                    <th className="tx-th-cell-right">Số Dư Sau GD</th>
                  </tr>
                </thead>
                <tbody>
                  {transactions.map(t => {
                    const typeBadge = getTypeBadge(t.type);
                    const statusBadge = getStatusBadge(t.status);
                    const isPositive = t.amount > 0;
                    const dateStr = formatDateTime(t.createdAt);
                    return (
                      <tr key={t.id} className="tx-tr-row">
                        <td className="tx-td-time">{dateStr}</td>
                        <td className="tx-td-type">
                          <span className={typeBadge.className}>{typeBadge.label}</span>
                        </td>
                        <td className="tx-td-status">
                          <span className={statusBadge.className}>{statusBadge.label}</span>
                        </td>
                        <td className="tx-td-desc">
                          <div className="tx-desc-text">{t.description || 'Giao dịch hệ thống'}</div>
                          {t.voucherCode && (
                            <span className="tx-voucher-badge">
                              Mã voucher: {t.voucherCode}
                            </span>
                          )}
                        </td>
                        <td className={`tx-td-amount ${isPositive ? 'tx-amount-pos' : 'tx-amount-neg'}`}>
                          {isPositive ? `+${formatMoney(t.amount)}` : formatMoney(t.amount)} đ
                        </td>
                        <td className="tx-td-after">
                          {formatMoney(t.balanceAfter)} đ
                        </td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </div>

            {/* Spinner when loading next page via infinite scroll */}
            {loadingMore && (
              <CircularSpinner size="sm" text="Đang tải thêm 15 giao dịch tiếp theo..." />
            )}

            {/* End of list notification when all transactions have been loaded */}
            {!hasMore && transactions.length > 0 && (
              <div className="tx-end-of-list">
                <span>Đã hiển thị toàn bộ {transactions.length} giao dịch</span>
              </div>
            )}
          </>
        )}
      </div>
    </window.ModalBase>
  );
};
