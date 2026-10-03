const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');
const https = require('https');
const JavaDetector = require('../src/infrastructure/process/JavaDetector');

const WORKSPACE_ROOT = path.resolve(__dirname, '..');
const JRE_DIR = path.join(WORKSPACE_ROOT, 'jre');

// Eclipse Temurin OpenJDK 17 Linux x64 & Windows x64 binaries
const JRE_URLS = {
  linux_x64: 'https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.10%2B7/OpenJDK17U-jre_x64_linux_hotspot_17.0.10_7.tar.gz',
  win_x64: 'https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.10%2B7/OpenJDK17U-jre_x64_windows_hotspot_17.0.10_7.zip'
};

let isInstalling = false;
let currentProgress = { percent: 0, message: '', ready: false };

function downloadWithRedirect(url, destPath, onProgress, maxRedirects = 5) {
  return new Promise((resolve, reject) => {
    if (maxRedirects <= 0) return reject(new Error('Quá nhiều chuyển hướng khi tải file (Too many redirects)'));

    const file = fs.createWriteStream(destPath);
    let downloadedBytes = 0;

    const req = https.get(url, (res) => {
      if (res.statusCode >= 300 && res.statusCode < 400 && res.headers.location) {
        file.close();
        fs.unlink(destPath, () => {});
        return resolve(downloadWithRedirect(res.headers.location, destPath, onProgress, maxRedirects - 1));
      }

      if (res.statusCode !== 200) {
        file.close();
        fs.unlink(destPath, () => {});
        return reject(new Error(`Tải thất bại từ máy chủ, mã HTTP: ${res.statusCode}`));
      }

      const totalBytes = parseInt(res.headers['content-length'] || '0', 10);

      res.on('data', (chunk) => {
        downloadedBytes += chunk.length;
        if (totalBytes > 0 && onProgress) {
          const percent = Math.min(99, Math.round((downloadedBytes / totalBytes) * 100));
          const mbDownloaded = (downloadedBytes / (1024 * 1024)).toFixed(1);
          const mbTotal = (totalBytes / (1024 * 1024)).toFixed(1);
          onProgress(percent, `Đang tải OpenJDK 17: ${percent}% (${mbDownloaded}/${mbTotal} MB)`);
        } else if (onProgress) {
          const mbDownloaded = (downloadedBytes / (1024 * 1024)).toFixed(1);
          onProgress(50, `Đang tải OpenJDK 17: ${mbDownloaded} MB...`);
        }
      });

      res.pipe(file);

      file.on('finish', () => {
        file.close(() => resolve(destPath));
      });
    });

    req.on('error', (err) => {
      file.close();
      fs.unlink(destPath, () => {});
      reject(err);
    });

    file.on('error', (err) => {
      file.close();
      fs.unlink(destPath, () => {});
      reject(err);
    });
  });
}

async function downloadAndInstallJRE(onProgress, configRepo = null) {
  if (isInstalling) {
    throw new Error('Đang trong quá trình tải và cài đặt JRE...');
  }

  isInstalling = true;
  const updateProgress = (percent, message, ready = false) => {
    currentProgress = { percent, message, ready };
    if (typeof onProgress === 'function') {
      try {
        onProgress(currentProgress);
      } catch (e) {}
    }
  };

  try {
    const isLinux = process.platform === 'linux';
    const isWin = process.platform === 'win32';
    const url = isLinux ? JRE_URLS.linux_x64 : JRE_URLS.win_x64;

    if (!fs.existsSync(JRE_DIR)) {
      fs.mkdirSync(JRE_DIR, { recursive: true });
    }

    const archiveName = isLinux ? 'openjdk17.tar.gz' : 'openjdk17.zip';
    const archivePath = path.join(JRE_DIR, archiveName);

    updateProgress(5, 'Bắt đầu kết nối tải Portable OpenJDK 17...', false);

    // 1. Download archive with redirect handling
    await downloadWithRedirect(url, archivePath, (percent, msg) => {
      updateProgress(percent, msg, false);
    });

    // 2. Extract archive
    updateProgress(92, 'Đang giải nén bộ cài OpenJDK 17 vào thư mục jre/...', false);

    if (isLinux) {
      try {
        // Try extracting with strip-components=1 directly into JRE_DIR
        execSync(`tar -xzf "${archivePath}" --strip-components=1 -C "${JRE_DIR}"`, { timeout: 60000 });
      } catch (tarErr) {
        // Fallback without strip-components
        execSync(`tar -xzf "${archivePath}" -C "${JRE_DIR}"`, { timeout: 60000 });
      }
      try { fs.unlinkSync(archivePath); } catch (e) {}
    } else {
      // Windows extraction
      try {
        // tar.exe is standard on Windows 10/11
        execSync(`tar -xf "${archivePath}" -C "${JRE_DIR}"`, { timeout: 90000 });
      } catch (tarErr) {
        execSync(`powershell -Command "Expand-Archive -Path '${archivePath}' -DestinationPath '${JRE_DIR}' -Force"`, { timeout: 90000 });
      }
      try { fs.unlinkSync(archivePath); } catch (e) {}
    }

    // 3. Locate & verify the extracted Java executable
    updateProgress(98, 'Đang kiểm tra và cấp quyền thực thi cho Java...', false);
    const javaBin = JavaDetector.findJavaExecutable('');
    if (!javaBin) {
      throw new Error('Đã giải nén nhưng không tìm thấy file thực thi java trong thư mục jre/');
    }

    // 4. Save into config if configRepo is available
    if (configRepo && typeof configRepo.get === 'function' && typeof configRepo.save === 'function') {
      try {
        const cfg = configRepo.get();
        cfg.javaPath = javaBin;
        configRepo.save(cfg);
      } catch (e) {
        console.error('Không thể tự động lưu javaPath vào config:', e.message);
      }
    }

    updateProgress(100, '✅ Đã cài đặt và kích hoạt Portable OpenJDK 17 thành công!', true);
    return { success: true, javaBin };
  } catch (err) {
    updateProgress(0, `❌ Lỗi cài đặt Java: ${err.message}`, false);
    throw err;
  } finally {
    isInstalling = false;
  }
}

function findJavaExecutable(customPath) {
  return JavaDetector.findJavaExecutable(customPath);
}

function checkJavaVersion(javaPath) {
  return Promise.resolve(JavaDetector.getJavaInfo(javaPath));
}

module.exports = {
  get isInstalling() {
    return isInstalling;
  },
  get progress() {
    return currentProgress;
  },
  downloadAndInstallJRE,
  installPortableJRE: downloadAndInstallJRE,
  findJavaExecutable,
  checkJavaVersion,
  JRE_DIR
};
