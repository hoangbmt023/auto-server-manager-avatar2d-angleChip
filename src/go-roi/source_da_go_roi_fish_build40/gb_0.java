/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from gB
 */
public final class gb_0
extends bm {
    public int soLuong = 0;
    private static int[] mangSoNguyen;
    public boolean dangChayAuto;
    public short var_short_do;
    public int cfr_renamed_4;
    public byte var_byte_do = (byte)0;
    public boolean coTrangThai;
    public short var_short_if;
    public int cfr_renamed_5;
    public int cfr_renamed_6;
    public short cfr_renamed_2;
    public bp var_bp_do;
    public int cfr_renamed_7;
    public int cfr_renamed_8;
    public short cfr_renamed_3;
    public int cfr_renamed_13;

    public gb_0(int n, int n2) {
        ((bm)this).cfr_renamed_2 = n;
        ((bm)this).cfr_renamed_3 = n2;
    }

    public final void cfr_renamed_1(Graphics graphics) {
        this.var_bp_do.cfr_renamed_1(graphics);
    }

    public gb_0(int n, int n2, int n3) {
        ((bm)this).cfr_renamed_2 = n;
        ((bm)this).cfr_renamed_3 = n2;
        this.cfr_renamed_2 = (short)n;
        this.cfr_renamed_3 = (short)n2;
        this.var_short_do = (short)n3;
    }

    public gb_0() {
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x62 ^ 0x59) & ~(0xBE ^ 0x85);
    }

    public final void void_do() {
        this.var_bp_do.cfr_renamed_1();
    }

    static {
        gb_0.cfr_renamed_0();
    }
}

