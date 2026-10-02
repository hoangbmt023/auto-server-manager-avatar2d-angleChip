/**
 * ServerLimitBanner Component (Presentation Layer)
 * Real-time active online indicators for Hoàn Mỹ (x/3), Diệu Kỳ (y/3), and Total (z/6).
 */
window.ServerLimitBanner = function ServerLimitBanner({ runningHm, runningDk, runningTotal }) {
  return (
    <div className="server-limit-banner">
      <div className="limit-stat-item">
        <span className="limit-label">🟢 Đang Treo Hoàn Mỹ:</span>
        <span className={`limit-val ${runningHm > 0 ? 'limit-active' : ''}`}>
          {runningHm}/3
        </span>
      </div>
      <div className="limit-stat-item">
        <span className="limit-label">🟢 Đang Treo Diệu Kỳ:</span>
        <span className={`limit-val ${runningDk > 0 ? 'limit-active' : ''}`}>
          {runningDk}/3
        </span>
      </div>
      <div className="limit-stat-item">
        <span className="limit-label">📊 Tổng Nick Đang Treo:</span>
        <span className={`limit-val ${runningTotal > 0 ? 'limit-active' : ''}`}>
          {runningTotal}/6
        </span>
      </div>
    </div>
  );
};
