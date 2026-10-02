/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class eg {
    private Image var_javax_microedition_lcdui_Image_do;
    private static int[] mangSoNguyen;
    public static boolean dangChayAuto;
    private static byte var_byte_do;
    public static eq_0 var_eq_0_do;
    private static byte var_byte_if;
    private static boolean coTrangThai;
    private int soLuong;
    private int var_int_if;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private int cfr_renamed_5;

        public final void (Graphics graphics != 0) {
        int n = 0;
        if ((this.var_int_if > 1)) {
            int n2;
            if ((GameCanvas.var_int_try % 6 < 3)) {
                n2 = 1;
                if (((0x43 ^ 0x7D ^ (0x64 ^ 0x68)) & (98 + 50 - 120 + 141 ^ 102 + 78 - 73 + 48 ^ -" ".length())) == (32 + 150 - 15 + 15 ^ 45 + 61 - 73 + 145)) {
                    return;
                }
            } else {
                n2 = 0;
            }
            n = n2;
        }
        graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.cfr_renamed_4 * bn_0.cfr_renamed_6, (this.soLuong + n) * bn_0.cfr_renamed_6 - this.var_javax_microedition_lcdui_Image_do.getHeight(), 17);
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[16];
        0 = (0xBB ^ 0x81) & ~(0xBF ^ 0x85);
        -1 = -" ".length();
        1 = " ".length();
        300 = 0xFFFFAFBF & 0x516C;
        20 = 0xA5 ^ 0xB1;
        15 = 165 + 170 - 185 + 51 ^ 154 + 130 - 220 + 134;
        8 = 0x76 ^ 0x25 ^ (0x13 ^ 0x48);
        2 = "  ".length();
        9 = 0xC ^ 0x74 ^ (0x56 ^ 0x27);
        25 = 0x70 ^ 0x22 ^ (0x1B ^ 0x50);
        13 = 124 + 105 - 188 + 137 ^ 86 + 21 - 7 + 91;
        23 = 0x54 ^ 0x3B ^ (0x7C ^ 4);
        58 = 0x9E ^ 0xA4;
        6 = 0x89 ^ 0xBA ^ (0x2A ^ 0x1F);
        3 = "   ".length();
        17 = 0xD ^ 0x50 ^ (0x50 ^ 0x1C);
    }

    public final void cfr_renamed_0() {
        if (((var_byte_if == 1) && !(var_byte_do != 1) || (var_byte_if == -1) && (var_byte_do == -1)) && (var_byte_do == -1) && !(coTrangThai)) {
            eq.eq_do().cfr_renamed_17(8);
            AngelChip.duLieuNguoiChoi.dangChayAuto = 1;
            coTrangThai = 1;
        }
        this.cfr_renamed_4 -= this.var_int_if;
        this.cfr_renamed_5 += gc_0.int_if(this.cfr_renamed_3 - this.var_int_if / 2);
        if ((this.cfr_renamed_5 >= 20)) {
            this.cfr_renamed_5 = 0;
            this.var_int_if -= var_byte_if;
            if ((this.var_int_if == 0)) {
                var_byte_if = (byte)-1;
                this.cfr_renamed_3 = 8;
                AngelChip.duLieuNguoiChoi.void_do(this.cfr_renamed_4, eg.var_eq_0_do.soLuong);
                AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                ek_0.coTrangThai = 0;
                AngelChip.duLieuNguoiChoi.dangChayAuto = 0;
                if ((GameCanvas.var_boolean_byte) && eg.cfr_renamed_0(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                    if ((ef_0.soLuong == 9)) {
                        GameCanvas.var_et_0_do = new et_0();
                        GameCanvas.var_et_0_do.cfr_renamed_8();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    } else if ((var_byte_do == 1) && (ef_0.soLuong == 25)) {
                        GameCanvas.var_et_0_do = new et_0();
                        GameCanvas.var_et_0_do.cfr_renamed_1(fe_0.var_fe_0_do);
                        } else if ((ef_0.soLuong == 13) && (et_0.soLuongKhoa < 8)) {
                        GameCanvas.var_et_0_do = new et_0();
                        GameCanvas.var_et_0_do.cfr_renamed_11();
                        if ("  ".length() < 0) {
                            return;
                        }
                    } else if ((var_byte_do == 1) && (ef_0.soLuong == 23)) {
                        GameCanvas.var_et_0_do = new et_0();
                        GameCanvas.var_et_0_do.cfr_renamed_12();
                    }
                }
            }
        }
        if (eg.cfr_renamed_4((this.cfr_renamed_4 + 58) * bn_0.cfr_renamed_6, ek_0.ek_0_do().soLuong)) {
            dangChayAuto = 0;
            if ((var_byte_do == -1)) {
                GameCanvas.cfr_renamed_5();
            }
        }
    }

            static {
        eg.cfr_renamed_1();
        dangChayAuto = 0;
        coTrangThai = 0;
    }

            public final void (byte by2 != 0) {
        int n;
        if (!!(dangChayAuto) || eg.cfr_renamed_0(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_4, -1)) {
            return;
        }
        ap.void_do(MenuChinhAvatar.cd);
        this.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("839");
        ap.cfr_renamed_0();
        var_byte_do = by2;
        if ((var_byte_do == 1)) {
            ek_0.ek_0_do().soLuong = ek_0.ek_0_do().var_int_if = eg.var_eq_0_do.var_int_if * bn_0.cfr_renamed_6 - GameCanvas.var_int_int - 300;
        }
        if ((GameCanvas.cfr_renamed_16 != 0)) {
            n = GameCanvas.var_int_else;
            if (((0x4C ^ 0x6D ^ (0x42 ^ 2)) & (0x2E ^ 0x3B ^ (0x5C ^ 0x28) ^ -" ".length())) <= -" ".length()) {
                return;
            }
        } else {
            n = 0;
        }
        this.soLuong = ef_0.var_short_do * ef_0.var_int_if + n / bn_0.cfr_renamed_6 + 20 * bn_0.cfr_renamed_6;
        this.cfr_renamed_4 = eg.var_eq_0_do.var_int_if + 300;
        this.var_int_if = this.cfr_renamed_3 = 15;
        this.cfr_renamed_5 = 0;
        var_byte_if = (byte)1;
        dangChayAuto = 1;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(-1);
        ek_0.coTrangThai = 1;
        coTrangThai = 0;
        if ((var_byte_do == 1)) {
            AngelChip.duLieuNguoiChoi.dangChayAuto = 1;
        }
    }
}

