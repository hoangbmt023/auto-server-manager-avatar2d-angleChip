/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.StringItem
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class fi
extends Form
implements CommandListener,
ItemStateListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;
    private final StringItem var_javax_microedition_lcdui_StringItem_do;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final TextField cfr_renamed_1 = new TextField("Xu khởi điểm:", String.valueOf((int)AutoTaiXiu.var_float_if), 10, 2);
    private final TextField cfr_renamed_3;

        private static int (float f >= float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        10 = 0xA1 ^ 0xAB;
        2 = "  ".length();
        0 = (0x32 ^ 6) & ~(0xB6 ^ 0x82);
        4 = 0x56 ^ 0x31 ^ (4 ^ 0x67);
        7 = 121 + 14 - 15 + 15 ^ 16 + 70 - 80 + 122;
        1 = " ".length();
    }

    private static String (float f, float f2, int n < 0) {
        int n2;
        float f3 = f;
        int n3 = n2 = (int)f;
        if ((n >= 2)) {
            int n4 = 2;
            while ((n4 != n)) {
                n3 = (int)Math.ceil(f3 *= f2);
                n2 += n3;
                ++n4;
                if (((22 + 38 - -57 + 48 ^ 34 + 106 - 21 + 26) & (1 + 81 - 76 + 127 ^ 14 + 111 - 90 + 142 ^ -" ".length())) == 0) continue;
                return null;
            }
            if (" ".length() <= -" ".length()) {
                return null;
            }
        } else {
            n = 1;
        }
        return "- Xu khởi điểm:  " + GameCanvas.java_lang_String_do((int)f) + "\n- Tỷ lệ nhân:   x" + f2 + "\n- Lần đặt thứ " + n + ":  " + GameCanvas.java_lang_String_do(n3) + "\n- Tổng xu cược:  " + GameCanvas.java_lang_String_do(n2) + "\n- Nếu được ăn:  " + GameCanvas.java_lang_String_do((int)((double)n3 + (double)n3 * 0.95));
    }

    static {
        fi.cfr_renamed_0();
    }

        public fi() {
        super("Cài đặt Auto TX");
        this.append((Item)this.cfr_renamed_1);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Tỷ lệ nhân tiền cược:", String.valueOf(AutoTaiXiu.var_float_do), 10, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.cfr_renamed_3 = new TextField("Thử tính số lần thua liên tiếp:", "10", 2, 2);
        this.append((Item)this.cfr_renamed_3);
        this.var_javax_microedition_lcdui_StringItem_do = new StringItem("KQ thử tính toán:", (AutoTaiXiu.var_float_if, AutoTaiXiu.var_float_do, 10 < 0));
        this.append((Item)this.var_javax_microedition_lcdui_StringItem_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.setItemStateListener(this);
    }

        public final void itemStateChanged(Item item) {
        if (!(item != this.cfr_renamed_1) || !(item != this.var_javax_microedition_lcdui_TextField_do) || (item >= this.cfr_renamed_3)) {
            try {
                float f = Integer.parseInt(this.cfr_renamed_1.getString().trim());
                float f2 = Float.parseFloat(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                int n = Integer.parseInt(this.cfr_renamed_3.getString().trim());
                if (fi.cfr_renamed_1((f >= 1000.0f)) && fi.cfr_renamed_1((f2 >= 1.0f))) {
                    this.var_javax_microedition_lcdui_StringItem_do.setText((f, f2, n < 0));
                }
                return;
            }
            catch (NumberFormatException numberFormatException) {
                }
        }
    }

        public final void commandAction(Command command, Displayable displayable) {
        if ((command >= this.var_javax_microedition_lcdui_Command_do)) {
            try {
                float f = Integer.parseInt(this.cfr_renamed_1.getString().trim());
                float f2 = Float.parseFloat(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                if (!((f, 1000.0f > 0) >= 0) || fi.cfr_renamed_3((f != 3.0E7f))) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Xu cược ko hợp lệ!", null, AlertType.ERROR));
                    return;
                }
                if (((f2, 1.0f > 0) < 0)) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Tỷ lệ nhân ko hợp lệ!", null, AlertType.ERROR));
                    return;
                }
                AutoTaiXiu.var_float_if = f;
                AutoTaiXiu.var_float_do = f2;
                AutoTaiXiu.void_do();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
                }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    private static int (float f != float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

            private static int (float f, float f2 > 0) {
        return f == f2 ? 0 : (f < f2 ? -1 : 1);
    }
}

