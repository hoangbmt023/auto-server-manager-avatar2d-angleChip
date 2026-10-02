/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from cA
 */
public final class ca_0
extends Canvas {
    public static ca_0 var_ca_0_do;
    public static boolean dangChayAuto;
    private static final int[] mangSoNguyen;

                public ca_0() {
        this.setFullScreenMode(1);
    }

    private static void (Graphics graphics, String string, int n > 0) {
        graphics.drawString(string, 10, n, 20);
    }

        static {
        ca_0.cfr_renamed_1();
        var_ca_0_do = new ca_0();
        dangChayAuto = 0;
    }

    protected final void pointerPressed(int n, int n2) {
        dangChayAuto = 0;
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
    }

    public final void keyPressed(int n) {
        if (!(n != 92) || !(n != 124) || !(n != 96) || (n == 126)) {
            dangChayAuto = 0;
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)AngelChip.gameCanvas);
        }
    }

    public static void cfr_renamed_0() {
        dangChayAuto = 1;
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)var_ca_0_do);
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[13];
        1 = " ".length();
        10 = 0xA ^ 0;
        20 = 0xA7 ^ 0xB3;
        0 = (0x6A ^ 0x37) & ~(0x16 ^ 0x4B);
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
        26 = 0xEB ^ 0xA0 ^ (0xC9 ^ 0x98);
        2 = "  ".length();
        42 = 0x74 ^ 0x5E;
        -1 = -" ".length();
        92 = 0xBA ^ 0x95 ^ (0xD1 ^ 0xA2);
        124 = 0xE2 ^ 0x9E;
        96 = 0xF ^ 0x6F;
        126 = 0x4B ^ 0x65 ^ (0x76 ^ 0x26);
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void paint(Graphics graphics) {
        String string;
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.setColor(16777215);
        int n = 10;
        if ((gW.dangChayAuto)) {
            (graphics, "Status: Auto Login", 10 > 0);
            n += 16;
            ca_0.cfr_renamed_0(graphics, "User: " + ThongTinNhanVat.cfr_renamed_0().var_gx_int.java_lang_String_do(), 26);
            if (" ".length() < 0) {
                return;
            }
        } else if ((AutoController.nhiemVuHienTai > 0) && ca_0.cfr_renamed_0(AutoController.nhiemVuHienTai.toString().length())) {
            (graphics, "Status: " + AutoController.nhiemVuHienTai.toString(), 10 > 0);
            n += 16;
            (graphics, "ID: " + (String)AngelChip.duLieuNguoiChoi.var_short_do + " - LV: " + AutoController.controllerInstance.chuoiGiaTri, 26 > 0);
            n += 16;
            ca_0.cfr_renamed_0(graphics, "TK: " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + "xu - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + "L - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.soLuong) + "LK", 42);
        }
        (graphics, "Ngày up: " + TienIchGame.aq_0_do().chuoiPhu, n += 16 > 0);
        if (ca_0.cfr_renamed_0((TienIchGame.soXu != 0L))) {
            (graphics, "Ngày hết hạn: " + TienIchGame.aq_0_do().chuoiGiaTri, n += 16 > 0);
        }
        if ((TienIchGame.soLuongKhoa > 0)) {
            (graphics, "Xu cần up: " + GameCanvas.java_lang_String_do(TienIchGame.soLuongKhoa), n += 16 > 0);
        }
        n += 16;
        StringBuffer stringBuffer = new StringBuffer().append("Xu up được: ");
        if ((TienIchGame.soLuong > 0)) {
            string = GameCanvas.java_lang_String_do(TienIchGame.soLuong);
            if ("   ".length() <= 0) {
                return;
            }
        } else if ((TienIchGame.soLuong < 0)) {
            string = "-" + GameCanvas.java_lang_String_do(Math.abs(TienIchGame.soLuong));
            if (((0xF9 ^ 0xBC ^ (0xBF ^ 0xA0)) & (43 + 199 - 235 + 193 ^ 99 + 27 - 15 + 35 ^ -" ".length())) != ("   ".length() & ("   ".length() ^ -" ".length()))) {
                return;
            }
        } else {
            string = "0";
        }
        ca_0.cfr_renamed_0(graphics, stringBuffer.append(string).toString(), n);
        if ((AngelChip.duLieuNguoiChoi.var_short_byte != -1) && (AutoChamEmBe.var_boolean_new)) {
            String string2;
            n += 16;
            StringBuffer stringBuffer2 = new StringBuffer().append("Tim thu được: ");
            if ((TienIchGame.var_int_if > 0)) {
                string2 = GameCanvas.java_lang_String_do(TienIchGame.var_int_if);
                if (((0xF2 ^ 0x8B ^ (0x4C ^ 0x25)) & (3 ^ 0x61 ^ (0x69 ^ 0x1B) ^ -" ".length())) > (8 + 12 - -10 + 103 ^ 56 + 126 - 164 + 111)) {
                    return;
                }
            } else {
                string2 = "0";
            }
            ca_0.cfr_renamed_0(graphics, stringBuffer2.append(string2).toString(), n);
        }
        n += 24;
        if ((AutoController.nhiemVuHienTai > 0)) {
            if ((AutoController.nhiemVuHienTai instanceof AutoBanDa != 0) && ca_0.cfr_renamed_0((AutoBanDa.soXu != 0L))) {
                int n2 = (int)((AutoBanDa.var_long_if - AutoBanDa.soXu) / 1000L);
                StringBuffer stringBuffer3 = new StringBuffer().append("Thời gian: ");
                ThongTinNhanVat.cfr_renamed_0();
                ca_0.cfr_renamed_0(graphics, stringBuffer3.append(ThongTinNhanVat.java_lang_String_do(n2)).toString(), n);
                (graphics, "Khu hiện tại: " + fe_0.var_byte_for, n += 16 > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof T != 0)) {
                (graphics, "Trả lời win: " + AutoController.nhiemVuHienTai.int_do(), n > 0);
                (graphics, "Khu hiện tại: " + fe_0.var_byte_for, n += 16 > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof AutoKimCuong != 0) && (AutoKimCuong.cfr_renamed_5)) {
                String string3;
                (graphics, "P: " + a_0.var_byte_for + " - B: " + a_0.var_byte_int + " | kcx: +" + AutoKimCuong.soLuongKhoa + " - nhb: +" + AutoKimCuong.soLuong, n > 0);
                n += 16;
                int n3 = (int)((AutoKimCuong.X_do().soXu - System.currentTimeMillis()) / 1000L);
                StringBuffer stringBuffer4 = new StringBuffer().append("Farming: ");
                if ((n3 > 0)) {
                    ThongTinNhanVat.cfr_renamed_0();
                    string3 = ThongTinNhanVat.java_lang_String_do(n3);
                    if (((83 + 119 - 74 + 57 ^ 137 + 39 - 130 + 123) & (0x1C ^ 0x38 ^ (0x28 ^ 0x1C) ^ -" ".length()) & ((0x15 ^ 0xB ^ (0xF3 ^ 0xAF)) & (0x8A ^ 0xB6 ^ (0xA ^ 0x74) ^ -" ".length()) ^ -" ".length())) >= (0x1A ^ 0x26 ^ (3 ^ 0x3B))) {
                        return;
                    }
                } else {
                    string3 = "xin chờ...";
                }
                ca_0.cfr_renamed_0(graphics, stringBuffer4.append(string3).toString(), n);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof fl != 0)) {
                (graphics, fl.var_fl_do.java_lang_String_for(), n > 0);
                (graphics, fl.var_fl_do.java_lang_String_if(), n += 16 > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof ak != 0)) {
                (graphics, ak.var_ak_do.java_lang_String_for(), n > 0);
                (graphics, ak.var_ak_do.java_lang_String_if(), n += 16 > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof gt_0 != 0) && ca_0.cfr_renamed_0((gt_0.soXu != 0L))) {
                (graphics, "Ra tù sau: " + gt_0.java_lang_String_if(), n > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof dn_0 != 0)) {
                String string4;
                int n4 = (int)((dn_0.dn_0_do().var_long_if - System.currentTimeMillis()) / 1000L);
                StringBuffer stringBuffer5 = new StringBuffer().append("Farming: ");
                if ((n4 > 0)) {
                    ThongTinNhanVat.cfr_renamed_0();
                    string4 = ThongTinNhanVat.java_lang_String_do(n4);
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                } else {
                    string4 = "xin chờ...";
                }
                ca_0.cfr_renamed_0(graphics, stringBuffer5.append(string4).toString(), n);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof gb_0 != 0)) {
                ca_0.cfr_renamed_0(graphics, gb_0.gb_0_do().java_lang_String_if(), n);
                (graphics, "Khu hiện tại: " + fe_0.var_byte_for, n += 16 > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof av_0 != 0)) {
                (graphics, "Đã hôn: " + av_0.soLuong + " lần", n > 0);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof F != 0)) {
                (graphics, "Đã đánh: " + F.soLuong + " lần", n > 0);
            }
        }
    }

    }

