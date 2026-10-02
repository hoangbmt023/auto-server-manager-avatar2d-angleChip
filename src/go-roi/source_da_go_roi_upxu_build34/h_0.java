/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from h
 */
public final class h_0
extends bt_0 {
    private int soLuong;
    private int var_int_if;
    private int soLuongKhoa;
    private int cfr_renamed_4;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private long soXu;
    public static ep var_ep_do;
    private Vector var_java_util_Vector_do = new Vector();
    private long var_long_if = -1L;
    public boolean dangChayAuto;
    private int cfr_renamed_8 = 0;
    private long var_long_for;
    private int cfr_renamed_12;
    private int cfr_renamed_11;
    private int cfr_renamed_18;
    private int cfr_renamed_10;
    private int cfr_renamed_17;
    private String chuoiGiaTri = "";
    private Vector var_java_util_Vector_if;

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    public final void cfr_renamed_15() {
        if ((this.dangChayAuto)) {
            this.cfr_renamed_12 += 1;
            if ((this.cfr_renamed_12 >= 8)) {
                this.cfr_renamed_12 = 0;
            }
            if (h_0.boolean_do(h_0.cfr_renamed_0((long)GameCanvas.int_if() - this.soXu, 30L))) {
                String string = "";
                int n = 0;
                while ((n < this.var_java_util_Vector_if.size())) {
                    string = string + (String)this.var_java_util_Vector_if.elementAt(n) + " ";
                    ++n;
                    if ("  ".length() >= 0) continue;
                    return;
                }
                GameCanvas.hienThongBaoPopup(string, -2, null);
            }
        }
        if (h_0.cfr_renamed_4((this.var_long_if, -1L != null)) && h_0.boolean_do((System.currentTimeMillis() / 100L - this.var_long_if, 0L != null))) {
            GameCanvas.var_boolean_arr_do[5] = 1;
        }
        if (h_0.boolean_do(this.cfr_renamed_15)) {
            this.cfr_renamed_15 -= 1;
        }
        if (h_0.boolean_do(this.soLuongKhoa)) {
            this.soLuongKhoa -= 1;
        }
        if ((GameCanvas.boolean_do(4))) {
            this.void_for(-1);
            this.cfr_renamed_15 = 5;
            if ((51 + 172 - 197 + 149 ^ 32 + 110 - 28 + 57) == -" ".length()) {
                return;
            }
        } else if ((GameCanvas.boolean_do(6))) {
            this.void_for(1);
            this.soLuongKhoa = 5;
        }
        if ((GameCanvas.var_boolean_new)) {
            int n = 0;
            if ((this.var_java_util_Vector_do != null) && h_0.boolean_do(this.var_java_util_Vector_do.size())) {
                ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_8);
                n = GameCanvas.var_ew_try.cfr_renamed_0(ei2.chuoiGiaTri) + 20;
                if ((0x68 ^ 0x6C) < 0) {
                    return;
                }
            } else if (h_0.cfr_renamed_0(((bt_0)this).cfr_renamed_5)) {
                n = GameCanvas.var_ew_try.cfr_renamed_0(((bt_0)this).cfr_renamed_5.chuoiGiaTri) + 20;
            }
            if (h_0.cfr_renamed_0(((bt_0)this).cfr_renamed_5) && h_0.cfr_renamed_4(GameCanvas.boolean_if(GameCanvas.var_int_int - (n *= bn_0.cfr_renamed_6) / 2, this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 18 * bn_0.cfr_renamed_6 - 4), n, this.var_int_if) ? 1 : 0)) {
                GameCanvas.cfr_renamed_8();
                this.cfr_renamed_0(((bt_0)this).cfr_renamed_5);
                if ((0xC6 ^ 0xC2) == 0) {
                    return;
                }
            } else if (h_0.cfr_renamed_4(GameCanvas.boolean_if(this.soLuong + 1, this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 18 * bn_0.cfr_renamed_6 - 4), this.cfr_renamed_5 - 2, this.var_int_if) ? 1 : 0)) {
                int n2 = GameCanvas.var_int_int - GameCanvas.soLuongKhoa;
                if (h_0.boolean_do(n2, n / 2)) {
                    this.void_for(-1);
                    this.cfr_renamed_15 = 5;
                    if ("   ".length() == ((0x71 ^ 0x65) & ~(0xE ^ 0x1A))) {
                        return;
                    }
                } else if ((n2 < -n / 2)) {
                    this.void_for(1);
                    this.soLuongKhoa = 5;
                }
            }
            GameCanvas.var_boolean_new = 0;
        }
        super.cfr_renamed_15();
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (String object, ei ei2, Vector vector != null) {
        if ((ce.dangChayAuto)) {
            ce.cfr_renamed_0().cfr_renamed_4();
        }
        this.var_int_if = dL.cfr_renamed_20;
        this.dangChayAuto = 0;
        this.chuoiGiaTri = object;
        ((bt_0)this).cfr_renamed_5 = ei2;
        this.cfr_renamed_8 = 0;
        this.var_java_util_Vector_do = vector;
        if ((vector != null)) {
            ((bt_0)this).cfr_renamed_5 = object = (ei)vector.elementAt(this.cfr_renamed_8);
            if ((object != null)) {
                ((bt_0)this).cfr_renamed_5.var_cp_do = ((ei)object).var_cp_do;
                ((bt_0)this).cfr_renamed_5.var_byte_do = ((ei)object).var_byte_do;
                ((bt_0)this).cfr_renamed_5.var_bn_0_do = ((ei)object).var_bn_0_do;
            }
            this.cfr_renamed_10 = 0;
            int n = 0;
            while ((n < vector.size())) {
                ei2 = (ei)vector.elementAt(n);
                if (h_0.boolean_do(GameCanvas.var_ew_try.cfr_renamed_0(ei2.chuoiGiaTri), this.cfr_renamed_10)) {
                    int n2;
                    int n3 = GameCanvas.var_ew_try.cfr_renamed_0(ei2.chuoiGiaTri);
                    if ((GameCanvas.coTrangThai)) {
                        n2 = this.cfr_renamed_5 / 3;
                        if (-" ".length() > 0) {
                            return;
                        }
                    } else {
                        n2 = 0;
                    }
                    this.cfr_renamed_10 = n3 + n2;
                }
                ++n;
                if ((0x70 ^ 0x74) > "   ".length()) continue;
                return;
            }
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            this.var_long_for = System.currentTimeMillis() / 100L;
        }
        this.cfr_renamed_17 = 0;
        if ((this.var_java_util_Vector_do != null)) {
            this.cfr_renamed_17 = this.var_java_util_Vector_do.size();
        }
        this.cfr_renamed_12 = 0;
        this.var_long_if = -1L;
        this.cfr_renamed_0();
        GameCanvas.var_bt_0_do = GameCanvas.var_h_0_do;
    }

    private void void_for(int n) {
        if (h_0.boolean_do(this.cfr_renamed_17)) {
            ei ei2;
            this.cfr_renamed_8 += n;
            if (h_0.boolean_for(this.cfr_renamed_8)) {
                this.cfr_renamed_8 = this.cfr_renamed_17 - 1;
            }
            if ((this.cfr_renamed_8 >= this.cfr_renamed_17)) {
                this.cfr_renamed_8 = 0;
            }
            ((bt_0)this).cfr_renamed_5 = ei2 = (ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_8);
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

    public final void cfr_renamed_0() {
        this.cfr_renamed_5 = GameCanvas.var_int_byte - 80;
        if ((GameCanvas.var_int_byte < 200)) {
            this.cfr_renamed_5 = GameCanvas.var_int_byte - 40;
            if (h_0.boolean_if(GameCanvas.var_int_byte, 128)) {
                this.cfr_renamed_5 = GameCanvas.var_int_byte - 10;
            }
        }
        if ((this.chuoiGiaTri.equals(MenuChinhAvatar.cT))) {
            this.cfr_renamed_5 = GameCanvas.var_int_int;
        }
        this.var_java_util_Vector_if = GameCanvas.var_ew_if.java_util_Vector_do(this.chuoiGiaTri, this.cfr_renamed_5 - 16);
        this.cfr_renamed_18 = this.var_java_util_Vector_if.size() * this.cfr_renamed_4 + 20;
        this.cfr_renamed_11 = 0;
        if (h_0.cfr_renamed_0(((bt_0)this).cfr_renamed_5)) {
            this.cfr_renamed_18 += this.var_int_if + 15 * bn_0.cfr_renamed_6;
            this.cfr_renamed_11 += this.var_int_if + 15 * bn_0.cfr_renamed_6;
        }
        if ((this.cfr_renamed_18 < this.var_int_if * 3 + (bn_0.cfr_renamed_6 - 1) * 15)) {
            this.cfr_renamed_18 = this.var_int_if * 3 + (bn_0.cfr_renamed_6 - 1) * 15;
        }
        this.soLuong = GameCanvas.var_int_int - this.cfr_renamed_5 / 2;
        this.cfr_renamed_2 = GameCanvas.this - GameCanvas.var_int_else - this.cfr_renamed_18 - 10;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[25];
        0 = (0x5E ^ 0x39 ^ (0xC4 ^ 0x9E)) & (0xA8 ^ 0xAE ^ (0x7D ^ 0x46) ^ -" ".length());
        3 = "   ".length();
        80 = 0xC0 ^ 0x90;
        200 = 81 + 187 - 242 + 174;
        40 = 173 + 77 - 195 + 182 ^ 19 + 183 - 184 + 179;
        128 = 108 + 38 - 101 + 83;
        10 = 0xB9 ^ 0xB3;
        16 = 0x71 ^ 0x3F ^ (0x58 ^ 6);
        20 = 0x60 ^ 0x74;
        15 = 0x45 ^ 0x4A;
        1 = " ".length();
        2 = "  ".length();
        25 = 0x2A ^ 0x33;
        4 = 0x9E ^ 0x9A;
        15530985 = 0xFFFFFFFD & 0xECFBEB;
        11 = 117 + 191 - 194 + 86 ^ 158 + 48 - 106 + 95;
        -7 = -(0x5A ^ 0x5D);
        -3 = -"   ".length();
        17 = 0x13 ^ 0x67 ^ (0xE ^ 0x6B);
        8 = 0x90 ^ 0x98;
        -2 = -"  ".length();
        5 = 0xC2 ^ 0xC7;
        -1 = -" ".length();
        6 = 126 + 98 - 89 + 44 ^ 21 + 124 - -10 + 26;
        18 = 0x8D ^ 0x9F;
    }

        public final void void_do(int n, int n2) {
        switch (n) {
            case -2: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_6();
                return;
            }
            case -1: {
                this.dangChayAuto = 0;
                GameCanvas.var_bt_0_do = null;
                return;
            }
        }
        GameCanvas.var_dL_do.void_do(n, n2);
    }

    public final void (Graphics graphics != null) {
        GameCanvas.cfr_renamed_1(graphics);
        if (h_0.boolean_if(h_0.cfr_renamed_1(System.currentTimeMillis() / 100L - this.var_long_for, 5L))) {
            GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.soLuong, this.cfr_renamed_2, this.cfr_renamed_5, this.cfr_renamed_18, k.mangSoNguyen[0], k.mangSoNguyen[1], 0);
            if (h_0.cfr_renamed_0(((bt_0)this).cfr_renamed_5)) {
                k.cfr_renamed_0(this.soLuong + 1, this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 15 * bn_0.cfr_renamed_6 - 4), this.cfr_renamed_5 - 2, this.var_int_if, 15530985, graphics);
            }
            if ((this.dangChayAuto)) {
                var_ep_do.cfr_renamed_0(this.cfr_renamed_12, this.soLuong + this.cfr_renamed_5 / 2, this.cfr_renamed_2 + 4 + (this.cfr_renamed_18 - this.cfr_renamed_11) / 2 + this.var_java_util_Vector_if.size() * bn_0.cfr_renamed_15 / 2 + (this.cfr_renamed_18 - (4 + (this.cfr_renamed_18 - this.cfr_renamed_11) / 2 + this.var_java_util_Vector_if.size() * bn_0.cfr_renamed_15 / 2)) / 2, 0, 3, graphics);
            }
            if (h_0.boolean_do(this.cfr_renamed_17)) {
                ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_8);
                GameCanvas.var_ew_try.cfr_renamed_0(graphics, ei2.chuoiGiaTri, GameCanvas.var_int_int, this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 15 * bn_0.cfr_renamed_6 - 4) + this.var_int_if / 2 - bn_0.var_byte_new / 2, 2);
                if (h_0.boolean_do(this.cfr_renamed_17, 1)) {
                    int n;
                    int n2;
                    int n3;
                    int n4 = GameCanvas.var_int_int - this.cfr_renamed_10 / 2 - 11;
                    if ((GameCanvas.cfr_renamed_16 != 2)) {
                        n3 = bn_0.var_byte_new / 2;
                        if ((109 + 19 - 40 + 44 ^ 85 + 104 - 144 + 83) <= 0) {
                            return;
                        }
                    } else {
                        n3 = 0;
                    }
                    int n5 = n3 + this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 15 * bn_0.cfr_renamed_6 - 4) + dL.cfr_renamed_20 / 2 + 1;
                    if ((GameCanvas.cfr_renamed_16 == 1)) {
                        n2 = -7;
                        if ((0xBA ^ 0xBE) > (0x4D ^ 0x49)) {
                            return;
                        }
                    } else {
                        n2 = 0;
                    }
                    int n6 = n5 + n2;
                    if ((GameCanvas.cfr_renamed_16 == 0)) {
                        n = -3;
                        if (((0x15 ^ 0x28) & ~(0xB1 ^ 0x8C)) != 0) {
                            return;
                        }
                    } else {
                        n = 0;
                    }
                    GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, n4, n6 + n, 17 + this.cfr_renamed_10, this.cfr_renamed_15 / 3, this.soLuongKhoa / 3);
                }
                if ((0x2A ^ 4 ^ (0x1C ^ 0x36)) < 0) {
                    return;
                }
            } else if (h_0.cfr_renamed_0(((bt_0)this).cfr_renamed_5)) {
                GameCanvas.var_ew_try.cfr_renamed_0(graphics, ((bt_0)this).cfr_renamed_5.chuoiGiaTri, GameCanvas.var_int_int, this.cfr_renamed_2 + this.cfr_renamed_18 - (this.var_int_if + 15 * bn_0.cfr_renamed_6 - 4) + this.var_int_if / 2 - bn_0.var_byte_new / 2, 2);
            }
            int n = 0;
            while ((n < this.var_java_util_Vector_if.size())) {
                GameCanvas.var_ew_if.cfr_renamed_0(graphics, (String)this.var_java_util_Vector_if.elementAt(n), GameCanvas.var_int_int, this.cfr_renamed_2 + 4 + (this.cfr_renamed_18 - this.cfr_renamed_11) / 2 - this.var_java_util_Vector_if.size() * bn_0.cfr_renamed_15 / 2 + n * bn_0.cfr_renamed_15, 2);
                ++n;
                if (-"   ".length() < 0) continue;
                return;
            }
        }
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    public h_0() {
        this.dangChayAuto = 0;
        this.cfr_renamed_12 = 0;
        this.cfr_renamed_17 = 0;
        this.cfr_renamed_15 = 0;
        this.soLuongKhoa = 0;
        this.cfr_renamed_10 = 0;
        this.cfr_renamed_4 = bn_0.cfr_renamed_15;
    }

        private static int cfr_renamed_1(long l, long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static boolean boolean_for(int n) {
        return n < 0;
    }

            public final void cfr_renamed_1(String string, ei ei2, Vector vector) {
        if ((TienIchGame.boolean_if(string))) {
            return;
        }
        this.cfr_renamed_0(string, ei2, vector);
    }

        static {
        h_0.cfr_renamed_1();
    }

        public final void (boolean bl != null) {
        this.dangChayAuto = bl;
        this.cfr_renamed_18 = this.var_java_util_Vector_if.size() * this.cfr_renamed_4 + 20;
        if ((this.dangChayAuto)) {
            this.cfr_renamed_18 += 25 * bn_0.cfr_renamed_6 + 4;
            this.cfr_renamed_11 += 25 * bn_0.cfr_renamed_6 + 4;
        }
        if (h_0.cfr_renamed_3(this.cfr_renamed_18, (bl = this.var_int_if * 3 + (bn_0.cfr_renamed_6 - 1) * 15) ? 1 : 0)) {
            this.cfr_renamed_18 = bl ? 1 : 0;
        }
        this.cfr_renamed_2 = GameCanvas.this - GameCanvas.var_int_else - this.cfr_renamed_18 - 10;
        this.soXu = GameCanvas.int_if();
    }
}

