/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class fb {
    public byte var_byte_do;
    private static int[] var_int_arr_if;
    public byte var_byte_if;
    public int[] mangSoNguyen;
    public int soLuong;
    public boolean dangChayAuto;
    public int var_int_if;
    public boolean coTrangThai;
    public int cfr_renamed_3;
    public int cfr_renamed_4;
    public int cfr_renamed_5;
    public int cfr_renamed_2;
    public int cfr_renamed_15;
    public int cfr_renamed_8;

        public final void (Graphics graphics != 0) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this);
    }

    static {
        fb.void_do();
    }

    public final void cfr_renamed_1(Graphics graphics) {
        GameCanvas.var_gj_0_do.cfr_renamed_3(graphics, this);
    }

    public final int int_do() {
        if ((this.cfr_renamed_2 == this.cfr_renamed_3) && (this.cfr_renamed_5 == this.var_int_if)) {
            return var_int_arr_if[14];
        }
        if (fb.cfr_renamed_0(Math.abs((this.cfr_renamed_3 - this.cfr_renamed_2) / var_int_arr_if[7]), var_int_arr_if[3]) && fb.cfr_renamed_0(Math.abs((this.var_int_if - this.cfr_renamed_5) / var_int_arr_if[7]), var_int_arr_if[3])) {
            this.cfr_renamed_2 = this.cfr_renamed_3;
            this.cfr_renamed_5 = this.var_int_if;
            return var_int_arr_if[1];
        }
        if ((this.cfr_renamed_2 != this.cfr_renamed_3)) {
            this.cfr_renamed_2 += (this.cfr_renamed_3 - this.cfr_renamed_2) / var_int_arr_if[7];
        }
        if ((this.cfr_renamed_5 != this.var_int_if)) {
            this.cfr_renamed_5 += (this.var_int_if - this.cfr_renamed_5) / var_int_arr_if[7];
        }
        if ((gc_0.cfr_renamed_0(this.cfr_renamed_2, this.cfr_renamed_5, this.cfr_renamed_3, this.var_int_if) <= this.soLuong / var_int_arr_if[8])) {
            return var_int_arr_if[7];
        }
        return var_int_arr_if[3];
    }

    public fb(byte by2) {
        int n;
        this.var_byte_if = by2;
        this.var_byte_do = (byte)var_int_arr_if[1];
        this.cfr_renamed_15 = this.var_byte_if % var_int_arr_if[6];
        this.cfr_renamed_8 = this.var_byte_if / var_int_arr_if[6];
        if ((this.cfr_renamed_15 < var_int_arr_if[7])) {
            n = var_int_arr_if[1];
            if (-"  ".length() > 0) {
                throw null;
            }
        } else {
            n = var_int_arr_if[3];
        }
        this.cfr_renamed_4 = n;
        int[] nArray = new int[var_int_arr_if[0]];
        nArray[fb.var_int_arr_if[3]] = var_int_arr_if[3];
        nArray[fb.var_int_arr_if[7]] = var_int_arr_if[7];
        nArray[fb.var_int_arr_if[5]] = var_int_arr_if[5];
        nArray[fb.var_int_arr_if[6]] = var_int_arr_if[6];
        nArray[fb.var_int_arr_if[8]] = var_int_arr_if[8];
        nArray[fb.var_int_arr_if[9]] = var_int_arr_if[9];
        nArray[fb.var_int_arr_if[10]] = var_int_arr_if[10];
        nArray[fb.var_int_arr_if[11]] = var_int_arr_if[11];
        nArray[fb.var_int_arr_if[12]] = var_int_arr_if[12];
        nArray[fb.var_int_arr_if[13]] = var_int_arr_if[13];
        nArray[fb.var_int_arr_if[2]] = var_int_arr_if[2];
        nArray[fb.var_int_arr_if[4]] = var_int_arr_if[4];
        this.mangSoNguyen = nArray;
    }

        public final void (Graphics graphics <= boolean bl) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this, bl);
    }

    private static void void_do() {
        var_int_arr_if = new int[15];
        fb.var_int_arr_if[0] = 0xAC ^ 0xA1;
        fb.var_int_arr_if[1] = (5 ^ 0x48) & ~(0x1D ^ 0x50);
        fb.var_int_arr_if[2] = 0x54 ^ 5 ^ (0x3D ^ 0x67);
        fb.var_int_arr_if[3] = " ".length();
        fb.var_int_arr_if[4] = 0x24 ^ 0x4A ^ (0x5B ^ 0x39);
        fb.var_int_arr_if[5] = "   ".length();
        fb.var_int_arr_if[6] = 53 + 120 - 145 + 150 ^ 181 + 25 - 182 + 158;
        fb.var_int_arr_if[7] = "  ".length();
        fb.var_int_arr_if[8] = 0xBF ^ 0xBA;
        fb.var_int_arr_if[9] = 0xEE ^ 0xAB ^ (0xD5 ^ 0x96);
        fb.var_int_arr_if[10] = 0x23 ^ 0x24;
        fb.var_int_arr_if[11] = 74 + 19 - 89 + 159 ^ 76 + 83 - 93 + 105;
        fb.var_int_arr_if[12] = 117 + 118 - 79 + 8 ^ 118 + 30 - 105 + 130;
        fb.var_int_arr_if[13] = 0x17 ^ 0x1D;
        fb.var_int_arr_if[14] = -" ".length();
    }

            public final void cfr_renamed_3(Graphics graphics) {
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, this);
    }

        public fb(byte by2, boolean bl) {
        this(by2);
        if ((bl)) {
            int[] nArray = new int[var_int_arr_if[0]];
            nArray[fb.var_int_arr_if[1]] = var_int_arr_if[2];
            nArray[fb.var_int_arr_if[3]] = var_int_arr_if[4];
            nArray[fb.var_int_arr_if[5]] = var_int_arr_if[3];
            nArray[fb.var_int_arr_if[6]] = var_int_arr_if[7];
            nArray[fb.var_int_arr_if[8]] = var_int_arr_if[5];
            nArray[fb.var_int_arr_if[9]] = var_int_arr_if[6];
            nArray[fb.var_int_arr_if[10]] = var_int_arr_if[8];
            nArray[fb.var_int_arr_if[11]] = var_int_arr_if[9];
            nArray[fb.var_int_arr_if[12]] = var_int_arr_if[10];
            nArray[fb.var_int_arr_if[13]] = var_int_arr_if[11];
            nArray[fb.var_int_arr_if[2]] = var_int_arr_if[12];
            nArray[fb.var_int_arr_if[4]] = var_int_arr_if[13];
            this.mangSoNguyen = nArray;
        }
    }
}

