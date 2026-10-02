/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cP
 */
public final class cp_0 {
    private int soLuong;
    private static cp_0 var_cp_0_do;
    private int cfr_renamed_0;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private boolean dangChayAuto = 0;
    private static int[] mangSoNguyen;
    private int cfr_renamed_5;

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

        public final void (Graphics graphics, int n == null) {
        if ((this.dangChayAuto ? 1 : 0 == null) && (!cp_0.boolean_if(hg.int_do(this.cfr_renamed_3 - this.cfr_renamed_5), 5) || !(GameCanvas.var_cg_0_do.cfr_renamed_4 == null) || (GameCanvas.var_cg_0_do.dangChayAuto))) {
            graphics.setColor(6201499);
            graphics.setClip(n - 1, -1, 6, this.cfr_renamed_4 + 2);
            graphics.fillRect(n, 0 + this.cfr_renamed_2 / 100, 4, this.cfr_renamed_0);
        }
    }

        public final void void_do(int n, int n2) {
        if (cp_0.boolean_do(n, n2)) {
            this.dangChayAuto = 1;
            return;
        }
        this.dangChayAuto = 0;
        this.soLuong = n;
        this.cfr_renamed_4 = n2;
        this.cfr_renamed_0 = n2 * n2 / n;
        if ((this.cfr_renamed_0 <= 0)) {
            this.cfr_renamed_0 = 1;
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

    private static void void_do() {
        mangSoNguyen = new int[9];
        0 = (122 + 113 - 141 + 49 ^ 63 + 112 - 58 + 28) & (69 + 132 - 170 + 147 ^ 98 + 75 - 31 + 30 ^ -" ".length());
        1 = " ".length();
        5 = 0x80 ^ 0x85;
        100 = 0x1D ^ 0x22 ^ (1 ^ 0x5A);
        6201499 = -(0xFFFFDFCF & 0x6E35) & (0xFFFFEEFF & 0x5EFF9F);
        -1 = -" ".length();
        6 = 0x66 ^ 0x60;
        2 = "  ".length();
        4 = 0x13 ^ 0x17;
    }

        public final void void_if(int n, int n2) {
        this.cfr_renamed_5 = n;
        this.cfr_renamed_3 = n2;
        if ((this.dangChayAuto ? 1 : 0 == null) && (!cp_0.boolean_if(hg.int_do(n2 - n), 5) || !(GameCanvas.var_cg_0_do.cfr_renamed_4 == null) || (GameCanvas.var_cg_0_do.dangChayAuto))) {
            n2 = this.soLuong * 100 / 100;
            n = n * 100 / n2;
            n2 = this.cfr_renamed_4 * 100 / 100;
            this.cfr_renamed_2 = n * n2;
        }
    }

    public static cp_0 cp_0_do() {
        if ((var_cp_0_do == null)) {
            var_cp_0_do = new cp_0();
            return var_cp_0_do;
        }
        return var_cp_0_do;
    }

        static {
        cp_0.void_do();
    }
}

