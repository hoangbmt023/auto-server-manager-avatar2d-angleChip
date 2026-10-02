/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gZ
 */
public final class gz_0 {
    private static byte var_byte_do;
    int soLuong;
    private int var_int_if;
    private int cfr_renamed_2;
    private static int[] mangSoNguyen;
    boolean dangChayAuto;
    private int cfr_renamed_3;
    private static int[][] var_int_arr_arr_do;
    private static byte var_byte_if;
    private int cfr_renamed_4;
    private int cfr_renamed_5;

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[15];
        3 = "   ".length();
        0 = (0x38 ^ 0x28 ^ (0x33 ^ 0x13)) & (0xB0 ^ 0x91 ^ (0x2D ^ 0x3C) ^ -" ".length());
        8 = 31 + 26 - 10 + 87 ^ 19 + 63 - -39 + 21;
        6 = 0xC9 ^ 0x93 ^ (0x1B ^ 0x47);
        2 = "  ".length();
        7 = 103 + 49 - 96 + 131 ^ 70 + 104 - 90 + 104;
        1 = " ".length();
        4 = 0x38 ^ 0x3C;
        5 = 0xA0 ^ 0x8A ^ (0x15 ^ 0x3A);
        50 = 0x55 ^ 0x67;
        54 = 0x57 ^ 0x14 ^ (0xD5 ^ 0xA0);
        108 = 0xEC ^ 0x80;
        874 = 0xFFFFC3EB & 0x3F7E;
        -1 = -" ".length();
        17 = 99 + 150 - 246 + 212 ^ 47 + 169 - 18 + 0;
    }

    static {
        gz_0.cfr_renamed_0();
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

    public final void (Graphics graphics == 0) {
        if (gz_0.cfr_renamed_0(aa_0.cfr_renamed_0((short)874).soLuong, -1)) {
            graphics.drawRegion(aa_0.cfr_renamed_0((short)874).var_javax_microedition_lcdui_Image_do, 0, this.cfr_renamed_4 * var_byte_if, (int)var_byte_do, (int)var_byte_if, 0, this.cfr_renamed_2, this.cfr_renamed_3, 17);
        }
    }

    public gz_0(int n, int n2, int n3, int n4) {
        this.cfr_renamed_2 = n;
        this.cfr_renamed_3 = n2;
        this.cfr_renamed_5 = n3;
        this.soLuong = n4;
        this.dangChayAuto = 0;
        var_byte_if = (byte)50;
        var_byte_do = (byte)54;
        if ((dF.cfr_renamed_12 == 2)) {
            int n5 = 108;
            var_byte_if = (byte)n5;
            var_byte_do = (byte)n5;
        }
    }

    public final void cfr_renamed_1() {
        if (!(this.dangChayAuto)) {
            if ((GameCanvas.var_int_goto % 2 == 0)) {
                this.var_int_if += 1;
                if ((this.var_int_if > var_int_arr_arr_do[this.cfr_renamed_5].length - 1)) {
                    this.var_int_if = 0;
                }
            }
            this.cfr_renamed_4 = var_int_arr_arr_do[this.cfr_renamed_5][this.var_int_if];
            return;
        }
        this.cfr_renamed_4 = this.soLuong;
    }

            }

