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

/*
 * Renamed from eZ
 */
public final class AutoTaiXiu
extends NhiemVuAutoBase {
    private static int soLuongKhoa;
    private static final int[] mangSoNguyen;
    private static byte var_byte_do;
    private static long soXu;
    public static int soLuong;
    private static int cfr_renamed_4;
    public static int var_int_if;
    private static float var_float_for;
    private static boolean dangChayAuto;
    public static float var_float_do;
    public static float var_float_if;

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        private static void cfr_renamed_4() {
        var_float_for = var_float_if;
        soLuongKhoa = 0;
        var_byte_do = (byte)0;
        cfr_renamed_4 = 0;
        var_int_if = -1;
        dangChayAuto = 0;
    }

    public final synchronized void void_for() {
        if (AutoTaiXiu.boolean_do((System.currentTimeMillis() - this.cfr_renamed_4 <= 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if ((!(GameCanvas.var_dL_do instanceof fe_0 == 0) || AutoTaiXiu.cfr_renamed_4(GameCanvas.var_dL_do.boolean_do(fe_0.fe_0_do()) ? 1 : 0)) && (ef_0.soLuong == 5)) {
            if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] <= 50000)) {
                AutoController.tatAuto();
                GameCanvas.hienThongBaoPopup("Hết xu rùi bạn ey! Giữ lại chút vốn chăm farm :(");
                return;
            }
            if ((cfr_renamed_4 == 2)) {
                if ((var_int_if >= 2000000000) && AutoTaiXiu.boolean_do(var_byte_do)) {
                    if (AutoTaiXiu.boolean_do(AutoTaiXiu.cfr_renamed_0(var_float_for, (float)(AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - 50000)))) {
                        var_float_for = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - 50000;
                    }
                    if (AutoTaiXiu.boolean_do((var_float_for <= 3.0E7f))) {
                        var_float_for = 3.0E7f;
                    }
                    this.cfr_renamed_4 = (int)System.currentTimeMillis();
                    eq.eq_do().cfr_renamed_0(20, var_byte_do, String.valueOf((int)Math.ceil(var_float_for)));
                    if (((0xE1 ^ 0x9D ^ (0x93 ^ 0xAF)) & (0x26 ^ 0x5D ^ (0x49 ^ 0x72) ^ -" ".length())) < ((4 + 124 - 42 + 56 ^ 11 + 89 - -1 + 31) & (5 + 48 - 16 + 115 ^ 144 + 136 - 218 + 84 ^ -" ".length()))) {
                        return;
                    }
                } else {
                    AutoTaiXiu.cfr_renamed_4();
                }
                cfr_renamed_4 = 1;
            }
            if (AutoTaiXiu.boolean_do((System.currentTimeMillis() - soXu <= 30000L))) {
                soXu = System.currentTimeMillis();
                fe_0.cfr_renamed_0(260, 120, 2, 0);
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
        if ((GameCanvas.var_dL_do instanceof fw != 0)) {
            long l = System.currentTimeMillis() - this.cfr_renamed_2;
            if (AutoTaiXiu.cfr_renamed_3((l <= 3000L))) {
                TienIchGame.hienThongBao(3000L - l);
            }
            fw.cfr_renamed_0().soLuongKhoa = 5;
            eq.eq_do().cfr_renamed_17(9);
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(3000L);
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof fe_0 != 0)) {
            if (!(TienIchGame.cfr_renamed_15(ef_0.soLuong))) {
                eq.eq_do().cfr_renamed_17(8);
                if ((TienIchGame.cfr_renamed_2(15000L))) {
                    TienIchGame.hienThongBao(2000L);
                }
                return;
            }
            if ((ef_0.soLuong != 5)) {
                int n;
                ef_0.var_int_char = 260;
                ef_0.var_int_new = 120;
                if (AutoTaiXiu.boolean_do(soLuong)) {
                    n = TienIchGame.int_do(0, soLuong);
                    } else {
                    n = -1;
                }
                int n2 = n;
                el_0.el_0_do().cfr_renamed_4(5, n2);
                if ((TienIchGame.cfr_renamed_2(15000L))) {
                    soXu = System.currentTimeMillis();
                    TienIchGame.hienThongBao(3000L);
                }
            }
        }
    }

    /*
     * Loose catch block
     */
    static {
        block11: {
            AutoTaiXiu.cfr_renamed_5();
            var_int_if = -1;
            cfr_renamed_4 = 0;
            var_byte_do = (byte)0;
            var_float_if = 10000.0f;
            var_float_do = 2.1f;
            dangChayAuto = 0;
            soXu = 0L;
            soLuong = -1;
            Object object = QuanLyRMS.byte_arr_do("TXSettings");
            if (!(object != null)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            var_float_if = dataInputStream.readInt();
            var_float_do = dataInputStream.readFloat();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("TXSettings");
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
                    if ("   ".length() < ((0x77 ^ 0x4E) & ~(0x5A ^ 0x63))) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (int n <= String string) {
        DuLieuNguoiChoi dd_02;
        if (!(AutoController.nhiemVuHienTai != null) || (AutoController.nhiemVuHienTai instanceof AutoTaiXiu == 0)) {
            return;
        }
        if ((var_int_if == -1) && (dd_02 = ef_0.dd_0_do(n) != null) && (dd_02.var_short_do.equals("than.tai.xiu"))) {
            var_int_if = n;
        }
        switch (cfr_renamed_4) {
            case 0: {
                if ((string.startsWith("Ván đang diễn ra"))) {
                    cfr_renamed_4 = 2;
                    dangChayAuto = 0;
                    return;
                }
                if (!!(dangChayAuto)) break;
                cfr_renamed_4 = 1;
                return;
            }
            case 1: {
                if (!(string.startsWith("Kết quả"))) break;
                dangChayAuto = 1;
                int n2 = string.lastIndexOf(58);
                String string2 = string.substring(n2 + 2);
                if ((string2.equalsIgnoreCase("Xỉu"))) {
                    if ((var_byte_do == 2)) {
                        soLuongKhoa = 0;
                        var_float_for = var_float_if;
                        if (-" ".length() >= ((0x18 ^ 0) & ~(0x84 ^ 0x9C))) {
                            return;
                        }
                    } else if ((var_byte_do == 1)) {
                        soLuongKhoa += 1;
                    }
                    var_byte_do = (byte)2;
                    if ((" ".length() & (" ".length() ^ -" ".length())) < 0) {
                        return;
                    }
                } else if ((string2.equalsIgnoreCase("Tài"))) {
                    if ((var_byte_do == 1)) {
                        soLuongKhoa = 0;
                        var_float_for = var_float_if;
                        if ((0x5E ^ 0x36 ^ (0x26 ^ 0x4A)) <= 0) {
                            return;
                        }
                    } else if ((var_byte_do == 2)) {
                        soLuongKhoa += 1;
                    }
                    var_byte_do = (byte)1;
                    if ((0xCC ^ 0x9D ^ (0x6F ^ 0x3A)) <= 0) {
                        return;
                    }
                } else {
                    var_byte_do = (byte)0;
                }
                if (AutoTaiXiu.boolean_do(soLuongKhoa)) {
                    var_float_for *= var_float_do;
                }
                cfr_renamed_4 = 0;
            }
        }
    }

        public static void void_do() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt((int)var_float_if);
        dataOutputStream.writeFloat(var_float_do);
        dataOutputStream.flush();
        byteArrayOutputStream.flush();
        QuanLyRMS.luuDuLieu("TXSettings", byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        dataOutputStream.close();
    }

            private static void cfr_renamed_5() {
        mangSoNguyen = new int[13];
        0 = (0xB9 ^ 0x85) & ~(0x28 ^ 0x14);
        -1 = -" ".length();
        2 = "  ".length();
        1 = " ".length();
        58 = 5 ^ 0x3F;
        5 = 37 + 49 - 29 + 75 ^ 23 + 85 - 10 + 31;
        50000 = 0xFFFFC7F2 & 0xFB5D;
        2000000000 = 0xFFFFF4F8 & 0x77359F07;
        20 = 0xAF ^ 0x9C ^ (0xBA ^ 0x9D);
        260 = 0xFFFFF985 & 0x77E;
        120 = 0x30 ^ 0x69 ^ (0x37 ^ 0x16);
        9 = 0x69 ^ 0x60;
        8 = 127 + 24 - 138 + 153 ^ 114 + 19 - 132 + 173;
    }

                public AutoTaiXiu() {
        AutoTaiXiu.cfr_renamed_4();
    }

    private static int (float f <= float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

        public final String toString() {
        return "Auto tài xỉu";
    }
}

