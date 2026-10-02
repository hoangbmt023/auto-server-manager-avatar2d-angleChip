/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

final class aq
extends ei {
    private final DuLieuNguoiChoi duLieuNguoiChoi;
    private final bq_0 var_bq_0_do;
    private final ev_0 var_ev_0_do;
    private static int[] mangSoNguyen;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        37 = 0x1D ^ 0x38;
        1 = " ".length();
        15 = 0x13 ^ 0x2A ^ (0x34 ^ 2);
        40 = 0x5C ^ 0x74;
        0 = (0x59 ^ 0x43) & ~(0x2D ^ 0x37);
        125 = 0x10 ^ 1 ^ (0x16 ^ 0x7A);
        100 = 134 + 24 - 119 + 185 ^ 19 + 85 - -15 + 13;
        3 = "   ".length();
    }

        static {
        aq.cfr_renamed_3();
    }

    aq(DuLieuNguoiChoi dd_02, bq_0 bq_02, ev_0 ev_02) {
        super(null, null);
        this.duLieuNguoiChoi = dd_02;
        this.var_bq_0_do = bq_02;
        this.var_ev_0_do = ev_02;
    }

                public final void (Graphics graphics, int n, int n2 != null) {
        block16: {
            String string;
            StringBuffer stringBuffer;
            Graphics graphics2;
            ew ew2;
            block17: {
                block15: {
                    this.duLieuNguoiChoi.cfr_renamed_0(graphics, em_0.var_int_byte / 2, 37 * bn_0.cfr_renamed_6, 1);
                    if ((this.var_bq_0_do != null)) {
                        this.var_bq_0_do.cfr_renamed_0(graphics, em_0.var_int_byte / 2 + 15 * bn_0.cfr_renamed_6, 37 * bn_0.cfr_renamed_6, this.duLieuNguoiChoi.var_short_void);
                    }
                    n = 40 * bn_0.cfr_renamed_6;
                    n2 = 15 * bn_0.cfr_renamed_6;
                    GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bm) + this.duLieuNguoiChoi.chuoiGiaTri, 0, n, 0);
                    if (!aq.cfr_renamed_1(((bk_0)this.duLieuNguoiChoi).cfr_renamed_12, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) break block15;
                    if ((AngelChip.fontRenderer.var_short_do <= 0) && !(AngelChip.fontRenderer.cfr_renamed_1 != null)) break block16;
                    ew2 = GameCanvas.var_ew_case;
                    graphics2 = graphics;
                    stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[0])).append(AngelChip.fontRenderer.var_short_do).append(" + ").append(AngelChip.fontRenderer.cfr_renamed_1);
                    string = "%";
                    if (((0x9D ^ 0xBE ^ (0x9B ^ 0x8D)) & (0x16 ^ 0x40 ^ (0x40 ^ 0x23) ^ -" ".length())) < 0) {
                        return;
                    }
                    break block17;
                }
                if ((this.duLieuNguoiChoi.var_short_class <= 0) && !(this.duLieuNguoiChoi.var_byte_this != null)) break block16;
                ew2 = GameCanvas.var_ew_case;
                graphics2 = graphics;
                stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[0])).append(this.duLieuNguoiChoi.var_short_class).append(" + ");
                if ((this.duLieuNguoiChoi.var_byte_this != null)) {
                    string = String.valueOf(this.duLieuNguoiChoi.var_byte_this) + "%";
                    if ("  ".length() == ((0x85 ^ 0xBA) & ~(0x6B ^ 0x54))) {
                        return;
                    }
                } else {
                    string = "";
                }
            }
            ew2.cfr_renamed_0(graphics2, stringBuffer.append(string).toString(), 0, n += n2, 0);
        }
        if (!(this.duLieuNguoiChoi.var_short_long <= 0) || (this.duLieuNguoiChoi.var_byte_catch != null)) {
            String string;
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_for[1])).append(this.duLieuNguoiChoi.var_short_long).append(" + ");
            if ((this.duLieuNguoiChoi.var_byte_catch != null)) {
                string = String.valueOf(this.duLieuNguoiChoi.var_byte_catch) + "%";
                if (((68 + 152 - 85 + 20 ^ 111 + 91 - 132 + 67) & (92 + 89 - 157 + 111 ^ 112 + 113 - 207 + 131 ^ -" ".length())) > ((0x2F ^ 0x6D ^ (0x6F ^ 0x1E)) & (0x30 ^ 0x75 ^ (0x44 ^ 0x32) ^ -" ".length()))) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, stringBuffer.append(string).toString(), 0, n += n2, 0);
        }
        int n3 = 0;
        if ((this.var_ev_0_do.cfr_renamed_2 > 125 * bn_0.cfr_renamed_6)) {
            this.var_ev_0_do.cfr_renamed_0(100 * bn_0.cfr_renamed_6);
            if ((this.var_ev_0_do.cfr_renamed_5 >= 0)) {
                n3 = this.var_ev_0_do.cfr_renamed_5;
            }
        }
        GameCanvas.var_ew_case.cfr_renamed_0(graphics, this.var_ev_0_do.cfr_renamed_1, 0 - n3, n += n2, 0);
        if ((fe_0.coKichHoat)) {
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.ay) + this.duLieuNguoiChoi.mangSoNguyen[3] + MenuChinhAvatar.java_lang_String_if(), 0, n + n2, 0);
        }
    }

            }

