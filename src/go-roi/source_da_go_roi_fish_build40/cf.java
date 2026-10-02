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

final class cf
extends Form
implements CommandListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_do;

        static {
        cf.cfr_renamed_1();
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[4];
        1024 = 0xFFFFA749 & 0x5CB6;
        0 = (0 ^ 0x11 ^ (0xB4 ^ 0xB1)) & (0xB8 ^ 0x82 ^ (0x3E ^ 0x10) ^ -" ".length());
        4 = 0x1C ^ 0x18;
        7 = 176 + 194 - 303 + 131 ^ 186 + 26 - 210 + 191;
    }

    public final void commandAction(Command object, Displayable displayable) {
        if ((object == this.var_javax_microedition_lcdui_Command_do)) {
            j_0.j_0_do();
            object = j_0.java_lang_String_do(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
            if ((object == 0) && cf.cfr_renamed_1(((String)object).equals("") ? 1 : 0)) {
                GameCanvas.cfr_renamed_8();
                j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
                j_0.void_if();
                j_0.void_do((String)object);
                j_0.j_0_do();
                j_0.void_for();
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thành công! Hãy xóa file dữ liệu TK để tránh bị lộ");
                if (" ".length() != " ".length()) {
                    return;
                }
            } else {
                GameCanvas.hienThongBaoPopup("Nhập dữ liệu thất bại! Hãy kiểm tra lại đường dẫn tới file dữ liệu.");
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public cf() {
        super("Nhập dữ liệu");
        j_0.j_0_do();
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Đường dẫn: ", j_0.java_lang_String_do(), 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Nhập", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Hủy", 7, 0));
        this.setCommandListener(this);
    }

        }

