const { execSync } = require('child_process');
const path = require('path');
const fs = require('fs');

/**
 * JavaDetector (Infrastructure Layer)
 * Detects Java runtime on Windows and Linux/cPanel.
 */
class JavaDetector {
  static findJavaExecutable(customPath = '') {
    const isWindows = process.platform === 'win32';
    const exeName = isWindows ? 'java.exe' : 'java';

    // 1. Explicit path in config
    if (customPath && fs.existsSync(customPath)) {
      try {
        if (!isWindows) fs.chmodSync(customPath, 0o755);
      } catch (e) {}
      return customPath;
    }

    // 2. Portable JRE inside workspace
    const workspaceRoot = path.resolve(__dirname, '../../../');
    const jreDir = path.join(workspaceRoot, 'jre');

    // 2a. Direct jre/bin/java
    const portablePath = path.join(jreDir, 'bin', exeName);
    if (fs.existsSync(portablePath)) {
      try {
        if (!isWindows) fs.chmodSync(portablePath, 0o755);
      } catch (e) {}
      return portablePath;
    }

    // 2b. Subdirectories in jre/ (e.g., jre/jdk-17.0.10+7-jre/bin/java)
    if (fs.existsSync(jreDir)) {
      try {
        const items = fs.readdirSync(jreDir);
        for (const item of items) {
          const subBin = path.join(jreDir, item, 'bin', exeName);
          if (fs.existsSync(subBin)) {
            try {
              if (!isWindows) fs.chmodSync(subBin, 0o755);
            } catch (e) {}
            return subBin;
          }
        }
      } catch (e) {}
    }

    // 3. JAVA_HOME environment variable
    if (process.env.JAVA_HOME) {
      const javaHomeBin = path.join(process.env.JAVA_HOME, 'bin', exeName);
      if (fs.existsSync(javaHomeBin)) {
        return javaHomeBin;
      }
    }

    // 4. Common system installation paths on Linux
    if (!isWindows) {
      const commonLinuxPaths = [
        '/usr/bin/java',
        '/usr/local/bin/java',
        '/usr/lib/jvm/default-java/bin/java',
        '/usr/lib/jvm/java-17-openjdk/bin/java',
        '/usr/lib/jvm/java-17-openjdk-amd64/bin/java',
        '/usr/lib/jvm/java-21-openjdk/bin/java',
        '/usr/lib/jvm/java-21-openjdk-amd64/bin/java',
        '/usr/lib/jvm/java-11-openjdk/bin/java',
        '/usr/lib/jvm/java-11-openjdk-amd64/bin/java',
        '/usr/lib/jvm/java-1.8.0-openjdk/bin/java',
        '/usr/java/latest/bin/java',
        '/opt/java/bin/java'
      ];
      for (const p of commonLinuxPaths) {
        if (fs.existsSync(p)) {
          return p;
        }
      }
    }

    // 5. PATH search via which / where
    try {
      const testCmd = isWindows ? 'where java' : 'which java';
      const sysPath = execSync(testCmd, { encoding: 'utf8', timeout: 3000 }).trim().split('\n')[0].trim();
      if (sysPath && fs.existsSync(sysPath)) {
        return sysPath;
      }
    } catch (e) {}

    // 6. Direct command fallback
    try {
      execSync('java -version', { stdio: 'ignore', timeout: 3000 });
      return 'java';
    } catch (e) {
      // not in path
    }

    return null;
  }

  static getJavaInfo(customPath = '') {
    const javaBin = this.findJavaExecutable(customPath);
    if (!javaBin) {
      return { available: false, version: 'Không tìm thấy Java', path: null };
    }

    try {
      const output = execSync(`"${javaBin}" -version 2>&1`, { encoding: 'utf8', timeout: 5000 });
      const lines = output.split('\n').map(l => l.trim()).filter(Boolean);
      // Filter out JAVA_TOOL_OPTIONS noise
      let versionLine = lines.find(l => !l.startsWith('Picked up JAVA_TOOL_OPTIONS') && (l.includes('version') || l.includes('openjdk') || l.includes('Runtime')));
      if (!versionLine) versionLine = lines[0] || 'Java đã sẵn sàng';
      return { available: true, version: versionLine, path: javaBin };
    } catch (err) {
      return { available: false, version: 'Lỗi kiểm tra: ' + err.message, path: javaBin };
    }
  }
}

module.exports = JavaDetector;
