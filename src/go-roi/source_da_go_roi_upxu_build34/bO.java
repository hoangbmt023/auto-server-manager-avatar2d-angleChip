/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class bO
extends bt_0 {
    public int soLuong;
    public int cfr_renamed_1;
    private static bO var_bO_do;
    public Vector var_java_util_Vector_do;
    public int cfr_renamed_3;
    public int cfr_renamed_4 = 0;
    private static int[] mangSoNguyen;
    public int cfr_renamed_5;
    public String chuoiGiaTri = "";

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public bO() {
        this.var_ei_new = new ei(MenuChinhAvatar.c, 0);
    }

        private static void cfr_renamed_4() {
        mangSoNguyen = new int[6];
        0 = (0x34 ^ 0x16) & ~(0x97 ^ 0xB5);
        5 = 0x19 ^ 0x1C;
        2 = "  ".length();
        1 = " ".length();
        3 = "   ".length();
        15 = 75 + 95 - 56 + 14 ^ 36 + 54 - 73 + 126;
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.cfr_renamed_3, this.cfr_renamed_4, this.cfr_renamed_1, this.cfr_renamed_5, 0);
        var2_2 = this.cfr_renamed_4 + k.var_byte_do + (5 + bn_0.cfr_renamed_16 - bn_0.var_byte_new / 2);
        var3_3 = 0;
        if ("  ".length() > 0) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (String)this.var_java_util_Vector_do.elementAt(var3_3);
            if (bO.boolean_if((int)var4_4.substring(0, 1).equals("0"))) {
                GameCanvas.var_ew_int.cfr_renamed_0(var1_1, var4_4.substring(1), this.cfr_renamed_3 + this.cfr_renamed_1 / 2, var2_2 + 3 + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2, 2);
                } else {
                GameCanvas.var_ew_try.cfr_renamed_0(var1_1, var4_4, this.cfr_renamed_3 + 15, var2_2 + 3, 0);
            }
            var2_2 += bn_0.var_byte_new;
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!bO.boolean_do((int)var3_3, (int)this.var_java_util_Vector_do.size()))
        }
lbl20:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

    static {
        bO.cfr_renamed_4();
    }

    public final void cfr_renamed_1() {
        if ((this.var_java_util_Vector_do != null) && bO.boolean_do(this.var_java_util_Vector_do.size())) {
            GameCanvas.var_bt_0_do = this;
        }
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

        public static bO cfr_renamed_0() {
        if ((var_bO_do == null)) {
            var_bO_do = new bO();
        }
        return var_bO_do;
    }

    public final void void_for() {
    }

    public final void void_if(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_8();
                var_bO_do = null;
            }
        }
    }
}

