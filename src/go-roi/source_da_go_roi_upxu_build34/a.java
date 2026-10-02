/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public abstract class a
extends Canvas {
    private static final int[] cfr_renamed_0;

    protected final void keyReleased(int n) {
        if ((n == gU.soLuong)) {
            gU.gU_do().void_do();
            return;
        }
        if ((n == cfr_renamed_0[0])) {
            n = cfr_renamed_0[1];
        }
        this.void_do(n);
    }

    private static void cfr_renamed_0() {
        cfr_renamed_0 = new int[3];
        a.cfr_renamed_0[0] = -(0x49 ^ 4 ^ (0x2A ^ 0x6D));
        a.cfr_renamed_0[1] = -(0x7F ^ 0x79);
        a.cfr_renamed_0[2] = 6 ^ 0x25;
    }

    static {
        a.cfr_renamed_0();
    }

        protected final void keyPressed(int n) {
        if ((n == cfr_renamed_0[0])) {
            n = cfr_renamed_0[1];
        }
        this.void_if(n);
    }

        protected final void keyRepeated(int n) {
        if (!(n != gU.soLuong) || a.boolean_do(gU.soLuong) && (n == cfr_renamed_0[2])) {
            H.H_do().void_do();
        }
    }

    protected void void_do(int n) {
    }

    protected void void_if(int n) {
    }

    protected final void paint(Graphics graphics) {
        this.cfr_renamed_0(graphics);
    }

    protected abstract void cfr_renamed_0(Graphics var1);

    private static boolean boolean_do(int n) {
        return n == 0;
    }
}

