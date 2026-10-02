/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eB
 */
public final class eb_0
extends dj_0 {
    private int soLuong;
    private int cfr_renamed_0;
    private int cfr_renamed_2;
    private static int[] mangSoNguyen;
    private String[] var_java_lang_String_arr_do;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private int cfr_renamed_8;
    private int cfr_renamed_13 = 0;
    private int cfr_renamed_9;
    private int cfr_renamed_14;
    private short[] var_short_arr_do;
    private int cfr_renamed_21;
    private boolean dangChayAuto = 0;

            private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == 0) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, (GameCanvas.soLuongKhoa - this.cfr_renamed_0) / 2, (GameCanvas.var_int_int - this.cfr_renamed_21) / 2 - (v_0.var_byte_do + 3 * dF.cfr_renamed_12), this.cfr_renamed_21 + (v_0.var_byte_do + 3 * dF.cfr_renamed_12), this.cfr_renamed_0, 0, 0, v_0.v_0_do().var_int_int, v_0.v_0_do().cfr_renamed_4, v_0.var_byte_do, 1, 1, v_0.v_0_do().mangSoNguyen, v_0.v_0_do().var_int_arr_if, "Lịch sử");
        GameCanvas.hienThongBaoPopup(var1_1);
        var1_1.translate((GameCanvas.soLuongKhoa - this.cfr_renamed_0) / 2, (GameCanvas.var_int_int - this.cfr_renamed_21) / 2);
        var1_1.setClip(0, 5 * dF.cfr_renamed_12, this.cfr_renamed_0, this.cfr_renamed_21 - 10 * dF.cfr_renamed_12);
        var1_1.translate(0, -this.cfr_renamed_7);
        var2_2 = 0;
        if (-"   ".length() <= 0) ** GOTO lbl14
        return;
lbl-1000:
        // 1 sources

        {
            aa_0.cfr_renamed_1(var1_1, this.var_short_arr_do[var2_2], 15 * dF.cfr_renamed_12, 15 * dF.cfr_renamed_12 + var2_2 * this.cfr_renamed_5, 3);
            GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, this.var_java_lang_String_arr_do[var2_2], 35 * dF.cfr_renamed_12, 15 * dF.cfr_renamed_12 + var2_2 * this.cfr_renamed_5 - dF.cfr_renamed_6 / 2, 0);
            ++var2_2;
lbl14:
            // 2 sources

            ** while (!eb_0.boolean_if((int)var2_2, (int)this.var_short_arr_do.length))
        }
lbl15:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_for(int n) {
        return n >= 0;
    }

        public final void cfr_renamed_6() {
        this.cfr_renamed_2 += 1;
        int n = 0;
        if ((GameCanvas.coTrangThai) && eb_0.cfr_renamed_4(GameCanvas.boolean_do((GameCanvas.soLuongKhoa - this.cfr_renamed_0) / 2, (GameCanvas.var_int_case - this.cfr_renamed_21) / 2, this.cfr_renamed_0, this.cfr_renamed_21) ? 1 : 0) && !(this.dangChayAuto)) {
            this.cfr_renamed_13 = this.cfr_renamed_7;
            this.dangChayAuto = 1;
            this.cfr_renamed_4 = 0;
        }
        if ((this.dangChayAuto)) {
            int n2 = GameCanvas.int_for();
            if ((GameCanvas.var_boolean_case)) {
                if ((GameCanvas.var_int_goto % 3 == 0)) {
                    this.cfr_renamed_8 = GameCanvas.soLuong;
                    this.cfr_renamed_6 = this.cfr_renamed_2;
                }
                this.cfr_renamed_3 = this.cfr_renamed_13 + n2;
                this.cfr_renamed_4 = 0;
                if (!eb_0.boolean_for(this.cfr_renamed_3) || (this.cfr_renamed_3 > this.cfr_renamed_14)) {
                    this.cfr_renamed_3 = this.cfr_renamed_13 + n2 / 2;
                }
                this.cfr_renamed_7 = this.cfr_renamed_3;
            }
            if ((GameCanvas.var_boolean_new)) {
                this.dangChayAuto = 0;
                int n3 = this.cfr_renamed_2 - this.cfr_renamed_6;
                int n4 = this.cfr_renamed_8 - GameCanvas.soLuong;
                if ((hg.int_do(n4) > 40) && (n3 < 10) && eb_0.boolean_int(this.cfr_renamed_3) && (this.cfr_renamed_3 < this.cfr_renamed_14)) {
                    this.cfr_renamed_4 = n4 / n3 * 10;
                }
                this.cfr_renamed_6 = -1;
                if ((Math.abs(n2) < 10)) {
                    this.cfr_renamed_3 = this.cfr_renamed_13 + n2;
                }
            }
        }
        if ((GameCanvas.var_boolean_arr_if[2] != 0)) {
            this.cfr_renamed_3 -= dF.cfr_renamed_6;
            n = 1;
            if ((0x64 ^ 0x60) == ((0x6C ^ 0x68) & ~(0xB0 ^ 0xB4))) {
                return;
            }
        } else if ((GameCanvas.var_boolean_arr_if[8] != 0)) {
            n = 1;
            this.cfr_renamed_3 += dF.cfr_renamed_6;
        }
        if ((n != 0)) {
            if ((this.cfr_renamed_3 < 0)) {
                this.cfr_renamed_3 = 0;
            }
            if ((this.cfr_renamed_3 > this.cfr_renamed_14)) {
                this.cfr_renamed_3 = this.cfr_renamed_14;
            }
        }
        if ((this.cfr_renamed_4 != 0)) {
            if (!eb_0.boolean_for(this.cfr_renamed_7) || (this.cfr_renamed_7 > this.cfr_renamed_14)) {
                this.cfr_renamed_4 -= this.cfr_renamed_4 / 4;
                this.cfr_renamed_7 += this.cfr_renamed_4 / 20;
                if (eb_0.boolean_do(this.cfr_renamed_4 / 10, 1)) {
                    this.cfr_renamed_4 = 0;
                }
            }
            if ((this.cfr_renamed_7 < 0)) {
                if ((this.cfr_renamed_7 < -this.cfr_renamed_21 / 2)) {
                    this.cfr_renamed_7 = -this.cfr_renamed_21 / 2;
                    this.cfr_renamed_3 = 0;
                    this.cfr_renamed_4 = 0;
                    if (-" ".length() > ((0x29 ^ 0x51 ^ (0x17 ^ 0x2B)) & (" ".length() ^ (0x21 ^ 0x64) ^ -" ".length()))) {
                        return;
                    }
                }
            } else if ((this.cfr_renamed_7 > this.cfr_renamed_14)) {
                if ((this.cfr_renamed_7 < this.cfr_renamed_14 + this.cfr_renamed_21 / 2)) {
                    this.cfr_renamed_7 = this.cfr_renamed_14 + this.cfr_renamed_21 / 2;
                    this.cfr_renamed_3 = this.cfr_renamed_14;
                    this.cfr_renamed_4 = 0;
                    if (((0x6C ^ 0x3C) & ~(0xDE ^ 0x8E)) < -" ".length()) {
                        return;
                    }
                }
            } else {
                this.cfr_renamed_7 += this.cfr_renamed_4 / 10;
            }
            this.cfr_renamed_3 = this.cfr_renamed_7;
            this.cfr_renamed_4 -= this.cfr_renamed_4 / 10;
            if ((this.cfr_renamed_4 / 10 == 0)) {
                this.cfr_renamed_4 = 0;
                if (((22 + 86 - 37 + 58 ^ 82 + 53 - 129 + 136) & (0x31 ^ 0x69 ^ (0xE7 ^ 0xB0) ^ -" ".length())) >= "   ".length()) {
                    return;
                }
            }
        } else if ((this.cfr_renamed_7 < 0)) {
            this.cfr_renamed_3 = 0;
            if ("   ".length() > (0x8E ^ 0x8A)) {
                return;
            }
        } else if ((this.cfr_renamed_7 > this.cfr_renamed_14)) {
            this.cfr_renamed_3 = this.cfr_renamed_14;
        }
        if ((this.cfr_renamed_7 != this.cfr_renamed_3)) {
            this.cfr_renamed_9 = this.cfr_renamed_3 - this.cfr_renamed_7 << 2;
            this.soLuong += this.cfr_renamed_9;
            this.cfr_renamed_7 += this.soLuong >> 4;
            this.soLuong &= 15;
        }
        super.cfr_renamed_6();
    }

    static {
        eb_0.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[15];
        0 = (0x41 ^ 0x69 ^ (0x96 ^ 0x87)) & (0x57 ^ 0x53 ^ (0x72 ^ 0x4F) ^ -" ".length());
        150 = 115 + 111 - 178 + 102;
        200 = 92 + 13 - 64 + 159;
        40 = 0x8F ^ 0xA7;
        5 = 5 ^ 0;
        10 = 9 ^ 3;
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        -1 = -" ".length();
        8 = 2 ^ 0xA;
        4 = 0x42 ^ 0x75 ^ (0x60 ^ 0x53);
        20 = 0x79 ^ 0x2E ^ (0xC4 ^ 0x87);
        15 = 0xCB ^ 0x9F ^ (0x7D ^ 0x26);
        35 = 26 + 119 - -6 + 77 ^ 184 + 47 - 182 + 150;
    }

        private static boolean boolean_int(int n) {
        return n > 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public eb_0(short[] sArray, String[] stringArray) {
        this.var_short_arr_do = sArray;
        this.var_java_lang_String_arr_do = stringArray;
        ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.ct, null);
        this.cfr_renamed_21 = 150 * dF.cfr_renamed_12;
        this.cfr_renamed_0 = 200 * dF.cfr_renamed_12;
        this.cfr_renamed_0 = 0;
        int n = 0;
        while (!eb_0.boolean_if(n, stringArray.length)) {
            int n2 = GameCanvas.var_fz_0_try.cfr_renamed_1(stringArray[n]) + 40 * dF.cfr_renamed_12;
            if ((n2 > this.cfr_renamed_0)) {
                this.cfr_renamed_0 = n2;
            }
            ++n;
        }
        this.cfr_renamed_5 = dF.cfr_renamed_6 + 5 * dF.cfr_renamed_12;
        this.cfr_renamed_14 = sArray.length * this.cfr_renamed_5 - (this.cfr_renamed_21 - 10 * dF.cfr_renamed_12);
        if ((this.cfr_renamed_14 < 0)) {
            this.cfr_renamed_14 = 0;
        }
    }

        }

