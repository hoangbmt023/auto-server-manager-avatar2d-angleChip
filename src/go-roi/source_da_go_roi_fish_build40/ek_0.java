/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from eK
 */
public final class ek_0
extends bE
implements bH {
    public static ek_0 var_ek_0_do;
    private static final int[] mangSoNguyen;

    public final void void_do(bj object) {
        try {
            switch (((bj)object).var_byte_do) {
                case -75: {
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.bs, new g(n), 0);
                }
                default: {
                    return;
                }
                case -73: {
                    short s2 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    byte[] byArray = new byte[((bj)object).var_java_io_DataInputStream_do.readInt()];
                    ((bj)object).var_java_io_DataInputStream_do.read(byArray);
                    gd_0.gd_0_do().cfr_renamed_1(byArray, (int)s2);
                    return;
                }
                case -67: {
                    byte by2 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    int n = -1;
                    short s3 = 0;
                    Vector<DuLieuNguoiChoi> vector = null;
                    if (ek_0.boolean_do(by2)) {
                        s3 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                        n = ((bj)object).var_java_io_DataInputStream_do.readByte();
                        if (((14 + 0 - -77 + 76 ^ 86 + 131 - 163 + 136) & (0x5B ^ 0xD ^ (0xFD ^ 0xB2) ^ -" ".length())) > "  ".length()) {
                            return;
                        }
                    } else {
                        vector = new Vector<DuLieuNguoiChoi>();
                        short s4 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                        int n2 = 0;
                        while ((n2 < s4)) {
                            DuLieuNguoiChoi ef2 = new DuLieuNguoiChoi();
                            new DuLieuNguoiChoi().var_short_goto = (short)((bj)object).var_java_io_DataInputStream_do.readInt();
                            ef2.var_byte_catch = ((bj)object).var_java_io_DataInputStream_do.readByte();
                            vector.addElement(ef2);
                            ++n2;
                            if (((0xEE ^ 0xB5) & ~(0x38 ^ 0x63)) == 0) continue;
                            return;
                        }
                    }
                    gd_0.gd_0_do().cfr_renamed_1(by2, n, s3, vector);
                    return;
                }
                case -66: {
                    bB bB2 = new bB();
                    new bB().cfr_renamed_0 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    bB2.cfr_renamed_2 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    bB2.cfr_renamed_3 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    gd_0.gd_0_do().void_if(bB2);
                    return;
                }
                case -65: {
                    byte by3 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    int n = ((bj)object).var_java_io_DataInputStream_do.readInt();
                    short s5 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    short[] sArray = new short[s5];
                    byte by4 = 0;
                    while ((by4 < s5)) {
                        sArray[by4] = ((bj)object).var_java_io_DataInputStream_do.readByte();
                        ++by4;
                        if (-" ".length() != ((0xC7 ^ 0xC1) & ~(0x2C ^ 0x2A))) continue;
                        return;
                    }
                    by4 = ((bj)object).var_java_io_DataInputStream_do.readByte();
                    Vector<bB> vector = new Vector<bB>();
                    short s6 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    int n3 = 0;
                    while ((n3 < s6)) {
                        bB bB3 = new bB();
                        new bB().cfr_renamed_0 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                        bB3.cfr_renamed_2 = ((bj)object).var_java_io_DataInputStream_do.readByte() * 24;
                        bB3.cfr_renamed_3 = ((bj)object).var_java_io_DataInputStream_do.readByte() * 24;
                        bB3.var_byte_do = ((bj)object).var_java_io_DataInputStream_do.readByte();
                        vector.addElement(bB3);
                        ++n3;
                        if ("   ".length() == "   ".length()) continue;
                        return;
                    }
                    Vector vector2 = fh_0.java_util_Vector_do((bj)object);
                    fs_0.cfr_renamed_1();
                    gd_0.gd_0_do().cfr_renamed_1(by3, n, sArray, by4, vector, vector2);
                    TienIchGame.cfr_renamed_7();
                    return;
                }
                case -46: {
                    short s7 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    object = ((bj)object).var_java_io_DataInputStream_do.readUTF();
                    gd_0.gd_0_do().cfr_renamed_1(s7, (String)object);
                    return;
                }
                case -43: {
                    short s8 = ((bj)object).var_java_io_DataInputStream_do.readShort();
                    et[] etArray = new et[s8];
                    int n = 0;
                    while ((n < s8)) {
                        etArray[n] = new et();
                        etArray[n].chuoiGiaTri = ((bj)object).var_java_io_DataInputStream_do.readUTF();
                        etArray[n].cfr_renamed_0 = ((bj)object).var_java_io_DataInputStream_do.readInt();
                        etArray[n].soLuong = ((bj)object).var_java_io_DataInputStream_do.readInt();
                        ++n;
                        if ((0x53 ^ 0x57) > 0) continue;
                        return;
                    }
                    gd_0.gd_0_do().cfr_renamed_1(etArray);
                    return;
                }
                case 51: {
                    go_0.go_0_do();
                    go_0.cfr_renamed_3(fs_0.ef_do((bj)object));
                    return;
                }
                case 76: {
                    fh_0.void_for((bj)object);
                    return;
                }
                case 77: 
            }
            fh_0.void_do((bj)object);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    public static void cfr_renamed_1() {
        fh_0.fh_0_do().var_bH_do = var_ek_0_do;
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[3];
        0 = (0xB4 ^ 0x85) & ~(0x63 ^ 0x52);
        -1 = -" ".length();
        24 = 0x9C ^ 0xBB ^ (0x6F ^ 0x50);
    }

    static {
        ek_0.cfr_renamed_2();
        var_ek_0_do = new ek_0();
    }
}

