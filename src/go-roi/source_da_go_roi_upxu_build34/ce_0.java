/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cE
 */
final class ce_0
implements cp {
    private static int[] cfr_renamed_0;

    private static void cfr_renamed_1() {
        cfr_renamed_0 = new int[3];
        ce_0.cfr_renamed_0[0] = 0xA7 ^ 0xAC;
        ce_0.cfr_renamed_0[1] = 180 + 107 - 184 + 84 ^ 120 + 59 - 145 + 144;
        ce_0.cfr_renamed_0[2] = 0x16 ^ 0x1C;
    }

    static {
        ce_0.cfr_renamed_1();
    }

    ce_0() {
    }

    public final void void_do() {
        String string = MenuChinhAvatar.V;
        switch (fw.cfr_renamed_0().soLuongKhoa) {
            case 0: {
                eq.eq_do().cfr_renamed_17(cfr_renamed_0[0]);
                if (((0x7F ^ 0x3F) & ~(0x57 ^ 0x17)) >= ((9 ^ 0x5F) & ~(0xE5 ^ 0xB3))) break;
                return;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                eq.eq_do().cfr_renamed_17(cfr_renamed_0[1]);
                if (" ".length() >= 0) break;
                return;
            }
            case 7: {
                eq.eq_do().cfr_renamed_17(cfr_renamed_0[2]);
            }
        }
        GameCanvas.cfr_renamed_4(String.valueOf(string) + MenuChinhAvatar.var_java_lang_String_arr_this[fw.cfr_renamed_0().soLuongKhoa] + "...");
    }
}

