/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from U
 */
public final class u_0
extends e_0 {
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private int cfr_renamed_8;
    private boolean dangChayAuto = 0;
    private int cfr_renamed_12 = 0;
    private long soXu;
    public int soLuong;
    public int var_int_if;
    public int soLuongKhoa;
    private long var_long_if;
    private int cfr_renamed_11 = 0;
    private int cfr_renamed_18;
    private static int[] mangSoNguyen;
    private static u_0 var_u_0_do;
    public int cfr_renamed_4;
    private long var_long_for;
    public static cp var_cp_do;
    private int cfr_renamed_10;
    public static ep var_ep_do;
    private int cfr_renamed_17;
    private int cfr_renamed_13;
    private int cfr_renamed_30;
    private int cfr_renamed_22;
    private int cfr_renamed_19;
    private int cfr_renamed_20;
    private boolean coTrangThai = 0;
    private Vector var_java_util_Vector_do;

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    static {
        u_0.cfr_renamed_5();
    }

    private static boolean boolean_if(int n) {
        return n <= 0;
    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        block26: {
            block25: {
                var1_1.translate(0, this.cfr_renamed_2);
                if (!u_0.cfr_renamed_2((int)this.dangChayAuto)) break block25;
                var2_2 = var1_1;
                var3_4 = this;
                GameCanvas.cfr_renamed_1(var2_2);
                GameCanvas.var_gj_0_do.cfr_renamed_5(var2_2, var3_4.cfr_renamed_4, var3_4.soLuongKhoa, var3_4.var_int_if, var3_4.soLuong);
                var2_2.translate(var3_4.cfr_renamed_4 + bn_0.cfr_renamed_16 + 2, var3_4.soLuongKhoa + bn_0.cfr_renamed_16 + 2);
                var2_2.setClip(0, 0, var3_4.var_int_if - (bn_0.cfr_renamed_16 << 1) - 4, var3_4.cfr_renamed_18);
                var2_2.translate(-var3_4.cfr_renamed_30, 0);
                var4_6 = var3_4.cfr_renamed_30 / var3_4.cfr_renamed_18;
                if ((var4_6 < 0)) {
                    var4_6 = 0;
                }
                if (u_0.boolean_do(var5_8 = var4_6 + var3_4.var_int_if / var3_4.cfr_renamed_18 + 2, var3_4.cfr_renamed_12)) {
                    var5_8 = var3_4.cfr_renamed_12;
                }
                if (u_0.cfr_renamed_3((int)var3_4.var_boolean_new)) {
                    k.cfr_renamed_0(var2_2, var3_4.cfr_renamed_17 * var3_4.cfr_renamed_18, 0, var3_4.cfr_renamed_18, var3_4.cfr_renamed_18);
                }
                var6_10 = var4_6;
                if ("   ".length() == "   ".length()) ** GOTO lbl24
                return;
lbl-1000:
                // 1 sources

                {
                    ((ei)var3_4.var_java_util_Vector_do.elementAt(var6_10)).cfr_renamed_0(var2_2, var6_10 * var3_4.cfr_renamed_18 + var3_4.cfr_renamed_18 / 2, var3_4.cfr_renamed_18 / 2);
                    ++var6_10;
lbl24:
                    // 2 sources

                    ** while (!u_0.cfr_renamed_2((int)var6_10, (int)var5_8))
                }
lbl25:
                // 1 sources

                if (u_0.boolean_do(var3_4.cfr_renamed_17) && (var3_4.cfr_renamed_17 < var3_4.var_java_util_Vector_do.size())) {
                    var6_11 = (ei)var3_4.var_java_util_Vector_do.elementAt(var3_4.cfr_renamed_17);
                    var2_2.setClip(var3_4.cfr_renamed_30 - 50, -100, var3_4.cfr_renamed_30 + GameCanvas.var_int_byte + 100, var3_4.soLuong + 200);
                    var4_6 = var3_4.cfr_renamed_17 * var3_4.cfr_renamed_18 + var3_4.cfr_renamed_18 / 2;
                    if (u_0.boolean_do(var3_4.cfr_renamed_12 * var3_4.cfr_renamed_18 + (bn_0.cfr_renamed_16 << 1) + 10, GameCanvas.var_int_byte)) {
                        var7_13 = GameCanvas.var_ew_byte.cfr_renamed_0(var6_11.chuoiGiaTri) / 2;
                        if ((var4_6 - var7_13 < var3_4.cfr_renamed_30)) {
                            var4_6 = var3_4.cfr_renamed_30 + var7_13;
                            if ("   ".length() > "   ".length()) {
                                return;
                            }
                        } else if (u_0.boolean_do(var4_6 + var7_13, GameCanvas.var_int_byte + var3_4.cfr_renamed_30 - 15)) {
                            var4_6 = GameCanvas.var_int_byte + var3_4.cfr_renamed_30 - var7_13 - 15;
                        }
                    }
                    v0 = var6_11.chuoiGiaTri;
                    v1 = -bn_0.var_byte_try - bn_0.cfr_renamed_16 - 6;
                    if ((bn_0.cfr_renamed_6 == 2)) {
                        v2 = 15;
                        if ("  ".length() <= 0) {
                            return;
                        }
                    } else {
                        v2 = 0;
                    }
                    GameCanvas.var_ew_byte.cfr_renamed_0(var2_2, v0, var4_6, v1 - v2, 2);
                }
                GameCanvas.cfr_renamed_1(var2_2);
                if (((70 ^ 105) & ~(43 ^ 4)) >= " ".length()) {
                    return;
                }
                break block26;
            }
            var2_3 = var1_1;
            var3_5 = this;
            if (!(var3_5.cfr_renamed_12 != 0)) break block26;
            var2_3.translate(-var2_3.getTranslateX(), -var2_3.getTranslateY());
            var5_9 = var2_3;
            var4_7 = var3_5;
            GameCanvas.cfr_renamed_1(var5_9);
            if (u_0.cfr_renamed_2((int)t_0.dangChayAuto)) {
                GameCanvas.var_gj_0_do.cfr_renamed_3(var5_9, var4_7.cfr_renamed_4 - 2, var4_7.cfr_renamed_20 - 7, var4_7.var_int_if + 4, var4_7.soLuong + 15);
                if ("  ".length() > "  ".length()) {
                    return;
                }
            } else {
                GameCanvas.var_gj_0_do.cfr_renamed_5(var5_9, var4_7.cfr_renamed_4 - 2, var4_7.cfr_renamed_20 - 7, var4_7.var_int_if + 4, var4_7.soLuong + 15);
            }
            var5_9.setClip(var4_7.cfr_renamed_4, var4_7.cfr_renamed_20, var4_7.var_int_if, var4_7.soLuong);
            var5_9.translate(var4_7.cfr_renamed_4 + 3, var4_7.cfr_renamed_20 + 1);
            var5_9.translate(0, -var4_7.cfr_renamed_30);
            var6_12 = (var4_7.cfr_renamed_18 - bn_0.var_byte_new) / 2;
            var7_14 = 0;
            if ((113 ^ 117) != "   ".length()) ** GOTO lbl102
            return;
lbl-1000:
            // 1 sources

            {
                var5_9.setColor(0);
                if (u_0.cfr_renamed_3((int)var4_7.var_boolean_new) && (var7_14 == var4_7.cfr_renamed_17)) {
                    if (u_0.cfr_renamed_2((int)t_0.dangChayAuto)) {
                        var5_9.setColor(35217);
                        var5_9.fillRect(0, var7_14 * var4_7.cfr_renamed_18, var4_7.var_int_if - 6, var4_7.cfr_renamed_18);
                        if ("  ".length() > (30 + 86 - -25 + 44 ^ 154 + 185 - 170 + 20)) {
                            return;
                        }
                    } else {
                        GameCanvas.var_gj_0_do.cfr_renamed_3(var5_9, var7_14 * var4_7.cfr_renamed_18, var4_7.var_int_if - 6, var4_7.cfr_renamed_18);
                    }
                }
                if (u_0.cfr_renamed_2((int)t_0.dangChayAuto)) {
                    GameCanvas.var_ew_byte.cfr_renamed_0(var5_9, ((ei)var4_7.var_java_util_Vector_do.elementAt((int)var7_14)).chuoiGiaTri, 5, var7_14 * var4_7.cfr_renamed_18 + var6_12, 0);
                    if (" ".length() < " ".length()) {
                        return;
                    }
                } else {
                    GameCanvas.var_gj_0_do.cfr_renamed_0(var5_9, ((ei)var4_7.var_java_util_Vector_do.elementAt((int)var7_14)).chuoiGiaTri, 5, var7_14 * var4_7.cfr_renamed_18 + var6_12, 0);
                }
                ++var7_14;
lbl102:
                // 2 sources

                ** while (!u_0.cfr_renamed_2((int)var7_14, (int)var4_7.cfr_renamed_12))
            }
        }
        super.cfr_renamed_0(var1_1);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_4();
                return;
            }
            case 1: {
                this.dangChayAuto = 0;
                GameCanvas.var_e_0_do = null;
                if (!(var_cp_do != null)) break;
                var_cp_do.void_do();
            }
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

        private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    private void cfr_renamed_1() {
        if ((this.cfr_renamed_17 < 0)) {
            this.cfr_renamed_17 = 0;
        }
        if ((this.cfr_renamed_17 >= this.cfr_renamed_12)) {
            this.cfr_renamed_17 = 0;
        }
    }

    public final void void_for() {
        if ((this.cfr_renamed_2 != 0)) {
            this.cfr_renamed_2 += -this.cfr_renamed_2 >> 1;
        }
        if ((this.cfr_renamed_2 == -1)) {
            this.cfr_renamed_2 = 0;
        }
        u_0 u_02 = this;
        if ((u_02.cfr_renamed_10 != 0)) {
            if (!u_0.boolean_do(u_02.cfr_renamed_30) || u_0.boolean_do(u_02.cfr_renamed_30, u_02.cfr_renamed_8)) {
                u_02.cfr_renamed_10 -= u_02.cfr_renamed_10 / 4;
                u_02.cfr_renamed_30 += u_02.cfr_renamed_10 / 20;
                if ((u_02.cfr_renamed_10 / 10 <= 1)) {
                    u_02.cfr_renamed_10 = 0;
                }
            }
            if ((u_02.cfr_renamed_30 < 0)) {
                if ((u_02.cfr_renamed_30 < -u_02.cfr_renamed_22 / 2)) {
                    u_02.cfr_renamed_30 = -u_02.cfr_renamed_22 / 2;
                    u_02.cfr_renamed_13 = 0;
                    u_02.cfr_renamed_10 = 0;
                    if ((0x71 ^ 0x75) < " ".length()) {
                        return;
                    }
                }
            } else if (u_0.boolean_do(u_02.cfr_renamed_30, u_02.cfr_renamed_8)) {
                if ((u_02.cfr_renamed_30 < u_02.cfr_renamed_8 + u_02.cfr_renamed_22 / 2)) {
                    u_02.cfr_renamed_30 = u_02.cfr_renamed_8 + u_02.cfr_renamed_22 / 2;
                    u_02.cfr_renamed_13 = u_02.cfr_renamed_8;
                    u_02.cfr_renamed_10 = 0;
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                }
            } else {
                u_02.cfr_renamed_30 += u_02.cfr_renamed_10 / 10;
            }
            u_02.cfr_renamed_13 = u_02.cfr_renamed_30;
            u_02.cfr_renamed_10 -= u_02.cfr_renamed_10 / 10;
            if ((u_02.cfr_renamed_10 / 10 == 0)) {
                u_02.cfr_renamed_10 = 0;
                if (-" ".length() >= (88 + 116 - 141 + 109 ^ 23 + 138 - 3 + 10)) {
                    return;
                }
            }
        } else if ((u_02.cfr_renamed_30 < 0)) {
            u_02.cfr_renamed_13 = 0;
            } else if (u_0.boolean_do(u_02.cfr_renamed_30, u_02.cfr_renamed_8)) {
            u_02.cfr_renamed_13 = u_02.cfr_renamed_8;
        }
        if (u_0.boolean_if(u_02.cfr_renamed_30, u_02.cfr_renamed_13)) {
            u_02.cfr_renamed_19 = u_02.cfr_renamed_13 - u_02.cfr_renamed_30 << 2;
            u_02.cfr_renamed_5 += u_02.cfr_renamed_19;
            u_02.cfr_renamed_30 += u_02.cfr_renamed_5 >> 4;
            u_02.cfr_renamed_5 &= 15;
        }
        u_02 = this;
        if (u_0.boolean_do(u_02.cfr_renamed_20, u_02.soLuongKhoa)) {
            int n = u_02.cfr_renamed_20 - u_02.soLuongKhoa >> 2;
            if (u_0.boolean_if(n)) {
                n = 1;
            }
            u_02.cfr_renamed_20 -= n;
        }
        u_02.cfr_renamed_20 = u_02.soLuongKhoa;
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void a_() {
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            ((bn_0)this).cfr_renamed_4 = new ei(MenuChinhAvatar.dg, 0);
        }
        this.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, 1);
    }

    private void cfr_renamed_4() {
        this.dangChayAuto = 0;
        GameCanvas.var_e_0_do = null;
        ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_17);
        if ((ei2.var_bn_0_do != null)) {
            ei2.var_bn_0_do.void_if(ei2.var_byte_do);
            return;
        }
        if ((ei2.var_cp_do != null)) {
            ei2.var_cp_do.void_do();
            return;
        }
        GameCanvas.var_dL_do.void_if(ei2.var_byte_do, ei2.var_short_do);
    }

    public static u_0 cfr_renamed_0() {
        if ((var_u_0_do == null)) {
            var_u_0_do = new u_0();
            return var_u_0_do;
        }
        return var_u_0_do;
    }

        private static void cfr_renamed_5() {
        mangSoNguyen = new int[19];
        0 = (3 + 119 - -33 + 18 ^ 99 + 58 - 91 + 69) & (61 + 56 - -19 + 14 ^ 168 + 126 - 229 + 123 ^ -" ".length());
        1 = " ".length();
        4 = 0x14 ^ 0x71 ^ (0x23 ^ 0x42);
        2 = "  ".length();
        20 = 0x33 ^ 0x27;
        3 = "   ".length();
        5 = 0x46 ^ 0x71 ^ (0x16 ^ 0x24);
        200 = 103 + 175 - 155 + 53 + (12 + 17 - -41 + 68) - (206 + 174 - 218 + 57) + (0x23 ^ 0x4A);
        10 = 46 + 1 - -108 + 25 ^ 150 + 47 - 162 + 155;
        7 = 55 + 134 - 181 + 142 ^ 54 + 73 - 107 + 125;
        8 = 49 + 62 - 36 + 56 ^ 93 + 132 - 118 + 32;
        6 = 79 + 97 - 147 + 106 ^ 107 + 33 - 33 + 22;
        15 = 0x40 ^ 0x4F;
        40 = 0xED ^ 0xC5;
        50 = 0xF7 ^ 0xC3 ^ (0x2D ^ 0x2B);
        -100 = -(101 + 154 - 120 + 75 ^ 101 + 12 - 34 + 103);
        100 = 204 + 200 - 236 + 87 ^ 141 + 109 - 217 + 122;
        35217 = 0xFFFFEB95 & 0x9DFB;
        -1 = -" ".length();
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void (Vector vector, int n != null) {
        if ((vector.size() == 0)) {
            return;
        }
        if ((GameCanvas.cfr_renamed_16 > 0)) {
            this.var_boolean_new = 1;
        }
        this.cfr_renamed_18 = dL.cfr_renamed_20;
        this.cfr_renamed_2 = GameCanvas.var_int_char;
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_12 = this.var_java_util_Vector_do.size();
        this.var_int_if = this.soLuong = 0;
        int n2 = 0;
        while (!(n2 >= this.cfr_renamed_12)) {
            ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(n2);
            int n3 = GameCanvas.var_ew_try.cfr_renamed_0(ei2.chuoiGiaTri) + 20;
            if (u_0.boolean_do(n3, this.var_int_if)) {
                this.var_int_if = n3;
            }
            this.soLuong += this.cfr_renamed_18;
            ++n2;
        }
        if ((this.var_int_if < GameCanvas.var_int_byte / 3)) {
            this.var_int_if = GameCanvas.var_int_byte / 3;
        }
        if (u_0.boolean_do(this.var_int_if, GameCanvas.var_int_byte - 4)) {
            this.var_int_if = GameCanvas.var_int_byte - 4;
        }
        this.soLuong += 4;
        if ((n == 0)) {
            int n4;
            int n5 = 2;
            if ((GameCanvas.cfr_renamed_16 != 0)) {
                n4 = 2;
                } else {
                n4 = 1;
            }
            this.cfr_renamed_4 = n5 * n4;
            if ("  ".length() <= 0) {
                return;
            }
        } else if ((n == 1)) {
            this.cfr_renamed_4 = GameCanvas.var_int_byte - this.var_int_if - 2;
            } else {
            this.cfr_renamed_4 = (GameCanvas.var_int_byte >> 1) - (this.var_int_if >> 1);
        }
        if (u_0.boolean_do(this.cfr_renamed_12, 5)) {
            this.soLuong = dL.cfr_renamed_20 * 5 + 4;
        }
        this.soLuongKhoa = GameCanvas.var_int_char - this.soLuong - bn_0.cfr_renamed_16 - GameCanvas.var_int_else;
        if ((t_0.dangChayAuto)) {
            this.soLuongKhoa = GameCanvas.this - GameCanvas.var_int_else - this.soLuong - 5;
        }
        if ((GameCanvas.var_int_char < 200)) {
            this.soLuongKhoa += 10;
        }
        this.cfr_renamed_20 = GameCanvas.var_int_char - this.cfr_renamed_18;
        if ((GameCanvas.cfr_renamed_16 > 0)) {
            this.soLuongKhoa = GameCanvas.this - this.soLuong - bn_0.cfr_renamed_16 - 3;
            if ((GameCanvas.cfr_renamed_16 == 1)) {
                this.soLuongKhoa -= 7;
            }
            ((bn_0)this).cfr_renamed_4 = null;
        }
        this.dangChayAuto = 0;
        this.cfr_renamed_17 = 0;
        this.cfr_renamed_8 = (this.cfr_renamed_12 - 5) * this.cfr_renamed_18;
        if ((this.cfr_renamed_8 < 0)) {
            this.cfr_renamed_8 = 0;
        }
        this.cfr_renamed_13 = 0;
        this.cfr_renamed_30 = 0;
        if ((GameCanvas.var_boolean_int)) {
            GameCanvas.cfr_renamed_2();
        }
        var_cp_do = null;
        this.cfr_renamed_22 = this.soLuong;
        GameCanvas.var_e_0_do = this;
    }

            public u_0() {
        this.a_();
    }

        public final void (Vector vector, int n, int n2, int n3 != null) {
        if ((vector.size() == 0)) {
            return;
        }
        if ((GameCanvas.cfr_renamed_16 > 0)) {
            this.var_boolean_new = 1;
        }
        this.cfr_renamed_12 = vector.size();
        this.cfr_renamed_2 = GameCanvas.var_int_char;
        this.dangChayAuto = 1;
        this.var_int_if = this.cfr_renamed_12 * n2 + (bn_0.cfr_renamed_16 << 1) + 4;
        if (u_0.boolean_do(this.var_int_if, GameCanvas.var_int_byte)) {
            this.var_int_if = GameCanvas.var_int_byte;
        }
        this.cfr_renamed_4 = n - this.var_int_if / 2;
        this.soLuong = n3 + (bn_0.cfr_renamed_16 << 1) + 4;
        if ((this.cfr_renamed_4 < 0)) {
            this.cfr_renamed_4 = 0;
        }
        this.cfr_renamed_20 = this.soLuongKhoa = GameCanvas.this - GameCanvas.var_int_else - this.soLuong - (bn_0.cfr_renamed_16 << 1);
        this.cfr_renamed_18 = n3;
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_1();
        this.cfr_renamed_8 = this.cfr_renamed_12 * this.cfr_renamed_18 - (this.var_int_if - (bn_0.cfr_renamed_16 << 1) - 4);
        if ((this.cfr_renamed_8 < 0)) {
            this.cfr_renamed_8 = 0;
        }
        this.cfr_renamed_22 = this.var_int_if;
        var_cp_do = null;
        GameCanvas.var_e_0_do = this;
    }

            public final void cfr_renamed_15() {
        super.cfr_renamed_15();
        u_0 u_02 = this;
        ++u_02.var_long_for;
        int n = 0;
        if (!!(GameCanvas.boolean_do(2)) || (GameCanvas.boolean_do(4))) {
            n = 1;
            u_02.cfr_renamed_17 -= 1;
            if ((u_02.cfr_renamed_17 < 0)) {
                u_02.cfr_renamed_17 = u_02.cfr_renamed_12 - 1;
            }
            u_02.var_boolean_new = 0;
            if (((0x6B ^ 0x5B) & ~(0xB6 ^ 0x86)) > 0) {
                return;
            }
        } else if (!!(GameCanvas.boolean_do(8)) || (GameCanvas.boolean_do(6))) {
            n = 1;
            u_02.cfr_renamed_17 += 1;
            if (u_0.boolean_do(u_02.cfr_renamed_17, u_02.cfr_renamed_12 - 1)) {
                u_02.cfr_renamed_17 = 0;
            }
            u_02.var_boolean_new = 0;
        }
        if ((GameCanvas.coKichHoat) && (GameCanvas.boolean_do(u_02.cfr_renamed_4 - 2, u_02.cfr_renamed_20 - 7, u_02.var_int_if + 4, u_02.soLuong + 15))) {
            GameCanvas.coKichHoat = 0;
            u_02.cfr_renamed_11 = u_02.cfr_renamed_30;
            u_02.var_long_if = System.currentTimeMillis() / 10L;
            u_02.coTrangThai = 1;
        }
        if ((u_02.coTrangThai)) {
            int n2;
            int n3;
            int n4 = GameCanvas.int_for();
            if ((u_02.dangChayAuto)) {
                n4 = GameCanvas.int_do();
            }
            long l = System.currentTimeMillis() / 10L - u_02.var_long_if;
            if ((GameCanvas.var_boolean_try)) {
                if ((GameCanvas.var_int_try % 3 == 0)) {
                    u_02.cfr_renamed_15 = GameCanvas.var_int_if;
                    u_02.soXu = u_02.var_long_for;
                }
                u_02.cfr_renamed_10 = 0;
                if ((Math.abs(n4) < 20 * bn_0.cfr_renamed_6)) {
                    n3 = u_02.cfr_renamed_20;
                    n2 = (u_02.cfr_renamed_13 + GameCanvas.var_int_if - n3) / u_02.cfr_renamed_18;
                    if ((u_02.dangChayAuto)) {
                        n3 = u_02.cfr_renamed_4;
                        n2 = (u_02.cfr_renamed_13 + GameCanvas.soLuongKhoa - n3) / u_02.cfr_renamed_18;
                    }
                    u_02.cfr_renamed_17 = n2;
                    u_02.cfr_renamed_1();
                }
                if ((gc_0.int_if(n4) >= 20 * bn_0.cfr_renamed_6)) {
                    u_02.var_boolean_new = 1;
                    if (-(0xE7 ^ 0x9C ^ 67 + 94 - 121 + 87) >= 0) {
                        return;
                    }
                } else if (((l, 10L != null) > 0) && ((l, 20L != null) < 0)) {
                    u_02.var_boolean_new = 0;
                }
                u_02.cfr_renamed_13 = u_02.cfr_renamed_11 + n4;
                if (!u_0.boolean_do(u_02.cfr_renamed_13) || u_0.boolean_do(u_02.cfr_renamed_13, u_02.cfr_renamed_8)) {
                    u_02.cfr_renamed_13 = u_02.cfr_renamed_11 + n4 / 3;
                }
                u_02.cfr_renamed_30 = u_02.cfr_renamed_13;
            }
            if ((GameCanvas.var_boolean_new) && (GameCanvas.boolean_do(u_02.cfr_renamed_4 - 2, u_02.cfr_renamed_20 - 7, u_02.var_int_if + 4, u_02.soLuong + 15))) {
                n3 = (int)(u_02.var_long_for - u_02.soXu);
                n2 = u_02.cfr_renamed_15 - GameCanvas.var_int_if;
                if (u_0.boolean_do(gc_0.int_if(n2), 40) && (n3 < 10) && (u_02.cfr_renamed_13 > 0) && (u_02.cfr_renamed_13 < u_02.cfr_renamed_8)) {
                    u_02.cfr_renamed_10 = n2 / n3 * 10;
                }
                u_02.soXu = -1L;
                if ((Math.abs(n4) < 20 * bn_0.cfr_renamed_6)) {
                    if (u_0.boolean_if((l, 10L != null))) {
                        u_02.var_boolean_new = 0;
                    }
                    if (!(u_02.var_boolean_new)) {
                        n4 = u_02.cfr_renamed_20;
                        n4 = (u_02.cfr_renamed_13 + GameCanvas.var_int_if - n4) / u_02.cfr_renamed_18;
                        if ((u_02.dangChayAuto)) {
                            n4 = u_02.cfr_renamed_4;
                            n4 = (u_02.cfr_renamed_13 + GameCanvas.soLuongKhoa - n4) / u_02.cfr_renamed_18;
                        }
                        u_02.cfr_renamed_17 = n4;
                        u_02.cfr_renamed_1();
                        u_02.cfr_renamed_4();
                    }
                }
                GameCanvas.var_boolean_new = 0;
            }
        }
        if ((GameCanvas.var_boolean_new)) {
            if (!(u_02.coTrangThai)) {
                u_02.dangChayAuto = 0;
                GameCanvas.var_e_0_do = null;
                if ((var_cp_do != null)) {
                    var_cp_do.void_do();
                }
            }
            u_02.coTrangThai = 0;
            GameCanvas.var_boolean_new = 0;
        }
        if ((n != 0)) {
            u_02.cfr_renamed_13 = u_02.cfr_renamed_17 * u_02.cfr_renamed_18 - u_02.var_int_if / 2 + u_02.cfr_renamed_18 / 2;
            if (u_0.boolean_do(u_02.cfr_renamed_13, u_02.cfr_renamed_8)) {
                u_02.cfr_renamed_13 = u_02.cfr_renamed_8;
                return;
            }
            if ((u_02.cfr_renamed_13 < 0)) {
                u_02.cfr_renamed_13 = 0;
            }
        }
    }
}

