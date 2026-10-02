/*
 * Decompiled with CFR 0.152.
 */
import java.util.Hashtable;
import main.AngelChip;

/*
 * Renamed from gH
 */
public final class gh_0
extends AutoFarm {
    public static int cfr_renamed_1;
    private static final int[] var_int_arr_if;
    public static int var_int_if;

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        public final String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer().append("Farm giúp ");
        if ((AngelChip.duLieuNguoiChoi.var_byte_do == var_int_arr_if[5])) {
            string = "vợ";
            if (((0xBC ^ 0x98) & ~(0xF ^ 0x2B)) < 0) {
                return null;
            }
        } else {
            string = "chồng";
        }
        return stringBuffer.append(string).toString();
    }

        public final synchronized void d_() {
        bm bm2;
        if ((cfr_renamed_1 > 0) && (var_int_if >= cfr_renamed_1)) {
            String string;
            AutoController.tatAuto();
            StringBuffer stringBuffer = new StringBuffer().append("Đã farm xong: ").append(var_int_if);
            if ((cfr_renamed_1 > 0)) {
                string = " / " + cfr_renamed_1;
                if (" ".length() > " ".length()) {
                    return;
                }
            } else {
                string = "";
            }
            GameCanvas.hienThongBaoPopup(stringBuffer.append(string).append(" lần!").toString());
            return;
        }
        if (gh_0.cfr_renamed_3((System.currentTimeMillis() - this.var_java_util_Hashtable_int == 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if (gh_0.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
            return;
        }
        if (gh_0.boolean_do(fh.var_int_char, var_int_arr_if[1])) {
            if (gh_0.boolean_do(fh.var_int_char, var_int_arr_if[2])) {
                long l;
                if (gh_0.boolean_do(GameCanvas.var_en_do instanceof gO) && gh_0.cfr_renamed_4((l = System.currentTimeMillis() - this.cfr_renamed_4 == 2000L))) {
                    TienIchGame.void_if(2000L - l);
                }
                if (gh_0.boolean_do(TienIchGame.cfr_renamed_1(var_int_arr_if[2]) ? 1 : 0)) {
                    TienIchGame.void_if(3000L);
                }
                return;
            }
            if ((fv_0.var_java_util_Vector_do == null)) {
                dt_0.dt_0_do().cfr_renamed_2();
                if (gh_0.boolean_do(TienIchGame.boolean_do() ? 1 : 0)) {
                    TienIchGame.void_if(1000L);
                }
            }
            if ((GameCanvas.var_en_do == fv_0.cfr_renamed_1())) {
                fv_0.cfr_renamed_1().var_en_do.cfr_renamed_4();
            }
            int n = var_int_arr_if[3];
            if ((fv_0.var_java_util_Vector_do != null) && !(fv_0.var_java_util_Vector_do.isEmpty())) {
                int n2 = var_int_arr_if[0];
                while ((n2 < fv_0.var_java_util_Vector_do.size())) {
                    DuLieuNguoiChoi ef2 = (DuLieuNguoiChoi)fv_0.var_java_util_Vector_do.elementAt(n2);
                    if ((ef2 != null) && (gh_0.cfr_renamed_1((Object)ef2.var_java_lang_String_int) && !gh_0.cfr_renamed_0(ef2.var_java_lang_String_int.toLowerCase().indexOf("đã kết hôn"), var_int_arr_if[3]) || (ef2.var_short_class == var_int_arr_if[4]))) {
                        n = ef2.var_short_goto;
                        if ("  ".length() >= 0) break;
                        return;
                    }
                    ++n2;
                    if ((0x84 ^ 0x80) > 0) continue;
                    return;
                }
            }
            if ((n == var_int_arr_if[3])) {
                fv_0.cfr_renamed_5();
                GameCanvas.hienThongBaoPopup("Không tìm thấy vợ hoặc chồng trong danh sách bạn bè!");
                AutoController.tatAuto();
                return;
            }
            dR.dR_do().cfr_renamed_0(n, var_int_arr_if[5]);
            if (gh_0.boolean_do(TienIchGame.cfr_renamed_3(var_int_arr_if[1]) ? 1 : 0)) {
                GameCanvas.cfr_renamed_7();
                TienIchGame.void_if(1000L);
            }
            return;
        }
        if ((GameCanvas.var_dj_0_do != null)) {
            GameCanvas.cfr_renamed_7();
        }
        TienIchGame.void_if("Đang chăm sóc. Xin hãy chờ...");
        int n = var_int_arr_if[0];
        while ((n < dR.var_java_util_Vector_int.size())) {
            bm2 = (es)dR.var_java_util_Vector_int.elementAt(n);
            if ((bm2 != null) && (bm2.cfr_renamed_5 < var_int_arr_if[6]) && gh_0.boolean_do(bm2.cfr_renamed_6, var_int_arr_if[3])) {
                if ((bm2.var_byte_new > 0) && (bm2.var_byte_new < var_int_arr_if[7])) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[8]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[8], var_int_arr_if[5]);
                    }
                    int n3 = var_int_arr_if[0];
                    while ((bm2.var_byte_new < var_int_arr_if[7]) && (n3 < var_int_arr_if[9]) && gh_0.boolean_do(ae.ae_do().boolean_do() ? 1 : 0)) {
                        ++n3;
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[8]);
                        if (gh_0.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0)) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                                return;
                            }
                            TienIchGame.void_if(500L);
                            if ((" ".length() & (" ".length() ^ -" ".length())) == ((0x28 ^ 0x18 ^ (0xBA ^ 0x87)) & (175 + 58 - 201 + 151 ^ 10 + 10 - -119 + 47 ^ -" ".length()))) continue;
                            return;
                        }
                        if (!gh_0.boolean_do(ae.ae_do().boolean_do() ? 1 : 0) || !(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[8]) == null)) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[8], var_int_arr_if[5]);
                        break;
                    }
                }
                if (gh_0.boolean_do(bm2.dangChayAuto ? 1 : 0)) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[10]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[10], var_int_arr_if[5]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[10]);
                    if (gh_0.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0)) {
                        this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                        if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                            return;
                        }
                        TienIchGame.void_if(500L);
                    }
                }
                if (gh_0.boolean_do(bm2.coKichHoat ? 1 : 0)) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[11]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[11], var_int_arr_if[5]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[11]);
                    if (gh_0.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0)) {
                        this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                        if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                            return;
                        }
                        TienIchGame.void_if(500L);
                    }
                }
                if ((bm2.var_byte_for == var_int_arr_if[12])) {
                    bm2.var_byte_int = (byte)var_int_arr_if[10];
                    if (" ".length() == 0) {
                        return;
                    }
                } else {
                    bm2.var_byte_int = (byte)var_int_arr_if[13];
                }
                bm2.coTrangThai = var_int_arr_if[0];
                fh.var_short_arr_if[bm2.soLuong * fh.var_short_if + bm2.var_int_new] = bm2.var_byte_int;
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n, var_int_arr_if[7]);
                if (gh_0.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0)) {
                    this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                    if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                        return;
                    }
                    TienIchGame.void_if(500L);
                }
            }
            ++n;
            if (" ".length() == " ".length()) continue;
            return;
        }
        n = var_int_arr_if[0];
        while ((n < dR.var_java_util_Vector_byte.size())) {
            bm2 = (hs)dR.var_java_util_Vector_byte.elementAt(n);
            if ((bm2 != null)) {
                if (gh_0.cfr_renamed_2(((hs)bm2).cfr_renamed_12, var_int_arr_if[7])) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[14]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[14], var_int_arr_if[5]);
                    }
                    int n4 = var_int_arr_if[0];
                    while (gh_0.cfr_renamed_2(((hs)bm2).cfr_renamed_12, var_int_arr_if[7]) && (n4 < var_int_arr_if[9]) && gh_0.boolean_do(ae.ae_do().boolean_do() ? 1 : 0)) {
                        ++n4;
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[14]);
                        if (gh_0.boolean_do(TienIchGame.boolean_if(5000L) ? 1 : 0)) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                                return;
                            }
                            TienIchGame.void_if(500L);
                            if ("  ".length() > " ".length()) continue;
                            return;
                        }
                        if (!gh_0.boolean_do(ae.ae_do().boolean_do() ? 1 : 0) || !(AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[14]) == null)) break;
                        if ((n > 0)) {
                            --n;
                        }
                        AutoFarm.void_do(var_int_arr_if[14], var_int_arr_if[5]);
                        break;
                    }
                }
                String string = "";
                if (gh_0.boolean_do(((hs)bm2).coKichHoat ? 1 : 0)) {
                    int n5;
                    switch (((hs)bm2).cfr_renamed_9) {
                        case 54: 
                        case 59: {
                            n5 = var_int_arr_if[15];
                            if (-(119 + 112 - 165 + 61 ^ (0xE4 ^ 0x9F)) <= 0) break;
                            return;
                        }
                        case 50: 
                        case 56: {
                            n5 = var_int_arr_if[16];
                            if (" ".length() <= "   ".length()) break;
                            return;
                        }
                        case 51: 
                        case 52: 
                        case 55: 
                        case 58: 
                        case 60: {
                            n5 = var_int_arr_if[17];
                            if ("   ".length() == "   ".length()) break;
                            return;
                        }
                        case 53: {
                            n5 = var_int_arr_if[18];
                            if ("   ".length() >= -" ".length()) break;
                            return;
                        }
                        default: {
                            n5 = var_int_arr_if[3];
                        }
                    }
                    if (gh_0.boolean_do(n5, var_int_arr_if[3])) {
                        if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, n5) == null)) {
                            AutoFarm.void_do(n5, var_int_arr_if[5]);
                        }
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, n5);
                        if (gh_0.boolean_do(TienIchGame.boolean_if(5000L) ? 1 : 0)) {
                            this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                            string = string + "No bụng";
                            if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                                AutoFarm.cfr_renamed_1((hs)bm2, string);
                                return;
                            }
                            TienIchGame.void_if(500L);
                        }
                    }
                }
                if (gh_0.boolean_do(((hs)bm2).var_boolean_arr_do[var_int_arr_if[5]])) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[19]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[19], var_int_arr_if[5]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[19]);
                    if (gh_0.boolean_do(TienIchGame.boolean_if(5000L) ? 1 : 0)) {
                        this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi cúm";
                        if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                            AutoFarm.cfr_renamed_1((hs)bm2, string);
                            return;
                        }
                        TienIchGame.void_if(500L);
                    }
                }
                if (gh_0.boolean_do(((hs)bm2).var_boolean_arr_do[var_int_arr_if[0]])) {
                    if ((AutoFarm.cfr_renamed_1(dR.var_java_util_Vector_try, var_int_arr_if[20]) == null)) {
                        AutoFarm.void_do(var_int_arr_if[20], var_int_arr_if[5]);
                    }
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, (int)((hs)bm2).cfr_renamed_9, var_int_arr_if[20]);
                    if (gh_0.boolean_do(TienIchGame.boolean_if(5000L) ? 1 : 0)) {
                        this.var_java_util_Hashtable_int = (Hashtable)System.currentTimeMillis();
                        if (!(string.equals(""))) {
                            string = string + ", ";
                        }
                        string = string + "khỏi tiêu chảy";
                        if ((var_int_if += var_int_arr_if[5] >= cfr_renamed_1) && (cfr_renamed_1 > 0)) {
                            AutoFarm.cfr_renamed_1((hs)bm2, string);
                            return;
                        }
                        TienIchGame.void_if(500L);
                    }
                }
                if (!(string.equals(""))) {
                    AutoFarm.cfr_renamed_1((hs)bm2, string);
                }
            }
            ++n;
            if ("  ".length() != 0) continue;
            return;
        }
        if ((var_int_if > 0)) {
            TienIchGame.void_if(1000L);
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(2000L);
            return;
        }
        GameCanvas.hienThongBaoPopup("Farm không có gì để chăm sóc!");
        AutoController.tatAuto();
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public gh_0() {
        var_int_if = var_int_arr_if[0];
    }

        static {
        gh_0.cfr_renamed_3();
        cfr_renamed_1 = var_int_arr_if[21];
    }

        private static void cfr_renamed_3() {
        var_int_arr_if = new int[22];
        gh_0.var_int_arr_if[0] = (0x16 ^ 0x24) & ~(6 ^ 0x34);
        gh_0.var_int_arr_if[1] = 0x53 ^ 0x66;
        gh_0.var_int_arr_if[2] = 0x88 ^ 0x91;
        gh_0.var_int_arr_if[3] = -" ".length();
        gh_0.var_int_arr_if[4] = -(0xFFFFE077 & 0x7FAF) & (0xFFFFED77 & 0x76FF);
        gh_0.var_int_arr_if[5] = " ".length();
        gh_0.var_int_arr_if[6] = 0x83 ^ 0xB2 ^ (0x92 ^ 0xA6);
        gh_0.var_int_arr_if[7] = 105 + 181 - 218 + 142 ^ 37 + 103 - 2 + 44;
        gh_0.var_int_arr_if[8] = 0x44 ^ 0xD ^ (0x47 ^ 0x61);
        gh_0.var_int_arr_if[9] = 0xC9 ^ 0xBB ^ (0xD7 ^ 0xAF);
        gh_0.var_int_arr_if[10] = 0xC5 ^ 0xBE;
        gh_0.var_int_arr_if[11] = 0xC1 ^ 0xC5 ^ (0x5A ^ 0x22);
        gh_0.var_int_arr_if[12] = "  ".length();
        gh_0.var_int_arr_if[13] = 0x74 ^ 9 ^ (0x33 ^ 0x6B);
        gh_0.var_int_arr_if[14] = 0x9C ^ 0xB0 ^ (0xCA ^ 0x9C);
        gh_0.var_int_arr_if[15] = 0x68 ^ 0x49 ^ (0x31 ^ 0x64);
        gh_0.var_int_arr_if[16] = 166 + 69 - 98 + 39 ^ 42 + 189 - 102 + 68;
        gh_0.var_int_arr_if[17] = 0xB6 ^ 0xC0;
        gh_0.var_int_arr_if[18] = 0xE4 ^ 0x93;
        gh_0.var_int_arr_if[19] = 0xEC ^ 0xC2 ^ (0x94 ^ 0xC2);
        gh_0.var_int_arr_if[20] = 145 + 125 - 193 + 145 ^ 145 + 145 - 132 + 9;
        gh_0.var_int_arr_if[21] = 0x72 ^ 0x40;
    }

        public final void void_do() {
        AutoController.cfr_renamed_1(this);
    }

                }

