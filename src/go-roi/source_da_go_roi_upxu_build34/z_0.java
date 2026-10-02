/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from z
 */
final class z_0
extends ei {
    private short var_short_if;
    private int soLuong;
    private static final int[] mangSoNguyen;
    private q_0 var_q_0_do;
    private int var_int_if;

    public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && (this.var_int_if == em_0.var_int_if)) {
            q_0 q_02 = this.var_q_0_do;
            if ((this.var_q_0_do.var_short_do == -1)) {
                q_02 = ci_0.q_0_do(this.var_short_if);
            }
            if ((q_02.var_short_do != -1)) {
                short s2;
                fe_0.cfr_renamed_0(q_02);
                em_0.cfr_renamed_4();
                StringBuffer stringBuffer = new StringBuffer().append("id ");
                if ((this.var_q_0_do.var_short_do != -1)) {
                    s2 = this.var_q_0_do.var_short_do;
                    if (((0x56 ^ 0x4A) & ~(0x4E ^ 0x52)) != 0) {
                        return;
                    }
                } else {
                    s2 = this.var_short_if;
                }
                em_0.cfr_renamed_0(stringBuffer.append(s2).append(": ").append(q_02.chuoiGiaTri).toString());
                if ((this.soLuong == -1)) {
                    em_0.cfr_renamed_0(GameCanvas.hienThongBaoPopup(q_02.mangSoNguyen[0], q_02.mangSoNguyen[1], 0));
                }
                if ((q_02.cfr_renamed_3 == -1)) {
                    em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_for[0] + ((ci)q_02).cfr_renamed_4);
                }
                em_0.cfr_renamed_0(MenuChinhAvatar.aF + AngelChip.duLieuNguoiChoi.var_java_lang_String_int);
                if ((fe_0.coKichHoat)) {
                    em_0.cfr_renamed_0(MenuChinhAvatar.ay + AngelChip.duLieuNguoiChoi.mangSoNguyen[3] + " " + MenuChinhAvatar.java_lang_String_for());
                }
            }
        }
    }

    static {
        z_0.cfr_renamed_3();
    }

    public z_0(String string, bw_0 bw_02, q_0 q_02, short s2, int n, int n2) {
        super(string, bw_02);
        this.var_q_0_do = q_02;
        this.var_short_if = s2;
        this.var_int_if = n;
        this.soLuong = n2;
    }

                public final void (Graphics graphics, int n, int n2 != 0) {
        q_0 q_02 = this.var_q_0_do;
        if ((this.var_q_0_do.var_short_do == -1)) {
            q_02 = ci_0.q_0_do(this.var_short_if);
        }
        if ((q_02.var_short_do != -1)) {
            q_02.cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
        }
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        -1 = -" ".length();
        0 = (0xAC ^ 0xBF) & ~(0x88 ^ 0x9B);
        1 = " ".length();
        3 = "   ".length();
        2 = "  ".length();
    }
}

