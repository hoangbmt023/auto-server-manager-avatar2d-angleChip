/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from gV
 */
public final class gv_0
extends en {
    private static int var_int_if;
    private static int soLuongKhoa;
    private static int cfr_renamed_3;
    private static int cfr_renamed_4;
    private long soXu;
    private static int cfr_renamed_5;
    private static int cfr_renamed_6;
    private Image var_javax_microedition_lcdui_Image_do;
    private static final int[] mangSoNguyen;
    private boolean dangChayAuto;
    private int cfr_renamed_7;
    private long var_long_if;
    private static int cfr_renamed_8;
    private static int cfr_renamed_13;
    private int cfr_renamed_9;
    public static gv_0 var_gv_0_do;
    private boolean coTrangThai = 0;
    private int cfr_renamed_14;
    private long var_long_for;
    public int soLuong;

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private void void_do(int n) {
        this.soLuong = n;
        if (gv_0.boolean_if(this.soLuong, AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length)) {
            this.soLuong = 0;
        }
        if (gv_0.boolean_int(this.soLuong)) {
            this.soLuong = AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length - 1;
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

        public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (gv_0.boolean_for(this.coTrangThai ? 1 : 0) && gv_0.boolean_do(this.cfr_renamed_18)) {
                    GameCanvas.cfr_renamed_4(MenuChinhAvatar.aT);
                    ThongTinNhanVat.cfr_renamed_1();
                    System.currentTimeMillis();
                    ThongTinNhanVat.cfr_renamed_1().cfr_renamed_8();
                    return;
                }
                if ((this.coTrangThai ? 1 : 0 == null)) {
                    this.coTrangThai = 1;
                    this.cfr_renamed_2();
                    this.cfr_renamed_18 = 1 + hg.int_new(AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length - 1);
                    this.cfr_renamed_5();
                    return;
                }
                this.coTrangThai = 0;
                return;
            }
            case 1: {
                GameCanvas.cfr_renamed_8();
                gv_0.cfr_renamed_3();
                return;
            }
            case 2: {
                this.coTrangThai = 0;
                this.soLuong = 0;
                this.cfr_renamed_18 = 0;
                ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
            }
        }
    }

        public static gv_0 gv_0_do() {
        if ((var_gv_0_do == null)) {
            var_gv_0_do = new gv_0();
            return var_gv_0_do;
        }
        return var_gv_0_do;
    }

    public final void cfr_renamed_2() {
        int n;
        if (gv_0.boolean_do(GameCanvas.cfr_renamed_12)) {
            ((en)this).cfr_renamed_4 = (Image)1;
        }
        int n2 = 176;
        if ((176 > GameCanvas.soLuongKhoa)) {
            n2 = GameCanvas.soLuongKhoa;
        }
        v_0.v_0_do().cfr_renamed_1(MenuChinhAvatar.cF, n2 * dF.cfr_renamed_12, en.cfr_renamed_21 * 6, 1);
        cfr_renamed_8 = v_0.v_0_do().cfr_renamed_5 + 4;
        var_int_if = v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15;
        cfr_renamed_4 = v_0.v_0_do().var_int_if - (v_0.var_byte_do + (dF.cfr_renamed_15 << 1));
        int n3 = AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length * en.cfr_renamed_21;
        if (gv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
            n = AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length * en.cfr_renamed_21;
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            n = 0;
        }
        cfr_renamed_6 = n3 + n - cfr_renamed_4;
        soLuongKhoa = 0;
        cfr_renamed_3 = 0;
        if (gv_0.boolean_int(cfr_renamed_6)) {
            cfr_renamed_6 = 0;
        }
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_fh_do.cfr_renamed_2(graphics);
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        v_0.v_0_do().cfr_renamed_1(graphics);
        if ((AngelChip.duLieuNguoiChoi != null) && (AngelChip.duLieuNguoiChoi.soLuong.equals("") ? 1 : 0 == null)) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics, MenuChinhAvatar.bH + ", " + (String)AngelChip.duLieuNguoiChoi.soLuong, v_0.v_0_do().cfr_renamed_5 + v_0.v_0_do().soLuongKhoa / 2, v_0.v_0_do().cfr_renamed_6 - dF.cfr_renamed_6, 2);
        }
        graphics.translate(cfr_renamed_8, var_int_if);
        graphics.setClip(0, 0, v_0.v_0_do().soLuongKhoa - 9, v_0.v_0_do().var_int_if - (v_0.var_byte_do + (dF.cfr_renamed_15 << 1)));
        graphics.translate(0, -cfr_renamed_3);
        if (gv_0.cfr_renamed_0((int)((en)this).cfr_renamed_4)) {
            int n;
            int n2 = 2 * dF.cfr_renamed_12;
            if (gv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
                n = this.cfr_renamed_18 * en.cfr_renamed_21;
                if (" ".length() == -" ".length()) {
                    return;
                }
            } else {
                n = 0;
            }
            GameCanvas.var_fa_0_do.cfr_renamed_3(graphics, n2, this.soLuong * en.cfr_renamed_21 + n, v_0.v_0_do().soLuongKhoa - 8 - 4 * dF.cfr_renamed_12, en.cfr_renamed_21);
        }
        int n = (en.cfr_renamed_21 - dF.var_byte_try) / 2;
        int n3 = 0;
        while ((n3 < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length)) {
            GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n3][0], 24 * dF.cfr_renamed_12, n, 0);
            v_0.var_cu_0_do.cfr_renamed_1(0, 14 * dF.cfr_renamed_12, n + dF.var_byte_try / 2, 5, 3, graphics);
            n += en.cfr_renamed_21;
            if (gv_0.boolean_for(this.coTrangThai ? 1 : 0) && gv_0.boolean_do(this.soLuong, n3)) {
                int n4 = 1;
                while ((n4 < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n3].length)) {
                    GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][n3][n4], 36 * dF.cfr_renamed_12, n, 0);
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, 24 * dF.cfr_renamed_12, n + dF.var_byte_try / 2, 3);
                    n += en.cfr_renamed_21;
                    ++n4;
                    if ((0x12 ^ 0x5D ^ (0xD0 ^ 0x9B)) >= 0) continue;
                    return;
                }
            }
            ++n3;
            if (((0xD9 ^ 0x9B) & ~(0xEE ^ 0xAC)) >= 0) continue;
            return;
        }
        super.cfr_renamed_1(graphics);
    }

    public final void (int n, boolean bl != null) {
        this.cfr_renamed_18 = n;
        if (!(this.cfr_renamed_18 < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length) || (this.cfr_renamed_18 <= 0)) {
            this.cfr_renamed_18 = 0;
            if (gv_0.boolean_for(bl ? 1 : 0)) {
                this.coTrangThai = 0;
                this.cfr_renamed_2();
            }
        }
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void cfr_renamed_4() {
        if (gv_0.boolean_for(gv_0.boolean_do() ? 1 : 0)) {
            gv_0.cfr_renamed_3();
            ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
            return;
        }
        super.cfr_renamed_4();
        this.cfr_renamed_2();
        if (gv_0.cfr_renamed_0(((en)this).cfr_renamed_3)) {
            this.b_();
        }
        this.cfr_renamed_5();
    }

    private static void cfr_renamed_3() {
        cR.soXu = 0L;
        new cR(20L, 0).void_do();
    }

    private void cfr_renamed_5() {
        int n;
        if (gv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
            n = this.cfr_renamed_18;
            if (((65 + 106 - 126 + 82 ^ (0x5A ^ 0x34)) & (36 + 74 - 40 + 63 ^ 63 + 79 - 85 + 91 ^ -" ".length())) > 0) {
                return;
            }
        } else {
            n = 0;
        }
        if (gv_0.boolean_int(soLuongKhoa = (this.soLuong + n) * en.cfr_renamed_21 - cfr_renamed_4 / 2 + en.cfr_renamed_21 / 2)) {
            soLuongKhoa = 0;
        }
        if ((soLuongKhoa > cfr_renamed_6)) {
            soLuongKhoa = cfr_renamed_6;
        }
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[18];
        0 = (0xF2 ^ 0xB4) & ~(0x6B ^ 0x2D);
        1 = " ".length();
        4 = 0xEF ^ 0xA3 ^ (0x1D ^ 0x55);
        2 = "  ".length();
        176 = (0x7B ^ 0x38) + "   ".length() - (0x9C ^ 0xB2) + (82 + 129 - 178 + 119);
        6 = 0x3D ^ 0x66 ^ (0xEC ^ 0xB1);
        20 = 0x5A ^ 0x78 ^ (0x3B ^ 0xD);
        10 = 111 + 128 - 122 + 25 ^ 60 + 24 - 7 + 55;
        15 = 0x49 ^ 0x46;
        8 = 0x12 ^ 0x1A;
        3 = "   ".length();
        40 = 0x24 ^ 0xC;
        -1 = -" ".length();
        9 = 0x23 ^ 0x2A;
        24 = 0x80 ^ 0x98;
        14 = 0x66 ^ 0x68;
        5 = 0x91 ^ 0x94;
        36 = 0x3D ^ 5 ^ (0x60 ^ 0x7C);
    }

    private static boolean boolean_do() {
        if (!(AngelChip.var_java_lang_String_arr_arr_arr_do != null) || !(AngelChip.var_java_lang_String_arr_arr_arr_if != null) || !(AngelChip.var_int_arr_arr_arr_do != null) || (TienIchGame.chuoiGiaTri == null)) {
            return 1;
        }
        return 0;
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void b_() {
        if ((MenuChinhAvatar.cT != null)) {
            if ((GameCanvas.cfr_renamed_12 == null)) {
                ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 0);
            }
            if ((AngelChip.var_byte_do == null)) {
                ((en)this).cfr_renamed_5 = new fl_0(MenuChinhAvatar.aa, 1);
            }
            ((en)this).cfr_renamed_4 = new fl_0(MenuChinhAvatar.aO, 2);
        }
    }

        static {
        gv_0.cfr_renamed_8();
    }

    public final void cfr_renamed_7() {
        if (gv_0.boolean_for(gv_0.boolean_do() ? 1 : 0)) {
            this.coTrangThai = 0;
            this.soLuong = 0;
            this.cfr_renamed_18 = 0;
            gv_0.cfr_renamed_3();
            ThongTinNhanVat.cfr_renamed_1().cfr_renamed_4();
            return;
        }
        if (gv_0.boolean_for(this.cfr_renamed_7)) {
            if (!(cfr_renamed_3 >= 0) || (cfr_renamed_3 > cfr_renamed_6)) {
                this.cfr_renamed_7 -= this.cfr_renamed_7 / 4;
                cfr_renamed_3 += this.cfr_renamed_7 / 20;
                if ((this.cfr_renamed_7 / 10 <= 1)) {
                    this.cfr_renamed_7 = 0;
                }
            }
            if (gv_0.boolean_int(cfr_renamed_3)) {
                if ((cfr_renamed_3 < -cfr_renamed_4 / 2)) {
                    cfr_renamed_3 = -cfr_renamed_4 / 2;
                    soLuongKhoa = 0;
                    this.cfr_renamed_7 = 0;
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
            } else if ((cfr_renamed_3 > cfr_renamed_6)) {
                if ((cfr_renamed_3 < cfr_renamed_6 + cfr_renamed_4 / 2)) {
                    cfr_renamed_3 = cfr_renamed_6 + cfr_renamed_4 / 2;
                    soLuongKhoa = cfr_renamed_6;
                    this.cfr_renamed_7 = 0;
                    if ((0x1E ^ 0x1A) == 0) {
                        return;
                    }
                }
            } else {
                cfr_renamed_3 += this.cfr_renamed_7 / 10;
            }
            soLuongKhoa = cfr_renamed_3;
            this.cfr_renamed_7 -= this.cfr_renamed_7 / 10;
            if ((this.cfr_renamed_7 / 10 == null)) {
                this.cfr_renamed_7 = 0;
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
        } else if (gv_0.boolean_int(cfr_renamed_3)) {
            soLuongKhoa = 0;
            if (-" ".length() >= 0) {
                return;
            }
        } else if ((cfr_renamed_3 > cfr_renamed_6)) {
            soLuongKhoa = cfr_renamed_6;
        }
        if ((cfr_renamed_3 != soLuongKhoa)) {
            cfr_renamed_13 = soLuongKhoa - cfr_renamed_3 << 2;
            cfr_renamed_3 += (cfr_renamed_5 += cfr_renamed_13) >> 4;
            cfr_renamed_5 &= 15;
        }
        GameCanvas.var_fh_do.cfr_renamed_2();
    }

        private static boolean boolean_int(int n) {
        return n < 0;
    }

        public gv_0() {
        e.void_do(MenuChinhAvatar.bE);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("tp");
        e.cfr_renamed_1();
        this.b_();
        hg.cfr_renamed_2();
    }

    public final void cfr_renamed_6() {
        ++this.soXu;
        int n = 0;
        if (gv_0.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0)) {
            n = 1;
            if ((this.coTrangThai ? 1 : 0 == null)) {
                this.void_do(this.soLuong + 1);
                if (-" ".length() >= 0) {
                    return;
                }
            } else {
                this.cfr_renamed_1(this.cfr_renamed_18 + 1, 1);
                }
        } else if (gv_0.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0)) {
            n = 1;
            if ((this.coTrangThai ? 1 : 0 == null)) {
                this.void_do(this.soLuong - 1);
                if (((0x6D ^ 0x31) & ~(0x5F ^ 3)) > 0) {
                    return;
                }
            } else {
                this.cfr_renamed_1(this.cfr_renamed_18 - 1, 1);
            }
        }
        if (gv_0.boolean_for(GameCanvas.coTrangThai ? 1 : 0) && gv_0.boolean_for(GameCanvas.boolean_if(cfr_renamed_8, var_int_if, v_0.v_0_do().soLuongKhoa, cfr_renamed_4) ? 1 : 0)) {
            GameCanvas.coTrangThai = 0;
            this.cfr_renamed_9 = cfr_renamed_3;
            this.dangChayAuto = 1;
            this.var_long_if = System.currentTimeMillis() / 10L;
        }
        if (gv_0.boolean_for(this.dangChayAuto ? 1 : 0)) {
            int n2;
            long l = System.currentTimeMillis() / 10L - this.var_long_if;
            int n3 = GameCanvas.int_for();
            if (gv_0.boolean_for(GameCanvas.var_boolean_case ? 1 : 0)) {
                if ((GameCanvas.var_int_goto % 3 == null)) {
                    this.cfr_renamed_14 = GameCanvas.soLuong;
                    this.var_long_for = this.soXu;
                }
                this.cfr_renamed_7 = 0;
                n2 = (soLuongKhoa + GameCanvas.soLuong - var_int_if) / en.cfr_renamed_21;
                if (gv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
                    this.cfr_renamed_18 = n2 - this.soLuong;
                    if ("   ".length() < ((0x49 ^ 0x6E) & ~(0x23 ^ 4))) {
                        return;
                    }
                } else if ((n2 >= 0) && (n2 < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length)) {
                    this.soLuong = n2;
                }
                if (gv_0.boolean_if(hg.int_do(n3), 20 * dF.cfr_renamed_12)) {
                    ((en)this).cfr_renamed_4 = (Image)1;
                    if ((3 ^ 7) < (0x6B ^ 0x6F)) {
                        return;
                    }
                } else if (gv_0.boolean_do((l, 10L != null)) && gv_0.boolean_int((l, 20L != null))) {
                    ((en)this).cfr_renamed_4 = (Image)0;
                }
                if (!(soLuongKhoa = this.cfr_renamed_9 + n3 >= 0) || (soLuongKhoa > cfr_renamed_6)) {
                    soLuongKhoa = this.cfr_renamed_9 + n3 / 2;
                }
                cfr_renamed_3 = soLuongKhoa;
            }
            if (gv_0.boolean_for(GameCanvas.var_boolean_new ? 1 : 0) && gv_0.boolean_for(GameCanvas.boolean_if(cfr_renamed_8, var_int_if, v_0.v_0_do().soLuongKhoa, cfr_renamed_4) ? 1 : 0)) {
                n2 = (int)(this.soXu - this.var_long_for);
                int n4 = this.cfr_renamed_14 - GameCanvas.soLuong;
                if ((hg.int_do(n4) > 40) && (n2 < 10) && gv_0.boolean_do(soLuongKhoa) && (soLuongKhoa < cfr_renamed_6)) {
                    this.cfr_renamed_7 = n4 / n2 * 10;
                }
                this.var_long_for = -1L;
                if ((Math.abs(n3) < 20 * dF.cfr_renamed_12)) {
                    if (gv_0.cfr_renamed_5((l, 10L != null))) {
                        ((en)this).cfr_renamed_4 = (Image)0;
                    }
                    if (gv_0.cfr_renamed_0((int)((en)this).cfr_renamed_4)) {
                        int n5 = (soLuongKhoa + GameCanvas.soLuong - var_int_if) / en.cfr_renamed_21;
                        if (gv_0.boolean_for(this.coTrangThai ? 1 : 0)) {
                            if (gv_0.boolean_do(n5 - this.soLuong) && (n5 - this.soLuong < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length)) {
                                this.cfr_renamed_18 = n5 - this.soLuong;
                                this.void_do(0, -1);
                                if (((0x33 ^ 0x51) & ~(0x41 ^ 0x23)) <= -" ".length()) {
                                    return;
                                }
                            } else {
                                if ((n5 - this.soLuong <= 0)) {
                                    this.coTrangThai = 0;
                                    this.cfr_renamed_18 = 0;
                                    this.soLuong = n5;
                                    n = 1;
                                }
                                if (gv_0.boolean_if(n5, AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length - this.soLuong) && gv_0.cfr_renamed_4(n5, AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length - 1 + AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length)) {
                                    this.coTrangThai = 0;
                                    this.cfr_renamed_18 = 0;
                                    this.soLuong = n5 - AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][this.soLuong].length + 1;
                                    n = 1;
                                    if ("  ".length() > "  ".length()) {
                                        return;
                                    }
                                }
                            }
                        } else if ((n5 >= 0) && (n5 < AngelChip.var_java_lang_String_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]].length)) {
                            this.soLuong = n5;
                            this.void_do(0, -1);
                        }
                    }
                }
            }
        }
        if (gv_0.boolean_for(GameCanvas.var_boolean_new ? 1 : 0)) {
            this.dangChayAuto = 0;
        }
        if (gv_0.boolean_for(n)) {
            this.cfr_renamed_5();
        }
        super.cfr_renamed_6();
    }

        }

