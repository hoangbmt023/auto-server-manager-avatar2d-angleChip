/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class ct
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;
    private final fc_0 var_fc_0_do;

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        8 = 0x27 ^ 0x2F;
        2 = "  ".length();
        3 = "   ".length();
        0 = (0xFF ^ 0x88 ^ (0xC6 ^ 0xB7)) & (121 + 101 - 134 + 41 ^ 130 + 25 - 118 + 98 ^ -" ".length());
        1 = " ".length();
    }

        public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if - ak_0.var_dY_arr_do.length) && (em_0.var_boolean_int)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.var_fc_0_do.var_byte_do);
            em_0.cfr_renamed_0(this.var_fc_0_do.tenNhanVat + " (" + this.var_fc_0_do.soLuong + MenuChinhAvatar.bL + ")");
            em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_char + GameCanvas.hienThongBaoPopup(this.var_fc_0_do.mangSoNguyen[0], this.var_fc_0_do.mangSoNguyen[1], 0));
            em_0.cfr_renamed_0(this.var_fc_0_do.chuoiGiaTri);
            em_0.cfr_renamed_0(fe_0.java_lang_String_do());
        }
    }

    static {
        ct.cfr_renamed_3();
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        ci_0.cfr_renamed_0(graphics, this.var_fc_0_do.var_short_for, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

    ct(String string, int n, fc_0 fc_02, int n2) {
        super(string, 8, n);
        this.var_fc_0_do = fc_02;
        this.soLuong = n2;
    }
}

