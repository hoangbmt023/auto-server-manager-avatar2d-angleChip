/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from go
 */
public final class go_0
extends en
implements gl {
    public static byte var_byte_do;
    public static DuLieuNguoiChoi duLieuNguoiChoi;
    public static byte var_byte_if;
    private int var_int_byte;
    public long soXu;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static byte var_byte_for;
    private byte cfr_renamed_13;
    public static int soLuong;
    public static boolean dangChayAuto;
    private fl_0 var_fl_0_byte;
    private long var_long_if;
    private int var_int_case;
    public static String chuoiGiaTri;
    public static DuLieuNguoiChoi var_ef_if;
    public static int var_int_if;
    public fl_0 var_fl_0_do;
    public fl_0 var_fl_0_if;
    public static boolean coTrangThai;
    private Vector var_java_util_Vector_try;
    private byte cfr_renamed_9 = (byte)0;
    static byte[] var_byte_arr_do;
    public static go_0 var_go_0_do;
    public static Vector var_java_util_Vector_do;
    private static final int[] mangSoNguyen;
    public static short[] var_short_arr_do;
    public static byte var_byte_int;
    public boolean coKichHoat;
    public static Vector var_java_util_Vector_if;
    public static Image var_javax_microedition_lcdui_Image_if;
    public fl_0 var_fl_0_for;
    private fl_0 var_fl_0_case;
    public static boolean var_boolean_int;
    public static Vector var_java_util_Vector_for;
    public static int soLuongKhoa;
    public static int var_int_int;
    public boolean var_boolean_try;
    public static boolean var_boolean_byte;
    private fl_0 var_fl_0_char;
    public static boolean var_boolean_case;
    public static Vector var_java_util_Vector_int;
    public static Vector var_java_util_Vector_new;
    public static byte var_byte_char;
    public static int var_int_new;
    public static int var_int_try;

    public static void (byte by2, int n, short s2, int n2, short s3, short s4 == null) {
        ed ed2 = new ed(by2, s2, n2);
        short s5 = s3;
        s3 = s4;
        n2 = s5;
        s2 = (short)n;
        ed ed3 = ed2;
        if (go_0.boolean_if((int)s2, -2)) {
            ((bm)ed3).cfr_renamed_2 = n2;
            ((bm)ed3).cfr_renamed_3 = s3;
            ed3.cfr_renamed_8 = (byte)2;
            if ((0x10 ^ 0x4A ^ (0x77 ^ 0x29)) == 0) {
                return;
            }
        } else {
            DuLieuNguoiChoi ef2 = fh.ef_do(s2);
            if (go_0.cfr_renamed_0((Object)ef2)) {
                ((bm)ed3).cfr_renamed_2 = ((bm)ef2).cfr_renamed_2;
                ((bm)ed3).cfr_renamed_3 = ((bm)ef2).cfr_renamed_3;
                ed3.cfr_renamed_8 = (byte)0;
                ed3.cfr_renamed_13 = (byte)6;
                ed3.var_short_do = (short)0;
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else {
                ed3.cfr_renamed_8 = (byte)4;
                ((bm)ed3).cfr_renamed_2 = n2;
                ((bm)ed3).cfr_renamed_3 = s3;
                ed3.var_short_do = (short)100;
                ed3.cfr_renamed_13 = (byte)0;
            }
        }
        ed3.soLuong = n2;
        ed3.var_int_this = s3;
        fh.var_java_util_Vector_case.addElement(ed2);
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        }

    private static void cfr_renamed_33() {
        Vector<fl_0> vector = new Vector<fl_0>();
        if (go_0.boolean_do(fw_0.dangChayAuto ? 1 : 0)) {
            vector.addElement(new fl_0("Bật auto", fw_0.fw_0_do()));
            } else {
            vector.addElement(new fl_0("Tắt auto", fw_0.fw_0_do()));
        }
        vector.addElement(new fl_0("Cài đặt", P.P_do()));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    protected static void (ee_0 ee_02 == null) {
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_try, new dd(ee_02));
    }

    private static void (DuLieuNguoiChoi ef2 != int n) {
        byte[] byArray;
        String[] stringArray;
        Vector[] vectorArray;
        go_0.cfr_renamed_2(ef2);
        byte[] byArray2 = null;
        byte[] byArray3 = new byte[2];
        if (go_0.boolean_if((int)var_byte_char, 3)) {
            byArray3[0] = 3;
            byArray3[1] = 8;
        }
        switch (var_byte_char) {
            case 1: 
            case 6: {
                byte[] byArray4 = new byte[2];
                byArray4[0] = 10;
                byArray4[1] = 20;
                byArray2 = byArray4;
                Vector[] vectorArray2 = new Vector[2];
                vectorArray = vectorArray2;
                vectorArray2[0] = new Vector();
                vectorArray[1] = new Vector();
                String[] stringArray2 = new String[2];
                stringArray = stringArray2;
                stringArray2[0] = MenuChinhAvatar.chuoiGiaTri;
                stringArray[1] = MenuChinhAvatar.cu;
                byArray3[0] = 1;
                byArray3[1] = 6;
                byArray = new byte[2];
                if (-" ".length() < " ".length()) break;
                return;
            }
            case 2: 
            case 7: {
                byte[] byArray5 = new byte[2];
                byArray5[0] = 40;
                byArray5[1] = 50;
                byArray2 = byArray5;
                Vector[] vectorArray3 = new Vector[2];
                vectorArray = vectorArray3;
                vectorArray3[0] = new Vector();
                vectorArray[1] = new Vector();
                String[] stringArray3 = new String[2];
                stringArray = stringArray3;
                stringArray3[0] = MenuChinhAvatar.bK;
                stringArray[1] = MenuChinhAvatar.var_java_lang_String_const;
                byArray = new byte[2];
                byArray3[0] = 2;
                byArray3[1] = 7;
                if (-"  ".length() < 0) break;
                return;
            }
            default: {
                Vector[] vectorArray4 = new Vector[1];
                vectorArray = vectorArray4;
                vectorArray4[0] = new Vector();
                String[] stringArray4 = new String[1];
                stringArray = stringArray4;
                stringArray4[0] = MenuChinhAvatar.cE;
                byArray = new byte[1];
            }
        }
        int n2 = 0;
        while (go_0.boolean_try(n2, aa_0.var_am_arr_do.length)) {
            if (go_0.boolean_int(aa_0.var_am_arr_do[n2].cfr_renamed_2, -2)) {
                byte by2;
                am am2 = aa_0.var_am_arr_do[n2];
                if (go_0.boolean_int(am2.cfr_renamed_2)) {
                    by2 = ((cX)aa_0.var_am_arr_do[am2.cfr_renamed_2]).cfr_renamed_3;
                    if (-"  ".length() >= 0) {
                        return;
                    }
                } else {
                    by2 = ((cX)am2).cfr_renamed_3;
                }
                if (!(!go_0.cfr_renamed_0((Object)am2) || go_0.boolean_for(am2.mangSoNguyen[0]) && !go_0.boolean_try(am2.mangSoNguyen[1]) || go_0.boolean_int(ef2.var_byte_do, by2) && !go_0.boolean_do((int)by2) || go_0.boolean_int(byArray3[0], am2.var_byte_do) && !go_0.boolean_if((int)byArray3[1], (int)am2.var_byte_do) || !go_0.boolean_for(am2.cfr_renamed_2, -2))) {
                    if ((byArray2 == null)) {
                        by2 = byArray[0];
                        vectorArray[0].addElement(new ct_0(MenuChinhAvatar.cT, new cn_0(am2), am2, by2));
                        int n3 = 0;
                        byArray[n3] = (byte)(byArray[n3] + 1);
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else {
                        by2 = 0;
                        while (go_0.boolean_try(by2, vectorArray.length)) {
                            if (go_0.boolean_if((int)byArray2[by2], (int)am2.var_byte_if)) {
                                byte by3 = byArray[by2];
                                vectorArray[by2].addElement(new b_0(MenuChinhAvatar.cT, new az(am2), am2, by3));
                                byte by4 = by2;
                                byArray[by4] = (byte)(byArray[by4] + 1);
                            }
                            ++by2;
                            if (-" ".length() != ((1 ^ 0x48) & ~(6 ^ 0x4F))) continue;
                            return;
                        }
                    }
                }
            }
            ++n2;
            return;
        }
        fo.fo_do().cfr_renamed_4();
        fo.coTrangThai = 1;
        fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
        fo.var_int_if = n;
        fo.fo_do().cfr_renamed_13();
        GameCanvas.cfr_renamed_7();
        if (go_0.boolean_if(fh.var_int_char, 57) && go_0.boolean_if(GameCanvas.coKichHoat ? 1 : 0)) {
            GameCanvas.var_fv_do = new fv();
            GameCanvas.var_fv_do.cfr_renamed_1(fo.var_fo_do);
        }
    }

    public static void (short s2 != int n) {
        GameCanvas.cfr_renamed_7();
        fo.var_boolean_int = 1;
        ee_0 ee_02 = ee_0.cfr_renamed_1(aa_0.var_java_util_Vector_do, (int)s2);
        if ((ee_02 != null)) {
            if (go_0.boolean_if((int)ee_02.var_byte_do, 5)) {
                ep_0.ep_0_do().cfr_renamed_3(AngelChip.duLieuNguoiChoi.var_short_goto);
            }
            AngelChip.duLieuNguoiChoi.void_do(n);
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static void void_try(int n, int n2) {
        if (go_0.boolean_int(n, n2)) {
            String string;
            StringBuffer stringBuffer = new StringBuffer();
            if (go_0.boolean_try(n2 - n)) {
                string = "+";
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.cfr_renamed_1(stringBuffer.append(string).append(n2 - n).toString(), (int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int - 40, 0, -1);
        }
    }

    public final void cfr_renamed_2() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 13, this));
        vector.addElement(new fl_0("Cài đặt", 15, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    protected final void cfr_renamed_3() {
        ep.cfr_renamed_1().cfr_renamed_1((int)go_0.var_ef_if.var_short_goto, (String)go_0.var_ef_if.soLuong);
        ep.cfr_renamed_1().void_do(this);
    }

    protected static void cfr_renamed_5() {
        if (go_0.cfr_renamed_0((Object)var_ef_if) && go_0.boolean_do(go_0.var_ef_if.var_int_class)) {
            fn.fn_do().void_if(go_0.var_ef_if.var_short_goto, 101);
        }
    }

    public static void void_for(int n, int n2) {
        cg cg2;
        DuLieuNguoiChoi ef2;
        if (go_0.boolean_int(n, AngelChip.duLieuNguoiChoi.var_short_goto) && go_0.cfr_renamed_0((Object)(ef2 = fh.ef_do(n))) && (cg2 = aa_0.cg_do(ef2.var_java_util_Vector_if, n2) != null)) {
            ef2.var_java_util_Vector_if.removeElement(cg2);
            }
    }

        public static void void_do(DuLieuNguoiChoi ef2) {
        cg cg2 = aa_0.cfr_renamed_1((int)((cX)aa_0.am_do((short)((short)ef2.var_int_void))).var_int_arr_if, ef2.var_java_util_Vector_if);
        if ((cg2 == null)) {
            ef2.cfr_renamed_0(new cg((short)ef2.var_int_void));
            ef2.void_if();
            return;
        }
        cg2.var_short_do = (short)ef2.var_int_void;
    }

    public final fl_0 (Vector vector, int n, int n2, boolean bl == null) {
        fl_0 fl_02 = new fl_0(MenuChinhAvatar.al, new gC(this, vector, n, n2));
        if (go_0.boolean_if(bl ? 1 : 0)) {
            return new fl_0(MenuChinhAvatar.bR, new F(fl_02, vector));
        }
        return fl_02;
    }

    public final void b_() {
        String string;
        this.var_fl_0_char = new fl_0(MenuChinhAvatar.bR, 0, this);
        ((en)this).cfr_renamed_5 = this.var_fl_0_char;
        ff_0.cfr_renamed_1();
        this.var_fl_0_for = ff_0.cfr_renamed_1(MenuChinhAvatar.FormCaiDatCauCa, new ed_0(), 15);
        if (go_0.boolean_if(GameCanvas.var_boolean_try ? 1 : 0)) {
            if (go_0.boolean_do(GameCanvas.cfr_renamed_12)) {
                string = MenuChinhAvatar.cT;
                if ((58 + 11 - -75 + 14 ^ 123 + 134 - 191 + 88) < "   ".length()) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.bR;
                if ("  ".length() <= 0) {
                    return;
                }
            }
        } else {
            string = "";
        }
        this.var_fl_0_do = new fl_0(string, 1, this);
        if (go_0.boolean_try(GameCanvas.cfr_renamed_12) && (GameCanvas.var_fv_do == null)) {
            ((en)this).cfr_renamed_5 = this.var_fl_0_do;
        }
        this.var_fl_0_byte = new fl_0(MenuChinhAvatar.cfr_renamed_34, 2, this);
        this.var_fl_0_case = new fl_0(MenuChinhAvatar.au, 2);
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.aa, 43, this);
        this.soXu = System.currentTimeMillis();
    }

    public static void cfr_renamed_8() {
        go_0.cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
    }

    public final boolean boolean_do() {
        if (go_0.boolean_if(this.coKichHoat ? 1 : 0) && (AutoController.nhiemVuHienTai == null)) {
            return 1;
        }
        return 0;
    }

    public final void cfr_renamed_13() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Lựa chọn", 118, this));
        vector.addElement(new fl_0("Xem trước", 119, this));
        vector.addElement(new fl_0("Quãng nghỉ: " + al.soXu, 120, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static boolean (ey_0[] ey_0Array == null) {
        int n = -1;
        int n2 = 0;
        while (go_0.boolean_try(n2, 3)) {
            if (go_0.boolean_if(ey_0Array[n2].java_lang_String_do().equals("") ? 1 : 0)) {
                n = n2;
            }
            ++n2;
            if (" ".length() != 0) continue;
            return ((0x6C ^ 0xF) & ~(0xA4 ^ 0xC7)) != 0;
        }
        if (go_0.boolean_do(ey_0Array[1].java_lang_String_do().equals(ey_0Array[2].java_lang_String_do()) ? 1 : 0)) {
            n = 3;
        }
        if (go_0.boolean_if(ey_0Array[0].java_lang_String_do().equals(ey_0Array[1].java_lang_String_do()) ? 1 : 0)) {
            n = 4;
        }
        if (go_0.boolean_int(n, -1)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_char[n]);
            return 0;
        }
        return 1;
    }

    public final void (byte by2, byte by3, short s2, short s3, Vector vector, Vector vector2, Vector vector3 == null) {
        if (go_0.boolean_if((int)by3, -1)) {
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.cfr_renamed_45, 52, null);
            return;
        }
        if (go_0.boolean_if(fh.var_int_else, -1)) {
            fh.var_java_util_Vector_do = vector2;
            fh.var_java_util_Vector_if = vector3;
        }
        GameCanvas.cfr_renamed_5();
        var_byte_for = by2;
        var_byte_do = by3;
        var_ef_if = null;
        fh.var_bm_do = null;
        AngelChip.duLieuNguoiChoi.var_int_class = 0;
        if (!go_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0) || !go_0.boolean_if((int)by2, fh.var_int_char) || go_0.boolean_if((int)by2, fh.var_int_char) && !go_0.boolean_int(fh.var_int_else, -1) || go_0.boolean_if(fh.var_int_else, -1) && (!go_0.boolean_int(fh.var_int_char, 14) || !go_0.boolean_int(fh.var_int_char, 15) || go_0.boolean_if(fh.var_int_char, 16))) {
            AngelChip.duLieuNguoiChoi.soLuong = 0;
            if (go_0.boolean_int(by2, fh.var_int_char)) {
                AngelChip.duLieuNguoiChoi.var_short_for = s2;
                AngelChip.duLieuNguoiChoi.var_boolean_int = s3;
            }
            fh.var_java_util_Vector_char.removeAllElements();
            GameCanvas.var_fh_do.void_do(by2 + 1);
            } else {
            var_java_util_Vector_new.removeAllElements();
            fh.var_java_util_Vector_case.removeAllElements();
            fh.var_java_util_Vector_int.removeAllElements();
            GameCanvas.var_java_util_Vector_if.removeAllElements();
            fh.cfr_renamed_1(AngelChip.duLieuNguoiChoi);
        }
        if ((vector2 != null)) {
            fh.cfr_renamed_3();
        }
        if (go_0.boolean_int(fh.cfr_renamed_9, -1)) {
            AngelChip.duLieuNguoiChoi.void_do(fh.cfr_renamed_9, fh.var_int_try);
            fh.var_int_try = -1;
            fh.cfr_renamed_9 = -1;
        }
        if (go_0.boolean_int(fh.soLuong, -1)) {
            AngelChip.duLieuNguoiChoi.var_short_for = (short)fh.soLuong;
            AngelChip.duLieuNguoiChoi.var_boolean_int = fh.var_int_case;
            fh.var_int_case = -1;
            fh.soLuong = -1;
            go_0.cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, 0);
        }
        GameCanvas.gameCanvas.cfr_renamed_3();
        if ((GameCanvas.var_en_do != this)) {
            if (go_0.boolean_do(al_0.soLuong)) {
                go_0.go_0_do().cfr_renamed_4();
                if (-" ".length() > ((56 + 143 - 23 + 52 ^ 88 + 150 - 100 + 30) & (0x30 ^ 0xA ^ (0x42 ^ 0x34) ^ -" ".length()))) {
                    return;
                }
            } else {
                al_0.soLuong = 2;
                aU.cfr_renamed_1().cfr_renamed_4();
            }
        }
        by2 = (byte)0;
        while (go_0.boolean_try(by2, vector.size())) {
            bm bm2 = (bm)vector.elementAt(by2);
            if (go_0.boolean_do((int)bm2.var_byte_if)) {
                bm2 = (DuLieuNguoiChoi)bm2;
                ((DuLieuNguoiChoi)bm2).var_short_char = ((DuLieuNguoiChoi)bm2).var_short_for;
                ((DuLieuNguoiChoi)bm2).var_short_try = (short)(((DuLieuNguoiChoi)bm2).var_boolean_int ? 1 : 0);
                ((DuLieuNguoiChoi)bm2).var_byte_long = (byte)(((DuLieuNguoiChoi)bm2).cfr_renamed_4 ? 1 : 0);
                ((DuLieuNguoiChoi)bm2).void_if();
                if (go_0.boolean_int(((DuLieuNguoiChoi)bm2).var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    go_0.cfr_renamed_4((DuLieuNguoiChoi)bm2);
                    fh.cfr_renamed_1((DuLieuNguoiChoi)bm2);
                }
                if (((0x7C ^ 0x5D) & ~(0x1F ^ 0x3E)) != 0) {
                    return;
                }
            } else if (go_0.boolean_if((int)bm2.var_byte_if, 5)) {
                bm2 = (ed)bm2;
                ((ed)bm2).soLuong = ((ed)bm2).cfr_renamed_2;
                ((ed)bm2).var_int_this = ((ed)bm2).cfr_renamed_3;
                fh.var_java_util_Vector_case.addElement(bm2);
            }
            by2 = (byte)(by2 + 1);
            if (-" ".length() < 0) continue;
            return;
        }
        if (go_0.boolean_if(fj_0.dangChayAuto ? 1 : 0)) {
            (fj_0.var_fs_do.soLuong, fj_0.var_fs_do.var_int_if, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 == null);
            } else {
            AngelChip.duLieuNguoiChoi.var_boolean_int += 1;
            go_0.cfr_renamed_8();
        }
        go_0.cfr_renamed_7(AngelChip.duLieuNguoiChoi.var_short_final);
        if (go_0.boolean_do(GameCanvas.cfr_renamed_12) && (GameCanvas.var_fv_do == null)) {
            ((en)this).cfr_renamed_5 = this.var_fl_0_char;
        }
        var_ef_if = null;
        if (go_0.boolean_int(fh.var_int_char, 25)) {
            GameCanvas.cfr_renamed_7();
        }
        GameCanvas.gameCanvas.sizeChanged(0, 0);
        if (go_0.boolean_if(GameCanvas.coKichHoat ? 1 : 0)) {
            if (go_0.boolean_if(fh.var_int_char, 9) && go_0.boolean_if(fv.soLuongKhoa)) {
                GameCanvas.var_fv_do = new fv();
                GameCanvas.var_fv_do.cfr_renamed_2();
                if (-"  ".length() >= 0) {
                    return;
                }
            } else if (go_0.boolean_do(fj_0.dangChayAuto ? 1 : 0) && go_0.boolean_if(fh.var_int_char, 23)) {
                GameCanvas.var_fv_do = new fv();
                GameCanvas.var_fv_do.cfr_renamed_5();
                if (-" ".length() > 0) {
                    return;
                }
            } else if (go_0.boolean_if(fh.var_int_char, 25) && go_0.boolean_try(fv.soLuong)) {
                GameCanvas.var_fv_do = new fv();
                GameCanvas.var_fv_do.cfr_renamed_0(var_go_0_do);
            }
            ((en)this).cfr_renamed_5 = null;
            ((en)this).cfr_renamed_3 = null;
        }
        AngelChip.duLieuNguoiChoi.var_java_util_Vector_if = (Vector)0;
        AngelChip.duLieuNguoiChoi.var_boolean_int = 0;
        AngelChip.duLieuNguoiChoi.cfr_renamed_7 = (short)4;
        var_boolean_case = 0;
        coTrangThai = 0;
        GameCanvas.var_ez_do = null;
        if (go_0.boolean_if(fh.var_int_char, 108)) {
            fm.fm_do().cfr_renamed_3();
            fm.fm_do().void_do();
        }
        if (go_0.boolean_do(GameCanvas.var_int_byte)) {
            GameCanvas.var_int_byte = 1;
        }
    }

    public static void (int n != byte by2) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            if (go_0.boolean_new(by2, 100)) {
                ef2.void_new(by2 - 100);
                ef2.cfr_renamed_7 = ef2.var_short_final;
                ef2.var_short_long = (short)0;
                return;
            }
            ef2.cfr_renamed_0(by2);
        }
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

    public static String java_lang_String_do() {
        return MenuChinhAvatar.db + ": " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.cb;
    }

    private static void cfr_renamed_39() {
        Vector<fl_0> vector = new Vector<fl_0>();
        if (go_0.cfr_renamed_0((Object)var_ef_if) && go_0.boolean_try(go_0.var_ef_if.var_short_goto, 2000000000)) {
            vector.addElement(new fl_0("Đánh " + (String)go_0.var_ef_if.soLuong, new H(go_0.var_ef_if.var_short_goto)));
        }
        vector.addElement(new fl_0("Đánh tất cả", new H(-1)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public final void cfr_renamed_9() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Auto Fish", 8, this));
        vector.addElement(new fl_0("Auto Farm", 26, this));
        vector.addElement(new fl_0("Auto xếp KC", 61, this));
        vector.addElement(new fl_0("Auto tìm NPC", 20, this));
        vector.addElement(new fl_0("Auto dùng VP", 57, this));
        vector.addElement(new fl_0("Auto A-V", 50, this));
        vector.addElement(new fl_0("Auto bán đá", 29, this));
        vector.addElement(new fl_0("Auto TX", 5, this));
        if ((GameCanvas.var_en_do == this)) {
            vector.addElement(new fl_0("Auto Hôn", 67, this));
            vector.addElement(new fl_0("Auto Đánh", 68, this));
        }
        vector.addElement(new fl_0("Auto Click", 107, this));
        vector.addElement(new fl_0("Auto cho ăn xin", 69, this));
        vector.addElement(new fl_0("Treo nick vs farm", 64, this));
        vector.addElement(new fl_0("Farm giúp bạn bè", 108, this));
        if (go_0.boolean_int(AngelChip.duLieuNguoiChoi.cfr_renamed_23, -1)) {
            String string;
            StringBuffer stringBuffer = new StringBuffer().append("Farm giúp ");
            if (go_0.boolean_if((int)AngelChip.duLieuNguoiChoi.var_byte_do, 1)) {
                string = "vợ";
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                string = "chồng";
            }
            vector.addElement(new fl_0(stringBuffer.append(string).toString(), 106, this));
        }
        vector.addElement(new fl_0("Auto Ai Cập", 114, this));
        vector.addElement(new fl_0("Hô phong hoán vũ", 115, this));
        vector.addElement(new fl_0("Biến hình Kirby", 117, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void void_do(int n) {
        if (go_0.cfr_renamed_0((Object)var_ef_if)) {
            cX cX2 = (cX)aa_0.am_do((short)n);
            GameCanvas.cfr_renamed_1((int)cX2.var_byte_arr_do[0], (int)cX2.var_byte_arr_do[1], new dh_0(cX2), new dk(cX2), null);
        }
    }

    public final void cfr_renamed_14() {
        block11: {
            block10: {
                if (!go_0.boolean_do((int)AngelChip.duLieuNguoiChoi.var_byte_do)) break block10;
                if (go_0.boolean_do(n_0.dangChayAuto ? 1 : 0)) {
                    ej_0.cfr_renamed_1().cfr_renamed_4();
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                break block11;
            }
            if ((GameCanvas.var_en_do != ep.var_ep_do) && (GameCanvas.var_en_do != gA.var_gA_do)) {
                GameCanvas.var_int_byte = 0;
            }
            if (go_0.boolean_do(this.var_boolean_try ? 1 : 0)) {
                ft_0.ft_0_do().cfr_renamed_12(9);
                ft_0.ft_0_do().cfr_renamed_4(0);
                return;
            }
            int n = 16 * dF.cfr_renamed_12;
            fh.var_int_else = -1;
            e.void_do(MenuChinhAvatar.bo);
            cu_0 cu_02 = cu_0.cfr_renamed_1("ct", n, n);
            e.cfr_renamed_1();
            Vector<c_0> vector = new Vector<c_0>();
            byte[] byArray = new byte[884];
            int n2 = 0;
            InputStream inputStream = hg.java_io_InputStream_do(MenuChinhAvatar.java_lang_String_for() + "/citiMap");
            try {
                int n3 = 0;
                while (go_0.boolean_try(n3, 26)) {
                    int n4 = 0;
                    while (go_0.boolean_try(n4, 34)) {
                        byArray[n3 * 34 + n4] = (byte)inputStream.read();
                        if (go_0.boolean_if((int)byArray[n3 * 34 + n4], 69)) {
                            c_0 c_02 = new c_0();
                            new c_0().var_byte_do = (byte)n4;
                            c_02.cfr_renamed_0 = (byte)n3;
                            c_02.var_short_do = (short)(n2 + 819);
                            c_02.chuoiGiaTri = MenuChinhAvatar.var_java_lang_String_arr_short[n2];
                            vector.addElement(c_02);
                            ++n2;
                        }
                        ++n4;
                        return;
                    }
                    ++n3;
                    if (" ".length() >= -" ".length()) continue;
                    return;
                }
                inputStream.close();
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            fh.var_int_char = -1;
            gO.coTrangThai = 1;
            gO.cfr_renamed_1().cfr_renamed_1(cu_02, byArray, vector, 16 * dF.cfr_renamed_12, new fl_0(MenuChinhAvatar.cT, new ce_0()));
            gO.cfr_renamed_1().var_de_if = new cb_0();
            gO.cfr_renamed_1().soLuong = 3;
            gO.cfr_renamed_1().cfr_renamed_4();
            GameCanvas.cfr_renamed_7();
            if ((gO.var_de_do != null) && go_0.boolean_do((int)gO.var_byte_do) && go_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0)) {
                gO.var_de_do.void_do();
                gO.var_byte_do = (byte)1;
            }
        }
    }

    private static void cfr_renamed_38() {
        mangSoNguyen = new int[108];
        0 = (0x1A ^ 0x5D ^ " ".length()) & (167 + 12 - 105 + 131 ^ 22 + 36 - 55 + 136 ^ -" ".length());
        15 = 0x97 ^ 0x90 ^ (0x95 ^ 0x9D);
        1 = " ".length();
        2 = "  ".length();
        43 = 0x57 ^ 0x7C;
        16 = 119 + 187 - 106 + 13 ^ 172 + 80 - 212 + 157;
        19 = 77 + 20 - 69 + 106 ^ 130 + 57 - 108 + 70;
        44 = 0xB0 ^ 0x9C;
        46 = 0x9B ^ 0xB5;
        9 = 3 + 176 - 1 + 7 ^ 164 + 120 - 164 + 56;
        18 = 5 ^ 0x17;
        21 = 0x73 ^ 0x66;
        23 = 0x21 ^ 0xA ^ (0x8F ^ 0xB3);
        38 = 205 + 111 - 265 + 175 ^ 109 + 140 - 155 + 102;
        40 = 0x12 ^ 0x3A;
        33 = 0x38 ^ 0x19;
        -1 = -" ".length();
        45 = 0x3E ^ 0x13;
        51 = 0x2F ^ 0x1C;
        52 = 57 + 23 - -41 + 13 ^ 63 + 6 - -79 + 30;
        53 = 0x41 ^ 0x74;
        58 = 15 + 127 - 4 + 10 ^ 161 + 2 - 15 + 26;
        59 = 0x5B ^ 0x60;
        60 = 0xC8 ^ 0xA2 ^ (5 ^ 0x53);
        62 = 0x37 ^ 9;
        63 = 0x39 ^ 6;
        118 = 0x71 ^ 0x30 ^ (0x7E ^ 0x49);
        119 = 0xFA ^ 0x8D;
        120 = 0x7E ^ 0x52 ^ (0x32 ^ 0x66);
        112 = 0x55 ^ 0xB ^ (0x90 ^ 0xBE);
        113 = 0xE9 ^ 0xAF ^ (0xA3 ^ 0x94);
        109 = 0x42 ^ 0x2F;
        110 = 0x1A ^ 8 ^ (0xEC ^ 0x90);
        2000000000 = 0xFFFFFF80 & 0x7735947F;
        4 = 0xBA ^ 0xBE;
        56 = 0x1B ^ 0x23;
        111 = 0x4B ^ 0x4C ^ (0xD ^ 0x65);
        99 = 0xFD ^ 0x9E;
        34 = 0xBF ^ 0x9A ^ (0x56 ^ 0x51);
        35 = 0x65 ^ 0x35 ^ (0x29 ^ 0x5A);
        13 = 8 + 38 - -18 + 125 ^ 69 + 124 - 74 + 57;
        6 = 26 + 16 - 18 + 113 ^ 73 + 57 - 51 + 64;
        24 = 0xBF ^ 0xA7;
        7 = 0x43 ^ 0x44;
        116 = 0xFE ^ 0x8A;
        42 = 0xA4 ^ 0x8E;
        47 = 100 + 95 - 140 + 116 ^ 52 + 115 - 97 + 62;
        25 = 0xBE ^ 0xA7;
        41 = 0x48 ^ 0x33 ^ (0x3C ^ 0x6E);
        65 = 0xC8 ^ 0x89;
        66 = 187 + 147 - 195 + 58 ^ 86 + 37 - -10 + 2;
        8 = 0x13 ^ 0x3B ^ (0x30 ^ 0x10);
        26 = 62 + 3 - -30 + 60 ^ 84 + 120 - 190 + 115;
        61 = 0x2B ^ 0x47 ^ (0x7D ^ 0x2C);
        20 = 0x49 ^ 0x38 ^ (0x16 ^ 0x73);
        57 = 0x71 ^ 0x14 ^ (0xC6 ^ 0x9A);
        50 = 0x95 ^ 0xA7;
        29 = 0x1B ^ 6;
        5 = 127 + 114 - 182 + 126 ^ 52 + 89 - 76 + 123;
        67 = 0xC5 ^ 0x86;
        68 = 0x45 ^ 1;
        107 = 0xEF ^ 0xB2 ^ (0x27 ^ 0x11);
        69 = 6 ^ 0x12 ^ (0x6B ^ 0x3A);
        64 = 0xCE ^ 0x8E;
        108 = 0xB7 ^ 0xAA ^ (0x19 ^ 0x68);
        106 = " ".length() ^ (0x7E ^ 0x15);
        114 = 0x45 ^ 0x37;
        115 = 0x5E ^ 0x2D;
        117 = 0x10 ^ 0x65;
        1000 = -(0xFFFFF973 & 0x1E8D) & (0xFFFFBBED & 0x5FFA);
        15000 = 0xFFFFBEF9 & 0x7B9E;
        100 = 0xD8 ^ 0xBC;
        11 = 0x66 ^ 0x1E ^ (0x55 ^ 0x26);
        10 = 0x79 ^ 0x73;
        36 = 0x44 ^ 0x60;
        28 = 0xC ^ 0x10;
        30 = 9 + 26 - -54 + 69 ^ 60 + 10 - -9 + 49;
        31 = 0x8D ^ 0x92;
        32 = 0x6B ^ 0x28 ^ (0x6E ^ 0xD);
        3 = "   ".length();
        12 = 0xBF ^ 0xB3;
        14 = 0x8D ^ 0x83;
        17 = 0x2E ^ 0x3F;
        27 = 0x14 ^ 0xF;
        55 = 0x96 ^ 0xA1;
        -100 = -(0xE9 ^ 0x8D);
        150 = 102 + 52 - 50 + 23 + (0xE ^ 0x31) - (0x5F ^ 0x16) + (5 ^ 0x24);
        -5 = -(0x2E ^ 0x2B);
        200 = 146 + 59 - 85 + 80;
        101 = 20 + 104 - 20 + 116 ^ 114 + 99 - 208 + 180;
        102 = 0x7A ^ 0x1C;
        22 = 0x85 ^ 0x9A ^ (0x9E ^ 0x97);
        -3 = -"   ".length();
        -2 = -"  ".length();
        47084 = -" ".length() & (0xFFFFF7EF & 0xBFFC);
        8575990 = -(0xFFFFA78D & 0x7C73) & (0xFFFFFFF6 & 0x82FFFF);
        13379 = 0xFFFFFF57 & 0x34EB;
        70 = 0x7B ^ 0x3D;
        884 = 0xFFFFF3FD & 0xF76;
        819 = 0xFFFF8FF7 & 0x733B;
        104 = 0xE7 ^ 0x8F;
        105 = 19 + 175 - 128 + 162 ^ 43 + 27 - -53 + 18;
        2475 = 0xFFFFCDFF & 0x3BAB;
        2476 = 0xFFFFB9BD & 0x4FEE;
        300 = 0xFFFFC9AE & 0x377D;
        302 = 0xFFFFD12F & 0x2FFE;
        2477 = 0xFFFFCBBD & 0x3DEF;
        2478 = -(0xFFFFCF97 & 0x3669) & (0xFFFFAFEE & 0x5FBF);
    }

    private static void cfr_renamed_4(DuLieuNguoiChoi ef2) {
        cX cX2 = aa_0.cX_do(ef2.var_java_util_Vector_if, 50);
        if (go_0.cfr_renamed_0((Object)cX2)) {
            ef2.var_byte_do = cX2.cfr_renamed_3;
        }
    }

    private static boolean boolean_for(int n) {
        return n <= 0;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void void_do(by by2) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(go_0.fl_0_do(by2));
        fo.fo_do().coKichHoat = 1;
        String[] stringArray = new String[1];
        stringArray[0] = MenuChinhAvatar.M;
        fo.fo_do().cfr_renamed_1(stringArray, new Vector[1], vector);
        if ((GameCanvas.var_en_do != fo.fo_do())) {
            fo.fo_do().cfr_renamed_4();
        }
    }

    public final void (int[] object == null) {
        int n;
        if (go_0.boolean_if(TienIchGame.cfr_renamed_5 ? 1 : 0)) {
            TienIchGame.mangSoNguyen = object;
            TienIchGame.cfr_renamed_15();
            return;
        }
        int[] nArray = object;
        object = dZ.cfr_renamed_1();
        dZ.cfr_renamed_1().mangSoNguyen = nArray;
        int n2 = GameCanvas.cfr_renamed_15 - (object.cfr_renamed_2 * object.soLuong + 10) / 2 + 4;
        int n3 = GameCanvas.var_int_char - object.cfr_renamed_2 * object.var_int_if / 2;
        int n4 = object.cfr_renamed_2;
        int n5 = object.cfr_renamed_2;
        int n6 = object.soLuong * object.cfr_renamed_2;
        int n7 = object.mangSoNguyen.length / object.soLuong * object.cfr_renamed_2;
        int n8 = object.cfr_renamed_2 * object.soLuong;
        int n9 = object.cfr_renamed_2 * object.var_int_if;
        if (go_0.boolean_do(GameCanvas.cfr_renamed_12)) {
            n = 30;
            if ((0xAA ^ 0x83 ^ (0x84 ^ 0xA9)) <= 0) {
                return;
            }
        } else {
            n = 0;
        }
        GameCanvas.var_cg_0_do.cfr_renamed_1(n2, n3, n4, n5, n6, n7, n8, n9 - n, nArray.length);
        dZ.cfr_renamed_1().void_do(this);
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    private void cfr_renamed_34() {
        String string;
        String string2;
        Vector<fl_0> vector = new Vector<fl_0>();
        if ((AutoController.nhiemVuHienTai != null)) {
            vector.addElement(new fl_0("Tắt Auto", 4, this));
            if ("  ".length() > "  ".length()) {
                return;
            }
        } else {
            if (go_0.boolean_if((int)TienIchGame.var_byte_do, 1) && go_0.boolean_if(fh.var_int_char, 56)) {
                vector.addElement(new fl_0("Đánh Boss", 111, this));
            }
            vector.addElement(new fl_0("Menu Auto", 99, this));
        }
        vector.addElement(new fl_0("Cài đặt up thuê", 34, this));
        if (go_0.boolean_if(TienIchGame.cfr_renamed_7 ? 1 : 0)) {
            string2 = "Hiện thông tin";
            if ("   ".length() <= -" ".length()) {
                return;
            }
        } else {
            string2 = "Tắt thông tin";
        }
        vector.addElement(new fl_0(string2, 35, this));
        if (go_0.boolean_if(fh.var_int_char, 13)) {
            vector.addElement(new fl_0("Bán hết cá", 6, this));
        }
        if ((AutoController.nhiemVuHienTai == null)) {
            vector.addElement(new fl_0("Chuyển map", 24, this));
        }
        vector.addElement(new fl_0("Bỏ vật phẩm", 7, this));
        StringBuffer stringBuffer = new StringBuffer().append("Giữ kết nối (");
        if (go_0.boolean_if(this.coKichHoat ? 1 : 0)) {
            string = "ON";
            if (" ".length() <= 0) {
                return;
            }
        } else {
            string = "OFF";
        }
        vector.addElement(new fl_0(stringBuffer.append(string).append(")").toString(), 116, this));
        vector.addElement(new fl_0("Danh sách NPC", 42, this));
        vector.addElement(new fl_0("Kiểu gõ TV", 47, this));
        if (go_0.boolean_int(fh.var_int_char, 25) && (var_java_util_Vector_int != null) && go_0.boolean_try(var_java_util_Vector_int.size())) {
            int n = 0;
            while (go_0.boolean_try(n, var_java_util_Vector_int.size())) {
                fx fx2 = (fx)var_java_util_Vector_int.elementAt(n);
                vector.addElement(new fl_0(fx2.chuoiGiaTri, 2, n));
                ++n;
                if ("  ".length() > 0) continue;
                return;
            }
        }
        vector.addElement(new fl_0("Đăng xuất", 41, this));
        if ((AutoController.nhiemVuHienTai == null)) {
            vector.addElement(this.var_fl_0_byte);
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public final void (Graphics graphics == null) {
        this.cfr_renamed_0(graphics);
        if (!(GameCanvas.var_fv_do != null) || go_0.boolean_do(fv.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_1(graphics);
        }
    }

    private void cfr_renamed_36() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 112, this));
        vector.addElement(new fl_0("Cài đặt", 113, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void (DuLieuNguoiChoi object != String object2) {
        object = new fp_0(MenuChinhAvatar.g, -2, new fl_0(MenuChinhAvatar.I, new cV((DuLieuNguoiChoi)object)), new fl_0(MenuChinhAvatar.cI, new gE((DuLieuNguoiChoi)object)), 0);
        ((fp_0)object).cfr_renamed_1((String)object2);
        object2 = ep.cfr_renamed_1();
        ((fp_0)object).dangChayAuto = 1;
        ((ep)object2).cfr_renamed_0((fp_0)object);
        if ((GameCanvas.var_en_do != ep.cfr_renamed_1())) {
            en.cfr_renamed_30 += 1;
        }
    }

    public final void void_for(int n) {
        if (go_0.boolean_new(n, 16) && go_0.boolean_do(n, 19)) {
            new dT((byte)(n - 15)).cfr_renamed_1();
            return;
        }
        if (go_0.boolean_new(n, 44) && go_0.boolean_do(n, 46)) {
            ab.void_do(n - 44);
            return;
        }
        switch (n) {
            case 0: {
                this.cfr_renamed_34();
                return;
            }
            case 1: {
                if (!go_0.boolean_do(coTrangThai ? 1 : 0)) break;
                ff_0.cfr_renamed_1();
                ff_0.cfr_renamed_5();
                return;
            }
            case 2: {
                this.cfr_renamed_15();
                return;
            }
            case 3: {
                go_0.cfr_renamed_27();
                return;
            }
            case 4: {
                AutoController.tatAuto();
                TienIchGame.void_if("Tắt auto");
                return;
            }
            case 5: {
                this.cfr_renamed_2();
                return;
            }
            case 6: {
                ft_0.ft_0_do().cfr_renamed_1(9, 0, 1);
                return;
            }
            case 7: {
                go_0 go_02 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Bỏ hết mồi câu", 16, go_02));
                vector.addElement(new fl_0("Bỏ hết KCX", 18, go_02));
                vector.addElement(new fl_0("Bỏ hết NHB", 19, go_02));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 8: {
                this.cfr_renamed_25();
                return;
            }
            case 9: {
                FormCaiDatCauCa ay2 = new FormCaiDatCauCa();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)ay2);
                return;
            }
            case 10: {
                AutoCauCa.bs_0_do().cfr_renamed_4();
                AutoController.cfr_renamed_1(AutoCauCa.bs_0_do());
                TienIchGame.void_if("Bật auto câu cá");
                return;
            }
            case 13: {
                AutoController.cfr_renamed_1(new da_0());
                TienIchGame.void_if("Bật auto tài xỉu");
                return;
            }
            case 15: {
                gG gG2 = new gG();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)gG2);
                return;
            }
            case 20: {
                go_0 go_03 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Bật Auto", 21, go_03));
                vector.addElement(new fl_0("Cài đặt", 23, go_03));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 21: {
                AutoController.cfr_renamed_1(new N());
                return;
            }
            case 23: {
                gf_0 gf_02 = new gf_0();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)gf_02);
                return;
            }
            case 24: {
                go_0.cfr_renamed_32();
                return;
            }
            case 26: {
                this.cfr_renamed_30();
                return;
            }
            case 28: {
                FormCaiDatFarm cn2 = new FormCaiDatFarm();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)cn2);
                return;
            }
            case 29: {
                go_0 go_04 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Bật Auto", 38, go_04));
                vector.addElement(new fl_0("Cài đặt", 40, go_04));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 30: {
                GameCanvas.var_ca_do.cfr_renamed_1("Cài số xu cần up cho id (" + (String)AngelChip.duLieuNguoiChoi.soLuong + "):", new el_0(1), 1);
                if (!go_0.boolean_try(TienIchGame.var_int_int)) break;
                GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(TienIchGame.var_int_int));
                return;
            }
            case 31: {
                GameCanvas.var_ca_do.cfr_renamed_1("Cài số ngày cần up cho id (" + (String)AngelChip.duLieuNguoiChoi.soLuong + "):", new el_0(2), 1);
                if (!go_0.boolean_try((TienIchGame.var_long_for == 0L))) break;
                GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(TienIchGame.var_long_for));
                return;
            }
            case 32: {
                GameCanvas.cfr_renamed_1("Bạn có chắc muốn reset cài đặt cho id (" + (String)AngelChip.duLieuNguoiChoi.soLuong + ") không?", new fl_0("OK", 33, this), new fl_0("Không", -1));
                return;
            }
            case 33: {
                QuanLyRMS.cfr_renamed_2();
                QuanLyRMS.cfr_renamed_5();
                TienIchGame.aq_0_do().cfr_renamed_5();
                return;
            }
            case 34: {
                this.cfr_renamed_28();
                return;
            }
            case 35: {
                int n2;
                if (go_0.boolean_do(TienIchGame.cfr_renamed_7 ? 1 : 0)) {
                    n2 = 1;
                    if (-(0xC2 ^ 0xC6) >= 0) {
                        return;
                    }
                } else {
                    n2 = 0;
                }
                TienIchGame.cfr_renamed_7 = n2;
                return;
            }
            case 36: {
                if (go_0.boolean_do((int)AutoFarm.var_byte_do)) {
                    AutoController.cfr_renamed_1(new hn());
                    return;
                }
                AutoController.cfr_renamed_1(new AutoFarm());
                return;
            }
            case 38: {
                AutoController.cfr_renamed_1(new c());
                return;
            }
            case 40: {
                aw aw2 = new aw();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)aw2);
                return;
            }
            case 41: {
                TienIchGame.dangXuatTaiKhoan();
                return;
            }
            case 42: {
                gg_0.cfr_renamed_2();
                return;
            }
            case 43: {
                GameCanvas.cfr_renamed_8();
                cR.soXu = 0L;
                cR.chuoiGiaTri = br_0.java_lang_String_do(0);
                new cR(20L, 1).void_do();
                return;
            }
            case 47: {
                String string;
                String string2;
                String string3;
                go_0 go_05 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                StringBuffer stringBuffer = new StringBuffer().append("Telex");
                if (go_0.boolean_if(ab.soLuong, 1)) {
                    string3 = " (ON)";
                    } else {
                    string3 = "";
                }
                vector.addElement(new fl_0(stringBuffer.append(string3).toString(), 45, go_05));
                StringBuffer stringBuffer2 = new StringBuffer().append("VNI");
                if (go_0.boolean_if(ab.soLuong, 2)) {
                    string2 = " (ON)";
                    if (((0x4F ^ 0x1F) & ~(0x45 ^ 0x15) & ~((0x3D ^ 0xB) & ~(0x75 ^ 0x43))) != 0) {
                        return;
                    }
                } else {
                    string2 = "";
                }
                vector.addElement(new fl_0(stringBuffer2.append(string2).toString(), 46, go_05));
                StringBuffer stringBuffer3 = new StringBuffer().append("Mặc định");
                if (go_0.boolean_do(ab.soLuong)) {
                    string = " (ON)";
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    string = "";
                }
                vector.addElement(new fl_0(stringBuffer3.append(string).toString(), 44, go_05));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
                return;
            }
            case 50: {
                go_0 go_06 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Tiếng Anh", 51, go_06));
                vector.addElement(new fl_0("Tiếng Việt", 52, go_06));
                vector.addElement(new fl_0("Reset dữ liệu", 53, go_06));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 51: {
                AutoController.cfr_renamed_1(new af_0(0));
                return;
            }
            case 52: {
                AutoController.cfr_renamed_1(new af_0(1));
                return;
            }
            case 53: {
                if (go_0.boolean_do(af_0.var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                    af_0.var_java_util_Vector_if.removeAllElements();
                }
                if (go_0.boolean_do(af_0.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    af_0.var_java_util_Vector_do.removeAllElements();
                }
                if (go_0.boolean_do(af_0.var_java_util_Hashtable_do.isEmpty() ? 1 : 0)) {
                    af_0.var_java_util_Hashtable_do.clear();
                }
                GameCanvas.hienThongBaoPopup("Đã reset dữ liệu!");
                return;
            }
            case 57: {
                go_0 go_07 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Bật auto", 58, go_07));
                vector.addElement(new fl_0("D.s tự dùng", 59, go_07));
                vector.addElement(new fl_0("D.s tự bỏ", 60, go_07));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 58: {
                AutoController.cfr_renamed_1(new dy_0());
                return;
            }
            case 59: {
                new aI().cfr_renamed_1();
                return;
            }
            case 60: {
                new hc().cfr_renamed_1();
                return;
            }
            case 61: {
                go_0 go_08 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0("Bật Auto", 62, go_08));
                vector.addElement(new fl_0("Cài đặt", 63, go_08));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 62: {
                aj.aj_do().cfr_renamed_4();
                AutoController.cfr_renamed_1(aj.aj_do());
                return;
            }
            case 63: {
                fe_0 fe_02 = new fe_0();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)fe_02);
                return;
            }
            case 64: {
                this.cfr_renamed_35();
                return;
            }
            case 65: {
                ex_0.ex_0_do().cfr_renamed_3();
                return;
            }
            case 66: {
                ar ar2 = new ar();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)ar2);
                return;
            }
            case 67: {
                go_0.cfr_renamed_41();
                return;
            }
            case 68: {
                go_0.cfr_renamed_39();
                return;
            }
            case 69: {
                GameCanvas.var_ca_do.cfr_renamed_1("Nhập số lần (để trống: KGH)", new R(), 1);
                return;
            }
            case 99: {
                this.cfr_renamed_9();
                return;
            }
            case 106: {
                if (go_0.boolean_int(AngelChip.duLieuNguoiChoi.cfr_renamed_23, -1)) {
                    GameCanvas.var_ca_do.cfr_renamed_1("Nhập số lần (để trống: KGH)", new av(), 1);
                    GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(gh_0.cfr_renamed_1));
                    return;
                }
                GameCanvas.hienThongBaoPopup("Bạn chưa kết hôn!");
                return;
            }
            case 107: {
                go_0.cfr_renamed_33();
                return;
            }
            case 108: {
                this.cfr_renamed_37();
                return;
            }
            case 109: {
                GameCanvas.var_ca_do.cfr_renamed_1("Nhập số lần (để trống: KGH)", new cC(), 1);
                return;
            }
            case 110: {
                ap ap2 = new ap();
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)ap2);
                return;
            }
            case 111: {
                new bi_0().cfr_renamed_1();
                return;
            }
            case 112: {
                AutoController.cfr_renamed_1(new at());
                return;
            }
            case 113: {
                new X().cfr_renamed_1();
                return;
            }
            case 114: {
                this.cfr_renamed_36();
                return;
            }
            case 115: {
                GameCanvas.var_ca_do.cfr_renamed_1("Số lượng bột mỗi lần đi tạo thuốc?", new gS(), 1);
                GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(cl_0.soLuong));
                return;
            }
            case 116: {
                int n3;
                if (go_0.boolean_do(this.coKichHoat ? 1 : 0)) {
                    n3 = 1;
                    } else {
                    n3 = 0;
                }
                this.coKichHoat = n3;
                return;
            }
            case 117: {
                this.cfr_renamed_13();
                return;
            }
            case 118: {
                new cc_0().cfr_renamed_1();
                return;
            }
            case 119: {
                go_0.cfr_renamed_40();
                return;
            }
            case 120: {
                GameCanvas.var_ca_do.cfr_renamed_1("Quãng nghỉ (ms):", new ba_0(), 1);
                GameCanvas.var_ca_do.cfr_renamed_1(String.valueOf(al.soXu));
            }
        }
    }

    protected static void this() {
        if (go_0.cfr_renamed_0((Object)var_ef_if)) {
            fn.fn_do().cfr_renamed_2(0, go_0.var_ef_if.var_short_goto);
        }
    }

    public static void (DuLieuNguoiChoi ef2 != null) {
        if (go_0.cfr_renamed_0((Object)ef2)) {
            fn.fn_do().cfr_renamed_4(ef2.var_short_goto);
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bZ + " " + (String)ef2.soLuong + "  " + MenuChinhAvatar.I);
        }
    }

        public static void (int n != short s2) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            if (go_0.boolean_if((int)aa_0.am_do((short)s2).var_byte_if, -1)) {
                if (go_0.boolean_if((int)ef2.var_short_if, (int)s2)) {
                    dH dH2 = fh.dH_do(ef2.var_short_goto);
                    if ((dH2 != null)) {
                        fh.var_java_util_Vector_case.removeElement(dH2);
                        ef2.var_short_if = (short)-1;
                    }
                    if (-(0xE9 ^ 0xA3 ^ (0x2D ^ 0x63)) >= 0) {
                        return;
                    }
                } else {
                    ef2.cfr_renamed_1(s2);
                    ep_0.ep_0_do().cfr_renamed_3(ef2.var_short_goto);
                    if (((82 + 100 - 117 + 82 ^ 61 + 71 - 15 + 14) & (0xB3 ^ 0xC4 ^ (0x4A ^ 0x2D) ^ -" ".length())) != 0) {
                        return;
                    }
                }
            } else {
                cg cg2 = aa_0.cg_do(ef2.var_java_util_Vector_if, (int)s2);
                if ((cg2 != null)) {
                    ef2.var_java_util_Vector_if.removeElement(cg2);
                    } else {
                    ef2.cfr_renamed_1(new cg(s2));
                    ef2.void_if();
                }
            }
            if (go_0.boolean_if(n, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                if ((GameCanvas.var_en_do == fo.fo_do())) {
                    fo.fo_do().void_if();
                }
                AngelChip.var_java_util_Vector_do = null;
                GameCanvas.cfr_renamed_7();
            }
            var_boolean_case = 0;
        }
    }

    protected static void cfr_renamed_12() {
        ep.cfr_renamed_1().void_do(GameCanvas.var_en_do);
    }

    public static void (int n == short s2) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            ef2.var_short_break = s2;
        }
    }

    public go_0() {
        this.cfr_renamed_13 = (byte)-1;
        this.var_java_util_Vector_try = new Vector();
        this.var_int_byte = 60;
        this.var_boolean_try = 1;
        this.coKichHoat = 0;
        this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
        this.b_();
    }

    public final void void_int(int n, int n2) {
        Object object;
        int n3;
        Object object2;
        if ((GameCanvas.var_en_do == fo.var_fo_do)) {
            fo.fo_do().void_if();
        }
        GameCanvas.var_int_byte = 1;
        soLuong = n;
        var_int_if = n2;
        coTrangThai = 1;
        this.cfr_renamed_9 = (byte)0;
        int n4 = 0;
        while (go_0.boolean_try(n4, var_java_util_Vector_for.size() - 1)) {
            object2 = (fs)var_java_util_Vector_for.elementAt(n4);
            n3 = n4 + 1;
            while (go_0.boolean_try(n3, var_java_util_Vector_for.size())) {
                object = (fs)var_java_util_Vector_for.elementAt(n3);
                if (go_0.boolean_for(((fs)object2).var_short_if, ((fs)object).var_short_if)) {
                    var_java_util_Vector_for.setElementAt(object, n4);
                    var_java_util_Vector_for.setElementAt(object2, n3);
                    object2 = object;
                }
                ++n3;
                if (" ".length() <= "   ".length()) continue;
                return;
            }
            ++n4;
            if (((24 + 18 - 25 + 142 ^ 44 + 185 - 181 + 149) & (0x53 ^ 0x1D ^ (0x8C ^ 0x98) ^ -" ".length())) == ((0x2A ^ 0x3F ^ (0xB8 ^ 0x9F)) & (0x22 ^ 0x6E ^ (0x70 ^ 0xE) ^ -" ".length()))) continue;
            return;
        }
        n4 = 0;
        while (go_0.boolean_try(n4, fh.var_java_util_Vector_case.size() - 1)) {
            object2 = (bm)fh.var_java_util_Vector_case.elementAt(n4);
            if (go_0.boolean_do((int)((bm)object2).var_byte_if)) {
                n3 = n4 + 1;
                while (go_0.boolean_try(n3, fh.var_java_util_Vector_case.size())) {
                    object = (bm)fh.var_java_util_Vector_case.elementAt(n3);
                    if (go_0.boolean_do((int)((bm)object).var_byte_if) && go_0.boolean_for(((DuLieuNguoiChoi)object2).var_short_goto, ((DuLieuNguoiChoi)object).var_short_goto)) {
                        fh.var_java_util_Vector_case.setElementAt(object, n4);
                        fh.var_java_util_Vector_case.setElementAt(object2, n3);
                        object2 = object;
                    }
                    ++n3;
                    if (-(77 + 60 - -10 + 11 ^ 43 + 108 - 107 + 110) < 0) continue;
                    return;
                }
            }
            ++n4;
            if ("   ".length() >= ((0x40 ^ 0x53) & ~(0x8E ^ 0x9D))) continue;
            return;
        }
        n4 = 0;
        while (go_0.boolean_try(n4, fh.var_java_util_Vector_case.size())) {
            object2 = (bm)fh.var_java_util_Vector_case.elementAt(n4);
            if (go_0.boolean_do((int)((bm)object2).var_byte_if)) {
                object = (DuLieuNguoiChoi)object2;
                ((DuLieuNguoiChoi)object).var_java_util_Vector_for.removeAllElements();
                if (go_0.boolean_if((int)((DuLieuNguoiChoi)object).var_short_goto, n2)) {
                    int n5 = 0;
                    ((DuLieuNguoiChoi)object).var_short_char = (short)n5;
                    ((DuLieuNguoiChoi)object).var_short_for = (short)n5;
                    ((DuLieuNguoiChoi)object).var_short_try = (short)(8 * fh.var_int_int + fh.var_int_int / 2 - fh.var_int_int / 2);
                    ((DuLieuNguoiChoi)object).var_boolean_int = ((DuLieuNguoiChoi)object).var_boolean_int;
                    ((DuLieuNguoiChoi)object).cfr_renamed_7 = (short)2;
                    this.cfr_renamed_9 = (byte)1;
                    ((DuLieuNguoiChoi)object).void_for(2475, 20);
                    ((DuLieuNguoiChoi)object).void_for(2476, 10);
                    ((DuLieuNguoiChoi)object).void_for(300, 60);
                    ((DuLieuNguoiChoi)object).void_for(302, 70);
                    ((DuLieuNguoiChoi)object).void_if();
                    if ("  ".length() <= ((0x79 ^ 0x67) & ~(0xBD ^ 0xA3))) {
                        return;
                    }
                } else if (go_0.boolean_if((int)((DuLieuNguoiChoi)object).var_short_goto, n)) {
                    int n6 = 0;
                    ((DuLieuNguoiChoi)object).var_short_char = (short)n6;
                    ((DuLieuNguoiChoi)object).var_short_for = (short)n6;
                    ((DuLieuNguoiChoi)object).var_short_try = (short)(8 * fh.var_int_int + fh.var_int_int / 2 + fh.var_int_int / 2);
                    ((DuLieuNguoiChoi)object).var_boolean_int = ((DuLieuNguoiChoi)object).var_boolean_int;
                    ((DuLieuNguoiChoi)object).cfr_renamed_7 = (short)2;
                    this.cfr_renamed_9 = (byte)1;
                    ((DuLieuNguoiChoi)object).void_for(2477, 20);
                    ((DuLieuNguoiChoi)object).void_for(2478, 10);
                    ((DuLieuNguoiChoi)object).void_if();
                }
            }
            ++n4;
            if (-(0x62 ^ 0x67) < 0) continue;
            return;
        }
        object = fh.ef_do(n);
        DuLieuNguoiChoi ef2 = fh.ef_do(n2);
        fh.var_java_util_Vector_case.removeElement(object);
        fh.var_java_util_Vector_case.removeElement(ef2);
        n3 = 0;
        n2 = 0;
        while (go_0.boolean_try(n2, fh.var_java_util_Vector_case.size())) {
            bm bm2 = (bm)fh.var_java_util_Vector_case.elementAt(n2);
            if (go_0.boolean_do((int)bm2.var_byte_if)) {
                bm2 = (DuLieuNguoiChoi)bm2;
                if (go_0.boolean_int(((DuLieuNguoiChoi)bm2).var_short_goto, -100)) {
                    object2 = (fs)var_java_util_Vector_for.elementAt(n3 / 2);
                    GameCanvas.var_int_try = GameCanvas.var_int_else = ((fs)object2).soLuong - fm.fm_do().cfr_renamed_3 + fh.var_int_int / 2;
                    GameCanvas.soLuong = GameCanvas.var_int_long = ((fs)object2).var_int_if - fm.fm_do().cfr_renamed_2 + fh.var_int_int / 2 + n2 % 2 * (fh.var_int_int - 5);
                    ++n3;
                    ((dd_0)bm2).void_do(GameCanvas.var_int_try + fm.fm_do().cfr_renamed_3, GameCanvas.soLuong + fm.fm_do().cfr_renamed_2);
                }
            }
            ++n2;
            if (-" ".length() <= ((114 + 57 - 68 + 26 ^ 184 + 182 - 254 + 79) & (0x6B ^ 0x53 ^ (0xC7 ^ 0xC1) ^ -" ".length()))) continue;
            return;
        }
        fh.var_java_util_Vector_case.addElement(object);
        fh.var_java_util_Vector_case.addElement(ef2);
        fh.cfr_renamed_1(fh.var_java_util_Vector_case);
        GameCanvas.cfr_renamed_7();
    }

    public static void cfr_renamed_2(DuLieuNguoiChoi ef2) {
        duLieuNguoiChoi = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().var_java_util_Vector_if = new Vector();
        go_0.duLieuNguoiChoi.cfr_renamed_4 = 0;
        go_0.duLieuNguoiChoi.var_byte_do = ef2.var_byte_do;
        go_0.duLieuNguoiChoi.var_short_char = ef2.var_short_char;
        int n = 0;
        while (go_0.boolean_try(n, ef2.var_java_util_Vector_if.size())) {
            cg cg2 = new cg();
            new cg().var_short_do = ((cg)ef2.var_java_util_Vector_if.elementAt((int)n)).var_short_do;
            duLieuNguoiChoi.cfr_renamed_0(cg2);
            ++n;
            if ("  ".length() >= "  ".length()) continue;
            return;
        }
    }

    public final void cfr_renamed_15() {
        GameCanvas.cfr_renamed_8();
        var_byte_char = (byte)-1;
        var_byte_int = (byte)-1;
        if (go_0.boolean_if(AngelChip.soLuong, 8)) {
            this.cfr_renamed_14();
            return;
        }
        ft_0.ft_0_do().cfr_renamed_12(8);
    }

    static {
        go_0.cfr_renamed_38();
        var_byte_char = (byte)-1;
        var_byte_int = (byte)-1;
        var_java_util_Vector_new = new Vector();
        soLuongKhoa = -1;
        var_boolean_case = 0;
        var_boolean_byte = 0;
        coTrangThai = 0;
        var_boolean_int = 0;
        var_int_int = -1;
        byte[] byArray = new byte[4];
        byArray[0] = 10;
        byArray[1] = 4;
        byArray[2] = 3;
        byArray[3] = 5;
        var_byte_arr_do = byArray;
        dangChayAuto = 0;
        var_int_new = -1;
        var_int_try = -1;
    }

    public static void (int n == byte by2) {
        if (go_0.boolean_if(n, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
            AngelChip.duLieuNguoiChoi.var_short_float = by2;
            return;
        }
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            ef2.var_short_float = by2;
        }
    }

    public final void cfr_renamed_21() {
        this.cfr_renamed_34();
    }

    public static void cfr_renamed_10() {
        fn.fn_do().cfr_renamed_3(var_byte_for, -1);
        var_byte_char = (byte)-1;
    }

    public final void cfr_renamed_18() {
        if (go_0.boolean_if(this.var_boolean_try ? 1 : 0)) {
            this.var_boolean_try = 1;
            GameCanvas.cfr_renamed_8();
            if (go_0.boolean_if(gO.cfr_renamed_1().soLuong, 2)) {
                ft_0.ft_0_do().cfr_renamed_4(-1);
                return;
            }
            byte[] byArray = new byte[7];
            byArray[0] = 0;
            byArray[1] = 13;
            byArray[2] = 20;
            byArray[3] = 9;
            byArray[4] = 23;
            byArray[5] = 11;
            byArray[6] = 17;
            byte[] byArray2 = byArray;
            fn.fn_do().cfr_renamed_3(byArray2[gO.cfr_renamed_1().soLuong], -1);
        }
    }

    public static void (am am2 == null) {
        duLieuNguoiChoi = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().cfr_renamed_4 = 0;
        go_0.duLieuNguoiChoi.var_java_util_Vector_if = new Vector();
        int n = 0;
        int n2 = 0;
        while (go_0.boolean_try(n2, AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size())) {
            cg cg2 = new cg();
            new cg().var_short_do = ((cg)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt((int)n2)).var_short_do;
            if (go_0.boolean_if((int)aa_0.am_do((short)cg2.var_short_do).var_byte_if, (int)am2.var_byte_if)) {
                cg2.var_short_do = am2.cfr_renamed_3;
                n = 1;
            }
            duLieuNguoiChoi.cfr_renamed_0(cg2);
            ++n2;
            if ("  ".length() > 0) continue;
            return;
        }
        if (go_0.boolean_do(n)) {
            cg cg3 = new cg();
            new cg().var_short_do = am2.cfr_renamed_3;
            duLieuNguoiChoi.cfr_renamed_0(cg3);
            duLieuNguoiChoi.void_if();
        }
    }

    public static void (int n, int n2, int n3, int n4 == null) {
        if ((!go_0.boolean_int(AngelChip.soLuong, 9) || go_0.boolean_if(AngelChip.soLuong, 11)) && go_0.boolean_do(coTrangThai ? 1 : 0)) {
            AngelChip.duLieuNguoiChoi.var_short_char = (short)n;
            AngelChip.duLieuNguoiChoi.var_short_try = (short)n2;
            fn.fn_do().cfr_renamed_1(n, n2, n3, n4);
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_34();
                return;
            }
            case 2: {
                ft_0.ft_0_do().cfr_renamed_4(go_0.var_ef_if.var_short_goto);
                return;
            }
            case 52: {
                if (!(GameCanvas.var_en_do == gO.instance) || !go_0.boolean_if(fh.var_int_char, -1)) break;
                GameCanvas.cfr_renamed_8();
                ft_0.ft_0_do().cfr_renamed_12(8);
            }
        }
    }

    public static void (int n != String string) {
        DuLieuNguoiChoi ef2;
        if (go_0.boolean_int(fh.var_int_char, 24) && go_0.boolean_int(fh.var_int_char, 53) && go_0.cfr_renamed_0((Object)(ef2 = fh.ef_do(n)))) {
            int n2;
            ef2.soLuong = (int)null;
            int n3 = 100;
            if (!go_0.boolean_try(n, 2000000000) || go_0.boolean_if(TienIchGame.boolean_if((String)ef2.soLuong) ? 1 : 0)) {
                n2 = 1;
                if ((0xC0 ^ 0x91 ^ (0xC1 ^ 0x95)) == 0) {
                    return;
                }
            } else {
                n2 = 0;
            }
            ef2.cfr_renamed_1(n3, string, (byte)n2);
            if (go_0.boolean_try(n, 2000000000)) {
                string = (String)ef2.soLuong + ": " + string;
                ep.cfr_renamed_1().var_fp_0_do.cfr_renamed_1(string);
            }
        }
    }

    public final void (Graphics graphics != null) {
        int n;
        GameCanvas.hienThongBaoPopup(graphics);
        GameCanvas.var_fh_do.cfr_renamed_2(graphics);
        if (go_0.boolean_try(var_java_util_Vector_new.size())) {
            n = 0;
            while (go_0.boolean_try(n, var_java_util_Vector_new.size())) {
                ((es_0)var_java_util_Vector_new.elementAt(n)).cfr_renamed_1(graphics);
                ++n;
                if (" ".length() >= " ".length()) continue;
                return;
            }
        }
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        if (go_0.boolean_do(this.var_java_util_Vector_try.isEmpty() ? 1 : 0)) {
            String string = (String)this.var_java_util_Vector_try.elementAt(0);
            n = this.var_int_byte - this.var_int_case;
            if (go_0.boolean_for(n, 10)) {
                n = 10;
            }
            int n2 = GameCanvas.soLuongKhoa;
            int n3 = 0;
            while (go_0.boolean_try(n3, n)) {
                n2 >>= 1;
                ++n3;
                if (" ".length() != (0x1B ^ 0x53 ^ (0x51 ^ 0x1D))) continue;
                return;
            }
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, string, n2 + 3, 2, 0);
        }
        GameCanvas.hienThongBaoPopup(graphics);
        TienIchGame.cfr_renamed_1(graphics);
    }

    public final void cfr_renamed_7() {
        Object object;
        DuLieuNguoiChoi ef2;
        DuLieuNguoiChoi ef3;
        GameCanvas.var_fh_do.cfr_renamed_2();
        if (go_0.boolean_do(GameCanvas.cfr_renamed_12) && (fh.var_bm_do != null)) {
            if (go_0.cfr_renamed_0((Object)var_ef_if) && go_0.boolean_int(fh.var_bm_do.var_byte_if, 5) && go_0.boolean_for(go_0.var_ef_if.var_short_goto, 2000000000)) {
                ((en)this).cfr_renamed_3 = this.var_fl_0_case;
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            } else {
                ((en)this).cfr_renamed_3 = null;
            }
            ((en)this).cfr_renamed_4 = fh.var_fl_0_do;
            if (go_0.boolean_do((int)fh.var_bm_do.var_byte_if)) {
                ((en)this).cfr_renamed_4.chuoiGiaTri = (String)((DuLieuNguoiChoi)fh.var_bm_do).soLuong;
                if (go_0.boolean_for(((en)this).cfr_renamed_4.chuoiGiaTri.length(), 8)) {
                    ((en)this).cfr_renamed_4.chuoiGiaTri = ((en)this).cfr_renamed_4.chuoiGiaTri.substring(0, 8) + "..";
                }
            }
        }
        if ((fh.var_bm_do == null) && go_0.cfr_renamed_0(((en)this).cfr_renamed_4, fh.var_fl_0_do)) {
            ((en)this).cfr_renamed_4 = null;
            ((en)this).cfr_renamed_3 = null;
        }
        if (go_0.boolean_if(coTrangThai ? 1 : 0)) {
            if (go_0.boolean_if((int)this.cfr_renamed_9, 1) && go_0.boolean_if(GameCanvas.var_int_byte, -1)) {
                this.cfr_renamed_9 = (byte)2;
                ef3 = fh.ef_do(-100);
                ef2 = fh.ef_do(soLuong);
                object = fh.ef_do(var_int_if);
                if (go_0.cfr_renamed_0((Object)ef2) && (object != null)) {
                    fm.fm_do().duLieuNguoiChoi = ef3;
                    ef3.cfr_renamed_1(150, MenuChinhAvatar.var_java_lang_String_arr_do[0] + (String)ef2.soLuong + MenuChinhAvatar.var_java_lang_String_arr_do[1] + (String)((DuLieuNguoiChoi)object).soLuong + MenuChinhAvatar.var_java_lang_String_arr_do[2], 1);
                    } else {
                    this.cfr_renamed_19();
                }
            }
            if (go_0.boolean_if((int)this.cfr_renamed_9, 2) && go_0.boolean_if(GameCanvas.var_int_goto % 4, 2) && go_0.cfr_renamed_1((Object)fh.ef_do((int)-100).soLuong)) {
                this.cfr_renamed_9 = (byte)3;
                ef2 = fh.ef_do(soLuong);
                object = fh.ef_do(var_int_if);
                if (go_0.cfr_renamed_0((Object)ef2) && (object != null)) {
                    ((DuLieuNguoiChoi)object).var_short_char = (short)(26 * fh.var_int_int - fh.var_int_int);
                    ((DuLieuNguoiChoi)object).var_int_class = -5;
                    ef2.var_short_char = (short)(26 * fh.var_int_int - (fh.var_int_int << 1));
                    ef2.var_int_class = -5;
                    fm.fm_do().duLieuNguoiChoi = ef2;
                    if (-"  ".length() > 0) {
                        return;
                    }
                } else {
                    this.cfr_renamed_19();
                }
            }
            if (go_0.boolean_if((int)this.cfr_renamed_9, 3)) {
                ef3 = fh.ef_do(soLuong);
                ef2 = fh.ef_do(var_int_if);
                if (go_0.cfr_renamed_0((Object)ef3) && go_0.cfr_renamed_0((Object)ef2) && go_0.boolean_do(ef3.var_int_class) && go_0.boolean_do(ef2.var_int_class)) {
                    this.cfr_renamed_9 = (byte)4;
                    fm.fm_do().duLieuNguoiChoi = object = fh.ef_do(-100);
                    ((dd_0)object).cfr_renamed_1(200, MenuChinhAvatar.var_java_lang_String_arr_final[0] + (String)ef3.soLuong + MenuChinhAvatar.var_java_lang_String_arr_do[1] + (String)ef2.soLuong, 1);
                    ((dd_0)object).cfr_renamed_1(200, MenuChinhAvatar.var_java_lang_String_arr_final[1], 1);
                    ((dd_0)object).cfr_renamed_1(150, MenuChinhAvatar.var_java_lang_String_arr_final[2], 1);
                    ((dd_0)object).cfr_renamed_1(100, MenuChinhAvatar.var_java_lang_String_arr_final[3], 1);
                }
            }
            if (go_0.boolean_if((int)this.cfr_renamed_9, 4)) {
                ef3 = fh.ef_do(soLuong);
                ef2 = fh.ef_do(var_int_if);
                ef3.cfr_renamed_7 = (short)4;
                ef2.cfr_renamed_7 = (short)4;
                object = fh.ef_do(-100);
                if (go_0.cfr_renamed_1((Object)((DuLieuNguoiChoi)object).soLuong) && go_0.boolean_if(((DuLieuNguoiChoi)object).soLuong.isEmpty() ? 1 : 0)) {
                    if (go_0.boolean_if(soLuong, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        fn.fn_do().void_if(var_int_if, 101);
                    }
                    this.cfr_renamed_13 = (byte)0;
                    this.cfr_renamed_9 = (byte)5;
                }
            }
        }
        if (go_0.boolean_if((int)this.cfr_renamed_9, 5) && go_0.boolean_int(this.cfr_renamed_13)) {
            this.cfr_renamed_13 = (byte)(this.cfr_renamed_13 + 1);
            if (go_0.boolean_for(this.cfr_renamed_13, 20)) {
                if (go_0.boolean_if((int)this.cfr_renamed_13, 21)) {
                    object = new ft(2, 0);
                    GameCanvas.var_java_util_Vector_if.addElement(object);
                    fm.fm_do().duLieuNguoiChoi = AngelChip.duLieuNguoiChoi;
                    AngelChip.duLieuNguoiChoi.cfr_renamed_7 = (short)4;
                }
                if (go_0.boolean_int(AngelChip.duLieuNguoiChoi.var_short_goto, soLuong)) {
                    coTrangThai = 0;
                    this.cfr_renamed_13 = (byte)-1;
                }
                if (go_0.boolean_do(AngelChip.duLieuNguoiChoi.var_int_class) && go_0.boolean_if((int)AngelChip.duLieuNguoiChoi.var_short_goto, soLuong)) {
                    coTrangThai = 0;
                    ef3 = fh.ef_do(soLuong);
                    ef2 = fh.ef_do(var_int_if);
                    if (go_0.cfr_renamed_0((Object)ef3) && go_0.cfr_renamed_0((Object)ef2)) {
                        ef3.cfr_renamed_7 = (short)4;
                        ef2.cfr_renamed_7 = (short)4;
                    }
                    this.cfr_renamed_9 = (byte)6;
                    this.cfr_renamed_13 = (byte)-1;
                    fn.fn_do().void_if(var_int_if, 102);
                }
            }
        }
        if (go_0.cfr_renamed_1(((en)this).cfr_renamed_3) && go_0.boolean_do(GameCanvas.cfr_renamed_12) && (GameCanvas.var_fv_do == null)) {
            ((en)this).cfr_renamed_3 = this.var_fl_0_do;
            if ((59 + 126 - 116 + 73 ^ 95 + 33 - 4 + 14) <= "   ".length()) {
                return;
            }
        } else if ((GameCanvas.var_fv_do != null)) {
            ((en)this).cfr_renamed_3 = null;
        }
        if (go_0.boolean_try(var_java_util_Vector_new.size())) {
            int n = 0;
            while (go_0.boolean_try(n, var_java_util_Vector_new.size())) {
                ((es_0)var_java_util_Vector_new.elementAt(n)).cfr_renamed_1();
                ++n;
                if (-(76 + 47 - 121 + 173 ^ 125 + 109 - 106 + 42) < 0) continue;
                return;
            }
        }
        if (go_0.boolean_try(this.var_int_case)) {
            this.var_int_case -= 1;
            if (go_0.boolean_do(this.var_int_case)) {
                if (go_0.boolean_try(this.var_java_util_Vector_try.size())) {
                    this.var_java_util_Vector_try.removeElementAt(0);
                }
                if (go_0.boolean_try(this.var_java_util_Vector_try.size())) {
                    this.var_int_case = this.var_int_byte;
                }
            }
        }
        if (go_0.boolean_if(this.boolean_do() ? 1 : 0) && go_0.boolean_try((System.currentTimeMillis() - this.soXu != this.var_long_if))) {
            this.var_long_if = TienIchGame.int_do(1, 45) * 1000 + 15000;
            AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, 2, 0);
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public static go_0 go_0_do() {
        if ((var_go_0_do == null)) {
            var_go_0_do = new go_0();
        }
        return var_go_0_do;
    }

    public static void void_if(int n) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            ef2.cfr_renamed_13();
            ef2.cfr_renamed_4 = 1;
            es_0 es_02 = u_0.es_0_do(n);
            if ((es_02 != null)) {
                var_java_util_Vector_new.removeElement(es_02);
                }
        }
    }

    public static void void_new(int n) {
        go_0.cfr_renamed_0(aa_0.am_do((short)n));
    }

    public final void cfr_renamed_30() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 36, this));
        vector.addElement(new fl_0("Cài đặt", 28, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void (int n, int n2, String string, String[] stringArray == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n3 = 0;
        while (go_0.boolean_try(n3, stringArray.length)) {
            vector.addElement(new fl_0(stringArray[n3], new gy_0(n, n2, n3)));
            ++n3;
            if (" ".length() != 0) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup(string, vector);
    }

    protected static void cfr_renamed_16() {
        if (go_0.cfr_renamed_0((Object)var_ef_if)) {
            GameCanvas.cfr_renamed_4(MenuChinhAvatar.bZ);
            fn.fn_do().cfr_renamed_5(go_0.var_ef_if.var_short_goto);
        }
    }

    protected final void cfr_renamed_23() {
        DuLieuNguoiChoi ef2 = AngelChip.duLieuNguoiChoi;
        if ((GameCanvas.var_en_do != ff_0.var_ff_0_do)) {
            fo.fo_do().coKichHoat = 1;
            String[] stringArray = new String[2];
            stringArray[0] = MenuChinhAvatar.bh;
            stringArray[1] = MenuChinhAvatar.af;
            Vector[] vectorArray = new Vector[2];
            vectorArray[0] = (AngelChip.var_java_util_Vector_do, ef2.var_short_goto, 1 == null);
            vectorArray[1] = go_0.java_util_Vector_do(ef2);
            fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
            fo.fo_do().cfr_renamed_1(this.cfr_renamed_1(ef2.var_java_util_Vector_if, 0, 0, 0), 1);
            fo.fo_do().cfr_renamed_1(this.cfr_renamed_1(AngelChip.var_java_util_Vector_do, 1, 0, 1), 0);
            if ((GameCanvas.var_en_do != fo.fo_do())) {
                fo.fo_do().cfr_renamed_4();
            }
        }
    }

    public static void (int n, by by2, DuLieuNguoiChoi ef2, String string, short s2, byte by3, byte by4, String string2, short s3, String string3 == null) {
        if (go_0.boolean_if(n, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
            AutoController.controllerInstance.chuoiGiaTri = AngelChip.var_by_do.var_short_do + " + " + AngelChip.var_by_do.cfr_renamed_5 + "%";
            go_0.void_try(AngelChip.var_by_do.var_short_do, by2.var_short_do);
            go_0.void_try(AngelChip.var_by_do.cfr_renamed_2, by2.cfr_renamed_2);
            go_0.void_try(AngelChip.var_by_do.var_byte_do, by2.var_byte_do);
            go_0.void_try(AngelChip.var_by_do.cfr_renamed_3, by2.cfr_renamed_3);
            go_0.void_try(AngelChip.var_by_do.cfr_renamed_0, by2.cfr_renamed_0);
            go_0.void_try(AngelChip.var_by_do.cfr_renamed_4, by2.cfr_renamed_4);
            AngelChip.var_by_do = by2;
        }
        GameCanvas.cfr_renamed_7();
        DuLieuNguoiChoi ef3 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef3) && go_0.boolean_if(dangChayAuto ? 1 : 0)) {
            dangChayAuto = 0;
            Vector vector = new Vector();
            if (go_0.boolean_int(ef3.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                vector = go_0.java_util_Vector_do(ef3);
            }
            Vector<Object> vector2 = new Vector<Object>();
            Object object = MenuChinhAvatar.db + ": " + GameCanvas.cfr_renamed_1(AngelChip.duLieuNguoiChoi.mangSoNguyen[0], AngelChip.duLieuNguoiChoi.mangSoNguyen[2], AngelChip.duLieuNguoiChoi.soLuong);
            object = new fx((String)object, GameCanvas.var_fz_0_case.cfr_renamed_1((String)object));
            dH dH2 = fh.dH_do(ef3.var_short_goto);
            object = new ct(ef3, dH2, (fx)object);
            ef3.cfr_renamed_4 = 0;
            vector2.addElement(object);
            if (go_0.cfr_renamed_0((Object)ef2)) {
                ef2.cfr_renamed_23 = ef3.cfr_renamed_23;
                vector2.addElement(new an_0("", string, ef3, ef2, s2, by3, by4, string2));
            }
            if (go_0.boolean_int(AngelChip.duLieuNguoiChoi.var_short_goto, ((dd_0)ef3).cfr_renamed_9)) {
                vector2.addElement(go_0.fl_0_do(by2));
            }
            if ((GameCanvas.var_en_do != ff_0.var_ff_0_do)) {
                fo.fo_do().coKichHoat = 1;
                if (go_0.boolean_if((int)AngelChip.duLieuNguoiChoi.var_short_goto, ((dd_0)ef3).cfr_renamed_9)) {
                    if (go_0.cfr_renamed_0((Object)ef2)) {
                        String[] stringArray = new String[2];
                        stringArray[0] = MenuChinhAvatar.M;
                        stringArray[1] = MenuChinhAvatar.cs;
                        fo.fo_do().cfr_renamed_1(stringArray, new Vector[2], vector2);
                        if (go_0.boolean_int(s3, -1)) {
                            fo.fo_do().cfr_renamed_1(new fl_0(string3, new ds(s3)), 1);
                            if (" ".length() <= -" ".length()) {
                                return;
                            }
                        }
                    } else {
                        String[] stringArray = new String[1];
                        stringArray[0] = MenuChinhAvatar.M;
                        fo.fo_do().cfr_renamed_1(stringArray, new Vector[1], vector2);
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    }
                } else if (go_0.cfr_renamed_0((Object)ef2)) {
                    String[] stringArray = new String[4];
                    stringArray[0] = MenuChinhAvatar.M;
                    stringArray[1] = MenuChinhAvatar.cs;
                    stringArray[2] = MenuChinhAvatar.dh;
                    stringArray[3] = MenuChinhAvatar.M;
                    Vector[] vectorArray = new Vector[4];
                    vectorArray[0] = null;
                    vectorArray[1] = null;
                    vectorArray[2] = null;
                    vectorArray[3] = vector;
                    fo.fo_do().cfr_renamed_1(stringArray, vectorArray, vector2);
                    if (go_0.boolean_int(s3, -1)) {
                        fo.fo_do().cfr_renamed_1(new fl_0(string3, new as_0(s3)), 1);
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                } else {
                    String[] stringArray = new String[3];
                    stringArray[0] = MenuChinhAvatar.M;
                    stringArray[1] = MenuChinhAvatar.dh;
                    stringArray[2] = MenuChinhAvatar.M;
                    Vector[] vectorArray = new Vector[3];
                    vectorArray[0] = null;
                    vectorArray[1] = null;
                    vectorArray[2] = vector;
                    fo.fo_do().cfr_renamed_1(stringArray, vectorArray, vector2);
                }
                if ((GameCanvas.var_en_do != fo.fo_do())) {
                    fo.fo_do().cfr_renamed_4();
                }
            }
        }
    }

    public final void cfr_renamed_24() {
        this.void_if(3, -1);
    }

    public final void (int n, int n2, int n3, String string, int n4 == null) {
        if (go_0.boolean_if(n3, -1)) {
            GameCanvas.cfr_renamed_1(string);
            return;
        }
        this.cfr_renamed_1(1, n, n2, n3, n4);
    }

    private void (String string == null) {
        this.var_java_util_Vector_try.addElement(string);
        if (go_0.boolean_do(this.var_int_case)) {
            this.var_int_case = this.var_int_byte;
        }
    }

    public static void cfr_renamed_22() {
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.bg, new cq_0());
    }

    public static void cfr_renamed_17() {
        int n = 0;
        switch (var_byte_int) {
            case 0: {
                n = 3;
                if (null == null) break;
                return;
            }
            case 1: {
                n = 7;
                if ("  ".length() == "  ".length()) break;
                return;
            }
            case 2: {
                n = 21;
                if ("  ".length() > 0) break;
                return;
            }
            case 3: {
                n = 22;
                if (" ".length() >= 0) break;
                return;
            }
            case 4: {
                n = 21;
                if ("  ".length() > 0) break;
                return;
            }
            case 5: {
                n = 22;
            }
        }
        ft_0.ft_0_do().cfr_renamed_13(n);
    }

    public static void (byte by2, int n, String vectorArray, short[] objectArray, int n2, String[] stringArray == null) {
        if ((GameCanvas.var_en_do != fo.fo_do())) {
            go_0.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
            if (go_0.boolean_if(n, 26)) {
                if (go_0.cfr_renamed_1((Object)var_ef_if)) {
                    return;
                }
                go_0.cfr_renamed_2(var_ef_if);
                } else {
                go_0.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
            }
            Vector<am> vector = new Vector<am>();
            if (go_0.boolean_do((int)by2)) {
                block89: {
                    Object object;
                    if ((objectArray != null) && go_0.boolean_if(objectArray.length)) {
                        by2 = (byte)0;
                        while (go_0.boolean_try(by2, objectArray.length)) {
                            vector.addElement(aa_0.am_do(objectArray[by2]));
                            by2 = (byte)(by2 + 1);
                            if (-(0x79 ^ 0x7C) < 0) continue;
                            return;
                        }
                    } else {
                        by2 = (byte)0;
                        while (go_0.boolean_try(by2, aa_0.var_am_arr_do.length)) {
                            object = aa_0.var_am_arr_do[by2];
                            if ((object != null) && (!go_0.boolean_for(((am)object).mangSoNguyen[0]) || go_0.boolean_try(((am)object).mangSoNguyen[1])) && go_0.boolean_if(n, (int)((am)object).var_byte_do)) {
                                vector.addElement((am)object);
                            }
                            by2 = (byte)(by2 + 1);
                            return;
                        }
                    }
                    if (go_0.boolean_if(n, 26)) {
                        Vector[] vectorArray2 = new Vector[6];
                        by2 = (byte)0;
                        while (go_0.boolean_try(by2, 6)) {
                            vectorArray2[by2] = new Vector();
                            by2 = (byte)(by2 + 1);
                            if ("   ".length() >= "  ".length()) continue;
                            return;
                        }
                        Object object2 = new int[6];
                        int n3 = 0;
                        while (go_0.boolean_try(n3, vector.size())) {
                            am am2 = (am)vector.elementAt(n3);
                            object = "";
                            if ((stringArray != null) && go_0.boolean_try(stringArray.length)) {
                                object = stringArray[n3];
                            }
                            vectorArray = "Tặng";
                            if (go_0.boolean_if((int)am2.var_byte_if, 20)) {
                                short s2;
                                short s3;
                                Vector vector2 = vectorArray2[0];
                                if ((objectArray != null)) {
                                    s3 = objectArray[n3];
                                    if ("  ".length() == (0x61 ^ 0x65)) {
                                        return;
                                    }
                                } else {
                                    s3 = -1;
                                }
                                dL dL2 = new dL(am2, s3, n, (String)object, n2, object2[0]);
                                if ((objectArray != null)) {
                                    s2 = objectArray[n3];
                                    if ("   ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    s2 = -1;
                                }
                                vector2.addElement(new bd((String)vectorArray, dL2, am2, s2, object2[0], n2));
                                int n4 = 0;
                                object2[n4] = object2[n4] + 1;
                                if ("   ".length() == 0) {
                                    return;
                                }
                            } else if (go_0.boolean_if((int)am2.var_byte_if, 10)) {
                                short s4;
                                short s5;
                                Vector vector3 = vectorArray2[1];
                                if ((objectArray != null)) {
                                    s5 = objectArray[n3];
                                    if (((0xC8 ^ 0xA2 ^ (0xCF ^ 0xA3)) & (0xD0 ^ 0xAE ^ (0xDC ^ 0xA4) ^ -" ".length())) != 0) {
                                        return;
                                    }
                                } else {
                                    s5 = -1;
                                }
                                dL dL3 = new dL(am2, s5, n, (String)object, n2, object2[1]);
                                if ((objectArray != null)) {
                                    s4 = objectArray[n3];
                                    if ((34 + 69 - 101 + 151 ^ 6 + 97 - 95 + 149) == 0) {
                                        return;
                                    }
                                } else {
                                    s4 = -1;
                                }
                                vector3.addElement(new bd((String)vectorArray, dL3, am2, s4, object2[1], n2));
                                int n5 = 1;
                                object2[n5] = object2[n5] + 1;
                                if (" ".length() == 0) {
                                    return;
                                }
                            } else if (go_0.boolean_int(am2.var_byte_if, 52) && go_0.boolean_int(am2.var_byte_if, 53) && go_0.boolean_int(am2.var_byte_if, 5)) {
                                if (go_0.boolean_if((int)am2.var_byte_if, 60)) {
                                    short s6;
                                    short s7;
                                    Vector vector4 = vectorArray2[3];
                                    if ((objectArray != null)) {
                                        s7 = objectArray[n3];
                                        if ((0x75 ^ 4 ^ (0x2D ^ 0x58)) <= 0) {
                                            return;
                                        }
                                    } else {
                                        s7 = -1;
                                    }
                                    dL dL4 = new dL(am2, s7, n, (String)object, n2, object2[3]);
                                    if ((objectArray != null)) {
                                        s6 = objectArray[n3];
                                        if (((0x1D ^ 0x10 ^ (0xE9 ^ 0xAB)) & (136 + 6 - 113 + 114 ^ 131 + 180 - 278 + 159 ^ -" ".length())) != 0) {
                                            return;
                                        }
                                    } else {
                                        s6 = -1;
                                    }
                                    vector4.addElement(new bd((String)vectorArray, dL4, am2, s6, object2[3], n2));
                                    int n6 = 3;
                                    object2[n6] = object2[n6] + 1;
                                    if (" ".length() <= -" ".length()) {
                                        return;
                                    }
                                } else if (go_0.boolean_if((int)am2.var_byte_if, 70)) {
                                    short s8;
                                    short s9;
                                    Vector vector5 = vectorArray2[4];
                                    if ((objectArray != null)) {
                                        s9 = objectArray[n3];
                                        if ("  ".length() > (0xB ^ 0xF)) {
                                            return;
                                        }
                                    } else {
                                        s9 = -1;
                                    }
                                    dL dL5 = new dL(am2, s9, n, (String)object, n2, object2[4]);
                                    if ((objectArray != null)) {
                                        s8 = objectArray[n3];
                                        } else {
                                        s8 = -1;
                                    }
                                    vector5.addElement(new bd((String)vectorArray, dL5, am2, s8, object2[4], n2));
                                    int n7 = 4;
                                    object2[n7] = object2[n7] + 1;
                                    if ((0x88 ^ 0x8C) < 0) {
                                        return;
                                    }
                                } else {
                                    short s10;
                                    short s11;
                                    Vector vector6 = vectorArray2[5];
                                    if ((objectArray != null)) {
                                        s11 = objectArray[n3];
                                        if (((0x43 ^ 0x68) & ~(0x1E ^ 0x35)) > " ".length()) {
                                            return;
                                        }
                                    } else {
                                        s11 = -1;
                                    }
                                    dL dL6 = new dL(am2, s11, n, (String)object, n2, object2[5]);
                                    if ((objectArray != null)) {
                                        s10 = objectArray[n3];
                                        if (-(0xA3 ^ 0xA6) >= 0) {
                                            return;
                                        }
                                    } else {
                                        s10 = -1;
                                    }
                                    vector6.addElement(new bd((String)vectorArray, dL6, am2, s10, object2[5], n2));
                                    int n8 = 5;
                                    object2[n8] = object2[n8] + 1;
                                    }
                            } else {
                                short s12;
                                short s13;
                                Vector vector7 = vectorArray2[2];
                                if ((objectArray != null)) {
                                    s13 = objectArray[n3];
                                    if (((0xD ^ 0x6F) & ~(1 ^ 0x63)) < -" ".length()) {
                                        return;
                                    }
                                } else {
                                    s13 = -1;
                                }
                                dL dL7 = new dL(am2, s13, n, (String)object, n2, object2[2]);
                                if ((objectArray != null)) {
                                    s12 = objectArray[n3];
                                    if (-(0x47 ^ 0x42) >= 0) {
                                        return;
                                    }
                                } else {
                                    s12 = -1;
                                }
                                vector7.addElement(new bd((String)vectorArray, dL7, am2, s12, object2[2], n2));
                                int n9 = 2;
                                object2[n9] = object2[n9] + 1;
                            }
                            ++n3;
                            return;
                        }
                        n3 = 0;
                        int n10 = 0;
                        while (go_0.boolean_try(n10, vectorArray2.length)) {
                            if (go_0.boolean_try(vectorArray2[n10].size())) {
                                ++n3;
                            }
                            ++n10;
                            if ("   ".length() != 0) continue;
                            return;
                        }
                        String[] stringArray2 = new String[6];
                        stringArray2[0] = "Áo";
                        stringArray2[1] = "Quần";
                        stringArray2[2] = "Trang sức";
                        stringArray2[3] = "Nón";
                        stringArray2[4] = "Cầm tay";
                        stringArray2[5] = "Khác";
                        String[] stringArray3 = stringArray2;
                        byte[] byArray = new byte[6];
                        byArray[0] = 0;
                        byArray[1] = 1;
                        byArray[2] = 2;
                        byArray[3] = 3;
                        byArray[4] = 4;
                        byArray[5] = 5;
                        byte[] byArray2 = byArray;
                        vectorArray = new Vector[n3];
                        objectArray = new byte[n3];
                        stringArray = new String[n3];
                        n2 = 0;
                        int n11 = 0;
                        do {
                            if (go_0.boolean_new(n11, vectorArray2.length)) {
                                fo.fo_do().cfr_renamed_4();
                                fo.coTrangThai = 1;
                                fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
                                if (" ".length() <= 0) {
                                    return;
                                }
                                break block89;
                            }
                            if (!go_0.boolean_for(vectorArray2[n11].size()) || go_0.boolean_if(n11, 5)) {
                                if (go_0.boolean_if(n11, 5)) {
                                    int n12 = vectorArray2[5].size();
                                    by2 = (byte)0;
                                    while (go_0.boolean_try(by2, var_java_util_Vector_if.size())) {
                                        object2 = (bN)var_java_util_Vector_if.elementAt(by2);
                                        vectorArray2[5].addElement(new gU(MenuChinhAvatar.cP, new ag_0(by2, object2.cfr_renamed_0), by2, (bN)object2, n12));
                                        by2 = (byte)(by2 + 1);
                                        return;
                                    }
                                }
                                vectorArray[n2] = vectorArray2[n11];
                                objectArray[n2] = byArray2[n11];
                                stringArray[n2] = stringArray3[n11];
                                ++n2;
                            }
                            ++n11;
                            } while (null == null);
                        return;
                    }
                    Vector<bd> vector8 = new Vector<bd>();
                    by2 = (byte)0;
                    while (go_0.boolean_try(by2, vector.size())) {
                        short s14;
                        short s15;
                        am am3 = (am)vector.elementAt(by2);
                        String string = "";
                        if ((stringArray != null) && go_0.boolean_try(stringArray.length)) {
                            string = stringArray[by2];
                        }
                        if (go_0.boolean_if(n, 100)) {
                            object = MenuChinhAvatar.am;
                            if (((0xAB ^ 0xA6) & ~(0x11 ^ 0x1C)) != ((0x40 ^ 0x52) & ~(0x49 ^ 0x5B))) {
                                return;
                            }
                        } else if (go_0.boolean_if(n, 26)) {
                            object = "Tặng";
                            } else {
                            object = MenuChinhAvatar.dl;
                        }
                        if ((objectArray != null)) {
                            s15 = objectArray[by2];
                            if (((0x7F ^ 0x6B ^ (0x67 ^ 0x52)) & (0x4B ^ 0x2D ^ (0x24 ^ 0x63) ^ -" ".length())) >= (0x32 ^ 0x70 ^ (0xF4 ^ 0xB2))) {
                                return;
                            }
                        } else {
                            s15 = -1;
                        }
                        dL dL8 = new dL(am3, s15, n, string, n2, by2);
                        if ((objectArray != null)) {
                            s14 = objectArray[by2];
                            if (((0xB1 ^ 0xA2) & ~(0xD6 ^ 0xC5)) > ((4 ^ 0x5E) & ~(0x71 ^ 0x2B))) {
                                return;
                            }
                        } else {
                            s14 = -1;
                        }
                        vector8.addElement(new bd((String)object, dL8, am3, s14, by2, n2));
                        by2 = (byte)(by2 + 1);
                        if (((0 ^ 0x49) & ~(0xD1 ^ 0x98)) == 0) continue;
                        return;
                    }
                    if (go_0.boolean_try(vector8.size())) {
                        fo.fo_do().cfr_renamed_4();
                        fo.coTrangThai = 1;
                        String[] stringArray4 = new String[1];
                        stringArray4[0] = vectorArray;
                        Vector[] vectorArray3 = new Vector[1];
                        vectorArray3[0] = vector8;
                        fo.fo_do().cfr_renamed_1(stringArray4, vectorArray3, null);
                    }
                }
                GameCanvas.cfr_renamed_7();
            }
        }
    }

    public static void (byte by2 == null) {
        if (go_0.boolean_if((int)var_byte_char, -1)) {
            go_0.cfr_renamed_8();
            GameCanvas.cfr_renamed_8();
            var_byte_char = by2;
            ft_0.ft_0_do().cfr_renamed_12(8);
        }
    }

    public final void cfr_renamed_2(String string) {
        if (go_0.boolean_do(string.trim().equals("") ? 1 : 0)) {
            if (go_0.boolean_int(string.indexOf("dmw"), -1)) {
                if (go_0.cfr_renamed_0((Object)var_ef_if)) {
                    ft_0.ft_0_do().cfr_renamed_0((int)go_0.var_ef_if.var_short_goto, string);
                    return;
                }
            } else {
                if (go_0.boolean_do(string.indexOf("ptw")) && go_0.cfr_renamed_0((Object)var_ef_if) && go_0.cfr_renamed_0((Object)go_0.var_ef_if.soLuong) && (go_0.var_ef_if.soLuong.var_java_lang_String_arr_do != null)) {
                    string = string + " (";
                    int n = 0;
                    while (go_0.boolean_try(n, go_0.var_ef_if.soLuong.var_java_lang_String_arr_do.length)) {
                        string = string + " " + go_0.var_ef_if.soLuong.var_java_lang_String_arr_do[n];
                        ++n;
                        if ((0x2F ^ 0x49 ^ (0x5A ^ 0x38)) >= "  ".length()) continue;
                        return;
                    }
                    string = string + ").";
                    ft_0.ft_0_do().cfr_renamed_0((int)go_0.var_ef_if.var_short_goto, string);
                    return;
                }
                fn.fn_do().cfr_renamed_0(string);
            }
        }
    }

        private static fl_0 fl_0_do(by by2) {
        return new cw(by2);
    }

    public static void void_try(int n) {
        var_int_new = n;
        var_int_try = fh.var_int_char;
        go_0.go_0_do();
        go_0.cfr_renamed_8();
        ft_0.ft_0_do().cfr_renamed_12(8);
        GameCanvas.cfr_renamed_8();
    }

    private static boolean boolean_int(int n) {
        return n >= 0;
    }

    protected static void cfr_renamed_29() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = 0;
        while (go_0.boolean_try(n, 4)) {
            ff_0.cfr_renamed_1();
            fl_0 fl_02 = ff_0.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_int[n], new cY(n), n + 7);
            vector.addElement(fl_02);
            ++n;
            if ("   ".length() > "  ".length()) continue;
            return;
        }
        ff_0.cfr_renamed_1();
        ff_0.cfr_renamed_1().cfr_renamed_1(vector);
    }

    public final void cfr_renamed_4() {
        this.b_();
        super.cfr_renamed_4();
    }

    private static boolean boolean_for(int n, int n2) {
        return n > n2;
    }

    private static void cfr_renamed_40() {
        al.cfr_renamed_3();
        Vector<cg> vector = new Vector<cg>();
        int n = 0;
        while (go_0.boolean_try(n, al.var_java_util_Vector_do.size())) {
            gi_0 gi_02 = (gi_0)al.var_java_util_Vector_do.elementAt(n);
            cg cg2 = new cg();
            new cg().var_short_do = gi_02.var_short_do;
            vector.addElement(cg2);
            ++n;
            if (-" ".length() < (0x31 ^ 0x35)) continue;
            return;
        }
        fo.fo_do().coKichHoat = 1;
        String[] stringArray = new String[1];
        stringArray[0] = "Kirby";
        Vector[] vectorArray = new Vector[1];
        vectorArray[0] = go_0.java_util_Vector_do(vector);
        fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
        if ((GameCanvas.var_en_do != fo.fo_do())) {
            fo.fo_do().cfr_renamed_4();
        }
    }

    protected static void cfr_renamed_26() {
        ey_0[] ey_0Array = new ey_0[3];
        int n = 0;
        while (go_0.boolean_try(n, 3)) {
            ey_0Array[n] = new ey_0();
            ey_0Array[n].void_do(2);
            ++n;
            if (-(0x28 ^ 0x78 ^ (0xD1 ^ 0x85)) < 0) continue;
            return;
        }
        ey_0Array[0].cfr_renamed_0(1);
        fl_0 fl_02 = new fl_0(MenuChinhAvatar.aC, new ch_0(ey_0Array));
        el.cfr_renamed_1().cfr_renamed_1(ey_0Array, MenuChinhAvatar.aj, MenuChinhAvatar.var_java_lang_String_arr_arr_for, fl_02);
        GameCanvas.var_ez_do = el.cfr_renamed_1();
    }

    public static void (byte by2 != null) {
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(by2);
        ep_0.ep_0_do().cfr_renamed_7(by2);
    }

    public static void cfr_renamed_27() {
        if ((AngelChip.duLieuNguoiChoi.var_java_util_Vector_if != null)) {
            AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.removeAllElements();
        }
        fh.var_int_byte = -1;
        fh.var_cu_0_do = null;
        fh.var_int_int = 24;
        ae.ae_do().void_do();
        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
        ThongTinNhanVat.cfr_renamed_1().cfr_renamed_2();
        al_0.dangChayAuto = 0;
        al_0.soLuong = 0;
        fv_0.var_java_util_Vector_do = null;
        fh.var_java_util_Vector_case.removeAllElements();
        AngelChip.duLieuNguoiChoi = new DuLieuNguoiChoi();
        AngelChip.var_by_do = new by();
        GameCanvas.var_java_util_Vector_do.removeAllElements();
        fh_0.fh_0_do().var_bH_do = null;
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 0: {
                ep_0.ep_0_do().cfr_renamed_4(AngelChip.duLieuNguoiChoi.var_short_goto);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 1: {
                gd_0.gd_0_do().cfr_renamed_8();
                return;
            }
            case 2: {
                ft_0.ft_0_do().cfr_renamed_4(n2);
                return;
            }
            case 3: {
                go_0.go_0_do();
                (AngelChip.duLieuNguoiChoi != 0);
                return;
            }
            case 4: {
                go_0.go_0_do();
                (AngelChip.duLieuNguoiChoi != 1);
            }
        }
    }

    public final void cfr_renamed_25() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 10, this));
        vector.addElement(new fl_0("Cài đặt", 9, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public final void cfr_renamed_28() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Cài xu cần up", 30, this));
        vector.addElement(new fl_0("Cài số ngày up", 31, this));
        vector.addElement(new fl_0("Reset dữ liệu", 32, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void (byte by2, Vector vector, Vector vector2, Vector object == null) {
        byte[] byArray = new byte[7];
        byArray[0] = 59;
        byArray[1] = 60;
        byArray[2] = 58;
        byArray[3] = 104;
        byArray[4] = 105;
        byArray[5] = 101;
        byArray[6] = 102;
        byte[] byArray2 = byArray;
        fh.var_java_util_Vector_do = vector2;
        fh.var_java_util_Vector_if = object;
        GameCanvas.var_fh_do.void_do(byArray2[by2]);
        if ((vector2 != null)) {
            fh.cfr_renamed_3();
        }
        int n = 0;
        while (go_0.boolean_try(n, vector.size())) {
            object = (bm)vector.elementAt(n);
            if (go_0.boolean_do((int)((bm)object).var_byte_if)) {
                object = (DuLieuNguoiChoi)object;
                ((DuLieuNguoiChoi)object).var_short_char = ((DuLieuNguoiChoi)object).var_short_for;
                ((DuLieuNguoiChoi)object).var_short_try = (short)(((DuLieuNguoiChoi)object).var_boolean_int ? 1 : 0);
                ((DuLieuNguoiChoi)object).var_byte_long = (byte)(((DuLieuNguoiChoi)object).cfr_renamed_4 ? 1 : 0);
                ((DuLieuNguoiChoi)object).void_if();
                if (go_0.boolean_int(((DuLieuNguoiChoi)object).var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    go_0.cfr_renamed_4((DuLieuNguoiChoi)object);
                    fh.cfr_renamed_1((DuLieuNguoiChoi)object);
                }
                if ("  ".length() == -" ".length()) {
                    return;
                }
            } else if (go_0.boolean_if((int)((bm)object).var_byte_if, 5)) {
                object = (ed)object;
                ((ed)object).soLuong = ((ed)object).cfr_renamed_2;
                ((ed)object).var_int_this = ((ed)object).cfr_renamed_3;
                fh.var_java_util_Vector_case.addElement(object);
            }
            ++n;
            return;
        }
        if (go_0.boolean_if(fj_0.dangChayAuto ? 1 : 0)) {
            (fj_0.var_fs_do.soLuong, fj_0.var_fs_do.var_int_if, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 == null);
            if ("   ".length() <= -" ".length()) {
                return;
            }
        } else {
            AngelChip.duLieuNguoiChoi.var_boolean_int += 1;
            go_0.cfr_renamed_8();
        }
        go_0.cfr_renamed_7(AngelChip.duLieuNguoiChoi.var_short_final);
        if (go_0.boolean_if(GameCanvas.coKichHoat ? 1 : 0) && go_0.boolean_if((int)byArray2[by2], 101)) {
            GameCanvas.var_fv_do = new fv();
            GameCanvas.var_fv_do.cfr_renamed_0();
        }
    }

    public static void cfr_renamed_6(int n) {
        gd_0.gd_0_do().var_byte_do = (byte)n;
        if (go_0.boolean_int(AngelChip.duLieuNguoiChoi.var_byte_catch, n) && go_0.boolean_int(AngelChip.duLieuNguoiChoi.var_byte_catch, -1)) {
            gd_0.gd_0_do().cfr_renamed_8();
            return;
        }
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.cl, 0));
        vector.addElement(new fl_0(MenuChinhAvatar.ck, 1));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public static void (ak ak2 == null) {
        if (go_0.cfr_renamed_1((Object)fh.var_java_util_Vector_for)) {
            fh.var_java_util_Vector_for = new Vector();
        }
        fh.var_java_util_Vector_for.addElement(ak2);
        if (go_0.boolean_if(TienIchGame.coKichHoat ? 1 : 0) && (AutoController.nhiemVuHienTai != null) && go_0.boolean_if(AutoController.nhiemVuHienTai instanceof cl_0)) {
            TienIchGame.cfr_renamed_21();
        }
    }

    public static void (Graphics graphics, String string, int n, int n2, int n3 == null) {
        graphics.drawImage(var_javax_microedition_lcdui_Image_do, n, n2 + 2, 17);
        int n4 = var_javax_microedition_lcdui_Image_do.getWidth() - 4 * dF.cfr_renamed_12;
        int n5 = n3 * n4 / 100;
        if (go_0.boolean_for(n5, n4)) {
            n5 = n4;
        }
        if (go_0.boolean_new(n5)) {
            n5 = 0;
        }
        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, string, n - 32 * dF.cfr_renamed_12, n2 + 4 * dF.cfr_renamed_12 - dF.var_byte_new / 2, 1);
        n4 = n - 27 * dF.cfr_renamed_12;
        v_0.cfr_renamed_1(n4, n2 + 4 * dF.cfr_renamed_12 - 1, n5, 4 * dF.cfr_renamed_12, 47084, graphics);
        v_0.cfr_renamed_1(n4, n2 + 5 * dF.cfr_renamed_12 - 1, n5, 1 * dF.cfr_renamed_12, 8575990, graphics);
        v_0.cfr_renamed_1(n4 + n5, n2 + 4 * dF.cfr_renamed_12 - 1, 1, 4 * dF.cfr_renamed_12, 13379, graphics);
        if (go_0.boolean_do(string.equals("") ? 1 : 0)) {
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(n3), n + 29 * dF.cfr_renamed_12 + GameCanvas.var_fz_0_case.cfr_renamed_1("100"), n2 + 4 * dF.cfr_renamed_12 - dF.var_byte_new / 2, 1);
        }
    }

    public static void (int n != Vector vector) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            ef2.var_java_util_Vector_int = vector;
            ef2.var_short_this = (short)0;
        }
    }

    private void (int n, int n2, int n3, int n4, int n5 == null) {
        block24: {
            DuLieuNguoiChoi ef2;
            DuLieuNguoiChoi ef3;
            block26: {
                block25: {
                    ef3 = fh.ef_do(n2);
                    ef2 = fh.ef_do(n3);
                    if (!go_0.cfr_renamed_0((Object)ef3) || !go_0.cfr_renamed_0((Object)ef2) || !go_0.boolean_do(ef3.var_int_class) || !go_0.boolean_do(ef2.var_int_class)) break block24;
                    ef3.var_int_const = ef2.var_short_goto;
                    ef3.var_int_long = ef3.var_short_goto;
                    ef2.var_int_long = ef3.var_short_goto;
                    ef2.var_int_const = ef2.var_short_goto;
                    if (go_0.boolean_if(n2, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        AngelChip.duLieuNguoiChoi.var_short_try = (short)(ef2.var_boolean_int ? 1 : 0);
                        if (go_0.boolean_try(AngelChip.duLieuNguoiChoi.var_short_for, ef2.var_short_for)) {
                            n2 = ef2.var_short_for - 15;
                            if (((0x6D ^ 8 ^ (0x11 ^ 0x42)) & (0xAB ^ 0x98 ^ (0x99 ^ 0x9C) ^ -" ".length())) < ((70 + 97 - 53 + 37 ^ 30 + 14 - 33 + 121) & (11 + 65 - -59 + 0 ^ 6 + 48 - -64 + 30 ^ -" ".length()))) {
                                return;
                            }
                        } else {
                            n2 = ef2.var_short_for + 15;
                        }
                        AngelChip.duLieuNguoiChoi.var_short_char = (short)n2;
                        (n2, ef2.var_boolean_int ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0 == null);
                    }
                    if (go_0.boolean_if(n3, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        int n6;
                        short s2 = AngelChip.duLieuNguoiChoi.var_short_for;
                        int n7 = AngelChip.duLieuNguoiChoi.var_boolean_int;
                        if (go_0.boolean_do(ef3.cfr_renamed_4 ? 1 : 0)) {
                            n6 = dd_0.var_byte_try;
                            if ("   ".length() <= 0) {
                                return;
                            }
                        } else {
                            n6 = 0;
                        }
                        go_0.cfr_renamed_1((int)s2, n7, n6, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
                    }
                    if (!go_0.boolean_if(n, 1)) break block25;
                    ef2.var_int_this = -1;
                    switch (n4) {
                        case 0: {
                            ef2.var_int_class = ef3.var_int_class = -3;
                            this.cfr_renamed_1((String)ef3.soLuong + " " + MenuChinhAvatar.az + (String)ef2.soLuong);
                            if ("   ".length() < ((0x99 ^ 0xC0) & ~(0xD0 ^ 0x89))) {
                                return;
                            }
                            break block26;
                        }
                        case 100: {
                            if (go_0.boolean_do(ef2.var_int_class)) {
                                ef3.var_int_class = -2;
                                ef2.var_int_class = -2;
                                ef3.var_java_util_Vector_for.removeAllElements();
                                ef2.var_java_util_Vector_for.removeAllElements();
                                ef3.duLieuNguoiChoi = ef2;
                                ef3.void_if(ef2.var_short_for, ef2.var_boolean_int + 5);
                                if ("  ".length() == -" ".length()) {
                                    return;
                                }
                            }
                            break block26;
                        }
                        case 101: {
                            if (go_0.boolean_do(ef2.var_int_class)) {
                                ef3.var_int_class = 11;
                                ef2.var_int_class = 11;
                                ef3.var_java_util_Vector_for.removeAllElements();
                                ef2.var_java_util_Vector_for.removeAllElements();
                                ef3.duLieuNguoiChoi = ef2;
                                if (go_0.boolean_try(ef3.var_short_for, ef2.var_short_for)) {
                                    ef3.void_if(ef2.var_short_for - 20, ef2.var_boolean_int + 2);
                                    } else {
                                    ef3.void_if(ef2.var_short_for + 20, ef2.var_boolean_int + 2);
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                }
                            }
                            break block26;
                        }
                        case 102: 
                        case 103: {
                            ef2.var_int_class = ef3.var_int_class = 12;
                            ef2.var_short_try = ef3.var_short_try = (short)n5;
                            this.cfr_renamed_1((String)ef3.soLuong + " " + MenuChinhAvatar.cP + " " + (String)ef2.soLuong);
                            if ("   ".length() <= 0) {
                                return;
                            }
                            break block26;
                        }
                        default: {
                            this.cfr_renamed_1((String)ef3.soLuong + " " + "tặng quà" + " " + (String)ef2.soLuong);
                            if (" ".length() != " ".length()) {
                                return;
                            }
                            break block26;
                        }
                    }
                }
                ef3.var_int_class = 9;
                ef2.var_int_class = 8;
                ef2.var_int_this = -1;
                ef2.var_int_void = n4;
                am am2 = aa_0.am_do((short)n4);
                this.cfr_renamed_1((String)ef3.soLuong + " " + MenuChinhAvatar.cV + " " + am2.chuoiGiaTri + " " + MenuChinhAvatar.bm + " " + (String)ef2.soLuong);
            }
            ef2.cfr_renamed_7 = ef2.var_short_final;
            ef2.var_short_long = (short)0;
            ef3.cfr_renamed_7 = ef3.var_short_final;
            ef3.var_short_long = (short)0;
        }
    }

    public static void void_new(int n, int n2) {
        bm bm2;
        block10: {
            int n3 = 0;
            do {
                if (go_0.boolean_new(n3, fh.var_java_util_Vector_case.size())) {
                    bm2 = null;
                    break block10;
                }
                bm bm3 = (bm)fh.var_java_util_Vector_case.elementAt(n3);
                if (go_0.boolean_if((int)bm3.var_byte_if, 5)) {
                    bm3 = (ed)bm3;
                    if (go_0.boolean_if(((ed)bm3).var_int_long, n)) {
                        bm2 = bm3;
                        break block10;
                    }
                }
                ++n3;
                } while (null == null);
            return;
        }
        if ((bm2 != null)) {
            DuLieuNguoiChoi ef2 = fh.ef_do(n2);
            if (go_0.cfr_renamed_0((Object)ef2)) {
                ((ed)bm2).soLuong = ((bm)ef2).cfr_renamed_2;
                ((ed)bm2).var_int_this = ((bm)ef2).cfr_renamed_3;
                ((ed)bm2).cfr_renamed_8 = (byte)1;
                ((ed)bm2).var_short_do = (short)0;
                if (((0x56 ^ 0x77) & ~(0x5E ^ 0x7F)) != 0) {
                    return;
                }
            } else {
                ((ed)bm2).var_short_do = (short)0;
                ((ed)bm2).cfr_renamed_8 = (byte)3;
            }
            ((ed)bm2).cfr_renamed_13 = (byte)6;
        }
    }

    public static void (boolean bl != String string) {
        if (go_0.boolean_if(bl ? 1 : 0)) {
            fv_0.cfr_renamed_1();
            fv_0.cfr_renamed_5();
        }
        GameCanvas.cfr_renamed_1(string);
    }

    private static Vector java_util_Vector_do(Vector vector) {
        Vector<bv_0> vector2 = new Vector<bv_0>();
        int n = 0;
        while (go_0.boolean_try(n, vector.size())) {
            cg cg2 = (cg)vector.elementAt(n);
            vector2.addElement(new bv_0(cg2, n, "Chọn", new hl(cg2.var_short_do, n)));
            ++n;
            if (" ".length() <= (0x95 ^ 0xB2 ^ (0x94 ^ 0xB7))) continue;
            return null;
        }
        return vector2;
    }

    public static void (byte by2 != int n) {
        GameCanvas.cfr_renamed_7();
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.cfr_renamed_0((Object)ef2)) {
            if (go_0.boolean_do((int)by2)) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_31 + (String)ef2.soLuong + ". " + MenuChinhAvatar.aJ, new db_0(n));
                return;
            }
            if (go_0.boolean_if((int)by2, 1)) {
                var_int_int = n;
                ft_0.ft_0_do().cfr_renamed_12(11);
                GameCanvas.cfr_renamed_8();
            }
        }
    }

    private void cfr_renamed_35() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 65, this));
        vector.addElement(new fl_0("Cài đặt", 66, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    private static boolean boolean_new(int n) {
        return n < 0;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void cfr_renamed_7(int n) {
        AngelChip.duLieuNguoiChoi.void_new(n);
        AngelChip.duLieuNguoiChoi.cfr_renamed_7 = AngelChip.duLieuNguoiChoi.var_short_final;
        AngelChip.duLieuNguoiChoi.var_short_long = (short)0;
        ep_0.ep_0_do().cfr_renamed_7(n + 100);
    }

    private static void cfr_renamed_41() {
        Vector<fl_0> vector = new Vector<fl_0>();
        if (go_0.cfr_renamed_0((Object)var_ef_if) && go_0.boolean_do(go_0.var_ef_if.var_int_class) && go_0.boolean_try(go_0.var_ef_if.var_short_goto, 2000000000)) {
            vector.addElement(new fl_0("Hôn " + (String)go_0.var_ef_if.soLuong, new aF(go_0.var_ef_if.var_short_goto)));
        }
        vector.addElement(new fl_0("Hôn tất cả", new aF(-1)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public static void (int n, int n2, int n3, int n4, short s2 == null) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if (go_0.boolean_int(n, AngelChip.duLieuNguoiChoi.var_short_goto) && go_0.boolean_do(coTrangThai ? 1 : 0) && go_0.cfr_renamed_0((Object)ef2)) {
            if (go_0.boolean_if(ef2.soLuong) && go_0.boolean_do(ef2.var_int_class)) {
                ef2.soLuong = 0;
                ef2.void_do(n2, n3);
                ef2.var_boolean_int = s2;
            }
            if (go_0.boolean_if((int)ef2.var_short_for, -3)) {
                ef2.var_short_for = (short)0;
            }
            ef2.var_int_this = -1;
            if (go_0.boolean_do(ef2.var_int_class)) {
                fs fs2 = new fs(n2, n3, n4);
                new fs(n2, n3, n4).var_short_do = s2;
                ef2.var_java_util_Vector_for.addElement(fs2);
            }
        }
    }

    private void cfr_renamed_37() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Bật Auto", 109, this));
        vector.addElement(new fl_0("Cài đặt", 110, this));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void (am am2 != null) {
        GameCanvas.cfr_renamed_1(am2.mangSoNguyen[0], am2.mangSoNguyen[1], new hd(am2), new hj(am2), null);
    }

    public final void cfr_renamed_6() {
        if (go_0.boolean_if(GameCanvas.coTrangThai ? 1 : 0) && go_0.boolean_if(GameCanvas.boolean_do(0, 0, GameCanvas.soLuongKhoa, 0) ? 1 : 0)) {
            GameCanvas.coTrangThai = 0;
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
        }
        if (!(GameCanvas.var_fv_do != null) || go_0.boolean_do(fv.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_6();
        }
        GameCanvas.var_fh_do.cfr_renamed_1();
        AngelChip.duLieuNguoiChoi.cfr_renamed_2();
    }

    protected static void cfr_renamed_31() {
        if (go_0.cfr_renamed_0((Object)var_ef_if)) {
            go_0.cfr_renamed_8(100);
        }
    }

    public static void cfr_renamed_3(DuLieuNguoiChoi ef2) {
        go_0.cfr_renamed_4(ef2);
        ef2.void_if();
        ef2.soLuong = 1;
        DuLieuNguoiChoi ef3 = fh.ef_do(ef2.var_short_goto);
        if (go_0.cfr_renamed_0((Object)ef3)) {
            fh.var_java_util_Vector_case.removeElement(ef3);
            }
        fh.cfr_renamed_1(ef2);
    }

        public static void cfr_renamed_8(int n) {
        fn.fn_do().void_if(go_0.var_ef_if.var_short_goto, n);
    }

    public static void void_do(Vector vector) {
        if (go_0.boolean_do(vector.isEmpty() ? 1 : 0)) {
            Vector<cr_0> vector2 = new Vector<cr_0>();
            int n = 0;
            while (go_0.boolean_try(n, vector.size())) {
                fx fx2 = (fx)vector.elementAt(n);
                vector2.addElement(new cr_0(fx2.chuoiGiaTri, new gu_0(fx2), fx2));
                ++n;
                if (-" ".length() >= -" ".length()) continue;
                return;
            }
            ff_0.cfr_renamed_1().cfr_renamed_1(vector2);
        }
    }

    private static boolean boolean_int(int n, int n2) {
        return n != n2;
    }

    public static void (short s2, String object, int n, int n2, int n3 == null) {
        GameCanvas.cfr_renamed_1((String)object);
        AngelChip.duLieuNguoiChoi.void_do(n);
        AngelChip.duLieuNguoiChoi.void_try(n2);
        AngelChip.duLieuNguoiChoi.soLuong = n3;
        object = aa_0.am_do(s2);
        if (go_0.boolean_int(((am)object).cfr_renamed_2, -2)) {
            cg cg2 = aa_0.cfr_renamed_1((int)((am)object).var_byte_if, AngelChip.duLieuNguoiChoi.var_java_util_Vector_if);
            if ((cg2 != null)) {
                cg2.var_short_do = s2;
                if ("  ".length() <= " ".length()) {
                    return;
                }
            } else if (go_0.boolean_if((int)((am)object).var_byte_if, -1) && go_0.boolean_int(AngelChip.duLieuNguoiChoi.var_short_if, -1)) {
                AngelChip.duLieuNguoiChoi.cfr_renamed_1(s2);
                ep_0.ep_0_do().cfr_renamed_3(AngelChip.duLieuNguoiChoi.var_short_goto);
                if (((0x6D ^ 0x53) & ~(0x35 ^ 0xB)) > "   ".length()) {
                    return;
                }
            } else {
                AngelChip.duLieuNguoiChoi.cfr_renamed_0(new cg(s2));
                AngelChip.duLieuNguoiChoi.void_if();
            }
            AngelChip.duLieuNguoiChoi.void_new(11);
            if (go_0.boolean_if((int)((am)object).var_byte_if, -1) && go_0.boolean_if((int)AngelChip.duLieuNguoiChoi.var_short_if, -1)) {
                AngelChip.duLieuNguoiChoi.cfr_renamed_5();
                ep_0.ep_0_do().cfr_renamed_3(AngelChip.duLieuNguoiChoi.var_short_goto);
            }
        }
        AngelChip.var_java_util_Vector_do = null;
    }

    public static Vector (Vector vector, int n, int n2 == null) {
        Vector<Object> vector2 = new Vector<Object>();
        int n3 = 0;
        while (go_0.boolean_try(n3, vector.size())) {
            Object object = (cg)vector.elementAt(n3);
            am am2 = aa_0.am_do(((cg)object).var_short_do);
            String string = null;
            if (go_0.boolean_if(n, (int)AngelChip.duLieuNguoiChoi.var_short_goto) && (!go_0.boolean_if(aa_0.boolean_do((int)am2.var_byte_if) ? 1 : 0) || go_0.boolean_if(n2))) {
                if (go_0.boolean_if(n2, 1)) {
                    string = MenuChinhAvatar.cz;
                    if (((0x3C ^ 0x75) & ~(0xFE ^ 0xB7)) > 0) {
                        return null;
                    }
                } else {
                    string = MenuChinhAvatar.cB;
                }
            }
            object = new dm(string, new bk_0((cg)object, n, n2, n3), (cg)object, n3, n2);
            vector2.addElement(object);
            ++n3;
            if ((6 ^ 0x40 ^ (0x55 ^ 0x17)) > 0) continue;
            return null;
        }
        return vector2;
    }

    private static boolean boolean_new(int n, int n2) {
        return n >= n2;
    }

    public final void cfr_renamed_11() {
        var_byte_char = (byte)-1;
        var_byte_int = (byte)-1;
        if (go_0.boolean_if(AngelChip.soLuong, 8)) {
            this.cfr_renamed_14();
            return;
        }
        ft_0.ft_0_do().cfr_renamed_12(8);
        if (go_0.boolean_do(TienIchGame.boolean_do(15000L) ? 1 : 0)) {
            this.cfr_renamed_14();
        }
    }

    private void cfr_renamed_19() {
        coTrangThai = 0;
        this.cfr_renamed_9 = (byte)0;
        int n = 0;
        while (go_0.boolean_try(n, fh.var_java_util_Vector_case.size())) {
            bm bm2 = (bm)fh.var_java_util_Vector_case.elementAt(n);
            if (go_0.boolean_do((int)bm2.var_byte_if)) {
                ((DuLieuNguoiChoi)bm2).cfr_renamed_7 = (short)4;
            }
            ++n;
            if ("  ".length() != 0) continue;
            return;
        }
    }

    public final void void_int(int n) {
        cs_0.cfr_renamed_1().cfr_renamed_1(n, this);
        super.void_int(n);
    }

    public static void (byte[] objectArray, byte by2, byte by3, byte by4, Image image, short[] sArray, Vector vector, Vector vector2 == null) {
        var_short_arr_do = sArray;
        GameCanvas.var_int_byte = 0;
        var_byte_for = by2;
        fh.var_java_util_Vector_do = vector;
        fh.var_java_util_Vector_if = vector2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])objectArray);
        fh.var_short_arr_if = new short[objectArray.length];
        fh.var_short_if = by4;
        fh.var_short_do = (short)(objectArray.length / by4);
        fh.var_javax_microedition_lcdui_Image_if = image;
        if ((image != null)) {
            objectArray = new int[4];
            image.getRGB((int[])objectArray, 0, 2, 0, 0, 2, 2);
            fh.var_int_new = objectArray[0];
        }
        try {
            int n = 0;
            while (go_0.boolean_try(n, fh.var_short_arr_if.length)) {
                fh.var_short_arr_if[n] = (short)byteArrayInputStream.read();
                ++n;
                if (-"   ".length() <= 0) continue;
                return;
            }
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (-" ".length() >= 0) {
            return;
        }
        if (go_0.boolean_int(by3, fh.var_int_else)) {
            ft_0.ft_0_do().cfr_renamed_0(by3);
            return;
        }
        fh.cfr_renamed_0();
    }

    private static boolean boolean_try(int n, int n2) {
        return n < n2;
    }

    public static Vector java_util_Vector_do(DuLieuNguoiChoi ef2) {
        DuLieuNguoiChoi ef3 = new DuLieuNguoiChoi();
        new DuLieuNguoiChoi().soLuong = ef2.soLuong;
        ef3.void_do(ef2.int_do());
        ef3.var_short_goto = ef2.var_short_goto;
        ef3.var_short_if = ef2.var_short_if;
        ef3.var_short_float = ef2.var_short_float;
        int n = 0;
        while (go_0.boolean_try(n, ef2.var_java_util_Vector_if.size())) {
            cg cg2 = (cg)ef2.var_java_util_Vector_if.elementAt(n);
            am am2 = aa_0.am_do(cg2.var_short_do);
            if (go_0.cfr_renamed_0((Object)am2) && go_0.boolean_int(am2.var_byte_if, 30) && go_0.boolean_int(am2.var_byte_if, 40)) {
                ef3.cfr_renamed_0(cg2);
            }
            ++n;
            if (-(0xA8 ^ 0x98 ^ (0x8B ^ 0xBE)) < 0) continue;
            return null;
        }
        if (go_0.boolean_int(ef3.var_short_if, -1)) {
            cg cg3 = new cg(ef3.var_short_if);
            new cg(ef3.var_short_if).var_byte_do = (byte)(100 - ef3.var_short_float);
            ef3.var_java_util_Vector_if.addElement(cg3);
        }
        return (ef3.var_java_util_Vector_if, ef3.var_short_goto, 0 == null);
    }

    private static boolean boolean_try(int n) {
        return n > 0;
    }

    public final void void_if() {
        this.var_fl_0_byte.cfr_renamed_0();
    }

    public static void cfr_renamed_32() {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("ID 0: Khu mặt trời", new ba(0)));
        vector.addElement(new fl_0("ID 1: Khu quay số cũ", new ba(1)));
        vector.addElement(new fl_0("ID 2: Khu đấu giá cũ", new ba(2)));
        vector.addElement(new fl_0("ID 3: Khu ăn xin trái", new ba(3)));
        vector.addElement(new fl_0("ID 4: Khu cưới clan", new ba(4)));
        vector.addElement(new fl_0("ID 5: Khu tài xỉu", new ba(5)));
        vector.addElement(new fl_0("ID 6: Khu cô giáo", new ba(6)));
        vector.addElement(new fl_0("ID 7: Dưới khu cô giáo", new ba(7)));
        vector.addElement(new fl_0("ID 8: Khu 4 con vịt", new ba(8)));
        vector.addElement(new fl_0("ID 9: Khu giải trí", new ba(9)));
        vector.addElement(new fl_0("ID 10: Khu lễ đường", new ba(10)));
        vector.addElement(new fl_0("ID 11: Khu công viên", new ba(11)));
        vector.addElement(new fl_0("ID 12: Khu trống", new ba(12)));
        vector.addElement(new fl_0("ID 13: Khu sinh thái", new ba(13)));
        vector.addElement(new fl_0("ID 14: Khu cá rô", new ba(14)));
        vector.addElement(new fl_0("ID 15: Khu cá lóc", new ba(15)));
        vector.addElement(new fl_0("ID 16: Khu cá mập", new ba(16)));
        vector.addElement(new fl_0("ID 17: Khu ngoại ô", new ba(17)));
        vector.addElement(new fl_0("ID 18: Khu nhà tù", new ba(18)));
        vector.addElement(new fl_0("ID 21: Khu nhà ở", new ba(21)));
        vector.addElement(new fl_0("ID 23: Khu mua sắm", new ba(23)));
        vector.addElement(new fl_0("ID 25: Nông trại", new ba(25)));
        vector.addElement(new fl_0("ID 27: Đảo Hawai", new ba(27)));
        vector.addElement(new fl_0("ID 28: Biển Hawai", new ba(28)));
        vector.addElement(new fl_0("ID 29: Biển Hawai trái", new ba(29)));
        vector.addElement(new fl_0("ID 30: Biển Hawai phải", new ba(30)));
        vector.addElement(new fl_0("ID 33: Ai cập", new ba(33)));
        vector.addElement(new fl_0("ID 34: Sa mạc", new ba(34)));
        vector.addElement(new fl_0("ID 55: VĐBĐ", new ba(55)));
        vector.addElement(new fl_0("ID 56: Map phù thủy", new ba(56)));
        vector.addElement(new fl_0("ID 57: Trái phù thủy", new ba(57)));
        vector.addElement(new fl_0("ID 58: Phải phù thủy", new ba(58)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public final void (int n, int n2, int n3, String string, int n4, int n5, int n6 == null) {
        if (go_0.boolean_if(n3, -1)) {
            GameCanvas.cfr_renamed_1(string);
            return;
        }
        if (go_0.boolean_if(n, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_1(n4, n5, n6);
        }
        this.cfr_renamed_1(0, n, n2, n3, 0);
    }

    public static void (String string != int n) {
        Vector<ee_0> vector = new Vector<ee_0>();
        int n2 = 0;
        while (go_0.boolean_try(n2, aa_0.var_java_util_Vector_do.size())) {
            ee_0 ee_02 = (ee_0)aa_0.var_java_util_Vector_do.elementAt(n2);
            if (go_0.boolean_if((int)ee_02.var_byte_do, n)) {
                vector.addElement(ee_02);
            }
            ++n2;
            return;
        }
        Vector<Object> vector2 = new Vector<Object>();
        int n3 = 0;
        while (go_0.boolean_try(n3, vector.size())) {
            Object object = (ee_0)vector.elementAt(n3);
            object = new cf_0(MenuChinhAvatar.dl, new co_0((ee_0)object), (ee_0)object, n3);
            vector2.addElement(object);
            ++n3;
            if (-"  ".length() < 0) continue;
            return;
        }
        fo.fo_do().cfr_renamed_4();
        String[] stringArray = new String[1];
        stringArray[0] = string;
        Vector[] vectorArray = new Vector[1];
        vectorArray[0] = vector2;
        fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
    }

    public final void (Vector vector != null) {
        AngelChip.var_java_util_Vector_do = vector;
        if (go_0.boolean_if(ff_0.cfr_renamed_1().dangChayAuto ? 1 : 0)) {
            ff_0.cfr_renamed_1();
            ff_0.cfr_renamed_2();
            return;
        }
        this.cfr_renamed_23();
    }
}

