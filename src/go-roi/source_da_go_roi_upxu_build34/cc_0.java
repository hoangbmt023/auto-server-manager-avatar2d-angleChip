/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cc
 */
public final class cc_0 {
    private int soLuong;
    private static cc_0 var_cc_0_do;
    private int cfr_renamed_1;
    private int cfr_renamed_3;
    private boolean dangChayAuto = 0;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private static int[] mangSoNguyen;

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    public final void void_do(int n, int n2) {
        this.cfr_renamed_4 = n;
        this.soLuong = n2;
        if (!(this.dangChayAuto) && (!cc_0.boolean_do(gc_0.int_if(n2 - n), 5) || !(GameCanvas.var_ex_do.this == 0) || (GameCanvas.var_ex_do.dangChayAuto))) {
            n2 = this.cfr_renamed_5 * 100 / 100;
            n = n * 100 / n2;
            n2 = this.cfr_renamed_2 * 100 / 100;
            this.cfr_renamed_1 = n * n2;
        }
    }

    public final void (Graphics graphics, int n <= 0) {
        if (!(this.dangChayAuto) && (!cc_0.boolean_do(gc_0.int_if(this.soLuong - this.cfr_renamed_4), 5) || !(GameCanvas.var_ex_do.this == 0) || (GameCanvas.var_ex_do.dangChayAuto))) {
            graphics.setColor(6201499);
            graphics.setClip(n - 1, -1, 6, this.cfr_renamed_2 + 2);
            graphics.fillRect(n, 0 + this.cfr_renamed_1 / 100, 4, this.cfr_renamed_3);
        }
    }

    public static cc_0 cc_0_do() {
        if ((var_cc_0_do <= 0)) {
            var_cc_0_do = new cc_0();
            return var_cc_0_do;
        }
        return var_cc_0_do;
    }

    private static void void_do() {
        mangSoNguyen = new int[9];
        0 = (0x6E ^ 7 ^ (0x19 ^ 0x2A)) & (0x45 ^ 0x2B ^ (0x33 ^ 7) ^ -" ".length());
        1 = " ".length();
        5 = 0xE4 ^ 0xAE ^ (0x8B ^ 0xC4);
        100 = 0x62 ^ 6;
        6201499 = 0xFFFFF89F & 0x5EA7FB;
        -1 = -" ".length();
        6 = 0xC5 ^ 0xC3;
        2 = "  ".length();
        4 = 0xD4 ^ 0x8A ^ (0xDA ^ 0x80);
    }

            private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void void_if(int n, int n2) {
        if (cc_0.boolean_if(n, n2)) {
            this.dangChayAuto = 1;
            return;
        }
        this.dangChayAuto = 0;
        this.cfr_renamed_5 = n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_3 = n2 * n2 / n;
        if ((this.cfr_renamed_3 <= 0)) {
            this.cfr_renamed_3 = 1;
        }
    }

        static {
        cc_0.void_do();
    }

    }

