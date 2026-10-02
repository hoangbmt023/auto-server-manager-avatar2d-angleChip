/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Renamed from gZ
 */
public final class gz_0
extends bn_0 {
    private static final int[] mangSoNguyen;
    public static Hashtable var_java_util_Hashtable_do;
    public static boolean dangChayAuto;
    public static gz_0 var_gz_0_do;

    static {
        gz_0.cfr_renamed_2();
        var_java_util_Hashtable_do = new Hashtable();
        dangChayAuto = 1;
        var_gz_0_do = new gz_0();
    }

    public static void cfr_renamed_1() {
        Vector<ei> vector = new Vector<ei>();
        if ((AutoController.nhiemVuHienTai != null)) {
            vector.addElement(new ei("Tắt Auto", 4, fe_0.fe_0_do()));
            if (-" ".length() >= "   ".length()) {
                return;
            }
        } else {
            vector.addElement(new ei("Chăm sóc tất cả", new ac(0)));
            vector.addElement(new ei("Cây trồng", new ba_0()));
            vector.addElement(new ei("Vật nuôi", new fq()));
        }
        vector.addElement(new ei("Cửa hàng", 22, bF.bF_do()));
        vector.addElement(new ei("Chăm sóc thủ công", new bT()));
        vector.addElement(new ei(MenuChinhAvatar.aY, 20));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void void_if(int n) {
        switch (n) {
            case 0: {
                ak.var_ak_do.dangChayAuto = 1;
                return;
            }
            case 1: {
                AutoKimCuong.X_do().void_do();
                AutoController.cfr_renamed_0(AutoKimCuong.X_do());
                return;
            }
            case 2: {
                AutoController.tatAuto();
                return;
            }
            case 3: {
                fe_0.fe_0_do().cfr_renamed_1();
            }
        }
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[12];
        -2 = -"  ".length();
        -1 = -" ".length();
        2 = "  ".length();
        4 = 0x6E ^ 0x17 ^ (0xD ^ 0x70);
        36 = 0x20 ^ 4;
        21 = 14 + 103 - 112 + 149 ^ 9 + 130 - 61 + 65;
        22 = 0x8A ^ 0x9C;
        23 = 0x54 ^ 0x69 ^ (0x95 ^ 0xBF);
        28 = 0x64 ^ 0x78;
        20 = 0x58 ^ 0x76 ^ (0x7D ^ 0x47);
        0 = (0x52 ^ 0x33) & ~(0xEB ^ 0x8A);
        1 = " ".length();
    }

        public static void (short s2, String string, int n, int n2, int n3 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Nâng cấp auto", new am_0(1, s2, string, n, n2, n3)));
        vector.addElement(new ei("Nâng cấp thường", new am_0(2, s2, string, n, n2, n3)));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
    }

    public static void cfr_renamed_4() {
        Vector<ei> vector = new Vector<ei>();
        if ((AutoController.nhiemVuHienTai != null)) {
            vector.addElement(new ei("Tắt Auto", 4, fe_0.fe_0_do()));
            } else {
            vector.addElement(new ei("Smart Farm", 36, fe_0.fe_0_do()));
            vector.addElement(new ei("Cây trồng", new by_0()));
            vector.addElement(new ei("Vật nuôi", new ev()));
        }
        vector.addElement(new ei("Nhà bếp", 21, bF.bF_do()));
        vector.addElement(new ei("Cửa hàng", 22, bF.bF_do()));
        vector.addElement(new ei("Nhà kho", 23, bF.bF_do()));
        vector.addElement(new ei("Cài đặt Smart Farm", 28, fe_0.fe_0_do()));
        vector.addElement(new ei("Chăm sóc thủ công", new bT()));
        vector.addElement(new ei(MenuChinhAvatar.aY, 20));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
    }

    public static void cfr_renamed_5() {
        String string;
        Vector<ei> vector = new Vector<ei>();
        if (gz_0.boolean_if(var_java_util_Hashtable_do.isEmpty() ? 1 : 0)) {
            Enumeration enumeration = var_java_util_Hashtable_do.keys();
            while (gz_0.boolean_do(enumeration.hasMoreElements() ? 1 : 0)) {
                Object object = (String)enumeration.nextElement();
                object = (bf_0)var_java_util_Hashtable_do.get(object);
                vector.addElement(new ei(((bf_0)object).chuoiGiaTri, new gx_0(((bf_0)object).soLuong)));
                if (-"   ".length() < 0) continue;
                return;
            }
        }
        if (gz_0.boolean_if(vector.isEmpty() ? 1 : 0)) {
            vector.addElement(new ei("Xóa hết danh sách", new gx_0(-2)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (gz_0.boolean_do(dangChayAuto ? 1 : 0)) {
            string = "Tắt";
            if (" ".length() < -" ".length()) {
                return;
            }
        } else {
            string = "Bật";
        }
        vector.addElement(new ei(stringBuffer.append(string).append(" thu thập NPC").toString(), new gx_0(-1)));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
    }

    public static void (short s2 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei("Auto", new L(1, s2)));
        vector.addElement(new ei("Quay thường", new L(2, s2)));
        u_0.cfr_renamed_0().cfr_renamed_0(vector, 2);
    }

    public static void (String string, int n != null) {
        if (gz_0.boolean_do(dangChayAuto ? 1 : 0)) {
            var_java_util_Hashtable_do.put(string, new bf_0(n, string));
            }
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }
}

