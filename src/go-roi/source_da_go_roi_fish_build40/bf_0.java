/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from bf
 */
final class bf_0
extends Form
implements CommandListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;
    private final TextField var_javax_microedition_lcdui_TextField_do;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        1024 = 0xFFFFFCF5 & 0x70A;
        0 = (0x59 ^ 0x78) & ~(0x19 ^ 0x38);
        4 = 74 + 10 - 43 + 126 ^ 144 + 142 - 188 + 65;
        7 = 0x41 ^ 0x46;
    }

    public bf_0() {
        super("Xuất dữ liệu");
        j_0.j_0_do();
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Đường dẫn: ", j_0.java_lang_String_do(), 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Xuất", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
    }

    static {
        bf_0.cfr_renamed_1();
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            j_0.j_0_do();
            j_0.cfr_renamed_0(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }
}

