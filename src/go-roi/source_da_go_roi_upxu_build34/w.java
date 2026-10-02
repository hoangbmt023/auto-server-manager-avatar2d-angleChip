/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class w
extends dL {
    private static int soLuong;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static final int[] mangSoNguyen;
    public static w var_w_do;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[8];
        0 = (0x37 ^ 0x26) & ~(0x4E ^ 0x5F);
        1 = " ".length();
        51 = 0x75 ^ 0x46;
        2 = "  ".length();
        52 = 230 + 166 - 353 + 200 ^ 193 + 134 - 258 + 130;
        4 = 13 + 99 - 97 + 135 ^ 57 + 36 - 78 + 131;
        3 = "   ".length();
        20 = 0x88 ^ 0x9C;
    }

    public final void cfr_renamed_8() {
        t_0.dangChayAuto = 0;
        soLuong = 0;
        if (w.boolean_if(t_0.soLuong)) {
            var_javax_microedition_lcdui_Image_do = dL.cfr_renamed_5;
        }
        super.cfr_renamed_8();
        cd.soXu = 0L;
        (500L != 1);
    }

    public static w cfr_renamed_0() {
        if ((var_w_do == null)) {
            var_w_do = new w();
            return var_w_do;
        }
        return var_w_do;
    }

    static {
        w.cfr_renamed_1();
        soLuong = 20;
    }

        public final void (Graphics graphics != null) {
        k.cfr_renamed_0(0, 0, GameCanvas.var_int_byte, GameCanvas.gameCanvas.getHeight(), 0, graphics);
        if (w.boolean_do(soLuong, 1) && (var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_do, GameCanvas.var_int_byte >> 1, GameCanvas.var_int_char >> 1, 3);
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static void cfr_renamed_3(int n) {
        GameCanvas.cfr_renamed_5();
        ey_0.cfr_renamed_0().mangSoNguyen[4] = n;
        ey_0.cfr_renamed_0().void_for(0);
        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_4();
        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
        var_javax_microedition_lcdui_Image_do = null;
    }

    public static void (long l != boolean bl) {
        new cd(l, bl).cfr_renamed_4();
    }

    public final void void_for() {
        if (w.boolean_do(soLuong, 51)) {
            if (w.boolean_if(t_0.soLuong)) {
                if (w.boolean_if(t_0.soLuong, 2)) {
                    fe_0.fe_0_do().cfr_renamed_8();
                    var_javax_microedition_lcdui_Image_do = null;
                    t_0.soLuong = 0;
                    GameCanvas.var_gj_0_do.cfr_renamed_4();
                    if (((0xDE ^ 0x9E) & ~(0xCA ^ 0x8A)) != 0) {
                        return;
                    }
                }
            } else if (w.boolean_if(soLuong, 52)) {
                ThongTinNhanVat.cfr_renamed_0().cfr_renamed_11();
                ey_0.cfr_renamed_0().cfr_renamed_1();
                if (w.boolean_do(ThongTinNhanVat.coTrangThai ? 1 : 0)) {
                    ThongTinNhanVat.coTrangThai = 1;
                    ci_0.void_do("avatarSV");
                    ci_0.cfr_renamed_3();
                    w.cfr_renamed_3(0);
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    ci_0.cfr_renamed_3();
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_4();
                    if ((gE.gE_do() != GameCanvas.var_dL_do)) {
                        ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
                    }
                    var_javax_microedition_lcdui_Image_do = null;
                    if (" ".length() == (0x2E ^ 0x38 ^ (0xD3 ^ 0xC1))) {
                        return;
                    }
                }
            }
        } else if (w.boolean_if(t_0.soLuong) && w.boolean_do(soLuong)) {
            fe_0.fe_0_do().cfr_renamed_8();
            var_javax_microedition_lcdui_Image_do = null;
            t_0.soLuong = 0;
            GameCanvas.var_gj_0_do.cfr_renamed_4();
        }
        soLuong += 1;
    }

        private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 50: {
                w.cfr_renamed_3(0);
                return;
            }
            case 51: {
                w.cfr_renamed_3(1);
            }
        }
    }

        private static boolean boolean_if(int n) {
        return n != 0;
    }
}

