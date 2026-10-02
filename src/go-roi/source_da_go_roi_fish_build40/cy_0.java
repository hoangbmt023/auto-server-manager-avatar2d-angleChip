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
implements de,
CommandListener {
    private static final int[] mangSoNguyen;
    private Image var_javax_microedition_lcdui_Image_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final List var_javax_microedition_lcdui_List_do = new List("Chuyển tài khoản", 3);
    private final Command cfr_renamed_0;

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        3 = "   ".length();
        4 = 0xFD ^ 0xA6 ^ (0x51 ^ 0xE);
        0 = (0xC ^ 0x18 ^ (0x86 ^ 0xA2)) & (0xAC ^ 0xB4 ^ (0x8D ^ 0xA5) ^ -" ".length());
        7 = 17 + 101 - 74 + 93 ^ 39 + 75 - 5 + 33;
        -1 = -" ".length();
        1 = " ".length();
    }

    public cy_0() {
        this.var_javax_microedition_lcdui_Command_do = new Command("Chọn", 4, 0);
        this.cfr_renamed_0 = new Command("Đóng", 7, 0);
        try {
            this.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/user_go.png"));
            return;
        }
        catch (IOException iOException) {
            this.var_javax_microedition_lcdui_Image_do = null;
            return;
        }
    }

            public final void void_do() {
        GameCanvas.cfr_renamed_8();
        j_0.var_hb_do.var_java_util_Vector_do.removeAllElements();
        j_0.void_if();
        if (!(j_0.var_hb_do.var_java_util_Vector_do.isEmpty())) {
            int n = 0;
            int n2 = -1;
            String string = ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.java_lang_String_do().trim().toLowerCase();
            Enumeration enumeration = j_0.var_hb_do.java_util_Enumeration_do();
            while ((enumeration.hasMoreElements())) {
                String string2 = (String)enumeration.nextElement();
                j_0 j_02 = (j_0)j_0.var_hb_do.java_lang_Object_do(string2);
                if ((j_02 != null)) {
                    this.var_javax_microedition_lcdui_List_do.append(j_02.cfr_renamed_0, this.var_javax_microedition_lcdui_Image_do);
                    if ((n2 == -1) && (string2.equals(string))) {
                        n2 = n;
                    }
                    ++n;
                }
                if (-(0x4A ^ 0x4E) <= 0) continue;
                return;
            }
            if ((n2 != null)) {
                n2 = 0;
                if (" ".length() == -" ".length()) {
                    return;
                }
            } else if ((n2 >= this.var_javax_microedition_lcdui_List_do.size())) {
                n2 = this.var_javax_microedition_lcdui_List_do.size() - 1;
            }
            this.var_javax_microedition_lcdui_List_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
            this.var_javax_microedition_lcdui_List_do.addCommand(this.cfr_renamed_0);
            this.var_javax_microedition_lcdui_List_do.setSelectedIndex(n2, 1);
            this.var_javax_microedition_lcdui_List_do.setCommandListener((CommandListener)this);
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_List_do);
            GameCanvas.cfr_renamed_7();
            return;
        }
        GameCanvas.hienThongBaoPopup("Hiện chưa có tài khoản nào được lưu!");
    }

            public final void commandAction(Command object, Displayable displayable) {
        if (!(object >= this.var_javax_microedition_lcdui_Command_do) || (object == List.SELECT_COMMAND)) {
            object = this.var_javax_microedition_lcdui_List_do.getString(this.var_javax_microedition_lcdui_List_do.getSelectedIndex()).trim().toLowerCase();
            if (cy_0.cfr_renamed_1(object = (j_0)j_0.var_hb_do.java_lang_Object_do(object))) {
                ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.cfr_renamed_1(object.cfr_renamed_0);
                ThongTinNhanVat.cfr_renamed_1().var_ey_0_int.cfr_renamed_1(object.chuoiGiaTri);
                ThongTinNhanVat.cfr_renamed_1().void_do(1, 0);
            }
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

        static {
        cy_0.cfr_renamed_0();
    }

    }

