/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

final class dT
implements cp {
    private static final int[] mangSoNguyen;
    private final byte var_byte_do;

    public dT(byte by2) {
        this.var_byte_do = by2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[13];
        1 = " ".length();
        51 = 0x54 ^ 0x67;
        55 = 69 + 124 - 97 + 76 ^ 100 + 141 - 114 + 28;
        60 = 165 + 145 - 160 + 41 ^ 32 + 59 - 46 + 86;
        -2 = -"  ".length();
        50 = 0x67 ^ 0x10 ^ (0xD2 ^ 0x97);
        56 = 84 + 12 - -46 + 6 ^ 155 + 75 - 117 + 59;
        54 = 0x1E ^ 0x28;
        59 = 0x57 ^ 0x6C;
        52 = 0x48 ^ 0x7C;
        58 = 0x16 ^ 8 ^ (0x11 ^ 0x35);
        61 = 0x62 ^ 0x5F;
        -1 = -" ".length();
    }

        public final void void_do() {
        Vector<bd_0> vector = new Vector<bd_0>();
        if ((this.var_byte_do == 1)) {
            vector.addElement(new bd_0("bo.png", "Bán bò", new N(51)));
            vector.addElement(new bd_0("cuu.png", "Bán cừu", new N(55)));
            vector.addElement(new bd_0("de.png", "Bán dê", new N(60)));
            vector.addElement(new bd_0("ban.png", "Bán hết", new N(-2)));
            if (" ".length() < " ".length()) {
                return;
            }
        } else {
            vector.addElement(new bd_0("ga.png", "Bán gà", new N(50)));
            vector.addElement(new bd_0("vit.png", "Bán vịt", new N(56)));
            vector.addElement(new bd_0("ca.png", "Bán cá", new N(54)));
            vector.addElement(new bd_0("rua.png", "Bán rùa", new N(59)));
            vector.addElement(new bd_0("heo.png", "Bán heo", new N(52)));
            vector.addElement(new bd_0("trau.png", "Bán trâu", new N(58)));
            vector.addElement(new bd_0("tho.png", "Bán thỏ", new N(61)));
            vector.addElement(new bd_0("ban.png", "Bán hết", new N(-1)));
        }
        bF.cfr_renamed_0(vector);
    }

    static {
        dT.cfr_renamed_1();
    }
}

