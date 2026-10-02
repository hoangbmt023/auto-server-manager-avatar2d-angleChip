/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AutoKimCuong
extends NhiemVuAutoBase {
    public static boolean dangChayAuto;
    public boolean coTrangThai;
    public static int soLuong;
    public static ad var_ad_do;
    public static boolean coKichHoat;
    private static final String tenNhanVat;
    private fa[][] var_fa_arr_arr_do;
    public static boolean var_boolean_int;
    public long soXu = 0L;
    public static int var_int_if;
    private boolean cfr_renamed_15;
    public String chuoiGiaTri;
    public static byte var_byte_do;
    private static AutoKimCuong var_X_do;
    public static boolean cfr_renamed_5;
    public long var_long_if;
    public static byte var_byte_if;
    private static final int[] mangSoNguyen;
    private long var_long_for;
    private int var_int_int;
    private boolean cfr_renamed_8;
    public static boolean cfr_renamed_2;
    public static int soLuongKhoa;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static void cfr_renamed_5() {
        if (AutoKimCuong.boolean_do(cfr_renamed_2 ? 1 : 0) && AutoKimCuong.boolean_do(AutoFarm.var_byte_if)) {
            AutoController.batAuto(new AutoLaiBuon());
            return;
        }
        AutoController.batAuto(new AutoFarm());
    }

    public final void void_do() {
        super.cfr_renamed_13();
        this.var_int_int = 0;
        this.coTrangThai = 0;
        this.var_long_for = 45000L + (long)(TienIchGame.int_do(0, 45) * 1000);
        this.var_long_if = var_int_if * 60000;
        this.chuoiGiaTri = bl_0.java_lang_String_do(bl_0.soLuong + 4);
        this.cfr_renamed_15 = 0;
        this.cfr_renamed_8 = 0;
        var_byte_do = (byte)0;
    }

                private int[] int_arr_do() {
        int n;
        short[] sArray = new short[64];
        int n2 = 0;
        int n3 = 0;
        while ((n3 < 8)) {
            int n4 = 0;
            while ((n4 < 8)) {
                sArray[n2] = this.var_fa_arr_arr_do[n3][n4].var_short_do;
                ++n2;
                ++n4;
                if (-" ".length() <= ((2 ^ 0x37 ^ (0x6E ^ 0x46)) & (0x87 ^ 0xC4 ^ (0x7E ^ 0x20) ^ -" ".length()))) continue;
                return null;
            }
            ++n3;
            if (" ".length() != 0) continue;
            return null;
        }
        int[] nArray = new int[2];
        nArray[0] = -1;
        nArray[1] = -1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[2];
        nArray3[0] = -1;
        nArray3[1] = -1;
        int[] nArray4 = nArray3;
        n2 = 0;
        int n5 = 0;
        while ((n5 < 8)) {
            n = 0;
            while ((n < 8)) {
                int[] nArray5 = new int[2];
                nArray5[0] = -1;
                nArray5[1] = -1;
                int[] nArray6 = nArray5;
                if ((n < 7) && (n2 + 1 < 64) && (sArray[n2] == sArray[n2 + 1])) {
                    if ((n > 1) && (n2 - 2 >= 0) && (sArray[n2] == sArray[n2 - 2])) {
                        nArray6[0] = n2 - 2;
                        nArray6[1] = n2 - 1;
                        if (((0x4B ^ 0x4D ^ (7 ^ 0x5A) & ~(0xEA ^ 0xB7)) & (0x5A ^ 0x51 ^ (0x35 ^ 0x38) ^ -" ".length())) < 0) {
                            return null;
                        }
                    } else if ((n < 5) && (n2 + 3 < 64) && (sArray[n2] == sArray[n2 + 3])) {
                        nArray6[0] = n2 + 3;
                        nArray6[1] = n2 + 2;
                    }
                    if ((nArray6[1] == -1) && (n5 != null)) {
                        if ((n != null) && (n2 - 9 >= 0) && (sArray[n2] == sArray[n2 - 9])) {
                            nArray6[0] = n2 - 9;
                            nArray6[1] = n2 - 1;
                            if ((9 ^ 0xD) != (0x35 ^ 0x31)) {
                                return null;
                            }
                        } else if ((n < 6) && (n2 - 6 >= 0) && (sArray[n2] == sArray[n2 - 6])) {
                            nArray6[0] = n2 - 6;
                            nArray6[1] = n2 + 2;
                        }
                    }
                    if ((nArray6[1] == -1) && (n5 < 7)) {
                        if ((n != null) && (n2 + 7 < 64) && (sArray[n2] == sArray[n2 + 7])) {
                            nArray6[0] = n2 + 7;
                            nArray6[1] = n2 - 1;
                            if ("   ".length() != "   ".length()) {
                                return null;
                            }
                        } else if ((n < 6) && (n2 + 10 < 64) && (sArray[n2] == sArray[n2 + 10])) {
                            nArray6[0] = n2 + 10;
                            nArray6[1] = n2 + 2;
                        }
                    }
                }
                if ((nArray6[1] == -1) && (n < 6) && (n2 + 2 < 64) && (sArray[n2] == sArray[n2 + 2])) {
                    if ((n5 != null) && (n2 - 7 >= 0) && (sArray[n2] == sArray[n2 - 7])) {
                        nArray6[0] = n2 - 7;
                        nArray6[1] = n2 + 1;
                        if (" ".length() == 0) {
                            return null;
                        }
                    } else if ((n5 < 7) && (n2 + 9 < 64) && (sArray[n2] == sArray[n2 + 9])) {
                        nArray6[0] = n2 + 9;
                        nArray6[1] = n2 + 1;
                    }
                }
                if ((nArray6[0] != -1) && (nArray6[1] != -1)) {
                    nArray2 = nArray6;
                    if ((var_byte_if <= 5) && (sArray[n2] == var_byte_if)) {
                        nArray4 = nArray6;
                    }
                }
                ++n2;
                ++n;
                return null;
            }
            ++n5;
            if ("   ".length() > -" ".length()) continue;
            return null;
        }
        if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
            return nArray4;
        }
        if ((var_byte_if > 5) && (nArray2[0] != -1) && (nArray2[1] != -1)) {
            return nArray2;
        }
        int[] nArray7 = nArray2;
        int[] nArray8 = new int[2];
        nArray8[0] = -1;
        nArray8[1] = -1;
        nArray2 = nArray8;
        int[] nArray9 = new int[2];
        nArray9[0] = -1;
        nArray9[1] = -1;
        nArray4 = nArray9;
        n = 0;
        int n6 = 0;
        n2 = 0;
        while ((n2 < 8)) {
            int n7 = 0;
            while ((n7 < 8)) {
                int[] nArray10 = new int[2];
                nArray10[0] = -1;
                nArray10[1] = -1;
                int[] nArray11 = nArray10;
                if ((n2 < 7) && (n + 8 < 64) && (sArray[n] == sArray[n + 8])) {
                    if ((n2 > 1) && (n - 16 >= 0) && (sArray[n] == sArray[n - 16])) {
                        nArray11[0] = n - 16;
                        nArray11[1] = n - 8;
                        if (" ".length() > "   ".length()) {
                            return null;
                        }
                    } else if ((n2 < 5) && (n + 24 < 64) && (sArray[n] == sArray[n + 24])) {
                        nArray11[0] = n + 24;
                        nArray11[1] = n + 16;
                    }
                    if ((nArray11[1] == -1) && (n2 != null)) {
                        if ((n7 != null) && (n - 9 >= 0) && (sArray[n] == sArray[n - 9])) {
                            nArray11[0] = n - 9;
                            nArray11[1] = n - 8;
                            if ((0xD4 ^ 0xBC ^ (0xD0 ^ 0xBC)) <= " ".length()) {
                                return null;
                            }
                        } else if ((n7 < 7) && (n - 7 >= 0) && (sArray[n] == sArray[n - 7])) {
                            nArray11[0] = n - 7;
                            nArray11[1] = n - 8;
                        }
                    }
                    if ((nArray11[1] == -1) && (n2 < 6)) {
                        if ((n7 != null) && (n + 15 < 64) && (sArray[n] == sArray[n + 15])) {
                            nArray11[0] = n + 15;
                            nArray11[1] = n + 16;
                            if ((30 + 168 - 91 + 65 ^ 76 + 30 - 99 + 161) > (0x58 ^ 0x77 ^ (0xA3 ^ 0x88))) {
                                return null;
                            }
                        } else if ((n7 < 7) && (n + 17 < 64) && (sArray[n] == sArray[n + 17])) {
                            nArray11[0] = n + 17;
                            nArray11[1] = n + 16;
                        }
                    }
                }
                if ((nArray11[1] == -1) && (n2 < 6) && (n + 16 < 64) && (sArray[n] == sArray[n + 16])) {
                    if ((n7 != null) && (n + 7 < 64) && (sArray[n] == sArray[n + 7])) {
                        nArray11[0] = n + 7;
                        nArray11[1] = n + 8;
                        } else if ((n7 < 7) && (n + 9 < 64) && (sArray[n] == sArray[n + 9])) {
                        nArray11[0] = n + 9;
                        nArray11[1] = n + 8;
                    }
                }
                if ((nArray11[0] != -1) && (nArray11[1] != -1)) {
                    nArray2 = nArray11;
                    if ((var_byte_if <= 5) && (sArray[n] == var_byte_if)) {
                        nArray4 = nArray11;
                    }
                }
                ++n;
                ++n7;
                if (" ".length() != 0) continue;
                return null;
            }
            if ((n6 >= 5)) {
                if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
                    return nArray4;
                }
                if ((var_byte_if > 5) && (nArray2[0] != -1) && (nArray2[1] != -1)) {
                    return nArray2;
                }
            }
            ++n6;
            ++n2;
            return null;
        }
        if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
            return nArray4;
        }
        if ((nArray7[0] != -1) && (nArray7[1] != -1)) {
            return nArray7;
        }
        return nArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(cfr_renamed_5);
            dataOutputStream.writeInt(var_int_if);
            dataOutputStream.writeBoolean(cfr_renamed_2);
            dataOutputStream.writeByte(var_byte_if);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.luuDuLieu("DiamondSettings", byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

            public final void void_do(int n) {
        this.var_int_int = n;
    }

        public final void (fa[][] faArray == null) {
        this.var_int_int = 3;
        this.var_fa_arr_arr_do = faArray;
    }

    public final boolean boolean_do(String string) {
        if ((string.equals(MenuChinhAvatar.H))) {
            this.var_int_int = 5;
            return 1;
        }
        if ((string.equals(MenuChinhAvatar.J))) {
            this.var_int_int = 6;
            return 1;
        }
        if ((string.equals(tenNhanVat))) {
            TienIchGame.this();
            if ((ad.var_byte_do != 1)) {
                return 1;
            }
            return 0;
        }
        return super.boolean_do(string);
    }

    public final String toString() {
        return "Auto kim cương";
    }

            private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public final void (String string <= String string2) {
        if ((string.equals("admin"))) {
            if ((string2.startsWith("Rương của bạn đã đầy"))) {
                this.coTrangThai = 1;
                return;
            }
            if ((string2.startsWith("Bạn nhận được một"))) {
                if ((string2.indexOf("kim cương xanh") != -1)) {
                    if ((coKichHoat)) {
                        eq.eq_do().void_if(2135, 1);
                        return;
                    }
                    soLuongKhoa += 1;
                    return;
                }
                if ((string2.indexOf("ngọc huyền bí") != -1)) {
                    if ((dangChayAuto)) {
                        eq.eq_do().void_if(2136, 1);
                        return;
                    }
                    soLuong += 1;
                }
            }
        }
    }

        protected final void void_for() {
        if (AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() - this.var_boolean_int <= 600000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if (!AutoKimCuong.boolean_do(GameCanvas.var_dL_do instanceof a_0) || !AutoKimCuong.boolean_do(GameCanvas.var_dL_do instanceof fk) || !AutoKimCuong.boolean_do(GameCanvas.var_dL_do.boolean_do(a_0.var_a_0_do) ? 1 : 0) || AutoKimCuong.cfr_renamed_4(GameCanvas.var_dL_do.boolean_do(fk.fk_do()) ? 1 : 0)) {
            if ((this.coTrangThai) && (!AutoKimCuong.boolean_do(coKichHoat ? 1 : 0) || (dangChayAuto)) && AutoKimCuong.boolean_do(this.cfr_renamed_15 ? 1 : 0)) {
                this.cfr_renamed_15 = 1;
                int n = 0;
                if ((coKichHoat) && (dangChayAuto)) {
                    n = super.int_do(4);
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                } else if ((dangChayAuto)) {
                    n = super.int_do(3);
                    if ((0x1D ^ 0x19) == " ".length()) {
                        return;
                    }
                } else if ((coKichHoat)) {
                    n = super.int_do(2);
                }
                if ((n != null)) {
                    this.coTrangThai = 0;
                }
            }
            switch (this.var_int_int) {
                case 1: {
                    this.var_int_int = 0;
                    this.var_boolean_int = System.currentTimeMillis();
                    if ((var_boolean_int) && (this.coTrangThai)) {
                        NhiemVuAutoBase.boolean_do();
                        this.coTrangThai = 0;
                        AutoController.batAuto(new AutoBanDa());
                        return;
                    }
                    if ((cfr_renamed_5) && AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() <= this.soXu))) {
                        NhiemVuAutoBase.boolean_do();
                        this.soXu = System.currentTimeMillis() + this.var_long_if;
                        AutoKimCuong.cfr_renamed_5();
                        return;
                    }
                    if (AutoKimCuong.boolean_do(this.cfr_renamed_8 ? 1 : 0)) {
                        this.cfr_renamed_8 = 1;
                        super.int_do(0);
                        }
                    TienIchGame.hienThongBao(1000L);
                    a_0.cfr_renamed_10();
                    return;
                }
                case 2: {
                    this.var_int_int = 0;
                    this.var_boolean_int = System.currentTimeMillis();
                    if ((var_boolean_int) && (this.coTrangThai)) {
                        NhiemVuAutoBase.boolean_do();
                        this.coTrangThai = 0;
                        AutoController.batAuto(new AutoBanDa());
                        return;
                    }
                    if ((cfr_renamed_5) && AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() <= this.soXu))) {
                        NhiemVuAutoBase.boolean_do();
                        this.soXu = System.currentTimeMillis() + this.var_long_if;
                        AutoKimCuong.cfr_renamed_5();
                        return;
                    }
                    if (AutoKimCuong.boolean_do(this.cfr_renamed_8 ? 1 : 0)) {
                        this.cfr_renamed_8 = 1;
                        super.int_do(0);
                        }
                    TienIchGame.hienThongBao(1000L);
                    a_0.var_a_0_do.cfr_renamed_5();
                    return;
                }
                case 4: {
                    this.var_int_int = 0;
                    this.var_boolean_int = System.currentTimeMillis();
                    TienIchGame.hienThongBao(2000L);
                    fk.fk_do().cfr_renamed_22();
                    if ((var_boolean_int) && (this.coTrangThai)) {
                        NhiemVuAutoBase.boolean_do();
                        this.coTrangThai = 0;
                        TienIchGame.hienThongBao(1000L);
                        AutoController.batAuto(new AutoBanDa());
                        return;
                    }
                    if (!(cfr_renamed_5) || !AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() <= this.soXu))) break;
                    NhiemVuAutoBase.boolean_do();
                    TienIchGame.hienThongBao(1000L);
                    this.soXu = System.currentTimeMillis() + this.var_long_if;
                    AutoKimCuong.cfr_renamed_5();
                    return;
                }
                case 3: {
                    TienIchGame.hienThongBao(1000L);
                    int[] nArray = this.int_arr_do();
                    fk fk2 = fk.fk_do();
                    if ((nArray[1] != -1)) {
                        fk2.soLuong = nArray[0];
                        fk2.var_int_if = nArray[1];
                        fk2.cfr_renamed_11();
                        if (-(13 + 67 - 31 + 111 ^ 148 + 126 - 257 + 147) > 0) {
                            return;
                        }
                    } else {
                        fk2.cfr_renamed_12();
                    }
                    this.var_int_int = 0;
                    this.var_fa_arr_arr_do = null;
                    this.var_boolean_int = System.currentTimeMillis();
                    return;
                }
                case 5: {
                    this.var_int_int = 0;
                    this.var_boolean_int = System.currentTimeMillis();
                    TienIchGame.hienThongBao(1000L);
                    a_0.var_a_0_do.void_do(50, -1);
                    return;
                }
                case 6: {
                    this.var_int_int = 0;
                    this.var_boolean_int = System.currentTimeMillis();
                    TienIchGame.hienThongBao(1000L);
                    cd_0.cd_0_do().cfr_renamed_1(a_0.var_byte_for);
                    return;
                }
                default: {
                    if (!AutoKimCuong.boolean_do(a_0.coKichHoat ? 1 : 0) || !AutoKimCuong.boolean_do(a_0.coTrangThai ? 1 : 0) || !AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() - this.var_boolean_int <= this.var_long_for))) break;
                    this.var_long_for = 45000L + (long)(TienIchGame.int_do(0, 45) * 1000);
                    this.var_boolean_int = System.currentTimeMillis();
                    a_0.var_a_0_do.void_if(0);
                    if (!(TienIchGame.cfr_renamed_2(15000L))) break;
                    TienIchGame.hienThongBao(2000L);
                }
            }
            return;
        }
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_dL_do instanceof dN != 0)) {
            dN.cfr_renamed_0().cfr_renamed_1();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof em_0 != 0)) {
            em_0.em_0_do().cfr_renamed_2();
            return;
        }
        if (!AutoKimCuong.boolean_do(GameCanvas.var_dL_do instanceof fe_0) || (GameCanvas.var_dL_do instanceof fw != 0)) {
            long l;
            if ((GameCanvas.var_dL_do instanceof fw != 0) && AutoKimCuong.cfr_renamed_3(AutoKimCuong.cfr_renamed_0(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2, 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if ((cfr_renamed_5) && AutoKimCuong.cfr_renamed_1((System.currentTimeMillis() <= this.soXu))) {
                this.soXu = System.currentTimeMillis() + this.var_long_if;
                AutoKimCuong.cfr_renamed_5();
                return;
            }
            if (AutoKimCuong.boolean_do(TienIchGame.cfr_renamed_15(ef_0.soLuong) ? 1 : 0) && AutoKimCuong.boolean_do(TienIchGame.boolean_for() ? 1 : 0)) {
                fe_0.fe_0_do().cfr_renamed_21();
                TienIchGame.hienThongBao(1000L);
                return;
            }
            var_ad_do = null;
            ef_0.var_int_char = 258;
            ef_0.var_int_new = 156;
            GameCanvas.cfr_renamed_5();
            fe_0.var_byte_char = (byte)1;
            eq.eq_do().cfr_renamed_1(4);
            if ((TienIchGame.cfr_renamed_2(90000L))) {
                if ((var_ad_do != null)) {
                    var_ad_do.cfr_renamed_1();
                }
                TienIchGame.hienThongBao(2000L);
            }
            return;
        }
        if (!AutoKimCuong.boolean_do(GameCanvas.var_dL_do instanceof bF) || !(ef_0.soLuong != 24) || (ef_0.soLuong == 53)) {
            fe_0.fe_0_do().cfr_renamed_21();
            TienIchGame.hienThongBao(1000L);
            return;
        }
        if ((GameCanvas.var_dL_do instanceof gp_0 != 0)) {
            if ((var_byte_do < 3)) {
                var_byte_do = (byte)(var_byte_do + 1);
                cd_0.cd_0_do().cfr_renamed_4();
                TienIchGame.cfr_renamed_2(5000L);
                return;
            }
            gp_0.gp_0_do().cfr_renamed_4();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof e != 0)) {
            if ((var_byte_do < 3)) {
                var_byte_do = (byte)(var_byte_do + 1);
                cd_0.cd_0_do().cfr_renamed_4();
                TienIchGame.cfr_renamed_2(5000L);
                return;
            }
            e.e_do().cfr_renamed_5();
            return;
        }
        if ((GameCanvas.var_dL_do instanceof t_0 != 0)) {
            t_0.cfr_renamed_0().cfr_renamed_4();
            if ((TienIchGame.cfr_renamed_2(15000L))) {
                TienIchGame.hienThongBao(2000L);
            }
            return;
        }
        if ((ef_0.soLuong != -1) && AutoKimCuong.boolean_do(TienIchGame.cfr_renamed_15(ef_0.soLuong) ? 1 : 0)) {
            fe_0.fe_0_do().cfr_renamed_21();
            TienIchGame.hienThongBao(1000L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_22();
    }

        private static void cfr_renamed_2() {
        mangSoNguyen = new int[51];
        0 = (0x52 ^ 0x48 ^ (0x62 ^ 0x4D)) & (0x37 ^ 0x58 ^ (0x46 ^ 0x1C) ^ -" ".length());
        45 = 0x46 ^ 0x6B;
        1000 = 0xFFFFB3EC & 0x4FFB;
        60000 = 0xFFFFFFFD & 0xEA62;
        4 = 0x8B ^ 0x8F;
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
        2135 = 0xFFFFD977 & 0x2EDF;
        2136 = 0xFFFFCD5C & 0x3AFB;
        5 = 0x39 ^ 0x12 ^ (0x66 ^ 0x48);
        6 = "   ".length() ^ (0xAF ^ 0xAA);
        64 = 0x3E ^ 0x7D ^ "   ".length();
        8 = 109 + 151 - 234 + 156 ^ 76 + 86 - 35 + 63;
        2 = "  ".length();
        7 = 105 + 76 - 134 + 106 ^ 95 + 15 - 67 + 115;
        9 = 0x63 ^ 0x6A;
        10 = 0xDF ^ 0xC3 ^ (0xA9 ^ 0xBF);
        16 = 0x34 ^ 0x24;
        24 = 0x77 ^ 0x6F;
        15 = 0xE ^ 1;
        17 = 0x18 ^ 9;
        50 = 0x5A ^ 0x27 ^ (0x4D ^ 2);
        258 = -(0xFFFFB9E5 & 0x7E3B) & (0xFFFFFF27 & 0x39FA);
        156 = (0x66 ^ 0x2A) + (0xC5 ^ 0x85) - (0x79 ^ 0x46) + (0x4E ^ 1);
        53 = 0x7C ^ 0x62 ^ (0x87 ^ 0xAC);
        23 = 113 + 44 - 96 + 80 ^ 139 + 38 - 169 + 146;
        99 = 0xA ^ 0x69;
        249 = 4 + 126 - 43 + 162;
        54 = 0x78 ^ 0x4E;
        134 = (0x61 ^ 0x54) + (0x31 ^ 0x2E) - (0x8C ^ 0xB1) + (0x63 ^ 0xC);
        127 = 126 + 4 - 12 + 9;
        132 = 117 + 105 - 176 + 86;
        129 = 68 + 37 - 58 + 82;
        126 = 0xFB ^ 0x85;
        266 = 0xFFFFBD9B & 0x436E;
        11 = 0xD2 ^ 0x97 ^ (0xC3 ^ 0x8D);
        125 = 53 + 195 - 193 + 182 ^ 127 + 118 - 164 + 63;
        12 = 0xB4 ^ 0xB8;
        13 = 0x59 ^ 0x54;
        121 = 209 + 181 - 364 + 194 ^ 20 + 32 - -99 + 14;
        14 = 119 + 90 - 168 + 120 ^ 101 + 149 - 241 + 166;
        259 = -(0xFFFFBFD9 & 0x6CF7) & (0xFFFFEFD7 & 0x3DFB);
        18 = 0xD5 ^ 0xC7;
        19 = 0xC ^ 0x1F;
        142 = 136 + 105 - 165 + 66;
        20 = 0x7C ^ 8 ^ (8 ^ 0x68);
        247 = (0x7F ^ 0x1A) + (142 + 135 - 173 + 102) - (0xFFFFE1DF & 0x1F2C) + (105 + 144 - 241 + 200);
        21 = 0x64 ^ 0x71;
        22 = 0x74 ^ 0x62;
        60 = 78 + 46 - 46 + 72 ^ 32 + 66 - 22 + 94;
    }

    public static AutoKimCuong X_do() {
        if ((var_X_do == null)) {
            var_X_do = new AutoKimCuong();
        }
        return var_X_do;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        AutoKimCuong.cfr_renamed_2();
        soLuongKhoa = 0;
        soLuong = 0;
        var_ad_do = null;
        int[] nArray = new int[23];
        nArray[0] = 99;
        nArray[1] = 249;
        nArray[2] = 54;
        nArray[3] = 134;
        nArray[4] = 127;
        nArray[5] = 132;
        nArray[6] = 54;
        nArray[7] = 129;
        nArray[8] = 126;
        nArray[9] = 266;
        nArray[10] = 132;
        nArray[11] = 125;
        nArray[12] = 54;
        nArray[13] = 121;
        nArray[14] = 126;
        nArray[15] = 259;
        nArray[16] = 132;
        nArray[17] = 126;
        nArray[18] = 54;
        nArray[19] = 142;
        nArray[20] = 247;
        nArray[21] = 121;
        nArray[22] = 17;
        tenNhanVat = TienIchGame.cfr_renamed_0(nArray);
        cfr_renamed_5 = 1;
        var_int_if = 60;
        var_boolean_int = 1;
        coKichHoat = 0;
        dangChayAuto = 0;
        cfr_renamed_2 = 1;
        var_byte_do = (byte)0;
        var_byte_if = (byte)6;
        Object object = QuanLyRMS.byte_arr_do("DiamondSettings");
        if (!(object != null)) {
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            var_boolean_int = dataInputStream.readBoolean();
            coKichHoat = dataInputStream.readBoolean();
            dangChayAuto = dataInputStream.readBoolean();
            cfr_renamed_5 = dataInputStream.readBoolean();
            var_int_if = dataInputStream.readInt();
            cfr_renamed_2 = dataInputStream.readBoolean();
            var_byte_if = dataInputStream.readByte();
        }
        catch (IOException iOException) {
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if (" ".length() < (0x28 ^ 0x2C)) throw throwable;
            return;
        }
        try {
            dataInputStream.close();
            ((ByteArrayInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    }

