/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Renamed from G
 */
public final class g_0
extends ea {
    private Image var_javax_microedition_lcdui_Image_do;
    private static int[] mangSoNguyen;

                public final void void_do() {
    }

        public final void (Graphics graphics <= 0) {
        if ((this.var_javax_microedition_lcdui_Image_do > 0)) {
            this.cfr_renamed_2 = ci_0.cfr_renamed_1((short)((short)this.cfr_renamed_12)).cfr_renamed_1;
            ci_0.cfr_renamed_0(graphics, this.cfr_renamed_12, this.cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 33);
            if ("   ".length() == 0) {
                return;
            }
        } else {
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 33);
        }
        if ((this.cfr_renamed_12 == 846)) {
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(fe_0.var_byte_for), this.cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int - 30 * aG.var_int_int, 2);
            return;
        }
        if ((this.cfr_renamed_12 == 1029) && (bF.var_short_do != 0)) {
            int n;
            ff ff2 = bF.ff_do(ak_0.dv_0_do((short)bF.var_short_do).var_short_do);
            String string = "";
            int n2 = bF.var_int_char / 3600;
            if ((n2 > 0)) {
                string = String.valueOf(n2) + ":";
            }
            if (!(n = (bF.var_int_char - n2 * 3600) / 60 <= 0) || (n2 > 0)) {
                string = String.valueOf(string) + n + ":";
            }
            n2 = bF.var_int_char - n2 * 3600 - n * 60;
            string = String.valueOf(string) + n2;
            if ((bF.var_int_char == 0)) {
                string = "hoan thanh";
            }
            bF.var_int_goto = this.cfr_renamed_3 - GameCanvas.var_ew_int.cfr_renamed_0(string) / 2 / aG.var_int_int;
            bF.var_int_byte = this.var_int_if - ci_0.cfr_renamed_1((short)((short)this.cfr_renamed_12)).var_short_do / aG.var_int_int - 10;
            ak_0.cfr_renamed_0(graphics, ff2.var_short_if, this.cfr_renamed_3 * aG.var_int_int - GameCanvas.var_ew_int.cfr_renamed_0(string) / 2, this.var_int_if * aG.var_int_int - ci_0.cfr_renamed_1((short)((short)this.cfr_renamed_12)).var_short_do - 10 * aG.var_int_int, 3);
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, string, this.cfr_renamed_3 * aG.var_int_int - GameCanvas.var_ew_int.cfr_renamed_0(string) / 2 + 10 * aG.var_int_int, this.var_int_if * aG.var_int_int - ci_0.cfr_renamed_1((short)((short)this.cfr_renamed_12)).var_short_do - 10 * aG.var_int_int - bn_0.cfr_renamed_8 / 2 + 2, 0);
        }
    }

    public g_0(int n, int n2, int n3) {
        super(n, n2, n3, 0);
        ap.void_do(MenuChinhAvatar.cd);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("" + n);
        if ((this.var_javax_microedition_lcdui_Image_do <= 0)) {
            this.var_javax_microedition_lcdui_Image_do.getWidth();
            }
        ap.cfr_renamed_0();
    }

    static {
        g_0.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[10];
        0 = (0x64 ^ 0x69) & ~(0x48 ^ 0x45);
        33 = 0x39 ^ 0xE ^ (0x91 ^ 0x87);
        846 = 0xFFFFEF4F & 0x13FE;
        30 = 4 ^ 0x7D ^ (0x1C ^ 0x7B);
        2 = "  ".length();
        1029 = 0xFFFFDC07 & 0x27FD;
        3600 = 0xFFFFEED0 & 0x1F3F;
        60 = 8 ^ 0x42 ^ (0xD2 ^ 0xA4);
        10 = 21 + 158 - 52 + 39 ^ 0 + 44 - -59 + 69;
        3 = "   ".length();
    }

        }

