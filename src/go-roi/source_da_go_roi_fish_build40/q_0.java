/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from Q
 */
public final class q_0
extends bE
implements bH {
    private static final int[] mangSoNguyen;
    public static q_0 var_q_0_do;

            static {
        q_0.void_do();
    }

        private static boolean boolean_do(int n) {
        return n <= 0;
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    public final void void_do(bj object) {
        try {
            switch (((bj)object).var_byte_do) {
                case 51: {
                    byte by2 = ((bj)object).cfr_renamed_1().readByte();
                    short[] sArray = new short[by2];
                    short[] sArray2 = new short[by2];
                    int n = 0;
                    while ((n < by2)) {
                        sArray[n] = ((bj)object).cfr_renamed_1().readShort();
                        sArray2[n] = ((bj)object).cfr_renamed_1().readShort();
                        ++n;
                        if (((0x8B ^ 0x9A) & ~(0x36 ^ 0x27)) == 0) continue;
                        return;
                    }
                    n = ((bj)object).cfr_renamed_1().readInt();
                    int n2 = ((bj)object).cfr_renamed_1().readInt();
                    bz.cfr_renamed_1(by2, sArray2, n, n2);
                    return;
                }
                default: {
                    return;
                }
                case 54: {
                    short s2 = ((bj)object).cfr_renamed_1().readShort();
                    short s3 = ((bj)object).cfr_renamed_1().readShort();
                    int n = ((bj)object).cfr_renamed_1().readUnsignedShort();
                    byte[] byArray = new byte[n];
                    int n3 = 0;
                    while ((n3 < n)) {
                        byArray[n3] = ((bj)object).cfr_renamed_1().readByte();
                        ++n3;
                        if ("   ".length() > 0) continue;
                        return;
                    }
                    bz.cfr_renamed_1(s2, s3, byArray);
                    return;
                }
                case 55: {
                    byte[] byArray = new byte[((bj)object).cfr_renamed_1().available()];
                    ((bj)object).cfr_renamed_1().read(byArray);
                    bz.cfr_renamed_1(byArray);
                    return;
                }
                case 56: {
                    byte[] byArray = new byte[((bj)object).cfr_renamed_1().available()];
                    ((bj)object).cfr_renamed_1().read(byArray);
                    bz.cfr_renamed_0(byArray);
                    return;
                }
                case 60: {
                    Object object2;
                    byte by3 = ((bj)object).cfr_renamed_1().readByte();
                    Vector<ee_0> vector = new Vector<ee_0>();
                    Vector<Object> vector2 = new Vector<Object>();
                    boolean bl = 0;
                    while ((bl ? 1 : 0 < by3)) {
                        ee_0 ee_02 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readByte();
                        ee_02.soLuong = ((bj)object).cfr_renamed_1().readShort();
                        if ((ee_02.var_short_if > 100)) {
                            vector2.addElement(ee_02);
                            if ((103 + 164 - 226 + 157 ^ 21 + 149 - 98 + 122) < "   ".length()) {
                                return;
                            }
                        } else {
                            vector.addElement(ee_02);
                        }
                        bl += 1;
                        return;
                    }
                    byte by4 = ((bj)object).cfr_renamed_1().readByte();
                    Vector<ee_0> vector3 = new Vector<ee_0>();
                    int n = 0;
                    while ((n < by4)) {
                        object2 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readByte();
                        ((ee_0)object2).soLuong = ((bj)object).cfr_renamed_1().readShort();
                        vector3.addElement((ee_0)object2);
                        ++n;
                        return;
                    }
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.var_short_void = ((bj)object).cfr_renamed_1().readByte();
                    AngelChip.duLieuNguoiChoi.var_byte_break = ((bj)object).cfr_renamed_1().readByte();
                    by3 = ((bj)object).cfr_renamed_1().readByte();
                    vector2 = new Vector();
                    bl = 0;
                    while ((bl ? 1 : 0 < by3)) {
                        object2 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readShort();
                        ((ee_0)object2).soLuong = ((bj)object).cfr_renamed_1().readShort();
                        vector2.addElement(object2);
                        bl += 1;
                        if ("   ".length() >= "   ".length()) continue;
                        return;
                    }
                    by4 = ((bj)object).cfr_renamed_1().readByte();
                    object2 = new Vector();
                    n = 0;
                    while ((n < by4)) {
                        ee_0 ee_03 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readShort();
                        ee_03.soLuong = ((bj)object).cfr_renamed_1().readShort();
                        ((Vector)object2).addElement(ee_03);
                        ++n;
                        if ("   ".length() >= 0) continue;
                        return;
                    }
                    byte by5 = ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    bl = ((bj)object).cfr_renamed_1().readBoolean();
                    AngelChip.duLieuNguoiChoi.var_short_void = ((bj)object).cfr_renamed_1().readShort();
                    AngelChip.duLieuNguoiChoi.var_byte_break = ((bj)object).cfr_renamed_1().readByte();
                    by4 = ((bj)object).cfr_renamed_1().readByte();
                    vector3.removeAllElements();
                    int n4 = 0;
                    while ((n4 < by4)) {
                        ee_0 ee_04 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readShort();
                        ee_04.soLuong = ((bj)object).cfr_renamed_1().readInt();
                        vector3.addElement(ee_04);
                        ++n4;
                        if ("   ".length() == "   ".length()) continue;
                        return;
                    }
                    ((Vector)object2).removeAllElements();
                    by4 = ((bj)object).cfr_renamed_1().readByte();
                    n4 = 0;
                    while ((n4 < by4)) {
                        ee_0 ee_05 = new ee_0();
                        new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readShort();
                        ee_05.soLuong = ((bj)object).cfr_renamed_1().readInt();
                        ((Vector)object2).addElement(ee_05);
                        ++n4;
                        if (((0xAE ^ 0xA3) & ~(0x50 ^ 0x5D)) == 0) continue;
                        return;
                    }
                    dR.dR_do();
                    dR.cfr_renamed_1(vector, vector3, vector2, (Vector)object2, by5, bl);
                    if (!(bz.soLuong == 0) || !q_0.boolean_for(q_0.boolean_do() ? 1 : 0) || !(fh.var_int_char != 25)) break;
                    bz.void_if();
                    fn.fn_do().cfr_renamed_3(25, 0);
                    dR.cfr_renamed_8();
                    dR.dR_do().cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_goto, 0);
                    return;
                }
                case 61: {
                    q_0.cfr_renamed_0((bj)object);
                    return;
                }
                case 62: {
                    ee_0 ee_06 = new ee_0();
                    new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readShort();
                    ee_06.soLuong = ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    ((bj)object).cfr_renamed_1().readByte();
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n5 = ((bj)object).cfr_renamed_1().readInt();
                    int n6 = ((bj)object).cfr_renamed_1().readInt();
                    dR.dR_do();
                    dR.cfr_renamed_1(ee_06, n, n5, n6);
                    TienIchGame.this();
                    return;
                }
                case 63: {
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n7 = ((bj)object).cfr_renamed_1().readInt();
                    short s4 = ((bj)object).cfr_renamed_1().readShort();
                    dR.dR_do();
                    dR.cfr_renamed_1(n, n7, s4);
                    return;
                }
                case 64: {
                    ((bj)object).cfr_renamed_1().readInt();
                    byte by6 = ((bj)object).cfr_renamed_1().readByte();
                    byte by7 = ((bj)object).cfr_renamed_1().readByte();
                    dR.dR_do().void_int(by6, by7);
                    TienIchGame.this();
                    return;
                }
                case 65: {
                    ee_0 ee_07;
                    ((bj)object).cfr_renamed_1().readByte();
                    short s5 = ((bj)object).cfr_renamed_1().readShort();
                    if ((dR.dg_0_do(s5) != null) && q_0.cfr_renamed_1(ee_07 = ee_0.cfr_renamed_1(dR.var_java_util_Vector_try, (int)s5))) {
                        ee_07.soLuong -= 1;
                        if (q_0.boolean_do(ee_07.soLuong)) {
                            dR.var_java_util_Vector_try.removeElement(ee_07);
                            }
                    }
                    TienIchGame.this();
                    return;
                }
                case 66: {
                    byte by8 = ((bj)object).cfr_renamed_1().readByte();
                    short s6 = ((bj)object).cfr_renamed_1().readShort();
                    dR.dR_do();
                    dR.void_byte(by8, s6);
                    TienIchGame.this();
                    return;
                }
                case 67: {
                    dR.dR_do();
                    ((bj)object).cfr_renamed_1().readInt();
                    dR.cfr_renamed_5();
                    return;
                }
                case 69: {
                    dR.dR_do();
                    dR.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF());
                    return;
                }
                case 70: {
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    ((bj)object).cfr_renamed_1().readInt();
                    ((bj)object).cfr_renamed_1().readByte();
                    String string = ((bj)object).cfr_renamed_1().readUTF();
                    int n8 = ((bj)object).cfr_renamed_1().readInt();
                    int n9 = ((bj)object).cfr_renamed_1().readInt();
                    int n10 = ((bj)object).cfr_renamed_1().readInt();
                    dR.dR_do();
                    dR.cfr_renamed_1(n, string, n8, n9, n10);
                    return;
                }
                case 71: {
                    ee_0 ee_08 = new ee_0();
                    new ee_0().var_short_if = ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    ((bj)object).cfr_renamed_1().readByte();
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n11 = ((bj)object).cfr_renamed_1().readInt();
                    int n12 = ((bj)object).cfr_renamed_1().readInt();
                    dR.dR_do();
                    dR.cfr_renamed_1(ee_08, n, n11, n12);
                    TienIchGame.cfr_renamed_13();
                    return;
                }
                case 72: {
                    byte by9 = ((bj)object).cfr_renamed_1().readByte();
                    object = ((bj)object).cfr_renamed_1().readUTF();
                    dR.dR_do();
                    dR.cfr_renamed_1(by9, (String)object);
                    return;
                }
                case 73: {
                    ((bj)object).cfr_renamed_1().readInt();
                    byte by10 = ((bj)object).cfr_renamed_1().readByte();
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    dR.dR_do();
                    dR.void_new(by10, n);
                    TienIchGame.cfr_renamed_13();
                    return;
                }
                case 74: {
                    byte by11 = ((bj)object).cfr_renamed_1().readByte();
                    short s7 = ((bj)object).cfr_renamed_1().readShort();
                    dR.dR_do();
                    dR.void_try(by11, s7);
                    return;
                }
                case 75: {
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n13 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.void_do(n);
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[1] = n13;
                    GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF());
                    return;
                }
                case 76: {
                    fh_0.void_for((bj)object);
                    return;
                }
                case 77: {
                    fh_0.void_do((bj)object);
                    return;
                }
                case 78: {
                    if (q_0.boolean_for(q_0.boolean_do() ? 1 : 0)) {
                        TienIchGame.this();
                        return;
                    }
                    byte by12 = ((bj)object).cfr_renamed_1().readByte();
                    es es2 = (es)dR.var_java_util_Vector_int.elementAt(by12);
                    ((es)dR.var_java_util_Vector_int.elementAt(by12)).cfr_renamed_6 = ((bj)object).cfr_renamed_1().readByte();
                    (es2 !=  (bj)object);
                    dR.dR_do().void_do(by12);
                    TienIchGame.this();
                    return;
                }
                case 79: {
                    if (q_0.boolean_for(q_0.boolean_do() ? 1 : 0)) {
                        TienIchGame.cfr_renamed_13();
                        return;
                    }
                    byte by13 = ((bj)object).cfr_renamed_1().readByte();
                    byte by14 = ((bj)object).cfr_renamed_1().readByte();
                    if ((by14 == -1)) {
                        return;
                    }
                    hs hs2 = dR.hs_do((int)by13);
                    dR.hs_do((int)by13).cfr_renamed_9 = by14;
                    (hs2 !=  (bj)object);
                    dR.dR_do();
                    dR.void_for();
                    TienIchGame.cfr_renamed_13();
                    return;
                }
                case 80: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        String string = ((bj)object).cfr_renamed_1().readUTF();
                        Vector<fl_0> vector = new Vector<fl_0>();
                        vector.addElement(new fl_0(MenuChinhAvatar.da, 3, dR.var_dR_do));
                        vector.addElement(new fl_0(MenuChinhAvatar.cq, 4, dR.var_dR_do));
                        vector.addElement(GameCanvas.var_fl_0_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n14 = ((bj)object).cfr_renamed_1().readInt();
                    int n15 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(n, n14, n15);
                    GameCanvas.var_int_byte = 1;
                    dR.dR_do().cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_goto, 1);
                    dR.var_boolean_int = 1;
                    return;
                }
                case 81: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        String string = ((bj)object).cfr_renamed_1().readUTF();
                        Vector<fl_0> vector = new Vector<fl_0>();
                        vector.addElement(new fl_0(MenuChinhAvatar.da, 5, dR.var_dR_do));
                        vector.addElement(new fl_0(MenuChinhAvatar.cq, 6, dR.var_dR_do));
                        vector.addElement(GameCanvas.var_fl_0_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    GameCanvas.var_int_byte = 1;
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n16 = ((bj)object).cfr_renamed_1().readInt();
                    int n17 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(n, n16, n17);
                    dR.dR_do().cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_goto, 1);
                    dR.var_boolean_int = 1;
                    return;
                }
                case 82: {
                    short s8 = ((bj)object).cfr_renamed_1().readShort();
                    byte[] byArray = new byte[((bj)object).cfr_renamed_1().readShort()];
                    ((bj)object).cfr_renamed_1().read(byArray);
                    bz.var_java_util_Hashtable_do.put("" + s8, new d_0(hg.javax_microedition_lcdui_Image_do(byArray)));
                    return;
                }
                case 83: {
                    if (!q_0.boolean_for(((bj)object).cfr_renamed_1().readBoolean() ? 1 : 0)) break;
                    dR.var_e_0_do.var_short_do = ((bj)object).cfr_renamed_1().readShort();
                    dR.var_e_0_do.var_short_if = (short)(dR.var_e_0_do.var_short_if + 1);
                    return;
                }
                case 84: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF(), 7, dR.var_dR_do);
                        TienIchGame.cfr_renamed_8();
                        return;
                    }
                    ((bj)object).cfr_renamed_1().readInt();
                    short s9 = ((bj)object).cfr_renamed_1().readShort();
                    dR.var_e_0_do.soLuong = s9 * 60;
                    dR.var_e_0_do.soXu = System.currentTimeMillis();
                    TienIchGame.void_int();
                    return;
                }
                case 85: {
                    try {
                        short s10 = ((bj)object).cfr_renamed_1().readShort();
                        short s11 = ((bj)object).cfr_renamed_1().readShort();
                        dR.dR_do();
                        dR.cfr_renamed_1(s10, s11);
                        }
                    catch (IOException iOException) {
                        }
                    TienIchGame.cfr_renamed_12();
                    return;
                }
                case 86: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF(), 8, dR.var_dR_do);
                        return;
                    }
                    ((bj)object).cfr_renamed_1().readInt();
                    dR.var_e_0_do.var_short_do = ((bj)object).cfr_renamed_1().readShort();
                    dR.var_e_0_do.soLuong = 0;
                    dR.var_e_0_do.var_short_if = (short)(dR.var_e_0_do.var_short_if + 1);
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n18 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n18);
                    return;
                }
                case 90: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        String string = ((bj)object).cfr_renamed_1().readUTF();
                        Vector<fl_0> vector = new Vector<fl_0>();
                        vector.addElement(new fl_0(MenuChinhAvatar.da, 9, dR.var_dR_do));
                        vector.addElement(new fl_0(MenuChinhAvatar.cq, 10, dR.var_dR_do));
                        vector.addElement(GameCanvas.var_fl_0_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((bj)object).cfr_renamed_1().readByte();
                    ((bj)object).cfr_renamed_1().readInt();
                    int n = ((bj)object).cfr_renamed_1().readByte();
                    GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF());
                    ((es)dR.var_java_util_Vector_int.elementAt((int)n)).var_byte_for = (byte)(((es)dR.var_java_util_Vector_int.elementAt((int)n)).var_byte_for + 1);
                    dR.dR_do().cfr_renamed_1(dR.var_int_goto, dR.var_java_util_Vector_int, dR.var_java_util_Vector_byte, dR.var_byte_if, dR.var_byte_do, dR.var_short_do, dR.soLuongKhoa);
                    n = ((bj)object).cfr_renamed_1().readInt();
                    int n19 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n19);
                    return;
                }
                case 91: {
                    short s12 = ((bj)object).cfr_renamed_1().readShort();
                    if ((s12 == -1)) {
                        dR.var_short_do = (short)0;
                        if ((101 + 12 - 44 + 103 ^ 5 + 32 - -28 + 103) == 0) {
                            return;
                        }
                    } else {
                        short s13 = ((bj)object).cfr_renamed_1().readShort();
                        dR.var_short_do = s12;
                        dR.soLuongKhoa = s13 * 60;
                    }
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 92: {
                    object = bz.ex_do(dR.var_short_do);
                    dg_0 dg_02 = dR.dg_0_do(((ex)object).var_short_do);
                    ee_0 ee_09 = dR.ee_0_do(((ex)object).var_short_do);
                    if ((ee_09 != null)) {
                        ee_09.soLuong += 1;
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        ee_09 = new ee_0();
                        new ee_0().var_short_if = ((ex)object).var_short_do;
                        ee_09.soLuong = 1;
                        dR.var_java_util_Vector_new.addElement(ee_09);
                    }
                    GameCanvas.void_if(0, dR.var_int_try, dR.var_int_else, dg_02.var_short_if);
                    dR.var_short_do = (short)0;
                    TienIchGame.cfr_renamed_12();
                    return;
                }
                case 93: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF(), 11, dR.var_dR_do);
                        return;
                    }
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    int n20 = 2;
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[n20] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n20] - n;
                    dR.soLuongKhoa = 0;
                    n = ((bj)object).cfr_renamed_1().readInt();
                    int n21 = ((bj)object).cfr_renamed_1().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n21);
                    return;
                }
                case 94: {
                    if (q_0.cfr_renamed_4(((bj)object).cfr_renamed_1().readByte())) {
                        String string = ((bj)object).cfr_renamed_1().readUTF();
                        Vector<fl_0> vector = new Vector<fl_0>();
                        vector.addElement(new fl_0(MenuChinhAvatar.da, 13, dR.var_dR_do));
                        vector.addElement(new fl_0(MenuChinhAvatar.cq, 14, dR.var_dR_do));
                        vector.addElement(GameCanvas.var_fl_0_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    byte by15 = ((bj)object).cfr_renamed_1().readByte();
                    int n = ((bj)object).cfr_renamed_1().readInt();
                    if ((by15 == 1)) {
                        int n22 = 0;
                        AngelChip.duLieuNguoiChoi.mangSoNguyen[n22] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n22] - n;
                        } else {
                        int n23 = 2;
                        AngelChip.duLieuNguoiChoi.mangSoNguyen[n23] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n23] - n;
                    }
                    ((bj)object).cfr_renamed_1().readInt();
                    dR.var_byte_int = (byte)(dR.var_byte_int + 1);
                    GameCanvas.cfr_renamed_1(((bj)object).cfr_renamed_1().readUTF());
                    dR.dR_do().cfr_renamed_1(dR.var_int_goto, dR.var_java_util_Vector_int, dR.var_java_util_Vector_byte, dR.var_byte_if, dR.var_byte_do, dR.var_short_do, dR.soLuongKhoa);
                    return;
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        private static void (hs hs2 != bj bj2) {
        hs2.cfr_renamed_15 = bj2.var_java_io_DataInputStream_do.readInt();
        byte by2 = bj2.var_java_io_DataInputStream_do.readByte();
        dR.cfr_renamed_1(hs2.cfr_renamed_12, (int)by2, null, hs2);
        hs2.cfr_renamed_12 = by2;
        bj2.var_java_io_DataInputStream_do.readByte();
        hs2.cfr_renamed_10 = bj2.var_java_io_DataInputStream_do.readByte();
        hs2.coKichHoat = bj2.var_java_io_DataInputStream_do.readBoolean();
        by2 = (byte)(bj2.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0);
        int n = bj2.var_java_io_DataInputStream_do.readBoolean();
        int n2 = -1;
        if ((by2 == 0) && q_0.boolean_for(hs2.var_boolean_arr_do[0])) {
            n2 = 0;
        }
        if ((n == 0) && q_0.boolean_for(hs2.var_boolean_arr_do[1])) {
            n2 = 13 * dF.cfr_renamed_12;
        }
        if (q_0.boolean_if(n2)) {
            GameCanvas.cfr_renamed_1(0, hs2.coKichHoat ? 1 : 0, hs2.cfr_renamed_3 - hs2.cfr_renamed_4, hg.cfr_renamed_1(0, n2, 9 * dF.cfr_renamed_12, 13 * dF.cfr_renamed_12, dR.var_cu_0_do.var_javax_microedition_lcdui_Image_do), -1);
        }
        hs2.var_boolean_arr_do[0] = by2;
        hs2.var_boolean_arr_do[1] = n;
    }

            private static void (es es2 != bj bj2) {
        short s2 = bj2.var_java_io_DataInputStream_do.readShort();
        dR.cfr_renamed_1(es2.var_short_do, (int)s2, es2, null);
        es2.var_short_do = s2;
        es2.soXu = es2.var_short_do * 60;
        s2 = bj2.var_java_io_DataInputStream_do.readByte();
        dR.cfr_renamed_1(es2.var_byte_new, (int)s2, es2, null);
        es2.var_byte_new = (byte)s2;
        es2.var_byte_do = bj2.var_java_io_DataInputStream_do.readByte();
        es2.coTrangThai = bj2.var_java_io_DataInputStream_do.readBoolean();
        s2 = (short)(bj2.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0);
        int n = -1;
        if ((s2 == 0) && q_0.boolean_for(es2.coKichHoat ? 1 : 0)) {
            n = 0;
        }
        es2.coKichHoat = s2;
        int n2 = bj2.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0;
        if ((n2 == 0) && q_0.boolean_for(es2.dangChayAuto ? 1 : 0)) {
            n = 9 * dF.cfr_renamed_12;
        }
        es2.dangChayAuto = n2;
        if (q_0.boolean_if(n)) {
            GameCanvas.cfr_renamed_1(0, es2.var_int_new * fh.var_int_int + 11, es2.soLuong * fh.var_int_int, hg.cfr_renamed_1(0, n, 13 * dF.cfr_renamed_12, 9 * dF.cfr_renamed_12, dR.var_cu_0_int.var_javax_microedition_lcdui_Image_do), -1);
        }
    }

    private static void cfr_renamed_0(bj bj2) {
        byte by2;
        byte by3;
        int n = bj2.var_java_io_DataInputStream_do.readInt();
        Vector<es> vector = new Vector<es>();
        Vector<es> vector2 = new Vector<es>();
        int n2 = 0;
        if ((n != -1)) {
            bm bm2;
            n2 = bj2.var_java_io_DataInputStream_do.readByte();
            by3 = 0;
            while ((by3 < n2)) {
                bm2 = new es();
                new es().cfr_renamed_6 = bj2.var_java_io_DataInputStream_do.readByte();
                if ((bm2.cfr_renamed_6 == -1)) {
                    vector.addElement((es)bm2);
                    if (-(0x35 ^ 8 ^ (0x9A ^ 0xA3)) > 0) {
                        return;
                    }
                } else {
                    (bm2 != bj2);
                    vector.addElement((es)bm2);
                }
                ++by3;
                if (-"   ".length() <= 0) continue;
                return;
            }
            by2 = bj2.var_java_io_DataInputStream_do.readByte();
            if (!(fh.var_int_char == 24) || (AngelChip.duLieuNguoiChoi.var_short_goto != n)) {
                fg.var_byte_do = (byte)0;
                fc.var_byte_do = (byte)0;
                gt_0.soLuong = 0;
                dR.var_java_util_Vector_byte.removeAllElements();
            }
            by3 = 0;
            while ((by3 < by2)) {
                bm2 = null;
                byte by4 = bj2.var_java_io_DataInputStream_do.readByte();
                int n3 = dR.var_java_util_Vector_byte.size();
                if ((fh.var_int_char == 24) && q_0.boolean_for(n3) && (n3 == by2)) {
                    dR.hs_do((int)by3);
                    bm2 = (hs)dR.var_java_util_Vector_byte.elementAt(by3);
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    gk_0 gk_02 = bz.gk_0_do((int)by4);
                    if ((by4 != -1)) {
                        switch (gk_02.var_byte_if) {
                            case 1: {
                                bm2 = new gt_0(by3, by4);
                                if (((0x13 ^ 0x1B ^ (0xD6 ^ 0x87)) & (0x5D ^ 0x3D ^ (0x6B ^ 0x52) ^ -" ".length())) == 0) break;
                                return;
                            }
                            case 2: {
                                bm2 = new fg(by3, by4);
                                if (null == null) break;
                                return;
                            }
                            case 3: {
                                bm2 = new fc(by3, by4);
                                if (" ".length() < "  ".length()) break;
                                return;
                            }
                            case 4: {
                                bm2 = new fd(by3, by4);
                            }
                        }
                    }
                }
                if ((by4 != -1) && (bm2 != null)) {
                    ((hs)bm2).cfr_renamed_9 = by4;
                    q_0.cfr_renamed_1((hs)bm2, bj2);
                    vector2.addElement((es)bm2);
                }
                ++by3;
                if ("  ".length() > " ".length()) continue;
                return;
            }
        }
        by2 = bj2.var_java_io_DataInputStream_do.readByte();
        by3 = bj2.var_java_io_DataInputStream_do.readByte();
        dR.var_e_0_do = new e_0();
        new e_0().var_short_if = bj2.var_java_io_DataInputStream_do.readShort();
        dR.var_e_0_do.var_short_do = bj2.var_java_io_DataInputStream_do.readShort();
        dR.var_e_0_do.cfr_renamed_2 = bj2.var_java_io_DataInputStream_do.readShort();
        dR.var_e_0_do.cfr_renamed_3 = bj2.var_java_io_DataInputStream_do.readShort();
        bj2.var_java_io_DataInputStream_do.readShort();
        bj2.var_java_io_DataInputStream_do.readShort();
        dR.var_e_0_do.soLuong = bj2.var_java_io_DataInputStream_do.readShort() * 60;
        dR.var_e_0_do.soXu = System.currentTimeMillis();
        short s2 = 0;
        while ((s2 < n2)) {
            es es2 = (es)vector.elementAt(s2);
            ((es)vector.elementAt(s2)).var_byte_for = bj2.var_java_io_DataInputStream_do.readByte();
            es2.cfr_renamed_7 = s2 + 1;
            ++s2;
            return;
        }
        s2 = 0;
        int n4 = 0;
        if ((bj2.var_java_io_DataInputStream_do.available() > 0)) {
            s2 = bj2.var_java_io_DataInputStream_do.readShort();
            n4 = bj2.var_java_io_DataInputStream_do.readShort() * 60;
        }
        dR.dR_do().cfr_renamed_1(n, vector, vector2, by2, by3, s2, n4);
    }

        private static boolean boolean_do() {
        if ((fh.var_int_char != 24) && (fh.var_int_char != 53)) {
            return 1;
        }
        return 0;
    }

    private static void void_do() {
        mangSoNguyen = new int[20];
        0 = (37 + 67 - 10 + 47 ^ 87 + 121 - 104 + 67) & (0xC9 ^ 0x94 ^ (0xC6 ^ 0xBD) ^ -" ".length());
        100 = 0xDB ^ 0xBF;
        25 = 0xA9 ^ 0xB0;
        1 = " ".length();
        -1 = -" ".length();
        3 = "   ".length();
        4 = "  ".length() ^ (0x4D ^ 0x4B);
        5 = 22 + 91 - -24 + 25 ^ 86 + 31 - 102 + 152;
        6 = 0x4B ^ 0x73 ^ (0x25 ^ 0x1B);
        7 = 0x2B ^ 0x49 ^ (0x46 ^ 0x23);
        60 = 6 + 123 - 29 + 75 ^ 71 + 117 - 56 + 15;
        8 = 0x65 ^ 0x48 ^ (0x11 ^ 0x34);
        9 = 0x7A ^ 0x73;
        10 = 0x3F ^ 0x35;
        11 = 0x70 ^ 0x7B;
        2 = "  ".length();
        13 = 0x9A ^ 0x97;
        14 = 0x34 ^ 0x17 ^ (0xEF ^ 0xC2);
        24 = 0x43 ^ 0x57 ^ (0x86 ^ 0x8A);
        53 = " ".length() ^ (5 ^ 0x31);
    }
}

