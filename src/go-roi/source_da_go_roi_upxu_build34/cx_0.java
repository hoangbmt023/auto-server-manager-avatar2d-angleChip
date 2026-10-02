/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from cx
 */
final class cx_0
extends ei {
    private String tenNhanVat;
    private short var_short_if;
    private short var_short_for;
    private String chuoiPhu;
    private int soLuong;
    private static int[] mangSoNguyen;
    private int var_int_if = 0;

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        0 = (0xD0 ^ 0x9A ^ (0xAC ^ 0xC6)) & (53 + 77 - -22 + 16 ^ 78 + 82 - 154 + 130 ^ -" ".length());
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        3 = "   ".length();
    }

            public final void (Graphics graphics, int n, int n2 != null) {
        q_0 q_02;
        if ((AngelChip.duLieuNguoiChoi.var_byte_void == 1)) {
            q_02 = ci_0.q_0_do(this.var_short_for);
            if (-" ".length() >= "   ".length()) {
                return;
            }
        } else {
            q_02 = ci_0.q_0_do(this.var_short_if);
        }
        q_02.cfr_renamed_1(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }

    public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && (this.var_int_if == em_0.var_int_if)) {
            q_0 q_02;
            em_0.cfr_renamed_4();
            if ((AngelChip.duLieuNguoiChoi.var_byte_void == 1)) {
                q_02 = ci_0.q_0_do(this.var_short_for);
                } else {
                q_02 = ci_0.q_0_do(this.var_short_if);
            }
            if ((q_02.var_short_do != -1)) {
                if ((AngelChip.duLieuNguoiChoi.var_byte_void == 1)) {
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(q_02);
                    if (((0xC ^ 7 ^ (0xED ^ 0xA7)) & (0xFE ^ 0x9A ^ (0x2F ^ 0xA) ^ -" ".length())) != ((0x20 ^ 0x72 ^ (0x9C ^ 0x85)) & (0x14 ^ 0x62 ^ (7 ^ 0x3A) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0(q_02);
                }
            }
            em_0.cfr_renamed_0(this.chuoiPhu);
            if ((this.tenNhanVat != null)) {
                em_0.cfr_renamed_0(this.tenNhanVat);
            }
            if ((this.soLuong != null)) {
                em_0.cfr_renamed_0(String.valueOf(MenuChinhAvatar.var_java_lang_String_char) + GameCanvas.java_lang_String_do(this.soLuong) + " Tim");
            }
        }
    }

            public cx_0(String string, cp cp2, int n, String string2, short s2, String string3, int n2, short s3) {
        super(string, cp2);
        this.var_int_if = n;
        this.chuoiPhu = string2;
        this.var_short_for = s2;
        this.tenNhanVat = string3;
        this.soLuong = n2;
        this.var_short_if = s3;
    }

    static {
        cx_0.cfr_renamed_3();
    }
}

