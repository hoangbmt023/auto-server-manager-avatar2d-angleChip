/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class dT
implements Runnable {
    private static final int[] mangSoNguyen;
    public static boolean dangChayAuto;
    private final byte var_byte_do;
    public static Vector var_java_util_Vector_do;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[11];
        1 = " ".length();
        0 = (0xAA ^ 0xB3) & ~(0x23 ^ 0x3A);
        443 = 0xFFFFA5BF & 0x5BFB;
        447 = -(0xFFFFFFC3 & 0x223D) & (0xFFFFF7BF & 0x2BFF);
        448 = 0xFFFFFFF7 & 0x1C8;
        444 = 0xFFFFA9BD & 0x57FE;
        449 = 0xFFFFFDE1 & 0x3DF;
        451 = -(0xFFFFDE0F & 0x61F9) & (0xFFFFFDDF & 0x43EB);
        456 = -(0xFFFFFEB1 & 0x355F) & (0xFFFFB7D8 & 0x7DFF);
        2135 = 0xFFFF8957 & 0x7EFF;
        2136 = -(0xFFFFF3A7 & 0x5F5F) & (0xFFFFFF7E & 0x5BDF);
    }

                        public final void cfr_renamed_1() {
        if ((dangChayAuto)) {
            return;
        }
        dangChayAuto = 1;
        GameCanvas.cfr_renamed_8();
        new Thread(this).start();
    }

    static {
        dT.cfr_renamed_0();
        dangChayAuto = 0;
        var_java_util_Vector_do = null;
    }

                /*
     * Unable to fully structure code
     */
    public final void run() {
        block12: {
            var1_1 = 0;
            dT.var_java_util_Vector_do = null;
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
            if (!dT.cfr_renamed_1((int)TienIchGame.cfr_renamed_4(5000L)) || !(dT.var_java_util_Vector_do != null)) break block12;
            var2_2 = 0;
            while ((var2_2 < dT.var_java_util_Vector_do.size())) {
                block13: {
                    var3_3 = (cg)dT.var_java_util_Vector_do.elementAt(var2_2);
                    if (!(var3_3 != null)) break block13;
                    var4_4 = 0;
                    switch (this.var_byte_do) {
                        case 1: {
                            if ((var3_3.var_short_do != 443) && (var3_3.var_short_do != 447) && !(var3_3.var_short_do == 448)) break;
                            var4_4 = 1;
                            if (-" ".length() <= 0) break;
                            return;
                        }
                        case 2: {
                            if ((var3_3.var_short_do != 444) && (var3_3.var_short_do != 449) && (!(var3_3.var_short_do >= 451) || !(var3_3.var_short_do <= 456))) break;
                            var4_4 = 1;
                            if ("   ".length() < (178 ^ 163 ^ (1 ^ 20))) break;
                            return;
                        }
                        case 3: {
                            if (!(var3_3.var_short_do == 2135)) break;
                            if (((5 ^ 32 ^ (242 ^ 182)) & (217 ^ 177 ^ (169 ^ 160) ^ -" ".length())) != 0) {
                                return;
                            }
                            ** GOTO lbl41
                        }
                        case 4: {
                            if (!(var3_3.var_short_do == 2136)) break;
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
                        ft_0.ft_0_do().void_do((int)var3_3.var_short_do, 1);
                        TienIchGame.void_if(50L);
                    }
                }
                ++var2_2;
                if ((74 ^ 25 ^ (250 ^ 173)) >= -" ".length()) continue;
                return;
            }
        }
        dT.dangChayAuto = 0;
        GameCanvas.cfr_renamed_7();
        if ((AutoController.nhiemVuHienTai != 0)) {
            GameCanvas.cfr_renamed_1("Đã bỏ " + var1_1 + " vật phẩm");
        }
    }

    public dT(byte by2) {
        this.var_byte_do = by2;
    }
}

