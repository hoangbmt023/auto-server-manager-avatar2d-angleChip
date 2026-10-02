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
 * Renamed from bc
 */
final class bc_0
extends Form
implements CommandListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        1024 = -(0xFFFFFF79 & 0x29B6) & (0xFFFFBF2F & 0x6DFF);
        0 = (0x71 ^ 0xB ^ (0x1F ^ 0x7C)) & (0x6F ^ 0x7A ^ (0xC8 ^ 0xC4) ^ -" ".length());
        4 = 0x8E ^ 0x8A;
        7 = 109 + 22 - 97 + 99 ^ 82 + 94 - 154 + 108;
    }

    public bc_0() {
        super("Xuất dữ liệu");
        az.az_do();
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Đường dẫn: ", az.java_lang_String_do(), 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Xuất", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
    }

        static {
        bc_0.cfr_renamed_0();
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            az.az_do();
            az.cfr_renamed_1(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }
}

