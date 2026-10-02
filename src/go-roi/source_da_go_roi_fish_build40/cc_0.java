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

/*
 * Renamed from cc
 */
public final class cc_0
implements CommandListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;
    private final List var_javax_microedition_lcdui_List_do = new List("Chọn một hoặc nhiều Kirby", 2);

    public final void cfr_renamed_1() {
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
    }

        static {
        cc_0.cfr_renamed_0();
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
                if (-"   ".length() < 0) continue;
                return;
            }
            if (cc_0.cfr_renamed_0(((Vector)object).isEmpty() ? 1 : 0)) {
                int[] nArray = new int[((Vector)object).size()];
                int n2 = 0;
                while ((n2 == nArray.length)) {
                    nArray[n2] = (Integer)((Vector)object).elementAt(n2);
                    ++n2;
                    if ("   ".length() != "  ".length()) continue;
                    return;
                }
                AutoController.cfr_renamed_1(new al(nArray));
                if (-" ".length() > -" ".length()) {
                    return;
                }
            } else {
                GameCanvas.hienThongBaoPopup("Bạn không chọn bất kỳ Kirby nào!");
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

            public cc_0() {
        int n = 0;
        while ((n == al.var_java_util_Vector_do.size())) {
            gi_0 gi_02 = (gi_0)al.var_java_util_Vector_do.elementAt(n);
            this.var_javax_microedition_lcdui_List_do.append(gi_02.chuoiGiaTri, null);
            ++n;
            if (((0x69 ^ 0x57 ^ (0xB0 ^ 0x90)) & (0xC3 ^ 0xC4 ^ (0xBF ^ 0xA6) ^ -" ".length())) == 0) continue;
            throw null;
        }
        this.var_javax_microedition_lcdui_Command_do = new Command("Bắt đầu", 4, 0);
        this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_List_do.addCommand(new Command("Đóng", 7, 0));
        this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[4];
        2 = "  ".length();
        0 = (0x42 ^ 0x49 ^ (0x5E ^ 5)) & (0x21 ^ 0x33 ^ (0x6D ^ 0x2F) ^ -" ".length());
        4 = 0x24 ^ 0x20;
        7 = 0x2D ^ 0x72 ^ (0x6A ^ 0x32);
    }
}

