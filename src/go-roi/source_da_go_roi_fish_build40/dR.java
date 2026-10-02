/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class dR
extends en {
    public static cu_0 var_cu_0_do;
    private long soXu;
    public static int soLuong;
    public static Vector[] var_java_util_Vector_arr_do;
    public static Vector var_java_util_Vector_do;
    private static fl_0 var_fl_0_do;
    private fs var_fs_new;
    private static fl_0 var_fl_0_if;
    private static fl_0 var_fl_0_for;
    public static boolean dangChayAuto;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private long var_long_if;
    public static byte var_byte_do;
    public static int var_int_if;
    public static fs var_fs_do;
    public fs[] var_fs_arr_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    private String chuoiPhu;
    private static fl_0 var_fl_0_byte;
    public static cu_0 var_cu_0_if;
    public static fs var_fs_if;
    public static e_0 var_e_0_do;
    public String chuoiGiaTri;
    private static fl_0 var_fl_0_case;
    public static Image var_javax_microedition_lcdui_Image_if;
    public static int soLuongKhoa;
    private byte[] var_byte_arr_do;
    public static short var_short_do;
    public static int var_int_int;
    public static int var_int_new;
    private byte[] var_byte_arr_if;
    private static fl_0 var_fl_0_char;
    public static cu_0 var_cu_0_for;
    public static byte var_byte_if;
    private long var_long_for;
    private static Vector var_java_util_Vector_char;
    private static int cfr_renamed_14;
    private int cfr_renamed_23;
    public static int var_int_try;
    public static Image var_javax_microedition_lcdui_Image_for;
    public static int var_int_byte;
    public static dR var_dR_do;
    public Vector var_java_util_Vector_if;
    public static int var_int_case;
    public static cu_0 var_cu_0_int;
    private static final byte[][] var_byte_arr_arr_do;
    public static Vector var_java_util_Vector_for;
    private Vector var_java_util_Vector_else;
    public static fs var_fs_for;
    private boolean var_boolean_try;
    private static final int[] mangSoNguyen;
    private boolean var_boolean_byte;
    private int cfr_renamed_24;
    public static byte var_byte_for;
    public static fs var_fs_int;
    private int cfr_renamed_22;
    public static boolean coTrangThai;
    private static int cfr_renamed_17;
    public static Vector var_java_util_Vector_int;
    private boolean var_boolean_case;
    public static cu_0 var_cu_0_new;
    private Vector var_java_util_Vector_goto;
    public static Vector var_java_util_Vector_new;
    public static Vector var_java_util_Vector_try;
    public static boolean coKichHoat;
    public static int var_int_char;
    private boolean var_boolean_char;
    public static Vector var_java_util_Vector_byte;
    public static int var_int_else;
    private int cfr_renamed_29;
    hs var_hs_do;
    public static byte var_byte_int;
    private static int cfr_renamed_26;
    public static int var_int_goto;
    public static Vector var_java_util_Vector_case;
    public static cu_0 var_cu_0_try;
    public static byte var_byte_char;
    public static String tenNhanVat;
    private boolean var_boolean_else;
    public static boolean var_boolean_int;

    public static ee_0 ee_0_do(int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, var_java_util_Vector_new.size())) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_new.elementAt(n2);
            if (dR.boolean_try(ee_02.var_short_if, n)) {
                return ee_02;
            }
            ++n2;
            if (((0x52 ^ 0x14) & ~(0x29 ^ 0x6F)) != " ".length()) continue;
            return null;
        }
        return null;
    }

    private void (de de2 == null) {
        if (dR.boolean_int(var_byte_char, -1)) {
            this.var_java_util_Vector_else.addElement(de2);
            return;
        }
        de2.void_do();
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    public static void void_for() {
        Vector<fs> vector = new Vector<fs>();
        int n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_byte.size())) {
            int n2;
            hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n);
            gk_0 gk_02 = bz.gk_0_do((int)hs2.cfr_renamed_9);
            if (dR.boolean_new(hs2 instanceof fj)) {
                n2 = 0;
                int n3 = 0;
                while (dR.boolean_for(n3, vector.size())) {
                    fs fs2 = (fs)vector.elementAt(n3);
                    if (dR.boolean_try(fs2.cfr_renamed_2, hs2.cfr_renamed_9)) {
                        ((fj)hs2).cfr_renamed_14 = fs2.soLuong;
                        n2 = 1;
                        if (-" ".length() < "   ".length()) break;
                        return;
                    }
                    ++n3;
                    return;
                }
                if (dR.boolean_for(n2)) {
                    ((fj)hs2).cfr_renamed_14 = hs2.cfr_renamed_9;
                    vector.addElement(new fs(hs2.cfr_renamed_9, 0, hs2.cfr_renamed_9));
                }
            }
            if (dR.boolean_int(n2 = gk_02.soLuong * 60 / 3)) {
                hs2.cfr_renamed_30 = hs2.cfr_renamed_15 / n2;
            }
            if (dR.boolean_if(hs2.cfr_renamed_30, 2)) {
                hs2.cfr_renamed_30 = 2;
            }
            if (!dR.boolean_int(hs2.cfr_renamed_15, -1) || dR.boolean_try(gk_02.var_byte_if, 3)) {
                hs2.cfr_renamed_30 = 0;
            }
            ++n;
            if (-(0x10 ^ 0x14) <= 0) continue;
            return;
        }
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_fh_do.cfr_renamed_2(graphics);
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        if (dR.boolean_do(var_int_int)) {
            if (dR.boolean_do(this.cfr_renamed_22, 8)) {
                this.cfr_renamed_22 = 0;
            }
            es es2 = (es)var_java_util_Vector_int.elementAt(var_int_int);
            graphics.drawImage(go_0.var_javax_microedition_lcdui_Image_if, es2.var_byte_for * dF.cfr_renamed_12, (es2.var_byte_int - 24 + this.cfr_renamed_22 / 2) * dF.cfr_renamed_12, 3);
            this.cfr_renamed_22 += 1;
            if (((0x7C ^ 0x6E) & ~(0x86 ^ 0x94)) > 0) {
                return;
            }
        } else if (dR.boolean_for(GameCanvas.cfr_renamed_12) && (var_fs_if != null) && dR.boolean_int(dR.var_fs_if.soLuong, -1) && dR.boolean_int(fh.var_int_char, 25)) {
            if (dR.boolean_do(this.cfr_renamed_22, 8)) {
                this.cfr_renamed_22 = 0;
            }
            graphics.drawImage(go_0.var_javax_microedition_lcdui_Image_if, (dR.var_fs_if.soLuong * fh.var_int_int + fh.var_int_int / 2) * dF.cfr_renamed_12, (dR.var_fs_if.var_int_if * fh.var_int_int - 4 + this.cfr_renamed_22 / 2) * dF.cfr_renamed_12, 3);
            this.cfr_renamed_22 += 1;
        }
        if (dR.boolean_int(fh.var_int_char, 25)) {
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, this.chuoiPhu, (dR.var_fs_int.soLuong + 26) * dF.cfr_renamed_12, (dR.var_fs_int.var_int_if - 14) * dF.cfr_renamed_12 + (dF.cfr_renamed_12 - 1) * 7, 2);
        }
        GameCanvas.hienThongBaoPopup(graphics);
        fh.cfr_renamed_1(graphics);
        TienIchGame.cfr_renamed_1(graphics);
    }

    public static void (int n != String string) {
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_41 + " " + string + "?", new bI(n));
    }

    public final void (Graphics graphics == null) {
        this.cfr_renamed_0(graphics);
        if (!(GameCanvas.var_fv_do != null) || dR.boolean_for(fv.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_1(graphics);
        }
    }

    private void cfr_renamed_15() {
        int n = this.int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
        if (dR.boolean_for(n - var_java_util_Vector_int.size())) {
            GameCanvas.cfr_renamed_8();
            et_0.et_0_do().cfr_renamed_4(var_int_goto);
            return;
        }
        if (dR.boolean_do(n) && dR.boolean_for(n, var_java_util_Vector_int.size())) {
            Object object = (es)var_java_util_Vector_int.elementAt(n);
            if (dR.boolean_try(((es)object).cfr_renamed_5, 5)) {
                this.cfr_renamed_16();
                return;
            }
            if (!(dR.boolean_try(((es)object).cfr_renamed_6, -1) && (dR.boolean_try(((es)object).var_byte_for, 1) && !dR.boolean_int(((es)object).var_byte_int, this.var_byte_arr_do[1]) || dR.boolean_try(((es)object).var_byte_for, 2) && !dR.boolean_int(((es)object).var_byte_int, this.var_byte_arr_if[1])))) {
                es es2 = object;
                object = this;
                int n2 = ((dR)object).int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
                Vector<fl_0> vector = (es)var_java_util_Vector_int.elementAt(n2);
                Object object2 = null;
                if (dR.boolean_int(n2)) {
                    object2 = (es)var_java_util_Vector_int.elementAt(n2 - 1);
                }
                dk_0 dk_02 = null;
                if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && (dR.boolean_try(((es)((Object)vector)).var_byte_for, 1) && !dR.boolean_new(n2) || (object2 != null) && dR.boolean_for(((es)((Object)vector)).var_byte_for, ((es)object2).var_byte_for))) {
                    dk_02 = new dk_0(MenuChinhAvatar.k);
                }
                if (dR.boolean_int(es2.cfr_renamed_6, -1) && dR.boolean_for(es2.cfr_renamed_5, 6) && dR.boolean_try(es2.var_byte_int, 36)) {
                    super.cfr_renamed_1(new fp((dR)object));
                }
                if (!dR.boolean_int(es2.cfr_renamed_6, -1) || dR.boolean_do(es2.cfr_renamed_5, 6)) {
                    vector = new ek((dR)object, es2);
                    if ((dk_02 != null)) {
                        Vector<fl_0> vector2 = new Vector<fl_0>();
                        vector2.addElement(new eo(MenuChinhAvatar.y, (de)((Object)vector)));
                        vector2.addElement(dk_02);
                        (vector2 == null);
                        return;
                    }
                    super.cfr_renamed_1((de)((Object)vector));
                }
                if (dR.boolean_int(es2.cfr_renamed_6, -1) && dR.boolean_for(es2.cfr_renamed_5, 6) && dR.boolean_for(n2, var_java_util_Vector_int.size()) && dR.boolean_int(var_java_util_Vector_try.size())) {
                    if (dR.boolean_new(es2.coKichHoat ? 1 : 0)) {
                        super.boolean_byte(n2, 7);
                        } else if (dR.boolean_new(es2.dangChayAuto ? 1 : 0)) {
                        super.boolean_byte(n2, 3);
                        if (((69 + 152 - 92 + 41 ^ 31 + 77 - -58 + 17) & (0x7A ^ 0x60 ^ (0xF ^ 8) ^ -" ".length())) != 0) {
                            return;
                        }
                    } else if (dR.boolean_for(es2.var_byte_new, 80)) {
                        super.boolean_byte(n2, 2);
                        }
                }
                if (dR.boolean_try(var_byte_char, -1)) {
                    vector = new Vector<fl_0>();
                    fo_0 fo_02 = new fo_0(MenuChinhAvatar.B);
                    vector.addElement(fo_02);
                    if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        vector.addElement(new gx_0(MenuChinhAvatar.y, new fq_0((dR)object, es2)));
                    }
                    if ((dk_02 != null)) {
                        vector.addElement(dk_02);
                    }
                    int n3 = 0;
                    while (dR.boolean_for(n3, var_java_util_Vector_try.size())) {
                        object = (ee_0)var_java_util_Vector_try.elementAt(n3);
                        object2 = dR.dg_0_do(((ee_0)object).var_short_if);
                        if (dR.boolean_for(((dg_0)object2).var_byte_do) && (dR.boolean_try(((dg_0)object2).var_byte_if, 3) && !dR.boolean_for(es2.dangChayAuto ? 1 : 0) || dR.boolean_try(((dg_0)object2).var_byte_if, 7) && !dR.boolean_for(es2.coKichHoat ? 1 : 0) || dR.boolean_int(((dg_0)object2).var_byte_if, 3) && dR.boolean_int(((dg_0)object2).var_byte_if, 7))) {
                            object = ((dg_0)object2).chuoiGiaTri + "(" + ((ee_0)object).soLuong + ")";
                            vector.addElement(new eh((String)object, n3, (dg_0)object2));
                        }
                        ++n3;
                        if ("  ".length() != -" ".length()) continue;
                        return;
                    }
                    (vector == null);
                }
                return;
            }
            if (dR.boolean_new(var_java_util_Vector_char.size())) {
                if (dR.boolean_try(var_byte_char, -1)) {
                    object = new Vector<fl_0>();
                    int n4 = this.int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
                    es es3 = (es)var_java_util_Vector_int.elementAt(n4);
                    es es4 = null;
                    if (dR.boolean_int(n4)) {
                        es4 = (es)var_java_util_Vector_int.elementAt(n4 - 1);
                    }
                    int n5 = 0;
                    while (dR.boolean_for(n5, var_java_util_Vector_char.size())) {
                        ee_0 ee_02 = (ee_0)var_java_util_Vector_char.elementAt(n5);
                        if ((bz.fb_0_if(ee_02.var_short_if) != null)) {
                            ((Vector)object).addElement(new ec(ee_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", n5, ee_02));
                        }
                        ++n5;
                        if ((0x4C ^ 0x49) != 0) continue;
                        return;
                    }
                    if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && (dR.boolean_try(es3.var_byte_for, 1) && !dR.boolean_new(n4) || (es4 != null) && dR.boolean_for(es3.var_byte_for, es4.var_byte_for))) {
                        ((Vector)object).addElement(new eg(MenuChinhAvatar.k));
                    }
                    (object == null);
                }
                return;
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cC);
        }
    }

    private static boolean boolean_if(int n) {
        return n <= 0;
    }

    protected static void (ee_0 ee_02 != int n) {
        int n2;
        int n3;
        int n4;
        if (dR.boolean_for(AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0)) {
            n4 = 1;
            if (-" ".length() == ("  ".length() & ("  ".length() ^ -" ".length()))) {
                return;
            }
        } else {
            n4 = n3 = -1;
        }
        if (dR.boolean_if(ee_02.soLuong - (n2 = var_java_util_Vector_arr_do[n].size()))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.u);
            return;
        }
        int n5 = 0;
        while (dR.boolean_for(n5, 3) && dR.boolean_for(n5, ee_02.soLuong - n2)) {
            int n6;
            gb_0 gb_02 = new gb_0(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int - 40);
            dg_0 dg_02 = dR.dg_0_do(ee_02.var_short_if);
            gb_02.var_short_do = ee_02.var_short_if;
            gb_02.cfr_renamed_4 = gb_02.cfr_renamed_6 = 2;
            gb_02.cfr_renamed_13 = -(4 + hg.int_new(3));
            gb_02.cfr_renamed_5 = n3 * (2 + hg.int_new(3));
            gb_02.cfr_renamed_8 = AngelChip.duLieuNguoiChoi.var_boolean_int - 20 + hg.int_new(4) * 5;
            if (dR.boolean_try(dg_02.var_byte_do, 4) && dR.boolean_try(fh.var_short_arr_if[n6 = fh.int_do((int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int + 23)], 14)) {
                gb_02.cfr_renamed_8 = 50 + hg.int_new(50);
                gb_02.cfr_renamed_5 = n3 * hg.int_new(3);
            }
            gb_02.var_bp_do = new ak_0(gb_02);
            var_java_util_Vector_arr_do[n].addElement(gb_02);
            fh.var_java_util_Vector_int.addElement(gb_02);
            ++n5;
            return;
        }
    }

    public static void (int n, int n2, short s2 == null) {
        AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = n2;
        fo.var_boolean_int = 1;
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_26 + n + MenuChinhAvatar.cb);
        ee_0 ee_02 = ee_0.cfr_renamed_1(var_java_util_Vector_do, (int)s2);
        if (dR.cfr_renamed_1((Object)ee_02)) {
            ee_02 = ee_0.cfr_renamed_1(var_java_util_Vector_new, (int)s2);
            var_java_util_Vector_new.removeElement(ee_02);
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            var_java_util_Vector_do.removeElement(ee_02);
            }
        if ((GameCanvas.var_en_do == fo.fo_do())) {
            fo.fo_do().void_if();
            if (dR.boolean_try(fh.var_int_char, 25)) {
                dR.cfr_renamed_12();
                fo.fo_do().void_do(2);
                if (((0x63 ^ 0x3F) & ~(0xE4 ^ 0xB8)) > " ".length()) {
                    return;
                }
            } else {
                dR.cfr_renamed_9();
            }
        }
        GameCanvas.cfr_renamed_7();
    }

    private void cfr_renamed_21() {
        int n = 0;
        while (dR.boolean_for(n, this.var_fs_arr_do.length)) {
            int n2 = 0;
            while (dR.boolean_for(n2, cfr_renamed_17)) {
                int n3 = this.var_fs_arr_do[n].soLuong + n2 / cfr_renamed_14;
                int n4 = this.var_fs_arr_do[n].var_int_if + n2 % cfr_renamed_14;
                if (dR.boolean_for(n * cfr_renamed_17 + n2, var_java_util_Vector_int.size())) {
                    fh.void_do(n3, n4);
                    es es2 = (es)var_java_util_Vector_int.elementAt(n * cfr_renamed_17 + n2);
                    ((es)var_java_util_Vector_int.elementAt(n * cfr_renamed_17 + n2)).var_short_if = (short)(n * cfr_renamed_17 + n2);
                    es2.var_int_new = n3;
                    es2.soLuong = n4;
                    es2.var_byte_for = (byte)(n3 * fh.var_int_int + fh.var_int_int / 2);
                    es2.var_byte_int = (byte)(n4 * fh.var_int_int + 18);
                    this.void_do(n * cfr_renamed_17 + n2);
                    fh.var_java_util_Vector_char.addElement(es2);
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    if (dR.boolean_try(n * cfr_renamed_17 + n2, var_java_util_Vector_int.size())) {
                        fh.var_java_util_Vector_char.addElement(new fd_0(-3, n3 * fh.var_int_int + 20, n4 * fh.var_int_int + 20, var_javax_microedition_lcdui_Image_if.getWidth()));
                        fh.void_do(n3, n4);
                        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
                        }
                    if (dR.boolean_try(fh.var_short_arr_if[n4 * fh.var_short_if + n3], this.var_byte_arr_do[0])) {
                        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
                        return;
                    }
                    if (dR.boolean_try(n3, this.var_fs_arr_do[n].soLuong) && dR.boolean_try(n4, this.var_fs_arr_do[n].var_int_if)) {
                        fh.var_short_arr_if[n4 * fh.var_short_if + n3] = 4;
                    }
                }
                ++n2;
                return;
            }
            ++n;
            if ((0x88 ^ 0x81 ^ (0x44 ^ 0x49)) <= (0x27 ^ 0x1B ^ (1 ^ 0x39))) continue;
            return;
        }
        fh.cfr_renamed_1(fh.var_java_util_Vector_char);
        }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

    private static fs (Vector vector != int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, vector.size())) {
            fs fs2 = (fs)vector.elementAt(n2);
            if (dR.boolean_try(fs2.cfr_renamed_2, n)) {
                return fs2;
            }
            ++n2;
            if (" ".length() > 0) continue;
            return null;
        }
        return null;
    }

    public static void void_for(int n, int n2) {
        if (dR.boolean_int(n2, 3) && dR.boolean_for(fo.boolean_do() ? 1 : 0)) {
            fo.cfr_renamed_3();
            if (dR.boolean_new(GameCanvas.coKichHoat ? 1 : 0)) {
                GameCanvas.var_fv_do = new fv();
                if (dR.boolean_if(fv.soLuong, 2)) {
                    fv.soLuong -= 1;
                }
                GameCanvas.var_fv_do.cfr_renamed_0(fo.var_fo_do);
                return;
            }
        } else {
            dg_0 dg_02;
            int n3 = fo.int_do();
            int n4 = 0;
            int n5 = 0;
            if (dR.boolean_for(n2)) {
                fb_0 fb_02 = bz.fb_0_do(n);
                n4 = fb_02.var_short_arr_do[0];
                n5 = fb_02.var_short_arr_do[1];
                if ("   ".length() <= 0) {
                    return;
                }
            } else if (dR.boolean_try(n2, 2)) {
                n4 = bz.ee_0_do((int)n).mangSoNguyen[0];
                n5 = bz.ee_0_do((int)n).mangSoNguyen[1];
                } else if (dR.boolean_try(n2, 4) && (dg_02 = dR.dg_0_do(n) != null)) {
                n4 = dg_02.var_int_if;
                n5 = dg_02.soLuong;
            }
            GameCanvas.cfr_renamed_1(n4 * n3, n5 * n3, new df_0(n, n3), new du_0(n, n3), null);
        }
    }

    static Vector java_util_Vector_do() {
        return var_java_util_Vector_char;
    }

    public final void void_do(int n) {
        es es2 = (es)var_java_util_Vector_int.elementAt(n);
        if (dR.boolean_try(es2.cfr_renamed_6, -1)) {
            this.cfr_renamed_1(es2, 2);
            if ("  ".length() < 0) {
                return;
            }
        } else {
            fb_0 fb_02 = bz.fb_0_do(es2.cfr_renamed_6);
            int n2 = fb_02.cfr_renamed_5 * 60 / 5;
            es2.cfr_renamed_5 = es2.var_short_do / n2;
            if (dR.boolean_do(es2.cfr_renamed_5, 5)) {
                es2.cfr_renamed_5 = 5;
            }
            if (!dR.boolean_do(es2.var_short_do) || dR.boolean_int(fb_02.var_short_if, -1) && !dR.boolean_new(es2.var_short_do - fb_02.cfr_renamed_5 * 60, fb_02.var_short_if * 60) || !dR.boolean_int(es2.var_byte_do, 100) || (es2.cfr_renamed_5 < 0)) {
                es2.cfr_renamed_5 = 6;
            }
            if (dR.boolean_new(es2.coTrangThai ? 1 : 0)) {
                this.cfr_renamed_1(es2, 3);
                if ("  ".length() <= " ".length()) {
                    return;
                }
            } else {
                this.cfr_renamed_1(es2, 4);
            }
        }
        fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
    }

    public final void void_int(int n, int n2) {
        ee_0 ee_02;
        if ((!dR.boolean_int(fh.var_int_char, 24) || dR.boolean_try(fh.var_int_char, 53)) && (ee_02 = ee_0.cfr_renamed_1(var_java_util_Vector_char, n2) != null)) {
            es es2 = (es)var_java_util_Vector_int.elementAt(n);
            ((es)var_java_util_Vector_int.elementAt(n)).cfr_renamed_6 = n2;
            this.cfr_renamed_1(es2, 4);
            fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
            es2.cfr_renamed_5 = 0;
            es2.dangChayAuto = 0;
            es2.coKichHoat = 0;
            es2.var_short_do = (short)0;
            es2.soXu = 0L;
            es2.var_byte_new = (byte)100;
            es2.var_byte_do = (byte)0;
            ee_02.soLuong -= 1;
            if (dR.boolean_if(ee_02.soLuong)) {
                var_java_util_Vector_char.removeElement(ee_02);
                }
        }
    }

    public final void b_() {
        var_fl_0_case = new fl_0(MenuChinhAvatar.cT, 0);
        var_fl_0_char = new fl_0(MenuChinhAvatar.bR, 7);
        var_fl_0_byte = new fl_0(null, 2);
        var_fl_0_for = new fl_0(null, 3);
        ((en)this).cfr_renamed_5 = var_fl_0_char;
    }

    static void (dR dR2, dg_0 dg_02, short s2, hs hs2 == null) {
        dR2.cfr_renamed_1(dg_02, s2, hs2);
    }

        public static dg_0 dg_0_do(int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, bz.var_java_util_Vector_for.size())) {
            dg_0 dg_02 = (dg_0)bz.var_java_util_Vector_for.elementAt(n2);
            if (dR.boolean_try(dg_02.var_short_do, n)) {
                return dg_02;
            }
            ++n2;
            if ((0x8E ^ 0x8B) != 0) continue;
            return null;
        }
        return null;
    }

        public static void (int n, int n2, Vector vector == null) {
        if (dR.boolean_try(AngelChip.duLieuNguoiChoi.var_short_goto, var_int_goto) && dR.boolean_do(n2) && dR.boolean_for(n2, vector.size())) {
            fs fs2 = (fs)vector.elementAt(n2);
            int n3 = 0;
            while (dR.boolean_for(n3, var_java_util_Vector_byte.size())) {
                hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n3);
                gk_0 gk_02 = bz.gk_0_do((int)hs2.cfr_renamed_9);
                if (dR.boolean_int(hs2.cfr_renamed_10) && dR.boolean_try(fs2.cfr_renamed_2, hs2.cfr_renamed_9)) {
                    hs2.cfr_renamed_10 = 0;
                    if (dR.boolean_try(n, 1) && dR.boolean_try(gk_02.var_byte_if, n)) {
                        (hs2 == null);
                        dR.void_if(-50);
                    }
                    if (dR.boolean_try(n, 2) && dR.boolean_try(gk_02.var_byte_if, n)) {
                        (hs2 == null);
                        dR.void_if(-51);
                    }
                }
                ++n3;
                if (-"  ".length() <= 0) continue;
                return;
            }
        }
    }

        public static void (Vector vector == null) {
        int n = fh.var_int_int * dF.cfr_renamed_12;
        if (dR.boolean_new(GameCanvas.var_boolean_try ? 1 : 0)) {
            n += n / 3;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, GameCanvas.cfr_renamed_15, n, n);
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_6() {
        block60: {
            block62: {
                block66: {
                    block65: {
                        block64: {
                            block63: {
                                block61: {
                                    block54: {
                                        block55: {
                                            block58: {
                                                block56: {
                                                    block59: {
                                                        block57: {
                                                            if (!dR.boolean_new((int)this.var_boolean_char) || !dR.boolean_for(AngelChip.duLieuNguoiChoi.var_short_for) || !dR.boolean_for(AngelChip.duLieuNguoiChoi.var_int_class) || !dR.boolean_try(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_short_char) || !dR.boolean_try((int)AngelChip.duLieuNguoiChoi.var_boolean_int, AngelChip.duLieuNguoiChoi.var_short_try)) break block54;
                                                            this.var_boolean_char = 0;
                                                            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = 0;
                                                            this.cfr_renamed_24();
                                                            if (!dR.boolean_try(dR.var_byte_char, -1)) break block54;
                                                            if (!dR.boolean_int(dR.var_int_if, -1)) break block55;
                                                            if (!dR.boolean_int(this.var_java_util_Vector_goto.size()) || !dR.boolean_int(dR.var_int_if, -1)) break block54;
                                                            var1_1 = (fs)this.var_java_util_Vector_goto.elementAt(0);
                                                            var2_9 = (es)dR.var_java_util_Vector_int.elementAt(var1_1.cfr_renamed_2);
                                                            ((es)dR.var_java_util_Vector_int.elementAt(var1_1.cfr_renamed_2)).var_boolean_int = 0;
                                                            dR.var_fs_if.soLuong = var2_9.var_byte_for / fh.var_int_int;
                                                            dR.var_fs_if.var_int_if = var2_9.var_byte_int / fh.var_int_int;
                                                            if (!dR.boolean_new((int)this.var_boolean_case)) break block56;
                                                            if (!dR.boolean_try(var2_9.cfr_renamed_5, 5)) break block57;
                                                            this.cfr_renamed_16();
                                                            this.cfr_renamed_10();
                                                            if (-" ".length() > 0) {
                                                                return;
                                                            }
                                                            break block58;
                                                        }
                                                        var3_13 = 0;
                                                        if (dR.boolean_int(var2_9.cfr_renamed_6, -1) && dR.boolean_for(var2_9.cfr_renamed_5, 6) && dR.boolean_try(var2_9.var_byte_int, 36)) {
                                                            this.cfr_renamed_1(new av_0(this, var2_9));
                                                            var3_13 = 1;
                                                        }
                                                        if (!dR.boolean_int(var2_9.cfr_renamed_6, -1) || !dR.boolean_for(var2_9.cfr_renamed_5, 6)) break block59;
                                                        if (!dR.boolean_for(var1_1.cfr_renamed_2, dR.var_java_util_Vector_int.size())) break block54;
                                                        if (dR.boolean_new((int)var2_9.coKichHoat) && dR.boolean_new((int)this.boolean_byte(var1_1.cfr_renamed_2, 7))) {
                                                            var3_13 = 1;
                                                        }
                                                        if (dR.boolean_new((int)var2_9.dangChayAuto) && dR.boolean_new((int)this.boolean_byte(var1_1.cfr_renamed_2, 3))) {
                                                            var3_13 = 1;
                                                        }
                                                        if (dR.boolean_for(var2_9.var_byte_new, 80)) {
                                                            var4_14 = 0;
                                                            var2_10 = 0;
                                                            while (dR.boolean_for(var2_10, dR.var_java_util_Vector_try.size())) {
                                                                var5_17 = dR.dg_0_do(((ee_0)dR.var_java_util_Vector_try.elementAt((int)var2_10)).var_short_if);
                                                                if (dR.boolean_try(var5_17.var_byte_if, 2) && (!dR.boolean_int(var5_17.var_short_do, 111) || dR.boolean_try(var5_17.var_short_do, 112))) {
                                                                    var4_14 = 1;
                                                                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, var1_1.cfr_renamed_2, (int)var5_17.var_short_do);
                                                                    if (((22 ^ 43) & ~(166 ^ 155)) == 0) break;
                                                                    return;
                                                                }
                                                                ++var2_10;
                                                                if (((35 ^ 20) & ~(48 ^ 7)) < (18 ^ 22)) continue;
                                                                return;
                                                            }
                                                            if (dR.boolean_for(var4_14)) {
                                                                GameCanvas.cfr_renamed_1(MenuChinhAvatar.aH);
                                                            }
                                                        }
                                                    }
                                                    if (dR.boolean_for(var3_13)) {
                                                        this.cfr_renamed_10();
                                                    }
                                                    if (" ".length() <= 0) {
                                                        return;
                                                    }
                                                    break block58;
                                                }
                                                if (dR.boolean_try(var2_9.cfr_renamed_5, 5)) {
                                                    this.cfr_renamed_16();
                                                    this.cfr_renamed_10();
                                                    if (-" ".length() >= 0) {
                                                        return;
                                                    }
                                                } else {
                                                    this.cfr_renamed_1(new ac_0(this, var2_9));
                                                    this.cfr_renamed_1(new bC(this, var1_1));
                                                }
                                            }
                                            this.var_java_util_Vector_goto.removeElement(var1_1);
                                            if (-" ".length() != -" ".length()) {
                                                return;
                                            }
                                            break block54;
                                        }
                                        dR.var_int_if = -1;
                                        this.cfr_renamed_15();
                                    }
                                    if (!dR.boolean_int(dR.var_int_int, -1)) break block60;
                                    if (!dR.boolean_new((int)GameCanvas.boolean_do(2))) break block61;
                                    GameCanvas.var_boolean_arr_if[2] = 0;
                                    var1_2 = dR.var_int_int;
                                    if (dR.boolean_new(var1_2 % 12 % 4)) {
                                        --var1_2;
                                    }
                                    if (dR.boolean_do(var1_2)) {
                                        dR.var_int_int = var1_2;
                                        if (-" ".length() > ((208 ^ 152) & ~(202 ^ 130))) {
                                            return;
                                        }
                                    }
                                    break block62;
                                }
                                if (!dR.boolean_new((int)GameCanvas.boolean_do(4))) break block63;
                                GameCanvas.var_boolean_arr_if[4] = 0;
                                var1_3 = dR.var_int_int;
                                if (dR.boolean_do(var1_3 -= 4)) {
                                    dR.var_int_int = var1_3;
                                    if (-"  ".length() >= 0) {
                                        return;
                                    }
                                }
                                break block62;
                            }
                            if (!dR.boolean_new((int)GameCanvas.boolean_do(6))) break block64;
                            GameCanvas.var_boolean_arr_if[6] = 0;
                            var1_4 = dR.var_int_int;
                            if (dR.boolean_for(var1_4 += 4, dR.var_java_util_Vector_int.size())) {
                                dR.var_int_int = var1_4;
                                if (-(140 + 167 - 300 + 168 ^ 73 + 91 - 136 + 142) >= 0) {
                                    return;
                                }
                            }
                            break block62;
                        }
                        if (!dR.boolean_new((int)GameCanvas.boolean_do(8))) break block65;
                        GameCanvas.var_boolean_arr_if[8] = 0;
                        var1_5 = dR.var_int_int;
                        if (dR.boolean_int(var1_5 % 12 % 4, 3)) {
                            ++var1_5;
                        }
                        if (dR.boolean_for(var1_5, dR.var_java_util_Vector_int.size())) {
                            dR.var_int_int = var1_5;
                            if (-(106 ^ 110) > 0) {
                                return;
                            }
                        }
                        break block62;
                    }
                    if (!dR.boolean_new((int)GameCanvas.boolean_do(5))) break block62;
                    var1_6 = fh.var_int_int;
                    var2_9 = (es)dR.var_java_util_Vector_int.elementAt(dR.var_int_int);
                    if (!dR.boolean_int(var2_9.cfr_renamed_6, -1) || !dR.boolean_for(var2_9.cfr_renamed_5, 6)) break block66;
                    if (!dR.boolean_new((int)this.var_boolean_case)) ** GOTO lbl-1000
                    if (dR.boolean_for((int)var2_9.var_boolean_int)) {
                        this.var_java_util_Vector_goto.addElement(new fs(var2_9.var_byte_for / var1_6, var2_9.var_byte_int / var1_6, dR.var_int_int));
                    }
                    var2_9.var_boolean_int = 1;
                    this.cfr_renamed_10();
                    if (((69 + 70 - 19 + 48 ^ 66 + 25 - 23 + 80) & (185 ^ 194 ^ (83 ^ 20) ^ -" ".length())) != 0) {
                        return;
                    }
                    break block62;
                }
                if (dR.boolean_for((int)this.var_boolean_case)) {
                    if (dR.boolean_for((int)var2_9.var_boolean_int)) {
                        this.var_java_util_Vector_goto.addElement(new fs(var2_9.var_byte_for / var1_6, var2_9.var_byte_int / var1_6, dR.var_int_int));
                    }
                    var2_9.var_boolean_int = 1;
                    this.cfr_renamed_10();
                    } else lbl-1000:
                // 2 sources

                {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_25);
                }
            }
            if (dR.boolean_for(GameCanvas.cfr_renamed_12)) {
                var2_9 = (es)dR.var_java_util_Vector_int.elementAt(dR.var_int_int);
                fm.fm_do().void_do(var2_9.var_byte_for, var2_9.var_byte_int);
            }
        }
        if (dR.boolean_new((int)GameCanvas.coTrangThai) && dR.boolean_do((var2_11 = GameCanvas.soLuong + fm.fm_do().cfr_renamed_2) / (var3_13 = fh.var_int_int * dF.cfr_renamed_12) * fh.var_short_if + (var1_7 = GameCanvas.var_int_try + fm.fm_do().cfr_renamed_3) / var3_13) && dR.boolean_new(var2_11 / var3_13 * fh.var_short_if + var1_7 / var3_13, fh.var_short_arr_do.length) && dR.boolean_try(fh.var_short_arr_do[var2_11 / var3_13 * fh.var_short_if + var1_7 / var3_13], 51)) {
            this.var_boolean_else = 1;
            dR.coKichHoat = 1;
            var3_13 = this.int_do(var1_7 / var3_13, var2_11 / var3_13);
            var4_15 = (es)dR.var_java_util_Vector_int.elementAt(var3_13);
            dR.var_fs_if.soLuong = var4_15.var_byte_for / fh.var_int_int;
            dR.var_fs_if.var_int_if = var4_15.var_byte_int / fh.var_int_int;
        }
        if (dR.boolean_new((int)this.var_boolean_else) && dR.boolean_new((int)GameCanvas.var_boolean_new)) {
            this.var_boolean_else = 0;
            dR.coKichHoat = 0;
            var1_8 = GameCanvas.var_int_try + fm.fm_do().cfr_renamed_3;
            var2_12 = GameCanvas.soLuong + fm.fm_do().cfr_renamed_2;
            var3_13 = fh.var_int_int * dF.cfr_renamed_12;
            if (dR.boolean_for((int)this.var_boolean_byte) && (this.cfr_renamed_3 != null) && (dR.var_fs_if != null) && dR.boolean_try(var1_8 / var3_13, dR.var_fs_if.soLuong) && dR.boolean_try(var2_12 / var3_13, dR.var_fs_if.var_int_if)) {
                this.cfr_renamed_3.cfr_renamed_0();
                if (-(103 + 23 - 14 + 38 ^ 27 + 92 - 4 + 31) > 0) {
                    return;
                }
            } else if (dR.boolean_do(var2_12 / var3_13 * fh.var_short_if + var1_8 / var3_13) && dR.boolean_new(var2_12 / var3_13 * fh.var_short_if + var1_8 / var3_13, fh.var_short_arr_do.length) && dR.boolean_try(fh.var_short_arr_do[var2_12 / var3_13 * fh.var_short_if + var1_8 / var3_13], 51)) {
                var3_13 = this.int_do(var1_8 / var3_13, var2_12 / var3_13);
                var4_16 = (es)dR.var_java_util_Vector_int.elementAt(var3_13);
                dR.var_fs_if.soLuong = var4_16.var_byte_for / fh.var_int_int;
                dR.var_fs_if.var_int_if = var4_16.var_byte_int / fh.var_int_int;
                if (dR.boolean_new((int)this.var_boolean_byte) && dR.boolean_do(var3_13) && dR.boolean_for(var3_13, dR.var_java_util_Vector_int.size())) {
                    dR.var_int_int = var3_13;
                    if (dR.boolean_int(var4_16.cfr_renamed_6, -1) && dR.boolean_int(var4_16.cfr_renamed_5, 5) && dR.boolean_for(var4_16.cfr_renamed_5, 6)) {
                        GameCanvas.var_boolean_new = 0;
                        if (dR.boolean_new((int)this.var_boolean_case)) {
                            if (dR.boolean_for((int)var4_16.var_boolean_int)) {
                                this.var_java_util_Vector_goto.addElement(new fs(var1_8 / fh.var_int_int, var2_12 / fh.var_int_int, var3_13));
                            }
                            var4_16.var_boolean_int = 1;
                            this.cfr_renamed_10();
                            if (((190 ^ 140) & ~(20 ^ 38)) != 0) {
                                return;
                            }
                        } else if (dR.boolean_int(var4_16.cfr_renamed_5, 5)) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.D);
                            if (((142 + 56 - 140 + 109 ^ 90 + 98 - 138 + 83) & (11 ^ 77 ^ (233 ^ 141) ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                    } else {
                        GameCanvas.var_boolean_new = 0;
                        if (dR.boolean_new((int)this.var_boolean_case) && dR.boolean_int(var4_16.cfr_renamed_5, 5)) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_17);
                            if ((182 ^ 178) <= " ".length()) {
                                return;
                            }
                        } else {
                            if (dR.boolean_for((int)var4_16.var_boolean_int)) {
                                this.var_java_util_Vector_goto.addElement(new fs(var1_8 / fh.var_int_int, var2_12 / fh.var_int_int, var3_13));
                            }
                            var4_16.var_boolean_int = 1;
                            this.cfr_renamed_10();
                            if ((107 + 124 - 171 + 104 ^ 132 + 100 - 157 + 86) <= 0) {
                                return;
                            }
                        }
                    }
                } else {
                    GameCanvas.var_int_else = GameCanvas.var_int_try -= fh.var_int_int * dF.cfr_renamed_12;
                    this.var_boolean_char = 1;
                }
            }
        }
        if (dR.boolean_new(GameCanvas.var_boolean_arr_do[5]) && (!dR.boolean_int(fh.var_int_char, 24) || dR.boolean_try(fh.var_int_char, 53)) && (this.cfr_renamed_5 != null) && (this.cfr_renamed_3 == null)) {
            this.cfr_renamed_5.cfr_renamed_0();
        }
        super.cfr_renamed_6();
        GameCanvas.var_fh_do.cfr_renamed_1();
        if (dR.boolean_try(dR.var_byte_char, -1)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_2();
        }
    }

    public static void (Vector vector, Vector vector2, Vector vector3, Vector vector4, byte by2, boolean bl == null) {
        var_java_util_Vector_char = vector;
        coTrangThai = bl;
        var_byte_int = by2;
        int n = var_java_util_Vector_char.size();
        by2 = (byte)0;
        while (dR.boolean_for(by2, n)) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_char.elementAt(by2);
            fb_0 fb_02 = bz.fb_0_if(ee_02.var_short_if);
            if ((fb_02 != null)) {
                ee_02.chuoiGiaTri = fb_02.tenNhanVat;
            }
            by2 = (byte)(by2 + 1);
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        var_java_util_Vector_do = vector2;
        by2 = (byte)0;
        while (dR.boolean_for(by2, var_java_util_Vector_do.size())) {
            dR.cfr_renamed_1((ee_0)var_java_util_Vector_do.elementAt(by2));
            by2 = (byte)(by2 + 1);
            if (((0xC5 ^ 0x97) & ~(0x91 ^ 0xC3)) == 0) continue;
            return;
        }
        var_java_util_Vector_try = vector3;
        var_java_util_Vector_new = vector4;
    }

    private static void cfr_renamed_8(int n, int n2) {
        if (dR.boolean_new(GameCanvas.coKichHoat ? 1 : 0)) {
            fv.cfr_renamed_4();
        }
        ee_0 ee_02 = (ee_0)var_java_util_Vector_char.elementAt(n);
        et_0.et_0_do().cfr_renamed_0(var_int_goto, n2, ee_02.var_short_if);
    }

    private void cfr_renamed_10() {
        if (dR.boolean_int(this.var_java_util_Vector_goto.size()) && dR.boolean_int(var_int_if, -1)) {
            this.var_boolean_char = 1;
            fs fs2 = (fs)this.var_java_util_Vector_goto.elementAt(0);
            if ((AngelChip.duLieuNguoiChoi.var_boolean_arr_arr_do == null)) {
                fh.var_fs_do = new fs();
                AngelChip.duLieuNguoiChoi.cfr_renamed_14();
            }
            fh.var_fs_do.soLuong = fs2.soLuong * 24 - 24;
            fh.var_fs_do.var_int_if = fs2.var_int_if * 24 + 12;
            AngelChip.duLieuNguoiChoi.var_int_class = -5;
            AngelChip.duLieuNguoiChoi.var_int_this = -1;
            AngelChip.duLieuNguoiChoi.var_short_char = AngelChip.duLieuNguoiChoi.var_short_for;
            AngelChip.duLieuNguoiChoi.var_short_try = (short)(AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
            AngelChip.duLieuNguoiChoi.var_fs_do = fh.var_fs_do;
            AngelChip.duLieuNguoiChoi.cfr_renamed_4();
        }
    }

    private static boolean boolean_for(int n) {
        return n == 0;
    }

    private static void cfr_renamed_18() {
        mangSoNguyen = new int[65];
        24 = 0x60 ^ 0x78;
        16 = (0x45 ^ 7) & ~(0x26 ^ 0x64) ^ (0x83 ^ 0x93);
        2 = "  ".length();
        0 = (0x5F ^ 0x17) & ~(0x7D ^ 0x35);
        1 = " ".length();
        13 = 0x48 ^ 0x52 ^ (0x82 ^ 0x95);
        9 = 0x66 ^ 0xC ^ (0x42 ^ 0x21);
        27 = 0x48 ^ 0x79 ^ (0x37 ^ 0x1D);
        17 = 88 + 109 - 76 + 6 ^ (0x17 ^ 0x79);
        7 = 0xF ^ 0x76 ^ (0xC0 ^ 0xBE);
        3 = "   ".length();
        5 = 6 ^ 3;
        33 = 0xBB ^ 0x9A;
        34 = 0x51 ^ 0x73;
        35 = 0x62 ^ 0x27 ^ (0x77 ^ 0x11);
        36 = 0x2B ^ 0xF;
        4 = 99 + 119 - 153 + 78 ^ 17 + 71 - -48 + 3;
        37 = 0xE0 ^ 0xC5;
        120 = 178 + 37 - 140 + 114 ^ 157 + 48 - 108 + 100;
        121 = 6 ^ 0xB ^ (0xF6 ^ 0x82);
        122 = 41 + 127 - -4 + 14 ^ 74 + 106 - 79 + 91;
        123 = 0x51 ^ 0x40 ^ (0xC6 ^ 0xAC);
        8 = 0x10 ^ 0x72 ^ (0xC6 ^ 0xAC);
        18 = 0x5E ^ 0x4C;
        101 = 0xA2 ^ 0xC7;
        20 = 0x8B ^ 0x84 ^ (0x52 ^ 0x49);
        -1 = -" ".length();
        6 = 9 ^ 0xF;
        80 = 0xA ^ 0x1C ^ (0xE5 ^ 0xA3);
        51 = 0xA0 ^ 0x93;
        52 = 0x29 ^ 0x1D;
        92 = 0xE9 ^ 0xB5;
        95 = 0x21 ^ 0x7E;
        98 = 0xA ^ 0x10 ^ (0x6A ^ 0x12);
        50 = 0xB7 ^ 0x8F ^ (0x59 ^ 0x53);
        85 = 26 + 133 - 92 + 84 ^ 64 + 159 - 36 + 7;
        87 = 0x13 ^ 0x44;
        40 = 0x63 ^ 0x4B;
        23 = 0x2E ^ 0x39;
        14 = 62 + 121 - 149 + 103 ^ 92 + 99 - 99 + 43;
        25 = 0x4E ^ 0x57;
        30 = 0x3E ^ 0x64 ^ (0x45 ^ 1);
        -3 = -"   ".length();
        10 = 0xAF ^ 0xA5;
        53 = 116 + 141 - 113 + 8 ^ 153 + 12 - 20 + 28;
        -2 = -"  ".length();
        250 = (0x83 ^ 0xB7) + (74 + 133 - 170 + 99) - (44 + 57 - 75 + 119) + (12 + 37 - -37 + 121);
        45 = 0x6D ^ 0x40;
        60 = 107 + 50 - 117 + 136 ^ 17 + 89 - 47 + 81;
        100 = 0xCE ^ 0xBE ^ (0x81 ^ 0x95);
        12 = 0x6C ^ 0x2A ^ (0x58 ^ 0x12);
        111 = 0xAA ^ 0xC5;
        112 = 87 + 89 - 92 + 138 ^ 82 + 85 - 96 + 103;
        -5 = -(0x29 ^ 0xF ^ (0x95 ^ 0xB6));
        26 = 0x3D ^ 0x27;
        55 = 0xF2 ^ 0xC5;
        849 = 0xFFFFDBFB & 0x2755;
        -8 = -(0x5C ^ 0x54);
        86 = 0x61 ^ 0x7B ^ (0x69 ^ 0x25);
        -7 = -(0x4E ^ 0x39 ^ (0xF3 ^ 0x83));
        800 = -(0xFFFFEDFC & 0x32CF) & (0xFFFFBFFF & 0x63EB);
        11 = 41 + 42 - 82 + 133 ^ 3 + 75 - -43 + 20;
        54 = 0xA5 ^ 0x93;
        -50 = -(0x98 ^ 0xAA);
        -51 = -(0x7E ^ 0x2A ^ (6 ^ 0x61));
    }

    private static boolean boolean_int(int n) {
        return n > 0;
    }

    public static void void_new(int n, int n2) {
        hs hs2 = dR.hs_do(n);
        if ((hs2 != null)) {
            int n3 = n2 - AngelChip.duLieuNguoiChoi.mangSoNguyen[0];
            fh.var_bm_do = null;
            Image image = aa_0.cfr_renamed_0((short)bz.gk_0_do((int)hs2.cfr_renamed_9).var_short_arr_do[hs2.cfr_renamed_30]).var_javax_microedition_lcdui_Image_do;
            GameCanvas.cfr_renamed_1(n3, hs2.coKichHoat ? 1 : 0, hs2.cfr_renamed_3 - 7, hg.cfr_renamed_1(0, hs2.cfr_renamed_13 * hs2.cfr_renamed_4, image.getWidth(), hs2.cfr_renamed_4 ? 1 : 0, image), -1);
            var_java_util_Vector_byte.removeElement(hs2);
            fh.var_java_util_Vector_case.removeElement(hs2);
            }
        fo.var_boolean_int = 1;
        AngelChip.duLieuNguoiChoi.mangSoNguyen[0] = n2;
    }

    private void (byte by2 != int n) {
        var_int_case = n;
        var_byte_char = by2;
        AngelChip.duLieuNguoiChoi.var_int_class = -1;
        AngelChip.duLieuNguoiChoi.var_int_long = -1;
        AngelChip.duLieuNguoiChoi.var_int_const = -1;
        if (dR.boolean_try(var_byte_char, 4)) {
            this.var_fs_new = new fs(fh.var_bm_do.cfr_renamed_2 / fh.var_int_int, fh.var_bm_do.cfr_renamed_3 / fh.var_int_int);
            if ("  ".length() == 0) {
                return;
            }
        } else {
            this.var_fs_new = new fs(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
        }
        AngelChip.duLieuNguoiChoi.var_short_try = (short)(this.var_fs_new.var_int_if * fh.var_int_int + fh.var_int_int / 2);
        AngelChip.duLieuNguoiChoi.var_short_char = (short)(this.var_fs_new.soLuong * fh.var_int_int);
        if (dR.boolean_try(AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, dd_0.var_byte_try)) {
            AngelChip.duLieuNguoiChoi.var_short_char = (short)(AngelChip.duLieuNguoiChoi.var_short_char + fh.var_int_int);
        }
    }

    static {
        dR.cfr_renamed_18();
        var_java_util_Vector_char = new Vector();
        var_java_util_Vector_try = new Vector();
        var_java_util_Vector_new = new Vector();
        var_java_util_Vector_byte = new Vector();
        var_java_util_Vector_arr_do = new Vector[2];
        dangChayAuto = 0;
        coTrangThai = 0;
        var_byte_char = (byte)-1;
        cfr_renamed_17 = 12;
        cfr_renamed_14 = 4;
        var_int_case = -1;
        var_int_int = -1;
        cfr_renamed_26 = 0;
        byte[][] byArrayArray = new byte[5][];
        byte[] byArray = new byte[10];
        byArray[0] = 0;
        byArray[1] = 0;
        byArray[2] = 0;
        byArray[3] = 0;
        byArray[4] = 0;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 1;
        byArray[8] = 1;
        byArray[9] = 1;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[10];
        byArray2[0] = 2;
        byArray2[1] = 2;
        byArray2[2] = 2;
        byArray2[3] = 2;
        byArray2[4] = 2;
        byArray2[5] = 3;
        byArray2[6] = 3;
        byArray2[7] = 3;
        byArray2[8] = 3;
        byArray2[9] = 3;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[10];
        byArray3[0] = 4;
        byArray3[1] = 4;
        byArray3[2] = 4;
        byArray3[3] = 4;
        byArray3[4] = 4;
        byArray3[5] = 5;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        byArray3[9] = 5;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[10];
        byArray4[0] = 6;
        byArray4[1] = 6;
        byArray4[2] = 6;
        byArray4[3] = 6;
        byArray4[4] = 6;
        byArray4[5] = 7;
        byArray4[6] = 7;
        byArray4[7] = 7;
        byArray4[8] = 7;
        byArray4[9] = 7;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[10];
        byArray5[0] = 8;
        byArray5[1] = 8;
        byArray5[2] = 8;
        byArray5[3] = 8;
        byArray5[4] = 8;
        byArray5[5] = 9;
        byArray5[6] = 9;
        byArray5[7] = 9;
        byArray5[8] = 9;
        byArray5[9] = 9;
        byArrayArray[4] = byArray5;
        var_byte_arr_arr_do = byArrayArray;
        var_int_if = -1;
        coKichHoat = 0;
        var_boolean_int = 0;
        var_int_new = -1;
        soLuong = -1;
        var_short_do = (short)0;
    }

    public static void void_try(int n, int n2) {
        hs hs2 = dR.hs_do(n);
        if (dR.boolean_int(n2) && (hs2 != null)) {
            gk_0 gk_02 = bz.gk_0_do((int)hs2.cfr_renamed_9);
            Object object = gk_02;
            ee_0 ee_02 = ee_0.cfr_renamed_1(var_java_util_Vector_do, (int)((gk_0)object).var_byte_do);
            if ((ee_02 != null)) {
                ee_02.soLuong += n2;
                if (((161 + 32 - 37 + 20 ^ 114 + 5 - 113 + 175) & (78 + 151 - 110 + 79 ^ 113 + 56 - 36 + 62 ^ -" ".length())) > ((0x2B ^ 0x73 ^ (0x52 ^ 0x54)) & (0x83 ^ 0xC5 ^ (0x9A ^ 0x82) ^ -" ".length()))) {
                    return;
                }
            } else {
                ee_02 = new ee_0();
                new ee_0().var_short_if = ((gk_0)object).var_byte_do;
                ee_02.soLuong = n2;
                ee_02.chuoiGiaTri = ((gk_0)object).tenNhanVat;
                ee_02.mangSoNguyen[0] = ((gk_0)object).cfr_renamed_3;
                (ee_02 == null);
                var_java_util_Vector_do.addElement(ee_02);
            }
            if ((aa_0.cfr_renamed_0(gk_02.var_short_for) != null)) {
                object = null;
                if (dR.boolean_try(gk_02.var_byte_if, 1)) {
                    object = (var_java_util_Vector_for !=  (int)hs2.cfr_renamed_9);
                    if (((0x52 ^ 0x2A ^ (0x6D ^ 0x56)) & (0x59 ^ 0x5C ^ (0x27 ^ 0x61) ^ -" ".length())) != 0) {
                        return;
                    }
                } else if (dR.boolean_try(gk_02.var_byte_if, 2)) {
                    object = (var_java_util_Vector_case !=  (int)hs2.cfr_renamed_9);
                }
                if ((object != null)) {
                    GameCanvas.cfr_renamed_1(n2, ((fs)object).soLuong, ((fs)object).var_int_if - 25, aa_0.cfr_renamed_0((short)gk_02.var_short_for).var_javax_microedition_lcdui_Image_do, -1);
                }
            }
        }
    }

    public static void (int n, int n2, es es2, hs hs2 == null) {
        if (dR.boolean_int(fh.var_int_char, 25) && dR.boolean_int(n, n2)) {
            int n3;
            int n4;
            String string = "";
            if (dR.boolean_int(n2 - n)) {
                string = string + "+";
            }
            if ((es2 != null)) {
                n4 = es2.var_int_new * fh.var_int_int + fh.var_int_int / 2;
                n3 = es2.soLuong * fh.var_int_int - fh.var_int_int / 2;
                if (" ".length() <= 0) {
                    return;
                }
            } else {
                n4 = hs2.coKichHoat;
                n3 = hs2.cfr_renamed_3 - 30;
            }
            GameCanvas.cfr_renamed_1(string + (n2 - n), n4, n3, 0, -1);
        }
    }

    static void (dR dR2, byte by2, int n == null) {
        dR2.cfr_renamed_1(by2, n);
    }

    public static void (byte by2 != String string) {
        GameCanvas.cfr_renamed_1(string, new hf(by2));
    }

    public static void void_if(int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, fh.var_java_util_Vector_char.size())) {
            fd_0 fd_02 = (fd_0)fh.var_java_util_Vector_char.elementAt(n2);
            if (dR.boolean_try(fd_02.cfr_renamed_0, 8) && dR.boolean_try(fd_02.cfr_renamed_8, n)) {
                fh.var_java_util_Vector_char.removeElement(fd_02);
                return;
            }
            ++n2;
            if (((139 + 24 - 149 + 161 ^ 66 + 73 - 57 + 52) & (135 + 116 - 119 + 25 ^ 19 + 71 - 89 + 179 ^ -" ".length())) == 0) continue;
            return;
        }
    }

    public static void cfr_renamed_3() {
        if (dR.boolean_try(AngelChip.duLieuNguoiChoi.var_short_goto, var_int_goto)) {
            String string;
            Vector<fl_0> vector = new Vector<fl_0>();
            if (dR.boolean_int(dR.var_e_0_do.cfr_renamed_3)) {
                vector.addElement(new hq(MenuChinhAvatar.K + "(" + dR.var_e_0_do.cfr_renamed_3 + ")"));
            }
            if (dR.boolean_int(dR.var_e_0_do.soLuong)) {
                string = MenuChinhAvatar.cd;
                if (-"  ".length() > 0) {
                    return;
                }
            } else {
                string = MenuChinhAvatar.k;
            }
            vector.addElement(new hh(string));
            vector.addElement(new ho(MenuChinhAvatar.bD));
            (vector == null);
        }
    }

    private int int_do(int n, int n2) {
        int n3 = 0;
        while (dR.boolean_for(n3, this.var_fs_arr_do.length)) {
            int n4 = 0;
            while (dR.boolean_for(n4, cfr_renamed_17)) {
                int n5 = this.var_fs_arr_do[n3].soLuong + n4 / cfr_renamed_14;
                int n6 = this.var_fs_arr_do[n3].var_int_if + n4 % cfr_renamed_14;
                if (dR.boolean_try(n, n5) && dR.boolean_try(n2, n6)) {
                    return n3 * cfr_renamed_17 + n4;
                }
                ++n4;
                if ("   ".length() != (113 + 140 - 114 + 23 ^ 48 + 63 - 28 + 83)) continue;
                return (0x11 ^ 8 ^ (0xEF ^ 0xBE)) & (0x24 ^ 0x18 ^ (0x3F ^ 0x4B) ^ -" ".length());
            }
            ++n3;
            if ((149 + 148 - 174 + 36 ^ 31 + 85 - 54 + 93) >= 0) continue;
            return (0x44 ^ 0x38 ^ (0x3D ^ 7)) & (217 + 53 - 182 + 141 ^ 51 + 37 - 84 + 159 ^ -" ".length());
        }
        return -1;
    }

    private static boolean boolean_for(int n, int n2) {
        return n < n2;
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                this.cfr_renamed_1(1, var_int_case);
                return;
            }
            case 2: {
                if (!(fh.var_bm_do != null)) break;
                GameCanvas.cfr_renamed_7();
                et_0.et_0_do().cfr_renamed_7(var_int_goto, ((dd_0)fh.var_bm_do).cfr_renamed_9);
                return;
            }
            case 3: {
                if (!(fh.var_bm_do != null)) break;
                gk_0 gk_02 = bz.gk_0_do((int)dR.hs_do((int)((dd_0)fh.var_bm_do).cfr_renamed_9).cfr_renamed_9);
                int n3 = 0;
                while (dR.boolean_for(n3, var_java_util_Vector_try.size())) {
                    if (dR.boolean_try(n2, n3)) {
                        int n4;
                        ee_0 ee_02 = (ee_0)var_java_util_Vector_try.elementAt(n3);
                        if (dR.boolean_try(gk_02.var_byte_if, 1)) {
                            n4 = 0;
                            if (((0x6F ^ 0x54 ^ (0x4F ^ 0x31)) & (203 + 229 - 266 + 76 ^ 112 + 116 - 136 + 91 ^ -" ".length()) & ((0xE9 ^ 0x8C ^ (0x4F ^ 0x2E)) & (58 + 61 - 107 + 165 ^ 73 + 53 - -36 + 19 ^ -" ".length()) ^ -" ".length())) != 0) {
                                return;
                            }
                        } else {
                            n4 = 1;
                        }
                        (ee_02 != n4);
                    }
                    ++n3;
                    if ((0xAF ^ 0x84 ^ (0x5C ^ 0x73)) > 0) continue;
                    return;
                }
                return;
            }
            case 4: {
                if (!(fh.var_bm_do != null)) break;
                n = 0;
                while (dR.boolean_for(n, var_java_util_Vector_try.size())) {
                    if (dR.boolean_try(n2, n)) {
                        ee_0 ee_03 = (ee_0)var_java_util_Vector_try.elementAt(n);
                        dg_0 dg_02 = dR.dg_0_do(ee_03.var_short_if);
                        this.cfr_renamed_1(dg_02, ee_03.var_short_if, (hs)fh.var_bm_do);
                    }
                    ++n;
                    return;
                }
                return;
            }
            case 5: {
                n = 0;
                while (dR.boolean_for(n, var_java_util_Vector_char.size())) {
                    if (dR.boolean_try(n, n2)) {
                        int n5 = this.int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
                        if (dR.boolean_do(n5, var_java_util_Vector_int.size())) {
                            return;
                        }
                        dR.cfr_renamed_8(n, n5);
                    }
                    ++n;
                    if (((0xA7 ^ 0xAF) & ~(0x4D ^ 0x45)) == ((9 ^ 0x39) & ~(0x69 ^ 0x59))) continue;
                    return;
                }
                return;
            }
            case 6: {
                n = 0;
                while (dR.boolean_for(n, var_java_util_Vector_try.size())) {
                    if (dR.boolean_try(n, n2)) {
                        ee_0 ee_04 = (ee_0)var_java_util_Vector_try.elementAt(n);
                        if (dR.boolean_int(ee_04.soLuong)) {
                            int n6 = this.int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
                            if (dR.boolean_for(n6, var_java_util_Vector_int.size()) && dR.boolean_new(var_java_util_Vector_try.size())) {
                                dg_0 dg_03 = dR.dg_0_do(ee_04.var_short_if);
                                byte by2 = dg_03.var_byte_if;
                                if (dR.boolean_int(by2, 7)) {
                                    if (dR.boolean_try(by2, 1)) {
                                        this.cfr_renamed_1(2, (int)dg_03.var_short_do);
                                        if ((0x7E ^ 0x7A) <= -" ".length()) {
                                            return;
                                        }
                                    } else {
                                        this.cfr_renamed_1(by2, (int)dg_03.var_short_do);
                                    }
                                }
                                et_0.et_0_do().cfr_renamed_1(var_int_goto, n6, (int)dg_03.var_short_do);
                            }
                            if ((0xC ^ 8) != (0xB6 ^ 0xB2)) {
                                return;
                            }
                        } else {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.aQ + ee_04.chuoiGiaTri);
                        }
                    }
                    ++n;
                    if ((0x22 ^ 0x27) != 0) continue;
                    return;
                }
                return;
            }
            case 7: {
                this.void_new(n2);
                return;
            }
            case 8: {
                this.void_do(5, -1);
                dR.cfr_renamed_23();
                return;
            }
            case 9: {
                this.var_boolean_case = 1;
                this.void_new(0);
                return;
            }
            case 10: {
                dangChayAuto = 1;
                n = this.cfr_renamed_24;
                while (dR.boolean_for(n, var_java_util_Vector_byte.size())) {
                    int n7;
                    hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n);
                    if (dR.boolean_new(hs2.var_boolean_arr_do[1])) {
                        fh.var_bm_do = hs2;
                        fm.fm_do().void_do(hs2.coKichHoat * dF.cfr_renamed_12, hs2.cfr_renamed_3 * dF.cfr_renamed_12);
                        fm.dangChayAuto = 1;
                        ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.aR, new dl_0(this, hs2));
                        ((en)this).cfr_renamed_5 = var_fl_0_if;
                        ((en)this).cfr_renamed_4 = var_fl_0_do;
                        n7 = 1;
                        if (((20 + 89 - -34 + 15 ^ 113 + 184 - 211 + 104) & (0xC3 ^ 0x95 ^ (0xD6 ^ 0xA0) ^ -" ".length())) > 0) {
                            return;
                        }
                    } else if (dR.boolean_new(hs2.var_boolean_arr_do[0])) {
                        fh.var_bm_do = hs2;
                        fm.fm_do().void_do(hs2.coKichHoat * dF.cfr_renamed_12, hs2.cfr_renamed_3 * dF.cfr_renamed_12);
                        fm.dangChayAuto = 1;
                        ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.aR, new cv_0(this, hs2));
                        ((en)this).cfr_renamed_5 = var_fl_0_if;
                        ((en)this).cfr_renamed_4 = var_fl_0_do;
                        n7 = 1;
                        if (((168 + 164 - 271 + 144 ^ 110 + 58 - 44 + 48) & (0x7D ^ 6 ^ (0x23 ^ 0x39) ^ -" ".length())) > "  ".length()) {
                            return;
                        }
                    } else if (dR.boolean_new(hs2.coKichHoat ? 1 : 0) && dR.boolean_for(hs2 instanceof fc) && dR.boolean_for(hs2 instanceof fg)) {
                        fh.var_bm_do = hs2;
                        fm.fm_do().void_do(hs2.coKichHoat * dF.cfr_renamed_12, hs2.cfr_renamed_3 * dF.cfr_renamed_12);
                        fm.dangChayAuto = 1;
                        ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cX, new gw_0(this, hs2));
                        ((en)this).cfr_renamed_5 = var_fl_0_if;
                        ((en)this).cfr_renamed_4 = var_fl_0_do;
                        n7 = 1;
                        if ("  ".length() <= 0) {
                            return;
                        }
                    } else if (dR.boolean_for(hs2.cfr_renamed_12, 50)) {
                        fh.var_bm_do = hs2;
                        fm.fm_do().void_do(hs2.coKichHoat * dF.cfr_renamed_12, hs2.cfr_renamed_3 * dF.cfr_renamed_12);
                        fm.dangChayAuto = 1;
                        ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.C, new cz_0(this, hs2));
                        ((en)this).cfr_renamed_5 = var_fl_0_if;
                        ((en)this).cfr_renamed_4 = var_fl_0_do;
                        n7 = 1;
                        if ("  ".length() == 0) {
                            return;
                        }
                    } else {
                        n7 = 0;
                    }
                    if (dR.boolean_new(n7)) {
                        return;
                    }
                    this.cfr_renamed_24 += 1;
                    ++n;
                    if (-(0x7A ^ 0x50 ^ (0xA5 ^ 0x8A)) < 0) continue;
                    return;
                }
                this.void_do(8, -1);
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cj);
                return;
            }
            case 11: {
                et_0.et_0_do().cfr_renamed_4(0, 0);
                return;
            }
            case 12: {
                et_0 et_02 = et_0.et_0_do();
                et_02.cfr_renamed_1(85);
                et_02.cfr_renamed_0();
                return;
            }
            case 13: {
                if (dR.boolean_int(dR.var_e_0_do.soLuong)) {
                    et_0.et_0_do().cfr_renamed_3(0);
                    return;
                }
                et_0.et_0_do().cfr_renamed_6(0);
                return;
            }
            case 14: {
                et_0 et_03 = et_0.et_0_do();
                et_03.cfr_renamed_1(87);
                et_03.cfr_renamed_0();
                return;
            }
            default: {
                return;
            }
            case 20: {
                this.void_if();
            }
        }
    }

    public static void (int n, String string, int n2, int n3, int n4 == null) {
        if (dR.boolean_try(n, var_int_goto)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_1(n2, n3, n4);
            GameCanvas.cfr_renamed_1(string);
        }
    }

    private static boolean boolean_new(int n) {
        return n != 0;
    }

    public static void (short s2 != short s3) {
        int n = 0;
        while (dR.boolean_for(n, dR.var_e_0_do.var_byte_arr_if.length)) {
            GameCanvas.void_if(0, dR.var_e_0_do.cfr_renamed_2 + dR.var_e_0_do.var_byte_arr_if[n], dR.var_e_0_do.cfr_renamed_3 - 45 + dR.var_e_0_do.var_byte_arr_do[n], dR.var_e_0_do.cfr_renamed_2);
            ++n;
            if (" ".length() >= 0) continue;
            return;
        }
        GameCanvas.void_do(s3, AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int - AngelChip.duLieuNguoiChoi.cfr_renamed_4, 10);
        dR.var_e_0_do.cfr_renamed_3 = (short)0;
        ee_0 ee_02 = dR.ee_0_do(s2);
        if ((ee_02 != null)) {
            ee_02.soLuong += s3;
            if (" ".length() >= (0xF7 ^ 0x9F ^ (0xD3 ^ 0xBF))) {
                return;
            }
        } else {
            ee_02 = new ee_0();
            new ee_0().var_short_if = s2;
            ee_02.soLuong = s3;
            var_java_util_Vector_new.addElement(ee_02);
        }
        if (dR.boolean_for(TienIchGame.var_boolean_new ? 1 : 0)) {
            GameCanvas.cfr_renamed_7();
        }
    }

    public dR() {
        byte[] byArray = new byte[5];
        byArray[0] = 33;
        byArray[1] = 34;
        byArray[2] = 35;
        byArray[3] = 36;
        byArray[4] = 37;
        this.var_byte_arr_do = byArray;
        byte[] byArray2 = new byte[5];
        byArray2[0] = 33;
        byArray2[1] = 120;
        byArray2[2] = 121;
        byArray2[3] = 122;
        byArray2[4] = 123;
        this.var_byte_arr_if = byArray2;
        this.var_java_util_Vector_else = new Vector();
        this.var_java_util_Vector_if = new Vector();
        this.var_boolean_byte = 0;
        this.var_boolean_case = 0;
        this.var_long_if = -1L;
        this.var_java_util_Vector_goto = new Vector();
        this.var_boolean_else = 0;
        this.cfr_renamed_22 = 0;
        this.var_boolean_try = 1;
        this.cfr_renamed_24 = 0;
        dR.var_java_util_Vector_arr_do[0] = new Vector();
        dR.var_java_util_Vector_arr_do[1] = new Vector();
        this.b_();
        e.void_do(MenuChinhAvatar.de);
        var_javax_microedition_lcdui_Image_for = e.javax_microedition_lcdui_Image_do("coin");
        var_cu_0_do = cu_0.cfr_renamed_1("iB", 9 * dF.cfr_renamed_12, 13 * dF.cfr_renamed_12);
        e.cfr_renamed_1();
        this.cfr_renamed_29();
        dR.cfr_renamed_8();
        var_fl_0_if = new fl_0(MenuChinhAvatar.aC, 8);
        var_fl_0_do = new fl_0(MenuChinhAvatar.cfr_renamed_43, 9);
        new fl_0(MenuChinhAvatar.cfr_renamed_43, 16, this);
        new fl_0(MenuChinhAvatar.by, 18, this);
    }

    public static void cfr_renamed_5() {
        if (!dR.boolean_int(fh.var_int_char, 24) || dR.boolean_try(fh.var_int_char, 53)) {
            GameCanvas.var_aa_do = null;
            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.bM, 54, null);
        }
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_4();
        AutoFarm.mangSoNguyen = null;
        TienIchGame.cfr_renamed_7();
    }

    private static boolean boolean_int(int n, int n2) {
        return n != n2;
    }

    private static void cfr_renamed_30() {
        Vector<eh> vector = new Vector<eh>();
        int n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_try.size())) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_try.elementAt(n);
            dg_0 dg_02 = dR.dg_0_do(ee_02.var_short_if);
            if (dR.boolean_try(dg_02.var_byte_if, 5) && (!dR.boolean_int(dg_02.var_byte_do, 4) || dR.boolean_try(dg_02.var_byte_do, 101))) {
                vector.addElement(new eh(dg_02.chuoiGiaTri, new dq_0(ee_02), dg_02));
            }
            ++n;
            if (" ".length() >= -" ".length()) continue;
            return;
        }
        (vector == null);
    }

    private static Vector java_util_Vector_if() {
        Vector<a> vector = new Vector<a>();
        int n = 0;
        while (dR.boolean_for(n, bz.var_java_util_Vector_for.size())) {
            dg_0 dg_02 = (dg_0)bz.var_java_util_Vector_for.elementAt(n);
            if (dR.boolean_new(dg_02.dangChayAuto ? 1 : 0) && (!dR.boolean_if(dg_02.soLuong) || dR.boolean_int(dg_02.var_int_if))) {
                vector.addElement(new a(MenuChinhAvatar.cT, n, dg_02, n));
            }
            ++n;
            if (" ".length() >= 0) continue;
            return null;
        }
        return vector;
    }

    public final void (int n == boolean bl) {
        this.var_boolean_try = bl;
        et_0.et_0_do().cfr_renamed_7(n);
    }

    public static void void_byte(int n, int n2) {
        Object object;
        fb_0 fb_02;
        es es2 = (es)var_java_util_Vector_int.elementAt(n);
        if (dR.boolean_int(n2)) {
            fb_02 = bz.fb_0_if(es2.cfr_renamed_6);
            if (dR.boolean_new(fb_02.dangChayAuto ? 1 : 0)) {
                GameCanvas.void_if(n2, es2.var_int_new * fh.var_int_int + 11, es2.soLuong * fh.var_int_int, fb_02.var_short_arr_if[es2.cfr_renamed_5]);
                if ((0x5B ^ 0x5E) == 0) {
                    return;
                }
            } else {
                object = bz.var_k_0_arr_do[fb_02.var_short_arr_if[es2.cfr_renamed_5]];
                GameCanvas.cfr_renamed_1(n2, es2.var_int_new * fh.var_int_int + 11, es2.soLuong * fh.var_int_int, hg.cfr_renamed_1(((k_0)object).var_short_do * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_0 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_4 * dF.cfr_renamed_12, ((k_0)object).cfr_renamed_5 * dF.cfr_renamed_12, bz.var_javax_microedition_lcdui_Image_arr_do[((k_0)object).cfr_renamed_3]), -1);
            }
        }
        if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
            es2.cfr_renamed_5 = 6;
            es2.var_byte_do = (byte)100;
            es2.dangChayAuto = 0;
            es2.coKichHoat = 0;
            if (dR.boolean_int(AutoFarm.cfr_renamed_4)) {
                AutoFarm.cfr_renamed_4 -= 1;
            }
        }
        fb_02 = bz.fb_0_if(es2.cfr_renamed_6);
        if (dR.boolean_new(fb_02.dangChayAuto ? 1 : 0)) {
            object = dR.ee_0_do(fb_02.cfr_renamed_2);
            if ((object != null)) {
                ((ee_0)object).soLuong += n2;
                return;
            }
            object = new ee_0();
            new ee_0().var_short_if = fb_02.cfr_renamed_2;
            ((ee_0)object).soLuong = n2;
            ((ee_0)object).mangSoNguyen[0] = fb_02.var_short_do;
            ((ee_0)object).chuoiGiaTri = fb_02.tenNhanVat;
            var_java_util_Vector_new.addElement(object);
            return;
        }
        object = ee_0.cfr_renamed_1(var_java_util_Vector_do, (int)fb_02.cfr_renamed_4);
        if ((object != null)) {
            ((ee_0)object).soLuong += n2;
            return;
        }
        object = new ee_0();
        new ee_0().var_short_if = fb_02.cfr_renamed_4;
        ((ee_0)object).soLuong = n2;
        ((ee_0)object).mangSoNguyen[0] = bz.fb_0_if((int)fb_02.cfr_renamed_4).var_short_do;
        ((ee_0)object).chuoiGiaTri = bz.fb_0_if((int)fb_02.cfr_renamed_4).tenNhanVat;
        var_java_util_Vector_do.addElement(object);
    }

    public static void (gk_0 gk_02 == null) {
        GameCanvas.cfr_renamed_1(gk_02.mangSoNguyen[0], gk_02.mangSoNguyen[1], new dc_0(gk_02), new ht(gk_02), null);
    }

    static void (dR dR2 == null) {
        dR2.cfr_renamed_10();
    }

    public static void cfr_renamed_8() {
        if ((var_cu_0_new == null)) {
            e.void_do(MenuChinhAvatar.de);
            var_javax_microedition_lcdui_Image_if = e.javax_microedition_lcdui_Image_do("buyLand");
            var_cu_0_new = cu_0.cfr_renamed_1("cut", 24 * dF.cfr_renamed_12, 24 * dF.cfr_renamed_12);
            var_cu_0_try = cu_0.cfr_renamed_1("vp", 16 * dF.cfr_renamed_12, 16 * dF.cfr_renamed_12);
            Image[] imageArray = new Image[2];
            var_javax_microedition_lcdui_Image_arr_do = imageArray;
            imageArray[0] = e.javax_microedition_lcdui_Image_do("w");
            dR.var_javax_microedition_lcdui_Image_arr_do[1] = e.javax_microedition_lcdui_Image_do("g");
            var_cu_0_int = cu_0.cfr_renamed_1("wg", 13 * dF.cfr_renamed_12, 9 * dF.cfr_renamed_12);
            var_cu_0_if = cu_0.cfr_renamed_1("m", 27 * dF.cfr_renamed_12, 17 * dF.cfr_renamed_12);
            var_cu_0_for = cu_0.cfr_renamed_1("tc", 13 * dF.cfr_renamed_12, 13 * dF.cfr_renamed_12);
            var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("focus");
            e.cfr_renamed_1();
        }
    }

    public final void (int n, Vector object, Vector vector, byte by2, byte by3, short s2, int n2 == null) {
        block31: {
            block32: {
                var_byte_if = by2;
                var_byte_do = by3;
                var_short_do = s2;
                soLuongKhoa = n2;
                var_int_goto = n;
                if (dR.boolean_int(n, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    DuLieuNguoiChoi ef2 = fv_0.ef_do(n);
                    if ((ef2 == null)) {
                        GameCanvas.cfr_renamed_1(MenuChinhAvatar.bl);
                        return;
                    }
                    if (dR.cfr_renamed_1((Object)ef2.tenNhanVat)) {
                        ef2.cfr_renamed_1((String)ef2.soLuong);
                    }
                    this.chuoiGiaTri = (String)ef2.soLuong;
                    this.chuoiPhu = ef2.tenNhanVat;
                    var_java_util_Vector_arr_do[0].removeAllElements();
                    var_java_util_Vector_arr_do[1].removeAllElements();
                    } else {
                    this.chuoiPhu = AngelChip.duLieuNguoiChoi.tenNhanVat;
                    this.chuoiGiaTri = (String)AngelChip.duLieuNguoiChoi.soLuong;
                }
                var_java_util_Vector_int = object;
                if (dR.boolean_int(fh.var_int_char, 24) && dR.boolean_int(fh.var_int_char, 53) && dR.boolean_for(var_java_util_Vector_byte.size())) {
                    var_java_util_Vector_byte = vector;
                }
                dR.void_for();
                if (!dR.boolean_new(this.var_boolean_try ? 1 : 0)) break block31;
                if (dR.boolean_for(var_boolean_int ? 1 : 0) && (!dR.boolean_int(fh.var_int_char, 24) || !dR.boolean_int(fh.var_int_char, 53))) break block32;
                var_boolean_int = 0;
                var_fs_if = new fs();
                var_byte_char = (byte)-1;
                this.cfr_renamed_29 = 0;
                fg.var_short_do = (short)-1;
                fc.var_short_do = (short)-1;
                this.var_fs_arr_do = new fs[4];
                GameCanvas.var_fh_do.void_do(25);
                GameCanvas.var_int_byte = 0;
                try {
                    var_int_byte = fd.soLuong;
                    var_int_char = fg.cfr_renamed_8 + 1;
                    int n3 = dR.var_fs_for.soLuong / 24 + 2;
                    InputStream inputStream = fh.java_io_InputStream_do(25);
                    fh.var_short_arr_if = new short[inputStream.available()];
                    int n4 = 0;
                    while (dR.boolean_for(n4, fh.var_short_arr_if.length)) {
                        fh.var_short_arr_if[n4] = (short)inputStream.read();
                        ++n4;
                        if ("   ".length() > ((0x54 ^ 0x1C) & ~(0x6C ^ 0x24))) continue;
                        return;
                    }
                    object = new short[fh.var_short_arr_if.length + fh.var_short_do];
                    n = 0;
                    n2 = 0;
                    while (dR.boolean_for(n2, fh.var_short_arr_if.length)) {
                        object[n] = fh.var_short_arr_if[n2];
                        ++n;
                        if (dR.boolean_try(n2 % fh.var_short_if, n3)) {
                            int n5 = 0;
                            while (dR.boolean_if(n5)) {
                                object[n] = fh.var_short_arr_if[n2];
                                ++n;
                                ++n5;
                                if ("   ".length() > 0) continue;
                                return;
                            }
                        }
                        ++n2;
                        if ("   ".length() != 0) continue;
                        return;
                    }
                    fh.var_short_if = (short)(fh.var_short_if + 1);
                    fh.var_short_arr_if = (short[])object;
                    fh.var_java_util_Vector_char.removeAllElements();
                    fh.cfr_renamed_1(null, fh.var_int_char + 1, 1);
                    AngelChip.duLieuNguoiChoi.var_short_for = (short)(AngelChip.duLieuNguoiChoi.var_short_for + 24);
                    fh.cfr_renamed_1(849, dR.var_fs_do.soLuong + 12 + hg.int_new(var_int_byte - 2) * 24, dR.var_fs_do.var_int_if + 12 + hg.int_new(3) * 24);
                    }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                var_java_util_Vector_for = new Vector();
                var_java_util_Vector_case = new Vector();
                (1, gt_0.var_fs_do, 87, -8, var_java_util_Vector_for == null);
                (2, fg.var_fs_do, 86, -7, var_java_util_Vector_case == null);
                n = var_java_util_Vector_byte.size();
                int n6 = 0;
                while (dR.boolean_for(n6, n)) {
                    hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n6);
                    if (dR.boolean_new(hs2 instanceof fd)) {
                        ((fd)hs2).cfr_renamed_6();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                    } else if (dR.boolean_new(hs2 instanceof gt_0)) {
                        ((gt_0)hs2).cfr_renamed_6();
                        if ("   ".length() <= -" ".length()) {
                            return;
                        }
                    } else if (dR.boolean_new(hs2 instanceof fc)) {
                        ((fc)hs2).cfr_renamed_6();
                        if (-" ".length() >= ((0xC9 ^ 0x8A) & ~(0xD5 ^ 0x96))) {
                            return;
                        }
                    } else if (dR.boolean_new(hs2 instanceof fg)) {
                        ((fg)hs2).cfr_renamed_6();
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        hs2.cfr_renamed_6();
                    }
                    fh.var_java_util_Vector_case.addElement(hs2);
                    ++n6;
                    if ("  ".length() >= 0) continue;
                    return;
                }
                GameCanvas.var_int_byte = 1;
                GameCanvas.cfr_renamed_7();
            }
            n = 0;
            while (dR.boolean_for(n, fh.var_java_util_Vector_char.size())) {
                fd_0 fd_02 = (fd_0)fh.var_java_util_Vector_char.elementAt(n);
                if (dR.boolean_for(fd_02.cfr_renamed_8, 800) && !dR.boolean_for(fd_02.cfr_renamed_8, 100) || !dR.boolean_int(fd_02.cfr_renamed_8, -3) || dR.boolean_new(fd_02 instanceof es)) {
                    fh.var_java_util_Vector_char.removeElement(fd_02);
                    --n;
                }
                ++n;
                return;
            }
            this.cfr_renamed_21();
            this.soXu = System.currentTimeMillis();
            this.var_long_for = System.currentTimeMillis();
            if ((GameCanvas.var_en_do != this)) {
                this.cfr_renamed_4();
            }
            if (dR.boolean_new(GameCanvas.coKichHoat ? 1 : 0)) {
                fv.cfr_renamed_4();
            }
            AngelChip.duLieuNguoiChoi.var_short_char = AngelChip.duLieuNguoiChoi.var_short_for;
            AngelChip.duLieuNguoiChoi.var_short_try = (short)(AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
        }
        this.var_boolean_try = 1;
        if (dR.boolean_int(var_int_new, -1)) {
            int n7 = var_int_new;
            AngelChip.duLieuNguoiChoi.var_short_char = (short)n7;
            AngelChip.duLieuNguoiChoi.var_short_for = (short)n7;
            int n8 = soLuong;
            AngelChip.duLieuNguoiChoi.var_short_try = (short)n8;
            AngelChip.duLieuNguoiChoi.var_boolean_int = n8;
            var_int_new = -1;
            soLuong = -1;
        }
        ((en)this).cfr_renamed_5 = var_fl_0_char;
        ((en)this).cfr_renamed_4 = null;
        ((en)this).cfr_renamed_3 = null;
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_long, 1, this);
                return;
            }
            case 1: {
                et_0.et_0_do().cfr_renamed_2(-1);
                fo.fo_do().void_if();
                return;
            }
            case 2: {
                fo.fo_do().void_if();
                if (dR.boolean_for(soLuongKhoa)) {
                    et_0 et_02 = et_0.et_0_do();
                    et_02.cfr_renamed_1(92);
                    et_02.cfr_renamed_0();
                    return;
                }
                et_0.et_0_do().cfr_renamed_5(0);
                return;
            }
            case 3: {
                et_0.et_0_do().cfr_renamed_3(1, 0);
                return;
            }
            case 4: {
                et_0.et_0_do().cfr_renamed_3(1, 1);
                return;
            }
            case 5: {
                et_0.et_0_do().cfr_renamed_8(1, 0);
                return;
            }
            case 6: {
                et_0.et_0_do().cfr_renamed_8(1, 1);
                return;
            }
            case 7: {
                et_0.et_0_do().cfr_renamed_6(1);
                return;
            }
            case 8: {
                et_0.et_0_do().cfr_renamed_3(1);
                return;
            }
            case 9: {
                et_0.et_0_do().cfr_renamed_4(1, 1);
                return;
            }
            case 10: {
                et_0.et_0_do().cfr_renamed_4(1, 2);
                return;
            }
            case 11: {
                et_0.et_0_do().cfr_renamed_5(1);
                return;
            }
            case 12: {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.QuanLyRMS, new gY());
                return;
            }
            case 13: {
                et_0.et_0_do().cfr_renamed_0(1, 1);
                return;
            }
            case 14: {
                et_0.et_0_do().cfr_renamed_0(1, 2);
                return;
            }
            case 15: {
                fv_0.cfr_renamed_1().cfr_renamed_0(1);
                return;
            }
            case 16: {
                et_0.et_0_do().cfr_renamed_4();
                return;
            }
            case 17: {
                et_0 et_03 = et_0.et_0_do();
                et_03.cfr_renamed_1(95);
                et_03.cfr_renamed_0();
                return;
            }
            case 18: {
                dR.dR_do().cfr_renamed_14();
                return;
            }
            case 19: {
                et_0 et_04 = et_0.et_0_do();
                et_04.cfr_renamed_1(98);
                et_04.cfr_renamed_0();
                return;
            }
            case 20: {
                ((en)this).cfr_renamed_5 = null;
                return;
            }
            case 21: {
                dR.dR_do().this();
                return;
            }
            case 22: {
                dR.dR_do();
                dR.cfr_renamed_12();
                return;
            }
            case 23: {
                dR.dR_do();
                dR.cfr_renamed_9();
            }
        }
    }

    public static hs hs_do(int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n2);
            if (dR.boolean_try(hs2.cfr_renamed_9, n)) {
                return hs2;
            }
            ++n2;
            if ("   ".length() != " ".length()) continue;
            return null;
        }
        return null;
    }

    private void cfr_renamed_16() {
        if (dR.boolean_try(AngelChip.duLieuNguoiChoi.var_short_goto, var_int_goto)) {
            int n = this.int_do(dR.var_fs_if.soLuong, dR.var_fs_if.var_int_if);
            AngelChip.duLieuNguoiChoi.getClass();
            et_0.et_0_do().cfr_renamed_5(var_int_goto, n);
        }
    }

    private static void (hs hs2 == null) {
        et_0.et_0_do().cfr_renamed_2(var_int_goto, hs2.cfr_renamed_9);
    }

            private void (es es2 != int n) {
        if (dR.boolean_try(es2.var_byte_for, 2)) {
            es2.var_byte_int = this.var_byte_arr_if[n];
            return;
        }
        es2.var_byte_int = this.var_byte_arr_do[n];
    }

    private static void (int n, fs fs2, byte by2, int n2, Vector vector == null) {
        int n3 = 0;
        int n4 = 0;
        while (dR.boolean_for(n4, var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)var_java_util_Vector_byte.elementAt(n4);
            gk_0 gk_02 = bz.gk_0_do((int)hs2.cfr_renamed_9);
            if (dR.boolean_try(gk_02.var_byte_if, n) && dR.boolean_int(gk_02.var_short_for, -1)) {
                int n5 = 0;
                int n6 = 0;
                while (dR.boolean_for(n6, vector.size())) {
                    if (dR.boolean_try(((fs)vector.elementAt((int)n6)).cfr_renamed_2, hs2.cfr_renamed_9)) {
                        n5 = 1;
                        if ((0x1B ^ 0x1E) > 0) break;
                        return;
                    }
                    ++n6;
                    if ("   ".length() > -" ".length()) continue;
                    return;
                }
                if (dR.boolean_for(n5)) {
                    n6 = fs2.soLuong + n3 * 24;
                    vector.addElement(new fs(n6, fs2.var_int_if, hs2.cfr_renamed_9));
                    int n7 = fh.int_do(n6, fs2.var_int_if);
                    fh.var_short_arr_do[n7] = by2;
                    fh.cfr_renamed_1(n2, n6, fs2.var_int_if);
                    ++n3;
                }
            }
            ++n4;
            return;
        }
    }

    public static void (ee_0 ee_02, int n, int n2, int n3 == null) {
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(n, n2, n3);
        fo.var_boolean_int = 1;
        if (dR.boolean_do((int)ee_02.var_short_if, 50) && dR.boolean_new(ee_02.var_short_if, 100)) {
            var_java_util_Vector_int = null;
        }
        if (dR.boolean_int(ee_02.soLuong)) {
            if (dR.boolean_do((int)ee_02.var_short_if, 111)) {
                Object object = ee_0.cfr_renamed_1(var_java_util_Vector_try, (int)ee_02.var_short_if);
                if ((object != null)) {
                    ((ee_0)object).soLuong += ee_02.soLuong;
                    return;
                }
                object = dR.dg_0_do(ee_02.var_short_if);
                ee_02.chuoiGiaTri = ((dg_0)object).chuoiGiaTri;
                var_java_util_Vector_try.addElement(ee_02);
                return;
            }
            if (dR.boolean_new(ee_02.var_short_if, 100) && dR.boolean_for(ee_02.var_short_if, 50)) {
                ee_0 ee_03 = ee_0.cfr_renamed_1(var_java_util_Vector_char, (int)ee_02.var_short_if);
                if ((ee_03 != null)) {
                    ee_03.soLuong += ee_02.soLuong;
                    if ((0xAA ^ 0xAE) <= 0) {
                        return;
                    }
                } else {
                    var_java_util_Vector_char.addElement(ee_02);
                    ee_02.chuoiGiaTri = bz.fb_0_if((int)ee_02.var_short_if).tenNhanVat;
                }
                if (dR.boolean_for(var_java_util_Vector_char.size())) {
                    var_java_util_Vector_char.addElement(ee_02);
                }
            }
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_23() {
        Vector<fn_0> vector = new Vector<fn_0>();
        int n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_char.size())) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_char.elementAt(n);
            if ((bz.fb_0_if(ee_02.var_short_if) != null)) {
                vector.addElement(new fn_0(ee_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", n, ee_02));
            }
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        (vector == null);
    }

    private void cfr_renamed_24() {
        if (dR.boolean_int(fh.var_int_char, 25)) {
            int n;
            if (dR.boolean_try(AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, dd_0.var_byte_try)) {
                n = AngelChip.duLieuNguoiChoi.var_short_for - 23;
                if ("  ".length() < -" ".length()) {
                    return;
                }
            } else {
                n = AngelChip.duLieuNguoiChoi.var_short_for + 23;
            }
            int n2 = AngelChip.duLieuNguoiChoi.var_boolean_int / fh.var_int_int;
            short s2 = fh.var_short_arr_do[n2 * fh.var_short_if + (n /= fh.var_int_int)];
            int n3 = this.int_do(n, n2);
            if (dR.boolean_try(s2, 51) && dR.boolean_new(n3, var_java_util_Vector_int.size())) {
                dR.var_fs_if.soLuong = n;
                dR.var_fs_if.var_int_if = n2;
                if (dR.boolean_new(var_byte_char) && dR.boolean_int(var_byte_char, 1)) {
                    ((en)this).cfr_renamed_3 = var_fl_0_case;
                    return;
                }
                ((en)this).cfr_renamed_3 = null;
                return;
            }
            if (!dR.cfr_renamed_1(((en)this).cfr_renamed_3, var_fl_0_case) || dR.cfr_renamed_0(((en)this).cfr_renamed_3, var_fl_0_for)) {
                ((en)this).cfr_renamed_3 = null;
            }
            dR.var_fs_if.soLuong = -1;
            dR.var_fs_if.var_int_if = -1;
            if ((fh.var_bm_do == null)) {
                n2 = fh.int_do(AngelChip.duLieuNguoiChoi.var_short_for + 12, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
                n = fh.int_do((int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int + 12);
                if ((!dR.boolean_try(fh.var_short_arr_if[n2], 100) || dR.boolean_new(AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0)) && dR.boolean_int(fh.var_short_arr_if[n], 14)) {
                    ((en)this).cfr_renamed_3 = null;
                    n = 0;
                    if ("   ".length() <= "  ".length()) {
                        return;
                    }
                } else {
                    ((en)this).cfr_renamed_3 = var_fl_0_for;
                    n = 1;
                }
                if (dR.boolean_new(n)) {
                    return;
                }
            }
            if ((fh.var_bm_do != null) && dR.cfr_renamed_1(((en)this).cfr_renamed_3)) {
                if (dR.cfr_renamed_1(((en)this).cfr_renamed_4)) {
                    ((en)this).cfr_renamed_4 = fh.var_fl_0_do;
                }
                ((en)this).cfr_renamed_3 = var_fl_0_byte;
            }
            if ((fh.var_bm_do == null)) {
                ((en)this).cfr_renamed_4 = null;
            }
            if ((fh.var_bm_do == null) && dR.cfr_renamed_0(((en)this).cfr_renamed_3, var_fl_0_byte)) {
                ((en)this).cfr_renamed_3 = null;
            }
        }
    }

    static void cfr_renamed_7(int n, int n2) {
        dR.cfr_renamed_8(n, n2);
    }

    private void (dg_0 dg_02, short s2, hs hs2 == null) {
        this.cfr_renamed_1(new fc_0(this, dg_02, s2, hs2));
    }

    public static boolean (short s2 != int n) {
        if (dR.cfr_renamed_1((Object)ee_0.cfr_renamed_1(var_java_util_Vector_try, (int)s2))) {
            return 0;
        }
        et_0.et_0_do().cfr_renamed_1(var_int_goto, n, (int)s2);
        return 0;
    }

    public final void void_if() {
        GameCanvas.cfr_renamed_8();
        ft_0.ft_0_do().cfr_renamed_12(8);
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_7() {
        this.cfr_renamed_23 += 2;
        if (dR.boolean_do(this.cfr_renamed_23, 10)) {
            this.cfr_renamed_23 = 0;
        }
        if (dR.boolean_int(dR.var_byte_char, -1)) {
            dR.var_byte_for = dR.var_byte_arr_arr_do[dR.var_byte_char][this.cfr_renamed_23];
            this.cfr_renamed_29 += 1;
            if (dR.boolean_if(this.cfr_renamed_29, 10)) {
                this.cfr_renamed_29 = 0;
                this.cfr_renamed_17();
            }
        }
        if (dR.boolean_try(fh.var_int_char, 24) && dR.boolean_try(fh.var_int_char, 53) && dR.boolean_int(dR.cfr_renamed_1((System.currentTimeMillis() - this.soXu) / 1000L, 300L))) {
            this.soXu = System.currentTimeMillis();
            this.cfr_renamed_0(dR.var_int_goto, 1);
        }
        GameCanvas.var_fh_do.cfr_renamed_2();
        if (dR.boolean_for((int)dR.dangChayAuto) && dR.boolean_for((int)dR.coKichHoat) && dR.boolean_try(dR.var_int_if, -1)) {
            this.cfr_renamed_24();
        }
        if (!dR.boolean_int(dR.var_byte_char, -1) || !dR.boolean_for((this.var_long_if != -1L)) || !dR.boolean_for(AngelChip.duLieuNguoiChoi.var_short_for)) ** GOTO lbl56
        this.var_long_if = System.currentTimeMillis() / 100L;
        var1_1 = -1;
        if ((this.var_fs_new != null)) {
            var1_1 = this.int_do(this.var_fs_new.soLuong, this.var_fs_new.var_int_if);
        }
        if (dR.boolean_try(dR.var_byte_char, 4)) {
            var1_1 = 0;
        }
        if (dR.boolean_for(this.var_fs_new.soLuong * fh.var_int_int, AngelChip.duLieuNguoiChoi.var_short_for)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = dd_0.var_byte_try;
            } else {
            AngelChip.duLieuNguoiChoi.cfr_renamed_4 = 0;
        }
        AngelChip.duLieuNguoiChoi.var_byte_long = (byte)AngelChip.duLieuNguoiChoi.cfr_renamed_4;
        if ((this.var_hs_do != null)) {
            this.var_hs_do.cfr_renamed_3 = 0;
            this.var_hs_do = null;
        }
        if (dR.boolean_try(var1_1, -1)) {
            this.cfr_renamed_17();
            } else {
            var1_2 = new fd_0(-2, AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int - 5, dR.var_cu_0_new.soLuong);
            fh.var_java_util_Vector_char.addElement(var1_2);
            var2_6 = 0;
            if (dR.boolean_for(dR.var_byte_char)) {
                var2_6 = 5;
                var1_2.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.var_boolean_int - 8;
            }
            if (dR.boolean_for((int)AngelChip.duLieuNguoiChoi.cfr_renamed_4)) {
                var1_2.cfr_renamed_2 = AngelChip.duLieuNguoiChoi.var_short_for + 10 + var2_6;
                if (-" ".length() != -" ".length()) {
                    return;
                }
            } else {
                var1_2.cfr_renamed_2 = AngelChip.duLieuNguoiChoi.var_short_for - 10 - var2_6;
            }
lbl56:
            // 3 sources

            if (dR.boolean_new((this.var_long_if != -1L)) && (!dR.boolean_int(dR.var_byte_char, 1) || !dR.boolean_new(dR.var_byte_char) || dR.boolean_try(dR.var_byte_char, 2)) && dR.boolean_int((System.currentTimeMillis() / 100L - this.var_long_if != 2L))) {
                this.var_long_if = System.currentTimeMillis() / 100L;
                if (dR.boolean_try(AngelChip.duLieuNguoiChoi.var_short_for, 6)) {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(6);
                }
            }
        }
        if ((!dR.boolean_int(fh.var_int_char, 24) || dR.boolean_try(fh.var_int_char, 53)) && dR.boolean_int(dR.var_java_util_Vector_byte.size()) && dR.boolean_if(dR.cfr_renamed_26 += 1, 250)) {
            dR.cfr_renamed_26 = 0;
            var1_3 = hg.int_new(dR.var_java_util_Vector_byte.size());
            var1_4 = (hs)dR.var_java_util_Vector_byte.elementAt(var1_3);
            var2_7 = "";
            if (dR.boolean_new(var1_4.var_boolean_arr_do[0])) {
                var2_7 = var2_7 + MenuChinhAvatar.ax;
            }
            if (dR.boolean_new(var1_4.var_boolean_arr_do[1])) {
                if (dR.boolean_for((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.cfr_renamed_42;
            }
            if (dR.boolean_new((int)var1_4.coKichHoat)) {
                if (dR.boolean_for((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.e;
            }
            if (dR.boolean_for(var1_4.cfr_renamed_12, 20)) {
                if (dR.boolean_for((int)var2_7.equals(""))) {
                    var2_7 = var2_7 + ", ";
                }
                var2_7 = var2_7 + MenuChinhAvatar.bU;
            }
            if (dR.boolean_for((int)var2_7.equals(""))) {
                var1_4.var_boolean_arr_do = (boolean[])new cU(25, var2_7, 0);
                var1_4.var_boolean_arr_do.void_do((int)var1_4.coKichHoat, var1_4.cfr_renamed_3 - 45);
            }
        }
        if (dR.boolean_do((System.currentTimeMillis() / 1000L - this.var_long_for / 1000L != 1L))) {
            if (dR.boolean_int(dR.soLuongKhoa)) {
                dR.soLuongKhoa -= 1;
            }
            this.var_long_for = System.currentTimeMillis();
            var1_5 = 0;
            while (dR.boolean_for(var1_5, dR.var_java_util_Vector_int.size())) {
                var2_8 = (es)dR.var_java_util_Vector_int.elementAt(var1_5);
                if (dR.boolean_int(var2_8.cfr_renamed_6, -1) && dR.boolean_for(var2_8.cfr_renamed_5, 5)) {
                    ++var2_8.soXu;
                    if (dR.boolean_if(dR.cfr_renamed_1((long)(bz.fb_0_if((int)var2_8.cfr_renamed_6).cfr_renamed_5 * 60 * 60) - var2_8.soXu, 0L))) {
                        var2_8.cfr_renamed_5 = 5;
                    }
                }
                ++var1_5;
                if (((37 ^ 118 ^ (242 ^ 148)) & (148 ^ 181 ^ (51 ^ 39) ^ -" ".length())) == 0) continue;
                return;
            }
        }
    }

    public static void cfr_renamed_13() {
        fv_0.cfr_renamed_1().cfr_renamed_0(1);
    }

    private static boolean boolean_new(int n, int n2) {
        return n <= n2;
    }

    private void cfr_renamed_22() {
        if (dR.boolean_new(dangChayAuto ? 1 : 0)) {
            this.void_if(10, -1);
            return;
        }
        if (dR.boolean_int(this.var_java_util_Vector_else.size())) {
            de de2 = (de)this.var_java_util_Vector_else.elementAt(0);
            de2.void_do();
            this.var_java_util_Vector_else.removeElement(de2);
            return;
        }
        if (dR.boolean_new(this.var_boolean_case ? 1 : 0)) {
            this.cfr_renamed_10();
        }
    }

    public static void cfr_renamed_9() {
        Object object;
        if (dR.boolean_int(AngelChip.duLieuNguoiChoi.var_short_goto, var_int_goto)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.L);
            return;
        }
        Vector<Object> vector = new Vector<Object>();
        int n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_char.size())) {
            object = (ee_0)var_java_util_Vector_char.elementAt(n);
            if (dR.cfr_renamed_0(bz.fb_0_if(((ee_0)object).var_short_if))) {
                object = new f_0("", n, (ee_0)object, n);
                vector.addElement(object);
            }
            ++n;
            if ("  ".length() > " ".length()) continue;
            return;
        }
        n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_try.size())) {
            object = new do_0("", n, n);
            vector.addElement(object);
            ++n;
            if ((0x61 ^ 0x40 ^ (0x2E ^ 0xB)) >= -" ".length()) continue;
            return;
        }
        fo.fo_do().cfr_renamed_4();
        String[] stringArray = new String[2];
        stringArray[0] = MenuChinhAvatar.cD;
        stringArray[1] = MenuChinhAvatar.dp;
        Vector[] vectorArray = new Vector[2];
        vectorArray[0] = dR.java_util_Vector_for();
        vectorArray[1] = vector;
        fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
        int n2 = 0;
        while (dR.boolean_for(n2, var_java_util_Vector_do.size())) {
            var_java_util_Vector_do.elementAt(n2);
            ++n2;
            if ((0x1B ^ 0x1F) > -" ".length()) continue;
            return;
        }
    }

    public static void (byte by2 == null) {
        Vector<eh> vector = new Vector<eh>();
        int n = 0;
        while (dR.boolean_for(n, var_java_util_Vector_try.size())) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_try.elementAt(n);
            dg_0 dg_02 = dR.dg_0_do(ee_02.var_short_if);
            if ((!dR.boolean_int(dg_02.var_byte_do, by2) || dR.boolean_try(dg_02.var_byte_do, 101)) && dR.boolean_try(dg_02.var_byte_if, 5)) {
                vector.addElement(new eh(dg_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", new hu(by2, ee_02), dg_02));
            }
            ++n;
            if (((0x10 ^ 0x4B ^ (0x31 ^ 0x2C)) & (0x1A ^ 0x5D ^ " ".length() ^ -" ".length())) <= (0x1D ^ 0x32 ^ (0x55 ^ 0x7E))) continue;
            return;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, GameCanvas.cfr_renamed_15, fh.var_int_int * dF.cfr_renamed_12, fh.var_int_int * dF.cfr_renamed_12);
    }

    public final void cfr_renamed_14() {
        fg.var_short_do = (short)-1;
        fc.var_short_do = (short)-1;
        ((en)this).cfr_renamed_4 = null;
        fn.fn_do().cfr_renamed_3(25, 0);
    }

    private void cfr_renamed_17() {
        int n;
        block16: {
            n = 0;
            while (dR.boolean_for(n, fh.var_java_util_Vector_char.size())) {
                if (dR.boolean_try(((fd_0)fh.var_java_util_Vector_char.elementAt((int)n)).cfr_renamed_8, -2)) {
                    fh.var_java_util_Vector_char.removeElementAt(n);
                    if (dR.boolean_int(n)) {
                        --n;
                    }
                }
                ++n;
                if (((0x57 ^ 0x53 ^ (0x72 ^ 0x25)) & (77 + 123 - -37 + 15 ^ 31 + 118 - 147 + 173 ^ -" ".length())) <= " ".length()) continue;
                return;
            }
            this.var_long_if = -1L;
            n = -1;
            if ((this.var_fs_new != null)) {
                int n2 = this.var_fs_new.var_int_if;
                n = this.var_fs_new.soLuong;
                int n3 = var_java_util_Vector_int.size();
                int n4 = 0;
                do {
                    if (dR.boolean_do(n4, n3)) {
                        n = -1;
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                        break block16;
                    }
                    es es2 = (es)var_java_util_Vector_int.elementAt(n4);
                    if (dR.boolean_try(es2.var_int_new, n) && dR.boolean_try(es2.soLuong, n2)) {
                        n = n4;
                        if (((0xDB ^ 0xC7 ^ (0x85 ^ 0xBD)) & (0xCF ^ 0x84 ^ (0x79 ^ 0x16) ^ -" ".length())) != 0) {
                            return;
                        }
                        break block16;
                    }
                    ++n4;
                    } while (-"  ".length() < 0);
                return;
            }
        }
        if (dR.boolean_try(n, -1)) {
            var_byte_char = (byte)-1;
            AngelChip.duLieuNguoiChoi.var_short_for = (short)0;
            AngelChip.duLieuNguoiChoi.var_int_class = 0;
            this.cfr_renamed_22();
            return;
        }
        if (dR.boolean_try(var_int_case, -1)) {
            es es3 = (es)var_java_util_Vector_int.elementAt(n);
            switch (var_byte_char) {
                case 0: {
                    this.cfr_renamed_1(es3, 1);
                    es3.cfr_renamed_5 = 0;
                    fh.var_short_arr_if[es3.soLuong * fh.var_short_if + es3.var_int_new] = es3.var_byte_int;
                    if (dR.boolean_int(es3.cfr_renamed_6, -1)) {
                        et_0.et_0_do().cfr_renamed_0(var_int_goto, n, -1);
                    }
                    es3.cfr_renamed_6 = -1;
                    if (!dR.boolean_new(GameCanvas.coKichHoat ? 1 : 0)) break;
                    fv.cfr_renamed_4();
                    if ("  ".length() != 0) break;
                    return;
                }
                case 1: {
                    this.cfr_renamed_1(es3, 4);
                    es3.coTrangThai = 0;
                    fh.var_short_arr_if[es3.soLuong * fh.var_short_if + es3.var_int_new] = es3.var_byte_int;
                    et_0.et_0_do().cfr_renamed_1(var_int_goto, n, 100);
                }
            }
        }
        var_int_case = -1;
        this.var_fs_new = null;
        var_byte_char = (byte)-1;
        AngelChip.duLieuNguoiChoi.var_int_class = 0;
        AngelChip.duLieuNguoiChoi.var_short_for = (short)0;
        this.cfr_renamed_22();
    }

    public final void this() {
        if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
            Object object;
            Vector<hi> vector = new Vector<hi>();
            int n = 0;
            while (dR.boolean_for(n, bz.var_java_util_Vector_do.size())) {
                object = (ex)bz.var_java_util_Vector_do.elementAt(n);
                vector.addElement(new hi(MenuChinhAvatar.dk, new hp((ex)object), (ex)object, n));
                ++n;
                if (" ".length() < (0x20 ^ 0x3B ^ (0x8D ^ 0x92))) continue;
                return;
            }
            Vector<Object> vector2 = new Vector<Object>();
            if (dR.boolean_int(var_short_do)) {
                String string;
                vector2.addElement(null);
                if (dR.boolean_for(soLuongKhoa)) {
                    string = MenuChinhAvatar.var_java_lang_String_short;
                    } else {
                    string = MenuChinhAvatar.cZ;
                }
                object = new hk(string, this);
                vector2.addElement(object);
            }
            fo.fo_do().cfr_renamed_4();
            fo.fo_do().coKichHoat = 1;
            if (dR.boolean_int(var_short_do)) {
                String[] stringArray = new String[2];
                stringArray[0] = MenuChinhAvatar.dk;
                stringArray[1] = MenuChinhAvatar.ch;
                Vector[] vectorArray = new Vector[2];
                vectorArray[0] = vector;
                vectorArray[1] = null;
                fo.fo_do().cfr_renamed_1(stringArray, vectorArray, vector2);
                fo.fo_do().cfr_renamed_1(new fl_0(MenuChinhAvatar.aN, 0, this), 1);
                fo.var_int_if = 1;
                fo.fo_do().cfr_renamed_13();
                fo.fo_do().cfr_renamed_8();
                return;
            }
            String[] stringArray = new String[1];
            stringArray[0] = MenuChinhAvatar.dk;
            Vector[] vectorArray = new Vector[1];
            vectorArray[0] = vector;
            fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
        }
    }

    public static ee_0 ee_0_if(int n) {
        int n2 = 0;
        while (dR.boolean_for(n2, var_java_util_Vector_do.size())) {
            ee_0 ee_02 = (ee_0)var_java_util_Vector_do.elementAt(n2);
            if (dR.boolean_try(ee_02.var_short_if, n)) {
                return ee_02;
            }
            ++n2;
            if ("   ".length() >= " ".length()) continue;
            return null;
        }
        return null;
    }

    public static void cfr_renamed_12() {
        Vector<Object> vector = new Vector<Object>();
        int n = 0;
        while (dR.boolean_for(n, bz.var_fb_0_arr_do.length)) {
            dp dp2 = new dp(MenuChinhAvatar.cT, (int)bz.var_fb_0_arr_do[n].cfr_renamed_4, n);
            vector.addElement(dp2);
            ++n;
            if ("   ".length() >= 0) continue;
            return;
        }
        if (dR.boolean_int(fh.var_int_char, 24) && dR.boolean_int(fh.var_int_char, 53)) {
            n = bz.var_java_util_Vector_if.size();
            int n2 = 0;
            while (dR.boolean_for(n2, n)) {
                Object object = (gk_0)bz.var_java_util_Vector_if.elementAt(n2);
                object = new dj(MenuChinhAvatar.cT, n2, (gk_0)object, n2);
                vector.addElement(object);
                ++n2;
                if ("  ".length() != 0) continue;
                return;
            }
        }
        fo.fo_do().cfr_renamed_4();
        String[] stringArray = new String[3];
        stringArray[0] = MenuChinhAvatar.bc;
        stringArray[1] = MenuChinhAvatar.dn;
        stringArray[2] = MenuChinhAvatar.cD;
        Vector[] vectorArray = new Vector[3];
        vectorArray[0] = vector;
        vectorArray[1] = dR.java_util_Vector_if();
        vectorArray[2] = dR.java_util_Vector_for();
        fo.fo_do().cfr_renamed_1(stringArray, vectorArray, null);
        if (dR.boolean_new(GameCanvas.coKichHoat ? 1 : 0) && dR.boolean_for(fv.coTrangThai ? 1 : 0)) {
            GameCanvas.var_fv_do = new fv();
            GameCanvas.var_fv_do.cfr_renamed_0(fo.var_fo_do);
        }
    }

    public static dR dR_do() {
        if (dR.cfr_renamed_1((Object)var_dR_do)) {
            var_dR_do = new dR();
        }
        return var_dR_do;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.cfr_renamed_15();
                return;
            }
            case 1: {
                if ((GameCanvas.var_fv_do != null) && !dR.boolean_new(fv.dangChayAuto ? 1 : 0)) break;
                aq.cfr_renamed_1().cfr_renamed_1(this.var_java_util_Vector_if, 0);
                return;
            }
            case 2: {
                dg_0 dg_02;
                ee_0 ee_02;
                dR dR2 = this;
                Vector<fl_0> vector = new Vector<fl_0>();
                hs hs2 = dR.hs_do(((dd_0)fh.var_bm_do).cfr_renamed_9);
                gk_0 gk_02 = bz.gk_0_do((int)hs2.cfr_renamed_9);
                int n3 = 0;
                while (dR.boolean_for(n3, var_java_util_Vector_try.size())) {
                    ee_02 = (ee_0)var_java_util_Vector_try.elementAt(n3);
                    dg_02 = dR.dg_0_do(ee_02.var_short_if);
                    if (dR.boolean_try(dg_02.var_byte_do, gk_02.var_byte_if) && dR.boolean_try(dg_02.var_byte_if, 5) && (!dR.boolean_int(gk_02.var_byte_if, 4) || dR.boolean_try(gk_02.var_byte_if, 1))) {
                        int n4 = ee_02.soLuong;
                        if (dR.boolean_try(gk_02.var_byte_if, 4)) {
                            n4 -= var_java_util_Vector_arr_do[1].size();
                            } else if (dR.boolean_try(gk_02.var_byte_if, 1)) {
                            n4 -= var_java_util_Vector_arr_do[0].size();
                        }
                        vector.addElement(new ci_0(dg_02.chuoiGiaTri + "(" + n4 + ")", new fi_0(ee_02, gk_02), dg_02));
                    }
                    ++n3;
                    if (-" ".length() < 0) continue;
                    return;
                }
                n3 = 0;
                while (dR.boolean_for(n3, var_java_util_Vector_try.size())) {
                    ee_02 = (ee_0)var_java_util_Vector_try.elementAt(n3);
                    dg_02 = dR.dg_0_do(ee_02.var_short_if);
                    if (!(!dR.boolean_int(dg_02.var_byte_if, 5) || !dR.boolean_new(dg_02.var_byte_do) || dR.boolean_int(dg_02.var_byte_do, gk_02.var_byte_if) && dR.boolean_int(dg_02.var_byte_do, 101) && (!dR.boolean_try(dg_02.var_byte_do, 100) || !dR.boolean_int(gk_02.var_byte_if, 4)) || dR.boolean_try(dg_02.var_byte_if, 4) && dR.boolean_for(hs2.var_boolean_arr_do[0]) && !dR.boolean_new(hs2.var_boolean_arr_do[1]) || dR.boolean_try(dg_02.var_byte_if, 6) && !dR.boolean_for(hs2.cfr_renamed_12, 100))) {
                        vector.addElement(new da(dg_02.chuoiGiaTri + "(" + ee_02.soLuong + ")", new cq(dR2, dg_02, ee_02), dg_02));
                    }
                    ++n3;
                    if (((41 + 114 - -86 + 6 ^ 137 + 67 - 87 + 64) & (57 + 83 - 103 + 178 ^ 3 + 109 - 95 + 132 ^ -" ".length())) == ((0x77 ^ 0x2F ^ (0xB0 ^ 0x8B)) & (11 + 85 - -109 + 15 ^ 7 + 57 - -26 + 101 ^ -" ".length()))) continue;
                    return;
                }
                if (dR.boolean_try(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    vector.addElement(new dg(MenuChinhAvatar.var_java_lang_String_byte));
                }
                (vector == null);
                return;
            }
            case 3: {
                dR.cfr_renamed_30();
                return;
            }
            case 4: {
                this.cfr_renamed_29();
                return;
            }
            case 5: {
                ((en)this).cfr_renamed_5 = var_fl_0_char;
                ((en)this).cfr_renamed_4 = null;
                this.var_boolean_byte = 0;
                fm.dangChayAuto = 0;
                this.var_boolean_case = 0;
                this.var_java_util_Vector_goto.removeAllElements();
                n = 0;
                while (dR.boolean_for(n, var_java_util_Vector_int.size())) {
                    ((es)dR.var_java_util_Vector_int.elementAt((int)n)).var_boolean_int = 0;
                    ++n;
                    return;
                }
                var_int_int = -1;
                var_int_if = -1;
                coKichHoat = 0;
                return;
            }
            case 6: {
                dR.cfr_renamed_23();
                return;
            }
            case 7: {
                if (dR.boolean_int(var_int_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && dR.boolean_try(fh.var_int_char, 53)) {
                    gg_0.cfr_renamed_3();
                    return;
                }
                gg_0.cfr_renamed_0();
                return;
            }
            case 8: {
                dangChayAuto = 0;
                ((en)this).cfr_renamed_4 = null;
                ((en)this).cfr_renamed_3 = null;
                ((en)this).cfr_renamed_5 = var_fl_0_char;
                this.cfr_renamed_24 = 0;
                fm.dangChayAuto = 0;
                return;
            }
            case 9: {
                this.cfr_renamed_24 += 1;
                this.void_if(10, -1);
                return;
            }
            case 51: {
                et_0.et_0_do().void_do(var_int_goto, 1);
                this.soXu = System.currentTimeMillis();
                this.cfr_renamed_0(var_int_goto, 1);
                return;
            }
            case 52: {
                et_0.et_0_do().void_do(var_int_goto, 2);
                this.soXu = System.currentTimeMillis();
                this.cfr_renamed_0(var_int_goto, 1);
                return;
            }
            case 53: {
                this.cfr_renamed_1(0, -1);
                GameCanvas.cfr_renamed_7();
                return;
            }
            case 54: {
                this.cfr_renamed_14();
            }
        }
    }

    private void void_new(int n) {
        var_int_int = 0;
        ((en)this).cfr_renamed_5 = new fl_0(MenuChinhAvatar.aC, 5);
        ((en)this).cfr_renamed_4 = null;
        fm.dangChayAuto = 1;
        ((en)this).cfr_renamed_3 = null;
        this.var_boolean_byte = 1;
        var_int_if = n;
    }

    private static boolean boolean_try(int n, int n2) {
        return n == n2;
    }

    private static Vector java_util_Vector_for() {
        Object object;
        ee_0 ee_02;
        Vector<Object> vector = new Vector<Object>();
        int n = var_java_util_Vector_do.size();
        int n2 = 0;
        while (dR.boolean_for(n2, n)) {
            ee_02 = (ee_0)var_java_util_Vector_do.elementAt(n2);
            if (!(bz.fb_0_if(ee_02.var_short_if) == null) || dR.boolean_do((int)ee_02.var_short_if, 50)) {
                object = new bv(MenuChinhAvatar.var_java_lang_String_byte, new ae_0(n2), n2, ee_02);
                vector.addElement(object);
            }
            ++n2;
            if (" ".length() <= (3 ^ 8 ^ (9 ^ 6))) continue;
            return null;
        }
        n2 = 0;
        while (dR.boolean_for(n2, var_java_util_Vector_new.size())) {
            ee_02 = (ee_0)var_java_util_Vector_new.elementAt(n2);
            object = dR.dg_0_do(ee_02.var_short_if);
            vector.addElement(new cw_0("", n2, (dg_0)object, n2, ee_02));
            ++n2;
            if ("  ".length() != -" ".length()) continue;
            return null;
        }
        return vector;
    }

    static void (dR dR2 != es es2) {
        if (dR.boolean_int(es2.cfr_renamed_6, -1) && dR.boolean_for(es2.cfr_renamed_5, 6)) {
            GameCanvas.void_do(MenuChinhAvatar.bk, 53);
            return;
        }
        dR2.cfr_renamed_1(0, -1);
        GameCanvas.cfr_renamed_7();
    }

    private boolean boolean_byte(int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (dR.boolean_for(n4, var_java_util_Vector_try.size())) {
            dg_0 dg_02 = dR.dg_0_do(((ee_0)dR.var_java_util_Vector_try.elementAt((int)n4)).var_short_if);
            if (dR.boolean_for(dg_02.var_byte_do) && dR.boolean_try(dg_02.var_byte_if, n2)) {
                this.cfr_renamed_1(new dW(this, dg_02, n));
                n3 = 1;
                if (((0xFC ^ 0xC3) & ~(0x59 ^ 0x66)) == 0) break;
                return ((0x86 ^ 0x82) & ~(0xAC ^ 0xA8)) != 0;
            }
            ++n4;
            if (-(0x58 ^ 0x5C) <= 0) continue;
            return ((0xFB ^ 0xAA) & ~(0xE6 ^ 0xB7)) != 0;
        }
        if (dR.boolean_for(n3)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bC);
        }
        return n3 != 0;
    }

    public static void (String string == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.da, 51));
        vector.addElement(new fl_0(MenuChinhAvatar.cq, 52));
        vector.addElement(GameCanvas.var_fl_0_do);
        GameCanvas.hienThongBaoPopup(string, vector);
    }

    private void cfr_renamed_29() {
        this.var_java_util_Vector_if.addElement(go_0.go_0_do().var_fl_0_for);
        fl_0 fl_02 = new fl_0(MenuChinhAvatar.cfr_renamed_34, 20);
        this.var_java_util_Vector_if.addElement(fl_02);
    }

    private static void (ee_0 ee_02 == null) {
        if (dR.boolean_for(ee_02.var_short_if, 50)) {
            ee_02.mangSoNguyen[0] = bz.fb_0_if((int)ee_02.var_short_if).var_short_do;
            ee_02.chuoiGiaTri = bz.fb_0_if((int)ee_02.var_short_if).tenNhanVat;
            return;
        }
        if (dR.boolean_for(ee_02.var_short_if, 100)) {
            ee_02.mangSoNguyen[0] = bz.gk_0_do((int)ee_02.var_short_if).cfr_renamed_3;
            if (dR.boolean_try(bz.gk_0_do((int)ee_02.var_short_if).var_byte_if, 1)) {
                ee_02.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_11 + " " + bz.gk_0_do((int)ee_02.var_short_if).tenNhanVat;
                return;
            }
            if (dR.boolean_try(bz.gk_0_do((int)ee_02.var_short_if).var_byte_if, 2)) {
                if (dR.boolean_try(ee_02.var_short_if, 55)) {
                    ee_02.chuoiGiaTri = MenuChinhAvatar.df + " " + bz.gk_0_do((int)ee_02.var_short_if).tenNhanVat;
                    return;
                }
                ee_02.chuoiGiaTri = MenuChinhAvatar.ac + " " + bz.gk_0_do((int)ee_02.var_short_if).tenNhanVat;
            }
        }
    }
}

