/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
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
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
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

public final class aw
extends Form
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final TextField cfr_renamed_0;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private static final int[] mangSoNguyen;
    private final TextField cfr_renamed_2;
    private final TextField cfr_renamed_3 = new TextField("T.gian bán (phút):", String.valueOf(c.var_int_try), 4, 2);
    private final Command var_javax_microedition_lcdui_Command_do;

        public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            try {
                c.var_int_try = Integer.parseInt(this.cfr_renamed_3.getString().trim());
                c.soXu = Integer.parseInt(this.cfr_renamed_2.getString().trim());
                c.soLuongKhoa = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                c.var_int_int = Integer.parseInt(this.cfr_renamed_0.getString().trim());
                c.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
                c.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
                c.coKichHoat = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2);
                c.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3);
                c.cfr_renamed_0();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
                }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            if ("  ".length() == "   ".length()) {
                return;
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public aw() {
        super("Cài đặt bán đá");
        this.append((Item)this.cfr_renamed_3);
        this.cfr_renamed_2 = new TextField("Quãng nghỉ (ms):", String.valueOf(c.soXu), 6, 2);
        this.append((Item)this.cfr_renamed_2);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Khu bán từ khu:", String.valueOf(c.soLuongKhoa), 3, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.cfr_renamed_0 = new TextField("Đến khu:", String.valueOf(c.var_int_int), 3, 2);
        this.append((Item)this.cfr_renamed_0);
        String[] stringArray = new String[4];
        stringArray[0] = "Reset time khi bán dc NHB";
        stringArray[1] = "Reset time khi bán dc KCX";
        stringArray[2] = "Bỏ NHB nếu ko bán dc";
        stringArray[3] = "Bỏ KCX nếu ko bán dc";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Tùy chọn", 2, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, c.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, c.var_boolean_int);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, c.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(3, c.dangChayAuto);
    }

    static {
        aw.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[7];
        4 = 171 + 15 - 64 + 58 ^ 79 + 3 - 57 + 151;
        2 = "  ".length();
        6 = 0x48 ^ 0x4E;
        3 = "   ".length();
        0 = (0x2B ^ 0x2C ^ "  ".length()) & (53 + 92 - 83 + 121 ^ 104 + 100 - 67 + 41 ^ -" ".length());
        1 = " ".length();
        7 = 0xA ^ 0x5C ^ (0x12 ^ 0x43);
    }
}

