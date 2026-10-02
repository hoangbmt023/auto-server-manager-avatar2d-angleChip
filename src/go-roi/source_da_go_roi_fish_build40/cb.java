/*
 * Decompiled with CFR 0.152.
 */
import main.AngelChip;

public final class cb
extends AutoFarm {
    private static final int[] var_int_arr_if;
    public static int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    public static int var_int_if;

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

        private static void cfr_renamed_3() {
        var_int_arr_if = new int[23];
        cb.var_int_arr_if[0] = 0x74 ^ 0x41;
        cb.var_int_arr_if[1] = -" ".length();
        cb.var_int_arr_if[2] = 93 + 189 - 119 + 56 ^ 23 + 74 - -18 + 79;
        cb.var_int_arr_if[3] = (0x24 ^ 0x45 ^ (0x32 ^ 1)) & (6 + 135 - 24 + 136 ^ 89 + 117 - 186 + 155 ^ -" ".length());
        cb.var_int_arr_if[4] = " ".length();
        cb.var_int_arr_if[5] = 0x1E ^ 0x1B;
        cb.var_int_arr_if[6] = "  ".length();
        cb.var_int_arr_if[7] = 126 + 100 - 51 + 15 ^ 148 + 157 - 141 + 32;
        cb.var_int_arr_if[8] = 0x6C ^ 0x48;
        cb.var_int_arr_if[9] = 0x2F ^ 0x54;
        cb.var_int_arr_if[10] = 0x2E ^ 0xB;
        cb.var_int_arr_if[11] = 0xEB ^ 0x8F;
        cb.var_int_arr_if[12] = 0x5B ^ 0x27;
        cb.var_int_arr_if[13] = 0x1B ^ 0x74;
        cb.var_int_arr_if[14] = 0xA0 ^ 0xAA;
        cb.var_int_arr_if[15] = 0x72 ^ 0x1D ^ (0x14 ^ 0x7D);
        cb.var_int_arr_if[16] = 219 + 91 - 244 + 185 ^ 50 + 87 - 109 + 103;
        cb.var_int_arr_if[17] = 0x37 ^ 0x15;
        cb.var_int_arr_if[18] = 3 ^ 0x77;
        cb.var_int_arr_if[19] = 0x52 ^ 0x27;
        cb.var_int_arr_if[20] = 0x6C ^ 0x1A;
        cb.var_int_arr_if[21] = 0xC3 ^ 0xB4;
        cb.var_int_arr_if[22] = 0x1B ^ 0x6B ^ (0xB8 ^ 0xB1);
    }

        public cb(int n) {
        int n2;
        this.cfr_renamed_3 = n;
        if (cb.boolean_do(fh.var_int_char, var_int_arr_if[0]) && (dR.var_int_goto != AngelChip.duLieuNguoiChoi.var_short_goto)) {
            n2 = dR.var_int_goto;
            if (((0x8F ^ 0xB9) & ~(0x7B ^ 0x4D)) != 0) {
                throw null;
            }
        } else {
            n2 = var_int_arr_if[1];
        }
        this.cfr_renamed_2 = n2;
    }

    private static boolean boolean_do(int n, int n2) {
        return n == n2;
    }

                private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static void cfr_renamed_23() {
        if (!(var_int_if != var_int_arr_if[1]) || cb.boolean_do(cfr_renamed_1)) {
            return;
        }
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_int.size())) {
            es es2 = (es)dR.var_java_util_Vector_int.elementAt(n2);
            if ((es2 != null) && (!(es2.cfr_renamed_6 != var_int_arr_if[1]) || cb.boolean_do(es2.cfr_renamed_5, var_int_arr_if[15]))) {
                if (cb.boolean_do((int)es2.var_byte_for, var_int_arr_if[6])) {
                    es2.var_byte_int = (byte)var_int_arr_if[16];
                    if (-(0x44 ^ 0x41) >= 0) {
                        return;
                    }
                } else {
                    es2.var_byte_int = (byte)var_int_arr_if[17];
                }
                fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
                et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n2, var_int_arr_if[1]);
                es2.cfr_renamed_6 = var_int_arr_if[1];
                et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n2, var_int_if);
                if (!(++n < cfr_renamed_1)) break;
            }
            ++n2;
            if (-" ".length() != "  ".length()) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã gieo hạt xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Cần chủ farm làm đất mới có thể gieo hạt!");
    }

    private static void cfr_renamed_24() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_int.size())) {
            es es2 = (es)dR.var_java_util_Vector_int.elementAt(n2);
            if ((es2 != null) && (es2.cfr_renamed_5 < var_int_arr_if[5]) && (es2.cfr_renamed_6 != var_int_arr_if[1]) && (es2.var_byte_new > 0) && (es2.var_byte_new < var_int_arr_if[11])) {
                ++n;
                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) {
                    AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                }
                int n3 = var_int_arr_if[3];
                while ((es2.var_byte_new < var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
                    ++n3;
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n2, var_int_arr_if[13]);
                    if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                        TienIchGame.void_if(500L);
                        return;
                    }
                    if (!cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) break;
                    if ((n2 > 0)) {
                        --n2;
                    }
                    AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                    break;
                }
            }
            ++n2;
            if ("   ".length() != "  ".length()) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã bón phân xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Cây trồng không cần phân bón!");
    }

    public final String toString() {
        return "Farm giúp bạn";
    }

        private static void cfr_renamed_22() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_byte.size())) {
            block11: {
                hs hs2;
                block12: {
                    block14: {
                        block13: {
                            int n3;
                            hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n2);
                            if (!(hs2 != null)) break block11;
                            if (!(hs2.coKichHoat ? 1 : 0 == null)) break block12;
                            ++n;
                            switch (hs2.cfr_renamed_9) {
                                case 54: 
                                case 59: {
                                    n3 = var_int_arr_if[18];
                                    if (" ".length() < "   ".length()) break;
                                    return;
                                }
                                case 50: 
                                case 56: {
                                    n3 = var_int_arr_if[19];
                                    if (((0x80 ^ 0xBF) & ~(0x10 ^ 0x2F)) != " ".length()) break;
                                    return;
                                }
                                case 51: 
                                case 52: 
                                case 55: 
                                case 58: 
                                case 60: 
                                case 61: {
                                    n3 = var_int_arr_if[20];
                                    if (-(87 + 26 - 86 + 132 ^ 128 + 14 - 45 + 58) <= 0) break;
                                    return;
                                }
                                case 53: {
                                    n3 = var_int_arr_if[21];
                                    if (-" ".length() <= "  ".length()) break;
                                    return;
                                }
                                default: {
                                    n3 = var_int_arr_if[1];
                                }
                            }
                            if (!(n3 != var_int_arr_if[1])) break block13;
                            if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, n3))) {
                                AutoFarm.void_do(n3, var_int_arr_if[4]);
                            }
                            et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, n3);
                            if (!(TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) break block14;
                            AutoFarm.cfr_renamed_1(hs2, "No bụng");
                            TienIchGame.void_if(500L);
                            if ("   ".length() > (0x72 ^ 0x1C ^ (0x3C ^ 0x56))) {
                                return;
                            }
                            break block11;
                        }
                        AutoFarm.cfr_renamed_1(hs2, "Chưa hỗ trợ");
                    }
                    break block11;
                }
                AutoFarm.cfr_renamed_1(hs2, "Không đói");
            }
            ++n2;
            if ((57 + 123 - 90 + 41 ^ 81 + 14 - 13 + 53) >= (0xE9 ^ 0xC0 ^ (0xB7 ^ 0x9A))) continue;
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
    public final synchronized void d_() {
        block47: {
            if ((GameCanvas.var_en_do instanceof ThongTinNhanVat == null)) {
                return;
            }
            if (cb.boolean_do(this.cfr_renamed_2, var_int_arr_if[1])) {
                AutoController.tatAuto();
                return;
            }
            if ((fh.var_int_char != var_int_arr_if[0])) {
                if ((fh.var_int_char != var_int_arr_if[2])) {
                    long l;
                    if ((GameCanvas.var_en_do instanceof gO == null) && cb.cfr_renamed_4((l = System.currentTimeMillis() - this.cfr_renamed_4 == 2000L))) {
                        TienIchGame.void_if(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_1(var_int_arr_if[2]) ? 1 : 0 == null)) {
                        TienIchGame.void_if(3000L);
                    }
                    return;
                }
                if ((fv_0.var_java_util_Vector_do == null)) {
                    dt_0.dt_0_do().cfr_renamed_2();
                    if ((TienIchGame.boolean_do() ? 1 : 0 == null)) {
                        TienIchGame.void_if(1000L);
                    }
                }
                if ((GameCanvas.var_en_do == fv_0.cfr_renamed_1())) {
                    fv_0.cfr_renamed_1().var_en_do.cfr_renamed_4();
                }
                int n = var_int_arr_if[1];
                if ((fv_0.var_java_util_Vector_do != null) && !(fv_0.var_java_util_Vector_do.isEmpty())) {
                    int n2 = var_int_arr_if[3];
                    while ((n2 < fv_0.var_java_util_Vector_do.size())) {
                        DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_do.elementAt(n2);
                        if ((ef2 != null) && cb.boolean_do((int)ef2.var_short_goto, this.cfr_renamed_2)) {
                            n = ef2.var_short_goto;
                            if (" ".length() <= (0x75 ^ 0x71)) break;
                            return;
                        }
                        ++n2;
                        }
                }
                if (cb.boolean_do(n, var_int_arr_if[1])) {
                    fv_0.cfr_renamed_5();
                    GameCanvas.hienThongBaoPopup("Có lỗi xảy ra. Không tìm thấy bạn bè!");
                    AutoController.tatAuto();
                    return;
                }
                dR.dR_do().cfr_renamed_0(n, var_int_arr_if[4]);
                if ((TienIchGame.cfr_renamed_3(var_int_arr_if[0]) ? 1 : 0 == null)) {
                    GameCanvas.cfr_renamed_7();
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            if ((GameCanvas.var_dj_0_do != null)) {
                GameCanvas.cfr_renamed_7();
            }
            try {
                switch (this.cfr_renamed_3) {
                    case 1: {
                        es es2;
                        TienIchGame.void_if("Đang tưới nước. Xin hãy chờ...");
                        int n = var_int_arr_if[3];
                        while ((n < dR.var_java_util_Vector_int.size())) {
                            es2 = (es)dR.var_java_util_Vector_int.elementAt(n);
                            if ((es2 != null) && (es2.cfr_renamed_5 < var_int_arr_if[5]) && (es2.cfr_renamed_6 != var_int_arr_if[1])) {
                                if (cb.boolean_do((int)es2.var_byte_for, var_int_arr_if[6])) {
                                    es2.var_byte_int = (byte)var_int_arr_if[7];
                                    } else {
                                    es2.var_byte_int = (byte)var_int_arr_if[8];
                                }
                                fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
                            }
                            ++n;
                            if (-"   ".length() < 0) continue;
                            return;
                        }
                        n = var_int_arr_if[3];
                        while ((n < dR.var_java_util_Vector_int.size())) {
                            es2 = (es)dR.var_java_util_Vector_int.elementAt(n);
                            if ((es2 != null) && (es2.cfr_renamed_5 < var_int_arr_if[5]) && (es2.cfr_renamed_6 != var_int_arr_if[1])) {
                                if (cb.boolean_do((int)es2.var_byte_for, var_int_arr_if[6])) {
                                    es2.var_byte_int = (byte)var_int_arr_if[9];
                                    } else {
                                    es2.var_byte_int = (byte)var_int_arr_if[10];
                                }
                                es2.coTrangThai = var_int_arr_if[3];
                                fh.var_short_arr_if[es2.soLuong * fh.var_short_if + es2.var_int_new] = es2.var_byte_int;
                                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[11]);
                                if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                                    TienIchGame.void_if(500L);
                                }
                            }
                            ++n;
                            }
                        GameCanvas.hienThongBaoPopup("Đã tưới nước xong!");
                        if ((0x50 ^ 0x77 ^ (0x9A ^ 0xB9)) < " ".length()) {
                            return;
                        }
                        break block47;
                    }
                    case 12: {
                        int n = var_int_arr_if[3];
                        int n3 = var_int_arr_if[3];
                        while ((n3 < dR.var_java_util_Vector_int.size())) {
                            es es3 = (es)dR.var_java_util_Vector_int.elementAt(n3);
                            if ((es3 != null) && (es3.cfr_renamed_5 < var_int_arr_if[5]) && (es3.cfr_renamed_6 != var_int_arr_if[1]) && (es3.coKichHoat ? 1 : 0 == null)) {
                                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[12]))) {
                                    AutoFarm.void_do(var_int_arr_if[12], var_int_arr_if[4]);
                                }
                                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n3, var_int_arr_if[12]);
                                if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                                    ++n;
                                    TienIchGame.void_if(500L);
                                }
                            }
                            ++n3;
                            if (("  ".length() & ("  ".length() ^ -" ".length())) == 0) continue;
                            return;
                        }
                        GameCanvas.hienThongBaoPopup("Đã diệt " + n + " sâu!");
                        break block47;
                    }
                    case 13: {
                        cb.cfr_renamed_26();
                        if ("  ".length() == 0) {
                            return;
                        }
                        break block47;
                    }
                    case 4: {
                        cb.cfr_renamed_24();
                        break block47;
                    }
                    case 7: {
                        cb.cfr_renamed_22();
                        if ("   ".length() == ((0xEA ^ 0xA6) & ~(0x15 ^ 0x59))) {
                            return;
                        }
                        break block47;
                    }
                    case 14: {
                        cb.cfr_renamed_29();
                        if (" ".length() <= 0) {
                            return;
                        }
                        break block47;
                    }
                    case 15: {
                        cb.cfr_renamed_25();
                        break block47;
                    }
                    case 9: {
                        cb.cfr_renamed_27();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        break block47;
                    }
                    case 3: {
                        cb.cfr_renamed_23();
                        break block47;
                    }
                    default: {
                        cb.cfr_renamed_17();
                        break;
                    }
                }
            }
            catch (Exception exception) {
                break block47;
            }
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        AutoController.tatAuto();
    }

        public final void void_do() {
        if (cb.boolean_do(this.cfr_renamed_2, var_int_arr_if[1])) {
            GameCanvas.hienThongBaoPopup("Bạn cần đứng trong farm bạn bè để sử dụng chức năng này!");
            return;
        }
        AutoController.cfr_renamed_1(this);
    }

    private static void cfr_renamed_17() {
        bm bm2;
        TienIchGame.void_if("Đang chăm sóc. Xin hãy chờ...");
        int n = var_int_arr_if[3];
        while ((n < dR.var_java_util_Vector_int.size())) {
            bm2 = (es)dR.var_java_util_Vector_int.elementAt(n);
            if ((bm2 != null) && (bm2.cfr_renamed_5 < var_int_arr_if[5]) && (bm2.cfr_renamed_6 != var_int_arr_if[1])) {
                if ((bm2.var_byte_new > 0) && (bm2.var_byte_new < var_int_arr_if[11])) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) {
                        AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                    }
                    int n2 = var_int_arr_if[3];
                    while ((bm2.var_byte_new < var_int_arr_if[11]) && (n2 < var_int_arr_if[14]) && cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
                        ++n2;
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[13]);
                        if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                            TienIchGame.void_if(500L);
                            if (" ".length() != ((0x75 ^ 0x71) & ~(0x91 ^ 0x95))) continue;
                            return;
                        }
                        if (!cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[13]))) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[13], var_int_arr_if[4]);
                        break;
                    }
                }
                if ((bm2.dangChayAuto ? 1 : 0 == null)) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[9]))) {
                        AutoFarm.void_do(var_int_arr_if[9], var_int_arr_if[4]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[9]);
                    if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                        TienIchGame.void_if(500L);
                    }
                }
                if ((bm2.coKichHoat ? 1 : 0 == null)) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[12]))) {
                        AutoFarm.void_do(var_int_arr_if[12], var_int_arr_if[4]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[12]);
                    if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                        TienIchGame.void_if(500L);
                    }
                }
                if ((bm2.var_byte_int != var_int_arr_if[10]) && (bm2.var_byte_int != var_int_arr_if[9])) {
                    if (cb.boolean_do((int)bm2.var_byte_for, var_int_arr_if[6])) {
                        bm2.var_byte_int = (byte)var_int_arr_if[9];
                        } else {
                        bm2.var_byte_int = (byte)var_int_arr_if[10];
                    }
                    bm2.coTrangThai = var_int_arr_if[3];
                    fh.var_short_arr_if[bm2.soLuong * fh.var_short_if + bm2.var_int_new] = bm2.var_byte_int;
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[11]);
                    if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                        TienIchGame.void_if(500L);
                    }
                }
            }
            ++n;
            if (-" ".length() <= 0) continue;
            return;
        }
        n = var_int_arr_if[3];
        while ((n < dR.var_java_util_Vector_byte.size())) {
            bm2 = (hs)dR.var_java_util_Vector_byte.elementAt(n);
            if ((bm2 != null)) {
                if (cb.cfr_renamed_2(((hs)bm2).cfr_renamed_12, var_int_arr_if[11])) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) {
                        AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                    }
                    int n3 = var_int_arr_if[3];
                    while (cb.cfr_renamed_2(((hs)bm2).cfr_renamed_12, var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
                        ++n3;
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[7]);
                        if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                            TienIchGame.void_if(500L);
                            if (-" ".length() <= 0) continue;
                            return;
                        }
                        if (!cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                        break;
                    }
                }
                String string = "";
                if (cb.cfr_renamed_0(((hs)bm2).coKichHoat ? 1 : 0)) {
                    int n4;
                    switch (((hs)bm2).cfr_renamed_9) {
                        case 54: 
                        case 59: {
                            n4 = var_int_arr_if[18];
                            if ("   ".length() != ((0xFD ^ 0xA4 ^ (0x1F ^ 0x16)) & (0xCA ^ 0x9A ^ (0x24 ^ 0x65) & ~(0x1B ^ 0x5A) ^ -" ".length()))) break;
                            return;
                        }
                        case 50: 
                        case 56: {
                            n4 = var_int_arr_if[19];
                            if ("  ".length() == "  ".length()) break;
                            return;
                        }
                        case 51: 
                        case 52: 
                        case 55: 
                        case 58: 
                        case 60: 
                        case 61: {
                            n4 = var_int_arr_if[20];
                            if (null == null) break;
                            return;
                        }
                        case 53: {
                            n4 = var_int_arr_if[21];
                            if ("  ".length() != 0) break;
                            return;
                        }
                        default: {
                            n4 = var_int_arr_if[1];
                        }
                    }
                    if ((n4 != var_int_arr_if[1])) {
                        if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, n4))) {
                            AutoFarm.void_do(n4, var_int_arr_if[4]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, n4);
                        if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                            string = string + "No bụng";
                            TienIchGame.void_if(500L);
                        }
                    }
                }
                if (cb.cfr_renamed_0(((hs)bm2).var_boolean_arr_do[var_int_arr_if[4]])) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[16]))) {
                        AutoFarm.void_do(var_int_arr_if[16], var_int_arr_if[4]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[16]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi cúm";
                        TienIchGame.void_if(500L);
                    }
                }
                if (cb.cfr_renamed_0(((hs)bm2).var_boolean_arr_do[var_int_arr_if[3]])) {
                    if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[22]))) {
                        AutoFarm.void_do(var_int_arr_if[22], var_int_arr_if[4]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[22]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi tiêu chảy";
                        TienIchGame.void_if(500L);
                    }
                }
                if (!(string.equals(""))) {
                    AutoFarm.cfr_renamed_1((hs)bm2, string);
                }
            }
            ++n;
            if ("  ".length() >= 0) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
    }

    private static void cfr_renamed_29() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n2);
            if ((hs2 != null) && (hs2.var_boolean_arr_do[var_int_arr_if[4]] == null)) {
                ++n;
                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[16]))) {
                    AutoFarm.void_do(var_int_arr_if[16], var_int_arr_if[4]);
                }
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_if[16]);
                if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                    AutoFarm.cfr_renamed_1(hs2, "Khỏi cúm");
                    TienIchGame.void_if(500L);
                }
            }
            ++n2;
            if (((0xCC ^ 0xC3 ^ (0xDC ^ 0x88)) & (0x3A ^ 0x71 ^ (0x46 ^ 0x56) ^ -" ".length())) == ((0x56 ^ 0x69 ^ (0x39 ^ 0x22)) & (0x80 ^ 0x87 ^ (0x28 ^ 0xB) ^ -" ".length()))) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bệnh cúm xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không bị cúm!");
    }

    private static void cfr_renamed_26() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_int.size())) {
            es es2 = (es)dR.var_java_util_Vector_int.elementAt(n2);
            if ((es2 != null) && (es2.cfr_renamed_5 < var_int_arr_if[5]) && (es2.cfr_renamed_6 != var_int_arr_if[1]) && (es2.dangChayAuto ? 1 : 0 == null)) {
                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[9]))) {
                    AutoFarm.void_do(var_int_arr_if[9], var_int_arr_if[4]);
                }
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n2, var_int_arr_if[9]);
                if ((TienIchGame.cfr_renamed_3(5000L) ? 1 : 0 == null)) {
                    ++n;
                    TienIchGame.void_if(500L);
                }
            }
            ++n2;
            if ((0x7A ^ 0x7E ^ (0xA1 ^ 0xAB) & ~(0xA8 ^ 0xA2)) != " ".length()) continue;
            return;
        }
        GameCanvas.hienThongBaoPopup("Đã diệt " + n + " cỏ!");
    }

    private static void cfr_renamed_27() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n2);
            if ((hs2 != null) && (hs2.cfr_renamed_12 < var_int_arr_if[11])) {
                ++n;
                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) {
                    AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                }
                int n3 = var_int_arr_if[3];
                while ((hs2.cfr_renamed_12 < var_int_arr_if[11]) && (n3 < var_int_arr_if[14]) && cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0)) {
                    ++n3;
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_if[7]);
                    if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                        TienIchGame.void_if(500L);
                        if ("  ".length() == "  ".length()) continue;
                        return;
                    }
                    if (!cb.cfr_renamed_0(ae.ae_do().boolean_do() ? 1 : 0) || !cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[7]))) break;
                    AutoFarm.void_do(var_int_arr_if[7], var_int_arr_if[4]);
                    if ("  ".length() <= "   ".length()) continue;
                    return;
                }
            }
            ++n2;
            if ("  ".length() > -" ".length()) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã bơm thuốc bổ xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không cần thuốc bổ!");
    }

    private static void cfr_renamed_25() {
        int n = var_int_arr_if[3];
        int n2 = var_int_arr_if[3];
        while ((n2 < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n2);
            if ((hs2 != null) && (hs2.var_boolean_arr_do[var_int_arr_if[3]] == null)) {
                ++n;
                if (cb.boolean_do(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[22]))) {
                    AutoFarm.void_do(var_int_arr_if[22], var_int_arr_if[4]);
                }
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)hs2.cfr_renamed_9, var_int_arr_if[22]);
                if ((TienIchGame.boolean_if(5000L) ? 1 : 0 == null)) {
                    AutoFarm.cfr_renamed_1(hs2, "Khỏi tiêu chảy");
                    TienIchGame.void_if(500L);
                }
            }
            ++n2;
            if (-"  ".length() <= 0) continue;
            return;
        }
        if ((n > 0)) {
            GameCanvas.hienThongBaoPopup("Đã chữa bệnh tiêu chảy xong!");
            return;
        }
        GameCanvas.hienThongBaoPopup("Vật nuôi không bị tiêu chảy!");
    }

            static {
        cb.cfr_renamed_3();
        var_int_if = var_int_arr_if[1];
        cfr_renamed_1 = var_int_arr_if[3];
    }
}

