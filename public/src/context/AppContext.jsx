/**
 * AppContext (State Management Layer)
 * Manages core bot state, synchronized accounts, files, proxies, and actions.
 */
const { createContext, useContext, useState, useEffect, useRef, useMemo, useCallback } = React;

const AppContext = createContext(null);

function formatUptime(seconds) {
  const h = Math.floor(seconds / 3600).toString().padStart(2, '0');
  const m = Math.floor((seconds % 3600) / 60).toString().padStart(2, '0');
  const s = Math.floor(seconds % 60).toString().padStart(2, '0');
  return `${h}:${m}:${s}`;
}

window.AppProvider = function AppProvider({ children }) {
  const [status, setStatus] = useState(null);
  const [files, setFiles] = useState([]);
  const [proxies, setProxies] = useState([]);
  const [activeFileId, setActiveFileId] = useState('file_1');
  const [accounts, setAccounts] = useState([]);
  const [logs, setLogs] = useState([]);
  const [logFilter, setLogFilter] = useState('all');
  const [autoScroll, setAutoScroll] = useState(true);
  const [uptime, setUptime] = useState(0);
  const [availableJars, setAvailableJars] = useState(['avatar_fish_build40.jar']);
  const [theme, setTheme] = useState(() => localStorage.getItem('app_theme') || 'dark');

  const sseRef = useRef(null);
  const terminalRef = useRef(null);

  // Theme Sync
  useEffect(() => {
    document.documentElement.setAttribute('data-theme', theme);
    localStorage.setItem('app_theme', theme);
  }, [theme]);

  const toggleTheme = useCallback(() => {
    setTheme(prev => (prev === 'dark' ? 'light' : 'dark'));
  }, []);

  // Fetchers
  const fetchStatus = useCallback(async () => {
    try {
      const data = await window.ApiClient.getStatus();
      if (data.success) {
        setStatus(data);
        setActiveFileId(prev => (prev ? prev : (data.activeFileId || 'file_1')));
      }
    } catch (e) {}
  }, []);

  const fetchFiles = useCallback(async () => {
    try {
      const data = await window.ApiClient.getFiles();
      if (data.success) {
        setFiles(data.files || []);
        setActiveFileId(prev => (prev ? prev : (data.activeFileId || (data.files && data.files[0] ? data.files[0].id : 'file_1'))));
      }
    } catch (e) {}
  }, []);

  const fetchProxies = useCallback(async () => {
    try {
      const data = await window.ApiClient.getProxies();
      if (data.success) {
        setProxies(data.proxies || []);
      }
    } catch (e) {}
  }, []);

  const fetchAccounts = useCallback(async () => {
    try {
      const data = await window.ApiClient.getAccounts();
      if (data.success) {
        setAccounts(data.accounts || []);
      }
    } catch (e) {}
  }, []);

  const fetchJars = useCallback(async () => {
    try {
      const data = await window.ApiClient.getAvailableJars();
      if (data.success) setAvailableJars(data.jars || []);
    } catch (e) {}
  }, []);

  const fetchLogs = useCallback(async () => {
    try {
      const data = await window.ApiClient.getLogs();
      if (data.success) setLogs(data.logs || []);
    } catch (e) {}
  }, []);

  // SSE Stream & Synchronization
  useEffect(() => {
    fetchStatus();
    fetchFiles();
    fetchProxies();
    fetchAccounts();
    fetchLogs();
    fetchJars();

    const connectSSE = () => {
      if (sseRef.current) sseRef.current.close();
      const es = new EventSource('/api/events');
      sseRef.current = es;

      es.addEventListener('log', (e) => {
        try {
          const log = JSON.parse(e.data);
          setLogs(prev => [...prev.slice(-999), log]);
        } catch (err) {}
      });

      es.addEventListener('bot-status-changed', () => {
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      });

      es.addEventListener('proxy-status-changed', () => {
        fetchAccounts();
        fetchProxies();
      });

      es.addEventListener('bot-stats', (e) => {
        try {
          const payload = JSON.parse(e.data);
          if (payload && payload.accountId && payload.stats) {
            setAccounts(prev => prev.map(acc => {
              if (acc.id === payload.accountId) {
                return { ...acc, stats: { ...acc.stats, ...payload.stats } };
              }
              return acc;
            }));
          }
        } catch (err) {}
      });

      es.addEventListener('bot-account-status', (e) => {
        try {
          const payload = JSON.parse(e.data);
          if (payload && payload.accountId && payload.state) {
            setAccounts(prev => prev.map(acc => {
              if (acc.id === payload.accountId) {
                return { ...acc, accountState: payload.state };
              }
              return acc;
            }));
          }
        } catch (err) {}
      });

      es.addEventListener('bot-auto-status', (e) => {
        try {
          const payload = JSON.parse(e.data);
          if (payload && payload.accountId && payload.autoState) {
            setAccounts(prev => prev.map(acc => {
              if (acc.id === payload.accountId) {
                return { ...acc, autoState: payload.autoState };
              }
              return acc;
            }));
          }
        } catch (err) {}
      });

      es.addEventListener('clear-logs', () => {
        setLogs([]);
      });

      es.addEventListener('jre_progress', (e) => {
        try {
          const p = JSON.parse(e.data);
          if (window.__setJreProgress) {
            window.__setJreProgress({ visible: true, percent: p.percent || 0, message: p.message || '' });
          }
          if (p.ready) {
            setTimeout(() => {
              if (window.__setJreProgress) {
                window.__setJreProgress(prev => ({ ...prev, visible: false }));
              }
              fetchStatus();
            }, 2000);
          }
        } catch (err) {}
      });

      es.onerror = () => {
        es.close();
        setTimeout(connectSSE, 4000);
      };
    };

    connectSSE();

    // Chỉ đồng bộ dự phòng 60s/lần vì hệ thống đã có Server-Sent Events (SSE) thời gian thực
    const syncInterval = setInterval(() => {
      fetchStatus();
      fetchAccounts();
    }, 60000);

    const onVisibilityChange = () => {
      if (document.visibilityState === 'visible') {
        fetchStatus();
        fetchAccounts();
        fetchProxies();
        fetchFiles();
        fetchLogs();
      }
    };
    document.addEventListener('visibilitychange', onVisibilityChange);

    return () => {
      if (sseRef.current) sseRef.current.close();
      clearInterval(syncInterval);
      document.removeEventListener('visibilitychange', onVisibilityChange);
    };
  }, [fetchStatus, fetchFiles, fetchProxies, fetchAccounts, fetchLogs, fetchJars]);

  // Terminal Auto Scroll
  useEffect(() => {
    if (autoScroll && terminalRef.current) {
      terminalRef.current.scrollTop = terminalRef.current.scrollHeight;
    }
  }, [logs, autoScroll]);

  // Uptime Tick
  const isAnyRunning = Boolean(status?.bot?.runningCount > 0 || status?.bot?.running);
  useEffect(() => {
    let interval = null;
    if (isAnyRunning) {
      interval = setInterval(() => setUptime(u => u + 1), 1000);
    } else {
      setUptime(0);
    }
    return () => {
      if (interval) clearInterval(interval);
    };
  }, [isAnyRunning]);

  // Computations
  const activeFile = useMemo(() => {
    return files.find(f => f.id === activeFileId) || files[0] || null;
  }, [files, activeFileId]);

  const fileAccounts = useMemo(() => {
    return accounts.filter(a => (a.fileId || 'file_1') === activeFileId);
  }, [accounts, activeFileId]);

  const filteredLogs = useMemo(() => {
    if (!logFilter || logFilter === 'all') return logs;
    return logs.filter(l => l.username === logFilter || (l.text && l.text.includes(`[${logFilter}]`)));
  }, [logs, logFilter]);

  const runningHm = useMemo(() => {
    return fileAccounts.filter(a => a.isRunning && parseInt(a.serverId, 10) === 0).length;
  }, [fileAccounts]);

  const runningDk = useMemo(() => {
    return fileAccounts.filter(a => a.isRunning && parseInt(a.serverId, 10) === 1).length;
  }, [fileAccounts]);

  const runningTotal = runningHm + runningDk;

  // Actions
  const handleStartAccount = async (id) => {
    try {
      const data = await window.ApiClient.startAccount(id);
      if (!data.success && window.showAlert) window.showAlert(data.message || 'Lỗi khởi chạy nick', 'Lỗi Khởi Chạy', 'error');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStopAccount = async (id, username) => {
    if (!window.showConfirm) return;
    window.showConfirm(`Dừng treo tài khoản [${username}]?`, async () => {
      try {
        const data = await window.ApiClient.stopAccount(id);
        if (!data.success && window.showAlert) window.showAlert(data.message || 'Lỗi dừng nick', 'Lỗi', 'error');
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleTriggerAuto = async (id, autoType = 'farm', action = 'start', maybeAction) => {
    let finalAutoType = autoType;
    let finalAction = action;

    // Phòng thủ nếu caller truyền dạng (id, username, autoType, action)
    if (maybeAction !== undefined) {
      finalAutoType = action;
      finalAction = maybeAction;
    }

    try {
      const data = await window.ApiClient.triggerAuto(id, finalAutoType, finalAction);
      if (!data.success && window.showAlert) {
        window.showAlert(data.message || 'Lỗi thực hiện lệnh Auto', 'Lỗi Auto', 'error');
      }
      fetchAccounts();
      fetchStatus();
    } catch (err) {
      if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStartAllFile = async () => {
    try {
      const data = await window.ApiClient.startAllFile();
      if (!data.success && window.showAlert) window.showAlert(data.message || 'Lỗi chạy bot', 'Lỗi Khởi Chạy', 'error');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStopAll = async () => {
    if (!window.showConfirm) return;
    window.showConfirm('Dừng toàn bộ bot đang chạy?', async () => {
      try {
        const data = await window.ApiClient.stopAll();
        if (!data.success && window.showAlert) window.showAlert(data.message || 'Lỗi dừng tất cả bot', 'Lỗi', 'error');
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleRestartAll = async () => {
    if (!window.showConfirm) return;
    window.showConfirm('Khởi động lại toàn bộ bot?', async () => {
      try {
        const data = await window.ApiClient.restartAll();
        if (!data.success && window.showAlert) window.showAlert(data.message || 'Lỗi khởi động lại', 'Lỗi Khởi Động Lại', 'error');
        setTimeout(() => {
          fetchAccounts();
          fetchStatus();
          fetchFiles();
          fetchProxies();
        }, 1800);
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSwitchServer = async (id, username, currentServerId) => {
    const newServerId = currentServerId === 0 ? 1 : 0;
    const newServerName = newServerId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    if (!window.showConfirm) return;
    window.showConfirm(`Chuyển tài khoản [${username}] sang Server [${newServerName}]?`, async () => {
      try {
        const data = await window.ApiClient.switchAccountServer(id, newServerId);
        if (data.success) {
          fetchAccounts();
          fetchFiles();
          fetchStatus();
        } else if (window.showAlert) {
          window.showAlert(data.message || 'Lỗi đổi server', 'Lỗi Đổi Server', 'error');
        }
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleDeleteAccount = async (id, username) => {
    if (!window.showConfirm) return;
    window.showConfirm(`Bạn có chắc muốn xóa tài khoản [${username}]?`, async () => {
      try {
        const data = await window.ApiClient.deleteAccount(id);
        if (data.success) {
          fetchAccounts();
          fetchFiles();
          fetchProxies();
        } else if (window.showAlert) {
          window.showAlert(data.message || 'Không thể xóa tài khoản', 'Lỗi Xóa Tài Khoản', 'error');
        }
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSwitchFile = (id) => {
    setActiveFileId(id);
    window.ApiClient.switchFile(id).catch(() => {});
  };

  const handleDeleteFile = async (id, name) => {
    if (!window.showConfirm) return;
    window.showConfirm(`Xóa File [${name}] cùng tất cả tài khoản bên trong?`, async () => {
      try {
        const data = await window.ApiClient.deleteFile(id);
        if (data.success) {
          if (window.showAlert) window.showAlert(data.message || `Đã xóa File [${name}] thành công!`, 'Thành Công', 'success');
          fetchFiles();
          fetchAccounts();
          fetchStatus();
          fetchProxies();
        } else if (window.showAlert) {
          window.showAlert(data.message || 'Lỗi xóa file', 'Lỗi Xóa File', 'error');
        }
      } catch (err) {
        if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSaveProxy = async (payload) => {
    try {
      const data = await window.ApiClient.saveProxy(payload);
      if (data.success) {
        fetchProxies();
        return { success: true, message: data.message };
      } else {
        return data || { success: false, message: 'Lỗi lưu Proxy' };
      }
    } catch (err) {
      return { success: false, message: err.message };
    }
  };

  const handleDeleteProxy = async (id) => {
    try {
      const data = await window.ApiClient.deleteProxy(id);
      if (data && data.success) {
        fetchProxies();
        fetchAccounts();
        if (window.showAlert) window.showAlert(data.message || 'Đã xóa Proxy thành công!', 'Thành Công', 'success');
        return data;
      } else {
        if (window.showAlert) window.showAlert(data?.message || 'Lỗi xóa proxy', 'Lỗi Xóa Proxy', 'error');
        return data;
      }
    } catch (err) {
      if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      return { success: false, message: err.message };
    }
  };

  const handleClearLogs = async () => {
    try {
      await window.ApiClient.clearLogs();
      setLogs([]);
    } catch (err) {}
  };

  const handleDownloadLogs = () => {
    let fullText = '';
    logs.forEach(l => {
      fullText += `[${l.timestamp || '--:--:--'}] ${l.text}\n`;
    });
    const blob = new Blob([fullText], { type: 'text/plain;charset=utf-8' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = `avatar_bot_logs_${new Date().toISOString().slice(0, 10)}.log`;
    a.click();
    URL.revokeObjectURL(url);
  };

  const handleInstallJre = async () => {
    try {
      const data = await window.ApiClient.installJre();
      if (data.success) {
        if (window.__setJreProgress) {
          window.__setJreProgress({ visible: true, percent: 5, message: 'Bắt đầu tải OpenJDK 17...' });
        }
      } else if (window.showAlert) {
        window.showAlert(data.message || 'Không thể cài đặt JRE', 'Lỗi Cài Đặt JRE', 'error');
      }
    } catch (err) {
      if (window.showAlert) window.showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const value = {
    status,
    files,
    proxies,
    activeFileId,
    setActiveFileId,
    activeFile,
    accounts,
    fileAccounts,
    logs: filteredLogs,
    rawLogs: logs,
    logFilter,
    setLogFilter,
    autoScroll,
    setAutoScroll,
    terminalRef,
    uptime,
    formatUptime,
    availableJars,
    theme,
    setTheme,
    toggleTheme,
    runningHm,
    runningDk,
    runningTotal,
    isAnyRunning,
    // Fetchers
    fetchStatus,
    fetchFiles,
    fetchProxies,
    fetchAccounts,
    fetchJars,
    fetchLogs,
    // Actions
    handleStartAccount,
    handleStopAccount,
    handleTriggerAuto,
    handleStartAllFile,
    handleStopAll,
    handleRestartAll,
    handleSwitchServer,
    handleDeleteAccount,
    handleSwitchFile,
    handleDeleteFile,
    handleSaveProxy,
    handleDeleteProxy,
    handleClearLogs,
    handleDownloadLogs,
    handleInstallJre
  };

  return <AppContext.Provider value={value}>{children}</AppContext.Provider>;
};

window.useApp = function useApp() {
  const ctx = useContext(AppContext);
  if (!ctx) throw new Error('useApp must be used within an AppProvider');
  return ctx;
};
