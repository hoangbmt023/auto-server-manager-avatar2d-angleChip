package mod.avatar;

/**
 * AutoController (Gỡ rối từ lớp gốc: bp_0 / bP)
 * 
 * LỚP ĐIỀU PHỐI AUTO VÀ XỬ LÝ TOÀN BỘ CÁC LỆNH CHAT TRONG GAME AVATAR
 * -------------------------------------------------------------------
 * Quản lý vòng lặp chạy nền của các tác vụ Auto:
 * - Theo dõi lượng Xu tăng thêm realtime và lưu vào RMS
 * - Kiểm tra điều kiện dừng khi đạt chỉ tiêu Xu đặt ra
 * - Bắt và xử lý các cú pháp lệnh chat (fa, kc, tx, bd, baby, s, snc, k, m, out...)
 */
public final class AutoController implements Runnable {

    // =========================================================================
    // 1. CÁC THUỘC TÍNH TOÀN CỤC VÀ TRẠNG THÁI
    // =========================================================================
    
    /** Instance duy nhất (Singleton) của AutoController */
    public static AutoController instance;

    /** Tác vụ Auto hiện tại đang hoạt động (AutoFarm, AutoKimCuong, AutoTaiXiu...) */
    public static Object currentAutoTask = null;

    /** Trạng thái cờ: Auto đang chạy hay đang dừng */
    public static boolean isAutoRunning = false;

    /** Luồng chạy nền (Worker Thread) thực thi Auto */
    private static Thread autoWorkerThread;

    /** Lưu lượng xu ở lần quét trước để tính số xu kiếm được realtime */
    private long lastRecordedCoins = -1;

    /** Chuỗi hiển thị tỉ lệ phần trăm hoặc thông số phụ */
    public String statusPercentageText;


    // =========================================================================
    // 2. KHỞI TẠO VÀ CẬP NHẬT TRẠNG THÁI
    // =========================================================================

    public AutoController() {
        instance = this;
    }

    /**
     * Cập nhật thông số và tự động khởi động Thread Auto nếu có tác vụ được kích hoạt
     */
    public final void capNhatTrangThai() {
        // Lấy số xu hiện tại của nhân vật từ PlayerStats
        // this.lastRecordedCoins = PlayerManager.getCurrentCoins();

        // Nếu chưa bật auto thread thì khởi động
        if (!isAutoRunning && currentAutoTask != null) {
            isAutoRunning = true;
            autoWorkerThread = new Thread(this);
            autoWorkerThread.start();
        }
    }


    // =========================================================================
    // 3. XỬ LÝ CÁC LỆNH CHAT TRONG GAME (CHAT COMMAND HANDLER)
    // =========================================================================

    /**
     * Xử lý chuỗi tin nhắn chat do người chơi nhập vào khung chat.
     * Trả về true nếu là lệnh hợp lệ và đã xử lý, false nếu là tin nhắn chat bình thường.
     * 
     * @param rawText Tin nhắn người chơi vừa gửi
     * @return boolean Đã xử lý lệnh thành công hay không
     */
    public static boolean xuLyLenhChat(String rawText) {
        if (rawText == null || rawText.trim().isEmpty()) {
            return false;
        }

        String command = rawText.trim().toLowerCase();

        // -------------------------------------------------------------
        // CÁC LỆNH THAO TÁC CƠ BẢN VÀ ĐIỀU HƯỚNG
        // -------------------------------------------------------------

        // Lệnh "out" hoặc "dx": Đăng xuất khỏi game
        if (command.equals("out") || command.equals("dx")) {
            tatToanBoAuto();
            dangXuatTaiKhoan();
            return true;
        }

        // Lệnh "npc": Mở menu tương tác với NPC gần nhất
        if (command.equals("npc")) {
            moMenuNPC();
            return true;
        }

        // Lệnh "mn": Mở Menu cài đặt Mod
        if (command.equals("mn")) {
            moMenuMod();
            return true;
        }

        // Lệnh "m" hoặc "map": Chuyển bản đồ (Map)
        if (command.equals("m") || command.equals("map")) {
            moMenuChuyenMap();
            return true;
        }

        // Lệnh "rd": Mở Rương Đồ nhân vật
        if (command.equals("rd")) {
            moRuongDo();
            return true;
        }

        // Lệnh "pe": Tắt toàn bộ Auto đang chạy
        if (command.equals("pe")) {
            tatToanBoAuto();
            thongBao("Đã tắt toàn bộ Auto!");
            return true;
        }

        // -------------------------------------------------------------
        // CÁC LỆNH BẬT / TẮT TỪNG MODULE AUTO
        // -------------------------------------------------------------

        // Lệnh "fa": Bật / Tắt Auto Nông Trại (Farm)
        if (command.equals("fa")) {
            if (isDangChayAuto("AutoFarm")) {
                tatToanBoAuto();
                thongBao("Đã TẮT Auto Farm");
            } else {
                // Khởi động Auto Farm (cơ chế chăm sóc, gieo hạt, thu hoạch)
                batAutoTask("AutoFarm");
                thongBao("Đã BẬT Auto Farm");
            }
            return true;
        }

        // Lệnh "kc": Bật / Tắt Auto Kim Cương (Up Xu)
        if (command.equals("kc")) {
            if (isDangChayAuto("AutoKimCuong")) {
                tatToanBoAuto();
                thongBao("Đã TẮT Auto Kim Cương");
            } else {
                batAutoTask("AutoKimCuong");
                thongBao("Đã BẬT Auto Kim Cương");
            }
            return true;
        }

        // Lệnh "tx": Bật / Tắt Auto Tài Xỉu
        if (command.equals("tx")) {
            if (isDangChayAuto("AutoTaiXiu")) {
                tatToanBoAuto();
                thongBao("Đã TẮT Auto Tài Xỉu");
            } else {
                batAutoTask("AutoTaiXiu");
                thongBao("Đã BẬT Auto Tài Xỉu");
            }
            return true;
        }

        // Lệnh "bd": Bật / Tắt Auto Bán Đá (khi đánh kim cương tích trữ)
        if (command.equals("bd")) {
            if (isDangChayAuto("AutoBanDa")) {
                tatToanBoAuto();
                thongBao("Đã TẮT Auto Bán Đá");
            } else {
                batAutoTask("AutoBanDa");
                thongBao("Đã BẬT Auto Bán Đá");
            }
            return true;
        }

        // Lệnh "baby": Bật / Tắt Auto Chăm Sóc Em Bé (cho ăn, cho uống sữa, trị bệnh)
        if (command.equals("baby")) {
            if (isDangChayAuto("AutoChamEmBe")) {
                tatToanBoAuto();
                thongBao("Đã TẮT Auto Chăm Em Bé");
            } else {
                batAutoTask("AutoChamEmBe");
                thongBao("Đã BẬT Auto Chăm Em Bé");
            }
            return true;
        }

        // -------------------------------------------------------------
        // CÁC LỆNH KÈM THAM SỐ SỐ (TỐC ĐỘ, CHUYỂN KHU, CHUYỂN MAP...)
        // Ví dụ: s40, s20, snc150, k5, khu12, m2...
        // -------------------------------------------------------------

        // Tách phần chữ và phần số
        StringBuilder cmdPrefix = new StringBuilder();
        StringBuilder numSuffix = new StringBuilder();
        
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (Character.isDigit(c)) {
                numSuffix.append(c);
            } else if (numSuffix.length() == 0) {
                cmdPrefix.append(c);
            }
        }

        String prefix = cmdPrefix.toString();
        int paramValue = -1;
        if (numSuffix.length() > 0) {
            try {
                paramValue = Integer.parseInt(numSuffix.toString());
            } catch (NumberFormatException ignored) {}
        }

        // Lệnh "s" hoặc "s<tốc_độ>": Điều chỉnh tốc độ Game Speed
        if (prefix.equals("s")) {
            if (paramValue <= 0) {
                // Lệnh "s" không kèm số: Reset về tốc độ chuẩn (40ms)
                datTocDoGame(40);
                thongBao("Reset tốc độ game về mặc định (40)!");
            } else if (paramValue > 70) {
                thongBao("Tốc độ quá chậm sẽ bị lag. Số càng nhỏ thì tốc độ càng nhanh!");
            } else {
                datTocDoGame(paramValue);
                thongBao("Đã chỉnh tốc độ game thành: " + paramValue);
            }
            return true;
        }

        // Lệnh "snc" hoặc "snc<quãng_nghỉ>": Chỉnh thời gian nghỉ giữa các lần auto nâng cấp
        if (prefix.equals("snc")) {
            if (paramValue <= 0) {
                datQuangNghiNangCap(150);
                thongBao("Reset quãng nghỉ auto nâng cấp về mặc định (150ms)!");
            } else {
                datQuangNghiNangCap(paramValue);
                thongBao("Đã chỉnh quãng nghỉ nâng cấp: " + paramValue + "ms");
            }
            return true;
        }

        // Lệnh "k<khu>" hoặc "khu<khu>": Chuyển đến khu chỉ định
        if (prefix.equals("k") || prefix.equals("khu")) {
            if (currentAutoTask != null) {
                thongBao("Không thể chuyển khu khi đang bật Auto: " + currentAutoTask.toString());
                return true;
            }
            if (paramValue >= 0) {
                chuyenKhu(paramValue);
            }
            return true;
        }

        // Lệnh "m<map>" hoặc "map<map>": Chuyển đến Map chỉ định
        if (prefix.equals("m") || prefix.equals("map")) {
            if (paramValue >= 0) {
                chuyenMap(paramValue);
            }
            return true;
        }

        return false;
    }


    // =========================================================================
    // 4. VÒNG LẶP NỀN (BACKGROUND WORKER LOOP)
    // =========================================================================

    @Override
    public final void run() {
        try {
            while (isAutoRunning) {
                long loopStartTime = System.currentTimeMillis();

                // 4.1. Kiểm tra chỉ tiêu Xu: nếu đã kiếm đủ số xu cài đặt thì tự động dừng và đăng xuất
                if (kiemTraDaDatChiTieuXu()) {
                    tatToanBoAuto();
                    dangXuatTaiKhoan();
                    thongBaoPopup("Tài khoản đã đạt chỉ tiêu Up Xu theo cài đặt!");
                    break;
                }

                // 4.2. Thực thi một bước (step) của tác vụ Auto hiện tại
                if (currentAutoTask != null) {
                    thucThiBuocAuto(currentAutoTask);
                }

                // 4.3. Theo dõi và ghi nhận lượng xu chênh lệch realtime
                capNhatXuKiemDuocRealtime();

                // 4.4. Tính toán thời gian nghỉ (delay) giữa các chu kỳ
                long elapsedTime = System.currentTimeMillis() - loopStartTime;
                long targetDelay = layThoiGianNghiCuaTask(currentAutoTask); // Mặc định ~100ms
                
                if (elapsedTime < targetDelay) {
                    Thread.sleep(targetDelay - elapsedTime);
                } else {
                    Thread.sleep(1L);
                }
            }
        } catch (InterruptedException e) {
            // Luồng bị ngắt khi người dùng tắt auto
        } catch (Exception e) {
            System.err.println("[AutoController Error]: " + e.getMessage());
        }
    }


    // =========================================================================
    // 5. CÁC HÀM HỖ TRỢ ĐIỀU KHIỂN AUTO VÀ THAO TÁC HỆ THỐNG
    // =========================================================================

    /**
     * Dừng toàn bộ các tác vụ Auto và hủy worker thread
     */
    public static void tatToanBoAuto() {
        currentAutoTask = null;
        isAutoRunning = false;
        if (autoWorkerThread != null && autoWorkerThread.isAlive()) {
            autoWorkerThread.interrupt();
            autoWorkerThread = null;
        }
    }

    /**
     * Khởi động một tác vụ Auto mới
     */
    public static void batAutoTask(Object newTask) {
        tatToanBoAuto();
        currentAutoTask = newTask;
        if (instance != null) {
            instance.capNhatTrangThai();
        }
    }

    private static boolean isDangChayAuto(String autoType) {
        return isAutoRunning && currentAutoTask != null && currentAutoTask.getClass().getSimpleName().contains(autoType);
    }

    private static boolean kiemTraDaDatChiTieuXu() {
        // Đọc chỉ tiêu xu từ cấu hình RMS và so sánh với tổng xu kiếm được
        return false;
    }

    private void capNhatXuKiemDuocRealtime() {
        // Đọc xu hiện tại và cộng dồn vào thống kê
    }

    private static void thucThiBuocAuto(Object task) {
        // Gọi hàm doStep() của từng loại Auto tương ứng
    }

    private static long layThoiGianNghiCuaTask(Object task) {
        return 100L;
    }

    private static void datTocDoGame(int speed) {
        // Lưu tốc độ vào cấu hình RMS "_modspeed"
    }

    private static void datQuangNghiNangCap(int delayMs) {
        // Gán vào biến static của bộ auto nâng cấp
    }

    private static void chuyenKhu(int khuId) {
        // Gửi packet yêu cầu chuyển khu tới server
    }

    private static void chuyenMap(int mapId) {
        // Gửi packet yêu cầu chuyển bản đồ tới server
    }

    private static void moRuongDo() {
        // Mở màn hình quản lý hành trang
    }

    private static void moMenuNPC() {
        // Mở popup giao tiếp NPC
    }

    private static void moMenuMod() {
        // Mở giao diện tổng hợp cài đặt của Mod
    }

    private static void dangXuatTaiKhoan() {
        // Gửi packet thoát tài khoản và trở về màn hình đăng nhập
    }

    private static void thongBao(String message) {
        System.out.println("[MOD THÔNG BÁO]: " + message);
    }

    private static void thongBaoPopup(String message) {
        // Hiển thị hộp thoại Dialog giữa màn hình game
    }
}
