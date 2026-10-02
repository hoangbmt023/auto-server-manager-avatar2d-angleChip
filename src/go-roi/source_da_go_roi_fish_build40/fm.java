/*
 * Decompiled with CFR 0.152.
 */
public final class fm {
    private static int[] mangSoNguyen;
    private int cfr_renamed_4;
    public int soLuong;
    public dd_0 duLieuNguoiChoi;
    private int cfr_renamed_5;
    public int var_int_if;
    public static boolean dangChayAuto;
    public int cfr_renamed_2;
    private static int cfr_renamed_6;
    private static fm var_fm_do;
    private int cfr_renamed_7;
    public int cfr_renamed_3;
    private static int cfr_renamed_8;
    public long soXu;
    public static boolean coTrangThai;
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    private int cfr_renamed_14;

    public final void void_do(int n) {
        block16: {
            block14: {
                block15: {
                    if ((this.duLieuNguoiChoi == null)) {
                        return;
                    }
                    dangChayAuto = 0;
                    cfr_renamed_8 = fh.var_int_int * dF.cfr_renamed_12;
                    cfr_renamed_6 = GameCanvas.soLuongKhoa / 10;
                    if (!fm.cfr_renamed_0(((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12, GameCanvas.cfr_renamed_15)) break block14;
                    if (!fm.cfr_renamed_3(((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12, fh.var_short_if * cfr_renamed_8 - GameCanvas.cfr_renamed_15 - cfr_renamed_8)) break block15;
                    this.var_int_if = ((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12 - GameCanvas.cfr_renamed_15;
                    if ((0x1B ^ 0x78 ^ (0xC2 ^ 0xA5)) <= "   ".length()) {
                        return;
                    }
                    break block16;
                }
                this.var_int_if = fh.var_short_if * cfr_renamed_8 - GameCanvas.soLuongKhoa;
                if (!(this.var_int_if < 0)) break block16;
            }
            this.var_int_if = 0;
        }
        if ((GameCanvas.soLuongKhoa > fh.var_short_if * cfr_renamed_8)) {
            this.var_int_if = -(GameCanvas.soLuongKhoa - fh.var_short_if * cfr_renamed_8) / 2;
        }
        if (!(!(GameCanvas.var_int_case > fh.var_short_do * cfr_renamed_8) || fm.boolean_do(n - 1, 57) && fm.boolean_do(n - 1, 58) && fm.boolean_do(n - 1, 59) && !(n - 1 == 108))) {
            this.soLuong = -(GameCanvas.var_int_case - fh.var_short_do * cfr_renamed_8) / 2;
            } else {
            this.soLuong = fh.var_short_do * cfr_renamed_8 - GameCanvas.var_int_case;
        }
        this.cfr_renamed_14 = fh.var_short_if * cfr_renamed_8 - GameCanvas.soLuongKhoa;
        this.cfr_renamed_4 = fh.var_short_do * cfr_renamed_8 - GameCanvas.var_int_case;
        this.cfr_renamed_3 = this.var_int_if;
        if ((this.cfr_renamed_3 < 0)) {
            this.cfr_renamed_3 = 0;
        }
        if ((this.cfr_renamed_3 > this.cfr_renamed_14)) {
            this.cfr_renamed_3 = this.cfr_renamed_14;
        }
        if ((this.cfr_renamed_2 > this.cfr_renamed_4)) {
            this.cfr_renamed_2 = this.cfr_renamed_4;
        }
        if ((this.soLuong > this.cfr_renamed_4)) {
            this.soLuong = this.cfr_renamed_4;
        }
    }

    public final void void_do() {
        this.cfr_renamed_3 = this.var_int_if;
        this.cfr_renamed_2 = this.soLuong;
    }

    private void cfr_renamed_4() {
        if (fm.boolean_if(fh.var_int_char) && (fh.var_int_char < fh.var_byte_arr_do.length) && (fh.var_byte_arr_do[fh.var_int_char] == -1) && (fh.var_javax_microedition_lcdui_Image_if == null) && (GameCanvas.var_int_case > fh.var_short_do * cfr_renamed_8)) {
            this.cfr_renamed_2 = this.soLuong = -(GameCanvas.var_int_case - fh.var_short_do * cfr_renamed_8) / 2;
        }
        if ((GameCanvas.soLuongKhoa > fh.var_short_if * cfr_renamed_8)) {
            this.cfr_renamed_3 = this.var_int_if = -(GameCanvas.soLuongKhoa - fh.var_short_if * cfr_renamed_8) / 2;
        }
    }

        private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[11];
        0 = (0x80 ^ 0xBD ^ (0x12 ^ 0x25)) & (5 ^ 0x70 ^ 58 + 92 - 26 + 3 ^ -" ".length());
        10 = 0x69 ^ 6 ^ (0x53 ^ 0x36);
        2 = "  ".length();
        1 = " ".length();
        57 = 0x3A ^ 0x7E ^ (0xF3 ^ 0x8E);
        58 = 0xAC ^ 0x96;
        59 = 0x6A ^ 0x73 ^ (4 ^ 0x26);
        108 = 0x52 ^ 0x3E;
        4 = 78 + 101 - 57 + 5 ^ (0x5D ^ 0x26);
        15 = 7 ^ 8;
        -1 = -" ".length();
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    public static void void_if(int n) {
        cfr_renamed_6 = n;
    }

    public static fm fm_do() {
        if ((var_fm_do == null)) {
            var_fm_do = new fm();
        }
        return var_fm_do;
    }

        public final void cfr_renamed_0() {
        if (!(coTrangThai)) {
            if (fm.boolean_do(this.cfr_renamed_3, this.var_int_if)) {
                this.cfr_renamed_13 = this.var_int_if - this.cfr_renamed_3 << 1;
                this.cfr_renamed_7 += this.cfr_renamed_13;
                this.cfr_renamed_3 += this.cfr_renamed_7 >> 4;
                this.cfr_renamed_7 &= 15;
                if ((this.cfr_renamed_3 < 0)) {
                    this.cfr_renamed_3 = 0;
                }
                if ((this.cfr_renamed_3 > this.cfr_renamed_14)) {
                    this.cfr_renamed_3 = this.cfr_renamed_14;
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
            }
        } else {
            if ((this.cfr_renamed_3 < 0)) {
                this.cfr_renamed_3 = 0;
            }
            if ((this.cfr_renamed_3 > fh.var_short_if * fh.var_int_int * dF.cfr_renamed_12 - GameCanvas.soLuongKhoa)) {
                this.cfr_renamed_3 = fh.var_short_if * fh.var_int_int * dF.cfr_renamed_12 - GameCanvas.soLuongKhoa;
            }
        }
        if (fm.boolean_do(this.cfr_renamed_2, this.soLuong)) {
            this.cfr_renamed_5 = this.soLuong - this.cfr_renamed_2 << 1;
            this.cfr_renamed_9 += this.cfr_renamed_5;
            this.cfr_renamed_2 += this.cfr_renamed_9 >> 4;
            this.cfr_renamed_9 &= 15;
            if ((this.cfr_renamed_2 > this.cfr_renamed_4)) {
                this.cfr_renamed_2 = this.cfr_renamed_4;
            }
        }
    }

    static {
        fm.cfr_renamed_5();
        coTrangThai = 0;
    }

                public final void cfr_renamed_2() {
        this.cfr_renamed_3 = this.var_int_if = 0;
        this.cfr_renamed_2 = this.soLuong = 0;
    }

    public final void cfr_renamed_3() {
        int n;
        this.cfr_renamed_0();
        if (!fm.boolean_if((System.currentTimeMillis() / 100L - this.soXu, 20L == null)) || fm.boolean_do(dangChayAuto ? 1 : 0)) {
            return;
        }
        if ((this.duLieuNguoiChoi.var_byte_new == 0)) {
            n = ((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12 + cfr_renamed_6;
            if (((65 + 113 - 156 + 119 ^ 4 + 100 - 95 + 165) & (0x14 ^ 0x11 ^ (0xB7 ^ 0x91) ^ -" ".length())) > 0) {
                return;
            }
        } else {
            n = ((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12 - cfr_renamed_6;
        }
        this.var_int_if = n - GameCanvas.cfr_renamed_15;
        this.soLuong = (((bm)this.duLieuNguoiChoi).cfr_renamed_3 + this.duLieuNguoiChoi.var_short_int) * dF.cfr_renamed_12 - (GameCanvas.var_int_case - (GameCanvas.var_int_char - cfr_renamed_8));
        if ((this.duLieuNguoiChoi.var_byte_new == dd_0.var_byte_try)) {
            if (fm.cfr_renamed_3(((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12, GameCanvas.cfr_renamed_15)) {
                this.var_int_if = 0;
                }
        } else if (fm.cfr_renamed_0(((bm)this.duLieuNguoiChoi).cfr_renamed_2 * dF.cfr_renamed_12, fh.var_short_if * cfr_renamed_8 - GameCanvas.cfr_renamed_15)) {
            this.var_int_if = fh.var_short_if * cfr_renamed_8 - GameCanvas.soLuongKhoa;
        }
        this.cfr_renamed_4();
    }

        public final void void_do(int n, int n2) {
        this.soXu = 0L;
        this.var_int_if = n - GameCanvas.cfr_renamed_15;
        this.soLuong = n2 - GameCanvas.var_int_char;
        if ((this.var_int_if < 0)) {
            this.var_int_if = 0;
        }
        if ((this.var_int_if > fh.var_short_if * cfr_renamed_8 - GameCanvas.soLuongKhoa)) {
            this.var_int_if = fh.var_short_if * cfr_renamed_8 - GameCanvas.soLuongKhoa;
        }
        if ((this.soLuong > fh.var_short_do * cfr_renamed_8 - GameCanvas.var_int_case)) {
            this.soLuong = fh.var_short_do * cfr_renamed_8 - GameCanvas.var_int_case;
        }
        this.cfr_renamed_4();
    }
}

