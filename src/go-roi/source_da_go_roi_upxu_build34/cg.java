/*
 * Decompiled with CFR 0.152.
 */
final class cg
implements cp {
    private final DuLieuNguoiChoi duLieuNguoiChoi;
    private static int[] mangSoNguyen;

    cg(DuLieuNguoiChoi dd_02) {
        this.duLieuNguoiChoi = dd_02;
    }

    static {
        cg.cfr_renamed_1();
    }

    public final void void_do() {
        em em2 = dN.cfr_renamed_0().em_do(dN.cfr_renamed_0().cfr_renamed_1);
        if ((es.var_java_util_Vector_if != null)) {
            es.cfr_renamed_0();
            es.cfr_renamed_4();
        }
        el_0.el_0_do().cfr_renamed_0(((bk_0)this.duLieuNguoiChoi).cfr_renamed_12, 1);
        dN.cfr_renamed_0().cfr_renamed_1(em2);
        GameCanvas.cfr_renamed_1(String.valueOf(MenuChinhAvatar.aX) + MenuChinhAvatar.ah + this.duLieuNguoiChoi.chuoiGiaTri + ".");
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }

    }

