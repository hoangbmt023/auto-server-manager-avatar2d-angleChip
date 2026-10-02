/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class es
extends fd_0 {
    public byte var_byte_do;
    public boolean dangChayAuto;
    public short var_short_do;
    public byte var_byte_for;
    public byte var_byte_int;
    public int soLuong;
    public byte var_byte_new;
    public boolean coTrangThai;
    public int var_int_new;
    public long soXu;
    public boolean coKichHoat;
    public int cfr_renamed_5;
    public int cfr_renamed_6;
    public boolean var_boolean_int;
    private static final int[] mangSoNguyen;
    public short var_short_if = (short)-1;
    public int cfr_renamed_7;

    public es() {
        this.var_boolean_int = 0;
    }

            static {
        es.cfr_renamed_0();
    }

                    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[31];
        -1 = -" ".length();
        0 = (0xBB ^ 0xB6) & ~(0x82 ^ 0x8F);
        10 = 0x21 ^ 0x2B;
        13 = 0x73 ^ 0x7E;
        18 = 0x9E ^ 0x8C;
        44 = 0x3F ^ 0x13;
        2 = "  ".length();
        33 = 7 ^ 0x2A ^ (0x8A ^ 0x86);
        60 = 0xB6 ^ 0xBD ^ (0x84 ^ 0xB3);
        100 = 203 + 49 - 214 + 193 ^ 36 + 70 - 78 + 103;
        1 = " ".length();
        5 = 51 + 146 - 185 + 135 ^ 34 + 91 - -9 + 16;
        12 = 0x51 ^ 0x46 ^ (0x53 ^ 0x48);
        3 = "   ".length();
        7 = 0x6C ^ 0x1A ^ (0x63 ^ 0x12);
        24 = 0x68 ^ 0x15 ^ (0x72 ^ 0x17);
        40 = 0x86 ^ 0xAE;
        4 = 0xE3 ^ 0x8D ^ (0x71 ^ 0x1B);
        38 = 0x46 ^ 0x6B ^ (0x2F ^ 0x24);
        31 = 0x4D ^ 0x52;
        65280 = -(123 + 175 - 192 + 96) & (0xFFFFFFDF & 0xFFE9);
        37 = 3 + 92 - -12 + 121 ^ 28 + 37 - -5 + 123;
        30 = 0x49 ^ 0x57;
        2512938 = 0xFFFFD8BA & 0x267F6F;
        49 = 0x1F ^ 0x2E;
        29 = 0x9E ^ 0xAF ^ (0x54 ^ 0x78);
        32 = 0x30 ^ 0x10;
        255 = 251 + 181 - 359 + 182;
        6 = 0xFB ^ 0xAA ^ (0x6A ^ 0x3D);
        22 = 0xB ^ 0x7A ^ (0x24 ^ 0x43);
        15 = 0x21 ^ 0x52 ^ (0x26 ^ 0x5A);
    }

            public final void (Graphics graphics == 0) {
        if (es.cfr_renamed_0(((fd_0)this).cfr_renamed_2 * bm.var_int_if, fm.fm_do().cfr_renamed_3 - 10) && (this.var_int_new * bm.var_int_if <= fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa + 10)) {
            if ((this.var_boolean_int)) {
                graphics.drawImage(dR.var_javax_microedition_lcdui_Image_do, (((fd_0)this).cfr_renamed_2 - 13) * bm.var_int_if, (((fd_0)this).cfr_renamed_3 - 18) * bm.var_int_if, 0);
            }
            int n = dR.var_fs_if.soLuong;
            int n2 = dR.var_fs_if.var_int_if;
            if ((this.var_int_new == n) && (this.soLuong == n2)) {
                GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, "lv" + this.var_byte_for, ((fd_0)this).cfr_renamed_2 * bm.var_int_if, (((fd_0)this).cfr_renamed_3 - 44) * bm.var_int_if, 2);
            }
            if ((this.cfr_renamed_6 != -1)) {
                fb_0 fb_02 = bz.fb_0_if(this.cfr_renamed_6);
                fb_02.cfr_renamed_1(graphics, this.cfr_renamed_5, ((fd_0)this).cfr_renamed_2 * bm.var_int_if, ((fd_0)this).cfr_renamed_3 * bm.var_int_if, 33);
                int n3 = fb_02.cfr_renamed_5 * 60 + fb_02.var_short_if * 60;
                if ((!(this.var_short_do > n3) || (fb_02.var_short_if == -1)) && (this.var_byte_do != 100) && (this.var_short_do >= 0)) {
                    if ((this.dangChayAuto)) {
                        graphics.drawImage(dR.var_javax_microedition_lcdui_Image_arr_do[1], (((fd_0)this).cfr_renamed_2 + 5) * bm.var_int_if, (((fd_0)this).cfr_renamed_3 - 12) * bm.var_int_if, 3);
                    }
                    if ((this.coKichHoat)) {
                        graphics.drawImage(dR.var_javax_microedition_lcdui_Image_arr_do[0], (((fd_0)this).cfr_renamed_2 - 7) * bm.var_int_if, ((fd_0)this).cfr_renamed_3 * bm.var_int_if, 3);
                    }
                    if ((this.var_int_new == n) && !(this.soLuong != n2) || (this.var_short_if != -1) && (this.var_short_if == dR.var_int_int)) {
                        n = n * 24 * bm.var_int_if;
                        n2 = n2 * 24 * bm.var_int_if;
                        if ((this.var_short_if != -1) && (this.var_short_if == dR.var_int_int)) {
                            n = this.var_int_new * 24 * bm.var_int_if;
                            n2 = this.soLuong * 24 * bm.var_int_if;
                        }
                        fb_02.cfr_renamed_1(graphics, 7, n - 3, n2 - 40 * bm.var_int_if, 33);
                        graphics.setColor(1);
                        graphics.fillRect(n - 4 * bm.var_int_if, n2 - 38 * bm.var_int_if, 31 * bm.var_int_if, 5 * bm.var_int_if);
                        graphics.setColor(65280);
                        graphics.fillRect(n - 3 * bm.var_int_if, n2 - 37 * bm.var_int_if, this.var_byte_new * 30 / 100 * bm.var_int_if, 3 * bm.var_int_if);
                        graphics.setColor(2512938);
                        graphics.drawRect(n - 4 * bm.var_int_if, n2 - 38 * bm.var_int_if, 31 * bm.var_int_if, 4 * bm.var_int_if);
                        long l = (long)(fb_02.cfr_renamed_5 * 60 * 60) - this.soXu;
                        long l2 = fb_02.cfr_renamed_5 * 60 - this.var_short_do;
                        String string = "";
                        if (es.cfr_renamed_0((l == 0L))) {
                            l = 0L;
                        }
                        long l3 = l / 60L / 60L;
                        long l4 = l / 60L % 60L;
                        long l5 = l % 60L;
                        string = string + l3 + ":" + l4 + ":" + l5;
                        if (!es.cfr_renamed_2((l2 == 0L)) || es.cfr_renamed_4((l == 0L))) {
                            string = MenuChinhAvatar.bq;
                        }
                        GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, string, n + 5 * bm.var_int_if, n2 - 49 * bm.var_int_if, 0);
                        int n4 = this.var_short_do * 100 / (fb_02.cfr_renamed_5 * 60) * 30 / 100;
                        if ((n4 == 0)) {
                            n4 = 1;
                        }
                        if ((n4 >= 30)) {
                            n4 = 29;
                        }
                        if ((fb_02.cfr_renamed_5 * 60 - this.var_short_do < 0)) {
                            n4 = 30;
                        }
                        graphics.setColor(1);
                        graphics.fillRect(n - 4 * bm.var_int_if, n2 - 32 * bm.var_int_if, 31 * bm.var_int_if, 5 * bm.var_int_if);
                        graphics.setColor(255, 255, 0);
                        graphics.fillRect(n - 3 * bm.var_int_if, n2 - 31 * bm.var_int_if, n4 * bm.var_int_if, 3 * bm.var_int_if);
                        graphics.setColor(2512938);
                        graphics.drawRect(n - 4 * bm.var_int_if, n2 - 32 * bm.var_int_if, 31 * bm.var_int_if, 4 * bm.var_int_if);
                        int n5 = 0;
                        if ((this.dangChayAuto)) {
                            int n6;
                            n5 = 1;
                            int n7 = 1;
                            int n8 = 5;
                            if ((this.coKichHoat)) {
                                n6 = 6;
                                if ((102 + 77 - 167 + 150 ^ 44 + 76 - 12 + 58) <= 0) {
                                    return;
                                }
                            } else {
                                n6 = 0;
                            }
                            dR.var_cu_0_int.cfr_renamed_0(n7, n + (n8 + n6) * bm.var_int_if, n2 - 22 * bm.var_int_if, 0, graphics);
                        }
                        if ((this.coKichHoat)) {
                            dR.var_cu_0_int.cfr_renamed_0(0, n + (4 - n5 * 6) * bm.var_int_if, n2 - 22 * bm.var_int_if, 0, graphics);
                        }
                    }
                }
            }
        }
        GameCanvas.var_fz_0_do.cfr_renamed_1(graphics, String.valueOf(this.cfr_renamed_7), ((fd_0)this).cfr_renamed_2 * bm.var_int_if, (((fd_0)this).cfr_renamed_3 - 15) * bm.var_int_if, 2);
    }

            }

