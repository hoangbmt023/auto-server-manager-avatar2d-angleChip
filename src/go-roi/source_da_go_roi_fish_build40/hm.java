/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hm {
    public byte[] var_byte_arr_do;
    public w[] var_w_arr_do;
    public short var_short_do;
    private static int[] mangSoNguyen;
    public k_0[] var_k_0_arr_do;
    public Image var_javax_microedition_lcdui_Image_do;

        static {
        hm.cfr_renamed_1();
    }

        /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_1(Graphics var1_1, int var2_2, int var3_3, int var4_4) {
        var4_5 = this.var_w_arr_do[this.var_byte_arr_do[var4_4]];
        var5_6 = 0;
        if ("   ".length() > " ".length()) ** GOTO lbl28
        return;
lbl-1000:
        // 1 sources

        {
            block4: {
                var6_7 = var4_5.var_byte_arr_do[var5_6];
                var7_8 = this;
                var8_9 = 0;
                if ((("  ".length() ^ (242 ^ 176)) & (168 + 125 - 281 + 224 ^ 85 + 105 - 84 + 66 ^ -" ".length())) != (83 ^ 33 ^ (46 ^ 88))) ** GOTO lbl22
                return;
lbl-1000:
                // 1 sources

                {
                    if ((var7_8.var_k_0_arr_do[var8_9].cfr_renamed_2 == var6_7)) {
                        v0 = var7_8.var_k_0_arr_do[var8_9];
                        if ("  ".length() < ("   ".length() & ~"   ".length())) {
                            return;
                        }
                        break block4;
                    }
                    ++var8_9;
lbl22:
                    // 2 sources

                    ** while (!hm.cfr_renamed_1((int)var8_9, (int)var7_8.var_k_0_arr_do.length))
                }
lbl23:
                // 1 sources

                v0 = null;
            }
            var7_8 = v0;
            var1_1.drawRegion(this.var_javax_microedition_lcdui_Image_do, var7_8.var_short_do * dF.cfr_renamed_12, var7_8.cfr_renamed_0 * dF.cfr_renamed_12, var7_8.cfr_renamed_4 * dF.cfr_renamed_12, var7_8.cfr_renamed_5 * dF.cfr_renamed_12, 0, var2_2 * dF.cfr_renamed_12 + var4_5.var_short_arr_do[var5_6] * dF.cfr_renamed_12, var3_3 * dF.cfr_renamed_12 + var4_5.cfr_renamed_0[var5_6] * dF.cfr_renamed_12, 0);
            ++var5_6;
lbl28:
            // 2 sources

            ** while (!hm.cfr_renamed_1((int)var5_6, (int)var4_5.var_short_arr_do.length))
        }
lbl29:
        // 1 sources

    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0xC9 ^ 0x96 ^ (0x57 ^ 0x29)) & (74 + 58 - 89 + 104 ^ 46 + 30 - 62 + 164 ^ -" ".length());
    }
}

