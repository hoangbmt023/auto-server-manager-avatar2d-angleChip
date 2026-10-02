/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class hs
extends dd_0 {
    public byte cfr_renamed_13;
    public int this;
    public boolean coKichHoat;
    public boolean cfr_renamed_3;
    public int cfr_renamed_12;
    public boolean[] var_boolean_arr_do;
    public int cfr_renamed_15;
    private static final int[] mangSoNguyen;
    public byte cfr_renamed_9;
    public int cfr_renamed_21;
    public int cfr_renamed_10;
    public int cfr_renamed_18;
    public byte cfr_renamed_14;
    public int cfr_renamed_30 = 0;
    public int cfr_renamed_20;
    public boolean cfr_renamed_4 = 0;
    public int cfr_renamed_16;
    public fs var_fs_for;

    public hs(int n, byte by2) {
        this.var_boolean_arr_do = new boolean[2];
        this.cfr_renamed_10 = 0;
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_20 = 0;
        gk_0 gk_02 = bz.gk_0_do((int)by2);
        this.chuoiGiaTri = gk_02.tenNhanVat;
        this.cfr_renamed_0 = 2;
        this.void_do(0, 0);
        this.var_byte_new = (byte)0;
        ((dd_0)this).cfr_renamed_2 = (byte)0;
        ((dd_0)this).cfr_renamed_9 = n;
        this.cfr_renamed_30 = 0;
        this.var_byte_int = (byte)4;
        ((dd_0)this).cfr_renamed_13 = this.var_byte_int;
        this.var_int_case = 1;
        this.cfr_renamed_9 = by2;
        this.var_int_byte = hg.int_new(12);
    }

        public final void (Graphics graphics, int n, int n2, boolean bl != 0) {
        gk_0 gk_02 = bz.gk_0_do((int)this.cfr_renamed_9);
        d_0 d_02 = aa_0.cfr_renamed_0(gk_02.var_short_arr_do[this.cfr_renamed_30]);
        if ((d_02.soLuong != -1)) {
            int n3;
            if ((this.var_int_new == 0)) {
                this.var_int_new = (short)(d_02.cfr_renamed_0 / gk_02.var_byte_for);
            }
            if ((this.cfr_renamed_0 ? 1 : 0 != 7)) {
                this.cfr_renamed_13 = gk_02.var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte];
            }
            Image image = d_02.var_javax_microedition_lcdui_Image_do;
            int n4 = 0;
            short s2 = d_02.var_short_do;
            if ((gk_02.var_byte_if != 4)) {
                n3 = 33;
                } else {
                n3 = 17;
            }
            graphics.drawRegion(image, n4, this.cfr_renamed_13 * this.var_int_new, (int)s2, this.var_int_new, (int)this.var_byte_new, n, n2 + this.cfr_renamed_14, n3);
            this.cfr_renamed_1(graphics, this.var_int_new + 2, n, n2);
        }
    }

    public hs() {
        this.var_boolean_arr_do = new boolean[2];
        this.cfr_renamed_10 = 0;
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_20 = 0;
        this.cfr_renamed_0 = 2;
    }

                public void cfr_renamed_4() {
        int n;
        int n2 = this.var_int_case * (this.cfr_renamed_16 * hg.int_int(hg.int_for(this.cfr_renamed_21)) >> 10);
        if (hs.cfr_renamed_1(this.boolean_if(n2, n = -this.var_int_case * this.cfr_renamed_16 * hg.int_if(hg.int_for(this.cfr_renamed_21)) >> 10) ? 1 : 0)) {
            if ((this.boolean_do(n2, n))) {
                ((dd_0)this).cfr_renamed_2 = (byte)(((dd_0)this).cfr_renamed_2 + this.var_int_new);
                this.var_byte_int = (byte)(this.var_byte_int + ((dd_0)this).cfr_renamed_13);
            }
            this.cfr_renamed_2();
            return;
        }
        ((dd_0)this).cfr_renamed_2 = (byte)(this.cfr_renamed_8 + n2);
        this.var_byte_int = (byte)(this.var_int_try + n);
        n2 = hg.cfr_renamed_1(this.cfr_renamed_8, this.var_int_try, ((dd_0)this).cfr_renamed_2, this.var_byte_int);
        this.cfr_renamed_16 += 1;
        if ((n2 > this.this)) {
            this.cfr_renamed_2();
        }
    }

    public void cfr_renamed_7() {
        this.this = hg.cfr_renamed_1(((dd_0)this).cfr_renamed_2, this.var_byte_int, this.var_fs_for.soLuong, this.var_fs_for.var_int_if);
        this.cfr_renamed_21 = hg.int_do(this.var_fs_for.soLuong - ((dd_0)this).cfr_renamed_2, -(this.var_fs_for.var_int_if - this.var_byte_int));
    }

    public void cfr_renamed_3() {
        fs fs2;
        this.var_fs_for = fs2 = new fs(hg.int_new(fh.var_short_if * 6) << 2, hg.int_new(fh.var_short_do * 6) << 2);
    }

    private void (Graphics graphics, int n, int n2, int n3 != 0) {
        int n4 = bz.gk_0_do((int)this.cfr_renamed_9).soLuong * 60 - this.cfr_renamed_15;
        int n5 = this.cfr_renamed_30 * 5;
        if (hs.cfr_renamed_3(this.cfr_renamed_15, bz.gk_0_do((int)this.cfr_renamed_9).soLuong * 60)) {
            v_0.cfr_renamed_1(n2 - (n5 + 22) * bm.var_int_if / 2, n3 - (18 + this.cfr_renamed_14) * bm.var_int_if - n, (n5 + 22) * bm.var_int_if, 4 * bm.var_int_if, 1, graphics);
            v_0.cfr_renamed_1(n2 - (n5 + 20) * bm.var_int_if / 2, n3 - (17 + this.cfr_renamed_14) * bm.var_int_if - n, this.cfr_renamed_12 * (n5 + 20) / 100 * bm.var_int_if, 2 * bm.var_int_if, 65280, graphics);
            switch (this.cfr_renamed_9) {
                case 50: 
                case 56: {
                    n4 = 7;
                    if (" ".length() != 0) break;
                    return;
                }
                case 53: 
                case 59: {
                    n4 = 15;
                    if (" ".length() > -" ".length()) break;
                    return;
                }
                case 52: {
                    n4 = 20;
                    if (((0x53 ^ 0x16) & ~(0x42 ^ 7)) >= -" ".length()) break;
                    return;
                }
                case 55: 
                case 60: 
                case 61: {
                    n4 = 10;
                    if (" ".length() >= 0) break;
                    return;
                }
                case 51: 
                case 54: 
                case 58: {
                    n4 = 30;
                    if (((0xFB ^ 0x90 ^ (0x29 ^ 0xB)) & (122 + 46 - -43 + 31 ^ 113 + 115 - 190 + 149 ^ -" ".length())) == 0) break;
                    return;
                }
                default: {
                    n4 = -1;
                }
            }
            if ((n4 != -1)) {
                String string;
                if ((n4 = n4 * 24 * 60 - this.cfr_renamed_15 > 1440)) {
                    string = "-" + (n4 / 1440 + 1) + " ngay";
                    if ("  ".length() <= ((0x5F ^ 0x70) & ~(0x1E ^ 0x31))) {
                        return;
                    }
                } else {
                    string = "-" + n4 / 60 + ":" + (n4 - n4 / 60 * 60);
                }
                GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, string, n2, n3 - (13 + this.cfr_renamed_14) * bm.var_int_if - n, 2);
            }
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            v_0.cfr_renamed_1(n2 - (n5 + 22) * bm.var_int_if / 2, n3 - (18 + this.cfr_renamed_14) * bm.var_int_if - n, (n5 + 22) * bm.var_int_if, 4 * bm.var_int_if, 1, graphics);
            v_0.cfr_renamed_1(n2 - (n5 + 20) * bm.var_int_if / 2, n3 - (17 + this.cfr_renamed_14) * bm.var_int_if - n, this.cfr_renamed_12 * (n5 + 20) / 100 * bm.var_int_if, 2 * bm.var_int_if, 65280, graphics);
            GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, n4 / 60 + ":" + (n4 - n4 / 60 * 60), n2, n3 - (13 + this.cfr_renamed_14) * bm.var_int_if - n, 2);
        }
        if ((this.cfr_renamed_0 ? 1 : 0 == 7)) {
            n = 10;
        }
        if ((this.var_boolean_arr_do[0] != 0)) {
            dR.var_cu_0_do.cfr_renamed_1(0, n2 - 10 * bm.var_int_if, n3 - (22 + this.cfr_renamed_14) * bm.var_int_if - n, 0, 3, graphics);
        }
        if ((this.var_boolean_arr_do[1] != 0)) {
            dR.var_cu_0_do.cfr_renamed_1(1, n2 + 10 * bm.var_int_if, n3 - (22 + this.cfr_renamed_14) * bm.var_int_if - n, 0, 3, graphics);
        }
    }

            public void cfr_renamed_0() {
    }

    public void cfr_renamed_5() {
    }

    public void cfr_renamed_6() {
    }

    public void void_do() {
        if ((this.cfr_renamed_3)) {
            if ((GameCanvas.int_do() - this.cfr_renamed_20 > 10)) {
                this.cfr_renamed_3 = 0;
                return;
            }
        } else {
            this.var_int_byte += 1;
            if ((this.var_int_byte >= 12)) {
                this.var_int_byte = 0;
            }
            this.cfr_renamed_5();
            if (hs.cfr_renamed_5(((dd_0)this).cfr_renamed_2, 1)) {
                if ((this.var_int_byte == 0)) {
                    ((dd_0)this).cfr_renamed_2 = (byte)hg.int_new(5 + (this.cfr_renamed_9 - 50) * 5);
                    if (hs.cfr_renamed_5(((dd_0)this).cfr_renamed_2, 2)) {
                        ((dd_0)this).cfr_renamed_2 = (byte)0;
                        if (-" ".length() > ((0x34 ^ 0x62) & ~(3 ^ 0x55))) {
                            return;
                        }
                    } else {
                        this.var_byte_new = (byte)hg.int_if(0, dd_0.var_byte_try);
                    }
                }
                if ((this.cfr_renamed_18 > 0)) {
                    this.cfr_renamed_18 -= 1;
                    return;
                }
                this.cfr_renamed_0();
                if (hs.cfr_renamed_3(this.var_fs_for.soLuong, ((dd_0)this).cfr_renamed_2)) {
                    this.var_byte_new = (byte)0;
                    if (" ".length() <= 0) {
                        return;
                    }
                } else {
                    this.var_byte_new = dd_0.var_byte_try;
                }
                this.cfr_renamed_7();
                ((dd_0)this).cfr_renamed_2 = (byte)1;
                if (((54 + 146 - 31 + 4 ^ 78 + 22 - 44 + 108) & (103 + 6 - -33 + 13 ^ 11 + 37 - -71 + 27 ^ -" ".length())) != ((77 + 109 - 161 + 116 ^ 42 + 37 - 74 + 131) & (0xE ^ 0x22 ^ (0xBC ^ 0x95) ^ -" ".length()))) {
                    return;
                }
            } else {
                this.cfr_renamed_4();
            }
            super.void_do();
        }
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[25];
        0 = (0x49 ^ 0x54) & ~(0x89 ^ 0x94);
        2 = "  ".length();
        4 = 0x94 ^ 0x90;
        1 = " ".length();
        12 = 0xA3 ^ 0xAF;
        30 = 0x41 ^ 0x2B ^ (0xDD ^ 0xA9);
        -1 = -" ".length();
        7 = 0xA ^ 0xD;
        3 = "   ".length();
        33 = 0x89 ^ 0xA8;
        17 = 0x2B ^ 0x3A;
        60 = 2 ^ 4 ^ (0x2D ^ 0x17);
        5 = 0x59 ^ 0x33 ^ (0xA9 ^ 0xC6);
        22 = 72 + 84 - 50 + 33 ^ 44 + 155 - 97 + 55;
        18 = 138 + 66 - 171 + 124 ^ 99 + 18 - 71 + 97;
        20 = 50 + 5 - 23 + 154 ^ 73 + 6 - 59 + 154;
        100 = 8 ^ 0x6C;
        65280 = 0xFFFFFF54 & 0xFFAB;
        15 = 0x35 ^ 0x5A ^ (0x6A ^ 0xA);
        10 = 0xB7 ^ 0xBD;
        24 = 0xA7 ^ 0xBF;
        1440 = 0xFFFF87E3 & 0x7DBC;
        13 = 63 + 71 - 2 + 32 ^ 132 + 98 - 125 + 64;
        50 = 0x61 ^ 0x36 ^ (0xEE ^ 0x8B);
        6 = 0x9D ^ 0x9B;
    }

            public void cfr_renamed_2() {
        ((dd_0)this).cfr_renamed_2 = (byte)0;
        this.cfr_renamed_8 = ((dd_0)this).cfr_renamed_2;
        this.var_int_try = this.var_byte_int;
        this.var_int_new = 0;
        ((dd_0)this).cfr_renamed_13 = 0;
        this.cfr_renamed_16 = 0;
    }

    public void (Graphics graphics != 0) {
        if (hs.cfr_renamed_6(((dd_0)this).cfr_renamed_2 * bm.var_int_if + 30, fm.fm_do().cfr_renamed_3) && hs.cfr_renamed_4(((dd_0)this).cfr_renamed_2 * bm.var_int_if - 30, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && (GameCanvas.var_en_do != ff_0.cfr_renamed_1())) {
            gk_0 gk_02 = bz.gk_0_do((int)this.cfr_renamed_9);
            d_0 d_02 = aa_0.cfr_renamed_0(gk_02.var_short_arr_do[this.cfr_renamed_30]);
            if ((d_02.soLuong != -1)) {
                int n;
                int n2;
                if ((this.var_int_new == 0)) {
                    this.var_int_new = (short)(d_02.cfr_renamed_0 / gk_02.var_byte_for);
                }
                if ((this.cfr_renamed_0 ? 1 : 0 != 7)) {
                    this.cfr_renamed_13 = gk_02.var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte];
                }
                Image image = d_02.var_javax_microedition_lcdui_Image_do;
                int n3 = 0;
                short s2 = d_02.var_short_do;
                if ((gk_02.var_byte_if == 4)) {
                    n2 = this.var_int_new / 3 << 1;
                    } else {
                    n2 = 0;
                }
                int n4 = this.var_byte_int * bm.var_int_if + this.cfr_renamed_14 - n2;
                if ((gk_02.var_byte_if != 4)) {
                    n = 33;
                    } else {
                    n = 17;
                }
                graphics.drawRegion(image, n3, this.cfr_renamed_13 * this.var_int_new, (int)s2, this.var_int_new, (int)this.var_byte_new, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, n4, n);
                super.cfr_renamed_1(graphics);
                this.cfr_renamed_1(graphics, this.var_int_new + 2, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, this.var_byte_int * bm.var_int_if);
            }
        }
    }

    static {
        hs.cfr_renamed_8();
    }

    }

