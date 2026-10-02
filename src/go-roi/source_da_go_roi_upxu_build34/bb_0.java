/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from bb
 */
public abstract class bb_0 {
    public boolean dangChayAuto = 0;
    public short var_short_do = (short)-1;
    private static int[] mangSoNguyen;

    public abstract void cfr_renamed_0();

    public abstract void cfr_renamed_0(Graphics var1);

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[2];
        0 = (118 + 7 - 44 + 75 ^ 28 + 18 - -105 + 13) & (0x69 ^ 0x50 ^ " ".length() ^ -" ".length());
        -1 = -" ".length();
    }

    public final void cfr_renamed_1() {
        GameCanvas.var_java_util_Vector_if.addElement(this);
    }

    static {
        bb_0.cfr_renamed_4();
    }

    public void cfr_renamed_3() {
        GameCanvas.var_java_util_Vector_if.removeElement(this);
        }
}

