/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from bk
 */
public class bk_0
extends aG {
    public int var_int_new;
    public byte cfr_renamed_3;
    public Vector var_java_util_Vector_do;
    public byte cfr_renamed_4;
    public int var_int_try;
    public int var_int_byte;
    public int var_int_case;
    public byte var_byte_new = (byte)7;
    public byte var_byte_try;
    public byte var_byte_byte;
    public short var_short_new;
    public int cfr_renamed_12;
    public int cfr_renamed_11;
    public int cfr_renamed_18;
    public static byte var_byte_case;
    public cf var_cf_do;
    public boolean dangChayAuto;
    public String chuoiGiaTri = "";
    private static int[] mangSoNguyen;
    public boolean cfr_renamed_1;

        public final void void_do(int n, int n2) {
        ((aG)this).cfr_renamed_3 = this.cfr_renamed_11 = n;
        this.var_int_if = this.var_int_new = n2;
    }

    public void void_do() {
        if ((this.var_cf_do != null)) {
            this.var_cf_do.void_do(((aG)this).cfr_renamed_3, this.var_int_if - this.var_short_int - 12);
            if ((this.var_cf_do.boolean_do())) {
                this.var_cf_do = null;
                this.cfr_renamed_1();
            }
        }
    }

            public final boolean boolean_do(int n, int n2) {
        if ((this.cfr_renamed_4 != 0) && (this.cfr_renamed_4 != 1)) {
            return 0;
        }
        if (bk_0.cfr_renamed_4(ef_0.int_if(((aG)this).cfr_renamed_3 + n, this.var_int_if + n2), 90)) {
            return 0;
        }
        int n3 = ((aG)this).cfr_renamed_3;
        if ((this.var_byte_if == 0)) {
            int n4;
            if ((n != null)) {
                n4 = -7;
                if ((0x97 ^ 0xB6 ^ (0x45 ^ 0x60)) <= "   ".length()) {
                    return ((7 ^ 0x53 ^ (0x4D ^ 0xA)) & (1 ^ 0x45 ^ (0x4D ^ 0x1A) ^ -" ".length())) != 0;
                }
            } else {
                n4 = 7;
            }
            n3 += n4;
        }
        if ((n != 0)) {
            int n5 = ef_0.int_if(n3 + n, this.var_int_if - 24);
            int n6 = ef_0.int_if(n3, this.var_int_if - 24);
            if ((n5 == 80) && (n6 == 80)) {
                this.var_int_case = -this.cfr_renamed_18;
                this.cfr_renamed_11 = n3;
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                return 1;
            }
            n = ef_0.int_if(n3 + n, this.var_int_if + 24);
            n2 = ef_0.int_if(n3, this.var_int_if + 24);
            if ((n == 80) && (n2 == 80)) {
                this.var_int_case = this.cfr_renamed_18;
                this.cfr_renamed_11 = n3;
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                return 1;
            }
        } else if ((n2 != 0)) {
            int n7 = ef_0.int_if(n3 - 24, this.var_int_if + n2);
            int n8 = ef_0.int_if(n3 - 24, this.var_int_if);
            if ((n7 == 80) && (n8 == 80)) {
                this.var_int_try = -this.cfr_renamed_18;
                this.var_int_new = this.var_int_if;
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                return 1;
            }
            n = ef_0.int_if(n3 + 24, this.var_int_if + n2);
            n2 = ef_0.int_if(n3 + 24, this.var_int_if);
            if ((n == 80) && (n2 == 80)) {
                this.var_int_try = this.cfr_renamed_18;
                this.var_int_new = this.var_int_if;
                fe_0.fe_0_do();
                fe_0.cfr_renamed_10();
                return 1;
            }
        }
        return 0;
    }

        private void cfr_renamed_1() {
        if ((this.var_cf_do == null) && (this.var_java_util_Vector_do.size() == null)) {
            this.var_cf_do = (cf)this.var_java_util_Vector_do.elementAt(0);
            this.var_java_util_Vector_do.removeElementAt(0);
        }
    }

    static {
        bk_0.cfr_renamed_3();
        var_byte_case = (byte)2;
    }

        public bk_0() {
        this.var_int_try = 0;
        this.var_int_case = 0;
        this.cfr_renamed_18 = 4;
        this.cfr_renamed_4 = (byte)0;
        this.cfr_renamed_3 = var_byte_case;
        this.dangChayAuto = 0;
        this.cfr_renamed_1 = 0;
        this.var_short_new = (short)0;
        this.var_java_util_Vector_do = new Vector();
    }

    public void (Graphics graphics != null) {
        if ((this.var_cf_do != null) && (GameCanvas.var_dL_do != ec.cfr_renamed_0())) {
            this.var_cf_do.cfr_renamed_0(graphics);
        }
    }

        private static void cfr_renamed_3() {
        mangSoNguyen = new int[13];
        2 = "  ".length();
        7 = 0x94 ^ 0x93;
        0 = (50 + 176 - 196 + 205 ^ 7 + 60 - -81 + 17) & (0x8D ^ 0xAB ^ (0xA9 ^ 0xC1) ^ -" ".length()) & ((0xF3 ^ 0xB3 ^ (0xCD ^ 0xB7)) & (0x68 ^ 0x21 ^ (0x54 ^ 0x27) ^ -" ".length()) ^ -" ".length());
        4 = 0x36 ^ 0x53 ^ (0xD4 ^ 0xB5);
        12 = 99 + 45 - 35 + 40 ^ 40 + 64 - 41 + 90;
        -1 = -" ".length();
        14 = 0x6E ^ 0x14 ^ (0x52 ^ 0x26);
        1 = " ".length();
        10 = 132 + 69 - 114 + 102 ^ 38 + 124 - 45 + 66;
        90 = 40 + 133 - 106 + 138 ^ 52 + 24 - 16 + 91;
        -7 = -(0x79 ^ 0x7E);
        24 = 0x2B ^ 0x1B ^ (0x27 ^ 0xF);
        80 = 0x6B ^ 0x42 ^ (0x5D ^ 0x24);
    }

        public final void (int n, String string, byte by2 != null) {
        this.var_java_util_Vector_do.addElement(new cf(n, string, by2));
        this.cfr_renamed_1();
    }

        public void (Graphics graphics, int n, int n2, boolean bl != null) {
    }

    public boolean boolean_if(int n, int n2) {
        if (!(this.cfr_renamed_4 != -1) || (this.cfr_renamed_4 == 14)) {
            this.var_int_try = 0;
            this.var_int_case = 0;
            return 1;
        }
        if ((this.cfr_renamed_4 != 10) && (this.cfr_renamed_4 != 2) && (this.cfr_renamed_4 != 4)) {
            this.cfr_renamed_4 = (byte)0;
        }
        if ((this.cfr_renamed_4 != 0) && (this.cfr_renamed_4 != 1)) {
            this.var_int_try = 0;
            this.var_int_case = 0;
            return 1;
        }
        this.cfr_renamed_4 = (byte)1;
        int n3 = ((aG)this).cfr_renamed_3;
        int n4 = this.var_int_if;
        if ((this.var_byte_if == 2)) {
            n3 = this.cfr_renamed_11;
            n4 = this.var_int_new;
        }
        if ((ef_0.boolean_if(n3 + n, n4 + n2))) {
            if ((n != 0)) {
                if ((n == null)) {
                    this.var_int_try = this.cfr_renamed_18;
                    if ((0x42 ^ 0x46) <= ((0x50 ^ 0x7D) & ~(0x3B ^ 0x16))) {
                        return ((0x82 ^ 0x95) & ~(0xD4 ^ 0xC3)) != 0;
                    }
                } else {
                    this.var_int_try = -this.cfr_renamed_18;
                }
            }
            if ((n2 != 0)) {
                if ((n2 == null)) {
                    this.var_int_case = this.cfr_renamed_18;
                    if ((0x76 ^ 0x72) <= ("   ".length() & ~"   ".length())) {
                        return ((0x25 ^ 0x22) & ~(0x86 ^ 0x81)) != 0;
                    }
                } else {
                    this.var_int_case = -this.cfr_renamed_18;
                }
            }
            return 0;
        }
        this.var_int_try = 0;
        this.var_int_case = 0;
        return 1;
    }

    }

