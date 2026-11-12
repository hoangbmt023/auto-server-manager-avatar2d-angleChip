const fs = require('fs');
const path = require('path');
const { execFileSync } = require('child_process');
const JavaDetector = require('../src/infrastructure/process/JavaDetector');
const JreManager = require('../src/infrastructure/process/JreManager');

const ROOT = path.resolve(__dirname, '..');
const SRC_DIR = path.join(ROOT, 'java-engine', 'src');
const BIN_DIR = path.join(ROOT, 'java-engine', 'bin');
const EMULATOR_JAR = path.join(ROOT, 'jars', 'emulator', 'AngelChipEmulator_V2Proxy.jar');

async function main() {
  let javacBin = JavaDetector.findJavacExecutable();

  if (!javacBin) {
    console.log('⚠️ Không tìm thấy javac trên hệ thống. Đang tự động tải Portable OpenJDK 17 (JDK)...');
    let lastMsg = '';
    const res = await JreManager.downloadAndInstallJDK((progress) => {
      if (progress && progress.message && progress.message !== lastMsg) {
        lastMsg = progress.message;
        console.log(`   [${progress.percent ?? 0}%] ${progress.message}`);
      }
    });
    javacBin = res.binPath || JavaDetector.findJavacExecutable();
  }

  if (!javacBin) {
    throw new Error('Không tìm thấy javac sau khi cài đặt JDK!');
  }

  fs.mkdirSync(BIN_DIR, { recursive: true });
  const srcs = fs.readdirSync(SRC_DIR)
    .filter((f) => f.endsWith('.java'))
    .map((f) => path.join(SRC_DIR, f));

  if (srcs.length === 0) {
    throw new Error(`Không có file .java nào trong ${SRC_DIR}`);
  }

  const classpath = [EMULATOR_JAR, BIN_DIR].join(path.delimiter);
  const args = [
    '--release', '8',
    '-encoding', 'UTF-8',
    '-d', BIN_DIR,
    '-cp', classpath,
    ...srcs
  ];

  console.log(`🔨 Đang biên dịch ${srcs.length} file Java bằng: ${javacBin}`);
  execFileSync(javacBin, args, { stdio: 'inherit' });
  console.log('✅ Biên dịch java-engine thành công!');
}

main().catch((err) => {
  console.error('❌ Lỗi biên dịch Java:', err.message || err);
  process.exit(1);
});

