/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ac
extends fd_0 {
    private Image var_javax_microedition_lcdui_Image_do;
    private static int[] mangSoNguyen;

    static {
        ac.cfr_renamed_0();
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[10];
        0 = (0x63 ^ 0x5C) & ~(0xAE ^ 0x91);
        33 = 0x98 ^ 0xB9;
        846 = -(0xFFFFFD2A & 0x3EF7) & (0xFFFFBF7F & 0x7FEF);
        30 = 0x1E ^ 0;
        2 = "  ".length();
        1029 = 0xFFFFBF7F & 0x4485;
        3600 = 0xFFFF9F7A & 0x6E95;
        60 = 0x9B ^ 0x94 ^ (0x54 ^ 0x67);
        10 = 0xEE ^ 0x85 ^ (0x45 ^ 0x24);
        3 = "   ".length();
    }

            public final void void_do() {
    }

        public final void (Graphics graphics != null) {
        if ((this.var_javax_microedition_lcdui_Image_do == null)) {
            this.cfr_renamed_5 = aa_0.cfr_renamed_0((short)((short)this.cfr_renamed_8)).var_short_do;
            aa_0.cfr_renamed_1(graphics, this.cfr_renamed_8, this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if, 33);
            if (((0x8E ^ 0x96 ^ (0x86 ^ 0xC0)) & (0x7B ^ 2 ^ (0x52 ^ 0x75) ^ -" ".length())) != 0) {
                return;
            }
        } else {
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if, 33);
        }
        if ((this.cfr_renamed_8 == 846)) {
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(go_0.var_byte_do), this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if - 30 * bm.var_int_if, 2);
            return;
        }
        if ((this.cfr_renamed_8 == 1029) && (dR.var_short_do == null)) {
            int n;
            dg_0 dg_02 = dR.dg_0_do(bz.ex_do((short)dR.var_short_do).var_short_do);
            String string = "";
            int n2 = dR.soLuongKhoa / 3600;
            if ((n2 != null)) {
                string = String.valueOf(n2) + ":";
            }
            if (!(n = (dR.soLuongKhoa - n2 * 3600) / 60 <= 0) || (n2 != null)) {
                string = String.valueOf(string) + n + ":";
            }
            n2 = dR.soLuongKhoa - n2 * 3600 - n * 60;
            string = String.valueOf(string) + n2;
            if ((dR.soLuongKhoa == 0)) {
                string = "hoan thanh";
            }
            dR.var_int_try = this.cfr_renamed_2 - GameCanvas.var_fz_0_for.cfr_renamed_1(string) / 2 / bm.var_int_if;
            dR.var_int_else = this.cfr_renamed_3 - aa_0.cfr_renamed_0((short)((short)this.cfr_renamed_8)).cfr_renamed_0 / bm.var_int_if - 10;
            bz.cfr_renamed_1(graphics, dg_02.var_short_if, this.cfr_renamed_2 * bm.var_int_if - GameCanvas.var_fz_0_for.cfr_renamed_1(string) / 2, this.cfr_renamed_3 * bm.var_int_if - aa_0.cfr_renamed_0((short)((short)this.cfr_renamed_8)).cfr_renamed_0 - 10 * bm.var_int_if, 3);
            GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, string, this.cfr_renamed_2 * bm.var_int_if - GameCanvas.var_fz_0_for.cfr_renamed_1(string) / 2 + 10 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if - aa_0.cfr_renamed_0((short)((short)this.cfr_renamed_8)).cfr_renamed_0 - 10 * bm.var_int_if - dF.cfr_renamed_7 / 2 + 2, 0);
        }
    }

        public ac(int n, int n2, int n3) {
        super(n, n2, n3, 0);
        e.void_do(MenuChinhAvatar.Z);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("" + n);
        if ((this.var_javax_microedition_lcdui_Image_do != null)) {
            this.var_javax_microedition_lcdui_Image_do.getWidth();
            }
        e.cfr_renamed_1();
    }

    }

