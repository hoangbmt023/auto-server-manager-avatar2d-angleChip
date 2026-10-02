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

public final class AutoBanDa
extends NhiemVuAutoBase {
    public static int soLuong;
    public static int var_int_if;
    public static long soXu;
    public static boolean dangChayAuto;
    private boolean var_boolean_new;
    public static boolean coTrangThai;
    public static long var_long_if;
    public static boolean coKichHoat;
    private long cfr_renamed_15;
    public static int soLuongKhoa;
    private static final int[] mangSoNguyen;
    public static int var_int_int;
    public static int var_int_new;
    private long cfr_renamed_8;
    public static int var_int_try;
    public static boolean var_boolean_int;
    private long cfr_renamed_12;
    private static final int[] var_int_arr_if;
    public static long var_long_for;
    private boolean var_boolean_try;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static void cfr_renamed_4() {
        int n;
        int n2;
        int n3 = -1;
        TienIchGame.mangSoNguyen = null;
        el_0.el_0_do().cfr_renamed_1(23);
        if ((TienIchGame.cfr_renamed_5(5000L))) {
            if ((TienIchGame.mangSoNguyen != null) && AutoBanDa.boolean_do(TienIchGame.mangSoNguyen.length)) {
                if ((soLuongKhoa >= TienIchGame.mangSoNguyen.length)) {
                    soLuongKhoa = TienIchGame.mangSoNguyen.length - 1;
                }
                n2 = soLuongKhoa;
                while ((n2 >= var_int_int)) {
                    if (AutoBanDa.boolean_do(TienIchGame.mangSoNguyen[n2])) {
                        n3 = n2;
                        if (null == null) break;
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
            if ((2 ^ 0xD ^ (0x90 ^ 0x9A)) == 0) {
                return;
            }
        } else {
            n = TienIchGame.int_do(var_int_int, soLuongKhoa);
        }
        n2 = n;
        ef_0.var_int_char = 594;
        ef_0.var_int_new = 156;
        el_0.el_0_do().cfr_renamed_4(23, n2);
    }

            public AutoBanDa() {
        AutoBanDa al2 = this;
        ((NhiemVuAutoBase)al2).cfr_renamed_5 = 20L;
        al2.cfr_renamed_12 = System.currentTimeMillis();
        al2.cfr_renamed_15 = System.currentTimeMillis();
        al2.cfr_renamed_8 = 0L;
        al2.var_boolean_new = al2.var_boolean_try = 0;
        var_long_if = var_int_try * 60000;
        if ((ef_0.soLuong == 23)) {
            AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_new);
            el_0.el_0_do().cfr_renamed_0(soLuong, var_int_new, 2, 0);
        }
    }

        /*
     * Loose catch block
     */
    static {
        block11: {
            AutoBanDa.cfr_renamed_5();
            var_int_if = -1;
            dangChayAuto = 1;
            coKichHoat = 1;
            coTrangThai = 0;
            var_boolean_int = 1;
            var_int_try = 15;
            var_long_for = 100L;
            soXu = 0L;
            var_int_int = 20;
            soLuongKhoa = 79;
            soLuong = 685;
            var_int_new = 56;
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
            var_long_for = dataInputStream.readInt();
            var_int_int = dataInputStream.readInt();
            soLuongKhoa = dataInputStream.readInt();
            dangChayAuto = dataInputStream.readBoolean();
            coKichHoat = dataInputStream.readBoolean();
            coTrangThai = dataInputStream.readBoolean();
            var_boolean_int = dataInputStream.readBoolean();
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
                    if (((0x26 ^ 0x40 ^ (0x1C ^ 0x6F)) & (0x3F ^ 0x28 ^ "  ".length() ^ -" ".length())) > " ".length()) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[23];
        0 = (0x19 ^ 0x68 ^ (0xD6 ^ 0xC7)) & (0x69 ^ 0x35 ^ (0x56 ^ 0x6A) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
        2000000000 = 0xFFFFB76C & 0x7735DC93;
        60000 = 0xFFFFEFF8 & 0xFA67;
        23 = 13 + 4 - -86 + 37 ^ 126 + 95 - 199 + 133;
        2 = "  ".length();
        4 = 2 ^ 0x77 ^ (0x63 ^ 0x12);
        3 = "   ".length();
        7 = 92 + 111 - 169 + 130 ^ 11 + 15 - -30 + 107;
        8 = 0x80 ^ 0x98 ^ (0xD4 ^ 0xC4);
        9 = 0x3F ^ 0x60 ^ (0xC ^ 0x5A);
        594 = -(0xFFFFFCA7 & 0x33FD) & (0xFFFFBBFE & 0x76F7);
        156 = (0x73 ^ 0x1B) + (0xA3 ^ 0xB0) - (0x79 ^ 0x69) + (0xF0 ^ 0xC1);
        15 = 0x50 ^ 0x5F;
        20 = 0x52 ^ 0x1D ^ (0xF2 ^ 0xA9);
        79 = 0x39 ^ 0x5E ^ (0x15 ^ 0x3D);
        685 = -(0xFFFFF531 & 0x3EDF) & (0xFFFFB6FF & 0x7FBD);
        56 = 52 + 76 - -3 + 0 ^ 104 + 76 - 147 + 154;
        11 = 123 + 2 - 57 + 85 ^ 59 + 125 - 64 + 26;
        5 = 0xC5 ^ 0xC0;
        6 = 0x2C ^ 0x5C ^ (0x7C ^ 0xA);
        10 = 0x83 ^ 0x9F ^ (0x41 ^ 0x57);
    }

        private void cfr_renamed_2() {
        if (AutoBanDa.cfr_renamed_4((this.cfr_renamed_8 >= 0L))) {
            this.cfr_renamed_8 = System.currentTimeMillis();
            this.cfr_renamed_15 = System.currentTimeMillis();
            return;
        }
        if (AutoBanDa.boolean_do((System.currentTimeMillis() - this.cfr_renamed_8 >= 180000L))) {
            int n;
            block8: {
                this.cfr_renamed_8 = System.currentTimeMillis();
                do {
                    if ((n = var_int_arr_if[TienIchGame.int_do(0, var_int_arr_if.length - 1)] != ef_0.soLuong)) {
                        if ("   ".length() > (0x2D ^ 0x29)) {
                            return;
                        }
                        break block8;
                    }
                    } while (-"  ".length() < 0);
                return;
            }
            if ((TienIchGame.cfr_renamed_4(n))) {
                TienIchGame.hienThongBao(3500L);
                return;
            }
        } else if ((GameCanvas.var_dL_do instanceof fe_0 != 0) && AutoBanDa.boolean_do((System.currentTimeMillis() - this.cfr_renamed_15 >= 30000L))) {
            this.cfr_renamed_15 = System.currentTimeMillis();
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if);
            el_0.el_0_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_if, 2, 0);
        }
    }

    public final synchronized void void_for() {
        if ((this.var_boolean_new) && (this.var_boolean_try)) {
            GameCanvas.cfr_renamed_8();
            TienIchGame.hienThongBao(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        if (AutoBanDa.boolean_do((System.currentTimeMillis() - this.var_int_int != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if ((!(GameCanvas.var_dL_do instanceof fe_0 == 0) || AutoBanDa.cfr_renamed_3(GameCanvas.var_dL_do.boolean_do(fe_0.fe_0_do()) ? 1 : 0)) && (ef_0.soLuong == 23)) {
            if (!(fe_0.var_byte_for >= var_int_int) || (fe_0.var_byte_for > soLuongKhoa)) {
                this.cfr_renamed_2();
                AutoBanDa.cfr_renamed_4();
                if ((TienIchGame.cfr_renamed_2(5000L))) {
                    TienIchGame.hienThongBao(1000L);
                    AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_new);
                    el_0.el_0_do().cfr_renamed_0(soLuong, var_int_new, 2, 0);
                    this.cfr_renamed_12 = System.currentTimeMillis();
                }
                return;
            }
            if (AutoBanDa.cfr_renamed_3((this.cfr_renamed_8 != 0L))) {
                this.cfr_renamed_8 = 0L;
            }
            if (AutoBanDa.cfr_renamed_1((soXu = System.currentTimeMillis() - this.cfr_renamed_12 != var_long_if))) {
                if ((dangChayAuto) && (coKichHoat)) {
                    super.int_do(4);
                    if ((0x9D ^ 0x99) < ((0x7C ^ 0x30) & ~(0xFE ^ 0xB2))) {
                        return;
                    }
                } else if ((coKichHoat)) {
                    super.int_do(3);
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else if ((dangChayAuto)) {
                    super.int_do(2);
                    }
                this.var_boolean_new = 1;
                this.var_boolean_try = 1;
                return;
            }
            if ((var_int_if >= 2000000000)) {
                if (!(this.var_boolean_new)) {
                    TienIchGame.hienThongBao(var_long_for);
                    el_0.el_0_do().cfr_renamed_0(var_int_if, 0, 7);
                }
                if (!(this.var_boolean_try)) {
                    TienIchGame.hienThongBao(var_long_for);
                    el_0.el_0_do().cfr_renamed_0(var_int_if, 0, 8);
                }
                this.var_int_int = (int)System.currentTimeMillis();
            }
            if (AutoBanDa.boolean_do((System.currentTimeMillis() - this.cfr_renamed_15 != 30000L))) {
                this.cfr_renamed_15 = System.currentTimeMillis();
                AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_new);
                el_0.el_0_do().cfr_renamed_0(soLuong, var_int_new, 2, 0);
                TienIchGame.hienThongBao(1000L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_dL_do instanceof dN != 0)) {
            dN.cfr_renamed_0().cfr_renamed_1();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof em_0 != 0)) {
            em_0.em_0_do().cfr_renamed_2();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fe_0 != 0) && !(TienIchGame.cfr_renamed_15(ef_0.soLuong))) {
            fe_0.fe_0_do().cfr_renamed_21();
            TienIchGame.hienThongBao(2000L);
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fe_0 != 0) && !(ef_0.soLuong == 23) || (GameCanvas.var_dL_do instanceof t_0 != 0)) {
            this.cfr_renamed_2();
            AutoBanDa.cfr_renamed_4();
            if ((TienIchGame.cfr_renamed_2(15000L)) && (ef_0.soLuong == 23) && (fe_0.var_byte_for >= var_int_int) && (fe_0.var_byte_for <= soLuongKhoa)) {
                TienIchGame.hienThongBao(3500L);
                AngelChip.duLieuNguoiChoi.void_do(soLuong, var_int_new);
                el_0.el_0_do().cfr_renamed_0(soLuong, var_int_new, 2, 0);
                this.cfr_renamed_12 = System.currentTimeMillis();
            }
            return;
        }
        if (!(GameCanvas.var_dL_do instanceof fk == 0) || (GameCanvas.var_dL_do instanceof a_0 != 0)) {
            a_0.var_a_0_do.void_if(0);
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(2000L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof e != 0)) {
            GameCanvas.var_ex_do.coTrangThai = 0;
            cd_0.cd_0_do().cfr_renamed_3();
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(2000L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof gp_0 != 0)) {
            eq.eq_do().cfr_renamed_17(9);
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(2000L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fw != 0)) {
            long l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2;
            if (AutoBanDa.cfr_renamed_5((l != 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_3(23))) {
                TienIchGame.hienThongBao(3500L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fe_0 == 0) && (GameCanvas.var_dL_do instanceof fw == 0) && (GameCanvas.var_dL_do instanceof t_0 == 0)) {
            if (AutoBanDa.boolean_do((System.currentTimeMillis() - this.var_int_int != 60000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            if ((ef_0.soLuong != -1) && !(TienIchGame.cfr_renamed_15(ef_0.soLuong))) {
                fe_0.fe_0_do().cfr_renamed_21();
                TienIchGame.hienThongBao(2000L);
            }
        }
    }

    public final boolean boolean_do(String string) {
        if ((string.startsWith("Khu vực đã đầy"))) {
            this.var_int_int = (int)System.currentTimeMillis();
            TienIchGame.cfr_renamed_8();
            return 0;
        }
        String string2 = string.toLowerCase();
        if ((string2.startsWith("bạn đã hết"))) {
            if ((string2.indexOf("kim cương xanh") != -1)) {
                this.var_boolean_new = 1;
                if (" ".length() == 0) {
                    return ((0xF6 ^ 0xA3) & ~(5 ^ 0x50)) != 0;
                }
            } else if ((string2.indexOf("ngọc huyền bí") != -1)) {
                this.var_boolean_try = 1;
                }
        } else if ((!!(coTrangThai) || (var_boolean_int)) && (string2.startsWith("chúc mừng bạn đã bán được"))) {
            if ((coTrangThai) && (string2.indexOf("kim cương xanh") != -1)) {
                this.cfr_renamed_12 = System.currentTimeMillis();
                if (" ".length() >= "  ".length()) {
                    return ((0x44 ^ 0x40 ^ (0xEF ^ 0xAD)) & (74 + 157 - 14 + 8 ^ 72 + 54 - -7 + 34 ^ -" ".length())) != 0;
                }
            } else if ((var_boolean_int) && (string2.indexOf("ngọc huyền bí") != -1)) {
                this.cfr_renamed_12 = System.currentTimeMillis();
                if ((60 + 158 - 102 + 65 ^ 63 + 126 - 46 + 34) < (103 + 157 - 193 + 121 ^ 56 + 28 - -44 + 56)) {
                    return ((0xC2 ^ 0xBF ^ (0xEB ^ 0xBF)) & (37 + 154 - 171 + 149 ^ 3 + 0 - -72 + 53 ^ -" ".length()) & ((36 + 8 - -6 + 105 ^ 74 + 84 - 119 + 160) & (0x2A ^ 0x17 ^ (2 ^ 0x63) ^ -" ".length()) ^ -" ".length())) != 0;
                }
            }
        } else {
            super.boolean_do(string);
            }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(var_int_try);
            dataOutputStream.writeInt((int)var_long_for);
            dataOutputStream.writeInt(var_int_int);
            dataOutputStream.writeInt(soLuongKhoa);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeBoolean(coTrangThai);
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.luuDuLieu("JewelSettings", byteArrayOutputStream.toByteArray());
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
            if ((102 + 159 - 172 + 102 ^ 59 + 41 - -23 + 64) > ((0x92 ^ 0xB7 ^ (0xC9 ^ 0xBE)) & (9 ^ 0x62 ^ (0x41 ^ 0x78) ^ -" ".length()))) throw throwable;
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

    public final void (int n >= String object) {
        if (!(AutoController.nhiemVuHienTai != null) || (AutoController.nhiemVuHienTai instanceof AutoBanDa == 0)) {
            return;
        }
        if ((var_int_if >= 2000000000)) {
            return;
        }
        object = ef_0.dd_0_do(n);
        if ((object != null) && AutoBanDa.cfr_renamed_3(((DuLieuNguoiChoi)object).var_short_do.equals("tho.kim.hoan") ? 1 : 0)) {
            var_int_if = n;
            soLuong = ((DuLieuNguoiChoi)object).coKichHoat ? 1 : 0;
            var_int_new = ((DuLieuNguoiChoi)object).var_short_if;
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

                        public final String toString() {
        return "Auto bán đá";
    }

    }

