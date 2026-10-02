/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class eb
extends dd_0 {
    public int soLuong;
    private static int[] mangSoNguyen;
    public short var_short_do;
    private byte cfr_renamed_13;
    private byte cfr_renamed_9;
    private byte var_byte_long;
    public byte var_byte_do;
    private byte this = (byte)10;
    public short[] var_short_arr_do;
    private byte cfr_renamed_12;
    private int var_int_long;
    public short[] var_short_arr_if;
    public byte cfr_renamed_8;
    public short var_short_if;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[13];
        10 = 126 + 54 - 25 + 5 ^ 13 + 54 - -3 + 100;
        -1 = -" ".length();
        6 = 0x70 ^ 0x76;
        0 = (0xF9 ^ 0x99 ^ (0x75 ^ 0x4D)) & (7 ^ 0x13 ^ (3 ^ 0x4F) ^ -" ".length());
        1 = " ".length();
        9 = 0x57 ^ 0x49 ^ (0xD4 ^ 0xC3);
        12 = 0x11 ^ 0x74 ^ (0x21 ^ 0x48);
        2 = "  ".length();
        20 = 0x8F ^ 0xB0 ^ (0x88 ^ 0xA3);
        5 = 0xC ^ 0x28 ^ (0xA8 ^ 0x89);
        33 = 0x9B ^ 0xAE ^ (0x53 ^ 0x47);
        8 = 0x2D ^ 0x25;
        3 = "   ".length();
    }

                    public final void void_do() {
        this.cfr_renamed_12 = (byte)(this.cfr_renamed_12 + 1);
        if ((this.cfr_renamed_12 >= 10)) {
            this.cfr_renamed_12 = (byte)0;
        }
        if ((this.var_byte_long < 9)) {
            this.var_byte_long = (byte)(this.var_byte_long + 1);
        }
        this.var_int_long += 1;
        if ((this.var_int_long >= 6)) {
            this.var_int_long = 0;
        }
        this.var_int_byte += 1;
        if ((this.var_int_byte == 12)) {
            this.var_int_byte = 0;
        }
        if (eb.cfr_renamed_2(((bm)this).cfr_renamed_2, (fh.var_short_if + 1) * fh.var_int_int)) {
            if ((this.var_short_arr_if != null) && (this.cfr_renamed_8 < this.var_short_arr_if.length) && (eu_0.cfr_renamed_1().var_byte_do <= 0)) {
                ((bm)this).cfr_renamed_2 += this.var_short_arr_do[this.cfr_renamed_8];
                if ((this.var_short_arr_do[this.cfr_renamed_8] == 0)) {
                    this.cfr_renamed_2 = (byte)2;
                    if (" ".length() < 0) {
                        return;
                    }
                } else {
                    this.cfr_renamed_2 = (byte)1;
                }
                byte by2 = this.cfr_renamed_8;
                this.var_short_arr_if[by2] = (short)(this.var_short_arr_if[by2] - 1);
                if ((this.var_short_arr_if[this.cfr_renamed_8] <= 0)) {
                    this.cfr_renamed_8 = (byte)(this.cfr_renamed_8 + 1);
                    if ((this.cfr_renamed_8 < this.var_short_arr_do.length)) {
                        if ((this.var_byte_long == 9) && (this.var_short_arr_do[this.cfr_renamed_8] == 0)) {
                            this.var_byte_long = (byte)0;
                            if ("  ".length() < -" ".length()) {
                                return;
                            }
                        } else if ((this.cfr_renamed_9 == -1) && (this.var_short_arr_do[this.cfr_renamed_8] == 2)) {
                            this.cfr_renamed_9 = (byte)20;
                            if (" ".length() < -" ".length()) {
                                return;
                            }
                        } else if ((this.cfr_renamed_13 == -1) && (this.var_short_arr_do[this.cfr_renamed_8] == 5)) {
                            this.cfr_renamed_13 = (byte)20;
                            if ((0x28 ^ 0x2D) == 0) {
                                return;
                            }
                        }
                    }
                }
            } else {
                this.cfr_renamed_2 = (byte)0;
                if ((this.var_short_arr_do != null) && (eu_0.cfr_renamed_1().var_byte_do <= 0)) {
                    ((bm)this).cfr_renamed_2 += this.var_short_arr_do[this.var_short_arr_do.length - 1];
                }
                if ((this.this == 10) && (this.var_short_arr_if != null) && (this.cfr_renamed_8 >= this.var_short_arr_if.length)) {
                    byte by3 = eu_0.cfr_renamed_1().var_byte_if;
                    eu_0.cfr_renamed_1().var_byte_if = (byte)(by3 + 1);
                    this.this = by3;
                }
            }
            if ((this.cfr_renamed_9 >= 0)) {
                this.cfr_renamed_9 = (byte)(this.cfr_renamed_9 - 1);
            }
            if ((this.cfr_renamed_13 >= 0)) {
                this.cfr_renamed_13 = (byte)(this.cfr_renamed_13 - 1);
            }
        }
    }

                    public eb() {
        this.cfr_renamed_9 = (byte)-1;
        this.cfr_renamed_13 = (byte)-1;
        this.var_byte_long = (byte)6;
        this.var_int_long = 0;
    }

    static {
        eb.cfr_renamed_0();
    }

            public final void (Graphics graphics != null) {
        d_0 d_02 = aa_0.cfr_renamed_0(this.var_short_if);
        if ((d_02.soLuong != -1)) {
            int n = d_02.cfr_renamed_0 / 5;
            graphics.drawRegion(d_02.var_javax_microedition_lcdui_Image_do, 0, eu_0.var_byte_arr_arr_do[this.cfr_renamed_2][this.var_int_byte] * n, (int)d_02.var_short_do, n, 0, ((bm)this).cfr_renamed_2 * bm.var_int_if, ((bm)this).cfr_renamed_3 * bm.var_int_if, 33);
            if ((eu_0.cfr_renamed_1().dangChayAuto ? 1 : 0 != null) && (this.soLuong > 0)) {
                GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, "" + this.soLuong, ((bm)this).cfr_renamed_2 * bm.var_int_if - d_02.var_short_do / 2 - 8 * bm.var_int_if, ((bm)this).cfr_renamed_3 * bm.var_int_if - dF.var_byte_new / 2 - 3 * bm.var_int_if, 1);
            }
            if ((this.cfr_renamed_9 >= 0)) {
                graphics.drawImage(eu_0.var_javax_microedition_lcdui_Image_do, ((bm)this).cfr_renamed_2 * bm.var_int_if + d_02.var_short_do / 2, ((bm)this).cfr_renamed_3 * bm.var_int_if - n, 33);
            }
            if ((this.var_byte_long < 9)) {
                graphics.drawImage(eu_0.var_javax_microedition_lcdui_Image_arr_if[this.var_byte_long / 3], ((bm)this).cfr_renamed_2 * bm.var_int_if, ((bm)this).cfr_renamed_3 * bm.var_int_if, 3);
            }
            if ((this.cfr_renamed_13 >= 0)) {
                graphics.drawImage(eu_0.var_javax_microedition_lcdui_Image_if, ((bm)this).cfr_renamed_2 * bm.var_int_if + d_02.var_short_do / 2, ((bm)this).cfr_renamed_3 * bm.var_int_if - n, 33);
                graphics.drawImage(eu_0.var_javax_microedition_lcdui_Image_arr_do[this.cfr_renamed_12 / 2], ((bm)this).cfr_renamed_2 * bm.var_int_if - d_02.var_short_do / 2, ((bm)this).cfr_renamed_3 * bm.var_int_if, 3);
            }
            if (eb.cfr_renamed_4(((dd_0)this).cfr_renamed_9, fm.fm_do().duLieuNguoiChoi.cfr_renamed_9)) {
                graphics.drawImage(go_0.var_javax_microedition_lcdui_Image_if, ((bm)this).cfr_renamed_2 * bm.var_int_if, ((bm)this).cfr_renamed_3 * bm.var_int_if - n - this.var_int_long / 2 - 10 * bm.var_int_if, 3);
            }
        }
    }
}

