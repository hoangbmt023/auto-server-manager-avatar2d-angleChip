/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class cX
extends ei {
    private final String tenNhanVat;
    private static int[] mangSoNguyen;
    private final DuLieuNguoiChoi duLieuNguoiChoi;
    private final DuLieuNguoiChoi var_dd_0_if;
    private final short var_short_if;
    private final String chuoiPhu;
    private final byte var_byte_if;
    private final byte var_byte_for;

    public final void (Graphics graphics, int n, int n2 > 0) {
        n = 15 * bn_0.cfr_renamed_6;
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, this.tenNhanVat, em_0.var_int_byte / 2 - 7, n, 2);
        this.duLieuNguoiChoi.cfr_renamed_0(graphics, em_0.var_int_byte / 4 - 7, n += this.duLieuNguoiChoi.var_short_int + GameCanvas.var_ew_try.int_do() + 15 * bn_0.cfr_renamed_6, 1);
        this.var_dd_0_if.cfr_renamed_0(graphics, em_0.var_int_byte / 4 * 3 - 7, n, 1);
        an an2 = ci_0.cfr_renamed_1(this.var_short_if);
        if ((an2.soLuong != -1)) {
            graphics.drawImage(an2.var_javax_microedition_lcdui_Image_do, em_0.var_int_byte / 2 - 7, n - this.duLieuNguoiChoi.var_short_int / 2, 3);
            if ((this.var_byte_for > 0)) {
                GameCanvas.var_ew_case.cfr_renamed_0(graphics, "lv" + this.var_byte_for + "+" + this.var_byte_if + "%", em_0.var_int_byte / 2 - 7, n, 2);
                fe_0.cfr_renamed_0(graphics, "", em_0.var_int_byte / 2 - 8, n += GameCanvas.var_ew_case.int_do(), (int)this.var_byte_if);
            }
        }
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, this.chuoiPhu, em_0.var_int_byte / 2 - 7, (n += GameCanvas.var_ew_case.int_do() << 1) - 5, 2);
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[9];
        15 = 0xAA ^ 0x82 ^ (0x4C ^ 0x6B);
        2 = "  ".length();
        7 = 0x1A ^ 0x78 ^ (0x3B ^ 0x5E);
        4 = 0x44 ^ 0x40;
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
        8 = 0x4C ^ 0x44;
        5 = 0x69 ^ 0x6C;
    }

    public final void cfr_renamed_0() {
        this.var_dd_0_if.void_do();
    }

    cX(String string, String string2, DuLieuNguoiChoi dd_02, DuLieuNguoiChoi dd_03, short s2, byte by2, byte by3, String string3) {
        super(string, null);
        this.tenNhanVat = string2;
        this.duLieuNguoiChoi = dd_02;
        this.var_dd_0_if = dd_03;
        this.var_short_if = s2;
        this.var_byte_for = by2;
        this.var_byte_if = by3;
        this.chuoiPhu = string3;
    }

    static {
        cX.cfr_renamed_3();
    }

    }

