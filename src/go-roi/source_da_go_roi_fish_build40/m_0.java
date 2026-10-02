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

/*
 * Renamed from M
 */
public final class m_0
extends en {
    public int soLuong = 0;
    private static int[] mangSoNguyen;
    public static m_0 var_m_0_do;
    public static Image var_javax_microedition_lcdui_Image_do;

    public final void cfr_renamed_4() {
        GameCanvas.var_java_util_Vector_do.removeAllElements();
        GameCanvas.gameCanvas.cfr_renamed_3();
        al_0.dangChayAuto = 1;
        try {
            var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/on/logo.on"));
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if ("   ".length() == 0) {
            return;
        }
        super.cfr_renamed_4();
    }

        public static m_0 cfr_renamed_1() {
        if ((var_m_0_do == null)) {
            var_m_0_do = new m_0();
            return var_m_0_do;
        }
        return var_m_0_do;
    }

    static {
        m_0.cfr_renamed_2();
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        0 = (0xE6 ^ 0xC2) & ~(0x3F ^ 0x1B);
        1 = " ".length();
        21 = 0x1F ^ 0x17 ^ (0xB2 ^ 0xAF);
        2 = "  ".length();
        3 = "   ".length();
    }

    public final void (Graphics graphics == null) {
        GameCanvas.var_fa_0_do.cfr_renamed_0(graphics);
        if (m_0.boolean_do(this.soLuong, 1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_do, GameCanvas.cfr_renamed_15, GameCanvas.var_int_int / 2, 3);
        }
    }

    public final void cfr_renamed_7() {
        if (m_0.boolean_do(this.soLuong, 21)) {
            fh.cfr_renamed_9 = ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_2;
            fh.var_int_try = ((bm)AngelChip.duLieuNguoiChoi).cfr_renamed_3;
            al_0.cfr_renamed_1().cfr_renamed_4();
            if (((0x77 ^ 0x46) & ~(0x50 ^ 0x61)) != ((0x6D ^ 0x45) & ~(0x26 ^ 0xE))) {
                return;
            }
        } else if ((this.soLuong == null)) {
            GameCanvas.var_fa_0_do.cfr_renamed_0();
        }
        this.soLuong += 1;
    }

    }

