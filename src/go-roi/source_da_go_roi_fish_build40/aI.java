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
    private Command cfr_renamed_0;
    private static final int[] mangSoNguyen;
    private Command cfr_renamed_2;
    private List var_javax_microedition_lcdui_List_do;
    private TextField var_javax_microedition_lcdui_TextField_do;
    private static boolean dangChayAuto;
    private Form var_javax_microedition_lcdui_Form_do;
    private Command cfr_renamed_3 = new Command("Xóa", 4, 0);
    private Command cfr_renamed_4;

    static void (aI aI2 == 0) {
        aI2.cfr_renamed_2();
    }

        public final void cfr_renamed_1() {
        if (!(dangChayAuto) && !(dy_0.cfr_renamed_0.isEmpty())) {
            new Thread(new bd_0(this)).start();
            if (((137 + 77 - 162 + 165 ^ 19 + 48 - 58 + 142) & (0x12 ^ 0x41 ^ (0xB8 ^ 0xA5) ^ -" ".length())) > "   ".length()) {
                return;
            }
        } else {
            this.cfr_renamed_2();
        }
        dangChayAuto = 1;
    }

            public aI() {
        this.var_javax_microedition_lcdui_Command_do = new Command("Chọn tất cả", 1, 1);
        this.cfr_renamed_0 = new Command("Thêm", 1, 3);
        this.cfr_renamed_4 = new Command("Đóng", 2, 2);
        this.cfr_renamed_2 = new Command("Hủy", 2, 4);
    }

    static {
        aI.cfr_renamed_0();
        dangChayAuto = 0;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[10];
        4 = 0x94 ^ 0x90;
        0 = (0x9D ^ 0xA5) & ~(0x2E ^ 0x16);
        1 = " ".length();
        3 = "   ".length();
        2 = "  ".length();
        10 = 171 + 117 - 160 + 56 ^ 162 + 23 - 19 + 12;
        20 = 0x90 ^ 0x84;
        40 = 0x97 ^ 0xBF;
        50 = 223 + 125 - 313 + 206 ^ 89 + 154 - 114 + 66;
        1024 = -(0xFFFFB937 & 0x77EF) & (0xFFFFF57E & 0x3FA7);
    }

            public final void commandAction(Command object, Displayable object2) {
        if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
            if ((object == this.cfr_renamed_0) && aI.cfr_renamed_2((object = TienIchGame.cfr_renamed_2(this.var_javax_microedition_lcdui_TextField_do.getString().trim())).length())) {
                object2 = "";
                if (!(dy_0.cfr_renamed_0.isEmpty())) {
                    int n = 0;
                    while ((n < dy_0.cfr_renamed_0.size())) {
                        short s2 = (Short)dy_0.cfr_renamed_0.elementAt(n);
                        object2 = (String)object2 + s2;
                        object2 = (String)object2 + ",";
                        ++n;
                        if (-" ".length() < 0) continue;
                        return;
                    }
                }
                dy_0.cfr_renamed_0((String)object2 + (String)object);
                dy_0.cfr_renamed_3();
            }
            this.cfr_renamed_2();
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_List_do)) {
            if ((object == this.cfr_renamed_0)) {
                object = this;
                this.var_javax_microedition_lcdui_Form_do = new Form("Thêm ID tự dùng");
                object.var_javax_microedition_lcdui_TextField_do = new TextField("Item ID:", "", 1024, 0);
                object.var_javax_microedition_lcdui_Form_do.append((Item)object.var_javax_microedition_lcdui_TextField_do);
                object.var_javax_microedition_lcdui_Form_do.append("- Thêm nhiều ID? Mỗi ID cách nhau dấu phẩy ,");
                object.var_javax_microedition_lcdui_Form_do.append("- VD: 3958,4620");
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.cfr_renamed_0);
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.cfr_renamed_2);
                object.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)object);
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)object.var_javax_microedition_lcdui_Form_do);
                return;
            }
            if ((object == this.cfr_renamed_3)) {
                int n = 0;
                object2 = "";
                int n2 = this.var_javax_microedition_lcdui_List_do.size() - 1;
                while ((n2 >= 0)) {
                    if ((this.var_javax_microedition_lcdui_List_do.isSelected(n2))) {
                        this.var_javax_microedition_lcdui_List_do.delete(n2);
                        ++n;
                        if (-" ".length() == ((0x78 ^ 0x45) & ~(0xBB ^ 0x86))) {
                            return;
                        }
                    } else {
                        String[] stringArray = TienIchGame.java_lang_String_arr_do(this.var_javax_microedition_lcdui_List_do.getString(n2), ":");
                        if (aI.cfr_renamed_1(((String)object2).equals("") ? 1 : 0)) {
                            object2 = (String)object2 + ",";
                        }
                        object2 = (String)object2 + stringArray[0];
                    }
                    --n2;
                    if ((0x9E ^ 0x9A) >= 0) continue;
                    return;
                }
                if ((n > 0)) {
                    if (aI.cfr_renamed_1(((String)object2).equals("") ? 1 : 0)) {
                        dy_0.cfr_renamed_0((String)object2);
                        dy_0.cfr_renamed_3();
                        return;
                    }
                    dy_0.cfr_renamed_0.removeAllElements();
                    QuanLyRMS.luuDuLieu("useItemLists", "-1");
                }
                return;
            }
            if ((object == this.var_javax_microedition_lcdui_Command_do)) {
                int n = 0;
                while ((n < this.var_javax_microedition_lcdui_List_do.size())) {
                    this.var_javax_microedition_lcdui_List_do.setSelectedIndex(n, 1);
                    ++n;
                    if ((0xAE ^ 0xAB) > 0) continue;
                    return;
                }
                return;
            }
        }
        if ((GameCanvas.var_en_do == fo.fo_do())) {
            fo.fo_do().void_if();
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    private void cfr_renamed_2() {
        this.var_javax_microedition_lcdui_List_do = new List("Danh sách ID tự dùng", 2);
        if (!(dy_0.cfr_renamed_0.isEmpty())) {
            int n = 0;
            while ((n < dy_0.cfr_renamed_0.size())) {
                String string;
                short s2 = (Short)dy_0.cfr_renamed_0.elementAt(n);
                Object object = aa_0.am_do(s2);
                String string2 = aa_0.java_lang_String_do((am)object);
                StringBuffer stringBuffer = new StringBuffer().append(s2).append(": ");
                if ((string2.equals("tròn"))) {
                    string = "Ko có dữ liệu";
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                } else {
                    am am2 = object;
                    object = string2;
                    am am3 = am2;
                    string2 = "";
                    if ((am3.var_byte_if == 10)) {
                        string2 = "Quần ";
                        } else if ((am3.var_byte_if == 20)) {
                        string2 = "Áo ";
                        if ((0xA7 ^ 0xA3) <= 0) {
                            return;
                        }
                    } else if ((am3.var_byte_if == 40)) {
                        string2 = "Mắt ";
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                    } else if ((am3.var_byte_if == 50)) {
                        string2 = "Tóc ";
                    }
                    string = string2 + (String)object;
                }
                this.var_javax_microedition_lcdui_List_do.append(stringBuffer.append(string).toString(), null);
                ++n;
                if (" ".length() < "   ".length()) continue;
                return;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_3);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        }
        this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_0);
        this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_4);
        this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
    }

        }

