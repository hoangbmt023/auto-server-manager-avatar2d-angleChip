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

/*
 * Renamed from fJ
 */
public final class fj_0 {
    private Image var_javax_microedition_lcdui_Image_do;
    private int soLuong;
    private int var_int_if;
    private static boolean coTrangThai;
    public static fs var_fs_do;
    public static boolean dangChayAuto;
    private int cfr_renamed_2;
    private static byte var_byte_do;
    private static byte var_byte_if;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private static int[] mangSoNguyen;

        public final void cfr_renamed_1() {
        if (((var_byte_do == 1) && !(var_byte_if != 1) || (var_byte_do == -1) && (var_byte_if == -1)) && (var_byte_if == -1) && !(coTrangThai)) {
            ft_0.ft_0_do().cfr_renamed_12(8);
            AngelChip.duLieuNguoiChoi.dangChayAuto = 1;
            coTrangThai = 1;
        }
        this.soLuong -= this.var_int_if;
        this.cfr_renamed_4 += hg.int_do(this.cfr_renamed_3 - this.var_int_if / 2);
        if ((this.cfr_renamed_4 >= 20)) {
            this.cfr_renamed_4 = 0;
            this.var_int_if -= var_byte_do;
            if ((this.var_int_if == 0)) {
                var_byte_do = (byte)-1;
                this.cfr_renamed_3 = 8;
                AngelChip.duLieuNguoiChoi.void_do(this.soLuong, fj_0.var_fs_do.var_int_if);
                AngelChip.duLieuNguoiChoi.cfr_renamed_1(0);
                fm.coTrangThai = 0;
                AngelChip.duLieuNguoiChoi.dangChayAuto = 0;
                if ((GameCanvas.coKichHoat) && fj_0.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
                    if ((fh.var_int_char == 9)) {
                        GameCanvas.var_fv_do = new fv();
                        GameCanvas.var_fv_do.cfr_renamed_2();
                        if (" ".length() == "   ".length()) {
                            return;
                        }
                    } else if ((var_byte_if == 1) && (fh.var_int_char == 25)) {
                        GameCanvas.var_fv_do = new fv();
                        GameCanvas.var_fv_do.cfr_renamed_0(go_0.var_go_0_do);
                        if (-" ".length() != -" ".length()) {
                            return;
                        }
                    } else if ((fh.var_int_char == 13) && (fv.var_int_if < 8)) {
                        GameCanvas.var_fv_do = new fv();
                        GameCanvas.var_fv_do.cfr_renamed_3();
                        if ((1 ^ 5) <= -" ".length()) {
                            return;
                        }
                    } else if ((var_byte_if == 1) && (fh.var_int_char == 23)) {
                        GameCanvas.var_fv_do = new fv();
                        GameCanvas.var_fv_do.cfr_renamed_5();
                    }
                }
            }
        }
        if (fj_0.cfr_renamed_1((this.soLuong + 58) * dF.cfr_renamed_12, fm.fm_do().cfr_renamed_3)) {
            dangChayAuto = 0;
            if ((var_byte_if == -1)) {
                GameCanvas.cfr_renamed_8();
            }
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[16];
        0 = (18 + 63 - -59 + 39 ^ 180 + 106 - 138 + 43) & (0x98 ^ 0xC3 ^ (0x32 ^ 0x65) ^ -" ".length());
        -1 = -" ".length();
        1 = " ".length();
        300 = 0xFFFFDD3C & 0x23EF;
        20 = 0xBD ^ 0xA9;
        15 = 125 + 21 - 24 + 20 ^ 109 + 65 - 137 + 92;
        8 = 0x75 ^ 0x7C ^ " ".length();
        2 = "  ".length();
        9 = 145 + 58 - 79 + 60 ^ 23 + 132 - 144 + 166;
        25 = 0x68 ^ 0x1F ^ (0x15 ^ 0x7B);
        13 = 0xAF ^ 0xA5 ^ (0xC ^ 0xB);
        23 = 114 + 68 - 70 + 54 ^ 38 + 0 - -86 + 53;
        58 = 0xA0 ^ 0x9A;
        6 = 0x30 ^ 0x36;
        3 = "   ".length();
        17 = 3 ^ 0x15 ^ (0x19 ^ 0x1E);
    }

    public final void (byte by2 == 0) {
        int n;
        if (!!(dangChayAuto) || fj_0.cfr_renamed_2(((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_2, -1)) {
            return;
        }
        e.void_do(MenuChinhAvatar.Z);
        this.var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("839");
        e.cfr_renamed_1();
        var_byte_if = by2;
        if ((var_byte_if == 1)) {
            fm.fm_do().cfr_renamed_3 = fm.fm_do().var_int_if = fj_0.var_fs_do.soLuong * dF.cfr_renamed_12 - GameCanvas.cfr_renamed_15 - 300;
        }
        if ((GameCanvas.cfr_renamed_12 != 0)) {
            n = GameCanvas.this;
            } else {
            n = 0;
        }
        this.cfr_renamed_2 = fh.var_short_do * fh.var_int_int + n / dF.cfr_renamed_12 + 20 * dF.cfr_renamed_12;
        this.soLuong = fj_0.var_fs_do.soLuong + 300;
        this.var_int_if = this.cfr_renamed_3 = 15;
        this.cfr_renamed_4 = 0;
        var_byte_do = (byte)1;
        dangChayAuto = 1;
        AngelChip.duLieuNguoiChoi.cfr_renamed_1(-1);
        fm.coTrangThai = 1;
        coTrangThai = 0;
        if ((var_byte_if == 1)) {
            AngelChip.duLieuNguoiChoi.dangChayAuto = 1;
        }
    }

        static {
        fj_0.cfr_renamed_0();
        dangChayAuto = 0;
        coTrangThai = 0;
    }

                    public final void (Graphics graphics == 0) {
        int n = 0;
        if ((this.var_int_if > 1)) {
            int n2;
            if ((GameCanvas.var_int_goto % 6 < 3)) {
                n2 = 1;
                if (((0x29 ^ 0x65) & ~(0xF0 ^ 0xBC)) != 0) {
                    return;
                }
            } else {
                n2 = 0;
            }
            n = n2;
        }
        graphics.drawImage(this.var_javax_microedition_lcdui_Image_do, this.soLuong * dF.cfr_renamed_12, (this.cfr_renamed_2 + n) * dF.cfr_renamed_12 - this.var_javax_microedition_lcdui_Image_do.getHeight(), 17);
    }

    }

