let authToken = localStorage.getItem('avatar_bot_token') || '';
let uptimeInterval = null;
let currentUptime = 0;
let isBotRunning = false;
let runningAccountIds = [];
let cachedAccounts = [];
let cachedFiles = [];
let activeAccountId = null;
let activeFileId = 'file_1';
let currentFileStats = { hmCount: 0, dkCount: 0, totalAccounts: 0, maxTotal: 6, maxPerServer: 3 };
let allLogs = [];

// DOM Elements
const botStatusBadge = document.getElementById('botStatusBadge');
const botStatusText = document.getElementById('botStatusText');
const statUptime = document.getElementById('statUptime');
const statJava = document.getElementById('statJava');
const statMemory = document.getElementById('statMemory');
const statPidRestarts = document.getElementById('statPidRestarts');
const btnStart = document.getElementById('btnStart');
const btnStop = document.getElementById('btnStop');
const btnRestart = document.getElementById('btnRestart');
const btnClearLog = document.getElementById('btnClearLog');
const btnDownloadLog = document.getElementById('btnDownloadLog');
const btnSettings = document.getElementById('btnSettings');
const logFilterSelect = document.getElementById('logFilterSelect');
const terminalContainer = document.getElementById('terminalContainer');
const terminalLogList = document.getElementById('terminalLogList');
const chkAutoScroll = document.getElementById('chkAutoScroll');
const logCountElem = document.getElementById('logCount');

// JRE Elements
const jreBanner = document.getElementById('jreBanner');
const btnInstallJre = document.getElementById('btnInstallJre');
const jreProgressWrapper = document.getElementById('jreProgressWrapper');
const jreProgressBar = document.getElementById('jreProgressBar');
const jreProgressText = document.getElementById('jreProgressText');

// Files check elements
const chkEmulatorFile = document.getElementById('chkEmulatorFile');
const chkGameFile = document.getElementById('chkGameFile');
const chkJavaReady = document.getElementById('chkJavaReady');
const chkJavaDetail = document.getElementById('chkJavaDetail');

// Settings Modal Elements
const settingsModal = document.getElementById('settingsModal');
const btnCloseModal = document.getElementById('btnCloseModal');
const btnCancelSettings = document.getElementById('btnCancelSettings');
const formSettings = document.getElementById('formSettings');

// File Manager Elements
const fileTabsContainer = document.getElementById('fileTabsContainer');
const fileInfoBadge = document.getElementById('fileInfoBadge');
const btnOpenAddFile = document.getElementById('btnOpenAddFile');
const fileModal = document.getElementById('fileModal');
const fileModalTitle = document.getElementById('fileModalTitle');
const btnCloseFileModal = document.getElementById('btnCloseFileModal');
const btnCancelFileModal = document.getElementById('btnCancelFileModal');
const formFile = document.getElementById('formFile');
const fileId = document.getElementById('fileId');
const fileName = document.getElementById('fileName');
const fileGameJar = document.getElementById('fileGameJar');
const fileGameJarSelect = document.getElementById('fileGameJarSelect');
const fileJarUploader = document.getElementById('fileJarUploader');
const uploadJarStatus = document.getElementById('uploadJarStatus');
const fileProxyEnabled = document.getElementById('fileProxyEnabled');
const fileProxyType = document.getElementById('fileProxyType');
const fileProxyHost = document.getElementById('fileProxyHost');
const fileProxyPort = document.getElementById('fileProxyPort');
const fileProxyUser = document.getElementById('fileProxyUser');
const fileProxyPass = document.getElementById('fileProxyPass');
const fileProxyWarning = document.getElementById('fileProxyWarning');

// Account Limit Banner Elements
const limitHmCount = document.getElementById('limitHmCount');
const limitDkCount = document.getElementById('limitDkCount');
const limitTotalCount = document.getElementById('limitTotalCount');

// Account Manager Elements
const accountsList = document.getElementById('accountsList');
const btnOpenAddAccount = document.getElementById('btnOpenAddAccount');
const accountModal = document.getElementById('accountModal');
const accountModalTitle = document.getElementById('accountModalTitle');
const btnCloseAccountModal = document.getElementById('btnCloseAccountModal');
const btnCancelAccountModal = document.getElementById('btnCancelAccountModal');
const formAccount = document.getElementById('formAccount');
const accId = document.getElementById('accId');
const accFileSelect = document.getElementById('accFileSelect');
const accUsername = document.getElementById('accUsername');
const accPassword = document.getElementById('accPassword');
const accServer = document.getElementById('accServer');
const accNote = document.getElementById('accNote');

const SERVER_NAMES = {
  '0': 'Hoàn Mỹ',
  '1': 'Diệu Kỳ'
};

function formatUptime(seconds) {
  const h = Math.floor(seconds / 3600).toString().padStart(2, '0');
  const m = Math.floor((seconds % 3600) / 60).toString().padStart(2, '0');
  const s = Math.floor(seconds % 60).toString().padStart(2, '0');
  return `${h}:${m}:${s}`;
}

function getHeaders() {
  const headers = { 'Content-Type': 'application/json' };
  if (authToken) {
    headers['Authorization'] = `Bearer ${authToken}`;
  }
  return headers;
}

function escapeHtml(str) {
  if (!str) return '';
  return String(str).replace(/[&<>'"]/g, 
    tag => ({ '&': '&amp;', '<': '&lt;', '>': '&gt;', "'": '&#39;', '"': '&quot;' }[tag] || tag)
  );
}

// Log Append & Filtering
function appendLog(log) {
  allLogs.push(log);
  if (allLogs.length > 1000) allLogs.shift();

  if (shouldDisplayLog(log)) {
    renderSingleLogElement(log);
  }
}

function shouldDisplayLog(log) {
  if (!logFilterSelect) return true;
  const filter = logFilterSelect.value;
  if (!filter || filter === 'all') return true;
  return (log.username === filter || (log.text && log.text.includes(`[${filter}]`)));
}

function renderSingleLogElement(log) {
  const item = document.createElement('div');
  item.className = `log-item log-${log.type || 'out'}`;
  
  const time = document.createElement('span');
  time.className = 'log-time';
  time.textContent = `[${log.timestamp || '--:--:--'}]`;

  const msg = document.createElement('span');
  msg.className = 'log-msg';
  msg.textContent = log.text;

  item.appendChild(time);
  item.appendChild(msg);
  terminalLogList.appendChild(item);

  logCountElem.textContent = terminalLogList.children.length;

  if (chkAutoScroll.checked) {
    terminalContainer.scrollTop = terminalContainer.scrollHeight;
  }
}

function reFilterLogs() {
  terminalLogList.innerHTML = '';
  allLogs.filter(shouldDisplayLog).forEach(renderSingleLogElement);
}

if (logFilterSelect) {
  logFilterSelect.addEventListener('change', reFilterLogs);
}

function updateLogFilterOptions() {
  if (!logFilterSelect) return;
  const currentVal = logFilterSelect.value;
  logFilterSelect.innerHTML = '<option value="all">🔍 Tất cả tài khoản</option>';
  
  const usernames = Array.from(new Set(cachedAccounts.map(a => a.username))).filter(Boolean);
  usernames.forEach(u => {
    const opt = document.createElement('option');
    opt.value = u;
    opt.textContent = `👤 ${u}`;
    if (u === currentVal) opt.selected = true;
    logFilterSelect.appendChild(opt);
  });
}

// Update UI State from Status Object
function updateStatusUI(data) {
  const bot = data.bot || {};
  const java = data.java;
  const sys = data.system;
  const files = data.files;

  runningAccountIds = bot.runningAccountIds || [];
  isBotRunning = Boolean(bot.runningCount > 0 || bot.running);

  if (data.activeAccountId) activeAccountId = data.activeAccountId;
  if (data.activeFileId) activeFileId = data.activeFileId;

  if (isBotRunning) {
    botStatusBadge.className = 'status-indicator status-running';
    botStatusText.textContent = `Đang Chạy (${bot.runningCount || 1} nick)`;
    btnStart.disabled = false;
    btnStop.disabled = false;
    btnRestart.disabled = false;

    if (!uptimeInterval) {
      uptimeInterval = setInterval(() => {
        currentUptime++;
        statUptime.textContent = formatUptime(currentUptime);
      }, 1000);
    }
    statPidRestarts.textContent = `${bot.runningCount || 0} nick / ${runningAccountIds.length > 0 ? 'Multi-PID' : '--'}`;
  } else {
    botStatusBadge.className = 'status-indicator status-stopped';
    botStatusText.textContent = 'Đã Dừng';
    btnStart.disabled = false;
    btnStop.disabled = true;
    btnRestart.disabled = true;

    if (uptimeInterval) {
      clearInterval(uptimeInterval);
      uptimeInterval = null;
    }
    currentUptime = 0;
    statUptime.textContent = '00:00:00';
    statPidRestarts.textContent = `0 nick / --`;
  }

  // Update account cards and counters
  renderAccounts();

  // Java Info
  if (java) {
    if (java.available) {
      statJava.textContent = java.version.split(' ')[0] + ' ' + (java.version.split(' ')[1] || '');
      statJava.title = java.version;
      jreBanner.style.display = 'none';
      chkJavaReady.querySelector('.check-status').textContent = '✅';
      chkJavaDetail.textContent = java.version;
    } else {
      statJava.textContent = 'Chưa cài đặt';
      jreBanner.style.display = 'flex';
      chkJavaReady.querySelector('.check-status').textContent = '❌';
      chkJavaDetail.textContent = 'Không tìm thấy Java trong PATH hoặc thư mục jre/';
    }
  }

  // System Stats
  if (sys) {
    statMemory.textContent = `${sys.freeMemMb} / ${sys.totalMemMb} MB`;
  }

  // Files checklist
  if (files) {
    chkEmulatorFile.querySelector('.check-status').textContent = files.emulator ? '✅' : '❌';
    chkGameFile.querySelector('.check-status').textContent = files.game ? '✅' : '❌';
  }
}

// ==========================================
// 1. Files Management & Tabs
// ==========================================
async function fetchFiles() {
  try {
    const res = await fetch('/api/files', { headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      cachedFiles = data.files || [];
      activeFileId = data.activeFileId || (cachedFiles[0] ? cachedFiles[0].id : 'file_1');
      renderFileTabs();
      updateAccFileOptions();
    }
  } catch (err) {
    console.error('Lỗi tải danh sách file:', err);
  }
}

function renderFileTabs() {
  if (!fileTabsContainer) return;
  fileTabsContainer.innerHTML = '';

  cachedFiles.forEach(f => {
    const isActive = f.id === activeFileId;
    const btn = document.createElement('button');
    btn.className = `file-tab-btn ${isActive ? 'active-file-tab' : ''}`;
    btn.innerHTML = `
      <span>📁 ${escapeHtml(f.name)} (${f.totalAccounts}/6)</span>
      ${f.isDefault ? '<small style="opacity:0.75; font-size:10px;">[IP Server]</small>' : '<small style="color:#93c5fd; font-size:10px;">[Proxy]</small>'}
      ${f.runningCount > 0 ? `<small style="color:#34d399; font-weight:bold; margin-left:4px;">(🔥 ${f.runningCount} online)</small>` : ''}
    `;
    btn.onclick = () => switchFile(f.id);
    fileTabsContainer.appendChild(btn);
  });

  const curFile = cachedFiles.find(f => f.id === activeFileId) || cachedFiles[0];
  if (curFile && fileInfoBadge) {
    const isDef = curFile.isDefault;
    const hasProxy = curFile.proxy && curFile.proxy.enabled && curFile.proxy.host;
    fileInfoBadge.innerHTML = `
      <span>Đang chọn: <strong>${escapeHtml(curFile.name)}</strong></span>
      ${isDef ? 
        '<span class="badge-proxy badge-proxy-server">🛡️ IP Gốc Server</span>' : 
        (hasProxy ? `<span class="badge-proxy badge-proxy-custom">🔒 Proxy: ${escapeHtml(curFile.proxy.host)}:${escapeHtml(curFile.proxy.port)}</span>` : '<span class="badge-proxy badge-proxy-custom" style="color:#f87171;">⚠️ Chưa có Proxy</span>')}
      <button class="btn btn-sm btn-secondary" style="padding:2px 8px; font-size:11px;" onclick="openEditFileModal('${curFile.id}')">⚙️ Sửa File</button>
      ${!isDef ? `<button class="btn btn-sm btn-danger" style="padding:2px 8px; font-size:11px;" onclick="deleteFile('${curFile.id}', '${escapeHtml(curFile.name)}')">🗑️ Xóa</button>` : ''}
    `;
  }
}

function updateAccFileOptions() {
  if (!accFileSelect) return;
  accFileSelect.innerHTML = '';
  cachedFiles.forEach(f => {
    const opt = document.createElement('option');
    opt.value = f.id;
    opt.textContent = `${f.name} (${f.totalAccounts}/6 nick)`;
    accFileSelect.appendChild(opt);
  });
}

// JAR Files Management & Upload
async function fetchAvailableJars(selectedJar = null) {
  try {
    const res = await fetch('/api/available-jars', { headers: getHeaders() });
    const data = await res.json();
    if (data.success && Array.isArray(data.jars) && fileGameJarSelect) {
      fileGameJarSelect.innerHTML = '';
      data.jars.forEach(j => {
        const opt = document.createElement('option');
        opt.value = j;
        opt.textContent = j;
        if (selectedJar && j === selectedJar) opt.selected = true;
        fileGameJarSelect.appendChild(opt);
      });
      if (selectedJar) {
        fileGameJar.value = selectedJar;
      } else if (fileGameJarSelect.value) {
        fileGameJar.value = fileGameJarSelect.value;
      }
    }
  } catch (err) {}
}

if (fileGameJarSelect) {
  fileGameJarSelect.addEventListener('change', () => {
    fileGameJar.value = fileGameJarSelect.value;
  });
}

if (fileJarUploader) {
  fileJarUploader.addEventListener('change', async (e) => {
    const file = e.target.files[0];
    if (!file) return;
    if (!file.name.endsWith('.jar')) {
      alert('Vui lòng chọn file có định dạng đuôi .jar!');
      return;
    }

    if (uploadJarStatus) uploadJarStatus.textContent = `Đang tải lên: ${file.name}...`;

    try {
      const res = await fetch('/api/upload-jar', {
        method: 'POST',
        headers: {
          ...getHeaders(),
          'x-filename': encodeURIComponent(file.name),
          'Content-Type': 'application/octet-stream'
        },
        body: file
      });
      const data = await res.json();
      if (data.success) {
        if (uploadJarStatus) uploadJarStatus.textContent = `✓ Đã tải lên: ${data.filename}`;
        await fetchAvailableJars(data.filename);
      } else {
        alert(data.message || 'Lỗi tải lên file JAR');
        if (uploadJarStatus) uploadJarStatus.textContent = '';
      }
    } catch (err) {
      alert('Lỗi tải file: ' + err.message);
      if (uploadJarStatus) uploadJarStatus.textContent = '';
    }
  });
}

// File Modal Handlers
btnOpenAddFile.addEventListener('click', async () => {
  fileModalTitle.textContent = '📁 Thêm File / Profile Bot Mới';
  fileId.value = '';
  fileName.value = '';
  fileGameJar.value = 'avatar_fish_build40.jar';
  if (uploadJarStatus) uploadJarStatus.textContent = '';
  fileProxyEnabled.checked = true;
  fileProxyType.value = 'socks';
  fileProxyHost.value = '';
  fileProxyPort.value = '';
  fileProxyUser.value = '';
  fileProxyPass.value = '';
  fileProxyWarning.style.display = 'block';
  await fetchAvailableJars('avatar_fish_build40.jar');
  fileModal.style.display = 'flex';
});

function closeFileModal() {
  fileModal.style.display = 'none';
}

btnCloseFileModal.addEventListener('click', closeFileModal);
btnCancelFileModal.addEventListener('click', closeFileModal);

window.openEditFileModal = async function(id) {
  const f = cachedFiles.find(item => item.id === id);
  if (!f) return;

  fileModalTitle.textContent = `✏️ Chỉnh Sửa File: ${f.name}`;
  fileId.value = f.id;
  fileName.value = f.name;
  fileGameJar.value = f.gameJar || 'avatar_fish_build40.jar';
  if (uploadJarStatus) uploadJarStatus.textContent = '';
  
  const p = f.proxy || {};
  fileProxyEnabled.checked = Boolean(p.enabled);
  fileProxyType.value = p.type || 'socks';
  fileProxyHost.value = p.host || '';
  fileProxyPort.value = p.port || '';
  fileProxyUser.value = p.username || '';
  fileProxyPass.value = p.password || '';

  if (f.isDefault) {
    fileProxyWarning.style.display = 'none';
  } else {
    fileProxyWarning.style.display = 'block';
  }

  await fetchAvailableJars(f.gameJar || 'avatar_fish_build40.jar');
  fileModal.style.display = 'flex';
};

formFile.addEventListener('submit', async (e) => {
  e.preventDefault();

  const id = fileId.value;
  const name = fileName.value.trim();
  const gameJarVal = fileGameJar.value.trim() || 'avatar_fish_build40.jar';
  const proxyEnabled = fileProxyEnabled.checked;
  const proxyHost = fileProxyHost.value.trim();
  const proxyPort = fileProxyPort.value.trim();

  if (!name) {
    alert('Vui lòng nhập tên File!');
    return;
  }

  const isDefaultFile = id === 'file_1' || cachedFiles.length === 0;
  if (!isDefaultFile && (!proxyEnabled || !proxyHost || !proxyPort)) {
    alert('❌ BẮT BUỘC PROXY: Từ File thứ 2 trở đi, bạn phải BẬT và NHẬP ĐẦY ĐỦ Proxy (IP/Host & Port)!');
    return;
  }

  const payload = {
    id: id || undefined,
    name,
    gameJar: gameJarVal,
    proxy: {
      enabled: proxyEnabled,
      type: fileProxyType.value,
      host: proxyHost,
      port: proxyPort,
      username: fileProxyUser.value.trim(),
      password: fileProxyPass.value
    }
  };

  try {
    const res = await fetch('/api/files', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify(payload)
    });
    const data = await res.json();
    if (data.success) {
      closeFileModal();
      await fetchFiles();
      await fetchAccounts();
    } else {
      alert(data.message || 'Lỗi lưu File');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
});

window.deleteFile = async function(id, name) {
  if (!confirm(`Bạn có chắc muốn xóa File [${name}] cùng toàn bộ tài khoản bên trong?`)) return;

  try {
    const res = await fetch('/api/files/delete', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id })
    });
    const data = await res.json();
    if (data.success) {
      await fetchFiles();
      await fetchAccounts();
      await fetchInitialData();
    } else {
      alert(data.message || 'Lỗi xóa File');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

window.switchFile = async function(id) {
  try {
    const res = await fetch('/api/files/switch', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id })
    });
    const data = await res.json();
    if (data.success) {
      activeFileId = id;
      await fetchFiles();
      await fetchAccounts();
      await fetchInitialData();
    } else {
      alert(data.message || 'Lỗi chuyển File');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

// ==========================================
// 2. Accounts Management
// ==========================================
async function fetchAccounts() {
  try {
    const res = await fetch('/api/accounts', { headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      cachedAccounts = data.accounts || [];
      activeAccountId = data.activeAccountId;
      if (data.activeFileId) activeFileId = data.activeFileId;
      if (data.fileStats) currentFileStats = data.fileStats;
      renderAccounts();
      updateLogFilterOptions();
    }
  } catch (err) {
    console.error('Lỗi tải danh sách tài khoản:', err);
  }
}

// Render Accounts Grid for Active File
function renderAccounts() {
  if (!accountsList) return;
  accountsList.innerHTML = '';

  const fileAccounts = cachedAccounts.filter(a => (a.fileId || 'file_1') === activeFileId);

  // Real-time Online Accounts Counting
  const runningHm = fileAccounts.filter(a => Boolean(a.isRunning || runningAccountIds.includes(a.id)) && parseInt(a.serverId, 10) === 0).length;
  const runningDk = fileAccounts.filter(a => Boolean(a.isRunning || runningAccountIds.includes(a.id)) && parseInt(a.serverId, 10) === 1).length;
  const runningTotal = runningHm + runningDk;

  if (limitHmCount) {
    limitHmCount.textContent = `${runningHm}/3`;
    limitHmCount.className = `limit-val ${runningHm > 0 ? 'limit-active' : ''}`;
  }
  if (limitDkCount) {
    limitDkCount.textContent = `${runningDk}/3`;
    limitDkCount.className = `limit-val ${runningDk > 0 ? 'limit-active' : ''}`;
  }
  if (limitTotalCount) {
    limitTotalCount.textContent = `${runningTotal}/6`;
    limitTotalCount.className = `limit-val ${runningTotal > 0 ? 'limit-active' : ''}`;
  }

  if (fileAccounts.length === 0) {
    accountsList.innerHTML = `
      <div class="empty-accounts" style="grid-column: 1 / -1;">
        <p>Chưa có tài khoản nào trong File này.</p>
        <p style="margin-top: 6px; font-size: 0.85rem; color: var(--text-secondary);">
          Mỗi File được phép thêm tối đa <strong>6 tài khoản</strong> (3 nick Hoàn Mỹ + 3 nick Diệu Kỳ).
        </p>
      </div>
    `;
    return;
  }

  fileAccounts.forEach(acc => {
    const isRunningThisAcc = Boolean(acc.isRunning || (runningAccountIds && runningAccountIds.includes(acc.id)));
    const serverName = acc.serverName || SERVER_NAMES[acc.serverId] || (parseInt(acc.serverId, 10) === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');

    const card = document.createElement('div');
    card.className = `account-card-item ${isRunningThisAcc ? 'active-account' : ''}`;
    
    card.innerHTML = `
      <div class="acc-header">
        <div class="acc-user-info">
          <div class="acc-avatar-icon">${isRunningThisAcc ? '🔥' : '👤'}</div>
          <div>
            <div class="acc-username">${escapeHtml(acc.username)}</div>
            <div class="acc-note">${escapeHtml(acc.note || 'Không có ghi chú')}</div>
            <div class="acc-badges">
              <span class="badge-server">🌐 Server: <strong>${escapeHtml(serverName)}</strong></span>
              ${isRunningThisAcc ? 
                `<span class="badge-active" style="background:rgba(16,185,129,0.2); color:#34d399; border:1px solid rgba(16,185,129,0.4);">⭐ Đang Treo Online ${acc.runningPid ? `(PID: ${acc.runningPid})` : ''}</span>` : 
                '<span class="badge-server" style="opacity:0.75;">💤 Đang Tắt</span>'}
            </div>
          </div>
        </div>
      </div>

      <div class="acc-actions">
        ${isRunningThisAcc ? `
          <button class="btn btn-sm btn-danger" onclick="stopAccountBot('${acc.id}', '${escapeHtml(acc.username)}')">
            ⏹️ Dừng Treo
          </button>
        ` : `
          <button class="btn btn-sm btn-primary" onclick="startAccountBot('${acc.id}', '${escapeHtml(acc.username)}')">
            ▶ Treo Nick Này
          </button>
        `}
        <button class="btn btn-sm btn-server-switch" title="Chuyển sang Server khác (Hoàn Mỹ <-> Diệu Kỳ)" onclick="switchAccountServer('${acc.id}')">
          🌐 Đổi Server
        </button>
        <button class="btn btn-sm btn-secondary" onclick="openEditAccountModal('${acc.id}')">
          ✏️ Sửa
        </button>
        <button class="btn btn-sm btn-danger" onclick="deleteAccount('${acc.id}', '${escapeHtml(acc.username)}')">
          🗑️
        </button>
      </div>
    `;

    accountsList.appendChild(card);
  });
}

// Account Modal Actions
btnOpenAddAccount.addEventListener('click', () => {
  accountModalTitle.textContent = '➕ Thêm Tài Khoản Avatar Mới';
  accId.value = '';
  accUsername.value = '';
  accPassword.value = '';
  accServer.value = '0';
  accNote.value = '';
  accFileSelect.value = activeFileId;
  accountModal.style.display = 'flex';
});

function closeAccountModal() {
  accountModal.style.display = 'none';
}

btnCloseAccountModal.addEventListener('click', closeAccountModal);
btnCancelAccountModal.addEventListener('click', closeAccountModal);

window.openEditAccountModal = function(id) {
  const acc = cachedAccounts.find(a => a.id === id);
  if (!acc) return;

  accountModalTitle.textContent = `✏️ Chỉnh Sửa Tài Khoản: ${acc.username}`;
  accId.value = acc.id;
  accUsername.value = acc.username;
  accPassword.value = '';
  accServer.value = String(acc.serverId !== undefined ? acc.serverId : 0);
  accNote.value = acc.note || '';
  accFileSelect.value = acc.fileId || activeFileId;
  accountModal.style.display = 'flex';
};

formAccount.addEventListener('submit', async (e) => {
  e.preventDefault();

  const id = accId.value;
  const targetFileId = accFileSelect.value || activeFileId;
  const username = accUsername.value.trim();
  const password = accPassword.value;
  const serverId = parseInt(accServer.value, 10);
  const serverName = SERVER_NAMES[serverId] || (serverId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ');
  const note = accNote.value.trim();

  if (!username) {
    alert('Vui lòng nhập tên tài khoản!');
    return;
  }

  const payload = {
    id: id || undefined,
    fileId: targetFileId,
    username,
    password,
    serverId,
    serverName,
    note
  };

  try {
    const res = await fetch('/api/accounts', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify(payload)
    });
    const data = await res.json();
    if (data.success) {
      closeAccountModal();
      await fetchFiles();
      await fetchAccounts();
    } else {
      alert(data.message || 'Lỗi lưu tài khoản');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
});

window.deleteAccount = async function(id, username) {
  if (!confirm(`Bạn có chắc muốn xóa tài khoản [${username}]?`)) return;

  try {
    const res = await fetch('/api/accounts/delete', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id })
    });
    const data = await res.json();
    if (data.success) {
      await fetchFiles();
      await fetchAccounts();
    } else {
      alert(data.message || 'Không thể xóa tài khoản');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

// Start Multi-Bot Hanging per Account
window.startAccountBot = async function(id, username) {
  const acc = cachedAccounts.find(a => a.id === id);
  const serverName = acc ? (acc.serverName || SERVER_NAMES[acc.serverId] || 'Hoàn Mỹ') : '';

  try {
    const res = await fetch('/api/bot/start-account', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id })
    });
    const data = await res.json();
    if (data.success) {
      if (!runningAccountIds.includes(id)) {
        runningAccountIds.push(id);
      }
      await fetchAccounts();
      await fetchStatusOnly();
    } else {
      alert(data.message || 'Không thể khởi chạy bot cho nick này');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

// Stop Hanging per Account
window.stopAccountBot = async function(id, username) {
  if (!confirm(`Dừng treo tài khoản [${username}] ngay bây giờ?`)) return;

  try {
    const res = await fetch('/api/bot/stop-account', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id })
    });
    const data = await res.json();
    if (data.success) {
      runningAccountIds = runningAccountIds.filter(item => item !== id);
      await fetchAccounts();
      await fetchStatusOnly();
    } else {
      alert(data.message || 'Lỗi dừng bot');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

// Switch Server (Hoàn Mỹ <-> Diệu Kỳ)
window.switchAccountServer = async function(id) {
  const acc = cachedAccounts.find(a => a.id === id);
  if (!acc) return;
  const newServerId = parseInt(acc.serverId, 10) === 0 ? 1 : 0;
  const newServerName = newServerId === 0 ? 'Hoàn Mỹ' : 'Diệu Kỳ';

  if (!confirm(`Bạn muốn chuyển tài khoản [${acc.username}] sang Server [${newServerName}]?`)) return;

  try {
    const res = await fetch('/api/accounts/switch-server', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify({ id, newServerId })
    });
    const data = await res.json();
    if (data.success) {
      await fetchFiles();
      await fetchAccounts();
      await fetchStatusOnly();
    } else {
      alert(data.message || 'Lỗi đổi server');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
};

// ==========================================
// 3. Status, Logs & Realtime SSE
// ==========================================
async function fetchStatusOnly() {
  try {
    const res = await fetch('/api/status', { headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      updateStatusUI(data);
    }
  } catch (err) {}
}

async function fetchInitialData() {
  try {
    const res = await fetch('/api/status', { headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      updateStatusUI(data);
    }

    const logsRes = await fetch('/api/logs', { headers: getHeaders() });
    const logsData = await logsRes.json();
    if (logsData.success && Array.isArray(logsData.logs)) {
      terminalLogList.innerHTML = '';
      allLogs = [];
      logsData.logs.forEach(appendLog);
    }
  } catch (err) {
    console.error('Lỗi nạp dữ liệu ban đầu:', err);
  }
}

// Connect SSE for Realtime updates
let evtSource = null;
let sseReconnectTimer = null;

function initSSE() {
  if (evtSource) {
    try { evtSource.close(); } catch (e) {}
    evtSource = null;
  }
  if (sseReconnectTimer) {
    clearTimeout(sseReconnectTimer);
    sseReconnectTimer = null;
  }

  evtSource = new EventSource('/api/events');

  evtSource.addEventListener('log', (e) => {
    try {
      const log = JSON.parse(e.data);
      appendLog(log);
    } catch (err) {}
  });

  evtSource.addEventListener('bot-status-changed', (e) => {
    try {
      fetchAccounts();
      fetchStatusOnly();
    } catch (err) {}
  });

  evtSource.addEventListener('clear-logs', () => {
    terminalLogList.innerHTML = '';
    allLogs = [];
    logCountElem.textContent = '0';
  });

  evtSource.onerror = () => {
    if (evtSource) evtSource.close();
    evtSource = null;
    if (!sseReconnectTimer) {
      sseReconnectTimer = setTimeout(initSSE, 5000);
    }
  };
}

// Control buttons
btnStart.addEventListener('click', async () => {
  btnStart.disabled = true;
  try {
    const res = await fetch('/api/start', { method: 'POST', headers: getHeaders() });
    const data = await res.json();
    if (!data.success) {
      alert(data.message || 'Không thể bắt đầu bot!');
    }
    await fetchAccounts();
    await fetchStatusOnly();
  } catch (err) {
    alert('Lỗi: ' + err.message);
  } finally {
    btnStart.disabled = false;
  }
});

btnStop.addEventListener('click', async () => {
  btnStop.disabled = true;
  try {
    const res = await fetch('/api/stop', { method: 'POST', headers: getHeaders() });
    const data = await res.json();
    if (!data.success) {
      alert(data.message || 'Lỗi dừng bot!');
    }
    await fetchAccounts();
    await fetchStatusOnly();
  } catch (err) {
    alert('Lỗi: ' + err.message);
  } finally {
    btnStop.disabled = false;
  }
});

btnRestart.addEventListener('click', async () => {
  if (!confirm('Bạn có chắc muốn khởi động lại tất cả bot?')) return;
  btnRestart.disabled = true;
  try {
    const res = await fetch('/api/restart', { method: 'POST', headers: getHeaders() });
    const data = await res.json();
    if (!data.success) {
      alert(data.message || 'Lỗi khởi động lại bot!');
    }
    setTimeout(async () => {
      await fetchAccounts();
      await fetchStatusOnly();
    }, 2000);
  } catch (err) {
    alert('Lỗi: ' + err.message);
  } finally {
    btnRestart.disabled = false;
  }
});

btnClearLog.addEventListener('click', async () => {
  try {
    await fetch('/api/clear-logs', { method: 'POST', headers: getHeaders() });
    terminalLogList.innerHTML = '';
    allLogs = [];
    logCountElem.textContent = '0';
  } catch (err) {}
});

btnDownloadLog.addEventListener('click', () => {
  let fullText = '';
  allLogs.forEach(l => {
    fullText += `[${l.timestamp || '--:--:--'}] ${l.text}\n`;
  });
  const blob = new Blob([fullText], { type: 'text/plain;charset=utf-8' });
  const url = URL.createObjectURL(blob);
  const a = document.createElement('a');
  a.href = url;
  a.download = `avatar_bot_logs_${new Date().toISOString().slice(0, 10)}.log`;
  a.click();
  URL.revokeObjectURL(url);
});

// Settings Modal
btnSettings.addEventListener('click', async () => {
  try {
    const res = await fetch('/api/config', { headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      const cfg = data.config;
      document.getElementById('cfgAppId').value = cfg.appId || 'avatar_main';
      document.getElementById('cfgRmsMode').value = cfg.rmsMode || 'file';
      document.getElementById('cfgMaxMemory').value = cfg.maxMemoryMb || 256;
      document.getElementById('cfgAutoRestart').checked = Boolean(cfg.autoRestart);
      document.getElementById('cfgAutoStart').checked = Boolean(cfg.autoStart);
      
      const p = cfg.proxy || {};
      document.getElementById('cfgProxyEnabled').checked = Boolean(p.enabled);
      document.getElementById('cfgProxyType').value = p.type || 'socks';
      document.getElementById('cfgProxyHost').value = p.host || '';
      document.getElementById('cfgProxyPort').value = p.port || '';
      document.getElementById('cfgPassword').value = '';

      settingsModal.style.display = 'flex';
    }
  } catch (err) {
    alert('Lỗi lấy cấu hình: ' + err.message);
  }
});

function closeSettingsModal() {
  settingsModal.style.display = 'none';
}

btnCloseModal.addEventListener('click', closeSettingsModal);
btnCancelSettings.addEventListener('click', closeSettingsModal);

formSettings.addEventListener('submit', async (e) => {
  e.preventDefault();

  const payload = {
    appId: document.getElementById('cfgAppId').value.trim(),
    rmsMode: document.getElementById('cfgRmsMode').value,
    maxMemoryMb: parseInt(document.getElementById('cfgMaxMemory').value, 10),
    autoRestart: document.getElementById('cfgAutoRestart').checked,
    autoStart: document.getElementById('cfgAutoStart').checked,
    proxy: {
      enabled: document.getElementById('cfgProxyEnabled').checked,
      type: document.getElementById('cfgProxyType').value,
      host: document.getElementById('cfgProxyHost').value.trim(),
      port: document.getElementById('cfgProxyPort').value.trim()
    }
  };

  const newPass = document.getElementById('cfgPassword').value;
  if (newPass) {
    payload.password = newPass;
    authToken = newPass;
    localStorage.setItem('avatar_bot_token', authToken);
  }

  try {
    const res = await fetch('/api/config', {
      method: 'POST',
      headers: getHeaders(),
      body: JSON.stringify(payload)
    });
    const data = await res.json();
    if (data.success) {
      alert('✓ Đã lưu cài đặt thành công!');
      closeSettingsModal();
    } else {
      alert(data.message || 'Lỗi lưu cấu hình');
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
  }
});

// JRE Install button
btnInstallJre.addEventListener('click', async () => {
  btnInstallJre.disabled = true;
  try {
    const res = await fetch('/api/jre/install', { method: 'POST', headers: getHeaders() });
    const data = await res.json();
    if (data.success) {
      jreProgressWrapper.style.display = 'block';
    } else {
      alert(data.message || 'Không thể bắt đầu tải Java');
      btnInstallJre.disabled = false;
    }
  } catch (err) {
    alert('Lỗi: ' + err.message);
    btnInstallJre.disabled = false;
  }
});

// Initialize on page load
document.addEventListener('DOMContentLoaded', async () => {
  await fetchFiles();
  await fetchAccounts();
  await fetchInitialData();
  initSSE();
});
