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
 *  javax.microedition.lcdui.ItemStateListener
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
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class FormCaiDatFarm
extends Form
implements CommandListener,
ItemStateListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final TextField var_javax_microedition_lcdui_TextField_if;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_if;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_for;
    private final TextField var_javax_microedition_lcdui_TextField_for;
    private final TextField var_javax_microedition_lcdui_TextField_int;
    private final TextField var_javax_microedition_lcdui_TextField_new;
    private final TextField cfr_renamed_5;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_int;
    private static final int[] mangSoNguyen;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_new;
    private final TextField cfr_renamed_6;

            public final void commandAction(Command object, Displayable displayable) {
        block20: {
            block19: {
                block18: {
                    if (!(object == this.var_javax_microedition_lcdui_Command_do)) break block20;
                    AutoFarm.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_do.getSelectedIndex();
                    AutoFarm.chuoiPhu = this.cfr_renamed_5.getString().trim();
                    try {
                        AutoFarm.var_int_char = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_if.getString().trim());
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.var_int_char = 30000;
                    }
                    if ("  ".length() <= 0) {
                        return;
                    }
                    AutoFarm.chuoiGiaTri = TienIchGame.cfr_renamed_2(this.var_javax_microedition_lcdui_TextField_for.getString().trim());
                    object = this.var_javax_microedition_lcdui_TextField_int.getString().trim();
                    if ((object.equals("-1"))) {
                        AutoFarm.tenNhanVat = object;
                        if ((((0x53 ^ 0x1D) & ~(0x8B ^ 0xC5) ^ (3 ^ 0x49)) & (0x22 ^ 0x36 ^ (0x41 ^ 0x1F) ^ -" ".length())) < ((0x6F ^ 6 ^ (0xCE ^ 0x97)) & (0x1D ^ 0x44 ^ (0xED ^ 0x84) ^ -" ".length()))) {
                            return;
                        }
                    } else {
                        AutoFarm.tenNhanVat = TienIchGame.cfr_renamed_2((String)object);
                    }
                    try {
                        AutoFarm.var_int_goto = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_new.getString().trim());
                        if (!(AutoFarm.var_int_goto == 32000)) break block18;
                        AutoFarm.var_int_goto = 32000;
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.var_int_goto = 32000;
                    }
                }
                if (-" ".length() >= 0) {
                    return;
                }
                try {
                    AutoFarm.var_int_else = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.var_int_else = 0;
                }
                if ("   ".length() <= -" ".length()) {
                    return;
                }
                AutoFarm.var_byte_if = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_for.getSelectedIndex();
                AutoFarm.var_byte_for = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_int.getSelectedIndex();
                AutoFarm.this = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(0);
                AutoFarm.var_boolean_char = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(1);
                AutoFarm.var_boolean_goto = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(2);
                AutoFarm.var_boolean_else = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(3);
                AutoFarm.cfr_renamed_12 = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(4);
                AutoFarm.var_boolean_long = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(5);
                bp_0.cfr_renamed_5 = this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(0);
                bp_0.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(2);
                bp_0.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(3);
                if ((bp_0.coTrangThai)) {
                    bp_0.var_boolean_new = 1;
                    if (-(0x55 ^ 0x50) >= 0) {
                        return;
                    }
                } else {
                    bp_0.var_boolean_new = this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(1);
                }
                try {
                    AutoFarm.cfr_renamed_6 = Integer.parseInt(this.cfr_renamed_6.getString().trim());
                    if ((AutoFarm.cfr_renamed_6 >= 0) && !(AutoFarm.cfr_renamed_6 == 50)) break block19;
                    AutoFarm.cfr_renamed_6 = 50;
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.cfr_renamed_6 = 50;
                }
            }
            if (((0x90 ^ 0x9C ^ (0xE6 ^ 0xB6)) & (0x22 ^ 0x5F ^ (0x51 ^ 0x70) ^ -" ".length())) < ((102 + 52 - 71 + 57 ^ 115 + 30 - 142 + 128) & (0x65 ^ 0x2A ^ (0x6E ^ 0x2E) ^ -" ".length()))) {
                return;
            }
            AutoFarm.cfr_renamed_9();
            GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public final void itemStateChanged(Item item) {
        if ((item == this.var_javax_microedition_lcdui_ChoiceGroup_new)) {
            if ((this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(3)) && !(this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(1))) {
                this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(1, 1);
                return;
            }
            if (!(this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(1)) && (this.var_javax_microedition_lcdui_ChoiceGroup_new.isSelected(2))) {
                this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(2, 0);
            }
        }
    }

    static {
        FormCaiDatFarm.cfr_renamed_1();
    }

                private static void cfr_renamed_1() {
        mangSoNguyen = new int[12];
        1 = " ".length();
        2 = "  ".length();
        0 = (0x9D ^ 0x9A ^ (0xB1 ^ 0xAC)) & (7 + 80 - 47 + 106 ^ 134 + 54 - 149 + 97 ^ -" ".length());
        1024 = -(0xFFFFD3F3 & 0x7CFF) & (0xFFFFDFFF & 0x74F2);
        5 = 67 + 57 - 82 + 111 ^ 20 + 51 - -13 + 72;
        6 = 0x15 ^ 0x55 ^ (0x4E ^ 8);
        3 = "   ".length();
        4 = 0xB ^ 0xF;
        7 = 0x3C ^ 0x1E ^ (0x6E ^ 0x4B);
        30000 = -(0xFFFFCACB & 0x373F) & (0xFFFFFF3A & 0x77FF);
        32000 = -(0xFFFF9FEF & 0x62BD) & (0xFFFFFFFE & 0x7FAD);
        50 = 0x48 ^ 0x7A;
    }

    public FormCaiDatFarm() {
        super("Cài đặt Auto Farm");
        String[] stringArray = new String[2];
        stringArray[0] = "Lái buôn hỗ trợ";
        stringArray[1] = "Farm bình thường";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Cơ chế Auto", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.cfr_renamed_5 = new TextField("Món ăn dự bị (id1,id2,..)", AutoFarm.chuoiPhu, 1024, 0);
        this.append((Item)this.cfr_renamed_5);
        this.var_javax_microedition_lcdui_TextField_for = new TextField("Cây trồng dự bị (id1,id2,..)", AutoFarm.chuoiGiaTri, 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_for);
        this.var_javax_microedition_lcdui_TextField_if = new TextField("Thay thế cây khi đạt số lượng:", String.valueOf(AutoFarm.var_int_char), 5, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_if);
        this.var_javax_microedition_lcdui_TextField_int = new TextField("Bán nông sản: -1 (all) or (id1,id2,...)", AutoFarm.tenNhanVat, 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_int);
        this.var_javax_microedition_lcdui_TextField_new = new TextField("Bán nông sản khi đạt số lượng:", String.valueOf(AutoFarm.var_int_goto), 5, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_new);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Số lượng nông sản khi bán:", String.valueOf(AutoFarm.var_int_else), 5, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Báo danh hàng ngày";
        stringArray2[1] = "Nâng cấp cây khế";
        stringArray2[2] = "Nhiệm vụ ấp rồng";
        stringArray2[3] = "Nhiệm vụ luyện rồng";
        stringArray2[4] = "Giao đơn hàng";
        stringArray2[5] = "Ko tự mua (hạt giống/vật nuôi) dùng lượng";
        this.var_javax_microedition_lcdui_ChoiceGroup_if = new ChoiceGroup("Tùy chọn", 2, stringArray2, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_if);
        this.cfr_renamed_6 = new TextField("Nâng cây khế đến cấp:", String.valueOf(AutoFarm.cfr_renamed_6), 2, 2);
        this.append((Item)this.cfr_renamed_6);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Thu hoạch tim";
        stringArray3[1] = "Cho em bé ăn";
        stringArray3[2] = "Mua sữa lượng khi ko đủ NS";
        stringArray3[3] = "Nâng cấp em bé";
        this.var_javax_microedition_lcdui_ChoiceGroup_new = new ChoiceGroup("Chức năng vợ chồng", 2, stringArray3, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_new);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Cá";
        stringArray4[1] = "Rùa";
        stringArray4[2] = "Không";
        this.var_javax_microedition_lcdui_ChoiceGroup_for = new ChoiceGroup("Bổ sung hồ cá nếu chưa full", 1, stringArray4, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_for);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Gà";
        stringArray5[1] = "Vịt";
        stringArray5[2] = "Heo";
        stringArray5[3] = "Không";
        this.var_javax_microedition_lcdui_ChoiceGroup_int = new ChoiceGroup("Bổ sung vật nuôi nếu chưa full", 1, stringArray5, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_int);
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.setItemStateListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex((int)AutoFarm.var_byte_do, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_for.setSelectedIndex((int)AutoFarm.var_byte_if, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_int.setSelectedIndex((int)AutoFarm.var_byte_for, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(0, AutoFarm.this);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(1, AutoFarm.var_boolean_char);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(2, AutoFarm.var_boolean_goto);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(3, AutoFarm.var_boolean_else);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(4, AutoFarm.cfr_renamed_12);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(5, AutoFarm.var_boolean_long);
        this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(0, bp_0.cfr_renamed_5);
        this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(1, bp_0.var_boolean_new);
        this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(2, bp_0.var_boolean_int);
        this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex(3, bp_0.coTrangThai);
    }
}

