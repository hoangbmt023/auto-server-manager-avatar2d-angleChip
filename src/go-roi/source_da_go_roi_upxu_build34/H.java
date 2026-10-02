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

public final class H
implements cp,
CommandListener {
    private static H var_H_do;
    private final TextField cfr_renamed_4;
    private final Command var_javax_microedition_lcdui_Command_do;
    final TextField var_javax_microedition_lcdui_TextField_do;
    final Form var_javax_microedition_lcdui_Form_do;
    final Form var_javax_microedition_lcdui_Form_if;
    private final Command var_javax_microedition_lcdui_Command_if = new Command("Hủy", 3, 2);
    private final Command var_javax_microedition_lcdui_Command_for;
    private final TextField cfr_renamed_5;
    final TextField var_javax_microedition_lcdui_TextField_if;
    final TextField var_javax_microedition_lcdui_TextField_for;
    private static final int[] mangSoNguyen;

    public final void void_do() {
        if ((gU.dangChayAuto ? 1 : 0 == null)) {
            gU.dangChayAuto = 0;
            gU.gU_do();
            gU.cfr_renamed_3();
        }
        if ((gU.soLuong == null)) {
            this.cfr_renamed_5.setString(String.valueOf(gU.soLuong));
            if ("  ".length() > (0x11 ^ 0x15)) {
                return;
            }
        } else {
            this.cfr_renamed_5.setString("35");
        }
        this.cfr_renamed_4.setString(gU.chuoiGiaTri);
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_Form_if);
    }

    static {
        H.cfr_renamed_1();
    }

            public static H H_do() {
        if ((var_H_do == null)) {
            var_H_do = new H();
        }
        return var_H_do;
    }

        public H() {
        this.var_javax_microedition_lcdui_Form_if = new Form("Cài đặt Auto Click");
        this.cfr_renamed_4 = new TextField("Dữ liệu AutoClick:", "", 1024, 0);
        this.cfr_renamed_5 = new TextField("Phím bật/tắt auto:", "35", 4, 0);
        this.var_javax_microedition_lcdui_Command_do = new Command("Lưu", 4, 0);
        this.var_javax_microedition_lcdui_Command_for = new Command("Lấy mã phím", 1, 1);
        this.var_javax_microedition_lcdui_Form_if.append((Item)this.cfr_renamed_4);
        this.var_javax_microedition_lcdui_Form_if.append((Item)this.cfr_renamed_5);
        this.var_javax_microedition_lcdui_Form_if.append("- Nhấn giữ phím bật/tắt auto sẽ mở cài đặt. Phím bật/tắt auto mặc định 35 là phím #");
        this.var_javax_microedition_lcdui_Form_if.append("- Nếu bạn không biết cài đặt thế nào hãy nhấn vào menu \"Lấy mã phím\" để đặt phím. Lặp lại thao tác để đặt phím tiếp theo!");
        this.var_javax_microedition_lcdui_Form_if.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_Form_if.addCommand(this.var_javax_microedition_lcdui_Command_for);
        this.var_javax_microedition_lcdui_Form_if.addCommand(this.var_javax_microedition_lcdui_Command_if);
        this.var_javax_microedition_lcdui_Form_if.setCommandListener((CommandListener)this);
        this.var_javax_microedition_lcdui_Form_do = new Form("Đặt mã phím");
        this.var_javax_microedition_lcdui_TextField_if = new TextField("Mã phím:", "", 4, 0);
        this.var_javax_microedition_lcdui_TextField_for = new TextField("Nhấn phím này sau (s):", "0", 4, 2);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Nhấn giữ trong (ms):", "0", 5, 2);
        this.var_javax_microedition_lcdui_Form_do.append((Item)this.var_javax_microedition_lcdui_TextField_if);
        this.var_javax_microedition_lcdui_Form_do.append((Item)this.var_javax_microedition_lcdui_TextField_for);
        this.var_javax_microedition_lcdui_Form_do.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_Form_do.append("- Cài đặt nhấn giữ giúp điều khiển nhân vật di chuyển. Thời gian tính bằng ms (1s = 1000ms)");
        this.var_javax_microedition_lcdui_Form_do.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.var_javax_microedition_lcdui_Form_do.addCommand(this.var_javax_microedition_lcdui_Command_if);
        this.var_javax_microedition_lcdui_Form_do.setCommandListener((CommandListener)this);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[9];
        3 = "   ".length();
        2 = "  ".length();
        1024 = 0xFFFF8776 & 0x7C89;
        0 = (0x2E ^ 0x61 ^ (3 ^ 0x19)) & (92 + 167 - 255 + 228 ^ 73 + 118 - 8 + 6 ^ -" ".length());
        4 = 0x5B ^ 0x5F;
        1 = " ".length();
        5 = 0xBB ^ 0xBE;
        59 = 0x84 ^ 0xBF;
        44 = 4 ^ 0x28;
    }

    public final void commandAction(Command object, Displayable object2) {
        block22: {
            block23: {
                String string;
                if ((object2 == this.var_javax_microedition_lcdui_Form_do)) {
                    if ((object == this.var_javax_microedition_lcdui_Command_do)) {
                        object = this.var_javax_microedition_lcdui_TextField_if.getString().trim();
                        object2 = this.var_javax_microedition_lcdui_TextField_for.getString().trim();
                        String string2 = this.var_javax_microedition_lcdui_TextField_do.getString().trim();
                        String string3 = this.cfr_renamed_4.getString().trim();
                        if (H.cfr_renamed_1(((String)object).equals("") ? 1 : 0)) {
                            String string4;
                            Object object3;
                            StringBuffer stringBuffer = new StringBuffer().append((String)object).append(":");
                            if (H.cfr_renamed_1(((String)object2).equals("") ? 1 : 0)) {
                                object3 = object2;
                                if (((6 ^ 0x45) & ~(0x5F ^ 0x1C)) < 0) {
                                    return;
                                }
                            } else {
                                object3 = "0";
                            }
                            StringBuffer stringBuffer2 = stringBuffer.append((String)object3).append(":");
                            if (!(string2.equals(""))) {
                                string4 = string2;
                                if (((65 + 68 - 3 + 118 ^ 177 + 69 - 62 + 14) & (0xE7 ^ 0x9E ^ (0x68 ^ 0x2F) ^ -" ".length())) < 0) {
                                    return;
                                }
                            } else {
                                string4 = "0";
                            }
                            object = stringBuffer2.append(string4).toString();
                            if ((string3.equals("") ? 1 : 0 == null)) {
                                this.cfr_renamed_4.setString((String)object);
                                if (-"  ".length() > 0) {
                                    return;
                                }
                            } else {
                                String string5;
                                StringBuffer stringBuffer3 = new StringBuffer().append(string3);
                                if (!(string3.endsWith(","))) {
                                    string5 = ",";
                                    if (-(0xA7 ^ 0xA3) > 0) {
                                        return;
                                    }
                                } else {
                                    string5 = "";
                                }
                                this.cfr_renamed_4.setString(stringBuffer3.append(string5).append((String)object).toString());
                            }
                        }
                    }
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this.var_javax_microedition_lcdui_Form_if);
                    return;
                }
                if (!(object2 == this.var_javax_microedition_lcdui_Form_if)) break block22;
                if ((object == this.var_javax_microedition_lcdui_Command_for)) {
                    Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)new bi_0(this));
                    return;
                }
                if (!(object == this.var_javax_microedition_lcdui_Command_do)) break block23;
                try {
                    gU.soLuong = Integer.parseInt(this.cfr_renamed_5.getString().trim());
                }
                catch (NumberFormatException numberFormatException) {
                    gU.soLuong = 0;
                }
                if (((0x82 ^ 0xBF) & ~(0x1E ^ 0x23)) >= " ".length()) {
                    return;
                }
                if (H.cfr_renamed_1(((String)(object = this.cfr_renamed_4.getString().trim())).equals("") ? 1 : 0)) {
                    string = ((String)object).replace(59, 44);
                    if (((0x43 ^ 0x47 ^ (0xD7 ^ 0xC1)) & (0 ^ 0x27 ^ (0xB0 ^ 0x85) ^ -" ".length())) < -" ".length()) {
                        return;
                    }
                } else {
                    string = "";
                }
                gU.chuoiGiaTri = string;
                gU.cfr_renamed_1();
                GameCanvas.hienThongBaoPopup("Đã lưu cài đặt!");
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
        }
    }

    }

