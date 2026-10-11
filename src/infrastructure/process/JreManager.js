const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');
const https = require('https');
const JavaDetector = require('./JavaDetector');

const WORKSPACE_ROOT = path.resolve(__dirname, '../../../');
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
          const percent = Math.min(95, Math.floor((downloadedBytes / totalBytes) * 80));
          const mbDownloaded = (downloadedBytes / 1024 / 1024).toFixed(1);
          const mbTotal = (totalBytes / 1024 / 1024).toFixed(1);
          onProgress({
            percent,
            message: `Đang tải OpenJDK 17 (${mbDownloaded}MB / ${mbTotal}MB)...`
          });
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

    req.setTimeout(60000, () => {
      req.abort();
      file.close();
      fs.unlink(destPath, () => {});
      reject(new Error('Kết nối tải OpenJDK bị quá hạn (Timeout)'));
    });
  });
}

async function downloadAndInstallJRE(onProgress) {
  if (isInstalling) throw new Error('Đang trong quá trình tải và cài đặt JRE, vui lòng đợi...');
  isInstalling = true;

  try {
    const isLinux = process.platform === 'linux';
    const isWin = process.platform === 'win32';
    const arch = process.arch;

    if (arch !== 'x64') {
      throw new Error(`Kiến trúc CPU ${arch} không được hỗ trợ tự động tải JRE.`);
    }

    let downloadUrl = null;
    let archiveName = null;

    if (isLinux) {
      downloadUrl = JRE_URLS.linux_x64;
      archiveName = 'temurin_jre_linux.tar.gz';
    } else if (isWin) {
      downloadUrl = JRE_URLS.win_x64;
      archiveName = 'temurin_jre_win.zip';
    } else {
      throw new Error(`Hệ điều hành ${process.platform} không được hỗ trợ tải tự động JRE.`);
    }

    if (!fs.existsSync(JRE_DIR)) {
      fs.mkdirSync(JRE_DIR, { recursive: true });
    }

    const archivePath = path.join(WORKSPACE_ROOT, archiveName);

    onProgress({ percent: 5, message: 'Bắt đầu kết nối tải Portable OpenJDK 17...' });
    await downloadWithRedirect(downloadUrl, archivePath, onProgress);

    onProgress({ percent: 85, message: 'Đang giải nén bộ cài OpenJDK 17 vào thư mục jre/...' });

    if (isLinux) {
      execSync(`tar -xzf "${archivePath}" -C "${JRE_DIR}" --strip-components=1`, { stdio: 'ignore' });
    } else if (isWin) {
      execSync(`powershell -command "Expand-Archive -Path '${archivePath}' -DestinationPath '${JRE_DIR}' -Force"`, { stdio: 'ignore' });
      // If extracted into a subfolder jdk-17..., flatten it
      const subdirs = fs.readdirSync(JRE_DIR).filter(f => fs.statSync(path.join(JRE_DIR, f)).isDirectory());
      if (subdirs.length === 1 && subdirs[0].includes('jdk')) {
        const nestedDir = path.join(JRE_DIR, subdirs[0]);
        const innerFiles = fs.readdirSync(nestedDir);
        for (const f of innerFiles) {
          const src = path.join(nestedDir, f);
          const dst = path.join(JRE_DIR, f);
          if (fs.existsSync(dst)) {
            if (fs.statSync(dst).isDirectory()) fs.rmdirSync(dst, { recursive: true });
            else fs.unlinkSync(dst);
          }
          fs.renameSync(src, dst);
        }
        try { fs.rmdirSync(nestedDir); } catch(e){}
      }
    }

    // Clean up archive
    if (fs.existsSync(archivePath)) {
      try { fs.unlinkSync(archivePath); } catch (e) {}
    }

    // Check executable
    const javaBin = JavaDetector.findJavaExecutable();
    if (!javaBin) {
      throw new Error('Đã giải nén JRE nhưng không tìm thấy file thực thi java trong thư mục jre/bin');
    }

    // Set permission executable on Linux
    if (isLinux) {
      try { execSync(`chmod +x "${javaBin}"`, { stdio: 'ignore' }); } catch (e) {}
    }

    const version = JavaDetector.getJavaVersion(javaBin);
    onProgress({ percent: 100, message: `Cài đặt OpenJDK 17 thành công! (${version || 'Java 17'})`, ready: true });
    return { success: true, javaBin, version };
  } catch (err) {
    onProgress({ percent: 0, message: `Lỗi cài đặt JRE: ${err.message}`, ready: false, error: err.message });
    throw err;
  } finally {
    isInstalling = false;
  }
}

module.exports = {
  get isInstalling() { return isInstalling; },
  get progress() { return currentProgress; },
  downloadAndInstallJRE
};
