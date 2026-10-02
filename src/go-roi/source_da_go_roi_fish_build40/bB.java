/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bB
extends fd_0 {
    public boolean dangChayAuto = 0;
    public short var_short_do;
    public short cfr_renamed_0;
    private static int[] mangSoNguyen;
    public byte var_byte_do;

                    public bB() {
    }

        public bB(int n, int n2, int n3, int n4, short s2) {
        this.cfr_renamed_8 = (byte)n;
        this.cfr_renamed_2 = n2;
        this.cfr_renamed_3 = n3;
        this.var_short_do = (short)n4;
        this.cfr_renamed_0 = s2;
    }

    public final void void_do() {
    }

    public final void (Graphics object != 0) {
        gs_0 gs_02;
        if ((this.dangChayAuto)) {
            gs_02 = fh.gs_0_do(this.cfr_renamed_0);
            if ("   ".length() > "   ".length()) {
                return;
            }
        } else {
            gs_02 = aa_0.gs_0_do((int)this.cfr_renamed_0);
        }
        if (!(this.dangChayAuto) && (fh.var_int_char != 68) && (fh.var_int_char != 69) && (fh.var_int_char != 70) && (fh.var_int_char != 110)) {
            k_0 k_02 = aa_0.var_k_0_arr_do[gs_02.cfr_renamed_5];
            if (!bB.cfr_renamed_2((this.cfr_renamed_2 + gs_02.cfr_renamed_2 + k_02.cfr_renamed_4) * bm.var_int_if, fm.fm_do().cfr_renamed_3) || !bB.cfr_renamed_1((this.cfr_renamed_2 + gs_02.cfr_renamed_2 - k_02.cfr_renamed_4) * bm.var_int_if, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) || !bB.cfr_renamed_2((this.cfr_renamed_3 + k_02.cfr_renamed_5) * bm.var_int_if, fm.fm_do().cfr_renamed_2) || bB.cfr_renamed_0((this.cfr_renamed_3 + gs_02.cfr_renamed_3 - k_02.cfr_renamed_5) * bm.var_int_if, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case)) {
                return;
            }
            byte by2 = this.var_byte_do;
            int n = (this.cfr_renamed_3 + gs_02.cfr_renamed_3) * bm.var_int_if;
            int n2 = (this.cfr_renamed_2 + gs_02.cfr_renamed_2) * bm.var_int_if;
            gs_02 = object;
            object = k_02;
            gs_02.drawRegion(aa_0.hr_do((int)object.cfr_renamed_3).var_javax_microedition_lcdui_Image_do, object.var_short_do * dF.cfr_renamed_12, object.cfr_renamed_0 * dF.cfr_renamed_12, object.cfr_renamed_4 * dF.cfr_renamed_12, object.cfr_renamed_5 * dF.cfr_renamed_12, by2, n2, n, 0);
            return;
        }
        int n = (this.cfr_renamed_3 + gs_02.cfr_renamed_3) * bm.var_int_if;
        int n3 = (this.cfr_renamed_2 + gs_02.cfr_renamed_2) * bm.var_int_if;
        short s2 = gs_02.cfr_renamed_5;
        gs_02 = object;
        object = this;
        d_0 d_02 = aa_0.cfr_renamed_0(s2);
        if (!(n3 + d_02.var_short_do >= fm.fm_do().cfr_renamed_3) || !(n3 <= fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) || !(n + d_02.cfr_renamed_0 >= fm.fm_do().cfr_renamed_2) || (n > fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case)) {
            return;
        }
        if ((d_02.soLuong != -1)) {
            gs_02.drawRegion(d_02.var_javax_microedition_lcdui_Image_do, 0, 0, d_02.var_short_do, d_02.cfr_renamed_0, object.var_byte_do, n3, n, 0);
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        0 = (0x28 ^ 0xD) & ~(0x8C ^ 0xA9);
        68 = 0x37 ^ 0x11 ^ (0xDD ^ 0xBF);
        69 = 0xCA ^ 0x8F;
        70 = 127 + 103 - 90 + 77 ^ 39 + 151 - 111 + 80;
        110 = 0xE ^ 0x2D ^ (0x2E ^ 0x63);
        -1 = -" ".length();
    }

        static {
        bB.cfr_renamed_0();
    }
}

