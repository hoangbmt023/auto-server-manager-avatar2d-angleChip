/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from cM
 */
final class cm_0
implements cp {
    private final byte var_byte_do;
    final es var_es_do;
    private final int soLuong;
    private static int[] mangSoNguyen;
    private final String chuoiGiaTri;
    private final String[] var_java_lang_String_arr_do;
    private final byte[] var_byte_arr_do;

    /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        Vector<ei> vector = new Vector<ei>();
        if (!(es.cfr_renamed_0(this.var_es_do)) && (this.chuoiGiaTri.equals(es.chuoiGiaTri))) {
            vector.addElement(new ei(MenuChinhAvatar.bE, 50));
        }
        int n = 0;
        while (!(n >= this.var_java_lang_String_arr_do.length)) {
            int n2 = n;
            vector.addElement(new ei(this.var_java_lang_String_arr_do[n], new cp_0(this, this.soLuong, this.var_byte_do, this.var_byte_arr_do, n2)));
            ++n;
        }
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    cm_0(es es2, String string, String[] stringArray, int n, byte by2, byte[] byArray) {
        this.var_es_do = es2;
        this.chuoiGiaTri = string;
        this.var_java_lang_String_arr_do = stringArray;
        this.soLuong = n;
        this.var_byte_do = by2;
        this.var_byte_arr_do = byArray;
    }

    static {
        cm_0.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        50 = 0x93 ^ 0xA1;
        0 = (0x3B ^ 0x2A) & ~(0x4C ^ 0x5D);
    }

        }

