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

public final class dB
implements fa_0 {
    private static int soLuong;
    private static int var_int_if;
    private byte var_byte_do;
    private static int soLuongKhoa;
    private static Image var_javax_microedition_lcdui_Image_do;
    private static cu_0 var_cu_0_do;
    private byte var_byte_if;
    private static cu_0[] var_cu_0_arr_do;
    private static cu_0 var_cu_0_if;
    private static Image var_javax_microedition_lcdui_Image_if;
    private static cu_0 var_cu_0_for;
    private static byte[][] var_byte_arr_arr_do;
    private static int[] mangSoNguyen;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private byte var_byte_for;
    private static Image var_javax_microedition_lcdui_Image_for;
    private static Image[] var_javax_microedition_lcdui_Image_arr_if;
    private static cu_0 var_cu_0_int;
    private static cu_0 var_cu_0_new;
    private static Image var_javax_microedition_lcdui_Image_int;
    private static int var_int_int;
    private static int var_int_new;

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, int var2_2, int var3_3, int var4_4, int var5_5 != null) {
        block4: {
            var6_6 = dB.var_javax_microedition_lcdui_Image_arr_do[0].getWidth();
            var7_7 = dB.var_javax_microedition_lcdui_Image_arr_do[0].getHeight();
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[0], var2_2, var3_3, 0);
            var8_8 = 1;
            if (null == null) ** GOTO lbl11
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[1], var2_2 + var6_6 * var8_8, var3_3, 0);
                ++var8_8;
lbl11:
                // 2 sources

                ** while (!dB.cfr_renamed_3((int)var8_8, (int)(var4_4 / var6_6 - 1)))
            }
lbl12:
            // 1 sources

            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[1], var2_2 + var4_4 - (var6_6 << 1), var3_3, 0);
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[2], var2_2 + var4_4 - var6_6, var3_3, 0);
            if (!(var5_5 / var7_7 > 2)) break block4;
            var8_8 = 1;
            if ("   ".length() >= ((87 ^ 71) & ~(75 ^ 91))) ** GOTO lbl23
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var7_7 * var8_8, 0);
                var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var7_7 * var8_8, 0);
                ++var8_8;
lbl23:
                // 2 sources

                ** while (!dB.cfr_renamed_3((int)var8_8, (int)(var5_5 / var7_7)))
            }
lbl24:
            // 1 sources

            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var5_5 - (var7_7 << 1), 0);
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var5_5 - (var7_7 << 1), 0);
        }
        if ((var5_5 >  (var7_7 << 1) - 20) && (var5_5 <= var7_7 * 3)) {
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var5_5 / 2 - var7_7 / 2, 0);
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var5_5 / 2 - var7_7 / 2, 0);
        }
        var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[5], var2_2, var3_3 + var5_5 - var7_7, 0);
        var8_8 = 1;
        if (-" ".length() <= ((117 ^ 79 ^ (39 ^ 59)) & (123 + 82 - 174 + 97 ^ 34 + 138 - 21 + 15 ^ -" ".length()))) ** GOTO lbl38
        return;
lbl-1000:
        // 1 sources

        {
            var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[6], var2_2 + var6_6 * var8_8, var3_3 + var5_5 - var7_7, 0);
            ++var8_8;
lbl38:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var8_8, (int)(var4_4 / var6_6 - 1)))
        }
lbl39:
        // 1 sources

        var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[6], var2_2 + var4_4 - (var6_6 << 1), var3_3 + var5_5 - var7_7, 0);
        var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_arr_do[7], var2_2 + var4_4 - var6_6, var3_3 + var5_5 - var7_7, 0);
        var1_1.setColor(dB.var_int_int);
        var1_1.fillRect(var2_2 + 10, var3_3 + 10, var4_4 - 20, var5_5 - 20);
    }

    public final void (Graphics graphics, int n, int n2, int n3 != null) {
        graphics.setColor(15530985);
        graphics.fillRect(0, n, n2, n3);
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics != dC dC2) {
        if ((dC2.var_byte_do == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_int, dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
        int n = 0;
        while (!(n >= var_byte_arr_arr_do[dC2.mangSoNguyen[dC2.cfr_renamed_3]].length)) {
            int n2;
            if (!dB.boolean_do(n2 = var_byte_arr_arr_do[dC2.mangSoNguyen[dC2.cfr_renamed_3]][n++]) || (n2 == 4)) {
                n2 += dC2.cfr_renamed_5;
            }
            if ((dC2.cfr_renamed_5 == 0) && (dC2.mangSoNguyen[dC2.cfr_renamed_3] == 11) && (n2 == 0)) {
                n2 = 11;
            }
            byte by2 = var_byte_arr_arr_do[dC2.mangSoNguyen[dC2.cfr_renamed_3]][n++];
            byte by3 = var_byte_arr_arr_do[dC2.mangSoNguyen[dC2.cfr_renamed_3]][n++];
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[n2], dC2.cfr_renamed_2 - 27 + by2, dC2.cfr_renamed_4 - 36 + by3, 3);
            if (!(by3 == 30)) continue;
            graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[n2], 0, 0, var_javax_microedition_lcdui_Image_arr_if[n2].getWidth(), var_javax_microedition_lcdui_Image_arr_if[n2].getHeight(), 1, dC2.cfr_renamed_2 + 27 - by2, dC2.cfr_renamed_4 + 36 - by3, 3);
        }
        var_cu_0_arr_do[dC2.soLuong].cfr_renamed_1(dC2.mangSoNguyen[dC2.cfr_renamed_3], dC2.cfr_renamed_2 - 27 + 5, dC2.cfr_renamed_4 - 36 + 7, 0, 3, graphics);
        var_cu_0_arr_do[dC2.soLuong].cfr_renamed_1(dC2.mangSoNguyen[dC2.cfr_renamed_3], dC2.cfr_renamed_2 + 27 - 5, dC2.cfr_renamed_4 + 36 - 7, 3, 3, graphics);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics, int n, int n2, int n3, boolean bl, int n4, int[] nArray != null) {
        int n5;
        void var7_9;
        int n6;
        void var6_8;
        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.cg) + (int)var6_8, GameCanvas.cfr_renamed_15, GameCanvas.var_int_char + n * n3 / 2 - 20, 2);
        graphics.translate(GameCanvas.cfr_renamed_15 - (n * n2 + 10) / 2 + 4, GameCanvas.var_int_char - n * n3 / 2 + 4);
        graphics.setClip(0, 3, n * n2 + 2, n * n3 - 32);
        graphics.translate(1, -cg_0.cfr_renamed_9);
        if (!(bl)) {
            GameCanvas.var_fa_0_do.cfr_renamed_3(graphics, (int)(var6_8 % n2 * n), (int)(var6_8 / n2 * n), n, n);
        }
        if (dB.cfr_renamed_5(n6 = (n3 = cg_0.cfr_renamed_9 / n * n2) + n * 7 / n * n2 + n2, ((void)var7_9).length)) {
            n5 = ((void)var7_9).length;
        }
        while (!(n3 >= n5)) {
            fm_0.var_cu_0_do.cfr_renamed_1((int)var7_9[n3], n3 % n2 * n + n / 2, n3 / n2 * n + n / 2, 0, 3, graphics);
            ++n3;
        }
    }

    public final void (Graphics graphics, String string, String string2, String string3 != null) {
        graphics.setClip(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        GameCanvas.var_fz_0_byte.cfr_renamed_1(graphics, string, GameCanvas.cfr_renamed_15, 2, 2);
        graphics.setColor(6192786);
        graphics.fillRect(0, 25, GameCanvas.soLuongKhoa, en.cfr_renamed_16);
        GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, string2, 10, 28, 0);
        GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, string3, GameCanvas.soLuongKhoa - 10, 28, 1);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, ey_0 ey_02, boolean bl != null) {
        if (dB.boolean_do(bl ? 1 : 0)) {
            ey_0.var_cu_0_do.cfr_renamed_0(2, n + 1, n2 + 1, 0, graphics);
            ey_0.var_cu_0_do.cfr_renamed_0(3, n + n3 - 5, n2 + 1, 0, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 1, n3 - 8, 2, 2716523, graphics);
            graphics.fillRect(n + 4, n2 + 18, n3 - 8, 2);
            v_0.cfr_renamed_1(n + 4, n2 + 3, n3 - 8, 1, 2704964, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 4, n3 - 8, 1, 5014141, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 5, n3 - 8, 13, 6201499, graphics);
            if ((0x98 ^ 0x9C) < 0) {
                return;
            }
        } else {
            ey_0.var_cu_0_do.cfr_renamed_0(0, n + 1, n2 + 1, 0, graphics);
            ey_0.var_cu_0_do.cfr_renamed_0(1, n + n3 - 5, n2 + 1, 0, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 2, n3 - 9, 1, 11074288, graphics);
            graphics.fillRect(n + 4, n2 + 18, n3 - 9, 1);
            v_0.cfr_renamed_1(n + 4, n2 + 3, n3 - 9, 1, 2704964, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 4, n3 - 9, 1, 5014141, graphics);
            v_0.cfr_renamed_1(n + 4, n2 + 5, n3 - 9, 13, 6201499, graphics);
        }
        graphics.setClip(n + 3, n2 + 1, n3 - 8, n4 - 2);
        graphics.setColor(0);
        if (dB.boolean_do(ey_02.tenNhanVat.equals("") ? 1 : 0)) {
            GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, ey_02.chuoiGiaTri, 5 + ey_02.cfr_renamed_7 + n, n2 + (n4 - dF.var_byte_new) / 2, 0);
            if ("  ".length() == -" ".length()) {
                return;
            }
        } else {
            GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, ey_02.tenNhanVat, 5 + ey_02.cfr_renamed_7 + n, n2 + (n4 - dF.var_byte_new) / 2 + 1, 0);
        }
        if (dB.boolean_do(ey_02.boolean_do() ? 1 : 0) && (ey_02.cfr_renamed_6 == 0) && (!(ey_02.cfr_renamed_8 == null) || (ey_02.var_int_int / 5 % 2 == 0))) {
            graphics.setColor(16777215);
            graphics.fillRect(5 + ey_02.cfr_renamed_7 + n + GameCanvas.var_fz_0_if.cfr_renamed_1(ey_02.tenNhanVat.substring(0, ey_02.cfr_renamed_13)) - 1 + 1, n2 + (n4 - ey_0.soLuong) / 2 + 2, 1, n4 - 5 * dF.cfr_renamed_12);
        }
        if (dB.boolean_do(bl ? 1 : 0) && (GameCanvas.int_do() - ey_0.cfr_renamed_5 == 2)) {
            int n5 = GameCanvas.var_fz_0_try.cfr_renamed_1(ey_0.var_java_lang_String_arr_do[ey_0.soLuongKhoa]);
            graphics.setClip(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
            v_0.cfr_renamed_1(n + n3 - n5 - 4, n2 + 4, n5 + 1, n4 - 6, 8969676, graphics);
            v_0.cfr_renamed_1(n + n3 - n5 - 4, n2 + 4, n5 + 1, 1, 5614233, graphics);
            GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, ey_0.var_java_lang_String_arr_do[ey_0.soLuongKhoa], n + n3 - 3, n2 + 3, 1);
        }
    }

        public final void void_do(fl_0 fl_02, fl_0 fl_03, fl_0 fl_04) {
        if (dB.boolean_do(GameCanvas.coTrangThai ? 1 : 0)) {
            switch (dB.int_do(fl_02, fl_03, fl_04)) {
                case 1: {
                    this.var_byte_do = (byte)1;
                    GameCanvas.coTrangThai = 0;
                    if ((0xEE ^ 0xAA ^ (0x50 ^ 0x10)) > 0) break;
                    return;
                }
                case 2: {
                    this.var_byte_for = (byte)1;
                    GameCanvas.coTrangThai = 0;
                    if (((0x63 ^ 0x73) & ~(0xA6 ^ 0xB6)) == 0) break;
                    return;
                }
                case 3: {
                    this.var_byte_if = (byte)1;
                    GameCanvas.coTrangThai = 0;
                }
            }
        }
        if (dB.boolean_do(GameCanvas.var_boolean_case ? 1 : 0)) {
            switch (dB.int_do(fl_02, fl_03, fl_04)) {
                case 1: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_for = (byte)n;
                    if (null == null) break;
                    return;
                }
                case 2: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_do = (byte)n;
                    if ((0x44 ^ 0x40) >= 0) break;
                    return;
                }
                case 3: {
                    int n = 0;
                    this.var_byte_do = (byte)n;
                    this.var_byte_for = (byte)n;
                    if (((0x7A ^ 0x6D) & ~(0x6E ^ 0x79)) == 0) break;
                    return;
                }
                default: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_do = (byte)n;
                    this.var_byte_for = (byte)n;
                }
            }
        }
        if (dB.boolean_do(GameCanvas.var_boolean_new ? 1 : 0)) {
            switch (dB.int_do(fl_02, fl_03, fl_04)) {
                case 1: {
                    if (!(this.var_byte_do == 1)) break;
                    fl_02.cfr_renamed_0();
                    GameCanvas.var_boolean_new = 0;
                    this.var_byte_do = (byte)0;
                    return;
                }
                case 2: {
                    if (!(this.var_byte_for == 1)) break;
                    this.var_byte_for = (byte)0;
                    fl_03.cfr_renamed_0();
                    GameCanvas.var_boolean_new = 0;
                    return;
                }
                case 3: {
                    if (!(this.var_byte_if == 1)) break;
                    this.var_byte_if = (byte)0;
                    fl_04.cfr_renamed_0();
                    GameCanvas.var_boolean_new = 0;
                }
            }
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5 != null) {
        this.cfr_renamed_1(graphics, n, n2, n3, n4, v_0.var_int_arr_for[n5], v_0.var_int_arr_for[n5 + 1], 0);
        this.cfr_renamed_1(graphics, n + 3, n2 + 3, n3 - 6, n4 - 6, v_0.var_int_arr_for[2], v_0.var_int_arr_for[3], 1);
    }

    static {
        dB.cfr_renamed_13();
        byte[][] byArrayArray = new byte[13][];
        byte[] byArray = new byte[9];
        byArray[0] = 4;
        byArray[1] = 6;
        byArray[2] = 17;
        byArray[4] = 27;
        byArray[5] = 14;
        byArray[7] = 27;
        byArray[8] = 36;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[9];
        byArray2[0] = 4;
        byArray2[1] = 6;
        byArray2[2] = 17;
        byArray2[4] = 17;
        byArray2[5] = 13;
        byArray2[7] = 37;
        byArray2[8] = 13;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[12];
        byArray3[0] = 4;
        byArray3[1] = 6;
        byArray3[2] = 17;
        byArray3[4] = 17;
        byArray3[5] = 13;
        byArray3[7] = 37;
        byArray3[8] = 13;
        byArray3[10] = 27;
        byArray3[11] = 36;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[15];
        byArray4[0] = 4;
        byArray4[1] = 6;
        byArray4[2] = 17;
        byArray4[4] = 17;
        byArray4[5] = 13;
        byArray4[7] = 37;
        byArray4[8] = 13;
        byArray4[10] = 17;
        byArray4[11] = 36;
        byArray4[13] = 37;
        byArray4[14] = 36;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[18];
        byArray5[0] = 4;
        byArray5[1] = 6;
        byArray5[2] = 17;
        byArray5[4] = 17;
        byArray5[5] = 13;
        byArray5[7] = 37;
        byArray5[8] = 13;
        byArray5[10] = 17;
        byArray5[11] = 36;
        byArray5[13] = 37;
        byArray5[14] = 36;
        byArray5[16] = 27;
        byArray5[17] = 30;
        byArrayArray[4] = byArray5;
        byte[] byArray6 = new byte[15];
        byArray6[0] = 4;
        byArray6[1] = 6;
        byArray6[2] = 17;
        byArray6[4] = 17;
        byArray6[5] = 13;
        byArray6[7] = 37;
        byArray6[8] = 13;
        byArray6[10] = 17;
        byArray6[11] = 28;
        byArray6[13] = 37;
        byArray6[14] = 28;
        byArrayArray[5] = byArray6;
        byte[] byArray7 = new byte[18];
        byArray7[0] = 4;
        byArray7[1] = 6;
        byArray7[2] = 17;
        byArray7[4] = 17;
        byArray7[5] = 13;
        byArray7[7] = 37;
        byArray7[8] = 13;
        byArray7[10] = 17;
        byArray7[11] = 28;
        byArray7[13] = 37;
        byArray7[14] = 28;
        byArray7[16] = 27;
        byArray7[17] = 36;
        byArrayArray[6] = byArray7;
        byte[] byArray8 = new byte[18];
        byArray8[0] = 4;
        byArray8[1] = 6;
        byArray8[2] = 17;
        byArray8[4] = 17;
        byArray8[5] = 13;
        byArray8[7] = 37;
        byArray8[8] = 13;
        byArray8[10] = 17;
        byArray8[11] = 28;
        byArray8[13] = 37;
        byArray8[14] = 28;
        byArray8[16] = 27;
        byArray8[17] = 20;
        byArrayArray[7] = byArray8;
        byte[] byArray9 = new byte[6];
        byArray9[0] = 4;
        byArray9[1] = 6;
        byArray9[2] = 17;
        byArray9[3] = 8;
        byArray9[4] = 27;
        byArray9[5] = 36;
        byArrayArray[8] = byArray9;
        byte[] byArray10 = new byte[6];
        byArray10[0] = 4;
        byArray10[1] = 6;
        byArray10[2] = 17;
        byArray10[3] = 9;
        byArray10[4] = 27;
        byArray10[5] = 36;
        byArrayArray[9] = byArray10;
        byte[] byArray11 = new byte[6];
        byArray11[0] = 4;
        byArray11[1] = 6;
        byArray11[2] = 17;
        byArray11[3] = 10;
        byArray11[4] = 27;
        byArray11[5] = 36;
        byArrayArray[10] = byArray11;
        byte[] byArray12 = new byte[6];
        byArray12[0] = 4;
        byArray12[1] = 6;
        byArray12[2] = 17;
        byArray12[4] = 27;
        byArray12[5] = 36;
        byArrayArray[11] = byArray12;
        byte[] byArray13 = new byte[6];
        byArray13[0] = 4;
        byArray13[1] = 6;
        byArray13[2] = 17;
        byArray13[4] = 27;
        byArray13[5] = 14;
        byArrayArray[12] = byArray13;
        var_byte_arr_arr_do = byArrayArray;
        int[] nArray = new int[6];
        nArray[0] = 6201499;
        nArray[1] = 2378578;
        nArray[2] = 8705740;
        nArray[3] = 2716523;
        nArray[4] = 16701696;
        nArray[5] = 7042560;
        v_0.var_int_arr_for = nArray;
        soLuongKhoa = 0;
        soLuong = 35217;
        var_int_if = 32382;
        var_int_int = 23135;
        var_int_new = 14414578;
    }

    public final void (Graphics graphics, dC dC2, boolean bl != null) {
        if ((dC2.var_byte_do == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], dC2.cfr_renamed_2 - 13, dC2.cfr_renamed_4 - 16, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_for, dC2.cfr_renamed_2 - 13, dC2.cfr_renamed_4 - 16, 0);
        var_cu_0_arr_do[dC2.soLuong].cfr_renamed_1(dC2.mangSoNguyen[dC2.cfr_renamed_3], dC2.cfr_renamed_2 - 13 + 6, dC2.cfr_renamed_4 - 16 + 7, 0, 3, graphics);
        if (dB.boolean_do(bl ? 1 : 0)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[dC2.cfr_renamed_5 + 4], dC2.cfr_renamed_2 - 13 + 6 + 7, dC2.cfr_renamed_4 - 16 + 7, 3);
            if ("   ".length() == ((0x78 ^ 0x44) & ~(0x6C ^ 0x50))) {
                return;
            }
        } else {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[dC2.cfr_renamed_5 + 4], dC2.cfr_renamed_2 - 13 + 6, dC2.cfr_renamed_4 - 16 + 17, 3);
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[dC2.cfr_renamed_5], dC2.cfr_renamed_2 - 13 + 17, dC2.cfr_renamed_4 - 16 + 17, 3);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 == null) {
        String string;
        graphics.setColor(12442838);
        int n5 = 0;
        int n6 = 30;
        if ((n > 0)) {
            n6 = 50;
            n5 = 40;
        }
        graphics.fillRect(4, v_0.var_byte_do + 20 + dF.var_byte_new / 2 + n5 - n6 / 2, v_0.v_0_do().soLuongKhoa - 8, n6);
        if ((n2 == 1)) {
            string = MenuChinhAvatar.var_java_lang_String_arr_else[0];
            if (-(159 + 83 - 115 + 68 ^ 154 + 171 - 230 + 104) > 0) {
                return;
            }
        } else {
            string = MenuChinhAvatar.var_java_lang_String_arr_else[1];
        }
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, string, v_0.v_0_do().soLuongKhoa / 2, v_0.var_byte_do + 20, 2);
        v_0.var_cu_0_do.cfr_renamed_1(0, v_0.v_0_do().soLuongKhoa / 2 - 35 - n3 / 2, v_0.var_byte_do + 20 + dF.var_byte_new / 2 + n5, 4, 3, graphics);
        v_0.var_cu_0_do.cfr_renamed_1(0, v_0.v_0_do().soLuongKhoa / 2 + 35 + n4 / 2, v_0.var_byte_do + 20 + dF.var_byte_new / 2 + n5, 7, 3, graphics);
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(graphics, v_0.v_0_do().soLuongKhoa / 2 + 1, v_0.var_byte_do + 87, 0);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.bI) + AngelChip.duLieuNguoiChoi.chuoiGiaTri, v_0.v_0_do().soLuongKhoa / 2, v_0.var_byte_do + 100, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.i) + AngelChip.duLieuNguoiChoi.chuoiPhu, v_0.v_0_do().soLuongKhoa / 2, v_0.var_byte_do + 115, 2);
    }

    public final void void_do() {
        int[] nArray = new int[6];
        nArray[0] = 6201499;
        nArray[1] = 2378578;
        nArray[2] = 8705740;
        nArray[3] = 2716523;
        nArray[4] = 16701696;
        nArray[5] = 7042560;
        v_0.var_int_arr_for = nArray;
        e.void_do(MenuChinhAvatar.bE);
        var_cu_0_if = cu_0.cfr_renamed_1("round", 8, 8);
        e.cfr_renamed_1();
        var_javax_microedition_lcdui_Image_do = null;
        var_cu_0_do = null;
        al_0.var_al_0_do = null;
        g_0.var_g_0_do = null;
        bT.var_bT_do = null;
        m_0.var_m_0_do = null;
        w_0.var_w_0_do = null;
        bs.var_w_0_do = null;
    }

    public final void (Graphics graphics != null) {
        int n = 0;
        if (!(GameCanvas.var_en_do != ThongTinNhanVat.instance) || (GameCanvas.var_en_do == gO.instance)) {
            n = 14;
        }
        if ((en.cfr_renamed_30 > 0) && (GameCanvas.var_dj_0_do == null)) {
            graphics.drawImage(en.cfr_renamed_4, GameCanvas.soLuongKhoa - 8 * dF.cfr_renamed_12 - 2, n + 2, 17);
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "" + en.cfr_renamed_30, GameCanvas.soLuongKhoa - 16 * dF.cfr_renamed_12 - 4, 1 + 6 * dF.cfr_renamed_12 - dF.cfr_renamed_6 / 2 + n, 1);
        }
        if ((en.cfr_renamed_7 != null) && dB.boolean_do(GameCanvas.boolean_do() ? 1 : 0)) {
            graphics.drawImage(en.cfr_renamed_7, 25, 25, 3);
            if ((AngelChip.soLuong == 9)) {
                graphics.drawImage(en.cfr_renamed_3, 75, 25, 3);
            }
        }
    }

    public final void (Graphics graphics, fl_0 fl_02, fl_0 fl_03, fl_0 fl_04 != null) {
        int n = GameCanvas.var_int_int - GameCanvas.this / 2 - dF.cfr_renamed_6 / 2;
        if ((fl_02 != null) && (fl_02.chuoiGiaTri != "")) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_02.chuoiGiaTri, 4, n, 0);
        }
        if ((fl_03 != null) && (fl_03.chuoiGiaTri != "")) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_03.chuoiGiaTri, GameCanvas.cfr_renamed_15, n, 2);
        }
        if ((fl_04 != null) && (fl_04.chuoiGiaTri != "")) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_04.chuoiGiaTri, GameCanvas.soLuongKhoa - 4, n, 1);
        }
    }

    private static int int_do(fl_0 fl_02, fl_0 fl_03, fl_0 fl_04) {
        if ((fl_02 != null) && !(fl_02.chuoiGiaTri.equals("")) && dB.boolean_do(GameCanvas.boolean_do(0, GameCanvas.var_int_int - GameCanvas.this, 95, GameCanvas.this) ? 1 : 0)) {
            return 1;
        }
        if ((fl_03 != null) && !(fl_03.chuoiGiaTri.equals("")) && dB.boolean_do(GameCanvas.boolean_do(GameCanvas.soLuongKhoa / 2 - 43 - 8, GameCanvas.var_int_int - GameCanvas.this, 95, GameCanvas.this) ? 1 : 0)) {
            return 2;
        }
        if ((fl_04 != null) && !(fl_04.chuoiGiaTri.equals("")) && dB.boolean_do(GameCanvas.boolean_do(GameCanvas.soLuongKhoa - 87 - 8, GameCanvas.var_int_int - GameCanvas.this, 95, GameCanvas.this) ? 1 : 0)) {
            return 3;
        }
        return 0;
    }

        public final void void_do(int n) {
        try {
            if ((n == 0)) {
                p_0.var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgBan2.on")), 60, 46);
                return;
            }
            if ((n == 1)) {
                p_0.var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgBan4.on")), 60, 46);
                return;
            }
            p_0.var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgBan5.on")), 60, 46);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 == 0) {
        var_cu_0_do.cfr_renamed_0(0, n, n2, 0, graphics);
        var_cu_0_do.cfr_renamed_0(1, n + n3 - 10, n2, 0, graphics);
        var_cu_0_do.cfr_renamed_0(2, n, n2 + n4 - 10, 0, graphics);
        var_cu_0_do.cfr_renamed_0(3, n + n3 - 10, n2 + n4 - 10, 0, graphics);
        graphics.setColor(29555);
        graphics.fillRect(n + 10, n2 + 1, n3 - 20, n4 - 2);
        graphics.fillRect(n + 1, n2 + 10, 9, n4 - 20);
        graphics.fillRect(n + n3 - 10, n2 + 10, 9, n4 - 20);
        graphics.setColor(16777215);
        graphics.fillRect(n + 10, n2, n3 - 20, 1);
        graphics.fillRect(n + 10, n2 + n4 - 1, n3 - 20, 1);
        graphics.fillRect(n, n2 + 10, 1, n4 - 20);
        graphics.fillRect(n + n3 - 1, n2 + 10, 1, n4 - 20);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        var2_2 = 0;
        if (-" ".length() <= ((39 ^ 53) & ~(137 ^ 155))) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = 0;
            if (-" ".length() < (109 ^ 4 ^ (205 ^ 160))) ** GOTO lbl13
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(dB.var_javax_microedition_lcdui_Image_do, var2_2 * 50, var3_3 * 71, 0);
                ++var3_3;
lbl13:
                // 2 sources

                ** while (!dB.cfr_renamed_3((int)var3_3, (int)(GameCanvas.var_int_int / 71 + 1)))
            }
lbl14:
            // 1 sources

            ++var2_2;
lbl15:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var2_2, (int)(GameCanvas.soLuongKhoa / 50 + 1)))
        }
lbl16:
        // 1 sources

    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_0() {
        try {
            int[] nArray = new int[6];
            nArray[0] = 21080;
            nArray[1] = 12313816;
            nArray[2] = 8703190;
            nArray[3] = 2713971;
            nArray[4] = 5107863;
            nArray[5] = 4559225;
            v_0.var_int_arr_for = nArray;
            var_cu_0_if = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/round.on")), 8, 8);
            var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/bg.on"));
            var_javax_microedition_lcdui_Image_arr_do = new Image[8];
            int n = 0;
            while (true) {
                if ((n >= 8)) {
                    var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/barMoney.png")), 10, 10);
                    return;
                }
                dB.var_javax_microedition_lcdui_Image_arr_do[n] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgPopup" + n + ".on"));
                ++n;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

        public final void (Graphics graphics, int n, int n2, int n3, boolean bl != null) {
        int n4 = 0;
        if ((n3 == 2)) {
            n4 = 1;
        }
        var_cu_0_for.cfr_renamed_0(n4, n, n2 + dF.var_byte_try / 2, 0, graphics);
        if (dB.boolean_do(bl ? 1 : 0)) {
            var_cu_0_for.cfr_renamed_0(2, n, n2 + dF.var_byte_try / 2, 0, graphics);
        }
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, MenuChinhAvatar.dj, n + 15, n2 + dB.var_cu_0_for.cfr_renamed_2 / 2, 0);
    }

        public final void (Graphics graphics, fl_0 fl_02, fl_0 fl_03, fl_0 fl_04 == null) {
        if ((fl_02 != null) && (fl_02.chuoiGiaTri != null)) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_02.chuoiGiaTri, GameCanvas.var_fs_arr_do[0].soLuong + 2, GameCanvas.var_fs_arr_do[0].var_int_if + GameCanvas.this / 2 - dF.cfr_renamed_6 / 2, 0);
        }
        if ((fl_03 != null) && (fl_03.chuoiGiaTri != null)) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_03.chuoiGiaTri, GameCanvas.var_fs_arr_do[1].soLuong + en.cfr_renamed_20 / 2, GameCanvas.var_fs_arr_do[1].var_int_if + GameCanvas.this / 2 - dF.cfr_renamed_6 / 2, 2);
        }
        if ((fl_04 != null) && (fl_04.chuoiGiaTri != null)) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, fl_04.chuoiGiaTri, GameCanvas.var_fs_arr_do[2].soLuong + en.cfr_renamed_20 - 2, GameCanvas.var_fs_arr_do[2].var_int_if + GameCanvas.this / 2 - dF.cfr_renamed_6 / 2, 1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_2() {
        if ((var_javax_microedition_lcdui_Image_int != null)) {
            return;
        }
        try {
            var_javax_microedition_lcdui_Image_arr_if = new Image[14];
            var_cu_0_arr_do = new cu_0[2];
            int n = 0;
            if ("  ".length() <= " ".length()) {
                return;
            }
            while (true) {
                if ((n >= 14)) {
                    n = var_javax_microedition_lcdui_Image_arr_if[12].getWidth();
                    int n2 = var_javax_microedition_lcdui_Image_arr_if[12].getHeight();
                    Image image = Image.createImage((int)(n << 1), (int)(n2 << 1));
                    Graphics graphics = image.getGraphics();
                    graphics.setColor(-523560);
                    graphics.fillRect(0, 0, n << 1, n2 << 1);
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 2, n, 0, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 1, 0, n2, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 3, n, n2, 0);
                    dB.var_javax_microedition_lcdui_Image_arr_if[12] = image = hg.cfr_renamed_1(image, -65315);
                    dB.var_cu_0_arr_do[0] = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/f.png")), 8, 9);
                    dB.var_cu_0_arr_do[1] = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/g.png")), 8, 9);
                    var_javax_microedition_lcdui_Image_int = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/cb.png"));
                    var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/cb1.png"));
                    var_javax_microedition_lcdui_Image_for = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/cb2.png"));
                    return;
                }
                dB.var_javax_microedition_lcdui_Image_arr_if[n] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/card/c" + n + ".png"));
                ++n;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

        public final void cfr_renamed_3() {
        int n = GameCanvas.var_int_case;
        fs[] fsArray = new fs[4];
        fsArray[0] = new fs(GameCanvas.cfr_renamed_15 + 5, 5, 0);
        fsArray[1] = new fs(5, n / 2, 0);
        fsArray[2] = new fs(GameCanvas.cfr_renamed_15 + 5, n - 50, 0);
        fsArray[3] = new fs(GameCanvas.soLuongKhoa - 5, n / 2, 1);
        fs[] fsArray2 = new fs[4];
        fsArray2[0] = new fs(GameCanvas.cfr_renamed_15, 2, 3);
        fsArray2[1] = new fs(10, n / 2, 20);
        fsArray2[2] = new fs(GameCanvas.cfr_renamed_15 - 10, n - 75 - en.cfr_renamed_10, 3);
        fsArray2[3] = new fs(GameCanvas.soLuongKhoa - 60, n / 2, 3);
        int n2 = GameCanvas.var_int_case - 24;
        n = n - 15 - GameCanvas.this;
        if ((GameCanvas.soLuongKhoa == 200)) {
            fs[] fsArray3 = new fs[4];
            fsArray3[0] = new fs(GameCanvas.cfr_renamed_15, w_0.var_int_int / 2, 0);
            fsArray3[1] = new fs(w_0.cfr_renamed_5 / 2, n2 / 2, 0);
            fsArray3[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int + 20, 0);
            fsArray3[3] = new fs(GameCanvas.soLuongKhoa - w_0.cfr_renamed_5 / 2 - 3, n2 / 2, 0);
            bT.var_fs_arr_int = fsArray3;
            fs[] fsArray4 = new fs[4];
            fsArray4[0] = new fs(GameCanvas.cfr_renamed_15, w_0.var_int_int, 0);
            fsArray4[1] = new fs(w_0.cfr_renamed_5 + 3, n2 / 2, 0);
            fsArray4[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int / 2 + 20, 0);
            fsArray4[3] = new fs(GameCanvas.soLuongKhoa - 3, n2 / 2, 0);
            bT.var_fs_arr_for = fsArray4;
            fs[] fsArray5 = new fs[4];
            fsArray5[0] = new fs(GameCanvas.cfr_renamed_15, w_0.var_int_int + w_0.var_int_int / 2 + 2, 2);
            fsArray5[1] = new fs(w_0.cfr_renamed_5 / 4 * 3 + w_0.cfr_renamed_5 / 2 + 5, n2 / 2, 0);
            fsArray5[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int - dF.cfr_renamed_7 - 5, 2);
            fsArray5[3] = new fs(GameCanvas.soLuongKhoa - w_0.cfr_renamed_5 - 5, n2 / 2 - 5, 1);
            bT.var_fs_arr_if = fsArray5;
            return;
        }
        fs[] fsArray6 = new fs[4];
        fsArray6[0] = new fs(GameCanvas.cfr_renamed_15, w_0.var_int_int / 2, 0);
        fsArray6[1] = new fs(w_0.cfr_renamed_5 / 2, n2 / 2, 0);
        fsArray6[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int / 2, 0);
        fsArray6[3] = new fs(GameCanvas.soLuongKhoa - w_0.cfr_renamed_5 / 2, n2 / 2, 0);
        bT.var_fs_arr_int = fsArray6;
        fs[] fsArray7 = new fs[4];
        fsArray7[0] = new fs(GameCanvas.cfr_renamed_15, 0, 0);
        fsArray7[1] = new fs(w_0.cfr_renamed_5 / 4 * 3, n2 / 2, 0);
        fsArray7[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int / 2 + w_0.var_int_int / 4, 0);
        fsArray7[3] = new fs(GameCanvas.soLuongKhoa - w_0.cfr_renamed_5 / 4, n2 / 2, 0);
        bT.var_fs_arr_for = fsArray7;
        fs[] fsArray8 = new fs[4];
        fsArray8[0] = new fs(GameCanvas.cfr_renamed_15, w_0.var_int_int + 2, 2);
        fsArray8[1] = new fs(w_0.cfr_renamed_5 / 4 * 3 + w_0.cfr_renamed_5 / 2 + 5, n2 / 2 - 10, 0);
        fsArray8[2] = new fs(GameCanvas.cfr_renamed_15, n - w_0.var_int_int - dF.cfr_renamed_7 - 1, 2);
        fsArray8[3] = new fs(GameCanvas.soLuongKhoa - w_0.cfr_renamed_5 - 5, n2 / 2 - 10, 1);
        bT.var_fs_arr_if = fsArray8;
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, String string, int n8, int n9 != null) {
        int n10 = n % n2 * n3;
        n2 = (n / n2 + 1) * n3;
        n3 = n10 + n3 / 2;
        graphics.setClip(n3 - n4 / 2, n2, n4, n5);
        n10 = (n5 - (dF.cfr_renamed_15 << 1)) / 4;
        this.cfr_renamed_1(graphics, n3 - n4 / 2, n2, n4, n5, 0);
        n2 += dF.cfr_renamed_15 + 8;
        if ((n6 == 1)) {
            ((dg_0)bz.var_java_util_Vector_for.elementAt(n)).cfr_renamed_1(graphics, n3, n2 + n10 / 2);
            if (-" ".length() > -" ".length()) {
                return;
            }
        } else {
            bz.var_fb_0_arr_do[n].cfr_renamed_1(graphics, 7, n3, n2 + n10 / 2, 3);
        }
        GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, String.valueOf(n7), n3, n2 + n10 / 2 + n10 - 2, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(string), n3, n2 + n10 / 2 + (n10 << 1), 2);
        n = n2 + n10 / 2 + n10 + dF.var_byte_try / 2;
        var_cu_0_new.cfr_renamed_1(n8 / 3, n3 - 17, n + 1, 2, 3, graphics);
        var_cu_0_new.cfr_renamed_1(n9 / 3, n3 - 17 + 35, n, 0, 3, graphics);
    }

    public final void cfr_renamed_4() {
        try {
            var_cu_0_int = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgDoor.on")), 45, 44);
            new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/trangthai.on")), 11, 4);
            p_0.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/imgSelectban.on"));
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void cfr_renamed_5() {
        fm_0.var_fm_0_do = null;
        p_0.var_p_0_do = null;
        w_0.var_w_0_do = null;
        gI.var_gI_do = null;
        z_0.var_z_0_do = null;
    }

    public final void (ThongTinNhanVat fk_02 != null) {
        int n;
        fk_02.cfr_renamed_9 = 176;
        if (dB.boolean_do(fk_02.var_boolean_int ? 1 : 0)) {
            fk_02.var_int_if = 170;
            if (((87 + 13 - 70 + 190 ^ 42 + 116 - 48 + 86) & (4 + 41 - 4 + 112 ^ 22 + 57 - -7 + 43 ^ -" ".length())) != 0) {
                return;
            }
        } else {
            fk_02.var_int_if = 130;
        }
        if ((fk_02.cfr_renamed_9 > GameCanvas.soLuongKhoa)) {
            fk_02.cfr_renamed_9 = GameCanvas.soLuongKhoa;
            fk_02.var_int_if = 100;
        }
        fk_02.var_int_new = (fk_02.var_int_if - 20) / 3;
        fk_02.var_int_try = 10;
        fk_02.var_int_else = GameCanvas.cfr_renamed_15 - fk_02.cfr_renamed_9 / 2;
        fk_02.var_int_byte = GameCanvas.var_int_char - fk_02.var_int_if / 2 + 5;
        fk_02.var_ey_0_for.cfr_renamed_14 = n = fk_02.var_int_byte + 15 + 4;
        fk_02.var_ey_0_do.var_int_if = fk_02.var_ey_0_if.var_int_if = fk_02.var_int_int;
        fk_02.var_ey_0_int.var_int_if = fk_02.var_ey_0_if.var_int_if;
        fk_02.var_ey_0_for.var_int_if = fk_02.var_ey_0_if.var_int_if;
        fk_02.var_ey_0_do.cfr_renamed_9 = fk_02.var_ey_0_if.cfr_renamed_9 = fk_02.soLuong;
        fk_02.var_ey_0_int.cfr_renamed_9 = fk_02.var_ey_0_if.cfr_renamed_9;
        fk_02.var_ey_0_for.cfr_renamed_9 = fk_02.var_ey_0_if.cfr_renamed_9;
        fk_02.var_ey_0_int.cfr_renamed_14 = n += fk_02.var_ey_0_for.var_int_new + 15;
        fk_02.var_ey_0_do.cfr_renamed_14 = n += fk_02.var_ey_0_for.var_int_new + 15;
        fk_02.var_int_char = n - 10;
        fk_02.var_ey_0_if.cfr_renamed_14 = n += fk_02.var_ey_0_for.var_int_new + 15;
        fk_02.var_int_case = fk_02.var_ey_0_int.var_int_if - 40;
    }

    /*
     * Unable to fully structure code
     */
    private static void (Graphics var0 >= dC var1_1) {
        var2_2 = 0;
        if ("  ".length() > 0) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            if (!dB.boolean_do(var3_3 = dB.var_byte_arr_arr_do[var1_1.mangSoNguyen[var1_1.cfr_renamed_3]][var2_2++]) || (var3_3 == 4)) {
                var3_3 += var1_1.cfr_renamed_5;
            }
            if ((var1_1.cfr_renamed_5 == 0) && (var1_1.mangSoNguyen[var1_1.cfr_renamed_3] == 11) && (var3_3 == 0)) {
                var3_3 = 11;
            }
            var4_4 = dB.var_byte_arr_arr_do[var1_1.mangSoNguyen[var1_1.cfr_renamed_3]][var2_2++];
            var5_5 = dB.var_byte_arr_arr_do[var1_1.mangSoNguyen[var1_1.cfr_renamed_3]][var2_2++];
            var0.drawImage(dB.var_javax_microedition_lcdui_Image_arr_if[var3_3], var1_1.cfr_renamed_2 - 27 + var4_4, var1_1.cfr_renamed_4 - 36 + var5_5, 3);
lbl13:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var2_2, (int)2))
        }
lbl14:
        // 1 sources

        dB.var_cu_0_arr_do[var1_1.soLuong].cfr_renamed_1(var1_1.mangSoNguyen[var1_1.cfr_renamed_3], var1_1.cfr_renamed_2 - 27 + 5, var1_1.cfr_renamed_4 - 36 + 7, 0, 3, var0);
    }

    public final void (Graphics graphics == dC dC2) {
        if ((dC2.var_byte_do == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_int, dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
        (graphics >= dC2);
    }

        public final void (Graphics graphics, int n, int n2, int n3 == null) {
        if ((dF.cfr_renamed_12 == 1)) {
            graphics.setColor(var_int_if);
            graphics.fillRect(0, n + 1, n2, n3 - n + 1);
            return;
        }
        graphics.setColor(var_int_if);
        graphics.fillRect(0, n + 1, n2, n3 - n + 2);
    }

        /*
     * Unable to fully structure code
     */
    public final int int_do() {
        var1_1 = 0;
        if ((36 + 82 - 38 + 69 ^ 143 + 81 - 213 + 134) > -" ".length()) ** GOTO lbl9
        return (120 + 168 - 251 + 209 ^ 168 + 109 - 260 + 171) & (26 ^ 54 ^ (164 ^ 194) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            if (dB.boolean_do((int)GameCanvas.boolean_do(GameCanvas.var_fs_arr_do[var1_1].soLuong, GameCanvas.var_fs_arr_do[var1_1].var_int_if, en.cfr_renamed_20, GameCanvas.this))) {
                return var1_1;
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var1_1, (int)3))
        }
lbl10:
        // 1 sources

        return -1;
    }

                public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5 == null) {
        v_0.var_cu_0_if.cfr_renamed_1(n4, n - soLuongKhoa / 5, n2 - 3, 0, 3, graphics);
        v_0.var_cu_0_if.cfr_renamed_1(n5, n + n3 + soLuongKhoa / 5, n2 - 3, 3, 3, graphics);
        if ((soLuongKhoa += 1 >= 15)) {
            soLuongKhoa = 0;
        }
    }

        public final void cfr_renamed_6() {
        if (dB.boolean_do(GameCanvas.coTrangThai ? 1 : 0)) {
            if (dB.boolean_do(GameCanvas.boolean_if(v_0.v_0_do().cfr_renamed_5 + v_0.v_0_do().soLuongKhoa / 2 - 20, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.var_byte_new / 2, 40, 40) ? 1 : 0)) {
                ej_0.cfr_renamed_1().void_do(0);
                GameCanvas.coTrangThai = 0;
                } else if (dB.boolean_do(GameCanvas.boolean_if(v_0.v_0_do().cfr_renamed_5 + v_0.v_0_do().soLuongKhoa / 2 - 20, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + 95 - ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_4 / 2 - 20, 40, 45) ? 1 : 0)) {
                ej_0.cfr_renamed_1().void_do(1);
                GameCanvas.coTrangThai = 0;
                if (-" ".length() > 0) {
                    return;
                }
            } else if (dB.boolean_do(GameCanvas.boolean_if(v_0.v_0_do().cfr_renamed_5 + v_0.v_0_do().soLuongKhoa / 2 - 20 - 40, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.var_byte_new / 2 + 50 * ej_0.cfr_renamed_1().soLuongKhoa, 40, 40) ? 1 : 0)) {
                ej_0.cfr_renamed_1().void_if(-1);
                ej_0.cfr_renamed_1().soLuong = 6;
                GameCanvas.coTrangThai = 0;
                if ((0x69 ^ 0x6D) == 0) {
                    return;
                }
            } else if (dB.boolean_do(GameCanvas.boolean_if(v_0.v_0_do().cfr_renamed_5 + v_0.v_0_do().soLuongKhoa / 2 - 20 + 40, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.var_byte_new / 2 + 50 * ej_0.cfr_renamed_1().soLuongKhoa, 40, 40) ? 1 : 0)) {
                ej_0.cfr_renamed_1().void_if(1);
                ej_0.cfr_renamed_1().var_int_if = 6;
                GameCanvas.coTrangThai = 0;
            }
        }
        if (dB.boolean_do(GameCanvas.boolean_do(2) ? 1 : 0)) {
            ej_0.cfr_renamed_1().void_do(ej_0.cfr_renamed_1().soLuongKhoa - 1);
            return;
        }
        if (dB.boolean_do(GameCanvas.boolean_do(4) ? 1 : 0)) {
            ej_0.cfr_renamed_1().void_if(-1);
            ej_0.cfr_renamed_1().soLuong = 6;
            return;
        }
        if (dB.boolean_do(GameCanvas.boolean_do(6) ? 1 : 0)) {
            ej_0.cfr_renamed_1().void_if(1);
            ej_0.cfr_renamed_1().var_int_if = 6;
            return;
        }
        if (dB.boolean_do(GameCanvas.boolean_do(8) ? 1 : 0)) {
            ej_0.cfr_renamed_1().void_do(ej_0.cfr_renamed_1().soLuongKhoa + 1);
        }
    }

    public final void (Graphics graphics <= dC dC2) {
        if ((dC2.var_byte_do == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_if, dC2.cfr_renamed_2 - 27, dC2.cfr_renamed_4 - 36, 0);
        (graphics >= dC2);
    }

    public final void (Graphics graphics, int n, int n2, int n3 == 0) {
        graphics.setColor(soLuong);
        graphics.fillRect(2, n, n2, n3);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 < 0) {
        graphics.setColor(14279153);
        graphics.fillRect(n, n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int[] var13_13, int[] var14_14, String var15_15 != null) {
        GameCanvas.hienThongBaoPopup(var1_1);
        this.cfr_renamed_1(var1_1, var2_2, var3_3, var5_5, var4_4, v_0.var_int_arr_for[0], v_0.var_int_arr_for[1], 0);
        var16_16 = var7_7;
        if ((" ".length() ^ (82 ^ 86)) > 0) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            v0 = var16_16;
            var13_13[v0] = var13_13[v0] + 1;
            if ((var13_13[var16_16] > 20)) {
                var13_13[var16_16] = 0;
            }
            var17_17 = var14_14[var16_16];
            if ((v_0.v_0_do().mangSoNguyen[var16_16] > 5)) {
                var17_17 = 0;
            }
            var18_18 = var16_16 - var7_7;
            dB.var_cu_0_if.cfr_renamed_0(var17_17 + 4, var2_2 + 3 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            v_0.cfr_renamed_1(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, var10_10 - 2, v_0.var_int_arr_for[2 + var17_17 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, var9_9 - 1, var10_10);
            v_0.cfr_renamed_1(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 1, v_0.var_int_arr_for[3 + var17_17 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, 1, var10_10 + 1);
            var1_1.fillRect(var2_2 + 2 + var9_9 + var18_18 * var8_8, var3_3 + 11, 1, var10_10 + 1);
            ++var16_16;
lbl23:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var16_16, (int)var6_6))
        }
lbl24:
        // 1 sources

        var16_16 = var11_11;
        if ((var11_11 >= var12_12)) {
            var16_16 = var12_12 + var7_7;
        }
        var17_17 = var16_16 - 1;
        if (null == null) ** GOTO lbl49
        return;
lbl-1000:
        // 1 sources

        {
            v1 = var17_17;
            var13_13[v1] = var13_13[v1] + 1;
            if ((var13_13[var17_17] > 20)) {
                var13_13[var17_17] = 0;
            }
            var11_11 = var14_14[var17_17];
            if ((var13_13[var17_17] > 5)) {
                var11_11 = 0;
            }
            var18_18 = var17_17 - var7_7;
            if ((var17_17 == var6_6)) {
                dB.var_cu_0_if.cfr_renamed_0(var11_11 + 4, var2_2 + 3 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            }
            dB.var_cu_0_if.cfr_renamed_0(var11_11 + 5, var2_2 + 3 + var9_9 - 8 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            v_0.cfr_renamed_1(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 8, v_0.var_int_arr_for[2 + var11_11 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, var9_9 - 1, 15);
            v_0.cfr_renamed_1(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 1, v_0.var_int_arr_for[3 + var11_11 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, 1, 20);
            var1_1.fillRect(var2_2 + 2 + var9_9 + var18_18 * var8_8, var3_3 + 11, 1, 15);
            --var17_17;
lbl49:
            // 2 sources

            ** while (!dB.cfr_renamed_0((int)var17_17, (int)var6_6))
        }
lbl50:
        // 1 sources

        this.cfr_renamed_1(var1_1, var2_2 + 3, var3_3 + var10_10, var5_5 - 6, var4_4 - var10_10 - 3, v_0.var_int_arr_for[2], v_0.var_int_arr_for[3], 1);
        v_0.cfr_renamed_1(var2_2 + 4 + (var6_6 - var7_7) * var8_8, var3_3 + var10_10 / 2, var9_9 - 2, var10_10, v_0.var_int_arr_for[2], var1_1);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, var15_15, var2_2 + 3 + var9_9 / 2 + (var6_6 - var7_7) * var8_8, var3_3 + var10_10 / 2 - dF.var_byte_try / 2, 2);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 > 0) {
        this.cfr_renamed_1(graphics, n, n2, n3, n4, 0);
    }

        public final void (Graphics graphics, String string, int n, int n2, int n3 != null) {
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, string, n, n2, n3);
    }

    public final void (Graphics graphics, int n, int n2 != null) {
        graphics.drawImage(m_0.var_javax_microedition_lcdui_Image_do, n, n2, 3);
    }

    private static void cfr_renamed_13() {
        mangSoNguyen = new int[80];
        13 = 0xDC ^ 0xAC ^ (0x45 ^ 0x38);
        0 = (97 + 61 - 46 + 67 ^ 51 + 53 - 93 + 154) & (0x13 ^ 0xA ^ (0xB3 ^ 0xBC) ^ -" ".length());
        9 = 5 + 54 - -31 + 37 ^ (0xB5 ^ 0xC3);
        4 = 0x56 ^ 0x52;
        1 = " ".length();
        6 = 0x56 ^ 0x6B ^ (0x13 ^ 0x28);
        2 = "  ".length();
        17 = 0x45 ^ 0x54;
        27 = 0x8B ^ 0xA3 ^ (0x34 ^ 7);
        5 = 0x21 ^ 0x7E ^ (0x40 ^ 0x1A);
        14 = 0xE3 ^ 0xA2 ^ (0xED ^ 0xA2);
        7 = 0x3A ^ 0x63 ^ (0x1C ^ 0x42);
        8 = 0xC6 ^ 0xA2 ^ (0xF6 ^ 0x9A);
        36 = 0x5E ^ 4 ^ (0x60 ^ 0x1E);
        37 = 12 + 49 - 55 + 123 ^ 104 + 25 - 13 + 48;
        12 = 0x3E ^ 0x33 ^ " ".length();
        10 = 0x2C ^ 0x26;
        11 = 0x6B ^ 0x19 ^ (0x42 ^ 0x3B);
        3 = "   ".length();
        15 = 4 ^ 0xB;
        18 = 0xD4 ^ 0x9F ^ (0x1E ^ 0x47);
        16 = 0x5E ^ 0x4E;
        30 = 0x29 ^ 0x37;
        28 = 0xBD ^ 0x83 ^ (0xA5 ^ 0x87);
        20 = 0x10 ^ 4;
        6201499 = -(0xFFFFD777 & 0x39AD) & (0xFFFFFFBF & 0x5EB1FF);
        2378578 = 0xFFFFEB7F & 0x245FD2;
        8705740 = 0xFFFFD7ED & 0x84FEDE;
        2716523 = -" ".length() & (0xFFFFFFEB & 0x29737F);
        16701696 = 0xFFFFDBDC & 0xFEFD23;
        7042560 = 0xFFFFF601 & 0x6B7FFE;
        35217 = 0xFFFFA9D9 & 0xDFB7;
        32382 = -(0xFFFFDFFF & 0x2181) & (0xFFFFFFFF & 0x7FFE);
        23135 = 0xFFFFFBFF & 0x5E5F;
        14414578 = -(0xC7 ^ 0xC2) & (0xFFFFF7F7 & 0xDBFAFE);
        50 = 0x4A ^ 0x78;
        48 = 0x48 ^ 0x45 ^ (0x8B ^ 0xB6);
        24 = 0x43 ^ 0x33 ^ (7 ^ 0x6F);
        19 = 0x83 ^ 0x90;
        2704964 = 0xFFFFE657 & 0x295FEC;
        5014141 = 0xFFFFD6FD & 0x4CAB7F;
        11074288 = 0xFFFFFFFA & 0xA8FAF5;
        16777215 = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        8969676 = 0xFFFFDFFF & 0x88FDCC;
        5614233 = 0xFFFFEA9F & 0x55BFF9;
        -523560 = -(0xFFFFFF7B & 0x7FDAC);
        -65315 = -(0xFFFFFFA7 & 0xFF7B);
        -1 = -" ".length();
        25 = 0x13 ^ 0xA;
        75 = 0x32 ^ 0x71 ^ (0x21 ^ 0x29);
        45 = 52 + 37 - -33 + 18 ^ 138 + 13 - 1 + 11;
        35 = 0x7E ^ 0x2B ^ (0xE7 ^ 0x91);
        176 = 110 + 92 - 76 + 29 + (0x10 ^ 5) - (0x1E ^ 0x22) + (0x9B ^ 0xA7);
        170 = 26 + 33 - 30 + 141;
        130 = (0xDE ^ 0x9E) + (0x5E ^ 0x1F) - (0x78 ^ 0x22) + (0x31 ^ 0x6A);
        100 = 0x4D ^ 0xF ^ (0x82 ^ 0xA4);
        40 = 0x1E ^ 0x36;
        15530985 = 0xFFFFFBFB & 0xECFFED;
        14279153 = 0xFFFFFBFD & 0xD9E5F3;
        60 = 0xC0 ^ 0x98 ^ (0x4C ^ 0x28);
        200 = 134 + 133 - 233 + 104 + (0x24 ^ 0x6D) - (141 + 46 - 108 + 94) + (32 + 143 - 63 + 50);
        32 = 0x31 ^ 0x11;
        71 = 0xE5 ^ 0x95 ^ (0x3B ^ 0xC);
        6192786 = 0xFFFFFEB2 & 0x5E7FDF;
        46 = 2 + 34 - -76 + 20 ^ 39 + 151 - 177 + 157;
        21080 = 0xFFFFF6FC & 0x5B5B;
        12313816 = 0xFFFFE6D8 & 0xBBFDFF;
        8703190 = -(0xFFFFB3B9 & 0x7D6F) & (0xFFFFFFFE & 0x84FDFF);
        2713971 = 0xFFFFE973 & 0x297FFF;
        5107863 = -(0xFFFFDF4B & 0x2DF5) & (0xFFFFFFFF & 0x4DFDD7);
        4559225 = 0xFFFFD7FB & 0x45B97D;
        44 = 0x5F ^ 0x73;
        12442838 = 0xFFFFDFD7 & 0xBDFCFE;
        87 = 0x61 ^ 0x6A ^ (0x30 ^ 0x6C);
        115 = 0xDC ^ 0xAF;
        95 = 0xDB ^ 0x84;
        43 = 42 + 14 - -94 + 20 ^ 4 + 70 - 12 + 67;
        -4 = -(0x9F ^ 0xB4 ^ (0x26 ^ 9));
        22 = 0x8C ^ 0x9A;
        29555 = 0xFFFFF7F3 & 0x7B7F;
    }

        public final void (Graphics graphics == 0) {
        graphics.setColor(var_int_if);
        graphics.fillRect(0, GameCanvas.var_int_int - GameCanvas.this + 1, GameCanvas.soLuongKhoa, GameCanvas.this);
        graphics.setColor(var_int_new);
        graphics.fillRect(0, GameCanvas.var_int_int - GameCanvas.this, GameCanvas.soLuongKhoa, 1);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7 != null) {
        var_cu_0_if.cfr_renamed_0(0 + (n7 << 2), n, n2, 0, graphics);
        var_cu_0_if.cfr_renamed_0(1 + (n7 << 2), n + n3 - 8, n2, 0, graphics);
        var_cu_0_if.cfr_renamed_0(2 + (n7 << 2), n, n2 + n4 - 8, 0, graphics);
        var_cu_0_if.cfr_renamed_0(3 + (n7 << 2), n + n3 - 8, n2 + n4 - 8, 0, graphics);
        v_0.cfr_renamed_1(n + 8, n2, n3 - 16, 8, n5, graphics);
        graphics.fillRect(n + 8, n2 + n4 - 8, n3 - 16, 7);
        graphics.fillRect(n, n2 + 8, n3, n4 - 16);
        v_0.cfr_renamed_1(n + 8, n2, n3 - 16, 1, n6, graphics);
        graphics.fillRect(n + 8, n2 + n4 - 1, n3 - 16, 1);
        graphics.fillRect(n, n2 + 8, 1, n4 - 16);
        graphics.fillRect(n + n3 - 1, n2 + 8, 1, n4 - 16);
    }

    public final void cfr_renamed_7() {
        dF.cfr_renamed_15 = 5;
    }

    public final void cfr_renamed_8() {
        en.cfr_renamed_21 = GameCanvas.var_int_case / 12;
        en.cfr_renamed_10 = GameCanvas.var_int_case / 18;
        if ((en.cfr_renamed_10 == 18)) {
            en.cfr_renamed_10 = 18;
        }
        if ((en.cfr_renamed_10 > 45)) {
            en.cfr_renamed_10 = 45;
        }
        if (dB.boolean_do(GameCanvas.var_boolean_try ? 1 : 0)) {
            en.cfr_renamed_10 = 35;
        }
        int n = GameCanvas.this = en.cfr_renamed_10;
        if (!(en.cfr_renamed_21 >= 20) || !(GameCanvas.gameCanvas != null) || !(GameCanvas.var_boolean_try)) {
            en.cfr_renamed_21 = 20;
        }
        if ((en.cfr_renamed_21 > 50)) {
            en.cfr_renamed_21 = 50;
        }
        en.cfr_renamed_20 = GameCanvas.soLuongKhoa / 4;
        GameCanvas.var_fs_arr_do[0] = new fs(2, GameCanvas.var_int_case - n, 2);
        GameCanvas.var_fs_arr_do[1] = new fs(GameCanvas.cfr_renamed_15 - en.cfr_renamed_20 / 2, GameCanvas.var_int_case - n, 2);
        GameCanvas.var_fs_arr_do[2] = new fs(GameCanvas.soLuongKhoa - en.cfr_renamed_20 - 2, GameCanvas.var_int_case - n, 2);
        GameCanvas.var_fs_do = new fs(GameCanvas.soLuongKhoa - 2, 1, 1);
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics, Vector vector, int n, int n2 != null) {
        int n3;
        GameCanvas.hienThongBaoPopup(graphics);
        graphics.translate(0, GameCanvas.var_cg_0_do.cfr_renamed_8);
        graphics.translate(0, -cg_0.cfr_renamed_9);
        int n4 = (n - dF.cfr_renamed_6) / 2;
        int n5 = cg_0.cfr_renamed_9 / n - 2;
        if ((n5 < 0)) {
            n5 = 0;
        }
        if ((n3 = n5 + (GameCanvas.var_int_case - 40) / n + 3 > vector.size())) {
            n3 = vector.size();
        }
        int n6 = 4 + n5 * n;
        while (!(n5 >= n3)) {
            fl fl2 = (fl)vector.elementAt(n5);
            if ((n5 == n2) && (fl2.var_byte_do != -1)) {
                GameCanvas.var_fa_0_do.cfr_renamed_2(graphics, n6, GameCanvas.soLuongKhoa - 4, n);
            }
            if ((fl2.var_byte_do == -1)) {
                int n7;
                String string = MenuChinhAvatar.var_java_lang_String_arr_byte[fl2.cfr_renamed_2];
                int n8 = 15;
                int n9 = n6 + 8;
                if ((GameCanvas.cfr_renamed_12 == 0)) {
                    n7 = -4;
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    n7 = 0;
                }
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, string, n8, n9 + n7, 0);
                GameCanvas.var_fa_0_do.cfr_renamed_0(graphics, n6 + 25, GameCanvas.soLuongKhoa, n6 + 25);
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                var_cu_0_int.cfr_renamed_1(0, 22, n6 + n / 2 + 1, 0, 3, graphics);
                GameCanvas.var_fz_0_if.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.tenNhanVat) + fl2.var_byte_do, 50, n6 + n4, 0);
                if ((fl2.cfr_renamed_0 >= 0) && (fl2.cfr_renamed_0 <= 2)) {
                    fm_0.var_cu_0_do.cfr_renamed_1(fl2.cfr_renamed_0, GameCanvas.soLuongKhoa - 20, n6 + n / 2, 0, 3, graphics);
                }
            }
            n6 += n;
            ++n5;
        }
    }

    /*
     * Unable to fully structure code
     */
    public dB() {
        super();
        try {
            Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/12Plus.png"));
            }
        catch (IOException v0) {
            v0.printStackTrace();
        }
        if ("   ".length() <= 0) {
            throw null;
        }
        e.void_do(MenuChinhAvatar.bE);
        DuLieuNguoiChoi.var_cu_0_if = cu_0.cfr_renamed_1("5", 50, 48);
        DuLieuNguoiChoi.var_cu_0_for = cu_0.cfr_renamed_1("2", 11, 10);
        GameCanvas.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("transtab");
        dH.var_javax_microedition_lcdui_Image_arr_do[0] = e.javax_microedition_lcdui_Image_do("s1");
        dH.var_javax_microedition_lcdui_Image_arr_do[1] = e.javax_microedition_lcdui_Image_do("s2");
        v_0.var_cu_0_do = cu_0.cfr_renamed_1("arrowup", 9, 6);
        s.var_cu_0_do = cu_0.cfr_renamed_1("busy", 16, 16);
        aq.var_cu_0_do = cu_0.cfr_renamed_1("cmd", 24, 24);
        go_0.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("bar");
        go_0.var_javax_microedition_lcdui_Image_if = e.javax_microedition_lcdui_Image_do("arF");
        cu_0.cfr_renamed_1("icon", 17, 19);
        DuLieuNguoiChoi.var_cu_0_do = new cu_0(e.javax_microedition_lcdui_Image_do("dauhoathi"), 9, 9);
        dB.var_cu_0_for = cu_0.cfr_renamed_1("check", 12, 12);
        ey_0.var_cu_0_do = cu_0.cfr_renamed_1("tb", 4, 19);
        dB.var_cu_0_if = cu_0.cfr_renamed_1("round", 8, 8);
        v_0.var_cu_0_if = cu_0.cfr_renamed_1("ar2", 4, 6);
        dB.var_cu_0_new = new cu_0(e.javax_microedition_lcdui_Image_do("arW"), 6, 11);
        var1_1 = 0;
        if (-" ".length() < 0) ** GOTO lbl43
        throw null;
lbl-1000:
        // 1 sources

        {
            gO.var_javax_microedition_lcdui_Image_arr_do[var1_1] = e.javax_microedition_lcdui_Image_do("cl" + var1_1);
            ++var1_1;
lbl43:
            // 2 sources

            ** while (!dB.cfr_renamed_3((int)var1_1, (int)2))
        }
lbl44:
        // 1 sources

        e.cfr_renamed_1();
        try {
            en.cfr_renamed_4 = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/msg0.on"));
            fm_0.var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/stat.on")), 11, 11);
            return;
        }
        catch (IOException v1) {
            v1.printStackTrace();
            return;
        }
    }
}

