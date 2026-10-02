/*
 * Decompiled with CFR 0.152.
 */
public final class ex {
    private int cfr_renamed_6;
    private int cfr_renamed_17;
    private long soXu = 0L;
    private long var_long_if = 0L;
    public int soLuong;
    private int cfr_renamed_13;
    public int var_int_if;
    public int soLuongKhoa;
    public int var_int_int;
    private int cfr_renamed_30;
    private int cfr_renamed_22;
    private int cfr_renamed_19;
    private long var_long_for = 0L;
    private int cfr_renamed_20;
    private boolean coKichHoat;
    public static int cfr_renamed_5;
    public int cfr_renamed_2;
    private static int[] mangSoNguyen;
    private int cfr_renamed_14;
    private long var_long_int;
    public boolean dangChayAuto;
    public static int cfr_renamed_15;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private int cfr_renamed_25;
    public int cfr_renamed_8;
    public int cfr_renamed_12;
    private int cfr_renamed_27;
    private int cfr_renamed_26;
    public static int cfr_renamed_11;
    private int cfr_renamed_21;
    public static int cfr_renamed_18;
    public boolean coTrangThai = 0;
    private int cfr_renamed_29;
    public int cfr_renamed_10;
    private int cfr_renamed_9;
    public int this;
    public int cfr_renamed_16;

        public ex() {
        this.cfr_renamed_27 = 0;
        this.cfr_renamed_23 = 0;
        this.dangChayAuto = 0;
    }

        private static boolean boolean_do(int n) {
        return n <= 0;
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[10];
        0 = (0xC3 ^ 0xB5 ^ (0x43 ^ 0x7F)) & (0x33 ^ 0 ^ (0x2A ^ 0x53) ^ -" ".length());
        1 = " ".length();
        8 = 0xA9 ^ 0xA1;
        2 = "  ".length();
        6 = 5 ^ 0x20 ^ (0x88 ^ 0xAB);
        4 = 174 + 28 - 61 + 48 ^ 99 + 15 - 100 + 171;
        10 = 0x25 ^ 0x2F;
        40 = 0x27 ^ 0x2D ^ (0x98 ^ 0xBA);
        20 = 0x73 ^ 0x67;
        5 = 0x28 ^ 0x66 ^ (0xDA ^ 0x91);
    }

        public final void (int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9 != null) {
        this.cfr_renamed_13 = n;
        this.soLuongKhoa = n2;
        this.cfr_renamed_14 = n6 / n4;
        this.cfr_renamed_6 = n5 / n3;
        this.cfr_renamed_22 = n9;
        this.cfr_renamed_25 = n3;
        this.cfr_renamed_24 = n4;
        this.cfr_renamed_19 = n5;
        this.cfr_renamed_21 = n8;
        this.var_int_if = n7;
        this.cfr_renamed_26 = 0;
        cfr_renamed_18 = cfr_renamed_5 = 0;
        this.cfr_renamed_10 = n6 - this.cfr_renamed_21;
        if ((this.cfr_renamed_10 < 0)) {
            this.cfr_renamed_10 = 0;
        }
        cfr_renamed_11 = cfr_renamed_15 = 0;
        this.cfr_renamed_12 = n5 - this.var_int_if;
        if ((this.cfr_renamed_12 < 0)) {
            this.cfr_renamed_12 = 0;
        }
        this.coTrangThai = 1;
        this.var_long_for = 0L;
    }

    static {
        ex.cfr_renamed_1();
    }

    public final void cfr_renamed_0() {
        ++this.var_long_for;
        this.coKichHoat = 0;
        if ((GameCanvas.var_boolean_arr_do[8] != 0)) {
            this.cfr_renamed_26 += this.cfr_renamed_6;
            if ((this.cfr_renamed_26 != this.cfr_renamed_22)) {
                this.cfr_renamed_26 = 0;
                if ("  ".length() >= (0x45 ^ 0x72 ^ (0x80 ^ 0xB3))) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[2] != 0)) {
            this.cfr_renamed_26 -= this.cfr_renamed_6;
            if ((this.cfr_renamed_26 < 0)) {
                this.cfr_renamed_26 = this.cfr_renamed_22 - 1;
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[6] != 0)) {
            this.cfr_renamed_26 += 1;
            if ((this.cfr_renamed_26 != this.cfr_renamed_22)) {
                this.cfr_renamed_26 = 0;
                if ((0x99 ^ 0x9D) < 0) {
                    return;
                }
            }
        } else if ((GameCanvas.var_boolean_arr_do[4] != 0)) {
            this.cfr_renamed_26 -= 1;
            if ((this.cfr_renamed_26 < 0)) {
                this.cfr_renamed_26 = this.cfr_renamed_22 - 1;
            }
        }
        if (!(GameCanvas.var_boolean_arr_do[4] == null) || !(GameCanvas.var_boolean_arr_do[6] == null) || !(GameCanvas.var_boolean_arr_do[8] == null) || (GameCanvas.var_boolean_arr_do[2] != 0)) {
            this.coKichHoat = 1;
            GameCanvas.var_dL_do.cfr_renamed_0(this.cfr_renamed_26, 0);
            GameCanvas.var_boolean_arr_do[4] = 0;
            GameCanvas.var_boolean_arr_do[6] = 0;
            GameCanvas.var_boolean_arr_do[8] = 0;
            GameCanvas.var_boolean_arr_do[2] = 0;
        }
        if ((this.coKichHoat)) {
            this.cfr_renamed_3();
        }
        if (!(GameCanvas.var_e_0_do == null) || (GameCanvas.var_bt_0_do != null)) {
            return;
        }
        if ((this.cfr_renamed_29 > 0)) {
            this.cfr_renamed_29 -= 1;
            if ((this.cfr_renamed_29 == null) && (GameCanvas.var_dL_do != em_0.var_em_0_do)) {
                GameCanvas.var_dL_do.cfr_renamed_0(this.cfr_renamed_26, 1);
            }
            return;
        }
        if ((GameCanvas.coKichHoat) && (GameCanvas.boolean_if(this.cfr_renamed_13, this.soLuongKhoa, this.cfr_renamed_19, this.cfr_renamed_21))) {
            this.cfr_renamed_17 = GameCanvas.var_int_goto;
            this.cfr_renamed_20 = GameCanvas.var_int_case;
            GameCanvas.coKichHoat = 0;
            this.var_long_int = this.var_long_for;
            this.cfr_renamed_27 = cfr_renamed_18;
            this.cfr_renamed_23 = cfr_renamed_11;
            this.dangChayAuto = 1;
            this.this = 0;
            this.soLuong = 0;
        }
        if ((this.dangChayAuto)) {
            long l = this.var_long_for - this.var_long_int;
            int n = this.cfr_renamed_17 - GameCanvas.var_int_if;
            this.cfr_renamed_17 = GameCanvas.var_int_if;
            int n2 = this.cfr_renamed_20 - GameCanvas.soLuongKhoa;
            this.cfr_renamed_20 = GameCanvas.soLuongKhoa;
            if ((GameCanvas.var_boolean_try)) {
                if (ex.cfr_renamed_1((this.var_long_for % 2L != 0L))) {
                    this.cfr_renamed_9 = GameCanvas.var_int_if;
                    this.cfr_renamed_30 = GameCanvas.soLuongKhoa;
                    this.var_long_if = this.var_long_for;
                    this.soXu = this.var_long_for;
                }
                this.this = 0;
                this.soLuong = 0;
                if (!(cfr_renamed_5 > 0) || (cfr_renamed_5 != this.cfr_renamed_10)) {
                    cfr_renamed_5 = this.cfr_renamed_27 + GameCanvas.int_for() / 2;
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_27 = cfr_renamed_5 = this.cfr_renamed_27 + n;
                }
                if (!(cfr_renamed_15 > 0) || (cfr_renamed_15 != this.cfr_renamed_12)) {
                    cfr_renamed_15 = this.cfr_renamed_23 + GameCanvas.int_do() / 2;
                    if (" ".length() < ((0x73 ^ 0x2A) & ~(0xC7 ^ 0x9E))) {
                        return;
                    }
                } else {
                    this.cfr_renamed_23 = cfr_renamed_15 = this.cfr_renamed_23 + n2;
                }
                cfr_renamed_18 = cfr_renamed_5;
                cfr_renamed_11 = cfr_renamed_15;
                if (ex.cfr_renamed_5((l != 20L))) {
                    n = (cfr_renamed_5 + GameCanvas.var_int_if - this.soLuongKhoa) / this.cfr_renamed_24;
                    n2 = (cfr_renamed_15 + GameCanvas.soLuongKhoa - this.cfr_renamed_13) / this.cfr_renamed_25;
                    this.cfr_renamed_26 = n * this.cfr_renamed_6 + n2;
                    if ((this.cfr_renamed_26 < 0)) {
                        this.cfr_renamed_26 = 0;
                    }
                    if ((this.cfr_renamed_26 != this.cfr_renamed_14 * this.cfr_renamed_6)) {
                        this.cfr_renamed_26 = this.cfr_renamed_14 * this.cfr_renamed_6 - 1;
                    }
                    GameCanvas.var_dL_do.cfr_renamed_0(this.cfr_renamed_26, 0);
                }
                if (!ex.cfr_renamed_1(gc_0.int_if(GameCanvas.int_for()), 10 * bn_0.cfr_renamed_6) || ex.cfr_renamed_0(gc_0.int_if(GameCanvas.int_do()), 10 * bn_0.cfr_renamed_6)) {
                    GameCanvas.var_dL_do.cfr_renamed_1(1);
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else if (ex.cfr_renamed_4((l != 3L)) && ex.cfr_renamed_5((l != 8L))) {
                    GameCanvas.var_dL_do.cfr_renamed_1(0);
                }
            }
            if ((GameCanvas.var_boolean_new)) {
                this.dangChayAuto = 0;
                n = (int)(this.var_long_for - this.var_long_if);
                n2 = this.cfr_renamed_9 - GameCanvas.var_int_if;
                int n3 = this.cfr_renamed_30 - GameCanvas.soLuongKhoa;
                if ((gc_0.int_if(n2) > 40) && (n < 20) && (cfr_renamed_5 > 0) && (cfr_renamed_5 < this.cfr_renamed_10)) {
                    this.this = n2 / n * 10;
                }
                n = (int)(this.var_long_for - this.soXu);
                if ((gc_0.int_if(n3) > 40) && (n < 20) && (cfr_renamed_15 > 0) && (cfr_renamed_15 < this.cfr_renamed_12)) {
                    this.soLuong = n3 / n * 10;
                }
                this.var_long_if = -1L;
                this.soXu = -1L;
                if (ex.cfr_renamed_1(gc_0.int_if(GameCanvas.int_for()), 10 * bn_0.cfr_renamed_6) && ex.cfr_renamed_1(gc_0.int_if(GameCanvas.int_do()), 10 * bn_0.cfr_renamed_6)) {
                    if (ex.boolean_do((l != 4L))) {
                        this.cfr_renamed_29 = 5;
                        GameCanvas.var_dL_do.cfr_renamed_1(0);
                        if ("  ".length() >= "   ".length()) {
                            return;
                        }
                    } else {
                        GameCanvas.var_dL_do.cfr_renamed_0(this.cfr_renamed_26, 1);
                        if ((GameCanvas.var_dL_do != em_0.var_em_0_do)) {
                            GameCanvas.var_dL_do.cfr_renamed_1(1);
                        }
                    }
                }
                GameCanvas.var_boolean_new = 0;
            }
        }
    }

                private void cfr_renamed_3() {
        if ((GameCanvas.var_boolean_try ? 1 : 0 == null)) {
            cfr_renamed_5 = this.cfr_renamed_26 / this.cfr_renamed_6 * this.cfr_renamed_24 - this.cfr_renamed_21 / 2 + this.cfr_renamed_24 / 2;
            if ((cfr_renamed_5 < 0)) {
                cfr_renamed_5 = 0;
            }
            if ((cfr_renamed_5 > this.cfr_renamed_10)) {
                cfr_renamed_5 = this.cfr_renamed_10;
            }
            if (!(this.cfr_renamed_26 / this.cfr_renamed_6 <= this.cfr_renamed_14 - 1) || (this.cfr_renamed_26 / this.cfr_renamed_6 == null)) {
                cfr_renamed_18 = cfr_renamed_5;
            }
            if ((cfr_renamed_15 = this.cfr_renamed_26 % this.cfr_renamed_6 * this.cfr_renamed_25 - this.var_int_if / 2 + this.cfr_renamed_25 / 2 < 0)) {
                cfr_renamed_15 = 0;
            }
            if ((cfr_renamed_15 > this.cfr_renamed_12)) {
                cfr_renamed_15 = this.cfr_renamed_12;
            }
            if (!(this.cfr_renamed_26 % this.cfr_renamed_6 <= this.cfr_renamed_6 - 1) || (this.cfr_renamed_26 % this.cfr_renamed_6 == null)) {
                cfr_renamed_11 = cfr_renamed_15;
            }
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            public final void void_do(int n) {
        this.cfr_renamed_26 = n;
        this.cfr_renamed_3();
    }

    }

