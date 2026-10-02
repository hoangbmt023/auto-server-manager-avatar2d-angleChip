package mod.avatar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * AutoFarm (Gỡ rối từ lớp gốc: ac_0 / aC)
 * 
 * MODULE AUTO NÔNG TRẠI (FARM, CHĂM EM BÉ, CÂY KHẾ)
 * -------------------------------------------------------------------
 * Chức năng:
 * 1. Tự động chăm sóc các ô đất nông trại (tưới nước, diệt sâu/cỏ, bón phân, thu hoạch).
 * 2. Tự động mua hạt giống và gieo hạt dự phòng khi hết cây.
 * 3. Tự động bán nông sản khi đầy kho hoặc đạt số lượng cài đặt.
 * 4. Tự động chăm sóc cây khế và nâng cấp cây khế tới cấp cài đặt.
 * 5. Tự động thu hoạch tim, cho ăn, mua sữa, chữa bệnh cho em bé.
 * 6. Lưu và tải cài đặt từ RMS "FarmSettings".
 */
public final class AutoFarm {

    // =========================================================================
    // 1. CÁC THIẾT LẬP CẤU HÌNH (LƯU TRONG RMS "FarmSettings")
    // =========================================================================

    /** 0: Lái buôn hỗ trợ, 1: Farm bình thường */
    public static byte coCheAutoFarm = 0;

    /** Danh sách ID món ăn nấu bếp dự bị */
    public static String danhSachMonAnDuBi = "";

    /** Danh sách ID cây trồng dự bị */
    public static String danhSachCayTrongDuBi = "";

    /** Ngưỡng số lượng tồn kho để đổi sang trồng cây khác */
    public static int soLuongChuyenCay = 5000;

    /** Danh sách ID nông sản cần bán (-1 là bán tất cả) */
    public static String danhSachBanNongSan = "-1";

    /** Ngưỡng số lượng nông sản để bắt đầu bán */
    public static int nguongBanNongSan = 2000;

    /** Số lượng nông sản bán ra trong mỗi lần giao dịch */
    public static int soLuongBanMoiLan = 1000;

    /** Tùy chọn checkbox Farm */
    public static boolean tuBaoDanhHangNgay = true;
    public static boolean tuNangCapCayKhe = false;
    public static int capCayKheToiDa = 15;
    public static boolean tuLamNhiemVuApRong = false;
    public static boolean tuLamNhiemVuLuyenRong = false;
    public static boolean tuGiaoDonHang = false;
    public static boolean khongMuaBangLuong = true;

    /** Tùy chọn chăm sóc Em Bé */
    public static boolean tuThuHoachTim = true;
    public static boolean tuChoEmBeAn = true;
    public static boolean tuMuaSuaEmBe = false;
    public static boolean tuChuaBenhEmBe = true;


    // =========================================================================
    // 2. ĐỌC VÀ GHI CẤU HÌNH RMS ("FarmSettings")
    // =========================================================================

    /**
     * Lưu toàn bộ cấu hình Auto Farm vào RMS
     */
    public static void luuCaiDatRMS() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);

            dos.writeByte(coCheAutoFarm);
            dos.writeUTF(danhSachMonAnDuBi != null ? danhSachMonAnDuBi : "");
            dos.writeUTF(danhSachCayTrongDuBi != null ? danhSachCayTrongDuBi : "");
            dos.writeInt(soLuongChuyenCay);
            dos.writeByte(0); // byte_for dự phòng
            dos.writeByte(0); // byte_do dự phòng
            dos.writeBoolean(tuBaoDanhHangNgay);
            dos.writeBoolean(tuThuHoachTim);
            dos.writeUTF(danhSachBanNongSan != null ? danhSachBanNongSan : "-1");
            dos.writeInt(nguongBanNongSan);
            dos.writeBoolean(tuNangCapCayKhe);
            dos.writeInt(capCayKheToiDa);
            dos.writeInt(soLuongBanMoiLan);
            dos.writeBoolean(tuChoEmBeAn);
            dos.writeBoolean(tuMuaSuaEmBe);
            dos.writeBoolean(tuChuaBenhEmBe);
            dos.writeBoolean(tuLamNhiemVuApRong);
            dos.writeBoolean(tuLamNhiemVuLuyenRong);
            dos.writeBoolean(tuGiaoDonHang);
            dos.writeBoolean(khongMuaBangLuong);

            dos.flush();
            baos.flush();

            // Ghi vào RMS với key "FarmSettings"
            QuanLyRMS.luuDuLieu("FarmSettings", baos.toByteArray());

            dos.close();
            baos.close();
            System.out.println("[RMS] Đã lưu cấu hình FarmSettings thành công!");
        } catch (IOException e) {
            System.err.println("[Lỗi lưu FarmSettings]: " + e.getMessage());
        }
    }

    /**
     * Đọc cấu hình Auto Farm từ RMS
     */
    public static void taiCaiDatRMS() {
        try {
            byte[] data = QuanLyRMS.docDuLieu("FarmSettings");
            if (data == null || data.length == 0) return;

            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            DataInputStream dis = new DataInputStream(bais);

            coCheAutoFarm = dis.readByte();
            danhSachMonAnDuBi = dis.readUTF();
            danhSachCayTrongDuBi = dis.readUTF();
            soLuongChuyenCay = dis.readInt();
            dis.readByte(); // byte_for
            dis.readByte(); // byte_do
            tuBaoDanhHangNgay = dis.readBoolean();
            tuThuHoachTim = dis.readBoolean();
            danhSachBanNongSan = dis.readUTF();
            nguongBanNongSan = dis.readInt();
            tuNangCapCayKhe = dis.readBoolean();
            capCayKheToiDa = dis.readInt();
            soLuongBanMoiLan = dis.readInt();
            tuChoEmBeAn = dis.readBoolean();
            tuMuaSuaEmBe = dis.readBoolean();
            tuChuaBenhEmBe = dis.readBoolean();
            tuLamNhiemVuApRong = dis.readBoolean();
            tuLamNhiemVuLuyenRong = dis.readBoolean();
            tuGiaoDonHang = dis.readBoolean();
            khongMuaBangLuong = dis.readBoolean();

            dis.close();
            bais.close();
            System.out.println("[RMS] Đã tải cấu hình FarmSettings thành công!");
        } catch (IOException e) {
            System.err.println("[Lỗi đọc FarmSettings]: " + e.getMessage());
        }
    }


    // =========================================================================
    // 3. THỰC THI BƯỚC AUTO FARM (STEP EXECUTION)
    // =========================================================================

    /**
     * Thực hiện một chu kỳ chăm sóc toàn diện nông trại:
     * - Báo danh hàng ngày
     * - Chăm sóc cây khế
     * - Chăm sóc các ô đất (tưới, sâu, thu hoạch, trồng mới)
     * - Chăm sóc vật nuôi & em bé
     * - Bán nông sản dư thừa
     */
    public void thucThiBuocAuto() {
        System.out.println("[AutoFarm] Đang quét và chăm sóc Nông Trại...");

        if (tuBaoDanhHangNgay) {
            nhanThuongBaoDanh();
        }

        if (tuNangCapCayKhe) {
            chamSocVaNangCapCayKhe();
        }

        chamSocCacODat();

        chamSocVatNuoi();

        chamSocEmBe();

        kiemTraVaBanNongSan();
    }

    private void nhanThuongBaoDanh() {
        // Gửi packet điểm danh hàng ngày
    }

    private void chamSocVaNangCapCayKhe() {
        // Thu hoạch quả khế chín, tưới nước, gửi packet nâng cấp nếu đủ nông sản
    }

    private void chamSocCacODat() {
        // Duyệt qua 48 ô đất:
        // 1. Nếu có sâu cỏ -> diệt sâu cỏ
        // 2. Nếu thiếu nước -> tưới nước
        // 3. Nếu cây chín -> thu hoạch
        // 4. Nếu đất trống -> gieo hạt giống theo danh sách dự bị
    }

    private void chamSocVatNuoi() {
        // Cho gia súc, gia cầm ăn, thu hoạch trứng, sữa
    }

    private void chamSocEmBe() {
        // Cho em bé ăn, uống sữa, trị bệnh khi có thông báo sốt
    }

    private void kiemTraVaBanNongSan() {
        // Kiểm tra kho hàng, nếu nông sản vượt ngưỡng thì bán
    }
}
