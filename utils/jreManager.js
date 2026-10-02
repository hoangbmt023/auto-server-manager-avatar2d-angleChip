const fs = require('fs');
const path = require('path');
const os = require('os');
const { exec, execSync, spawn } = require('child_process');
const https = require('https');

const JRE_DIR = path.join(__dirname, '..', 'jre');

// Eclipse Temurin OpenJDK 17 Linux x64 & Windows x64 binaries
const JRE_URLS = {
  linux_x64: 'https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.10%2B7/OpenJDK17U-jre_x64_linux_hotspot_17.0.10_7.tar.gz',
  win_x64: 'https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.10%2B7/OpenJDK17U-jre_x64_windows_hotspot_17.0.10_7.zip'
};

function getExecutableName() {
  return process.platform === 'win32' ? 'java.exe' : 'java';
}

function findJavaExecutable(customPath) {
  // 1. Custom configured path
  if (customPath && fs.existsSync(customPath)) {
    return customPath;
  }

  // 2. Check local bundled ./jre/bin/java
  const localBin = path.join(JRE_DIR, 'bin', getExecutableName());
  if (fs.existsSync(localBin)) {
    if (process.platform !== 'win32') {
      try {
        fs.chmodSync(localBin, 0o755);
      } catch (e) {}
    }
    return localBin;
  }

  // Check subdirectories in jre/ (e.g., jre/jdk-17.0.10+7-jre/bin/java)
  if (fs.existsSync(JRE_DIR)) {
    try {
      const items = fs.readdirSync(JRE_DIR);
      for (const item of items) {
        const subBin = path.join(JRE_DIR, item, 'bin', getExecutableName());
        if (fs.existsSync(subBin)) {
          if (process.platform !== 'win32') {
            try {
              fs.chmodSync(subBin, 0o755);
            } catch (e) {}
          }
          return subBin;
        }
      }
    } catch (e) {}
  }

  // 3. Check system PATH
  try {
    const testCmd = process.platform === 'win32' ? 'where java' : 'which java';
    const sysPath = execSync(testCmd, { encoding: 'utf-8', timeout: 3000 }).trim().split('\n')[0].trim();
    if (sysPath && fs.existsSync(sysPath)) {
      return sysPath;
    }
  } catch (e) {}

  return null;
}

function checkJavaVersion(javaPath) {
  return new Promise((resolve) => {
    if (!javaPath) {
      return resolve({ available: false, version: 'Chưa cài đặt Java', path: null });
    }
    exec(`"${javaPath}" -version`, { timeout: 5000 }, (err, stdout, stderr) => {
      const output = (stderr || stdout || '').trim();
      if (!err || output.includes('version')) {
        const firstLine = output.split('\n')[0] || 'Java đã sẵn sàng';
        resolve({ available: true, version: firstLine.trim(), path: javaPath });
      } else {
        resolve({ available: false, version: 'Lỗi thực thi Java', path: javaPath });
      }
    });
  });
}

function downloadFile(url, destPath, onProgress) {
  return new Promise((resolve, reject) => {
    const file = fs.createWriteStream(destPath);
    const request = (targetUrl) => {
      https.get(targetUrl, (response) => {
        if (response.statusCode >= 300 && response.statusCode < 400 && response.headers.location) {
          return request(response.headers.location);
        }
        if (response.statusCode !== 200) {
          return reject(new Error(`Tải thất bại, HTTP Code: ${response.statusCode}`));
        }

        const totalBytes = parseInt(response.headers['content-length'] || '0', 10);
        let downloadedBytes = 0;

        response.on('data', (chunk) => {
          downloadedBytes += chunk.length;
          file.write(chunk);
          if (totalBytes > 0 && onProgress) {
            const percent = Math.round((downloadedBytes / totalBytes) * 100);
            onProgress(percent, downloadedBytes, totalBytes);
          }
        });

        response.on('end', () => {
          file.end();
          resolve(destPath);
        });

        response.on('error', (err) => {
          fs.unlink(destPath, () => {});
          reject(err);
        });
      }).on('error', (err) => {
        fs.unlink(destPath, () => {});
        reject(err);
      });
    };
    request(url);
  });
}

async function installPortableJRE(onProgress) {
  const isLinux = process.platform === 'linux';
  const url = isLinux ? JRE_URLS.linux_x64 : JRE_URLS.win_x64;
  
  if (!fs.existsSync(JRE_DIR)) {
    fs.mkdirSync(JRE_DIR, { recursive: true });
  }

  const archiveName = isLinux ? 'jre.tar.gz' : 'jre.zip';
  const archivePath = path.join(JRE_DIR, archiveName);

  if (onProgress) onProgress(0, 'Đang tải bản OpenJDK Portable...');
  await downloadFile(url, archivePath, (percent) => {
    if (onProgress) onProgress(percent, `Đang tải: ${percent}%`);
  });

  if (onProgress) onProgress(100, 'Đang giải nén JRE...');

  if (isLinux) {
    try {
      execSync(`tar -xzf "${archivePath}" --strip-components=1 -C "${JRE_DIR}"`, { timeout: 30000 });
      fs.unlinkSync(archivePath);
      const javaBin = path.join(JRE_DIR, 'bin', 'java');
      if (fs.existsSync(javaBin)) {
        fs.chmodSync(javaBin, 0o755);
      }
      return javaBin;
    } catch (e) {
      throw new Error(`Lỗi giải nén tar.gz: ${e.message}`);
    }
  } else {
    // Windows zip extraction via powershell
    try {
      execSync(`powershell -Command "Expand-Archive -Path '${archivePath}' -DestinationPath '${JRE_DIR}' -Force"`, { timeout: 60000 });
      fs.unlinkSync(archivePath);
      return findJavaExecutable();
    } catch (e) {
      throw new Error(`Lỗi giải nén zip: ${e.message}`);
    }
  }
}

module.exports = {
  findJavaExecutable,
  checkJavaVersion,
  installPortableJRE,
  JRE_DIR
};
