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
 * Renamed from bV
 */
final class bv_0
implements CommandListener {
    private final ax var_ax_do;
    private static final int[] mangSoNguyen;

    bv_0(ax ax2) {
        this.var_ax_do = ax2;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == ax.javax_microedition_lcdui_Command_do(this.var_ax_do)) && (ax.int_do(this.var_ax_do) >= 0) && (ax.int_do(this.var_ax_do) < ax.az_arr_do(this.var_ax_do).length)) {
            int n = ax.int_do(this.var_ax_do);
            if ((n > 0) && (n == ax.az_arr_do(this.var_ax_do).length - 1)) {
                ax ax2 = this.var_ax_do;
                ax.cfr_renamed_0(ax2, ax.int_do(ax2) - 1);
                }
            az.az_do();
            az.cfr_renamed_3(ax.az_arr_do((ax)this.var_ax_do)[n].cfr_renamed_1);
        }
        this.var_ax_do.void_do();
    }

        static {
        bv_0.cfr_renamed_0();
    }

            }

