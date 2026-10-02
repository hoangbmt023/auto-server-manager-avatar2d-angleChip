/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class by
extends ea {
    public byte[] var_byte_arr_do;
    public short var_short_do;
    private static int[] mangSoNguyen;
    public short var_short_if;
    public byte[] var_byte_arr_if;
    public short cfr_renamed_3;
    public long soXu;
    private int var_int_new;
    private int cfr_renamed_2 = 0;
    public short var_short_new;
    public int soLuong;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[11];
        0 = (0xA ^ 0x4C ^ (0x73 ^ 0x6D)) & (7 ^ 0x4D ^ (0x58 ^ 0x4A) ^ -" ".length());
        1 = " ".length();
        83 = 202 + 124 - 166 + 84 ^ 79 + 148 - 153 + 93;
        3 = "   ".length();
        2 = "  ".length();
        10 = 0x84 ^ 0x8E;
        33 = 1 ^ 0x64 ^ (0x4D ^ 9);
        5 = 0x63 ^ 0x66;
        8 = 110 + 137 - 222 + 157 ^ 147 + 10 - 120 + 153;
        3600 = -(0xFFFFF97D & 0x76CF) & (0xFFFFFEDE & 0x7F7D);
        60 = 0x56 ^ 0x62 ^ (0x60 ^ 0x68);
    }

    public by() {
        this.var_int_new = 0;
    }

    private static int (long l > long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

                /*
     * Enabled aggressive block sorting
     */
    public final void void_do() {
        if (by.cfr_renamed_4((System.currentTimeMillis() - this.soXu > 1000L))) {
            Object object;
            if ((this.soLuong > 0)) {
                this.soLuong -= 1;
                if ((this.soLuong == 0)) {
                    object = dh_0.dh_0_do();
                    ((ax_0)object).cfr_renamed_0(83);
                    ((ax_0)object).cfr_renamed_1();
                }
            }
            this.soXu = System.currentTimeMillis();
            object = ak_0.an_do(this.var_short_do);
            if (by.cfr_renamed_3(((an)object).cfr_renamed_1) && (this.cfr_renamed_2 == 0)) {
                this.cfr_renamed_2 = ((an)object).cfr_renamed_1 / 3 << 1;
                this.var_int_new = ((an)object).var_short_do / 2;
                object = this;
                if (by.cfr_renamed_3(((by)object).var_short_new)) {
                    int n = gc_0.int_do(3) + 3;
                    ((by)object).var_byte_arr_do = new byte[n];
                    ((by)object).var_byte_arr_if = new byte[n];
                    int n2 = 0;
                    while (!(n2 >= n)) {
                        ((by)object).var_byte_arr_do[n2] = (byte)(gc_0.int_do(((by)object).cfr_renamed_2 - 10) - (((by)object).cfr_renamed_2 - 10) / 2);
                        ((by)object).var_byte_arr_if[n2] = (byte)(gc_0.int_do(((by)object).var_int_new - 10) - (((by)object).var_int_new - 10) / 2);
                        ++n2;
                    }
                }
            }
        }
    }

                /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics < 0) {
        int n;
        if ((this.cfr_renamed_12 < 0) && (!by.cfr_renamed_1(((aG)this).cfr_renamed_3 * aG.var_int_int + this.cfr_renamed_2 / 2, ek_0.ek_0_do().soLuong) || by.cfr_renamed_0(((aG)this).cfr_renamed_3 * aG.var_int_int - this.cfr_renamed_2 / 2, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte))) {
            return;
        }
        ak_0.cfr_renamed_0(graphics, this.var_short_do, ((aG)this).cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int, 33);
        if ((this.var_short_new > 0) && (this.var_byte_arr_do < 0)) {
            n = 0;
            while (!(n >= this.var_byte_arr_do.length)) {
                ak_0.cfr_renamed_0(graphics, this.cfr_renamed_3, ((aG)this).cfr_renamed_3 * aG.var_int_int + this.var_byte_arr_do[n], this.var_int_if * aG.var_int_int - (ak_0.an_do((short)this.var_short_do).var_short_do / 2 + 5) + this.var_byte_arr_if[n], 3);
                ++n;
            }
        }
        n = ak_0.an_do((short)this.var_short_do).var_short_do + bn_0.var_byte_try;
        if ((this.soLuong > 0)) {
            n += bn_0.cfr_renamed_8;
        }
        ak_0.cfr_renamed_0(graphics, this.cfr_renamed_3, (((aG)this).cfr_renamed_3 - 8) * aG.var_int_int, this.var_int_if * aG.var_int_int - n, 3);
        GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "Lv" + this.var_short_if, ((aG)this).cfr_renamed_3 * aG.var_int_int, this.var_int_if * aG.var_int_int - n - bn_0.var_byte_try / 2, 0);
        if ((this.soLuong > 0)) {
            int n2 = this.soLuong / 3600;
            int n3 = (this.soLuong - n2 * 3600) / 60;
            int n4 = this.soLuong - n2 * 3600 - n3 * 60;
            GameCanvas.var_ew_int.cfr_renamed_0(graphics, String.valueOf(n2) + ":" + n3 + ":" + n4, (((aG)this).cfr_renamed_3 + 3) * aG.var_int_int, this.var_int_if * aG.var_int_int - n + GameCanvas.var_ew_byte.int_do() / 2 + 2 * aG.var_int_int, 2);
        }
    }

        static {
        by.cfr_renamed_1();
    }
}

