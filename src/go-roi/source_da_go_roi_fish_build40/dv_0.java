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

/*
 * Renamed from dV
 */
public final class dv_0
extends aa {
    private int soLuong;
    private boolean dangChayAuto;
    private int var_int_if;
    private long soXu;
    private String chuoiGiaTri;
    private static int[] mangSoNguyen;
    private int soLuongKhoa;
    private int cfr_renamed_3;
    private long var_long_if;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private int cfr_renamed_8;
    private long var_long_for;
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    private int cfr_renamed_14;
    private int cfr_renamed_21;
    private int cfr_renamed_10;
    private int cfr_renamed_18;
    private int cfr_renamed_30;
    private String[] var_java_lang_String_arr_do;
    private Vector var_java_util_Vector_do = new Vector();
    private static dv_0 var_dv_0_do;
    public static cu_0 var_cu_0_do;
    private int cfr_renamed_20;
    private boolean coTrangThai;
    private int cfr_renamed_16;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private int cfr_renamed_22;
    private boolean[] var_boolean_arr_do;

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.cfr_renamed_21, this.cfr_renamed_18, this.cfr_renamed_9, this.cfr_renamed_10, 0);
        var1_1.translate(this.cfr_renamed_21, this.cfr_renamed_18);
        var1_1.setColor(695195);
        var1_1.fillRect(12 * dF.cfr_renamed_12, 12 * dF.cfr_renamed_12, this.cfr_renamed_9 - 24 * dF.cfr_renamed_12, 50 * dF.cfr_renamed_12);
        var1_1.setColor(12648440);
        var1_1.fillRect(15 * dF.cfr_renamed_12, 15 * dF.cfr_renamed_12, this.cfr_renamed_9 - 30 * dF.cfr_renamed_12, 44 * dF.cfr_renamed_12);
        var2_2 = 0;
        if ((43 ^ 46) > 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            GameCanvas.var_fz_0_case.cfr_renamed_1(var1_1, this.var_java_lang_String_arr_do[var2_2], 20 * dF.cfr_renamed_12, 12 * dF.cfr_renamed_12 + 25 * dF.cfr_renamed_12 - this.var_java_lang_String_arr_do.length * dF.var_byte_new / 2 + var2_2 * dF.var_byte_new, 0);
            ++var2_2;
lbl15:
            // 2 sources

            ** while (!dv_0.cfr_renamed_5((int)var2_2, (int)this.var_java_lang_String_arr_do.length))
        }
lbl16:
        // 1 sources

        var2_3 = fh.ef_do(this.soLuong);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, this.chuoiGiaTri, this.cfr_renamed_5 / 2, this.cfr_renamed_8 + this.cfr_renamed_24 / 2 - dF.var_byte_try - 20 * dF.cfr_renamed_12, 2);
        var2_3.cfr_renamed_1(var1_1, this.cfr_renamed_5 / 2, this.cfr_renamed_8 + this.cfr_renamed_24 / 2 + var2_3.cfr_renamed_4, 1);
        var3_5 = dv_0.var_cu_0_do;
        var4_6 = this.cfr_renamed_24;
        var5_7 = this.soLuongKhoa;
        var6_8 = this.cfr_renamed_8;
        var7_9 = this.cfr_renamed_5;
        var2_3 = var1_1;
        var3_5.cfr_renamed_0(0, var7_9, var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(2, var7_9 + var5_7 - var3_5.soLuong, var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(5, var7_9, var6_8 + var4_6 - var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(7, var7_9 + var5_7 - var3_5.soLuong, var6_8 + var4_6 - var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
        var8_11 = 0;
        if (" ".length() != 0) ** GOTO lbl37
        return;
lbl-1000:
        // 1 sources

        {
            var3_5.cfr_renamed_0(1, var7_9 + (var8_11 + 1) * var3_5.soLuong, var6_8, 0, (Graphics)var2_3);
            var3_5.cfr_renamed_0(6, var7_9 + (var8_11 + 1) * var3_5.soLuong, var6_8 + var4_6 - var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
            ++var8_11;
lbl37:
            // 2 sources

            ** while (!dv_0.cfr_renamed_5((int)var8_11, (int)((var5_7 - (var3_5.soLuong << 1)) / var3_5.soLuong)))
        }
lbl38:
        // 1 sources

        var3_5.cfr_renamed_0(1, var7_9 + var5_7 - (var3_5.soLuong << 1), var6_8, 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(6, var7_9 + var5_7 - (var3_5.soLuong << 1), var6_8 + var4_6 - var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
        var8_11 = 0;
        if ("  ".length() != 0) ** GOTO lbl48
        return;
lbl-1000:
        // 1 sources

        {
            var3_5.cfr_renamed_0(3, var7_9, var6_8 + (var8_11 + 1) * var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
            var3_5.cfr_renamed_0(4, var7_9 + var5_7 - var3_5.soLuong, var6_8 + (var8_11 + 1) * var3_5.cfr_renamed_2, 0, (Graphics)var2_3);
            ++var8_11;
lbl48:
            // 2 sources

            ** while (!dv_0.cfr_renamed_5((int)var8_11, (int)((var4_6 - (var3_5.cfr_renamed_2 << 1)) / var3_5.cfr_renamed_2)))
        }
lbl49:
        // 1 sources

        var3_5.cfr_renamed_0(3, var7_9, var6_8 + var4_6 - (var3_5.cfr_renamed_2 << 1), 0, (Graphics)var2_3);
        var3_5.cfr_renamed_0(4, var7_9 + var5_7 - var3_5.soLuong, var6_8 + var4_6 - (var3_5.cfr_renamed_2 << 1), 0, (Graphics)var2_3);
        var2_3.setColor(4441283);
        var2_3.fillRect(var7_9 + var3_5.soLuong, var6_8 + var3_5.cfr_renamed_2, var5_7 - (var3_5.soLuong << 1), var4_6 - (var3_5.cfr_renamed_2 << 1));
        var1_1.translate(this.cfr_renamed_5, this.cfr_renamed_8);
        var1_1.setClip(0, 0, this.soLuongKhoa, this.cfr_renamed_24);
        var1_1.translate(0, -this.cfr_renamed_30);
        var2_4 = 0;
        if ("  ".length() != " ".length()) ** GOTO lbl67
        return;
lbl-1000:
        // 1 sources

        {
            var7_10 = (fl_0)this.var_java_util_Vector_do.elementAt(var2_4);
            if ((var2_4 == this.cfr_renamed_23) && dv_0.cfr_renamed_5((int)this.var_boolean_new)) {
                var1_1.setColor(10543802);
                var1_1.fillRect(4 * dF.cfr_renamed_12, 10 * dF.cfr_renamed_12 + var2_4 * this.cfr_renamed_14, this.soLuongKhoa - 8 * dF.cfr_renamed_12, this.cfr_renamed_14);
            }
            GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, var7_10.chuoiGiaTri, 10 * dF.cfr_renamed_12, 10 * dF.cfr_renamed_12 + var2_4 * this.cfr_renamed_14 + this.cfr_renamed_14 / 2 - dF.var_byte_try / 2, 0);
            ++var2_4;
lbl67:
            // 2 sources

            ** while (!dv_0.cfr_renamed_5((int)var2_4, (int)this.var_java_util_Vector_do.size()))
        }
lbl68:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public dv_0() {
        this.cfr_renamed_7 = 0;
        this.coTrangThai = 0;
        this.dangChayAuto = 0;
        this.cfr_renamed_9 = 200 * dF.cfr_renamed_12;
        this.cfr_renamed_10 = 190 * dF.cfr_renamed_12;
        this.cfr_renamed_21 = (GameCanvas.soLuongKhoa - this.cfr_renamed_9) / 2;
        this.cfr_renamed_18 = (GameCanvas.var_int_case - this.cfr_renamed_10) / 2;
        this.cfr_renamed_8 = 70 * dF.cfr_renamed_12;
        this.soLuongKhoa = 120 * dF.cfr_renamed_12;
        this.cfr_renamed_5 = this.cfr_renamed_9 - this.soLuongKhoa - 12 * dF.cfr_renamed_12;
        this.cfr_renamed_14 = 30 * dF.cfr_renamed_12;
        this.cfr_renamed_24 = this.cfr_renamed_14 * 3 + 20 * dF.cfr_renamed_12;
        ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 0, this);
        this.var_fl_0_new = new fl_0(MenuChinhAvatar.by, 1, this);
    }

            private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void (Vector vector, int n, String string, String string2, boolean[] blArray == null) {
        this.var_java_util_Vector_do = vector;
        this.var_boolean_arr_do = blArray;
        this.soLuong = n;
        this.cfr_renamed_16 = vector.size() * this.cfr_renamed_14 - (this.cfr_renamed_24 - 20 * dF.cfr_renamed_12);
        if ((this.cfr_renamed_16 < 0)) {
            this.cfr_renamed_16 = 0;
        }
        this.chuoiGiaTri = string;
        this.var_java_lang_String_arr_do = GameCanvas.var_fz_0_if.java_lang_String_arr_do(string2, this.cfr_renamed_9 - 50 * dF.cfr_renamed_12);
        GameCanvas.var_aa_do = this;
    }

    private static boolean boolean_int(int n) {
        return n <= 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    public final void cfr_renamed_7() {
        if ((this.cfr_renamed_20 == null)) {
            this.cfr_renamed_20 -= 1;
            if ((this.cfr_renamed_20 == 0)) {
                this.cfr_renamed_2();
            }
        }
        dv_0 dv_02 = this;
        if (dv_0.boolean_for(dv_02.cfr_renamed_22)) {
            if (!(dv_02.cfr_renamed_30 >= 0) || dv_0.boolean_if(dv_02.cfr_renamed_30, dv_02.cfr_renamed_16)) {
                dv_02.cfr_renamed_22 -= dv_02.cfr_renamed_22 / 4;
                dv_02.cfr_renamed_30 += dv_02.cfr_renamed_22 / 20;
                if (dv_0.boolean_do(dv_02.cfr_renamed_22 / 10, 1)) {
                    dv_02.cfr_renamed_22 = 0;
                }
            }
            if ((dv_02.cfr_renamed_30 < 0)) {
                if ((dv_02.cfr_renamed_30 < -dv_02.cfr_renamed_24 / 2)) {
                    dv_02.cfr_renamed_30 = -dv_02.cfr_renamed_24 / 2;
                    dv_02.cfr_renamed_13 = 0;
                    dv_02.cfr_renamed_22 = 0;
                    if (((0x20 ^ 0xE) & ~(0x6C ^ 0x42)) < ((0x88 ^ 0xAF) & ~(1 ^ 0x26))) {
                        return;
                    }
                }
            } else if (dv_0.boolean_if(dv_02.cfr_renamed_30, dv_02.cfr_renamed_16)) {
                if ((dv_02.cfr_renamed_30 < dv_02.cfr_renamed_16 + dv_02.cfr_renamed_24 / 2)) {
                    dv_02.cfr_renamed_30 = dv_02.cfr_renamed_16 + dv_02.cfr_renamed_24 / 2;
                    dv_02.cfr_renamed_13 = dv_02.cfr_renamed_16;
                    dv_02.cfr_renamed_22 = 0;
                    if (" ".length() == 0) {
                        return;
                    }
                }
            } else {
                dv_02.cfr_renamed_30 += dv_02.cfr_renamed_22 / 10;
            }
            dv_02.cfr_renamed_13 = dv_02.cfr_renamed_30;
            dv_02.cfr_renamed_22 -= dv_02.cfr_renamed_22 / 10;
            if ((dv_02.cfr_renamed_22 / 10 == 0)) {
                dv_02.cfr_renamed_22 = 0;
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
        } else if ((dv_02.cfr_renamed_30 < 0)) {
            dv_02.cfr_renamed_13 = 0;
            if (-"   ".length() > 0) {
                return;
            }
        } else if (dv_0.boolean_if(dv_02.cfr_renamed_30, dv_02.cfr_renamed_16)) {
            dv_02.cfr_renamed_13 = dv_02.cfr_renamed_16;
        }
        if ((dv_02.cfr_renamed_30 != dv_02.cfr_renamed_13)) {
            dv_02.cfr_renamed_4 = dv_02.cfr_renamed_13 - dv_02.cfr_renamed_30 << 2;
            dv_02.var_int_if += dv_02.cfr_renamed_4;
            dv_02.cfr_renamed_30 += dv_02.var_int_if >> 4;
            dv_02.var_int_if &= 15;
        }
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[27];
        20 = 0x66 ^ 0x1C ^ (0x49 ^ 0x27);
        0 = (0x95 ^ 0x8F) & ~(0xE ^ 0x14);
        200 = (0x6A ^ 0x5D) + (0xBF ^ 0xA7) - " ".length() + (0xC0 ^ 0xBA);
        190 = 112 + 62 - 107 + 123;
        2 = "  ".length();
        70 = 0x49 ^ 0xA ^ (0x12 ^ 0x17);
        120 = 0xCE ^ 0xB6;
        12 = 0xCE ^ 0xC2;
        30 = 15 + 97 - 10 + 50 ^ 47 + 37 - 5 + 55;
        3 = "   ".length();
        1 = " ".length();
        50 = 0xA6 ^ 0x98 ^ (1 ^ 0xD);
        4 = 0x10 ^ 0x17 ^ "   ".length();
        10 = " ".length() ^ (0x80 ^ 0x8B);
        15 = 0x5F ^ 0x50;
        8 = 0xB8 ^ 0xB0;
        40 = 0x46 ^ 0x6E;
        5 = 0x10 ^ 0x15;
        695195 = 0xFFFFBFFF & 0xADB9B;
        24 = 0x32 ^ 0x1A ^ (0x65 ^ 0x55);
        12648440 = -(0x85 ^ 0x81) & (0xFFFFFFFB & 0xC0FFFF);
        44 = 0x1B ^ 5 ^ (0x90 ^ 0xA2);
        25 = 66 + 17 - 28 + 88 ^ 7 + 123 - 109 + 129;
        7 = 144 + 128 - 254 + 170 ^ 23 + 62 - -12 + 90;
        6 = 0x6E ^ 0x68;
        4441283 = -(0xFFFFBE7F & 0x4BA9) & (0xFFFFDFEF & 0x43EEFB);
        10543802 = 0xFFFFEAFE & 0xA0F7BB;
    }

        private void cfr_renamed_2() {
        if ((this.var_boolean_arr_do[this.cfr_renamed_23] == 0)) {
            GameCanvas.var_aa_do = null;
            if (" ".length() > (0x60 ^ 0x22 ^ (0x3C ^ 0x7A))) {
                return;
            }
        } else {
            GameCanvas.cfr_renamed_8();
        }
        ((fl_0)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_23)).cfr_renamed_0();
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                this.cfr_renamed_2();
                return;
            }
            case 1: {
                GameCanvas.var_aa_do = null;
            }
        }
    }

    public static dv_0 cfr_renamed_1() {
        if ((var_dv_0_do == null)) {
            var_dv_0_do = new dv_0();
            return var_dv_0_do;
        }
        return var_dv_0_do;
    }

    static {
        dv_0.cfr_renamed_0();
        try {
            var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/popup/tile0.png")), 20 * dF.cfr_renamed_12, 20 * dF.cfr_renamed_12);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

                public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        ++this.var_long_for;
        int n = 0;
        if (dv_0.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0)) {
            this.cfr_renamed_23 -= 1;
            if ((this.cfr_renamed_23 < 0)) {
                this.cfr_renamed_23 = this.var_java_util_Vector_do.size() - 1;
            }
            n = 1;
            if (-" ".length() >= "  ".length()) {
                return;
            }
        } else if (dv_0.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0)) {
            this.cfr_renamed_23 += 1;
            if ((this.cfr_renamed_23 >= this.var_java_util_Vector_do.size())) {
                this.cfr_renamed_23 = 0;
            }
            n = 1;
        }
        if (dv_0.boolean_for(GameCanvas.coTrangThai ? 1 : 0)) {
            this.cfr_renamed_6 = GameCanvas.var_int_long;
            this.dangChayAuto = 0;
            if (dv_0.boolean_for(GameCanvas.boolean_if(this.cfr_renamed_21 + this.cfr_renamed_5, this.cfr_renamed_18 + this.cfr_renamed_8, this.soLuongKhoa, this.cfr_renamed_24) ? 1 : 0)) {
                if (dv_0.boolean_for(this.cfr_renamed_22)) {
                    this.dangChayAuto = 1;
                }
                GameCanvas.coTrangThai = 0;
                this.cfr_renamed_7 = this.cfr_renamed_13;
                this.var_long_if = this.var_long_for;
                this.coTrangThai = 1;
            }
        }
        if (dv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
            int n2;
            int n3;
            int n4 = this.cfr_renamed_6 - GameCanvas.soLuong;
            this.cfr_renamed_6 = GameCanvas.soLuong;
            long l = this.var_long_for - this.var_long_if;
            if (dv_0.boolean_for(GameCanvas.var_boolean_case ? 1 : 0)) {
                if (dv_0.cfr_renamed_5((this.var_long_for % 2L, 0L == null))) {
                    this.cfr_renamed_3 = GameCanvas.soLuong;
                    this.soXu = this.var_long_for;
                }
                this.cfr_renamed_22 = 0;
                if ((Math.abs(n4) < 10 * dF.cfr_renamed_12)) {
                    n3 = this.cfr_renamed_18 + this.cfr_renamed_8 + 10 * dF.cfr_renamed_12;
                    n2 = this.cfr_renamed_14;
                    if ((n3 = (this.cfr_renamed_13 + GameCanvas.soLuong - n3) / n2 >= 0) && (n3 < this.var_java_util_Vector_do.size())) {
                        this.cfr_renamed_23 = n3;
                    }
                }
                if (dv_0.cfr_renamed_5(hg.int_do(GameCanvas.int_for()), 10 * dF.cfr_renamed_12)) {
                    this.var_boolean_new = 1;
                    if (-" ".length() >= (0x56 ^ 0x61 ^ (0x9A ^ 0xA9))) {
                        return;
                    }
                } else if (((l, 3L == null) == null) && dv_0.cfr_renamed_0((l, 8L == null))) {
                    n3 = this.cfr_renamed_18 + this.cfr_renamed_8 + 10 * dF.cfr_renamed_12;
                    n2 = this.cfr_renamed_14;
                    if ((n3 = (this.cfr_renamed_13 + GameCanvas.soLuong - n3) / n2 >= 0) && (n3 < this.var_java_util_Vector_do.size()) && !(this.dangChayAuto)) {
                        this.var_boolean_new = 0;
                    }
                }
                if (!(this.cfr_renamed_13 >= 0) || dv_0.boolean_if(this.cfr_renamed_13, this.cfr_renamed_16)) {
                    this.cfr_renamed_7 = this.cfr_renamed_13 = this.cfr_renamed_7 + n4 / 2;
                }
                this.cfr_renamed_30 = this.cfr_renamed_13;
            }
            if (dv_0.boolean_for(GameCanvas.var_boolean_new ? 1 : 0) && dv_0.boolean_for(GameCanvas.boolean_if(this.cfr_renamed_21, this.cfr_renamed_18, this.cfr_renamed_9, this.cfr_renamed_10) ? 1 : 0)) {
                this.dangChayAuto = 0;
                n3 = (int)(this.var_long_for - this.soXu);
                n2 = this.cfr_renamed_3 - GameCanvas.soLuong;
                if (dv_0.boolean_if(hg.int_do(n2), 40) && (n3 < 10) && (this.cfr_renamed_13 == null) && (this.cfr_renamed_13 < this.cfr_renamed_16)) {
                    this.cfr_renamed_22 = n2 / n3 * 10;
                }
                this.soXu = -1L;
                if ((Math.abs(n4) < 10 * dF.cfr_renamed_12)) {
                    if (dv_0.boolean_int((l, 4L == null))) {
                        this.var_boolean_new = 0;
                        this.cfr_renamed_20 = 5;
                        } else if (!(this.var_boolean_new)) {
                        this.cfr_renamed_2();
                    }
                }
                this.coTrangThai = 0;
                GameCanvas.var_boolean_new = 0;
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        } else if (dv_0.boolean_for(GameCanvas.var_boolean_new ? 1 : 0) && !(GameCanvas.boolean_if(this.cfr_renamed_21, this.cfr_renamed_18, this.cfr_renamed_9, this.cfr_renamed_10))) {
            GameCanvas.var_boolean_new = 0;
            GameCanvas.var_aa_do = null;
        }
        if (dv_0.boolean_for(n)) {
            this.cfr_renamed_13 = this.cfr_renamed_23 * this.cfr_renamed_14 - this.cfr_renamed_24 / 2 + this.cfr_renamed_14 / 2;
            if (dv_0.boolean_if(this.cfr_renamed_13, this.cfr_renamed_16)) {
                this.cfr_renamed_13 = this.cfr_renamed_16;
                return;
            }
            if ((this.cfr_renamed_13 < 0)) {
                this.cfr_renamed_13 = 0;
            }
        }
    }

    }

