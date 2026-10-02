/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class gj
extends ax_0
implements ba {
    public static gj var_gj_do;
    private static final int[] mangSoNguyen;

    public final void void_do(ad_0 object) {
        try {
            switch (((ad_0)object).var_byte_do) {
                case -75: {
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.b, new at(n), 0);
                }
                default: {
                    return;
                }
                case -73: {
                    short s2 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    byte[] byArray = new byte[((ad_0)object).var_java_io_DataInputStream_do.readInt()];
                    ((ad_0)object).var_java_io_DataInputStream_do.read(byArray);
                    fe.fe_do().cfr_renamed_0(byArray, (int)s2);
                    return;
                }
                case -67: {
                    byte by2 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    int n = -1;
                    short s3 = 0;
                    Vector<DuLieuNguoiChoi> vector = null;
                    if (gj.boolean_do(by2)) {
                        s3 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                        n = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                        } else {
                        vector = new Vector<DuLieuNguoiChoi>();
                        short s4 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                        int n2 = 0;
                        while ((n2 < s4)) {
                            DuLieuNguoiChoi dd_02 = new DuLieuNguoiChoi();
                            new DuLieuNguoiChoi().var_short_char = (short)((ad_0)object).var_java_io_DataInputStream_do.readInt();
                            dd_02.var_byte_long = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                            vector.addElement(dd_02);
                            ++n2;
                            if ("  ".length() != 0) continue;
                            return;
                        }
                    }
                    fe.fe_do().cfr_renamed_0(by2, n, s3, vector);
                    return;
                }
                case -66: {
                    aU aU2 = new aU();
                    new aU().cfr_renamed_1 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    aU2.cfr_renamed_3 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    aU2.cfr_renamed_1 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    fe.fe_do().void_if(aU2);
                    return;
                }
                case -65: {
                    byte by3 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                    short s5 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    short[] sArray = new short[s5];
                    byte by4 = 0;
                    while ((by4 < s5)) {
                        sArray[by4] = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                        ++by4;
                        if (-"  ".length() <= 0) continue;
                        return;
                    }
                    by4 = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                    Vector<aU> vector = new Vector<aU>();
                    short s6 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    int n3 = 0;
                    while ((n3 < s6)) {
                        aU aU3 = new aU();
                        new aU().cfr_renamed_1 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                        aU3.cfr_renamed_3 = ((ad_0)object).var_java_io_DataInputStream_do.readByte() * 24;
                        aU3.cfr_renamed_1 = (short)(((ad_0)object).var_java_io_DataInputStream_do.readByte() * 24);
                        aU3.var_byte_do = ((ad_0)object).var_java_io_DataInputStream_do.readByte();
                        vector.addElement(aU3);
                        ++n3;
                        if ((75 + 34 - 35 + 65 ^ 127 + 126 - 246 + 136) > 0) continue;
                        return;
                    }
                    Vector vector2 = ee.java_util_Vector_do((ad_0)object);
                    gS.cfr_renamed_0();
                    fe.fe_do().cfr_renamed_0(by3, n, sArray, by4, vector, vector2);
                    TienIchGame.cfr_renamed_8();
                    return;
                }
                case -46: {
                    short s7 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    object = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
                    fe.fe_do().cfr_renamed_0(s7, (String)object);
                    return;
                }
                case -43: {
                    short s8 = ((ad_0)object).var_java_io_DataInputStream_do.readShort();
                    dR[] dRArray = new dR[s8];
                    int n = 0;
                    while ((n < s8)) {
                        dRArray[n] = new dR();
                        dRArray[n].chuoiGiaTri = ((ad_0)object).var_java_io_DataInputStream_do.readUTF();
                        dRArray[n].cfr_renamed_1 = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                        dRArray[n].soLuong = ((ad_0)object).var_java_io_DataInputStream_do.readInt();
                        ++n;
                        if (" ".length() != 0) continue;
                        return;
                    }
                    fe.fe_do().cfr_renamed_0(dRArray);
                    return;
                }
                case 51: {
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(gS.dd_0_do((ad_0)object));
                    return;
                }
                case 76: {
                    ee.void_do((ad_0)object);
                    return;
                }
                case 77: 
            }
            ee.void_for((ad_0)object);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static void cfr_renamed_0() {
        ee.ee_do().var_ba_do = var_gj_do;
    }

        static {
        gj.cfr_renamed_3();
        var_gj_do = new gj();
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[3];
        0 = (0xDE ^ 0x9C) & ~(0xD4 ^ 0x96);
        -1 = -" ".length();
        24 = 0x83 ^ 0xB2 ^ (0xEF ^ 0xC6);
    }
}

