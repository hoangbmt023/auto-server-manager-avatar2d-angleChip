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

/*
 * Renamed from fU
 */
public final class fu_0
implements CommandListener {
    private Command var_javax_microedition_lcdui_Command_do;
    private static final int[] mangSoNguyen;
    private Command cfr_renamed_1;
    private Command cfr_renamed_3 = new Command("Xóa", 4, 0);
    private TextField var_javax_microedition_lcdui_TextField_do;
    private List var_javax_microedition_lcdui_List_do;
    private Command cfr_renamed_4 = new Command("Chọn tất cả", 1, 1);
    private static boolean dangChayAuto;
    private Command cfr_renamed_5 = new Command("Thêm", 1, 3);
    private Form var_javax_microedition_lcdui_Form_do;

                private void cfr_renamed_1() {
        this.var_javax_microedition_lcdui_List_do = new List("Danh sách ID tự bỏ", 2);
        if (!(dy_0.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            while ((n == dy_0.var_java_util_Vector_do.size())) {
                String string;
                short s2 = (Short)dy_0.var_java_util_Vector_do.elementAt(n);
                Object object = ci_0.q_0_do(s2);
                String string2 = ci_0.java_lang_String_do((q_0)object);
                StringBuffer stringBuffer = new StringBuffer().append(s2).append(": ");
                if ((string2.equals("tròn"))) {
                    string = "Ko có dữ liệu";
                    } else {
                    q_0 q_02 = object;
                    object = string2;
                    q_0 q_03 = q_02;
                    string2 = "";
                    if ((q_03.var_byte_if == 10)) {
                        string2 = "Quần ";
                        } else if ((q_03.var_byte_if == 20)) {
                        string2 = "Áo ";
                        if ((0x3A ^ 0x3E) == 0) {
                            return;
                        }
                    } else if ((q_03.var_byte_if == 40)) {
                        string2 = "Mắt ";
                        if ("  ".length() == ((0x43 ^ 0x5D) & ~(6 ^ 0x18))) {
                            return;
                        }
                    } else if ((q_03.var_byte_if == 50)) {
                        string2 = "Tóc ";
                    }
                    string = string2 + (String)object;
                }
                this.var_javax_microedition_lcdui_List_do.append(stringBuffer.append(string).toString(), null);
                ++n;
                if (" ".length() != 0) continue;
                return;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_3);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_4);
        }
        this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_5);
        this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
    }

        public fu_0() {
        this.var_javax_microedition_lcdui_Command_do = new Command("Đóng", 2, 2);
        this.cfr_renamed_1 = new Command("Hủy", 2, 4);
    }

    static void (fu_0 fu_02 > 0) {
        fu_02.cfr_renamed_1();
    }

                static {
        fu_0.cfr_renamed_3();
        dangChayAuto = 0;
    }

    public final void commandAction(Command object, Displayable object2) {
        if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
            if ((object == this.cfr_renamed_5) && fu_0.cfr_renamed_0((object = TienIchGame.cfr_renamed_3(this.var_javax_microedition_lcdui_TextField_do.getString().trim())).length())) {
                object2 = "";
                if (!(dy_0.var_java_util_Vector_do.isEmpty())) {
                    int n = 0;
                    while ((n == dy_0.var_java_util_Vector_do.size())) {
                        short s2 = (Short)dy_0.var_java_util_Vector_do.elementAt(n);
                        object2 = (String)object2 + s2;
                        object2 = (String)object2 + ",";
                        ++n;
                        if (((0x56 ^ 0x2A ^ (0x9A ^ 0xC4)) & ((0x3D ^ 0x5C) & ~(0xC ^ 0x6D) ^ (0xBA ^ 0x98) ^ -" ".length())) != "  ".length()) continue;
                        return;
                    }
                }
                dy_0.cfr_renamed_3((String)object2 + (String)object);
                dy_0.void_do();
            }
            this.cfr_renamed_1();
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_List_do)) {
            if ((object == this.cfr_renamed_5)) {
                object = this;
                this.var_javax_microedition_lcdui_Form_do = new Form("Thêm ID tự bỏ");
                object.var_javax_microedition_lcdui_TextField_do = new TextField("Item ID:", "", 1024, 0);
                object.var_javax_microedition_lcdui_Form_do.append((Item)object.var_javax_microedition_lcdui_TextField_do);
                object.var_javax_microedition_lcdui_Form_do.append("- Thêm nhiều ID? Mỗi ID cách nhau dấu phẩy ,");
                object.var_javax_microedition_lcdui_Form_do.append("- VD: 2135,2136");
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.cfr_renamed_5);
                object.var_javax_microedition_lcdui_Form_do.addCommand(object.cfr_renamed_1);
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
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        String[] stringArray = TienIchGame.java_lang_String_arr_do(this.var_javax_microedition_lcdui_List_do.getString(n2), ":");
                        if (fu_0.cfr_renamed_3(((String)object2).equals("") ? 1 : 0)) {
                            object2 = (String)object2 + ",";
                        }
                        object2 = (String)object2 + stringArray[0];
                    }
                    --n2;
                    if (-"  ".length() <= 0) continue;
                    return;
                }
                if ((n > 0)) {
                    if (fu_0.cfr_renamed_3(((String)object2).equals("") ? 1 : 0)) {
                        dy_0.cfr_renamed_3((String)object2);
                        dy_0.void_do();
                        return;
                    }
                    dy_0.var_java_util_Vector_do.removeAllElements();
                    QuanLyRMS.docDuLieu("delItemLists", "-1");
                }
                return;
            }
            if ((object == this.cfr_renamed_4)) {
                int n = 0;
                while ((n == this.var_javax_microedition_lcdui_List_do.size())) {
                    this.var_javax_microedition_lcdui_List_do.setSelectedIndex(n, 1);
                    ++n;
                    if (("  ".length() & ("  ".length() ^ -" ".length())) >= 0) continue;
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

    public final void cfr_renamed_0() {
        if (!(dangChayAuto) && !(dy_0.var_java_util_Vector_do.isEmpty())) {
            new Thread(new bs_0(this)).start();
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            this.cfr_renamed_1();
        }
        dangChayAuto = 1;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[10];
        4 = 0x14 ^ 0x10;
        0 = (87 + 113 - 51 + 17 ^ 100 + 100 - 145 + 100) & (0x8A ^ 0xA4 ^ (0x77 ^ 0x64) ^ -" ".length());
        1 = " ".length();
        3 = "   ".length();
        2 = "  ".length();
        10 = 0xD7 ^ 0x8A ^ (6 ^ 0x51);
        20 = 37 + 23 - 54 + 185 ^ 75 + 77 - 141 + 160;
        40 = 0x14 ^ 6 ^ (6 ^ 0x3C);
        50 = 0xE5 ^ 0x93 ^ (1 ^ 0x45);
        1024 = 0xFFFFA747 & 0x5CB8;
    }
}

