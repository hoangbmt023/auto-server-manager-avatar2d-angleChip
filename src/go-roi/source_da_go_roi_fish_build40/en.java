/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class en
extends dF {
    public static int cfr_renamed_21;
    public static int cfr_renamed_10;
    public static Image cfr_renamed_3;
    public int cfr_renamed_18 = 0;
    public static Image cfr_renamed_4;
    public static int cfr_renamed_30;
    public static Image cfr_renamed_5;
    public static int cfr_renamed_20;
    private en var_en_do;
    public static Image cfr_renamed_6;
    private static final int[] mangSoNguyen;
    public static Image cfr_renamed_7;
    public static int cfr_renamed_16;

    public void void_int(int n) {
    }

    public void (Graphics graphics != null) {
    }

    public void cfr_renamed_4() {
        GameCanvas.cfr_renamed_6();
        this.var_en_do = GameCanvas.var_en_do;
        GameCanvas.var_en_do = this;
        GameCanvas.gameCanvas.setFullScreenMode(1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public abstract void cfr_renamed_7();

        public final boolean boolean_do(en en2) {
        if ((this.var_en_do != null) && (en2 == this.var_en_do) && (!(GameCanvas.var_en_do != fo.fo_do()) || (GameCanvas.var_en_do == ep.cfr_renamed_1()))) {
            return 1;
        }
        return 0;
    }

        public void (int n != boolean bl) {
        this.cfr_renamed_18 = n;
    }

        public void (Graphics graphics == 0) {
        if ((GameCanvas.var_aa_do == 0) && (GameCanvas.var_dj_0_do == 0) && (GameCanvas.var_ez_do == 0) && !(cs_0.dangChayAuto)) {
            super.cfr_renamed_1(graphics);
            if ("   ".length() > "   ".length()) {
                return;
            }
        } else {
            GameCanvas.hienThongBaoPopup(graphics);
        }
        if (en.cfr_renamed_1(ae.ae_do().boolean_do() ? 1 : 0)) {
            GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, "2.5.8", GameCanvas.var_fs_do.soLuong, GameCanvas.var_fs_do.var_int_if, GameCanvas.var_fs_do.cfr_renamed_2);
            if ("   ".length() > (0xC0 ^ 0xC4)) {
                return;
            }
        } else if (!(GameCanvas.var_en_do != gv_0.var_gv_0_do) || (GameCanvas.var_en_do == gO.instance)) {
            GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, ae.ae_do().chuoiGiaTri, GameCanvas.var_fs_do.soLuong, GameCanvas.var_fs_do.var_int_if, GameCanvas.var_fs_do.cfr_renamed_2);
        }
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics);
    }

    public void (boolean bl == 0) {
        this.var_boolean_new = bl;
    }

        public static void cfr_renamed_20() {
        int n = GameCanvas.var_int_case + GameCanvas.this;
        if ((cfr_renamed_5 == 0)) {
            cfr_renamed_5 = Image.createImage((int)GameCanvas.soLuongKhoa, (int)n);
        }
        Graphics graphics = cfr_renamed_5.getGraphics();
        if ((GameCanvas.var_en_do == gI.var_gI_do)) {
            gI.var_gI_do.cfr_renamed_4(graphics);
            return;
        }
        if (!(GameCanvas.var_en_do != g_0.var_g_0_do) || (GameCanvas.var_en_do == bT.var_bT_do)) {
            int n2;
            if (en.boolean_do(GameCanvas.soLuongKhoa, n)) {
                n2 = n / 10;
                if (-(0xBA ^ 0xBE) > 0) {
                    return;
                }
            } else {
                n2 = GameCanvas.soLuongKhoa / 10;
            }
            int n3 = 0;
            while (en.boolean_do(n3, n2)) {
                graphics.setColor(6629892);
                graphics.drawRect(GameCanvas.cfr_renamed_15 - n3 * n2 - 1, n / 2 - n3 * n2, n3 * n2 << 1, n3 * n2 << 1);
                graphics.setColor(13399567);
                graphics.drawRect(GameCanvas.cfr_renamed_15 - n3 * n2, n / 2 - n3 * n2 + 1, n3 * n2 << 1, n3 * n2 << 1);
                ++n3;
                if (" ".length() >= " ".length()) continue;
                return;
            }
        }
    }

    static {
        en.cfr_renamed_2();
        cfr_renamed_16 = 20;
        cfr_renamed_30 = 0;
        en.cfr_renamed_10 = 20;
        int[] nArray = new int[2];
        nArray[0] = 4802889;
        nArray[1] = 3092271;
        int[] nArray2 = new int[2];
        nArray2[0] = 14400144;
        nArray2[1] = 12689526;
    }

    public void void_if() {
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[11];
        0 = (0x82 ^ 0xBD ^ (0xC2 ^ 0xB5)) & ("   ".length() ^ (0x27 ^ 0x6C) ^ -" ".length());
        1 = " ".length();
        10 = 9 + 147 - 36 + 60 ^ 7 + 116 - 120 + 187;
        6629892 = -(0xFFFFD2FF & 0x6DFB) & (0xFFFFEEFF & 0x657BFE);
        2 = "  ".length();
        13399567 = -(0xFFFFA9BD & 0x57F3) & (0xFFFFF7BF & 0xCC7FFF);
        20 = 36 + 88 - 107 + 122 ^ 158 + 48 - 69 + 22;
        4802889 = 0xFFFFFD4B & 0x494BFD;
        3092271 = -(0x5C ^ 0x4D) & (0xFFFFFF3F & 0x2F2FFF);
        14400144 = -(0xFFFFD71F & 0x6CEF) & (0xFFFFFFFF & 0xDBFE9E);
        12689526 = -(0xFFFFEFED & 0x5F9B) & (0xFFFFEFFE & 0xC1FFFF);
    }
}

