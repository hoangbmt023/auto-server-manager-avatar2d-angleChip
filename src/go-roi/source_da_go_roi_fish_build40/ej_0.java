/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from eJ
 */
public final class ej_0
extends en {
    private Vector var_java_util_Vector_do;
    private static int[] mangSoNguyen;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    public int soLuong;
    private Vector var_java_util_Vector_if;
    private byte var_byte_do = (byte)1;
    public int var_int_if;
    public int soLuongKhoa = 0;
    private Vector var_java_util_Vector_for;
    private static ej_0 var_ej_0_do;

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    static {
        ej_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[11];
        1 = " ".length();
        0 = (0x64 ^ 0x2E ^ (0xC4 ^ 0xAF)) & (50 + 82 - 121 + 162 ^ 119 + 42 - 61 + 40 ^ -" ".length());
        4 = 0x64 ^ 0x37 ^ (0x70 ^ 0x27);
        150 = 17 + 91 - 5 + 25 + (0x26 ^ 0x2E) - -"  ".length() + (0x80 ^ 0x8C);
        170 = (0x49 ^ 0x21) + (0xCA ^ 0x87) - (0x45 ^ 0xB) + (0xD9 ^ 0x9A);
        2 = "  ".length();
        120 = 0x84 ^ 0xA5 ^ (0x6E ^ 0x37);
        50 = 0x2A ^ 9 ^ (0x87 ^ 0x96);
        20 = 0xB8 ^ 0xAC;
        10 = 62 + 143 - 198 + 172 ^ 119 + 4 - 45 + 107;
        3 = "   ".length();
    }

    public static ej_0 cfr_renamed_1() {
        if ((var_ej_0_do == null)) {
            var_ej_0_do = new ej_0();
        }
        return var_ej_0_do;
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_if(int n) {
        return n > 0;
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void cfr_renamed_6() {
        GameCanvas.var_fa_0_do.cfr_renamed_6();
        super.cfr_renamed_6();
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                ej_0.cfr_renamed_5();
                return;
            }
            case 1: {
                ej_0.cfr_renamed_5();
            }
        }
    }

    public final void cfr_renamed_7() {
        if (ej_0.boolean_if(this.soLuong)) {
            this.soLuong -= 1;
        }
        if (ej_0.boolean_if(this.var_int_if)) {
            this.var_int_if -= 1;
        }
        this.cfr_renamed_3 += 1;
        if ((this.cfr_renamed_3 > 50)) {
            this.cfr_renamed_3 = 0;
            int n = hg.var_java_util_Random_do.nextInt(3);
            if (ej_0.cfr_renamed_3(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_2, 10)) {
                if (ej_0.boolean_int(n)) {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(1);
                    if ((0x75 ^ 0x12 ^ (0x34 ^ 0x57)) < "   ".length()) {
                        return;
                    }
                } else {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                }
            }
        }
        AngelChip.duLieuNguoiChoi.cfr_renamed_9();
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_3() {
        var1_1 = 0;
        if (-" ".length() >= -" ".length()) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = (cg)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(var1_1);
            var3_3 = (cX)aa_0.am_do(var2_2.var_short_do);
            if ((var3_3.var_byte_if == 50) && ej_0.boolean_for(this.var_java_util_Vector_if.size()) && ej_0.boolean_do(this.cfr_renamed_4, this.var_java_util_Vector_if.size())) {
                var2_2.var_short_do = ((cX)this.var_java_util_Vector_if.elementAt((int)this.cfr_renamed_4)).cfr_renamed_3;
            }
            if ((var3_3.var_byte_if == 20) && ej_0.boolean_for(this.var_java_util_Vector_do.size()) && ej_0.boolean_do(this.cfr_renamed_4, this.var_java_util_Vector_do.size())) {
                var2_2.var_short_do = ((cX)this.var_java_util_Vector_do.elementAt((int)this.cfr_renamed_4)).cfr_renamed_3;
            }
            if ((var3_3.var_byte_if == 10) && ej_0.boolean_for(this.var_java_util_Vector_for.size()) && ej_0.boolean_do(this.cfr_renamed_4, this.var_java_util_Vector_for.size())) {
                var2_2.var_short_do = ((cX)this.var_java_util_Vector_for.elementAt((int)this.cfr_renamed_4)).cfr_renamed_3;
            }
            ++var1_1;
lbl15:
            // 2 sources

            ** while (!ej_0.boolean_if((int)var1_1, (int)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size()))
        }
lbl16:
        // 1 sources

        AngelChip.duLieuNguoiChoi.void_if();
    }

        public final void void_do(int n) {
        this.soLuongKhoa = n;
        if (ej_0.boolean_do(this.soLuongKhoa)) {
            this.soLuongKhoa = 1;
        }
        if ((this.soLuongKhoa > 1)) {
            this.soLuongKhoa = 0;
        }
    }

    public ej_0() {
        this.cfr_renamed_3 = 0;
    }

    public final void cfr_renamed_4() {
        int n;
        AngelChip.duLieuNguoiChoi.var_byte_new = (byte)0;
        AngelChip.duLieuNguoiChoi.var_java_util_Vector_if = new Vector();
        this.cfr_renamed_8();
        ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.V, 0);
        cg cg2 = new cg();
        int n2 = hg.var_java_util_Random_do.nextInt(this.var_java_util_Vector_for.size());
        cg2.var_short_do = ((am)((cX)this.var_java_util_Vector_for.elementAt((int)n2))).cfr_renamed_3;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(cg2);
        cg2 = new cg();
        n2 = hg.var_java_util_Random_do.nextInt(this.var_java_util_Vector_do.size());
        cg2.var_short_do = ((am)((cX)this.var_java_util_Vector_do.elementAt((int)n2))).cfr_renamed_3;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(cg2);
        cg2 = new cg();
        new cg().var_short_do = (short)4;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(cg2);
        cg2 = new cg();
        n2 = hg.var_java_util_Random_do.nextInt(this.var_java_util_Vector_if.size());
        cg2.var_short_do = ((am)((cX)this.var_java_util_Vector_if.elementAt((int)n2))).cfr_renamed_3;
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(cg2);
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(new cg(0));
        AngelChip.duLieuNguoiChoi.void_if();
        v_0 v_02 = v_0.v_0_do();
        int n3 = 150 * dF.cfr_renamed_12;
        int n4 = 170;
        if ((dF.cfr_renamed_12 == 2)) {
            n = 120;
            if (((208 + 25 - 50 + 34 ^ 188 + 139 - 206 + 77) & (212 + 46 - 133 + 93 ^ 153 + 44 - 121 + 121 ^ -" ".length())) < 0) {
                return;
            }
        } else {
            n = 0;
        }
        v_02.cfr_renamed_1(MenuChinhAvatar.N, n3, n4 + n, 1);
        super.cfr_renamed_4();
    }

        private static void cfr_renamed_5() {
        GameCanvas.coKichHoat = 1;
        GameCanvas.cfr_renamed_2(String.valueOf(MenuChinhAvatar.N) + "...");
        ft_0.ft_0_do().void_do();
    }

    public final void (Graphics graphics == null) {
        GameCanvas.var_fh_do.cfr_renamed_2(graphics);
        GameCanvas.var_fh_do.cfr_renamed_3(graphics);
        GameCanvas.hienThongBaoPopup(graphics);
        v_0.v_0_do().cfr_renamed_1(graphics);
        graphics.translate(v_0.v_0_do().cfr_renamed_5, v_0.v_0_do().cfr_renamed_6);
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics, this.soLuongKhoa, this.var_byte_do, this.soLuong, this.var_int_if);
        super.cfr_renamed_1(graphics);
    }

        public final void void_if(int n) {
        this.cfr_renamed_4 += n;
        if (ej_0.boolean_do(this.cfr_renamed_4)) {
            this.cfr_renamed_4 = 1;
        }
        if ((this.cfr_renamed_4 > 1)) {
            this.cfr_renamed_4 = 0;
        }
        if (ej_0.boolean_int(this.soLuongKhoa)) {
            if ((this.var_byte_do == 1)) {
                this.var_byte_do = (byte)2;
                if ((0x93 ^ 0x97) <= ((0x11 ^ 0x4A) & ~(0x32 ^ 0x69))) {
                    return;
                }
            } else {
                this.var_byte_do = (byte)1;
            }
            this.cfr_renamed_8();
            return;
        }
        this.cfr_renamed_3();
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0(MenuChinhAvatar.bL, 0, this));
                vector.addElement(new fl_0(MenuChinhAvatar.aB, 1, this));
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.var_java_lang_String_new, vector);
            }
        }
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_8() {
        AngelChip.duLieuNguoiChoi.var_byte_do = this.var_byte_do;
        if ((this.var_java_util_Vector_if != null)) {
            this.var_java_util_Vector_if.removeAllElements();
            this.var_java_util_Vector_do.removeAllElements();
            this.var_java_util_Vector_for.removeAllElements();
        }
        this.var_java_util_Vector_if = new Vector<E>();
        this.var_java_util_Vector_do = new Vector<E>();
        this.var_java_util_Vector_for = new Vector<E>();
        var1_1 = 0;
        if (-"  ".length() <= 0) ** GOTO lbl32
        return;
lbl-1000:
        // 1 sources

        {
            if (ej_0.boolean_for(aa_0.var_am_arr_do[var1_1] instanceof cX) && (var2_2 = (cX)aa_0.var_am_arr_do[var1_1] != null) && (!(var2_2.cfr_renamed_3 != this.var_byte_do) || ej_0.boolean_int(var2_2.cfr_renamed_3)) && ej_0.boolean_int(var2_2.cfr_renamed_2)) {
                if ((var2_2.var_byte_if == 50)) {
                    this.var_java_util_Vector_if.addElement(var2_2);
                    } else if ((var2_2.var_byte_if == 20)) {
                    this.var_java_util_Vector_do.addElement(var2_2);
                    } else if ((var2_2.var_byte_if == 10)) {
                    this.var_java_util_Vector_for.addElement(var2_2);
                }
            }
            ++var1_1;
lbl32:
            // 2 sources

            ** while (!ej_0.boolean_if((int)var1_1, (int)aa_0.var_am_arr_do.length))
        }
lbl33:
        // 1 sources

        this.cfr_renamed_4 = 0;
        this.cfr_renamed_3();
        if ((AngelChip.duLieuNguoiChoi.cfr_renamed_2 != 10)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_1(1);
        }
        AngelChip.duLieuNguoiChoi.void_if();
    }

    public static void (boolean bl != null) {
        GameCanvas.cfr_renamed_7();
        if (ej_0.boolean_for(bl ? 1 : 0)) {
            go_0.go_0_do().cfr_renamed_14();
            return;
        }
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.J);
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }
}

