/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class es
extends dL {
    private String tenNhanVat;
    public int soLuong;
    public dL var_dL_do;
    public static Vector var_java_util_Vector_do;
    public static Vector var_java_util_Vector_if;
    private int var_int_if;
    private boolean coTrangThai = 0;
    private ei var_ei_do;
    private int soLuongKhoa;
    public static String chuoiGiaTri;
    private static int[] mangSoNguyen;
    private ei var_ei_if;
    public static es var_es_do;
    public static Hashtable var_java_util_Hashtable_do;
    public static byte var_byte_do;
    public static boolean dangChayAuto;
    private int cfr_renamed_4;
    private boolean coKichHoat = 0;

    static boolean (es es2 == null) {
        return es2.coTrangThai;
    }

    public final void cfr_renamed_1() {
        this.var_ei_if = new ei(MenuChinhAvatar.dg, 3);
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            this.var_ei_new = this.var_ei_if;
        }
    }

    public final void cfr_renamed_15() {
        if ((t_0.dangChayAuto) && (GameCanvas.cfr_renamed_16 != 0)) {
            GameCanvas.var_gj_0_do.void_do(((bn_0)this).cfr_renamed_4, this.var_ei_new, this.var_ei_try);
            return;
        }
        super.cfr_renamed_15();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public final void (int n != boolean bl) {
        if ((bl) && es.boolean_do(n, this.soLuong)) {
            this.cfr_renamed_0(this.var_ei_if);
        }
        this.var_int_if = -20;
        if (es.boolean_if(n) && (n < var_java_util_Vector_do.size())) {
            this.soLuong = n;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (byte[] var1_1 != String var2_2) {
        var3_3 = null;
        var4_4 = null;
        var1_1 = new ByteArrayInputStream((byte[])var1_1);
        var1_1 = new DataInputStream((InputStream)var1_1);
        try {
            block20: {
                block19: {
                    block18: {
                        var5_5 = var1_1.readUTF();
                        var6_6 = var1_1.readInt();
                        var7_7 = var1_1.readByte();
                        var8_8 = var1_1.readByte();
                        var9_9 = var1_1.readShort();
                        var10_10 = new Vector<aG>();
                        if (!(var7_7 == 0)) break block18;
                        this.soLuongKhoa = 5;
                        var7_7 = 0;
                        if (-(197 ^ 137 ^ (100 ^ 45)) < 0) ** GOTO lbl26
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var11_11 = new ev_0();
                            new ev_0().cfr_renamed_5 = var1_1.readShort();
                            var11_11.cfr_renamed_1 = var1_1.readUTF();
                            var11_11.chuoiGiaTri = var1_1.readUTF();
                            var11_11.cfr_renamed_2 = GameCanvas.var_ew_case.cfr_renamed_0(var11_11.chuoiGiaTri);
                            var10_10.addElement(var11_11);
                            ++var7_7;
lbl26:
                            // 2 sources

                            ** while (!es.boolean_if((int)var7_7, (int)var9_9))
                        }
lbl27:
                        // 1 sources

                        if ("  ".length() < 0) {
                            return;
                        }
                        break block19;
                    }
                    this.soLuongKhoa = 6;
                    var7_7 = 0;
                    if ((70 ^ 66) > 0) ** GOTO lbl60
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var11_11 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().cfr_renamed_3 = (byte)0;
                        var12_14 = var1_1.readByte();
                        var11_11.var_java_util_Vector_if = new Vector<E>();
                        var13_16 = 0;
                        if (-" ".length() < (152 ^ 141 ^ (49 ^ 32))) ** GOTO lbl50
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var11_11.cfr_renamed_1(new ef(var1_1.readShort()));
                            ++var13_16;
lbl50:
                            // 2 sources

                            ** while (!es.boolean_if((int)var13_16, (int)var12_14))
                        }
lbl51:
                        // 1 sources

                        var11_11.cfr_renamed_12 = var1_1.readInt();
                        var11_11.var_short_if = var1_1.readShort();
                        if (es.cfr_renamed_5((int)var2_2.equals(es.chuoiGiaTri))) {
                            var11_11.var_short_byte = var1_1.readShort();
                            var11_11.var_short_catch = var1_1.readShort();
                        }
                        var11_11.chuoiGiaTri = var1_1.readUTF();
                        var11_11.chuoiPhu = var1_1.readUTF();
                        var10_10.addElement(var11_11);
                        ++var7_7;
lbl60:
                        // 2 sources

                        ** while (!es.boolean_if((int)var7_7, (int)var9_9))
                    }
                }
                v0 = var1_1.readByte();
                var7_7 = v0;
                if (!es.boolean_do(v0)) break block20;
                var3_3 = new String[var7_7];
                var4_4 = new byte[var7_7];
                var11_12 = 0;
                if (((86 ^ 113 ^ (46 ^ 66)) & (45 ^ 111 ^ (165 ^ 172) ^ -" ".length())) == ((115 ^ 58 ^ 12 + 94 - 86 + 107) & (205 ^ 199 ^ (140 ^ 176) ^ -" ".length()))) ** GOTO lbl75
                return;
lbl-1000:
                // 1 sources

                {
                    var4_4[var11_12] = var1_1.readByte();
                    var3_3[var11_12] = var1_1.readUTF();
                    ++var11_12;
lbl75:
                    // 2 sources

                    ** while (!es.boolean_if((int)var11_12, (int)var7_7))
                }
            }
            if (es.cfr_renamed_5((int)var2_2.equals(es.chuoiGiaTri))) {
                this.soLuongKhoa = 0;
            }
            es.cfr_renamed_0().cfr_renamed_0(var10_10, GameCanvas.var_dL_do);
            this.tenNhanVat = var5_5;
            this.cfr_renamed_12();
            if ((GameCanvas.var_dL_do != this)) {
                this.cfr_renamed_8();
            }
            var11_13 = var3_3;
            var12_15 = var4_4;
            this.cfr_renamed_4 = null;
            if (es.boolean_do(var7_7)) {
                this.cfr_renamed_4 = new ei(MenuChinhAvatar.Z, new cm_0(this, var2_2, var11_13, var6_6, var8_8, var12_15));
            }
            if (es.cfr_renamed_3((int)this.coTrangThai)) {
                if (es.cfr_renamed_5((int)var2_2.equals(es.chuoiGiaTri))) {
                    this.var_ei_if = new ei(MenuChinhAvatar.ba, 0);
                    if ((GameCanvas.cfr_renamed_16 == 0)) {
                        this.var_ei_new = this.var_ei_if;
                        if ((197 ^ 193) > (156 ^ 152)) {
                            return;
                        }
                    }
                } else if (es.cfr_renamed_3((int)this.coTrangThai)) {
                    this.var_ei_if = new ei(MenuChinhAvatar.dg, new ez(this, var6_6, var8_8));
                    if ((GameCanvas.cfr_renamed_16 == 0)) {
                        this.var_ei_new = this.var_ei_if;
                    }
                }
            }
            this.coTrangThai = 0;
            return;
        }
        catch (IOException v1) {
            v1.printStackTrace();
            return;
        }
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    public final void void_for() {
        if ((this.var_dL_do != null)) {
            this.var_dL_do.void_for();
        }
        cc_0.cc_0_do().void_do(ex.cfr_renamed_18, ex.cfr_renamed_5);
    }

    public static es cfr_renamed_0() {
        if (es.cfr_renamed_0((Object)var_es_do)) {
            var_es_do = new es();
        }
        return var_es_do;
    }

    public static void cfr_renamed_4() {
        var_java_util_Hashtable_do.remove(chuoiGiaTri);
        var_java_util_Vector_if = null;
    }

    public final void cfr_renamed_5() {
        GameCanvas.var_ex_do.cfr_renamed_0(20, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16, GameCanvas.var_int_byte - 40, this.cfr_renamed_4, GameCanvas.var_int_byte - 40, var_java_util_Vector_do.size() * this.cfr_renamed_4, GameCanvas.var_int_byte - 40, k.k_do().var_int_int - 5 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16), var_java_util_Vector_do.size());
        if (es.boolean_do(var_java_util_Vector_do.size())) {
            cc_0.cc_0_do().void_if(var_java_util_Vector_do.size() * this.cfr_renamed_4, k.k_do().var_int_int - 5 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16));
        }
    }

        private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public es() {
        this.var_int_if = -20;
        this.soLuongKhoa = 0;
        this.cfr_renamed_4 = 40 * bn_0.cfr_renamed_6;
    }

    /*
     * Unable to fully structure code
     */
    public static DuLieuNguoiChoi dd_0_do(int var0) {
        var1_1 = es.var_java_util_Vector_if.size();
        var2_2 = 0;
        if (" ".length() == " ".length()) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var3_3 = (DuLieuNguoiChoi)es.var_java_util_Vector_if.elementAt(var2_2);
            if (es.boolean_do(var3_3.cfr_renamed_12, var0)) {
                return var3_3;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!es.boolean_if((int)var2_2, (int)var1_1))
        }
lbl12:
        // 1 sources

        return null;
    }

    /*
     * Unable to fully structure code
     */
    private void (Vector var1_1 != dL var2_2) {
        block12: {
            if ((GameCanvas.var_dL_do != es.cfr_renamed_0())) {
                this.var_dL_do = var2_2;
            }
            switch (this.soLuongKhoa) {
                case 0: {
                    es.dangChayAuto = 1;
                    es.var_java_util_Vector_if = var1_1;
                    if (es.boolean_do(es.var_byte_do, 1)) {
                        fe_0.fe_0_do();
                        fe_0.cfr_renamed_3(fe_0.duLieuNguoiChoi);
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    } else if (es.boolean_do(es.var_byte_do, 2)) {
                        es.dangChayAuto = 0;
                        GameCanvas.cfr_renamed_5();
                        db_0.db_0_do().cfr_renamed_15(1);
                        if (((132 ^ 190 ^ (120 ^ 92) & ~(189 ^ 153)) & (236 ^ 192 ^ (62 ^ 40) ^ -" ".length())) > "   ".length()) {
                            return;
                        }
                    } else if ((GameCanvas.var_dL_do != this)) {
                        this.cfr_renamed_8();
                    }
                    es.var_byte_do = (byte)0;
                }
            }
            es.var_java_util_Vector_do = null;
            es.var_java_util_Vector_do = var1_1;
            if (!(this.soLuongKhoa != 5)) break block12;
            var2_3 = 0;
            if ("   ".length() >= "  ".length()) ** GOTO lbl42
            return;
lbl-1000:
            // 1 sources

            {
                var1_1 = (DuLieuNguoiChoi)es.var_java_util_Vector_do.elementAt(var2_3);
                var1_1.cfr_renamed_15();
                var1_1.void_if();
                ++var2_3;
lbl42:
                // 2 sources

                ** while (!es.boolean_if((int)var2_3, (int)es.var_java_util_Vector_do.size()))
            }
        }
        this.soLuong = 0;
        var2_2 = this;
        var2_2.var_ei_try = var2_2.var_ei_do;
        var2_2.cfr_renamed_5();
    }

        private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

        public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                es es2 = this;
                if (!es.boolean_if(es2.soLuong) || es.boolean_if(es2.soLuong, var_java_util_Vector_do.size())) {
                    return;
                }
                DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(es2.soLuong);
                dN.cfr_renamed_0().cfr_renamed_0(((bk_0)dd_02).cfr_renamed_12, dd_02.chuoiGiaTri);
                dN.cfr_renamed_0().void_do(es2.var_dL_do);
                return;
            }
            case 1: {
                es es3 = this;
                this.var_ei_new = null;
                es3.var_ei_try = null;
                ((bn_0)es3).cfr_renamed_4 = null;
                var_java_util_Vector_do = null;
                GameCanvas.var_ex_do.coTrangThai = 0;
                if ((es3.var_dL_do == null)) {
                    fe_0.fe_0_do().cfr_renamed_8();
                    return;
                }
                es3.var_dL_do.cfr_renamed_8();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                DuLieuNguoiChoi dd_03 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(es.cfr_renamed_0().soLuong);
                db_0.db_0_do().cfr_renamed_8(((bk_0)dd_03).cfr_renamed_12);
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 4: {
                GameCanvas.cfr_renamed_5();
                bF.bF_do().cfr_renamed_1(((bk_0)((DuLieuNguoiChoi)es.var_java_util_Vector_if.elementAt((int)this.soLuong))).cfr_renamed_12, 1);
            }
        }
    }

    public final boolean (String string == null) {
        byte[] byArray = (byte[])var_java_util_Hashtable_do.get(string);
        GameCanvas.cfr_renamed_8();
        if ((byArray == null)) {
            return 0;
        }
        this.cfr_renamed_0(byArray, string);
        return 1;
    }

    private static void cfr_renamed_11() {
        mangSoNguyen = new int[21];
        0 = (0x48 ^ 0x6F) & ~(0x83 ^ 0xA4) & ~((0xB3 ^ 0xBB) & ~(0x54 ^ 0x5C));
        1 = " ".length();
        20 = 0x1C ^ 8;
        40 = 0x2B ^ 3;
        5 = 9 ^ 0xC;
        2 = "  ".length();
        10 = 0x9A ^ 0x90;
        7 = 0x44 ^ 0x7D ^ (0xFB ^ 0xC5);
        -20 = -(0xD5 ^ 0xC1);
        4 = 74 + 146 - 38 + 7 ^ 79 + 54 - 64 + 116;
        8 = 0x2E ^ 0x26;
        3 = "   ".length();
        6 = 0x29 ^ 0x30 ^ (0 ^ 0x1F);
        12 = 0xAC ^ 0xA0;
        57 = 0x72 ^ 0x4B;
        30 = 0x5E ^ 0x40;
        25 = 0x35 ^ 0x1D ^ (0x17 ^ 0x26);
        -1 = -" ".length();
        60 = 0x1A ^ 0x5A ^ (0xEF ^ 0x93);
        47 = 94 + 113 - 139 + 60 ^ 122 + 91 - 61 + 23;
        9 = 0x37 ^ 4 ^ (0x82 ^ 0xB8);
    }

        public final void cfr_renamed_12() {
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            k.k_do().cfr_renamed_0(this.tenNhanVat, GameCanvas.var_int_byte - 20, GameCanvas.this - GameCanvas.var_int_else - 20, 1);
            if ("   ".length() < " ".length()) {
                return;
            }
        } else {
            int n;
            k k2 = k.k_do();
            int n2 = GameCanvas.var_int_byte - 20 * bn_0.cfr_renamed_6;
            int n3 = GameCanvas.var_int_char - GameCanvas.var_byte_do - GameCanvas.var_int_else - 10;
            if ((t_0.dangChayAuto)) {
                n = 7 * bn_0.cfr_renamed_6;
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else {
                n = 0;
            }
            k2.cfr_renamed_0(this.tenNhanVat, n2, n3 + n, 1);
        }
        k.k_do().soLuong = 10 + GameCanvas.var_byte_do;
        if ((var_java_util_Vector_do != null)) {
            this.cfr_renamed_5();
        }
    }

    static {
        es.cfr_renamed_11();
        var_java_util_Vector_do = new Vector();
        var_byte_do = (byte)0;
        dangChayAuto = 0;
        chuoiGiaTri = "friendlist";
        var_java_util_Hashtable_do = new Hashtable();
    }

    public final void cfr_renamed_8() {
        this.soLuong = 0;
        this.var_ei_try = this.var_ei_do = new ei(MenuChinhAvatar.cfr_renamed_7, 1);
        this.var_dL_do = null;
        if ((GameCanvas.var_dL_do != ec.cfr_renamed_0()) && (GameCanvas.var_dL_do != em_0.em_0_do()) && (GameCanvas.var_dL_do != es.cfr_renamed_0())) {
            this.var_dL_do = GameCanvas.var_dL_do;
        }
        this.cfr_renamed_12();
        super.cfr_renamed_8();
        if (es.boolean_do(GameCanvas.cfr_renamed_16)) {
            this.coKichHoat = 1;
        }
    }

            /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block21: {
            block20: {
                var1_1.setClip(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char);
                if ((this.var_dL_do != null)) {
                    this.var_dL_do.cfr_renamed_1(var1_1);
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    fe_0.fe_0_do().cfr_renamed_1(var1_1);
                }
                k.k_do().cfr_renamed_0(var1_1);
                var1_1.translate(0, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16);
                var1_1.setClip(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char);
                var2_2 = ex.cfr_renamed_18 / this.cfr_renamed_4;
                if ((var2_2 < 0)) {
                    var2_2 = 0;
                }
                if ((var3_5 = var2_2 + (GameCanvas.var_int_char - 40) / this.cfr_renamed_4 + 1 > es.var_java_util_Vector_do.size())) {
                    var3_5 = es.var_java_util_Vector_do.size();
                }
                if (!es.boolean_do(this.soLuongKhoa, 5)) break block20;
                var4_8 = var3_5;
                var5_10 = var2_2;
                var3_6 = var1_1;
                var2_3 = this;
                var6_13 = 0 + var2_3.cfr_renamed_4 * var5_10;
                var7_15 = var5_10;
                if (-"  ".length() < 0) ** GOTO lbl49
                return;
lbl-1000:
                // 1 sources

                {
                    var3_6.setClip(10 * bn_0.cfr_renamed_6 + 4 + bn_0.cfr_renamed_6, 0, k.k_do().cfr_renamed_5 - 8 - (bn_0.cfr_renamed_6 << 1), k.k_do().var_int_int - 5 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16));
                    var3_6.translate(0, -ex.cfr_renamed_18);
                    var5_11 = (ev_0)es.var_java_util_Vector_do.elementAt(var7_15);
                    var8_17 = 0;
                    if (es.cfr_renamed_3((int)var2_3.coKichHoat) && es.boolean_do(var7_15, var2_3.soLuong)) {
                        GameCanvas.var_gj_0_do.cfr_renamed_1(var3_6, 10 * bn_0.cfr_renamed_6 + 3 + 2 * bn_0.cfr_renamed_6, var6_13 + 2, GameCanvas.var_int_byte - 20 * bn_0.cfr_renamed_6 - 6 - 4 * bn_0.cfr_renamed_6, var2_3.cfr_renamed_4 - 4);
                        if ((var5_11.cfr_renamed_2 > k.k_do().cfr_renamed_5 - 40)) {
                            var2_3.var_int_if += 2;
                            if (es.cfr_renamed_4(var2_3.var_int_if, var5_11.cfr_renamed_2 - (k.k_do().cfr_renamed_5 - 40))) {
                                var2_3.var_int_if = -20;
                            }
                        }
                        var8_17 = var2_3.var_int_if;
                        if ((var2_3.var_int_if < 0)) {
                            var8_17 = 0;
                        }
                    }
                    var9_19 = ci_0.cfr_renamed_1((short)((short)var5_11.cfr_renamed_5)).var_short_do + 4;
                    ci_0.cfr_renamed_0(var3_6, var5_11.cfr_renamed_5, 10 * bn_0.cfr_renamed_6 + 10 + var9_19 / 2, var6_13 + var2_3.cfr_renamed_4 / 2 - 12 * bn_0.cfr_renamed_6 + bn_0.var_byte_new / 2, 3);
                    GameCanvas.var_ew_try.cfr_renamed_0(var3_6, var5_11.cfr_renamed_1, 10 * bn_0.cfr_renamed_6 + 10 + var9_19, var6_13 + var2_3.cfr_renamed_4 / 2 - 12 * bn_0.cfr_renamed_6, 0);
                    GameCanvas.var_ew_case.cfr_renamed_0(var3_6, var5_11.chuoiGiaTri, 10 * bn_0.cfr_renamed_6 + 10 - var8_17, var6_13 + var2_3.cfr_renamed_4 / 2 + 3 * bn_0.cfr_renamed_6, 0);
                    var6_13 += var2_3.cfr_renamed_4;
                    var3_6.translate(0, ex.cfr_renamed_18);
                    ++var7_15;
lbl49:
                    // 2 sources

                    ** while (!es.boolean_if((int)var7_15, (int)var4_8))
                }
lbl50:
                // 1 sources

                if (((136 ^ 164) & ~(100 ^ 72)) != 0) {
                    return;
                }
                break block21;
            }
            if ((this.soLuongKhoa != 6) && !(this.soLuongKhoa == 0)) break block21;
            var4_9 = var3_5;
            var5_12 = var2_2;
            var3_7 = var1_1;
            var2_4 = this;
            var7_16 = 0;
            var6_14 = 0 + var2_4.cfr_renamed_4 * var5_12;
            if (-"  ".length() < 0) ** GOTO lbl97
            return;
lbl-1000:
            // 1 sources

            {
                var3_7.setClip(10 * bn_0.cfr_renamed_6 + 4, 0, k.k_do().cfr_renamed_5 - 8, k.k_do().var_int_int - 5 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16));
                var3_7.translate(0, -ex.cfr_renamed_18);
                var8_18 = (DuLieuNguoiChoi)es.var_java_util_Vector_do.elementAt(var5_12);
                var9_20 = 0;
                if (es.cfr_renamed_3((int)var2_4.coKichHoat) && es.boolean_do(var5_12, var2_4.soLuong)) {
                    GameCanvas.var_gj_0_do.cfr_renamed_1(var3_7, 10 * bn_0.cfr_renamed_6 + 3 + 2 * bn_0.cfr_renamed_6, var6_14 + 2, GameCanvas.var_int_byte - 20 * bn_0.cfr_renamed_6 - 6 - 4 * bn_0.cfr_renamed_6, var2_4.cfr_renamed_4 - 4);
                    var10_21 = GameCanvas.var_ew_case.cfr_renamed_0(var8_18.chuoiPhu);
                    if (es.cfr_renamed_4(var10_21, k.k_do().cfr_renamed_5 - (57 + (bn_0.cfr_renamed_6 - 1) * 30))) {
                        var2_4.var_int_if += 2;
                        if (es.cfr_renamed_4(var2_4.var_int_if, var10_21 - (k.k_do().cfr_renamed_5 - (57 + (bn_0.cfr_renamed_6 - 1) * 30)))) {
                            var2_4.var_int_if = -20;
                        }
                    }
                    var9_20 = var2_4.var_int_if;
                    if ((var2_4.var_int_if < 0)) {
                        var9_20 = 0;
                    }
                }
                var8_18.cfr_renamed_0(var3_7, 10 * bn_0.cfr_renamed_6 + 25 + (bn_0.cfr_renamed_6 - 1) * 20, var6_14 + var2_4.cfr_renamed_4 - 5 * bn_0.cfr_renamed_6, 0);
                var10_21 = 0;
                if ((var8_18.var_short_if != -1)) {
                    var10_21 = 6 * bn_0.cfr_renamed_6;
                    ci_0.cfr_renamed_0(var3_7, var8_18.var_short_if, 60 + (bn_0.cfr_renamed_6 - 1) * 30 + var10_21, var6_14 + var2_4.cfr_renamed_4 / 2 - 12 * bn_0.cfr_renamed_6 + bn_0.var_byte_new / 2, 3);
                }
                var3_7.setClip(60 + (bn_0.cfr_renamed_6 - 1) * 30, ex.cfr_renamed_18, k.k_do().cfr_renamed_5 - (47 + (bn_0.cfr_renamed_6 - 1) * 30), k.k_do().var_int_int - 5 - (k.var_byte_do + 2 * bn_0.cfr_renamed_16));
                GameCanvas.var_ew_try.cfr_renamed_0(var3_7, var8_18.chuoiGiaTri, 60 + (var10_21 << 1) + (bn_0.cfr_renamed_6 - 1) * 30, var6_14 + var2_4.cfr_renamed_4 / 2 - 12 * bn_0.cfr_renamed_6, 0);
                if ((var8_18.var_short_byte != -1)) {
                    ci_0.cfr_renamed_0(var3_7, var8_18.var_short_byte, 60 + 6 * bn_0.cfr_renamed_6 + (var10_21 << 1) + (bn_0.cfr_renamed_6 - 1) * 30 + GameCanvas.var_ew_try.cfr_renamed_0(var8_18.chuoiGiaTri), var6_14 + var2_4.cfr_renamed_4 / 2 - 12 * bn_0.cfr_renamed_6 + bn_0.var_byte_new / 2, 3);
                }
                if ((var8_18.var_short_catch != -1)) {
                    var7_16 = 12 * bn_0.cfr_renamed_6;
                    ci_0.cfr_renamed_0(var3_7, var8_18.var_short_catch, 60 - var9_20 + (bn_0.cfr_renamed_6 - 1) * 30 + 6 * bn_0.cfr_renamed_6, var6_14 + var2_4.cfr_renamed_4 / 2 + 3 * bn_0.cfr_renamed_6 + bn_0.cfr_renamed_15 / 2, 3);
                }
                GameCanvas.var_ew_case.cfr_renamed_0(var3_7, var8_18.chuoiPhu, 60 - var9_20 + (bn_0.cfr_renamed_6 - 1) * 30 + var7_16, var6_14 + var2_4.cfr_renamed_4 / 2 + 3 * bn_0.cfr_renamed_6, 0);
                var6_14 += var2_4.cfr_renamed_4;
                var3_7.translate(0, ex.cfr_renamed_18);
                ++var5_12;
lbl97:
                // 2 sources

                ** while (!es.boolean_if((int)var5_12, (int)var4_9))
            }
        }
        cc_0.cc_0_do().cfr_renamed_0(var1_1, GameCanvas.var_int_byte - 10 * bn_0.cfr_renamed_6 - 9 - bn_0.cfr_renamed_6);
        GameCanvas.cfr_renamed_1(var1_1);
        if (es.cfr_renamed_5((int)t_0.dangChayAuto)) {
            t_0.cfr_renamed_0(var1_1, this.cfr_renamed_4, this.var_ei_new, this.var_ei_try);
            return;
        }
        super.cfr_renamed_0(var1_1);
    }

    public final void (boolean bl != null) {
        this.coKichHoat = bl;
    }

                public final void (boolean bl == null) {
        this.soLuongKhoa = 0;
        if ((var_java_util_Vector_if == null)) {
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_2();
            } else {
            this.var_dL_do = GameCanvas.var_dL_do;
            this.cfr_renamed_0(chuoiGiaTri);
            if ((GameCanvas.var_dL_do != this)) {
                this.cfr_renamed_8();
            }
        }
        if ((bl)) {
            this.coTrangThai = 1;
            this.var_ei_if = new ei(MenuChinhAvatar.dg, 4);
            if ((GameCanvas.cfr_renamed_16 == 0)) {
                this.var_ei_new = this.var_ei_if;
            }
        }
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 50: {
                cd_0.cd_0_do().cfr_renamed_2();
            }
        }
    }
}

