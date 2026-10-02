/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from A
 */
public final class a_0
extends ez {
    public int soLuong;
    public int cfr_renamed_0;
    public int cfr_renamed_2;
    public String chuoiGiaTri;
    private static int[] mangSoNguyen;
    public int cfr_renamed_3;
    private int cfr_renamed_4 = 200;
    private int cfr_renamed_5 = (short)(dF.var_byte_try * 11);
    public byte var_byte_do;

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_1(Graphics var1_1) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, (GameCanvas.soLuongKhoa - this.cfr_renamed_4) / 2, (GameCanvas.var_int_case - this.cfr_renamed_5) / 2, this.cfr_renamed_4, this.cfr_renamed_5, v_0.var_int_arr_for[2], v_0.var_int_arr_for[3], 1);
        var1_1.translate((GameCanvas.soLuongKhoa - this.cfr_renamed_4) / 2, (GameCanvas.var_int_case - this.cfr_renamed_5) / 2);
        var2_2 = 0 + dF.var_byte_try;
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, String.valueOf(eu_0.cfr_renamed_1().var_short_do), this.cfr_renamed_4 / 2, var2_2 - dF.var_byte_try / 2 - 2 * dF.cfr_renamed_12, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "Thú đua chiến thắng", this.cfr_renamed_4 / 2, var2_2 += dF.var_byte_try / 2 + 2 * dF.cfr_renamed_12, 2);
        GameCanvas.var_fz_0_new.cfr_renamed_1(var1_1, this.chuoiGiaTri, this.cfr_renamed_4 / 2, var2_2 += dF.var_byte_try + 6 * dF.cfr_renamed_12, 2);
        var2_2 += dF.var_byte_try << 1;
        var3_3 = 0;
        if ("   ".length() <= "   ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            if (a_0.boolean_if(this.var_byte_do, eu_0.cfr_renamed_1().var_eb_arr_do[var3_3].cfr_renamed_9)) {
                var4_4 = aa_0.cfr_renamed_0(eu_0.cfr_renamed_1().var_eb_arr_do[var3_3].var_short_if);
                if (a_0.boolean_do(var4_4.soLuong, -1)) {
                    var5_5 = var4_4.cfr_renamed_0 / 5;
                    var1_1.drawRegion(var4_4.var_javax_microedition_lcdui_Image_do, 0, eu_0.var_byte_arr_arr_do[0][0] * var5_5, (int)var4_4.var_short_do, var5_5, 0, this.cfr_renamed_4 / 2, var2_2 + dF.var_byte_try / 2, 3);
                }
            }
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!a_0.cfr_renamed_2((int)var3_3, (int)6))
        }
lbl20:
        // 1 sources

        var2_2 += dF.var_byte_try / 2;
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "Tiền cược: ", 10, var2_2 += dF.var_byte_try, 0);
        GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, "" + this.cfr_renamed_2, this.cfr_renamed_4 - 20, var2_2 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2, 1);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "Tiền ăn: ", 10, var2_2 += dF.var_byte_try, 0);
        GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, "" + this.soLuong, this.cfr_renamed_4 - 20, var2_2 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2, 1);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "Tiền thuế: ", 10, var2_2 += dF.var_byte_try, 0);
        GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, "" + this.cfr_renamed_0, this.cfr_renamed_4 - 20, var2_2 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2, 1);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "Tiền nhận được: ", 10, var2_2 += dF.var_byte_try, 0);
        GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, "" + this.cfr_renamed_3, this.cfr_renamed_4 - 20, var2_2 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2, 1);
        super.cfr_renamed_1(var1_1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public a_0() {
        this.var_fl_0_try = eu_0.cfr_renamed_1().var_fl_0_do;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[11];
        200 = 76 + 52 - 31 + 103;
        11 = 0x1A ^ 0x11;
        2 = "  ".length();
        3 = "   ".length();
        1 = " ".length();
        0 = (0xE1 ^ 0xBA) & ~(0xD5 ^ 0x8E);
        6 = 1 ^ 7;
        -1 = -" ".length();
        5 = 131 + 9 - 61 + 58 ^ 0 + 78 - 62 + 124;
        10 = 48 + 60 - -23 + 34 ^ 57 + 25 - -13 + 80;
        20 = 0x40 ^ 0x54;
    }

    static {
        a_0.cfr_renamed_0();
    }
}

