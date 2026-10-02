/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from aH
 */
final class ah_0
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private static int[] mangSoNguyen;

    ah_0(Command command, TextField textField) {
        this.var_javax_microedition_lcdui_Command_do = command;
        this.var_javax_microedition_lcdui_TextField_do = textField;
    }

        public final void commandAction(Command command, Displayable displayable) {
        block3: {
            block2: {
                if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block2;
                if (!ah_0.cfr_renamed_1(this.var_javax_microedition_lcdui_TextField_do.getString().equals("") ? 1 : 0)) break block3;
                ft_0.ft_0_do().cfr_renamed_1(2, this.var_javax_microedition_lcdui_TextField_do.getString());
            }
            GameCanvas.gameCanvas.setFullScreenMode(1);
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)GameCanvas.gameCanvas);
        }
    }

    static {
        ah_0.cfr_renamed_1();
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        1 = " ".length();
    }
}

