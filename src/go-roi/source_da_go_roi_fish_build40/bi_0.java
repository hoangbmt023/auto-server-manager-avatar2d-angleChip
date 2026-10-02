/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.ChoiceGroup;
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
 * Renamed from bi
 */
final class bi_0
extends Form
implements CommandListener {
    private static boolean dangChayAuto;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private static final int[] mangSoNguyen;
    private static int soLuong;

    static {
        bi_0.cfr_renamed_0();
        dangChayAuto = 1;
        soLuong = 20;
    }

    public final void commandAction(Command command, Displayable displayable) {
        block3: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block3;
            dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
            try {
                soLuong = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
            }
            catch (NumberFormatException numberFormatException) {
                soLuong = 0;
            }
            T.T_do().cfr_renamed_1(dangChayAuto, soLuong);
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        2 = "  ".length();
        1 = " ".length();
        0 = (0xB9 ^ 0x94 ^ (0xA ^ 0x44)) & (19 + 100 - -38 + 96 ^ 88 + 70 - 136 + 136 ^ -" ".length());
        4 = 0x61 ^ 0x65;
        7 = 0x42 ^ 0x45;
        20 = 0x29 ^ 0x73 ^ (0x7A ^ 0x34);
    }

        public bi_0() {
        super("Cài đặt đánh boss");
        String[] stringArray = new String[1];
        stringArray[0] = "Đây là acc chính";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Buff nick này?", 2, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Số lượng acc của bạn:", String.valueOf(soLuong), 2, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Đánh", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, dangChayAuto);
    }

    public final void cfr_renamed_1() {
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
    }
}

