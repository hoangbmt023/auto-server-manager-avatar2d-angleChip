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

/*
 * Renamed from fV
 */
public final class fv_0
extends en {
    public static Vector var_java_util_Vector_do;
    private int var_int_if;
    public static Hashtable var_java_util_Hashtable_do;
    public en var_en_do;
    private fl_0 var_fl_0_do;
    private int soLuongKhoa;
    private boolean coTrangThai = 0;
    public int soLuong;
    public static Vector var_java_util_Vector_if;
    public static String chuoiGiaTri;
    private static int[] mangSoNguyen;
    private fl_0 var_fl_0_if;
    private int cfr_renamed_3;
    public static fv_0 var_fv_0_do;
    public static boolean dangChayAuto;
    private boolean coKichHoat = 0;
    private String tenNhanVat;
    public static byte var_byte_do;

        /*
     * Enabled aggressive block sorting
     */
    private void (Vector object != en en2) {
        if ((GameCanvas.var_en_do != fv_0.cfr_renamed_1())) {
            this.var_en_do = en2;
        }
        switch (this.var_int_if) {
            case 0: {
                dangChayAuto = 1;
                var_java_util_Vector_do = object;
                if (fv_0.boolean_if(var_byte_do, 1)) {
                    go_0.go_0_do();
                    go_0.cfr_renamed_0(go_0.var_ef_if);
                    } else if (fv_0.boolean_if(var_byte_do, 2)) {
                    dangChayAuto = 0;
                    GameCanvas.cfr_renamed_8();
                    ep_0.ep_0_do().cfr_renamed_6(1);
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                } else if ((GameCanvas.var_en_do != this)) {
                    this.cfr_renamed_4();
                }
                var_byte_do = (byte)0;
                break;
            }
        }
        var_java_util_Vector_if = null;
        var_java_util_Vector_if = object;
        if ((this.var_int_if != 5)) {
            int n = 0;
            while (!(n >= var_java_util_Vector_if.size())) {
                object = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
                ((DuLieuNguoiChoi)object).cfr_renamed_6();
                ((DuLieuNguoiChoi)object).void_if();
                ++n;
            }
        }
        this.soLuong = 0;
        en2 = this;
        en2.var_fl_0_new = ((fv_0)en2).var_fl_0_do;
        ((fv_0)en2).cfr_renamed_8();
    }

    public final void cfr_renamed_2() {
        if (fv_0.boolean_int(GameCanvas.cfr_renamed_12)) {
            v_0.v_0_do().cfr_renamed_1(this.tenNhanVat, GameCanvas.soLuongKhoa - 20, GameCanvas.var_int_int - GameCanvas.this - 20, 1);
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            int n;
            v_0 v_02 = v_0.v_0_do();
            int n2 = GameCanvas.soLuongKhoa - 20 * dF.cfr_renamed_12;
            int n3 = GameCanvas.var_int_case - GameCanvas.var_byte_do - GameCanvas.this - 10;
            if (fv_0.boolean_do(al_0.dangChayAuto ? 1 : 0)) {
                n = 7 * dF.cfr_renamed_12;
                } else {
                n = 0;
            }
            v_02.cfr_renamed_1(this.tenNhanVat, n2, n3 + n, 1);
        }
        v_0.v_0_do().cfr_renamed_6 = 10 + GameCanvas.var_byte_do;
        if ((var_java_util_Vector_if > 0)) {
            this.cfr_renamed_8();
        }
    }

    public final void cfr_renamed_3() {
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.cT, 3);
        if (fv_0.boolean_int(GameCanvas.cfr_renamed_12)) {
            ((dF)this).cfr_renamed_3 = this.var_fl_0_if;
        }
    }

    private static void cfr_renamed_13() {
        mangSoNguyen = new int[21];
        0 = (0x20 ^ 1) & ~(0x84 ^ 0xA5);
        1 = " ".length();
        20 = "  ".length() ^ (0x88 ^ 0x9E);
        40 = 0xB9 ^ 0x91;
        5 = 0x33 ^ 0x4B ^ (0xF0 ^ 0x8D);
        2 = "  ".length();
        10 = 0x41 ^ 0x4B;
        7 = 0x8E ^ 0x89;
        -20 = -(0x57 ^ 0x5E ^ (0x2C ^ 0x31));
        4 = 0x82 ^ 0xBD ^ (0x32 ^ 9);
        8 = 0x83 ^ 0x8B;
        3 = "   ".length();
        6 = 0x80 ^ 0x86;
        12 = 0x5A ^ 0x5E ^ (0x86 ^ 0x8E);
        57 = 5 ^ 0x3C;
        30 = 0x41 ^ 0x32 ^ (0x4C ^ 0x21);
        25 = 0x1A ^ 0x4A ^ (0x23 ^ 0x6A);
        -1 = -" ".length();
        60 = 0x92 ^ 0xAE;
        47 = 0x7C ^ 0x53;
        9 = 71 + 53 - 103 + 136 ^ 22 + 102 - 26 + 50;
    }

    static boolean (fv_0 fv_02 == null) {
        return fv_02.coTrangThai;
    }

    public final void (boolean bl == null) {
        this.coKichHoat = bl;
    }

    public static void cfr_renamed_5() {
        var_java_util_Hashtable_do.remove(chuoiGiaTri);
        var_java_util_Vector_do = null;
    }

    public final void cfr_renamed_6() {
        if (fv_0.boolean_do(al_0.dangChayAuto ? 1 : 0) && fv_0.boolean_do(GameCanvas.cfr_renamed_12)) {
            GameCanvas.var_fa_0_do.void_do(this.var_fl_0_try, ((dF)this).cfr_renamed_3, this.var_fl_0_new);
            return;
        }
        super.cfr_renamed_6();
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
                        var10_10 = new Vector<bm>();
                        if (!fv_0.boolean_int(var7_7)) break block18;
                        this.var_int_if = 5;
                        var7_7 = 0;
                        if ((10 ^ 14) != 0) ** GOTO lbl26
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var11_11 = new fx();
                            new fx().cfr_renamed_5 = var1_1.readShort();
                            var11_11.chuoiGiaTri = var1_1.readUTF();
                            var11_11.cfr_renamed_0 = var1_1.readUTF();
                            var11_11.soLuong = GameCanvas.var_fz_0_case.cfr_renamed_1(var11_11.cfr_renamed_0);
                            var10_10.addElement(var11_11);
                            ++var7_7;
lbl26:
                            // 2 sources

                            ** while (!fv_0.cfr_renamed_4((int)var7_7, (int)var9_9))
                        }
lbl27:
                        // 1 sources

                        if ("  ".length() <= " ".length()) {
                            return;
                        }
                        break block19;
                    }
                    this.var_int_if = 6;
                    var7_7 = 0;
                    if (-" ".length() <= 0) ** GOTO lbl60
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var11_11 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().var_byte_new = (byte)0;
                        var12_14 = var1_1.readByte();
                        var11_11.var_java_util_Vector_if = new Vector<E>();
                        var13_16 = 0;
                        if (-"  ".length() < 0) ** GOTO lbl50
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var11_11.cfr_renamed_0(new cg(var1_1.readShort()));
                            ++var13_16;
lbl50:
                            // 2 sources

                            ** while (!fv_0.cfr_renamed_4((int)var13_16, (int)var12_14))
                        }
lbl51:
                        // 1 sources

                        var11_11.cfr_renamed_9 = var1_1.readInt();
                        var11_11.var_short_break = var1_1.readShort();
                        if (fv_0.boolean_do((int)var2_2.equals(fv_0.chuoiGiaTri))) {
                            var11_11.cfr_renamed_23 = var1_1.readShort();
                            var11_11.var_short_class = var1_1.readShort();
                        }
                        var11_11.chuoiGiaTri = var1_1.readUTF();
                        var11_11.var_java_lang_String_int = var1_1.readUTF();
                        var10_10.addElement(var11_11);
                        ++var7_7;
lbl60:
                        // 2 sources

                        ** while (!fv_0.cfr_renamed_4((int)var7_7, (int)var9_9))
                    }
                }
                v0 = var1_1.readByte();
                var7_7 = v0;
                if (!(v0 > 0)) break block20;
                var3_3 = new String[var7_7];
                var4_4 = new byte[var7_7];
                var11_12 = 0;
                if (null == null) ** GOTO lbl75
                return;
lbl-1000:
                // 1 sources

                {
                    var4_4[var11_12] = var1_1.readByte();
                    var3_3[var11_12] = var1_1.readUTF();
                    ++var11_12;
lbl75:
                    // 2 sources

                    ** while (!fv_0.cfr_renamed_4((int)var11_12, (int)var7_7))
                }
            }
            if (fv_0.boolean_do((int)var2_2.equals(fv_0.chuoiGiaTri))) {
                this.var_int_if = 0;
            }
            fv_0.cfr_renamed_1().cfr_renamed_1(var10_10, GameCanvas.var_en_do);
            this.tenNhanVat = var5_5;
            this.cfr_renamed_2();
            if ((GameCanvas.var_en_do != this)) {
                this.cfr_renamed_4();
            }
            var11_13 = var3_3;
            var12_15 = var4_4;
            this.var_fl_0_try = null;
            if ((var7_7 > 0)) {
                this.var_fl_0_try = new fl_0(MenuChinhAvatar.bR, new ef_0(this, var2_2, var11_13, var6_6, var8_8, var12_15));
            }
            if (fv_0.boolean_int((int)this.coTrangThai)) {
                if (fv_0.boolean_do((int)var2_2.equals(fv_0.chuoiGiaTri))) {
                    this.var_fl_0_if = new fl_0(MenuChinhAvatar.cfr_renamed_46, 0);
                    if (fv_0.boolean_int(GameCanvas.cfr_renamed_12)) {
                        this.cfr_renamed_3 = this.var_fl_0_if;
                        if (" ".length() < -" ".length()) {
                            return;
                        }
                    }
                } else if (fv_0.boolean_int((int)this.coTrangThai)) {
                    this.var_fl_0_if = new fl_0(MenuChinhAvatar.cT, new cj_0(this, var6_6, var8_8));
                    if (fv_0.boolean_int(GameCanvas.cfr_renamed_12)) {
                        this.cfr_renamed_3 = this.var_fl_0_if;
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

    public static fv_0 cfr_renamed_1() {
        if (fv_0.cfr_renamed_1((Object)var_fv_0_do)) {
            var_fv_0_do = new fv_0();
        }
        return var_fv_0_do;
    }

    public fv_0() {
        this.soLuongKhoa = -20;
        this.var_int_if = 0;
        this.cfr_renamed_3 = 40 * dF.cfr_renamed_12;
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public final void (boolean bl > 0) {
        this.var_int_if = 0;
        if ((var_java_util_Vector_do == null)) {
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_2();
            if ((118 + 19 - 9 + 58 ^ 181 + 142 - 306 + 173) <= ((0x98 ^ 0xAE ^ " ".length()) & (2 + 50 - 19 + 117 ^ 64 + 4 - -36 + 57 ^ -" ".length()))) {
                return;
            }
        } else {
            this.var_en_do = GameCanvas.var_en_do;
            this.cfr_renamed_1(chuoiGiaTri);
            if ((GameCanvas.var_en_do != this)) {
                this.cfr_renamed_4();
            }
        }
        if (fv_0.boolean_do(bl ? 1 : 0)) {
            this.coTrangThai = 1;
            this.var_fl_0_if = new fl_0(MenuChinhAvatar.cT, 4);
            if (fv_0.boolean_int(GameCanvas.cfr_renamed_12)) {
                ((dF)this).cfr_renamed_3 = this.var_fl_0_if;
            }
        }
    }

        public final void cfr_renamed_8() {
        GameCanvas.var_cg_0_do.cfr_renamed_1(20, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15, GameCanvas.soLuongKhoa - 40, this.cfr_renamed_3, GameCanvas.soLuongKhoa - 40, var_java_util_Vector_if.size() * this.cfr_renamed_3, GameCanvas.soLuongKhoa - 40, v_0.v_0_do().var_int_if - 5 - (v_0.var_byte_do + 2 * dF.cfr_renamed_15), var_java_util_Vector_if.size());
        if ((var_java_util_Vector_if.size() > 0)) {
            cp_0.cp_0_do().void_do(var_java_util_Vector_if.size() * this.cfr_renamed_3, v_0.v_0_do().var_int_if - 5 - (v_0.var_byte_do + 2 * dF.cfr_renamed_15));
        }
    }

    public final void (int n != boolean bl) {
        if (fv_0.boolean_do(bl ? 1 : 0) && fv_0.boolean_if(n, this.soLuong)) {
            this.cfr_renamed_1(this.var_fl_0_if);
        }
        this.soLuongKhoa = -20;
        if (fv_0.boolean_for(n) && fv_0.boolean_do(n, var_java_util_Vector_if.size())) {
            this.soLuong = n;
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                fv_0 fv_02 = this;
                if (!fv_0.boolean_for(fv_02.soLuong) || (fv_02.soLuong >= var_java_util_Vector_if.size())) {
                    return;
                }
                DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(fv_02.soLuong);
                ep.cfr_renamed_1().cfr_renamed_1(((dd_0)ef2).cfr_renamed_9, ef2.chuoiGiaTri);
                ep.cfr_renamed_1().void_do(fv_02.var_en_do);
                return;
            }
            case 1: {
                fv_0 fv_03 = this;
                ((dF)this).cfr_renamed_3 = null;
                fv_03.var_fl_0_new = null;
                fv_03.var_fl_0_try = null;
                var_java_util_Vector_if = null;
                GameCanvas.var_cg_0_do.coTrangThai = 0;
                if ((fv_03.var_en_do == null)) {
                    go_0.go_0_do().cfr_renamed_4();
                    return;
                }
                fv_03.var_en_do.cfr_renamed_4();
                return;
            }
            case 2: {
                return;
            }
            case 3: {
                DuLieuNguoiChoi ef3 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(fv_0.cfr_renamed_1().soLuong);
                ep_0.ep_0_do().cfr_renamed_4(((dd_0)ef3).cfr_renamed_9);
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 4: {
                GameCanvas.cfr_renamed_8();
                dR.dR_do().cfr_renamed_0(((dd_0)((DuLieuNguoiChoi)fv_0.var_java_util_Vector_do.elementAt((int)this.soLuong))).cfr_renamed_9, 1);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block21: {
            block20: {
                var1_1.setClip(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
                if ((this.var_en_do > 0)) {
                    this.var_en_do.cfr_renamed_0(var1_1);
                    if (" ".length() == (106 ^ 115 ^ (131 ^ 158))) {
                        return;
                    }
                } else {
                    go_0.go_0_do().cfr_renamed_0(var1_1);
                }
                v_0.v_0_do().cfr_renamed_1(var1_1);
                var1_1.translate(0, v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15);
                var1_1.setClip(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case);
                var2_2 = cg_0.cfr_renamed_9 / this.cfr_renamed_3;
                if ((var2_2 < 0)) {
                    var2_2 = 0;
                }
                if ((var3_5 = var2_2 + (GameCanvas.var_int_case - 40) / this.cfr_renamed_3 + 1 > fv_0.var_java_util_Vector_if.size())) {
                    var3_5 = fv_0.var_java_util_Vector_if.size();
                }
                if (!fv_0.boolean_if(this.var_int_if, 5)) break block20;
                var4_8 = var3_5;
                var5_10 = var2_2;
                var3_6 = var1_1;
                var2_3 = this;
                var6_13 = 0 + var2_3.cfr_renamed_3 * var5_10;
                var7_15 = var5_10;
                if ("  ".length() <= "   ".length()) ** GOTO lbl49
                return;
lbl-1000:
                // 1 sources

                {
                    var3_6.setClip(10 * dF.cfr_renamed_12 + 4 + dF.cfr_renamed_12, 0, v_0.v_0_do().soLuongKhoa - 8 - (dF.cfr_renamed_12 << 1), v_0.v_0_do().var_int_if - 5 - (v_0.var_byte_do + 2 * dF.cfr_renamed_15));
                    var3_6.translate(0, -cg_0.cfr_renamed_9);
                    var5_11 = (fx)fv_0.var_java_util_Vector_if.elementAt(var7_15);
                    var8_17 = 0;
                    if (fv_0.boolean_int((int)var2_3.coKichHoat) && fv_0.boolean_if(var7_15, var2_3.soLuong)) {
                        GameCanvas.var_fa_0_do.cfr_renamed_3(var3_6, 10 * dF.cfr_renamed_12 + 3 + 2 * dF.cfr_renamed_12, var6_13 + 2, GameCanvas.soLuongKhoa - 20 * dF.cfr_renamed_12 - 6 - 4 * dF.cfr_renamed_12, var2_3.cfr_renamed_3 - 4);
                        if ((var5_11.soLuong > v_0.v_0_do().soLuongKhoa - 40)) {
                            var2_3.soLuongKhoa += 2;
                            if (fv_0.cfr_renamed_2(var2_3.soLuongKhoa, var5_11.soLuong - (v_0.v_0_do().soLuongKhoa - 40))) {
                                var2_3.soLuongKhoa = -20;
                            }
                        }
                        var8_17 = var2_3.soLuongKhoa;
                        if ((var2_3.soLuongKhoa < 0)) {
                            var8_17 = 0;
                        }
                    }
                    var9_19 = aa_0.cfr_renamed_0((short)((short)var5_11.cfr_renamed_5)).cfr_renamed_0 + 4;
                    aa_0.cfr_renamed_1(var3_6, var5_11.cfr_renamed_5, 10 * dF.cfr_renamed_12 + 10 + var9_19 / 2, var6_13 + var2_3.cfr_renamed_3 / 2 - 12 * dF.cfr_renamed_12 + dF.var_byte_try / 2, 3);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_6, var5_11.chuoiGiaTri, 10 * dF.cfr_renamed_12 + 10 + var9_19, var6_13 + var2_3.cfr_renamed_3 / 2 - 12 * dF.cfr_renamed_12, 0);
                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_6, var5_11.cfr_renamed_0, 10 * dF.cfr_renamed_12 + 10 - var8_17, var6_13 + var2_3.cfr_renamed_3 / 2 + 3 * dF.cfr_renamed_12, 0);
                    var6_13 += var2_3.cfr_renamed_3;
                    var3_6.translate(0, cg_0.cfr_renamed_9);
                    ++var7_15;
lbl49:
                    // 2 sources

                    ** while (!fv_0.cfr_renamed_4((int)var7_15, (int)var4_8))
                }
lbl50:
                // 1 sources

                if (-" ".length() > "  ".length()) {
                    return;
                }
                break block21;
            }
            if ((this.var_int_if != 6) && !fv_0.boolean_int(this.var_int_if)) break block21;
            var4_9 = var3_5;
            var5_12 = var2_2;
            var3_7 = var1_1;
            var2_4 = this;
            var7_16 = 0;
            var6_14 = 0 + var2_4.cfr_renamed_3 * var5_12;
            if (((115 ^ 55) & ~(114 ^ 54)) == 0) ** GOTO lbl97
            return;
lbl-1000:
            // 1 sources

            {
                var3_7.setClip(10 * dF.cfr_renamed_12 + 4, 0, v_0.v_0_do().soLuongKhoa - 8, v_0.v_0_do().var_int_if - 5 - (v_0.var_byte_do + 2 * dF.cfr_renamed_15));
                var3_7.translate(0, -cg_0.cfr_renamed_9);
                var8_18 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_if.elementAt(var5_12);
                var9_20 = 0;
                if (fv_0.boolean_int((int)var2_4.coKichHoat) && fv_0.boolean_if(var5_12, var2_4.soLuong)) {
                    GameCanvas.var_fa_0_do.cfr_renamed_3(var3_7, 10 * dF.cfr_renamed_12 + 3 + 2 * dF.cfr_renamed_12, var6_14 + 2, GameCanvas.soLuongKhoa - 20 * dF.cfr_renamed_12 - 6 - 4 * dF.cfr_renamed_12, var2_4.cfr_renamed_3 - 4);
                    var10_21 = GameCanvas.var_fz_0_case.cfr_renamed_1(var8_18.var_java_lang_String_int);
                    if (fv_0.cfr_renamed_2(var10_21, v_0.v_0_do().soLuongKhoa - (57 + (dF.cfr_renamed_12 - 1) * 30))) {
                        var2_4.soLuongKhoa += 2;
                        if (fv_0.cfr_renamed_2(var2_4.soLuongKhoa, var10_21 - (v_0.v_0_do().soLuongKhoa - (57 + (dF.cfr_renamed_12 - 1) * 30)))) {
                            var2_4.soLuongKhoa = -20;
                        }
                    }
                    var9_20 = var2_4.soLuongKhoa;
                    if ((var2_4.soLuongKhoa < 0)) {
                        var9_20 = 0;
                    }
                }
                var8_18.cfr_renamed_1(var3_7, 10 * dF.cfr_renamed_12 + 25 + (dF.cfr_renamed_12 - 1) * 20, var6_14 + var2_4.cfr_renamed_3 - 5 * dF.cfr_renamed_12, 0);
                var10_21 = 0;
                if ((var8_18.var_short_break != -1)) {
                    var10_21 = 6 * dF.cfr_renamed_12;
                    aa_0.cfr_renamed_1(var3_7, var8_18.var_short_break, 60 + (dF.cfr_renamed_12 - 1) * 30 + var10_21, var6_14 + var2_4.cfr_renamed_3 / 2 - 12 * dF.cfr_renamed_12 + dF.var_byte_try / 2, 3);
                }
                var3_7.setClip(60 + (dF.cfr_renamed_12 - 1) * 30, cg_0.cfr_renamed_9, v_0.v_0_do().soLuongKhoa - (47 + (dF.cfr_renamed_12 - 1) * 30), v_0.v_0_do().var_int_if - 5 - (v_0.var_byte_do + 2 * dF.cfr_renamed_15));
                GameCanvas.var_fz_0_try.cfr_renamed_1(var3_7, var8_18.chuoiGiaTri, 60 + (var10_21 << 1) + (dF.cfr_renamed_12 - 1) * 30, var6_14 + var2_4.cfr_renamed_3 / 2 - 12 * dF.cfr_renamed_12, 0);
                if ((var8_18.cfr_renamed_23 != -1)) {
                    aa_0.cfr_renamed_1(var3_7, var8_18.cfr_renamed_23, 60 + 6 * dF.cfr_renamed_12 + (var10_21 << 1) + (dF.cfr_renamed_12 - 1) * 30 + GameCanvas.var_fz_0_try.cfr_renamed_1(var8_18.chuoiGiaTri), var6_14 + var2_4.cfr_renamed_3 / 2 - 12 * dF.cfr_renamed_12 + dF.var_byte_try / 2, 3);
                }
                if ((var8_18.var_short_class != -1)) {
                    var7_16 = 12 * dF.cfr_renamed_12;
                    aa_0.cfr_renamed_1(var3_7, var8_18.var_short_class, 60 - var9_20 + (dF.cfr_renamed_12 - 1) * 30 + 6 * dF.cfr_renamed_12, var6_14 + var2_4.cfr_renamed_3 / 2 + 3 * dF.cfr_renamed_12 + dF.var_byte_new / 2, 3);
                }
                GameCanvas.var_fz_0_case.cfr_renamed_1(var3_7, var8_18.var_java_lang_String_int, 60 - var9_20 + (dF.cfr_renamed_12 - 1) * 30 + var7_16, var6_14 + var2_4.cfr_renamed_3 / 2 + 3 * dF.cfr_renamed_12, 0);
                var6_14 += var2_4.cfr_renamed_3;
                var3_7.translate(0, cg_0.cfr_renamed_9);
                ++var5_12;
lbl97:
                // 2 sources

                ** while (!fv_0.cfr_renamed_4((int)var5_12, (int)var4_9))
            }
        }
        cp_0.cp_0_do().cfr_renamed_1(var1_1, GameCanvas.soLuongKhoa - 10 * dF.cfr_renamed_12 - 9 - dF.cfr_renamed_12);
        GameCanvas.hienThongBaoPopup(var1_1);
        if (fv_0.boolean_do((int)al_0.dangChayAuto)) {
            al_0.cfr_renamed_1(var1_1, this.var_fl_0_try, this.cfr_renamed_3, this.var_fl_0_new);
            return;
        }
        super.cfr_renamed_1(var1_1);
    }

        private static boolean boolean_for(int n) {
        return n >= 0;
    }

        public final boolean (String string == null) {
        byte[] byArray = (byte[])var_java_util_Hashtable_do.get(string);
        GameCanvas.cfr_renamed_7();
        if ((byArray == null)) {
            return 0;
        }
        this.cfr_renamed_1(byArray, string);
        return 1;
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 50: {
                dt_0.dt_0_do().cfr_renamed_2();
            }
        }
    }

    public final void cfr_renamed_7() {
        if ((this.var_en_do > 0)) {
            this.var_en_do.cfr_renamed_7();
        }
        cp_0.cp_0_do().void_if(cg_0.cfr_renamed_9, cg_0.soLuongKhoa);
    }

            public final void cfr_renamed_4() {
        this.soLuong = 0;
        this.var_fl_0_new = this.var_fl_0_do = new fl_0(MenuChinhAvatar.by, 1);
        this.var_en_do = null;
        if ((GameCanvas.var_en_do != ff_0.cfr_renamed_1()) && (GameCanvas.var_en_do != fo.fo_do()) && (GameCanvas.var_en_do != fv_0.cfr_renamed_1())) {
            this.var_en_do = GameCanvas.var_en_do;
        }
        this.cfr_renamed_2();
        super.cfr_renamed_4();
        if ((GameCanvas.cfr_renamed_12 > 0)) {
            this.coKichHoat = 1;
        }
    }

    static {
        fv_0.cfr_renamed_13();
        var_java_util_Vector_if = new Vector();
        var_byte_do = (byte)0;
        dangChayAuto = 0;
        chuoiGiaTri = "friendlist";
        var_java_util_Hashtable_do = new Hashtable();
    }

        /*
     * Enabled aggressive block sorting
     */
    public static DuLieuNguoiChoi ef_do(int n) {
        int n2 = var_java_util_Vector_do.size();
        int n3 = 0;
        while (!(n3 >= n2)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n3);
            if (fv_0.boolean_if(((dd_0)ef2).cfr_renamed_9, n)) {
                return ef2;
            }
            ++n3;
        }
        return null;
    }
}

