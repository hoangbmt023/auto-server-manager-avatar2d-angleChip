/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class bI
implements Runnable {
    public static Vector var_java_util_Vector_do;
    private final byte var_byte_do;
    private static final int[] mangSoNguyen;
    public static boolean dangChayAuto;

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[11];
        1 = " ".length();
        0 = (0xCA ^ 0x90) & ~(0xF5 ^ 0xAF);
        443 = -(0xFFFFFF75 & 0x5ECF) & (0xFFFFDFFF & Short.MAX_VALUE);
        447 = -(0xFFFFFF47 & 0x6CF9) & (0xFFFFEFFF & 0x7DFF);
        448 = 0xFFFFFFCD & 0x1F2;
        444 = -(0xFFFFEF4D & 0x7AF6) & (0xFFFFFFFF & 0x6BFF);
        449 = -(0xFFFFFFFF & 0x4017) & (0xFFFFFDD7 & 0x43FF);
        451 = -(0xFFFFAABD & 0x7F5B) & (0xFFFFBFFF & 0x6BDB);
        456 = 0xFFFFD9EB & 0x27DC;
        2135 = -(0xFFFFB227 & 0x7FF9) & (0xFFFFFA7F & 0x3FF7);
        2136 = -(0xFFFFABD3 & 0x742F) & (0xFFFFEE5B & 0x39FE);
    }

        public final void cfr_renamed_0() {
        if ((dangChayAuto)) {
            return;
        }
        dangChayAuto = 1;
        GameCanvas.cfr_renamed_5();
        new Thread(this).start();
    }

        public bI(byte by2) {
        this.var_byte_do = by2;
    }

            /*
     * Unable to fully structure code
     */
    public final void run() {
        block12: {
            var1_1 = 0;
            bI.var_java_util_Vector_do = null;
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
            if (!bI.cfr_renamed_0((int)TienIchGame.cfr_renamed_15(5000L)) || !(bI.var_java_util_Vector_do != null)) break block12;
            var2_2 = 0;
            while ((var2_2 < bI.var_java_util_Vector_do.size())) {
                block13: {
                    var3_3 = (ef)bI.var_java_util_Vector_do.elementAt(var2_2);
                    if (!(var3_3 != null)) break block13;
                    var4_4 = 0;
                    switch (this.var_byte_do) {
                        case 1: {
                            if ((var3_3.var_short_do != 443) && (var3_3.var_short_do != 447) && !(var3_3.var_short_do == 448)) break;
                            var4_4 = 1;
                            if ((219 ^ 132 ^ (234 ^ 177)) > 0) break;
                            return;
                        }
                        case 2: {
                            if ((var3_3.var_short_do != 444) && (var3_3.var_short_do != 449) && (!(var3_3.var_short_do >= 451) || !(var3_3.var_short_do <= 456))) break;
                            var4_4 = 1;
                            if (" ".length() != 0) break;
                            return;
                        }
                        case 3: {
                            if (!(var3_3.var_short_do == 2135)) break;
                            if (((95 ^ 102) & ~(146 ^ 171)) >= " ".length()) {
                                return;
                            }
                            ** GOTO lbl41
                        }
                        case 4: {
                            if (!(var3_3.var_short_do == 2136)) break;
                            if ("  ".length() <= ((108 ^ 60) & ~(59 ^ 107))) {
                                return;
                            }
                            ** GOTO lbl41
                        }
                        case 5: {
                            if ((var3_3.var_short_do != 2135) && !(var3_3.var_short_do == 2136)) break;
lbl41:
                            // 3 sources

                            var4_4 = 1;
                        }
                    }
                    if ((var4_4 != 0)) {
                        ++var1_1;
                        eq.eq_do().void_if((int)var3_3.var_short_do, 1);
                        TienIchGame.hienThongBao(50L);
                    }
                }
                ++var2_2;
                if (" ".length() > 0) continue;
                return;
            }
        }
        bI.dangChayAuto = 0;
        GameCanvas.cfr_renamed_8();
        if ((AutoController.nhiemVuHienTai != 0)) {
            GameCanvas.cfr_renamed_1("Đã bỏ " + var1_1 + " vật phẩm");
        }
    }

    static {
        bI.cfr_renamed_1();
        dangChayAuto = 0;
        var_java_util_Vector_do = null;
    }

        }

