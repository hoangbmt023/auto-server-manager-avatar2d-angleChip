/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from bM
 */
public final class bm_0
extends ei {
    private final int soLuong;
    private final ef duLieuNguoiChoi;
    private static final int[] mangSoNguyen;

    bm_0(ef ef2, int n, String string, cp cp2) {
        super(string, cp2);
        this.duLieuNguoiChoi = ef2;
        this.soLuong = n;
    }

    static {
        bm_0.cfr_renamed_3();
    }

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void cfr_renamed_0() {
        if ((em_0.var_boolean_int) && (this.soLuong == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.duLieuNguoiChoi.var_short_do);
            em_0.cfr_renamed_0(Z.cfr_renamed_0(this.duLieuNguoiChoi.var_short_do));
        }
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        ci_0.q_0_do(this.duLieuNguoiChoi.var_short_do).cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }
}

