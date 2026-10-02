/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from eS
 */
public final class es_0 {
    private fs[] var_fs_arr_for;
    private fs var_fs_do;
    boolean dangChayAuto;
    public byte var_byte_do;
    fs[] var_fs_arr_do;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    boolean coTrangThai;
    private int cfr_renamed_6;
    int soLuong;
    private int cfr_renamed_7 = es_0.var_int_arr_if[4];
    private fs[] var_fs_arr_int;
    boolean coKichHoat;
    private fs var_fs_if;
    private int cfr_renamed_8;
    private boolean var_boolean_int;
    private fs var_fs_for;
    int var_int_if;
    private int cfr_renamed_13;
    private int cfr_renamed_9;
    fs[] var_fs_arr_if;
    int soLuongKhoa;
    private int cfr_renamed_14;
    private static int[] var_int_arr_if;
    public static int[] mangSoNguyen;
    int var_int_int;
    private static int this;
    public DuLieuNguoiChoi duLieuNguoiChoi;

            private static boolean boolean_do(int n) {
        return n >= 0;
    }

                /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_1() {
        block78: {
            block76: {
                block77: {
                    block69: {
                        block75: {
                            block70: {
                                block73: {
                                    block71: {
                                        block74: {
                                            block72: {
                                                if ((this.duLieuNguoiChoi == null)) {
                                                    return;
                                                }
                                                this.cfr_renamed_4 += es_0.var_int_arr_if[4];
                                                if ((this.cfr_renamed_4 >= es_0.var_int_arr_if[19])) {
                                                    this.cfr_renamed_4 = es_0.var_int_arr_if[2];
                                                }
                                                var1_1 = this;
                                                if (!(var1_1.cfr_renamed_14 != 0)) break block69;
                                                if (!(var1_1.soLuong == es_0.var_int_arr_if[4])) break block70;
                                                var2_3 = es_0.var_int_arr_if[4];
                                                if ("  ".length() >= 0) ** GOTO lbl16
                                                return;
lbl-1000:
                                                // 1 sources

                                                {
                                                    var1_1.var_fs_arr_if[var2_3].var_int_if += es_0.var_int_arr_if[19];
                                                    ++var2_3;
lbl16:
                                                    // 2 sources

                                                    ** while (!es_0.cfr_renamed_2((int)var2_3, (int)(var1_1.var_byte_do - es_0.var_int_arr_if[1])))
                                                }
lbl17:
                                                // 1 sources

                                                var2_4 = var1_1;
                                                if (!es_0.cfr_renamed_2((int)var2_4.var_boolean_int) || !(var2_4.var_int_if > 0)) break block71;
                                                var2_4.cfr_renamed_6 += es_0.var_int_arr_if[4];
                                                if (!(var2_4.cfr_renamed_6 < es_0.var_int_arr_if[1])) break block72;
                                                var3_10 = es_0.var_int_arr_if[4];
                                                if (-"  ".length() < 0) ** GOTO lbl28
                                                return;
lbl-1000:
                                                // 1 sources

                                                {
                                                    var2_4.var_fs_arr_if[var3_10].soLuong -= es_0.var_int_arr_if[19];
                                                    ++var3_10;
lbl28:
                                                    // 2 sources

                                                    ** while (!es_0.cfr_renamed_2((int)var3_10, (int)var2_4.var_byte_do))
                                                }
lbl29:
                                                // 1 sources

                                                if ((179 ^ 182) == 0) {
                                                    return;
                                                }
                                                break block73;
                                            }
                                            if (!(var2_4.cfr_renamed_6 > es_0.var_int_arr_if[11]) || !(var2_4.cfr_renamed_6 < es_0.var_int_arr_if[20])) break block74;
                                            var3_10 = es_0.var_int_arr_if[4];
                                            if (((8 + 105 - -17 + 17 ^ 57 + 72 - -14 + 5) & (65 ^ 40 ^ (25 ^ 119) ^ -" ".length())) != " ".length()) ** GOTO lbl43
                                            return;
lbl-1000:
                                            // 1 sources

                                            {
                                                var2_4.var_fs_arr_if[var3_10].soLuong += es_0.var_int_arr_if[19];
                                                ++var3_10;
lbl43:
                                                // 2 sources

                                                ** while (!es_0.cfr_renamed_2((int)var3_10, (int)var2_4.var_byte_do))
                                            }
lbl44:
                                            // 1 sources

                                            if (" ".length() == 0) {
                                                return;
                                            }
                                            break block73;
                                        }
                                        if (!(var2_4.cfr_renamed_6 > es_0.var_int_arr_if[16])) break block73;
                                        var2_4.cfr_renamed_8 -= es_0.var_int_arr_if[4];
                                        if (!(var2_4.cfr_renamed_8 < 0)) break block73;
                                        var2_4.cfr_renamed_6 = es_0.var_int_arr_if[2];
                                    }
                                    var2_4.cfr_renamed_8 = hg.int_new(es_0.var_int_arr_if[21]);
                                }
                                if ((var1_1.soLuongKhoa == es_0.this)) {
                                    var1_1.soLuongKhoa = es_0.var_int_arr_if[10];
                                }
                            }
                            var2_5 = es_0.var_int_arr_if[2];
                            var3_10 = var1_1.var_byte_do - es_0.var_int_arr_if[4];
                            var4_11 = es_0.var_int_arr_if[4];
                            if (es_0.cfr_renamed_2((int)var1_1.coTrangThai)) {
                                var4_11 = es_0.var_int_arr_if[2];
                            }
                            var5_13 = es_0.var_int_arr_if[4];
                            if ("  ".length() < "   ".length()) ** GOTO lbl80
                            return;
lbl-1000:
                            // 1 sources

                            {
                                var6_14 = hg.cfr_renamed_1(var1_1.var_fs_arr_if[var5_13].soLuong, var1_1.var_fs_arr_if[var5_13].var_int_if, var1_1.var_fs_arr_if[var5_13 - es_0.var_int_arr_if[4]].soLuong, var1_1.var_fs_arr_if[var5_13 - es_0.var_int_arr_if[4]].var_int_if);
                                if ((var6_14 > var1_1.soLuongKhoa + es_0.var_int_arr_if[4])) {
                                    var2_5 = es_0.var_int_arr_if[4];
                                    var7_15 = var6_14 - var1_1.soLuongKhoa;
                                    var6_14 = hg.int_do(var1_1.var_fs_arr_if[var5_13 - es_0.var_int_arr_if[4]].soLuong - var1_1.var_fs_arr_if[var5_13].soLuong, -(var1_1.var_fs_arr_if[var5_13 - es_0.var_int_arr_if[4]].var_int_if - var1_1.var_fs_arr_if[var5_13].var_int_if));
                                    var8_16 = var7_15 * hg.int_int(hg.int_for(var6_14)) >> es_0.var_int_arr_if[0];
                                    var6_14 = -(var7_15 * hg.int_if(hg.int_for(var6_14))) >> es_0.var_int_arr_if[0];
                                    var1_1.var_fs_arr_if[var5_13].soLuong += var8_16;
                                    var1_1.var_fs_arr_if[var5_13].var_int_if += var6_14;
                                }
                                ++var5_13;
lbl80:
                                // 2 sources

                                ** while (!es_0.cfr_renamed_2((int)var5_13, (int)(var1_1.var_byte_do - var1_1.soLuong * var4_11)))
                            }
lbl81:
                            // 1 sources

                            if ((var1_1.var_fs_arr_if[var3_10].var_int_if < var1_1.duLieuNguoiChoi.cfr_renamed_3 + var1_1.duLieuNguoiChoi.var_byte_this + es_0.var_int_arr_if[17])) {
                                var1_1.var_fs_arr_if[var3_10].soLuong += es_0.var_int_arr_if[0];
                                var1_1.var_fs_arr_if[var3_10].var_int_if += var1_1.cfr_renamed_5;
                                var1_1.cfr_renamed_5 += es_0.var_int_arr_if[4];
                            }
                            if (!es_0.cfr_renamed_5((int)var1_1.coTrangThai)) break block75;
                            var5_13 = var3_10 - es_0.var_int_arr_if[4];
                            if (" ".length() != -" ".length()) ** GOTO lbl100
                            return;
lbl-1000:
                            // 1 sources

                            {
                                var6_14 = hg.cfr_renamed_1(var1_1.var_fs_arr_if[var5_13].soLuong, var1_1.var_fs_arr_if[var5_13].var_int_if, var1_1.var_fs_arr_if[var5_13 + es_0.var_int_arr_if[4]].soLuong, var1_1.var_fs_arr_if[var5_13 + es_0.var_int_arr_if[4]].var_int_if);
                                if ((var6_14 > var1_1.soLuongKhoa + es_0.var_int_arr_if[4])) {
                                    var2_5 = es_0.var_int_arr_if[4];
                                    var7_15 = hg.int_do(var1_1.var_fs_arr_if[var5_13 + es_0.var_int_arr_if[4]].soLuong - var1_1.var_fs_arr_if[var5_13].soLuong, -(var1_1.var_fs_arr_if[var5_13 + es_0.var_int_arr_if[4]].var_int_if - var1_1.var_fs_arr_if[var5_13].var_int_if));
                                    var8_16 = (var6_14 -= var1_1.soLuongKhoa) * hg.int_int(hg.int_for(var7_15)) >> es_0.var_int_arr_if[0];
                                    var6_14 = -(var6_14 * hg.int_if(hg.int_for(var7_15))) >> es_0.var_int_arr_if[0];
                                    var1_1.var_fs_arr_if[var5_13].soLuong += var8_16;
                                    var1_1.var_fs_arr_if[var5_13].var_int_if += var6_14;
                                }
                                --var5_13;
lbl100:
                                // 2 sources

                                ** while (!es_0.cfr_renamed_0((int)var5_13))
                            }
                        }
                        if ((var2_5 == 0)) {
                            var1_1.soLuong = es_0.var_int_arr_if[4];
                        }
                    }
                    var1_1 = this;
                    if ((var1_1.var_int_int != es_0.var_int_arr_if[8])) {
                        var1_1.var_int_int += es_0.var_int_arr_if[4];
                        if ((GameCanvas.var_int_goto % es_0.var_int_arr_if[11] == es_0.var_int_arr_if[1])) {
                            if ((var1_1.duLieuNguoiChoi.cfr_renamed_2 == es_0.var_int_arr_if[1])) {
                                var1_1.duLieuNguoiChoi.cfr_renamed_2 = (byte)es_0.var_int_arr_if[18];
                                if ((var1_1.var_int_int > es_0.var_int_arr_if[22])) {
                                    var1_1.cfr_renamed_2();
                                    var1_1.var_int_int = es_0.var_int_arr_if[8];
                                    if (-" ".length() > (149 ^ 145)) {
                                        return;
                                    }
                                }
                            } else {
                                var1_1.duLieuNguoiChoi.cfr_renamed_2 = (byte)es_0.var_int_arr_if[1];
                            }
                        }
                    }
                    var1_1 = this;
                    if (!es_0.cfr_renamed_2((int)var1_1.coKichHoat)) break block76;
                    if ((var1_1.soLuongKhoa > es_0.var_int_arr_if[11]) && (GameCanvas.var_int_goto % es_0.var_int_arr_if[19] == es_0.var_int_arr_if[15])) {
                        var1_1.soLuongKhoa -= es_0.var_int_arr_if[4];
                    }
                    if (es_0.cfr_renamed_5((int)var1_1.coTrangThai) && (GameCanvas.var_int_goto % es_0.var_int_arr_if[19] == es_0.var_int_arr_if[15]) && (var1_1.duLieuNguoiChoi != AngelChip.duLieuNguoiChoi)) {
                        if ((var1_1.duLieuNguoiChoi.cfr_renamed_2 == es_0.var_int_arr_if[1])) {
                            var1_1.void_do(es_0.var_int_arr_if[4]);
                            if (-"   ".length() > 0) {
                                return;
                            }
                        } else {
                            var1_1.void_do(es_0.var_int_arr_if[2]);
                        }
                    }
                    if (!es_0.cfr_renamed_2((int)var1_1.coTrangThai) || !(var1_1.soLuongKhoa <= es_0.var_int_arr_if[11])) break block76;
                    var1_1.soLuongKhoa = es_0.var_int_arr_if[1];
                    var2_5 = es_0.var_int_arr_if[2];
                    if (!es_0.cfr_renamed_5((int)var1_1.var_boolean_int)) break block77;
                    var3_10 = es_0.var_int_arr_if[2];
                    if (((96 ^ 69 ^ (34 ^ 19)) & (231 ^ 160 ^ (0 ^ 83) ^ -" ".length())) < "  ".length()) ** GOTO lbl155
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_13 = var1_1.var_fs_arr_if[var3_10 + es_0.var_int_arr_if[4]].soLuong;
                        var4_12 = var1_1.var_fs_arr_if[var3_10];
                        if ((hg.int_do(var5_13 - var4_12.soLuong) <= es_0.var_int_arr_if[4])) {
                            v0 = es_0.var_int_arr_if[4];
                            if (-"  ".length() > 0) {
                                return;
                            }
                        } else {
                            v0 = es_0.var_int_arr_if[2];
                        }
                        if ((v0 == 0)) {
                            ++var2_5;
                        }
                        ++var3_10;
lbl155:
                        // 2 sources

                        ** while (!es_0.cfr_renamed_2((int)var3_10, (int)(var1_1.var_byte_do - es_0.var_int_arr_if[4])))
                    }
                }
                if ((var2_5 == 0) && es_0.cfr_renamed_5((int)var1_1.var_boolean_int)) {
                    var1_1.var_fs_if.cfr_renamed_2 = es_0.var_int_arr_if[23];
                    var1_1.var_boolean_int = es_0.var_int_arr_if[4];
                }
            }
            if (es_0.cfr_renamed_2((int)this.dangChayAuto)) {
                var2_6 = var1_1 = this;
                if (!(var1_1.duLieuNguoiChoi.cfr_renamed_2 != es_0.var_int_arr_if[1]) || (var2_6.duLieuNguoiChoi.cfr_renamed_2 == es_0.var_int_arr_if[18])) {
                    v1 = es_0.var_int_arr_if[4];
                    if (-" ".length() == "   ".length()) {
                        return;
                    }
                } else {
                    v1 = es_0.var_int_arr_if[2];
                }
                if ((v1 != 0)) {
                    var1_1.cfr_renamed_1(var1_1.duLieuNguoiChoi);
                    var1_1.dangChayAuto = es_0.var_int_arr_if[2];
                }
            }
            if (!(this.soLuong != 0)) break block78;
            var1_1 = this;
            var2_7 = es_0.var_int_arr_if[2];
            if (null == null) ** GOTO lbl205
            return;
lbl-1000:
            // 1 sources

            {
                if (!(var1_1.var_fs_arr_int[var2_7].cfr_renamed_2 != 0) || (var1_1.var_fs_arr_int[var2_7].soLuong == es_0.var_int_arr_if[12])) {
                    var1_1.var_fs_arr_int[var2_7].soLuong = var1_1.var_fs_arr_do[var1_1.var_byte_do - es_0.var_int_arr_if[1]].soLuong;
                    var1_1.var_fs_arr_int[var2_7].var_int_if = var1_1.var_fs_arr_do[var1_1.var_byte_do - es_0.var_int_arr_if[1]].var_int_if;
                }
                if (es_0.cfr_renamed_2((int)var1_1.coKichHoat)) {
                    var1_1.var_fs_arr_int[var2_7].cfr_renamed_2 += es_0.var_int_arr_if[1];
                    if (((44 ^ 92 ^ (10 ^ 75)) & (69 + 171 - 110 + 59 ^ 125 + 68 - 94 + 41 ^ -" ".length())) > "   ".length()) {
                        return;
                    }
                } else {
                    var1_1.var_fs_arr_int[var2_7].cfr_renamed_2 += es_0.var_int_arr_if[4];
                }
                v2 = var1_1.var_fs_arr_int[var2_7].cfr_renamed_2;
                v3 = var1_1.cfr_renamed_13;
                if (es_0.cfr_renamed_2((int)var1_1.coKichHoat)) {
                    v4 = es_0.var_int_arr_if[0];
                    if ((105 + 27 - 112 + 132 ^ 35 + 105 - 28 + 45) <= 0) {
                        return;
                    }
                } else {
                    v4 = es_0.var_int_arr_if[2];
                }
                if ((v2 > v3 + v4)) {
                    var1_1.var_fs_arr_int[var2_7].cfr_renamed_2 = es_0.var_int_arr_if[2];
                }
                ++var2_7;
lbl205:
                // 2 sources

                ** while (!es_0.cfr_renamed_2((int)var2_7, (int)es_0.var_int_arr_if[1]))
            }
        }
        if (es_0.cfr_renamed_5((int)this.coTrangThai)) {
            var1_1 = this;
            if ((var1_1.soLuong == es_0.var_int_arr_if[4])) {
                if ((var1_1.var_fs_if.cfr_renamed_2 == es_0.var_int_arr_if[8])) {
                    var1_1.var_fs_for.soLuong = var1_1.var_fs_do.soLuong = var1_1.var_fs_arr_if[var1_1.var_byte_do - es_0.var_int_arr_if[4]].soLuong;
                    var1_1.var_fs_if.soLuong = var1_1.var_fs_do.soLuong;
                    var1_1.var_fs_for.var_int_if = var1_1.var_fs_do.var_int_if = var1_1.var_fs_arr_if[var1_1.var_byte_do - es_0.var_int_arr_if[4]].var_int_if;
                    var1_1.var_fs_if.var_int_if = var1_1.var_fs_do.var_int_if;
                    var1_1.var_fs_if.cfr_renamed_2 = es_0.var_int_arr_if[2];
                    var1_1.cfr_renamed_9 = es_0.var_int_arr_if[8];
                }
                var2_8 = var1_1.var_fs_do.soLuong - var1_1.var_fs_for.soLuong;
                var3_10 = var1_1.var_fs_do.var_int_if - var1_1.var_fs_for.var_int_if;
                if ((var1_1.cfr_renamed_9 > 0)) {
                    var1_1.cfr_renamed_9 -= es_0.var_int_arr_if[4];
                }
                if ((!(var1_1.cfr_renamed_9 > 0) || es_0.cfr_renamed_2((int)var1_1.coKichHoat)) && (GameCanvas.var_int_goto % es_0.var_int_arr_if[1] == es_0.var_int_arr_if[4])) {
                    if ((hg.int_do(var2_8) > 0)) {
                        if ((var2_8 > 0)) {
                            var1_1.var_fs_do.soLuong -= es_0.var_int_arr_if[4];
                            if (((237 ^ 179 ^ (158 ^ 130)) & (82 + 165 - 88 + 73 ^ 44 + 16 - -29 + 81 ^ -" ".length())) != 0) {
                                return;
                            }
                        } else {
                            var1_1.var_fs_do.soLuong += es_0.var_int_arr_if[4];
                        }
                        var1_1.var_fs_arr_if[var1_1.var_byte_do - es_0.var_int_arr_if[4]].soLuong = var1_1.var_fs_do.soLuong;
                    }
                    if ((hg.int_do(var3_10) > 0)) {
                        if ((var3_10 > 0)) {
                            var1_1.var_fs_do.var_int_if -= es_0.var_int_arr_if[4];
                            if ("  ".length() < "  ".length()) {
                                return;
                            }
                        } else {
                            var1_1.var_fs_do.var_int_if += es_0.var_int_arr_if[4];
                        }
                        var1_1.var_fs_arr_if[var1_1.var_byte_do - es_0.var_int_arr_if[4]].var_int_if = var1_1.var_fs_do.var_int_if;
                    }
                }
                if ((hg.int_do(var2_8) != null) && (hg.int_do(var3_10) != null)) {
                    var1_1.cfr_renamed_9 = es_0.var_int_arr_if[24] + hg.int_new(es_0.var_int_arr_if[25]);
                    var1_1.var_fs_for.soLuong = var1_1.var_fs_if.soLuong + es_0.var_int_arr_if[0] - hg.int_new(es_0.var_int_arr_if[21]);
                    var1_1.var_fs_for.var_int_if = var1_1.var_fs_if.var_int_if + hg.int_new(es_0.var_int_arr_if[19]);
                }
            }
        }
        if ((this.duLieuNguoiChoi.var_byte_new == 0)) {
            this.cfr_renamed_7 = es_0.var_int_arr_if[4];
            if ("   ".length() < 0) {
                return;
            }
        } else {
            this.cfr_renamed_7 = es_0.var_int_arr_if[8];
        }
        var1_2 = es_0.var_int_arr_if[2];
        if (-"   ".length() < 0) ** GOTO lbl264
        return;
lbl-1000:
        // 1 sources

        {
            var2_9 = this.var_fs_arr_if[var1_2].soLuong - this.duLieuNguoiChoi.cfr_renamed_2;
            if (!(var1_2 == this.var_byte_do - es_0.var_int_arr_if[1]) || es_0.cfr_renamed_5(hg.int_do(this.var_fs_arr_do[var1_2].soLuong - (this.duLieuNguoiChoi.cfr_renamed_2 + this.cfr_renamed_7 * var2_9)), es_0.var_int_arr_if[4])) {
                this.var_fs_arr_do[var1_2].soLuong = this.duLieuNguoiChoi.cfr_renamed_2 * dF.cfr_renamed_12 + this.cfr_renamed_7 * var2_9;
            }
            this.var_fs_arr_do[var1_2].var_int_if = this.var_fs_arr_if[var1_2].var_int_if;
            ++var1_2;
lbl264:
            // 2 sources

            ** while (!es_0.cfr_renamed_2((int)var1_2, (int)this.var_byte_do))
        }
lbl265:
        // 1 sources

    }

    public final void void_do(int n) {
        this.var_fs_arr_if[es_0.var_int_arr_if[2]].soLuong = this.var_fs_arr_for[n].soLuong;
        this.var_fs_arr_if[es_0.var_int_arr_if[2]].var_int_if = this.var_fs_arr_for[n].var_int_if;
        if ((n == var_int_arr_if[4])) {
            ((dd_0)this.duLieuNguoiChoi).cfr_renamed_2 = (byte)var_int_arr_if[18];
            return;
        }
        ((dd_0)this.duLieuNguoiChoi).cfr_renamed_2 = (byte)var_int_arr_if[1];
    }

    public final void cfr_renamed_0() {
        this.cfr_renamed_14 = var_int_arr_if[2];
        this.soLuong = var_int_arr_if[2];
        this.cfr_renamed_5 = -(var_int_arr_if[0] + hg.int_new(var_int_arr_if[11]));
        this.var_int_int = var_int_arr_if[8];
        this.coKichHoat = var_int_arr_if[2];
        this.coTrangThai = var_int_arr_if[2];
        this.var_boolean_int = var_int_arr_if[2];
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_2() {
        this.cfr_renamed_14 += var_int_arr_if[4];
        this.soLuongKhoa = this;
        int n = var_int_arr_if[2];
        while (!(n >= this.var_byte_do)) {
            this.var_fs_arr_if[n].soLuong = this.var_fs_arr_for[es_0.var_int_arr_if[4]].soLuong;
            this.var_fs_arr_if[n].var_int_if = this.var_fs_arr_for[es_0.var_int_arr_if[4]].var_int_if;
            ++n;
        }
    }

    static {
        es_0.cfr_renamed_3();
        this = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[1]];
        nArray[es_0.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[es_0.var_int_arr_if[4]] = var_int_arr_if[5];
        mangSoNguyen = nArray;
    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        block10: {
            block9: {
                if (!es_0.cfr_renamed_5((int)this.dangChayAuto) || (this.var_int_int != es_0.var_int_arr_if[8])) {
                    return;
                }
                if ((dF.cfr_renamed_12 > es_0.var_int_arr_if[4])) {
                    var1_1.translate(es_0.var_int_arr_if[2], this.duLieuNguoiChoi.cfr_renamed_3);
                }
                if (!(this.soLuong != 0) || !es_0.cfr_renamed_5((int)this.coTrangThai) || !(this.var_fs_arr_int[es_0.var_int_arr_if[2]].soLuong > 0) || !(this.var_fs_arr_int[es_0.var_int_arr_if[2]].soLuong > fm.fm_do().cfr_renamed_3) || !(this.var_fs_arr_int[es_0.var_int_arr_if[2]].soLuong < fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa)) break block9;
                var1_1.setColor(es_0.mangSoNguyen[fh.var_byte_if]);
                var2_2 = es_0.var_int_arr_if[2];
                if (-" ".length() <= 0) ** GOTO lbl14
                return;
lbl-1000:
                // 1 sources

                {
                    var1_1.drawRoundRect(this.var_fs_arr_int[var2_2].soLuong - this.var_fs_arr_int[var2_2].cfr_renamed_2 / es_0.var_int_arr_if[1], this.var_fs_arr_int[var2_2].var_int_if - this.var_fs_arr_int[var2_2].cfr_renamed_2 / es_0.var_int_arr_if[11], this.var_fs_arr_int[var2_2].cfr_renamed_2, this.var_fs_arr_int[var2_2].cfr_renamed_2 / es_0.var_int_arr_if[1], this.var_fs_arr_int[var2_2].cfr_renamed_2, this.var_fs_arr_int[var2_2].cfr_renamed_2);
                    ++var2_2;
lbl14:
                    // 2 sources

                    ** while (!es_0.cfr_renamed_2((int)var2_2, (int)es_0.var_int_arr_if[1]))
                }
            }
            var1_1.setColor(es_0.var_int_arr_if[26]);
            if ((!(this.var_fs_arr_do[es_0.var_int_arr_if[2]].soLuong > fm.fm_do().cfr_renamed_3) || (this.var_fs_arr_do[es_0.var_int_arr_if[2]].soLuong >= fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa)) && (!(this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[4]].soLuong > fm.fm_do().cfr_renamed_3) || !(this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[4]].soLuong < fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa))) break block10;
            var2_2 = es_0.var_int_arr_if[2];
            if (-(161 ^ 165) < 0) ** GOTO lbl26
            return;
lbl-1000:
            // 1 sources

            {
                if ((this.var_fs_arr_do[var2_2 + es_0.var_int_arr_if[4]].var_int_if < this.duLieuNguoiChoi.cfr_renamed_3 + this.duLieuNguoiChoi.var_byte_this + es_0.var_int_arr_if[21])) {
                    var1_1.drawLine(this.var_fs_arr_do[var2_2].soLuong, this.var_fs_arr_do[var2_2].var_int_if, this.var_fs_arr_do[var2_2 + es_0.var_int_arr_if[4]].soLuong, this.var_fs_arr_do[var2_2 + es_0.var_int_arr_if[4]].var_int_if);
                }
                ++var2_2;
lbl26:
                // 2 sources

                ** while (!es_0.cfr_renamed_2((int)var2_2, (int)(this.var_byte_do - es_0.var_int_arr_if[4] - this.soLuong)))
            }
lbl27:
            // 1 sources

            if ((this.soLuong == 0) && (this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[4]].var_int_if < this.duLieuNguoiChoi.cfr_renamed_3 + this.duLieuNguoiChoi.var_byte_this + es_0.var_int_arr_if[0])) {
                v_0.cfr_renamed_1(this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[4]].soLuong, this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[4]].var_int_if, es_0.var_int_arr_if[1], es_0.var_int_arr_if[1], es_0.var_int_arr_if[2], var1_1);
            }
            var1_1.drawImage(u_0.cfr_renamed_1().var_javax_microedition_lcdui_Image_do, this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[1]].soLuong, this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[1]].var_int_if, es_0.var_int_arr_if[15]);
            if (es_0.cfr_renamed_2((int)this.coTrangThai) && (this.var_int_if > 0)) {
                u_0.cfr_renamed_1().var_cu_0_do.cfr_renamed_1(es_0.var_int_arr_if[2] + this.cfr_renamed_4 / es_0.var_int_arr_if[15], this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[1]].soLuong + es_0.var_int_arr_if[1], this.var_fs_arr_do[this.var_byte_do - es_0.var_int_arr_if[1]].var_int_if + es_0.var_int_arr_if[11], es_0.var_int_arr_if[2], es_0.var_int_arr_if[27], var1_1);
                if ((GameCanvas.var_int_goto % es_0.var_int_arr_if[0] > es_0.var_int_arr_if[17]) && es_0.cfr_renamed_0(var2_3 = (fb)aa_0.am_do((short)this.var_int_if))) {
                    var2_3.cfr_renamed_0(var1_1, this.duLieuNguoiChoi.cfr_renamed_2 * dF.cfr_renamed_12, this.duLieuNguoiChoi.cfr_renamed_3 - es_0.var_int_arr_if[28] * dF.cfr_renamed_12, es_0.var_int_arr_if[15]);
                }
            }
        }
        if ((dF.cfr_renamed_12 > es_0.var_int_arr_if[4])) {
            var1_1.translate(es_0.var_int_arr_if[2], -this.duLieuNguoiChoi.cfr_renamed_3);
        }
    }

                /*
     * Unable to fully structure code
     */
    public es_0() {
        super();
        this.var_byte_do = (byte)es_0.var_int_arr_if[6];
        this.cfr_renamed_14 = es_0.var_int_arr_if[2];
        this.soLuongKhoa = es_0.this;
        this.cfr_renamed_5 = es_0.var_int_arr_if[7];
        this.soLuong = es_0.var_int_arr_if[2];
        this.var_int_int = es_0.var_int_arr_if[8];
        this.cfr_renamed_13 = es_0.var_int_arr_if[9];
        this.var_int_if = es_0.var_int_arr_if[8];
        this.coKichHoat = es_0.var_int_arr_if[2];
        this.coTrangThai = es_0.var_int_arr_if[2];
        this.dangChayAuto = es_0.var_int_arr_if[2];
        this.var_boolean_int = es_0.var_int_arr_if[2];
        this.cfr_renamed_6 = es_0.var_int_arr_if[2];
        this.cfr_renamed_8 = es_0.var_int_arr_if[2];
        this.cfr_renamed_4 = es_0.var_int_arr_if[2];
        this.var_byte_do = (byte)(es_0.var_int_arr_if[10] + hg.int_new(es_0.var_int_arr_if[11]));
        this.var_fs_arr_int = new fs[es_0.var_int_arr_if[1]];
        var1_1 = es_0.var_int_arr_if[2];
        if (-"  ".length() < 0) ** GOTO lbl27
        throw null;
lbl-1000:
        // 1 sources

        {
            this.var_fs_arr_int[var1_1] = new fs(es_0.var_int_arr_if[12], es_0.var_int_arr_if[2], var1_1 * es_0.var_int_arr_if[13]);
            ++var1_1;
lbl27:
            // 2 sources

            ** while (!es_0.cfr_renamed_2((int)var1_1, (int)es_0.var_int_arr_if[1]))
        }
lbl28:
        // 1 sources

        this.var_fs_arr_for = new fs[es_0.var_int_arr_if[1]];
        this.var_fs_arr_for[es_0.var_int_arr_if[2]] = new fs();
        this.var_fs_arr_for[es_0.var_int_arr_if[4]] = new fs();
        this.var_fs_arr_if = new fs[this.var_byte_do];
        this.var_fs_arr_do = new fs[this.var_byte_do];
        var1_1 = es_0.var_int_arr_if[2];
        if ("  ".length() >= "  ".length()) ** GOTO lbl41
        throw null;
lbl-1000:
        // 1 sources

        {
            this.var_fs_arr_if[var1_1] = new fs();
            this.var_fs_arr_do[var1_1] = new fs();
            ++var1_1;
lbl41:
            // 2 sources

            ** while (!es_0.cfr_renamed_2((int)var1_1, (int)this.var_byte_do))
        }
lbl42:
        // 1 sources

        this.var_fs_if = new fs(es_0.var_int_arr_if[2], es_0.var_int_arr_if[2], es_0.var_int_arr_if[8]);
        this.var_fs_for = new fs(es_0.var_int_arr_if[2], es_0.var_int_arr_if[2], es_0.var_int_arr_if[8]);
        this.var_fs_do = new fs();
    }

    public final void (DuLieuNguoiChoi ef2 == null) {
        this.duLieuNguoiChoi = ef2;
        if ((ef2.var_byte_new == 0)) {
            this.cfr_renamed_7 = var_int_arr_if[4];
            if ("  ".length() == "   ".length()) {
                return;
            }
        } else {
            this.cfr_renamed_7 = var_int_arr_if[8];
        }
        this.cfr_renamed_0();
        DuLieuNguoiChoi ef3 = ef2;
        es_0 es_02 = this;
        this.var_int_int = var_int_arr_if[2];
        es_02.var_int_if = var_int_arr_if[2];
        am am2 = aa_0.cX_do(ef3.var_java_util_Vector_if, var_int_arr_if[14]);
        if (es_0.boolean_do(((am)am2).cfr_renamed_2)) {
            am2 = aa_0.am_do(((am)am2).cfr_renamed_2);
        }
        k_0 k_02 = aa_0.var_k_0_arr_do[am2.var_short_arr_do[var_int_arr_if[15]]];
        k_0 k_03 = aa_0.var_k_0_arr_do[am2.var_short_arr_do[var_int_arr_if[16]]];
        int n = ((bm)ef3).cfr_renamed_2;
        int n2 = ((bm)ef3).cfr_renamed_3 + ef3.var_byte_this;
        es_02.var_fs_arr_for[es_0.var_int_arr_if[2]].soLuong = n + am2.var_byte_arr_if[var_int_arr_if[15]] * dF.cfr_renamed_12 + k_02.cfr_renamed_4 * dF.cfr_renamed_12;
        es_02.var_fs_arr_for[es_0.var_int_arr_if[2]].var_int_if = n2 + am2.var_byte_arr_do[var_int_arr_if[15]] * dF.cfr_renamed_12 - var_int_arr_if[17] * (dF.cfr_renamed_12 - var_int_arr_if[4]);
        es_02.var_fs_arr_for[es_0.var_int_arr_if[4]].soLuong = n + am2.var_byte_arr_if[var_int_arr_if[16]] * dF.cfr_renamed_12 + k_03.cfr_renamed_4 * dF.cfr_renamed_12;
        es_02.var_fs_arr_for[es_0.var_int_arr_if[4]].var_int_if = n2 + am2.var_byte_arr_do[var_int_arr_if[16]] * dF.cfr_renamed_12 - var_int_arr_if[17] * (dF.cfr_renamed_12 - var_int_arr_if[4]);
        es_02.var_fs_if.cfr_renamed_2 = var_int_arr_if[8];
        if (es_0.cfr_renamed_0(((dd_0)ef2).cfr_renamed_9, ((dd_0)AngelChip.duLieuNguoiChoi).cfr_renamed_9)) {
            go_0.go_0_do();
            go_0.cfr_renamed_0(var_int_arr_if[18]);
        }
    }

                        private static void cfr_renamed_3() {
        var_int_arr_if = new int[29];
        es_0.var_int_arr_if[0] = 0x7D ^ 0x77;
        es_0.var_int_arr_if[1] = "  ".length();
        es_0.var_int_arr_if[2] = (199 + 141 - 258 + 158 ^ 38 + 143 - -5 + 5) & (0xB4 ^ 0x83 ^ (0x59 ^ 0x21) ^ -" ".length());
        es_0.var_int_arr_if[3] = 0xFFFFE9FB & 0xBFFFF6;
        es_0.var_int_arr_if[4] = " ".length();
        es_0.var_int_arr_if[5] = 0xFFFFFFDF & 0x9DCCF7;
        es_0.var_int_arr_if[6] = 0xEC ^ 0x87 ^ (0xF7 ^ 0x95);
        es_0.var_int_arr_if[7] = -(0x34 ^ 0x3C);
        es_0.var_int_arr_if[8] = -" ".length();
        es_0.var_int_arr_if[9] = 0xDA ^ 0xB1 ^ (0xF1 ^ 0x83);
        es_0.var_int_arr_if[10] = 122 + 80 - 121 + 115 ^ 97 + 176 - 86 + 8;
        es_0.var_int_arr_if[11] = 0x9A ^ 0x9E;
        es_0.var_int_arr_if[12] = -(0xE9 ^ 0x84 ^ (0xED ^ 0x8A));
        es_0.var_int_arr_if[13] = 0xC3 ^ 0x91 ^ (0xDB ^ 0x86);
        es_0.var_int_arr_if[14] = 126 + 177 - 165 + 68 ^ 34 + 38 - -8 + 56;
        es_0.var_int_arr_if[15] = "   ".length();
        es_0.var_int_arr_if[16] = 0xCF ^ 0x88 ^ (0xF5 ^ 0xBC);
        es_0.var_int_arr_if[17] = 0x4E ^ 0x4B;
        es_0.var_int_arr_if[18] = 0x57 ^ 0x5A;
        es_0.var_int_arr_if[19] = 0x18 ^ 0x37 ^ (0x60 ^ 0x49);
        es_0.var_int_arr_if[20] = 0x69 ^ 0x4A ^ (0x91 ^ 0xBA);
        es_0.var_int_arr_if[21] = 0x80 ^ 0x94;
        es_0.var_int_arr_if[22] = 40 + 126 - 101 + 81 ^ 124 + 115 - 192 + 83;
        es_0.var_int_arr_if[23] = -"  ".length();
        es_0.var_int_arr_if[24] = 0x7D ^ 0x4F;
        es_0.var_int_arr_if[25] = 0x66 ^ 0x78 ^ (0x74 ^ 0xE);
        es_0.var_int_arr_if[26] = 0xFFFFAFDF & 0x84D7A8;
        es_0.var_int_arr_if[27] = 0x5E ^ 0x46;
        es_0.var_int_arr_if[28] = 0x68 ^ 0x5F;
    }
}

