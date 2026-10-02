/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from fD
 */
public class fd_0
extends bm {
    public short cfr_renamed_5;
    public int cfr_renamed_8;
    private static int[] cfr_renamed_1;

        public fd_0() {
        this.var_byte_if = (byte)cfr_renamed_1[0];
    }

        public void (Graphics graphics != null) {
        if ((this.cfr_renamed_8 < 0) && (!(this.cfr_renamed_2 * bm.var_int_if + this.cfr_renamed_5 / cfr_renamed_1[1] >= fm.fm_do().cfr_renamed_3) || (this.cfr_renamed_2 * bm.var_int_if - this.cfr_renamed_5 / cfr_renamed_1[1] > fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa))) {
            return;
        }
        int n = this.cfr_renamed_2 * bm.var_int_if;
        int n2 = this.cfr_renamed_3 * bm.var_int_if;
        switch (this.cfr_renamed_8) {
            case 0: {
                aa_0.cfr_renamed_1(graphics, cfr_renamed_1[2], n, n2, cfr_renamed_1[3]);
                return;
            }
            case -2: {
                if ((dR.var_byte_char != cfr_renamed_1[4])) {
                    int n3;
                    if ((AngelChip.duLieuNguoiChoi.var_byte_new == dd_0.var_byte_try)) {
                        n3 = cfr_renamed_1[1];
                        } else {
                        n3 = cfr_renamed_1[5];
                    }
                    dR.var_cu_0_new.cfr_renamed_1(dR.var_byte_for, n, n2, n3, cfr_renamed_1[6], graphics);
                }
                return;
            }
            case -10: 
            case -3: {
                graphics.drawImage(dR.var_javax_microedition_lcdui_Image_if, n, n2, cfr_renamed_1[7]);
                return;
            }
            case -5: {
                dR.var_cu_0_if.cfr_renamed_1(cfr_renamed_1[5], n, n2, cfr_renamed_1[5], cfr_renamed_1[6], graphics);
                if ((fg.var_short_do != cfr_renamed_1[4])) {
                    dR.var_cu_0_if.cfr_renamed_1(cfr_renamed_1[1], n, n2, cfr_renamed_1[5], cfr_renamed_1[6], graphics);
                }
                return;
            }
            case -6: {
                dR.var_cu_0_for.cfr_renamed_1(cfr_renamed_1[5], n, n2, cfr_renamed_1[5], cfr_renamed_1[6], graphics);
                if ((fc.var_short_do != cfr_renamed_1[4])) {
                    dR.var_cu_0_for.cfr_renamed_1(cfr_renamed_1[0], n, n2, cfr_renamed_1[5], cfr_renamed_1[6], graphics);
                }
                return;
            }
            case -7: {
                (graphics, n, n2, dR.var_java_util_Vector_case != null);
                return;
            }
            case -8: {
                (graphics, n, n2, dR.var_java_util_Vector_for != null);
                return;
            }
            case -9: {
                if (!(GameCanvas.var_fv_do != null)) break;
                graphics.drawImage(fh.var_javax_microedition_lcdui_Image_do, n, n2, cfr_renamed_1[6]);
                aa_0.cfr_renamed_1(graphics, cfr_renamed_1[8], n, n2 + GameCanvas.var_fv_do.var_byte_do - cfr_renamed_1[9], cfr_renamed_1[3]);
            }
        }
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[10];
        fd_0.cfr_renamed_1[0] = " ".length();
        fd_0.cfr_renamed_1[1] = "  ".length();
        fd_0.cfr_renamed_1[2] = 216 + 181 - 296 + 142;
        fd_0.cfr_renamed_1[3] = 0x48 ^ 0x69;
        fd_0.cfr_renamed_1[4] = -" ".length();
        fd_0.cfr_renamed_1[5] = (1 ^ 0x48 ^ (0xEE ^ 0x82)) & (0x4B ^ 0x74 ^ (0xAF ^ 0xB5) ^ -" ".length());
        fd_0.cfr_renamed_1[6] = "   ".length();
        fd_0.cfr_renamed_1[7] = 0x3B ^ 0x13;
        fd_0.cfr_renamed_1[8] = 0xFFFFA396 & 0x5FED;
        fd_0.cfr_renamed_1[9] = 0xDD ^ 0x9C ^ (0xEC ^ 0xA7);
    }

    public fd_0(int n, int n2, int n3, int n4) {
        this.var_byte_if = (byte)cfr_renamed_1[0];
        this.cfr_renamed_8 = n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_3 = n3;
        this.cfr_renamed_5 = (short)n4;
    }

        static {
        fd_0.cfr_renamed_0();
    }

            /*
     * Unable to fully structure code
     */
    private static void (Graphics var0, int var1_1, int var2_2, Vector var3_3 != null) {
        var4_4 = fd_0.cfr_renamed_1[5];
        if ("  ".length() != 0) ** GOTO lbl24
        return;
lbl-1000:
        // 1 sources

        {
            block4: {
                var5_5 = (fs)var3_3.elementAt(var4_4);
                if (!(var5_5.soLuong * bm.var_int_if == var1_1) || !(var5_5.var_int_if * bm.var_int_if == var2_2)) break block4;
                var6_6 = bz.gk_0_do(var5_5.cfr_renamed_2);
                if ((var6_6.var_short_if != fd_0.cfr_renamed_1[4])) {
                    aa_0.cfr_renamed_1(var0, var6_6.var_short_if, var1_1, var2_2, fd_0.cfr_renamed_1[6]);
                }
                var7_7 = fd_0.cfr_renamed_1[5];
                if ("  ".length() >= 0) ** GOTO lbl21
                return;
lbl-1000:
                // 1 sources

                {
                    var8_8 = (hs)dR.var_java_util_Vector_byte.elementAt(var7_7);
                    if ((var8_8.cfr_renamed_9 == var5_5.cfr_renamed_2) && (var8_8.cfr_renamed_10 != null)) {
                        aa_0.cfr_renamed_1(var0, var6_6.var_short_for, var1_1, var2_2, fd_0.cfr_renamed_1[6]);
                        return;
                    }
                    ++var7_7;
lbl21:
                    // 2 sources

                    ** while (!fd_0.cfr_renamed_2((int)var7_7, (int)dR.var_java_util_Vector_byte.size()))
                }
            }
            ++var4_4;
lbl24:
            // 2 sources

            ** while (!fd_0.cfr_renamed_2((int)var4_4, (int)var3_3.size()))
        }
lbl25:
        // 1 sources

    }

        }

