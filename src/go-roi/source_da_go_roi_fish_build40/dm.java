/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class dm
extends fl_0 {
    private final int soLuong;
    private final int cfr_renamed_0;
    private final cg var_cg_do;
    private static final int[] mangSoNguyen;

                dm(String string, de de2, cg cg2, int n, int n2) {
        super(string, de2);
        this.var_cg_do = cg2;
        this.soLuong = n;
        this.cfr_renamed_0 = n2;
    }

        public final void (Graphics graphics, int n, int n2 != null) {
        aa_0.am_do(this.var_cg_do.var_short_do).cfr_renamed_0(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
        v_0.cfr_renamed_1(n + 3, n2 + fo.soLuongKhoa - 3 * dF.cfr_renamed_12, fo.soLuongKhoa - 5, 2 * dF.cfr_renamed_12, 1, graphics);
        v_0.cfr_renamed_1(n + 3, n2 + fo.soLuongKhoa - 3 * dF.cfr_renamed_12, fo.soLuongKhoa - 5 - this.var_cg_do.var_byte_do * (fo.soLuongKhoa - 5) / 100, 2 * dF.cfr_renamed_12, 11907085, graphics);
    }

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (this.soLuong == fo.var_int_try)) {
            am am2 = aa_0.am_do(this.var_cg_do.var_short_do);
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_cg_do.var_short_do);
            fo.cfr_renamed_1(MenuChinhAvatar.R + (100 - this.var_cg_do.var_byte_do) + "%");
            String string = "";
            if ((am2.var_byte_if == 20)) {
                string = MenuChinhAvatar.cu;
                if (((0xBB ^ 0x83) & ~(0x18 ^ 0x20)) != 0) {
                    return;
                }
            } else if ((am2.var_byte_if == 10)) {
                string = MenuChinhAvatar.chuoiGiaTri;
            }
            fo.cfr_renamed_1(string + aa_0.java_lang_String_do(am2));
            if ((this.var_cg_do.chuoiGiaTri != null) && !(this.var_cg_do.chuoiGiaTri.equals(""))) {
                fo.cfr_renamed_1(this.var_cg_do.chuoiGiaTri);
            }
            if ((this.cfr_renamed_0 == 0)) {
                fo.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_new[2] + ": " + aa_0.int_do(am2));
                return;
            }
            if ((am2.cfr_renamed_2 != -2)) {
                byte by2;
                if ((am2.cfr_renamed_2 != null)) {
                    by2 = ((cX)aa_0.am_do((short)am2.cfr_renamed_2)).cfr_renamed_2;
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                } else {
                    by2 = ((cX)am2).cfr_renamed_2;
                }
                fo.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_new[2] + ": " + by2);
            }
        }
    }

        static {
        dm.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        3 = "   ".length();
        5 = 0x18 ^ 0x1D;
        1 = " ".length();
        100 = 177 + 130 - 148 + 79 ^ 101 + 9 - -14 + 14;
        11907085 = 0xFFFFFADF & 0xB5B52D;
        20 = 0x99 ^ 0x8D;
        10 = 14 + 118 - 54 + 63 ^ 125 + 35 - 126 + 101;
        -2 = -"  ".length();
    }

    }

