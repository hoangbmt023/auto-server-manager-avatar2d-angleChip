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
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class P
implements de,
CommandListener {
    private final TextField cfr_renamed_3;
    private final Command var_javax_microedition_lcdui_Command_do;
    final TextField var_javax_microedition_lcdui_TextField_do;
    final Form var_javax_microedition_lcdui_Form_do;
    private static final int[] mangSoNguyen;
    private final Command var_javax_microedition_lcdui_Command_if;
    final TextField var_javax_microedition_lcdui_TextField_if;
    final TextField var_javax_microedition_lcdui_TextField_for;
    private final TextField cfr_renamed_4;
    private final Command var_javax_microedition_lcdui_Command_for = new Command("Hủy", 3, 2);
    final Form var_javax_microedition_lcdui_Form_if;
    private static P var_P_do;

    public static P P_do() {
        if ((var_P_do != 0)) {
            var_P_do = new P();
        }
        return var_P_do;
    }

        private static void cfr_renamed_0() {
        mangSoNguyen = new int[9];
        3 = "   ".length();
        2 = "  ".length();
        1024 = -(0xFFFFAFB9 & 0x53FF) & (0xFFFFCFFA & 0x37BD);
        0 = (0xBA ^ 0xBC) & ~(0x11 ^ 0x17);
        4 = 0x55 ^ 0x43 ^ (0x23 ^ 0x31);
        1 = " ".length();
        5 = 0x99 ^ 0x9C;
        59 = 0x1F ^ 0x24;
        44 = 118 + 29 - 84 + 122 ^ 80 + 75 - 87 + 81;
    }

            public final void void_do() {
        if ((fw_0.dangChayAuto)) {
            fw_0.dangChayAuto = 0;
            fw_0.fw_0_do();
            fw_0.cfr_renamed_0();
        }
        if ((fw_0.soLuong != 0)) {
            this.cfr_renamed_4.setString(String.valueOf(fw_0.soLuong));
            if ("   ".length() == 0) {
                return;
            }
        } else {
            this.cfr_renamed_4.setString("35");
        }
        this.cfr_renamed_3.setString(fw_0.chuoiGiaTri);
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_Form_do);
    }

    public final void commandAction(Command object, Displayable object2) {
        block22: {
            block23: {
                String string;
                if ((object2 == this.var_javax_microedition_lcdui_Form_if)) {
                    if ((object == this.var_javax_microedition_lcdui_Command_do)) {
                        object = this.var_javax_microedition_lcdui_TextField_if.getString().trim();
                        object2 = this.var_javax_microedition_lcdui_TextField_for.getString().trim();
                        String string2 = this.var_javax_microedition_lcdui_TextField_do.getString().trim();
                        String string3 = this.cfr_renamed_3.getString().trim();
                        if (P.cfr_renamed_0(((String)object).equals("") ? 1 : 0)) {
                            String string4;
                            Object object3;
                            StringBuffer stringBuffer = new StringBuffer().append((String)object).append(":");
                            if (P.cfr_renamed_0(((String)object2).equals("") ? 1 : 0)) {
                                object3 = object2;
                                if ((0xFC ^ 0xB7 ^ (0xE1 ^ 0xAE)) < ((0x34 ^ 0x6F ^ (0xA2 ^ 0x98)) & (0x53 ^ 0x41 ^ (0xCC ^ 0xBF) ^ -" ".length()))) {
                                    return;
                                }
                            } else {
                                object3 = "0";
                            }
                            StringBuffer stringBuffer2 = stringBuffer.append((String)object3).append(":");
                            if (!(string2.equals(""))) {
                                string4 = string2;
                                } else {
                                string4 = "0";
                            }
                            object = stringBuffer2.append(string4).toString();
                            if ((string3.equals(""))) {
                                this.cfr_renamed_3.setString((String)object);
                                if (-" ".length() > 0) {
                                    return;
                                }
                            } else {
                                String string5;
                                StringBuffer stringBuffer3 = new StringBuffer().append(string3);
                                if (!(string3.endsWith(","))) {
                                    string5 = ",";
                                    if ((114 + 78 - 99 + 70 ^ 58 + 32 - 64 + 141) <= 0) {
                                        return;
                                    }
                                } else {
                                    string5 = "";
                                }
                                this.cfr_renamed_3.setString(stringBuffer3.append(string5).append((String)object).toString());
                            }
                        }
                    }
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_Form_do);
                    return;
                }
                if (!(object2 == this.var_javax_microedition_lcdui_Form_do)) break block22;
                if ((object == this.var_javax_microedition_lcdui_Command_if)) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new bo_0(this));
                    return;
                }
                if (!(object == this.var_javax_microedition_lcdui_Command_do)) break block23;
                try {
                    fw_0.soLuong = Integer.parseInt(this.cfr_renamed_4.getString().trim());
                }
                catch (NumberFormatException numberFormatException) {
                    fw_0.soLuong = 0;
                }
                if (((0x6B ^ 0x3F) & ~(0x69 ^ 0x3D)) <= -" ".length()) {
                    return;
                }
                if (P.cfr_renamed_0(((String)(object = this.cfr_renamed_3.getString().trim())).equals("") ? 1 : 0)) {
                    string = ((String)object).replace(59, 44);
                    if (" ".length() == 0) {
                        return;
                    }
                } else {
                    string = "";
                }
                fw_0.chuoiGiaTri = string;
                fw_0.cfr_renamed_2();
                GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
        }
    }

    static {
        P.cfr_renamed_0();
    }

        public P() {
        this.var_javax_microedition_lcdui_Form_do = new Form("Cài đặt Auto Click");
        this.cfr_renamed_3 = new TextField("Dữ liệu AutoClick:", "", 1024, 0);
        this.cfr_renamed_4 = new TextField("Phím bật/tắt auto:", "35", 4, 0);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.var_javax_microedition_lcdui_Command_if = new Command("Lấy mã phím", 1, 1);
        this.var_javax_microedition_lcdui_Form_do.append((Item)this.cfr_renamed_3);
        this.var_javax_microedition_lcdui_Form_do.append((Item)this.cfr_renamed_4);
        this.var_javax_microedition_lcdui_Form_do.append("- Nhấn giữ phím bật/tắt auto sẽ mở cài đặt. Phím bật/tắt auto mặc định 35 là phím #");
        this.var_javax_microedition_lcdui_Form_do.append("- Nếu bạn không biết cài đặt thế nào hãy nhấn vào menu \"Lấy mã phím\" để đặt phím. Lặp lại thao tác để đặt phím tiếp theo!");
        this.var_javax_microedition_lcdui_Form_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_Form_do.addCommand(this.var_javax_microedition_lcdui_Command_if);
        this.var_javax_microedition_lcdui_Form_do.addCommand(this.var_javax_microedition_lcdui_Command_for);
        this.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)this);
        this.var_javax_microedition_lcdui_Form_if = new Form("Đặt mã phím");
        this.var_javax_microedition_lcdui_TextField_if = new TextField("Mã phím:", "", 4, 0);
        this.var_javax_microedition_lcdui_TextField_for = new TextField("Nhấn phím này sau (s):", "0", 4, 2);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Nhấn giữ trong (ms):", "0", 5, 2);
        this.var_javax_microedition_lcdui_Form_if.append((Item)this.var_javax_microedition_lcdui_TextField_if);
        this.var_javax_microedition_lcdui_Form_if.append((Item)this.var_javax_microedition_lcdui_TextField_for);
        this.var_javax_microedition_lcdui_Form_if.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Form_if.append("- Cài đặt nhấn giữ giúp điều khiển nhân vật di chuyển. Thời gian tính bằng ms (1s = 1000ms)");
        this.var_javax_microedition_lcdui_Form_if.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_Form_if.addCommand(this.var_javax_microedition_lcdui_Command_for);
        this.var_javax_microedition_lcdui_Form_if.setCommandListener((CommandListener)this);
    }
}

