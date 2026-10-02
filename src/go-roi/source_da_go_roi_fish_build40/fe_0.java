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
 * Renamed from fE
 */
public final class fe_0
extends Form
implements CommandListener {
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final ChoiceGroup cfr_renamed_0;
    private static final int[] mangSoNguyen;
    private final ChoiceGroup cfr_renamed_2;
    private final Command var_javax_microedition_lcdui_Command_do;

    public fe_0() {
        super("Cài đặt Auto KC");
        String[] stringArray = new String[4];
        stringArray[0] = "Bán đá khi đầy rương";
        stringArray[1] = "Tự về chăm farm";
        stringArray[2] = "Tự bỏ KCX";
        stringArray[3] = "Tự bỏ NHB";
        this.cfr_renamed_0 = new ChoiceGroup("Tùy chọn", 2, stringArray, null);
        this.append((Item)this.cfr_renamed_0);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("T.gian về farm (phút):", String.valueOf(aj.var_int_if), 4, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Thu hoạch đúng giờ";
        this.cfr_renamed_2 = new ChoiceGroup("Farm thông minh", 2, stringArray2, null);
        this.append((Item)this.cfr_renamed_2);
        String[] stringArray3 = new String[7];
        stringArray3[0] = "Vàng";
        stringArray3[1] = "Trắng";
        stringArray3[2] = "Đỏ";
        stringArray3[3] = "Xanh lam";
        stringArray3[4] = "Xanh lá";
        stringArray3[5] = "Tím";
        stringArray3[6] = "Mặc định";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Thứ tự ưu tiên", 1, stringArray3, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.cfr_renamed_0.setSelectedIndex(0, aj.dangChayAuto);
        this.cfr_renamed_0.setSelectedIndex(1, aj.cfr_renamed_5);
        this.cfr_renamed_0.setSelectedIndex(2, aj.var_boolean_int);
        this.cfr_renamed_0.setSelectedIndex(3, aj.cfr_renamed_4);
        this.cfr_renamed_2.setSelectedIndex(0, aj.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex((int)aj.var_byte_if, 1);
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        4 = 0x2A ^ 0x2E;
        0 = (0x5A ^ 0x32 ^ (0xBD ^ 0x89)) & (60 + 59 - -26 + 109 ^ 71 + 26 - -59 + 6 ^ -" ".length()) & ((0x53 ^ 0x31 ^ (0x14 ^ 0x66)) & (0x45 ^ 0x1D ^ (0x3A ^ 0x72) ^ -" ".length()) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        7 = 99 + 62 - 52 + 74 ^ 38 + 151 - 114 + 101;
        5 = 0xA1 ^ 0xA4;
        6 = 92 + 97 - 99 + 40 ^ 85 + 110 - 167 + 104;
        60000 = 0xFFFFEE74 & 0xFBEB;
    }

        public final void commandAction(Command command, Displayable displayable) {
        block4: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block4;
            aj.dangChayAuto = this.cfr_renamed_0.isSelected(0);
            aj.cfr_renamed_5 = this.cfr_renamed_0.isSelected(1);
            aj.var_boolean_int = this.cfr_renamed_0.isSelected(2);
            aj.cfr_renamed_4 = this.cfr_renamed_0.isSelected(3);
            aj.coKichHoat = this.cfr_renamed_2.isSelected(0);
            aj.var_byte_if = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_do.getSelectedIndex();
            try {
                aj.var_int_if = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                aj.aj_do().var_long_if = aj.var_int_if * 60000;
                aj.aj_do().soXu = 0L;
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ("  ".length() != "  ".length()) {
                return;
            }
            if ((aj.var_boolean_int) && (aj.cfr_renamed_4)) {
                aj.dangChayAuto = 0;
            }
            aj.cfr_renamed_3();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    static {
        fe_0.cfr_renamed_1();
    }
}

