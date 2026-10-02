const { execSync } = require('child_process');
const path = require('path');
const fs = require('fs');

/**
 * JavaDetector (Infrastructure Layer)
 * Detects Java runtime on Windows and Linux/cPanel.
 */
class JavaDetector {
  static findJavaExecutable(customPath = '') {
    // 1. Explicit path in config
    if (customPath && fs.existsSync(customPath)) {
      return customPath;
    }

    // 2. Portable JRE inside workspace
    const isWindows = process.platform === 'win32';
    const portableRelative = isWindows ? 'jre/bin/java.exe' : 'jre/bin/java';
    const workspaceRoot = path.resolve(__dirname, '../../../');
    const portablePath = path.join(workspaceRoot, portableRelative);
    if (fs.existsSync(portablePath)) {
      return portablePath;
    }

    // 3. JAVA_HOME environment variable
    if (process.env.JAVA_HOME) {
      const javaHomeBin = path.join(process.env.JAVA_HOME, 'bin', isWindows ? 'java.exe' : 'java');
      if (fs.existsSync(javaHomeBin)) {
        return javaHomeBin;
      }
    }

    // 4. PATH search
    try {
      execSync('java -version', { stdio: 'ignore' });
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
      const output = execSync(`"${javaBin}" -version 2>&1`, { encoding: 'utf8' });
      const firstLine = output.split('\n')[0].trim();
      return { available: true, version: firstLine, path: javaBin };
    } catch (err) {
      return { available: false, version: 'Lỗi kiểm tra: ' + err.message, path: javaBin };
    }
  }
}

module.exports = JavaDetector;
