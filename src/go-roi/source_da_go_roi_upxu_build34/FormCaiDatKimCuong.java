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
 * Renamed from gL
 */
public final class FormCaiDatKimCuong
extends Form
implements CommandListener {
    private static final int[] mangSoNguyen;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final ChoiceGroup cfr_renamed_1;
    private final ChoiceGroup cfr_renamed_3;
    private final TextField var_javax_microedition_lcdui_TextField_do;

            public final void commandAction(Command command, Displayable displayable) {
        block4: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block4;
            AutoKimCuong.var_boolean_int = this.cfr_renamed_1.isSelected(0);
            AutoKimCuong.cfr_renamed_5 = this.cfr_renamed_1.isSelected(1);
            AutoKimCuong.coKichHoat = this.cfr_renamed_1.isSelected(2);
            AutoKimCuong.dangChayAuto = this.cfr_renamed_1.isSelected(3);
            AutoKimCuong.cfr_renamed_2 = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
            AutoKimCuong.var_byte_if = (byte)this.cfr_renamed_3.getSelectedIndex();
            try {
                AutoKimCuong.var_int_if = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                AutoKimCuong.X_do().var_long_if = AutoKimCuong.var_int_if * 60000;
                AutoKimCuong.X_do().soXu = 0L;
            }
            catch (NumberFormatException numberFormatException) {
                }
            if (-" ".length() >= "   ".length()) {
                return;
            }
            if ((AutoKimCuong.coKichHoat) && (AutoKimCuong.dangChayAuto)) {
                AutoKimCuong.var_boolean_int = 0;
            }
            AutoKimCuong.cfr_renamed_4();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public FormCaiDatKimCuong() {
        super("Cài đặt Auto KC");
        String[] stringArray = new String[4];
        stringArray[0] = "Bán đá khi đầy rương";
        stringArray[1] = "Tự về chăm farm";
        stringArray[2] = "Tự bỏ KCX";
        stringArray[3] = "Tự bỏ NHB";
        this.cfr_renamed_1 = new ChoiceGroup("Tùy chọn", 2, stringArray, null);
        this.append((Item)this.cfr_renamed_1);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("T.gian về farm (phút):", String.valueOf(AutoKimCuong.var_int_if), 4, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Thu hoạch đúng giờ";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Farm thông minh", 2, stringArray2, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        String[] stringArray3 = new String[7];
        stringArray3[0] = "Vàng";
        stringArray3[1] = "Trắng";
        stringArray3[2] = "Đỏ";
        stringArray3[3] = "Xanh lam";
        stringArray3[4] = "Xanh lá";
        stringArray3[5] = "Tím";
        stringArray3[6] = "Mặc định";
        this.cfr_renamed_3 = new ChoiceGroup("Thứ tự ưu tiên", 1, stringArray3, null);
        this.append((Item)this.cfr_renamed_3);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.cfr_renamed_1.setSelectedIndex(0, AutoKimCuong.var_boolean_int);
        this.cfr_renamed_1.setSelectedIndex(1, AutoKimCuong.cfr_renamed_5);
        this.cfr_renamed_1.setSelectedIndex(2, AutoKimCuong.coKichHoat);
        this.cfr_renamed_1.setSelectedIndex(3, AutoKimCuong.dangChayAuto);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, AutoKimCuong.cfr_renamed_2);
        this.cfr_renamed_3.setSelectedIndex((int)AutoKimCuong.var_byte_if, 1);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[9];
        2 = "  ".length();
        4 = 0x68 ^ 0x73 ^ (0x4F ^ 0x50);
        0 = (0x84 ^ 0xB1 ^ (0x96 ^ 0xB8)) & (175 + 64 - 111 + 93 ^ 183 + 166 - 172 + 21 ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        7 = 0xD7 ^ 0x91 ^ (7 ^ 0x46);
        5 = 0x36 ^ 0x13 ^ (0x83 ^ 0xA3);
        6 = 0x5B ^ 0x5D;
        60000 = 0xFFFFFB64 & 0xEEFB;
    }

    static {
        FormCaiDatKimCuong.cfr_renamed_0();
    }
}

