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
 *  javax.microedition.lcdui.ItemStateListener
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
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class FormCaiDatCauCa
extends Form
implements CommandListener,
ItemStateListener {
    private static final int[] mangSoNguyen;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_if;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final TextField var_javax_microedition_lcdui_TextField_if = new TextField("Ngoại trừ:", AutoCauCa.chuoiGiaTri, 1024, 0);
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_for;
    private final TextField var_javax_microedition_lcdui_TextField_for;
    private final ChoiceGroup cfr_renamed_3;
    private final ChoiceGroup cfr_renamed_4;
    private final Command var_javax_microedition_lcdui_Command_do;

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == this.var_javax_microedition_lcdui_Command_do)) {
            try {
                AutoCauCa.var_byte_if = (byte)this.cfr_renamed_4.getSelectedIndex();
                AutoCauCa.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_for.getSelectedIndex();
                AutoCauCa.var_byte_for = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_do.getSelectedIndex();
                AutoCauCa.chuoiGiaTri = this.var_javax_microedition_lcdui_TextField_if.getString().trim();
                AutoCauCa.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(0);
                AutoCauCa.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(1);
                AutoCauCa.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(2);
                AutoCauCa.cfr_renamed_7 = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                AutoCauCa.soLuong = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_for.getString().trim());
                AutoCauCa.coKichHoat = this.cfr_renamed_3.isSelected(0);
                AutoCauCa.bs_0_do().soXu = AutoCauCa.cfr_renamed_7 * 60000;
                AutoCauCa.bs_0_do().var_long_if = 0L;
                AutoCauCa.cfr_renamed_6();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
                }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            if (((0x7F ^ 0x35) & ~(0xF3 ^ 0xB9)) >= (0x21 ^ 0x25)) {
                return;
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

            public FormCaiDatCauCa() {
        super("Cài đặt Auto Fish");
        this.var_javax_microedition_lcdui_TextField_do = new TextField("T.gian về farm (phút):", String.valueOf(AutoCauCa.cfr_renamed_7), 4, 2);
        this.var_javax_microedition_lcdui_TextField_for = new TextField("Bán KCX khi đạt số lượng:", String.valueOf(AutoCauCa.soLuong), 3, 2);
        String[] stringArray = new String[1];
        stringArray[0] = "Thu hoạch đúng giờ";
        this.cfr_renamed_3 = new ChoiceGroup("Farm thông minh", 2, stringArray, null);
        String[] stringArray2 = new String[3];
        stringArray2[0] = "Cá rô, chép vàng, lòng tong";
        stringArray2[1] = "Cá lóc, cá nóc, cua";
        stringArray2[2] = "Cá mập, chim, đuối, ngựa";
        this.cfr_renamed_4 = new ChoiceGroup("Chọn map câu cá", 1, stringArray2, null);
        this.append((Item)this.cfr_renamed_4);
        String[] stringArray3 = new String[3];
        stringArray3[0] = "Tự mua vé câu";
        stringArray3[1] = "Về chăm farm";
        stringArray3[2] = "Bán kim cương xanh";
        this.var_javax_microedition_lcdui_ChoiceGroup_if = new ChoiceGroup("Tùy chọn", 2, stringArray3, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_if);
        if ((AutoCauCa.coTrangThai)) {
            this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
            this.append((Item)this.cfr_renamed_3);
            }
        if ((AutoCauCa.var_boolean_int)) {
            this.append((Item)this.var_javax_microedition_lcdui_TextField_for);
            }
        String[] stringArray4 = new String[4];
        stringArray4[0] = "Không tự mua";
        stringArray4[1] = "Mua cần VIP";
        stringArray4[2] = "Mua cần Sắt";
        stringArray4[3] = "Mua cần Tre";
        this.var_javax_microedition_lcdui_ChoiceGroup_for = new ChoiceGroup("Tự mua cần câu?", 1, stringArray4, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_for);
        String[] stringArray5 = new String[3];
        stringArray5[0] = "Bán tại chỗ";
        stringArray5[1] = "Bán khu sinh thái";
        stringArray5[2] = "Bỏ cá";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Cài đặt bán cá", 1, stringArray5, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        if ((AutoCauCa.var_byte_for == 2)) {
            this.append((Item)this.var_javax_microedition_lcdui_TextField_if);
            }
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.setItemStateListener(this);
        this.cfr_renamed_4.setSelectedIndex((int)AutoCauCa.var_byte_if, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_for.setSelectedIndex((int)AutoCauCa.var_byte_do, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex((int)AutoCauCa.var_byte_for, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(0, AutoCauCa.dangChayAuto);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(1, AutoCauCa.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(2, AutoCauCa.var_boolean_int);
        this.cfr_renamed_3.setSelectedIndex(0, AutoCauCa.coKichHoat);
    }

        private int (Item item != 0) {
        int n = 0;
        while ((n < this.size())) {
            if ((this.get(n) == item)) {
                return n;
            }
            ++n;
            return (0x2E ^ 0x3F) & ~(0xD6 ^ 0xC7);
        }
        return -1;
    }

    static {
        FormCaiDatCauCa.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[9];
        1024 = 0xFFFFDD22 & 0x26DD;
        0 = (0xCD ^ 0xC3) & ~(0x92 ^ 0x9C);
        4 = 0x68 ^ 0x6C;
        2 = "  ".length();
        3 = "   ".length();
        1 = " ".length();
        7 = 0xB8 ^ 0xBF;
        60000 = -(0x2A ^ 0xA) & (0xFFFFFF7F & 0xEAFF);
        -1 = -" ".length();
    }

            public final void itemStateChanged(Item item) {
        if ((item == this.var_javax_microedition_lcdui_ChoiceGroup_do)) {
            int n = this.cfr_renamed_1((Item)this.var_javax_microedition_lcdui_TextField_if);
            if ((this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2))) {
                if ((n == -1)) {
                    this.var_javax_microedition_lcdui_TextField_if.setString(AutoCauCa.chuoiGiaTri);
                    this.insert(this.cfr_renamed_1((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do) + 1, (Item)this.var_javax_microedition_lcdui_TextField_if);
                    return;
                }
            } else if ((n != -1)) {
                this.delete(n);
            }
            return;
        }
        if ((item == this.var_javax_microedition_lcdui_ChoiceGroup_if)) {
            int n = this.cfr_renamed_1((Item)this.var_javax_microedition_lcdui_ChoiceGroup_if);
            int n2 = this.cfr_renamed_1((Item)this.var_javax_microedition_lcdui_TextField_do);
            int n3 = this.cfr_renamed_1((Item)this.cfr_renamed_3);
            if ((this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(1))) {
                if ((n2 == -1)) {
                    n2 = n + 1;
                    this.var_javax_microedition_lcdui_TextField_do.setString(String.valueOf(AutoCauCa.cfr_renamed_7));
                    this.insert(n2, (Item)this.var_javax_microedition_lcdui_TextField_do);
                }
                if ((n3 == -1)) {
                    n3 = n2 + 1;
                    this.cfr_renamed_3.setSelectedIndex(0, AutoCauCa.coKichHoat);
                    this.insert(n3, (Item)this.cfr_renamed_3);
                    if ("  ".length() < 0) {
                        return;
                    }
                }
            } else {
                if ((n3 != -1)) {
                    this.delete(n3);
                }
                if ((n2 != -1)) {
                    this.delete(n2);
                }
            }
            n2 = this.cfr_renamed_1((Item)this.var_javax_microedition_lcdui_TextField_for);
            if ((this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(2))) {
                if ((n2 == -1)) {
                    int n4;
                    n2 = this.cfr_renamed_1((Item)this.cfr_renamed_3);
                    this.var_javax_microedition_lcdui_TextField_for.setString(String.valueOf(AutoCauCa.soLuong));
                    if ((n2 != -1)) {
                        n4 = n2 + 1;
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    } else {
                        n4 = n + 1;
                    }
                    this.insert(n4, (Item)this.var_javax_microedition_lcdui_TextField_for);
                    return;
                }
            } else if ((n2 != -1)) {
                this.delete(n2);
            }
        }
    }
}

