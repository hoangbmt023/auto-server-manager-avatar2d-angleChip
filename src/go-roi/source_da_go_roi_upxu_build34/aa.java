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

public final class aa
extends Form
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do = new TextField("T.gian bán (phút):", String.valueOf(AutoBanDa.var_int_try), 4, 2);
    private final TextField cfr_renamed_1;
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final TextField cfr_renamed_3;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final TextField cfr_renamed_4;

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            try {
                AutoBanDa.var_int_try = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                AutoBanDa.var_long_for = Integer.parseInt(this.cfr_renamed_4.getString().trim());
                AutoBanDa.var_int_int = Integer.parseInt(this.cfr_renamed_3.getString().trim());
                AutoBanDa.soLuongKhoa = Integer.parseInt(this.cfr_renamed_1.getString().trim());
                AutoBanDa.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
                AutoBanDa.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
                AutoBanDa.coKichHoat = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2);
                AutoBanDa.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3);
                AutoBanDa.void_do();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
                }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            if (((0x2D ^ 0x1D) & ~(0x41 ^ 0x71)) != 0) {
                return;
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[7];
        4 = 0 ^ 4;
        2 = "  ".length();
        6 = 0x10 ^ 0x28 ^ (0x9C ^ 0xA2);
        3 = "   ".length();
        0 = (0xC0 ^ 0xB4 ^ (0xAA ^ 0x9A)) & (49 + 108 - 32 + 122 ^ 107 + 48 - 35 + 59 ^ -" ".length());
        1 = " ".length();
        7 = 0xE4 ^ 0xAA ^ (0x8D ^ 0xC4);
    }

    public aa() {
        super("Cài đặt bán đá");
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.cfr_renamed_4 = new TextField("Quãng nghỉ (ms):", String.valueOf(AutoBanDa.var_long_for), 6, 2);
        this.append((Item)this.cfr_renamed_4);
        this.cfr_renamed_3 = new TextField("Khu bán từ khu:", String.valueOf(AutoBanDa.var_int_int), 3, 2);
        this.append((Item)this.cfr_renamed_3);
        this.cfr_renamed_1 = new TextField("Đến khu:", String.valueOf(AutoBanDa.soLuongKhoa), 3, 2);
        this.append((Item)this.cfr_renamed_1);
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
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, AutoBanDa.var_boolean_int);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, AutoBanDa.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, AutoBanDa.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(3, AutoBanDa.dangChayAuto);
    }

        static {
        aa.cfr_renamed_0();
    }
}

