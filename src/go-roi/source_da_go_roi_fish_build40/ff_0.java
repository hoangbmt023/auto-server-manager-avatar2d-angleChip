/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from fF
 */
public final class ff_0
extends en {
    private boolean coTrangThai = 0;
    public static ff_0 var_ff_0_do;
    private int soLuong;
    private int var_int_if;
    public boolean dangChayAuto = 0;
    private static int[] mangSoNguyen;
    private Vector var_java_util_Vector_do;
    private boolean coKichHoat;
    private int soLuongKhoa;
    private int cfr_renamed_3;
    private long soXu = 0L;
    private en var_en_do;
    private int cfr_renamed_4;
    private short[] var_short_arr_do;
    private fl_0 var_fl_0_do;
    private int cfr_renamed_5;

    private static fl_0 (String string, int n, int n2 != null) {
        return new er_0(string, n, n2);
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_13();
                return;
            }
            case 1: {
                this.cfr_renamed_13();
                fl_0 fl_02 = (fl_0)this.var_java_util_Vector_do.elementAt(this.var_int_if);
                if ((fl_02.var_de_do != null)) {
                    fl_02.var_de_do.void_do();
                    return;
                }
                this.void_if(fl_02.var_byte_do, fl_02.var_short_do);
            }
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

            public static void cfr_renamed_2() {
        DuLieuNguoiChoi ef2 = AngelChip.duLieuNguoiChoi;
        if ((GameCanvas.var_en_do == var_ff_0_do)) {
            return;
        }
        fo.fo_do().coKichHoat = 1;
        fo fo2 = fo.fo_do();
        String[] stringArray = new String[2];
        stringArray[0] = MenuChinhAvatar.af;
        stringArray[1] = MenuChinhAvatar.bh;
        Vector[] vectorArray = new Vector[2];
        int n = 0;
        go_0.go_0_do();
        vectorArray[n] = go_0.java_util_Vector_do(ef2);
        int n2 = 1;
        go_0.go_0_do();
        vectorArray[n2] = go_0.cfr_renamed_1(AngelChip.var_java_util_Vector_do, ((dd_0)ef2).cfr_renamed_9, 1);
        fo2.cfr_renamed_1(stringArray, vectorArray, null);
        fo.fo_do().cfr_renamed_1(go_0.go_0_do().cfr_renamed_1(ef2.var_java_util_Vector_if, 0, 0, 0), 0);
        fo.fo_do().cfr_renamed_1(go_0.go_0_do().cfr_renamed_1(AngelChip.var_java_util_Vector_do, 1, 0, 1), 1);
        if ((GameCanvas.var_en_do != fo.fo_do())) {
            fo.fo_do().cfr_renamed_4();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_3() {
        if ((go_0.var_ef_if == null)) {
            return;
        }
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement((MenuChinhAvatar.cfr_renamed_39, 9, 13 != null));
        vector.addElement((MenuChinhAvatar.bz, 12, 2 != null));
        vector.addElement((MenuChinhAvatar.g, 7, 11 != null));
        vector.addElement((MenuChinhAvatar.cP, 8, 12 != null));
        vector.addElement((MenuChinhAvatar.ab, 10, 21 != null));
        vector.addElement((MenuChinhAvatar.GameCanvas, 11, 19 != null));
        vector.addElement((MenuChinhAvatar.U, 13, 22 != null));
        if ((go_0.var_java_util_Vector_do.size() != null)) {
            int n = 0;
            while (!(n >= go_0.var_java_util_Vector_do.size())) {
                fx fx2 = (fx)go_0.var_java_util_Vector_do.elementAt(n);
                if ((fx2.cfr_renamed_8 == 1)) {
                    vector.addElement(new q(fx2.chuoiGiaTri, n, fx2));
                }
                ++n;
            }
        }
        this.cfr_renamed_1(vector);
    }

        /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_5() {
        block12: {
            block11: {
                if ((AngelChip.duLieuNguoiChoi.var_int_class == null) && ff_0.boolean_if(AngelChip.duLieuNguoiChoi.var_int_class, -5)) {
                    return;
                }
                if (ff_0.cfr_renamed_0((int)fj_0.dangChayAuto)) {
                    return;
                }
                if ((fh.var_bm_do != null) && (fh.var_bm_do.var_byte_if == 5)) {
                    fn.fn_do().cfr_renamed_3(((ed)fh.var_bm_do).var_int_long);
                    return;
                }
                if ((fh.var_bm_do != null) && ff_0.boolean_int(fh.var_bm_do.var_byte_if) && ff_0.cfr_renamed_4(((DuLieuNguoiChoi)fh.var_bm_do).cfr_renamed_9, -100)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_28, new ad_0());
                    return;
                }
                var0 = new Vector<fl_0>();
                var1_1 = (MenuChinhAvatar.bp, 1, 1 != null);
                var2_4 = (MenuChinhAvatar.bW, 2, 0 != null);
                var3_5 = (MenuChinhAvatar.au, 3, 20 != null);
                var4_6 = (MenuChinhAvatar.M, 20, 17 != null);
                var5_7 = (MenuChinhAvatar.bB, 5, 18 != null);
                if (ff_0.boolean_int(GameCanvas.cfr_renamed_12)) {
                    var0.addElement(var3_5);
                }
                var0.addElement(var4_6);
                var0.addElement((fl_0)var2_4);
                if (ff_0.boolean_int(GameCanvas.cfr_renamed_12)) {
                    var0.addElement(go_0.go_0_do().var_fl_0_for);
                }
                if (ff_0.boolean_if(AngelChip.duLieuNguoiChoi.cfr_renamed_2, 14)) {
                    var0.addElement(var1_1);
                }
                var0.addElement(var5_7);
                if (!(GameCanvas.cfr_renamed_12 != null) || !(go_0.var_java_util_Vector_int != null) || !(go_0.var_java_util_Vector_int.size() != null)) break block11;
                var1_2 = 0;
                if (-" ".length() < ((" ".length() ^ (248 ^ 193)) & (150 ^ 158 ^ (103 ^ 87) ^ -" ".length()))) ** GOTO lbl35
                return;
lbl-1000:
                // 1 sources

                {
                    var2_4 = (fx)go_0.var_java_util_Vector_int.elementAt(var1_2);
                    var0.addElement(new x_0(var2_4.chuoiGiaTri, var1_2, (fx)var2_4));
                    ++var1_2;
lbl35:
                    // 2 sources

                    ** while (!ff_0.cfr_renamed_3((int)var1_2, (int)go_0.var_java_util_Vector_int.size()))
                }
            }
            if (!(go_0.var_java_util_Vector_do.size() != null)) break block12;
            var1_3 = 0;
            if (" ".length() <= (69 + 125 - 8 + 10 ^ 18 + 129 - 114 + 159)) ** GOTO lbl47
            return;
lbl-1000:
            // 1 sources

            {
                var2_4 = (fx)go_0.var_java_util_Vector_do.elementAt(var1_3);
                if (ff_0.boolean_int(var2_4.cfr_renamed_8)) {
                    var0.addElement(new en_0(var2_4.chuoiGiaTri, var1_3, (fx)var2_4));
                }
                ++var1_3;
lbl47:
                // 2 sources

                ** while (!ff_0.cfr_renamed_3((int)var1_3, (int)go_0.var_java_util_Vector_do.size()))
            }
        }
        if ((GameCanvas.var_en_do == fo.fo_do())) {
            return;
        }
        ff_0.cfr_renamed_1().cfr_renamed_1(var0);
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[30];
        0 = ("  ".length() ^ (0x7F ^ 0x50)) & (105 + 121 - 91 + 37 ^ 102 + 99 - 106 + 34 ^ -" ".length());
        1 = " ".length();
        9 = 0x1B ^ 0x12;
        4 = 0x27 ^ 0x29 ^ (0x76 ^ 0x7C);
        5 = 0xBD ^ 0xB8;
        2 = "  ".length();
        6 = 0x50 ^ 0x56;
        3 = "   ".length();
        7 = 1 ^ 6;
        8 = 32 + 109 - 31 + 34 ^ 8 + 121 - 82 + 105;
        10 = 119 + 102 - 86 + 7 ^ 80 + 38 - 37 + 51;
        11 = 0x61 ^ 1 ^ (0x38 ^ 0x53);
        12 = 0x34 ^ 0x38;
        26 = 0x18 ^ 2;
        -1 = -" ".length();
        -5 = -(154 + 50 - 83 + 67 ^ 159 + 46 - 56 + 36);
        17 = 0x82 ^ 0x93;
        14 = 0 ^ 0xE;
        21 = 0x1E ^ 0xB;
        15 = 0x9A ^ 0x95;
        13 = 0x15 ^ 0x18;
        19 = 0x5A ^ 0x14 ^ (0xE1 ^ 0xBC);
        22 = 0x9E ^ 0xC3 ^ (0x17 ^ 0x5C);
        -100 = -(0x17 ^ 0xB ^ (0x55 ^ 0x2D));
        20 = 0x2E ^ 0x3A;
        18 = 0xC ^ 0x1E;
        40 = 0x20 ^ 8;
        300 = -(0xFFFFFB7D & 0x3ED3) & (0xFFFFBB7D & 0x7FFE);
        30 = 0x19 ^ 0x53 ^ (0x2E ^ 0x7A);
        -40 = -(0x47 ^ 0x6F);
    }

    public static ff_0 cfr_renamed_1() {
        if ((var_ff_0_do == null)) {
            var_ff_0_do = new ff_0();
            return var_ff_0_do;
        }
        return var_ff_0_do;
    }

        static {
        ff_0.cfr_renamed_8();
    }

    private void cfr_renamed_13() {
        this.var_en_do.cfr_renamed_4();
        if ((go_0.var_ef_if != null)) {
            go_0.var_ef_if.dangChayAuto = 0;
        }
        ((dF)this).cfr_renamed_3 = null;
        this.coKichHoat = 0;
    }

            private static boolean boolean_for(int n) {
        return n < 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Vector vector != null) {
        this.var_java_util_Vector_do = vector;
        if ((GameCanvas.var_boolean_try ? 1 : 0 == null)) {
            this.cfr_renamed_3 = 40 * dF.cfr_renamed_12 + (dF.cfr_renamed_12 - 1) * 20;
            if ((GameCanvas.cfr_renamed_12 == 1) && ff_0.boolean_do(GameCanvas.soLuongKhoa, 300)) {
                this.cfr_renamed_3 += 20;
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
        } else {
            this.cfr_renamed_3 = 30;
        }
        this.soLuong = this.cfr_renamed_3 + 2 * dF.cfr_renamed_12;
        this.cfr_renamed_4 = dF.cfr_renamed_6 << 1;
        this.cfr_renamed_5 = 0;
        this.soLuongKhoa = GameCanvas.soLuongKhoa / this.soLuong;
        if ((vector.size() * this.soLuong < GameCanvas.soLuongKhoa)) {
            this.cfr_renamed_5 = (GameCanvas.soLuongKhoa - vector.size() * this.soLuong) / 2;
            } else {
            this.cfr_renamed_5 = (GameCanvas.soLuongKhoa - this.soLuongKhoa * this.soLuong) / 2;
        }
        this.var_short_arr_do = new short[vector.size()];
        int n = 0;
        while (!(n >= this.var_short_arr_do.length)) {
            this.var_short_arr_do[n] = -40;
            ++n;
        }
        if ((this.var_int_if >= vector.size())) {
            this.var_int_if = 0;
        }
        if ((go_0.var_ef_if != null) && (GameCanvas.cfr_renamed_12 != null)) {
            go_0.var_ef_if.dangChayAuto = 1;
        }
        if ((GameCanvas.cfr_renamed_12 != null)) {
            this.cfr_renamed_4 = GameCanvas.var_int_char - (vector.size() / this.soLuongKhoa + 1) * this.cfr_renamed_3 / 2;
        }
        this.cfr_renamed_4();
        if (ff_0.boolean_int(GameCanvas.cfr_renamed_12)) {
            ((dF)this).cfr_renamed_3 = this.var_fl_0_do;
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_6() {
        block24: {
            block23: {
                if (!ff_0.cfr_renamed_0((int)GameCanvas.coTrangThai)) break block23;
                var1_1 = 0;
                var2_2 = this.var_java_util_Vector_do.size() - 1;
                if ("  ".length() >= 0) ** GOTO lbl19
                return;
lbl-1000:
                // 1 sources

                {
                    if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(this.var_short_arr_do[var2_2] + this.cfr_renamed_5, this.cfr_renamed_4 + var2_2 / this.soLuongKhoa * this.soLuong, this.cfr_renamed_3, this.cfr_renamed_3))) {
                        this.var_int_if = var2_2;
                        this.coKichHoat = 1;
                        this.coTrangThai = 0;
                        var1_1 = 1;
                        this.soXu = System.currentTimeMillis() / 100L;
                        if ("  ".length() == "  ".length()) break;
                        return;
                    }
                    --var2_2;
lbl19:
                    // 2 sources

                    ** while (!ff_0.boolean_for((int)var2_2))
                }
lbl20:
                // 2 sources

                if (ff_0.boolean_int(var1_1)) {
                    this.cfr_renamed_13();
                }
            }
            if (!ff_0.cfr_renamed_0((int)this.coKichHoat)) break block24;
            if (ff_0.cfr_renamed_1((System.currentTimeMillis() / 100L - this.soXu != 10L))) {
                this.coTrangThai = 0;
            }
            if (!ff_0.cfr_renamed_0((int)GameCanvas.var_boolean_new)) break block24;
            this.coKichHoat = 0;
            this.coTrangThai = 1;
            var1_1 = this.var_java_util_Vector_do.size() - 1;
            if (null == null) ** GOTO lbl43
            return;
lbl-1000:
            // 1 sources

            {
                if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(this.var_short_arr_do[var1_1] + this.cfr_renamed_5, this.cfr_renamed_4 + var1_1 / this.soLuongKhoa * this.soLuong, this.cfr_renamed_3, this.cfr_renamed_3))) {
                    if (!(var1_1 == this.var_int_if)) break;
                    this.cfr_renamed_13();
                    this.void_do(1, -1);
                    if (" ".length() > 0) break;
                    return;
                }
                --var1_1;
lbl43:
                // 2 sources

                ** while (!ff_0.boolean_for((int)var1_1))
            }
lbl44:
            // 3 sources

            GameCanvas.var_boolean_new = 0;
        }
        if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(4))) {
            this.var_int_if -= 1;
            if (ff_0.boolean_for(this.var_int_if)) {
                this.var_int_if = this.var_java_util_Vector_do.size() - 1;
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
        } else if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(6))) {
            this.var_int_if += 1;
            if ((this.var_int_if >= this.var_java_util_Vector_do.size())) {
                this.var_int_if = 0;
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            }
        } else if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(2))) {
            var1_1 = this.var_int_if - this.soLuongKhoa;
            if (ff_0.boolean_for(var1_1)) {
                var1_1 = this.var_java_util_Vector_do.size() / this.soLuongKhoa * this.soLuongKhoa + (this.soLuongKhoa + var1_1);
                if ((var1_1 < this.var_java_util_Vector_do.size())) {
                    this.var_int_if = var1_1;
                    if ("   ".length() == 0) {
                        return;
                    }
                }
            } else {
                this.var_int_if = var1_1;
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
        } else if (ff_0.cfr_renamed_0((int)GameCanvas.boolean_do(8))) {
            this.var_int_if += this.soLuongKhoa;
            if ((this.var_int_if >= this.var_java_util_Vector_do.size())) {
                this.var_int_if %= this.soLuongKhoa;
            }
        }
        super.cfr_renamed_6();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                go_0.go_0_do();
                go_0.cfr_renamed_29();
                return;
            }
            case 2: {
                ff_0 ff_02 = this;
                byte[] byArray = new byte[9];
                byArray[0] = 4;
                byArray[1] = 5;
                byArray[2] = 6;
                byArray[3] = 7;
                byArray[4] = 8;
                byArray[5] = 9;
                byArray[6] = 10;
                byArray[7] = 11;
                byArray[8] = 12;
                byte[] byArray2 = byArray;
                Vector<u> vector = new Vector<u>();
                int n3 = 0;
                if ("  ".length() < 0) {
                    return;
                }
                while (true) {
                    if ((n3 >= byArray2.length)) {
                        ff_02.cfr_renamed_1(vector);
                        return;
                    }
                    int n4 = n3;
                    vector.addElement(new u("", n3, byArray2, n4));
                    ++n3;
                }
            }
            case 3: {
                this.cfr_renamed_3();
                return;
            }
            case 4: {
                go_0.dangChayAuto = 1;
                fn.fn_do().cfr_renamed_5(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9);
                return;
            }
            case 5: {
                fv_0.cfr_renamed_1().cfr_renamed_0(0);
                return;
            }
            case 6: {
                this.dangChayAuto = 0;
                ft_0.ft_0_do().cfr_renamed_15(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9);
                return;
            }
            case 7: {
                go_0.go_0_do();
                go_0.cfr_renamed_0(go_0.var_ef_if);
                return;
            }
            case 8: {
                ft_0.ft_0_do().cfr_renamed_6(26);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 9: {
                go_0.go_0_do();
                go_0.cfr_renamed_31();
                return;
            }
            case 10: {
                go_0.go_0_do();
                go_0.cfr_renamed_5();
                return;
            }
            case 11: {
                go_0.dangChayAuto = 1;
                go_0.go_0_do();
                go_0.cfr_renamed_16();
                return;
            }
            case 12: {
                go_0.go_0_do().cfr_renamed_3();
                return;
            }
            case 13: {
                go_0.go_0_do();
                go_0.this();
                return;
            }
            case 15: {
                go_0.go_0_do();
                go_0.void_do(AngelChip.var_by_do);
                return;
            }
            case 16: {
                int n5;
                fx fx2 = (fx)go_0.var_java_util_Vector_do.elementAt(n2);
                if (!(fx2.cfr_renamed_8 == 1)) return;
                ft_0 ft_02 = ft_0.ft_0_do();
                int n6 = fx2.cfr_renamed_4;
                if ((go_0.var_ef_if != null)) {
                    n5 = ((dd_0)go_0.var_ef_if).cfr_renamed_9;
                    if ("  ".length() == "   ".length()) {
                        return;
                    }
                } else {
                    n5 = -1;
                }
                ft_02.cfr_renamed_2(n6, n5);
                return;
            }
            case 17: {
                ft_0.ft_0_do().cfr_renamed_4(n2);
                return;
            }
            case 18: {
                int n7;
                fx fx3 = (fx)go_0.var_java_util_Vector_do.elementAt(n2);
                if (!ff_0.boolean_int(fx3.cfr_renamed_8)) return;
                ft_0 ft_03 = ft_0.ft_0_do();
                int n8 = fx3.cfr_renamed_4;
                if ((go_0.var_ef_if != null)) {
                    n7 = ((dd_0)go_0.var_ef_if).cfr_renamed_9;
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                } else {
                    n7 = -1;
                }
                ft_03.cfr_renamed_2(n8, n7);
                return;
            }
            case 19: {
                byte[] byArray = new byte[9];
                byArray[0] = 4;
                byArray[1] = 5;
                byArray[2] = 6;
                byArray[3] = 7;
                byArray[4] = 8;
                byArray[5] = 9;
                byArray[6] = 10;
                byArray[7] = 11;
                byArray[8] = 12;
                byte[] byArray3 = byArray;
                if (ff_0.boolean_int(n2)) {
                    go_0.go_0_do();
                    go_0.cfr_renamed_7(4);
                    return;
                }
                go_0.go_0_do();
                go_0.cfr_renamed_7(byArray3[n2]);
                return;
            }
            case 20: {
                if ((AngelChip.duLieuNguoiChoi.var_int_class == null) && !(AngelChip.duLieuNguoiChoi.var_int_class == -5) || !ff_0.boolean_int(fj_0.dangChayAuto ? 1 : 0)) return;
                if ((fh.var_bm_do != null) && (fh.var_bm_do.var_byte_if == 5)) {
                    fn.fn_do().cfr_renamed_3(((ed)fh.var_bm_do).var_int_long);
                    return;
                }
                Vector<fl_0> vector = new Vector<fl_0>();
                fl_0 fl_02 = (MenuChinhAvatar.bD, 4, 17 != null);
                fl_0 fl_03 = (MenuChinhAvatar.cf, 6, 14 != null);
                fl_0 fl_04 = (MenuChinhAvatar.af, 21, 14 != null);
                fl_0 fl_05 = (MenuChinhAvatar.dh, 15, 17 != null);
                vector.addElement(fl_02);
                vector.addElement(fl_05);
                vector.addElement(fl_04);
                vector.addElement(fl_03);
                if (!(GameCanvas.var_en_do != fo.fo_do())) return;
                ff_0.cfr_renamed_1().cfr_renamed_1(vector);
                return;
            }
            case 21: {
                ft_0.ft_0_do().cfr_renamed_15(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9);
                this.dangChayAuto = 1;
                return;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_7() {
        this.var_en_do.cfr_renamed_7();
        var1_1 = 0;
        if ((69 ^ 96 ^ (189 ^ 156)) > "  ".length()) ** GOTO lbl11
        return;
lbl-1000:
        // 1 sources

        {
            if (ff_0.boolean_if(this.var_short_arr_do[var1_1], var1_1 % this.soLuongKhoa * this.soLuong)) {
                v0 = var1_1;
                this.var_short_arr_do[v0] = (short)(this.var_short_arr_do[v0] + (var1_1 % this.soLuongKhoa * this.soLuong - this.var_short_arr_do[var1_1]) / 3);
            }
            ++var1_1;
lbl11:
            // 2 sources

            ** while (!ff_0.cfr_renamed_3((int)var1_1, (int)this.var_short_arr_do.length))
        }
lbl12:
        // 1 sources

    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        this.var_en_do.cfr_renamed_0(var1_1);
        GameCanvas.hienThongBaoPopup(var1_1);
        var2_2 = var1_1;
        var3_3 = this;
        if (ff_0.boolean_if(AngelChip.duLieuNguoiChoi.cfr_renamed_2, 14)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_1(var2_2, AngelChip.duLieuNguoiChoi.cfr_renamed_2 * dF.cfr_renamed_12 - fm.fm_do().cfr_renamed_3, AngelChip.duLieuNguoiChoi.cfr_renamed_3 * dF.cfr_renamed_12 - fm.fm_do().cfr_renamed_2, 0);
        }
        var4_4 = (fl_0)var3_3.var_java_util_Vector_do.elementAt(var3_3.var_int_if);
        GameCanvas.var_fz_0_new.cfr_renamed_1(var2_2, var4_4.chuoiGiaTri, GameCanvas.cfr_renamed_15, var3_3.cfr_renamed_4 - 15, 2);
        var2_2.translate(var3_3.cfr_renamed_5, var3_3.cfr_renamed_4);
        var5_6 = var3_3.var_java_util_Vector_do.size() - 1;
        if ("   ".length() != 0) ** GOTO lbl22
        return;
lbl-1000:
        // 1 sources

        {
            var4_5 = 0;
            var6_7 = (fl_0)var3_3.var_java_util_Vector_do.elementAt(var5_6);
            if ((var5_6 == var3_3.var_int_if) && ff_0.boolean_int((int)var3_3.coTrangThai)) {
                var4_5 = 4;
            }
            GameCanvas.var_fa_0_do.cfr_renamed_1(var2_2, var3_3.var_short_arr_do[var5_6], var5_6 / var3_3.soLuongKhoa * var3_3.soLuong, var3_3.cfr_renamed_3, var3_3.cfr_renamed_3, var4_5);
            var6_7.cfr_renamed_1(var2_2, var3_3.soLuong / 2 + var3_3.var_short_arr_do[var5_6], var3_3.soLuong / 2 + var5_6 / var3_3.soLuongKhoa * var3_3.soLuong);
            --var5_6;
lbl22:
            // 2 sources

            ** while (!ff_0.boolean_for((int)var5_6))
        }
lbl23:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

    public final void cfr_renamed_4() {
        if ((GameCanvas.var_en_do != this)) {
            this.var_en_do = GameCanvas.var_en_do;
        }
        this.b_();
        super.cfr_renamed_4();
    }

    public static fl_0 (String string, de de2, int n != null) {
        return new ez_0(string, new ev_0(de2), n);
    }

    public final void b_() {
        if (ff_0.boolean_int(GameCanvas.cfr_renamed_12)) {
            this.var_fl_0_new = new fl_0(MenuChinhAvatar.by, 0);
            } else {
            this.coTrangThai = 1;
        }
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cT, 1);
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }
}

