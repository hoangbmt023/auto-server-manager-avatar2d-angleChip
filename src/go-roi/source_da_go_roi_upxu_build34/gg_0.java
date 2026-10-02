/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gg
 */
final class gg_0
extends ei {
    private static final int[] mangSoNguyen;
    private final int soLuong;
    private final dv_0 var_dv_0_do;

                public final void (Graphics graphics, int n, int n2 != null) {
        Object object = bF.ff_do(this.var_dv_0_do.var_short_do);
        ak_0.cfr_renamed_0(graphics, ((ff)object).var_short_if, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2, 3);
        graphics.translate(0, ex.cfr_renamed_18);
        graphics.setClip(0, 0, 5 * em_0.var_int_try, em_0.cfr_renamed_5);
        if ((this.soLuong == em_0.var_int_if)) {
            n = 0;
            while ((n < this.var_dv_0_do.var_short_arr_do.length)) {
                gd gd2;
                if ((this.var_dv_0_do.var_short_arr_do[n] < 50)) {
                    gd2 = bF.gd_if(this.var_dv_0_do.var_short_arr_do[n]);
                    ak_0.dY_do((int)this.var_dv_0_do.var_short_arr_do[n]).cfr_renamed_0(graphics, 7, em_0.var_int_byte / 2 - this.var_dv_0_do.var_short_arr_do.length * 30 * bn_0.cfr_renamed_6 / 2 + n * 30 * bn_0.cfr_renamed_6 + 15 * (bn_0.cfr_renamed_6 - 1), (em_0.var_int_try << 1) + 25 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_15 << 2) + 10 * (bn_0.cfr_renamed_6 - 1), 3);
                    if ((0x9C ^ 0x98) == 0) {
                        return;
                    }
                } else if ((this.var_dv_0_do.var_short_arr_do[n] < 100)) {
                    gd2 = bF.gd_if(this.var_dv_0_do.var_short_arr_do[n]);
                    object = ak_0.fc_0_do((int)this.var_dv_0_do.var_short_arr_do[n]);
                    ci_0.cfr_renamed_0(graphics, ((fc_0)object).cfr_renamed_4, em_0.var_int_byte / 2 - this.var_dv_0_do.var_short_arr_do.length * 30 * bn_0.cfr_renamed_6 / 2 + n * 30 * bn_0.cfr_renamed_6 + 15 * (bn_0.cfr_renamed_6 - 1), (em_0.var_int_try << 1) + 25 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_15 << 2) + 10 * (bn_0.cfr_renamed_6 - 1), 3);
                    if ((0x2B ^ 0x67 ^ (0x73 ^ 0x3B)) != (0x94 ^ 0x8A ^ (0xA5 ^ 0xBF))) {
                        return;
                    }
                } else {
                    gd2 = bF.gd_do(this.var_dv_0_do.var_short_arr_do[n]);
                    object = bF.ff_do(this.var_dv_0_do.var_short_arr_do[n]);
                    ak_0.cfr_renamed_0(graphics, ((ff)object).var_short_if, em_0.var_int_byte / 2 - this.var_dv_0_do.var_short_arr_do.length * 30 * bn_0.cfr_renamed_6 / 2 + n * 30 * bn_0.cfr_renamed_6 + 15 * (bn_0.cfr_renamed_6 - 1), (em_0.var_int_try << 1) + 25 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_15 << 2) + 10 * (bn_0.cfr_renamed_6 - 1), 3);
                }
                object = GameCanvas.var_ew_case;
                if (!(gd2 != null) || (gd2.soLuong < this.var_dv_0_do.var_short_arr_if[n])) {
                    object = GameCanvas.var_ew_if;
                }
                object.cfr_renamed_0(graphics, String.valueOf(this.var_dv_0_do.var_short_arr_if[n]), em_0.var_int_byte / 2 - this.var_dv_0_do.var_short_arr_do.length * 30 * bn_0.cfr_renamed_6 / 2 + n * 30 * bn_0.cfr_renamed_6 - 1 + 15 * (bn_0.cfr_renamed_6 - 1), (em_0.var_int_try << 1) + 25 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_15 << 2) + 8 * bn_0.cfr_renamed_6 + 10 * (bn_0.cfr_renamed_6 - 1), 2);
                if ((n != this.var_dv_0_do.var_short_arr_do.length - 1)) {
                    GameCanvas.var_ew_case.cfr_renamed_0(graphics, "+", em_0.var_int_byte / 2 - this.var_dv_0_do.var_short_arr_do.length * 30 * bn_0.cfr_renamed_6 / 2 + n * 30 * bn_0.cfr_renamed_6 + 15 * bn_0.cfr_renamed_6 + 15 * (bn_0.cfr_renamed_6 - 1), (em_0.var_int_try << 1) + 25 * bn_0.cfr_renamed_6 + (bn_0.cfr_renamed_15 << 2) + 10 * (bn_0.cfr_renamed_6 - 1), 2);
                }
                ++n;
                if ("   ".length() != ((0x67 ^ 4 ^ (0x7C ^ 0x5B)) & (0 ^ 0x23 ^ (0x5E ^ 0x39) ^ -" ".length()))) continue;
                return;
            }
        }
        graphics.setClip(0, 0, 5 * em_0.var_int_try, em_0.var_int_int * em_0.var_int_try - em_0.cfr_renamed_8);
        graphics.translate(0, -ex.cfr_renamed_18);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[13];
        2 = "  ".length();
        3 = "   ".length();
        0 = (0x56 ^ 0x40) & ~(0x74 ^ 0x62);
        5 = 0xAC ^ 0xA9;
        50 = 0xF ^ 0x3D;
        7 = 0x7B ^ 0x7C;
        30 = 0x7A ^ 0xD ^ (0xE ^ 0x67);
        15 = 0x6B ^ 0x37 ^ (0x17 ^ 0x44);
        1 = " ".length();
        25 = 0xBF ^ 0xA6;
        10 = 0x9A ^ 0x90;
        100 = 0xF6 ^ 0x92;
        8 = 0x3F ^ 0x37;
    }

    static {
        gg_0.cfr_renamed_3();
    }

    public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.var_dv_0_do.cfr_renamed_3);
            em_0.cfr_renamed_0(this.var_dv_0_do.chuoiGiaTri);
            em_0.cfr_renamed_0(MenuChinhAvatar.bx + this.var_dv_0_do.var_short_if + "p");
            ff ff2 = bF.ff_do(this.var_dv_0_do.var_short_do);
            if ((ff2.var_int_if != null)) {
                em_0.cfr_renamed_0(MenuChinhAvatar.cfr_renamed_21 + GameCanvas.java_lang_String_do(ff2.var_int_if) + MenuChinhAvatar.cl);
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            } else if ((ff2.soLuong != null)) {
                em_0.cfr_renamed_0(MenuChinhAvatar.cfr_renamed_21 + GameCanvas.java_lang_String_do(ff2.soLuong) + MenuChinhAvatar.cl);
            }
            em_0.cfr_renamed_0(MenuChinhAvatar.j);
        }
    }

        gg_0(String string, cp cp2, dv_0 dv_02, int n) {
        super(string, cp2);
        this.var_dv_0_do = dv_02;
        this.soLuong = n;
    }

    }

