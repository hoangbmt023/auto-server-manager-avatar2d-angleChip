/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class ec
extends dL {
    private boolean coTrangThai;
    private int soLuong;
    public static ec var_ec_do;
    private dL var_dL_do;
    private int var_int_if;
    private long soXu = 0L;
    private int soLuongKhoa;
    private Vector var_java_util_Vector_do;
    private int cfr_renamed_4;
    private ei var_ei_do;
    private boolean coKichHoat = 0;
    private int cfr_renamed_5;
    private static int[] mangSoNguyen;
    public boolean dangChayAuto = 0;
    private int cfr_renamed_2;
    private short[] var_short_arr_do;

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block24: {
            block23: {
                if (!ec.cfr_renamed_3((int)GameCanvas.coKichHoat)) break block23;
                var1_1 = 0;
                var2_2 = this.var_java_util_Vector_do.size() - 1;
                if ((125 ^ 121) == (26 ^ 30)) ** GOTO lbl19
                return;
lbl-1000:
                // 1 sources

                {
                    if (ec.cfr_renamed_3((int)GameCanvas.boolean_if(this.var_short_arr_do[var2_2] + this.soLuong, this.soLuongKhoa + var2_2 / this.cfr_renamed_2 * this.cfr_renamed_5, this.var_int_if, this.var_int_if))) {
                        this.cfr_renamed_4 = var2_2;
                        this.coTrangThai = 1;
                        this.coKichHoat = 0;
                        var1_1 = 1;
                        this.soXu = System.currentTimeMillis() / 100L;
                        if (-"   ".length() < 0) break;
                        return;
                    }
                    --var2_2;
lbl19:
                    // 2 sources

                    ** while (!ec.boolean_do((int)var2_2))
                }
lbl20:
                // 2 sources

                if ((var1_1 == 0)) {
                    this.cfr_renamed_12();
                }
            }
            if (!ec.cfr_renamed_3((int)this.coTrangThai)) break block24;
            if (ec.boolean_if((System.currentTimeMillis() / 100L - this.soXu == 10L))) {
                this.coKichHoat = 0;
            }
            if (!ec.cfr_renamed_3((int)GameCanvas.var_boolean_new)) break block24;
            this.coTrangThai = 0;
            this.coKichHoat = 1;
            var1_1 = this.var_java_util_Vector_do.size() - 1;
            if (" ".length() != 0) ** GOTO lbl43
            return;
lbl-1000:
            // 1 sources

            {
                if (ec.cfr_renamed_3((int)GameCanvas.boolean_if(this.var_short_arr_do[var1_1] + this.soLuong, this.soLuongKhoa + var1_1 / this.cfr_renamed_2 * this.cfr_renamed_5, this.var_int_if, this.var_int_if))) {
                    if (!(var1_1 == this.cfr_renamed_4)) break;
                    this.cfr_renamed_12();
                    this.void_do(1, -1);
                    if (null == null) break;
                    return;
                }
                --var1_1;
lbl43:
                // 2 sources

                ** while (!ec.boolean_do((int)var1_1))
            }
lbl44:
            // 3 sources

            GameCanvas.var_boolean_new = 0;
        }
        if (ec.cfr_renamed_3((int)GameCanvas.boolean_do(4))) {
            this.cfr_renamed_4 -= 1;
            if (ec.boolean_do(this.cfr_renamed_4)) {
                this.cfr_renamed_4 = this.var_java_util_Vector_do.size() - 1;
                if (((79 ^ 18 ^ (11 ^ 26)) & (" ".length() ^ (95 ^ 18) ^ -" ".length())) == "  ".length()) {
                    return;
                }
            }
        } else if (ec.cfr_renamed_3((int)GameCanvas.boolean_do(6))) {
            this.cfr_renamed_4 += 1;
            if ((this.cfr_renamed_4 >= this.var_java_util_Vector_do.size())) {
                this.cfr_renamed_4 = 0;
                if (" ".length() == 0) {
                    return;
                }
            }
        } else if (ec.cfr_renamed_3((int)GameCanvas.boolean_do(2))) {
            var1_1 = this.cfr_renamed_4 - this.cfr_renamed_2;
            if (ec.boolean_do(var1_1)) {
                var1_1 = this.var_java_util_Vector_do.size() / this.cfr_renamed_2 * this.cfr_renamed_2 + (this.cfr_renamed_2 + var1_1);
                if (ec.boolean_if(var1_1, this.var_java_util_Vector_do.size())) {
                    this.cfr_renamed_4 = var1_1;
                    if (" ".length() == 0) {
                        return;
                    }
                }
            } else {
                this.cfr_renamed_4 = var1_1;
                if ((72 ^ 82 ^ (50 ^ 45)) == 0) {
                    return;
                }
            }
        } else if (ec.cfr_renamed_3((int)GameCanvas.boolean_do(8))) {
            this.cfr_renamed_4 += this.cfr_renamed_2;
            if ((this.cfr_renamed_4 >= this.var_java_util_Vector_do.size())) {
                this.cfr_renamed_4 %= this.cfr_renamed_2;
            }
        }
        super.cfr_renamed_15();
    }

        private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private void cfr_renamed_12() {
        this.var_dL_do.cfr_renamed_8();
        if ((fe_0.duLieuNguoiChoi != null)) {
            fe_0.duLieuNguoiChoi.dangChayAuto = 0;
        }
        this.var_ei_new = null;
        this.coTrangThai = 0;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void cfr_renamed_8() {
        if ((GameCanvas.var_dL_do != this)) {
            this.var_dL_do = GameCanvas.var_dL_do;
        }
        this.a_();
        super.cfr_renamed_8();
    }

            private static void cfr_renamed_11() {
        mangSoNguyen = new int[30];
        0 = (148 + 131 - 242 + 145 ^ 64 + 67 - 122 + 135) & (0x45 ^ 0x2C ^ (0xF4 ^ 0xBB) ^ -" ".length());
        1 = " ".length();
        9 = 0x3A ^ 0x33;
        4 = 0x55 ^ 0x51;
        5 = 0 ^ 5;
        2 = "  ".length();
        6 = 0x9F ^ 0x99;
        3 = "   ".length();
        7 = 0x74 ^ 0x3B ^ (0xCB ^ 0x83);
        8 = 0x32 ^ 0x16 ^ (0xBB ^ 0x97);
        10 = 29 + 72 - 47 + 109 ^ 22 + 164 - 66 + 49;
        11 = 0x79 ^ 0x72;
        12 = 0x28 ^ 0x24;
        26 = 0x44 ^ 0x5E;
        -1 = -" ".length();
        -5 = -(0x7B ^ 0x7E);
        17 = 0xAF ^ 0xBE;
        14 = 0x43 ^ 0x39 ^ (0xC4 ^ 0xB0);
        21 = 0x56 ^ 0x2A ^ (0xCF ^ 0xA6);
        15 = 0 ^ 0xF;
        13 = 38 + 5 - 25 + 136 ^ 50 + 116 - 141 + 126;
        19 = 0x1C ^ 0xF;
        22 = 0x34 ^ 0x22;
        -100 = -(0x38 ^ 0x6D ^ (0x9F ^ 0xAE));
        20 = 0x24 ^ 0x30;
        18 = 0x97 ^ 0x85;
        40 = 0x3B ^ 0x22 ^ (0x24 ^ 0x15);
        300 = 0xFFFFD7AD & 0x297E;
        30 = 0x7E ^ 0x60;
        -40 = -(52 + 39 - -3 + 35 ^ 52 + 98 - 82 + 101);
    }

    private static ei (String string, int n, int n2 == null) {
        return new de(string, n, n2);
    }

    /*
     * Unable to fully structure code
     */
    public final void void_for() {
        this.var_dL_do.void_for();
        var1_1 = 0;
        if ("  ".length() != -" ".length()) ** GOTO lbl11
        return;
lbl-1000:
        // 1 sources

        {
            if ((this.var_short_arr_do[var1_1] != var1_1 % this.cfr_renamed_2 * this.cfr_renamed_5)) {
                v0 = var1_1;
                this.var_short_arr_do[v0] = (short)(this.var_short_arr_do[v0] + (var1_1 % this.cfr_renamed_2 * this.cfr_renamed_5 - this.var_short_arr_do[var1_1]) / 3);
            }
            ++var1_1;
lbl11:
            // 2 sources

            ** while (!ec.cfr_renamed_5((int)var1_1, (int)this.var_short_arr_do.length))
        }
lbl12:
        // 1 sources

    }

    public static void cfr_renamed_1() {
        DuLieuNguoiChoi dd_02 = AngelChip.duLieuNguoiChoi;
        if ((GameCanvas.var_dL_do == var_ec_do)) {
            return;
        }
        em_0.em_0_do().coTrangThai = 1;
        em_0 em_02 = em_0.em_0_do();
        String[] stringArray = new String[2];
        stringArray[0] = MenuChinhAvatar.bA;
        stringArray[1] = MenuChinhAvatar.bF;
        Vector[] vectorArray = new Vector[2];
        int n = 0;
        fe_0.fe_0_do();
        vectorArray[n] = fe_0.java_util_Vector_do(dd_02);
        int n2 = 1;
        fe_0.fe_0_do();
        vectorArray[n2] = fe_0.cfr_renamed_0(AngelChip.var_java_util_Vector_do, ((bk_0)dd_02).cfr_renamed_12, 1);
        em_02.cfr_renamed_0(stringArray, vectorArray, null);
        em_0.em_0_do().cfr_renamed_0(fe_0.fe_0_do().cfr_renamed_0(dd_02.var_java_util_Vector_if, 0, 0, 0), 0);
        em_0.em_0_do().cfr_renamed_0(fe_0.fe_0_do().cfr_renamed_0(AngelChip.var_java_util_Vector_do, 1, 0, 1), 1);
        if ((GameCanvas.var_dL_do != em_0.em_0_do())) {
            em_0.em_0_do().cfr_renamed_8();
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_12();
                return;
            }
            case 1: {
                this.cfr_renamed_12();
                ei ei2 = (ei)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_4);
                if ((ei2.var_cp_do != null)) {
                    ei2.var_cp_do.void_do();
                    return;
                }
                this.void_if(ei2.var_byte_do, ei2.var_short_do);
            }
        }
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_23();
                return;
            }
            case 2: {
                ec ec2 = this;
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
                Vector<j_0> vector = new Vector<j_0>();
                int n3 = 0;
                while (true) {
                    if ((n3 >= byArray2.length)) {
                        ec2.cfr_renamed_0(vector);
                        return;
                    }
                    int n4 = n3;
                    vector.addElement(new j_0("", n3, byArray2, n4));
                    ++n3;
                }
            }
            case 3: {
                this.cfr_renamed_4();
                return;
            }
            case 4: {
                fe_0.var_boolean_int = 1;
                el_0.el_0_do().cfr_renamed_4(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12);
                return;
            }
            case 5: {
                es.cfr_renamed_0().cfr_renamed_0(0);
                return;
            }
            case 6: {
                this.dangChayAuto = 0;
                eq.eq_do().cfr_renamed_18(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12);
                return;
            }
            case 7: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_3(fe_0.duLieuNguoiChoi);
                return;
            }
            case 8: {
                eq.eq_do().cfr_renamed_8(26);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 9: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_18();
                return;
            }
            case 10: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_22();
                return;
            }
            case 11: {
                fe_0.var_boolean_int = 1;
                fe_0.fe_0_do();
                fe_0.cfr_renamed_5();
                return;
            }
            case 12: {
                fe_0.fe_0_do().cfr_renamed_25();
                return;
            }
            case 13: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_27();
                return;
            }
            case 15: {
                fe_0.fe_0_do();
                fe_0.void_do(AngelChip.fontRenderer);
                return;
            }
            case 16: {
                int n5;
                ev_0 ev_02 = (ev_0)fe_0.var_java_util_Vector_if.elementAt(n2);
                if (!(ev_02.cfr_renamed_12 == 1)) return;
                eq eq2 = eq.eq_do();
                int n6 = ev_02.soLuong;
                if ((fe_0.duLieuNguoiChoi != null)) {
                    n5 = ((bk_0)fe_0.duLieuNguoiChoi).cfr_renamed_12;
                    if (-"   ".length() > 0) {
                        return;
                    }
                } else {
                    n5 = -1;
                }
                eq2.void_do(n6, n5);
                return;
            }
            case 17: {
                eq.eq_do().cfr_renamed_4(n2);
                return;
            }
            case 18: {
                int n7;
                ev_0 ev_03 = (ev_0)fe_0.var_java_util_Vector_if.elementAt(n2);
                if (!(ev_03.cfr_renamed_12 == 0)) return;
                eq eq3 = eq.eq_do();
                int n8 = ev_03.soLuong;
                if ((fe_0.duLieuNguoiChoi != null)) {
                    n7 = ((bk_0)fe_0.duLieuNguoiChoi).cfr_renamed_12;
                    if ("   ".length() < 0) {
                        return;
                    }
                } else {
                    n7 = -1;
                }
                eq3.void_do(n8, n7);
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
                if ((n2 == 0)) {
                    fe_0.fe_0_do();
                    fe_0.void_int(4);
                    return;
                }
                fe_0.fe_0_do();
                fe_0.void_int(byArray3[n2]);
                return;
            }
            case 20: {
                if ((AngelChip.duLieuNguoiChoi.var_int_break != 0) && !(AngelChip.duLieuNguoiChoi.var_int_break == -5) || !!(eg.dangChayAuto)) return;
                if ((ef_0.var_aG_do != null) && (ef_0.var_aG_do.var_byte_if == 5)) {
                    el_0.el_0_do().cfr_renamed_2(((dB)ef_0.var_aG_do).soLuong);
                    return;
                }
                Vector<ei> vector = new Vector<ei>();
                ei ei2 = (MenuChinhAvatar.cD, 4, 17 == null);
                ei ei3 = (MenuChinhAvatar.t, 6, 14 == null);
                ei ei4 = (MenuChinhAvatar.bA, 21, 14 == null);
                ei ei5 = (MenuChinhAvatar.ac, 15, 17 == null);
                vector.addElement(ei2);
                vector.addElement(ei5);
                vector.addElement(ei4);
                vector.addElement(ei3);
                if (!(GameCanvas.var_dL_do != em_0.em_0_do())) return;
                ec.cfr_renamed_0().cfr_renamed_0(vector);
                return;
            }
            case 21: {
                eq.eq_do().cfr_renamed_18(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12);
                this.dangChayAuto = 1;
                return;
            }
        }
    }

            public static ec cfr_renamed_0() {
        if ((var_ec_do == null)) {
            var_ec_do = new ec();
            return var_ec_do;
        }
        return var_ec_do;
    }

    static {
        ec.cfr_renamed_11();
    }

        /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_4() {
        block3: {
            if ((fe_0.duLieuNguoiChoi == null)) {
                return;
            }
            var1_1 = new Vector<ei>();
            var1_1.addElement((MenuChinhAvatar.e, 9, 13 == null));
            var1_1.addElement((MenuChinhAvatar.var_java_lang_String_this, 12, 2 == null));
            var1_1.addElement((MenuChinhAvatar.aX, 7, 11 == null));
            var1_1.addElement((MenuChinhAvatar.bk, 8, 12 == null));
            var1_1.addElement((MenuChinhAvatar.cN, 10, 21 == null));
            var1_1.addElement((MenuChinhAvatar.aV, 11, 19 == null));
            var1_1.addElement((MenuChinhAvatar.as, 13, 22 == null));
            if (!ec.boolean_if(fe_0.var_java_util_Vector_if.size())) break block3;
            var2_2 = 0;
            if ("   ".length() != " ".length()) ** GOTO lbl21
            return;
lbl-1000:
            // 1 sources

            {
                var3_3 = (ev_0)fe_0.var_java_util_Vector_if.elementAt(var2_2);
                if ((var3_3.cfr_renamed_12 == 1)) {
                    var1_1.addElement(new f_0(var3_3.cfr_renamed_1, var2_2, var3_3));
                }
                ++var2_2;
lbl21:
                // 2 sources

                ** while (!ec.cfr_renamed_5((int)var2_2, (int)fe_0.var_java_util_Vector_if.size()))
            }
        }
        this.cfr_renamed_0(var1_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Vector vector == null) {
        this.var_java_util_Vector_do = vector;
        if ((GameCanvas.coTrangThai)) {
            this.var_int_if = 40 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_6 - 1) * 20;
            if ((GameCanvas.cfr_renamed_16 == 1) && ec.boolean_do(GameCanvas.var_int_byte, 300)) {
                this.var_int_if += 20;
                }
        } else {
            this.var_int_if = 30;
        }
        this.cfr_renamed_5 = this.var_int_if + 2 * bn_0.cfr_renamed_6;
        this.soLuongKhoa = bn_0.var_byte_try << 1;
        this.soLuong = 0;
        this.cfr_renamed_2 = GameCanvas.var_int_byte / this.cfr_renamed_5;
        if (ec.boolean_if(vector.size() * this.cfr_renamed_5, GameCanvas.var_int_byte)) {
            this.soLuong = (GameCanvas.var_int_byte - vector.size() * this.cfr_renamed_5) / 2;
            } else {
            this.soLuong = (GameCanvas.var_int_byte - this.cfr_renamed_2 * this.cfr_renamed_5) / 2;
        }
        this.var_short_arr_do = new short[vector.size()];
        int n = 0;
        while (!(n >= this.var_short_arr_do.length)) {
            this.var_short_arr_do[n] = -40;
            ++n;
        }
        if ((this.cfr_renamed_4 >= vector.size())) {
            this.cfr_renamed_4 = 0;
        }
        if ((fe_0.duLieuNguoiChoi != null) && ec.boolean_if(GameCanvas.cfr_renamed_16)) {
            fe_0.duLieuNguoiChoi.dangChayAuto = 1;
        }
        if (ec.boolean_if(GameCanvas.cfr_renamed_16)) {
            this.soLuongKhoa = GameCanvas.var_int_long - (vector.size() / this.cfr_renamed_2 + 1) * this.var_int_if / 2;
        }
        this.cfr_renamed_8();
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            this.var_ei_new = this.var_ei_do;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void cfr_renamed_5() {
        block12: {
            block11: {
                if ((AngelChip.duLieuNguoiChoi.var_int_break != 0) && (AngelChip.duLieuNguoiChoi.var_int_break != -5)) {
                    return;
                }
                if (ec.cfr_renamed_3((int)eg.dangChayAuto)) {
                    return;
                }
                if ((ef_0.var_aG_do != null) && (ef_0.var_aG_do.var_byte_if == 5)) {
                    el_0.el_0_do().cfr_renamed_2(((dB)ef_0.var_aG_do).soLuong);
                    return;
                }
                if ((ef_0.var_aG_do != null) && (ef_0.var_aG_do.var_byte_if == 0) && ec.cfr_renamed_4(((DuLieuNguoiChoi)ef_0.var_aG_do).cfr_renamed_12, -100)) {
                    GameCanvas.hienThongBaoPopup(MenuChinhAvatar.ak, new q());
                    return;
                }
                var0 = new Vector<ei>();
                var1_1 = (MenuChinhAvatar.cm, 1, 1 == null);
                var2_4 = (MenuChinhAvatar.bs, 2, 0 == null);
                var3_5 = (MenuChinhAvatar.cA, 3, 20 == null);
                var4_6 = (MenuChinhAvatar.cY, 20, 17 == null);
                var5_7 = (MenuChinhAvatar.ap, 5, 18 == null);
                if ((GameCanvas.cfr_renamed_16 == 0)) {
                    var0.addElement(var3_5);
                }
                var0.addElement(var4_6);
                var0.addElement((ei)var2_4);
                if ((GameCanvas.cfr_renamed_16 == 0)) {
                    var0.addElement(fe_0.fe_0_do().var_ei_for);
                }
                if ((AngelChip.duLieuNguoiChoi.cfr_renamed_4 != 14)) {
                    var0.addElement(var1_1);
                }
                var0.addElement(var5_7);
                if (!ec.boolean_if(GameCanvas.cfr_renamed_16) || !(fe_0.var_java_util_Vector_for != null) || !ec.boolean_if(fe_0.var_java_util_Vector_for.size())) break block11;
                var1_2 = 0;
                if (" ".length() >= -" ".length()) ** GOTO lbl35
                return;
lbl-1000:
                // 1 sources

                {
                    var2_4 = (ev_0)fe_0.var_java_util_Vector_for.elementAt(var1_2);
                    var0.addElement(new m(var2_4.cfr_renamed_1, var1_2, (ev_0)var2_4));
                    ++var1_2;
lbl35:
                    // 2 sources

                    ** while (!ec.cfr_renamed_5((int)var1_2, (int)fe_0.var_java_util_Vector_for.size()))
                }
            }
            if (!ec.boolean_if(fe_0.var_java_util_Vector_if.size())) break block12;
            var1_3 = 0;
            if ("  ".length() < (64 + 77 - 113 + 165 ^ 55 + 103 - 63 + 102)) ** GOTO lbl47
            return;
lbl-1000:
            // 1 sources

            {
                var2_4 = (ev_0)fe_0.var_java_util_Vector_if.elementAt(var1_3);
                if ((var2_4.cfr_renamed_12 == 0)) {
                    var0.addElement(new cY(var2_4.cfr_renamed_1, var1_3, (ev_0)var2_4));
                }
                ++var1_3;
lbl47:
                // 2 sources

                ** while (!ec.cfr_renamed_5((int)var1_3, (int)fe_0.var_java_util_Vector_if.size()))
            }
        }
        if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
            return;
        }
        ec.cfr_renamed_0().cfr_renamed_0(var0);
    }

        public static ei (String string, cp cp2, int n == null) {
        return new dq(string, new dk(cp2), n);
    }

    public final void a_() {
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            this.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
            if ("  ".length() < "  ".length()) {
                return;
            }
        } else {
            this.coKichHoat = 1;
        }
        this.var_ei_do = new ei(MenuChinhAvatar.dg, 1);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        this.var_dL_do.cfr_renamed_1(var1_1);
        GameCanvas.cfr_renamed_1(var1_1);
        var2_2 = var1_1;
        var3_3 = this;
        if ((AngelChip.duLieuNguoiChoi.cfr_renamed_4 != 14)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_0(var2_2, AngelChip.duLieuNguoiChoi.cfr_renamed_3 * bn_0.cfr_renamed_6 - ek_0.ek_0_do().soLuong, AngelChip.duLieuNguoiChoi.var_int_if * bn_0.cfr_renamed_6 - ek_0.ek_0_do().cfr_renamed_3, 0);
        }
        var4_4 = (ei)var3_3.var_java_util_Vector_do.elementAt(var3_3.cfr_renamed_4);
        GameCanvas.var_ew_byte.cfr_renamed_0(var2_2, var4_4.chuoiGiaTri, GameCanvas.var_int_int, var3_3.soLuongKhoa - 15, 2);
        var2_2.translate(var3_3.soLuong, var3_3.soLuongKhoa);
        var5_6 = var3_3.var_java_util_Vector_do.size() - 1;
        if (-"   ".length() <= 0) ** GOTO lbl22
        return;
lbl-1000:
        // 1 sources

        {
            var4_5 = 0;
            var6_7 = (ei)var3_3.var_java_util_Vector_do.elementAt(var5_6);
            if ((var5_6 == var3_3.cfr_renamed_4) && ec.cfr_renamed_4((int)var3_3.coKichHoat)) {
                var4_5 = 4;
            }
            GameCanvas.var_gj_0_do.cfr_renamed_0(var2_2, var3_3.var_short_arr_do[var5_6], var5_6 / var3_3.cfr_renamed_2 * var3_3.cfr_renamed_5, var3_3.var_int_if, var3_3.var_int_if, var4_5);
            var6_7.cfr_renamed_0(var2_2, var3_3.cfr_renamed_5 / 2 + var3_3.var_short_arr_do[var5_6], var3_3.cfr_renamed_5 / 2 + var5_6 / var3_3.cfr_renamed_2 * var3_3.cfr_renamed_5);
            --var5_6;
lbl22:
            // 2 sources

            ** while (!ec.boolean_do((int)var5_6))
        }
lbl23:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

