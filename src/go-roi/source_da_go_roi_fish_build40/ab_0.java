/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Renamed from aB
 */
public final class ab_0
extends ez {
    private int soLuong;
    private static int var_int_if;
    private boolean dangChayAuto;
    private static int cfr_renamed_2;
    private static int cfr_renamed_3;
    private String chuoiGiaTri = "";
    private Vector var_java_util_Vector_do = new Vector();
    private int cfr_renamed_4;
    private Vector var_java_util_Vector_if = new Vector();
    private int cfr_renamed_5 = 5;
    private static int cfr_renamed_6;
    public static ab_0 var_ab_0_do;
    private int cfr_renamed_7;
    private int cfr_renamed_8;
    private int cfr_renamed_13;
    private long soXu;
    private byte var_byte_do;
    private static int cfr_renamed_9;
    private int cfr_renamed_14;
    private Hashtable var_java_util_Hashtable_do;
    private static int[] mangSoNguyen;
    private int cfr_renamed_21 = 5;
    private int cfr_renamed_10 = 30;
    private static int cfr_renamed_18;
    private String tenNhanVat = "";
    private static int cfr_renamed_30;
    private int cfr_renamed_20;
    private int cfr_renamed_16;
    private int cfr_renamed_23;
    private int cfr_renamed_24;
    private int cfr_renamed_22;

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[24];
        14 = 0x57 ^ 0x59;
        5 = 0x58 ^ 0x5D;
        30 = 0x52 ^ 0x4F ^ "   ".length();
        0 = (0x55 ^ 0x5A) & ~(0xB1 ^ 0xBE);
        20 = 4 ^ 0x10;
        -1 = -" ".length();
        1 = " ".length();
        2 = "  ".length();
        8 = 0x98 ^ 0x90;
        50 = 0x21 ^ 0x13;
        -10 = -(0x51 ^ 0x5B);
        17 = 0x49 ^ 0x3C ^ (0x4B ^ 0x2F);
        24 = 0x79 ^ 0x4D ^ (0x31 ^ 0x1D);
        10 = 20 + 50 - 30 + 103 ^ 115 + 72 - 164 + 110;
        16 = 0x51 ^ 9 ^ (0x15 ^ 0x5D);
        9 = 0x12 ^ 0x71 ^ (0x1C ^ 0x76);
        140 = (6 ^ 0x3B) + (0x8C ^ 0x99) - (0x83 ^ 0xA3) + (0x7F ^ 0x25);
        120 = 0x29 ^ 0x51;
        80 = 0x2C ^ 0x7C;
        3 = "   ".length();
        40 = 0x7B ^ 0x14 ^ (0x47 ^ 0);
        4 = 0x2D ^ 0x29;
        15 = 0x25 ^ 0x2A;
        8654855 = -(0xFFFFEFFB & 0x7FB5) & (0xFFFFFFF7 & 0x847FBF);
    }

    public final void cfr_renamed_6() {
        if (ab_0.cfr_renamed_4((System.currentTimeMillis() - this.soXu, 1000L == null))) {
            this.soXu = System.currentTimeMillis();
        }
        this.cfr_renamed_16 += 1;
        int n = 0;
        if ((cfr_renamed_2 == null)) {
            cfr_renamed_2 += -cfr_renamed_2 >> 1;
        }
        if ((cfr_renamed_2 == -1)) {
            cfr_renamed_2 = 0;
        }
        if ((GameCanvas.coTrangThai ? 1 : 0 == null) && (GameCanvas.boolean_do(this.cfr_renamed_13, this.cfr_renamed_20, this.cfr_renamed_24, this.soLuong) ? 1 : 0 == null) && !(this.dangChayAuto)) {
            this.cfr_renamed_7 = cfr_renamed_6;
            this.dangChayAuto = 1;
            this.cfr_renamed_8 = 0;
        }
        if ((this.dangChayAuto ? 1 : 0 == null)) {
            int n2 = GameCanvas.int_for();
            if ((GameCanvas.var_boolean_case ? 1 : 0 == null)) {
                if ((GameCanvas.var_int_goto % 3 == 0)) {
                    this.cfr_renamed_14 = GameCanvas.soLuong;
                    this.cfr_renamed_22 = this.cfr_renamed_16;
                }
                var_int_if = this.cfr_renamed_7 + n2;
                this.cfr_renamed_8 = 0;
                if (!(var_int_if >= 0) || ab_0.boolean_do(var_int_if, cfr_renamed_3)) {
                    var_int_if = this.cfr_renamed_7 + n2 / 2;
                }
                cfr_renamed_6 = var_int_if;
            }
            if ((GameCanvas.var_boolean_new ? 1 : 0 == null)) {
                this.dangChayAuto = 0;
                int n3 = this.cfr_renamed_16 - this.cfr_renamed_22;
                int n4 = this.cfr_renamed_14 - GameCanvas.soLuong;
                if (ab_0.boolean_do(hg.int_do(n4), 40) && (n3 < 10) && ab_0.boolean_for(var_int_if) && (var_int_if < cfr_renamed_3)) {
                    this.cfr_renamed_8 = n4 / n3 * 10;
                }
                this.cfr_renamed_22 = -1;
                if ((Math.abs(n2) < 10)) {
                    var_int_if = this.cfr_renamed_7 + n2;
                }
            }
        }
        if ((GameCanvas.var_boolean_arr_if[2] == null)) {
            var_int_if -= 14;
            n = 1;
            if ("   ".length() == 0) {
                return;
            }
        } else if ((GameCanvas.var_boolean_arr_if[8] == null)) {
            n = 1;
            var_int_if += 14;
        }
        if ((n == null)) {
            if (ab_0.boolean_int(var_int_if)) {
                var_int_if = 0;
            }
            if (ab_0.boolean_do(var_int_if, cfr_renamed_3)) {
                var_int_if = cfr_renamed_3;
            }
        }
        if ((this.cfr_renamed_8 == null)) {
            if (!(cfr_renamed_6 >= 0) || ab_0.boolean_do(cfr_renamed_6, cfr_renamed_3)) {
                this.cfr_renamed_8 -= this.cfr_renamed_8 / 4;
                cfr_renamed_6 += this.cfr_renamed_8 / 20;
                if ((this.cfr_renamed_8 / 10 <= 1)) {
                    this.cfr_renamed_8 = 0;
                }
            }
            if (ab_0.boolean_int(cfr_renamed_6)) {
                if ((cfr_renamed_6 < -this.soLuong / 2)) {
                    cfr_renamed_6 = -this.soLuong / 2;
                    var_int_if = 0;
                    this.cfr_renamed_8 = 0;
                    if (" ".length() >= (0x28 ^ 0x2C)) {
                        return;
                    }
                }
            } else if (ab_0.boolean_do(cfr_renamed_6, cfr_renamed_3)) {
                if ((cfr_renamed_6 < cfr_renamed_3 + this.soLuong / 2)) {
                    cfr_renamed_6 = cfr_renamed_3 + this.soLuong / 2;
                    var_int_if = cfr_renamed_3;
                    this.cfr_renamed_8 = 0;
                    if ((0x37 ^ 0x33) != (0x50 ^ 0x54)) {
                        return;
                    }
                }
            } else {
                cfr_renamed_6 += this.cfr_renamed_8 / 10;
            }
            var_int_if = cfr_renamed_6;
            this.cfr_renamed_8 -= this.cfr_renamed_8 / 10;
            if ((this.cfr_renamed_8 / 10 == 0)) {
                this.cfr_renamed_8 = 0;
                if ("  ".length() <= ((49 + 115 - 13 + 19 ^ 62 + 30 - -39 + 48) & (50 + 71 - -17 + 34 ^ 165 + 52 - 162 + 126 ^ -" ".length()))) {
                    return;
                }
            }
        } else if (ab_0.boolean_int(cfr_renamed_6)) {
            var_int_if = 0;
            } else if (ab_0.boolean_do(cfr_renamed_6, cfr_renamed_3)) {
            var_int_if = cfr_renamed_3;
        }
        if (ab_0.boolean_if(cfr_renamed_6, var_int_if)) {
            cfr_renamed_30 = var_int_if - cfr_renamed_6 << 2;
            cfr_renamed_6 += (cfr_renamed_9 += cfr_renamed_30) >> 4;
            cfr_renamed_9 &= 15;
        }
        super.cfr_renamed_6();
    }

    private void (String string, String string2 == null) {
        block3: {
            int n;
            block4: {
                do {
                    if ((string.equals("") ? 1 : 0 == null)) {
                        return;
                    }
                    int n2 = string.indexOf("ę");
                    if (!ab_0.boolean_if(n2, -1)) break block3;
                    String string3 = string.substring(0, n2);
                    if (!(string3.equals(""))) {
                        this.cfr_renamed_1(string3, string2, 0);
                    }
                    n = Integer.parseInt(string.substring(n2 + 1, n2 + 2));
                    if (!ab_0.boolean_if(n2 = (string = string.substring(n2 + 2, string.length())).indexOf("\n"), -1)) break block4;
                    this.cfr_renamed_1(string.substring(0, n2), string2, n);
                    string = string.substring(n2 + 1);
                    } while (((0xB0 ^ 0x9F) & ~(0x81 ^ 0xAE)) == 0);
                return;
            }
            this.cfr_renamed_1(string, string2, n);
            return;
        }
        this.cfr_renamed_1(string, string2, 0);
    }

    private static boolean boolean_if(int n, int n2) {
        return n != n2;
    }

            public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_java_util_Vector_do.removeAllElements();
                this.var_java_util_Vector_if.removeAllElements();
                this.var_java_util_Hashtable_do.clear();
                GameCanvas.var_ez_do = null;
                GameCanvas.cfr_renamed_7();
                var_ab_0_do = null;
                return;
            }
            case 1: {
                ft_0.ft_0_do().cfr_renamed_2(this.var_byte_do);
            }
        }
    }

    private void (String string == null) {
        int n;
        while (ab_0.boolean_if(n = string.indexOf("Ę"), -1)) {
            String string2 = string.substring(0, n);
            this.cfr_renamed_1(string2, "");
            string = string.substring(n + 1);
            n = string.indexOf("\n");
            if (ab_0.boolean_if(n, -1)) {
                string2 = string.substring(0, n);
                this.cfr_renamed_1(string2, "Ę");
                string = string.substring(n + 1);
                if ("   ".length() >= " ".length()) continue;
                return;
            }
            this.cfr_renamed_1(string, "Ę");
            return;
        }
        this.cfr_renamed_1(string, "");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void (String object, String string, int n == null) {
        String[] stringArray;
        int n2 = 0;
        if (ab_0.boolean_if(((String)object).indexOf("tem"), -1)) {
            n2 = 1;
            stringArray = GameCanvas.var_fz_0_case.java_lang_String_arr_do((String)object, this.cfr_renamed_24 - 30 - 8 * dF.cfr_renamed_12);
            } else {
            stringArray = GameCanvas.var_fz_0_try.java_lang_String_arr_do((String)object, this.cfr_renamed_24 - 30 - 8 * dF.cfr_renamed_12);
        }
        int n3 = 0;
        while (!(n3 >= stringArray.length)) {
            int n4;
            if ((n2 == 1)) {
                n4 = GameCanvas.var_fz_0_case.cfr_renamed_1(stringArray[n3]);
                if (" ".length() <= -" ".length()) {
                    return;
                }
            } else {
                n4 = GameCanvas.var_fz_0_try.cfr_renamed_1(stringArray[n3]);
            }
            if (ab_0.boolean_do(n4, this.cfr_renamed_4)) {
                this.cfr_renamed_4 = n4;
            }
            object = new fx(this.cfr_renamed_5, this.cfr_renamed_21 += cfr_renamed_18, String.valueOf(string) + stringArray[n3]);
            new fx(this.cfr_renamed_5, this.cfr_renamed_21 += cfr_renamed_18, String.valueOf(string) + stringArray[n3]).cfr_renamed_4 = n;
            this.var_java_util_Vector_do.addElement(object);
            ++n3;
        }
    }

    private static boolean boolean_for(int n) {
        return n > 0;
    }

    private static boolean boolean_int(int n) {
        return n < 0;
    }

        public final void cfr_renamed_0() {
        this.cfr_renamed_4();
        this.cfr_renamed_1(this.var_java_util_Hashtable_do, this.tenNhanVat, this.chuoiGiaTri, this.var_byte_do);
    }

    public ab_0() {
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_7 = 0;
        this.dangChayAuto = 0;
        this.cfr_renamed_4();
        this.var_fl_0_new = new fl_0(MenuChinhAvatar.by, 0);
        cfr_renamed_18 = dF.var_byte_new;
    }

        public final void (Hashtable hashtable, String string, String string2, byte by2 == null) {
        int n;
        this.cfr_renamed_16 = 0;
        ((dF)this).cfr_renamed_3 = null;
        if (ab_0.boolean_if(by2, -1)) {
            ((dF)this).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, 1);
        }
        this.var_byte_do = by2;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_10 = GameCanvas.var_fz_0_try.cfr_renamed_1(string) + 20 * dF.cfr_renamed_12;
        if ((this.cfr_renamed_10 < 50 + 20 * dF.cfr_renamed_12)) {
            this.cfr_renamed_10 = 50 + 20 * dF.cfr_renamed_12;
        }
        this.var_java_util_Hashtable_do = hashtable;
        this.tenNhanVat = string;
        this.chuoiGiaTri = string2;
        this.var_java_util_Vector_do.removeAllElements();
        this.var_java_util_Vector_if.removeAllElements();
        int n2 = 0;
        this.cfr_renamed_5 = 0;
        this.cfr_renamed_21 = -10;
        block2: while (ab_0.boolean_if(n = string2.indexOf("µ"), -1)) {
            int n3;
            Object object;
            String string3 = string2.substring(0, n);
            string2 = string2.substring(n + 1, string2.length());
            if ((n2 == null)) {
                int n4;
                n = string3.indexOf(",");
                object = string3.substring(0, n);
                string3 = string3.substring(n + 1, string3.length());
                n = string3.indexOf(",");
                int n5 = Integer.parseInt(string3.substring(0, n));
                if (ab_0.cfr_renamed_1(Integer.parseInt(string3.substring(n + 1, string3.length())))) {
                    n4 = 1;
                    if (-"  ".length() >= 0) {
                        return;
                    }
                } else {
                    n4 = 0;
                }
                n = n4;
                string3 = (Image)this.var_java_util_Hashtable_do.get(String.valueOf(object));
                int n6 = 0;
                if ((n5 == 17)) {
                    n6 = 1;
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else if ((n5 == 24)) {
                    n6 = 2;
                }
                object = new di_0(Integer.parseInt((String)object), n6, this.cfr_renamed_21 + cfr_renamed_18 + 5, n5);
                string3.getWidth();
                ((di_0)object).cfr_renamed_4 = string3.getHeight();
                if ((n == null)) {
                    di_0 di_02 = (di_0)this.var_java_util_Vector_if.elementAt(this.var_java_util_Vector_if.size() - 1);
                    n5 = ((Image)this.var_java_util_Hashtable_do.get(String.valueOf(di_02.cfr_renamed_0))).getHeight();
                    if (ab_0.boolean_do(string3.getHeight(), n5)) {
                        di_02.cfr_renamed_1 += string3.getHeight() - n5;
                    }
                    ((di_0)object).cfr_renamed_1 = di_02.cfr_renamed_1 + n5 - string3.getHeight();
                }
                this.cfr_renamed_21 = ((di_0)object).cfr_renamed_1 + string3.getHeight() - 10;
                this.var_java_util_Vector_if.addElement(object);
                string3 = "";
            }
            if ((n2 == null)) {
                n3 = 0;
                } else {
                n3 = n2 = 1;
            }
            while (true) {
                int n7;
                if (ab_0.boolean_if(n7 = string3.indexOf("¶"), -1)) {
                    object = string3.substring(0, n7);
                    string3 = string3.substring(n7 + 1, string3.length());
                    try {
                        Integer.parseInt((String)object, 16);
                        this.cfr_renamed_1("¶" + (String)object);
                        this.cfr_renamed_21 -= cfr_renamed_18 / 2;
                        }
                    catch (Exception exception) {
                        this.cfr_renamed_1((String)object);
                        if (((0x77 ^ 0x5D) & ~(0x67 ^ 0x4D)) == 0) continue;
                        return;
                    }
                    return;
                }
                if (!(string3.equals(""))) {
                    this.cfr_renamed_1(string3.substring(0, string3.length() - 1));
                }
                if (!(string2.indexOf("µ") == -1) || !ab_0.boolean_if(string2.indexOf("¶"), -1)) continue block2;
                string3 = string2;
                string2 = "";
                if ("  ".length() != "  ".length()) break;
            }
            return;
        }
        this.cfr_renamed_1(string2);
        this.cfr_renamed_23 = 9 * dF.cfr_renamed_12;
        if ((this.cfr_renamed_4 < 140 * dF.cfr_renamed_12)) {
            this.cfr_renamed_4 = 140 * dF.cfr_renamed_12;
        }
        if ((this.cfr_renamed_4 >= 120) && (this.cfr_renamed_4 < this.cfr_renamed_24 - 30)) {
            this.cfr_renamed_24 = this.cfr_renamed_4 + 20 * dF.cfr_renamed_12;
            this.cfr_renamed_23 = 10 * dF.cfr_renamed_12;
        }
        if ((this.cfr_renamed_21 + 10 + (cfr_renamed_18 << 1) < this.soLuong - 30)) {
            this.soLuong = this.cfr_renamed_21 + 10 + (cfr_renamed_18 << 1) + 20;
        }
        if ((this.soLuong < 80 * dF.cfr_renamed_12 + en.cfr_renamed_10)) {
            this.soLuong = 80 * dF.cfr_renamed_12 + en.cfr_renamed_10;
        }
        if (ab_0.boolean_int(cfr_renamed_3 = this.cfr_renamed_21 - (this.soLuong - v_0.var_byte_do - 2 * dF.cfr_renamed_15 - (cfr_renamed_18 << 1)))) {
            cfr_renamed_3 = 0;
        }
        cfr_renamed_6 = var_int_if = 0;
        this.cfr_renamed_13 = (GameCanvas.soLuongKhoa - this.cfr_renamed_24) / 2;
        this.cfr_renamed_20 = (GameCanvas.var_int_case - GameCanvas.this - this.soLuong) / 2;
        this.soXu = System.currentTimeMillis();
    }

    private void cfr_renamed_4() {
        this.cfr_renamed_24 = GameCanvas.soLuongKhoa - 20;
        this.soLuong = GameCanvas.var_int_case - GameCanvas.this - 20;
    }

            /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.cfr_renamed_13, this.cfr_renamed_20, this.soLuong, this.cfr_renamed_24, 0, 0, v_0.v_0_do().var_int_int, this.cfr_renamed_10, v_0.var_byte_do, 1, 1, v_0.v_0_do().mangSoNguyen, v_0.v_0_do().var_int_arr_if, this.tenNhanVat);
        var1_1.setClip(this.cfr_renamed_13 + 4, this.cfr_renamed_20 + v_0.var_byte_do + 4 * dF.cfr_renamed_12, this.cfr_renamed_24 - 8, this.soLuong - v_0.var_byte_do - 8 * dF.cfr_renamed_12);
        var1_1.translate(this.cfr_renamed_13 + this.cfr_renamed_23, this.cfr_renamed_20 + v_0.var_byte_do);
        var1_1.translate(0, -ab_0.cfr_renamed_6);
        var1_1.setColor(0);
        var2_2 = 0;
        if ("   ".length() != "  ".length()) ** GOTO lbl51
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (fx)this.var_java_util_Vector_do.elementAt(var2_2);
            if (ab_0.boolean_do(var3_3.cfr_renamed_3, ab_0.cfr_renamed_6 - 10) && (var3_3.cfr_renamed_3 < ab_0.cfr_renamed_6 + this.soLuong)) {
                if (ab_0.boolean_do(var3_3.chuoiGiaTri.length(), 2) && ab_0.cfr_renamed_1((int)var3_3.chuoiGiaTri.substring(0, 1).equals("¶"))) {
                    var4_4 = Integer.parseInt(var3_3.chuoiGiaTri.substring(1, var3_3.chuoiGiaTri.length()), 16);
                    v_0.cfr_renamed_1(var3_3.cfr_renamed_2, var3_3.cfr_renamed_3, GameCanvas.soLuongKhoa - (var3_3.cfr_renamed_2 << 1), 1, var4_4, var1_1);
                    if (((216 ^ 198) & ~(216 ^ 198)) != 0) {
                        return;
                    }
                } else {
                    var4_4 = var3_3.cfr_renamed_2;
                    if ((var3_3.cfr_renamed_4 == 2)) {
                        var4_4 += (this.cfr_renamed_24 - 30) / 2 + 4;
                        } else if ((var3_3.cfr_renamed_4 == 1)) {
                        var4_4 += this.cfr_renamed_24 - 30 + 10;
                    }
                    if (ab_0.boolean_do(var3_3.chuoiGiaTri.length(), 2) && ab_0.cfr_renamed_1((int)var3_3.chuoiGiaTri.substring(0, 1).equals("Ę"))) {
                        GameCanvas.var_fz_0_case.cfr_renamed_1(var1_1, var3_3.chuoiGiaTri.substring(1, var3_3.chuoiGiaTri.length()), var4_4, var3_3.cfr_renamed_3, var3_3.cfr_renamed_4);
                        } else if (ab_0.boolean_do(var3_3.chuoiGiaTri.length(), 1) && ab_0.cfr_renamed_1((int)var3_3.chuoiGiaTri.substring(0, 1).equals("0"))) {
                        var1_1.setColor(8654855);
                        var5_5 = GameCanvas.var_fz_0_if.cfr_renamed_1(String.valueOf(var3_3.chuoiGiaTri.substring(1)) + "") + 20;
                        var1_1.fillRect(var4_4 - var5_5 / 2, var3_3.cfr_renamed_3 + dF.var_byte_try / 2 - dF.cfr_renamed_7 / 2 - 1, var5_5, GameCanvas.var_fz_0_if.int_do());
                        GameCanvas.var_fz_0_if.cfr_renamed_1(var1_1, String.valueOf(var3_3.chuoiGiaTri.substring(1)) + "", var4_4, var3_3.cfr_renamed_3 + dF.var_byte_try / 2 - dF.var_byte_new / 2, var3_3.cfr_renamed_4);
                        if ((28 ^ 24) == 0) {
                            return;
                        }
                    } else {
                        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, var3_3.chuoiGiaTri, var4_4, var3_3.cfr_renamed_3, var3_3.cfr_renamed_4);
                    }
                }
            }
            ++var2_2;
lbl51:
            // 2 sources

            ** while (!ab_0.cfr_renamed_3((int)var2_2, (int)this.var_java_util_Vector_do.size()))
        }
lbl52:
        // 1 sources

        var2_2 = 0;
        if (" ".length() == " ".length()) ** GOTO lbl61
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (di_0)this.var_java_util_Vector_if.elementAt(var2_2);
            if (ab_0.boolean_do(var3_3.cfr_renamed_1 + var3_3.cfr_renamed_4, ab_0.cfr_renamed_6) && (var3_3.cfr_renamed_1 < ab_0.cfr_renamed_6 + this.soLuong)) {
                var1_1.drawImage((Image)this.var_java_util_Hashtable_do.get(String.valueOf(var3_3.cfr_renamed_0)), var3_3.cfr_renamed_2 * ((this.cfr_renamed_24 - (this.cfr_renamed_23 << 1)) / 2), var3_3.cfr_renamed_1, var3_3.cfr_renamed_3);
            }
            ++var2_2;
lbl61:
            // 2 sources

            ** while (!ab_0.cfr_renamed_3((int)var2_2, (int)this.var_java_util_Vector_if.size()))
        }
lbl62:
        // 1 sources

        super.cfr_renamed_1(var1_1);
    }

    public static ab_0 cfr_renamed_1() {
        if ((var_ab_0_do == null)) {
            var_ab_0_do = new ab_0();
            return var_ab_0_do;
        }
        return var_ab_0_do;
    }

    static {
        ab_0.cfr_renamed_3();
        cfr_renamed_18 = 14;
    }
}

