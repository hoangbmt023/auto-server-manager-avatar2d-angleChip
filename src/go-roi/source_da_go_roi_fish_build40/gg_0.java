/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Renamed from gg
 */
public final class gg_0
extends dF {
    private static final int[] mangSoNguyen;
    public static boolean dangChayAuto;
    public static gg_0 var_gg_0_do;
    public static Hashtable var_java_util_Hashtable_do;

    public static void (short s2, String string, int n, int n2, int n3 != 0) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Nâng cấp auto", new am_0(1, s2, string, n, n2, n3)));
        vector.addElement(new fl_0("Nâng cấp thường", new am_0(2, s2, string, n, n2, n3)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public static void cfr_renamed_0() {
        Vector<fl_0> vector = new Vector<fl_0>();
        if ((AutoController.nhiemVuHienTai != 0)) {
            vector.addElement(new fl_0("Tắt Auto", 4, go_0.go_0_do()));
            } else {
            vector.addElement(new fl_0("Smart Farm", 36, go_0.go_0_do()));
            vector.addElement(new fl_0("Cây trồng", new D()));
            vector.addElement(new fl_0("Vật nuôi", new cd_0()));
        }
        vector.addElement(new fl_0("Nhà bếp", 21, dR.dR_do()));
        vector.addElement(new fl_0("Cửa hàng", 22, dR.dR_do()));
        vector.addElement(new fl_0("Nhà kho", 23, dR.dR_do()));
        vector.addElement(new fl_0("Cài đặt Smart Farm", 28, go_0.go_0_do()));
        vector.addElement(new fl_0("Chăm sóc thủ công", new s_0()));
        vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_34, 20));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void cfr_renamed_2() {
        String string;
        Vector<fl_0> vector = new Vector<fl_0>();
        if (!(var_java_util_Hashtable_do.isEmpty())) {
            Enumeration enumeration = var_java_util_Hashtable_do.keys();
            while ((enumeration.hasMoreElements())) {
                Object object = (String)enumeration.nextElement();
                object = (bl_0)var_java_util_Hashtable_do.get(object);
                vector.addElement(new fl_0(((bl_0)object).chuoiGiaTri, new gc_0(((bl_0)object).soLuong)));
                if (((0x35 ^ 2 ^ (0x26 ^ 6)) & (0x2F ^ 0x51 ^ (0x41 ^ 0x28) ^ -" ".length())) == 0) continue;
                return;
            }
        }
        if (!(vector.isEmpty())) {
            vector.addElement(new fl_0("Xóa hết danh sách", new gc_0(-2)));
        }
        StringBuffer stringBuffer = new StringBuffer();
        if ((dangChayAuto)) {
            string = "Tắt";
            } else {
            string = "Bật";
        }
        vector.addElement(new fl_0(stringBuffer.append(string).append(" thu thập NPC").toString(), new gc_0(-1)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                cl.var_cl_do.dangChayAuto = 1;
                return;
            }
            case 1: {
                aj.aj_do().cfr_renamed_4();
                AutoController.cfr_renamed_1(aj.aj_do());
                return;
            }
            case 2: {
                AutoController.tatAuto();
                return;
            }
            case 3: {
                go_0.go_0_do().cfr_renamed_9();
            }
        }
    }

    static {
        gg_0.cfr_renamed_4();
        var_java_util_Hashtable_do = new Hashtable();
        dangChayAuto = 1;
        var_gg_0_do = new gg_0();
    }

            public static void (short s2 != 0) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0("Auto: Giữ cần câu", new V(1, s2, 0)));
        vector.addElement(new fl_0("Auto: Bỏ tất cả", new V(1, s2, 1)));
        vector.addElement(new fl_0("Auto: Giữ tất cả", new V(1, s2, 2)));
        vector.addElement(new fl_0("Quay thường", new V(2, s2, -1)));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 2);
    }

        private static void cfr_renamed_4() {
        mangSoNguyen = new int[12];
        -2 = -"  ".length();
        -1 = -" ".length();
        2 = "  ".length();
        4 = 0xA2 ^ 0xA6;
        36 = 9 ^ 0x3E ^ (0x7D ^ 0x6E);
        21 = 0x68 ^ 0x51 ^ (0x71 ^ 0x5D);
        22 = 0x3A ^ 0x2C;
        23 = 0x76 ^ 0x72 ^ (0x52 ^ 0x41);
        28 = 0xAB ^ 0xBB ^ (0x49 ^ 0x45);
        20 = 0xCF ^ 0x98 ^ (0xC2 ^ 0x81);
        0 = (0x2B ^ 0x39) & ~(0xBD ^ 0xAF);
        1 = " ".length();
    }

    public static void cfr_renamed_3() {
        Vector<fl_0> vector = new Vector<fl_0>();
        if ((AutoController.nhiemVuHienTai != 0)) {
            vector.addElement(new fl_0("Tắt Auto", 4, go_0.go_0_do()));
            if ((0x6B ^ 0x6E) == 0) {
                return;
            }
        } else {
            vector.addElement(new fl_0("Chăm sóc tất cả", new cb(0)));
            vector.addElement(new fl_0("Cây trồng", new bg_0()));
            vector.addElement(new fl_0("Vật nuôi", new gl_0()));
        }
        vector.addElement(new fl_0("Cửa hàng", 22, dR.dR_do()));
        vector.addElement(new fl_0("Chăm sóc thủ công", new s_0()));
        vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_34, 20));
        aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
    }

    public static void (String string, int n != 0) {
        if ((dangChayAuto)) {
            var_java_util_Hashtable_do.put(string, new bl_0(n, string));
            }
    }
}

