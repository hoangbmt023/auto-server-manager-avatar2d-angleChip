/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eK
 */
public final class ek_0 {
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    public long soXu;
    public int soLuong;
    public int var_int_if;
    public static boolean dangChayAuto;
    private int cfr_renamed_8;
    public static boolean coTrangThai;
    private static int cfr_renamed_12;
    private int cfr_renamed_11;
    private static int cfr_renamed_18;
    public int cfr_renamed_3;
    private static int[] mangSoNguyen;
    public bk_0 var_bk_0_do;
    private static ek_0 var_ek_0_do;
    private int cfr_renamed_10;
    public int cfr_renamed_4;

    public final void void_do(int n, int n2) {
        this.soXu = 0L;
        this.var_int_if = n - GameCanvas.var_int_int;
        this.cfr_renamed_4 = n2 - GameCanvas.var_int_long;
        if ((this.var_int_if < 0)) {
            this.var_int_if = 0;
        }
        if ((this.var_int_if > ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_byte)) {
            this.var_int_if = ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_byte;
        }
        if ((this.cfr_renamed_4 > ef_0.var_short_do * cfr_renamed_18 - GameCanvas.var_int_char)) {
            this.cfr_renamed_4 = ef_0.var_short_do * cfr_renamed_18 - GameCanvas.var_int_char;
        }
        this.cfr_renamed_5();
    }

    public final void void_do() {
        if (ek_0.boolean_if(coTrangThai ? 1 : 0)) {
            if ((this.soLuong != this.var_int_if)) {
                this.cfr_renamed_5 = this.var_int_if - this.soLuong << 1;
                this.cfr_renamed_2 += this.cfr_renamed_5;
                this.soLuong += this.cfr_renamed_2 >> 4;
                this.cfr_renamed_2 &= 15;
                if ((this.soLuong < 0)) {
                    this.soLuong = 0;
                }
                if ((this.soLuong > this.cfr_renamed_10)) {
                    this.soLuong = this.cfr_renamed_10;
                    if (((25 + 52 - -35 + 25 ^ 107 + 78 - 36 + 7) & (0x3E ^ 0x34 ^ (0x94 ^ 0x8B) ^ -" ".length())) != 0) {
                        return;
                    }
                }
            }
        } else {
            if ((this.soLuong < 0)) {
                this.soLuong = 0;
            }
            if ((this.soLuong > ef_0.var_short_if * ef_0.var_int_if * bn_0.cfr_renamed_6 - GameCanvas.var_int_byte)) {
                this.soLuong = ef_0.var_short_if * ef_0.var_int_if * bn_0.cfr_renamed_6 - GameCanvas.var_int_byte;
            }
        }
        if ((this.cfr_renamed_3 != this.cfr_renamed_4)) {
            this.cfr_renamed_15 = this.cfr_renamed_4 - this.cfr_renamed_3 << 1;
            this.cfr_renamed_11 += this.cfr_renamed_15;
            this.cfr_renamed_3 += this.cfr_renamed_11 >> 4;
            this.cfr_renamed_11 &= 15;
            if ((this.cfr_renamed_3 > this.cfr_renamed_8)) {
                this.cfr_renamed_3 = this.cfr_renamed_8;
            }
        }
    }

    static {
        ek_0.cfr_renamed_2();
        coTrangThai = 0;
    }

    public static void void_do(int n) {
        cfr_renamed_12 = n;
    }

    public final void cfr_renamed_1() {
        int n;
        this.void_do();
        if (!ek_0.cfr_renamed_3((System.currentTimeMillis() / 100L - this.soXu, 20L == null)) || ek_0.boolean_do(dangChayAuto ? 1 : 0)) {
            return;
        }
        if (ek_0.boolean_if(this.var_bk_0_do.cfr_renamed_3)) {
            n = ((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6 + cfr_renamed_12;
            } else {
            n = ((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6 - cfr_renamed_12;
        }
        this.var_int_if = n - GameCanvas.var_int_int;
        this.cfr_renamed_4 = (this.var_bk_0_do.var_int_if + this.var_bk_0_do.var_short_new) * bn_0.cfr_renamed_6 - (GameCanvas.var_int_char - (GameCanvas.var_int_long - cfr_renamed_18));
        if ((this.var_bk_0_do.cfr_renamed_3 == bk_0.var_byte_case)) {
            if (ek_0.boolean_do(((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6, GameCanvas.var_int_int)) {
                this.var_int_if = 0;
                if ("  ".length() > (15 + 129 - 114 + 111 ^ 77 + 44 - -10 + 6)) {
                    return;
                }
            }
        } else if (ek_0.cfr_renamed_4(((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6, ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_int)) {
            this.var_int_if = ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_byte;
        }
        this.cfr_renamed_5();
    }

    public final void void_if(int n) {
        block16: {
            block14: {
                block15: {
                    if ((this.var_bk_0_do == null)) {
                        return;
                    }
                    dangChayAuto = 0;
                    cfr_renamed_18 = ef_0.var_int_if * bn_0.cfr_renamed_6;
                    cfr_renamed_12 = GameCanvas.var_int_byte / 10;
                    if (!ek_0.cfr_renamed_4(((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6, GameCanvas.var_int_int)) break block14;
                    if (!ek_0.boolean_do(((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6, ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_int - cfr_renamed_18)) break block15;
                    this.var_int_if = ((aG)this.var_bk_0_do).cfr_renamed_3 * bn_0.cfr_renamed_6 - GameCanvas.var_int_int;
                    if (-"  ".length() > 0) {
                        return;
                    }
                    break block16;
                }
                this.var_int_if = ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_byte;
                if (!(this.var_int_if < 0)) break block16;
            }
            this.var_int_if = 0;
        }
        if ((GameCanvas.var_int_byte > ef_0.var_short_if * cfr_renamed_18)) {
            this.var_int_if = -(GameCanvas.var_int_byte - ef_0.var_short_if * cfr_renamed_18) / 2;
        }
        if (!(!(GameCanvas.var_int_char > ef_0.var_short_do * cfr_renamed_18) || (n - 1 != 57) && (n - 1 != 58) && (n - 1 != 59) && !(n - 1 == 108))) {
            this.cfr_renamed_4 = -(GameCanvas.var_int_char - ef_0.var_short_do * cfr_renamed_18) / 2;
            if (" ".length() < 0) {
                return;
            }
        } else {
            this.cfr_renamed_4 = ef_0.var_short_do * cfr_renamed_18 - GameCanvas.var_int_char;
        }
        this.cfr_renamed_10 = ef_0.var_short_if * cfr_renamed_18 - GameCanvas.var_int_byte;
        this.cfr_renamed_8 = ef_0.var_short_do * cfr_renamed_18 - GameCanvas.var_int_char;
        this.soLuong = this.var_int_if;
        if ((this.soLuong < 0)) {
            this.soLuong = 0;
        }
        if ((this.soLuong > this.cfr_renamed_10)) {
            this.soLuong = this.cfr_renamed_10;
        }
        if ((this.cfr_renamed_3 > this.cfr_renamed_8)) {
            this.cfr_renamed_3 = this.cfr_renamed_8;
        }
        if ((this.cfr_renamed_4 > this.cfr_renamed_8)) {
            this.cfr_renamed_4 = this.cfr_renamed_8;
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

        private static boolean boolean_do(int n) {
        return n != 0;
    }

    private void cfr_renamed_5() {
        if ((ef_0.soLuong >= 0) && ek_0.boolean_do(ef_0.soLuong, ef_0.var_byte_arr_do.length) && (ef_0.var_byte_arr_do[ef_0.soLuong] == -1) && (ef_0.var_javax_microedition_lcdui_Image_do == null) && (GameCanvas.var_int_char > ef_0.var_short_do * cfr_renamed_18)) {
            this.cfr_renamed_3 = this.cfr_renamed_4 = -(GameCanvas.var_int_char - ef_0.var_short_do * cfr_renamed_18) / 2;
        }
        if ((GameCanvas.var_int_byte > ef_0.var_short_if * cfr_renamed_18)) {
            this.soLuong = this.var_int_if = -(GameCanvas.var_int_byte - ef_0.var_short_if * cfr_renamed_18) / 2;
        }
    }

    public final void cfr_renamed_3() {
        this.soLuong = this.var_int_if = 0;
        this.cfr_renamed_3 = this.cfr_renamed_4 = 0;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

                public final void cfr_renamed_4() {
        this.soLuong = this.var_int_if;
        this.cfr_renamed_3 = this.cfr_renamed_4;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[11];
        0 = (0x20 ^ 0x69 ^ (0x42 ^ 0x6D) & ~(0x9F ^ 0xB0)) & (96 + 97 - 12 + 20 ^ 50 + 98 - 147 + 127 ^ -" ".length());
        10 = 0x24 ^ 0x7E ^ (0x30 ^ 0x60);
        2 = "  ".length();
        1 = " ".length();
        57 = 0x3C ^ 5;
        58 = 0xBA ^ 0x80;
        59 = 0x27 ^ 0x1C;
        108 = 0x2C ^ 0x40;
        4 = 20 + 69 - 46 + 97 ^ 71 + 45 - 113 + 133;
        15 = 0x38 ^ 0x37;
        -1 = -" ".length();
    }

        public static ek_0 ek_0_do() {
        if ((var_ek_0_do == null)) {
            var_ek_0_do = new ek_0();
        }
        return var_ek_0_do;
    }

    }

