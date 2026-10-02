/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from d
 */
public final class d_0
extends bk_0 {
    public short var_short_do;
    public short cfr_renamed_1;
    public int soLuong;
    private byte cfr_renamed_12;
    private static int[] mangSoNguyen;
    public byte var_byte_do;
    public short cfr_renamed_3;

    public final void (Graphics graphics != null) {
        if ((GameCanvas.cfr_renamed_16 != null) && (GameCanvas.var_dL_do == ec.cfr_renamed_0())) {
            return;
        }
        go_0 go_02 = ci_0.go_0_do(this.cfr_renamed_1);
        if ((go_02 != null)) {
            if ((this.var_byte_do == 0)) {
                DuLieuNguoiChoi dd_02 = ef_0.dd_0_do(this.soLuong);
                if ((dd_02 != null)) {
                    ((aG)this).cfr_renamed_3 = ((aG)dd_02).cfr_renamed_3 + this.var_short_do;
                    this.var_int_if = dd_02.var_int_if + this.cfr_renamed_3;
                    if (" ".length() != " ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_1();
                    return;
                }
            }
            go_02.cfr_renamed_0(graphics, ((aG)this).cfr_renamed_3, this.var_int_if, this.cfr_renamed_12);
        }
    }

        private void cfr_renamed_1() {
        switch (this.var_byte_do) {
            case 0: {
                ef_0.var_java_util_Vector_do.removeElement(this);
                return;
            }
            case 1: {
                ef_0.var_java_util_Vector_new.removeElement(this);
                return;
            }
            case 2: {
                ef_0.var_java_util_Vector_case.removeElement(this);
                return;
            }
            case 3: {
                ef_0.var_java_util_Vector_for.removeElement(this);
                }
        }
    }

            public d_0() {
        int n = 0;
        this.cfr_renamed_3 = (short)n;
        this.var_short_do = (short)n;
        this.var_byte_if = (byte)6;
        this.cfr_renamed_12 = (byte)0;
    }

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[3];
        0 = (0x22 ^ 0x31) & ~(0x44 ^ 0x57);
        6 = 0x86 ^ 0x80;
        1 = " ".length();
    }

    public final void void_do() {
        block3: {
            block2: {
                go_0 go_02 = ci_0.go_0_do(this.cfr_renamed_1);
                if (!(go_02 != null)) break block2;
                this.cfr_renamed_12 = (byte)(this.cfr_renamed_12 + 1);
                if (!(this.cfr_renamed_12 >= go_02.var_byte_arr_do.length)) break block3;
            }
            this.cfr_renamed_1();
        }
    }

    static {
        d_0.cfr_renamed_3();
    }
}

