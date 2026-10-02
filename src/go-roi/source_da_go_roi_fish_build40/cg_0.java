/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cG
 */
public final class cg_0 {
    private int cfr_renamed_15;
    private long soXu = 0L;
    private int cfr_renamed_21;
    public int soLuong;
    private int cfr_renamed_10;
    private int cfr_renamed_18;
    public int var_int_if;
    private long var_long_if = 0L;
    public boolean dangChayAuto;
    public static int soLuongKhoa;
    private int cfr_renamed_30;
    public static int var_int_int;
    private long var_long_for;
    private int cfr_renamed_20;
    private int cfr_renamed_16;
    public int cfr_renamed_4;
    private int cfr_renamed_23;
    public int cfr_renamed_5;
    private int cfr_renamed_24;
    public int cfr_renamed_6;
    private int cfr_renamed_22;
    public int cfr_renamed_7;
    private int cfr_renamed_17;
    private int cfr_renamed_29;
    public int cfr_renamed_8;
    public int cfr_renamed_13;
    private static int[] mangSoNguyen;
    private long var_long_int = 0L;
    private int cfr_renamed_26;
    public static int cfr_renamed_9;
    public static int cfr_renamed_14;
    public int this;
    public boolean coTrangThai = 0;
    public int cfr_renamed_12;
    private boolean coKichHoat;
    private int cfr_renamed_27;
    private int cfr_renamed_25;
    private int cfr_renamed_28;

    public final void void_do(int n) {
        this.cfr_renamed_26 = n;
        this.cfr_renamed_0();
    }

        public cg_0() {
        this.cfr_renamed_21 = 0;
        this.cfr_renamed_16 = 0;
        this.dangChayAuto = 0;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            static {
        cg_0.cfr_renamed_2();
    }

            public final void (int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9 != null) {
        this.cfr_renamed_18 = n;
        this.cfr_renamed_8 = n2;
        this.cfr_renamed_27 = n6 / n4;
        this.cfr_renamed_29 = n5 / n3;
        this.cfr_renamed_17 = n9;
        this.cfr_renamed_20 = n3;
        this.cfr_renamed_25 = n4;
        this.cfr_renamed_28 = n5;
        this.cfr_renamed_23 = n8;
        this.cfr_renamed_13 = n7;
        this.cfr_renamed_26 = 0;
        cfr_renamed_9 = soLuongKhoa = 0;
        this.cfr_renamed_12 = n6 - this.cfr_renamed_23;
        if (cg_0.boolean_do(this.cfr_renamed_12)) {
            this.cfr_renamed_12 = 0;
        }
        cfr_renamed_14 = var_int_int = 0;
        this.var_int_if = n5 - this.cfr_renamed_13;
        if (cg_0.boolean_do(this.var_int_if)) {
            this.var_int_if = 0;
        }
        this.coTrangThai = 1;
        this.var_long_int = 0L;
    }

    private void cfr_renamed_0() {
        if ((GameCanvas.var_boolean_case ? 1 : 0 == null)) {
            soLuongKhoa = this.cfr_renamed_26 / this.cfr_renamed_29 * this.cfr_renamed_25 - this.cfr_renamed_23 / 2 + this.cfr_renamed_25 / 2;
            if (cg_0.boolean_do(soLuongKhoa)) {
                soLuongKhoa = 0;
            }
            if ((soLuongKhoa > this.cfr_renamed_12)) {
                soLuongKhoa = this.cfr_renamed_12;
            }
            if (!(this.cfr_renamed_26 / this.cfr_renamed_29 <= this.cfr_renamed_27 - 1) || (this.cfr_renamed_26 / this.cfr_renamed_29 == null)) {
                cfr_renamed_9 = soLuongKhoa;
            }
            if (cg_0.boolean_do(var_int_int = this.cfr_renamed_26 % this.cfr_renamed_29 * this.cfr_renamed_20 - this.cfr_renamed_13 / 2 + this.cfr_renamed_20 / 2)) {
                var_int_int = 0;
            }
            if ((var_int_int > this.var_int_if)) {
                var_int_int = this.var_int_if;
            }
            if (!(this.cfr_renamed_26 % this.cfr_renamed_29 <= this.cfr_renamed_29 - 1) || (this.cfr_renamed_26 % this.cfr_renamed_29 == null)) {
                cfr_renamed_14 = var_int_int;
            }
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[10];
        0 = (0x34 ^ 0x7B ^ (0x6A ^ 0x61)) & (100 + 48 - 134 + 182 ^ 55 + 108 - 103 + 68 ^ -" ".length());
        1 = " ".length();
        8 = 0x31 ^ 0x39;
        2 = "  ".length();
        6 = 133 + 157 - 246 + 143 ^ 69 + 113 - 54 + 61;
        4 = 0x51 ^ 0x55;
        10 = 0x13 ^ 0x19;
        40 = 0xBC ^ 0x94;
        20 = 0x31 ^ 0x61 ^ (0xD7 ^ 0x93);
        5 = 0xBF ^ 0xBA;
    }

    public final void cfr_renamed_1() {
        ++this.var_long_int;
        this.coKichHoat = 0;
        if ((GameCanvas.var_boolean_arr_do[8] != 0)) {
            this.cfr_renamed_26 += this.cfr_renamed_29;
            if ((this.cfr_renamed_26 >= this.cfr_renamed_17)) {
                this.cfr_renamed_26 = 0;
                if (((0x1A ^ 0x1E ^ (7 ^ 0x25)) & (0x9A ^ 0x85 ^ (0x53 ^ 0x6A) ^ -" ".length())) != 0) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[2] != 0)) {
            this.cfr_renamed_26 -= this.cfr_renamed_29;
            if (cg_0.boolean_do(this.cfr_renamed_26)) {
                this.cfr_renamed_26 = this.cfr_renamed_17 - 1;
                if (-" ".length() >= 0) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[6] != 0)) {
            this.cfr_renamed_26 += 1;
            if ((this.cfr_renamed_26 >= this.cfr_renamed_17)) {
                this.cfr_renamed_26 = 0;
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[4] != 0)) {
            this.cfr_renamed_26 -= 1;
            if (cg_0.boolean_do(this.cfr_renamed_26)) {
                this.cfr_renamed_26 = this.cfr_renamed_17 - 1;
            }
        }
        if (!(GameCanvas.var_boolean_arr_do[4] == null) || !(GameCanvas.var_boolean_arr_do[6] == null) || !(GameCanvas.var_boolean_arr_do[8] == null) || (GameCanvas.var_boolean_arr_do[2] != 0)) {
            this.coKichHoat = 1;
            GameCanvas.var_en_do.cfr_renamed_1(this.cfr_renamed_26, 0);
            GameCanvas.var_boolean_arr_do[4] = 0;
            GameCanvas.var_boolean_arr_do[6] = 0;
            GameCanvas.var_boolean_arr_do[8] = 0;
            GameCanvas.var_boolean_arr_do[2] = 0;
        }
        if ((this.coKichHoat)) {
            this.cfr_renamed_0();
        }
        if (!(GameCanvas.var_aa_do == null) || (GameCanvas.var_dj_0_do != null)) {
            return;
        }
        if ((this.cfr_renamed_30 > 0)) {
            this.cfr_renamed_30 -= 1;
            if ((this.cfr_renamed_30 == null) && (GameCanvas.var_en_do != fo.var_fo_do)) {
                GameCanvas.var_en_do.cfr_renamed_1(this.cfr_renamed_26, 1);
            }
            return;
        }
        if ((GameCanvas.coTrangThai) && (GameCanvas.boolean_do(this.cfr_renamed_18, this.cfr_renamed_8, this.cfr_renamed_28, this.cfr_renamed_23))) {
            this.cfr_renamed_24 = GameCanvas.var_int_long;
            this.cfr_renamed_15 = GameCanvas.var_int_else;
            GameCanvas.coTrangThai = 0;
            this.var_long_for = this.var_long_int;
            this.cfr_renamed_21 = cfr_renamed_9;
            this.cfr_renamed_16 = cfr_renamed_14;
            this.dangChayAuto = 1;
            this.cfr_renamed_4 = 0;
            this.cfr_renamed_6 = 0;
        }
        if ((this.dangChayAuto)) {
            long l = this.var_long_int - this.var_long_for;
            int n = this.cfr_renamed_24 - GameCanvas.soLuong;
            this.cfr_renamed_24 = GameCanvas.soLuong;
            int n2 = this.cfr_renamed_15 - GameCanvas.var_int_try;
            this.cfr_renamed_15 = GameCanvas.var_int_try;
            if ((GameCanvas.var_boolean_case)) {
                if (cg_0.cfr_renamed_0((this.var_long_int % 2L != 0L))) {
                    this.cfr_renamed_10 = GameCanvas.soLuong;
                    this.cfr_renamed_22 = GameCanvas.var_int_try;
                    this.soXu = this.var_long_int;
                    this.var_long_if = this.var_long_int;
                }
                this.cfr_renamed_4 = 0;
                this.cfr_renamed_6 = 0;
                if (!(soLuongKhoa > 0) || (soLuongKhoa >= this.cfr_renamed_12)) {
                    soLuongKhoa = this.cfr_renamed_21 + GameCanvas.int_for() / 2;
                    } else {
                    this.cfr_renamed_21 = soLuongKhoa = this.cfr_renamed_21 + n;
                }
                if (!(var_int_int > 0) || (var_int_int >= this.var_int_if)) {
                    var_int_int = this.cfr_renamed_16 + GameCanvas.int_if() / 2;
                    if ("  ".length() == " ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_16 = var_int_int = this.cfr_renamed_16 + n2;
                }
                cfr_renamed_9 = soLuongKhoa;
                cfr_renamed_14 = var_int_int;
                if (cg_0.boolean_do((l != 20L))) {
                    n = (soLuongKhoa + GameCanvas.soLuong - this.cfr_renamed_8) / this.cfr_renamed_25;
                    n2 = (var_int_int + GameCanvas.var_int_try - this.cfr_renamed_18) / this.cfr_renamed_20;
                    this.cfr_renamed_26 = n * this.cfr_renamed_29 + n2;
                    if (cg_0.boolean_do(this.cfr_renamed_26)) {
                        this.cfr_renamed_26 = 0;
                    }
                    if ((this.cfr_renamed_26 >= this.cfr_renamed_27 * this.cfr_renamed_29)) {
                        this.cfr_renamed_26 = this.cfr_renamed_27 * this.cfr_renamed_29 - 1;
                    }
                    GameCanvas.var_en_do.cfr_renamed_1(this.cfr_renamed_26, 0);
                }
                if (!cg_0.cfr_renamed_1(hg.int_do(GameCanvas.int_for()), 10 * dF.cfr_renamed_12) || cg_0.cfr_renamed_2(hg.int_do(GameCanvas.int_if()), 10 * dF.cfr_renamed_12)) {
                    GameCanvas.var_en_do.cfr_renamed_1(1);
                    if ((0xB0 ^ 0xB4) <= " ".length()) {
                        return;
                    }
                } else if (cg_0.cfr_renamed_4((l != 3L)) && cg_0.boolean_do((l != 8L))) {
                    GameCanvas.var_en_do.cfr_renamed_1(0);
                }
            }
            if ((GameCanvas.var_boolean_new)) {
                this.dangChayAuto = 0;
                n = (int)(this.var_long_int - this.soXu);
                n2 = this.cfr_renamed_10 - GameCanvas.soLuong;
                int n3 = this.cfr_renamed_22 - GameCanvas.var_int_try;
                if ((hg.int_do(n2) > 40) && (n != 20) && (soLuongKhoa > 0) && (soLuongKhoa != this.cfr_renamed_12)) {
                    this.cfr_renamed_4 = n2 / n * 10;
                }
                n = (int)(this.var_long_int - this.var_long_if);
                if ((hg.int_do(n3) > 40) && (n != 20) && (var_int_int > 0) && (var_int_int != this.var_int_if)) {
                    this.cfr_renamed_6 = n3 / n * 10;
                }
                this.soXu = -1L;
                this.var_long_if = -1L;
                if (cg_0.cfr_renamed_1(hg.int_do(GameCanvas.int_for()), 10 * dF.cfr_renamed_12) && cg_0.cfr_renamed_1(hg.int_do(GameCanvas.int_if()), 10 * dF.cfr_renamed_12)) {
                    if (cg_0.cfr_renamed_2((l != 4L))) {
                        this.cfr_renamed_30 = 5;
                        GameCanvas.var_en_do.cfr_renamed_1(0);
                        } else {
                        GameCanvas.var_en_do.cfr_renamed_1(this.cfr_renamed_26, 1);
                        if ((GameCanvas.var_en_do != fo.var_fo_do)) {
                            GameCanvas.var_en_do.cfr_renamed_1(1);
                        }
                    }
                }
                GameCanvas.var_boolean_new = 0;
            }
        }
    }

                        }

