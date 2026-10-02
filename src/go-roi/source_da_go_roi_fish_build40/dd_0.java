/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from dD
 */
public class dd_0
extends bm {
    public int var_int_new;
    public byte cfr_renamed_2;
    public byte var_byte_int = (byte)7;
    private static int[] mangSoNguyen;
    public int var_int_try;
    public byte var_byte_new;
    public Vector var_java_util_Vector_do;
    public String chuoiGiaTri = "";
    public boolean dangChayAuto;
    public static byte var_byte_try;
    public int var_int_byte;
    public int var_int_case;
    public byte var_byte_byte;
    public short var_short_int;
    public int cfr_renamed_8;
    public cU var_cU_do;
    public boolean cfr_renamed_0;
    public int cfr_renamed_13;
    public int cfr_renamed_9;
    public byte var_byte_case;

    public dd_0() {
        this.var_int_new = 0;
        this.cfr_renamed_13 = 0;
        this.var_int_case = 4;
        this.cfr_renamed_2 = (byte)0;
        this.var_byte_new = var_byte_try;
        this.dangChayAuto = 0;
        this.cfr_renamed_0 = 0;
        this.var_short_int = (short)0;
        this.var_java_util_Vector_do = new Vector();
    }

                    private void cfr_renamed_0() {
        if ((this.var_cU_do > 0) && (this.var_java_util_Vector_do.size() > 0)) {
            this.var_cU_do = (cU)this.var_java_util_Vector_do.elementAt(0);
            this.var_java_util_Vector_do.removeElementAt(0);
        }
    }

    public void void_do() {
        if ((this.var_cU_do == 0)) {
            this.var_cU_do.void_do(((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3 - ((bm)this).cfr_renamed_4 - 12);
            if ((this.var_cU_do.boolean_do())) {
                this.var_cU_do = null;
                this.cfr_renamed_0();
            }
        }
    }

            public final boolean boolean_do(int n, int n2) {
        if ((this.cfr_renamed_2 != 0) && (this.cfr_renamed_2 != 1)) {
            return 0;
        }
        if (dd_0.cfr_renamed_2(fh.int_if(((bm)this).cfr_renamed_2 + n, ((bm)this).cfr_renamed_3 + n2), 90)) {
            return 0;
        }
        int n3 = ((bm)this).cfr_renamed_2;
        if ((this.var_byte_if == 0)) {
            int n4;
            if ((n < 0)) {
                n4 = -7;
                if ("   ".length() <= 0) {
                    return ((0x3C ^ 0xD) & ~(0x74 ^ 0x45)) != 0;
                }
            } else {
                n4 = 7;
            }
            n3 += n4;
        }
        if ((n != 0)) {
            int n5 = fh.int_if(n3 + n, ((bm)this).cfr_renamed_3 - 24);
            int n6 = fh.int_if(n3, ((bm)this).cfr_renamed_3 - 24);
            if ((n5 == 80) && (n6 == 80)) {
                this.cfr_renamed_13 = -this.var_int_case;
                this.cfr_renamed_8 = n3;
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                return 1;
            }
            n = fh.int_if(n3 + n, ((bm)this).cfr_renamed_3 + 24);
            n2 = fh.int_if(n3, ((bm)this).cfr_renamed_3 + 24);
            if ((n == 80) && (n2 == 80)) {
                this.cfr_renamed_13 = this.var_int_case;
                this.cfr_renamed_8 = n3;
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                return 1;
            }
        } else if ((n2 != 0)) {
            int n7 = fh.int_if(n3 - 24, ((bm)this).cfr_renamed_3 + n2);
            int n8 = fh.int_if(n3 - 24, ((bm)this).cfr_renamed_3);
            if ((n7 == 80) && (n8 == 80)) {
                this.var_int_new = -this.var_int_case;
                this.var_int_try = ((bm)this).cfr_renamed_3;
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                return 1;
            }
            n = fh.int_if(n3 + 24, ((bm)this).cfr_renamed_3 + n2);
            n2 = fh.int_if(n3 + 24, ((bm)this).cfr_renamed_3);
            if ((n == 80) && (n2 == 80)) {
                this.var_int_new = this.var_int_case;
                this.var_int_try = ((bm)this).cfr_renamed_3;
                go_0.go_0_do();
                go_0.cfr_renamed_8();
                return 1;
            }
        }
        return 0;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[13];
        2 = "  ".length();
        7 = 0x68 ^ 0x22 ^ (0x43 ^ 0xE);
        0 = (0x6D ^ 0x4D) & ~(0x80 ^ 0xA0);
        4 = 0x7F ^ 0x7B;
        12 = 0xB1 ^ 0xBD;
        -1 = -" ".length();
        14 = 0x30 ^ 0x69 ^ (0x23 ^ 0x74);
        1 = " ".length();
        10 = 0x6E ^ 0x54 ^ (0xA1 ^ 0x91);
        90 = 0 + 205 - 20 + 52 ^ 99 + 24 - -45 + 15;
        -7 = -(0x29 ^ 0x2E);
        24 = 0x99 ^ 0x81;
        80 = 193 + 73 - 217 + 151 ^ 103 + 118 - 124 + 55;
    }

    public boolean boolean_if(int n, int n2) {
        if (!(this.cfr_renamed_2 != -1) || (this.cfr_renamed_2 == 14)) {
            this.var_int_new = 0;
            this.cfr_renamed_13 = 0;
            return 1;
        }
        if ((this.cfr_renamed_2 != 10) && (this.cfr_renamed_2 != 2) && (this.cfr_renamed_2 != 4)) {
            this.cfr_renamed_2 = (byte)0;
        }
        if ((this.cfr_renamed_2 != 0) && (this.cfr_renamed_2 != 1)) {
            this.var_int_new = 0;
            this.cfr_renamed_13 = 0;
            return 1;
        }
        this.cfr_renamed_2 = (byte)1;
        int n3 = ((bm)this).cfr_renamed_2;
        int n4 = ((bm)this).cfr_renamed_3;
        if ((this.var_byte_if == 2)) {
            n3 = this.cfr_renamed_8;
            n4 = this.var_int_try;
        }
        if ((fh.boolean_do(n3 + n, n4 + n2))) {
            if ((n != 0)) {
                if ((n > 0)) {
                    this.var_int_new = this.var_int_case;
                    if (-"  ".length() >= 0) {
                        return ((0x43 ^ 0x45) & ~(0x21 ^ 0x27)) != 0;
                    }
                } else {
                    this.var_int_new = -this.var_int_case;
                }
            }
            if ((n2 != 0)) {
                if ((n2 > 0)) {
                    this.cfr_renamed_13 = this.var_int_case;
                    if (((0xC0 ^ 0x80) & ~(0xF4 ^ 0xB4)) != 0) {
                        return ((0x43 ^ 4) & ~(0xD4 ^ 0x93)) != 0;
                    }
                } else {
                    this.cfr_renamed_13 = -this.var_int_case;
                }
            }
            return 0;
        }
        this.var_int_new = 0;
        this.cfr_renamed_13 = 0;
        return 1;
    }

    public final void (int n, String string, byte by2 == 0) {
        this.var_java_util_Vector_do.addElement(new cU(n, string, by2));
        this.cfr_renamed_0();
    }

    public void (Graphics graphics, int n, int n2, boolean bl == 0) {
    }

    public void (Graphics graphics == 0) {
        if ((this.var_cU_do == 0) && (GameCanvas.var_en_do != ff_0.cfr_renamed_1())) {
            this.var_cU_do.cfr_renamed_1(graphics);
        }
    }

    static {
        dd_0.cfr_renamed_2();
        var_byte_try = (byte)2;
    }

                public final void void_do(int n, int n2) {
        ((bm)this).cfr_renamed_2 = this.cfr_renamed_8 = n;
        ((bm)this).cfr_renamed_3 = this.var_int_try = n2;
    }
}

