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
 * Renamed from p
 */
public final class p_0
extends dX {
    private int soLuong;
    private static int var_int_if;
    public static p_0 var_p_0_do;
    private static int cfr_renamed_3;
    private static int[] mangSoNguyen;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_2;
    private int cfr_renamed_15;
    private int cfr_renamed_8;
    private int cfr_renamed_12;
    private Vector var_java_util_Vector_do;
    private String chuoiGiaTri = "";
    private boolean dangChayAuto;
    private int cfr_renamed_11;
    private static int cfr_renamed_18;
    private int cfr_renamed_10;
    private static int cfr_renamed_17;
    private String tenNhanVat = "";
    private int cfr_renamed_13;
    private int cfr_renamed_30;
    private byte var_byte_do;
    private int cfr_renamed_22;
    private int cfr_renamed_19;
    private long soXu;
    private int cfr_renamed_20;
    private static int cfr_renamed_14;
    private Vector var_java_util_Vector_if = new Vector();
    private Hashtable var_java_util_Hashtable_do;
    private static int cfr_renamed_23;
    private static int cfr_renamed_24;

    private void (String string == null) {
        int n;
        while ((n = string.indexOf("Ę") != -1)) {
            String string2 = string.substring(0, n);
            this.cfr_renamed_0(string2, "");
            string = string.substring(n + 1);
            n = string.indexOf("\n");
            if ((n != -1)) {
                string2 = string.substring(0, n);
                this.cfr_renamed_0(string2, "Ę");
                string = string.substring(n + 1);
                if ("   ".length() != 0) continue;
                return;
            }
            this.cfr_renamed_0(string, "Ę");
            return;
        }
        this.cfr_renamed_0(string, "");
    }

    private void cfr_renamed_4() {
        this.cfr_renamed_13 = GameCanvas.var_int_byte - 20;
        this.cfr_renamed_20 = GameCanvas.var_int_char - GameCanvas.var_int_else - 20;
    }

    private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.cfr_renamed_1(var1_1);
        GameCanvas.var_gj_0_do.cfr_renamed_0(var1_1, this.cfr_renamed_10, this.cfr_renamed_11, this.cfr_renamed_20, this.cfr_renamed_13, 0, 0, k.k_do().cfr_renamed_15, this.cfr_renamed_4, k.var_byte_do, 1, 1, k.k_do().var_int_arr_for, k.k_do().var_int_arr_if, this.tenNhanVat);
        var1_1.setClip(this.cfr_renamed_10 + 4, this.cfr_renamed_11 + k.var_byte_do + 4 * bn_0.cfr_renamed_6, this.cfr_renamed_13 - 8, this.cfr_renamed_20 - k.var_byte_do - 8 * bn_0.cfr_renamed_6);
        var1_1.translate(this.cfr_renamed_10 + this.cfr_renamed_22, this.cfr_renamed_11 + k.var_byte_do);
        var1_1.translate(0, -p_0.cfr_renamed_18);
        var1_1.setColor(0);
        var2_2 = 0;
        if (((71 ^ 34 ^ (132 ^ 170)) & (212 ^ 156 ^ "   ".length() ^ -" ".length())) == ((205 + 86 - 241 + 164 ^ 126 + 179 - 218 + 95) & (9 + 96 - -50 + 42 ^ 64 + 64 - 24 + 61 ^ -" ".length()))) ** GOTO lbl51
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (ev_0)this.var_java_util_Vector_if.elementAt(var2_2);
            if ((var3_3.var_int_if > p_0.cfr_renamed_18 - 10) && (var3_3.var_int_if < p_0.cfr_renamed_18 + this.cfr_renamed_20)) {
                if ((var3_3.cfr_renamed_1.length() > 2) && p_0.boolean_if((int)var3_3.cfr_renamed_1.substring(0, 1).equals("¶"))) {
                    var4_4 = Integer.parseInt(var3_3.cfr_renamed_1.substring(1, var3_3.cfr_renamed_1.length()), 16);
                    k.cfr_renamed_0(var3_3.cfr_renamed_3, var3_3.var_int_if, GameCanvas.var_int_byte - (var3_3.cfr_renamed_3 << 1), 1, var4_4, var1_1);
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                } else {
                    var4_4 = var3_3.cfr_renamed_3;
                    if (p_0.boolean_if(var3_3.soLuong, 2)) {
                        var4_4 += (this.cfr_renamed_13 - 30) / 2 + 4;
                        } else if (p_0.boolean_if(var3_3.soLuong, 1)) {
                        var4_4 += this.cfr_renamed_13 - 30 + 10;
                    }
                    if ((var3_3.cfr_renamed_1.length() > 2) && p_0.boolean_if((int)var3_3.cfr_renamed_1.substring(0, 1).equals("Ę"))) {
                        GameCanvas.var_ew_case.cfr_renamed_0(var1_1, var3_3.cfr_renamed_1.substring(1, var3_3.cfr_renamed_1.length()), var4_4, var3_3.var_int_if, var3_3.soLuong);
                        if ("  ".length() < 0) {
                            return;
                        }
                    } else if ((var3_3.cfr_renamed_1.length() > 1) && p_0.boolean_if((int)var3_3.cfr_renamed_1.substring(0, 1).equals("0"))) {
                        var1_1.setColor(8654855);
                        var5_5 = GameCanvas.var_ew_if.cfr_renamed_0(String.valueOf(var3_3.cfr_renamed_1.substring(1)) + "") + 20;
                        var1_1.fillRect(var4_4 - var5_5 / 2, var3_3.var_int_if + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_8 / 2 - 1, var5_5, GameCanvas.var_ew_if.int_do());
                        GameCanvas.var_ew_if.cfr_renamed_0(var1_1, String.valueOf(var3_3.cfr_renamed_1.substring(1)) + "", var4_4, var3_3.var_int_if + bn_0.var_byte_new / 2 - bn_0.cfr_renamed_15 / 2, var3_3.soLuong);
                        if (-" ".length() >= 0) {
                            return;
                        }
                    } else {
                        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, var3_3.cfr_renamed_1, var4_4, var3_3.var_int_if, var3_3.soLuong);
                    }
                }
            }
            ++var2_2;
lbl51:
            // 2 sources

            ** while (!p_0.boolean_do((int)var2_2, (int)this.var_java_util_Vector_if.size()))
        }
lbl52:
        // 1 sources

        var2_2 = 0;
        if (-" ".length() <= (221 ^ 193 ^ (121 ^ 97))) ** GOTO lbl61
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (di_0)this.var_java_util_Vector_do.elementAt(var2_2);
            if ((var3_3.cfr_renamed_5 + var3_3.cfr_renamed_4 > p_0.cfr_renamed_18) && (var3_3.cfr_renamed_5 < p_0.cfr_renamed_18 + this.cfr_renamed_20)) {
                var1_1.drawImage((Image)this.var_java_util_Hashtable_do.get(String.valueOf(var3_3.cfr_renamed_3)), var3_3.cfr_renamed_1 * ((this.cfr_renamed_13 - (this.cfr_renamed_22 << 1)) / 2), var3_3.cfr_renamed_5, var3_3.cfr_renamed_0);
            }
            ++var2_2;
lbl61:
            // 2 sources

            ** while (!p_0.boolean_do((int)var2_2, (int)this.var_java_util_Vector_do.size()))
        }
lbl62:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

    public final void cfr_renamed_15() {
        if (p_0.cfr_renamed_5((System.currentTimeMillis() - this.soXu, 1000L == null))) {
            this.soXu = System.currentTimeMillis();
        }
        this.cfr_renamed_5 += 1;
        int n = 0;
        if (p_0.boolean_if(cfr_renamed_24)) {
            cfr_renamed_24 += -cfr_renamed_24 >> 1;
        }
        if (p_0.boolean_if(cfr_renamed_24, -1)) {
            cfr_renamed_24 = 0;
        }
        if (p_0.boolean_if(GameCanvas.coKichHoat ? 1 : 0) && p_0.boolean_if(GameCanvas.boolean_if(this.cfr_renamed_10, this.cfr_renamed_11, this.cfr_renamed_13, this.cfr_renamed_20) ? 1 : 0) && p_0.boolean_do(this.dangChayAuto ? 1 : 0)) {
            this.cfr_renamed_12 = cfr_renamed_18;
            this.dangChayAuto = 1;
            this.cfr_renamed_2 = 0;
        }
        if (p_0.boolean_if(this.dangChayAuto ? 1 : 0)) {
            int n2 = GameCanvas.int_for();
            if (p_0.boolean_if(GameCanvas.var_boolean_try ? 1 : 0)) {
                if (p_0.boolean_do(GameCanvas.var_int_try % 3)) {
                    this.cfr_renamed_8 = GameCanvas.var_int_if;
                    this.cfr_renamed_15 = this.cfr_renamed_5;
                }
                cfr_renamed_14 = this.cfr_renamed_12 + n2;
                this.cfr_renamed_2 = 0;
                if (!(cfr_renamed_14 >= 0) || (cfr_renamed_14 > cfr_renamed_3)) {
                    cfr_renamed_14 = this.cfr_renamed_12 + n2 / 2;
                }
                cfr_renamed_18 = cfr_renamed_14;
            }
            if (p_0.boolean_if(GameCanvas.var_boolean_new ? 1 : 0)) {
                this.dangChayAuto = 0;
                int n3 = this.cfr_renamed_5 - this.cfr_renamed_15;
                int n4 = this.cfr_renamed_8 - GameCanvas.var_int_if;
                if ((gc_0.int_if(n4) > 40) && (n3 < 10) && (cfr_renamed_14 > 0) && (cfr_renamed_14 < cfr_renamed_3)) {
                    this.cfr_renamed_2 = n4 / n3 * 10;
                }
                this.cfr_renamed_15 = -1;
                if ((Math.abs(n2) < 10)) {
                    cfr_renamed_14 = this.cfr_renamed_12 + n2;
                }
            }
        }
        if (p_0.boolean_if(GameCanvas.var_boolean_arr_for[2])) {
            cfr_renamed_14 -= 14;
            n = 1;
            if (-" ".length() != -" ".length()) {
                return;
            }
        } else if (p_0.boolean_if(GameCanvas.var_boolean_arr_for[8])) {
            n = 1;
            cfr_renamed_14 += 14;
        }
        if (p_0.boolean_if(n)) {
            if ((cfr_renamed_14 < 0)) {
                cfr_renamed_14 = 0;
            }
            if ((cfr_renamed_14 > cfr_renamed_3)) {
                cfr_renamed_14 = cfr_renamed_3;
            }
        }
        if (p_0.boolean_if(this.cfr_renamed_2)) {
            if (!(cfr_renamed_18 >= 0) || (cfr_renamed_18 > cfr_renamed_3)) {
                this.cfr_renamed_2 -= this.cfr_renamed_2 / 4;
                cfr_renamed_18 += this.cfr_renamed_2 / 20;
                if ((this.cfr_renamed_2 / 10 <= 1)) {
                    this.cfr_renamed_2 = 0;
                }
            }
            if ((cfr_renamed_18 < 0)) {
                if ((cfr_renamed_18 < -this.cfr_renamed_20 / 2)) {
                    cfr_renamed_18 = -this.cfr_renamed_20 / 2;
                    cfr_renamed_14 = 0;
                    this.cfr_renamed_2 = 0;
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                }
            } else if ((cfr_renamed_18 > cfr_renamed_3)) {
                if ((cfr_renamed_18 < cfr_renamed_3 + this.cfr_renamed_20 / 2)) {
                    cfr_renamed_18 = cfr_renamed_3 + this.cfr_renamed_20 / 2;
                    cfr_renamed_14 = cfr_renamed_3;
                    this.cfr_renamed_2 = 0;
                    if (-"   ".length() > 0) {
                        return;
                    }
                }
            } else {
                cfr_renamed_18 += this.cfr_renamed_2 / 10;
            }
            cfr_renamed_14 = cfr_renamed_18;
            this.cfr_renamed_2 -= this.cfr_renamed_2 / 10;
            if (p_0.boolean_do(this.cfr_renamed_2 / 10)) {
                this.cfr_renamed_2 = 0;
                }
        } else if ((cfr_renamed_18 < 0)) {
            cfr_renamed_14 = 0;
            if ("  ".length() < -" ".length()) {
                return;
            }
        } else if ((cfr_renamed_18 > cfr_renamed_3)) {
            cfr_renamed_14 = cfr_renamed_3;
        }
        if ((cfr_renamed_18 != cfr_renamed_14)) {
            cfr_renamed_17 = cfr_renamed_14 - cfr_renamed_18 << 2;
            cfr_renamed_18 += (cfr_renamed_23 += cfr_renamed_17) >> 4;
            cfr_renamed_23 &= 15;
        }
        super.cfr_renamed_15();
    }

    public p_0() {
        this.var_java_util_Vector_do = new Vector();
        this.cfr_renamed_19 = 5;
        this.soLuong = 5;
        this.cfr_renamed_4 = 30;
        this.cfr_renamed_30 = 0;
        this.cfr_renamed_12 = 0;
        this.dangChayAuto = 0;
        this.cfr_renamed_4();
        this.var_ei_try = new ei(MenuChinhAvatar.cfr_renamed_7, 0);
        var_int_if = bn_0.cfr_renamed_15;
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

            public static p_0 p_0_do() {
        if ((var_p_0_do == null)) {
            var_p_0_do = new p_0();
            return var_p_0_do;
        }
        return var_p_0_do;
    }

        public final void (Hashtable hashtable, String string, String string2, byte by2 == null) {
        int n;
        this.cfr_renamed_5 = 0;
        this.var_ei_new = null;
        if ((by2 != -1)) {
            this.var_ei_new = new ei(MenuChinhAvatar.dg, 1);
        }
        this.var_byte_do = by2;
        this.cfr_renamed_30 = 0;
        this.cfr_renamed_4 = GameCanvas.var_ew_try.cfr_renamed_0(string) + 20 * bn_0.cfr_renamed_6;
        if ((this.cfr_renamed_4 < 50 + 20 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_4 = 50 + 20 * bn_0.cfr_renamed_6;
        }
        this.var_java_util_Hashtable_do = hashtable;
        this.tenNhanVat = string;
        this.chuoiGiaTri = string2;
        this.var_java_util_Vector_if.removeAllElements();
        this.var_java_util_Vector_do.removeAllElements();
        int n2 = 0;
        this.cfr_renamed_19 = 0;
        this.soLuong = -10;
        block2: while ((n = string2.indexOf("µ") != -1)) {
            int n3;
            Object object;
            String string3 = string2.substring(0, n);
            string2 = string2.substring(n + 1, string2.length());
            if (p_0.boolean_if(n2)) {
                int n4;
                n = string3.indexOf(",");
                object = string3.substring(0, n);
                string3 = string3.substring(n + 1, string3.length());
                n = string3.indexOf(",");
                int n5 = Integer.parseInt(string3.substring(0, n));
                if (p_0.boolean_if(Integer.parseInt(string3.substring(n + 1, string3.length())))) {
                    n4 = 1;
                    if (("  ".length() & ~"  ".length()) == -" ".length()) {
                        return;
                    }
                } else {
                    n4 = 0;
                }
                n = n4;
                string3 = (Image)this.var_java_util_Hashtable_do.get(String.valueOf(object));
                int n6 = 0;
                if (p_0.boolean_if(n5, 17)) {
                    n6 = 1;
                    } else if (p_0.boolean_if(n5, 24)) {
                    n6 = 2;
                }
                object = new di_0(Integer.parseInt((String)object), n6, this.soLuong + var_int_if + 5, n5);
                string3.getWidth();
                ((di_0)object).cfr_renamed_4 = string3.getHeight();
                if (p_0.boolean_if(n)) {
                    di_0 di_02 = (di_0)this.var_java_util_Vector_do.elementAt(this.var_java_util_Vector_do.size() - 1);
                    n5 = ((Image)this.var_java_util_Hashtable_do.get(String.valueOf(di_02.cfr_renamed_3))).getHeight();
                    if ((string3.getHeight() > n5)) {
                        di_02.cfr_renamed_5 += string3.getHeight() - n5;
                    }
                    ((di_0)object).cfr_renamed_5 = di_02.cfr_renamed_5 + n5 - string3.getHeight();
                }
                this.soLuong = ((di_0)object).cfr_renamed_5 + string3.getHeight() - 10;
                this.var_java_util_Vector_do.addElement(object);
                string3 = "";
            }
            if (p_0.boolean_if(n2)) {
                n3 = 0;
                } else {
                n3 = n2 = 1;
            }
            while (true) {
                int n7;
                if ((n7 = string3.indexOf("¶") != -1)) {
                    object = string3.substring(0, n7);
                    string3 = string3.substring(n7 + 1, string3.length());
                    try {
                        Integer.parseInt((String)object, 16);
                        this.cfr_renamed_0("¶" + (String)object);
                        this.soLuong -= var_int_if / 2;
                        }
                    catch (Exception exception) {
                        this.cfr_renamed_0((String)object);
                        if (" ".length() == " ".length()) continue;
                        return;
                    }
                    if (" ".length() >= 0) continue;
                    return;
                }
                if (p_0.boolean_do(string3.equals("") ? 1 : 0)) {
                    this.cfr_renamed_0(string3.substring(0, string3.length() - 1));
                }
                if (!p_0.boolean_if(string2.indexOf("µ"), -1) || !(string2.indexOf("¶") != -1)) continue block2;
                string3 = string2;
                string2 = "";
                if (-"   ".length() >= 0) break;
            }
            return;
        }
        this.cfr_renamed_0(string2);
        this.cfr_renamed_22 = 9 * bn_0.cfr_renamed_6;
        if ((this.cfr_renamed_30 < 140 * bn_0.cfr_renamed_6)) {
            this.cfr_renamed_30 = 140 * bn_0.cfr_renamed_6;
        }
        if (p_0.boolean_do(this.cfr_renamed_30, 120) && (this.cfr_renamed_30 < this.cfr_renamed_13 - 30)) {
            this.cfr_renamed_13 = this.cfr_renamed_30 + 20 * bn_0.cfr_renamed_6;
            this.cfr_renamed_22 = 10 * bn_0.cfr_renamed_6;
        }
        if ((this.soLuong + 10 + (var_int_if << 1) < this.cfr_renamed_20 - 30)) {
            this.cfr_renamed_20 = this.soLuong + 10 + (var_int_if << 1) + 20;
        }
        if ((this.cfr_renamed_20 < 80 * bn_0.cfr_renamed_6 + dL.cfr_renamed_19)) {
            this.cfr_renamed_20 = 80 * bn_0.cfr_renamed_6 + dL.cfr_renamed_19;
        }
        if (p_0.cfr_renamed_4(cfr_renamed_3 = this.soLuong - (this.cfr_renamed_20 - k.var_byte_do - 2 * bn_0.cfr_renamed_16 - (var_int_if << 1)))) {
            cfr_renamed_3 = 0;
        }
        cfr_renamed_18 = cfr_renamed_14 = 0;
        this.cfr_renamed_10 = (GameCanvas.var_int_byte - this.cfr_renamed_13) / 2;
        this.cfr_renamed_11 = (GameCanvas.var_int_char - GameCanvas.var_int_else - this.cfr_renamed_20) / 2;
        this.soXu = System.currentTimeMillis();
    }

            private static void cfr_renamed_5() {
        mangSoNguyen = new int[24];
        14 = 46 + 62 - -29 + 15 ^ 79 + 54 - 29 + 46;
        5 = 0x20 ^ 0x25;
        30 = 0x12 ^ 0x25 ^ (0x45 ^ 0x6C);
        0 = (0xD2 ^ 0x93) & ~(0x22 ^ 0x63);
        20 = 0x76 ^ 0x62;
        -1 = -" ".length();
        1 = " ".length();
        2 = "  ".length();
        8 = 4 ^ 0x18 ^ (0x1F ^ 0xB);
        50 = 0x50 ^ 0x62;
        -10 = -(0xB2 ^ 0xC6 ^ (0xEC ^ 0x92));
        17 = 71 + 111 - 39 + 9 ^ 85 + 18 - 10 + 44;
        24 = 63 + 82 - 140 + 169 ^ 53 + 73 - -29 + 27;
        10 = 163 + 84 - 237 + 158 ^ 106 + 136 - 162 + 82;
        16 = 0 ^ 0x10;
        9 = 0x14 ^ 0x1D;
        140 = 16 + 73 - 40 + 91;
        120 = 0x3C ^ 0x44;
        80 = 0x92 ^ 0xC4 ^ (4 ^ 2);
        3 = "   ".length();
        40 = 0x1A ^ 0x2B ^ (9 ^ 0x10);
        4 = 0x36 ^ 0x32;
        15 = 0x63 ^ 0x6C;
        8654855 = -(0xFFFFEFF7 & 0x75A9) & (0xFFFFFFBF & 0x8475E7);
    }

        private void (String string, String string2 == null) {
        block3: {
            int n;
            block4: {
                do {
                    if (p_0.boolean_if(string.equals("") ? 1 : 0)) {
                        return;
                    }
                    int n2 = string.indexOf("ę");
                    if (!(n2 != -1)) break block3;
                    String string3 = string.substring(0, n2);
                    if (p_0.boolean_do(string3.equals("") ? 1 : 0)) {
                        this.cfr_renamed_0(string3, string2, 0);
                    }
                    n = Integer.parseInt(string.substring(n2 + 1, n2 + 2));
                    if (!p_0.cfr_renamed_4(n2 = (string = string.substring(n2 + 2, string.length())).indexOf("\n"), -1)) break block4;
                    this.cfr_renamed_0(string.substring(0, n2), string2, n);
                    string = string.substring(n2 + 1);
                    } while (-" ".length() <= "  ".length());
                return;
            }
            this.cfr_renamed_0(string, string2, n);
            return;
        }
        this.cfr_renamed_0(string, string2, 0);
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                this.var_java_util_Vector_if.removeAllElements();
                this.var_java_util_Vector_do.removeAllElements();
                this.var_java_util_Hashtable_do.clear();
                GameCanvas.var_dX_do = null;
                GameCanvas.cfr_renamed_8();
                var_p_0_do = null;
                return;
            }
            case 1: {
                eq.eq_do().cfr_renamed_5(this.var_byte_do);
            }
        }
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    static {
        p_0.cfr_renamed_5();
        var_int_if = 14;
    }

    public final void void_do() {
        this.cfr_renamed_4();
        this.cfr_renamed_0(this.var_java_util_Hashtable_do, this.tenNhanVat, this.chuoiGiaTri, this.var_byte_do);
    }

        /*
     * Enabled aggressive block sorting
     */
    private void (String object, String string, int n == null) {
        String[] stringArray;
        int n2 = 0;
        if (p_0.cfr_renamed_4(((String)object).indexOf("tem"), -1)) {
            n2 = 1;
            stringArray = GameCanvas.var_ew_case.java_lang_String_arr_do((String)object, this.cfr_renamed_13 - 30 - 8 * bn_0.cfr_renamed_6);
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else {
            stringArray = GameCanvas.var_ew_try.java_lang_String_arr_do((String)object, this.cfr_renamed_13 - 30 - 8 * bn_0.cfr_renamed_6);
        }
        int n3 = 0;
        while (!p_0.boolean_do(n3, stringArray.length)) {
            int n4;
            if (p_0.boolean_if(n2, 1)) {
                n4 = GameCanvas.var_ew_case.cfr_renamed_0(stringArray[n3]);
                if (" ".length() >= "  ".length()) {
                    return;
                }
            } else {
                n4 = GameCanvas.var_ew_try.cfr_renamed_0(stringArray[n3]);
            }
            if ((n4 > this.cfr_renamed_30)) {
                this.cfr_renamed_30 = n4;
            }
            object = new ev_0(this.cfr_renamed_19, this.soLuong += var_int_if, String.valueOf(string) + stringArray[n3]);
            new ev_0(this.cfr_renamed_19, this.soLuong += var_int_if, String.valueOf(string) + stringArray[n3]).soLuong = n;
            this.var_java_util_Vector_if.addElement(object);
            ++n3;
        }
    }
}

