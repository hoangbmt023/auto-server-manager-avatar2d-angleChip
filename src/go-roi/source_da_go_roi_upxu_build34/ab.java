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

public final class ab
extends Form
implements CommandListener {
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private static final int[] mangSoNguyen;
    private final ChoiceGroup cfr_renamed_1;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final Command var_javax_microedition_lcdui_Command_do;

    public final void commandAction(Command command, Displayable displayable) {
        block7: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block7;
            dn_0.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_do.getSelectedIndex();
            if ((this.cfr_renamed_1.isSelected(0))) {
                if (!(dn_0.dangChayAuto)) {
                    dn_0.dn_0_do().var_long_if = 0L;
                }
                dn_0.dangChayAuto = 1;
                if (" ".length() < 0) {
                    return;
                }
            } else {
                dn_0.dangChayAuto = 0;
            }
            try {
                dn_0.soLuong = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                dn_0.dn_0_do().soXu = dn_0.soLuong * 60000;
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ((0x3A ^ 0x3E) < " ".length()) {
                return;
            }
            dn_0.cfr_renamed_4();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    static {
        ab.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        1 = " ".length();
        2 = "  ".length();
        0 = (0xCA ^ 0x82) & ~(0x5E ^ 0x16);
        4 = 0xA2 ^ 0xA6;
        7 = 0x9D ^ 0x9A;
        60000 = 0xFFFFFB64 & 0xEEFB;
    }

        public ab() {
        super("Cài đặt Auto Treo Nick");
        String[] stringArray = new String[2];
        stringArray[0] = "Đăng xuất";
        stringArray[1] = "Đứng cười";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Tùy chọn", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("T.gian về farm (phút):", String.valueOf(dn_0.soLuong), 4, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray2 = new String[1];
        stringArray2[0] = "Thu hoạch đúng giờ";
        this.cfr_renamed_1 = new ChoiceGroup("Farm thông minh", 2, stringArray2, null);
        this.append((Item)this.cfr_renamed_1);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex((int)dn_0.var_byte_do, 1);
        this.cfr_renamed_1.setSelectedIndex(0, dn_0.dangChayAuto);
    }

    }

