/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

/*
 * Renamed from cD
 */
final class cd_0
implements de {
    private static final int[] cfr_renamed_1;

    public final void void_do() {
        Vector<bj_0> vector = new Vector<bj_0>();
        vector.addElement(new bj_0("choan.png", "Cho ăn", new AutoFarm(cfr_renamed_1[0], null)));
        vector.addElement(new bj_0("chuabenh.png", "Chữa bệnh", new AutoFarm(cfr_renamed_1[1], null)));
        vector.addElement(new bj_0("thuocbo.png", "Thuốc bổ", new AutoFarm(cfr_renamed_1[2], null)));
        vector.addElement(new bj_0("thuhoach.png", "Thu hoạch", new AutoFarm(cfr_renamed_1[3], null)));
        vector.addElement(new bj_0("coin.png", "Bán vật nuôi (xu)", new CuaHangBanCa(cfr_renamed_1[4])));
        vector.addElement(new bj_0("gold.png", "Bán vật nuôi (lượng)", new CuaHangBanCa(cfr_renamed_1[5])));
        dR.cfr_renamed_1(vector);
    }

    private static void cfr_renamed_0() {
        cfr_renamed_1 = new int[6];
        cd_0.cfr_renamed_1[0] = 110 + 30 - 15 + 17 ^ 102 + 19 - 110 + 126;
        cd_0.cfr_renamed_1[1] = 0x14 ^ 7 ^ (0x7B ^ 0x60);
        cd_0.cfr_renamed_1[2] = 74 + 152 - 167 + 102 ^ 67 + 14 - 67 + 154;
        cd_0.cfr_renamed_1[3] = 0x38 ^ 0x32;
        cd_0.cfr_renamed_1[4] = (0xF ^ 0x6C) & ~(0xDD ^ 0xBE);
        cd_0.cfr_renamed_1[5] = " ".length();
    }

    cd_0() {
    }

    static {
        cd_0.cfr_renamed_0();
    }
}

