/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class k {
    public static int[] mangSoNguyen;
    private int cfr_renamed_8;
    public int soLuong;
    public static String chuoiGiaTri;
    public int var_int_if;
    public int soLuongKhoa;
    private static int[] var_int_arr_int;
    public int var_int_int;
    public static byte var_byte_do;
    private int cfr_renamed_12;
    public static ep var_ep_do;
    public int[] var_int_arr_if;
    public int cfr_renamed_5;
    public int cfr_renamed_2;
    public int cfr_renamed_15 = var_int_arr_int[0];
    public int[] var_int_arr_for;
    private String tenNhanVat;
    public static ep var_ep_if;
    public static k var_k_do;
    private int cfr_renamed_11;

    public final void void_do(int n, int n2) {
        if ((n2 != this.var_int_if)) {
            this.var_int_arr_if[n2] = n;
            this.var_int_arr_for[n2] = gc_0.int_do(var_int_arr_int[7]);
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        public final void (Graphics graphics != null) {
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.cfr_renamed_2, this.soLuong, this.var_int_int, this.cfr_renamed_5, this.var_int_if, this.cfr_renamed_12, this.cfr_renamed_15, this.soLuongKhoa, var_byte_do, this.cfr_renamed_11, this.cfr_renamed_8, this.var_int_arr_for, this.var_int_arr_if, this.tenNhanVat);
        GameCanvas.cfr_renamed_1(graphics);
    }

    private static void cfr_renamed_3() {
        var_int_arr_int = new int[13];
        k.var_int_arr_int[0] = 0xAA ^ 0xA0;
        k.var_int_arr_int[1] = (0x8D ^ 0xB2) & ~(0x74 ^ 0x4B);
        k.var_int_arr_int[2] = " ".length();
        k.var_int_arr_int[3] = 0x65 ^ 0x74;
        k.var_int_arr_int[4] = "  ".length();
        k.var_int_arr_int[5] = 157 + 49 - 79 + 59 ^ 136 + 86 - 173 + 104;
        k.var_int_arr_int[6] = 0x32 ^ 0x51 ^ (0x1B ^ 0x50);
        k.var_int_arr_int[7] = 7 ^ 0x13;
        k.var_int_arr_int[8] = 0x29 ^ 0x75 ^ (0x5D ^ 4);
        k.var_int_arr_int[9] = "   ".length();
        k.var_int_arr_int[10] = 0xFFFFFEEF & 0xBDFBB8;
        k.var_int_arr_int[11] = -(0xFFFFFBED & 0x6E3B) & (0xFFFFFB7F & 0x57FFEF);
        k.var_int_arr_int[12] = 151 + 67 - 145 + 112 ^ 150 + 135 - 236 + 140;
    }

    public final void void_do(int n) {
        this.var_int_arr_if = new int[n];
        this.var_int_arr_for = new int[n];
        this.cfr_renamed_11 = n;
    }

    public final void (String string, int n != null) {
        if ((this.var_int_arr_if != null) && (n < this.var_int_arr_if.length)) {
            this.var_int_arr_if[n] = var_int_arr_int[1];
        }
        this.tenNhanVat = string;
        int n2 = GameCanvas.var_ew_try.cfr_renamed_0(this.tenNhanVat) + var_int_arr_int[0];
        if (k.boolean_do(n2, this.soLuongKhoa)) {
            this.soLuongKhoa = n2;
            this.cfr_renamed_8 = (this.cfr_renamed_5 - this.soLuongKhoa) / this.cfr_renamed_15;
        }
        this.var_int_if = n;
        if ((this.var_int_if >= this.cfr_renamed_8) && k.boolean_do(this.cfr_renamed_8)) {
            this.cfr_renamed_12 = this.var_int_if - (this.cfr_renamed_8 - var_int_arr_int[2]);
        }
        if ((this.var_int_if < this.cfr_renamed_12)) {
            this.cfr_renamed_12 = this.var_int_if;
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

        public static void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        (n, n2, n3, n4, mangSoNguyen[var_int_arr_int[1]], graphics != null);
        graphics.setColor(mangSoNguyen[var_int_arr_int[4]]);
        graphics.drawRect(n, n2, n3, n4);
        graphics.setColor(var_int_arr_int[10]);
        graphics.drawRect(n + var_int_arr_int[2], n2 + var_int_arr_int[2], n3 - var_int_arr_int[4], n4 - var_int_arr_int[4]);
        graphics.setColor(var_int_arr_int[11]);
        graphics.drawRect(n + var_int_arr_int[4], n2 + var_int_arr_int[4], n3 - var_int_arr_int[12], n4 - var_int_arr_int[12]);
    }

        public k() {
        this.cfr_renamed_12 = var_int_arr_int[1];
        var_byte_do = (byte)(bn_0.var_byte_new << var_int_arr_int[2]);
        if ((GameCanvas.gameCanvas != null) && (GameCanvas.coTrangThai ? 1 : 0 == null)) {
            this.cfr_renamed_15 = var_int_arr_int[3];
            } else {
            this.cfr_renamed_15 = var_int_arr_int[0];
        }
        if ((GameCanvas.cfr_renamed_16 == null)) {
            this.cfr_renamed_15 *= GameCanvas.cfr_renamed_16 + var_int_arr_int[2];
        }
    }

    public static void void_do() {
        AngelChip.chuoiGiaTri = "ig_,";
        chuoiGiaTri = "plg";
        fw.chuoiGiaTri = GameCanvas.java_lang_String_do(AngelChip.chuoiGiaTri, var_int_arr_int[8]);
    }

    public final void (String object, int n, int n2, int n3 != null) {
        this.cfr_renamed_5 = n;
        this.var_int_int = n2;
        this.cfr_renamed_11 = n3;
        String string = object;
        object = this;
        if ((string != null)) {
            int n4;
            ((k)object).tenNhanVat = string;
            if (k.boolean_do(GameCanvas.var_ew_try.cfr_renamed_0(((k)object).tenNhanVat), ((k)object).cfr_renamed_5 / var_int_arr_int[4]) && k.boolean_do(((k)object).tenNhanVat.length(), var_int_arr_int[0])) {
                ((k)object).tenNhanVat = ((k)object).tenNhanVat.substring(var_int_arr_int[1], var_int_arr_int[0]);
            }
            int n5 = GameCanvas.var_ew_try.cfr_renamed_0(((k)object).tenNhanVat) + var_int_arr_int[0];
            if ((GameCanvas.cfr_renamed_16 == null)) {
                n4 = var_int_arr_int[5] * GameCanvas.cfr_renamed_16;
                if ((41 + 115 - 88 + 84 ^ 76 + 139 - 122 + 63) < 0) {
                    return;
                }
            } else {
                n4 = var_int_arr_int[1];
            }
            ((k)object).soLuongKhoa = n5 + n4;
        }
        if ((this.soLuongKhoa < var_int_arr_int[6])) {
            this.soLuongKhoa = var_int_arr_int[6];
        }
        this.cfr_renamed_1();
        this.var_int_if = var_int_arr_int[1];
        this.var_int_arr_if = new int[this.cfr_renamed_11];
        this.var_int_arr_for = new int[this.cfr_renamed_11];
        this.cfr_renamed_8 = (this.cfr_renamed_5 - this.soLuongKhoa) / this.cfr_renamed_15;
        this.cfr_renamed_12 = var_int_arr_int[1];
    }

    public final void cfr_renamed_1() {
        this.cfr_renamed_2 = GameCanvas.var_int_int - this.cfr_renamed_5 / var_int_arr_int[4];
        this.soLuong = (GameCanvas.this - GameCanvas.var_int_else) / var_int_arr_int[4] - this.var_int_int / var_int_arr_int[4];
    }

    public static void (int n, int n2, int n3, int n4, int n5, Graphics graphics != null) {
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
    }

            public static k k_do() {
        if ((var_k_do == null)) {
            var_k_do = new k();
        }
        return var_k_do;
    }

    static {
        k.cfr_renamed_3();
    }

        /*
     * Unable to fully structure code
     */
    public final int int_do() {
        block5: {
            if (!k.cfr_renamed_1((int)GameCanvas.coKichHoat)) break block5;
            var1_1 = this.var_int_if - k.var_int_arr_int[2];
            if (((7 ^ 9 ^ (222 ^ 139)) & (8 ^ 51 ^ (214 ^ 182) ^ -" ".length())) < (153 + 78 - 58 + 24 ^ 116 + 157 - 209 + 129)) ** GOTO lbl11
            return (11 + 212 - 8 + 21 ^ 5 + 13 - -67 + 87) & (235 ^ 154 ^ (176 ^ 129) ^ -" ".length());
lbl-1000:
            // 1 sources

            {
                var2_2 = var1_1 - this.cfr_renamed_12;
                if (k.cfr_renamed_1((int)GameCanvas.boolean_if(this.cfr_renamed_2 + k.var_int_arr_int[9] + var2_2 * this.cfr_renamed_15, this.soLuong + k.var_int_arr_int[9], this.cfr_renamed_15, k.var_byte_do))) {
                    return var1_1 - this.var_int_if;
                }
                --var1_1;
lbl11:
                // 2 sources

                ** while (!k.cfr_renamed_4((int)var1_1, (int)this.cfr_renamed_12))
            }
lbl12:
            // 1 sources

            var1_1 = this.cfr_renamed_11;
            if ((var1_1 >= this.cfr_renamed_8)) {
                var1_1 = this.cfr_renamed_8 + this.cfr_renamed_12;
            }
            var3_3 = this.var_int_if + k.var_int_arr_int[2];
            if (null == null) ** GOTO lbl24
            return " ".length() & (" ".length() ^ -" ".length());
lbl-1000:
            // 1 sources

            {
                var2_2 = var3_3 - this.cfr_renamed_12;
                if (k.cfr_renamed_1((int)GameCanvas.boolean_if(this.cfr_renamed_2 + k.var_int_arr_int[9] + var2_2 * this.cfr_renamed_15 + (this.soLuongKhoa - this.cfr_renamed_15), this.soLuong + k.var_int_arr_int[9], this.cfr_renamed_15, k.var_byte_do))) {
                    return var3_3 - this.var_int_if;
                }
                ++var3_3;
lbl24:
                // 2 sources

                ** while (!k.cfr_renamed_3((int)var3_3, (int)var1_1))
            }
        }
        return k.var_int_arr_int[1];
    }
}

