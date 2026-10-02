/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class aj
extends ei {
    private final q_0 var_q_0_do;
    private static int[] mangSoNguyen;
    private final byte cfr_renamed_1;

        static {
        aj.cfr_renamed_3();
    }

    aj(String string, cp cp2, q_0 q_02, byte by2) {
        super(string, cp2);
        this.var_q_0_do = q_02;
        this.cfr_renamed_1 = by2;
    }

    public final void cfr_renamed_0() {
        if ((this.cfr_renamed_1 == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            fe_0.cfr_renamed_0(this.var_q_0_do);
            String string = "";
            if ((this.var_q_0_do.var_byte_if == 20)) {
                string = MenuChinhAvatar.dk;
                if (" ".length() < 0) {
                    return;
                }
            } else if ((this.var_q_0_do.var_byte_if == 10)) {
                string = MenuChinhAvatar.cfr_renamed_33;
                if (((0x15 ^ 0x5F ^ (0x12 ^ 0x57)) & (17 + 77 - 37 + 91 ^ 4 + 29 - -97 + 25 ^ -" ".length())) != 0) {
                    return;
                }
            } else if ((this.var_q_0_do.var_byte_if == 40)) {
                string = MenuChinhAvatar.bv;
                if ((0xE ^ 0xA) <= 0) {
                    return;
                }
            } else if ((this.var_q_0_do.var_byte_if == 50)) {
                string = MenuChinhAvatar.ci;
            }
            em_0.cfr_renamed_0(String.valueOf(string) + ci_0.java_lang_String_do(this.var_q_0_do));
            em_0.cfr_renamed_0(GameCanvas.hienThongBaoPopup(this.var_q_0_do.mangSoNguyen[0], this.var_q_0_do.mangSoNguyen[1], 1));
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.cJ) + ci_0.int_do(this.var_q_0_do));
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[0]) + fe_0.var_dd_0_if.var_short_class);
        }
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[8];
        2 = "  ".length();
        3 = "   ".length();
        20 = 0x4A ^ 0x5E;
        10 = 0x6A ^ 0x60;
        40 = 0x14 ^ 0x6E ^ (5 ^ 0x57);
        50 = 0x88 ^ 0xBA;
        0 = (0x49 ^ 0x61) & ~(0x7E ^ 0x56);
        1 = " ".length();
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        this.var_q_0_do.cfr_renamed_1(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }
}

