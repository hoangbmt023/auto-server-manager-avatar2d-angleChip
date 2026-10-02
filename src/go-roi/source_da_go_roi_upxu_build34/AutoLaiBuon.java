/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from gq
 */
public final class AutoLaiBuon
extends AutoFarm {
    private static final int[] cfr_renamed_1;
    private boolean cfr_renamed_15 = cfr_renamed_1[0];
    static gY cfr_renamed_3;

    private static int (long l, long l2 != null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

        private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    public final synchronized void void_for() {
        try {
            int n;
            if (AutoLaiBuon.cfr_renamed_3((System.currentTimeMillis() - this.var_int_int, 320000L != null))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.void_if(16000L);
                return;
            }
            if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat == null)) {
                return;
            }
            if ((ef_0.soLuong != cfr_renamed_1[4])) {
                if ((ef_0.soLuong != cfr_renamed_1[5])) {
                    long l;
                    if ((GameCanvas.var_dL_do instanceof fw == null) && AutoLaiBuon.cfr_renamed_5((l = System.currentTimeMillis() - this.cfr_renamed_2, 2000L != null))) {
                        TienIchGame.hienThongBao(2000L - l);
                    }
                    if ((TienIchGame.cfr_renamed_3(cfr_renamed_1[5]) ? 1 : 0 == null)) {
                        TienIchGame.hienThongBao(2000L);
                    }
                    return;
                }
                if (AutoLaiBuon.boolean_do(AutoFarm.var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                    AutoFarm.var_java_util_Vector_if.removeAllElements();
                }
                AutoFarm.cfr_renamed_5();
                AutoFarm.cfr_renamed_0(cfr_renamed_1[0]);
                super.cfr_renamed_1(cfr_renamed_1[0]);
                super.cfr_renamed_17();
                this.cfr_renamed_19();
                if (!(bF.var_java_util_Vector_int != null) || (bF.soLuong != AngelChip.duLieuNguoiChoi.var_short_char)) {
                    GameCanvas.cfr_renamed_5();
                    bF.bF_do().cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_char, cfr_renamed_1[0]);
                    if ((9 ^ 0x70 ^ (0xBB ^ 0xC6)) < 0) {
                        return;
                    }
                } else {
                    bF.bF_do().cfr_renamed_0(bF.soLuong, bF.var_java_util_Vector_int, bF.var_java_util_Vector_if, bF.var_byte_if, bF.var_byte_do, bF.var_short_do, bF.var_int_char);
                }
                if ((GameCanvas.var_bt_0_do == null)) {
                    GameCanvas.cfr_renamed_4(MenuChinhAvatar.n);
                }
                if ((TienIchGame.cfr_renamed_1(cfr_renamed_1[4]) ? 1 : 0 == null)) {
                    TienIchGame.hienThongBao(1000L);
                }
                return;
            }
            GameCanvas.cfr_renamed_8();
            TienIchGame.hienThongBao("Hãy chờ đến khi farm xong");
            AutoFarm.cfr_renamed_4();
            if ((this.cfr_renamed_15 ? 1 : 0 == null)) {
                el_0.el_0_do().cfr_renamed_1(cfr_renamed_1[2], cfr_renamed_1[3], cfr_renamed_1[3]);
                TienIchGame.cfr_renamed_4(10000L);
                new dH(cfr_renamed_1[6], cfr_renamed_1[7], cfr_renamed_1[0]).void_do();
                TienIchGame.cfr_renamed_4(5000L);
                new dH(cfr_renamed_1[3], cfr_renamed_1[7], cfr_renamed_1[0]).void_do();
                TienIchGame.cfr_renamed_4(5000L);
                new dH(cfr_renamed_1[0], cfr_renamed_1[7], cfr_renamed_1[0]).void_do();
                TienIchGame.cfr_renamed_4(5000L);
                }
            AutoFarm.var_int_else = cfr_renamed_1[3];
            int n2 = cfr_renamed_1[3];
            int[] nArray = new int[bF.var_java_util_Vector_int.size()];
            int n3 = cfr_renamed_1[3];
            while (AutoLaiBuon.boolean_do(n3, bF.var_java_util_Vector_int.size())) {
                dq_0 dq_02 = (dq_0)bF.var_java_util_Vector_int.elementAt(n3);
                nArray[n3] = dq_02.cfr_renamed_8;
                if (!(dq_02.cfr_renamed_8 != cfr_renamed_1[1]) || (dq_02.soLuong >= cfr_renamed_1[8])) {
                    ++n2;
                    if ((dq_02.soLuong == cfr_renamed_1[8])) {
                        dh_0.dh_0_do().cfr_renamed_3(bF.soLuong, n3);
                        AutoFarm.var_int_else += cfr_renamed_1[0];
                    }
                }
                ++n3;
                if (((0xC8 ^ 0x83 ^ (0x4C ^ 0x21)) & (0x14 ^ 0x2B ^ (0x45 ^ 0x5C) ^ -" ".length())) < (0x58 ^ 0x2D ^ (0xCB ^ 0xBA))) continue;
                return;
            }
            if ((n2 > 0)) {
                if ((AutoFarm.var_int_else > 0) && (TienIchGame.cfr_renamed_8(10000L) ? 1 : 0 == null)) {
                    AutoFarm.this();
                }
                int[] nArray2 = AutoFarm.int_arr_do();
                int n4 = cfr_renamed_1[3];
                n2 = cfr_renamed_1[3];
                while (AutoLaiBuon.boolean_do(n2, bF.var_java_util_Vector_int.size())) {
                    dq_0 dq_03 = (dq_0)bF.var_java_util_Vector_int.elementAt(n2);
                    n = AutoFarm.cfr_renamed_0(nArray[n2], nArray2);
                    if ((!AutoLaiBuon.boolean_do(dq_03.soLuong, cfr_renamed_1[9]) || (dq_03.cfr_renamed_8 == cfr_renamed_1[1])) && (n != cfr_renamed_1[1])) {
                        if ((dq_03.var_byte_int == cfr_renamed_1[6])) {
                            dq_03.var_byte_new = (byte)cfr_renamed_1[10];
                            } else {
                            dq_03.var_byte_new = (byte)cfr_renamed_1[11];
                        }
                        ef_0.var_short_arr_do[dq_03.var_int_new * ef_0.var_short_if + dq_03.cfr_renamed_2] = dq_03.var_byte_new;
                        if ((dq_03.cfr_renamed_8 != cfr_renamed_1[1])) {
                            dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n2, cfr_renamed_1[1]);
                        }
                        dq_03.cfr_renamed_8 = cfr_renamed_1[1];
                        dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, n2, n);
                        ++n4;
                    }
                    ++n2;
                    if (-"  ".length() <= 0) continue;
                    return;
                }
                if ((n4 > 0) && (TienIchGame.cfr_renamed_8(5000L) ? 1 : 0 == null)) {
                    TienIchGame.hienThongBao(1000L);
                }
            }
            n3 = cfr_renamed_1[3];
            int n5 = cfr_renamed_1[3];
            while (AutoLaiBuon.boolean_do(n5, bF.var_java_util_Vector_int.size())) {
                dq_0 dq_04 = (dq_0)bF.var_java_util_Vector_int.elementAt(n5);
                if ((dq_04.cfr_renamed_8 != cfr_renamed_1[1]) && AutoLaiBuon.boolean_do(dq_04.soLuong, cfr_renamed_1[8])) {
                    dh_0.dh_0_do().cfr_renamed_1(bF.soLuong, n5, cfr_renamed_1[12]);
                    if (!AutoLaiBuon.boolean_do(TienIchGame.cfr_renamed_4(15000L) ? 1 : 0)) break;
                    if ((n3 >= cfr_renamed_1[13])) {
                        TienIchGame.hienThongBao("Lỗi lái buôn hỗ trợ!");
                        if ((0xC5 ^ 0xC1) >= (0xA9 ^ 0xAD)) break;
                        return;
                    }
                    ++n3;
                }
                ++n5;
                if ("   ".length() != 0) continue;
                return;
            }
            AutoFarm.cfr_renamed_6();
            Vector<ha> vector = new Vector<ha>();
            int n6 = cfr_renamed_1[3];
            int n7 = cfr_renamed_1[3];
            n = cfr_renamed_1[3];
            int n8 = cfr_renamed_1[3];
            n3 = cfr_renamed_1[3];
            int n9 = cfr_renamed_1[3];
            int n10 = cfr_renamed_1[3];
            int n11 = cfr_renamed_1[3];
            int n12 = cfr_renamed_1[3];
            int n13 = cfr_renamed_1[3];
            int n14 = cfr_renamed_1[3];
            while (AutoLaiBuon.boolean_do(n14, bF.var_java_util_Vector_if.size())) {
                ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n14);
                if (!((ha2.cfr_renamed_18 != cfr_renamed_1[14]) && (ha2.cfr_renamed_18 != cfr_renamed_1[15]) && (ha2.cfr_renamed_18 != cfr_renamed_1[16]) && (ha2.cfr_renamed_18 != cfr_renamed_1[17]) && !(ha2.cfr_renamed_18 == cfr_renamed_1[18]) || !AutoLaiBuon.cfr_renamed_5(ha2.this, ak_0.fc_0_do((int)ha2.cfr_renamed_18).soLuong * cfr_renamed_1[19]))) {
                    vector.addElement(ha2);
                    if ((ha2.cfr_renamed_18 == cfr_renamed_1[14])) {
                        ++n6;
                        if ("  ".length() == 0) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == cfr_renamed_1[15])) {
                        ++n7;
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == cfr_renamed_1[16])) {
                        ++n9;
                        if (" ".length() < 0) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == cfr_renamed_1[17])) {
                        ++n3;
                        if ("   ".length() <= 0) {
                            return;
                        }
                    } else if ((ha2.cfr_renamed_18 == cfr_renamed_1[18])) {
                        ++n13;
                    }
                }
                ++n14;
                if ("   ".length() == "   ".length()) continue;
                return;
            }
            if ((AngelChip.duLieuNguoiChoi.var_short_char == bF.soLuong)) {
                ha ha3;
                n14 = cfr_renamed_1[3];
                int n15 = cfr_renamed_1[3];
                int n16 = cfr_renamed_1[3];
                while (AutoLaiBuon.boolean_do(n16, bF.var_java_util_Vector_if.size())) {
                    ha3 = (ha)bF.var_java_util_Vector_if.elementAt(n16);
                    if (!(ha3.cfr_renamed_18 != cfr_renamed_1[20]) || !(ha3.cfr_renamed_18 != cfr_renamed_1[21]) || !(ha3.cfr_renamed_18 != cfr_renamed_1[22]) || (ha3.cfr_renamed_18 == cfr_renamed_1[18])) {
                        ++n14;
                        if ("   ".length() >= (0x3D ^ 0x20 ^ (0x54 ^ 0x4D))) {
                            return;
                        }
                    } else if (!(ha3.cfr_renamed_18 != cfr_renamed_1[14]) || !(ha3.cfr_renamed_18 != cfr_renamed_1[16]) || (ha3.cfr_renamed_18 == cfr_renamed_1[19])) {
                        n14 += 2;
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    } else if (!(ha3.cfr_renamed_18 != cfr_renamed_1[23]) || (ha3.cfr_renamed_18 == cfr_renamed_1[24])) {
                        n14 += 3;
                        if (-" ".length() >= ((0xB5 ^ 0x9B ^ (0xDA ^ 0xB4)) & (0x4B ^ 0x32 ^ (0x1A ^ 0x23) ^ -" ".length()))) {
                            return;
                        }
                    } else if (!(ha3.cfr_renamed_18 != cfr_renamed_1[15]) || (ha3.cfr_renamed_18 == cfr_renamed_1[17])) {
                        ++n15;
                    }
                    if (!(!(ha3.cfr_renamed_19 > 0) || (ha3.cfr_renamed_18 != cfr_renamed_1[20]) && (ha3.cfr_renamed_18 != cfr_renamed_1[23]) && (ha3.cfr_renamed_18 != cfr_renamed_1[24]) && (ha3.cfr_renamed_18 != cfr_renamed_1[22]) && !(ha3.cfr_renamed_18 == cfr_renamed_1[19]))) {
                        ha3.cfr_renamed_19 = cfr_renamed_1[3];
                        int n17 = cfr_renamed_1[3];
                        if ((this.cfr_renamed_0 != null)) {
                            if ((this.cfr_renamed_0 instanceof AutoKimCuong == null)) {
                                n17 = AutoKimCuong.var_int_if;
                                if (" ".length() == 0) {
                                    return;
                                }
                            } else if ((this.cfr_renamed_0 instanceof dn_0 == null)) {
                                n17 = dn_0.soLuong;
                            }
                        }
                        if (!(ha3.cfr_renamed_18 != cfr_renamed_1[23]) || !(ha3.cfr_renamed_18 != cfr_renamed_1[24]) || (ha3.cfr_renamed_18 == cfr_renamed_1[19])) {
                            dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha3.cfr_renamed_12);
                            bF.void_int(cfr_renamed_1[25]);
                            if ((ha3.cfr_renamed_18 == cfr_renamed_1[23]) && AutoLaiBuon.boolean_do(cfr_renamed_1[26] - ha3.this, n17 + cfr_renamed_1[27])) {
                                vector.addElement(ha3);
                                ++n10;
                                if ("  ".length() > (0xAB ^ 0xA1 ^ (0xB8 ^ 0xB6))) {
                                    return;
                                }
                            } else if ((ha3.cfr_renamed_18 == cfr_renamed_1[24]) && AutoLaiBuon.boolean_do(cfr_renamed_1[28] - ha3.this, n17 + cfr_renamed_1[29])) {
                                vector.addElement(ha3);
                                ++n11;
                                if (-(0xAF ^ 0x88 ^ (0x4D ^ 0x6E)) > 0) {
                                    return;
                                }
                            } else if ((ha3.cfr_renamed_18 == cfr_renamed_1[19]) && AutoLaiBuon.boolean_do(cfr_renamed_1[28] - ha3.this, n17 + cfr_renamed_1[30])) {
                                vector.addElement(ha3);
                                ++n12;
                            }
                        }
                        if (!(ha3.cfr_renamed_18 != cfr_renamed_1[20]) || (ha3.cfr_renamed_18 == cfr_renamed_1[22])) {
                            dh_0.dh_0_do().cfr_renamed_8(bF.soLuong, ha3.cfr_renamed_12);
                            bF.void_int(cfr_renamed_1[31]);
                            if (AutoLaiBuon.boolean_do(cfr_renamed_1[32] - ha3.this, n17 + cfr_renamed_1[27])) {
                                vector.addElement(ha3);
                                if ((ha3.cfr_renamed_18 == cfr_renamed_1[20])) {
                                    ++n;
                                }
                                if ((ha3.cfr_renamed_18 == cfr_renamed_1[22])) {
                                    ++n8;
                                }
                            }
                        }
                    }
                    ++n16;
                    if ("   ".length() >= "   ".length()) continue;
                    return;
                }
                AutoFarm.cfr_renamed_15();
                if ((bF.var_by_do.var_short_new > 0)) {
                    el_0.el_0_do().void_do();
                    TienIchGame.boolean_if(5000L);
                    }
                if ((this.cfr_renamed_0 != null)) {
                    if ((this.cfr_renamed_0 instanceof AutoKimCuong == null)) {
                        AutoFarm.cfr_renamed_18();
                        if (((0x26 ^ 0xE) & ~(0x47 ^ 0x6F)) != 0) {
                            return;
                        }
                    } else if ((this.cfr_renamed_0 instanceof dn_0 == null)) {
                        AutoFarm.cfr_renamed_8();
                    }
                }
                if (AutoLaiBuon.boolean_do(vector.isEmpty() ? 1 : 0)) {
                    n16 = cfr_renamed_1[3];
                    while (AutoLaiBuon.boolean_do(n16, vector.size())) {
                        ha3 = (ha)vector.elementAt(n16);
                        dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, (byte)ha3.cfr_renamed_12);
                        if ((TienIchGame.boolean_do(15000L) ? 1 : 0 == null)) {
                            AutoFarm.cfr_renamed_0(ha3, "Bye bye T.T");
                            TienIchGame.hienThongBao(500L);
                        }
                        ++n16;
                        return;
                    }
                }
                AutoFarm.cfr_renamed_12();
                super.cfr_renamed_10();
                if (AutoLaiBuon.boolean_do(n14, this.var_int_case)) {
                    n16 = this.var_int_case - n14;
                    switch (AutoFarm.var_byte_do) {
                        case 0: {
                            n += n16;
                            if (-" ".length() < (14 + 115 - 81 + 81 ^ 30 + 38 - 58 + 123)) break;
                            return;
                        }
                        case 1: {
                            n8 += n16;
                            if ("   ".length() >= 0) break;
                            return;
                        }
                        case 2: {
                            if (!(n16 >= cfr_renamed_1[6])) break;
                            n6 += n16 / cfr_renamed_1[6];
                        }
                    }
                }
                if (AutoLaiBuon.boolean_do(n15, this.var_int_int)) {
                    n16 = this.var_int_int - n15;
                    if (AutoLaiBuon.boolean_do(AutoFarm.var_byte_for)) {
                        n7 += n16;
                        } else if ((AutoFarm.var_byte_for == cfr_renamed_1[0])) {
                        n3 += n16;
                    }
                }
                if (!((n6 <= 0) && (n7 <= 0) && (n <= 0) && (n8 <= 0) && (n3 <= 0) && (n9 <= 0) && (n10 <= 0) && (n11 <= 0) && (n12 <= 0) && !(n13 > 0))) {
                    TienIchGame.hienThongBao(1000L);
                    bF.bF_do().cfr_renamed_18();
                    TienIchGame.cfr_renamed_2(15000L);
                    if ((ef_0.soLuong == cfr_renamed_1[5])) {
                        if ((n6 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n6)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[14]);
                                ++n16;
                                if ("   ".length() >= ((0xF2 ^ 0xB5) & ~(0x85 ^ 0xC2))) continue;
                                return;
                            }
                        }
                        if ((n7 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n7)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[15]);
                                ++n16;
                                if ((0x11 ^ 0x33 ^ (0xB4 ^ 0x93)) > 0) continue;
                                return;
                            }
                        }
                        if ((n > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[20]);
                                ++n16;
                                return;
                            }
                        }
                        if ((n8 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n8)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[22]);
                                ++n16;
                                return;
                            }
                        }
                        if ((n3 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n3)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[17]);
                                ++n16;
                                if ((116 + 57 - 49 + 23 ^ 145 + 106 - 135 + 34) != 0) continue;
                                return;
                            }
                        }
                        if ((n9 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n9)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[16]);
                                ++n16;
                                if ((0x1E ^ 0x1A) == (0x3E ^ 0x3A)) continue;
                                return;
                            }
                        }
                        if ((n10 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n10)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[23]);
                                ++n16;
                                if ("   ".length() >= 0) continue;
                                return;
                            }
                        }
                        if ((n11 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n11)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[24]);
                                ++n16;
                                if ("   ".length() != 0) continue;
                                return;
                            }
                        }
                        if ((n12 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n12)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[19]);
                                ++n16;
                                if ((0x86 ^ 0x93 ^ (0xB ^ 0x1A)) >= -" ".length()) continue;
                                return;
                            }
                        }
                        if ((n13 > 0)) {
                            n16 = cfr_renamed_1[3];
                            while (AutoLaiBuon.boolean_do(n16, n13)) {
                                AutoLaiBuon.void_do(cfr_renamed_1[18]);
                                ++n16;
                                if ("   ".length() != 0) continue;
                                return;
                            }
                        }
                    }
                }
                if ((AngelChip.duLieuNguoiChoi.var_short_byte != cfr_renamed_1[1]) && (!AutoLaiBuon.boolean_do(AutoChamEmBe.var_boolean_new ? 1 : 0) || !AutoLaiBuon.boolean_do(AutoChamEmBe.coKichHoat ? 1 : 0) || (AutoChamEmBe.coTrangThai ? 1 : 0 == null))) {
                    TienIchGame.hienThongBao(1000L);
                    AutoController.batAuto(new AutoChamEmBe(), this.cfr_renamed_0);
                    return;
                }
            }
            }
        catch (Exception exception) {
            }
        if ("  ".length() == 0) {
            return;
        }
        if (AutoLaiBuon.boolean_do(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            return;
        }
        if ((this.cfr_renamed_0 != null)) {
            TienIchGame.hienThongBao(1000L);
            AutoController.cfr_renamed_2();
            return;
        }
        AutoController.tatAuto();
        GameCanvas.hienThongBaoPopup("Đã chăm sóc xong!");
        TienIchGame.hienThongBao("Đã xong việc");
    }

    public final void void_do(String string) {
        if ((string.startsWith("Nông trại bạn đã được chăm sóc") ? 1 : 0 == null)) {
            TienIchGame.cfr_renamed_11();
        }
    }

    private void cfr_renamed_19() {
        this.cfr_renamed_15 = cfr_renamed_1[0];
        if ((AutoFarm.var_int_new == cfr_renamed_1[1])) {
            return;
        }
        AutoFarm.cfr_renamed_2();
        if (AutoLaiBuon.boolean_do(AutoFarm.var_java_util_Vector_do.isEmpty() ? 1 : 0)) {
            ew_0 ew_02 = AutoFarm.ew_0_do("Mua Nông Phẩm");
            ew_0 ew_03 = AutoFarm.ew_0_do("Lái buôn hỗ trợ");
            if ((ew_03 != null)) {
                TienIchGame.hienThongBao(100L);
                cfr_renamed_3 = null;
                ew_03.cfr_renamed_0();
                gf_0.boolean_do();
                if ((cfr_renamed_3 != null)) {
                    cfr_renamed_3.cfr_renamed_0();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                } else {
                    el_0.el_0_do().cfr_renamed_1(cfr_renamed_1[2], cfr_renamed_1[3], cfr_renamed_1[3]);
                }
                if ((TienIchGame.cfr_renamed_4(10000L) ? 1 : 0 == null)) {
                    this.cfr_renamed_15 = cfr_renamed_1[3];
                }
            }
            AutoFarm.var_java_util_Vector_do.removeAllElements();
            if ((ew_02 != null)) {
                TienIchGame.hienThongBao(100L);
                ew_02.cfr_renamed_0();
                if ((gf_0.boolean_do() ? 1 : 0 == null)) {
                    int n = cfr_renamed_1[3];
                    while (AutoLaiBuon.boolean_do(n, AutoFarm.var_java_util_Vector_do.size())) {
                        ((ew_0)AutoFarm.var_java_util_Vector_do.elementAt(n)).cfr_renamed_0();
                        TienIchGame.cfr_renamed_4(5000L);
                        ++n;
                        if ((0xBA ^ 0xBE) != "   ".length()) continue;
                        return;
                    }
                }
            }
        }
    }

    private static void cfr_renamed_20() {
        cfr_renamed_1 = new int[33];
        AutoLaiBuon.cfr_renamed_1[0] = " ".length();
        AutoLaiBuon.cfr_renamed_1[1] = -" ".length();
        AutoLaiBuon.cfr_renamed_1[2] = 141 + 139 - 134 + 8 ^ 65 + 61 - 101 + 104;
        AutoLaiBuon.cfr_renamed_1[3] = (0x2B ^ 0x7A ^ (0xD2 ^ 0xA6)) & (0x30 ^ 0x71 ^ (0x15 ^ 0x71) ^ -" ".length());
        AutoLaiBuon.cfr_renamed_1[4] = 0xB2 ^ 0xAA;
        AutoLaiBuon.cfr_renamed_1[5] = 0x62 ^ 0x7B;
        AutoLaiBuon.cfr_renamed_1[6] = "  ".length();
        AutoLaiBuon.cfr_renamed_1[7] = 0x7E ^ 0x55;
        AutoLaiBuon.cfr_renamed_1[8] = 0x4B ^ 0x7A ^ (0x83 ^ 0xB7);
        AutoLaiBuon.cfr_renamed_1[9] = 0x18 ^ 0x1E;
        AutoLaiBuon.cfr_renamed_1[10] = 0x3E ^ 0x46;
        AutoLaiBuon.cfr_renamed_1[11] = 0x82 ^ 0xA0;
        AutoLaiBuon.cfr_renamed_1[12] = 0x4D ^ 0x29;
        AutoLaiBuon.cfr_renamed_1[13] = "   ".length();
        AutoLaiBuon.cfr_renamed_1[14] = 0xF5 ^ 0x81 ^ (0x18 ^ 0x58);
        AutoLaiBuon.cfr_renamed_1[15] = 0xE4 ^ 0xBF ^ (0xD7 ^ 0xBA);
        AutoLaiBuon.cfr_renamed_1[16] = 0x26 ^ 0x1C;
        AutoLaiBuon.cfr_renamed_1[17] = 0x4D ^ 0x64 ^ (0xA3 ^ 0xB1);
        AutoLaiBuon.cfr_renamed_1[18] = 0x6B ^ 0x56;
        AutoLaiBuon.cfr_renamed_1[19] = 0x89 ^ 0xB5;
        AutoLaiBuon.cfr_renamed_1[20] = 0x40 ^ 0x70 ^ "  ".length();
        AutoLaiBuon.cfr_renamed_1[21] = 0xBB ^ 0x8E;
        AutoLaiBuon.cfr_renamed_1[22] = 78 + 44 - 118 + 158 ^ 49 + 130 - 105 + 80;
        AutoLaiBuon.cfr_renamed_1[23] = (0x91 ^ 0xB4) & ~(0x8B ^ 0xAE) ^ (0xA ^ 0x39);
        AutoLaiBuon.cfr_renamed_1[24] = 0x57 ^ 0x1B ^ (0xBF ^ 0xC4);
        AutoLaiBuon.cfr_renamed_1[25] = -(0x72 ^ 0x40);
        AutoLaiBuon.cfr_renamed_1[26] = -(0xFFFFF1FE & 0x1F3F) & (0xFFFFBBFD & 0xFDFF);
        AutoLaiBuon.cfr_renamed_1[27] = 0xFFFFE16C & 0x1FFB;
        AutoLaiBuon.cfr_renamed_1[28] = 0xFFFFFC5D & 0x3BE2;
        AutoLaiBuon.cfr_renamed_1[29] = -(0xFFFFF77D & 0x39AF) & (0xFFFFB3FE & 0x7FFD);
        AutoLaiBuon.cfr_renamed_1[30] = (0xEC ^ 0xB2) + (185 + 114 - 181 + 83) - (0x7A ^ 0xC) + (0x8A ^ 0xB5);
        AutoLaiBuon.cfr_renamed_1[31] = -(0x92 ^ 0xA1);
        AutoLaiBuon.cfr_renamed_1[32] = 0xFFFFBF7B & 0x67E4;
    }

                public final void void_do() {
        AutoController.cfr_renamed_0(this);
    }

                    public final String toString() {
        return "Auto farm";
    }

    static {
        AutoLaiBuon.cfr_renamed_20();
        cfr_renamed_3 = null;
    }

        public final boolean boolean_do(String string) {
        if (!AutoLaiBuon.boolean_do(string.startsWith("Bạn đã mua") ? 1 : 0) || (string.startsWith("Chế độ chăm sóc nông trại nhanh đã được lái buôn kích hoạt") ? 1 : 0 == null)) {
            TienIchGame.cfr_renamed_11();
            return cfr_renamed_1[0];
        }
        return super.boolean_do(string);
    }

    }

