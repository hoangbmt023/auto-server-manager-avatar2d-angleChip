/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from eE
 */
public final class ee_0 {
    public byte var_byte_do;
    public short var_short_do;
    public String chuoiGiaTri = "";
    private static int[] var_int_arr_if;
    public short var_short_if;
    public int soLuong;
    public int[] mangSoNguyen = new int[var_int_arr_if[0]];

    private static void cfr_renamed_1() {
        var_int_arr_if = new int[2];
        ee_0.var_int_arr_if[0] = "  ".length();
        ee_0.var_int_arr_if[1] = (0xE9 ^ 0xAE ^ (0x86 ^ 0x8D)) & (0x38 ^ 0x6B ^ (0x8A ^ 0x95) ^ -" ".length());
    }

    /*
     * Unable to fully structure code
     */
    public static ee_0 (Vector var0 == int var1_1) {
        var2_2 = var0.size();
        var3_3 = ee_0.var_int_arr_if[1];
        if ("   ".length() > "  ".length()) ** GOTO lbl11
        return null;
lbl-1000:
        // 1 sources

        {
            var4_4 = (ee_0)var0.elementAt(var3_3);
            if ((var4_4.var_short_if == var1_1)) {
                return var4_4;
            }
            ++var3_3;
lbl11:
            // 2 sources

            ** while (!ee_0.cfr_renamed_0((int)var3_3, (int)var2_2))
        }
lbl12:
        // 1 sources

        return null;
    }

            static {
        ee_0.cfr_renamed_1();
    }
}

