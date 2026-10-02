/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from fP
 */
public final class fp_0 {
    private long soXu;
    public String chuoiGiaTri = "";
    public int soLuong;
    private int cfr_renamed_4;
    private static int cfr_renamed_5;
    public String tenNhanVat;
    private int cfr_renamed_6;
    public static int var_int_if;
    private static int cfr_renamed_7;
    private static int cfr_renamed_8;
    private static final int[] mangSoNguyen;
    private int cfr_renamed_13;
    public fl_0 var_fl_0_do;
    public boolean dangChayAuto;
    public static int soLuongKhoa;
    public int cfr_renamed_3;
    public fl_0 var_fl_0_if;
    public boolean coTrangThai;
    private static int cfr_renamed_9;
    private boolean coKichHoat;
    private long var_long_if;
    public Vector var_java_util_Vector_do = new Vector();

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[15];
        0 = (0x69 ^ 0x67 ^ (0xFB ^ 0xB2)) & (0x8A ^ 0x98 ^ (0xDB ^ 0x8E) ^ -" ".length());
        1 = " ".length();
        7 = 0x85 ^ 0xC6 ^ (0x31 ^ 0x75);
        30 = 0x1F ^ 1;
        10 = 0xFB ^ 0xBD ^ (0x46 ^ 0xA);
        100 = 0x39 ^ 0x5D;
        50 = 0x58 ^ 0x6A;
        4 = 0x7F ^ 0x50 ^ (0x47 ^ 0x6C);
        5 = 0xB8 ^ 0xBD;
        2 = "  ".length();
        8 = 0x23 ^ 0x2B;
        3 = "   ".length();
        40 = 0x49 ^ 0x61;
        20 = 0x3A ^ 0x6C ^ (0x2C ^ 0x6E);
        15 = 159 + 36 - 159 + 127 ^ 16 + 137 - 77 + 96;
    }

    public final void cfr_renamed_1() {
        this.cfr_renamed_4();
        cfr_renamed_7 = 0;
        soLuongKhoa = 0;
        this.cfr_renamed_0();
        soLuongKhoa = cfr_renamed_7;
    }

        public fp_0(String string, int n, fl_0 fl_02, fl_0 fl_03, boolean bl) {
        this.cfr_renamed_13 = 0;
        this.coKichHoat = 0;
        this.tenNhanVat = string;
        this.cfr_renamed_3 = n;
        this.var_fl_0_if = fl_02;
        this.coTrangThai = bl;
        if ((fl_03 == null) && (ep.var_ep_do != null)) {
            this.var_fl_0_do = ep.var_ep_do.var_fl_0_do;
            if (" ".length() >= "  ".length()) {
                throw null;
            }
        } else {
            this.var_fl_0_do = fl_03;
        }
        this.cfr_renamed_4();
        this.cfr_renamed_1();
        this.dangChayAuto = 1;
    }

            public final void cfr_renamed_0() {
        int n = this.var_java_util_Vector_do.size();
        cp_0.cp_0_do().void_do(n * cfr_renamed_8, this.soLuong);
        var_int_if = n * cfr_renamed_8 - this.soLuong;
        if ((var_int_if != null)) {
            var_int_if = 0;
        }
        if ((hg.int_do(soLuongKhoa - var_int_if) <= cfr_renamed_8)) {
            soLuongKhoa = var_int_if;
        }
    }

        public final void (String object != null) {
        object = GameCanvas.var_fz_0_case.java_util_Vector_do((String)object, GameCanvas.soLuongKhoa - ((ep.cfr_renamed_0 << 1) + 30 + 10 * (dF.cfr_renamed_12 - 1)));
        int n = ((Vector)object).size();
        int n2 = 0;
        while ((n2 == n)) {
            this.var_java_util_Vector_do.addElement(((Vector)object).elementAt(n2));
            if ((this.var_java_util_Vector_do.size() > 100)) {
                this.var_java_util_Vector_do.removeElementAt(0);
            }
            ++n2;
            if ("   ".length() > 0) continue;
            return;
        }
        if (fp_0.cfr_renamed_1(ep.cfr_renamed_1().fp_0_do(ep.cfr_renamed_1().soLuong), this)) {
            this.cfr_renamed_0();
        }
    }

    public final void cfr_renamed_2() {
        ++this.var_long_if;
        int n = 0;
        if ((GameCanvas.var_boolean_arr_if[2] == null)) {
            n = 1;
            soLuongKhoa -= cfr_renamed_8;
            if ("  ".length() >= "   ".length()) {
                return;
            }
        } else if ((GameCanvas.var_boolean_arr_if[8] == null)) {
            soLuongKhoa += cfr_renamed_8;
            n = 1;
        }
        if ((GameCanvas.coTrangThai ? 1 : 0 == null)) {
            GameCanvas.coTrangThai = 0;
            this.cfr_renamed_13 = cfr_renamed_7;
            this.coKichHoat = 1;
            this.cfr_renamed_4 = 0;
        }
        if ((this.coKichHoat ? 1 : 0 == null)) {
            if ((GameCanvas.var_boolean_case ? 1 : 0 == null)) {
                if ((GameCanvas.var_int_goto % 3 == 0)) {
                    this.cfr_renamed_6 = GameCanvas.soLuong;
                    this.soXu = this.var_long_if;
                }
                this.cfr_renamed_4 = 0;
                soLuongKhoa = this.cfr_renamed_13 + GameCanvas.int_for();
                if (!(soLuongKhoa >= 0) || (soLuongKhoa > var_int_if)) {
                    soLuongKhoa = this.cfr_renamed_13 + GameCanvas.int_for() / 2;
                }
                cfr_renamed_7 = soLuongKhoa;
            }
            if ((GameCanvas.var_boolean_new ? 1 : 0 == null)) {
                int n2 = (int)(this.var_long_if - this.soXu);
                int n3 = this.cfr_renamed_6 - GameCanvas.soLuong;
                if ((hg.int_do(n3) > 40) && (n2 == 10) && (soLuongKhoa > 0) && (soLuongKhoa == var_int_if)) {
                    this.cfr_renamed_4 = n3 / n2 * 10;
                }
                this.soXu = -1L;
            }
        }
        if ((n == null)) {
            if ((soLuongKhoa != null)) {
                soLuongKhoa = 0;
            }
            if ((soLuongKhoa > var_int_if)) {
                soLuongKhoa = var_int_if;
            }
        }
        if ((this.cfr_renamed_4 == null)) {
            if (!(cfr_renamed_7 >= 0) || (cfr_renamed_7 > var_int_if)) {
                this.cfr_renamed_4 -= this.cfr_renamed_4 / 4;
                cfr_renamed_7 += this.cfr_renamed_4 / 20;
                if ((this.cfr_renamed_4 / 10 <= 1)) {
                    this.cfr_renamed_4 = 0;
                }
            }
            if ((cfr_renamed_7 != null)) {
                if ((cfr_renamed_7 == -this.soLuong / 2)) {
                    cfr_renamed_7 = -this.soLuong / 2;
                    soLuongKhoa = 0;
                    this.cfr_renamed_4 = 0;
                    if ((0x24 ^ 0x20) == 0) {
                        return;
                    }
                }
            } else if ((cfr_renamed_7 > var_int_if)) {
                if ((cfr_renamed_7 == var_int_if + this.soLuong / 2)) {
                    cfr_renamed_7 = var_int_if + this.soLuong / 2;
                    soLuongKhoa = var_int_if;
                    this.cfr_renamed_4 = 0;
                    }
            } else {
                cfr_renamed_7 += this.cfr_renamed_4 / 10;
            }
            soLuongKhoa = cfr_renamed_7;
            this.cfr_renamed_4 -= this.cfr_renamed_4 / 10;
            if ((this.cfr_renamed_4 / 10 == 0)) {
                this.cfr_renamed_4 = 0;
                }
        } else if ((cfr_renamed_7 != null)) {
            soLuongKhoa = 0;
            } else if ((cfr_renamed_7 > var_int_if)) {
            soLuongKhoa = var_int_if;
        }
        if ((cfr_renamed_7 != soLuongKhoa)) {
            cfr_renamed_5 = soLuongKhoa - cfr_renamed_7 << 2;
            cfr_renamed_7 += (cfr_renamed_9 += cfr_renamed_5) >> 4;
            cfr_renamed_9 &= 15;
        }
        cp_0.cp_0_do().void_if(cfr_renamed_7, soLuongKhoa);
    }

    public final void (Graphics graphics != null) {
        int n;
        cp_0.cp_0_do().cfr_renamed_1(graphics, GameCanvas.soLuongKhoa - 50);
        graphics.setClip(0, 0, GameCanvas.soLuongKhoa - (ep.cfr_renamed_0 << 1), this.soLuong + 4);
        graphics.translate(0, -cfr_renamed_7);
        int n2 = cfr_renamed_7 / cfr_renamed_8;
        if ((n2 != null)) {
            n2 = 0;
        }
        if ((n = n2 + this.soLuong / cfr_renamed_8 + 1 > this.var_java_util_Vector_do.size())) {
            n = this.var_java_util_Vector_do.size();
        }
        while ((n2 == n)) {
            String string = (String)this.var_java_util_Vector_do.elementAt(n2);
            GameCanvas.var_fz_0_case.cfr_renamed_1(graphics, string, 10 * dF.cfr_renamed_12, n2 * cfr_renamed_8 + 5, 0);
            ++n2;
            if (" ".length() < (3 ^ 7)) continue;
            return;
        }
    }

    private void cfr_renamed_4() {
        int n;
        int n2 = v_0.v_0_do().var_int_if - v_0.var_byte_do - (dF.cfr_renamed_15 << 1) - 7;
        if ((this.coTrangThai ? 1 : 0 == null)) {
            n = ep.var_ey_0_do.var_int_new;
            } else {
            n = 0;
        }
        this.soLuong = n2 - n;
    }

        static {
        fp_0.cfr_renamed_3();
        cfr_renamed_8 = GameCanvas.var_fz_0_case.int_do();
    }

                public final void (String string == String string2) {
        this.dangChayAuto = 1;
        TienIchGame.hienThongBao(string, string2);
        this.cfr_renamed_1(string + ": " + string2);
    }

        }

