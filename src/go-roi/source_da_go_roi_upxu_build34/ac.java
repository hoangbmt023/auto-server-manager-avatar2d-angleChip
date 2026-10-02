/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class ac
extends AutoFarm {
    public static int cfr_renamed_0;
    private final int cfr_renamed_18;
    private static final int[] var_int_arr_if;
    public static int var_int_if;
    private final int cfr_renamed_10;

    private static void cfr_renamed_19() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_int.size())) {
            dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n2);
            if ((dq_02 < 0) && (dq_02.soLuong < var_int_arr_if[5]) && ac.boolean_do(dq_02.cfr_renamed_8, var_int_arr_if[1]) && (dq_02.var_boolean_int)) {
                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[9]))) {
                    AutoFarm.void_do(var_int_arr_if[9], var_int_arr_if[4]);
                }
                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n2, var_int_arr_if[9]);
                if ((TienIchGame.cfr_renamed_8(5000L))) {
                    ++n;
                    TienIchGame.hienThongBao(500L);
                }
            }
            ++n2;
            if (("   ".length() ^ (0x6A ^ 0x6D)) == (125 + 155 - 205 + 115 ^ 1 + 63 - 39 + 161)) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup("Đã diệt " + n + " cỏ!");
    }

            private static void cfr_renamed_20() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_int.size())) {
            dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n2);
            if ((dq_02 < 0) && (dq_02.soLuong < var_int_arr_if[5]) && ac.boolean_do(dq_02.cfr_renamed_8, var_int_arr_if[1]) && (dq_02.var_byte_for > 0) && (dq_02.var_byte_for < var_int_arr_if[11])) {
                ++n;
                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[13]))) {
                    AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                }
                int n3 = var_int_arr_if[3];
                while ((dq_02.var_byte_for < var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                    ++n3;
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n2, var_int_arr_if[13]);
                    if ((TienIchGame.cfr_renamed_8(5000L))) {
                        TienIchGame.hienThongBao(500L);
                        if (-"  ".length() <= 0) continue;
                        return;
                    }
                    if (!ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0) || !ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[13]))) break;
                    if ((n2 > 0)) {
                        --n2;
                    }
                    AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                    break;
                }
            }
            ++n2;
            if ("   ".length() > 0) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã bón phân xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Cây trồng không cần phân bón!");
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    private static void cfr_renamed_14() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n2);
            if ((ha2 < 0) && (ha2.cfr_renamed_6 < var_int_arr_if[11])) {
                ++n;
                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[7]))) {
                    AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                }
                int n3 = var_int_arr_if[3];
                while ((ha2.cfr_renamed_6 < var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                    ++n3;
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_if[7]);
                    if ((TienIchGame.boolean_do(5000L))) {
                        TienIchGame.hienThongBao(500L);
                        if ("  ".length() >= 0) continue;
                        return;
                    }
                    if (!ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0) || !ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[7]))) break;
                    AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                    if (-" ".length() <= " ".length()) continue;
                    return;
                }
            }
            ++n2;
            if (" ".length() != 0) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã bơm thuốc bổ xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không cần thuốc bổ!");
    }

    private static void cfr_renamed_23() {
        aG aG2;
        TienIchGame.hienThongBao("Đang chăm sóc. Xin hãy chờ...");
        int n = var_int_arr_if[3];
        while ((n < bF.var_java_util_Vector_int.size())) {
            aG2 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
            if ((aG2 < 0) && (aG2.soLuong < var_int_arr_if[5]) && ac.boolean_do(aG2.cfr_renamed_8, var_int_arr_if[1])) {
                if ((aG2.var_byte_for > 0) && (aG2.var_byte_for < var_int_arr_if[11])) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[13]))) {
                        AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                    }
                    int n2 = var_int_arr_if[3];
                    while ((aG2.var_byte_for < var_int_arr_if[11]) && (n2 < var_int_arr_if[14]) && ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                        ++n2;
                        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_if[13]);
                        if ((TienIchGame.cfr_renamed_8(5000L))) {
                            TienIchGame.hienThongBao(500L);
                            if ((0x2D ^ 0x53 ^ (0x2A ^ 0x50)) > "   ".length()) continue;
                            return;
                        }
                        if (!ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0) || !ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[13]))) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                        break;
                    }
                }
                if ((aG2.var_boolean_int)) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[9]))) {
                        AutoFarm.void_do(var_int_arr_if[9], var_int_arr_if[4]);
                    }
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_if[9]);
                    if ((TienIchGame.cfr_renamed_8(5000L))) {
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if ((aG2.coKichHoat)) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[12]))) {
                        AutoFarm.void_do(var_int_arr_if[12], var_int_arr_if[4]);
                    }
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_if[12]);
                    if ((TienIchGame.cfr_renamed_8(5000L))) {
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if (ac.boolean_do((int)aG2.var_byte_new, var_int_arr_if[10]) && ac.boolean_do((int)aG2.var_byte_new, var_int_arr_if[9])) {
                    if ((aG2.var_byte_int == var_int_arr_if[6])) {
                        aG2.var_byte_new = (byte)var_int_arr_if[9];
                        } else {
                        aG2.var_byte_new = (byte)var_int_arr_if[10];
                    }
                    aG2.coTrangThai = var_int_arr_if[3];
                    ef_0.var_short_arr_do[aG2.var_int_new * ef_0.var_short_if + aG2.cfr_renamed_2] = aG2.var_byte_new;
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_if[11]);
                    if ((TienIchGame.cfr_renamed_8(5000L))) {
                        TienIchGame.hienThongBao(500L);
                    }
                }
            }
            ++n;
            if ("   ".length() > 0) continue;
            return;
        }
        n = var_int_arr_if[3];
        while ((n < bF.var_java_util_Vector_if.size())) {
            aG2 = (ha)bF.var_java_util_Vector_if.elementAt(n);
            if ((aG2 < 0)) {
                if (ac.cfr_renamed_3(((ha)aG2).cfr_renamed_6, var_int_arr_if[11])) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[7]))) {
                        AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                    }
                    int n3 = var_int_arr_if[3];
                    while (ac.cfr_renamed_3(((ha)aG2).cfr_renamed_6, var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0)) {
                        ++n3;
                        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ((ha)aG2).cfr_renamed_12, var_int_arr_if[7]);
                        if ((TienIchGame.boolean_do(5000L))) {
                            TienIchGame.hienThongBao(500L);
                            if ((0xA3 ^ 0xA7) == (0x25 ^ 0x21)) continue;
                            return;
                        }
                        if (!ac.cfr_renamed_3(i_0.i_0_do().boolean_do() ? 1 : 0) || !ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[7]))) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                        break;
                    }
                }
                String string = "";
                if (ac.cfr_renamed_3(((ha)aG2).cfr_renamed_5 ? 1 : 0)) {
                    int n4;
                    switch (((ha)aG2).cfr_renamed_18) {
                        case 54: 
                        case 59: {
                            n4 = var_int_arr_if[18];
                            if ("   ".length() > -" ".length()) break;
                            return;
                        }
                        case 50: 
                        case 56: {
                            n4 = var_int_arr_if[19];
                            if (null == null) break;
                            return;
                        }
                        case 51: 
                        case 52: 
                        case 55: 
                        case 58: 
                        case 60: 
                        case 61: {
                            n4 = var_int_arr_if[20];
                            if ((0x4E ^ 0x7A ^ (0x68 ^ 0x59)) != 0) break;
                            return;
                        }
                        case 53: {
                            n4 = var_int_arr_if[21];
                            if (" ".length() >= 0) break;
                            return;
                        }
                        default: {
                            n4 = var_int_arr_if[1];
                        }
                    }
                    if (ac.boolean_do(n4, var_int_arr_if[1])) {
                        if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, n4))) {
                            AutoFarm.void_do(n4, var_int_arr_if[4]);
                        }
                        dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ((ha)aG2).cfr_renamed_12, n4);
                        if ((TienIchGame.boolean_do(5000L))) {
                            string = string + "No bụng";
                            TienIchGame.hienThongBao(500L);
                        }
                    }
                }
                if (ac.cfr_renamed_3(((ha)aG2).var_boolean_arr_do[var_int_arr_if[4]])) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[16]))) {
                        AutoFarm.void_do(var_int_arr_if[16], var_int_arr_if[4]);
                    }
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ((ha)aG2).cfr_renamed_12, var_int_arr_if[16]);
                    if ((TienIchGame.boolean_do(5000L))) {
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi cúm";
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if (ac.cfr_renamed_3(((ha)aG2).var_boolean_arr_do[var_int_arr_if[3]])) {
                    if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[22]))) {
                        AutoFarm.void_do(var_int_arr_if[22], var_int_arr_if[4]);
                    }
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ((ha)aG2).cfr_renamed_12, var_int_arr_if[22]);
                    if ((TienIchGame.boolean_do(5000L))) {
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi tiêu chảy";
                        TienIchGame.hienThongBao(500L);
                    }
                }
                if (!(string.equals(""))) {
                    AutoFarm.cfr_renamed_0((ha)aG2, string);
                }
            }
            ++n;
            if (((0x19 ^ 0x29) & ~(0x82 ^ 0xB2)) == 0) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
    }

        public final void void_do() {
        if ((this.cfr_renamed_10 == var_int_arr_if[1])) {
            GameCanvas.hienThongBaoPopup("Bạn cần đứng trong farm bạn bè để sử dụng chức năng này!");
            return;
        }
        AutoController.cfr_renamed_0(this);
    }

    private static void cfr_renamed_24() {
        var_int_arr_if = new int[23];
        ac.var_int_arr_if[0] = 0x35 ^ 0x7B ^ (0x22 ^ 0x59);
        ac.var_int_arr_if[1] = -" ".length();
        ac.var_int_arr_if[2] = 0x11 ^ 8;
        ac.var_int_arr_if[3] = (0x62 ^ 0x17 ^ (0x76 ^ 0x1E)) & (0x46 ^ 0x32 ^ (0x4C ^ 0x25) ^ -" ".length());
        ac.var_int_arr_if[4] = " ".length();
        ac.var_int_arr_if[5] = 0x63 ^ 0x47 ^ (0x17 ^ 0x36);
        ac.var_int_arr_if[6] = "  ".length();
        ac.var_int_arr_if[7] = 0xFF ^ 0x85;
        ac.var_int_arr_if[8] = 0x5A ^ 0x7E;
        ac.var_int_arr_if[9] = 0x89 ^ 0xA9 ^ (0x3C ^ 0x67);
        ac.var_int_arr_if[10] = 0x6F ^ 0x6A ^ (0x80 ^ 0xA0);
        ac.var_int_arr_if[11] = 0xD5 ^ 0xB3 ^ "  ".length();
        ac.var_int_arr_if[12] = 0xCA ^ 0xB6;
        ac.var_int_arr_if[13] = 0xE3 ^ 0x8C;
        ac.var_int_arr_if[14] = 133 + 57 - 78 + 25 ^ 103 + 3 - -15 + 10;
        ac.var_int_arr_if[15] = 0xC2 ^ 0xC4;
        ac.var_int_arr_if[16] = 2 + 28 - -126 + 35 ^ 134 + 2 - -4 + 59;
        ac.var_int_arr_if[17] = 0x56 ^ 0x74;
        ac.var_int_arr_if[18] = 0x27 ^ 0x53;
        ac.var_int_arr_if[19] = 0x58 ^ 0x2D;
        ac.var_int_arr_if[20] = 0x26 ^ 0x50;
        ac.var_int_arr_if[21] = 0xC9 ^ 0x95 ^ (0x5C ^ 0x77);
        ac.var_int_arr_if[22] = 0xD3 ^ 0xB8 ^ (0x23 ^ 0x31);
    }

                    private static void cfr_renamed_25() {
        if (!ac.boolean_do(cfr_renamed_0, var_int_arr_if[1]) || ac.boolean_do(var_int_if)) {
            return;
        }
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_int.size())) {
            dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n2);
            if ((dq_02 < 0) && (!ac.boolean_do(dq_02.cfr_renamed_8, var_int_arr_if[1]) || (dq_02.soLuong == var_int_arr_if[15]))) {
                if ((dq_02.var_byte_int == var_int_arr_if[6])) {
                    dq_02.var_byte_new = (byte)var_int_arr_if[16];
                    if ("   ".length() <= 0) {
                        return;
                    }
                } else {
                    dq_02.var_byte_new = (byte)var_int_arr_if[17];
                }
                ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n2, var_int_arr_if[1]);
                dq_02.cfr_renamed_8 = var_int_arr_if[1];
                dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n2, cfr_renamed_0);
                if (!(++n < var_int_if)) break;
            }
            ++n2;
            if (" ".length() == " ".length()) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã gieo hạt xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Cần chủ farm làm đất mới có thể gieo hạt!");
    }

    private static void cfr_renamed_27() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_if.size())) {
            block11: {
                ha ha2;
                block12: {
                    block14: {
                        block13: {
                            int n3;
                            ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n2);
                            if (!(ha2 < 0)) break block11;
                            if (!(ha2.cfr_renamed_5)) break block12;
                            ++n;
                            switch (ha2.cfr_renamed_18) {
                                case 54: 
                                case 59: {
                                    n3 = var_int_arr_if[18];
                                    if ("  ".length() > -" ".length()) break;
                                    return;
                                }
                                case 50: 
                                case 56: {
                                    n3 = var_int_arr_if[19];
                                    if (((0x7F ^ 0x6C ^ (0x20 ^ 0x15)) & (0x54 ^ 0x3C ^ (0xCD ^ 0x83) ^ -" ".length())) <= "   ".length()) break;
                                    return;
                                }
                                case 51: 
                                case 52: 
                                case 55: 
                                case 58: 
                                case 60: 
                                case 61: {
                                    n3 = var_int_arr_if[20];
                                    if (null == null) break;
                                    return;
                                }
                                case 53: {
                                    n3 = var_int_arr_if[21];
                                    if (-(0x87 ^ 0x8F ^ (0x1D ^ 0x11)) < 0) break;
                                    return;
                                }
                                default: {
                                    n3 = var_int_arr_if[1];
                                }
                            }
                            if (!ac.boolean_do(n3, var_int_arr_if[1])) break block13;
                            if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, n3))) {
                                AutoFarm.void_do(n3, var_int_arr_if[4]);
                            }
                            dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, n3);
                            if (!(TienIchGame.boolean_do(5000L))) break block14;
                            AutoFarm.cfr_renamed_0(ha2, "No bụng");
                            TienIchGame.hienThongBao(500L);
                            if (((9 ^ 0x5D) & ~(3 ^ 0x57)) > "   ".length()) {
                                return;
                            }
                            break block11;
                        }
                        AutoFarm.cfr_renamed_0(ha2, "Chưa hỗ trợ");
                    }
                    if (((0x3E ^ 0x1E) & ~(0x23 ^ 3)) != 0) {
                        return;
                    }
                    break block11;
                }
                AutoFarm.cfr_renamed_0(ha2, "Không đói");
            }
            ++n2;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã cho ăn xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không đói!");
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final synchronized void void_for() {
        block47: {
            if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
                return;
            }
            if ((this.cfr_renamed_10 == var_int_arr_if[1])) {
                AutoController.tatAuto();
                return;
            }
            if (ac.boolean_do(ef_0.soLuong, var_int_arr_if[0])) {
                if (ac.boolean_do(ef_0.soLuong, var_int_arr_if[2])) {
                    long l;
                    if ((GameCanvas.var_dL_do instanceof fw != 0) && ac.cfr_renamed_1((l = System.currentTimeMillis() - this.var_int_try == 2000L))) {
                        TienIchGame.hienThongBao(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_3(var_int_arr_if[2]))) {
                        TienIchGame.hienThongBao(3000L);
                    }
                    return;
                }
                if ((es.var_java_util_Vector_if == null)) {
                    cd_0.cd_0_do().cfr_renamed_2();
                    if ((TienIchGame.boolean_do())) {
                        TienIchGame.hienThongBao(1000L);
                    }
                }
                if ((GameCanvas.var_dL_do == es.cfr_renamed_0())) {
                    es.cfr_renamed_0().var_dL_do.cfr_renamed_8();
                }
                int n = var_int_arr_if[1];
                if ((es.var_java_util_Vector_if < 0) && !(es.var_java_util_Vector_if.isEmpty())) {
                    int n2 = var_int_arr_if[3];
                    while ((n2 < es.var_java_util_Vector_if.size())) {
                        DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)es.var_java_util_Vector_if.elementAt(n2);
                        if ((dd_02 < 0) && (dd_02.var_short_char == this.cfr_renamed_10)) {
                            n = dd_02.var_short_char;
                            if (-"   ".length() <= 0) break;
                            return;
                        }
                        ++n2;
                        }
                }
                if ((n == var_int_arr_if[1])) {
                    es.cfr_renamed_4();
                    GameCanvas.hienThongBaoPopup("Có lỗi xảy ra. Không tìm thấy bạn bè!");
                    AutoController.tatAuto();
                    return;
                }
                bF.bF_do().cfr_renamed_1(n, var_int_arr_if[4]);
                if ((TienIchGame.cfr_renamed_1(var_int_arr_if[0]))) {
                    GameCanvas.cfr_renamed_8();
                    TienIchGame.hienThongBao(1000L);
                }
                return;
            }
            if ((GameCanvas.var_bt_0_do < 0)) {
                GameCanvas.cfr_renamed_8();
            }
            try {
                switch (this.cfr_renamed_18) {
                    case 1: {
                        dq_0 dq_02;
                        TienIchGame.hienThongBao("Đang tưới nước. Xin hãy chờ...");
                        int n = var_int_arr_if[3];
                        while ((n < bF.var_java_util_Vector_int.size())) {
                            dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
                            if ((dq_02 < 0) && (dq_02.soLuong < var_int_arr_if[5]) && ac.boolean_do(dq_02.cfr_renamed_8, var_int_arr_if[1])) {
                                if ((dq_02.var_byte_int == var_int_arr_if[6])) {
                                    dq_02.var_byte_new = (byte)var_int_arr_if[7];
                                    if (" ".length() <= ((0xA6 ^ 0x9F) & ~(0x32 ^ 0xB))) {
                                        return;
                                    }
                                } else {
                                    dq_02.var_byte_new = (byte)var_int_arr_if[8];
                                }
                                ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                            }
                            ++n;
                            if (-" ".length() <= " ".length()) continue;
                            return;
                        }
                        n = var_int_arr_if[3];
                        while ((n < bF.var_java_util_Vector_int.size())) {
                            dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n);
                            if ((dq_02 < 0) && (dq_02.soLuong < var_int_arr_if[5]) && ac.boolean_do(dq_02.cfr_renamed_8, var_int_arr_if[1])) {
                                if ((dq_02.var_byte_int == var_int_arr_if[6])) {
                                    dq_02.var_byte_new = (byte)var_int_arr_if[9];
                                    } else {
                                    dq_02.var_byte_new = (byte)var_int_arr_if[10];
                                }
                                dq_02.coTrangThai = var_int_arr_if[3];
                                ef_0.var_short_arr_do[dq_02.var_int_new * ef_0.var_short_if + dq_02.cfr_renamed_2] = dq_02.var_byte_new;
                                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n, var_int_arr_if[11]);
                                if ((TienIchGame.cfr_renamed_8(5000L))) {
                                    TienIchGame.hienThongBao(500L);
                                }
                            }
                            ++n;
                            if ("  ".length() != 0) continue;
                            return;
                        }
                        GameCanvas.hienThongBaoPopup("Đã tưới nước xong!");
                        if ("  ".length() < -" ".length()) {
                            return;
                        }
                        break block47;
                    }
                    case 12: {
                        int n = var_int_arr_if[3];
                        int n3 = var_int_arr_if[3];
                        while ((n3 < bF.var_java_util_Vector_int.size())) {
                            dq_0 dq_03 = (dq_0)bF.var_java_util_Vector_int.elementAt(n3);
                            if ((dq_03 < 0) && (dq_03.soLuong < var_int_arr_if[5]) && ac.boolean_do(dq_03.cfr_renamed_8, var_int_arr_if[1]) && (dq_03.coKichHoat)) {
                                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[12]))) {
                                    AutoFarm.void_do(var_int_arr_if[12], var_int_arr_if[4]);
                                }
                                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n3, var_int_arr_if[12]);
                                if ((TienIchGame.cfr_renamed_8(5000L))) {
                                    ++n;
                                    TienIchGame.hienThongBao(500L);
                                }
                            }
                            ++n3;
                            }
                        GameCanvas.hienThongBaoPopup("Đã diệt " + n + " sâu!");
                        break block47;
                    }
                    case 13: {
                        ac.cfr_renamed_19();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        break block47;
                    }
                    case 4: {
                        ac.cfr_renamed_20();
                        if ("  ".length() < "  ".length()) {
                            return;
                        }
                        break block47;
                    }
                    case 7: {
                        ac.cfr_renamed_27();
                        break block47;
                    }
                    case 14: {
                        ac.cfr_renamed_26();
                        break block47;
                    }
                    case 15: {
                        ac.cfr_renamed_21();
                        break block47;
                    }
                    case 9: {
                        ac.cfr_renamed_14();
                        if (((0x5B ^ 0x6B ^ (0xB1 ^ 0x92)) & (16 + 12 - 19 + 125 ^ 96 + 31 - 5 + 27 ^ -" ".length())) == -" ".length()) {
                            return;
                        }
                        break block47;
                    }
                    case 3: {
                        ac.cfr_renamed_25();
                        break block47;
                    }
                    default: {
                        ac.cfr_renamed_23();
                        break;
                    }
                }
            }
            catch (Exception exception) {
                break block47;
            }
            if (((0xE ^ 0x38 ^ (0x11 ^ 0x31)) & (0x27 ^ 0x67 ^ (0x4A ^ 0x1C) ^ -" ".length())) != ((0x69 ^ 4 ^ (0x1C ^ 0x36)) & (59 + 71 - 124 + 191 ^ 60 + 61 - 70 + 79 ^ -" ".length()))) {
                return;
            }
        }
        AutoController.tatAuto();
    }

    static {
        ac.cfr_renamed_24();
        cfr_renamed_0 = var_int_arr_if[1];
        var_int_if = var_int_arr_if[3];
    }

    private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public ac(int n) {
        int n2;
        this.cfr_renamed_18 = n;
        if ((ef_0.soLuong == var_int_arr_if[0]) && ac.boolean_do(bF.soLuong, (int)AngelChip.duLieuNguoiChoi.var_short_char)) {
            n2 = bF.soLuong;
            if ("  ".length() < "  ".length()) {
                throw null;
            }
        } else {
            n2 = var_int_arr_if[1];
        }
        this.cfr_renamed_10 = n2;
    }

    public final String toString() {
        return "Farm giúp bạn";
    }

        private static void cfr_renamed_26() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n2);
            if ((ha2 < 0) && (ha2.var_boolean_arr_do[var_int_arr_if[4]] != 0)) {
                ++n;
                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[16]))) {
                    AutoFarm.void_do(var_int_arr_if[16], var_int_arr_if[4]);
                }
                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_if[16]);
                if ((TienIchGame.boolean_do(5000L))) {
                    AutoFarm.cfr_renamed_0(ha2, "Khỏi cúm");
                    TienIchGame.hienThongBao(500L);
                }
            }
            ++n2;
            if (" ".length() != 0) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bệnh cúm xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không bị cúm!");
    }

    private static void cfr_renamed_21() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n2);
            if ((ha2 < 0) && (ha2.var_boolean_arr_do[var_int_arr_if[3]] != 0)) {
                ++n;
                if (ac.boolean_do(AutoFarm.cfr_renamed_0(bF.var_java_util_Vector_do, var_int_arr_if[22]))) {
                    AutoFarm.void_do(var_int_arr_if[22], var_int_arr_if[4]);
                }
                dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, ha2.cfr_renamed_12, var_int_arr_if[22]);
                if ((TienIchGame.boolean_do(5000L))) {
                    AutoFarm.cfr_renamed_0(ha2, "Khỏi tiêu chảy");
                    TienIchGame.hienThongBao(500L);
                }
            }
            ++n2;
            if ((0x55 ^ 0x51) >= "   ".length()) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bệnh tiêu chảy xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không bị tiêu chảy!");
    }
}

