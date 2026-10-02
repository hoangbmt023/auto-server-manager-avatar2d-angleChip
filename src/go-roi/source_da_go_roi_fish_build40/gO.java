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

public final class gO
extends en {
    private int cfr_renamed_5;
    private int cfr_renamed_6;
    public static byte var_byte_do;
    public static gO instance;
    public static String chuoiGiaTri;
    private cu_0 var_cu_0_if;
    private int cfr_renamed_7;
    public static de var_de_do;
    private static int cfr_renamed_8;
    private long soXu;
    private static final int[] mangSoNguyen;
    private static int cfr_renamed_13;
    private static int cfr_renamed_9;
    public cu_0 var_cu_0_do;
    private static Vector var_java_util_Vector_do;
    private static int cfr_renamed_14;
    private boolean coKichHoat;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    public int soLuong;
    private static int cfr_renamed_23;
    public static int var_int_if;
    private long var_long_if;
    public de var_de_if;
    private int cfr_renamed_24;
    private int cfr_renamed_22;
    private byte var_byte_if = (byte)16;
    private byte var_byte_for;
    private fl_0 var_fl_0_if;
    private int cfr_renamed_17;
    private byte[] var_byte_arr_do;
    boolean dangChayAuto = 0;
    private static Image var_javax_microedition_lcdui_Image_do;
    public static boolean coTrangThai;
    private static int cfr_renamed_29;
    private Vector var_java_util_Vector_if;
    public static int soLuongKhoa;
    public fl_0 var_fl_0_do;
    private byte var_byte_int;
    private static int cfr_renamed_26;
    private static int cfr_renamed_27;
    private static Image var_javax_microedition_lcdui_Image_if;
    public int var_int_int;
    public int cfr_renamed_4;
    private static cu_0 var_cu_0_for;

    public final void (Graphics graphics == null) {
        this.cfr_renamed_0(graphics);
        if (!(GameCanvas.var_fv_do != null) || gO.boolean_for(fv.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_1(graphics);
        }
    }

        private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

            public final void cfr_renamed_4() {
        super.cfr_renamed_4();
        if (gO.boolean_for(n_0.dangChayAuto ? 1 : 0)) {
            GameCanvas.cfr_renamed_7();
        }
        if ((fh.var_int_else != -1)) {
            GameCanvas.cfr_renamed_7();
        }
        ((en)this).cfr_renamed_5 = this.var_fl_0_do;
        if ((GameCanvas.coKichHoat)) {
            GameCanvas.var_fv_do = new fv();
            GameCanvas.var_fv_do.cfr_renamed_13();
            ((en)this).cfr_renamed_5 = null;
            } else if ((AutoController.nhiemVuHienTai == null) && (en.cfr_renamed_30 == null) && gO.boolean_do(var_byte_do, 1)) {
            ep.cfr_renamed_1().void_do(GameCanvas.var_en_do);
        }
        if (gO.boolean_for(GameCanvas.var_int_byte)) {
            GameCanvas.var_int_byte = 1;
        }
        GameCanvas.var_java_util_Vector_if.removeAllElements();
        this.cfr_renamed_13();
        go_0.var_int_try = -1;
        TienIchGame.cfr_renamed_7();
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                gA.cfr_renamed_1().cfr_renamed_4();
                return;
            }
            case 2: {
                ft_0.ft_0_do().cfr_renamed_1(6, "");
                return;
            }
            case 3: {
                go_0.go_0_do();
                go_0.cfr_renamed_26();
                return;
            }
            case 4: {
                Form form = new Form(MenuChinhAvatar.H);
                TextField textField = new TextField(MenuChinhAvatar.at, "", 50, 3);
                form.append((Item)textField);
                form.append(MenuChinhAvatar.aU);
                Command command = new Command(MenuChinhAvatar.ct, 4, 1);
                form.addCommand(command);
                Command command2 = new Command(MenuChinhAvatar.by, 2, 1);
                form.addCommand(command2);
                form.setCommandListener((CommandListener)new ah_0(command, textField));
                Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)form);
                return;
            }
            case 5: {
                ft_0.ft_0_do().cfr_renamed_1(3, (String)null);
                return;
            }
            case 6: {
                go_0.go_0_do();
                go_0.cfr_renamed_22();
                return;
            }
            case 7: {
                fv.cfr_renamed_8();
                GameCanvas.var_fv_do = new fv();
                GameCanvas.var_fv_do.cfr_renamed_13();
                ((en)this).cfr_renamed_5 = null;
                return;
            }
            case 8: {
                go_0.go_0_do().cfr_renamed_2();
                return;
            }
            case 9: {
                AutoController.tatAuto();
                return;
            }
            case 10: {
                go_0.go_0_do().cfr_renamed_25();
                return;
            }
            case 11: {
                go_0.go_0_do().cfr_renamed_30();
                return;
            }
            case 12: {
                go_0.go_0_do().cfr_renamed_28();
                return;
            }
            case 13: {
                int n3;
                if (gO.boolean_for(TienIchGame.cfr_renamed_7 ? 1 : 0)) {
                    n3 = 1;
                    if ((0x3B ^ 0x3F) == 0) {
                        return;
                    }
                } else {
                    n3 = 0;
                }
                TienIchGame.cfr_renamed_7 = n3;
            }
        }
    }

    public final void cfr_renamed_2() {
        this.cfr_renamed_4 = (GameCanvas.soLuongKhoa - this.var_byte_for * this.var_byte_if) / 2;
        this.var_int_int = (GameCanvas.var_int_int - GameCanvas.this - this.var_byte_int * this.var_byte_if) / 2;
        if ((this.cfr_renamed_4 != null)) {
            this.cfr_renamed_4 = 0;
        }
        if ((this.var_int_int != null)) {
            this.var_int_int = 0;
        }
        cfr_renamed_27 = this.var_byte_for * this.var_byte_if - GameCanvas.soLuongKhoa;
        cfr_renamed_13 = this.var_byte_int * this.var_byte_if - GameCanvas.var_int_int;
        if ((cfr_renamed_27 != null)) {
            soLuongKhoa = 0;
            cfr_renamed_27 = 0;
        }
        if ((cfr_renamed_13 != null)) {
            var_int_if = 0;
            cfr_renamed_13 = 0;
        }
    }

    private static void cfr_renamed_5() {
        mangSoNguyen = new int[33];
        -1 = -" ".length();
        1 = " ".length();
        16 = 191 + 33 - 63 + 50 ^ 181 + 144 - 297 + 167;
        0 = (0x8C ^ 0xBC) & ~(0x10 ^ 0x20);
        13 = 0x90 ^ 0x9D;
        11 = 0x9A ^ 0x89 ^ (0xE ^ 0x16);
        9 = 7 ^ 0x51 ^ (0x76 ^ 0x29);
        99 = 0x1D ^ 0x7E;
        111 = 0x75 ^ 0x1A;
        12 = 0x27 ^ 0x64 ^ (0x25 ^ 0x6A);
        47 = 0x16 ^ 0xF ^ (0xAD ^ 0x9B);
        2 = "  ".length();
        3 = "   ".length();
        6 = 0xF8 ^ 0x99 ^ (0x74 ^ 0x13);
        50 = 0x5A ^ 0x49 ^ (4 ^ 0x25);
        4 = 0x8F ^ 0x8B;
        839 = 0xFFFF93D7 & 0x6F6F;
        34 = 0x1C ^ 0x68 ^ (0x54 ^ 2);
        7 = 0x9F ^ 0x98;
        10 = 0x9E ^ 0x94;
        20 = 0x74 ^ 0x60;
        40 = 0xCE ^ 0xC6 ^ (0x75 ^ 0x55);
        15 = 0xC0 ^ 0xBA ^ (0x29 ^ 0x5C);
        5 = 0x25 ^ 0x20 ^ (0x32 ^ 0x6A) & ~(0x40 ^ 0x18);
        -2 = -"  ".length();
        24 = 87 + 127 - 55 + 2 ^ 89 + 136 - 108 + 68;
        56 = 0xA8 ^ 0x88 ^ (0x12 ^ 0xA);
        48 = 0xA8 ^ 0x98;
        8 = 0x5F ^ 0x57;
        33 = 0xC7 ^ 0x96 ^ (0xD ^ 0x7D);
        70 = 0x5D ^ 0x1B;
        35 = 133 + 71 - 201 + 140 ^ 148 + 64 - 148 + 108;
        30 = 40 + 79 - 97 + 116 ^ 38 + 96 - 105 + 119;
    }

    static {
        gO.cfr_renamed_5();
        coTrangThai = 0;
        var_javax_microedition_lcdui_Image_arr_do = new Image[2];
        var_java_util_Vector_do = new Vector();
    }

    public gO() {
        e.void_do(MenuChinhAvatar.bo);
        this.var_cu_0_do = cu_0.cfr_renamed_1("up", 13 * dF.cfr_renamed_12, 11 * dF.cfr_renamed_12);
        e.cfr_renamed_1();
        e.void_do(MenuChinhAvatar.bE);
        var_javax_microedition_lcdui_Image_if = e.javax_microedition_lcdui_Image_do("sIc");
        var_javax_microedition_lcdui_Image_do = e.javax_microedition_lcdui_Image_do("b_p");
        e.cfr_renamed_1();
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.bR, 0);
        ((en)this).cfr_renamed_5 = this.var_fl_0_do;
    }

    private static void cfr_renamed_8() {
        if ((cfr_renamed_29 != null)) {
            cfr_renamed_29 = 0;
        }
        if ((cfr_renamed_29 > cfr_renamed_13)) {
            cfr_renamed_29 = cfr_renamed_13;
        }
        if ((cfr_renamed_14 != null)) {
            cfr_renamed_14 = 0;
        }
        if ((cfr_renamed_14 > cfr_renamed_27)) {
            cfr_renamed_14 = cfr_renamed_27;
        }
    }

        private void cfr_renamed_13() {
        c_0 c_02 = (c_0)this.var_java_util_Vector_if.elementAt(this.soLuong);
        cfr_renamed_14 = c_02.var_byte_do * this.var_byte_if - GameCanvas.soLuongKhoa / 2;
        cfr_renamed_29 = c_02.cfr_renamed_0 * this.var_byte_if - GameCanvas.var_int_int / 2;
        gO.cfr_renamed_8();
    }

    public static void cfr_renamed_3() {
        dR.tenNhanVat = "e";
        fo.chuoiGiaTri = "f";
        ThongTinNhanVat.tenNhanVat = "a";
        go_0.chuoiGiaTri = GameCanvas.java_lang_String_do(chuoiGiaTri, -2);
    }

    public final void (Graphics graphics != null) {
        Object object;
        int n;
        GameCanvas.hienThongBaoPopup(graphics);
        graphics.setColor(0);
        graphics.fillRect(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_int);
        graphics.translate(this.cfr_renamed_4, this.var_int_int);
        graphics.translate(-soLuongKhoa, -var_int_if);
        int n2 = 0;
        while ((n2 < this.var_byte_arr_do.length)) {
            byte by2 = this.var_byte_arr_do[n2];
            n = by2 / this.var_cu_0_if.cfr_renamed_0;
            this.var_cu_0_if.cfr_renamed_1(n, by2 % this.var_cu_0_if.cfr_renamed_0, n2 % this.var_byte_for * this.var_byte_if, n2 / this.var_byte_for * this.var_byte_if, graphics);
            ++n2;
            if ((0x49 ^ 0x4D) > 0) continue;
            return;
        }
        n2 = 0;
        while ((n2 < this.var_java_util_Vector_if.size())) {
            c_0 c_02 = (c_0)this.var_java_util_Vector_if.elementAt(n2);
            if (gO.boolean_do(n2, this.soLuong)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, c_02.var_byte_do * this.var_byte_if + this.var_byte_if / 2, c_02.cfr_renamed_0 * this.var_byte_if, 33);
                if ((coTrangThai)) {
                    var_cu_0_for.cfr_renamed_1(n2, c_02.var_byte_do * this.var_byte_if + this.var_byte_if / 2, c_02.cfr_renamed_0 * this.var_byte_if - 12 * dF.cfr_renamed_12, 0, 33, graphics);
                    if (((0x15 ^ 0x1E) & ~(0x1E ^ 0x15)) != 0) {
                        return;
                    }
                } else {
                    aa_0.cfr_renamed_1(graphics, c_02.var_short_do, c_02.var_byte_do * this.var_byte_if + this.var_byte_if / 2, c_02.cfr_renamed_0 * this.var_byte_if - 12 * dF.cfr_renamed_12, 33);
                    if (((82 + 149 - 179 + 100 ^ 42 + 12 - 35 + 161) & (0x96 ^ 0x9E ^ (0x4B ^ 0x6F) ^ -" ".length())) < 0) {
                        return;
                    }
                }
            } else {
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, c_02.var_byte_do * this.var_byte_if + this.var_byte_if / 2, c_02.cfr_renamed_0 * this.var_byte_if - c_02.soLuong / 3, 33);
                c_02.soLuong += 1;
                if (gO.boolean_if(c_02.soLuong, 9)) {
                    c_02.soLuong = 0;
                }
            }
            ++n2;
            if ("  ".length() != (0x11 ^ 0x70 ^ (0x4F ^ 0x2A))) continue;
            return;
        }
        Graphics graphics2 = graphics;
        gO gO2 = this;
        n = 0;
        while ((n < gO2.var_java_util_Vector_if.size())) {
            int n3;
            object = (c_0)gO2.var_java_util_Vector_if.elementAt(n);
            int n4 = object.var_byte_do * gO2.var_byte_if;
            int n5 = object.cfr_renamed_0 * gO2.var_byte_if;
            if ((n5 < var_int_if + 50)) {
                n5 = var_int_if + 50;
            }
            if ((n5 > var_int_if + GameCanvas.var_int_int - 20)) {
                n5 = var_int_if + GameCanvas.var_int_int - 20;
            }
            if ((n4 < soLuongKhoa + 20)) {
                n4 = soLuongKhoa + 20;
            }
            if ((n4 > soLuongKhoa + GameCanvas.soLuongKhoa - 47)) {
                n4 = soLuongKhoa + GameCanvas.soLuongKhoa - 47;
            }
            String string = object.chuoiGiaTri;
            int n6 = n4 + 10;
            if (gO.boolean_do(n, gO2.soLuong)) {
                n3 = 70 * dF.cfr_renamed_12;
                if (-" ".length() >= 0) {
                    return;
                }
            } else {
                n3 = 35 * dF.cfr_renamed_12;
            }
            GameCanvas.var_fz_0_new.cfr_renamed_1(graphics2, string, n6, n5 - n3 - object.soLuong / 3, 2);
            ++n;
            if ((0x14 ^ 0x10) > 0) continue;
            return;
        }
        object = graphics;
        n = 0;
        while ((n < var_java_util_Vector_do.size())) {
            fs fs2 = (fs)var_java_util_Vector_do.elementAt(n);
            if ((fs2.soLuong > soLuongKhoa - 30) && (fs2.soLuong < soLuongKhoa + 30 + GameCanvas.soLuongKhoa) && (fs2.var_int_if > var_int_if - 20) && (fs2.var_int_if < var_int_if + 20 + GameCanvas.var_int_case)) {
                object.drawImage(var_javax_microedition_lcdui_Image_arr_do[fs2.cfr_renamed_2], fs2.soLuong, fs2.var_int_if, 3);
            }
            ++n;
            return;
        }
        GameCanvas.hienThongBaoPopup(graphics);
        TienIchGame.cfr_renamed_1(graphics);
    }

    public final void cfr_renamed_6() {
        ++this.soXu;
        if (!(GameCanvas.var_fv_do != null) || gO.boolean_for(fv.dangChayAuto ? 1 : 0)) {
            super.cfr_renamed_6();
        }
        this.dangChayAuto = 0;
        if ((GameCanvas.boolean_do(0, 0, GameCanvas.soLuongKhoa, GameCanvas.var_int_case))) {
            int n;
            int n2 = GameCanvas.int_if();
            int n3 = GameCanvas.int_for();
            if ((GameCanvas.var_fv_do == null) && (GameCanvas.coTrangThai)) {
                GameCanvas.coTrangThai = 0;
                n = 0;
                while ((n < this.var_java_util_Vector_if.size())) {
                    c_0 c_02 = (c_0)this.var_java_util_Vector_if.elementAt(n);
                    if ((GameCanvas.boolean_do(this.cfr_renamed_4 + c_02.var_byte_do * this.var_byte_if + this.var_byte_if / 2 - 24 * dF.cfr_renamed_12 - soLuongKhoa, this.var_int_int + c_02.cfr_renamed_0 * this.var_byte_if - 56 * dF.cfr_renamed_12 - var_int_if, 48 * dF.cfr_renamed_12, 56 * dF.cfr_renamed_12))) {
                        this.soLuong = n;
                        return;
                    }
                    ++n;
                    if ("  ".length() < (7 ^ 0x2B ^ (4 ^ 0x2C))) continue;
                    return;
                }
            }
            if ((GameCanvas.var_boolean_case)) {
                if (gO.boolean_for(GameCanvas.var_int_goto % 3)) {
                    this.cfr_renamed_22 = GameCanvas.soLuong;
                    this.cfr_renamed_5 = GameCanvas.var_int_try;
                    this.var_long_if = this.soXu;
                }
                this.cfr_renamed_17 = 0;
                this.cfr_renamed_6 = 0;
                if (gO.boolean_for(this.coKichHoat ? 1 : 0)) {
                    this.coKichHoat = 1;
                    this.cfr_renamed_24 = soLuongKhoa;
                    this.cfr_renamed_7 = var_int_if;
                }
                cfr_renamed_29 = this.cfr_renamed_7 + n3;
                cfr_renamed_14 = this.cfr_renamed_24 + n2;
                gO.cfr_renamed_8();
                var_int_if = cfr_renamed_29;
                soLuongKhoa = cfr_renamed_14;
            }
            if ((GameCanvas.var_boolean_new)) {
                n = (int)(this.soXu - this.var_long_if);
                int n4 = this.cfr_renamed_22 - GameCanvas.soLuong;
                if ((n < 10)) {
                    if (gO.boolean_int(cfr_renamed_29) && (cfr_renamed_29 < cfr_renamed_13)) {
                        this.cfr_renamed_17 = n4 / n * 10;
                    }
                    n4 = this.cfr_renamed_5 - GameCanvas.var_int_try;
                    if (gO.boolean_int(cfr_renamed_14) && (cfr_renamed_14 < cfr_renamed_27)) {
                        this.cfr_renamed_6 = n4 / n * 10;
                    }
                }
                this.var_long_if = -1L;
                this.coKichHoat = 0;
                if ((hg.int_do(n2) < 10) && (hg.int_do(n3) < 10)) {
                    c_0 c_03 = (c_0)this.var_java_util_Vector_if.elementAt(this.soLuong);
                    if ((GameCanvas.boolean_do(this.cfr_renamed_4 + c_03.var_byte_do * this.var_byte_if + this.var_byte_if / 2 - 24 * dF.cfr_renamed_12 - soLuongKhoa, this.var_int_int + c_03.cfr_renamed_0 * this.var_byte_if - 56 * dF.cfr_renamed_12 - var_int_if, 48 * dF.cfr_renamed_12, 56 * dF.cfr_renamed_12))) {
                        this.var_fl_0_if.cfr_renamed_0();
                        return;
                    }
                    cfr_renamed_14 = GameCanvas.var_int_try + soLuongKhoa - GameCanvas.cfr_renamed_15;
                    cfr_renamed_29 = GameCanvas.soLuong + var_int_if - GameCanvas.var_int_char;
                    gO.cfr_renamed_8();
                }
            }
        }
        if ((this.var_de_if == null)) {
            if (gO.boolean_for(GameCanvas.boolean_do(2) ? 1 : 0) && gO.boolean_for(GameCanvas.boolean_do(4) ? 1 : 0)) {
                if (!gO.boolean_for(GameCanvas.boolean_do(8) ? 1 : 0) || (GameCanvas.boolean_do(6))) {
                    this.soLuong += 1;
                    if (gO.boolean_if(this.soLuong, this.var_java_util_Vector_if.size())) {
                        this.soLuong = 0;
                    }
                    this.dangChayAuto = 1;
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            } else {
                this.soLuong -= 1;
                if ((this.soLuong != null)) {
                    this.soLuong = this.var_java_util_Vector_if.size() - 1;
                }
                this.dangChayAuto = 1;
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        } else if ((GameCanvas.var_fv_do == null)) {
            this.var_de_if.void_do();
        }
        if ((this.dangChayAuto)) {
            this.cfr_renamed_13();
        }
    }

        public final void cfr_renamed_7() {
        if ((this.cfr_renamed_17 != 0)) {
            if (!gO.boolean_int(var_int_if) || (var_int_if > cfr_renamed_13)) {
                this.cfr_renamed_17 -= this.cfr_renamed_17 / 4;
                var_int_if += this.cfr_renamed_17 / 20;
                if ((this.cfr_renamed_17 / 10 <= 1)) {
                    this.cfr_renamed_17 = 0;
                }
            }
            cfr_renamed_29 = var_int_if += this.cfr_renamed_17 / 10;
            this.cfr_renamed_17 -= this.cfr_renamed_17 / 10;
            if (gO.boolean_for(this.cfr_renamed_17 / 10)) {
                this.cfr_renamed_17 = 0;
            }
        }
        if ((var_int_if != null)) {
            cfr_renamed_29 = 0;
            this.cfr_renamed_17 = 0;
            } else if ((var_int_if > cfr_renamed_13)) {
            cfr_renamed_29 = cfr_renamed_13;
            this.cfr_renamed_17 = 0;
        }
        if ((this.cfr_renamed_6 != 0)) {
            if (!gO.boolean_int(soLuongKhoa) || (soLuongKhoa > cfr_renamed_27)) {
                this.cfr_renamed_6 -= this.cfr_renamed_6 / 4;
                soLuongKhoa += this.cfr_renamed_6 / 20;
                if ((this.cfr_renamed_6 / 10 <= 1)) {
                    this.cfr_renamed_6 = 0;
                }
            }
            this.cfr_renamed_6 -= this.cfr_renamed_6 / 10;
            cfr_renamed_14 = soLuongKhoa += this.cfr_renamed_6 / 10;
            if (gO.boolean_for(this.cfr_renamed_6 / 10)) {
                this.cfr_renamed_6 = 0;
            }
        }
        if ((soLuongKhoa != null)) {
            cfr_renamed_14 = 0;
            this.cfr_renamed_6 = 0;
            if ((0x7B ^ 0x7F) < "  ".length()) {
                return;
            }
        } else if ((soLuongKhoa > cfr_renamed_27)) {
            cfr_renamed_14 = cfr_renamed_27;
            this.cfr_renamed_6 = 0;
        }
        if ((var_int_if != cfr_renamed_29)) {
            cfr_renamed_26 = cfr_renamed_29 - var_int_if << 2;
            var_int_if += (cfr_renamed_23 += cfr_renamed_26) >> 4;
            cfr_renamed_23 &= 15;
        }
        if ((soLuongKhoa != cfr_renamed_14)) {
            cfr_renamed_8 = cfr_renamed_14 - soLuongKhoa << 2;
            soLuongKhoa += (cfr_renamed_9 += cfr_renamed_8) >> 4;
            cfr_renamed_9 &= 15;
        }
        if (!gO.boolean_int(cfr_renamed_29) || (var_int_if != null)) {
            var_int_if = 0;
            cfr_renamed_29 = 0;
        }
        if (!(cfr_renamed_29 <= cfr_renamed_13) || (var_int_if > cfr_renamed_13)) {
            cfr_renamed_29 = var_int_if = cfr_renamed_13;
        }
        if (!gO.boolean_int(cfr_renamed_14) || (soLuongKhoa != null)) {
            soLuongKhoa = 0;
            cfr_renamed_14 = 0;
        }
        if (!(cfr_renamed_14 <= cfr_renamed_27) || (soLuongKhoa > cfr_renamed_27)) {
            cfr_renamed_14 = soLuongKhoa = cfr_renamed_27;
        }
        int n = 0;
        while ((n < var_java_util_Vector_do.size())) {
            int n2;
            fs fs2 = (fs)var_java_util_Vector_do.elementAt(n);
            int n3 = fs2.soLuong;
            int n4 = fs2.cfr_renamed_2;
            if (gO.boolean_do(GameCanvas.var_int_goto % 5, 1)) {
                n2 = 1;
                if (" ".length() != " ".length()) {
                    return;
                }
            } else {
                n2 = 0;
            }
            fs2.soLuong = n3 - (n4 + n2);
            if ((fs2.soLuong < -this.cfr_renamed_4 - 50)) {
                fs2.soLuong = this.cfr_renamed_4 + hg.int_new(4) * 50 + this.var_byte_for * this.var_byte_if;
                fs2.var_int_if = hg.int_new(10) * (this.var_byte_int * this.var_byte_if / 10) + 10;
                fs2.cfr_renamed_2 = hg.int_new(2);
            }
            ++n;
            if (((0x5B ^ 0xC ^ (0x3D ^ 0x39)) & (0x67 ^ 0x2F ^ (0x26 ^ 0x3D) ^ -" ".length())) >= 0) continue;
            return;
        }
    }

    private static boolean boolean_for(int n) {
        return n == 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                if (!(GameCanvas.var_fv_do != null) || gO.boolean_for(fv.dangChayAuto ? 1 : 0)) {
                    String string;
                    Vector<fl_0> vector = new Vector<fl_0>();
                    if ((AutoController.nhiemVuHienTai != null)) {
                        vector.addElement(new fl_0("Tắt Auto", 9));
                        if (-(0x41 ^ 0x45) >= 0) {
                            return;
                        }
                    } else {
                        vector.addElement(new fl_0("Menu Auto", 99, go_0.go_0_do()));
                        if (gO.boolean_do(TienIchGame.var_byte_do, 1)) {
                            vector.addElement(new fl_0("Đánh Boss", 111, go_0.go_0_do()));
                        }
                    }
                    vector.addElement(new fl_0("Cài đặt up thuê", 12));
                    if ((TienIchGame.cfr_renamed_7)) {
                        string = "Hiện thông tin";
                        if (-"  ".length() > 0) {
                            return;
                        }
                    } else {
                        string = "Tắt thông tin";
                    }
                    vector.addElement(new fl_0(string, 13));
                    vector.addElement(new fl_0("Kiểu gõ TV", 47, go_0.go_0_do()));
                    if ((var_de_do != null)) {
                        vector.addElement(new fl_0("Đăng ký", var_de_do));
                    }
                    if (gO.boolean_for(GameCanvas.cfr_renamed_12)) {
                        vector.addElement(go_0.go_0_do().var_fl_0_for);
                    }
                    vector.addElement(new fl_0(MenuChinhAvatar.bu, 1));
                    vector.addElement(new fl_0(MenuChinhAvatar.bD, 2));
                    if (gO.boolean_for(ThongTinNhanVat.coKichHoat ? 1 : 0)) {
                        vector.addElement(new fl_0(MenuChinhAvatar.aj, 3));
                    }
                    vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_34, 6));
                    aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
                }
                return;
            }
            case 1: {
                go_0.go_0_do().cfr_renamed_4();
                var_cu_0_for = null;
            }
        }
    }

    public final void (cu_0 cu_02, byte[] byArray, Vector vector, int n, fl_0 fl_02 == null) {
        aa_0.cfr_renamed_0(839);
        AngelChip.duLieuNguoiChoi.soLuong = 0;
        this.var_byte_if = (byte)n;
        this.var_cu_0_if = cu_02;
        this.var_byte_arr_do = byArray;
        this.var_java_util_Vector_if = vector;
        this.var_byte_for = (byte)34;
        this.var_fl_0_if = fl_02;
        if (gO.boolean_for(GameCanvas.cfr_renamed_12)) {
            ((en)this).cfr_renamed_3 = fl_02;
        }
        this.var_byte_int = (byte)(byArray.length / this.var_byte_for);
        ((en)this).cfr_renamed_4 = null;
        this.cfr_renamed_2();
        this.var_de_if = null;
        var_java_util_Vector_do.removeAllElements();
        int n2 = 0;
        while ((n2 < 7)) {
            var_java_util_Vector_do.addElement(new fs(n2 * this.var_byte_for * this.var_byte_if / 10 + 50, hg.int_new(10) * (this.var_byte_int * this.var_byte_if / 10) + 20, hg.int_new(2)));
            ++n2;
            if (-" ".length() <= (0x92 ^ 0x96)) continue;
            return;
        }
        cfr_renamed_14 = this.soLuong = 0;
        soLuongKhoa = this.soLuong;
        var_int_if = this.soLuong;
        cfr_renamed_29 = this.soLuong;
        this.cfr_renamed_13();
        if ((coTrangThai)) {
            e.void_do(MenuChinhAvatar.bE);
            var_cu_0_for = new cu_0(e.javax_microedition_lcdui_Image_do("k"), 40 * dF.cfr_renamed_12, 40 * dF.cfr_renamed_12);
            e.cfr_renamed_1();
        }
    }

            private static boolean boolean_int(int n) {
        return n >= 0;
    }

    public static void (byte by2, String string, String string2, String string3 == null) {
        if (gO.boolean_for(by2)) {
            var_de_do = new gb(string);
            return;
        }
        if (gO.boolean_do(by2, 1)) {
            var_de_do = new de_0(string);
            return;
        }
        if (gO.boolean_do(by2, 2)) {
            ThongTinNhanVat.cfr_renamed_1().var_ey_0_for.cfr_renamed_1(string2);
            ThongTinNhanVat.cfr_renamed_1().var_ey_0_int.cfr_renamed_1(string3);
            ThongTinNhanVat.cfr_renamed_1().cfr_renamed_13();
            GameCanvas.cfr_renamed_1("Đăng ký thành công.");
            var_de_do = null;
        }
    }

        public static gO cfr_renamed_1() {
        if ((instance == null)) {
            instance = new gO();
            return instance;
        }
        return instance;
    }

            public final void void_if() {
        if (gO.boolean_for(coTrangThai ? 1 : 0) && (GameCanvas.var_en_do != gv_0.var_gv_0_do)) {
            go_0.go_0_do().cfr_renamed_4();
            var_cu_0_for = null;
            return;
        }
        go_0.go_0_do();
        go_0.cfr_renamed_22();
    }
}

