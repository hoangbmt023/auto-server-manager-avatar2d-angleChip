/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class bW
extends dL {
    private byte[] var_byte_arr_do;
    private int soLuong;
    private int var_int_if;
    private ei var_ei_if;
    private static int[] mangSoNguyen;
    ei var_ei_do;
    public ep var_ep_do;
    private int soLuongKhoa;
    private Image[] var_javax_microedition_lcdui_Image_arr_do;
    private int cfr_renamed_4;
    private short var_short_do;
    private static bW var_bW_do;
    gr var_gr_do = new gr();
    private long soXu;
    private ei var_ei_for;
    private int cfr_renamed_5;
    public Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_2;

    private void cfr_renamed_5(int n) {
        this.soXu = System.currentTimeMillis();
        if (bW.boolean_for(this.soLuongKhoa, this.var_byte_arr_do.length)) {
            this.var_byte_arr_do[this.soLuongKhoa] = (byte)n;
        }
        this.soLuongKhoa += 1;
        if (bW.cfr_renamed_5(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 2)) {
            this.var_gr_do.void_do(0);
            this.cfr_renamed_2 = 2;
        }
        if (bW.boolean_if(this.soLuongKhoa, this.var_byte_arr_do.length)) {
            this.var_gr_do.void_do(0);
            this.var_gr_do.coTrangThai = 1;
            el_0.el_0_do().cfr_renamed_0(this.var_byte_arr_do);
            GameCanvas.cfr_renamed_5();
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    public static bW cfr_renamed_0() {
        if ((var_bW_do == null)) {
            var_bW_do = new bW();
            return var_bW_do;
        }
        return var_bW_do;
    }

    private static boolean boolean_for(int n, int n2) {
        return n < n2;
    }

    private void cfr_renamed_1() {
        AngelChip.duLieuNguoiChoi.cfr_renamed_10();
        if (bW.boolean_do(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3)) {
            ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 -= 18;
            if (-" ".length() > 0) {
                return;
            }
        } else {
            ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3 += 18;
        }
        AngelChip.duLieuNguoiChoi.var_int_if -= 10;
        ek_0.void_do(GameCanvas.var_int_byte / 10);
        fe_0.var_java_util_Vector_new.removeElement(this.var_gr_do);
        fe_0.fe_0_do().cfr_renamed_8();
    }

    public final void void_do(int n) {
        if (bW.boolean_for(this.var_gr_do.coKichHoat ? 1 : 0) && bW.boolean_do(this.var_gr_do.coTrangThai ? 1 : 0)) {
            switch (n) {
                case 50: 
                case 52: 
                case 54: 
                case 56: {
                    GameCanvas.var_boolean_arr_do[n - 48] = 1;
                }
            }
            return;
        }
        fe_0.fe_0_do().void_do(n);
    }

        public bW() {
        this.soLuongKhoa = 0;
        this.var_ei_do = new ei(MenuChinhAvatar.bT, 0);
        this.var_ei_for = new ei(MenuChinhAvatar.ck, 1);
        this.var_ei_if = new ei(MenuChinhAvatar.cfr_renamed_7, 2);
        this.var_ei_new = this.var_ei_do;
        ap.void_do(MenuChinhAvatar.cq);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("cucphao");
        this.var_ep_do = ep.cfr_renamed_0("ca", 14 * bn_0.cfr_renamed_6, 14 * bn_0.cfr_renamed_6);
        ap.cfr_renamed_0();
    }

    public final void (Graphics graphics != null) {
        fe_0.fe_0_do().cfr_renamed_1(graphics);
        if (bW.boolean_for(this.var_gr_do.coKichHoat ? 1 : 0) && bW.boolean_do(this.var_gr_do.coTrangThai ? 1 : 0) && (this.var_short_do != -1)) {
            Graphics graphics2 = graphics;
            bW bW2 = this;
            GameCanvas.cfr_renamed_1(graphics2);
            graphics2.translate(-ek_0.ek_0_do().soLuong, -ek_0.ek_0_do().cfr_renamed_3);
            graphics2.setColor(8575990);
            if ((bW2.var_javax_microedition_lcdui_Image_arr_do != null) && bW.boolean_for(bW2.soLuongKhoa, bW2.var_javax_microedition_lcdui_Image_arr_do.length)) {
                if (bW.boolean_int((System.currentTimeMillis() - bW2.soXu, 50L == null))) {
                    graphics2.setColor(1423411);
                    if ((0x1B ^ 0x1F) != (0xB9 ^ 0xBD)) {
                        return;
                    }
                } else {
                    graphics2.setColor(15612731);
                }
                graphics2.fillRoundRect(bW2.cfr_renamed_4 - 1, bW2.soLuong * bn_0.cfr_renamed_6 - 1, bW2.var_javax_microedition_lcdui_Image_arr_do[bW2.soLuongKhoa].getWidth() + 2, bW2.var_javax_microedition_lcdui_Image_arr_do[bW2.soLuongKhoa].getHeight() + 2, 5, 5);
                graphics2.drawImage(bW2.var_javax_microedition_lcdui_Image_arr_do[bW2.soLuongKhoa], bW2.cfr_renamed_4, bW2.soLuong * bn_0.cfr_renamed_6, 0);
            }
        }
        super.cfr_renamed_0(graphics);
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

        static {
        bW.cfr_renamed_4();
    }

    public final void cfr_renamed_15() {
        if (bW.boolean_for(this.var_gr_do.coKichHoat ? 1 : 0) && bW.boolean_do(this.var_gr_do.coTrangThai ? 1 : 0)) {
            if (bW.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0)) {
                this.cfr_renamed_5(2);
                if ("  ".length() < ("  ".length() & ("  ".length() ^ -" ".length()))) {
                    return;
                }
            } else if (bW.boolean_for(GameCanvas.boolean_do(4) ? 1 : 0)) {
                this.cfr_renamed_5(1);
                if ("   ".length() <= 0) {
                    return;
                }
            } else if (bW.boolean_for(GameCanvas.boolean_do(6) ? 1 : 0)) {
                this.cfr_renamed_5(3);
                if (" ".length() <= ((0xBB ^ 0x80) & ~(0x51 ^ 0x6A))) {
                    return;
                }
            } else if (bW.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0)) {
                this.cfr_renamed_5(4);
            }
        }
        super.cfr_renamed_15();
    }

        /*
     * Unable to fully structure code
     */
    public static void (int var0, byte var1_1, byte var2_2, int var3_3, short var4_4 != null) {
        block3: {
            var5_5 = ef_0.dd_0_do(var0);
            if (!(var5_5 == null) || !(es.var_java_util_Vector_do != null)) break block3;
            var6_6 = 0;
            if (-"  ".length() < 0) ** GOTO lbl12
            return;
lbl-1000:
            // 1 sources

            {
                var7_8 = (DuLieuNguoiChoi)es.var_java_util_Vector_do.elementAt(var6_6);
                if ((var7_8.cfr_renamed_12 == var0)) {
                    var5_5 = var7_8;
                }
                ++var6_6;
lbl12:
                // 2 sources

                ** while (!bW.boolean_if((int)var6_6, (int)es.var_java_util_Vector_do.size()))
            }
        }
        if ((var6_7 = var5_5 != null)) {
            var7_8 = new Vector<ab_0>();
            var7_8.addElement(new ab_0(var6_7, var1_1, var2_2, var3_3, var4_4));
            v0 = new String[1];
            v0[0] = MenuChinhAvatar.cD;
            em_0.em_0_do().cfr_renamed_0(v0, new Vector[1], (Vector)var7_8);
            em_0.em_0_do().cfr_renamed_8();
        }
        GameCanvas.cfr_renamed_8();
    }

    public final void void_for(int n) {
        Object object = ef_0.dd_0_do(n);
        if ((object != null)) {
            DuLieuNguoiChoi dd_02 = object;
            object = this;
            gr gr2 = bW.gr_do(((bk_0)dd_02).cfr_renamed_12);
            if ((gr2 != null)) {
                fe_0.var_java_util_Vector_new.removeElement(gr2);
                }
            gr2 = new gr();
            if (bW.cfr_renamed_2(((bk_0)dd_02).cfr_renamed_12, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                GameCanvas.cfr_renamed_8();
                ((bW)object).var_gr_do = gr2;
                if ((0xDF ^ 0x85 ^ (9 ^ 0x57)) < "   ".length()) {
                    return;
                }
            } else {
                gr2 = new gr();
            }
            fe_0.var_java_util_Vector_new.addElement(gr2);
            if (bW.cfr_renamed_5(((bk_0)dd_02).cfr_renamed_4, 2)) {
                if (bW.cfr_renamed_5(((bk_0)dd_02).cfr_renamed_12, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                    gr2.duLieuNguoiChoi = dd_02;
                    gr2.dangChayAuto = 1;
                }
                return;
            }
            gr2.cfr_renamed_0(dd_02);
        }
    }

    public final void void_for() {
        fe_0.fe_0_do().void_for();
        if (bW.boolean_for(this.var_gr_do.coKichHoat ? 1 : 0) && bW.boolean_do(this.var_gr_do.coTrangThai ? 1 : 0)) {
            if (bW.boolean_for(this.soLuongKhoa, this.var_byte_arr_do.length) && bW.boolean_int((System.currentTimeMillis() - this.soXu, this.var_short_do != null))) {
                this.cfr_renamed_5(0);
            }
            if (bW.cfr_renamed_2(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 2)) {
                this.cfr_renamed_2 -= 1;
                if (bW.boolean_if(this.cfr_renamed_2)) {
                    this.cfr_renamed_2 = 0;
                    this.var_gr_do.void_do(1);
                }
            }
        }
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[26];
        2 = "  ".length();
        13 = 3 ^ 0x4A ^ (0xFA ^ 0xBE);
        82 = 103 + 43 - 82 + 63 ^ (0x2B ^ 6);
        0 = (0x16 ^ 0x24) & ~(0x83 ^ 0xB1);
        1 = " ".length();
        14 = 0x90 ^ 0x9E;
        18 = 0x6D ^ 0x34 ^ (6 ^ 0x4D);
        10 = 0xCC ^ 0xC6;
        4 = 0x59 ^ 0x5D;
        70 = 197 + 238 - 351 + 171 ^ 2 + 113 - 7 + 77;
        60 = 0x76 ^ 0x4A;
        24 = 0x74 ^ 0x1F ^ (0xF ^ 0x7C);
        50 = 158 + 31 - 26 + 7 ^ 139 + 55 - 153 + 111;
        100 = 0x9E ^ 0xB8 ^ (0xD4 ^ 0x96);
        16 = 0x22 ^ 0x26 ^ (0x50 ^ 0x44);
        86 = 2 ^ 0x54;
        48 = 0xAE ^ 0x9E;
        6 = 0x52 ^ 0x54;
        3 = "   ".length();
        8 = 0xB7 ^ 0xBF;
        -1 = -" ".length();
        8575990 = -"  ".length() & (0xFFFFFFF7 & 0x82DBFF);
        1423411 = 0xFFFFBEB3 & 0x15F97F;
        15612731 = -(0xFFFFFDCB & 0x46F5) & (0xFFFFFFFF & 0xEE7FFB);
        5 = 0x1F ^ 0x1A;
        30 = 0x1B ^ 5;
    }

    public final void void_int(int n) {
        gr gr2 = bW.gr_do(n);
        if (bW.cfr_renamed_2(n, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
            this.var_ei_new = this.var_ei_do;
            this.var_ei_try = this.var_ei_if;
            GameCanvas.cfr_renamed_8();
        }
        if ((gr2 != null)) {
            Object object;
            if (bW.boolean_int(gr2.soLuongKhoa) && bW.cfr_renamed_0(object = (dt_0)ci_0.q_0_do((short)gr2.soLuongKhoa))) {
                object = ci_0.var_bH_arr_do[((q_0)object).var_short_if];
                object = Image.createImage((Image)ci_0.gy_0_do((int)((bH)object).cfr_renamed_1).var_javax_microedition_lcdui_Image_do, (int)(((bH)object).cfr_renamed_4 * bn_0.cfr_renamed_6), (int)(((bH)object).cfr_renamed_2 * bn_0.cfr_renamed_6), (int)(((bH)object).cfr_renamed_5 * bn_0.cfr_renamed_6), (int)(((bH)object).cfr_renamed_3 * bn_0.cfr_renamed_6), (int)0);
                GameCanvas.hienThongBaoPopup(1, ((aG)gr2.duLieuNguoiChoi).cfr_renamed_3, gr2.duLieuNguoiChoi.var_int_if + gr2.duLieuNguoiChoi.var_byte_else - 50, (Image)object, -1);
            }
            fe_0.var_java_util_Vector_new.removeElement(gr2);
            }
    }

        public final void void_for(int n, int n2) {
        gr gr2 = bW.gr_do(n);
        if ((gr2 != null)) {
            if (bW.cfr_renamed_5(((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_4, 2) && bW.cfr_renamed_5(((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_4, 13)) {
                fe_0.var_java_util_Vector_new.removeElement(gr2);
                return;
            }
            if (bW.boolean_if(n2)) {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.cI, ((aG)gr2.duLieuNguoiChoi).cfr_renamed_3, gr2.duLieuNguoiChoi.var_int_if - 60, 1, -1);
            }
            gr2.soLuongKhoa = n2;
            gr2.coTrangThai = 1;
            gr2.void_do(0);
            if (bW.cfr_renamed_2(((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_12, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                this.var_ei_try = this.var_ei_for;
                GameCanvas.cfr_renamed_8();
            }
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    public static gr gr_do(int var0) {
        var1_1 = 0;
        if ("   ".length() <= "   ".length()) ** GOTO lbl10
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = (gr)fe_0.var_java_util_Vector_new.elementAt(var1_1);
            if ((var2_2.duLieuNguoiChoi.cfr_renamed_12 == var0)) {
                return var2_2;
            }
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!bW.boolean_if((int)var1_1, (int)fe_0.var_java_util_Vector_new.size()))
        }
lbl11:
        // 1 sources

        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (int n, int n2, short s2, byte[][] byArray != null) {
        gr gr2 = bW.gr_do(n);
        if ((gr2 != null) && bW.boolean_for(gr2.var_int_int)) {
            if (bW.cfr_renamed_5(((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_4, 13) && !bW.cfr_renamed_2(((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_4, 2) || bW.boolean_for(gr2.coKichHoat ? 1 : 0)) {
                return;
            }
            gr2.coKichHoat = 1;
            gr2.void_do(0);
            ((bk_0)gr2.duLieuNguoiChoi).cfr_renamed_4 = (byte)2;
            gr2.soLuongKhoa = n2;
            if ((s2 != -1)) {
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.bX, ((aG)gr2.duLieuNguoiChoi).cfr_renamed_3, gr2.duLieuNguoiChoi.var_int_if - 60, 1, -1);
            }
            if (bW.cfr_renamed_2(n, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
                this.soXu = System.currentTimeMillis();
                this.soLuongKhoa = 0;
                this.cfr_renamed_2 = 2;
                this.var_javax_microedition_lcdui_Image_arr_do = new Image[byArray.length];
                this.var_byte_arr_do = new byte[byArray.length];
                n = 0;
                while (!bW.boolean_if(n, this.var_javax_microedition_lcdui_Image_arr_do.length)) {
                    this.var_javax_microedition_lcdui_Image_arr_do[n] = gc_0.javax_microedition_lcdui_Image_do(byArray[n]);
                    ++n;
                }
                this.var_short_do = s2;
                this.cfr_renamed_4 = this.var_gr_do.var_eq_0_arr_if[this.var_gr_do.var_byte_do - 2].var_int_if;
                this.soLuong = this.var_gr_do.var_eq_0_arr_if[this.var_gr_do.var_byte_do - 2].soLuong - 30;
                if ((s2 == -1)) {
                    this.cfr_renamed_5(0);
                }
            }
        }
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        private static boolean boolean_int(int n) {
        return n > 0;
    }

    public final void void_if(int n) {
        switch (n) {
            case 0: {
                this.cfr_renamed_1();
            }
        }
    }

    public final boolean boolean_do(int n, int n2) {
        this.cfr_renamed_5 = GameCanvas.var_int_char - GameCanvas.var_int_char / 4;
        if ((this.cfr_renamed_5 > GameCanvas.var_int_char - 70 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_5 = GameCanvas.var_int_char - 70 * bn_0.cfr_renamed_6;
        }
        this.var_int_if = 60;
        if (bW.boolean_for(this.var_int_if, (GameCanvas.var_int_byte - ef_0.var_short_if * 24) / 2 + 50 * bn_0.cfr_renamed_6)) {
            this.var_int_if = (GameCanvas.var_int_byte - ef_0.var_short_if * 24) / 2 + 50 * bn_0.cfr_renamed_6;
        }
        this.soLuongKhoa = 0;
        int n3 = ef_0.int_do(n, n2);
        if (!(ef_0.var_short_arr_do[n3 + 1] != 100) || !(ef_0.var_short_arr_do[n3 + 1] != 16) || (ef_0.var_short_arr_do[n3 + 1] == 13)) {
            ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = (byte)0;
            this.var_int_if = GameCanvas.var_int_byte - this.var_int_if;
            if (-"   ".length() > 0) {
                return ((11 + 29 - -20 + 89 ^ 89 + 86 - 110 + 134) & (141 + 21 - 0 + 70 ^ 31 + 43 - -97 + 15 ^ -" ".length())) != 0;
            }
        } else {
            ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = bk_0.var_byte_case;
        }
        AngelChip.duLieuNguoiChoi.boolean_for(n, n2);
        el_0 el_02 = el_0.el_0_do();
        el_02.cfr_renamed_0(86);
        el_02.cfr_renamed_1();
        GameCanvas.cfr_renamed_5();
        this.var_ei_try = this.var_ei_if;
        GameCanvas.void_for();
        return 1;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (bW.cfr_renamed_5(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 2) && bW.cfr_renamed_5(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 13)) {
                    fe_0.fe_0_do().cfr_renamed_8();
                }
                el_0 el_02 = el_0.el_0_do();
                el_02.cfr_renamed_0(82);
                el_02.cfr_renamed_1();
                GameCanvas.cfr_renamed_5();
                this.var_ei_new = null;
                return;
            }
            case 1: {
                el_0.el_0_do().void_do();
                GameCanvas.cfr_renamed_5();
                return;
            }
            case 2: {
                this.cfr_renamed_1();
                el_0.el_0_do().void_do();
            }
        }
    }

    public final void void_if(int n, int n2) {
    }
}

