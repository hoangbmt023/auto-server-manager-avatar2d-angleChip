/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from cW
 */
final class cw_0
extends fl_0 {
    private final int soLuong;
    private static final int[] mangSoNguyen;
    private final ee_0 var_ee_0_do;
    private final dg_0 var_dg_0_do;

    static {
        cw_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[2];
        11 = 0x4E ^ 0xC ^ (0x2A ^ 0x63);
        2 = "  ".length();
    }

            public final void (Graphics graphics, int n, int n2 > 0) {
        this.var_dg_0_do.cfr_renamed_1(graphics, n + fo.soLuongKhoa / 2, n2 + fo.soLuongKhoa / 2);
    }

    cw_0(String string, int n, dg_0 dg_02, int n2, ee_0 ee_02) {
        super(string, 11, n);
        this.var_dg_0_do = dg_02;
        this.soLuong = n2;
        this.var_ee_0_do = ee_02;
    }

    public final void cfr_renamed_1() {
        if ((fo.var_boolean_int) && (this.soLuong == fo.var_int_try - dR.var_java_util_Vector_do.size())) {
            fo.cfr_renamed_5();
            fo.cfr_renamed_1("ID: " + this.var_ee_0_do.var_short_if);
            fo.cfr_renamed_1(this.var_dg_0_do.chuoiGiaTri);
            fo.cfr_renamed_1(MenuChinhAvatar.bJ + this.var_ee_0_do.soLuong);
            if ((this.var_dg_0_do.soLuong > 0)) {
                fo.cfr_renamed_1(MenuChinhAvatar.cA + GameCanvas.java_lang_String_do(this.var_ee_0_do.soLuong * this.var_dg_0_do.soLuong) + MenuChinhAvatar.cb);
                if (-" ".length() >= (0x96 ^ 0x92)) {
                    return;
                }
            } else if ((this.var_dg_0_do.var_int_if > 0)) {
                fo.cfr_renamed_1(MenuChinhAvatar.cA + GameCanvas.java_lang_String_do(this.var_ee_0_do.soLuong * this.var_dg_0_do.var_int_if) + MenuChinhAvatar.cb);
            }
            fo.cfr_renamed_1(go_0.java_lang_String_do());
        }
    }

    }

