/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class hk
extends fl_0 {
    private static int[] cfr_renamed_1;

        private static void cfr_renamed_2() {
        cfr_renamed_1 = new int[6];
        hk.cfr_renamed_1[0] = "  ".length();
        hk.cfr_renamed_1[1] = 143 + 102 - 59 + 32 ^ 136 + 41 - 52 + 71;
        hk.cfr_renamed_1[2] = "   ".length();
        hk.cfr_renamed_1[3] = 0x1B ^ 0x1C ^ "  ".length();
        hk.cfr_renamed_1[4] = -(0xFFFFFBFF & 0x55A4) & (0xFFFFDFB3 & Short.MAX_VALUE);
        hk.cfr_renamed_1[5] = 0x7C ^ 0xF ^ (0x78 ^ 0x37);
    }

    public final void (Graphics graphics, int n, int n2 > 0) {
        int n3;
        Object object = bz.ex_do(dR.var_short_do);
        dg_0 dg_02 = dR.dg_0_do(((ex)object).var_short_do);
        bz.cfr_renamed_1(graphics, dg_02.var_short_if, GameCanvas.var_cg_0_do.cfr_renamed_13 / cfr_renamed_1[0], fo.soLuong / cfr_renamed_1[0] - cfr_renamed_1[1], cfr_renamed_1[2]);
        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, ((ex)object).chuoiGiaTri, GameCanvas.var_cg_0_do.cfr_renamed_13 / cfr_renamed_1[0], fo.soLuong / cfr_renamed_1[0] - cfr_renamed_1[1] + cfr_renamed_1[3] + bz.d_0_do((short)dg_02.var_short_if).cfr_renamed_0 / cfr_renamed_1[0] + dF.cfr_renamed_7 + cfr_renamed_1[0], cfr_renamed_1[0]);
        object = "";
        int n4 = dR.soLuongKhoa / cfr_renamed_1[4];
        fz_0 fz_02 = GameCanvas.var_fz_0_if;
        if ((n4 > 0)) {
            object = String.valueOf(n4) + ":";
        }
        if (!(n3 = (dR.soLuongKhoa - n4 * cfr_renamed_1[4]) / cfr_renamed_1[5] <= 0) || (n4 > 0)) {
            object = String.valueOf(object) + n3 + ":";
        }
        n4 = dR.soLuongKhoa - n4 * cfr_renamed_1[4] - n3 * cfr_renamed_1[5];
        object = String.valueOf(object) + n4;
        if ((dR.soLuongKhoa == 0)) {
            object = MenuChinhAvatar.var_java_lang_String_short;
            fz_02 = GameCanvas.var_fz_0_case;
        }
        fz_02.cfr_renamed_1(graphics, (String)object, GameCanvas.var_cg_0_do.cfr_renamed_13 / cfr_renamed_1[0], fo.soLuong / cfr_renamed_1[0] - cfr_renamed_1[1] + cfr_renamed_1[3] + bz.d_0_do((short)dg_02.var_short_if).cfr_renamed_0 / cfr_renamed_1[0], cfr_renamed_1[0]);
    }

        hk(String string, dF dF2) {
        super(string, cfr_renamed_1[0], dF2);
    }

        static {
        hk.cfr_renamed_2();
    }
}

