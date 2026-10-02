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

final class cR
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private static int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_do;

    static {
        cR.cfr_renamed_0();
    }

        cR(Command command, TextField textField) {
        this.var_javax_microedition_lcdui_Command_do = command;
        this.var_javax_microedition_lcdui_TextField_do = textField;
    }

        public final void commandAction(Command command, Displayable displayable) {
        block3: {
            block2: {
                if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block2;
                if (!cR.cfr_renamed_0(this.var_javax_microedition_lcdui_TextField_do.getString().equals("") ? 1 : 0)) break block3;
                eq.eq_do().cfr_renamed_0(2, this.var_javax_microedition_lcdui_TextField_do.getString());
            }
            GameCanvas.gameCanvas.setFullScreenMode(1);
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)GameCanvas.gameCanvas);
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[2];
        2 = "  ".length();
        1 = " ".length();
    }
}

