/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class hi
extends fl_0 {
    private final ex var_ex_do;
    private final int soLuong;
    private static final int[] mangSoNguyen;

    hi(String string, de de2, ex ex2, int n) {
        super(string, de2);
        this.var_ex_do = ex2;
        this.soLuong = n;
    }

    static {
        hi.cfr_renamed_2();
    }

        public final void cfr_renamed_1() {
        if ((this.soLuong == fo.var_int_try)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_ex_do.cfr_renamed_2);
            fo.cfr_renamed_1(this.var_ex_do.chuoiGiaTri);
            fo.cfr_renamed_1(MenuChinhAvatar.a + this.var_ex_do.var_short_if + "p");
            dg_0 dg_02 = dR.dg_0_do(this.var_ex_do.var_short_do);
            if ((dg_02.var_int_if != null)) {
                fo.cfr_renamed_1(MenuChinhAvatar.bA + GameCanvas.java_lang_String_do(dg_02.var_int_if) + MenuChinhAvatar.cb);
                if ((0x21 ^ 0x64 ^ (0xEE ^ 0xAF)) == " ".length()) {
                    return;
                }
            } else if ((dg_02.soLuong != null)) {
                fo.cfr_renamed_1(MenuChinhAvatar.bA + GameCanvas.java_lang_String_do(dg_02.soLuong) + MenuChinhAvatar.cb);
            }
            fo.cfr_renamed_1(MenuChinhAvatar.ak);
        }
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[13];
        2 = "  ".length();
        3 = "   ".length();
        0 = (98 + 143 - 140 + 48 ^ 55 + 42 - -27 + 12) & (0x26 ^ 0x12 ^ (0xA4 ^ 0x8D) ^ -" ".length());
        5 = 0x5A ^ 0x5F;
        50 = 0x41 ^ 0x73;
        7 = 0x15 ^ 0x78 ^ (0x63 ^ 9);
        30 = 0x92 ^ 0x8C;
        15 = 0x5C ^ 0x53;
        1 = " ".length();
        25 = 0x9A ^ 0x83;
        10 = 0xCF ^ 0xC5;
        100 = 0x47 ^ 0x23;
        8 = 0xA6 ^ 0xA9 ^ (0xC7 ^ 0xC0);
    }

        public final void (Graphics graphics, int n, int n2 != null) {
        Object object = dR.dg_0_do(this.var_ex_do.var_short_do);
        bz.cfr_renamed_1(graphics, ((dg_0)object).var_short_if, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
        graphics.translate(0, cg_0.cfr_renamed_9);
        graphics.setClip(0, 0, 5 * fo.soLuongKhoa, fo.soLuong);
        if ((this.soLuong == fo.var_int_try)) {
            n = 0;
            while ((n < this.var_ex_do.var_short_arr_if.length)) {
                ee_0 ee_02;
                if ((this.var_ex_do.var_short_arr_if[n] < 50)) {
                    ee_02 = dR.ee_0_if(this.var_ex_do.var_short_arr_if[n]);
                    bz.fb_0_if(this.var_ex_do.var_short_arr_if[n]).cfr_renamed_1(graphics, 7, fo.cfr_renamed_7 / 2 - this.var_ex_do.var_short_arr_if.length * 30 * dF.cfr_renamed_12 / 2 + n * 30 * dF.cfr_renamed_12 + 15 * (dF.cfr_renamed_12 - 1), (fo.soLuongKhoa << 1) + 25 * dF.cfr_renamed_12 + (dF.var_byte_new << 2) + 10 * (dF.cfr_renamed_12 - 1), 3);
                    if ("   ".length() < 0) {
                        return;
                    }
                } else if ((this.var_ex_do.var_short_arr_if[n] < 100)) {
                    ee_02 = dR.ee_0_if(this.var_ex_do.var_short_arr_if[n]);
                    object = bz.gk_0_do((int)this.var_ex_do.var_short_arr_if[n]);
                    aa_0.cfr_renamed_1(graphics, ((gk_0)object).var_short_for, fo.cfr_renamed_7 / 2 - this.var_ex_do.var_short_arr_if.length * 30 * dF.cfr_renamed_12 / 2 + n * 30 * dF.cfr_renamed_12 + 15 * (dF.cfr_renamed_12 - 1), (fo.soLuongKhoa << 1) + 25 * dF.cfr_renamed_12 + (dF.var_byte_new << 2) + 10 * (dF.cfr_renamed_12 - 1), 3);
                    if (" ".length() < 0) {
                        return;
                    }
                } else {
                    ee_02 = dR.ee_0_do(this.var_ex_do.var_short_arr_if[n]);
                    object = dR.dg_0_do(this.var_ex_do.var_short_arr_if[n]);
                    bz.cfr_renamed_1(graphics, ((dg_0)object).var_short_if, fo.cfr_renamed_7 / 2 - this.var_ex_do.var_short_arr_if.length * 30 * dF.cfr_renamed_12 / 2 + n * 30 * dF.cfr_renamed_12 + 15 * (dF.cfr_renamed_12 - 1), (fo.soLuongKhoa << 1) + 25 * dF.cfr_renamed_12 + (dF.var_byte_new << 2) + 10 * (dF.cfr_renamed_12 - 1), 3);
                }
                object = GameCanvas.var_fz_0_case;
                if (!(ee_02 != null) || (ee_02.soLuong < this.var_ex_do.var_short_arr_do[n])) {
                    object = GameCanvas.var_fz_0_if;
                }
                object.cfr_renamed_1(graphics, String.valueOf(this.var_ex_do.var_short_arr_do[n]), fo.cfr_renamed_7 / 2 - this.var_ex_do.var_short_arr_if.length * 30 * dF.cfr_renamed_12 / 2 + n * 30 * dF.cfr_renamed_12 - 1 + 15 * (dF.cfr_renamed_12 - 1), (fo.soLuongKhoa << 1) + 25 * dF.cfr_renamed_12 + (dF.var_byte_new << 2) + 8 * dF.cfr_renamed_12 + 10 * (dF.cfr_renamed_12 - 1), 2);
                if ((n != this.var_ex_do.var_short_arr_if.length - 1)) {
                    GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, "+", fo.cfr_renamed_7 / 2 - this.var_ex_do.var_short_arr_if.length * 30 * dF.cfr_renamed_12 / 2 + n * 30 * dF.cfr_renamed_12 + 15 * dF.cfr_renamed_12 + 15 * (dF.cfr_renamed_12 - 1), (fo.soLuongKhoa << 1) + 25 * dF.cfr_renamed_12 + (dF.var_byte_new << 2) + 10 * (dF.cfr_renamed_12 - 1), 2);
                }
                ++n;
                if (((0x52 ^ 0x57 ^ (0xE6 ^ 0xC3)) & (0x9F ^ 0xA7 ^ (0x17 ^ 0xF) ^ -" ".length())) <= 0) continue;
                return;
            }
        }
        graphics.setClip(0, 0, 5 * fo.soLuongKhoa, fo.cfr_renamed_4 * fo.soLuongKhoa - fo.var_int_byte);
        graphics.translate(0, -cg_0.cfr_renamed_9);
    }

        }

