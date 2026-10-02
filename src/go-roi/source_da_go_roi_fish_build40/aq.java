/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class aq
extends aa {
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private boolean dangChayAuto;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    public static de var_de_do;
    private static int[] mangSoNguyen;
    public int soLuong;
    public int var_int_if;
    private static aq var_aq_do;
    private Vector var_java_util_Vector_do;
    public int soLuongKhoa;
    public static cu_0 var_cu_0_do;
    private long soXu;
    private boolean coTrangThai = 0;
    private int cfr_renamed_8;
    private int cfr_renamed_13;
    private long var_long_if;
    private int cfr_renamed_9;
    private int cfr_renamed_14;
    private int cfr_renamed_21;
    private int cfr_renamed_10;
    private long var_long_for;
    private int cfr_renamed_18;
    public int cfr_renamed_3;
    private int cfr_renamed_30;
    private int cfr_renamed_20;
    private int cfr_renamed_16;

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

        private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static aq cfr_renamed_1() {
        if ((var_aq_do == null)) {
            var_aq_do = new aq();
            return var_aq_do;
        }
        return var_aq_do;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Vector var1_1, int var2_3 == null) {
        if ((var1_1.size() != null)) {
            return;
        }
        if (aq.boolean_int(GameCanvas.cfr_renamed_12)) {
            this.var_boolean_new = 1;
        }
        this.cfr_renamed_16 = en.cfr_renamed_21;
        this.cfr_renamed_30 = GameCanvas.var_int_case;
        this.var_java_util_Vector_do = var1_1;
        this.cfr_renamed_7 = this.var_java_util_Vector_do.size();
        this.var_int_if = this.soLuong = 0;
        var1_2 = 0;
        if (" ".length() < "  ".length()) ** GOTO lbl21
        return;
lbl-1000:
        // 1 sources

        {
            var3_5 = (fl_0)this.var_java_util_Vector_do.elementAt(var1_2);
            var3_4 = GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5.chuoiGiaTri) + 20;
            if ((var3_4 > this.var_int_if)) {
                this.var_int_if = var3_4;
            }
            this.soLuong += this.cfr_renamed_16;
            ++var1_2;
lbl21:
            // 2 sources

            ** while (!aq.cfr_renamed_4((int)var1_2, (int)this.cfr_renamed_7))
        }
lbl22:
        // 1 sources

        if (aq.boolean_if(this.var_int_if, GameCanvas.soLuongKhoa / 3)) {
            this.var_int_if = GameCanvas.soLuongKhoa / 3;
        }
        if ((this.var_int_if > GameCanvas.soLuongKhoa - 4)) {
            this.var_int_if = GameCanvas.soLuongKhoa - 4;
        }
        this.soLuong += 4;
        if ((var2_3 != null)) {
            v0 = 2;
            if (aq.boolean_for(GameCanvas.cfr_renamed_12)) {
                v1 = 2;
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                v1 = 1;
            }
            this.cfr_renamed_3 = v0 * v1;
            if (-(10 ^ 24 ^ (171 ^ 189)) > 0) {
                return;
            }
        } else if ((var2_3 == 1)) {
            this.cfr_renamed_3 = GameCanvas.soLuongKhoa - this.var_int_if - 2;
            if ((93 ^ 8 ^ (43 ^ 123)) <= 0) {
                return;
            }
        } else {
            this.cfr_renamed_3 = (GameCanvas.soLuongKhoa >> 1) - (this.var_int_if >> 1);
        }
        if ((this.cfr_renamed_7 > 5)) {
            this.soLuong = en.cfr_renamed_21 * 5 + 4;
        }
        this.soLuongKhoa = GameCanvas.var_int_case - this.soLuong - dF.cfr_renamed_15 - GameCanvas.this;
        if (aq.boolean_for((int)al_0.dangChayAuto)) {
            this.soLuongKhoa = GameCanvas.var_int_int - GameCanvas.this - this.soLuong - 5;
        }
        if (aq.boolean_if(GameCanvas.var_int_case, 200)) {
            this.soLuongKhoa += 10;
        }
        this.cfr_renamed_10 = GameCanvas.var_int_case - this.cfr_renamed_16;
        if (aq.boolean_int(GameCanvas.cfr_renamed_12)) {
            this.soLuongKhoa = GameCanvas.var_int_int - this.soLuong - dF.cfr_renamed_15 - 3;
            if ((GameCanvas.cfr_renamed_12 == 1)) {
                this.soLuongKhoa -= 7;
            }
            this.var_fl_0_try = null;
        }
        this.coTrangThai = 0;
        this.cfr_renamed_8 = 0;
        this.cfr_renamed_18 = (this.cfr_renamed_7 - 5) * this.cfr_renamed_16;
        if ((this.cfr_renamed_18 < 0)) {
            this.cfr_renamed_18 = 0;
        }
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_13 = 0;
        if (aq.boolean_for((int)GameCanvas.dangChayAuto)) {
            GameCanvas.cfr_renamed_5();
        }
        aq.var_de_do = null;
        this.cfr_renamed_20 = this.soLuong;
        GameCanvas.var_aa_do = this;
    }

    private void cfr_renamed_0() {
        if ((this.cfr_renamed_8 < 0)) {
            this.cfr_renamed_8 = 0;
        }
        if ((this.cfr_renamed_8 >= this.cfr_renamed_7)) {
            this.cfr_renamed_8 = 0;
        }
    }

        public final void b_() {
        if ((GameCanvas.cfr_renamed_12 != null)) {
            this.var_fl_0_try = new fl_0(MenuChinhAvatar.cT, 0);
        }
        this.var_fl_0_new = new fl_0(MenuChinhAvatar.by, 1);
    }

        public final void cfr_renamed_7() {
        if (aq.boolean_for(this.cfr_renamed_30)) {
            this.cfr_renamed_30 += -this.cfr_renamed_30 >> 1;
        }
        if ((this.cfr_renamed_30 == -1)) {
            this.cfr_renamed_30 = 0;
        }
        aq aq2 = this;
        if (aq.boolean_for(aq2.cfr_renamed_9)) {
            if (!(aq2.cfr_renamed_13 >= 0) || (aq2.cfr_renamed_13 > aq2.cfr_renamed_18)) {
                aq2.cfr_renamed_9 -= aq2.cfr_renamed_9 / 4;
                aq2.cfr_renamed_13 += aq2.cfr_renamed_9 / 20;
                if ((aq2.cfr_renamed_9 / 10 <= 1)) {
                    aq2.cfr_renamed_9 = 0;
                }
            }
            if ((aq2.cfr_renamed_13 < 0)) {
                if (aq.boolean_if(aq2.cfr_renamed_13, -aq2.cfr_renamed_20 / 2)) {
                    aq2.cfr_renamed_13 = -aq2.cfr_renamed_20 / 2;
                    aq2.cfr_renamed_4 = 0;
                    aq2.cfr_renamed_9 = 0;
                    if ("  ".length() == 0) {
                        return;
                    }
                }
            } else if ((aq2.cfr_renamed_13 > aq2.cfr_renamed_18)) {
                if (aq.boolean_if(aq2.cfr_renamed_13, aq2.cfr_renamed_18 + aq2.cfr_renamed_20 / 2)) {
                    aq2.cfr_renamed_13 = aq2.cfr_renamed_18 + aq2.cfr_renamed_20 / 2;
                    aq2.cfr_renamed_4 = aq2.cfr_renamed_18;
                    aq2.cfr_renamed_9 = 0;
                    if (((0x8E ^ 0x9E) & ~(0x57 ^ 0x47)) >= " ".length()) {
                        return;
                    }
                }
            } else {
                aq2.cfr_renamed_13 += aq2.cfr_renamed_9 / 10;
            }
            aq2.cfr_renamed_4 = aq2.cfr_renamed_13;
            aq2.cfr_renamed_9 -= aq2.cfr_renamed_9 / 10;
            if ((aq2.cfr_renamed_9 / 10 != null)) {
                aq2.cfr_renamed_9 = 0;
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        } else if ((aq2.cfr_renamed_13 < 0)) {
            aq2.cfr_renamed_4 = 0;
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else if ((aq2.cfr_renamed_13 > aq2.cfr_renamed_18)) {
            aq2.cfr_renamed_4 = aq2.cfr_renamed_18;
        }
        if (aq.boolean_do(aq2.cfr_renamed_13, aq2.cfr_renamed_4)) {
            aq2.cfr_renamed_5 = aq2.cfr_renamed_4 - aq2.cfr_renamed_13 << 2;
            aq2.cfr_renamed_6 += aq2.cfr_renamed_5;
            aq2.cfr_renamed_13 += aq2.cfr_renamed_6 >> 4;
            aq2.cfr_renamed_6 &= 15;
        }
        aq2 = this;
        if ((aq2.cfr_renamed_10 > aq2.soLuongKhoa)) {
            int n = aq2.cfr_renamed_10 - aq2.soLuongKhoa >> 2;
            if ((n == null)) {
                n = 1;
            }
            aq2.cfr_renamed_10 -= n;
        }
        aq2.cfr_renamed_10 = aq2.soLuongKhoa;
    }

    public final void (Vector vector, int n, int n2, int n3 == null) {
        if ((vector.size() != null)) {
            return;
        }
        if (aq.boolean_int(GameCanvas.cfr_renamed_12)) {
            this.var_boolean_new = 1;
        }
        this.cfr_renamed_7 = vector.size();
        this.cfr_renamed_30 = GameCanvas.var_int_case;
        this.coTrangThai = 1;
        this.var_int_if = this.cfr_renamed_7 * n2 + (dF.cfr_renamed_15 << 1) + 4;
        if ((this.var_int_if > GameCanvas.soLuongKhoa)) {
            this.var_int_if = GameCanvas.soLuongKhoa;
        }
        this.cfr_renamed_3 = n - this.var_int_if / 2;
        this.soLuong = n3 + (dF.cfr_renamed_15 << 1) + 4;
        if ((this.cfr_renamed_3 < 0)) {
            this.cfr_renamed_3 = 0;
        }
        this.cfr_renamed_10 = this.soLuongKhoa = GameCanvas.var_int_int - GameCanvas.this - this.soLuong - (dF.cfr_renamed_15 << 1);
        this.cfr_renamed_16 = n3;
        this.var_java_util_Vector_do = vector;
        this.cfr_renamed_0();
        this.cfr_renamed_18 = this.cfr_renamed_7 * this.cfr_renamed_16 - (this.var_int_if - (dF.cfr_renamed_15 << 1) - 4);
        if ((this.cfr_renamed_18 < 0)) {
            this.cfr_renamed_18 = 0;
        }
        this.cfr_renamed_20 = this.var_int_if;
        var_de_do = null;
        GameCanvas.var_aa_do = this;
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

        private static boolean boolean_int(int n) {
        return n > 0;
    }

        private void cfr_renamed_2() {
        this.coTrangThai = 0;
        GameCanvas.var_aa_do = null;
        fl_0 fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_8);
        if ((fl_02.var_dF_do != null)) {
            fl_02.var_dF_do.void_for(fl_02.var_byte_do);
            return;
        }
        if ((fl_02.var_de_do != null)) {
            fl_02.var_de_do.void_do();
            return;
        }
        GameCanvas.var_en_do.void_if(fl_02.var_byte_do, fl_02.var_short_do);
    }

    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        aq aq2 = this;
        ++aq2.var_long_if;
        int n = 0;
        if (!(GameCanvas.boolean_do(2) ? 1 : 0 != null) || aq.boolean_for(GameCanvas.boolean_do(4) ? 1 : 0)) {
            n = 1;
            aq2.cfr_renamed_8 -= 1;
            if ((aq2.cfr_renamed_8 < 0)) {
                aq2.cfr_renamed_8 = aq2.cfr_renamed_7 - 1;
            }
            aq2.var_boolean_new = 0;
            if (-"  ".length() > 0) {
                return;
            }
        } else if (!(GameCanvas.boolean_do(8) ? 1 : 0 != null) || aq.boolean_for(GameCanvas.boolean_do(6) ? 1 : 0)) {
            n = 1;
            aq2.cfr_renamed_8 += 1;
            if ((aq2.cfr_renamed_8 > aq2.cfr_renamed_7 - 1)) {
                aq2.cfr_renamed_8 = 0;
            }
            aq2.var_boolean_new = 0;
        }
        if (aq.boolean_for(GameCanvas.coTrangThai ? 1 : 0) && aq.boolean_for(GameCanvas.boolean_if(aq2.cfr_renamed_3 - 2, aq2.cfr_renamed_10 - 7, aq2.var_int_if + 4, aq2.soLuong + 15) ? 1 : 0)) {
            GameCanvas.coTrangThai = 0;
            aq2.cfr_renamed_21 = aq2.cfr_renamed_13;
            aq2.var_long_for = System.currentTimeMillis() / 10L;
            aq2.dangChayAuto = 1;
        }
        if (aq.boolean_for(aq2.dangChayAuto ? 1 : 0)) {
            int n2;
            int n3;
            int n4 = GameCanvas.int_for();
            if (aq.boolean_for(aq2.coTrangThai ? 1 : 0)) {
                n4 = GameCanvas.int_if();
            }
            long l = System.currentTimeMillis() / 10L - aq2.var_long_for;
            if (aq.boolean_for(GameCanvas.var_boolean_case ? 1 : 0)) {
                if ((GameCanvas.var_int_goto % 3 != null)) {
                    aq2.cfr_renamed_14 = GameCanvas.soLuong;
                    aq2.soXu = aq2.var_long_if;
                }
                aq2.cfr_renamed_9 = 0;
                if (aq.boolean_if(Math.abs(n4), 20 * dF.cfr_renamed_12)) {
                    n3 = aq2.cfr_renamed_10;
                    n2 = (aq2.cfr_renamed_4 + GameCanvas.soLuong - n3) / aq2.cfr_renamed_16;
                    if (aq.boolean_for(aq2.coTrangThai ? 1 : 0)) {
                        n3 = aq2.cfr_renamed_3;
                        n2 = (aq2.cfr_renamed_4 + GameCanvas.var_int_try - n3) / aq2.cfr_renamed_16;
                    }
                    aq2.cfr_renamed_8 = n2;
                    aq2.cfr_renamed_0();
                }
                if ((hg.int_do(n4) >= 20 * dF.cfr_renamed_12)) {
                    aq2.var_boolean_new = 1;
                    } else if (aq.boolean_int((l, 10L == null)) && aq.cfr_renamed_4((l, 20L == null))) {
                    aq2.var_boolean_new = 0;
                }
                aq2.cfr_renamed_4 = aq2.cfr_renamed_21 + n4;
                if (!(aq2.cfr_renamed_4 >= 0) || (aq2.cfr_renamed_4 > aq2.cfr_renamed_18)) {
                    aq2.cfr_renamed_4 = aq2.cfr_renamed_21 + n4 / 3;
                }
                aq2.cfr_renamed_13 = aq2.cfr_renamed_4;
            }
            if (aq.boolean_for(GameCanvas.var_boolean_new ? 1 : 0) && aq.boolean_for(GameCanvas.boolean_if(aq2.cfr_renamed_3 - 2, aq2.cfr_renamed_10 - 7, aq2.var_int_if + 4, aq2.soLuong + 15) ? 1 : 0)) {
                n3 = (int)(aq2.var_long_if - aq2.soXu);
                n2 = aq2.cfr_renamed_14 - GameCanvas.soLuong;
                if ((hg.int_do(n2) > 40) && aq.boolean_if(n3, 10) && aq.boolean_int(aq2.cfr_renamed_4) && aq.boolean_if(aq2.cfr_renamed_4, aq2.cfr_renamed_18)) {
                    aq2.cfr_renamed_9 = n2 / n3 * 10;
                }
                aq2.soXu = -1L;
                if (aq.boolean_if(Math.abs(n4), 20 * dF.cfr_renamed_12)) {
                    if (((l, 10L == null) == null)) {
                        aq2.var_boolean_new = 0;
                    }
                    if ((aq2.var_boolean_new ? 1 : 0 != null)) {
                        n4 = aq2.cfr_renamed_10;
                        n4 = (aq2.cfr_renamed_4 + GameCanvas.soLuong - n4) / aq2.cfr_renamed_16;
                        if (aq.boolean_for(aq2.coTrangThai ? 1 : 0)) {
                            n4 = aq2.cfr_renamed_3;
                            n4 = (aq2.cfr_renamed_4 + GameCanvas.var_int_try - n4) / aq2.cfr_renamed_16;
                        }
                        aq2.cfr_renamed_8 = n4;
                        aq2.cfr_renamed_0();
                        aq2.cfr_renamed_2();
                    }
                }
                GameCanvas.var_boolean_new = 0;
            }
        }
        if (aq.boolean_for(GameCanvas.var_boolean_new ? 1 : 0)) {
            if ((aq2.dangChayAuto ? 1 : 0 != null)) {
                aq2.coTrangThai = 0;
                GameCanvas.var_aa_do = null;
                if ((var_de_do != null)) {
                    var_de_do.void_do();
                }
            }
            aq2.dangChayAuto = 0;
            GameCanvas.var_boolean_new = 0;
        }
        if (aq.boolean_for(n)) {
            aq2.cfr_renamed_4 = aq2.cfr_renamed_8 * aq2.cfr_renamed_16 - aq2.var_int_if / 2 + aq2.cfr_renamed_16 / 2;
            if ((aq2.cfr_renamed_4 > aq2.cfr_renamed_18)) {
                aq2.cfr_renamed_4 = aq2.cfr_renamed_18;
                return;
            }
            if ((aq2.cfr_renamed_4 < 0)) {
                aq2.cfr_renamed_4 = 0;
            }
        }
    }

            static {
        aq.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[19];
        0 = (24 + 25 - 6 + 197 ^ 131 + 85 - 99 + 74) & (0x52 ^ 0x7C ^ (0xA0 ^ 0xC1) ^ -" ".length());
        1 = " ".length();
        4 = 0x99 ^ 0x9D;
        2 = "  ".length();
        20 = 0x83 ^ 0x97;
        3 = "   ".length();
        5 = 0x95 ^ 0x90;
        200 = (0x2C ^ 0x56) + (0xBF ^ 0x9D) - (0x1C ^ 0x46) + (86 + 29 - 112 + 131);
        10 = 69 + 176 - 158 + 113 ^ 38 + 2 - -43 + 111;
        7 = 13 + 88 - 27 + 95 ^ 97 + 71 - 102 + 108;
        8 = 0x3F ^ 0x37;
        6 = 0x64 ^ 0x22 ^ (0xEC ^ 0xAC);
        15 = 0xD6 ^ 0x87 ^ (0x49 ^ 0x17);
        40 = 0x49 ^ 0x61;
        50 = 101 + 118 - 207 + 127 ^ 128 + 18 - -27 + 12;
        -100 = -(0xA5 ^ 0xC1);
        100 = 0xF9 ^ 0xA0 ^ (0x62 ^ 0x5F);
        35217 = 0xFFFFBB9F & 0xCDF1;
        -1 = -" ".length();
    }

            public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_2();
                return;
            }
            case 1: {
                this.coTrangThai = 0;
                GameCanvas.var_aa_do = null;
                if (!(var_de_do != null)) break;
                var_de_do.void_do();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block26: {
            block25: {
                var1_1.translate(0, this.cfr_renamed_30);
                if (!aq.boolean_for((int)this.coTrangThai)) break block25;
                var2_2 = var1_1;
                var3_4 = this;
                GameCanvas.hienThongBaoPopup(var2_2);
                GameCanvas.var_fa_0_do.cfr_renamed_4(var2_2, var3_4.cfr_renamed_3, var3_4.soLuongKhoa, var3_4.var_int_if, var3_4.soLuong);
                var2_2.translate(var3_4.cfr_renamed_3 + dF.cfr_renamed_15 + 2, var3_4.soLuongKhoa + dF.cfr_renamed_15 + 2);
                var2_2.setClip(0, 0, var3_4.var_int_if - (dF.cfr_renamed_15 << 1) - 4, var3_4.cfr_renamed_16);
                var2_2.translate(-var3_4.cfr_renamed_13, 0);
                var4_6 = var3_4.cfr_renamed_13 / var3_4.cfr_renamed_16;
                if ((var4_6 < 0)) {
                    var4_6 = 0;
                }
                if ((var5_8 = var4_6 + var3_4.var_int_if / var3_4.cfr_renamed_16 + 2 > var3_4.cfr_renamed_7)) {
                    var5_8 = var3_4.cfr_renamed_7;
                }
                if (aq.cfr_renamed_0((int)var3_4.var_boolean_new)) {
                    v_0.cfr_renamed_1(var2_2, var3_4.cfr_renamed_8 * var3_4.cfr_renamed_16, 0, var3_4.cfr_renamed_16, var3_4.cfr_renamed_16);
                }
                var6_10 = var4_6;
                if (-"   ".length() <= 0) ** GOTO lbl24
                return;
lbl-1000:
                // 1 sources

                {
                    ((fl_0)var3_4.var_java_util_Vector_do.elementAt(var6_10)).cfr_renamed_1(var2_2, var6_10 * var3_4.cfr_renamed_16 + var3_4.cfr_renamed_16 / 2, var3_4.cfr_renamed_16 / 2);
                    ++var6_10;
lbl24:
                    // 2 sources

                    ** while (!aq.cfr_renamed_4((int)var6_10, (int)var5_8))
                }
lbl25:
                // 1 sources

                if ((var3_4.cfr_renamed_8 >= 0) && aq.boolean_if(var3_4.cfr_renamed_8, var3_4.var_java_util_Vector_do.size())) {
                    var6_11 = (fl_0)var3_4.var_java_util_Vector_do.elementAt(var3_4.cfr_renamed_8);
                    var2_2.setClip(var3_4.cfr_renamed_13 - 50, -100, var3_4.cfr_renamed_13 + GameCanvas.soLuongKhoa + 100, var3_4.soLuong + 200);
                    var4_6 = var3_4.cfr_renamed_8 * var3_4.cfr_renamed_16 + var3_4.cfr_renamed_16 / 2;
                    if ((var3_4.cfr_renamed_7 * var3_4.cfr_renamed_16 + (dF.cfr_renamed_15 << 1) + 10 > GameCanvas.soLuongKhoa)) {
                        var7_13 = GameCanvas.var_fz_0_new.cfr_renamed_1(var6_11.chuoiGiaTri) / 2;
                        if (aq.boolean_if(var4_6 - var7_13, var3_4.cfr_renamed_13)) {
                            var4_6 = var3_4.cfr_renamed_13 + var7_13;
                            } else if ((var4_6 + var7_13 > GameCanvas.soLuongKhoa + var3_4.cfr_renamed_13 - 15)) {
                            var4_6 = GameCanvas.soLuongKhoa + var3_4.cfr_renamed_13 - var7_13 - 15;
                        }
                    }
                    v0 = var6_11.chuoiGiaTri;
                    v1 = -dF.cfr_renamed_6 - dF.cfr_renamed_15 - 6;
                    if ((dF.cfr_renamed_12 == 2)) {
                        v2 = 15;
                        if (-(109 ^ 104) >= 0) {
                            return;
                        }
                    } else {
                        v2 = 0;
                    }
                    GameCanvas.var_fz_0_new.cfr_renamed_1(var2_2, v0, var4_6, v1 - v2, 2);
                }
                GameCanvas.hienThongBaoPopup(var2_2);
                if (-(255 ^ 144 ^ (125 ^ 22)) > 0) {
                    return;
                }
                break block26;
            }
            var2_3 = var1_1;
            var3_5 = this;
            if (!aq.boolean_for(var3_5.cfr_renamed_7)) break block26;
            var2_3.translate(-var2_3.getTranslateX(), -var2_3.getTranslateY());
            var5_9 = var2_3;
            var4_7 = var3_5;
            GameCanvas.hienThongBaoPopup(var5_9);
            if (aq.boolean_for((int)al_0.dangChayAuto)) {
                GameCanvas.var_fa_0_do.cfr_renamed_1(var5_9, var4_7.cfr_renamed_3 - 2, var4_7.cfr_renamed_10 - 7, var4_7.var_int_if + 4, var4_7.soLuong + 15);
                } else {
                GameCanvas.var_fa_0_do.cfr_renamed_4(var5_9, var4_7.cfr_renamed_3 - 2, var4_7.cfr_renamed_10 - 7, var4_7.var_int_if + 4, var4_7.soLuong + 15);
            }
            var5_9.setClip(var4_7.cfr_renamed_3, var4_7.cfr_renamed_10, var4_7.var_int_if, var4_7.soLuong);
            var5_9.translate(var4_7.cfr_renamed_3 + 3, var4_7.cfr_renamed_10 + 1);
            var5_9.translate(0, -var4_7.cfr_renamed_13);
            var6_12 = (var4_7.cfr_renamed_16 - dF.var_byte_try) / 2;
            var7_14 = 0;
            if (-"  ".length() < 0) ** GOTO lbl102
            return;
lbl-1000:
            // 1 sources

            {
                var5_9.setColor(0);
                if (aq.cfr_renamed_0((int)var4_7.var_boolean_new) && (var7_14 == var4_7.cfr_renamed_8)) {
                    if (aq.boolean_for((int)al_0.dangChayAuto)) {
                        var5_9.setColor(35217);
                        var5_9.fillRect(0, var7_14 * var4_7.cfr_renamed_16, var4_7.var_int_if - 6, var4_7.cfr_renamed_16);
                        if ((74 ^ 97 ^ (72 ^ 103)) <= 0) {
                            return;
                        }
                    } else {
                        GameCanvas.var_fa_0_do.cfr_renamed_1(var5_9, var7_14 * var4_7.cfr_renamed_16, var4_7.var_int_if - 6, var4_7.cfr_renamed_16);
                    }
                }
                if (aq.boolean_for((int)al_0.dangChayAuto)) {
                    GameCanvas.var_fz_0_new.cfr_renamed_1(var5_9, ((fl_0)var4_7.var_java_util_Vector_do.elementAt((int)var7_14)).chuoiGiaTri, 5, var7_14 * var4_7.cfr_renamed_16 + var6_12, 0);
                    if (((141 ^ 139) & ~(124 ^ 122)) < 0) {
                        return;
                    }
                } else {
                    GameCanvas.var_fa_0_do.cfr_renamed_1(var5_9, ((fl_0)var4_7.var_java_util_Vector_do.elementAt((int)var7_14)).chuoiGiaTri, 5, var7_14 * var4_7.cfr_renamed_16 + var6_12, 0);
                }
                ++var7_14;
lbl102:
                // 2 sources

                ** while (!aq.cfr_renamed_4((int)var7_14, (int)var4_7.cfr_renamed_7))
            }
        }
        super.cfr_renamed_1(var1_1);
    }

    public aq() {
        this.cfr_renamed_7 = 0;
        this.cfr_renamed_21 = 0;
        this.dangChayAuto = 0;
        this.b_();
    }
}

