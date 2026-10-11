/**
 * useCapacityLimits (Application Layer Hook)
 * Computes slot limits, server quotas (HM 3/3, DK 3/3), and expired proxy warnings.
 */
window.useCapacityLimits = function useCapacityLimits(accounts, fileAccounts, proxies, activeFile) {
  const { useMemo } = React;

  return useMemo(() => {
    const totalIps = 1 + (proxies || []).length;
    const maxHmTotal = totalIps * 3;
    const maxDkTotal = totalIps * 3;
    const maxAccountsTotal = totalIps * 6;

    const fileMaxAccounts = activeFile?.maxAccounts || 6;
    const fileMaxHm = Math.ceil(fileMaxAccounts / 2);
    const fileMaxDk = Math.floor(fileMaxAccounts / 2);

    const totalHmCount = (fileAccounts || []).filter(
      a => a.serverId === 0 || a.serverId === undefined || a.serverId === null
    ).length;
    const totalDkCount = (fileAccounts || []).filter(a => a.serverId === 1).length;

    const expiredProxies = (proxies || []).filter(p => p.isExpired);

    const getSlotCapacity = (slotId) => {
      if (slotId === 'all') {
        const fileRunning = (fileAccounts || []).filter(a => a.isRunning).length;
        const globalRunning = (accounts || []).filter(a => a.isRunning).length;
        const serverRemaining = Math.max(0, maxAccountsTotal - globalRunning);
        return {
          label: 'Tất cả IP',
          fileTotal: (fileAccounts || []).length,
          fileRunning,
          globalRunning,
          serverRemaining,
          badgeCount: `${fileRunning}/${serverRemaining}`
        };
      }

      if (slotId === 'direct') {
        const directFileAccs = (fileAccounts || []).filter(a => !a.proxyId || a.proxyId === '');
        const directFileRunning = directFileAccs.filter(a => a.isRunning).length;
        const directGlobalRunning = (accounts || []).filter(a => (!a.proxyId || a.proxyId === '') && a.isRunning).length;
        const directRemaining = Math.max(0, 6 - directGlobalRunning);
        const directHm = directFileAccs.filter(a => a.serverId === 0 || a.serverId === undefined || a.serverId === null).length;
        const directDk = directFileAccs.filter(a => a.serverId === 1).length;

        return {
          label: 'IP Mặc định',
          fileTotal: directFileAccs.length,
          fileRunning: directFileRunning,
          globalRunning: directGlobalRunning,
          serverRemaining: directRemaining,
          directHm,
          directDk,
          badgeCount: `${directFileRunning}/${directRemaining}`
        };
      }

      const p = (proxies || []).find(x => x.id === slotId);
      const pAccs = (fileAccounts || []).filter(a => a.proxyId === slotId);
      const pFileRunning = pAccs.filter(a => a.isRunning).length;
      const pGlobalRunning = (accounts || []).filter(a => a.proxyId === slotId && a.isRunning).length;
      const pRemaining = Math.max(0, 6 - pGlobalRunning);
      const pHm = pAccs.filter(a => a.serverId === 0 || a.serverId === undefined || a.serverId === null).length;
      const pDk = pAccs.filter(a => a.serverId === 1).length;

      return {
        label: p ? p.name : 'Tab Proxy',
        proxy: p,
        fileTotal: pAccs.length,
        fileRunning: pFileRunning,
        globalRunning: pGlobalRunning,
        serverRemaining: pRemaining,
        pHm,
        pDk,
        badgeCount: `${pFileRunning}/${pRemaining}`
      };
    };

    return {
      totalIps,
      maxHmTotal,
      maxDkTotal,
      maxAccountsTotal,
      fileMaxAccounts,
      fileMaxHm,
      fileMaxDk,
      totalHmCount,
      totalDkCount,
      expiredProxies,
      getSlotCapacity
    };
  }, [accounts, fileAccounts, proxies, activeFile]);
};
