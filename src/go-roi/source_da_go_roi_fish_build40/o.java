/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class o
extends dd_0 {
    private static int[] mangSoNguyen;
    public byte var_byte_do;
    public short var_short_do;
    public short cfr_renamed_0;
    public int soLuong;
    public short cfr_renamed_2;
    private byte cfr_renamed_8;

        private void cfr_renamed_0() {
        switch (this.var_byte_do) {
            case 0: {
                fh.var_java_util_Vector_case.removeElement(this);
                return;
            }
            case 1: {
                fh.var_java_util_Vector_char.removeElement(this);
                return;
            }
            case 2: {
                fh.var_java_util_Vector_byte.removeElement(this);
                return;
            }
            case 3: {
                fh.var_java_util_Vector_try.removeElement(this);
                }
        }
    }

    public final void void_do() {
        block3: {
            block2: {
                hm hm2 = aa_0.hm_do(this.var_short_do);
                if (!(hm2 > 0)) break block2;
                this.cfr_renamed_8 = (byte)(this.cfr_renamed_8 + 1);
                if (!(this.cfr_renamed_8 >= hm2.var_byte_arr_do.length)) break block3;
            }
            this.cfr_renamed_0();
        }
    }

        static {
        o.cfr_renamed_2();
    }

    public o() {
        int n = 0;
        this.cfr_renamed_2 = (short)n;
        this.cfr_renamed_0 = (short)n;
        this.var_byte_if = (byte)6;
        this.cfr_renamed_8 = (byte)0;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[3];
        0 = (0xA9 ^ 0x9D) & ~(0x17 ^ 0x23);
        6 = 0x80 ^ 0xB8 ^ (0xFC ^ 0xC2);
        1 = " ".length();
    }

            public final void (Graphics graphics > 0) {
        if ((GameCanvas.cfr_renamed_12 > 0) && (GameCanvas.var_en_do == ff_0.cfr_renamed_1())) {
            return;
        }
        hm hm2 = aa_0.hm_do(this.var_short_do);
        if ((hm2 > 0)) {
            if ((this.var_byte_do == 0)) {
                DuLieuNguoiChoi ef2 = fh.ef_do(this.soLuong);
                if ((ef2 > 0)) {
                    ((bm)this).cfr_renamed_2 = ((bm)ef2).cfr_renamed_2 + this.cfr_renamed_0;
                    ((bm)this).cfr_renamed_3 = ((bm)ef2).cfr_renamed_3 + this.cfr_renamed_2;
                    if ((0x5A ^ 0x63 ^ (0x1E ^ 0x23)) <= ((138 + 128 - 70 + 44 ^ 85 + 19 - 6 + 78) & (0x4F ^ 0x32 ^ (0x17 ^ 0x2A) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    this.cfr_renamed_0();
                    return;
                }
            }
            hm2.cfr_renamed_1(graphics, ((bm)this).cfr_renamed_2, ((bm)this).cfr_renamed_3, this.cfr_renamed_8);
        }
    }

    }

