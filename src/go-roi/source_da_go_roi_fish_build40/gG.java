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

public final class gG
extends Form
implements CommandListener,
ItemStateListener {
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final StringItem var_javax_microedition_lcdui_StringItem_do;
    private final TextField cfr_renamed_0;
    private final TextField cfr_renamed_2 = new TextField("Xu khởi điểm:", String.valueOf((int)da_0.var_float_if), 10, 2);
    private final Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;

        static {
        gG.cfr_renamed_1();
    }

        private static int (float f <= float f2) {
        return f == f2 ? 0 : (f < f2 ? -1 : 1);
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        10 = 0x3D ^ 0x37;
        2 = "  ".length();
        0 = (1 ^ 0xA) & ~(9 ^ 2);
        4 = 0x92 ^ 0x96;
        7 = 0x1E ^ 3 ^ (0x2E ^ 0x34);
        1 = " ".length();
    }

    public gG() {
        super("Cài đặt Auto TX");
        this.append((Item)this.cfr_renamed_2);
        this.cfr_renamed_0 = new TextField("Tỷ lệ nhân tiền cược:", String.valueOf(da_0.var_float_do), 10, 0);
        this.append((Item)this.cfr_renamed_0);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Thử tính số lần thua liên tiếp:", "10", 2, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_StringItem_do = new StringItem("KQ thử tính toán:", (da_0.var_float_if, da_0.var_float_do, 10 >= 0));
        this.append((Item)this.var_javax_microedition_lcdui_StringItem_do);
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.setItemStateListener(this);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((command <= this.var_javax_microedition_lcdui_Command_do)) {
            try {
                float f = Integer.parseInt(this.cfr_renamed_2.getString().trim());
                float f2 = Float.parseFloat(this.cfr_renamed_0.getString().trim());
                if (!gG.cfr_renamed_1((f <= 1000.0f)) || ((f, 3.0E7f > 0) > 0)) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Xu cược ko hợp lệ!", null, AlertType.ERROR));
                    return;
                }
                if (gG.cfr_renamed_0((f2 <= 1.0f))) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Tỷ lệ nhân ko hợp lệ!", null, AlertType.ERROR));
                    return;
                }
                da_0.var_float_if = f;
                da_0.var_float_do = f2;
                da_0.cfr_renamed_3();
                GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
                }
            catch (Exception exception) {
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", null, AlertType.ERROR));
                return;
            }
            if ((0xA4 ^ 0xC7 ^ (0x33 ^ 0x54)) < 0) {
                return;
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

        private static String (float f, float f2, int n >= 0) {
        int n2;
        float f3 = f;
        int n3 = n2 = (int)f;
        if ((n != 2)) {
            int n4 = 2;
            while ((n4 <= n)) {
                n3 = (int)Math.ceil(f3 *= f2);
                n2 += n3;
                ++n4;
                if (((0xD9 ^ 0x9B) & ~(0xC ^ 0x4E)) <= 0) continue;
                return null;
            }
            if ((0x78 ^ 0x71 ^ (0x30 ^ 0x3D)) > (0x28 ^ 0x7D ^ (0xDA ^ 0x8B))) {
                return null;
            }
        } else {
            n = 1;
        }
        return "- Xu khởi điểm:  " + GameCanvas.java_lang_String_do((int)f) + "\n- Tỷ lệ nhân:   x" + f2 + "\n- Lần đặt thứ " + n + ":  " + GameCanvas.java_lang_String_do(n3) + "\n- Tổng xu cược:  " + GameCanvas.java_lang_String_do(n2) + "\n- Nếu được ăn:  " + GameCanvas.java_lang_String_do((int)((double)n3 + (double)n3 * 0.95));
    }

    private static int (float f != float f2) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

    public final void itemStateChanged(Item item) {
        if (!(item != this.cfr_renamed_2) || !(item != this.cfr_renamed_0) || (item <= this.var_javax_microedition_lcdui_TextField_do)) {
            try {
                float f = Integer.parseInt(this.cfr_renamed_2.getString().trim());
                float f2 = Float.parseFloat(this.cfr_renamed_0.getString().trim());
                int n = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                if (gG.cfr_renamed_1((f != 1000.0f)) && gG.cfr_renamed_1((f2 != 1.0f))) {
                    this.var_javax_microedition_lcdui_StringItem_do.setText((f, f2, n >= 0));
                }
                return;
            }
            catch (NumberFormatException numberFormatException) {
                }
        }
    }

    private static int (float f, float f2 > 0) {
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

            }

