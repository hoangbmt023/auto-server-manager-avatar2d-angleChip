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

/*
 * Renamed from bq
 */
public final class bq_0
extends ha {
    private static final byte[][] var_byte_arr_arr_do;
    private int soLuong;
    private int cfr_renamed_10;
    private int cfr_renamed_14;
    private static int[] mangSoNguyen;
    private boolean cfr_renamed_2;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private Vector cfr_renamed_1 = new Vector();
    public DuLieuNguoiChoi duLieuNguoiChoi;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;

        private static void cfr_renamed_12() {
        mangSoNguyen = new int[30];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x9F ^ 0xB2 ^ (0xEF ^ 0x89)) & (82 + 59 - 14 + 11 ^ 2 + 91 - 3 + 103 ^ -" ".length());
        12 = 156 + 42 - 143 + 145 ^ 167 + 90 - 188 + 127;
        1 = " ".length();
        4 = 0x26 ^ 0x22;
        5 = 13 + 128 - 16 + 18 ^ 89 + 115 - 114 + 48;
        6 = 0x46 ^ 0x40;
        7 = 0x9A ^ 0x9D;
        8 = 0x2A ^ 0x60 ^ (0x5A ^ 0x18);
        9 = 89 + 89 - 96 + 109 ^ 162 + 86 - 152 + 86;
        10 = 40 + 6 - 0 + 86 ^ 141 + 68 - 205 + 138;
        11 = 0x12 ^ 0x19;
        40 = 0xE5 ^ 0xC4 ^ (0x59 ^ 0x50);
        80 = 0x33 ^ 0x63;
        20 = 19 + 101 - -33 + 0 ^ 112 + 32 - 116 + 113;
        35 = 0x4F ^ 0x11 ^ (0xD9 ^ 0xA4);
        24 = 79 + 67 - 24 + 32 ^ 31 + 5 - -73 + 21;
        30 = 0x3A ^ 0x24;
        -1 = -" ".length();
        -3 = -"   ".length();
        50 = 0x9A ^ 0xA8;
        100 = 0x7F ^ 0x1B;
        15 = 0xB7 ^ 0xB8;
        2000 = -(0xFFFFFE3E & 0x71C9) & (0xFFFFF7D7 & Short.MAX_VALUE);
        -10 = -(0x3C ^ 0x55 ^ (0xFB ^ 0x98));
        11381824 = -(0xFFFFD9BA & 0x66DF) & (0xFFFFFEDB & 0xADEDFD);
        11072024 = -(0xFFFFC7EF & 0x3CD5) & (0xFFFFFFFD & 0xA8F6DE);
        16644608 = 0xFFFFFA0D & 0xFDFFF2;
        70 = 0x1D ^ 0x5B;
    }

    public final void (Graphics graphics > 0) {
        if (!bq_0.cfr_renamed_15((((aG)this).cfr_renamed_3 + 15) * aG.var_int_int, ek_0.ek_0_do().soLuong) || !bq_0.cfr_renamed_5((((aG)this).cfr_renamed_3 - 15) * aG.var_int_int, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) || !!(this.duLieuNguoiChoi.dangChayAuto) || (GameCanvas.cfr_renamed_16 > 0) && (GameCanvas.var_dL_do == ec.cfr_renamed_0())) {
            return;
        }
        ci ci2 = (ci)ci_0.q_0_do(this.duLieuNguoiChoi.var_short_short);
        if ((ci2.var_short_do != -1)) {
            if ((ci2.var_short_do >= 2000)) {
                an an2 = ci_0.an_do(ci2.var_short_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]]);
                if ((an2.soLuong != -1)) {
                    int n;
                    int n2;
                    if (!(this.cfr_renamed_2) && (ci2.var_byte_arr_do[0] + an2.var_short_do < -10) && (an2.var_short_do > 0)) {
                        this.cfr_renamed_2 = 1;
                        this.soLuong = 1;
                    }
                    if ((this.cfr_renamed_2)) {
                        n2 = 0;
                        if (-" ".length() == "  ".length()) {
                            return;
                        }
                    } else {
                        n2 = 1;
                    }
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n2], ((aG)this).cfr_renamed_3 * aG.var_int_int, (this.var_int_if - 1) * aG.var_int_int, 3);
                    Image image = an2.var_javax_microedition_lcdui_Image_do;
                    int n3 = 0;
                    int n4 = 0;
                    short s2 = an2.cfr_renamed_1;
                    short s3 = an2.var_short_do;
                    int n5 = ((aG)this).cfr_renamed_3 * aG.var_int_int + ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int;
                    if (bq_0.cfr_renamed_3(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                        n = (ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * bn_0.cfr_renamed_6 << 1) + an2.cfr_renamed_1 * bn_0.cfr_renamed_6;
                        if (" ".length() < " ".length()) {
                            return;
                        }
                    } else {
                        n = 0;
                    }
                    graphics.drawRegion(image, n3, n4, (int)s2, (int)s3, (int)((bk_0)this).cfr_renamed_3, n5 - n, (this.var_int_if + this.cfr_renamed_14) * aG.var_int_int + ci2.var_byte_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int, 0);
                    return;
                }
            } else {
                int n;
                int n6;
                bH bH2 = ci_0.var_bH_arr_do[ci2.var_short_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]]];
                if (!(this.cfr_renamed_2) && (ci2.var_byte_arr_do[0] + bH2.cfr_renamed_3 < -10) && (bH2.cfr_renamed_3 > 0)) {
                    this.cfr_renamed_2 = 1;
                    this.soLuong = 1;
                }
                if ((this.cfr_renamed_2)) {
                    n6 = 0;
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                } else {
                    n6 = 1;
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n6], ((aG)this).cfr_renamed_3 * aG.var_int_int, (this.var_int_if - 1) * aG.var_int_int, 3);
                Image image = ci_0.gy_0_do((int)bH2.cfr_renamed_1).var_javax_microedition_lcdui_Image_do;
                int n7 = bH2.cfr_renamed_4 * aG.var_int_int;
                int n8 = bH2.cfr_renamed_2 * aG.var_int_int;
                int n9 = bH2.cfr_renamed_5 * aG.var_int_int;
                int n10 = bH2.cfr_renamed_3 * aG.var_int_int;
                int n11 = ((aG)this).cfr_renamed_3 * aG.var_int_int + ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int;
                if (bq_0.cfr_renamed_3(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                    n = (ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * bn_0.cfr_renamed_6 << 1) + bH2.cfr_renamed_5 * bn_0.cfr_renamed_6;
                    if (" ".length() <= 0) {
                        return;
                    }
                } else {
                    n = 0;
                }
                graphics.drawRegion(image, n7, n8, n9, n10, (int)((bk_0)this).cfr_renamed_3, n11 - n, (this.var_int_if + this.cfr_renamed_14) * aG.var_int_int + ci2.var_byte_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int, 0);
            }
        }
    }

            public final void cfr_renamed_1() {
        if ((this.cfr_renamed_1.size() > 0)) {
            eq_0 eq_02 = (eq_0)this.cfr_renamed_1.elementAt(0);
            this.var_eq_0_for.var_int_if = eq_02.var_int_if;
            this.var_eq_0_for.soLuong = eq_02.soLuong;
            this.cfr_renamed_1.removeElementAt(0);
            if ("  ".length() > "   ".length()) {
                return;
            }
        } else {
            int n = gc_0.int_do(20) - 10;
            if (bq_0.cfr_renamed_15(gc_0.int_if(this.var_eq_0_for.var_int_if + n - ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3), 35)) {
                n = 0;
            }
            this.var_eq_0_for.var_int_if += n;
            this.var_eq_0_for.soLuong = this.var_int_if;
        }
        if ((this.var_eq_0_for.var_int_if < 0)) {
            this.var_eq_0_for.var_int_if = 5;
            return;
        }
        if ((this.var_eq_0_for.var_int_if > ef_0.var_short_if * 24)) {
            this.var_eq_0_for.var_int_if = ef_0.var_short_if * 24 - 5;
            return;
        }
        if ((this.var_eq_0_for.soLuong < 0)) {
            this.var_eq_0_for.soLuong = 5;
            return;
        }
        if ((this.var_eq_0_for.soLuong > ef_0.var_short_do * 24 - 24)) {
            this.var_eq_0_for.soLuong = ef_0.var_short_do * 24 - 30;
        }
    }

    public final void cfr_renamed_3() {
        this.cfr_renamed_1();
    }

        public final void void_do() {
        if ((GameCanvas.var_int_try % (3 - this.cfr_renamed_23) == 0)) {
            this.var_int_byte += 1;
        }
        if (bq_0.cfr_renamed_3(((bk_0)this).cfr_renamed_4, 1) && (this.var_int_if == this.var_int_new) && (this.cfr_renamed_2)) {
            if ((this.soLuong == 1)) {
                this.cfr_renamed_14 += 1;
                if ((this.cfr_renamed_14 > 3)) {
                    this.soLuong = -1;
                    }
            } else {
                this.cfr_renamed_14 -= 1;
                if ((this.cfr_renamed_14 < -3)) {
                    this.soLuong = 1;
                }
            }
        }
        if ((this.var_int_byte >= 12)) {
            this.var_int_byte = 0;
        }
        bq_0 bq_02 = this;
        if ((!bq_0.cfr_renamed_3(bq_02.cfr_renamed_10, ((aG)bq_02.duLieuNguoiChoi).cfr_renamed_3) || (bq_02.cfr_renamed_24 != bq_02.duLieuNguoiChoi.var_int_if)) && bq_0.cfr_renamed_4(gc_0.cfr_renamed_0(bq_02.cfr_renamed_10, bq_02.cfr_renamed_24, ((aG)bq_02.duLieuNguoiChoi).cfr_renamed_3, bq_02.duLieuNguoiChoi.var_int_if), 40)) {
            int n = 10 + gc_0.int_do(20);
            if (bq_0.cfr_renamed_3(((bk_0)bq_02.duLieuNguoiChoi).cfr_renamed_3)) {
                n = -(10 + gc_0.int_do(20));
            }
            if (bq_0.cfr_renamed_8(ef_0.int_if(((aG)bq_02.duLieuNguoiChoi).cfr_renamed_3 + n, bq_02.duLieuNguoiChoi.var_int_if), 80)) {
                n = 0;
            }
            bq_02.cfr_renamed_1.addElement(new eq_0(((aG)bq_02.duLieuNguoiChoi).cfr_renamed_3 + n, bq_02.duLieuNguoiChoi.var_int_if));
            bq_02.cfr_renamed_10 = ((aG)bq_02.duLieuNguoiChoi).cfr_renamed_3 + n;
            bq_02.cfr_renamed_24 = bq_02.duLieuNguoiChoi.var_int_if;
        }
        if (bq_0.cfr_renamed_8(((bk_0)this).cfr_renamed_4, 1)) {
            if ((this.cfr_renamed_30 > 0)) {
                if ((this.var_int_byte == 0)) {
                    ((bk_0)this).cfr_renamed_4 = (byte)gc_0.int_do(3 + (this.cfr_renamed_23 << 1));
                    if (bq_0.cfr_renamed_8(((bk_0)this).cfr_renamed_4, 2)) {
                        ((bk_0)this).cfr_renamed_4 = (byte)0;
                        if ("  ".length() == 0) {
                            return;
                        }
                    } else {
                        ((bk_0)this).cfr_renamed_3 = (byte)gc_0.int_if(0, bk_0.var_byte_case);
                    }
                    if ((this.cfr_renamed_2)) {
                        ((bk_0)this).cfr_renamed_4 = (byte)2;
                    }
                }
                this.cfr_renamed_30 -= 1;
                if (bq_0.cfr_renamed_4(gc_0.cfr_renamed_0(((aG)this).cfr_renamed_3, this.var_int_if, ((aG)this.duLieuNguoiChoi).cfr_renamed_3, this.duLieuNguoiChoi.var_int_if), 35)) {
                    super.cfr_renamed_5();
                    this.cfr_renamed_30 = 0;
                    ((bk_0)this).cfr_renamed_18 = 4;
                }
                return;
            }
            this.cfr_renamed_1();
            if (bq_0.cfr_renamed_4(this.var_eq_0_for.var_int_if, ((aG)this).cfr_renamed_3)) {
                ((bk_0)this).cfr_renamed_3 = (byte)0;
                if (" ".length() == 0) {
                    return;
                }
            } else {
                ((bk_0)this).cfr_renamed_3 = bk_0.var_byte_case;
            }
            this.cfr_renamed_8();
            ((bk_0)this).cfr_renamed_4 = (byte)1;
            return;
        }
        this.cfr_renamed_4();
    }

        static {
        bq_0.cfr_renamed_12();
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

                public final void (Graphics graphics, int n, int n2, int n3 > 0) {
        ci ci2 = (ci)ci_0.q_0_do(this.duLieuNguoiChoi.var_short_short);
        if ((ci2.var_short_do != -1)) {
            int n4 = n2 + ci2.var_byte_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]];
            k.cfr_renamed_0(n - 10, n4 - 10, 20, 3, 11381824, graphics);
            graphics.setColor(11072024);
            graphics.drawRect(n - 10, n4 - 10, 20, 3);
            k.cfr_renamed_0(n - 9, n4 - 9, n3 * 20 / 100, 2, 16644608, graphics);
            if ((ci2.var_short_do >= 2000)) {
                an an2 = ci_0.an_do(ci2.var_short_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]]);
                if ((an2.soLuong != -1)) {
                    int n5;
                    int n6;
                    if ((this.cfr_renamed_2)) {
                        n6 = 0;
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        n6 = 1;
                    }
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n6], n, n2 - 1, 3);
                    Image image = an2.var_javax_microedition_lcdui_Image_do;
                    int n7 = 0;
                    int n8 = 0;
                    short s2 = an2.cfr_renamed_1;
                    short s3 = an2.var_short_do;
                    int n9 = n + ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int;
                    if (bq_0.cfr_renamed_3(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                        n5 = (ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * bn_0.cfr_renamed_6 << 1) + an2.cfr_renamed_1 * bn_0.cfr_renamed_6;
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                    } else {
                        n5 = 0;
                    }
                    graphics.drawRegion(image, n7, n8, (int)s2, (int)s3, (int)((bk_0)this).cfr_renamed_3, n9 - n5, n4 + this.cfr_renamed_14, 0);
                    return;
                }
            } else {
                int n10;
                int n11;
                bH bH2 = ci_0.var_bH_arr_do[ci2.var_short_arr_do[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]]];
                if ((this.cfr_renamed_2)) {
                    n11 = 0;
                    if ((0x83 ^ 0x86) == 0) {
                        return;
                    }
                } else {
                    n11 = 1;
                }
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[n11], n, n2 - 1, 3);
                Image image = ci_0.gy_0_do((int)bH2.cfr_renamed_1).var_javax_microedition_lcdui_Image_do;
                int n12 = bH2.cfr_renamed_4 * aG.var_int_int;
                int n13 = bH2.cfr_renamed_2 * aG.var_int_int;
                int n14 = bH2.cfr_renamed_5 * aG.var_int_int;
                int n15 = bH2.cfr_renamed_3 * aG.var_int_int;
                int n16 = n + ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * aG.var_int_int;
                if (bq_0.cfr_renamed_3(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                    n10 = (ci2.var_byte_arr_if[var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_int_byte]] * bn_0.cfr_renamed_6 << 1) + bH2.cfr_renamed_5 * bn_0.cfr_renamed_6;
                    } else {
                    n10 = 0;
                }
                graphics.drawRegion(image, n12, n13, n14, n15, (int)((bk_0)this).cfr_renamed_3, n16 - n10, n4 + this.cfr_renamed_14, 0);
            }
        }
    }

    public final void cfr_renamed_4() {
        int n = ((bk_0)this).cfr_renamed_18 * this.duLieuNguoiChoi.var_short_void / 100;
        if ((this.duLieuNguoiChoi.var_short_void >= 70)) {
            n = ((bk_0)this).cfr_renamed_18;
        }
        if ((n <= 0)) {
            n = 1;
        }
        int n2 = n * (this.cfr_renamed_22 * gc_0.int_new(gc_0.int_int(this.cfr_renamed_16)) >> 10);
        n = -n * (this.cfr_renamed_22 * gc_0.int_for(gc_0.int_int(this.cfr_renamed_16))) >> 10;
        ((aG)this).cfr_renamed_3 = ((bk_0)this).cfr_renamed_11 + n2;
        this.var_int_if = this.var_int_new + n;
        n = gc_0.cfr_renamed_0(((bk_0)this).cfr_renamed_11, this.var_int_new, ((aG)this).cfr_renamed_3, this.var_int_if);
        this.cfr_renamed_22 += 1;
        if ((n > this.cfr_renamed_13)) {
            this.cfr_renamed_5();
        }
    }

        public final void cfr_renamed_5() {
        super.cfr_renamed_5();
        this.cfr_renamed_30 = 50 + gc_0.int_do(100);
        if ((this.cfr_renamed_1.size() > 0)) {
            this.cfr_renamed_1();
            if (bq_0.cfr_renamed_4(this.var_eq_0_for.var_int_if, ((aG)this).cfr_renamed_3)) {
                ((bk_0)this).cfr_renamed_3 = (byte)0;
                if (("   ".length() ^ (0x9F ^ 0x98)) <= ((49 + 113 - 70 + 68 ^ 113 + 33 - 85 + 71) & (102 + 144 - 113 + 37 ^ 10 + 110 - -4 + 18 ^ -" ".length()))) {
                    return;
                }
            } else {
                ((bk_0)this).cfr_renamed_3 = bk_0.var_byte_case;
            }
            this.cfr_renamed_8();
            ((bk_0)this).cfr_renamed_4 = (byte)1;
            this.cfr_renamed_30 = 0;
            this.cfr_renamed_22 = 1;
            ((bk_0)this).cfr_renamed_18 = 2 + this.cfr_renamed_23;
            return;
        }
        ((bk_0)this).cfr_renamed_18 = 1 + gc_0.int_do(this.cfr_renamed_23);
    }

            public bq_0(DuLieuNguoiChoi object) {
        this.var_byte_if = (byte)4;
        this.duLieuNguoiChoi = object;
        this.var_eq_0_for = new eq_0();
        this.var_eq_0_for.var_int_if = ((aG)this.duLieuNguoiChoi).cfr_renamed_3 - 40 + gc_0.int_do(80);
        this.var_eq_0_for.soLuong = this.duLieuNguoiChoi.var_int_if - 20 + gc_0.int_do(40);
        ((bk_0)this).cfr_renamed_11 = ((aG)this).cfr_renamed_3 = this.var_eq_0_for.var_int_if;
        this.var_int_new = this.var_int_if = this.var_eq_0_for.soLuong;
        object = (ci)ci_0.q_0_do(this.duLieuNguoiChoi.var_short_short);
        this.cfr_renamed_23 = ((ci)object).cfr_renamed_4;
    }

    }

