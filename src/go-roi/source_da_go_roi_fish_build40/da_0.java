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
 * Renamed from dA
 */
public final class da_0
extends NhiemVuAutoBase {
    private static boolean dangChayAuto;
    private static int var_int_if;
    private static byte var_byte_do;
    private static int soLuongKhoa;
    public static int soLuong;
    private static float var_float_for;
    public static float var_float_do;
    private static long soXu;
    public static float var_float_if;
    private static final int[] mangSoNguyen;

                private static void cfr_renamed_4() {
        mangSoNguyen = new int[13];
        0 = (0x9C ^ 0x94) & ~(0x22 ^ 0x2A);
        -1 = -" ".length();
        2 = "  ".length();
        1 = " ".length();
        58 = 154 + 116 - 220 + 120 ^ 94 + 67 - 127 + 110;
        5 = 0x78 ^ 0x16 ^ (0x73 ^ 0x18);
        9 = 0x2A ^ 0x23;
        8 = 0x2D ^ 0x65 ^ (0x63 ^ 0x23);
        260 = -(0xFFFFBE79 & 0x49BF) & (0xFFFFA9FD & 0x5F3E);
        120 = 241 + 72 - 270 + 210 ^ 109 + 48 - 77 + 53;
        50000 = 0xFFFFEF70 & 0xD3DF;
        2000000000 = 0xFFFFB411 & 0x7735DFEE;
        20 = 89 + 41 - -27 + 55 ^ 139 + 131 - 207 + 129;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static int (float f != float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

        /*
     * Loose catch block
     */
    static {
        block11: {
            da_0.cfr_renamed_4();
            soLuong = -1;
            soLuongKhoa = 0;
            var_byte_do = (byte)0;
            var_float_if = 10000.0f;
            var_float_do = 2.1f;
            dangChayAuto = 0;
            soXu = 0L;
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
                    if (" ".length() > (0x58 ^ 0x5C)) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    public final synchronized void d_() {
        if (da_0.cfr_renamed_2((System.currentTimeMillis() - this.cfr_renamed_3 != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if (da_0.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
            return;
        }
        if (da_0.boolean_do(GameCanvas.var_en_do instanceof ep) && (fh.var_int_char != 5)) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if (da_0.boolean_do(GameCanvas.var_en_do instanceof gO)) {
            long l = System.currentTimeMillis() - this.cfr_renamed_4;
            if (da_0.cfr_renamed_0((l != 3000L))) {
                TienIchGame.void_if(3000L - l);
            }
            gO.cfr_renamed_1().soLuong = 5;
            ft_0.ft_0_do().cfr_renamed_12(9);
            if (da_0.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if (!(TienIchGame.cfr_renamed_0(fh.var_int_char))) {
            ft_0.ft_0_do().cfr_renamed_12(8);
            if (da_0.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if ((fh.var_int_char != 5)) {
            int n;
            fh.cfr_renamed_9 = 260;
            fh.var_int_try = 120;
            if ((AutoCauCa.mangSoNguyen[5] > 0)) {
                n = TienIchGame.int_do(0, AutoCauCa.mangSoNguyen[5]);
                if (-"  ".length() >= 0) {
                    return;
                }
            } else {
                n = -1;
            }
            int n2 = n;
            fn.fn_do().cfr_renamed_3(5, n2);
            if (da_0.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
                soXu = System.currentTimeMillis();
                TienIchGame.void_if(3000L);
            }
            return;
        }
        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[0] <= 50000)) {
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Hết xu rùi bạn ey! Giữ lại chút vốn chăm farm :(");
            return;
        }
        if ((soLuongKhoa == 2)) {
            if ((soLuong >= 2000000000) && (var_byte_do > 0)) {
                if (da_0.cfr_renamed_2(da_0.cfr_renamed_1(var_float_for, (float)(AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - 50000)))) {
                    var_float_for = AngelChip.duLieuNguoiChoi.mangSoNguyen[0] - 50000;
                }
                if (da_0.cfr_renamed_2((var_float_for != 3.0E7f))) {
                    var_float_for = 3.0E7f;
                }
                this.cfr_renamed_3 = System.currentTimeMillis();
                ft_0.ft_0_do().cfr_renamed_1(20, var_byte_do, String.valueOf((int)Math.ceil(var_float_for)));
                if (" ".length() <= 0) {
                    return;
                }
            } else {
                da_0.cfr_renamed_6();
            }
            soLuongKhoa = 1;
        }
        if (da_0.cfr_renamed_2((System.currentTimeMillis() - soXu != 30000L))) {
            soXu = System.currentTimeMillis();
            go_0.cfr_renamed_1(260, 120, 2, 0);
        }
    }

    public static void cfr_renamed_3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt((int)var_float_if);
        dataOutputStream.writeFloat(var_float_do);
        dataOutputStream.flush();
        byteArrayOutputStream.flush();
        QuanLyRMS.docDuLieu("TXSettings", byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        dataOutputStream.close();
    }

        public da_0() {
        da_0.cfr_renamed_6();
    }

    private static void cfr_renamed_6() {
        var_float_for = var_float_if;
        var_int_if = 0;
        var_byte_do = (byte)0;
        soLuongKhoa = 0;
        soLuong = -1;
        dangChayAuto = 0;
    }

    public final String toString() {
        return "Auto tài xỉu";
    }

            public final void (int n != String string) {
        DuLieuNguoiChoi ef2;
        if (!(AutoController.nhiemVuHienTai != null) || (AutoController.nhiemVuHienTai instanceof da_0 == 0)) {
            return;
        }
        if ((soLuong == -1) && (ef2 = fh.ef_do(n) != null) && da_0.boolean_do(ef2.soLuong.equals("than.tai.xiu") ? 1 : 0)) {
            soLuong = n;
        }
        switch (soLuongKhoa) {
            case 0: {
                if (da_0.boolean_do(string.startsWith("Ván đang diễn ra") ? 1 : 0)) {
                    soLuongKhoa = 2;
                    dangChayAuto = 0;
                    return;
                }
                if (!!(dangChayAuto)) break;
                soLuongKhoa = 1;
                return;
            }
            case 1: {
                if (!da_0.boolean_do(string.startsWith("Kết quả") ? 1 : 0)) break;
                dangChayAuto = 1;
                int n2 = string.lastIndexOf(58);
                String string2 = string.substring(n2 + 2);
                if (da_0.boolean_do(string2.equalsIgnoreCase("Xỉu") ? 1 : 0)) {
                    if ((var_byte_do == 2)) {
                        var_int_if = 0;
                        var_float_for = var_float_if;
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else if ((var_byte_do == 1)) {
                        var_int_if += 1;
                    }
                    var_byte_do = (byte)2;
                    } else if (da_0.boolean_do(string2.equalsIgnoreCase("Tài") ? 1 : 0)) {
                    if ((var_byte_do == 1)) {
                        var_int_if = 0;
                        var_float_for = var_float_if;
                        if ((140 + 75 - 133 + 105 ^ 86 + 190 - 235 + 150) == ((0x19 ^ 0x24 ^ (0xC8 ^ 0xB9)) & (0x10 ^ 0x77 ^ (0xB1 ^ 0x9A) ^ -" ".length()))) {
                            return;
                        }
                    } else if ((var_byte_do == 2)) {
                        var_int_if += 1;
                    }
                    var_byte_do = (byte)1;
                    } else {
                    var_byte_do = (byte)0;
                }
                if ((var_int_if > 0)) {
                    var_float_for *= var_float_do;
                }
                soLuongKhoa = 0;
            }
        }
    }
}

