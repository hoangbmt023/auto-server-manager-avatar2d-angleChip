/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class gx {
    private static int this;
    private int cfr_renamed_16;
    private String chuoiPhu = "";
    public int soLuong;
    private boolean coKichHoat;
    private static String var_java_lang_String_int;
    private static int cfr_renamed_6;
    public static int var_int_if;
    private static Canvas var_javax_microedition_lcdui_Canvas_do;
    public static cp var_cp_do;
    private int cfr_renamed_17;
    public int soLuongKhoa;
    public int var_int_int;
    private int cfr_renamed_13;
    public int var_int_new;
    public int cfr_renamed_2;
    public static boolean dangChayAuto;
    private static String[] var_java_lang_String_arr_if;
    private static int[][] var_int_arr_arr_do;
    public static int cfr_renamed_15;
    private int cfr_renamed_30;
    private static int[] mangSoNguyen;
    private long soXu = 0L;
    private static String[] var_java_lang_String_arr_for;
    public static int cfr_renamed_8;
    private int cfr_renamed_22;
    private static int cfr_renamed_19;
    public String chuoiGiaTri = "";
    public int cfr_renamed_12;
    private static String[] var_java_lang_String_arr_int;
    public int cfr_renamed_11;
    private int cfr_renamed_20;
    public static ep var_ep_do;
    private static int[] var_int_arr_if;
    public int cfr_renamed_18;
    private ei var_ei_do;
    public static final String[] var_java_lang_String_arr_do;
    private String var_java_lang_String_new = "";
    public boolean coTrangThai = var_int_arr_if[0];
    public String tenNhanVat = "";
    private boolean var_boolean_int;
    private static int cfr_renamed_14;
    public int cfr_renamed_10;

        public final void void_do() {
        this.cfr_renamed_17 = var_int_arr_if[70];
    }

    static boolean (gx gx2 == null) {
        return gx2.var_boolean_int;
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_5() {
        if ((this.cfr_renamed_30 == var_int_arr_if[5])) {
            this.chuoiPhu = "";
            int n = var_int_arr_if[2];
            while (!(n >= this.var_java_lang_String_new.length())) {
                this.chuoiPhu = String.valueOf(this.chuoiPhu) + "*";
                ++n;
            }
            if (gx.boolean_int(this.cfr_renamed_2) && gx.boolean_int(this.cfr_renamed_18)) {
                this.chuoiPhu = String.valueOf(this.chuoiPhu.substring(var_int_arr_if[2], this.cfr_renamed_18 - var_int_arr_if[0])) + this.var_java_lang_String_new.charAt(this.cfr_renamed_18 - var_int_arr_if[0]) + this.chuoiPhu.substring(this.cfr_renamed_18, this.chuoiPhu.length());
            }
        }
    }

    public final void (String string == null) {
        if ((string == null)) {
            return;
        }
        cfr_renamed_6 = var_int_arr_if[19];
        this.cfr_renamed_2 = var_int_arr_if[2];
        this.cfr_renamed_20 = var_int_arr_if[2];
        this.var_java_lang_String_new = string;
        this.tenNhanVat = string;
        this.cfr_renamed_5();
        this.cfr_renamed_18 = string.length();
        this.void_int(var_int_arr_if[2]);
    }

    public final void cfr_renamed_1() {
        this.cfr_renamed_10 += var_int_arr_if[0];
        if (gx.boolean_int(this.cfr_renamed_2)) {
            this.cfr_renamed_2 -= var_int_arr_if[0];
            if (!gx.boolean_for(this.cfr_renamed_2) || (var_int_if > var_int_arr_if[5])) {
                this.cfr_renamed_20 = var_int_arr_if[2];
                if (gx.boolean_for(this.var_boolean_int ? 1 : 0) && (var_int_if == var_int_arr_if[0]) && (cfr_renamed_6 != cfr_renamed_19)) {
                    var_int_if = var_int_arr_if[2];
                }
                cfr_renamed_6 = var_int_arr_if[19];
                this.cfr_renamed_5();
            }
        }
        if (gx.boolean_int(this.cfr_renamed_11)) {
            this.cfr_renamed_11 -= var_int_arr_if[0];
        }
        if (gx.boolean_for(GameCanvas.coKichHoat ? 1 : 0) && (GameCanvas.var_e_0_do == null)) {
            gx gx2 = this;
            if (gx.boolean_for(GameCanvas.coKichHoat ? 1 : 0) && gx.boolean_for(GameCanvas.boolean_if(var_int_arr_if[2], var_int_arr_if[2], GameCanvas.var_int_byte, GameCanvas.var_int_char - GameCanvas.var_int_else / var_int_arr_if[5]) ? 1 : 0)) {
                if (gx.boolean_for(GameCanvas.boolean_if(gx2.var_int_new, gx2.soLuongKhoa - var_int_arr_if[10], gx2.cfr_renamed_12, gx2.var_int_int + var_int_arr_if[12]) ? 1 : 0)) {
                    if (gx.boolean_new(gx2.var_boolean_int ? 1 : 0)) {
                        gx2.var_boolean_int = var_int_arr_if[0];
                        if (-(0xF9 ^ 0xB8 ^ (0x3F ^ 0x7A)) >= 0) {
                            return;
                        }
                    } else {
                        if (gx.boolean_new(ey_0.dangChayAuto ? 1 : 0)) {
                            gx2.coKichHoat = var_int_arr_if[0];
                            ey_0.dangChayAuto = var_int_arr_if[0];
                            GameCanvas.gameCanvas.void_do();
                        }
                        GameCanvas.var_av_do.coTrangThai = var_int_arr_if[0];
                        if (-(0x54 ^ 0x51) >= 0) {
                            return;
                        }
                    }
                } else {
                    if (gx.boolean_for(gx2.coKichHoat ? 1 : 0)) {
                        ey_0.dangChayAuto = var_int_arr_if[2];
                        GameCanvas.gameCanvas.void_do();
                        gx2.coKichHoat = var_int_arr_if[2];
                    }
                    if (gx.boolean_for(gx2.coTrangThai ? 1 : 0)) {
                        gx2.var_boolean_int = var_int_arr_if[2];
                    }
                }
            }
        }
        if ((this.cfr_renamed_13 != var_int_arr_if[56]) && gx.boolean_int((System.currentTimeMillis() / 100L - this.soXu >= 5L))) {
            this.cfr_renamed_13 = var_int_arr_if[56];
        }
        if (gx.boolean_for(this.var_boolean_int ? 1 : 0) && (GameCanvas.var_bt_0_do == null)) {
            if (gx.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[9]])) {
                if ((this.cfr_renamed_30 != var_int_arr_if[5])) {
                    this.cfr_renamed_18 -= var_int_arr_if[0];
                    if ((this.cfr_renamed_18 < 0)) {
                        this.cfr_renamed_18 = var_int_arr_if[2];
                    }
                    this.void_int(var_int_arr_if[56]);
                }
                GameCanvas.var_boolean_arr_do[gx.var_int_arr_if[9]] = var_int_arr_if[2];
                return;
            }
            if (gx.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[10]])) {
                if ((this.cfr_renamed_30 != var_int_arr_if[5])) {
                    this.cfr_renamed_18 += var_int_arr_if[0];
                    if ((this.cfr_renamed_18 > this.var_java_lang_String_new.length())) {
                        this.cfr_renamed_18 = this.var_java_lang_String_new.length();
                    }
                    this.void_int(var_int_arr_if[0]);
                }
                GameCanvas.var_boolean_arr_do[gx.var_int_arr_if[10]] = var_int_arr_if[2];
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_2() {
        block4: {
            this.soXu = System.currentTimeMillis() / 100L;
            if (!(this.cfr_renamed_13 == gx.var_int_arr_if[56])) break block4;
            var1_1 = this.cfr_renamed_18;
            if (" ".length() == " ".length()) ** GOTO lbl23
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = this.var_java_lang_String_new.charAt(var1_1 - gx.var_int_arr_if[0]);
                var3_5 = gx.var_int_arr_if[2];
                if (((13 ^ 63) & ~(47 ^ 29)) < "  ".length()) ** GOTO lbl21
                return;
lbl-1000:
                // 1 sources

                {
                    var4_7 = gx.var_java_lang_String_int.charAt(var3_5);
                    if ((var2_3 == var4_7)) {
                        this.cfr_renamed_16 = var3_5;
                        this.cfr_renamed_22 = gx.var_int_arr_if[2];
                        this.cfr_renamed_13 = var1_1 - gx.var_int_arr_if[0];
                        return;
                    }
                    ++var3_5;
lbl21:
                    // 2 sources

                    ** while (!gx.cfr_renamed_0((int)var3_5, (int)gx.var_java_lang_String_int.length()))
                }
lbl22:
                // 1 sources

                --var1_1;
lbl23:
                // 2 sources

                ** while (!gx.boolean_if((int)var1_1))
            }
lbl24:
            // 1 sources

            this.cfr_renamed_13 = gx.var_int_arr_if[56];
            return;
        }
        this.cfr_renamed_22 += gx.var_int_arr_if[0];
        if ((this.cfr_renamed_22 >= gx.var_int_arr_if[10])) {
            this.cfr_renamed_22 = gx.var_int_arr_if[2];
        }
        var1_2 = this.var_java_lang_String_new.substring(gx.var_int_arr_if[2], this.cfr_renamed_13);
        var2_4 = this.var_java_lang_String_new.substring(this.cfr_renamed_13 + gx.var_int_arr_if[0]);
        var3_6 = gx.var_java_lang_String_int.substring(this.cfr_renamed_16 + this.cfr_renamed_22, this.cfr_renamed_16 + this.cfr_renamed_22 + gx.var_int_arr_if[0]);
        this.var_java_lang_String_new = String.valueOf(var1_2) + var3_6 + var2_4;
    }

    public final String java_lang_String_do() {
        return this.var_java_lang_String_new;
    }

    public final void (Graphics graphics == null) {
        boolean bl = this.var_boolean_int;
        if ((this.cfr_renamed_30 == var_int_arr_if[5])) {
            this.tenNhanVat = this.chuoiPhu;
            if (" ".length() > "   ".length()) {
                return;
            }
        } else {
            this.tenNhanVat = this.var_java_lang_String_new;
        }
        graphics.setClip(var_int_arr_if[2], var_int_arr_if[2], GameCanvas.var_int_byte + var_int_arr_if[68], GameCanvas.var_int_char);
        graphics.setColor(var_int_arr_if[69]);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.var_int_new, this.soLuongKhoa, this.cfr_renamed_12, this.var_int_int, this, bl);
    }

    public final boolean boolean_do() {
        return this.var_boolean_int;
    }

    public final void void_do(int n) {
        this.cfr_renamed_30 = n;
    }

    public final void (boolean bl == null) {
        if ((this.var_boolean_int ? 1 : 0 != bl ? 1 : 0)) {
            var_int_if = var_int_arr_if[2];
        }
        cfr_renamed_6 = var_int_arr_if[19];
        cfr_renamed_15 = GameCanvas.int_if();
        this.var_boolean_int = bl;
    }

    public final ei ei_do() {
        var_cp_do = this.var_ei_do.var_cp_do;
        if (gx.boolean_new(GameCanvas.cfr_renamed_16)) {
            return this.var_ei_do;
        }
        return null;
    }

            public final boolean boolean_do(int n) {
        if (gx.boolean_for(GameCanvas.var_boolean_int ? 1 : 0)) {
            if (!(n != var_int_arr_if[13]) || (n == var_int_arr_if[60])) {
                this.cfr_renamed_3();
                if (-" ".length() >= 0) {
                    return ((0xB4 ^ 0xA1) & ~(0x39 ^ 0x2C)) != 0;
                }
            }
        } else if (!(n != var_int_arr_if[13]) || !(n != var_int_arr_if[61]) || (n == var_int_arr_if[62])) {
            this.cfr_renamed_3();
            return var_int_arr_if[0];
        }
        if (gx.boolean_new(GameCanvas.var_boolean_int ? 1 : 0) && (n >= var_int_arr_if[58]) && (n <= var_int_arr_if[50])) {
            dangChayAuto = var_int_arr_if[0];
        }
        if (gx.boolean_for(dangChayAuto ? 1 : 0) && gx.boolean_new(GameCanvas.var_boolean_int ? 1 : 0)) {
            if ((n == var_int_arr_if[63])) {
                if ((n == cfr_renamed_6) && (this.cfr_renamed_2 < mangSoNguyen[cfr_renamed_14])) {
                    this.tenNhanVat = this.var_java_lang_String_new = String.valueOf(this.var_java_lang_String_new.substring(var_int_arr_if[2], this.cfr_renamed_18 - var_int_arr_if[0])) + var_int_arr_if[64];
                    this.cfr_renamed_5();
                    this.void_int(var_int_arr_if[2]);
                    cfr_renamed_6 = var_int_arr_if[19];
                    return var_int_arr_if[2];
                }
                cfr_renamed_6 = var_int_arr_if[63];
            }
            if ((n >= var_int_arr_if[20])) {
                this.void_new(n);
                return var_int_arr_if[2];
            }
        }
        if (gx.boolean_new(dangChayAuto ? 1 : 0) && (n == cfr_renamed_19)) {
            gx.cfr_renamed_4();
            this.cfr_renamed_2 = var_int_arr_if[0];
            cfr_renamed_6 = n;
            return var_int_arr_if[2];
        }
        if ((n == this) && gx.boolean_new(this.cfr_renamed_30)) {
            this.cfr_renamed_2();
            return var_int_arr_if[2];
        }
        if ((n == var_int_arr_if[40])) {
            n = var_int_arr_if[65];
        }
        if ((n == var_int_arr_if[42])) {
            n = var_int_arr_if[66];
        }
        if (gx.boolean_for(GameCanvas.var_boolean_int ? 1 : 0) && (n >= var_int_arr_if[21])) {
            if (gx.boolean_for(dangChayAuto ? 1 : 0)) {
                this.void_new(n);
                this.cfr_renamed_2 = var_int_arr_if[0];
                if (" ".length() <= ((6 ^ 0x50 ^ (0xB ^ 0xF)) & (197 + 104 - 63 + 16 ^ 169 + 146 - 237 + 94 ^ -" ".length()))) {
                    return ((0 ^ 0x39 ^ (0xA5 ^ 0xA1)) & (0x1E ^ 0x5F ^ (0xFD ^ 0x81) ^ -" ".length())) != 0;
                }
            } else {
                this.void_for(n);
                if ("   ".length() != "   ".length()) {
                    return ((0x82 ^ 0xAB) & ~(0x9F ^ 0xB6)) != 0;
                }
            }
        } else if ((n >= var_int_arr_if[21]) && (n <= var_int_arr_if[66])) {
            this.void_for(n);
            if (-(0x40 ^ 0xB ^ (0xF0 ^ 0xBE)) >= 0) {
                return ((0x44 ^ 0x73 ^ (0x6F ^ 0x61)) & (0x88 ^ 0x8F ^ (0x2D ^ 0x13) ^ -" ".length())) != 0;
            }
        } else {
            this.cfr_renamed_20 = var_int_arr_if[2];
            cfr_renamed_6 = var_int_arr_if[19];
            if ((n == var_int_arr_if[4])) {
                if (gx.boolean_int(this.cfr_renamed_18)) {
                    this.cfr_renamed_18 -= var_int_arr_if[0];
                    this.void_int(var_int_arr_if[2]);
                    this.cfr_renamed_11 = var_int_arr_if[14];
                    return var_int_arr_if[2];
                }
            } else if ((n == var_int_arr_if[17])) {
                if ((this.cfr_renamed_18 < this.var_java_lang_String_new.length())) {
                    this.cfr_renamed_18 += var_int_arr_if[0];
                    this.void_int(var_int_arr_if[2]);
                    this.cfr_renamed_11 = var_int_arr_if[14];
                    return var_int_arr_if[2];
                }
            } else {
                if ((n == var_int_arr_if[67])) {
                    this.cfr_renamed_3();
                    return var_int_arr_if[2];
                }
                cfr_renamed_6 = n;
            }
        }
        return var_int_arr_if[0];
    }

    private static boolean boolean_if(int n) {
        return n <= 0;
    }

    private static void cfr_renamed_15() {
        var_int_arr_if = new int[71];
        gx.var_int_arr_if[0] = " ".length();
        gx.var_int_arr_if[1] = 20 + 57 - 76 + 136 ^ 14 + 40 - 28 + 116;
        gx.var_int_arr_if[2] = (107 + 100 - 119 + 64 ^ 166 + 75 - 236 + 170) & (" ".length() ^ (0x1D ^ 0x2B) ^ -" ".length());
        gx.var_int_arr_if[3] = 2 ^ 0x10;
        gx.var_int_arr_if[4] = 0x68 ^ 5 ^ (0x6E ^ 0xD);
        gx.var_int_arr_if[5] = "  ".length();
        gx.var_int_arr_if[6] = 0x21 ^ 0x2A;
        gx.var_int_arr_if[7] = "   ".length();
        gx.var_int_arr_if[8] = 0xB ^ 2;
        gx.var_int_arr_if[9] = 0x75 ^ 0x4E ^ (0x28 ^ 0x17);
        gx.var_int_arr_if[10] = 0x16 ^ 0x3F ^ (0x8D ^ 0xA2);
        gx.var_int_arr_if[11] = 93 + 14 - 9 + 55 ^ 27 + 79 - -39 + 11;
        gx.var_int_arr_if[12] = 122 + 101 - 211 + 189 ^ 56 + 161 - 85 + 65;
        gx.var_int_arr_if[13] = 0x63 ^ 0x6B;
        gx.var_int_arr_if[14] = "  ".length() ^ (0x89 ^ 0x81);
        gx.var_int_arr_if[15] = 0x3D ^ 0x2C;
        gx.var_int_arr_if[16] = 5 ^ 8;
        gx.var_int_arr_if[17] = 0x5F ^ 0x3A ^ (0x55 ^ 0x3F);
        gx.var_int_arr_if[18] = 0xA9 ^ 0xB9;
        gx.var_int_arr_if[19] = -(-(0xFFFFEAEE & 0x753F) & (0xFFFFEFED & 0x77FF));
        gx.var_int_arr_if[20] = 0x97 ^ 0xB7;
        gx.var_int_arr_if[21] = 0x88 ^ 0xB8;
        gx.var_int_arr_if[22] = 0x47 ^ 0x76;
        gx.var_int_arr_if[23] = 0xD2 ^ 0x97;
        gx.var_int_arr_if[24] = 59 + 117 - 128 + 80 ^ 27 + 154 - 153 + 150;
        gx.var_int_arr_if[25] = 0xD4 ^ 0x90 ^ (0x91 ^ 0x81);
        gx.var_int_arr_if[26] = 19 + 72 - 57 + 151 ^ 96 + 124 - 87 + 5;
        gx.var_int_arr_if[27] = 27 + 192 - 97 + 109 ^ 34 + 42 - -101 + 1;
        gx.var_int_arr_if[28] = 0x28 ^ 0x68 ^ (0x71 ^ 5);
        gx.var_int_arr_if[29] = 0x4F ^ 0xB;
        gx.var_int_arr_if[30] = 0xBA ^ 0x8F;
        gx.var_int_arr_if[31] = 0x5D ^ 0x1A;
        gx.var_int_arr_if[32] = 0xD ^ 0x3B;
        gx.var_int_arr_if[33] = 89 + 189 - 229 + 194 ^ 160 + 101 - 82 + 6;
        gx.var_int_arr_if[34] = 33 + 37 - -17 + 79 ^ 40 + 115 - 64 + 54;
        gx.var_int_arr_if[35] = 0xF2 ^ 0x8B ^ (0x17 ^ 0x2D);
        gx.var_int_arr_if[36] = 0x6A ^ 0x52;
        gx.var_int_arr_if[37] = 0xCB ^ 0x93 ^ (0x23 ^ 0x39);
        gx.var_int_arr_if[38] = 0xE2 ^ 0xA8 ^ (0x6E ^ 0x1D);
        gx.var_int_arr_if[39] = 0x16 ^ 0x5B;
        gx.var_int_arr_if[40] = 0x9B ^ 0xB1;
        gx.var_int_arr_if[41] = (0x21 ^ 0x57) + (0x8D ^ 0xAA) - (0x66 ^ 0x18) + (0x7A ^ 0x1B);
        gx.var_int_arr_if[42] = 5 ^ 0x26;
        gx.var_int_arr_if[43] = 82 + 43 - 25 + 34 + (0x2D ^ 0x48) - (103 + 76 - 129 + 88) + (0xB2 ^ 0x9A);
        gx.var_int_arr_if[44] = 0xA0 ^ 0x81;
        gx.var_int_arr_if[45] = "  ".length() ^ (0x7C ^ 0xF);
        gx.var_int_arr_if[46] = 0x2C ^ 0x13;
        gx.var_int_arr_if[47] = 0x70 ^ 0x11;
        gx.var_int_arr_if[48] = 0x53 ^ 0x3B ^ (0xE ^ 0x26);
        gx.var_int_arr_if[49] = 0xDA ^ 0xA3;
        gx.var_int_arr_if[50] = 0x79 ^ 3;
        gx.var_int_arr_if[51] = 0xF9 ^ 0xB5 ^ (0x4A ^ 0x28);
        gx.var_int_arr_if[52] = 4 ^ 0x6B;
        gx.var_int_arr_if[53] = 0x2B ^ 7;
        gx.var_int_arr_if[54] = 0x5F ^ 0x33;
        gx.var_int_arr_if[55] = 0xFFFFC5F4 & 0x3BFF;
        gx.var_int_arr_if[56] = -" ".length();
        gx.var_int_arr_if[57] = 205 + 16 - 177 + 174 ^ 62 + 41 - -43 + 49;
        gx.var_int_arr_if[58] = 0xE ^ 0x4F;
        gx.var_int_arr_if[59] = 0x41 ^ 0x1B;
        gx.var_int_arr_if[60] = 80 + 35 - 99 + 111;
        gx.var_int_arr_if[61] = -(0xAC ^ 0xA4);
        gx.var_int_arr_if[62] = (0xDD ^ 0xBB) + (82 + 38 - 34 + 63) - (126 + 150 - 265 + 172) + (113 + 26 - 116 + 113);
        gx.var_int_arr_if[63] = 0x6F ^ 0x49 ^ (0x5E ^ 0x55);
        gx.var_int_arr_if[64] = 0x9E ^ 0xC1;
        gx.var_int_arr_if[65] = 0xAC ^ 0x96;
        gx.var_int_arr_if[66] = 161 + 42 - 51 + 37 ^ 116 + 37 - 101 + 82;
        gx.var_int_arr_if[67] = 0xD7 ^ 0xC4;
        gx.var_int_arr_if[68] = 0x84 ^ 0xB6 ^ (0x88 ^ 0xAE);
        gx.var_int_arr_if[69] = -(0xFFFFEDB9 & 0x1ACF) & (0xFFFFFFFF & 0x777FFF);
        gx.var_int_arr_if[70] = 0x18 ^ 0xA ^ (0x31 ^ 0xB);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void void_for(int var1_1) {
        block41: {
            block43: {
                block42: {
                    block40: {
                        if (gx.boolean_for(this.cfr_renamed_30) && (this.cfr_renamed_30 != gx.var_int_arr_if[5]) && !(this.cfr_renamed_30 == gx.var_int_arr_if[7])) break block41;
                        var2_3 = var1_1;
                        var1_2 = this;
                        if (gx.boolean_for((int)GameCanvas.var_boolean_int)) {
                            var3_4 /* !! */  = gx.var_java_lang_String_arr_if;
                            if ("   ".length() == 0) {
                                return;
                            }
                        } else if (!(var1_2.cfr_renamed_30 != gx.var_int_arr_if[5]) || (var1_2.cfr_renamed_30 == gx.var_int_arr_if[7])) {
                            var3_4 /* !! */  = gx.var_java_lang_String_arr_for;
                            if ("   ".length() == -" ".length()) {
                                return;
                            }
                        } else {
                            var3_4 /* !! */  = gx.var_java_lang_String_arr_int;
                        }
                        if (!gx.boolean_for((int)GameCanvas.var_boolean_int)) break block42;
                        var4_5 = gx.var_int_arr_if[2];
                        if (-"  ".length() < 0) ** GOTO lbl40
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_6 = gx.var_int_arr_if[2];
                            if (" ".length() < (28 + 45 - -12 + 82 ^ 44 + 33 - -47 + 39)) ** GOTO lbl38
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((gx.var_int_arr_arr_do[var4_5][var5_6] == var2_3)) {
                                    v0 = var4_5 + gx.var_int_arr_if[21];
                                    if (" ".length() <= 0) {
                                        return;
                                    }
                                    break block40;
                                }
                                ++var5_6;
lbl38:
                                // 2 sources

                                ** while (!gx.cfr_renamed_0((int)var5_6, (int)gx.var_int_arr_arr_do[var4_5].length))
                            }
lbl39:
                            // 1 sources

                            ++var4_5;
lbl40:
                            // 2 sources

                            ** while (!gx.cfr_renamed_0((int)var4_5, (int)gx.var_int_arr_arr_do.length))
                        }
lbl41:
                        // 1 sources

                        v0 = var2_3 = gx.var_int_arr_if[56];
                    }
                    if (!(v0 != gx.var_int_arr_if[56])) break block43;
                }
                if ((var2_3 == gx.cfr_renamed_6)) {
                    var1_2.cfr_renamed_20 = (var1_2.cfr_renamed_20 + gx.var_int_arr_if[0]) % var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].length();
                    var4_5 = var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].charAt(var1_2.cfr_renamed_20);
                    if (gx.boolean_new(gx.var_int_if)) {
                        var4_5 = Character.toLowerCase(var4_5);
                        if ("   ".length() < ((155 + 139 - 107 + 45 ^ 33 + 83 - -2 + 60) & (30 ^ 60 ^ (206 ^ 182) ^ -" ".length()))) {
                            return;
                        }
                    } else if ((gx.var_int_if == gx.var_int_arr_if[0])) {
                        var4_5 = Character.toUpperCase(var4_5);
                        } else if ((gx.var_int_if == gx.var_int_arr_if[5])) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                    } else {
                        var4_5 = var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].charAt(var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].length() - gx.var_int_arr_if[0]);
                    }
                    var3_4 /* !! */  = String.valueOf(var1_2.var_java_lang_String_new.substring(gx.var_int_arr_if[2], var1_2.cfr_renamed_18 - gx.var_int_arr_if[0])) + var4_5;
                    if ((var1_2.cfr_renamed_18 < var1_2.var_java_lang_String_new.length())) {
                        var3_4 /* !! */  = String.valueOf(var3_4 /* !! */ ) + var1_2.var_java_lang_String_new.substring(var1_2.cfr_renamed_18, var1_2.var_java_lang_String_new.length());
                    }
                    var1_2.var_java_lang_String_new = var3_4 /* !! */ ;
                    var1_2.cfr_renamed_2 = gx.mangSoNguyen[gx.cfr_renamed_14];
                    var1_2.cfr_renamed_5();
                    if (-" ".length() >= 0) {
                        return;
                    }
                } else if ((var1_2.var_java_lang_String_new.length() < var1_2.cfr_renamed_17)) {
                    if ((gx.var_int_if == gx.var_int_arr_if[0]) && (gx.cfr_renamed_6 != gx.var_int_arr_if[19])) {
                        gx.var_int_if = gx.var_int_arr_if[2];
                    }
                    var1_2.cfr_renamed_20 = gx.var_int_arr_if[2];
                    var4_5 = var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].charAt(var1_2.cfr_renamed_20);
                    if (gx.boolean_new(gx.var_int_if)) {
                        var4_5 = Character.toLowerCase(var4_5);
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else if ((gx.var_int_if == gx.var_int_arr_if[0])) {
                        var4_5 = Character.toUpperCase(var4_5);
                        } else if ((gx.var_int_if == gx.var_int_arr_if[5])) {
                        var4_5 = Character.toUpperCase(var4_5);
                        if (((88 ^ 51 ^ (40 ^ 81)) & (235 ^ 195 ^ (2 ^ 56) ^ -" ".length())) != 0) {
                            return;
                        }
                    } else {
                        var4_5 = var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].charAt(var3_4 /* !! */ [var2_3 - gx.var_int_arr_if[21]].length() - gx.var_int_arr_if[0]);
                    }
                    var3_4 /* !! */  = String.valueOf(var1_2.var_java_lang_String_new.substring(gx.var_int_arr_if[2], var1_2.cfr_renamed_18)) + var4_5;
                    if ((var1_2.cfr_renamed_18 < var1_2.var_java_lang_String_new.length())) {
                        var3_4 /* !! */  = String.valueOf(var3_4 /* !! */ ) + var1_2.var_java_lang_String_new.substring(var1_2.cfr_renamed_18, var1_2.var_java_lang_String_new.length());
                    }
                    var1_2.var_java_lang_String_new = var3_4 /* !! */ ;
                    var1_2.cfr_renamed_2 = gx.mangSoNguyen[gx.cfr_renamed_14];
                    var1_2.cfr_renamed_18 += gx.var_int_arr_if[0];
                    var1_2.cfr_renamed_5();
                    var1_2.void_int(gx.var_int_arr_if[2]);
                }
                gx.cfr_renamed_6 = var2_3;
            }
            return;
        }
        if ((this.cfr_renamed_30 == gx.var_int_arr_if[0])) {
            this.void_new(var1_1);
            this.cfr_renamed_2 = gx.var_int_arr_if[0];
        }
    }

    public final void cfr_renamed_3() {
        if (gx.boolean_int(this.cfr_renamed_18) && gx.boolean_int(this.var_java_lang_String_new.length())) {
            this.var_java_lang_String_new = String.valueOf(this.var_java_lang_String_new.substring(var_int_arr_if[2], this.cfr_renamed_18 - var_int_arr_if[0])) + this.var_java_lang_String_new.substring(this.cfr_renamed_18, this.var_java_lang_String_new.length());
            this.cfr_renamed_18 -= var_int_arr_if[0];
            this.void_int(var_int_arr_if[2]);
            this.cfr_renamed_5();
        }
    }

    public static void cfr_renamed_1(boolean bl) {
        dangChayAuto = bl;
        GameCanvas.var_ew_if.cfr_renamed_0("ABC");
        }

    private void void_int(int n) {
        if ((this.cfr_renamed_30 == var_int_arr_if[5])) {
            this.tenNhanVat = this.chuoiPhu;
            if ("  ".length() <= 0) {
                return;
            }
        } else {
            this.tenNhanVat = this.var_java_lang_String_new;
        }
        int n2 = GameCanvas.var_ew_if.cfr_renamed_0(this.tenNhanVat.substring(var_int_arr_if[2], this.cfr_renamed_18));
        if ((n == var_int_arr_if[56])) {
            if ((n2 + this.soLuong < var_int_arr_if[17]) && gx.boolean_int(this.cfr_renamed_18) && (this.cfr_renamed_18 < this.tenNhanVat.length())) {
                this.soLuong += GameCanvas.var_ew_if.cfr_renamed_0(this.tenNhanVat.substring(this.cfr_renamed_18, this.cfr_renamed_18 + var_int_arr_if[0]));
                if ((5 ^ 0x34 ^ (0x83 ^ 0xB6)) == "   ".length()) {
                    return;
                }
            }
        } else if ((n == var_int_arr_if[0])) {
            if ((n2 + this.soLuong > this.cfr_renamed_12 - var_int_arr_if[57]) && (this.cfr_renamed_18 < this.tenNhanVat.length()) && gx.boolean_int(this.cfr_renamed_18)) {
                this.soLuong -= GameCanvas.var_ew_if.cfr_renamed_0(this.tenNhanVat.substring(this.cfr_renamed_18 - var_int_arr_if[0], this.cfr_renamed_18));
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
        } else {
            this.soLuong = -(n2 - (this.cfr_renamed_12 - var_int_arr_if[12]));
        }
        if (gx.boolean_int(this.soLuong)) {
            this.soLuong = var_int_arr_if[2];
            return;
        }
        if ((this.soLuong < 0) && gx.cfr_renamed_3(this.soLuong, -(n = GameCanvas.var_ew_if.cfr_renamed_0(this.tenNhanVat) - (this.cfr_renamed_12 - var_int_arr_if[12])))) {
            this.soLuong = -n;
        }
    }

    public gx() {
        this.cfr_renamed_18 = var_int_arr_if[2];
        this.cfr_renamed_10 = var_int_arr_if[2];
        this.cfr_renamed_17 = var_int_arr_if[55];
        this.soLuong = var_int_arr_if[2];
        this.cfr_renamed_2 = var_int_arr_if[2];
        this.cfr_renamed_20 = var_int_arr_if[2];
        this.cfr_renamed_11 = var_int_arr_if[14];
        this.cfr_renamed_30 = var_int_arr_if[2];
        this.cfr_renamed_13 = var_int_arr_if[56];
        this.cfr_renamed_16 = var_int_arr_if[2];
        this.cfr_renamed_22 = var_int_arr_if[2];
        this.coKichHoat = var_int_arr_if[2];
        gx gx2 = this;
        cfr_renamed_8 = bn_0.cfr_renamed_15 + var_int_arr_if[0];
        gx2.var_ei_do = new ei(MenuChinhAvatar.d, new x_0(gx2));
        if ((var_javax_microedition_lcdui_Canvas_do == null)) {
            var_javax_microedition_lcdui_Canvas_do = GameCanvas.gameCanvas;
        }
        this.cfr_renamed_0(var_int_arr_if[2]);
        this.var_int_int = gx.var_ep_do.soLuong;
    }

    public static void cfr_renamed_4() {
        if ((var_int_if += var_int_arr_if[0] > var_int_arr_if[7])) {
            var_int_if = var_int_arr_if[2];
        }
        cfr_renamed_6 = cfr_renamed_19;
        cfr_renamed_15 = GameCanvas.int_if();
    }

    private void void_new(int n) {
        if (!((this.cfr_renamed_30 != var_int_arr_if[5]) && !(this.cfr_renamed_30 == var_int_arr_if[7]) || (n >= var_int_arr_if[21]) && !(n > var_int_arr_if[38]) || (n >= var_int_arr_if[58]) && !(n > var_int_arr_if[59]) || (n >= var_int_arr_if[47]) && !(n > var_int_arr_if[50]))) {
            return;
        }
        if ((this.var_java_lang_String_new.length() < this.cfr_renamed_17)) {
            String string = String.valueOf(this.var_java_lang_String_new.substring(var_int_arr_if[2], this.cfr_renamed_18)) + (char)n;
            if ((this.cfr_renamed_18 < this.var_java_lang_String_new.length())) {
                string = String.valueOf(string) + this.var_java_lang_String_new.substring(this.cfr_renamed_18, this.var_java_lang_String_new.length());
            }
            this.var_java_lang_String_new = string;
            this.cfr_renamed_18 += var_int_arr_if[0];
            this.cfr_renamed_5();
            this.void_int(var_int_arr_if[2]);
        }
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

    static {
        gx.cfr_renamed_15();
        cfr_renamed_14 = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[1]];
        nArray[gx.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[gx.var_int_arr_if[0]] = var_int_arr_if[4];
        nArray[gx.var_int_arr_if[5]] = var_int_arr_if[6];
        nArray[gx.var_int_arr_if[7]] = var_int_arr_if[8];
        nArray[gx.var_int_arr_if[9]] = var_int_arr_if[10];
        nArray[gx.var_int_arr_if[11]] = var_int_arr_if[9];
        nArray[gx.var_int_arr_if[10]] = var_int_arr_if[5];
        mangSoNguyen = nArray;
        cfr_renamed_8 = var_int_arr_if[2];
        String[] stringArray = new String[var_int_arr_if[12]];
        stringArray[gx.var_int_arr_if[2]] = " 0";
        stringArray[gx.var_int_arr_if[0]] = ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1";
        stringArray[gx.var_int_arr_if[5]] = "abc2âă";
        stringArray[gx.var_int_arr_if[7]] = "def3đê";
        stringArray[gx.var_int_arr_if[9]] = "ghi4";
        stringArray[gx.var_int_arr_if[11]] = "jkl5";
        stringArray[gx.var_int_arr_if[10]] = "mno6ôơ";
        stringArray[gx.var_int_arr_if[1]] = "pqrs7";
        stringArray[gx.var_int_arr_if[13]] = "tuv8ư";
        stringArray[gx.var_int_arr_if[8]] = "wxyz9";
        stringArray[gx.var_int_arr_if[14]] = "*";
        stringArray[gx.var_int_arr_if[6]] = "#";
        var_java_lang_String_arr_int = stringArray;
        String[] stringArray2 = new String[var_int_arr_if[12]];
        stringArray2[gx.var_int_arr_if[2]] = "0";
        stringArray2[gx.var_int_arr_if[0]] = "1";
        stringArray2[gx.var_int_arr_if[5]] = "abc2";
        stringArray2[gx.var_int_arr_if[7]] = "def3";
        stringArray2[gx.var_int_arr_if[9]] = "ghi4";
        stringArray2[gx.var_int_arr_if[11]] = "jkl5";
        stringArray2[gx.var_int_arr_if[10]] = "mno6";
        stringArray2[gx.var_int_arr_if[1]] = "pqrs7";
        stringArray2[gx.var_int_arr_if[13]] = "tuv8";
        stringArray2[gx.var_int_arr_if[8]] = "wxyz9";
        stringArray2[gx.var_int_arr_if[14]] = "0";
        stringArray2[gx.var_int_arr_if[6]] = "0";
        var_java_lang_String_arr_for = stringArray2;
        String[] stringArray3 = new String[var_int_arr_if[15]];
        stringArray3[gx.var_int_arr_if[2]] = " 0";
        stringArray3[gx.var_int_arr_if[0]] = "er1";
        stringArray3[gx.var_int_arr_if[5]] = "ty2";
        stringArray3[gx.var_int_arr_if[7]] = "ui3";
        stringArray3[gx.var_int_arr_if[9]] = "df4";
        stringArray3[gx.var_int_arr_if[11]] = "gh5";
        stringArray3[gx.var_int_arr_if[10]] = "jk6";
        stringArray3[gx.var_int_arr_if[1]] = "cv7";
        stringArray3[gx.var_int_arr_if[13]] = "bn8";
        stringArray3[gx.var_int_arr_if[8]] = "m9";
        stringArray3[gx.var_int_arr_if[14]] = "0";
        stringArray3[gx.var_int_arr_if[6]] = "0";
        stringArray3[gx.var_int_arr_if[12]] = "qw!";
        stringArray3[gx.var_int_arr_if[16]] = "as?";
        stringArray3[gx.var_int_arr_if[4]] = "zx";
        stringArray3[gx.var_int_arr_if[17]] = "op.";
        stringArray3[gx.var_int_arr_if[18]] = "l,";
        var_java_lang_String_arr_if = stringArray3;
        cfr_renamed_6 = var_int_arr_if[19];
        var_int_if = var_int_arr_if[2];
        String[] stringArray4 = new String[var_int_arr_if[9]];
        stringArray4[gx.var_int_arr_if[2]] = "abc";
        stringArray4[gx.var_int_arr_if[0]] = "Abc";
        stringArray4[gx.var_int_arr_if[5]] = "ABC";
        stringArray4[gx.var_int_arr_if[7]] = "123";
        var_java_lang_String_arr_do = stringArray4;
        cfr_renamed_19 = var_int_arr_if[6];
        var_java_lang_String_int = "aáàảãạâấầẩẫậăắằẳẵặeéèẻẽẹêếềểễệiíìỉĩịoóòỏõọôốồổỗộơớờởỡợuúùủũụưứừửữựyýỳỷỹỵ";
        int[][] nArrayArray = new int[var_int_arr_if[15]][];
        int[] nArray2 = new int[var_int_arr_if[5]];
        nArray2[gx.var_int_arr_if[2]] = var_int_arr_if[20];
        nArray2[gx.var_int_arr_if[0]] = var_int_arr_if[21];
        nArrayArray[gx.var_int_arr_if[2]] = nArray2;
        int[] nArray3 = new int[var_int_arr_if[5]];
        nArray3[gx.var_int_arr_if[2]] = var_int_arr_if[22];
        nArray3[gx.var_int_arr_if[0]] = var_int_arr_if[23];
        nArrayArray[gx.var_int_arr_if[0]] = nArray3;
        int[] nArray4 = new int[var_int_arr_if[5]];
        nArray4[gx.var_int_arr_if[2]] = var_int_arr_if[24];
        nArray4[gx.var_int_arr_if[0]] = var_int_arr_if[25];
        nArrayArray[gx.var_int_arr_if[5]] = nArray4;
        int[] nArray5 = new int[var_int_arr_if[5]];
        nArray5[gx.var_int_arr_if[2]] = var_int_arr_if[26];
        nArray5[gx.var_int_arr_if[0]] = var_int_arr_if[27];
        nArrayArray[gx.var_int_arr_if[7]] = nArray5;
        int[] nArray6 = new int[var_int_arr_if[5]];
        nArray6[gx.var_int_arr_if[2]] = var_int_arr_if[28];
        nArray6[gx.var_int_arr_if[0]] = var_int_arr_if[29];
        nArrayArray[gx.var_int_arr_if[9]] = nArray6;
        int[] nArray7 = new int[var_int_arr_if[5]];
        nArray7[gx.var_int_arr_if[2]] = var_int_arr_if[30];
        nArray7[gx.var_int_arr_if[0]] = var_int_arr_if[31];
        nArrayArray[gx.var_int_arr_if[11]] = nArray7;
        int[] nArray8 = new int[var_int_arr_if[5]];
        nArray8[gx.var_int_arr_if[2]] = var_int_arr_if[32];
        nArray8[gx.var_int_arr_if[0]] = var_int_arr_if[33];
        nArrayArray[gx.var_int_arr_if[10]] = nArray8;
        int[] nArray9 = new int[var_int_arr_if[5]];
        nArray9[gx.var_int_arr_if[2]] = var_int_arr_if[34];
        nArray9[gx.var_int_arr_if[0]] = var_int_arr_if[35];
        nArrayArray[gx.var_int_arr_if[1]] = nArray9;
        int[] nArray10 = new int[var_int_arr_if[5]];
        nArray10[gx.var_int_arr_if[2]] = var_int_arr_if[36];
        nArray10[gx.var_int_arr_if[0]] = var_int_arr_if[37];
        nArrayArray[gx.var_int_arr_if[13]] = nArray10;
        int[] nArray11 = new int[var_int_arr_if[5]];
        nArray11[gx.var_int_arr_if[2]] = var_int_arr_if[38];
        nArray11[gx.var_int_arr_if[0]] = var_int_arr_if[39];
        nArrayArray[gx.var_int_arr_if[8]] = nArray11;
        int[] nArray12 = new int[var_int_arr_if[5]];
        nArray12[gx.var_int_arr_if[2]] = var_int_arr_if[40];
        nArray12[gx.var_int_arr_if[0]] = var_int_arr_if[41];
        nArrayArray[gx.var_int_arr_if[14]] = nArray12;
        int[] nArray13 = new int[var_int_arr_if[5]];
        nArray13[gx.var_int_arr_if[2]] = var_int_arr_if[42];
        nArray13[gx.var_int_arr_if[0]] = var_int_arr_if[43];
        nArrayArray[gx.var_int_arr_if[6]] = nArray13;
        int[] nArray14 = new int[var_int_arr_if[5]];
        nArray14[gx.var_int_arr_if[2]] = var_int_arr_if[44];
        nArray14[gx.var_int_arr_if[0]] = var_int_arr_if[45];
        nArrayArray[gx.var_int_arr_if[12]] = nArray14;
        int[] nArray15 = new int[var_int_arr_if[5]];
        nArray15[gx.var_int_arr_if[2]] = var_int_arr_if[46];
        nArray15[gx.var_int_arr_if[0]] = var_int_arr_if[47];
        nArrayArray[gx.var_int_arr_if[16]] = nArray15;
        int[] nArray16 = new int[var_int_arr_if[7]];
        nArray16[gx.var_int_arr_if[2]] = var_int_arr_if[48];
        nArray16[gx.var_int_arr_if[0]] = var_int_arr_if[49];
        nArray16[gx.var_int_arr_if[5]] = var_int_arr_if[50];
        nArrayArray[gx.var_int_arr_if[4]] = nArray16;
        int[] nArray17 = new int[var_int_arr_if[5]];
        nArray17[gx.var_int_arr_if[2]] = var_int_arr_if[51];
        nArray17[gx.var_int_arr_if[0]] = var_int_arr_if[52];
        nArrayArray[gx.var_int_arr_if[17]] = nArray17;
        int[] nArray18 = new int[var_int_arr_if[5]];
        nArray18[gx.var_int_arr_if[2]] = var_int_arr_if[53];
        nArray18[gx.var_int_arr_if[0]] = var_int_arr_if[54];
        nArrayArray[gx.var_int_arr_if[18]] = nArray18;
        var_int_arr_arr_do = nArrayArray;
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

    public static void void_if(int n) {
        if ((n == var_int_arr_if[0])) {
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[2]] = "0";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[14]] = " *";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[6]] = "#";
            cfr_renamed_19 = var_int_arr_if[42];
            this = var_int_arr_if[40];
            return;
        }
        if (gx.boolean_new(n)) {
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[2]] = " 0";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[14]] = "*";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[6]] = "#";
            cfr_renamed_19 = var_int_arr_if[42];
            this = var_int_arr_if[40];
            return;
        }
        if ((n == var_int_arr_if[5])) {
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[2]] = "0";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[14]] = "*";
            gx.var_java_lang_String_arr_int[gx.var_int_arr_if[6]] = " #";
            cfr_renamed_19 = var_int_arr_if[40];
            this = var_int_arr_if[42];
        }
    }

        private static boolean boolean_new(int n) {
        return n == 0;
    }

            }

