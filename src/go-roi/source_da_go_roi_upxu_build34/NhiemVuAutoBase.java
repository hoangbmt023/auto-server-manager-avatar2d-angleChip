/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from fQ
 */
public abstract class NhiemVuAutoBase {
    protected long cfr_renamed_4;
    public NhiemVuAutoBase nhiemVuHienTai;
    protected long cfr_renamed_5 = 100L;
    private static final int[] mangSoNguyen;
    protected long cfr_renamed_2;
    protected Vector cfr_renamed_3;

    protected boolean boolean_do(String string) {
        if (!!(string.startsWith("Khu vực đã đầy")) || !!(string.startsWith("Đi chầm chậm thôi chứ bạn")) || NhiemVuAutoBase.boolean_do(string.startsWith("Bạn đã ở khu vực này") ? 1 : 0)) {
            TienIchGame.cfr_renamed_8();
            return 1;
        }
        if (!(gW.dangChayAuto) && !(gW.cfr_renamed_1) && (GameCanvas.var_dL_do instanceof ThongTinNhanVat == 0) && NhiemVuAutoBase.boolean_do(string.startsWith("Thành phố tạm dừng để bảo trì") ? 1 : 0)) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(900000L);
            return 1;
        }
        if (NhiemVuAutoBase.boolean_do(gW.dangChayAuto ? 1 : 0) && NhiemVuAutoBase.boolean_do(string.startsWith("Lỗi đọc dữ liệu") ? 1 : 0)) {
            TienIchGame.dangXuatTaiKhoan();
            gW.cfr_renamed_1 = 0;
            return 0;
        }
        return 0;
    }

    static {
        NhiemVuAutoBase.void_do();
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void cfr_renamed_13() {
        if (NhiemVuAutoBase.cfr_renamed_1((System.currentTimeMillis() - this.cfr_renamed_4 >= 300000L))) {
            w.cfr_renamed_0();
            w.cfr_renamed_0(50L, 0);
        }
        this.cfr_renamed_4 = System.currentTimeMillis();
    }

    public static boolean boolean_do() {
        if (NhiemVuAutoBase.boolean_do(GameCanvas.var_dL_do instanceof dN)) {
            dN.cfr_renamed_0().cfr_renamed_1();
            return 1;
        }
        if (NhiemVuAutoBase.boolean_do(GameCanvas.var_dL_do instanceof em_0)) {
            em_0.em_0_do().cfr_renamed_2();
            return 1;
        }
        return 0;
    }

            public int int_do() {
        return 0;
    }

        protected void (String string >= String string2) {
    }

        protected void (int n >= String string) {
    }

    protected abstract void void_for();

    public final void cfr_renamed_30() {
        this.cfr_renamed_4 = System.currentTimeMillis();
    }

    /*
     * Unable to fully structure code
     */
    protected final int int_do(int var1_1) {
        block11: {
            var2_2 = 0;
            this.cfr_renamed_3 = null;
            eq.eq_do().cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char);
            if (!NhiemVuAutoBase.boolean_do((int)TienIchGame.cfr_renamed_15(15000L)) || !(this.cfr_renamed_3 != null)) break block11;
            var3_3 = 0;
            while ((var3_3 < this.cfr_renamed_3.size())) {
                block12: {
                    var4_4 = (ef)this.cfr_renamed_3.elementAt(var3_3);
                    if (!(var4_4 != null)) break block12;
                    var5_5 = 0;
                    switch (var1_1) {
                        case 0: {
                            if ((var4_4.var_short_do != 443) && (var4_4.var_short_do != 447) && !(var4_4.var_short_do == 448)) break;
                            var5_5 = 1;
                            if (-" ".length() == -" ".length()) break;
                            return (95 ^ 66) & ~(74 ^ 87);
                        }
                        case 1: {
                            if ((var4_4.var_short_do != 444) && (var4_4.var_short_do != 449) && (!(var4_4.var_short_do >= 451) || !(var4_4.var_short_do <= 456))) break;
                            var5_5 = 1;
                            if (-"   ".length() <= 0) break;
                            return (239 ^ 161 ^ (250 ^ 176)) & (190 ^ 162 ^ (72 ^ 80) ^ -" ".length());
                        }
                        case 2: {
                            if (!(var4_4.var_short_do == 2135)) break;
                            if (" ".length() < 0) {
                                return (120 ^ 34 ^ (67 ^ 42)) & (62 ^ 16 ^ (9 ^ 20) ^ -" ".length());
                            }
                            ** GOTO lbl41
                        }
                        case 3: {
                            if (!(var4_4.var_short_do == 2136)) break;
                            if (" ".length() <= 0) {
                                return (109 ^ 83 ^ (180 ^ 178)) & (24 ^ 19 ^ (16 ^ 35) ^ -" ".length());
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
                    if (NhiemVuAutoBase.boolean_do(var5_5)) {
                        ++var2_2;
                        eq.eq_do().void_if((int)var4_4.var_short_do, 1);
                        TienIchGame.hienThongBao(50L);
                    }
                }
                ++var3_3;
                if (" ".length() > 0) continue;
                return (229 ^ 156 ^ (168 ^ 128)) & (209 ^ 186 ^ (31 ^ 37) ^ -" ".length());
            }
        }
        this.cfr_renamed_3 = null;
        return var2_2;
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public void void_if() {
        this.cfr_renamed_2 = System.currentTimeMillis();
        this.cfr_renamed_4 = System.currentTimeMillis();
        w.cfr_renamed_0();
        w.cfr_renamed_0(20L, 0);
    }

    protected void void_do(String string) {
    }

            public String toString() {
        return "";
    }

        private static void void_do() {
        mangSoNguyen = new int[11];
        0 = (0x3E ^ 0x1A ^ (0xA3 ^ 0xC3)) & (203 + 9 - 62 + 99 ^ 72 + 187 - 82 + 12 ^ -" ".length());
        1 = " ".length();
        443 = -(0xFFFF9EB1 & 0x7D4F) & (0xFFFFFFBF & 0x1DFB);
        447 = 0xFFFFDDFF & 0x23BF;
        448 = 0xFFFFFDD5 & 0x3EA;
        444 = -(0xFFFFEFF4 & 0x3E4F) & (0xFFFFAFFF & Short.MAX_VALUE);
        449 = -(0xFFFFEED3 & 0x5F3F) & (0xFFFFEFDF & 0x5FF3);
        451 = -(0xFFFFEA61 & 0x57BF) & (0xFFFFF7E7 & 0x4BFB);
        456 = -(0xFFFFFF36 & 0x2EDF) & (0xFFFFEFFF & 0x3FDD);
        2135 = -(0xFFFFFF97 & 0x6169) & (0xFFFFED7F & 0x7BD7);
        2136 = 0xFFFFEBFF & 0x1C58;
    }

        protected static void cfr_renamed_22() {
        fe_0.fe_0_do().cfr_renamed_21();
        TienIchGame.dangXuatTaiKhoan();
        TienIchGame.void_if(16000L);
    }

    public String java_lang_String_do() {
        return "";
    }
}

