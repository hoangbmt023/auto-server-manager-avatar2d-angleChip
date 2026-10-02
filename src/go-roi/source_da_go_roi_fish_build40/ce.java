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

public final class ce
extends en {
    private fl_0 var_fl_0_for;
    fl_0 var_fl_0_do;
    int soLuong;
    private int soLuongKhoa;
    private int var_int_int;
    private boolean coTrangThai = 0;
    boolean dangChayAuto;
    private boolean[] var_boolean_arr_do;
    private boolean coKichHoat;
    private boolean var_boolean_int;
    private Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_4;
    private int var_int_try;
    private fl_0 var_fl_0_byte;
    private boolean var_boolean_try;
    int var_int_if;
    private int var_int_byte;
    private cu_0 var_cu_0_do;
    private Image var_javax_microedition_lcdui_Image_if;
    private static ce var_ce_do;
    private long soXu = 0L;
    private en var_en_do;
    private fs var_fs_do;
    private short var_short_do;
    private Image var_javax_microedition_lcdui_Image_for;
    private Vector var_java_util_Vector_do = new Vector();
    private Image cfr_renamed_8;
    fl_0 var_fl_0_if;
    private static final int[] mangSoNguyen;
    private Vector var_java_util_Vector_if;

    public ce() {
        e.void_do(MenuChinhAvatar.t);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("c");
        this.var_javax_microedition_lcdui_Image_for = e.javax_microedition_lcdui_Image_do("sq");
        this.var_javax_microedition_lcdui_Image_if = e.javax_microedition_lcdui_Image_do("q");
        this.var_cu_0_do = cu_0.cfr_renamed_1("st", 11 * dF.cfr_renamed_12, 11 * dF.cfr_renamed_12);
        this.cfr_renamed_8 = e.javax_microedition_lcdui_Image_do("cb");
        e.cfr_renamed_1();
        if ((GameCanvas.soLuongKhoa < 200)) {
            this.var_int_try = 80;
            if (-"   ".length() >= 0) {
                throw null;
            }
        } else {
            this.var_int_try = 90;
        }
        this.var_fs_do = new fs(GameCanvas.soLuongKhoa, GameCanvas.var_int_char);
        this.cfr_renamed_4 = 30;
        this.soLuongKhoa = 360 / this.cfr_renamed_4;
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.ad, 0);
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.bZ, 1);
        this.var_fl_0_byte = new fl_0(MenuChinhAvatar.by, 2);
        this.var_fl_0_for = new fl_0("Tắt Auto", 3);
        ((en)this).cfr_renamed_3 = this.var_fl_0_if;
        this.soLuong = 90;
        this.var_boolean_arr_do = new boolean[3];
        this.var_java_util_Vector_if = new Vector();
        this.dangChayAuto = 0;
        this.var_boolean_int = 0;
    }

    public static ce cfr_renamed_1() {
        if ((var_ce_do == null)) {
            var_ce_do = new ce();
            return var_ce_do;
        }
        return var_ce_do;
    }

    public final void (Graphics graphics == null) {
        int n;
        int n2;
        int n3;
        int n4;
        this.var_en_do.cfr_renamed_0(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        int n5 = this.var_int_int / 20;
        int n6 = 0;
        while ((n6 < this.soLuongKhoa)) {
            n4 = n5 + n6 * this.cfr_renamed_4;
            if ((n4 > 360)) {
                n4 -= 360;
            }
            if (ce.boolean_do(n4, 82) && ce.boolean_for(n4, 278)) {
                n3 = hg.int_for(n4);
                n2 = this.var_int_try * hg.int_int(n3) >> 10;
                n = -(this.var_int_try * hg.int_if(n3)) >> 10;
                graphics.drawImage(this.cfr_renamed_8, this.var_fs_do.soLuong + n2, this.var_fs_do.var_int_if + n, 3);
            }
            ++n6;
            if ((0x88 ^ 0x8C) > -" ".length()) continue;
            return;
        }
        if ((this.coKichHoat ? 1 : 0 != null)) {
            n3 = 0;
            while ((n3 < this.var_java_util_Vector_do.size())) {
                if (ce.boolean_for(ce.cfr_renamed_1(System.currentTimeMillis() / 100L - this.soXu, (long)((n3 + 1) * 5)))) {
                    y y2 = (y)this.var_java_util_Vector_do.elementAt(n3);
                    switch (y2.var_byte_do) {
                        case 1: {
                            aa_0.am_do(y2.var_short_do).cfr_renamed_0(graphics, y2.cfr_renamed_2, y2.soLuong, 3);
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, y2.chuoiGiaTri, y2.cfr_renamed_2 - 17, y2.soLuong - 7, 1);
                            if ("  ".length() >= 0) break;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, MenuChinhAvatar.da, y2.cfr_renamed_2, y2.soLuong - dF.cfr_renamed_6 / 2, 2);
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, String.valueOf(y2.cfr_renamed_0), y2.cfr_renamed_2 - 17, y2.soLuong - 8, 1);
                            if (((0x9B ^ 0xB2) & ~(0x57 ^ 0x7E)) == ((8 ^ 0x5D) & ~(0x16 ^ 0x43))) break;
                            return;
                        }
                        case 3: {
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, "xp", y2.cfr_renamed_2, y2.soLuong - dF.cfr_renamed_6 / 2, 2);
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, String.valueOf(y2.cfr_renamed_3), y2.cfr_renamed_2 - 17, y2.soLuong - 8, 1);
                            if (((0x67 ^ 0xE ^ (0xC4 ^ 0xBA)) & (18 + 60 - 0 + 68 ^ 93 + 99 - 122 + 63 ^ -" ".length())) < "   ".length()) break;
                            return;
                        }
                        case 4: {
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, MenuChinhAvatar.cq, y2.cfr_renamed_2, y2.soLuong - dF.cfr_renamed_6 / 2, 2);
                            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, String.valueOf(y2.cfr_renamed_4), y2.cfr_renamed_2 - 17, y2.soLuong - 8, 1);
                        }
                    }
                }
                ++n3;
                if (-" ".length() <= 0) continue;
                return;
            }
        }
        n6 = 0;
        n4 = 0;
        while ((n4 < this.soLuongKhoa)) {
            n3 = n5 + n4 * this.cfr_renamed_4;
            if ((n3 > 360)) {
                n3 -= 360;
            }
            if (ce.boolean_do(n3, 82) && ce.boolean_for(n3, 278)) {
                n2 = hg.int_for(n3);
                n = this.var_int_try * hg.int_int(n2) >> 10;
                n2 = -(this.var_int_try * hg.int_if(n2)) >> 10;
                long l = System.currentTimeMillis() / 100L - this.soXu;
                if ((this.coKichHoat ? 1 : 0 != null) && ce.boolean_do(n3, 150) && ce.boolean_for(n3, 210) && (!ce.cfr_renamed_1(ce.cfr_renamed_1(l, (long)((n6 + 1) * 5))) || ce.cfr_renamed_1(ce.cfr_renamed_1(l, (long)((n6 + 1) * 5 - 5))))) {
                    ++n6;
                    } else {
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_if, this.var_fs_do.soLuong + n, this.var_fs_do.var_int_if + n2, 3);
                }
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.var_fs_do.soLuong + n, this.var_fs_do.var_int_if + n2, 3);
            }
            ++n4;
            if (" ".length() > ((0x3B ^ 0x79) & ~(0xFC ^ 0xBE))) continue;
            return;
        }
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_for, 0, 0, 64, 62, 0, this.var_fs_do.soLuong, this.var_fs_do.var_int_if, 40);
        graphics.drawRegion(this.var_javax_microedition_lcdui_Image_for, 0, 0, 64, 62, 1, this.var_fs_do.soLuong, this.var_fs_do.var_int_if, 24);
        n3 = hg.int_for(this.soLuong);
        n2 = (this.var_int_try / 3 + 2) * hg.int_int(n3) >> 10;
        n = -((this.var_int_try / 3 + 2) * hg.int_if(n3)) >> 10;
        n5 = this.soLuong + 90;
        if ((n5 > 360)) {
            n5 -= 360;
        }
        n5 = hg.int_for(n5);
        n3 = 6 * hg.int_int(n5) >> 10;
        n5 = -(6 * hg.int_if(n5)) >> 10;
        int n7 = this.soLuong - 90;
        if (ce.boolean_int(n7)) {
            n7 += 360;
        }
        n7 = hg.int_for(n7);
        int n8 = 6 * hg.int_int(n7) >> 10;
        n7 = -(6 * hg.int_if(n7)) >> 10;
        graphics.setColor(14483456);
        graphics.fillTriangle(this.var_fs_do.soLuong + n2, this.var_fs_do.var_int_if + n, this.var_fs_do.soLuong + n3, this.var_fs_do.var_int_if + n5, this.var_fs_do.soLuong + n8, this.var_fs_do.var_int_if + n7);
        graphics.fillRoundRect(this.var_fs_do.soLuong - 6, this.var_fs_do.var_int_if - 6, 12, 12, 12, 12);
        if (!!(this.coKichHoat) || ce.boolean_for(this.var_int_byte)) {
            Graphics graphics2 = graphics;
            ce ce2 = this;
            n4 = 0;
            while ((n4 < ce2.var_java_util_Vector_if.size())) {
                gb_0 gb_02 = (gb_0)ce2.var_java_util_Vector_if.elementAt(n4);
                ce2.var_cu_0_do.cfr_renamed_1(gb_02.soLuong / 5, gb_02.cfr_renamed_2, gb_02.cfr_renamed_3, 0, 3, graphics2);
                ++n4;
                if (-" ".length() < 0) continue;
                return;
            }
        }
        super.cfr_renamed_1(graphics);
    }

        public final void cfr_renamed_7() {
        Object object;
        int n;
        int n2;
        this.var_en_do.cfr_renamed_7();
        if (ce.boolean_for(this.var_int_byte)) {
            this.var_int_int -= this.var_int_byte;
            if (ce.boolean_int(this.var_int_int)) {
                this.var_int_int += 7200;
            }
            if ((this.var_int_byte < 10)) {
                if ((this.var_int_int / 20 % 30 == 0)) {
                    this.var_int_byte = 0;
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                }
            } else {
                this.var_int_byte -= 1;
            }
            if ((GameCanvas.var_int_goto % 8 == 4)) {
                n2 = hg.int_new(this.soLuongKhoa);
                n = this.var_int_int / 20 + n2 * this.cfr_renamed_4;
                if ((n > 360)) {
                    n -= 360;
                }
                n = hg.int_for(n);
                n2 = this.var_int_try * hg.int_int(n) >> 10;
                n = -(this.var_int_try * hg.int_if(n)) >> 10;
                this.void_for(this.var_fs_do.soLuong + n2, this.var_fs_do.var_int_if + n);
                if (" ".length() == 0) {
                    return;
                }
            }
        } else if ((this.var_boolean_try ? 1 : 0 != null)) {
            this.var_boolean_try = 0;
            this.coKichHoat = 1;
            this.coTrangThai = 0;
            this.soXu = System.currentTimeMillis() / 100L;
            n = 0;
            while ((n < this.var_java_util_Vector_do.size())) {
                object = (y)this.var_java_util_Vector_do.elementAt(n);
                if ((n == 0)) {
                    n2 = 150;
                    if ((0xA3 ^ 0xA6) == 0) {
                        return;
                    }
                } else if ((n == 1)) {
                    n2 = 180;
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else {
                    n2 = 210;
                }
                n2 = hg.int_for(n2);
                int n3 = this.var_int_try * hg.int_int(n2) >> 10;
                n2 = -(this.var_int_try * hg.int_if(n2)) >> 10;
                ((y)object).cfr_renamed_2 = this.var_fs_do.soLuong + n3;
                ((y)object).soLuong = this.var_fs_do.var_int_if + n2;
                ++n;
                if ((0xE5 ^ 0xAF ^ (8 ^ 0x46)) >= 0) continue;
                return;
            }
        }
        if ((this.dangChayAuto ? 1 : 0 != null)) {
            this.dangChayAuto = 0;
            this.var_boolean_int = 1;
            int n4 = 0;
            while ((n4 < 3)) {
                this.var_boolean_arr_do[n4] = 0;
                ++n4;
                return;
            }
            if (!(this.var_java_util_Vector_if.isEmpty())) {
                this.var_java_util_Vector_if.removeAllElements();
            }
            (this.var_java_util_Vector_do, AngelChip.duLieuNguoiChoi, 0 == null);
            return;
        }
        if (ce.cfr_renamed_1(((en)this).cfr_renamed_3, this.var_fl_0_do)) {
            n2 = 0;
            n = 0;
            while ((n < this.var_boolean_arr_do.length)) {
                if ((this.var_boolean_arr_do[n] != null)) {
                    ++n2;
                }
                ++n;
                if (((0x81 ^ 0xAC) & ~(0xA ^ 0x27)) <= (0x3C ^ 0x38)) continue;
                return;
            }
            if ((n2 == 3)) {
                ((en)this).cfr_renamed_3 = this.var_fl_0_byte;
            }
        }
        n2 = 0;
        while ((n2 < this.var_java_util_Vector_if.size())) {
            object = (gb_0)this.var_java_util_Vector_if.elementAt(n2);
            ((gb_0)object).cfr_renamed_2 = (short)(((gb_0)object).cfr_renamed_2 + ((gb_0)object).cfr_renamed_13);
            if (!ce.boolean_for(((gb_0)object).cfr_renamed_13, 1) || ce.cfr_renamed_4(((gb_0)object).cfr_renamed_13, -1)) {
                ((gb_0)object).cfr_renamed_13 -= ((gb_0)object).cfr_renamed_13 / hg.int_do(((gb_0)object).cfr_renamed_13);
            }
            ((gb_0)object).cfr_renamed_3 = (short)(((gb_0)object).cfr_renamed_3 + ((gb_0)object).cfr_renamed_6);
            ((gb_0)object).cfr_renamed_6 += 1;
            ((gb_0)object).soLuong += 1;
            if (ce.cfr_renamed_5(((gb_0)object).soLuong, 20)) {
                this.var_java_util_Vector_if.removeElement(object);
                }
            ++n2;
            if ("  ".length() <= "   ".length()) continue;
            return;
        }
        if ((this.coKichHoat ? 1 : 0 != null)) {
            n2 = 0;
            while ((n2 < this.var_java_util_Vector_do.size())) {
                if ((this.var_boolean_arr_do[n2] == 0) && ce.boolean_for(ce.cfr_renamed_0(System.currentTimeMillis() / 100L - this.soXu, (long)((n2 + 1) * 5)))) {
                    this.var_boolean_arr_do[n2] = 1;
                    object = (y)this.var_java_util_Vector_do.elementAt(n2);
                    this.void_for(((y)object).cfr_renamed_2, ((y)object).soLuong);
                }
                ++n2;
                if ((0x49 ^ 0x4D) == (0x9B ^ 0x9F)) continue;
                return;
            }
        }
    }

            private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    public final void (en en2 == short s2) {
        this.var_en_do = en2;
        this.var_short_do = s2;
        GameCanvas.var_boolean_arr_if[5] = 0;
        this.coKichHoat = 0;
        this.var_boolean_try = 0;
        this.dangChayAuto = 0;
        this.var_boolean_int = 0;
        ((en)this).cfr_renamed_3 = this.var_fl_0_if;
        super.cfr_renamed_4();
    }

        private static void (Vector vector, DuLieuNguoiChoi ef2, int n == null) {
        int n2 = 0;
        while ((n2 < vector.size())) {
            Object object = (y)vector.elementAt(n2);
            String string = "";
            switch (((y)object).var_byte_do) {
                case 1: {
                    object = aa_0.am_do(((y)object).var_short_do);
                    object = aa_0.var_k_0_arr_do[((am)object).var_short_if];
                    GameCanvas.cfr_renamed_1(0, (int)ef2.var_short_for, ef2.var_boolean_int - 50, hg.cfr_renamed_1(((k_0)object).var_short_do * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_0 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_4 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_5 * dF.cfr_renamed_12, aa_0.hr_do((int)((k_0)object).cfr_renamed_3).var_javax_microedition_lcdui_Image_do), n);
                    if (-" ".length() < 0) break;
                    return;
                }
                case 2: {
                    string = "+" + ((y)object).cfr_renamed_0 + MenuChinhAvatar.da;
                    ef2.void_do(ef2.mangSoNguyen[0] + ((y)object).cfr_renamed_0);
                    n += 20;
                    if ("   ".length() >= " ".length()) break;
                    return;
                }
                case 3: {
                    string = "+" + ((y)object).cfr_renamed_3 + " xp";
                    ef2.void_for(ef2.var_int_break + ((y)object).cfr_renamed_3);
                    n += 20;
                    if (null == null) break;
                    return;
                }
                case 4: {
                    string = "+" + ((y)object).cfr_renamed_4 + MenuChinhAvatar.cq;
                    int n3 = 2;
                    ef2.mangSoNguyen[n3] = ef2.mangSoNguyen[n3] + ((y)object).cfr_renamed_4;
                    n += 20;
                }
            }
            if (!(string.equals(""))) {
                GameCanvas.cfr_renamed_1(string, (int)ef2.var_short_for, ef2.var_boolean_int - 50, 1, n);
            }
            ++n2;
            if ("   ".length() >= 0) continue;
            return;
        }
    }

    private void void_for(int n, int n2) {
        int n3 = 0;
        while ((n3 < 10)) {
            int n4 = 1;
            if ((n3 % 2 == 0)) {
                n4 = -1;
            }
            gb_0 gb_02 = new gb_0(n, n2);
            new gb_0(n, n2).soLuong = 0;
            gb_02.cfr_renamed_13 = n4 * (hg.int_new(80) / 10);
            gb_02.cfr_renamed_6 = -hg.int_new(70) / 10;
            this.var_java_util_Vector_if.addElement(gb_02);
            ++n3;
            if (" ".length() != 0) continue;
            return;
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_for(int n) {
        return n > 0;
    }

    private static boolean boolean_for(int n, int n2) {
        return n <= n2;
    }

        private static boolean boolean_int(int n) {
        return n < 0;
    }

        static {
        ce.cfr_renamed_3();
    }

    public final void (int n, int n2, Vector vector == null) {
        int n3;
        if (ce.boolean_if(n, AngelChip.duLieuNguoiChoi.var_short_goto)) {
            DuLieuNguoiChoi ef2 = fh.ef_do(n);
            if ((ef2 != null)) {
                (vector, ef2, n2 + 100 + 20 == null);
            }
            return;
        }
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.nhiemVuHienTai instanceof dm_0 != null)) {
            n3 = 1;
            if ("   ".length() == 0) {
                return;
            }
        } else {
            n3 = 0;
        }
        if ((n3 != null)) {
            ((en)this).cfr_renamed_3 = this.var_fl_0_for;
            this.dangChayAuto = 1;
            this.var_int_byte = 145;
            if ("   ".length() > "   ".length()) {
                return;
            }
        } else {
            ((en)this).cfr_renamed_3 = this.var_fl_0_do;
            this.dangChayAuto = 0;
            this.var_int_byte = 100 + (this.var_int_if - 90);
        }
        this.var_java_util_Vector_do = vector;
        this.var_boolean_try = 1;
        GameCanvas.cfr_renamed_7();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[36];
        5 = 0x33 ^ 0x36;
        0 = (0x39 ^ 0x6A ^ (0xD9 ^ 0xBB)) & (0x30 ^ 0x17 ^ (0x48 ^ 0x5E) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        11 = 0xB8 ^ 0xB3 ^ " ".length() & ~" ".length();
        200 = 62 + 92 - 12 + 58;
        80 = 0x12 ^ 0x42;
        90 = 72 + 92 - 149 + 112 ^ (0x24 ^ 1);
        30 = 0x9E ^ 0x80;
        360 = 0xFFFFD5FE & 0x2B69;
        2 = "  ".length();
        50 = 0x82 ^ 0xB0;
        7200 = -(0x66 ^ 0x22) & (0xFFFFDCFF & 0x3F63);
        10 = 0x4E ^ 0x7F ^ (0xB6 ^ 0x8D);
        20 = 0x25 ^ 1 ^ (0x78 ^ 0x48);
        8 = 0xB1 ^ 0xB9;
        4 = 109 + 32 - 86 + 98 ^ 102 + 20 - -2 + 33;
        150 = 45 + 112 - 50 + 43;
        180 = (0x75 ^ 0x2E) + (0xD8 ^ 0xA3) - (0x41 ^ 0xB) + (0xBD ^ 0x95);
        210 = (0xB0 ^ 0x93) + (0x78 ^ 0x12) - (0xEA ^ 0x96) + (94 + 21 - -48 + 30);
        -1 = -" ".length();
        70 = 0xCC ^ 0x8A;
        270 = 0xFFFF979E & 0x696F;
        100 = 0xCC ^ 0xA8;
        145 = 88 + 104 - 112 + 65;
        82 = 0x62 ^ 0x5E ^ (0x3D ^ 0x53);
        278 = -(0xFFFFDDEA & 0x3677) & (0xFFFFB577 & 0x5FFF);
        17 = 98 + 124 - 99 + 19 ^ 6 + 0 - -94 + 59;
        7 = 0xDE ^ 0x8E ^ (0xCA ^ 0x9D);
        64 = 0x82 ^ 0xC2;
        62 = 0x96 ^ 0xA8;
        40 = 0x4D ^ 0x61 ^ (0x96 ^ 0x92);
        24 = 1 ^ 0x19;
        6 = 0x6B ^ 0x35 ^ (0x18 ^ 0x40);
        14483456 = 0xFFFFED71 & 0xDD128E;
        12 = 0x82 ^ 0x8E;
    }

    public final void cfr_renamed_2() {
        if (!(this.var_boolean_try)) {
            ((en)this).cfr_renamed_3 = this.var_fl_0_byte;
            if ((0x6F ^ 0x6A) == 0) {
                return;
            }
        } else {
            ((en)this).cfr_renamed_3 = this.var_fl_0_do;
        }
        this.soLuong = 90;
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void cfr_renamed_6() {
        int n;
        int n2;
        if ((AutoController.nhiemVuHienTai != null) && (AutoController.nhiemVuHienTai instanceof dm_0 != null)) {
            n2 = 1;
            if (-(0xAD ^ 0x83 ^ (0x27 ^ 0xD)) > 0) {
                return;
            }
        } else {
            n2 = n = 0;
        }
        if (!(this.coKichHoat) && (n == 0)) {
            if ((GameCanvas.var_fa_0_do.int_do() == 1)) {
                if ((GameCanvas.var_boolean_case ? 1 : 0 != null)) {
                    GameCanvas.var_boolean_arr_if[5] = 1;
                }
                if ((GameCanvas.var_boolean_new ? 1 : 0 != null)) {
                    GameCanvas.var_boolean_arr_for[5] = 1;
                }
            }
            if ((GameCanvas.var_boolean_arr_if[5] != null) && !(this.var_boolean_try) && (this.coTrangThai ? 1 : 0 != null)) {
                if ((this.soLuong < 270)) {
                    this.soLuong += 3;
                    if ((0x36 ^ 0x32) <= " ".length()) {
                        return;
                    }
                }
            } else if ((this.soLuong > 90)) {
                this.soLuong -= 3;
            }
            if ((GameCanvas.var_boolean_arr_for[5] != null)) {
                if ((this.soLuong > 90) && !(this.var_boolean_try) && (this.coTrangThai ? 1 : 0 != null)) {
                    this.var_int_if = this.soLuong;
                    ft_0.ft_0_do().cfr_renamed_1(this.var_short_do, this.var_int_if - 90);
                    GameCanvas.cfr_renamed_8();
                }
                GameCanvas.var_boolean_arr_for[5] = 0;
            }
        }
        super.cfr_renamed_6();
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.coTrangThai = 1;
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                this.var_en_do.cfr_renamed_4();
                this.coKichHoat = 0;
                this.var_boolean_try = 0;
                this.dangChayAuto = 0;
                ((en)this).cfr_renamed_3 = this.var_fl_0_if;
                n = 0;
                while ((n < 3)) {
                    this.var_boolean_arr_do[n] = 0;
                    ++n;
                    if (" ".length() < "  ".length()) continue;
                    return;
                }
                this.var_java_util_Vector_if.removeAllElements();
                if (!(this.var_boolean_int)) {
                    (this.var_java_util_Vector_do, AngelChip.duLieuNguoiChoi, 0 == null);
                    return;
                }
                this.var_boolean_int = 0;
                return;
            }
            case 3: {
                AutoController.tatAuto();
                this.cfr_renamed_2();
                GameCanvas.hienThongBaoPopup("Đã tắt Auto!\n" + dm_0.var_dm_0_do.cfr_renamed_0());
            }
        }
    }

            private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

