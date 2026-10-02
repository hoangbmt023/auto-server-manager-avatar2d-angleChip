/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class dB
extends bk_0 {
    public int soLuong;
    private byte cfr_renamed_18;
    public byte var_byte_do;
    public short var_short_do;
    public int var_int_long;
    short cfr_renamed_1;
    private byte var_byte_long;
    private byte var_byte_this = (byte)1;
    public int var_int_this;
    byte cfr_renamed_12;
    private static int[] mangSoNguyen;
    byte cfr_renamed_11;

                public final void void_do() {
        switch (this.cfr_renamed_12) {
            case 0: 
            case 1: {
                ((aG)this).cfr_renamed_3 += (short)(this.var_int_this - ((aG)this).cfr_renamed_3 >> 2);
                this.var_int_if += (short)(this.var_int_long - this.var_int_if >> 2);
                if ((this.cfr_renamed_11 >= -6)) {
                    this.cfr_renamed_1 = (short)(this.cfr_renamed_1 + this.cfr_renamed_11);
                    this.cfr_renamed_11 = (byte)(this.cfr_renamed_11 - 1);
                }
                if (dB.cfr_renamed_4(gc_0.int_if(((aG)this).cfr_renamed_3 - this.var_int_this), 4) && !(gc_0.int_if(this.var_int_if - this.var_int_long) < 4) || !(this.cfr_renamed_1 <= 1)) break;
                ((aG)this).cfr_renamed_3 = this.var_int_this;
                this.var_int_if = this.var_int_long;
                this.cfr_renamed_1 = (short)0;
                this.cfr_renamed_11 = (byte)0;
                if ((this.cfr_renamed_12 == 1)) {
                    ef_0.cfr_renamed_0(this);
                }
                this.cfr_renamed_12 = (byte)2;
                return;
            }
            case 3: {
                this.cfr_renamed_1 = (short)(this.cfr_renamed_1 + 3);
                if (!(this.cfr_renamed_1 > 50)) break;
                ef_0.cfr_renamed_0(this);
                return;
            }
            case 4: {
                if ((this.cfr_renamed_1 > 0)) {
                    this.cfr_renamed_1 = (short)(this.cfr_renamed_1 - this.cfr_renamed_11);
                    this.cfr_renamed_11 = (byte)(this.cfr_renamed_11 + 1);
                    return;
                }
                this.cfr_renamed_1 = (short)0;
                this.cfr_renamed_12 = (byte)2;
            }
        }
    }

    static {
        dB.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[10];
        1 = " ".length();
        5 = 0x6B ^ 0x6E;
        0 = (0xAC ^ 0xBE) & ~(0x72 ^ 0x60);
        10 = 0xB4 ^ 0xBE;
        2 = "  ".length();
        -6 = -(121 + 83 - 161 + 156 ^ 79 + 145 - 76 + 45);
        4 = 0x32 ^ 0x20 ^ (0x28 ^ 0x3E);
        3 = "   ".length();
        50 = 10 + 152 - 11 + 10 ^ 37 + 145 - 80 + 45;
        33 = 0x70 ^ 0x51;
    }

    public dB(byte by2, short s2, int n) {
        this.soLuong = n;
        this.var_byte_if = (byte)5;
        this.var_byte_do = by2;
        this.var_short_do = s2;
        this.cfr_renamed_18 = (byte)0;
        q_0 q_02 = ci_0.q_0_do(this.var_short_do);
        if ((q_02.var_short_if < ci_0.var_bH_arr_do.length)) {
            this.var_short_int = ci_0.var_bH_arr_do[q_02.var_short_if].cfr_renamed_3;
        }
        this.var_byte_long = (byte)gc_0.int_do(10);
    }

        public final void (Graphics graphics > 0) {
        graphics.drawImage(ef_0.var_javax_microedition_lcdui_Image_if, ((aG)this).cfr_renamed_3, this.var_int_if + 1, 33);
        if ((this.var_byte_do == 0)) {
            ci_0.q_0_do(this.var_short_do).cfr_renamed_1(graphics, ((aG)this).cfr_renamed_3, this.var_int_if + this.var_byte_long / 10 - this.cfr_renamed_1, 33);
            } else {
            this.var_short_int = (short)(ci_0.cfr_renamed_1((short)this.var_short_do).var_short_do + 10);
            ci_0.cfr_renamed_0(graphics, this.var_short_do, ((aG)this).cfr_renamed_3, this.var_int_if + this.var_byte_long / 10 - this.cfr_renamed_1, 33);
        }
        this.var_byte_long = (byte)(this.var_byte_long + this.var_byte_this);
        if ((gc_0.int_if(this.var_byte_long) >= 10)) {
            this.cfr_renamed_18 = -this.cfr_renamed_18;
        }
    }

                public dB() {
        this.var_byte_if = (byte)5;
    }
}

