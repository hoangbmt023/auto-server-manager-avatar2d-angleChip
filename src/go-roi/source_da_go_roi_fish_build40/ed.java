/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ed
extends dd_0 {
    short var_short_do;
    public short cfr_renamed_0;
    public int soLuong;
    private byte cfr_renamed_9 = (byte)1;
    public byte var_byte_do;
    byte cfr_renamed_8;
    public int var_int_long;
    private static int[] mangSoNguyen;
    private byte var_byte_long;
    private byte var_byte_this;
    byte cfr_renamed_13;
    public int var_int_this;

        public ed() {
        this.var_byte_if = (byte)5;
    }

        public ed(byte by2, short s2, int n) {
        this.var_int_long = n;
        this.var_byte_if = (byte)5;
        this.var_byte_do = by2;
        this.cfr_renamed_0 = s2;
        this.var_byte_long = (byte)0;
        am am2 = aa_0.am_do(this.cfr_renamed_0);
        if ((am2.var_short_if < aa_0.var_k_0_arr_do.length)) {
            ((bm)this).cfr_renamed_4 = aa_0.var_k_0_arr_do[am2.var_short_if].cfr_renamed_5;
        }
        this.var_byte_this = (byte)hg.int_new(10);
    }

    public final void (Graphics graphics > 0) {
        graphics.drawImage(fh.var_javax_microedition_lcdui_Image_do, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3 + 1, 33);
        if ((this.var_byte_do == 0)) {
            aa_0.am_do(this.cfr_renamed_0).cfr_renamed_1(graphics, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3 + this.var_byte_this / 10 - this.var_short_do, 33);
            if ("   ".length() <= " ".length()) {
                return;
            }
        } else {
            ((bm)this).cfr_renamed_4 = (short)(aa_0.cfr_renamed_0((short)this.cfr_renamed_0).cfr_renamed_0 + 10);
            aa_0.cfr_renamed_1(graphics, this.cfr_renamed_0, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3 + this.var_byte_this / 10 - this.var_short_do, 33);
        }
        this.var_byte_this = (byte)(this.var_byte_this + this.cfr_renamed_9);
        if ((hg.int_do(this.var_byte_this) >= 10)) {
            this.var_byte_long = -this.var_byte_long;
        }
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[10];
        1 = " ".length();
        5 = 0xAD ^ 0xA8;
        0 = (168 + 138 - 247 + 168 ^ 86 + 53 - 64 + 114) & (0x5C ^ 0x6A ^ (0xC3 ^ 0xAB) ^ -" ".length());
        10 = 0xA9 ^ 0xA3;
        2 = "  ".length();
        -6 = -(0x2E ^ 0x28);
        4 = 0x7F ^ 0x2D ^ (0x3C ^ 0x6A);
        3 = "   ".length();
        50 = 5 ^ 0x37;
        33 = 0x50 ^ 0x6E ^ (0 ^ 0x1F);
    }

    public final void void_do() {
        switch (this.cfr_renamed_8) {
            case 0: 
            case 1: {
                ((bm)this).cfr_renamed_2 += (short)(this.soLuong - ((bm)this).cfr_renamed_2 >> 2);
                ((bm)this).cfr_renamed_3 += (short)(this.var_int_this - ((bm)this).cfr_renamed_3 >> 2);
                if ((this.cfr_renamed_13 >= -6)) {
                    this.var_short_do = (short)(this.var_short_do + this.cfr_renamed_13);
                    this.cfr_renamed_13 = (byte)(this.cfr_renamed_13 - 1);
                }
                if (ed.cfr_renamed_3(hg.int_do(((bm)this).cfr_renamed_2 - this.soLuong), 4) && !ed.cfr_renamed_4(hg.int_do(((bm)this).cfr_renamed_3 - this.var_int_this), 4) || !(this.var_short_do <= 1)) break;
                ((bm)this).cfr_renamed_2 = this.soLuong;
                ((bm)this).cfr_renamed_3 = this.var_int_this;
                this.var_short_do = (short)0;
                this.cfr_renamed_13 = (byte)0;
                if ((this.cfr_renamed_8 == 1)) {
                    fh.cfr_renamed_1(this);
                }
                this.cfr_renamed_8 = (byte)2;
                return;
            }
            case 3: {
                this.var_short_do = (short)(this.var_short_do + 3);
                if (!(this.var_short_do > 50)) break;
                fh.cfr_renamed_1(this);
                return;
            }
            case 4: {
                if ((this.var_short_do > 0)) {
                    this.var_short_do = (short)(this.var_short_do - this.cfr_renamed_13);
                    this.cfr_renamed_13 = (byte)(this.cfr_renamed_13 + 1);
                    return;
                }
                this.var_short_do = (short)0;
                this.cfr_renamed_8 = (byte)2;
            }
        }
    }

            static {
        ed.cfr_renamed_0();
    }

    }

