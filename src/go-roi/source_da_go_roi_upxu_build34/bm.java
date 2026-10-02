/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

public final class bm
extends a_0 {
    private ei var_ei_byte;
    private int[] var_int_arr_if;
    private int[] var_int_arr_for;
    private eq_0 var_eq_0_do;
    private static int soLuong;
    private fb var_fb_do;
    private int var_int_if;
    public static eq_0[] var_eq_0_arr_if;
    private int cfr_renamed_14;
    private boolean dangChayAuto;
    private int[] var_int_arr_int;
    private int cfr_renamed_23;
    private fb[][] var_fb_arr_arr_do;
    private static int cfr_renamed_24;
    private fb var_fb_if;
    private int[] var_int_arr_new;
    private byte[] var_byte_arr_do;
    private int[] var_int_arr_try;
    private fb var_fb_for;
    private boolean var_boolean_try;
    private boolean var_boolean_byte;
    private int[][] var_int_arr_arr_do;
    private int cfr_renamed_25;
    private boolean var_boolean_case;
    private eq_0 var_eq_0_if;
    private ei var_ei_case;
    public static eq_0[] var_eq_0_arr_for;
    private boolean var_boolean_char;
    private int[][] var_int_arr_arr_if;
    private int[][] var_int_arr_arr_for;
    private int cfr_renamed_27;
    private int cfr_renamed_26;
    private byte[] var_byte_arr_if;
    private int[] var_int_arr_byte = new int[var_int_arr_case[6]];
    private int cfr_renamed_21;
    private int cfr_renamed_29;
    private int cfr_renamed_9;
    private fb[] var_fb_arr_do;
    private fb var_fb_int;
    private fb[] var_fb_arr_if;
    private static int[] var_int_arr_case;
    private boolean cfr_renamed_11;
    private eq_0 var_eq_0_for;
    private int cfr_renamed_28;
    private ei var_ei_char;
    private boolean cfr_renamed_18;
    private int cfr_renamed_34;
    private fb var_fb_new = null;
    private int cfr_renamed_31;
    public static bm var_bm_do;
    private int cfr_renamed_33;
    private int cfr_renamed_36;
    private boolean cfr_renamed_10;
    private int cfr_renamed_38;
    private eq_0 var_eq_0_int;
    public static eq_0[] var_eq_0_arr_int;
    private int cfr_renamed_39;

    private static boolean boolean_do(int n, int n2) {
        return n != n2;
    }

    public final void cfr_renamed_22() {
        this.dangChayAuto = var_int_arr_case[1];
        this.cfr_renamed_17();
        super.cfr_renamed_22();
    }

    public final void void_int(int n, int n2) {
        if ((a_0.int_do(n) == var_int_arr_case[2])) {
            return;
        }
        this.cfr_renamed_39 = n2;
        if (bm.cfr_renamed_2(n, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12) && bm.boolean_do(((a_0)this).cfr_renamed_18, n)) {
            this.cfr_renamed_31();
            this.cfr_renamed_0(var_int_arr_case[1]);
        }
        ((a_0)this).cfr_renamed_18 = n;
        a_0.soXu = GameCanvas.int_if();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private void cfr_renamed_11() {
        this.var_eq_0_for = new eq_0();
        this.var_eq_0_int = new eq_0();
        this.var_eq_0_for.var_int_if = GameCanvas.var_int_int - var_int_arr_case[9];
        this.var_eq_0_for.soLuong = GameCanvas.var_int_char - GameCanvas.var_int_else;
        if (bm.boolean_int(GameCanvas.var_int_byte, var_int_arr_case[10])) {
            this.var_eq_0_for.soLuong += var_int_arr_case[5];
        }
        this.var_eq_0_int.var_int_if = this.var_eq_0_for.var_int_if - var_int_arr_case[11];
        this.var_eq_0_int.soLuong = this.var_eq_0_for.soLuong - a_0.var_int_byte / var_int_arr_case[12] - var_int_arr_case[6];
        GameCanvas.var_gj_0_do.cfr_renamed_5();
    }

    static {
        bm.cfr_renamed_27();
        cfr_renamed_24 = var_int_arr_case[0];
        soLuong = var_int_arr_case[0];
    }

    private void (int n, int n2, int n3, Graphics graphics != null) {
        int n4 = var_int_arr_case[1];
        switch (n) {
            case 1: 
            case 4: {
                n4 = this.cfr_renamed_34;
                if (((0x7D ^ 0x47) & ~(0x19 ^ 0x23)) == 0) break;
                return;
            }
            case 2: 
            case 5: {
                n4 = this.cfr_renamed_38;
                if ("   ".length() != 0) break;
                return;
            }
            case 3: 
            case 6: {
                n4 = this.cfr_renamed_14;
            }
        }
        graphics.setColor(n4);
        graphics.fillRect(n2 - a_0.var_int_int / var_int_arr_case[12] + var_int_arr_case[12], n3 - a_0.var_int_byte / var_int_arr_case[12] + var_int_arr_case[33], var_int_arr_case[34], var_int_arr_case[12]);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_5(Graphics var1_1) {
        var2_2 = bm.var_int_arr_case[1];
        if (-" ".length() <= "   ".length()) ** GOTO lbl10
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var2_2);
            if (bm.boolean_do(var3_3.cfr_renamed_12, bm.var_int_arr_case[2]) && (!bm.boolean_int(GameCanvas.var_int_byte, bm.var_int_arr_case[25]) || (var3_3.cfr_renamed_12 == this.cfr_renamed_18)) && (!(var2_2 == var4_4 = a_0.int_do(this.cfr_renamed_18)) || bm.boolean_for(GameCanvas.var_int_try % bm.var_int_arr_case[21], bm.var_int_arr_case[13]) && !bm.boolean_do(var2_2, var4_4) || bm.boolean_int((int)this.dangChayAuto))) {
                GameCanvas.var_ew_int.cfr_renamed_0(var1_1, String.valueOf(var3_3.int_if()) + " " + MenuChinhAvatar.java_lang_String_for(), bm.var_eq_0_arr_if[a_0.mangSoNguyen[var2_2]].var_int_if, bm.var_eq_0_arr_if[a_0.mangSoNguyen[var2_2]].soLuong, bm.var_eq_0_arr_if[a_0.mangSoNguyen[var2_2]].cfr_renamed_3);
            }
            ++var2_2;
lbl10:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[6]))
        }
lbl11:
        // 1 sources

    }

    private void cfr_renamed_20() {
        this.var_ei_new = null;
        this.var_ei_try = null;
    }

    public final void (Graphics graphics == null) {
        super.cfr_renamed_1(graphics);
        this.cfr_renamed_3(graphics);
        Object object = graphics;
        if (!bm.boolean_int(a_0.coKichHoat ? 1 : 0) || bm.boolean_int(a_0.var_boolean_int ? 1 : 0)) {
            if (" ".length() <= 0) {
                return;
            }
        } else {
            long l = (long)a_0.cfr_renamed_11 - a_0.var_long_if;
            if (bm.boolean_do((l == 0L)) && (var_eq_0_arr_if != null) && (var_eq_0_arr_if[var_int_arr_case[1]] != null)) {
                GameCanvas.var_ew_new.cfr_renamed_0((Graphics)object, String.valueOf(l), GameCanvas.var_int_int, bm.var_eq_0_arr_if[bm.var_int_arr_case[1]].soLuong + bn_0.cfr_renamed_8 + var_int_arr_case[5], var_int_arr_case[12]);
            }
        }
        if (bm.boolean_int(a_0.coKichHoat ? 1 : 0)) {
            this.cfr_renamed_5(graphics);
            this.cfr_renamed_2(graphics);
            Graphics graphics2 = graphics;
            object = this;
            if (bm.boolean_int(object.var_boolean_byte ? 1 : 0)) {
                object.var_fb_int.cfr_renamed_2 = object.var_eq_0_do.var_int_if;
                object.var_fb_int.cfr_renamed_5 = object.var_eq_0_do.soLuong;
                if (bm.boolean_for(GameCanvas.var_int_byte, var_int_arr_case[27])) {
                    object.var_fb_int.cfr_renamed_0(graphics2);
                    if (-" ".length() == ((0x79 ^ 1 ^ (0x2A ^ 0xE)) & (18 + 100 - 27 + 149 ^ 87 + 120 - 62 + 27 ^ -" ".length()))) {
                        return;
                    }
                } else {
                    object.var_fb_int.cfr_renamed_0(graphics2, var_int_arr_case[1]);
                }
            }
            graphics2 = graphics;
            object = this;
            if (bm.boolean_int(object.cfr_renamed_11 ? 1 : 0)) {
                if (bm.boolean_for(GameCanvas.var_int_byte, var_int_arr_case[27])) {
                    object.var_fb_for.cfr_renamed_0(graphics2);
                    if ("   ".length() == 0) {
                        return;
                    }
                } else {
                    object.var_fb_for.cfr_renamed_0(graphics2, var_int_arr_case[1]);
                }
            }
            graphics2 = graphics;
            object = this;
            if (bm.boolean_int(object.cfr_renamed_10 ? 1 : 0)) {
                fb fb2 = new fb((byte)object.var_int_if, var_int_arr_case[3]);
                new fb((byte)object.var_int_if, var_int_arr_case[3]).cfr_renamed_2 = object.var_eq_0_if.var_int_if;
                fb2.cfr_renamed_5 = object.var_eq_0_if.soLuong;
                if (bm.boolean_for(GameCanvas.var_int_byte, var_int_arr_case[27])) {
                    fb2.cfr_renamed_0(graphics2);
                    if (" ".length() > (0xA4 ^ 0xA0)) {
                        return;
                    }
                } else {
                    fb2.cfr_renamed_0(graphics2, var_int_arr_case[1]);
                }
            }
            if (bm.boolean_for(GameCanvas.cfr_renamed_16)) {
                graphics2 = graphics;
                object = this;
                if (!bm.boolean_do(object.cfr_renamed_10, var_int_arr_case[2]) || !bm.boolean_for(a_0.coTrangThai ? 1 : 0) || bm.boolean_int(object.dangChayAuto ? 1 : 0)) {
                    if (" ".length() == 0) {
                        return;
                    }
                } else {
                    if ((object.cfr_renamed_33 == var_int_arr_case[6])) {
                        object.var_eq_0_int.soLuong += var_int_arr_case[12];
                    }
                    if ((object.cfr_renamed_33 == var_int_arr_case[24])) {
                        object.var_eq_0_int.soLuong -= var_int_arr_case[12];
                        object.cfr_renamed_33 = var_int_arr_case[1];
                    }
                    object.cfr_renamed_33 += var_int_arr_case[3];
                    int n = var_int_arr_case[1];
                    if (bm.boolean_for(object.var_int_arr_new[object.cfr_renamed_10])) {
                        n = var_int_arr_case[5] * (GameCanvas.cfr_renamed_16 + var_int_arr_case[3]);
                    }
                    if (bm.boolean_do((int)object.var_fb_if.var_byte_if, var_int_arr_case[2])) {
                        n = var_int_arr_case[23];
                    }
                    if ((object.var_fb_arr_do[object.cfr_renamed_10] != null)) {
                        fw.cfr_renamed_0().var_ep_do.cfr_renamed_0(var_int_arr_case[1], object.cfr_renamed_28 - a_0.var_int_int / var_int_arr_case[12] + object.cfr_renamed_10 * cfr_renamed_24 + fw.cfr_renamed_0().var_ep_do.cfr_renamed_3 / var_int_arr_case[12], object.var_eq_0_for.soLuong - a_0.var_int_byte / var_int_arr_case[12] - var_int_arr_case[6] - n, var_int_arr_case[1], var_int_arr_case[28], graphics2);
                    }
                }
            }
            if (bm.boolean_for(this.dangChayAuto ? 1 : 0)) {
                int n = a_0.int_do(this.cfr_renamed_39);
                graphics.drawImage(a_0.var_javax_microedition_lcdui_Image_do, bm.var_eq_0_arr_if[a_0.mangSoNguyen[n]].var_int_if, bm.var_eq_0_arr_if[a_0.mangSoNguyen[n]].soLuong - var_int_arr_case[24], var_int_arr_case[4]);
            }
        }
        a_0.cfr_renamed_4(graphics);
    }

            /*
     * Unable to fully structure code
     */
    private void cfr_renamed_14() {
        this.cfr_renamed_31 = bm.var_int_arr_case[4];
        var1_1 = this;
        var2_2 = bm.var_int_arr_case[1];
        if ((72 + 90 - 158 + 157 ^ 55 + 0 - 38 + 148) != 0) ** GOTO lbl40
        return;
        block0: while (bm.boolean_for((int)var1_1.boolean_new(var1_1.var_fb_arr_do[var2_2].var_byte_do))) {
            var3_3 = new int[bm.var_int_arr_case[14]];
            var4_5 = bm.var_int_arr_case[1];
            if (" ".length() != 0) ** GOTO lbl17
            return;
lbl-1000:
            // 1 sources

            {
                var3_3[var4_5] = bm.var_int_arr_case[2];
                ++var4_5;
lbl17:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var4_5, (int)bm.var_int_arr_case[14]))
            }
lbl18:
            // 1 sources

            var4_5 = bm.var_int_arr_case[1];
            if ("   ".length() == "   ".length()) ** GOTO lbl26
            return;
            while (bm.boolean_for(var1_1.var_fb_arr_do[var2_2 + var4_5].var_byte_do)) {
                block21: {
                    var3_3[var4_5] = var1_1.var_fb_arr_do[var2_2 + var4_5].var_byte_if;
                    ++var4_5;
lbl26:
                    // 2 sources

                    if (!(var4_5 >= bm.var_int_arr_case[4])) continue;
                    if (bm.boolean_for((int)(var3_3 == null)) && !bm.boolean_int((int)bm.boolean_do(var3_3))) break block21;
                    var1_1.cfr_renamed_31 += bm.var_int_arr_case[3];
                    var4_5 = bm.var_int_arr_case[1];
                    if ("  ".length() != 0) ** GOTO lbl36
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var1_1.var_fb_arr_do[var2_2 + var4_5].var_byte_do = (byte)var1_1.cfr_renamed_31;
                        ++var4_5;
lbl36:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var4_5, (int)bm.var_int_arr_case[4]))
                    }
lbl37:
                    // 1 sources

                    var2_2 += 2;
                }
                ++var2_2;
lbl40:
                // 2 sources

                if (!(var2_2 >= bm.var_int_arr_case[24])) continue block0;
            }
            break block0;
        }
        var5_9 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl117
        return;
lbl-1000:
        // 1 sources

        {
            block22: {
                block25: {
                    block24: {
                        block23: {
                            if (!bm.boolean_for((int)this.boolean_new(this.var_fb_arr_do[var5_9].var_byte_do)) || !bm.boolean_for(this.var_fb_arr_do[var5_9].var_byte_do) || !bm.boolean_do((int)this.var_fb_arr_do[var5_9].var_byte_if, bm.var_int_arr_case[2])) break block22;
                            var6_10 = var5_9;
                            var1_1 = this;
                            if (bm.boolean_for(var1_1.var_fb_arr_do[var6_10].var_byte_do) && !(var1_1.var_fb_arr_do[var6_10].var_byte_if == bm.var_int_arr_case[2])) break block23;
                            break block22;
                        }
                        var2_2 = bm.var_int_arr_case[1];
                        var3_4 = bm.var_int_arr_case[1];
                        if (!bm.boolean_do(var6_10) || !bm.boolean_int(var1_1.var_fb_arr_do[var6_10 - bm.var_int_arr_case[3]].var_byte_do) || !bm.boolean_do((int)var1_1.var_fb_arr_do[var6_10 - bm.var_int_arr_case[3]].var_byte_if, bm.var_int_arr_case[2])) break block24;
                        var4_7 = new int[bm.var_int_arr_case[5]];
                        var7_11 = bm.var_int_arr_case[1];
                        if (((224 ^ 171) & ~(121 ^ 50)) != -" ".length()) ** GOTO lbl75
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((var1_1.var_fb_arr_do[var7_11].var_byte_do == var1_1.var_fb_arr_do[var6_10 - bm.var_int_arr_case[3]].var_byte_do)) {
                                var4_7[var7_11] = var1_1.var_fb_arr_do[var7_11].var_byte_if;
                                var2_2 += var4_7[var7_11] / bm.var_int_arr_case[6] + bm.var_int_arr_case[3];
                                if (" ".length() > " ".length()) {
                                    return;
                                }
                            } else {
                                var4_7[var7_11] = bm.var_int_arr_case[2];
                            }
                            ++var7_11;
lbl75:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var7_11, (int)bm.var_int_arr_case[5]))
                        }
lbl76:
                        // 1 sources

                        v0 = bm.int_arr_do(var4_7);
                        var4_7 = v0;
                        v0[bm.var_int_arr_case[22]] = var1_1.var_fb_arr_do[var6_10].var_byte_if;
                        if (bm.boolean_for((int)(var4_7 = bm.int_arr_do(var4_7) == null)) && bm.boolean_for((int)bm.boolean_do(var4_7))) {
                            var2_2 = bm.var_int_arr_case[1];
                        }
                    }
                    if (!bm.boolean_int(var6_10, bm.var_int_arr_case[22]) || bm.boolean_int(var6_10) && (!bm.boolean_int(var6_10) || !bm.boolean_do((int)var1_1.var_fb_arr_do[var6_10 + bm.var_int_arr_case[3]].var_byte_do, (int)var1_1.var_fb_arr_do[var6_10 - bm.var_int_arr_case[3]].var_byte_do)) || !bm.boolean_int(var1_1.var_fb_arr_do[var6_10 + bm.var_int_arr_case[3]].var_byte_do) || !bm.boolean_do((int)var1_1.var_fb_arr_do[var6_10 + bm.var_int_arr_case[3]].var_byte_if, bm.var_int_arr_case[2])) break block25;
                    var4_8 = new int[bm.var_int_arr_case[5]];
                    var7_11 = bm.var_int_arr_case[1];
                    if ("  ".length() <= (144 ^ 148)) ** GOTO lbl99
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((var1_1.var_fb_arr_do[var7_11].var_byte_do == var1_1.var_fb_arr_do[var6_10 + bm.var_int_arr_case[3]].var_byte_do)) {
                            var4_8[var7_11] = var1_1.var_fb_arr_do[var7_11].var_byte_if;
                            var3_4 += var4_8[var7_11] / bm.var_int_arr_case[6] + bm.var_int_arr_case[3];
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        } else {
                            var4_8[var7_11] = bm.var_int_arr_case[2];
                        }
                        ++var7_11;
lbl99:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var7_11, (int)bm.var_int_arr_case[5]))
                    }
lbl100:
                    // 1 sources

                    v1 = bm.int_arr_do(var4_8);
                    var4_8 = v1;
                    v1[bm.var_int_arr_case[22]] = var1_1.var_fb_arr_do[var6_10].var_byte_if;
                    if (bm.boolean_for((int)(var4_8 = bm.int_arr_do(var4_8) == null)) && bm.boolean_for((int)bm.boolean_do(var4_8))) {
                        var3_4 = bm.var_int_arr_case[1];
                    }
                }
                if (bm.boolean_int(var2_2, var3_4)) {
                    var1_1.var_fb_arr_do[var6_10].var_byte_do = var1_1.var_fb_arr_do[var6_10 + bm.var_int_arr_case[3]].var_byte_do;
                    } else if (bm.boolean_do(var2_2)) {
                    var1_1.var_fb_arr_do[var6_10].var_byte_do = var1_1.var_fb_arr_do[var6_10 - bm.var_int_arr_case[3]].var_byte_do;
                }
            }
            ++var5_9;
lbl117:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_9, (int)bm.var_int_arr_case[5]))
        }
lbl118:
        // 1 sources

        var1_1 = this;
        if ((var1_1.cfr_renamed_23 + (var1_1.cfr_renamed_31 - bm.var_int_arr_case[4]) == bm.var_int_arr_case[4])) {
            var1_1.var_ei_new = var1_1.var_ei_case;
        }
    }

    private static boolean boolean_if(int n, int n2) {
        return n <= n2;
    }

    private void cfr_renamed_23() {
        this.var_ei_new = a_0.var_ei_if;
        this.var_ei_try = null;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do() {
        this.cfr_renamed_36();
        super.void_do();
        this.cfr_renamed_34();
        var1_1 = bm.var_int_arr_case[1];
        var2_3 = bm.var_int_arr_case[2];
        var3_4 = bm.var_int_arr_case[1];
        if ("  ".length() > 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            if (bm.boolean_for(this.var_int_arr_new[var3_4])) {
                ++var1_1;
                var2_3 = var3_4;
            }
            ++var3_4;
lbl15:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var3_4, (int)bm.var_int_arr_case[5]))
        }
lbl16:
        // 1 sources

        if (bm.boolean_for(var1_1, bm.var_int_arr_case[3])) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.W);
            return;
        }
        if ((var2_3 == bm.var_int_arr_case[2])) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.i);
            return;
        }
        var3_4 = var2_3;
        var1_2 = this;
        if (bm.boolean_int(var1_2.var_fb_arr_do[var3_4].var_byte_do) && bm.boolean_for((int)var1_2.boolean_if(var3_4))) {
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.g);
            v0 = bm.var_int_arr_case[1];
            if (-" ".length() >= 0) {
                return;
            }
        } else {
            v0 = bm.var_int_arr_case[3];
        }
        if (bm.boolean_for(v0)) {
            return;
        }
        this.cfr_renamed_20();
        a_0.cfr_renamed_13();
        cd_0.cd_0_do().cfr_renamed_3(this.var_fb_arr_do[var2_3].var_byte_if);
    }

    public final void (byte by2, byte by3, int n, int n2, Vector vector != null) {
        super.cfr_renamed_0(by2, by3, n, n2, vector);
        AngelChip.duLieuNguoiChoi.var_boolean_int = var_int_arr_case[1];
        a_0.cfr_renamed_5 = var_int_arr_case[1];
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_24() {
        var1_1 = bm.var_int_arr_case[1];
        if (((1 + 28 - -141 + 37 ^ 51 + 22 - -14 + 108) & (92 ^ 23 ^ (239 ^ 168) ^ -" ".length())) != -" ".length()) ** GOTO lbl11
        return;
lbl-1000:
        // 1 sources

        {
            this.var_fb_arr_do[var1_1] = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
            this.var_int_arr_new[var1_1] = bm.var_int_arr_case[2];
            if (bm.boolean_int(var1_1, bm.var_int_arr_case[4])) {
                this.var_fb_arr_if[var1_1] = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
            }
            ++var1_1;
lbl11:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)bm.var_int_arr_case[5]))
        }
lbl12:
        // 1 sources

        this.var_fb_arr_arr_do = new fb[bm.var_int_arr_case[6]][bm.var_int_arr_case[6]];
        this.cfr_renamed_10 = bm.var_int_arr_case[1];
        this.var_int_if = bm.var_int_arr_case[2];
        this.var_eq_0_if = new eq_0();
        this.var_eq_0_if.var_int_if = this.var_eq_0_for.var_int_if;
        this.var_eq_0_if.soLuong = this.var_eq_0_for.soLuong;
        this.cfr_renamed_10 = bm.var_int_arr_case[1];
        var1_1 = bm.var_int_arr_case[1];
        if ((105 ^ 87 ^ (251 ^ 193)) > 0) ** GOTO lbl50
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = bm.var_int_arr_case[1];
            if (-" ".length() <= 0) ** GOTO lbl32
            return;
lbl-1000:
            // 1 sources

            {
                if (bm.boolean_int(var2_2, bm.var_int_arr_case[4])) {
                    this.var_int_arr_arr_do[var1_1][var2_2] = bm.var_int_arr_case[2];
                }
                ++var2_2;
lbl32:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[6]))
            }
lbl33:
            // 1 sources

            var2_2 = bm.var_int_arr_case[1];
            if (-" ".length() == -" ".length()) ** GOTO lbl42
            return;
lbl-1000:
            // 1 sources

            {
                this.var_int_arr_arr_if[var1_1][var2_2] = bm.var_int_arr_case[2];
                if (bm.boolean_int(var2_2, bm.var_int_arr_case[7])) {
                    this.var_int_arr_arr_for[var1_1][var2_2] = bm.var_int_arr_case[2];
                }
                ++var2_2;
lbl42:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[0]))
            }
lbl43:
            // 1 sources

            this.var_int_arr_for[var1_1] = bm.var_int_arr_case[2];
            this.var_int_arr_byte[var1_1] = bm.var_int_arr_case[1];
            this.var_int_arr_int[var1_1] = bm.var_int_arr_case[1];
            this.var_int_arr_if[var1_1] = bm.var_int_arr_case[1];
            this.var_byte_arr_if[var1_1] = bm.var_int_arr_case[1];
            this.var_byte_arr_do[var1_1] = bm.var_int_arr_case[1];
            ++var1_1;
lbl50:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)bm.var_int_arr_case[6]))
        }
lbl51:
        // 1 sources

        this.cfr_renamed_23 = bm.var_int_arr_case[1];
        this.cfr_renamed_31 = bm.var_int_arr_case[4];
        this.var_fb_if = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
        this.cfr_renamed_9 = bm.var_int_arr_case[2];
        this.cfr_renamed_36 = bm.var_int_arr_case[3];
        this.dangChayAuto = bm.var_int_arr_case[1];
        this.cfr_renamed_21 = bm.var_int_arr_case[2];
        this.var_boolean_char = bm.var_int_arr_case[1];
        this.cfr_renamed_18 = bm.var_int_arr_case[1];
        this.cfr_renamed_27 = bm.var_int_arr_case[8];
        this.var_boolean_case = bm.var_int_arr_case[1];
        this.cfr_renamed_39 = bm.var_int_arr_case[2];
        this.var_boolean_byte = bm.var_int_arr_case[1];
        this.cfr_renamed_11 = bm.var_int_arr_case[1];
        this.var_eq_0_do = new eq_0(GameCanvas.var_int_int, GameCanvas.var_int_long, bm.var_int_arr_case[4]);
        this.var_fb_int = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
        this.var_fb_for = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
    }

    private void cfr_renamed_25() {
        this.cfr_renamed_36();
        this.cfr_renamed_34();
        this.cfr_renamed_20();
        a_0.cfr_renamed_13();
        cd_0 cd_02 = cd_0.cd_0_do();
        try {
            cd_02.cfr_renamed_4(var_int_arr_case[36]);
            }
        catch (Exception exception) {
            }
        if (-" ".length() >= 0) {
            return;
        }
        cd_02.cfr_renamed_1();
    }

    public final void (Graphics graphics != null) {
        this.cfr_renamed_1(graphics);
        super.cfr_renamed_0(graphics);
    }

    public static bm bm_do() {
        if ((var_bm_do == null)) {
            var_bm_do = new bm();
        }
        return var_bm_do;
    }

    private static void cfr_renamed_27() {
        var_int_arr_case = new int[37];
        bm.var_int_arr_case[0] = 0x62 ^ 0x54 ^ (0xE ^ 0x34);
        bm.var_int_arr_case[1] = (0x52 ^ 0x5F) & ~(0x89 ^ 0x84);
        bm.var_int_arr_case[2] = -" ".length();
        bm.var_int_arr_case[3] = " ".length();
        bm.var_int_arr_case[4] = "   ".length();
        bm.var_int_arr_case[5] = 0x6B ^ 0x25 ^ (0x85 ^ 0xC1);
        bm.var_int_arr_case[6] = 158 + 50 - 46 + 20 ^ 95 + 81 - 52 + 54;
        bm.var_int_arr_case[7] = 0x5F ^ 0x54;
        bm.var_int_arr_case[8] = -"  ".length();
        bm.var_int_arr_case[9] = 44 + 52 - -7 + 32 ^ 79 + 130 - 87 + 34;
        bm.var_int_arr_case[10] = (0x5F ^ 0x58) + (130 + 3 - 103 + 120) - (0x54 ^ 0x47) + (0x65 ^ 0x5B);
        bm.var_int_arr_case[11] = 0xBD ^ 0x9D ^ (0x5F ^ 0x67);
        bm.var_int_arr_case[12] = "  ".length();
        bm.var_int_arr_case[13] = 0x81 ^ 0x84;
        bm.var_int_arr_case[14] = 0x43 ^ 0x45;
        bm.var_int_arr_case[15] = 0xFFFFFEFD & 0x73BFA;
        bm.var_int_arr_case[16] = -(0xFFFF9F3F & 0x79C3) & (0xFFFFFDFF & 0x7FFFA);
        bm.var_int_arr_case[17] = -(0xFFFFA727 & 0x5CF9) & (0xFFFFFFBF & 0x7FC7E);
        bm.var_int_arr_case[18] = 0xDA ^ 0xC4;
        bm.var_int_arr_case[19] = 74 + 94 - 93 + 65 ^ 58 + 7 - -17 + 65;
        bm.var_int_arr_case[20] = 23 + 62 - 34 + 115 ^ 44 + 15 - 5 + 80;
        bm.var_int_arr_case[21] = 0x60 ^ 0x74;
        bm.var_int_arr_case[22] = 0x7E ^ 0x77;
        bm.var_int_arr_case[23] = -(64 + 109 - 73 + 36 ^ 24 + 67 - 71 + 110);
        bm.var_int_arr_case[24] = 0xC3 ^ 0xBE ^ (0xC8 ^ 0xBD);
        bm.var_int_arr_case[25] = (0x29 ^ 0x67) + (0x4C ^ 2) - (0x67 ^ 0x71) + (0x59 ^ 0x43);
        bm.var_int_arr_case[26] = 0x2E ^ 0x1C;
        bm.var_int_arr_case[27] = (0xEF ^ 0xBB) + (0xCE ^ 0x8D) - (0xE ^ 2) + (0x45 ^ 0x60);
        bm.var_int_arr_case[28] = 0xA1 ^ 0x80;
        bm.var_int_arr_case[29] = 0x1A ^ 0x17;
        bm.var_int_arr_case[30] = 0xA7 ^ 0xA9;
        bm.var_int_arr_case[31] = -(0x55 ^ 0x52 ^ "  ".length());
        bm.var_int_arr_case[32] = 122 + 92 - 110 + 24 ^ 103 + 95 - 33 + 3;
        bm.var_int_arr_case[33] = 0xAE ^ 0xB8;
        bm.var_int_arr_case[34] = 0xC6 ^ 0x9C ^ (0x39 ^ 0x64);
        bm.var_int_arr_case[35] = 0xFFFFABF8 & 0x57EF;
        bm.var_int_arr_case[36] = 116 + 1 - 93 + 115 ^ 139 + 111 - 117 + 47;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int int_do(fb[] fbArray) {
        int n = var_int_arr_case[1];
        while (!(n >= fbArray.length)) {
            if ((fbArray[n] == null)) {
                return n;
            }
            ++n;
        }
        return var_int_arr_case[2];
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_26() {
        block23: {
            block22: {
                block24: {
                    var1_1 = bm.var_int_arr_case[2];
                    var2_4 = bm.var_int_arr_case[1];
                    if (null == null) ** GOTO lbl10
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((this.var_fb_if.var_byte_do == this.var_fb_arr_if[var2_4].var_byte_do)) {
                            var1_1 = this.var_fb_arr_if[var2_4].var_byte_if;
                        }
                        ++var2_4;
lbl10:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var2_4, (int)bm.var_int_arr_case[4]))
                    }
lbl11:
                    // 1 sources

                    this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_if;
                    if (bm.boolean_do(var1_1, bm.var_int_arr_case[2])) {
                        if (bm.boolean_for((int)this.boolean_if(this.cfr_renamed_10))) {
                            this.var_fb_if = this.var_fb_arr_do[this.cfr_renamed_10];
                            this.cfr_renamed_12(this.cfr_renamed_10);
                            this.cfr_renamed_34();
                            return;
                        }
                        this.cfr_renamed_12(this.cfr_renamed_10);
                    }
                    if (bm.boolean_int(this.var_fb_if.var_byte_do) && (bm.boolean_do(this.cfr_renamed_10) && !bm.boolean_do((int)this.var_fb_arr_do[this.cfr_renamed_10 - bm.var_int_arr_case[3]].var_byte_do, (int)this.var_fb_if.var_byte_do) || bm.boolean_int(this.cfr_renamed_10, bm.var_int_arr_case[22]) && (this.var_fb_arr_do[this.cfr_renamed_10 + bm.var_int_arr_case[3]].var_byte_do == this.var_fb_if.var_byte_do))) {
                        this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_if;
                        this.var_fb_if = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
                        return;
                    }
                    if (bm.boolean_do(var1_1, bm.var_int_arr_case[2]) && !bm.boolean_for(this.var_fb_if.var_byte_do)) break block23;
                    if (!bm.boolean_int(this.cfr_renamed_10, bm.var_int_arr_case[22])) break block24;
                    var2_4 = bm.var_int_arr_case[1];
                    if ((32 ^ 46 ^ (142 ^ 132)) != ((187 ^ 167 ^ (87 ^ 94)) & (0 ^ 41 ^ (93 ^ 97) ^ -" ".length()))) ** GOTO lbl62
                    return;
lbl-1000:
                    // 1 sources

                    {
                        block25: {
                            if (!bm.boolean_int(this.var_fb_arr_if[var2_4].var_byte_do) || !(this.var_fb_arr_do[this.cfr_renamed_10 + bm.var_int_arr_case[3]].var_byte_do == this.var_fb_arr_if[var2_4].var_byte_do)) break block25;
                            var1_2 = new int[bm.var_int_arr_case[5]];
                            var3_5 = bm.var_int_arr_case[1];
                            var4_6 = bm.var_int_arr_case[1];
                            if (-(136 + 15 - 122 + 132 ^ 90 + 16 - 54 + 113) <= 0) ** GOTO lbl50
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((this.var_fb_arr_do[var4_6].var_byte_do == this.var_fb_arr_if[var2_4].var_byte_do)) {
                                    var1_2[var4_6] = this.var_fb_arr_do[var4_6].var_byte_if;
                                    if (((208 ^ 149) & ~(56 ^ 125)) != 0) {
                                        return;
                                    }
                                } else {
                                    var1_2[var4_6] = bm.var_int_arr_case[2];
                                    if (bm.boolean_for(var3_5)) {
                                        var3_5 = bm.var_int_arr_case[3];
                                        var1_2[var4_6] = this.var_fb_if.var_byte_if;
                                    }
                                }
                                ++var4_6;
lbl50:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var4_6, (int)bm.var_int_arr_case[5]))
                            }
lbl51:
                            // 1 sources

                            if (!bm.boolean_for((int)bm.boolean_do(var1_2 = bm.int_arr_do(var1_2))) || bm.boolean_int((int)(var1_2 == null))) {
                                this.cfr_renamed_27 = this.var_fb_if.var_byte_do;
                                this.var_fb_if.var_byte_do = this.var_fb_arr_if[var2_4].var_byte_do;
                                this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_if;
                                if (bm.boolean_do(this.cfr_renamed_9, this.cfr_renamed_10)) {
                                    this.cfr_renamed_0(this.var_fb_arr_if[var2_4], (int)this.var_fb_arr_if[var2_4].var_byte_if);
                                }
                                return;
                            }
                            this.cfr_renamed_34();
                            return;
                        }
                        ++var2_4;
lbl62:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var2_4, (int)bm.var_int_arr_case[4]))
                    }
                }
                var1_3 = this;
                var2_4 = bm.var_int_arr_case[1];
                if ("  ".length() == "  ".length()) ** GOTO lbl85
                return;
lbl-1000:
                // 1 sources

                {
                    if ((var1_3.var_fb_arr_do[var2_4].var_byte_if == bm.var_int_arr_case[2])) {
                        v0 = var2_4;
                        if ("  ".length() < ((53 ^ 49) & ~(136 ^ 140))) {
                            return;
                        }
                        break block22;
                    }
                    if (bm.boolean_int((int)var1_3.boolean_new(var1_3.var_fb_arr_do[var2_4].var_byte_do))) {
                        v0 = var2_4;
                        break block22;
                    }
                    ++var2_4;
lbl85:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var2_4, (int)bm.var_int_arr_case[5]))
                }
lbl86:
                // 1 sources

                v0 = bm.var_int_arr_case[2];
            }
            if ((this.cfr_renamed_10 >= var2_4 = v0) && bm.boolean_do(var2_4, bm.var_int_arr_case[2])) {
                this.cfr_renamed_34();
                return;
            }
            this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_if;
            this.var_fb_if = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
            if (bm.boolean_do(this.cfr_renamed_9, this.cfr_renamed_10)) {
                this.var_fb_arr_do[this.cfr_renamed_10].var_byte_do = (byte)bm.var_int_arr_case[1];
                this.cfr_renamed_21();
                this.cfr_renamed_14();
            }
            return;
        }
        if (bm.boolean_do(var1_1, bm.var_int_arr_case[2])) {
            this.cfr_renamed_27 = bm.var_int_arr_case[2];
            if (bm.boolean_do(this.cfr_renamed_9, this.cfr_renamed_10)) {
                this.cfr_renamed_0(this.var_fb_if, var1_1);
            }
        }
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    public final void void_try(int var1_1) {
        block5: {
            this.cfr_renamed_36();
            var2_2 = this;
            var3_4 = bm.var_int_arr_case[1];
            if ((101 + 124 - 215 + 131 ^ 35 + 93 - 9 + 18) >= " ".length()) ** GOTO lbl32
            return;
lbl-1000:
            // 1 sources

            {
                block6: {
                    if ((var2_2.var_fb_arr_do[var3_4].var_byte_if == bm.var_int_arr_case[2])) {
                        v0 = var3_4;
                        if (" ".length() == 0) {
                            return;
                        }
                        break block5;
                    }
                    if (!bm.boolean_int((int)var2_2.boolean_new(var2_2.var_fb_arr_do[var3_4].var_byte_do))) break block6;
                    var4_5 = bm.var_int_arr_case[22];
                    if ("   ".length() >= ((55 ^ 18 ^ (108 ^ 9)) & (72 ^ 118 ^ (240 ^ 142) ^ -" ".length()))) ** GOTO lbl23
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var2_2.var_fb_arr_do[var4_5] = var2_2.var_fb_arr_do[var4_5 - bm.var_int_arr_case[3]];
                        --var4_5;
lbl23:
                        // 2 sources

                        ** while (!bm.boolean_if((int)var4_5, (int)var3_4))
                    }
lbl24:
                    // 1 sources

                    v0 = var3_4;
                    if (((56 + 66 - 86 + 101 ^ 126 + 62 - 166 + 140) & (192 + 226 - 310 + 124 ^ 80 + 182 - 139 + 72 ^ -" ".length())) >= (123 + 24 - 68 + 86 ^ 87 + 26 - 38 + 86)) {
                        return;
                    }
                    break block5;
                }
                ++var3_4;
lbl32:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var3_4, (int)bm.var_int_arr_case[5]))
            }
lbl33:
            // 1 sources

            v0 = bm.var_int_arr_case[2];
        }
        this.cfr_renamed_25 = var2_3 = v0;
        this.var_boolean_byte = bm.var_int_arr_case[3];
        this.var_fb_int = new fb((byte)var1_1, bm.var_int_arr_case[3]);
    }

    /*
     * Unable to fully structure code
     */
    private void (fb var1_1 != int var2_4) {
        block26: {
            block22: {
                block23: {
                    this.cfr_renamed_36();
                    this.var_boolean_case = bm.var_int_arr_case[3];
                    var3_5 = new int[bm.var_int_arr_case[13]];
                    var4_6 = bm.var_int_arr_case[1];
                    if ((164 ^ 161) > 0) ** GOTO lbl11
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_5[var4_6] = bm.var_int_arr_case[2];
                        ++var4_6;
lbl11:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var4_6, (int)bm.var_int_arr_case[13]))
                    }
lbl12:
                    // 1 sources

                    var4_7 = new int[bm.var_int_arr_case[14]];
                    var5_8 = bm.var_int_arr_case[1];
                    if (" ".length() != "  ".length()) ** GOTO lbl20
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_7[var5_8] = bm.var_int_arr_case[2];
                        ++var5_8;
lbl20:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var5_8, (int)bm.var_int_arr_case[14]))
                    }
lbl21:
                    // 1 sources

                    var5_8 = bm.var_int_arr_case[1];
                    var6_9 = bm.var_int_arr_case[1];
                    if (((115 ^ 5 ^ (2 ^ 40)) & (66 ^ 28 ^ "  ".length() ^ -" ".length())) < " ".length()) ** GOTO lbl31
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((this.var_fb_arr_do[var6_9].var_byte_do == var1_1.var_byte_do)) {
                            var4_7[var5_8] = this.var_fb_arr_do[var6_9].var_byte_if;
                            ++var5_8;
                        }
                        ++var6_9;
lbl31:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var6_9, (int)bm.var_int_arr_case[5]))
                    }
lbl32:
                    // 1 sources

                    if (!bm.boolean_do(var4_7[bm.var_int_arr_case[13]], bm.var_int_arr_case[2])) break block22;
                    bm.int_arr_do(var4_7);
                    var6_9 = bm.var_int_arr_case[1];
                    var5_8 = bm.var_int_arr_case[1];
                    if (null == null) ** GOTO lbl46
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((var4_7[var5_8] == var2_4)) {
                            var6_9 = var5_8;
                        }
                        ++var5_8;
lbl46:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var5_8, (int)var4_7.length))
                    }
lbl47:
                    // 1 sources

                    var5_8 = bm.var_int_arr_case[1];
                    if (!bm.boolean_int(var6_9, bm.var_int_arr_case[4])) break block23;
                    var1_2 = bm.var_int_arr_case[1];
                    if ((169 ^ 173) >= 0) ** GOTO lbl85
                    return;
lbl-1000:
                    // 1 sources

                    {
                        block25: {
                            block24: {
                                if (!bm.boolean_for(var1_2, bm.var_int_arr_case[12])) break block24;
                                var6_9 = bm.var_int_arr_case[1];
                                if (" ".length() > 0) ** GOTO lbl63
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    if ((var4_7[var1_2] == this.var_fb_arr_do[var6_9].var_byte_if)) {
                                        this.var_fb_arr_do[var6_9].var_byte_do = (byte)bm.var_int_arr_case[1];
                                    }
                                    ++var6_9;
lbl63:
                                    // 2 sources

                                    ** while (!bm.cfr_renamed_5((int)var6_9, (int)bm.var_int_arr_case[5]))
                                }
lbl64:
                                // 1 sources

                                if ((60 ^ 71 ^ (28 ^ 98)) == 0) {
                                    return;
                                }
                                break block25;
                            }
                            var3_5[var5_8] = var4_7[var1_2];
                            ++var5_8;
                            var6_9 = bm.var_int_arr_case[1];
                            if ("  ".length() >= -" ".length()) ** GOTO lbl82
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((var4_7[var1_2] == this.var_fb_arr_do[var6_9].var_byte_if)) {
                                    var7_10 = this.var_fb_arr_do[var6_9];
                                    this.cfr_renamed_11(var6_9);
                                    this.var_fb_arr_do[this.int_do()] = var7_10;
                                }
                                ++var6_9;
lbl82:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var6_9, (int)bm.var_int_arr_case[5]))
                            }
                        }
                        ++var1_2;
lbl85:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var1_2, (int)var4_7.length))
                    }
lbl86:
                    // 1 sources

                    if ("   ".length() < 0) {
                        return;
                    }
                    break block26;
                }
                var1_3 = bm.var_int_arr_case[1];
                if (((30 ^ 89 ^ (23 ^ 75)) & (131 ^ 147 ^ (144 ^ 155) ^ -" ".length())) == 0) ** GOTO lbl128
                return;
lbl-1000:
                // 1 sources

                {
                    block28: {
                        block27: {
                            if (!bm.boolean_int(var1_3, bm.var_int_arr_case[4])) break block27;
                            var6_9 = bm.var_int_arr_case[1];
                            if ((("  ".length() ^ (170 ^ 140)) & (190 ^ 178 ^ (172 ^ 132) ^ -" ".length())) <= 0) ** GOTO lbl106
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((var4_7[var1_3] == this.var_fb_arr_do[var6_9].var_byte_if)) {
                                    this.var_fb_arr_do[var6_9].var_byte_do = (byte)bm.var_int_arr_case[1];
                                }
                                ++var6_9;
lbl106:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var6_9, (int)bm.var_int_arr_case[5]))
                            }
lbl107:
                            // 1 sources

                            break block28;
                        }
                        var3_5[var5_8] = var4_7[var1_3];
                        ++var5_8;
                        var6_9 = bm.var_int_arr_case[1];
                        if ("  ".length() <= "  ".length()) ** GOTO lbl125
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((var4_7[var1_3] == this.var_fb_arr_do[var6_9].var_byte_if)) {
                                var7_11 = this.var_fb_arr_do[var6_9];
                                this.cfr_renamed_11(var6_9);
                                this.var_fb_arr_do[this.int_do()] = var7_11;
                            }
                            ++var6_9;
lbl125:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var6_9, (int)bm.var_int_arr_case[5]))
                        }
                    }
                    ++var1_3;
lbl128:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var1_3, (int)var4_7.length))
                }
lbl129:
                // 1 sources

                if ((189 ^ 185) < 0) {
                    return;
                }
                break block26;
            }
            var6_9 = bm.var_int_arr_case[1];
            var5_8 = bm.var_int_arr_case[1];
            if (((44 ^ 76) & ~(85 ^ 53)) == 0) ** GOTO lbl145
            return;
lbl-1000:
            // 1 sources

            {
                if ((this.var_fb_arr_do[var5_8].var_byte_do == var1_1.var_byte_do)) {
                    var3_5[var6_9] = this.var_fb_arr_do[var5_8].var_byte_if;
                    ++var6_9;
                }
                ++var5_8;
lbl145:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var5_8, (int)bm.var_int_arr_case[5]))
            }
        }
        bm.int_arr_do(var3_5);
        cd_0.cd_0_do().cfr_renamed_0(var3_5, var2_4);
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_if(int var1_1) {
        block27: {
            block26: {
                block24: {
                    block25: {
                        var2_2 = bm.var_int_arr_case[2];
                        var3_3 = bm.var_int_arr_case[1];
                        if ("  ".length() < (179 ^ 183)) ** GOTO lbl14
                        return (boolean)((11 ^ 6) & ~(80 ^ 93));
lbl-1000:
                        // 1 sources

                        {
                            if (bm.boolean_int(this.var_fb_arr_if[var3_3].var_byte_do) && (this.var_fb_arr_if[var3_3].var_byte_do == this.var_fb_arr_do[var1_1].var_byte_do)) {
                                var2_2 = var3_3;
                                if ("  ".length() < "   ".length()) break;
                                return (boolean)((92 ^ 87 ^ (209 ^ 185)) & (80 ^ 28 ^ (21 ^ 58) ^ -" ".length()));
                            }
                            ++var3_3;
lbl14:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var3_3, (int)bm.var_int_arr_case[4]))
                        }
lbl15:
                        // 2 sources

                        if (!(var2_2 == bm.var_int_arr_case[2])) break block24;
                        if (!bm.boolean_int(this.var_fb_arr_do[var1_1].var_byte_do)) break block25;
                        var3_4 = new int[bm.var_int_arr_case[5]];
                        var4_6 = bm.var_int_arr_case[1];
                        if ("  ".length() >= " ".length()) ** GOTO lbl32
                        return (boolean)((175 ^ 139) & ~(80 ^ 116));
lbl-1000:
                        // 1 sources

                        {
                            if ((this.var_fb_arr_do[var4_6].var_byte_do == this.var_fb_arr_do[var1_1].var_byte_do) && (this.var_int_arr_new[var4_6] == bm.var_int_arr_case[2]) && bm.boolean_do(var4_6, var1_1)) {
                                var3_4[var4_6] = this.var_fb_arr_do[var4_6].var_byte_if;
                                if ("   ".length() != "   ".length()) {
                                    return (boolean)((25 ^ 125 ^ (198 ^ 194)) & (47 ^ 14 ^ (28 ^ 93) ^ -" ".length()));
                                }
                            } else {
                                var3_4[var4_6] = bm.var_int_arr_case[2];
                            }
                            ++var4_6;
lbl32:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var4_6, (int)bm.var_int_arr_case[5]))
                        }
lbl33:
                        // 1 sources

                        if (!bm.boolean_for((int)(var3_4 = bm.int_arr_do(var3_4) == null)) || !bm.boolean_for((int)bm.boolean_do(var3_4))) break block25;
                        var4_6 = bm.var_int_arr_case[1];
                        if (null == null) ** GOTO lbl42
                        return (boolean)((16 ^ 35 ^ (222 ^ 189)) & (106 + 106 - 202 + 134 ^ 153 + 36 - 69 + 72 ^ -" ".length()));
lbl-1000:
                        // 1 sources

                        {
                            if (bm.boolean_do(var4_6, var1_1) && (this.var_fb_arr_do[var4_6].var_byte_do == this.var_fb_arr_do[var1_1].var_byte_do)) {
                                this.var_fb_arr_do[var4_6].var_byte_do = (byte)bm.var_int_arr_case[1];
                            }
                            ++var4_6;
lbl42:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var4_6, (int)bm.var_int_arr_case[5]))
                        }
lbl43:
                        // 1 sources

                        this.var_fb_arr_do[var1_1].var_byte_do = (byte)bm.var_int_arr_case[1];
                    }
                    return bm.var_int_arr_case[3];
                }
                var3_5 = new int[bm.var_int_arr_case[5]];
                var4_7 = bm.var_int_arr_case[1];
                if ((91 ^ 94) > 0) ** GOTO lbl62
                return (boolean)((13 ^ 30) & ~(17 ^ 2));
lbl-1000:
                // 1 sources

                {
                    if ((this.var_fb_arr_do[var4_7].var_byte_do == this.var_fb_arr_if[var2_2].var_byte_do) && (this.var_int_arr_new[var4_7] == bm.var_int_arr_case[2]) && bm.boolean_do(var4_7, var1_1)) {
                        var3_5[var4_7] = this.var_fb_arr_do[var4_7].var_byte_if;
                        if (" ".length() <= -" ".length()) {
                            return (boolean)((45 ^ 108) & ~(73 ^ 8));
                        }
                    } else {
                        var3_5[var4_7] = bm.var_int_arr_case[2];
                    }
                    ++var4_7;
lbl62:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var4_7, (int)bm.var_int_arr_case[5]))
                }
lbl63:
                // 1 sources

                var3_5 = bm.int_arr_do(var3_5);
                var4_7 = bm.var_int_arr_case[2];
                var1_1 = bm.var_int_arr_case[1];
                var5_8 = bm.var_int_arr_case[1];
                if (((74 ^ 64) & ~(80 ^ 90)) == 0) ** GOTO lbl74
                return (boolean)((230 ^ 194) & ~(167 ^ 131));
lbl-1000:
                // 1 sources

                {
                    if ((var3_5[var5_8] == this.var_fb_arr_if[var2_2].var_byte_if)) {
                        var4_7 = var5_8;
                    }
                    ++var5_8;
lbl74:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var5_8, (int)bm.var_int_arr_case[5]))
                }
lbl75:
                // 1 sources

                var5_8 = bm.var_int_arr_case[1];
                if ("  ".length() >= -" ".length()) ** GOTO lbl83
                return (boolean)((57 ^ 38) & ~(48 ^ 47));
                while (bm.boolean_do(var3_5[var5_8 + bm.var_int_arr_case[3]], bm.var_int_arr_case[2]) && (!bm.boolean_do(var3_5[var5_8 + bm.var_int_arr_case[3]] / bm.var_int_arr_case[6], var3_5[var5_8] / bm.var_int_arr_case[6]) || (var3_5[var5_8 + bm.var_int_arr_case[3]] / bm.var_int_arr_case[6] - var3_5[var5_8] / bm.var_int_arr_case[6] == bm.var_int_arr_case[3]) && (var3_5[var5_8] % bm.var_int_arr_case[6] == var3_5[var5_8 + bm.var_int_arr_case[3]] % bm.var_int_arr_case[6]))) {
                    var1_1 = var5_8 + bm.var_int_arr_case[3];
                    ++var5_8;
lbl83:
                    // 2 sources

                    if (!(var5_8 >= bm.var_int_arr_case[22])) continue;
                }
                if (bm.boolean_for(var4_7, var1_1) && bm.boolean_for(var1_1, bm.var_int_arr_case[3])) {
                    return bm.var_int_arr_case[1];
                }
                if (!bm.boolean_for(var1_1, bm.var_int_arr_case[3])) break block26;
                var5_8 = var1_1 + bm.var_int_arr_case[3];
                if (((89 ^ 0 ^ (201 ^ 137)) & (111 ^ 56 ^ (252 ^ 178) ^ -" ".length())) == 0) ** GOTO lbl102
                return (boolean)((115 ^ 45 ^ (158 ^ 133)) & (122 + 49 - 53 + 106 ^ 100 + 109 - 204 + 160 ^ -" ".length()));
lbl-1000:
                // 1 sources

                {
                    var2_2 = bm.var_int_arr_case[1];
                    if (("  ".length() ^ (196 ^ 194)) >= 0) ** GOTO lbl100
                    return (boolean)((89 + 89 - 164 + 195 ^ 91 + 51 - -24 + 33) & (115 + 50 - 151 + 120 ^ 79 + 49 - 12 + 28 ^ -" ".length()));
lbl-1000:
                    // 1 sources

                    {
                        if ((var3_5[var5_8] == this.var_fb_arr_do[var2_2].var_byte_if)) {
                            this.var_fb_arr_do[var2_2].var_byte_do = (byte)bm.var_int_arr_case[1];
                        }
                        ++var2_2;
lbl100:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[5]))
                    }
lbl101:
                    // 1 sources

                    ++var5_8;
lbl102:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var5_8, (int)bm.var_int_arr_case[5]))
                }
lbl103:
                // 1 sources

                return bm.var_int_arr_case[3];
            }
            var5_9 = new int[bm.var_int_arr_case[4]];
            var2_2 = bm.var_int_arr_case[1];
            if (((87 ^ 122) & ~(25 ^ 52)) == ((152 ^ 180) & ~(232 ^ 196))) ** GOTO lbl113
            return (boolean)((70 ^ 105) & ~(94 ^ 113) & ~((222 ^ 197) & ~(173 ^ 182)));
lbl-1000:
            // 1 sources

            {
                var5_9[var2_2] = bm.var_int_arr_case[2];
                ++var2_2;
lbl113:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[4]))
            }
lbl114:
            // 1 sources

            var2_2 = bm.var_int_arr_case[1];
            if (" ".length() == " ".length()) ** GOTO lbl122
            return (boolean)((89 + 59 - 70 + 56 ^ 97 + 85 - 38 + 24) & (46 ^ 59 ^ (33 ^ 26) ^ -" ".length()));
lbl-1000:
            // 1 sources

            {
                var5_9[var2_2] = var3_5[var2_2];
                var3_5[var2_2] = bm.var_int_arr_case[2];
                ++var2_2;
lbl122:
                // 2 sources

                ** while (!bm.boolean_for((int)var2_2, (int)var1_1))
            }
lbl123:
            // 1 sources

            if (bm.boolean_for((int)(var3_5 = bm.int_arr_do(var3_5) == null)) && !bm.boolean_int((int)bm.boolean_do(var3_5))) break block27;
            var2_2 = bm.var_int_arr_case[1];
            if (-" ".length() < 0) ** GOTO lbl139
            return (boolean)((19 ^ 76 ^ (99 ^ 2)) & (26 ^ 49 ^ (210 ^ 199) ^ -" ".length()));
lbl-1000:
            // 1 sources

            {
                var1_1 = bm.var_int_arr_case[1];
                if ((134 + 132 - 151 + 34 ^ 6 + 42 - 7 + 104) != 0) ** GOTO lbl137
                return (boolean)((251 ^ 190 ^ (152 ^ 192)) & (150 + 76 - 191 + 148 ^ 122 + 97 - 133 + 84 ^ -" ".length()));
lbl-1000:
                // 1 sources

                {
                    if ((var5_9[var2_2] == this.var_fb_arr_do[var1_1].var_byte_if)) {
                        this.var_fb_arr_do[var1_1].var_byte_do = (byte)bm.var_int_arr_case[1];
                    }
                    ++var1_1;
lbl137:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var1_1, (int)bm.var_int_arr_case[5]))
                }
lbl138:
                // 1 sources

                ++var2_2;
lbl139:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[4]))
            }
lbl140:
            // 1 sources

            return bm.var_int_arr_case[3];
        }
        return bm.var_int_arr_case[1];
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_21() {
        var1_1 = bm.var_int_arr_case[1];
        var2_2 = bm.var_int_arr_case[1];
        if (((76 + 114 - 136 + 77 ^ 91 + 58 - 125 + 132) & (14 ^ 7 ^ (183 ^ 161) ^ -" ".length())) != " ".length()) ** GOTO lbl14
        return;
lbl-1000:
        // 1 sources

        {
            if (bm.boolean_int((int)this.boolean_new(this.var_fb_arr_do[var2_2].var_byte_do))) {
                return;
            }
            if (bm.boolean_int(this.var_fb_arr_do[var2_2].var_byte_do) && bm.boolean_do(var1_1, (int)this.var_fb_arr_do[var2_2].var_byte_do)) {
                var1_1 = this.var_fb_arr_do[var2_2].var_byte_do;
                this.cfr_renamed_31 -= bm.var_int_arr_case[3];
            }
            this.var_fb_arr_do[var2_2].var_byte_do = (byte)bm.var_int_arr_case[1];
            ++var2_2;
lbl14:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[5]))
        }
lbl15:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_8(int var1_1) {
        var2_2 = bm.var_int_arr_case[22];
        if ("  ".length() > 0) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_fb_arr_do[var2_2] = this.var_fb_arr_do[var2_2 - bm.var_int_arr_case[3]];
            --var2_2;
lbl8:
            // 2 sources

            ** while (!bm.boolean_if((int)var2_2, (int)var1_1))
        }
lbl9:
        // 1 sources

        this.cfr_renamed_12(var1_1);
    }

    /*
     * Unable to fully structure code
     */
    private void (boolean var1_1 != null) {
        if (bm.boolean_for((int)var1_1)) {
            var2_2 = this.int_do();
            if ((var2_2 == bm.var_int_arr_case[2])) {
                var2_2 = bm.var_int_arr_case[5];
            }
            if (bm.boolean_int((int)GameCanvas.coTrangThai) && bm.boolean_int((int)a_0.coKichHoat) && bm.boolean_int(var2_2) && bm.boolean_for(bm.cfr_renamed_24 = (GameCanvas.var_int_byte - a_0.var_int_int / bm.var_int_arr_case[12]) / var2_2, a_0.var_int_int / bm.var_int_arr_case[4] << bm.var_int_arr_case[3])) {
                bm.cfr_renamed_24 = a_0.var_int_int / bm.var_int_arr_case[4] << bm.var_int_arr_case[3];
            }
            if (bm.boolean_for(bm.soLuong = bm.cfr_renamed_24, a_0.var_int_int / bm.var_int_arr_case[6])) {
                bm.soLuong = a_0.var_int_int / bm.var_int_arr_case[6];
            }
            if (bm.boolean_int(GameCanvas.var_int_byte, bm.var_int_arr_case[25])) {
                bm.soLuong = bm.var_int_arr_case[5];
            }
            this.cfr_renamed_28 = (GameCanvas.var_int_byte - (bm.cfr_renamed_24 * var2_2 + (a_0.var_int_int - bm.cfr_renamed_24)) >> bm.var_int_arr_case[3]) + a_0.var_int_int / bm.var_int_arr_case[12];
            if (bm.boolean_int(this.cfr_renamed_28, a_0.var_int_int / bm.var_int_arr_case[12])) {
                this.cfr_renamed_28 = a_0.var_int_int / bm.var_int_arr_case[12];
            }
        }
        var2_2 = bm.var_int_arr_case[1];
        if (((195 ^ 152 ^ (244 ^ 136)) & (239 ^ 129 ^ (101 ^ 44) ^ -" ".length())) <= 0) ** GOTO lbl28
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = bm.var_int_arr_case[1];
            if (bm.boolean_for(this.var_int_arr_new[var2_2])) {
                var3_3 = bm.var_int_arr_case[5] * (GameCanvas.cfr_renamed_16 + bm.var_int_arr_case[3]);
            }
            this.var_fb_arr_do[var2_2].cfr_renamed_3 = this.cfr_renamed_28 + var2_2 * bm.cfr_renamed_24;
            this.var_fb_arr_do[var2_2].var_int_if = this.var_eq_0_for.soLuong - var3_3;
            if (bm.boolean_int((int)var1_1)) {
                this.var_fb_arr_do[var2_2].cfr_renamed_2 = this.var_fb_arr_do[var2_2].cfr_renamed_3;
                this.var_fb_arr_do[var2_2].cfr_renamed_5 = this.var_fb_arr_do[var2_2].var_int_if;
            }
            ++var2_2;
lbl28:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[5]))
        }
lbl29:
        // 1 sources

    }

    public final void (int n, int n2, int n3, byte by2 != null) {
        if ((n3 == var_int_arr_case[2])) {
            this.cfr_renamed_23();
            GameCanvas.cfr_renamed_1(MenuChinhAvatar.dc);
            return;
        }
        if (bm.cfr_renamed_2(n, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
            this.cfr_renamed_36();
        }
        this.cfr_renamed_20();
        a_0.soXu = GameCanvas.int_if();
        int n4 = a_0.int_do(n2);
        if ((n4 == var_int_arr_case[2])) {
            return;
        }
        this.var_eq_0_if.var_int_if = a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n4]].var_int_if;
        if (bm.cfr_renamed_2(n2, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
            this.var_eq_0_if.var_int_if = this.var_eq_0_for.var_int_if + ((a_0)this).cfr_renamed_10 * cfr_renamed_24;
        }
        if (bm.cfr_renamed_2(n, ((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)) {
            if (bm.boolean_do(bm.int_do(this.var_fb_arr_arr_do[a_0.var_byte_if]), var_int_arr_case[2]) && bm.boolean_if(bm.int_do(this.var_fb_arr_arr_do[a_0.var_byte_if]), var_int_arr_case[4])) {
                this.cfr_renamed_31();
            }
            this.cfr_renamed_21();
            this.cfr_renamed_14();
        }
        this.var_eq_0_if.soLuong = a_0.var_eq_0_arr_do[a_0.mangSoNguyen[n4]].soLuong;
        this.var_int_if = n3;
        ((a_0)this).cfr_renamed_18 = n;
        this.cfr_renamed_29 = n2;
        this.var_byte_arr_do[n4] = by2;
        this.cfr_renamed_10 = var_int_arr_case[3];
        int n5 = n4;
        this.var_int_arr_byte[n5] = this.var_int_arr_byte[n5] + var_int_arr_case[3];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void (boolean var1_1, int[] var2_2, boolean var3_3, int var4_4 != null) {
        block16: {
            var5_5 = a_0.int_do(var4_4);
            if (bm.boolean_for((int)var1_1)) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.ae);
                return;
            }
            if ((var4_4 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                this.cfr_renamed_36();
            }
            this.cfr_renamed_28();
            this.var_boolean_char = var3_3;
            var1_1 = bm.var_int_arr_case[3];
            var3_3 = bm.var_int_arr_case[1];
            if ("   ".length() > " ".length()) ** GOTO lbl30
            return;
lbl-1000:
            // 1 sources

            {
                if ((this.var_int_arr_arr_if[var5_5][var3_3] == bm.var_int_arr_case[2])) {
                    if (bm.cfr_renamed_2((int)var1_1, bm.var_int_arr_case[3])) {
                        var1_1 = var3_3;
                        if (" ".length() > 0) break;
                        return;
                    }
                    var1_1 = bm.var_int_arr_case[3];
                    if ("  ".length() == ((146 ^ 192) & ~(127 ^ 45))) {
                        return;
                    }
                } else {
                    var1_1 = bm.var_int_arr_case[1];
                }
                var3_3 += 1;
lbl30:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var3_3, (int)this.var_int_arr_arr_if[var5_5].length))
            }
lbl31:
            // 2 sources

            var3_3 = var1_1;
            if (-" ".length() <= 0) ** GOTO lbl39
            return;
lbl-1000:
            // 1 sources

            {
                if (bm.boolean_do(var2_2[var3_3 - var1_1], bm.var_int_arr_case[2])) {
                    this.var_int_arr_arr_if[var5_5][var3_3] = var2_2[var3_3 - var1_1];
                }
                var3_3 += 1;
lbl39:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var3_3, (int)var2_2.length))
            }
lbl40:
            // 1 sources

            if (!(AngelChip.duLieuNguoiChoi.cfr_renamed_12 == var4_4)) break block16;
            this.cfr_renamed_18 = bm.var_int_arr_case[3];
            var3_3 = bm.var_int_arr_case[1];
            if ((113 ^ 117) >= " ".length()) ** GOTO lbl61
            return;
lbl-1000:
            // 1 sources

            {
                var1_1 = bm.var_int_arr_case[1];
                if ("  ".length() > 0) ** GOTO lbl59
                return;
lbl-1000:
                // 1 sources

                {
                    if ((this.var_fb_arr_do[var3_3].var_byte_if == var2_2[var1_1])) {
                        this.cfr_renamed_12((int)var3_3);
                        if (-"  ".length() < 0) break;
                        return;
                    }
                    var1_1 += 1;
lbl59:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var1_1, (int)var2_2.length))
                }
lbl60:
                // 2 sources

                var3_3 += 1;
lbl61:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var3_3, (int)bm.var_int_arr_case[5]))
            }
lbl62:
            // 1 sources

            this.cfr_renamed_23();
            this.var_fb_arr_do = bm.fb_arr_do(this.var_fb_arr_do);
            if ((this.var_fb_arr_do[this.cfr_renamed_10].var_byte_if == bm.var_int_arr_case[2])) {
                this.cfr_renamed_10 = this.int_do() - bm.var_int_arr_case[3];
            }
            this.cfr_renamed_0(bm.var_int_arr_case[1]);
        }
        if (bm.boolean_int((int)this.var_boolean_char)) {
            this.dangChayAuto = bm.var_int_arr_case[3];
            this.cfr_renamed_29();
        }
        this.var_int_arr_if[var5_5] = bm.var_int_arr_case[1];
        var3_3 = bm.var_int_arr_case[1];
        if ("  ".length() <= (76 ^ 72)) ** GOTO lbl81
        return;
lbl-1000:
        // 1 sources

        {
            if (bm.boolean_do(this.var_int_arr_arr_if[var5_5][var3_3], bm.var_int_arr_case[2])) {
                v0 = var5_5;
                this.var_int_arr_if[v0] = this.var_int_arr_if[v0] + bm.var_int_arr_case[3];
            }
            var3_3 += 1;
lbl81:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var3_3, (int)this.var_int_arr_arr_if[var5_5].length))
        }
lbl82:
        // 1 sources

    }

    public final void void_byte(int n) {
        this.dangChayAuto = var_int_arr_case[3];
        this.cfr_renamed_29();
        this.cfr_renamed_21 = n;
        this.var_boolean_char = var_int_arr_case[3];
        a_0.cfr_renamed_0(this.cfr_renamed_21, MenuChinhAvatar.A);
        a_0.cfr_renamed_0(this.cfr_renamed_29, MenuChinhAvatar.cB);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int[] int_arr_do(int[] nArray) {
        int n = var_int_arr_case[1];
        while (!(n >= nArray.length - var_int_arr_case[3])) {
            int n2 = n + var_int_arr_case[3];
            while (!(n2 >= nArray.length)) {
                int n3;
                if (bm.boolean_do(nArray[n2], var_int_arr_case[2]) && (!bm.boolean_if(n3 = nArray[n], nArray[n2]) || (n3 == var_int_arr_case[2]))) {
                    nArray[n] = nArray[n2];
                    nArray[n2] = n3;
                }
                ++n2;
            }
            ++n;
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    public final void (byte var1_1, Vector var2_2, int var3_3, int var4_4 != null) {
        super.cfr_renamed_6();
        this.cfr_renamed_11();
        this.cfr_renamed_24();
        a_0.soXu = GameCanvas.int_if();
        this.cfr_renamed_29 = this.cfr_renamed_18 = var3_3;
        a_0.cfr_renamed_11 = var1_1;
        this.cfr_renamed_39 = var4_4;
        a_0.coKichHoat = bm.var_int_arr_case[3];
        var1_1 = (byte)var2_2.size();
        var3_3 = bm.var_int_arr_case[1];
        if (-"  ".length() <= 0) ** GOTO lbl21
        return;
lbl-1000:
        // 1 sources

        {
            var4_5 = (fb)var2_2.elementAt(var3_3);
            this.var_fb_arr_do[var3_3] = new fb(var4_5.var_byte_if, bm.var_int_arr_case[3]);
            this.var_fb_arr_do[var3_3].cfr_renamed_2 = GameCanvas.var_int_int;
            this.var_fb_arr_do[var3_3].cfr_renamed_5 = GameCanvas.var_int_long;
            this.var_fb_arr_do[var3_3].coTrangThai = bm.var_int_arr_case[3];
            ++var3_3;
lbl21:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var3_3, (int)var1_1))
        }
lbl22:
        // 1 sources

        bm.fb_arr_do(this.var_fb_arr_do);
        this.cfr_renamed_14();
        if (bm.boolean_do(this.cfr_renamed_18, AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
            this.cfr_renamed_20();
        }
        this.cfr_renamed_1();
        this.cfr_renamed_0(bm.var_int_arr_case[1]);
    }

    private void cfr_renamed_12(int n) {
        this.var_fb_arr_do[n] = new fb(var_int_arr_case[2], var_int_arr_case[3]);
    }

    public final void cfr_renamed_12() {
        this.dangChayAuto = var_int_arr_case[3];
        this.cfr_renamed_29();
        if (bm.boolean_for(a_0.coTrangThai ? 1 : 0)) {
            this.cfr_renamed_21 = a_0.var_byte_if;
            a_0.cfr_renamed_0(((bk_0)((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)this.cfr_renamed_21))).cfr_renamed_12, MenuChinhAvatar.bu);
        }
        a_0.coKichHoat = var_int_arr_case[3];
    }

    private void cfr_renamed_29() {
        this.var_ei_new = a_0.var_ei_for;
        this.var_ei_try = null;
    }

    public final void cfr_renamed_17() {
        this.cfr_renamed_24();
        super.cfr_renamed_17();
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block71: {
            block68: {
                block69: {
                    block70: {
                        block67: {
                            block61: {
                                block62: {
                                    block64: {
                                        block66: {
                                            block65: {
                                                block63: {
                                                    super.cfr_renamed_15();
                                                    if (!(bm.boolean_for((int)this.var_boolean_case) && bm.boolean_for((int)a_0.coTrangThai) && bm.boolean_int((int)a_0.coKichHoat) && (this.var_ei_new != a_0.var_ei_do) && !bm.boolean_int((int)this.cfr_renamed_10))) {
                                                        return;
                                                    }
                                                    var1_1 = this.int_do();
                                                    if ((var1_1 == bm.var_int_arr_case[2])) {
                                                        var1_1 = bm.var_int_arr_case[5];
                                                    }
                                                    if (bm.boolean_int((int)GameCanvas.coKichHoat) && bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                                                        GameCanvas.coKichHoat = bm.var_int_arr_case[1];
                                                        this.var_boolean_try = bm.var_int_arr_case[3];
                                                    }
                                                    if (bm.boolean_int((int)GameCanvas.coKichHoat) && bm.boolean_int((int)GameCanvas.boolean_if(this.cfr_renamed_28 - a_0.var_int_int / bm.var_int_arr_case[12], this.var_eq_0_for.soLuong - a_0.var_int_byte / bm.var_int_arr_case[12] - bm.var_int_arr_case[21], var1_1 * bm.cfr_renamed_24, a_0.var_int_byte))) {
                                                        GameCanvas.coKichHoat = bm.var_int_arr_case[1];
                                                        if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                                                            this.cfr_renamed_33();
                                                            this.var_boolean_try = bm.var_int_arr_case[1];
                                                            return;
                                                        }
                                                        var1_1 = this.int_do();
                                                        if ((var1_1 == bm.var_int_arr_case[2])) {
                                                            var1_1 = bm.var_int_arr_case[22];
                                                            if ((44 + 129 - 46 + 6 ^ 14 + 16 - -67 + 32) != (44 ^ 56 ^ (122 ^ 106))) {
                                                                return;
                                                            }
                                                        } else {
                                                            --var1_1;
                                                        }
                                                        var2_2 = (GameCanvas.soLuongKhoa - (this.cfr_renamed_28 - a_0.var_int_int / bm.var_int_arr_case[12])) / bm.cfr_renamed_24;
                                                        this.var_boolean_try = bm.var_int_arr_case[3];
                                                        if (bm.boolean_if(var2_2, var1_1)) {
                                                            this.cfr_renamed_10 = var2_2;
                                                        }
                                                    }
                                                    if (!bm.boolean_int((int)this.var_boolean_try)) break block61;
                                                    var1_1 = GameCanvas.int_do();
                                                    var2_2 = GameCanvas.int_for();
                                                    if (!bm.boolean_int((int)GameCanvas.var_boolean_try)) break block62;
                                                    var3_3 = (GameCanvas.soLuongKhoa - (this.cfr_renamed_28 - a_0.var_int_int / bm.var_int_arr_case[12])) / bm.cfr_renamed_24;
                                                    if (!bm.boolean_do(this.cfr_renamed_26, bm.var_int_arr_case[12]) || !bm.boolean_for(var2_2, bm.var_int_arr_case[5])) break block63;
                                                    GameCanvas.var_boolean_arr_do[bm.var_int_arr_case[12]] = bm.var_int_arr_case[3];
                                                    if (bm.boolean_do(this.var_int_arr_new[this.cfr_renamed_10], bm.var_int_arr_case[2])) {
                                                        this.cfr_renamed_26 = bm.var_int_arr_case[3];
                                                        if ("  ".length() >= (108 ^ 89 ^ (136 ^ 185))) {
                                                            return;
                                                        }
                                                    }
                                                    break block64;
                                                }
                                                if (!bm.boolean_do(this.cfr_renamed_26, bm.var_int_arr_case[12]) || !bm.boolean_int(var2_2, bm.var_int_arr_case[23])) break block65;
                                                if ((this.cfr_renamed_26 == bm.var_int_arr_case[3])) {
                                                    this.var_boolean_try = bm.var_int_arr_case[1];
                                                    this.cfr_renamed_26 = bm.var_int_arr_case[1];
                                                    GameCanvas.var_boolean_arr_do[bm.var_int_arr_case[24]] = bm.var_int_arr_case[3];
                                                    if ("   ".length() != "   ".length()) {
                                                        return;
                                                    }
                                                }
                                                break block64;
                                            }
                                            if (!bm.boolean_for(gc_0.int_if(var1_1), bm.var_int_arr_case[5])) break block64;
                                            if (!bm.boolean_do(this.cfr_renamed_26, bm.var_int_arr_case[12])) break block66;
                                            var4_4 = bm.var_int_arr_case[1];
                                            if ((23 ^ 68 ^ (14 ^ 89)) >= "   ".length()) ** GOTO lbl65
                                            return;
lbl-1000:
                                            // 1 sources

                                            {
                                                if ((this.var_fb_arr_if[var4_4].var_byte_if == this.var_fb_arr_do[this.cfr_renamed_10].var_byte_if)) {
                                                    return;
                                                }
                                                ++var4_4;
lbl65:
                                                // 2 sources

                                                ** while (!bm.cfr_renamed_5((int)var4_4, (int)bm.var_int_arr_case[4]))
                                            }
lbl66:
                                            // 1 sources

                                            this.var_fb_if = this.var_fb_arr_do[this.cfr_renamed_10];
                                            this.cfr_renamed_12(this.cfr_renamed_10);
                                            this.cfr_renamed_9 = this.cfr_renamed_10;
                                        }
                                        this.cfr_renamed_26 = bm.var_int_arr_case[12];
                                        if (bm.boolean_do(this.cfr_renamed_10 - var3_3)) {
                                            if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2]) && bm.boolean_byte(var3_3)) {
                                                this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_arr_do[var3_3];
                                                this.cfr_renamed_12(var3_3);
                                                this.cfr_renamed_10 = var3_3;
                                                if (" ".length() != " ".length()) {
                                                    return;
                                                }
                                            }
                                        } else {
                                            var4_4 = this.int_do();
                                            if ((var4_4 == bm.var_int_arr_case[2])) {
                                                var4_4 = bm.var_int_arr_case[22];
                                                } else {
                                                --var4_4;
                                            }
                                            if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2]) && bm.boolean_if(var3_3, var4_4)) {
                                                this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_arr_do[var3_3];
                                                this.cfr_renamed_12(var3_3);
                                                this.cfr_renamed_10 = var3_3;
                                            }
                                        }
                                    }
                                    this.cfr_renamed_0(bm.var_int_arr_case[3]);
                                }
                                if (bm.boolean_int((int)GameCanvas.var_boolean_new)) {
                                    if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                                        this.cfr_renamed_36();
                                        if (("  ".length() ^ (18 ^ 20)) <= 0) {
                                            return;
                                        }
                                    } else if (bm.boolean_if(gc_0.int_if(var1_1), bm.var_int_arr_case[5]) && bm.boolean_if(gc_0.int_if(var2_2), bm.var_int_arr_case[5])) {
                                        if ((this.cfr_renamed_36 == bm.var_int_arr_case[3])) {
                                            this.cfr_renamed_36 = bm.var_int_arr_case[12];
                                            this.var_int_arr_new[this.cfr_renamed_10] = bm.var_int_arr_case[2];
                                            if ((190 + 124 - 144 + 23 ^ 159 + 61 - 89 + 66) != (111 ^ 76 ^ (111 ^ 72))) {
                                                return;
                                            }
                                        } else if ((this.cfr_renamed_36 == bm.var_int_arr_case[12])) {
                                            this.cfr_renamed_36 = bm.var_int_arr_case[3];
                                            this.var_int_arr_new[this.cfr_renamed_10] = bm.var_int_arr_case[1];
                                        }
                                    }
                                    this.cfr_renamed_0(bm.var_int_arr_case[1]);
                                }
                            }
                            if (!bm.boolean_int((int)GameCanvas.boolean_do(bm.var_int_arr_case[12]))) break block67;
                            this.cfr_renamed_33();
                            if ("   ".length() == 0) {
                                return;
                            }
                            break block68;
                        }
                        if (!bm.boolean_int((int)GameCanvas.boolean_do(bm.var_int_arr_case[24]))) break block69;
                        if (bm.boolean_do(this.cfr_renamed_36)) {
                            this.cfr_renamed_36 -= bm.var_int_arr_case[3];
                        }
                        if (bm.boolean_int(this.cfr_renamed_36, bm.var_int_arr_case[12])) {
                            this.var_int_arr_new[this.cfr_renamed_10] = bm.var_int_arr_case[2];
                        }
                        if (!bm.boolean_for(this.cfr_renamed_36) || !(this.var_fb_if.var_byte_if == bm.var_int_arr_case[2])) break block70;
                        var1_1 = bm.var_int_arr_case[1];
                        if (((123 ^ 16 ^ (184 ^ 145)) & (213 + 179 - 234 + 56 ^ 20 + 131 - 28 + 25 ^ -" ".length())) == 0) ** GOTO lbl141
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((this.var_fb_arr_if[var1_1].var_byte_if == this.var_fb_arr_do[this.cfr_renamed_10].var_byte_if)) {
                                return;
                            }
                            ++var1_1;
lbl141:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var1_1, (int)bm.var_int_arr_case[4]))
                        }
lbl142:
                        // 1 sources

                        this.var_fb_if = this.var_fb_arr_do[this.cfr_renamed_10];
                        this.cfr_renamed_12(this.cfr_renamed_10);
                        this.cfr_renamed_9 = this.cfr_renamed_10;
                    }
                    this.cfr_renamed_0(bm.var_int_arr_case[1]);
                    return;
                }
                if (bm.boolean_int((int)GameCanvas.boolean_do(bm.var_int_arr_case[6]))) {
                    var1_1 = this.int_do();
                    if ((var1_1 == bm.var_int_arr_case[2])) {
                        var1_1 = bm.var_int_arr_case[22];
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    } else {
                        --var1_1;
                    }
                    if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                        if (bm.boolean_do(this.cfr_renamed_10)) {
                            this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_arr_do[this.cfr_renamed_10 - bm.var_int_arr_case[3]];
                            this.cfr_renamed_12(this.cfr_renamed_10 - bm.var_int_arr_case[3]);
                            } else {
                            this.cfr_renamed_11(bm.var_int_arr_case[1]);
                        }
                    }
                    if (bm.boolean_do(this.cfr_renamed_10)) {
                        this.cfr_renamed_10 -= bm.var_int_arr_case[3];
                        if (-" ".length() > (202 ^ 199 ^ (164 ^ 173))) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_10 = var1_1;
                    }
                    this.cfr_renamed_0(bm.var_int_arr_case[1]);
                    return;
                }
                if (!bm.boolean_int((int)GameCanvas.boolean_do(bm.var_int_arr_case[14]))) break block71;
                var1_1 = this.int_do();
                if ((var1_1 == bm.var_int_arr_case[2])) {
                    var1_1 = bm.var_int_arr_case[22];
                    if ((254 ^ 158 ^ (7 ^ 98)) <= 0) {
                        return;
                    }
                } else {
                    --var1_1;
                }
                if (bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                    if (bm.boolean_int(this.cfr_renamed_10, var1_1)) {
                        this.var_fb_arr_do[this.cfr_renamed_10] = this.var_fb_arr_do[this.cfr_renamed_10 + bm.var_int_arr_case[3]];
                        this.cfr_renamed_12(this.cfr_renamed_10 + bm.var_int_arr_case[3]);
                        if (-"  ".length() > 0) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_8(bm.var_int_arr_case[1]);
                    }
                }
                if (bm.boolean_int(this.cfr_renamed_10, var1_1)) {
                    this.cfr_renamed_10 += bm.var_int_arr_case[3];
                    if ((52 ^ 106 ^ (255 ^ 165)) < "  ".length()) {
                        return;
                    }
                } else {
                    this.cfr_renamed_10 = bm.var_int_arr_case[1];
                }
            }
            this.cfr_renamed_0(bm.var_int_arr_case[1]);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void void_for() {
        block22: {
            block32: {
                block33: {
                    block27: {
                        block29: {
                            block28: {
                                block24: {
                                    block25: {
                                        block26: {
                                            block23: {
                                                super.void_for();
                                                if (bm.boolean_for((int)a_0.coKichHoat) && !bm.boolean_int((int)a_0.coTrangThai)) break block22;
                                                if (!bm.boolean_int((int)a_0.coKichHoat) || !bm.boolean_int((int)a_0.coKichHoat) || !bm.cfr_renamed_0((Object)this.var_fb_arr_do)) break block23;
                                                var1_1 = this.var_fb_arr_do.length - bm.var_int_arr_case[3];
                                                if (-"   ".length() <= 0) ** GOTO lbl12
                                                return;
lbl-1000:
                                                // 1 sources

                                                {
                                                    if ((this.var_fb_arr_do[var1_1].int_do() == bm.var_int_arr_case[2])) {
                                                        this.var_fb_arr_do[var1_1].coTrangThai = bm.var_int_arr_case[1];
                                                    }
                                                    --var1_1;
lbl12:
                                                    // 2 sources

                                                    ** while (!bm.boolean_try((int)var1_1))
                                                }
                                            }
                                            var1_2 = this;
                                            if (!bm.boolean_int((int)var1_2.cfr_renamed_10) || !bm.boolean_do(var2_3 = a_0.int_do(var1_2.cfr_renamed_29), bm.var_int_arr_case[2])) break block24;
                                            var2_3 = a_0.mangSoNguyen[var2_3];
                                            var3_8 = bm.var_eq_0_arr_for[var2_3].var_int_if;
                                            var2_3 = bm.var_eq_0_arr_for[var2_3].soLuong;
                                            var1_2.var_eq_0_if.var_int_if += (var3_8 - var1_2.var_eq_0_if.var_int_if) / bm.var_int_arr_case[12];
                                            var1_2.var_eq_0_if.soLuong += (var2_3 - var1_2.var_eq_0_if.soLuong) / bm.var_int_arr_case[12];
                                            if (!bm.boolean_if(Math.abs(var3_8 - var1_2.var_eq_0_if.var_int_if), bm.var_int_arr_case[3]) || !bm.boolean_if(Math.abs(var2_3 - var1_2.var_eq_0_if.soLuong), bm.var_int_arr_case[3])) break block25;
                                            var3_8 = a_0.int_do(var1_2.cfr_renamed_29);
                                            var1_2.var_fb_arr_arr_do[var3_8][var1_2.var_byte_arr_do[var3_8]] = new fb((byte)var1_2.var_int_if, bm.var_int_arr_case[3]);
                                            if (!(var1_2.cfr_renamed_29 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) break block26;
                                            var4_12 = bm.var_int_arr_case[1];
                                            if ((0 ^ 68 ^ (74 ^ 10)) >= -" ".length()) ** GOTO lbl37
                                            return;
lbl-1000:
                                            // 1 sources

                                            {
                                                if ((var1_2.var_fb_arr_do[var4_12].var_byte_if == var1_2.var_int_if)) {
                                                    var1_2.cfr_renamed_11(var4_12);
                                                    if (((41 + 126 - 143 + 121 ^ 61 + 55 - -24 + 27) & (126 + 11 - 89 + 99 ^ 71 + 110 - 153 + 137 ^ -" ".length())) == 0) break;
                                                    return;
                                                }
                                                ++var4_12;
lbl37:
                                                // 2 sources

                                                ** while (!bm.cfr_renamed_5((int)var4_12, (int)bm.var_int_arr_case[5]))
                                            }
lbl38:
                                            // 2 sources

                                            if ((var1_2.var_fb_arr_do[var1_2.cfr_renamed_10].var_byte_if == bm.var_int_arr_case[2])) {
                                                var1_2.cfr_renamed_10 = var1_2.int_do() - bm.var_int_arr_case[3];
                                            }
                                        }
                                        var1_2.cfr_renamed_10 = bm.var_int_arr_case[1];
                                        var1_2.cfr_renamed_28();
                                    }
                                    var1_2.cfr_renamed_0(bm.var_int_arr_case[1]);
                                }
                                var1_2 = this;
                                if (!bm.boolean_int((int)var1_2.var_boolean_byte)) break block27;
                                var2_3 = var1_2.var_eq_0_for.var_int_if + var1_2.cfr_renamed_25 * bm.cfr_renamed_24;
                                var3_8 = var1_2.var_eq_0_for.soLuong;
                                var1_2.var_eq_0_do.var_int_if += (var2_3 - var1_2.var_eq_0_do.var_int_if) / bm.var_int_arr_case[12];
                                var1_2.var_eq_0_do.soLuong += (var3_8 - var1_2.var_eq_0_do.soLuong) / bm.var_int_arr_case[12];
                                if (!bm.boolean_if(Math.abs((var2_3 - var1_2.var_eq_0_do.var_int_if) / bm.var_int_arr_case[12]), bm.var_int_arr_case[3]) || !bm.boolean_if(Math.abs((var3_8 - var1_2.var_eq_0_do.soLuong) / bm.var_int_arr_case[12]), bm.var_int_arr_case[3])) break block27;
                                var1_2.var_fb_arr_do[var1_2.cfr_renamed_25] = var1_2.var_fb_int;
                                if ((bm.int_do(var1_2.var_fb_arr_arr_do[a_0.var_byte_if]) == bm.var_int_arr_case[4])) {
                                    if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 == var1_2.cfr_renamed_18)) {
                                        var1_2.cfr_renamed_9();
                                        if (-(191 ^ 186) >= 0) {
                                            return;
                                        }
                                    }
                                } else if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 == var1_2.cfr_renamed_18)) {
                                    var1_2.cfr_renamed_23();
                                }
                                if (!bm.boolean_for((int)var1_2.cfr_renamed_18)) break block28;
                                var1_2.cfr_renamed_21();
                                var1_2.cfr_renamed_14();
                                if (-" ".length() >= "  ".length()) {
                                    return;
                                }
                                break block29;
                            }
                            var3_8 = var1_2.var_fb_arr_do[var1_2.cfr_renamed_25].var_byte_if;
                            var2_4 = var1_2;
                            var4_13 = new int[bm.var_int_arr_case[14]];
                            var5_14 = bm.var_int_arr_case[1];
                            if (((30 + 14 - -28 + 60 ^ 34 + 50 - 64 + 118) & (242 ^ 175 ^ (215 ^ 132) ^ -" ".length())) != (18 + 71 - 26 + 69 ^ 96 + 83 - 99 + 48)) ** GOTO lbl83
                            return;
lbl-1000:
                            // 1 sources

                            {
                                var4_13[var5_14] = bm.var_int_arr_case[2];
                                ++var5_14;
lbl83:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var5_14, (int)bm.var_int_arr_case[13]))
                            }
lbl84:
                            // 1 sources

                            var5_14 = bm.var_int_arr_case[1];
                            var6_15 = bm.var_int_arr_case[1];
                            if ((127 ^ 123) != 0) ** GOTO lbl123
                            return;
lbl-1000:
                            // 1 sources

                            {
                                block31: {
                                    block30: {
                                        if (!bm.boolean_do(var2_4.var_int_arr_arr_if[a_0.var_byte_if][var6_15], bm.var_int_arr_case[2])) break block30;
                                        var4_13[var5_14] = var2_4.var_int_arr_arr_if[a_0.var_byte_if][var6_15];
                                        ++var5_14;
                                        if ((30 ^ 26) < "  ".length()) {
                                            return;
                                        }
                                        break block31;
                                    }
                                    var5_14 = bm.var_int_arr_case[1];
                                    var4_13[bm.var_int_arr_case[13]] = var3_8;
                                    bm.int_arr_do(var4_13);
                                    if (!bm.boolean_for((int)(var4_13 == null)) || bm.boolean_int((int)bm.boolean_do(var4_13))) {
                                        var3_9 = var4_13;
                                        var2_4.cfr_renamed_36();
                                        cd_0.cd_0_do().cfr_renamed_0(var3_9);
                                        if ((51 ^ 55) >= (141 ^ 137)) break;
                                        return;
                                    }
                                    var7_16 = bm.var_int_arr_case[1];
                                    if ((112 ^ 117) > 0) ** GOTO lbl120
                                    return;
lbl-1000:
                                    // 1 sources

                                    {
                                        var4_13[var7_16] = bm.var_int_arr_case[2];
                                        ++var7_16;
lbl120:
                                        // 2 sources

                                        ** while (!bm.cfr_renamed_5((int)var7_16, (int)bm.var_int_arr_case[14]))
                                    }
                                }
                                ++var6_15;
lbl123:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var6_15, (int)bm.var_int_arr_case[0]))
                            }
                        }
                        var2_5 = var1_2;
                        var1_2.cfr_renamed_25 = bm.var_int_arr_case[1];
                        var2_5.var_boolean_byte = bm.var_int_arr_case[1];
                        var2_5.var_eq_0_do = new eq_0(GameCanvas.var_int_int, GameCanvas.var_int_long, bm.var_int_arr_case[4]);
                        var2_5.cfr_renamed_0(bm.var_int_arr_case[1]);
                    }
                    var1_2 = this;
                    if (bm.boolean_int((int)var1_2.cfr_renamed_11)) {
                        var2_6 = a_0.int_do(var1_2.cfr_renamed_18);
                        var3_10 = (a_0.var_eq_0_arr_do[a_0.mangSoNguyen[var2_6]].var_int_if - var1_2.var_fb_for.cfr_renamed_2) / bm.var_int_arr_case[12];
                        var2_6 = (a_0.var_eq_0_arr_do[a_0.mangSoNguyen[var2_6]].soLuong - var1_2.var_fb_for.cfr_renamed_5) / bm.var_int_arr_case[12];
                        var1_2.var_fb_for.cfr_renamed_2 += var3_10;
                        var1_2.var_fb_for.cfr_renamed_5 += var2_6;
                        if (bm.boolean_if(Math.abs(var3_10), bm.var_int_arr_case[3]) && bm.boolean_if(Math.abs(var2_6), bm.var_int_arr_case[3])) {
                            var1_2.cfr_renamed_11 = bm.var_int_arr_case[1];
                        }
                    }
                    var1_2 = this;
                    a_0.var_long_if = (int)((long)GameCanvas.int_if() - a_0.soXu);
                    if (!bm.boolean_try(bm.cfr_renamed_0((long)a_0.cfr_renamed_11 - a_0.var_long_if, 0L))) break block32;
                    if ((var1_2.var_ei_new == var1_2.var_ei_char) && (var1_2.var_ei_try == var1_2.var_ei_byte)) {
                        var1_2.cfr_renamed_25();
                        var1_2.cfr_renamed_20();
                        return;
                    }
                    if (!(var1_2.var_ei_new == a_0.var_ei_if)) break block33;
                    var2_7 = bm.var_int_arr_case[1];
                    var3_11 = bm.var_int_arr_case[3];
                    if (-" ".length() < (7 ^ 3)) ** GOTO lbl157
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if (bm.boolean_for(var1_2.var_fb_arr_do[var3_11].var_byte_do) && bm.boolean_for(var1_2.var_fb_arr_do[var3_11].var_byte_if, var1_2.var_fb_arr_do[var2_7].var_byte_if)) {
                            var2_7 = var3_11;
                        }
                        ++var3_11;
lbl157:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var3_11, (int)bm.var_int_arr_case[5]))
                    }
lbl158:
                    // 1 sources

                    var1_2.cfr_renamed_34();
                    cd_0.cd_0_do().cfr_renamed_3(var1_2.var_fb_arr_do[var2_7].var_byte_if);
                    return;
                }
                if ((var1_2.var_ei_new == var1_2.var_ei_case)) {
                    var1_2.cfr_renamed_34();
                    var1_2.var_ei_case.cfr_renamed_1();
                }
            }
            return;
        }
        this.this();
    }

    private void cfr_renamed_9() {
        this.var_ei_new = this.var_ei_case;
        this.var_ei_try = null;
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_28() {
        var1_1 = bm.var_int_arr_case[1];
        if ("   ".length() >= -" ".length()) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_int_arr_new[var1_1] = bm.var_int_arr_case[2];
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)this.var_int_arr_new.length))
        }
lbl9:
        // 1 sources

    }

    private void cfr_renamed_34() {
        if (!bm.boolean_do(this.cfr_renamed_9, var_int_arr_case[2]) || (this.var_fb_if.var_byte_if == var_int_arr_case[2])) {
            return;
        }
        if (bm.boolean_int(GameCanvas.coTrangThai ? 1 : 0)) {
            this.cfr_renamed_11(((a_0)this).cfr_renamed_10);
            this.cfr_renamed_8(this.cfr_renamed_9);
            this.var_fb_arr_do[this.cfr_renamed_9] = this.var_fb_if;
            this.var_fb_if = new fb(var_int_arr_case[2], var_int_arr_case[3]);
            return;
        }
        this.cfr_renamed_11(((a_0)this).cfr_renamed_10);
        this.cfr_renamed_8(this.cfr_renamed_9);
        this.var_fb_arr_do[this.cfr_renamed_9] = this.var_fb_if;
        this.var_fb_if = new fb(var_int_arr_case[2], var_int_arr_case[3]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void (int[] var1_1 != int[][] var2_2) {
        this.cfr_renamed_36();
        var3_3 = bm.var_int_arr_case[35];
        var4_4 = bm.var_int_arr_case[1];
        if ("   ".length() != -" ".length()) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            if (bm.boolean_byte(var1_1 /* !! */ [var4_4]) && bm.boolean_int(var1_1 /* !! */ [var4_4], var3_3)) {
                var3_3 = var1_1 /* !! */ [var4_4];
                this.cfr_renamed_21 = var4_4;
            }
            this.var_int_arr_for[var4_4] = var1_1 /* !! */ [var4_4];
            ++var4_4;
lbl13:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var4_4, (int)bm.var_int_arr_case[6]))
        }
lbl14:
        // 1 sources

        this.var_int_arr_arr_for = var2_2;
        var4_4 = bm.var_int_arr_case[1];
        if ("   ".length() != 0) ** GOTO lbl22
        return;
lbl-1000:
        // 1 sources

        {
            this.var_byte_arr_if[var4_4] = (byte)bm.int_do(var2_2[var4_4]);
            ++var4_4;
lbl22:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var4_4, (int)bm.var_int_arr_case[6]))
        }
lbl23:
        // 1 sources

        this.dangChayAuto = bm.var_int_arr_case[3];
        this.cfr_renamed_29();
        var4_4 = bm.var_int_arr_case[1];
        if ((115 + 120 - 220 + 117 ^ 109 + 18 - 87 + 88) > " ".length()) ** GOTO lbl50
        return;
lbl-1000:
        // 1 sources

        {
            v0 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var4_4);
            var1_1 /* !! */  = (int[])v0;
            if ((v0 != null) && bm.boolean_do(var1_1 /* !! */ .cfr_renamed_12, bm.var_int_arr_case[2]) && bm.boolean_do(this.var_int_arr_for[var4_4], bm.var_int_arr_case[2])) {
                if ((this.var_int_arr_for[var4_4] == bm.var_int_arr_case[8])) {
                    a_0.cfr_renamed_0(var1_1 /* !! */ .cfr_renamed_12, MenuChinhAvatar.cc);
                    } else if ((var4_4 == this.cfr_renamed_21)) {
                    a_0.cfr_renamed_0(var1_1 /* !! */ .cfr_renamed_12, MenuChinhAvatar.bu);
                    } else {
                    a_0.cfr_renamed_0(var1_1 /* !! */ .cfr_renamed_12, MenuChinhAvatar.dn);
                }
                var1_1 /* !! */ .var_boolean_int = bm.var_int_arr_case[1];
            }
            ++var4_4;
lbl50:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var4_4, (int)bm.var_int_arr_case[6]))
        }
lbl51:
        // 1 sources

        AngelChip.duLieuNguoiChoi.var_boolean_int = bm.var_int_arr_case[1];
        this.cfr_renamed_0(bm.var_int_arr_case[1]);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_11(int var1_1) {
        var2_2 = var1_1;
        if (-" ".length() < "   ".length()) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_fb_arr_do[var2_2] = this.var_fb_arr_do[var2_2 + bm.var_int_arr_case[3]];
            ++var2_2;
lbl8:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[22]))
        }
lbl9:
        // 1 sources

        this.cfr_renamed_12(bm.var_int_arr_case[22]);
        this.var_int_arr_new[var1_1] = bm.var_int_arr_case[2];
    }

    /*
     * Unable to fully structure code
     */
    public final void (int var1_1, int var2_2, int var3_3, int[][] var4_4, int[][] var5_5, int var6_6 != null) {
        this.cfr_renamed_24();
        a_0.coTrangThai = bm.var_int_arr_case[3];
        a_0.soXu = GameCanvas.int_if();
        var7_7 = bm.var_int_arr_case[1];
        if (" ".length() > -" ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var8_8 = bm.var_int_arr_case[1];
            if (" ".length() > ((116 + 35 - 127 + 209 ^ 41 + 103 - -23 + 12) & (101 + 50 - 60 + 65 ^ 140 + 197 - 227 + 88 ^ -" ".length()))) ** GOTO lbl17
            return;
lbl-1000:
            // 1 sources

            {
                if (bm.boolean_do(var4_4[var7_7][var8_8], bm.var_int_arr_case[2])) {
                    this.var_fb_arr_arr_do[var7_7][var8_8] = new fb((byte)var4_4[var7_7][var8_8], bm.var_int_arr_case[3]);
                }
                ++var8_8;
lbl17:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var8_8, (int)var5_5[var7_7].length))
            }
lbl18:
            // 1 sources

            ++var7_7;
lbl19:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var7_7, (int)var4_4.length))
        }
lbl20:
        // 1 sources

        this.var_int_arr_arr_do = var5_5;
        a_0.cfr_renamed_11 = var1_1;
        this.cfr_renamed_18 = var2_2;
        this.cfr_renamed_29 = var3_3;
        this.cfr_renamed_39 = var6_6;
        a_0.coKichHoat = bm.var_int_arr_case[3];
        var7_7 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl33
        return;
lbl-1000:
        // 1 sources

        {
            this.var_fb_arr_arr_do[a_0.var_byte_if][var7_7] = null;
            ++var7_7;
lbl33:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var7_7, (int)bm.var_int_arr_case[6]))
        }
lbl34:
        // 1 sources

        var7_7 = bm.var_int_arr_case[1];
        if ((61 ^ 93 ^ (234 ^ 142)) >= 0) ** GOTO lbl41
        return;
lbl-1000:
        // 1 sources

        {
            this.var_int_arr_arr_do[a_0.var_byte_if][var7_7] = bm.var_int_arr_case[2];
            ++var7_7;
lbl41:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var7_7, (int)bm.var_int_arr_case[4]))
        }
lbl42:
        // 1 sources

        var7_7 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl49
        return;
lbl-1000:
        // 1 sources

        {
            this.var_int_arr_arr_if[a_0.var_byte_if][var7_7] = bm.var_int_arr_case[2];
            ++var7_7;
lbl49:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var7_7, (int)this.var_int_arr_arr_if.length))
        }
lbl50:
        // 1 sources

        var7_7 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl57
        return;
lbl-1000:
        // 1 sources

        {
            this.var_int_arr_arr_for[a_0.var_byte_if][var7_7] = bm.var_int_arr_case[2];
            ++var7_7;
lbl57:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var7_7, (int)this.var_int_arr_arr_for.length))
        }
lbl58:
        // 1 sources

        this.cfr_renamed_1();
        dL.cfr_renamed_19();
        if (bm.boolean_int((int)GameCanvas.coTrangThai) && bm.boolean_for(bm.cfr_renamed_24 = (GameCanvas.var_int_byte - a_0.var_int_int / bm.var_int_arr_case[12]) / bm.var_int_arr_case[5], a_0.var_int_int / bm.var_int_arr_case[4] << bm.var_int_arr_case[3])) {
            bm.cfr_renamed_24 = a_0.var_int_int / bm.var_int_arr_case[4] << bm.var_int_arr_case[3];
        }
    }

    private static boolean boolean_for(int n, int n2) {
        return n > n2;
    }

    private static boolean boolean_int(int n, int n2) {
        return n < n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int int_do() {
        int n = var_int_arr_case[1];
        while (!(n >= var_int_arr_case[5])) {
            if ((!bm.boolean_do((int)this.var_fb_if.var_byte_if, var_int_arr_case[2]) || bm.boolean_do(n, ((a_0)this).cfr_renamed_10)) && (this.var_fb_arr_do[n].var_byte_if == var_int_arr_case[2])) {
                return n;
            }
            ++n;
        }
        return var_int_arr_case[2];
    }

    /*
     * Unable to fully structure code
     */
    private static int int_do(int[] var0) {
        var1_1 = bm.var_int_arr_case[1];
        if (((81 + 62 - 28 + 12 ^ (23 ^ 60)) & (220 ^ 191 ^ (123 ^ 76) ^ -" ".length())) < (23 ^ 118 ^ (114 ^ 23))) ** GOTO lbl9
        return (82 ^ 25 ^ (76 ^ 75) & ~(172 ^ 171)) & (83 ^ 74 ^ (27 ^ 73) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            if ((var0[var1_1] == bm.var_int_arr_case[2])) {
                return var1_1;
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)var0.length))
        }
lbl10:
        // 1 sources

        return bm.var_int_arr_case[2];
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_4();
        this.cfr_renamed_11();
        if (bm.boolean_int(a_0.coKichHoat ? 1 : 0)) {
            this.cfr_renamed_0(var_int_arr_case[1]);
        }
        this.var_eq_0_do = new eq_0(GameCanvas.var_int_int, GameCanvas.var_int_long, var_int_arr_case[4]);
        if ((a_0.var_javax_microedition_lcdui_Image_do == null)) {
            try {
                a_0.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/star.on"));
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_3(Graphics var1_1) {
        var2_2 = bn_0.cfr_renamed_6;
        if (!bm.boolean_for((int)a_0.coKichHoat) || bm.boolean_int((int)a_0.coTrangThai)) {
            var2_2 = bm.var_int_arr_case[3];
        }
        var3_3 = bm.var_int_arr_case[1];
        if (-" ".length() < 0) ** GOTO lbl16
        return;
lbl-1000:
        // 1 sources

        {
            var4_4 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var3_3);
            if (bm.boolean_do(var4_4.cfr_renamed_12, bm.var_int_arr_case[2])) {
                if (!(var4_4.cfr_renamed_12 == AngelChip.duLieuNguoiChoi.cfr_renamed_12) || bm.boolean_for((int)a_0.coKichHoat)) {
                    var4_4.cfr_renamed_0(var1_1, var4_4.cfr_renamed_3 * var2_2, var4_4.var_int_if * var2_2, bm.var_int_arr_case[1]);
                }
                var4_4.cfr_renamed_0(var1_1, var4_4.cfr_renamed_3 * var2_2, var4_4.var_int_if * var2_2);
                a_0.cfr_renamed_0(var1_1, var4_4.cfr_renamed_3 * var2_2, (var4_4.var_int_if - bm.var_int_arr_case[26]) * var2_2 - bm.var_int_arr_case[5] * (var2_2 - bm.var_int_arr_case[3]), var4_4);
            }
            ++var3_3;
lbl16:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var3_3, (int)a_0.var_int_case))
        }
lbl17:
        // 1 sources

    }

        private static boolean boolean_for(int n) {
        return n == 0;
    }

    private void cfr_renamed_31() {
        this.var_ei_new = this.var_ei_char;
        this.var_ei_try = this.var_ei_byte;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void (boolean var1_1 != byte var2_2) {
        block10: {
            block11: {
                var3_3 = a_0.int_do(this.cfr_renamed_18);
                if ((var3_3 == bm.var_int_arr_case[2])) {
                    return;
                }
                if ((this.cfr_renamed_18 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                    this.cfr_renamed_36();
                }
                if (!bm.boolean_int((int)var1_1)) break block10;
                if (!(AngelChip.duLieuNguoiChoi.cfr_renamed_12 == this.cfr_renamed_18)) break block11;
                var1_1 = bm.var_int_arr_case[1];
                if (null == null) ** GOTO lbl21
                return;
                while (bm.boolean_do((int)this.var_fb_arr_do[var1_1].var_byte_if, bm.var_int_arr_case[2])) {
                    if ((var2_2 == this.var_fb_arr_do[var1_1].var_byte_if)) {
                        this.cfr_renamed_12((int)var1_1);
                        if (" ".length() < "  ".length()) break;
                        return;
                    }
                    var1_1 += 1;
lbl21:
                    // 2 sources

                    if (!bm.cfr_renamed_5((int)var1_1, bm.var_int_arr_case[5])) continue;
                }
                this.cfr_renamed_0(bm.var_int_arr_case[1]);
            }
            var1_1 = bm.var_int_arr_case[1];
            var4_4 = new int[bm.var_int_arr_case[14]];
            var5_5 = bm.var_int_arr_case[1];
            if ((113 ^ 117) == (105 ^ 109)) ** GOTO lbl33
            return;
lbl-1000:
            // 1 sources

            {
                var4_4[var5_5] = bm.var_int_arr_case[2];
                ++var5_5;
lbl33:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var5_5, (int)bm.var_int_arr_case[14]))
            }
lbl34:
            // 1 sources

            var5_5 = bm.var_int_arr_case[1];
            if (((28 + 103 - 24 + 20 ^ (77 ^ 56)) & (76 ^ 127 ^ (127 ^ 70) ^ -" ".length())) != (43 + 105 - 93 + 113 ^ 26 + 14 - 10 + 142)) ** GOTO lbl76
            return;
lbl-1000:
            // 1 sources

            {
                block14: {
                    block12: {
                        block13: {
                            if (!(this.var_int_arr_arr_if[var3_3][var5_5] == bm.var_int_arr_case[2])) break block12;
                            var1_1 = bm.var_int_arr_case[1];
                            var4_4[bm.var_int_arr_case[13]] = var2_2;
                            bm.int_arr_do(var4_4);
                            if (bm.boolean_for((int)(var4_4 == null)) && !bm.boolean_int((int)bm.boolean_do(var4_4))) break block13;
                            var6_6 = bm.var_int_arr_case[7];
                            if ("   ".length() != " ".length()) ** GOTO lbl55
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if (bm.boolean_byte(var6_6 - bm.var_int_arr_case[3])) {
                                    this.var_int_arr_arr_if[var3_3][var6_6] = this.var_int_arr_arr_if[var3_3][var6_6 - bm.var_int_arr_case[3]];
                                }
                                --var6_6;
lbl55:
                                // 2 sources

                                ** while (!bm.boolean_if((int)var6_6, (int)var5_5))
                            }
lbl56:
                            // 1 sources

                            this.var_int_arr_arr_if[var3_3][var5_5] = var2_2;
                        }
                        var6_6 = bm.var_int_arr_case[1];
                        if (null == null) ** GOTO lbl65
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var4_4[var6_6] = bm.var_int_arr_case[2];
                            ++var6_6;
lbl65:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var6_6, (int)bm.var_int_arr_case[14]))
                        }
lbl66:
                        // 1 sources

                        if (((213 ^ 154) & ~(55 ^ 120)) < 0) {
                            return;
                        }
                        break block14;
                    }
                    var4_4[var1_1] = this.var_int_arr_arr_if[var3_3][var5_5];
                    var1_1 += 1;
                }
                ++var5_5;
lbl76:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var5_5, (int)this.var_int_arr_arr_if[var3_3].length))
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean boolean_do(int[] var0) {
        var0 = bm.int_arr_do(var0);
        var1_1 = bm.var_int_arr_case[1];
        var2_2 = bm.var_int_arr_case[1];
        if (-" ".length() <= 0) ** GOTO lbl18
        return (boolean)((42 ^ 100 ^ (49 ^ 121)) & (73 + 143 - 77 + 8 ^ 105 + 7 - 93 + 130 ^ -" ".length()));
        while (bm.boolean_do(var0[var2_2 + bm.var_int_arr_case[3]], bm.var_int_arr_case[2])) {
            if (bm.boolean_for(var0[var2_2] / bm.var_int_arr_case[6] - var0[var2_2 + bm.var_int_arr_case[3]] / bm.var_int_arr_case[6]) && bm.boolean_int(var0[var2_2] - var0[var2_2 + bm.var_int_arr_case[3]])) {
                ++var1_1;
                if ("   ".length() <= 0) {
                    return (boolean)((96 ^ 36) & ~(210 ^ 150) & ~((127 ^ 69) & ~(46 ^ 20)));
                }
            } else {
                return bm.var_int_arr_case[1];
            }
            ++var2_2;
lbl18:
            // 2 sources

            if (!(var2_2 >= var0.length - bm.var_int_arr_case[3])) continue;
        }
        if (bm.boolean_for(var1_1, bm.var_int_arr_case[3])) {
            return bm.var_int_arr_case[3];
        }
        return bm.var_int_arr_case[1];
    }

    /*
     * Unable to fully structure code
     */
    public final void void_do(int var1_1, int var2_2) {
        block0 : switch (var1_1) {
            case 30: {
                var3_3 = this;
                var3_3.cfr_renamed_36();
                var3_3.cfr_renamed_34();
                var4_5 = bm.var_int_arr_case[1];
                if (" ".length() != 0) ** GOTO lbl13
                return;
lbl-1000:
                // 1 sources

                {
                    var3_3.var_int_arr_try[var4_5] = bm.var_int_arr_case[2];
                    ++var4_5;
lbl13:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var4_5, (int)var3_3.var_int_arr_try.length))
                }
lbl14:
                // 1 sources

                var4_5 = bm.var_int_arr_case[1];
                var5_7 = bm.var_int_arr_case[1];
                if (((110 ^ 90) & ~(54 ^ 2)) == ((57 ^ 43) & ~(133 ^ 151))) ** GOTO lbl30
                return;
lbl-1000:
                // 1 sources

                {
                    if (bm.boolean_for(var3_3.var_int_arr_new[var5_7])) {
                        if ((var4_5 == bm.var_int_arr_case[13])) {
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.q);
                            if (-" ".length() <= 0) break block0;
                            return;
                        }
                        var3_3.var_int_arr_try[var4_5] = var3_3.var_fb_arr_do[var5_7].var_byte_if;
                        ++var4_5;
                    }
                    ++var5_7;
lbl30:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var5_7, (int)bm.var_int_arr_case[5]))
                }
lbl31:
                // 1 sources

                if (bm.boolean_int(var4_5, bm.var_int_arr_case[12])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.k);
                    if (" ".length() >= " ".length()) break;
                    return;
                }
                var5_8 = new int[bm.var_int_arr_case[14]];
                var6_10 = bm.var_int_arr_case[1];
                if (-" ".length() < ((113 + 160 - 209 + 151 ^ 127 + 109 - 141 + 44) & (210 ^ 181 ^ (251 ^ 192) ^ -" ".length()))) ** GOTO lbl52
                return;
lbl-1000:
                // 1 sources

                {
                    if (bm.boolean_do(var3_3.var_int_arr_try[var6_10], bm.var_int_arr_case[2])) {
                        var5_8[var6_10] = var3_3.var_int_arr_try[var6_10];
                        if ((144 ^ 148) < 0) {
                            return;
                        }
                    } else {
                        var5_8[var6_10] = bm.var_int_arr_case[2];
                    }
                    ++var6_10;
lbl52:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var6_10, (int)bm.var_int_arr_case[13]))
                }
lbl53:
                // 1 sources

                var5_8[bm.var_int_arr_case[13]] = var3_3.var_int_if;
                var6_10 = bm.var_int_arr_case[2];
                if (bm.boolean_int((int)(var5_8 == null))) {
                    var6_10 = bm.var_int_arr_case[3];
                }
                if (bm.boolean_int((int)bm.boolean_do(var5_8))) {
                    var6_10 = bm.var_int_arr_case[1];
                }
                if ((var6_10 == bm.var_int_arr_case[2])) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.FormCaiDatFarm);
                    if ((171 ^ 175) == (38 ^ 34)) break;
                    return;
                }
                var4_5 = bm.var_int_arr_case[1];
                if ((8 ^ 12) != 0) ** GOTO lbl86
                return;
lbl-1000:
                // 1 sources

                {
                    if (!bm.boolean_do(var5_8[var4_5], bm.var_int_arr_case[2])) ** GOTO lbl85
                    var7_12 = bm.var_int_arr_case[1];
                    if ((102 ^ 99) > 0) ** GOTO lbl84
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((var5_8[var4_5] == var3_3.var_fb_arr_do[var7_12].var_byte_if)) {
                            if (!bm.boolean_for((int)var3_3.boolean_if(var7_12))) break;
                            GameCanvas.cfr_renamed_1(MenuChinhAvatar.FormCaiDatFarm);
                            if (null == null) break block0;
                            return;
                        }
                        ++var7_12;
lbl84:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var7_12, (int)bm.var_int_arr_case[5]))
                    }
lbl85:
                    // 3 sources

                    ++var4_5;
lbl86:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var4_5, (int)var5_8.length))
                }
lbl87:
                // 1 sources

                var3_3.cfr_renamed_20();
                a_0.cfr_renamed_13();
                cd_0.cd_0_do().cfr_renamed_0(var3_3.var_int_arr_try, var6_10);
                if (null == null) break;
                return;
            }
            case 31: {
                this.cfr_renamed_25();
                if (null == null) break;
                return;
            }
            case 32: {
                var3_4 = this;
                var3_4.cfr_renamed_36();
                if (bm.boolean_do(AngelChip.duLieuNguoiChoi.cfr_renamed_12, var3_4.cfr_renamed_18)) {
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.bB);
                    if (null == null) break;
                    return;
                }
                var3_4.cfr_renamed_34();
                var4_6 = new int[bm.var_int_arr_case[0]];
                var5_9 = bm.var_int_arr_case[2];
                var6_11 = bm.var_int_arr_case[1];
                if (((56 ^ 20 ^ (12 ^ 24)) & (77 ^ 113 ^ (184 ^ 188) ^ -" ".length())) >= 0) ** GOTO lbl127
                return;
lbl-1000:
                // 1 sources

                {
                    if (bm.boolean_int(var3_4.var_fb_arr_do[var6_11].var_byte_do) && (!bm.boolean_do(var5_9, bm.var_int_arr_case[2]) || (var5_9 == var3_4.var_fb_arr_do[var6_11].var_byte_do))) {
                        var5_9 = var3_4.var_fb_arr_do[var6_11].var_byte_do;
                        var4_6[var6_11] = var3_4.var_fb_arr_do[var6_11].var_byte_if;
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    } else {
                        var4_6[var6_11] = bm.var_int_arr_case[2];
                    }
                    ++var6_11;
lbl127:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var6_11, (int)bm.var_int_arr_case[5]))
                }
lbl128:
                // 1 sources

                var3_4.cfr_renamed_20();
                a_0.cfr_renamed_13();
                cd_0.cd_0_do().cfr_renamed_0(var3_4.var_fb_arr_do);
            }
        }
        super.void_do(var1_1, var2_2);
    }

    /*
     * Unable to fully structure code
     */
    public final void (boolean var1_1, int var2_4, int var3_5, byte var4_6 != null) {
        block17: {
            block15: {
                block16: {
                    var5_7 = a_0.int_do(this.cfr_renamed_18);
                    if ((var5_7 == bm.var_int_arr_case[2])) {
                        return;
                    }
                    if ((this.cfr_renamed_18 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                        this.cfr_renamed_36();
                    }
                    if (!bm.boolean_int((int)var1_1)) break block15;
                    var1_2 = this;
                    this.cfr_renamed_11 = bm.var_int_arr_case[3];
                    var1_2.var_fb_for = new fb((byte)var1_2.var_int_if, bm.var_int_arr_case[3]);
                    var6_8 = a_0.int_do(var1_2.cfr_renamed_29);
                    var1_2.var_fb_for.cfr_renamed_2 = a_0.var_eq_0_arr_do[a_0.mangSoNguyen[var6_8]].var_int_if;
                    var1_2.var_fb_for.cfr_renamed_5 = a_0.var_eq_0_arr_do[a_0.mangSoNguyen[var6_8]].soLuong;
                    var1_3 = a_0.int_do(this.cfr_renamed_29);
                    if (bm.boolean_do(var1_3, bm.var_int_arr_case[2])) {
                        var6_8 = a_0.int_do(this.cfr_renamed_39);
                        if (bm.boolean_do(var1_3, var6_8)) {
                            this.var_fb_arr_arr_do[var1_3][this.var_byte_arr_do[var1_3]] = this.var_fb_arr_arr_do[var6_8][this.var_byte_arr_do[var6_8]];
                        }
                        this.var_fb_arr_arr_do[var6_8][this.var_byte_arr_do[var6_8]] = null;
                        this.cfr_renamed_39 = var3_5;
                        this.var_byte_arr_do[var6_8] = var4_6;
                        this.var_int_arr_byte[var5_7] = this.var_byte_arr_do[var5_7];
                        this.var_int_arr_byte[var6_8] = this.var_byte_arr_do[var6_8];
                    }
                    v0 = var5_7;
                    this.var_int_arr_int[v0] = this.var_int_arr_int[v0] + bm.var_int_arr_case[3];
                    if (!(this.cfr_renamed_18 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) break block16;
                    this.cfr_renamed_23 += bm.var_int_arr_case[3];
                    if ((bm.int_do(this.var_fb_arr_arr_do[a_0.var_byte_if]) == bm.var_int_arr_case[4])) {
                        this.cfr_renamed_9();
                        if (((10 + 112 - 4 + 17 ^ 37 + 141 - 169 + 151) & (49 ^ 119 ^ (202 ^ 171) ^ -" ".length())) == -" ".length()) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_23();
                    }
                    var6_8 = var2_4 - bm.var_int_arr_case[3];
                    if ("  ".length() >= "  ".length()) ** GOTO lbl52
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var1_3 = bm.var_int_arr_case[1];
                        if (null == null) ** GOTO lbl50
                        return;
lbl-1000:
                        // 1 sources

                        {
                            if ((this.var_fb_arr_do[var1_3].var_byte_if == this.var_int_arr_try[var6_8])) {
                                this.var_fb_arr_do[var1_3].var_byte_do = (byte)this.cfr_renamed_23;
                                this.var_fb_arr_do[this.int_do()] = this.var_fb_arr_do[var1_3];
                                this.cfr_renamed_11(var1_3);
                            }
                            ++var1_3;
lbl50:
                            // 2 sources

                            ** while (!bm.cfr_renamed_5((int)var1_3, (int)bm.var_int_arr_case[5]))
                        }
lbl51:
                        // 1 sources

                        --var6_8;
lbl52:
                        // 2 sources

                        ** while (!bm.boolean_try((int)var6_8))
                    }
lbl53:
                    // 1 sources

                    var6_8 = this.int_do();
                    this.var_fb_arr_do[var6_8] = new fb((byte)this.var_int_if, bm.var_int_arr_case[3]);
                    this.var_fb_arr_do[var6_8].var_byte_do = (byte)this.cfr_renamed_23;
                    var1_3 = bm.var_int_arr_case[1];
                    if (-" ".length() < "  ".length()) ** GOTO lbl68
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((this.var_fb_arr_if[var1_3].var_byte_if == bm.var_int_arr_case[2])) {
                            this.var_fb_arr_if[var1_3] = this.var_fb_arr_do[var6_8];
                            if (-" ".length() != ((111 + 61 - 49 + 112 ^ 12 + 23 - -104 + 31) & (83 ^ 6 ^ (154 ^ 142) ^ -" ".length()))) break;
                            return;
                        }
                        ++var1_3;
lbl68:
                        // 2 sources

                        ** while (!bm.cfr_renamed_5((int)var1_3, (int)bm.var_int_arr_case[4]))
                    }
lbl69:
                    // 2 sources

                    this.cfr_renamed_21();
                    this.cfr_renamed_14();
                }
                this.var_int_arr_arr_do[var5_7][bm.int_do((int[])this.var_int_arr_arr_do[var5_7])] = this.var_int_if;
                this.cfr_renamed_28();
                if (-(108 ^ 115 ^ (173 ^ 182)) > 0) {
                    return;
                }
                break block17;
            }
            if ((this.cfr_renamed_18 == AngelChip.duLieuNguoiChoi.cfr_renamed_12)) {
                GameCanvas.cfr_renamed_1(MenuChinhAvatar.FormCaiDatFarm);
                this.cfr_renamed_31();
            }
        }
        if (!bm.boolean_do(AngelChip.duLieuNguoiChoi.cfr_renamed_12, this.cfr_renamed_18) || (AngelChip.duLieuNguoiChoi.cfr_renamed_12 == this.cfr_renamed_29)) {
            this.cfr_renamed_0(bm.var_int_arr_case[1]);
        }
    }

        private static int (long l == long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_33() {
        var1_1 = bm.var_int_arr_case[1];
        if ("   ".length() >= ((250 ^ 182) & ~(75 ^ 7))) ** GOTO lbl9
        return;
lbl-1000:
        // 1 sources

        {
            if ((this.var_fb_arr_if[var1_1].var_byte_if == this.var_fb_arr_do[this.cfr_renamed_10].var_byte_if) && bm.boolean_do((int)this.var_fb_arr_if[var1_1].var_byte_if, bm.var_int_arr_case[2])) {
                return;
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)bm.var_int_arr_case[4]))
        }
lbl10:
        // 1 sources

        if (bm.boolean_int(this.cfr_renamed_36, bm.var_int_arr_case[12])) {
            this.cfr_renamed_36 += bm.var_int_arr_case[3];
        }
        if (bm.boolean_do(this.cfr_renamed_36) && bm.boolean_do((int)this.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
            this.cfr_renamed_26();
        }
        if ((this.cfr_renamed_36 == bm.var_int_arr_case[12])) {
            this.var_int_arr_new[this.cfr_renamed_10] = bm.var_int_arr_case[1];
        }
    }

    private static boolean boolean_int(int n) {
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    private boolean boolean_new(int var1_1) {
        var2_2 = bm.var_int_arr_case[1];
        if (" ".length() != ((89 + 96 - 91 + 50 ^ 15 + 147 - 129 + 153) & (172 ^ 180 ^ (100 ^ 86) ^ -" ".length()))) ** GOTO lbl11
        return (boolean)((130 + 118 - 157 + 145 ^ 120 + 120 - 194 + 146) & (123 ^ 65 ^ (161 ^ 183) ^ -" ".length()));
lbl-1000:
        // 1 sources

        {
            if (bm.boolean_for(this.var_fb_arr_if[var2_2].var_byte_do)) {
                return bm.var_int_arr_case[1];
            }
            if ((this.var_fb_arr_if[var2_2].var_byte_do == var1_1)) {
                return bm.var_int_arr_case[3];
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var2_2, (int)bm.var_int_arr_case[4]))
        }
lbl12:
        // 1 sources

        return bm.var_int_arr_case[1];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cfr_renamed_2(Graphics var1_1) {
        block113: {
            this.var_fb_do = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
            var2_2 = bm.soLuong;
            if (bm.boolean_if(var2_2, bm.var_int_arr_case[0]) && bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[10])) {
                var2_2 = bm.var_int_arr_case[21];
            }
            var3_3 = bm.var_int_arr_case[12];
            if (bm.boolean_for(GameCanvas.cfr_renamed_16) && bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[10])) {
                var3_3 = bm.var_int_arr_case[3];
            }
            var4_4 /* !! */  = var1_1;
            var5_14 = this;
            var6_17 = bm.soLuong;
            if (bm.boolean_if(var6_17, bm.var_int_arr_case[0]) && bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[10])) {
                var6_17 = bm.var_int_arr_case[21];
            }
            if (!bm.boolean_for((int)var5_14.dangChayAuto)) break block113;
            var7_22 = bm.var_int_arr_case[1];
            if (null == null) ** GOTO lbl112
            return;
lbl-1000:
            // 1 sources

            {
                block110: {
                    block115: {
                        block114: {
                            var8_23 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var7_22);
                            if (!(var8_23 != null) || !bm.boolean_do(var8_23.cfr_renamed_12, bm.var_int_arr_case[2])) break block110;
                            var9_27 = bm.var_int_arr_case[4];
                            if (!bm.cfr_renamed_0((Object)var5_14.var_fb_arr_arr_do[var7_22])) break block114;
                            var8_24 = bm.var_int_arr_case[1];
                            if (((23 ^ 116 ^ (155 ^ 194)) & (0 + 121 - 72 + 81 ^ 11 + 26 - -29 + 118 ^ -" ".length())) == 0) ** GOTO lbl35
                            return;
lbl-1000:
                            // 1 sources

                            {
                                if ((var5_14.var_fb_arr_arr_do[var7_22][var8_24] == null)) {
                                    var9_27 = var8_24;
                                    if (((10 ^ 21 ^ (235 ^ 189)) & (19 ^ 20 ^ (15 ^ 65) ^ -" ".length())) <= ((151 + 0 - 40 + 62 ^ 127 + 1 - 127 + 164) & (101 ^ 39 ^ (222 ^ 148) ^ -" ".length()))) break;
                                    return;
                                }
                                ++var8_24;
lbl35:
                                // 2 sources

                                ** while (!bm.cfr_renamed_5((int)var8_24, (int)bm.var_int_arr_case[6]))
                            }
                        }
                        if (bm.boolean_int(a_0.mangSoNguyen[var7_22]) && !(a_0.mangSoNguyen[var7_22] == bm.var_int_arr_case[12])) break block115;
                        var8_25 = bm.var_int_arr_case[1];
                        if ("   ".length() == "   ".length()) ** GOTO lbl84
                        return;
                        while (bm.cfr_renamed_0((Object)var5_14.var_fb_arr_arr_do[var7_22]) && (var5_14.var_fb_arr_arr_do[var7_22][var8_25] != null)) {
                            var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var7_22]].var_int_if + var8_25 * bm.soLuong - (var9_27 * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] + a_0.var_int_int / bm.var_int_arr_case[12];
                            var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_5 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var7_22]].soLuong;
                            if ((a_0.mangSoNguyen[var7_22] == bm.var_int_arr_case[12])) {
                                if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                                    if (bm.boolean_int(var8_25, bm.var_int_arr_case[4]) && (var5_14.var_fb_arr_arr_do[var7_22][var8_25 + bm.var_int_arr_case[3]] != null)) {
                                        if (bm.boolean_for(bm.cfr_renamed_24, bm.var_int_arr_case[29])) {
                                            var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ );
                                            if ("  ".length() < ((158 ^ 190 ^ (89 ^ 125)) & (42 ^ 30 ^ (175 ^ 159) ^ -" ".length()))) {
                                                return;
                                            }
                                        } else {
                                            var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ );
                                            }
                                    } else {
                                        var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ );
                                        }
                                } else {
                                    var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ , bm.var_int_arr_case[1]);
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                }
                            } else if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                                var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var7_22]].var_int_if - var8_25 * bm.soLuong + (var5_14.var_int_arr_byte[var7_22] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] - a_0.var_int_int / bm.var_int_arr_case[12];
                                var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ );
                                if ("   ".length() < 0) {
                                    return;
                                }
                            } else {
                                var5_14.var_fb_arr_arr_do[var7_22][var8_25].cfr_renamed_0(var4_4 /* !! */ , bm.var_int_arr_case[1]);
                            }
                            ++var8_25;
lbl84:
                            // 2 sources

                            if (!(var8_25 >= bm.var_int_arr_case[6])) continue;
                            if ((119 ^ 97 ^ (172 ^ 190)) <= -" ".length()) {
                                return;
                            }
                            break block110;
                        }
                        break block110;
                    }
                    var8_26 = bm.var_int_arr_case[1];
                    if (null == null) ** GOTO lbl109
                    return;
                    while ((var5_14.var_fb_arr_arr_do[var7_22][var8_26] != null)) {
                        var5_14.var_fb_arr_arr_do[var7_22][var8_26].cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var7_22]].var_int_if;
                        var5_14.var_fb_arr_arr_do[var7_22][var8_26].cfr_renamed_5 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var7_22]].soLuong + (var8_26 * var6_17 << bm.var_int_arr_case[3]) - (var9_27 * var6_17 << bm.var_int_arr_case[3]) / bm.var_int_arr_case[12];
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            var5_14.var_fb_arr_arr_do[var7_22][var8_26].cfr_renamed_0(var4_4 /* !! */ );
                            if ((102 ^ 98) != (189 ^ 185)) {
                                return;
                            }
                        } else {
                            var5_14.var_fb_arr_arr_do[var7_22][var8_26].cfr_renamed_0(var4_4 /* !! */ , bm.var_int_arr_case[3]);
                        }
                        ++var8_26;
lbl109:
                        // 2 sources

                        if (!(var8_26 >= bm.var_int_arr_case[6])) continue;
                    }
                }
                ++var7_22;
lbl112:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var7_22, (int)bm.var_int_arr_case[6]))
            }
        }
        var5_15 = bm.var_int_arr_case[1];
        if (-" ".length() < 0) ** GOTO lbl165
        return;
lbl-1000:
        // 1 sources

        {
            block116: {
                block117: {
                    var4_4 /* !! */  = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var5_15);
                    if (!(var4_4 /* !! */ != null) || !bm.boolean_do(var4_4 /* !! */ .cfr_renamed_12, bm.var_int_arr_case[2])) break block116;
                    if (bm.boolean_do(a_0.mangSoNguyen[var5_15], bm.var_int_arr_case[3]) && !(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[4])) break block117;
                    var4_5 = bm.var_int_arr_case[1];
                    if (" ".length() < "  ".length()) ** GOTO lbl140
                    return;
                    while (bm.boolean_do(this.var_int_arr_arr_for[var5_15][var4_5], bm.var_int_arr_case[2])) {
                        this.var_fb_do = new fb((byte)this.var_int_arr_arr_for[var5_15][var4_5], bm.var_int_arr_case[3]);
                        this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var5_15]].var_int_if;
                        this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var5_15]].soLuong + var4_5 * (var2_2 << bm.var_int_arr_case[3]) - this.var_byte_arr_if[var5_15] * (var2_2 << bm.var_int_arr_case[3]) / bm.var_int_arr_case[12];
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            this.var_fb_do.cfr_renamed_0(var1_1);
                            if ("   ".length() == 0) {
                                return;
                            }
                        } else {
                            this.var_fb_do.cfr_renamed_0(var1_1, bm.var_int_arr_case[3]);
                        }
                        ++var4_5;
lbl140:
                        // 2 sources

                        if (!(var4_5 >= bm.var_int_arr_case[7])) continue;
                    }
                }
                if (!bm.boolean_for(a_0.mangSoNguyen[var5_15])) break block116;
                var4_6 = bm.var_int_arr_case[1];
                if ((23 + 89 - 48 + 76 ^ 82 + 84 - 47 + 17) >= "  ".length()) ** GOTO lbl162
                return;
                while (bm.boolean_do(this.var_int_arr_arr_for[var5_15][var4_6], bm.var_int_arr_case[2])) {
                    this.var_fb_do = new fb((byte)this.var_int_arr_arr_for[var5_15][var4_6], bm.var_int_arr_case[3]);
                    this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var5_15]].var_int_if - var4_6 * bm.soLuong + (this.var_byte_arr_if[var5_15] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] - a_0.var_int_int / bm.var_int_arr_case[12];
                    this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var5_15]].soLuong;
                    if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                        this.var_fb_do.cfr_renamed_0(var1_1);
                        } else {
                        this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_for[a_0.mangSoNguyen[var5_15]].var_int_if + var4_6 * bm.soLuong - (this.var_byte_arr_if[var5_15] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] + a_0.var_int_int / bm.var_int_arr_case[12];
                        this.var_fb_do.cfr_renamed_0(var1_1, bm.var_int_arr_case[1]);
                    }
                    ++var4_6;
lbl162:
                    // 2 sources

                    if (!(var4_6 >= bm.var_int_arr_case[7])) continue;
                }
            }
            ++var5_15;
lbl165:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl166:
        // 1 sources

        var5_15 = bm.var_int_arr_case[1];
        if (" ".length() > 0) ** GOTO lbl226
        return;
lbl-1000:
        // 1 sources

        {
            block111: {
                block118: {
                    var4_4 /* !! */  = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var5_15);
                    if (!(var4_4 /* !! */ != null) || !bm.boolean_do(var4_4 /* !! */ .cfr_renamed_12, bm.var_int_arr_case[2])) break block111;
                    if (!(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[3])) break block118;
                    var4_7 = bm.var_int_arr_case[1];
                    if ((156 ^ 189 ^ (75 ^ 110)) == (22 ^ 45 ^ (165 ^ 154))) ** GOTO lbl194
                    return;
                    while (bm.boolean_do(this.var_int_arr_arr_do[var5_15][var4_7], bm.var_int_arr_case[2])) {
                        var6_18 = new fb((byte)this.var_int_arr_arr_do[var5_15][var4_7], bm.var_int_arr_case[3]);
                        new fb((byte)this.var_int_arr_arr_do[var5_15][var4_7], bm.var_int_arr_case[3]).cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if;
                        var6_18.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_7 * (var2_2 << bm.var_int_arr_case[3]) - this.var_int_arr_int[var5_15] * (var2_2 << bm.var_int_arr_case[3]) / bm.var_int_arr_case[12];
                        var6_18.var_byte_do = (byte)bm.var_int_arr_case[3];
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            var6_18.cfr_renamed_0(var1_1);
                            } else {
                            var6_18.cfr_renamed_0(var1_1, bm.var_int_arr_case[3]);
                        }
                        this.cfr_renamed_0(bm.var_int_arr_case[3], var6_18.cfr_renamed_2, var6_18.cfr_renamed_5, var1_1);
                        ++var4_7;
lbl194:
                        // 2 sources

                        if (!(var4_7 >= bm.var_int_arr_case[4])) continue;
                        break block111;
                    }
                    break block111;
                }
                if (!bm.boolean_for(a_0.mangSoNguyen[var5_15])) break block111;
                var4_8 = bm.var_int_arr_case[1];
                if (((77 ^ 8 ^ (188 ^ 153)) & (56 ^ 55 ^ (126 ^ 17) ^ -" ".length())) == 0) ** GOTO lbl223
                return;
                while (bm.boolean_do(this.var_int_arr_arr_do[var5_15][var4_8], bm.var_int_arr_case[2])) {
                    var6_19 = new fb((byte)this.var_int_arr_arr_do[var5_15][var4_8], bm.var_int_arr_case[3]);
                    new fb((byte)this.var_int_arr_arr_do[var5_15][var4_8], bm.var_int_arr_case[3]).cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong;
                    var6_19.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if + var4_8 * bm.soLuong - (this.var_int_arr_int[var5_15] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] + a_0.var_int_int / bm.var_int_arr_case[12];
                    var6_19.var_byte_do = (byte)bm.var_int_arr_case[3];
                    if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                        var6_19.cfr_renamed_0(var1_1);
                        if ("   ".length() == 0) {
                            return;
                        }
                    } else {
                        var6_19.cfr_renamed_0(var1_1, bm.var_int_arr_case[1]);
                    }
                    this.cfr_renamed_0(bm.var_int_arr_case[3], var6_19.cfr_renamed_2, var6_19.cfr_renamed_5, var1_1);
                    ++var4_8;
lbl223:
                    // 2 sources

                    if (!(var4_8 >= bm.var_int_arr_case[4])) continue;
                }
            }
            ++var5_15;
lbl226:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl227:
        // 1 sources

        var5_15 = bm.var_int_arr_case[1];
        if ("  ".length() >= 0) ** GOTO lbl278
        return;
lbl-1000:
        // 1 sources

        {
            block112: {
                block119: {
                    if (!(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[3])) break block119;
                    var4_9 = bm.var_int_arr_case[1];
                    if ("  ".length() != 0) ** GOTO lbl253
                    return;
                    while (bm.boolean_do(this.var_int_arr_arr_if[var5_15][bm.var_int_arr_case[1]], bm.var_int_arr_case[2])) {
                        if (bm.boolean_do(this.var_int_arr_arr_if[var5_15][var4_9], bm.var_int_arr_case[2])) {
                            this.var_fb_do = new fb((byte)this.var_int_arr_arr_if[var5_15][var4_9], bm.var_int_arr_case[3]);
                            this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if;
                            if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                                this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_9 * (var2_2 * var3_3) - this.var_int_arr_if[var5_15] * (var2_2 * var3_3) / bm.var_int_arr_case[12];
                                this.var_fb_do.cfr_renamed_0(var1_1);
                                if ((124 + 19 - 32 + 39 ^ 23 + 0 - -63 + 60) < " ".length()) {
                                    return;
                                }
                            } else {
                                this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_9 * var2_2 - this.var_int_arr_if[var5_15] * var2_2 / bm.var_int_arr_case[12];
                                this.var_fb_do.cfr_renamed_0(var1_1, bm.var_int_arr_case[3]);
                            }
                        }
                        ++var4_9;
lbl253:
                        // 2 sources

                        if (!(var4_9 >= bm.var_int_arr_case[0])) continue;
                        if (((150 ^ 130 ^ (45 ^ 110)) & (22 + 114 - 60 + 72 ^ 126 + 133 - 98 + 34 ^ -" ".length())) != 0) {
                            return;
                        }
                        break block112;
                    }
                    break block112;
                }
                if (!bm.boolean_for(a_0.mangSoNguyen[var5_15])) break block112;
                if (!bm.boolean_do(this.var_int_arr_arr_if[var5_15][bm.var_int_arr_case[1]], bm.var_int_arr_case[2])) break;
                var4_10 = bm.var_int_arr_case[1];
                if ((80 ^ 92 ^ (141 ^ 133)) != 0) ** GOTO lbl275
                return;
lbl-1000:
                // 1 sources

                {
                    if (bm.boolean_do(this.var_int_arr_arr_if[var5_15][var4_10], bm.var_int_arr_case[2])) {
                        this.var_fb_do = new fb((byte)this.var_int_arr_arr_if[var5_15][var4_10], bm.var_int_arr_case[3]);
                        this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if - var4_10 * bm.soLuong + (this.var_int_arr_if[var5_15] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] - a_0.var_int_int / bm.var_int_arr_case[12];
                        this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong;
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            this.var_fb_do.cfr_renamed_0(var1_1);
                        }
                    }
                    ++var4_10;
lbl275:
                    // 2 sources

                    ** while (!bm.cfr_renamed_5((int)var4_10, (int)bm.var_int_arr_case[0]))
                }
            }
            ++var5_15;
lbl278:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl279:
        // 2 sources

        var5_15 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl309
        return;
lbl-1000:
        // 1 sources

        {
            block120: {
                var4_4 /* !! */  = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var5_15);
                if (!(var4_4 /* !! */ != null) || !bm.boolean_do(var4_4 /* !! */ .cfr_renamed_12, bm.var_int_arr_case[2]) || !(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[4])) break block120;
                var4_11 = bm.var_int_arr_case[1];
                if ((17 ^ 47 ^ (53 ^ 15)) >= "  ".length()) ** GOTO lbl306
                return;
                while (bm.boolean_do(this.var_int_arr_arr_do[var5_15][var4_11], bm.var_int_arr_case[2])) {
                    var6_20 = new fb((byte)this.var_int_arr_arr_do[var5_15][var4_11], bm.var_int_arr_case[3]);
                    new fb((byte)this.var_int_arr_arr_do[var5_15][var4_11], bm.var_int_arr_case[3]).var_byte_do = (byte)bm.var_int_arr_case[3];
                    var6_20.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if;
                    var6_20.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_11 * (var2_2 << bm.var_int_arr_case[3]) - this.var_int_arr_int[var5_15] * (var2_2 << bm.var_int_arr_case[3]) / bm.var_int_arr_case[12];
                    if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                        var6_20.cfr_renamed_0(var1_1);
                        } else {
                        var6_20.cfr_renamed_0(var1_1, bm.var_int_arr_case[3]);
                    }
                    this.cfr_renamed_0(bm.var_int_arr_case[3], var6_20.cfr_renamed_2, var6_20.cfr_renamed_5, var1_1);
                    ++var4_11;
lbl306:
                    // 2 sources

                    if (!(var4_11 >= bm.var_int_arr_case[4])) continue;
                }
            }
            ++var5_15;
lbl309:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl310:
        // 1 sources

        var5_15 = bm.var_int_arr_case[1];
        if ("  ".length() >= 0) ** GOTO lbl340
        return;
lbl-1000:
        // 1 sources

        {
            block121: {
                var4_4 /* !! */  = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var5_15);
                if (!(var4_4 /* !! */ != null) || !bm.boolean_do(var4_4 /* !! */ .cfr_renamed_12, bm.var_int_arr_case[2]) || !(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[4])) break block121;
                var4_12 = bm.var_int_arr_case[1];
                if (" ".length() >= ((82 + 74 - 112 + 105 ^ 16 + 30 - 30 + 113) & ((249 ^ 152) & ~(112 ^ 17) ^ (48 ^ 36) ^ -" ".length()))) ** GOTO lbl337
                return;
                while (bm.boolean_do(this.var_int_arr_arr_if[var5_15][bm.var_int_arr_case[1]], bm.var_int_arr_case[2])) {
                    if (bm.boolean_do(this.var_int_arr_arr_if[var5_15][var4_12], bm.var_int_arr_case[2])) {
                        this.var_fb_do = new fb((byte)this.var_int_arr_arr_if[var5_15][var4_12], bm.var_int_arr_case[3]);
                        this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if;
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_12 * (var2_2 * var3_3) - this.var_int_arr_if[var5_15] * (var2_2 * var3_3) / bm.var_int_arr_case[12];
                            this.var_fb_do.cfr_renamed_0(var1_1);
                            if (" ".length() == (12 ^ 116 ^ (0 ^ 124))) {
                                return;
                            }
                        } else {
                            this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong + var4_12 * var2_2 - this.var_int_arr_if[var5_15] * var2_2 / bm.var_int_arr_case[12];
                            this.var_fb_do.cfr_renamed_0(var1_1, bm.var_int_arr_case[3]);
                        }
                    }
                    ++var4_12;
lbl337:
                    // 2 sources

                    if (!(var4_12 >= bm.var_int_arr_case[0])) continue;
                }
            }
            ++var5_15;
lbl340:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl341:
        // 1 sources

        var5_15 = bm.var_int_arr_case[1];
        if (-(228 ^ 181 ^ (196 ^ 145)) <= 0) ** GOTO lbl383
        return;
lbl-1000:
        // 1 sources

        {
            block122: {
                if (!(a_0.mangSoNguyen[var5_15] == bm.var_int_arr_case[12])) break block122;
                var4_13 = bm.var_int_arr_case[1];
                if (" ".length() != "   ".length()) ** GOTO lbl380
                return;
                while (bm.boolean_do(this.var_int_arr_arr_if[var5_15][bm.var_int_arr_case[1]], bm.var_int_arr_case[2])) {
                    if (bm.boolean_do(this.var_int_arr_arr_if[var5_15][var4_13], bm.var_int_arr_case[2])) {
                        this.var_fb_do = new fb((byte)this.var_int_arr_arr_if[var5_15][var4_13], bm.var_int_arr_case[3]);
                        this.var_fb_do.cfr_renamed_2 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].var_int_if + var4_13 * bm.soLuong - (this.var_int_arr_if[var5_15] * bm.soLuong + (a_0.var_int_int - bm.soLuong)) / bm.var_int_arr_case[12] + a_0.var_int_int / bm.var_int_arr_case[12];
                        this.var_fb_do.cfr_renamed_5 = bm.var_eq_0_arr_int[a_0.mangSoNguyen[var5_15]].soLuong;
                        if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                            if (bm.boolean_int(var4_13, bm.var_int_arr_case[7]) && bm.boolean_do(this.var_int_arr_arr_if[var5_15][var4_13 + bm.var_int_arr_case[3]], bm.var_int_arr_case[2])) {
                                if (bm.boolean_for(bm.cfr_renamed_24, bm.var_int_arr_case[29])) {
                                    this.var_fb_do.cfr_renamed_0(var1_1);
                                    if ("   ".length() <= ((67 + 23 - 50 + 87 ^ (23 ^ 50)) & (195 ^ 168 ^ (242 ^ 195) ^ -" ".length()))) {
                                        return;
                                    }
                                } else {
                                    this.var_fb_do.cfr_renamed_0(var1_1);
                                    if ("   ".length() <= 0) {
                                        return;
                                    }
                                }
                            } else {
                                this.var_fb_do.cfr_renamed_0(var1_1);
                                if (((146 ^ 151) & ~(136 ^ 141)) != 0) {
                                    return;
                                }
                            }
                        } else {
                            this.var_fb_do.cfr_renamed_0(var1_1, bm.var_int_arr_case[1]);
                        }
                    }
                    ++var4_13;
lbl380:
                    // 2 sources

                    if (!(var4_13 >= bm.var_int_arr_case[0])) continue;
                }
            }
            ++var5_15;
lbl383:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var5_15, (int)bm.var_int_arr_case[6]))
        }
lbl384:
        // 1 sources

        var4_4 /* !! */  = var1_1;
        var5_16 = this;
        var6_21 = bm.var_int_arr_case[1];
        if (null == null) ** GOTO lbl470
        return;
lbl-1000:
        // 1 sources

        {
            var7_22 = bm.var_int_arr_case[1];
            if ((var5_16.var_fb_arr_do[var6_21] != null) && bm.boolean_do((int)var5_16.var_fb_arr_do[var6_21].var_byte_if, bm.var_int_arr_case[2])) {
                if (bm.boolean_for(var5_16.var_int_arr_new[var6_21])) {
                    var7_22 = bm.var_int_arr_case[13];
                }
                var5_16.var_fb_new = new fb(bm.var_int_arr_case[2], bm.var_int_arr_case[3]);
                var5_16.var_fb_new.cfr_renamed_2 = var5_16.var_fb_arr_do[var6_21].cfr_renamed_2;
                var5_16.var_fb_new.cfr_renamed_5 = var5_16.var_fb_arr_do[var6_21].cfr_renamed_5;
                if (bm.boolean_for((int)var5_16.var_fb_arr_do[var6_21].coTrangThai)) {
                    var5_16.var_fb_new = var5_16.var_fb_arr_do[var6_21];
                }
                if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                    if (bm.boolean_for(var7_22) && bm.boolean_int(var6_21, bm.var_int_arr_case[22]) && bm.boolean_do((int)var5_16.var_fb_arr_do[var6_21 + bm.var_int_arr_case[3]].var_byte_if, bm.var_int_arr_case[2]) && bm.boolean_do(var6_21, var5_16.cfr_renamed_10)) {
                        if (!bm.boolean_if(bm.cfr_renamed_24, bm.var_int_arr_case[30]) || bm.boolean_do(var5_16.var_fb_arr_do[var6_21 + bm.var_int_arr_case[3]].cfr_renamed_2, var5_16.var_fb_arr_do[var6_21 + bm.var_int_arr_case[3]].cfr_renamed_3)) {
                            var5_16.var_fb_new.cfr_renamed_3(var4_4 /* !! */ );
                            if (" ".length() > " ".length()) {
                                return;
                            }
                        } else {
                            var5_16.var_fb_new.cfr_renamed_1(var4_4 /* !! */ );
                        }
                        if (bm.boolean_int(var5_16.var_fb_arr_do[var6_21].var_byte_do)) {
                            var5_16.cfr_renamed_0((int)var5_16.var_fb_arr_do[var6_21].var_byte_do, var5_16.var_fb_arr_do[var6_21].cfr_renamed_2, var5_16.var_fb_arr_do[var6_21].cfr_renamed_5, var4_4 /* !! */ );
                            }
                    } else {
                        var5_16.var_fb_new.cfr_renamed_0(var4_4 /* !! */ );
                        if (bm.boolean_int(var5_16.var_fb_arr_do[var6_21].var_byte_do)) {
                            var5_16.cfr_renamed_0((int)var5_16.var_fb_arr_do[var6_21].var_byte_do, var5_16.var_fb_arr_do[var6_21].cfr_renamed_2, var5_16.var_fb_arr_do[var6_21].cfr_renamed_5, var4_4 /* !! */ );
                            if ("  ".length() < 0) {
                                return;
                            }
                        }
                    }
                } else {
                    var5_16.var_fb_new.cfr_renamed_0(var4_4 /* !! */ , bm.var_int_arr_case[1]);
                    if (bm.boolean_int(var5_16.var_fb_arr_do[var6_21].var_byte_do)) {
                        var5_16.cfr_renamed_0((int)var5_16.var_fb_arr_do[var6_21].var_byte_do, var5_16.var_fb_arr_do[var6_21].cfr_renamed_2, var5_16.var_fb_arr_do[var6_21].cfr_renamed_5, var4_4 /* !! */ );
                    }
                }
            }
            if ((var6_21 == var5_16.cfr_renamed_10)) {
                var9_29 /* !! */  = var4_4 /* !! */ ;
                var8_23 = var5_16;
                if (bm.boolean_do((int)var8_23.var_fb_if.var_byte_if, bm.var_int_arr_case[2])) {
                    var8_23.var_fb_if.cfr_renamed_2 = var8_23.cfr_renamed_28 + var8_23.cfr_renamed_10 * bm.cfr_renamed_24;
                    v0 = var8_23.var_fb_if;
                    v1 = var8_23.var_eq_0_for.soLuong;
                    if (bm.boolean_int((int)var8_23.var_boolean_try)) {
                        v2 = bm.var_int_arr_case[31];
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        v2 = bm.var_int_arr_case[5];
                    }
                    v0.cfr_renamed_5 = v1 + v2;
                    if (bm.boolean_for(GameCanvas.var_int_byte, bm.var_int_arr_case[27])) {
                        if (bm.boolean_int(var8_23.cfr_renamed_10, bm.var_int_arr_case[22])) {
                            if (!bm.boolean_do((int)var8_23.var_fb_arr_do[var8_23.cfr_renamed_10 + bm.var_int_arr_case[3]].var_byte_if, bm.var_int_arr_case[2]) || bm.boolean_int((int)GameCanvas.coTrangThai)) {
                                var8_23.var_fb_if.cfr_renamed_0(var9_29 /* !! */ );
                                if (((22 + 32 - 0 + 77 ^ 87 + 41 - 43 + 58) & (128 ^ 173 ^ (148 ^ 181) ^ -" ".length())) != 0) {
                                    return;
                                }
                            } else {
                                var8_23.var_fb_if.cfr_renamed_1(var9_29 /* !! */ );
                                if (-(21 ^ 24 ^ (7 ^ 14)) >= 0) {
                                    return;
                                }
                            }
                        } else {
                            var8_23.var_fb_if.cfr_renamed_0(var9_29 /* !! */ );
                            if (((76 ^ 69) & ~(39 ^ 46)) != 0) {
                                return;
                            }
                        }
                    } else {
                        var8_23.var_fb_if.cfr_renamed_0(var9_29 /* !! */ , bm.var_int_arr_case[1]);
                    }
                    if (bm.boolean_for(GameCanvas.var_int_try % bm.var_int_arr_case[5], bm.var_int_arr_case[14]) && (bn_0.cfr_renamed_6 == bm.var_int_arr_case[3]) && bm.boolean_for(GameCanvas.cfr_renamed_16)) {
                        k.var_ep_do.cfr_renamed_0(bm.var_int_arr_case[1], var8_23.var_fb_if.cfr_renamed_2 - bm.var_int_arr_case[32], var8_23.var_fb_if.cfr_renamed_5 - bm.var_int_arr_case[18], bm.var_int_arr_case[1], var9_29 /* !! */ );
                        k.var_ep_do.cfr_renamed_0(bm.var_int_arr_case[1], var8_23.var_fb_if.cfr_renamed_2 - bm.var_int_arr_case[5], var8_23.var_fb_if.cfr_renamed_5 - bm.var_int_arr_case[18], bm.var_int_arr_case[4], var9_29 /* !! */ );
                    }
                }
            }
            ++var6_21;
lbl470:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var6_21, (int)bm.var_int_arr_case[5]))
        }
lbl471:
        // 1 sources

    }

    private static boolean boolean_try(int n) {
        return n < 0;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean (int[] var0 == null) {
        var0 = bm.int_arr_do(var0);
        var1_1 = bm.var_int_arr_case[1];
        var2_2 = bm.var_int_arr_case[1];
        if (((32 + 0 - -37 + 59 ^ 54 + 92 - 139 + 165) & (18 + 77 - -35 + 59 ^ 45 + 60 - 5 + 45 ^ -" ".length())) == 0) ** GOTO lbl18
        return (boolean)((67 ^ 5 ^ (241 ^ 148)) & (0 + 53 - 11 + 105 ^ 28 + 170 - 100 + 78 ^ -" ".length()));
        while (bm.boolean_do(var0[var2_2 + bm.var_int_arr_case[3]], bm.var_int_arr_case[2])) {
            if (bm.boolean_int(var0[var2_2] - var0[var2_2 + bm.var_int_arr_case[3]]) && (var0[var2_2 + bm.var_int_arr_case[3]] / bm.var_int_arr_case[6] - var0[var2_2] / bm.var_int_arr_case[6] == bm.var_int_arr_case[3]) && bm.boolean_for(var0[var2_2] % bm.var_int_arr_case[6] - var0[var2_2 + bm.var_int_arr_case[3]] % bm.var_int_arr_case[6])) {
                ++var1_1;
                if (-" ".length() >= 0) {
                    return (boolean)((243 ^ 172 ^ (200 ^ 169)) & (41 ^ 120 ^ (90 ^ 53) ^ -" ".length()));
                }
            } else {
                return bm.var_int_arr_case[1];
            }
            ++var2_2;
lbl18:
            // 2 sources

            if (!(var2_2 >= var0.length - bm.var_int_arr_case[3])) continue;
        }
        if (bm.boolean_for(var1_1, bm.var_int_arr_case[3])) {
            return bm.var_int_arr_case[3];
        }
        return bm.var_int_arr_case[1];
    }

    private void cfr_renamed_36() {
        if (bm.boolean_int(this.var_boolean_try ? 1 : 0) && (this.cfr_renamed_26 == var_int_arr_case[12])) {
            this.cfr_renamed_26 = var_int_arr_case[1];
            this.var_boolean_try = var_int_arr_case[1];
            if (bm.boolean_do((int)this.var_fb_if.var_byte_if, var_int_arr_case[2])) {
                this.cfr_renamed_26();
            }
            this.var_int_arr_new[((a_0)this).cfr_renamed_10] = var_int_arr_case[2];
            GameCanvas.var_boolean_try = var_int_arr_case[1];
        }
    }

    public final void (byte by2 != null) {
        this.cfr_renamed_36();
        this.var_boolean_case = var_int_arr_case[1];
        if (bm.boolean_for(by2)) {
            if ((this.cfr_renamed_27 == var_int_arr_case[2])) {
                this.var_fb_arr_do[((a_0)this).cfr_renamed_10] = this.var_fb_if;
                this.var_fb_arr_do[((a_0)this).cfr_renamed_10].var_byte_do = (byte)var_int_arr_case[1];
                this.var_fb_if = new fb(var_int_arr_case[2], var_int_arr_case[3]);
                if (bm.boolean_do(this.cfr_renamed_9, ((a_0)this).cfr_renamed_10)) {
                    this.cfr_renamed_21();
                    this.cfr_renamed_14();
                }
                this.cfr_renamed_9 = var_int_arr_case[2];
                if (" ".length() > "  ".length()) {
                    return;
                }
            } else if (bm.boolean_byte(this.cfr_renamed_27)) {
                this.var_fb_if = new fb(var_int_arr_case[2], var_int_arr_case[3]);
                if (bm.boolean_do(this.cfr_renamed_9, ((a_0)this).cfr_renamed_10)) {
                    this.var_fb_arr_do[((a_0)this).cfr_renamed_10].var_byte_do = (byte)var_int_arr_case[1];
                    this.cfr_renamed_21();
                    this.cfr_renamed_14();
                    if ((0x43 ^ 0x47) < 0) {
                        return;
                    }
                }
            }
        } else if ((this.cfr_renamed_27 == var_int_arr_case[2])) {
            this.cfr_renamed_12(((a_0)this).cfr_renamed_10);
            this.cfr_renamed_34();
            if (-" ".length() > -" ".length()) {
                return;
            }
        } else if (bm.boolean_byte(this.cfr_renamed_27)) {
            this.cfr_renamed_12(((a_0)this).cfr_renamed_10);
            this.cfr_renamed_34();
            this.var_fb_arr_do[this.cfr_renamed_9].var_byte_do = (byte)this.cfr_renamed_27;
        }
        this.cfr_renamed_27 = var_int_arr_case[8];
        this.cfr_renamed_0(var_int_arr_case[1]);
    }

    public bm() {
        this.var_fb_arr_arr_do = new fb[var_int_arr_case[6]][var_int_arr_case[6]];
        this.var_int_arr_new = new int[var_int_arr_case[5]];
        this.var_fb_arr_do = new fb[var_int_arr_case[5]];
        this.var_fb_arr_if = new fb[var_int_arr_case[4]];
        this.var_int_arr_arr_if = new int[var_int_arr_case[6]][var_int_arr_case[0]];
        this.var_int_arr_arr_do = new int[var_int_arr_case[6]][var_int_arr_case[4]];
        this.var_int_arr_int = new int[var_int_arr_case[6]];
        this.var_int_arr_if = new int[var_int_arr_case[6]];
        this.var_int_arr_arr_for = new int[var_int_arr_case[6]][var_int_arr_case[7]];
        this.var_byte_arr_if = new byte[var_int_arr_case[6]];
        this.var_byte_arr_do = new byte[var_int_arr_case[6]];
        this.var_int_arr_for = new int[var_int_arr_case[6]];
        this.cfr_renamed_34 = var_int_arr_case[15];
        this.cfr_renamed_38 = var_int_arr_case[16];
        this.cfr_renamed_14 = var_int_arr_case[17];
        this.cfr_renamed_26 = var_int_arr_case[1];
        this.var_boolean_try = var_int_arr_case[1];
        this.cfr_renamed_27 = var_int_arr_case[8];
        this.var_int_arr_try = new int[var_int_arr_case[13]];
        this.cfr_renamed_25 = var_int_arr_case[1];
        this.cfr_renamed_24();
        this.var_ei_char = new ei(MenuChinhAvatar.cL, var_int_arr_case[18]);
        this.var_ei_byte = new ei(MenuChinhAvatar.bM, var_int_arr_case[19]);
        this.var_ei_case = new ei(MenuChinhAvatar.w, var_int_arr_case[20]);
        GameCanvas.var_gj_0_do.cfr_renamed_5();
    }

        /*
     * Unable to fully structure code
     */
    private static fb[] fb_arr_do(fb[] var0) {
        var1_1 = bm.var_int_arr_case[1];
        if (-" ".length() <= "   ".length()) ** GOTO lbl19
        return null;
lbl-1000:
        // 1 sources

        {
            var2_2 = var1_1 + bm.var_int_arr_case[3];
            if ((22 + 132 - 141 + 176 ^ 96 + 58 - 138 + 168) > 0) ** GOTO lbl17
            return null;
lbl-1000:
            // 1 sources

            {
                if (bm.boolean_do((int)var0[var2_2].var_byte_if, bm.var_int_arr_case[2])) {
                    var3_3 = var0[var1_1];
                    if (!bm.boolean_if((int)var3_3.var_byte_if, var0[var2_2].var_byte_if) || (var3_3.var_byte_if == bm.var_int_arr_case[2])) {
                        var0[var1_1] = var0[var2_2];
                        var0[var2_2] = var3_3;
                    }
                }
                ++var2_2;
lbl17:
                // 2 sources

                ** while (!bm.cfr_renamed_5((int)var2_2, (int)var0.length))
            }
lbl18:
            // 1 sources

            ++var1_1;
lbl19:
            // 2 sources

            ** while (!bm.cfr_renamed_5((int)var1_1, (int)(var0.length - bm.var_int_arr_case[3])))
        }
lbl20:
        // 1 sources

        return var0;
    }

    private static boolean boolean_byte(int n) {
        return n >= 0;
    }
}

