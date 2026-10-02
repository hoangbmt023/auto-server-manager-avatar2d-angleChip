/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bU
extends bk_0 {
    private byte cfr_renamed_11;
    private static int[] mangSoNguyen;
    private byte cfr_renamed_18 = (byte)10;
    public short[] var_short_arr_do;
    public byte var_byte_do;
    public short[] var_short_arr_if;
    private int var_int_long;
    private byte var_byte_long = (byte)-1;
    public byte cfr_renamed_12;
    private byte this;
    public short var_short_do;
    public int soLuong;
    private byte cfr_renamed_16 = (byte)-1;
    public short var_short_if;

    public final void void_do() {
        this.cfr_renamed_11 = (byte)(this.cfr_renamed_11 + 1);
        if ((this.cfr_renamed_11 >= 10)) {
            this.cfr_renamed_11 = (byte)0;
        }
        if ((this.this < 9)) {
            this.this = (byte)(this.this + 1);
        }
        this.var_int_long += 1;
        if ((this.var_int_long >= 6)) {
            this.var_int_long = 0;
        }
        this.var_int_byte += 1;
        if ((this.var_int_byte == 12)) {
            this.var_int_byte = 0;
        }
        if (bU.cfr_renamed_5(((aG)this).cfr_renamed_3, (ef_0.var_short_if + 1) * ef_0.var_int_if)) {
            if ((this.var_short_arr_do != null) && (this.var_byte_do < this.var_short_arr_do.length) && (gt.cfr_renamed_0().var_byte_for <= 0)) {
                ((aG)this).cfr_renamed_3 += this.var_short_arr_if[this.var_byte_do];
                if ((this.var_short_arr_if[this.var_byte_do] != null)) {
                    this.cfr_renamed_4 = (byte)2;
                    if (((0x15 ^ 1) & ~(0x31 ^ 0x25)) >= " ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_4 = (byte)1;
                }
                byte by2 = this.var_byte_do;
                this.var_short_arr_do[by2] = (short)(this.var_short_arr_do[by2] - 1);
                if ((this.var_short_arr_do[this.var_byte_do] <= 0)) {
                    this.var_byte_do = (byte)(this.var_byte_do + 1);
                    if ((this.var_byte_do < this.var_short_arr_if.length)) {
                        if ((this.this == 9) && (this.var_short_arr_if[this.var_byte_do] != null)) {
                            this.this = (byte)0;
                            } else if ((this.var_byte_long == -1) && (this.var_short_arr_if[this.var_byte_do] == 2)) {
                            this.var_byte_long = (byte)20;
                            if (((0xF ^ 0x52) & ~(0xFE ^ 0xA3)) != 0) {
                                return;
                            }
                        } else if ((this.cfr_renamed_16 == -1) && (this.var_short_arr_if[this.var_byte_do] == 5)) {
                            this.cfr_renamed_16 = (byte)20;
                            if ((0x28 ^ 0x2C) <= ((0x3C ^ 0x2D) & ~(0x8B ^ 0x9A))) {
                                return;
                            }
                        }
                    }
                }
            } else {
                this.cfr_renamed_4 = (byte)0;
                if ((this.var_short_arr_if != null) && (gt.cfr_renamed_0().var_byte_for <= 0)) {
                    ((aG)this).cfr_renamed_3 += this.var_short_arr_if[this.var_short_arr_if.length - 1];
                }
                if ((this.cfr_renamed_18 == 10) && (this.var_short_arr_do != null) && (this.var_byte_do >= this.var_short_arr_do.length)) {
                    byte by3 = gt.cfr_renamed_0().var_byte_do;
                    gt.cfr_renamed_0().var_byte_do = (byte)(by3 + 1);
                    this.cfr_renamed_18 = by3;
                }
            }
            if ((this.var_byte_long >= 0)) {
                this.var_byte_long = (byte)(this.var_byte_long - 1);
            }
            if ((this.cfr_renamed_16 >= 0)) {
                this.cfr_renamed_16 = (byte)(this.cfr_renamed_16 - 1);
            }
        }
    }

    public bU() {
        this.this = (byte)6;
        this.var_int_long = 0;
    }

    public final void (Graphics graphics != null) {
        an an2 = ci_0.cfr_renamed_1(this.var_short_if);
        if ((an2.soLuong != -1)) {
            int n = an2.var_short_do / 5;
            graphics.drawRegion(an2.var_javax_microedition_lcdui_Image_do, 0, gt.var_byte_arr_arr_do[this.cfr_renamed_4][this.var_int_byte] * n, (int)an2.cfr_renamed_1, n, 0, ((aG)this).cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 33);
            if ((gt.cfr_renamed_0().dangChayAuto) && (this.soLuong > 0)) {
                GameCanvas.var_ew_if.cfr_renamed_0(graphics, "" + this.soLuong, ((aG)this).cfr_renamed_3 * aG.var_int_int - an2.cfr_renamed_1 / 2 - 8 * aG.var_int_int, this.var_int_if * aG.var_int_int - bn_0.cfr_renamed_15 / 2 - 3 * aG.var_int_int, 1);
            }
            if ((this.var_byte_long >= 0)) {
                graphics.drawImage(gt.var_javax_microedition_lcdui_Image_do, ((aG)this).cfr_renamed_3 * aG.var_int_int + an2.cfr_renamed_1 / 2, this.var_int_if * aG.var_int_int - n, 33);
            }
            if ((this.this < 9)) {
                graphics.drawImage(gt.var_javax_microedition_lcdui_Image_arr_do[this.this / 3], ((aG)this).cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 3);
            }
            if ((this.cfr_renamed_16 >= 0)) {
                graphics.drawImage(gt.var_javax_microedition_lcdui_Image_if, ((aG)this).cfr_renamed_3 * aG.var_int_int + an2.cfr_renamed_1 / 2, this.var_int_if * aG.var_int_int - n, 33);
                graphics.drawImage(gt.var_javax_microedition_lcdui_Image_arr_if[this.cfr_renamed_11 / 2], ((aG)this).cfr_renamed_3 * aG.var_int_int - an2.cfr_renamed_1 / 2, this.var_int_if * aG.var_int_int, 3);
            }
            if (bU.cfr_renamed_3(((bk_0)this).cfr_renamed_12, ek_0.ek_0_do().var_bk_0_do.cfr_renamed_12)) {
                graphics.drawImage(fe_0.var_javax_microedition_lcdui_Image_if, ((aG)this).cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int - n - this.var_int_long / 2 - 10 * aG.var_int_int, 3);
            }
        }
    }

                            private static void cfr_renamed_1() {
        mangSoNguyen = new int[13];
        10 = 54 + 56 - 19 + 37 ^ 23 + 17 - -89 + 9;
        -1 = -" ".length();
        6 = 162 + 78 - 213 + 142 ^ 85 + 99 - 167 + 158;
        0 = (0x76 ^ 0x3B) & ~(0xDE ^ 0x93);
        1 = " ".length();
        9 = 0xC9 ^ 0xAC ^ (0xC2 ^ 0xAE);
        12 = 0xA1 ^ 0x9D ^ (0x36 ^ 6);
        2 = "  ".length();
        20 = 22 + 33 - 31 + 123 ^ 36 + 92 - 94 + 101;
        5 = 76 + 123 - 189 + 130 ^ 108 + 28 - 22 + 23;
        33 = 0xC ^ 0x2D;
        8 = 0x81 ^ 0xC4 ^ (0x4A ^ 7);
        3 = "   ".length();
    }

        static {
        bU.cfr_renamed_1();
    }

            }

