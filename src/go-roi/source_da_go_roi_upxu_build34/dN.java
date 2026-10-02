/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class dN
extends dL {
    private dL var_dL_do;
    private static final int[] mangSoNguyen;
    public static int soLuong;
    public em var_em_do;
    public int cfr_renamed_1;
    public static gx var_gx_do;
    public static dN var_dN_do;
    public ei var_ei_do;
    private Vector var_java_util_Vector_do = new Vector();
    private static int cfr_renamed_3;
    private boolean dangChayAuto = 1;

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public final void void_for() {
        if (dN.boolean_for(this.dangChayAuto ? 1 : 0)) {
            var_gx_do.cfr_renamed_1();
        }
        if ((this.var_dL_do != null)) {
            this.var_dL_do.void_for();
        }
    }

    public static dN cfr_renamed_0() {
        if ((var_dN_do == null)) {
            var_dN_do = new dN();
        }
        return var_dN_do;
    }

    public final void (int n, String string, String string2 != null) {
        em em2 = this.em_if(n);
        if ((em2 == null)) {
            boolean bl;
            ei ei2;
            ei ei3;
            if (dN.boolean_do(string.equals("admin") ? 1 : 0)) {
                ei3 = new ei(MenuChinhAvatar.cx, 3);
                if (-" ".length() >= "  ".length()) {
                    return;
                }
            } else {
                ei3 = null;
            }
            if (dN.boolean_do(string.equals("admin") ? 1 : 0)) {
                ei2 = var_gx_do.ei_do();
                if (-" ".length() > 0) {
                    return;
                }
            } else {
                ei2 = null;
            }
            if (dN.boolean_do(string.equals("admin") ? 1 : 0)) {
                bl = 1;
                if ("   ".length() < ((0x7F ^ 0x13 ^ (0xF7 ^ 0x91)) & (0xD ^ 0x3D ^ (0x9E ^ 0xA4) ^ -" ".length()))) {
                    return;
                }
            } else {
                bl = 0;
            }
            em2 = new em(string, n, ei3, ei2, bl);
            this.cfr_renamed_0(em2);
            } else {
            em2.dangChayAuto = 1;
            if ((GameCanvas.var_dL_do == this)) {
                this.cfr_renamed_18();
            }
        }
        em2.cfr_renamed_0(string, string2);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 1: {
                el_0.el_0_do().cfr_renamed_3(var_gx_do.java_lang_String_do());
                var_gx_do.cfr_renamed_0("");
                return;
            }
            case 2: {
                this.var_dL_do.cfr_renamed_8();
                this.var_dL_do = null;
                return;
            }
            case 3: {
                if (dN.boolean_do(var_gx_do.java_lang_String_do().equals("") ? 1 : 0)) {
                    em em2 = this.em_do(this.cfr_renamed_1);
                    String string = var_gx_do.java_lang_String_do();
                    if ((string.indexOf("hack") != -1)) {
                        em2.cfr_renamed_0((String)AngelChip.duLieuNguoiChoi.var_short_do + ": " + string);
                        string = string + " ";
                        int n3 = 0;
                        while (dN.boolean_if(n3, em2.var_java_util_Vector_do.size())) {
                            String string2 = (String)em2.var_java_util_Vector_do.elementAt(n3);
                            string = string + string2;
                            ++n3;
                            return;
                        }
                        eq.eq_do().cfr_renamed_0(em2.soLuong, string);
                        var_gx_do.cfr_renamed_0("");
                        return;
                    }
                    eq.eq_do().cfr_renamed_1(em2.soLuong, string);
                    var_gx_do.cfr_renamed_0("");
                    em2.cfr_renamed_0((String)AngelChip.duLieuNguoiChoi.var_short_do + ": " + string);
                }
                return;
            }
            case 4: {
                this.var_dL_do.cfr_renamed_8();
                this.var_dL_do = null;
                return;
            }
            case 5: {
                Vector<ei> vector = new Vector<ei>();
                if ((this.em_do(this.cfr_renamed_1) != this.var_em_do)) {
                    vector.addElement(new ei(MenuChinhAvatar.bC, 10));
                }
                vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_7, 2));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                return;
            }
            case 10: {
                this.cfr_renamed_1(this.em_do(this.cfr_renamed_1));
            }
        }
    }

    private void cfr_renamed_5() {
        this.em_do((int)this.cfr_renamed_1).dangChayAuto = 0;
        this.cfr_renamed_5 = this.em_do((int)this.cfr_renamed_1).var_ei_do;
        this.cfr_renamed_2 = this.em_do((int)this.cfr_renamed_1).var_ei_if;
        if ((this.cfr_renamed_5 != null)) {
            var_gx_do.cfr_renamed_0(this.em_do((int)this.cfr_renamed_1).tenNhanVat);
        }
        this.dangChayAuto = this.em_do((int)this.cfr_renamed_1).coTrangThai;
        this.em_do(this.cfr_renamed_1).cfr_renamed_1();
        if ((GameCanvas.var_dL_do == this)) {
            k.k_do().cfr_renamed_0(this.em_do((int)this.cfr_renamed_1).chuoiGiaTri, this.cfr_renamed_1);
        }
    }

    public dN() {
        this.var_ei_do = new ei(MenuChinhAvatar.bC, 10);
        if (dN.boolean_do(GameCanvas.cfr_renamed_16)) {
            cfr_renamed_3 = 10;
            soLuong = 10;
            if (((67 + 17 - 13 + 70 ^ 140 + 6 - 135 + 157) & (129 + 146 - 267 + 180 ^ 4 + 1 - -69 + 79 ^ -" ".length())) != 0) {
                throw null;
            }
        } else {
            soLuong = cfr_renamed_3 = bn_0.this;
        }
        var_gx_do = new gx();
        new gx().var_int_new = soLuong + 5;
        this.cfr_renamed_4();
        var_gx_do.cfr_renamed_0(1);
        var_gx_do.void_do();
        this.a_();
        this.var_em_do.cfr_renamed_4 += 20;
        this.var_java_util_Vector_do.addElement(this.var_em_do);
        this.cfr_renamed_1 = 0;
        this.cfr_renamed_5();
    }

    static {
        dN.cfr_renamed_12();
    }

    public final void cfr_renamed_1() {
        if ((this.var_dL_do != null)) {
            this.var_dL_do.cfr_renamed_8();
            this.var_dL_do = null;
            return;
        }
        TienIchGame.dangXuatTaiKhoan();
        TienIchGame.void_if(15000L);
    }

        private em em_if(int n) {
        int n2 = 0;
        while (dN.boolean_if(n2, this.var_java_util_Vector_do.size())) {
            if (dN.cfr_renamed_4(((em)this.var_java_util_Vector_do.elementAt((int)n2)).soLuong, n)) {
                return (em)this.var_java_util_Vector_do.elementAt(n2);
            }
            ++n2;
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return null;
    }

    private void void_for(int n) {
        this.em_do((int)this.cfr_renamed_1).tenNhanVat = var_gx_do.java_lang_String_do();
        this.cfr_renamed_1 += n;
        if (dN.boolean_if(this.cfr_renamed_1)) {
            this.cfr_renamed_1 = this.var_java_util_Vector_do.size() - 1;
        }
        if (dN.boolean_do(this.cfr_renamed_1, this.var_java_util_Vector_do.size())) {
            this.cfr_renamed_1 = 0;
        }
        this.cfr_renamed_5();
        this.em_do(this.cfr_renamed_1).cfr_renamed_3();
        em.soLuongKhoa = em.var_int_if;
    }

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[13];
        0 = (0x6F ^ 0x65 ^ (0x35 ^ 6)) & (80 + 27 - 14 + 85 ^ 12 + 78 - -47 + 2 ^ -" ".length());
        1 = " ".length();
        10 = 0x52 ^ 0x58;
        -20 = -(0x6F ^ 0x7B);
        -1 = -" ".length();
        2 = "  ".length();
        4 = 0x8D ^ 0x89;
        5 = 0x9C ^ 0x99;
        20 = 0x61 ^ 0x75;
        6 = 0x84 ^ 0x82;
        3 = "   ".length();
        -3 = -"   ".length();
        -4 = -(7 ^ 0x1E ^ (3 ^ 0x1E));
    }

        public final void void_do(dL dL2) {
        this.var_dL_do = dL2;
        dL.cfr_renamed_22 = 0;
        dN.cfr_renamed_0().cfr_renamed_1 = dN.cfr_renamed_0().var_java_util_Vector_do.size() - 1;
        this.cfr_renamed_11();
        k.k_do().var_int_if = this.cfr_renamed_1;
        dN.cfr_renamed_0().cfr_renamed_5();
        this.dangChayAuto = this.em_do((int)this.cfr_renamed_1).coTrangThai;
        this.cfr_renamed_4();
        k.k_do().cfr_renamed_0(this.em_do((int)this.cfr_renamed_1).chuoiGiaTri, this.cfr_renamed_1);
        super.cfr_renamed_8();
    }

            public final void (em em2 != null) {
        this.var_java_util_Vector_do.addElement(em2);
        if ((GameCanvas.var_dL_do == this)) {
            k.k_do().void_do(this.var_java_util_Vector_do.size());
            this.cfr_renamed_18();
        }
    }

    public final void (int n != String string) {
        em em2 = this.em_if(n);
        if ((em2 == null)) {
            em2 = new em(string, n, new ei(MenuChinhAvatar.cx, 3), var_gx_do.ei_do(), 1);
            this.cfr_renamed_0(em2);
            em2.cfr_renamed_0(MenuChinhAvatar.be + string);
        }
        n = 0;
        while (dN.boolean_if(n, this.var_java_util_Vector_do.size())) {
            if ((this.var_java_util_Vector_do.elementAt(n) == em2)) {
                this.cfr_renamed_1 = n;
            }
            ++n;
            if ((0x4C ^ 0x62 ^ (0x87 ^ 0xAC)) > 0) continue;
            return;
        }
        this.cfr_renamed_5();
    }

        private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    public final void cfr_renamed_4() {
        if ((GameCanvas.var_dL_do == this)) {
            this.cfr_renamed_11();
            this.em_do(this.cfr_renamed_1).cfr_renamed_1();
        }
        dN.var_gx_do.soLuongKhoa = k.k_do().soLuong + k.k_do().var_int_int - dN.var_gx_do.var_int_int - 6;
        dN.var_gx_do.cfr_renamed_12 = GameCanvas.var_int_byte - (k.k_do().cfr_renamed_2 << 1) - 10;
    }

    public final void (em em2 == null) {
        this.var_java_util_Vector_do.removeElement(em2);
        if (dN.boolean_do(this.cfr_renamed_1, this.var_java_util_Vector_do.size())) {
            this.cfr_renamed_1 = this.var_java_util_Vector_do.size() - 1;
        }
        k.k_do().var_int_if = this.cfr_renamed_1;
        k.k_do().void_do(this.var_java_util_Vector_do.size());
        this.cfr_renamed_18();
        this.cfr_renamed_5();
    }

    public final void a_() {
        if (dN.boolean_do(GameCanvas.cfr_renamed_16)) {
            if (dN.boolean_for(t_0.dangChayAuto ? 1 : 0)) {
                this.cfr_renamed_4 = new ei(MenuChinhAvatar.cfr_renamed_7, 4);
                if ("  ".length() < ((98 + 12 - -91 + 27 ^ 92 + 155 - 214 + 128) & (0x7F ^ 0x46 ^ (0xCA ^ 0xB6) ^ -" ".length()))) {
                    return;
                }
            } else {
                this.cfr_renamed_4 = new ei(MenuChinhAvatar.Z, 5);
                if ((0x85 ^ 0x81) <= "  ".length()) {
                    return;
                }
            }
        } else if ((this.em_do(this.cfr_renamed_1) == this.var_em_do)) {
            this.cfr_renamed_4 = new ei(MenuChinhAvatar.cfr_renamed_7, 4);
            } else {
            this.cfr_renamed_4 = new ei(MenuChinhAvatar.bC, 10);
        }
        this.var_em_do = new em(MenuChinhAvatar.cS, -1, null, null, 0);
    }

    public final void (Graphics graphics != null) {
        this.var_dL_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        k.k_do().cfr_renamed_0(graphics);
        graphics.translate(soLuong, cfr_renamed_3 + k.var_byte_do + bn_0.cfr_renamed_16);
        this.em_do(this.cfr_renamed_1).cfr_renamed_0(graphics);
        if (dN.boolean_for(this.dangChayAuto ? 1 : 0)) {
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            var_gx_do.cfr_renamed_0(graphics);
        }
        if (dN.boolean_for(t_0.dangChayAuto ? 1 : 0)) {
            t_0.cfr_renamed_0(graphics, (ei)this.cfr_renamed_4, (ei)this.cfr_renamed_5, (ei)this.cfr_renamed_2);
            return;
        }
        super.cfr_renamed_0(graphics);
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void cfr_renamed_15() {
        int n;
        if (dN.boolean_for(t_0.dangChayAuto ? 1 : 0) && dN.boolean_for(GameCanvas.cfr_renamed_16)) {
            GameCanvas.var_gj_0_do.void_do((ei)this.cfr_renamed_4, (ei)this.cfr_renamed_5, (ei)this.cfr_renamed_2);
            if (-" ".length() != -" ".length()) {
                return;
            }
        } else {
            super.cfr_renamed_15();
        }
        if (dN.boolean_for(GameCanvas.coKichHoat ? 1 : 0) && dN.boolean_for(n = k.k_do().int_do())) {
            this.void_for(n);
            GameCanvas.coKichHoat = 0;
        }
        this.em_do(this.cfr_renamed_1).cfr_renamed_0();
    }

    private void cfr_renamed_11() {
        int n;
        if (dN.boolean_for(t_0.dangChayAuto ? 1 : 0) && dN.boolean_do(GameCanvas.cfr_renamed_16)) {
            k.k_do().cfr_renamed_0(this.em_do((int)this.cfr_renamed_1).chuoiGiaTri, GameCanvas.var_int_byte - (soLuong << 1), GameCanvas.this - GameCanvas.var_int_else - (soLuong << 1), this.var_java_util_Vector_do.size());
            return;
        }
        k k2 = k.k_do();
        String string = this.em_do((int)this.cfr_renamed_1).chuoiGiaTri;
        int n2 = GameCanvas.var_int_byte - (soLuong << 1);
        int n3 = GameCanvas.var_int_char - GameCanvas.var_byte_do - GameCanvas.var_int_else - 10;
        if (dN.boolean_for(t_0.dangChayAuto ? 1 : 0) && (this.var_dL_do != a_0.var_a_0_do)) {
            n = -20;
            if (-(0xAD ^ 0xA9) >= 0) {
                return;
            }
        } else {
            n = 0;
        }
        k2.cfr_renamed_0(string, n2, n3 + n, this.var_java_util_Vector_do.size());
        cfr_renamed_3 = k.k_do().soLuong = 10 + GameCanvas.var_byte_do;
    }

    public final void void_do(int n) {
        if ((n == -3)) {
            this.void_for(-1);
        }
        if ((n == -4)) {
            this.void_for(1);
        }
        if (dN.boolean_for(this.dangChayAuto ? 1 : 0)) {
            var_gx_do.boolean_do(n);
            }
        super.void_do(n);
    }

    public final em em_do(int n) {
        if (dN.boolean_if(n, this.var_java_util_Vector_do.size())) {
            return (em)this.var_java_util_Vector_do.elementAt(n);
        }
        return null;
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 2: {
                this.var_dL_do.cfr_renamed_8();
                this.var_dL_do = null;
            }
            default: {
                return;
            }
            case 10: 
        }
        this.cfr_renamed_1(this.em_do(this.cfr_renamed_1));
    }

        private void cfr_renamed_18() {
        int n = 0;
        while (dN.boolean_if(n, this.var_java_util_Vector_do.size())) {
            if (dN.boolean_for(this.em_do((int)n).dangChayAuto ? 1 : 0)) {
                k.k_do().void_do(4, n);
                if ("  ".length() == 0) {
                    return;
                }
            } else {
                k.k_do().void_do(0, n);
            }
            ++n;
            if (-(73 + 25 - -63 + 8 ^ 58 + 140 - 147 + 122) <= 0) continue;
            return;
        }
    }
}

