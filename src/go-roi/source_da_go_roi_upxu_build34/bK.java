/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class bK
extends dL {
    private static int[] mangSoNguyen;
    public int soLuong = 0;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static bK var_bK_do;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    static {
        bK.cfr_renamed_1();
    }

    public final void cfr_renamed_8() {
        GameCanvas.var_java_util_Vector_do.removeAllElements();
        GameCanvas.gameCanvas.void_do();
        t_0.dangChayAuto = 1;
        try {
            var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/logo.on"));
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ((0xA4 ^ 0xA1) == 0) {
            return;
        }
        super.cfr_renamed_8();
    }

    public final void (Graphics graphics == null) {
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        if (bK.boolean_do(this.soLuong, 1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_do, GameCanvas.var_int_int, GameCanvas.this / 2, 3);
        }
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        0 = (0x18 ^ 0x5F) & ~(0x7D ^ 0x3A);
        1 = " ".length();
        21 = 0x88 ^ 0x9D;
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void void_for() {
        if (bK.boolean_do(this.soLuong, 21)) {
            ef_0.var_int_char = ((aG)AngelChip.duLieuNguoiChoi).cfr_renamed_3;
            ef_0.var_int_new = AngelChip.duLieuNguoiChoi.var_int_if;
            t_0.cfr_renamed_0().cfr_renamed_8();
            if (((0x19 ^ 0x3E) & ~(0xA5 ^ 0x82)) == -" ".length()) {
                return;
            }
        } else if (bK.boolean_do(this.soLuong)) {
            GameCanvas.var_gj_0_do.cfr_renamed_15();
        }
        this.soLuong += 1;
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

        public static bK cfr_renamed_0() {
        if ((var_bK_do == null)) {
            var_bK_do = new bK();
            return var_bK_do;
        }
        return var_bK_do;
    }
}

