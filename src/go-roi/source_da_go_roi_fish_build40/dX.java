/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class dX
extends dj_0 {
    private static dX var_dX_do;
    public int soLuong;
    public Vector var_java_util_Vector_do;
    public int cfr_renamed_0;
    public int cfr_renamed_2;
    public int cfr_renamed_3 = 0;
    private static int[] mangSoNguyen;
    public String chuoiGiaTri = "";
    public int cfr_renamed_4;

    public dX() {
        ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.ct, 0);
    }

    static {
        dX.cfr_renamed_2();
    }

    public static dX cfr_renamed_1() {
        if ((var_dX_do > 0)) {
            var_dX_do = new dX();
        }
        return var_dX_do;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != 0) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.cfr_renamed_0, this.cfr_renamed_3, this.cfr_renamed_2, this.cfr_renamed_4, 0);
        var2_2 = this.cfr_renamed_3 + v_0.var_byte_do + (5 + dF.cfr_renamed_15 - dF.var_byte_try / 2);
        var3_3 = 0;
        if (" ".length() == " ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (String)this.var_java_util_Vector_do.elementAt(var3_3);
            if (dX.cfr_renamed_1((int)var4_4.substring(0, 1).equals("0"))) {
                GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, var4_4.substring(1), this.cfr_renamed_0 + this.cfr_renamed_2 / 2, var2_2 + 3 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2, 2);
                if (((17 ^ 20) & ~(35 ^ 38)) != 0) {
                    return;
                }
            } else {
                GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, var4_4, this.cfr_renamed_0 + 15, var2_2 + 3, 0);
            }
            var2_2 += dF.var_byte_try;
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!dX.boolean_do((int)var3_3, (int)this.var_java_util_Vector_do.size()))
        }
lbl20:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

        private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

        public final void cfr_renamed_7() {
    }

            public final void void_for(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_7();
                var_dX_do = null;
            }
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[6];
        0 = "   ".length() & ("   ".length() ^ -" ".length());
        5 = 0xA4 ^ 0xA1;
        2 = "  ".length();
        1 = " ".length();
        3 = "   ".length();
        15 = 68 + 15 - 44 + 122 ^ 170 + 32 - 68 + 40;
    }

    public final void cfr_renamed_0() {
        if ((this.var_java_util_Vector_do != 0) && (this.var_java_util_Vector_do.size() > 0)) {
            GameCanvas.var_dj_0_do = this;
        }
    }
}

