/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cG
 */
public final class cg_0
extends bt_0 {
    private int soLuong;
    private String[] var_java_lang_String_arr_do;
    private short[] var_short_arr_do;
    private int cfr_renamed_1;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private int cfr_renamed_8;
    private int cfr_renamed_12;
    private static int[] mangSoNguyen;
    private int cfr_renamed_11;
    private boolean dangChayAuto;
    private int cfr_renamed_18;
    private int cfr_renamed_10 = 0;
    private int cfr_renamed_17;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[15];
        0 = (0xE5 ^ 0xB3 ^ (0xAE ^ 0xC1)) & (" ".length() ^ (0x49 ^ 0x71) ^ -" ".length());
        150 = (1 ^ 0x5D) + (0xED ^ 0x94) - (26 + 8 - 27 + 121) + (0x6C ^ 0x2D);
        200 = 110 + 69 - 95 + 85 + (0x67 ^ 9) - (83 + 127 - 186 + 131) + (0x19 ^ 0x55);
        40 = 0x4B ^ 0x63;
        5 = 0x32 ^ 0x59 ^ (0xDC ^ 0xB2);
        10 = 0x59 ^ 0x53;
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        -1 = -" ".length();
        8 = 41 + 26 - -8 + 104 ^ 17 + 90 - -19 + 61;
        4 = 0xBE ^ 0xC7 ^ (0xFA ^ 0x87);
        20 = 0xEC ^ 0x8B ^ (6 ^ 0x75);
        15 = 0xA9 ^ 0xA6;
        35 = 0x62 ^ 0x56 ^ (0x75 ^ 0x62);
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

        private static boolean boolean_if(int n) {
        return n < 0;
    }

        static {
        cg_0.cfr_renamed_1();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_0(Graphics graphics) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, (GameCanvas.var_int_byte - this.cfr_renamed_18) / 2, (GameCanvas.this - this.cfr_renamed_12) / 2 - (k.var_byte_do + 3 * bn_0.cfr_renamed_6), this.cfr_renamed_12 + (k.var_byte_do + 3 * bn_0.cfr_renamed_6), this.cfr_renamed_18, 0, 0, k.k_do().cfr_renamed_15, k.k_do().soLuongKhoa, k.var_byte_do, 1, 1, k.k_do().var_int_arr_for, k.k_do().var_int_arr_if, "Lịch sử");
        GameCanvas.cfr_renamed_1(graphics);
        graphics.translate((GameCanvas.var_int_byte - this.cfr_renamed_18) / 2, (GameCanvas.this - this.cfr_renamed_12) / 2);
        graphics.setClip(0, 5 * bn_0.cfr_renamed_6, this.cfr_renamed_18, this.cfr_renamed_12 - 10 * bn_0.cfr_renamed_6);
        graphics.translate(0, -this.cfr_renamed_11);
        int n = 0;
        while (!cg_0.boolean_do(n, this.var_short_arr_do.length)) {
            ci_0.cfr_renamed_0(graphics, this.var_short_arr_do[n], 15 * bn_0.cfr_renamed_6, 15 * bn_0.cfr_renamed_6 + n * this.soLuong, 3);
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, this.var_java_lang_String_arr_do[n], 35 * bn_0.cfr_renamed_6, 15 * bn_0.cfr_renamed_6 + n * this.soLuong - bn_0.var_byte_try / 2, 0);
            ++n;
        }
        super.cfr_renamed_0(graphics);
    }

            /*
     * Unable to fully structure code
     */
    public cg_0(short[] var1_1, String[] var2_2) {
        super();
        this.dangChayAuto = 0;
        this.var_short_arr_do = var1_1;
        this.var_java_lang_String_arr_do = var2_2;
        this.var_ei_new = new ei(MenuChinhAvatar.c, null);
        this.cfr_renamed_12 = 150 * bn_0.cfr_renamed_6;
        this.cfr_renamed_18 = 200 * bn_0.cfr_renamed_6;
        this.cfr_renamed_18 = 0;
        var3_3 = 0;
        if ("   ".length() > 0) ** GOTO lbl19
        throw null;
lbl-1000:
        // 1 sources

        {
            var4_4 = GameCanvas.var_ew_try.cfr_renamed_0(var2_2[var3_3]) + 40 * bn_0.cfr_renamed_6;
            if ((var4_4 > this.cfr_renamed_18)) {
                this.cfr_renamed_18 = var4_4;
            }
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!cg_0.boolean_do((int)var3_3, (int)var2_2.length))
        }
lbl20:
        // 1 sources

        this.soLuong = bn_0.var_byte_try + 5 * bn_0.cfr_renamed_6;
        this.cfr_renamed_5 = var1_1.length * this.soLuong - (this.cfr_renamed_12 - 10 * bn_0.cfr_renamed_6);
        if (cg_0.boolean_if(this.cfr_renamed_5)) {
            this.cfr_renamed_5 = 0;
        }
    }

        public final void cfr_renamed_15() {
        this.cfr_renamed_4 += 1;
        int n = 0;
        if ((GameCanvas.coKichHoat) && cg_0.cfr_renamed_5(GameCanvas.boolean_if((GameCanvas.var_int_byte - this.cfr_renamed_18) / 2, (GameCanvas.var_int_char - this.cfr_renamed_12) / 2, this.cfr_renamed_18, this.cfr_renamed_12) ? 1 : 0) && !(this.dangChayAuto)) {
            this.cfr_renamed_10 = this.cfr_renamed_11;
            this.dangChayAuto = 1;
            this.cfr_renamed_3 = 0;
        }
        if ((this.dangChayAuto)) {
            int n2 = GameCanvas.int_for();
            if ((GameCanvas.var_boolean_try)) {
                if ((GameCanvas.var_int_try % 3 == 0)) {
                    this.cfr_renamed_15 = GameCanvas.var_int_if;
                    this.cfr_renamed_17 = this.cfr_renamed_4;
                }
                this.cfr_renamed_8 = this.cfr_renamed_10 + n2;
                this.cfr_renamed_3 = 0;
                if (!cg_0.boolean_do(this.cfr_renamed_8) || (this.cfr_renamed_8 > this.cfr_renamed_5)) {
                    this.cfr_renamed_8 = this.cfr_renamed_10 + n2 / 2;
                }
                this.cfr_renamed_11 = this.cfr_renamed_8;
            }
            if ((GameCanvas.var_boolean_new)) {
                this.dangChayAuto = 0;
                int n3 = this.cfr_renamed_4 - this.cfr_renamed_17;
                int n4 = this.cfr_renamed_15 - GameCanvas.var_int_if;
                if ((gc_0.int_if(n4) > 40) && cg_0.boolean_if(n3, 10) && (this.cfr_renamed_8 > 0) && cg_0.boolean_if(this.cfr_renamed_8, this.cfr_renamed_5)) {
                    this.cfr_renamed_3 = n4 / n3 * 10;
                }
                this.cfr_renamed_17 = -1;
                if (cg_0.boolean_if(Math.abs(n2), 10)) {
                    this.cfr_renamed_8 = this.cfr_renamed_10 + n2;
                }
            }
        }
        if ((GameCanvas.var_boolean_arr_for[2] != 0)) {
            this.cfr_renamed_8 -= bn_0.var_byte_try;
            n = 1;
            if ((0x72 ^ 0x76) <= 0) {
                return;
            }
        } else if ((GameCanvas.var_boolean_arr_for[8] != 0)) {
            n = 1;
            this.cfr_renamed_8 += bn_0.var_byte_try;
        }
        if ((n != 0)) {
            if (cg_0.boolean_if(this.cfr_renamed_8)) {
                this.cfr_renamed_8 = 0;
            }
            if ((this.cfr_renamed_8 > this.cfr_renamed_5)) {
                this.cfr_renamed_8 = this.cfr_renamed_5;
            }
        }
        if ((this.cfr_renamed_3 != 0)) {
            if (!cg_0.boolean_do(this.cfr_renamed_11) || (this.cfr_renamed_11 > this.cfr_renamed_5)) {
                this.cfr_renamed_3 -= this.cfr_renamed_3 / 4;
                this.cfr_renamed_11 += this.cfr_renamed_3 / 20;
                if ((this.cfr_renamed_3 / 10 <= 1)) {
                    this.cfr_renamed_3 = 0;
                }
            }
            if (cg_0.boolean_if(this.cfr_renamed_11)) {
                if (cg_0.boolean_if(this.cfr_renamed_11, -this.cfr_renamed_12 / 2)) {
                    this.cfr_renamed_11 = -this.cfr_renamed_12 / 2;
                    this.cfr_renamed_8 = 0;
                    this.cfr_renamed_3 = 0;
                    if ((0x30 ^ 0x37 ^ "  ".length()) <= 0) {
                        return;
                    }
                }
            } else if ((this.cfr_renamed_11 > this.cfr_renamed_5)) {
                if (cg_0.boolean_if(this.cfr_renamed_11, this.cfr_renamed_5 + this.cfr_renamed_12 / 2)) {
                    this.cfr_renamed_11 = this.cfr_renamed_5 + this.cfr_renamed_12 / 2;
                    this.cfr_renamed_8 = this.cfr_renamed_5;
                    this.cfr_renamed_3 = 0;
                    if ((0x58 ^ 0x5C) < 0) {
                        return;
                    }
                }
            } else {
                this.cfr_renamed_11 += this.cfr_renamed_3 / 10;
            }
            this.cfr_renamed_8 = this.cfr_renamed_11;
            this.cfr_renamed_3 -= this.cfr_renamed_3 / 10;
            if ((this.cfr_renamed_3 / 10 == 0)) {
                this.cfr_renamed_3 = 0;
                if ((0x33 ^ 0x36) == 0) {
                    return;
                }
            }
        } else if (cg_0.boolean_if(this.cfr_renamed_11)) {
            this.cfr_renamed_8 = 0;
            } else if ((this.cfr_renamed_11 > this.cfr_renamed_5)) {
            this.cfr_renamed_8 = this.cfr_renamed_5;
        }
        if ((this.cfr_renamed_11 != this.cfr_renamed_8)) {
            this.cfr_renamed_1 = this.cfr_renamed_8 - this.cfr_renamed_11 << 2;
            this.cfr_renamed_2 += this.cfr_renamed_1;
            this.cfr_renamed_11 += this.cfr_renamed_2 >> 4;
            this.cfr_renamed_2 &= 15;
        }
        super.cfr_renamed_15();
    }

    }

