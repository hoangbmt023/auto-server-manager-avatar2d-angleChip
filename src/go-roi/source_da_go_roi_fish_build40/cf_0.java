/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from cF
 */
final class cf_0
extends fl_0 {
    private final ee_0 var_ee_0_do;
    private final int soLuong;
    private static int[] mangSoNguyen;

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[3];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x1B ^ 0x45 ^ (0x1F ^ 7)) & (0xE9 ^ 0xA3 ^ (0x5B ^ 0x57) ^ -" ".length());
    }

    static {
        cf_0.cfr_renamed_2();
    }

    cf_0(String string, de de2, ee_0 ee_02, int n) {
        super(string, de2);
        this.var_ee_0_do = ee_02;
        this.soLuong = n;
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        aa_0.var_k_0_arr_do[this.var_ee_0_do.var_short_do].cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2, 3);
    }

    public final void cfr_renamed_1() {
        if (!(this.soLuong != fo.var_int_try) || (fo.dangChayAuto)) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1(this.var_ee_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.X) + this.var_ee_0_do.mangSoNguyen[0] + MenuChinhAvatar.cb);
            fo.cfr_renamed_1(String.valueOf(MenuChinhAvatar.chuoiPhu) + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + MenuChinhAvatar.cb);
        }
    }

    }

