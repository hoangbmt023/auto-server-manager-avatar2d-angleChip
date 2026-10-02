/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class ev
implements cp {
    private static final int[] cfr_renamed_0;

    public final void void_do() {
        Vector<bd_0> vector = new Vector<bd_0>();
        vector.addElement(new bd_0("choan.png", "Cho ăn", new AutoFarm(cfr_renamed_0[0], null)));
        vector.addElement(new bd_0("chuabenh.png", "Chữa bệnh", new AutoFarm(cfr_renamed_0[1], null)));
        vector.addElement(new bd_0("thuocbo.png", "Thuốc bổ", new AutoFarm(cfr_renamed_0[2], null)));
        vector.addElement(new bd_0("thuhoach.png", "Thu hoạch", new AutoFarm(cfr_renamed_0[3], null)));
        vector.addElement(new bd_0("coin.png", "Bán vật nuôi (xu)", new dT(cfr_renamed_0[4])));
        vector.addElement(new bd_0("gold.png", "Bán vật nuôi (lượng)", new dT(cfr_renamed_0[5])));
        bF.cfr_renamed_0(vector);
    }

    static {
        ev.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[6];
        ev.cfr_renamed_0[0] = 0x82 ^ 0x85;
        ev.cfr_renamed_0[1] = 0xA8 ^ 0x8B ^ (0x59 ^ 0x72);
        ev.cfr_renamed_0[2] = 0x14 ^ 0x1D;
        ev.cfr_renamed_0[3] = 0x2B ^ 0x21;
        ev.cfr_renamed_0[4] = (97 + 164 - 224 + 154 ^ 103 + 122 - 149 + 66) & (0x58 ^ 0x15 ^ (0x73 ^ 0xF) ^ -" ".length());
        ev.cfr_renamed_0[5] = " ".length();
    }

    ev() {
    }
}

