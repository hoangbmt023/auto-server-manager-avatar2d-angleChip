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
 * Renamed from bi
 */
final class bi_0
extends Canvas {
    private final H var_H_do;
    private static final int[] mangSoNguyen;

    public final void paint(Graphics graphics) {
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.setColor(0);
        graphics.drawString("Nhấn phím để lấy mã...", this.getWidth() / 2, this.getHeight() / 2, 65);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[5];
        1 = " ".length();
        16777215 = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        0 = (43 + 103 - 139 + 123 ^ 125 + 52 - 46 + 42) & (0x40 ^ 0x5D ^ (0x12 ^ 0x20) ^ -" ".length());
        2 = "  ".length();
        65 = 0x6C ^ 0x2D;
    }

    public bi_0(H h) {
        this.var_H_do = h;
        this.setFullScreenMode(1);
    }

    public final void keyPressed(int n) {
        this.var_H_do.var_javax_microedition_lcdui_TextField_if.setString(String.valueOf(n));
        this.var_H_do.var_javax_microedition_lcdui_TextField_for.setString("0");
        this.var_H_do.var_javax_microedition_lcdui_TextField_do.setString("0");
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_H_do.var_javax_microedition_lcdui_Form_do);
    }

    static {
        bi_0.cfr_renamed_0();
    }
}

