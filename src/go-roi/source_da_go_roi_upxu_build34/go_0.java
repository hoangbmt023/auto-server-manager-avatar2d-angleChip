/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Renamed from go
 */
public final class go_0 {
    private static int[] mangSoNguyen;
    public byte[] var_byte_arr_do;
    public short var_short_do;
    public l_0[] var_l_0_arr_do;
    public bH[] var_bH_arr_do;
    public Image var_javax_microedition_lcdui_Image_do;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0xF2 ^ 0x80 ^ (0xD3 ^ 0xC2)) & (98 + 160 - 52 + 10 ^ 26 + 119 - 73 + 115 ^ -" ".length());
    }

        static {
        go_0.cfr_renamed_0();
    }

        /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_0(Graphics var1_1, int var2_2, int var3_3, int var4_4) {
        var4_5 = this.var_l_0_arr_do[this.var_byte_arr_do[var4_4]];
        var5_6 = 0;
        if ((40 ^ 76 ^ (26 ^ 122)) != -" ".length()) ** GOTO lbl28
        return;
lbl-1000:
        // 1 sources

        {
            block4: {
                var6_7 = var4_5.var_byte_arr_do[var5_6];
                var7_8 = this;
                var8_9 = 0;
                if (-(146 ^ 140 ^ (21 ^ 14)) < 0) ** GOTO lbl22
                return;
lbl-1000:
                // 1 sources

                {
                    if ((var7_8.var_bH_arr_do[var8_9].var_short_do == var6_7)) {
                        v0 = var7_8.var_bH_arr_do[var8_9];
                        if (-"  ".length() > 0) {
                            return;
                        }
                        break block4;
                    }
                    ++var8_9;
lbl22:
                    // 2 sources

                    ** while (!go_0.cfr_renamed_0((int)var8_9, (int)var7_8.var_bH_arr_do.length))
                }
lbl23:
                // 1 sources

                v0 = null;
            }
            var7_8 = v0;
            var1_1.drawRegion(this.var_javax_microedition_lcdui_Image_do, var7_8.cfr_renamed_4 * bn_0.cfr_renamed_6, var7_8.cfr_renamed_2 * bn_0.cfr_renamed_6, var7_8.cfr_renamed_5 * bn_0.cfr_renamed_6, var7_8.cfr_renamed_3 * bn_0.cfr_renamed_6, 0, var2_2 * bn_0.cfr_renamed_6 + var4_5.var_short_arr_do[var5_6] * bn_0.cfr_renamed_6, var3_3 * bn_0.cfr_renamed_6 + var4_5.cfr_renamed_1[var5_6] * bn_0.cfr_renamed_6, 0);
            ++var5_6;
lbl28:
            // 2 sources

            ** while (!go_0.cfr_renamed_0((int)var5_6, (int)var4_5.var_short_arr_do.length))
        }
lbl29:
        // 1 sources

    }
}

