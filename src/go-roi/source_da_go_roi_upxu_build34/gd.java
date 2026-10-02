/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class gd {
    public int soLuong;
    public short var_short_do;
    public String chuoiGiaTri = "";
    public short var_short_if;
    public int[] mangSoNguyen = new int[var_int_arr_if[0]];
    public byte var_byte_do;
    private static int[] var_int_arr_if;

    private static void cfr_renamed_0() {
        var_int_arr_if = new int[2];
        gd.var_int_arr_if[0] = "  ".length();
        gd.var_int_arr_if[1] = (0x20 ^ 0x28) & ~(0xA ^ 2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static gd (Vector vector == int n) {
        int n2 = vector.size();
        int n3 = var_int_arr_if[1];
        while (!(n3 >= n2)) {
            gd gd2 = (gd)vector.elementAt(n3);
            if ((gd2.var_short_do == n)) {
                return gd2;
            }
            ++n3;
        }
        return null;
    }

            static {
        gd.cfr_renamed_0();
    }
}

