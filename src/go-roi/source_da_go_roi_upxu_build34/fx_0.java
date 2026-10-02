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

/*
 * Renamed from fX
 */
public final class fx_0
implements ew {
    private int soLuong;
    private Image var_javax_microedition_lcdui_Image_do;
    private char var_char_do;
    private static String[] var_java_lang_String_arr_do;
    private byte[] var_byte_arr_do;
    private char cfr_renamed_1;
    private static int[] mangSoNguyen;
    private String chuoiGiaTri;

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

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, String var2_2, int var3_3, int var4_4, int var5_5 >= 0) {
        var6_6 = var2_2.length();
        if ((var5_5 == 0)) {
            var5_5 = var3_3;
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else if ((var5_5 == 1)) {
            var5_5 = var3_3 - this.cfr_renamed_0(var2_2);
            if ("  ".length() < 0) {
                return;
            }
        } else {
            var5_5 = var3_3 - (this.cfr_renamed_0(var2_2) >> 1);
        }
        var7_7 = 0;
        if ("   ".length() > -" ".length()) ** GOTO lbl37
        return;
lbl-1000:
        // 1 sources

        {
            this.cfr_renamed_1 = var2_2.charAt(var7_7);
            if ((this.cfr_renamed_1 == 32)) {
                var5_5 += this.var_byte_arr_do[0] >> 1;
                if (" ".length() < " ".length()) {
                    return;
                }
            } else {
                var3_3 = this.chuoiGiaTri.indexOf(this.cfr_renamed_1);
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

            ** while (!fx_0.cfr_renamed_0((int)var7_7, (int)var6_6))
        }
lbl38:
        // 1 sources

    }

    public final int int_do() {
        return this.soLuong;
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
            if (null == null) ** GOTO lbl24
            return null;
            {
                block10: {
                    var5_6 = String.valueOf(var5_6) + var1_1.charAt(var7_9);
                    if (!(var1_1.charAt(++var7_9) != 10)) ** GOTO lbl27
                    if ((var7_9 >= var4_4 - 1)) {
                        var7_9 = var4_4 - 1;
                        if ("  ".length() >= "   ".length()) {
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
                    if (!(this.cfr_renamed_0(var5_6) >= var2_2)) continue block0;
lbl27:
                    // 3 sources

                    if ((var7_9 != var4_4 - 1) && (var1_1.charAt(var7_9 + 1) != 32)) {
                        var5_7 = var7_9;
                        while ((var1_1.charAt(var7_9 + 1) != 10) && (!(var1_1.charAt(var7_9 + 1) == 32) || (var1_1.charAt(var7_9) == 32)) && (var7_9 != var6_8)) {
                            --var7_9;
                            return null;
                        }
                        if ((var7_9 == var6_8)) {
                            var7_9 = var5_7;
                        }
                    }
                    var3_3.addElement(var1_1.substring(var6_8, var7_9 + 1));
                    if (!(var7_9 != var4_4 - 1)) break block9;
                    var6_8 = var7_9 + 1;
                    if ("  ".length() <= "  ".length()) ** GOTO lbl45
                    return null;
lbl-1000:
                    // 1 sources

                    {
                        ++var6_8;
lbl45:
                        // 2 sources

                        ** while (fx_0.cfr_renamed_1((int)var6_8, (int)(var4_4 - 1)) && !fx_0.cfr_renamed_1((int)var1_1.charAt((int)var6_8), (int)32))
                    }
lbl46:
                    // 1 sources

                    if (!(var6_8 != var4_4 - 1)) break block9;
                    var7_9 = var6_8;
                    var5_6 = "";
                    } while ("  ".length() >= ((118 ^ 89) & ~(188 ^ 147)));
            }
            return null;
        }
        return var3_3;
    }

        /*
     * Unable to fully structure code
     */
    public final String (String var1_1, String var2_2, String var3_3 >= 0) {
        var4_4 = new StringBuffer();
        var5_5 = var1_1.indexOf(var2_2);
        var6_6 = 0;
        var7_7 = var2_2.length();
        if (((12 + 76 - 48 + 113 ^ 171 + 11 - 159 + 151) & (217 ^ 194 ^ (96 ^ 76) ^ -" ".length())) == 0) ** GOTO lbl15
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4.append(var1_1.substring(var6_6, var5_5)).append(var3_3);
            var6_6 = var5_5 + var7_7;
            var5_5 = var1_1.indexOf(var2_2, var6_6);
lbl15:
            // 2 sources

            ** while (!fx_0.cfr_renamed_4((int)var5_5, (int)-1))
        }
lbl16:
        // 1 sources

        var4_4.append(var1_1.substring(var6_6, var1_1.length()));
        return var4_4.toString();
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public fx_0(int n) {
        try {
            DataInputStream dataInputStream = new DataInputStream(gc_0.java_io_InputStream_do(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/font/" + var_java_lang_String_arr_do[n]));
            this.chuoiGiaTri = dataInputStream.readUTF();
            this.var_byte_arr_do = new byte[this.chuoiGiaTri.length()];
            int n2 = 0;
            if ((0xAA ^ 0xC0 ^ (0x59 ^ 0x37)) <= -" ".length()) {
                throw null;
            }
            while (true) {
                if ((n2 >= this.var_byte_arr_do.length)) {
                    this.soLuong = dataInputStream.readByte();
                    ap.void_do(MenuChinhAvatar.br);
                    this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do(String.valueOf(n));
                    ap.cfr_renamed_0();
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

    private static void void_do() {
        mangSoNguyen = new int[13];
        8 = 72 + 41 - 73 + 141 ^ 2 + 29 - -9 + 149;
        0 = (0xCE ^ 0x8B) & ~(0x75 ^ 0x30);
        1 = " ".length();
        2 = "  ".length();
        3 = "   ".length();
        4 = 0x52 ^ 0x56;
        5 = 5 ^ 0;
        6 = 0xC0 ^ 0xC6;
        7 = 0x21 ^ 0x41 ^ (0xC ^ 0x6B);
        32 = 0xFC ^ 0x8D ^ (7 ^ 0x56);
        -1 = -" ".length();
        20 = 0x28 ^ 0x70 ^ (0xCF ^ 0x83);
        10 = 0x61 ^ 3 ^ (0xE4 ^ 0x8C);
    }

    /*
     * Unable to fully structure code
     */
    public final int (String var1_1 >= 0) {
        var2_2 = 0;
        var3_3 = 0;
        if (-" ".length() == -" ".length()) ** GOTO lbl20
        return (143 + 38 - 127 + 90 ^ 137 + 165 - 185 + 78) & (38 ^ 53 ^ (101 ^ 37) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            this.var_char_do = var1_1.charAt(var3_3);
            if ((this.var_char_do == 32)) {
                var2_2 += this.var_byte_arr_do[0] >> 1;
                if (-(114 ^ 0 ^ (49 ^ 71)) >= 0) {
                    return (1 ^ 101 ^ (18 ^ 112)) & (24 + 121 - 100 + 82 ^ (219 ^ 162) ^ -" ".length());
                }
            } else {
                var4_4 = this.chuoiGiaTri.indexOf(this.var_char_do);
                if ((var4_4 == -1)) {
                    var4_4 = 0;
                }
                var2_2 += this.var_byte_arr_do[var4_4];
            }
            ++var3_3;
lbl20:
            // 2 sources

            ** while (!fx_0.cfr_renamed_0((int)var3_3, (int)var1_1.length()))
        }
lbl21:
        // 1 sources

        return var2_2;
    }

                static {
        fx_0.void_do();
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
}

