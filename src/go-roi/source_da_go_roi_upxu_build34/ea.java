/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public class ea
extends aG {
    public short cfr_renamed_2;
    public int cfr_renamed_12;
    private static int[] cfr_renamed_0;

            private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[10];
        ea.cfr_renamed_0[0] = " ".length();
        ea.cfr_renamed_0[1] = "  ".length();
        ea.cfr_renamed_0[2] = 210 + 172 - 315 + 176;
        ea.cfr_renamed_0[3] = 0x5F ^ 0x7E;
        ea.cfr_renamed_0[4] = -" ".length();
        ea.cfr_renamed_0[5] = (0x9F ^ 0x90) & ~(0xBF ^ 0xB0);
        ea.cfr_renamed_0[6] = "   ".length();
        ea.cfr_renamed_0[7] = 0x4D ^ 0x65;
        ea.cfr_renamed_0[8] = -(0xFFFFF9BA & 0x5657) & (0xFFFFDBF7 & 0x779D);
        ea.cfr_renamed_0[9] = 0x2B ^ 0x21;
    }

    public ea() {
        this.var_byte_if = (byte)cfr_renamed_0[0];
    }

        public void (Graphics graphics != null) {
        if ((this.cfr_renamed_12 < 0) && (!(this.cfr_renamed_3 * aG.var_int_int + this.cfr_renamed_2 / cfr_renamed_0[1] >= ek_0.ek_0_do().soLuong) || (this.cfr_renamed_3 * aG.var_int_int - this.cfr_renamed_2 / cfr_renamed_0[1] > ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte))) {
            return;
        }
        int n = this.cfr_renamed_3 * aG.var_int_int;
        int n2 = this.var_int_if * aG.var_int_int;
        switch (this.cfr_renamed_12) {
            case 0: {
                ci_0.cfr_renamed_0(graphics, cfr_renamed_0[2], n, n2, cfr_renamed_0[3]);
                return;
            }
            case -2: {
                if ((bF.var_byte_for != cfr_renamed_0[4])) {
                    int n3;
                    if (ea.cfr_renamed_4(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3, bk_0.var_byte_case)) {
                        n3 = cfr_renamed_0[1];
                        if (((0xBE ^ 0xBB) & ~(0x2B ^ 0x2E)) != 0) {
                            return;
                        }
                    } else {
                        n3 = cfr_renamed_0[5];
                    }
                    bF.var_ep_new.cfr_renamed_0(bF.var_byte_char, n, n2, n3, cfr_renamed_0[6], graphics);
                }
                return;
            }
            case -10: 
            case -3: {
                graphics.drawImage(bF.var_javax_microedition_lcdui_Image_for, n, n2, cfr_renamed_0[7]);
                return;
            }
            case -5: {
                bF.var_ep_int.cfr_renamed_0(cfr_renamed_0[5], n, n2, cfr_renamed_0[5], cfr_renamed_0[6], graphics);
                if ((ee_0.var_short_do != cfr_renamed_0[4])) {
                    bF.var_ep_int.cfr_renamed_0(cfr_renamed_0[1], n, n2, cfr_renamed_0[5], cfr_renamed_0[6], graphics);
                }
                return;
            }
            case -6: {
                bF.var_ep_try.cfr_renamed_0(cfr_renamed_0[5], n, n2, cfr_renamed_0[5], cfr_renamed_0[6], graphics);
                if ((ea_0.var_short_do != cfr_renamed_0[4])) {
                    bF.var_ep_try.cfr_renamed_0(cfr_renamed_0[0], n, n2, cfr_renamed_0[5], cfr_renamed_0[6], graphics);
                }
                return;
            }
            case -7: {
                (graphics, n, n2, bF.var_java_util_Vector_byte != null);
                return;
            }
            case -8: {
                (graphics, n, n2, bF.var_java_util_Vector_new != null);
                return;
            }
            case -9: {
                if (!(GameCanvas.var_et_0_do != null)) break;
                graphics.drawImage(ef_0.var_javax_microedition_lcdui_Image_if, n, n2, cfr_renamed_0[6]);
                ci_0.cfr_renamed_0(graphics, cfr_renamed_0[8], n, n2 + GameCanvas.var_et_0_do.var_byte_do - cfr_renamed_0[9], cfr_renamed_0[3]);
            }
        }
    }

        public ea(int n, int n2, int n3, int n4) {
        this.var_byte_if = (byte)cfr_renamed_0[0];
        this.cfr_renamed_12 = n;
        this.cfr_renamed_3 = n2;
        this.var_int_if = n3;
        this.cfr_renamed_2 = (short)n4;
    }

                /*
     * Unable to fully structure code
     */
    private static void (Graphics var0, int var1_1, int var2_2, Vector var3_3 != null) {
        var4_4 = ea.cfr_renamed_0[5];
        if (" ".length() <= " ".length()) ** GOTO lbl24
        return;
lbl-1000:
        // 1 sources

        {
            block4: {
                var5_5 = (eq_0)var3_3.elementAt(var4_4);
                if (!(var5_5.var_int_if * aG.var_int_int == var1_1) || !(var5_5.soLuong * aG.var_int_int == var2_2)) break block4;
                var6_6 = ak_0.fc_0_do(var5_5.cfr_renamed_3);
                if ((var6_6.var_short_if != ea.cfr_renamed_0[4])) {
                    ci_0.cfr_renamed_0(var0, var6_6.var_short_if, var1_1, var2_2, ea.cfr_renamed_0[6]);
                }
                var7_7 = ea.cfr_renamed_0[5];
                if (-"   ".length() < 0) ** GOTO lbl21
                return;
lbl-1000:
                // 1 sources

                {
                    var8_8 = (ha)bF.var_java_util_Vector_if.elementAt(var7_7);
                    if ((var8_8.cfr_renamed_18 == var5_5.cfr_renamed_3) && (var8_8.cfr_renamed_19 != null)) {
                        ci_0.cfr_renamed_0(var0, var6_6.cfr_renamed_4, var1_1, var2_2, ea.cfr_renamed_0[6]);
                        return;
                    }
                    ++var7_7;
lbl21:
                    // 2 sources

                    ** while (!ea.cfr_renamed_0((int)var7_7, (int)bF.var_java_util_Vector_if.size()))
                }
            }
            ++var4_4;
lbl24:
            // 2 sources

            ** while (!ea.cfr_renamed_0((int)var4_4, (int)var3_3.size()))
        }
lbl25:
        // 1 sources

    }

    static {
        ea.cfr_renamed_1();
    }
}

