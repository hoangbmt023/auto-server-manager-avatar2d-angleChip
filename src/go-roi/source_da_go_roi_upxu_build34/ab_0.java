/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from aB
 */
final class ab_0
extends ei {
    private final byte var_byte_if;
    private final byte cfr_renamed_3;
    private final short var_short_if;
    private final DuLieuNguoiChoi duLieuNguoiChoi;
    private static int[] mangSoNguyen;
    private final int soLuong;

    static {
        ab_0.cfr_renamed_3();
    }

    ab_0(DuLieuNguoiChoi dd_02, byte by2, byte by3, int n, short s2) {
        super(null, 0);
        this.duLieuNguoiChoi = dd_02;
        this.cfr_renamed_3 = by2;
        this.var_byte_if = by3;
        this.soLuong = n;
        this.var_short_if = s2;
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[8];
        0 = (179 + 103 - 254 + 180 ^ 114 + 100 - 168 + 110) & (105 + 156 - 218 + 154 ^ 13 + 31 - -4 + 89 ^ -" ".length());
        1 = " ".length();
        10 = 0x78 ^ 0xB ^ (0x62 ^ 0x1B);
        30 = 0x62 ^ 0x7C;
        2 = "  ".length();
        3 = "   ".length();
        -1 = -" ".length();
        6 = 0xB2 ^ 0xBF ^ (0 ^ 0xB);
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        GameCanvas.cfr_renamed_1(graphics);
        n = k.var_byte_do + (bn_0.cfr_renamed_16 << 1) + 10 * bn_0.cfr_renamed_6 + 30 * (bn_0.cfr_renamed_6 - 1) + em_0.soLuong;
        n2 = bn_0.var_byte_new;
        this.duLieuNguoiChoi.cfr_renamed_0(graphics, GameCanvas.var_int_byte / 2, n, 0);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bm) + this.duLieuNguoiChoi.chuoiGiaTri, GameCanvas.var_int_byte / 2, n + n2, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[3]) + this.cfr_renamed_3 + " (" + this.var_byte_if + "%)", GameCanvas.var_int_byte / 2, n + (n2 << 1), 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bd) + this.soLuong, GameCanvas.var_int_byte / 2, n + n2 * 3, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.var_java_lang_String_try) + ": ", GameCanvas.var_int_byte / 2, n + (n2 << 2), 2);
        if ((this.var_short_if != -1)) {
            ((dt_0)ci_0.q_0_do(this.var_short_if)).cfr_renamed_0(graphics, GameCanvas.var_int_byte / 2, n + n2 * 6, 3);
        }
    }
}

