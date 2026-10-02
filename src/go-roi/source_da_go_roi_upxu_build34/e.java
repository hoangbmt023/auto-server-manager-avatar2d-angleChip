/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class e
extends dL {
    private int var_int_if;
    Vector var_java_util_Vector_do;
    private ei var_ei_do;
    private short var_short_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static Image var_javax_microedition_lcdui_Image_if;
    private static Image var_javax_microedition_lcdui_Image_for;
    private static final int[] mangSoNguyen;
    public static ep var_ep_do;
    public static byte var_byte_do;
    private static Image cfr_renamed_12;
    private int soLuongKhoa;
    int soLuong;
    private int var_int_int = 0;
    public static byte var_byte_if;
    public static e var_e_do;
    private int cfr_renamed_5;
    public static byte var_byte_for;
    private static Image cfr_renamed_11;
    private int cfr_renamed_2;
    private int cfr_renamed_15 = 0;
    public byte var_byte_int;

    public final void (Vector vector != null) {
        this.var_java_util_Vector_do = vector;
    }

        public final void (int n, boolean bl != null) {
        if ((bl) && (this.cfr_renamed_17 == n) && (this.var_ei_do != null)) {
            this.var_ei_do.cfr_renamed_1();
        }
        if (e.boolean_do(n) && e.boolean_do(n, this.var_java_util_Vector_do.size())) {
            super.cfr_renamed_0(n, bl);
        }
    }

    public static void void_do() {
        GameCanvas.hienThongBaoPopup("Hiện tại bạn không đủ Xèng để tham gia màn chơi, bạn có muốn nạp thêm Xèng không?", new fp_0());
    }

        private static boolean boolean_do(int n) {
        return n >= 0;
    }

    protected final void cfr_renamed_1() {
        GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.dj, new fl_0(this), 0);
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

        private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

        private void (Graphics graphics > 0) {
        int n;
        graphics.translate(this.cfr_renamed_2, this.soLuongKhoa);
        graphics.translate(0, -ex.cfr_renamed_18);
        int n2 = ex.cfr_renamed_18 / this.var_short_do * this.cfr_renamed_5 - this.cfr_renamed_5;
        if (e.boolean_if(n2)) {
            n2 = 0;
        }
        if ((n = n2 + GameCanvas.var_int_char / this.var_short_do * this.cfr_renamed_5 + (this.cfr_renamed_5 << 1) + this.cfr_renamed_5 > this.var_java_util_Vector_do.size())) {
            n = this.var_java_util_Vector_do.size();
        }
        while (e.boolean_do(n2, n)) {
            int n3 = n2 % this.cfr_renamed_5 * this.var_short_do;
            int n4 = n2 / this.cfr_renamed_5 * this.var_short_do;
            eu_0 eu_02 = (eu_0)this.var_java_util_Vector_do.elementAt(n2);
            if ((!(GameCanvas.coTrangThai) || e.cfr_renamed_4((int)((dL)this).cfr_renamed_5)) && (n2 == this.cfr_renamed_17)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, n3, n4, 3);
            }
            var_ep_do.cfr_renamed_0(eu_02.var_byte_do, n3, n4, 0, 3, graphics);
            graphics.drawImage(var_javax_microedition_lcdui_Image_for, n3 - this.var_short_do / 4, n4 - 30 * bn_0.cfr_renamed_6, 3);
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, "" + eu_02.cfr_renamed_3, n3 - this.var_short_do / 4, n4 - 30 * bn_0.cfr_renamed_6 - bn_0.cfr_renamed_8 / 2, 2);
            if ((eu_02.soLuong > 0)) {
                GameCanvas.var_ew_int.cfr_renamed_0(graphics, eu_02.chuoiGiaTri, n3, n4 - 30 * bn_0.cfr_renamed_6 - bn_0.cfr_renamed_8 / 2, 2);
            }
            if ((var_byte_for == var_byte_if) && e.boolean_do(eu_02.var_byte_if, 4)) {
                graphics.drawImage(cfr_renamed_11, n3 + this.var_short_do / 4, n4 - 30 * bn_0.cfr_renamed_6, 3);
                GameCanvas.var_ew_do.cfr_renamed_0(graphics, "" + eu_02.var_byte_if, n3 + this.var_short_do / 4, n4 - 30 * bn_0.cfr_renamed_6 - bn_0.cfr_renamed_8 / 2, 2);
            }
            if ((eu_02.coTrangThai)) {
                graphics.drawImage(cfr_renamed_11, n3 - this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, n3 - this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
            }
            if ((eu_02.dangChayAuto)) {
                graphics.drawImage(cfr_renamed_11, n3 + this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
                graphics.drawImage(cfr_renamed_12, n3 + this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
            }
            ++n2;
            if ("   ".length() >= -" ".length()) continue;
            return;
        }
    }

    public final void void_for() {
    }

            static {
        e.cfr_renamed_11();
        var_byte_if = (byte)1;
        var_byte_do = (byte)2;
        var_byte_for = (byte)1;
    }

    public final void cfr_renamed_4() {
        int n = this.var_java_util_Vector_do.size() / this.cfr_renamed_5;
        if ((this.var_java_util_Vector_do.size() % this.cfr_renamed_5 != 0)) {
            ++n;
        }
        this.soLuongKhoa = 100 * bn_0.cfr_renamed_6;
        if (e.boolean_do(GameCanvas.var_int_byte, 200)) {
            this.soLuongKhoa = 50;
        }
        GameCanvas.var_ex_do.cfr_renamed_0(this.cfr_renamed_2 - this.var_short_do / 2, this.soLuongKhoa - this.var_short_do / 2, this.var_short_do, this.var_short_do, this.cfr_renamed_5 * this.var_short_do, n * this.var_short_do + 10, this.cfr_renamed_5 * this.var_short_do, GameCanvas.var_int_char - (this.soLuongKhoa - this.var_short_do / 2) - 4, this.var_java_util_Vector_do.size());
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 1: {
                eu_0 eu_02 = (eu_0)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_17);
                if ((fe_0.coKichHoat) && (eu_02.soLuong > AngelChip.duLieuNguoiChoi.mangSoNguyen[3])) {
                    e.e_do();
                    e.void_do();
                    return;
                }
                if (!(eu_02.dangChayAuto)) {
                    cd_0.cd_0_do().cfr_renamed_0(this.var_byte_int, eu_02.cfr_renamed_3, "");
                    GameCanvas.cfr_renamed_5();
                    return;
                }
                GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.aQ, new fd_0(this), 2);
                return;
            }
            case 2: {
                e.cfr_renamed_18();
                return;
            }
            case 3: {
                this.void_if(1, -1);
                return;
            }
            case 4: {
                this.cfr_renamed_12();
                return;
            }
            case 5: {
                GameCanvas.cfr_renamed_5();
                cd_0.cd_0_do().cfr_renamed_4();
                return;
            }
            case 6: {
                Vector<ei> vector = new Vector<ei>();
                vector.addElement(new ei(MenuChinhAvatar.cG, 5));
                vector.addElement(new ei("Đến bàn", 6));
                vector.addElement(fe_0.fe_0_do().var_ei_for);
                vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_float, 7));
                u_0.cfr_renamed_0().cfr_renamed_0(vector, 0);
            }
        }
    }

    public final void cfr_renamed_5() {
        if ((this.cfr_renamed_15 >= this.var_java_util_Vector_do.size())) {
            if ((this.var_int_int >= this.var_java_util_Vector_do.size())) {
                GameCanvas.cfr_renamed_5();
                GameCanvas.var_ex_do.coTrangThai = 0;
                cd_0.cd_0_do().cfr_renamed_3();
                if ((TienIchGame.cfr_renamed_2(15000L))) {
                    this.var_int_int = 0;
                    TienIchGame.hienThongBao(1500L);
                }
                return;
            }
            eu_0 eu_02 = (eu_0)this.var_java_util_Vector_do.elementAt(this.var_int_int);
            if ((eu_02.var_byte_do == 0)) {
                GameCanvas.cfr_renamed_5();
                cd_0.cd_0_do().cfr_renamed_0(this.var_byte_int, eu_02.cfr_renamed_3, "");
                if ((TienIchGame.cfr_renamed_2(5000L))) {
                    this.var_int_int = this.var_java_util_Vector_do.size();
                    return;
                }
            }
            this.var_int_int += 1;
            return;
        }
        eu_0 eu_03 = (eu_0)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_15);
        if ((eu_03.var_byte_do == 1) && !(eu_03.coTrangThai) && !(eu_03.dangChayAuto) && e.boolean_if(eu_03.soLuong, AngelChip.duLieuNguoiChoi.mangSoNguyen[3])) {
            GameCanvas.cfr_renamed_5();
            cd_0.cd_0_do().cfr_renamed_0(this.var_byte_int, eu_03.cfr_renamed_3, "");
            TienIchGame.cfr_renamed_2(5000L);
            }
        this.cfr_renamed_15 += 1;
    }

    public final void cfr_renamed_2() {
        GameCanvas.cfr_renamed_5();
        e.cfr_renamed_18();
    }

    public static e e_do() {
        if ((var_e_do == null)) {
            var_e_do = new e();
            return var_e_do;
        }
        return var_e_do;
    }

    public final void cfr_renamed_15() {
        if ((t_0.dangChayAuto) && (GameCanvas.cfr_renamed_16 != 0)) {
            GameCanvas.var_gj_0_do.void_do((ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
            return;
        }
        super.cfr_renamed_15();
    }

        private void cfr_renamed_12() {
        GameCanvas.var_dZ_do.cfr_renamed_0(MenuChinhAvatar.bS, new fn_0(this), 3);
    }

    private static void cfr_renamed_11() {
        mangSoNguyen = new int[18];
        0 = (0x15 ^ 0x75 ^ (0x20 ^ 4)) & (0xAC ^ 0x99 ^ (0xF6 ^ 0x87) ^ -" ".length());
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        5 = 0x3B ^ 0x3E;
        6 = 0x67 ^ 0x61;
        110 = 0xEB ^ 0x89 ^ (0x59 ^ 0x55);
        95 = 0xEF ^ 0xB0;
        4 = 0x7E ^ 0x7A;
        70 = 0x70 ^ 0x36;
        3 = "   ".length();
        180 = 130 + 112 - 95 + 33;
        10 = 0xE2 ^ 0x8B ^ (0x59 ^ 0x3A);
        7 = 0x7B ^ 0x6A ^ (0x27 ^ 0x31);
        30 = 0x68 ^ 0x76;
        100 = 0xEB ^ 0x8F;
        200 = 54 + 137 - 65 + 74;
        50 = 0x93 ^ 0xA1;
    }

    private static void cfr_renamed_18() {
        GameCanvas.var_ex_do.coTrangThai = 0;
        cd_0.cd_0_do().cfr_renamed_3();
        GameCanvas.cfr_renamed_5();
    }

    public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                GameCanvas.cfr_renamed_4(MenuChinhAvatar.cT);
                cd_0.cd_0_do().cfr_renamed_1(this.var_byte_int);
                return;
            }
            case 3: {
                GameCanvas.cfr_renamed_5();
                eq.eq_do().cfr_renamed_11(AngelChip.duLieuNguoiChoi.var_short_char);
                return;
            }
            case 4: {
                e.cfr_renamed_18();
                return;
            }
            case 5: {
                GameCanvas.cfr_renamed_5();
                cd_0.cd_0_do().cfr_renamed_4();
                return;
            }
            case 6: {
                this.cfr_renamed_12();
                return;
            }
            case 7: {
                GameCanvas.cfr_renamed_5();
                eq.eq_do().cfr_renamed_11(AngelChip.duLieuNguoiChoi.var_short_char);
            }
        }
    }

    public final void (Graphics graphics != null) {
        GameCanvas.cfr_renamed_1(graphics);
        gp_0.cfr_renamed_0(graphics, "Phòng " + gp_0.chuoiGiaTri + " " + this.var_byte_int);
        this.cfr_renamed_3(graphics);
        t_0.cfr_renamed_0(graphics, (ei)((dL)this).cfr_renamed_4, (ei)((dL)this).cfr_renamed_5, (ei)((dL)this).cfr_renamed_2);
    }

    public final void cfr_renamed_8() {
        t_0.cfr_renamed_5();
        dL.cfr_renamed_19();
        this.cfr_renamed_17 = 0;
        GameCanvas.var_gj_0_do.void_do(var_byte_for);
        if ((var_javax_microedition_lcdui_Image_for == null)) {
            try {
                var_javax_microedition_lcdui_Image_for = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/imgkhungsoban.on"));
                cfr_renamed_11 = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/imgNumPlayer.on"));
                var_javax_microedition_lcdui_Image_if = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/imgPlay.on"));
                cfr_renamed_12 = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/on/imgLock.on"));
                }
            catch (IOException iOException) {
                }
            if (-" ".length() > 0) {
                return;
            }
        }
        GameCanvas.cfr_renamed_6 = 1;
        ((dL)this).cfr_renamed_5 = (Image)1;
        AngelChip.duLieuNguoiChoi.var_short_do = (short)0;
        super.cfr_renamed_8();
        if ((this.var_int_if != this.var_byte_int)) {
            this.var_int_if = this.var_byte_int;
            this.var_int_int = 0;
            this.cfr_renamed_15 = 0;
        }
        TienIchGame.cfr_renamed_8();
    }

            public e() {
        this.var_int_if = -1;
        this.var_ei_do = new ei(MenuChinhAvatar.dg, 1);
        ((dL)this).cfr_renamed_2 = new ei(MenuChinhAvatar.cfr_renamed_7, 2);
        if ((GameCanvas.cfr_renamed_16 != 0)) {
            ((dL)this).cfr_renamed_5 = new ei(MenuChinhAvatar.cG, 5);
            } else {
            ((dL)this).cfr_renamed_5 = this.var_ei_do;
        }
        ((dL)this).cfr_renamed_4 = new ei(MenuChinhAvatar.Z, 6);
        this.var_short_do = (short)(110 * bn_0.cfr_renamed_6);
        if ((GameCanvas.cfr_renamed_16 == 1)) {
            this.var_short_do = (short)95;
            if ("   ".length() == 0) {
                throw null;
            }
        } else if ((GameCanvas.cfr_renamed_16 == 0)) {
            this.var_short_do = (short)(GameCanvas.var_int_byte / 4);
            if (e.boolean_do(this.var_short_do, 70)) {
                this.var_short_do = (short)(GameCanvas.var_int_byte / 3);
            }
            if (e.boolean_do(GameCanvas.var_int_byte, 180)) {
                this.var_short_do = (short)(GameCanvas.var_int_byte / 2);
            }
        }
        this.cfr_renamed_5 = GameCanvas.var_int_byte / this.var_short_do + 1;
        if ((this.cfr_renamed_5 * this.var_short_do > GameCanvas.var_int_byte - this.var_short_do / 2)) {
            this.cfr_renamed_5 -= 1;
        }
        this.cfr_renamed_2 = this.var_short_do / 2;
        this.soLuongKhoa = this.var_short_do / 2;
        this.soLuongKhoa += 10;
        if ((GameCanvas.var_int_byte > this.cfr_renamed_5 * this.var_short_do)) {
            this.cfr_renamed_2 = (GameCanvas.var_int_byte - this.cfr_renamed_5 * this.var_short_do) / 2 + this.var_short_do / 2;
        }
    }
}

