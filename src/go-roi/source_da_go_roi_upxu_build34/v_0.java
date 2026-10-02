/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from v
 */
public final class v_0 {
    int soLuong;
    int[] mangSoNguyen;
    byte[] var_byte_arr_do;
    private static int[] var_int_arr_for;
    int var_int_if;
    byte[] var_byte_arr_if;
    int[] var_int_arr_if;
    byte[] var_byte_arr_for;

    private static void cfr_renamed_0() {
        var_int_arr_for = new int[8];
        v_0.var_int_arr_for[0] = "   ".length();
        v_0.var_int_arr_for[1] = (58 + 33 - -12 + 34 ^ 123 + 11 - 0 + 8) & (106 + 133 - 107 + 30 ^ 159 + 112 - 120 + 14 ^ -" ".length());
        v_0.var_int_arr_for[2] = 0x7B ^ 0x73;
        v_0.var_int_arr_for[3] = 0x75 ^ 0x61;
        v_0.var_int_arr_for[4] = "  ".length();
        v_0.var_int_arr_for[5] = " ".length();
        v_0.var_int_arr_for[6] = -" ".length();
        v_0.var_int_arr_for[7] = 0x3C ^ 0x3A;
    }

        static {
        v_0.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     */
    public v_0(int n, int n2) {
        this.var_int_if = n;
        this.soLuong = n2;
        this.var_int_arr_if = new int[var_int_arr_for[0]];
        this.mangSoNguyen = new int[var_int_arr_for[0]];
        this.var_byte_arr_for = new byte[var_int_arr_for[0]];
        this.var_byte_arr_if = new byte[var_int_arr_for[0]];
        this.var_byte_arr_do = new byte[var_int_arr_for[0]];
        n = var_int_arr_for[1];
        while (!(n >= var_int_arr_for[0])) {
            int n3;
            this.var_byte_arr_for[n] = (byte)gc_0.int_do(var_int_arr_for[2]);
            this.mangSoNguyen[n] = -n * var_int_arr_for[3];
            if ((gc_0.int_do(var_int_arr_for[4]) == 0)) {
                n3 = var_int_arr_for[5];
                if (" ".length() >= "  ".length()) {
                    throw null;
                }
            } else {
                n3 = var_int_arr_for[6];
            }
            this.var_byte_arr_if[n] = (byte)n3;
            this.var_byte_arr_do[n] = var_int_arr_for[7];
            ++n;
        }
    }

    }

