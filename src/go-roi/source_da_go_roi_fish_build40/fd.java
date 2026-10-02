/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class fd
extends fj {
    private byte cfr_renamed_8 = (byte)0;
    private static int[] mangSoNguyen;
    public static int soLuong;
    private fs var_fs_do;

        public final void (Graphics graphics > 0) {
        super.cfr_renamed_1(graphics);
        if ((this.var_fs_do.cfr_renamed_2 < 16)) {
            graphics.setColor(es_0.mangSoNguyen[fh.var_byte_if]);
            graphics.drawRoundRect((this.var_fs_do.soLuong - this.var_fs_do.cfr_renamed_2 / 2) * bm.var_int_if, (this.var_fs_do.var_int_if - this.var_fs_do.cfr_renamed_2 / 4) * bm.var_int_if, this.var_fs_do.cfr_renamed_2 * bm.var_int_if, this.var_fs_do.cfr_renamed_2 / 2 * bm.var_int_if, this.var_fs_do.cfr_renamed_2 * bm.var_int_if, this.var_fs_do.cfr_renamed_2 * bm.var_int_if);
        }
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[20];
        5 = 32 + 162 - 89 + 86 ^ 60 + 108 - 48 + 66;
        0 = (0x76 ^ 0x7B) & ~(0xF ^ 2);
        1 = " ".length();
        7 = 0x82 ^ 0xA0 ^ (0x29 ^ 0xC);
        -10 = -(0xBA ^ 0xB0);
        8 = 0x53 ^ 0x2B ^ (0x6B ^ 0x1B);
        6 = 0x35 ^ 0x33;
        2 = "  ".length();
        3 = "   ".length();
        -3 = -"   ".length();
        17 = 0x61 ^ 0x70;
        100 = 0xFF ^ 0xA4 ^ (0x9A ^ 0xA5);
        4 = 174 + 92 - 129 + 52 ^ 0 + 121 - 25 + 89;
        16 = 0x51 ^ 0x41;
        24 = 0x43 ^ 0x50 ^ (0x9D ^ 0x96);
        12 = 8 ^ 0x5A ^ (0x5E ^ 0);
        30 = 1 ^ 0x1F;
        10 = 0x81 ^ 0x8B;
        20 = 0xE ^ 0x1A;
        -1 = -" ".length();
    }

                    static {
        fd.cfr_renamed_8();
        soLuong = 5;
    }

    public final gb_0 gb_0_do() {
        gb_0 gb_02 = (gb_0)dR.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(hg.int_new(dR.var_java_util_Vector_arr_do[this.var_byte_do].size()));
        if (!fd.cfr_renamed_3(fh.boolean_do(((bm)gb_02).cfr_renamed_2, ((bm)gb_02).cfr_renamed_3) ? 1 : 0) || (gb_02.cfr_renamed_13 != 0)) {
            return null;
        }
        return gb_02;
    }

        public final void void_do() {
        if (!(this.var_fs_do.cfr_renamed_2 != 6) || (this.var_fs_do.soLuong == -10)) {
            int n;
            if ((this.cfr_renamed_30 == 2) && (this.var_byte_new == 0)) {
                n = 3;
                if (" ".length() < 0) {
                    return;
                }
            } else {
                n = -3;
            }
            this.var_fs_do.soLuong = ((bm)this).cfr_renamed_2 + n;
            this.var_fs_do.var_int_if = ((bm)this).cfr_renamed_3 + 2;
        }
        this.var_fs_do.cfr_renamed_2 += 1;
        if (!(this.var_fs_do.cfr_renamed_2 <= 17 * (3 - this.cfr_renamed_30)) || (this.cfr_renamed_8 > 0)) {
            this.var_fs_do.cfr_renamed_2 = 0;
        }
        gk_0 gk_02 = bz.gk_0_do((int)this.cfr_renamed_9);
        this.cfr_renamed_13 = gk_02.var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_int_byte];
        if ((hg.int_new(100) == 2) && (this.cfr_renamed_8 <= 0) && fd.cfr_renamed_3(((dd_0)this).cfr_renamed_2)) {
            this.cfr_renamed_8 = (byte)8;
        }
        if ((this.cfr_renamed_8 > 0)) {
            this.cfr_renamed_13 = (byte)(2 - this.cfr_renamed_8 / 3 + 2);
            ((hs)this).cfr_renamed_14 = this.cfr_renamed_8 = (byte)(this.cfr_renamed_8 - 1);
            if (fd.cfr_renamed_5(((hs)this).cfr_renamed_14, 4)) {
                ((hs)this).cfr_renamed_14 = (byte)(4 - this.cfr_renamed_8 % 4);
            }
            ((hs)this).cfr_renamed_14 = (byte)(((hs)this).cfr_renamed_14 + 5);
            ((hs)this).cfr_renamed_14 = -((hs)this).cfr_renamed_14;
            if ("   ".length() < 0) {
                return;
            }
        } else {
            ((hs)this).cfr_renamed_14 = (byte)0;
        }
        super.void_do();
    }

    public final void cfr_renamed_3() {
        this.var_fs_for = new fs(dR.var_fs_do.soLuong + 30 + hg.int_new(dR.var_int_byte - 2) * 24, dR.var_fs_do.var_int_if + 12 + hg.int_new(2) * 24);
    }

    public final boolean boolean_if(int n, int n2) {
        if (fd.cfr_renamed_4(((dd_0)this).cfr_renamed_2, -1)) {
            this.var_int_new = 0;
            ((dd_0)this).cfr_renamed_13 = 0;
            return 1;
        }
        if (fd.cfr_renamed_0(((dd_0)this).cfr_renamed_2) && fd.cfr_renamed_6(((dd_0)this).cfr_renamed_2, 1)) {
            this.var_int_new = 0;
            ((dd_0)this).cfr_renamed_13 = 0;
            return 1;
        }
        ((dd_0)this).cfr_renamed_2 = (byte)1;
        int n3 = ((dd_0)this).cfr_renamed_8;
        int n4 = this.var_int_try;
        if (!(fh.boolean_do(n3 + n, n4 + n2))) {
            if ((n != 0)) {
                if ((n > 0)) {
                    this.var_int_new = this.var_int_case;
                    } else {
                    this.var_int_new = -this.var_int_case;
                }
            }
            if ((n2 != 0)) {
                if ((n2 > 0)) {
                    ((dd_0)this).cfr_renamed_13 = this.var_int_case;
                    if ("  ".length() < ((0x1C ^ 0x18) & ~(0x82 ^ 0x86))) {
                        return ((0x86 ^ 0xC7) & ~(0x78 ^ 0x39)) != 0;
                    }
                } else {
                    ((dd_0)this).cfr_renamed_13 = -this.var_int_case;
                }
            }
            return 0;
        }
        this.var_int_new = 0;
        ((dd_0)this).cfr_renamed_13 = 0;
        return 1;
    }

                public final void (fs fs2 > 0) {
        this.var_fs_for = new fs(fs2.soLuong - 10 + hg.int_new(20), fs2.var_int_if - 10 + hg.int_new(20));
    }

    public fd(int n, byte by2) {
        super(n, by2);
        this.cfr_renamed_14 = 0;
        this.var_byte_do = (byte)1;
        this.var_byte_if = (byte)7;
        this.var_fs_do = new fs(-10, 0, hg.int_new(8));
    }

    public final void cfr_renamed_6() {
        this.var_fs_for = new fs();
        ((dd_0)this).cfr_renamed_8 = this.var_fs_for.soLuong = dR.var_fs_do.soLuong + hg.int_new(dR.var_int_byte - 1) * 24;
        ((bm)this).cfr_renamed_2 = this.var_fs_for.soLuong;
        this.var_int_try = this.var_fs_for.var_int_if = dR.var_fs_do.var_int_if + 12 + hg.int_new(2) * 24;
        ((bm)this).cfr_renamed_3 = this.var_fs_for.var_int_if;
        String cfr_ignored_0 = "777777777777777777777: " + ((bm)this).cfr_renamed_2 + "   " + ((bm)this).cfr_renamed_3;
        }
}

