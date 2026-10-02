/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from v
 */
public final class v_0 {
    public static v_0 var_v_0_do;
    public int soLuong;
    private int cfr_renamed_7;
    public int[] mangSoNguyen;
    public int var_int_if;
    private int cfr_renamed_8;
    public static byte var_byte_do;
    public int soLuongKhoa;
    private String tenNhanVat;
    public int var_int_int = var_int_arr_int[0];
    public int[] var_int_arr_if;
    public int cfr_renamed_4;
    public int cfr_renamed_5;
    public int cfr_renamed_6;
    public static int[] var_int_arr_for;
    public static cu_0 var_cu_0_do;
    public static cu_0 var_cu_0_if;
    private int cfr_renamed_13;
    private static int[] var_int_arr_int;
    public static String chuoiGiaTri;

    public static void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        (n, n2, n3, n4, var_int_arr_for[var_int_arr_int[1]], graphics != null);
        graphics.setColor(var_int_arr_for[var_int_arr_int[4]]);
        graphics.drawRect(n, n2, n3, n4);
        graphics.setColor(var_int_arr_int[10]);
        graphics.drawRect(n + var_int_arr_int[2], n2 + var_int_arr_int[2], n3 - var_int_arr_int[4], n4 - var_int_arr_int[4]);
        graphics.setColor(var_int_arr_int[11]);
        graphics.drawRect(n + var_int_arr_int[4], n2 + var_int_arr_int[4], n3 - var_int_arr_int[12], n4 - var_int_arr_int[12]);
    }

    public static void void_do() {
        AngelChip.tenNhanVat = "ig_,";
        chuoiGiaTri = "plg";
        gO.chuoiGiaTri = GameCanvas.java_lang_String_do(AngelChip.tenNhanVat, var_int_arr_int[8]);
    }

    private static void cfr_renamed_2() {
        var_int_arr_int = new int[13];
        v_0.var_int_arr_int[0] = 0x4D ^ 0x47;
        v_0.var_int_arr_int[1] = (0x2E ^ 0x53 ^ (0x83 ^ 0xC2)) & (88 + 147 - 111 + 32 ^ 114 + 86 - 147 + 107 ^ -" ".length());
        v_0.var_int_arr_int[2] = " ".length();
        v_0.var_int_arr_int[3] = 0x68 ^ 0x79;
        v_0.var_int_arr_int[4] = "  ".length();
        v_0.var_int_arr_int[5] = 0xAA ^ 0x89;
        v_0.var_int_arr_int[6] = 0x7F ^ 0x57;
        v_0.var_int_arr_int[7] = 0x34 ^ 0x1E ^ (0x22 ^ 0x1C);
        v_0.var_int_arr_int[8] = 1 ^ 4;
        v_0.var_int_arr_int[9] = "   ".length();
        v_0.var_int_arr_int[10] = -(0xFFFF9DB6 & 0x674F) & (0xFFFFFFBD & 0xBDFFEF);
        v_0.var_int_arr_int[11] = 0xFFFFB76F & 0x57D9D7;
        v_0.var_int_arr_int[12] = 3 ^ 0x2A ^ (0x14 ^ 0x39);
    }

    public v_0() {
        this.cfr_renamed_8 = var_int_arr_int[1];
        var_byte_do = (byte)(dF.var_byte_try << var_int_arr_int[2]);
        if ((GameCanvas.gameCanvas != null) && v_0.boolean_do(GameCanvas.var_boolean_try ? 1 : 0)) {
            this.var_int_int = var_int_arr_int[3];
            } else {
            this.var_int_int = var_int_arr_int[0];
        }
        if (v_0.boolean_do(GameCanvas.cfr_renamed_12)) {
            this.var_int_int *= GameCanvas.cfr_renamed_12 + var_int_arr_int[2];
        }
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_fa_0_do.cfr_renamed_1(graphics, this.cfr_renamed_5, this.cfr_renamed_6, this.var_int_if, this.soLuongKhoa, this.soLuong, this.cfr_renamed_8, this.var_int_int, this.cfr_renamed_4, var_byte_do, this.cfr_renamed_13, this.cfr_renamed_7, this.mangSoNguyen, this.var_int_arr_if, this.tenNhanVat);
        GameCanvas.hienThongBaoPopup(graphics);
    }

    public final void (String string, int n != null) {
        if ((this.var_int_arr_if != null) && v_0.boolean_do(n, this.var_int_arr_if.length)) {
            this.var_int_arr_if[n] = var_int_arr_int[1];
        }
        this.tenNhanVat = string;
        int n2 = GameCanvas.var_fz_0_try.cfr_renamed_1(this.tenNhanVat) + var_int_arr_int[0];
        if ((n2 > this.cfr_renamed_4)) {
            this.cfr_renamed_4 = n2;
            this.cfr_renamed_7 = (this.soLuongKhoa - this.cfr_renamed_4) / this.var_int_int;
        }
        this.soLuong = n;
        if ((this.soLuong >= this.cfr_renamed_7) && (this.cfr_renamed_7 > 0)) {
            this.cfr_renamed_8 = this.soLuong - (this.cfr_renamed_7 - var_int_arr_int[2]);
        }
        if (v_0.boolean_do(this.soLuong, this.cfr_renamed_8)) {
            this.cfr_renamed_8 = this.soLuong;
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void cfr_renamed_0() {
        this.cfr_renamed_5 = GameCanvas.cfr_renamed_15 - this.soLuongKhoa / var_int_arr_int[4];
        this.cfr_renamed_6 = (GameCanvas.var_int_int - GameCanvas.this) / var_int_arr_int[4] - this.var_int_if / var_int_arr_int[4];
    }

            /*
     * Unable to fully structure code
     */
    public final int int_do() {
        block5: {
            if (!v_0.boolean_do((int)GameCanvas.coTrangThai)) break block5;
            var1_1 = this.soLuong - v_0.var_int_arr_int[2];
            if (" ".length() >= 0) ** GOTO lbl11
            return (52 ^ 13) & ~(46 ^ 23);
lbl-1000:
            // 1 sources

            {
                var2_2 = var1_1 - this.cfr_renamed_8;
                if (v_0.boolean_do((int)GameCanvas.boolean_do(this.cfr_renamed_5 + v_0.var_int_arr_int[9] + var2_2 * this.var_int_int, this.cfr_renamed_6 + v_0.var_int_arr_int[9], this.var_int_int, v_0.var_byte_do))) {
                    return var1_1 - this.soLuong;
                }
                --var1_1;
lbl11:
                // 2 sources

                ** while (!v_0.boolean_do((int)var1_1, (int)this.cfr_renamed_8))
            }
lbl12:
            // 1 sources

            var1_1 = this.cfr_renamed_13;
            if ((var1_1 >= this.cfr_renamed_7)) {
                var1_1 = this.cfr_renamed_7 + this.cfr_renamed_8;
            }
            var3_3 = this.soLuong + v_0.var_int_arr_int[2];
            if (null == null) ** GOTO lbl24
            return (200 ^ 142 ^ (114 ^ 103)) & (249 ^ 130 ^ (51 ^ 27) ^ -" ".length());
lbl-1000:
            // 1 sources

            {
                var2_2 = var3_3 - this.cfr_renamed_8;
                if (v_0.boolean_do((int)GameCanvas.boolean_do(this.cfr_renamed_5 + v_0.var_int_arr_int[9] + var2_2 * this.var_int_int + (this.cfr_renamed_4 - this.var_int_int), this.cfr_renamed_6 + v_0.var_int_arr_int[9], this.var_int_int, v_0.var_byte_do))) {
                    return var3_3 - this.soLuong;
                }
                ++var3_3;
lbl24:
                // 2 sources

                ** while (!v_0.cfr_renamed_2((int)var3_3, (int)var1_1))
            }
        }
        return v_0.var_int_arr_int[1];
    }

    public static void (int n, int n2, int n3, int n4, int n5, Graphics graphics != null) {
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
    }

    static {
        v_0.cfr_renamed_2();
    }

        public final void void_do(int n) {
        this.var_int_arr_if = new int[n];
        this.mangSoNguyen = new int[n];
        this.cfr_renamed_13 = n;
    }

    public final void void_do(int n, int n2) {
        if ((n2 != this.soLuong)) {
            this.var_int_arr_if[n2] = n;
            this.mangSoNguyen[n2] = hg.int_new(var_int_arr_int[7]);
        }
    }

    public final void (String object, int n, int n2, int n3 != null) {
        this.soLuongKhoa = n;
        this.var_int_if = n2;
        this.cfr_renamed_13 = n3;
        String string = object;
        object = this;
        if ((string != null)) {
            int n4;
            ((v_0)object).tenNhanVat = string;
            if (v_0.cfr_renamed_3(GameCanvas.var_fz_0_try.cfr_renamed_1(((v_0)object).tenNhanVat), ((v_0)object).soLuongKhoa / var_int_arr_int[4]) && v_0.cfr_renamed_3(((v_0)object).tenNhanVat.length(), var_int_arr_int[0])) {
                ((v_0)object).tenNhanVat = ((v_0)object).tenNhanVat.substring(var_int_arr_int[1], var_int_arr_int[0]);
            }
            int n5 = GameCanvas.var_fz_0_try.cfr_renamed_1(((v_0)object).tenNhanVat) + var_int_arr_int[0];
            if (v_0.boolean_do(GameCanvas.cfr_renamed_12)) {
                n4 = var_int_arr_int[5] * GameCanvas.cfr_renamed_12;
                if ((5 ^ 0x64 ^ (0x33 ^ 0x56)) <= 0) {
                    return;
                }
            } else {
                n4 = var_int_arr_int[1];
            }
            ((v_0)object).cfr_renamed_4 = n5 + n4;
        }
        if (v_0.boolean_do(this.cfr_renamed_4, var_int_arr_int[6])) {
            this.cfr_renamed_4 = var_int_arr_int[6];
        }
        this.cfr_renamed_0();
        this.soLuong = var_int_arr_int[1];
        this.var_int_arr_if = new int[this.cfr_renamed_13];
        this.mangSoNguyen = new int[this.cfr_renamed_13];
        this.cfr_renamed_7 = (this.soLuongKhoa - this.cfr_renamed_4) / this.var_int_int;
        this.cfr_renamed_8 = var_int_arr_int[1];
    }

        public static v_0 v_0_do() {
        if ((var_v_0_do > 0)) {
            var_v_0_do = new v_0();
        }
        return var_v_0_do;
    }

        }

