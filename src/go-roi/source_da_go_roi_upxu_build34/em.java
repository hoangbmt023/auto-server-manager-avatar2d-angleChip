/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class em {
    private static int cfr_renamed_5;
    private int cfr_renamed_2;
    private long soXu;
    private boolean coKichHoat;
    public boolean dangChayAuto;
    public Vector var_java_util_Vector_do = new Vector();
    private int cfr_renamed_15;
    private static int cfr_renamed_8;
    private static final int[] mangSoNguyen;
    public boolean coTrangThai;
    private int cfr_renamed_12 = 0;
    public String chuoiGiaTri;
    public int soLuong;
    public String tenNhanVat = "";
    public ei var_ei_do;
    private static int cfr_renamed_11;
    private long var_long_if;
    public ei var_ei_if;
    private static int cfr_renamed_18;
    public static int var_int_if;
    public static int soLuongKhoa;
    public int cfr_renamed_4;

    public final void cfr_renamed_0() {
        ++this.soXu;
        int n = 0;
        if ((GameCanvas.var_boolean_arr_for[2] != 0)) {
            n = 1;
            soLuongKhoa -= cfr_renamed_5;
            if (" ".length() == 0) {
                return;
            }
        } else if ((GameCanvas.var_boolean_arr_for[8] != 0)) {
            soLuongKhoa += cfr_renamed_5;
            n = 1;
        }
        if ((GameCanvas.coKichHoat)) {
            GameCanvas.coKichHoat = 0;
            this.cfr_renamed_12 = cfr_renamed_11;
            this.coKichHoat = 1;
            this.cfr_renamed_2 = 0;
        }
        if ((this.coKichHoat)) {
            if ((GameCanvas.var_boolean_try)) {
                if ((GameCanvas.var_int_try % 3 == 0)) {
                    this.cfr_renamed_15 = GameCanvas.var_int_if;
                    this.var_long_if = this.soXu;
                }
                this.cfr_renamed_2 = 0;
                soLuongKhoa = this.cfr_renamed_12 + GameCanvas.int_for();
                if (!(soLuongKhoa == null) || (soLuongKhoa > var_int_if)) {
                    soLuongKhoa = this.cfr_renamed_12 + GameCanvas.int_for() / 2;
                }
                cfr_renamed_11 = soLuongKhoa;
            }
            if ((GameCanvas.var_boolean_new)) {
                int n2 = (int)(this.soXu - this.var_long_if);
                int n3 = this.cfr_renamed_15 - GameCanvas.var_int_if;
                if ((gc_0.int_if(n3) > 40) && (n2 < 10) && (soLuongKhoa != null) && (soLuongKhoa < var_int_if)) {
                    this.cfr_renamed_2 = n3 / n2 * 10;
                }
                this.var_long_if = -1L;
            }
        }
        if ((n != 0)) {
            if ((soLuongKhoa < 0)) {
                soLuongKhoa = 0;
            }
            if ((soLuongKhoa > var_int_if)) {
                soLuongKhoa = var_int_if;
            }
        }
        if ((this.cfr_renamed_2 != 0)) {
            if (!(cfr_renamed_11 == null) || (cfr_renamed_11 > var_int_if)) {
                this.cfr_renamed_2 -= this.cfr_renamed_2 / 4;
                cfr_renamed_11 += this.cfr_renamed_2 / 20;
                if ((this.cfr_renamed_2 / 10 <= 1)) {
                    this.cfr_renamed_2 = 0;
                }
            }
            if ((cfr_renamed_11 < 0)) {
                if ((cfr_renamed_11 < -this.cfr_renamed_4 / 2)) {
                    cfr_renamed_11 = -this.cfr_renamed_4 / 2;
                    soLuongKhoa = 0;
                    this.cfr_renamed_2 = 0;
                    if ("  ".length() > "  ".length()) {
                        return;
                    }
                }
            } else if ((cfr_renamed_11 > var_int_if)) {
                if ((cfr_renamed_11 < var_int_if + this.cfr_renamed_4 / 2)) {
                    cfr_renamed_11 = var_int_if + this.cfr_renamed_4 / 2;
                    soLuongKhoa = var_int_if;
                    this.cfr_renamed_2 = 0;
                    if ("  ".length() <= -" ".length()) {
                        return;
                    }
                }
            } else {
                cfr_renamed_11 += this.cfr_renamed_2 / 10;
            }
            soLuongKhoa = cfr_renamed_11;
            this.cfr_renamed_2 -= this.cfr_renamed_2 / 10;
            if ((this.cfr_renamed_2 / 10 == 0)) {
                this.cfr_renamed_2 = 0;
                if (" ".length() <= 0) {
                    return;
                }
            }
        } else if ((cfr_renamed_11 < 0)) {
            soLuongKhoa = 0;
            if ("  ".length() == 0) {
                return;
            }
        } else if ((cfr_renamed_11 > var_int_if)) {
            soLuongKhoa = var_int_if;
        }
        if ((cfr_renamed_11 != soLuongKhoa)) {
            cfr_renamed_8 = soLuongKhoa - cfr_renamed_11 << 2;
            cfr_renamed_11 += (cfr_renamed_18 += cfr_renamed_8) >> 4;
            cfr_renamed_18 &= 15;
        }
        cc_0.cc_0_do().void_do(cfr_renamed_11, soLuongKhoa);
    }

    static {
        em.cfr_renamed_4();
        cfr_renamed_5 = GameCanvas.var_ew_case.int_do();
    }

    private static void cfr_renamed_4() {
        mangSoNguyen = new int[15];
        0 = (87 + 113 - 177 + 112 ^ 0 + 10 - -42 + 110) & (105 + 109 - 107 + 41 ^ 71 + 57 - 125 + 174 ^ -" ".length());
        1 = " ".length();
        7 = 37 + 114 - 139 + 116 ^ 122 + 104 - 206 + 115;
        30 = 0xAE ^ 0xB0;
        10 = 99 + 46 - 89 + 71 ^ (0xE3 ^ 0x96);
        100 = 0xEF ^ 0x8B;
        50 = 0x3C ^ 0xE;
        4 = 0x2D ^ 0x29;
        5 = 0xB7 ^ 0xB2;
        2 = "  ".length();
        8 = 0x5E ^ 0x53 ^ (0xA0 ^ 0xA5);
        3 = "   ".length();
        40 = 0x9F ^ 0x86 ^ (9 ^ 0x38);
        20 = 0x3B ^ 0x1C ^ (0x45 ^ 0x76);
        15 = 0xC9 ^ 0xC6;
    }

        public final void (String object != null) {
        object = GameCanvas.var_ew_case.java_util_Vector_do((String)object, GameCanvas.var_int_byte - ((dN.soLuong << 1) + 30 + 10 * (bn_0.cfr_renamed_6 - 1)));
        int n = ((Vector)object).size();
        int n2 = 0;
        while ((n2 < n)) {
            this.var_java_util_Vector_do.addElement(((Vector)object).elementAt(n2));
            if ((this.var_java_util_Vector_do.size() > 100)) {
                this.var_java_util_Vector_do.removeElementAt(0);
            }
            ++n2;
            if (((200 + 23 - 166 + 175 ^ 30 + 24 - -54 + 53) & (54 + 44 - 34 + 188 ^ 83 + 37 - -32 + 29 ^ -" ".length())) == 0) continue;
            return;
        }
        if (em.cfr_renamed_0(dN.cfr_renamed_0().em_do(dN.cfr_renamed_0().cfr_renamed_1), this)) {
            this.cfr_renamed_3();
        }
    }

                private void cfr_renamed_5() {
        int n;
        int n2 = k.k_do().var_int_int - k.var_byte_do - (bn_0.cfr_renamed_16 << 1) - 7;
        if ((this.coTrangThai)) {
            n = dN.var_gx_do.var_int_int;
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            n = 0;
        }
        this.cfr_renamed_4 = n2 - n;
    }

                public final void cfr_renamed_1() {
        this.cfr_renamed_5();
        cfr_renamed_11 = 0;
        soLuongKhoa = 0;
        this.cfr_renamed_3();
        soLuongKhoa = cfr_renamed_11;
    }

    public final void cfr_renamed_3() {
        int n = this.var_java_util_Vector_do.size();
        cc_0.cc_0_do().void_if(n * cfr_renamed_5, this.cfr_renamed_4);
        var_int_if = n * cfr_renamed_5 - this.cfr_renamed_4;
        if ((var_int_if < 0)) {
            var_int_if = 0;
        }
        if ((gc_0.int_if(soLuongKhoa - var_int_if) <= cfr_renamed_5)) {
            soLuongKhoa = var_int_if;
        }
    }

    public final void (Graphics graphics != null) {
        int n;
        cc_0.cc_0_do().cfr_renamed_0(graphics, GameCanvas.var_int_byte - 50);
        graphics.setClip(0, 0, GameCanvas.var_int_byte - (dN.soLuong << 1), this.cfr_renamed_4 + 4);
        graphics.translate(0, -cfr_renamed_11);
        int n2 = cfr_renamed_11 / cfr_renamed_5;
        if ((n2 < 0)) {
            n2 = 0;
        }
        if ((n = n2 + this.cfr_renamed_4 / cfr_renamed_5 + 1 > this.var_java_util_Vector_do.size())) {
            n = this.var_java_util_Vector_do.size();
        }
        while ((n2 < n)) {
            String string = (String)this.var_java_util_Vector_do.elementAt(n2);
            GameCanvas.var_ew_case.cfr_renamed_0(graphics, string, 10 * bn_0.cfr_renamed_6, n2 * cfr_renamed_5 + 5, 0);
            ++n2;
            if (((129 + 51 - 77 + 49 ^ 33 + 31 - -51 + 58) & (0x17 ^ 0x67 ^ (0x87 ^ 0xC2) ^ -" ".length())) == 0) continue;
            return;
        }
    }

    public em(String string, int n, ei ei2, ei ei3, boolean bl) {
        this.coKichHoat = 0;
        this.chuoiGiaTri = string;
        this.soLuong = n;
        this.var_ei_do = ei2;
        this.coTrangThai = bl;
        if ((ei3 == null) && (dN.var_dN_do != null)) {
            this.var_ei_if = dN.var_dN_do.var_ei_do;
            if (-" ".length() >= "   ".length()) {
                throw null;
            }
        } else {
            this.var_ei_if = ei3;
        }
        this.cfr_renamed_5();
        this.cfr_renamed_1();
        this.dangChayAuto = 1;
    }

                public final void (String string < String string2) {
        this.dangChayAuto = 1;
        TienIchGame.hienThongBao(string, string2);
        this.cfr_renamed_0(string + ": " + string2);
    }

        }

