/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class ah
extends ei {
    private static final int[] mangSoNguyen;
    private final ff var_ff_do;
    private final int soLuong;

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[3];
        9 = 0x89 ^ 0x80;
        2 = "  ".length();
        0 = (0x65 ^ 0x55) & ~(0x8D ^ 0xBD);
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        this.var_ff_do.cfr_renamed_0(graphics, n + em_0.var_int_try / 2, n2 + em_0.var_int_try / 2);
    }

        ah(String string, int n, ff ff2, int n2) {
        super(string, 9, n);
        this.var_ff_do = ff2;
        this.soLuong = n2;
    }

    static {
        ah.cfr_renamed_3();
    }

    public final void cfr_renamed_0() {
        if ((this.soLuong == em_0.var_int_if)) {
            em_0.cfr_renamed_4();
            em_0.cfr_renamed_0("ID: " + this.var_ff_do.var_short_do);
            em_0.cfr_renamed_0(this.var_ff_do.chuoiGiaTri);
            em_0.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_char + GameCanvas.hienThongBaoPopup(this.var_ff_do.var_int_if, this.var_ff_do.soLuong, 0));
        }
    }
}

