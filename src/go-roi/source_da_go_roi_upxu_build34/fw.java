/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class fw
extends dL {
    private static int cfr_renamed_2;
    private int cfr_renamed_15;
    private static Image var_javax_microedition_lcdui_Image_do;
    private byte[] var_byte_arr_do;
    private ei var_ei_if;
    private long soXu;
    private int cfr_renamed_8;
    public static fw var_fw_do;
    public cp var_cp_do;
    public static int soLuong;
    public ep var_ep_do;
    private static int cfr_renamed_12;
    private static Image var_javax_microedition_lcdui_Image_if;
    public int var_int_if;
    private int cfr_renamed_11;
    private byte var_byte_if;
    public ei var_ei_do;
    public static String chuoiGiaTri;
    private int cfr_renamed_18;
    private static int cfr_renamed_10;
    private static final int[] mangSoNguyen;
    private byte var_byte_for;
    private static int cfr_renamed_14;
    private int cfr_renamed_23;
    private static int cfr_renamed_24;
    boolean dangChayAuto;
    public int soLuongKhoa;
    private static int cfr_renamed_25;
    public static int var_int_int;
    public int cfr_renamed_5;
    private int cfr_renamed_27;
    private byte var_byte_int = (byte)16;
    private boolean coKichHoat;
    public static boolean coTrangThai;
    private Vector var_java_util_Vector_do;
    private static int cfr_renamed_26;
    private static Vector var_java_util_Vector_if;
    private ep var_ep_if;
    private long var_long_if;
    private static ep var_ep_for;
    public static byte var_byte_do;
    private static int cfr_renamed_21;
    public static cp var_cp_if;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;

    private void cfr_renamed_5() {
        bv bv2 = (bv)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
        cfr_renamed_21 = bv2.var_byte_do * this.var_byte_int - GameCanvas.var_int_byte / 2;
        cfr_renamed_26 = bv2.cfr_renamed_1 * this.var_byte_int - GameCanvas.this / 2;
        fw.cfr_renamed_11();
    }

    public final void void_for() {
        if (fw.boolean_do(this.cfr_renamed_18)) {
            if (!(var_int_int >= 0) || (var_int_int > cfr_renamed_12)) {
                this.cfr_renamed_18 -= this.cfr_renamed_18 / 4;
                var_int_int += this.cfr_renamed_18 / 20;
                if ((this.cfr_renamed_18 / 10 <= 1)) {
                    this.cfr_renamed_18 = 0;
                }
            }
            cfr_renamed_26 = var_int_int += this.cfr_renamed_18 / 10;
            this.cfr_renamed_18 -= this.cfr_renamed_18 / 10;
            if ((this.cfr_renamed_18 / 10 == 0)) {
                this.cfr_renamed_18 = 0;
            }
        }
        if (fw.boolean_if(var_int_int)) {
            cfr_renamed_26 = 0;
            this.cfr_renamed_18 = 0;
            if (" ".length() >= "   ".length()) {
                return;
            }
        } else if ((var_int_int > cfr_renamed_12)) {
            cfr_renamed_26 = cfr_renamed_12;
            this.cfr_renamed_18 = 0;
        }
        if (fw.boolean_do(this.cfr_renamed_8)) {
            if (!(soLuong >= 0) || (soLuong > cfr_renamed_10)) {
                this.cfr_renamed_8 -= this.cfr_renamed_8 / 4;
                soLuong += this.cfr_renamed_8 / 20;
                if ((this.cfr_renamed_8 / 10 <= 1)) {
                    this.cfr_renamed_8 = 0;
                }
            }
            this.cfr_renamed_8 -= this.cfr_renamed_8 / 10;
            cfr_renamed_21 = soLuong += this.cfr_renamed_8 / 10;
            if ((this.cfr_renamed_8 / 10 == 0)) {
                this.cfr_renamed_8 = 0;
            }
        }
        if (fw.boolean_if(soLuong)) {
            cfr_renamed_21 = 0;
            this.cfr_renamed_8 = 0;
            if ((45 + 42 - 18 + 63 ^ 120 + 15 - 34 + 28) <= 0) {
                return;
            }
        } else if ((soLuong > cfr_renamed_10)) {
            cfr_renamed_21 = cfr_renamed_10;
            this.cfr_renamed_8 = 0;
        }
        if ((var_int_int != cfr_renamed_26)) {
            cfr_renamed_2 = cfr_renamed_26 - var_int_int << 2;
            var_int_int += (cfr_renamed_25 += cfr_renamed_2) >> 4;
            cfr_renamed_25 &= 15;
        }
        if ((soLuong != cfr_renamed_21)) {
            cfr_renamed_14 = cfr_renamed_21 - soLuong << 2;
            soLuong += (cfr_renamed_24 += cfr_renamed_14) >> 4;
            cfr_renamed_24 &= 15;
        }
        if (!(cfr_renamed_26 >= 0) || fw.boolean_if(var_int_int)) {
            var_int_int = 0;
            cfr_renamed_26 = 0;
        }
        if (!(cfr_renamed_26 <= cfr_renamed_12) || (var_int_int > cfr_renamed_12)) {
            cfr_renamed_26 = var_int_int = cfr_renamed_12;
        }
        if (!(cfr_renamed_21 >= 0) || fw.boolean_if(soLuong)) {
            soLuong = 0;
            cfr_renamed_21 = 0;
        }
        if (!(cfr_renamed_21 <= cfr_renamed_10) || (soLuong > cfr_renamed_10)) {
            cfr_renamed_21 = soLuong = cfr_renamed_10;
        }
        int n = 0;
        while ((n < var_java_util_Vector_if.size())) {
            int n2;
            eq_0 eq_02 = (eq_0)var_java_util_Vector_if.elementAt(n);
            int n3 = eq_02.var_int_if;
            int n4 = eq_02.cfr_renamed_3;
            if (fw.boolean_do(GameCanvas.var_int_try % 5, 1)) {
                n2 = 1;
                } else {
                n2 = 0;
            }
            eq_02.var_int_if = n3 - (n4 + n2);
            if ((eq_02.var_int_if < -this.var_int_if - 50)) {
                eq_02.var_int_if = this.var_int_if + gc_0.int_do(4) * 50 + this.var_byte_for * this.var_byte_int;
                eq_02.soLuong = gc_0.int_do(10) * (this.var_byte_if * this.var_byte_int / 10) + 10;
                eq_02.cfr_renamed_3 = gc_0.int_do(2);
            }
            ++n;
            return;
        }
    }

    public final void cfr_renamed_2() {
        if (!(coTrangThai) && (GameCanvas.var_dL_do != gE.var_gE_do)) {
            fe_0.fe_0_do().cfr_renamed_8();
            var_ep_for = null;
            return;
        }
        fe_0.fe_0_do();
        fe_0.cfr_renamed_6();
    }

        private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    public final void cfr_renamed_15() {
        ++this.var_long_if;
        if (!(GameCanvas.var_et_0_do != null) || !(et_0.coTrangThai)) {
            super.cfr_renamed_15();
        }
        this.dangChayAuto = 0;
        if (fw.boolean_do(GameCanvas.boolean_if(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char) ? 1 : 0)) {
            int n;
            int n2 = GameCanvas.int_do();
            int n3 = GameCanvas.int_for();
            if ((GameCanvas.var_et_0_do == null) && fw.boolean_do(GameCanvas.coKichHoat ? 1 : 0)) {
                GameCanvas.coKichHoat = 0;
                n = 0;
                while ((n < this.var_java_util_Vector_do.size())) {
                    bv bv2 = (bv)this.var_java_util_Vector_do.elementAt(n);
                    if (fw.boolean_do(GameCanvas.boolean_if(this.var_int_if + bv2.var_byte_do * this.var_byte_int + this.var_byte_int / 2 - 24 * bn_0.cfr_renamed_6 - soLuong, this.cfr_renamed_5 + bv2.cfr_renamed_1 * this.var_byte_int - 56 * bn_0.cfr_renamed_6 - var_int_int, 48 * bn_0.cfr_renamed_6, 56 * bn_0.cfr_renamed_6) ? 1 : 0)) {
                        this.soLuongKhoa = n;
                        return;
                    }
                    ++n;
                    return;
                }
            }
            if (fw.boolean_do(GameCanvas.var_boolean_try ? 1 : 0)) {
                if ((GameCanvas.var_int_try % 3 == 0)) {
                    this.cfr_renamed_23 = GameCanvas.var_int_if;
                    this.cfr_renamed_15 = GameCanvas.soLuongKhoa;
                    this.soXu = this.var_long_if;
                }
                this.cfr_renamed_18 = 0;
                this.cfr_renamed_8 = 0;
                if (!(this.coKichHoat)) {
                    this.coKichHoat = 1;
                    this.cfr_renamed_11 = soLuong;
                    this.cfr_renamed_27 = var_int_int;
                }
                cfr_renamed_26 = this.cfr_renamed_27 + n3;
                cfr_renamed_21 = this.cfr_renamed_11 + n2;
                fw.cfr_renamed_11();
                var_int_int = cfr_renamed_26;
                soLuong = cfr_renamed_21;
            }
            if (fw.boolean_do(GameCanvas.var_boolean_new ? 1 : 0)) {
                n = (int)(this.var_long_if - this.soXu);
                int n4 = this.cfr_renamed_23 - GameCanvas.var_int_if;
                if ((n < 10)) {
                    if ((cfr_renamed_26 >= 0) && (cfr_renamed_26 < cfr_renamed_12)) {
                        this.cfr_renamed_18 = n4 / n * 10;
                    }
                    n4 = this.cfr_renamed_15 - GameCanvas.soLuongKhoa;
                    if ((cfr_renamed_21 >= 0) && (cfr_renamed_21 < cfr_renamed_10)) {
                        this.cfr_renamed_8 = n4 / n * 10;
                    }
                }
                this.soXu = -1L;
                this.coKichHoat = 0;
                if ((gc_0.int_if(n2) < 10) && (gc_0.int_if(n3) < 10)) {
                    bv bv3 = (bv)this.var_java_util_Vector_do.elementAt(this.soLuongKhoa);
                    if (fw.boolean_do(GameCanvas.boolean_if(this.var_int_if + bv3.var_byte_do * this.var_byte_int + this.var_byte_int / 2 - 24 * bn_0.cfr_renamed_6 - soLuong, this.cfr_renamed_5 + bv3.cfr_renamed_1 * this.var_byte_int - 56 * bn_0.cfr_renamed_6 - var_int_int, 48 * bn_0.cfr_renamed_6, 56 * bn_0.cfr_renamed_6) ? 1 : 0)) {
                        this.var_ei_if.cfr_renamed_1();
                        return;
                    }
                    cfr_renamed_21 = GameCanvas.soLuongKhoa + soLuong - GameCanvas.var_int_int;
                    cfr_renamed_26 = GameCanvas.var_int_if + var_int_int - GameCanvas.var_int_long;
                    fw.cfr_renamed_11();
                }
            }
        }
        if ((this.var_cp_do == null)) {
            if (!(GameCanvas.boolean_do(2)) && !(GameCanvas.boolean_do(4))) {
                if (!!(GameCanvas.boolean_do(8)) || fw.boolean_do(GameCanvas.boolean_do(6) ? 1 : 0)) {
                    this.soLuongKhoa += 1;
                    if (fw.boolean_if(this.soLuongKhoa, this.var_java_util_Vector_do.size())) {
                        this.soLuongKhoa = 0;
                    }
                    this.dangChayAuto = 1;
                    if (-(89 + 135 - 190 + 156 ^ 86 + 139 - 53 + 14) >= 0) {
                        return;
                    }
                }
            } else {
                this.soLuongKhoa -= 1;
                if (fw.boolean_if(this.soLuongKhoa)) {
                    this.soLuongKhoa = this.var_java_util_Vector_do.size() - 1;
                }
                this.dangChayAuto = 1;
                if ("  ".length() <= ((0x7A ^ 0x17 ^ (0x92 ^ 0xBE)) & (144 + 82 - 189 + 212 ^ 171 + 155 - 273 + 131 ^ -" ".length()))) {
                    return;
                }
            }
        } else if ((GameCanvas.var_et_0_do == null)) {
            this.var_cp_do.void_do();
        }
        if (fw.boolean_do(this.dangChayAuto ? 1 : 0)) {
            this.cfr_renamed_5();
        }
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public static fw cfr_renamed_0() {
        if ((var_fw_do == null)) {
            var_fw_do = new fw();
            return var_fw_do;
        }
        return var_fw_do;
    }

    public static void cfr_renamed_1() {
        bF.chuoiGiaTri = "e";
        em_0.chuoiGiaTri = "f";
        ThongTinNhanVat.chuoiGiaTri = "a";
        fe_0.chuoiGiaTri = GameCanvas.java_lang_String_do(chuoiGiaTri, -2);
    }

    private static void cfr_renamed_12() {
        mangSoNguyen = new int[32];
        -1 = -" ".length();
        1 = " ".length();
        16 = 0x70 ^ 0x60;
        0 = (134 + 56 - 126 + 104 ^ 31 + 114 - 128 + 127) & (139 + 4 - 121 + 150 ^ 123 + 121 - 231 + 135 ^ -" ".length());
        13 = 0xBD ^ 0xB0;
        11 = 0xA7 ^ 0xAC;
        9 = 6 ^ 0xF;
        99 = 0x1E ^ 0x7D;
        12 = 0x6F ^ 0x63;
        47 = 0x97 ^ 0xB8;
        2 = "  ".length();
        3 = "   ".length();
        6 = 0x82 ^ 0xBF ^ (0x5A ^ 0x61);
        50 = 0x8F ^ 0xBD;
        4 = 0x21 ^ 0x25;
        839 = 0xFFFFB377 & 0x4FCF;
        34 = 0x57 ^ 0x75;
        7 = 0x2D ^ 0x2A;
        10 = 0x96 ^ 0x9C;
        20 = 0xBA ^ 0xA0 ^ (0xBC ^ 0xB2);
        40 = 8 ^ 0x20;
        15 = 8 ^ 7;
        5 = 0x7D ^ 0x17 ^ (0x76 ^ 0x19);
        -2 = -"  ".length();
        24 = 0x4B ^ 0x53;
        56 = 0x11 ^ 0x29;
        48 = 0x8F ^ 0xBF;
        8 = 100 + 117 - 90 + 34 ^ 94 + 128 - 120 + 67;
        33 = 0x7A ^ 0x5B;
        70 = 77 + 66 - 34 + 85 ^ 9 + 42 - -5 + 76;
        35 = 0x28 ^ 0xB;
        30 = 0x86 ^ 0x98;
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

        public static void (byte by2, String string, String string2, String string3 != null) {
        if ((by2 == 0)) {
            var_cp_if = new ey(string);
            return;
        }
        if (fw.boolean_do(by2, 1)) {
            var_cp_if = new fd(string);
            return;
        }
        if (fw.boolean_do(by2, 2)) {
            ThongTinNhanVat.cfr_renamed_0().var_gx_int.cfr_renamed_0(string2);
            ThongTinNhanVat.cfr_renamed_0().var_gx_if.cfr_renamed_0(string3);
            ThongTinNhanVat.cfr_renamed_0().cfr_renamed_1();
            GameCanvas.cfr_renamed_1("Đăng ký thành công.");
            var_cp_if = null;
        }
    }

        public final void (Graphics graphics == null) {
        Object object;
        int n;
        GameCanvas.cfr_renamed_1(graphics);
        graphics.setColor(0);
        graphics.fillRect(0, 0, GameCanvas.var_int_byte, GameCanvas.this);
        graphics.translate(this.var_int_if, this.cfr_renamed_5);
        graphics.translate(-soLuong, -var_int_int);
        int n2 = 0;
        while ((n2 < this.var_byte_arr_do.length)) {
            byte by2 = this.var_byte_arr_do[n2];
            n = by2 / this.var_ep_if.cfr_renamed_1;
            this.var_ep_if.cfr_renamed_1(n, by2 % this.var_ep_if.cfr_renamed_1, n2 % this.var_byte_for * this.var_byte_int, n2 / this.var_byte_for * this.var_byte_int, graphics);
            ++n2;
            if ("  ".length() < (144 + 57 - 154 + 135 ^ 27 + 108 - -8 + 35)) continue;
            return;
        }
        n2 = 0;
        while ((n2 < this.var_java_util_Vector_do.size())) {
            bv bv2 = (bv)this.var_java_util_Vector_do.elementAt(n2);
            if (fw.boolean_do(n2, this.soLuongKhoa)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, bv2.var_byte_do * this.var_byte_int + this.var_byte_int / 2, bv2.cfr_renamed_1 * this.var_byte_int, 33);
                if (fw.boolean_do(coTrangThai ? 1 : 0)) {
                    var_ep_for.cfr_renamed_0(n2, bv2.var_byte_do * this.var_byte_int + this.var_byte_int / 2, bv2.cfr_renamed_1 * this.var_byte_int - 12 * bn_0.cfr_renamed_6, 0, 33, graphics);
                    if ((0xC1 ^ 0xC5) <= " ".length()) {
                        return;
                    }
                } else {
                    ci_0.cfr_renamed_0(graphics, bv2.var_short_do, bv2.var_byte_do * this.var_byte_int + this.var_byte_int / 2, bv2.cfr_renamed_1 * this.var_byte_int - 12 * bn_0.cfr_renamed_6, 33);
                    if (((5 ^ 0) & ~(0x5D ^ 0x58)) > 0) {
                        return;
                    }
                }
            } else {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, bv2.var_byte_do * this.var_byte_int + this.var_byte_int / 2, bv2.cfr_renamed_1 * this.var_byte_int - bv2.soLuong / 3, 33);
                bv2.soLuong += 1;
                if (fw.boolean_if(bv2.soLuong, 9)) {
                    bv2.soLuong = 0;
                }
            }
            ++n2;
            if (((0xB3 ^ 0xAD ^ (0x2E ^ 0xC)) & (0x7E ^ 0x54 ^ (0x76 ^ 0x60) ^ -" ".length())) == 0) continue;
            return;
        }
        Graphics graphics2 = graphics;
        fw fw2 = this;
        n = 0;
        while ((n < fw2.var_java_util_Vector_do.size())) {
            int n3;
            object = (bv)fw2.var_java_util_Vector_do.elementAt(n);
            int n4 = object.var_byte_do * fw2.var_byte_int;
            int n5 = object.cfr_renamed_1 * fw2.var_byte_int;
            if ((n5 < var_int_int + 50)) {
                n5 = var_int_int + 50;
            }
            if ((n5 > var_int_int + GameCanvas.this - 20)) {
                n5 = var_int_int + GameCanvas.this - 20;
            }
            if ((n4 < soLuong + 20)) {
                n4 = soLuong + 20;
            }
            if ((n4 > soLuong + GameCanvas.var_int_byte - 47)) {
                n4 = soLuong + GameCanvas.var_int_byte - 47;
            }
            String string = object.chuoiGiaTri;
            int n6 = n4 + 10;
            if (fw.boolean_do(n, fw2.soLuongKhoa)) {
                n3 = 70 * bn_0.cfr_renamed_6;
                } else {
                n3 = 35 * bn_0.cfr_renamed_6;
            }
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics2, string, n6, n5 - n3 - object.soLuong / 3, 2);
            ++n;
            if (" ".length() != ((45 + 150 - 93 + 101 ^ 79 + 138 - 124 + 49) & (0x3B ^ 0x2F ^ (0x2A ^ 0x7B) ^ -" ".length()))) continue;
            return;
        }
        object = graphics;
        n = 0;
        while ((n < var_java_util_Vector_if.size())) {
            eq_0 eq_02 = (eq_0)var_java_util_Vector_if.elementAt(n);
            if ((eq_02.var_int_if > soLuong - 30) && (eq_02.var_int_if < soLuong + 30 + GameCanvas.var_int_byte) && (eq_02.soLuong > var_int_int - 20) && (eq_02.soLuong < var_int_int + 20 + GameCanvas.var_int_char)) {
                object.drawImage(var_javax_microedition_lcdui_Image_arr_do[eq_02.cfr_renamed_3], eq_02.var_int_if, eq_02.soLuong, 3);
            }
            ++n;
            if (((0x7D ^ 0x4C) & ~(0x62 ^ 0x53)) > -" ".length()) continue;
            return;
        }
        GameCanvas.cfr_renamed_1(graphics);
        TienIchGame.cfr_renamed_0(graphics);
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                ey_0.cfr_renamed_0().cfr_renamed_8();
                return;
            }
            case 2: {
                eq.eq_do().cfr_renamed_0(6, "");
                return;
            }
            case 3: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_26();
                return;
            }
            case 4: {
                Form form = new Form(MenuChinhAvatar.bR);
                TextField textField = new TextField(MenuChinhAvatar.cM, "", 50, 3);
                form.append((Item)textField);
                form.append(MenuChinhAvatar.cr);
                Command command = new Command(MenuChinhAvatar.c, 4, 1);
                form.addCommand(command);
                Command command2 = new Command(MenuChinhAvatar.cfr_renamed_7, 2, 1);
                form.addCommand(command2);
                form.setCommandListener((CommandListener)new cR(command, textField));
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)form);
                return;
            }
            case 5: {
                eq.eq_do().cfr_renamed_0(3, (String)null);
                return;
            }
            case 6: {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_6();
                return;
            }
            case 7: {
                et_0.cfr_renamed_2();
                GameCanvas.var_et_0_do = new et_0();
                GameCanvas.var_et_0_do.cfr_renamed_4();
                ((dL)this).cfr_renamed_4 = null;
                return;
            }
            case 8: {
                fe_0.fe_0_do().cfr_renamed_30();
                return;
            }
            case 9: {
                AutoController.tatAuto();
                return;
            }
            case 11: {
                fe_0.fe_0_do().this();
                return;
            }
            case 12: {
                fe_0.fe_0_do().cfr_renamed_20();
                return;
            }
            case 13: {
                int n3;
                if (!(TienIchGame.dangChayAuto)) {
                    n3 = 1;
                    if (((0x8A ^ 0xB7) & ~(0x8C ^ 0xB1)) != ((0xEA ^ 0xBA) & ~(0x35 ^ 0x65))) {
                        return;
                    }
                } else {
                    n3 = 0;
                }
                TienIchGame.dangChayAuto = n3;
            }
        }
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    public fw() {
        this.dangChayAuto = 0;
        ap.void_do(MenuChinhAvatar.cfr_renamed_27);
        this.var_ep_do = ep.cfr_renamed_0("up", 13 * bn_0.cfr_renamed_6, 11 * bn_0.cfr_renamed_6);
        ap.cfr_renamed_0();
        ap.void_do(MenuChinhAvatar.cq);
        var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("sIc");
        var_javax_microedition_lcdui_Image_if = ap.javax_microedition_lcdui_Image_do("b_p");
        ap.cfr_renamed_0();
        this.var_ei_do = new ei(MenuChinhAvatar.Z, 0);
        ((dL)this).cfr_renamed_4 = this.var_ei_do;
    }

        public final void cfr_renamed_4() {
        this.var_int_if = (GameCanvas.var_int_byte - this.var_byte_for * this.var_byte_int) / 2;
        this.cfr_renamed_5 = (GameCanvas.this - GameCanvas.var_int_else - this.var_byte_if * this.var_byte_int) / 2;
        if (fw.boolean_if(this.var_int_if)) {
            this.var_int_if = 0;
        }
        if (fw.boolean_if(this.cfr_renamed_5)) {
            this.cfr_renamed_5 = 0;
        }
        cfr_renamed_10 = this.var_byte_for * this.var_byte_int - GameCanvas.var_int_byte;
        cfr_renamed_12 = this.var_byte_if * this.var_byte_int - GameCanvas.this;
        if (fw.boolean_if(cfr_renamed_10)) {
            soLuong = 0;
            cfr_renamed_10 = 0;
        }
        if (fw.boolean_if(cfr_renamed_12)) {
            var_int_int = 0;
            cfr_renamed_12 = 0;
        }
    }

    public final void cfr_renamed_8() {
        super.cfr_renamed_8();
        if (!(c.dangChayAuto)) {
            GameCanvas.cfr_renamed_8();
        }
        if ((ef_0.soLuongKhoa != -1)) {
            GameCanvas.cfr_renamed_8();
        }
        ((dL)this).cfr_renamed_4 = this.var_ei_do;
        if (fw.boolean_do(GameCanvas.var_boolean_byte ? 1 : 0)) {
            GameCanvas.var_et_0_do = new et_0();
            GameCanvas.var_et_0_do.cfr_renamed_4();
            ((dL)this).cfr_renamed_4 = null;
            if ((0x12 ^ 0 ^ (0xD3 ^ 0xC4)) <= 0) {
                return;
            }
        } else if ((AutoController.nhiemVuHienTai == null) && (dL.cfr_renamed_22 > 0) && fw.boolean_do(var_byte_do, 1)) {
            dN.cfr_renamed_0().void_do(GameCanvas.var_dL_do);
        }
        if ((GameCanvas.cfr_renamed_6 == 0)) {
            GameCanvas.cfr_renamed_6 = 1;
        }
        GameCanvas.var_java_util_Vector_if.removeAllElements();
        this.cfr_renamed_5();
        fe_0.var_int_try = -1;
        TienIchGame.cfr_renamed_8();
    }

    static {
        fw.cfr_renamed_12();
        coTrangThai = 0;
        var_javax_microedition_lcdui_Image_arr_do = new Image[2];
        var_java_util_Vector_if = new Vector();
    }

    public final void (ep ep2, byte[] byArray, Vector vector, int n, ei ei2 != null) {
        ci_0.cfr_renamed_1(839);
        AngelChip.duLieuNguoiChoi.var_short_do = (short)0;
        this.var_byte_int = (byte)n;
        this.var_ep_if = ep2;
        this.var_byte_arr_do = byArray;
        this.var_java_util_Vector_do = vector;
        this.var_byte_for = (byte)34;
        this.var_ei_if = ei2;
        if ((GameCanvas.cfr_renamed_16 == 0)) {
            ((dL)this).cfr_renamed_5 = ei2;
        }
        this.var_byte_if = (byte)(byArray.length / this.var_byte_for);
        ((dL)this).cfr_renamed_2 = null;
        this.cfr_renamed_4();
        this.var_cp_do = null;
        var_java_util_Vector_if.removeAllElements();
        int n2 = 0;
        while ((n2 < 7)) {
            var_java_util_Vector_if.addElement(new eq_0(n2 * this.var_byte_for * this.var_byte_int / 10 + 50, gc_0.int_do(10) * (this.var_byte_if * this.var_byte_int / 10) + 20, gc_0.int_do(2)));
            ++n2;
            if ("  ".length() != 0) continue;
            return;
        }
        cfr_renamed_21 = this.soLuongKhoa = 0;
        soLuong = this.soLuongKhoa;
        var_int_int = this.soLuongKhoa;
        cfr_renamed_26 = this.soLuongKhoa;
        this.cfr_renamed_5();
        if (fw.boolean_do(coTrangThai ? 1 : 0)) {
            ap.void_do(MenuChinhAvatar.cq);
            var_ep_for = new ep(ap.javax_microedition_lcdui_Image_do("k"), 40 * bn_0.cfr_renamed_6, 40 * bn_0.cfr_renamed_6);
            ap.cfr_renamed_0();
        }
    }

                        private static void cfr_renamed_11() {
        if (fw.boolean_if(cfr_renamed_26)) {
            cfr_renamed_26 = 0;
        }
        if ((cfr_renamed_26 > cfr_renamed_12)) {
            cfr_renamed_26 = cfr_renamed_12;
        }
        if (fw.boolean_if(cfr_renamed_21)) {
            cfr_renamed_21 = 0;
        }
        if ((cfr_renamed_21 > cfr_renamed_10)) {
            cfr_renamed_21 = cfr_renamed_10;
        }
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (!(GameCanvas.var_et_0_do != null) || !(et_0.coTrangThai)) {
                    String string;
                    Vector<ei> vector = new Vector<ei>();
                    if ((AutoController.nhiemVuHienTai != null)) {
                        vector.addElement(new ei("Tắt Auto", 9));
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                    } else {
                        vector.addElement(new ei("Menu Auto", 99, fe_0.fe_0_do()));
                    }
                    vector.addElement(new ei("Cài đặt up thuê", 12));
                    if (fw.boolean_do(TienIchGame.dangChayAuto ? 1 : 0)) {
                        string = "Hiện thông tin";
                        } else {
                        string = "Tắt thông tin";
                    }
                    vector.addElement(new ei(string, 13));
                    vector.addElement(new ei("Kiểu gõ TV", 47, fe_0.fe_0_do()));
                    if ((var_cp_if != null)) {
                        vector.addElement(new ei("Đăng ký", var_cp_if));
                    }
                    if ((GameCanvas.cfr_renamed_16 == 0)) {
                        vector.addElement(fe_0.fe_0_do().var_ei_for);
                    }
                    vector.addElement(new ei(MenuChinhAvatar.bN, 1));
                    vector.addElement(new ei(MenuChinhAvatar.cD, 2));
                    if (!(ThongTinNhanVat.var_boolean_int)) {
                        vector.addElement(new ei(MenuChinhAvatar.ca, 3));
                    }
                    vector.addElement(new ei(MenuChinhAvatar.aY, 6));
                    u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
                }
                return;
            }
            case 1: {
                fe_0.fe_0_do().cfr_renamed_8();
                var_ep_for = null;
            }
        }
    }

        public final void (Graphics graphics != null) {
        this.cfr_renamed_1(graphics);
        if (!(GameCanvas.var_et_0_do != null) || !(et_0.coTrangThai)) {
            super.cfr_renamed_0(graphics);
        }
    }
}

