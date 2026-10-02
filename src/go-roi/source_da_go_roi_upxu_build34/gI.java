/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class gI {
    private int var_int_if;
    private static int[] mangSoNguyen;
    int soLuong;
    boolean dangChayAuto;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private static int[][] var_int_arr_arr_do;
    private static byte var_byte_do;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private static byte var_byte_if;

        public gI(int n, int n2, int n3, int n4) {
        this.var_int_if = n;
        this.cfr_renamed_5 = n2;
        this.cfr_renamed_4 = n3;
        this.soLuong = n4;
        this.dangChayAuto = 0;
        var_byte_if = (byte)50;
        var_byte_do = (byte)54;
        if ((bn_0.cfr_renamed_6 == 2)) {
            int n5 = 108;
            var_byte_if = (byte)n5;
            var_byte_do = (byte)n5;
        }
    }

    public final void (Graphics graphics == 0) {
        if (gI.cfr_renamed_3(ci_0.cfr_renamed_1((short)874).soLuong, -1)) {
            graphics.drawRegion(ci_0.cfr_renamed_1((short)874).var_javax_microedition_lcdui_Image_do, 0, this.cfr_renamed_3 * var_byte_if, (int)var_byte_do, (int)var_byte_if, 0, this.var_int_if, this.cfr_renamed_5, 17);
        }
    }

    static {
        gI.cfr_renamed_1();
        int[][] nArrayArray = new int[3][];
        int[] nArray = new int[8];
        nArray[0] = 6;
        nArray[2] = 7;
        nArray[3] = 1;
        nArray[4] = 6;
        nArray[5] = 2;
        nArray[6] = 7;
        nArray[7] = 3;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = 6;
        nArray2[1] = 5;
        nArray2[2] = 7;
        nArray2[3] = 4;
        nArray2[4] = 6;
        nArray2[5] = 3;
        nArray2[6] = 7;
        nArray2[7] = 2;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[8];
        nArray3[0] = 7;
        nArray3[1] = 4;
        nArray3[2] = 6;
        nArray3[3] = 1;
        nArray3[4] = 7;
        nArray3[5] = 3;
        nArray3[6] = 6;
        nArray3[7] = 5;
        nArrayArray[2] = nArray3;
        var_int_arr_arr_do = nArrayArray;
    }

    public final void cfr_renamed_0() {
        if (!(this.dangChayAuto)) {
            if ((GameCanvas.var_int_try % 2 == 0)) {
                this.cfr_renamed_2 += 1;
                if ((this.cfr_renamed_2 > var_int_arr_arr_do[this.cfr_renamed_4].length - 1)) {
                    this.cfr_renamed_2 = 0;
                }
            }
            this.cfr_renamed_3 = var_int_arr_arr_do[this.cfr_renamed_4][this.cfr_renamed_2];
            return;
        }
        this.cfr_renamed_3 = this.soLuong;
    }

                private static void cfr_renamed_1() {
        mangSoNguyen = new int[15];
        3 = "   ".length();
        0 = (0xFC ^ 0xA1 ^ (0x56 ^ 0x1A)) & (116 + 43 - -8 + 6 ^ 69 + 174 - 121 + 66 ^ -" ".length());
        8 = 0xA5 ^ 0xAD;
        6 = 31 + 24 - 25 + 106 ^ 108 + 40 - 78 + 72;
        2 = "  ".length();
        7 = 0x49 ^ 0x26 ^ (0x56 ^ 0x3E);
        1 = " ".length();
        4 = 0x1E ^ 0x23 ^ (0x82 ^ 0xBB);
        5 = 0xB5 ^ 0xB0;
        50 = 56 + 19 - 15 + 80 ^ 72 + 91 - 37 + 64;
        54 = 0xF7 ^ 0xC1;
        108 = 0xB8 ^ 0xAC ^ (0xD7 ^ 0xAF);
        874 = -(0xFFFFDE4F & 0x65B2) & (0xFFFFE7EB & 0x5F7F);
        -1 = -" ".length();
        17 = 30 + 33 - 23 + 96 ^ 125 + 98 - 70 + 0;
    }
}

