/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

final class as
extends ei {
    private final ar_0 fontRenderer;
    private static int[] mangSoNguyen;

    as(ar_0 ar_02) {
        super(null, null);
        this.fontRenderer = ar_02;
    }

    public final void cfr_renamed_0(Graphics graphics, int n, int n2) {
        n = em_0.var_int_byte / 2 + 7;
        n2 = (em_0.cfr_renamed_5 - dL.cfr_renamed_19 - (bn_0.cfr_renamed_16 << 1)) / 7;
        int n3 = n2 / 2 - fe_0.var_javax_microedition_lcdui_Image_do.getHeight() / 2;
        fe_0.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.var_java_lang_String_arr_const[0]) + this.fontRenderer.var_short_do, n, n3, (int)this.fontRenderer.cfr_renamed_1);
        fe_0.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[1], n, n3 += n2, (int)this.fontRenderer.var_byte_do);
        fe_0.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[2], n, n3 += n2, (int)this.fontRenderer.cfr_renamed_3);
        fe_0.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[3], n, n3 += n2, (int)this.fontRenderer.cfr_renamed_4);
        fe_0.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[4], n, n3 += n2, (int)this.fontRenderer.cfr_renamed_2);
        fe_0.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_const[5], n, n3 + n2, (int)this.fontRenderer.cfr_renamed_5);
    }

    static {
        as.cfr_renamed_3();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[7];
        2 = "  ".length();
        7 = "   ".length() ^ (0x9C ^ 0x98);
        1 = " ".length();
        0 = (0x3C ^ 0xD) & ~(0x26 ^ 0x17);
        3 = "   ".length();
        4 = 0x95 ^ 0x91;
        5 = 11 + 105 - 57 + 71 ^ 1 + 45 - -65 + 24;
    }
}

