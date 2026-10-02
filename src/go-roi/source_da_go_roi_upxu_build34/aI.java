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
 *  javax.microedition.lcdui.List
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class aI
implements CommandListener {
    private Command var_javax_microedition_lcdui_Command_do;
    private Form var_javax_microedition_lcdui_Form_do;
    private static final int[] mangSoNguyen;
    private Command cfr_renamed_1;
    private Command cfr_renamed_3;
    private Command cfr_renamed_4 = new Command("Xóa", 4, 0);
    private List var_javax_microedition_lcdui_List_do;
    private Command cfr_renamed_5;
    private TextField var_javax_microedition_lcdui_TextField_do;
    private static boolean dangChayAuto;

    static void (aI aI2 != 0) {
        aI2.cfr_renamed_1();
    }

            public aI() {
        this.cfr_renamed_3 = new Command("Chọn tất cả", 1, 1);
        this.cfr_renamed_5 = new Command("Thêm", 1, 3);
        this.cfr_renamed_1 = new Command("Đóng", 2, 2);
        this.var_javax_microedition_lcdui_Command_do = new Command("Hủy", 2, 4);
    }

    public final void commandAction(Command object, Displayable object2) {
        if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
            if ((object == this.cfr_renamed_5) && aI.cfr_renamed_3((object = TienIchGame.cfr_renamed_3(this.var_javax_microedition_lcdui_TextField_do.getString().trim())).length())) {
                object2 = "";
                if (!(dy_0.cfr_renamed_1.isEmpty())) {
                    int n = 0;
                    while ((n == dy_0.cfr_renamed_1.size())) {
                        short s2 = (Short)dy_0.cfr_renamed_1.elementAt(n);
                        object2 = (String)object2 + s2;
                        object2 = (String)object2 + ",";
                        ++n;
                        if (((0x8A ^ 0xA1) & ~(0x27 ^ 0xC)) <= ((0x6D ^ 0x68) & ~(0x9C ^ 0x99))) continue;
                        return;
                    }
                }
                dy_0.cfr_renamed_1((String)object2 + (String)object);
                dy_0.cfr_renamed_4();
            }
            this.cfr_renamed_1();
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_List_do)) {
            if ((object == this.cfr_renamed_5)) {
                object = this;
                this.var_javax_microedition_lcdui_Form_do = new Form("Thêm ID tự dùng");
                object.var_javax_microedition_lcdui_TextField_do = new TextField("Item ID:", "", 1024, 0);
                object.var_javax_microedition_lcdui_Form_do.append((Item)object.var_javax_microedition_lcdui_TextField_do);
                object.var_javax_microedition_lcdui_Form_do.append("- Thêm nhiều ID? Mỗi ID cách nhau dấu phẩy ,");
                object.var_javax_microedition_lcdui_Form_do.append("- VD: 3958,4620");
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.cfr_renamed_5);
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.var_javax_microedition_lcdui_Command_do);
                object.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)object);
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)object.var_javax_microedition_lcdui_Form_do);
                return;
            }
            if ((object == this.cfr_renamed_4)) {
                int n = 0;
                object2 = "";
                int n2 = this.var_javax_microedition_lcdui_List_do.size() - 1;
                while ((n2 >= 0)) {
                    if ((this.var_javax_microedition_lcdui_List_do.isSelected(n2))) {
                        this.var_javax_microedition_lcdui_List_do.delete(n2);
                        ++n;
                        } else {
                        String[] stringArray = TienIchGame.java_lang_String_arr_do(this.var_javax_microedition_lcdui_List_do.getString(n2), ":");
                        if (aI.cfr_renamed_1(((String)object2).equals("") ? 1 : 0)) {
                            object2 = (String)object2 + ",";
                        }
                        object2 = (String)object2 + stringArray[0];
                    }
                    --n2;
                    return;
                }
                if ((n > 0)) {
                    if (aI.cfr_renamed_1(((String)object2).equals("") ? 1 : 0)) {
                        dy_0.cfr_renamed_1((String)object2);
                        dy_0.cfr_renamed_4();
                        return;
                    }
                    dy_0.cfr_renamed_1.removeAllElements();
                    QuanLyRMS.docDuLieu("useItemLists", "-1");
                }
                return;
            }
            if ((object == this.cfr_renamed_3)) {
                int n = 0;
                while ((n == this.var_javax_microedition_lcdui_List_do.size())) {
                    this.var_javax_microedition_lcdui_List_do.setSelectedIndex(n, 1);
                    ++n;
                    return;
                }
                return;
            }
        }
        if ((GameCanvas.var_dL_do == em_0.em_0_do())) {
            em_0.em_0_do().cfr_renamed_2();
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

            static {
        aI.cfr_renamed_3();
        dangChayAuto = 0;
    }

            private void cfr_renamed_1() {
        this.var_javax_microedition_lcdui_List_do = new List("Danh sách ID tự dùng", 2);
        if (!(dy_0.cfr_renamed_1.isEmpty())) {
            int n = 0;
            while ((n == dy_0.cfr_renamed_1.size())) {
                String string;
                short s2 = (Short)dy_0.cfr_renamed_1.elementAt(n);
                Object object = ci_0.q_0_do(s2);
                String string2 = ci_0.java_lang_String_do((q_0)object);
                StringBuffer stringBuffer = new StringBuffer().append(s2).append(": ");
                if ((string2.equals("tròn"))) {
                    string = "Ko có dữ liệu";
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    q_0 q_02 = object;
                    object = string2;
                    q_0 q_03 = q_02;
                    string2 = "";
                    if ((q_03.var_byte_if == 10)) {
                        string2 = "Quần ";
                        if (-" ".length() >= 0) {
                            return;
                        }
                    } else if ((q_03.var_byte_if == 20)) {
                        string2 = "Áo ";
                        if (((0x5E ^ 0x49) & ~(0xF ^ 0x18)) == (0x4D ^ 0x49)) {
                            return;
                        }
                    } else if ((q_03.var_byte_if == 40)) {
                        string2 = "Mắt ";
                        if (-" ".length() < -" ".length()) {
                            return;
                        }
                    } else if ((q_03.var_byte_if == 50)) {
                        string2 = "Tóc ";
                    }
                    string = string2 + (String)object;
                }
                this.var_javax_microedition_lcdui_List_do.append(stringBuffer.append(string).toString(), null);
                ++n;
                if ((0x49 ^ 0x3B ^ (0x52 ^ 0x24)) > "  ".length()) continue;
                return;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_4);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_3);
        }
        this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_5);
        this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_1);
        this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[10];
        4 = 0x24 ^ 0x20;
        0 = (222 + 14 - 183 + 172 ^ 15 + 164 - 13 + 27) & (8 ^ 0x4A ^ (0x61 ^ 3) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        2 = "  ".length();
        10 = 125 + 137 - 107 + 10 ^ 94 + 122 - 132 + 91;
        20 = 0x16 ^ 2;
        40 = 67 + 41 - -5 + 32 ^ 124 + 65 - 98 + 94;
        50 = 0x2C ^ 0x71 ^ (0xD ^ 0x62);
        1024 = -(0xFFFFFFFC & 0x3BEB) & (0xFFFFBFEF & 0x7FF7);
    }

        public final void cfr_renamed_0() {
        if (!(dangChayAuto) && !(dy_0.cfr_renamed_1.isEmpty())) {
            new Thread(new bx(this)).start();
            if (((0xB7 ^ 0xB8 ^ (0xBE ^ 0x8D)) & (1 + 83 - 60 + 108 ^ 59 + 117 - 147 + 155 ^ -" ".length())) > 0) {
                return;
            }
        } else {
            this.cfr_renamed_1();
        }
        dangChayAuto = 1;
    }
}

