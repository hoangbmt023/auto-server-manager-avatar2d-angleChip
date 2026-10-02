package mod.avatar;

/**
 * ThongTinNhanVat (Gỡ rối từ lớp gốc: gO.java / dL.java)
 * 
 * QUẢN LÝ DỮ LIỆU NHÂN VẬT, TÀI KHOẢN, TIỀN TỆ VÀ ĐĂNG NHẬP
 * -------------------------------------------------------------------
 * Chức năng:
 * 1. Lưu giữ số dư tiền tệ: Xu, Lượng, Lượng khóa.
 * 2. Lưu giữ thông tin tài khoản: Tên nhân vật, ID tài khoản, Cấp độ.
 * 3. Quản lý phiên kết nối mạng và gửi thông tin đăng nhập tới Game Server.
 */
public final class ThongTinNhanVat {

    // =========================================================================
    // 1. TIỀN TỆ VÀ THÔNG TIN NHÂN VẬT
    // =========================================================================

    /** Số Xu hiện có của nhân vật (lớp gốc: var_long_do trong gO) */
    public long soXu = 0L;

    /** Số Lượng hiện có của nhân vật (lớp gốc: var_int_do trong gO) */
    public int soLuong = 0;

    /** Số Lượng khóa hiện có (lớp gốc: var_int_for trong gO) */
    public int soLuongKhoa = 0;

    /** Tên hiển thị của nhân vật (lớp gốc: var_java_lang_String_if trong gO) */
    public String tenNhanVat = "";

    /** ID định danh của nhân vật trên Server */
    public int idNhanVat = 0;

    /** Cấp độ (Level) của nhân vật */
    public int capDo = 1;


    // =========================================================================
    // 2. KẾT NỐI SERVER VÀ ĐĂNG NHẬP
    // =========================================================================

    /** Singleton instance của lớp quản lý nhân vật */
    private static ThongTinNhanVat instance;

    public static ThongTinNhanVat getInstance() {
        if (instance == null) {
            instance = new ThongTinNhanVat();
        }
        return instance;
    }

    public ThongTinNhanVat() {
        instance = this;
    }

    /**
     * Thực hiện kết nối tới Server và gửi gói tin đăng nhập
     * (Tương ứng với hàm `do(String user, String pass)` trong gO gốc)
     * 
     * @param username Tên tài khoản Avatar
     * @param password Mật khẩu
     * @param serverId ID máy chủ (0: Diệu Kỳ, 1: Xứ Sở, 2: Vũ Hội...)
     */
    public void dangNhapServer(String username, String password, int serverId) {
        System.out.println("[KẾT NỐI] Đang đăng nhập tài khoản: " + username + " vào Server ID: " + serverId);
        
        // 1. Khởi tạo socket kết nối tới địa chỉ IP / Port của máy chủ Avatar tương ứng
        // 2. Mã hóa thông tin đăng nhập
        // 3. Gửi gói tin Message Login (CMD = 0)
    }

    /**
     * Cập nhật thông số tiền tệ khi nhận gói tin Message từ Server trả về
     */
    public void capNhatTienTe(long xuMoi, int luongMoi, int luongKhoaMoi) {
        this.soXu = xuMoi;
        this.soLuong = luongMoi;
        this.soLuongKhoa = luongKhoaMoi;
        System.out.println("[TIỀN TỆ] Xu: " + this.soXu + " | Lượng: " + this.soLuong + " | Lượng khóa: " + this.soLuongKhoa);
    }
}
