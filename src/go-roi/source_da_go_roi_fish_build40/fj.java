/*
 * Decompiled with CFR 0.152.
 */
public class fj
extends hs {
    public int cfr_renamed_14 = 0;
    private static int[] mangSoNguyen;
    public byte var_byte_do;

    public void cfr_renamed_6() {
    }

                    public final void cfr_renamed_5() {
        if ((dR.var_java_util_Vector_arr_do[this.var_byte_do].size() == 0)) {
            this.cfr_renamed_4 = 0;
            return;
        }
        if (!(this.coKichHoat) || (this.cfr_renamed_4)) {
            return;
        }
        this.cfr_renamed_4 = 1;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_2() {
        block5: {
            var1_1 = dR.var_java_util_Vector_arr_do[this.var_byte_do].size();
            if (!fj.cfr_renamed_2((int)this.coKichHoat) || !fj.cfr_renamed_2((int)this.cfr_renamed_4) || !(var1_1 > 0)) break block5;
            var2_2 = 0;
            if (" ".length() >= 0) ** GOTO lbl34
            return;
lbl-1000:
            // 1 sources

            {
                var3_3 = (gb_0)dR.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(var2_2);
                if ((hg.int_do(var3_3.cfr_renamed_2 - this.cfr_renamed_2) <= 2) && (hg.int_do(var3_3.cfr_renamed_3 - this.cfr_renamed_3) <= 2)) {
                    dR.var_java_util_Vector_arr_do[this.var_byte_do].removeElement(var3_3);
                    fh.var_java_util_Vector_int.removeElement(var3_3);
                    this.coKichHoat = 0;
                    this.cfr_renamed_4 = 0;
                    this.var_int_case = 1;
                    dR.dR_do();
                    dR.cfr_renamed_1(var3_3.var_short_do, this.cfr_renamed_9);
                    if (-" ".length() < " ".length()) break;
                    return;
                }
                ++var2_2;
lbl34:
                // 2 sources

                ** while (!fj.cfr_renamed_6((int)var2_2, (int)var1_1))
            }
        }
        super.cfr_renamed_2();
        v0 = 100;
        if ((this.cfr_renamed_14 != this.cfr_renamed_9)) {
            v1 = this.var_byte_do * hg.int_new(70);
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            v1 = 0;
        }
        this.cfr_renamed_18 = v0 - v1;
    }

    public final void cfr_renamed_7() {
        super.cfr_renamed_7();
        if (!(this.cfr_renamed_4) && fj.cfr_renamed_5(((dd_0)this).cfr_renamed_9, this.cfr_renamed_14) && (this.this > 150)) {
            this.this = 150;
        }
    }

        public fj(int n, byte by2) {
        super(n, by2);
    }

            private static void cfr_renamed_8() {
        mangSoNguyen = new int[6];
        0 = (0xA3 ^ 0x8A) & ~(0x68 ^ 0x41);
        150 = (0x6B ^ 3) + (0xD6 ^ 0xA6) - (192 + 55 - 225 + 174) + (7 + 129 - 66 + 60);
        2 = "  ".length();
        1 = " ".length();
        100 = 0xC4 ^ 0xA0;
        70 = 0x3A ^ 0x15 ^ (0xC9 ^ 0xA0);
    }

    public void (fs fs2 == 0) {
    }

        static {
        fj.cfr_renamed_8();
    }

        public gb_0 gb_0_do() {
        return (gb_0)dR.var_java_util_Vector_arr_do[this.var_byte_do].elementAt(hg.int_new(dR.var_java_util_Vector_arr_do[this.var_byte_do].size()));
    }

    public void void_do() {
        super.void_do();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_0() {
        if (!(this.cfr_renamed_4) && fj.cfr_renamed_5(this.cfr_renamed_14, ((dd_0)this).cfr_renamed_9)) {
            this.cfr_renamed_3();
            return;
        }
        fs fs2 = new fs();
        if ((this.cfr_renamed_4) && (dR.var_java_util_Vector_arr_do[this.var_byte_do].size() > 0)) {
            gb_0 gb_02 = this.gb_0_do();
            if ((gb_02 == 0)) {
                fs2.soLuong = ((bm)gb_02).cfr_renamed_2;
                fs2.var_int_if = ((bm)gb_02).cfr_renamed_3;
                this.var_int_case = 2;
                this.var_fs_for = fs2;
                return;
            }
            this.cfr_renamed_3();
            return;
        }
        int n = fh.var_java_util_Vector_case.size();
        int n2 = 0;
        while (!(n2 >= n)) {
            dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n2);
            if ((dd_02 instanceof fj != 0) && (dd_02.cfr_renamed_9 == this.cfr_renamed_14)) {
                fs2 = new fs(((bm)dd_02).cfr_renamed_2, ((bm)dd_02).cfr_renamed_3);
                break;
            }
            ++n2;
        }
        if ((this.var_byte_do != 1) && fj.cfr_renamed_1(fh.boolean_do(((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3) ? 1 : 0)) {
            this.cfr_renamed_3();
            return;
        }
        this.cfr_renamed_1(fs2);
    }
}

