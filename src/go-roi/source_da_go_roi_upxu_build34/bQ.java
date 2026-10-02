/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Vector;
import main.AngelChip;

public final class bQ
extends ax_0
implements ba {
    private static final int[] mangSoNguyen;
    public static bQ var_bQ_do;

    static {
        bQ.void_do();
    }

                    private static boolean boolean_do() {
        if ((ef_0.soLuong != 24) && (ef_0.soLuong != 53)) {
            return 1;
        }
        return 0;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    private static boolean boolean_for(int n) {
        return n <= 0;
    }

    public final void void_do(ad_0 object) {
        try {
            switch (((ad_0)object).var_byte_do) {
                case 51: {
                    byte by2 = ((ad_0)object).cfr_renamed_0().readByte();
                    short[] sArray = new short[by2];
                    short[] sArray2 = new short[by2];
                    int n = 0;
                    while ((n < by2)) {
                        sArray[n] = ((ad_0)object).cfr_renamed_0().readShort();
                        sArray2[n] = ((ad_0)object).cfr_renamed_0().readShort();
                        ++n;
                        if ("  ".length() <= (106 + 143 - 76 + 7 ^ 34 + 19 - 0 + 123)) continue;
                        return;
                    }
                    n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n2 = ((ad_0)object).cfr_renamed_0().readInt();
                    ak_0.cfr_renamed_0(by2, sArray2, n, n2);
                    return;
                }
                default: {
                    return;
                }
                case 54: {
                    short s2 = ((ad_0)object).cfr_renamed_0().readShort();
                    short s3 = ((ad_0)object).cfr_renamed_0().readShort();
                    int n = ((ad_0)object).cfr_renamed_0().readUnsignedShort();
                    byte[] byArray = new byte[n];
                    int n3 = 0;
                    while ((n3 < n)) {
                        byArray[n3] = ((ad_0)object).cfr_renamed_0().readByte();
                        ++n3;
                        if (-(0x2A ^ 0x2E) < 0) continue;
                        return;
                    }
                    ak_0.cfr_renamed_0(s2, s3, byArray);
                    return;
                }
                case 55: {
                    byte[] byArray = new byte[((ad_0)object).cfr_renamed_0().available()];
                    ((ad_0)object).cfr_renamed_0().read(byArray);
                    ak_0.cfr_renamed_0(byArray);
                    return;
                }
                case 56: {
                    byte[] byArray = new byte[((ad_0)object).cfr_renamed_0().available()];
                    ((ad_0)object).cfr_renamed_0().read(byArray);
                    ak_0.cfr_renamed_1(byArray);
                    return;
                }
                case 60: {
                    Object object2;
                    byte by3 = ((ad_0)object).cfr_renamed_0().readByte();
                    Vector<gd> vector = new Vector<gd>();
                    Vector<Object> vector2 = new Vector<Object>();
                    boolean bl = 0;
                    while ((bl ? 1 : 0 < by3)) {
                        gd gd2 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readByte();
                        gd2.soLuong = ((ad_0)object).cfr_renamed_0().readShort();
                        if ((gd2.var_short_do > 100)) {
                            vector2.addElement(gd2);
                            if (((107 + 134 - 83 + 8 ^ 135 + 141 - 235 + 148) & (2 ^ 0x37 ^ (0x82 ^ 0xAC) ^ -" ".length())) != 0) {
                                return;
                            }
                        } else {
                            vector.addElement(gd2);
                        }
                        bl += 1;
                        if ("  ".length() == "  ".length()) continue;
                        return;
                    }
                    byte by4 = ((ad_0)object).cfr_renamed_0().readByte();
                    Vector<gd> vector3 = new Vector<gd>();
                    int n = 0;
                    while ((n < by4)) {
                        object2 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readByte();
                        ((gd)object2).soLuong = ((ad_0)object).cfr_renamed_0().readShort();
                        vector3.addElement((gd)object2);
                        ++n;
                        if (" ".length() >= 0) continue;
                        return;
                    }
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.var_short_long = ((ad_0)object).cfr_renamed_0().readByte();
                    AngelChip.duLieuNguoiChoi.var_byte_catch = ((ad_0)object).cfr_renamed_0().readByte();
                    by3 = ((ad_0)object).cfr_renamed_0().readByte();
                    vector2 = new Vector();
                    bl = 0;
                    while ((bl ? 1 : 0 < by3)) {
                        object2 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                        ((gd)object2).soLuong = ((ad_0)object).cfr_renamed_0().readShort();
                        vector2.addElement(object2);
                        bl += 1;
                        return;
                    }
                    by4 = ((ad_0)object).cfr_renamed_0().readByte();
                    object2 = new Vector();
                    n = 0;
                    while ((n < by4)) {
                        gd gd3 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                        gd3.soLuong = ((ad_0)object).cfr_renamed_0().readShort();
                        ((Vector)object2).addElement(gd3);
                        ++n;
                        if ("  ".length() != ((0xA9 ^ 0xBF) & ~(0x91 ^ 0x87))) continue;
                        return;
                    }
                    byte by5 = ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    bl = ((ad_0)object).cfr_renamed_0().readBoolean();
                    AngelChip.duLieuNguoiChoi.var_short_long = ((ad_0)object).cfr_renamed_0().readShort();
                    AngelChip.duLieuNguoiChoi.var_byte_catch = ((ad_0)object).cfr_renamed_0().readByte();
                    by4 = ((ad_0)object).cfr_renamed_0().readByte();
                    vector3.removeAllElements();
                    int n4 = 0;
                    while ((n4 < by4)) {
                        gd gd4 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                        gd4.soLuong = ((ad_0)object).cfr_renamed_0().readInt();
                        vector3.addElement(gd4);
                        ++n4;
                        return;
                    }
                    ((Vector)object2).removeAllElements();
                    by4 = ((ad_0)object).cfr_renamed_0().readByte();
                    n4 = 0;
                    while ((n4 < by4)) {
                        gd gd5 = new gd();
                        new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                        gd5.soLuong = ((ad_0)object).cfr_renamed_0().readInt();
                        ((Vector)object2).addElement(gd5);
                        ++n4;
                        if (-"  ".length() <= 0) continue;
                        return;
                    }
                    bF.bF_do();
                    bF.cfr_renamed_0(vector, vector3, vector2, (Vector)object2, by5, bl);
                    if (!(ak_0.soLuong == 0) || !bQ.boolean_if(bQ.boolean_do() ? 1 : 0) || !(ef_0.soLuong != 25)) break;
                    ak_0.cfr_renamed_4();
                    el_0.el_0_do().cfr_renamed_4(25, 0);
                    bF.cfr_renamed_11();
                    bF.bF_do().cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_char, 0);
                    return;
                }
                case 61: {
                    bQ.cfr_renamed_1((ad_0)object);
                    return;
                }
                case 62: {
                    gd gd6 = new gd();
                    new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                    gd6.soLuong = ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    ((ad_0)object).cfr_renamed_0().readByte();
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n5 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n6 = ((ad_0)object).cfr_renamed_0().readInt();
                    bF.bF_do();
                    bF.cfr_renamed_0(gd6, n, n5, n6);
                    TienIchGame.void_for();
                    return;
                }
                case 63: {
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n7 = ((ad_0)object).cfr_renamed_0().readInt();
                    short s4 = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.bF_do();
                    bF.cfr_renamed_0(n, n7, s4);
                    return;
                }
                case 64: {
                    ((ad_0)object).cfr_renamed_0().readInt();
                    byte by6 = ((ad_0)object).cfr_renamed_0().readByte();
                    byte by7 = ((ad_0)object).cfr_renamed_0().readByte();
                    bF.bF_do().void_byte(by6, by7);
                    TienIchGame.void_for();
                    return;
                }
                case 65: {
                    gd gd7;
                    ((ad_0)object).cfr_renamed_0().readByte();
                    short s5 = ((ad_0)object).cfr_renamed_0().readShort();
                    if ((bF.ff_do(s5) != null) && bQ.cfr_renamed_0(gd7 = gd.cfr_renamed_0(bF.var_java_util_Vector_do, (int)s5))) {
                        gd7.soLuong -= 1;
                        if (bQ.boolean_for(gd7.soLuong)) {
                            bF.var_java_util_Vector_do.removeElement(gd7);
                            }
                    }
                    TienIchGame.void_for();
                    return;
                }
                case 66: {
                    byte by8 = ((ad_0)object).cfr_renamed_0().readByte();
                    short s6 = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.bF_do();
                    bF.void_int(by8, s6);
                    TienIchGame.void_for();
                    return;
                }
                case 67: {
                    bF.bF_do();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    bF.cfr_renamed_4();
                    return;
                }
                case 69: {
                    bF.bF_do();
                    bF.cfr_renamed_0(((ad_0)object).cfr_renamed_0().readUTF());
                    return;
                }
                case 70: {
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    ((ad_0)object).cfr_renamed_0().readByte();
                    String string = ((ad_0)object).cfr_renamed_0().readUTF();
                    int n8 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n9 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n10 = ((ad_0)object).cfr_renamed_0().readInt();
                    bF.bF_do();
                    bF.cfr_renamed_0(n, string, n8, n9, n10);
                    return;
                }
                case 71: {
                    gd gd8 = new gd();
                    new gd().var_short_do = ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    ((ad_0)object).cfr_renamed_0().readByte();
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n11 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n12 = ((ad_0)object).cfr_renamed_0().readInt();
                    bF.bF_do();
                    bF.cfr_renamed_0(gd8, n, n11, n12);
                    TienIchGame.cfr_renamed_15();
                    return;
                }
                case 72: {
                    byte by9 = ((ad_0)object).cfr_renamed_0().readByte();
                    object = ((ad_0)object).cfr_renamed_0().readUTF();
                    bF.bF_do();
                    bF.cfr_renamed_0(by9, (String)object);
                    return;
                }
                case 73: {
                    ((ad_0)object).cfr_renamed_0().readInt();
                    byte by10 = ((ad_0)object).cfr_renamed_0().readByte();
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    bF.bF_do();
                    bF.void_for(by10, n);
                    TienIchGame.cfr_renamed_15();
                    return;
                }
                case 74: {
                    byte by11 = ((ad_0)object).cfr_renamed_0().readByte();
                    short s7 = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.bF_do();
                    bF.cfr_renamed_8(by11, s7);
                    return;
                }
                case 75: {
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n13 = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.void_int(n);
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[1] = n13;
                    GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF());
                    return;
                }
                case 76: {
                    ee.void_do((ad_0)object);
                    return;
                }
                case 77: {
                    ee.void_for((ad_0)object);
                    return;
                }
                case 78: {
                    if (bQ.boolean_if(bQ.boolean_do() ? 1 : 0)) {
                        TienIchGame.void_for();
                        return;
                    }
                    byte by12 = ((ad_0)object).cfr_renamed_0().readByte();
                    dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(by12);
                    ((dq_0)bF.var_java_util_Vector_int.elementAt(by12)).cfr_renamed_8 = ((ad_0)object).cfr_renamed_0().readByte();
                    (dq_02 !=  (ad_0)object);
                    bF.bF_do().void_for(by12);
                    TienIchGame.void_for();
                    return;
                }
                case 79: {
                    if (bQ.boolean_if(bQ.boolean_do() ? 1 : 0)) {
                        TienIchGame.cfr_renamed_15();
                        return;
                    }
                    byte by13 = ((ad_0)object).cfr_renamed_0().readByte();
                    byte by14 = ((ad_0)object).cfr_renamed_0().readByte();
                    if ((by14 == -1)) {
                        return;
                    }
                    ha ha2 = bF.ha_do((int)by13);
                    bF.ha_do((int)by13).cfr_renamed_18 = by14;
                    (ha2 !=  (ad_0)object);
                    bF.bF_do();
                    bF.this();
                    TienIchGame.cfr_renamed_15();
                    return;
                }
                case 80: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        String string = ((ad_0)object).cfr_renamed_0().readUTF();
                        Vector<ei> vector = new Vector<ei>();
                        vector.addElement(new ei(MenuChinhAvatar.cU, 3, bF.var_bF_do));
                        vector.addElement(new ei(MenuChinhAvatar.dh, 4, bF.var_bF_do));
                        vector.addElement(GameCanvas.var_ei_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n14 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n15 = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(n, n14, n15);
                    GameCanvas.cfr_renamed_6 = 1;
                    bF.bF_do().cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_char, 1);
                    bF.var_boolean_int = 1;
                    return;
                }
                case 81: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        String string = ((ad_0)object).cfr_renamed_0().readUTF();
                        Vector<ei> vector = new Vector<ei>();
                        vector.addElement(new ei(MenuChinhAvatar.cU, 5, bF.var_bF_do));
                        vector.addElement(new ei(MenuChinhAvatar.dh, 6, bF.var_bF_do));
                        vector.addElement(GameCanvas.var_ei_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    GameCanvas.cfr_renamed_6 = 1;
                    System.out.println("UPDATE_FARM_FISH: " + ((ad_0)object).cfr_renamed_0().available());
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n16 = ((ad_0)object).cfr_renamed_0().readInt();
                    int n17 = ((ad_0)object).cfr_renamed_0().readInt();
                    System.out.println("");
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(n, n16, n17);
                    bF.bF_do().cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_char, 1);
                    bF.var_boolean_int = 1;
                    return;
                }
                case 82: {
                    short s8 = ((ad_0)object).cfr_renamed_0().readShort();
                    byte[] byArray = new byte[((ad_0)object).cfr_renamed_0().readShort()];
                    ((ad_0)object).cfr_renamed_0().read(byArray);
                    ak_0.var_java_util_Hashtable_do.put("" + s8, new an(gc_0.javax_microedition_lcdui_Image_do(byArray)));
                    return;
                }
                case 83: {
                    if (!bQ.boolean_if(((ad_0)object).cfr_renamed_0().readBoolean() ? 1 : 0)) break;
                    bF.var_by_do.var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.var_by_do.var_short_if = (short)(bF.var_by_do.var_short_if + 1);
                    return;
                }
                case 84: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF(), 7, bF.var_bF_do);
                        TienIchGame.dangXuatTaiKhoan();
                        return;
                    }
                    ((ad_0)object).cfr_renamed_0().readInt();
                    short s9 = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.var_by_do.soLuong = s9 * 60;
                    bF.var_by_do.soXu = System.currentTimeMillis();
                    TienIchGame.cfr_renamed_11();
                    return;
                }
                case 85: {
                    try {
                        short s10 = ((ad_0)object).cfr_renamed_0().readShort();
                        short s11 = ((ad_0)object).cfr_renamed_0().readShort();
                        bF.bF_do();
                        bF.cfr_renamed_0(s10, s11);
                        }
                    catch (IOException iOException) {
                        }
                    if (-(0x64 ^ 0x61) >= 0) {
                        return;
                    }
                    TienIchGame.void_int();
                    return;
                }
                case 86: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF(), 8, bF.var_bF_do);
                        return;
                    }
                    ((ad_0)object).cfr_renamed_0().readInt();
                    bF.var_by_do.var_short_do = ((ad_0)object).cfr_renamed_0().readShort();
                    bF.var_by_do.soLuong = 0;
                    bF.var_by_do.var_short_if = (short)(bF.var_by_do.var_short_if + 1);
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n18 = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n18);
                    return;
                }
                case 90: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        String string = ((ad_0)object).cfr_renamed_0().readUTF();
                        Vector<ei> vector = new Vector<ei>();
                        vector.addElement(new ei(MenuChinhAvatar.cU, 9, bF.var_bF_do));
                        vector.addElement(new ei(MenuChinhAvatar.dh, 10, bF.var_bF_do));
                        vector.addElement(GameCanvas.var_ei_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    ((ad_0)object).cfr_renamed_0().readByte();
                    ((ad_0)object).cfr_renamed_0().readInt();
                    int n = ((ad_0)object).cfr_renamed_0().readByte();
                    GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF());
                    ((dq_0)bF.var_java_util_Vector_int.elementAt((int)n)).var_byte_int = (byte)(((dq_0)bF.var_java_util_Vector_int.elementAt((int)n)).var_byte_int + 1);
                    bF.bF_do().cfr_renamed_0(bF.soLuong, bF.var_java_util_Vector_int, bF.var_java_util_Vector_if, bF.var_byte_if, bF.var_byte_do, bF.var_short_do, bF.var_int_char);
                    n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n19 = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n19);
                    return;
                }
                case 91: {
                    short s12 = ((ad_0)object).cfr_renamed_0().readShort();
                    if ((s12 == -1)) {
                        bF.var_short_do = (short)0;
                        if ((0x95 ^ 0x91) <= "   ".length()) {
                            return;
                        }
                    } else {
                        short s13 = ((ad_0)object).cfr_renamed_0().readShort();
                        bF.var_short_do = s12;
                        bF.var_int_char = s13 * 60;
                    }
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 92: {
                    object = ak_0.dv_0_do(bF.var_short_do);
                    ff ff2 = bF.ff_do(((dv_0)object).var_short_do);
                    gd gd9 = bF.gd_do(((dv_0)object).var_short_do);
                    if ((gd9 != null)) {
                        gd9.soLuong += 1;
                        if ("  ".length() < 0) {
                            return;
                        }
                    } else {
                        gd9 = new gd();
                        new gd().var_short_do = ((dv_0)object).var_short_do;
                        gd9.soLuong = 1;
                        bF.var_java_util_Vector_try.addElement(gd9);
                    }
                    GameCanvas.void_do(0, bF.var_int_goto, bF.var_int_byte, ff2.var_short_if);
                    bF.var_short_do = (short)0;
                    TienIchGame.void_int();
                    return;
                }
                case 93: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF(), 11, bF.var_bF_do);
                        return;
                    }
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n20 = 2;
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[n20] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n20] - n;
                    bF.var_int_char = 0;
                    n = ((ad_0)object).cfr_renamed_0().readInt();
                    int n21 = ((ad_0)object).cfr_renamed_0().readInt();
                    AngelChip.duLieuNguoiChoi.cfr_renamed_0(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], n, n21);
                    return;
                }
                case 94: {
                    if (bQ.cfr_renamed_5(((ad_0)object).cfr_renamed_0().readByte())) {
                        String string = ((ad_0)object).cfr_renamed_0().readUTF();
                        Vector<ei> vector = new Vector<ei>();
                        vector.addElement(new ei(MenuChinhAvatar.cU, 13, bF.var_bF_do));
                        vector.addElement(new ei(MenuChinhAvatar.dh, 14, bF.var_bF_do));
                        vector.addElement(GameCanvas.var_ei_do);
                        GameCanvas.hienThongBaoPopup(string, vector);
                        return;
                    }
                    byte by15 = ((ad_0)object).cfr_renamed_0().readByte();
                    int n = ((ad_0)object).cfr_renamed_0().readInt();
                    if ((by15 == 1)) {
                        int n22 = 0;
                        AngelChip.duLieuNguoiChoi.mangSoNguyen[n22] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n22] - n;
                        if (((0xCB ^ 0xC6) & ~(0xBF ^ 0xB2)) != 0) {
                            return;
                        }
                    } else {
                        int n23 = 2;
                        AngelChip.duLieuNguoiChoi.mangSoNguyen[n23] = AngelChip.duLieuNguoiChoi.mangSoNguyen[n23] - n;
                    }
                    ((ad_0)object).cfr_renamed_0().readInt();
                    bF.var_byte_int = (byte)(bF.var_byte_int + 1);
                    GameCanvas.cfr_renamed_1(((ad_0)object).cfr_renamed_0().readUTF());
                    bF.bF_do().cfr_renamed_0(bF.soLuong, bF.var_java_util_Vector_int, bF.var_java_util_Vector_if, bF.var_byte_if, bF.var_byte_do, bF.var_short_do, bF.var_int_char);
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

                private static void cfr_renamed_1(ad_0 ad_02) {
        byte by2;
        byte by3;
        int n = ad_02.var_java_io_DataInputStream_do.readInt();
        Vector<dq_0> vector = new Vector<dq_0>();
        Vector<dq_0> vector2 = new Vector<dq_0>();
        int n2 = 0;
        if ((n != -1)) {
            aG aG2;
            n2 = ad_02.var_java_io_DataInputStream_do.readByte();
            by3 = 0;
            while ((by3 < n2)) {
                aG2 = new dq_0();
                new dq_0().cfr_renamed_8 = ad_02.var_java_io_DataInputStream_do.readByte();
                if ((aG2.cfr_renamed_8 == -1)) {
                    vector.addElement((dq_0)aG2);
                    if (-" ".length() >= (0x30 ^ 0x34)) {
                        return;
                    }
                } else {
                    (aG2 != ad_02);
                    vector.addElement((dq_0)aG2);
                }
                ++by3;
                if ((0x6F ^ 0x6A) > 0) continue;
                return;
            }
            by2 = ad_02.var_java_io_DataInputStream_do.readByte();
            if (!(ef_0.soLuong == 24) || (AngelChip.duLieuNguoiChoi.var_short_char != n)) {
                ee_0.cfr_renamed_12 = (byte)0;
                ea_0.var_byte_do = (byte)0;
                gC.soLuong = 0;
                bF.var_java_util_Vector_if.removeAllElements();
            }
            by3 = 0;
            while ((by3 < by2)) {
                aG2 = null;
                byte by4 = ad_02.var_java_io_DataInputStream_do.readByte();
                int n3 = bF.var_java_util_Vector_if.size();
                if ((ef_0.soLuong == 24) && bQ.boolean_if(n3) && (n3 == by2)) {
                    bF.ha_do((int)by3);
                    aG2 = (ha)bF.var_java_util_Vector_if.elementAt(by3);
                    if (-"   ".length() > 0) {
                        return;
                    }
                } else {
                    fc_0 fc_02 = ak_0.fc_0_do((int)by4);
                    if ((by4 != -1)) {
                        switch (fc_02.var_byte_if) {
                            case 1: {
                                aG2 = new gC(by3, by4);
                                if (" ".length() >= 0) break;
                                return;
                            }
                            case 2: {
                                aG2 = new ee_0(by3, by4);
                                if ("  ".length() > -" ".length()) break;
                                return;
                            }
                            case 3: {
                                aG2 = new ea_0(by3, by4);
                                if (((0xEC ^ 0x8E) & ~(0x76 ^ 0x14)) != "   ".length()) break;
                                return;
                            }
                            case 4: {
                                aG2 = new eb_0(by3, by4);
                            }
                        }
                    }
                }
                if ((by4 != -1) && (aG2 != null)) {
                    ((ha)aG2).cfr_renamed_18 = by4;
                    bQ.cfr_renamed_0((ha)aG2, ad_02);
                    vector2.addElement((dq_0)aG2);
                }
                ++by3;
                if (-" ".length() < (0x5B ^ 0x34 ^ (0x20 ^ 0x4B))) continue;
                return;
            }
        }
        by2 = ad_02.var_java_io_DataInputStream_do.readByte();
        by3 = ad_02.var_java_io_DataInputStream_do.readByte();
        bF.var_by_do = new by();
        new by().var_short_if = ad_02.var_java_io_DataInputStream_do.readShort();
        bF.var_by_do.var_short_do = ad_02.var_java_io_DataInputStream_do.readShort();
        bF.var_by_do.cfr_renamed_3 = ad_02.var_java_io_DataInputStream_do.readShort();
        bF.var_by_do.var_short_new = ad_02.var_java_io_DataInputStream_do.readShort();
        ad_02.var_java_io_DataInputStream_do.readShort();
        ad_02.var_java_io_DataInputStream_do.readShort();
        bF.var_by_do.soLuong = ad_02.var_java_io_DataInputStream_do.readShort() * 60;
        bF.var_by_do.soXu = System.currentTimeMillis();
        short s2 = 0;
        while ((s2 < n2)) {
            dq_0 dq_02 = (dq_0)vector.elementAt(s2);
            ((dq_0)vector.elementAt(s2)).var_byte_int = ad_02.var_java_io_DataInputStream_do.readByte();
            dq_02.cfr_renamed_15 = s2 + 1;
            ++s2;
            return;
        }
        s2 = 0;
        int n4 = 0;
        if (bQ.boolean_do(ad_02.var_java_io_DataInputStream_do.available())) {
            s2 = ad_02.var_java_io_DataInputStream_do.readShort();
            n4 = ad_02.var_java_io_DataInputStream_do.readShort() * 60;
        }
        bF.bF_do().cfr_renamed_0(n, vector, vector2, by2, by3, s2, n4);
    }

    private static void (dq_0 dq_02 != ad_0 ad_02) {
        short s2 = ad_02.var_java_io_DataInputStream_do.readShort();
        bF.cfr_renamed_0(dq_02.var_short_do, (int)s2, dq_02, null);
        dq_02.var_short_do = s2;
        dq_02.soXu = dq_02.var_short_do * 60;
        s2 = ad_02.var_java_io_DataInputStream_do.readByte();
        bF.cfr_renamed_0(dq_02.var_byte_for, (int)s2, dq_02, null);
        dq_02.var_byte_for = (byte)s2;
        dq_02.var_byte_do = ad_02.var_java_io_DataInputStream_do.readByte();
        dq_02.coTrangThai = ad_02.var_java_io_DataInputStream_do.readBoolean();
        s2 = (short)(ad_02.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0);
        int n = -1;
        if ((s2 == 0) && bQ.boolean_if(dq_02.coKichHoat ? 1 : 0)) {
            n = 0;
        }
        dq_02.coKichHoat = s2;
        int n2 = ad_02.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0;
        if ((n2 == 0) && bQ.boolean_if(dq_02.var_boolean_int ? 1 : 0)) {
            n = 9 * bn_0.cfr_renamed_6;
        }
        dq_02.var_boolean_int = n2;
        if ((n >= 0)) {
            GameCanvas.hienThongBaoPopup(0, dq_02.cfr_renamed_2 * ef_0.var_int_if + 11, dq_02.var_int_new * ef_0.var_int_if, gc_0.cfr_renamed_0(0, n, 13 * bn_0.cfr_renamed_6, 9 * bn_0.cfr_renamed_6, bF.var_ep_for.var_javax_microedition_lcdui_Image_do), -1);
        }
    }

    private static void (ha ha2 != ad_0 ad_02) {
        ha2.this = ad_02.var_java_io_DataInputStream_do.readInt();
        byte by2 = ad_02.var_java_io_DataInputStream_do.readByte();
        bF.cfr_renamed_0(ha2.cfr_renamed_6, (int)by2, null, ha2);
        ha2.cfr_renamed_6 = by2;
        ad_02.var_java_io_DataInputStream_do.readByte();
        ha2.cfr_renamed_19 = ad_02.var_java_io_DataInputStream_do.readByte();
        ha2.cfr_renamed_5 = ad_02.var_java_io_DataInputStream_do.readBoolean();
        by2 = (byte)(ad_02.var_java_io_DataInputStream_do.readBoolean() ? 1 : 0);
        int n = ad_02.var_java_io_DataInputStream_do.readBoolean();
        int n2 = -1;
        if ((by2 == 0) && bQ.boolean_if(ha2.var_boolean_arr_do[0])) {
            n2 = 0;
        }
        if ((n == 0) && bQ.boolean_if(ha2.var_boolean_arr_do[1])) {
            n2 = 13 * bn_0.cfr_renamed_6;
        }
        if ((n2 >= 0)) {
            GameCanvas.hienThongBaoPopup(0, ha2.coKichHoat ? 1 : 0, ha2.cfr_renamed_1 - ha2.cfr_renamed_4, gc_0.cfr_renamed_0(0, n2, 9 * bn_0.cfr_renamed_6, 13 * bn_0.cfr_renamed_6, bF.var_ep_do.var_javax_microedition_lcdui_Image_do), -1);
        }
        ha2.var_boolean_arr_do[0] = by2;
        ha2.var_boolean_arr_do[1] = n;
    }

    private static void void_do() {
        mangSoNguyen = new int[20];
        0 = (0xF ^ 0x14) & ~(2 ^ 0x19);
        100 = 0xAD ^ 0x81 ^ (0x1E ^ 0x56);
        25 = 0x5C ^ 0x2D ^ (0x57 ^ 0x3F);
        1 = " ".length();
        -1 = -" ".length();
        3 = "   ".length();
        4 = 0x7B ^ 0x7F;
        5 = 0x3A ^ 0x3F;
        6 = 0x80 ^ 0x86;
        7 = 0xEC ^ 0x96 ^ (0xFF ^ 0x82);
        60 = 0x6B ^ 0x79 ^ (0x5F ^ 0x71);
        8 = 0xCC ^ 0xC4;
        9 = 0x5B ^ 0x67 ^ (0x69 ^ 0x5C);
        10 = 0xB2 ^ 0xBD ^ (0xB8 ^ 0xBD);
        11 = 0x50 ^ 0x5B;
        2 = "  ".length();
        13 = 108 + 120 - 39 + 13 ^ 119 + 22 - 128 + 186;
        14 = 41 + 45 - 54 + 130 ^ 92 + 9 - -24 + 47;
        24 = 0x7B ^ 0x63;
        53 = 0xF1 ^ 0xC4;
    }
}

