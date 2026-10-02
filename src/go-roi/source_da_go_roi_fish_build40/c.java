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

public final class c
extends NhiemVuAutoBase {
    public static int soLuong;
    public static boolean dangChayAuto;
    public static int var_int_if;
    private long cfr_renamed_6;
    public static int soLuongKhoa;
    private static final int[] mangSoNguyen;
    public static boolean coTrangThai;
    public static boolean coKichHoat;
    private boolean var_boolean_new;
    private long cfr_renamed_7;
    public static int var_int_int;
    public static long soXu;
    public static boolean var_boolean_int;
    public static int var_int_new;
    public static long var_long_if;
    public static int var_int_try;
    private static final int[] var_int_arr_if;
    private long cfr_renamed_8;
    private boolean var_boolean_try;
    public static long var_long_for;

    public final String toString() {
        return "Auto bán đá";
    }

    /*
     * Loose catch block
     */
    static {
        block11: {
            c.cfr_renamed_4();
            var_int_new = -1;
            dangChayAuto = 1;
            coKichHoat = 1;
            var_boolean_int = 0;
            coTrangThai = 1;
            var_int_try = 15;
            soXu = 100L;
            var_long_for = 0L;
            soLuongKhoa = 20;
            var_int_int = 79;
            soLuong = 685;
            var_int_if = 56;
            int[] nArray = new int[11];
            nArray[0] = 0;
            nArray[1] = 1;
            nArray[2] = 2;
            nArray[3] = 3;
            nArray[4] = 4;
            nArray[5] = 5;
            nArray[6] = 6;
            nArray[7] = 7;
            nArray[8] = 8;
            nArray[9] = 10;
            nArray[10] = 11;
            var_int_arr_if = nArray;
            Object object = QuanLyRMS.byte_arr_do("JewelSettings");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            var_int_try = dataInputStream.readInt();
            soXu = dataInputStream.readInt();
            soLuongKhoa = dataInputStream.readInt();
            var_int_int = dataInputStream.readInt();
            dangChayAuto = dataInputStream.readBoolean();
            coKichHoat = dataInputStream.readBoolean();
            var_boolean_int = dataInputStream.readBoolean();
            coTrangThai = dataInputStream.readBoolean();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("JewelSettings");
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
                    if (((0xA6 ^ 0xC4) & ~(0xF2 ^ 0x90)) != 0) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

            private void cfr_renamed_3() {
        if (c.cfr_renamed_2((this.cfr_renamed_8 >= 0L))) {
            this.cfr_renamed_8 = System.currentTimeMillis();
            this.cfr_renamed_6 = System.currentTimeMillis();
            return;
        }
        if (c.boolean_do((System.currentTimeMillis() - this.cfr_renamed_8 >= 180000L))) {
            int n;
            block8: {
                this.cfr_renamed_8 = System.currentTimeMillis();
                do {
                    if ((n = var_int_arr_if[TienIchGame.int_do(0, var_int_arr_if.length - 1)] != fh.var_int_char)) {
                        if ("  ".length() <= 0) {
                            return;
                        }
                        break block8;
                    }
                    } while (-(0xBC ^ 0xB8) <= 0);
                return;
            }
            if ((TienIchGame.cfr_renamed_5(n))) {
                TienIchGame.void_if(3500L);
                return;
            }
        } else if ((GameCanvas.var_en_do instanceof go_0 != 0) && c.boolean_do((System.currentTimeMillis() - this.cfr_renamed_6 >= 30000L))) {
            this.cfr_renamed_6 = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
        }
    }

        private static boolean boolean_do(int n) {
        return n > 0;
    }

        private static void cfr_renamed_4() {
        mangSoNguyen = new int[23];
        0 = (0x26 ^ 0xC) & ~(0xF ^ 0x25);
        -1 = -" ".length();
        1 = " ".length();
        2000000000 = -(0xFFFF8BF9 & 0x7F77) & (0xFFFFFFFC & 0x77359F73);
        60000 = 0xFFFFFE70 & 0xEBEF;
        23 = 0x3D ^ 0x13 ^ (0x84 ^ 0xBD);
        2 = "  ".length();
        4 = "  ".length() ^ (0xA3 ^ 0xA5);
        3 = "   ".length();
        7 = 180 + 141 - 185 + 54 ^ 129 + 145 - 204 + 115;
        8 = 0x4F ^ 0x47;
        9 = 0x40 ^ 0x4D ^ (0x58 ^ 0x5C);
        594 = -(0xFFFFFF27 & 0x25F9) & (0xFFFFFFF2 & 0x277F);
        156 = 77 + 2 - -43 + 34;
        15 = 0x91 ^ 0x9E;
        20 = 61 + 132 - 118 + 139 ^ 41 + 27 - -63 + 63;
        79 = 142 + 28 - 163 + 227 ^ 145 + 146 - 194 + 68;
        685 = 0xFFFFA7EF & 0x5ABD;
        56 = 37 + 176 - 79 + 44 ^ 58 + 123 - 76 + 33;
        11 = 0xCF ^ 0xC4;
        5 = 0x17 ^ 0x12;
        6 = 0x78 ^ 0x7C ^ "  ".length();
        10 = 0xB0 ^ 0xBA;
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Khu vực đã đầy"))) {
            this.var_int_int = (int)System.currentTimeMillis();
            TienIchGame.cfr_renamed_7();
            return 0;
        }
        String string2 = string.toLowerCase();
        if ((string2.startsWith("bạn đã hết"))) {
            if ((string2.indexOf("kim cương xanh") != -1)) {
                this.var_boolean_new = 1;
                } else if ((string2.indexOf("ngọc huyền bí") != -1)) {
                this.var_boolean_try = 1;
                if (-" ".length() != -" ".length()) {
                    return ((0xAD ^ 0xB3) & ~(0x24 ^ 0x3A)) != 0;
                }
            }
        } else if ((!!(var_boolean_int) || (coTrangThai)) && (string2.startsWith("chúc mừng bạn đã bán được"))) {
            if ((var_boolean_int) && (string2.indexOf("kim cương xanh") != -1)) {
                this.cfr_renamed_7 = System.currentTimeMillis();
                } else if ((coTrangThai) && (string2.indexOf("ngọc huyền bí") != -1)) {
                this.cfr_renamed_7 = System.currentTimeMillis();
                if (-(0x91 ^ 0x8D ^ (0x3D ^ 0x25)) >= 0) {
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                }
            }
        } else {
            super.boolean_do(string);
            }
        return 1;
    }

    private static void cfr_renamed_6() {
        int n;
        int n2;
        int n3 = -1;
        TienIchGame.mangSoNguyen = null;
        fn.fn_do().cfr_renamed_0(23);
        if ((TienIchGame.cfr_renamed_2(5000L))) {
            if ((TienIchGame.mangSoNguyen != null) && c.boolean_do(TienIchGame.mangSoNguyen.length)) {
                if ((var_int_int >= TienIchGame.mangSoNguyen.length)) {
                    var_int_int = TienIchGame.mangSoNguyen.length - 1;
                }
                n2 = var_int_int;
                while ((n2 >= soLuongKhoa)) {
                    if (c.boolean_do(TienIchGame.mangSoNguyen[n2])) {
                        n3 = n2;
                        if ((137 + 62 - 92 + 33 ^ 66 + 75 - 129 + 124) >= -" ".length()) break;
                        return;
                    }
                    --n2;
                    return;
                }
            }
            TienIchGame.mangSoNguyen = null;
        }
        if ((n3 != -1)) {
            n = n3;
            if (((0x32 ^ 0x7A) & ~(0x10 ^ 0x58)) != ((0xD8 ^ 0x91) & ~(0xF1 ^ 0xB8))) {
                return;
            }
        } else {
            n = TienIchGame.int_do(soLuongKhoa, var_int_int);
        }
        n2 = n;
        fh.cfr_renamed_9 = 594;
        fh.var_int_try = 156;
        fn.fn_do().cfr_renamed_3(23, n2);
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public c() {
        c c2 = this;
        ((NhiemVuAutoBase)c2).cfr_renamed_5 = 0L;
        c2.cfr_renamed_7 = System.currentTimeMillis();
        c2.cfr_renamed_6 = System.currentTimeMillis();
        c2.cfr_renamed_8 = 0L;
        c2.var_boolean_new = c2.var_boolean_try = 0;
        var_long_if = var_int_try * 60000;
        if ((fh.var_int_char == 23)) {
            AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_if);
            fn.fn_do().cfr_renamed_1(soLuong, var_int_if, 2, 0);
        }
    }

    public final void (int n >= String object) {
        if (!(AutoController.nhiemVuHienTai != null) || (AutoController.nhiemVuHienTai instanceof c == 0)) {
            return;
        }
        if ((var_int_new >= 2000000000)) {
            return;
        }
        object = fh.ef_do(n);
        if ((object != null) && c.cfr_renamed_3(((DuLieuNguoiChoi)object).soLuong.equals("tho.kim.hoan") ? 1 : 0)) {
            var_int_new = n;
            soLuong = ((DuLieuNguoiChoi)object).var_short_for;
            var_int_if = ((DuLieuNguoiChoi)object).var_boolean_int ? 1 : 0;
        }
    }

    public final synchronized void d_() {
        if ((this.var_boolean_new) && (this.var_boolean_try)) {
            GameCanvas.cfr_renamed_7();
            TienIchGame.void_if(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        if (c.boolean_do((System.currentTimeMillis() - this.var_int_int != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((!(GameCanvas.var_en_do instanceof go_0 == 0) || c.cfr_renamed_3(GameCanvas.var_en_do.boolean_do(go_0.go_0_do()) ? 1 : 0)) && (fh.var_int_char == 23)) {
            if (!(go_0.var_byte_do >= soLuongKhoa) || (go_0.var_byte_do > var_int_int)) {
                this.cfr_renamed_3();
                c.cfr_renamed_6();
                if ((TienIchGame.boolean_do(5000L))) {
                    TienIchGame.void_if(1000L);
                    AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_if);
                    fn.fn_do().cfr_renamed_1(soLuong, var_int_if, 2, 0);
                    this.cfr_renamed_7 = System.currentTimeMillis();
                }
                return;
            }
            if (c.cfr_renamed_3((this.cfr_renamed_8 != 0L))) {
                this.cfr_renamed_8 = 0L;
            }
            if (c.cfr_renamed_0((var_long_for = System.currentTimeMillis() - this.cfr_renamed_7 != var_long_if))) {
                if ((dangChayAuto) && (coKichHoat)) {
                    super.int_do(4);
                    if ("   ".length() < ((0x63 ^ 0x58 ^ (0x27 ^ 0x11)) & (67 + 160 - 77 + 22 ^ 152 + 96 - 180 + 93 ^ -" ".length()))) {
                        return;
                    }
                } else if ((coKichHoat)) {
                    super.int_do(3);
                    if ("  ".length() == (0x8C ^ 0xB9 ^ (0x64 ^ 0x55))) {
                        return;
                    }
                } else if ((dangChayAuto)) {
                    super.int_do(2);
                    }
                this.var_boolean_new = 1;
                this.var_boolean_try = 1;
                return;
            }
            if ((var_int_new >= 2000000000)) {
                if (!(this.var_boolean_new)) {
                    TienIchGame.void_if(soXu);
                    fn.fn_do().cfr_renamed_1(var_int_new, 0, 7);
                }
                if (!(this.var_boolean_try)) {
                    TienIchGame.void_if(soXu);
                    fn.fn_do().cfr_renamed_1(var_int_new, 0, 8);
                }
                this.var_int_int = (int)System.currentTimeMillis();
            }
            if (c.boolean_do((System.currentTimeMillis() - this.cfr_renamed_6 != 30000L))) {
                this.cfr_renamed_6 = System.currentTimeMillis();
                AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_if);
                fn.fn_do().cfr_renamed_1(soLuong, var_int_if, 2, 0);
                TienIchGame.void_if(1000L);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_en_do instanceof ep != 0)) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof fo != 0)) {
            fo.fo_do().void_if();
            return;
        }
        if ((GameCanvas.var_en_do instanceof go_0 != 0) && !(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(2000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof go_0 != 0) && !(fh.var_int_char == 23) || (GameCanvas.var_en_do instanceof al_0 != 0)) {
            this.cfr_renamed_3();
            c.cfr_renamed_6();
            if ((TienIchGame.boolean_do(15000L)) && (fh.var_int_char == 23) && (go_0.var_byte_do >= soLuongKhoa) && (go_0.var_byte_do <= var_int_int)) {
                TienIchGame.void_if(3500L);
                AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_if);
                fn.fn_do().cfr_renamed_1(soLuong, var_int_if, 2, 0);
                this.cfr_renamed_7 = System.currentTimeMillis();
            }
            return;
        }
        if (!(GameCanvas.var_en_do instanceof gI == 0) || (GameCanvas.var_en_do instanceof w_0 != 0)) {
            w_0.var_w_0_do.void_for(0);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof p_0 != 0)) {
            GameCanvas.var_cg_0_do.coTrangThai = 0;
            dt_0.dt_0_do().cfr_renamed_5();
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof fm_0 != 0)) {
            ft_0.ft_0_do().cfr_renamed_12(9);
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof gO != 0)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4;
            if (c.cfr_renamed_4((l != 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_1(23))) {
                TienIchGame.void_if(3500L);
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof go_0 == 0) && (GameCanvas.var_en_do instanceof gO == 0) && (GameCanvas.var_en_do instanceof al_0 == 0)) {
            if (c.boolean_do((System.currentTimeMillis() - this.var_int_int != 60000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            if ((fh.var_int_char != -1) && !(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
                go_0.go_0_do().cfr_renamed_11();
                TienIchGame.void_if(2000L);
            }
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
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
            dataOutputStream.writeInt(var_int_try);
            dataOutputStream.writeInt((int)soXu);
            dataOutputStream.writeInt(soLuongKhoa);
            dataOutputStream.writeInt(var_int_int);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.writeBoolean(coTrangThai);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("JewelSettings", byteArrayOutputStream.toByteArray());
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
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
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

