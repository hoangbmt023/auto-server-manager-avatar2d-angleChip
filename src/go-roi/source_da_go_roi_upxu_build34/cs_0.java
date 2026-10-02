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
 * Renamed from cS
 */
public final class cs_0
extends dL {
    private int cfr_renamed_4;
    private Vector var_java_util_Vector_do;
    private static cs_0 var_cs_0_do;
    private static int[] mangSoNguyen;
    public int soLuong;
    private Vector var_java_util_Vector_if;
    private int cfr_renamed_5;
    public int var_int_if;
    public int soLuongKhoa;
    private Vector var_java_util_Vector_for;
    private byte var_byte_do = (byte)1;

    public static cs_0 cfr_renamed_0() {
        if ((var_cs_0_do == null)) {
            var_cs_0_do = new cs_0();
        }
        return var_cs_0_do;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_1() {
        AngelChip.duLieuNguoiChoi.var_byte_void = this.var_byte_do;
        if ((this.var_java_util_Vector_if != null)) {
            this.var_java_util_Vector_if.removeAllElements();
            this.var_java_util_Vector_for.removeAllElements();
            this.var_java_util_Vector_do.removeAllElements();
        }
        this.var_java_util_Vector_if = new Vector();
        this.var_java_util_Vector_for = new Vector();
        this.var_java_util_Vector_do = new Vector();
        int n = 0;
        while (!(n >= ci_0.var_q_0_arr_do.length)) {
            ci ci2;
            if (cs_0.boolean_if(ci_0.var_q_0_arr_do[n] instanceof ci) && (ci2 = (ci)ci_0.var_q_0_arr_do[n] != null) && (!(ci2.cfr_renamed_3 != this.var_byte_do) || cs_0.boolean_int(ci2.cfr_renamed_3)) && cs_0.boolean_int(ci2.cfr_renamed_4)) {
                if (cs_0.boolean_do(ci2.var_byte_if, 50)) {
                    this.var_java_util_Vector_if.addElement(ci2);
                    if (((0xEB ^ 0x92 ^ (0x59 ^ 0x6E)) & (0x27 ^ 0x6A ^ "   ".length() ^ -" ".length())) != 0) {
                        return;
                    }
                } else if (cs_0.boolean_do(ci2.var_byte_if, 20)) {
                    this.var_java_util_Vector_for.addElement(ci2);
                    if (" ".length() < " ".length()) {
                        return;
                    }
                } else if (cs_0.boolean_do(ci2.var_byte_if, 10)) {
                    this.var_java_util_Vector_do.addElement(ci2);
                }
            }
            ++n;
        }
        this.cfr_renamed_5 = 0;
        this.cfr_renamed_4();
        if (cs_0.cfr_renamed_3(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 10)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_1(1);
        }
        AngelChip.duLieuNguoiChoi.void_if();
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_4() {
        var1_1 = 0;
        if ("  ".length() != 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = (ef)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.elementAt(var1_1);
            var3_3 = (ci)ci_0.q_0_do(var2_2.var_short_do);
            if (cs_0.boolean_do(var3_3.var_byte_if, 50) && cs_0.boolean_if(this.var_java_util_Vector_if.size()) && (this.cfr_renamed_5 < this.var_java_util_Vector_if.size())) {
                var2_2.var_short_do = ((ci)this.var_java_util_Vector_if.elementAt((int)this.cfr_renamed_5)).var_short_do;
            }
            if (cs_0.boolean_do(var3_3.var_byte_if, 20) && cs_0.boolean_if(this.var_java_util_Vector_for.size()) && (this.cfr_renamed_5 < this.var_java_util_Vector_for.size())) {
                var2_2.var_short_do = ((ci)this.var_java_util_Vector_for.elementAt((int)this.cfr_renamed_5)).var_short_do;
            }
            if (cs_0.boolean_do(var3_3.var_byte_if, 10) && cs_0.boolean_if(this.var_java_util_Vector_do.size()) && (this.cfr_renamed_5 < this.var_java_util_Vector_do.size())) {
                var2_2.var_short_do = ((ci)this.var_java_util_Vector_do.elementAt((int)this.cfr_renamed_5)).var_short_do;
            }
            ++var1_1;
lbl15:
            // 2 sources

            ** while (!cs_0.cfr_renamed_4((int)var1_1, (int)AngelChip.duLieuNguoiChoi.var_java_util_Vector_if.size()))
        }
lbl16:
        // 1 sources

        AngelChip.duLieuNguoiChoi.void_if();
    }

    public final void cfr_renamed_15() {
        GameCanvas.var_gj_0_do.cfr_renamed_8();
        super.cfr_renamed_15();
    }

    private static void cfr_renamed_5() {
        GameCanvas.var_boolean_byte = 1;
        GameCanvas.cfr_renamed_4(String.valueOf(MenuChinhAvatar.bD) + "...");
        eq.eq_do().void_do();
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    public static void (boolean bl != null) {
        GameCanvas.cfr_renamed_8();
        if (cs_0.boolean_if(bl ? 1 : 0)) {
            fe_0.fe_0_do().cfr_renamed_11();
            return;
        }
        GameCanvas.cfr_renamed_1(MenuChinhAvatar.cf);
    }

    public final void void_for(int n) {
        this.soLuongKhoa = n;
        if (cs_0.boolean_do(this.soLuongKhoa)) {
            this.soLuongKhoa = 1;
        }
        if (cs_0.boolean_if(this.soLuongKhoa, 1)) {
            this.soLuongKhoa = 0;
        }
    }

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[11];
        1 = " ".length();
        0 = (0x82 ^ 0xBC ^ (0x5F ^ 0x22)) & (0xB7 ^ 0x8E ^ (0x71 ^ 0xB) ^ -" ".length());
        4 = 0x5D ^ 0x5A ^ "   ".length();
        150 = (0xF6 ^ 0xBB) + (0xB2 ^ 0xC7) - (115 + 21 - 135 + 148) + (0x40 ^ 0x29);
        170 = 129 + 113 - 131 + 59;
        2 = "  ".length();
        120 = 0x6E ^ 0x1B ^ (0xBF ^ 0xB2);
        50 = 23 + 48 - 22 + 79 ^ 102 + 13 - -61 + 2;
        20 = 0x5F ^ 0x4B;
        10 = 0xA5 ^ 0xC0 ^ (0xEA ^ 0x85);
        3 = "   ".length();
    }

        public cs_0() {
        this.soLuongKhoa = 0;
        this.cfr_renamed_4 = 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

        private static boolean boolean_if(int n) {
        return n != 0;
    }

    public final void void_int(int n) {
        this.cfr_renamed_5 += n;
        if (cs_0.boolean_do(this.cfr_renamed_5)) {
            this.cfr_renamed_5 = 1;
        }
        if (cs_0.boolean_if(this.cfr_renamed_5, 1)) {
            this.cfr_renamed_5 = 0;
        }
        if (cs_0.boolean_int(this.soLuongKhoa)) {
            if (cs_0.boolean_do(this.var_byte_do, 1)) {
                this.var_byte_do = (byte)2;
                if ((" ".length() ^ (0xB6 ^ 0xB3)) == ((165 + 77 - 94 + 49 ^ 6 + 95 - 97 + 150) & (0x15 ^ 0x40 ^ (0x43 ^ 0x49) ^ -" ".length()))) {
                    return;
                }
            } else {
                this.var_byte_do = (byte)1;
            }
            this.cfr_renamed_1();
            return;
        }
        this.cfr_renamed_4();
    }

    public final void void_for() {
        if (cs_0.boolean_for(this.soLuong)) {
            this.soLuong -= 1;
        }
        if (cs_0.boolean_for(this.var_int_if)) {
            this.var_int_if -= 1;
        }
        this.cfr_renamed_4 += 1;
        if (cs_0.boolean_if(this.cfr_renamed_4, 50)) {
            this.cfr_renamed_4 = 0;
            int n = gc_0.var_java_util_Random_do.nextInt(3);
            if (cs_0.cfr_renamed_3(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, 10)) {
                if (cs_0.boolean_int(n)) {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(1);
                    if ((0x15 ^ 0x11) == 0) {
                        return;
                    }
                } else {
                    AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                }
            }
        }
        AngelChip.duLieuNguoiChoi.cfr_renamed_2();
    }

    static {
        cs_0.cfr_renamed_12();
    }

            private static boolean boolean_for(int n) {
        return n > 0;
    }

    public final void cfr_renamed_8() {
        int n;
        ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_3 = (byte)0;
        AngelChip.duLieuNguoiChoi.var_java_util_Vector_if = new Vector();
        this.cfr_renamed_1();
        this.var_ei_new = new ei(MenuChinhAvatar.bl, 0);
        ef ef2 = new ef();
        int n2 = gc_0.var_java_util_Random_do.nextInt(this.var_java_util_Vector_do.size());
        ef2.var_short_do = ((ci)this.var_java_util_Vector_do.elementAt((int)n2)).var_short_do;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(ef2);
        ef2 = new ef();
        n2 = gc_0.var_java_util_Random_do.nextInt(this.var_java_util_Vector_for.size());
        ef2.var_short_do = ((ci)this.var_java_util_Vector_for.elementAt((int)n2)).var_short_do;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(ef2);
        ef2 = new ef();
        new ef().var_short_do = (short)4;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(ef2);
        ef2 = new ef();
        n2 = gc_0.var_java_util_Random_do.nextInt(this.var_java_util_Vector_if.size());
        ef2.var_short_do = ((ci)this.var_java_util_Vector_if.elementAt((int)n2)).var_short_do;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(ef2);
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(new ef(0));
        AngelChip.duLieuNguoiChoi.void_if();
        k k2 = k.k_do();
        int n3 = 150 * bn_0.cfr_renamed_6;
        int n4 = 170;
        if (cs_0.boolean_do(bn_0.cfr_renamed_6, 2)) {
            n = 120;
            if (((0x63 ^ 0x3D) & ~(0xC3 ^ 0x9D)) >= "   ".length()) {
                return;
            }
        } else {
            n = 0;
        }
        k2.cfr_renamed_0(MenuChinhAvatar.bD, n3, n4 + n, 1);
        super.cfr_renamed_8();
    }

    public final void (Graphics graphics != null) {
        GameCanvas.var_ef_0_do.cfr_renamed_4(graphics);
        GameCanvas.var_ef_0_do.cfr_renamed_1(graphics);
        GameCanvas.cfr_renamed_1(graphics);
        k.k_do().cfr_renamed_0(graphics);
        graphics.translate(k.k_do().cfr_renamed_2, k.k_do().soLuong);
        GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, this.soLuongKhoa, (int)this.var_byte_do, this.soLuong, this.var_int_if);
        super.cfr_renamed_0(graphics);
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }

        public final void void_if(int n) {
        switch (n) {
            case 0: {
                cs_0.cfr_renamed_5();
                return;
            }
            case 1: {
                cs_0.cfr_renamed_5();
            }
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_28, 0, this));
                vector.addElement(new ei(MenuChinhAvatar.aq, 1, this));
                GameCanvas.hienThongBaoPopup(MenuChinhAvatar.bK, vector);
            }
        }
    }
}

