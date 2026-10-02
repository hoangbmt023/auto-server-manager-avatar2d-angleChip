/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from aK
 */
public final class ak_0 {
    private static int[] mangSoNguyen;
    private static byte var_byte_do;
    private static int var_int_if;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private static short[] var_short_arr_do;
    public static dY[] var_dY_arr_do;
    private static int soLuongKhoa;
    public static Vector var_java_util_Vector_do;
    public static int soLuong;
    public static Vector var_java_util_Vector_if;
    public static bH[] var_bH_arr_do;
    public static Hashtable var_java_util_Hashtable_do;
    private static gd[] var_gd_arr_do;
    public static Vector var_java_util_Vector_for;

    public static void void_do() {
        soLuong = -1;
    }

        private static void cfr_renamed_5() {
        mangSoNguyen = new int[13];
        -1 = -" ".length();
        0 = (0x10 ^ 0x3E ^ (0xF1 ^ 0x97)) & (0xAD ^ 0xC6 ^ (0xB ^ 0x28) ^ -" ".length());
        1 = " ".length();
        2 = "  ".length();
        8 = 0x86 ^ 0x8E;
        3 = "   ".length();
        12 = 0xA6 ^ 0xAA;
        -3 = -"   ".length();
        7 = 0xF7 ^ 0x97 ^ (0xC8 ^ 0xAF);
        82 = 156 + 155 - 213 + 104 ^ 108 + 103 - 179 + 120;
        93 = 0x58 ^ 5;
        121 = 0xCB ^ 0xB2;
        50 = 24 + 36 - 11 + 116 ^ 49 + 100 - 146 + 148;
    }

    /*
     * Unable to fully structure code
     */
    public static gd gd_do(int var0) {
        var1_1 = 0;
        if ("  ".length() == "  ".length()) ** GOTO lbl9
        return null;
lbl-1000:
        // 1 sources

        {
            if ((ak_0.var_gd_arr_do[var1_1].var_short_do == var0)) {
                return ak_0.var_gd_arr_do[var1_1];
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var1_1, (int)ak_0.var_gd_arr_do.length))
        }
lbl10:
        // 1 sources

        return null;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        /*
     * Unable to fully structure code
     */
    public static void void_if() {
        AngelChip.soLuong = (int)(System.currentTimeMillis() % 6L);
        em_0.cfr_renamed_11();
        k.void_do();
        fw.cfr_renamed_1();
        var0 = GameCanvas.java_lang_String_do(bF.chuoiGiaTri, 8);
        bF.chuoiGiaTri = "xac" + var0;
        fe_0.chuoiGiaTri = String.valueOf(bF.chuoiGiaTri) + AngelChip.chuoiGiaTri + fw.chuoiGiaTri + GameCanvas.java_lang_String_do(AngelChip.tenNhanVat, -3);
        var0_1 = 0;
        if ("   ".length() != 0) ** GOTO lbl48
        return;
lbl-1000:
        // 1 sources

        {
            v0 = new StringBuffer(String.valueOf(fe_0.chuoiGiaTri));
            var1_2 = var0_1 - AngelChip.soLuong;
            var2_3 = String.valueOf(GameCanvas.java_lang_String_do(AngelChip.tenNhanVat, -3)) + GameCanvas.java_lang_String_do(AngelChip.chuoiGiaTri, 2) + GameCanvas.java_lang_String_do(String.valueOf(k.chuoiGiaTri) + (var0_1 - 7) + "l", -3);
            if (!ak_0.cfr_renamed_1(var2_3 = System.getProperty(String.valueOf(var2_3) + bF.chuoiGiaTri.substring(3) + "ei"))) {
                ThongTinNhanVat.chuoiGiaTri = String.valueOf(ThongTinNhanVat.chuoiGiaTri) + k.chuoiGiaTri;
                v1 = "ig_" + AngelChip.tenNhanVat + "y" + GameCanvas.java_lang_String_do(var2_3, AngelChip.soLuong) + var1_2 + "t251";
                if ("  ".length() > "   ".length()) {
                    return;
                }
            } else {
                if ((var1_2 % 2 == 0)) {
                    var2_3 = String.valueOf(AngelChip.chuoiGiaTri) + "tr" + AngelChip.tenNhanVat + "3555d" + AngelChip.soLuong * 82 + "824d87" + var1_2 + "t250";
                    if (((207 ^ 188 ^ (30 ^ 58)) & (19 + 66 - -9 + 50 ^ 189 + 177 - 332 + 165 ^ -" ".length())) != 0) {
                        return;
                    }
                } else if ((var1_2 % 3 == 0)) {
                    var2_3 = String.valueOf(AngelChip.chuoiGiaTri) + "xs" + AngelChip.soLuong + AngelChip.tenNhanVat + "11233r3yr7839" + AngelChip.soLuong * 93 + var1_2 + "t251";
                    } else {
                    var2_3 = String.valueOf(AngelChip.chuoiGiaTri) + "fv" + AngelChip.tenNhanVat + AngelChip.soLuong + "11233r8ddd" + AngelChip.soLuong * 121 + "srg" + var1_2 + "t252";
                }
                ThongTinNhanVat.chuoiGiaTri = String.valueOf(ThongTinNhanVat.chuoiGiaTri) + AngelChip.tenNhanVat;
                v1 = var2_3;
            }
            fe_0.chuoiGiaTri = v0.append(v1).toString();
            fw.chuoiGiaTri = String.valueOf(fw.chuoiGiaTri) + fe_0.chuoiGiaTri.substring(0, 2);
            ++var0_1;
lbl48:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var0_1, (int)(AngelChip.tenNhanVat.length() + AngelChip.chuoiGiaTri.length())))
        }
lbl49:
        // 1 sources

        k.void_do();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void (byte by2, short[] sArray, int n, int n2 != null) {
        block27: {
            int n3;
            short[] sArray2;
            block26: {
                block25: {
                    byte[] byArray = gc_0.byte_arr_do("avatarVSFarm");
                    if (ak_0.cfr_renamed_0((Object)byArray)) {
                        InputStream inputStream = new ByteArrayInputStream(byArray);
                        inputStream = new DataInputStream(inputStream);
                        try {
                            var_int_if = ((DataInputStream)inputStream).readInt();
                            soLuongKhoa = ((DataInputStream)inputStream).readInt();
                            }
                        catch (IOException iOException) {
                            ci_0.void_do("avatarVSFarm");
                            break block25;
                        }
                        if (-" ".length() > 0) {
                            return;
                        }
                    }
                }
                soLuong = 0;
                var_javax_microedition_lcdui_Image_arr_do = new Image[by2];
                if (!(ak_0.boolean_for())) {
                    var_byte_do = by2;
                    var_short_arr_do = sArray;
                    soLuongKhoa = -1;
                    var_int_if = -1;
                    int n4 = 0;
                    while (true) {
                        if ((n4 >= by2)) {
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                            break block26;
                        }
                        dh_0.dh_0_do().cfr_renamed_1((short)n4);
                        soLuong += 1;
                        ++n4;
                    }
                }
                if (ak_0.boolean_do((int)var_byte_do)) {
                    int n5 = 0;
                    while (!(n5 >= var_byte_do)) {
                        int n6 = n5;
                        byte[] byArray = gc_0.byte_arr_do("avatarImgBigFarm" + n6);
                        ak_0.var_javax_microedition_lcdui_Image_arr_do[n5] = gc_0.javax_microedition_lcdui_Image_do(byArray);
                        ++n5;
                    }
                }
            }
            int n7 = 0;
            while (true) {
                if ((n7 >= var_byte_do)) {
                    if (ak_0.boolean_do(by2 - var_byte_do)) {
                        sArray2 = var_short_arr_do;
                        var_short_arr_do = new short[sArray.length];
                        n3 = 0;
                        if (-"   ".length() <= 0) break;
                        return;
                    }
                    break block27;
                }
                if ((sArray[n7] != var_short_arr_do[n7])) {
                    dh_0.dh_0_do().cfr_renamed_1((short)n7);
                    soLuong += 1;
                }
                ++n7;
            }
            while (true) {
                if ((n3 >= sArray2.length)) {
                    n3 = var_byte_do;
                    if (("  ".length() & ~"  ".length()) != -" ".length()) break;
                    return;
                }
                ak_0.var_short_arr_do[n3] = sArray2[n3];
                ++n3;
            }
            while (!(n3 >= by2)) {
                dh_0.dh_0_do().cfr_renamed_1((short)n3);
                soLuong += 1;
                ++n3;
            }
        }
        if (!(ak_0.boolean_if())) {
            soLuongKhoa = n;
            dh_0.dh_0_do().cfr_renamed_4();
            soLuong += 1;
            if (-" ".length() == ((0x95 ^ 0xB8) & ~(0x75 ^ 0x58))) {
                return;
            }
        } else if ((soLuongKhoa != n)) {
            soLuongKhoa = n;
            dh_0.dh_0_do().cfr_renamed_4();
            soLuong += 1;
        }
        if (!(ak_0.boolean_do())) {
            var_int_if = n2;
            dh_0.dh_0_do().void_do();
            soLuong += 1;
            } else if ((var_int_if != n2)) {
            var_int_if = n2;
            dh_0.dh_0_do().void_do();
            soLuong += 1;
        }
        if ((soLuong == 0)) {
            dh_0.dh_0_do().cfr_renamed_5();
        }
        gc_0.void_do();
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    /*
     * Unable to fully structure code
     */
    public static dv_0 dv_0_do(short var0) {
        var1_1 = 0;
        if (" ".length() > -" ".length()) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (dv_0)ak_0.var_java_util_Vector_for.elementAt(var1_1);
            if ((var2_2.cfr_renamed_3 == var0)) {
                return var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var1_1, (int)ak_0.var_java_util_Vector_for.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void void_for() {
        if ((var_java_util_Hashtable_do.size() > 50)) {
            Enumeration enumeration = var_java_util_Hashtable_do.keys();
            while (!!(enumeration.hasMoreElements())) {
                String string = (String)enumeration.nextElement();
                an an2 = (an)var_java_util_Hashtable_do.get(string);
                if (!(an2.soLuong != -1) || !ak_0.boolean_do(ak_0.cfr_renamed_0(System.currentTimeMillis() / 1000L - (long)an2.soLuong, (long)GameCanvas.var_int_new))) continue;
                var_java_util_Hashtable_do.remove(string);
                }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void (byte by2, short[] sArray, int n, int n2 == null) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n);
            dataOutputStream.writeInt(n2);
            n = 0;
            if (-" ".length() > "  ".length()) {
                return;
            }
            while (true) {
                if ((n >= by2)) {
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    gc_0.cfr_renamed_0("avatarDataFarm", byArray);
                    dataOutputStream.close();
                    return;
                }
                dataOutputStream.writeShort(sArray[n]);
                ++n;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

            private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do() {
        byte[] byArray = gc_0.byte_arr_do("avatarTreeInfoFarm");
        if (ak_0.cfr_renamed_1((Object)byArray)) {
            return 0;
        }
        try {
            ak_0.cfr_renamed_4(byArray);
            }
        catch (Exception exception) {
            ci_0.void_do("avatarTreeInfoFarm");
        }
        if (((145 + 30 - 56 + 37 ^ 69 + 82 - 40 + 68) & (0xC0 ^ 0xA1 ^ (0xEF ^ 0xA1) ^ -" ".length())) > (137 + 148 - 165 + 59 ^ 89 + 97 - 78 + 75)) {
            return ((0x1A ^ 0x10 ^ (0x6D ^ 0x46)) & (0x4B ^ 0x62 ^ (0x93 ^ 0x9B) ^ -" ".length())) != 0;
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static fc_0 fc_0_do(int n) {
        int n2 = var_java_util_Vector_do.size();
        int n3 = 0;
        while (!(n3 >= n2)) {
            fc_0 fc_02 = (fc_0)var_java_util_Vector_do.elementAt(n3);
            if ((fc_02.var_byte_do == n)) {
                return fc_02;
            }
            ++n3;
        }
        return null;
    }

    private static boolean boolean_if() {
        byte[] byArray = gc_0.byte_arr_do("avatarImgFarm");
        if (ak_0.cfr_renamed_1((Object)byArray)) {
            return 0;
        }
        try {
            (byArray == 0);
            }
        catch (Exception exception) {
            ci_0.void_do("avatarImgFarm");
        }
        if ("   ".length() <= -" ".length()) {
            return ((0xFA ^ 0x99) & ~(0x29 ^ 0x4A)) != 0;
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_for() {
        DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avatarDataFarm");
        if ((dataInputStream == null)) {
            return 0;
        }
        try {
            var_byte_do = dataInputStream.readByte();
            soLuongKhoa = dataInputStream.readInt();
            var_int_if = dataInputStream.readInt();
            var_short_arr_do = new short[var_byte_do];
            int n = 0;
            if ("   ".length() < 0) {
                return ((0xF5 ^ 0xA4) & ~(0x55 ^ 4)) != 0;
            }
            while (true) {
                if ((n >= var_byte_do)) {
                    dataInputStream.close();
                    break;
                }
                ak_0.var_short_arr_do[n] = dataInputStream.readShort();
                ++n;
            }
        }
        catch (IOException iOException) {
            ci_0.void_do("avatarDataFarm");
            return 1;
        }
        if ("   ".length() >= "   ".length()) return 1;
        return ((0x4F ^ 0x61) & ~(0x3E ^ 0x10)) != 0;
    }

        public static void (byte[] byArray != null) {
        (byArray == 0);
        gc_0.cfr_renamed_0("avatarImgFarm", byArray);
        if ((soLuong -= 1 == 0)) {
            dh_0.dh_0_do().cfr_renamed_5();
        }
    }

    public static void cfr_renamed_4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(var_int_if);
            dataOutputStream.writeInt(soLuongKhoa);
            gc_0.cfr_renamed_0("avatarVSFarm", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static an an_do(short s2) {
        an an2 = (an)var_java_util_Hashtable_do.get("" + s2);
        if ((an2 == null)) {
            an2 = new an();
            var_java_util_Hashtable_do.put("" + s2, an2);
            dh_0.dh_0_do().cfr_renamed_0(s2);
            if ("   ".length() == 0) {
                return null;
            }
        } else if (ak_0.boolean_if(an2.soLuong)) {
            an2.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return an2;
    }

    /*
     * Unable to fully structure code
     */
    public static dY dY_do(int var0) {
        var1_1 = 0;
        if ("   ".length() >= " ".length()) ** GOTO lbl9
        return null;
lbl-1000:
        // 1 sources

        {
            if ((var0 == ak_0.var_dY_arr_do[var1_1].cfr_renamed_5)) {
                return ak_0.var_dY_arr_do[var1_1];
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var1_1, (int)ak_0.var_dY_arr_do.length))
        }
lbl10:
        // 1 sources

        return null;
    }

    /*
     * Unable to fully structure code
     */
    private static void (byte[] var0 == 0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new Vector<bH>();
        var3_3 = 0;
        var4_4 = 0;
        if ("  ".length() == "  ".length()) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = new bH();
            new bH().var_short_do = var0.readShort();
            if ((var5_5.var_short_do > var3_3)) {
                var3_3 = var5_5.var_short_do;
            }
            var5_5.cfr_renamed_1 = var0.readShort();
            var5_5.cfr_renamed_4 = var0.readByte();
            var5_5.cfr_renamed_2 = var0.readByte();
            var5_5.cfr_renamed_5 = var0.readByte();
            var5_5.cfr_renamed_3 = var0.readByte();
            var2_2.addElement(var5_5);
            ++var4_4;
lbl23:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var1_1))
        }
lbl24:
        // 1 sources

        ak_0.var_bH_arr_do = new bH[var3_3 + 1];
        var4_4 = 0;
        if (" ".length() <= "  ".length()) ** GOTO lbl32
        return;
lbl-1000:
        // 1 sources

        {
            ak_0.var_bH_arr_do[var5_5.var_short_do] = var5_5 = (bH)var2_2.elementAt(var4_4);
            ++var4_4;
lbl32:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var1_1))
        }
lbl33:
        // 1 sources

    }

    public static void (short s2, short s3, byte[] byArray != null) {
        soLuong -= 1;
        ak_0.var_short_arr_do[s2] = s3;
        ak_0.var_javax_microedition_lcdui_Image_arr_do[s2] = gc_0.javax_microedition_lcdui_Image_do(byArray);
        s3 = s2;
        byte[] byArray2 = byArray;
        try {
            gc_0.cfr_renamed_0("avatarImgBigFarm" + s3, byArray2);
            }
        catch (Exception exception) {
            }
        if ("   ".length() == ((0x83 ^ 0xC5 ^ (0x3A ^ 0x2D)) & (9 ^ 0x26 ^ (0x67 ^ 0x19) ^ -" ".length()))) {
            return;
        }
        (var_byte_do, var_short_arr_do, soLuongKhoa, var_int_if == null);
        if ((soLuong == 0)) {
            dh_0.dh_0_do().cfr_renamed_5();
        }
    }

    static {
        ak_0.cfr_renamed_5();
        var_java_util_Vector_do = new Vector();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_for = new Vector();
        var_java_util_Hashtable_do = new Hashtable();
        soLuong = -1;
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        if (ak_0.cfr_renamed_1(ak_0.an_do((short)((short)n)).soLuong, -1)) {
            graphics.drawImage(ak_0.an_do((short)((short)n)).var_javax_microedition_lcdui_Image_do, n2, n3, n4);
        }
    }

    public static void (byte[] byArray == null) {
        ak_0.cfr_renamed_4(byArray);
        gc_0.cfr_renamed_0("avatarTreeInfoFarm", byArray);
        if ((soLuong -= 1 == 0)) {
            dh_0.dh_0_do().cfr_renamed_5();
        }
    }

    /*
     * Unable to fully structure code
     */
    public static dY dY_if(int var0) {
        var1_1 = 0;
        if ("   ".length() != -" ".length()) ** GOTO lbl9
        return null;
lbl-1000:
        // 1 sources

        {
            if ((ak_0.var_dY_arr_do[var1_1].cfr_renamed_5 == var0)) {
                return ak_0.var_dY_arr_do[var1_1];
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var1_1, (int)ak_0.var_dY_arr_do.length))
        }
lbl10:
        // 1 sources

        return null;
    }

        /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_4(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new dY[var1_1];
        var3_3 = 0;
        if ("   ".length() >= ((69 ^ 113) & ~(247 ^ 195))) ** GOTO lbl33
        return;
lbl-1000:
        // 1 sources

        {
            var2_2[var3_3] = new dY();
            var2_2[var3_3].cfr_renamed_5 = var0.readByte();
            var2_2[var3_3].chuoiGiaTri = var0.readUTF();
            var2_2[var3_3].tenNhanVat = var2_2[var3_3].chuoiGiaTri.toLowerCase();
            var2_2[var3_3].var_byte_arr_do = new byte[2];
            var2_2[var3_3].var_byte_arr_do[0] = var0.readByte();
            var2_2[var3_3].var_byte_arr_do[1] = var0.readByte();
            var2_2[var3_3].var_short_do = var0.readShort();
            var2_2[var3_3].cfr_renamed_2 = var0.readShort();
            var2_2[var3_3].var_short_arr_if[0] = var0.readShort();
            var2_2[var3_3].var_short_if = var0.readShort();
            var2_2[var3_3].cfr_renamed_4 = var0.readShort();
            var2_2[var3_3].var_short_arr_do = new short[8];
            var4_4 = 0;
            if ("   ".length() > 0) ** GOTO lbl31
            return;
lbl-1000:
            // 1 sources

            {
                var2_2[var3_3].var_short_arr_do[var4_4] = var0.readShort();
                ++var4_4;
lbl31:
                // 2 sources

                ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var2_2[var3_3].var_short_arr_do.length))
            }
lbl32:
            // 1 sources

            ++var3_3;
lbl33:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var3_3, (int)var1_1))
        }
lbl34:
        // 1 sources

        v1 = var0.readShort();
        var3_3 = v1;
        ak_0.var_gd_arr_do = new gd[v1];
        var4_4 = 0;
        if (-(70 ^ 66) < 0) ** GOTO lbl46
        return;
lbl-1000:
        // 1 sources

        {
            ak_0.var_gd_arr_do[var4_4] = new gd();
            ak_0.var_gd_arr_do[var4_4].var_short_do = var0.readByte();
            ak_0.var_gd_arr_do[var4_4].mangSoNguyen[0] = var0.readShort();
            ++var4_4;
lbl46:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var3_3))
        }
lbl47:
        // 1 sources

        var4_4 = 0;
        if (((16 ^ 12) & ~(221 ^ 193)) != "  ".length()) ** GOTO lbl54
        return;
lbl-1000:
        // 1 sources

        {
            var2_2[var4_4].var_short_arr_if[1] = var0.readShort();
            ++var4_4;
lbl54:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var1_1))
        }
lbl55:
        // 1 sources

        var4_4 = 0;
        if ((54 ^ 50) == (166 ^ 162)) ** GOTO lbl62
        return;
lbl-1000:
        // 1 sources

        {
            ak_0.var_gd_arr_do[var4_4].mangSoNguyen[1] = var0.readShort();
            ++var4_4;
lbl62:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var3_3))
        }
lbl63:
        // 1 sources

        var4_4 = var0.readShort();
        ak_0.var_java_util_Vector_do = new Vector<E>();
        var3_3 = 0;
        if (((77 ^ 2) & ~(240 ^ 191)) == 0) ** GOTO lbl108
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = new fc_0();
            new fc_0().var_byte_do = var0.readByte();
            var5_5.tenNhanVat = var0.readUTF();
            var5_5.chuoiGiaTri = var0.readUTF();
            var5_5.mangSoNguyen[0] = var0.readInt();
            var5_5.mangSoNguyen[1] = var0.readShort();
            var5_5.soLuong = var0.readShort();
            var5_5.var_short_do = var0.readShort();
            var6_9 = 0;
            if (-" ".length() != "   ".length()) ** GOTO lbl85
            return;
lbl-1000:
            // 1 sources

            {
                var5_5.var_short_arr_do[var6_9] = var0.readShort();
                ++var6_9;
lbl85:
                // 2 sources

                ** while (!ak_0.cfr_renamed_4((int)var6_9, (int)3))
            }
lbl86:
            // 1 sources

            var5_5.var_byte_for = var0.readByte();
            var6_9 = 0;
            if ("  ".length() != ((38 ^ 33) & ~(134 ^ 129))) ** GOTO lbl101
            return;
lbl-1000:
            // 1 sources

            {
                var7_13 = 0;
                if (((56 ^ 9) & ~(9 ^ 56)) == 0) ** GOTO lbl99
                return;
lbl-1000:
                // 1 sources

                {
                    var5_5.var_byte_arr_arr_do[var6_9][var7_13] = var0.readByte();
                    ++var7_13;
lbl99:
                    // 2 sources

                    ** while (!ak_0.cfr_renamed_4((int)var7_13, (int)12))
                }
lbl100:
                // 1 sources

                ++var6_9;
lbl101:
                // 2 sources

                ** while (!ak_0.cfr_renamed_4((int)var6_9, (int)3))
            }
lbl102:
            // 1 sources

            var5_5.var_byte_if = var0.readByte();
            var5_5.var_short_for = var0.readShort();
            var5_5.cfr_renamed_4 = var0.readShort();
            var5_5.var_short_if = var0.readShort();
            ak_0.var_java_util_Vector_do.addElement(var5_5);
            ++var3_3;
lbl108:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var3_3, (int)var4_4))
        }
lbl109:
        // 1 sources

        ak_0.var_java_util_Vector_if = new Vector<E>();
        var3_3 = var0.readByte();
        var5_6 = 0;
        if ("  ".length() != (0 ^ 43 ^ (134 ^ 169))) ** GOTO lbl127
        return;
lbl-1000:
        // 1 sources

        {
            var6_11 = new ff();
            new ff().dangChayAuto = 1;
            var6_11.var_short_do = var0.readShort();
            var6_11.var_short_if = var0.readShort();
            var6_11.var_byte_do = var0.readByte();
            var6_11.var_byte_if = var0.readByte();
            var6_11.chuoiGiaTri = var0.readUTF();
            var6_11.var_int_if = var0.readShort();
            var6_11.soLuong = var0.readShort();
            ak_0.var_java_util_Vector_if.addElement(var6_11);
            ++var5_6;
lbl127:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var5_6, (int)var3_3))
        }
lbl128:
        // 1 sources

        var5_6 = var0.readByte();
        var6_12 = 0;
        if (null == null) ** GOTO lbl142
        return;
lbl-1000:
        // 1 sources

        {
            var7_15 = new ff();
            new ff().dangChayAuto = 0;
            var7_15.var_short_do = var0.readShort();
            var7_15.var_short_if = var0.readShort();
            var7_15.chuoiGiaTri = var0.readUTF();
            var7_15.var_int_if = var0.readShort();
            var7_15.soLuong = var0.readShort();
            ++var6_12;
lbl142:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var6_12, (int)var5_6))
        }
lbl143:
        // 1 sources

        v2 = var0.readByte();
        var6_12 = v2;
        var7_16 = new dY[v2];
        var3_3 = 0;
        if ("  ".length() > " ".length()) ** GOTO lbl172
        return;
lbl-1000:
        // 1 sources

        {
            var7_16[var3_3] = new dY();
            var7_16[var3_3].dangChayAuto = 1;
            var7_16[var3_3].cfr_renamed_5 = var0.readShort();
            var7_16[var3_3].chuoiGiaTri = var0.readUTF();
            var7_16[var3_3].tenNhanVat = var7_16[var3_3].chuoiGiaTri.toLowerCase();
            var7_16[var3_3].var_short_do = var0.readShort();
            var7_16[var3_3].var_short_arr_if[0] = var0.readShort();
            var7_16[var3_3].var_short_arr_if[1] = var0.readShort();
            var7_16[var3_3].cfr_renamed_3 = var0.readShort();
            var7_16[var3_3].cfr_renamed_4 = var0.readShort();
            var7_16[var3_3].var_byte_do = var0.readByte();
            var7_16[var3_3].var_short_arr_do = new short[8];
            var4_4 = 0;
            if ("  ".length() == "  ".length()) ** GOTO lbl170
            return;
lbl-1000:
            // 1 sources

            {
                var7_16[var3_3].var_short_arr_do[var4_4] = var0.readShort();
                ++var4_4;
lbl170:
                // 2 sources

                ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var7_16[var3_3].var_short_arr_do.length))
            }
lbl171:
            // 1 sources

            ++var3_3;
lbl172:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var3_3, (int)var6_12))
        }
lbl173:
        // 1 sources

        var3_3 = var0.readShort();
        var4_4 = 0;
        if ((149 + 8 - 89 + 113 ^ 100 + 120 - 44 + 1) >= 0) ** GOTO lbl198
        return;
lbl-1000:
        // 1 sources

        {
            var5_7 = new dv_0();
            new dv_0().cfr_renamed_3 = var0.readShort();
            var5_7.chuoiGiaTri = var0.readUTF();
            var5_7.var_short_do = var0.readShort();
            var5_7.var_short_if = var0.readShort();
            var8_17 = var0.readShort();
            var5_7.var_short_arr_do = new short[var8_17];
            var5_7.var_short_arr_if = new short[var8_17];
            var9_19 = 0;
            if ("  ".length() >= 0) ** GOTO lbl195
            return;
lbl-1000:
            // 1 sources

            {
                var5_7.var_short_arr_do[var9_19] = var0.readShort();
                var5_7.var_short_arr_if[var9_19] = var0.readShort();
                ++var9_19;
lbl195:
                // 2 sources

                ** while (!ak_0.cfr_renamed_4((int)var9_19, (int)var8_17))
            }
lbl196:
            // 1 sources

            ak_0.var_java_util_Vector_for.addElement(var5_7);
            ++var4_4;
lbl198:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var4_4, (int)var3_3))
        }
lbl199:
        // 1 sources

        var4_4 = var0.readByte();
        var5_8 = 0;
        if ("   ".length() != -" ".length()) ** GOTO lbl214
        return;
lbl-1000:
        // 1 sources

        {
            var8_18 = new ff();
            new ff().dangChayAuto = 0;
            var8_18.var_short_do = var0.readShort();
            var8_18.var_short_if = var0.readShort();
            var8_18.chuoiGiaTri = var0.readUTF();
            var8_18.var_int_if = var0.readInt();
            var8_18.soLuong = var0.readInt();
            ak_0.var_java_util_Vector_if.addElement(var8_18);
            ++var5_8;
lbl214:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var5_8, (int)var4_4))
        }
lbl215:
        // 1 sources

        ak_0.var_dY_arr_do = new dY[var1_1 + var6_12];
        var5_8 = 0;
        if ("  ".length() < "   ".length()) ** GOTO lbl223
        return;
lbl-1000:
        // 1 sources

        {
            ak_0.var_dY_arr_do[var5_8] = var2_2[var5_8];
            ++var5_8;
lbl223:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var5_8, (int)var1_1))
        }
lbl224:
        // 1 sources

        var5_8 = var1_1;
        if ((167 + 158 - 212 + 77 ^ 106 + 177 - 210 + 113) >= "  ".length()) ** GOTO lbl231
        return;
lbl-1000:
        // 1 sources

        {
            ak_0.var_dY_arr_do[var5_8] = var7_16[var5_8 - var1_1];
            ++var5_8;
lbl231:
            // 2 sources

            ** while (!ak_0.cfr_renamed_4((int)var5_8, (int)(var6_12 + var1_1)))
        }
lbl232:
        // 1 sources

    }

    }

