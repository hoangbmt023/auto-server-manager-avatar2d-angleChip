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

public final class dq
extends Canvas {
    public static boolean dangChayAuto;
    public static dq var_dq_do;
    private static final int[] mangSoNguyen;

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

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void cfr_renamed_1() {
        dangChayAuto = 1;
        Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)var_dq_do);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[13];
        1 = " ".length();
        10 = 46 + 158 - 79 + 50 ^ 131 + 83 - 102 + 53;
        20 = 0x4C ^ 0x58;
        0 = (70 + 25 - 60 + 131 ^ 100 + 135 - 201 + 109) & (0xF ^ 0x34 ^ (0x69 ^ 0x7B) ^ -" ".length());
        16777215 = 0xFFFFFFFF & 0xFFFFFF;
        26 = 70 + 28 - 7 + 37 ^ 37 + 88 - 86 + 115;
        2 = "  ".length();
        42 = 64 + 79 - 93 + 78 ^ 168 + 145 - 205 + 62;
        -1 = -" ".length();
        92 = 89 + 147 - 82 + 65 ^ 91 + 113 - 85 + 16;
        124 = 0xEA ^ 0x89 ^ (0x25 ^ 0x3A);
        96 = 0x7E ^ 0x6D ^ (0xEC ^ 0x9F);
        126 = 0x21 ^ 0x28 ^ (6 ^ 0x71);
    }

        static {
        dq.cfr_renamed_0();
        var_dq_do = new dq();
        dangChayAuto = 0;
    }

    private static void (Graphics graphics, String string, int n != null) {
        graphics.drawString(string, 10, n, 20);
    }

            public dq() {
        this.setFullScreenMode(1);
    }

            public final void paint(Graphics graphics) {
        String string;
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.setColor(16777215);
        int n = 10;
        if ((ga_0.cfr_renamed_2 ? 1 : 0 != null)) {
            (graphics, "Status: Auto Login", 10 != null);
            n += 16;
            dq.cfr_renamed_1(graphics, "User: " + ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.java_lang_String_do(), 26);
            if (" ".length() <= 0) {
                return;
            }
        } else if ((AutoController.nhiemVuHienTai != null) && dq.cfr_renamed_0(AutoController.nhiemVuHienTai.toString().length())) {
            (graphics, "Status: " + AutoController.nhiemVuHienTai.toString(), 10 != null);
            n += 16;
            (graphics, "ID: " + (String)AngelChip.duLieuNguoiChoi.soLuong + " - LV: " + AutoController.controllerInstance.chuoiGiaTri, 26 != null);
            n += 16;
            dq.cfr_renamed_1(graphics, "TK: " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[0]) + "xu - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.mangSoNguyen[2]) + "L - " + GameCanvas.java_lang_String_do(AngelChip.duLieuNguoiChoi.soLuong) + "LK", 42);
        }
        (graphics, "Ngày up: " + TienIchGame.aq_0_do().chuoiPhu, n += 16 != null);
        if (dq.cfr_renamed_0((TienIchGame.var_long_for == 0L))) {
            (graphics, "Ngày hết hạn: " + TienIchGame.aq_0_do().tenNhanVat, n += 16 != null);
        }
        if ((TienIchGame.var_int_int > 0)) {
            (graphics, "Xu cần up: " + GameCanvas.java_lang_String_do(TienIchGame.var_int_int), n += 16 != null);
        }
        n += 16;
        StringBuffer stringBuffer = new StringBuffer().append("Xu up được: ");
        if ((TienIchGame.var_int_if > 0)) {
            string = GameCanvas.java_lang_String_do(TienIchGame.var_int_if);
            if (-" ".length() < -" ".length()) {
                return;
            }
        } else if ((TienIchGame.var_int_if < 0)) {
            string = "-" + GameCanvas.java_lang_String_do(Math.abs(TienIchGame.var_int_if));
            if (" ".length() == 0) {
                return;
            }
        } else {
            string = "0";
        }
        dq.cfr_renamed_1(graphics, stringBuffer.append(string).toString(), n);
        if ((AngelChip.duLieuNguoiChoi.cfr_renamed_23 != -1) && (bp_0.cfr_renamed_5 ? 1 : 0 != null)) {
            String string2;
            n += 16;
            StringBuffer stringBuffer2 = new StringBuffer().append("Tim thu được: ");
            if ((TienIchGame.soLuongKhoa > 0)) {
                string2 = GameCanvas.java_lang_String_do(TienIchGame.soLuongKhoa);
                if (((0x5B ^ 0xC) & ~(0x51 ^ 6)) > " ".length()) {
                    return;
                }
            } else {
                string2 = "0";
            }
            dq.cfr_renamed_1(graphics, stringBuffer2.append(string2).toString(), n);
        }
        if ((AutoController.nhiemVuHienTai != null)) {
            n += 24;
            if ((AutoController.nhiemVuHienTai instanceof c != null) && dq.cfr_renamed_0((c.var_long_for == 0L))) {
                int n2 = (int)((c.var_long_if - c.var_long_for) / 1000L);
                StringBuffer stringBuffer3 = new StringBuffer().append("Thời gian: ");
                ThongTinNhanVat.cfr_renamed_1();
                dq.cfr_renamed_1(graphics, stringBuffer3.append(ThongTinNhanVat.java_lang_String_do(n2)).toString(), n);
                (graphics, "Khu hiện tại: " + go_0.var_byte_do, n += 16 != null);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof af_0 != null)) {
                (graphics, "Trả lời win: " + AutoController.nhiemVuHienTai.int_do(), n != null);
                (graphics, "Khu hiện tại: " + go_0.var_byte_do, n += 16 != null);
                return;
            }
            if ((AutoController.nhiemVuHienTai instanceof AutoCauCa != null)) {
                if ((AutoCauCa.coTrangThai ? 1 : 0 != null)) {
                    String string3;
                    int n3 = (int)((AutoCauCa.bs_0_do().var_long_if - System.currentTimeMillis()) / 1000L);
                    StringBuffer stringBuffer4 = new StringBuffer().append("Farming: ");
                    if ((n3 > 0)) {
                        ThongTinNhanVat.cfr_renamed_1();
                        string3 = ThongTinNhanVat.java_lang_String_do(n3);
                        if (((0x22 ^ 0x65 ^ (0xB9 ^ 0xC4)) & (1 + 96 - 3 + 37 ^ 98 + 81 - 143 + 149 ^ -" ".length())) < 0) {
                            return;
                        }
                    } else {
                        string3 = "xin chờ...";
                    }
                    dq.cfr_renamed_1(graphics, stringBuffer4.append(string3).toString(), n);
                    n += 20;
                }
                (graphics, "Cá câu được: " + AutoCauCa.cfr_renamed_5, n != null);
                (graphics, "Cá mập: " + AutoCauCa.soLuongKhoa, n += 16 != null);
                if ((AutoCauCa.var_boolean_int ? 1 : 0 != null)) {
                    (graphics, "KCX: +" + AutoCauCa.cfr_renamed_4, n += 16 != null);
                    return;
                }
            } else if ((AutoController.nhiemVuHienTai instanceof aj != null)) {
                (graphics, "P: " + w_0.var_byte_for + " - B: " + w_0.var_byte_int + " | kcx: +" + aj.soLuong + " - nhb: +" + aj.soLuongKhoa, n != null);
                if ((aj.cfr_renamed_5 ? 1 : 0 != null)) {
                    String string4;
                    n += 16;
                    int n4 = (int)((aj.aj_do().soXu - System.currentTimeMillis()) / 1000L);
                    StringBuffer stringBuffer5 = new StringBuffer().append("Farming: ");
                    if ((n4 > 0)) {
                        ThongTinNhanVat.cfr_renamed_1();
                        string4 = ThongTinNhanVat.java_lang_String_do(n4);
                        if ("   ".length() == "  ".length()) {
                            return;
                        }
                    } else {
                        string4 = "xin chờ...";
                    }
                    dq.cfr_renamed_1(graphics, stringBuffer5.append(string4).toString(), n);
                    return;
                }
            } else {
                if ((AutoController.nhiemVuHienTai instanceof dm_0 != null)) {
                    (graphics, dm_0.var_dm_0_do.java_lang_String_for(), n != null);
                    (graphics, dm_0.var_dm_0_do.cfr_renamed_0(), n += 16 != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof cl != null)) {
                    (graphics, cl.var_cl_do.cfr_renamed_0(), n != null);
                    (graphics, cl.var_cl_do.java_lang_String_for(), n += 16 != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof ex_0 != null)) {
                    String string5;
                    int n5 = (int)((ex_0.ex_0_do().soXu - System.currentTimeMillis()) / 1000L);
                    StringBuffer stringBuffer6 = new StringBuffer().append("Farming: ");
                    if ((n5 > 0)) {
                        ThongTinNhanVat.cfr_renamed_1();
                        string5 = ThongTinNhanVat.java_lang_String_do(n5);
                        if ("   ".length() < "   ".length()) {
                            return;
                        }
                    } else {
                        string5 = "xin chờ...";
                    }
                    dq.cfr_renamed_1(graphics, stringBuffer6.append(string5).toString(), n);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof fu_0 != null) && dq.cfr_renamed_0((fu_0.soXu == 0L))) {
                    (graphics, "Ra tù sau: " + fu_0.cfr_renamed_0(), n != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof gr_0 != null)) {
                    dq.cfr_renamed_1(graphics, gr_0.gr_0_do().cfr_renamed_0(), n);
                    (graphics, "Khu hiện tại: " + go_0.var_byte_do, n += 16 != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof gh_0 != null)) {
                    String string6;
                    StringBuffer stringBuffer7 = new StringBuffer().append("Số lần farm: ").append(gh_0.var_int_if).append(" / ");
                    if ((gh_0.cfr_renamed_1 > 0)) {
                        string6 = String.valueOf(gh_0.cfr_renamed_1);
                        if (-"  ".length() > 0) {
                            return;
                        }
                    } else {
                        string6 = "KGH";
                    }
                    dq.cfr_renamed_1(graphics, stringBuffer7.append(string6).toString(), n);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof bL != null)) {
                    (graphics, "Đã hôn: " + bL.soLuong + " lần", n != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof L != null)) {
                    (graphics, "Đã đánh: " + L.soLuong + " lần", n != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof az_0 != null)) {
                    String string7;
                    if ((GameCanvas.var_en_do instanceof dR != null)) {
                        (graphics, "Friend: " + dR.dR_do().chuoiGiaTri, n != null);
                        n += 20;
                    }
                    StringBuffer stringBuffer8 = new StringBuffer().append("Số lần farm: ").append(az_0.var_int_int).append(" / ");
                    if ((az_0.var_int_if > 0)) {
                        string7 = String.valueOf(az_0.var_int_if);
                        if ("  ".length() <= 0) {
                            return;
                        }
                    } else {
                        string7 = "KGH";
                    }
                    dq.cfr_renamed_1(graphics, stringBuffer8.append(string7).toString(), n);
                    (graphics, "Cỏ đã diệt: " + az_0.soLuongKhoa, n += 16 != null);
                    (graphics, "Sâu đã diệt: " + az_0.soLuong, n += 16 != null);
                    return;
                }
                if ((AutoController.nhiemVuHienTai instanceof N != null)) {
                    (graphics, "Khu hiện tại: " + go_0.var_byte_do, n != null);
                    if ((N.var_int_int != -1) && (N.var_int_if != -1)) {
                        (graphics, "Số lượng: " + N.var_int_int + "/" + N.var_int_if, n += 16 != null);
                        return;
                    }
                } else if ((AutoController.nhiemVuHienTai instanceof cl_0 != null)) {
                    (graphics, "Số lần HPHV: " + AutoController.nhiemVuHienTai.int_do(), n != null);
                }
            }
        }
    }

    }

