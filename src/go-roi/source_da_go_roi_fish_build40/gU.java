/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class gU
extends fl_0 {
    private static int[] mangSoNguyen;
    private bN var_bN_do;
    private int soLuong;
    private int cfr_renamed_0;

    static {
        gU.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        aa_0.cfr_renamed_1(graphics, this.var_bN_do.var_short_do, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

        public gU(String string, ag_0 ag_02, int n, bN bN2, int n2) {
        super(string, ag_02);
        this.soLuong = n;
        this.var_bN_do = bN2;
        this.cfr_renamed_0 = n2;
    }

            public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (fo.var_int_try - this.cfr_renamed_0 == this.soLuong)) {
            String string;
            fo.cfr_renamed_5();
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.bI) + this.var_bN_do.chuoiGiaTri);
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.X)).append(this.var_bN_do.soLuong);
            if ((this.var_bN_do.var_byte_do == 0)) {
                string = MenuChinhAvatar.da;
                if (((0xC ^ 0x7B ^ (0x9F ^ 0xA1)) & (0xD1 ^ 0xBA ^ (0x2D ^ 0xF) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.cq;
            }
            fo.cfr_renamed_1(stringBuffer.append(string).toString());
        }
    }
}

