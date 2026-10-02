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
 * Renamed from W
 */
public abstract class w_0
extends en
implements gl {
    public static w_0 var_w_0_do;
    public static fl_0 var_fl_0_do;
    public int soLuongKhoa;
    public static int var_int_int;
    public int cfr_renamed_4;
    private static Vector var_java_util_Vector_int;
    public static int cfr_renamed_5;
    public static byte var_byte_if;
    public static int var_int_byte;
    public static Vector var_java_util_Vector_do;
    private long var_long_for;
    public static int var_int_case;
    public static fl_0 var_fl_0_if;
    public static boolean coTrangThai;
    public static fs[] var_fs_arr_do;
    private static int soLuong;
    public static int[] mangSoNguyen;
    private static fl_0 var_fl_0_byte;
    public int var_int_char = var_int_arr_if[1];
    public static byte var_byte_for;
    private static fl_0 var_fl_0_case;
    private static final int[] var_int_arr_if;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    public static int cfr_renamed_13;
    private static fl_0 var_fl_0_char;
    private static cU var_cU_do;
    public static long soXu;
    public static int cfr_renamed_9;
    public static fl_0 var_fl_0_for;
    public static Vector var_java_util_Vector_if;
    public static Vector var_java_util_Vector_for;
    public static boolean coKichHoat;
    public int cfr_renamed_14;
    public static byte var_byte_int;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static boolean var_boolean_int;
    public static long var_long_if;

    public static void (int n == String string) {
        DuLieuNguoiChoi ef2 = w_0.ef_do(n);
        DuLieuNguoiChoi ef3 = new DuLieuNguoiChoi();
        if ((ef2 != null)) {
            ef3.var_short_for = ef2.var_short_for;
            ef3.var_boolean_int = ef2.var_boolean_int;
            ef3.var_short_goto = ef2.var_short_goto;
            if (w_0.boolean_for(ef3.var_short_goto, var_int_arr_if[2])) {
                if (w_0.boolean_int(coKichHoat ? 1 : 0) && w_0.boolean_do(p_0.var_byte_if)) {
                    ef3.var_short_for = (short)GameCanvas.cfr_renamed_15;
                    if (w_0.boolean_for(ef3.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                        ef3.var_boolean_int = var_int_arr_if[8];
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    } else {
                        ef3.var_boolean_int = GameCanvas.var_int_case - var_int_arr_if[33];
                    }
                }
                (string, var_int_arr_if[21], ef3.var_short_goto != null);
            }
        }
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                GameCanvas.var_int_byte = var_int_arr_if[0];
                this.this();
                dt_0 dt_02 = dt_0.dt_0_do();
                try {
                    dt_02.cfr_renamed_2(var_int_arr_if[29]);
                    }
                catch (IOException iOException) {
                    }
                if ((0x9A ^ 0x9F) <= 0) {
                    return;
                }
                dt_02.cfr_renamed_0();
                dt_0.dt_0_do().cfr_renamed_3(var_byte_for);
                if (w_0.boolean_do(cfr_renamed_9, var_int_arr_if[3])) {
                    this.cfr_renamed_0("");
                }
                w_0.cfr_renamed_9();
                GameCanvas.cfr_renamed_8();
            }
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    public void cfr_renamed_4() {
        GameCanvas.cfr_renamed_6();
        super.cfr_renamed_4();
        var_w_0_do = this;
        aj.var_byte_do = (byte)var_int_arr_if[0];
        aj.aj_do().void_do(var_int_arr_if[0]);
        TienIchGame.cfr_renamed_7();
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static void cfr_renamed_9() {
        fm.fm_do().cfr_renamed_2 = fm.fm_do().soLuong = (fh.var_short_do * fh.var_int_int * dF.cfr_renamed_12 - GameCanvas.var_int_case) / var_int_arr_if[3];
        fm.fm_do().cfr_renamed_3 = fm.fm_do().var_int_if = (fh.var_short_if * fh.var_int_int * dF.cfr_renamed_12 - GameCanvas.soLuongKhoa) / var_int_arr_if[3];
    }

        public final void cfr_renamed_12() {
        this.cfr_renamed_5();
    }

    protected void this() {
        var_long_if = 0L;
        soXu = 0L;
        coKichHoat = var_int_arr_if[0];
        var_boolean_int = var_int_arr_if[0];
        coTrangThai = var_int_arr_if[0];
    }

    public void cfr_renamed_2() {
        fm.fm_do().cfr_renamed_2();
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                ef2.var_byte_this = (byte)var_int_arr_if[0];
                ef2.cfr_renamed_1(var_int_arr_if[0]);
                ef2.void_if(ef2.var_short_for);
                int n2 = w_0.var_fs_arr_do[w_0.mangSoNguyen[n]].soLuong;
                ef2.var_short_for = (short)n2;
                ef2.var_short_char = (short)n2;
                ef2.var_boolean_int = w_0.var_fs_arr_do[w_0.mangSoNguyen[n]].var_int_if;
                ef2.var_short_try = (short)(ef2.var_boolean_int ? 1 : 0);
                if (w_0.boolean_for(mangSoNguyen[n], var_int_arr_if[3]) && w_0.boolean_for(mangSoNguyen[n], var_int_arr_if[4])) {
                    ef2.var_byte_long = (byte)var_int_arr_if[0];
                    ef2.cfr_renamed_4 = ef2.cfr_renamed_4;
                    if (((9 ^ 0x5E) & ~(0x1F ^ 0x48)) >= (0x59 ^ 0x5D)) {
                        return;
                    }
                } else {
                    ef2.var_byte_long = dd_0.var_byte_try;
                    ef2.cfr_renamed_4 = ef2.var_byte_long;
                }
            }
            ++n;
            return;
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n < n2;
    }

    public void cfr_renamed_2(Graphics graphics) {
        GameCanvas.hienThongBaoPopup(graphics);
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                int n2;
                ef2.cfr_renamed_1(graphics, (int)ef2.var_short_for, ef2.var_boolean_int ? 1 : 0);
                short s2 = ef2.var_short_for;
                int n3 = ef2.var_boolean_int - var_int_arr_if[21];
                if (w_0.boolean_do(coKichHoat ? 1 : 0) && w_0.boolean_do(fh.var_int_else, var_int_arr_if[2])) {
                    n2 = var_int_arr_if[1] * dF.cfr_renamed_12;
                    if ("   ".length() < "   ".length()) {
                        return;
                    }
                } else {
                    n2 = var_int_arr_if[0];
                }
                (graphics, s2, n3 - n2, ef2 != null);
                ef2.cfr_renamed_1(graphics, ef2.var_short_for, ef2.var_boolean_int ? 1 : 0, var_int_arr_if[0]);
            }
            ++n;
            return;
        }
    }

    public final void cfr_renamed_15() {
        this.cfr_renamed_2();
    }

    public final void (String string == null) {
        ((en)this).cfr_renamed_5 = null;
        ((en)this).cfr_renamed_3 = null;
        GameCanvas.hienThongBaoPopup(string, var_int_arr_if[21], null);
    }

    public final void void_int(int n) {
        cs_0.cfr_renamed_1().cfr_renamed_1(n, this);
        super.void_int(n);
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                Vector<fl_0> vector = new Vector<fl_0>();
                fl_0 fl_02 = new fl_0(MenuChinhAvatar.bO, var_int_arr_if[1]);
                fl_0 fl_03 = new fl_0(MenuChinhAvatar.w, var_int_arr_if[23]);
                fl_0 fl_04 = new fl_0(MenuChinhAvatar.bs, var_int_arr_if[24]);
                vector.addElement(fl_02);
                if (w_0.boolean_do(fh.var_int_char, var_int_arr_if[25])) {
                    vector.addElement(fl_03);
                }
                vector.addElement(fl_04);
                aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
                return;
            }
            case 2: {
                w_0.cfr_renamed_14();
                return;
            }
            case 3: {
                w_0.cfr_renamed_17();
                return;
            }
            case 4: {
                ep.cfr_renamed_1().void_do(var_w_0_do);
                return;
            }
            case 5: {
                this.cfr_renamed_16();
                return;
            }
            case 6: {
                ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
                return;
            }
            case 10: {
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.F, var_int_arr_if[22], var_int_arr_if[10]);
                return;
            }
            case 11: {
                w_0.cfr_renamed_24();
                return;
            }
            case 12: {
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.bs, var_int_arr_if[26], var_int_arr_if[4]);
                return;
            }
            case 13: {
                if (w_0.boolean_if(n2, var_java_util_Vector_if.size())) {
                    DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n2);
                    go_0.go_0_do();
                    go_0.cfr_renamed_0(ef2);
                }
                return;
            }
            case 14: {
                if (w_0.boolean_new(n2) && w_0.boolean_if(n2, var_java_util_Vector_if.size())) {
                    DuLieuNguoiChoi ef3 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n2);
                    dt_0.dt_0_do().cfr_renamed_5(ef3.var_short_goto);
                }
                return;
            }
            case 15: {
                dt_0.dt_0_do().cfr_renamed_4(n2 + var_int_arr_if[3]);
            }
        }
    }

    private static boolean boolean_for(int n, int n2) {
        return n != n2;
    }

    public static void (int n != boolean bl) {
        DuLieuNguoiChoi ef2 = w_0.ef_do(n);
        if ((ef2 != null)) {
            ef2.var_boolean_int = bl;
        }
    }

    private static void cfr_renamed_14() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                vector.addElement(new fl_0(ef2.tenNhanVat, var_int_arr_if[32], n));
            }
            ++n;
            if ((0xA ^ 0xE) > "  ".length()) continue;
            return;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
    }

    public void cfr_renamed_8() {
        fs[] fsArray = new fs[var_int_arr_if[5]];
        fsArray[w_0.var_int_arr_if[0]] = new fs(GameCanvas.cfr_renamed_15, var_int_arr_if[8] + var_int_arr_if[9] * dF.cfr_renamed_12, var_int_arr_if[3]);
        fsArray[w_0.var_int_arr_if[10]] = new fs(var_int_arr_if[11] * dF.cfr_renamed_12, GameCanvas.var_int_char - var_int_arr_if[12], var_int_arr_if[0]);
        fsArray[w_0.var_int_arr_if[3]] = new fs(GameCanvas.cfr_renamed_15, GameCanvas.var_int_case - var_int_arr_if[13], var_int_arr_if[3]);
        fsArray[w_0.var_int_arr_if[4]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[11] * dF.cfr_renamed_12, GameCanvas.var_int_char - var_int_arr_if[12], var_int_arr_if[10]);
        var_fs_arr_do = fsArray;
        if (w_0.boolean_if(GameCanvas.soLuongKhoa, var_int_arr_if[14])) {
            cfr_renamed_5 = var_int_arr_if[15];
            var_int_int = var_int_arr_if[16];
            fs[] fsArray2 = new fs[var_int_arr_if[5]];
            fsArray2[w_0.var_int_arr_if[0]] = new fs(GameCanvas.cfr_renamed_15, var_int_arr_if[8] + var_int_arr_if[9] * dF.cfr_renamed_12, var_int_arr_if[3]);
            fsArray2[w_0.var_int_arr_if[10]] = new fs(var_int_arr_if[11] * dF.cfr_renamed_12, GameCanvas.var_int_char - var_int_arr_if[12], var_int_arr_if[0]);
            fsArray2[w_0.var_int_arr_if[3]] = new fs(GameCanvas.cfr_renamed_15, GameCanvas.var_int_int - GameCanvas.this - var_int_arr_if[6], var_int_arr_if[3]);
            fsArray2[w_0.var_int_arr_if[4]] = new fs(GameCanvas.soLuongKhoa - var_int_arr_if[11] * dF.cfr_renamed_12, GameCanvas.var_int_char - var_int_arr_if[12], var_int_arr_if[10]);
            var_fs_arr_do = fsArray2;
            if ("   ".length() == ((0x33 ^ 7 ^ (0xCE ^ 0xC5)) & (0x9B ^ 0xC3 ^ (0x31 ^ 0x56) ^ -" ".length()))) {
                return;
            }
        } else {
            cfr_renamed_5 = var_int_arr_if[17];
            var_int_int = var_int_arr_if[18];
        }
        if (w_0.boolean_do(dF.cfr_renamed_12, var_int_arr_if[3])) {
            cfr_renamed_5 = var_int_arr_if[19];
            var_int_int = var_int_arr_if[20];
        }
        if (!w_0.boolean_do(coKichHoat ? 1 : 0) || w_0.boolean_int(var_boolean_int ? 1 : 0)) {
            this.cfr_renamed_2();
        }
        en.cfr_renamed_5 = null;
    }

    public static void (Graphics graphics, int n, int n2, DuLieuNguoiChoi ef2 != null) {
        if (w_0.boolean_do(coKichHoat ? 1 : 0)) {
            if (w_0.boolean_do((int)ef2.var_short_goto, cfr_renamed_13)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[var_int_arr_if[10]], n, n2, var_int_arr_if[4]);
                return;
            }
            if (w_0.boolean_int(ef2.var_boolean_int ? 1 : 0)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_arr_do[var_int_arr_if[0]], n, n2, var_int_arr_if[4]);
            }
        }
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

    protected void void_do() {
    }

    public static void cfr_renamed_3(Graphics graphics) {
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, var_java_util_Vector_if.size())) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2]) && w_0.cfr_renamed_1((Object)ef2.soLuong)) {
                ef2.soLuong.cfr_renamed_1(graphics);
            }
            ++n;
            if (((0xFF ^ 0xB9) & ~(0x12 ^ 0x54)) == ((0x1D ^ 0x3E) & ~(0xBA ^ 0x99))) continue;
            return;
        }
    }

    public void (byte by2, byte by3, int n, int n2, Vector vector != null) {
        if ((var_javax_microedition_lcdui_Image_arr_do == null)) {
            var_javax_microedition_lcdui_Image_arr_do = new Image[var_int_arr_if[3]];
            try {
                w_0.var_javax_microedition_lcdui_Image_arr_do[w_0.var_int_arr_if[0]] = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/ready.on"));
                w_0.var_javax_microedition_lcdui_Image_arr_do[w_0.var_int_arr_if[10]] = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/owner.on"));
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if ("   ".length() <= 0) {
                return;
            }
        }
        var_byte_for = by2;
        var_byte_int = by3;
        soLuong = n2;
        if ((var_java_util_Vector_if != null)) {
            var_java_util_Vector_if.removeAllElements();
        }
        if (w_0.cfr_renamed_3(cfr_renamed_9, (var_java_util_Vector_if = vector).size())) {
            cfr_renamed_9 = var_java_util_Vector_if.size();
        }
        w_0.void_if(n);
        by3 = (byte)var_int_arr_if[0];
        while (w_0.boolean_if((int)by3, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(by3);
            ((DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(by3)).cfr_renamed_4 = var_int_arr_if[0];
            ef2.cfr_renamed_1(var_int_arr_if[3]);
            ef2.void_if(ef2.var_short_for);
            if (w_0.boolean_do((int)ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                var_byte_if = by3;
                if (-" ".length() <= "  ".length()) break;
                return;
            }
            by3 = (byte)(by3 + 1);
            if (((47 + 79 - 65 + 73 ^ 94 + 189 - 270 + 185) & (0x35 ^ 0x73 ^ (0x7A ^ 0x7C) ^ -" ".length())) <= 0) continue;
            return;
        }
        this.cfr_renamed_5();
        if ((cfr_renamed_9 > var_int_arr_if[3])) {
            GameCanvas.var_fa_0_do.cfr_renamed_2();
        }
    }

    public static void void_do(int n) {
        soLuong = n;
        w_0.cfr_renamed_30();
    }

    static {
        w_0.cfr_renamed_22();
        mangSoNguyen = new int[var_int_arr_if[5]];
        var_java_util_Vector_int = new Vector();
        cfr_renamed_9 = var_int_arr_if[5];
        var_java_util_Vector_for = new Vector();
        var_java_util_Vector_do = new Vector();
    }

    public final void (int n == DuLieuNguoiChoi ef2) {
        var_java_util_Vector_if.setElementAt(ef2, n);
        this.cfr_renamed_5();
        this.cfr_renamed_2();
    }

    public static int int_do(int n) {
        int n2 = var_int_arr_if[0];
        while (w_0.boolean_if(n2, cfr_renamed_9)) {
            if (w_0.boolean_do((int)((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n2)).var_short_goto, n)) {
                return n2;
            }
            ++n2;
            return (0x43 ^ 0x7A) & ~(0xBD ^ 0x84);
        }
        return var_int_arr_if[2];
    }

        private void cfr_renamed_16() {
        if (w_0.boolean_int(coKichHoat ? 1 : 0) && w_0.boolean_do(var_boolean_int ? 1 : 0) && w_0.boolean_do(coTrangThai ? 1 : 0)) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.Y, var_int_arr_if[0], this);
            return;
        }
        this.void_for(var_int_arr_if[0]);
    }

    private static void cfr_renamed_23() {
        block12: {
            block13: {
                if (!w_0.boolean_do(coKichHoat ? 1 : 0)) break block12;
                if (w_0.boolean_int(go_0.var_boolean_int ? 1 : 0) && (soLuong > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                    p_0.p_0_do();
                    p_0.cfr_renamed_5();
                    return;
                }
                int n = var_int_arr_if[0];
                int n2 = var_int_arr_if[0];
                int n3 = var_int_arr_if[0];
                while (w_0.boolean_if(n3, cfr_renamed_9)) {
                    DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n3);
                    if (w_0.boolean_for(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                        if (w_0.boolean_int(ef2.var_boolean_int ? 1 : 0)) {
                            ++n;
                            if (((0x67 ^ 0x7B) & ~(0x9A ^ 0x86)) > "   ".length()) {
                                return;
                            }
                        } else {
                            ++n2;
                        }
                    }
                    ++n3;
                    if (-" ".length() < " ".length()) continue;
                    return;
                }
                if (!w_0.boolean_int(n) || !(n2 <= 0)) break block13;
                if ((var_w_0_do == bT.var_bT_do)) {
                    w_0.var_w_0_do.var_int_int = (int)var_fl_0_if;
                    w_0.var_w_0_do.cfr_renamed_4 = (int)null;
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                } else {
                    GameCanvas.cfr_renamed_8();
                }
                en.cfr_renamed_20();
                dt_0 dt_02 = dt_0.dt_0_do();
                try {
                    dt_02.cfr_renamed_2(var_int_arr_if[12]);
                    }
                catch (IOException iOException) {
                    }
                dt_02.cfr_renamed_0();
                return;
            }
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_36);
        }
    }

    public static boolean (byte by2 == byte by3) {
        if (w_0.boolean_do((int)var_byte_for, (int)by2) && w_0.boolean_do((int)var_byte_int, (int)by3)) {
            return var_int_arr_if[10];
        }
        return var_int_arr_if[0];
    }

        private static void cfr_renamed_24() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, var_int_arr_if[4])) {
            vector.addElement(new fl_0(MenuChinhAvatar.var_java_lang_String_arr_long[n], var_int_arr_if[29], n));
            ++n;
            if ("  ".length() == "  ".length()) continue;
            return;
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
    }

    public static void cfr_renamed_21() {
        w_0.cfr_renamed_23();
    }

        public static DuLieuNguoiChoi ef_do(int n) {
        int n2 = var_int_arr_if[0];
        while (w_0.boolean_if(n2, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n2);
            if (w_0.boolean_do((int)ef2.var_short_goto, n)) {
                return ef2;
            }
            ++n2;
            return null;
        }
        return null;
    }

    public void (Graphics graphics != null) {
        if ((var_cU_do != null)) {
            var_cU_do.cfr_renamed_1(graphics);
        }
        if (w_0.boolean_int(al_0.dangChayAuto ? 1 : 0)) {
            al_0.cfr_renamed_1(graphics, (fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            super.cfr_renamed_1(graphics);
        }
        fh.cfr_renamed_1(graphics);
    }

    private static void cfr_renamed_22() {
        var_int_arr_if = new int[35];
        w_0.var_int_arr_if[0] = (72 + 102 - 173 + 171 ^ 55 + 50 - 42 + 84) & (0x1E ^ 0xE ^ (0x6D ^ 0x42) ^ -" ".length());
        w_0.var_int_arr_if[1] = 0x58 ^ 0x1E ^ (0x46 ^ 0xA);
        w_0.var_int_arr_if[2] = -" ".length();
        w_0.var_int_arr_if[3] = "  ".length();
        w_0.var_int_arr_if[4] = "   ".length();
        w_0.var_int_arr_if[5] = 163 + 181 - 333 + 187 ^ 122 + 32 - 91 + 131;
        w_0.var_int_arr_if[6] = 0x1B ^ 0x1E;
        w_0.var_int_arr_if[7] = 0x12 ^ 0x14;
        w_0.var_int_arr_if[8] = 134 + 57 - 36 + 15 ^ 99 + 118 - 88 + 51;
        w_0.var_int_arr_if[9] = 0xF ^ 0x18;
        w_0.var_int_arr_if[10] = " ".length();
        w_0.var_int_arr_if[11] = 174 + 110 - 276 + 168 ^ 129 + 78 - 88 + 70;
        w_0.var_int_arr_if[12] = 0x56 ^ 0x42;
        w_0.var_int_arr_if[13] = 0x3F ^ 0x23;
        w_0.var_int_arr_if[14] = 78 + 11 - 55 + 166;
        w_0.var_int_arr_if[15] = 0x74 ^ 0x6E;
        w_0.var_int_arr_if[16] = 0x43 ^ 0x3E ^ (0x6C ^ 0x31);
        w_0.var_int_arr_if[17] = 114 + 76 - 185 + 131 ^ 50 + 12 - 8 + 136;
        w_0.var_int_arr_if[18] = 0x3A ^ 0x72;
        w_0.var_int_arr_if[19] = 82 + 94 - 137 + 105;
        w_0.var_int_arr_if[20] = 118 + 94 - 194 + 166 + (0xAF ^ 0xB4) - (59 + 58 - 1 + 44) + (136 + 9 - 53 + 51);
        w_0.var_int_arr_if[21] = 0x43 ^ 0x71;
        w_0.var_int_arr_if[22] = 0xC4 ^ 0x93 ^ (0x98 ^ 0xAB);
        w_0.var_int_arr_if[23] = 5 ^ 0xE;
        w_0.var_int_arr_if[24] = 176 + 146 - 232 + 100 ^ 21 + 45 - -26 + 86;
        w_0.var_int_arr_if[25] = 0x8B ^ 0xB6;
        w_0.var_int_arr_if[26] = 0x28 ^ 0x4D;
        w_0.var_int_arr_if[27] = 0x7A ^ 0x7D;
        w_0.var_int_arr_if[28] = 63 + 14 - -62 + 11;
        w_0.var_int_arr_if[29] = 0x51 ^ 0x2D ^ (0x5D ^ 0x2E);
        w_0.var_int_arr_if[30] = 0x6F ^ 0x72;
        w_0.var_int_arr_if[31] = 0xB6 ^ 0xAE ^ (0x8B ^ 0xB0);
        w_0.var_int_arr_if[32] = 114 + 93 - 92 + 19 ^ 129 + 123 - 233 + 117;
        w_0.var_int_arr_if[33] = 0x41 ^ 0x69;
        w_0.var_int_arr_if[34] = 153 + 127 - 120 + 5 ^ 20 + 43 - 1 + 74;
    }

    public static void void_for(int n, int n2) {
        if (w_0.boolean_int(n2)) {
            if (w_0.boolean_do(coKichHoat ? 1 : 0)) {
                n = w_0.int_do(n);
                GameCanvas.void_do(n2, w_0.var_fs_arr_do[w_0.mangSoNguyen[n]].soLuong, w_0.var_fs_arr_do[w_0.mangSoNguyen[n]].var_int_if, var_int_arr_if[2]);
                return;
            }
            DuLieuNguoiChoi ef2 = w_0.ef_do(n);
            GameCanvas.void_do(n2, ef2.var_short_for, ef2.var_boolean_int ? 1 : 0, var_int_arr_if[2]);
        }
    }

    public void cfr_renamed_7() {
        if (w_0.boolean_if(var_int_byte)) {
            var_int_byte -= var_int_arr_if[10];
        }
        if (w_0.boolean_do(coKichHoat ? 1 : 0)) {
            ((en)this).cfr_renamed_5 = var_fl_0_char;
            fm.fm_do().cfr_renamed_0();
        }
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                ef2.cfr_renamed_9();
            }
            ++n;
            if ("   ".length() == "   ".length()) continue;
            return;
        }
        if ((var_cU_do != null) && w_0.boolean_int(var_cU_do.boolean_do() ? 1 : 0)) {
            var_cU_do = null;
        }
    }

    public final void cfr_renamed_2(String string) {
        if (w_0.boolean_do(string.trim().equals("") ? 1 : 0)) {
            if (w_0.boolean_int(AutoController.cfr_renamed_0(string) ? 1 : 0)) {
                return;
            }
            dt_0.dt_0_do().cfr_renamed_0(string);
            w_0.cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_goto, string);
        }
    }

    private static void cfr_renamed_17() {
        Vector<fl_0> vector = new Vector<fl_0>();
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
            if (w_0.boolean_for(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                vector.addElement(new fl_0((String)ef2.soLuong, var_int_arr_if[11], n));
            }
            ++n;
            if (-"   ".length() < 0) continue;
            return;
        }
        if (w_0.boolean_do(vector.size(), var_int_arr_if[10])) {
            ((fl_0)vector.elementAt(var_int_arr_if[0])).cfr_renamed_0();
        }
        aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
    }

    public static void void_if(int n) {
        cfr_renamed_13 = n;
        DuLieuNguoiChoi ef2 = w_0.ef_do(n);
        if ((ef2 != null)) {
            ef2.var_boolean_int = var_int_arr_if[10];
        }
    }

    public void cfr_renamed_6() {
        if (w_0.boolean_int(GameCanvas.cfr_renamed_12)) {
            GameCanvas.var_fa_0_do.void_do((fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
            return;
        }
        super.cfr_renamed_6();
    }

    private static boolean boolean_int(int n) {
        return n != 0;
    }

    public void c_() {
        w_0.cfr_renamed_9();
        en.cfr_renamed_20();
    }

    private static void cfr_renamed_29() {
        var_java_util_Vector_int.removeAllElements();
        w_0.cfr_renamed_9();
        dX.cfr_renamed_1().cfr_renamed_0();
    }

        private static boolean boolean_new(int n) {
        return n >= 0;
    }

    public final void void_if() {
        this.cfr_renamed_16();
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    protected void cfr_renamed_3() {
        if (w_0.boolean_for(w_0.ef_do((int)AngelChip.duLieuNguoiChoi.var_short_goto).var_short_for, var_int_arr_if[10])) {
            boolean bl;
            boolean bl2;
            if (w_0.boolean_int(go_0.var_boolean_int ? 1 : 0) && (soLuong > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                p_0.p_0_do();
                p_0.cfr_renamed_5();
                return;
            }
            if (w_0.boolean_do(((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)w_0.var_byte_if)).var_boolean_int ? 1 : 0)) {
                bl2 = var_int_arr_if[10];
                } else {
                bl2 = bl = var_int_arr_if[0];
            }
            if (w_0.boolean_int(bl2 ? 1 : 0)) {
                var_int_byte = var_int_arr_if[22];
            }
            w_0.cfr_renamed_18();
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_1(bl);
        }
    }

    public void cfr_renamed_5() {
        int n = var_int_arr_if[0];
        int n2 = var_int_arr_if[0];
        int n3 = var_int_arr_if[0];
        while (w_0.boolean_if(n3, cfr_renamed_9)) {
            DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n3);
            ef2.cfr_renamed_1(var_int_arr_if[0]);
            if (w_0.boolean_for(ef2.var_short_goto, var_int_arr_if[2])) {
                ++n;
                if (w_0.boolean_for(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    n2 = n3;
                }
            }
            ++n3;
            if ("   ".length() == "   ".length()) continue;
            return;
        }
        int[] nArray = new int[cfr_renamed_9];
        int n4 = var_int_arr_if[3];
        if (w_0.boolean_do(n, var_int_arr_if[3])) {
            nArray[w_0.var_byte_if] = var_int_arr_if[3];
            nArray[n2] = var_int_arr_if[0];
            if (" ".length() < 0) {
                return;
            }
        } else {
            n = var_byte_if;
            while (w_0.boolean_if(n, var_byte_if + cfr_renamed_9)) {
                n2 = n;
                if ((n > cfr_renamed_9 - var_int_arr_if[10])) {
                    n2 = n - cfr_renamed_9;
                }
                nArray[n2] = n4++;
                if ((n4 >= cfr_renamed_9)) {
                    n4 = var_int_arr_if[0];
                }
                ++n;
                if (" ".length() >= 0) continue;
                return;
            }
        }
        mangSoNguyen = nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void (Graphics graphics == null) {
        GameCanvas.hienThongBaoPopup(graphics);
        graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.soLuongKhoa, GameCanvas.var_int_case + GameCanvas.this);
        if (w_0.boolean_do(coKichHoat ? 1 : 0) && w_0.boolean_do(var_boolean_int ? 1 : 0)) {
            GameCanvas.hienThongBaoPopup(graphics);
            if (w_0.boolean_do(al_0.dangChayAuto ? 1 : 0)) {
                graphics.setClip(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.soLuongKhoa, GameCanvas.var_int_case + GameCanvas.this);
                graphics.setColor(var_int_arr_if[0]);
                graphics.fillRect(var_int_arr_if[0], var_int_arr_if[0], GameCanvas.soLuongKhoa, GameCanvas.var_int_case + GameCanvas.this);
                graphics.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
                GameCanvas.var_fh_do.cfr_renamed_0(graphics);
                if (!(GameCanvas.soLuongKhoa > var_int_arr_if[28])) return;
                GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, fm_0.chuoiGiaTri, fm.fm_do().cfr_renamed_3 + GameCanvas.cfr_renamed_15, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_char - dF.var_byte_new - dF.var_byte_new / var_int_arr_if[3] - var_int_arr_if[6], var_int_arr_if[3]);
                GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, "P: " + var_byte_for + " - B: " + var_byte_int, fm.fm_do().cfr_renamed_3 + GameCanvas.cfr_renamed_15, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_char - dF.var_byte_new / var_int_arr_if[3] - var_int_arr_if[6], var_int_arr_if[3]);
                GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, soLuong + MenuChinhAvatar.java_lang_String_if(), fm.fm_do().cfr_renamed_3 + GameCanvas.cfr_renamed_15, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_char - var_int_arr_if[6] + dF.var_byte_new / var_int_arr_if[3], var_int_arr_if[3]);
                w_0.cfr_renamed_3(graphics);
                return;
            }
        }
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        if (w_0.boolean_do(coKichHoat ? 1 : 0)) {
            GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, "P: " + var_byte_for + " - B: " + var_byte_int, GameCanvas.cfr_renamed_15, GameCanvas.var_int_case / var_int_arr_if[3] - var_int_arr_if[1] * dF.cfr_renamed_12, var_int_arr_if[3]);
            GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, soLuong + MenuChinhAvatar.java_lang_String_if(), GameCanvas.cfr_renamed_15, GameCanvas.var_int_case / var_int_arr_if[3] + var_int_arr_if[1] * dF.cfr_renamed_12, var_int_arr_if[3]);
            return;
        }
        if (!(GameCanvas.var_en_do == gI.var_gI_do)) return;
        gI.var_gI_do.cfr_renamed_4(graphics);
    }

        public final void cfr_renamed_10() {
        if (w_0.boolean_do(cfr_renamed_13, AngelChip.duLieuNguoiChoi.var_short_goto)) {
            if (w_0.cfr_renamed_0(((en)this).cfr_renamed_3, var_fl_0_if)) {
                ((en)this).cfr_renamed_3 = var_fl_0_byte;
                w_0.var_fl_0_byte.chuoiGiaTri = MenuChinhAvatar.co;
            }
            int n = var_int_arr_if[10];
            int n2 = var_int_arr_if[0];
            while (w_0.boolean_if(n2, cfr_renamed_9)) {
                DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n2);
                if (w_0.boolean_do((int)ef2.var_short_goto, var_int_arr_if[2])) {
                    n = var_int_arr_if[0];
                    if (-"   ".length() > 0) {
                        return;
                    }
                } else if (w_0.boolean_for(ef2.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && w_0.boolean_do(ef2.var_boolean_int ? 1 : 0)) {
                    n = var_int_arr_if[0];
                }
                ++n2;
                if ((0x91 ^ 0xAA ^ (0x3D ^ 2)) != 0) continue;
                return;
            }
            if (w_0.boolean_int(n) && (GameCanvas.var_int_goto % var_int_arr_if[1] > var_int_arr_if[27])) {
                w_0.var_fl_0_byte.chuoiGiaTri = "";
            }
            if (w_0.boolean_int(n) && (AutoController.nhiemVuHienTai != null) && w_0.boolean_int(AutoController.nhiemVuHienTai instanceof aj) && w_0.boolean_new((System.currentTimeMillis() - this.var_long_for == 5000L))) {
                this.var_long_for = System.currentTimeMillis();
                aj.aj_do().void_do(var_int_arr_if[10]);
            }
            return;
        }
        if (w_0.boolean_do(var_boolean_int ? 1 : 0)) {
            ((en)this).cfr_renamed_3 = var_fl_0_case;
            w_0.var_fl_0_case.chuoiGiaTri = MenuChinhAvatar.cfr_renamed_37;
            int n = var_int_arr_if[0];
            while (w_0.boolean_if(n, cfr_renamed_9)) {
                DuLieuNguoiChoi ef3 = (DuLieuNguoiChoi)var_java_util_Vector_if.elementAt(n);
                if (w_0.boolean_do((int)ef3.var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    if (w_0.boolean_do(ef3.var_boolean_int ? 1 : 0)) {
                        if ((GameCanvas.var_int_goto % var_int_arr_if[1] > var_int_arr_if[27])) {
                            w_0.var_fl_0_case.chuoiGiaTri = "";
                        }
                        if ((AutoController.nhiemVuHienTai != null) && w_0.boolean_int(AutoController.nhiemVuHienTai instanceof aj) && w_0.boolean_new((System.currentTimeMillis() - this.var_long_for == 5000L))) {
                            this.var_long_for = System.currentTimeMillis();
                            aj.aj_do().void_do(var_int_arr_if[3]);
                            if (((0x3D ^ 0x75 ^ (0x21 ^ 0x2E)) & (0x28 ^ 0x4A ^ (0x74 ^ 0x51) ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                    } else {
                        w_0.var_fl_0_case.chuoiGiaTri = MenuChinhAvatar.cS;
                        if (w_0.boolean_do(var_int_byte)) {
                            ((en)this).cfr_renamed_3 = var_fl_0_case;
                            if ("  ".length() <= " ".length()) {
                                return;
                            }
                        } else {
                            ((en)this).cfr_renamed_3 = null;
                        }
                    }
                }
                ++n;
                if ("   ".length() != -" ".length()) continue;
                return;
            }
        }
    }

    public w_0() {
        this.cfr_renamed_4 = var_int_arr_if[2];
        this.cfr_renamed_8();
        var_fl_0_char = new fl_0(MenuChinhAvatar.bR, var_int_arr_if[0]);
        var_fl_0_byte = new fl_0(MenuChinhAvatar.co, var_int_arr_if[3]);
        var_fl_0_for = new fl_0(MenuChinhAvatar.cW, var_int_arr_if[4]);
        var_fl_0_do = new fl_0(MenuChinhAvatar.an, var_int_arr_if[5]);
        var_fl_0_case = new fl_0(MenuChinhAvatar.cfr_renamed_37, var_int_arr_if[6]);
        var_fl_0_if = new fl_0(MenuChinhAvatar.bZ, var_int_arr_if[7]);
        this.var_long_for = 0L;
    }

    public void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                String string;
                fl_0 fl_02 = new fl_0(MenuChinhAvatar.bu, var_int_arr_if[10]);
                fl_0 fl_03 = new fl_0(MenuChinhAvatar.aM, var_int_arr_if[3]);
                int n3 = var_int_arr_if[0];
                int n4 = var_int_arr_if[0];
                while (w_0.boolean_if(n4, cfr_renamed_9)) {
                    if (w_0.boolean_for(((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n4)).var_short_goto, var_int_arr_if[2])) {
                        ++n3;
                    }
                    ++n4;
                    if (-"   ".length() <= 0) continue;
                    return;
                }
                Vector<fl_0> vector = new Vector<fl_0>();
                if ((AutoController.nhiemVuHienTai != null)) {
                    vector.addElement(new fl_0("Tắt Auto", var_int_arr_if[5], go_0.go_0_do()));
                    } else {
                    vector.addElement(new fl_0("Auto xếp KC", var_int_arr_if[25], go_0.go_0_do()));
                }
                vector.addElement(new fl_0("Auto Farm", var_int_arr_if[15], go_0.go_0_do()));
                vector.addElement(new fl_0("Auto bán đá", var_int_arr_if[30], go_0.go_0_do()));
                vector.addElement(new fl_0("Bỏ vật phẩm", var_int_arr_if[27], go_0.go_0_do()));
                vector.addElement(new fl_0("Rương đồ", var_int_arr_if[7]));
                if (w_0.boolean_int(TienIchGame.cfr_renamed_7 ? 1 : 0)) {
                    string = "Hiện thông tin";
                    if ("   ".length() <= ((0x91 ^ 0x98) & ~(0x14 ^ 0x1D))) {
                        return;
                    }
                } else {
                    string = "Tắt thông tin";
                }
                vector.addElement(new fl_0(string, var_int_arr_if[31], go_0.go_0_do()));
                if (w_0.boolean_do(cfr_renamed_13, AngelChip.duLieuNguoiChoi.var_short_goto) && w_0.boolean_do(coKichHoat ? 1 : 0)) {
                    vector.addElement(fl_02);
                    if ((n3 > var_int_arr_if[10])) {
                        vector.addElement(fl_03);
                    }
                }
                if ((n3 > var_int_arr_if[10])) {
                    vector.addElement(new fl_0(MenuChinhAvatar.g, var_int_arr_if[4]));
                }
                vector.addElement(new fl_0(MenuChinhAvatar.cY, var_int_arr_if[5]));
                vector.addElement(new fl_0(MenuChinhAvatar.bt, var_int_arr_if[6]));
                aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
                return;
            }
            case 1: {
                w_0.cfr_renamed_29();
                return;
            }
            case 2: {
                w_0.cfr_renamed_23();
                return;
            }
            case 3: {
                var_w_0_do.c_();
                return;
            }
            case 4: {
                var_w_0_do.void_do();
                return;
            }
            case 5: {
                var_w_0_do.cfr_renamed_3();
                return;
            }
            case 6: {
                return;
            }
            case 50: {
                this.c_();
                w_0.cfr_renamed_29();
                coKichHoat = var_int_arr_if[0];
                this.cfr_renamed_4 = var_int_arr_if[2];
                var_int_case = var_int_arr_if[0];
                return;
            }
            case 100: {
                try {
                    n = Integer.parseInt(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                    if (w_0.boolean_for(n)) {
                        return;
                    }
                    GameCanvas.cfr_renamed_7();
                    if (w_0.boolean_int(go_0.var_boolean_int ? 1 : 0) && (n > AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[4]])) {
                        p_0.p_0_do();
                        p_0.cfr_renamed_5();
                        return;
                    }
                    dt_0.dt_0_do().cfr_renamed_3(n);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 101: {
                dt_0.dt_0_do().cfr_renamed_2(GameCanvas.var_ca_do.var_ey_0_do.java_lang_String_do());
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.cfr_renamed_38);
            }
        }
    }

    public static void (String string, int n, int n2 != null) {
        if (w_0.boolean_do(n2, var_int_arr_if[2])) {
            if ((var_cU_do == null)) {
                var_cU_do = new cU(n, string, var_int_arr_if[0]);
                var_cU_do.void_do(GameCanvas.cfr_renamed_15, GameCanvas.var_int_char - var_int_arr_if[12]);
                return;
            }
            var_cU_do.cfr_renamed_1(n, string);
            return;
        }
        int n3 = var_int_arr_if[0];
        while (w_0.boolean_if(n3, var_java_util_Vector_if.size())) {
            dd_0 dd_02 = (dd_0)var_java_util_Vector_if.elementAt(n3);
            if (w_0.boolean_do(dd_02.cfr_renamed_9, n2)) {
                if ((dd_02.var_cU_do == null)) {
                    dd_02.var_cU_do = new cU(n, string, var_int_arr_if[0]);
                    dd_02.var_cU_do.void_do((int)dd_02.cfr_renamed_2, dd_02.var_byte_int - var_int_arr_if[34]);
                    if (((0xB4 ^ 0xBC) & ~(0x16 ^ 0x1E)) > 0) {
                        return;
                    }
                } else {
                    dd_02.var_cU_do.cfr_renamed_1(n, string);
                }
            }
            ++n3;
            if (-" ".length() != (0x4B ^ 0x30 ^ 48 + 102 - 41 + 18)) continue;
            return;
        }
    }

        public static void cfr_renamed_18() {
        w_0.var_w_0_do.var_int_int = (int)var_fl_0_if;
        w_0.var_w_0_do.cfr_renamed_4 = (int)null;
    }

    public static void cfr_renamed_30() {
        int n = var_int_arr_if[0];
        while (w_0.boolean_if(n, cfr_renamed_9)) {
            ((DuLieuNguoiChoi)w_0.var_java_util_Vector_if.elementAt((int)n)).var_boolean_int = var_int_arr_if[0];
            ++n;
            return;
        }
    }

    public final void void_new(int n) {
        DuLieuNguoiChoi ef2 = w_0.ef_do(n);
        if ((ef2 != null)) {
            w_0.cfr_renamed_1((String)ef2.soLuong + MenuChinhAvatar.cy, var_int_arr_if[8], ef2.var_short_goto);
            ef2.var_short_goto = (short)var_int_arr_if[2];
            ef2.cfr_renamed_1("");
            ef2.void_for(var_int_arr_if[0]);
            ef2.var_boolean_int = var_int_arr_if[0];
        }
        this.cfr_renamed_5();
        if (!w_0.boolean_do(coKichHoat ? 1 : 0) || w_0.boolean_int(var_boolean_int ? 1 : 0)) {
            this.cfr_renamed_2();
        }
    }
}

