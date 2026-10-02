/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class ep
extends en {
    private static final int[] mangSoNguyen;
    public int soLuong;
    public fl_0 var_fl_0_do;
    public static ey_0 var_ey_0_do;
    private static int cfr_renamed_2;
    public fp_0 var_fp_0_do;
    public static ep var_ep_do;
    private boolean dangChayAuto;
    private Vector var_java_util_Vector_do = new Vector();
    private en var_en_do;
    public static int cfr_renamed_0;

    public ep() {
        this.dangChayAuto = 1;
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cfr_renamed_44, 10);
        if (ep.boolean_if(GameCanvas.cfr_renamed_12)) {
            cfr_renamed_2 = 10;
            cfr_renamed_0 = 10;
            } else {
            cfr_renamed_0 = cfr_renamed_2 = dF.this;
        }
        var_ey_0_do = new ey_0();
        new ey_0().var_int_if = cfr_renamed_0 + 5;
        this.cfr_renamed_2();
        var_ey_0_do.cfr_renamed_0(1);
        var_ey_0_do.cfr_renamed_3();
        this.b_();
        this.var_fp_0_do.soLuong += 20;
        this.var_java_util_Vector_do.addElement(this.var_fp_0_do);
        this.soLuong = 0;
        this.cfr_renamed_13();
    }

        private static boolean boolean_do(int n) {
        return n < 0;
    }

        public final void b_() {
        if (ep.boolean_if(GameCanvas.cfr_renamed_12)) {
            if (ep.boolean_for(al_0.dangChayAuto ? 1 : 0)) {
                this.cfr_renamed_5 = new fl_0(MenuChinhAvatar.by, 4);
                if (((12 + 69 - -57 + 17 ^ 139 + 47 - 84 + 64) & (0x26 ^ 0x66 ^ (0xC3 ^ 0xBE) ^ -" ".length())) > " ".length()) {
                    return;
                }
            } else {
                this.cfr_renamed_5 = new fl_0(MenuChinhAvatar.bR, 5);
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0) {
                    return;
                }
            }
        } else if ((this.fp_0_do(this.soLuong) == this.var_fp_0_do)) {
            this.cfr_renamed_5 = new fl_0(MenuChinhAvatar.by, 4);
            if ("  ".length() < 0) {
                return;
            }
        } else {
            this.cfr_renamed_5 = new fl_0(MenuChinhAvatar.cfr_renamed_44, 10);
        }
        this.var_fp_0_do = new fp_0(MenuChinhAvatar.aE, -1, null, null, 0);
    }

    private void void_do(int n) {
        this.fp_0_do((int)this.soLuong).chuoiGiaTri = var_ey_0_do.java_lang_String_do();
        this.soLuong += n;
        if (ep.boolean_do(this.soLuong)) {
            this.soLuong = this.var_java_util_Vector_do.size() - 1;
        }
        if ((this.soLuong >= this.var_java_util_Vector_do.size())) {
            this.soLuong = 0;
        }
        this.cfr_renamed_13();
        this.fp_0_do(this.soLuong).cfr_renamed_0();
        fp_0.soLuongKhoa = fp_0.var_int_if;
    }

        public final void cfr_renamed_2() {
        if ((GameCanvas.var_en_do == this)) {
            this.cfr_renamed_5();
            this.fp_0_do(this.soLuong).cfr_renamed_1();
        }
        ep.var_ey_0_do.cfr_renamed_14 = v_0.v_0_do().cfr_renamed_6 + v_0.v_0_do().var_int_if - ep.var_ey_0_do.var_int_new - 6;
        ep.var_ey_0_do.cfr_renamed_9 = GameCanvas.soLuongKhoa - (v_0.v_0_do().cfr_renamed_5 << 1) - 10;
    }

    private void cfr_renamed_5() {
        int n;
        if (ep.boolean_for(al_0.dangChayAuto ? 1 : 0) && ep.boolean_if(GameCanvas.cfr_renamed_12)) {
            v_0.v_0_do().cfr_renamed_1(this.fp_0_do((int)this.soLuong).tenNhanVat, GameCanvas.soLuongKhoa - (cfr_renamed_0 << 1), GameCanvas.var_int_int - GameCanvas.this - (cfr_renamed_0 << 1), this.var_java_util_Vector_do.size());
            return;
        }
        v_0 v_02 = v_0.v_0_do();
        String string = this.fp_0_do((int)this.soLuong).tenNhanVat;
        int n2 = GameCanvas.soLuongKhoa - (cfr_renamed_0 << 1);
        int n3 = GameCanvas.var_int_case - GameCanvas.var_byte_do - GameCanvas.this - 10;
        if (ep.boolean_for(al_0.dangChayAuto ? 1 : 0) && (this.var_en_do != w_0.var_w_0_do)) {
            n = -20;
            if ((0x5B ^ 0x5F) < 0) {
                return;
            }
        } else {
            n = 0;
        }
        v_02.cfr_renamed_1(string, n2, n3 + n, this.var_java_util_Vector_do.size());
        cfr_renamed_2 = v_0.v_0_do().cfr_renamed_6 = 10 + GameCanvas.var_byte_do;
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[13];
        0 = (111 + 78 - 154 + 120 ^ 130 + 39 - 71 + 40) & (109 + 20 - 29 + 61 ^ 94 + 151 - 225 + 156 ^ -" ".length());
        1 = " ".length();
        10 = 0x6E ^ 0x64;
        -20 = -(2 ^ 0x34 ^ (0x54 ^ 0x76));
        -1 = -" ".length();
        2 = "  ".length();
        4 = 0xBF ^ 0xBB;
        5 = 134 + 143 - 253 + 137 ^ 29 + 129 - 42 + 48;
        20 = 0xD2 ^ 0xC6;
        6 = 0x8D ^ 0x8B;
        3 = "   ".length();
        -3 = -"   ".length();
        -4 = -(0x17 ^ 0x38 ^ (0x37 ^ 0x1C));
    }

    private void cfr_renamed_13() {
        this.fp_0_do((int)this.soLuong).dangChayAuto = 0;
        this.cfr_renamed_3 = this.fp_0_do((int)this.soLuong).var_fl_0_if;
        this.cfr_renamed_4 = this.fp_0_do((int)this.soLuong).var_fl_0_do;
        if ((this.cfr_renamed_3 != null)) {
            var_ey_0_do.cfr_renamed_1(this.fp_0_do((int)this.soLuong).chuoiGiaTri);
        }
        this.dangChayAuto = this.fp_0_do((int)this.soLuong).coTrangThai;
        this.fp_0_do(this.soLuong).cfr_renamed_1();
        if ((GameCanvas.var_en_do == this)) {
            v_0.v_0_do().cfr_renamed_1(this.fp_0_do((int)this.soLuong).tenNhanVat, this.soLuong);
        }
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 2: {
                this.var_en_do.cfr_renamed_4();
                this.var_en_do = null;
            }
            default: {
                return;
            }
            case 10: 
        }
        this.cfr_renamed_1(this.fp_0_do(this.soLuong));
    }

    public static ep cfr_renamed_1() {
        if ((var_ep_do == null)) {
            var_ep_do = new ep();
        }
        return var_ep_do;
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public final void (fp_0 fp_02 == null) {
        this.var_java_util_Vector_do.removeElement(fp_02);
        if ((this.soLuong >= this.var_java_util_Vector_do.size())) {
            this.soLuong = this.var_java_util_Vector_do.size() - 1;
        }
        v_0.v_0_do().soLuong = this.soLuong;
        v_0.v_0_do().void_do(this.var_java_util_Vector_do.size());
        this.cfr_renamed_9();
        this.cfr_renamed_13();
    }

    public final void void_int(int n) {
        if (ep.boolean_if(n, -3)) {
            this.void_do(-1);
        }
        if (ep.boolean_if(n, -4)) {
            this.void_do(1);
        }
        if (ep.boolean_for(this.dangChayAuto ? 1 : 0)) {
            var_ey_0_do.boolean_do(n);
            }
        super.void_int(n);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 1: {
                fn.fn_do().cfr_renamed_0(var_ey_0_do.java_lang_String_do());
                var_ey_0_do.cfr_renamed_1("");
                return;
            }
            case 2: {
                this.var_en_do.cfr_renamed_4();
                this.var_en_do = null;
                return;
            }
            case 3: {
                if (ep.boolean_if(var_ey_0_do.java_lang_String_do().equals("") ? 1 : 0)) {
                    fp_0 fp_02 = this.fp_0_do(this.soLuong);
                    String string = var_ey_0_do.java_lang_String_do();
                    if (ep.boolean_do(string.indexOf("hack"), -1)) {
                        fp_02.cfr_renamed_1((String)AngelChip.duLieuNguoiChoi.soLuong + ": " + string);
                        string = string + " ";
                        int n3 = 0;
                        while ((n3 < fp_02.var_java_util_Vector_do.size())) {
                            String string2 = (String)fp_02.var_java_util_Vector_do.elementAt(n3);
                            string = string + string2;
                            ++n3;
                            if (-(0x7A ^ 0x7F) < 0) continue;
                            return;
                        }
                        ft_0.ft_0_do().cfr_renamed_0(fp_02.cfr_renamed_3, string);
                        var_ey_0_do.cfr_renamed_1("");
                        return;
                    }
                    ft_0.ft_0_do().cfr_renamed_1(fp_02.cfr_renamed_3, string);
                    var_ey_0_do.cfr_renamed_1("");
                    fp_02.cfr_renamed_1((String)AngelChip.duLieuNguoiChoi.soLuong + ": " + string);
                }
                return;
            }
            case 4: {
                this.var_en_do.cfr_renamed_4();
                this.var_en_do = null;
                return;
            }
            case 5: {
                Vector<fl_0> vector = new Vector<fl_0>();
                if ((this.fp_0_do(this.soLuong) != this.var_fp_0_do)) {
                    vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_44, 10));
                }
                vector.addElement(new fl_0(MenuChinhAvatar.by, 2));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                return;
            }
            case 10: {
                this.cfr_renamed_1(this.fp_0_do(this.soLuong));
            }
        }
    }

    public final void cfr_renamed_6() {
        int n;
        if (ep.boolean_for(al_0.dangChayAuto ? 1 : 0) && ep.boolean_for(GameCanvas.cfr_renamed_12)) {
            GameCanvas.var_fa_0_do.void_do((fl_0)this.cfr_renamed_5, (fl_0)this.cfr_renamed_3, (fl_0)this.cfr_renamed_4);
            if (-" ".length() > 0) {
                return;
            }
        } else {
            super.cfr_renamed_6();
        }
        if (ep.boolean_for(GameCanvas.coTrangThai ? 1 : 0) && ep.boolean_for(n = v_0.v_0_do().int_do())) {
            this.void_do(n);
            GameCanvas.coTrangThai = 0;
        }
        this.fp_0_do(this.soLuong).cfr_renamed_2();
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    public final void cfr_renamed_7() {
        if (ep.boolean_for(this.dangChayAuto ? 1 : 0)) {
            var_ey_0_do.cfr_renamed_2();
        }
        if ((this.var_en_do != null)) {
            this.var_en_do.cfr_renamed_7();
        }
    }

    private fp_0 fp_0_if(int n) {
        int n2 = 0;
        while ((n2 < this.var_java_util_Vector_do.size())) {
            if (ep.boolean_if(((fp_0)this.var_java_util_Vector_do.elementAt((int)n2)).cfr_renamed_3, n)) {
                return (fp_0)this.var_java_util_Vector_do.elementAt(n2);
            }
            ++n2;
            if (((95 + 194 - 214 + 175 ^ 182 + 174 - 183 + 18) & (0xD2 ^ 0x82 ^ (0x60 ^ 0x75) ^ -" ".length())) == 0) continue;
            return null;
        }
        return null;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    public final void (int n != String string) {
        fp_0 fp_02 = this.fp_0_if(n);
        if ((fp_02 == null)) {
            fp_02 = new fp_0(string, n, new fl_0(MenuChinhAvatar.ce, 3), var_ey_0_do.fl_0_do(), 1);
            this.cfr_renamed_0(fp_02);
            fp_02.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_27 + string);
        }
        n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            if ((this.var_java_util_Vector_do.elementAt(n) == fp_02)) {
                this.soLuong = n;
            }
            ++n;
            return;
        }
        this.cfr_renamed_13();
    }

    private void cfr_renamed_9() {
        int n = 0;
        while ((n < this.var_java_util_Vector_do.size())) {
            if (ep.boolean_for(this.fp_0_do((int)n).dangChayAuto ? 1 : 0)) {
                v_0.v_0_do().void_do(4, n);
                if ("   ".length() <= 0) {
                    return;
                }
            } else {
                v_0.v_0_do().void_do(0, n);
            }
            ++n;
            if (-" ".length() == -" ".length()) continue;
            return;
        }
    }

    public final fp_0 fp_0_do(int n) {
        if ((n < this.var_java_util_Vector_do.size())) {
            return (fp_0)this.var_java_util_Vector_do.elementAt(n);
        }
        return null;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void (Graphics graphics == null) {
        this.var_en_do.cfr_renamed_0(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        v_0.v_0_do().cfr_renamed_1(graphics);
        graphics.translate(cfr_renamed_0, cfr_renamed_2 + v_0.var_byte_do + dF.cfr_renamed_15);
        this.fp_0_do(this.soLuong).cfr_renamed_1(graphics);
        if (ep.boolean_for(this.dangChayAuto ? 1 : 0)) {
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            var_ey_0_do.cfr_renamed_1(graphics);
        }
        if (ep.boolean_for(al_0.dangChayAuto ? 1 : 0)) {
            al_0.cfr_renamed_1(graphics, (fl_0)this.cfr_renamed_5, (fl_0)this.cfr_renamed_3, (fl_0)this.cfr_renamed_4);
            return;
        }
        super.cfr_renamed_1(graphics);
    }

    static {
        ep.cfr_renamed_8();
    }

    public final void void_do(en en2) {
        this.var_en_do = en2;
        en.cfr_renamed_30 = 0;
        ep.cfr_renamed_1().soLuong = ep.cfr_renamed_1().var_java_util_Vector_do.size() - 1;
        this.cfr_renamed_5();
        v_0.v_0_do().soLuong = this.soLuong;
        ep.cfr_renamed_1().cfr_renamed_13();
        this.dangChayAuto = this.fp_0_do((int)this.soLuong).coTrangThai;
        this.cfr_renamed_2();
        v_0.v_0_do().cfr_renamed_1(this.fp_0_do((int)this.soLuong).tenNhanVat, this.soLuong);
        super.cfr_renamed_4();
    }

        public final void (fp_0 fp_02 != null) {
        this.var_java_util_Vector_do.addElement(fp_02);
        if ((GameCanvas.var_en_do == this)) {
            v_0.v_0_do().void_do(this.var_java_util_Vector_do.size());
            this.cfr_renamed_9();
        }
    }

    public final void cfr_renamed_3() {
        if ((this.var_en_do != null)) {
            this.var_en_do.cfr_renamed_4();
            this.var_en_do = null;
            return;
        }
        TienIchGame.dangXuatTaiKhoan();
        TienIchGame.hienThongBao(15000L);
    }

    public final void (int n, String string, String string2 == null) {
        fp_0 fp_02 = this.fp_0_if(n);
        if ((fp_02 == null)) {
            boolean bl;
            fl_0 fl_02;
            fl_0 fl_03;
            if (ep.boolean_if(string.equals("admin") ? 1 : 0)) {
                fl_03 = new fl_0(MenuChinhAvatar.ce, 3);
                if (-" ".length() > 0) {
                    return;
                }
            } else {
                fl_03 = null;
            }
            if (ep.boolean_if(string.equals("admin") ? 1 : 0)) {
                fl_02 = var_ey_0_do.fl_0_do();
                if ("  ".length() < 0) {
                    return;
                }
            } else {
                fl_02 = null;
            }
            if (ep.boolean_if(string.equals("admin") ? 1 : 0)) {
                bl = 1;
                } else {
                bl = 0;
            }
            fp_02 = new fp_0(string, n, fl_03, fl_02, bl);
            this.cfr_renamed_0(fp_02);
            } else {
            fp_02.dangChayAuto = 1;
            if ((GameCanvas.var_en_do == this)) {
                this.cfr_renamed_9();
            }
        }
        fp_02.cfr_renamed_1(string, string2);
    }

        }

