/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class dL
extends bn_0 {
    public int cfr_renamed_17 = 0;
    public static int cfr_renamed_13;
    public static Image cfr_renamed_4;
    public static Image cfr_renamed_5;
    public static int cfr_renamed_30;
    public static Image cfr_renamed_2;
    public static int cfr_renamed_22;
    public static Image cfr_renamed_15;
    public static int cfr_renamed_19;
    public static Image cfr_renamed_8;
    private static final int[] mangSoNguyen;
    private dL var_dL_do;
    public static int cfr_renamed_20;

    public abstract void void_for();

    public static void cfr_renamed_19() {
        int n = GameCanvas.var_int_char + GameCanvas.var_int_else;
        if ((cfr_renamed_8 == null)) {
            cfr_renamed_8 = Image.createImage((int)GameCanvas.var_int_byte, (int)n);
        }
        Graphics graphics = cfr_renamed_8.getGraphics();
        if ((GameCanvas.var_dL_do == fk.var_fk_do)) {
            fk.var_fk_do.cfr_renamed_5(graphics);
            return;
        }
        if (!(GameCanvas.var_dL_do != bB.var_bB_do) || (GameCanvas.var_dL_do == bm.var_bm_do)) {
            int n2;
            if (dL.boolean_do(GameCanvas.var_int_byte, n)) {
                n2 = n / 10;
                if (((0x19 ^ 0x59) & ~(0x79 ^ 0x39)) <= -" ".length()) {
                    return;
                }
            } else {
                n2 = GameCanvas.var_int_byte / 10;
            }
            int n3 = 0;
            while (dL.boolean_do(n3, n2)) {
                graphics.setColor(6629892);
                graphics.drawRect(GameCanvas.var_int_int - n3 * n2 - 1, n / 2 - n3 * n2, n3 * n2 << 1, n3 * n2 << 1);
                graphics.setColor(13399567);
                graphics.drawRect(GameCanvas.var_int_int - n3 * n2, n / 2 - n3 * n2 + 1, n3 * n2 << 1, n3 * n2 << 1);
                ++n3;
                if (((0xC3 ^ 0x87) & ~(0xC9 ^ 0x8D)) == 0) continue;
                return;
            }
        }
    }

    static {
        dL.cfr_renamed_1();
        dL.cfr_renamed_13 = 20;
        cfr_renamed_22 = 0;
        cfr_renamed_19 = 20;
        int[] nArray = new int[2];
        nArray[0] = 4802889;
        nArray[1] = 3092271;
        int[] nArray2 = new int[2];
        nArray2[0] = 14400144;
        nArray2[1] = 12689526;
    }

        public void (int n != boolean bl) {
        this.cfr_renamed_17 = n;
    }

    public void cfr_renamed_8() {
        GameCanvas.void_if();
        this.var_dL_do = GameCanvas.var_dL_do;
        GameCanvas.var_dL_do = this;
        GameCanvas.gameCanvas.setFullScreenMode(1);
    }

    public void (Graphics graphics == null) {
    }

    public final boolean boolean_do(dL dL2) {
        if ((this.var_dL_do != null) && (dL2 == this.var_dL_do) && (!(GameCanvas.var_dL_do != em_0.em_0_do()) || (GameCanvas.var_dL_do == dN.cfr_renamed_0()))) {
            return 1;
        }
        return 0;
    }

        public void (boolean bl == null) {
        this.var_boolean_new = bl;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[11];
        0 = (0x5A ^ 0x49 ^ (0x1A ^ 0xC)) & (0x7A ^ 0x62 ^ (0x63 ^ 0x7E) ^ -" ".length());
        1 = " ".length();
        10 = 152 + 32 - 45 + 48 ^ 129 + 77 - 51 + 22;
        6629892 = -(0xFFFFDBFF & 0x347C) & (0xFFFFBA7F & 0x657FFF);
        2 = "  ".length();
        13399567 = -(137 + 86 - 179 + 117) & (0xFFFFF6EF & 0xCC7FBF);
        20 = 45 + 144 - 45 + 32 ^ 115 + 17 - 63 + 95;
        4802889 = 0xFFFFCB5D & 0x497DEB;
        3092271 = 0xFFFFAF2F & 0x2F7FFF;
        14400144 = -(0xFFFF8569 & 0x7BD7) & (0xFFFFBBDB & 0xDBFFF4);
        12689526 = 0xFFFFE1F6 & 0xC1BE7F;
    }

    public void void_do(int n) {
    }

    public void (Graphics graphics != null) {
        if ((GameCanvas.var_e_0_do == null) && (GameCanvas.var_bt_0_do == null) && (GameCanvas.var_dX_do == null) && dL.boolean_do(ce.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_0(graphics);
            if ((0xF ^ 0xA) == 0) {
                return;
            }
        } else {
            GameCanvas.cfr_renamed_1(graphics);
        }
        if (dL.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            GameCanvas.var_ew_if.cfr_renamed_0(graphics, "2.5.8", GameCanvas.var_eq_0_do.var_int_if, GameCanvas.var_eq_0_do.soLuong, GameCanvas.var_eq_0_do.cfr_renamed_3);
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else if (!(GameCanvas.var_dL_do != gE.var_gE_do) || (GameCanvas.var_dL_do == fw.var_fw_do)) {
            GameCanvas.var_ew_if.cfr_renamed_0(graphics, i_0.i_0_do().chuoiGiaTri, GameCanvas.var_eq_0_do.var_int_if, GameCanvas.var_eq_0_do.soLuong, GameCanvas.var_eq_0_do.cfr_renamed_3);
        }
        GameCanvas.var_gj_0_do.cfr_renamed_3(graphics);
    }

        private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

        private static boolean boolean_do(int n) {
        return n == 0;
    }

    public void cfr_renamed_2() {
    }
}

