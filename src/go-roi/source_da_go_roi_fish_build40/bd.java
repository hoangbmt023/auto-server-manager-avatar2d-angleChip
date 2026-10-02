/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

final class bd
extends fl_0 {
    private static final int[] mangSoNguyen;
    private int soLuong;
    private short var_short_if;
    private am var_am_do;
    private int var_int_if;

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        -1 = -" ".length();
        0 = (54 + 128 - 62 + 19 ^ 178 + 114 - 170 + 75) & (0x15 ^ 0x11 ^ (0x18 ^ 0x52) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        2 = "  ".length();
    }

    static {
        bd.cfr_renamed_2();
    }

            public final void (Graphics graphics, int n, int n2 != 0) {
        am am2 = this.var_am_do;
        if ((this.var_am_do.cfr_renamed_3 == -1)) {
            am2 = aa_0.am_do(this.var_short_if);
        }
        if ((am2.cfr_renamed_3 != -1)) {
            am2.cfr_renamed_0(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
        }
    }

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (this.var_int_if == fo.var_int_try)) {
            am am2 = this.var_am_do;
            if ((this.var_am_do.cfr_renamed_3 == -1)) {
                am2 = aa_0.am_do(this.var_short_if);
            }
            if ((am2.cfr_renamed_3 != -1)) {
                short s2;
                go_0.cfr_renamed_1(am2);
                fo.cfr_renamed_5();
                StringBuffer stringBuffer = new StringBuffer().append("id ");
                if ((this.var_am_do.cfr_renamed_3 != -1)) {
                    s2 = this.var_am_do.cfr_renamed_3;
                    if ("  ".length() <= 0) {
                        return;
                    }
                } else {
                    s2 = this.var_short_if;
                }
                fo.cfr_renamed_1(stringBuffer.append(s2).append(": ").append(am2.chuoiGiaTri).toString());
                if ((this.soLuong == -1)) {
                    fo.cfr_renamed_1(GameCanvas.cfr_renamed_1(am2.mangSoNguyen[0], am2.mangSoNguyen[1], 0));
                }
                if ((am2.cfr_renamed_2 == -1)) {
                    fo.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_new[0] + ((cX)am2).cfr_renamed_2);
                }
                fo.cfr_renamed_1(MenuChinhAvatar.i + AngelChip.duLieuNguoiChoi.chuoiPhu);
                if ((go_0.var_boolean_int)) {
                    fo.cfr_renamed_1(MenuChinhAvatar.c + AngelChip.duLieuNguoiChoi.mangSoNguyen[3] + " " + MenuChinhAvatar.java_lang_String_if());
                }
            }
        }
    }

    public bd(String string, dL dL2, am am2, short s2, int n, int n2) {
        super(string, dL2);
        this.var_am_do = am2;
        this.var_short_if = s2;
        this.var_int_if = n;
        this.soLuong = n2;
    }

    }

