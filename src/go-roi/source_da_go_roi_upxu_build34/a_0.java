/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from A
 */
public abstract class a_0
extends dL
implements fj_0 {
    private static ei var_ei_byte;
    public static int soLuongKhoa;
    public static int var_int_int;
    public static Vector var_java_util_Vector_do;
    public static int cfr_renamed_5;
    public static ei var_ei_do;
    public int cfr_renamed_2 = var_int_arr_if[1];
    public static boolean coTrangThai;
    public static ei var_ei_if;
    public static long soXu;
    public static int var_int_byte;
    public static Vector var_java_util_Vector_if;
    public static a_0 var_a_0_do;
    private static cf var_cf_do;
    public static byte var_byte_if;
    public static int var_int_case;
    public static eq_0[] var_eq_0_arr_do;
    private static final int[] var_int_arr_if;
    public static boolean coKichHoat;
    public static Image var_javax_microedition_lcdui_Image_do;
    public int var_int_char = var_int_arr_if[2];
    public static int cfr_renamed_11;
    public static boolean var_boolean_int;
    private static ei var_ei_case;
    private static ei var_ei_char;
    private long var_long_for;
    public static ei var_ei_for;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    public static long var_long_if;
    public int cfr_renamed_18;
    private static Vector var_java_util_Vector_int;
    public static Vector var_java_util_Vector_for;
    private static int soLuong;
    public int cfr_renamed_10;
    public static int[] mangSoNguyen;
    public static byte var_byte_for;
    public static byte var_byte_int;

    public static void cfr_renamed_10() {
        a_0.cfr_renamed_14();
    }

        private void cfr_renamed_12() {
        if (a_0.boolean_for(coKichHoat ? 1 : 0) && a_0.boolean_if(coTrangThai ? 1 : 0) && a_0.boolean_if(var_boolean_int ? 1 : 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.N, var_int_arr_if[0], this);
            return;
        }
        this.void_if(var_int_arr_if[0]);
    }

    public void cfr_renamed_15() {
        if (a_0.boolean_for(GameCanvas.cfr_renamed_16)) {
            GameCanvas.var_gj_0_do.void_do((ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
            return;
        }
        super.cfr_renamed_15();
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_12();
    }

    public final void this() {
        if (a_0.boolean_do(soLuongKhoa, AngelChip.duLieuNguoiChoi.var_short_char)) {
            if (a_0.cfr_renamed_0(((dL)this).cfr_renamed_5, var_ei_do)) {
                ((dL)this).cfr_renamed_5 = var_ei_char;
                a_0.var_ei_char.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_35;
            }
            int n = var_int_arr_if[10];
            int n2 = var_int_arr_if[0];
            while (a_0.boolean_for(n2, var_java_util_Vector_do.size())) {
                DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n2);
                if (a_0.boolean_do((int)dd_02.var_short_char, var_int_arr_if[2])) {
                    n = var_int_arr_if[0];
                    } else if (a_0.boolean_if((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char) && a_0.boolean_if(dd_02.var_boolean_int ? 1 : 0)) {
                    n = var_int_arr_if[0];
                }
                ++n2;
                if (-(0x16 ^ 0x12) <= 0) continue;
                return;
            }
            if (a_0.boolean_for(n) && (GameCanvas.var_int_try % var_int_arr_if[1] > var_int_arr_if[27])) {
                a_0.var_ei_char.chuoiGiaTri = "";
            }
            if (a_0.boolean_for(n) && (AutoController.nhiemVuHienTai != null) && a_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoKimCuong) && a_0.boolean_int((System.currentTimeMillis() - this.var_long_for != 5000L))) {
                this.var_long_for = System.currentTimeMillis();
                AutoKimCuong.X_do().void_do(var_int_arr_if[10]);
            }
            return;
        }
        if (a_0.boolean_if(coTrangThai ? 1 : 0)) {
            ((dL)this).cfr_renamed_5 = var_ei_byte;
            a_0.var_ei_byte.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_25;
            int n = var_int_arr_if[0];
            while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
                DuLieuNguoiChoi dd_03 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
                if (a_0.boolean_do((int)dd_03.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    if (a_0.boolean_if(dd_03.var_boolean_int ? 1 : 0)) {
                        if ((GameCanvas.var_int_try % var_int_arr_if[1] > var_int_arr_if[27])) {
                            a_0.var_ei_byte.chuoiGiaTri = "";
                        }
                        if ((AutoController.nhiemVuHienTai != null) && a_0.boolean_for(AutoController.nhiemVuHienTai instanceof AutoKimCuong) && a_0.boolean_int((System.currentTimeMillis() - this.var_long_for != 5000L))) {
                            this.var_long_for = System.currentTimeMillis();
                            AutoKimCuong.X_do().void_do(var_int_arr_if[3]);
                            }
                    } else {
                        a_0.var_ei_byte.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_36;
                        if (a_0.boolean_if(cfr_renamed_5)) {
                            ((dL)this).cfr_renamed_5 = var_ei_byte;
                            if (((0xE8 ^ 0xAC) & ~(0x62 ^ 0x26)) != 0) {
                                return;
                            }
                        } else {
                            ((dL)this).cfr_renamed_5 = null;
                        }
                    }
                }
                ++n;
                if (-"   ".length() < 0) continue;
                return;
            }
        }
    }

    public void cfr_renamed_3(Graphics graphics) {
        GameCanvas.cfr_renamed_1(graphics);
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                int n2;
                dd_02.cfr_renamed_0(graphics, dd_02.coKichHoat ? 1 : 0, (int)dd_02.var_short_if);
                int n4 = dd_02.coKichHoat;
                n4 = dd_02.var_short_if - var_int_arr_if[21];
                if (a_0.boolean_if(coKichHoat ? 1 : 0) && a_0.boolean_do(ef_0.soLuongKhoa, var_int_arr_if[2])) {
                    n2 = var_int_arr_if[1] * bn_0.cfr_renamed_6;
                    if (-(0x3A ^ 0x10 ^ (0xA7 ^ 0x88)) >= 0) {
                        return;
                    }
                } else {
                    n2 = var_int_arr_if[0];
                }
                (graphics, n3, n4 - n2, dd_02 != null);
                dd_02.cfr_renamed_0(graphics, dd_02.coKichHoat ? 1 : 0, dd_02.var_short_if, var_int_arr_if[0]);
            }
            ++n;
            if ((0x3F ^ 0x57 ^ (0xD8 ^ 0xB4)) >= "   ".length()) continue;
            return;
        }
    }

    public a_0() {
        this.cfr_renamed_4();
        var_ei_case = new ei(MenuChinhAvatar.Z, var_int_arr_if[0]);
        var_ei_char = new ei(MenuChinhAvatar.cfr_renamed_35, var_int_arr_if[3]);
        var_ei_for = new ei(MenuChinhAvatar.C, var_int_arr_if[4]);
        var_ei_if = new ei(MenuChinhAvatar.av, var_int_arr_if[5]);
        var_ei_byte = new ei(MenuChinhAvatar.cfr_renamed_25, var_int_arr_if[6]);
        var_ei_do = new ei(MenuChinhAvatar.cT, var_int_arr_if[7]);
        this.var_long_for = 0L;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    public void cfr_renamed_1() {
        ek_0.ek_0_do().cfr_renamed_3();
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                dd_02.var_byte_else = (byte)var_int_arr_if[0];
                dd_02.cfr_renamed_1(var_int_arr_if[0]);
                dd_02.void_for(dd_02.var_boolean_int ? 1 : 0);
                dd_02.coKichHoat = a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n]].var_int_if;
                dd_02.var_short_else = (short)(dd_02.coKichHoat ? 1 : 0);
                dd_02.var_short_if = (short)a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n]].soLuong;
                dd_02.cfr_renamed_5 = dd_02.cfr_renamed_5;
                if (a_0.boolean_if(mangSoNguyen[n], var_int_arr_if[3]) && a_0.boolean_if(mangSoNguyen[n], var_int_arr_if[4])) {
                    dd_02.var_byte_goto = (byte)var_int_arr_if[0];
                    dd_02.coKichHoat = dd_02.coKichHoat;
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                } else {
                    dd_02.var_byte_goto = bk_0.var_byte_case;
                    dd_02.coKichHoat = dd_02.var_byte_goto;
                }
            }
            ++n;
            if ("   ".length() == "   ".length()) continue;
            return;
        }
    }

        public final void void_if(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_6 = var_int_arr_if[0];
                this.cfr_renamed_17();
                cd_0 cd_02 = cd_0.cd_0_do();
                try {
                    cd_02.cfr_renamed_4(var_int_arr_if[29]);
                    }
                catch (IOException iOException) {
                    }
                if ("   ".length() < 0) {
                    return;
                }
                cd_02.cfr_renamed_1();
                cd_0.cd_0_do().cfr_renamed_1(var_byte_for);
                if (a_0.boolean_do(var_int_case, var_int_arr_if[3])) {
                    this.cfr_renamed_0("");
                }
                a_0.cfr_renamed_11();
                GameCanvas.cfr_renamed_5();
            }
        }
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    public final void (int n != DuLieuNguoiChoi dd_02) {
        var_java_util_Vector_do.setElementAt(dd_02, n);
        this.cfr_renamed_18();
        this.cfr_renamed_1();
    }

    public void void_for() {
        if (a_0.boolean_new(cfr_renamed_5)) {
            cfr_renamed_5 -= var_int_arr_if[10];
        }
        if (a_0.boolean_if(coKichHoat ? 1 : 0)) {
            ((dL)this).cfr_renamed_4 = var_ei_case;
            ek_0.ek_0_do().void_do();
        }
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                dd_02.cfr_renamed_2();
            }
            ++n;
            return;
        }
        if ((var_cf_do != null) && a_0.boolean_for(var_cf_do.boolean_do() ? 1 : 0)) {
            var_cf_do = null;
        }
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

        public final void (String string != null) {
        ((dL)this).cfr_renamed_4 = null;
        ((dL)this).cfr_renamed_5 = null;
        GameCanvas.hienThongBaoPopup(string, var_int_arr_if[21], null);
    }

    private static void cfr_renamed_11() {
        ek_0.ek_0_do().cfr_renamed_3 = ek_0.ek_0_do().cfr_renamed_4 = (ef_0.var_short_do * ef_0.var_int_if * bn_0.cfr_renamed_6 - GameCanvas.var_int_char) / var_int_arr_if[3];
        ek_0.ek_0_do().soLuong = ek_0.ek_0_do().var_int_if = (ef_0.var_short_if * ef_0.var_int_if * bn_0.cfr_renamed_6 - GameCanvas.var_int_byte) / var_int_arr_if[3];
    }

    private static void cfr_renamed_20() {
        Vector<ei> vector = new Vector<ei>();
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char) && a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                vector.addElement(new ei(dd_02.tenNhanVat, var_int_arr_if[32], n));
            }
            ++n;
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void void_for(int n) {
        DuLieuNguoiChoi dd_02 = a_0.dd_0_do(n);
        if ((dd_02 != null)) {
            a_0.cfr_renamed_0((String)dd_02.var_short_do + MenuChinhAvatar.dd, var_int_arr_if[8], dd_02.var_short_char);
            dd_02.var_short_char = (short)var_int_arr_if[2];
            dd_02.cfr_renamed_0("");
            dd_02.void_try(var_int_arr_if[0]);
            dd_02.var_boolean_int = var_int_arr_if[0];
        }
        this.cfr_renamed_18();
        if (!a_0.boolean_if(coKichHoat ? 1 : 0) || a_0.boolean_for(coTrangThai ? 1 : 0)) {
            this.cfr_renamed_1();
        }
    }

    public static void (int n != String string) {
        DuLieuNguoiChoi dd_02 = a_0.dd_0_do(n);
        DuLieuNguoiChoi dd_03 = new DuLieuNguoiChoi();
        if ((dd_02 != null)) {
            dd_03.coKichHoat = dd_02.coKichHoat;
            dd_03.var_short_if = dd_02.var_short_if;
            dd_03.var_short_char = dd_02.var_short_char;
            if (a_0.boolean_if((int)dd_03.var_short_char, var_int_arr_if[2])) {
                if (a_0.boolean_for(coKichHoat ? 1 : 0) && a_0.boolean_if(e.var_byte_for)) {
                    dd_03.coKichHoat = GameCanvas.var_int_int;
                    if (a_0.boolean_if((int)dd_03.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                        dd_03.var_short_if = (short)var_int_arr_if[8];
                        if ("   ".length() < "  ".length()) {
                            return;
                        }
                    } else {
                        dd_03.var_short_if = (short)(GameCanvas.var_int_char - var_int_arr_if[33]);
                    }
                }
                (string, var_int_arr_if[21], dd_03.var_short_char != null);
            }
        }
    }

    protected void void_do() {
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public static void (String string, int n, int n2 != null) {
        if (a_0.boolean_do(n2, var_int_arr_if[2])) {
            if ((var_cf_do == null)) {
                var_cf_do = new cf(n, string, var_int_arr_if[0]);
                var_cf_do.void_do(GameCanvas.var_int_int, GameCanvas.var_int_long - var_int_arr_if[12]);
                return;
            }
            var_cf_do.cfr_renamed_0(n, string);
            return;
        }
        int n3 = var_int_arr_if[0];
        while (a_0.boolean_for(n3, var_java_util_Vector_do.size())) {
            bk_0 bk_02 = (bk_0)var_java_util_Vector_do.elementAt(n3);
            if (a_0.boolean_do(bk_02.cfr_renamed_12, n2)) {
                if ((bk_02.var_cf_do == null)) {
                    bk_02.var_cf_do = new cf(n, string, var_int_arr_if[0]);
                    bk_02.var_cf_do.void_do((int)bk_02.cfr_renamed_3, bk_02.cfr_renamed_1 - var_int_arr_if[34]);
                    } else {
                    bk_02.var_cf_do.cfr_renamed_0(n, string);
                }
            }
            ++n3;
            if (-" ".length() <= 0) continue;
            return;
        }
    }

    public void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                String string;
                ei ei2 = new ei(MenuChinhAvatar.bN, var_int_arr_if[10]);
                ei ei3 = new ei(MenuChinhAvatar.dp, var_int_arr_if[3]);
                int n3 = var_int_arr_if[0];
                int n4 = var_int_arr_if[0];
                while (a_0.boolean_for(n4, var_java_util_Vector_do.size())) {
                    if (a_0.boolean_if((int)((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)n4)).var_short_char, var_int_arr_if[2])) {
                        ++n3;
                    }
                    ++n4;
                    if (" ".length() != "  ".length()) continue;
                    return;
                }
                Vector<ei> vector = new Vector<ei>();
                if ((AutoController.nhiemVuHienTai != null)) {
                    vector.addElement(new ei("Tắt Auto", var_int_arr_if[5], fe_0.fe_0_do()));
                    if (-" ".length() > 0) {
                        return;
                    }
                } else {
                    vector.addElement(new ei("Auto xếp KC", var_int_arr_if[25], fe_0.fe_0_do()));
                }
                vector.addElement(new ei("Auto Farm", var_int_arr_if[15], fe_0.fe_0_do()));
                vector.addElement(new ei("Auto bán đá", var_int_arr_if[30], fe_0.fe_0_do()));
                vector.addElement(new ei("Bỏ vật phẩm", var_int_arr_if[27], fe_0.fe_0_do()));
                vector.addElement(new ei("Rương đồ", var_int_arr_if[7]));
                if (a_0.boolean_for(TienIchGame.dangChayAuto ? 1 : 0)) {
                    string = "Hiện thông tin";
                    if ("   ".length() >= (2 ^ 6)) {
                        return;
                    }
                } else {
                    string = "Tắt thông tin";
                }
                vector.addElement(new ei(string, var_int_arr_if[31], fe_0.fe_0_do()));
                if (a_0.boolean_do(soLuongKhoa, AngelChip.duLieuNguoiChoi.var_short_char) && a_0.boolean_if(coKichHoat ? 1 : 0)) {
                    vector.addElement(ei2);
                    if ((n3 > var_int_arr_if[10])) {
                        vector.addElement(ei3);
                    }
                }
                if ((n3 > var_int_arr_if[10])) {
                    vector.addElement(new ei(MenuChinhAvatar.aX, var_int_arr_if[4]));
                }
                vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_37, var_int_arr_if[5]));
                vector.addElement(new ei(MenuChinhAvatar.aT, var_int_arr_if[6]));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
                return;
            }
            case 1: {
                a_0.cfr_renamed_25();
                return;
            }
            case 2: {
                a_0.cfr_renamed_14();
                return;
            }
            case 3: {
                var_a_0_do.cfr_renamed_22();
                return;
            }
            case 4: {
                var_a_0_do.void_do();
                return;
            }
            case 5: {
                var_a_0_do.cfr_renamed_5();
                return;
            }
            case 6: {
                return;
            }
            case 50: {
                this.cfr_renamed_22();
                a_0.cfr_renamed_25();
                coKichHoat = var_int_arr_if[0];
                this.var_int_char = var_int_arr_if[2];
                cfr_renamed_11 = var_int_arr_if[0];
                return;
            }
            case 100: {
                try {
                    n = Integer.parseInt(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                    if (a_0.boolean_do(n)) {
                        return;
                    }
                    GameCanvas.cfr_renamed_8();
                    if (a_0.boolean_for(fe_0.coKichHoat ? 1 : 0) && (n > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                        e.e_do();
                        e.void_do();
                        return;
                    }
                    cd_0.cd_0_do().cfr_renamed_2(n);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 101: {
                cd_0.cd_0_do().cfr_renamed_3(GameCanvas.var_dZ_do.var_gx_do.java_lang_String_do());
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.dl);
            }
        }
    }

    private static boolean boolean_int(int n) {
        return n >= 0;
    }

    public static void cfr_renamed_16() {
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            ((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)n)).var_boolean_int = var_int_arr_if[0];
            ++n;
            return;
        }
    }

    public static void void_int(int n) {
        soLuong = n;
        a_0.cfr_renamed_16();
    }

    protected void cfr_renamed_5() {
        if (a_0.boolean_if(a_0.dd_0_do((int)AngelChip.duLieuNguoiChoi.var_short_char).var_boolean_int ? 1 : 0, var_int_arr_if[10])) {
            boolean bl;
            boolean bl2;
            if (a_0.boolean_for(fe_0.coKichHoat ? 1 : 0) && (soLuong > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                e.e_do();
                e.void_do();
                return;
            }
            if (a_0.boolean_if(((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)a_0.var_byte_if)).var_boolean_int ? 1 : 0)) {
                bl2 = var_int_arr_if[10];
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                bl2 = bl = var_int_arr_if[0];
            }
            if (a_0.boolean_for(bl2 ? 1 : 0)) {
                cfr_renamed_5 = var_int_arr_if[22];
            }
            a_0.cfr_renamed_13();
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_0(bl);
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

    public final void void_do(int n) {
        ce.cfr_renamed_0().cfr_renamed_0(n, this);
        super.void_do(n);
    }

    static {
        a_0.cfr_renamed_27();
        mangSoNguyen = new int[var_int_arr_if[5]];
        var_java_util_Vector_int = new Vector();
        var_int_case = var_int_arr_if[5];
        var_java_util_Vector_if = new Vector();
        var_java_util_Vector_for = new Vector();
    }

    public final void (String string == null) {
        if (a_0.boolean_if(string.trim().equals("") ? 1 : 0)) {
            if (a_0.boolean_for(AutoController.cfr_renamed_1(string) ? 1 : 0)) {
                return;
            }
            cd_0.cd_0_do().cfr_renamed_1(string);
            a_0.cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_char, string);
        }
    }

    private static void cfr_renamed_14() {
        block12: {
            block13: {
                if (!a_0.boolean_if(coKichHoat ? 1 : 0)) break block12;
                if (a_0.boolean_for(fe_0.coKichHoat ? 1 : 0) && (soLuong > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                    e.e_do();
                    e.void_do();
                    return;
                }
                int n = var_int_arr_if[0];
                int n2 = var_int_arr_if[0];
                int n3 = var_int_arr_if[0];
                while (a_0.boolean_for(n3, var_java_util_Vector_do.size())) {
                    DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n3);
                    if (a_0.boolean_if((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char) && a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                        if (a_0.boolean_for(dd_02.var_boolean_int ? 1 : 0)) {
                            ++n;
                            if ("  ".length() <= 0) {
                                return;
                            }
                        } else {
                            ++n2;
                        }
                    }
                    ++n3;
                    if (((0x40 ^ 9) & ~(0x57 ^ 0x1E)) == 0) continue;
                    return;
                }
                if (!a_0.boolean_for(n) || !(n2 <= 0)) break block13;
                if ((var_a_0_do == bm.var_bm_do)) {
                    a_0.var_a_0_do.cfr_renamed_5 = (int)var_ei_do;
                    a_0.var_a_0_do.cfr_renamed_2 = (int)null;
                    if (((0x94 ^ 0x88 ^ (7 ^ 0x49)) & (0x15 ^ 0x2B ^ (0xFD ^ 0x91) ^ -" ".length())) != 0) {
                        return;
                    }
                } else {
                    GameCanvas.cfr_renamed_5();
                }
                dL.cfr_renamed_19();
                cd_0 cd_02 = cd_0.cd_0_do();
                try {
                    cd_02.cfr_renamed_4(var_int_arr_if[12]);
                    }
                catch (IOException iOException) {
                    }
                if ("   ".length() < 0) {
                    return;
                }
                cd_02.cfr_renamed_1();
                return;
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.bh);
        }
    }

    public static boolean (byte by2 != byte by3) {
        if (a_0.boolean_do((int)var_byte_for, (int)by2) && a_0.boolean_do((int)var_byte_int, (int)by3)) {
            return var_int_arr_if[10];
        }
        return var_int_arr_if[0];
    }

    public final void cfr_renamed_6() {
        this.cfr_renamed_18();
    }

    public static void (Graphics graphics, int n, int n2, DuLieuNguoiChoi dd_02 != null) {
        if (a_0.boolean_if(coKichHoat ? 1 : 0)) {
            if (a_0.boolean_do((int)dd_02.var_short_char, soLuongKhoa)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[var_int_arr_if[10]], n, n2, var_int_arr_if[4]);
                return;
            }
            if (a_0.boolean_for(dd_02.var_boolean_int ? 1 : 0)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[var_int_arr_if[0]], n, n2, var_int_arr_if[4]);
            }
        }
    }

    public static void cfr_renamed_4(Graphics graphics) {
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2]) && a_0.cfr_renamed_0((Object)dd_02.var_short_do)) {
                dd_02.var_short_do.cfr_renamed_0(graphics);
            }
            ++n;
            if ((0x26 ^ 0x50 ^ (0xE6 ^ 0x94)) != 0) continue;
            return;
        }
    }

    protected void cfr_renamed_17() {
        soXu = 0L;
        var_long_if = 0L;
        coKichHoat = var_int_arr_if[0];
        coTrangThai = var_int_arr_if[0];
        var_boolean_int = var_int_arr_if[0];
    }

    public static void (int n == boolean bl) {
        DuLieuNguoiChoi dd_02 = a_0.dd_0_do(n);
        if ((dd_02 != null)) {
            dd_02.var_boolean_int = bl;
        }
    }

    private static boolean boolean_for(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_new(int n) {
        return n > 0;
    }

    public static int int_do(int n) {
        int n2 = var_int_arr_if[0];
        while (a_0.boolean_for(n2, var_java_util_Vector_do.size())) {
            if (a_0.boolean_do((int)((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)n2)).var_short_char, n)) {
                return n2;
            }
            ++n2;
            if (-" ".length() < 0) continue;
            return (43 + 86 - 55 + 67 ^ 53 + 129 - 172 + 143) & (5 + 61 - 45 + 137 ^ 63 + 50 - 62 + 87 ^ -" ".length());
        }
        return var_int_arr_if[2];
    }

    public void (Graphics graphics != null) {
        if ((var_cf_do != null)) {
            var_cf_do.cfr_renamed_0(graphics);
        }
        if (a_0.boolean_for(t_0.dangChayAuto ? 1 : 0)) {
            t_0.cfr_renamed_0(graphics, (ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
            if ("  ".length() != "  ".length()) {
                return;
            }
        } else {
            super.cfr_renamed_0(graphics);
        }
        ef_0.cfr_renamed_3(graphics);
    }

    public static void cfr_renamed_13() {
        a_0.var_a_0_do.cfr_renamed_5 = (int)var_ei_do;
        a_0.var_a_0_do.cfr_renamed_2 = (int)null;
    }

    public void cfr_renamed_18() {
        int n = var_int_arr_if[0];
        int n2 = var_int_arr_if[0];
        int n3 = var_int_arr_if[0];
        while (a_0.boolean_for(n3, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n3);
            dd_02.cfr_renamed_1(var_int_arr_if[0]);
            if (a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                ++n;
                if (a_0.boolean_if((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                    n2 = n3;
                }
            }
            ++n3;
            if (" ".length() > -" ".length()) continue;
            return;
        }
        int[] nArray = new int[var_int_case];
        int n4 = var_int_arr_if[3];
        if (a_0.boolean_do(n, var_int_arr_if[3])) {
            nArray[a_0.var_byte_if] = var_int_arr_if[3];
            nArray[n2] = var_int_arr_if[0];
            } else {
            n = var_byte_if;
            while (a_0.boolean_for(n, var_byte_if + var_int_case)) {
                n2 = n;
                if ((n > var_int_case - var_int_arr_if[10])) {
                    n2 = n - var_int_case;
                }
                nArray[n2] = n4++;
                if ((n4 >= var_int_case)) {
                    n4 = var_int_arr_if[0];
                }
                ++n;
                return;
            }
        }
        mangSoNguyen = nArray;
    }

        private static void cfr_renamed_23() {
        Vector<ei> vector = new Vector<ei>();
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n);
            if (a_0.boolean_if((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char) && a_0.boolean_if((int)dd_02.var_short_char, var_int_arr_if[2])) {
                vector.addElement(new ei((String)dd_02.var_short_do, var_int_arr_if[11], n));
            }
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        if (a_0.boolean_do(vector.size(), var_int_arr_if[10])) {
            ((ei)vector.elementAt(var_int_arr_if[0])).cfr_renamed_1();
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
    }

        public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                Vector<ei> vector = new Vector<ei>();
                ei ei2 = new ei(MenuChinhAvatar.aD, var_int_arr_if[1]);
                ei ei3 = new ei(MenuChinhAvatar.cC, var_int_arr_if[23]);
                ei ei4 = new ei(MenuChinhAvatar.b, var_int_arr_if[24]);
                vector.addElement(ei2);
                if (a_0.boolean_do(ef_0.soLuong, var_int_arr_if[25])) {
                    vector.addElement(ei3);
                }
                vector.addElement(ei4);
                u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
                return;
            }
            case 2: {
                a_0.cfr_renamed_20();
                return;
            }
            case 3: {
                a_0.cfr_renamed_23();
                return;
            }
            case 4: {
                dN.cfr_renamed_0().void_do(var_a_0_do);
                return;
            }
            case 5: {
                this.cfr_renamed_12();
                return;
            }
            case 6: {
                eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
                return;
            }
            case 10: {
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.chuoiPhu, var_int_arr_if[22], var_int_arr_if[10]);
                return;
            }
            case 11: {
                a_0.cfr_renamed_24();
                return;
            }
            case 12: {
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.b, var_int_arr_if[26], var_int_arr_if[4]);
                return;
            }
            case 13: {
                if (a_0.boolean_for(n2, var_java_util_Vector_do.size())) {
                    DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n2);
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_3(dd_02);
                }
                return;
            }
            case 14: {
                if (a_0.boolean_int(n2) && a_0.boolean_for(n2, var_java_util_Vector_do.size())) {
                    DuLieuNguoiChoi dd_03 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n2);
                    cd_0.cd_0_do().cfr_renamed_5(dd_03.var_short_char);
                }
                return;
            }
            case 15: {
                cd_0.cd_0_do().cfr_renamed_4(n2 + var_int_arr_if[3]);
            }
        }
    }

    public static DuLieuNguoiChoi dd_0_do(int n) {
        int n2 = var_int_arr_if[0];
        while (a_0.boolean_for(n2, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(n2);
            if (a_0.boolean_do((int)dd_02.var_short_char, n)) {
                return dd_02;
            }
            ++n2;
            if (((0x7D ^ 0x50) & ~(0x75 ^ 0x58)) == ((0x4D ^ 0x2C) & ~(0x44 ^ 0x25))) continue;
            return null;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void (Graphics graphics == null) {
        GameCanvas.cfr_renamed_1(graphics);
        graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.var_int_byte, GameCanvas.var_int_char + GameCanvas.var_int_else);
        if (a_0.boolean_if(coKichHoat ? 1 : 0) && a_0.boolean_if(coTrangThai ? 1 : 0)) {
            GameCanvas.cfr_renamed_1(graphics);
            if (a_0.boolean_if(t_0.dangChayAuto ? 1 : 0)) {
                graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.var_int_byte, GameCanvas.var_int_char + GameCanvas.var_int_else);
                graphics.setColor(var_int_arr_if[0]);
                graphics.fillRect(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.var_int_byte, GameCanvas.var_int_char + GameCanvas.var_int_else);
                graphics.translate(-ek_0.ek_0_do().soLuong, -ek_0.ek_0_do().cfr_renamed_3);
                GameCanvas.var_ef_0_do.cfr_renamed_0(graphics);
                if (!(GameCanvas.var_int_byte > var_int_arr_if[28])) return;
                GameCanvas.var_ew_case.cfr_renamed_0(graphics, gp_0.chuoiGiaTri, ek_0.ek_0_do().soLuong + GameCanvas.var_int_int, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_long - bn_0.cfr_renamed_15 - bn_0.cfr_renamed_15 / var_int_arr_if[3] - var_int_arr_if[6], var_int_arr_if[3]);
                GameCanvas.var_ew_case.cfr_renamed_0(graphics, "P: " + var_byte_for + " - B: " + var_byte_int, ek_0.ek_0_do().soLuong + GameCanvas.var_int_int, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_long - bn_0.cfr_renamed_15 / var_int_arr_if[3] - var_int_arr_if[6], var_int_arr_if[3]);
                GameCanvas.var_ew_int.cfr_renamed_0(graphics, soLuong + MenuChinhAvatar.java_lang_String_for(), ek_0.ek_0_do().soLuong + GameCanvas.var_int_int, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_long - var_int_arr_if[6] + bn_0.cfr_renamed_15 / var_int_arr_if[3], var_int_arr_if[3]);
                a_0.cfr_renamed_4(graphics);
                return;
            }
        }
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        if (a_0.boolean_if(coKichHoat ? 1 : 0)) {
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, "P: " + var_byte_for + " - B: " + var_byte_int, GameCanvas.var_int_int, GameCanvas.var_int_char / var_int_arr_if[3] - var_int_arr_if[1] * bn_0.cfr_renamed_6, var_int_arr_if[3]);
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, soLuong + MenuChinhAvatar.java_lang_String_for(), GameCanvas.var_int_int, GameCanvas.var_int_char / var_int_arr_if[3] + var_int_arr_if[1] * bn_0.cfr_renamed_6, var_int_arr_if[3]);
            return;
        }
        if (!(GameCanvas.var_dL_do == fk.var_fk_do)) return;
        fk.var_fk_do.cfr_renamed_5(graphics);
    }

    private static void cfr_renamed_24() {
        Vector<ei> vector = new Vector<ei>();
        int n = var_int_arr_if[0];
        while (a_0.boolean_for(n, var_int_arr_if[4])) {
            vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_arr_long[n], var_int_arr_if[29], n));
            ++n;
            if ((0xAF ^ 0x84 ^ (0x37 ^ 0x18)) >= 0) continue;
            return;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, var_int_arr_if[0]);
    }

        public void cfr_renamed_4() {
        eq_0[] eq_0Array = new eq_0[var_int_arr_if[5]];
        eq_0Array[a_0.var_int_arr_if[0]] = new eq_0(GameCanvas.var_int_int, var_int_arr_if[8] + var_int_arr_if[9] * bn_0.cfr_renamed_6, var_int_arr_if[3]);
        eq_0Array[a_0.var_int_arr_if[10]] = new eq_0(var_int_arr_if[11] * bn_0.cfr_renamed_6, GameCanvas.var_int_long - var_int_arr_if[12], var_int_arr_if[0]);
        eq_0Array[a_0.var_int_arr_if[3]] = new eq_0(GameCanvas.var_int_int, GameCanvas.var_int_char - var_int_arr_if[13], var_int_arr_if[3]);
        eq_0Array[a_0.var_int_arr_if[4]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[11] * bn_0.cfr_renamed_6, GameCanvas.var_int_long - var_int_arr_if[12], var_int_arr_if[10]);
        var_eq_0_arr_do = eq_0Array;
        if (a_0.boolean_for(GameCanvas.var_int_byte, var_int_arr_if[14])) {
            var_int_int = var_int_arr_if[15];
            var_int_byte = var_int_arr_if[16];
            eq_0[] eq_0Array2 = new eq_0[var_int_arr_if[5]];
            eq_0Array2[a_0.var_int_arr_if[0]] = new eq_0(GameCanvas.var_int_int, var_int_arr_if[8] + var_int_arr_if[9] * bn_0.cfr_renamed_6, var_int_arr_if[3]);
            eq_0Array2[a_0.var_int_arr_if[10]] = new eq_0(var_int_arr_if[11] * bn_0.cfr_renamed_6, GameCanvas.var_int_long - var_int_arr_if[12], var_int_arr_if[0]);
            eq_0Array2[a_0.var_int_arr_if[3]] = new eq_0(GameCanvas.var_int_int, GameCanvas.this - GameCanvas.var_int_else - var_int_arr_if[6], var_int_arr_if[3]);
            eq_0Array2[a_0.var_int_arr_if[4]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[11] * bn_0.cfr_renamed_6, GameCanvas.var_int_long - var_int_arr_if[12], var_int_arr_if[10]);
            var_eq_0_arr_do = eq_0Array2;
            if (-"   ".length() >= 0) {
                return;
            }
        } else {
            var_int_int = var_int_arr_if[17];
            var_int_byte = var_int_arr_if[18];
        }
        if (a_0.boolean_do(bn_0.cfr_renamed_6, var_int_arr_if[3])) {
            var_int_int = var_int_arr_if[19];
            var_int_byte = var_int_arr_if[20];
        }
        if (!a_0.boolean_if(coKichHoat ? 1 : 0) || a_0.boolean_for(coTrangThai ? 1 : 0)) {
            this.cfr_renamed_1();
        }
        dL.cfr_renamed_8 = null;
    }

    public static void void_for(int n, int n2) {
        if (a_0.boolean_for(n2)) {
            if (a_0.boolean_if(coKichHoat ? 1 : 0)) {
                n = a_0.int_do(n);
                GameCanvas.void_if(n2, a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n]].var_int_if, a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n]].soLuong, var_int_arr_if[2]);
                return;
            }
            DuLieuNguoiChoi dd_02 = a_0.dd_0_do(n);
            GameCanvas.void_if(n2, dd_02.coKichHoat ? 1 : 0, dd_02.var_short_if, var_int_arr_if[2]);
        }
    }

    public static void void_new(int n) {
        soLuongKhoa = n;
        DuLieuNguoiChoi dd_02 = a_0.dd_0_do(n);
        if ((dd_02 != null)) {
            dd_02.var_boolean_int = var_int_arr_if[10];
        }
    }

    public final void cfr_renamed_30() {
        this.cfr_renamed_1();
    }

    private static void cfr_renamed_25() {
        var_java_util_Vector_int.removeAllElements();
        a_0.cfr_renamed_11();
        bO.cfr_renamed_0().cfr_renamed_1();
    }

    public void cfr_renamed_22() {
        a_0.cfr_renamed_11();
        dL.cfr_renamed_19();
    }

        public void (byte by2, byte by3, int n, int n2, Vector vector != null) {
        if ((var_javax_microedition_lcdui_Image_arr_do == null)) {
            var_javax_microedition_lcdui_Image_arr_do = new Image[var_int_arr_if[3]];
            try {
                a_0.var_javax_microedition_lcdui_Image_arr_do[a_0.var_int_arr_if[0]] = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/ready.on"));
                a_0.var_javax_microedition_lcdui_Image_arr_do[a_0.var_int_arr_if[10]] = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/owner.on"));
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            }
        var_byte_for = by2;
        var_byte_int = by3;
        soLuong = n2;
        if ((var_java_util_Vector_do != null)) {
            var_java_util_Vector_do.removeAllElements();
        }
        if (a_0.cfr_renamed_5(var_int_case, (var_java_util_Vector_do = vector).size())) {
            var_int_case = var_java_util_Vector_do.size();
        }
        a_0.void_new(n);
        by3 = (byte)var_int_arr_if[0];
        while (a_0.boolean_for(by3, var_java_util_Vector_do.size())) {
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(by3);
            ((DuLieuNguoiChoi)var_java_util_Vector_do.elementAt(by3)).coKichHoat = var_int_arr_if[0];
            dd_02.cfr_renamed_1(var_int_arr_if[3]);
            dd_02.void_for(dd_02.var_boolean_int ? 1 : 0);
            if (a_0.boolean_do((int)dd_02.var_short_char, AngelChip.duLieuNguoiChoi.var_short_char)) {
                var_byte_if = by3;
                if (((158 + 26 - 106 + 118 ^ 76 + 74 - 63 + 51) & (0x4C ^ 0x76 ^ (0x18 ^ 0x6C) ^ -" ".length())) >= 0) break;
                return;
            }
            by3 = (byte)(by3 + 1);
            if ("  ".length() >= ((233 + 130 - 205 + 93 ^ 110 + 10 - 44 + 113) & (0x7E ^ 0x3F ^ (0x15 ^ 0x12) ^ -" ".length()))) continue;
            return;
        }
        this.cfr_renamed_18();
        if ((var_int_case > var_int_arr_if[3])) {
            GameCanvas.var_gj_0_do.cfr_renamed_2();
        }
    }

    private static void cfr_renamed_27() {
        var_int_arr_if = new int[35];
        a_0.var_int_arr_if[0] = (0x61 ^ 0x15 ^ (0x59 ^ 0x1F)) & (208 + 151 - 274 + 160 ^ 7 + 22 - 24 + 194 ^ -" ".length());
        a_0.var_int_arr_if[1] = 0x10 ^ 0x1A;
        a_0.var_int_arr_if[2] = -" ".length();
        a_0.var_int_arr_if[3] = "  ".length();
        a_0.var_int_arr_if[4] = "   ".length();
        a_0.var_int_arr_if[5] = 0x70 ^ 0x2F ^ (0xFD ^ 0xA6);
        a_0.var_int_arr_if[6] = 0x36 ^ 0x33;
        a_0.var_int_arr_if[7] = 0x17 ^ 0x11;
        a_0.var_int_arr_if[8] = 0x15 ^ 0xB;
        a_0.var_int_arr_if[9] = 0xD5 ^ 0xC2;
        a_0.var_int_arr_if[10] = " ".length();
        a_0.var_int_arr_if[11] = 22 + 81 - 36 + 94 ^ 91 + 161 - 122 + 42;
        a_0.var_int_arr_if[12] = 4 + 147 - 61 + 66 ^ 45 + 16 - -45 + 30;
        a_0.var_int_arr_if[13] = 123 + 67 - 88 + 69 ^ 142 + 152 - 153 + 42;
        a_0.var_int_arr_if[14] = 25 + 124 - 126 + 177;
        a_0.var_int_arr_if[15] = 0x42 ^ 0x58;
        a_0.var_int_arr_if[16] = 0x52 ^ 0x72;
        a_0.var_int_arr_if[17] = 6 ^ 0x30;
        a_0.var_int_arr_if[18] = 0x66 ^ 0x2E;
        a_0.var_int_arr_if[19] = (9 ^ 0x7C) + (50 + 54 - 7 + 34) - (110 + 97 - 103 + 39) + (0x90 ^ 0xB7);
        a_0.var_int_arr_if[20] = 171 + 121 - 268 + 170;
        a_0.var_int_arr_if[21] = 0x48 ^ 0x7A;
        a_0.var_int_arr_if[22] = 0xF3 ^ 0x97;
        a_0.var_int_arr_if[23] = 0x7E ^ 0x4C ^ (0x34 ^ 0xD);
        a_0.var_int_arr_if[24] = 0x27 ^ 0x19 ^ (0x8B ^ 0xB9);
        a_0.var_int_arr_if[25] = 0x13 ^ 0x2E;
        a_0.var_int_arr_if[26] = 0xA6 ^ 0xC3;
        a_0.var_int_arr_if[27] = 0xCC ^ 0xAB ^ (6 ^ 0x66);
        a_0.var_int_arr_if[28] = 10 + 86 - -27 + 18 + (0xB0 ^ 0xAA) - (2 + 131 - 89 + 120) + (135 + 61 - 113 + 64);
        a_0.var_int_arr_if[29] = 0xE5 ^ 0x98 ^ (0x3B ^ 0x49);
        a_0.var_int_arr_if[30] = 0x6A ^ 0x77;
        a_0.var_int_arr_if[31] = 72 + 122 - 135 + 74 ^ 140 + 90 - 90 + 26;
        a_0.var_int_arr_if[32] = 0x3A ^ 0x34;
        a_0.var_int_arr_if[33] = 9 ^ 0x21;
        a_0.var_int_arr_if[34] = 0x4C ^ 0x61;
    }

    public void cfr_renamed_8() {
        GameCanvas.void_if();
        super.cfr_renamed_8();
        var_a_0_do = this;
        AutoKimCuong.var_byte_do = (byte)var_int_arr_if[0];
        AutoKimCuong.X_do().void_do(var_int_arr_if[0]);
        TienIchGame.cfr_renamed_8();
    }
}

