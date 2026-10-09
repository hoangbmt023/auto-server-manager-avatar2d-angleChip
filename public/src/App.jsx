/**
 * App Root Component (Application Layer)
 * Manages global application state, SSE live subscriptions, timer ticks and renders pages.
 */
const { useState, useEffect, useRef, useMemo, useCallback } = React;

function formatUptime(seconds) {
  const h = Math.floor(seconds / 3600).toString().padStart(2, '0');
  const m = Math.floor((seconds % 3600) / 60).toString().padStart(2, '0');
  const s = Math.floor(seconds % 60).toString().padStart(2, '0');
  return `${h}:${m}:${s}`;
}

function App() {
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

  useEffect(() => {
    document.documentElement.setAttribute('data-theme', theme);
    localStorage.setItem('app_theme', theme);
  }, [theme]);

  const toggleTheme = useCallback(() => {
    setTheme(prev => (prev === 'dark' ? 'light' : 'dark'));
  }, []);

  // Modals
  const [accountModal, setAccountModal] = useState({ open: false, editing: null });
  const [fileModal, setFileModal] = useState({ open: false, editing: null });
  const [proxyModal, setProxyModal] = useState({ open: false });
  const [settingsModal, setSettingsModal] = useState({ open: false, config: null });
  const [setupModal, setSetupModal] = useState({ open: false, account: null, activeTab: 'upThue' });
  const [jreProgress, setJreProgress] = useState({ visible: false, percent: 0, message: '' });
  const [dialog, setDialog] = useState({ open: false });

  // Custom Dialog Helper Handlers
  const showDialog = useCallback((config) => {
    setDialog({
      open: true,
      ...config
    });
  }, []);

  const closeDialog = useCallback(() => {
    setDialog(prev => ({ ...prev, open: false }));
  }, []);

  const showAlert = useCallback((message, title = 'Thông Báo Hệ Thống', type = 'info') => {
    let inferredType = type;
    const msgStr = String(message || '');
    if (msgStr.includes('❌') || msgStr.includes('HẾT HẠN') || msgStr.toLowerCase().includes('lỗi') || msgStr.toLowerCase().includes('thất bại')) {
      inferredType = 'error';
    } else if (msgStr.includes('⚠️') || msgStr.toLowerCase().includes('cảnh báo')) {
      inferredType = 'warning';
    } else if (msgStr.includes('✓') || msgStr.includes('✅') || msgStr.toLowerCase().includes('thành công')) {
      inferredType = 'success';
    }

    showDialog({
      mode: 'alert',
      type: inferredType,
      title,
      message,
      confirmText: 'Đã Hiểu'
    });
  }, [showDialog]);

  const showConfirm = useCallback((message, onConfirm, title = 'Xác Nhận Thao Tác', type = 'warning', confirmText = 'Đồng Ý', cancelText = 'Thoát') => {
    showDialog({
      mode: 'confirm',
      type,
      title,
      message,
      confirmText,
      cancelText,
      onConfirm
    });
  }, [showDialog]);

  // Expose to window for all components
  useEffect(() => {
    window.showAlert = showAlert;
    window.showConfirm = showConfirm;
    window.showDialog = showDialog;
  }, [showAlert, showConfirm, showDialog]);

  const terminalRef = useRef(null);
  const sseRef = useRef(null);

  // Data Fetchers
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

  // SSE & Lifecycle Setup
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
          setJreProgress({ visible: true, percent: p.percent || 0, message: p.message || '' });
          if (p.ready) {
            setTimeout(() => {
              setJreProgress(prev => ({ ...prev, visible: false }));
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

    // Periodic synchronization fallback (ensures mobile browsers stay 100% in sync with desktop)
    const syncInterval = setInterval(() => {
      fetchStatus();
      fetchAccounts();
    }, 5000);

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

  // Auto Scroll Terminal
  useEffect(() => {
    if (autoScroll && terminalRef.current) {
      terminalRef.current.scrollTop = terminalRef.current.scrollHeight;
    }
  }, [logs, autoScroll]);

  // Running Uptime Tick
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
  const handleStartAccount = async (id, username) => {
    try {
      const data = await window.ApiClient.startAccount(id);
      if (!data.success) showAlert(data.message || 'Lỗi khởi chạy nick', 'Lỗi Khởi Chạy', 'error');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStopAccount = async (id, username) => {
    showConfirm(`Dừng treo tài khoản [${username}]?`, async () => {
      try {
        const data = await window.ApiClient.stopAccount(id);
        if (!data.success) showAlert(data.message || 'Lỗi dừng nick', 'Lỗi', 'error');
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleTriggerAuto = async (id, username, autoType = 'farm', action = 'start') => {
    try {
      const data = await window.ApiClient.triggerAuto(id, autoType, action);
      if (!data.success) {
        showAlert(data.message || 'Lỗi thực hiện lệnh Auto', 'Lỗi Auto', 'error');
      }
      fetchAccounts();
      fetchStatus();
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStartAllFile = async () => {
    try {
      const data = await window.ApiClient.startAllFile();
      if (!data.success) showAlert(data.message || 'Lỗi chạy bot', 'Lỗi Khởi Chạy', 'error');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleStopAll = async () => {
    showConfirm('Dừng toàn bộ bot đang chạy?', async () => {
      try {
        const data = await window.ApiClient.stopAll();
        if (!data.success) showAlert(data.message || 'Lỗi dừng tất cả bot', 'Lỗi', 'error');
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleRestartAll = async () => {
    showConfirm('Khởi động lại toàn bộ bot?', async () => {
      try {
        const data = await window.ApiClient.restartAll();
        if (!data.success) showAlert(data.message || 'Lỗi khởi động lại', 'Lỗi Khởi Động Lại', 'error');
        setTimeout(() => {
          fetchAccounts();
          fetchStatus();
          fetchFiles();
          fetchProxies();
        }, 1800);
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSwitchServer = async (id, username, currentServerId) => {
    const newServerId = currentServerId === 0 ? 1 : 0;
    const newServerName = newServerId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    showConfirm(`Chuyển tài khoản [${username}] sang Server [${newServerName}]?`, async () => {
      try {
        const data = await window.ApiClient.switchAccountServer(id, newServerId);
        if (data.success) {
          fetchAccounts();
          fetchFiles();
          fetchStatus();
        } else {
          showAlert(data.message || 'Lỗi đổi server', 'Lỗi Đổi Server', 'error');
        }
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleDeleteAccount = async (id, username) => {
    showConfirm(`Bạn có chắc muốn xóa tài khoản [${username}]?`, async () => {
      try {
        const data = await window.ApiClient.deleteAccount(id);
        if (data.success) {
          fetchAccounts();
          fetchFiles();
          fetchProxies();
        } else {
          showAlert(data.message || 'Không thể xóa tài khoản', 'Lỗi Xóa Tài Khoản', 'error');
        }
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSwitchFile = (id) => {
    setActiveFileId(id);
    window.ApiClient.switchFile(id).catch(() => {});
  };

  const handleDeleteFile = async (id, name) => {
    showConfirm(`Xóa File [${name}] cùng tất cả tài khoản bên trong?`, async () => {
      try {
        const data = await window.ApiClient.deleteFile(id);
        if (data.success) {
          showAlert(data.message || `Đã xóa File [${name}] thành công!`, 'Thành Công', 'success');
          fetchFiles();
          fetchAccounts();
          fetchStatus();
          fetchProxies();
        } else {
          showAlert(data.message || 'Lỗi xóa file', 'Lỗi Xóa File', 'error');
        }
      } catch (err) {
        showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      }
    });
  };

  const handleSaveProxy = async (payload) => {
    try {
      const data = await window.ApiClient.saveProxy(payload);
      if (data.success) {
        fetchProxies();
        if (data.message) {
          showAlert(data.message, 'Cập Nhật Proxy');
        }
        return { success: true };
      } else {
        showAlert(data.message || 'Lỗi lưu Proxy', 'Lỗi Lưu Proxy', 'error');
        return { success: false, message: data.message };
      }
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
      return { success: false, message: err.message };
    }
  };

  const handleDeleteProxy = async (id, name) => {
    try {
      const data = await window.ApiClient.deleteProxy(id);
      if (data && data.success) {
        fetchProxies();
        fetchAccounts();
        showAlert(data.message || 'Đã xóa Proxy thành công!', 'Thành Công', 'success');
        return data;
      } else {
        showAlert(data?.message || 'Lỗi xóa proxy', 'Lỗi Xóa Proxy', 'error');
        return data;
      }
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
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
        setJreProgress({ visible: true, percent: 5, message: 'Bắt đầu tải OpenJDK 17...' });
      } else {
        showAlert(data.message || 'Không thể cài đặt JRE', 'Lỗi Cài Đặt JRE', 'error');
      }
    } catch (err) {
      showAlert('Lỗi: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  const handleOpenSettings = async () => {
    try {
      const data = await window.ApiClient.getConfig();
      if (data.success) {
        setSettingsModal({ open: true, config: data.config });
      }
    } catch (err) {
      showAlert('Lỗi lấy cấu hình: ' + err.message, 'Lỗi Hệ Thống', 'error');
    }
  };

  return (
    <React.Fragment>
      <window.DashboardPage
      status={status}
      files={files}
      proxies={proxies}
      activeFileId={activeFileId}
      activeFile={activeFile}
      fileAccounts={fileAccounts}
      accounts={accounts}
      logs={filteredLogs}
      logFilter={logFilter}
      setLogFilter={setLogFilter}
      autoScroll={autoScroll}
      setAutoScroll={setAutoScroll}
      terminalRef={terminalRef}
      uptime={uptime}
      formatUptime={formatUptime}
      theme={theme}
      setTheme={setTheme}
      toggleTheme={toggleTheme}
      runningHm={runningHm}
      runningDk={runningDk}
      runningTotal={runningTotal}
      jreProgress={jreProgress}
      availableJars={availableJars}
      fetchJars={fetchJars}
      accountModal={accountModal}
      setAccountModal={setAccountModal}
      fileModal={fileModal}
      setFileModal={setFileModal}
      proxyModal={proxyModal}
      setProxyModal={setProxyModal}
      settingsModal={settingsModal}
      setSettingsModal={setSettingsModal}
      setupModal={setupModal}
      setSetupModal={setSetupModal}
      onOpenSetup={(acc, tab = 'upThue') => setSetupModal({ open: true, account: acc, activeTab: tab })}
      onStartAccount={handleStartAccount}
      onStopAccount={handleStopAccount}
      onStartAllFile={handleStartAllFile}
      onStopAll={handleStopAll}
      onRestartAll={handleRestartAll}
      onSwitchServer={handleSwitchServer}
      onDeleteAccount={handleDeleteAccount}
      onSwitchFile={handleSwitchFile}
      onDeleteFile={handleDeleteFile}
      onSaveProxy={handleSaveProxy}
      onDeleteProxy={handleDeleteProxy}
      onClearLogs={handleClearLogs}
      onDownloadLogs={handleDownloadLogs}
      onInstallJre={handleInstallJre}
      onOpenSettings={handleOpenSettings}
      onAccountSaved={(targetFileId) => {
        setAccountModal({ open: false, editing: null });
        if (targetFileId) {
          setActiveFileId(targetFileId);
        }
        fetchAccounts();
        fetchFiles();
        fetchProxies();
      }}
      onFileSaved={() => {
        setFileModal({ open: false, editing: null });
        fetchFiles();
        fetchAccounts();
      }}
      onSettingsSaved={(newPass) => {
        if (newPass) window.ApiClient.setAuthToken(newPass);
        setSettingsModal({ open: false, config: null });
        fetchStatus();
      }}
      onAccountUpdated={() => {
        fetchAccounts();
      }}
      onTriggerAuto={handleTriggerAuto}
      fetchProxies={fetchProxies}
      onRefreshProxies={fetchProxies}
    />
    {window.DialogModal && (
      <window.DialogModal
        dialog={dialog}
        onClose={closeDialog}
      />
    )}
  </React.Fragment>
  );
}

// Mount React Root
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);
