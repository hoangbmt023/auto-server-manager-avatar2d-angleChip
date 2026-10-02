/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bs
extends dX {
    private static int[] mangSoNguyen;
    public int soLuong;
    public int cfr_renamed_1;
    public byte var_byte_do;
    public String chuoiGiaTri;
    public int cfr_renamed_3;
    public int cfr_renamed_4;
    private int cfr_renamed_5 = 200;
    private int cfr_renamed_2 = (short)(bn_0.var_byte_new * 11);

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[11];
        200 = 91 + 83 - 129 + 155;
        11 = 0x2A ^ 3 ^ (0xA7 ^ 0x85);
        2 = "  ".length();
        3 = "   ".length();
        1 = " ".length();
        0 = (0x1B ^ 8) & ~(0x96 ^ 0x85);
        6 = 0x19 ^ 0x1F;
        -1 = -" ".length();
        5 = 176 + 104 - 126 + 41 ^ 19 + 9 - -149 + 21;
        10 = 0x59 ^ 0x53;
        20 = 0xD2 ^ 0xC6;
    }

    static {
        bs.cfr_renamed_4();
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

        /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_0(Graphics var1_1) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, (GameCanvas.var_int_byte - this.cfr_renamed_5) / 2, (GameCanvas.var_int_char - this.cfr_renamed_2) / 2, this.cfr_renamed_5, this.cfr_renamed_2, k.mangSoNguyen[2], k.mangSoNguyen[3], 1);
        var1_1.translate((GameCanvas.var_int_byte - this.cfr_renamed_5) / 2, (GameCanvas.var_int_char - this.cfr_renamed_2) / 2);
        var2_2 = 0 + bn_0.var_byte_new;
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, String.valueOf(gt.cfr_renamed_0().var_short_do), this.cfr_renamed_5 / 2, var2_2 - bn_0.var_byte_new / 2 - 2 * bn_0.cfr_renamed_6, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "Thú đua chiến thắng", this.cfr_renamed_5 / 2, var2_2 += bn_0.var_byte_new / 2 + 2 * bn_0.cfr_renamed_6, 2);
        GameCanvas.var_ew_byte.cfr_renamed_0(var1_1, this.chuoiGiaTri, this.cfr_renamed_5 / 2, var2_2 += bn_0.var_byte_new + 6 * bn_0.cfr_renamed_6, 2);
        var2_2 += bn_0.var_byte_new << 1;
        var3_3 = 0;
        if ("   ".length() >= -" ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            if (bs.boolean_if(this.var_byte_do, gt.cfr_renamed_0().var_bU_arr_do[var3_3].cfr_renamed_12)) {
                var4_4 = ci_0.cfr_renamed_1(gt.cfr_renamed_0().var_bU_arr_do[var3_3].var_short_if);
                if (bs.boolean_do(var4_4.soLuong, -1)) {
                    var5_5 = var4_4.var_short_do / 5;
                    var1_1.drawRegion(var4_4.var_javax_microedition_lcdui_Image_do, 0, gt.var_byte_arr_arr_do[0][0] * var5_5, (int)var4_4.cfr_renamed_1, var5_5, 0, this.cfr_renamed_5 / 2, var2_2 + bn_0.var_byte_new / 2, 3);
                }
            }
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!bs.cfr_renamed_3((int)var3_3, (int)6))
        }
lbl20:
        // 1 sources

        var2_2 += bn_0.var_byte_new / 2;
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "Tiền cược: ", 10, var2_2 += bn_0.var_byte_new, 0);
        GameCanvas.var_ew_int.cfr_renamed_0(var1_1, "" + this.soLuong, this.cfr_renamed_5 - 20, var2_2 + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2, 1);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "Tiền ăn: ", 10, var2_2 += bn_0.var_byte_new, 0);
        GameCanvas.var_ew_int.cfr_renamed_0(var1_1, "" + this.cfr_renamed_3, this.cfr_renamed_5 - 20, var2_2 + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2, 1);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "Tiền thuế: ", 10, var2_2 += bn_0.var_byte_new, 0);
        GameCanvas.var_ew_int.cfr_renamed_0(var1_1, "" + this.cfr_renamed_1, this.cfr_renamed_5 - 20, var2_2 + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2, 1);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, "Tiền nhận được: ", 10, var2_2 += bn_0.var_byte_new, 0);
        GameCanvas.var_ew_int.cfr_renamed_0(var1_1, "" + this.cfr_renamed_4, this.cfr_renamed_5 - 20, var2_2 + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2, 1);
        super.cfr_renamed_0(var1_1);
    }

    public bs() {
        ((bn_0)this).cfr_renamed_4 = gt.cfr_renamed_0().var_ei_do;
    }
}

