/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

/*
 * Renamed from aZ
 */
public final class az_0
extends AutoFarm {
    private final boolean cfr_renamed_15;
    public static boolean dangChayAuto;
    public static boolean coTrangThai;
    public static boolean coKichHoat;
    public static boolean var_boolean_int;
    public static int soLuong;
    public static int var_int_if;
    public static boolean cfr_renamed_4;
    public static boolean cfr_renamed_5;
    private static final int[] var_int_arr_if;
    private int this = var_int_arr_if[0];
    public static boolean cfr_renamed_6;
    private final boolean cfr_renamed_21;
    public static int soLuongKhoa;
    public static int var_int_int;
    public static boolean cfr_renamed_7;

        private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

            public final synchronized void d_() {
        bm bm2;
        int n;
        if ((this.cfr_renamed_21 ? 1 : 0 == null) && (this.cfr_renamed_15 ? 1 : 0 == null)) {
            AutoController.tatAuto();
            GameCanvas.hienThongBaoPopup("Bạn không bật bất kỳ chức năng chăm sóc nào. Vui lòng xem lại cài đặt!");
            return;
        }
        if ((var_int_if > 0) && (var_int_int >= var_int_if)) {
            String string;
            AutoController.tatAuto();
            StringBuffer stringBuffer = new StringBuffer().append("Đã farm xong: ").append(var_int_int);
            if ((var_int_if > 0)) {
                string = " / " + var_int_if;
                if (("   ".length() & ~"   ".length()) != 0) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.hienThongBaoPopup(stringBuffer.append(string).append(" lần!").toString());
            return;
        }
        if (az_0.cfr_renamed_2((System.currentTimeMillis() - this.var_java_util_Hashtable_int == 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((fh.var_int_char != var_int_arr_if[2])) {
            if ((fh.var_int_char != var_int_arr_if[3])) {
                long l;
                if ((GameCanvas.var_en_do instanceof gO != 0) && az_0.cfr_renamed_3(az_0.cfr_renamed_1(l = System.currentTimeMillis() - ((AutoFarm)this).cfr_renamed_4, 2000L))) {
                    TienIchGame.void_if(2000L - l);
                }
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[3]))) {
                    TienIchGame.void_if(3000L);
                }
                return;
            }
            if ((fv_0.var_java_util_Vector_do == null)) {
                dt_0.dt_0_do().cfr_renamed_2();
                if ((TienIchGame.boolean_do())) {
                    TienIchGame.void_if(1000L);
                }
            }
            if ((GameCanvas.var_en_do == fv_0.cfr_renamed_1())) {
                fv_0.cfr_renamed_1().var_en_do.cfr_renamed_4();
            }
            int n2 = var_int_arr_if[4];
            if ((fv_0.var_java_util_Vector_do != null) && (fv_0.var_java_util_Vector_do.isEmpty() ? 1 : 0 == null)) {
                DuLieuNguoiChoi ef2;
                if ((this.this >= fv_0.var_java_util_Vector_do.size())) {
                    this.this = var_int_arr_if[0];
                }
                if (az_0.cfr_renamed_1(ef2 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_do.elementAt(this.this))) {
                    n2 = ef2.var_short_goto;
                }
            }
            if (az_0.boolean_do(n2, var_int_arr_if[4])) {
                fv_0.cfr_renamed_5();
                GameCanvas.hienThongBaoPopup("Bạn không có bất kỳ bạn bè nào!");
                AutoController.tatAuto();
                return;
            }
            dR.dR_do().cfr_renamed_0(n2, var_int_arr_if[1]);
            if ((TienIchGame.cfr_renamed_3(var_int_arr_if[2]))) {
                GameCanvas.cfr_renamed_7();
                TienIchGame.void_if(1000L);
            }
            return;
        }
        if ((GameCanvas.var_dj_0_do != null)) {
            GameCanvas.cfr_renamed_7();
        }
        this.this += var_int_arr_if[1];
        if ((this.cfr_renamed_21)) {
            n = var_int_arr_if[0];
            while ((n < dR.var_java_util_Vector_int.size())) {
                bm2 = (es)dR.var_java_util_Vector_int.elementAt(n);
                if ((bm2 != null) && (bm2.cfr_renamed_5 < var_int_arr_if[5]) && (bm2.cfr_renamed_6 != var_int_arr_if[4])) {
                    if ((cfr_renamed_5) && (bm2.var_byte_new > 0) && (bm2.var_byte_new < var_int_arr_if[6])) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) {
                            AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[1]);
                        }
                        int n3 = var_int_arr_if[0];
                        while ((bm2.var_byte_new < var_int_arr_if[6]) && (n3 < var_int_arr_if[8]) && az_0.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
                            ++n3;
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[7]);
                            if ((TienIchGame.cfr_renamed_3(5000L))) {
                                this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                                if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                    return;
                                }
                                TienIchGame.void_if(500L);
                                if ("  ".length() != 0) continue;
                                return;
                            }
                            if (!az_0.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0) || !az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) break;
                            if ((n > 0)) {
                                --n;
                            }
                            AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[1]);
                            break;
                        }
                    }
                    if ((cfr_renamed_4) && (bm2.dangChayAuto)) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[9]))) {
                            AutoFarm.void_do(var_int_arr_if[9], var_int_arr_if[1]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[9]);
                        if ((TienIchGame.cfr_renamed_3(5000L))) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            soLuongKhoa += var_int_arr_if[1];
                            if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                    if ((coTrangThai) && (bm2.coKichHoat)) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[10]))) {
                            AutoFarm.void_do(var_int_arr_if[10], var_int_arr_if[1]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[10]);
                        if ((TienIchGame.cfr_renamed_3(5000L))) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            soLuong += var_int_arr_if[1];
                            if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                    if ((cfr_renamed_7)) {
                        if (az_0.boolean_do((int)bm2.var_byte_for, var_int_arr_if[11])) {
                            bm2.var_byte_int = (byte)var_int_arr_if[9];
                            if ((0xC6 ^ 0xC2) == 0) {
                                return;
                            }
                        } else {
                            bm2.var_byte_int = (byte)var_int_arr_if[12];
                        }
                        bm2.coTrangThai = var_int_arr_if[0];
                        fh.var_short_arr_if[bm2.soLuong * fh.var_short_if + bm2.var_int_new] = bm2.var_byte_int;
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[6]);
                        if ((TienIchGame.cfr_renamed_3(5000L))) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                }
                ++n;
                if (-"  ".length() < 0) continue;
                return;
            }
        }
        if ((this.cfr_renamed_15)) {
            n = var_int_arr_if[0];
            while ((n < dR.var_java_util_Vector_byte.size())) {
                bm2 = (hs)dR.var_java_util_Vector_byte.elementAt(n);
                if ((bm2 != null)) {
                    if ((var_boolean_int) && az_0.cfr_renamed_3(((hs)bm2).cfr_renamed_12, var_int_arr_if[6])) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) {
                            AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[1]);
                        }
                        int n4 = var_int_arr_if[0];
                        while (az_0.cfr_renamed_3(((hs)bm2).cfr_renamed_12, var_int_arr_if[6]) && (n4 < var_int_arr_if[8]) && az_0.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0)) {
                            ++n4;
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[13]);
                            if ((TienIchGame.boolean_if(5000L))) {
                                this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                                if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                    return;
                                }
                                TienIchGame.void_if(500L);
                                if (-(66 + 187 - 146 + 92 ^ 52 + 2 - -132 + 8) < 0) continue;
                                return;
                            }
                            if (!az_0.cfr_renamed_4(ae.ae_do().boolean_do() ? 1 : 0) || !az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) break;
                            if ((n > 0)) {
                                --n;
                            }
                            AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[1]);
                            break;
                        }
                    }
                    String string = "";
                    if ((coKichHoat) && az_0.cfr_renamed_4(((hs)bm2).coKichHoat ? 1 : 0)) {
                        int n5;
                        switch (((hs)bm2).cfr_renamed_9) {
                            case 54: 
                            case 59: {
                                n5 = var_int_arr_if[14];
                                if ("  ".length() >= 0) break;
                                return;
                            }
                            case 50: 
                            case 56: {
                                n5 = var_int_arr_if[15];
                                if (" ".length() <= " ".length()) break;
                                return;
                            }
                            case 51: 
                            case 52: 
                            case 55: 
                            case 58: 
                            case 60: 
                            case 61: {
                                n5 = var_int_arr_if[16];
                                if (((117 + 63 - 110 + 63 ^ 132 + 31 - 134 + 130) & (0xEA ^ 0xB0 ^ (0xF3 ^ 0xB3) ^ -" ".length())) < (22 + 45 - 45 + 116 ^ 115 + 112 - 182 + 97)) break;
                                return;
                            }
                            case 53: {
                                n5 = var_int_arr_if[17];
                                if (null == null) break;
                                return;
                            }
                            default: {
                                n5 = var_int_arr_if[4];
                            }
                        }
                        if ((n5 != var_int_arr_if[4])) {
                            if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, n5))) {
                                AutoFarm.void_do(n5, var_int_arr_if[1]);
                            }
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, n5);
                            if ((TienIchGame.boolean_if(5000L))) {
                                this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                                string = string + "No bụng";
                                if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                    AutoFarm.cfr_renamed_1((hs)bm2, string);
                                    return;
                                }
                                TienIchGame.void_if(500L);
                            }
                        }
                    }
                    if ((dangChayAuto) && az_0.cfr_renamed_4(((hs)bm2).var_boolean_arr_do[var_int_arr_if[1]])) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[18]))) {
                            AutoFarm.void_do(var_int_arr_if[18], var_int_arr_if[1]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[18]);
                        if ((TienIchGame.boolean_if(5000L))) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            if ((string.equals("") ? 1 : 0 == null)) {
                                string = string + ", ";
                            }
                            string = string + "khỏi cúm";
                            if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                AutoFarm.cfr_renamed_1((hs)bm2, string);
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                    if ((cfr_renamed_6) && az_0.cfr_renamed_4(((hs)bm2).var_boolean_arr_do[var_int_arr_if[0]])) {
                        if (az_0.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[19]))) {
                            AutoFarm.void_do(var_int_arr_if[19], var_int_arr_if[1]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[19]);
                        if ((TienIchGame.boolean_if(5000L))) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            if ((string.equals("") ? 1 : 0 == null)) {
                                string = string + ", ";
                            }
                            string = string + "khỏi tiêu chảy";
                            if ((var_int_int += var_int_arr_if[1] >= var_int_if) && (var_int_if > 0)) {
                                AutoFarm.cfr_renamed_1((hs)bm2, string);
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                    if ((string.equals("") ? 1 : 0 == null)) {
                        AutoFarm.cfr_renamed_1((hs)bm2, string);
                    }
                }
                ++n;
                if (((0x99 ^ 0x91) & ~(0x2B ^ 0x23)) <= ((0x5D ^ 8) & ~(0x56 ^ 3))) continue;
                return;
            }
        }
        TienIchGame.void_if(1000L);
        dR.dR_do().cfr_renamed_14();
        if ((TienIchGame.boolean_do(15000L) ? 1 : 0 == null)) {
            go_0.go_0_do().cfr_renamed_11();
        }
        TienIchGame.void_if(2000L);
    }

            public az_0() {
        int n;
        int n2;
        if (!(cfr_renamed_7 ? 1 : 0 == null) || !(cfr_renamed_4 ? 1 : 0 == null) || !(coTrangThai ? 1 : 0 == null) || (cfr_renamed_5)) {
            n2 = var_int_arr_if[1];
            if (" ".length() >= "  ".length()) {
                throw null;
            }
        } else {
            this.cfr_renamed_21 = var_int_arr_if[0];
            n2 = this.cfr_renamed_21 ? 1 : 0;
        }
        if (!(coKichHoat ? 1 : 0 == null) || !(dangChayAuto ? 1 : 0 == null) || !(cfr_renamed_6 ? 1 : 0 == null) || (var_boolean_int)) {
            n = var_int_arr_if[1];
            if (" ".length() <= 0) {
                throw null;
            }
        } else {
            n = var_int_arr_if[0];
        }
        this.cfr_renamed_15 = n;
        var_int_int = var_int_arr_if[0];
        soLuong = var_int_arr_if[0];
        soLuongKhoa = var_int_arr_if[0];
    }

    private static void cfr_renamed_23() {
        var_int_arr_if = new int[20];
        az_0.var_int_arr_if[0] = (0x7C ^ 0x4E) & ~(0x2D ^ 0x1F);
        az_0.var_int_arr_if[1] = " ".length();
        az_0.var_int_arr_if[2] = 70 + 206 - 180 + 147 ^ 151 + 107 - 93 + 33;
        az_0.var_int_arr_if[3] = 0x4F ^ 0x56;
        az_0.var_int_arr_if[4] = -" ".length();
        az_0.var_int_arr_if[5] = 179 + 58 - 114 + 58 ^ 25 + 112 - 109 + 148;
        az_0.var_int_arr_if[6] = 0x49 ^ 0x2D;
        az_0.var_int_arr_if[7] = 0xF0 ^ 0x9F;
        az_0.var_int_arr_if[8] = 0x80 ^ 0x8A;
        az_0.var_int_arr_if[9] = 8 ^ 0x73;
        az_0.var_int_arr_if[10] = 0xC4 ^ 0xB8;
        az_0.var_int_arr_if[11] = "  ".length();
        az_0.var_int_arr_if[12] = 0x9A ^ 0x85 ^ (0x6F ^ 0x55);
        az_0.var_int_arr_if[13] = 0xEF ^ 0x95;
        az_0.var_int_arr_if[14] = 0x6D ^ 0x19;
        az_0.var_int_arr_if[15] = 169 + 182 - 298 + 199 ^ 74 + 22 - -10 + 31;
        az_0.var_int_arr_if[16] = 0x69 ^ 0x7E ^ (0xD5 ^ 0xB4);
        az_0.var_int_arr_if[17] = 0x84 ^ 0xAA ^ (0x2D ^ 0x74);
        az_0.var_int_arr_if[18] = 0x55 ^ 0x49 ^ (0xDB ^ 0xBF);
        az_0.var_int_arr_if[19] = 0xD7 ^ 0xAE;
    }

    public final String toString() {
        return "Farm giúp bạn";
    }

            private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeBoolean(cfr_renamed_7);
            dataOutputStream.writeBoolean(coTrangThai);
            dataOutputStream.writeBoolean(cfr_renamed_4);
            dataOutputStream.writeBoolean(cfr_renamed_5);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(cfr_renamed_6);
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("FarmFriendSettings", byteArrayOutputStream.toByteArray());
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        az_0.cfr_renamed_23();
        var_int_if = var_int_arr_if[4];
        cfr_renamed_7 = var_int_arr_if[1];
        coTrangThai = var_int_arr_if[1];
        cfr_renamed_4 = var_int_arr_if[1];
        cfr_renamed_5 = var_int_arr_if[0];
        coKichHoat = var_int_arr_if[0];
        dangChayAuto = var_int_arr_if[0];
        cfr_renamed_6 = var_int_arr_if[0];
        var_boolean_int = var_int_arr_if[0];
        Object object = QuanLyRMS.byte_arr_do("FarmFriendSettings");
        if (!(object != null)) return;
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            cfr_renamed_7 = dataInputStream.readBoolean();
            coTrangThai = dataInputStream.readBoolean();
            cfr_renamed_4 = dataInputStream.readBoolean();
            cfr_renamed_5 = dataInputStream.readBoolean();
            coKichHoat = dataInputStream.readBoolean();
            dangChayAuto = dataInputStream.readBoolean();
            cfr_renamed_6 = dataInputStream.readBoolean();
            var_boolean_int = dataInputStream.readBoolean();
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
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
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

    public final boolean boolean_do(String string) {
        if ((TienIchGame.cfr_renamed_6) && (string.equals("Nông trại đang có người"))) {
            this.this += var_int_arr_if[1];
            TienIchGame.cfr_renamed_6 = var_int_arr_if[0];
            return var_int_arr_if[1];
        }
        return super.boolean_do(string);
    }

            public final void void_do() {
        AutoController.cfr_renamed_1(this);
    }
}

