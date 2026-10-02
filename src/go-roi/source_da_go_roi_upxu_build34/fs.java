/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class fs {
    private int cfr_renamed_1;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private static int[] mangSoNguyen;
    int soLuong;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[7];
        200 = (0xD4 ^ 0x84) + ((0xB9 ^ 0xB1) & ~(0 ^ 8)) - (0x63 ^ 0x5A) + (18 + 3 - -88 + 68);
        870 = 0xFFFFFBE6 & 0x77F;
        871 = 0xFFFFBBFF & 0x4767;
        -1 = -" ".length();
        0 = (0xDC ^ 0x92) & ~(0 ^ 0x4E);
        3 = "   ".length();
        2 = "  ".length();
    }

    static {
        fs.cfr_renamed_0();
    }

    public fs(int n, int n2, int n3, int n4) {
        this.cfr_renamed_3 = n;
        this.cfr_renamed_4 = n2;
        this.soLuong = n3;
        this.cfr_renamed_1 = n4;
    }

                    public final void (Graphics graphics > 0) {
        int n;
        if ((GameCanvas.var_int_byte > 200)) {
            n = 870;
            if ((74 + 22 - 18 + 91 ^ 49 + 143 - 32 + 13) < (0x29 ^ 0x5C ^ (0xF9 ^ 0x88))) {
                return;
            }
        } else {
            n = 871;
        }
        Object object = ci_0.cfr_renamed_1((short)n);
        if (fs.cfr_renamed_1(((an)object).soLuong, -1)) {
            graphics.drawRegion(((an)object).var_javax_microedition_lcdui_Image_do, 0, this.cfr_renamed_1 * o.var_int_if, o.soLuong, o.var_int_if, 0, this.cfr_renamed_3, this.cfr_renamed_4, 3);
            object = GameCanvas.var_ew_new;
            if ((GameCanvas.var_int_byte <= 200)) {
                object = GameCanvas.var_ew_int;
            }
            if ((GameCanvas.cfr_renamed_16 > 0)) {
                object = GameCanvas.var_ew_try;
            }
            object.cfr_renamed_0(graphics, String.valueOf(this.soLuong), this.cfr_renamed_3, this.cfr_renamed_4 - bn_0.var_byte_new / 2, 2);
        }
    }
}

