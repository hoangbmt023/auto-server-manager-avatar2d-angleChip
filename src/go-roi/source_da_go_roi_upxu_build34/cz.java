/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cz
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;

    cz(String string, int n, int n2) {
        super(string, 7, n);
        this.soLuong = n2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[5];
        7 = 0xB6 ^ 0xB1;
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x63 ^ 0x6A) & ~(0x35 ^ 0x3C);
        1 = " ".length();
    }

            public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if) && (em_0.var_boolean_int)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + ak_0.var_dY_arr_do[this.soLuong].cfr_renamed_5);
            em_0.cfr_renamed_0(ak_0.var_dY_arr_do[this.soLuong].tenNhanVat + " (" + ak_0.var_dY_arr_do[this.soLuong].var_short_do + MenuChinhAvatar.bL + ")");
            em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_char + GameCanvas.hienThongBaoPopup((int)ak_0.var_dY_arr_do[this.soLuong].var_short_arr_if[0], (int)ak_0.var_dY_arr_do[this.soLuong].var_short_arr_if[1], 0));
            em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_for[2] + ": " + ak_0.var_dY_arr_do[this.soLuong].var_byte_do);
            if ((ak_0.var_dY_arr_do[this.soLuong].dangChayAuto)) {
                ff ff2 = bF.ff_do(ak_0.var_dY_arr_do[this.soLuong].cfr_renamed_3);
                em_0.cfr_renamed_0(MenuChinhAvatar.ag + ": " + ff2.chuoiGiaTri);
            }
            em_0.cfr_renamed_0(MenuChinhAvatar.l + ": " + GameCanvas.java_lang_String_do(ak_0.var_dY_arr_do[this.soLuong].cfr_renamed_4));
            em_0.cfr_renamed_0(fe_0.java_lang_String_do());
        }
    }

    static {
        cz.cfr_renamed_3();
    }

    public final void (Graphics graphics, int n, int n2 != 0) {
        ak_0.var_dY_arr_do[this.soLuong].cfr_renamed_0(graphics, 7, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
    }
}

