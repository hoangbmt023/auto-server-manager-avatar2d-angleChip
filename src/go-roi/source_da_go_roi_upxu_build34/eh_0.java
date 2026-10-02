/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eH
 */
public class eh_0
extends ha {
    public int cfr_renamed_10 = 0;
    public byte var_byte_do;
    private static int[] mangSoNguyen;

        /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_3() {
        if (!(this.coKichHoat) && (this.cfr_renamed_10 == this.cfr_renamed_12)) {
            this.cfr_renamed_1();
            return;
        }
        eq_0 eq_02 = new eq_0();
        if ((this.coKichHoat) && (bF.var_java_util_Vector_arr_do[this.var_byte_do].size() != null)) {
            fa fa2 = this.fa_do();
            if ((fa2 != null)) {
                eq_02.var_int_if = ((aG)fa2).cfr_renamed_3;
                eq_02.soLuong = fa2.var_int_if;
                ((bk_0)this).cfr_renamed_18 = 2;
                this.var_eq_0_for = eq_02;
                return;
            }
            this.cfr_renamed_1();
            return;
        }
        int n = ef_0.var_java_util_Vector_do.size();
        int n2 = 0;
        while (!(n2 >= n)) {
            bk_0 bk_02 = (bk_0)ef_0.var_java_util_Vector_do.elementAt(n2);
            if ((bk_02 instanceof eh_0 != 0) && (bk_02.cfr_renamed_12 == this.cfr_renamed_10)) {
                eq_02 = new eq_0(((aG)bk_02).cfr_renamed_3, bk_02.var_int_if);
                if ("  ".length() != 0) break;
                return;
            }
            ++n2;
        }
        if ((this.var_byte_do != 1) && eh_0.cfr_renamed_3(ef_0.boolean_if(((aG)this).cfr_renamed_3, this.var_int_if) ? 1 : 0)) {
            this.cfr_renamed_1();
            return;
        }
        this.cfr_renamed_0(eq_02);
    }

    public fa fa_do() {
        return (fa)bF.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(gc_0.int_do(bF.var_java_util_Vector_arr_do[this.var_byte_do].size()));
    }

            public final void cfr_renamed_15() {
        if ((bF.var_java_util_Vector_arr_do[this.var_byte_do].size() == 0)) {
            this.coKichHoat = 0;
            return;
        }
        if (!(this.cfr_renamed_5) || (this.coKichHoat)) {
            return;
        }
        this.coKichHoat = 1;
    }

    static {
        eh_0.cfr_renamed_12();
    }

    public void cfr_renamed_2() {
    }

            public eh_0(int n, byte by2) {
        super(n, by2);
    }

    public void (eq_0 eq_02 != null) {
    }

            public final void cfr_renamed_8() {
        super.cfr_renamed_8();
        if (!(this.coKichHoat) && (this.cfr_renamed_12 == this.cfr_renamed_10) && (this.cfr_renamed_13 > 150)) {
            this.cfr_renamed_13 = 150;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_5() {
        block5: {
            var1_1 = bF.var_java_util_Vector_arr_do[this.var_byte_do].size();
            if (!eh_0.cfr_renamed_1((int)this.cfr_renamed_5) || !eh_0.cfr_renamed_1((int)this.coKichHoat) || !(var1_1 != null)) break block5;
            var2_2 = 0;
            if ("   ".length() > 0) ** GOTO lbl34
            return;
lbl-1000:
            // 1 sources

            {
                var3_3 = (fa)bF.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(var2_2);
                if ((gc_0.int_if(var3_3.cfr_renamed_3 - this.cfr_renamed_3) <= 2) && (gc_0.int_if(var3_3.var_int_if - this.var_int_if) <= 2)) {
                    bF.var_java_util_Vector_arr_do[this.var_byte_do].removeElement(var3_3);
                    ef_0.var_java_util_Vector_int.removeElement(var3_3);
                    this.cfr_renamed_5 = 0;
                    this.coKichHoat = 0;
                    this.cfr_renamed_18 = 1;
                    bF.bF_do();
                    bF.cfr_renamed_0(var3_3.var_short_do, this.cfr_renamed_12);
                    if ((99 ^ 93 ^ (128 ^ 186)) >= "   ".length()) break;
                    return;
                }
                ++var2_2;
lbl34:
                // 2 sources

                ** while (!eh_0.cfr_renamed_15((int)var2_2, (int)var1_1))
            }
        }
        super.cfr_renamed_5();
        v0 = 100;
        if ((this.cfr_renamed_10 != this.cfr_renamed_12)) {
            v1 = this.var_byte_do * gc_0.int_do(70);
            if (((100 ^ 60) & ~(208 ^ 136)) != 0) {
                return;
            }
        } else {
            v1 = 0;
        }
        this.cfr_renamed_30 = v0 - v1;
    }

        public void void_do() {
        super.void_do();
    }

        private static void cfr_renamed_12() {
        mangSoNguyen = new int[6];
        0 = (0xBE ^ 0x82) & ~(0x27 ^ 0x1B);
        150 = 5 + 1 - -68 + 54 + (19 + 71 - 63 + 120) - (7 + 113 - 67 + 88) + (0x34 ^ 0x24);
        2 = "  ".length();
        1 = " ".length();
        100 = 0xEA ^ 0x8E;
        70 = 0xFD ^ 0x89 ^ (0x4E ^ 0x7C);
    }
}

