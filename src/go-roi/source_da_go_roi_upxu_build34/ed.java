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

public final class ed
extends dL {
    ei var_ei_do;
    private Image var_javax_microedition_lcdui_Image_do;
    private int soLuongKhoa;
    private dL var_dL_do;
    private long soXu = 0L;
    private boolean[] var_boolean_arr_do;
    private Image var_javax_microedition_lcdui_Image_if;
    private eq_0 var_eq_0_do;
    ei var_ei_if;
    private boolean coTrangThai;
    private Vector var_java_util_Vector_do;
    private Image var_javax_microedition_lcdui_Image_for;
    private short var_short_do;
    private Image cfr_renamed_12;
    private int var_int_int;
    private static ed var_ed_do;
    private boolean coKichHoat;
    private static final int[] mangSoNguyen;
    private Vector var_java_util_Vector_if;
    int soLuong;
    int var_int_if;
    private boolean var_boolean_int = 0;
    boolean dangChayAuto;
    private ei var_ei_for;
    private boolean var_boolean_try;
    private int cfr_renamed_5;
    private ep var_ep_do;
    private ei var_ei_byte;
    private int var_int_try;
    private int var_int_byte;

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

    public final void (int n, int n2, Vector vector != null) {
        int n3;
        if (ed.boolean_do(n, AngelChip.duLieuNguoiChoi.var_short_char)) {
            DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(n);
            if ((dd_02 != null)) {
                (vector, dd_02, n2 + 100 + 20 != null);
            }
            return;
        }
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.nhiemVuHienTai instanceof fl != 0)) {
            n3 = 1;
            if ((0xC4 ^ 0xC1) <= 0) {
                return;
            }
        } else {
            n3 = 0;
        }
        if ((n3 != 0)) {
            ((dL)this).cfr_renamed_5 = this.var_ei_byte;
            this.dangChayAuto = 1;
            this.soLuongKhoa = 145;
            if ((5 ^ 1) <= "  ".length()) {
                return;
            }
        } else {
            ((dL)this).cfr_renamed_5 = this.var_ei_do;
            this.dangChayAuto = 0;
            this.soLuongKhoa = 100 + (this.var_int_if - 90);
        }
        this.var_java_util_Vector_do = vector;
        this.var_boolean_try = 1;
        GameCanvas.cfr_renamed_8();
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_boolean_int = 1;
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                this.var_dL_do.cfr_renamed_8();
                this.coTrangThai = 0;
                this.var_boolean_try = 0;
                this.dangChayAuto = 0;
                ((dL)this).cfr_renamed_5 = this.var_ei_if;
                n = 0;
                while ((n < 3)) {
                    this.var_boolean_arr_do[n] = 0;
                    ++n;
                    if ((0xC3 ^ 0xC7) >= (0x10 ^ 0x14)) continue;
                    return;
                }
                this.var_java_util_Vector_if.removeAllElements();
                if (!(this.coKichHoat)) {
                    (this.var_java_util_Vector_do, AngelChip.duLieuNguoiChoi, 0 != null);
                    return;
                }
                this.coKichHoat = 0;
                return;
            }
            case 3: {
                AutoController.tatAuto();
                this.cfr_renamed_1();
                GameCanvas.hienThongBaoPopup("Đã tắt Auto!\n" + fl.var_fl_do.java_lang_String_if());
            }
        }
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[36];
        5 = 0xA9 ^ 0xB7 ^ (0x1F ^ 4);
        0 = (0xD4 ^ 0xC3 ^ (0xB8 ^ 0xB4)) & (0x42 ^ 0x4B ^ (0x23 ^ 0x31) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        11 = 0x79 ^ 0x72;
        200 = (0x69 ^ 0x11) + (127 + 31 - 80 + 65) - (0x44 ^ 0x32) + (0x3E ^ 9);
        80 = 0x9A ^ 0xAF ^ (0x4C ^ 0x29);
        90 = 82 + 52 - -36 + 35 ^ 20 + 120 - 76 + 87;
        30 = 118 + 96 - 95 + 32 ^ 50 + 28 - -27 + 32;
        360 = 0xFFFFFB6D & 0x5FA;
        2 = "  ".length();
        50 = 0x3D ^ 0x26 ^ (0x71 ^ 0x58);
        7200 = -(0xFFFFE6FF & 0x7B48) & (0xFFFFFEF7 & 0x7F6F);
        10 = 133 + 41 - 53 + 18 ^ 30 + 95 - 76 + 80;
        20 = 0x18 ^ 0xC;
        8 = 0x75 ^ 0x1E ^ (0x1F ^ 0x7C);
        4 = 0x42 ^ 0x46;
        150 = 73 + 38 - 56 + 95;
        180 = 44 + 42 - 11 + 105;
        210 = 140 + 139 - 243 + 116 + (7 ^ 3) - (0xD3 ^ 0x9C) + (29 + 41 - 67 + 130);
        -1 = -" ".length();
        70 = 0x32 ^ 0x74;
        270 = 0xFFFFD54E & 0x2BBF;
        100 = 0xF9 ^ 0x9D;
        145 = 61 + 48 - 55 + 91;
        82 = 0x7E ^ 0xD ^ (0x4B ^ 0x6A);
        278 = -(0xFFFFDBAF & 0x7CFA) & (0xFFFFDFFF & 0x79BF);
        17 = 0xB1 ^ 0xA0;
        7 = 0x4D ^ 0x4A;
        64 = 0x52 ^ 0x12;
        62 = 2 ^ 0x3C;
        40 = 0xEE ^ 0xC6;
        24 = 73 + 124 - 82 + 44 ^ 14 + 76 - 12 + 57;
        6 = 0xA4 ^ 0x93 ^ (0xAE ^ 0x9F);
        14483456 = -(0xFFFFFF9F & 0x6E6B) & (0xFFFFEEDB & 0xDD7F2E);
        12 = 0xBC ^ 0x89 ^ (0x8B ^ 0xB2);
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

        private static boolean boolean_if(int n) {
        return n < 0;
    }

    public final void cfr_renamed_1() {
        if (!(this.var_boolean_try)) {
            ((dL)this).cfr_renamed_5 = this.var_ei_for;
            } else {
            ((dL)this).cfr_renamed_5 = this.var_ei_do;
        }
        this.soLuong = 90;
    }

    private void void_for(int n, int n2) {
        int n3 = 0;
        while ((n3 < 10)) {
            int n4 = 1;
            if ((n3 % 2 == 0)) {
                n4 = -1;
            }
            fa fa2 = new fa(n, n2);
            new fa(n, n2).cfr_renamed_8 = 0;
            fa2.var_int_new = n4 * (gc_0.int_do(80) / 10);
            fa2.soLuong = -gc_0.int_do(70) / 10;
            this.var_java_util_Vector_if.addElement(fa2);
            ++n3;
            if (-" ".length() <= -" ".length()) continue;
            return;
        }
    }

        private static boolean boolean_for(int n, int n2) {
        return n == n2;
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public static ed cfr_renamed_0() {
        if ((var_ed_do == null)) {
            var_ed_do = new ed();
            return var_ed_do;
        }
        return var_ed_do;
    }

        public final void cfr_renamed_15() {
        int n;
        int n2;
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.nhiemVuHienTai instanceof fl != 0)) {
            n2 = 1;
            if (-" ".length() < -" ".length()) {
                return;
            }
        } else {
            n2 = n = 0;
        }
        if (!(this.coTrangThai) && (n == 0)) {
            if (ed.boolean_for(GameCanvas.var_gj_0_do.int_do(), 1)) {
                if ((GameCanvas.var_boolean_try)) {
                    GameCanvas.var_boolean_arr_for[5] = 1;
                }
                if ((GameCanvas.var_boolean_new)) {
                    GameCanvas.var_boolean_arr_if[5] = 1;
                }
            }
            if ((GameCanvas.var_boolean_arr_for[5] != 0) && !(this.var_boolean_try) && (this.var_boolean_int)) {
                if ((this.soLuong < 270)) {
                    this.soLuong += 3;
                    if ((0xA5 ^ 0xC3 ^ (0xCF ^ 0xAD)) < " ".length()) {
                        return;
                    }
                }
            } else if ((this.soLuong > 90)) {
                this.soLuong -= 3;
            }
            if ((GameCanvas.var_boolean_arr_if[5] != 0)) {
                if ((this.soLuong > 90) && !(this.var_boolean_try) && (this.var_boolean_int)) {
                    this.var_int_if = this.soLuong;
                    eq.eq_do().cfr_renamed_0(this.var_short_do, this.var_int_if - 90);
                    GameCanvas.cfr_renamed_5();
                }
                GameCanvas.var_boolean_arr_if[5] = 0;
            }
        }
        super.cfr_renamed_15();
    }

        public final void (Graphics graphics != null) {
        int n;
        int n2;
        int n3;
        int n4;
        this.var_dL_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        int n5 = this.var_int_int / 20;
        int n6 = 0;
        while ((n6 < this.cfr_renamed_5)) {
            n4 = n5 + n6 * this.var_int_try;
            if ((n4 > 360)) {
                n4 -= 360;
            }
            if ((n4 >= 82) && ed.boolean_if(n4, 278)) {
                n3 = gc_0.int_int(n4);
                n2 = this.var_int_byte * gc_0.int_new(n3) >> 10;
                n = -(this.var_int_byte * gc_0.int_for(n3)) >> 10;
                graphics.drawImage(this.cfr_renamed_12, this.var_eq_0_do.var_int_if + n2, this.var_eq_0_do.soLuong + n, 3);
            }
            ++n6;
            if (-" ".length() < " ".length()) continue;
            return;
        }
        if ((this.coTrangThai)) {
            n3 = 0;
            while ((n3 < this.var_java_util_Vector_do.size())) {
                if (ed.cfr_renamed_4(ed.cfr_renamed_0(System.currentTimeMillis() / 100L - this.soXu, (long)((n3 + 1) * 5)))) {
                    n_0 n_02 = (n_0)this.var_java_util_Vector_do.elementAt(n3);
                    switch (n_02.var_byte_do) {
                        case 1: {
                            ci_0.q_0_do(n_02.var_short_do).cfr_renamed_0(graphics, n_02.cfr_renamed_1, n_02.soLuong, 3);
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, n_02.chuoiGiaTri, n_02.cfr_renamed_1 - 17, n_02.soLuong - 7, 1);
                            if (((0xE9 ^ 0xC2 ^ (0x28 ^ 0x39)) & (0x4E ^ 0x2F ^ (0xFA ^ 0xA1) ^ -" ".length())) == 0) break;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, MenuChinhAvatar.cU, n_02.cfr_renamed_1, n_02.soLuong - bn_0.var_byte_try / 2, 2);
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, String.valueOf(n_02.cfr_renamed_4), n_02.cfr_renamed_1 - 17, n_02.soLuong - 8, 1);
                            if ((0xAD ^ 0xA8) != 0) break;
                            return;
                        }
                        case 3: {
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "xp", n_02.cfr_renamed_1, n_02.soLuong - bn_0.var_byte_try / 2, 2);
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, String.valueOf(n_02.cfr_renamed_3), n_02.cfr_renamed_1 - 17, n_02.soLuong - 8, 1);
                            if ((0x51 ^ 0x1A ^ (0xF ^ 0x40)) > "   ".length()) break;
                            return;
                        }
                        case 4: {
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, MenuChinhAvatar.dh, n_02.cfr_renamed_1, n_02.soLuong - bn_0.var_byte_try / 2, 2);
                            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, String.valueOf(n_02.cfr_renamed_5), n_02.cfr_renamed_1 - 17, n_02.soLuong - 8, 1);
                        }
                    }
                }
                ++n3;
                if ((0x8E ^ 0x8B) != 0) continue;
                return;
            }
        }
        n6 = 0;
        n4 = 0;
        while ((n4 < this.cfr_renamed_5)) {
            n3 = n5 + n4 * this.var_int_try;
            if ((n3 > 360)) {
                n3 -= 360;
            }
            if ((n3 >= 82) && ed.boolean_if(n3, 278)) {
                n2 = gc_0.int_int(n3);
                n = this.var_int_byte * gc_0.int_new(n2) >> 10;
                n2 = -(this.var_int_byte * gc_0.int_for(n2)) >> 10;
                long l = System.currentTimeMillis() / 100L - this.soXu;
                if ((this.coTrangThai) && (n3 >= 150) && ed.boolean_if(n3, 210) && (!ed.boolean_do(ed.cfr_renamed_0(l, (long)((n6 + 1) * 5))) || ed.boolean_do(ed.cfr_renamed_0(l, (long)((n6 + 1) * 5 - 5))))) {
                    ++n6;
                    if ((0x18 ^ 0x12 ^ (0x3F ^ 0x31)) == " ".length()) {
                        return;
                    }
                } else {
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_if, this.var_eq_0_do.var_int_if + n, this.var_eq_0_do.soLuong + n2, 3);
                }
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.var_eq_0_do.var_int_if + n, this.var_eq_0_do.soLuong + n2, 3);
            }
            ++n4;
            if ("  ".length() != 0) continue;
            return;
        }
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_for, 0, 0, 64, 62, 0, this.var_eq_0_do.var_int_if, this.var_eq_0_do.soLuong, 40);
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_for, 0, 0, 64, 62, 1, this.var_eq_0_do.var_int_if, this.var_eq_0_do.soLuong, 24);
        n3 = gc_0.int_int(this.soLuong);
        n2 = (this.var_int_byte / 3 + 2) * gc_0.int_new(n3) >> 10;
        n = -((this.var_int_byte / 3 + 2) * gc_0.int_for(n3)) >> 10;
        n5 = this.soLuong + 90;
        if ((n5 > 360)) {
            n5 -= 360;
        }
        n5 = gc_0.int_int(n5);
        n3 = 6 * gc_0.int_new(n5) >> 10;
        n5 = -(6 * gc_0.int_for(n5)) >> 10;
        int n7 = this.soLuong - 90;
        if (ed.boolean_if(n7)) {
            n7 += 360;
        }
        n7 = gc_0.int_int(n7);
        int n8 = 6 * gc_0.int_new(n7) >> 10;
        n7 = -(6 * gc_0.int_for(n7)) >> 10;
        graphics.setColor(14483456);
        graphics.fillTriangle(this.var_eq_0_do.var_int_if + n2, this.var_eq_0_do.soLuong + n, this.var_eq_0_do.var_int_if + n3, this.var_eq_0_do.soLuong + n5, this.var_eq_0_do.var_int_if + n8, this.var_eq_0_do.soLuong + n7);
        graphics.fillRoundRect(this.var_eq_0_do.var_int_if - 6, this.var_eq_0_do.soLuong - 6, 12, 12, 12, 12);
        if (!!(this.coTrangThai) || (this.soLuongKhoa > 0)) {
            Graphics graphics2 = graphics;
            ed ed2 = this;
            n4 = 0;
            while ((n4 < ed2.var_java_util_Vector_if.size())) {
                fa fa2 = (fa)ed2.var_java_util_Vector_if.elementAt(n4);
                ed2.var_ep_do.cfr_renamed_0(fa2.cfr_renamed_8 / 5, fa2.cfr_renamed_3, fa2.coTrangThai ? 1 : 0, 0, 3, graphics2);
                ++n4;
                return;
            }
        }
        super.cfr_renamed_0(graphics);
    }

        public ed() {
        this.var_java_util_Vector_do = new Vector();
        ap.void_do(MenuChinhAvatar.bP);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("c");
        this.var_javax_microedition_lcdui_Image_for = ap.javax_microedition_lcdui_Image_do("sq");
        this.var_javax_microedition_lcdui_Image_if = ap.javax_microedition_lcdui_Image_do("q");
        this.var_ep_do = ep.cfr_renamed_0("st", 11 * bn_0.cfr_renamed_6, 11 * bn_0.cfr_renamed_6);
        this.cfr_renamed_12 = ap.javax_microedition_lcdui_Image_do("cb");
        ap.cfr_renamed_0();
        if ((GameCanvas.var_int_byte < 200)) {
            this.var_int_byte = 80;
            } else {
            this.var_int_byte = 90;
        }
        this.var_eq_0_do = new eq_0(GameCanvas.var_int_byte, GameCanvas.var_int_long);
        this.var_int_try = 30;
        this.cfr_renamed_5 = 360 / this.var_int_try;
        this.var_ei_if = new ei(MenuChinhAvatar.cQ, 0);
        this.var_ei_do = new ei(MenuChinhAvatar.cT, 1);
        this.var_ei_for = new ei(MenuChinhAvatar.cfr_renamed_7, 2);
        this.var_ei_byte = new ei("Tắt Auto", 3);
        ((dL)this).cfr_renamed_5 = this.var_ei_if;
        this.soLuong = 90;
        this.var_boolean_arr_do = new boolean[3];
        this.var_java_util_Vector_if = new Vector();
        this.dangChayAuto = 0;
        this.coKichHoat = 0;
    }

        public final void void_for() {
        Object object;
        int n;
        int n2;
        this.var_dL_do.void_for();
        if ((this.soLuongKhoa > 0)) {
            this.var_int_int -= this.soLuongKhoa;
            if (ed.boolean_if(this.var_int_int)) {
                this.var_int_int += 7200;
            }
            if ((this.soLuongKhoa < 10)) {
                if ((this.var_int_int / 20 % 30 == 0)) {
                    this.soLuongKhoa = 0;
                    if (-(0xB1 ^ 0x8F ^ (0x67 ^ 0x5C)) >= 0) {
                        return;
                    }
                }
            } else {
                this.soLuongKhoa -= 1;
            }
            if (ed.boolean_for(GameCanvas.var_int_try % 8, 4)) {
                n2 = gc_0.int_do(this.cfr_renamed_5);
                n = this.var_int_int / 20 + n2 * this.var_int_try;
                if ((n > 360)) {
                    n -= 360;
                }
                n = gc_0.int_int(n);
                n2 = this.var_int_byte * gc_0.int_new(n) >> 10;
                n = -(this.var_int_byte * gc_0.int_for(n)) >> 10;
                this.void_for(this.var_eq_0_do.var_int_if + n2, this.var_eq_0_do.soLuong + n);
                if ("  ".length() < ((134 + 109 - 213 + 115 ^ 11 + 86 - -72 + 16) & (0x1C ^ 3 ^ (0x28 ^ 0x1F) ^ -" ".length()))) {
                    return;
                }
            }
        } else if ((this.var_boolean_try)) {
            this.var_boolean_try = 0;
            this.coTrangThai = 1;
            this.var_boolean_int = 0;
            this.soXu = System.currentTimeMillis() / 100L;
            n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                object = (n_0)this.var_java_util_Vector_do.elementAt(n);
                if ((n == 0)) {
                    n2 = 150;
                    if ((0x71 ^ 0x75) == "   ".length()) {
                        return;
                    }
                } else if (ed.boolean_for(n, 1)) {
                    n2 = 180;
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    n2 = 210;
                }
                n2 = gc_0.int_int(n2);
                int n3 = this.var_int_byte * gc_0.int_new(n2) >> 10;
                n2 = -(this.var_int_byte * gc_0.int_for(n2)) >> 10;
                ((n_0)object).cfr_renamed_1 = this.var_eq_0_do.var_int_if + n3;
                ((n_0)object).soLuong = this.var_eq_0_do.soLuong + n2;
                ++n;
                if (((0x3E ^ 0x15) & ~(0x6F ^ 0x44)) == 0) continue;
                return;
            }
        }
        if ((this.dangChayAuto)) {
            this.dangChayAuto = 0;
            this.coKichHoat = 1;
            int n4 = 0;
            while ((n4 < 3)) {
                this.var_boolean_arr_do[n4] = 0;
                ++n4;
                if (((0x42 ^ 0x4B ^ (0xC5 ^ 0x8E)) & (0x4E ^ 0x2D ^ (0x98 ^ 0xB9) ^ -" ".length())) <= " ".length()) continue;
                return;
            }
            if (!(this.var_java_util_Vector_if.isEmpty())) {
                this.var_java_util_Vector_if.removeAllElements();
            }
            (this.var_java_util_Vector_do, AngelChip.duLieuNguoiChoi, 0 != null);
            return;
        }
        if (ed.cfr_renamed_0(((dL)this).cfr_renamed_5, this.var_ei_do)) {
            n2 = 0;
            n = 0;
            while ((n < this.var_boolean_arr_do.length)) {
                if ((this.var_boolean_arr_do[n] != 0)) {
                    ++n2;
                }
                ++n;
                if (((0x6D ^ 0x1C ^ (0x2F ^ 7)) & (0xFA ^ 0xC1 ^ (0x4B ^ 0x29) ^ -" ".length())) <= 0) continue;
                return;
            }
            if (ed.boolean_for(n2, 3)) {
                ((dL)this).cfr_renamed_5 = this.var_ei_for;
            }
        }
        n2 = 0;
        while ((n2 < this.var_java_util_Vector_if.size())) {
            object = (fa)this.var_java_util_Vector_if.elementAt(n2);
            ((fa)object).cfr_renamed_3 = (short)(((fa)object).cfr_renamed_3 + ((fa)object).var_int_new);
            if (!ed.boolean_if(((fa)object).var_int_new, 1) || ed.cfr_renamed_4(((fa)object).var_int_new, -1)) {
                ((fa)object).var_int_new -= ((fa)object).var_int_new / gc_0.int_if(((fa)object).var_int_new);
            }
            ((fa)object).coTrangThai += ((fa)object).soLuong;
            ((fa)object).soLuong += 1;
            ((fa)object).cfr_renamed_8 += 1;
            if (ed.cfr_renamed_5(((fa)object).cfr_renamed_8, 20)) {
                this.var_java_util_Vector_if.removeElement(object);
                }
            ++n2;
            if ((131 + 23 - 110 + 120 ^ 116 + 101 - 171 + 114) != " ".length()) continue;
            return;
        }
        if ((this.coTrangThai)) {
            n2 = 0;
            while ((n2 < this.var_java_util_Vector_do.size())) {
                if ((this.var_boolean_arr_do[n2] == 0) && ed.cfr_renamed_4(ed.cfr_renamed_1(System.currentTimeMillis() / 100L - this.soXu, (long)((n2 + 1) * 5)))) {
                    this.var_boolean_arr_do[n2] = 1;
                    object = (n_0)this.var_java_util_Vector_do.elementAt(n2);
                    this.void_for(((n_0)object).cfr_renamed_1, ((n_0)object).soLuong);
                }
                ++n2;
                if (" ".length() != "   ".length()) continue;
                return;
            }
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void (Vector vector, DuLieuNguoiChoi dd_02, int n != null) {
        int n2 = 0;
        while ((n2 < vector.size())) {
            Object object = (n_0)vector.elementAt(n2);
            String string = "";
            switch (((n_0)object).var_byte_do) {
                case 1: {
                    object = ci_0.q_0_do(((n_0)object).var_short_do);
                    object = ci_0.var_bH_arr_do[((q_0)object).var_short_if];
                    GameCanvas.hienThongBaoPopup(0, dd_02.coKichHoat ? 1 : 0, dd_02.var_short_if - 50, gc_0.cfr_renamed_0(((bH)object).cfr_renamed_4 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_2 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_5 * bn_0.cfr_renamed_6, ((bH)object).cfr_renamed_3 * bn_0.cfr_renamed_6, ci_0.gy_0_do((int)((bH)object).cfr_renamed_1).var_javax_microedition_lcdui_Image_do), n);
                    if (-"  ".length() < 0) break;
                    return;
                }
                case 2: {
                    string = "+" + ((n_0)object).cfr_renamed_4 + MenuChinhAvatar.cU;
                    dd_02.void_int(dd_02.mangSoNguyen[0] + ((n_0)object).cfr_renamed_4);
                    n += 20;
                    if (null == null) break;
                    return;
                }
                case 3: {
                    string = "+" + ((n_0)object).cfr_renamed_3 + " xp";
                    dd_02.void_try(dd_02.var_int_void + ((n_0)object).cfr_renamed_3);
                    n += 20;
                    if (-" ".length() < " ".length()) break;
                    return;
                }
                case 4: {
                    string = "+" + ((n_0)object).cfr_renamed_5 + MenuChinhAvatar.dh;
                    int n3 = 2;
                    dd_02.mangSoNguyen[n3] = dd_02.mangSoNguyen[n3] + ((n_0)object).cfr_renamed_5;
                    n += 20;
                }
            }
            if (!(string.equals(""))) {
                GameCanvas.hienThongBaoPopup(string, dd_02.coKichHoat ? 1 : 0, dd_02.var_short_if - 50, 1, n);
            }
            ++n2;
            if (((23 + 92 - 97 + 154 ^ 79 + 156 - 135 + 63) & (0x48 ^ 0x39 ^ (0xD ^ 0x73) ^ -" ".length())) == 0) continue;
            return;
        }
    }

    public final void (dL dL2 == short s2) {
        this.var_dL_do = dL2;
        this.var_short_do = s2;
        GameCanvas.var_boolean_arr_for[5] = 0;
        this.coTrangThai = 0;
        this.var_boolean_try = 0;
        this.dangChayAuto = 0;
        this.coKichHoat = 0;
        ((dL)this).cfr_renamed_5 = this.var_ei_if;
        super.cfr_renamed_8();
    }

            static {
        ed.cfr_renamed_4();
    }
}

