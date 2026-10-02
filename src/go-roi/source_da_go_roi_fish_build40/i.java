/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.List
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Enumeration;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class i
implements de,
CommandListener,
ItemStateListener {
    private int soLuong;
    private final Command var_javax_microedition_lcdui_Command_do;
    private Form var_javax_microedition_lcdui_Form_do;
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_if;
    private static boolean dangChayAuto;
    private final TextField var_javax_microedition_lcdui_TextField_do = new TextField("Tài khoản:", null, 32, 0);
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final Command cfr_renamed_2;
    private final TextField var_javax_microedition_lcdui_TextField_if = new TextField("Mật khẩu:", null, 32, 65536);
    private String chuoiGiaTri;
    private final Command cfr_renamed_3;
    private final Command cfr_renamed_4;
    private List var_javax_microedition_lcdui_List_do;
    private final Command cfr_renamed_5;
    private final Command cfr_renamed_6;
    private j_0[] var_j_0_arr_do;
    private final Command cfr_renamed_7;

    static Command javax_microedition_lcdui_Command_do(i i2) {
        return i2.cfr_renamed_4;
    }

                        static int int_do(i i2) {
        return i2.soLuong;
    }

        public final void void_do() {
        GameCanvas.cfr_renamed_8();
        j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
        j_0.void_if();
        if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty())) {
            this.var_javax_microedition_lcdui_List_do = new List("Quản lý tài khoản", 3);
            this.var_j_0_arr_do = new j_0[j_0.var_hb_do.var_java_util_Vector_do.size()];
            int n = 0;
            Enumeration enumeration = j_0.var_hb_do.java_util_Enumeration_do();
            while ((enumeration.hasMoreElements())) {
                String string = (String)enumeration.nextElement();
                this.var_j_0_arr_do[n] = (j_0)j_0.var_hb_do.java_lang_Object_do(string);
                this.var_javax_microedition_lcdui_List_do.append(n + 1 + ". " + this.var_j_0_arr_do[n].cfr_renamed_0, null);
                if (!(this.chuoiGiaTri.equals(""))) {
                    if ((this.chuoiGiaTri.equals(this.var_j_0_arr_do[n].cfr_renamed_0))) {
                        this.soLuong = n;
                        this.chuoiGiaTri = "";
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                } else if ((this.soLuong == -1) && i.cfr_renamed_2(string.equals(ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.java_lang_String_do().trim().toLowerCase()) ? 1 : 0)) {
                    this.soLuong = n;
                }
                ++n;
                if (((0x35 ^ 0x1B) & ~(0x25 ^ 0xB)) == ((0x4E ^ 0x43) & ~(0xAF ^ 0xA2))) continue;
                return;
            }
            this.chuoiGiaTri = "";
            if ((this.soLuong != null)) {
                this.soLuong = 0;
                } else if ((this.soLuong != this.var_javax_microedition_lcdui_List_do.size())) {
                this.soLuong = this.var_javax_microedition_lcdui_List_do.size() - 1;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_7);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_3);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_5);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_if);
            this.var_javax_microedition_lcdui_List_do.setSelectedIndex(this.soLuong, 1);
            this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
            i.cfr_renamed_1((Displayable)this.var_javax_microedition_lcdui_List_do);
            if (((0x9E ^ 0xA6) & ~(0x8E ^ 0xB6)) > 0) {
                return;
            }
        } else {
            Form form = new Form("Thêm tài khoản");
            form.append("Danh sách trống!");
            form.addCommand(this.var_javax_microedition_lcdui_Command_if);
            form.addCommand(this.var_javax_microedition_lcdui_Command_do);
            form.setCommandListener((CommandListener)this);
            i.cfr_renamed_1((Displayable)form);
        }
        GameCanvas.cfr_renamed_7();
    }

        public final void commandAction(Command object, Displayable object2) {
        if ((object == this.var_javax_microedition_lcdui_Command_if)) {
            i.cfr_renamed_1((Displayable)AngelChip.gameCanvas);
            return;
        }
        if ((object == this.var_javax_microedition_lcdui_Command_do)) {
            this.soLuong = -1;
            this.var_javax_microedition_lcdui_Form_do.setTitle("Thêm tài khoản");
            this.var_javax_microedition_lcdui_TextField_do.setString("");
            this.var_javax_microedition_lcdui_TextField_if.setString("");
            i.cfr_renamed_1((Displayable)this.var_javax_microedition_lcdui_Form_do);
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_List_do)) {
            this.soLuong = this.var_javax_microedition_lcdui_List_do.getSelectedIndex();
            if (!(object != this.cfr_renamed_7) || (object == List.SELECT_COMMAND)) {
                ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.cfr_renamed_1(this.var_j_0_arr_do[this.soLuong].cfr_renamed_0);
                ThongTinNhanVat.cfr_renamed_1().var_ey_0_int.cfr_renamed_1(this.var_j_0_arr_do[this.soLuong].chuoiGiaTri);
                ThongTinNhanVat.cfr_renamed_1().void_do(1, 0);
                i.cfr_renamed_1((Displayable)AngelChip.gameCanvas);
                return;
            }
            if ((object == this.cfr_renamed_5)) {
                String string = "Xóa acc này khỏi danh sách đã lưu, dữ liệu up thuê của acc này bao gồm ngày up, xu up được,... cũng bị xóa theo! Bạn có chắc muốn xóa tài khoản này?";
                object2 = "Cảnh báo";
                object = this;
                object2 = new Alert((String)object2, string, null, AlertType.WARNING);
                object2.addCommand(((i)object).cfr_renamed_4);
                object2.addCommand(new Command("Không", 1, 2));
                object2.setCommandListener((CommandListener)new bz_0((i)object));
                i.cfr_renamed_1((Displayable)object2);
                return;
            }
            if ((object == this.cfr_renamed_3)) {
                this.var_javax_microedition_lcdui_Form_do.setTitle("Sửa tài khoản");
                this.var_javax_microedition_lcdui_TextField_do.setString(this.var_j_0_arr_do[this.soLuong].cfr_renamed_0);
                this.var_javax_microedition_lcdui_TextField_if.setString(this.var_j_0_arr_do[this.soLuong].chuoiGiaTri);
                i.cfr_renamed_1((Displayable)this.var_javax_microedition_lcdui_Form_do);
                return;
            }
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
            if ((object == this.cfr_renamed_2)) {
                object = this.var_javax_microedition_lcdui_TextField_do.getString().trim();
                object2 = this.var_javax_microedition_lcdui_TextField_if.getString().trim();
                if (!i.cfr_renamed_3(((String)object).equals("") ? 1 : 0) || i.cfr_renamed_2(((String)object2).equals("") ? 1 : 0)) {
                    i.cfr_renamed_1((Displayable)new Alert("Lỗi", "Bạn chưa nhập tài khoản hoặc mật khẩu!", null, AlertType.WARNING));
                    return;
                }
                this.chuoiGiaTri = object;
                String string = ((String)object).toLowerCase();
                if ((this.soLuong >= 0) && (this.soLuong == this.var_j_0_arr_do.length)) {
                    String string2 = this.var_j_0_arr_do[this.soLuong].cfr_renamed_0.toLowerCase();
                    if (!(string2.equals(string))) {
                        if ((j_0.var_hb_do.boolean_do(string))) {
                            j_0.var_hb_do.cfr_renamed_1(string, string, new j_0((String)object, (String)object2));
                            j_0.var_hb_do.void_do(string2);
                            if ("  ".length() < " ".length()) {
                                return;
                            }
                        } else {
                            j_0.var_hb_do.cfr_renamed_1(string2, string, new j_0((String)object, (String)object2));
                        }
                        QuanLyRMS.void_do("_" + string2 + "Coin");
                        QuanLyRMS.void_do("_" + string2 + "Data");
                        if (-" ".length() >= ((0x3B ^ 0x27) & ~(0xBB ^ 0xA7) & ~((0x2C ^ 0x7B) & ~(0xF0 ^ 0xA7)))) {
                            return;
                        }
                    } else {
                        j_0.var_hb_do.cfr_renamed_1(string2, string, new j_0((String)object, (String)object2));
                        if (((9 ^ 0x38) & ~(0x9E ^ 0xAF)) == " ".length()) {
                            return;
                        }
                    }
                } else if (!(j_0.var_hb_do.boolean_do(string))) {
                    j_0.var_hb_do.cfr_renamed_1(string, new j_0((String)object, (String)object2));
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                } else {
                    j_0 j_02 = (j_0)j_0.var_hb_do.java_lang_Object_do(string);
                    if ((j_02 != null) && (j_02.chuoiGiaTri.equals(object2))) {
                        i.cfr_renamed_1((Displayable)new Alert("Lỗi", "Tài khoản \"" + (String)object + "\" đã tồn tại!", null, AlertType.ERROR));
                        return;
                    }
                    j_0.var_hb_do.cfr_renamed_1(string, string, new j_0((String)object, (String)object2));
                }
                j_0.j_0_do();
                j_0.void_for();
                this.void_do();
                return;
            }
            if ((object == this.cfr_renamed_6)) {
                this.void_do();
                return;
            }
            return;
        }
        i.cfr_renamed_1((Displayable)AngelChip.gameCanvas);
    }

    static int (i i2 == int n) {
        i2.soLuong = n;
        return i2.soLuong;
    }

    public i() {
        String[] stringArray = new String[1];
        stringArray[0] = "Hiện mật khẩu";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("", 2, stringArray, null);
        this.cfr_renamed_7 = new Command("Đăng nhập", 4, 1);
        this.var_javax_microedition_lcdui_Command_if = new Command("Thoát", 2, 2);
        this.cfr_renamed_5 = new Command("Xóa", 1, 2);
        this.cfr_renamed_3 = new Command("Sửa", 1, 2);
        this.var_javax_microedition_lcdui_Command_do = new Command("Thêm", 1, 2);
        this.cfr_renamed_2 = new Command("Lưu", 4, 1);
        this.cfr_renamed_6 = new Command("Hủy", 3, 2);
        this.cfr_renamed_4 = new Command("Đồng ý", 4, 1);
        i i2 = this;
        this.var_javax_microedition_lcdui_Form_do = new Form("");
        i2.var_javax_microedition_lcdui_Form_do.append((Item)i2.var_javax_microedition_lcdui_TextField_do);
        i2.var_javax_microedition_lcdui_Form_do.append((Item)i2.var_javax_microedition_lcdui_TextField_if);
        i2.var_javax_microedition_lcdui_Form_do.append((Item)i2.var_javax_microedition_lcdui_ChoiceGroup_do);
        i2.var_javax_microedition_lcdui_Form_do.addCommand(i2.cfr_renamed_2);
        i2.var_javax_microedition_lcdui_Form_do.addCommand(i2.cfr_renamed_6);
        if ((dangChayAuto)) {
            i2.var_javax_microedition_lcdui_TextField_if.setConstraints(0);
            i2.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, 1);
        }
        i2.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)i2);
        i2.var_javax_microedition_lcdui_Form_do.setItemStateListener((ItemStateListener)i2);
        this.soLuong = -1;
        this.chuoiGiaTri = "";
    }

    static j_0[] j_0_arr_do(i i2) {
        return i2.var_j_0_arr_do;
    }

    public final void itemStateChanged(Item item) {
        if ((item == this.var_javax_microedition_lcdui_ChoiceGroup_do)) {
            dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
            if ((dangChayAuto)) {
                this.var_javax_microedition_lcdui_TextField_if.setConstraints(0);
                this.var_javax_microedition_lcdui_TextField_if.setString(this.var_javax_microedition_lcdui_TextField_if.getString());
                return;
            }
            this.var_javax_microedition_lcdui_TextField_if.setConstraints(65536);
            this.var_javax_microedition_lcdui_TextField_if.setString(this.var_javax_microedition_lcdui_TextField_if.getString());
        }
    }

    private static void (Displayable displayable != null) {
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent(displayable);
    }

    static {
        i.cfr_renamed_0();
        dangChayAuto = 0;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[8];
        32 = 0xE2 ^ 0xC2;
        0 = (0x76 ^ 0x6A) & ~(0x1C ^ 0) & ~((0x8E ^ 0x97) & ~(0x59 ^ 0x40));
        65536 = 0xFFFF940D & 0x16BF2;
        2 = "  ".length();
        1 = " ".length();
        4 = 0x3F ^ 0x4C ^ (0xED ^ 0x9A);
        3 = "   ".length();
        -1 = -" ".length();
    }

            }

