/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

final class ct
extends fl_0 {
    private final dH var_dH_do;
    private static int[] mangSoNguyen;
    private final fx var_fx_do;
    private final DuLieuNguoiChoi duLieuNguoiChoi;

    ct(DuLieuNguoiChoi ef2, dH dH2, fx fx2) {
        super(null, null);
        this.duLieuNguoiChoi = ef2;
        this.var_dH_do = dH2;
        this.var_fx_do = fx2;
    }

            static {
        ct.cfr_renamed_2();
    }

    public final void (Graphics graphics, int n, int n2 != null) {
        block16: {
            String string;
            StringBuffer stringBuffer;
            Graphics graphics2;
            fz_0 fz_02;
            block17: {
                block15: {
                    this.duLieuNguoiChoi.cfr_renamed_1(graphics, fo.cfr_renamed_7 / 2, 37 * dF.cfr_renamed_12, 1);
                    if ((this.var_dH_do != null)) {
                        this.var_dH_do.cfr_renamed_1(graphics, fo.cfr_renamed_7 / 2 + 15 * dF.cfr_renamed_12, 37 * dF.cfr_renamed_12, this.duLieuNguoiChoi.var_short_float);
                    }
                    n = 40 * dF.cfr_renamed_12;
                    n2 = 15 * dF.cfr_renamed_12;
                    GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.bI) + this.duLieuNguoiChoi.chuoiGiaTri, 0, n, 0);
                    if (!ct.cfr_renamed_1(((dd_0)this.duLieuNguoiChoi).cfr_renamed_9, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) break block15;
                    if ((AngelChip.var_by_do.var_short_do != null) && !(AngelChip.var_by_do.cfr_renamed_5 > 0)) break block16;
                    fz_02 = GameCanvas.var_fz_0_case;
                    graphics2 = graphics;
                    stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[0])).append(AngelChip.var_by_do.var_short_do).append(" + ").append(AngelChip.var_by_do.cfr_renamed_5);
                    string = "%";
                    if ((0x73 ^ 0x77) == 0) {
                        return;
                    }
                    break block17;
                }
                if ((this.duLieuNguoiChoi.var_short_char != null) && !(this.duLieuNguoiChoi.var_byte_char > 0)) break block16;
                fz_02 = GameCanvas.var_fz_0_case;
                graphics2 = graphics;
                stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[0])).append(this.duLieuNguoiChoi.var_short_char).append(" + ");
                if ((this.duLieuNguoiChoi.var_byte_char > 0)) {
                    string = String.valueOf(this.duLieuNguoiChoi.var_byte_char) + "%";
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                } else {
                    string = "";
                }
            }
            fz_02.cfr_renamed_1(graphics2, stringBuffer.append(string).toString(), 0, n += n2, 0);
        }
        if (!(this.duLieuNguoiChoi.var_short_void != null) || (this.duLieuNguoiChoi.var_byte_break > 0)) {
            String string;
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_new[1])).append(this.duLieuNguoiChoi.var_short_void).append(" + ");
            if ((this.duLieuNguoiChoi.var_byte_break > 0)) {
                string = String.valueOf(this.duLieuNguoiChoi.var_byte_break) + "%";
                if (-" ".length() >= ((0x70 ^ 0x25) & ~(0xFB ^ 0xAE))) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, stringBuffer.append(string).toString(), 0, n += n2, 0);
        }
        int n3 = 0;
        if ((this.var_fx_do.soLuong > 125 * dF.cfr_renamed_12)) {
            this.var_fx_do.cfr_renamed_1(100 * dF.cfr_renamed_12);
            if ((this.var_fx_do.cfr_renamed_5 >= 0)) {
                n3 = this.var_fx_do.cfr_renamed_5;
            }
        }
        GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, this.var_fx_do.chuoiGiaTri, 0 - n3, n += n2, 0);
        if ((go_0.var_boolean_int)) {
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, String.valueOf(MenuChinhAvatar.c) + this.duLieuNguoiChoi.mangSoNguyen[3] + MenuChinhAvatar.java_lang_String_do(), 0, n + n2, 0);
        }
    }

                private static void cfr_renamed_2() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        37 = 0xBE ^ 0x9B;
        1 = " ".length();
        15 = 0x74 ^ 0x5B ^ (0xA9 ^ 0x89);
        40 = 101 + 23 - -24 + 20 ^ 37 + 99 - 73 + 65;
        0 = (0xC4 ^ 0x90) & ~(0x23 ^ 0x77);
        125 = 0x48 ^ 0x35;
        100 = 0x30 ^ 0x54;
        3 = "   ".length();
    }

        }

