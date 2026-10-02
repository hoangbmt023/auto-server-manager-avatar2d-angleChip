/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from gc
 */
final class gc_0
implements de {
    private static final int[] mangSoNguyen;
    private final int soLuong;

    public gc_0(int n) {
        this.soLuong = n;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        -1 = -" ".length();
        1 = " ".length();
        0 = (0xA1 ^ 0x95 ^ (2 ^ 7)) & (0x56 ^ 0x4C ^ (0x73 ^ 0x58) ^ -" ".length());
        -2 = -"  ".length();
    }

    public final void void_do() {
        if ((this.soLuong == -1)) {
            int n;
            if (!(gg_0.dangChayAuto)) {
                n = 1;
                } else {
                n = 0;
            }
            gg_0.dangChayAuto = n;
            return;
        }
        if ((this.soLuong == -2)) {
            gg_0.var_java_util_Hashtable_do.clear();
            return;
        }
        ft_0.ft_0_do().cfr_renamed_4(this.soLuong);
    }

        static {
        gc_0.cfr_renamed_0();
    }

    }

