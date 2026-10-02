/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from aL
 */
public final class al_0
extends ax_0
implements ba {
    public static al_0 var_al_0_do;
    private static int[] mangSoNguyen;
    public static a_0 var_a_0_do;
    public ba var_ba_do;

        public static void cfr_renamed_0() {
        ee.ee_do().var_ba_do = var_al_0_do;
    }

        static {
        al_0.cfr_renamed_3();
        var_al_0_do = new al_0();
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[7];
        5 = 0x8E ^ 0x83 ^ (0x4B ^ 0x43);
        3 = "   ".length();
        16 = 0x63 ^ 0x73;
        1 = " ".length();
        0 = "   ".length() & ("   ".length() ^ -" ".length());
        2 = "  ".length();
        -1 = -" ".length();
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(ad_0 var1_1) {
        try {
            switch (var1_1.var_byte_do) {
                case 61: {
                    switch (var1_1.var_java_io_DataInputStream_do.readByte()) {
                        case 3: {
                            fy.cfr_renamed_0();
                            if (((218 + 41 - 124 + 120 ^ 115 + 187 - 195 + 92) & (15 + 77 - 81 + 122 ^ 108 + 47 - 26 + 60 ^ -" ".length())) == 0) break;
                            return;
                        }
                        case 7: {
                            fg_0.cfr_renamed_0();
                            if (((119 ^ 110) & ~(0 ^ 25)) < " ".length()) break;
                            return;
                        }
                        case 21: {
                            bC.cfr_renamed_0();
                            if (-"   ".length() <= 0) break;
                            return;
                        }
                        case 22: {
                            a_0.var_int_case = 5;
                            e.var_byte_for = e.var_byte_do;
                            gp_0.cfr_renamed_0(3, o.a_0_do());
                            if ((gp.var_gp_do == null)) {
                                gp.var_gp_do = new gp();
                            }
                            al_0.var_al_0_do.var_ba_do = gp.var_gp_do;
                            if (" ".length() < "  ".length()) break;
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                    GameCanvas.cfr_renamed_4(MenuChinhAvatar.cT);
                    cd_0.cd_0_do().cfr_renamed_3();
                    return;
                }
                case 6: {
                    var2_6 = new Vector<ej_0>();
                    if (((91 ^ 101) & ~(109 ^ 83)) >= 0) ** GOTO lbl54
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_16 = new ej_0();
                        new ej_0().cfr_renamed_1 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_16.var_byte_do = var1_1.var_java_io_DataInputStream_do.readByte();
                        var1_1.var_java_io_DataInputStream_do.readByte();
                        var3_16.cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var2_6.addElement(var3_16);
lbl54:
                        // 2 sources

                        ** while (!al_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl55:
                    // 1 sources

                    gp_0.gp_0_do().cfr_renamed_0(var2_6);
                    gp_0.gp_0_do().cfr_renamed_8();
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 7: {
                    var3_17 = new Vector<eu_0>();
                    var2_7 = var1_1.var_java_io_DataInputStream_do.readByte();
                    if ("  ".length() <= (96 ^ 94 ^ (46 ^ 20))) ** GOTO lbl93
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_23 = new eu_0();
                        new eu_0().cfr_renamed_3 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var5_27 = var1_1.var_java_io_DataInputStream_do.readUnsignedByte();
                        var4_23.var_byte_do = (byte)(var5_27 % 16);
                        var4_23.var_byte_if = (byte)(var5_27 / 16);
                        var6_29 = var1_1.var_java_io_DataInputStream_do.readUnsignedByte();
                        if (al_0.boolean_do(var6_29 & 1)) {
                            v0 = 1;
                            if (-" ".length() >= 0) {
                                return;
                            }
                        } else {
                            var4_23.dangChayAuto = 0;
                            v0 = (int)var4_23.dangChayAuto;
                        }
                        if (al_0.boolean_do(var6_29 & 2)) {
                            v1 = 1;
                            if (((195 ^ 154) & ~(110 ^ 55)) < 0) {
                                return;
                            }
                        } else {
                            v1 = 0;
                        }
                        var4_23.coTrangThai = v1;
                        var4_23.soLuong = var1_1.var_java_io_DataInputStream_do.readInt();
                        var4_23.chuoiGiaTri = String.valueOf(GameCanvas.java_lang_String_do(var4_23.soLuong)) + MenuChinhAvatar.java_lang_String_for();
                        var3_17.addElement(var4_23);
lbl93:
                        // 2 sources

                        ** while (!al_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl94:
                    // 1 sources

                    e.e_do().var_byte_int = var2_7;
                    e.e_do().cfr_renamed_0(var3_17);
                    e.e_do().cfr_renamed_8();
                    e.e_do().cfr_renamed_4();
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 8: {
                    GameCanvas.cfr_renamed_6 = 0;
                    var2_8 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_18 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_24 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var5_28 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var6_30 = new Vector<DuLieuNguoiChoi>();
                    if (-"  ".length() <= 0) ** GOTO lbl142
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var7_31 = new DuLieuNguoiChoi();
                        new DuLieuNguoiChoi().cfr_renamed_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                        if (!(var7_31.cfr_renamed_12 == -1)) ** GOTO lbl120
                        var7_31.cfr_renamed_0("");
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        ** GOTO lbl141
lbl120:
                        // 1 sources

                        if ((var7_31.cfr_renamed_12 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                            var7_31 = AngelChip.duLieuNguoiChoi;
                        }
                        var7_31.cfr_renamed_0(var1_1.var_java_io_DataInputStream_do.readUTF());
                        var7_31.void_new(var1_1.var_java_io_DataInputStream_do.readInt());
                        var8_33 = var1_1.var_java_io_DataInputStream_do.readByte();
                        var9_35 = 0;
                        if ((101 + 95 - 116 + 96 ^ 76 + 138 - 109 + 75) != 0) ** GOTO lbl134
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var10_39 = new ef(var1_1.var_java_io_DataInputStream_do.readShort());
                            if ((var7_31.cfr_renamed_12 != AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                                var7_31.cfr_renamed_1(var10_39);
                            }
                            ++var9_35;
lbl134:
                            // 2 sources

                            ** while (!al_0.cfr_renamed_1((int)var9_35, (int)var8_33))
                        }
lbl135:
                        // 1 sources

                        var9_35 = var1_1.var_java_io_DataInputStream_do.readInt();
                        var7_31.void_try(var9_35);
                        var7_31.var_boolean_int = var1_1.var_java_io_DataInputStream_do.readBoolean();
                        var7_31.void_try(var9_35);
                        var7_31.void_new(var7_31.int_if());
                        var7_31.var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
lbl141:
                        // 2 sources

                        var6_30.addElement(var7_31);
lbl142:
                        // 2 sources

                        ** while (!al_0.boolean_if((int)var1_1.var_java_io_DataInputStream_do.available()))
                    }
lbl143:
                    // 1 sources

                    al_0.var_a_0_do.cfr_renamed_0(var2_8, var3_18, var4_24, var5_28, var6_30);
                    bB.bB_do().dangChayAuto = 1;
                    a_0.coTrangThai = 0;
                    var7_32 = var6_30.size();
                    var8_33 = 0;
                    if ("  ".length() > ((7 ^ 78) & ~(77 ^ 4))) ** GOTO lbl158
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var9_37 = (DuLieuNguoiChoi)var6_30.elementAt(var8_33);
                        if ((var9_37.cfr_renamed_12 == var4_24)) {
                            var9_37.var_boolean_int = 1;
                        }
                        if ((var9_37.cfr_renamed_12 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                            AngelChip.duLieuNguoiChoi.void_new(var9_37.int_if());
                        }
                        ++var8_33;
lbl158:
                        // 2 sources

                        ** while (!al_0.cfr_renamed_1((int)var8_33, (int)var7_32))
                    }
lbl159:
                    // 1 sources

                    al_0.var_a_0_do.cfr_renamed_30();
                    al_0.var_a_0_do.cfr_renamed_8();
                    bB.bB_do();
                    bB.cfr_renamed_11();
                    GameCanvas.cfr_renamed_8();
                    GameCanvas.cfr_renamed_6 = 1;
                    return;
                }
                case 12: {
                    var8_34 = new DuLieuNguoiChoi();
                    var9_38 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var8_34.cfr_renamed_12 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var8_34.cfr_renamed_0(var1_1.var_java_io_DataInputStream_do.readUTF());
                    var8_34.void_new(var1_1.var_java_io_DataInputStream_do.readInt());
                    var10_40 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var2_9 = 0;
                    if ("  ".length() <= "   ".length()) ** GOTO lbl183
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var8_34.cfr_renamed_1(new ef(var1_1.var_java_io_DataInputStream_do.readShort()));
                        ++var2_9;
lbl183:
                        // 2 sources

                        ** while (!al_0.cfr_renamed_1((int)var2_9, (int)var10_40))
                    }
lbl184:
                    // 1 sources

                    var8_34.cfr_renamed_3 = (byte)0;
                    var8_34.void_try(var1_1.var_java_io_DataInputStream_do.readInt());
                    var8_34.var_short_if = var1_1.var_java_io_DataInputStream_do.readShort();
                    var8_34.var_boolean_int = 0;
                    bB.bB_do().dangChayAuto = 1;
                    var8_34.var_boolean_int = 0;
                    al_0.var_a_0_do.cfr_renamed_0((int)var9_38, var8_34);
                    return;
                }
                case 14: {
                    var2_10 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_2 = var1_1.var_java_io_DataInputStream_do.readInt();
                    if (al_0.boolean_do((int)a_0.coKichHoat) && (a_0.var_int_case == 2)) {
                        al_0.var_a_0_do.cfr_renamed_0(MenuChinhAvatar.H);
                    }
                    bB.bB_do().dangChayAuto = 1;
                    a_0.var_a_0_do.void_for(var2_10);
                    a_0.void_new(var1_2);
                    return;
                }
                case 16: {
                    var2_11 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_3 = var1_1.var_java_io_DataInputStream_do.readBoolean();
                    if ((var2_11 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                        GameCanvas.cfr_renamed_8();
                    }
                    a_0.cfr_renamed_1(var2_11, var1_3);
                    return;
                }
                case 19: {
                    var2_12 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_19 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_4 = var1_1.var_java_io_DataInputStream_do.readInt();
                    if (al_0.boolean_do((int)a_0.cfr_renamed_0(var2_12, var3_19))) {
                        a_0.void_int(var1_4);
                        return;
                    }
                    break;
                }
                case 9: {
                    var2_13 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_20 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var4_25 = var1_1.var_java_io_DataInputStream_do.readInt();
                    var1_1 = var1_1.var_java_io_DataInputStream_do.readUTF();
                    if (al_0.boolean_do((int)a_0.cfr_renamed_0(var2_13, var3_20))) {
                        a_0.cfr_renamed_0(var4_25, (String)var1_1);
                        return;
                    }
                    break;
                }
                case 11: {
                    var2_14 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var3_21 = var1_1.var_java_io_DataInputStream_do.readByte();
                    var1_5 = var1_1.var_java_io_DataInputStream_do.readInt();
                    GameCanvas.var_bt_0_do = null;
                    if (al_0.boolean_do((int)a_0.cfr_renamed_0(var2_14, var3_21))) {
                        if ((var1_5 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.J, new fb_0());
                            return;
                        }
                        a_0.var_a_0_do.void_for(var1_5);
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
                    var4_26 = a_0.dd_0_do(var2_15);
                    if (!al_0.boolean_do(var3_22) || (var4_26 == null)) {
                        return;
                    }
                    var4_26.void_new(var4_26.int_if() + var3_22);
                    if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 == var2_15)) {
                        AngelChip.duLieuNguoiChoi.void_new(var4_26.int_if());
                    }
                    a_0.cfr_renamed_0(var2_15, (String)var1_1);
                    a_0.void_for(var2_15, var3_22);
                    return;
                }
                default: {
                    this.var_ba_do.void_do((ad_0)var1_1);
                    return;
                }
            }
        }
        catch (Exception v2) {
            v2.printStackTrace();
        }
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

            private static boolean boolean_if(int n) {
        return n <= 0;
    }
}

