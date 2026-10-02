/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class cm
extends fd_0 {
    private byte var_byte_do;
    private String chuoiGiaTri;
    private static int[] mangSoNguyen;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[8];
        8 = 0x14 ^ 0x1C;
        1 = " ".length();
        0 = (2 + 60 - -9 + 74 ^ 61 + 23 - -17 + 27) & (30 + 151 - 39 + 20 ^ 10 + 39 - 10 + 140 ^ -" ".length());
        10 = 81 + 42 - 89 + 99 ^ 73 + 56 - 104 + 118;
        3 = "   ".length();
        2 = "  ".length();
        33 = 0x52 ^ 0x73;
        32 = 0x4F ^ 0x6E ^ " ".length();
    }

    public final void (Graphics graphics != null) {
        if (!(gA.cfr_renamed_1().mangSoNguyen[1] == 1) || (GameCanvas.var_fv_do != null)) {
            return;
        }
        if (!((this.cfr_renamed_2 * bm.var_int_if >= fm.fm_do().cfr_renamed_3) && (this.cfr_renamed_2 * bm.var_int_if <= fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && (this.cfr_renamed_3 * bm.var_int_if >= fm.fm_do().cfr_renamed_2) && (this.cfr_renamed_3 * bm.var_int_if <= fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case + 10) && !(GameCanvas.var_en_do == ff_0.cfr_renamed_1()))) {
            return;
        }
        graphics.drawImage(fh.var_javax_microedition_lcdui_Image_do, this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if, 3);
        if ((gO.cfr_renamed_1().var_cu_0_do != null)) {
            gO.cfr_renamed_1().var_cu_0_do.cfr_renamed_1(0, this.cfr_renamed_2 * bm.var_int_if, (this.cfr_renamed_3 - 10 + this.var_byte_do / 2) * bm.var_int_if, 0, 33, graphics);
        }
        GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, this.chuoiGiaTri, this.cfr_renamed_2 * bm.var_int_if, (this.cfr_renamed_3 - 32 + this.var_byte_do / 2) * bm.var_int_if, 2);
    }

    public final void void_do() {
        this.var_byte_do = (byte)(this.var_byte_do + 1);
        if ((this.var_byte_do >= 8)) {
            this.var_byte_do = (byte)0;
        }
    }

                static {
        cm.cfr_renamed_0();
    }

    public cm(String string, int n, int n2) {
        this.var_byte_if = (byte)8;
        this.cfr_renamed_2 = n;
        this.cfr_renamed_3 = n2;
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)hg.int_new(8);
    }

    }

