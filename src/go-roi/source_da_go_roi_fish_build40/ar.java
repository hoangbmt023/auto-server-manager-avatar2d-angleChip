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

public final class ar
extends Form
implements CommandListener {
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private static final int[] mangSoNguyen;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final ChoiceGroup cfr_renamed_0;

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        1 = " ".length();
        2 = "  ".length();
        0 = (0x2C ^ 0x26) & ~(0x49 ^ 0x43);
        4 = 0x7B ^ 0x7F;
        7 = 0x75 ^ 0x72;
        60000 = 0xFFFFEEFD & 0xFB62;
    }

        public ar() {
        super("Cài đặt Auto Treo Nick");
        String[] stringArray = new String[2];
        stringArray[0] = "Đăng xuất";
        stringArray[1] = "Đứng cười";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Tùy chọn", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("T.gian về farm (phút):", String.valueOf(ex_0.soLuong), 4, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Thu hoạch đúng giờ";
        this.cfr_renamed_0 = new ChoiceGroup("Farm thông minh", 2, stringArray2, null);
        this.append((Item)this.cfr_renamed_0);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex((int)ex_0.var_byte_do, 1);
        this.cfr_renamed_0.setSelectedIndex(0, ex_0.dangChayAuto);
    }

    public final void commandAction(Command command, Displayable displayable) {
        block7: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block7;
            ex_0.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_do.getSelectedIndex();
            if ((this.cfr_renamed_0.isSelected(0))) {
                if (!(ex_0.dangChayAuto)) {
                    ex_0.ex_0_do().soXu = 0L;
                }
                ex_0.dangChayAuto = 1;
                if ((0xC6 ^ 0xC2) <= 0) {
                    return;
                }
            } else {
                ex_0.dangChayAuto = 0;
            }
            try {
                ex_0.soLuong = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                ex_0.ex_0_do().var_long_if = ex_0.soLuong * 60000;
            }
            catch (NumberFormatException numberFormatException) {
                }
            ex_0.cfr_renamed_4();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

        static {
        ar.cfr_renamed_1();
    }
}

