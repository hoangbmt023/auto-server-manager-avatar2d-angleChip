/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.AngelChip;

public final class N
extends NhiemVuAutoBase {
    public static int soLuong;
    private final int[] mangSoNguyen;
    private boolean var_boolean_try;
    public static boolean dangChayAuto;
    public static boolean coTrangThai;
    private final String[] var_java_lang_String_arr_do;
    private long soXu;
    public static byte var_byte_do;
    public static int var_int_if;
    private int var_int_new;
    public static String chuoiGiaTri;
    private String[] var_java_lang_String_arr_if;
    public static String tenNhanVat;
    public static boolean coKichHoat;
    private byte var_byte_if;
    private int var_int_try = var_int_arr_if[10];
    public static boolean var_boolean_int;
    public static int soLuongKhoa;
    private boolean var_boolean_byte;
    private boolean cfr_renamed_7;
    private static final int[] var_int_arr_if;
    private int var_int_byte;
    public static int var_int_int;
    private String chuoiPhu;
    private long var_long_if;
    private boolean cfr_renamed_8;
    public static boolean var_boolean_new;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

                    public final void void_for() {
        super.void_for();
        this.cfr_renamed_8 = var_int_arr_if[1];
        this.soXu = 0L;
        this.var_boolean_byte = var_int_arr_if[1];
        this.var_byte_if = (byte)var_int_arr_if[1];
    }

        public final synchronized void d_() {
        Object object;
        if (N.boolean_do(this.cfr_renamed_7 ? 1 : 0)) {
            if (N.boolean_do(var_boolean_new ? 1 : 0)) {
                AutoCauCa.bs_0_do().cfr_renamed_4();
                AutoController.cfr_renamed_1(AutoCauCa.bs_0_do());
                if ("  ".length() <= " ".length()) {
                    return;
                }
            } else {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Đã nhận đủ số quà!");
            }
            this.cfr_renamed_3();
            return;
        }
        if ((this.var_java_lang_String_arr_if == null)) {
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Chưa cài đặt danh sách nhân vật");
            return;
        }
        if (N.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
            return;
        }
        if ((this.var_int_try < 0)) {
            if ((this.mangSoNguyen.length < var_int_arr_if[14])) {
                GameCanvas.hienThongBaoPopup("Chưa cài đặt danh sách map!");
                AutoController.tatAuto();
                return;
            }
            this.cfr_renamed_6();
            return;
        }
        if (N.boolean_do(GameCanvas.var_en_do instanceof ep)) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if (N.boolean_do(GameCanvas.var_en_do instanceof gO)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4;
            if (N.cfr_renamed_2((l < 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            gO.cfr_renamed_1().soLuong = var_int_arr_if[17];
            ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[2]);
            if (N.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if (N.boolean_do(var_boolean_int ? 1 : 0) && !(this.var_boolean_try)) {
            if (N.boolean_do(fh.var_int_char)) {
                if (N.boolean_do(TienIchGame.cfr_renamed_5(var_int_arr_if[1]) ? 1 : 0)) {
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            this.var_boolean_try = var_int_arr_if[9];
            fn.fn_do().cfr_renamed_2(this.chuoiPhu);
            TienIchGame.void_if(2000L);
        }
        if ((fh.var_int_char != this.var_int_try)) {
            if (!(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                ft_0.ft_0_do().cfr_renamed_12(var_int_arr_if[13]);
                if (N.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                    TienIchGame.void_if(2000L);
                }
                return;
            }
            fh.cfr_renamed_9 = ba.var_int_arr_arr_do[this.var_int_try][var_int_arr_if[1]];
            fh.var_int_try = ba.var_int_arr_arr_do[this.var_int_try][var_int_arr_if[9]];
            fn.fn_do().cfr_renamed_3(this.var_int_try, var_int_arr_if[10]);
            if (N.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if (!(this.cfr_renamed_8) && (go_0.var_byte_for ==  (byte)this.var_int_try)) {
            TienIchGame.mangSoNguyen = null;
            fn.fn_do().cfr_renamed_0(go_0.var_byte_for);
            if (N.boolean_do(TienIchGame.cfr_renamed_2(15000L) ? 1 : 0)) {
                int n = TienIchGame.int_do();
                if ((n != null) && (!(soLuong <= n) || (soLuongKhoa > n))) {
                    if ((soLuong > n)) {
                        soLuong = n;
                    }
                    if ((soLuongKhoa > n)) {
                        soLuongKhoa = n;
                    }
                }
                TienIchGame.mangSoNguyen = null;
                this.cfr_renamed_8 = var_int_arr_if[9];
            }
        }
        dd_0 dd_02 = null;
        int n = var_int_arr_if[1];
        while ((n < fh.var_java_util_Vector_case.size())) {
            dd_0 dd_03 = (dd_0)fh.var_java_util_Vector_case.elementAt(n);
            if ((dd_03 != null)) {
                int n2;
                block50: {
                    dd_0 dd_04 = dd_03;
                    object = this;
                    int n3 = var_int_arr_if[1];
                    while (N.cfr_renamed_1(n3, ((N)object).var_java_lang_String_arr_if.length)) {
                        String string = ((N)object).var_java_lang_String_arr_if[n3].toLowerCase().trim();
                        String string2 = dd_04.chuoiGiaTri.toLowerCase();
                        if (!(string.equals("")) && N.boolean_do(string.equals(string2) ? 1 : 0)) {
                            n2 = var_int_arr_if[9];
                            break block50;
                        }
                        ++n3;
                        if ("  ".length() <= "   ".length()) continue;
                        return;
                    }
                    n2 = var_int_arr_if[1];
                }
                if (N.boolean_do(n2)) {
                    dd_02 = dd_03;
                    if ((!!(coKichHoat) || N.boolean_do(var_boolean_new ? 1 : 0)) && N.cfr_renamed_4((this.soXu < 0L))) {
                        this.soXu = System.currentTimeMillis();
                        this.var_boolean_byte = var_int_arr_if[9];
                    }
                    if (!N.cfr_renamed_0((System.currentTimeMillis() - this.var_long_if < 6000L))) break;
                    this.var_long_if = System.currentTimeMillis();
                    AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
                    fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, var_int_arr_if[14], var_int_arr_if[1]);
                    TienIchGame.void_if("Đã tìm thấy IG: " + dd_03.chuoiGiaTri);
                    if (null == null) break;
                    return;
                }
            }
            ++n;
            if ((0xA ^ 0x7E ^ (0x6F ^ 0x1F)) == (76 + 29 - 20 + 74 ^ 104 + 133 - 173 + 91)) continue;
            return;
        }
        if ((dd_02 != null)) {
            if (N.boolean_do(dangChayAuto ? 1 : 0)) {
                if ((this.var_byte_if <= var_int_arr_if[18])) {
                    this.var_byte_if = (byte)var_int_arr_if[9];
                }
                if ((this.var_byte_if <= 0)) {
                    n = var_int_arr_if[10];
                    if ((go_0.var_java_util_Vector_do.size() != null)) {
                        int n4 = var_int_arr_if[1];
                        while ((n4 < go_0.var_java_util_Vector_do.size())) {
                            object = (fx)go_0.var_java_util_Vector_do.elementAt(n4);
                            if (N.cfr_renamed_3(((fx)object).cfr_renamed_8) && N.boolean_do(((fx)object).chuoiGiaTri.toLowerCase().startsWith("tự động đánh") ? 1 : 0)) {
                                n = ((fx)object).cfr_renamed_4;
                                if (null == null) break;
                                return;
                            }
                            ++n4;
                            if (((0x19 ^ 0x58) & ~(0xF0 ^ 0xB1) & ~((0x34 ^ 0x3B) & ~(0x76 ^ 0x79))) == 0) continue;
                            return;
                        }
                    }
                    if ((n != var_int_arr_if[10])) {
                        this.var_byte_if = (byte)(this.var_byte_if - var_int_arr_if[9]);
                        ft_0.ft_0_do().cfr_renamed_2(n, var_int_arr_if[10]);
                        TienIchGame.cfr_renamed_3(5000L);
                        return;
                    }
                    this.var_byte_if = (byte)var_int_arr_if[9];
                }
                ft_0.ft_0_do().cfr_renamed_4(dd_02.cfr_renamed_9);
                TienIchGame.cfr_renamed_8(2000L);
                }
            return;
        }
        if (N.boolean_do(this.var_boolean_byte ? 1 : 0) && (!!(coKichHoat) || N.boolean_do(var_boolean_new ? 1 : 0)) && N.cfr_renamed_0((this.soXu < 0L)) && N.cfr_renamed_0((System.currentTimeMillis() - this.soXu < 45000L))) {
            if (N.boolean_do(coKichHoat ? 1 : 0)) {
                AutoController.cfr_renamed_1(new dy_0());
            }
            this.cfr_renamed_7 = var_int_arr_if[9];
            return;
        }
        if (N.boolean_do(this.var_boolean_byte ? 1 : 0)) {
            this.var_boolean_byte = var_int_arr_if[1];
        }
        if (N.boolean_do((this.soXu < 0L))) {
            this.soXu = 0L;
        }
        if (N.cfr_renamed_0((System.currentTimeMillis() - this.var_long_if < 30000L))) {
            this.var_long_if = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, var_int_arr_if[14], var_int_arr_if[1]);
            TienIchGame.void_if(1000L);
        }
        if ((GameCanvas.var_aa_do != null)) {
            return;
        }
        if ((this.var_int_new != go_0.var_byte_do)) {
            TienIchGame.cfr_renamed_1(var_int_arr_if[16], "Khu " + this.var_int_new);
            fn.fn_do().cfr_renamed_3(fh.var_int_char, this.var_int_new);
            if (N.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if ((soLuong == soLuongKhoa)) {
            return;
        }
        if ((this.var_int_new == soLuongKhoa)) {
            this.var_int_new = soLuong;
            this.cfr_renamed_6();
            return;
        }
        if ((this.var_int_new < soLuongKhoa)) {
            this.var_int_new += var_int_arr_if[9];
            return;
        }
        this.var_int_new -= var_int_arr_if[9];
    }

    public final String toString() {
        return "Auto Tìm IG";
    }

    private void cfr_renamed_3() {
        this.var_int_new = soLuong;
        this.var_int_byte = var_int_arr_if[1];
        this.var_long_if = 0L;
        this.var_int_try = this.mangSoNguyen[var_int_arr_if[1]];
        this.cfr_renamed_8 = var_int_arr_if[1];
        this.cfr_renamed_7 = var_int_arr_if[1];
        this.var_boolean_try = var_int_arr_if[1];
        this.soXu = 0L;
        this.var_boolean_byte = var_int_arr_if[1];
        this.var_byte_if = (byte)var_int_arr_if[1];
        var_int_int = var_int_arr_if[10];
        var_int_if = var_int_arr_if[10];
    }

    /*
     * Loose catch block
     */
    static {
        block11: {
            N.cfr_renamed_4();
            tenNhanVat = "santa,ba.chua.tuyet";
            soLuong = var_int_arr_if[1];
            soLuongKhoa = var_int_arr_if[2];
            coTrangThai = var_int_arr_if[9];
            chuoiGiaTri = "1,2,3,5,6,7,8,9,11,23";
            var_byte_do = (byte)var_int_arr_if[9];
            var_int_int = var_int_arr_if[10];
            var_int_if = var_int_arr_if[10];
            var_boolean_int = var_int_arr_if[9];
            coKichHoat = var_int_arr_if[1];
            var_boolean_new = var_int_arr_if[1];
            dangChayAuto = var_int_arr_if[1];
            Object object = QuanLyRMS.byte_arr_do("NPCSettings");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            tenNhanVat = dataInputStream.readUTF();
            soLuong = dataInputStream.readInt();
            soLuongKhoa = dataInputStream.readInt();
            coTrangThai = dataInputStream.readBoolean();
            chuoiGiaTri = dataInputStream.readUTF();
            var_byte_do = dataInputStream.readByte();
            var_boolean_int = dataInputStream.readBoolean();
            coKichHoat = dataInputStream.readBoolean();
            var_boolean_new = dataInputStream.readBoolean();
            dangChayAuto = dataInputStream.readBoolean();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("NPCSettings");
                try {
                    dataInputStream.close();
                    ((ByteArrayInputStream)object).close();
                }
                catch (IOException iOException2) {
                    }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException3) {
                        }
                    if (-(78 + 44 - 65 + 87 ^ 136 + 105 - 147 + 55) >= 0) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    public final boolean boolean_do(String object) {
        block43: {
            block44: {
                int n;
                int n2;
                String string;
                String string2 = object.toLowerCase().trim();
                if (N.boolean_do(string2.startsWith("bạn đã bật") ? 1 : 0)) {
                    if ((string2.indexOf("tự động tấn công") != var_int_arr_if[10])) {
                        this.var_byte_if = (byte)var_int_arr_if[9];
                        TienIchGame.this();
                        return var_int_arr_if[9];
                    }
                    return var_int_arr_if[1];
                }
                if (N.boolean_do(string2.startsWith("bạn đã tắt") ? 1 : 0)) {
                    if ((string2.indexOf("tự động tấn công") != var_int_arr_if[10])) {
                        this.var_byte_if = (byte)var_int_arr_if[1];
                        TienIchGame.this();
                        return var_int_arr_if[9];
                    }
                    return var_int_arr_if[1];
                }
                if (N.boolean_do(string2.equals("hihi các bạn lại gần đây nhận quà nè") ? 1 : 0)) {
                    return var_int_arr_if[9];
                }
                if (!!(string2.startsWith("ném từ từ")) || N.boolean_do(string2.startsWith("bạn đánh nhanh quá") ? 1 : 0)) {
                    this.var_boolean_byte = var_int_arr_if[1];
                    TienIchGame.void_int();
                    return var_int_arr_if[9];
                }
                if (N.boolean_do(string2.startsWith("bạn cần") ? 1 : 0) && (string2.indexOf("để tấn công") != var_int_arr_if[10])) {
                    this.cfr_renamed_7 = var_int_arr_if[9];
                    if (N.boolean_do(coKichHoat ? 1 : 0)) {
                        AutoController.cfr_renamed_1(new dy_0());
                    }
                    return var_int_arr_if[1];
                }
                if (N.boolean_do(string2.startsWith("bạn đã tấn công") ? 1 : 0) && N.boolean_do(string2.endsWith("vào ngày mai nhé") ? 1 : 0)) {
                    var_int_if = var_int_int;
                    this.cfr_renamed_7 = var_int_arr_if[9];
                    if (N.boolean_do(coKichHoat ? 1 : 0)) {
                        AutoController.cfr_renamed_1(new dy_0());
                    }
                    return var_int_arr_if[1];
                }
                String string3 = string2;
                N n3 = this;
                if (N.boolean_do(string3.startsWith("chúc mừng ") ? 1 : 0)) {
                    string3 = string3.substring("chúc mừng ".length()).trim();
                }
                if (N.boolean_do((string = n3.var_java_lang_String_arr_do[var_int_arr_if[1]].toLowerCase()).startsWith("chúc mừng ") ? 1 : 0)) {
                    string = string.substring("chúc mừng ".length()).trim();
                }
                if ((n3.var_java_lang_String_arr_do[var_int_arr_if[9]] != null) && (n3.var_java_lang_String_arr_do[var_int_arr_if[9]].length() != null)) {
                    if ((!!(string3.startsWith(string)) || N.boolean_do(string3.startsWith("bạn nhận được") ? 1 : 0)) && N.cfr_renamed_4(string3.indexOf(n3.var_java_lang_String_arr_do[var_int_arr_if[9]].toLowerCase()), var_int_arr_if[10])) {
                        n2 = var_int_arr_if[9];
                        if ("   ".length() <= 0) {
                            return ((0xA0 ^ 0x80) & ~(0xBC ^ 0x9C)) != 0;
                        }
                    } else {
                        n2 = var_int_arr_if[1];
                        if ("   ".length() >= (3 ^ 0x2D ^ (0x8F ^ 0xA5))) {
                            return ((0xB5 ^ 0xA2 ^ (0x2C ^ 0xD)) & (9 + 152 - 37 + 60 ^ 63 + 2 - 48 + 125 ^ -" ".length())) != 0;
                        }
                    }
                } else if (!!(string3.startsWith(string)) || N.boolean_do(string3.startsWith("bạn nhận được") ? 1 : 0)) {
                    n2 = var_int_arr_if[9];
                    if (((179 + 115 - 276 + 220 ^ 25 + 132 - 34 + 64) & (0x28 ^ 0x15 ^ (0xAD ^ 0xC5) ^ -" ".length())) < 0) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = var_int_arr_if[1];
                }
                if (!N.boolean_do(n2)) break block43;
                this.var_boolean_byte = var_int_arr_if[1];
                TienIchGame.void_int();
                if (N.boolean_do(this.var_java_lang_String_arr_do[var_int_arr_if[14]].equals("none") ? 1 : 0)) {
                    return var_int_arr_if[1];
                }
                object = this.var_java_lang_String_arr_do[var_int_arr_if[14]].toLowerCase();
                if ((object.length() == var_int_arr_if[9])) {
                    n = string2.lastIndexOf(object.charAt(var_int_arr_if[1]));
                    if ((0x6B ^ 0x38 ^ (0x48 ^ 0x1F)) == "   ".length()) {
                        return ((0xF7 ^ 0xBD ^ (0x78 ^ 0x2F)) & (0x26 ^ 0x2E ^ (0xA5 ^ 0xB0) ^ -" ".length())) != 0;
                    }
                } else {
                    n = string2.indexOf((String)object);
                }
                if (!(n != var_int_arr_if[10]) || !N.cfr_renamed_0(object = TienIchGame.java_lang_String_arr_do(string2.substring(n + object.length()), "/")) || !N.cfr_renamed_0(((String[])object).length, var_int_arr_if[14])) break block44;
                string2 = TienIchGame.java_lang_String_do(object[var_int_arr_if[1]].trim());
                n = object[var_int_arr_if[9]].indexOf(var_int_arr_if[15]);
                if ((n != var_int_arr_if[10])) {
                    object = TienIchGame.java_lang_String_do(object[var_int_arr_if[9]].substring(var_int_arr_if[1], n).trim());
                    if (" ".length() <= ((0x7B ^ 0x4E) & ~(0x1E ^ 0x2B))) {
                        return ((0xBA ^ 0xA3) & ~(0x19 ^ 0)) != 0;
                    }
                } else {
                    object = TienIchGame.java_lang_String_do(object[var_int_arr_if[9]].trim());
                }
                try {
                    var_int_int = Integer.parseInt(string2);
                    var_int_if = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    var_int_int = var_int_arr_if[10];
                    var_int_if = var_int_arr_if[10];
                }
                if ("   ".length() == 0) {
                    return ((144 + 163 - 176 + 55 ^ 36 + 18 - -14 + 73) & (163 + 162 - 227 + 81 ^ 50 + 65 - 110 + 127 ^ -" ".length())) != 0;
                }
                if ((var_int_int != var_int_arr_if[10]) && (var_int_if != var_int_arr_if[10]) && (var_int_int >= var_int_if)) {
                    if (N.boolean_do(coKichHoat ? 1 : 0)) {
                        AutoController.cfr_renamed_1(new dy_0());
                    }
                    this.cfr_renamed_7 = var_int_arr_if[9];
                }
            }
            return dangChayAuto;
        }
        if (N.boolean_do(object.startsWith("Khu vực đã đầy") ? 1 : 0)) {
            TienIchGame.cfr_renamed_7();
            GameCanvas.cfr_renamed_7();
            if (N.boolean_do(coTrangThai ? 1 : 0) && (soLuong != soLuongKhoa)) {
                TienIchGame.cfr_renamed_1(var_int_arr_if[16], "Khu " + this.var_int_new + " đã đầy.");
                if ((this.var_int_new == soLuongKhoa)) {
                    this.var_int_new = soLuong;
                    this.cfr_renamed_6();
                    if (" ".length() <= -" ".length()) {
                        return ((0x4D ^ 0x7A) & ~(0xAE ^ 0x99)) != 0;
                    }
                } else if ((this.var_int_new < soLuongKhoa)) {
                    this.var_int_new += var_int_arr_if[9];
                    if (-" ".length() > ((0x64 ^ 0x20) & ~(0x4D ^ 9))) {
                        return ((0x7A ^ 0x37) & ~(0x3C ^ 0x71)) != 0;
                    }
                } else {
                    this.var_int_new -= var_int_arr_if[9];
                }
            }
            return var_int_arr_if[9];
        }
        if (!!(object.startsWith("Đi chầm chậm thôi chứ bạn")) || N.boolean_do(object.startsWith("Bạn đã ở khu vực này") ? 1 : 0)) {
            TienIchGame.cfr_renamed_7();
            return var_int_arr_if[9];
        }
        if (!(ga_0.cfr_renamed_2) && !(ga_0.dangChayAuto) && (GameCanvas.var_en_do instanceof ThongTinNhanVat == 0) && N.boolean_do(object.startsWith("Thành phố tạm dừng để bảo trì") ? 1 : 0)) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(900000L);
            return var_int_arr_if[9];
        }
        return var_int_arr_if[1];
    }

    private static void cfr_renamed_4() {
        var_int_arr_if = new int[19];
        N.var_int_arr_if[0] = 27 + 92 - 16 + 35 ^ 91 + 107 - 187 + 121;
        N.var_int_arr_if[1] = (130 + 92 - 67 + 0 ^ 101 + 7 - -17 + 34) & (183 + 7 - 104 + 98 ^ 181 + 87 - 110 + 30 ^ -" ".length());
        N.var_int_arr_if[2] = 101 + 48 - 21 + 29 ^ 30 + 43 - -27 + 48;
        N.var_int_arr_if[3] = 104 + 113 - 128 + 65 ^ 20 + 24 - -23 + 77;
        N.var_int_arr_if[4] = 138 + 38 - 154 + 147 ^ 82 + 52 - 24 + 52;
        N.var_int_arr_if[5] = 0x32 ^ 0x65 ^ (0x22 ^ 0x78);
        N.var_int_arr_if[6] = 98 + 127 - 151 + 130 ^ 156 + 80 - 129 + 85;
        N.var_int_arr_if[7] = 0x9E ^ 0x8F;
        N.var_int_arr_if[8] = 0xAC ^ 0xBB;
        N.var_int_arr_if[9] = " ".length();
        N.var_int_arr_if[10] = -" ".length();
        N.var_int_arr_if[11] = "   ".length();
        N.var_int_arr_if[12] = 0x82 ^ 0x86;
        N.var_int_arr_if[13] = 0x17 ^ 0x1F;
        N.var_int_arr_if[14] = "  ".length();
        N.var_int_arr_if[15] = 0x87 ^ 0xAE;
        N.var_int_arr_if[16] = (2 ^ 0x27) + (0x86 ^ 0xC6) - -(0xEF ^ 0xC5) + (0x61 ^ 0x66);
        N.var_int_arr_if[17] = 109 + 111 - 143 + 51 ^ 9 + 108 - 92 + 108;
        N.var_int_arr_if[18] = -"   ".length();
    }

                private static int[] int_arr_do() {
        block6: {
            if ((var_byte_do == 0)) {
                int[] nArray = new int[var_int_arr_if[0]];
                int n = var_int_arr_if[1];
                while ((n <= var_int_arr_if[2])) {
                    nArray[n] = n;
                    ++n;
                    return null;
                }
                nArray[N.var_int_arr_if[3]] = var_int_arr_if[4];
                nArray[N.var_int_arr_if[4]] = var_int_arr_if[5];
                nArray[N.var_int_arr_if[6]] = var_int_arr_if[7];
                nArray[N.var_int_arr_if[5]] = var_int_arr_if[8];
                return nArray;
            }
            if (!(var_byte_do == var_int_arr_if[9]) || !(chuoiGiaTri.length() != null)) break block6;
            String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiGiaTri, ",");
            int[] nArray = new int[stringArray.length];
            int n = var_int_arr_if[1];
            while ((n < stringArray.length)) {
                try {
                    nArray[n] = Integer.parseInt(stringArray[n]);
                }
                catch (NumberFormatException numberFormatException) {
                    nArray[n] = var_int_arr_if[10];
                }
                ++n;
                return null;
            }
            return nArray;
        }
        int[] nArray = new int[var_int_arr_if[9]];
        nArray[N.var_int_arr_if[1]] = fh.var_int_char;
        return nArray;
    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private void cfr_renamed_6() {
        if ((this.mangSoNguyen.length > var_int_arr_if[9])) {
            this.var_int_byte += var_int_arr_if[9];
            if ((this.var_int_byte >= this.mangSoNguyen.length)) {
                this.var_int_byte = var_int_arr_if[1];
            }
            this.var_int_try = this.mangSoNguyen[this.var_int_byte];
            this.cfr_renamed_8 = var_int_arr_if[1];
        }
    }

        public N() {
        this.var_java_lang_String_arr_do = new String[var_int_arr_if[11]];
        if ((tenNhanVat.length() != null)) {
            this.var_java_lang_String_arr_if = TienIchGame.java_lang_String_arr_do(tenNhanVat, ",");
        }
        this.mangSoNguyen = N.int_arr_do();
        this.chuoiPhu = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[12]);
        if (!(this.chuoiPhu != null) || N.boolean_do(this.chuoiPhu.equals("") ? 1 : 0)) {
            this.chuoiPhu = "avatar";
        }
        this.var_java_lang_String_arr_do[N.var_int_arr_if[1]] = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[13]);
        this.var_java_lang_String_arr_do[N.var_int_arr_if[9]] = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[2]);
        this.var_java_lang_String_arr_do[N.var_int_arr_if[14]] = br_0.java_lang_String_do(br_0.soLuong + var_int_arr_if[3]);
        if (!(this.var_java_lang_String_arr_do[var_int_arr_if[1]] != null) || N.boolean_do(this.var_java_lang_String_arr_do[var_int_arr_if[1]].equals("") ? 1 : 0)) {
            this.var_java_lang_String_arr_do[N.var_int_arr_if[1]] = "Chúc mừng bạn đã nhận được";
        }
        if (!(this.var_java_lang_String_arr_do[var_int_arr_if[14]] != null) || N.boolean_do(this.var_java_lang_String_arr_do[var_int_arr_if[14]].equals("") ? 1 : 0)) {
            this.var_java_lang_String_arr_do[N.var_int_arr_if[14]] = "Số lượng";
        }
        this.cfr_renamed_3();
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF(tenNhanVat);
            dataOutputStream.writeInt(soLuong);
            dataOutputStream.writeInt(soLuongKhoa);
            dataOutputStream.writeBoolean(coTrangThai);
            dataOutputStream.writeUTF(chuoiGiaTri);
            dataOutputStream.writeByte(var_byte_do);
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeBoolean(var_boolean_new);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("NPCSettings", byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if (((0xE0 ^ 0x9A ^ (0x40 ^ 0x1A)) & (4 ^ 0x7C ^ (0x6D ^ 0x35) ^ -" ".length())) >= ((0x13 ^ 0x3B ^ (0x72 ^ 0x67)) & (0x67 ^ 0x35 ^ (0x19 ^ 0x76) ^ -" ".length()))) throw throwable;
            return;
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    }

