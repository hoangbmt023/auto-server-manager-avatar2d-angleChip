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
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class ap
extends Form
implements CommandListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final ChoiceGroup cfr_renamed_0;

    static {
        ap.cfr_renamed_1();
    }

    public ap() {
        super("Cài đặt chăm farm bạn bè");
        String[] stringArray = new String[4];
        stringArray[0] = "Tưới nước";
        stringArray[1] = "Diệt sâu";
        stringArray[2] = "Diệt cỏ";
        stringArray[3] = "Bón phân";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Chăm sóc cây trồng", 2, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        String[] stringArray2 = new String[4];
        stringArray2[0] = "Cho ăn";
        stringArray2[1] = "Chữa bệnh cúm";
        stringArray2[2] = "Chữa bệnh tiêu chảy";
        stringArray2[3] = "Bơm thuốc bổ";
        this.cfr_renamed_0 = new ChoiceGroup("Chăm sóc vật nuôi", 2, stringArray2, null);
        this.append((Item)this.cfr_renamed_0);
        this.append("Lưu ý: nếu lái buôn hỗ trợ đang được kích hoạt. Bạn cần đăng xuất ra và đăng nhập lại mới có thể chăm farm bạn bè!");
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, az_0.cfr_renamed_7);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, az_0.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, az_0.cfr_renamed_4);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(3, az_0.cfr_renamed_5);
        this.cfr_renamed_0.setSelectedIndex(0, az_0.coKichHoat);
        this.cfr_renamed_0.setSelectedIndex(1, az_0.dangChayAuto);
        this.cfr_renamed_0.setSelectedIndex(2, az_0.cfr_renamed_6);
        this.cfr_renamed_0.setSelectedIndex(3, az_0.var_boolean_int);
    }

        public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            az_0.cfr_renamed_7 = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
            az_0.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
            az_0.cfr_renamed_4 = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2);
            az_0.cfr_renamed_5 = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3);
            az_0.coKichHoat = this.cfr_renamed_0.isSelected(0);
            az_0.dangChayAuto = this.cfr_renamed_0.isSelected(1);
            az_0.cfr_renamed_6 = this.cfr_renamed_0.isSelected(2);
            az_0.var_boolean_int = this.cfr_renamed_0.isSelected(3);
            az_0.cfr_renamed_3();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        2 = "  ".length();
        4 = 0x9A ^ 0x9E;
        0 = (0x34 ^ 0x3A ^ (0x18 ^ 1)) & (2 ^ 0x6C ^ (0x68 ^ 0x11) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        7 = 0x14 ^ 0x47 ^ (0x3F ^ 0x6B);
    }
}

