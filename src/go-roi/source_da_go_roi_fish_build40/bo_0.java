/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from bo
 */
final class bo_0
extends Canvas {
    private final P var_P_do;
    private static final int[] mangSoNguyen;

    public bo_0(P p) {
        this.var_P_do = p;
        this.setFullScreenMode(1);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        1 = " ".length();
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
        0 = (0x2D ^ 0x3F ^ (0x1D ^ 0x5F)) & (0x83 ^ 0xBD ^ (0x3A ^ 0x54) ^ -" ".length());
        2 = "  ".length();
        65 = 0xC8 ^ 0x89;
    }

    public final void paint(Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.setColor(0);
        graphics.drawString("Nhấn phím để lấy mã...", this.getWidth() / 2, this.getHeight() / 2, 65);
    }

    public final void keyPressed(int n) {
        this.var_P_do.var_javax_microedition_lcdui_TextField_if.setString(String.valueOf(n));
        this.var_P_do.var_javax_microedition_lcdui_TextField_for.setString("0");
        this.var_P_do.var_javax_microedition_lcdui_TextField_do.setString("0");
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_P_do.var_javax_microedition_lcdui_Form_if);
    }

    static {
        bo_0.cfr_renamed_1();
    }
}

