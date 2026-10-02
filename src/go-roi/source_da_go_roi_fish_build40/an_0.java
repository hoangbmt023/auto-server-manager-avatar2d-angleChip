/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from aN
 */
final class an_0
extends fl_0 {
    private final String tenNhanVat;
    private final byte var_byte_if;
    private final short var_short_if;
    private final String chuoiPhu;
    private static int[] mangSoNguyen;
    private final byte var_byte_for;
    private final DuLieuNguoiChoi duLieuNguoiChoi;
    private final DuLieuNguoiChoi var_ef_if;

    public final void (Graphics graphics, int n, int n2 > 0) {
        n = 15 * dF.cfr_renamed_12;
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, this.tenNhanVat, fo.cfr_renamed_7 / 2 - 7, n, 2);
        this.duLieuNguoiChoi.cfr_renamed_1(graphics, fo.cfr_renamed_7 / 4 - 7, n += ((bm)this.duLieuNguoiChoi).cfr_renamed_4 + GameCanvas.var_fz_0_try.int_do() + 15 * dF.cfr_renamed_12, 1);
        this.var_ef_if.cfr_renamed_1(graphics, fo.cfr_renamed_7 / 4 * 3 - 7, n, 1);
        d_0 d_02 = aa_0.cfr_renamed_0(this.var_short_if);
        if ((d_02.soLuong != -1)) {
            graphics.drawImage(d_02.var_javax_microedition_lcdui_Image_do, fo.cfr_renamed_7 / 2 - 7, n - ((bm)this.duLieuNguoiChoi).cfr_renamed_4 / 2, 3);
            if ((this.var_byte_for > 0)) {
                GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, "lv" + this.var_byte_for + "+" + this.var_byte_if + "%", fo.cfr_renamed_7 / 2 - 7, n, 2);
                go_0.cfr_renamed_1(graphics, "", fo.cfr_renamed_7 / 2 - 8, n += GameCanvas.var_fz_0_case.int_do(), (int)this.var_byte_if);
            }
        }
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, this.chuoiPhu, fo.cfr_renamed_7 / 2 - 7, (n += GameCanvas.var_fz_0_case.int_do() << 1) - 5, 2);
    }

    public final void cfr_renamed_1() {
        this.var_ef_if.void_do();
    }

    an_0(String string, String string2, DuLieuNguoiChoi ef2, DuLieuNguoiChoi ef3, short s2, byte by2, byte by3, String string3) {
        super(string, null);
        this.tenNhanVat = string2;
        this.duLieuNguoiChoi = ef2;
        this.var_ef_if = ef3;
        this.var_short_if = s2;
        this.var_byte_for = by2;
        this.var_byte_if = by3;
        this.chuoiPhu = string3;
    }

    static {
        an_0.cfr_renamed_2();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[9];
        15 = 115 + 30 - 5 + 12 ^ 35 + 32 - -57 + 27;
        2 = "  ".length();
        7 = 0x23 ^ 0x24;
        4 = 70 + 151 - 193 + 136 ^ 34 + 113 - 118 + 131;
        1 = " ".length();
        3 = "   ".length();
        -1 = -" ".length();
        8 = 75 + 121 - 99 + 50 ^ 150 + 38 - 102 + 69;
        5 = 0x97 ^ 0x92;
    }

        }

