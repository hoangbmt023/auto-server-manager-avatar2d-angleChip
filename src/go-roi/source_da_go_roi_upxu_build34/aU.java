/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class aU
extends ea {
    public byte var_byte_do;
    public boolean dangChayAuto = 0;
    public short var_short_do;
    public short cfr_renamed_1;
    private static int[] mangSoNguyen;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        0 = (15 + 97 - 65 + 84 ^ 25 + 24 - -12 + 129) & (1 + 29 - -37 + 65 ^ 134 + 93 - 156 + 114 ^ -" ".length());
        68 = 0xB8 ^ 0x9D ^ (0xF7 ^ 0x96);
        69 = 0x39 ^ 0x7C;
        70 = 0xB8 ^ 0xC5 ^ (0x9F ^ 0xA4);
        110 = 119 + 87 - 122 + 136 ^ 154 + 160 - 287 + 151;
        -1 = -" ".length();
    }

    public final void (Graphics object == 0) {
        fi_0 fi_02;
        if ((this.dangChayAuto)) {
            fi_02 = ef_0.fi_0_do(this.cfr_renamed_1);
            if ("  ".length() <= 0) {
                return;
            }
        } else {
            fi_02 = ci_0.fi_0_do((int)this.cfr_renamed_1);
        }
        if (!(this.dangChayAuto) && (ef_0.soLuong != 68) && (ef_0.soLuong != 69) && (ef_0.soLuong != 70) && (ef_0.soLuong != 110)) {
            bH bH2 = ci_0.var_bH_arr_do[fi_02.cfr_renamed_4];
            if (!aU.cfr_renamed_4((this.cfr_renamed_3 + fi_02.cfr_renamed_1 + bH2.cfr_renamed_5) * aG.var_int_int, ek_0.ek_0_do().soLuong) || !aU.cfr_renamed_3((this.cfr_renamed_3 + fi_02.cfr_renamed_1 - bH2.cfr_renamed_5) * aG.var_int_int, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) || !aU.cfr_renamed_4((this.var_int_if + bH2.cfr_renamed_3) * aG.var_int_int, ek_0.ek_0_do().cfr_renamed_3) || aU.cfr_renamed_0((this.var_int_if + fi_02.var_short_do - bH2.cfr_renamed_3) * aG.var_int_int, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char)) {
                return;
            }
            byte by2 = this.var_byte_do;
            int n = (this.var_int_if + fi_02.var_short_do) * aG.var_int_int;
            int n2 = (this.cfr_renamed_3 + fi_02.cfr_renamed_1) * aG.var_int_int;
            fi_02 = object;
            object = bH2;
            fi_02.drawRegion(ci_0.gy_0_do((int)object.cfr_renamed_1).var_javax_microedition_lcdui_Image_do, object.cfr_renamed_4 * bn_0.cfr_renamed_6, object.cfr_renamed_2 * bn_0.cfr_renamed_6, object.cfr_renamed_5 * bn_0.cfr_renamed_6, object.cfr_renamed_3 * bn_0.cfr_renamed_6, by2, n2, n, 0);
            return;
        }
        int n = (this.var_int_if + fi_02.var_short_do) * aG.var_int_int;
        int n3 = (this.cfr_renamed_3 + fi_02.cfr_renamed_1) * aG.var_int_int;
        short s2 = fi_02.cfr_renamed_4;
        fi_02 = object;
        object = this;
        an an2 = ci_0.cfr_renamed_1(s2);
        if (!(n3 + an2.cfr_renamed_1 >= ek_0.ek_0_do().soLuong) || !(n3 <= ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) || !(n + an2.var_short_do >= ek_0.ek_0_do().cfr_renamed_3) || (n > ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char)) {
            return;
        }
        if ((an2.soLuong != -1)) {
            fi_02.drawRegion(an2.var_javax_microedition_lcdui_Image_do, 0, 0, an2.cfr_renamed_1, an2.var_short_do, object.var_byte_do, n3, n, 0);
        }
    }

    static {
        aU.cfr_renamed_1();
    }

    public final void void_do() {
    }

    public aU(int n, int n2, int n3, int n4, short s2) {
        this.cfr_renamed_12 = (byte)n;
        this.cfr_renamed_3 = n2;
        this.var_int_if = n3;
        this.var_short_do = (short)n4;
        this.cfr_renamed_1 = s2;
    }

                    public aU() {
    }

    }

