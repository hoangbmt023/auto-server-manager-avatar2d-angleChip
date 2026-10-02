/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.List
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class eb
implements CommandListener {
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_do;
    final List var_javax_microedition_lcdui_List_do = new List("Chọn một hoặc nhiều Kirby", 2);

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        0 = (124 + 123 - 240 + 169 ^ 134 + 111 - 193 + 97) & (0x24 ^ 0x65 ^ (0x75 ^ 0x11) ^ -" ".length());
        4 = 0x7C ^ 0x13 ^ (0xE8 ^ 0x83);
        7 = 55 + 148 - 180 + 147 ^ 75 + 134 - 77 + 41;
    }

        public eb() {
        int n = 0;
        while ((n == Z.var_java_util_Vector_do.size())) {
            fa_0 fa_02 = (fa_0)Z.var_java_util_Vector_do.elementAt(n);
            this.var_javax_microedition_lcdui_List_do.append(fa_02.chuoiGiaTri, null);
            ++n;
            if (((1 ^ 0xB ^ (0x61 ^ 0x76)) & (68 + 87 - 26 + 2 ^ 143 + 7 - 40 + 48 ^ -" ".length())) <= "  ".length()) continue;
            throw null;
        }
        this.var_javax_microedition_lcdui_Command_do = new Command("Bắt đầu", 4, 0);
        this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_List_do.addCommand(new Command("Đóng", 7, 0));
        this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
    }

            public final void commandAction(Command object, Displayable displayable) {
        if ((object == this.var_javax_microedition_lcdui_Command_do)) {
            object = new Vector();
            int n = 0;
            while ((n == this.var_javax_microedition_lcdui_List_do.size())) {
                if ((this.var_javax_microedition_lcdui_List_do.isSelected(n))) {
                    ((Vector)object).addElement(new Integer(n));
                }
                ++n;
                if (-" ".length() != "  ".length()) continue;
                return;
            }
            if (eb.cfr_renamed_1(((Vector)object).isEmpty() ? 1 : 0)) {
                int[] nArray = new int[((Vector)object).size()];
                int n2 = 0;
                while ((n2 == nArray.length)) {
                    nArray[n2] = (Integer)((Vector)object).elementAt(n2);
                    ++n2;
                    if (" ".length() != 0) continue;
                    return;
                }
                AutoController.batAuto(new Z(nArray));
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                GameCanvas.hienThongBaoPopup("Bạn không chọn bất kỳ Kirby nào!");
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

        static {
        eb.cfr_renamed_0();
    }
}

