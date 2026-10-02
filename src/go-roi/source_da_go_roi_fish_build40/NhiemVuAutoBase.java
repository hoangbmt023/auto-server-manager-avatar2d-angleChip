/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public abstract class NhiemVuAutoBase {
    protected long cfr_renamed_3;
    protected long cfr_renamed_4;
    protected long cfr_renamed_5 = 100L;
    private static final int[] mangSoNguyen;
    protected Vector cfr_renamed_2;
    public NhiemVuAutoBase nhiemVuHienTai;

    private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void cfr_renamed_30() {
        this.cfr_renamed_3 = System.currentTimeMillis();
    }

                protected abstract void d_();

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    /*
     * Unable to fully structure code
     */
    protected final int int_do(int var1_1) {
        block11: {
            var2_2 = 0;
            this.cfr_renamed_2 = null;
            ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
            if (!NhiemVuAutoBase.cfr_renamed_2((int)TienIchGame.cfr_renamed_4(15000L)) || !(this.cfr_renamed_2 != null)) break block11;
            var3_3 = 0;
            while ((var3_3 < this.cfr_renamed_2.size())) {
                block12: {
                    var4_4 = (cg)this.cfr_renamed_2.elementAt(var3_3);
                    if (!(var4_4 != null)) break block12;
                    var5_5 = 0;
                    switch (var1_1) {
                        case 0: {
                            if ((var4_4.var_short_do != 443) && (var4_4.var_short_do != 447) && !(var4_4.var_short_do == 448)) break;
                            var5_5 = 1;
                            if ("  ".length() != (35 ^ 39)) break;
                            return (149 ^ 138) & ~(73 ^ 86);
                        }
                        case 1: {
                            if ((var4_4.var_short_do != 444) && (var4_4.var_short_do != 449) && (!(var4_4.var_short_do >= 451) || !(var4_4.var_short_do <= 456))) break;
                            var5_5 = 1;
                            if (((6 ^ 33) & ~(20 ^ 51)) == 0) break;
                            return (160 ^ 148) & ~(86 ^ 98);
                        }
                        case 2: {
                            if (!(var4_4.var_short_do == 2135)) break;
                            ** GOTO lbl41
                        }
                        case 3: {
                            if (!(var4_4.var_short_do == 2136)) break;
                            if (((44 ^ 59) & ~(133 ^ 146)) > "   ".length()) {
                                return (32 ^ 53) & ~(118 ^ 99);
                            }
                            ** GOTO lbl41
                        }
                        case 4: {
                            if ((var4_4.var_short_do != 2135) && !(var4_4.var_short_do == 2136)) break;
lbl41:
                            // 3 sources

                            var5_5 = 1;
                        }
                    }
                    if ((var5_5 != 0)) {
                        ++var2_2;
                        ft_0.ft_0_do().void_do((int)var4_4.var_short_do, 1);
                        TienIchGame.void_if(50L);
                    }
                }
                ++var3_3;
                if (-"   ".length() <= 0) continue;
                return (211 ^ 138) & ~(2 ^ 91);
            }
        }
        this.cfr_renamed_2 = null;
        return var2_2;
    }

    protected static void cfr_renamed_20() {
        go_0.go_0_do().cfr_renamed_11();
        TienIchGame.dangXuatTaiKhoan();
        TienIchGame.hienThongBao(16000L);
    }

        public void void_for() {
        this.cfr_renamed_4 = System.currentTimeMillis();
        this.cfr_renamed_3 = System.currentTimeMillis();
        aU.cfr_renamed_1();
        aU.cfr_renamed_1(20L, 0);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[11];
        0 = (0x30 ^ 0x23) & ~(0x47 ^ 0x54);
        443 = -(0xFFFFF6E5 & 0x6F5B) & (0xFFFFFFFF & 0x67FB);
        447 = 0xFFFFD5BF & 0x2BFF;
        448 = -(0xFFFFDF37 & 0x78DE) & (0xFFFFFFDD & 0x59F7);
        1 = " ".length();
        444 = 0xFFFFFDFF & 0x3BC;
        449 = -(0xFFFFBD5F & 0x6AB9) & (0xFFFFB9DB & 0x6FFD);
        451 = 0xFFFF9FE7 & 0x61DB;
        456 = 0xFFFFF3C8 & 0xDFF;
        2135 = 0xFFFFB857 & 0x4FFF;
        2136 = -(0xFFFF97F5 & 0x7E8B) & (0xFFFF9EFB & 0x7FDC);
    }

        static {
        NhiemVuAutoBase.cfr_renamed_3();
    }

        public int int_do() {
        return 0;
    }

    public String java_lang_String_a_() {
        return "";
    }

    protected void void_do(String string) {
    }

        public String toString() {
        return "";
    }

    protected void (String string < String string2) {
    }

    public void cfr_renamed_5() {
    }

    protected void (int n < String string) {
    }

        public final void cfr_renamed_16() {
        if (NhiemVuAutoBase.cfr_renamed_0((System.currentTimeMillis() - this.cfr_renamed_3 < 300000L))) {
            aU.cfr_renamed_1();
            aU.cfr_renamed_1(50L, 0);
        }
        this.cfr_renamed_3 = System.currentTimeMillis();
    }

    protected boolean boolean_do(String string) {
        if (!NhiemVuAutoBase.boolean_do(string.startsWith("Khu vực đã đầy") ? 1 : 0) || !NhiemVuAutoBase.boolean_do(string.startsWith("Đi chầm chậm thôi chứ bạn") ? 1 : 0) || (string.startsWith("Bạn đã ở khu vực này"))) {
            TienIchGame.cfr_renamed_7();
            return 1;
        }
        if (NhiemVuAutoBase.boolean_do(ga_0.cfr_renamed_2 ? 1 : 0) && NhiemVuAutoBase.boolean_do(ga_0.dangChayAuto ? 1 : 0) && NhiemVuAutoBase.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat) && (string.startsWith("Thành phố tạm dừng để bảo trì"))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(900000L);
            return 1;
        }
        if ((ga_0.cfr_renamed_2) && (string.startsWith("Lỗi đọc dữ liệu"))) {
            TienIchGame.dangXuatTaiKhoan();
            ga_0.dangChayAuto = 0;
            return 0;
        }
        return 0;
    }

    public void void_a_() {
    }
}

