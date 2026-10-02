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

/*
 * Renamed from U
 */
public final class u_0
extends en {
    public cu_0 var_cu_0_do;
    long soXu;
    private static final int[] mangSoNguyen;
    private int soLuongKhoa;
    fl_0 var_fl_0_do;
    int soLuong;
    private short var_short_do;
    private fl_0 var_fl_0_if;
    private int cfr_renamed_3;
    private static u_0 var_u_0_do;
    private fl_0 var_fl_0_for;
    byte[] var_byte_arr_do;
    public Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_4;
    int var_int_if;
    private int cfr_renamed_5;
    es_0 var_es_0_do = new es_0();
    private Image[] var_javax_microedition_lcdui_Image_arr_do;

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    public final void void_do(int n) {
        es_0 es_02 = u_0.es_0_do(n);
        if ((n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
            ((en)this).cfr_renamed_3 = this.var_fl_0_do;
            ((en)this).cfr_renamed_4 = this.var_fl_0_if;
            GameCanvas.cfr_renamed_7();
            if ((es_02 != null) && (AutoController.nhiemVuHienTai != null) && u_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoCauCa) && (AutoCauCa.bs_0_do().var_int_int == 3)) {
                ((en)this).cfr_renamed_3 = null;
                AutoCauCa.bs_0_do().void_do(1);
            }
        }
        if ((es_02 != null)) {
            Object object;
            if (u_0.boolean_do(es_02.var_int_if) && u_0.cfr_renamed_1(object = (fb)aa_0.am_do((short)es_02.var_int_if))) {
                object = aa_0.var_k_0_arr_do[((fb)object).cfr_renamed_0];
                object = Image.createImage((Image)aa_0.hr_do((int)((k_0)object).cfr_renamed_3).var_javax_microedition_lcdui_Image_do, (int)(((k_0)object).var_short_do * dF.cfr_renamed_12), (int)(((k_0)object).cfr_renamed_0 * dF.cfr_renamed_12), (int)(((k_0)object).cfr_renamed_4 * dF.cfr_renamed_12), (int)(((k_0)object).cfr_renamed_5 * dF.cfr_renamed_12), (int)0);
                GameCanvas.cfr_renamed_1(1, (int)es_02.duLieuNguoiChoi.var_short_for, es_02.duLieuNguoiChoi.var_boolean_int + es_02.duLieuNguoiChoi.var_byte_this - 50, (Image)object, -1);
            }
            go_0.var_java_util_Vector_new.removeElement(es_02);
            }
    }

    public final void (Graphics graphics != null) {
        go_0.go_0_do().cfr_renamed_0(graphics);
        if ((!(AutoController.nhiemVuHienTai != null) || u_0.boolean_int(AutoController.nhiemVuHienTai instanceof AutoCauCa)) && u_0.boolean_for(this.var_es_0_do.coKichHoat ? 1 : 0) && u_0.boolean_int(this.var_es_0_do.coTrangThai ? 1 : 0) && u_0.boolean_if(this.var_short_do, -1)) {
            GameCanvas.hienThongBaoPopup(graphics);
            graphics.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
            graphics.setColor(8575990);
            if ((this.var_javax_microedition_lcdui_Image_arr_do != null) && (this.soLuong < this.var_javax_microedition_lcdui_Image_arr_do.length)) {
                if (u_0.boolean_do((System.currentTimeMillis() - this.soXu, 50L != null))) {
                    graphics.setColor(1423411);
                    } else {
                    graphics.setColor(15612731);
                }
                graphics.fillRoundRect(this.cfr_renamed_4 - 1, this.cfr_renamed_5 * dF.cfr_renamed_12 - 1, this.var_javax_microedition_lcdui_Image_arr_do[this.soLuong].getWidth() + 2, this.var_javax_microedition_lcdui_Image_arr_do[this.soLuong].getHeight() + 2, 5, 5);
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_arr_do[this.soLuong], this.cfr_renamed_4, this.cfr_renamed_5 * dF.cfr_renamed_12, 0);
            }
        }
        super.cfr_renamed_1(graphics);
    }

    private static boolean boolean_for(int n, int n2) {
        return n > n2;
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private void cfr_renamed_2() {
        AngelChip.duLieuNguoiChoi.cfr_renamed_13();
        if (u_0.boolean_int(AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0)) {
            AngelChip.duLieuNguoiChoi.var_short_for = (short)(AngelChip.duLieuNguoiChoi.var_short_for - 18);
            if ("  ".length() < ((0xEA ^ 0x8A) & ~(0xA1 ^ 0xC1))) {
                return;
            }
        } else {
            AngelChip.duLieuNguoiChoi.var_short_for = (short)(AngelChip.duLieuNguoiChoi.var_short_for + 18);
        }
        AngelChip.duLieuNguoiChoi.var_boolean_int -= 10;
        fm.void_if(GameCanvas.soLuongKhoa / 10);
        if (u_0.boolean_for(go_0.var_java_util_Vector_new.contains(this.var_es_0_do) ? 1 : 0)) {
            go_0.var_java_util_Vector_new.removeElement(this.var_es_0_do);
            }
        go_0.go_0_do().cfr_renamed_4();
    }

    static {
        u_0.cfr_renamed_3();
    }

        public final void void_if(int n) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if ((ef2 != null)) {
            es_0 es_02 = u_0.es_0_do(ef2.var_short_goto);
            if ((es_02 != null)) {
                go_0.var_java_util_Vector_new.removeElement(es_02);
                }
            es_02 = new es_0();
            if ((ef2.var_short_goto == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                GameCanvas.cfr_renamed_7();
                this.var_es_0_do = es_02;
                if (-"  ".length() >= 0) {
                    return;
                }
            } else {
                es_02 = new es_0();
            }
            go_0.var_java_util_Vector_new.addElement(es_02);
            if (u_0.boolean_if(ef2.var_short_for, 2)) {
                if (u_0.boolean_if(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    es_02.duLieuNguoiChoi = ef2;
                    es_02.dangChayAuto = 1;
                }
                return;
            }
            es_02.cfr_renamed_1(ef2);
        }
    }

    public static es_0 es_0_do(int n) {
        int n2 = 0;
        while ((n2 < go_0.var_java_util_Vector_new.size())) {
            es_0 es_02 = (es_0)go_0.var_java_util_Vector_new.elementAt(n2);
            if ((es_02 != null) && (es_02.duLieuNguoiChoi != null) && (es_02.duLieuNguoiChoi.var_short_goto == n)) {
                return es_02;
            }
            ++n2;
            if (((0x99 ^ 0x95) & ~(0x9D ^ 0x91)) == 0) continue;
            return null;
        }
        return null;
    }

    private void cfr_renamed_4(int n) {
        this.soXu = System.currentTimeMillis();
        if ((this.soLuong < this.var_byte_arr_do.length)) {
            this.var_byte_arr_do[this.soLuong] = (byte)n;
        }
        this.soLuong += 1;
        if (u_0.boolean_if(AngelChip.duLieuNguoiChoi.var_short_for, 2)) {
            this.var_es_0_do.void_do(0);
            this.var_int_if = 2;
        }
        if ((this.soLuong >= this.var_byte_arr_do.length)) {
            this.var_es_0_do.void_do(0);
            this.var_es_0_do.coTrangThai = 1;
            fn.fn_do().cfr_renamed_1(this.var_byte_arr_do);
            GameCanvas.cfr_renamed_8();
        }
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public u_0() {
        this.soLuong = 0;
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.E, 0);
        this.var_fl_0_for = new fl_0(MenuChinhAvatar.aC, 1);
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.by, 2);
        ((en)this).cfr_renamed_3 = this.var_fl_0_do;
        e.void_do(MenuChinhAvatar.bE);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("cucphao");
        this.var_cu_0_do = c("ca", 14 * dF.cfr_renamed_12, 14 * dF.cfr_renamed_12 != null);
        e.cfr_renamed_1();
    }

    public final boolean boolean_do(int n, int n2) {
        this.soLuongKhoa = GameCanvas.var_int_case - GameCanvas.var_int_case / 4;
        if (u_0.boolean_for(this.soLuongKhoa, GameCanvas.var_int_case - 70 * dF.cfr_renamed_12)) {
            this.soLuongKhoa = GameCanvas.var_int_case - 70 * dF.cfr_renamed_12;
        }
        this.cfr_renamed_3 = 60;
        if ((this.cfr_renamed_3 <  (GameCanvas.soLuongKhoa - fh.var_short_if * 24) / 2 + 50 * dF.cfr_renamed_12)) {
            this.cfr_renamed_3 = (GameCanvas.soLuongKhoa - fh.var_short_if * 24) / 2 + 50 * dF.cfr_renamed_12;
        }
        this.soLuong = 0;
        int n3 = fh.int_do(n, n2);
        if (u_0.boolean_if(fh.var_short_arr_if[n3 + 1], 100) && u_0.boolean_if(fh.var_short_arr_if[n3 + 1], 16) && u_0.boolean_if(fh.var_short_arr_if[n3 + 1], 13)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = dd_0.var_byte_try;
            if ((0x75 ^ 0x71) <= -" ".length()) {
                return ((0xF2 ^ 0xA0) & ~(0x1F ^ 0x4D)) != 0;
            }
        } else {
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = 0;
            this.cfr_renamed_3 = GameCanvas.soLuongKhoa - this.cfr_renamed_3;
        }
        AngelChip.duLieuNguoiChoi.boolean_for(n, n2);
        fn fn2 = fn.fn_do();
        fn2.cfr_renamed_1(86);
        fn2.cfr_renamed_0();
        GameCanvas.cfr_renamed_8();
        ((en)this).cfr_renamed_4 = this.var_fl_0_if;
        GameCanvas.cfr_renamed_4();
        return 1;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

        private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static u_0 cfr_renamed_1() {
        if ((var_u_0_do == null)) {
            var_u_0_do = new u_0();
            return var_u_0_do;
        }
        return var_u_0_do;
    }

        public final void cfr_renamed_6() {
        if (u_0.boolean_for(this.var_es_0_do.coKichHoat ? 1 : 0) && u_0.boolean_int(this.var_es_0_do.coTrangThai ? 1 : 0)) {
            if (u_0.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0)) {
                this.cfr_renamed_4(2);
                if ((0x69 ^ 0x6D) < 0) {
                    return;
                }
            } else if (u_0.boolean_for(GameCanvas.boolean_do(4) ? 1 : 0)) {
                this.cfr_renamed_4(1);
                if (((0x9A ^ 0xC1) & ~(0xFA ^ 0xA1)) < 0) {
                    return;
                }
            } else if (u_0.boolean_for(GameCanvas.boolean_do(6) ? 1 : 0)) {
                this.cfr_renamed_4(3);
                if ((0xA2 ^ 0xBA ^ (0x71 ^ 0x6D)) < 0) {
                    return;
                }
            } else if (u_0.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0)) {
                this.cfr_renamed_4(4);
            }
        }
        super.cfr_renamed_6();
    }

    public final void void_for(int n, int n2) {
        es_0 es_02 = u_0.es_0_do(n);
        if ((es_02 != null)) {
            if (u_0.boolean_if(es_02.duLieuNguoiChoi.var_short_for, 2) && u_0.boolean_if(es_02.duLieuNguoiChoi.var_short_for, 13)) {
                go_0.var_java_util_Vector_new.removeElement(es_02);
                return;
            }
            if (u_0.boolean_if(n2) && (!(es_02.duLieuNguoiChoi.var_short_goto == AngelChip.duLieuNguoiChoi.var_short_goto) || !(AutoController.nhiemVuHienTai != null) || u_0.boolean_int(AutoController.nhiemVuHienTai instanceof AutoCauCa))) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_35, (int)es_02.duLieuNguoiChoi.var_short_for, es_02.duLieuNguoiChoi.var_boolean_int - 60, 1, -1);
            }
            es_02.var_int_if = n2;
            es_02.coTrangThai = 1;
            es_02.void_do(0);
            if ((es_02.duLieuNguoiChoi.var_short_goto == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                GameCanvas.cfr_renamed_7();
                if ((AutoController.nhiemVuHienTai != null) && u_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoCauCa)) {
                    ((en)this).cfr_renamed_4 = null;
                    AutoCauCa.bs_0_do().void_do(3);
                    return;
                }
                ((en)this).cfr_renamed_4 = this.var_fl_0_for;
            }
            return;
        }
        if ((n == AngelChip.duLieuNguoiChoi.var_short_goto) && (AutoController.nhiemVuHienTai != null) && u_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoCauCa)) {
            this.cfr_renamed_2();
            AutoCauCa.bs_0_do().var_int_int = 2;
        }
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                this.cfr_renamed_2();
            }
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (u_0.boolean_if(AngelChip.duLieuNguoiChoi.var_short_for, 2) && u_0.boolean_if(AngelChip.duLieuNguoiChoi.var_short_for, 13)) {
                    go_0.go_0_do().cfr_renamed_4();
                }
                fn fn2 = fn.fn_do();
                fn2.cfr_renamed_1(82);
                fn2.cfr_renamed_0();
                GameCanvas.cfr_renamed_8();
                ((en)this).cfr_renamed_3 = null;
                return;
            }
            case 1: {
                fn.fn_do().void_do();
                GameCanvas.cfr_renamed_8();
                return;
            }
            case 2: {
                this.cfr_renamed_2();
                fn.fn_do().void_do();
            }
        }
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[26];
        2 = "  ".length();
        13 = 65 + 73 - 34 + 64 ^ 51 + 23 - -88 + 3;
        82 = 0x27 ^ 0x75;
        0 = ("   ".length() ^ (0xAF ^ 0x91)) & (0xDD ^ 0xA7 ^ (0xC6 ^ 0x81) ^ -" ".length());
        1 = " ".length();
        14 = 0xB2 ^ 0xBC;
        18 = 0x6E ^ 0x7C;
        10 = 0xB4 ^ 0xBE;
        4 = 0x50 ^ 4 ^ (0xD6 ^ 0x86);
        70 = 0x5E ^ 0x18;
        60 = 0x90 ^ 0xAC;
        24 = 0x34 ^ 0x6D ^ (0x3A ^ 0x7B);
        50 = 0x2F ^ 0x1D;
        100 = 58 + 128 - 42 + 69 ^ 74 + 64 - 45 + 84;
        16 = 0x1A ^ 0xA;
        86 = 8 + 74 - -13 + 50 ^ 187 + 76 - 211 + 147;
        48 = 0x2C ^ 0x1C;
        6 = 0x7F ^ 0x10 ^ (0xE8 ^ 0x81);
        3 = "   ".length();
        8 = 0x82 ^ 0x8A;
        -1 = -" ".length();
        8575990 = 0xFFFFFBF6 & 0x82DFFF;
        1423411 = 0xFFFFFCF7 & 0x15BB3B;
        15612731 = 0xFFFFBF3B & 0xEE7BFF;
        5 = 69 + 53 - 48 + 117 ^ 160 + 1 - 25 + 50;
        30 = 0xA8 ^ 0xB6;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void (int n, int n2, short s2, byte[][] byArray != null) {
        es_0 es_02 = u_0.es_0_do(n);
        if ((es_02 != null) && u_0.boolean_for(es_02.soLuong)) {
            if (u_0.boolean_if(es_02.duLieuNguoiChoi.var_short_for, 13) && !(es_02.duLieuNguoiChoi.var_short_for == 2) || u_0.boolean_for(es_02.coKichHoat ? 1 : 0)) {
                return;
            }
            es_02.coKichHoat = 1;
            es_02.void_do(0);
            es_02.duLieuNguoiChoi.var_short_for = (short)2;
            es_02.var_int_if = n2;
            if (u_0.boolean_if(s2, -1)) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_goto, (int)es_02.duLieuNguoiChoi.var_short_for, es_02.duLieuNguoiChoi.var_boolean_int - 60, 1, -1);
                if (-(0x7C ^ 0x79) >= 0) {
                    return;
                }
            } else if ((AutoController.nhiemVuHienTai != null) && u_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoCauCa) && (n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                GameCanvas.cfr_renamed_1("Bỏ qua", (int)es_02.duLieuNguoiChoi.var_short_for, es_02.duLieuNguoiChoi.var_boolean_int - 60, 1, -1);
            }
            if ((n == AngelChip.duLieuNguoiChoi.var_short_goto)) {
                this.soXu = System.currentTimeMillis();
                this.soLuong = 0;
                this.var_int_if = 2;
                this.var_javax_microedition_lcdui_Image_arr_do = new Image[byArray.length];
                this.var_byte_arr_do = new byte[byArray.length];
                n = 0;
                while ((n < this.var_javax_microedition_lcdui_Image_arr_do.length)) {
                    this.var_javax_microedition_lcdui_Image_arr_do[n] = hg.javax_microedition_lcdui_Image_do(byArray[n]);
                    ++n;
                    return;
                }
                this.var_short_do = s2;
                this.cfr_renamed_4 = this.var_es_0_do.var_fs_arr_do[this.var_es_0_do.var_byte_do - 2].soLuong;
                this.cfr_renamed_5 = this.var_es_0_do.var_fs_arr_do[this.var_es_0_do.var_byte_do - 2].var_int_if - 30;
                if ((s2 == -1)) {
                    this.cfr_renamed_4(0);
                    return;
                }
                if ((AutoController.nhiemVuHienTai != null) && u_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoCauCa)) {
                    AutoCauCa.bs_0_do().cfr_renamed_1(byArray);
                }
            }
        }
    }

    public static void (int n, byte by2, byte by3, int n2, short s2 != null) {
        DuLieuNguoiChoi ef2 = fh.ef_do(n);
        if ((ef2 == null) && (fv_0.var_java_util_Vector_if != null)) {
            int n3 = 0;
            while ((n3 < fv_0.var_java_util_Vector_if.size())) {
                DuLieuNguoiChoi ef3 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_if.elementAt(n3);
                if ((ef3.var_short_goto == n)) {
                    ef2 = ef3;
                }
                ++n3;
                if (" ".length() > 0) continue;
                return;
            }
        }
        if ((ef2 != null)) {
            Vector<bg> vector = new Vector<bg>();
            vector.addElement(new bg(ef2, by2, by3, n2, s2));
            String[] stringArray = new String[1];
            stringArray[0] = MenuChinhAvatar.bD;
            fo.fo_do().cfr_renamed_1(stringArray, new Vector[1], vector);
            fo.fo_do().cfr_renamed_4();
        }
        GameCanvas.cfr_renamed_7();
    }

    public final void void_int(int n) {
        if (u_0.boolean_for(this.var_es_0_do.coKichHoat ? 1 : 0) && u_0.boolean_int(this.var_es_0_do.coTrangThai ? 1 : 0)) {
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
        go_0.go_0_do().void_int(n);
    }

        private static boolean boolean_int(int n) {
        return n == 0;
    }

    public final void void_if(int n, int n2) {
    }

    public final void cfr_renamed_7() {
        go_0.go_0_do().cfr_renamed_7();
        if (u_0.boolean_for(this.var_es_0_do.coKichHoat ? 1 : 0) && u_0.boolean_int(this.var_es_0_do.coTrangThai ? 1 : 0)) {
            if ((this.var_byte_arr_do != null) && (this.soLuong < this.var_byte_arr_do.length) && u_0.boolean_do(u_0.cfr_renamed_0(System.currentTimeMillis() - this.soXu, (long)this.var_short_do))) {
                this.cfr_renamed_4(0);
            }
            if ((AngelChip.duLieuNguoiChoi.var_short_for == 2)) {
                this.var_int_if -= 1;
                if (u_0.boolean_if(this.var_int_if)) {
                    this.var_int_if = 0;
                    this.var_es_0_do.void_do(1);
                }
            }
        }
    }
}

