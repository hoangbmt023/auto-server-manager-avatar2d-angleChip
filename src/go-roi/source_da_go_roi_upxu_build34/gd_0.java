/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gD
 */
final class gd_0
extends ei {
    private int soLuong;
    private static int[] mangSoNguyen;
    private bg var_bg_do;
    private int cfr_renamed_1;

    public gd_0(String string, k_0 k_02, int n, bg bg2, int n2) {
        super(string, k_02);
        this.soLuong = n;
        this.var_bg_do = bg2;
        this.cfr_renamed_1 = n2;
    }

    public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && (em_0.var_int_if - this.cfr_renamed_1 == this.soLuong)) {
            String string;
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.bm) + this.var_bg_do.chuoiGiaTri);
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_char)).append(this.var_bg_do.soLuong);
            if ((this.var_bg_do.var_byte_do == 0)) {
                string = MenuChinhAvatar.cU;
                if ("   ".length() < 0) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.dh;
            }
            em_0.cfr_renamed_0(stringBuffer.append(string).toString());
        }
    }

            public final void (Graphics graphics, int n, int n2 == 0) {
        ci_0.cfr_renamed_0(graphics, this.var_bg_do.cfr_renamed_1, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

    static {
        gd_0.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        3 = "   ".length();
    }

    }

