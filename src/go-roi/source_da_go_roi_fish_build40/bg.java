/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class bg
extends fl_0 {
    private static int[] mangSoNguyen;
    private final short var_short_if;
    private final byte var_byte_if;
    private final byte cfr_renamed_2;
    private final int soLuong;
    private final DuLieuNguoiChoi duLieuNguoiChoi;

    bg(DuLieuNguoiChoi ef2, byte by2, byte by3, int n, short s2) {
        super(null, 0);
        this.duLieuNguoiChoi = ef2;
        this.cfr_renamed_2 = by2;
        this.var_byte_if = by3;
        this.soLuong = n;
        this.var_short_if = s2;
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[8];
        0 = (47 + 56 - -27 + 40 ^ 24 + 127 - 61 + 47) & (141 + 83 - 86 + 36 ^ 125 + 111 - 96 + 1 ^ -" ".length());
        1 = " ".length();
        10 = 0x32 ^ 0x38;
        30 = 43 + 80 - 71 + 78 ^ 136 + 149 - 263 + 134;
        2 = "  ".length();
        3 = "   ".length();
        -1 = -" ".length();
        6 = 140 + 158 - 290 + 163 ^ 74 + 19 - -78 + 2;
    }

    public final void cfr_renamed_1(Graphics graphics, int n, int n2) {
        GameCanvas.hienThongBaoPopup(graphics);
        n = v_0.var_byte_do + (dF.cfr_renamed_15 << 1) + 10 * dF.cfr_renamed_12 + 30 * (dF.cfr_renamed_12 - 1) + fo.var_int_int;
        n2 = dF.var_byte_try;
        this.duLieuNguoiChoi.cfr_renamed_1(graphics, GameCanvas.soLuongKhoa / 2, n, 0);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.bI) + this.duLieuNguoiChoi.chuoiGiaTri, GameCanvas.soLuongKhoa / 2, n + n2, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[3]) + this.cfr_renamed_2 + " (" + this.var_byte_if + "%)", GameCanvas.soLuongKhoa / 2, n + (n2 << 1), 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.j) + this.soLuong, GameCanvas.soLuongKhoa / 2, n + n2 * 3, 2);
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.aq) + ": ", GameCanvas.soLuongKhoa / 2, n + (n2 << 2), 2);
        if ((this.var_short_if != -1)) {
            ((fb)aa_0.am_do(this.var_short_if)).cfr_renamed_0(graphics, GameCanvas.soLuongKhoa / 2, n + n2 * 6, 3);
        }
    }

    static {
        bg.cfr_renamed_2();
    }
}

