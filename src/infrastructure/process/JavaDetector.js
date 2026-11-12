const { execSync } = require('child_process');
const path = require('path');
const fs = require('fs');
const config = require('../../../config');

/**
 * JavaDetector (Infrastructure Layer)
 * Detects Java runtime on Windows and Linux/cPanel.
 */
class JavaDetector {
  static _findExecutable(exeBaseName, customPath = '') {
    const isWindows = process.platform === 'win32';
    const exeName = isWindows ? `${exeBaseName}.exe` : exeBaseName;

    const ensureExecutable = (filePath) => {
      try {
        if (!isWindows) fs.chmodSync(filePath, 0o755);
      } catch (e) {}
      return filePath;
    };

    // 1. Explicit path in config
    if (customPath && fs.existsSync(customPath)) {
      return ensureExecutable(customPath);
    }

    // 2. Portable JRE / JDK inside workspace
    const workspaceRoot = path.resolve(__dirname, '../../../');
    for (const dirName of ['jdk', 'jre']) {
      const baseDir = path.join(workspaceRoot, dirName);
      const directPath = path.join(baseDir, 'bin', exeName);
      if (fs.existsSync(directPath)) {
        return ensureExecutable(directPath);
      }
      if (fs.existsSync(baseDir)) {
        try {
          for (const item of fs.readdirSync(baseDir)) {
            const subBin = path.join(baseDir, item, 'bin', exeName);
            if (fs.existsSync(subBin)) {
              return ensureExecutable(subBin);
            }
          }
        } catch (e) {}
      }
    }

    // 3. JAVA_HOME environment variable
    if (config.java.javaHome) {
      const javaHomeBin = path.join(config.java.javaHome, 'bin', exeName);
      if (fs.existsSync(javaHomeBin)) {
        return javaHomeBin;
      }
    }

    // 4. Common system installation paths on Linux
    if (!isWindows) {
      const commonLinuxDirs = [
        '/usr/bin',
        '/usr/local/bin',
        '/usr/lib/jvm/default-java/bin',
        '/usr/lib/jvm/java-17-openjdk/bin',
        '/usr/lib/jvm/java-17-openjdk-amd64/bin',
        '/usr/lib/jvm/java-21-openjdk/bin',
        '/usr/lib/jvm/java-21-openjdk-amd64/bin',
        '/usr/lib/jvm/java-11-openjdk/bin',
        '/usr/lib/jvm/java-11-openjdk-amd64/bin',
        '/usr/lib/jvm/java-1.8.0-openjdk/bin',
        '/usr/java/latest/bin',
        '/opt/java/bin'
      ];
      for (const dir of commonLinuxDirs) {
        const p = path.join(dir, exeName);
        if (fs.existsSync(p)) {
          return p;
        }
      }
    }

    // 5. PATH search via which / where
    try {
      const testCmd = isWindows ? `where ${exeBaseName}` : `which ${exeBaseName}`;
      const sysPath = execSync(testCmd, { encoding: 'utf8', timeout: 3000 }).trim().split(/\r?\n/)[0].trim();
      if (sysPath && fs.existsSync(sysPath)) {
        return sysPath;
      }
    } catch (e) {}

    // 6. Direct command fallback
    try {
      execSync(`${exeBaseName} -version`, { stdio: 'ignore', timeout: 3000 });
      return exeBaseName;
    } catch (e) {
      // not in path
    }

    return null;
  }

  static findJavaExecutable(customPath = '') {
    return this._findExecutable('java', customPath);
  }

  static findJavacExecutable(customPath = '') {
    return this._findExecutable('javac', customPath);
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
