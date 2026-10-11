/**
 * AccountStats Component (Presentation Layer)
 * Renders the 6-metric grid and live sub-status indicators (Farm, Fish, Diamond, SellOre).
 */
function formatNumber(num) {
  if (num === null || num === undefined || isNaN(num)) return '0';
  return Number(num).toLocaleString('vi-VN');
}

window.AccountStats = function AccountStats({ account, stats, autoState, isRunning }) {
  const coins = stats.coins !== undefined && stats.coins !== null ? stats.coins : 0;
  const targetCoins = (stats.targetCoins !== undefined && stats.targetCoins !== null)
    ? stats.targetCoins
    : (account.targetCoins !== undefined ? account.targetCoins : 0);
  const earnedCoins = stats.earnedCoins !== undefined && stats.earnedCoins !== null ? stats.earnedCoins : 0;
  const collectedHearts = stats.collectedHearts !== undefined && stats.collectedHearts !== null ? stats.collectedHearts : 0;
  const startedAt = stats.startedAt && stats.startedAt !== '--' ? stats.startedAt : (isRunning ? 'Hôm nay' : '--');
  const expiresAt = (account.upDays === 0 || stats.expiresAt === 'Vĩnh viễn')
    ? 'Vĩnh viễn'
    : (stats.expiresAt && stats.expiresAt !== '' && stats.expiresAt !== '--' ? stats.expiresAt : (account.upDays > 0 ? `${account.upDays} ngày` : 'Vĩnh viễn'));

  const isAutoRunning = Boolean(autoState.isRunning || (stats.isAutoRunning && stats.autoType));
  const activeAutoType = autoState.autoType || stats.autoType || null;
  const subTask = autoState.subTask || null;

  const isFarmRunning = isAutoRunning && (activeAutoType === 'farm' && !subTask);
  const isDiamondRunning = isAutoRunning && (activeAutoType === 'diamond' || activeAutoType === 'kc');
  const isFishRunning = isAutoRunning && (activeAutoType === 'fish' || activeAutoType === 'cau_ca');
  const isSellOreRunning = isAutoRunning && (activeAutoType === 'sell_ore' || activeAutoType === 'banda' || activeAutoType === 'stone' || subTask === 'sell_ore' || subTask === 'banda');

  return (
    <div className="acc-stats-matrix">
      {/* Box 1: Xu Hiện Có */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="coins" size={12} color="var(--apple-gold)" /> Xu Có
        </span>
        <span className="acc-metric-val coins">{formatNumber(coins)}</span>
      </div>

      {/* Box 2: Xu Up Được */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="trending" size={12} color={Number(earnedCoins) < 0 ? 'var(--apple-red)' : 'var(--apple-green)'} /> Xu Up
        </span>
        <span className="acc-metric-val" style={{ color: Number(earnedCoins) < 0 ? 'var(--apple-red)' : 'var(--apple-green)' }}>
          {formatNumber(earnedCoins)}
        </span>
      </div>

      {/* Box 3: Xu Cần Up */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="target" size={12} color="var(--apple-blue)" /> Mục Tiêu
        </span>
        <span className="acc-metric-val">{targetCoins > 0 ? formatNumber(targetCoins) : 'Không đặt'}</span>
      </div>

      {/* Box 4: Tim Thu Được */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="heart" size={12} color="#ff2d55" /> Tim Thu
        </span>
        <span className="acc-metric-val" style={{ color: '#ff2d55' }}>{formatNumber(collectedHearts)}</span>
      </div>

      {/* Box 5: Ngày Bắt Đầu */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="calendar" size={12} color="var(--text-tertiary)" /> Bắt Đầu
        </span>
        <span className="acc-metric-val">{startedAt}</span>
      </div>

      {/* Box 6: Hạn Up */}
      <div className="acc-metric-cell">
        <span className="acc-metric-label">
          <window.Icon name="clock" size={12} color="var(--text-tertiary)" /> Hạn Up
        </span>
        <span className="acc-metric-val">{expiresAt}</span>
      </div>

      {/* Live Auto metrics sub-panel */}
      {isFarmRunning && (
        <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(50, 215, 75, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(50, 215, 75, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between' }}>
          <span style={{ color: 'var(--apple-green)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
            <window.Icon name="sprout" size={13} /> Auto Farm: {stats.farmingStatus || stats.currentAction || 'Đang chăm sóc'}
          </span>
          <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>
            Chờ thu hoạch: {stats.farmingCountdown || stats.farmingTime || '--:--'}
          </span>
        </div>
      )}

      {isFishRunning && (
        <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(100, 210, 255, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(100, 210, 255, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
          <span style={{ color: 'var(--apple-teal)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '4px', whiteSpace: 'nowrap' }}>
            <window.Icon name="fish" size={13} /> {stats.fishCaught || 0} cá ({stats.sharkCaught || 0} mập)
          </span>
          <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)', whiteSpace: 'nowrap' }}>
            Farm: {stats.farmingCountdown || stats.farmingTime || '--:--'}
          </span>
        </div>
      )}

      {isDiamondRunning && (
        <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(191, 90, 242, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(191, 90, 242, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
          <span style={{ color: 'var(--apple-purple)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '4px', whiteSpace: 'nowrap' }}>
            <window.Icon name="gem" size={13} /> KCX: {stats.kcx || '+0'} • NHB: {stats.nhb || '+0'}
          </span>
          <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)', whiteSpace: 'nowrap' }}>
            Farm: {stats.farmingCountdown || stats.farmingTime || '--:--'}
          </span>
        </div>
      )}

      {isSellOreRunning && (
        <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(255, 159, 10, 0.08)', padding: '6px 10px', borderRadius: '0', border: '1px solid rgba(255, 159, 10, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', gap: '6px' }}>
          <span style={{ color: 'var(--apple-orange)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
            <window.Icon name="rock" size={13} /> Auto Bán Đá: Khu {stats.currentZone || 0}
          </span>
          <span style={{ fontSize: '0.72rem', color: 'var(--apple-orange)', fontWeight: 600, background: 'rgba(255, 159, 10, 0.12)', padding: '2px 6px', borderRadius: '0' }}>
            Chờ bán: {stats.sellOreTime || '--:--'}
          </span>
        </div>
      )}

      {isAutoRunning && !isFishRunning && !isDiamondRunning && !isSellOreRunning && !isFarmRunning && (
        <div className="acc-metric-cell" style={{ gridColumn: '1 / -1', background: 'rgba(10, 132, 255, 0.08)', padding: '6px 10px', borderRadius: '6px', border: '1px solid rgba(10, 132, 255, 0.2)', display: 'flex', flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between' }}>
          <span style={{ color: 'var(--apple-blue)', fontWeight: 600, fontSize: '0.74rem', display: 'flex', alignItems: 'center', gap: '5px' }}>
            <window.Icon name="zap" size={13} /> Auto: {autoState.autoType || 'Đang chạy'}
          </span>
          <span style={{ fontSize: '0.72rem', color: 'var(--text-secondary)' }}>
            {autoState.message || stats.autoStatus || 'Hoạt động'}
          </span>
        </div>
      )}
    </div>
  );
};
