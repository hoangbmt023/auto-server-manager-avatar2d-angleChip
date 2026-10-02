/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from z
 */
public final class z_0
extends w_0 {
    private boolean var_boolean_try;
    public byte var_byte_do;
    private byte var_byte_char;
    public byte[][] var_byte_arr_arr_do;
    private static int[] var_int_arr_if;
    private byte cfr_renamed_13;
    private Vector cfr_renamed_3;
    private fl_0 var_fl_0_byte;
    private byte cfr_renamed_9;
    private Image var_javax_microedition_lcdui_Image_if;
    private fl_0 var_fl_0_case;
    private byte cfr_renamed_14;
    private byte this;
    private boolean[] var_boolean_arr_do;
    private byte cfr_renamed_12;
    private static int cfr_renamed_23;
    private fl_0 var_fl_0_char;
    private byte cfr_renamed_15;
    private int cfr_renamed_24;
    private int[] cfr_renamed_2;
    public static int soLuong;
    public static z_0 var_z_0_do;
    private byte cfr_renamed_21;
    private Vector cfr_renamed_4;
    public static int var_int_if;
    private Vector var_java_util_Vector_try;
    private static int cfr_renamed_22;
    private byte[] var_byte_arr_do;
    private Vector var_java_util_Vector_byte;
    private boolean var_boolean_byte;
    private int cfr_renamed_17;
    private Vector var_java_util_Vector_case = new Vector();
    private boolean var_boolean_case;
    public boolean dangChayAuto;
    private Vector var_java_util_Vector_char;
    private byte cfr_renamed_10;
    private boolean var_boolean_char;
    private static fs[] var_fs_arr_if;

    public static w_0 w_0_do() {
        if ((var_z_0_do == null)) {
            var_z_0_do = new z_0();
            return var_z_0_do;
        }
        return var_z_0_do;
    }

    public z_0() {
        this.cfr_renamed_4 = new Vector();
        this.var_java_util_Vector_byte = new Vector();
        this.var_java_util_Vector_try = new Vector();
        this.cfr_renamed_3 = new Vector();
        this.cfr_renamed_12 = (byte)var_int_arr_if[1];
        this.this = (byte)var_int_arr_if[1];
        this.var_boolean_arr_do = new boolean[var_int_arr_if[2]];
        this.var_byte_arr_arr_do = new byte[var_int_arr_if[3]][var_int_arr_if[2]];
        this.var_byte_arr_do = new byte[var_int_arr_if[4]];
        this.cfr_renamed_13 = (byte)var_int_arr_if[0];
        this.var_java_util_Vector_char = new Vector();
        try {
            this.var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/p.on"));
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (((0xA3 ^ 0xAC) & ~(0x58 ^ 0x57)) < 0) {
            throw null;
        }
        this.cfr_renamed_17();
        this.cfr_renamed_2 = null;
        this.var_fl_0_case = new fl_0(MenuChinhAvatar.var_java_lang_String_class, var_int_arr_if[5]);
        this.var_fl_0_byte = new fl_0(MenuChinhAvatar.cW, var_int_arr_if[6]);
        this.var_fl_0_char = new fl_0(MenuChinhAvatar.var_java_lang_String_class, var_int_arr_if[7]);
        if ((GameCanvas.soLuongKhoa > var_int_arr_if[8])) {
            var_int_if = soLuong = var_int_arr_if[9];
            cfr_renamed_22 = cfr_renamed_23 = var_int_arr_if[10];
            if ((dF.cfr_renamed_12 == var_int_arr_if[11])) {
                cfr_renamed_22 = cfr_renamed_23 = var_int_arr_if[12];
                if ("   ".length() == 0) {
                    throw null;
                }
            }
        } else {
            var_int_if = soLuong = var_int_arr_if[13];
            cfr_renamed_22 = cfr_renamed_23 = var_int_arr_if[14];
        }
        this.cfr_renamed_25();
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final void (byte by2 == null) {
        int n = w_0.int_do(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9);
        DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(by2);
        if ((n == by2)) {
            this.var_boolean_arr_do[n] = var_int_arr_if[0];
            this.var_boolean_char = var_int_arr_if[15];
            this.var_fl_0_new = null;
            this.cfr_renamed_14 = (byte)var_int_arr_if[11];
            this.dangChayAuto = var_int_arr_if[0];
        }
        ((w_0)this).cfr_renamed_14 = ((dd_0)ef2).cfr_renamed_9;
        w_0.var_int_case = this.var_byte_do;
        w_0.var_long_if = GameCanvas.int_do();
        if (z_0.boolean_for(this.var_boolean_byte ? 1 : 0)) {
            this.var_boolean_byte = var_int_arr_if[15];
        }
        if (z_0.boolean_if(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, w_0.cfr_renamed_13) && (n == by2)) {
            z_0 z_02 = this;
            ((dF)this).cfr_renamed_3 = w_0.var_fl_0_do;
            ((dF)z_02).cfr_renamed_3.chuoiGiaTri = "Chọn";
            z_02.var_fl_0_new = z_02.var_fl_0_case;
        }
    }

    public final void cfr_renamed_0(byte by2) {
        this.cfr_renamed_15 = by2;
        this.var_boolean_arr_do[this.cfr_renamed_15] = var_int_arr_if[15];
        this.cfr_renamed_26();
    }

    public final void (byte by2, byte by3, byte by4 == null) {
        if (z_0.boolean_if((int)by3, by4)) {
            this.cfr_renamed_15 = by2;
            this.cfr_renamed_21 = by3;
            this.cfr_renamed_9 = by4;
            this.var_boolean_try = var_int_arr_if[15];
            this.cfr_renamed_14 = (byte)var_int_arr_if[4];
        }
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    public final void void_do() {
        if (z_0.boolean_for(this.var_boolean_char ? 1 : 0)) {
            if (z_0.boolean_for(this.var_boolean_arr_do[w_0.int_do(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)])) {
                if (z_0.boolean_do((int)this.cfr_renamed_10, var_int_arr_if[2])) {
                    this.cfr_renamed_27();
                }
                this.cfr_renamed_10 = (byte)(this.cfr_renamed_10 + var_int_arr_if[15]);
                return;
            }
        } else if ((this.this == var_int_arr_if[1])) {
            if ((this.cfr_renamed_12 == var_int_arr_if[1])) {
                this.cfr_renamed_12 = this.var_byte_char;
                ((dF)this).cfr_renamed_3.chuoiGiaTri = "Tả";
                this.cfr_renamed_28();
                return;
            }
            this.this = this.var_byte_char;
            this.cfr_renamed_23();
        }
    }

    private static void cfr_renamed_14() {
        w_0.cfr_renamed_18();
        w_0.var_boolean_int = var_int_arr_if[15];
        dt_0.dt_0_do().cfr_renamed_4();
    }

    private void cfr_renamed_16() {
        w_0.cfr_renamed_18();
        this.dangChayAuto = var_int_arr_if[15];
        dt_0.dt_0_do().cfr_renamed_1(this.cfr_renamed_3);
        this.var_java_util_Vector_case.removeAllElements();
    }

    private static boolean boolean_for(int n, int n2) {
        return n <= n2;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    static {
        z_0.cfr_renamed_24();
    }

        private void (int n, int n2, int n3, int n4, int n5, int n6, int n7 == null) {
        y_0 y_02 = new y_0(n, n2, n3, n4, n5, n6, n7);
        this.cfr_renamed_4.addElement(y_02);
    }

    public final void (byte by2, byte by3, int n == null) {
        int n2 = n;
        n = by3;
        by3 = by2;
        z_0 z_02 = this;
        if ((n2 != 0)) {
            int n3;
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(by3);
            DuLieuNguoiChoi ef3 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(n);
            gb_0 gb_02 = new gb_0(((bm)ef2).cfr_renamed_2, ((bm)ef2).cfr_renamed_3);
            new gb_0(((bm)ef2).cfr_renamed_2, ((bm)ef2).cfr_renamed_3).var_short_if = (short)n2;
            gb_02.soLuong = hg.int_new(var_int_arr_if[4]);
            gb_02.cfr_renamed_13 = n3 = hg.int_do(((bm)ef3).cfr_renamed_2 - ((bm)ef2).cfr_renamed_2, -(((bm)ef3).cfr_renamed_2 - ((bm)ef2).cfr_renamed_3));
            gb_02.var_byte_if = (byte)hg.int_if(var_int_arr_if[1], var_int_arr_if[15]);
            gb_02.cfr_renamed_6 = hg.int_for(gb_02.cfr_renamed_13 + gb_02.var_byte_if * var_int_arr_if[26]);
            n3 = var_int_arr_if[21] * hg.int_int(gb_02.cfr_renamed_6) >> var_int_arr_if[21];
            n2 = -(var_int_arr_if[21] * hg.int_if(gb_02.cfr_renamed_6)) >> var_int_arr_if[21];
            gb_02.cfr_renamed_2 = (short)((bm)ef3).cfr_renamed_2;
            gb_02.cfr_renamed_3 = (short)((bm)ef3).cfr_renamed_3;
            ((bm)gb_02).cfr_renamed_2 += n3;
            ((bm)gb_02).cfr_renamed_3 += n2;
            gb_02.soLuong = var_int_arr_if[0];
            gb_02.var_byte_do = (byte)(hg.int_new(var_int_arr_if[24]) + var_int_arr_if[11]);
            ((bm)gb_02).cfr_renamed_4 = (short)(var_int_arr_if[6] + hg.int_new(var_int_arr_if[3]));
            z_02.var_java_util_Vector_char.addElement(gb_02);
        }
    }

    private static boolean boolean_for(int n) {
        return n == 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 7: {
                z_0.cfr_renamed_14();
                if (null == null) break;
                return;
            }
            case 8: {
                z_0 z_02 = this;
                z_02.c_();
                z_02.var_java_util_Vector_char.removeAllElements();
                w_0.coTrangThai = var_int_arr_if[0];
                w_0.coKichHoat = var_int_arr_if[0];
                w_0.var_boolean_int = var_int_arr_if[0];
                ((w_0)z_02).cfr_renamed_14 = var_int_arr_if[1];
                z_02.cfr_renamed_2 = null;
                z_02.var_java_util_Vector_case.removeAllElements();
                z_02.cfr_renamed_4.removeAllElements();
                z_02.cfr_renamed_12 = (byte)var_int_arr_if[1];
                z_02.this = (byte)var_int_arr_if[1];
                if (" ".length() > -" ".length()) break;
                return;
            }
            case 9: {
                z_0 z_03 = this;
                if (z_0.boolean_for(z_03.var_boolean_char ? 1 : 0)) {
                    if (!z_0.boolean_for(z_03.var_boolean_arr_do[w_0.int_do(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)])) break;
                    z_03.cfr_renamed_14 = (byte)var_int_arr_if[15];
                    z_03.cfr_renamed_16();
                    if (-"  ".length() < 0) break;
                    return;
                }
                if (!z_0.boolean_if((int)z_03.cfr_renamed_12, var_int_arr_if[1])) break;
                z_03.cfr_renamed_12 = (byte)var_int_arr_if[1];
                ((dF)z_03).cfr_renamed_3.chuoiGiaTri = "Chọn";
                z_03.var_fl_0_new = z_03.var_fl_0_case;
            }
        }
        super.void_do(n, n2);
    }

    private void cfr_renamed_23() {
        if (z_0.boolean_for(this.var_boolean_try ? 1 : 0)) {
            w_0.cfr_renamed_18();
            this.dangChayAuto = var_int_arr_if[15];
            dt_0.dt_0_do().cfr_renamed_1(this.cfr_renamed_12, this.this);
            w_0.var_boolean_int = var_int_arr_if[15];
            ((w_0)this).cfr_renamed_14 = var_int_arr_if[1];
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_2() {
        var1_1 = z_0.var_int_arr_if[0];
        if ((48 ^ 52) >= "  ".length()) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(var1_1);
            if (z_0.boolean_if(var2_2.cfr_renamed_9, z_0.var_int_arr_if[1])) {
                var2_2.var_byte_this = (byte)z_0.var_int_arr_if[0];
                var2_2.cfr_renamed_1(z_0.var_int_arr_if[0]);
                var2_2.void_if((int)var2_2.cfr_renamed_2);
                var2_2.void_do(z_0.var_fs_arr_if[w_0.mangSoNguyen[var1_1]].soLuong, z_0.var_fs_arr_if[w_0.mangSoNguyen[var1_1]].var_int_if);
                if (!z_0.boolean_if(w_0.mangSoNguyen[var1_1], z_0.var_int_arr_if[11]) || !z_0.boolean_if(w_0.mangSoNguyen[var1_1], z_0.var_int_arr_if[4]) || (w_0.mangSoNguyen[var1_1] == z_0.var_int_arr_if[24])) {
                    var2_2.var_byte_new = var2_2.var_byte_long = dd_0.var_byte_try;
                    if ((200 ^ 184 ^ (193 ^ 180)) <= 0) {
                        return;
                    }
                } else {
                    v0 = z_0.var_int_arr_if[0];
                    var2_2.var_byte_long = (byte)v0;
                    var2_2.var_byte_new = (byte)v0;
                }
            }
            ++var1_1;
lbl23:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)w_0.cfr_renamed_9))
        }
lbl24:
        // 1 sources

    }

    private static boolean boolean_int(int n) {
        return n >= 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_2(byte by2) {
        super.cfr_renamed_12();
        GameCanvas.cfr_renamed_7();
        this.cfr_renamed_29();
        w_0.cfr_renamed_30();
        this.var_java_util_Vector_byte.removeAllElements();
        this.cfr_renamed_2();
        int n = var_int_arr_if[0];
        while (!(n >= w_0.var_java_util_Vector_if.size())) {
            if (z_0.boolean_if(((dd_0)((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n))).cfr_renamed_9, w_0.cfr_renamed_13)) {
                this.var_java_util_Vector_byte.addElement(String.valueOf(n));
            }
            ++n;
        }
        if (z_0.boolean_if(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, w_0.cfr_renamed_13)) {
            this.cfr_renamed_9();
            if ("   ".length() < " ".length()) {
                return;
            }
        } else {
            ((dF)this).cfr_renamed_3 = null;
            this.var_fl_0_new = null;
        }
        w_0.coTrangThai = var_int_arr_if[0];
        w_0.coKichHoat = var_int_arr_if[15];
        w_0.var_int_case = by2;
        w_0.var_long_if = GameCanvas.int_do();
    }

    private static void cfr_renamed_24() {
        var_int_arr_if = new int[38];
        z_0.var_int_arr_if[0] = (2 ^ 0x1D) & ~(0x15 ^ 0xA);
        z_0.var_int_arr_if[1] = -" ".length();
        z_0.var_int_arr_if[2] = 85 + 128 - 181 + 130 ^ 131 + 55 - 65 + 43;
        z_0.var_int_arr_if[3] = 0xAC ^ 0xA9;
        z_0.var_int_arr_if[4] = "   ".length();
        z_0.var_int_arr_if[5] = 0xC5 ^ 0x84 ^ (0xE6 ^ 0xA0);
        z_0.var_int_arr_if[6] = "   ".length() ^ (0x64 ^ 0x6F);
        z_0.var_int_arr_if[7] = 0x3D ^ 0x56 ^ (0x13 ^ 0x71);
        z_0.var_int_arr_if[8] = (0x16 ^ 0xC) + (127 + 57 - 54 + 9) - (43 + 146 - 145 + 111) + (53 + 189 - 54 + 2);
        z_0.var_int_arr_if[9] = 0x6C ^ 0x7B;
        z_0.var_int_arr_if[10] = 0xCB ^ 0x8E ^ (0x2C ^ 0x59);
        z_0.var_int_arr_if[11] = "  ".length();
        z_0.var_int_arr_if[12] = 0x3A ^ 0x5A;
        z_0.var_int_arr_if[13] = 0x87 ^ 0x8B;
        z_0.var_int_arr_if[14] = 0xB8 ^ 0x98;
        z_0.var_int_arr_if[15] = " ".length();
        z_0.var_int_arr_if[16] = (0x42 ^ 0x48) + (0x68 ^ 0xE) - -(6 ^ 0xF) + (2 ^ 0x1F);
        z_0.var_int_arr_if[17] = 107 + 21 - 50 + 113 ^ 62 + 157 - 195 + 147;
        z_0.var_int_arr_if[18] = 0x3B ^ 0x6E ^ (0xDA ^ 0xBD);
        z_0.var_int_arr_if[19] = 0x1F ^ 0x2E ^ (0x24 ^ 0xB);
        z_0.var_int_arr_if[20] = 0x11 ^ 0x2D;
        z_0.var_int_arr_if[21] = 0x9A ^ 0x90;
        z_0.var_int_arr_if[22] = 0x14 ^ 0x35;
        z_0.var_int_arr_if[23] = 0x6D ^ 0x63;
        z_0.var_int_arr_if[24] = 0x94 ^ 0x90;
        z_0.var_int_arr_if[25] = 143 + 136 - 143 + 40 ^ 126 + 37 - 9 + 35;
        z_0.var_int_arr_if[26] = 0x9A ^ 0x87 ^ (0x4A ^ 0xD);
        z_0.var_int_arr_if[27] = 0x5B ^ 0x1B;
        z_0.var_int_arr_if[28] = 0 ^ 0x31;
        z_0.var_int_arr_if[29] = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        z_0.var_int_arr_if[30] = -(0xFFFFDEBE & 0x2545) & (0xFFFFFFB7 & 0x10FDFF);
        z_0.var_int_arr_if[31] = -(0xFFFFD5F5 & 0x6E0B) & (0xFFFFFF6B & 0x47FC);
        z_0.var_int_arr_if[32] = -(0xFFFFFEE5 & 0x5D1F) & (0xFFFFFF7D & 0x5FEF);
        z_0.var_int_arr_if[33] = -(0xFFFFE4FD & 0x3F9B) & (0xFFFFB7FF & 0x6FFF);
        z_0.var_int_arr_if[34] = 0x2C ^ 0x3D;
        z_0.var_int_arr_if[35] = 9 ^ 0x40 ^ (0x88 ^ 0xA5);
        z_0.var_int_arr_if[36] = 0x75 ^ 0x5D;
        z_0.var_int_arr_if[37] = 0xFFFF97E7 & 0x6B7E;
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_22() {
        block2: {
            block3: {
                if (!z_0.boolean_new(this.var_java_util_Vector_try.size())) break block2;
                if (!(GameCanvas.soLuongKhoa > z_0.var_int_arr_if[8])) break block3;
                var1_1 = GameCanvas.soLuongKhoa / z_0.var_int_arr_if[11] - z_0.var_int_arr_if[27] * dF.cfr_renamed_12;
                var2_3 = z_0.var_int_arr_if[0];
                if ((206 ^ 189 ^ (12 ^ 123)) != 0) ** GOTO lbl11
                return;
lbl-1000:
                // 1 sources

                {
                    this.cfr_renamed_1(var1_1 + (var2_3 << z_0.var_int_arr_if[2]) * dF.cfr_renamed_12, z_0.var_int_arr_if[21], var2_3, var2_3);
                    ++var2_3;
lbl11:
                    // 2 sources

                    ** while (!z_0.cfr_renamed_5((int)var2_3, (int)z_0.var_int_arr_if[4]))
                }
lbl12:
                // 1 sources

                return;
            }
            var1_2 = GameCanvas.soLuongKhoa / z_0.var_int_arr_if[11] - z_0.var_int_arr_if[28];
            var2_4 = z_0.var_int_arr_if[0];
            if ((253 ^ 170 ^ (230 ^ 181)) > ((141 ^ 180 ^ (104 ^ 48)) & (24 ^ 10 ^ (216 ^ 171) ^ -" ".length()))) ** GOTO lbl22
            return;
lbl-1000:
            // 1 sources

            {
                this.cfr_renamed_1(var1_2 + var2_4 * z_0.var_int_arr_if[28], z_0.var_int_arr_if[0], var2_4, var2_4);
                ++var2_4;
lbl22:
                // 2 sources

                ** while (!z_0.cfr_renamed_5((int)var2_4, (int)z_0.var_int_arr_if[4]))
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_4(Graphics graphics) {
        if (z_0.boolean_if(this.var_java_util_Vector_try.size())) {
            int n = var_int_arr_if[0];
            while (!(n >= this.var_java_util_Vector_try.size())) {
                ((gz_0)this.var_java_util_Vector_try.elementAt(n)).cfr_renamed_1(graphics);
                ++n;
            }
        }
    }

    protected final void cfr_renamed_3() {
        super.cfr_renamed_3();
        if (z_0.boolean_for(w_0.coKichHoat ? 1 : 0) && z_0.boolean_for(w_0.var_boolean_int ? 1 : 0)) {
            this.cfr_renamed_29();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        z_0 z_02 = this;
        if (!z_0.boolean_for(z_02.var_boolean_arr_do[w_0.int_do(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)]) || !z_0.boolean_if(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, w_0.cfr_renamed_13)) return;
        z_0 z_03 = z_02;
        if (z_0.boolean_for(z_03.dangChayAuto ? 1 : 0) && (w_0.coKichHoat) && z_0.boolean_for(w_0.coTrangThai ? 1 : 0) && z_0.boolean_if(z_03.cfr_renamed_3.size()) && (GameCanvas.coTrangThai)) {
            GameCanvas.coTrangThai = var_int_arr_if[0];
            int n = var_int_arr_if[0];
            while (!(n >= z_03.cfr_renamed_3.size())) {
                bK bK2 = (bK)z_03.cfr_renamed_3.elementAt(n);
                if ((GameCanvas.var_int_try >= bK2.cfr_renamed_1) && z_0.boolean_for(GameCanvas.var_int_try, bK2.cfr_renamed_1 + cfr_renamed_22) && (GameCanvas.soLuong >= bK2.cfr_renamed_3) && z_0.boolean_for(GameCanvas.soLuong, bK2.cfr_renamed_3 + cfr_renamed_23)) {
                    z_03.var_byte_char = (byte)n;
                    if (z_0.boolean_for(z_03.var_boolean_char ? 1 : 0)) {
                        if (z_0.boolean_for(z_03.var_boolean_arr_do[w_0.int_do(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)])) {
                            if (z_0.boolean_do((int)z_03.cfr_renamed_10, var_int_arr_if[2])) {
                                z_03.cfr_renamed_27();
                            }
                            z_03.cfr_renamed_10 = (byte)(z_03.cfr_renamed_10 + var_int_arr_if[15]);
                            break;
                        }
                    } else if ((z_03.this == var_int_arr_if[1])) {
                        if ((z_03.cfr_renamed_12 == var_int_arr_if[1])) {
                            z_03.cfr_renamed_12 = z_03.var_byte_char;
                            ((dF)z_03).cfr_renamed_3.chuoiGiaTri = "Tả";
                            z_03.cfr_renamed_28();
                            break;
                        }
                        z_03.this = z_03.var_byte_char;
                        z_03.cfr_renamed_23();
                    }
                    break;
                }
                ++n;
            }
        }
        if ((GameCanvas.boolean_do(var_int_arr_if[2]))) {
            z_02.var_byte_char = (byte)(z_02.var_byte_char + var_int_arr_if[15]);
            if (!(z_02.var_byte_char > var_int_arr_if[3])) return;
            z_02.var_byte_char = (byte)var_int_arr_if[0];
            return;
        }
        if ((GameCanvas.boolean_do(var_int_arr_if[24]))) {
            z_02.var_byte_char = (byte)(z_02.var_byte_char - var_int_arr_if[15]);
            if (!z_0.boolean_do(z_02.var_byte_char)) return;
            z_02.var_byte_char = (byte)var_int_arr_if[3];
            return;
        }
        if ((GameCanvas.boolean_do(var_int_arr_if[6]))) {
            if (!z_0.boolean_new(z_02.var_byte_char / var_int_arr_if[4])) return;
            z_02.var_byte_char = (byte)(z_02.var_byte_char + var_int_arr_if[4]);
            return;
        } else {
            if (!(GameCanvas.boolean_do(var_int_arr_if[11])) || !(z_02.var_byte_char > var_int_arr_if[11])) return;
            z_02.var_byte_char = (byte)(z_02.var_byte_char - var_int_arr_if[4]);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void (int[] var1_1 == null) {
        this.cfr_renamed_2 = var1_1 /* !! */ ;
        this.var_boolean_case = z_0.var_int_arr_if[15];
        w_0.coTrangThai = z_0.var_int_arr_if[15];
        this.var_fl_0_new = null;
        this.var_boolean_byte = z_0.var_int_arr_if[0];
        this.cfr_renamed_13 = (byte)z_0.var_int_arr_if[0];
        this.cfr_renamed_3 = this.var_fl_0_byte;
        var1_1 /* !! */  = (int[])this;
        var2_2 = z_0.var_int_arr_if[0];
        if (("   ".length() & ("   ".length() ^ -" ".length())) == 0) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(var2_2);
            if (z_0.boolean_if(var3_3.cfr_renamed_9, z_0.var_int_arr_if[1])) {
                w_0.cfr_renamed_1(var3_3.cfr_renamed_9, String.valueOf(var1_1 /* !! */ .cfr_renamed_2[var2_2]));
                var3_3.void_int(var3_3.int_if() + var1_1 /* !! */ .cfr_renamed_2[var2_2]);
            }
            var2_2 = (byte)(var2_2 + z_0.var_int_arr_if[15]);
lbl19:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var2_2, (int)z_0.var_int_arr_if[3]))
        }
lbl20:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_17() {
        var1_1 = z_0.var_int_arr_if[0];
        if (((114 + 1 - 28 + 86 ^ 58 + 141 - 187 + 144) & (5 + 106 - 52 + 103 ^ 145 + 86 - 143 + 59 ^ -" ".length())) <= 0) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_byte_arr_do[var1_1] = z_0.var_int_arr_if[1];
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)this.var_byte_arr_do.length))
        }
lbl9:
        // 1 sources

        var1_1 = z_0.var_int_arr_if[0];
        if ((129 ^ 190 ^ (40 ^ 18)) != 0) ** GOTO lbl16
        return;
lbl-1000:
        // 1 sources

        {
            this.var_boolean_arr_do[var1_1] = z_0.var_int_arr_if[0];
            ++var1_1;
lbl16:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)this.var_boolean_arr_do.length))
        }
lbl17:
        // 1 sources

        var1_1 = z_0.var_int_arr_if[0];
        if (-"  ".length() < 0) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = z_0.var_int_arr_if[0];
            if ("  ".length() >= 0) ** GOTO lbl29
            return;
lbl-1000:
            // 1 sources

            {
                this.var_byte_arr_arr_do[var1_1][var2_2] = z_0.var_int_arr_if[0];
                ++var2_2;
lbl29:
                // 2 sources

                ** while (!z_0.cfr_renamed_5((int)var2_2, (int)this.var_byte_arr_arr_do[var1_1].length))
            }
lbl30:
            // 1 sources

            ++var1_1;
lbl31:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)this.var_byte_arr_arr_do.length))
        }
lbl32:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_0(Graphics var1_1) {
        block39: {
            block41: {
                block40: {
                    block38: {
                        super.cfr_renamed_0(var1_1);
                        if (z_0.boolean_for((int)w_0.coKichHoat) && !z_0.cfr_renamed_5((int)w_0.var_boolean_int)) break block38;
                        GameCanvas.hienThongBaoPopup(var1_1);
                        var2_2 = var1_1;
                        var3_3 = this;
                        if (!z_0.boolean_if(var3_3.cfr_renamed_3.size())) break block38;
                        if (z_0.boolean_if((int)var3_3.cfr_renamed_12, z_0.var_int_arr_if[1])) {
                            var2_2.setColor(z_0.var_int_arr_if[29]);
                            if ((GameCanvas.var_int_goto % z_0.var_int_arr_if[17] > z_0.var_int_arr_if[21])) {
                                var2_2.fillRect(var3_3.cfr_renamed_17 + var3_3.cfr_renamed_12 % z_0.var_int_arr_if[4] * (z_0.cfr_renamed_22 + z_0.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var3_3.cfr_renamed_12 / z_0.var_int_arr_if[4] * (z_0.cfr_renamed_23 + z_0.var_int_arr_if[6]), z_0.cfr_renamed_22, z_0.cfr_renamed_23);
                            }
                        }
                        if (z_0.boolean_if((int)var3_3.this, z_0.var_int_arr_if[1])) {
                            var2_2.setColor(z_0.var_int_arr_if[30]);
                            if ((GameCanvas.var_int_goto % z_0.var_int_arr_if[17] > z_0.var_int_arr_if[21])) {
                                var2_2.fillRect(var3_3.cfr_renamed_17 + var3_3.this % z_0.var_int_arr_if[4] * (z_0.cfr_renamed_22 + z_0.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var3_3.this / z_0.var_int_arr_if[4] * (z_0.cfr_renamed_23 + z_0.var_int_arr_if[6]), z_0.cfr_renamed_22, z_0.cfr_renamed_23);
                            }
                        }
                        var4_4 = z_0.var_int_arr_if[0];
                        if (((126 + 43 - 163 + 168 ^ 85 + 91 - 55 + 25) & (12 + 133 - -10 + 23 ^ 116 + 23 - 75 + 78 ^ -" ".length())) < "   ".length()) ** GOTO lbl40
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_6 = (bK)var3_3.cfr_renamed_3.elementAt(var4_4);
                            if ((GameCanvas.soLuongKhoa > z_0.var_int_arr_if[8])) {
                                v0 = z_0.var_int_arr_if[31];
                                if ("  ".length() != "  ".length()) {
                                    return;
                                }
                            } else {
                                v0 = z_0.var_int_arr_if[32];
                            }
                            if (z_0.boolean_if(aa_0.cfr_renamed_0((short)((short)v0)).soLuong, z_0.var_int_arr_if[1])) {
                                if ((GameCanvas.soLuongKhoa > z_0.var_int_arr_if[8])) {
                                    v1 = z_0.var_int_arr_if[31];
                                    if (-" ".length() > "   ".length()) {
                                        return;
                                    }
                                } else {
                                    v1 = z_0.var_int_arr_if[32];
                                }
                                var2_2.drawRegion(aa_0.cfr_renamed_0((short)((short)v1)).var_javax_microedition_lcdui_Image_do, z_0.var_int_arr_if[0], var5_6.cfr_renamed_2 * z_0.cfr_renamed_23, z_0.cfr_renamed_22, z_0.cfr_renamed_23, z_0.var_int_arr_if[0], var3_3.cfr_renamed_17 + var4_4 % z_0.var_int_arr_if[4] * (z_0.cfr_renamed_22 + z_0.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var4_4 / z_0.var_int_arr_if[4] * (z_0.cfr_renamed_23 + z_0.var_int_arr_if[6]), z_0.var_int_arr_if[0]);
                            }
                            ++var4_4;
lbl40:
                            // 2 sources

                            ** while (!z_0.cfr_renamed_5((int)var4_4, (int)var3_3.cfr_renamed_3.size()))
                        }
                    }
                    this.cfr_renamed_2(var1_1);
                    if (z_0.boolean_for((int)w_0.coKichHoat) && !z_0.cfr_renamed_5((int)w_0.var_boolean_int)) break block39;
                    GameCanvas.hienThongBaoPopup(var1_1);
                    var2_2 = var1_1;
                    var3_3 = this;
                    var4_4 = z_0.var_int_arr_if[0];
                    if ("  ".length() >= 0) ** GOTO lbl59
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_6 = (DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt(var4_4);
                        if (!z_0.boolean_if(var5_6.cfr_renamed_9, w_0.cfr_renamed_13) || z_0.boolean_if(var5_6.cfr_renamed_9, z_0.var_int_arr_if[1])) {
                            if (!(var3_3.cfr_renamed_14 == var5_6.cfr_renamed_9) || (GameCanvas.var_int_goto % z_0.var_int_arr_if[21] >= z_0.var_int_arr_if[3])) {
                                GameCanvas.var_fz_0_for.cfr_renamed_1(var2_2, String.valueOf(var5_6.int_if()) + MenuChinhAvatar.java_lang_String_if(), var5_6.cfr_renamed_2, var5_6.cfr_renamed_3 + z_0.var_int_arr_if[3], z_0.var_int_arr_if[11]);
                            }
                            if (z_0.boolean_if(var6_8 = (var3_3.var_java_util_Vector_byte, w_0.int_do(var5_6.cfr_renamed_9) == null), z_0.var_int_arr_if[1]) && z_0.boolean_if(aa_0.cfr_renamed_0((short)z_0.var_int_arr_if[33]).soLuong, z_0.var_int_arr_if[1])) {
                                var2_2.drawRegion(aa_0.cfr_renamed_0((short)z_0.var_int_arr_if[33]).var_javax_microedition_lcdui_Image_do, z_0.var_int_arr_if[0], z_0.int_if(var6_8) * z_0.var_int_arr_if[13], z_0.var_int_arr_if[13], z_0.var_int_arr_if[13], z_0.var_int_arr_if[0], var5_6.cfr_renamed_2, var5_6.cfr_renamed_3 + z_0.var_int_arr_if[3] + dF.cfr_renamed_7, z_0.var_int_arr_if[34]);
                            }
                        }
                        ++var4_4;
lbl59:
                        // 2 sources

                        ** while (!z_0.cfr_renamed_5((int)var4_4, (int)w_0.var_java_util_Vector_if.size()))
                    }
lbl60:
                    // 1 sources

                    if (!z_0.boolean_for((int)w_0.coKichHoat) || z_0.cfr_renamed_5((int)w_0.var_boolean_int)) {
                        var7_9 = (int)((long)w_0.var_int_case - w_0.soXu);
                        if (z_0.boolean_if(var7_9) && z_0.boolean_for((int)w_0.coTrangThai) && z_0.boolean_new(this.var_java_util_Vector_try.size())) {
                            GameCanvas.var_fz_0_int.cfr_renamed_1(var1_1, String.valueOf(var7_9), GameCanvas.cfr_renamed_15, z_0.var_int_arr_if[21], z_0.var_int_arr_if[11]);
                        }
                        if (z_0.cfr_renamed_5((int)this.var_boolean_byte)) {
                            if (z_0.boolean_do((int)this.cfr_renamed_13, z_0.var_int_arr_if[35])) {
                                this.cfr_renamed_13 = (byte)(this.cfr_renamed_13 + z_0.var_int_arr_if[15]);
                                if (((61 + 96 - 33 + 35 ^ 3 + 91 - -18 + 33) & (22 + 45 - -59 + 30 ^ 60 + 9 - 22 + 99 ^ -" ".length())) != 0) {
                                    return;
                                }
                            } else {
                                this.cfr_renamed_13 = (byte)z_0.var_int_arr_if[35];
                            }
                            if (z_0.boolean_do((int)this.cfr_renamed_13, z_0.var_int_arr_if[18])) {
                                GameCanvas.var_fz_0_new.cfr_renamed_1(var1_1, "Bắt đầu tả", GameCanvas.cfr_renamed_15, this.cfr_renamed_24 - z_0.var_int_arr_if[36], z_0.var_int_arr_if[11]);
                            }
                        }
                    }
                    if (!z_0.boolean_if(this.var_java_util_Vector_case.size())) break block40;
                    var7_9 = z_0.var_int_arr_if[0];
                    if (-" ".length() < ((177 ^ 183) & ~(175 ^ 169))) ** GOTO lbl85
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_3 = (gM)this.var_java_util_Vector_case.elementAt(var7_9);
                        if (z_0.boolean_if(var3_3.soLuong)) {
                            var3_3.cfr_renamed_1(var1_1);
                        }
                        ++var7_9;
lbl85:
                        // 2 sources

                        ** while (!z_0.cfr_renamed_5((int)var7_9, (int)this.var_java_util_Vector_case.size()))
                    }
                }
                if (!z_0.boolean_if(this.cfr_renamed_4.size())) break block41;
                var7_9 = z_0.var_int_arr_if[0];
                if ("  ".length() >= 0) ** GOTO lbl124
                return;
lbl-1000:
                // 1 sources

                {
                    var3_3 = (y_0)this.cfr_renamed_4.elementAt(var7_9);
                    if (z_0.boolean_if(var3_3.cfr_renamed_4)) {
                        var2_2 = var1_1;
                        if (z_0.boolean_for((int)var3_3.dangChayAuto)) {
                            var4_5 = GameCanvas.var_fz_0_int;
                            if (z_0.boolean_for(GameCanvas.soLuongKhoa, z_0.var_int_arr_if[8])) {
                                var4_5 = GameCanvas.var_fz_0_for;
                            }
                            if (z_0.boolean_if(GameCanvas.cfr_renamed_12)) {
                                var4_5 = GameCanvas.var_fz_0_try;
                            }
                            var5_7 = var3_3.cfr_renamed_3 + z_0.cfr_renamed_22 / z_0.var_int_arr_if[24] + var3_3.soLuong % z_0.var_int_arr_if[11] * z_0.cfr_renamed_22 / z_0.var_int_arr_if[11];
                            var6_8 = var3_3.cfr_renamed_5 + z_0.cfr_renamed_23 / z_0.var_int_arr_if[24] + var3_3.soLuong / z_0.var_int_arr_if[11] * z_0.cfr_renamed_23 / z_0.var_int_arr_if[11];
                            if ((GameCanvas.soLuongKhoa > z_0.var_int_arr_if[8])) {
                                v2 = z_0.var_int_arr_if[37];
                                if (" ".length() == "  ".length()) {
                                    return;
                                }
                            } else {
                                v2 = z_0.var_int_arr_if[33];
                            }
                            if (z_0.boolean_if(aa_0.cfr_renamed_0((short)((short)v2)).soLuong, z_0.var_int_arr_if[1])) {
                                if ((GameCanvas.soLuongKhoa > z_0.var_int_arr_if[8])) {
                                    v3 = z_0.var_int_arr_if[37];
                                    if ((60 ^ 56) < 0) {
                                        return;
                                    }
                                } else {
                                    v3 = z_0.var_int_arr_if[33];
                                }
                                var2_2.drawRegion(aa_0.cfr_renamed_0((short)((short)v3)).var_javax_microedition_lcdui_Image_do, z_0.var_int_arr_if[0], var3_3.soLuong * z_0.soLuong, z_0.var_int_if, z_0.soLuong, z_0.var_int_arr_if[0], var5_7, var6_8, z_0.var_int_arr_if[4]);
                            }
                            var4_5.cfr_renamed_1(var2_2, String.valueOf(var3_3.cfr_renamed_4), var5_7, var6_8 - var4_5.int_do() / z_0.var_int_arr_if[11], z_0.var_int_arr_if[11]);
                        }
                    }
                    ++var7_9;
lbl124:
                    // 2 sources

                    ** while (!z_0.cfr_renamed_5((int)var7_9, (int)this.cfr_renamed_4.size()))
                }
            }
            if (z_0.boolean_if(AngelChip.duLieuNguoiChoi.cfr_renamed_9, w_0.cfr_renamed_13) && z_0.cfr_renamed_5((int)w_0.coKichHoat) && z_0.boolean_for(this.var_java_util_Vector_try.size())) {
                var1_1.drawImage(this.var_javax_microedition_lcdui_Image_if, this.cfr_renamed_17 + z_0.cfr_renamed_22 / z_0.var_int_arr_if[11] + this.var_byte_char % z_0.var_int_arr_if[4] * (z_0.cfr_renamed_22 + z_0.var_int_arr_if[21]), this.cfr_renamed_24 + z_0.cfr_renamed_23 / z_0.var_int_arr_if[11] + this.var_byte_char / z_0.var_int_arr_if[4] * (z_0.cfr_renamed_23 + z_0.var_int_arr_if[6]) + GameCanvas.var_int_goto % z_0.var_int_arr_if[24] + z_0.var_int_arr_if[3], z_0.var_int_arr_if[4]);
            }
            this.cfr_renamed_4(var1_1);
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_7() {
        block31: {
            block33: {
                block32: {
                    super.cfr_renamed_7();
                    if (z_0.boolean_for((int)w_0.coKichHoat) && !z_0.cfr_renamed_5((int)w_0.var_boolean_int)) break block31;
                    var1_1 = this;
                    w_0.soXu = (int)(System.currentTimeMillis() / 1000L - w_0.var_long_if);
                    if (!z_0.cfr_renamed_5((int)w_0.coKichHoat) || !z_0.boolean_for((int)w_0.coTrangThai) || z_0.cfr_renamed_5((int)w_0.var_boolean_int)) {
                        if (" ".length() >= (181 ^ 177)) {
                            return;
                        }
                    } else if (z_0.boolean_do(z_0.cfr_renamed_1((long)w_0.var_int_case - w_0.soXu, 0L))) {
                        var1_1.dangChayAuto = z_0.var_int_arr_if[15];
                        if (z_0.boolean_if(AngelChip.duLieuNguoiChoi.cfr_renamed_9, w_0.cfr_renamed_13)) {
                            if (z_0.boolean_for(var1_1.cfr_renamed_14)) {
                                var1_1.cfr_renamed_14 = (byte)z_0.var_int_arr_if[15];
                                var1_1.cfr_renamed_16();
                            }
                            if ((var1_1.cfr_renamed_14 == z_0.var_int_arr_if[11])) {
                                var1_1.cfr_renamed_14 = (byte)z_0.var_int_arr_if[4];
                                z_0.cfr_renamed_14();
                            }
                        }
                    }
                    var1_1 = this;
                    if (!z_0.boolean_if(var1_1.cfr_renamed_4.size()) || !z_0.boolean_if(var1_1.cfr_renamed_3.size())) break block32;
                    var2_4 = z_0.var_int_arr_if[0];
                    if (-"  ".length() < 0) ** GOTO lbl60
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10 = var3_6 = (y_0)var1_1.cfr_renamed_4.elementAt(var2_4);
                        if (z_0.boolean_if(var3_6.cfr_renamed_3, var4_10.var_int_if)) {
                            if (z_0.boolean_for(var4_10.var_int_if - var4_10.cfr_renamed_3 >> z_0.var_int_arr_if[15])) {
                                var4_10.cfr_renamed_3 = var4_10.var_int_if;
                                if ("   ".length() <= "  ".length()) {
                                    return;
                                }
                            } else {
                                var4_10.cfr_renamed_3 += var4_10.var_int_if - var4_10.cfr_renamed_3 >> z_0.var_int_arr_if[15];
                            }
                        }
                        if (z_0.boolean_if(var4_10.cfr_renamed_5, var4_10.cfr_renamed_2)) {
                            if (z_0.boolean_for(var4_10.cfr_renamed_2 - var4_10.cfr_renamed_5 >> z_0.var_int_arr_if[15])) {
                                var4_10.cfr_renamed_5 = var4_10.cfr_renamed_2;
                                if (-" ".length() > 0) {
                                    return;
                                }
                            } else {
                                var4_10.cfr_renamed_5 += var4_10.cfr_renamed_2 - var4_10.cfr_renamed_5 >> z_0.var_int_arr_if[15];
                            }
                        }
                        if (z_0.cfr_renamed_5((int)var4_10.coTrangThai) && (var4_10.cfr_renamed_3 == var4_10.var_int_if) && (var4_10.cfr_renamed_5 == var4_10.cfr_renamed_2)) {
                            var4_10.dangChayAuto = z_0.var_int_arr_if[15];
                        }
                        if (z_0.cfr_renamed_5((int)var3_6.dangChayAuto)) {
                            var1_1.cfr_renamed_4.removeElement(var3_6);
                            var4_10 = var1_1;
                            if (z_0.cfr_renamed_5((int)var4_10.var_boolean_try)) {
                                var3_6 = (bK)var4_10.cfr_renamed_3.elementAt(var4_10.cfr_renamed_9);
                                var5_13 = (var4_10.var_java_util_Vector_byte, (int)var4_10.cfr_renamed_15 == null);
                                super.cfr_renamed_1(var3_6.cfr_renamed_1, var3_6.cfr_renamed_3, var3_6.cfr_renamed_1, var3_6.cfr_renamed_3, var4_10.var_byte_arr_arr_do[var4_10.cfr_renamed_15][var4_10.cfr_renamed_9], z_0.int_if(var5_13), var4_10.cfr_renamed_9);
                                var4_10.var_boolean_try = z_0.var_int_arr_if[0];
                            }
                        }
                        ++var2_4;
lbl60:
                        // 2 sources

                        ** while (!z_0.cfr_renamed_5((int)var2_4, (int)var1_1.cfr_renamed_4.size()))
                    }
lbl61:
                    // 1 sources

                    var2_5 = (bK)var1_1.cfr_renamed_3.elementAt(var1_1.cfr_renamed_9);
                    if (!z_0.cfr_renamed_5((int)var1_1.var_boolean_try)) break block32;
                    var3_7 = z_0.var_int_arr_if[0];
                    if ("  ".length() >= 0) ** GOTO lbl74
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10 = (y_0)var1_1.cfr_renamed_4.elementAt(var3_7);
                        if ((var4_10.cfr_renamed_6 == var1_1.cfr_renamed_21)) {
                            var4_10.var_int_if = var2_5.cfr_renamed_1;
                            var4_10.cfr_renamed_2 = var2_5.cfr_renamed_3;
                            var4_10.coTrangThai = z_0.var_int_arr_if[15];
                        }
                        ++var3_7;
lbl74:
                        // 2 sources

                        ** while (!z_0.cfr_renamed_5((int)var3_7, (int)var1_1.cfr_renamed_4.size()))
                    }
                }
                if (!z_0.boolean_if(this.var_java_util_Vector_try.size())) break block33;
                var1_2 = z_0.var_int_arr_if[0];
                if ((26 + 4 - 17 + 163 ^ 31 + 29 - -33 + 87) != " ".length()) ** GOTO lbl88
                return;
lbl-1000:
                // 1 sources

                {
                    var2_5 = (gz_0)this.var_java_util_Vector_try.elementAt(var1_2);
                    var2_5.cfr_renamed_1();
                    if (z_0.cfr_renamed_5((int)this.var_boolean_case)) {
                        var2_5.soLuong = this.var_byte_arr_do[var1_2];
                        var2_5.dangChayAuto = z_0.var_int_arr_if[15];
                    }
                    ++var1_2;
lbl88:
                    // 2 sources

                    ** while (!z_0.cfr_renamed_5((int)var1_2, (int)this.var_java_util_Vector_try.size()))
                }
            }
            var1_3 = z_0.var_int_arr_if[0];
            if (null == null) ** GOTO lbl125
            return;
lbl-1000:
            // 1 sources

            {
                var2_5 = (gb_0)this.var_java_util_Vector_char.elementAt(var1_3);
                var3_9 = hg.int_do(var2_5.cfr_renamed_2 - var2_5.cfr_renamed_2, -(var2_5.cfr_renamed_3 - var2_5.cfr_renamed_3));
                if ((hg.int_do(var3_9 - var2_5.cfr_renamed_6) > z_0.var_int_arr_if[21])) {
                    var2_5.cfr_renamed_6 -= var2_5.cfr_renamed_4 * var2_5.var_byte_if;
                    var2_5.cfr_renamed_6 = hg.int_for(var2_5.cfr_renamed_6);
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    var2_5.cfr_renamed_6 = var3_9;
                    var2_5.var_byte_do = (byte)(var2_5.var_byte_do + z_0.var_int_arr_if[11]);
                }
                if ((var2_5.soLuong >= z_0.var_int_arr_if[24])) {
                    var2_5.soLuong = z_0.var_int_arr_if[0];
                }
                var2_5.soLuong += z_0.var_int_arr_if[15];
                var3_9 = var2_5.var_byte_do * hg.int_int(var2_5.cfr_renamed_6) >> z_0.var_int_arr_if[21];
                var4_12 = -(var2_5.var_byte_do * hg.int_if(var2_5.cfr_renamed_6)) >> z_0.var_int_arr_if[21];
                if ((hg.cfr_renamed_1(var2_5.cfr_renamed_2, var2_5.cfr_renamed_3, var2_5.cfr_renamed_2, var2_5.cfr_renamed_3) >= var2_5.var_byte_do)) {
                    var2_5.cfr_renamed_2 += var3_9;
                    var2_5.cfr_renamed_3 += var4_12;
                    } else {
                    this.var_java_util_Vector_char.removeElement(var2_5);
                    }
                ++var1_3;
lbl125:
                // 2 sources

                ** while (!z_0.cfr_renamed_5((int)var1_3, (int)this.var_java_util_Vector_char.size()))
            }
lbl126:
            // 1 sources

            return;
        }
        this.cfr_renamed_10();
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_29() {
        this.cfr_renamed_12 = (byte)z_0.var_int_arr_if[1];
        this.this = (byte)z_0.var_int_arr_if[1];
        this.cfr_renamed_21 = (byte)z_0.var_int_arr_if[0];
        this.cfr_renamed_9 = (byte)z_0.var_int_arr_if[0];
        this.cfr_renamed_15 = (byte)z_0.var_int_arr_if[0];
        this.var_boolean_char = z_0.var_int_arr_if[0];
        this.var_boolean_try = z_0.var_int_arr_if[0];
        this.var_boolean_byte = z_0.var_int_arr_if[0];
        this.cfr_renamed_13 = (byte)z_0.var_int_arr_if[0];
        this.dangChayAuto = z_0.var_int_arr_if[0];
        this.var_java_util_Vector_case.removeAllElements();
        this.cfr_renamed_4.removeAllElements();
        this.var_java_util_Vector_try.removeAllElements();
        this.cfr_renamed_10 = (byte)z_0.var_int_arr_if[0];
        this.var_boolean_case = z_0.var_int_arr_if[0];
        w_0.coKichHoat = z_0.var_int_arr_if[0];
        this.cfr_renamed_14 = z_0.var_int_arr_if[1];
        this.cfr_renamed_14 = (byte)z_0.var_int_arr_if[0];
        w_0.var_boolean_int = z_0.var_int_arr_if[0];
        this.cfr_renamed_17();
        var1_1 = z_0.var_int_arr_if[0];
        if (" ".length() != 0) ** GOTO lbl28
        return;
lbl-1000:
        // 1 sources

        {
            ((bK)this.cfr_renamed_3.elementAt((int)var1_1)).cfr_renamed_0 = z_0.var_int_arr_if[0];
            ++var1_1;
lbl28:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)this.cfr_renamed_3.size()))
        }
lbl29:
        // 1 sources

    }

        /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_5() {
        super.cfr_renamed_5();
        this.var_java_util_Vector_byte.removeAllElements();
        int n = var_int_arr_if[0];
        while (!(n >= w_0.var_java_util_Vector_if.size())) {
            if (z_0.boolean_if(((dd_0)((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n))).cfr_renamed_9, w_0.cfr_renamed_13)) {
                this.var_java_util_Vector_byte.addElement(String.valueOf(n));
            }
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (byte[] var1_1 == null) {
        this.var_byte_arr_do = var1_1;
        var1_1 = new Vector<E>();
        var2_2 = z_0.var_int_arr_if[0];
        if (((133 ^ 182 ^ (240 ^ 148)) & (72 + 217 - 258 + 191 ^ 69 + 63 - 52 + 57 ^ -" ".length())) == 0) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = new bK();
            if ((var2_2 == this.var_byte_arr_do[z_0.var_int_arr_if[0]])) {
                var3_3.cfr_renamed_0 = z_0.var_int_arr_if[2];
            }
            var1_1.addElement(var3_3);
            ++var2_2;
lbl13:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var2_2, (int)z_0.var_int_arr_if[2]))
        }
lbl14:
        // 1 sources

        dt_0.dt_0_do().cfr_renamed_1((Vector)var1_1);
        this.cfr_renamed_22();
    }

    private static boolean boolean_new(int n) {
        return n <= 0;
    }

    private void (int n, int n2, int n3, int n4 == null) {
        gz_0 gz_02 = new gz_0(n, n2, n3, n4);
        this.var_java_util_Vector_try.addElement(gz_02);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_26() {
        int n = var_int_arr_if[0];
        while (!(n >= var_int_arr_if[2])) {
            bK bK2 = (bK)this.cfr_renamed_3.elementAt(n);
            int n2 = (this.var_java_util_Vector_byte, (int)this.cfr_renamed_15 == null);
            this.cfr_renamed_1(bK2.cfr_renamed_1, bK2.cfr_renamed_3, bK2.cfr_renamed_1, bK2.cfr_renamed_3, this.var_byte_arr_arr_do[this.cfr_renamed_15][n], z_0.int_if(n2), n);
            ++n;
        }
    }

    public final void cfr_renamed_8() {
        super.cfr_renamed_8();
        if ((GameCanvas.soLuongKhoa > var_int_arr_if[16])) {
            fs[] fsArray = new fs[var_int_arr_if[3]];
            fsArray[z_0.var_int_arr_if[0]] = new fs(var_int_arr_if[17] * dF.cfr_renamed_12, var_int_arr_if[18] + var_int_arr_if[19] * dF.cfr_renamed_12, var_int_arr_if[2]);
            fsArray[z_0.var_int_arr_if[15]] = new fs(var_int_arr_if[17] * dF.cfr_renamed_12, GameCanvas.var_int_char + var_int_arr_if[20], var_int_arr_if[2]);
            fsArray[z_0.var_int_arr_if[11]] = new fs(GameCanvas.cfr_renamed_15, GameCanvas.var_int_int - GameCanvas.this - var_int_arr_if[21], var_int_arr_if[22]);
            fsArray[z_0.var_int_arr_if[4]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[23] * dF.cfr_renamed_12, GameCanvas.var_int_char + var_int_arr_if[20], var_int_arr_if[21]);
            fsArray[z_0.var_int_arr_if[24]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[23] * dF.cfr_renamed_12, var_int_arr_if[18] + var_int_arr_if[19] * dF.cfr_renamed_12, var_int_arr_if[21]);
            var_fs_arr_if = fsArray;
            return;
        }
        fs[] fsArray = new fs[var_int_arr_if[3]];
        fsArray[z_0.var_int_arr_if[0]] = new fs(var_int_arr_if[17], var_int_arr_if[25], var_int_arr_if[2]);
        fsArray[z_0.var_int_arr_if[15]] = new fs(var_int_arr_if[17], GameCanvas.var_int_char - var_int_arr_if[3], var_int_arr_if[2]);
        fsArray[z_0.var_int_arr_if[11]] = new fs(GameCanvas.cfr_renamed_15, GameCanvas.var_int_int - GameCanvas.this - var_int_arr_if[21], var_int_arr_if[22]);
        fsArray[z_0.var_int_arr_if[4]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[23], GameCanvas.var_int_char - var_int_arr_if[3], var_int_arr_if[21]);
        fsArray[z_0.var_int_arr_if[24]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[23], var_int_arr_if[25], var_int_arr_if[21]);
        var_fs_arr_if = fsArray;
    }

    private static int int_if(int n) {
        switch (n) {
            case 0: {
                return var_int_arr_if[4];
            }
            case 1: {
                return var_int_arr_if[0];
            }
            case 2: {
                return var_int_arr_if[15];
            }
            case 3: {
                return var_int_arr_if[11];
            }
        }
        return var_int_arr_if[1];
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_13() {
        w_0.coKichHoat = var_int_arr_if[0];
        w_0.var_boolean_int = var_int_arr_if[15];
        this.var_java_util_Vector_byte.removeAllElements();
        this.cfr_renamed_2();
        int n = var_int_arr_if[0];
        while (!(n >= w_0.var_java_util_Vector_if.size())) {
            if (z_0.boolean_if(((dd_0)((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n))).cfr_renamed_9, w_0.cfr_renamed_13)) {
                this.var_java_util_Vector_byte.addElement(String.valueOf(n));
            }
            ++n;
        }
        this.cfr_renamed_26();
        ((dF)this).cfr_renamed_3 = w_0.var_fl_0_if;
    }

    public final void cfr_renamed_9() {
        ((dF)this).cfr_renamed_3 = w_0.var_fl_0_do;
        this.var_fl_0_new = this.var_fl_0_char;
        ((dF)this).cfr_renamed_3.chuoiGiaTri = "Đặt";
        this.var_fl_0_new.chuoiGiaTri = "Xong";
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_27() {
        ((bK)this.cfr_renamed_3.elementAt((int)this.var_byte_char)).cfr_renamed_0 += z_0.var_int_arr_if[15];
        var1_1 = this;
        var2_2 = z_0.var_int_arr_if[0];
        if (((217 ^ 184 ^ (216 ^ 165)) & (21 ^ 125 ^ (223 ^ 171) ^ -" ".length())) == 0) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (bK)var1_1.cfr_renamed_3.elementAt(var2_2);
            var4_5 = (var1_1.var_java_util_Vector_byte, w_0.int_do(AngelChip.duLieuNguoiChoi.cfr_renamed_9) == null);
            var5_6 = z_0.int_if(var4_5);
            var6_7 = var3_3.cfr_renamed_0;
            var7_8 = var3_3.cfr_renamed_3 + z_0.cfr_renamed_23 / z_0.var_int_arr_if[11];
            var4_5 = var3_3.cfr_renamed_1 + z_0.cfr_renamed_22 / z_0.var_int_arr_if[11];
            var3_3 = var1_1;
            var4_4 = new gM(var4_5, var7_8, var6_7, var5_6);
            var3_3.var_java_util_Vector_case.addElement(var4_4);
            ++var2_2;
lbl18:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var2_2, (int)z_0.var_int_arr_if[2]))
        }
lbl19:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_25() {
        this.cfr_renamed_3.removeAllElements();
        this.cfr_renamed_17 = GameCanvas.soLuongKhoa / z_0.var_int_arr_if[11] - z_0.cfr_renamed_22 - z_0.cfr_renamed_22 / z_0.var_int_arr_if[11] - z_0.var_int_arr_if[21];
        this.cfr_renamed_24 = GameCanvas.var_int_case / z_0.var_int_arr_if[11] - z_0.cfr_renamed_23 - z_0.var_int_arr_if[13];
        var1_1 = z_0.var_int_arr_if[0];
        if (-" ".length() != "  ".length()) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = new bK();
            new bK().cfr_renamed_2 = var1_1;
            var2_2.cfr_renamed_1 = this.cfr_renamed_17 + var1_1 % z_0.var_int_arr_if[4] * (z_0.cfr_renamed_22 + z_0.var_int_arr_if[21]);
            var2_2.cfr_renamed_3 = this.cfr_renamed_24 + var1_1 / z_0.var_int_arr_if[4] * (z_0.cfr_renamed_23 + z_0.var_int_arr_if[6]);
            this.cfr_renamed_3.addElement(var2_2);
            ++var1_1;
lbl15:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var1_1, (int)z_0.var_int_arr_if[2]))
        }
lbl16:
        // 1 sources

    }

    private void cfr_renamed_28() {
        this.var_fl_0_new = this.var_fl_0_char;
        this.var_fl_0_new.chuoiGiaTri = "Chọn lại";
    }

    /*
     * Unable to fully structure code
     */
    private static int (Vector var0, int var1_1 == null) {
        var2_2 = z_0.var_int_arr_if[0];
        if ((175 ^ 171) > "  ".length()) ** GOTO lbl9
        return (248 ^ 199) & ~(188 ^ 131);
lbl-1000:
        // 1 sources

        {
            if (z_0.cfr_renamed_5((int)((String)var0.elementAt(var2_2)).equals(String.valueOf(var1_1)))) {
                return var2_2;
            }
            ++var2_2;
lbl9:
            // 2 sources

            ** while (!z_0.cfr_renamed_5((int)var2_2, (int)var0.size()))
        }
lbl10:
        // 1 sources

        return z_0.var_int_arr_if[1];
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_8();
        super.cfr_renamed_4();
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics == null) {
        this.cfr_renamed_0(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        Graphics graphics2 = graphics;
        z_0 z_02 = this;
        int n = var_int_arr_if[0];
        while (!(n >= z_02.var_java_util_Vector_char.size())) {
            gb_0 gb_02 = (gb_0)z_02.var_java_util_Vector_char.elementAt(n);
            if (z_0.boolean_int(gb_02.var_byte_do)) {
                GameCanvas.var_fz_0_int.cfr_renamed_1(graphics2, "+" + gb_02.var_short_if, ((bm)gb_02).cfr_renamed_2, ((bm)gb_02).cfr_renamed_3, var_int_arr_if[11]);
            }
            ++n;
        }
        super.cfr_renamed_1(graphics);
    }

        }

