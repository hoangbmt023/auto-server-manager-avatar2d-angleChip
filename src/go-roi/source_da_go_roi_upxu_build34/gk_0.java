/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gk
 */
final class gk_0
extends ei {
    private static int[] cfr_renamed_0;

    public final void (Graphics graphics, int n, int n2 <= 0) {
        int n3;
        Object object = ak_0.dv_0_do(bF.var_short_do);
        ff ff2 = bF.ff_do(((dv_0)object).var_short_do);
        ak_0.cfr_renamed_0(graphics, ff2.var_short_if, GameCanvas.var_ex_do.var_int_if / cfr_renamed_0[0], em_0.cfr_renamed_5 / cfr_renamed_0[0] - cfr_renamed_0[1], cfr_renamed_0[2]);
        GameCanvas.var_ew_case.cfr_renamed_0(graphics, ((dv_0)object).chuoiGiaTri, GameCanvas.var_ex_do.var_int_if / cfr_renamed_0[0], em_0.cfr_renamed_5 / cfr_renamed_0[0] - cfr_renamed_0[1] + cfr_renamed_0[3] + ak_0.an_do((short)ff2.var_short_if).var_short_do / cfr_renamed_0[0] + bn_0.cfr_renamed_8 + cfr_renamed_0[0], cfr_renamed_0[0]);
        object = "";
        int n4 = bF.var_int_char / cfr_renamed_0[4];
        ew ew2 = GameCanvas.var_ew_if;
        if ((n4 > 0)) {
            object = String.valueOf(n4) + ":";
        }
        if (!(n3 = (bF.var_int_char - n4 * cfr_renamed_0[4]) / cfr_renamed_0[5] <= 0) || (n4 > 0)) {
            object = String.valueOf(object) + n3 + ":";
        }
        n4 = bF.var_int_char - n4 * cfr_renamed_0[4] - n3 * cfr_renamed_0[5];
        object = String.valueOf(object) + n4;
        if ((bF.var_int_char == 0)) {
            object = MenuChinhAvatar.cE;
            ew2 = GameCanvas.var_ew_case;
        }
        ew2.cfr_renamed_0(graphics, (String)object, GameCanvas.var_ex_do.var_int_if / cfr_renamed_0[0], em_0.cfr_renamed_5 / cfr_renamed_0[0] - cfr_renamed_0[1] + cfr_renamed_0[3] + ak_0.an_do((short)ff2.var_short_if).var_short_do / cfr_renamed_0[0], cfr_renamed_0[0]);
    }

        gk_0(String string, bn_0 bn_02) {
        super(string, cfr_renamed_0[0], bn_02);
    }

        private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[6];
        gk_0.cfr_renamed_0[0] = "  ".length();
        gk_0.cfr_renamed_0[1] = 17 + 86 - 85 + 146 ^ 39 + 115 - 95 + 127;
        gk_0.cfr_renamed_0[2] = "   ".length();
        gk_0.cfr_renamed_0[3] = 0xC ^ 9;
        gk_0.cfr_renamed_0[4] = -(0xFFFFD96B & 0x76BC) & (0xFFFFFE7F & 0x5FB7);
        gk_0.cfr_renamed_0[5] = 0x4F ^ 0x38 ^ (0xC0 ^ 0x8B);
    }

        static {
        gk_0.cfr_renamed_3();
    }
}

