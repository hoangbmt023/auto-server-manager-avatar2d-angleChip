/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cS
 */
public final class cs_0
extends dF {
    private static final int[] mangSoNguyen;
    private long soXu;
    public gl var_gl_do;
    public static boolean dangChayAuto;
    public static cs_0 var_cs_0_do;
    public ey_0 var_ey_0_do;

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_6() {
        this.var_ey_0_do.cfr_renamed_2();
        if (!cs_0.boolean_if(ab.soLuong, 1) || cs_0.boolean_do(ab.soLuong, 2)) {
            this.var_ey_0_do.cfr_renamed_1(ab.cfr_renamed_1(this.var_ey_0_do.java_lang_String_do()));
        }
        if (cs_0.boolean_for(al_0.dangChayAuto ? 1 : 0) && cs_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            GameCanvas.var_fa_0_do.void_do(this.var_fl_0_try, this.cfr_renamed_3, this.var_fl_0_new);
            return;
        }
        super.cfr_renamed_6();
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

    protected cs_0() {
        this.var_fl_0_try = new fl_0(MenuChinhAvatar.by, 0);
        this.cfr_renamed_3 = new fl_0(MenuChinhAvatar.ce, 1);
        this.var_ey_0_do = new ey_0();
        this.var_ey_0_do.coTrangThai = 0;
        this.var_ey_0_do.cfr_renamed_0(1);
        this.cfr_renamed_0();
        this.var_ey_0_do.var_int_if = (GameCanvas.soLuongKhoa - this.var_ey_0_do.cfr_renamed_9) / 2;
        this.var_ey_0_do.cfr_renamed_3();
        this.var_fl_0_new = this.var_ey_0_do.fl_0_do();
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

        public static cs_0 cfr_renamed_1() {
        if ((var_cs_0_do == null)) {
            var_cs_0_do = new cs_0();
            return var_cs_0_do;
        }
        return var_cs_0_do;
    }

    public final void cfr_renamed_0() {
        this.var_ey_0_do.cfr_renamed_14 = GameCanvas.var_int_int - GameCanvas.this - this.var_ey_0_do.var_int_new - 5;
        if (cs_0.boolean_for(al_0.dangChayAuto ? 1 : 0)) {
            this.var_ey_0_do.cfr_renamed_14 -= 2 * dF.cfr_renamed_12;
        }
        this.var_ey_0_do.cfr_renamed_9 = GameCanvas.soLuongKhoa - 10;
    }

    public final void (int n, gl gl2 == null) {
        if ((GameCanvas.var_ez_do == null)) {
            this.var_ey_0_do.boolean_do(n);
            if (cs_0.boolean_do(this.var_ey_0_do.java_lang_String_do().equals("") ? 1 : 0)) {
                this.var_gl_do = gl2;
                dangChayAuto = 1;
            }
            this.cfr_renamed_0();
        }
    }

        private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[6];
        0 = (0x94 ^ 0x9C) & ~(0x3F ^ 0x37);
        1 = " ".length();
        4 = 0x67 ^ 0x63;
        2 = "  ".length();
        5 = 180 + 91 - 266 + 183 ^ 40 + 114 - 113 + 144;
        10 = 0xBE ^ 0x81 ^ (0x69 ^ 0x5C);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_ey_0_do.cfr_renamed_1("");
                dangChayAuto = 0;
                this.var_ey_0_do.cfr_renamed_0(1);
                return;
            }
            case 1: {
                long l = System.currentTimeMillis();
                if (((l - this.soXu, 2000L == null) != null)) {
                    return;
                }
                if (!(this.var_gl_do != null)) break;
                this.var_gl_do.cfr_renamed_2(this.var_ey_0_do.java_lang_String_do());
                this.var_ey_0_do.cfr_renamed_1("");
                dangChayAuto = 0;
                this.var_ey_0_do.cfr_renamed_0(1);
                this.soXu = l;
            }
        }
    }

    public final void (Graphics graphics == null) {
        if (cs_0.boolean_for(al_0.dangChayAuto ? 1 : 0)) {
            al_0.cfr_renamed_1(graphics, this.var_fl_0_try, this.cfr_renamed_3, this.var_fl_0_new);
            if (((51 + 6 - -32 + 77 ^ 99 + 130 - 168 + 136) & (0x53 ^ 0x16 ^ (0x27 ^ 1) ^ -" ".length())) == "   ".length()) {
                return;
            }
        } else {
            super.cfr_renamed_1(graphics);
        }
        this.var_ey_0_do.cfr_renamed_1(graphics);
    }

    public final void void_do(int n) {
        if (cs_0.boolean_for(dangChayAuto ? 1 : 0)) {
            this.var_ey_0_do.boolean_do(n);
            }
    }

    static {
        cs_0.cfr_renamed_3();
        dangChayAuto = 0;
    }

    public final void cfr_renamed_2() {
        this.var_ey_0_do.cfr_renamed_1("");
        dangChayAuto = 0;
        this.var_ey_0_do.cfr_renamed_0(1);
        if (cs_0.boolean_for(al_0.dangChayAuto ? 1 : 0) && cs_0.boolean_for(gA.coTrangThai ? 1 : 0)) {
            gA.coTrangThai = 0;
            gA.cfr_renamed_1().0 = 0;
            GameCanvas.gameCanvas.cfr_renamed_3();
        }
    }
}

