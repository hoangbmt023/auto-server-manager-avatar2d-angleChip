/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dQ
 */
public final class dq_0
extends ea {
    public byte var_byte_do;
    public short var_short_do;
    public boolean dangChayAuto;
    public int soLuong;
    public byte var_byte_for;
    public short var_short_if = (short)-1;
    public long soXu;
    public int var_int_new;
    public boolean coTrangThai;
    public boolean coKichHoat;
    public boolean var_boolean_int;
    public byte var_byte_int;
    public byte var_byte_new;
    private static final int[] mangSoNguyen;
    public int cfr_renamed_2;
    public int cfr_renamed_15;
    public int cfr_renamed_8;

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[31];
        -1 = -" ".length();
        0 = (0x23 ^ 0x41) & ~(0xA ^ 0x68);
        10 = 0x2C ^ 0x26;
        13 = 0x87 ^ 0x8A;
        18 = 0xA9 ^ 0xBB;
        44 = 23 + 23 - -82 + 0 ^ 151 + 167 - 178 + 32;
        2 = "  ".length();
        33 = 0x8E ^ 0xAF;
        60 = 153 + 78 - 173 + 96 ^ 19 + 157 - 60 + 50;
        100 = 0x51 ^ 0x35;
        1 = " ".length();
        5 = "   ".length() ^ (1 ^ 7);
        12 = 0x1D ^ 0x7C ^ (0x33 ^ 0x5E);
        3 = "   ".length();
        7 = 66 + 0 - -54 + 19 ^ 47 + 46 - -35 + 12;
        24 = 0xF ^ 0x14 ^ "   ".length();
        40 = 0x37 ^ 0x1E ^ " ".length();
        4 = 0x49 ^ 0x4D;
        38 = 0x30 ^ 0x52 ^ (0x80 ^ 0xC4);
        31 = 4 ^ 0x4D ^ (8 ^ 0x5E);
        65280 = -(132 + 120 - 42 + 3) & (0xFFFFFFDE & 0xFFF5);
        37 = 0x90 ^ 0xB5;
        30 = 0xFF ^ 0x82 ^ (5 ^ 0x66);
        2512938 = 0xFFFFFE2A & 0x2659FF;
        49 = 0x4B ^ 0x7A;
        29 = 0xA0 ^ 0xBD;
        32 = 0x10 ^ 0x30;
        255 = 95 + 68 - 128 + 220;
        6 = 0x8B ^ 0x8D;
        22 = 131 + 205 - 172 + 45 ^ 174 + 198 - 342 + 169;
        15 = 0x59 ^ 0x78 ^ (0x38 ^ 0x16);
    }

    public final void (Graphics graphics < 0) {
        if (dq_0.cfr_renamed_4(((ea)this).cfr_renamed_3 * aG.var_int_int, ek_0.ek_0_do().soLuong - 10) && (this.cfr_renamed_2 * aG.var_int_int <= ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte + 10)) {
            if ((this.dangChayAuto)) {
                graphics.drawImage(bF.var_javax_microedition_lcdui_Image_do, (((ea)this).cfr_renamed_3 - 13) * aG.var_int_int, (((ea)this).cfr_renamed_1 - 18) * aG.var_int_int, 0);
            }
            int n = bF.var_eq_0_if.var_int_if;
            int n2 = bF.var_eq_0_if.soLuong;
            if ((this.cfr_renamed_2 == n) && (this.var_int_new == n2)) {
                GameCanvas.var_ew_int.cfr_renamed_0(graphics, "lv" + this.var_byte_int, ((ea)this).cfr_renamed_3 * aG.var_int_int, (((ea)this).cfr_renamed_1 - 44) * aG.var_int_int, 2);
            }
            if ((this.cfr_renamed_8 != -1)) {
                dY dY2 = ak_0.dY_do(this.cfr_renamed_8);
                dY2.cfr_renamed_0(graphics, this.soLuong, ((ea)this).cfr_renamed_3 * aG.var_int_int, ((ea)this).cfr_renamed_1 * aG.var_int_int, 33);
                int n3 = dY2.var_short_do * 60 + dY2.cfr_renamed_2 * 60;
                if ((!(this.var_short_do > n3) || (dY2.cfr_renamed_2 == -1)) && (this.var_byte_do != 100) && (this.var_short_do >= 0)) {
                    if ((this.var_boolean_int)) {
                        graphics.drawImage(bF.var_javax_microedition_lcdui_Image_arr_do[1], (((ea)this).cfr_renamed_3 + 5) * aG.var_int_int, (((ea)this).cfr_renamed_1 - 12) * aG.var_int_int, 3);
                    }
                    if ((this.coKichHoat)) {
                        graphics.drawImage(bF.var_javax_microedition_lcdui_Image_arr_do[0], (((ea)this).cfr_renamed_3 - 7) * aG.var_int_int, ((ea)this).cfr_renamed_1 * aG.var_int_int, 3);
                    }
                    if ((this.cfr_renamed_2 == n) && !(this.var_int_new != n2) || (this.var_short_if != -1) && (this.var_short_if == bF.var_int_new)) {
                        n = n * 24 * aG.var_int_int;
                        n2 = n2 * 24 * aG.var_int_int;
                        if ((this.var_short_if != -1) && (this.var_short_if == bF.var_int_new)) {
                            n = this.cfr_renamed_2 * 24 * aG.var_int_int;
                            n2 = this.var_int_new * 24 * aG.var_int_int;
                        }
                        dY2.cfr_renamed_0(graphics, 7, n - 3, n2 - 40 * aG.var_int_int, 33);
                        graphics.setColor(1);
                        graphics.fillRect(n - 4 * aG.var_int_int, n2 - 38 * aG.var_int_int, 31 * aG.var_int_int, 5 * aG.var_int_int);
                        graphics.setColor(65280);
                        graphics.fillRect(n - 3 * aG.var_int_int, n2 - 37 * aG.var_int_int, this.var_byte_for * 30 / 100 * aG.var_int_int, 3 * aG.var_int_int);
                        graphics.setColor(2512938);
                        graphics.drawRect(n - 4 * aG.var_int_int, n2 - 38 * aG.var_int_int, 31 * aG.var_int_int, 4 * aG.var_int_int);
                        long l = (long)(dY2.var_short_do * 60 * 60) - this.soXu;
                        long l2 = dY2.var_short_do * 60 - this.var_short_do;
                        String string = "";
                        if (dq_0.cfr_renamed_0((l == 0L))) {
                            l = 0L;
                        }
                        long l3 = l / 60L / 60L;
                        long l4 = l / 60L % 60L;
                        long l5 = l % 60L;
                        string = string + l3 + ":" + l4 + ":" + l5;
                        if (!dq_0.cfr_renamed_3((l2 == 0L)) || dq_0.cfr_renamed_4((l == 0L))) {
                            string = MenuChinhAvatar.F;
                        }
                        GameCanvas.var_ew_int.cfr_renamed_0(graphics, string, n + 5 * aG.var_int_int, n2 - 49 * aG.var_int_int, 0);
                        int n4 = this.var_short_do * 100 / (dY2.var_short_do * 60) * 30 / 100;
                        if ((n4 == 0)) {
                            n4 = 1;
                        }
                        if ((n4 >= 30)) {
                            n4 = 29;
                        }
                        if ((dY2.var_short_do * 60 - this.var_short_do < 0)) {
                            n4 = 30;
                        }
                        graphics.setColor(1);
                        graphics.fillRect(n - 4 * aG.var_int_int, n2 - 32 * aG.var_int_int, 31 * aG.var_int_int, 5 * aG.var_int_int);
                        graphics.setColor(255, 255, 0);
                        graphics.fillRect(n - 3 * aG.var_int_int, n2 - 31 * aG.var_int_int, n4 * aG.var_int_int, 3 * aG.var_int_int);
                        graphics.setColor(2512938);
                        graphics.drawRect(n - 4 * aG.var_int_int, n2 - 32 * aG.var_int_int, 31 * aG.var_int_int, 4 * aG.var_int_int);
                        int n5 = 0;
                        if ((this.var_boolean_int)) {
                            int n6;
                            n5 = 1;
                            int n7 = 1;
                            int n8 = 5;
                            if ((this.coKichHoat)) {
                                n6 = 6;
                                if (((0x2E ^ 0x7B ^ (0xB2 ^ 0x87)) & (174 + 143 - 254 + 134 ^ 3 + 90 - -51 + 21 ^ -" ".length())) == (0x88 ^ 0xAA ^ (0x1C ^ 0x3A))) {
                                    return;
                                }
                            } else {
                                n6 = 0;
                            }
                            bF.var_ep_for.cfr_renamed_0(n7, n + (n8 + n6) * aG.var_int_int, n2 - 22 * aG.var_int_int, 0, graphics);
                        }
                        if ((this.coKichHoat)) {
                            bF.var_ep_for.cfr_renamed_0(0, n + (4 - n5 * 6) * aG.var_int_int, n2 - 22 * aG.var_int_int, 0, graphics);
                        }
                    }
                }
            }
        }
        GameCanvas.var_ew_do.cfr_renamed_0(graphics, String.valueOf(this.cfr_renamed_15), ((ea)this).cfr_renamed_3 * aG.var_int_int, (((ea)this).cfr_renamed_1 - 15) * aG.var_int_int, 2);
    }

    static {
        dq_0.cfr_renamed_1();
    }

                public dq_0() {
        this.dangChayAuto = 0;
    }

                        }

