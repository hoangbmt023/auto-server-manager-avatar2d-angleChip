/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

public final class bs
extends bE
implements bH {
    public static bs var_bs_do;
    public static w_0 var_w_0_do;
    private static int[] mangSoNguyen;
    public bH var_bH_do;

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

    static {
        bs.cfr_renamed_2();
        var_bs_do = new bs();
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[7];
        5 = 0xE3 ^ 0xB9 ^ (0x59 ^ 6);
        3 = "   ".length();
        16 = 56 + 106 - 114 + 129 ^ 5 + 89 - 0 + 67;
        1 = " ".length();
        0 = (0xDD ^ 0xC4) & ~(0x69 ^ 0x70);
        2 = "  ".length();
        -1 = -" ".length();
    }

    private static boolean boolean_if(int n) {
        return n != 0;
    }

        public static void cfr_renamed_1() {
        fh_0.fh_0_do().var_bH_do = var_bs_do;
    }

        /*
     * Unable to fully structure code
     */
    public final void void_do(bj var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case 61: {
                    switch (var1_1.var_java_io_DataInputStream_do.readByte()) {
                        case 3: {
                            gp_0.cfr_renamed_1();
                            if (-(221 ^ 170 ^ (179 ^ 193)) < 0) break;
                            return;
                        }
                        case 7: {
                            gq_0.cfr_renamed_1();
                            if (((156 ^ 142) & ~(86 ^ 68)) < " ".length()) break;
                            return;
                        }
                        case 21: {
                            dp_0.cfr_renamed_1();
                            if ((161 ^ 165) > 0) break;
                            return;
                        }
                        case 22: {
                            w_0.cfr_renamed_9 = 5;
                            p_0.var_byte_if = p_0.var_byte_for;
                            fm_0.cfr_renamed_1(3, z_0.w_0_do());
                            if ((eq_0.var_eq_0_do == null)) {
                                eq_0.var_eq_0_do = new eq_0();
                            }
                            bs.var_bs_do.var_bH_do = eq_0.var_eq_0_do;
                            if ("  ".length() > ((120 ^ 25) & ~(237 ^ 140))) break;
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                    GameCanvas.cfr_renamed_2(MenuChinhAvatar.bZ);
                    dt_0.dt_0_do().cfr_renamed_5();
                    return;
                }
                case 6: {
                    var2_6 = new Vector<fl>();
                    if (" ".length() > 0) ** GOTO lbl54
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_16 = new fl();
                        new fl().var_byte_do = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_16.cfr_renamed_0 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_16.cfr_renamed_2 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_6.addElement(var3_16);
lbl54:
                        // 2 sources

                        ** while (!bs.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl55:
                    // 1 sources

                    fm_0.fm_0_do().cfr_renamed_1(var2_6);
                    fm_0.fm_0_do().cfr_renamed_4();
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 7: {
                    var3_17 = new Vector<fw>();
                    var2_7 = var1_1.var_java_io_DataInputStream_do.readByte();
                    if (null == null) ** GOTO lbl93
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_23 = new fw();
                        new fw().var_byte_if = var1_1.var_java_io_DataInputStream_do.readByte();
                        var5_27 = var1_1.var_java_io_DataInputStream_do.readUnsignedByte();
                        var4_23.var_byte_do = (byte)(var5_27 % 16);
                        var4_23.cfr_renamed_2 = (byte)(var5_27 / 16);
                        var6_29 = var1_1.var_java_io_DataInputStream_do.readUnsignedByte();
                        if (bs.boolean_if(var6_29 & 1)) {
                            v0 = 1;
                            if ((24 ^ 29) == 0) {
                                return;
                            }
                        } else {
                            var4_23.coTrangThai = 0;
                            v0 = (int)var4_23.coTrangThai;
                        }
                        if (bs.boolean_if(var6_29 & 2)) {
                            v1 = 1;
                            if ("   ".length() == 0) {
                                return;
                            }
                        } else {
                            v1 = 0;
                        }
                        var4_23.dangChayAuto = v1;
                        var4_23.soLuong = var1_1.var_java_io_DataInputStream_do.readInt();
                        var4_23.chuoiGiaTri = String.valueOf(GameCanvas.java_lang_String_do(var4_23.soLuong)) + MenuChinhAvatar.java_lang_String_if();
                        var3_17.addElement(var4_23);
lbl93:
                        // 2 sources

                        ** while (!bs.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl94:
                    // 1 sources

                    p_0.p_0_do().var_byte_do = var2_7;
                    p_0.p_0_do().cfr_renamed_1(var3_17);
                    p_0.p_0_do().cfr_renamed_4();
                    p_0.p_0_do().void_do();
                    GameCanvas.cfr_renamed_7();
                    return;
                }
                case 8: {
                    GameCanvas.var_int_byte = 0;
                    var2_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_18 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_24 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var5_28 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var6_30 = new Vector<DuLieuNguoiChoi>();
                    if (-" ".length() <= (167 ^ 178 ^ (170 ^ 187))) ** GOTO lbl142
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_31 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().cfr_renamed_9 = var1_1.var_java_io_DataInputStream_do.readInt();
                        if (!(var7_31.cfr_renamed_9 == -1)) ** GOTO lbl120
                        var7_31.cfr_renamed_1("");
                        if (-(2 + 36 - -69 + 40 ^ 126 + 62 - 52 + 14) >= 0) {
                            return;
                        }
                        ** GOTO lbl141
lbl120:
                        // 1 sources

                        if ((var7_31.cfr_renamed_9 == AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                            var7_31 = AngelChip.duLieuNguoiChoi;
                        }
                        var7_31.cfr_renamed_1(var1_1.var_java_io_DataInputStream_do.readUTF());
                        var7_31.void_int(var1_1.var_java_io_DataInputStream_do.readInt());
                        var8_33 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var9_35 = 0;
                        if (((44 ^ 3) & ~(146 ^ 189)) < "  ".length()) ** GOTO lbl134
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var10_39 = new cg(var1_1.var_java_io_DataInputStream_do.readShort());
                            if ((var7_31.cfr_renamed_9 != AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                                var7_31.cfr_renamed_0(var10_39);
                            }
                            ++var9_35;
lbl134:
                            // 2 sources

                            ** while (!bs.cfr_renamed_0((int)var9_35, (int)var8_33))
                        }
lbl135:
                        // 1 sources

                        var9_35 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var7_31.void_for(var9_35);
                        var7_31.var_boolean_int = var1_1.var_java_io_DataInputStream_do.readBoolean();
                        var7_31.void_for(var9_35);
                        var7_31.void_int(var7_31.int_if());
                        var7_31.var_short_break = var1_1.var_java_io_DataInputStream_do.readShort();
lbl141:
                        // 2 sources

                        var6_30.addElement(var7_31);
lbl142:
                        // 2 sources

                        ** while (!bs.boolean_do((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl143:
                    // 1 sources

                    bs.var_w_0_do.cfr_renamed_1(var2_8, var3_18, var4_24, var5_28, var6_30);
                    g_0.g_0_do().dangChayAuto = 1;
                    w_0.var_boolean_int = 0;
                    var7_32 = var6_30.size();
                    var8_33 = 0;
                    if (((14 ^ 93) & ~(74 ^ 25)) < " ".length()) ** GOTO lbl158
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var9_37 = (DuLieuNguoiChoi)var6_30.elementAt(var8_33);
                        if ((var9_37.cfr_renamed_9 == var4_24)) {
                            var9_37.var_boolean_int = 1;
                        }
                        if ((var9_37.cfr_renamed_9 == AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                            AngelChip.duLieuNguoiChoi.void_int(var9_37.int_if());
                        }
                        ++var8_33;
lbl158:
                        // 2 sources

                        ** while (!bs.cfr_renamed_0((int)var8_33, (int)var7_32))
                    }
lbl159:
                    // 1 sources

                    bs.var_w_0_do.cfr_renamed_15();
                    bs.var_w_0_do.cfr_renamed_4();
                    g_0.g_0_do();
                    g_0.cfr_renamed_14();
                    GameCanvas.cfr_renamed_7();
                    GameCanvas.var_int_byte = 1;
                    return;
                }
                case 12: {
                    var8_34 = new DuLieuNguoiChoi();
                    var9_38 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var8_34.cfr_renamed_9 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var8_34.cfr_renamed_1(var1_1.var_java_io_DataInputStream_do.readUTF());
                    var8_34.void_int(var1_1.var_java_io_DataInputStream_do.readInt());
                    var10_40 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_9 = 0;
                    if (((69 + 3 - -45 + 18 ^ 173 + 116 - 172 + 81) & (226 ^ 141 ^ (128 ^ 174) ^ -" ".length()) & ("  ".length() & ("  ".length() ^ -" ".length()) ^ -" ".length())) == 0) ** GOTO lbl183
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_34.cfr_renamed_0(new cg(var1_1.var_java_io_DataInputStream_do.readShort()));
                        ++var2_9;
lbl183:
                        // 2 sources

                        ** while (!bs.cfr_renamed_0((int)var2_9, (int)var10_40))
                    }
lbl184:
                    // 1 sources

                    var8_34.var_byte_new = (byte)0;
                    var8_34.void_for(var1_1.var_java_io_DataInputStream_do.readInt());
                    var8_34.var_short_break = var1_1.var_java_io_DataInputStream_do.readShort();
                    var8_34.var_boolean_int = 0;
                    g_0.g_0_do().dangChayAuto = 1;
                    var8_34.var_boolean_int = 0;
                    bs.var_w_0_do.cfr_renamed_1((int)var9_38, var8_34);
                    return;
                }
                case 14: {
                    var2_10 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    if (bs.boolean_if((int)w_0.coKichHoat) && (w_0.cfr_renamed_9 == 2)) {
                        bs.var_w_0_do.cfr_renamed_0(MenuChinhAvatar.ci);
                    }
                    g_0.g_0_do().dangChayAuto = 1;
                    w_0.var_w_0_do.void_new(var2_10);
                    w_0.void_if(var1_2);
                    return;
                }
                case 16: {
                    var2_11 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    if ((var2_11 == AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                        GameCanvas.cfr_renamed_7();
                    }
                    w_0.cfr_renamed_0(var2_11, var1_3);
                    return;
                }
                case 19: {
                    var2_12 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    if (bs.boolean_if((int)w_0.cfr_renamed_1(var2_12, var3_19))) {
                        w_0.void_do(var1_4);
                        return;
                    }
                    break;
                }
                case 9: {
                    var2_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_20 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_25 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_1 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    if (bs.boolean_if((int)w_0.cfr_renamed_1(var2_13, var3_20))) {
                        w_0.cfr_renamed_1(var4_25, (String)var1_1);
                        return;
                    }
                    break;
                }
                case 11: {
                    var2_14 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_21 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.var_dj_0_do = null;
                    if (bs.boolean_if((int)w_0.cfr_renamed_1(var2_14, var3_21))) {
                        if ((var1_5 == AngelChip.duLieuNguoiChoi.cfr_renamed_9)) {
                            GameCanvas.hienThongBaoPopup(MenuChinhAvatar.ag, new gd());
                            return;
                        }
                        w_0.var_w_0_do.void_new(var1_5);
                        return;
                    }
                    break;
                }
                case 52: {
                    var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_15 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var3_22 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_1 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    var4_26 = w_0.ef_do(var2_15);
                    if (!bs.boolean_if(var3_22) || (var4_26 == null)) {
                        return;
                    }
                    var4_26.void_int(var4_26.int_if() + var3_22);
                    if ((AngelChip.duLieuNguoiChoi.cfr_renamed_9 == var2_15)) {
                        AngelChip.duLieuNguoiChoi.void_int(var4_26.int_if());
                    }
                    w_0.cfr_renamed_1(var2_15, (String)var1_1);
                    w_0.void_for(var2_15, var3_22);
                    return;
                }
                default: {
                    this.var_bH_do.void_do((bj)var1_1);
                    return;
                }
            }
        }
        catch (Exception v2) {
            v2.printStackTrace();
        }
    }

        }

