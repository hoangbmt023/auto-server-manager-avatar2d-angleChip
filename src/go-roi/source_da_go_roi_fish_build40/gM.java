/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class gM {
    int soLuong;
    private int cfr_renamed_0;
    private static int[] mangSoNguyen;
    private int cfr_renamed_2;
    private int cfr_renamed_3;

    static {
        gM.cfr_renamed_1();
    }

        public final void (Graphics graphics > 0) {
        int n;
        if ((GameCanvas.soLuongKhoa > 200)) {
            n = 870;
            if ("   ".length() <= "  ".length()) {
                return;
            }
        } else {
            n = 871;
        }
        Object object = aa_0.cfr_renamed_0((short)n);
        if (gM.cfr_renamed_0(((d_0)object).soLuong, -1)) {
            graphics.drawRegion(((d_0)object).var_javax_microedition_lcdui_Image_do, 0, this.cfr_renamed_0 * z_0.soLuong, z_0.var_int_if, z_0.soLuong, 0, this.cfr_renamed_3, this.cfr_renamed_2, 3);
            object = GameCanvas.var_fz_0_int;
            if ((GameCanvas.soLuongKhoa <= 200)) {
                object = GameCanvas.var_fz_0_for;
            }
            if ((GameCanvas.cfr_renamed_12 > 0)) {
                object = GameCanvas.var_fz_0_try;
            }
            object.cfr_renamed_1(graphics, String.valueOf(this.soLuong), this.cfr_renamed_3, this.cfr_renamed_2 - dF.var_byte_try / 2, 2);
        }
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[7];
        200 = (0x19 ^ 0x49) + (0x53 ^ 0x39) - -(0x99 ^ 0x92) + "   ".length();
        870 = 0xFFFFD367 & 0x2FFE;
        871 = -(0xFFFFFDB9 & 0x3EC7) & (0xFFFFBFFF & 0x7FE7);
        -1 = -" ".length();
        0 = (0x5B ^ 7) & ~(0x4A ^ 0x16);
        3 = "   ".length();
        2 = "  ".length();
    }

        public gM(int n, int n2, int n3, int n4) {
        this.cfr_renamed_3 = n;
        this.cfr_renamed_2 = n2;
        this.soLuong = n3;
        this.cfr_renamed_0 = n4;
    }

    }

