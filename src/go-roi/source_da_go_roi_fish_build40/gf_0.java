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

/*
 * Renamed from gF
 */
public final class gf_0
extends Form
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do = new TextField("Danh sách cần tìm:", N.tenNhanVat, 1024, 0);
    private final TextField var_javax_microedition_lcdui_TextField_if;
    private static final int[] mangSoNguyen;
    private final TextField cfr_renamed_2;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final TextField cfr_renamed_3;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_if;

    public gf_0() {
        super("Cài đặt tìm IG");
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.cfr_renamed_2 = new TextField("Khu bắt đầu:", String.valueOf(N.soLuong), 3, 2);
        this.append((Item)this.cfr_renamed_2);
        this.var_javax_microedition_lcdui_TextField_if = new TextField("Khu kết thúc:", String.valueOf(N.soLuongKhoa), 3, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_if);
        String[] stringArray = new String[2];
        stringArray[0] = "Tất cả map TP";
        stringArray[1] = "Tự cài đặt map";
        this.var_javax_microedition_lcdui_ChoiceGroup_if = new ChoiceGroup("Cài đặt chuyển map", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_if);
        this.cfr_renamed_3 = new TextField("Danh sách ID map:", N.chuoiGiaTri, 1024, 0);
        this.append((Item)this.cfr_renamed_3);
        String[] stringArray2 = new String[5];
        stringArray2[0] = "Bỏ qua khu đầy";
        stringArray2[1] = "Tự điểm danh ở CV";
        stringArray2[2] = "Tự bật auto dùng VP";
        stringArray2[3] = "Tự bật auto fish";
        stringArray2[4] = "Đánh NPC";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Tùy chọn", 2, stringArray2, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.append("- HD: Mỗi nhân vật hoặc map cách nhau dấu phẩy ,");
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, N.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, N.var_boolean_int);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, N.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(3, N.var_boolean_new);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(4, N.dangChayAuto);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex((int)N.var_byte_do, 1);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[8];
        1024 = 0xFFFFCDB2 & 0x364D;
        0 = (0xC9 ^ 0xAB) & ~(0x61 ^ 3);
        3 = "   ".length();
        2 = "  ".length();
        1 = " ".length();
        5 = 0xAA ^ 0xAF;
        4 = " ".length() ^ (0x2B ^ 0x2E);
        7 = 0x43 ^ 0x44;
    }

        public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            try {
                N.tenNhanVat = this.var_javax_microedition_lcdui_TextField_do.getString().trim();
                N.soLuong = Integer.parseInt(this.cfr_renamed_2.getString().trim());
                N.soLuongKhoa = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_if.getString().trim());
                N.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
                N.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
                N.coKichHoat = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2);
                N.var_boolean_new = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3);
                N.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(4);
                N.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_if.getSelectedIndex();
                N.chuoiGiaTri = TienIchGame.cfr_renamed_2(this.cfr_renamed_3.getString().trim());
                N.cfr_renamed_0();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
            }
            catch (NumberFormatException numberFormatException) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            if (((0xB0 ^ 0xA6) & ~(0xAC ^ 0xBA)) < 0) {
                return;
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    static {
        gf_0.cfr_renamed_1();
    }
}

