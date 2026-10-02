/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

/*
 * Renamed from bZ
 */
final class bz_0
implements CommandListener {
    private final i var_i_do;
    private static final int[] mangSoNguyen;

    bz_0(i i2) {
        this.var_i_do = i2;
    }

            public final void commandAction(Command command, Displayable displayable) {
        if ((command == i.javax_microedition_lcdui_Command_do(this.var_i_do)) && (i.int_do(this.var_i_do) >= 0) && (i.int_do(this.var_i_do) < i.j_0_arr_do(this.var_i_do).length)) {
            int n = i.int_do(this.var_i_do);
            if ((n > 0) && (n == i.j_0_arr_do(this.var_i_do).length - 1)) {
                i i2 = this.var_i_do;
                i.cfr_renamed_1(i2, i.int_do(i2) - 1);
                }
            j_0.j_0_do();
            j_0.cfr_renamed_2(i.j_0_arr_do((i)this.var_i_do)[n].cfr_renamed_0);
        }
        this.var_i_do.void_do();
    }

    static {
        bz_0.cfr_renamed_1();
    }

                private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }
}

