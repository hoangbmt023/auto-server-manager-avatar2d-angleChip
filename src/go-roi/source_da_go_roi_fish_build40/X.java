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

public final class X
extends Form
implements CommandListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private final TextField var_javax_microedition_lcdui_TextField_do = new TextField("T.gian chuyển map (ms):", String.valueOf(at.soXu), 5, 2);
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private static final int[] mangSoNguyen;

        public final void cfr_renamed_1() {
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
    }

    public final void commandAction(Command command, Displayable displayable) {
        block3: {
            if (!(command == this.var_javax_microedition_lcdui_Command_do)) break block3;
            at.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
            try {
                at.soXu = Long.parseLong(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
            }
            catch (NumberFormatException numberFormatException) {
                }
            if ("  ".length() < 0) {
                return;
            }
            at.cfr_renamed_3();
            GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public X() {
        super("Cài đặt Auto Ai Cập");
        int n;
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        String[] stringArray = new String[2];
        stringArray[0] = "Nhận đồ Pharaoh";
        stringArray[1] = "Bỏ đồ Pharaoh";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Có nhận quà không?", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
        if ((at.dangChayAuto)) {
            n = 1;
            if ((0x2A ^ 0x2E) == ((0x27 ^ 0x76) & ~(0x3D ^ 0x6C))) {
                throw null;
            }
        } else {
            n = 0;
        }
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(n, 1);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        5 = 65 + 138 - 193 + 172 ^ 154 + 112 - 135 + 48;
        2 = "  ".length();
        1 = " ".length();
        0 = (3 ^ 0x1F) & ~(0x88 ^ 0x94);
        4 = 0xA1 ^ 0xA5;
        7 = 0x4C ^ 0x4B;
    }

    static {
        X.cfr_renamed_0();
    }

    }

