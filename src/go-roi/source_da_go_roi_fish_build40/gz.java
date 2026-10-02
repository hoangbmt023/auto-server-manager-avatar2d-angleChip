/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gz
implements fz_0 {
    private char var_char_do;
    private byte[] var_byte_arr_do;
    private Image var_javax_microedition_lcdui_Image_do;
    private static int[] mangSoNguyen;
    private int soLuong;
    private String chuoiGiaTri;
    private char cfr_renamed_0;
    private static String[] var_java_lang_String_arr_do;

    public final int int_do() {
        return this.soLuong;
    }

    /*
     * Unable to fully structure code
     */
    public final int (String var1_1 == 0) {
        var2_2 = 0;
        var3_3 = 0;
        if ("  ".length() >= -" ".length()) ** GOTO lbl20
        return (27 ^ 35) & ~(3 ^ 59);
lbl-1000:
        // 1 sources

        {
            this.cfr_renamed_0 = var1_1.charAt(var3_3);
            if ((this.cfr_renamed_0 == 32)) {
                var2_2 += this.var_byte_arr_do[0] >> 1;
                if ("  ".length() < 0) {
                    return (53 ^ 114 ^ (63 ^ 103)) & (30 ^ 83 ^ (114 ^ 32) ^ -" ".length());
                }
            } else {
                var4_4 = this.chuoiGiaTri.indexOf(this.cfr_renamed_0);
                if ((var4_4 == -1)) {
                    var4_4 = 0;
                }
                var2_2 += this.var_byte_arr_do[var4_4];
            }
            ++var3_3;
lbl20:
            // 2 sources

            ** while (!gz.cfr_renamed_3((int)var3_3, (int)var1_1.length()))
        }
lbl21:
        // 1 sources

        return var2_2;
    }

    static {
        gz.void_do();
        String[] stringArray = new String[8];
        stringArray[0] = "normal";
        stringArray[1] = "border";
        stringArray[2] = "arial";
        stringArray[3] = "black";
        stringArray[4] = "number";
        stringArray[5] = "smallRed";
        stringArray[6] = "smallYellow";
        stringArray[7] = "big";
        var_java_lang_String_arr_do = stringArray;
    }

        /*
     * Unable to fully structure code
     */
    public final String (String var1_1, String var2_2, String var3_3 == 0) {
        var4_4 = new StringBuffer();
        var5_5 = var1_1.indexOf(var2_2);
        var6_6 = 0;
        var7_7 = var2_2.length();
        if (((57 ^ 7) & ~(61 ^ 3)) <= " ".length()) ** GOTO lbl15
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4.append(var1_1.substring(var6_6, var5_5)).append(var3_3);
            var6_6 = var5_5 + var7_7;
            var5_5 = var1_1.indexOf(var2_2, var6_6);
lbl15:
            // 2 sources

            ** while (!gz.cfr_renamed_2((int)var5_5, (int)-1))
        }
lbl16:
        // 1 sources

        var4_4.append(var1_1.substring(var6_6, var1_1.length()));
        return var4_4.toString();
    }

    private static void void_do() {
        mangSoNguyen = new int[13];
        8 = 129 + 68 - 168 + 118 ^ 110 + 128 - 95 + 12;
        0 = (0x5E ^ 0x4E ^ (0x81 ^ 0xB7)) & (47 + 119 - 152 + 136 ^ 51 + 115 - 134 + 144 ^ -" ".length());
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        4 = 24 + 44 - -87 + 9 ^ 8 + 141 - 34 + 45;
        5 = 0xF9 ^ 0x9C ^ (0x6C ^ 0xC);
        6 = 110 + 41 - 123 + 152 ^ 43 + 107 - 96 + 124;
        7 = 80 + 26 - 73 + 133 ^ 138 + 25 - 125 + 123;
        32 = 160 + 170 - 266 + 112 ^ 140 + 89 - 98 + 13;
        -1 = -" ".length();
        20 = 66 + 121 - 45 + 29 ^ 38 + 134 - -4 + 15;
        10 = 0x20 ^ 0x66 ^ (0x63 ^ 0x2F);
    }

            /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, String var2_2, int var3_3, int var4_4, int var5_5 == 0) {
        var6_6 = var2_2.length();
        if ((var5_5 == 0)) {
            var5_5 = var3_3;
            if (((76 ^ 30) & ~(117 ^ 39)) != 0) {
                return;
            }
        } else if ((var5_5 == 1)) {
            var5_5 = var3_3 - this.cfr_renamed_1(var2_2);
            if (-" ".length() > 0) {
                return;
            }
        } else {
            var5_5 = var3_3 - (this.cfr_renamed_1(var2_2) >> 1);
        }
        var7_7 = 0;
        if ("   ".length() >= "  ".length()) ** GOTO lbl37
        return;
lbl-1000:
        // 1 sources

        {
            this.var_char_do = var2_2.charAt(var7_7);
            if ((this.var_char_do == 32)) {
                var5_5 += this.var_byte_arr_do[0] >> 1;
                if (((246 ^ 159 ^ (251 ^ 152)) & (251 ^ 193 ^ (57 ^ 9) ^ -" ".length())) != 0) {
                    return;
                }
            } else {
                var3_3 = this.chuoiGiaTri.indexOf(this.var_char_do);
                if ((var3_3 == -1)) {
                    var3_3 = 0;
                }
                if ((var3_3 >= 0)) {
                    var1_1.drawRegion(this.var_javax_microedition_lcdui_Image_do, 0, var3_3 * this.soLuong, this.var_javax_microedition_lcdui_Image_do.getWidth(), this.soLuong, 0, var5_5, var4_4, 20);
                }
                var5_5 += this.var_byte_arr_do[var3_3];
            }
            ++var7_7;
lbl37:
            // 2 sources

            ** while (!gz.cfr_renamed_3((int)var7_7, (int)var6_6))
        }
lbl38:
        // 1 sources

    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public gz(int n) {
        try {
            DataInputStream dataInputStream = new DataInputStream(hg.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/font/" + var_java_lang_String_arr_do[n]));
            this.chuoiGiaTri = dataInputStream.readUTF();
            this.var_byte_arr_do = new byte[this.chuoiGiaTri.length()];
            int n2 = 0;
            while (true) {
                if ((n2 >= this.var_byte_arr_do.length)) {
                    this.soLuong = dataInputStream.readByte();
                    e.void_do(MenuChinhAvatar.bw);
                    this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do(String.valueOf(n));
                    e.cfr_renamed_1();
                    return;
                }
                this.var_byte_arr_do[n2] = dataInputStream.readByte();
                ++n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Vector java_util_Vector_do(String var1_1, int var2_2) {
        block9: {
            var3_3 = new Vector<String>();
            var4_4 = var1_1.length();
            if ((var4_4 <= 1)) {
                var5_5 = new Vector<String>();
                var5_5.addElement(var1_1);
                return var5_5;
            }
            var5_6 = "";
            var6_8 = 0;
            var7_9 = 0;
            if (" ".length() >= 0) ** GOTO lbl24
            return null;
            {
                block10: {
                    var5_6 = String.valueOf(var5_6) + var1_1.charAt(var7_9);
                    if (!(var1_1.charAt(++var7_9) != 10)) ** GOTO lbl27
                    if ((var7_9 >= var4_4 - 1)) {
                        var7_9 = var4_4 - 1;
                        if ("  ".length() <= " ".length()) {
                            return null;
                        } else {
                            ** GOTO lbl23
                        }
                    }
                    break block10;
lbl23:
                    // 2 sources

                    ** GOTO lbl27
                }
                do {
                    if (!(this.cfr_renamed_1(var5_6) >= var2_2)) continue block0;
lbl27:
                    // 3 sources

                    if ((var7_9 != var4_4 - 1) && (var1_1.charAt(var7_9 + 1) != 32)) {
                        var5_7 = var7_9;
                        while ((var1_1.charAt(var7_9 + 1) != 10) && (!(var1_1.charAt(var7_9 + 1) == 32) || (var1_1.charAt(var7_9) == 32)) && (var7_9 != var6_8)) {
                            --var7_9;
                            if ((122 + 169 - 283 + 166 ^ 90 + 126 - 70 + 24) >= " ".length()) continue;
                            return null;
                        }
                        if ((var7_9 == var6_8)) {
                            var7_9 = var5_7;
                        }
                    }
                    var3_3.addElement(var1_1.substring(var6_8, var7_9 + 1));
                    if (!(var7_9 != var4_4 - 1)) break block9;
                    var6_8 = var7_9 + 1;
                    if (((4 ^ 16 ^ (103 ^ 96)) & (88 + 84 - -12 + 24 ^ 59 + 124 - 31 + 43 ^ -" ".length())) == 0) ** GOTO lbl45
                    return null;
lbl-1000:
                    // 1 sources

                    {
                        ++var6_8;
lbl45:
                        // 2 sources

                        ** while (gz.cfr_renamed_0((int)var6_8, (int)(var4_4 - 1)) && !gz.cfr_renamed_0((int)var1_1.charAt((int)var6_8), (int)32))
                    }
lbl46:
                    // 1 sources

                    if (!(var6_8 != var4_4 - 1)) break block9;
                    var7_9 = var6_8;
                    var5_6 = "";
                    } while (null == null);
            }
            return null;
        }
        return var3_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String[] java_lang_String_arr_do(String object, int n) {
        object = this.java_util_Vector_do((String)object, n);
        n = ((Vector)object).size();
        String[] stringArray = new String[n];
        int n2 = 0;
        while (!(n2 >= n)) {
            stringArray[n2] = (String)((Vector)object).elementAt(n2);
            ++n2;
        }
        return stringArray;
    }

        }

