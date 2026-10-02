/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ha
extends bk_0 {
    public int this;
    public int cfr_renamed_16;
    public boolean coKichHoat;
    public byte cfr_renamed_11;
    public boolean[] var_boolean_arr_do;
    public int cfr_renamed_6;
    public byte cfr_renamed_18;
    public int cfr_renamed_17;
    public int cfr_renamed_13;
    public byte cfr_renamed_10;
    public boolean cfr_renamed_4;
    public int cfr_renamed_30;
    public eq_0 var_eq_0_for;
    public boolean cfr_renamed_5;
    public int cfr_renamed_22;
    public int cfr_renamed_19;
    public int cfr_renamed_20 = 0;
    private static final int[] mangSoNguyen;

        private void (Graphics graphics, int n, int n2, int n3 == 0) {
        int n4 = ak_0.fc_0_do((int)this.cfr_renamed_18).soLuong * 60 - this.this;
        int n5 = this.cfr_renamed_20 * 5;
        if (ha.cfr_renamed_5(this.this, ak_0.fc_0_do((int)this.cfr_renamed_18).soLuong * 60)) {
            k.cfr_renamed_0(n2 - (n5 + 22) * aG.var_int_int / 2, n3 - (18 + this.cfr_renamed_10) * aG.var_int_int - n, (n5 + 22) * aG.var_int_int, 4 * aG.var_int_int, 1, graphics);
            k.cfr_renamed_0(n2 - (n5 + 20) * aG.var_int_int / 2, n3 - (17 + this.cfr_renamed_10) * aG.var_int_int - n, this.cfr_renamed_6 * (n5 + 20) / 100 * aG.var_int_int, 2 * aG.var_int_int, 65280, graphics);
            switch (this.cfr_renamed_18) {
                case 50: 
                case 56: {
                    n4 = 7;
                    if (" ".length() >= 0) break;
                    return;
                }
                case 53: 
                case 59: {
                    n4 = 15;
                    if ("  ".length() != 0) break;
                    return;
                }
                case 52: {
                    n4 = 20;
                    if (-" ".length() < ((43 + 193 - 200 + 191 ^ 70 + 83 - 116 + 145) & (0x80 ^ 0xA0 ^ (0x62 ^ 0x17) ^ -" ".length()))) break;
                    return;
                }
                case 55: 
                case 60: 
                case 61: {
                    n4 = 10;
                    if ((0xBF ^ 0xA0 ^ (0x94 ^ 0x8F)) >= ((44 + 36 - 22 + 171 ^ 178 + 99 - 110 + 28) & (140 + 29 - 160 + 138 ^ 163 + 167 - 189 + 40 ^ -" ".length()))) break;
                    return;
                }
                case 51: 
                case 54: 
                case 58: {
                    n4 = 30;
                    if (-(0xBD ^ 0x85 ^ (4 ^ 0x38)) <= 0) break;
                    return;
                }
                default: {
                    n4 = -1;
                }
            }
            if ((n4 != -1)) {
                String string;
                if ((n4 = n4 * 24 * 60 - this.this > 1440)) {
                    string = "-" + (n4 / 1440 + 1) + " ngay";
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                } else {
                    string = "-" + n4 / 60 + ":" + (n4 - n4 / 60 * 60);
                }
                GameCanvas.var_ew_int.cfr_renamed_0(graphics, string, n2, n3 - (13 + this.cfr_renamed_10) * aG.var_int_int - n, 2);
            }
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            k.cfr_renamed_0(n2 - (n5 + 22) * aG.var_int_int / 2, n3 - (18 + this.cfr_renamed_10) * aG.var_int_int - n, (n5 + 22) * aG.var_int_int, 4 * aG.var_int_int, 1, graphics);
            k.cfr_renamed_0(n2 - (n5 + 20) * aG.var_int_int / 2, n3 - (17 + this.cfr_renamed_10) * aG.var_int_int - n, this.cfr_renamed_6 * (n5 + 20) / 100 * aG.var_int_int, 2 * aG.var_int_int, 65280, graphics);
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, n4 / 60 + ":" + (n4 - n4 / 60 * 60), n2, n3 - (13 + this.cfr_renamed_10) * aG.var_int_int - n, 2);
        }
        if ((this.cfr_renamed_1 ? 1 : 0 == 7)) {
            n = 10;
        }
        if ((this.var_boolean_arr_do[0] != 0)) {
            bF.var_ep_do.cfr_renamed_0(0, n2 - 10 * aG.var_int_int, n3 - (22 + this.cfr_renamed_10) * aG.var_int_int - n, 0, 3, graphics);
        }
        if ((this.var_boolean_arr_do[1] != 0)) {
            bF.var_ep_do.cfr_renamed_0(1, n2 + 10 * aG.var_int_int, n3 - (22 + this.cfr_renamed_10) * aG.var_int_int - n, 0, 3, graphics);
        }
    }

        public void cfr_renamed_2() {
    }

        public void cfr_renamed_8() {
        this.cfr_renamed_13 = gc_0.cfr_renamed_0(((bk_0)this).cfr_renamed_3, this.cfr_renamed_1 ? 1 : 0, this.var_eq_0_for.var_int_if, this.var_eq_0_for.soLuong);
        this.cfr_renamed_16 = gc_0.int_do(this.var_eq_0_for.var_int_if - ((bk_0)this).cfr_renamed_3, -(this.var_eq_0_for.soLuong - this.cfr_renamed_1));
    }

        public void void_do() {
        if ((this.cfr_renamed_4)) {
            if ((GameCanvas.int_if() - this.cfr_renamed_17 > 10)) {
                this.cfr_renamed_4 = 0;
                return;
            }
        } else {
            this.var_int_byte += 1;
            if ((this.var_int_byte >= 12)) {
                this.var_int_byte = 0;
            }
            this.cfr_renamed_15();
            if (ha.cfr_renamed_2(((bk_0)this).cfr_renamed_4, 1)) {
                if ((this.var_int_byte == 0)) {
                    ((bk_0)this).cfr_renamed_4 = (byte)gc_0.int_do(5 + (this.cfr_renamed_18 - 50) * 5);
                    if (ha.cfr_renamed_2(((bk_0)this).cfr_renamed_4, 2)) {
                        ((bk_0)this).cfr_renamed_4 = (byte)0;
                        } else {
                        ((bk_0)this).cfr_renamed_3 = (byte)gc_0.int_if(0, bk_0.var_byte_case);
                    }
                }
                if ((this.cfr_renamed_30 > 0)) {
                    this.cfr_renamed_30 -= 1;
                    return;
                }
                this.cfr_renamed_3();
                if (ha.cfr_renamed_5(this.var_eq_0_for.var_int_if, ((bk_0)this).cfr_renamed_3)) {
                    ((bk_0)this).cfr_renamed_3 = (byte)0;
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    ((bk_0)this).cfr_renamed_3 = bk_0.var_byte_case;
                }
                this.cfr_renamed_8();
                ((bk_0)this).cfr_renamed_4 = (byte)1;
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                this.cfr_renamed_4();
            }
            super.void_do();
        }
    }

    public ha() {
        this.coKichHoat = 0;
        this.var_boolean_arr_do = new boolean[2];
        this.cfr_renamed_19 = 0;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_17 = 0;
        this.cfr_renamed_1 = 2;
    }

        public void cfr_renamed_15() {
    }

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[25];
        0 = (0x2F ^ 0x6A) & ~(0x45 ^ 0);
        2 = "  ".length();
        4 = 26 + 182 - 84 + 70 ^ 68 + 23 - -69 + 38;
        1 = " ".length();
        12 = 5 ^ 0x6D ^ (0xC4 ^ 0xA0);
        30 = 0xBA ^ 0xA4;
        -1 = -" ".length();
        7 = 0x68 ^ 0x71 ^ (0x70 ^ 0x6E);
        3 = "   ".length();
        33 = 0xA0 ^ 0x81;
        17 = 0x3E ^ 0x40 ^ (0 ^ 0x6F);
        60 = 0x14 ^ 0x26 ^ (0x96 ^ 0x98);
        5 = 0x44 ^ 0x41;
        22 = 84 + 64 - 123 + 128 ^ 115 + 73 - 46 + 1;
        18 = 0x1F ^ 0x74 ^ (0xF4 ^ 0x8D);
        20 = 0x5A ^ 8 ^ (0x14 ^ 0x52);
        100 = 0xFA ^ 0xB4 ^ (0xB7 ^ 0x9D);
        65280 = -(0xD0 ^ 0x90) & (0xFFFFFF7F & 0xFFBF);
        15 = 7 ^ 8;
        10 = 0x94 ^ 0x9E;
        24 = 0xD6 ^ 0xA5 ^ (0xCC ^ 0xA7);
        1440 = -(0xFFFFEAC7 & 0x7D3E) & (0xFFFFFFEF & 0x6DB5);
        13 = 0x1C ^ 0x11;
        50 = 0x9B ^ 0xA9;
        6 = 0x63 ^ 0x65;
    }

    public void cfr_renamed_5() {
        ((bk_0)this).cfr_renamed_4 = (byte)0;
        ((bk_0)this).cfr_renamed_11 = ((bk_0)this).cfr_renamed_3;
        this.var_int_new = this.cfr_renamed_1 ? 1 : 0;
        this.var_int_try = 0;
        this.var_int_case = 0;
        this.cfr_renamed_22 = 0;
    }

    public void cfr_renamed_4() {
        int n;
        int n2 = ((bk_0)this).cfr_renamed_18 * (this.cfr_renamed_22 * gc_0.int_new(gc_0.int_int(this.cfr_renamed_16)) >> 10);
        if (ha.cfr_renamed_3(this.boolean_if(n2, n = -((bk_0)this).cfr_renamed_18 * this.cfr_renamed_22 * gc_0.int_for(gc_0.int_int(this.cfr_renamed_16)) >> 10) ? 1 : 0)) {
            if ((this.boolean_do(n2, n))) {
                ((bk_0)this).cfr_renamed_3 = (byte)(((bk_0)this).cfr_renamed_3 + this.var_int_try);
                this.cfr_renamed_1 += this.var_int_case;
            }
            this.cfr_renamed_5();
            return;
        }
        ((bk_0)this).cfr_renamed_3 = (byte)(((bk_0)this).cfr_renamed_11 + n2);
        this.cfr_renamed_1 = this.var_int_new + n;
        n2 = gc_0.cfr_renamed_0(((bk_0)this).cfr_renamed_11, this.var_int_new, ((bk_0)this).cfr_renamed_3, this.cfr_renamed_1 ? 1 : 0);
        this.cfr_renamed_22 += 1;
        if ((n2 > this.cfr_renamed_13)) {
            this.cfr_renamed_5();
        }
    }

    public void cfr_renamed_1() {
        eq_0 eq_02;
        this.var_eq_0_for = eq_02 = new eq_0(gc_0.int_do(ef_0.var_short_if * 6) << 2, gc_0.int_do(ef_0.var_short_do * 6) << 2);
    }

                public void (Graphics graphics == 0) {
        if (ha.cfr_renamed_4(((bk_0)this).cfr_renamed_3 * aG.var_int_int + 30, ek_0.ek_0_do().soLuong) && ha.cfr_renamed_3(((bk_0)this).cfr_renamed_3 * aG.var_int_int - 30, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && (GameCanvas.var_dL_do != ec.cfr_renamed_0())) {
            fc_0 fc_02 = ak_0.fc_0_do((int)this.cfr_renamed_18);
            an an2 = ci_0.cfr_renamed_1(fc_02.var_short_arr_do[this.cfr_renamed_20]);
            if ((an2.soLuong != -1)) {
                int n;
                int n2;
                if (ha.cfr_renamed_0(((bk_0)this).cfr_renamed_4)) {
                    ((bk_0)this).cfr_renamed_4 = (byte)(an2.var_short_do / fc_02.var_byte_for);
                }
                if ((this.cfr_renamed_1 ? 1 : 0 != 7)) {
                    this.cfr_renamed_11 = fc_02.var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte];
                }
                Image image = an2.var_javax_microedition_lcdui_Image_do;
                int n3 = 0;
                short s2 = an2.cfr_renamed_1;
                if ((fc_02.var_byte_if == 4)) {
                    n2 = ((bk_0)this).cfr_renamed_4 / 3 << 1;
                    } else {
                    n2 = 0;
                }
                int n4 = this.cfr_renamed_1 * aG.var_int_int + this.cfr_renamed_10 - n2;
                if ((fc_02.var_byte_if != 4)) {
                    n = 33;
                    } else {
                    n = 17;
                }
                graphics.drawRegion(image, n3, this.cfr_renamed_11 * ((bk_0)this).cfr_renamed_4, (int)s2, (int)((bk_0)this).cfr_renamed_4, (int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, n4, n);
                super.cfr_renamed_0(graphics);
                this.cfr_renamed_0(graphics, ((bk_0)this).cfr_renamed_4 + 2, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, this.cfr_renamed_1 * aG.var_int_int);
            }
        }
    }

    public final void (Graphics graphics, int n, int n2, boolean bl == 0) {
        fc_0 fc_02 = ak_0.fc_0_do((int)this.cfr_renamed_18);
        an an2 = ci_0.cfr_renamed_1(fc_02.var_short_arr_do[this.cfr_renamed_20]);
        if ((an2.soLuong != -1)) {
            int n3;
            if (ha.cfr_renamed_0(((bk_0)this).cfr_renamed_4)) {
                ((bk_0)this).cfr_renamed_4 = (byte)(an2.var_short_do / fc_02.var_byte_for);
            }
            if ((this.cfr_renamed_1 ? 1 : 0 != 7)) {
                this.cfr_renamed_11 = fc_02.var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte];
            }
            Image image = an2.var_javax_microedition_lcdui_Image_do;
            int n4 = 0;
            short s2 = an2.cfr_renamed_1;
            if ((fc_02.var_byte_if != 4)) {
                n3 = 33;
                if (" ".length() >= "   ".length()) {
                    return;
                }
            } else {
                n3 = 17;
            }
            graphics.drawRegion(image, n4, this.cfr_renamed_11 * ((bk_0)this).cfr_renamed_4, (int)s2, (int)((bk_0)this).cfr_renamed_4, (int)((bk_0)this).cfr_renamed_3, n, n2 + this.cfr_renamed_10, n3);
            this.cfr_renamed_0(graphics, ((bk_0)this).cfr_renamed_4 + 2, n, n2);
        }
    }

    static {
        ha.cfr_renamed_12();
    }

    public ha(int n, byte by2) {
        this.coKichHoat = 0;
        this.var_boolean_arr_do = new boolean[2];
        this.cfr_renamed_19 = 0;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_17 = 0;
        fc_0 fc_02 = ak_0.fc_0_do((int)by2);
        this.chuoiGiaTri = fc_02.tenNhanVat;
        this.cfr_renamed_1 = 2;
        this.void_do(0, 0);
        ((bk_0)this).cfr_renamed_3 = (byte)0;
        ((bk_0)this).cfr_renamed_4 = (byte)0;
        this.cfr_renamed_12 = n;
        this.cfr_renamed_20 = 0;
        this.var_byte_new = (byte)4;
        this.var_int_case = this.var_byte_new;
        ((bk_0)this).cfr_renamed_18 = 1;
        this.cfr_renamed_18 = by2;
        this.var_int_byte = gc_0.int_do(12);
    }

        public void cfr_renamed_3() {
    }
}

