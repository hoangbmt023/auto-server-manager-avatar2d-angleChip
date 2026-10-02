/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import main.AngelChip;

/*
 * Renamed from aA
 */
public final class aa_0 {
    private static int var_int_if;
    private static int soLuongKhoa;
    public static String chuoiGiaTri;
    public static Hashtable var_java_util_Hashtable_do;
    public static Hashtable var_java_util_Hashtable_if;
    private static Hashtable var_java_util_Hashtable_int;
    public static Vector var_java_util_Vector_do;
    public static Vector var_java_util_Vector_if;
    private static String tenNhanVat;
    public static Vector var_java_util_Vector_for;
    private static int var_int_int;
    public static am[] var_am_arr_do;
    private static int var_int_new;
    private static Hashtable var_java_util_Hashtable_new;
    public static k_0[] var_k_0_arr_do;
    private static Vector var_java_util_Vector_try;
    public static Vector var_java_util_Vector_int;
    public static Hashtable var_java_util_Hashtable_for;
    private static int var_int_try;
    private static int[] mangSoNguyen;
    public static int soLuong;
    public static Vector var_java_util_Vector_new;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_do() {
        DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avatarImgBig");
        long l = System.currentTimeMillis() / 86400000L;
        String string = String.valueOf((int)(l - 15340L));
        String string2 = String.valueOf(string.length());
        tenNhanVat = String.valueOf(string2) + System.currentTimeMillis() + string;
        if ((dataInputStream == null)) {
            return 0;
        }
        try {
            short s2 = dataInputStream.readShort();
            var_java_util_Vector_try = new Vector();
            int n = 0;
            while (true) {
                if ((n >= s2)) {
                    dataInputStream.close();
                    break;
                }
                hr hr2 = new hr();
                new hr().cfr_renamed_2 = dataInputStream.readShort();
                hr2.cfr_renamed_0 = dataInputStream.readShort();
                int n2 = dataInputStream.readInt();
                hr2.var_byte_arr_do = new byte[n2];
                dataInputStream.read(hr2.var_byte_arr_do);
                hr2.var_short_do = dataInputStream.readShort();
                var_java_util_Vector_try.addElement(hr2);
                ++n;
            }
        }
        catch (Exception exception) {
            aa_0.void_do("avatarImgBig");
            return 1;
        }
        if ("   ".length() > -" ".length()) return 1;
        return ((0x3E ^ 0x33) & ~(0x53 ^ 0x5E)) != 0;
    }

    public static void void_do(Vector vector) {
        var_java_util_Vector_if = vector;
    }

    /*
     * Unable to fully structure code
     */
    public static cg (int var0 < Vector var1_1) {
        var2_2 = var1_1.size();
        var3_3 = 0;
        if ("   ".length() > ((146 ^ 142 ^ (115 ^ 55)) & (16 ^ 32 ^ (91 ^ 51) ^ -" ".length()))) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = (cg)var1_1.elementAt(var3_3);
            if (aa_0.cfr_renamed_2(aa_0.am_do((short)var4_4.var_short_do).var_byte_if, var0)) {
                return var4_4;
            }
            ++var3_3;
lbl11:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)var2_2))
        }
lbl12:
        // 1 sources

        return null;
    }

    public static am am_do(short s2) {
        if ((s2 >= 2000)) {
            am am2 = (am)var_java_util_Hashtable_if.get("" + s2);
            if (aa_0.cfr_renamed_1((Object)am2)) {
                am2 = new cX();
                ((am)new cX()).cfr_renamed_3 = (short)-1;
                var_java_util_Hashtable_if.put("" + s2, am2);
                ft_0.ft_0_do().cfr_renamed_0(s2);
            }
            return am2;
        }
        return var_am_arr_do[s2];
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_5(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        aa_0.var_java_util_Vector_do = new Vector<E>();
        var2_2 = 0;
        if (((110 + 0 - -35 + 14 ^ 81 + 114 - 80 + 21) & (192 ^ 132 ^ (150 ^ 197) ^ -" ".length())) == 0) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = new ee_0();
            new ee_0().var_short_if = var0.readShort();
            var3_3.chuoiGiaTri = var0.readUTF();
            var0.readUTF();
            var3_3.mangSoNguyen[0] = var0.readInt();
            var3_3.var_byte_do = var0.readByte();
            var3_3.var_short_do = var0.readShort();
            aa_0.var_java_util_Vector_do.addElement(var3_3);
            ++var2_2;
lbl23:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl24:
        // 1 sources

    }

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void cfr_renamed_5() {
        int n = 0;
        while (!(n >= var_am_arr_do.length)) {
            if ((aa_0.var_am_arr_do[n].cfr_renamed_2 >= 0)) {
                am am2 = var_am_arr_do[aa_0.var_am_arr_do[n].cfr_renamed_2];
                am am3 = var_am_arr_do[n];
                var_am_arr_do[n].chuoiGiaTri = am2.chuoiGiaTri;
                am3.var_byte_do = am2.var_byte_do;
                am3.var_byte_if = am2.var_byte_if;
                am3.var_short_if = am2.var_short_if;
            }
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void (hr var0 != null) {
        var1_1 = Image.createImage((int)var0.var_javax_microedition_lcdui_Image_do.getWidth(), (int)var0.var_javax_microedition_lcdui_Image_do.getHeight());
        var2_2 = var1_1.getGraphics();
        var2_2.setColor(16711935);
        var2_2.fillRect(0, 0, var1_1.getWidth(), var1_1.getHeight());
        var3_3 = 0;
        if (" ".length() != "   ".length()) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            if ((var0.cfr_renamed_2 == aa_0.var_k_0_arr_do[var3_3].cfr_renamed_3)) {
                var2_2.drawRegion(var0.var_javax_microedition_lcdui_Image_do, aa_0.var_k_0_arr_do[var3_3].var_short_do * dF.cfr_renamed_12, aa_0.var_k_0_arr_do[var3_3].cfr_renamed_0 * dF.cfr_renamed_12, aa_0.var_k_0_arr_do[var3_3].cfr_renamed_4 * dF.cfr_renamed_12, aa_0.var_k_0_arr_do[var3_3].cfr_renamed_5 * dF.cfr_renamed_12, (int)dd_0.var_byte_try, (int)aa_0.var_k_0_arr_do[var3_3].var_short_do, (int)aa_0.var_k_0_arr_do[var3_3].cfr_renamed_0, 0);
            }
            ++var3_3;
lbl13:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)aa_0.var_k_0_arr_do.length))
        }
lbl14:
        // 1 sources

        var3_3 = 0;
        if ("  ".length() >= -" ".length()) ** GOTO lbl33
        return;
lbl-1000:
        // 1 sources

        {
            block5: {
                if (!(aa_0.var_am_arr_do[var3_3] != null) || !(aa_0.var_am_arr_do[var3_3].cfr_renamed_2 >= 0) || !aa_0.cfr_renamed_1((int)aa_0.var_am_arr_do[var3_3].cfr_renamed_3, 2000)) break block5;
                var4_5 = (cX)aa_0.am_do(aa_0.var_am_arr_do[var3_3].cfr_renamed_2);
                var5_6 = 0;
                if (-" ".length() <= "   ".length()) ** GOTO lbl30
                return;
lbl-1000:
                // 1 sources

                {
                    var6_7 = aa_0.var_k_0_arr_do[var4_5.var_short_arr_do[var5_6]];
                    if (aa_0.cfr_renamed_2(((o_0)aa_0.var_am_arr_do[var3_3]).cfr_renamed_1, var0.cfr_renamed_2)) {
                        var2_2.drawRegion(aa_0.hr_do((int)var0.cfr_renamed_2).var_javax_microedition_lcdui_Image_do, var6_7.var_short_do * dF.cfr_renamed_12, var6_7.cfr_renamed_0 * dF.cfr_renamed_12, var6_7.cfr_renamed_4 * dF.cfr_renamed_12, var6_7.cfr_renamed_5 * dF.cfr_renamed_12, (int)dd_0.var_byte_try, (int)var6_7.var_short_do, (int)var6_7.cfr_renamed_0, 0);
                    }
                    ++var5_6;
lbl30:
                    // 2 sources

                    ** while (!aa_0.cfr_renamed_3((int)var5_6, (int)var4_5.var_short_arr_do.length))
                }
            }
            ++var3_3;
lbl33:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)aa_0.var_am_arr_do.length))
        }
lbl34:
        // 1 sources

        var1_1 = hg.cfr_renamed_1(var1_1, -65281);
        var3_4 = new hr();
        new hr().cfr_renamed_0 = var0.cfr_renamed_0;
        var3_4.cfr_renamed_2 = var0.cfr_renamed_2;
        var3_4.var_javax_microedition_lcdui_Image_do = var1_1;
        var3_4.var_short_do = var0.var_short_do;
        aa_0.var_java_util_Hashtable_int.put("" + var3_4.cfr_renamed_2, var3_4);
        }

    /*
     * Enabled aggressive block sorting
     */
    public static cX cX_do(Vector vector, int n) {
        if ((vector != null)) {
            int n2 = 0;
            while (!(n2 >= vector.size())) {
                cg cg2 = (cg)vector.elementAt(n2);
                am am2 = aa_0.am_do(cg2.var_short_do);
                if ((cg2 != null) && aa_0.boolean_if(am2 instanceof cX) && aa_0.cfr_renamed_2(((cX)am2).var_byte_if, n)) {
                    return (cX)am2;
                }
                ++n2;
            }
        }
        return null;
    }

        public static void void_do() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(AngelChip.var_byte_do);
            dataOutputStream.writeUTF(AngelChip.cfr_renamed_2);
            hg.cfr_renamed_1("avatarSV", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void void_if() {
        block3: {
            block2: {
                if (!(aa_0.var_java_util_Hashtable_for.size() > 50)) break block2;
                var0 = aa_0.var_java_util_Hashtable_for.keys();
                if ("  ".length() != -" ".length()) ** GOTO lbl14
                return;
lbl-1000:
                // 1 sources

                {
                    var1_1 = (String)var0.nextElement();
                    var2_2 = (d_0)aa_0.var_java_util_Hashtable_for.get(var1_1);
                    if (!(var2_2.soLuong != -1) || !aa_0.cfr_renamed_4(aa_0.cfr_renamed_1(System.currentTimeMillis() / 1000L - (long)var2_2.soLuong, (long)GameCanvas.var_int_if))) continue;
                    aa_0.var_java_util_Hashtable_for.remove(var1_1);
                    lbl14:
                    // 3 sources

                    ** while (!aa_0.cfr_renamed_3((int)var0.hasMoreElements()))
                }
            }
            if (!(aa_0.var_java_util_Hashtable_do.size() > 50)) break block3;
            var0 = aa_0.var_java_util_Hashtable_do.keys();
            if ("  ".length() > " ".length()) ** GOTO lbl29
            return;
lbl-1000:
            // 1 sources

            {
                var1_1 = (String)var0.nextElement();
                var2_2 = (d_0)aa_0.var_java_util_Hashtable_do.get(var1_1);
                if (!(var2_2.soLuong != -1) || !aa_0.cfr_renamed_4(aa_0.cfr_renamed_1(System.currentTimeMillis() / 1000L - (long)var2_2.soLuong, (long)GameCanvas.var_int_if))) continue;
                aa_0.var_java_util_Hashtable_do.remove(var1_1);
                lbl29:
                // 3 sources

                ** while (!aa_0.cfr_renamed_3((int)var0.hasMoreElements()))
            }
        }
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public static void void_do(byte[] byArray) {
        soLuong -= 1;
        var_k_0_arr_do = aa_0.k_0_arr_do(byArray);
        hg.cfr_renamed_1("avatarImgData", byArray);
        aa_0.cfr_renamed_7();
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[18];
        -1 = -" ".length();
        0 = (0xB0 ^ 0x9A) & ~(0xF ^ 0x25);
        1 = " ".length();
        -2 = -"  ".length();
        15 = 0x93 ^ 0x9C;
        5 = 0xC2 ^ 0x8D ^ (0xC ^ 0x46);
        32767 = -" ".length() & (0xFFFFFFFF & Short.MAX_VALUE);
        1000 = -(0xFFFFFBC7 & 0x7C3E) & (0xFFFFFBED & Short.MAX_VALUE);
        16711935 = -(0xFFFFF74D & 0x6FB3) & (0xFFFFE7FF & 0xFF7FFF);
        2000 = 0xFFFF8FFB & 0x77D4;
        -65281 = -(-(0x47 ^ 0x1E) & (0xFFFFFF7F & 0xFFD9));
        4 = 129 + 193 - 230 + 103 ^ 93 + 130 - 61 + 37;
        2 = "  ".length();
        10 = 0x2B ^ 0x72 ^ (0xCE ^ 0x9D);
        20 = 0xB5 ^ 0xA1;
        30 = 0x4F ^ 0x51;
        40 = 0x4E ^ 0x66;
        50 = 0xED ^ 0xBA ^ (0x4B ^ 0x2E);
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8 == null) {
        if (!aa_0.boolean_if(n8) || !(GameCanvas.dangChayAuto) && !(GameCanvas.var_boolean_int)) {
            graphics.drawRegion(aa_0.hr_do((int)n).var_javax_microedition_lcdui_Image_do, n2 * dF.cfr_renamed_12, n3 * dF.cfr_renamed_12, n4 * dF.cfr_renamed_12, n5 * dF.cfr_renamed_12, n8, n6, n7, 0);
            return;
        }
        int n9 = n;
        graphics.drawRegion(((hr)aa_0.var_java_util_Hashtable_int.get((Object)new StringBuffer().append((int)n9).toString())).var_javax_microedition_lcdui_Image_do, n2 * dF.cfr_renamed_12, n3 * dF.cfr_renamed_12, n4 * dF.cfr_renamed_12, n5 * dF.cfr_renamed_12, 0, n6, n7, 0);
    }

        /*
     * Enabled aggressive block sorting
     */
    public static hm hm_do(short s2) {
        int n = 0;
        while (!(n >= var_java_util_Vector_for.size())) {
            hm hm2 = (hm)var_java_util_Vector_for.elementAt(n);
            if ((hm2.var_short_do == s2)) {
                return hm2;
            }
            ++n;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private static Vector java_util_Vector_do(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new Vector<gs_0>();
        var3_3 = 0;
        if ((105 ^ 77 ^ (229 ^ 197)) > ((19 + 24 - 40 + 173 ^ 73 + 28 - 56 + 135) & (22 + 80 - -66 + 3 ^ 72 + 165 - 117 + 55 ^ -" ".length()))) ** GOTO lbl44
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = new gs_0();
            new gs_0().cfr_renamed_4 = var0.readShort();
            var4_4.chuoiGiaTri = var0.readUTF();
            var0.readUTF();
            var4_4.cfr_renamed_5 = var0.readShort();
            var4_4.var_short_do = var0.readShort();
            var4_4.cfr_renamed_2 = var0.readByte();
            var4_4.cfr_renamed_3 = var0.readByte();
            var4_4.soLuong = var0.readShort();
            if ((var4_4.soLuong == 32767)) {
                var4_4.soLuong = -1;
            }
            if ((var4_4.soLuong >= 0)) {
                var4_4.soLuong *= 1000;
            }
            var4_4.cfr_renamed_0 = var0.readShort();
            var4_4.var_byte_do = var0.readByte();
            var4_4.var_java_util_Vector_do = new Vector<E>();
            var5_5 = var0.readByte();
            var6_6 = 0;
            if ("  ".length() != 0) ** GOTO lbl41
            return null;
lbl-1000:
            // 1 sources

            {
                var7_7 = new fs();
                new fs().soLuong = var0.readByte();
                var7_7.var_int_if = var0.readByte();
                var4_4.var_java_util_Vector_do.addElement(var7_7);
                var6_6 = (byte)(var6_6 + 1);
lbl41:
                // 2 sources

                ** while (!aa_0.cfr_renamed_3((int)var6_6, (int)var5_5))
            }
lbl42:
            // 1 sources

            var2_2.addElement(var4_4);
            var3_3 = (byte)(var3_3 + 1);
lbl44:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)var1_1))
        }
lbl45:
        // 1 sources

        return var2_2;
    }

    public static String java_lang_String_do(am am2) {
        if ((am2.cfr_renamed_2 >= 0)) {
            return aa_0.am_do((short)am2.cfr_renamed_2).chuoiGiaTri;
        }
        return am2.chuoiGiaTri;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Vector (byte[] var0 < boolean var1_1) {
        var0 = new ByteArrayInputStream((byte[])var0);
        var0 = new DataInputStream((InputStream)var0);
        var2_3 = 1;
        if (aa_0.cfr_renamed_3((int)var1_1)) {
            var2_3 = var0.readShort();
        }
        var1_2 = new Vector<fb>();
        var3_4 = 0;
        if ("  ".length() > 0) ** GOTO lbl73
        return null;
lbl-1000:
        // 1 sources

        {
            block6: {
                block7: {
                    block5: {
                        var4_5 = var0.readShort();
                        var5_6 = var0.readInt();
                        var6_7 = var0.readShort();
                        var7_8 = var0.readShort();
                        if (!(var7_8 == -2)) break block5;
                        var8_9 /* !! */  = new fb();
                        new fb().cfr_renamed_3 = var4_5;
                        var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                        var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                        var8_9 /* !! */ .cfr_renamed_2 = var7_8;
                        var8_9 /* !! */ .chuoiGiaTri = var0.readUTF();
                        var8_9 /* !! */ .var_byte_do = var0.readByte();
                        var8_9 /* !! */ .var_short_if = var0.readShort();
                        var1_2.addElement(var8_9 /* !! */ );
                        if ("  ".length() < " ".length()) {
                            return null;
                        }
                        break block6;
                    }
                    if (!(var7_8 == -1)) break block7;
                    var8_9 /* !! */  = new cX();
                    new cX().cfr_renamed_3 = var4_5;
                    var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                    var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                    var8_9 /* !! */ .cfr_renamed_2 = var7_8;
                    var8_9 /* !! */ .chuoiGiaTri = var0.readUTF();
                    var8_9 /* !! */ .var_byte_do = var0.readByte();
                    var8_9 /* !! */ .var_byte_if = var0.readByte();
                    var8_9 /* !! */ .cfr_renamed_3 = var0.readByte();
                    var8_9 /* !! */ .cfr_renamed_2 = var0.readByte();
                    var8_9 /* !! */ .var_short_if = var0.readShort();
                    var8_9 /* !! */ .var_short_arr_do = new short[15];
                    var8_9 /* !! */ .var_byte_arr_if = new byte[15];
                    var8_9 /* !! */ .var_byte_arr_do = new byte[15];
                    var4_5 = 0;
                    if (" ".length() >= ((98 ^ 124) & ~(93 ^ 67))) ** GOTO lbl56
                    return null;
lbl-1000:
                    // 1 sources

                    {
                        var8_9 /* !! */ .var_short_arr_do[var4_5] = var0.readShort();
                        var8_9 /* !! */ .var_byte_arr_if[var4_5] = var0.readByte();
                        var8_9 /* !! */ .var_byte_arr_do[var4_5] = var0.readByte();
                        ++var4_5;
lbl56:
                        // 2 sources

                        ** while (!aa_0.cfr_renamed_3((int)var4_5, (int)15))
                    }
lbl57:
                    // 1 sources

                    var1_2.addElement(var8_9 /* !! */ );
                    if (" ".length() < 0) {
                        return null;
                    }
                    break block6;
                }
                var8_9 /* !! */  = new o_0();
                new o_0().cfr_renamed_3 = var4_5;
                var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                var8_9 /* !! */ .cfr_renamed_2 = var7_8;
                var8_9 /* !! */ .cfr_renamed_1 = var0.readShort();
                var1_2.addElement(var8_9 /* !! */ );
            }
            ++var3_4;
lbl73:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_4, (int)var2_3))
        }
lbl74:
        // 1 sources

        return var1_2;
    }

    public static d_0 d_0_do(short s2) {
        d_0 d_02 = (d_0)var_java_util_Hashtable_do.get("" + s2);
        if ((d_02 == null)) {
            d_02 = new d_0();
            var_java_util_Hashtable_do.put("" + s2, d_02);
            ft_0.ft_0_do().cfr_renamed_1(s2);
            if ("  ".length() <= 0) {
                return null;
            }
        } else if ((d_02.soLuong >= 0)) {
            d_02.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return d_02;
    }

    public static void (byte[] byArray != null) {
        soLuong -= 1;
        aa_0.cfr_renamed_5(byArray);
        hg.cfr_renamed_1("avatarItemInfo", byArray);
        aa_0.cfr_renamed_7();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void cfr_renamed_7() {
        hr hr2;
        block14: {
            if (aa_0.boolean_if(soLuong)) {
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(var_int_try);
                dataOutputStream.writeInt(var_int_new);
                dataOutputStream.writeInt(soLuongKhoa);
                dataOutputStream.writeInt(var_int_int);
                dataOutputStream.writeInt(var_int_if);
                hg.cfr_renamed_1("avatarVs", byteArrayOutputStream.toByteArray());
                dataOutputStream.close();
                }
            catch (Exception exception) {
                break block14;
            }
            if (((0x6B ^ 0x40 ^ (0x74 ^ 0x1F)) & (0x17 ^ 0xB ^ (0x13 ^ 0x4F) ^ -" ".length())) < 0) {
                return;
            }
        }
        aa_0.cfr_renamed_8();
        int n = var_java_util_Vector_try.size();
        int n2 = 0;
        if ("  ".length() <= 0) {
            return;
        }
        while (true) {
            if ((n2 >= n)) {
                if (!!(GameCanvas.dangChayAuto) || aa_0.boolean_if(GameCanvas.var_boolean_int ? 1 : 0)) {
                    var_java_util_Hashtable_int = new Hashtable();
                }
                n2 = 0;
                if (-"   ".length() <= 0) break;
                return;
            }
            hr2 = (hr)var_java_util_Vector_try.elementAt(n2);
            if ((hr2.cfr_renamed_0 != -1)) {
                byte[] byArray = aa_0.hr_if((int)hr2.cfr_renamed_0).var_byte_arr_do;
                System.arraycopy(hr2.var_byte_arr_do, 0, byArray, 0, hr2.var_byte_arr_do.length);
                hr2.var_byte_arr_do = byArray;
            }
            hr2.var_javax_microedition_lcdui_Image_do = hg.javax_microedition_lcdui_Image_do(hr2.var_byte_arr_do);
            ++n2;
        }
        while (true) {
            if ((n2 >= var_java_util_Vector_try.size())) {
                n2 = 0;
                if (" ".length() != 0) break;
                return;
            }
            hr2 = (hr)var_java_util_Vector_try.elementAt(n2);
            ((hr)var_java_util_Vector_try.elementAt(n2)).var_byte_arr_do = null;
            var_java_util_Hashtable_new.put("" + hr2.cfr_renamed_2, hr2);
            ++n2;
        }
        while (true) {
            if ((n2 >= var_java_util_Vector_try.size())) {
                var_java_util_Vector_try.removeAllElements();
                var_java_util_Vector_try = null;
                AngelChip.duLieuNguoiChoi.void_if();
                go_0.go_0_do().cfr_renamed_14();
                return;
            }
            hr2 = (hr)var_java_util_Vector_try.elementAt(n2);
            if ((var_java_util_Hashtable_int != null)) {
                (hr2 != null);
            }
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static hr hr_if(int var0) {
        var1_1 = aa_0.var_java_util_Vector_try.size();
        var2_2 = 0;
        if ("   ".length() >= " ".length()) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_3 = (hr)aa_0.var_java_util_Vector_try.elementAt(var2_2);
            if ((var3_3.cfr_renamed_2 == var0)) {
                return var3_3;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl12:
        // 1 sources

        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void cfr_renamed_6(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        var_java_util_Vector_int = new Vector();
        short s2 = ((DataInputStream)object).readShort();
        System.out.println("readMapItem: " + s2);
        int n = 0;
        while (!(n >= s2)) {
            bB bB2 = new bB();
            new bB().var_short_do = ((DataInputStream)object).readShort();
            bB2.cfr_renamed_0 = ((DataInputStream)object).readShort();
            bB2.cfr_renamed_8 = ((DataInputStream)object).readByte();
            bB2.cfr_renamed_2 = ((DataInputStream)object).readByte();
            bB2.cfr_renamed_3 = ((DataInputStream)object).readByte();
            var_java_util_Vector_int.addElement(bB2);
            n = (byte)(n + 1);
        }
    }

        /*
     * Unable to fully structure code
     */
    public static void (hr var0 == null) {
        aa_0.soLuong -= 1;
        var1_1 = aa_0.var_java_util_Vector_try.size();
        var2_2 = 0;
        if (-" ".length() <= 0) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (hr)aa_0.var_java_util_Vector_try.elementAt(var2_2);
            if ((var3_3.cfr_renamed_2 == var0.cfr_renamed_2)) {
                var3_3.var_byte_arr_do = var0.var_byte_arr_do;
                var3_3.var_short_do = var0.var_short_do;
                var3_3.cfr_renamed_0 = var0.cfr_renamed_0;
                if ("   ".length() > 0) break;
                return;
            }
            ++var2_2;
lbl18:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl19:
        // 2 sources

        aa_0.cfr_renamed_7();
    }

                public static d_0 (short s2 != null) {
        d_0 d_02 = (d_0)var_java_util_Hashtable_for.get("" + s2);
        if ((d_02 == null)) {
            d_02 = new d_0();
            var_java_util_Hashtable_for.put("" + s2, d_02);
            ep_0.ep_0_do().cfr_renamed_2(s2);
            if (-(0x76 ^ 0x73) >= 0) {
                return null;
            }
        } else if ((d_02.soLuong >= 0)) {
            d_02.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return d_02;
    }

    public static int int_do(am am2) {
        byte by2;
        if ((am2.cfr_renamed_2 >= 0)) {
            by2 = ((cX)aa_0.am_do((short)am2.cfr_renamed_2)).cfr_renamed_2;
            if ("   ".length() != "   ".length()) {
                return (0x75 ^ 0x34) & ~(0xDE ^ 0x9F);
            }
        } else {
            by2 = ((cX)am2).cfr_renamed_2;
        }
        return by2;
    }

    public static void (byte[] byArray >= 0) {
        soLuong -= 1;
        var_am_arr_do = aa_0.am_arr_do((byArray < 0));
        hg.cfr_renamed_1("avatarPart", byArray);
        aa_0.cfr_renamed_5();
        aa_0.cfr_renamed_7();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2() {
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (!(stringArray != null)) return;
            int n = 0;
            if (((169 + 149 - 312 + 221 ^ 45 + 84 - 125 + 168) & (91 + 10 - 26 + 52 ^ (0x20 ^ 0x10) ^ -" ".length())) < 0) {
                return;
            }
            while (true) {
                if ((n >= stringArray.length)) {
                    return;
                }
                RecordStore.deleteRecordStore((String)stringArray[n]);
                ++n;
            }
        }
        catch (Exception exception) {
            }
    }

        /*
     * Unable to fully structure code
     */
    public static void (Vector var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5 == null) {
        hg.cfr_renamed_1("avatar", "2.5.8");
        try {
            block45: {
                block44: {
                    aa_0.soLuong = 0;
                    var6_6 = hg.byte_arr_do("avatarVs");
                    if ((var6_6 != null)) {
                        var6_6 = new ByteArrayInputStream((byte[])var6_6);
                        v0 = new DataInputStream((InputStream)var6_6);
                        var6_6 = v0;
                        aa_0.var_int_try = v0.readInt();
                        aa_0.var_int_new = var6_6.readInt();
                        aa_0.soLuongKhoa = var6_6.readInt();
                        aa_0.var_int_int = var6_6.readInt();
                        aa_0.var_int_if = var6_6.readInt();
                    }
                    if (!aa_0.cfr_renamed_3((int)aa_0.boolean_do())) break block44;
                    aa_0.var_java_util_Vector_try = var0;
                    var6_7 = var0.size();
                    var7_9 = 0;
                    if ((228 ^ 166 ^ (2 ^ 68)) != 0) ** GOTO lbl26
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_11 = (hr)var0.elementAt(var7_9);
                        ep_0.ep_0_do().cfr_renamed_0(var8_11.cfr_renamed_2);
                        aa_0.soLuong += 1;
                        ++var7_9;
lbl26:
                        // 2 sources

                        ** while (!aa_0.cfr_renamed_3((int)var7_9, (int)var6_7))
                    }
lbl27:
                    // 1 sources

                    if (" ".length() != " ".length()) {
                        return;
                    }
                    break block45;
                }
                var6_7 = var0.size();
                var7_10 = 0;
                if (null == null) ** GOTO lbl54
                return;
lbl-1000:
                // 1 sources

                {
                    var8_12 = (hr)var0.elementAt(var7_10);
                    var9_13 = aa_0.hr_if((int)var8_12.cfr_renamed_2);
                    if (aa_0.cfr_renamed_1((Object)var9_13)) {
                        aa_0.var_java_util_Vector_try.addElement(var8_12);
                        ep_0.ep_0_do().cfr_renamed_0(var8_12.cfr_renamed_2);
                        aa_0.soLuong += 1;
                        if (" ".length() == 0) {
                            return;
                        }
                    } else if ((var8_12.var_short_do != var9_13.var_short_do)) {
                        ep_0.ep_0_do().cfr_renamed_0(var8_12.cfr_renamed_2);
                        aa_0.soLuong += 1;
                    }
                    ++var7_10;
lbl54:
                    // 2 sources

                    ** while (!aa_0.cfr_renamed_3((int)var7_10, (int)var6_7))
                }
            }
            var6_8 = hg.byte_arr_do("avatarImgData");
            aa_0.chuoiGiaTri = hg.java_lang_String_do("partImageNormal");
            if (aa_0.cfr_renamed_1((Object)var6_8)) {
                v1 = 0;
                if (" ".length() < 0) {
                    return;
                }
            } else {
                aa_0.var_k_0_arr_do = aa_0.k_0_arr_do(var6_8);
                v1 = 1;
            }
            if ((v1 == 0)) {
                aa_0.soLuongKhoa = var1_1;
                ep_0.ep_0_do().cfr_renamed_2();
                aa_0.soLuong += 1;
                } else if ((aa_0.soLuongKhoa != var1_1)) {
                aa_0.soLuongKhoa = var1_1;
                ep_0.ep_0_do().cfr_renamed_2();
                aa_0.soLuong += 1;
            }
            if (aa_0.cfr_renamed_3((int)aa_0.boolean_if())) {
                aa_0.var_int_try = var2_2;
                ep_0.ep_0_do().cfr_renamed_3();
                aa_0.soLuong += 1;
                if ("   ".length() <= 0) {
                    return;
                }
            } else if ((aa_0.var_int_try != var2_2)) {
                aa_0.var_int_try = var2_2;
                ep_0.ep_0_do().cfr_renamed_3();
                aa_0.soLuong += 1;
                if ("  ".length() <= 0) {
                    return;
                }
            } else {
                aa_0.cfr_renamed_5();
            }
            if (aa_0.cfr_renamed_1((Object)(var6_8 = hg.byte_arr_do("avatarItemInfo")))) {
                v2 = 0;
                } else {
                aa_0.cfr_renamed_5(var6_8);
                v2 = 1;
            }
            if ((v2 == 0)) {
                aa_0.var_int_int = var3_3;
                ep_0.ep_0_do().cfr_renamed_4();
                aa_0.soLuong += 1;
                if (((87 + 51 - 93 + 181 ^ 116 + 19 - 56 + 91) & (45 + 116 - 139 + 185 ^ 68 + 64 - 71 + 74 ^ -" ".length())) != 0) {
                    return;
                }
            } else if ((aa_0.var_int_int != var3_3)) {
                aa_0.var_int_int = var3_3;
                ep_0.ep_0_do().cfr_renamed_4();
                aa_0.soLuong += 1;
            }
            if (aa_0.cfr_renamed_1((Object)(var6_8 = hg.byte_arr_do("avatarMapItemType")))) {
                v3 = 0;
                } else {
                aa_0.var_java_util_Vector_new = aa_0.java_util_Vector_do(var6_8);
                v3 = 1;
            }
            if ((v3 == 0)) {
                aa_0.var_int_new = var4_4;
                ep_0.ep_0_do().cfr_renamed_5();
                aa_0.soLuong += 1;
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            } else if ((aa_0.var_int_new != var4_4)) {
                aa_0.var_int_new = var4_4;
                ep_0.ep_0_do().cfr_renamed_5();
                aa_0.soLuong += 1;
            }
            if (aa_0.cfr_renamed_1((Object)(var6_8 = hg.byte_arr_do("avatarMapType")))) {
                v4 = 0;
                if (((117 ^ 22 ^ (183 ^ 134)) & (233 ^ 166 ^ (68 ^ 89) ^ -" ".length())) == "  ".length()) {
                    return;
                }
            } else {
                aa_0.cfr_renamed_6(var6_8);
                v4 = 1;
            }
            if ((v4 == 0)) {
                aa_0.var_int_if = var5_5;
                ep_0.ep_0_do().cfr_renamed_6();
                aa_0.soLuong += 1;
                } else if ((aa_0.var_int_if != var5_5)) {
                aa_0.var_int_if = var5_5;
                ep_0.ep_0_do().cfr_renamed_6();
                aa_0.soLuong += 1;
            }
            aa_0.cfr_renamed_7();
            return;
        }
        catch (Exception v5) {
            v5.printStackTrace();
            return;
        }
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4 == null) {
        if (aa_0.cfr_renamed_0(aa_0.cfr_renamed_0((short)((short)n)).soLuong, -1)) {
            graphics.drawImage(aa_0.cfr_renamed_0((short)((short)n)).var_javax_microedition_lcdui_Image_do, n2, n3, n4);
        }
    }

    public static void (byte[] byArray == 0) {
        soLuong -= 1;
        var_java_util_Vector_new.removeAllElements();
        var_java_util_Vector_new = aa_0.java_util_Vector_do(byArray);
        hg.cfr_renamed_1("avatarMapItemType", byArray);
        aa_0.cfr_renamed_7();
    }

    /*
     * Unable to fully structure code
     */
    public static cg cg_do(Vector var0, int var1_1) {
        var2_2 = var0.size();
        var3_3 = 0;
        if (" ".length() >= 0) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = (cg)var0.elementAt(var3_3);
            if ((var4_4.var_short_do == var1_1)) {
                return var4_4;
            }
            ++var3_3;
lbl11:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)var2_2))
        }
lbl12:
        // 1 sources

        return null;
    }

    static {
        aa_0.cfr_renamed_6();
        var_java_util_Vector_try = new Vector();
        var_java_util_Hashtable_new = new Hashtable();
        soLuong = -1;
        var_java_util_Vector_new = new Vector();
        var_java_util_Vector_int = new Vector();
        var_java_util_Hashtable_for = new Hashtable();
        var_java_util_Hashtable_do = new Hashtable();
        var_java_util_Hashtable_if = new Hashtable();
        var_java_util_Vector_for = new Vector();
    }

    /*
     * Unable to fully structure code
     */
    public static gs_0 gs_0_do(int var0) {
        var1_1 = aa_0.var_java_util_Vector_new.size();
        var2_2 = 0;
        if (" ".length() > -" ".length()) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            if (aa_0.cfr_renamed_2(((gs_0)aa_0.var_java_util_Vector_new.elementAt((int)var2_2)).cfr_renamed_4, var0)) {
                return (gs_0)aa_0.var_java_util_Vector_new.elementAt(var2_2);
            }
            ++var2_2;
lbl10:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var2_2, (int)var1_1))
        }
lbl11:
        // 1 sources

        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static am[] am_arr_do(Vector vector) {
        int n = 0;
        int n2 = 0;
        while (!(n2 >= vector.size())) {
            am am2 = (am)vector.elementAt(n2);
            if ((am2.cfr_renamed_3 > n)) {
                n = am2.cfr_renamed_3;
            }
            ++n2;
        }
        am[] amArray = new am[n + 1];
        int n3 = 0;
        while (!(n3 >= vector.size())) {
            am am3;
            amArray[am3.cfr_renamed_3] = am3 = (am)vector.elementAt(n3);
            ++n3;
        }
        return amArray;
    }

        public static void void_do(String string) {
        try {
            RecordStore.deleteRecordStore((String)("2.5.8" + string));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avatarSV");
        if ((dataInputStream == null)) {
            return;
        }
        try {
            if ((dataInputStream.readByte() != gA.cfr_renamed_1().mangSoNguyen[4])) {
                return;
            }
            byte by2 = dataInputStream.readByte();
            if ((by2 == 0)) {
                aa_0.void_do("avatarSV");
                return;
            }
            AngelChip.var_java_lang_String_arr_arr_arr_do = new String[2][by2][];
            AngelChip.var_java_lang_String_arr_arr_arr_if = new String[2][by2][];
            AngelChip.var_int_arr_arr_arr_do = new int[2][by2][];
            int n = 0;
            block2: while (true) {
                if ((n >= by2)) {
                    dataInputStream.close();
                    return;
                }
                byte by3 = dataInputStream.readByte();
                AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n] = new String[by3 + 1];
                AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n][0] = dataInputStream.readUTF();
                AngelChip.var_java_lang_String_arr_arr_arr_if[gA.cfr_renamed_1().mangSoNguyen[4]][n] = new String[by3];
                AngelChip.var_int_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n] = new int[by3];
                int n2 = 0;
                if ("   ".length() <= 0) {
                    return;
                }
                while (true) {
                    if ((n2 >= by3)) {
                        ++n;
                        continue block2;
                    }
                    AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n][n2 + 1] = dataInputStream.readUTF();
                    AngelChip.var_java_lang_String_arr_arr_arr_if[gA.cfr_renamed_1().mangSoNguyen[4]][n][n2] = dataInputStream.readUTF();
                    AngelChip.var_int_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n][n2] = dataInputStream.readInt();
                    ++n2;
                }
                break;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            aa_0.void_do("avatarSV");
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean boolean_if() {
        block2: {
            var0 = hg.byte_arr_do("avatarPart");
            if (!aa_0.cfr_renamed_1((Object)aa_0.chuoiGiaTri)) break block2;
            var1_1 = aa_0.tenNhanVat.toCharArray();
            var2_2 = 0;
            var3_3 = 1;
            if (" ".length() < "  ".length()) ** GOTO lbl13
            return (boolean)((66 ^ 0 ^ (56 ^ 104)) & (121 ^ 85 ^ (175 ^ 145) ^ -" ".length()));
lbl-1000:
            // 1 sources

            {
                var4_5 = Integer.parseInt(String.valueOf(var1_1[var3_3]));
                var2_2 += var4_5;
                var3_3 += 2;
lbl13:
                // 2 sources

                ** while (!aa_0.cfr_renamed_3((int)var3_3, (int)(var1_1.length - 1)))
            }
lbl14:
            // 1 sources

            var3_4 = String.valueOf(var2_2);
            aa_0.chuoiGiaTri = String.valueOf(var3_4.length()) + aa_0.tenNhanVat.substring(0, 5) + var2_2 + aa_0.tenNhanVat.substring(5, aa_0.tenNhanVat.length());
        }
        if (aa_0.cfr_renamed_1((Object)var0)) {
            return 0;
        }
        aa_0.var_am_arr_do = aa_0.am_arr_do((var0 < 0));
        return 1;
    }

    public static boolean boolean_do(int n) {
        if ((n != 10) && (n != 20) && (n != 30) && (n != 40) && (n != 50)) {
            return 0;
        }
        return 1;
    }

    public static hr hr_do(int n) {
        return (hr)var_java_util_Hashtable_new.get("" + n);
    }

        /*
     * Unable to fully structure code
     */
    private static k_0[] k_0_arr_do(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new Vector<k_0>();
        var3_3 = 0;
        var4_4 = 0;
        if ("   ".length() >= 0) ** GOTO lbl23
        return null;
lbl-1000:
        // 1 sources

        {
            var5_6 = new k_0();
            new k_0().cfr_renamed_2 = var0.readShort();
            if ((var5_6.cfr_renamed_2 > var3_3)) {
                var3_3 = var5_6.cfr_renamed_2;
            }
            var5_6.cfr_renamed_3 = var0.readShort();
            var5_6.var_short_do = (short)var0.readUnsignedByte();
            var5_6.cfr_renamed_0 = (short)var0.readUnsignedByte();
            var5_6.cfr_renamed_4 = var0.readByte();
            var5_6.cfr_renamed_5 = var0.readByte();
            var2_2.addElement(var5_6);
            ++var4_4;
lbl23:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var4_4, (int)var1_1))
        }
lbl24:
        // 1 sources

        var4_5 = new k_0[var3_3 + 1];
        var5_7 = 0;
        if (-" ".length() <= 0) ** GOTO lbl32
        return null;
lbl-1000:
        // 1 sources

        {
            var4_5[var0.cfr_renamed_2] = var0 = (k_0)var2_2.elementAt(var5_7);
            ++var5_7;
lbl32:
            // 2 sources

            ** while (!aa_0.cfr_renamed_3((int)var5_7, (int)var2_2.size()))
        }
lbl33:
        // 1 sources

        return var4_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void cfr_renamed_8() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(var_java_util_Vector_try.size());
            int n = 0;
            if (-"   ".length() > 0) {
                return;
            }
            while (true) {
                if ((n >= var_java_util_Vector_try.size())) {
                    hg.cfr_renamed_1("avatarImgBig", byteArrayOutputStream.toByteArray());
                    dataOutputStream.close();
                    hg.cfr_renamed_1("partImageNormal", chuoiGiaTri);
                    return;
                }
                hr hr2 = (hr)var_java_util_Vector_try.elementAt(n);
                dataOutputStream.writeShort(hr2.cfr_renamed_2);
                dataOutputStream.writeShort(hr2.cfr_renamed_0);
                dataOutputStream.writeInt(hr2.var_byte_arr_do.length);
                ((OutputStream)dataOutputStream).write(hr2.var_byte_arr_do);
                dataOutputStream.writeShort(hr2.var_short_do);
                ++n;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void (byte[] byArray > 0) {
        soLuong -= 1;
        var_java_util_Vector_int.removeAllElements();
        aa_0.cfr_renamed_6(byArray);
        hg.cfr_renamed_1("avatarMapType", byArray);
        aa_0.cfr_renamed_7();
    }

        public static void cfr_renamed_4() {
        hg.cfr_renamed_1(v_0.chuoiGiaTri, String.valueOf(AngelChip.tenNhanVat) + dR.tenNhanVat);
        hg.cfr_renamed_1(AngelChip.chuoiGiaTri, String.valueOf(hg.chuoiGiaTri) + go_0.chuoiGiaTri);
        hg.cfr_renamed_1(hg.chuoiGiaTri, String.valueOf(AngelChip.var_int_if) + gO.chuoiGiaTri);
    }

    public static DataInputStream java_io_DataInputStream_do(String object) {
        byte[] byArray = hg.byte_arr_do((String)object);
        object = byArray;
        if (aa_0.cfr_renamed_1((Object)byArray)) {
            return null;
        }
        object = new ByteArrayInputStream((byte[])object);
        return new DataInputStream((InputStream)object);
    }
}

