const fs = require('fs');
const path = require('path');
const { execSync } = require('child_process');
const https = require('https');
const JavaDetector = require('./JavaDetector');

const WORKSPACE_ROOT = path.resolve(__dirname, '../../../');
const JRE_DIR = path.join(WORKSPACE_ROOT, 'jre');
const JDK_DIR = path.join(WORKSPACE_ROOT, 'jdk');

// Eclipse Temurin OpenJDK 8 (Java 8 LTS - 8u402b06) Linux x64 & Windows x64 binaries
// Siêu nhẹ, tối ưu luồng (threads) và RAM tối đa cho Game Avatar & MicroEmulator trên hosting cPanel
const JRE_URLS = {
  linux_x64: 'https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u402-b06/OpenJDK8U-jre_x64_linux_hotspot_8u402b06.tar.gz',
  win_x64: 'https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u402-b06/OpenJDK8U-jre_x64_windows_hotspot_8u402b06.zip'
};

const JDK_URLS = {
  linux_x64: 'https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u402-b06/OpenJDK8U-jdk_x64_linux_hotspot_8u402b06.tar.gz',
  win_x64: 'https://github.com/adoptium/temurin8-binaries/releases/download/jdk8u402-b06/OpenJDK8U-jdk_x64_windows_hotspot_8u402b06.zip'
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

async function _installOpenJdkArchive({ urls, targetDir, archivePrefix, kindLabel, findExecutable, onProgress = () => {} }) {
  if (isInstalling) throw new Error(`Đang trong quá trình tải và cài đặt ${kindLabel}, vui lòng đợi...`);
  isInstalling = true;

  try {
    const isLinux = process.platform === 'linux';
    const isWin = process.platform === 'win32';
    const arch = process.arch;

    if (arch !== 'x64') {
      throw new Error(`Kiến trúc CPU ${arch} không được hỗ trợ tự động tải ${kindLabel}.`);
    }

    let downloadUrl = null;
    let archiveName = null;

    if (isLinux) {
      downloadUrl = urls.linux_x64;
      archiveName = `${archivePrefix}_linux.tar.gz`;
    } else if (isWin) {
      downloadUrl = urls.win_x64;
      archiveName = `${archivePrefix}_win.zip`;
    } else {
      throw new Error(`Hệ điều hành ${process.platform} không được hỗ trợ tải tự động ${kindLabel}.`);
    }

    if (!fs.existsSync(targetDir)) {
      fs.mkdirSync(targetDir, { recursive: true });
    }

    const archivePath = path.join(WORKSPACE_ROOT, archiveName);

    onProgress({ percent: 5, message: `Bắt đầu kết nối tải Portable OpenJDK 8 (${kindLabel})...` });
    await downloadWithRedirect(downloadUrl, archivePath, onProgress);

    onProgress({ percent: 85, message: `Đang giải nén bộ cài OpenJDK 8 (${kindLabel})...` });

    if (isLinux) {
      execSync(`tar -xzf "${archivePath}" -C "${targetDir}" --strip-components=1`, { stdio: 'ignore' });
    } else if (isWin) {
      execSync(`powershell -command "Expand-Archive -Path '${archivePath}' -DestinationPath '${targetDir}' -Force"`, { stdio: 'ignore' });
      // If extracted into a subfolder jdk8... or jre8..., flatten it
      const subdirs = fs.readdirSync(targetDir).filter(f => fs.statSync(path.join(targetDir, f)).isDirectory());
      if (subdirs.length === 1 && (subdirs[0].includes('jdk') || subdirs[0].includes('jre'))) {
        const nestedDir = path.join(targetDir, subdirs[0]);
        const innerFiles = fs.readdirSync(nestedDir);
        for (const f of innerFiles) {
          const src = path.join(nestedDir, f);
          const dst = path.join(targetDir, f);
          if (fs.existsSync(dst)) {
            if (fs.statSync(dst).isDirectory()) fs.rmSync(dst, { recursive: true, force: true });
            else fs.unlinkSync(dst);
          }
          fs.renameSync(src, dst);
        }
        try { fs.rmdirSync(nestedDir); } catch (e) {}
      }
    }

    if (fs.existsSync(archivePath)) {
      try { fs.unlinkSync(archivePath); } catch (e) {}
    }

    const binPath = findExecutable();
    if (!binPath) {
      throw new Error(`Đã giải nén ${kindLabel} nhưng không tìm thấy file thực thi trong thư mục bin`);
    }

    if (isLinux) {
      try { execSync(`chmod +x "${binPath}"`, { stdio: 'ignore' }); } catch (e) {}
    }

    const javaInfo = JavaDetector.getJavaInfo();
    const version = javaInfo.available ? javaInfo.version : 'OpenJDK 8';
    onProgress({ percent: 100, message: `Cài đặt OpenJDK 8 (${kindLabel}) thành công! (${version})`, ready: true });
    return { success: true, javaBin: binPath, binPath, version };
  } catch (err) {
    onProgress({ percent: 0, message: `Lỗi cài đặt ${kindLabel}: ${err.message}`, ready: false, error: err.message });
    throw err;
  } finally {
    isInstalling = false;
  }
}

async function downloadAndInstallJRE(onProgress) {
  return _installOpenJdkArchive({
    urls: JRE_URLS,
    targetDir: JRE_DIR,
    archivePrefix: 'temurin_jre',
    kindLabel: 'JRE',
    findExecutable: () => JavaDetector.findJavaExecutable(),
    onProgress
  });
}

async function downloadAndInstallJDK(onProgress) {
  return _installOpenJdkArchive({
    urls: JDK_URLS,
    targetDir: JDK_DIR,
    archivePrefix: 'temurin_jdk',
    kindLabel: 'JDK',
    findExecutable: () => JavaDetector.findJavacExecutable(),
    onProgress
  });
}

module.exports = {
  get isInstalling() { return isInstalling; },
  get progress() { return currentProgress; },
  downloadAndInstallJRE,
  downloadAndInstallJDK
};
