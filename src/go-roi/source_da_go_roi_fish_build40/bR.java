/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public abstract class bR {
    public short var_short_do;
    public boolean dangChayAuto = 0;
    private static int[] mangSoNguyen;

    public abstract void cfr_renamed_1();

    public void cfr_renamed_0() {
        GameCanvas.var_java_util_Vector_if.removeElement(this);
        }

    public bR() {
        this.var_short_do = (short)-1;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[2];
        0 = (0x34 ^ 0xE) & ~(0x68 ^ 0x52);
        -1 = -" ".length();
    }

    static {
        bR.cfr_renamed_3();
    }

    public abstract void cfr_renamed_1(Graphics var1);

    public final void cfr_renamed_2() {
        GameCanvas.var_java_util_Vector_if.addElement(this);
    }
}

