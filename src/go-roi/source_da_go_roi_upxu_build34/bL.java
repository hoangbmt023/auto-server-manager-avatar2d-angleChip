/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class bL
extends e_0 {
    private int soLuong;
    private int var_int_if;
    public static ep var_ep_do;
    private boolean dangChayAuto;
    private boolean coTrangThai;
    private static int[] mangSoNguyen;
    private int soLuongKhoa;
    private int cfr_renamed_4;
    private String[] var_java_lang_String_arr_do;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private String chuoiGiaTri;
    private int cfr_renamed_8;
    private int cfr_renamed_12;
    private int cfr_renamed_11;
    private int cfr_renamed_18;
    private int cfr_renamed_10;
    private int cfr_renamed_17;
    private int cfr_renamed_13;
    private int cfr_renamed_30;
    private int cfr_renamed_22;
    private long soXu;
    private int cfr_renamed_19;
    private int cfr_renamed_20;
    private boolean[] var_boolean_arr_do;
    private static bL var_bL_do;
    private int cfr_renamed_14;
    private int cfr_renamed_23;
    private long var_long_if;
    private int cfr_renamed_24;
    private Vector var_java_util_Vector_do = new Vector();
    private long var_long_for;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[27];
        20 = 5 + 115 - 11 + 27 ^ 73 + 108 - 40 + 15;
        0 = (0xBE ^ 0x9B ^ (0x39 ^ 0x22)) & (0x46 ^ 0x75 ^ (0x38 ^ 0x35) ^ -" ".length());
        200 = (0x19 ^ 0xD) + (124 + 185 - 174 + 60) - (0xE8 ^ 0x98) + (0x5D ^ 0x3C);
        190 = (0x37 ^ 0x1B) + (156 + 3 - 114 + 122) - (0x5C ^ 0x3F) + (0xE3 ^ 0xAD);
        2 = "  ".length();
        70 = 0x82 ^ 0xC4;
        120 = 0xF ^ 0x77;
        12 = 0xB8 ^ 0xB4;
        30 = 0xD9 ^ 0xC7;
        3 = "   ".length();
        1 = " ".length();
        50 = 0x25 ^ 0x17;
        4 = 5 ^ 1;
        10 = 0x47 ^ 0x60 ^ (0x8C ^ 0xA1);
        15 = 136 + 103 - 93 + 36 ^ 78 + 64 - 7 + 50;
        8 = 0x62 ^ 0x3B ^ (0xC7 ^ 0x96);
        40 = 0xA4 ^ 0x8C;
        5 = 7 ^ 0x7C ^ (0xC9 ^ 0xB7);
        695195 = -(0xFFFFFEFB & 0x4165) & (0xFFFFFFFB & 0xADBFF);
        24 = 0xA6 ^ 0xBE;
        12648440 = -(0xC4 ^ 0xC0) & (0xFFFFFFFB & 0xC0FFFF);
        44 = 0x6B ^ 0x44 ^ "   ".length();
        25 = 0x5E ^ 0x10 ^ (0x23 ^ 0x74);
        7 = 0x28 ^ 0x2F;
        6 = 0x43 ^ 0x45;
        4441283 = 0xFFFFDFEB & 0x43E4D7;
        10543802 = -(0xFFFFFEFE & 0xD43) & (0xFFFFEEFB & 0xA0FFFF);
    }

    public final void (Vector vector, int n, String string, String string2, boolean[] blArray == null) {
        this.var_java_util_Vector_do = vector;
        this.var_boolean_arr_do = blArray;
        this.cfr_renamed_13 = n;
        this.cfr_renamed_19 = vector.size() * this.cfr_renamed_4 - (this.cfr_renamed_23 - 20 * bn_0.cfr_renamed_6);
        if ((this.cfr_renamed_19 < 0)) {
            this.cfr_renamed_19 = 0;
        }
        this.chuoiGiaTri = string;
        this.var_java_lang_String_arr_do = GameCanvas.var_ew_if.java_lang_String_arr_do(string2, this.cfr_renamed_30 - 50 * bn_0.cfr_renamed_6);
        GameCanvas.var_e_0_do = this;
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

        public static bL cfr_renamed_0() {
        if ((var_bL_do == null)) {
            var_bL_do = new bL();
            return var_bL_do;
        }
        return var_bL_do;
    }

    static {
        bL.cfr_renamed_1();
        try {
            var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/race/popup/tile0.png")), 20 * bn_0.cfr_renamed_6, 20 * bn_0.cfr_renamed_6);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.cfr_renamed_1(var1_1);
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.cfr_renamed_14, this.cfr_renamed_10, this.cfr_renamed_30, this.soLuongKhoa, 0);
        var1_1.translate(this.cfr_renamed_14, this.cfr_renamed_10);
        var1_1.setColor(695195);
        var1_1.fillRect(12 * bn_0.cfr_renamed_6, 12 * bn_0.cfr_renamed_6, this.cfr_renamed_30 - 24 * bn_0.cfr_renamed_6, 50 * bn_0.cfr_renamed_6);
        var1_1.setColor(12648440);
        var1_1.fillRect(15 * bn_0.cfr_renamed_6, 15 * bn_0.cfr_renamed_6, this.cfr_renamed_30 - 30 * bn_0.cfr_renamed_6, 44 * bn_0.cfr_renamed_6);
        var2_2 = 0;
        if (" ".length() < (88 ^ 7 ^ (119 ^ 44))) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            GameCanvas.var_ew_case.cfr_renamed_0(var1_1, this.var_java_lang_String_arr_do[var2_2], 20 * bn_0.cfr_renamed_6, 12 * bn_0.cfr_renamed_6 + 25 * bn_0.cfr_renamed_6 - this.var_java_lang_String_arr_do.length * bn_0.cfr_renamed_15 / 2 + var2_2 * bn_0.cfr_renamed_15, 0);
            ++var2_2;
lbl15:
            // 2 sources

            ** while (!bL.boolean_do((int)var2_2, (int)this.var_java_lang_String_arr_do.length))
        }
lbl16:
        // 1 sources

        var2_3 = ef_0.dd_0_do(this.cfr_renamed_13);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, this.chuoiGiaTri, this.cfr_renamed_8 / 2, this.cfr_renamed_12 + this.cfr_renamed_23 / 2 - bn_0.var_byte_new - 20 * bn_0.cfr_renamed_6, 2);
        var2_3.cfr_renamed_0(var1_1, this.cfr_renamed_8 / 2, this.cfr_renamed_12 + this.cfr_renamed_23 / 2 + var2_3.var_short_int, 1);
        var3_5 = bL.var_ep_do;
        var4_6 = this.cfr_renamed_23;
        var5_7 = this.cfr_renamed_18;
        var6_8 = this.cfr_renamed_12;
        var7_9 = this.cfr_renamed_8;
        var2_3 = var1_1;
        var3_5.cfr_renamed_0(0, var7_9, var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(2, var7_9 + var5_7 - var3_5.cfr_renamed_3, var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(5, var7_9, var6_8 + var4_6 - var3_5.soLuong, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(7, var7_9 + var5_7 - var3_5.cfr_renamed_3, var6_8 + var4_6 - var3_5.soLuong, 0, (Graphics)var2_3);
        var8_11 = 0;
        if ("  ".length() != 0) ** GOTO lbl37
        return;
lbl-1000:
        // 1 sources

        {
            var3_5.cfr_renamed_0(1, var7_9 + (var8_11 + 1) * var3_5.cfr_renamed_3, var6_8, 0, (Graphics)var2_3);
            var3_5.cfr_renamed_0(6, var7_9 + (var8_11 + 1) * var3_5.cfr_renamed_3, var6_8 + var4_6 - var3_5.soLuong, 0, (Graphics)var2_3);
            ++var8_11;
lbl37:
            // 2 sources

            ** while (!bL.boolean_do((int)var8_11, (int)((var5_7 - (var3_5.cfr_renamed_3 << 1)) / var3_5.cfr_renamed_3)))
        }
lbl38:
        // 1 sources

        var3_5.cfr_renamed_0(1, var7_9 + var5_7 - (var3_5.cfr_renamed_3 << 1), var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(6, var7_9 + var5_7 - (var3_5.cfr_renamed_3 << 1), var6_8 + var4_6 - var3_5.soLuong, 0, (Graphics)var2_3);
        var8_11 = 0;
        if (null == null) ** GOTO lbl48
        return;
lbl-1000:
        // 1 sources

        {
            var3_5.cfr_renamed_0(3, var7_9, var6_8 + (var8_11 + 1) * var3_5.soLuong, 0, (Graphics)var2_3);
            var3_5.cfr_renamed_0(4, var7_9 + var5_7 - var3_5.cfr_renamed_3, var6_8 + (var8_11 + 1) * var3_5.soLuong, 0, (Graphics)var2_3);
            ++var8_11;
lbl48:
            // 2 sources

            ** while (!bL.boolean_do((int)var8_11, (int)((var4_6 - (var3_5.soLuong << 1)) / var3_5.soLuong)))
        }
lbl49:
        // 1 sources

        var3_5.cfr_renamed_0(3, var7_9, var6_8 + var4_6 - (var3_5.soLuong << 1), 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(4, var7_9 + var5_7 - var3_5.cfr_renamed_3, var6_8 + var4_6 - (var3_5.soLuong << 1), 0, (Graphics)var2_3);
        var2_3.setColor(4441283);
        var2_3.fillRect(var7_9 + var3_5.cfr_renamed_3, var6_8 + var3_5.soLuong, var5_7 - (var3_5.cfr_renamed_3 << 1), var4_6 - (var3_5.soLuong << 1));
        var1_1.translate(this.cfr_renamed_8, this.cfr_renamed_12);
        var1_1.setClip(0, 0, this.cfr_renamed_18, this.cfr_renamed_23);
        var1_1.translate(0, -this.cfr_renamed_24);
        var2_4 = 0;
        if (" ".length() == " ".length()) ** GOTO lbl67
        return;
lbl-1000:
        // 1 sources

        {
            var7_10 = (ei)this.var_java_util_Vector_do.elementAt(var2_4);
            if (bL.boolean_if(var2_4, this.cfr_renamed_2) && bL.boolean_if((int)this.var_boolean_new)) {
                var1_1.setColor(10543802);
                var1_1.fillRect(4 * bn_0.cfr_renamed_6, 10 * bn_0.cfr_renamed_6 + var2_4 * this.cfr_renamed_4, this.cfr_renamed_18 - 8 * bn_0.cfr_renamed_6, this.cfr_renamed_4);
            }
            GameCanvas.var_ew_try.cfr_renamed_0(var1_1, var7_10.chuoiGiaTri, 10 * bn_0.cfr_renamed_6, 10 * bn_0.cfr_renamed_6 + var2_4 * this.cfr_renamed_4 + this.cfr_renamed_4 / 2 - bn_0.var_byte_new / 2, 0);
            ++var2_4;
lbl67:
            // 2 sources

            ** while (!bL.boolean_do((int)var2_4, (int)this.var_java_util_Vector_do.size()))
        }
lbl68:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public bL() {
        this.cfr_renamed_11 = 0;
        this.coTrangThai = 0;
        this.dangChayAuto = 0;
        this.cfr_renamed_30 = 200 * bn_0.cfr_renamed_6;
        this.soLuongKhoa = 190 * bn_0.cfr_renamed_6;
        this.cfr_renamed_14 = (GameCanvas.var_int_byte - this.cfr_renamed_30) / 2;
        this.cfr_renamed_10 = (GameCanvas.var_int_char - this.soLuongKhoa) / 2;
        this.cfr_renamed_12 = 70 * bn_0.cfr_renamed_6;
        this.cfr_renamed_18 = 120 * bn_0.cfr_renamed_6;
        this.cfr_renamed_8 = this.cfr_renamed_30 - this.cfr_renamed_18 - 12 * bn_0.cfr_renamed_6;
        this.cfr_renamed_4 = 30 * bn_0.cfr_renamed_6;
        this.cfr_renamed_23 = this.cfr_renamed_4 * 3 + 20 * bn_0.cfr_renamed_6;
        this.var_ei_new = new ei(MenuChinhAvatar.dg, 0, this);
        this.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, 1, this);
    }

        public final void void_if(int n) {
        switch (n) {
            case 0: {
                this.cfr_renamed_4();
                return;
            }
            case 1: {
                GameCanvas.var_e_0_do = null;
            }
        }
    }

        private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            public final void cfr_renamed_15() {
        super.cfr_renamed_15();
        ++this.soXu;
        int n = 0;
        if ((GameCanvas.boolean_do(2))) {
            this.cfr_renamed_2 -= 1;
            if ((this.cfr_renamed_2 < 0)) {
                this.cfr_renamed_2 = this.var_java_util_Vector_do.size() - 1;
            }
            n = 1;
            if (-"  ".length() > 0) {
                return;
            }
        } else if ((GameCanvas.boolean_do(8))) {
            this.cfr_renamed_2 += 1;
            if (bL.boolean_do(this.cfr_renamed_2, this.var_java_util_Vector_do.size())) {
                this.cfr_renamed_2 = 0;
            }
            n = 1;
        }
        if ((GameCanvas.coKichHoat)) {
            this.cfr_renamed_17 = GameCanvas.var_int_goto;
            this.dangChayAuto = 0;
            if ((GameCanvas.boolean_do(this.cfr_renamed_14 + this.cfr_renamed_8, this.cfr_renamed_10 + this.cfr_renamed_12, this.cfr_renamed_18, this.cfr_renamed_23))) {
                if ((this.cfr_renamed_22 != 0)) {
                    this.dangChayAuto = 1;
                }
                GameCanvas.coKichHoat = 0;
                this.cfr_renamed_11 = this.cfr_renamed_5;
                this.var_long_for = this.soXu;
                this.coTrangThai = 1;
            }
        }
        if ((this.coTrangThai)) {
            int n2;
            int n3;
            int n4 = this.cfr_renamed_17 - GameCanvas.var_int_if;
            this.cfr_renamed_17 = GameCanvas.var_int_if;
            long l = this.soXu - this.var_long_for;
            if ((GameCanvas.var_boolean_try)) {
                if (bL.boolean_if((this.soXu % 2L, 0L == null))) {
                    this.cfr_renamed_15 = GameCanvas.var_int_if;
                    this.var_long_if = this.soXu;
                }
                this.cfr_renamed_22 = 0;
                if ((Math.abs(n4) < 10 * bn_0.cfr_renamed_6)) {
                    n3 = this.cfr_renamed_10 + this.cfr_renamed_12 + 10 * bn_0.cfr_renamed_6;
                    n2 = this.cfr_renamed_4;
                    if ((n3 = (this.cfr_renamed_5 + GameCanvas.var_int_if - n3) / n2 >= 0) && (n3 < this.var_java_util_Vector_do.size())) {
                        this.cfr_renamed_2 = n3;
                    }
                }
                if (bL.boolean_do(gc_0.int_if(GameCanvas.int_for()), 10 * bn_0.cfr_renamed_6)) {
                    this.var_boolean_new = 1;
                    if (" ".length() != " ".length()) {
                        return;
                    }
                } else if (bL.cfr_renamed_5((l, 3L == null)) && bL.cfr_renamed_2((l, 8L == null))) {
                    n3 = this.cfr_renamed_10 + this.cfr_renamed_12 + 10 * bn_0.cfr_renamed_6;
                    n2 = this.cfr_renamed_4;
                    if ((n3 = (this.cfr_renamed_5 + GameCanvas.var_int_if - n3) / n2 >= 0) && (n3 < this.var_java_util_Vector_do.size()) && bL.boolean_if(this.dangChayAuto ? 1 : 0)) {
                        this.var_boolean_new = 0;
                    }
                }
                if (!(this.cfr_renamed_5 >= 0) || (this.cfr_renamed_5 > this.cfr_renamed_19)) {
                    this.cfr_renamed_11 = this.cfr_renamed_5 = this.cfr_renamed_11 + n4 / 2;
                }
                this.cfr_renamed_24 = this.cfr_renamed_5;
            }
            if ((GameCanvas.var_boolean_new) && (GameCanvas.boolean_do(this.cfr_renamed_14, this.cfr_renamed_10, this.cfr_renamed_30, this.soLuongKhoa))) {
                this.dangChayAuto = 0;
                n3 = (int)(this.soXu - this.var_long_if);
                n2 = this.cfr_renamed_15 - GameCanvas.var_int_if;
                if ((gc_0.int_if(n2) > 40) && (n3 < 10) && (this.cfr_renamed_5 > 0) && (this.cfr_renamed_5 < this.cfr_renamed_19)) {
                    this.cfr_renamed_22 = n2 / n3 * 10;
                }
                this.var_long_if = -1L;
                if ((Math.abs(n4) < 10 * bn_0.cfr_renamed_6)) {
                    if (bL.boolean_do((l, 4L == null))) {
                        this.var_boolean_new = 0;
                        this.cfr_renamed_20 = 5;
                        if (((0x26 ^ 0x15) & ~(0x10 ^ 0x23)) != 0) {
                            return;
                        }
                    } else if (bL.boolean_if(this.var_boolean_new ? 1 : 0)) {
                        this.cfr_renamed_4();
                    }
                }
                this.coTrangThai = 0;
                GameCanvas.var_boolean_new = 0;
                }
        } else if ((GameCanvas.var_boolean_new) && bL.boolean_if(GameCanvas.boolean_do(this.cfr_renamed_14, this.cfr_renamed_10, this.cfr_renamed_30, this.soLuongKhoa) ? 1 : 0)) {
            GameCanvas.var_boolean_new = 0;
            GameCanvas.var_e_0_do = null;
        }
        if ((n != 0)) {
            this.cfr_renamed_5 = this.cfr_renamed_2 * this.cfr_renamed_4 - this.cfr_renamed_23 / 2 + this.cfr_renamed_4 / 2;
            if ((this.cfr_renamed_5 > this.cfr_renamed_19)) {
                this.cfr_renamed_5 = this.cfr_renamed_19;
                return;
            }
            if ((this.cfr_renamed_5 < 0)) {
                this.cfr_renamed_5 = 0;
            }
        }
    }

            public final void void_for() {
        if ((this.cfr_renamed_20 > 0)) {
            this.cfr_renamed_20 -= 1;
            if (bL.boolean_if(this.cfr_renamed_20)) {
                this.cfr_renamed_4();
            }
        }
        bL bL2 = this;
        if ((bL2.cfr_renamed_22 != 0)) {
            if (!(bL2.cfr_renamed_24 >= 0) || (bL2.cfr_renamed_24 > bL2.cfr_renamed_19)) {
                bL2.cfr_renamed_22 -= bL2.cfr_renamed_22 / 4;
                bL2.cfr_renamed_24 += bL2.cfr_renamed_22 / 20;
                if ((bL2.cfr_renamed_22 / 10 <= 1)) {
                    bL2.cfr_renamed_22 = 0;
                }
            }
            if ((bL2.cfr_renamed_24 < 0)) {
                if ((bL2.cfr_renamed_24 < -bL2.cfr_renamed_23 / 2)) {
                    bL2.cfr_renamed_24 = -bL2.cfr_renamed_23 / 2;
                    bL2.cfr_renamed_5 = 0;
                    bL2.cfr_renamed_22 = 0;
                    if (((0xA3 ^ 0xAA) & ~(0xA8 ^ 0xA1)) < 0) {
                        return;
                    }
                }
            } else if ((bL2.cfr_renamed_24 > bL2.cfr_renamed_19)) {
                if ((bL2.cfr_renamed_24 < bL2.cfr_renamed_19 + bL2.cfr_renamed_23 / 2)) {
                    bL2.cfr_renamed_24 = bL2.cfr_renamed_19 + bL2.cfr_renamed_23 / 2;
                    bL2.cfr_renamed_5 = bL2.cfr_renamed_19;
                    bL2.cfr_renamed_22 = 0;
                    if ("   ".length() <= "  ".length()) {
                        return;
                    }
                }
            } else {
                bL2.cfr_renamed_24 += bL2.cfr_renamed_22 / 10;
            }
            bL2.cfr_renamed_5 = bL2.cfr_renamed_24;
            bL2.cfr_renamed_22 -= bL2.cfr_renamed_22 / 10;
            if (bL.boolean_if(bL2.cfr_renamed_22 / 10)) {
                bL2.cfr_renamed_22 = 0;
                }
        } else if ((bL2.cfr_renamed_24 < 0)) {
            bL2.cfr_renamed_5 = 0;
            if (-" ".length() >= " ".length()) {
                return;
            }
        } else if ((bL2.cfr_renamed_24 > bL2.cfr_renamed_19)) {
            bL2.cfr_renamed_5 = bL2.cfr_renamed_19;
        }
        if ((bL2.cfr_renamed_24 != bL2.cfr_renamed_5)) {
            bL2.soLuong = bL2.cfr_renamed_5 - bL2.cfr_renamed_24 << 2;
            bL2.var_int_if += bL2.soLuong;
            bL2.cfr_renamed_24 += bL2.var_int_if >> 4;
            bL2.var_int_if &= 15;
        }
    }

    private void cfr_renamed_4() {
        if (bL.boolean_if(this.var_boolean_arr_do[this.cfr_renamed_2])) {
            GameCanvas.var_e_0_do = null;
            if (-"   ".length() >= 0) {
                return;
            }
        } else {
            GameCanvas.cfr_renamed_5();
        }
        ((ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_2)).cfr_renamed_1();
    }
}

