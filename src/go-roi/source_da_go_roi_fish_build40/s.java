/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class s
extends dj_0 {
    private int soLuong;
    private long soXu = -1L;
    private int var_int_if;
    private int soLuongKhoa;
    public boolean dangChayAuto;
    public static cu_0 var_cu_0_do;
    private long var_long_if;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private int cfr_renamed_8;
    private Vector var_java_util_Vector_do = new Vector();
    private static final int[] mangSoNguyen;
    private String chuoiGiaTri = "";
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    private long var_long_for;
    private Vector var_java_util_Vector_if;
    private int cfr_renamed_14;
    private int cfr_renamed_21;

    public final void (boolean bl != null) {
        this.dangChayAuto = bl;
        this.cfr_renamed_14 = this.var_java_util_Vector_if.size() * this.var_int_if + 20;
        if ((this.dangChayAuto)) {
            this.cfr_renamed_14 += 25 * dF.cfr_renamed_12 + 4;
            this.cfr_renamed_3 += 25 * dF.cfr_renamed_12 + 4;
        }
        if (s.boolean_if(this.cfr_renamed_14, (bl = this.cfr_renamed_5 * 3 + (dF.cfr_renamed_12 - 1) * 15) ? 1 : 0)) {
            this.cfr_renamed_14 = bl ? 1 : 0;
        }
        this.cfr_renamed_9 = GameCanvas.var_int_int - GameCanvas.this - this.cfr_renamed_14 - 10;
        this.var_long_for = GameCanvas.int_do();
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case -2: {
                go_0.go_0_do();
                go_0.cfr_renamed_22();
                return;
            }
            case -1: {
                this.dangChayAuto = 0;
                GameCanvas.var_dj_0_do = null;
                return;
            }
        }
        GameCanvas.var_en_do.void_do(n, n2);
    }

    public final void (String string, fl_0 fl_02, Vector vector != null) {
        if ((TienIchGame.boolean_do(string))) {
            return;
        }
        thi(string, fl_02, vector != 0);
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[25];
        0 = (5 ^ 0x2F) & ~(0x41 ^ 0x6B);
        3 = "   ".length();
        80 = 0xA9 ^ 0x84 ^ (0x54 ^ 0x29);
        200 = 70 + 183 - 86 + 33;
        40 = 112 + 84 - 72 + 47 ^ 9 + 43 - -14 + 65;
        128 = 123 + 92 - 149 + 62;
        10 = 0x43 ^ 0x39 ^ (0xCE ^ 0xBE);
        16 = 0x23 ^ 0x15 ^ (0x81 ^ 0xA7);
        20 = 0x26 ^ 0x32;
        15 = 128 + 133 - 133 + 52 ^ 148 + 49 - 11 + 1;
        1 = " ".length();
        2 = "  ".length();
        25 = 88 + 19 - 17 + 71 ^ 30 + 100 - 99 + 153;
        4 = 7 + 131 - -5 + 31 ^ 117 + 113 - 155 + 95;
        15530985 = -(0xFFFF8E5F & 0x75B7) & (0xFFFFFFFF & 0xECFFFF);
        11 = 0xFD ^ 0x8F ^ (0x77 ^ 0xE);
        -7 = -(0x54 ^ 0x53);
        -3 = -"   ".length();
        17 = 0x7C ^ 0x6D;
        8 = 0x60 ^ 0x68;
        -2 = -"  ".length();
        5 = 0x55 ^ 0x50;
        -1 = -" ".length();
        6 = 6 + 18 - -72 + 50 ^ 36 + 142 - 171 + 141;
        18 = 0xAE ^ 0xA1 ^ (0x46 ^ 0x5B);
    }

        private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (Graphics graphics != null) {
        GameCanvas.hienThongBaoPopup(graphics);
        if (s.boolean_do((System.currentTimeMillis() / 100L - this.var_long_if, 5L != 0))) {
            GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.cfr_renamed_6, this.cfr_renamed_9, this.cfr_renamed_7, this.cfr_renamed_14, v_0.var_int_arr_for[0], v_0.var_int_arr_for[1], 0);
            if (s.cfr_renamed_1(((dj_0)this).cfr_renamed_3)) {
                v_0.cfr_renamed_1(this.cfr_renamed_6 + 1, this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 15 * dF.cfr_renamed_12 - 4), this.cfr_renamed_7 - 2, this.cfr_renamed_5, 15530985, graphics);
            }
            if ((this.dangChayAuto)) {
                var_cu_0_do.cfr_renamed_1(this.cfr_renamed_4, this.cfr_renamed_6 + this.cfr_renamed_7 / 2, this.cfr_renamed_9 + 4 + (this.cfr_renamed_14 - this.cfr_renamed_3) / 2 + this.var_java_util_Vector_if.size() * dF.var_byte_new / 2 + (this.cfr_renamed_14 - (4 + (this.cfr_renamed_14 - this.cfr_renamed_3) / 2 + this.var_java_util_Vector_if.size() * dF.var_byte_new / 2)) / 2, 0, 3, graphics);
            }
            if (s.boolean_int(this.cfr_renamed_13)) {
                fl_0 fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
                GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, fl_02.chuoiGiaTri, GameCanvas.cfr_renamed_15, this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 15 * dF.cfr_renamed_12 - 4) + this.cfr_renamed_5 / 2 - dF.var_byte_try / 2, 2);
                if ((this.cfr_renamed_13 > 1)) {
                    int n;
                    int n2;
                    int n3;
                    int n4 = GameCanvas.cfr_renamed_15 - this.cfr_renamed_8 / 2 - 11;
                    if ((GameCanvas.cfr_renamed_12 != 2)) {
                        n3 = dF.var_byte_try / 2;
                        if ("  ".length() <= -" ".length()) {
                            return;
                        }
                    } else {
                        n3 = 0;
                    }
                    int n5 = n3 + this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 15 * dF.cfr_renamed_12 - 4) + en.cfr_renamed_21 / 2 + 1;
                    if (s.boolean_do(GameCanvas.cfr_renamed_12, 1)) {
                        n2 = -7;
                        if ((37 + 63 - -22 + 18 ^ 28 + 50 - -25 + 33) == 0) {
                            return;
                        }
                    } else {
                        n2 = 0;
                    }
                    int n6 = n5 + n2;
                    if ((GameCanvas.cfr_renamed_12 == 0)) {
                        n = -3;
                        } else {
                        n = 0;
                    }
                    GameCanvas.var_fa_0_do.cfr_renamed_0(graphics, n4, n6 + n, 17 + this.cfr_renamed_8, this.soLuong / 3, this.cfr_renamed_21 / 3);
                }
                if (" ".length() == (0x83 ^ 0x87)) {
                    return;
                }
            } else if (s.cfr_renamed_1(((dj_0)this).cfr_renamed_3)) {
                GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, ((dj_0)this).cfr_renamed_3.chuoiGiaTri, GameCanvas.cfr_renamed_15, this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 15 * dF.cfr_renamed_12 - 4) + this.cfr_renamed_5 / 2 - dF.var_byte_try / 2, 2);
            }
            int n = 0;
            while (s.boolean_if(n, this.var_java_util_Vector_if.size())) {
                GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, (String)this.var_java_util_Vector_if.elementAt(n), GameCanvas.cfr_renamed_15, this.cfr_renamed_9 + 4 + (this.cfr_renamed_14 - this.cfr_renamed_3) / 2 - this.var_java_util_Vector_if.size() * dF.var_byte_new / 2 + n * dF.var_byte_new, 2);
                ++n;
                return;
            }
        }
    }

    static {
        s.cfr_renamed_0();
    }

    public final void cfr_renamed_6() {
        if ((this.dangChayAuto)) {
            this.cfr_renamed_4 += 1;
            if ((this.cfr_renamed_4 >= 8)) {
                this.cfr_renamed_4 = 0;
            }
            if (s.boolean_int(s.cfr_renamed_1((long)GameCanvas.int_do() - this.var_long_for, 30L))) {
                String string = "";
                int n = 0;
                while (s.boolean_if(n, this.var_java_util_Vector_if.size())) {
                    string = string + (String)this.var_java_util_Vector_if.elementAt(n) + " ";
                    ++n;
                    if ("   ".length() != 0) continue;
                    return;
                }
                GameCanvas.hienThongBaoPopup(string, -2, null);
            }
        }
        if (((this.soXu, -1L != null) != 0) && s.boolean_int((System.currentTimeMillis() / 100L - this.soXu, 0L != null))) {
            GameCanvas.var_boolean_arr_do[5] = 1;
        }
        if (s.boolean_int(this.soLuong)) {
            this.soLuong -= 1;
        }
        if (s.boolean_int(this.cfr_renamed_21)) {
            this.cfr_renamed_21 -= 1;
        }
        if ((GameCanvas.boolean_do(4))) {
            this.void_do(-1);
            this.soLuong = 5;
            if (-" ".length() == "   ".length()) {
                return;
            }
        } else if ((GameCanvas.boolean_do(6))) {
            this.void_do(1);
            this.cfr_renamed_21 = 5;
        }
        if ((GameCanvas.var_boolean_new)) {
            int n = 0;
            if ((this.var_java_util_Vector_do != null) && s.boolean_int(this.var_java_util_Vector_do.size())) {
                fl_0 fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
                n = GameCanvas.var_fz_0_try.cfr_renamed_1(fl_02.chuoiGiaTri) + 20;
                if ((0xE ^ 0x54 ^ (0x61 ^ 0x3F)) <= (("   ".length() ^ (0x53 ^ 0x43)) & (0xF ^ 0x7D ^ (0x36 ^ 0x57) ^ -" ".length()))) {
                    return;
                }
            } else if (s.cfr_renamed_1(((dj_0)this).cfr_renamed_3)) {
                n = GameCanvas.var_fz_0_try.cfr_renamed_1(((dj_0)this).cfr_renamed_3.chuoiGiaTri) + 20;
            }
            if (s.cfr_renamed_1(((dj_0)this).cfr_renamed_3) && s.cfr_renamed_0(GameCanvas.boolean_do(GameCanvas.cfr_renamed_15 - (n *= dF.cfr_renamed_12) / 2, this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 18 * dF.cfr_renamed_12 - 4), n, this.cfr_renamed_5) ? 1 : 0)) {
                GameCanvas.cfr_renamed_7();
                this.cfr_renamed_1(((dj_0)this).cfr_renamed_3);
                if ("  ".length() <= 0) {
                    return;
                }
            } else if (s.cfr_renamed_0(GameCanvas.boolean_do(this.cfr_renamed_6 + 1, this.cfr_renamed_9 + this.cfr_renamed_14 - (this.cfr_renamed_5 + 18 * dF.cfr_renamed_12 - 4), this.cfr_renamed_7 - 2, this.cfr_renamed_5) ? 1 : 0)) {
                int n2 = GameCanvas.cfr_renamed_15 - GameCanvas.var_int_try;
                if ((n2 > n / 2)) {
                    this.void_do(-1);
                    this.soLuong = 5;
                    if (((46 + 123 - 153 + 164 ^ 149 + 29 - 139 + 126) & (0xA ^ 0x15 ^ (0xCA ^ 0xC4) ^ -" ".length())) > 0) {
                        return;
                    }
                } else if (s.boolean_if(n2, -n / 2)) {
                    this.void_do(1);
                    this.cfr_renamed_21 = 5;
                }
            }
            GameCanvas.var_boolean_new = 0;
        }
        super.cfr_renamed_6();
    }

    private static int (long l, long l2 != 0) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

                private static boolean boolean_for(int n) {
        return n < 0;
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

    public s() {
        this.soLuongKhoa = 0;
        this.dangChayAuto = 0;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_13 = 0;
        this.soLuong = 0;
        this.cfr_renamed_21 = 0;
        this.cfr_renamed_8 = 0;
        this.var_int_if = dF.var_byte_new;
    }

            private void void_do(int n) {
        if (s.boolean_int(this.cfr_renamed_13)) {
            fl_0 fl_02;
            this.soLuongKhoa += n;
            if (s.boolean_for(this.soLuongKhoa)) {
                this.soLuongKhoa = this.cfr_renamed_13 - 1;
            }
            if ((this.soLuongKhoa >= this.cfr_renamed_13)) {
                this.soLuongKhoa = 0;
            }
            ((dj_0)this).cfr_renamed_3 = fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
        }
    }

        public final void (String object, fl_0 fl_02, Vector vector != 0) {
        if ((cs_0.dangChayAuto)) {
            cs_0.cfr_renamed_1().cfr_renamed_2();
        }
        this.cfr_renamed_5 = en.cfr_renamed_21;
        this.dangChayAuto = 0;
        this.chuoiGiaTri = object;
        ((dj_0)this).cfr_renamed_3 = fl_02;
        this.soLuongKhoa = 0;
        this.var_java_util_Vector_do = vector;
        if ((vector != null)) {
            ((dj_0)this).cfr_renamed_3 = object = (fl_0)vector.elementAt(this.soLuongKhoa);
            if ((object != null)) {
                ((dj_0)this).cfr_renamed_3.var_de_do = ((fl_0)object).var_de_do;
                ((dj_0)this).cfr_renamed_3.var_byte_do = ((fl_0)object).var_byte_do;
                ((dj_0)this).cfr_renamed_3.var_dF_do = ((fl_0)object).var_dF_do;
            }
            this.cfr_renamed_8 = 0;
            int n = 0;
            while (s.boolean_if(n, vector.size())) {
                fl_02 = (fl_0)vector.elementAt(n);
                if ((GameCanvas.var_fz_0_try.cfr_renamed_1(fl_02.chuoiGiaTri) > this.cfr_renamed_8)) {
                    int n2;
                    int n3 = GameCanvas.var_fz_0_try.cfr_renamed_1(fl_02.chuoiGiaTri);
                    if ((GameCanvas.var_boolean_try)) {
                        n2 = this.cfr_renamed_7 / 3;
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                    } else {
                        n2 = 0;
                    }
                    this.cfr_renamed_8 = n3 + n2;
                }
                ++n;
                if (-(0x42 ^ 0x38 ^ (0x45 ^ 0x3B)) <= 0) continue;
                return;
            }
            if ("  ".length() == 0) {
                return;
            }
        } else {
            this.var_long_if = System.currentTimeMillis() / 100L;
        }
        this.cfr_renamed_13 = 0;
        if ((this.var_java_util_Vector_do != null)) {
            this.cfr_renamed_13 = this.var_java_util_Vector_do.size();
        }
        this.cfr_renamed_4 = 0;
        this.soXu = -1L;
        this.cfr_renamed_1();
        GameCanvas.var_dj_0_do = GameCanvas.var_s_do;
    }

    public final void cfr_renamed_1() {
        this.cfr_renamed_7 = GameCanvas.soLuongKhoa - 80;
        if (s.boolean_if(GameCanvas.soLuongKhoa, 200)) {
            this.cfr_renamed_7 = GameCanvas.soLuongKhoa - 40;
            if ((GameCanvas.soLuongKhoa <= 128)) {
                this.cfr_renamed_7 = GameCanvas.soLuongKhoa - 10;
            }
        }
        if ((this.chuoiGiaTri.equals(MenuChinhAvatar.bZ))) {
            this.cfr_renamed_7 = GameCanvas.cfr_renamed_15;
        }
        this.var_java_util_Vector_if = GameCanvas.var_fz_0_if.java_util_Vector_do(this.chuoiGiaTri, this.cfr_renamed_7 - 16);
        this.cfr_renamed_14 = this.var_java_util_Vector_if.size() * this.var_int_if + 20;
        this.cfr_renamed_3 = 0;
        if (s.cfr_renamed_1(((dj_0)this).cfr_renamed_3)) {
            this.cfr_renamed_14 += this.cfr_renamed_5 + 15 * dF.cfr_renamed_12;
            this.cfr_renamed_3 += this.cfr_renamed_5 + 15 * dF.cfr_renamed_12;
        }
        if (s.boolean_if(this.cfr_renamed_14, this.cfr_renamed_5 * 3 + (dF.cfr_renamed_12 - 1) * 15)) {
            this.cfr_renamed_14 = this.cfr_renamed_5 * 3 + (dF.cfr_renamed_12 - 1) * 15;
        }
        this.cfr_renamed_6 = GameCanvas.cfr_renamed_15 - this.cfr_renamed_7 / 2;
        this.cfr_renamed_9 = GameCanvas.var_int_int - GameCanvas.this - this.cfr_renamed_14 - 10;
    }
}

