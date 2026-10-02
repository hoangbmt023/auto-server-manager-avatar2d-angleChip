/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cw
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;
    private final int cfr_renamed_1;
    private final ef duLieuNguoiChoi;

    public final void (Graphics graphics, int n, int n2 != null) {
        ci_0.q_0_do(this.duLieuNguoiChoi.var_short_do).cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
        k.cfr_renamed_0(n + 3, n2 + em_0.var_int_try - 3 * bn_0.cfr_renamed_6, em_0.var_int_try - 5, 2 * bn_0.cfr_renamed_6, 1, graphics);
        k.cfr_renamed_0(n + 3, n2 + em_0.var_int_try - 3 * bn_0.cfr_renamed_6, em_0.var_int_try - 5 - this.duLieuNguoiChoi.var_byte_do * (em_0.var_int_try - 5) / 100, 2 * bn_0.cfr_renamed_6, 11907085, graphics);
    }

    cw(String string, cp cp2, ef ef2, int n, int n2) {
        super(string, cp2);
        this.duLieuNguoiChoi = ef2;
        this.soLuong = n;
        this.cfr_renamed_1 = n2;
    }

                public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int ? 1 : 0 != null) && (this.soLuong == em_0.var_int_if)) {
            q_0 q_02 = ci_0.q_0_do(this.duLieuNguoiChoi.var_short_do);
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.duLieuNguoiChoi.var_short_do);
            em_0.cfr_renamed_0(MenuChinhAvatar.I + (100 - this.duLieuNguoiChoi.var_byte_do) + "%");
            String string = "";
            if ((q_02.var_byte_if == 20)) {
                string = MenuChinhAvatar.dk;
                if ("  ".length() == (72 + 55 - 7 + 18 ^ 92 + 70 - 109 + 89)) {
                    return;
                }
            } else if ((q_02.var_byte_if == 10)) {
                string = MenuChinhAvatar.cfr_renamed_33;
            }
            em_0.cfr_renamed_0(string + ci_0.java_lang_String_do(q_02));
            if ((this.duLieuNguoiChoi.chuoiGiaTri != null) && !(this.duLieuNguoiChoi.chuoiGiaTri.equals(""))) {
                em_0.cfr_renamed_0(this.duLieuNguoiChoi.chuoiGiaTri);
            }
            if ((this.cfr_renamed_1 == 0)) {
                em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_for[2] + ": " + ci_0.int_do(q_02));
                return;
            }
            if ((q_02.cfr_renamed_3 != -2)) {
                byte by2;
                if ((q_02.cfr_renamed_3 >= 0)) {
                    by2 = ((ci)ci_0.q_0_do((short)q_02.cfr_renamed_3)).cfr_renamed_4;
                    if (((0x28 ^ 0x64) & ~(0x8B ^ 0xC7)) != 0) {
                        return;
                    }
                } else {
                    by2 = ((ci)q_02).cfr_renamed_4;
                }
                em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_for[2] + ": " + by2);
            }
        }
    }

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        3 = "   ".length();
        5 = 0x25 ^ 0x20;
        1 = " ".length();
        100 = 0xA3 ^ 0x8B ^ (0xC6 ^ 0x8A);
        11907085 = 0xFFFFB58D & 0xB5FA7F;
        20 = 0x5E ^ 0x3B ^ (0x66 ^ 0x17);
        10 = 0x38 ^ 0x32;
        -2 = -"  ".length();
    }

        static {
        cw.cfr_renamed_3();
    }
}

