/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ej
extends ea {
    private static int[] mangSoNguyen;
    private byte var_byte_do;
    private String chuoiGiaTri;

    public final void (Graphics graphics != null) {
        if (!(ey_0.cfr_renamed_0().mangSoNguyen[1] != 1) || (GameCanvas.var_et_0_do != null)) {
            return;
        }
        if (!((this.cfr_renamed_3 * aG.var_int_int >= ek_0.ek_0_do().soLuong) && (this.cfr_renamed_3 * aG.var_int_int <= ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && (this.var_int_if * aG.var_int_int >= ek_0.ek_0_do().cfr_renamed_3) && (this.var_int_if * aG.var_int_int <= ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char + 10) && !(GameCanvas.var_dL_do <= ec.cfr_renamed_0()))) {
            return;
        }
        graphics.drawImage(ef_0.var_javax_microedition_lcdui_Image_if, this.cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 3);
        if ((fw.cfr_renamed_0().var_ep_do != null)) {
            fw.cfr_renamed_0().var_ep_do.cfr_renamed_0(0, this.cfr_renamed_3 * aG.var_int_int, (this.var_int_if - 10 + this.var_byte_do / 2) * aG.var_int_int, 0, 33, graphics);
        }
        GameCanvas.var_ew_int.cfr_renamed_0(graphics, this.chuoiGiaTri, this.cfr_renamed_3 * aG.var_int_int, (this.var_int_if - 32 + this.var_byte_do / 2) * aG.var_int_int, 2);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[8];
        8 = 0x26 ^ 0x2E;
        1 = " ".length();
        0 = (0x86 ^ 0x9B ^ (3 ^ 8)) & (0x2D ^ 0x6E ^ (0x3A ^ 0x6F) ^ -" ".length());
        10 = 76 + 52 - 10 + 14 ^ 122 + 45 - 144 + 119;
        3 = "   ".length();
        2 = "  ".length();
        33 = 0xE ^ 0x2F;
        32 = 0x2D ^ 0xD;
    }

        public ej(String string, int n, int n2) {
        this.var_byte_if = (byte)8;
        this.cfr_renamed_3 = n;
        this.var_int_if = n2;
        this.chuoiGiaTri = string;
        this.var_byte_do = (byte)gc_0.int_do(8);
    }

                static {
        ej.cfr_renamed_1();
    }

    public final void void_do() {
        this.var_byte_do = (byte)(this.var_byte_do + 1);
        if ((this.var_byte_do >= 8)) {
            this.var_byte_do = (byte)0;
        }
    }

    }

