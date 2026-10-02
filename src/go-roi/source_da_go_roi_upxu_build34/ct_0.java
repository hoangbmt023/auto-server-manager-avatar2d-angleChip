/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cT
 */
final class ct_0
extends ei {
    private static int[] mangSoNguyen;
    private final byte cfr_renamed_1;
    private final q_0 var_q_0_do;

    static {
        ct_0.cfr_renamed_3();
    }

    ct_0(String string, cp cp2, q_0 q_02, byte by2) {
        super(string, cp2);
        this.var_q_0_do = q_02;
        this.cfr_renamed_1 = by2;
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        this.var_q_0_do.cfr_renamed_1(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0xB5 ^ 0x9E ^ (0x3F ^ 0x55)) & (0x60 ^ 0x23 ^ "  ".length() ^ -" ".length());
        1 = " ".length();
    }

    public final void cfr_renamed_0() {
        if ((this.cfr_renamed_1 == em_0.var_int_if)) {
            fe_0.cfr_renamed_0(this.var_q_0_do);
            em_0.cfr_renamed_4();
            String string = "";
            em_0.cfr_renamed_0(String.valueOf(string) + ci_0.java_lang_String_do(this.var_q_0_do));
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.var_java_lang_String_char) + GameCanvas.hienThongBaoPopup(this.var_q_0_do.mangSoNguyen[0], this.var_q_0_do.mangSoNguyen[1], 0));
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.cJ) + ci_0.int_do(this.var_q_0_do));
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[0]) + fe_0.var_dd_0_if.var_short_class);
        }
    }

    }

