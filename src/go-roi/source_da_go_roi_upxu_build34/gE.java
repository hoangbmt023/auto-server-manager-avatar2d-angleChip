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

public final class gE
extends dL {
    private int var_int_if;
    private static int soLuongKhoa;
    private static int cfr_renamed_4;
    public static gE var_gE_do;
    private static int cfr_renamed_5;
    public int soLuong;
    private long soXu;
    private Image var_javax_microedition_lcdui_Image_do;
    private long var_long_if;
    private static int cfr_renamed_2;
    private int cfr_renamed_15;
    private static int cfr_renamed_8;
    private static int cfr_renamed_12;
    private int cfr_renamed_11;
    private long var_long_for;
    private static int cfr_renamed_18;
    private boolean dangChayAuto;
    private static final int[] mangSoNguyen;
    private static int cfr_renamed_10;
    private boolean coTrangThai = 0;

    private static boolean boolean_do() {
        if (!(AngelChip.var_java_lang_String_arr_arr_arr_if != null) || !(AngelChip.var_java_lang_String_arr_arr_arr_do != null) || !(AngelChip.var_int_arr_arr_arr_do != null) || (TienIchGame.tenNhanVat == null)) {
            return 1;
        }
        return 0;
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[18];
        0 = (0x31 ^ 0x26) & ~(0x73 ^ 0x64);
        1 = " ".length();
        4 = 0x91 ^ 0x95;
        2 = "  ".length();
        176 = 8 + 54 - 6 + 90 + (0x1C ^ 1) - (148 + 84 - 141 + 63) + (55 + 136 - 102 + 66);
        6 = 40 + 85 - 38 + 44 ^ 12 + 84 - 14 + 51;
        20 = 0x42 ^ 0x1C ^ (0x70 ^ 0x3A);
        10 = 0x3D ^ 0x37;
        15 = 0x53 ^ 0x5C;
        8 = 0x1B ^ 0x4D ^ (0xCD ^ 0x93);
        3 = "   ".length();
        40 = 0x4B ^ 0x63;
        -1 = -" ".length();
        9 = 0x64 ^ 0x40 ^ (0xB6 ^ 0x9B);
        24 = 0x42 ^ 0x5A;
        14 = 0x11 ^ 0x1F;
        5 = 0x42 ^ 0x47;
        36 = 0xBE ^ 0x9A;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    private static boolean boolean_for(int n) {
        return n <= 0;
    }

    public static gE gE_do() {
        if ((var_gE_do == null)) {
            var_gE_do = new gE();
            return var_gE_do;
        }
        return var_gE_do;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if ((this.coTrangThai) && gE.boolean_if(this.cfr_renamed_17)) {
                    GameCanvas.cfr_renamed_5(MenuChinhAvatar.di);
                    ThongTinNhanVat.cfr_renamed_0();
                    System.currentTimeMillis();
                    ThongTinNhanVat.cfr_renamed_0().cfr_renamed_5();
                    return;
                }
                if (!(this.coTrangThai)) {
                    this.coTrangThai = 1;
                    this.cfr_renamed_1();
                    this.cfr_renamed_17 = 1 + gc_0.int_do(AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length - 1);
                    this.cfr_renamed_12();
                    return;
                }
                this.coTrangThai = 0;
                return;
            }
            case 1: {
                GameCanvas.cfr_renamed_5();
                gE.cfr_renamed_5();
                return;
            }
            case 2: {
                this.coTrangThai = 0;
                this.soLuong = 0;
                this.cfr_renamed_17 = 0;
                ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
            }
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    private void void_for(int n) {
        this.soLuong = n;
        if ((this.soLuong >= AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length)) {
            this.soLuong = 0;
        }
        if (gE.boolean_do(this.soLuong)) {
            this.soLuong = AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length - 1;
        }
    }

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void cfr_renamed_8() {
        if ((gE.boolean_do())) {
            gE.cfr_renamed_5();
            ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
            return;
        }
        super.cfr_renamed_8();
        this.cfr_renamed_1();
        if (gE.cfr_renamed_1(((dL)this).cfr_renamed_5)) {
            this.a_();
        }
        this.cfr_renamed_12();
    }

    static {
        gE.cfr_renamed_4();
    }

    public final void cfr_renamed_1() {
        int n;
        if (gE.boolean_if(GameCanvas.cfr_renamed_16)) {
            ((dL)this).cfr_renamed_5 = (Image)1;
        }
        int n2 = 176;
        if (gE.boolean_if(176, GameCanvas.var_int_byte)) {
            n2 = GameCanvas.var_int_byte;
        }
        k.k_do().cfr_renamed_0(MenuChinhAvatar.ao, n2 * bn_0.cfr_renamed_6, dL.cfr_renamed_20 * 6, 1);
        cfr_renamed_2 = k.k_do().cfr_renamed_2 + 4;
        cfr_renamed_18 = k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16;
        soLuongKhoa = k.k_do().var_int_int - (k.var_byte_do + (bn_0.cfr_renamed_16 << 1));
        int n3 = AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length * dL.cfr_renamed_20;
        if ((this.coTrangThai)) {
            n = AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length * dL.cfr_renamed_20;
            if ((0x1F ^ 0x56 ^ (0xD8 ^ 0x95)) < "   ".length()) {
                return;
            }
        } else {
            n = 0;
        }
        cfr_renamed_8 = n3 + n - soLuongKhoa;
        cfr_renamed_12 = 0;
        cfr_renamed_4 = 0;
        if (gE.boolean_do(cfr_renamed_8)) {
            cfr_renamed_8 = 0;
        }
    }

    private static void cfr_renamed_5() {
        cd.soXu = 0L;
        new cd(20L, 0).cfr_renamed_4();
    }

    private void cfr_renamed_12() {
        int n;
        if ((this.coTrangThai)) {
            n = this.cfr_renamed_17;
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            n = 0;
        }
        if (gE.boolean_do(cfr_renamed_12 = (this.soLuong + n) * dL.cfr_renamed_20 - soLuongKhoa / 2 + dL.cfr_renamed_20 / 2)) {
            cfr_renamed_12 = 0;
        }
        if (gE.boolean_if(cfr_renamed_12, cfr_renamed_8)) {
            cfr_renamed_12 = cfr_renamed_8;
        }
    }

        public final void cfr_renamed_15() {
        ++this.soXu;
        int n = 0;
        if ((GameCanvas.boolean_do(8))) {
            n = 1;
            if (!(this.coTrangThai)) {
                this.void_for(this.soLuong + 1);
                if ((0x3D ^ 0x38) <= 0) {
                    return;
                }
            } else {
                this.cfr_renamed_0(this.cfr_renamed_17 + 1, 1);
                }
        } else if ((GameCanvas.boolean_do(2))) {
            n = 1;
            if (!(this.coTrangThai)) {
                this.void_for(this.soLuong - 1);
                if ((11 + 6 - 14 + 146 ^ 46 + 34 - -22 + 43) <= 0) {
                    return;
                }
            } else {
                this.cfr_renamed_0(this.cfr_renamed_17 - 1, 1);
            }
        }
        if ((GameCanvas.coKichHoat) && gE.cfr_renamed_4(GameCanvas.boolean_do(cfr_renamed_2, cfr_renamed_18, k.k_do().cfr_renamed_5, soLuongKhoa) ? 1 : 0)) {
            GameCanvas.coKichHoat = 0;
            this.var_int_if = cfr_renamed_4;
            this.dangChayAuto = 1;
            this.var_long_for = System.currentTimeMillis() / 10L;
        }
        if ((this.dangChayAuto)) {
            int n2;
            long l = System.currentTimeMillis() / 10L - this.var_long_for;
            int n3 = GameCanvas.int_for();
            if ((GameCanvas.var_boolean_try)) {
                if ((GameCanvas.var_int_try % 3 == 0)) {
                    this.cfr_renamed_15 = GameCanvas.var_int_if;
                    this.var_long_if = this.soXu;
                }
                this.cfr_renamed_11 = 0;
                n2 = (cfr_renamed_12 + GameCanvas.var_int_if - cfr_renamed_18) / dL.cfr_renamed_20;
                if ((this.coTrangThai)) {
                    this.cfr_renamed_17 = n2 - this.soLuong;
                    if ("  ".length() < ((222 + 211 - 410 + 204 ^ 68 + 15 - -35 + 52) & (0x36 ^ 0x52 ^ (0x80 ^ 0xAD) ^ -" ".length()))) {
                        return;
                    }
                } else if ((n2 >= 0) && gE.boolean_do(n2, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length)) {
                    this.soLuong = n2;
                }
                if ((gc_0.int_if(n3) >= 20 * bn_0.cfr_renamed_6)) {
                    ((dL)this).cfr_renamed_5 = (Image)1;
                    if (((3 ^ 0x4E) & ~(0x25 ^ 0x68)) != 0) {
                        return;
                    }
                } else if (gE.boolean_if((l, 10L != null)) && gE.boolean_do((l, 20L != null))) {
                    ((dL)this).cfr_renamed_5 = (Image)0;
                }
                if (!(cfr_renamed_12 = this.var_int_if + n3 >= 0) || gE.boolean_if(cfr_renamed_12, cfr_renamed_8)) {
                    cfr_renamed_12 = this.var_int_if + n3 / 2;
                }
                cfr_renamed_4 = cfr_renamed_12;
            }
            if ((GameCanvas.var_boolean_new) && gE.cfr_renamed_4(GameCanvas.boolean_do(cfr_renamed_2, cfr_renamed_18, k.k_do().cfr_renamed_5, soLuongKhoa) ? 1 : 0)) {
                n2 = (int)(this.soXu - this.var_long_if);
                int n4 = this.cfr_renamed_15 - GameCanvas.var_int_if;
                if (gE.boolean_if(gc_0.int_if(n4), 40) && gE.boolean_do(n2, 10) && gE.boolean_if(cfr_renamed_12) && gE.boolean_do(cfr_renamed_12, cfr_renamed_8)) {
                    this.cfr_renamed_11 = n4 / n2 * 10;
                }
                this.var_long_if = -1L;
                if (gE.boolean_do(Math.abs(n3), 20 * bn_0.cfr_renamed_6)) {
                    if (gE.boolean_for((l, 10L != null))) {
                        ((dL)this).cfr_renamed_5 = (Image)0;
                    }
                    if (gE.cfr_renamed_2((int)((dL)this).cfr_renamed_5)) {
                        int n5 = (cfr_renamed_12 + GameCanvas.var_int_if - cfr_renamed_18) / dL.cfr_renamed_20;
                        if ((this.coTrangThai)) {
                            if (gE.boolean_if(n5 - this.soLuong) && gE.boolean_do(n5 - this.soLuong, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length)) {
                                this.cfr_renamed_17 = n5 - this.soLuong;
                                this.void_do(0, -1);
                                } else {
                                if (gE.boolean_for(n5 - this.soLuong)) {
                                    this.coTrangThai = 0;
                                    this.cfr_renamed_17 = 0;
                                    this.soLuong = n5;
                                    n = 1;
                                }
                                if ((n5 >= AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length - this.soLuong) && gE.boolean_do(n5, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length - 1 + AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length)) {
                                    this.coTrangThai = 0;
                                    this.cfr_renamed_17 = 0;
                                    this.soLuong = n5 - AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length + 1;
                                    n = 1;
                                    if (" ".length() > (0x6C ^ 0x68)) {
                                        return;
                                    }
                                }
                            }
                        } else if ((n5 >= 0) && gE.boolean_do(n5, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length)) {
                            this.soLuong = n5;
                            this.void_do(0, -1);
                        }
                    }
                }
            }
        }
        if ((GameCanvas.var_boolean_new)) {
            this.dangChayAuto = 0;
        }
        if ((n != 0)) {
            this.cfr_renamed_12();
        }
        super.cfr_renamed_15();
    }

            public gE() {
        ap.void_do(MenuChinhAvatar.cq);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("tp");
        ap.cfr_renamed_0();
        this.a_();
        gc_0.cfr_renamed_1();
    }

    public final void (int n, boolean bl != null) {
        this.cfr_renamed_17 = n;
        if (!gE.boolean_do(this.cfr_renamed_17, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][this.soLuong].length) || gE.boolean_for(this.cfr_renamed_17)) {
            this.cfr_renamed_17 = 0;
            if ((bl)) {
                this.coTrangThai = 0;
                this.cfr_renamed_1();
            }
        }
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        k.k_do().cfr_renamed_0(graphics);
        if ((AngelChip.duLieuNguoiChoi != null) && !(AngelChip.duLieuNguoiChoi.var_short_do.equals(""))) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, MenuChinhAvatar.bt + ", " + (String)AngelChip.duLieuNguoiChoi.var_short_do, k.k_do().cfr_renamed_2 + k.k_do().cfr_renamed_5 / 2, k.k_do().soLuong - bn_0.var_byte_try, 2);
        }
        graphics.translate(cfr_renamed_2, cfr_renamed_18);
        graphics.setClip(0, 0, k.k_do().cfr_renamed_5 - 9, k.k_do().var_int_int - (k.var_byte_do + (bn_0.cfr_renamed_16 << 1)));
        graphics.translate(0, -cfr_renamed_4);
        if (gE.cfr_renamed_2((int)((dL)this).cfr_renamed_5)) {
            int n;
            int n2 = 2 * bn_0.cfr_renamed_6;
            if ((this.coTrangThai)) {
                n = this.cfr_renamed_17 * dL.cfr_renamed_20;
                if ((151 + 88 - 201 + 140 ^ 170 + 82 - 70 + 0) == "  ".length()) {
                    return;
                }
            } else {
                n = 0;
            }
            GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, n2, this.soLuong * dL.cfr_renamed_20 + n, k.k_do().cfr_renamed_5 - 8 - 4 * bn_0.cfr_renamed_6, dL.cfr_renamed_20);
        }
        int n = (dL.cfr_renamed_20 - bn_0.var_byte_new) / 2;
        int n3 = 0;
        while (gE.boolean_do(n3, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]].length)) {
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n3][0], 24 * bn_0.cfr_renamed_6, n, 0);
            k.var_ep_if.cfr_renamed_0(0, 14 * bn_0.cfr_renamed_6, n + bn_0.var_byte_new / 2, 5, 3, graphics);
            n += dL.cfr_renamed_20;
            if ((this.coTrangThai) && (this.soLuong == n3)) {
                int n4 = 1;
                while (gE.boolean_do(n4, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n3].length)) {
                    GameCanvas.var_ew_try.cfr_renamed_0(graphics, AngelChip.var_java_lang_String_arr_arr_arr_if[ey_0.cfr_renamed_0().mangSoNguyen[4]][n3][n4], 36 * bn_0.cfr_renamed_6, n, 0);
                    graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, 24 * bn_0.cfr_renamed_6, n + bn_0.var_byte_new / 2, 3);
                    n += dL.cfr_renamed_20;
                    ++n4;
                    if (-"  ".length() <= 0) continue;
                    return;
                }
            }
            ++n3;
            if (-"  ".length() < 0) continue;
            return;
        }
        super.cfr_renamed_0(graphics);
    }

    public final void a_() {
        if ((MenuChinhAvatar.dg != null)) {
            if ((GameCanvas.cfr_renamed_16 == 0)) {
                ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.dg, 0);
            }
            if ((AngelChip.var_byte_do == 0)) {
                ((dL)this).cfr_renamed_4 = new ei(MenuChinhAvatar.bE, 1);
            }
            ((dL)this).cfr_renamed_2 = new ei(MenuChinhAvatar.cp, 2);
        }
    }

                    public final void void_for() {
        if ((gE.boolean_do())) {
            this.coTrangThai = 0;
            this.soLuong = 0;
            this.cfr_renamed_17 = 0;
            gE.cfr_renamed_5();
            ThongTinNhanVat.cfr_renamed_0().cfr_renamed_8();
            return;
        }
        if ((this.cfr_renamed_11 != 0)) {
            if (!(cfr_renamed_4 >= 0) || gE.boolean_if(cfr_renamed_4, cfr_renamed_8)) {
                this.cfr_renamed_11 -= this.cfr_renamed_11 / 4;
                cfr_renamed_4 += this.cfr_renamed_11 / 20;
                if ((this.cfr_renamed_11 / 10 <= 1)) {
                    this.cfr_renamed_11 = 0;
                }
            }
            if (gE.boolean_do(cfr_renamed_4)) {
                if (gE.boolean_do(cfr_renamed_4, -soLuongKhoa / 2)) {
                    cfr_renamed_4 = -soLuongKhoa / 2;
                    cfr_renamed_12 = 0;
                    this.cfr_renamed_11 = 0;
                    if (" ".length() == 0) {
                        return;
                    }
                }
            } else if (gE.boolean_if(cfr_renamed_4, cfr_renamed_8)) {
                if (gE.boolean_do(cfr_renamed_4, cfr_renamed_8 + soLuongKhoa / 2)) {
                    cfr_renamed_4 = cfr_renamed_8 + soLuongKhoa / 2;
                    cfr_renamed_12 = cfr_renamed_8;
                    this.cfr_renamed_11 = 0;
                    }
            } else {
                cfr_renamed_4 += this.cfr_renamed_11 / 10;
            }
            cfr_renamed_12 = cfr_renamed_4;
            this.cfr_renamed_11 -= this.cfr_renamed_11 / 10;
            if ((this.cfr_renamed_11 / 10 == 0)) {
                this.cfr_renamed_11 = 0;
                }
        } else if (gE.boolean_do(cfr_renamed_4)) {
            cfr_renamed_12 = 0;
            } else if (gE.boolean_if(cfr_renamed_4, cfr_renamed_8)) {
            cfr_renamed_12 = cfr_renamed_8;
        }
        if ((cfr_renamed_4 != cfr_renamed_12)) {
            cfr_renamed_10 = cfr_renamed_12 - cfr_renamed_4 << 2;
            cfr_renamed_4 += (cfr_renamed_5 += cfr_renamed_10) >> 4;
            cfr_renamed_5 &= 15;
        }
        GameCanvas.var_ef_0_do.cfr_renamed_3();
    }

    }

