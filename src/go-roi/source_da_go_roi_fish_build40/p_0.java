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

/*
 * Renamed from p
 */
public final class p_0
extends en {
    private int var_int_if;
    private static Image var_javax_microedition_lcdui_Image_if;
    private int soLuongKhoa;
    public static p_0 var_p_0_do;
    private fl_0 var_fl_0_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    private static Image var_javax_microedition_lcdui_Image_for;
    public byte var_byte_do;
    public static byte var_byte_if;
    private int var_int_int;
    private static Image cfr_renamed_8;
    private static Image cfr_renamed_13;
    public static byte var_byte_for;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    public static cu_0 var_cu_0_do;
    private short var_short_do;
    private int cfr_renamed_6 = 0;
    Vector var_java_util_Vector_do;
    public static byte var_byte_int;
    int soLuong;
    private static final int[] mangSoNguyen;

    public final void void_do() {
        int n = this.var_java_util_Vector_do.size() / this.soLuongKhoa;
        if ((this.var_java_util_Vector_do.size() % this.soLuongKhoa != 0)) {
            ++n;
        }
        this.var_int_int = 100 * dF.cfr_renamed_12;
        if ((GameCanvas.soLuongKhoa < 200)) {
            this.var_int_int = 50;
        }
        GameCanvas.var_cg_0_do.cfr_renamed_1(this.var_int_if - this.var_short_do / 2, this.var_int_int - this.var_short_do / 2, this.var_short_do, this.var_short_do, this.soLuongKhoa * this.var_short_do, n * this.var_short_do + 10, this.soLuongKhoa * this.var_short_do, GameCanvas.var_int_case - (this.var_int_int - this.var_short_do / 2) - 4, this.var_java_util_Vector_do.size());
    }

    public static p_0 p_0_do() {
        if ((var_p_0_do == null)) {
            var_p_0_do = new p_0();
            return var_p_0_do;
        }
        return var_p_0_do;
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 1: {
                fw fw2 = (fw)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_18);
                if ((go_0.var_boolean_int) && p_0.boolean_do(fw2.soLuong, AngelChip.duLieuNguoiChoi.mangSoNguyen[3])) {
                    p_0.p_0_do();
                    p_0.cfr_renamed_5();
                    return;
                }
                if (p_0.boolean_for(fw2.coTrangThai ? 1 : 0)) {
                    dt_0.dt_0_do().cfr_renamed_1(this.var_byte_do, fw2.var_byte_if, "");
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.ca, new gf(this), 2);
                return;
            }
            case 2: {
                p_0.cfr_renamed_13();
                return;
            }
            case 3: {
                this.void_if(1, -1);
                return;
            }
            case 4: {
                this.cfr_renamed_9();
                return;
            }
            case 5: {
                GameCanvas.cfr_renamed_8();
                dt_0.dt_0_do().cfr_renamed_3();
                return;
            }
            case 6: {
                Vector<fl_0> vector = new Vector<fl_0>();
                vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_19, 5));
                vector.addElement(new fl_0("Đến bàn", 6));
                vector.addElement(go_0.go_0_do().var_fl_0_for);
                vector.addElement(new fl_0(MenuChinhAvatar.z, 7));
                aq.cfr_renamed_1().cfr_renamed_1(vector, 0);
            }
        }
    }

    public final void void_if() {
        GameCanvas.cfr_renamed_8();
        p_0.cfr_renamed_13();
    }

        protected final void cfr_renamed_2() {
        GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.aP, new gn(this), 0);
    }

        public final void void_if(int n, int n2) {
        switch (n) {
            case 1: {
                GameCanvas.cfr_renamed_2(MenuChinhAvatar.bZ);
                dt_0.dt_0_do().cfr_renamed_3(this.var_byte_do);
                return;
            }
            case 3: {
                GameCanvas.cfr_renamed_8();
                ft_0.ft_0_do().cfr_renamed_9(AngelChip.duLieuNguoiChoi.var_short_goto);
                return;
            }
            case 4: {
                p_0.cfr_renamed_13();
                return;
            }
            case 5: {
                GameCanvas.cfr_renamed_8();
                dt_0.dt_0_do().cfr_renamed_3();
                return;
            }
            case 6: {
                this.cfr_renamed_9();
                return;
            }
            case 7: {
                GameCanvas.cfr_renamed_8();
                ft_0.ft_0_do().cfr_renamed_9(AngelChip.duLieuNguoiChoi.var_short_goto);
            }
        }
    }

    private static void cfr_renamed_8() {
        mangSoNguyen = new int[18];
        0 = (0x35 ^ 0x2E) & ~(0x7A ^ 0x61);
        1 = " ".length();
        -1 = -" ".length();
        2 = "  ".length();
        5 = 0x93 ^ 0x96;
        6 = 0x7C ^ 0x7A;
        110 = 0xC2 ^ 0xAC;
        95 = "   ".length() ^ (0xC3 ^ 0x9F);
        4 = 0xA6 ^ 0xA2;
        70 = 0xF8 ^ 0x80 ^ (0x37 ^ 9);
        3 = "   ".length();
        180 = 128 + 36 - 118 + 134;
        10 = 0x12 ^ 0x6B ^ (0x7E ^ 0xD);
        7 = 0xCE ^ 0x9F ^ (0x72 ^ 0x24);
        30 = 0xBF ^ 0xA1;
        100 = 0xA1 ^ 0xC5;
        200 = (0x16 ^ 0x35) + (0x9F ^ 0x89) - -(0x61 ^ 0x4B) + (0x35 ^ 0x50);
        50 = 0xA0 ^ 0x92;
    }

    public final void cfr_renamed_3() {
        if ((this.cfr_renamed_4 >= this.var_java_util_Vector_do.size())) {
            if ((this.cfr_renamed_6 >= this.var_java_util_Vector_do.size())) {
                GameCanvas.cfr_renamed_8();
                GameCanvas.var_cg_0_do.coTrangThai = 0;
                dt_0.dt_0_do().cfr_renamed_5();
                if ((TienIchGame.boolean_do(15000L))) {
                    this.cfr_renamed_6 = 0;
                    TienIchGame.void_if(1500L);
                }
                return;
            }
            fw fw2 = (fw)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_6);
            if (p_0.boolean_for(fw2.var_byte_do)) {
                GameCanvas.cfr_renamed_8();
                dt_0.dt_0_do().cfr_renamed_1(this.var_byte_do, fw2.var_byte_if, "");
                if ((TienIchGame.boolean_do(5000L))) {
                    this.cfr_renamed_6 = this.var_java_util_Vector_do.size();
                    return;
                }
            }
            this.cfr_renamed_6 += 1;
            return;
        }
        fw fw3 = (fw)this.var_java_util_Vector_do.elementAt(this.cfr_renamed_4);
        if (p_0.boolean_if(fw3.var_byte_do, 1) && p_0.boolean_for(fw3.dangChayAuto ? 1 : 0) && p_0.boolean_for(fw3.coTrangThai ? 1 : 0) && (fw3.soLuong <= AngelChip.duLieuNguoiChoi.mangSoNguyen[3])) {
            GameCanvas.cfr_renamed_8();
            dt_0.dt_0_do().cfr_renamed_1(this.var_byte_do, fw3.var_byte_if, "");
            TienIchGame.boolean_do(5000L);
            }
        this.cfr_renamed_4 += 1;
    }

        private static boolean boolean_for(int n) {
        return n == 0;
    }

    public final void (Vector vector == null) {
        this.var_java_util_Vector_do = vector;
    }

        public final void (int n, boolean bl == null) {
        if ((bl) && p_0.boolean_if(this.cfr_renamed_18, n) && (this.var_fl_0_do != null)) {
            this.var_fl_0_do.cfr_renamed_0();
        }
        if (p_0.boolean_int(n) && (n < this.var_java_util_Vector_do.size())) {
            super.cfr_renamed_1(n, bl);
        }
    }

    public final void (Graphics graphics == null) {
        GameCanvas.hienThongBaoPopup(graphics);
        fm_0.cfr_renamed_1(graphics, "Phòng " + fm_0.chuoiGiaTri + " " + this.var_byte_do);
        this.cfr_renamed_2(graphics);
        al_0.cfr_renamed_1(graphics, (fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

        static {
        p_0.cfr_renamed_8();
        var_byte_int = (byte)1;
        var_byte_for = (byte)2;
        var_byte_if = (byte)1;
    }

    public final void cfr_renamed_4() {
        al_0.cfr_renamed_5();
        en.cfr_renamed_20();
        this.cfr_renamed_18 = 0;
        GameCanvas.var_fa_0_do.void_do(var_byte_if);
        if ((cfr_renamed_8 == null)) {
            try {
                cfr_renamed_8 = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/imgkhungsoban.on"));
                var_javax_microedition_lcdui_Image_if = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/imgNumPlayer.on"));
                cfr_renamed_13 = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/imgPlay.on"));
                var_javax_microedition_lcdui_Image_for = Image.createImage((String)(MenuChinhAvatar.java_lang_String_for() + "/on/imgLock.on"));
                }
            catch (IOException iOException) {
                }
            if ((0x37 ^ 0x32) <= 0) {
                return;
            }
        }
        GameCanvas.var_int_byte = 1;
        ((en)this).cfr_renamed_4 = (Image)1;
        AngelChip.duLieuNguoiChoi.soLuong = 0;
        super.cfr_renamed_4();
        if ((this.cfr_renamed_5 != this.var_byte_do)) {
            this.cfr_renamed_5 = this.var_byte_do;
            this.cfr_renamed_6 = 0;
            this.cfr_renamed_4 = 0;
        }
        TienIchGame.cfr_renamed_7();
    }

    public static void cfr_renamed_5() {
        GameCanvas.cfr_renamed_1("Hiện tại bạn không đủ Xèng để tham gia màn chơi, bạn có muốn nạp thêm Xèng không?", new gr());
    }

    private void cfr_renamed_2(Graphics graphics) {
        int n;
        graphics.translate(this.var_int_if, this.var_int_int);
        graphics.translate(0, -cg_0.cfr_renamed_9);
        int n2 = cg_0.cfr_renamed_9 / this.var_short_do * this.soLuongKhoa - this.soLuongKhoa;
        if ((n2 == null)) {
            n2 = 0;
        }
        if (p_0.boolean_do(n = n2 + GameCanvas.var_int_case / this.var_short_do * this.soLuongKhoa + (this.soLuongKhoa << 1) + this.soLuongKhoa, this.var_java_util_Vector_do.size())) {
            n = this.var_java_util_Vector_do.size();
        }
        while ((n2 < n)) {
            int n3 = n2 % this.soLuongKhoa * this.var_short_do;
            int n4 = n2 / this.soLuongKhoa * this.var_short_do;
            fw fw2 = (fw)this.var_java_util_Vector_do.elementAt(n2);
            if ((!(GameCanvas.var_boolean_try) || p_0.boolean_for((int)((en)this).cfr_renamed_4)) && p_0.boolean_if(n2, this.cfr_renamed_18)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_do, n3, n4, 3);
            }
            var_cu_0_do.cfr_renamed_1(fw2.var_byte_do, n3, n4, 0, 3, graphics);
            graphics.drawImage(cfr_renamed_8, n3 - this.var_short_do / 4, n4 - 30 * dF.cfr_renamed_12, 3);
            GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, "" + fw2.var_byte_if, n3 - this.var_short_do / 4, n4 - 30 * dF.cfr_renamed_12 - dF.cfr_renamed_7 / 2, 2);
            if ((fw2.soLuong != null)) {
                GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, fw2.chuoiGiaTri, n3, n4 - 30 * dF.cfr_renamed_12 - dF.cfr_renamed_7 / 2, 2);
            }
            if (p_0.boolean_if(var_byte_if, var_byte_int) && (fw2.cfr_renamed_2 < 4)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, n3 + this.var_short_do / 4, n4 - 30 * dF.cfr_renamed_12, 3);
                GameCanvas.var_fz_0_do.cfr_renamed_1(graphics, "" + fw2.cfr_renamed_2, n3 + this.var_short_do / 4, n4 - 30 * dF.cfr_renamed_12 - dF.cfr_renamed_7 / 2, 2);
            }
            if ((fw2.dangChayAuto)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, n3 - this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
                graphics.drawImage(cfr_renamed_13, n3 - this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
            }
            if ((fw2.coTrangThai)) {
                graphics.drawImage(var_javax_microedition_lcdui_Image_if, n3 + this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
                graphics.drawImage(var_javax_microedition_lcdui_Image_for, n3 + this.var_short_do / 4, n4 + this.var_short_do / 3, 3);
            }
            ++n2;
            if (-"  ".length() <= 0) continue;
            return;
        }
    }

    private static void cfr_renamed_13() {
        GameCanvas.var_cg_0_do.coTrangThai = 0;
        dt_0.dt_0_do().cfr_renamed_5();
        GameCanvas.cfr_renamed_8();
    }

        public p_0() {
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_5 = -1;
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cT, 1);
        ((en)this).cfr_renamed_4 = new fl_0(MenuChinhAvatar.by, 2);
        if ((GameCanvas.cfr_renamed_12 != 0)) {
            ((en)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cfr_renamed_19, 5);
            if (-(22 + 34 - 5 + 115 ^ 159 + 115 - 133 + 21) > 0) {
                throw null;
            }
        } else {
            ((en)this).cfr_renamed_3 = this.var_fl_0_do;
        }
        ((en)this).cfr_renamed_5 = new fl_0(MenuChinhAvatar.bR, 6);
        this.var_short_do = (short)(110 * dF.cfr_renamed_12);
        if (p_0.boolean_if(GameCanvas.cfr_renamed_12, 1)) {
            this.var_short_do = (short)95;
            if ("   ".length() < 0) {
                throw null;
            }
        } else if (p_0.boolean_for(GameCanvas.cfr_renamed_12)) {
            this.var_short_do = (short)(GameCanvas.soLuongKhoa / 4);
            if ((this.var_short_do < 70)) {
                this.var_short_do = (short)(GameCanvas.soLuongKhoa / 3);
            }
            if ((GameCanvas.soLuongKhoa < 180)) {
                this.var_short_do = (short)(GameCanvas.soLuongKhoa / 2);
            }
        }
        this.soLuongKhoa = GameCanvas.soLuongKhoa / this.var_short_do + 1;
        if (p_0.boolean_do(this.soLuongKhoa * this.var_short_do, GameCanvas.soLuongKhoa - this.var_short_do / 2)) {
            this.soLuongKhoa -= 1;
        }
        this.var_int_if = this.var_short_do / 2;
        this.var_int_int = this.var_short_do / 2;
        this.var_int_int += 10;
        if (p_0.boolean_do(GameCanvas.soLuongKhoa, this.soLuongKhoa * this.var_short_do)) {
            this.var_int_if = (GameCanvas.soLuongKhoa - this.soLuongKhoa * this.var_short_do) / 2 + this.var_short_do / 2;
        }
    }

    private void cfr_renamed_9() {
        GameCanvas.var_ca_do.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_char, new gp(this), 3);
    }

        private static boolean boolean_int(int n) {
        return n >= 0;
    }

    public final void cfr_renamed_6() {
        if ((al_0.dangChayAuto) && (GameCanvas.cfr_renamed_12 != 0)) {
            GameCanvas.var_fa_0_do.void_do((fl_0)((en)this).cfr_renamed_5, (fl_0)((en)this).cfr_renamed_3, (fl_0)((en)this).cfr_renamed_4);
            return;
        }
        super.cfr_renamed_6();
    }

    public final void cfr_renamed_7() {
    }

        }

