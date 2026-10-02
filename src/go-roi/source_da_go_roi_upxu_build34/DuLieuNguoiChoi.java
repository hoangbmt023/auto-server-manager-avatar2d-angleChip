/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

/*
 * Renamed from dD
 */
public final class DuLieuNguoiChoi
extends bk_0 {
    public short var_short_do;
    public static ep var_ep_do;
    public boolean coKichHoat;
    public short var_short_if;
    private byte var_byte_class;
    public short var_short_for;
    public short var_short_try;
    public int[] mangSoNguyen;
    public short var_short_byte;
    private int var_int_final;
    public short cfr_renamed_8;
    public Vector var_java_util_Vector_if;
    public boolean var_boolean_int;
    public int soLuong;
    public eq_0 var_eq_0_do;
    public short var_short_char;
    private v_0 var_v_0_do;
    public short var_short_else;
    private int var_int_float;
    public DuLieuNguoiChoi duLieuNguoiChoi;
    private short cfr_renamed_23;
    private boolean var_boolean_try;
    public short var_short_goto;
    public int var_int_long;
    public short var_short_long;
    private int var_int_short;
    public boolean[][] var_boolean_arr_arr_do;
    public byte var_byte_do;
    private boolean var_boolean_byte;
    public short var_short_this;
    public byte var_byte_char;
    public short var_short_void;
    public short var_short_break;
    public short var_short_catch;
    public short var_short_class;
    public boolean cfr_renamed_5;
    private short cfr_renamed_24;
    public byte var_byte_else;
    public int var_int_this;
    private static byte[] var_byte_arr_do;
    public static ep var_ep_if;
    public int var_int_void;
    private short[] var_short_arr_do;
    private byte var_byte_const;
    private static final int[] var_int_arr_if;
    private short[] var_short_arr_if;
    public byte var_byte_goto;
    public int var_int_break;
    public int var_int_catch;
    public Vector var_java_util_Vector_for;
    private static byte[][] var_byte_arr_arr_do;
    public short var_short_const;
    public byte var_byte_long;
    public int var_int_class;
    public byte var_byte_this;
    private short cfr_renamed_25;
    private short[] var_short_arr_for;
    public short var_short_final;
    private byte var_byte_final;
    public String tenNhanVat;
    public short var_short_float;
    public static ep var_ep_for;
    public int var_int_const;
    public byte var_byte_void;
    public String chuoiPhu;
    public short var_short_short;
    public short cfr_renamed_14;
    public Vector var_java_util_Vector_int;
    public String var_java_lang_String_int;
    public String[] var_java_lang_String_arr_do;
    public byte var_byte_break;
    public byte var_byte_catch;

    public final void (Graphics graphics == null) {
        if (DuLieuNguoiChoi.boolean_int((((bk_0)this).cfr_renamed_3 + var_int_arr_if[12]) * aG.var_int_int, ek_0.ek_0_do().soLuong) && DuLieuNguoiChoi.cfr_renamed_8((((bk_0)this).cfr_renamed_3 - var_int_arr_if[12]) * aG.var_int_int, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && DuLieuNguoiChoi.boolean_int(this.dangChayAuto ? 1 : 0) && (!DuLieuNguoiChoi.boolean_try(GameCanvas.cfr_renamed_16) || (GameCanvas.var_dL_do != ec.cfr_renamed_0()))) {
            q_0 q_02;
            if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[13])) {
                int n;
                if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                    n = var_int_arr_if[4];
                    if (" ".length() < " ".length()) {
                        return;
                    }
                } else {
                    n = var_int_arr_if[14];
                }
                graphics.drawImage(ef_0.var_javax_microedition_lcdui_Image_if, (((bk_0)this).cfr_renamed_3 + n) * aG.var_int_int, (((bk_0)this).cfr_renamed_1 - var_int_arr_if[2]) * aG.var_int_int, var_int_arr_if[5]);
            }
            int n = this.var_java_util_Vector_if.size();
            int n2 = var_int_arr_if[1];
            int n3 = var_int_arr_if[1];
            while ((n3 < n)) {
                q_02 = ci_0.q_0_do(((ef)this.var_java_util_Vector_if.elementAt((int)n3)).var_short_do);
                if (!(!(q_02 != null) || DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[13]) && (q_02.var_byte_if != var_int_arr_if[10]) && (q_02.var_byte_if != var_int_arr_if[15]) && !(q_02.var_byte_if == var_int_arr_if[16]))) {
                    if ((q_02.var_byte_if == var_int_arr_if[15])) {
                        if ((this.var_short_final != var_int_arr_if[0])) {
                            q_02 = ci_0.q_0_do(this.var_short_final);
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        } else if ((!(this.var_short_final != var_int_arr_if[0]) || (this.var_short_final == var_int_arr_if[17])) && (this.cfr_renamed_24 < var_int_arr_if[2] + this.var_byte_void)) {
                            n2 = var_int_arr_if[2];
                        }
                    }
                    if ((ef_0.soLuong != var_int_arr_if[18]) && !(ef_0.soLuong == var_int_arr_if[19]) || !DuLieuNguoiChoi.boolean_int(ci_0.boolean_do((int)q_02.var_byte_if) ? 1 : 0) || (q_02.var_byte_if == var_int_arr_if[20])) {
                        q_02.cfr_renamed_0(graphics, this.var_int_byte, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, (((bk_0)this).cfr_renamed_1 + this.var_byte_try + this.var_byte_else + this.var_short_new) * aG.var_int_int, ((bk_0)this).cfr_renamed_3);
                        if (DuLieuNguoiChoi.boolean_for(n2)) {
                            n2 = var_int_arr_if[1];
                            q_02 = ci_0.q_0_do(var_int_arr_if[21]);
                            if ((ef_0.soLuong != var_int_arr_if[18]) && !(ef_0.soLuong == var_int_arr_if[19]) || !DuLieuNguoiChoi.boolean_int(ci_0.boolean_do((int)q_02.var_byte_if) ? 1 : 0) || (q_02.var_byte_if == var_int_arr_if[20])) {
                                q_02.cfr_renamed_0(graphics, this.var_int_byte, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, (((bk_0)this).cfr_renamed_1 + this.var_byte_try + this.var_byte_else + this.var_short_new) * aG.var_int_int, ((bk_0)this).cfr_renamed_3);
                            }
                        }
                    }
                }
                ++n3;
                if ("  ".length() >= 0) continue;
                return;
            }
            if ((!DuLieuNguoiChoi.boolean_for(ey_0.cfr_renamed_0().mangSoNguyen[var_int_arr_if[1]]) || (this == ef_0.var_aG_do)) && (ef_0.soLuong != var_int_arr_if[18])) {
                this.cfr_renamed_0(graphics, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, (((bk_0)this).cfr_renamed_1 + this.var_short_new) * aG.var_int_int - bn_0.cfr_renamed_8);
            }
            if ((this.var_v_0_do != null)) {
                q_02 = graphics;
                v_0 v_02 = this.var_v_0_do;
                n3 = var_int_arr_if[1];
                while ((n3 < var_int_arr_if[5])) {
                    var_ep_for.cfr_renamed_0(v_02.var_byte_arr_for[n3] / var_int_arr_if[5], (v_02.var_int_if + v_02.var_int_arr_if[n3]) * bn_0.cfr_renamed_6, (v_02.soLuong + v_02.mangSoNguyen[n3]) * bn_0.cfr_renamed_6, var_int_arr_if[1], var_int_arr_if[5], (Graphics)q_02);
                    ++n3;
                    if (-" ".length() <= 0) continue;
                    return;
                }
            }
            if (DuLieuNguoiChoi.boolean_try(this.var_byte_const) && (this.var_int_break == var_int_arr_if[14])) {
                int n4;
                if (DuLieuNguoiChoi.boolean_int(GameCanvas.var_int_try % var_int_arr_if[17], var_int_arr_if[5])) {
                    n4 = var_int_arr_if[1];
                    } else {
                    n4 = var_int_arr_if[2];
                }
                var_ep_do.cfr_renamed_0(n4, ((bk_0)this).cfr_renamed_3 * aG.var_int_int, ((bk_0)this).cfr_renamed_1 * aG.var_int_int - ((bk_0)this).cfr_renamed_4 / var_int_arr_if[4], var_int_arr_if[1], var_int_arr_if[5], graphics);
            }
            super.cfr_renamed_0(graphics);
        }
    }

    private static boolean boolean_do(int n) {
        return n <= 0;
    }

    public final void void_if() {
        this.var_boolean_byte = var_int_arr_if[1];
        try {
            int n = var_int_arr_if[1];
            while ((n < this.var_java_util_Vector_if.size() - var_int_arr_if[2])) {
                ef ef2 = (ef)this.var_java_util_Vector_if.elementAt(n);
                if ((ci_0.q_0_do(ef2.var_short_do) != null)) {
                    int n2 = n + var_int_arr_if[2];
                    while ((n2 < this.var_java_util_Vector_if.size())) {
                        ef ef3 = (ef)this.var_java_util_Vector_if.elementAt(n2);
                        if (DuLieuNguoiChoi.cfr_renamed_18(ci_0.q_0_do((short)ef3.var_short_do).var_short_do, var_int_arr_if[3])) {
                            this.var_boolean_byte = var_int_arr_if[2];
                        }
                        if ((ci_0.q_0_do(ef3.var_short_do) != null) && DuLieuNguoiChoi.cfr_renamed_2(ci_0.q_0_do((short)ef2.var_short_do).var_byte_if, ci_0.q_0_do((short)ef3.var_short_do).var_byte_if)) {
                            this.var_java_util_Vector_if.setElementAt(ef2, n2);
                            this.var_java_util_Vector_if.setElementAt(ef3, n);
                            ef2 = ef3;
                        }
                        ++n2;
                        if (((3 ^ 0x1D ^ (0x9A ^ 0xB3)) & (0xE1 ^ 0xBD ^ (0xFB ^ 0x90) ^ -" ".length())) < " ".length()) continue;
                        return;
                    }
                }
                ++n;
                return;
            }
            return;
        }
        catch (Exception exception) {
            this.var_boolean_byte = var_int_arr_if[2];
            return;
        }
    }

    public final void (short s2 == null) {
        this.var_short_short = s2;
        bq_0 bq_02 = ef_0.bq_0_do(((bk_0)this).cfr_renamed_12);
        if ((bq_02 != null)) {
            ef_0.cfr_renamed_0(bq_02);
            this.var_short_short = s2;
        }
        this.cfr_renamed_18();
    }

    public final void (byte by2 == null) {
        if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[11])) {
            if ((by2 != var_int_arr_if[4]) && (by2 != var_int_arr_if[36]) && (by2 != var_int_arr_if[0])) {
                if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[13])) {
                    ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
                    }
            } else {
                short s2 = ef_0.var_short_arr_if[(((bk_0)this).cfr_renamed_1 - var_int_arr_if[12]) / ef_0.var_int_if * ef_0.var_short_if + ((bk_0)this).cfr_renamed_3 / ef_0.var_int_if];
                if ((s2 != var_int_arr_if[40]) && (s2 != var_int_arr_if[46]) && (s2 != var_int_arr_if[41])) {
                    if (!(s2 != var_int_arr_if[39]) || (s2 == var_int_arr_if[37])) {
                        this.var_byte_else = (byte)var_int_arr_if[38];
                        }
                } else {
                    this.var_byte_else = (byte)var_int_arr_if[47];
                    if ((s2 == var_int_arr_if[46])) {
                        this.var_byte_else = (byte)(var_int_arr_if[47] * aG.var_int_int);
                    }
                }
                ((bk_0)this).cfr_renamed_4 = by2;
            }
            if ((by2 == var_int_arr_if[11])) {
                this.cfr_renamed_5();
                return;
            }
            if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_short_char)) {
                this.var_java_util_Vector_for.addElement(new eq_0(var_int_arr_if[3], var_int_arr_if[3], by2));
                return;
            }
            ((bk_0)this).cfr_renamed_4 = by2;
        }
    }

    public final void cfr_renamed_3() {
        int n;
        int n2 = ef_0.var_int_if * bn_0.cfr_renamed_6;
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_3 / ef_0.var_int_if, this.var_eq_0_do.var_int_if / n2) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_1 / ef_0.var_int_if, this.var_eq_0_do.soLuong / n2)) {
            this.void_for(this.var_eq_0_do.var_int_if / n2 * ef_0.var_int_if + this.var_eq_0_do.var_int_if % n2 / var_int_arr_if[4], this.var_eq_0_do.soLuong / n2 * ef_0.var_int_if + this.var_eq_0_do.soLuong % n2 / var_int_arr_if[4]);
            return;
        }
        int n3 = this.var_eq_0_do.soLuong / n2;
        n2 = this.var_eq_0_do.var_int_if / n2;
        int n4 = ((bk_0)this).cfr_renamed_1 / ef_0.var_int_if;
        int n5 = ((bk_0)this).cfr_renamed_3 / ef_0.var_int_if;
        DuLieuNguoiChoi dd_02 = this;
        int n6 = var_int_arr_if[2];
        int n7 = var_int_arr_if[1];
        int[] nArray = new int[var_int_arr_if[0]];
        nArray[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        nArray[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[2];
        nArray[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        int[] nArray2 = nArray;
        int[] nArray3 = new int[var_int_arr_if[0]];
        nArray3[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[3];
        nArray3[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[1];
        nArray3[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        nArray3[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[2];
        int[] nArray4 = nArray3;
        int n8 = var_int_arr_if[1];
        int n9 = var_int_arr_if[1];
        while ((n9 < dd_02.var_boolean_arr_arr_do.length * dd_02.var_boolean_arr_arr_do[var_int_arr_if[1]].length)) {
            dd_02.var_short_arr_do[n9] = var_int_arr_if[1];
            dd_02.var_short_arr_for[n9] = var_int_arr_if[1];
            dd_02.var_short_arr_if[n9] = var_int_arr_if[1];
            if ((ef_0.var_short_arr_if[n9] != var_int_arr_if[45]) && DuLieuNguoiChoi.boolean_int(ef_0.boolean_if(ef_0.var_short_arr_if[n9]) ? 1 : 0)) {
                dd_02.var_boolean_arr_arr_do[n9 % ef_0.var_short_if][n9 / ef_0.var_short_if] = var_int_arr_if[2];
                if (-" ".length() >= (0x77 ^ 0x73)) {
                    return;
                }
            } else {
                dd_02.var_boolean_arr_arr_do[n9 % ef_0.var_short_if][n9 / ef_0.var_short_if] = var_int_arr_if[1];
            }
            ++n9;
            if ("  ".length() >= 0) continue;
            return;
        }
        if (DuLieuNguoiChoi.boolean_for(ef_0.cfr_renamed_3(ef_0.int_if(n2 * ef_0.var_int_if, n3 * ef_0.var_int_if)) ? 1 : 0)) {
            dd_02.var_boolean_arr_arr_do[n2][n3] = var_int_arr_if[1];
        }
        dd_02.var_short_arr_do[DuLieuNguoiChoi.var_int_arr_if[1]] = (short)((n4 << var_int_arr_if[27]) + n5);
        while (DuLieuNguoiChoi.boolean_int(n8) && (n7 < n6)) {
            n5 = dd_02.var_short_arr_do[n7] & var_int_arr_if[26];
            n4 = dd_02.var_short_arr_do[n7] >> var_int_arr_if[27];
            n = var_int_arr_if[1];
            while ((n < var_int_arr_if[0]) && DuLieuNguoiChoi.boolean_int(n8)) {
                n9 = n5 + nArray2[n];
                int n10 = n4 + nArray4[n];
                if (DuLieuNguoiChoi.boolean_new(n9) && (n9 < dd_02.var_boolean_arr_arr_do.length) && DuLieuNguoiChoi.boolean_new(n10) && (n10 < dd_02.var_boolean_arr_arr_do[var_int_arr_if[1]].length) && DuLieuNguoiChoi.boolean_int(dd_02.var_boolean_arr_arr_do[n9][n10])) {
                    dd_02.var_short_arr_for[n6] = dd_02.var_short_arr_do[n7];
                    dd_02.var_short_arr_do[n6++] = (short)((n10 << var_int_arr_if[27]) + n9);
                    dd_02.var_boolean_arr_arr_do[n9][n10] = var_int_arr_if[2];
                    if ((n2 == n9) && (n3 == n10)) {
                        n8 = var_int_arr_if[2];
                    }
                }
                if (DuLieuNguoiChoi.boolean_int(n6, dd_02.var_boolean_arr_arr_do.length * dd_02.var_boolean_arr_arr_do[var_int_arr_if[1]].length)) {
                    n8 = var_int_arr_if[2];
                    if (-"   ".length() < 0) break;
                    return;
                }
                ++n;
                if (((0x92 ^ 0x94) & ~(0x92 ^ 0x94)) <= (0xA5 ^ 0xA1)) continue;
                return;
            }
            ++n7;
            if (-" ".length() < (0x1B ^ 0x71 ^ (0xE3 ^ 0x8D))) continue;
            return;
        }
        dd_02.var_int_class = var_int_arr_if[1];
        if (DuLieuNguoiChoi.boolean_for(n8)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_4();
            n = n6 - var_int_arr_if[2];
            int n11 = dd_02.var_int_class;
            dd_02.var_int_class = n11 + var_int_arr_if[2];
            dd_02.var_short_arr_if[n11] = dd_02.var_short_arr_do[n];
            block3: while (DuLieuNguoiChoi.boolean_try(n)) {
                n5 = var_int_arr_if[1];
                while ((n5 < n6)) {
                    if ((dd_02.var_short_arr_do[n5] == dd_02.var_short_arr_for[n])) {
                        n = n5;
                        int n12 = dd_02.var_int_class;
                        dd_02.var_int_class = n12 + var_int_arr_if[2];
                        dd_02.var_short_arr_if[n12] = dd_02.var_short_arr_do[n5];
                        if (((241 + 169 - 263 + 107 ^ 102 + 145 - 145 + 74) & (0xF1 ^ 0x91 ^ (0x52 ^ 0x7C) ^ -" ".length())) >= -" ".length()) continue block3;
                        return;
                    }
                    ++n5;
                    if ((0x81 ^ 0x85) != "  ".length()) continue;
                    return;
                }
            }
        }
        dd_02.var_int_class -= var_int_arr_if[2];
        if (DuLieuNguoiChoi.boolean_int(n8)) {
            this.var_int_class = var_int_arr_if[1];
            if ((this == AngelChip.duLieuNguoiChoi)) {
                ef_0.var_int_else = var_int_arr_if[3];
            }
        }
    }

    private void cfr_renamed_15(int n) {
        if (DuLieuNguoiChoi.cfr_renamed_2(n, ((bk_0)this).cfr_renamed_3)) {
            ((bk_0)this).cfr_renamed_3 = (byte)var_int_arr_if[1];
            return;
        }
        if (DuLieuNguoiChoi.cfr_renamed_15(n, ((bk_0)this).cfr_renamed_3)) {
            ((bk_0)this).cfr_renamed_3 = bk_0.var_byte_case;
        }
    }

        public DuLieuNguoiChoi() {
        int[] nArray = new int[var_int_arr_if[0]];
        nArray[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        nArray[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        nArray[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        this.mangSoNguyen = nArray;
        this.var_java_lang_String_int = "";
        this.var_java_util_Vector_for = new Vector();
        this.coKichHoat = var_int_arr_if[1];
        this.var_byte_long = (byte)var_int_arr_if[3];
        this.var_boolean_byte = var_int_arr_if[1];
        this.var_boolean_try = var_int_arr_if[1];
        this.var_int_break = var_int_arr_if[1];
        this.var_int_catch = var_int_arr_if[3];
        this.var_int_final = var_int_arr_if[1];
        this.var_short_final = (short)var_int_arr_if[0];
        this.var_short_this = (short)var_int_arr_if[1];
        this.var_short_short = (short)var_int_arr_if[3];
        this.var_short_if = (short)var_int_arr_if[3];
        this.var_short_goto = (short)var_int_arr_if[1];
        this.var_short_byte = (short)var_int_arr_if[3];
        this.var_short_catch = (short)var_int_arr_if[3];
        this.var_int_float = var_int_arr_if[1];
        this.var_byte_break = (byte)var_int_arr_if[3];
        this.var_byte_char = (byte)var_int_arr_if[1];
        this.var_byte_do = (byte)var_int_arr_if[3];
        this.var_short_const = (short)var_int_arr_if[6];
        this.var_short_for = (short)var_int_arr_if[7];
        this.var_short_try = (short)var_int_arr_if[1];
        this.var_short_else = (short)var_int_arr_if[1];
        this.cfr_renamed_8 = (short)var_int_arr_if[6];
        this.var_short_char = (short)var_int_arr_if[6];
        this.var_byte_const = (byte)var_int_arr_if[1];
        this.var_short_do = (short)var_int_arr_if[1];
        this.var_int_class = var_int_arr_if[1];
        ((bk_0)this).cfr_renamed_1 = var_int_arr_if[1];
        ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[8];
        this.var_byte_class = (byte)gc_0.int_do(var_int_arr_if[9]);
        this.var_byte_final = (byte)(gc_0.int_do(var_int_arr_if[10]) + var_int_arr_if[11]);
    }

    private static boolean boolean_int(int n, int n2) {
        return n >= n2;
    }

    private boolean cfr_renamed_5(int n, int n2) {
        boolean bl = this.boolean_if(n, n2);
        if (DuLieuNguoiChoi.boolean_for(bl ? 1 : 0)) {
            this.boolean_do(n, n2);
            }
        return bl;
    }

    public final boolean boolean_for(int n, int n2) {
        if (!(DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_4) && !DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2]) || DuLieuNguoiChoi.boolean_for(this.var_int_break) && !(this.var_int_break == var_int_arr_if[33]))) {
            short s2 = ef_0.var_short_arr_if[n2 / ef_0.var_int_if * ef_0.var_short_if + n / ef_0.var_int_if];
            if ((s2 != var_int_arr_if[40]) && (s2 != var_int_arr_if[46]) && (s2 != var_int_arr_if[41])) {
                if ((s2 == var_int_arr_if[39])) {
                    ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[4];
                    this.var_byte_else = (byte)var_int_arr_if[38];
                    ((bk_0)this).cfr_renamed_3 = (byte)(n / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if / var_int_arr_if[4]);
                    ((bk_0)this).cfr_renamed_1 = n2 / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if - var_int_arr_if[2];
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0((int)((bk_0)this).cfr_renamed_3, n2, ((bk_0)this).cfr_renamed_3, this.var_short_new);
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(var_int_arr_if[4]);
                    return var_int_arr_if[2];
                }
                if ((s2 == var_int_arr_if[37])) {
                    ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[0];
                    this.var_byte_else = (byte)var_int_arr_if[38];
                    ((bk_0)this).cfr_renamed_3 = (byte)(n / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if / var_int_arr_if[4]);
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_0((int)((bk_0)this).cfr_renamed_3, n2, ((bk_0)this).cfr_renamed_3, this.var_short_new);
                    fe_0.fe_0_do();
                    fe_0.cfr_renamed_1(var_int_arr_if[0]);
                    return var_int_arr_if[2];
                }
                return var_int_arr_if[1];
            }
            ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[4];
            this.var_byte_else = (byte)var_int_arr_if[47];
            ((bk_0)this).cfr_renamed_3 = (byte)(n / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if / var_int_arr_if[4]);
            ((bk_0)this).cfr_renamed_1 = n2 / ef_0.var_int_if * ef_0.var_int_if + ef_0.var_int_if - var_int_arr_if[2];
            fe_0.fe_0_do();
            fe_0.cfr_renamed_0((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 ? 1 : 0, ((bk_0)this).cfr_renamed_3, this.var_short_new);
            fe_0.fe_0_do();
            fe_0.cfr_renamed_1(((bk_0)this).cfr_renamed_4);
            return var_int_arr_if[2];
        }
        return var_int_arr_if[1];
    }

        private static boolean boolean_if(int n) {
        return n < 0;
    }

    private void void_int(int n, int n2) {
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[0])) {
            if (DuLieuNguoiChoi.cfr_renamed_18(ef_0.int_do((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - var_int_arr_if[48]), var_int_arr_if[3])) {
                return;
            }
            if (DuLieuNguoiChoi.cfr_renamed_18(ef_0.int_if(((bk_0)this).cfr_renamed_3 + n * var_int_arr_if[43], ((bk_0)this).cfr_renamed_1 + n2 * var_int_arr_if[43] - var_int_arr_if[11]), var_int_arr_if[45])) {
                ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
                this.var_byte_else = (byte)var_int_arr_if[1];
            }
        }
    }

    public final void (Graphics graphics, int n, int n2, boolean bl == null) {
        int n3;
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
            n3 = var_int_arr_if[4];
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else {
            n3 = var_int_arr_if[14];
        }
        graphics.drawImage(ef_0.var_javax_microedition_lcdui_Image_if, n + n3, n2 - var_int_arr_if[2], var_int_arr_if[5]);
        if ((this.var_java_util_Vector_if != null)) {
            int n4 = this.var_java_util_Vector_if.size();
            int n5 = var_int_arr_if[1];
            while ((n5 < n4)) {
                q_0 q_02 = ci_0.q_0_do(((ef)this.var_java_util_Vector_if.elementAt((int)n5)).var_short_do);
                if ((q_02 != null)) {
                    if ((q_02.var_byte_if == var_int_arr_if[15]) && (this.var_short_final != var_int_arr_if[0])) {
                        q_02 = ci_0.q_0_do(this.var_short_final);
                    }
                    q_02.cfr_renamed_0(graphics, this.var_int_byte, n, n2, ((bk_0)this).cfr_renamed_3);
                }
                ++n5;
                if (((152 + 95 - 193 + 166 ^ 25 + 12 - 27 + 142) & (82 + 169 - 65 + 47 ^ 162 + 126 - 238 + 123 ^ -" ".length())) == 0) continue;
                return;
            }
        }
        if (DuLieuNguoiChoi.boolean_for(bl ? 1 : 0)) {
            this.cfr_renamed_0(graphics, n, n2 - bn_0.cfr_renamed_8);
        }
        super.cfr_renamed_0(graphics);
    }

    public final void cfr_renamed_4() {
        this.var_byte_byte = (byte)var_int_arr_if[1];
        this.var_byte_try = (byte)var_int_arr_if[1];
        ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
    }

        private void this() {
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[13])) {
            ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
            this.void_do(fe.fe_do().var_int_if, fe.fe_do().soLuong);
            db_0.db_0_do().cfr_renamed_12(var_int_arr_if[1]);
            fe_0.fe_0_do();
            fe_0.cfr_renamed_0(AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, (int)AngelChip.duLieuNguoiChoi.var_short_if, AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_goto);
            GameCanvas.var_boolean_arr_for[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[1];
        }
    }

        public final void void_do(int n) {
        this.var_short_final = (short)n;
    }

    public final void void_if(int n) {
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[4]] = n;
    }

    public final void cfr_renamed_5() {
        if (!DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_4) || DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2])) {
            ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[11];
            if ((this.var_int_catch == var_int_arr_if[3])) {
                this.var_int_catch = var_int_arr_if[1];
            }
            this.var_byte_byte = -this.var_byte_new;
        }
    }

    static {
        DuLieuNguoiChoi.cfr_renamed_6();
        byte[][] byArrayArray = new byte[var_int_arr_if[12]][];
        byte[] byArray = new byte[var_int_arr_if[11]];
        byArray[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        byArray[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[1];
        byArray[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        byArray[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        byArray[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[1];
        byArray[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[2];
        byArray[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[2];
        byArray[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[2];
        byArray[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[2];
        byArray[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[2];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[1]] = byArray;
        byte[] byArray2 = new byte[var_int_arr_if[11]];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[1];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[1];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[4];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[4];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[4];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[4];
        byArray2[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[4];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[2]] = byArray2;
        byte[] byArray3 = new byte[var_int_arr_if[11]];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[5];
        byArray3[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[5];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[4]] = byArray3;
        byte[] byArray4 = new byte[var_int_arr_if[11]];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[0];
        byArray4[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[0];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[5]] = byArray4;
        byte[] byArray5 = new byte[var_int_arr_if[11]];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[30];
        byArray5[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[30];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[0]] = byArray5;
        byte[] byArray6 = new byte[var_int_arr_if[11]];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[17];
        byArray6[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[17];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[30]] = byArray6;
        byte[] byArray7 = new byte[var_int_arr_if[11]];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[22];
        byArray7[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[22];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[17]] = byArray7;
        byte[] byArray8 = new byte[var_int_arr_if[11]];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[27];
        byArray8[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[27];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[22]] = byArray8;
        byte[] byArray9 = new byte[var_int_arr_if[11]];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[9];
        byArray9[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[9];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[27]] = byArray9;
        byte[] byArray10 = new byte[var_int_arr_if[11]];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[11];
        byArray10[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[11];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[9]] = byArray10;
        byte[] byArray11 = new byte[var_int_arr_if[11]];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[29];
        byArray11[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[29];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[11]] = byArray11;
        byte[] byArray12 = new byte[var_int_arr_if[11]];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[43];
        byArray12[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[43];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[29]] = byArray12;
        byte[] byArray13 = new byte[var_int_arr_if[11]];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[36];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[14];
        byArray13[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[36];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[43]] = byArray13;
        byte[] byArray14 = new byte[var_int_arr_if[11]];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[13];
        byArray14[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[13];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[36]] = byArray14;
        byte[] byArray15 = new byte[var_int_arr_if[11]];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[1];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[0]] = var_int_arr_if[1];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[30]] = var_int_arr_if[2];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[17]] = var_int_arr_if[2];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[22]] = var_int_arr_if[2];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[2];
        byArray15[DuLieuNguoiChoi.var_int_arr_if[9]] = var_int_arr_if[2];
        byArrayArray[DuLieuNguoiChoi.var_int_arr_if[13]] = byArray15;
        var_byte_arr_arr_do = byArrayArray;
        byte[] byArray16 = new byte[var_int_arr_if[5]];
        byArray16[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[51];
        byArray16[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[1];
        byArray16[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[2];
        var_byte_arr_do = byArray16;
    }

    private static boolean boolean_for(int n) {
        return n != 0;
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }

    public final void void_if(int n, int n2) {
        int n3 = var_int_arr_if[1];
        while ((n3 < this.var_java_util_Vector_if.size() - var_int_arr_if[2])) {
            ef ef2 = (ef)this.var_java_util_Vector_if.elementAt(n3);
            q_0 q_02 = ci_0.q_0_do(ef2.var_short_do);
            if ((n2 == q_02.var_byte_if)) {
                this.var_java_util_Vector_if.removeElement(ef2);
                if (" ".length() >= -" ".length()) break;
                return;
            }
            ++n3;
            if ("   ".length() > "  ".length()) continue;
            return;
        }
        this.cfr_renamed_1(new ef((short)n));
    }

    private static boolean boolean_new(int n) {
        return n >= 0;
    }

    public final void cfr_renamed_2() {
        block93: {
            int n;
            block94: {
                block97: {
                    DuLieuNguoiChoi dd_02;
                    Object object;
                    block96: {
                        block95: {
                            if (DuLieuNguoiChoi.boolean_do(this.cfr_renamed_24)) {
                                this.cfr_renamed_24 = (short)(var_int_arr_if[11] + gc_0.int_do(var_int_arr_if[28]) / (this.var_byte_void + var_int_arr_if[2]));
                            }
                            this.cfr_renamed_24 = (short)(this.cfr_renamed_24 - var_int_arr_if[2]);
                            this.var_byte_class = (byte)(this.var_byte_class + var_int_arr_if[2]);
                            if (DuLieuNguoiChoi.boolean_int(this.var_byte_class, var_int_arr_if[11])) {
                                this.var_byte_class = (byte)var_int_arr_if[1];
                            }
                            if (DuLieuNguoiChoi.boolean_if(((bk_0)this).cfr_renamed_4)) {
                                this.var_int_byte = var_byte_arr_arr_do[var_int_arr_if[1]][this.var_byte_class];
                                if ("  ".length() >= "   ".length()) {
                                    return;
                                }
                            } else if (DuLieuNguoiChoi.cfr_renamed_15(((bk_0)this).cfr_renamed_4, var_byte_arr_arr_do.length)) {
                                this.var_int_byte = var_byte_arr_arr_do[((bk_0)this).cfr_renamed_4][this.var_byte_class];
                            }
                            if (!DuLieuNguoiChoi.boolean_int(this.var_short_this) || !(this.var_short_final != var_int_arr_if[29]) || !(this.var_short_final != var_int_arr_if[22]) || (this.var_short_final == var_int_arr_if[9])) {
                                if (DuLieuNguoiChoi.boolean_int(this.var_short_this)) {
                                    this.var_short_break = this.var_short_final;
                                }
                                this.var_short_this = (short)(this.var_short_this + var_int_arr_if[2]);
                                if ((this.var_short_this % var_int_arr_if[11] > var_int_arr_if[30])) {
                                    if ((this.var_short_this > var_int_arr_if[31])) {
                                        this.var_short_this = (short)var_int_arr_if[1];
                                    }
                                    this.var_short_final = (short)var_int_arr_if[0];
                                    if (-" ".length() > " ".length()) {
                                        return;
                                    }
                                } else {
                                    this.var_short_final = n = this.var_short_break;
                                }
                            }
                            if ((this == AngelChip.duLieuNguoiChoi) && DuLieuNguoiChoi.boolean_int(this.var_int_break) && !(GameCanvas.var_dL_do == a_0.var_a_0_do) || !DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[11])) break block93;
                            if (!DuLieuNguoiChoi.cfr_renamed_8(gc_0.cfr_renamed_0(((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 + this.var_short_new, ((bk_0)this).cfr_renamed_11, this.var_int_new), ((bk_0)this).cfr_renamed_18)) break block94;
                            if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0) && DuLieuNguoiChoi.boolean_int(this.cfr_renamed_23)) {
                                this.cfr_renamed_23 = (short)var_int_arr_if[1];
                                ((bk_0)this).cfr_renamed_1 = var_int_arr_if[1];
                                this.var_short_new = (short)var_int_arr_if[1];
                            }
                            if ((this.duLieuNguoiChoi != null) && DuLieuNguoiChoi.boolean_int(this.var_byte_const)) {
                                if ((this.var_int_break == var_int_arr_if[14])) {
                                    this.var_byte_const = (byte)var_int_arr_if[25];
                                    if ("   ".length() <= "  ".length()) {
                                        return;
                                    }
                                } else if ((this.var_int_break == var_int_arr_if[29])) {
                                    this.var_byte_const = (byte)var_int_arr_if[10];
                                    this.var_short_final = (short)var_int_arr_if[32];
                                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[32];
                                    this.var_v_0_do = new v_0(((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 ? 1 : 0);
                                }
                            }
                            if ((this.var_int_break == var_int_arr_if[33])) {
                                this.var_byte_goto = ((bk_0)this).cfr_renamed_3;
                                ((bk_0)this).cfr_renamed_3 = (byte)((bk_0)this).cfr_renamed_11;
                                ((bk_0)this).cfr_renamed_1 = this.var_int_new;
                                if (DuLieuNguoiChoi.boolean_do(this.var_int_class)) {
                                    this.var_int_break = var_int_arr_if[1];
                                }
                                if ((GameCanvas.var_bt_0_do == null)) {
                                    fe_0.fe_0_do();
                                    fe_0.cfr_renamed_0((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 ? 1 : 0, ((bk_0)this).cfr_renamed_3, this.var_short_new);
                                }
                                if (DuLieuNguoiChoi.boolean_for(fe_0.var_boolean_try ? 1 : 0) && DuLieuNguoiChoi.cfr_renamed_18(AngelChip.duLieuNguoiChoi.var_short_char, ((bk_0)this).cfr_renamed_12)) {
                                    ((bk_0)this).cfr_renamed_3 = (byte)var_int_arr_if[1];
                                    if (-(0x54 ^ 0x50) >= 0) {
                                        return;
                                    }
                                }
                            } else {
                                if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_short_char)) {
                                    ((bk_0)this).cfr_renamed_11 = ((bk_0)this).cfr_renamed_3;
                                    this.var_int_new = ((bk_0)this).cfr_renamed_1 + this.var_short_new;
                                }
                                if (DuLieuNguoiChoi.boolean_int(this.var_java_util_Vector_for.size())) {
                                    if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2])) {
                                        ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
                                    }
                                    ((bk_0)this).cfr_renamed_3 = this.var_byte_goto;
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    object = (eq_0)this.var_java_util_Vector_for.elementAt(var_int_arr_if[1]);
                                    this.void_for(((eq_0)object).var_int_if, ((eq_0)object).soLuong + ((eq_0)object).var_short_do);
                                    this.cfr_renamed_23 = ((eq_0)object).var_short_do;
                                    if (DuLieuNguoiChoi.boolean_for(((eq_0)object).var_short_do)) {
                                        ((bk_0)this).cfr_renamed_1 = var_int_arr_if[2];
                                    }
                                    if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_11, var_int_arr_if[3]) && (this.var_int_new == var_int_arr_if[3])) {
                                        ((bk_0)this).cfr_renamed_11 = ((bk_0)this).cfr_renamed_3;
                                        this.var_int_new = ((bk_0)this).cfr_renamed_1 + this.var_short_new;
                                        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[13])) {
                                            ef_0.var_short_arr_if[((bk_0)this).cfr_renamed_1 / ef_0.var_int_if * ef_0.var_short_if + ((bk_0)this).cfr_renamed_3 / ef_0.var_int_if] = var_int_arr_if[34];
                                        }
                                        ((bk_0)this).cfr_renamed_4 = (byte)((eq_0)object).cfr_renamed_3;
                                        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[13])) {
                                            ((bk_0)this).cfr_renamed_1 = this.var_int_new;
                                            ((bk_0)this).cfr_renamed_3 = (byte)((bk_0)this).cfr_renamed_11;
                                            ef_0.var_short_arr_if[((bk_0)this).cfr_renamed_1 / ef_0.var_int_if * ef_0.var_short_if + ((bk_0)this).cfr_renamed_3 / ef_0.var_int_if] = var_int_arr_if[35];
                                        }
                                        if ((!DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[4]) || !DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[36]) || DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[0])) && DuLieuNguoiChoi.boolean_new(n = (((bk_0)this).cfr_renamed_1 - ef_0.var_int_if) / ef_0.var_int_if * ef_0.var_short_if + ((bk_0)this).cfr_renamed_3 / ef_0.var_int_if) && (n < ef_0.var_short_arr_if.length)) {
                                            if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[0]) && (ef_0.var_short_arr_if[n] == var_int_arr_if[37])) {
                                                this.var_byte_else = (byte)var_int_arr_if[38];
                                            }
                                            int n2 = ef_0.int_do((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - var_int_arr_if[11]);
                                            this.var_int_new = ((bk_0)this).cfr_renamed_1 ? 1 : 0;
                                            if ((n2 != var_int_arr_if[3])) {
                                                n = ef_0.var_short_arr_if[n2];
                                                if ((n == var_int_arr_if[39])) {
                                                    this.var_byte_else = (byte)var_int_arr_if[38];
                                                }
                                                if (!(n != var_int_arr_if[40]) || !(n != var_int_arr_if[39]) || !(n != var_int_arr_if[35]) || (n == var_int_arr_if[41])) {
                                                    ef_0.var_short_arr_if[n2] = var_int_arr_if[35];
                                                }
                                            }
                                            }
                                    } else {
                                        ((bk_0)this).cfr_renamed_3 = this.var_byte_goto = (byte)((eq_0)object).cfr_renamed_3;
                                    }
                                    this.var_java_util_Vector_for.removeElementAt(var_int_arr_if[1]);
                                }
                            }
                            if (!DuLieuNguoiChoi.boolean_for(this.var_int_break) || !(this.var_int_break != var_int_arr_if[33])) break block93;
                            if (!DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_12, this.var_int_this) || !(ef_0.dd_0_do(this.var_int_long) == null)) break block95;
                            this.var_int_break = var_int_arr_if[1];
                            this.var_int_long = var_int_arr_if[3];
                            if (((0x26 ^ 0x62) & ~(0x2F ^ 0x6B)) != 0) {
                                return;
                            }
                            break block93;
                        }
                        if (!(this.var_int_long != var_int_arr_if[3]) || !(this.var_int_this != var_int_arr_if[3])) break block93;
                        object = ef_0.dd_0_do(this.var_int_long);
                        dd_02 = ef_0.dd_0_do(this.var_int_this);
                        if (!(dd_02 != null) || !(object != null)) break block96;
                        if (DuLieuNguoiChoi.cfr_renamed_2(dd_02.coKichHoat ? 1 : 0, ((DuLieuNguoiChoi)object).coKichHoat ? 1 : 0)) {
                            dd_02.var_byte_goto = bk_0.var_byte_case;
                            dd_02.coKichHoat = dd_02.var_byte_goto;
                            int n3 = var_int_arr_if[1];
                            ((DuLieuNguoiChoi)object).var_byte_goto = (byte)n3;
                            ((DuLieuNguoiChoi)object).coKichHoat = n3;
                            if ("   ".length() <= 0) {
                                return;
                            }
                        } else {
                            int n4 = var_int_arr_if[1];
                            dd_02.var_byte_goto = (byte)n4;
                            dd_02.coKichHoat = n4;
                            ((DuLieuNguoiChoi)object).var_byte_goto = bk_0.var_byte_case;
                            ((DuLieuNguoiChoi)object).coKichHoat = ((DuLieuNguoiChoi)object).var_byte_goto;
                        }
                        if (!DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_12, this.var_int_long)) break block97;
                        if (DuLieuNguoiChoi.boolean_try(this.var_short_float)) {
                            this.var_short_float = (short)(this.var_short_float - var_int_arr_if[2]);
                            if (" ".length() < 0) {
                                return;
                            }
                        } else {
                            switch (this.var_int_break) {
                                case -3: {
                                    if ((ef_0.var_byte_do == var_int_arr_if[3])) {
                                        er_0 er_02 = new er_0(var_int_arr_if[4], var_int_arr_if[1]);
                                        GameCanvas.var_java_util_Vector_if.addElement(er_02);
                                    }
                                    this.var_int_break = var_int_arr_if[1];
                                    dd_02.var_int_break = var_int_arr_if[1];
                                    if ("   ".length() > " ".length()) break;
                                    return;
                                }
                                case 9: {
                                    if ((this == AngelChip.duLieuNguoiChoi)) {
                                        fe_0.fe_0_do();
                                        fe_0.cfr_renamed_1(var_int_arr_if[9]);
                                        if (((0x2F ^ 0x68) & ~(0xE7 ^ 0xA0)) != 0) {
                                            return;
                                        }
                                    } else if ((AngelChip.duLieuNguoiChoi.var_int_break == var_int_arr_if[27]) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_int_long)) {
                                        fe_0.fe_0_do();
                                        fe_0.cfr_renamed_1(var_int_arr_if[27]);
                                        AngelChip.duLieuNguoiChoi.var_int_break = var_int_arr_if[1];
                                    }
                                    fe_0.fe_0_do();
                                    fe_0.void_do(dd_02);
                                    this.var_int_break = var_int_arr_if[1];
                                    dd_02.var_int_break = var_int_arr_if[1];
                                    if (" ".length() != 0) break;
                                    return;
                                }
                                case 12: {
                                    dd_02.var_int_break = var_int_arr_if[1];
                                    this.var_int_break = var_int_arr_if[1];
                                }
                            }
                            this.var_int_const = var_int_arr_if[3];
                            this.var_int_long = var_int_arr_if[3];
                            this.var_int_this = var_int_arr_if[3];
                            if (-" ".length() > 0) {
                                return;
                            }
                        }
                        break block93;
                    }
                    if ((object != null)) {
                        ((DuLieuNguoiChoi)object).var_int_break = var_int_arr_if[1];
                        ((DuLieuNguoiChoi)object).var_short_do = (short)var_int_arr_if[1];
                    }
                    if ((dd_02 != null)) {
                        dd_02.var_int_break = var_int_arr_if[1];
                        dd_02.var_short_do = (short)var_int_arr_if[1];
                    }
                }
                if (-"  ".length() >= 0) {
                    return;
                }
                break block93;
            }
            this.var_int_float = gc_0.int_do(((bk_0)this).cfr_renamed_11 - ((bk_0)this).cfr_renamed_3, -(this.var_int_new - (((bk_0)this).cfr_renamed_1 + this.var_short_new)));
            int n5 = ((bk_0)this).cfr_renamed_18 * gc_0.int_new(this.var_int_float) >> var_int_arr_if[11];
            n = -(((bk_0)this).cfr_renamed_18 * gc_0.int_for(this.var_int_float)) >> var_int_arr_if[11];
            if (DuLieuNguoiChoi.boolean_for(this.var_boolean_try ? 1 : 0) && (this.var_int_break == var_int_arr_if[33]) && DuLieuNguoiChoi.boolean_for(AngelChip.duLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_3 + n5, ((bk_0)this).cfr_renamed_1 + this.var_short_new + n) ? 1 : 0)) {
                this.cfr_renamed_16();
                this.var_int_try = this.var_int_case = var_int_arr_if[1];
                if ("  ".length() == -" ".length()) {
                    return;
                }
            } else {
                this.var_int_try = n5;
                this.var_int_case = n;
                this.var_byte_byte = (byte)var_int_arr_if[1];
                this.var_byte_try = (byte)var_int_arr_if[1];
                this.var_byte_else = (byte)var_int_arr_if[1];
                this.cfr_renamed_15(((bk_0)this).cfr_renamed_3 + n5);
                if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_11)) {
                    this.cfr_renamed_10();
                }
                if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_1 + this.var_short_new, this.var_int_new)) {
                    this.cfr_renamed_10();
                }
                ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[2];
            }
        }
        if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0)) {
            ((bk_0)this).cfr_renamed_3 = (byte)(((bk_0)this).cfr_renamed_3 + this.var_int_try);
            this.var_short_new = (short)(this.var_short_new + this.var_int_case);
            if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_short_char) && (this.var_short_new < -this.var_short_goto)) {
                this.var_short_new = -this.var_short_goto;
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
        } else {
            ((bk_0)this).cfr_renamed_3 = (byte)(((bk_0)this).cfr_renamed_3 + this.var_int_try);
            ((bk_0)this).cfr_renamed_1 += this.var_int_case;
        }
        this.var_byte_try = (byte)(this.var_byte_try + this.var_byte_byte);
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[11])) {
            this.var_byte_byte = (byte)(this.var_byte_byte + var_int_arr_if[2]);
        }
        if (!(Math.abs(this.var_byte_byte) < this.var_byte_new) || (Math.abs(this.var_byte_try) > var_int_arr_if[42])) {
            ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
            this.var_byte_byte = (byte)var_int_arr_if[1];
            this.var_byte_try = (byte)var_int_arr_if[1];
        }
        if ((this.var_int_catch != var_int_arr_if[3]) && DuLieuNguoiChoi.boolean_int(((bk_0)this).cfr_renamed_4)) {
            this.var_int_catch += var_int_arr_if[2];
            if ((this.var_int_catch > this.var_byte_final)) {
                this.var_int_catch = var_int_arr_if[3];
                } else if (DuLieuNguoiChoi.boolean_int(this.var_int_catch % var_int_arr_if[17])) {
                this.cfr_renamed_5();
            }
        }
        if (DuLieuNguoiChoi.boolean_int(((bk_0)this).cfr_renamed_4)) {
            this.var_byte_else = (byte)var_int_arr_if[1];
        }
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2]) && DuLieuNguoiChoi.boolean_int(this.var_int_try) && DuLieuNguoiChoi.boolean_int(this.var_int_case)) {
            ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
        }
        this.var_int_try = var_int_arr_if[1];
        this.var_int_case = var_int_arr_if[1];
        if (DuLieuNguoiChoi.boolean_try(this.var_byte_const)) {
            this.var_byte_const = (byte)(this.var_byte_const - var_int_arr_if[2]);
            if (DuLieuNguoiChoi.boolean_int(this.var_byte_const)) {
                if ((this.var_int_break == var_int_arr_if[14])) {
                    this.duLieuNguoiChoi.var_boolean_int = var_int_arr_if[0];
                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[25];
                    ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[0];
                    this.var_short_final = (short)var_int_arr_if[25];
                    if ((0 ^ 5) == 0) {
                        return;
                    }
                } else if ((this.var_int_break == var_int_arr_if[29])) {
                    this.var_short_final = (short)var_int_arr_if[43];
                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[43];
                }
                this.var_int_break = var_int_arr_if[1];
                this.duLieuNguoiChoi.var_int_break = var_int_arr_if[1];
                this.duLieuNguoiChoi = null;
                this.var_v_0_do = null;
            }
        }
        if ((this.var_java_lang_String_arr_do != null)) {
            int n;
            int n6 = var_int_arr_if[23];
            String string = this.var_java_lang_String_arr_do[this.var_int_short / var_int_arr_if[15]];
            if (DuLieuNguoiChoi.boolean_int(this.var_int_long, var_int_arr_if[44])) {
                n = var_int_arr_if[2];
                if (-" ".length() >= " ".length()) {
                    return;
                }
            } else {
                n = var_int_arr_if[1];
            }
            this.var_cf_do = new cf(n6, string, (byte)n);
            this.var_int_short += var_int_arr_if[2];
            if (DuLieuNguoiChoi.boolean_int(this.var_int_short, this.var_java_lang_String_arr_do.length * var_int_arr_if[15])) {
                if (DuLieuNguoiChoi.boolean_int(((bk_0)this).cfr_renamed_12, var_int_arr_if[44])) {
                    this.var_int_short = var_int_arr_if[1];
                    if (((0x54 ^ 0x53) & ~(0x42 ^ 0x45)) != 0) {
                        return;
                    }
                } else {
                    this.var_java_lang_String_arr_do = null;
                }
            }
        }
        super.void_do();
    }

    public final void void_for(int n) {
        if (DuLieuNguoiChoi.boolean_if(n)) {
            this.var_int_byte = var_byte_arr_arr_do[var_int_arr_if[1]][this.var_byte_class];
            return;
        }
        this.var_int_byte = var_byte_arr_arr_do[n][this.var_byte_class];
    }

    private void cfr_renamed_16() {
        this.var_int_class = var_int_arr_if[1];
        this.var_boolean_try = var_int_arr_if[1];
        this.var_int_break = var_int_arr_if[1];
        if ((this == AngelChip.duLieuNguoiChoi)) {
            ef_0.var_int_else = var_int_arr_if[3];
            return;
        }
        this.var_eq_0_do = null;
        this.var_short_arr_do = null;
        this.var_short_arr_for = null;
        this.var_short_arr_if = null;
        this.var_boolean_arr_arr_do = null;
    }

        public final void void_int(int n) {
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
        this.var_java_lang_String_int = GameCanvas.java_lang_String_do(this.mangSoNguyen[var_int_arr_if[1]]) + MenuChinhAvatar.cl;
    }

    private static boolean boolean_try(int n) {
        return n > 0;
    }

    public final void cfr_renamed_15() {
        int n = var_int_arr_if[1];
        while ((n < this.var_java_util_Vector_if.size())) {
            ef ef2 = (ef)this.var_java_util_Vector_if.elementAt(n);
            if (DuLieuNguoiChoi.cfr_renamed_18(ci_0.q_0_do((short)ef2.var_short_do).var_byte_if, var_int_arr_if[3])) {
                this.var_java_util_Vector_if.removeElement(ef2);
                this.var_short_short = ef2.var_short_do;
            }
            ++n;
            return;
        }
    }

        public final int int_do() {
        return this.mangSoNguyen[var_int_arr_if[1]];
    }

    public final void cfr_renamed_8() {
        if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[3]) && DuLieuNguoiChoi.boolean_int(this.dangChayAuto ? 1 : 0) && DuLieuNguoiChoi.boolean_int(this.var_int_break) && DuLieuNguoiChoi.boolean_int(fe_0.var_boolean_try ? 1 : 0)) {
            this.var_int_try = var_int_arr_if[1];
            this.var_int_case = var_int_arr_if[1];
            if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]])) {
                ek_0.ek_0_do().soXu = 0L;
                this.var_int_catch = var_int_arr_if[3];
                this.this();
                if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0)) {
                    this.var_int_case = -((bk_0)this).cfr_renamed_18;
                    if (-(0x70 ^ 0x74) >= 0) {
                        return;
                    }
                } else if (DuLieuNguoiChoi.boolean_for(this.cfr_renamed_5(this.var_int_try, -(((bk_0)this).cfr_renamed_18 - var_int_arr_if[2])) ? 1 : 0)) {
                    if (DuLieuNguoiChoi.boolean_int(this.cfr_renamed_12(this.var_int_try, -(((bk_0)this).cfr_renamed_18 - var_int_arr_if[2])) ? 1 : 0)) {
                        this.boolean_for(((bk_0)this).cfr_renamed_3 + this.var_int_try, ((bk_0)this).cfr_renamed_1 - (((bk_0)this).cfr_renamed_18 - var_int_arr_if[2]));
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                    } else {
                        this.var_int_try = var_int_arr_if[1];
                        this.var_int_case = var_int_arr_if[1];
                        if ("   ".length() >= (0x6F ^ 0x6B)) {
                            return;
                        }
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[27]])) {
                ek_0.ek_0_do().soXu = 0L;
                this.var_int_catch = var_int_arr_if[3];
                this.cfr_renamed_10();
                this.void_int(var_int_arr_if[1], var_int_arr_if[2]);
                if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0)) {
                    this.var_int_case = ((bk_0)this).cfr_renamed_18;
                    if (DuLieuNguoiChoi.boolean_new(this.var_short_new + ((bk_0)this).cfr_renamed_18)) {
                        this.var_short_new = (short)var_int_arr_if[1];
                        if (DuLieuNguoiChoi.cfr_renamed_18(ef_0.int_if(((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 + ef_0.var_int_if / var_int_arr_if[4]), var_int_arr_if[45])) {
                            ((bk_0)this).cfr_renamed_1 = var_int_arr_if[1];
                            } else {
                            this.var_int_case = var_int_arr_if[1];
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        }
                    }
                } else if (DuLieuNguoiChoi.boolean_int(this.cfr_renamed_12(this.var_int_try, ((bk_0)this).cfr_renamed_18 - var_int_arr_if[2]) ? 1 : 0)) {
                    this.cfr_renamed_5(this.var_int_try, ((bk_0)this).cfr_renamed_18 - var_int_arr_if[2]);
                    if (-(0xC4 ^ 0xC0) > 0) {
                        return;
                    }
                } else {
                    this.var_int_try = var_int_arr_if[1];
                    this.var_int_case = var_int_arr_if[1];
                }
            }
            if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[0]])) {
                ek_0.ek_0_do().soXu = 0L;
                this.var_int_catch = var_int_arr_if[3];
                if (DuLieuNguoiChoi.boolean_int(this.var_int_final) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_3, bk_0.var_byte_case)) {
                    this.var_int_final = var_int_arr_if[5];
                }
                ((bk_0)this).cfr_renamed_3 = bk_0.var_byte_case;
                if ((this.var_int_final > var_int_arr_if[4])) {
                    if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0)) {
                        this.var_int_try = -((bk_0)this).cfr_renamed_18;
                        if ((0x5D ^ 0x59) <= ((0xDC ^ 0x96) & ~(0x89 ^ 0xC3))) {
                            return;
                        }
                    } else if (DuLieuNguoiChoi.boolean_int(this.cfr_renamed_12(-(((bk_0)this).cfr_renamed_18 + var_int_arr_if[27]), this.var_int_case) ? 1 : 0)) {
                        this.cfr_renamed_5(-(((bk_0)this).cfr_renamed_18 + var_int_arr_if[27]), this.var_int_case);
                        this.void_int(var_int_arr_if[3], var_int_arr_if[1]);
                        if (-(0x88 ^ 0x97 ^ (0xA4 ^ 0xBF)) > 0) {
                            return;
                        }
                    } else {
                        this.var_int_try = var_int_arr_if[1];
                        this.var_int_case = var_int_arr_if[1];
                    }
                }
                this.var_int_final += var_int_arr_if[2];
                if ("  ".length() <= 0) {
                    return;
                }
            } else if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[17]])) {
                ek_0.ek_0_do().soXu = 0L;
                this.var_int_catch = var_int_arr_if[3];
                if (DuLieuNguoiChoi.boolean_int(this.var_int_final) && DuLieuNguoiChoi.boolean_int(((bk_0)this).cfr_renamed_3)) {
                    this.var_int_final = var_int_arr_if[5];
                }
                ((bk_0)this).cfr_renamed_3 = (byte)var_int_arr_if[1];
                if ((this.var_int_final > var_int_arr_if[4])) {
                    if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0)) {
                        this.var_int_try = ((bk_0)this).cfr_renamed_18;
                        if ("  ".length() > "  ".length()) {
                            return;
                        }
                    } else if (DuLieuNguoiChoi.boolean_int(this.cfr_renamed_12(((bk_0)this).cfr_renamed_18 + var_int_arr_if[17], this.var_int_case) ? 1 : 0)) {
                        this.cfr_renamed_5(((bk_0)this).cfr_renamed_18 + var_int_arr_if[17], this.var_int_case);
                        this.void_int(var_int_arr_if[2], var_int_arr_if[1]);
                        if ((47 + 124 - 122 + 129 ^ 114 + 75 - 179 + 172) <= -" ".length()) {
                            return;
                        }
                    } else {
                        this.var_int_try = var_int_arr_if[1];
                        this.var_int_case = var_int_arr_if[1];
                    }
                }
                this.var_int_final += var_int_arr_if[2];
                } else {
                this.var_int_final = var_int_arr_if[1];
            }
            int n = var_int_arr_if[1];
            if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[4]])) {
                if (!DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[0]])) {
                if (!DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    if (" ".length() < ((0x49 ^ 0x61) & ~(0x2B ^ 3))) {
                        return;
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[17]])) {
                if (!DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]]) || DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    if ((0x4A ^ 0x6B ^ (0x62 ^ 0x47)) == 0) {
                        return;
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_do[var_int_arr_if[27]]) && (!DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_for[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]]))) {
                n = var_int_arr_if[2];
            }
            if (!DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_if[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_if[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_for(GameCanvas.var_boolean_arr_if[var_int_arr_if[27]])) {
                n = var_int_arr_if[2];
                GameCanvas.cfr_renamed_2();
            }
            if (DuLieuNguoiChoi.boolean_for(n) && DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[4]) && DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[36]) && DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[0]) && DuLieuNguoiChoi.boolean_int(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]])) {
                fe_0.fe_0_do();
                fe_0.cfr_renamed_0((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 ? 1 : 0, ((bk_0)this).cfr_renamed_3, this.var_short_new);
            }
            if (DuLieuNguoiChoi.boolean_int(this.var_int_try) && DuLieuNguoiChoi.boolean_int(this.var_int_case) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2])) {
                ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
            }
            if (DuLieuNguoiChoi.boolean_for(((bk_0)this).cfr_renamed_1 ? 1 : 0) && (!DuLieuNguoiChoi.boolean_int(this.var_int_try) || DuLieuNguoiChoi.boolean_for(this.var_int_case))) {
                ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[2];
            }
            int n2 = var_int_arr_if[1];
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[27]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[17]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[0]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[4]] = n2;
        }
    }

    public final void cfr_renamed_12() {
        short s2 = ef_0.var_short_if;
        short s3 = ef_0.var_short_do;
        this.var_boolean_arr_arr_do = new boolean[s2][s3];
        this.var_short_arr_do = new short[s2 * s3];
        this.var_short_arr_for = new short[s2 * s3];
        this.var_short_arr_if = new short[s2 * s3];
    }

        public final void void_for(int n, int n2) {
        ((bk_0)this).cfr_renamed_11 = n;
        this.var_int_new = n2;
        this.cfr_renamed_15(n);
    }

    public final int int_if() {
        if (DuLieuNguoiChoi.boolean_for(fe_0.coKichHoat ? 1 : 0)) {
            return this.mangSoNguyen[var_int_arr_if[5]];
        }
        return this.mangSoNguyen[var_int_arr_if[1]];
    }

    public final void cfr_renamed_11() {
        if ((this.var_boolean_arr_arr_do == null)) {
            this.cfr_renamed_12();
        }
        int n = var_int_arr_if[50];
        int n2 = ef_0.var_int_if * bn_0.cfr_renamed_6;
        if (DuLieuNguoiChoi.boolean_try(this.var_eq_0_do.soLuong / n2 * ef_0.var_short_if + this.var_eq_0_do.var_int_if / n2) && (this.var_eq_0_do.soLuong / n2 * ef_0.var_short_if + this.var_eq_0_do.var_int_if / n2 < ef_0.var_short_arr_if.length)) {
            n = ef_0.var_short_arr_if[this.var_eq_0_do.soLuong / n2 * ef_0.var_short_if + this.var_eq_0_do.var_int_if / n2];
        }
        if (!((this == AngelChip.duLieuNguoiChoi) && (n != var_int_arr_if[45]) && (ef_0.soLuong != var_int_arr_if[18]) && DuLieuNguoiChoi.boolean_int(ef_0.boolean_if(n) ? 1 : 0) && !DuLieuNguoiChoi.boolean_for(ef_0.cfr_renamed_3(n) ? 1 : 0))) {
            this.var_eq_0_do.cfr_renamed_3 = var_int_arr_if[1];
            if (!DuLieuNguoiChoi.boolean_for(this.var_int_break) || (this.var_int_break == var_int_arr_if[33])) {
                this.var_int_break = var_int_arr_if[33];
                this.var_int_catch = var_int_arr_if[3];
                ((bk_0)this).cfr_renamed_11 = ((bk_0)this).cfr_renamed_3;
                this.var_int_new = ((bk_0)this).cfr_renamed_1 ? 1 : 0;
                if ((this == AngelChip.duLieuNguoiChoi)) {
                    if (DuLieuNguoiChoi.cfr_renamed_2(((bk_0)this).cfr_renamed_3, this.var_eq_0_do.var_int_if / bn_0.cfr_renamed_6)) {
                        ef_0.var_int_else = bk_0.var_byte_case;
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    } else {
                        ef_0.var_int_else = var_int_arr_if[1];
                    }
                }
                this.cfr_renamed_3();
            }
        }
    }

    public final void void_new(int n) {
        if (DuLieuNguoiChoi.boolean_for(fe_0.coKichHoat ? 1 : 0)) {
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[5]] = n;
            return;
        }
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
    }

    private static void cfr_renamed_6() {
        var_int_arr_if = new int[52];
        DuLieuNguoiChoi.var_int_arr_if[0] = 151 + 5 - -15 + 8 ^ 181 + 81 - 187 + 108;
        DuLieuNguoiChoi.var_int_arr_if[1] = (0xB1 ^ 0xA4) & ~(0x48 ^ 0x5D);
        DuLieuNguoiChoi.var_int_arr_if[2] = " ".length();
        DuLieuNguoiChoi.var_int_arr_if[3] = -" ".length();
        DuLieuNguoiChoi.var_int_arr_if[4] = "  ".length();
        DuLieuNguoiChoi.var_int_arr_if[5] = "   ".length();
        DuLieuNguoiChoi.var_int_arr_if[6] = 0xFFFFAFEC & 0x53FB;
        DuLieuNguoiChoi.var_int_arr_if[7] = -(0xFFFF9B3F & 0x6ED2) & (0xFFFFEB3D & 0x1FFF);
        DuLieuNguoiChoi.var_int_arr_if[8] = 0x2D ^ 7;
        DuLieuNguoiChoi.var_int_arr_if[9] = 0x1C ^ 0x15;
        DuLieuNguoiChoi.var_int_arr_if[10] = 124 + 17 - 93 + 89 ^ 50 + 68 - 24 + 57;
        DuLieuNguoiChoi.var_int_arr_if[11] = 0xB ^ 1;
        DuLieuNguoiChoi.var_int_arr_if[12] = 0x5C ^ 0x53;
        DuLieuNguoiChoi.var_int_arr_if[13] = 0xA2 ^ 0xAC;
        DuLieuNguoiChoi.var_int_arr_if[14] = -"  ".length();
        DuLieuNguoiChoi.var_int_arr_if[15] = 0xC ^ 0x24;
        DuLieuNguoiChoi.var_int_arr_if[16] = 0x7E ^ 0x4C;
        DuLieuNguoiChoi.var_int_arr_if[17] = 0x95 ^ 0x93;
        DuLieuNguoiChoi.var_int_arr_if[18] = 0xC2 ^ 0x9C ^ (0xD9 ^ 0x9F);
        DuLieuNguoiChoi.var_int_arr_if[19] = 0x86 ^ 0xB3;
        DuLieuNguoiChoi.var_int_arr_if[20] = 0x80 ^ 0xB4;
        DuLieuNguoiChoi.var_int_arr_if[21] = 0xFFFFEB5E & 0x16FF;
        DuLieuNguoiChoi.var_int_arr_if[22] = 0x57 ^ 0x50;
        DuLieuNguoiChoi.var_int_arr_if[23] = 0x6C ^ 8;
        DuLieuNguoiChoi.var_int_arr_if[24] = -(0x9E ^ 0xA2);
        DuLieuNguoiChoi.var_int_arr_if[25] = 0x76 ^ 0x62;
        DuLieuNguoiChoi.var_int_arr_if[26] = (0xD0 ^ 0x9D) + (0x2E ^ 0x58) - (0xC ^ 0x74) + (13 + 152 - 83 + 98);
        DuLieuNguoiChoi.var_int_arr_if[27] = 0xC7 ^ 0xB3 ^ (0xC6 ^ 0xBA);
        DuLieuNguoiChoi.var_int_arr_if[28] = 118 + 150 - 71 + 41 ^ 136 + 112 - 164 + 84;
        DuLieuNguoiChoi.var_int_arr_if[29] = 0x1C ^ 0x17;
        DuLieuNguoiChoi.var_int_arr_if[30] = 141 + 52 - 175 + 158 ^ 119 + 136 - 180 + 106;
        DuLieuNguoiChoi.var_int_arr_if[31] = 0xA9 ^ 0xC4 ^ (0xCF ^ 0x8F);
        DuLieuNguoiChoi.var_int_arr_if[32] = 0x23 ^ 0x48;
        DuLieuNguoiChoi.var_int_arr_if[33] = -(0x4B ^ 0x5F ^ (0x52 ^ 0x43));
        DuLieuNguoiChoi.var_int_arr_if[34] = 0x1B ^ 0x6B;
        DuLieuNguoiChoi.var_int_arr_if[35] = 46 + 40 - -85 + 26 ^ 118 + 152 - 214 + 103;
        DuLieuNguoiChoi.var_int_arr_if[36] = 39 + 43 - 79 + 130 ^ 97 + 32 - 22 + 29;
        DuLieuNguoiChoi.var_int_arr_if[37] = 0x45 ^ 0x77 ^ (0x53 ^ 0x22);
        DuLieuNguoiChoi.var_int_arr_if[38] = -(0x28 ^ 0x22);
        DuLieuNguoiChoi.var_int_arr_if[39] = 14 + 103 - -22 + 62 ^ 93 + 76 - 57 + 37;
        DuLieuNguoiChoi.var_int_arr_if[40] = 0xE5 ^ 0xAA;
        DuLieuNguoiChoi.var_int_arr_if[41] = 0x74 ^ 0x42;
        DuLieuNguoiChoi.var_int_arr_if[42] = 0x70 ^ 0x6C;
        DuLieuNguoiChoi.var_int_arr_if[43] = 0x39 ^ 0x35;
        DuLieuNguoiChoi.var_int_arr_if[44] = -(0xFFFF9364 & 0x6DBB) & (0xFFFFDDDF & 0x7735B73F);
        DuLieuNguoiChoi.var_int_arr_if[45] = 0xDD ^ 0x8D;
        DuLieuNguoiChoi.var_int_arr_if[46] = 0x5B ^ 0xA;
        DuLieuNguoiChoi.var_int_arr_if[47] = -(0x46 ^ 0x40);
        DuLieuNguoiChoi.var_int_arr_if[48] = 0x40 ^ 0x52;
        DuLieuNguoiChoi.var_int_arr_if[49] = 0xD8 ^ 0xB9;
        DuLieuNguoiChoi.var_int_arr_if[50] = 0xD7 ^ 0x8F;
        DuLieuNguoiChoi.var_int_arr_if[51] = -"   ".length();
    }

    private boolean cfr_renamed_12(int n, int n2) {
        if ((this != AngelChip.duLieuNguoiChoi)) {
            return var_int_arr_if[1];
        }
        if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[3]) && (GameCanvas.var_bt_0_do == null)) {
            int n3 = ef_0.boolean_do(((bk_0)this).cfr_renamed_3 + n, ((bk_0)this).cfr_renamed_1 + n2);
            n = n3;
            if (DuLieuNguoiChoi.boolean_for(n3) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_4, var_int_arr_if[2])) {
                ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
            }
            return n != 0;
        }
        return var_int_arr_if[1];
    }

    public final void (String string == null) {
        this.chuoiGiaTri = string;
        if ((string.length() > var_int_arr_if[22])) {
            this.tenNhanVat = string.substring(var_int_arr_if[1], var_int_arr_if[17]) + "..";
            if (((181 + 41 - 180 + 160 ^ 61 + 15 - 45 + 115) & (62 + 77 - 117 + 105 ^ (0xE3 ^ 0xC4) ^ -" ".length())) > 0) {
                return;
            }
        } else {
            this.tenNhanVat = string;
        }
        this.cfr_renamed_25 = (short)GameCanvas.var_ew_do.cfr_renamed_0(string);
    }

    public final void cfr_renamed_18() {
        this.cfr_renamed_15();
        ef_0.cfr_renamed_0(this);
    }

    public final void cfr_renamed_10() {
        if (DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[4]) && DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_4, var_int_arr_if[36])) {
            this.this();
            return;
        }
        int n = ef_0.int_do((int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - var_int_arr_if[48]);
        if ((n == var_int_arr_if[3])) {
            return;
        }
        ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[1];
        this.var_byte_else = (byte)var_int_arr_if[1];
        if ((ef_0.var_short_arr_if[n] == var_int_arr_if[35])) {
            if ((ef_0.var_short_arr_do[n] == var_int_arr_if[45])) {
                ef_0.var_short_arr_if[n] = var_int_arr_if[39];
                return;
            }
            if ((ef_0.var_short_arr_do[n] == var_int_arr_if[49])) {
                ef_0.var_short_arr_if[n] = var_int_arr_if[41];
                return;
            }
            ef_0.var_short_arr_if[n] = var_int_arr_if[40];
            return;
        }
    }

    public final void (int n, int n2, int n3 == null) {
        if ((this.mangSoNguyen[var_int_arr_if[1]] != n)) {
            GameCanvas.void_if(n - this.mangSoNguyen[var_int_arr_if[1]], ((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - gc_0.int_do(var_int_arr_if[25]), var_int_arr_if[3]);
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
        }
        if ((this.mangSoNguyen[var_int_arr_if[4]] != n2)) {
            GameCanvas.hienThongBaoPopup(n2 - this.mangSoNguyen[var_int_arr_if[4]] + "luong", (int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - gc_0.int_do(var_int_arr_if[25]), var_int_arr_if[1], var_int_arr_if[3]);
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[4]] = n2;
        }
        if ((this.soLuong != n3)) {
            GameCanvas.hienThongBaoPopup(n3 - this.soLuong + "luong", (int)((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_1 - gc_0.int_do(var_int_arr_if[25]), var_int_arr_if[1], var_int_arr_if[3]);
            this.soLuong = n3;
        }
    }

    public final void (byte by2 != null) {
        ((bk_0)this).cfr_renamed_4 = by2;
    }

    public final void (ef ef2 == null) {
        Object object = ci_0.q_0_do(ef2.var_short_do);
        if ((object != null) && DuLieuNguoiChoi.cfr_renamed_11(((q_0)object).cfr_renamed_3, var_int_arr_if[14])) {
            object = ci_0.cfr_renamed_0((int)((q_0)object).var_byte_if, this.var_java_util_Vector_if);
            if ((object != null)) {
                this.var_java_util_Vector_if.removeElement(object);
                }
            this.var_java_util_Vector_if.addElement(ef2);
        }
    }

            public final void (Graphics graphics, int n, int n2 == null) {
        int n3 = var_int_arr_if[1];
        n2 = n2 - ((bk_0)this).cfr_renamed_4 * aG.var_int_int + (this.var_byte_try + this.var_byte_else) * aG.var_int_int;
        if ((this.var_short_if != var_int_arr_if[3])) {
            n3 = var_int_arr_if[22];
            ci_0.cfr_renamed_0(graphics, this.var_short_if, n + var_byte_arr_do[((bk_0)this).cfr_renamed_3] * aG.var_int_int - this.cfr_renamed_25 / var_int_arr_if[4], n2 + bn_0.cfr_renamed_8 / var_int_arr_if[4], var_int_arr_if[5]);
        }
        n += (var_byte_arr_do[((bk_0)this).cfr_renamed_3] + n3) * aG.var_int_int;
        if ((this.var_short_byte != var_int_arr_if[3])) {
            ci_0.cfr_renamed_0(graphics, this.var_short_byte, n + this.cfr_renamed_25 / var_int_arr_if[4] + var_int_arr_if[17] * aG.var_int_int, n2 + bn_0.cfr_renamed_8 / var_int_arr_if[4], var_int_arr_if[5]);
        }
        if (DuLieuNguoiChoi.boolean_for(TienIchGame.boolean_do(this.chuoiGiaTri) ? 1 : 0)) {
            var_ep_if.cfr_renamed_0(var_int_arr_if[1], n + this.cfr_renamed_25 / var_int_arr_if[4] + var_int_arr_if[22] * aG.var_int_int, n2 + var_int_arr_if[5], var_int_arr_if[1], var_int_arr_if[5], graphics);
            if (-" ".length() != -" ".length()) {
                return;
            }
        } else if ((this.var_byte_break != var_int_arr_if[3])) {
            var_ep_if.cfr_renamed_0(this.var_byte_break, n + this.cfr_renamed_25 / var_int_arr_if[4] + var_int_arr_if[22] * aG.var_int_int, n2 + var_int_arr_if[5], var_int_arr_if[1], var_int_arr_if[5], graphics);
        }
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_12, AngelChip.duLieuNguoiChoi.var_short_char)) {
            GameCanvas.var_ew_do.cfr_renamed_0(graphics, this.chuoiGiaTri, n, n2, var_int_arr_if[4]);
            return;
        }
        GameCanvas.var_ew_int.cfr_renamed_0(graphics, this.chuoiGiaTri, n, n2, var_int_arr_if[4]);
    }

    public final void (ef ef2 != null) {
        if ((this.var_java_util_Vector_if == null)) {
            this.var_java_util_Vector_if = new Vector();
        }
        this.var_java_util_Vector_if.addElement(ef2);
    }

    public final void void_try(int n) {
        this.var_int_void = n;
        int n2 = var_int_arr_if[2];
        do {
            int n3 = n2 * var_int_arr_if[23];
            int n4 = n;
            if (DuLieuNguoiChoi.boolean_if(n -= n3)) {
                this.var_short_class = (byte)n2;
                this.var_byte_this = (byte)(n4 * var_int_arr_if[23] / (n2 * var_int_arr_if[23]));
                return;
            }
            ++n2;
            } while (null == null);
    }

    public final void void_do() {
        int n;
        if ((this.var_v_0_do != null)) {
            v_0 v_02 = this.var_v_0_do;
            n = var_int_arr_if[1];
            while ((n < var_int_arr_if[5])) {
                int n2 = n;
                v_02.mangSoNguyen[n2] = v_02.mangSoNguyen[n2] - var_int_arr_if[2];
                if ((v_02.mangSoNguyen[n] < var_int_arr_if[24])) {
                    v_02.mangSoNguyen[n] = var_int_arr_if[1];
                    v_02.var_byte_arr_do[n] = var_int_arr_if[17];
                }
                int n3 = n;
                v_02.var_byte_arr_for[n3] = (byte)(v_02.var_byte_arr_for[n3] + var_int_arr_if[2]);
                if ((v_02.var_byte_arr_for[n] == var_int_arr_if[17])) {
                    v_02.var_byte_arr_for[n] = var_int_arr_if[1];
                }
                int n4 = n;
                v_02.var_int_arr_if[n4] = v_02.var_int_arr_if[n4] + (v_02.var_byte_arr_if[n] << var_int_arr_if[2]);
                if ((v_02.var_byte_arr_if[n] == var_int_arr_if[2])) {
                    if ((v_02.var_int_arr_if[n] > var_int_arr_if[11] - gc_0.int_if(v_02.mangSoNguyen[n] / var_int_arr_if[11]))) {
                        v_02.var_byte_arr_if[n] = var_int_arr_if[3];
                        if (DuLieuNguoiChoi.boolean_try(v_02.var_byte_arr_do[n])) {
                            int n5 = n;
                            v_02.var_byte_arr_do[n5] = (byte)(v_02.var_byte_arr_do[n5] - var_int_arr_if[2]);
                            }
                    }
                } else {
                    if (DuLieuNguoiChoi.cfr_renamed_15(v_02.var_int_arr_if[n], -(var_int_arr_if[11] - gc_0.int_if(v_02.mangSoNguyen[n] / var_int_arr_if[11])))) {
                        v_02.var_byte_arr_if[n] = var_int_arr_if[2];
                    }
                    if (DuLieuNguoiChoi.boolean_try(v_02.var_byte_arr_do[n])) {
                        int n6 = n;
                        v_02.var_byte_arr_do[n6] = (byte)(v_02.var_byte_arr_do[n6] - var_int_arr_if[2]);
                    }
                }
                ++n;
                if ((97 + 50 - 88 + 122 ^ 162 + 172 - 212 + 55) == (0x31 ^ 0xF ^ (0xFA ^ 0xC0))) continue;
                return;
            }
        }
        if (DuLieuNguoiChoi.boolean_for(this.var_boolean_byte ? 1 : 0) && (GameCanvas.var_int_try % var_int_arr_if[25] == var_int_arr_if[11])) {
            this.void_if();
        }
        if (DuLieuNguoiChoi.boolean_for(this.coKichHoat ? 1 : 0) && (!DuLieuNguoiChoi.boolean_for(fe_0.var_boolean_try ? 1 : 0) || DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_12, fe_0.soLuong) && DuLieuNguoiChoi.cfr_renamed_11(((bk_0)this).cfr_renamed_12, fe_0.soLuongKhoa)) && DuLieuNguoiChoi.boolean_int(this.var_java_util_Vector_for.size()) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_3, ((bk_0)this).cfr_renamed_11) && DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_1 ? 1 : 0, this.var_int_new)) {
            ef_0.cfr_renamed_3(this);
            if ((fe_0.duLieuNguoiChoi != null) && DuLieuNguoiChoi.cfr_renamed_18(fe_0.duLieuNguoiChoi.var_short_char, ((bk_0)this).cfr_renamed_12)) {
                fe_0.duLieuNguoiChoi = null;
                ef_0.var_aG_do = null;
            }
        }
        if (DuLieuNguoiChoi.cfr_renamed_18(((bk_0)this).cfr_renamed_11, ((bk_0)this).cfr_renamed_3) && DuLieuNguoiChoi.cfr_renamed_18(this.var_int_new, ((bk_0)this).cfr_renamed_1 ? 1 : 0) && DuLieuNguoiChoi.boolean_new(this.var_int_class)) {
            this.var_int_class -= var_int_arr_if[2];
            if (DuLieuNguoiChoi.boolean_if(this.var_int_class)) {
                this.var_int_class = var_int_arr_if[3];
                this.var_boolean_try = var_int_arr_if[1];
                this.var_int_break = var_int_arr_if[1];
                if ((this == AngelChip.duLieuNguoiChoi)) {
                    ef_0.var_int_else = var_int_arr_if[3];
                    if (-" ".length() >= "   ".length()) {
                        return;
                    }
                }
            } else {
                n = (this.var_short_arr_if[this.var_int_class] & var_int_arr_if[26]) * ef_0.var_int_if + ef_0.var_int_if / var_int_arr_if[4];
                int n7 = (this.var_short_arr_if[this.var_int_class] >> var_int_arr_if[27]) * ef_0.var_int_if + ef_0.var_int_if / var_int_arr_if[4];
                if ((this.var_int_class == var_int_arr_if[2])) {
                    AngelChip.duLieuNguoiChoi.var_boolean_try = var_int_arr_if[2];
                    n = this.var_eq_0_do.var_int_if / bn_0.cfr_renamed_6;
                    n7 = this.var_eq_0_do.soLuong / bn_0.cfr_renamed_6;
                    this.var_int_class = var_int_arr_if[1];
                }
                if ((this != AngelChip.duLieuNguoiChoi)) {
                    ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[2];
                    this.void_for(n, n7);
                    if ((0x4A ^ 0x2F ^ (0xA ^ 0x6B)) < 0) {
                        return;
                    }
                } else if (DuLieuNguoiChoi.boolean_int(this.cfr_renamed_12(n - ((bk_0)this).cfr_renamed_3, n7 - ((bk_0)this).cfr_renamed_1) ? 1 : 0) && DuLieuNguoiChoi.boolean_int(this.cfr_renamed_5(n - ((bk_0)this).cfr_renamed_3, n7 - ((bk_0)this).cfr_renamed_1) ? 1 : 0)) {
                    if (DuLieuNguoiChoi.boolean_int(ef_0.boolean_do(ef_0.int_if(n, n7)) ? 1 : 0)) {
                        ((bk_0)this).cfr_renamed_4 = (byte)var_int_arr_if[2];
                        this.void_for(n, n7);
                        if (-"   ".length() > 0) {
                            return;
                        }
                    }
                } else {
                    this.var_int_class = var_int_arr_if[1];
                    this.cfr_renamed_16();
                    this.var_boolean_try = var_int_arr_if[1];
                }
            }
        }
        this.cfr_renamed_2();
        if ((this.var_java_util_Vector_int != null)) {
            int n8 = var_int_arr_if[1];
            while ((n8 < this.var_java_util_Vector_int.size())) {
                ex_0 ex_02 = (ex_0)this.var_java_util_Vector_int.elementAt(n8);
                if ((ex_02.cfr_renamed_1 == this.var_short_do)) {
                    this.var_short_do = (short)var_int_arr_if[1];
                    this.var_short_final = ex_02.cfr_renamed_0;
                    this.var_java_util_Vector_int.removeElement(ex_02);
                    if (-"   ".length() <= 0) break;
                    return;
                }
                ++n8;
                if ("  ".length() == "  ".length()) continue;
                return;
            }
            this.var_short_do = (short)(this.var_short_do + var_int_arr_if[2]);
        }
    }
}

