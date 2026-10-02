/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eB
 */
public final class eb_0
extends eh_0 {
    private static int[] mangSoNguyen;
    private eq_0 var_eq_0_do;
    public static int soLuong;
    private byte cfr_renamed_12 = (byte)0;

        public final void (eq_0 eq_02 <= 0) {
        this.var_eq_0_for = new eq_0(eq_02.var_int_if - 10 + gc_0.int_do(20), eq_02.soLuong - 10 + gc_0.int_do(20));
    }

            public final void cfr_renamed_2() {
        this.var_eq_0_for = new eq_0();
        ((bk_0)this).cfr_renamed_11 = this.var_eq_0_for.var_int_if = bF.var_eq_0_for.var_int_if + gc_0.int_do(bF.var_int_if - 1) * 24;
        ((aG)this).cfr_renamed_3 = this.var_eq_0_for.var_int_if;
        this.var_int_new = this.var_eq_0_for.soLuong = bF.var_eq_0_for.soLuong + 12 + gc_0.int_do(2) * 24;
        this.var_int_if = this.var_eq_0_for.soLuong;
        String cfr_ignored_0 = "777777777777777777777: " + ((aG)this).cfr_renamed_3 + "   " + this.var_int_if;
        }

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[20];
        5 = 0x8F ^ 0x8A;
        0 = (0x8A ^ 0x93) & ~(0x21 ^ 0x38);
        1 = " ".length();
        7 = 0x8C ^ 0x8B;
        -10 = -(0x64 ^ 0x79 ^ (0x75 ^ 0x62));
        8 = 0x4E ^ 0x46;
        6 = 0xA ^ 0x47 ^ (0x2D ^ 0x66);
        2 = "  ".length();
        3 = "   ".length();
        -3 = -"   ".length();
        17 = 0x94 ^ 0x85;
        100 = 106 + 17 - -9 + 74 ^ 12 + 55 - -19 + 84;
        4 = 0x16 ^ 0x12;
        16 = 0x37 ^ 0x27;
        24 = 1 ^ 0x19;
        12 = 3 ^ 0x73 ^ (0x6E ^ 0x12);
        30 = 48 + 59 - 28 + 48 ^ (0x7E ^ 0x1F);
        10 = 0x9F ^ 0xC7 ^ (0 ^ 0x52);
        20 = 0x57 ^ 0x43;
        -1 = -" ".length();
    }

    public final void void_do() {
        if (!(this.var_eq_0_do.cfr_renamed_3 != 6) || (this.var_eq_0_do.var_int_if == -10)) {
            int n;
            if ((this.cfr_renamed_20 == 2) && eb_0.cfr_renamed_1(((bk_0)this).cfr_renamed_3)) {
                n = 3;
                if (((0xB6 ^ 0x8E) & ~(0x60 ^ 0x58)) < -" ".length()) {
                    return;
                }
            } else {
                n = -3;
            }
            this.var_eq_0_do.var_int_if = ((aG)this).cfr_renamed_3 + n;
            this.var_eq_0_do.soLuong = this.var_int_if + 2;
        }
        this.var_eq_0_do.cfr_renamed_3 += 1;
        if (!(this.var_eq_0_do.cfr_renamed_3 <= 17 * (3 - this.cfr_renamed_20)) || (this.cfr_renamed_12 > 0)) {
            this.var_eq_0_do.cfr_renamed_3 = 0;
        }
        fc_0 fc_02 = ak_0.fc_0_do((int)this.cfr_renamed_18);
        this.cfr_renamed_11 = fc_02.var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte];
        if ((gc_0.int_do(100) == 2) && (this.cfr_renamed_12 <= 0) && eb_0.cfr_renamed_1(((bk_0)this).cfr_renamed_4)) {
            this.cfr_renamed_12 = (byte)8;
        }
        if ((this.cfr_renamed_12 > 0)) {
            this.cfr_renamed_11 = (byte)(2 - this.cfr_renamed_12 / 3 + 2);
            ((ha)this).cfr_renamed_10 = this.cfr_renamed_12 = (byte)(this.cfr_renamed_12 - 1);
            if (eb_0.cfr_renamed_15(((ha)this).cfr_renamed_10, 4)) {
                ((ha)this).cfr_renamed_10 = (byte)(4 - this.cfr_renamed_12 % 4);
            }
            ((ha)this).cfr_renamed_10 = (byte)(((ha)this).cfr_renamed_10 + 5);
            ((ha)this).cfr_renamed_10 = -((ha)this).cfr_renamed_10;
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            ((ha)this).cfr_renamed_10 = (byte)0;
        }
        super.void_do();
    }

        public final fa fa_do() {
        fa fa2 = (fa)bF.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(gc_0.int_do(bF.var_java_util_Vector_arr_do[this.var_byte_do].size()));
        if (!eb_0.cfr_renamed_1(ef_0.boolean_if(((aG)fa2).cfr_renamed_3, fa2.var_int_if) ? 1 : 0) || (fa2.var_int_new != 0)) {
            return null;
        }
        return fa2;
    }

            public final boolean boolean_if(int n, int n2) {
        if (eb_0.cfr_renamed_5(((bk_0)this).cfr_renamed_4, -1)) {
            this.var_int_try = 0;
            this.var_int_case = 0;
            return 1;
        }
        if (eb_0.cfr_renamed_3(((bk_0)this).cfr_renamed_4) && eb_0.cfr_renamed_3(((bk_0)this).cfr_renamed_4, 1)) {
            this.var_int_try = 0;
            this.var_int_case = 0;
            return 1;
        }
        ((bk_0)this).cfr_renamed_4 = (byte)1;
        int n3 = ((bk_0)this).cfr_renamed_11;
        int n4 = this.var_int_new;
        if (!(ef_0.boolean_if(n3 + n, n4 + n2))) {
            if ((n != 0)) {
                if ((n > 0)) {
                    this.var_int_try = ((bk_0)this).cfr_renamed_18;
                    if ("   ".length() != "   ".length()) {
                        return ((0xE ^ 0x43) & ~(8 ^ 0x45)) != 0;
                    }
                } else {
                    this.var_int_try = -((bk_0)this).cfr_renamed_18;
                }
            }
            if ((n2 != 0)) {
                if ((n2 > 0)) {
                    this.var_int_case = ((bk_0)this).cfr_renamed_18;
                    if ((0xE0 ^ 0x92 ^ (0xB2 ^ 0xC4)) <= 0) {
                        return ((25 + 76 - -19 + 23 ^ 142 + 57 - 101 + 75) & (182 + 51 - 224 + 181 ^ 99 + 38 - 10 + 29 ^ -" ".length())) != 0;
                    }
                } else {
                    this.var_int_case = -((bk_0)this).cfr_renamed_18;
                }
            }
            return 0;
        }
        this.var_int_try = 0;
        this.var_int_case = 0;
        return 1;
    }

    static {
        eb_0.cfr_renamed_12();
        soLuong = 5;
    }

    public final void (Graphics graphics <= 0) {
        super.cfr_renamed_0(graphics);
        if ((this.var_eq_0_do.cfr_renamed_3 < 16)) {
            graphics.setColor(gr.mangSoNguyen[ef_0.var_byte_if]);
            graphics.drawRoundRect((this.var_eq_0_do.var_int_if - this.var_eq_0_do.cfr_renamed_3 / 2) * aG.var_int_int, (this.var_eq_0_do.soLuong - this.var_eq_0_do.cfr_renamed_3 / 4) * aG.var_int_int, this.var_eq_0_do.cfr_renamed_3 * aG.var_int_int, this.var_eq_0_do.cfr_renamed_3 / 2 * aG.var_int_int, this.var_eq_0_do.cfr_renamed_3 * aG.var_int_int, this.var_eq_0_do.cfr_renamed_3 * aG.var_int_int);
        }
    }

                public final void cfr_renamed_1() {
        this.var_eq_0_for = new eq_0(bF.var_eq_0_for.var_int_if + 30 + gc_0.int_do(bF.var_int_if - 2) * 24, bF.var_eq_0_for.soLuong + 12 + gc_0.int_do(2) * 24);
    }

    public eb_0(int n, byte by2) {
        super(n, by2);
        this.cfr_renamed_10 = 0;
        this.var_byte_do = (byte)1;
        this.var_byte_if = (byte)7;
        this.var_eq_0_do = new eq_0(-10, 0, gc_0.int_do(8));
    }
}

