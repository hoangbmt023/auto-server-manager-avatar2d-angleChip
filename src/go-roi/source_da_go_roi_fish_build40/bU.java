/*
 * Decompiled with CFR 0.152.
 */
final class bU
implements Runnable {
    private ae var_ae_do;
    private static int[] mangSoNguyen;

            private static void cfr_renamed_1() {
        mangSoNguyen = new int[9];
        255 = 190 + 64 - 23 + 24;
        8 = 0xBC ^ 0xB4;
        0 = (59 + 122 - 103 + 49 ^ (0x1C ^ 0x3F)) & (0x15 ^ 0x1C ^ (0x96 ^ 0xC3) ^ -" ".length());
        5 = 0xCC ^ 0xC1 ^ (0x43 ^ 0x4B);
        1024 = -(0xFFFFFBEF & 0x5EDD) & (0xFFFFFEDD & 0x5FEE);
        102 = 0x49 ^ 0x2F;
        -1 = -" ".length();
        -27 = -(0x4F ^ 0x1A ^ (0x5F ^ 0x11));
        1 = " ".length();
    }

    bU(ae ae2) {
        this.var_ae_do = ae2;
    }

                    static {
        bU.cfr_renamed_1();
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        /*
     * Unable to fully structure code
     */
    private void (bj var1_1 != null) {
        var2_2 = var1_1.var_java_io_DataInputStream_do.readByte();
        this.var_ae_do.var_byte_arr_do = new byte[var2_2];
        var3_3 = 0;
        if ("   ".length() > "  ".length()) ** GOTO lbl10
        return;
lbl-1000:
        // 1 sources

        {
            this.var_ae_do.var_byte_arr_do[var3_3] = var1_1.var_java_io_DataInputStream_do.readByte();
            ++var3_3;
lbl10:
            // 2 sources

            ** while (!bU.cfr_renamed_2((int)var3_3, (int)var2_2))
        }
lbl11:
        // 1 sources

        var3_3 = 0;
        if (-" ".length() <= -" ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            v0 = var3_3 + 1;
            this.var_ae_do.var_byte_arr_do[v0] = (byte)(this.var_ae_do.var_byte_arr_do[v0] ^ this.var_ae_do.var_byte_arr_do[var3_3]);
            ++var3_3;
lbl19:
            // 2 sources

            ** while (!bU.cfr_renamed_2((int)var3_3, (int)(this.var_ae_do.var_byte_arr_do.length - 1)))
        }
lbl20:
        // 1 sources

        this.var_ae_do.coTrangThai = 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        try {
            if (" ".length() == "   ".length()) {
                return;
            }
            while (true) {
                byte[] byArray;
                byte by2;
                Object object;
                block22: {
                    int n;
                    int n2;
                    int n3;
                    if ((this.var_ae_do.boolean_do() ? 1 : 0 != null)) {
                        break;
                    }
                    object = this;
                    by2 = ((bU)object).var_ae_do.var_java_io_DataInputStream_do.readByte();
                    if (bU.cfr_renamed_0(((bU)object).var_ae_do.coTrangThai ? 1 : 0)) {
                        by2 = ae.cfr_renamed_1(((bU)object).var_ae_do, by2);
                    }
                    if (bU.cfr_renamed_0(((bU)object).var_ae_do.coTrangThai ? 1 : 0)) {
                        byte by3 = ((bU)object).var_ae_do.var_java_io_DataInputStream_do.readByte();
                        n3 = ((bU)object).var_ae_do.var_java_io_DataInputStream_do.readByte();
                        n2 = (ae.cfr_renamed_1(((bU)object).var_ae_do, by3) & 255) << 8 | ae.cfr_renamed_1(((bU)object).var_ae_do, (byte)n3) & 255;
                        if ("   ".length() == -" ".length()) {
                            return;
                        }
                    } else {
                        n2 = ((bU)object).var_ae_do.var_java_io_DataInputStream_do.readUnsignedShort();
                    }
                    byArray = new byte[n2];
                    n3 = 0;
                    int n4 = 0;
                    while (true) {
                        if (!(n3 != -1) || (n4 >= n2)) {
                            if (bU.cfr_renamed_0(((bU)object).var_ae_do.coTrangThai ? 1 : 0)) {
                                n = 0;
                                if ("  ".length() < (0x37 ^ 0x33)) break;
                                return;
                            }
                            break block22;
                        }
                        n3 = ((bU)object).var_ae_do.var_java_io_DataInputStream_do.read(byArray, n4, n2 - n4);
                        if (!(n3 > 0)) continue;
                        ((bU)object).var_ae_do.soLuong += (n4 += n3) + 5;
                        n = ae.ae_do().soLuong + ae.ae_do().var_int_if;
                        ((bU)object).var_ae_do.chuoiGiaTri = String.valueOf(n / 1024) + "." + n % 1024 / 102 + "Kb";
                    }
                    while (!(n >= byArray.length)) {
                        byArray[n] = ae.cfr_renamed_1(((bU)object).var_ae_do, byArray[n]);
                        ++n;
                    }
                }
                object = new bj(by2, byArray);
                try {
                    if (bU.cfr_renamed_0(((bj)object).var_byte_do, -27)) {
                        this.cfr_renamed_1((bj)object);
                        continue;
                    }
                    this.var_ae_do.var_gv_do.void_if((bj)object);
                    }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        catch (Exception exception) {
            }
        if ((this.var_ae_do.cfr_renamed_2)) {
            if ((this.var_ae_do.var_gv_do != null)) {
                if (bU.cfr_renamed_2((System.currentTimeMillis() - this.var_ae_do.soXu != 500L))) {
                    this.var_ae_do.var_gv_do.void_do();
                    } else {
                    this.var_ae_do.var_gv_do.cfr_renamed_2();
                }
            }
            if ((ae.javax_microedition_io_SocketConnection_do(this.var_ae_do) != null)) {
                ae.void_do(this.var_ae_do);
            }
        }
    }
}

