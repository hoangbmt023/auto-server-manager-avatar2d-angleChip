/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class dH
extends hs {
    private Vector cfr_renamed_0 = new Vector();
    private int soLuong;
    private int cfr_renamed_14;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private static int[] mangSoNguyen;
    private boolean cfr_renamed_5;
    public DuLieuNguoiChoi duLieuNguoiChoi;
    private int cfr_renamed_22;
    private static final byte[][] var_byte_arr_arr_do;

    public dH(DuLieuNguoiChoi object) {
        this.var_byte_if = (byte)4;
        this.duLieuNguoiChoi = object;
        this.var_fs_for = new fs();
        this.var_fs_for.soLuong = ((bm)this.duLieuNguoiChoi).cfr_renamed_2 - 40 + hg.int_new(80);
        this.var_fs_for.var_int_if = ((bm)this.duLieuNguoiChoi).cfr_renamed_3 - 20 + hg.int_new(40);
        this.cfr_renamed_8 = ((bm)this).cfr_renamed_2 = this.var_fs_for.soLuong;
        this.var_int_try = ((bm)this).cfr_renamed_3 = this.var_fs_for.var_int_if;
        object = (cX)aa_0.am_do(this.duLieuNguoiChoi.var_short_if);
        this.cfr_renamed_23 = ((cX)object).cfr_renamed_2;
    }

    static {
        dH.cfr_renamed_8();
        var_javax_microedition_lcdui_Image_arr_do = new Image[2];
        byte[][] byArrayArray = new byte[3][];
        byte[] byArray = new byte[12];
        byArray[0] = 3;
        byArray[1] = 3;
        byArray[2] = 3;
        byArray[3] = 3;
        byArray[4] = 3;
        byArray[5] = 3;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 3;
        byArray[9] = 3;
        byArray[10] = 3;
        byArray[11] = 3;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[12];
        byArray2[3] = 1;
        byArray2[4] = 1;
        byArray2[5] = 1;
        byArray2[9] = 1;
        byArray2[10] = 1;
        byArray2[11] = 1;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[12];
        byArray3[0] = 2;
        byArray3[1] = 2;
        byArray3[2] = 2;
        byArray3[3] = 3;
        byArray3[4] = 3;
        byArray3[5] = 3;
        byArray3[6] = 2;
        byArray3[7] = 2;
        byArray3[8] = 2;
        byArray3[9] = 3;
        byArray3[10] = 3;
        byArray3[11] = 3;
        byArrayArray[2] = byArray3;
        var_byte_arr_arr_do = byArrayArray;
    }

        public final void (Graphics graphics != 0) {
        if (!dH.cfr_renamed_6((((bm)this).cfr_renamed_2 + 15) * bm.var_int_if, fm.fm_do().cfr_renamed_3) || !dH.cfr_renamed_4((((bm)this).cfr_renamed_2 - 15) * bm.var_int_if, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) || !!(this.duLieuNguoiChoi.dangChayAuto) || (GameCanvas.cfr_renamed_12 > 0) && (GameCanvas.var_en_do == ff_0.cfr_renamed_1())) {
            return;
        }
        cX cX2 = (cX)aa_0.am_do(this.duLieuNguoiChoi.var_short_if);
        if (dH.cfr_renamed_2(((am)cX2).cfr_renamed_3, -1)) {
            if (dH.cfr_renamed_6(((am)cX2).cfr_renamed_3, 2000)) {
                d_0 d_02 = aa_0.d_0_do(cX2.var_short_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]]);
                if ((d_02.soLuong != -1)) {
                    int n;
                    int n2;
                    if (!(this.cfr_renamed_5) && (cX2.var_byte_arr_do[0] + d_02.cfr_renamed_0 < -10) && (d_02.cfr_renamed_0 > 0)) {
                        this.cfr_renamed_5 = 1;
                        this.cfr_renamed_22 = 1;
                    }
                    if ((this.cfr_renamed_5)) {
                        n2 = 0;
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                    } else {
                        n2 = 1;
                    }
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n2], ((bm)this).cfr_renamed_2 * bm.var_int_if, (((bm)this).cfr_renamed_3 - 1) * bm.var_int_if, 3);
                    Image image = d_02.var_javax_microedition_lcdui_Image_do;
                    int n3 = 0;
                    int n4 = 0;
                    short s2 = d_02.var_short_do;
                    short s3 = d_02.cfr_renamed_0;
                    int n5 = ((bm)this).cfr_renamed_2 * bm.var_int_if + cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if;
                    if ((this.var_byte_new == dd_0.var_byte_try)) {
                        n = (cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * dF.cfr_renamed_12 << 1) + d_02.var_short_do * dF.cfr_renamed_12;
                        if (-" ".length() >= 0) {
                            return;
                        }
                    } else {
                        n = 0;
                    }
                    graphics.drawRegion(image, n3, n4, (int)s2, (int)s3, (int)this.var_byte_new, n5 - n, (((bm)this).cfr_renamed_3 + this.cfr_renamed_14) * bm.var_int_if + cX2.var_byte_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if, 0);
                    return;
                }
            } else {
                int n;
                int n6;
                k_0 k_02 = aa_0.var_k_0_arr_do[cX2.var_short_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]]];
                if (!(this.cfr_renamed_5) && (cX2.var_byte_arr_do[0] + k_02.cfr_renamed_5 < -10) && (k_02.cfr_renamed_5 > 0)) {
                    this.cfr_renamed_5 = 1;
                    this.cfr_renamed_22 = 1;
                }
                if ((this.cfr_renamed_5)) {
                    n6 = 0;
                    if ("   ".length() >= (0x79 ^ 0x7D)) {
                        return;
                    }
                } else {
                    n6 = 1;
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n6], ((bm)this).cfr_renamed_2 * bm.var_int_if, (((bm)this).cfr_renamed_3 - 1) * bm.var_int_if, 3);
                Image image = aa_0.hr_do((int)k_02.cfr_renamed_3).var_javax_microedition_lcdui_Image_do;
                int n7 = k_02.var_short_do * bm.var_int_if;
                int n8 = k_02.cfr_renamed_0 * bm.var_int_if;
                int n9 = k_02.cfr_renamed_4 * bm.var_int_if;
                int n10 = k_02.cfr_renamed_5 * bm.var_int_if;
                int n11 = ((bm)this).cfr_renamed_2 * bm.var_int_if + cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if;
                if ((this.var_byte_new == dd_0.var_byte_try)) {
                    n = (cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * dF.cfr_renamed_12 << 1) + k_02.cfr_renamed_4 * dF.cfr_renamed_12;
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                } else {
                    n = 0;
                }
                graphics.drawRegion(image, n7, n8, n9, n10, (int)this.var_byte_new, n11 - n, (((bm)this).cfr_renamed_3 + this.cfr_renamed_14) * bm.var_int_if + cX2.var_byte_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if, 0);
            }
        }
    }

            public final void (Graphics graphics, int n, int n2, int n3 != 0) {
        cX cX2 = (cX)aa_0.am_do(this.duLieuNguoiChoi.var_short_if);
        if (dH.cfr_renamed_2(((am)cX2).cfr_renamed_3, -1)) {
            int n4 = n2 + cX2.var_byte_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]];
            v_0.cfr_renamed_1(n - 10, n4 - 10, 20, 3, 11381824, graphics);
            graphics.setColor(11072024);
            graphics.drawRect(n - 10, n4 - 10, 20, 3);
            v_0.cfr_renamed_1(n - 9, n4 - 9, n3 * 20 / 100, 2, 16644608, graphics);
            if (dH.cfr_renamed_6(((am)cX2).cfr_renamed_3, 2000)) {
                d_0 d_02 = aa_0.d_0_do(cX2.var_short_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]]);
                if ((d_02.soLuong != -1)) {
                    int n5;
                    int n6;
                    if ((this.cfr_renamed_5)) {
                        n6 = 0;
                        if ((0xFB ^ 0xB2 ^ (0x45 ^ 8)) != (25 + 94 - 28 + 57 ^ 73 + 133 - 149 + 87)) {
                            return;
                        }
                    } else {
                        n6 = 1;
                    }
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n6], n, n2 - 1, 3);
                    Image image = d_02.var_javax_microedition_lcdui_Image_do;
                    int n7 = 0;
                    int n8 = 0;
                    short s2 = d_02.var_short_do;
                    short s3 = d_02.cfr_renamed_0;
                    int n9 = n + cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if;
                    if ((this.var_byte_new == dd_0.var_byte_try)) {
                        n5 = (cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * dF.cfr_renamed_12 << 1) + d_02.var_short_do * dF.cfr_renamed_12;
                        if (((0xAF ^ 0x8E ^ " ".length()) & (142 + 111 - 211 + 149 ^ 9 + 24 - -123 + 3 ^ -" ".length())) != 0) {
                            return;
                        }
                    } else {
                        n5 = 0;
                    }
                    graphics.drawRegion(image, n7, n8, (int)s2, (int)s3, (int)this.var_byte_new, n9 - n5, n4 + this.cfr_renamed_14, 0);
                    return;
                }
            } else {
                int n10;
                int n11;
                k_0 k_02 = aa_0.var_k_0_arr_do[cX2.var_short_arr_do[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]]];
                if ((this.cfr_renamed_5)) {
                    n11 = 0;
                    if (((0xEE ^ 0xB9) & ~(0x44 ^ 0x13)) > 0) {
                        return;
                    }
                } else {
                    n11 = 1;
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n11], n, n2 - 1, 3);
                Image image = aa_0.hr_do((int)k_02.cfr_renamed_3).var_javax_microedition_lcdui_Image_do;
                int n12 = k_02.var_short_do * bm.var_int_if;
                int n13 = k_02.cfr_renamed_0 * bm.var_int_if;
                int n14 = k_02.cfr_renamed_4 * bm.var_int_if;
                int n15 = k_02.cfr_renamed_5 * bm.var_int_if;
                int n16 = n + cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * bm.var_int_if;
                if ((this.var_byte_new == dd_0.var_byte_try)) {
                    n10 = (cX2.var_byte_arr_if[var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte]] * dF.cfr_renamed_12 << 1) + k_02.cfr_renamed_4 * dF.cfr_renamed_12;
                    if (" ".length() == -" ".length()) {
                        return;
                    }
                } else {
                    n10 = 0;
                }
                graphics.drawRegion(image, n12, n13, n14, n15, (int)this.var_byte_new, n16 - n10, n4 + this.cfr_renamed_14, 0);
            }
        }
    }

                public final void cfr_renamed_0() {
        this.cfr_renamed_3();
    }

    public final void cfr_renamed_2() {
        super.cfr_renamed_2();
        this.cfr_renamed_18 = 50 + hg.int_new(100);
        if ((this.cfr_renamed_0.size() > 0)) {
            this.cfr_renamed_3();
            if (dH.cfr_renamed_5(this.var_fs_for.soLuong, ((bm)this).cfr_renamed_2)) {
                this.var_byte_new = (byte)0;
                } else {
                this.var_byte_new = dd_0.var_byte_try;
            }
            this.cfr_renamed_7();
            ((dd_0)this).cfr_renamed_2 = (byte)1;
            this.cfr_renamed_18 = 0;
            this.cfr_renamed_16 = 1;
            this.var_int_case = 2 + this.cfr_renamed_23;
            return;
        }
        this.var_int_case = 1 + hg.int_new(this.cfr_renamed_23);
    }

                public final void cfr_renamed_3() {
        if ((this.cfr_renamed_0.size() > 0)) {
            fs fs2 = (fs)this.cfr_renamed_0.elementAt(0);
            this.var_fs_for.soLuong = fs2.soLuong;
            this.var_fs_for.var_int_if = fs2.var_int_if;
            this.cfr_renamed_0.removeElementAt(0);
            if (((0x5D ^ 0x65) & ~(0x48 ^ 0x70)) > 0) {
                return;
            }
        } else {
            int n = hg.int_new(20) - 10;
            if (dH.cfr_renamed_6(hg.int_do(this.var_fs_for.soLuong + n - ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2), 35)) {
                n = 0;
            }
            this.var_fs_for.soLuong += n;
            this.var_fs_for.var_int_if = ((bm)this).cfr_renamed_3;
        }
        if ((this.var_fs_for.soLuong < 0)) {
            this.var_fs_for.soLuong = 5;
            return;
        }
        if ((this.var_fs_for.soLuong > fh.var_short_if * 24)) {
            this.var_fs_for.soLuong = fh.var_short_if * 24 - 5;
            return;
        }
        if ((this.var_fs_for.var_int_if < 0)) {
            this.var_fs_for.var_int_if = 5;
            return;
        }
        if ((this.var_fs_for.var_int_if > fh.var_short_do * 24 - 24)) {
            this.var_fs_for.var_int_if = fh.var_short_do * 24 - 30;
        }
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[30];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0xC0 ^ 0x8C) & ~(0x11 ^ 0x5D);
        12 = 151 + 125 - 133 + 12 ^ 130 + 78 - 77 + 20;
        1 = " ".length();
        4 = 33 + 129 - 115 + 106 ^ 17 + 86 - 59 + 113;
        5 = 0x46 ^ 0x43;
        6 = 0xC6 ^ 0xC0;
        7 = 17 + 15 - -60 + 57 ^ 67 + 95 - 145 + 129;
        8 = 0xB1 ^ 0xBD ^ (8 ^ 0xC);
        9 = 0x34 ^ 0x3D;
        10 = 0xA0 ^ 0xAA;
        11 = 0x5F ^ 0x54;
        40 = 0x2D ^ 5;
        80 = 179 + 207 - 330 + 197 ^ 17 + 93 - -17 + 46;
        20 = 0x17 ^ 0x20 ^ (0x5C ^ 0x7F);
        35 = 8 + 18 - -82 + 48 ^ 84 + 27 - 38 + 118;
        24 = 0xB7 ^ 0xAF;
        30 = 0x13 ^ 9 ^ (0x27 ^ 0x23);
        -1 = -" ".length();
        -3 = -"   ".length();
        50 = 0xB7 ^ 0xB2 ^ (0x6C ^ 0x5B);
        100 = 0x57 ^ 0x33;
        15 = 155 + 154 - 252 + 106 ^ 6 + 122 - 107 + 151;
        2000 = -(0xFFFFF99F & 0x3E6E) & (0xFFFFFFDD & 0x3FFF);
        -10 = -(0x96 ^ 0x9C);
        11381824 = -(0xFFFFD05F & 0x6FB7) & (0xFFFFFCD7 & 0xADEF7E);
        11072024 = -(0xFFFFDCF5 & 0x27CF) & (0xFFFFF7FC & 0xA8FEDF);
        16644608 = 0xFFFFFBAD & 0xFDFE52;
        70 = 0x1E ^ 0x58;
    }

            public final void void_do() {
        if ((GameCanvas.var_int_goto % (3 - this.cfr_renamed_23) == 0)) {
            this.var_int_byte += 1;
        }
        if (dH.cfr_renamed_3(((dd_0)this).cfr_renamed_2, 1) && dH.cfr_renamed_3(((bm)this).cfr_renamed_3, this.var_int_try) && (this.cfr_renamed_5)) {
            if ((this.cfr_renamed_22 == 1)) {
                this.cfr_renamed_14 += 1;
                if ((this.cfr_renamed_14 > 3)) {
                    this.cfr_renamed_22 = -1;
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            } else {
                this.cfr_renamed_14 -= 1;
                if ((this.cfr_renamed_14 < -3)) {
                    this.cfr_renamed_22 = 1;
                }
            }
        }
        if ((this.var_int_byte >= 12)) {
            this.var_int_byte = 0;
        }
        dH dH2 = this;
        if ((!dH.cfr_renamed_3(dH2.cfr_renamed_24, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_2) || dH.cfr_renamed_2(dH2.soLuong, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_3)) && dH.cfr_renamed_5(hg.cfr_renamed_1(dH2.cfr_renamed_24, dH2.soLuong, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_2, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_3), 40)) {
            int n = 10 + hg.int_new(20);
            if ((dH2.duLieuNguoiChoi.var_byte_new == 0)) {
                n = -(10 + hg.int_new(20));
            }
            if (dH.cfr_renamed_2(fh.int_if(((bm)dH2.duLieuNguoiChoi).cfr_renamed_2 + n, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_3), 80)) {
                n = 0;
            }
            dH2.cfr_renamed_0.addElement(new fs(((bm)dH2.duLieuNguoiChoi).cfr_renamed_2 + n, ((bm)dH2.duLieuNguoiChoi).cfr_renamed_3));
            dH2.cfr_renamed_24 = ((bm)dH2.duLieuNguoiChoi).cfr_renamed_2 + n;
            dH2.soLuong = ((bm)dH2.duLieuNguoiChoi).cfr_renamed_3;
        }
        if (dH.cfr_renamed_2(((dd_0)this).cfr_renamed_2, 1)) {
            if ((this.cfr_renamed_18 > 0)) {
                if ((this.var_int_byte == 0)) {
                    ((dd_0)this).cfr_renamed_2 = (byte)hg.int_new(3 + (this.cfr_renamed_23 << 1));
                    if (dH.cfr_renamed_2(((dd_0)this).cfr_renamed_2, 2)) {
                        ((dd_0)this).cfr_renamed_2 = (byte)0;
                        } else {
                        this.var_byte_new = (byte)hg.int_if(0, dd_0.var_byte_try);
                    }
                    if ((this.cfr_renamed_5)) {
                        ((dd_0)this).cfr_renamed_2 = (byte)2;
                    }
                }
                this.cfr_renamed_18 -= 1;
                if (dH.cfr_renamed_5(hg.cfr_renamed_1(((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3, ((bm)this.duLieuNguoiChoi).cfr_renamed_2, ((bm)this.duLieuNguoiChoi).cfr_renamed_3), 35)) {
                    super.cfr_renamed_2();
                    this.cfr_renamed_18 = 0;
                    this.var_int_case = 4;
                }
                return;
            }
            this.cfr_renamed_3();
            if (dH.cfr_renamed_5(this.var_fs_for.soLuong, ((bm)this).cfr_renamed_2)) {
                this.var_byte_new = (byte)0;
                if (-"  ".length() > 0) {
                    return;
                }
            } else {
                this.var_byte_new = dd_0.var_byte_try;
            }
            this.cfr_renamed_7();
            ((dd_0)this).cfr_renamed_2 = (byte)1;
            return;
        }
        this.cfr_renamed_4();
    }

        public final void cfr_renamed_4() {
        int n = this.var_int_case * this.duLieuNguoiChoi.var_short_float / 100;
        if ((this.duLieuNguoiChoi.var_short_float >= 70)) {
            n = this.var_int_case;
        }
        if ((n <= 0)) {
            n = 1;
        }
        int n2 = n * (this.cfr_renamed_16 * hg.int_int(hg.int_for(this.cfr_renamed_21)) >> 10);
        n = -n * (this.cfr_renamed_16 * hg.int_if(hg.int_for(this.cfr_renamed_21))) >> 10;
        ((bm)this).cfr_renamed_2 = this.cfr_renamed_8 + n2;
        ((bm)this).cfr_renamed_3 = this.var_int_try + n;
        n = hg.cfr_renamed_1(this.cfr_renamed_8, this.var_int_try, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3);
        this.cfr_renamed_16 += 1;
        if ((n > this.this)) {
            this.cfr_renamed_2();
        }
    }
}

