/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aU
extends en {
    private static final int[] mangSoNguyen;
    private static int soLuong;
    public static aU var_aU_do;
    public static Image var_javax_microedition_lcdui_Image_do;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        public final void void_do(int n, int n2) {
        switch (n) {
            case 50: {
                aU.void_do(0);
                return;
            }
            case 51: {
                aU.void_do(1);
            }
        }
    }

    public static aU cfr_renamed_1() {
        if ((var_aU_do == null)) {
            var_aU_do = new aU();
            return var_aU_do;
        }
        return var_aU_do;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[8];
        0 = (0x4E ^ 0x58) & ~(0xB2 ^ 0xA4);
        1 = " ".length();
        51 = 0xA0 ^ 0x93;
        2 = "  ".length();
        52 = 49 + 15 - -92 + 4 ^ 134 + 32 - 21 + 3;
        4 = 0x4E ^ 0x4A;
        3 = "   ".length();
        20 = 0xAD ^ 0xB9;
    }

    public final void cfr_renamed_4() {
        al_0.dangChayAuto = 0;
        soLuong = 0;
        if (aU.boolean_do(al_0.soLuong)) {
            var_javax_microedition_lcdui_Image_do = en.cfr_renamed_6;
        }
        super.cfr_renamed_4();
        cR.soXu = 0L;
        (500L != 1);
    }

    private static void void_do(int n) {
        GameCanvas.cfr_renamed_8();
        gA.cfr_renamed_1().mangSoNguyen[4] = n;
        gA.cfr_renamed_1().void_do(0);
        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_2();
        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
        var_javax_microedition_lcdui_Image_do = null;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_7() {
        if (aU.boolean_if(soLuong, 51)) {
            if (aU.boolean_do(al_0.soLuong)) {
                if (aU.boolean_do(al_0.soLuong, 2)) {
                    go_0.go_0_do().cfr_renamed_4();
                    var_javax_microedition_lcdui_Image_do = null;
                    al_0.soLuong = 0;
                    GameCanvas.var_fa_0_do.void_do();
                    }
            } else if (aU.boolean_do(soLuong, 52)) {
                ThongTinNhanVat.cfr_renamed_1().cfr_renamed_9();
                gA.cfr_renamed_1().cfr_renamed_3();
                if ((ThongTinNhanVat.dangChayAuto ? 1 : 0 != null)) {
                    ThongTinNhanVat.dangChayAuto = 1;
                    aa_0.void_do("avatarSV");
                    aa_0.cfr_renamed_3();
                    aU.void_do(0);
                    if ("  ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    aa_0.cfr_renamed_3();
                    ThongTinNhanVat.cfr_renamed_1().cfr_renamed_2();
                    if ((gv_0.gv_0_do() != GameCanvas.var_en_do)) {
                        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
                    }
                    var_javax_microedition_lcdui_Image_do = null;
                    if ((0xB3 ^ 0xB7) == 0) {
                        return;
                    }
                }
            }
        } else if (aU.boolean_do(al_0.soLuong) && (soLuong != null)) {
            go_0.go_0_do().cfr_renamed_4();
            var_javax_microedition_lcdui_Image_do = null;
            al_0.soLuong = 0;
            GameCanvas.var_fa_0_do.void_do();
        }
        soLuong += 1;
    }

            private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    static {
        aU.cfr_renamed_2();
        soLuong = 20;
    }

    public static void (long l != boolean bl) {
        new cR(l, bl).void_do();
    }

    public final void (Graphics graphics == null) {
        v_0.cfr_renamed_1(0, 0, GameCanvas.soLuongKhoa, GameCanvas.gameCanvas.getHeight(), 0, graphics);
        if (aU.boolean_if(soLuong, 1) && (var_javax_microedition_lcdui_Image_do != null)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_do, GameCanvas.soLuongKhoa >> 1, GameCanvas.var_int_case >> 1, 3);
        }
    }

    }

