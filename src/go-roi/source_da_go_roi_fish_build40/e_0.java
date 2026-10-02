/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from E
 */
public final class e_0
extends fd_0 {
    public long soXu;
    private static int[] mangSoNguyen;
    public int soLuong;
    public short var_short_do;
    public byte[] var_byte_arr_do;
    private int cfr_renamed_4;
    private int cfr_renamed_5 = 0;
    public byte[] var_byte_arr_if;
    public short var_short_if;
    public short cfr_renamed_2;
    public short cfr_renamed_3;

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        block4: {
            if ((this.cfr_renamed_8 < 0) && (!(this.cfr_renamed_2 * bm.var_int_if + this.cfr_renamed_5 / 2 >= fm.fm_do().cfr_renamed_3) || (this.cfr_renamed_2 * bm.var_int_if - this.cfr_renamed_5 / 2 > fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa))) {
                return;
            }
            bz.cfr_renamed_1(var1_1, this.var_short_do, this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if, 33);
            if (!(this.cfr_renamed_3 != null) || !(this.var_byte_arr_if != null)) break block4;
            var2_2 = 0;
            if (((80 ^ 65) & ~(148 ^ 133)) > -" ".length()) ** GOTO lbl12
            return;
lbl-1000:
            // 1 sources

            {
                bz.cfr_renamed_1(var1_1, this.cfr_renamed_2, this.cfr_renamed_2 * bm.var_int_if + this.var_byte_arr_if[var2_2], this.cfr_renamed_3 * bm.var_int_if - (bz.d_0_do((short)this.var_short_do).cfr_renamed_0 / 2 + 5) + this.var_byte_arr_do[var2_2], 3);
                ++var2_2;
lbl12:
                // 2 sources

                ** while (!e_0.cfr_renamed_1((int)var2_2, (int)this.var_byte_arr_if.length))
            }
        }
        var2_2 = bz.d_0_do((short)this.var_short_do).cfr_renamed_0 + dF.cfr_renamed_6;
        if ((this.soLuong != null)) {
            var2_2 += dF.cfr_renamed_7;
        }
        bz.cfr_renamed_1(var1_1, this.cfr_renamed_2, (this.cfr_renamed_2 - 8) * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if - var2_2, 3);
        GameCanvas.var_fz_0_new.cfr_renamed_1(var1_1, "Lv" + this.var_short_if, this.cfr_renamed_2 * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if - var2_2 - dF.cfr_renamed_6 / 2, 0);
        if ((this.soLuong != null)) {
            var3_3 = this.soLuong / 3600;
            var4_4 = (this.soLuong - var3_3 * 3600) / 60;
            var5_5 = this.soLuong - var3_3 * 3600 - var4_4 * 60;
            GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, String.valueOf(var3_3) + ":" + var4_4 + ":" + var5_5, (this.cfr_renamed_2 + 3) * bm.var_int_if, this.cfr_renamed_3 * bm.var_int_if - var2_2 + GameCanvas.var_fz_0_new.int_do() / 2 + 2 * bm.var_int_if, 2);
        }
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        if (e_0.cfr_renamed_0((System.currentTimeMillis() - this.soXu >= 1000L))) {
            Object object;
            if ((this.soLuong != null)) {
                this.soLuong -= 1;
                if ((this.soLuong == 0)) {
                    object = et_0.et_0_do();
                    ((bE)object).cfr_renamed_1(83);
                    ((bE)object).cfr_renamed_0();
                }
            }
            this.soXu = System.currentTimeMillis();
            object = bz.d_0_do(this.var_short_do);
            if (e_0.cfr_renamed_1(((d_0)object).var_short_do) && (this.cfr_renamed_5 == 0)) {
                this.cfr_renamed_5 = ((d_0)object).var_short_do / 3 << 1;
                this.cfr_renamed_4 = ((d_0)object).cfr_renamed_0 / 2;
                object = this;
                if (e_0.cfr_renamed_1(((e_0)object).cfr_renamed_3)) {
                    int n = hg.int_new(3) + 3;
                    ((e_0)object).var_byte_arr_if = new byte[n];
                    ((e_0)object).var_byte_arr_do = new byte[n];
                    int n2 = 0;
                    while (!(n2 >= n)) {
                        ((e_0)object).var_byte_arr_if[n2] = (byte)(hg.int_new(((e_0)object).cfr_renamed_5 - 10) - (((e_0)object).cfr_renamed_5 - 10) / 2);
                        ((e_0)object).var_byte_arr_do[n2] = (byte)(hg.int_new(((e_0)object).cfr_renamed_4 - 10) - (((e_0)object).cfr_renamed_4 - 10) / 2);
                        ++n2;
                    }
                }
            }
        }
    }

    public e_0() {
        this.cfr_renamed_4 = 0;
    }

                        private static void cfr_renamed_0() {
        mangSoNguyen = new int[11];
        0 = (0x62 ^ 0x4C) & ~(0x86 ^ 0xA8);
        1 = " ".length();
        83 = 0x36 ^ 0x65;
        3 = "   ".length();
        2 = "  ".length();
        10 = 0x78 ^ 0x72;
        33 = 51 + 103 - 36 + 25 ^ 123 + 146 - 245 + 150;
        5 = 0x1F ^ 0x22 ^ (0x57 ^ 0x6F);
        8 = 0x8B ^ 0xB3 ^ (0x26 ^ 0x16);
        3600 = 0xFFFFCFB7 & 0x3E58;
        60 = 0x63 ^ 0x5F;
    }

    static {
        e_0.cfr_renamed_0();
    }

        private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }
}

