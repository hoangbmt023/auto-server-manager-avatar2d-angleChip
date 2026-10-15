/**
 * TransactionHistoryModal Component (Presentation Layer)
 * Combined Transaction & Top-up History:
 * Displays all balance movements (Top-ups, Slot Rentals, Renewals) in a unified, modern table.
 */
window.TransactionHistoryModal = function TransactionHistoryModal({
  onClose,
  currentBalance = 0,
  onOpenTopup
}) {
  const [transactions, setTransactions] = React.useState([]);
  const [loading, setLoading] = React.useState(true);
  const [filterType, setFilterType] = React.useState('ALL');

  const formatMoney = (val) => Number(val || 0).toLocaleString('vi-VN');

  const fetchTransactions = React.useCallback(async () => {
    setLoading(true);
    try {
      if (window.billingService) {
        const res = await window.billingService.getTransactions();
        if (res && res.data) {
          setTransactions(res.data);
        }
      }
    } catch (e) {
    } finally {
      setLoading(false);
    }
  }, []);

  React.useEffect(() => {
    fetchTransactions();
  }, [fetchTransactions]);

  const filteredList = transactions.filter(t => {
    if (filterType === 'ALL') return true;
    if (filterType === 'TOPUP') return t.type === 'TOPUP';
    if (filterType === 'RENTAL') return t.type === 'RENTAL' || t.type === 'RENEWAL';
    return true;
  });

  const getTypeBadge = (type) => {
    switch (type) {
      case 'TOPUP':
        return { label: 'Nạp Tiền', color: 'var(--apple-green)', bg: 'rgba(48, 209, 88, 0.12)' };
      case 'RENTAL':
        return { label: 'Thuê Bot', color: 'var(--apple-blue)', bg: 'rgba(10, 132, 255, 0.12)' };
      case 'RENEWAL':
        return { label: 'Gia Hạn', color: 'var(--apple-purple)', bg: 'rgba(191, 90, 242, 0.12)' };
      case 'REFUND':
        return { label: 'Hoàn Tiền', color: 'var(--apple-gold)', bg: 'rgba(255, 214, 10, 0.12)' };
      default:
        return { label: type, color: 'var(--text-secondary)', bg: 'var(--glass-bg)' };
    }
  };

  return (
    <div className="modal-overlay" onClick={(e) => { if (e.target === e.currentTarget) onClose(); }}>
      <div className="modal-card tx-history-modal" style={{ maxWidth: '780px', width: '94%' }}>
        {/* Header */}
        <div className="modal-header">
          <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
            <div className="sidebar-icon-box" style={{ background: 'rgba(255, 214, 10, 0.15)', color: 'var(--apple-gold)' }}>
              <window.Icon name="coins" size={20} />
            </div>
            <div>
              <h3 style={{ margin: 0, fontSize: '1.12rem' }}>Lịch Sử Nạp Tiền & Giao Dịch</h3>
              <span style={{ fontSize: '0.78rem', color: 'var(--text-tertiary)' }}>
                Số dư hiện tại: <strong style={{ color: 'var(--apple-gold)' }}>{formatMoney(currentBalance)} đ</strong>
              </span>
            </div>
          </div>
          <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
            {onOpenTopup && (
              <button
                type="button"
                className="btn btn-primary btn-xs"
                onClick={() => { onClose(); onOpenTopup(); }}
              >
                + Nạp Tiền
              </button>
            )}
            <button type="button" className="modal-close-btn" onClick={onClose}>
              <window.Icon name="x" size={16} />
            </button>
          </div>
        </div>

        {/* Filter Pills */}
        <div style={{ display: 'flex', gap: '8px', padding: '12px 20px 0', borderBottom: '1px solid var(--glass-border-subtle)' }}>
          <button
            type="button"
            className={`btn btn-xs ${filterType === 'ALL' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => setFilterType('ALL')}
          >
            Tất Cả ({transactions.length})
          </button>
          <button
            type="button"
            className={`btn btn-xs ${filterType === 'TOPUP' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => setFilterType('TOPUP')}
          >
            Nạp Tiền
          </button>
          <button
            type="button"
            className={`btn btn-xs ${filterType === 'RENTAL' ? 'btn-primary' : 'btn-secondary'}`}
            onClick={() => setFilterType('RENTAL')}
          >
            Thuê & Gia Hạn
          </button>
        </div>

        {/* Content Body */}
        <div style={{ padding: '16px 20px', maxHeight: '420px', overflowY: 'auto' }}>
          {loading ? (
            <div style={{ padding: '36px', textAlign: 'center', color: 'var(--text-tertiary)' }}>
              Đang tải lịch sử giao dịch...
            </div>
          ) : filteredList.length === 0 ? (
            <div style={{ padding: '40px 20px', textAlign: 'center', color: 'var(--text-tertiary)' }}>
              <window.Icon name="coins" size={32} color="var(--glass-border-subtle)" />
              <p style={{ marginTop: '8px', fontSize: '0.9rem' }}>Chưa có giao dịch nào!</p>
            </div>
          ) : (
            <div className="table-responsive">
              <table style={{ width: '100%', borderCollapse: 'collapse', fontSize: '0.82rem' }}>
                <thead>
                  <tr style={{ borderBottom: '1px solid var(--glass-border-subtle)', color: 'var(--text-tertiary)', textAlign: 'left' }}>
                    <th style={{ padding: '8px 10px' }}>Thời Gian</th>
                    <th style={{ padding: '8px 10px' }}>Loại</th>
                    <th style={{ padding: '8px 10px' }}>Nội Dung</th>
                    <th style={{ padding: '8px 10px', textAlign: 'right' }}>Số Tiền</th>
                    <th style={{ padding: '8px 10px', textAlign: 'right' }}>Số Dư Sau GD</th>
                  </tr>
                </thead>
                <tbody>
                  {filteredList.map(t => {
                    const badge = getTypeBadge(t.type);
                    const isPositive = t.amount > 0;
                    const dateStr = t.createdAt ? new Date(t.createdAt).toLocaleString('vi-VN') : '—';
                    return (
                      <tr key={t.id} style={{ borderBottom: '1px solid var(--glass-border-subtle)' }}>
                        <td style={{ padding: '10px', color: 'var(--text-tertiary)', whiteSpace: 'nowrap' }}>
                          {dateStr}
                        </td>
                        <td style={{ padding: '10px' }}>
                          <span style={{
                            padding: '2px 8px',
                            borderRadius: '999px',
                            fontSize: '0.72rem',
                            fontWeight: 600,
                            color: badge.color,
                            background: badge.bg
                          }}>
                            {badge.label}
                          </span>
                        </td>
                        <td style={{ padding: '10px', color: 'var(--text-primary)', maxWidth: '240px' }}>
                          <div>{t.description || 'Giao dịch hệ thống'}</div>
                          {t.voucherCode && (
                            <span style={{ fontSize: '0.68rem', color: 'var(--apple-green)' }}>
                              Voucher: {t.voucherCode}
                            </span>
                          )}
                        </td>
                        <td style={{ padding: '10px', textAlign: 'right', fontWeight: 700, color: isPositive ? 'var(--apple-green)' : 'var(--text-primary)' }}>
                          {isPositive ? `+${formatMoney(t.amount)}` : formatMoney(t.amount)} đ
                        </td>
                        <td style={{ padding: '10px', textAlign: 'right', color: 'var(--text-secondary)' }}>
                          {formatMoney(t.balanceAfter)} đ
                        </td>
                      </tr>
                    );
                  })}
                </tbody>
              </table>
            </div>
          )}
        </div>
      </div>
    </div>
  );
};
