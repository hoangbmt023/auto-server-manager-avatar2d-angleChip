/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class hn
extends AutoFarm {
    private static final int[] cfr_renamed_0;
    private boolean cfr_renamed_1 = cfr_renamed_0[0];
    static ge_0 cfr_renamed_2;

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    public final synchronized void d_() {
        try {
            int n;
            if (hn.cfr_renamed_4((System.currentTimeMillis() - this.var_java_util_Hashtable_int, 180000L != null))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
                return;
            }
            if ((fh.var_int_char != cfr_renamed_0[4])) {
                if ((fh.var_int_char != cfr_renamed_0[5])) {
                    long l;
                    if ((GameCanvas.var_en_do instanceof gO != 0) && hn.cfr_renamed_0((l = System.currentTimeMillis() - this.cfr_renamed_4, 2000L != null))) {
                        TienIchGame.void_if(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_1(cfr_renamed_0[5]))) {
                        TienIchGame.void_if(2000L);
                    }
                    return;
                }
                if (hn.boolean_do(AutoFarm.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
                    AutoFarm.var_java_util_Vector_do.removeAllElements();
                }
                AutoFarm.cfr_renamed_4();
                AutoFarm.cfr_renamed_1(cfr_renamed_0[0]);
                super.cfr_renamed_0(cfr_renamed_0[0]);
                super.cfr_renamed_18();
                this.cfr_renamed_23();
                if (!(dR.var_java_util_Vector_int != null) || (dR.var_int_goto != AngelChip.duLieuNguoiChoi.var_short_goto)) {
                    GameCanvas.cfr_renamed_8();
                    dR.dR_do().cfr_renamed_0((int)AngelChip.duLieuNguoiChoi.var_short_goto, cfr_renamed_0[0]);
                    if (-" ".length() > (0xC2 ^ 0x8C ^ (0xFB ^ 0xB1))) {
                        return;
                    }
                } else {
                    dR.dR_do().cfr_renamed_1(dR.var_int_goto, dR.var_java_util_Vector_int, dR.var_java_util_Vector_byte, dR.var_byte_if, dR.var_byte_do, dR.var_short_do, dR.soLuongKhoa);
                }
                if ((GameCanvas.var_dj_0_do == null)) {
                    GameCanvas.cfr_renamed_2(MenuChinhAvatar.bv);
                }
                if ((TienIchGame.cfr_renamed_3(cfr_renamed_0[4]))) {
                    TienIchGame.void_if(1000L);
                }
                return;
            }
            GameCanvas.cfr_renamed_7();
            TienIchGame.void_if("Hãy chờ đến khi farm xong");
            AutoFarm.cfr_renamed_21();
            if ((this.cfr_renamed_1)) {
                fn.fn_do().cfr_renamed_0(cfr_renamed_0[2], cfr_renamed_0[3], cfr_renamed_0[3]);
                TienIchGame.cfr_renamed_8(10000L);
                new ej(cfr_renamed_0[6], cfr_renamed_0[7], cfr_renamed_0[0]).void_do();
                TienIchGame.cfr_renamed_8(5000L);
                new ej(cfr_renamed_0[3], cfr_renamed_0[7], cfr_renamed_0[0]).void_do();
                TienIchGame.cfr_renamed_8(5000L);
                new ej(cfr_renamed_0[0], cfr_renamed_0[7], cfr_renamed_0[0]).void_do();
                TienIchGame.cfr_renamed_8(5000L);
                }
            AutoFarm.cfr_renamed_4 = cfr_renamed_0[3];
            int n2 = cfr_renamed_0[3];
            int[] nArray = new int[dR.var_java_util_Vector_int.size()];
            int n3 = cfr_renamed_0[3];
            while ((n3 < dR.var_java_util_Vector_int.size())) {
                es es2 = (es)dR.var_java_util_Vector_int.elementAt(n3);
                nArray[n3] = es2.cfr_renamed_6;
                if (!(es2.cfr_renamed_6 != cfr_renamed_0[1]) || (es2.cfr_renamed_5 >= cfr_renamed_0[8])) {
                    ++n2;
                    if ((es2.cfr_renamed_5 == cfr_renamed_0[8])) {
                        et_0.et_0_do().cfr_renamed_5(dR.var_int_goto, n3);
                        AutoFarm.cfr_renamed_4 += cfr_renamed_0[0];
                    }
                }
                ++n3;
                return;
            }
            if ((n2 > 0)) {
                if ((AutoFarm.cfr_renamed_4 > 0) && (TienIchGame.cfr_renamed_3(10000L))) {
                    AutoFarm.e_();
                }
                int[] nArray2 = AutoFarm.int_arr_do();
                int n4 = cfr_renamed_0[3];
                n2 = cfr_renamed_0[3];
                while ((n2 < dR.var_java_util_Vector_int.size())) {
                    es es3 = (es)dR.var_java_util_Vector_int.elementAt(n2);
                    n = AutoFarm.cfr_renamed_1(nArray[n2], nArray2);
                    if ((!(es3.cfr_renamed_5 < cfr_renamed_0[9]) || (es3.cfr_renamed_6 == cfr_renamed_0[1])) && (n != cfr_renamed_0[1])) {
                        if ((es3.var_byte_for == cfr_renamed_0[6])) {
                            es3.var_byte_int = (byte)cfr_renamed_0[10];
                            if (" ".length() >= "  ".length()) {
                                return;
                            }
                        } else {
                            es3.var_byte_int = (byte)cfr_renamed_0[11];
                        }
                        fh.var_short_arr_if[es3.soLuong * fh.var_short_if + es3.var_int_new] = es3.var_byte_int;
                        if ((es3.cfr_renamed_6 != cfr_renamed_0[1])) {
                            et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n2, cfr_renamed_0[1]);
                        }
                        es3.cfr_renamed_6 = cfr_renamed_0[1];
                        et_0.et_0_do().cfr_renamed_0(dR.var_int_goto, n2, n);
                        ++n4;
                    }
                    ++n2;
                    if (" ".length() != -" ".length()) continue;
                    return;
                }
                if ((n4 > 0) && (TienIchGame.cfr_renamed_3(5000L))) {
                    TienIchGame.void_if(1000L);
                }
            }
            n3 = cfr_renamed_0[3];
            int n5 = cfr_renamed_0[3];
            while ((n5 < dR.var_java_util_Vector_int.size())) {
                es es4 = (es)dR.var_java_util_Vector_int.elementAt(n5);
                if ((es4.cfr_renamed_6 != cfr_renamed_0[1]) && (es4.cfr_renamed_5 < cfr_renamed_0[8])) {
                    et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, n5, cfr_renamed_0[12]);
                    if (!hn.boolean_do(TienIchGame.cfr_renamed_8(15000L) ? 1 : 0)) break;
                    if ((n3 >= cfr_renamed_0[13])) {
                        TienIchGame.void_if("Lỗi lái buôn hỗ trợ!");
                        if (null == null) break;
                        return;
                    }
                    ++n3;
                }
                ++n5;
                if (((0x57 ^ 0x7B) & ~(0x92 ^ 0xBE)) == 0) continue;
                return;
            }
            AutoFarm.cfr_renamed_13();
            Vector<hs> vector = new Vector<hs>();
            int n6 = cfr_renamed_0[3];
            int n7 = cfr_renamed_0[3];
            n = cfr_renamed_0[3];
            int n8 = cfr_renamed_0[3];
            n3 = cfr_renamed_0[3];
            int n9 = cfr_renamed_0[3];
            int n10 = cfr_renamed_0[3];
            int n11 = cfr_renamed_0[3];
            int n12 = cfr_renamed_0[3];
            int n13 = cfr_renamed_0[3];
            int n14 = cfr_renamed_0[3];
            while ((n14 < dR.var_java_util_Vector_byte.size())) {
                hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n14);
                if (!((hs2.cfr_renamed_9 != cfr_renamed_0[14]) && (hs2.cfr_renamed_9 != cfr_renamed_0[15]) && (hs2.cfr_renamed_9 != cfr_renamed_0[16]) && (hs2.cfr_renamed_9 != cfr_renamed_0[17]) && !(hs2.cfr_renamed_9 == cfr_renamed_0[18]) || !hn.boolean_do(hs2.cfr_renamed_15, bz.gk_0_do((int)hs2.cfr_renamed_9).soLuong * cfr_renamed_0[19]))) {
                    vector.addElement(hs2);
                    if ((hs2.cfr_renamed_9 == cfr_renamed_0[14])) {
                        ++n6;
                        } else if ((hs2.cfr_renamed_9 == cfr_renamed_0[15])) {
                        ++n7;
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    } else if ((hs2.cfr_renamed_9 == cfr_renamed_0[16])) {
                        ++n9;
                        if ("  ".length() <= ((0x31 ^ 0x38) & ~(0x94 ^ 0x9D))) {
                            return;
                        }
                    } else if ((hs2.cfr_renamed_9 == cfr_renamed_0[17])) {
                        ++n3;
                        if ((0x7A ^ 0x7E) == "  ".length()) {
                            return;
                        }
                    } else if ((hs2.cfr_renamed_9 == cfr_renamed_0[18])) {
                        ++n13;
                    }
                }
                ++n14;
                if (-" ".length() <= 0) continue;
                return;
            }
            if ((AngelChip.duLieuNguoiChoi.var_short_goto == dR.var_int_goto)) {
                hs hs3;
                n14 = cfr_renamed_0[3];
                int n15 = cfr_renamed_0[3];
                int n16 = cfr_renamed_0[3];
                while ((n16 < dR.var_java_util_Vector_byte.size())) {
                    hs3 = (hs)dR.var_java_util_Vector_byte.elementAt(n16);
                    if (!(hs3.cfr_renamed_9 != cfr_renamed_0[20]) || !(hs3.cfr_renamed_9 != cfr_renamed_0[21]) || !(hs3.cfr_renamed_9 != cfr_renamed_0[22]) || (hs3.cfr_renamed_9 == cfr_renamed_0[18])) {
                        ++n14;
                        if (" ".length() == 0) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != cfr_renamed_0[14]) || !(hs3.cfr_renamed_9 != cfr_renamed_0[16]) || (hs3.cfr_renamed_9 == cfr_renamed_0[19])) {
                        n14 += 2;
                        if ("  ".length() == 0) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != cfr_renamed_0[23]) || (hs3.cfr_renamed_9 == cfr_renamed_0[24])) {
                        n14 += 3;
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else if (!(hs3.cfr_renamed_9 != cfr_renamed_0[15]) || (hs3.cfr_renamed_9 == cfr_renamed_0[17])) {
                        ++n15;
                    }
                    if (!(!(hs3.cfr_renamed_10 > 0) || (hs3.cfr_renamed_9 != cfr_renamed_0[20]) && (hs3.cfr_renamed_9 != cfr_renamed_0[23]) && (hs3.cfr_renamed_9 != cfr_renamed_0[24]) && (hs3.cfr_renamed_9 != cfr_renamed_0[22]) && !(hs3.cfr_renamed_9 == cfr_renamed_0[19]))) {
                        hs3.cfr_renamed_10 = cfr_renamed_0[3];
                        int n17 = cfr_renamed_0[3];
                        if (hn.cfr_renamed_1((Object)this.cfr_renamed_1)) {
                            if ((this.cfr_renamed_1 instanceof AutoCauCa != 0)) {
                                n17 = AutoCauCa.cfr_renamed_7;
                                } else if ((this.cfr_renamed_1 instanceof aj != 0)) {
                                n17 = aj.var_int_if;
                                if ((0xEF ^ 0xB2 ^ (0xFB ^ 0xA2)) < 0) {
                                    return;
                                }
                            } else if ((this.cfr_renamed_1 instanceof ex_0 != 0)) {
                                n17 = ex_0.soLuong;
                            }
                        }
                        if (!(hs3.cfr_renamed_9 != cfr_renamed_0[23]) || !(hs3.cfr_renamed_9 != cfr_renamed_0[24]) || (hs3.cfr_renamed_9 == cfr_renamed_0[19])) {
                            et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs3.cfr_renamed_9);
                            dR.void_if(cfr_renamed_0[25]);
                            if ((hs3.cfr_renamed_9 == cfr_renamed_0[23]) && (cfr_renamed_0[26] - hs3.cfr_renamed_15 < n17 + cfr_renamed_0[27])) {
                                vector.addElement(hs3);
                                ++n10;
                                if ((0x41 ^ 0x45) < 0) {
                                    return;
                                }
                            } else if ((hs3.cfr_renamed_9 == cfr_renamed_0[24]) && (cfr_renamed_0[28] - hs3.cfr_renamed_15 < n17 + cfr_renamed_0[29])) {
                                vector.addElement(hs3);
                                ++n11;
                                if ((0x76 ^ 0x37 ^ (0xE2 ^ 0xA7)) == 0) {
                                    return;
                                }
                            } else if ((hs3.cfr_renamed_9 == cfr_renamed_0[19]) && (cfr_renamed_0[28] - hs3.cfr_renamed_15 < n17 + cfr_renamed_0[30])) {
                                vector.addElement(hs3);
                                ++n12;
                            }
                        }
                        if (!(hs3.cfr_renamed_9 != cfr_renamed_0[20]) || (hs3.cfr_renamed_9 == cfr_renamed_0[22])) {
                            et_0.et_0_do().cfr_renamed_2(dR.var_int_goto, hs3.cfr_renamed_9);
                            dR.void_if(cfr_renamed_0[31]);
                            if ((cfr_renamed_0[32] - hs3.cfr_renamed_15 < n17 + cfr_renamed_0[27])) {
                                vector.addElement(hs3);
                                if ((hs3.cfr_renamed_9 == cfr_renamed_0[20])) {
                                    ++n;
                                }
                                if ((hs3.cfr_renamed_9 == cfr_renamed_0[22])) {
                                    ++n8;
                                }
                            }
                        }
                    }
                    ++n16;
                    if ("  ".length() != -" ".length()) continue;
                    return;
                }
                AutoFarm.cfr_renamed_14();
                if ((dR.var_e_0_do.cfr_renamed_3 > 0)) {
                    fn.fn_do().void_do();
                    TienIchGame.cfr_renamed_13(5000L);
                    }
                if (hn.cfr_renamed_1((Object)this.cfr_renamed_1)) {
                    if ((this.cfr_renamed_1 instanceof AutoCauCa != 0)) {
                        AutoFarm.cfr_renamed_15();
                        if (((0xF0 ^ 0x90) & ~(0x7E ^ 0x1E)) < 0) {
                            return;
                        }
                    } else if ((this.cfr_renamed_1 instanceof aj != 0)) {
                        AutoFarm.cfr_renamed_6();
                        if (" ".length() <= 0) {
                            return;
                        }
                    } else if ((this.cfr_renamed_1 instanceof ex_0 != 0)) {
                        AutoFarm.cfr_renamed_10();
                    }
                }
                if (hn.boolean_do(vector.isEmpty() ? 1 : 0)) {
                    n16 = cfr_renamed_0[3];
                    while ((n16 < vector.size())) {
                        hs3 = (hs)vector.elementAt(n16);
                        et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, hs3.cfr_renamed_9);
                        if ((TienIchGame.boolean_if(15000L))) {
                            AutoFarm.cfr_renamed_1(hs3, "Bye bye T.T");
                            TienIchGame.void_if(500L);
                        }
                        ++n16;
                        if (-" ".length() == -" ".length()) continue;
                        return;
                    }
                }
                AutoFarm.cfr_renamed_8();
                super.cfr_renamed_7();
                if ((n14 < this.var_int_long)) {
                    n16 = this.var_int_long - n14;
                    switch (AutoFarm.var_byte_for) {
                        case 0: {
                            n += n16;
                            if ("  ".length() != 0) break;
                            return;
                        }
                        case 1: {
                            n8 += n16;
                            if ("   ".length() != 0) break;
                            return;
                        }
                        case 2: {
                            if (!(n16 >= cfr_renamed_0[6])) break;
                            n6 += n16 / cfr_renamed_0[6];
                        }
                    }
                }
                if ((n15 < this.cfr_renamed_5)) {
                    n16 = this.cfr_renamed_5 - n15;
                    if (hn.boolean_do(AutoFarm.var_byte_if)) {
                        n7 += n16;
                        if ((0x4D ^ 0x2F ^ (0x3F ^ 0x58)) <= 0) {
                            return;
                        }
                    } else if ((AutoFarm.var_byte_if == cfr_renamed_0[0])) {
                        n3 += n16;
                    }
                }
                if (!((n6 <= 0) && (n7 <= 0) && (n <= 0) && (n8 <= 0) && (n3 <= 0) && (n9 <= 0) && (n10 <= 0) && (n11 <= 0) && (n12 <= 0) && !(n13 > 0))) {
                    TienIchGame.void_if(1000L);
                    dR.dR_do().cfr_renamed_14();
                    TienIchGame.boolean_do(15000L);
                    if ((fh.var_int_char == cfr_renamed_0[5])) {
                        if ((n6 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n6)) {
                                hn.void_do(cfr_renamed_0[14]);
                                ++n16;
                                if ("  ".length() == "  ".length()) continue;
                                return;
                            }
                        }
                        if ((n7 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n7)) {
                                hn.void_do(cfr_renamed_0[15]);
                                ++n16;
                                if ("   ".length() <= "   ".length()) continue;
                                return;
                            }
                        }
                        if ((n > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n)) {
                                hn.void_do(cfr_renamed_0[20]);
                                ++n16;
                                if ((44 + 49 - 22 + 124 ^ 13 + 170 - 87 + 102) > 0) continue;
                                return;
                            }
                        }
                        if ((n8 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n8)) {
                                hn.void_do(cfr_renamed_0[22]);
                                ++n16;
                                return;
                            }
                        }
                        if ((n3 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n3)) {
                                hn.void_do(cfr_renamed_0[17]);
                                ++n16;
                                return;
                            }
                        }
                        if ((n9 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n9)) {
                                hn.void_do(cfr_renamed_0[16]);
                                ++n16;
                                if ("  ".length() >= ((0x14 ^ 5) & ~(0xA4 ^ 0xB5))) continue;
                                return;
                            }
                        }
                        if ((n10 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n10)) {
                                hn.void_do(cfr_renamed_0[23]);
                                ++n16;
                                if ((0x6D ^ 0x69) != "  ".length()) continue;
                                return;
                            }
                        }
                        if ((n11 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n11)) {
                                hn.void_do(cfr_renamed_0[24]);
                                ++n16;
                                if ("  ".length() >= 0) continue;
                                return;
                            }
                        }
                        if ((n12 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n12)) {
                                hn.void_do(cfr_renamed_0[19]);
                                ++n16;
                                if ("  ".length() != " ".length()) continue;
                                return;
                            }
                        }
                        if ((n13 > 0)) {
                            n16 = cfr_renamed_0[3];
                            while ((n16 < n13)) {
                                hn.void_do(cfr_renamed_0[18]);
                                ++n16;
                                if (" ".length() != 0) continue;
                                return;
                            }
                        }
                    }
                }
                if ((AngelChip.duLieuNguoiChoi.cfr_renamed_23 != cfr_renamed_0[1]) && (!hn.boolean_do(bp_0.cfr_renamed_5 ? 1 : 0) || !hn.boolean_do(bp_0.var_boolean_new ? 1 : 0) || (bp_0.coTrangThai))) {
                    TienIchGame.void_if(1000L);
                    AutoController.cfr_renamed_1(new bp_0(), (NhiemVuAutoBase)this.cfr_renamed_1);
                    return;
                }
            }
            }
        catch (Exception exception) {
            }
        if (((142 + 70 - 135 + 167 ^ 4 + 141 - 132 + 157) & (21 + 75 - -18 + 103 ^ 6 + 86 - -38 + 5 ^ -" ".length())) != (" ".length() & (" ".length() ^ -" ".length()))) {
            return;
        }
        if (hn.boolean_do(ae.ae_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if (hn.cfr_renamed_1((Object)this.cfr_renamed_1)) {
            TienIchGame.void_if(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        AutoController.tatAuto();
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
        TienIchGame.void_if("Đã xong việc");
    }

            public final boolean boolean_do(String string) {
        if (!hn.boolean_do(string.startsWith("Bạn đã mua") ? 1 : 0) || (string.startsWith("Chế độ chăm sóc nông trại nhanh đã được lái buôn kích hoạt"))) {
            TienIchGame.void_int();
            return cfr_renamed_0[0];
        }
        return super.boolean_do(string);
    }

    private static void cfr_renamed_3() {
        cfr_renamed_0 = new int[33];
        hn.cfr_renamed_0[0] = " ".length();
        hn.cfr_renamed_0[1] = -" ".length();
        hn.cfr_renamed_0[2] = 0x68 ^ 0x73;
        hn.cfr_renamed_0[3] = (0x2C ^ 0x25 ^ (0x19 ^ 6)) & (0x56 ^ 0xD ^ (0xCA ^ 0x87) ^ -" ".length());
        hn.cfr_renamed_0[4] = 0x9C ^ 0xA1 ^ (0x95 ^ 0xB0);
        hn.cfr_renamed_0[5] = 0x5A ^ 0x43;
        hn.cfr_renamed_0[6] = "  ".length();
        hn.cfr_renamed_0[7] = 0x56 ^ 0x58 ^ (0xAB ^ 0x8E);
        hn.cfr_renamed_0[8] = 155 + 116 - 160 + 70 ^ 149 + 37 - 49 + 39;
        hn.cfr_renamed_0[9] = 0x42 ^ 0x44;
        hn.cfr_renamed_0[10] = 0xD1 ^ 0x80 ^ (0x62 ^ 0x4B);
        hn.cfr_renamed_0[11] = 147 + 127 - 185 + 63 ^ 106 + 99 - 171 + 152;
        hn.cfr_renamed_0[12] = 0xD6 ^ 0xB2;
        hn.cfr_renamed_0[13] = "   ".length();
        hn.cfr_renamed_0[14] = 0x3A ^ 0xE;
        hn.cfr_renamed_0[15] = 0xF1 ^ 0xC7;
        hn.cfr_renamed_0[16] = 3 ^ 0x39;
        hn.cfr_renamed_0[17] = 0x96 ^ 0xAD;
        hn.cfr_renamed_0[18] = 0x8B ^ 0xB6;
        hn.cfr_renamed_0[19] = " ".length() ^ (0x55 ^ 0x68);
        hn.cfr_renamed_0[20] = 0x69 ^ 0x70 ^ (0x42 ^ 0x69);
        hn.cfr_renamed_0[21] = 0x15 ^ 0x1B ^ (0xFD ^ 0xC6);
        hn.cfr_renamed_0[22] = 0xE ^ 0x36;
        hn.cfr_renamed_0[23] = 0x2A ^ 0x18 ^ " ".length();
        hn.cfr_renamed_0[24] = 86 + 87 - 85 + 79 ^ 58 + 72 - 58 + 72;
        hn.cfr_renamed_0[25] = -(0x90 ^ 0xA2);
        hn.cfr_renamed_0[26] = 0xFFFFF9DB & 0xAEE4;
        hn.cfr_renamed_0[27] = -(0xFFFFFAFC & 0x7D17) & (0xFFFFFFFF & 0x797B);
        hn.cfr_renamed_0[28] = 0xFFFFBFE4 & 0x785B;
        hn.cfr_renamed_0[29] = -(0xFFFFF587 & 0x7E79) & (0xFFFFF7FB & 0x7ED4);
        hn.cfr_renamed_0[30] = (0x92 ^ 0x8A) + (17 + 40 - -79 + 93) - (14 + 97 - 21 + 89) + (58 + 107 - 104 + 105);
        hn.cfr_renamed_0[31] = -(0x87 ^ 0xB4);
        hn.cfr_renamed_0[32] = 0xFFFFBFF8 & 0x6767;
    }

    private void cfr_renamed_23() {
        this.cfr_renamed_1 = cfr_renamed_0[0];
        if ((AutoFarm.cfr_renamed_7 == cfr_renamed_0[1])) {
            return;
        }
        AutoFarm.this();
        if (hn.boolean_do(AutoFarm.var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
            fy fy2 = AutoFarm.fy_do("Mua Nông Phẩm");
            fy fy3 = AutoFarm.fy_do("Lái buôn hỗ trợ");
            if ((fy3 != null)) {
                TienIchGame.void_if(100L);
                cfr_renamed_2 = null;
                fy3.cfr_renamed_1();
                gW.boolean_do();
                if ((cfr_renamed_2 != null)) {
                    cfr_renamed_2.cfr_renamed_1();
                    if ((0x78 ^ 0x50 ^ (0x5A ^ 0x76)) < 0) {
                        return;
                    }
                } else {
                    fn.fn_do().cfr_renamed_0(cfr_renamed_0[2], cfr_renamed_0[3], cfr_renamed_0[3]);
                }
                if ((TienIchGame.cfr_renamed_8(10000L))) {
                    this.cfr_renamed_1 = cfr_renamed_0[3];
                }
            }
            AutoFarm.var_java_util_Vector_if.removeAllElements();
            if ((fy2 != null)) {
                TienIchGame.void_if(100L);
                fy2.cfr_renamed_1();
                if ((gW.boolean_do())) {
                    int n = cfr_renamed_0[3];
                    while ((n < AutoFarm.var_java_util_Vector_if.size())) {
                        ((fy)AutoFarm.var_java_util_Vector_if.elementAt(n)).cfr_renamed_1();
                        TienIchGame.cfr_renamed_8(5000L);
                        ++n;
                        if ((63 + 52 - 6 + 28 ^ 95 + 94 - 129 + 81) >= ((0x71 ^ 0x58 ^ (0xFC ^ 0x99)) & (54 + 59 - -61 + 25 ^ 20 + 37 - 5 + 87 ^ -" ".length()))) continue;
                        return;
                    }
                }
            }
        }
    }

        public final void void_do() {
        AutoController.cfr_renamed_1(this);
    }

    public final void void_do(String string) {
        if ((string.startsWith("Nông trại bạn đã được chăm sóc"))) {
            TienIchGame.void_int();
        }
    }

                static {
        hn.cfr_renamed_3();
        cfr_renamed_2 = null;
    }

        public final String toString() {
        return "Auto farm";
    }

            private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    }

