/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from dn
 */
final class dn_0
extends fl_0 {
    private short var_short_if;
    private int soLuong = 0;
    private static int[] mangSoNguyen;
    private String tenNhanVat;
    private String chuoiPhu;
    private short var_short_for;
    private int var_int_if;

    public dn_0(String string, de de2, int n, String string2, short s2, String string3, int n2, short s3) {
        super(string, de2);
        this.soLuong = n;
        this.tenNhanVat = string2;
        this.var_short_for = s2;
        this.chuoiPhu = string3;
        this.var_int_if = n2;
        this.var_short_if = s3;
    }

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (this.soLuong == fo.var_int_try)) {
            am am2;
            fo.cfr_renamed_5();
            if ((AngelChip.duLieuNguoiChoi.var_byte_do == 1)) {
                am2 = aa_0.am_do(this.var_short_for);
                if (-"  ".length() > 0) {
                    return;
                }
            } else {
                am2 = aa_0.am_do(this.var_short_if);
            }
            if ((am2.cfr_renamed_3 != -1)) {
                if ((AngelChip.duLieuNguoiChoi.var_byte_do == 1)) {
                    go_0.go_0_do();
                    go_0.cfr_renamed_1(am2);
                    if (" ".length() == 0) {
                        return;
                    }
                } else {
                    go_0.go_0_do();
                    go_0.cfr_renamed_1(am2);
                }
            }
            fo.cfr_renamed_1(this.tenNhanVat);
            if ((this.chuoiPhu != null)) {
                fo.cfr_renamed_1(this.chuoiPhu);
            }
            if ((this.var_int_if != null)) {
                fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.X) + GameCanvas.java_lang_String_do(this.var_int_if) + " Tim");
            }
        }
    }

    static {
        dn_0.cfr_renamed_2();
    }

                public final void (Graphics graphics, int n, int n2 != null) {
        am am2;
        if ((AngelChip.duLieuNguoiChoi.var_byte_do == 1)) {
            am2 = aa_0.am_do(this.var_short_for);
            if (((0x3A ^ 0x34 ^ (0xEF ^ 0xBB)) & (198 + 26 - 56 + 48 ^ 37 + 127 - 72 + 38 ^ -" ".length())) > 0) {
                return;
            }
        } else {
            am2 = aa_0.am_do(this.var_short_if);
        }
        am2.cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

            private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        0 = (8 ^ 0x1E) & ~(0x2A ^ 0x3C);
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        3 = "   ".length();
    }
}

