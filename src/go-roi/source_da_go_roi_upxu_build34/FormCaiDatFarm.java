/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class FormCaiDatFarm
extends Form
implements CommandListener,
ItemStateListener {
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_do;
    private final Command var_javax_microedition_lcdui_Command_do;
    private final TextField var_javax_microedition_lcdui_TextField_do;
    private final TextField var_javax_microedition_lcdui_TextField_if;
    private static final int[] mangSoNguyen;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_if;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_for;
    private final TextField var_javax_microedition_lcdui_TextField_for;
    private final TextField var_javax_microedition_lcdui_TextField_int;
    private final TextField var_javax_microedition_lcdui_TextField_new;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_int;
    private final TextField cfr_renamed_2;
    private final TextField cfr_renamed_15;
    private final ChoiceGroup var_javax_microedition_lcdui_ChoiceGroup_new;

    public final void commandAction(Command object, Displayable displayable) {
        block20: {
            block19: {
                block18: {
                    if (!(object > this.var_javax_microedition_lcdui_Command_do)) break block20;
                    AutoFarm.var_byte_if = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_new.getSelectedIndex();
                    AutoFarm.chuoiGiaTri = this.var_javax_microedition_lcdui_TextField_new.getString().trim();
                    try {
                        AutoFarm.var_int_char = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_do.getString().trim());
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.var_int_char = 30000;
                    }
                    if (" ".length() < 0) {
                        return;
                    }
                    AutoFarm.chuoiPhu = TienIchGame.cfr_renamed_3(this.var_javax_microedition_lcdui_TextField_if.getString().trim());
                    object = this.var_javax_microedition_lcdui_TextField_int.getString().trim();
                    if ((object.equals("-1"))) {
                        AutoFarm.tenNhanVat = object;
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else {
                        AutoFarm.tenNhanVat = TienIchGame.cfr_renamed_3((String)object);
                    }
                    try {
                        AutoFarm.soLuongKhoa = Integer.parseInt(this.var_javax_microedition_lcdui_TextField_for.getString().trim());
                        if (!(AutoFarm.soLuongKhoa > 32000)) break block18;
                        AutoFarm.soLuongKhoa = 32000;
                    }
                    catch (NumberFormatException numberFormatException) {
                        AutoFarm.soLuongKhoa = 32000;
                    }
                }
                try {
                    AutoFarm.var_int_byte = Integer.parseInt(this.cfr_renamed_2.getString().trim());
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.var_int_byte = 0;
                }
                if ((0x12 ^ 0x17) <= 0) {
                    return;
                }
                AutoFarm.var_byte_for = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_int.getSelectedIndex();
                AutoFarm.var_byte_do = (byte)this.var_javax_microedition_lcdui_ChoiceGroup_for.getSelectedIndex();
                AutoFarm.coKichHoat = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(0);
                AutoFarm.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(1);
                AutoFarm.var_boolean_new = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(2);
                AutoFarm.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(3);
                AutoFarm.var_boolean_try = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(4);
                AutoFarm.var_boolean_int = this.var_javax_microedition_lcdui_ChoiceGroup_if.isSelected(5);
                AutoChamEmBe.var_boolean_new = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(0);
                AutoChamEmBe.dangChayAuto = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2);
                AutoChamEmBe.coTrangThai = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3);
                if ((AutoChamEmBe.coTrangThai)) {
                    AutoChamEmBe.coKichHoat = 1;
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else {
                    AutoChamEmBe.coKichHoat = this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1);
                }
                try {
                    AutoFarm.var_int_try = Integer.parseInt(this.cfr_renamed_15.getString().trim());
                    if ((AutoFarm.var_int_try >= 0) && !(AutoFarm.var_int_try > 50)) break block19;
                    AutoFarm.var_int_try = 50;
                }
                catch (NumberFormatException numberFormatException) {
                    AutoFarm.var_int_try = 50;
                }
            }
            AutoFarm.cfr_renamed_11();
            GameCanvas.hienThongBaoPopup("Lưu cài đặt thành công");
        }
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public final void itemStateChanged(Item item) {
        if ((item > this.var_javax_microedition_lcdui_ChoiceGroup_do)) {
            if ((this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(3)) && !(this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1))) {
                this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, 1);
                return;
            }
            if (!(this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(1)) && (this.var_javax_microedition_lcdui_ChoiceGroup_do.isSelected(2))) {
                this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, 0);
            }
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[12];
        1 = " ".length();
        2 = "  ".length();
        0 = (3 ^ 0x53) & ~(0xCF ^ 0x9F);
        1024 = -(0xFFFFD3F8 & 0x7DFF) & (0xFFFFFFF7 & 0x55FF);
        5 = 0x34 ^ 0x31;
        6 = 0xF3 ^ 0xA0 ^ (0x32 ^ 0x67);
        3 = "   ".length();
        4 = 0x4E ^ 7 ^ (0x78 ^ 0x35);
        7 = 0x1D ^ 3 ^ (0x8D ^ 0x94);
        30000 = -(0xFFFFAF49 & 0x5AFE) & (0xFFFFFF77 & Short.MAX_VALUE);
        32000 = 0xFFFFFFC0 & 0x7D3F;
        50 = 0x66 ^ 0x54;
    }

    public FormCaiDatFarm() {
        super("Cài đặt Auto Farm");
        String[] stringArray = new String[2];
        stringArray[0] = "Lái buôn hỗ trợ";
        stringArray[1] = "Farm bình thường";
        this.var_javax_microedition_lcdui_ChoiceGroup_new = new ChoiceGroup("Cơ chế Auto", 1, stringArray, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_new);
        this.var_javax_microedition_lcdui_TextField_new = new TextField("Món ăn dự bị (id1,id2,..)", AutoFarm.chuoiGiaTri, 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_new);
        this.var_javax_microedition_lcdui_TextField_if = new TextField("Cây trồng dự bị (id1,id2,..)", AutoFarm.chuoiPhu, 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_if);
        this.var_javax_microedition_lcdui_TextField_do = new TextField("Thay thế cây khi đạt số lượng:", String.valueOf(AutoFarm.var_int_char), 5, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_do);
        this.var_javax_microedition_lcdui_TextField_int = new TextField("Bán nông sản: -1 (all) or (id1,id2,...)", AutoFarm.tenNhanVat, 1024, 0);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_int);
        this.var_javax_microedition_lcdui_TextField_for = new TextField("Bán nông sản khi đạt số lượng:", String.valueOf(AutoFarm.soLuongKhoa), 5, 2);
        this.append((Item)this.var_javax_microedition_lcdui_TextField_for);
        this.cfr_renamed_2 = new TextField("Số lượng nông sản khi bán:", String.valueOf(AutoFarm.var_int_byte), 5, 2);
        this.append((Item)this.cfr_renamed_2);
        String[] stringArray2 = new String[6];
        stringArray2[0] = "Báo danh hàng ngày";
        stringArray2[1] = "Nâng cấp cây khế";
        stringArray2[2] = "Nhiệm vụ ấp rồng";
        stringArray2[3] = "Nhiệm vụ luyện rồng";
        stringArray2[4] = "Giao đơn hàng";
        stringArray2[5] = "Ko tự mua (hạt giống/vật nuôi) dùng lượng";
        this.var_javax_microedition_lcdui_ChoiceGroup_if = new ChoiceGroup("Tùy chọn", 2, stringArray2, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_if);
        this.cfr_renamed_15 = new TextField("Nâng cây khế đến cấp:", String.valueOf(AutoFarm.var_int_try), 2, 2);
        this.append((Item)this.cfr_renamed_15);
        String[] stringArray3 = new String[4];
        stringArray3[0] = "Thu hoạch tim";
        stringArray3[1] = "Cho em bé ăn";
        stringArray3[2] = "Mua sữa lượng khi ko đủ NS";
        stringArray3[3] = "Nâng cấp em bé";
        this.var_javax_microedition_lcdui_ChoiceGroup_do = new ChoiceGroup("Chức năng vợ chồng", 2, stringArray3, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_do);
        String[] stringArray4 = new String[3];
        stringArray4[0] = "Cá";
        stringArray4[1] = "Rùa";
        stringArray4[2] = "Không";
        this.var_javax_microedition_lcdui_ChoiceGroup_int = new ChoiceGroup("Bổ sung hồ cá nếu chưa full", 1, stringArray4, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_int);
        String[] stringArray5 = new String[4];
        stringArray5[0] = "Gà";
        stringArray5[1] = "Vịt";
        stringArray5[2] = "Heo";
        stringArray5[3] = "Không";
        this.var_javax_microedition_lcdui_ChoiceGroup_for = new ChoiceGroup("Bổ sung vật nuôi nếu chưa full", 1, stringArray5, null);
        this.append((Item)this.var_javax_microedition_lcdui_ChoiceGroup_for);
        this.var_javax_microedition_lcdui_Command_do = new Command("Save", 4, 0);
        this.addCommand(this.var_javax_microedition_lcdui_Command_do);
        this.addCommand(new Command("Cancel", 7, 0));
        this.setCommandListener(this);
        this.setItemStateListener(this);
        this.var_javax_microedition_lcdui_ChoiceGroup_new.setSelectedIndex((int)AutoFarm.var_byte_if, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_int.setSelectedIndex((int)AutoFarm.var_byte_for, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_for.setSelectedIndex((int)AutoFarm.var_byte_do, 1);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(0, AutoFarm.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(1, AutoFarm.coTrangThai);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(2, AutoFarm.var_boolean_new);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(3, AutoFarm.dangChayAuto);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(4, AutoFarm.var_boolean_try);
        this.var_javax_microedition_lcdui_ChoiceGroup_if.setSelectedIndex(5, AutoFarm.var_boolean_int);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(0, AutoChamEmBe.var_boolean_new);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(1, AutoChamEmBe.coKichHoat);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(2, AutoChamEmBe.dangChayAuto);
        this.var_javax_microedition_lcdui_ChoiceGroup_do.setSelectedIndex(3, AutoChamEmBe.coTrangThai);
    }

                    static {
        FormCaiDatFarm.cfr_renamed_0();
    }

    }

