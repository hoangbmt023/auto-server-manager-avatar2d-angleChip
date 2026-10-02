/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class dC {
    public int soLuong;
    public boolean dangChayAuto;
    private static int[] var_int_arr_if;
    public int[] mangSoNguyen;
    public int var_int_if;
    public int cfr_renamed_2;
    public boolean coTrangThai;
    public byte var_byte_do;
    public int cfr_renamed_3;
    public int cfr_renamed_4;
    public int cfr_renamed_5;
    public int cfr_renamed_6;
    public int cfr_renamed_7;
    public byte var_byte_if;

    public final void (Graphics graphics != 0) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this);
    }

                public dC(byte by2) {
        int n;
        this.var_byte_do = by2;
        this.var_byte_if = (byte)var_int_arr_if[1];
        this.cfr_renamed_5 = this.var_byte_do % var_int_arr_if[6];
        this.cfr_renamed_3 = this.var_byte_do / var_int_arr_if[6];
        if ((this.cfr_renamed_5 < var_int_arr_if[7])) {
            n = var_int_arr_if[1];
            } else {
            n = var_int_arr_if[3];
        }
        this.soLuong = n;
        int[] nArray = new int[var_int_arr_if[0]];
        nArray[dC.var_int_arr_if[3]] = var_int_arr_if[3];
        nArray[dC.var_int_arr_if[7]] = var_int_arr_if[7];
        nArray[dC.var_int_arr_if[5]] = var_int_arr_if[5];
        nArray[dC.var_int_arr_if[6]] = var_int_arr_if[6];
        nArray[dC.var_int_arr_if[8]] = var_int_arr_if[8];
        nArray[dC.var_int_arr_if[9]] = var_int_arr_if[9];
        nArray[dC.var_int_arr_if[10]] = var_int_arr_if[10];
        nArray[dC.var_int_arr_if[11]] = var_int_arr_if[11];
        nArray[dC.var_int_arr_if[12]] = var_int_arr_if[12];
        nArray[dC.var_int_arr_if[13]] = var_int_arr_if[13];
        nArray[dC.var_int_arr_if[2]] = var_int_arr_if[2];
        nArray[dC.var_int_arr_if[4]] = var_int_arr_if[4];
        this.mangSoNguyen = nArray;
    }

    static {
        dC.void_do();
    }

        public final void (Graphics graphics < boolean bl) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this, bl);
    }

        public final void cfr_renamed_0(Graphics graphics) {
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics, this);
    }

    public final void cfr_renamed_2(Graphics graphics) {
        GameCanvas.var_fa_0_do.cfr_renamed_2(graphics, this);
    }

    public final int int_do() {
        if ((this.cfr_renamed_2 == this.var_int_if) && (this.cfr_renamed_4 == this.cfr_renamed_7)) {
            return var_int_arr_if[14];
        }
        if (dC.cfr_renamed_3(Math.abs((this.var_int_if - this.cfr_renamed_2) / var_int_arr_if[7]), var_int_arr_if[3]) && dC.cfr_renamed_3(Math.abs((this.cfr_renamed_7 - this.cfr_renamed_4) / var_int_arr_if[7]), var_int_arr_if[3])) {
            this.cfr_renamed_2 = this.var_int_if;
            this.cfr_renamed_4 = this.cfr_renamed_7;
            return var_int_arr_if[1];
        }
        if ((this.cfr_renamed_2 != this.var_int_if)) {
            this.cfr_renamed_2 += (this.var_int_if - this.cfr_renamed_2) / var_int_arr_if[7];
        }
        if ((this.cfr_renamed_4 != this.cfr_renamed_7)) {
            this.cfr_renamed_4 += (this.cfr_renamed_7 - this.cfr_renamed_4) / var_int_arr_if[7];
        }
        if ((hg.cfr_renamed_1(this.cfr_renamed_2, this.cfr_renamed_4, this.var_int_if, this.cfr_renamed_7) <= this.cfr_renamed_6 / var_int_arr_if[8])) {
            return var_int_arr_if[7];
        }
        return var_int_arr_if[3];
    }

    public dC(byte by2, boolean bl) {
        this(by2);
        if ((bl)) {
            int[] nArray = new int[var_int_arr_if[0]];
            nArray[dC.var_int_arr_if[1]] = var_int_arr_if[2];
            nArray[dC.var_int_arr_if[3]] = var_int_arr_if[4];
            nArray[dC.var_int_arr_if[5]] = var_int_arr_if[3];
            nArray[dC.var_int_arr_if[6]] = var_int_arr_if[7];
            nArray[dC.var_int_arr_if[8]] = var_int_arr_if[5];
            nArray[dC.var_int_arr_if[9]] = var_int_arr_if[6];
            nArray[dC.var_int_arr_if[10]] = var_int_arr_if[8];
            nArray[dC.var_int_arr_if[11]] = var_int_arr_if[9];
            nArray[dC.var_int_arr_if[12]] = var_int_arr_if[10];
            nArray[dC.var_int_arr_if[13]] = var_int_arr_if[11];
            nArray[dC.var_int_arr_if[2]] = var_int_arr_if[12];
            nArray[dC.var_int_arr_if[4]] = var_int_arr_if[13];
            this.mangSoNguyen = nArray;
        }
    }

    private static void void_do() {
        var_int_arr_if = new int[15];
        dC.var_int_arr_if[0] = 18 + 30 - 1 + 100 ^ 115 + 137 - 207 + 113;
        dC.var_int_arr_if[1] = (162 + 98 - 184 + 129 ^ 94 + 1 - 42 + 75) & (0x5E ^ 0x65 ^ (0xE9 ^ 0x9F) ^ -" ".length());
        dC.var_int_arr_if[2] = 0x32 ^ 0x39;
        dC.var_int_arr_if[3] = " ".length();
        dC.var_int_arr_if[4] = 0xCD ^ 0xBF ^ (0x37 ^ 0x49);
        dC.var_int_arr_if[5] = "   ".length();
        dC.var_int_arr_if[6] = 0x39 ^ 0x3D;
        dC.var_int_arr_if[7] = "  ".length();
        dC.var_int_arr_if[8] = 0x3D ^ 0x4D ^ (0x25 ^ 0x50);
        dC.var_int_arr_if[9] = 61 + 24 - -72 + 27 ^ 81 + 101 - 90 + 98;
        dC.var_int_arr_if[10] = 0x35 ^ 0x19 ^ (0x28 ^ 3);
        dC.var_int_arr_if[11] = 64 + 1 - -51 + 57 ^ 25 + 138 - 150 + 152;
        dC.var_int_arr_if[12] = 0xB3 ^ 0xBA;
        dC.var_int_arr_if[13] = 0x45 ^ 0x76 ^ (0x9D ^ 0xA4);
        dC.var_int_arr_if[14] = -" ".length();
    }
}

