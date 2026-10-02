/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
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
 * Renamed from ag
 */
final class ag_0
extends Form
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_do;

    public ag_0() {
        super("Nhập dữ liệu");
        az.az_do();
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Đường dẫn: ", az.java_lang_String_do(), 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Nhập", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
    }

        static {
        ag_0.cfr_renamed_0();
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        1024 = 0xFFFFFC64 & 0x79B;
        0 = (101 + 35 - -25 + 12 ^ 71 + 129 - 141 + 121) & (0xE9 ^ 0xAB ^ (0x39 ^ 0x62) ^ -" ".length());
        4 = 0xF0 ^ 0xA1 ^ (0x1A ^ 0x4F);
        7 = 0x2F ^ 0x58 ^ (0xA ^ 0x7A);
    }

        public final void commandAction(Command object, Displayable displayable) {
        if ((object == this.var_javax_microedition_lcdui_Command_do)) {
            az.az_do();
            object = az.java_lang_String_do(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
            if ((object != null) && ag_0.cfr_renamed_0(((String)object).equals("") ? 1 : 0)) {
                GameCanvas.cfr_renamed_5();
                az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
                az.void_for();
                az.void_do((String)object);
                az.az_do();
                az.void_if();
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thành công! Hãy xóa file dữ liệu TK để tránh bị lộ");
                if (" ".length() == 0) {
                    return;
                }
            } else {
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thất bại! Hãy kiểm tra lại đường dẫn tới file dữ liệu.");
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }
}

