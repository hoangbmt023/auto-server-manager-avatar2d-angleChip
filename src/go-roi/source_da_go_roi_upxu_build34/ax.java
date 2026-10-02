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

public final class ax
implements cp,
CommandListener,
ItemStateListener {
    private final Command var_javax_microedition_lcdui_Command_do;
    private final Command var_javax_microedition_lcdui_Command_if;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final TextField var_javax_microedition_lcdui_TextField_do = new TextField("Tài khoản:", null, 32, 0);
    private List var_javax_microedition_lcdui_List_do;
    private final Command cfr_renamed_3;
    private String chuoiGiaTri;
    private static boolean dangChayAuto;
    private az[] var_az_arr_do;
    private final Command cfr_renamed_4;
    private int soLuong;
    private final Command cfr_renamed_5;
    private final Command cfr_renamed_2;
    private final Command cfr_renamed_15;
    private final Command cfr_renamed_8;
    private Form var_javax_microedition_lcdui_Form_do;
    private final TextField var_javax_microedition_lcdui_TextField_if = new TextField("Mật khẩu:", null, 32, 65536);
    private static final int[] mangSoNguyen;

    private static void (Displayable displayable != null) {
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent(displayable);
    }

    static az[] az_arr_do(ax ax2) {
        return ax2.var_az_arr_do;
    }

    static Command javax_microedition_lcdui_Command_do(ax ax2) {
        return ax2.var_javax_microedition_lcdui_Command_if;
    }

        static int int_do(ax ax2) {
        return ax2.soLuong;
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

    public ax() {
        String[] stringArray = new String[1];
        stringArray[0] = "Hiện mật khẩu";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("", 2, stringArray, null);
        this.cfr_renamed_4 = new Command("Đăng nhập", 4, 1);
        this.cfr_renamed_5 = new Command("Thoát", 2, 2);
        this.var_javax_microedition_lcdui_Command_do = new Command("Xóa", 1, 2);
        this.cfr_renamed_3 = new Command("Sửa", 1, 2);
        this.cfr_renamed_15 = new Command("Thêm", 1, 2);
        this.cfr_renamed_8 = new Command("Lưu", 4, 1);
        this.cfr_renamed_2 = new Command("Hủy", 3, 2);
        this.var_javax_microedition_lcdui_Command_if = new Command("Đồng ý", 4, 1);
        ax ax2 = this;
        this.var_javax_microedition_lcdui_Form_do = new Form("");
        ax2.var_javax_microedition_lcdui_Form_do.append((Item)ax2.var_javax_microedition_lcdui_TextField_do);
        ax2.var_javax_microedition_lcdui_Form_do.append((Item)ax2.var_javax_microedition_lcdui_TextField_if);
        ax2.var_javax_microedition_lcdui_Form_do.append((Item)ax2.var_javax_microedition_lcdui_ChoiceGroup_do);
        ax2.var_javax_microedition_lcdui_Form_do.addCommand(ax2.cfr_renamed_8);
        ax2.var_javax_microedition_lcdui_Form_do.addCommand(ax2.cfr_renamed_2);
        if ((dangChayAuto)) {
            ax2.var_javax_microedition_lcdui_TextField_if.setConstraints(0);
            ax2.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, 1);
        }
        ax2.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)ax2);
        ax2.var_javax_microedition_lcdui_Form_do.setItemStateListener((ItemStateListener)ax2);
        this.soLuong = -1;
        this.chuoiGiaTri = "";
    }

    public final void void_do() {
        GameCanvas.cfr_renamed_5();
        az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
        az.void_for();
        if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
            this.var_javax_microedition_lcdui_List_do = new List("Quản lý tài khoản", 3);
            this.var_az_arr_do = new az[az.var_fs_0_do.var_java_util_Vector_do.size()];
            int n = 0;
            Enumeration enumeration = az.var_fs_0_do.java_util_Enumeration_do();
            while ((enumeration.hasMoreElements())) {
                String string = (String)enumeration.nextElement();
                this.var_az_arr_do[n] = (az)az.var_fs_0_do.java_lang_Object_do(string);
                this.var_javax_microedition_lcdui_List_do.append(n + 1 + ". " + this.var_az_arr_do[n].cfr_renamed_1, null);
                if (!(this.chuoiGiaTri.equals(""))) {
                    if ((this.chuoiGiaTri.equals(this.var_az_arr_do[n].cfr_renamed_1))) {
                        this.soLuong = n;
                        this.chuoiGiaTri = "";
                        if (-" ".length() >= (0x7E ^ 0xC ^ (0xCD ^ 0xBB))) {
                            return;
                        }
                    }
                } else if ((this.soLuong == -1) && ax.cfr_renamed_4(string.equals(ThongTinNhanVat.cfr_renamed_0().var_gx_int.java_lang_String_do().trim().toLowerCase()) ? 1 : 0)) {
                    this.soLuong = n;
                }
                ++n;
                return;
            }
            this.chuoiGiaTri = "";
            if ((this.soLuong != null)) {
                this.soLuong = 0;
                if (-(0x4B ^ 0x4E) >= 0) {
                    return;
                }
            } else if ((this.soLuong >= this.var_javax_microedition_lcdui_List_do.size())) {
                this.soLuong = this.var_javax_microedition_lcdui_List_do.size() - 1;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_4);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_3);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_15);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_5);
            this.var_javax_microedition_lcdui_List_do.setSelectedIndex(this.soLuong, 1);
            this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
            ax.cfr_renamed_0((Displayable)this.var_javax_microedition_lcdui_List_do);
            if ((0x18 ^ 0x1C) == " ".length()) {
                return;
            }
        } else {
            Form form = new Form("Thêm tài khoản");
            form.append("Danh sách trống!");
            form.addCommand(this.cfr_renamed_5);
            form.addCommand(this.cfr_renamed_15);
            form.setCommandListener((CommandListener)this);
            ax.cfr_renamed_0((Displayable)form);
        }
        GameCanvas.cfr_renamed_8();
    }

            static {
        ax.cfr_renamed_1();
        dangChayAuto = 0;
    }

    static int (ax ax2 >= int n) {
        ax2.soLuong = n;
        return ax2.soLuong;
    }

                    public final void commandAction(Command object, Displayable object2) {
        if ((object == this.cfr_renamed_5)) {
            ax.cfr_renamed_0((Displayable)AngelChip.gameCanvas);
            return;
        }
        if ((object == this.cfr_renamed_15)) {
            this.soLuong = -1;
            this.var_javax_microedition_lcdui_Form_do.setTitle("Thêm tài khoản");
            this.var_javax_microedition_lcdui_TextField_do.setString("");
            this.var_javax_microedition_lcdui_TextField_if.setString("");
            ax.cfr_renamed_0((Displayable)this.var_javax_microedition_lcdui_Form_do);
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_List_do)) {
            this.soLuong = this.var_javax_microedition_lcdui_List_do.getSelectedIndex();
            if (!(object >= this.cfr_renamed_4) || (object == List.SELECT_COMMAND)) {
                ThongTinNhanVat.cfr_renamed_0().var_gx_int.cfr_renamed_0(this.var_az_arr_do[this.soLuong].cfr_renamed_1);
                ThongTinNhanVat.cfr_renamed_0().var_gx_if.cfr_renamed_0(this.var_az_arr_do[this.soLuong].chuoiGiaTri);
                ThongTinNhanVat.cfr_renamed_0().void_do(1, 0);
                ax.cfr_renamed_0((Displayable)AngelChip.gameCanvas);
                return;
            }
            if ((object == this.var_javax_microedition_lcdui_Command_do)) {
                String string = "Xóa acc này khỏi danh sách đã lưu, dữ liệu up thuê của acc này bao gồm ngày up, xu up được,... cũng bị xóa theo! Bạn có chắc muốn xóa tài khoản này?";
                object2 = "Cảnh báo";
                object = this;
                object2 = new Alert((String)object2, string, null, AlertType.WARNING);
                object2.addCommand(((ax)object).var_javax_microedition_lcdui_Command_if);
                object2.addCommand(new Command("Không", 1, 2));
                object2.setCommandListener((CommandListener)new bv_0((ax)object));
                ax.cfr_renamed_0((Displayable)object2);
                return;
            }
            if ((object == this.cfr_renamed_3)) {
                this.var_javax_microedition_lcdui_Form_do.setTitle("Sửa tài khoản");
                this.var_javax_microedition_lcdui_TextField_do.setString(this.var_az_arr_do[this.soLuong].cfr_renamed_1);
                this.var_javax_microedition_lcdui_TextField_if.setString(this.var_az_arr_do[this.soLuong].chuoiGiaTri);
                ax.cfr_renamed_0((Displayable)this.var_javax_microedition_lcdui_Form_do);
                return;
            }
            return;
        }
        if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
            if ((object == this.cfr_renamed_8)) {
                object = this.var_javax_microedition_lcdui_TextField_do.getString().trim();
                object2 = this.var_javax_microedition_lcdui_TextField_if.getString().trim();
                if (!ax.cfr_renamed_1(((String)object).equals("") ? 1 : 0) || ax.cfr_renamed_4(((String)object2).equals("") ? 1 : 0)) {
                    ax.cfr_renamed_0((Displayable)new Alert("Lỗi", "Bạn chưa nhập tài khoản hoặc mật khẩu!", null, AlertType.WARNING));
                    return;
                }
                this.chuoiGiaTri = object;
                String string = ((String)object).toLowerCase();
                if ((this.soLuong >= 0) && (this.soLuong < this.var_az_arr_do.length)) {
                    String string2 = this.var_az_arr_do[this.soLuong].cfr_renamed_1.toLowerCase();
                    if (!(string2.equals(string))) {
                        if ((az.var_fs_0_do.boolean_do(string))) {
                            az.var_fs_0_do.cfr_renamed_0(string, string, new az((String)object, (String)object2));
                            az.var_fs_0_do.void_do(string2);
                            } else {
                            az.var_fs_0_do.cfr_renamed_0(string2, string, new az((String)object, (String)object2));
                        }
                        QuanLyRMS.void_do("_" + string2 + "Coin");
                        QuanLyRMS.void_do("_" + string2 + "Data");
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        az.var_fs_0_do.cfr_renamed_0(string2, string, new az((String)object, (String)object2));
                        if (" ".length() <= ((0x96 ^ 0x9A) & ~(4 ^ 8))) {
                            return;
                        }
                    }
                } else if (!(az.var_fs_0_do.boolean_do(string))) {
                    az.var_fs_0_do.cfr_renamed_0(string, new az((String)object, (String)object2));
                    if (-"  ".length() >= 0) {
                        return;
                    }
                } else {
                    az az2 = (az)az.var_fs_0_do.java_lang_Object_do(string);
                    if ((az2 != null) && (az2.chuoiGiaTri.equals(object2))) {
                        ax.cfr_renamed_0((Displayable)new Alert("Lỗi", "Tài khoản \"" + (String)object + "\" đã tồn tại!", null, AlertType.ERROR));
                        return;
                    }
                    az.var_fs_0_do.cfr_renamed_0(string, string, new az((String)object, (String)object2));
                }
                az.az_do();
                az.void_if();
                this.void_do();
                return;
            }
            if ((object == this.cfr_renamed_2)) {
                this.void_do();
                return;
            }
            return;
        }
        ax.cfr_renamed_0((Displayable)AngelChip.gameCanvas);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[8];
        32 = 0x10 ^ 0x73 ^ (0x5D ^ 0x1E);
        0 = (0x92 ^ 0x97) & ~(0x7D ^ 0x78);
        65536 = -(0xFFFFFE9D & 0x37FB) & (0xFFFFFFF8 & 0x1369F);
        2 = "  ".length();
        1 = " ".length();
        4 = "  ".length() ^ (0x68 ^ 0x6E);
        3 = "   ".length();
        -1 = -" ".length();
    }

        }

