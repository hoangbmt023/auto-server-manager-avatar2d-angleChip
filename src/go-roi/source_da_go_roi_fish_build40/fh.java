/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class fh {
    public static short var_short_do;
    public static byte[] var_byte_arr_do;
    private static cu_0 var_cu_0_if;
    public static cu_0 var_cu_0_do;
    public static int soLuong;
    public static Vector var_java_util_Vector_do;
    private static int this;
    private static int cfr_renamed_12;
    public static Vector var_java_util_Vector_if;
    public static Vector var_java_util_Vector_for;
    public static Vector var_java_util_Vector_int;
    private static int[] mangSoNguyen;
    public static byte var_byte_do;
    public static Vector var_java_util_Vector_new;
    private int cfr_renamed_15;
    private static int[] var_int_arr_if;
    public static int var_int_if;
    private boolean dangChayAuto;
    public static Vector var_java_util_Vector_try;
    private int cfr_renamed_21;
    private bm var_bm_if;
    public static bm var_bm_do;
    public static Vector var_java_util_Vector_byte;
    public static int soLuongKhoa;
    public static Vector var_java_util_Vector_case;
    private static int cfr_renamed_10;
    private fs[] var_fs_arr_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static int var_int_int;
    public static int var_int_new;
    public static fl_0 var_fl_0_do;
    public static Image var_javax_microedition_lcdui_Image_if;
    public static Vector var_java_util_Vector_char;
    public static int var_int_try;
    public static short[] var_short_arr_do;
    private int cfr_renamed_18;
    private static fj_0 var_fj_0_do;
    public static short var_short_if;
    private bm var_bm_for;
    public static int var_int_byte;
    public static int var_int_case;
    public static int var_int_char;
    private static byte var_byte_for;
    private static int cfr_renamed_30;
    public static byte var_byte_if;
    public static int var_int_else;
    public static fs var_fs_do;
    public static int cfr_renamed_9;
    private static Vector var_java_util_Vector_else;
    private bm var_bm_int;
    public static int cfr_renamed_14;
    private static int cfr_renamed_20;
    public static short[] var_short_arr_if;
    private static int[] var_int_arr_for;
    private static int cfr_renamed_16;

    /*
     * Unable to fully structure code
     */
    public static void (Graphics var0 != null) {
        block1: {
            if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_try)) break block1;
            var1_1 = 0;
            if (((81 ^ 8 ^ (172 ^ 185)) & (68 + 119 - 87 + 27 ^ (121 ^ 74) ^ -" ".length())) == 0) ** GOTO lbl9
            return;
lbl-1000:
            // 1 sources

            {
                ((o)fh.var_java_util_Vector_try.elementAt(var1_1)).cfr_renamed_1(var0);
                ++var1_1;
lbl9:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_try.size()))
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void (bB var0 == gs_0 var1_1) {
        var2_2 = 88;
        if ((var1_1.var_short_do == 1)) {
            var2_2 = 79;
            } else if ((var1_1.var_short_do == 2)) {
            var2_2 = 67;
        }
        var3_3 = 0;
        if (((104 ^ 124 ^ (172 ^ 133)) & (42 ^ 69 ^ (40 ^ 122) ^ -" ".length())) == 0) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (fs)var1_1.var_java_util_Vector_do.elementAt(var3_3);
            fh.var_short_arr_do[(var0.cfr_renamed_3 + var4_4.var_int_if) * fh.var_short_if + (var0.cfr_renamed_2 + var4_4.soLuong)] = var2_2;
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var3_3, (int)var1_1.var_java_util_Vector_do.size()))
        }
lbl20:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    private static fs fs_do(int var0) {
        block8: {
            block7: {
                if (!(var0 + 1 < fh.var_short_arr_do.length) || !(fh.var_short_arr_do[var0] == fh.var_short_arr_do[var0 + 1])) break block7;
                var1_1 = var0;
                if ("  ".length() <= (119 ^ 115)) ** GOTO lbl13
                return null;
lbl-1000:
                // 1 sources

                {
                    if ((fh.var_short_arr_do[var1_1] != fh.var_short_arr_do[var1_1 + 1])) {
                        var2_3 = fh.var_int_int;
                        if ((var0 / fh.var_short_if == fh.var_short_do - 1)) {
                            var2_3 = -fh.var_int_int;
                        }
                        return new fs(fh.int_do(var0) + (var1_1 - var0 + 1) * fh.var_int_int / 2, fh.int_if(var0) + fh.var_int_int / 2 + var2_3);
                    }
                    ++var1_1;
lbl13:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_short_arr_do.length))
                }
lbl14:
                // 1 sources

                if ("   ".length() <= 0) {
                    return null;
                }
                break block8;
            }
            if (!(var0 + fh.var_short_if < fh.var_short_arr_do.length) || !(fh.var_short_arr_do[var0] == fh.var_short_arr_do[var0 + fh.var_short_if])) break block8;
            var1_2 = var0;
            if (-" ".length() < 0) ** GOTO lbl32
            return null;
lbl-1000:
            // 1 sources

            {
                if ((fh.var_short_arr_do[var1_2] != fh.var_short_arr_do[var1_2 + fh.var_short_if])) {
                    var2_4 = -fh.var_int_int;
                    if ((var0 % fh.var_short_if == 0)) {
                        var2_4 = fh.var_int_int;
                    }
                    return new fs(fh.int_do(var0) + fh.var_int_int / 2 + var2_4, fh.int_if(var0) + ((var1_2 - var0) / fh.var_short_if + 1) * fh.var_int_int / 2);
                }
                var1_2 += fh.var_short_if;
lbl32:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_2, (int)fh.var_short_arr_do.length))
            }
        }
        return null;
    }

    private static void cfr_renamed_5() {
        GameCanvas.var_java_util_Vector_if.removeAllElements();
        var_java_util_Vector_char.removeAllElements();
        var_java_util_Vector_case.removeAllElements();
        var_java_util_Vector_int.removeAllElements();
        var_java_util_Vector_byte = null;
        var_java_util_Vector_try = null;
        var_java_util_Vector_for = null;
        System.gc();
    }

        /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_6() {
        block3: {
            fh.var_java_util_Vector_else.removeAllElements();
            if (!(fh.var_byte_if != 0) || !(fh.cfr_renamed_30 != 0) || (fh.var_byte_do != -1)) {
                return;
            }
            if ((fh.var_int_char != 9) && !(fh.var_int_char == 12)) break block3;
            var0 = hg.int_new(GameCanvas.soLuongKhoa / 10);
            var1_2 = 0;
            if ("   ".length() >= " ".length()) ** GOTO lbl13
            return;
lbl-1000:
            // 1 sources

            {
                fh.var_java_util_Vector_else.addElement(new fs(hg.int_new(fh.var_short_if * fh.var_int_int), -(98 + hg.int_new(GameCanvas.var_int_char)), hg.int_new(4)));
                ++var1_2;
lbl13:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_2, (int)var0))
            }
lbl14:
            // 1 sources

            return;
        }
        var0_1 = hg.int_new(GameCanvas.soLuongKhoa / 10);
        var1_3 = 0;
        if ("  ".length() != (56 + 4 - 32 + 152 ^ 174 + 36 - 99 + 65)) ** GOTO lbl24
        return;
lbl-1000:
        // 1 sources

        {
            fh.var_java_util_Vector_else.addElement(new fs(hg.int_new(fh.var_short_if * fh.var_int_int), -(38 + hg.int_new(GameCanvas.var_int_char)), hg.int_new(4)));
            ++var1_3;
lbl24:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var1_3, (int)var0_1))
        }
lbl25:
        // 1 sources

    }

    public final void void_do(int n) {
        InputStream inputStream;
        block42: {
            block44: {
                Object object;
                Object object2;
                block43: {
                    if (fh.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
                        GameCanvas.var_int_byte = 0;
                        GameCanvas.cfr_renamed_7();
                    }
                    if ((GameCanvas.var_fv_do != null)) {
                        GameCanvas.var_fv_do = null;
                    }
                    GameCanvas.gameCanvas.cfr_renamed_3();
                    AngelChip.duLieuNguoiChoi.var_int_catch = 0;
                    var_int_else = -1;
                    fh.var_fl_0_do.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_43;
                    GameCanvas.var_java_util_Vector_if.removeAllElements();
                    AngelChip.duLieuNguoiChoi.dangChayAuto = 0;
                    fj_0.dangChayAuto = 0;
                    fm.coTrangThai = 0;
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                    fh.cfr_renamed_5();
                    go_0.var_java_util_Vector_new.removeAllElements();
                    var_bm_do = null;
                    go_0.var_ef_if = null;
                    int n2 = Calendar.getInstance().get(11);
                    if (!(n2 < 18) || (n2 < 6)) {
                        var_byte_if = (byte)1;
                        if (-" ".length() == ((0x5B ^ 0xD) & ~(0xE ^ 0x58))) {
                            return;
                        }
                    } else {
                        var_byte_if = (byte)0;
                    }
                    var_int_new = var_int_arr_for[var_byte_if];
                    n2 = n - 1;
                    if ((n2 != 107) && (!(n2 >= 0) || !(n2 < var_byte_arr_do.length) || (var_byte_arr_do[n2] == -1))) {
                        cfr_renamed_20 = -1;
                        var_javax_microedition_lcdui_Image_if = null;
                        if ((17 + 70 - 68 + 147 ^ 34 + 60 - -66 + 3) == 0) {
                            return;
                        }
                    } else if (!(n2 != 107) || !(cfr_renamed_20 == var_byte_arr_do[n2]) || (var_int_byte != var_byte_if)) {
                        int n3;
                        if ((n2 == 107)) {
                            n3 = 0;
                            if ("   ".length() <= (("  ".length() ^ (0x98 ^ 0x9E)) & (0xDE ^ 0x8F ^ (0x44 ^ 0x11) ^ -" ".length()))) {
                                return;
                            }
                        } else {
                            n3 = var_byte_arr_do[n2];
                        }
                        cfr_renamed_20 = n3;
                        e.void_do(MenuChinhAvatar.ap);
                        object2 = e.javax_microedition_lcdui_Image_do(String.valueOf(n3) + var_byte_if);
                        Image image = e.javax_microedition_lcdui_Image_do(String.valueOf(var_byte_if));
                        var_javax_microedition_lcdui_Image_if = Image.createImage((int)(96 * dF.cfr_renamed_12), (int)(96 * dF.cfr_renamed_12));
                        object = var_javax_microedition_lcdui_Image_if.getGraphics();
                        v_0.cfr_renamed_1(0, 0, 96 * dF.cfr_renamed_12, 10 * dF.cfr_renamed_12, var_int_arr_for[var_byte_if], (Graphics)object);
                        object.drawImage(image, 0, 69 * dF.cfr_renamed_12, 36);
                        object.drawImage(object2, 0, 96 * dF.cfr_renamed_12, 36);
                        e.cfr_renamed_1();
                    }
                    if ((var_int_byte == var_byte_if) && !(var_cu_0_do == null)) break block42;
                    if (!(n - 1 == 19)) break block43;
                    try {
                        var_int_byte = -1;
                        var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/wedding.png")), var_int_int * dF.cfr_renamed_12, var_int_int * dF.cfr_renamed_12);
                        }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                        break block42;
                    }
                    if (" ".length() != " ".length()) {
                        return;
                    }
                    break block42;
                }
                if (!(n - 1 != 107)) break block44;
                var_int_int = 24;
                var_int_byte = var_byte_if;
                Object object3 = hg.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/data/h" + var_byte_if);
                object = hg.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/data/data");
                try {
                    object2 = new byte[((InputStream)object3).available()];
                    ((InputStream)object3).read((byte[])object2);
                    object3 = new byte[((InputStream)object).available()];
                    ((InputStream)object).read((byte[])object3);
                    var_cu_0_do = new cu_0(hg.cfr_renamed_1((byte[])object2, (byte[])object3), var_int_int * dF.cfr_renamed_12, var_int_int * dF.cfr_renamed_12);
                    }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    if ("  ".length() > (125 + 15 - 123 + 141 ^ 94 + 140 - 162 + 82)) {
                        return;
                    }
                    break block42;
                }
                if (-" ".length() >= "   ".length()) {
                    return;
                }
                break block42;
            }
            try {
                var_int_int = 12;
                var_int_byte = -1;
                var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/tileDuaXe.png")), var_int_int * dF.cfr_renamed_12, var_int_int * dF.cfr_renamed_12);
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (-"   ".length() > 0) {
                return;
            }
        }
        if ((inputStream = fh.java_io_InputStream_do(n) != null)) {
            var_short_do = (short)8;
            switch (n - 1) {
                case 107: {
                    var_short_do = (short)16;
                    if (((0x57 ^ 0x71) & ~(0x2E ^ 8)) != -" ".length()) break;
                    return;
                }
                case 25: {
                    var_short_do = (short)7;
                    if (((0xA9 ^ 0x9E) & ~(0x16 ^ 0x21)) == 0) break;
                    return;
                }
                case 21: {
                    var_short_do = (short)7;
                    if ("   ".length() == "   ".length()) break;
                    return;
                }
                case 9: {
                    var_short_do = (short)8;
                    if (null == null) break;
                    return;
                }
                case 20: 
                case 57: 
                case 58: 
                case 59: 
                case 62: 
                case 63: 
                case 64: 
                case 100: 
                case 101: 
                case 103: 
                case 104: 
                case 109: {
                    var_short_do = (short)11;
                    if (-" ".length() <= (0xBA ^ 0x8F ^ (0x44 ^ 0x75))) break;
                    return;
                }
                case 60: 
                case 61: 
                case 65: {
                    var_short_do = (short)5;
                    if (" ".length() > 0) break;
                    return;
                }
                case 18: {
                    var_short_do = (short)10;
                    if (null == null) break;
                    return;
                }
                case 17: {
                    var_short_do = (short)6;
                    if (-" ".length() <= 0) break;
                    return;
                }
                case 24: {
                    if (-(0x52 ^ 0x17 ^ (0xFF ^ 0xBF)) < 0) break;
                    return;
                }
                case 11: 
                case 13: {
                    if (null == null) break;
                    return;
                }
                case 108: {
                    var_short_do = (short)8;
                    if (null == null) break;
                    return;
                }
                case 19: {
                    var_short_do = (short)13;
                    if (((63 + 34 - 28 + 105 ^ 108 + 51 - 40 + 16) & (136 + 88 - 157 + 71 ^ 18 + 25 - 27 + 147 ^ -" ".length())) == 0) break;
                    return;
                }
                case 10: {
                    var_short_do = (short)9;
                }
            }
        }
        (inputStream, n, 1 != null);
        var_int_char = n - 1;
        System.out.println("index: " + var_int_char);
        if ((var_byte_do != -1) && (var_int_char < var_byte_arr_do.length) && (var_byte_arr_do[var_int_char] != -1)) {
            ft ft2 = new ft(var_byte_do, 0);
            GameCanvas.var_java_util_Vector_if.addElement(ft2);
        }
        this.cfr_renamed_8();
        fh.cfr_renamed_6();
        if (fh.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0) && fh.cfr_renamed_1((Object)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if)) {
            (AngelChip.duLieuNguoiChoi != null);
        }
        if ((GameCanvas.var_int_byte == 0)) {
            GameCanvas.var_int_byte = 1;
        }
        System.gc();
    }

    private static int int_do(int n) {
        return n % var_short_if * var_int_int;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void (InputStream inputStream, int n, boolean bl != null) {
        int n2;
        byte by2;
        block227: {
            by2 = 0;
            byte by3 = 0;
            byte by4 = 0;
            byte by5 = 0;
            byte by6 = 0;
            byte by7 = 0;
            byte by8 = 0;
            byte by9 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            byte by10 = 0;
            byte by11 = 0;
            byte by12 = 0;
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int n12 = 0;
            byte by13 = 0;
            byte by14 = 0;
            byte by15 = 0;
            int n13 = 0;
            byte by16 = 0;
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            byte by17 = 0;
            int n18 = 0;
            byte by18 = 0;
            byte by19 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
            int n25 = 0;
            var_byte_for = (byte)0;
            byte[] byArray = new byte[13];
            try {
                int n26;
                block226: {
                    if ((inputStream != null)) {
                        var_short_if = (short)(inputStream.available() / var_short_do);
                        var_short_arr_if = new short[var_short_do * var_short_if];
                    }
                    if ((bl)) {
                        var_short_arr_do = new short[var_short_do * var_short_if];
                    }
                    n26 = 0;
                    while (true) {
                        if ((n26 >= var_short_do * var_short_if)) {
                            if ((n - 1 == 19)) {
                                go_0.var_java_util_Vector_for = new Vector();
                                n26 = 0;
                                if ("   ".length() != 0) break;
                                return;
                            }
                            break block226;
                        }
                        if ((inputStream != null)) {
                            fh.var_short_arr_if[n26] = (short)inputStream.read();
                            if ((var_short_arr_if[n26] == 255)) {
                                fh.var_short_arr_if[n26] = -1;
                            }
                        }
                        ++n26;
                    }
                    while (true) {
                        if ((n26 >= var_short_arr_if.length)) {
                            DuLieuNguoiChoi ef2 = new DuLieuNguoiChoi();
                            ((bm)new DuLieuNguoiChoi()).cfr_renamed_2 = ((dd_0)new DuLieuNguoiChoi()).cfr_renamed_8 = 26 * var_int_int;
                            ((bm)ef2).cfr_renamed_3 = ef2.var_int_try = 8 * var_int_int + var_int_int / 2;
                            ef2.chuoiGiaTri = "chu hon";
                            ((dd_0)ef2).cfr_renamed_9 = -100;
                            ef2.cfr_renamed_0(new cg(2480));
                            ef2.var_byte_new = ef2.var_byte_long = dd_0.var_byte_try;
                            var_java_util_Vector_case.addElement(ef2);
                            if (((0xA8 ^ 0x90) & ~(0x7A ^ 0x42)) >= "   ".length()) {
                                return;
                            }
                            break block227;
                        }
                        if ((var_short_arr_if[n26] < 32)) {
                            fh.var_short_arr_do[n26] = 80;
                            } else {
                            fh.var_short_arr_do[n26] = 88;
                        }
                        if ((var_short_arr_if[n26] == 65)) {
                            fh.var_short_arr_do[n26] = 10;
                            fh.var_short_arr_if[n26] = 1;
                            if ((n24 == 1)) {
                                fh.var_short_arr_if[n26] = 16;
                                ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_8 = fh.int_do(n26) + var_int_int;
                                ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = AngelChip.duLieuNguoiChoi.var_int_try = fh.int_if(n26) + 12;
                                fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + 12);
                            }
                            n24 = (byte)(n24 + 1);
                            if ("   ".length() == 0) {
                                return;
                            }
                        } else if ((var_short_arr_if[n26] == 27)) {
                            fs fs2 = new fs();
                            new fs().soLuong = fh.int_do(n26);
                            fs2.var_int_if = fh.int_if(n26);
                            fs2.var_short_if = (short)((5 - go_0.var_java_util_Vector_for.size() % 6 << 1) + go_0.var_java_util_Vector_for.size() / 6);
                            go_0.var_java_util_Vector_for.addElement(fs2);
                        }
                        ++n26;
                    }
                }
                if ((n - 1 == 107)) {
                    n26 = 0;
                    if (((0x20 ^ 0x28) & ~(0x16 ^ 0x1E)) >= "   ".length()) {
                        return;
                    }
                    while (true) {
                        if ((n26 >= var_short_do * var_short_if)) {
                            break block227;
                        }
                        if ((var_short_arr_if[n26] == 61) && (hg.int_new(2) == 1)) {
                            DuLieuNguoiChoi ef3 = new DuLieuNguoiChoi();
                            DuLieuNguoiChoi ef4 = (DuLieuNguoiChoi)eu_0.cfr_renamed_1().var_java_util_Vector_do.elementAt(hg.int_new(eu_0.cfr_renamed_1().var_java_util_Vector_do.size()));
                            ef3.var_java_util_Vector_if = ef4.var_java_util_Vector_if;
                            ((bm)ef3).cfr_renamed_2 = ((dd_0)ef3).cfr_renamed_8 = fh.int_do(n26) + 12;
                            ((bm)ef3).cfr_renamed_3 = ef3.var_int_try = fh.int_if(n26) + 12;
                            ((dd_0)ef3).cfr_renamed_2 = (byte)2;
                            ef3.var_byte_if = (byte)9;
                            var_java_util_Vector_case.addElement(ef3);
                        }
                        if ((var_short_arr_if[n26] == 59)) {
                            ac ac2 = new ac(1084, fh.int_do(n26) + var_int_int, fh.int_if(n26));
                            var_java_util_Vector_char.addElement(ac2);
                            } else if ((var_short_arr_if[n26] == 60)) {
                            ac ac3 = new ac(1085, fh.int_do(n26) + var_int_int, fh.int_if(n26));
                            var_java_util_Vector_char.addElement(ac3);
                        }
                        ++n26;
                    }
                }
                n26 = 0;
                if (" ".length() == -" ".length()) {
                    return;
                }
                while (true) {
                    block231: {
                        block229: {
                            block230: {
                                if ((n26 >= var_short_do * var_short_if)) {
                                    break;
                                }
                                if (!(var_short_arr_if[n26] != -4)) break block229;
                                if (!(var_short_arr_if[n26] == -5)) break block230;
                                fh.var_short_arr_do[n26] = 88;
                                if ("   ".length() < "   ".length()) {
                                    return;
                                }
                                break block231;
                            }
                            if (!(var_short_arr_if[n26] != -3) || !(var_short_arr_if[n26] != -6)) break block231;
                            if ((var_short_arr_if[n26] >= 120) && (var_short_arr_if[n26] <= 123)) {
                                fh.var_short_arr_do[n26] = 80;
                                if (-" ".length() > 0) {
                                    return;
                                }
                            } else if ((var_short_arr_if[n26] >= 114) && (var_short_arr_if[n26] <= 119)) {
                                fh.var_short_arr_do[n26] = 80;
                                if ("  ".length() == 0) {
                                    return;
                                }
                            } else if (!(var_short_arr_if[n26] != 67) || (var_short_arr_if[n26] == 85)) {
                                fh.var_short_arr_do[n26] = 92;
                                if (((74 + 53 - 93 + 161 ^ 139 + 138 - 196 + 66) & (0x4A ^ 0x66 ^ (0x31 ^ 0x4D) ^ -" ".length())) == (0x44 ^ 0x2D ^ (0xCD ^ 0xA0))) {
                                    return;
                                }
                            } else if ((var_short_arr_if[n26] >= 20) && (var_short_arr_if[n26] <= 23)) {
                                fh.var_short_arr_do[n26] = 79;
                                } else if ((var_short_arr_if[n26] < 7)) {
                                fh.var_short_arr_do[n26] = 80;
                                if (((0xBE ^ 0xA5 ^ (0x46 ^ 0x1B)) & (186 + 207 - 193 + 51 ^ 160 + 122 - 159 + 66 ^ -" ".length())) != ((0x3C ^ 0x7C ^ (0x16 ^ 0x5A)) & (0x50 ^ 0x20 ^ (7 ^ 0x7B) ^ -" ".length()))) {
                                    return;
                                }
                            } else {
                                fh.var_short_arr_do[n26] = 88;
                            }
                            if ((var_short_arr_if[n26] >= 44) && (var_short_arr_if[n26] <= 55)) {
                                fh.var_short_arr_do[n26] = 80;
                            }
                            if ((var_short_arr_if[n26] == 62) && (n - 1 != 62) && (n - 1 != 101) && (n - 1 != 104) && (n - 1 != 103) && (n - 1 != 100) && (n - 1 != 101)) {
                                fh.var_short_arr_do[n26] = 56;
                            }
                            if ((var_short_arr_if[n26] != 111) && !(var_short_arr_if[n26] == 112)) break block231;
                        }
                        fh.var_short_arr_do[n26] = 80;
                    }
                    if (!(inputStream == null) || (AngelChip.soLuong != 11)) {
                        switch (var_short_arr_if[n26]) {
                            case -1: {
                                fh.var_short_arr_do[n26] = 88;
                                break;
                            }
                            case 24: 
                            case 25: 
                            case 26: {
                                if (!(bl)) break;
                                fh.cfr_renamed_1(845, fh.int_do(n26) + 11, fh.int_if(n26));
                                break;
                            }
                            case 27: {
                                if (!(bl)) break;
                                fh.cfr_renamed_1(844, fh.int_do(n26) + 11, fh.int_if(n26) + 1);
                                if (-" ".length() <= "   ".length()) break;
                                return;
                            }
                            case 28: {
                                if (!(bl)) break;
                                if (fh.cfr_renamed_8(ae.ae_do().boolean_do() ? 1 : 0)) {
                                    fh.var_short_arr_if[n26] = 4;
                                    if (" ".length() < "  ".length()) break;
                                    return;
                                }
                                fh.cfr_renamed_1(0, fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int - 2);
                                if ("  ".length() > 0) break;
                                return;
                            }
                            case 127: {
                                if ((by17 == 0)) {
                                    fh.cfr_renamed_1(830, fh.int_do(n26) + 36, fh.int_if(n26) + var_int_int - 2);
                                    byte by20 = by17;
                                    by17 = (byte)(by20 + 1);
                                    (n26, by20, 2 == null);
                                }
                                (n26, 108, 96 != null);
                                if (-" ".length() != ((66 + 44 - 58 + 79 ^ 60 + 131 - 83 + 41) & (200 + 6 - 97 + 101 ^ 124 + 32 - -39 + 1 ^ -" ".length()))) break;
                                return;
                            }
                            case 128: {
                                if ((by2 == 0)) {
                                    fh.void_if(828, n26);
                                    byte by21 = by2;
                                    by2 = (byte)(by21 + 1);
                                    (n26, by21, 2 == null);
                                }
                                (n26, 55, 5 != null);
                                fh.var_short_arr_if[n26] = var_short_arr_if[n26 + var_short_if];
                                break;
                            }
                            case 129: 
                            case 160: {
                                byte by22;
                                if ((by3 == 0)) {
                                    if ((n - 1 == 17)) {
                                        fh.void_if(836, n26);
                                        if (" ".length() >= "  ".length()) {
                                            return;
                                        }
                                    } else {
                                        fh.void_if(829, n26);
                                    }
                                    byte by23 = by3;
                                    by3 = (byte)(by23 + 1);
                                    (n26, by23, 2 == null);
                                }
                                if ((var_short_arr_if[n26] == 129)) {
                                    by22 = 57;
                                    if ("  ".length() < 0) {
                                        return;
                                    }
                                } else {
                                    by22 = 62;
                                }
                                (n26, by22, 96 != null);
                                break;
                            }
                            case 130: 
                            case 131: 
                            case 132: 
                            case 133: 
                            case 134: 
                            case 135: 
                            case 136: 
                            case 137: 
                            case 138: {
                                int n27;
                                int n28 = n27 = var_short_arr_if[n26] - 130;
                                byte by24 = byArray[n28];
                                byArray[n28] = (byte)(by24 + 1);
                                (n26, by24, 0 == null);
                                (n26 ==  (byte)n27);
                                if ("   ".length() != "  ".length()) break;
                                return;
                            }
                            case 153: {
                                if ((by16 == 0)) {
                                    byte by25 = by16;
                                    by16 = (byte)(by25 + 1);
                                    (n26, by25, 0 == null);
                                }
                                (n26 == 11);
                                if (" ".length() > 0) break;
                                return;
                            }
                            case 139: {
                                fh.var_short_arr_do[n26] = -1;
                                byte by26 = by15;
                                by15 = (byte)(by26 + 1);
                                (n26, by26, 0 == null);
                                if ((var_int_char == -1) && (n != 21) && (var_javax_microedition_lcdui_Image_if != null)) {
                                    fj_0.var_fs_do = new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) - var_int_int / 2);
                                    var_fj_0_do.cfr_renamed_1(1);
                                }
                                fh.void_do(n26, var_short_arr_if);
                                if (((18 + 63 - -18 + 28 ^ (0x13 ^ 0x61)) & (134 + 42 - 111 + 79 ^ 55 + 92 - 67 + 77 ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 140: {
                                byte by27 = by14;
                                by14 = (byte)(by27 + 1);
                                (n26, by27, 0 == null);
                                (n26, 25, 55 != null);
                                by14 = (byte)(by14 + 1);
                                if (" ".length() <= "  ".length()) break;
                                return;
                            }
                            case 141: {
                                if ((by5 == 0)) {
                                    fh.void_if(840, n26);
                                    byte by28 = by5;
                                    by5 = (byte)(by28 + 1);
                                    (n26, by28, 0 == null);
                                }
                                (n26, 24, 5 != null);
                                fh.var_short_arr_if[n26] = var_short_arr_if[n26 + var_short_if];
                                if ("   ".length() > -" ".length()) break;
                                return;
                            }
                            case 142: {
                                (n26, 80, 7 != null);
                                dR.dR_do().var_fs_arr_do[n5] = new fs(n26 % var_short_if, n26 / var_short_if, 0);
                                n5 = (byte)(n5 + 1);
                                if (" ".length() < "  ".length()) break;
                                return;
                            }
                            case 143: {
                                if ((by4 == 0)) {
                                    fh.void_if(831, n26);
                                    byte by29 = by4;
                                    by4 = (byte)(by29 + 1);
                                    (n26, by29, 2 == null);
                                }
                                (n26, 52, 51 != null);
                                fh.var_short_arr_if[n26] = var_short_arr_if[n26 + var_short_if];
                                break;
                            }
                            case 144: {
                                if ((by6 == 0)) {
                                    fh.void_if(841, n26);
                                    byte by30 = by6;
                                    by6 = (byte)(by30 + 1);
                                    (n26, by30, 2 == null);
                                }
                                (n26, 53, 5 != null);
                                break;
                            }
                            case 145: {
                                byte by31 = var_byte_for;
                                var_byte_for = (byte)(by31 + 1);
                                (n26, by31, 0 == null);
                                if (!(n - 1 != 109) || (n - 1 == 57) && (var_int_char == 17)) {
                                    (n26, 17, -1 != null);
                                    if (-" ".length() <= 0) break;
                                    return;
                                }
                                if ((var_int_char == 23)) {
                                    (n26, 23, -1 != null);
                                    break;
                                }
                                (n26, 9, -1 != null);
                                if (!(n - 1 == 100)) break;
                                fh.var_short_arr_if[n26] = 47;
                                if (-" ".length() != "   ".length()) break;
                                return;
                            }
                            case 147: 
                            case 161: {
                                byte by32;
                                if ((by7 == 0)) {
                                    fh.void_if(832, n26);
                                    byte by33 = by7;
                                    by7 = (byte)(by33 + 1);
                                    (n26, by33, 2 == null);
                                }
                                if ((var_short_arr_if[n26] == 147)) {
                                    by32 = 58;
                                    if ("   ".length() <= 0) {
                                        return;
                                    }
                                } else {
                                    by32 = 63;
                                }
                                (n26, by32, 96 != null);
                                if (-" ".length() <= "   ".length()) break;
                                return;
                            }
                            case 148: 
                            case 162: {
                                byte by34;
                                if ((by8 == 0)) {
                                    if ((n == 18)) {
                                        fh.cfr_renamed_1(836, fh.int_do(n26) + 24, fh.int_if(n26) + var_int_int - 2);
                                        if ("  ".length() >= (0x8E ^ 0x8A)) {
                                            return;
                                        }
                                    } else {
                                        fh.cfr_renamed_1(833, fh.int_do(n26) + 48, fh.int_if(n26) + var_int_int - 2);
                                    }
                                    byte by35 = by8;
                                    by8 = (byte)(by35 + 1);
                                    (n26, by35, 2 == null);
                                }
                                if ((var_short_arr_if[n26] == 148)) {
                                    by34 = 59;
                                    } else {
                                    by34 = 64;
                                }
                                (n26, by34, 96 != null);
                                if (" ".length() > 0) break;
                                return;
                            }
                            case 149: {
                                if ((by9 == 0)) {
                                    fh.void_if(834, n26);
                                    if (fh.cfr_renamed_5(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, dR.var_int_goto)) {
                                        (n26, by9, 2 == null);
                                    }
                                    by9 = (byte)(by9 + 1);
                                }
                                (n26, 28, 4 != null);
                                break;
                            }
                            case 150: {
                                if ((n17 == 0)) {
                                    fh.void_if(842, n26);
                                }
                                (n26, 93, 0 != null);
                                if ((n == 26)) {
                                    fh.var_short_arr_if[n26] = 4;
                                }
                                n17 = (byte)(n17 + 1);
                                if ("  ".length() > 0) break;
                                return;
                            }
                            case 151: {
                                if ((n18 == 0)) {
                                    fh.void_if(843, n26);
                                }
                                (n26, 78, 0 != null);
                                n18 = (byte)(n18 + 1);
                                if (((1 ^ 0x46 ^ (0x38 ^ 0x3E)) & (0xDB ^ 0xC2 ^ (0xE ^ 0x56) ^ -" ".length())) <= (0xEE ^ 0x95 ^ 102 + 112 - 130 + 43)) break;
                                return;
                            }
                            case 152: {
                                int n29;
                                if ((n3 == 0)) {
                                    fh.void_if(835, n26);
                                }
                                byte by36 = 81;
                                if ((n - 1 == 25)) {
                                    n29 = 55;
                                    } else {
                                    n29 = 0;
                                }
                                (n26, by36, n29 != null);
                                n3 = (byte)(n3 + 1);
                                if ("   ".length() != -" ".length()) break;
                                return;
                            }
                            case 155: {
                                (n26, 80, 55 != null);
                                if (!(fg.var_byte_do > 0)) break;
                                (n26, 84, 112 != null);
                                fh.cfr_renamed_1(-5, fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                fg.cfr_renamed_0 = new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                break;
                            }
                            case 156: {
                                (n26, 80, 5 != null);
                                if (!(fc.var_byte_do > 0)) break;
                                (n26, 85, 5 != null);
                                fh.cfr_renamed_1(-6, fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                fc.var_fs_do = new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                if (" ".length() < "  ".length()) break;
                                return;
                            }
                            case 157: {
                                (n26, 80, 111 != null);
                                fg.var_fs_do = new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                if ("  ".length() == "  ".length()) break;
                                return;
                            }
                            case 158: {
                                (n26, 80, 5 != null);
                                if (!(gt_0.soLuong > 0)) break;
                                gt_0.var_fs_do = new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                if ("  ".length() >= ((0x1D ^ 0x39) & ~(0x1E ^ 0x3A))) break;
                                return;
                            }
                            case 159: {
                                int n30 = 4;
                                if ((n - 1 == 25)) {
                                    n30 = 5;
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                } else if (!(n - 1 != 108) || (n - 1 == 109)) {
                                    n30 = 47;
                                    if (" ".length() > "  ".length()) {
                                        return;
                                    }
                                } else if ((n - 1 == 13)) {
                                    n30 = 0;
                                }
                                (n26, 89, n30 != null);
                                fh.void_if(848, n26);
                                if ("  ".length() != -" ".length()) break;
                                return;
                            }
                            case 163: {
                                byte by37 = var_byte_for;
                                var_byte_for = (byte)(by37 + 1);
                                (n26, by37, 0 == null);
                                (n26, 12, -1 != null);
                                break;
                            }
                            case 164: {
                                (n26, byArray[9], 0 == null);
                                int n31 = 9;
                                byArray[n31] = (byte)(byArray[n31] + 1);
                                (n26, 13, 6 != null);
                                if (((0x51 ^ 0x14) & ~(0x1D ^ 0x58)) >= -" ".length()) break;
                                return;
                            }
                            case 165: {
                                (n26, byArray[10], 0 == null);
                                (n26, 14, 0 != null);
                                int n32 = 10;
                                byArray[n32] = (byte)(byArray[n32] + 1);
                                if ((0x5C ^ 0x58) > " ".length()) break;
                                return;
                            }
                            case 166: {
                                (n26, byArray[11], 0 == null);
                                (n26, 15, 0 != null);
                                int n33 = 11;
                                byArray[n33] = (byte)(byArray[n33] + 1);
                                if (((152 + 202 - 226 + 77 ^ 140 + 51 - 52 + 4) & (0 + 158 - -36 + 10 ^ 58 + 65 - 35 + 54 ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 167: {
                                (n26, byArray[12], 0 == null);
                                int n34 = 12;
                                byArray[n34] = (byte)(byArray[n34] + 1);
                                (n26, 16, 43 != null);
                                break;
                            }
                            case 172: {
                                (n26, 88, 96 != null);
                                if ((n14 % 3 == 0)) {
                                    fh.cfr_renamed_1(836, fh.int_do(n26) + 37, fh.int_if(n26) + var_int_int);
                                }
                                n14 = (byte)(n14 + 1);
                                if (" ".length() >= " ".length()) break;
                                return;
                            }
                            case 173: {
                                (n26, 88, 96 != null);
                                if ((n15 % 4 == 0)) {
                                    fh.cfr_renamed_1(837, fh.int_do(n26) + 48, fh.int_if(n26) + var_int_int);
                                }
                                n15 = (byte)(n15 + 1);
                                if ("   ".length() != (0x56 ^ 0x52)) break;
                                return;
                            }
                            case 174: {
                                (n26, 88, 96 != null);
                                if ((n16 % 4 == 0)) {
                                    fh.cfr_renamed_1(838, fh.int_do(n26) + 48, fh.int_if(n26) + var_int_int);
                                }
                                n16 = (byte)(n16 + 1);
                                if ((0x94 ^ 0x90 ^ (0xE2 ^ 0xAD) & ~(0x8B ^ 0xC4)) != "  ".length()) break;
                                return;
                            }
                            case 175: {
                                byte by38 = by10;
                                by10 = (byte)(by38 + 1);
                                (n26, by38, 0 == null);
                                (n26, 68, 96 != null);
                                if (" ".length() >= -" ".length()) break;
                                return;
                            }
                            case 176: {
                                byte by39 = by11;
                                by11 = (byte)(by39 + 1);
                                (n26, by39, 0 == null);
                                (n26, 69, 96 != null);
                                if (-" ".length() < 0) break;
                                return;
                            }
                            case 177: {
                                byte by40 = by12;
                                by12 = (byte)(by40 + 1);
                                (n26, by40, 0 == null);
                                (n26, 70, 96 != null);
                                if (("   ".length() & ("   ".length() ^ -" ".length())) == (" ".length() & (" ".length() ^ -" ".length()))) break;
                                return;
                            }
                            case 178: {
                                if ((by17 == 0)) {
                                    fh.cfr_renamed_1(830, fh.int_do(n26) + var_int_int, fh.int_if(n26) + var_int_int - 2);
                                    byte by41 = by17;
                                    by17 = (byte)(by41 + 1);
                                    (n26, by41, 2 == null);
                                }
                                (n26, 109, 96 != null);
                                if (-"   ".length() < 0) break;
                                return;
                            }
                            case 179: {
                                if ((by12 == 0)) {
                                    byte by42 = by12;
                                    by12 = (byte)(by42 + 1);
                                    (n26, by42, 2 == null);
                                    fh.void_if(837, n26);
                                }
                                (n26, 18, 96 != null);
                                break;
                            }
                            case 180: {
                                byte by43 = by12;
                                by12 = (byte)(by43 + 1);
                                (n26, by43, 0 == null);
                                (n26, 17, 77 != null);
                                if (!(n - 1 == 101)) break;
                                fh.var_short_arr_if[n26] = 0;
                                if (" ".length() < (0x9B ^ 0x9F)) break;
                                return;
                            }
                            case 181: {
                                if (!(n - 1 != 101) || !(n - 1 != 104) || !(n - 1 != 103) || !(n - 1 != 100) || !(n - 1 != 101)) break;
                                if ((by18 == 0)) {
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int / 2);
                                }
                                by18 = (byte)(by18 + 1);
                                (n26, 56, 46 != null);
                                if (" ".length() == " ".length()) break;
                                return;
                            }
                            case 182: {
                                dR.var_fs_for = new fs(fh.int_do(n26), fh.int_if(n26));
                                (n26, 80, 39 != null);
                                if (((153 + 118 - 62 + 7 ^ 100 + 130 - 174 + 92) & (0x50 ^ 0x1A ^ (0xAD ^ 0xAB) ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 183: {
                                dR.var_fs_do = new fs(fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                (n26, 88, 13 != null);
                                break;
                            }
                            case 184: {
                                break;
                            }
                            case 185: {
                                if ((by19 == 1) && (n == 18)) {
                                    fh.cfr_renamed_1(975, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                }
                                if ((n == 18)) {
                                    (n26, 71, 43 != null);
                                    if ((by19 == 2)) {
                                        fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26), fh.int_if(n26) + 25);
                                        }
                                } else {
                                    byte by44 = by19;
                                    by19 = (byte)(by44 + 1);
                                    (n26, by44, 0 == null);
                                    (n26, 71, 47 != null);
                                }
                                by19 = (byte)(by19 + 1);
                                if (("   ".length() & ~"   ".length()) >= 0) break;
                                return;
                            }
                            case 186: {
                                byte by45 = (byte)(n19 + 1);
                                n19 = by45;
                                if ((by45 == 3)) {
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26), fh.int_if(n26) + 24);
                                }
                                (n26, 94, 17 != null);
                                if (!(n19 == 2)) break;
                                fh.cfr_renamed_1(974, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                if (-"  ".length() < 0) break;
                                return;
                            }
                            case 187: {
                                byte by46;
                                if ((n20 == 0) && fh.cfr_renamed_5(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
                                    var_java_util_Vector_char.addElement(new fd_0(-10, fh.int_do(n26) + 20, fh.int_if(n26) + 20, dR.var_javax_microedition_lcdui_Image_if.getWidth()));
                                }
                                n20 = (byte)(n20 + 1);
                                if (fh.cfr_renamed_5(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
                                    by46 = 95;
                                    if ((0x61 ^ 0x50 ^ (0x8D ^ 0xB8)) == " ".length()) {
                                        return;
                                    }
                                } else {
                                    by46 = 80;
                                }
                                (n26, by46, 4 != null);
                                break;
                            }
                            case 188: {
                                byte by47;
                                if (fh.cfr_renamed_5(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
                                    var_java_util_Vector_char.addElement(new fd_0(-10, fh.int_do(n26) + 20, fh.int_if(n26) + 20, dR.var_javax_microedition_lcdui_Image_if.getWidth()));
                                }
                                if (fh.cfr_renamed_5(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
                                    by47 = 96;
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    by47 = 80;
                                }
                                (n26, by47, 4 != null);
                                if ("   ".length() >= "  ".length()) break;
                                return;
                            }
                            case 189: {
                                ((bm)dR.var_e_0_do).cfr_renamed_2 = fh.int_do(n26) + 12;
                                ((bm)dR.var_e_0_do).cfr_renamed_3 = fh.int_if(n26) + 12;
                                if (fh.cfr_renamed_5(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, dR.var_int_goto)) {
                                    fh.var_short_arr_do[n26] = 97;
                                }
                                fh.var_short_arr_if[n26] = 4;
                                var_java_util_Vector_char.addElement(dR.var_e_0_do);
                                if (!fh.cfr_renamed_6(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9, dR.var_int_goto)) break;
                                if (((0x5F ^ 0x7E ^ (0x70 ^ 0x48)) & ("  ".length() ^ (0x32 ^ 0x29) ^ -" ".length())) != (0x40 ^ 0x17 ^ (0x7A ^ 0x29))) break;
                                return;
                            }
                            case 190: {
                                fh.var_short_arr_do[n26] = 98;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n21 == 0)) {
                                    fh.cfr_renamed_1(1029, fh.int_do(n26) + 36, fh.int_if(n26) + 20);
                                    dR.var_int_try = fh.int_do(n26) + 26;
                                    dR.var_int_else = fh.int_if(n26) + 10;
                                    if (fh.cfr_renamed_5(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
                                        fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 36, fh.int_if(n26) + 24);
                                    }
                                }
                                n21 = (byte)(n21 + 1);
                                if (((0xEA ^ 0x82 ^ (0x50 ^ 0x25)) & (147 + 81 - 178 + 128 ^ 137 + 11 - 11 + 38 ^ -" ".length())) <= (0xFE ^ 0xBB ^ (0xF4 ^ 0xB5))) break;
                                return;
                            }
                            case 191: {
                                fh.var_short_arr_do[n26] = 23;
                                if ((n - 1 == 104)) {
                                    fh.var_short_arr_if[n26] = 0;
                                    if ((n6 == 1)) {
                                        fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 12, fh.int_if(n26) + 12);
                                        if ("  ".length() <= " ".length()) {
                                            return;
                                        }
                                    }
                                } else {
                                    if ((n6 % 2 == 0)) {
                                        fh.var_short_arr_if[n26] = 46;
                                        if (-" ".length() > "  ".length()) {
                                            return;
                                        }
                                    } else {
                                        fh.var_short_arr_if[n26] = 44;
                                    }
                                    if ((n6 == 1)) {
                                        fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 12);
                                    }
                                }
                                n6 = (byte)(n6 + 1);
                                break;
                            }
                            case 192: {
                                fh.var_short_arr_do[n26] = 99;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n11 == 0)) {
                                    fh.cfr_renamed_1(1034, fh.int_do(n26) + 36, fh.int_if(n26) + 24);
                                }
                                n11 = (byte)(n11 + 1);
                                if (-"   ".length() < 0) break;
                                return;
                            }
                            case 193: {
                                fh.var_short_arr_do[n26] = 100;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n10 == 1)) {
                                    fh.cfr_renamed_1(1032, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n10 = (byte)(n10 + 1);
                                if (-" ".length() < 0) break;
                                return;
                            }
                            case 194: {
                                fh.var_short_arr_do[n26] = 106;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n12 == 0)) {
                                    fh.cfr_renamed_1(1030, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                }
                                n12 = (byte)(n12 + 1);
                                if (-" ".length() < 0) break;
                                return;
                            }
                            case 195: {
                                fh.var_short_arr_do[n26] = 102;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n8 == 1)) {
                                    fh.cfr_renamed_1(1037, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                }
                                n8 = (byte)(n8 + 1);
                                if ("  ".length() > 0) break;
                                return;
                            }
                            case 196: {
                                fh.var_short_arr_do[n26] = 103;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n7 == 1)) {
                                    fh.cfr_renamed_1(1035, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n7 = (byte)(n7 + 1);
                                if (" ".length() >= " ".length()) break;
                                return;
                            }
                            case 197: {
                                fh.var_short_arr_do[n26] = 104;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n9 == 1)) {
                                    fh.cfr_renamed_1(1033, fh.int_do(n26) + 12, fh.int_if(n26) + 24);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n9 = (byte)(n9 + 1);
                                break;
                            }
                            case 198: {
                                fh.var_short_arr_do[n26] = 105;
                                fh.var_short_arr_if[n26] = 4;
                                fh.cfr_renamed_1(1036, fh.int_do(n26) + 12, fh.int_if(n26) + 20);
                                if ((8 ^ 0x1C ^ (0xD3 ^ 0xC3)) == (" ".length() ^ (0x6A ^ 0x6F))) break;
                                return;
                            }
                            case 199: {
                                fh.var_short_arr_do[n26] = 101;
                                fh.var_short_arr_if[n26] = 4;
                                if ((n4 == 1)) {
                                    fh.cfr_renamed_1(1031, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n4 = (byte)(n4 + 1);
                                if (-" ".length() != " ".length()) break;
                                return;
                            }
                            case 200: {
                                fh.var_short_arr_do[n26] = 107;
                                if ((n22 == 1)) {
                                    fh.cfr_renamed_1(1075, fh.int_do(n26) + 24, fh.int_if(n26) + 24);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n22 = (byte)(n22 + 1);
                                fh.var_short_arr_if[n26] = 5;
                                if ("  ".length() != 0) break;
                                return;
                            }
                            case 201: {
                                fh.var_short_arr_do[n26] = 19;
                                fh.var_short_arr_if[n26] = 5;
                                if ((n23 == 1)) {
                                    fh.cfr_renamed_1(1094, fh.int_do(n26) + 24, fh.int_if(n26) + 20);
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 24, fh.int_if(n26) + 30);
                                }
                                n23 = (byte)(n23 + 1);
                                if (((0x66 ^ 0x30) & ~(0x4E ^ 0x18)) != -" ".length()) break;
                                return;
                            }
                            case 202: {
                                (n26, 88, 96 != null);
                                if ((n25 % 4 == 0)) {
                                    fh.cfr_renamed_1(4, fh.int_do(n26) + (var_int_int << 1), fh.int_if(n26) + var_int_int);
                                }
                                n25 = (byte)(n25 + 1);
                                if (-" ".length() < 0) break;
                                return;
                            }
                            case 203: {
                                byte by48 = by18;
                                by18 = (byte)(by48 + 1);
                                (n26, by48, 0 == null);
                                (n26, 110, 96 != null);
                                break;
                            }
                            case 204: {
                                fh.var_short_arr_if[n26] = 43;
                                fh.var_short_arr_do[n26] = 10;
                                if ((n23 == 1)) {
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26), fh.int_if(n26) + 30);
                                }
                                n23 = (byte)(n23 + 1);
                                if (" ".length() != 0) break;
                                return;
                            }
                            case 63: 
                            case 65: {
                                if (!(n - 1 != 101) || !(n - 1 != 104) || !(n - 1 != 103) || !(n - 1 != 100) || !(n - 1 != 101)) break;
                                fh.var_short_arr_do[n26] = 56;
                                byte by49 = by13;
                                by13 = (byte)(by49 + 1);
                                (n26, by49, 0 == null);
                                if (!(n - 1 != 57) || (n - 1 == 62)) {
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) - 12, fh.int_if(n26) + 12);
                                    break;
                                }
                                if (!(n - 1 != 58) || (n - 1 == 63)) {
                                    fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) + 12, fh.int_if(n26) + 36);
                                    break;
                                }
                                fh.cfr_renamed_1(MenuChinhAvatar.ai, fh.int_do(n26) - 12, fh.int_if(n26) + 12);
                                break;
                            }
                            case 97: {
                                fh.var_short_arr_do[n26] = 54;
                                if ("   ".length() > 0) break;
                                return;
                            }
                            case 98: {
                                fh.var_short_arr_do[n26] = 29;
                                fh.void_if(846, n26);
                                if ((n - 1 != 108) && !(n - 1 == 109)) break;
                                fh.var_short_arr_if[n26] = 56;
                                if (" ".length() > -" ".length()) break;
                                return;
                            }
                            case 102: {
                                int n35;
                                fh.var_short_arr_do[n26] = 92;
                                w_0.var_java_util_Vector_for.addElement(new fs(fh.int_do(n26) + var_int_int / 2, fh.int_if(n26) + var_int_int));
                                fs fs3 = new fs(-20, fh.int_if(n26) + var_int_int);
                                int n36 = n13 % 2;
                                if ((n == 66)) {
                                    n35 = 0;
                                    } else {
                                    n35 = 1;
                                }
                                if ((n36 == n35)) {
                                    fs3.soLuong = (GameCanvas.soLuongKhoa + 20) / dF.cfr_renamed_12;
                                }
                                w_0.var_java_util_Vector_do.addElement(fs3);
                                n13 = (byte)(n13 + 1);
                                if ("  ".length() != 0) break;
                                return;
                            }
                            case 110: {
                                dR.var_fs_int = new fs(fh.int_do(n26) - var_int_int + 8, fh.int_if(n26) - 2);
                                fh.cfr_renamed_1(847, fh.int_do(n26) + 11, fh.int_if(n26));
                                break;
                            }
                            default: {
                                by19 = 0;
                                by15 = 0;
                            }
                        }
                    }
                    ++n26;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                break block227;
            }
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        fh.void_if(n);
        (var_java_util_Vector_char != null);
        if ((var_int_char == 24) && fh.cfr_renamed_6(dR.var_int_goto, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
            var_int_char = 53;
        }
        if ((n2 = var_int_char != -1) && (var_int_else != -1)) {
            n2 = var_int_if;
        }
        if ((n - 1 != 19)) {
            void var46_61;
            int n37 = 0;
            if ("   ".length() == 0) {
                return;
            }
            while (!fh.cfr_renamed_3((int)var46_61, var_short_arr_do.length)) {
                int n38;
                void var2_4 = var46_61 / var_short_if;
                void var0_1 = var46_61 % var_short_if;
                by2 = (byte)n2;
                if ((var_short_arr_do[var2_4 * var_short_if + var0_1] == by2)) {
                    n38 = 1;
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    n38 = 0;
                }
                if ((n38 != 0)) {
                    fs fs4 = fh.fs_do((int)var46_61);
                    if (!(fs4 != null)) break;
                    ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = fs4.soLuong;
                    ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = fs4.var_int_if;
                    if ("   ".length() != 0) break;
                    return;
                }
                ++var46_61;
            }
        }
        if ((n == 60)) {
            ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = 150;
            ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = var_short_do * var_int_int - var_int_int;
        }
        if ((cfr_renamed_14 != -1)) {
            var_int_if = cfr_renamed_14;
        }
        fm.fm_do().duLieuNguoiChoi = AngelChip.duLieuNguoiChoi;
        fm.fm_do().void_do(n);
        if ((GameCanvas.var_boolean_try)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_14();
        }
    }

    public static boolean boolean_do(int n, int n2) {
        if (!(n = fh.int_if(n, n2) != 80) || (n == 51)) {
            return 1;
        }
        if (!(!(AngelChip.duLieuNguoiChoi.var_int_class == -5) || (n != 79) && (n != 81) && (n != 92) && !(n == 67))) {
            return 1;
        }
        return 0;
    }

    public static void (bm bm2 != null) {
        if ((var_bm_do == bm2)) {
            var_bm_do = null;
        }
        var_java_util_Vector_case.removeElement(bm2);
        }

    /*
     * Unable to fully structure code
     */
    public static boolean boolean_if(int var0, int var1_4) {
        var2_6 = fh.int_if(var0, var1_4);
        if ((GameCanvas.var_fv_do != null) && !fh.cfr_renamed_4((int)fv.cfr_renamed_1(var2_6)) || (var2_6 == -2)) {
            return 0;
        }
        block0 : switch (var2_6) {
            case -1: {
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                if ((fh.var_int_char == 25)) {
                    dR.dR_do();
                    }
                if ((fh.var_javax_microedition_lcdui_Image_if != null)) {
                    fh.var_fj_0_do.cfr_renamed_1(-1);
                    if (-" ".length() < 0) break;
                    return (boolean)((177 ^ 131) & ~(168 ^ 154));
                }
                go_0.go_0_do().cfr_renamed_15();
                if ("   ".length() >= 0) break;
                return (boolean)((73 + 185 - 52 + 30 ^ 90 + 132 - 201 + 178) & (133 ^ 130 ^ (108 ^ 64) ^ -" ".length()));
            }
            case 55: {
                GameCanvas.cfr_renamed_8();
                var0_1 = ft_0.ft_0_do();
                var0_1.cfr_renamed_1(-23);
                var0_1.cfr_renamed_0();
                if ("   ".length() >= "  ".length()) break;
                return (boolean)((70 ^ 36) & ~(203 ^ 169));
            }
            case 108: 
            case 109: {
                fh.cfr_renamed_9 = AngelChip.duLieuNguoiChoi.cfr_renamed_2;
                fh.var_int_try = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                GameCanvas.cfr_renamed_8();
                go_0.var_byte_if = (byte)1;
                ft_0.ft_0_do().cfr_renamed_2(4);
                if (-"  ".length() <= 0) break;
                return (boolean)((44 + 179 - 44 + 38 ^ 64 + 72 - 91 + 96) & (56 ^ 109 ^ " ".length() ^ -" ".length()));
            }
            case 57: {
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                go_0.go_0_do();
                go_0.cfr_renamed_1(1);
                if ("   ".length() > 0) break;
                return (boolean)((11 ^ 126 ^ (61 ^ 70)) & (49 + 146 - 41 + 16 ^ 33 + 71 - 64 + 124 ^ -" ".length()));
            }
            case 62: {
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                go_0.go_0_do();
                go_0.cfr_renamed_1(6);
                if (-(167 ^ 142 ^ (97 ^ 76)) < 0) break;
                return (boolean)((180 ^ 194 ^ (43 ^ 114)) & (178 ^ 192 ^ (225 ^ 188) ^ -" ".length()));
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: {
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                fn.fn_do().cfr_renamed_3(var2_6, -1);
                if (((" ".length() ^ (146 ^ 153)) & (76 ^ 82 ^ (29 ^ 9) ^ -" ".length())) == ((218 ^ 152 ^ (239 ^ 168)) & (46 ^ 127 ^ (59 ^ 111) ^ -" ".length()))) break;
                return (boolean)((21 ^ 24 ^ (27 ^ 6)) & (197 ^ 192 ^ (93 ^ 72) ^ -" ".length()));
            }
            case 17: {
                fh.cfr_renamed_7();
                if (null == null) break;
                return (boolean)((90 ^ 127) & ~(134 ^ 163));
            }
            case 12: {
                fh.cfr_renamed_7();
                if (-" ".length() == -" ".length()) break;
                return (boolean)((98 ^ 51) & ~(111 ^ 62));
            }
            case 25: {
                dR.dR_do().cfr_renamed_14();
                if ("  ".length() <= ("   ".length() ^ (30 ^ 25))) break;
                return (boolean)((65 ^ 113 ^ (156 ^ 129)) & (78 + 49 - 62 + 64 ^ 123 + 88 - 154 + 115 ^ -" ".length()));
            }
            case 24: {
                if (!fh.cfr_renamed_1((Object)dR.var_java_util_Vector_int) || (dR.var_int_goto != AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                    GameCanvas.cfr_renamed_8();
                    dR.dR_do().cfr_renamed_0(AngelChip.duLieuNguoiChoi.cfr_renamed_9, 1);
                    if (-" ".length() <= ((32 ^ 19) & ~(114 ^ 65))) break;
                    return (boolean)((9 ^ 68) & ~(87 ^ 26));
                }
                dR.dR_do().cfr_renamed_1(dR.var_int_goto, dR.var_java_util_Vector_int, dR.var_java_util_Vector_byte, dR.var_byte_if, dR.var_byte_do, dR.var_short_do, dR.soLuongKhoa);
                if (-" ".length() <= 0) break;
                return (boolean)((17 ^ 113 ^ (195 ^ 129)) & (117 ^ 113 ^ (11 ^ 45) ^ -" ".length()));
            }
            case 52: {
                dR.dR_do();
                dR.cfr_renamed_12();
                if (null == null) break;
                return (boolean)((187 + 178 - 137 + 6 ^ 132 + 183 - 275 + 154) & (79 ^ 83 ^ (10 ^ 62) ^ -" ".length()));
            }
            case 53: {
                dR.dR_do();
                dR.cfr_renamed_13();
                if (((232 ^ 175) & ~(89 ^ 30)) == 0) break;
                return (boolean)((42 ^ 60) & ~(168 ^ 190));
            }
            case 9: {
                fh.cfr_renamed_7();
                if (-(131 ^ 135) <= 0) break;
                return (boolean)((20 ^ 6) & ~(158 ^ 140));
            }
            case 58: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(2);
                if (-" ".length() < ((69 ^ 37) & ~(36 ^ 68))) break;
                return (boolean)((24 ^ 67) & ~(120 ^ 35));
            }
            case 63: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(7);
                if ((131 + 145 - 223 + 143 ^ 9 + 56 - -45 + 82) > ((102 ^ 42 ^ (165 ^ 187)) & (222 ^ 179 ^ (133 ^ 186) ^ -" ".length()))) break;
                return (boolean)((10 ^ 124 ^ (47 ^ 126)) & (223 ^ 145 ^ (231 ^ 142) ^ -" ".length()));
            }
            case 59: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(3);
                if ((117 ^ 13 ^ (107 ^ 23)) != "  ".length()) break;
                return (boolean)((25 ^ 9 ^ (234 ^ 197)) & (45 ^ 89 ^ (120 ^ 51) ^ -" ".length()));
            }
            case 64: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(8);
                if (null == null) break;
                return (boolean)((40 ^ 0) & ~(83 ^ 123));
            }
            case 27: 
            case 56: {
                if (!(fh.var_int_char != 18) || !(fh.var_int_char != 109) || !(fh.var_int_char != 108)) break;
                go_0.go_0_do().cfr_renamed_24();
                if (" ".length() == " ".length()) break;
                return (boolean)((51 + 45 - 64 + 107 ^ 103 + 9 - 92 + 124) & (58 ^ 14 ^ (56 ^ 23) ^ -" ".length()));
            }
            case 28: {
                dR.dR_do();
                dR.cfr_renamed_9();
                if (((11 + 16 - -17 + 91 ^ 136 + 123 - 177 + 62) & (150 ^ 154 ^ (188 ^ 167) ^ -" ".length())) == 0) break;
                return (boolean)((73 ^ 3 ^ (94 ^ 82)) & (24 ^ 112 ^ (159 ^ 177) ^ -" ".length()));
            }
            case 29: {
                GameCanvas.cfr_renamed_8();
                fn.fn_do().cfr_renamed_0(go_0.var_byte_for);
                if ("   ".length() >= 0) break;
                return (boolean)((98 ^ 82 ^ (131 ^ 167)) & (78 ^ 84 ^ (43 ^ 37) ^ -" ".length()));
            }
            case 93: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(MenuChinhAvatar.bN, 4);
                if (-" ".length() < 0) break;
                return (boolean)((2 ^ 106 ^ (8 ^ 37)) & (36 ^ 116 ^ (60 ^ 41) ^ -" ".length()));
            }
            case 78: {
                go_0.go_0_do();
                go_0.cfr_renamed_1(MenuChinhAvatar.bN, 5);
                if (((33 ^ 87 ^ (88 ^ 13)) & (51 + 56 - -29 + 0 ^ 56 + 116 - 3 + 2 ^ -" ".length())) < "  ".length()) break;
                return (boolean)((62 + 127 - 119 + 98 ^ 80 + 139 - 122 + 49) & (242 ^ 193 ^ (123 ^ 114) ^ -" ".length()));
            }
            case 83: {
                var2_6 = var1_4 / fh.var_int_int;
                var1_4 = var0 / fh.var_int_int;
                if (!fh.cfr_renamed_1((Object)aa_0.var_java_util_Vector_if)) ** GOTO lbl257
                var0 = 0;
                if (null == null) ** GOTO lbl256
                return (boolean)((81 ^ 110) & ~(66 ^ 125));
lbl-1000:
                // 1 sources

                {
                    var3_7 = (er)aa_0.var_java_util_Vector_if.elementAt(var0);
                    var4_8 = 0;
                    if ("  ".length() != -" ".length()) ** GOTO lbl254
                    return (boolean)((91 ^ 24) & ~(29 ^ 94));
lbl-1000:
                    // 1 sources

                    {
                        var5_9 = (fs)var3_7.var_java_util_Vector_do.elementAt(var4_8);
                        if ((var5_9.soLuong == var1_4) && (var5_9.var_int_if == var2_6) && (fh.var_int_char + 1 == var5_9.cfr_renamed_2)) {
                            var1_5 = new Vector<fl_0>();
                            var1_5.addElement(new fl_0(MenuChinhAvatar.ct, new cx_0(var3_7)));
                            var1_5.addElement(new fl_0(MenuChinhAvatar.by, new ca_0()));
                            GameCanvas.hienThongBaoPopup(var3_7.chuoiGiaTri, var1_5);
                            if (-"  ".length() <= 0) break block0;
                            return (boolean)((248 ^ 168) & ~(21 ^ 69));
                        }
                        ++var4_8;
lbl254:
                        // 2 sources

                        ** while (!fh.cfr_renamed_3((int)var4_8, (int)var3_7.var_java_util_Vector_do.size()))
                    }
lbl255:
                    // 1 sources

                    ++var0;
lbl256:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var0, (int)aa_0.var_java_util_Vector_if.size()))
                }
lbl257:
                // 2 sources

                if (-"   ".length() < 0) break;
                return (boolean)((153 + 89 - 185 + 190 ^ 142 + 75 - 150 + 94) & (92 ^ 4 ^ (87 ^ 89) ^ -" ".length()));
            }
            case 84: {
                dR.dR_do();
                dR.cfr_renamed_1(2);
                if (-" ".length() >= -" ".length()) break;
                return (boolean)((97 ^ 79) & ~(126 ^ 80));
            }
            case 85: {
                dR.dR_do();
                dR.cfr_renamed_1(3);
                if (" ".length() >= 0) break;
                return (boolean)((29 ^ 5 ^ (63 ^ 121)) & (139 + 181 - 182 + 61 ^ 91 + 31 - 1 + 32 ^ -" ".length()));
            }
            case 86: {
                var0 = fh.int_do(var0, var1_4);
                var1_4 = fh.int_do(fg.var_fs_do.soLuong, fg.var_fs_do.var_int_if);
                dR.dR_do();
                dR.cfr_renamed_1(2, var0 - var1_4, dR.var_java_util_Vector_case);
                if ("  ".length() >= 0) break;
                return (boolean)((240 ^ 191 ^ (36 ^ 68)) & (231 ^ 130 ^ (255 ^ 181) ^ -" ".length()));
            }
            case 87: {
                var0 = fh.int_do(var0, var1_4);
                var1_4 = fh.int_do(gt_0.var_fs_do.soLuong, gt_0.var_fs_do.var_int_if);
                dR.dR_do();
                dR.cfr_renamed_1(1, var0 - var1_4, dR.var_java_util_Vector_for);
                if ("  ".length() >= -" ".length()) break;
                return (boolean)((155 ^ 174) & ~(4 ^ 49));
            }
            case 89: {
                if (!(fh.var_int_char != 108) || (fh.var_int_char == 109)) {
                    var0 = 1;
                    if ("   ".length() == " ".length()) {
                        return (boolean)((202 ^ 160 ^ (9 ^ 46)) & (3 + 115 - 1 + 108 ^ 4 + 99 - -41 + 28 ^ -" ".length()));
                    }
                } else if ((fh.var_int_char == 13)) {
                    var0 = 2;
                    if (" ".length() <= ((145 + 194 - 332 + 193 ^ 90 + 42 - 126 + 128) & (64 ^ 93 ^ (253 ^ 174) ^ -" ".length()))) {
                        return (boolean)((98 + 194 - 267 + 190 ^ 82 + 41 - 109 + 141) & (206 + 87 - 162 + 100 ^ 159 + 20 - 63 + 55 ^ -" ".length()));
                    }
                } else {
                    var0 = 3;
                }
                ft_0.ft_0_do().cfr_renamed_4(var0);
                GameCanvas.cfr_renamed_8();
                if (((33 ^ 102 ^ (246 ^ 188)) & (228 ^ 145 ^ (68 ^ 60) ^ -" ".length())) < " ".length()) break;
                return (boolean)((16 + 155 - 49 + 67 ^ 94 + 146 - 103 + 13) & (111 + 69 - 124 + 71 ^ (228 ^ 176) ^ -" ".length()));
            }
            case 54: {
                return u_0.cfr_renamed_1().boolean_do(var0, var1_4);
            }
            case 21: {
                gd_0.gd_0_do().cfr_renamed_5();
                if ((166 ^ 162) > "  ".length()) break;
                return (boolean)((18 ^ 55) & ~(28 ^ 57));
            }
            case 68: 
            case 69: 
            case 70: {
                go_0.go_0_do();
                go_0.cfr_renamed_6(var2_6 - 67);
                if (((37 ^ 126) & ~(252 ^ 167)) >= 0) break;
                return (boolean)((174 ^ 139) & ~(101 ^ 64));
            }
            case 110: {
                GameCanvas.cfr_renamed_8();
                ep_0.ep_0_do().cfr_renamed_8(AngelChip.duLieuNguoiChoi.cfr_renamed_9);
                if ("  ".length() > 0) break;
                return (boolean)((160 + 18 - 50 + 47 ^ 147 + 152 - 262 + 119) & (152 + 73 - 147 + 113 ^ 120 + 103 - 102 + 19 ^ -" ".length()));
            }
            case 20: {
                ft_0.ft_0_do().cfr_renamed_2(0);
                GameCanvas.cfr_renamed_8();
                if (((18 ^ 69) & ~(145 ^ 198)) == 0) break;
                return (boolean)((225 ^ 163) & ~(116 ^ 54));
            }
            case 71: {
                GameCanvas.cfr_renamed_8();
                ft_0.ft_0_do().cfr_renamed_4(-1);
                if (-(8 ^ 13) < 0) break;
                return (boolean)((117 ^ 86) & ~(16 ^ 51));
            }
            case 94: {
                ft_0.ft_0_do().cfr_renamed_4(4);
                GameCanvas.cfr_renamed_8();
                if (" ".length() < "  ".length()) break;
                return (boolean)((208 ^ 132 ^ (108 ^ 14)) & (103 ^ 72 ^ (4 ^ 29) ^ -" ".length()));
            }
            case 95: {
                GameCanvas.cfr_renamed_8();
                dR.var_int_new = AngelChip.duLieuNguoiChoi.cfr_renamed_2;
                dR.soLuong = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                et_0.et_0_do().cfr_renamed_3(0, 0);
                if (((137 ^ 191) & ~(113 ^ 71)) <= ((111 ^ 61) & ~(148 ^ 198))) break;
                return (boolean)((138 ^ 176) & ~(145 ^ 171));
            }
            case 96: {
                GameCanvas.cfr_renamed_8();
                dR.var_int_new = AngelChip.duLieuNguoiChoi.cfr_renamed_2;
                dR.soLuong = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                et_0.et_0_do().cfr_renamed_8(0, 0);
                if (null == null) break;
                return (boolean)((210 ^ 138 ^ (79 ^ 52)) & (56 ^ 64 ^ (249 ^ 162) ^ -" ".length()));
            }
            case 97: {
                dR.dR_do();
                dR.cfr_renamed_3();
                if (null == null) break;
                return (boolean)((112 + 169 - 67 + 9 ^ 64 + 17 - 35 + 87) & (8 ^ 90 ^ (103 ^ 111) ^ -" ".length()));
            }
            case 98: {
                dR.dR_do().this();
                if (" ".length() >= ((134 ^ 129) & ~(120 ^ 127))) break;
                return (boolean)((58 ^ 8) & ~(166 ^ 148));
            }
            case 103: {
                go_0.go_0_do();
                go_0.void_try(3);
                if (((8 ^ 95 ^ (231 ^ 131)) & (3 ^ 87 ^ (205 ^ 170) ^ -" ".length())) == ((93 ^ 0 ^ (236 ^ 174)) & (51 + 115 - 120 + 95 ^ 108 + 40 - 141 + 139 ^ -" ".length()))) break;
                return (boolean)((39 + 87 - -10 + 7 ^ 105 + 6 - 25 + 90) & (41 ^ 2 ^ (175 ^ 187) ^ -" ".length()));
            }
            case 23: {
                ft_0.ft_0_do().cfr_renamed_12(9);
                GameCanvas.cfr_renamed_8();
                if (((164 + 88 - 181 + 112 ^ 121 + 161 - 122 + 30) & (31 + 40 - 13 + 106 ^ 102 + 102 - 177 + 146 ^ -" ".length())) <= 0) break;
                return (boolean)((5 + 129 - 85 + 90 ^ 132 + 83 - 177 + 131) & (163 ^ 134 ^ (74 ^ 77) ^ -" ".length()));
            }
            case 104: {
                go_0.go_0_do();
                go_0.void_try(4);
                if (null == null) break;
                return (boolean)((65 + 79 - 2 + 33 ^ 109 + 153 - 143 + 72) & (105 + 54 - -7 + 6 ^ 18 + 156 - 103 + 117 ^ -" ".length()));
            }
            case 100: {
                go_0.go_0_do();
                go_0.void_try(5);
                if (" ".length() != 0) break;
                return (boolean)((39 ^ 1) & ~(119 ^ 81));
            }
            case 101: {
                go_0.go_0_do();
                go_0.void_try(6);
                if ("   ".length() >= ((36 ^ 10 ^ (92 ^ 69)) & (90 ^ 61 ^ (198 ^ 150) ^ -" ".length()))) break;
                return (boolean)((78 + 137 - 136 + 127 ^ 28 + 77 - -26 + 10) & (78 ^ 92 ^ (116 ^ 37) ^ -" ".length()));
            }
            case 107: {
                GameCanvas.cfr_renamed_8();
                go_0.soLuongKhoa = fh.var_int_char;
                ft_0.ft_0_do().cfr_renamed_12(12);
                if (-" ".length() < (111 ^ 107)) break;
                return (boolean)((144 ^ 166) & ~(4 ^ 50));
            }
            case 19: {
                GameCanvas.cfr_renamed_8();
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                fh.var_int_byte = -1;
                fn.fn_do().cfr_renamed_3(19, -1);
                if (-" ".length() < "  ".length()) break;
                return (boolean)((24 ^ 53 ^ (41 ^ 44)) & (72 ^ 122 ^ (81 ^ 75) ^ -" ".length()));
            }
            case 10: {
                GameCanvas.cfr_renamed_8();
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                fh.var_int_byte = -1;
                fn.fn_do().cfr_renamed_3(10, -1);
                if (null == null) break;
                return (boolean)((34 ^ 127) & ~(76 ^ 17));
            }
            case 111: {
                GameCanvas.cfr_renamed_8();
                var0_2 = ft_0.ft_0_do();
                var0_2.cfr_renamed_1(-105);
                var0_2.cfr_renamed_0();
                if (-" ".length() < ((202 ^ 198) & ~(137 ^ 133))) break;
                return (boolean)((180 ^ 186) & ~(9 ^ 7));
            }
            case 112: {
                if (!(AngelChip.duLieuNguoiChoi.cfr_renamed_2 != 14)) break;
                gd_0.gd_0_do().var_int_if = AngelChip.duLieuNguoiChoi.cfr_renamed_3;
                if ((var0 = var0 / fh.var_int_int * fh.var_int_int + fh.var_int_int / 2 + 1 < AngelChip.duLieuNguoiChoi.cfr_renamed_2)) {
                    gd_0.gd_0_do().soLuongKhoa = var0 + fh.var_int_int;
                    if (-" ".length() >= (144 ^ 148)) {
                        return (boolean)((128 ^ 172) & ~(61 ^ 17));
                    }
                } else {
                    gd_0.gd_0_do().soLuongKhoa = var0 - fh.var_int_int;
                }
                AngelChip.duLieuNguoiChoi.void_do(var0, var1_4 / fh.var_int_int * fh.var_int_int + 5);
                go_0.go_0_do();
                go_0.cfr_renamed_1(AngelChip.duLieuNguoiChoi.cfr_renamed_2, AngelChip.duLieuNguoiChoi.cfr_renamed_3, AngelChip.duLieuNguoiChoi.var_byte_new, AngelChip.duLieuNguoiChoi.var_short_do);
                AngelChip.duLieuNguoiChoi.cfr_renamed_0(14);
                ep_0.ep_0_do().cfr_renamed_7(14);
                if ("   ".length() > "  ".length()) break;
                return (boolean)((26 ^ 32) & ~(130 ^ 184));
            }
            default: {
                if ((var2_6 >= -125) && (var2_6 < 0)) {
                    GameCanvas.cfr_renamed_8();
                    fh.cfr_renamed_14 = var2_6;
                    ft_0.ft_0_do().cfr_renamed_2((short)(var2_6 - -125));
                    if (((63 ^ 35) & ~(52 ^ 40)) > -" ".length()) break;
                    return (boolean)((203 ^ 148) & ~(108 ^ 51));
                }
                if (fh.cfr_renamed_8((int)AngelChip.duLieuNguoiChoi.cfr_renamed_0) && (var1_4 / fh.var_int_int == 0) && (var2_6 == 88)) {
                    if (fh.cfr_renamed_4((int)go_0.var_boolean_byte)) {
                        AngelChip.duLieuNguoiChoi.cfr_renamed_0 = 1;
                        if ((137 ^ 141) <= 0) {
                            return (boolean)((152 ^ 168) & ~(186 ^ 138));
                        }
                    } else {
                        var0_3 = fn.fn_do();
                        if (fh.cfr_renamed_8((int)go_0.var_boolean_case)) {
                            go_0.var_boolean_case = 1;
                            var0_3.cfr_renamed_1(92);
                            var0_3.cfr_renamed_0();
                        }
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int int_do(int n, short[] sArray) {
        int n2 = n;
        while (!(n2 >= sArray.length)) {
            if ((sArray[n2] != sArray[n2 + 1])) {
                return (n2 - n + 1) * var_int_int / 2;
            }
            ++n2;
        }
        return 0;
    }

    public final void cfr_renamed_1() {
        if ((fo.fo_do() != GameCanvas.var_en_do) && (GameCanvas.var_boolean_try)) {
            fh fh2 = this;
            if (!(GameCanvas.var_dj_0_do == null) || !(GameCanvas.var_ez_do == null) || (GameCanvas.var_aa_do != null)) {
                return;
            }
            if ((GameCanvas.boolean_if(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case))) {
                int n = GameCanvas.int_if();
                int n2 = GameCanvas.int_for();
                if ((GameCanvas.coTrangThai)) {
                    GameCanvas.coTrangThai = 0;
                    this = fm.fm_do().cfr_renamed_3;
                    cfr_renamed_12 = fm.fm_do().cfr_renamed_2;
                    fh2.dangChayAuto = 1;
                }
                if ((fh2.dangChayAuto)) {
                    if ((GameCanvas.var_boolean_case) && (!(hg.int_do(n) <= 20) || (hg.int_do(n2) > 20))) {
                        fm.fm_do().var_int_if = this + n;
                        fm.fm_do().soLuong = cfr_renamed_12 + n2;
                        fm.fm_do().void_do(fm.fm_do().var_int_if + GameCanvas.cfr_renamed_15, fm.fm_do().soLuong + GameCanvas.var_int_char);
                        fm.fm_do().soXu = System.currentTimeMillis() / 100L;
                    }
                    if ((GameCanvas.var_boolean_new)) {
                        GameCanvas.var_boolean_new = 0;
                        fh2.dangChayAuto = 0;
                        if ((hg.int_do(n) < 10) && (hg.int_do(n2) < 10) && !(go_0.coTrangThai)) {
                            fh.var_fs_do.soLuong = GameCanvas.var_int_try + fm.fm_do().cfr_renamed_3;
                            fh.var_fs_do.var_int_if = GameCanvas.soLuong + fm.fm_do().cfr_renamed_2;
                            if ((fh.var_fs_do.var_int_if < 0)) {
                                fh.var_fs_do.var_int_if = 0;
                            }
                            AngelChip.duLieuNguoiChoi.var_fs_do = var_fs_do;
                            AngelChip.duLieuNguoiChoi.cfr_renamed_3();
                        }
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_0() {
        fj_0.dangChayAuto = 0;
        fh.cfr_renamed_5();
        (AngelChip.duLieuNguoiChoi != null);
        short[] sArray = new short[var_short_arr_if.length];
        var_short_arr_do = new short[var_short_arr_if.length];
        byte[] byArray = new byte[100];
        byte by2 = 0;
        int n = 0;
        while (!(n >= var_short_arr_if.length)) {
            sArray[n] = var_short_arr_if[n];
            ++n;
        }
        n = 0;
        while (!(n >= var_short_arr_if.length)) {
            if ((var_short_arr_if[n] < fh.var_cu_0_do.cfr_renamed_0)) {
                fh.var_short_arr_if[n] = -4;
                if ("  ".length() <= 0) {
                    return;
                }
            } else if ((var_short_arr_if[n] < fh.var_cu_0_do.cfr_renamed_0 << 1)) {
                fh.var_short_arr_if[n] = -5;
                if ("  ".length() < -" ".length()) {
                    return;
                }
            } else {
                ac ac2;
                int n2 = var_short_arr_if[n] - (fh.var_cu_0_do.cfr_renamed_0 << 1);
                switch (n2) {
                    case 0: {
                        fh.var_short_arr_if[n] = 98;
                        ac2 = new ac(846, fh.int_do(n) + var_int_int / 2, fh.int_if(n) + var_int_int / 2);
                        var_java_util_Vector_char.addElement(ac2);
                        if (((207 + 134 - 128 + 14 ^ 41 + 21 - -58 + 42) & (12 + 63 - -107 + 62 ^ 55 + 148 - 125 + 103 ^ -" ".length())) >= 0) break;
                        return;
                    }
                    case 2: {
                        fh.var_short_arr_if[n] = 139;
                        if ("  ".length() > " ".length()) break;
                        return;
                    }
                    case 3: {
                        fh.var_short_arr_if[n] = 152;
                        if (" ".length() <= "  ".length()) break;
                        return;
                    }
                    case 12: {
                        fh.var_short_arr_if[n] = 150;
                        break;
                    }
                    case 13: {
                        fh.var_short_arr_if[n] = 151;
                        if ((57 + 54 - 87 + 115 ^ 44 + 25 - 44 + 118) != "  ".length()) break;
                        return;
                    }
                    case 14: {
                        (n, by2, 0 == null);
                        by2 = (byte)(by2 + 1);
                        fh.var_short_arr_if[n] = 184;
                        sArray[n] = 33;
                        if (-"  ".length() <= 0) break;
                        return;
                    }
                    case 15: {
                        sArray[n] = 0;
                        fh.var_short_arr_if[n] = 185;
                        if (" ".length() >= -" ".length()) break;
                        return;
                    }
                    default: {
                        (n, byArray[n2], 0 == null);
                        fh.var_short_arr_do[n] = (byte)(n2 + -125);
                        fh.var_short_arr_if[n] = -3;
                    }
                }
                if ((n2 > 0) && (byArray[n2] == 0) && (n2 - 1 < go_0.var_short_arr_do.length) && (go_0.var_short_arr_do[n2 - 1] != -1)) {
                    ac2 = new ac(go_0.var_short_arr_do[n2 - 1], fh.int_do(n) + fh.int_do(n, sArray), fh.int_if(n) + var_int_int - 4);
                    var_java_util_Vector_char.addElement(ac2);
                }
                if ((n2 != 14)) {
                    fh.void_do(n, sArray);
                }
                int n3 = n2;
                byArray[n3] = (byte)(byArray[n3] + 1);
            }
            ++n;
        }
        fm.coTrangThai = 0;
        ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_2 = (byte)0;
        (null, go_0.var_byte_for + 1, 0 != null);
        var_int_char = go_0.var_byte_for;
        var_short_arr_if = sArray;
        fm.fm_do().void_do(go_0.var_byte_for + 1);
        GameCanvas.cfr_renamed_7();
        cfr_renamed_20 = -1;
        var_int_byte = -1;
        fh.cfr_renamed_3();
        fn.fn_do().cfr_renamed_3(go_0.var_byte_for, -1);
    }

    public static void (int n, int n2, int n3 != null) {
        fd_0 fd_02;
        if ((var_int_else != -1)) {
            return;
        }
        if ((n > 0)) {
            fd_02 = new ac(n, n2, n3);
            if (((0x25 ^ 0x6E) & ~(0x5A ^ 0x11)) != 0) {
                return;
            }
        } else {
            fd_02 = new fd_0(n, n2, n3, 0);
        }
        var_java_util_Vector_char.addElement(fd_02);
    }

            private static void (int n, byte by2, int n2 != null) {
        fh.var_short_arr_do[n] = by2;
        fh.var_short_arr_if[n] = (short)n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block17: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block16: {
                                    var2_2 = var1_1;
                                    var3_4 = this;
                                    if (!(fh.var_javax_microedition_lcdui_Image_if == null)) break block16;
                                    var2_2.setColor(1);
                                    var2_2.fillRect(fm.fm_do().cfr_renamed_3, fm.fm_do().cfr_renamed_2, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
                                    if ("   ".length() <= ((51 ^ 2 ^ (137 ^ 166)) & (92 ^ 118 ^ (96 ^ 84) ^ -" ".length()))) {
                                        return;
                                    }
                                    break block17;
                                }
                                var2_2.setColor(fh.var_int_new);
                                var2_2.fillRect(fm.fm_do().cfr_renamed_3, fm.fm_do().cfr_renamed_2, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
                                var4_5 = fm.fm_do().cfr_renamed_3 * 30 / 210;
                                var5_6 = (fm.fm_do().cfr_renamed_3 - var4_5) / (96 * dF.cfr_renamed_12);
                                var6_7 = -(94 - fh.var_int_int + fh.var_int_int / 2) * dF.cfr_renamed_12;
                                if ((fh.var_int_char == 107)) {
                                    var6_7 += 41 * dF.cfr_renamed_12;
                                }
                                var7_8 = var5_6;
                                if ("   ".length() == "   ".length()) ** GOTO lbl26
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var2_2.drawImage(fh.var_javax_microedition_lcdui_Image_if, var4_5 + var7_8 * (96 * dF.cfr_renamed_12), var6_7, 0);
                                    ++var7_8;
lbl26:
                                    // 2 sources

                                    ** while (!fh.cfr_renamed_2((int)var7_8, (int)(var5_6 + GameCanvas.soLuongKhoa / (96 * dF.cfr_renamed_12) + 1)))
                                }
lbl27:
                                // 1 sources

                                if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_new)) break block18;
                                var8_9 = 0;
                                if (((117 ^ 88) & ~(23 ^ 58)) != (124 ^ 120)) ** GOTO lbl37
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var9_10 = (fs)fh.var_java_util_Vector_new.elementAt(var8_9);
                                    var7_8 = fm.fm_do().cfr_renamed_3 * (30 + var9_10.var_short_do * 3) / 210;
                                    aa_0.cfr_renamed_1(var2_2, var9_10.cfr_renamed_2, var9_10.soLuong + var7_8, var9_10.var_int_if, 33);
                                    ++var8_9;
lbl37:
                                    // 2 sources

                                    ** while (!fh.cfr_renamed_3((int)var8_9, (int)fh.var_java_util_Vector_new.size()))
                                }
                            }
                            if (!(var7_8 = fh.var_java_util_Vector_else.size() > 0)) break block19;
                            var8_9 = 0;
                            if (null == null) ** GOTO lbl49
                            return;
lbl-1000:
                            // 1 sources

                            {
                                var9_10 = (fs)fh.var_java_util_Vector_else.elementAt(var8_9);
                                var2_2.setColor(fh.var_int_arr_if[var9_10.cfr_renamed_2]);
                                var2_2.fillRect(var9_10.soLuong + var4_5, var9_10.var_int_if, 1, 1);
                                ++var8_9;
lbl49:
                                // 2 sources

                                ** while (!fh.cfr_renamed_3((int)var8_9, (int)var7_8))
                            }
                        }
                        if (!(var3_4.var_fs_arr_do != null)) break block20;
                        var8_9 = 0;
                        if (((113 ^ 124) & ~(161 ^ 172)) <= 0) ** GOTO lbl59
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var2_2.drawImage(gO.var_javax_microedition_lcdui_Image_arr_do[0], var3_4.var_fs_arr_do[var8_9].soLuong, var3_4.var_fs_arr_do[var8_9].var_int_if, 0);
                            ++var8_9;
lbl59:
                            // 2 sources

                            ** while (!fh.cfr_renamed_3((int)var8_9, (int)var3_4.var_fs_arr_do.length))
                        }
                    }
                    if (!(GameCanvas.var_java_util_Vector_if.size() > 0)) break block21;
                    var8_9 = 0;
                    if ((191 ^ 147 ^ (108 ^ 68)) != 0) ** GOTO lbl72
                    return;
lbl-1000:
                    // 1 sources

                    {
                        GameCanvas.var_java_util_Vector_if.elementAt(var8_9);
                        ++var8_9;
lbl72:
                        // 2 sources

                        ** while (!fh.cfr_renamed_3((int)var8_9, (int)GameCanvas.var_java_util_Vector_if.size()))
                    }
                }
                if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_byte)) break block22;
                var8_9 = 0;
                if (-(189 ^ 185) <= 0) ** GOTO lbl82
                return;
lbl-1000:
                // 1 sources

                {
                    ((o)fh.var_java_util_Vector_byte.elementAt(var8_9)).cfr_renamed_1(var2_2);
                    ++var8_9;
lbl82:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var8_9, (int)fh.var_java_util_Vector_byte.size()))
                }
            }
            if ((GameCanvas.soLuongKhoa > fh.var_short_if * fh.var_int_int)) {
                var2_2.setColor(0);
                var2_2.fillRect(fm.fm_do().cfr_renamed_3, fm.fm_do().cfr_renamed_2, -fm.fm_do().cfr_renamed_3, GameCanvas.var_int_case);
                var2_2.fillRect(fh.var_short_if * fh.var_int_int * dF.cfr_renamed_12, fm.fm_do().cfr_renamed_2, -fm.fm_do().cfr_renamed_3, GameCanvas.var_int_case);
            }
        }
        var3_4 = var1_1;
        var4_5 = (fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) / fh.var_int_int + 1;
        if ((var4_5 > fh.var_short_if)) {
            var4_5 = fh.var_short_if;
        }
        if (fh.cfr_renamed_2(var5_6 = (fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case) / fh.var_int_int + 1, fh.var_short_do)) {
            var5_6 = fh.var_short_do;
        }
        if (fh.cfr_renamed_5(var6_7 = fm.fm_do().cfr_renamed_3 / (fh.var_int_int * dF.cfr_renamed_12))) {
            var6_7 = 0;
        }
        var9_11 = 0;
        if (((135 ^ 152) & ~(221 ^ 194)) >= 0) ** GOTO lbl114
        return;
lbl-1000:
        // 1 sources

        {
            var2_3 = var6_7;
            if ("  ".length() >= 0) ** GOTO lbl112
            return;
lbl-1000:
            // 1 sources

            {
                var7_8 = fh.var_short_arr_if[var9_11 * fh.var_short_if + var2_3];
                if ((var7_8 != -1)) {
                    var8_9 = var7_8 / fh.var_cu_0_do.cfr_renamed_0;
                    fh.var_cu_0_do.cfr_renamed_1(var8_9, var7_8 % fh.var_cu_0_do.cfr_renamed_0, var2_3 * (fh.var_int_int * dF.cfr_renamed_12), var9_11 * fh.var_int_int * dF.cfr_renamed_12, (Graphics)var3_4);
                }
                ++var2_3;
lbl112:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var2_3, (int)var4_5))
            }
lbl113:
            // 1 sources

            ++var9_11;
lbl114:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var9_11, (int)var5_6))
        }
lbl115:
        // 1 sources

        if ((fh.var_cu_0_if != null) && (fh.soLuongKhoa != -1) && (AngelChip.duLieuNguoiChoi.var_int_catch > 0)) {
            fh.var_cu_0_if.cfr_renamed_1(fh.var_fs_do.cfr_renamed_2 / 2, fh.var_fs_do.soLuong, fh.var_fs_do.var_int_if, fh.soLuongKhoa, 3, var1_1);
        }
    }

    public final void cfr_renamed_2(Graphics graphics) {
        GameCanvas.hienThongBaoPopup(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        graphics.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
        this.cfr_renamed_0(graphics);
    }

    public static boolean boolean_do(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != 55) && (n != 93) && (n != 78) && (n != 89) && (n != 27) && (n != 28) && (n != 29) && (n != 84) && (n != 85) && (n != 86) && (n != 83) && (n != 87) && (n != 54) && (n != 67) && (n != 81) && (n != 71) && (n != 79) && (n != 92) && (n != 52) && (n != 94) && (n != 95) && (n != 96) && (n != 97) && (n != 98) && (n != 100) && (n != 103) && (n != 101) && (n != 104) && !(n == 23))) {
            return 1;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DuLieuNguoiChoi ef_do(int n) {
        int n2 = 0;
        while (!(n2 >= var_java_util_Vector_case.size())) {
            bm bm2 = (bm)var_java_util_Vector_case.elementAt(n2);
            if ((bm2.var_byte_if == 0) && fh.cfr_renamed_5(((dd_0)bm2).cfr_renamed_9, n)) {
                return (DuLieuNguoiChoi)bm2;
            }
            ++n2;
        }
        return null;
    }

    static {
        fh.cfr_renamed_13();
        var_int_char = -1;
        byte[] byArray = new byte[26];
        byArray[0] = 1;
        byArray[1] = 1;
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 1;
        byArray[8] = 1;
        byArray[11] = 1;
        byArray[12] = 3;
        byArray[13] = 3;
        byArray[14] = 3;
        byArray[15] = 3;
        byArray[16] = 3;
        byArray[17] = 2;
        byArray[18] = -1;
        byArray[19] = -1;
        byArray[20] = -1;
        byArray[24] = 2;
        byArray[25] = 2;
        var_byte_arr_do = byArray;
        var_int_int = 24;
        var_byte_if = (byte)0;
        var_byte_do = (byte)-1;
        var_java_util_Vector_char = new Vector();
        var_java_util_Vector_case = new Vector();
        var_java_util_Vector_int = new Vector();
        cfr_renamed_30 = 0;
        var_java_util_Vector_else = new Vector();
        int[] nArray = new int[4];
        nArray[0] = 15853390;
        nArray[1] = 15006199;
        nArray[2] = 8183509;
        nArray[3] = 12254198;
        var_int_arr_if = nArray;
        int[] nArray2 = new int[2];
        nArray2[0] = 6143735;
        nArray2[1] = 21;
        var_int_arr_for = nArray2;
        var_int_byte = -1;
        cfr_renamed_20 = -1;
        var_int_else = -1;
        var_fj_0_do = new fj_0();
        soLuongKhoa = -1;
        fh.cfr_renamed_10 = 3;
        cfr_renamed_9 = -1;
        var_int_try = -1;
        cfr_renamed_16 = 0;
        var_int_if = 0;
        cfr_renamed_14 = -1;
        soLuong = -1;
        var_int_case = -1;
    }

    private static void void_if(int n, int n2) {
        if ((var_int_else != -1)) {
            return;
        }
        ac ac2 = new ac(n, fh.int_do(n2) + fh.int_do(n2, var_short_arr_if), fh.int_if(n2) + var_int_int - 4);
        var_java_util_Vector_char.addElement(ac2);
    }

    public static void void_do(int n, int n2) {
        fh.var_short_arr_do[n2 * fh.var_short_if + n] = 51;
    }

    public static InputStream java_io_InputStream_do(int n) {
        e.var_e_do = new e("/a.clazz");
        Object object = "" + n;
        object = e.var_e_do.byte_arr_do((String)object);
        ByteArrayInputStream byteArrayInputStream = null;
        if ((object != null)) {
            try {
                byteArrayInputStream = new ByteArrayInputStream((byte[])object);
                }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return byteArrayInputStream;
    }

            private static int int_if(int n) {
        return n / var_short_if * var_int_int;
    }

    public static void (byte by2 == byte[] byArray) {
        var_int_else = by2;
        var_cu_0_do = new cu_0(hg.javax_microedition_lcdui_Image_do(byArray), var_int_int * dF.cfr_renamed_12, dF.cfr_renamed_12 * var_int_int);
        fh.cfr_renamed_0();
        GameCanvas.var_int_byte = 0;
    }

    public static void (byte by2, byte by3, int n, int n2 != null) {
        soLuong = n;
        var_int_case = n2;
        var_int_else = -1;
        GameCanvas.cfr_renamed_8();
        if ((AngelChip.soLuong != 9)) {
            ft_0.ft_0_do().cfr_renamed_12(9);
        }
        fn.fn_do().cfr_renamed_3(by2, by3);
    }

    /*
     * Unable to fully structure code
     */
    private static void void_if(int var0) {
        block6: {
            var1_1 = 0;
            if ("  ".length() > 0) ** GOTO lbl12
            return;
lbl-1000:
            // 1 sources

            {
                var2_2 = (bB)aa_0.var_java_util_Vector_int.elementAt(var1_1);
                if ((var2_2.cfr_renamed_8 == var0)) {
                    var3_3 = aa_0.gs_0_do((int)var2_2.cfr_renamed_0);
                    fh.cfr_renamed_1((bB)var2_2, var3_3);
                    fh.var_java_util_Vector_char.addElement(new bB(var2_2.cfr_renamed_8, var2_2.cfr_renamed_2 * fh.var_int_int, var2_2.cfr_renamed_3 * fh.var_int_int, var2_2.var_short_do, var2_2.cfr_renamed_0));
                }
                ++var1_1;
lbl12:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_1, (int)aa_0.var_java_util_Vector_int.size()))
            }
lbl13:
            // 1 sources

            if (!fh.cfr_renamed_1((Object)aa_0.var_java_util_Vector_if)) break block6;
            var1_1 = 0;
            if (((99 ^ 65 ^ (33 ^ 88)) & (106 ^ 67 ^ (209 ^ 163) ^ -" ".length())) >= 0) ** GOTO lbl33
            return;
lbl-1000:
            // 1 sources

            {
                var2_2 = (er)aa_0.var_java_util_Vector_if.elementAt(var1_1);
                var3_4 = 0;
                if ("   ".length() != 0) ** GOTO lbl31
                return;
lbl-1000:
                // 1 sources

                {
                    var4_5 = (fs)var2_2.var_java_util_Vector_do.elementAt(var3_4);
                    if ((var4_5.cfr_renamed_2 == var0)) {
                        if ((var4_5.var_int_if * fh.var_short_if + var4_5.soLuong >= 0) && (var4_5.var_int_if * fh.var_short_if + var4_5.soLuong < fh.var_short_arr_do.length)) {
                            fh.var_short_arr_do[var4_5.var_int_if * fh.var_short_if + var4_5.soLuong] = 83;
                        }
                        (var2_2.cfr_renamed_3, var4_5.soLuong * fh.var_int_int + fh.var_int_int / 2, var4_5.var_int_if * fh.var_int_int + fh.var_int_int / 2 != null);
                    }
                    ++var3_4;
lbl31:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var3_4, (int)var2_2.var_java_util_Vector_do.size()))
                }
lbl32:
                // 1 sources

                ++var1_1;
lbl33:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_1, (int)aa_0.var_java_util_Vector_if.size()))
            }
        }
    }

    private static void cfr_renamed_7() {
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.bg, new cs());
    }

    public static void (DuLieuNguoiChoi ef2 != null) {
        var_java_util_Vector_case.addElement(ef2);
        ef2.cfr_renamed_5();
    }

    public static void (DuLieuNguoiChoi dd_02 == null) {
        if ((dd_02.var_short_if != -1)) {
            dd_02 = new dH((DuLieuNguoiChoi)dd_02);
            var_java_util_Vector_case.addElement(dd_02);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static gs_0 gs_0_do(int var0) {
        var1_1 = fh.var_java_util_Vector_do.size();
        var2_2 = 0;
        if ((86 ^ 82) >= "  ".length()) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_3 = (gs_0)fh.var_java_util_Vector_do.elementAt(var2_2);
            if ((var3_3.cfr_renamed_4 == var0)) {
                return var3_3;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl12:
        // 1 sources

        return null;
    }

    private static void void_do(int n, short[] sArray) {
        if ((n % var_short_if == 0)) {
            sArray[n] = sArray[n + 1];
            return;
        }
        sArray[n] = sArray[n - 1];
    }

    public static void cfr_renamed_2(DuLieuNguoiChoi dd_02) {
        var_java_util_Vector_case.removeElement(dd_02);
        dd_02 = fh.dH_do(((dd_0)dd_02).cfr_renamed_9);
        if (fh.cfr_renamed_1((Object)dd_02)) {
            var_java_util_Vector_case.removeElement(dd_02);
            }
    }

    private static void (String string, int n, int n2 != null) {
        if ((ae.ae_do().cfr_renamed_2)) {
            var_java_util_Vector_char.addElement(new cm(string, n, n2));
        }
    }

        public static int int_do(int n, int n2) {
        if (!(n >= 0) || !(n <= var_short_if * var_int_int) || (n2 / var_int_int * var_short_if + n / var_int_int >= var_short_arr_do.length)) {
            return -1;
        }
        return n2 / var_int_int * var_short_if + n / var_int_int;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_2() {
        try {
            block58: {
                block57: {
                    block55: {
                        block47: {
                            block54: {
                                block53: {
                                    block52: {
                                        block51: {
                                            block50: {
                                                block49: {
                                                    block48: {
                                                        fm.fm_do().cfr_renamed_3();
                                                        if ((GameCanvas.cfr_renamed_12 != 0) && !(GameCanvas.var_en_do != ff_0.cfr_renamed_1()) || !(fh.var_java_util_Vector_case.size() > 0)) break block48;
                                                        var1_1 = 0;
                                                        if (" ".length() < "  ".length()) ** GOTO lbl11
                                                        return;
lbl-1000:
                                                        // 1 sources

                                                        {
                                                            ((bm)fh.var_java_util_Vector_case.elementAt(var1_1)).void_do();
                                                            ++var1_1;
lbl11:
                                                            // 2 sources

                                                            ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_case.size()))
                                                        }
lbl12:
                                                        // 1 sources

                                                        (fh.var_java_util_Vector_case != null);
                                                        }
                                                    if (!(fh.var_java_util_Vector_int.size() > 0)) break block49;
                                                    (fh.var_java_util_Vector_int != null);
                                                    var1_1 = 0;
                                                    if (null == null) ** GOTO lbl29
                                                    return;
lbl-1000:
                                                    // 1 sources

                                                    {
                                                        ((bm)fh.var_java_util_Vector_int.elementAt(var1_1)).void_do();
                                                        ++var1_1;
lbl29:
                                                        // 2 sources

                                                        ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_int.size()))
                                                    }
                                                }
                                                if (!(fh.var_java_util_Vector_char.size() > 0)) break block50;
                                                var1_1 = 0;
                                                if (null == null) ** GOTO lbl39
                                                return;
lbl-1000:
                                                // 1 sources

                                                {
                                                    ((bm)fh.var_java_util_Vector_char.elementAt(var1_1)).void_do();
                                                    ++var1_1;
lbl39:
                                                    // 2 sources

                                                    ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_char.size()))
                                                }
                                            }
                                            var2_2 = this;
                                            if (!(var2_2.var_fs_arr_do != null)) break block51;
                                            var3_4 = 0;
                                            if (null == null) ** GOTO lbl53
                                            return;
lbl-1000:
                                            // 1 sources

                                            {
                                                var2_2.var_fs_arr_do[var3_4].soLuong -= 1;
                                                if ((var2_2.var_fs_arr_do[var3_4].soLuong < fm.fm_do().cfr_renamed_3 - 100)) {
                                                    var2_2.var_fs_arr_do[var3_4].soLuong = fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa + 30 + hg.int_new(10) * 50;
                                                    var2_2.var_fs_arr_do[var3_4].var_int_if = -110 - hg.int_new(6) * 10;
                                                }
                                                ++var3_4;
lbl53:
                                                // 2 sources

                                                ** while (!fh.cfr_renamed_3((int)var3_4, (int)var2_2.var_fs_arr_do.length))
                                            }
                                        }
                                        if (!(GameCanvas.var_int_goto % 4 == 2) || !fh.cfr_renamed_8((int)dR.coKichHoat) || (fh.var_int_char == 24) && !(GameCanvas.cfr_renamed_12 == 0) || !(dR.var_byte_char == -1) || !fh.cfr_renamed_8((int)dR.dangChayAuto) || !(eu_0.var_eu_0_do != GameCanvas.var_en_do)) break block47;
                                        if ((fh.var_int_char != -1) && (GameCanvas.var_en_do != ff_0.var_ff_0_do) && !(GameCanvas.var_aa_do != null)) break block52;
                                        if (((27 ^ 49) & ~(172 ^ 134)) != 0) {
                                            return;
                                        }
                                        break block47;
                                    }
                                    if (!(fh.var_bm_do == null)) break block53;
                                    var2_3 = 0;
                                    if (((76 + 130 - 128 + 57 ^ 7 + 33 - -77 + 49) & (70 ^ 112 ^ (29 ^ 10) ^ -" ".length())) == 0) ** GOTO lbl71
                                    return;
                                    while (fh.cfr_renamed_8((int)fh.cfr_renamed_7(var2_3))) {
                                        ++var2_3;
lbl71:
                                        // 2 sources

                                        if (!(var2_3 >= fh.var_java_util_Vector_case.size())) continue;
                                        if (" ".length() >= "   ".length()) {
                                            return;
                                        }
                                        break block47;
                                    }
                                    break block47;
                                }
                                v0 = hg.int_do(fh.var_bm_do.cfr_renamed_2 - AngelChip.duLieuNguoiChoi.cfr_renamed_2) / fh.var_int_int;
                                if ((fh.var_bm_do.var_byte_if == 7)) {
                                    v1 = fh.cfr_renamed_10 << 1;
                                    if (-" ".length() >= "  ".length()) {
                                        return;
                                    }
                                } else {
                                    v1 = fh.cfr_renamed_10;
                                }
                                if (!(v0 < v1)) break block54;
                                v2 = hg.int_do(fh.var_bm_do.cfr_renamed_3 - AngelChip.duLieuNguoiChoi.cfr_renamed_3) / fh.var_int_int;
                                if ((fh.var_bm_do.var_byte_if == 7)) {
                                    v3 = fh.cfr_renamed_10 << 1;
                                    if ("  ".length() > (122 + 23 - 5 + 5 ^ 127 + 111 - 206 + 117)) {
                                        return;
                                    }
                                } else {
                                    v3 = fh.cfr_renamed_10;
                                }
                                if (!(v2 >= v3)) break block47;
                            }
                            fh.var_bm_do = null;
                            go_0.var_ef_if = null;
                        }
                        if (fh.cfr_renamed_4((int)fj_0.dangChayAuto)) {
                            fh.var_fj_0_do.cfr_renamed_1();
                        }
                        if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_for)) break block55;
                        var1_1 = 0;
                        if (" ".length() != -" ".length()) ** GOTO lbl205
                        return;
lbl-1000:
                        // 1 sources

                        {
                            block56: {
                                var2_2 = (ak)fh.var_java_util_Vector_for.elementAt(var1_1);
                                if (!(aa_0.hm_do(var2_2.cfr_renamed_3) != null)) break block56;
                                if (!(var2_2.var_byte_if == 0)) ** GOTO lbl127
                                var3_5 = fh.ef_do(var2_2.soLuong);
                                if (fh.cfr_renamed_0((Object)var3_5)) {
                                    fh.var_java_util_Vector_for.removeElement(var2_2);
                                    if (((149 ^ 140) & ~(94 ^ 71)) > "   ".length()) {
                                        return;
                                    }
                                } else {
                                    var2_2.cfr_renamed_5 = (short)var3_5.cfr_renamed_2;
                                    var2_2.cfr_renamed_4 = (short)var3_5.cfr_renamed_3;
lbl127:
                                    // 2 sources

                                    if ((var2_2.cfr_renamed_6 == var2_2.cfr_renamed_2)) {
                                        var2_2.cfr_renamed_6 = (short)0;
                                        var3_6 = new o();
                                        new o().var_short_do = var2_2.cfr_renamed_3;
                                        var3_6.soLuong = var2_2.soLuong;
                                        var3_6.var_byte_do = var2_2.var_byte_if;
                                        switch (var2_2.var_byte_do) {
                                            case 0: {
                                                var3_6.cfr_renamed_2 = var2_2.cfr_renamed_5;
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_4;
                                                if (" ".length() <= " ".length()) break;
                                                return;
                                            }
                                            case 1: {
                                                var4_7 = hg.int_new(var2_2.cfr_renamed_8);
                                                var5_8 = hg.int_new(360);
                                                var6_9 = var4_7 * hg.int_int(hg.int_for(var5_8)) >> 10;
                                                var4_7 = -(var4_7 * hg.int_if(hg.int_for(var5_8))) >> 10;
                                                var3_6.cfr_renamed_2 = var2_2.cfr_renamed_5;
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_4;
                                                var3_6.cfr_renamed_0 = (short)var6_9;
                                                var3_6.cfr_renamed_2 = (short)var4_7;
                                                if (" ".length() >= 0) break;
                                                return;
                                            }
                                            case 2: {
                                                var3_6.cfr_renamed_2 = var2_2.cfr_renamed_5;
                                                var3_6.cfr_renamed_3 = var2_2.cfr_renamed_4;
                                                if ((var2_2.var_byte_if == 0)) {
                                                    var3_6.cfr_renamed_0 = var2_2.var_short_arr_if[var2_2.var_short_if];
                                                    var3_6.cfr_renamed_2 = var2_2.var_short_arr_do[var2_2.var_short_if];
                                                    if (-(7 + 13 - -105 + 61 ^ 32 + 29 - -5 + 125) < 0) break;
                                                    return;
                                                }
                                                var3_6.cfr_renamed_2 += var2_2.var_short_arr_if[var2_2.var_short_if];
                                                var3_6.cfr_renamed_3 += var2_2.var_short_arr_do[var2_2.var_short_if];
                                            }
                                        }
                                        var2_2.var_short_do = (short)(var2_2.var_short_do + 1);
                                        var2_2.var_short_if = (short)(var2_2.var_short_if + 1);
                                        if ((var2_2.var_short_arr_if != null) && (var2_2.var_short_if >= var2_2.var_short_arr_if.length)) {
                                            var2_2.var_short_if = (short)0;
                                        }
                                        if ((var2_2.cfr_renamed_7 != -1) && (var2_2.var_short_do >= var2_2.cfr_renamed_7)) {
                                            fh.var_java_util_Vector_for.removeElement(var2_2);
                                            }
                                        switch (var2_2.var_byte_if) {
                                            case 0: {
                                                fh.var_java_util_Vector_case.addElement(var3_6);
                                                fh.var_java_util_Vector_case = (fh.var_java_util_Vector_case != null);
                                                if (-" ".length() != ((137 ^ 144) & ~(136 ^ 145))) break;
                                                return;
                                            }
                                            case 1: {
                                                fh.var_java_util_Vector_char.addElement(var3_6);
                                                fh.var_java_util_Vector_char = (fh.var_java_util_Vector_char != null);
                                                if ((55 ^ 51) > ((88 ^ 96) & ~(71 ^ 127))) break;
                                                return;
                                            }
                                            case 2: {
                                                if ((fh.var_java_util_Vector_byte == null)) {
                                                    fh.var_java_util_Vector_byte = new Vector<E>();
                                                }
                                                fh.var_java_util_Vector_byte.addElement(var3_6);
                                                if (-(103 ^ 10 ^ (245 ^ 156)) < 0) break;
                                                return;
                                            }
                                            case 3: {
                                                if ((fh.var_java_util_Vector_try == null)) {
                                                    fh.var_java_util_Vector_try = new Vector<E>();
                                                }
                                                fh.var_java_util_Vector_try.addElement(var3_6);
                                            }
                                        }
                                    }
                                    var2_2.cfr_renamed_6 = (short)(var2_2.cfr_renamed_6 + 1);
                                }
                            }
                            ++var1_1;
lbl205:
                            // 2 sources

                            ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_for.size()))
                        }
                    }
                    if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_byte)) break block57;
                    var1_1 = 0;
                    if (((84 + 134 - 66 + 0 ^ 6 + 87 - 55 + 137) & (96 + 94 - 147 + 113 ^ 142 + 90 - 72 + 11 ^ -" ".length())) <= (113 + 111 - 174 + 128 ^ 171 + 32 - 59 + 38)) ** GOTO lbl215
                    return;
lbl-1000:
                    // 1 sources

                    {
                        ((o)fh.var_java_util_Vector_byte.elementAt(var1_1)).void_do();
                        ++var1_1;
lbl215:
                        // 2 sources

                        ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_byte.size()))
                    }
                }
                if (!fh.cfr_renamed_1((Object)fh.var_java_util_Vector_try)) break block58;
                var1_1 = 0;
                if ("   ".length() >= "  ".length()) ** GOTO lbl225
                return;
lbl-1000:
                // 1 sources

                {
                    ((o)fh.var_java_util_Vector_try.elementAt(var1_1)).void_do();
                    ++var1_1;
lbl225:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_try.size()))
                }
            }
            if ((fh.var_cu_0_if != null) && (fh.soLuongKhoa != -1) && (AngelChip.duLieuNguoiChoi.var_int_catch > 0)) {
                fh.var_fs_do.cfr_renamed_2 += 1;
                if ((fh.var_fs_do.cfr_renamed_2 >= 10)) {
                    fh.var_fs_do.cfr_renamed_2 = 0;
                }
            }
            if ((fh.cfr_renamed_16 += 1 >= 6)) {
                fh.cfr_renamed_16 = 0;
                return;
            }
        }
        catch (Exception v4) {
            }
    }

    private static void (int n == byte by2) {
        fh.var_short_arr_do[n] = by2;
        if ((n / var_short_if == 0)) {
            fh.var_short_arr_if[n] = 43;
            return;
        }
        fh.var_short_arr_if[n] = 6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_3() {
        if (!fh.cfr_renamed_1((Object)var_java_util_Vector_if) || (var_java_util_Vector_do == null)) {
            return;
        }
        int n = 0;
        while (!(n >= var_java_util_Vector_if.size())) {
            bB bB2 = (bB)var_java_util_Vector_if.elementAt(n);
            Object object = fh.gs_0_do(bB2.cfr_renamed_0);
            (bB2 ==  (gs_0)object);
            object = new bB(bB2.cfr_renamed_8, bB2.cfr_renamed_2 * var_int_int, bB2.cfr_renamed_3 * var_int_int, bB2.var_short_do, bB2.cfr_renamed_0);
            new bB(bB2.cfr_renamed_8, bB2.cfr_renamed_2 * var_int_int, bB2.cfr_renamed_3 * var_int_int, bB2.var_short_do, bB2.cfr_renamed_0).dangChayAuto = bB2.dangChayAuto;
            var_java_util_Vector_char.addElement(object);
            ++n;
        }
        (var_java_util_Vector_char != null);
        }

    /*
     * Unable to fully structure code
     */
    private static void (int var0, byte var1_1, int var2_2 == null) {
        block18: {
            block17: {
                if ((var1_1 != 0)) {
                    return;
                }
                if (!(var0 + 1 < fh.var_short_arr_if.length) || !(fh.var_short_arr_if[var0] == fh.var_short_arr_if[var0 + 1])) break block17;
                var1_1 = (byte)var0;
                if (((110 ^ 28 ^ (27 ^ 61)) & (158 ^ 128 ^ (54 ^ 124) ^ -" ".length())) == 0) ** GOTO lbl40
                return;
lbl-1000:
                // 1 sources

                {
                    if ((fh.var_short_arr_if[var1_1] != fh.var_short_arr_if[var1_1 + 1])) {
                        if ((var2_2 != 1)) {
                            v0 = MenuChinhAvatar.ai;
                            if (" ".length() <= 0) {
                                return;
                            }
                        } else {
                            v0 = "thoat";
                        }
                        v1 = fh.int_do(var0) + (var1_1 - var0 + 1) * fh.var_int_int / 2;
                        v2 = fh.int_if(var0);
                        if ((fh.var_int_else == -1)) {
                            v3 = fh.var_int_int / 2;
                            if ((47 ^ 15 ^ (172 ^ 136)) <= " ".length()) {
                                return;
                            }
                        } else {
                            v3 = fh.var_int_int;
                        }
                        v4 = v2 + v3;
                        if ((var2_2 == 2)) {
                            v5 = fh.var_int_int / 2;
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        } else {
                            v5 = 0;
                        }
                        (v0, v1, v4 + v5 != null);
                        return;
                    }
                    var1_1 = (byte)(var1_1 + 1);
lbl40:
                    // 2 sources

                    ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_short_arr_if.length))
                }
lbl41:
                // 1 sources

                return;
            }
            if (!(var0 + fh.var_short_if < fh.var_short_arr_if.length) || !(fh.var_short_arr_if[var0] == fh.var_short_arr_if[var0 + fh.var_short_if])) break block18;
            var1_1 = (byte)var0;
            if ((91 ^ 94) != 0) ** GOTO lbl61
            return;
lbl-1000:
            // 1 sources

            {
                if ((fh.var_short_arr_if[var1_1] != fh.var_short_arr_if[var1_1 + fh.var_short_if])) {
                    if ((var2_2 != 1)) {
                        v6 = MenuChinhAvatar.ai;
                        if ("  ".length() < " ".length()) {
                            return;
                        }
                    } else {
                        v6 = "thoat";
                    }
                    fh.cfr_renamed_1(v6, fh.int_do(var0) + 3, fh.int_if(var0) + ((var1_1 - var0) / fh.var_short_if + 1) * fh.var_int_int / 2);
                    return;
                }
                var1_1 = (byte)(var1_1 + fh.var_short_if);
lbl61:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_short_arr_if.length))
            }
        }
    }

    private static boolean cfr_renamed_7(int n) {
        bm bm2 = (bm)var_java_util_Vector_case.elementAt(n);
        if ((bm2.var_byte_if != 4) && (bm2 != AngelChip.duLieuNguoiChoi) && (bm2.var_byte_if != 6)) {
            int n2;
            int n3 = Math.abs(bm2.cfr_renamed_2 - ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2) / var_int_int;
            if ((bm2.var_byte_if == 7)) {
                n2 = fh.cfr_renamed_10 << 1;
                if ("  ".length() < -" ".length()) {
                    return ((135 + 103 - 50 + 3 ^ 97 + 99 - 183 + 167) & (48 + 53 - 93 + 156 ^ 169 + 145 - 269 + 130 ^ -" ".length())) != 0;
                }
            } else {
                n2 = fh.cfr_renamed_10;
            }
            if ((n3 < n2)) {
                int n4;
                int n5 = Math.abs(bm2.cfr_renamed_3 - ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3) / var_int_int;
                if ((bm2.var_byte_if == 7)) {
                    n4 = fh.cfr_renamed_10 << 1;
                    if ("   ".length() == 0) {
                        return ((0xBC ^ 0xB3) & ~(0x16 ^ 0x19)) != 0;
                    }
                } else {
                    n4 = fh.cfr_renamed_10;
                }
                if ((n5 < n4)) {
                    if (!(bm2.var_byte_if == 0) || fh.cfr_renamed_8(((DuLieuNguoiChoi)bm2).dangChayAuto ? 1 : 0)) {
                        var_bm_do = bm2;
                    }
                    if ((bm2.var_byte_if == 0) && fh.cfr_renamed_8(((DuLieuNguoiChoi)bm2).dangChayAuto ? 1 : 0)) {
                        go_0.var_ef_if = (DuLieuNguoiChoi)var_java_util_Vector_case.elementAt(n);
                    }
                    return 1;
                }
            }
        }
        return 0;
    }

            public static int int_if(int n, int n2) {
        if (!(n >= 0) || !(n <= var_short_if * var_int_int) || !(n2 / var_int_int * var_short_if + n / var_int_int >= 0) || (n2 / var_int_int * var_short_if + n / var_int_int >= var_short_arr_do.length)) {
            return -2;
        }
        return var_short_arr_do[n2 / var_int_int * var_short_if + n / var_int_int];
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_4() {
        block5: {
            if ((fh.var_bm_do == null)) {
                return;
            }
            var0 = 0;
            var1_1 = fh.var_java_util_Vector_case.size();
            var2_2 = 0;
            if (-"   ".length() < 0) ** GOTO lbl18
            return;
lbl-1000:
            // 1 sources

            {
                var3_3 = (bm)fh.var_java_util_Vector_case.elementAt(var2_2);
                if ((var3_3.var_byte_if != 4) && (var3_3 == fh.var_bm_do)) {
                    var0 = var2_2;
                    if (" ".length() != 0) break;
                    return;
                }
                ++var2_2;
lbl18:
                // 2 sources

                ** while (!fh.cfr_renamed_3((int)var2_2, (int)var1_1))
            }
lbl19:
            // 2 sources

            fh.var_bm_do = null;
            var2_2 = var0 + 1;
            if (-(74 + 95 - 152 + 154 ^ 41 + 70 - -12 + 52) <= 0) ** GOTO lbl27
            return;
            while (fh.cfr_renamed_8((int)fh.cfr_renamed_7(var2_2))) {
                ++var2_2;
lbl27:
                // 2 sources

                if (!(var2_2 >= var1_1)) continue;
            }
            if (!(fh.var_bm_do == null)) break block5;
            var2_2 = 0;
            if (null == null) ** GOTO lbl36
            return;
            while (fh.cfr_renamed_8((int)fh.cfr_renamed_7(var2_2))) {
                ++var2_2;
lbl36:
                // 2 sources

                if (!(var2_2 > var0)) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_8() {
        this.var_fs_arr_do = null;
        if ((fh.var_byte_if == 1)) {
            return;
        }
        this.var_fs_arr_do = new fs[4];
        var1_1 = 0;
        if ("   ".length() == "   ".length()) ** GOTO lbl14
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = fm.fm_do().cfr_renamed_3 + hg.int_new(GameCanvas.soLuongKhoa / 20 + 5) * 20;
            var3_3 = -110 - hg.int_new(3) * 10;
            this.var_fs_arr_do[var1_1] = new fs(var2_2, var3_3);
            ++var1_1;
lbl14:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var1_1, (int)this.var_fs_arr_do.length))
        }
lbl15:
        // 1 sources

        hg.void_do();
    }

        public static boolean boolean_if(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != -1) && (n != 108) && (n != 109) && (n != 57) && (n != 62) && (n != 0) && (n != 1) && (n != 2) && (n != 3) && (n != 4) && (n != 5) && (n != 6) && (n != 7) && (n != 8) && (n != 12) && (n != 11) && (n != 14) && (n != 15) && (n != 16) && (n != 13) && (n != 25) && (n != 24) && (n != 52) && (n != 53) && (n != 9) && (n != 58) && (n != 63) && (n != 59) && (n != 64) && (n != 56) && (n != 21) && (n != 68) && (n != 69) && (n != 70) && (n != 17) && (n != 18) && (n != 51) && (n != 71) && (n != 95) && (n != 96) && (n != 107) && (n != 10) && !(n == 19))) {
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public static void (byte var0 != null) {
        var1_1 = 0;
        if (-"  ".length() <= 0) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            ((bR)GameCanvas.var_java_util_Vector_if.elementAt((int)var1_1)).dangChayAuto = 1;
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var1_1, (int)GameCanvas.var_java_util_Vector_if.size()))
        }
lbl9:
        // 1 sources

        if ((var0 != -1)) {
            var1_2 = new ft(var0, 0);
            GameCanvas.var_java_util_Vector_if.addElement(var1_2);
        }
        fh.var_byte_do = var0;
    }

    public fh() {
        var_fl_0_do = new fl_0(MenuChinhAvatar.cfr_renamed_43, new cm_0());
        cfr_renamed_30 = hg.int_new(3);
        var_int_int = 24;
        e.void_do(MenuChinhAvatar.bE);
        e.javax_microedition_lcdui_Image_do("den");
        var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("s0");
        if ((GameCanvas.var_boolean_try)) {
            if ((GameCanvas.cfr_renamed_12 == 0)) {
                var_cu_0_if = new cu_0(e.javax_microedition_lcdui_Image_do("focus"), 21 * dF.cfr_renamed_12, 15 * dF.cfr_renamed_12);
                if (" ".length() <= 0) {
                    throw null;
                }
            } else {
                var_cu_0_if = new cu_0(e.javax_microedition_lcdui_Image_do("focus"), 32 * dF.cfr_renamed_12, 11 * dF.cfr_renamed_12);
            }
            var_fs_do = new fs();
        }
        e.cfr_renamed_1();
    }

    public final void (Graphics graphics >= 0) {
        Graphics graphics2 = graphics;
        fh fh2 = this;
        this.cfr_renamed_15 = 0;
        fh2.cfr_renamed_18 = 0;
        fh2.cfr_renamed_21 = 0;
        while (!(fh2.cfr_renamed_15 >= var_java_util_Vector_case.size()) || !(fh2.cfr_renamed_18 >= var_java_util_Vector_char.size()) || (fh2.cfr_renamed_21 < var_java_util_Vector_int.size())) {
            fh2.var_bm_if = null;
            fh2.var_bm_for = null;
            fh2.var_bm_int = null;
            if ((fh2.cfr_renamed_15 < var_java_util_Vector_case.size())) {
                fh2.var_bm_int = (bm)var_java_util_Vector_case.elementAt(fh2.cfr_renamed_15);
            }
            if ((fh2.cfr_renamed_18 < var_java_util_Vector_char.size())) {
                fh2.var_bm_for = (bm)var_java_util_Vector_char.elementAt(fh2.cfr_renamed_18);
            }
            if ((fh2.cfr_renamed_21 < var_java_util_Vector_int.size())) {
                fh2.var_bm_if = (gb_0)var_java_util_Vector_int.elementAt(fh2.cfr_renamed_21);
            }
            if (!(!fh.cfr_renamed_1((Object)fh2.var_bm_int) || fh.cfr_renamed_1((Object)fh2.var_bm_for) && !(fh2.var_bm_int.cfr_renamed_3 < fh2.var_bm_for.cfr_renamed_3) || fh.cfr_renamed_1((Object)fh2.var_bm_if) && !(fh2.var_bm_int.cfr_renamed_3 < fh2.var_bm_if.cfr_renamed_3))) {
                fh2.var_bm_int.cfr_renamed_1(graphics2);
                fh2.cfr_renamed_15 += 1;
                if ("  ".length() >= 0) continue;
                return;
            }
            if (fh.cfr_renamed_1((Object)fh2.var_bm_for) && (!fh.cfr_renamed_1((Object)fh2.var_bm_if) || (fh2.var_bm_for.cfr_renamed_3 < fh2.var_bm_if.cfr_renamed_3))) {
                fh2.var_bm_for.cfr_renamed_1(graphics2);
                fh2.cfr_renamed_18 += 1;
                return;
            }
            if (!fh.cfr_renamed_1((Object)fh2.var_bm_if)) continue;
            fh2.var_bm_if.cfr_renamed_1(graphics2);
            fh2.cfr_renamed_21 += 1;
            if ((0x35 ^ 0x31) > 0) continue;
            return;
        }
        fh2 = graphics;
        if (!(GameCanvas.cfr_renamed_12 == 0) || (var_bm_do == null)) {
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            int n;
            int n2 = fh.var_bm_do.cfr_renamed_2 * dF.cfr_renamed_12;
            int n3 = fh.var_bm_do.cfr_renamed_3;
            if ((fh.var_bm_do.var_byte_if == 7)) {
                n = 10;
                if (" ".length() < " ".length()) {
                    return;
                }
            } else {
                n = fh.var_bm_do.cfr_renamed_4;
            }
            fh2.drawImage(go_0.var_javax_microedition_lcdui_Image_if, n2, (n3 - n) * dF.cfr_renamed_12 - cfr_renamed_16 / 2, 3);
        }
        if ((fj_0.dangChayAuto)) {
            var_fj_0_do.cfr_renamed_1(graphics);
        }
    }

            private static void cfr_renamed_13() {
        mangSoNguyen = new int[168];
        -1 = -" ".length();
        26 = 57 + 54 - 70 + 146 ^ 135 + 53 - 143 + 116;
        0 = (0xD2 ^ 0xA7 ^ (0x55 ^ 0xE)) & (171 + 24 - 40 + 17 ^ 67 + 111 - 147 + 99 ^ -" ".length());
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        4 = 0x7B ^ 0x44 ^ (0x30 ^ 0xB);
        5 = 0x3F ^ 0x3A;
        6 = 0xEF ^ 0xA0 ^ (0x4D ^ 4);
        7 = 0x5B ^ 0x5C;
        8 = 0xA3 ^ 0xAB;
        11 = 127 + 129 - 98 + 28 ^ 68 + 73 - 101 + 137;
        12 = 8 ^ 0x36 ^ (0x46 ^ 0x74);
        13 = 0x49 ^ 0x44;
        14 = 0xA0 ^ 0xAE;
        15 = 49 + 108 - 47 + 74 ^ 94 + 131 - 168 + 126;
        16 = 0x65 ^ 0x76 ^ "   ".length();
        17 = 0xB7 ^ 0xA6;
        18 = 0x22 ^ 0x30;
        19 = 0x21 ^ 0x5D ^ (0x59 ^ 0x36);
        20 = 124 + 132 - 216 + 132 ^ 80 + 116 - 88 + 76;
        24 = 0xDD ^ 0xC5;
        25 = 0x58 ^ 0x41;
        15853390 = -(0x48 ^ 0x5A) & (0xFFFFE77F & 0xF1FFDF);
        15006199 = 0xFFFFF9FF & 0xE4FFF7;
        8183509 = -(0xFFFFF533 & 0x2BCF) & (0xFFFFFFF7 & 0x7CFFDF);
        12254198 = -"  ".length() & (0xFFFFFFF7 & 0xBAFBFF);
        6143735 = -(0xFFFFC559 & 0x7BA7) & (0xFFFFFFFF & 0x5DFFF7);
        21 = 0x37 ^ 0x22;
        32 = 123 + 128 - 198 + 101 ^ 160 + 138 - 195 + 83;
        10 = 0x73 ^ 0x79;
        100 = 3 + 133 - 50 + 146 ^ 114 + 28 - 30 + 28;
        30 = 0x2E ^ 0x6A ^ (0x37 ^ 0x6D);
        50 = 138 + 136 - 224 + 140 ^ 54 + 71 - 119 + 134;
        -110 = -(0xCA ^ 0xA9 ^ (0x5A ^ 0x57));
        360 = -(0xFFFFA4DF & 0x7BB7) & (0xFFFFE1FE & 0x3FFF);
        -125 = -(0xD4 ^ 0xA9);
        108 = 0x75 ^ 0x19;
        109 = 0x3A ^ 0x57;
        57 = 0xBA ^ 0x83;
        62 = 0x60 ^ 0x5E;
        52 = 164 + 151 - 303 + 159 ^ 68 + 97 - 83 + 77;
        53 = 0x8E ^ 0xBB;
        9 = 0xA5 ^ 0xAC;
        58 = 0x6C ^ 0x56;
        63 = 0xAC ^ 0x93;
        59 = 0x11 ^ 0x2A;
        64 = 0xBB ^ 0x8C ^ (4 ^ 0x73);
        56 = 0x97 ^ 0xA8 ^ (0x17 ^ 0x10);
        68 = 48 + 108 - 102 + 77 ^ 94 + 114 - 206 + 197;
        69 = 34 + 125 - 153 + 129 ^ 161 + 93 - 126 + 66;
        70 = " ".length() ^ (0xEC ^ 0xAB);
        51 = 0xB5 ^ 0x86;
        71 = 0x7C ^ 0x27 ^ (0x85 ^ 0x99);
        95 = 0x16 ^ 0x46 ^ (2 ^ 0xD);
        96 = 0xB ^ 0x6B;
        107 = 0xDA ^ 0xB1;
        55 = 128 + 81 - 202 + 145 ^ 141 + 118 - 107 + 23;
        93 = 0x95 ^ 0x80 ^ (0x6C ^ 0x24);
        78 = 0xC9 ^ 0x87;
        89 = 49 + 131 - 172 + 245 ^ 89 + 136 - 185 + 124;
        27 = 113 + 147 - 193 + 109 ^ 123 + 156 - 150 + 42;
        28 = 0x1E ^ 2;
        29 = 0x56 ^ 0x76 ^ (0xAC ^ 0x91);
        84 = 0xDA ^ 0xA7 ^ (0x3B ^ 0x12);
        85 = 0x3D ^ 0x68;
        86 = 0x53 ^ 0x3F ^ (0x18 ^ 0x22);
        83 = 0xE9 ^ 0xBA;
        87 = 0x5C ^ 0xB;
        54 = 2 ^ 0x17 ^ (0xA ^ 0x29);
        67 = 0x19 ^ 0x7F ^ (0x39 ^ 0x1C);
        81 = 54 + 28 - 27 + 181 ^ 65 + 142 - 103 + 85;
        79 = 0x1E ^ 0x51;
        92 = 0xD1 ^ 0xB7 ^ (6 ^ 0x3C);
        94 = 0x6D ^ 0x64 ^ (0xCB ^ 0x9C);
        97 = 0x60 ^ 1;
        98 = 218 + 121 - 111 + 1 ^ 58 + 43 - 80 + 114;
        103 = 0x6A ^ 0x75 ^ (2 ^ 0x7A);
        101 = 0xA ^ 5 ^ (0x30 ^ 0x5A);
        104 = 0x49 ^ 0x21;
        23 = 0x64 ^ 0x3D ^ (0x1D ^ 0x53);
        -2 = -"  ".length();
        -23 = -(140 + 2 - 77 + 86 ^ 67 + 101 - 83 + 43);
        -105 = -(0xD6 ^ 0xBF);
        88 = 0xF8 ^ 0xC0 ^ (0xEA ^ 0x8A);
        210 = 171 + 103 - 180 + 116;
        41 = 0xC ^ 0x25;
        33 = 116 + 117 - 157 + 154 ^ 41 + 186 - 76 + 48;
        38 = 0xC ^ 0x2A;
        36 = 0xEA ^ 0xA6 ^ (0xFB ^ 0x93);
        255 = (0x74 ^ 0x42) + (0x46 ^ 0x50) - -(63 + 22 - 38 + 115) + (0x46 ^ 0x57);
        80 = 0x34 ^ 0x6A ^ (0x6E ^ 0x60);
        65 = 130 + 47 - 112 + 66 ^ 11 + 137 - 92 + 138;
        -100 = -(0x42 ^ 0x2A ^ (0x4B ^ 0x47));
        2480 = -(0xFFFFF1EA & 0x3E57) & (0xFFFFBBF7 & 0x7DF9);
        61 = 0x6C ^ 0x51;
        1084 = 0xFFFFB7FC & 0x4C3F;
        60 = 119 + 32 - 56 + 46 ^ 53 + 112 - 110 + 122;
        1085 = -(0xFFFFF1BB & 0x5FC5) & (0xFFFFFDFF & 0x57BD);
        -4 = -(0x93 ^ 0x97);
        -5 = -(0x91 ^ 0x97 ^ "   ".length());
        -3 = -"   ".length();
        -6 = -(0x96 ^ 0x90);
        120 = 0x55 ^ 0x5C ^ (0xEC ^ 0x9D);
        123 = 0xF9 ^ 0x96 ^ (0x18 ^ 0xC);
        114 = 0x82 ^ 0xB9 ^ (0xD ^ 0x44);
        119 = 0xF0 ^ 0xB7 ^ (0xF7 ^ 0xC7);
        44 = 0xB2 ^ 0x9E;
        111 = 0x76 ^ 0x19;
        112 = 130 + 109 - 228 + 200 ^ 130 + 58 - 57 + 32;
        845 = -(0xFFFFFD37 & 0x36FB) & (0xFFFFB77F & Short.MAX_VALUE);
        844 = 0xFFFFDBCD & 0x277E;
        830 = -(0xFFFFEBCF & 0x7CF1) & (0xFFFFEFFF & 0x7BFE);
        828 = -(0xFFFF9C9B & 0x6FE5) & (0xFFFFBFBD & 0x4FFE);
        836 = -(0xFFFFFF27 & 0x7CF9) & (0xFFFFFFED & 0x7F76);
        829 = 0xFFFFBB3F & 0x47FD;
        129 = 95 + 50 - 132 + 116;
        130 = (0x73 ^ 4) + (0xF0 ^ 0xBF) - (0x3D ^ 0x78) + " ".length();
        840 = 0xFFFFCFFE & 0x3349;
        831 = 0xFFFFE73F & 0x1BFF;
        841 = 0xFFFFD7FF & 0x2B49;
        47 = 0x42 ^ 0x6D;
        832 = -(0xFFFFEAFF & 0x35BC) & (0xFFFFFBFF & 0x27FB);
        147 = 94 + 21 - 24 + 42 + (0xA1 ^ 0x9A) - (0xC0 ^ 0xBD) + (0x43 ^ 0x13);
        833 = -(0xFFFFACBF & 0x7BFF) & (0xFFFFFFFF & 0x2BFF);
        48 = 0x94 ^ 0xA4;
        148 = 64 + 125 - 166 + 125;
        834 = -(0xFFFFF8FE & 0x67BB) & (0xFFFFEBFB & 0x77FF);
        842 = -(0xFFFFDEBD & 0x6DD7) & (0xFFFFFFDF & 0x4FFE);
        843 = 0xFFFFBFFB & 0x434F;
        835 = -(0xFFFFFEF7 & 0x6D19) & (0xFFFFEF77 & 0x7FDB);
        848 = -(0xFFFFDF6F & 0x789B) & (0xFFFFFB7F & 0x5FDA);
        43 = 0x6C ^ 0x47;
        37 = 0x80 ^ 0xA5;
        837 = -(0xFFFFCCBB & 0x7BC5) & (0xFFFFEFDF & 0x5BE5);
        838 = -(0xFFFFFCFB & 0x5B9D) & (0xFFFFDFFE & 0x7BDF);
        77 = 0x52 ^ 0x1F;
        46 = 0x16 ^ 0x38;
        39 = 0x52 ^ 0x76 ^ "   ".length();
        975 = -(0xFFFFD617 & 0x39F9) & (0xFFFF9BFF & 0x77DF);
        974 = 0xFFFFCBFE & 0x37CF;
        -10 = -(0xC ^ 6);
        1029 = -(0xFFFFFDFF & 0x6AA9) & (0xFFFFFEAF & 0x6DFD);
        99 = 0xDA ^ 0xB9;
        1034 = -(0xFFFFFBFE & 0x6FD3) & (0xFFFFFFDF & 0x6FFB);
        1032 = 0xFFFF9D09 & 0x66FE;
        106 = 0x46 ^ 0x2C;
        1030 = 0xFFFF9C46 & 0x67BF;
        102 = 0xDD ^ 0xBB;
        1037 = -(0xFFFFD7DB & 0x7B75) & (0xFFFFD7DD & 0x7F7F);
        1035 = 0xFFFFB6BB & 0x4D4F;
        1033 = 0xFFFFCC39 & 0x37CF;
        105 = 0xA9 ^ 0xC0;
        1036 = 0xFFFFCF5E & 0x34AD;
        1031 = 0xFFFF8F17 & 0x74EF;
        1075 = -(0xFFFFBA5F & 0x7DAD) & (0xFFFFBFFF & 0x7C3F);
        1094 = 0xFFFFD777 & 0x2CCE;
        110 = 159 + 1 - 132 + 166 ^ 46 + 141 - 51 + 36;
        846 = 0xFFFFEFDF & 0x136E;
        -20 = -(0x4C ^ 0x58);
        66 = 0x34 ^ 0x76;
        847 = 0xFFFFA35F & 0x5FEF;
        150 = (0x30 ^ 0x49) + (0x10 ^ 0x32) - (0x18 ^ 0x78) + (0x53 ^ 8);
        139 = 66 + 46 - 56 + 83;
        152 = (0x63 ^ 0x6B) + (46 + 10 - -43 + 30) - (0x61 ^ 0x2C) + (0x39 ^ 0x65);
        151 = 0 + 112 - 51 + 90;
        184 = 173 + 9 - 167 + 169;
        185 = (0x23 ^ 0x64) + (0x38 ^ 0x19) - (0x75 ^ 0x41) + (37 + 25 - 38 + 109);
    }

                /*
     * Unable to fully structure code
     */
    public static dH dH_do(int var0) {
        var1_1 = 0;
        if (-" ".length() < (126 ^ 122)) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (bm)fh.var_java_util_Vector_case.elementAt(var1_1);
            if ((var2_2.var_byte_if == 4) && fh.cfr_renamed_5(((dH)var2_2).duLieuNguoiChoi.cfr_renamed_9, var0)) {
                return (dH)var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!fh.cfr_renamed_3((int)var1_1, (int)fh.var_java_util_Vector_case.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Vector (Vector vector != null) {
        try {
            int n = vector.size();
            int n2 = 0;
            if ("  ".length() != "  ".length()) {
                return null;
            }
            block2: while (true) {
                if ((n2 >= n - 1)) {
                    break;
                }
                bm bm2 = (bm)vector.elementAt(n2);
                int n3 = n2 + 1;
                while (true) {
                    if ((n3 >= n)) {
                        ++n2;
                        continue block2;
                    }
                    bm bm3 = (bm)vector.elementAt(n3);
                    if ((bm2.cfr_renamed_3 > bm3.cfr_renamed_3)) {
                        vector.setElementAt(bm2, n3);
                        vector.setElementAt(bm3, n2);
                        bm2 = bm3;
                    }
                    ++n3;
                }
                break;
            }
        }
        catch (Exception exception) {
            return vector;
        }
        if (((0x9E ^ 0x95 ^ (0x39 ^ 0x3E)) & (0x30 ^ 0x63 ^ (0x9A ^ 0xC5) ^ -" ".length())) == 0) return vector;
        return null;
    }

    public static boolean cfr_renamed_2(int n) {
        if ((n >= -125) && (n < 0)) {
            return 1;
        }
        if (!((n != 55) && (n != 93) && (n != 78) && (n != 89) && (n != 27) && (n != 28) && (n != 29) && (n != 84) && (n != 85) && (n != 86) && (n != 83) && (n != 87) && (n != 54) && (n != 71) && (n != 52) && (n != 94) && (n != 95) && (n != 96) && (n != 97) && (n != 98) && (n != 100) && (n != 103) && (n != 101) && (n != 104) && !(n == 23))) {
            return 1;
        }
        return 0;
    }
}

