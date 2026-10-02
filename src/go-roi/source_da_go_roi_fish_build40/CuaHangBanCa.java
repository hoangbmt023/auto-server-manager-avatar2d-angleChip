/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class CuaHangBanCa
implements de {
    private final byte var_byte_do;
    private static final int[] mangSoNguyen;

    public CuaHangBanCa(byte by2) {
        this.var_byte_do = by2;
    }

    static {
        CuaHangBanCa.cfr_renamed_0();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[13];
        1 = " ".length();
        51 = 7 ^ 0x34;
        55 = 0x50 ^ 0x67;
        60 = 0x79 ^ 0x45;
        -2 = -"  ".length();
        50 = 0x7A ^ 0x5B ^ (0xB5 ^ 0xA6);
        56 = 110 + 28 - 65 + 80 ^ 81 + 155 - 136 + 61;
        54 = 88 + 98 - 163 + 105 ^ 22 + 173 - 113 + 100;
        59 = 39 + 47 - -54 + 3 ^ 159 + 177 - 204 + 48;
        52 = 0x6C ^ 0x58;
        58 = 0x24 ^ 0x1E;
        61 = 0x7C ^ 0x41;
        -1 = -" ".length();
    }

        public final void void_do() {
        Vector<bj_0> vector = new Vector<bj_0>();
        if ((this.var_byte_do == 1)) {
            vector.addElement(new bj_0("bo.png", "Bán bò", new Z(51)));
            vector.addElement(new bj_0("cuu.png", "Bán cừu", new Z(55)));
            vector.addElement(new bj_0("de.png", "Bán dê", new Z(60)));
            vector.addElement(new bj_0("ban.png", "Bán hết", new Z(-2)));
            if ((0x56 ^ 0x53) <= 0) {
                return;
            }
        } else {
            vector.addElement(new bj_0("ga.png", "Bán gà", new Z(50)));
            vector.addElement(new bj_0("vit.png", "Bán vịt", new Z(56)));
            vector.addElement(new bj_0("ca.png", "Bán cá", new Z(54)));
            vector.addElement(new bj_0("rua.png", "Bán rùa", new Z(59)));
            vector.addElement(new bj_0("heo.png", "Bán heo", new Z(52)));
            vector.addElement(new bj_0("trau.png", "Bán trâu", new Z(58)));
            vector.addElement(new bj_0("tho.png", "Bán thỏ", new Z(61)));
            vector.addElement(new bj_0("ban.png", "Bán hết", new Z(-1)));
        }
        dR.cfr_renamed_1(vector);
    }
}

