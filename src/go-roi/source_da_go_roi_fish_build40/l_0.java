/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from l
 */
public abstract class l_0
extends Canvas {
    private static final int[] cfr_renamed_1;

    protected final void keyReleased(int n) {
        if ((n == fw_0.soLuong)) {
            fw_0.fw_0_do().void_do();
            return;
        }
        if ((n == cfr_renamed_1[0])) {
            n = cfr_renamed_1[1];
        }
        this.void_do(n);
    }

    protected abstract void cfr_renamed_1(Graphics var1);

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    protected final void paint(Graphics graphics) {
        this.cfr_renamed_1(graphics);
    }

    protected void void_do(int n) {
    }

    protected final void keyRepeated(int n) {
        if (!(n != fw_0.soLuong) || l_0.boolean_do(fw_0.soLuong) && (n == cfr_renamed_1[2])) {
            P.P_do().void_do();
        }
    }

    private static void cfr_renamed_1() {
        cfr_renamed_1 = new int[3];
        l_0.cfr_renamed_1[0] = -(0x6C ^ 0x4C ^ (0xC ^ 0x26));
        l_0.cfr_renamed_1[1] = -(0x35 ^ 0x33);
        l_0.cfr_renamed_1[2] = 162 + 142 - 177 + 55 ^ 47 + 18 - 3 + 87;
    }

    protected final void keyPressed(int n) {
        if ((n == cfr_renamed_1[0])) {
            n = cfr_renamed_1[1];
        }
        this.void_if(n);
    }

        static {
        l_0.cfr_renamed_1();
    }

    protected void void_if(int n) {
    }

    }

