package mod.avatar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * AutoKimCuong (Gỡ rối từ lớp gốc: X.java)
 * 
 * MODULE AUTO KIM CƯƠNG (CÀY XU / UP XU CHÍNH)
 * -------------------------------------------------------------------
 * Chức năng:
 * 1. Tự động giải bàn cờ Kim Cương (Match-3 AI Solver).
 * 2. Tự động thực hiện các nước hoán đổi kim cương tối ưu.
 * 3. Tự động bán đá khi đầy rương để nhận Xu.
 * 4. Tự động đếm giờ để chuyển về Nông Trại chăm sóc cây trồng đúng giờ thu hoạch.
 * 5. Lưu và tải cài đặt từ RMS "DiamondSettings".
 */
public final class AutoKimCuong {

    // =========================================================================
    // 1. CÁC THIẾT LẬP CẤU HÌNH (LƯU TRONG RMS "DiamondSettings")
    // =========================================================================

    /** Tự động bán đá khi hành trang / rương đồ bị đầy */
    public static boolean tuDongBanDaKhiDayRuong = true;

    /** Bỏ qua không nhặt Kim Cương Xanh (KCX) */
    public static boolean boQuaKCX = false;

    /** Bỏ qua không nhặt Ngọc Hồng Bảo (NHB) */
    public static boolean boQuaNHB = false;

    /** Tự động rời bàn kim cương để quay về chăm farm */
    public static boolean tuVeChamFarm = true;

    /** Thời gian chu kỳ về farm (tính bằng phút) */
    public static int thoiGianVeFarmPhut = 15;

    /** Chế độ Farm thông minh: canh đúng giờ cây chín mới về thu hoạch */
    public static boolean thuHoachDungGio = true;

    /** 
     * Thứ tự ưu tiên màu sắc kim cương:
     * 0: Vàng, 1: Trắng, 2: Đỏ, 3: Xanh lam, 4: Xanh lá, 5: Tím, 6: Mặc định
     */
    public static byte mauUuTien = 6;


    // =========================================================================
    // 2. BIẾN TRẠNG THÁI VÀ BÀN CỜ
    // =========================================================================

    /** Singleton instance */
    private static AutoKimCuong instance;

    /** Thời điểm lần cuối quay về chăm farm (timestamp ms) */
    public long thoiDiemVeFarmLanCuoi = 0L;

    /** Khoảng thời gian hẹn giờ về farm (chuyển đổi sang ms) */
    public long khoangThoiGianVeFarmMs = 15 * 60 * 1000L;

    /** Ma trận bàn cờ kim cương hiện tại (kích thước lưới kim cương) */
    private short[] banCoKimCuong;

    /** Trạng thái cờ đánh dấu đang trong ván chơi */
    public boolean dangTrongTranDau = false;


    public static AutoKimCuong getInstance() {
        if (instance == null) {
            instance = new AutoKimCuong();
        }
        return instance;
    }

    public AutoKimCuong() {
        instance = this;
        khoiTaoGiaTriMacDinh();
    }

    public void khoiTaoGiaTriMacDinh() {
        this.thoiDiemVeFarmLanCuoi = System.currentTimeMillis();
        this.khoangThoiGianVeFarmMs = (long) thoiGianVeFarmPhut * 60 * 1000L;
    }


    // =========================================================================
    // 3. ĐỌC VÀ GHI CẤU HÌNH RMS ("DiamondSettings")
    // =========================================================================

    /**
     * Lưu toàn bộ thiết lập Auto Kim Cương vào bộ nhớ máy (RMS)
     */
    public static void luuCaiDatRMS() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);

            dos.writeBoolean(tuDongBanDaKhiDayRuong);
            dos.writeBoolean(boQuaKCX);
            dos.writeBoolean(boQuaNHB);
            dos.writeBoolean(tuVeChamFarm);
            dos.writeInt(thoiGianVeFarmPhut);
            dos.writeBoolean(thuHoachDungGio);
            dos.writeByte(mauUuTien);

            dos.flush();
            baos.flush();

            // Ghi dữ liệu vào RMS với định danh "DiamondSettings"
            QuanLyRMS.luuDuLieu("DiamondSettings", baos.toByteArray());

            dos.close();
            baos.close();
            System.out.println("[RMS] Đã lưu cấu hình DiamondSettings thành công!");
        } catch (IOException e) {
            System.err.println("[Lỗi lưu DiamondSettings]: " + e.getMessage());
        }
    }

    /**
     * Tải thiết lập Auto Kim Cương từ RMS
     */
    public static void taiCaiDatRMS() {
        try {
            byte[] data = QuanLyRMS.docDuLieu("DiamondSettings");
            if (data == null || data.length == 0) return;

            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            DataInputStream dis = new DataInputStream(bais);

            tuDongBanDaKhiDayRuong = dis.readBoolean();
            boQuaKCX = dis.readBoolean();
            boQuaNHB = dis.readBoolean();
            tuVeChamFarm = dis.readBoolean();
            thoiGianVeFarmPhut = dis.readInt();
            thuHoachDungGio = dis.readBoolean();
            mauUuTien = dis.readByte();

            dis.close();
            bais.close();
            System.out.println("[RMS] Đã tải cấu hình DiamondSettings thành công!");
        } catch (IOException e) {
            System.err.println("[Lỗi đọc DiamondSettings]: " + e.getMessage());
        }
    }


    // =========================================================================
    // 4. LOGIC THỰC THI AUTO (TỪNG BƯỚC / STEP EXECUTION)
    // =========================================================================

    /**
     * Hàm được gọi lặp lại bởi Worker Thread trong AutoController.
     * Mỗi chu kỳ sẽ thực hiện:
     * - Kiểm tra hẹn giờ về farm
     * - Kiểm tra rương đồ để bán đá
     * - Tìm kiếm và gửi gói tin hoán đổi kim cương
     */
    public void thucThiBuocAuto() {
        long hienTai = System.currentTimeMillis();

        // 4.1. Kiểm tra điều kiện tự động về chăm sóc Nông Trại
        if (tuVeChamFarm && (hienTai - thoiDiemVeFarmLanCuoi >= khoangThoiGianVeFarmMs)) {
            thoiDiemVeFarmLanCuoi = hienTai;
            System.out.println("[AutoKimCuong] Đã đến hẹn về chăm farm, đang chuyển sang AutoFarm...");
            AutoController.batAutoTask("AutoFarm");
            return;
        }

        // 4.2. Kiểm tra nếu rương đồ đầy và có bật tự động bán đá
        if (tuDongBanDaKhiDayRuong && kiemTraRuongDoDaDay()) {
            System.out.println("[AutoKimCuong] Rương đầy đá! Đang tiến hành bán đá...");
            banTatCaDaTrongRuong();
            return;
        }

        // 4.3. Quét bàn cờ và tìm nước đi tối ưu (Match-3)
        if (banCoKimCuong != null && dangTrongTranDau) {
            int[] nuocDi = timNuocDiToiUu(banCoKimCuong);
            if (nuocDi != null && nuocDi.length == 2) {
                int o1 = nuocDi[0];
                int o2 = nuocDi[1];
                guiGoiTinHoanDoiKimCuong(o1, o2);
            }
        }
    }


    // =========================================================================
    // 5. THUẬT TOÁN TÌM NƯỚC ĐI TỐI ƯU (MATCH-3 GEM SOLVER)
    // =========================================================================

    /**
     * Thuật toán duyệt bàn cờ tìm 2 ô có thể đổi chỗ để tạo thành hàng hoặc cột 3 viên cùng màu.
     * Trả về mảng 2 phần tử [viTri1, viTri2].
     */
    public int[] timNuocDiToiUu(short[] luoi) {
        if (luoi == null || luoi.length < 64) return null;

        // Quét từng ô trên bàn cờ (8x8 = 64 ô)
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                int index = y * 8 + x;

                // Thử đổi sang phải (x + 1)
                if (x < 7) {
                    if (kiemTraNuocDiHopLe(luoi, index, index + 1)) {
                        return new int[]{index, index + 1};
                    }
                }

                // Thử đổi xuống dưới (y + 1)
                if (y < 7) {
                    if (kiemTraNuocDiHopLe(luoi, index, index + 8)) {
                        return new int[]{index, index + 8};
                    }
                }
            }
        }
        return null;
    }

    private boolean kiemTraNuocDiHopLe(short[] luoi, int o1, int o2) {
        // Tạm hoán đổi 2 viên đá và kiểm tra xem có tạo thành dãy 3 viên thẳng hàng không
        short temp = luoi[o1];
        luoi[o1] = luoi[o2];
        luoi[o2] = temp;

        boolean taoThanhDay3 = kiemTraCoDay3(luoi, o1) || kiemTraCoDay3(luoi, o2);

        // Hoán đổi lại vị trí cũ
        luoi[o2] = luoi[o1];
        luoi[o1] = temp;

        return taoThanhDay3;
    }

    private boolean kiemTraCoDay3(short[] luoi, int pos) {
        int x = pos % 8;
        int y = pos / 8;
        short color = luoi[pos];
        if (color <= 0) return false;

        // Kiểm tra ngang
        int countNgang = 1;
        for (int i = x - 1; i >= 0 && luoi[y * 8 + i] == color; i--) countNgang++;
        for (int i = x + 1; i < 8 && luoi[y * 8 + i] == color; i++) countNgang++;
        if (countNgang >= 3) return true;

        // Kiểm tra dọc
        int countDoc = 1;
        for (int j = y - 1; j >= 0 && luoi[j * 8 + x] == color; j--) countDoc++;
        for (int j = y + 1; j < 8 && luoi[j * 8 + x] == color; j++) countDoc++;
        return countDoc >= 3;
    }


    // =========================================================================
    // 6. CÁC HÀM GIAO TIẾP VỚI SERVER GAME
    // =========================================================================

    private boolean kiemTraRuongDoDaDay() {
        return false;
    }

    private void banTatCaDaTrongRuong() {
        // Gửi packet bán toàn bộ đá thường vào cửa hàng
    }

    private void guiGoiTinHoanDoiKimCuong(int o1, int o2) {
        // Gửi message swap đá tới Game Server
    }
}
