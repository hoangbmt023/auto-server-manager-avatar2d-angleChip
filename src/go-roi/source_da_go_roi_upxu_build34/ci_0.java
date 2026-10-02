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
 * Renamed from cI
 */
public final class ci_0 {
    private static String tenNhanVat;
    private static int[] mangSoNguyen;
    public static bH[] var_bH_arr_do;
    public static Vector var_java_util_Vector_do;
    public static q_0[] var_q_0_arr_do;
    private static Hashtable var_java_util_Hashtable_int;
    private static Vector var_java_util_Vector_try;
    private static Hashtable var_java_util_Hashtable_new;
    public static Hashtable var_java_util_Hashtable_do;
    private static int var_int_if;
    private static int soLuongKhoa;
    public static Vector var_java_util_Vector_if;
    public static String chuoiGiaTri;
    public static Hashtable var_java_util_Hashtable_if;
    private static int var_int_int;
    public static Vector var_java_util_Vector_for;
    public static int soLuong;
    private static int var_int_new;
    public static Vector var_java_util_Vector_int;
    private static int var_int_try;
    public static Hashtable var_java_util_Hashtable_for;
    public static Vector var_java_util_Vector_new;

    public static gy_0 gy_0_do(int n) {
        return (gy_0)var_java_util_Hashtable_new.get("" + n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void void_do() {
        try {
            String[] stringArray = RecordStore.listRecordStores();
            if (!(stringArray != null)) return;
            int n = 0;
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

    public static an an_do(short s2) {
        an an2 = (an)var_java_util_Hashtable_do.get("" + s2);
        if ((an2 == null)) {
            an2 = new an();
            var_java_util_Hashtable_do.put("" + s2, an2);
            eq.eq_do().cfr_renamed_3(s2);
            if (" ".length() > (0x4B ^ 0x4F)) {
                return null;
            }
        } else if ((an2.soLuong >= 0)) {
            an2.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return an2;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[18];
        -1 = -" ".length();
        0 = (0xD7 ^ 0x80) & ~(0x22 ^ 0x75);
        1 = " ".length();
        -2 = -"  ".length();
        15 = 0x93 ^ 0x9C;
        5 = 0x3C ^ 0x39;
        32767 = -" ".length() & (0xFFFFFFFF & Short.MAX_VALUE);
        1000 = 0xFFFFD3ED & 0x2FFA;
        16711935 = -(0xFFFF9F89 & 0x6677) & (0xFFFFB7FF & 0xFF4EFF);
        2000 = -(0xFFFFC07E & 0x7FAF) & (0xFFFFF7FD & 0x4FFF);
        -65281 = -(0xFFFFFF4B & 0xFFB5);
        4 = 0xAF ^ 0xAB;
        2 = "  ".length();
        10 = 169 + 58 - 29 + 6 ^ 3 + 51 - -90 + 54;
        20 = 0xBC ^ 0xA8;
        30 = 0xAA ^ 0xB4;
        40 = 62 + 30 - 45 + 130 ^ 119 + 148 - 252 + 138;
        50 = 0x58 ^ 0x10 ^ (0x41 ^ 0x3B);
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
     * Unable to fully structure code
     */
    public static ef (int var0 > Vector var1_1) {
        var2_2 = var1_1.size();
        var3_3 = 0;
        if ("  ".length() <= (133 ^ 129)) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = (ef)var1_1.elementAt(var3_3);
            if (ci_0.cfr_renamed_5(ci_0.q_0_do((short)var4_4.var_short_do).var_byte_if, var0)) {
                return var4_4;
            }
            ++var3_3;
lbl11:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)var2_2))
        }
lbl12:
        // 1 sources

        return null;
    }

    public static void void_if() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(AngelChip.var_byte_do);
            dataOutputStream.writeUTF(AngelChip.cfr_renamed_3);
            gc_0.cfr_renamed_0("avatarSV", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean boolean_do() {
        DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avatarImgBig");
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
                gy_0 gy_02 = new gy_0();
                new gy_0().cfr_renamed_1 = dataInputStream.readShort();
                gy_02.cfr_renamed_3 = dataInputStream.readShort();
                int n2 = dataInputStream.readInt();
                gy_02.var_byte_arr_do = new byte[n2];
                dataInputStream.read(gy_02.var_byte_arr_do);
                gy_02.var_short_do = dataInputStream.readShort();
                var_java_util_Vector_try.addElement(gy_02);
                ++n;
            }
        }
        catch (Exception exception) {
            ci_0.void_do("avatarImgBig");
            return 1;
        }
        if ((0x2E ^ 0x2A) != -" ".length()) return 1;
        return ((0xD9 ^ 0x83) & ~(0x18 ^ 0x42)) != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void cfr_renamed_15() {
        gy_0 gy_02;
        block14: {
            if ((soLuong != 0)) {
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(var_int_int);
                dataOutputStream.writeInt(var_int_try);
                dataOutputStream.writeInt(soLuongKhoa);
                dataOutputStream.writeInt(var_int_if);
                dataOutputStream.writeInt(var_int_new);
                gc_0.cfr_renamed_0("avatarVs", byteArrayOutputStream.toByteArray());
                dataOutputStream.close();
                }
            catch (Exception exception) {
                break block14;
            }
            if (" ".length() <= 0) {
                return;
            }
        }
        ci_0.cfr_renamed_12();
        int n = var_java_util_Vector_try.size();
        int n2 = 0;
        if ((0x4B ^ 0x4F) <= "   ".length()) {
            return;
        }
        while (true) {
            if ((n2 >= n)) {
                if (!ci_0.boolean_if(GameCanvas.var_boolean_int ? 1 : 0) || (GameCanvas.var_boolean_case)) {
                    var_java_util_Hashtable_int = new Hashtable();
                }
                n2 = 0;
                if ("   ".length() > 0) break;
                return;
            }
            gy_02 = (gy_0)var_java_util_Vector_try.elementAt(n2);
            if ((gy_02.cfr_renamed_3 != -1)) {
                byte[] byArray = ci_0.gy_0_if((int)gy_02.cfr_renamed_3).var_byte_arr_do;
                System.arraycopy(gy_02.var_byte_arr_do, 0, byArray, 0, gy_02.var_byte_arr_do.length);
                gy_02.var_byte_arr_do = byArray;
            }
            gy_02.var_javax_microedition_lcdui_Image_do = gc_0.javax_microedition_lcdui_Image_do(gy_02.var_byte_arr_do);
            ++n2;
        }
        while (true) {
            if ((n2 >= var_java_util_Vector_try.size())) {
                n2 = 0;
                if ("  ".length() < "   ".length()) break;
                return;
            }
            gy_02 = (gy_0)var_java_util_Vector_try.elementAt(n2);
            ((gy_0)var_java_util_Vector_try.elementAt(n2)).var_byte_arr_do = null;
            var_java_util_Hashtable_new.put("" + gy_02.cfr_renamed_1, gy_02);
            ++n2;
        }
        while (true) {
            if ((n2 >= var_java_util_Vector_try.size())) {
                var_java_util_Vector_try.removeAllElements();
                var_java_util_Vector_try = null;
                AngelChip.duLieuNguoiChoi.void_if();
                fe_0.fe_0_do().cfr_renamed_11();
                return;
            }
            gy_02 = (gy_0)var_java_util_Vector_try.elementAt(n2);
            if ((var_java_util_Hashtable_int != null)) {
                (gy_02 != null);
            }
            ++n2;
        }
    }

        /*
     * Unable to fully structure code
     */
    private static Vector java_util_Vector_do(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        var2_2 = new Vector<fi_0>();
        var3_3 = 0;
        if ("  ".length() != 0) ** GOTO lbl44
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = new fi_0();
            new fi_0().cfr_renamed_3 = var0.readShort();
            var4_4.chuoiGiaTri = var0.readUTF();
            var0.readUTF();
            var4_4.cfr_renamed_4 = var0.readShort();
            var4_4.cfr_renamed_2 = var0.readShort();
            var4_4.cfr_renamed_1 = var0.readByte();
            var4_4.var_short_do = var0.readByte();
            var4_4.soLuong = var0.readShort();
            if ((var4_4.soLuong == 32767)) {
                var4_4.soLuong = -1;
            }
            if ((var4_4.soLuong >= 0)) {
                var4_4.soLuong *= 1000;
            }
            var4_4.cfr_renamed_5 = var0.readShort();
            var4_4.var_byte_do = var0.readByte();
            var4_4.var_java_util_Vector_do = new Vector<E>();
            var5_5 = var0.readByte();
            var6_6 = 0;
            if ((148 ^ 178 ^ (123 ^ 89)) != 0) ** GOTO lbl41
            return null;
lbl-1000:
            // 1 sources

            {
                var7_7 = new eq_0();
                new eq_0().var_int_if = var0.readByte();
                var7_7.soLuong = var0.readByte();
                var4_4.var_java_util_Vector_do.addElement(var7_7);
                var6_6 = (byte)(var6_6 + 1);
lbl41:
                // 2 sources

                ** while (!ci_0.cfr_renamed_4((int)var6_6, (int)var5_5))
            }
lbl42:
            // 1 sources

            var2_2.addElement(var4_4);
            var3_3 = (byte)(var3_3 + 1);
lbl44:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)var1_1))
        }
lbl45:
        // 1 sources

        return var2_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static bH[] bH_arr_do(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        short s2 = ((DataInputStream)object).readShort();
        Vector<bH> vector = new Vector<bH>();
        int n = 0;
        int n2 = 0;
        while (!(n2 >= s2)) {
            bH bH2 = new bH();
            new bH().var_short_do = ((DataInputStream)object).readShort();
            if (ci_0.cfr_renamed_0((int)bH2.var_short_do, n)) {
                n = bH2.var_short_do;
            }
            bH2.cfr_renamed_1 = ((DataInputStream)object).readShort();
            bH2.cfr_renamed_4 = (short)((DataInputStream)object).readUnsignedByte();
            bH2.cfr_renamed_2 = (short)((DataInputStream)object).readUnsignedByte();
            bH2.cfr_renamed_5 = ((DataInputStream)object).readByte();
            bH2.cfr_renamed_3 = ((DataInputStream)object).readByte();
            vector.addElement(bH2);
            ++n2;
        }
        bH[] bHArray = new bH[n + 1];
        int n3 = 0;
        while (!(n3 >= vector.size())) {
            bHArray[((bH)object).var_short_do] = object = (bH)vector.elementAt(n3);
            ++n3;
        }
        return bHArray;
    }

    public static q_0 q_0_do(short s2) {
        if ((s2 >= 2000)) {
            q_0 q_02 = (q_0)var_java_util_Hashtable_for.get("" + s2);
            if (ci_0.cfr_renamed_0((Object)q_02)) {
                q_02 = new ci();
                new ci().var_short_do = (short)-1;
                var_java_util_Hashtable_for.put("" + s2, q_02);
                eq.eq_do().cfr_renamed_0(s2);
            }
            return q_02;
        }
        return var_q_0_arr_do[s2];
    }

    /*
     * Unable to fully structure code
     */
    public static void (Vector var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5 == null) {
        gc_0.cfr_renamed_0("avatar", "2.5.8");
        try {
            block45: {
                block44: {
                    ci_0.soLuong = 0;
                    var6_6 = gc_0.byte_arr_do("avatarVs");
                    if ((var6_6 != null)) {
                        var6_6 = new ByteArrayInputStream((byte[])var6_6);
                        v0 = new DataInputStream((InputStream)var6_6);
                        var6_6 = v0;
                        ci_0.var_int_int = v0.readInt();
                        ci_0.var_int_try = var6_6.readInt();
                        ci_0.soLuongKhoa = var6_6.readInt();
                        ci_0.var_int_if = var6_6.readInt();
                        ci_0.var_int_new = var6_6.readInt();
                    }
                    if (!ci_0.boolean_if((int)ci_0.boolean_do())) break block44;
                    ci_0.var_java_util_Vector_try = var0;
                    var6_7 = var0.size();
                    var7_9 = 0;
                    if (((90 ^ 15) & ~(147 ^ 198)) == 0) ** GOTO lbl26
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_11 = (gy_0)var0.elementAt(var7_9);
                        db_0.db_0_do().cfr_renamed_3(var8_11.cfr_renamed_1);
                        ci_0.soLuong += 1;
                        ++var7_9;
lbl26:
                        // 2 sources

                        ** while (!ci_0.cfr_renamed_4((int)var7_9, (int)var6_7))
                    }
lbl27:
                    // 1 sources

                    if (((53 + 68 - 61 + 106 ^ 27 + 91 - 71 + 136) & (9 + 134 - 46 + 83 ^ 115 + 14 - -24 + 12 ^ -" ".length())) != 0) {
                        return;
                    }
                    break block45;
                }
                var6_7 = var0.size();
                var7_10 = 0;
                if (-" ".length() <= "  ".length()) ** GOTO lbl54
                return;
lbl-1000:
                // 1 sources

                {
                    var8_12 = (gy_0)var0.elementAt(var7_10);
                    var9_13 = ci_0.gy_0_if((int)var8_12.cfr_renamed_1);
                    if (ci_0.cfr_renamed_0((Object)var9_13)) {
                        ci_0.var_java_util_Vector_try.addElement(var8_12);
                        db_0.db_0_do().cfr_renamed_3(var8_12.cfr_renamed_1);
                        ci_0.soLuong += 1;
                        if ((150 ^ 146) <= "   ".length()) {
                            return;
                        }
                    } else if ((var8_12.var_short_do != var9_13.var_short_do)) {
                        db_0.db_0_do().cfr_renamed_3(var8_12.cfr_renamed_1);
                        ci_0.soLuong += 1;
                    }
                    ++var7_10;
lbl54:
                    // 2 sources

                    ** while (!ci_0.cfr_renamed_4((int)var7_10, (int)var6_7))
                }
            }
            var6_8 = gc_0.byte_arr_do("avatarImgData");
            ci_0.chuoiGiaTri = gc_0.java_lang_String_do("partImageNormal");
            if (ci_0.cfr_renamed_0((Object)var6_8)) {
                v1 = 0;
                if (-(14 ^ 16 ^ (116 ^ 110)) >= 0) {
                    return;
                }
            } else {
                ci_0.var_bH_arr_do = ci_0.bH_arr_do(var6_8);
                v1 = 1;
            }
            if (ci_0.boolean_if(v1)) {
                ci_0.soLuongKhoa = var1_1;
                db_0.db_0_do().cfr_renamed_2();
                ci_0.soLuong += 1;
                if (((14 ^ 74 ^ (18 ^ 91)) & (37 + 78 - 105 + 145 ^ 63 + 36 - 18 + 69 ^ -" ".length())) != (("   ".length() ^ (46 ^ 2)) & (230 ^ 145 ^ (86 ^ 14) ^ -" ".length()))) {
                    return;
                }
            } else if ((ci_0.soLuongKhoa != var1_1)) {
                ci_0.soLuongKhoa = var1_1;
                db_0.db_0_do().cfr_renamed_2();
                ci_0.soLuong += 1;
            }
            if (ci_0.boolean_if((int)ci_0.boolean_if())) {
                ci_0.var_int_int = var2_2;
                db_0.db_0_do().cfr_renamed_5();
                ci_0.soLuong += 1;
                if ((85 ^ 81) < ((214 ^ 180) & ~(209 ^ 179))) {
                    return;
                }
            } else if ((ci_0.var_int_int != var2_2)) {
                ci_0.var_int_int = var2_2;
                db_0.db_0_do().cfr_renamed_5();
                ci_0.soLuong += 1;
                } else {
                ci_0.cfr_renamed_8();
            }
            if (ci_0.cfr_renamed_0((Object)(var6_8 = gc_0.byte_arr_do("avatarItemInfo")))) {
                v2 = 0;
                if (-" ".length() < -" ".length()) {
                    return;
                }
            } else {
                ci_0.cfr_renamed_2(var6_8);
                v2 = 1;
            }
            if (ci_0.boolean_if(v2)) {
                ci_0.var_int_if = var3_3;
                db_0.db_0_do().cfr_renamed_4();
                ci_0.soLuong += 1;
                } else if ((ci_0.var_int_if != var3_3)) {
                ci_0.var_int_if = var3_3;
                db_0.db_0_do().cfr_renamed_4();
                ci_0.soLuong += 1;
            }
            if (ci_0.cfr_renamed_0((Object)(var6_8 = gc_0.byte_arr_do("avatarMapItemType")))) {
                v3 = 0;
                if ((39 ^ 72 ^ (44 ^ 71)) == "  ".length()) {
                    return;
                }
            } else {
                ci_0.var_java_util_Vector_for = ci_0.java_util_Vector_do(var6_8);
                v3 = 1;
            }
            if (ci_0.boolean_if(v3)) {
                ci_0.var_int_try = var4_4;
                db_0.db_0_do().void_do();
                ci_0.soLuong += 1;
                } else if ((ci_0.var_int_try != var4_4)) {
                ci_0.var_int_try = var4_4;
                db_0.db_0_do().void_do();
                ci_0.soLuong += 1;
            }
            if (ci_0.cfr_renamed_0((Object)(var6_8 = gc_0.byte_arr_do("avatarMapType")))) {
                v4 = 0;
                } else {
                ci_0.cfr_renamed_15(var6_8);
                v4 = 1;
            }
            if (ci_0.boolean_if(v4)) {
                ci_0.var_int_new = var5_5;
                db_0.db_0_do().cfr_renamed_3();
                ci_0.soLuong += 1;
                if ("  ".length() <= 0) {
                    return;
                }
            } else if ((ci_0.var_int_new != var5_5)) {
                ci_0.var_int_new = var5_5;
                db_0.db_0_do().cfr_renamed_3();
                ci_0.soLuong += 1;
            }
            ci_0.cfr_renamed_15();
            return;
        }
        catch (Exception v5) {
            v5.printStackTrace();
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static ci ci_do(Vector var0, int var1_1) {
        block2: {
            if (!(var0 != null)) break block2;
            var2_2 = 0;
            if ("  ".length() >= 0) ** GOTO lbl12
            return null;
lbl-1000:
            // 1 sources

            {
                var3_3 = (ef)var0.elementAt(var2_2);
                var4_4 = ci_0.q_0_do(var3_3.var_short_do);
                if ((var3_3 != null) && (var4_4 instanceof ci != 0) && ci_0.cfr_renamed_5(((ci)var4_4).var_byte_if, var1_1)) {
                    return (ci)var4_4;
                }
                ++var2_2;
lbl12:
                // 2 sources

                ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var0.size()))
            }
        }
        return null;
    }

            /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Vector (byte[] var0 > boolean var1_1) {
        var0 = new ByteArrayInputStream((byte[])var0);
        var0 = new DataInputStream((InputStream)var0);
        var2_3 = 1;
        if (ci_0.boolean_if((int)var1_1)) {
            var2_3 = var0.readShort();
        }
        var1_2 = new Vector<dt_0>();
        var3_4 = 0;
        if (null == null) ** GOTO lbl73
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
                        var8_9 /* !! */  = new dt_0();
                        new dt_0().var_short_do = var4_5;
                        var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                        var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                        var8_9 /* !! */ .cfr_renamed_3 = var7_8;
                        var8_9 /* !! */ .chuoiGiaTri = var0.readUTF();
                        var8_9 /* !! */ .var_byte_do = var0.readByte();
                        var8_9 /* !! */ .var_short_if = var0.readShort();
                        var1_2.addElement(var8_9 /* !! */ );
                        break block6;
                    }
                    if (!(var7_8 == -1)) break block7;
                    var8_9 /* !! */  = new ci();
                    new ci().var_short_do = var4_5;
                    var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                    var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                    var8_9 /* !! */ .cfr_renamed_3 = var7_8;
                    var8_9 /* !! */ .chuoiGiaTri = var0.readUTF();
                    var8_9 /* !! */ .var_byte_do = var0.readByte();
                    var8_9 /* !! */ .var_byte_if = var0.readByte();
                    var8_9 /* !! */ .cfr_renamed_3 = var0.readByte();
                    var8_9 /* !! */ .cfr_renamed_4 = var0.readByte();
                    var8_9 /* !! */ .var_short_if = var0.readShort();
                    var8_9 /* !! */ .var_short_arr_do = new short[15];
                    var8_9 /* !! */ .var_byte_arr_if = new byte[15];
                    var8_9 /* !! */ .var_byte_arr_do = new byte[15];
                    var4_5 = 0;
                    if ("   ".length() > "  ".length()) ** GOTO lbl56
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

                        ** while (!ci_0.cfr_renamed_4((int)var4_5, (int)15))
                    }
lbl57:
                    // 1 sources

                    var1_2.addElement(var8_9 /* !! */ );
                    break block6;
                }
                var8_9 /* !! */  = new bN();
                new bN().var_short_do = var4_5;
                var8_9 /* !! */ .mangSoNguyen[0] = var5_6;
                var8_9 /* !! */ .mangSoNguyen[1] = var6_7;
                var8_9 /* !! */ .cfr_renamed_3 = var7_8;
                var8_9 /* !! */ .cfr_renamed_4 = var0.readShort();
                var1_2.addElement(var8_9 /* !! */ );
            }
            ++var3_4;
lbl73:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_4, (int)var2_3))
        }
lbl74:
        // 1 sources

        return var1_2;
    }

    public static an (short s2 != null) {
        an an2 = (an)var_java_util_Hashtable_if.get("" + s2);
        if ((an2 == null)) {
            an2 = new an();
            var_java_util_Hashtable_if.put("" + s2, an2);
            db_0.db_0_do().cfr_renamed_0(s2);
            if (-"  ".length() >= 0) {
                return null;
            }
        } else if ((an2.soLuong >= 0)) {
            an2.soLuong = (int)(System.currentTimeMillis() / 1000L);
        }
        return an2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avatarSV");
        if ((dataInputStream == null)) {
            return;
        }
        try {
            if ((dataInputStream.readByte() != ey_0.cfr_renamed_0().mangSoNguyen[4])) {
                return;
            }
            byte by2 = dataInputStream.readByte();
            if (ci_0.boolean_if((int)by2)) {
                ci_0.void_do("avatarSV");
                return;
            }
            AngelChip.var_java_lang_String_arr_arr_arr_if = new String[2][by2][];
            AngelChip.var_java_lang_String_arr_arr_arr_do = new String[2][by2][];
            AngelChip.var_int_arr_arr_arr_do = new int[2][by2][];
            int n = 0;
            block2: while (true) {
                if ((n >= by2)) {
                    dataInputStream.close();
                    return;
                }
                byte by3 = dataInputStream.readByte();
                AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n] = new String[by3 + 1];
                AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n][0] = dataInputStream.readUTF();
                AngelChip.var_java_lang_String_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][n] = new String[by3];
                AngelChip.var_int_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][n] = new int[by3];
                int n2 = 0;
                while (true) {
                    if ((n2 >= by3)) {
                        ++n;
                        continue block2;
                    }
                    AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n][n2 + 1] = dataInputStream.readUTF();
                    AngelChip.var_java_lang_String_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][n][n2] = dataInputStream.readUTF();
                    AngelChip.var_int_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][n][n2] = dataInputStream.readInt();
                    ++n2;
                }
                break;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            ci_0.void_do("avatarSV");
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_2(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        v0 = new DataInputStream((InputStream)var0);
        var0 = v0;
        var1_1 = v0.readShort();
        ci_0.var_java_util_Vector_do = new Vector<E>();
        var2_2 = 0;
        if (-"   ".length() < 0) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = new gd();
            new gd().var_short_do = var0.readShort();
            var3_3.chuoiGiaTri = var0.readUTF();
            var0.readUTF();
            var3_3.mangSoNguyen[0] = var0.readInt();
            var3_3.var_byte_do = var0.readByte();
            var3_3.var_short_if = var0.readShort();
            ci_0.var_java_util_Vector_do.addElement(var3_3);
            ++var2_2;
lbl23:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var1_1))
        }
lbl24:
        // 1 sources

    }

        public static void (Graphics graphics, int n, int n2, int n3, int n4 == null) {
        if (ci_0.cfr_renamed_1(ci_0.cfr_renamed_1((short)((short)n)).soLuong, -1)) {
            graphics.drawImage(ci_0.cfr_renamed_1((short)((short)n)).var_javax_microedition_lcdui_Image_do, n2, n3, n4);
        }
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    /*
     * Unable to fully structure code
     */
    public static void (gy_0 var0 == null) {
        ci_0.soLuong -= 1;
        var1_1 = ci_0.var_java_util_Vector_try.size();
        var2_2 = 0;
        if ("   ".length() > ((42 ^ 56) & ~(187 ^ 169))) ** GOTO lbl18
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (gy_0)ci_0.var_java_util_Vector_try.elementAt(var2_2);
            if ((var3_3.cfr_renamed_1 == var0.cfr_renamed_1)) {
                var3_3.var_byte_arr_do = var0.var_byte_arr_do;
                var3_3.var_short_do = var0.var_short_do;
                var3_3.cfr_renamed_3 = var0.cfr_renamed_3;
                if (((189 ^ 156 ^ (79 ^ 51)) & (149 ^ 195 ^ (38 ^ 45) ^ -" ".length())) == 0) break;
                return;
            }
            ++var2_2;
lbl18:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var1_1))
        }
lbl19:
        // 2 sources

        ci_0.cfr_renamed_15();
    }

    /*
     * Unable to fully structure code
     */
    private static void (gy_0 var0 != null) {
        var1_1 = Image.createImage((int)var0.var_javax_microedition_lcdui_Image_do.getWidth(), (int)var0.var_javax_microedition_lcdui_Image_do.getHeight());
        var2_2 = var1_1.getGraphics();
        var2_2.setColor(16711935);
        var2_2.fillRect(0, 0, var1_1.getWidth(), var1_1.getHeight());
        var3_3 = 0;
        if (-(107 ^ 110) < 0) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            if ((var0.cfr_renamed_1 == ci_0.var_bH_arr_do[var3_3].cfr_renamed_1)) {
                var2_2.drawRegion(var0.var_javax_microedition_lcdui_Image_do, ci_0.var_bH_arr_do[var3_3].cfr_renamed_4 * bn_0.cfr_renamed_6, ci_0.var_bH_arr_do[var3_3].cfr_renamed_2 * bn_0.cfr_renamed_6, ci_0.var_bH_arr_do[var3_3].cfr_renamed_5 * bn_0.cfr_renamed_6, ci_0.var_bH_arr_do[var3_3].cfr_renamed_3 * bn_0.cfr_renamed_6, (int)bk_0.var_byte_case, (int)ci_0.var_bH_arr_do[var3_3].cfr_renamed_4, (int)ci_0.var_bH_arr_do[var3_3].cfr_renamed_2, 0);
            }
            ++var3_3;
lbl13:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)ci_0.var_bH_arr_do.length))
        }
lbl14:
        // 1 sources

        var3_3 = 0;
        if (((136 + 120 - 140 + 52 ^ 32 + 51 - 70 + 135) & (151 + 44 - 136 + 106 ^ 150 + 97 - 114 + 20 ^ -" ".length())) == 0) ** GOTO lbl33
        return;
lbl-1000:
        // 1 sources

        {
            block5: {
                if (!(ci_0.var_q_0_arr_do[var3_3] != null) || !(ci_0.var_q_0_arr_do[var3_3].cfr_renamed_3 >= 0) || !(ci_0.var_q_0_arr_do[var3_3].var_short_do < 2000)) break block5;
                var4_5 = (ci)ci_0.q_0_do(ci_0.var_q_0_arr_do[var3_3].cfr_renamed_3);
                var5_6 = 0;
                if ("  ".length() > " ".length()) ** GOTO lbl30
                return;
lbl-1000:
                // 1 sources

                {
                    var6_7 = ci_0.var_bH_arr_do[var4_5.var_short_arr_do[var5_6]];
                    if (ci_0.cfr_renamed_5(((bN)ci_0.var_q_0_arr_do[var3_3]).cfr_renamed_4, var0.cfr_renamed_1)) {
                        var2_2.drawRegion(ci_0.gy_0_do((int)var0.cfr_renamed_1).var_javax_microedition_lcdui_Image_do, var6_7.cfr_renamed_4 * bn_0.cfr_renamed_6, var6_7.cfr_renamed_2 * bn_0.cfr_renamed_6, var6_7.cfr_renamed_5 * bn_0.cfr_renamed_6, var6_7.cfr_renamed_3 * bn_0.cfr_renamed_6, (int)bk_0.var_byte_case, (int)var6_7.cfr_renamed_4, (int)var6_7.cfr_renamed_2, 0);
                    }
                    ++var5_6;
lbl30:
                    // 2 sources

                    ** while (!ci_0.cfr_renamed_4((int)var5_6, (int)var4_5.var_short_arr_do.length))
                }
            }
            ++var3_3;
lbl33:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)ci_0.var_q_0_arr_do.length))
        }
lbl34:
        // 1 sources

        var1_1 = gc_0.cfr_renamed_0(var1_1, -65281);
        var3_4 = new gy_0();
        new gy_0().cfr_renamed_3 = var0.cfr_renamed_3;
        var3_4.cfr_renamed_1 = var0.cfr_renamed_1;
        var3_4.var_javax_microedition_lcdui_Image_do = var1_1;
        var3_4.var_short_do = var0.var_short_do;
        ci_0.var_java_util_Hashtable_int.put("" + var3_4.cfr_renamed_1, var3_4);
        }

    public static void void_do(byte[] byArray) {
        soLuong -= 1;
        var_java_util_Vector_for.removeAllElements();
        var_java_util_Vector_for = ci_0.java_util_Vector_do(byArray);
        gc_0.cfr_renamed_0("avatarMapItemType", byArray);
        ci_0.cfr_renamed_15();
    }

    /*
     * Unable to fully structure code
     */
    private static q_0[] q_0_arr_do(Vector var0) {
        var1_1 = 0;
        var2_3 = 0;
        if (((92 ^ 45 ^ (234 ^ 186)) & (216 ^ 149 ^ (1 ^ 109) ^ -" ".length())) == 0) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_5 = (q_0)var0.elementAt(var2_3);
            if (ci_0.cfr_renamed_0((int)var3_5.var_short_do, var1_1)) {
                var1_1 = var3_5.var_short_do;
            }
            ++var2_3;
lbl11:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_3, (int)var0.size()))
        }
lbl12:
        // 1 sources

        var2_4 = new q_0[var1_1 + 1];
        var3_6 = 0;
        if ("   ".length() == "   ".length()) ** GOTO lbl20
        return null;
lbl-1000:
        // 1 sources

        {
            var2_4[var1_2.var_short_do] = var1_2 = (q_0)var0.elementAt(var3_6);
            ++var3_6;
lbl20:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_6, (int)var0.size()))
        }
lbl21:
        // 1 sources

        return var2_4;
    }

    /*
     * Unable to fully structure code
     */
    public static fi_0 fi_0_do(int var0) {
        var1_1 = ci_0.var_java_util_Vector_for.size();
        var2_2 = 0;
        if (((19 ^ 22) & ~(27 ^ 30)) >= -" ".length()) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            if (ci_0.cfr_renamed_5(((fi_0)ci_0.var_java_util_Vector_for.elementAt((int)var2_2)).cfr_renamed_3, var0)) {
                return (fi_0)ci_0.var_java_util_Vector_for.elementAt(var2_2);
            }
            ++var2_2;
lbl10:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var1_1))
        }
lbl11:
        // 1 sources

        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void cfr_renamed_8() {
        int n = 0;
        while (!(n >= var_q_0_arr_do.length)) {
            if ((ci_0.var_q_0_arr_do[n].cfr_renamed_3 >= 0)) {
                q_0 q_02 = var_q_0_arr_do[ci_0.var_q_0_arr_do[n].cfr_renamed_3];
                q_0 q_03 = var_q_0_arr_do[n];
                var_q_0_arr_do[n].chuoiGiaTri = q_02.chuoiGiaTri;
                q_03.var_byte_do = q_02.var_byte_do;
                q_03.var_byte_if = q_02.var_byte_if;
                q_03.var_short_if = q_02.var_short_if;
            }
            ++n;
        }
    }

        /*
     * Unable to fully structure code
     */
    private static boolean boolean_if() {
        block2: {
            var0 = gc_0.byte_arr_do("avatarPart");
            if (!ci_0.cfr_renamed_0((Object)ci_0.chuoiGiaTri)) break block2;
            var1_1 = ci_0.tenNhanVat.toCharArray();
            var2_2 = 0;
            var3_3 = 1;
            if (" ".length() < "   ".length()) ** GOTO lbl13
            return (boolean)((229 ^ 159 ^ (216 ^ 183)) & (137 + 17 - 53 + 54 ^ 17 + 44 - 19 + 100 ^ -" ".length()));
lbl-1000:
            // 1 sources

            {
                var4_5 = Integer.parseInt(String.valueOf(var1_1[var3_3]));
                var2_2 += var4_5;
                var3_3 += 2;
lbl13:
                // 2 sources

                ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)(var1_1.length - 1)))
            }
lbl14:
            // 1 sources

            var3_4 = String.valueOf(var2_2);
            ci_0.chuoiGiaTri = String.valueOf(var3_4.length()) + ci_0.tenNhanVat.substring(0, 5) + var2_2 + ci_0.tenNhanVat.substring(5, ci_0.tenNhanVat.length());
        }
        if (ci_0.cfr_renamed_0((Object)var0)) {
            return 0;
        }
        ci_0.var_q_0_arr_do = ci_0.q_0_arr_do((var0 > 0));
        return 1;
    }

        public static void (byte[] byArray != null) {
        soLuong -= 1;
        var_q_0_arr_do = ci_0.q_0_arr_do((byArray > 0));
        gc_0.cfr_renamed_0("avatarPart", byArray);
        ci_0.cfr_renamed_8();
        ci_0.cfr_renamed_15();
    }

        static {
        ci_0.cfr_renamed_2();
        var_java_util_Vector_try = new Vector();
        var_java_util_Hashtable_new = new Hashtable();
        soLuong = -1;
        var_java_util_Vector_for = new Vector();
        var_java_util_Vector_if = new Vector();
        var_java_util_Hashtable_if = new Hashtable();
        var_java_util_Hashtable_do = new Hashtable();
        var_java_util_Hashtable_for = new Hashtable();
        var_java_util_Vector_int = new Vector();
    }

    public static String java_lang_String_do(q_0 q_02) {
        if ((q_02.cfr_renamed_3 >= 0)) {
            return ci_0.q_0_do((short)q_02.cfr_renamed_3).chuoiGiaTri;
        }
        return q_02.chuoiGiaTri;
    }

    /*
     * Unable to fully structure code
     */
    public static ef ef_do(Vector var0, int var1_1) {
        var2_2 = var0.size();
        var3_3 = 0;
        if (" ".length() != 0) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = (ef)var0.elementAt(var3_3);
            if ((var4_4.var_short_do == var1_1)) {
                return var4_4;
            }
            ++var3_3;
lbl11:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var3_3, (int)var2_2))
        }
lbl12:
        // 1 sources

        return null;
    }

    public static int int_do(q_0 q_02) {
        byte by2;
        if ((q_02.cfr_renamed_3 >= 0)) {
            by2 = ((ci)ci_0.q_0_do((short)q_02.cfr_renamed_3)).cfr_renamed_4;
            if (((5 ^ 0x24) & ~(0xBC ^ 0x9D) & ~((0xD7 ^ 0x82) & ~(0x3F ^ 0x6A))) != 0) {
                return (4 ^ 0x5E) & ~(0x23 ^ 0x79);
            }
        } else {
            by2 = ((ci)q_02).cfr_renamed_4;
        }
        return by2;
    }

    public static void void_do(Vector vector) {
        var_java_util_Vector_new = vector;
    }

        public static void (byte[] byArray >= 0) {
        soLuong -= 1;
        var_java_util_Vector_if.removeAllElements();
        ci_0.cfr_renamed_15(byArray);
        gc_0.cfr_renamed_0("avatarMapType", byArray);
        ci_0.cfr_renamed_15();
    }

    public static void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8 == null) {
        if (!(n8 != 0) || ci_0.boolean_if(GameCanvas.var_boolean_int ? 1 : 0) && ci_0.boolean_if(GameCanvas.var_boolean_case ? 1 : 0)) {
            graphics.drawRegion(ci_0.gy_0_do((int)n).var_javax_microedition_lcdui_Image_do, n2 * bn_0.cfr_renamed_6, n3 * bn_0.cfr_renamed_6, n4 * bn_0.cfr_renamed_6, n5 * bn_0.cfr_renamed_6, n8, n6, n7, 0);
            return;
        }
        int n9 = n;
        graphics.drawRegion(((gy_0)ci_0.var_java_util_Hashtable_int.get((Object)new StringBuffer().append((int)n9).toString())).var_javax_microedition_lcdui_Image_do, n2 * bn_0.cfr_renamed_6, n3 * bn_0.cfr_renamed_6, n4 * bn_0.cfr_renamed_6, n5 * bn_0.cfr_renamed_6, 0, n6, n7, 0);
    }

    /*
     * Unable to fully structure code
     */
    private static void cfr_renamed_15(byte[] var0) {
        var0 = new ByteArrayInputStream((byte[])var0);
        var0 = new DataInputStream((InputStream)var0);
        ci_0.var_java_util_Vector_if = new Vector<E>();
        var1_1 = var0.readShort();
        System.out.println("readMapItem: " + var1_1);
        var2_2 = 0;
        if (-"  ".length() < 0) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = new aU();
            new aU().var_short_do = var0.readShort();
            var3_3.cfr_renamed_1 = var0.readShort();
            var3_3.cfr_renamed_12 = var0.readByte();
            var3_3.cfr_renamed_3 = var0.readByte();
            var3_3.var_int_if = var0.readByte();
            ci_0.var_java_util_Vector_if.addElement(var3_3);
            var2_2 = (byte)(var2_2 + 1);
lbl19:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var1_1))
        }
lbl20:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public static go_0 go_0_do(short var0) {
        var1_1 = 0;
        if (-"  ".length() < 0) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (go_0)ci_0.var_java_util_Vector_int.elementAt(var1_1);
            if ((var2_2.var_short_do == var0)) {
                return var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var1_1, (int)ci_0.var_java_util_Vector_int.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

    public static void (byte[] byArray != 0) {
        soLuong -= 1;
        var_bH_arr_do = ci_0.bH_arr_do(byArray);
        gc_0.cfr_renamed_0("avatarImgData", byArray);
        ci_0.cfr_renamed_15();
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void cfr_renamed_4() {
        gc_0.cfr_renamed_0(k.chuoiGiaTri, String.valueOf(AngelChip.chuoiGiaTri) + bF.chuoiGiaTri);
        gc_0.cfr_renamed_0(AngelChip.tenNhanVat, String.valueOf(gc_0.chuoiGiaTri) + fe_0.chuoiGiaTri);
        gc_0.cfr_renamed_0(gc_0.chuoiGiaTri, String.valueOf(AngelChip.soLuong) + fw.chuoiGiaTri);
    }

        public static boolean boolean_do(int n) {
        if ((n != 10) && (n != 20) && (n != 30) && (n != 40) && (n != 50)) {
            return 0;
        }
        return 1;
    }

    public static void (byte[] byArray > 0) {
        soLuong -= 1;
        ci_0.cfr_renamed_2(byArray);
        gc_0.cfr_renamed_0("avatarItemInfo", byArray);
        ci_0.cfr_renamed_15();
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void cfr_renamed_12() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(var_java_util_Vector_try.size());
            int n = 0;
            while (true) {
                if ((n >= var_java_util_Vector_try.size())) {
                    gc_0.cfr_renamed_0("avatarImgBig", byteArrayOutputStream.toByteArray());
                    dataOutputStream.close();
                    gc_0.cfr_renamed_0("partImageNormal", chuoiGiaTri);
                    return;
                }
                gy_0 gy_02 = (gy_0)var_java_util_Vector_try.elementAt(n);
                dataOutputStream.writeShort(gy_02.cfr_renamed_1);
                dataOutputStream.writeShort(gy_02.cfr_renamed_3);
                dataOutputStream.writeInt(gy_02.var_byte_arr_do.length);
                ((OutputStream)dataOutputStream).write(gy_02.var_byte_arr_do);
                dataOutputStream.writeShort(gy_02.var_short_do);
                ++n;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    public static DataInputStream java_io_DataInputStream_do(String object) {
        byte[] byArray = gc_0.byte_arr_do((String)object);
        object = byArray;
        if (ci_0.cfr_renamed_0((Object)byArray)) {
            return null;
        }
        object = new ByteArrayInputStream((byte[])object);
        return new DataInputStream((InputStream)object);
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_5() {
        block3: {
            block2: {
                if (!(ci_0.var_java_util_Hashtable_if.size() > 50)) break block2;
                var0 = ci_0.var_java_util_Hashtable_if.keys();
                if (" ".length() != 0) ** GOTO lbl14
                return;
lbl-1000:
                // 1 sources

                {
                    var1_1 = (String)var0.nextElement();
                    var2_2 = (an)ci_0.var_java_util_Hashtable_if.get(var1_1);
                    if (!(var2_2.soLuong != -1) || !ci_0.cfr_renamed_5(ci_0.cfr_renamed_0(System.currentTimeMillis() / 1000L - (long)var2_2.soLuong, (long)GameCanvas.var_int_new))) continue;
                    ci_0.var_java_util_Hashtable_if.remove(var1_1);
                    lbl14:
                    // 3 sources

                    ** while (!ci_0.boolean_if((int)var0.hasMoreElements()))
                }
            }
            if (!(ci_0.var_java_util_Hashtable_do.size() > 50)) break block3;
            var0 = ci_0.var_java_util_Hashtable_do.keys();
            if (((31 + 112 - 64 + 67 ^ 117 + 76 - 175 + 120) & (56 ^ 22 ^ (15 ^ 57) ^ -" ".length())) == 0) ** GOTO lbl29
            return;
lbl-1000:
            // 1 sources

            {
                var1_1 = (String)var0.nextElement();
                var2_2 = (an)ci_0.var_java_util_Hashtable_do.get(var1_1);
                if (!(var2_2.soLuong != -1) || !ci_0.cfr_renamed_5(ci_0.cfr_renamed_0(System.currentTimeMillis() / 1000L - (long)var2_2.soLuong, (long)GameCanvas.var_int_new))) continue;
                ci_0.var_java_util_Hashtable_do.remove(var1_1);
                lbl29:
                // 3 sources

                ** while (!ci_0.boolean_if((int)var0.hasMoreElements()))
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static gy_0 gy_0_if(int var0) {
        var1_1 = ci_0.var_java_util_Vector_try.size();
        var2_2 = 0;
        if (((81 ^ 69 ^ (86 ^ 74)) & (160 + 102 - 103 + 27 ^ 28 + 174 - 49 + 25 ^ -" ".length())) == 0) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_3 = (gy_0)ci_0.var_java_util_Vector_try.elementAt(var2_2);
            if ((var3_3.cfr_renamed_1 == var0)) {
                return var3_3;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!ci_0.cfr_renamed_4((int)var2_2, (int)var1_1))
        }
lbl12:
        // 1 sources

        return null;
    }
}

