/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from gD
 */
public final class gd_0
extends en
implements gl {
    private int cfr_renamed_3;
    public byte var_byte_do;
    public static gd_0 var_gd_0_do;
    private Vector var_java_util_Vector_do;
    private static final int[] mangSoNguyen;
    private et[] var_et_arr_do;
    private short var_short_do;
    private int cfr_renamed_4;
    private fl_0 var_fl_0_do;
    private short var_short_if;
    private fl_0 var_fl_0_if;
    private Image var_javax_microedition_lcdui_Image_do;
    private static short var_short_for;
    private fs var_fs_do;
    private fl_0 var_fl_0_for;
    private fs var_fs_if;
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    public static boolean dangChayAuto;
    private hr var_hr_do;
    private int[] var_int_arr_if;
    private Vector var_java_util_Vector_if;
    public int soLuong;
    private byte var_byte_if;
    private int cfr_renamed_8 = -1;
    public int var_int_if;
    private Vector var_java_util_Vector_for;
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    public int soLuongKhoa;
    private int cfr_renamed_14;
    private short[] var_short_arr_do;
    public static boolean coTrangThai;

    static void (gd_0 gd_02 == int n) {
        gd_02.cfr_renamed_14 = n;
    }

    static {
        gd_0.cfr_renamed_9();
        var_short_for = (short)0;
        coTrangThai = 0;
        dangChayAuto = 0;
    }

    private void cfr_renamed_13() {
        if (gd_0.boolean_do(this.cfr_renamed_7, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
            ((en)this).cfr_renamed_3 = go_0.go_0_do().var_fl_0_do;
            ((en)this).cfr_renamed_3.chuoiGiaTri = MenuChinhAvatar.cT;
            ((en)this).cfr_renamed_5 = this.var_fl_0_if;
            return;
        }
        ((en)this).cfr_renamed_5 = this.var_fl_0_if;
        if (gd_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            ((en)this).cfr_renamed_3 = go_0.go_0_do().var_fl_0_do;
        }
    }

        public final void cfr_renamed_2(String string) {
        if (gd_0.boolean_for(string.trim().equals("") ? 1 : 0)) {
            fn.fn_do().cfr_renamed_0(string);
        }
    }

    public final void (short s2 == String string) {
        GameCanvas.cfr_renamed_7();
        if (gd_0.boolean_for(s2)) {
            Vector<fl_0> vector = new Vector<fl_0>();
            vector.addElement(new fl_0(MenuChinhAvatar.bL, 50));
            vector.addElement(new fl_0(MenuChinhAvatar.aB, 51));
            GameCanvas.hienThongBaoPopup(string, vector);
            return;
        }
        GameCanvas.cfr_renamed_1(string);
        if (gd_0.boolean_do(s2, 2)) {
            fh.var_short_arr_if = this.var_short_arr_do;
        }
        this.var_short_arr_do = null;
        fs_0.cfr_renamed_1();
        AngelChip.duLieuNguoiChoi.var_short_for = (short)this.var_fs_do.soLuong;
        AngelChip.duLieuNguoiChoi.var_boolean_int = this.var_fs_do.var_int_if;
        ((en)this).cfr_renamed_3 = go_0.go_0_do().var_fl_0_do;
        fm.fm_do().void_do(70 + this.var_byte_do);
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

        public final void cfr_renamed_2() {
        int n = fo.var_int_if;
        int n2 = fo.var_int_try;
        fo.fo_do().void_if();
        this.cfr_renamed_1(this.var_java_util_Vector_if, this.var_java_util_Vector_do, this.cfr_renamed_3, this.var_byte_if);
        fo.var_int_if = n;
        fo.fo_do().cfr_renamed_13();
        n = fo.fo_do().var_java_util_Vector_arr_do[n].size();
        if ((n2 >= n)) {
            if (gd_0.boolean_int(n)) {
                n2 = n - 1;
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else {
                n2 = 0;
            }
        }
        fo.var_int_try = n2;
        fo.fo_do().cfr_renamed_8();
        GameCanvas.var_cg_0_do.void_do(fo.var_int_try);
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

        static int int_do(gd_0 gd_02) {
        return gd_02.cfr_renamed_9;
    }

    public final void (Graphics graphics == null) {
        Object object;
        GameCanvas.var_fh_do.cfr_renamed_2(graphics);
        if ((dangChayAuto ? 1 : 0 != null) && (GameCanvas.var_aa_do == null)) {
            gd_0 gd_02;
            block20: {
                object = graphics;
                gd_02 = this;
                if (gd_0.boolean_for(coTrangThai ? 1 : 0) && gd_0.boolean_do(this.soLuong, -1)) {
                    if ((this.cfr_renamed_8 != -1)) {
                        int n = 0;
                        do {
                            if ((n >= fh.var_short_arr_do.length)) {
                                fh.var_cu_0_do.cfr_renamed_1(gd_02.cfr_renamed_8, gd_02.cfr_renamed_6 * 24 * dF.cfr_renamed_12, gd_02.cfr_renamed_14 * 24 * dF.cfr_renamed_12, 0, 0, (Graphics)object);
                                break block20;
                            }
                            if (gd_0.boolean_for(gd_02.cfr_renamed_4) && (fh.var_short_arr_if[n] >=  (int)var_short_for) && (fh.var_short_arr_if[n] < gd_02.var_et_arr_do.length) && (!gd_0.boolean_do(gd_02.var_et_arr_do[fh.var_short_arr_if[n]].soLuong, -1) || !gd_0.boolean_do(gd_02.var_et_arr_do[fh.var_short_arr_if[n]].cfr_renamed_0, -1)) || gd_0.boolean_do(gd_02.cfr_renamed_4, 1) && (fh.var_short_arr_if[n] <  (int)var_short_for)) {
                                gd_02.cfr_renamed_1((Graphics)object, 2 + n % fh.var_short_if * 24, 2 + n / fh.var_short_if * 24, 0, 20);
                            }
                            ++n;
                            } while (((0xA ^ 0x21) & ~(0x10 ^ 0x3B)) == 0);
                        return;
                    }
                } else if ((this.cfr_renamed_8 != -1)) {
                    gs_0 gs_02 = (gs_0)aa_0.var_java_util_Vector_new.elementAt(this.cfr_renamed_8);
                    if ((gs_02.var_byte_do != 2) && (gs_02.var_byte_do != 4)) {
                        int n = 0;
                        while ((n < fh.var_short_arr_do.length)) {
                            if (gd_0.boolean_do(fh.var_short_arr_do[n], 80) && (!gd_0.boolean_do(n % fh.var_short_if, gd_02.cfr_renamed_6) || (n / fh.var_short_if != gd_02.cfr_renamed_14))) {
                                gd_02.cfr_renamed_1((Graphics)object, 2 + n % fh.var_short_if * 24, 2 + n / fh.var_short_if * 24, 0, 20);
                            }
                            ++n;
                            if ((0x26 ^ 0x22) != 0) continue;
                            return;
                        }
                    } else {
                        int n = 0;
                        while ((n < fh.var_short_arr_if.length)) {
                            if (gd_0.boolean_int(n) && (fh.var_short_arr_if[n] <  (int)var_short_for) && (fh.var_short_arr_if[n - fh.var_short_if] >=  (int)var_short_for)) {
                                gd_02.cfr_renamed_1((Graphics)object, 2 + n % fh.var_short_if * 24, 2 + n / fh.var_short_if * 24, 0, 20);
                            }
                            ++n;
                            if (" ".length() <= "  ".length()) continue;
                            return;
                        }
                    }
                }
            }
            gd_02.cfr_renamed_1((Graphics)object, gd_02.cfr_renamed_6 * 24, gd_02.cfr_renamed_14 * 24, 1, 24);
        }
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        if ((dangChayAuto ? 1 : 0 != null)) {
            if ((coTrangThai ? 1 : 0 != null) && (this.cfr_renamed_8 != -1)) {
                object = (gs_0)aa_0.var_java_util_Vector_new.elementAt(this.cfr_renamed_8);
                aa_0.cfr_renamed_1(graphics, object.cfr_renamed_5, (this.cfr_renamed_6 * 24 + object.cfr_renamed_2) * dF.cfr_renamed_12, (this.cfr_renamed_14 * 24 + object.cfr_renamed_3) * dF.cfr_renamed_12, 0);
            }
            if ((GameCanvas.var_aa_do == null)) {
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, (this.cfr_renamed_6 * 24 + 12) * dF.cfr_renamed_12, (this.cfr_renamed_14 * 24 + this.cfr_renamed_13) * dF.cfr_renamed_12, 33);
            }
            if ((this.cfr_renamed_4 != -1)) {
                GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, this.var_et_arr_do[this.cfr_renamed_8].chuoiGiaTri + "(" + GameCanvas.cfr_renamed_1(this.var_et_arr_do[this.cfr_renamed_8].cfr_renamed_0, this.var_et_arr_do[this.cfr_renamed_8].soLuong, 1) + ")", (this.cfr_renamed_6 * 24 + 12) * dF.cfr_renamed_12, (this.cfr_renamed_14 * 24 - 40) * dF.cfr_renamed_12, 2);
            }
            this.cfr_renamed_13 += 1;
            if (gd_0.boolean_if(this.cfr_renamed_13, 5)) {
                this.cfr_renamed_13 = 0;
            }
        }
        GameCanvas.hienThongBaoPopup(graphics);
        fh.cfr_renamed_1(graphics);
        TienIchGame.cfr_renamed_1(graphics);
    }

    /*
     * Unable to fully structure code
     */
    public final void (int var1_1, int var2_2, short var3_4, Vector var4_7 != null) {
        if ((var1_1 != null)) {
            var1_1 = 0;
            while ((var1_1 < var4_7.size())) {
                var2_3 = (DuLieuNguoiChoi)var4_7.elementAt(var1_1);
                var3_5 = fv_0.ef_do(var2_3.var_short_goto);
                if ((var2_3 != null) && (var3_5 != null)) {
                    var3_5.var_byte_catch = var2_3.var_byte_catch;
                }
                ++var1_1;
                return;
            }
            GameCanvas.cfr_renamed_7();
            this.cfr_renamed_8();
            return;
        }
        AngelChip.duLieuNguoiChoi.var_byte_catch = (byte)var2_2;
        go_0.go_0_do().cfr_renamed_4();
        if (!(this.var_hr_do == null)) ** GOTO lbl-1000
        this.hr_do();
        if (!(this.var_hr_do != null) || (var3_4 !=  (int)this.var_hr_do.var_short_do)) {
            if ((this.var_hr_do == null)) {
                this.var_hr_do = new hr();
                this.var_hr_do.var_short_do = var3_4;
            }
            var3_6 = ep_0.ep_0_do();
            var3_6.cfr_renamed_1(-73);
            var3_6.cfr_renamed_0();
            var2_2 = 0;
            if ((24 ^ 28) <= " ".length()) {
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = 1;
        }
        if ((var2_2 != null)) {
            if ((go_0.var_int_int != -1)) {
                ep_0.ep_0_do().cfr_renamed_4(go_0.var_int_int);
                go_0.var_int_int = -1;
                return;
            }
            GameCanvas.var_int_byte = 1;
            GameCanvas.cfr_renamed_7();
            return;
        }
        GameCanvas.var_int_byte = 1;
    }

    public final void (byte by2, int n, short[] sArray, byte by3, Vector vector, Vector object != null) {
        this.var_byte_do = by2;
        this.cfr_renamed_7 = n;
        this.var_java_util_Vector_for = vector;
        fh.var_short_if = by3;
        fh.var_short_do = (short)(sArray.length / by3);
        fh.var_short_arr_if = sArray;
        if (gd_0.boolean_do(this.var_byte_do, 4)) {
            GameCanvas.var_fh_do.void_do(111);
            if (" ".length() != " ".length()) {
                return;
            }
        } else {
            GameCanvas.var_fh_do.void_do(68 + this.var_byte_do);
        }
        fh.var_int_byte = -1;
        by2 = (byte)-1;
        n = 0;
        int n2 = 0;
        while ((n2 <  (int)by3)) {
            int n3 = 0;
            while ((n3 <  (int)fh.var_short_do)) {
                if ((fh.var_short_arr_if[n3 * by3 + n2] <  (int)var_short_for)) {
                    fh.var_short_arr_do[n3 * by3 + n2] = 80;
                    if ("   ".length() == "  ".length()) {
                        return;
                    }
                } else {
                    fh.var_short_arr_do[n3 * by3 + n2] = 88;
                }
                ++n3;
                if (-" ".length() <= 0) continue;
                return;
            }
            if (gd_0.boolean_do(fh.var_short_arr_if[(fh.var_short_do - 1) * by3 + n2], this.var_hr_do.var_javax_microedition_lcdui_Image_do.getHeight() / (24 * dF.cfr_renamed_12) - 1)) {
                fh.var_short_arr_if[(fh.var_short_do - 1) * by3 + n2] = fh.var_short_arr_if[(fh.var_short_do - 2) * by3 + n2];
                fh.var_short_arr_do[(fh.var_short_do - 1) * by3 + n2] = 21;
                ++n;
                if (gd_0.boolean_do(by2, -1)) {
                    by2 = (byte)(n2 * 24);
                }
            }
            ++n2;
            if ("   ".length() >= 0) continue;
            return;
        }
        this.var_fs_do = new fs(by2 + n * 24 / 2, fh.var_short_do * 24 - 30);
        AngelChip.duLieuNguoiChoi.var_short_for = (short)this.var_fs_do.soLuong;
        AngelChip.duLieuNguoiChoi.var_boolean_int = this.var_fs_do.var_int_if;
        dH dH2 = fh.dH_do(AngelChip.duLieuNguoiChoi.var_short_goto);
        if ((dH2 != null)) {
            dH2.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            dH2.cfr_renamed_2();
        }
        fm.fm_do().void_do(70 + this.var_byte_do);
        fh.var_cu_0_do = new cu_0(this.var_hr_do.var_javax_microedition_lcdui_Image_do, 24 * dF.cfr_renamed_12, 24 * dF.cfr_renamed_12);
        int n4 = 0;
        while (gd_0.cfr_renamed_3(n4, ((Vector)object).size())) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)((Vector)object).elementAt(n4);
            ef2.var_short_char = ef2.var_short_for;
            ef2.var_short_try = (short)(ef2.var_boolean_int ? 1 : 0);
            if ((ef2.var_short_goto !=  (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                fh.cfr_renamed_1(ef2);
            }
            ++n4;
            if (-" ".length() != (0x38 ^ 0x3C)) continue;
            return;
        }
        n4 = 0;
        int n5 = 0;
        n = 0;
        while ((n < this.var_java_util_Vector_for.size())) {
            bB bB2 = (bB)this.var_java_util_Vector_for.elementAt(n);
            if (gd_0.boolean_for(bB2.cfr_renamed_2) && gd_0.boolean_for(bB2.cfr_renamed_3)) {
                int n6 = 0;
                int n7 = 0;
                while ((n7 < fh.var_short_arr_if.length)) {
                    if (gd_0.boolean_do(fh.var_short_arr_do[n7], 80)) {
                        bB2.cfr_renamed_2 = n7 % fh.var_short_if * 24;
                        bB2.cfr_renamed_3 = n7 / fh.var_short_if * 24;
                        n4 = bB2.cfr_renamed_2;
                        n5 = bB2.cfr_renamed_3;
                        n6 = 1;
                        this.cfr_renamed_2(bB2);
                        ep_0.ep_0_do().cfr_renamed_1(bB2.cfr_renamed_0, 0, 0, bB2.cfr_renamed_2 / 24, bB2.cfr_renamed_3 / 24, bB2.var_byte_do);
                        if ((0x64 ^ 0x69 ^ (0x56 ^ 0x5F)) > 0) break;
                        return;
                    }
                    ++n7;
                    return;
                }
                if (gd_0.boolean_for(n6)) {
                    bB2.cfr_renamed_2 = n4;
                    bB2.cfr_renamed_3 = n5;
                    ep_0.ep_0_do().cfr_renamed_1(bB2.cfr_renamed_0, 0, 0, bB2.cfr_renamed_2 / 24, bB2.cfr_renamed_3 / 24, bB2.var_byte_do);
                }
            }
            if ((gd_0.boolean_if(bB2) ? 1 : 0 != null)) {
                bB2.cfr_renamed_3 += 1;
            }
            ++n;
            return;
        }
        go_0.go_0_do();
        go_0.cfr_renamed_8();
        Vector vector2 = this.var_java_util_Vector_for;
        object = this;
        n2 = 0;
        while ((n2 < vector2.size())) {
            bB bB3 = (bB)vector2.elementAt(n2);
            fh.var_java_util_Vector_char.addElement(bB3);
            ((gd_0)object).cfr_renamed_2(bB3);
            ++n2;
            if (" ".length() < (0x8F ^ 0x8B)) continue;
            return;
        }
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        this.cfr_renamed_4();
        GameCanvas.cfr_renamed_7();
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_4();
        this.cfr_renamed_13();
    }

    public static void cfr_renamed_3() {
        GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.aA, 101, 2);
    }

    public final void (Vector object, Vector object2, int n, byte by2 != null) {
        this.var_java_util_Vector_if = object;
        this.var_java_util_Vector_do = object2;
        this.cfr_renamed_3 = n;
        this.var_byte_if = by2;
        go_0.go_0_do();
        Vector vector = go_0.cfr_renamed_1((Vector)object, AngelChip.duLieuNguoiChoi.var_short_goto, 3);
        go_0.go_0_do();
        object2 = go_0.cfr_renamed_1((Vector)object2, AngelChip.duLieuNguoiChoi.var_short_goto, 2);
        if ((GameCanvas.var_en_do != ff_0.var_ff_0_do)) {
            fo.fo_do().coKichHoat = 1;
            String[] stringArray = new String[2];
            stringArray[0] = MenuChinhAvatar.M;
            stringArray[1] = MenuChinhAvatar.bh;
            Vector[] vectorArray = new Vector[2];
            vectorArray[0] = vector;
            vectorArray[1] = object2;
            fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
            object = go_0.go_0_do().cfr_renamed_1((Vector)object, 1, 1, 0);
            object2 = new fl_0(MenuChinhAvatar.bR, new eg_0());
            fo.fo_do().cfr_renamed_1((fl_0)object, 0);
            fo.fo_do().cfr_renamed_1((fl_0)object2, 1);
            if ((GameCanvas.var_en_do != fo.fo_do())) {
                fo.fo_do().cfr_renamed_4();
            }
        }
    }

    private static void cfr_renamed_9() {
        mangSoNguyen = new int[42];
        -1 = -" ".length();
        2 = "  ".length();
        0 = (0x66 ^ 0x2D) & ~(0xD2 ^ 0x99);
        1688583 = -(0xFFFFF6CB & 0x39FD) & (0xFFFFF7CF & 0x19FCFF);
        1 = " ".length();
        14744065 = -(0xFFFFE3F7 & 0x1D7B) & (0xFFFFFB7B & 0xE0FFF7);
        69 = 69 + 3 - 4 + 143 ^ 96 + 82 - 92 + 64;
        68 = 0x3E ^ 0x7A;
        3 = "   ".length();
        4 = 118 + 23 - 56 + 98 ^ 175 + 106 - 189 + 87;
        24 = 2 ^ 0x33 ^ (0x88 ^ 0xA1);
        16 = 0x55 ^ 0x45;
        5 = 23 + 69 - -43 + 14 ^ 134 + 94 - 125 + 41;
        27 = 0x95 ^ 0x8E;
        18 = 128 + 126 - 166 + 73 ^ 37 + 123 - 4 + 23;
        90 = 0xF6 ^ 0xAC;
        80 = 62 + 105 - -18 + 10 ^ 127 + 138 - 171 + 53;
        6 = 0xF3 ^ 0xB0 ^ (0x7C ^ 0x39);
        8 = 0x6E ^ 0x66;
        12 = 0xC2 ^ 0x85 ^ (0x71 ^ 0x3A);
        20 = 0x16 ^ 0x5E ^ (0x69 ^ 0x35);
        33 = 35 + 104 - 46 + 61 ^ 56 + 91 - 73 + 113;
        40 = 72 + 18 - -82 + 9 ^ 82 + 2 - 32 + 105;
        111 = 64 + 125 - 29 + 41 ^ 59 + 43 - -58 + 6;
        88 = 0xE7 ^ 0xBF;
        21 = 0x56 ^ 0x43;
        30 = 0x28 ^ 0x36;
        70 = 5 ^ 0x43;
        67 = 0x4A ^ 9;
        11 = 36 + 5 - 26 + 163 ^ 164 + 155 - 220 + 86;
        13 = 100 + 9 - 0 + 71 ^ 157 + 180 - 204 + 52;
        50 = 0x66 ^ 0x18 ^ (9 ^ 0x45);
        51 = 0x51 ^ 0x5A ^ (0x25 ^ 0x1D);
        112 = 0xFF ^ 0x8F;
        79 = 0xF ^ 0x40;
        -73 = -(0x56 ^ 0x18 ^ (0x66 ^ 0x61));
        -87 = -(0x55 ^ 2);
        7 = 0x75 ^ 0x72;
        100 = 0xED ^ 0x9F ^ (0x6E ^ 0x78);
        -43 = -(0xBD ^ 0xB6 ^ (0x49 ^ 0x69));
        53 = 119 + 12 - 65 + 119 ^ 139 + 0 - 93 + 94;
        101 = 211 + 43 - 146 + 137 ^ 18 + 24 - -79 + 23;
    }

    private void cfr_renamed_14() {
        ek_0.cfr_renamed_1();
        this.cfr_renamed_6 = AngelChip.duLieuNguoiChoi.var_short_for / 24;
        this.cfr_renamed_14 = AngelChip.duLieuNguoiChoi.var_boolean_int / 24;
        fh.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
    }

    static void (gd_0 gd_02 != int n) {
        gd_02.cfr_renamed_8 = n;
    }

    static void (gd_0 gd_02, int n, String string != null) {
        gs_0 gs_02 = (gs_0)aa_0.var_java_util_Vector_new.elementAt(n);
        if (gd_0.boolean_for(gd_02.cfr_renamed_1(gs_02) ? 1 : 0)) {
            GameCanvas.cfr_renamed_1(gs_02.soLuong, (int)gs_02.cfr_renamed_0, new fx_0(gd_02, gs_02, string), new gh(gd_02, gs_02, string), new ei_0(gd_02));
        }
    }

    static void (gd_0 gd_02 >= int n) {
        gd_02.cfr_renamed_5 = n;
    }

    static void void_do(gd_0 gd_02) {
        gd_02.cfr_renamed_12();
    }

    static void void_if(gd_0 gd_02) {
        gd_02.this();
    }

    public static void (byte by2, String string, String[] stringArray, short[] sArray, short[] sArray2, String[] stringArray2, String[] stringArray3, int[] nArray, short[] sArray3 != null) {
        go_0.go_0_do();
        go_0.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
        Vector<dn_0> vector = new Vector<dn_0>();
        int n = 0;
        while ((n < stringArray.length)) {
            int n2;
            eu eu2 = new eu(by2, sArray2[n], stringArray3[n]);
            String string2 = stringArray[n];
            short s2 = sArray[n];
            String string3 = stringArray2[n];
            if ((nArray == null)) {
                n2 = -1;
                if ("   ".length() <= " ".length()) {
                    return;
                }
            } else {
                n2 = nArray[n];
            }
            vector.addElement(new dn_0(MenuChinhAvatar.cT, eu2, n, string2, s2, string3, n2, sArray3[n]));
            ++n;
            if (" ".length() != ((0x32 ^ 0x6D) & ~(7 ^ 0x58))) continue;
            return;
        }
        if (gd_0.boolean_int(vector.size())) {
            fo.fo_do().cfr_renamed_4();
            fo.coTrangThai = 1;
            String[] stringArray4 = new String[1];
            stringArray4[0] = string;
            Vector[] vectorArray = new Vector[1];
            vectorArray[0] = vector;
            fo.fo_do().cfr_renamed_1(stringArray4, vectorArray, null);
        }
    }

    public gd_0() {
        this.var_byte_do = (byte)-1;
        this.cfr_renamed_4 = -1;
        this.soLuong = -1;
        this.cfr_renamed_5 = -1;
        this.cfr_renamed_9 = -1;
        int[] nArray = new int[2];
        nArray[0] = 1688583;
        nArray[1] = 14744065;
        this.var_int_arr_if = nArray;
        this.var_short_if = (short)69;
        this.var_short_do = (short)68;
        this.cfr_renamed_13 = 0;
        this.var_fl_0_for = new fl_0(MenuChinhAvatar.bV, 0);
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.aC, 1);
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.bR, 2);
        e.void_do(MenuChinhAvatar.bE);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("hand");
        e.cfr_renamed_1();
    }

    private void cfr_renamed_3(bB bB2) {
        int n = 0;
        int n2 = 0;
        while ((n2 < this.var_java_util_Vector_for.size())) {
            bB bB3 = (bB)this.var_java_util_Vector_for.elementAt(n2);
            if (gd_0.boolean_do(bB3.cfr_renamed_2 / 24, bB2.cfr_renamed_2 / 24) && gd_0.boolean_do(bB3.cfr_renamed_3 / 24, bB2.cfr_renamed_3 / 24)) {
                ++n;
            }
            ++n2;
            if ("  ".length() <= "  ".length()) continue;
            return;
        }
        if (gd_0.boolean_do(n, 1)) {
            gs_0 gs_02 = aa_0.gs_0_do((int)bB2.cfr_renamed_0);
            int n3 = 0;
            while ((n3 < gs_02.var_java_util_Vector_do.size())) {
                fs fs2 = (fs)gs_02.var_java_util_Vector_do.elementAt(n3);
                fh.var_short_arr_do[(bB2.cfr_renamed_3 / 24 + fs2.var_int_if) * fh.var_short_if + bB2.cfr_renamed_2 / 24 + fs2.soLuong] = 80;
                ++n3;
                if (((9 ^ 0x43) & ~(0x7A ^ 0x30)) == 0) continue;
                return;
            }
        }
    }

    static void (gd_0 gd_02 < int n) {
        gd_02.cfr_renamed_9 = n;
    }

        static int int_if(gd_0 gd_02) {
        return gd_02.cfr_renamed_6;
    }

    private void this() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = 0;
        while ((n < aa_0.var_java_util_Vector_new.size())) {
            int n2;
            Object object = (gs_0)aa_0.var_java_util_Vector_new.elementAt(n);
            if (gd_0.cfr_renamed_1(((gs_0)object).var_byte_do) && ((this.var_byte_do != 4) && (!gd_0.cfr_renamed_4(((gs_0)object).var_byte_do, 1) || !gd_0.cfr_renamed_4(((gs_0)object).var_byte_do, 2)) || gd_0.boolean_do(this.var_byte_do, 4)) && gd_0.cfr_renamed_4(n2 = ((gs_0)object).chuoiGiaTri.indexOf(":"), -1)) {
                int n3 = 0;
                object = ((gs_0)object).chuoiGiaTri.substring(0, n2);
                n2 = 0;
                while ((n2 < vector.size())) {
                    if (gd_0.cfr_renamed_1(((fl_0)vector.elementAt((int)n2)).chuoiGiaTri.equals(object) ? 1 : 0)) {
                        n3 = 1;
                    }
                    ++n2;
                    return;
                }
                if (!(n3 != null) || (vector.isEmpty() ? 1 : 0 != null)) {
                    vector.addElement(new fl_0((String)object, 18, n));
                }
            }
            ++n;
            if ("  ".length() != 0) continue;
            return;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public final void cfr_renamed_5() {
        this.var_java_util_Vector_do = null;
        this.var_java_util_Vector_if = null;
        fn.fn_do().cfr_renamed_3(21, 0);
        fh.var_int_byte = -1;
    }

    static void void_for(gd_0 gd_02) {
        gd_02.cfr_renamed_15();
    }

    public final void void_int(int n) {
        cs_0.cfr_renamed_1().cfr_renamed_1(n, this);
        super.void_int(n);
    }

    public final void void_do(bB bB2) {
        if ((gd_0.boolean_if(bB2) ? 1 : 0 != null)) {
            bB2.cfr_renamed_3 += 1;
        }
        this.var_java_util_Vector_for.addElement(bB2);
        fh.var_java_util_Vector_char.addElement(bB2);
        this.cfr_renamed_2(bB2);
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        }

    static void void_int(gd_0 gd_02) {
        gd_02.cfr_renamed_14();
    }

    static void (gd_0 gd_02 != int n) {
        gd_02.cfr_renamed_6 = n;
    }

    static fs fs_do(gd_0 gd_02) {
        return gd_02.var_fs_if;
    }

        private hr hr_do() {
        DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avatarTileMap");
        if ((dataInputStream == null)) {
            return null;
        }
        this.var_hr_do = new hr();
        try {
            this.var_hr_do.var_short_do = dataInputStream.readShort();
            var_short_for = dataInputStream.readShort();
            byte[] byArray = new byte[dataInputStream.available()];
            dataInputStream.read(byArray);
            this.var_hr_do.var_javax_microedition_lcdui_Image_do = hg.javax_microedition_lcdui_Image_do(byArray);
            dataInputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return this.var_hr_do;
    }

    public final void (Graphics graphics != null) {
        this.cfr_renamed_0(graphics);
        super.cfr_renamed_1(graphics);
    }

    static boolean (gd_0 gd_02 == gs_0 gs_02) {
        return gd_02.cfr_renamed_1(gs_02);
    }

    static int int_for(gd_0 gd_02) {
        return gd_02.cfr_renamed_5;
    }

    public final void cfr_renamed_8() {
        if ((fv_0.var_java_util_Vector_do == null)) {
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_2();
            fv_0.var_byte_do = (byte)2;
            return;
        }
        if ((fv_0.dangChayAuto ? 1 : 0 != null)) {
            fv_0.dangChayAuto = 0;
            GameCanvas.cfr_renamed_8();
            ep_0.ep_0_do().cfr_renamed_6(1);
            return;
        }
        Vector<DuLieuNguoiChoi> vector = new Vector<DuLieuNguoiChoi>();
        int n = 0;
        while ((n < fv_0.var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_do.elementAt(n);
            if (gd_0.boolean_do(ef2.var_byte_catch, (int)this.var_byte_do)) {
                vector.addElement(ef2);
            }
            ++n;
            if (((0x54 ^ 0x45) & ~(0x4F ^ 0x5E)) == 0) continue;
            return;
        }
        if ((vector.isEmpty() ? 1 : 0 != null)) {
            if ((GameCanvas.var_en_do == fv_0.cfr_renamed_1())) {
                fv_0.cfr_renamed_1().var_en_do.cfr_renamed_4();
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_24);
            return;
        }
        fv_0.cfr_renamed_1().cfr_renamed_4();
        fv_0.var_java_util_Vector_if = vector;
        fv_0.cfr_renamed_1().cfr_renamed_8();
        fv_0.cfr_renamed_1().cfr_renamed_3();
    }

        public final void void_if() {
        go_0.go_0_do().cfr_renamed_15();
    }

    private void cfr_renamed_12() {
        this.soLuong = -1;
        this.cfr_renamed_8 = -1;
        dangChayAuto = 0;
        coTrangThai = 0;
        this.cfr_renamed_13();
        ((en)this).cfr_renamed_4 = null;
        if ((fh.ef_do(AngelChip.duLieuNguoiChoi.var_short_goto) == null)) {
            this.cfr_renamed_21();
        }
    }

    private void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        graphics.setColor(this.var_int_arr_if[n3]);
        graphics.drawRect(n * dF.cfr_renamed_12, n2 * dF.cfr_renamed_12, (n4 - 1) * dF.cfr_renamed_12, (n4 - 1) * dF.cfr_renamed_12);
    }

    public final void cfr_renamed_7() {
        go_0.go_0_do().cfr_renamed_7();
        if (gd_0.boolean_for(dangChayAuto ? 1 : 0) && gd_0.boolean_for(coTrangThai ? 1 : 0) && gd_0.cfr_renamed_0(((en)this).cfr_renamed_4) && (go_0.go_0_do().var_java_util_Vector_new != null)) {
            ((en)this).cfr_renamed_4 = fh.var_fl_0_do;
        }
    }

    static boolean boolean_do(bB bB2) {
        return gd_0.boolean_if(bB2);
    }

    public final void void_if(int n, int n2) {
        bB bB2;
        int n3 = -1;
        int n4 = 0;
        while ((n4 < this.var_java_util_Vector_for.size())) {
            bB2 = (bB)this.var_java_util_Vector_for.elementAt(n4);
            if (gd_0.boolean_do(bB2.cfr_renamed_2 / 24, this.cfr_renamed_6) && gd_0.boolean_do(bB2.cfr_renamed_3 / 24, this.cfr_renamed_14)) {
                n3 = n4;
                if (((0xA2 ^ 0xBB) & ~(0x11 ^ 8)) == 0) break;
                return;
            }
            ++n4;
            if (-"  ".length() <= 0) continue;
            return;
        }
        bB2 = null;
        if ((n3 != -1)) {
            bB2 = (bB)this.var_java_util_Vector_for.elementAt(n3);
        }
        switch (n) {
            case 1: {
                ft_0 ft_02 = ft_0.ft_0_do();
                ft_02.cfr_renamed_1(-87);
                ft_02.cfr_renamed_0();
                return;
            }
            case 2: {
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0(MenuChinhAvatar.o, 6));
                vector.addElement(new fl_0(MenuChinhAvatar.ah, 7));
                if (gd_0.boolean_int(this.var_java_util_Vector_for.size())) {
                    vector.addElement(new fl_0(MenuChinhAvatar.q, 8));
                }
                aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
                return;
            }
            case 3: {
                gd_0.cfr_renamed_18();
                return;
            }
            case 4: {
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.aA + ":", 100, 2);
                return;
            }
            case 5: {
                go_0.go_0_do().cfr_renamed_15();
                return;
            }
            case 6: {
                this.this();
                return;
            }
            case 7: {
                dangChayAuto = 1;
                if ((this.var_et_arr_do == null)) {
                    if ((this.var_et_arr_do == null)) {
                        ek_0.cfr_renamed_1();
                        ep_0 ep_02 = ep_0.ep_0_do();
                        ep_02.cfr_renamed_1(-43);
                        ep_02.cfr_renamed_0();
                        GameCanvas.cfr_renamed_8();
                    }
                    return;
                }
                this.cfr_renamed_10();
                return;
            }
            case 8: {
                this.cfr_renamed_15();
                return;
            }
            default: {
                return;
            }
            case 11: {
                if (gd_0.boolean_do(n3, -1)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cw);
                    return;
                }
                this.soLuong = n3;
                n = 0;
                while ((n < aa_0.var_java_util_Vector_new.size())) {
                    if (gd_0.boolean_do(((gs_0)aa_0.var_java_util_Vector_new.elementAt((int)n)).cfr_renamed_4, (int)bB2.cfr_renamed_0)) {
                        this.cfr_renamed_8 = n;
                        if ("  ".length() >= 0) break;
                        return;
                    }
                    ++n;
                    if (((0xC ^ 0x6C) & ~(0x4E ^ 0x2E)) <= 0) continue;
                    return;
                }
                ((en)this).cfr_renamed_5 = null;
                ((en)this).cfr_renamed_4 = null;
                this.cfr_renamed_3(bB2);
                this.var_fs_if = new fs(this.cfr_renamed_6, this.cfr_renamed_14, bB2.cfr_renamed_0);
                ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.ct, new bO(this, bB2));
                return;
            }
            case 12: {
                if (gd_0.boolean_do(n3, -1)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cw);
                    return;
                }
                if (gd_0.boolean_for(bB2.var_byte_do)) {
                    bB2.var_byte_do = (byte)2;
                    if (((0x3F ^ 0xE) & ~(0x4F ^ 0x7E)) != 0) {
                        return;
                    }
                } else {
                    bB2.var_byte_do = (byte)0;
                }
                ep_0.ep_0_do().cfr_renamed_1(bB2.cfr_renamed_0, this.cfr_renamed_6, this.cfr_renamed_14, this.cfr_renamed_6, this.cfr_renamed_14, bB2.var_byte_do);
                return;
            }
            case 13: {
                if ((n3 != -1) && (bB2.cfr_renamed_0 !=  (int)this.var_short_if)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_22, new dv(bB2));
                    return;
                }
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cw);
                return;
            }
            case 14: {
                fo.fo_do().void_if();
                GameCanvas.void_do(MenuChinhAvatar.dc, 53);
                return;
            }
            case 15: {
                ey_0[] ey_0Array = new ey_0[3];
                n2 = 0;
                while ((n2 < 3)) {
                    ey_0Array[n2] = new ey_0();
                    ey_0Array[n2].void_do(2);
                    ++n2;
                    if ((0x6D ^ 0x69) >= ((0x6D ^ 0x2F) & ~(0x50 ^ 0x12))) continue;
                    return;
                }
                ey_0Array[0].cfr_renamed_0(1);
                fl_0 fl_02 = new fl_0(MenuChinhAvatar.aC, new bn_0(ey_0Array));
                fo.fo_do().void_if();
                el.cfr_renamed_1().cfr_renamed_1(ey_0Array, MenuChinhAvatar.aj, MenuChinhAvatar.var_java_lang_String_arr_arr_for, fl_02);
                GameCanvas.var_ez_do = el.cfr_renamed_1();
                el.cfr_renamed_1().cfr_renamed_5 = (int)new fl_0(MenuChinhAvatar.by, 8);
                return;
            }
            case 16: {
                if (!(n2 < fh.var_java_util_Vector_case.size())) break;
                dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n2);
                ep_0.ep_0_do().cfr_renamed_5(dd_02.cfr_renamed_9);
                return;
            }
            case 17: {
                n = 0;
                while ((n < this.var_et_arr_do.length)) {
                    if (gd_0.boolean_do(n, n2)) {
                        if ((this.cfr_renamed_5 != -1)) {
                            this.cfr_renamed_6 = this.cfr_renamed_5;
                            this.cfr_renamed_14 = this.cfr_renamed_9;
                            AngelChip.duLieuNguoiChoi.var_short_for = (short)(this.cfr_renamed_5 * 24);
                            AngelChip.duLieuNguoiChoi.var_boolean_int = this.cfr_renamed_9 * 24;
                            fm.fm_do().void_do(AngelChip.duLieuNguoiChoi.var_short_for * dF.cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_boolean_int * dF.cfr_renamed_12);
                        }
                        this.cfr_renamed_8 = n;
                        if ((this.cfr_renamed_8 <  (int)var_short_for)) {
                            this.cfr_renamed_4 = 1;
                            if ((0x1B ^ 0x1F) < 0) {
                                return;
                            }
                        } else {
                            this.cfr_renamed_4 = 0;
                        }
                    }
                    ++n;
                    if ((0xC1 ^ 0xC4) > 0) continue;
                    return;
                }
                return;
            }
            case 18: {
                n = 0;
                while ((n < aa_0.var_java_util_Vector_new.size())) {
                    if (gd_0.boolean_do(n, n2)) {
                        Object object = (gs_0)aa_0.var_java_util_Vector_new.elementAt(n);
                        if (gd_0.cfr_renamed_1(((gs_0)object).var_byte_do) && ((this.var_byte_do != 4) && (!gd_0.cfr_renamed_4(((gs_0)object).var_byte_do, 1) || !gd_0.cfr_renamed_4(((gs_0)object).var_byte_do, 2)) || gd_0.boolean_do(this.var_byte_do, 4)) && gd_0.cfr_renamed_4(n4 = ((gs_0)object).chuoiGiaTri.indexOf(":"), -1)) {
                            object = ((gs_0)object).chuoiGiaTri.substring(0, n4);
                            this.cfr_renamed_1((String)object);
                        }
                    }
                    ++n;
                    if (((142 + 70 - 27 + 49 ^ 79 + 57 - 126 + 157) & (142 + 146 - 47 + 14 ^ 30 + 136 - 140 + 152 ^ -" ".length())) <= ((10 + 83 - 17 + 141 ^ 30 + 88 - 15 + 52) & (0x5E ^ 0x7F ^ (0x5E ^ 0x3D) ^ -" ".length()))) continue;
                    return;
                }
                break block0;
            }
        }
    }

        private void cfr_renamed_15() {
        ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 3);
        ((en)this).cfr_renamed_4 = new fl_0(MenuChinhAvatar.aC, 4);
        ((en)this).cfr_renamed_5 = null;
        dangChayAuto = 1;
        this.cfr_renamed_6 = AngelChip.duLieuNguoiChoi.var_short_for / 24;
        this.cfr_renamed_14 = AngelChip.duLieuNguoiChoi.var_boolean_int / 24;
        fh.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
    }

    private boolean (gs_0 gs_02 != null) {
        if ((gs_02.var_byte_do != 2) && (gs_02.var_byte_do != 4)) {
            if ((fh.var_short_arr_do[this.cfr_renamed_14 * fh.var_short_if + this.cfr_renamed_6] != 80)) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.P);
                return 1;
            }
            int n = 0;
            while ((n < gs_02.var_java_util_Vector_do.size())) {
                fs fs2 = (fs)gs_02.var_java_util_Vector_do.elementAt(n);
                if ((fh.var_short_arr_do[(this.cfr_renamed_14 + fs2.var_int_if) * fh.var_short_if + this.cfr_renamed_6 + fs2.soLuong] != 80)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.P);
                    return 1;
                }
                ++n;
                if (" ".length() != 0) continue;
                return ((0x1B ^ 0x29 ^ (9 ^ 0x31)) & (114 + 68 - 172 + 121 ^ 27 + 129 - 120 + 101 ^ -" ".length())) != 0;
            }
            if (((0x8F ^ 0xBE) & ~(0x8A ^ 0xBB)) != 0) {
                return ((0x9E ^ 0xA9) & ~(4 ^ 0x33)) != 0;
            }
        } else {
            String string = "";
            int n = 0;
            while ((n < this.var_java_util_Vector_for.size())) {
                bB bB2 = (bB)this.var_java_util_Vector_for.elementAt(n);
                if ((n != this.soLuong) && gd_0.boolean_do(bB2.cfr_renamed_0, (int)gs_02.cfr_renamed_4) && gd_0.boolean_do(this.cfr_renamed_6, bB2.cfr_renamed_2 / 24) && gd_0.boolean_do(this.cfr_renamed_14, bB2.cfr_renamed_3 / 24)) {
                    string = MenuChinhAvatar.r;
                    if ("  ".length() >= -" ".length()) break;
                    return ((0xB4 ^ 0x83) & ~(0x4D ^ 0x7A)) != 0;
                }
                ++n;
                if (-" ".length() <= -" ".length()) continue;
                return ((0xDF ^ 0x88) & ~(0x7A ^ 0x2D)) != 0;
            }
            if (gd_0.boolean_for(string.equals("") ? 1 : 0)) {
                GameCanvas.cfr_renamed_1(string);
                return 1;
            }
            if (!((gs_02.var_byte_do != 2) && !gd_0.boolean_do(gs_02.var_byte_do, 4) || (fh.var_short_arr_if[n = (this.cfr_renamed_14 - 1) * fh.var_short_if + this.cfr_renamed_6] >=  (int)var_short_for) && !(fh.var_short_arr_if[this.cfr_renamed_14 * fh.var_short_if + this.cfr_renamed_6] >=  (int)var_short_for))) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.d);
                return 1;
            }
        }
        return 0;
    }

    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        if (gd_0.boolean_for(dangChayAuto ? 1 : 0)) {
            GameCanvas.var_fh_do.cfr_renamed_1();
            AngelChip.duLieuNguoiChoi.cfr_renamed_2();
            return;
        }
        int n = 0;
        if ((GameCanvas.boolean_do(2) ? 1 : 0 != null)) {
            if (gd_0.boolean_for(gd_0.cfr_renamed_5(this.cfr_renamed_6, this.cfr_renamed_14 - 1) ? 1 : 0)) {
                this.cfr_renamed_14 -= 1;
            }
            if ((this.cfr_renamed_14 == null)) {
                this.cfr_renamed_14 = 0;
            }
            n = 1;
            if (-" ".length() > -" ".length()) {
                return;
            }
        } else if ((GameCanvas.boolean_do(4) ? 1 : 0 != null)) {
            if (gd_0.boolean_for(gd_0.cfr_renamed_5(this.cfr_renamed_6 - 1, this.cfr_renamed_14) ? 1 : 0)) {
                this.cfr_renamed_6 -= 1;
            }
            if ((this.cfr_renamed_6 == null)) {
                this.cfr_renamed_6 = 0;
            }
            n = 1;
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = dd_0.var_byte_try;
            if (-"   ".length() > 0) {
                return;
            }
        } else if ((GameCanvas.boolean_do(6) ? 1 : 0 != null)) {
            if (gd_0.boolean_for(gd_0.cfr_renamed_5(this.cfr_renamed_6 + 1, this.cfr_renamed_14) ? 1 : 0)) {
                this.cfr_renamed_6 += 1;
            }
            if ((this.cfr_renamed_6 >=  (int)fh.var_short_if)) {
                this.cfr_renamed_6 = fh.var_short_if - 1;
            }
            n = 1;
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = 0;
            if ("  ".length() == 0) {
                return;
            }
        } else if ((GameCanvas.boolean_do(8) ? 1 : 0 != null)) {
            if (gd_0.boolean_for(gd_0.cfr_renamed_5(this.cfr_renamed_6, this.cfr_renamed_14 + 1) ? 1 : 0)) {
                this.cfr_renamed_14 += 1;
            }
            if ((this.cfr_renamed_14 >=  (int)fh.var_short_do)) {
                this.cfr_renamed_14 = fh.var_short_do - 1;
            }
            n = 1;
        }
        if ((GameCanvas.var_boolean_new ? 1 : 0 != null)) {
            n = (fm.fm_do().cfr_renamed_3 + GameCanvas.var_int_try) / (fh.var_int_int * dF.cfr_renamed_12);
            int n2 = (fm.fm_do().cfr_renamed_2 + GameCanvas.soLuong) / (fh.var_int_int * dF.cfr_renamed_12);
            if (gd_0.boolean_do(n, this.cfr_renamed_6) && gd_0.boolean_do(n2, this.cfr_renamed_14) && gd_0.cfr_renamed_1(((en)this).cfr_renamed_3)) {
                ((en)this).cfr_renamed_3.cfr_renamed_0();
            }
            this.cfr_renamed_6 = n;
            this.cfr_renamed_14 = n2;
            n = 1;
            GameCanvas.var_boolean_new = 0;
        }
        if ((n != null)) {
            AngelChip.duLieuNguoiChoi.var_short_for = (short)(this.cfr_renamed_6 * 24 + 12);
            AngelChip.duLieuNguoiChoi.var_boolean_int = this.cfr_renamed_14 * 24 + 12;
            if ((this.soLuong != -1) && gd_0.boolean_int(this.var_java_util_Vector_for.size())) {
                bB bB2 = (bB)this.var_java_util_Vector_for.elementAt(this.soLuong);
                ((bB)this.var_java_util_Vector_for.elementAt(this.soLuong)).cfr_renamed_2 = this.cfr_renamed_6 * 24;
                bB2.cfr_renamed_3 = this.cfr_renamed_14 * 24;
                fh.cfr_renamed_1(fh.var_java_util_Vector_char);
                }
        }
    }

    public final void void_if(bB bB2) {
        block5: {
            gd_0 gd_02 = this;
            int n = 0;
            do {
                if ((n >= gd_02.var_java_util_Vector_for.size())) {
                    bB2 = null;
                    if ((6 ^ 3) == 0) {
                        return;
                    }
                    break block5;
                }
                bB bB3 = (bB)gd_02.var_java_util_Vector_for.elementAt(n);
                if (gd_0.boolean_do(bB3.cfr_renamed_2 / 24, bB2.cfr_renamed_2) && gd_0.boolean_do(bB3.cfr_renamed_3 / 24, bB2.cfr_renamed_3) && gd_0.boolean_do(bB3.cfr_renamed_0, (int)bB2.cfr_renamed_0)) {
                    bB2 = bB3;
                    break block5;
                }
                ++n;
                } while ("   ".length() < (0xAF ^ 0xAB));
            return;
        }
        fh.var_java_util_Vector_char.removeElement(bB2);
        this.var_java_util_Vector_for.removeElement(bB2);
        this.cfr_renamed_3(bB2);
        fs_0.cfr_renamed_1();
        GameCanvas.cfr_renamed_7();
    }

    public static gd_0 gd_0_do() {
        if (gd_0.cfr_renamed_0((Object)var_gd_0_do)) {
            var_gd_0_do = new gd_0();
        }
        return var_gd_0_do;
    }

    private void cfr_renamed_21() {
        fh.cfr_renamed_1(AngelChip.duLieuNguoiChoi);
        AngelChip.duLieuNguoiChoi.var_short_for = (short)this.var_fs_do.soLuong;
        AngelChip.duLieuNguoiChoi.var_boolean_int = this.var_fs_do.var_int_if;
        AngelChip.duLieuNguoiChoi.var_short_for = (short)0;
        fm.fm_do().void_do(this.var_fs_do.soLuong * dF.cfr_renamed_12, this.var_fs_do.var_int_if * dF.cfr_renamed_12);
    }

    private void cfr_renamed_10() {
        this.cfr_renamed_14();
        if ((this.var_short_arr_do == null)) {
            this.var_short_arr_do = new short[fh.var_short_arr_if.length];
            int n = 0;
            while ((n < fh.var_short_arr_if.length)) {
                this.var_short_arr_do[n] = fh.var_short_arr_if[n];
                ++n;
                if (-" ".length() < ((0xDA ^ 0x96 ^ (0xDC ^ 0x99)) & (0x47 ^ 0x19 ^ (0x13 ^ 0x44) ^ -" ".length()))) continue;
                return;
            }
        }
        coTrangThai = 0;
        ((en)this).cfr_renamed_3 = this.var_fl_0_for;
        ((en)this).cfr_renamed_4 = this.var_fl_0_do;
        ((en)this).cfr_renamed_5 = new fl_0(MenuChinhAvatar.cT, 5);
        Vector<be_0> vector = new Vector<be_0>();
        int n = 0;
        while ((n < this.var_et_arr_do.length)) {
            if (!gd_0.boolean_do(this.var_et_arr_do[n].cfr_renamed_0, -1) || (this.var_et_arr_do[n].soLuong != -1)) {
                vector.addElement(new be_0(this.var_et_arr_do[n].chuoiGiaTri + "(" + GameCanvas.cfr_renamed_1(this.var_et_arr_do[n].cfr_renamed_0, this.var_et_arr_do[n].soLuong, 1) + ")", n, n));
            }
            ++n;
            if (" ".length() >= ("   ".length() & ~"   ".length())) continue;
            return;
        }
        if (gd_0.boolean_int(vector.size())) {
            aq.cfr_renamed_1().cfr_renamed_1(vector, GameCanvas.cfr_renamed_15, 27 * dF.cfr_renamed_12, 27 * dF.cfr_renamed_12);
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (gd_0.boolean_do(this.cfr_renamed_8, -1)) {
                    return;
                }
                n2 = this.cfr_renamed_14 * fh.var_short_if + this.cfr_renamed_6;
                if (gd_0.boolean_do(this.var_et_arr_do[fh.var_short_arr_if[n2]].soLuong, -1) && gd_0.boolean_do(this.var_et_arr_do[fh.var_short_arr_if[n2]].cfr_renamed_0, -1)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.P);
                    return;
                }
                if (!((this.cfr_renamed_8 <  (int)var_short_for) && !(fh.var_short_arr_if[n2] <  (int)var_short_for) || (this.cfr_renamed_8 >=  (int)var_short_for) && !(fh.var_short_arr_if[n2] >=  (int)var_short_for))) {
                    this.cfr_renamed_5 = this.cfr_renamed_6;
                    this.cfr_renamed_9 = this.cfr_renamed_14;
                    fh.var_short_arr_if[this.cfr_renamed_14 * fh.var_short_if + this.cfr_renamed_6] = (short)this.cfr_renamed_8;
                    return;
                }
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.P);
                return;
            }
            case 1: {
                this.cfr_renamed_8 = -1;
                this.cfr_renamed_4 = -1;
                this.cfr_renamed_5 = -1;
                this.cfr_renamed_9 = -1;
                n = 0;
                n2 = 0;
                while ((n2 < this.var_short_arr_do.length)) {
                    if ((this.var_short_arr_do[n2] !=  (int)fh.var_short_arr_if[n2])) {
                        n = 1;
                        if (null == null) break;
                        return;
                    }
                    ++n2;
                    if ("   ".length() > "  ".length()) continue;
                    return;
                }
                if ((n != null)) {
                    ep_0.ep_0_do().cfr_renamed_1(fh.var_short_arr_if, 0);
                    GameCanvas.cfr_renamed_8();
                }
                this.cfr_renamed_21();
                dangChayAuto = 0;
                this.cfr_renamed_13();
                ((en)this).cfr_renamed_4 = null;
                return;
            }
            case 2: {
                Vector<fl_0> vector = new Vector<fl_0>();
                if ((AutoController.nhiemVuHienTai != null)) {
                    vector.addElement(new fl_0("Tắt Auto", 4, go_0.go_0_do()));
                }
                if (gd_0.boolean_do(this.cfr_renamed_7, (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    vector.addElement(new fl_0(MenuChinhAvatar.bh, 1));
                    vector.addElement(new fl_0(MenuChinhAvatar.bP, 2));
                    n = 0;
                    n2 = 0;
                    while ((n2 < fh.var_java_util_Vector_case.size())) {
                        if (gd_0.boolean_for(((bm)fh.var_java_util_Vector_case.elementAt((int)n2)).var_byte_if)) {
                            ++n;
                        }
                        ++n2;
                        if ((19 + 70 - 57 + 95 ^ (0xC0 ^ 0xBB)) >= -" ".length()) continue;
                        return;
                    }
                    if (gd_0.boolean_if(n, 1)) {
                        vector.addElement(new fl_0(MenuChinhAvatar.aM, 3));
                    }
                    vector.addElement(new fl_0(MenuChinhAvatar.bs, 4));
                }
                if ((AutoController.nhiemVuHienTai == null)) {
                    vector.addElement(new fl_0("Auto Hôn", 67, go_0.go_0_do()));
                    vector.addElement(new fl_0("Auto Đánh", 68, go_0.go_0_do()));
                }
                vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_34, 5));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 3: {
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0(MenuChinhAvatar.bY, 11));
                vector.addElement(new fl_0(MenuChinhAvatar.p, 12));
                vector.addElement(new fl_0(MenuChinhAvatar.var_java_lang_String_byte, 13));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
                aq aq2 = aq.cfr_renamed_1();
                n2 = this.cfr_renamed_6 * 24 * dF.cfr_renamed_12 - fm.fm_do().cfr_renamed_3 - aq.cfr_renamed_1().var_int_if / 2 + 12;
                int n3 = this.cfr_renamed_14 * 24 * dF.cfr_renamed_12 - fm.fm_do().cfr_renamed_2 - aq.cfr_renamed_1().soLuong - 12;
                aq aq3 = aq2;
                aq2.cfr_renamed_3 = n2;
                aq3.soLuongKhoa = n3;
                if ((aq3.cfr_renamed_3 == null)) {
                    aq3.cfr_renamed_3 = 0;
                }
                if ((aq3.soLuongKhoa == null)) {
                    aq3.soLuongKhoa = 0;
                }
                return;
            }
            case 4: {
                this.cfr_renamed_12();
                return;
            }
            case 5: {
                this.cfr_renamed_10();
                return;
            }
            case 8: {
                el.cfr_renamed_1();
                GameCanvas.var_ez_do = null;
                return;
            }
            case 50: {
                ep_0.ep_0_do().cfr_renamed_1(fh.var_short_arr_if, 1);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 51: {
                fh.var_short_arr_if = this.var_short_arr_do;
                this.var_short_arr_do = null;
                fs_0.cfr_renamed_1();
                return;
            }
            case 53: {
                ft_0.ft_0_do().cfr_renamed_8(0);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 100: {
                ep_0.ep_0_do().cfr_renamed_1(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do(), 0, 0);
                GameCanvas.cfr_renamed_7();
                return;
            }
            case 101: {
                ft_0.ft_0_do().cfr_renamed_0(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
            }
        }
    }

        private static boolean boolean_if(bB bB2) {
        int n;
        if (gd_0.cfr_renamed_4(aa_0.gs_0_do((int)bB2.cfr_renamed_0).var_byte_do, 2) && gd_0.cfr_renamed_4(aa_0.gs_0_do((int)bB2.cfr_renamed_0).var_byte_do, 4) && (fh.var_short_arr_if[n = (bB2.cfr_renamed_3 / 24 - 1) * fh.var_short_if + bB2.cfr_renamed_2 / 24] >=  (int)var_short_for) && (fh.var_short_arr_if[bB2.cfr_renamed_3 / 24 * fh.var_short_if + bB2.cfr_renamed_2 / 24] <  (int)var_short_for)) {
            return 1;
        }
        return 0;
    }

        private static void cfr_renamed_18() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = 0;
        while ((n < fh.var_java_util_Vector_case.size())) {
            dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n);
            if (gd_0.boolean_for(dd_02.cfr_renamed_0 ? 1 : 0) && (dd_02.cfr_renamed_9 !=  (int)AngelChip.duLieuNguoiChoi.var_short_goto)) {
                vector.addElement(new fl_0(dd_02.chuoiGiaTri, 16, n));
            }
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    private static boolean boolean_for(int n) {
        return n == 0;
    }

    public final void (byte[] byArray == int n) {
        var_short_for = (short)n;
        this.var_hr_do.var_javax_microedition_lcdui_Image_do = hg.javax_microedition_lcdui_Image_do(byArray);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(this.var_hr_do.var_short_do);
            dataOutputStream.writeShort(n);
            dataOutputStream.write(byArray);
            hg.cfr_renamed_1("avatarTileMap", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (((0x7A ^ 0x12 ^ (0x60 ^ 0x11)) & (40 + 3 - -23 + 71 ^ 75 + 62 - 4 + 11 ^ -" ".length())) != ((0x2A ^ 0x38 ^ (0xF ^ 0x5F)) & (0xD3 ^ 0xA4 ^ (0x4C ^ 0x79) ^ -" ".length()))) {
            return;
        }
        if ((go_0.var_int_int != -1)) {
            ep_0.ep_0_do().cfr_renamed_4(go_0.var_int_int);
            go_0.var_int_int = -1;
            return;
        }
        GameCanvas.cfr_renamed_7();
    }

    private void (String string != null) {
        this.cfr_renamed_12();
        Vector<bb_0> vector = new Vector<bb_0>();
        int n = 0;
        while ((n < aa_0.var_java_util_Vector_new.size())) {
            gs_0 gs_02 = (gs_0)aa_0.var_java_util_Vector_new.elementAt(n);
            int n2 = gs_02.chuoiGiaTri.indexOf(string);
            if ((gs_02.var_byte_do != null) && (n2 != -1) && ((this.var_byte_do != 4) && (!(gs_02.var_byte_do != 1) || !(gs_02.var_byte_do != 2)) || gd_0.boolean_do(this.var_byte_do, 4))) {
                String string2 = gs_02.chuoiGiaTri.substring(gs_02.chuoiGiaTri.indexOf(":") + 1);
                String string3 = GameCanvas.cfr_renamed_1(gs_02.soLuong, (int)gs_02.cfr_renamed_0, 1);
                vector.addElement(new bb_0("", new bw_0(this, n, string), gs_02, string3, string2));
            }
            ++n;
            if ((108 + 41 - 115 + 102 ^ 85 + 130 - 155 + 80) == (2 ^ 0x6B ^ (0x58 ^ 0x35))) continue;
            return;
        }
        if (gd_0.boolean_int(vector.size())) {
            aq.cfr_renamed_1().cfr_renamed_1(vector, GameCanvas.cfr_renamed_15, 90, 90);
            aq.var_de_do = new ay_0(this);
        }
    }

    public final void cfr_renamed_2(bB bB2) {
        gs_0 gs_02 = aa_0.gs_0_do((int)bB2.cfr_renamed_0);
        int n = 88;
        if (gd_0.boolean_do(gs_02.cfr_renamed_4, (int)this.var_short_do)) {
            n = 112;
            if (" ".length() >= "  ".length()) {
                return;
            }
        } else if (gd_0.boolean_do(gs_02.cfr_renamed_4, (int)this.var_short_if)) {
            n = 111;
            if ("   ".length() <= ((0x61 ^ 0x39) & ~(0x30 ^ 0x68))) {
                return;
            }
        } else if (gd_0.boolean_do(gs_02.var_short_do, 1)) {
            n = 79;
            if (" ".length() < -" ".length()) {
                return;
            }
        } else if (gd_0.boolean_do(gs_02.var_short_do, 2)) {
            n = 67;
        }
        int n2 = 0;
        while ((n2 < gs_02.var_java_util_Vector_do.size())) {
            fs fs2 = (fs)gs_02.var_java_util_Vector_do.elementAt(n2);
            fh.var_short_arr_do[(bB2.cfr_renamed_3 / 24 + fs2.var_int_if) * fh.var_short_if + bB2.cfr_renamed_2 / 24 + fs2.soLuong] = (short)n;
            ++n2;
            return;
        }
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

    /*
     * WARNING - void declaration
     */
    public final void (boolean bl == String string) {
        if (gd_0.boolean_for(bl ? 1 : 0)) {
            void n;
            GameCanvas.cfr_renamed_1((String)n);
            return;
        }
        int cg2 = fo.var_int_if;
        int n = fo.var_int_try;
        if (gd_0.boolean_for(cg2)) {
            cg cg3 = (cg)this.var_java_util_Vector_if.elementAt(n);
            this.var_java_util_Vector_do.addElement(cg3);
            this.var_java_util_Vector_if.removeElement(cg3);
            if ((90 + 174 - 188 + 112 ^ 22 + 10 - -27 + 125) == 0) {
                return;
            }
        } else {
            cg cg3 = (cg)this.var_java_util_Vector_do.elementAt(n);
            this.var_java_util_Vector_if.addElement(cg3);
            this.var_java_util_Vector_do.removeElement(cg3);
            }
        this.cfr_renamed_2();
        GameCanvas.cfr_renamed_7();
    }

    public final void (et[] etArray != null) {
        this.var_et_arr_do = etArray;
        this.cfr_renamed_10();
        GameCanvas.cfr_renamed_7();
    }

    private static boolean cfr_renamed_5(int n, int n2) {
        if (!(fh.var_short_arr_if[n2 * fh.var_short_if + n] != fh.var_cu_0_do.cfr_renamed_0 - 2) || gd_0.boolean_do(fh.var_short_arr_if[n2 * fh.var_short_if + n], -1)) {
            return 1;
        }
        return 0;
    }

    static int int_int(gd_0 gd_02) {
        return gd_02.cfr_renamed_14;
    }

    static void (gd_0 gd_02 == String string) {
        gd_02.cfr_renamed_1(string);
    }
}

