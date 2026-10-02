/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.List
 *  javax.microedition.midlet.MIDlet
 */
import java.io.IOException;
import java.util.Enumeration;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from cy
 */
public final class cy_0
implements cp,
CommandListener {
    private Image var_javax_microedition_lcdui_Image_do;
    private static final int[] mangSoNguyen;
    private final List var_javax_microedition_lcdui_List_do = new List("Chuyển tài khoản", 3);
    private final Command var_javax_microedition_lcdui_Command_do;
    private final Command cfr_renamed_1 = new Command("Chọn", 4, 0);

            public final void commandAction(Command object, Displayable displayable) {
        if (!(object == this.cfr_renamed_1) || (object >= List.SELECT_COMMAND)) {
            object = this.var_javax_microedition_lcdui_List_do.getString(this.var_javax_microedition_lcdui_List_do.getSelectedIndex()).trim().toLowerCase();
            if (cy_0.cfr_renamed_0(object = (az)az.var_fs_0_do.java_lang_Object_do(object))) {
                ThongTinNhanVat.cfr_renamed_0().var_gx_int.cfr_renamed_0(object.cfr_renamed_1);
                ThongTinNhanVat.cfr_renamed_0().var_gx_if.cfr_renamed_0(object.chuoiGiaTri);
                ThongTinNhanVat.cfr_renamed_0().void_do(1, 0);
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

        public final void void_do() {
        GameCanvas.cfr_renamed_5();
        az.var_fs_0_do.var_java_util_Vector_do.removeAllElements();
        az.void_for();
        if (!(az.var_fs_0_do.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            int n2 = -1;
            String string = ThongTinNhanVat.cfr_renamed_0().var_gx_int.java_lang_String_do().trim().toLowerCase();
            Enumeration enumeration = az.var_fs_0_do.java_util_Enumeration_do();
            while ((enumeration.hasMoreElements() ? 1 : 0 != null)) {
                String string2 = (String)enumeration.nextElement();
                az az2 = (az)az.var_fs_0_do.java_lang_Object_do(string2);
                if ((az2 != null)) {
                    this.var_javax_microedition_lcdui_List_do.append(az2.cfr_renamed_1, this.var_javax_microedition_lcdui_Image_do);
                    if ((n2 == -1) && (string2.equals(string) ? 1 : 0 != null)) {
                        n2 = n;
                    }
                    ++n;
                }
                if ((122 + 78 - 194 + 161 ^ 149 + 55 - 100 + 58) > 0) continue;
                return;
            }
            if ((n2 < 0)) {
                n2 = 0;
                if ("   ".length() < "  ".length()) {
                    return;
                }
            } else if ((n2 >= this.var_javax_microedition_lcdui_List_do.size())) {
                n2 = this.var_javax_microedition_lcdui_List_do.size() - 1;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_1);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
            this.var_javax_microedition_lcdui_List_do.setSelectedIndex(n2, 1);
            this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
            GameCanvas.cfr_renamed_8();
            return;
        }
        GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu!");
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[6];
        3 = "   ".length();
        4 = 0x2A ^ 0x2E;
        0 = (0xF4 ^ 0xA3 ^ (0x32 ^ 0x2E)) & (131 + 85 - 45 + 35 ^ 114 + 44 - 55 + 30 ^ -" ".length());
        7 = 0xEB ^ 0xB4 ^ (0xC2 ^ 0x9A);
        -1 = -" ".length();
        1 = " ".length();
    }

            static {
        cy_0.cfr_renamed_1();
    }

        public cy_0() {
        this.var_javax_microedition_lcdui_Command_do = new Command("Đóng", 7, 0);
        try {
            this.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/user_go.png"));
            return;
        }
        catch (IOException iOException) {
            this.var_javax_microedition_lcdui_Image_do = null;
            return;
        }
    }

        }

