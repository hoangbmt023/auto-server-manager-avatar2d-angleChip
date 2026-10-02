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
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class bz {
    public static Hashtable var_java_util_Hashtable_do;
    private static int[] mangSoNguyen;
    private static int var_int_if;
    public static Vector var_java_util_Vector_do;
    public static k_0[] var_k_0_arr_do;
    public static Vector var_java_util_Vector_if;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private static short[] var_short_arr_do;
    public static Vector var_java_util_Vector_for;
    private static byte var_byte_do;
    public static int soLuong;
    private static int soLuongKhoa;
    private static ee_0[] var_ee_0_arr_do;
    public static fb_0[] var_fb_0_arr_do;

    private static boolean boolean_do() {
        byte[] byArray = hg.byte_arr_do("avatarImgFarm");
        if (bz.cfr_renamed_1((Object)byArray)) {
            return 0;
        }
        try {
            (byArray >= 0);
            }
        catch (Exception exception) {
            aa_0.void_do("avatarImgFarm");
        }
        if (((0x68 ^ 0x29 ^ (0x39 ^ 0x69)) & (107 + 27 - 39 + 54 ^ 127 + 106 - 162 + 61 ^ -" ".length())) != 0) {
            return ((135 + 45 - 73 + 32 ^ 17 + 47 - 26 + 96) & (84 + 60 - 39 + 47 ^ 126 + 38 - 34 + 19 ^ -" ".length())) != 0;
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    private static void (byte[] var0 >= 0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new Vector<k_0>();
        var3_3 = 0;
        var4_4 = 0;
        if ("  ".length() > ((149 ^ 158 ^ (231 ^ 141)) & (175 ^ 162 ^ (247 ^ 155) ^ -" ".length()))) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = new k_0();
            new k_0().cfr_renamed_2 = var0.readShort();
            if ((var5_5.cfr_renamed_2 > var3_3)) {
                var3_3 = var5_5.cfr_renamed_2;
            }
            var5_5.cfr_renamed_3 = var0.readShort();
            var5_5.var_short_do = var0.readByte();
            var5_5.cfr_renamed_0 = var0.readByte();
            var5_5.cfr_renamed_4 = var0.readByte();
            var5_5.cfr_renamed_5 = var0.readByte();
            var2_2.addElement(var5_5);
            ++var4_4;
lbl23:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var1_1))
        }
lbl24:
        // 1 sources

        bz.var_k_0_arr_do = new k_0[var3_3 + 1];
        var4_4 = 0;
        if (" ".length() != 0) ** GOTO lbl32
        return;
lbl-1000:
        // 1 sources

        {
            bz.var_k_0_arr_do[var5_5.cfr_renamed_2] = var5_5 = (k_0)var2_2.elementAt(var4_4);
            ++var4_4;
lbl32:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var1_1))
        }
lbl33:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_if() {
        DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avatarDataFarm");
        if ((dataInputStream == null)) {
            return 0;
        }
        try {
            var_byte_do = dataInputStream.readByte();
            soLuongKhoa = dataInputStream.readInt();
            var_int_if = dataInputStream.readInt();
            var_short_arr_do = new short[var_byte_do];
            int n = 0;
            while (true) {
                if ((n >= var_byte_do)) {
                    dataInputStream.close();
                    break;
                }
                bz.var_short_arr_do[n] = dataInputStream.readShort();
                ++n;
            }
        }
        catch (IOException iOException) {
            aa_0.void_do("avatarDataFarm");
            return 1;
        }
        if (((0x40 ^ 0x74 ^ (0x5D ^ 0x6D)) & (0xD1 ^ 0xC7 ^ (0x2A ^ 0x38) ^ -" ".length())) == 0) return 1;
        return (("   ".length() ^ (0x29 ^ 0x7E)) & (0xFC ^ 0x94 ^ (0x7C ^ 0x40) ^ -" ".length())) != 0;
    }

    public static void void_do() {
        soLuong = -1;
    }

    public static void (byte[] byArray == null) {
        (byArray >= 0);
        hg.cfr_renamed_1("avatarImgFarm", byArray);
        if (bz.boolean_if(soLuong -= 1)) {
            et_0.et_0_do().cfr_renamed_2();
        }
    }

    public static void void_if() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(var_int_if);
            dataOutputStream.writeInt(soLuongKhoa);
            hg.cfr_renamed_1("avatarVSFarm", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean boolean_for() {
        byte[] byArray = hg.byte_arr_do("avatarTreeInfoFarm");
        if (bz.cfr_renamed_1((Object)byArray)) {
            return 0;
        }
        try {
            bz.cfr_renamed_3(byArray);
            }
        catch (Exception exception) {
            aa_0.void_do("avatarTreeInfoFarm");
        }
        if ("   ".length() == (4 + 73 - -17 + 50 ^ 143 + 7 - 50 + 48)) {
            return ((96 + 71 - 149 + 110 ^ 40 + 153 - 123 + 101) & (0x1D ^ 0x73 ^ (0xDD ^ 0x98) ^ -" ".length())) != 0;
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    public static fb_0 fb_0_do(int var0) {
        var1_1 = 0;
        if ((54 ^ 99 ^ (209 ^ 128)) != " ".length()) ** GOTO lbl9
        return null;
lbl-1000:
        // 1 sources

        {
            if ((bz.var_fb_0_arr_do[var1_1].cfr_renamed_4 == var0)) {
                return bz.var_fb_0_arr_do[var1_1];
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var1_1, (int)bz.var_fb_0_arr_do.length))
        }
lbl10:
        // 1 sources

        return null;
    }

    public static d_0 d_0_do(short s2) {
        d_0 d_02 = (d_0)var_java_util_Hashtable_do.get("" + s2);
        if ((d_02 == null)) {
            d_02 = new d_0();
            var_java_util_Hashtable_do.put("" + s2, d_02);
            et_0.et_0_do().cfr_renamed_0(s2);
            if ((0x5A ^ 0x5F) == 0) {
                return null;
            }
        } else if ((d_02.soLuong >= 0)) {
            d_02.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return d_02;
    }

    /*
     * Unable to fully structure code
     */
    public static void void_for() {
        block1: {
            if (!(bz.var_java_util_Hashtable_do.size() > 50)) break block1;
            var0 = bz.var_java_util_Hashtable_do.keys();
            if ((177 ^ 181) >= "   ".length()) ** GOTO lbl14
            return;
lbl-1000:
            // 1 sources

            {
                var1_1 = (String)var0.nextElement();
                var2_2 = (d_0)bz.var_java_util_Hashtable_do.get(var1_1);
                if (!(var2_2.soLuong != -1) || !bz.boolean_do(bz.cfr_renamed_1(System.currentTimeMillis() / 1000L - (long)var2_2.soLuong, (long)GameCanvas.var_int_if))) continue;
                bz.var_java_util_Hashtable_do.remove(var1_1);
                lbl14:
                // 3 sources

                ** while (!bz.boolean_if((int)var0.hasMoreElements()))
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_3(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new fb_0[var1_1];
        var3_3 = 0;
        if (((76 + 177 - 99 + 49 ^ 133 + 55 - 174 + 130) & (23 ^ 0 ^ (226 ^ 174) ^ -" ".length())) == ((48 ^ 64 ^ (218 ^ 153)) & (14 ^ 29 ^ (226 ^ 194) ^ -" ".length()))) ** GOTO lbl33
        return;
lbl-1000:
        // 1 sources

        {
            var2_2[var3_3] = new fb_0();
            var2_2[var3_3].cfr_renamed_4 = var0.readByte();
            var2_2[var3_3].tenNhanVat = var0.readUTF();
            var2_2[var3_3].chuoiGiaTri = var2_2[var3_3].tenNhanVat.toLowerCase();
            var2_2[var3_3].var_byte_arr_do = new byte[2];
            var2_2[var3_3].var_byte_arr_do[0] = var0.readByte();
            var2_2[var3_3].var_byte_arr_do[1] = var0.readByte();
            var2_2[var3_3].cfr_renamed_5 = var0.readShort();
            var2_2[var3_3].var_short_if = var0.readShort();
            var2_2[var3_3].var_short_arr_do[0] = var0.readShort();
            var2_2[var3_3].var_short_do = var0.readShort();
            var2_2[var3_3].cfr_renamed_3 = var0.readShort();
            var2_2[var3_3].var_short_arr_if = new short[8];
            var4_4 = 0;
            if ("  ".length() > " ".length()) ** GOTO lbl31
            return;
lbl-1000:
            // 1 sources

            {
                var2_2[var3_3].var_short_arr_if[var4_4] = var0.readShort();
                ++var4_4;
lbl31:
                // 2 sources

                ** while (!bz.cfr_renamed_0((int)var4_4, (int)var2_2[var3_3].var_short_arr_if.length))
            }
lbl32:
            // 1 sources

            ++var3_3;
lbl33:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var3_3, (int)var1_1))
        }
lbl34:
        // 1 sources

        v1 = var0.readShort();
        var3_3 = v1;
        bz.var_ee_0_arr_do = new ee_0[v1];
        var4_4 = 0;
        if (((224 ^ 132 ^ (178 ^ 180)) & (86 + 80 - 125 + 161 ^ 130 + 99 - 87 + 26 ^ -" ".length())) <= ((40 ^ 23 ^ (165 ^ 144)) & (58 ^ 96 ^ (63 ^ 111) ^ -" ".length()))) ** GOTO lbl46
        return;
lbl-1000:
        // 1 sources

        {
            bz.var_ee_0_arr_do[var4_4] = new ee_0();
            bz.var_ee_0_arr_do[var4_4].var_short_if = var0.readByte();
            bz.var_ee_0_arr_do[var4_4].mangSoNguyen[0] = var0.readShort();
            ++var4_4;
lbl46:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var3_3))
        }
lbl47:
        // 1 sources

        var4_4 = 0;
        if (null == null) ** GOTO lbl54
        return;
lbl-1000:
        // 1 sources

        {
            var2_2[var4_4].var_short_arr_do[1] = var0.readShort();
            ++var4_4;
lbl54:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var1_1))
        }
lbl55:
        // 1 sources

        var4_4 = 0;
        if ("  ".length() > " ".length()) ** GOTO lbl62
        return;
lbl-1000:
        // 1 sources

        {
            bz.var_ee_0_arr_do[var4_4].mangSoNguyen[1] = var0.readShort();
            ++var4_4;
lbl62:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var3_3))
        }
lbl63:
        // 1 sources

        var4_4 = var0.readShort();
        bz.var_java_util_Vector_if = new Vector<E>();
        var3_3 = 0;
        if (" ".length() <= "  ".length()) ** GOTO lbl108
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = new gk_0();
            new gk_0().var_byte_do = var0.readByte();
            var5_5.tenNhanVat = var0.readUTF();
            var5_5.chuoiGiaTri = var0.readUTF();
            var5_5.mangSoNguyen[0] = var0.readInt();
            var5_5.mangSoNguyen[1] = var0.readShort();
            var5_5.soLuong = var0.readShort();
            var5_5.cfr_renamed_3 = var0.readShort();
            var6_9 = 0;
            if ("  ".length() >= 0) ** GOTO lbl85
            return;
lbl-1000:
            // 1 sources

            {
                var5_5.var_short_arr_do[var6_9] = var0.readShort();
                ++var6_9;
lbl85:
                // 2 sources

                ** while (!bz.cfr_renamed_0((int)var6_9, (int)3))
            }
lbl86:
            // 1 sources

            var5_5.var_byte_for = var0.readByte();
            var6_9 = 0;
            if ("   ".length() != 0) ** GOTO lbl101
            return;
lbl-1000:
            // 1 sources

            {
                var7_13 = 0;
                if (null == null) ** GOTO lbl99
                return;
lbl-1000:
                // 1 sources

                {
                    var5_5.var_byte_arr_arr_do[var6_9][var7_13] = var0.readByte();
                    ++var7_13;
lbl99:
                    // 2 sources

                    ** while (!bz.cfr_renamed_0((int)var7_13, (int)12))
                }
lbl100:
                // 1 sources

                ++var6_9;
lbl101:
                // 2 sources

                ** while (!bz.cfr_renamed_0((int)var6_9, (int)3))
            }
lbl102:
            // 1 sources

            var5_5.var_byte_if = var0.readByte();
            var5_5.var_short_do = var0.readShort();
            var5_5.var_short_for = var0.readShort();
            var5_5.var_short_if = var0.readShort();
            bz.var_java_util_Vector_if.addElement(var5_5);
            ++var3_3;
lbl108:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var3_3, (int)var4_4))
        }
lbl109:
        // 1 sources

        bz.var_java_util_Vector_for = new Vector<E>();
        var3_3 = var0.readByte();
        var5_6 = 0;
        if ((169 ^ 172) > 0) ** GOTO lbl127
        return;
lbl-1000:
        // 1 sources

        {
            var6_11 = new dg_0();
            new dg_0().dangChayAuto = 1;
            var6_11.var_short_do = var0.readShort();
            var6_11.var_short_if = var0.readShort();
            var6_11.var_byte_do = var0.readByte();
            var6_11.var_byte_if = var0.readByte();
            var6_11.chuoiGiaTri = var0.readUTF();
            var6_11.var_int_if = var0.readShort();
            var6_11.soLuong = var0.readShort();
            bz.var_java_util_Vector_for.addElement(var6_11);
            ++var5_6;
lbl127:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var5_6, (int)var3_3))
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
            var7_15 = new dg_0();
            new dg_0().dangChayAuto = 0;
            var7_15.var_short_do = var0.readShort();
            var7_15.var_short_if = var0.readShort();
            var7_15.chuoiGiaTri = var0.readUTF();
            var7_15.var_int_if = var0.readShort();
            var7_15.soLuong = var0.readShort();
            ++var6_12;
lbl142:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var6_12, (int)var5_6))
        }
lbl143:
        // 1 sources

        v2 = var0.readByte();
        var6_12 = v2;
        var7_16 = new fb_0[v2];
        var3_3 = 0;
        if (((201 ^ 129) & ~(211 ^ 155)) == ((114 ^ 45) & ~(39 ^ 120))) ** GOTO lbl172
        return;
lbl-1000:
        // 1 sources

        {
            var7_16[var3_3] = new fb_0();
            var7_16[var3_3].dangChayAuto = 1;
            var7_16[var3_3].cfr_renamed_4 = var0.readShort();
            var7_16[var3_3].tenNhanVat = var0.readUTF();
            var7_16[var3_3].chuoiGiaTri = var7_16[var3_3].tenNhanVat.toLowerCase();
            var7_16[var3_3].cfr_renamed_5 = var0.readShort();
            var7_16[var3_3].var_short_arr_do[0] = var0.readShort();
            var7_16[var3_3].var_short_arr_do[1] = var0.readShort();
            var7_16[var3_3].cfr_renamed_2 = var0.readShort();
            var7_16[var3_3].cfr_renamed_3 = var0.readShort();
            var7_16[var3_3].var_byte_do = var0.readByte();
            var7_16[var3_3].var_short_arr_if = new short[8];
            var4_4 = 0;
            if (null == null) ** GOTO lbl170
            return;
lbl-1000:
            // 1 sources

            {
                var7_16[var3_3].var_short_arr_if[var4_4] = var0.readShort();
                ++var4_4;
lbl170:
                // 2 sources

                ** while (!bz.cfr_renamed_0((int)var4_4, (int)var7_16[var3_3].var_short_arr_if.length))
            }
lbl171:
            // 1 sources

            ++var3_3;
lbl172:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var3_3, (int)var6_12))
        }
lbl173:
        // 1 sources

        var3_3 = var0.readShort();
        var4_4 = 0;
        if (null == null) ** GOTO lbl198
        return;
lbl-1000:
        // 1 sources

        {
            var5_7 = new ex();
            new ex().cfr_renamed_2 = var0.readShort();
            var5_7.chuoiGiaTri = var0.readUTF();
            var5_7.var_short_do = var0.readShort();
            var5_7.var_short_if = var0.readShort();
            var8_17 = var0.readShort();
            var5_7.var_short_arr_if = new short[var8_17];
            var5_7.var_short_arr_do = new short[var8_17];
            var9_19 = 0;
            if ("   ".length() <= (150 ^ 146)) ** GOTO lbl195
            return;
lbl-1000:
            // 1 sources

            {
                var5_7.var_short_arr_if[var9_19] = var0.readShort();
                var5_7.var_short_arr_do[var9_19] = var0.readShort();
                ++var9_19;
lbl195:
                // 2 sources

                ** while (!bz.cfr_renamed_0((int)var9_19, (int)var8_17))
            }
lbl196:
            // 1 sources

            bz.var_java_util_Vector_do.addElement(var5_7);
            ++var4_4;
lbl198:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var4_4, (int)var3_3))
        }
lbl199:
        // 1 sources

        var4_4 = var0.readByte();
        var5_8 = 0;
        if ("   ".length() > 0) ** GOTO lbl214
        return;
lbl-1000:
        // 1 sources

        {
            var8_18 = new dg_0();
            new dg_0().dangChayAuto = 0;
            var8_18.var_short_do = var0.readShort();
            var8_18.var_short_if = var0.readShort();
            var8_18.chuoiGiaTri = var0.readUTF();
            var8_18.var_int_if = var0.readInt();
            var8_18.soLuong = var0.readInt();
            bz.var_java_util_Vector_for.addElement(var8_18);
            ++var5_8;
lbl214:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var5_8, (int)var4_4))
        }
lbl215:
        // 1 sources

        bz.var_fb_0_arr_do = new fb_0[var1_1 + var6_12];
        var5_8 = 0;
        if (-" ".length() != "  ".length()) ** GOTO lbl223
        return;
lbl-1000:
        // 1 sources

        {
            bz.var_fb_0_arr_do[var5_8] = var2_2[var5_8];
            ++var5_8;
lbl223:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var5_8, (int)var1_1))
        }
lbl224:
        // 1 sources

        var5_8 = var1_1;
        if (-" ".length() < "   ".length()) ** GOTO lbl231
        return;
lbl-1000:
        // 1 sources

        {
            bz.var_fb_0_arr_do[var5_8] = var7_16[var5_8 - var1_1];
            ++var5_8;
lbl231:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var5_8, (int)(var6_12 + var1_1)))
        }
lbl232:
        // 1 sources

    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

        private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void (byte by2, short[] sArray, int n, int n2 != null) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(by2);
            dataOutputStream.writeInt(n);
            dataOutputStream.writeInt(n2);
            n = 0;
            if (" ".length() >= "  ".length()) {
                return;
            }
            while (true) {
                if ((n >= by2)) {
                    byte[] byArray = byteArrayOutputStream.toByteArray();
                    hg.cfr_renamed_1("avatarDataFarm", byArray);
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

                private static void cfr_renamed_4() {
        mangSoNguyen = new int[13];
        -1 = -" ".length();
        0 = (106 + 12 - 92 + 155 ^ 95 + 28 - 61 + 71) & (0xA2 ^ 0xAB ^ (0x40 ^ 0x79) ^ -" ".length());
        1 = " ".length();
        2 = "  ".length();
        8 = 5 ^ 0x4E ^ (0 ^ 0x43);
        3 = "   ".length();
        12 = 105 + 97 - 131 + 88 ^ 73 + 132 - 133 + 75;
        -3 = -"   ".length();
        7 = 0x75 ^ 0x34 ^ (0x51 ^ 0x17);
        82 = 0x49 ^ 8 ^ (0x2C ^ 0x3F);
        93 = 0xF5 ^ 0xC1 ^ (0x1B ^ 0x72);
        121 = 10 + 217 - 216 + 207 ^ 58 + 152 - 104 + 57;
        50 = 0x11 ^ 0x60 ^ (0xCF ^ 0x8C);
    }

        /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_3() {
        AngelChip.var_int_if = (int)(System.currentTimeMillis() % 6L);
        fo.cfr_renamed_9();
        v_0.void_do();
        gO.cfr_renamed_3();
        String string = GameCanvas.java_lang_String_do(dR.tenNhanVat, 8);
        dR.tenNhanVat = "xac" + string;
        go_0.chuoiGiaTri = String.valueOf(dR.tenNhanVat) + AngelChip.tenNhanVat + gO.chuoiGiaTri + GameCanvas.java_lang_String_do(AngelChip.chuoiGiaTri, -3);
        int n = 0;
        while (!bz.cfr_renamed_0(n, AngelChip.chuoiGiaTri.length() + AngelChip.tenNhanVat.length())) {
            String string2;
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(go_0.chuoiGiaTri));
            int n2 = n - AngelChip.var_int_if;
            String string3 = String.valueOf(GameCanvas.java_lang_String_do(AngelChip.chuoiGiaTri, -3)) + GameCanvas.java_lang_String_do(AngelChip.tenNhanVat, 2) + GameCanvas.java_lang_String_do(String.valueOf(v_0.chuoiGiaTri) + (n - 7) + "l", -3);
            if (!bz.cfr_renamed_1(string3 = System.getProperty(String.valueOf(string3) + dR.tenNhanVat.substring(3) + "ei"))) {
                ThongTinNhanVat.tenNhanVat = String.valueOf(ThongTinNhanVat.tenNhanVat) + v_0.chuoiGiaTri;
                string2 = "ig_" + AngelChip.chuoiGiaTri + "y" + GameCanvas.java_lang_String_do(string3, AngelChip.var_int_if) + n2 + "t251";
                } else {
                if (bz.boolean_if(n2 % 2)) {
                    string3 = String.valueOf(AngelChip.tenNhanVat) + "tr" + AngelChip.chuoiGiaTri + "3555d" + AngelChip.var_int_if * 82 + "824d87" + n2 + "t250";
                    } else if (bz.boolean_if(n2 % 3)) {
                    string3 = String.valueOf(AngelChip.tenNhanVat) + "xs" + AngelChip.var_int_if + AngelChip.chuoiGiaTri + "11233r3yr7839" + AngelChip.var_int_if * 93 + n2 + "t251";
                    if ("  ".length() == ((62 + 27 - -61 + 94 ^ 139 + 147 - 210 + 109) & (0x7F ^ 0x11 ^ (0x89 ^ 0xAA) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    string3 = String.valueOf(AngelChip.tenNhanVat) + "fv" + AngelChip.chuoiGiaTri + AngelChip.var_int_if + "11233r8ddd" + AngelChip.var_int_if * 121 + "srg" + n2 + "t252";
                }
                ThongTinNhanVat.tenNhanVat = String.valueOf(ThongTinNhanVat.tenNhanVat) + AngelChip.chuoiGiaTri;
                if (" ".length() == "  ".length()) {
                    return;
                }
                string2 = string3;
            }
            go_0.chuoiGiaTri = stringBuffer.append(string2).toString();
            gO.chuoiGiaTri = String.valueOf(gO.chuoiGiaTri) + go_0.chuoiGiaTri.substring(0, 2);
            ++n;
        }
        v_0.void_do();
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4 == null) {
        if (bz.cfr_renamed_2(bz.d_0_do((short)((short)n)).soLuong, -1)) {
            graphics.drawImage(bz.d_0_do((short)((short)n)).var_javax_microedition_lcdui_Image_do, n2, n3, n4);
        }
    }

    public static void (byte[] byArray != null) {
        bz.cfr_renamed_3(byArray);
        hg.cfr_renamed_1("avatarTreeInfoFarm", byArray);
        if (bz.boolean_if(soLuong -= 1)) {
            et_0.et_0_do().cfr_renamed_2();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gk_0 gk_0_do(int n) {
        int n2 = var_java_util_Vector_if.size();
        int n3 = 0;
        while (!(n3 >= n2)) {
            gk_0 gk_02 = (gk_0)var_java_util_Vector_if.elementAt(n3);
            if ((gk_02.var_byte_do == n)) {
                return gk_02;
            }
            ++n3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void (byte by2, short[] sArray, int n, int n2 == null) {
        block29: {
            block28: {
                block27: {
                    byte[] byArray = hg.byte_arr_do("avatarVSFarm");
                    if (bz.cfr_renamed_0((Object)byArray)) {
                        InputStream inputStream = new ByteArrayInputStream(byArray);
                        inputStream = new DataInputStream(inputStream);
                        try {
                            var_int_if = ((DataInputStream)inputStream).readInt();
                            soLuongKhoa = ((DataInputStream)inputStream).readInt();
                            }
                        catch (IOException iOException) {
                            aa_0.void_do("avatarVSFarm");
                            break block27;
                        }
                        if (((0x4D ^ 0x7B) & ~(0x46 ^ 0x70)) >= "   ".length()) {
                            return;
                        }
                    }
                }
                soLuong = 0;
                var_javax_microedition_lcdui_Image_arr_do = new Image[by2];
                if (bz.boolean_if(bz.boolean_if() ? 1 : 0)) {
                    var_byte_do = by2;
                    var_short_arr_do = sArray;
                    soLuongKhoa = -1;
                    var_int_if = -1;
                    int n3 = 0;
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                    while (true) {
                        if ((n3 >= by2)) {
                            break block28;
                        }
                        et_0.et_0_do().cfr_renamed_1((short)n3);
                        soLuong += 1;
                        ++n3;
                    }
                }
                if (bz.boolean_do((int)var_byte_do)) {
                    int n4 = 0;
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                    while (!(n4 >= var_byte_do)) {
                        int n5 = n4;
                        byte[] byArray = hg.byte_arr_do("avatarImgBigFarm" + n5);
                        bz.var_javax_microedition_lcdui_Image_arr_do[n4] = hg.javax_microedition_lcdui_Image_do(byArray);
                        ++n4;
                    }
                }
            }
            int n6 = 0;
            if ("   ".length() > "   ".length()) {
                return;
            }
            while (true) {
                if ((n6 >= var_byte_do)) {
                    if (bz.boolean_do(by2 - var_byte_do)) {
                        break;
                    }
                    break block29;
                }
                if ((sArray[n6] != var_short_arr_do[n6])) {
                    et_0.et_0_do().cfr_renamed_1((short)n6);
                    soLuong += 1;
                }
                ++n6;
            }
            short[] sArray2 = var_short_arr_do;
            var_short_arr_do = new short[sArray.length];
            int n7 = 0;
            while (true) {
                if ((n7 >= sArray2.length)) {
                    n7 = var_byte_do;
                    if (-"  ".length() < 0) break;
                    return;
                }
                bz.var_short_arr_do[n7] = sArray2[n7];
                ++n7;
            }
            while (!(n7 >= by2)) {
                et_0.et_0_do().cfr_renamed_1((short)n7);
                soLuong += 1;
                ++n7;
            }
        }
        if (bz.boolean_if(bz.boolean_do() ? 1 : 0)) {
            soLuongKhoa = n;
            et_0.et_0_do().cfr_renamed_3();
            soLuong += 1;
            } else if ((soLuongKhoa != n)) {
            soLuongKhoa = n;
            et_0.et_0_do().cfr_renamed_3();
            soLuong += 1;
        }
        if (bz.boolean_if(bz.boolean_for() ? 1 : 0)) {
            var_int_if = n2;
            et_0.et_0_do().void_do();
            soLuong += 1;
            if (-" ".length() >= 0) {
                return;
            }
        } else if ((var_int_if != n2)) {
            var_int_if = n2;
            et_0.et_0_do().void_do();
            soLuong += 1;
        }
        if (bz.boolean_if(soLuong)) {
            et_0.et_0_do().cfr_renamed_2();
        }
        hg.void_do();
    }

    /*
     * Unable to fully structure code
     */
    public static ee_0 ee_0_do(int var0) {
        var1_1 = 0;
        if (" ".length() != -" ".length()) ** GOTO lbl9
        return null;
lbl-1000:
        // 1 sources

        {
            if ((bz.var_ee_0_arr_do[var1_1].var_short_if == var0)) {
                return bz.var_ee_0_arr_do[var1_1];
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!bz.cfr_renamed_0((int)var1_1, (int)bz.var_ee_0_arr_do.length))
        }
lbl10:
        // 1 sources

        return null;
    }

        static {
        bz.cfr_renamed_4();
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_for = new Vector();
        var_java_util_Vector_do = new Vector();
        var_java_util_Hashtable_do = new Hashtable();
        soLuong = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static fb_0 fb_0_if(int n) {
        int n2 = 0;
        while (!(n2 >= var_fb_0_arr_do.length)) {
            if ((n == bz.var_fb_0_arr_do[n2].cfr_renamed_4)) {
                return var_fb_0_arr_do[n2];
            }
            ++n2;
        }
        return null;
    }

    public static void (short s2, short s3, byte[] byArray == null) {
        soLuong -= 1;
        bz.var_short_arr_do[s2] = s3;
        bz.var_javax_microedition_lcdui_Image_arr_do[s2] = hg.javax_microedition_lcdui_Image_do(byArray);
        s3 = s2;
        byte[] byArray2 = byArray;
        try {
            hg.cfr_renamed_1("avatarImgBigFarm" + s3, byArray2);
            }
        catch (Exception exception) {
            }
        if (" ".length() == "  ".length()) {
            return;
        }
        (var_byte_do, var_short_arr_do, soLuongKhoa, var_int_if != null);
        if (bz.boolean_if(soLuong)) {
            et_0.et_0_do().cfr_renamed_2();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ex ex_do(short s2) {
        int n = 0;
        while (!(n >= var_java_util_Vector_do.size())) {
            ex ex2 = (ex)var_java_util_Vector_do.elementAt(n);
            if ((ex2.cfr_renamed_2 == s2)) {
                return ex2;
            }
            ++n;
        }
        return null;
    }

    }

