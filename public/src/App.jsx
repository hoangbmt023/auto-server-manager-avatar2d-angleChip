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

  // Modals
  const [accountModal, setAccountModal] = useState({ open: false, editing: null });
  const [fileModal, setFileModal] = useState({ open: false, editing: null });
  const [proxyModal, setProxyModal] = useState({ open: false });
  const [settingsModal, setSettingsModal] = useState({ open: false, config: null });
  const [setupModal, setSetupModal] = useState({ open: false, account: null, activeTab: 'upThue' });
  const [jreProgress, setJreProgress] = useState({ visible: false, percent: 0, message: '' });

  const terminalRef = useRef(null);
  const sseRef = useRef(null);

  // Data Fetchers
  const fetchStatus = useCallback(async () => {
    try {
      const data = await window.ApiClient.getStatus();
      if (data.success) {
        setStatus(data);
        if (data.activeFileId) setActiveFileId(data.activeFileId);
      }
    } catch (e) {}
  }, []);

  const fetchFiles = useCallback(async () => {
    try {
      const data = await window.ApiClient.getFiles();
      if (data.success) {
        setFiles(data.files || []);
        if (data.activeFileId) setActiveFileId(data.activeFileId);
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

    return () => {
      if (sseRef.current) sseRef.current.close();
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
      if (!data.success) alert(data.message || 'Lỗi khởi chạy nick');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleStopAccount = async (id, username) => {
    if (!confirm(`Dừng treo tài khoản [${username}]?`)) return;
    try {
      const data = await window.ApiClient.stopAccount(id);
      if (!data.success) alert(data.message || 'Lỗi dừng nick');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleTriggerAuto = async (id, username, autoType = 'farm', action = 'start') => {
    try {
      const data = await window.ApiClient.triggerAuto(id, autoType, action);
      if (!data.success) {
        alert(data.message || 'Lỗi thực hiện lệnh Auto');
      }
      fetchAccounts();
      fetchStatus();
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleStartAllFile = async () => {
    try {
      const data = await window.ApiClient.startAllFile();
      if (!data.success) alert(data.message || 'Lỗi chạy bot');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleStopAll = async () => {
    if (!confirm('Dừng toàn bộ bot đang chạy?')) return;
    try {
      const data = await window.ApiClient.stopAll();
      if (!data.success) alert(data.message || 'Lỗi dừng tất cả bot');
      fetchAccounts();
      fetchStatus();
      fetchFiles();
      fetchProxies();
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleRestartAll = async () => {
    if (!confirm('Khởi động lại toàn bộ bot?')) return;
    try {
      const data = await window.ApiClient.restartAll();
      if (!data.success) alert(data.message || 'Lỗi khởi động lại');
      setTimeout(() => {
        fetchAccounts();
        fetchStatus();
        fetchFiles();
        fetchProxies();
      }, 1800);
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleSwitchServer = async (id, username, currentServerId) => {
    const newServerId = currentServerId === 0 ? 1 : 0;
    const newServerName = newServerId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';
    if (!confirm(`Chuyển tài khoản [${username}] sang Server [${newServerName}]?`)) return;

    try {
      const data = await window.ApiClient.switchAccountServer(id, newServerId);
      if (data.success) {
        fetchAccounts();
        fetchFiles();
        fetchStatus();
      } else {
        alert(data.message || 'Lỗi đổi server');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleDeleteAccount = async (id, username) => {
    if (!confirm(`Bạn có chắc muốn xóa tài khoản [${username}]?`)) return;
    try {
      const data = await window.ApiClient.deleteAccount(id);
      if (data.success) {
        fetchAccounts();
        fetchFiles();
        fetchProxies();
      } else {
        alert(data.message || 'Không thể xóa tài khoản');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleSwitchFile = async (id) => {
    try {
      const data = await window.ApiClient.switchFile(id);
      if (data.success) {
        setActiveFileId(id);
        fetchFiles();
        fetchAccounts();
        fetchStatus();
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleDeleteFile = async (id, name) => {
    if (!confirm(`Xóa File [${name}] cùng tất cả tài khoản bên trong?`)) return;
    try {
      const data = await window.ApiClient.deleteFile(id);
      if (data.success) {
        fetchFiles();
        fetchAccounts();
        fetchStatus();
        fetchProxies();
      } else {
        alert(data.message || 'Lỗi xóa file');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleSaveProxy = async (payload) => {
    try {
      const data = await window.ApiClient.saveProxy(payload);
      if (data.success) {
        fetchProxies();
        return { success: true };
      } else {
        alert(data.message || 'Lỗi lưu Proxy');
        return { success: false, message: data.message };
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
      return { success: false, message: err.message };
    }
  };

  const handleDeleteProxy = async (id, name) => {
    if (!confirm(`Bạn có chắc muốn xóa proxy [${name || id}]?`)) return;
    try {
      const data = await window.ApiClient.deleteProxy(id);
      if (data.success) {
        fetchProxies();
        fetchAccounts();
      } else {
        alert(data.message || 'Lỗi xóa proxy');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
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
        alert(data.message || 'Không thể cài đặt JRE');
      }
    } catch (err) {
      alert('Lỗi: ' + err.message);
    }
  };

  const handleOpenSettings = async () => {
    try {
      const data = await window.ApiClient.getConfig();
      if (data.success) {
        setSettingsModal({ open: true, config: data.config });
      }
    } catch (err) {
      alert('Lỗi lấy cấu hình: ' + err.message);
    }
  };

  return (
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
    />
  );
}

// Mount React Root
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);
