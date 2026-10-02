/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from be
 */
final class be_0
implements Runnable {
    private i_0 var_i_0_do;
    private static int[] mangSoNguyen;

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            while (true) {
                byte[] byArray;
                byte by2;
                Object object;
                block21: {
                    int n;
                    int n2;
                    int n3;
                    if ((this.var_i_0_do.boolean_do() ? 1 : 0 != null)) {
                        break;
                    }
                    object = this;
                    by2 = ((be_0)object).var_i_0_do.var_java_io_DataInputStream_do.readByte();
                    if (be_0.cfr_renamed_1(((be_0)object).var_i_0_do.dangChayAuto ? 1 : 0)) {
                        by2 = i_0.cfr_renamed_0(((be_0)object).var_i_0_do, by2);
                    }
                    if (be_0.cfr_renamed_1(((be_0)object).var_i_0_do.dangChayAuto ? 1 : 0)) {
                        byte by3 = ((be_0)object).var_i_0_do.var_java_io_DataInputStream_do.readByte();
                        n3 = ((be_0)object).var_i_0_do.var_java_io_DataInputStream_do.readByte();
                        n2 = (i_0.cfr_renamed_0(((be_0)object).var_i_0_do, by3) & 255) << 8 | i_0.cfr_renamed_0(((be_0)object).var_i_0_do, (byte)n3) & 255;
                        } else {
                        n2 = ((be_0)object).var_i_0_do.var_java_io_DataInputStream_do.readUnsignedShort();
                    }
                    byArray = new byte[n2];
                    n3 = 0;
                    int n4 = 0;
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                    while (true) {
                        if (!(n3 != -1) || (n4 >= n2)) {
                            if (be_0.cfr_renamed_1(((be_0)object).var_i_0_do.dangChayAuto ? 1 : 0)) {
                                n = 0;
                                if (-" ".length() <= 0) break;
                                return;
                            }
                            break block21;
                        }
                        n3 = ((be_0)object).var_i_0_do.var_java_io_DataInputStream_do.read(byArray, n4, n2 - n4);
                        if (!(n3 > 0)) continue;
                        ((be_0)object).var_i_0_do.soLuong += (n4 += n3) + 5;
                        n = i_0.i_0_do().soLuong + i_0.i_0_do().var_int_if;
                        ((be_0)object).var_i_0_do.chuoiGiaTri = String.valueOf(n / 1024) + "." + n % 1024 / 102 + "Kb";
                    }
                    while (!(n >= byArray.length)) {
                        byArray[n] = i_0.cfr_renamed_0(((be_0)object).var_i_0_do, byArray[n]);
                        ++n;
                    }
                }
                object = new ad_0(by2, byArray);
                try {
                    if (be_0.cfr_renamed_3(((ad_0)object).var_byte_do, -27)) {
                        this.cfr_renamed_0((ad_0)object);
                        if ("   ".length() != 0) continue;
                        return;
                    }
                    this.var_i_0_do.var_ft_0_do.void_if((ad_0)object);
                    }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            }
        if ((this.var_i_0_do.coTrangThai)) {
            if ((this.var_i_0_do.var_ft_0_do != null)) {
                if (be_0.cfr_renamed_3((System.currentTimeMillis() - this.var_i_0_do.soXu != 500L))) {
                    this.var_i_0_do.var_ft_0_do.void_do();
                    } else {
                    this.var_i_0_do.var_ft_0_do.cfr_renamed_3();
                }
            }
            if ((i_0.javax_microedition_io_SocketConnection_do(this.var_i_0_do) != null)) {
                i_0.void_do(this.var_i_0_do);
            }
        }
    }

    static {
        be_0.cfr_renamed_0();
    }

    /*
     * Unable to fully structure code
     */
    private void (ad_0 var1_1 != null) {
        var2_2 = var1_1.var_java_io_DataInputStream_do.readByte();
        this.var_i_0_do.var_byte_arr_do = new byte[var2_2];
        var3_3 = 0;
        if (null == null) ** GOTO lbl10
        return;
lbl-1000:
        // 1 sources

        {
            this.var_i_0_do.var_byte_arr_do[var3_3] = var1_1.var_java_io_DataInputStream_do.readByte();
            ++var3_3;
lbl10:
            // 2 sources

            ** while (!be_0.cfr_renamed_1((int)var3_3, (int)var2_2))
        }
lbl11:
        // 1 sources

        var3_3 = 0;
        if (-" ".length() < "  ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            v0 = var3_3 + 1;
            this.var_i_0_do.var_byte_arr_do[v0] = (byte)(this.var_i_0_do.var_byte_arr_do[v0] ^ this.var_i_0_do.var_byte_arr_do[var3_3]);
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!be_0.cfr_renamed_1((int)var3_3, (int)(this.var_i_0_do.var_byte_arr_do.length - 1)))
        }
lbl20:
        // 1 sources

        this.var_i_0_do.dangChayAuto = 1;
    }

            private static void cfr_renamed_0() {
        mangSoNguyen = new int[9];
        255 = (0xB ^ 0x5A) + (163 + 209 - 293 + 143) - (71 + 19 - -46 + 5) + (0xD7 ^ 0x8A);
        8 = 0x52 ^ 0xD ^ (0x90 ^ 0xC7);
        0 = (0x3E ^ 0x7B) & ~(0x1F ^ 0x5A);
        5 = 0x80 ^ 0x85;
        1024 = -(0xFFFFFBFF & 0xE7F) & (0xFFFFBE7E & 0x4FFF);
        102 = 0xD1 ^ 0xBF ^ (0xB3 ^ 0xBB);
        -1 = -" ".length();
        -27 = -(58 + 54 - -10 + 62 ^ 72 + 127 - 186 + 150);
        1 = " ".length();
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        be_0(i_0 i_02) {
        this.var_i_0_do = i_02;
    }

            }

