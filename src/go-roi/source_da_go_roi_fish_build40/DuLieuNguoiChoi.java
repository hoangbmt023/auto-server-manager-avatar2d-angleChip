/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import main.AngelChip;

public final class DuLieuNguoiChoi
extends dd_0 {
    public int soLuong;
    private byte var_byte_class;
    public Vector var_java_util_Vector_if;
    private short cfr_renamed_24;
    public short var_short_do;
    public byte var_byte_do;
    public short var_short_if;
    public short var_short_for;
    public boolean coKichHoat;
    public short var_short_try;
    private short cfr_renamed_22;
    public boolean var_boolean_int;
    private boolean var_boolean_try;
    private static byte[] var_byte_arr_do;
    public fs var_fs_do;
    public short var_short_byte;
    public short cfr_renamed_7;
    public boolean cfr_renamed_4;
    public String tenNhanVat;
    public short var_short_char;
    public int var_int_long;
    public DuLieuNguoiChoi duLieuNguoiChoi;
    private byte var_byte_const;
    public short var_short_else;
    private int var_int_final;
    public int var_int_this;
    private short[] var_short_arr_do;
    public byte var_byte_char;
    private short[] var_short_arr_if;
    public short var_short_goto;
    private static byte[][] var_byte_arr_arr_do;
    public static cu_0 var_cu_0_do;
    private boolean var_boolean_byte;
    public short var_short_long;
    public short var_short_this;
    public byte var_byte_else;
    public short var_short_void;
    public int var_int_void;
    public short var_short_break;
    private static final int[] var_int_arr_if;
    public Vector var_java_util_Vector_for;
    public int var_int_break;
    public String chuoiPhu;
    public static cu_0 var_cu_0_if;
    public int var_int_catch;
    public byte var_byte_goto;
    public byte var_byte_long;
    public static cu_0 var_cu_0_for;
    public int[] mangSoNguyen;
    public byte var_byte_this;
    public String var_java_lang_String_int;
    public int var_int_class;
    public Vector var_java_util_Vector_int;
    public short var_short_catch;
    public byte var_byte_void;
    public byte var_byte_break;
    private byte var_byte_final;
    public int var_int_const;
    public boolean[][] var_boolean_arr_arr_do;
    public short var_short_class;
    private int var_int_float;
    public short var_short_const;
    public short var_short_final;
    private short cfr_renamed_17;
    public short var_short_float;
    private int var_int_short;
    public byte var_byte_catch;
    public short var_short_short;
    private ar_0 fontRenderer;
    public String[] var_java_lang_String_arr_do;
    public short cfr_renamed_23;
    private short[] var_short_arr_for;

    private boolean boolean_int(int n, int n2) {
        if ((this != AngelChip.duLieuNguoiChoi)) {
            return var_int_arr_if[1];
        }
        if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[3]) && (GameCanvas.var_dj_0_do == null)) {
            int n3 = fh.boolean_if(((dd_0)this).cfr_renamed_2 + n, this.var_byte_int + n2);
            n = n3;
            if (DuLieuNguoiChoi.boolean_new(n3) && DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2])) {
                ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
            }
            return n != 0;
        }
        return var_int_arr_if[1];
    }

    private void void_int(int n, int n2) {
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[0])) {
            if (DuLieuNguoiChoi.cfr_renamed_4(fh.int_do((int)((dd_0)this).cfr_renamed_2, this.var_byte_int - var_int_arr_if[48]), var_int_arr_if[3])) {
                return;
            }
            if (DuLieuNguoiChoi.cfr_renamed_4(fh.int_if(((dd_0)this).cfr_renamed_2 + n * var_int_arr_if[43], this.var_byte_int + n2 * var_int_arr_if[43] - var_int_arr_if[11]), var_int_arr_if[45])) {
                ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
                this.var_byte_this = (byte)var_int_arr_if[1];
            }
        }
    }

        public final void (byte by2 != null) {
        ((dd_0)this).cfr_renamed_2 = by2;
    }

    public final void void_if() {
        this.var_boolean_try = var_int_arr_if[1];
        try {
            int n = var_int_arr_if[1];
            while ((n < this.var_java_util_Vector_if.size() - var_int_arr_if[2])) {
                cg cg2 = (cg)this.var_java_util_Vector_if.elementAt(n);
                if ((aa_0.am_do(cg2.var_short_do) != null)) {
                    int n2 = n + var_int_arr_if[2];
                    while ((n2 < this.var_java_util_Vector_if.size())) {
                        cg cg3 = (cg)this.var_java_util_Vector_if.elementAt(n2);
                        if (DuLieuNguoiChoi.cfr_renamed_4(aa_0.am_do((short)cg3.var_short_do).cfr_renamed_3, var_int_arr_if[3])) {
                            this.var_boolean_try = var_int_arr_if[2];
                        }
                        if ((aa_0.am_do(cg3.var_short_do) != null) && DuLieuNguoiChoi.cfr_renamed_13(aa_0.am_do((short)cg2.var_short_do).var_byte_if, aa_0.am_do((short)cg3.var_short_do).var_byte_if)) {
                            this.var_java_util_Vector_if.setElementAt(cg2, n2);
                            this.var_java_util_Vector_if.setElementAt(cg3, n);
                            cg2 = cg3;
                        }
                        ++n2;
                        if ("  ".length() >= 0) continue;
                        return;
                    }
                }
                ++n;
                if (-"  ".length() <= 0) continue;
                return;
            }
            return;
        }
        catch (Exception exception) {
            this.var_boolean_try = var_int_arr_if[2];
            return;
        }
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

    public final void void_if(int n, int n2) {
        ((dd_0)this).cfr_renamed_8 = n;
        this.var_int_try = n2;
        this.cfr_renamed_6(n);
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    public final void void_do(int n) {
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
        this.chuoiPhu = GameCanvas.java_lang_String_do(this.mangSoNguyen[var_int_arr_if[1]]) + MenuChinhAvatar.cb;
    }

    public DuLieuNguoiChoi() {
        int[] nArray = new int[var_int_arr_if[0]];
        nArray[DuLieuNguoiChoi.var_int_arr_if[1]] = var_int_arr_if[1];
        nArray[DuLieuNguoiChoi.var_int_arr_if[2]] = var_int_arr_if[3];
        nArray[DuLieuNguoiChoi.var_int_arr_if[4]] = var_int_arr_if[1];
        nArray[DuLieuNguoiChoi.var_int_arr_if[5]] = var_int_arr_if[1];
        this.mangSoNguyen = nArray;
        this.chuoiPhu = "";
        this.var_java_util_Vector_for = new Vector();
        this.cfr_renamed_4 = var_int_arr_if[1];
        this.var_byte_catch = (byte)var_int_arr_if[3];
        this.var_boolean_try = var_int_arr_if[1];
        this.var_boolean_byte = var_int_arr_if[1];
        this.var_int_class = var_int_arr_if[1];
        this.var_int_this = var_int_arr_if[3];
        this.var_int_short = var_int_arr_if[1];
        this.var_short_final = (short)var_int_arr_if[0];
        this.var_short_long = (short)var_int_arr_if[1];
        this.var_short_if = (short)var_int_arr_if[3];
        this.var_short_break = (short)var_int_arr_if[3];
        this.var_short_do = (short)var_int_arr_if[1];
        this.cfr_renamed_23 = (short)var_int_arr_if[3];
        this.var_short_class = (short)var_int_arr_if[3];
        this.var_int_float = var_int_arr_if[1];
        this.var_byte_else = (byte)var_int_arr_if[3];
        this.var_byte_goto = (byte)var_int_arr_if[1];
        this.var_byte_void = (byte)var_int_arr_if[3];
        this.var_short_goto = (short)var_int_arr_if[6];
        this.var_short_for = (short)var_int_arr_if[7];
        this.var_short_short = (short)var_int_arr_if[1];
        this.var_short_catch = (short)var_int_arr_if[1];
        this.var_short_const = (short)var_int_arr_if[6];
        this.var_short_byte = (short)var_int_arr_if[6];
        this.var_byte_const = (byte)var_int_arr_if[1];
        this.var_short_this = (short)var_int_arr_if[1];
        this.var_int_catch = var_int_arr_if[1];
        ((dd_0)this).cfr_renamed_0 = var_int_arr_if[1];
        this.var_int_new = var_int_arr_if[8];
        this.var_byte_final = (byte)hg.int_new(var_int_arr_if[9]);
        this.var_byte_class = (byte)(hg.int_new(var_int_arr_if[10]) + var_int_arr_if[11]);
    }

    public final void cfr_renamed_2() {
        if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[3]) && DuLieuNguoiChoi.boolean_do(this.dangChayAuto ? 1 : 0) && DuLieuNguoiChoi.boolean_do(this.var_int_class) && DuLieuNguoiChoi.boolean_do(go_0.coTrangThai ? 1 : 0)) {
            this.var_int_new = var_int_arr_if[1];
            ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
            if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]])) {
                fm.fm_do().soXu = 0L;
                this.var_int_this = var_int_arr_if[3];
                this.this();
                if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0)) {
                    ((dd_0)this).cfr_renamed_13 = -this.var_int_case;
                    } else if (DuLieuNguoiChoi.boolean_new(this.cfr_renamed_6(this.var_int_new, -(this.var_int_case - var_int_arr_if[2])) ? 1 : 0)) {
                    if (DuLieuNguoiChoi.boolean_do(this.boolean_int(this.var_int_new, -(this.var_int_case - var_int_arr_if[2])) ? 1 : 0)) {
                        this.boolean_for(((dd_0)this).cfr_renamed_2 + this.var_int_new, this.var_byte_int - (this.var_int_case - var_int_arr_if[2]));
                        } else {
                        this.var_int_new = var_int_arr_if[1];
                        ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                        }
                }
            } else if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[27]])) {
                fm.fm_do().soXu = 0L;
                this.var_int_this = var_int_arr_if[3];
                this.cfr_renamed_13();
                this.void_int(var_int_arr_if[1], var_int_arr_if[2]);
                if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0)) {
                    ((dd_0)this).cfr_renamed_13 = this.var_int_case;
                    if (DuLieuNguoiChoi.boolean_if(this.var_short_int + this.var_int_case)) {
                        this.var_short_int = (short)var_int_arr_if[1];
                        if (DuLieuNguoiChoi.cfr_renamed_4(fh.int_if(((dd_0)this).cfr_renamed_2, this.var_byte_int + fh.var_int_int / var_int_arr_if[4]), var_int_arr_if[45])) {
                            ((dd_0)this).cfr_renamed_0 = var_int_arr_if[1];
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        } else {
                            ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        }
                    }
                } else if (DuLieuNguoiChoi.boolean_do(this.boolean_int(this.var_int_new, this.var_int_case - var_int_arr_if[2]) ? 1 : 0)) {
                    this.cfr_renamed_6(this.var_int_new, this.var_int_case - var_int_arr_if[2]);
                    if (-"   ".length() >= 0) {
                        return;
                    }
                } else {
                    this.var_int_new = var_int_arr_if[1];
                    ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                }
            }
            if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[0]])) {
                fm.fm_do().soXu = 0L;
                this.var_int_this = var_int_arr_if[3];
                if (DuLieuNguoiChoi.boolean_do(this.var_int_short) && (this.var_byte_new == dd_0.var_byte_try)) {
                    this.var_int_short = var_int_arr_if[5];
                }
                this.var_byte_new = dd_0.var_byte_try;
                if ((this.var_int_short > var_int_arr_if[4])) {
                    if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0)) {
                        this.var_int_new = -this.var_int_case;
                        } else if (DuLieuNguoiChoi.boolean_do(this.boolean_int(-(this.var_int_case + var_int_arr_if[27]), ((dd_0)this).cfr_renamed_13) ? 1 : 0)) {
                        this.cfr_renamed_6(-(this.var_int_case + var_int_arr_if[27]), ((dd_0)this).cfr_renamed_13);
                        this.void_int(var_int_arr_if[3], var_int_arr_if[1]);
                        if ((14 + 40 - 25 + 156 ^ 88 + 5 - -16 + 80) != (0x7E ^ 0x4B ^ (0x1D ^ 0x2C))) {
                            return;
                        }
                    } else {
                        this.var_int_new = var_int_arr_if[1];
                        ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                    }
                }
                this.var_int_short += var_int_arr_if[2];
                if ("   ".length() <= 0) {
                    return;
                }
            } else if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[17]])) {
                fm.fm_do().soXu = 0L;
                this.var_int_this = var_int_arr_if[3];
                if (DuLieuNguoiChoi.boolean_do(this.var_int_short) && DuLieuNguoiChoi.boolean_do(this.var_byte_new)) {
                    this.var_int_short = var_int_arr_if[5];
                }
                this.var_byte_new = (byte)var_int_arr_if[1];
                if ((this.var_int_short > var_int_arr_if[4])) {
                    if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0)) {
                        this.var_int_new = this.var_int_case;
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else if (DuLieuNguoiChoi.boolean_do(this.boolean_int(this.var_int_case + var_int_arr_if[17], ((dd_0)this).cfr_renamed_13) ? 1 : 0)) {
                        this.cfr_renamed_6(this.var_int_case + var_int_arr_if[17], ((dd_0)this).cfr_renamed_13);
                        this.void_int(var_int_arr_if[2], var_int_arr_if[1]);
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                    } else {
                        this.var_int_new = var_int_arr_if[1];
                        ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                    }
                }
                this.var_int_short += var_int_arr_if[2];
                } else {
                this.var_int_short = var_int_arr_if[1];
            }
            int n = var_int_arr_if[1];
            if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_do[var_int_arr_if[4]])) {
                if (!DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    }
            } else if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_do[var_int_arr_if[0]])) {
                if (!DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    if (-(15 + 32 - 44 + 132 ^ 35 + 74 - 98 + 119) >= 0) {
                        return;
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_do[var_int_arr_if[17]])) {
                if (!DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]]) || DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[27]])) {
                    n = var_int_arr_if[2];
                    if (-"  ".length() > 0) {
                        return;
                    }
                }
            } else if (DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_do[var_int_arr_if[27]]) && (!DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_if[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_if[var_int_arr_if[4]]))) {
                n = var_int_arr_if[2];
            }
            if (!DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_for[var_int_arr_if[0]]) || !DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_for[var_int_arr_if[17]]) || DuLieuNguoiChoi.boolean_new(GameCanvas.var_boolean_arr_for[var_int_arr_if[27]])) {
                n = var_int_arr_if[2];
                GameCanvas.cfr_renamed_5();
            }
            if (DuLieuNguoiChoi.boolean_new(n) && DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[4]) && DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[36]) && DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[0]) && DuLieuNguoiChoi.boolean_do(GameCanvas.var_boolean_arr_for[var_int_arr_if[4]])) {
                go_0.go_0_do();
                go_0.cfr_renamed_1((int)((dd_0)this).cfr_renamed_2, (int)this.var_byte_int, this.var_byte_new, this.var_short_int);
            }
            if (DuLieuNguoiChoi.boolean_do(this.var_int_new) && DuLieuNguoiChoi.boolean_do(((dd_0)this).cfr_renamed_13) && DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2])) {
                ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
            }
            if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0) && (!DuLieuNguoiChoi.boolean_do(this.var_int_new) || DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_13))) {
                ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[2];
            }
            int n2 = var_int_arr_if[1];
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[27]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[17]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[0]] = n2;
            GameCanvas.var_boolean_arr_do[DuLieuNguoiChoi.var_int_arr_if[4]] = n2;
        }
    }

    public final void cfr_renamed_3() {
        if ((this.var_boolean_arr_arr_do == null)) {
            this.cfr_renamed_14();
        }
        int n = var_int_arr_if[50];
        int n2 = fh.var_int_int * dF.cfr_renamed_12;
        if (DuLieuNguoiChoi.boolean_int(this.var_fs_do.var_int_if / n2 * fh.var_short_if + this.var_fs_do.soLuong / n2) && (this.var_fs_do.var_int_if / n2 * fh.var_short_if + this.var_fs_do.soLuong / n2 < fh.var_short_arr_do.length)) {
            n = fh.var_short_arr_do[this.var_fs_do.var_int_if / n2 * fh.var_short_if + this.var_fs_do.soLuong / n2];
        }
        if (!((this == AngelChip.duLieuNguoiChoi) && (n != var_int_arr_if[45]) && (fh.var_int_char != var_int_arr_if[18]) && DuLieuNguoiChoi.boolean_do(fh.boolean_if(n) ? 1 : 0) && !DuLieuNguoiChoi.boolean_new(fh.boolean_do(n) ? 1 : 0))) {
            this.var_fs_do.cfr_renamed_2 = var_int_arr_if[1];
            if (!DuLieuNguoiChoi.boolean_new(this.var_int_class) || (this.var_int_class == var_int_arr_if[33])) {
                this.var_int_class = var_int_arr_if[33];
                this.var_int_this = var_int_arr_if[3];
                ((dd_0)this).cfr_renamed_8 = ((dd_0)this).cfr_renamed_2;
                this.var_int_try = this.var_byte_int;
                if ((this == AngelChip.duLieuNguoiChoi)) {
                    if (DuLieuNguoiChoi.cfr_renamed_13(((dd_0)this).cfr_renamed_2, this.var_fs_do.soLuong / dF.cfr_renamed_12)) {
                        fh.soLuongKhoa = dd_0.var_byte_try;
                        } else {
                        fh.soLuongKhoa = var_int_arr_if[1];
                    }
                }
                this.cfr_renamed_4();
            }
        }
    }

    public final void (Graphics graphics, int n, int n2, boolean bl != null) {
        int n3;
        if ((this.var_byte_new == dd_0.var_byte_try)) {
            n3 = var_int_arr_if[4];
            if (((0xD9 ^ 0x92) & ~(0xE8 ^ 0xA3)) != 0) {
                return;
            }
        } else {
            n3 = var_int_arr_if[14];
        }
        graphics.drawImage(fh.var_javax_microedition_lcdui_Image_do, n + n3, n2 - var_int_arr_if[2], var_int_arr_if[5]);
        if ((this.var_java_util_Vector_if != null)) {
            int n4 = this.var_java_util_Vector_if.size();
            int n5 = var_int_arr_if[1];
            while ((n5 < n4)) {
                am am2 = aa_0.am_do(((cg)this.var_java_util_Vector_if.elementAt((int)n5)).var_short_do);
                if ((am2 != null)) {
                    if ((am2.var_byte_if == var_int_arr_if[15]) && (this.var_short_final != var_int_arr_if[0])) {
                        am2 = aa_0.am_do(this.var_short_final);
                    }
                    am2.cfr_renamed_1(graphics, this.var_int_byte, n, n2, this.var_byte_new);
                }
                ++n5;
                if (-"  ".length() < 0) continue;
                return;
            }
        }
        if (DuLieuNguoiChoi.boolean_new(bl ? 1 : 0)) {
            this.cfr_renamed_1(graphics, n, n2 - dF.cfr_renamed_7);
        }
        super.cfr_renamed_1(graphics);
    }

    public final void (cg cg2 != null) {
        Object object = aa_0.am_do(cg2.var_short_do);
        if ((object != null) && DuLieuNguoiChoi.cfr_renamed_8(((am)object).cfr_renamed_2, var_int_arr_if[14])) {
            object = aa_0.cfr_renamed_1((int)((am)object).var_byte_if, this.var_java_util_Vector_if);
            if ((object != null)) {
                this.var_java_util_Vector_if.removeElement(object);
                }
            this.var_java_util_Vector_if.addElement(cg2);
        }
    }

    public final void void_do() {
        int n;
        if ((this.fontRenderer != null)) {
            ar_0 ar_02 = this.fontRenderer;
            n = var_int_arr_if[1];
            while ((n < var_int_arr_if[5])) {
                int n2 = n;
                ar_02.mangSoNguyen[n2] = ar_02.mangSoNguyen[n2] - var_int_arr_if[2];
                if ((ar_02.mangSoNguyen[n] < var_int_arr_if[24])) {
                    ar_02.mangSoNguyen[n] = var_int_arr_if[1];
                    ar_02.var_byte_arr_do[n] = var_int_arr_if[17];
                }
                int n3 = n;
                ar_02.var_byte_arr_if[n3] = (byte)(ar_02.var_byte_arr_if[n3] + var_int_arr_if[2]);
                if ((ar_02.var_byte_arr_if[n] == var_int_arr_if[17])) {
                    ar_02.var_byte_arr_if[n] = var_int_arr_if[1];
                }
                int n4 = n;
                ar_02.var_int_arr_if[n4] = ar_02.var_int_arr_if[n4] + (ar_02.var_byte_arr_for[n] << var_int_arr_if[2]);
                if ((ar_02.var_byte_arr_for[n] == var_int_arr_if[2])) {
                    if ((ar_02.var_int_arr_if[n] > var_int_arr_if[11] - hg.int_do(ar_02.mangSoNguyen[n] / var_int_arr_if[11]))) {
                        ar_02.var_byte_arr_for[n] = var_int_arr_if[3];
                        if (DuLieuNguoiChoi.boolean_int(ar_02.var_byte_arr_do[n])) {
                            int n5 = n;
                            ar_02.var_byte_arr_do[n5] = (byte)(ar_02.var_byte_arr_do[n5] - var_int_arr_if[2]);
                            if (-" ".length() > ((0xAB ^ 0xBF) & ~(0x44 ^ 0x50))) {
                                return;
                            }
                        }
                    }
                } else {
                    if (DuLieuNguoiChoi.cfr_renamed_5(ar_02.var_int_arr_if[n], -(var_int_arr_if[11] - hg.int_do(ar_02.mangSoNguyen[n] / var_int_arr_if[11])))) {
                        ar_02.var_byte_arr_for[n] = var_int_arr_if[2];
                    }
                    if (DuLieuNguoiChoi.boolean_int(ar_02.var_byte_arr_do[n])) {
                        int n6 = n;
                        ar_02.var_byte_arr_do[n6] = (byte)(ar_02.var_byte_arr_do[n6] - var_int_arr_if[2]);
                    }
                }
                ++n;
                return;
            }
        }
        if (DuLieuNguoiChoi.boolean_new(this.var_boolean_try ? 1 : 0) && (GameCanvas.var_int_goto % var_int_arr_if[25] == var_int_arr_if[11])) {
            this.void_if();
        }
        if (DuLieuNguoiChoi.boolean_new(this.cfr_renamed_4 ? 1 : 0) && (!DuLieuNguoiChoi.boolean_new(go_0.coTrangThai ? 1 : 0) || DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_9, go_0.soLuong) && DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_9, go_0.var_int_if)) && DuLieuNguoiChoi.boolean_do(this.var_java_util_Vector_for.size()) && DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, ((dd_0)this).cfr_renamed_8) && (this.var_byte_int == this.var_int_try)) {
            fh.cfr_renamed_2(this);
            if ((go_0.var_ef_if != null) && DuLieuNguoiChoi.cfr_renamed_4(go_0.var_ef_if.var_short_goto, ((dd_0)this).cfr_renamed_9)) {
                go_0.var_ef_if = null;
                fh.var_bm_do = null;
            }
        }
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_8, ((dd_0)this).cfr_renamed_2) && (this.var_int_try == this.var_byte_int) && DuLieuNguoiChoi.boolean_if(this.var_int_catch)) {
            this.var_int_catch -= var_int_arr_if[2];
            if (DuLieuNguoiChoi.boolean_for(this.var_int_catch)) {
                this.var_int_catch = var_int_arr_if[3];
                this.var_boolean_byte = var_int_arr_if[1];
                this.var_int_class = var_int_arr_if[1];
                if ((this == AngelChip.duLieuNguoiChoi)) {
                    fh.soLuongKhoa = var_int_arr_if[3];
                    if ((0xC9 ^ 0x8F ^ (1 ^ 0x43)) <= 0) {
                        return;
                    }
                }
            } else {
                n = (this.var_short_arr_do[this.var_int_catch] & var_int_arr_if[26]) * fh.var_int_int + fh.var_int_int / var_int_arr_if[4];
                int n7 = (this.var_short_arr_do[this.var_int_catch] >> var_int_arr_if[27]) * fh.var_int_int + fh.var_int_int / var_int_arr_if[4];
                if ((this.var_int_catch == var_int_arr_if[2])) {
                    AngelChip.duLieuNguoiChoi.var_boolean_byte = var_int_arr_if[2];
                    n = this.var_fs_do.soLuong / dF.cfr_renamed_12;
                    n7 = this.var_fs_do.var_int_if / dF.cfr_renamed_12;
                    this.var_int_catch = var_int_arr_if[1];
                }
                if ((this != AngelChip.duLieuNguoiChoi)) {
                    ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[2];
                    this.void_if(n, n7);
                    } else if (DuLieuNguoiChoi.boolean_do(this.boolean_int(n - ((dd_0)this).cfr_renamed_2, n7 - this.var_byte_int) ? 1 : 0) && DuLieuNguoiChoi.boolean_do(this.cfr_renamed_6(n - ((dd_0)this).cfr_renamed_2, n7 - this.var_byte_int) ? 1 : 0)) {
                    if (DuLieuNguoiChoi.boolean_do(fh.cfr_renamed_2(fh.int_if(n, n7)) ? 1 : 0)) {
                        ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[2];
                        this.void_if(n, n7);
                        }
                } else {
                    this.var_int_catch = var_int_arr_if[1];
                    this.cfr_renamed_15();
                    this.var_boolean_byte = var_int_arr_if[1];
                }
            }
        }
        this.cfr_renamed_9();
        if ((this.var_java_util_Vector_int != null)) {
            int n8 = var_int_arr_if[1];
            while ((n8 < this.var_java_util_Vector_int.size())) {
                fz fz2 = (fz)this.var_java_util_Vector_int.elementAt(n8);
                if ((fz2.cfr_renamed_1 == this.var_short_this)) {
                    this.var_short_this = (short)var_int_arr_if[1];
                    this.var_short_final = fz2.cfr_renamed_0;
                    this.var_java_util_Vector_int.removeElement(fz2);
                    if (null == null) break;
                    return;
                }
                ++n8;
                if ("   ".length() > -" ".length()) continue;
                return;
            }
            this.var_short_this = (short)(this.var_short_this + var_int_arr_if[2]);
        }
    }

        public final void void_for(int n, int n2) {
        int n3 = var_int_arr_if[1];
        while ((n3 < this.var_java_util_Vector_if.size() - var_int_arr_if[2])) {
            cg cg2 = (cg)this.var_java_util_Vector_if.elementAt(n3);
            am am2 = aa_0.am_do(cg2.var_short_do);
            if ((n2 == am2.var_byte_if)) {
                this.var_java_util_Vector_if.removeElement(cg2);
                if ("  ".length() > 0) break;
                return;
            }
            ++n3;
            if ("  ".length() < "   ".length()) continue;
            return;
        }
        this.cfr_renamed_0(new cg((short)n));
    }

            private void cfr_renamed_6(int n) {
        if (DuLieuNguoiChoi.cfr_renamed_13(n, ((dd_0)this).cfr_renamed_2)) {
            this.var_byte_new = (byte)var_int_arr_if[1];
            return;
        }
        if (DuLieuNguoiChoi.cfr_renamed_5(n, ((dd_0)this).cfr_renamed_2)) {
            this.var_byte_new = dd_0.var_byte_try;
        }
    }

    private boolean cfr_renamed_6(int n, int n2) {
        boolean bl = this.boolean_if(n, n2);
        if (DuLieuNguoiChoi.boolean_new(bl ? 1 : 0)) {
            this.boolean_do(n, n2);
            }
        return bl;
    }

    public final void void_if(int n) {
        if (DuLieuNguoiChoi.boolean_for(n)) {
            this.var_int_byte = var_byte_arr_arr_do[var_int_arr_if[1]][this.var_byte_final];
            return;
        }
        this.var_int_byte = var_byte_arr_arr_do[n][this.var_byte_final];
    }

            static {
        DuLieuNguoiChoi.cfr_renamed_12();
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

    public final void cfr_renamed_4() {
        int n;
        int n2 = fh.var_int_int * dF.cfr_renamed_12;
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2 / fh.var_int_int, this.var_fs_do.soLuong / n2) && (this.var_byte_int / fh.var_int_int == this.var_fs_do.var_int_if / n2)) {
            this.void_if(this.var_fs_do.soLuong / n2 * fh.var_int_int + this.var_fs_do.soLuong % n2 / var_int_arr_if[4], this.var_fs_do.var_int_if / n2 * fh.var_int_int + this.var_fs_do.var_int_if % n2 / var_int_arr_if[4]);
            return;
        }
        int n3 = this.var_fs_do.var_int_if / n2;
        n2 = this.var_fs_do.soLuong / n2;
        int n4 = this.var_byte_int / fh.var_int_int;
        int n5 = ((dd_0)this).cfr_renamed_2 / fh.var_int_int;
        DuLieuNguoiChoi ef2 = this;
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
        while ((n9 < ef2.var_boolean_arr_arr_do.length * ef2.var_boolean_arr_arr_do[var_int_arr_if[1]].length)) {
            ef2.var_short_arr_if[n9] = var_int_arr_if[1];
            ef2.var_short_arr_for[n9] = var_int_arr_if[1];
            ef2.var_short_arr_do[n9] = var_int_arr_if[1];
            if ((fh.var_short_arr_do[n9] != var_int_arr_if[45]) && DuLieuNguoiChoi.boolean_do(fh.boolean_if(fh.var_short_arr_do[n9]) ? 1 : 0)) {
                ef2.var_boolean_arr_arr_do[n9 % fh.var_short_if][n9 / fh.var_short_if] = var_int_arr_if[2];
                if ("  ".length() < 0) {
                    return;
                }
            } else {
                ef2.var_boolean_arr_arr_do[n9 % fh.var_short_if][n9 / fh.var_short_if] = var_int_arr_if[1];
            }
            ++n9;
            if (" ".length() == " ".length()) continue;
            return;
        }
        if (DuLieuNguoiChoi.boolean_new(fh.boolean_do(fh.int_if(n2 * fh.var_int_int, n3 * fh.var_int_int)) ? 1 : 0)) {
            ef2.var_boolean_arr_arr_do[n2][n3] = var_int_arr_if[1];
        }
        ef2.var_short_arr_if[DuLieuNguoiChoi.var_int_arr_if[1]] = (short)((n4 << var_int_arr_if[27]) + n5);
        while (DuLieuNguoiChoi.boolean_do(n8) && (n7 < n6)) {
            n5 = ef2.var_short_arr_if[n7] & var_int_arr_if[26];
            n4 = ef2.var_short_arr_if[n7] >> var_int_arr_if[27];
            n = var_int_arr_if[1];
            while ((n < var_int_arr_if[0]) && DuLieuNguoiChoi.boolean_do(n8)) {
                n9 = n5 + nArray2[n];
                int n10 = n4 + nArray4[n];
                if (DuLieuNguoiChoi.boolean_if(n9) && (n9 < ef2.var_boolean_arr_arr_do.length) && DuLieuNguoiChoi.boolean_if(n10) && (n10 < ef2.var_boolean_arr_arr_do[var_int_arr_if[1]].length) && DuLieuNguoiChoi.boolean_do(ef2.var_boolean_arr_arr_do[n9][n10])) {
                    ef2.var_short_arr_for[n6] = ef2.var_short_arr_if[n7];
                    ef2.var_short_arr_if[n6++] = (short)((n10 << var_int_arr_if[27]) + n9);
                    ef2.var_boolean_arr_arr_do[n9][n10] = var_int_arr_if[2];
                    if ((n2 == n9) && (n3 == n10)) {
                        n8 = var_int_arr_if[2];
                    }
                }
                if ((n6 >= ef2.var_boolean_arr_arr_do.length * ef2.var_boolean_arr_arr_do[var_int_arr_if[1]].length)) {
                    n8 = var_int_arr_if[2];
                    if (((127 + 162 - 166 + 121 ^ 37 + 6 - -56 + 75) & (0x20 ^ 0x38 ^ (0x1E ^ 0x5C) ^ -" ".length())) == 0) break;
                    return;
                }
                ++n;
                if ("  ".length() >= -" ".length()) continue;
                return;
            }
            ++n7;
            if (((0x31 ^ 0x12) & ~(0x27 ^ 4)) <= " ".length()) continue;
            return;
        }
        ef2.var_int_catch = var_int_arr_if[1];
        if (DuLieuNguoiChoi.boolean_new(n8)) {
            AngelChip.duLieuNguoiChoi.cfr_renamed_7();
            n = n6 - var_int_arr_if[2];
            int n11 = ef2.var_int_catch;
            ef2.var_int_catch = n11 + var_int_arr_if[2];
            ef2.var_short_arr_do[n11] = ef2.var_short_arr_if[n];
            block3: while (DuLieuNguoiChoi.boolean_int(n)) {
                n5 = var_int_arr_if[1];
                while ((n5 < n6)) {
                    if ((ef2.var_short_arr_if[n5] == ef2.var_short_arr_for[n])) {
                        n = n5;
                        int n12 = ef2.var_int_catch;
                        ef2.var_int_catch = n12 + var_int_arr_if[2];
                        ef2.var_short_arr_do[n12] = ef2.var_short_arr_if[n5];
                        if ((0x54 ^ 0x50) > -" ".length()) continue block3;
                        return;
                    }
                    ++n5;
                    return;
                }
            }
        }
        ef2.var_int_catch -= var_int_arr_if[2];
        if (DuLieuNguoiChoi.boolean_do(n8)) {
            this.var_int_catch = var_int_arr_if[1];
            if ((this == AngelChip.duLieuNguoiChoi)) {
                fh.soLuongKhoa = var_int_arr_if[3];
            }
        }
    }

    public final void (int n, int n2, int n3 != null) {
        if ((this.mangSoNguyen[var_int_arr_if[1]] != n)) {
            GameCanvas.void_do(n - this.mangSoNguyen[var_int_arr_if[1]], ((dd_0)this).cfr_renamed_2, this.var_byte_int - hg.int_new(var_int_arr_if[25]), var_int_arr_if[3]);
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
        }
        if ((this.mangSoNguyen[var_int_arr_if[4]] != n2)) {
            GameCanvas.cfr_renamed_1(n2 - this.mangSoNguyen[var_int_arr_if[4]] + "luong", (int)((dd_0)this).cfr_renamed_2, this.var_byte_int - hg.int_new(var_int_arr_if[25]), var_int_arr_if[1], var_int_arr_if[3]);
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[4]] = n2;
        }
        if ((this.soLuong != n3)) {
            GameCanvas.cfr_renamed_1(n3 - this.soLuong + "luong", (int)((dd_0)this).cfr_renamed_2, this.var_byte_int - hg.int_new(var_int_arr_if[25]), var_int_arr_if[1], var_int_arr_if[3]);
            this.soLuong = n3;
        }
    }

        public final void cfr_renamed_5() {
        this.cfr_renamed_6();
        fh.cfr_renamed_0(this);
    }

    public final int int_do() {
        return this.mangSoNguyen[var_int_arr_if[1]];
    }

    public final void cfr_renamed_6() {
        int n = var_int_arr_if[1];
        while ((n < this.var_java_util_Vector_if.size())) {
            cg cg2 = (cg)this.var_java_util_Vector_if.elementAt(n);
            if (DuLieuNguoiChoi.cfr_renamed_4(aa_0.am_do((short)cg2.var_short_do).var_byte_if, var_int_arr_if[3])) {
                this.var_java_util_Vector_if.removeElement(cg2);
                this.var_short_if = cg2.var_short_do;
            }
            ++n;
            if (" ".length() != 0) continue;
            return;
        }
    }

    public final void (String string != null) {
        this.chuoiGiaTri = string;
        if ((string.length() > var_int_arr_if[22])) {
            this.tenNhanVat = string.substring(var_int_arr_if[1], var_int_arr_if[17]) + "..";
            if (-" ".length() >= "   ".length()) {
                return;
            }
        } else {
            this.tenNhanVat = string;
        }
        this.cfr_renamed_24 = (short)GameCanvas.var_fz_0_do.cfr_renamed_1(string);
    }

    public final void void_for(int n) {
        this.var_int_break = n;
        int n2 = var_int_arr_if[2];
        do {
            int n3 = n2 * var_int_arr_if[23];
            int n4 = n;
            if (DuLieuNguoiChoi.boolean_for(n -= n3)) {
                this.var_short_char = (byte)n2;
                this.var_byte_char = (byte)(n4 * var_int_arr_if[23] / (n2 * var_int_arr_if[23]));
                return;
            }
            ++n2;
            } while (((0x46 ^ 0xC) & ~(0x78 ^ 0x32)) == 0);
    }

    public final void cfr_renamed_7() {
        this.var_byte_byte = (byte)var_int_arr_if[1];
        this.var_byte_case = (byte)var_int_arr_if[1];
        ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
    }

    public final void cfr_renamed_8() {
        if (!DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_2) || DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2])) {
            ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[11];
            if ((this.var_int_this == var_int_arr_if[3])) {
                this.var_int_this = var_int_arr_if[1];
            }
            this.var_byte_byte = -this.var_byte_int;
        }
    }

        private static boolean boolean_for(int n) {
        return n < 0;
    }

    public final boolean boolean_for(int n, int n2) {
        if (!(DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_2) && !DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2]) || DuLieuNguoiChoi.boolean_new(this.var_int_class) && !(this.var_int_class == var_int_arr_if[33]))) {
            short s2 = fh.var_short_arr_do[n2 / fh.var_int_int * fh.var_short_if + n / fh.var_int_int];
            if ((s2 != var_int_arr_if[40]) && (s2 != var_int_arr_if[46]) && (s2 != var_int_arr_if[41])) {
                if ((s2 == var_int_arr_if[39])) {
                    ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[4];
                    this.var_byte_this = (byte)var_int_arr_if[38];
                    ((dd_0)this).cfr_renamed_2 = (byte)(n / fh.var_int_int * fh.var_int_int + fh.var_int_int / var_int_arr_if[4]);
                    this.var_byte_int = (byte)(n2 / fh.var_int_int * fh.var_int_int + fh.var_int_int - var_int_arr_if[2]);
                    go_0.go_0_do();
                    go_0.cfr_renamed_1((int)((dd_0)this).cfr_renamed_2, n2, this.var_byte_new, this.var_short_int);
                    go_0.go_0_do();
                    go_0.cfr_renamed_0(var_int_arr_if[4]);
                    return var_int_arr_if[2];
                }
                if ((s2 == var_int_arr_if[37])) {
                    ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[0];
                    this.var_byte_this = (byte)var_int_arr_if[38];
                    ((dd_0)this).cfr_renamed_2 = (byte)(n / fh.var_int_int * fh.var_int_int + fh.var_int_int / var_int_arr_if[4]);
                    go_0.go_0_do();
                    go_0.cfr_renamed_1((int)((dd_0)this).cfr_renamed_2, n2, this.var_byte_new, this.var_short_int);
                    go_0.go_0_do();
                    go_0.cfr_renamed_0(var_int_arr_if[0]);
                    return var_int_arr_if[2];
                }
                return var_int_arr_if[1];
            }
            ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[4];
            this.var_byte_this = (byte)var_int_arr_if[47];
            ((dd_0)this).cfr_renamed_2 = (byte)(n / fh.var_int_int * fh.var_int_int + fh.var_int_int / var_int_arr_if[4]);
            this.var_byte_int = (byte)(n2 / fh.var_int_int * fh.var_int_int + fh.var_int_int - var_int_arr_if[2]);
            go_0.go_0_do();
            go_0.cfr_renamed_1((int)((dd_0)this).cfr_renamed_2, (int)this.var_byte_int, this.var_byte_new, this.var_short_int);
            go_0.go_0_do();
            go_0.cfr_renamed_0(((dd_0)this).cfr_renamed_2);
            return var_int_arr_if[2];
        }
        return var_int_arr_if[1];
    }

        private static boolean boolean_int(int n) {
        return n > 0;
    }

    public final void (Graphics graphics, int n, int n2 != null) {
        int n3 = var_int_arr_if[1];
        n2 = n2 - this.var_int_new * bm.var_int_if + (this.var_byte_case + this.var_byte_this) * bm.var_int_if;
        if ((this.var_short_break != var_int_arr_if[3])) {
            n3 = var_int_arr_if[22];
            aa_0.cfr_renamed_1(graphics, this.var_short_break, n + var_byte_arr_do[this.var_byte_new] * bm.var_int_if - this.cfr_renamed_24 / var_int_arr_if[4], n2 + dF.cfr_renamed_7 / var_int_arr_if[4], var_int_arr_if[5]);
        }
        n += (var_byte_arr_do[this.var_byte_new] + n3) * bm.var_int_if;
        if ((this.cfr_renamed_23 != var_int_arr_if[3])) {
            aa_0.cfr_renamed_1(graphics, this.cfr_renamed_23, n + this.cfr_renamed_24 / var_int_arr_if[4] + var_int_arr_if[17] * bm.var_int_if, n2 + dF.cfr_renamed_7 / var_int_arr_if[4], var_int_arr_if[5]);
        }
        if (DuLieuNguoiChoi.boolean_new(TienIchGame.boolean_if(this.chuoiGiaTri) ? 1 : 0)) {
            var_cu_0_do.cfr_renamed_1(var_int_arr_if[1], n + this.cfr_renamed_24 / var_int_arr_if[4] + var_int_arr_if[22] * bm.var_int_if, n2 + var_int_arr_if[5], var_int_arr_if[1], var_int_arr_if[5], graphics);
            if ((0x48 ^ 0x4C) < ((0x7D ^ 0x26) & ~(0x42 ^ 0x19))) {
                return;
            }
        } else if ((this.var_byte_else != var_int_arr_if[3])) {
            var_cu_0_do.cfr_renamed_1(this.var_byte_else, n + this.cfr_renamed_24 / var_int_arr_if[4] + var_int_arr_if[22] * bm.var_int_if, n2 + var_int_arr_if[5], var_int_arr_if[1], var_int_arr_if[5], graphics);
        }
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_9, AngelChip.duLieuNguoiChoi.var_short_goto)) {
            GameCanvas.var_fz_0_do.cfr_renamed_1(graphics, this.chuoiGiaTri, n, n2, var_int_arr_if[4]);
            return;
        }
        GameCanvas.var_fz_0_for.cfr_renamed_1(graphics, this.chuoiGiaTri, n, n2, var_int_arr_if[4]);
    }

    private void this() {
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[13])) {
            ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
            this.void_do(gd_0.gd_0_do().soLuongKhoa, gd_0.gd_0_do().var_int_if);
            ep_0.ep_0_do().cfr_renamed_7(var_int_arr_if[1]);
            go_0.go_0_do();
            go_0.cfr_renamed_1((int)AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, AngelChip.duLieuNguoiChoi.cfr_renamed_4 ? 1 : 0, AngelChip.duLieuNguoiChoi.var_short_do);
            GameCanvas.var_boolean_arr_if[DuLieuNguoiChoi.var_int_arr_if[27]] = var_int_arr_if[1];
        }
    }

    public final void cfr_renamed_13() {
        if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[4]) && DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[36])) {
            this.this();
            return;
        }
        int n = fh.int_do((int)((dd_0)this).cfr_renamed_2, this.var_byte_int - var_int_arr_if[48]);
        if ((n == var_int_arr_if[3])) {
            return;
        }
        ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
        this.var_byte_this = (byte)var_int_arr_if[1];
        if ((fh.var_short_arr_do[n] == var_int_arr_if[35])) {
            if ((fh.var_short_arr_if[n] == var_int_arr_if[45])) {
                fh.var_short_arr_do[n] = var_int_arr_if[39];
                return;
            }
            if ((fh.var_short_arr_if[n] == var_int_arr_if[49])) {
                fh.var_short_arr_do[n] = var_int_arr_if[41];
                return;
            }
            fh.var_short_arr_do[n] = var_int_arr_if[40];
            return;
        }
    }

    public final void (cg cg2 == null) {
        if ((this.var_java_util_Vector_if == null)) {
            this.var_java_util_Vector_if = new Vector();
        }
        this.var_java_util_Vector_if.addElement(cg2);
    }

    private static void cfr_renamed_12() {
        var_int_arr_if = new int[52];
        DuLieuNguoiChoi.var_int_arr_if[0] = 68 + 56 - -11 + 25 ^ 26 + 160 - 171 + 149;
        DuLieuNguoiChoi.var_int_arr_if[1] = (0xB6 ^ 0xA5) & ~(0x47 ^ 0x54);
        DuLieuNguoiChoi.var_int_arr_if[2] = " ".length();
        DuLieuNguoiChoi.var_int_arr_if[3] = -" ".length();
        DuLieuNguoiChoi.var_int_arr_if[4] = "  ".length();
        DuLieuNguoiChoi.var_int_arr_if[5] = "   ".length();
        DuLieuNguoiChoi.var_int_arr_if[6] = -(0xFFFFFE79 & 0x319E) & (0xFFFFF3FF & 0x3FFF);
        DuLieuNguoiChoi.var_int_arr_if[7] = 0xFFFFA92D & 0x57FE;
        DuLieuNguoiChoi.var_int_arr_if[8] = 0x1D ^ 0x37;
        DuLieuNguoiChoi.var_int_arr_if[9] = 0x15 ^ 0x5B ^ (0xD2 ^ 0x95);
        DuLieuNguoiChoi.var_int_arr_if[10] = 0x89 ^ 0x97;
        DuLieuNguoiChoi.var_int_arr_if[11] = 0x50 ^ 0x65 ^ (0x49 ^ 0x76);
        DuLieuNguoiChoi.var_int_arr_if[12] = 0xCA ^ 0xC5;
        DuLieuNguoiChoi.var_int_arr_if[13] = 0xA3 ^ 0xAD;
        DuLieuNguoiChoi.var_int_arr_if[14] = -"  ".length();
        DuLieuNguoiChoi.var_int_arr_if[15] = 0x34 ^ 0x1C;
        DuLieuNguoiChoi.var_int_arr_if[16] = 0xB ^ 3 ^ (0x2A ^ 0x10);
        DuLieuNguoiChoi.var_int_arr_if[17] = 82 + 37 - 88 + 108 ^ 65 + 13 - -48 + 15;
        DuLieuNguoiChoi.var_int_arr_if[18] = 0x5F ^ 0x2A ^ (0xFE ^ 0x93);
        DuLieuNguoiChoi.var_int_arr_if[19] = 0x3D ^ 0x60 ^ (9 ^ 0x61);
        DuLieuNguoiChoi.var_int_arr_if[20] = 0x60 ^ 0x54;
        DuLieuNguoiChoi.var_int_arr_if[21] = 0xFFFFA25F & 0x5FFE;
        DuLieuNguoiChoi.var_int_arr_if[22] = 69 + 140 - 111 + 50 ^ 35 + 95 - 46 + 63;
        DuLieuNguoiChoi.var_int_arr_if[23] = 0x3A ^ 0x5E;
        DuLieuNguoiChoi.var_int_arr_if[24] = -(0x48 ^ 0x74);
        DuLieuNguoiChoi.var_int_arr_if[25] = 2 ^ 0x16;
        DuLieuNguoiChoi.var_int_arr_if[26] = 80 + 63 - 20 + 26 + (0x79 ^ 0x45) - -(0x9C ^ 0x8E) + (0xB ^ 0x17);
        DuLieuNguoiChoi.var_int_arr_if[27] = 0xA5 ^ 0x9B ^ (0xB5 ^ 0x83);
        DuLieuNguoiChoi.var_int_arr_if[28] = 0x70 ^ 0x30 ^ (0x2E ^ 0x28);
        DuLieuNguoiChoi.var_int_arr_if[29] = 100 + 101 - 124 + 106 ^ 149 + 138 - 243 + 144;
        DuLieuNguoiChoi.var_int_arr_if[30] = 0x8A ^ 0x8F;
        DuLieuNguoiChoi.var_int_arr_if[31] = 0x25 ^ 1 ^ (0xAC ^ 0xA5);
        DuLieuNguoiChoi.var_int_arr_if[32] = 0x30 ^ 0x5B;
        DuLieuNguoiChoi.var_int_arr_if[33] = -(0x7E ^ 0xE ^ (0x2A ^ 0x5F));
        DuLieuNguoiChoi.var_int_arr_if[34] = 77 + 7 - 8 + 106 ^ 86 + 154 - 122 + 80;
        DuLieuNguoiChoi.var_int_arr_if[35] = 0xCD ^ 0x95 ^ "  ".length();
        DuLieuNguoiChoi.var_int_arr_if[36] = 0xDD ^ 0x96 ^ (0x7D ^ 0x3B);
        DuLieuNguoiChoi.var_int_arr_if[37] = 0x64 ^ 0x27;
        DuLieuNguoiChoi.var_int_arr_if[38] = -(0x2D ^ 0x14 ^ (0xB ^ 0x38));
        DuLieuNguoiChoi.var_int_arr_if[39] = 0xE1 ^ 0xBD;
        DuLieuNguoiChoi.var_int_arr_if[40] = 0x6B ^ 0x24;
        DuLieuNguoiChoi.var_int_arr_if[41] = 0x4C ^ 0x2C ^ (0xC2 ^ 0x94);
        DuLieuNguoiChoi.var_int_arr_if[42] = 0xDF ^ 0xA8 ^ (0xC4 ^ 0xAF);
        DuLieuNguoiChoi.var_int_arr_if[43] = 5 + 76 - -72 + 18 ^ 72 + 20 - 65 + 140;
        DuLieuNguoiChoi.var_int_arr_if[44] = -(0xFFFFF97F & 0x6EB7) & (0xFFFFFF36 & 0x7735FCFF);
        DuLieuNguoiChoi.var_int_arr_if[45] = 0xA1 ^ 0xBA ^ (0x68 ^ 0x23);
        DuLieuNguoiChoi.var_int_arr_if[46] = 0xA8 ^ 0x85 ^ (0xEE ^ 0x92);
        DuLieuNguoiChoi.var_int_arr_if[47] = -(0xA1 ^ 0xA7);
        DuLieuNguoiChoi.var_int_arr_if[48] = 129 + 80 - 93 + 46 ^ 20 + 10 - 10 + 156;
        DuLieuNguoiChoi.var_int_arr_if[49] = 158 + 140 - 241 + 172 ^ 5 + 39 - 5 + 93;
        DuLieuNguoiChoi.var_int_arr_if[50] = 0x6E ^ 0x48 ^ (0x53 ^ 0x2D);
        DuLieuNguoiChoi.var_int_arr_if[51] = -"   ".length();
    }

    public final void (byte by2 == null) {
        if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[11])) {
            if ((by2 != var_int_arr_if[4]) && (by2 != var_int_arr_if[36]) && (by2 != var_int_arr_if[0])) {
                if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[13])) {
                    ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
                    if (((91 + 206 - 212 + 166 ^ 105 + 5 - 23 + 97) & (56 + 175 - 160 + 183 ^ 100 + 73 - 40 + 56 ^ -" ".length())) == "   ".length()) {
                        return;
                    }
                }
            } else {
                short s2 = fh.var_short_arr_do[(this.var_byte_int - var_int_arr_if[12]) / fh.var_int_int * fh.var_short_if + ((dd_0)this).cfr_renamed_2 / fh.var_int_int];
                if ((s2 != var_int_arr_if[40]) && (s2 != var_int_arr_if[46]) && (s2 != var_int_arr_if[41])) {
                    if (!(s2 != var_int_arr_if[39]) || (s2 == var_int_arr_if[37])) {
                        this.var_byte_this = (byte)var_int_arr_if[38];
                        if ("  ".length() < "  ".length()) {
                            return;
                        }
                    }
                } else {
                    this.var_byte_this = (byte)var_int_arr_if[47];
                    if ((s2 == var_int_arr_if[46])) {
                        this.var_byte_this = (byte)(var_int_arr_if[47] * bm.var_int_if);
                    }
                }
                ((dd_0)this).cfr_renamed_2 = by2;
            }
            if ((by2 == var_int_arr_if[11])) {
                this.cfr_renamed_8();
                return;
            }
            if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_9, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                this.var_java_util_Vector_for.addElement(new fs(var_int_arr_if[3], var_int_arr_if[3], by2));
                return;
            }
            ((dd_0)this).cfr_renamed_2 = by2;
        }
    }

    public final int int_if() {
        if (DuLieuNguoiChoi.boolean_new(go_0.var_boolean_int ? 1 : 0)) {
            return this.mangSoNguyen[var_int_arr_if[5]];
        }
        return this.mangSoNguyen[var_int_arr_if[1]];
    }

    public final void void_int(int n) {
        if (DuLieuNguoiChoi.boolean_new(go_0.var_boolean_int ? 1 : 0)) {
            this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[5]] = n;
            return;
        }
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[1]] = n;
    }

    private void cfr_renamed_15() {
        this.var_int_catch = var_int_arr_if[1];
        this.var_boolean_byte = var_int_arr_if[1];
        this.var_int_class = var_int_arr_if[1];
        if ((this == AngelChip.duLieuNguoiChoi)) {
            fh.soLuongKhoa = var_int_arr_if[3];
            return;
        }
        this.var_fs_do = null;
        this.var_short_arr_if = null;
        this.var_short_arr_for = null;
        this.var_short_arr_do = null;
        this.var_boolean_arr_arr_do = null;
    }

    private static boolean boolean_new(int n) {
        return n != 0;
    }

    public final void void_new(int n) {
        this.var_short_final = (short)n;
    }

    public final void (short s2 != null) {
        this.var_short_if = s2;
        dH dH2 = fh.dH_do(((dd_0)this).cfr_renamed_9);
        if ((dH2 != null)) {
            fh.cfr_renamed_1(dH2);
            this.var_short_if = s2;
        }
        this.cfr_renamed_5();
    }

    public final void (Graphics graphics != null) {
        if (DuLieuNguoiChoi.cfr_renamed_7((((dd_0)this).cfr_renamed_2 + var_int_arr_if[12]) * bm.var_int_if, fm.fm_do().cfr_renamed_3) && DuLieuNguoiChoi.cfr_renamed_9((((dd_0)this).cfr_renamed_2 - var_int_arr_if[12]) * bm.var_int_if, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && DuLieuNguoiChoi.boolean_do(this.dangChayAuto ? 1 : 0) && (!DuLieuNguoiChoi.boolean_int(GameCanvas.cfr_renamed_12) || (GameCanvas.var_en_do != ff_0.cfr_renamed_1()))) {
            am am2;
            if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[13])) {
                int n;
                if ((this.var_byte_new == dd_0.var_byte_try)) {
                    n = var_int_arr_if[4];
                    if ("  ".length() == 0) {
                        return;
                    }
                } else {
                    n = var_int_arr_if[14];
                }
                graphics.drawImage(fh.var_javax_microedition_lcdui_Image_do, (((dd_0)this).cfr_renamed_2 + n) * bm.var_int_if, (this.var_byte_int - var_int_arr_if[2]) * bm.var_int_if, var_int_arr_if[5]);
            }
            int n = this.var_java_util_Vector_if.size();
            int n2 = var_int_arr_if[1];
            int n3 = var_int_arr_if[1];
            while ((n3 < n)) {
                am2 = aa_0.am_do(((cg)this.var_java_util_Vector_if.elementAt((int)n3)).var_short_do);
                if (!(!(am2 != null) || DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[13]) && (am2.var_byte_if != var_int_arr_if[10]) && (am2.var_byte_if != var_int_arr_if[15]) && !(am2.var_byte_if == var_int_arr_if[16]))) {
                    if ((am2.var_byte_if == var_int_arr_if[15])) {
                        if ((this.var_short_final != var_int_arr_if[0])) {
                            am2 = aa_0.am_do(this.var_short_final);
                            if ("  ".length() == 0) {
                                return;
                            }
                        } else if ((!(this.var_short_final != var_int_arr_if[0]) || (this.var_short_final == var_int_arr_if[17])) && (this.cfr_renamed_17 < var_int_arr_if[2] + this.var_byte_do)) {
                            n2 = var_int_arr_if[2];
                        }
                    }
                    if ((fh.var_int_char != var_int_arr_if[18]) && !(fh.var_int_char == var_int_arr_if[19]) || !DuLieuNguoiChoi.boolean_do(aa_0.boolean_do((int)am2.var_byte_if) ? 1 : 0) || (am2.var_byte_if == var_int_arr_if[20])) {
                        am2.cfr_renamed_1(graphics, this.var_int_byte, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, (this.var_byte_int + this.var_byte_case + this.var_byte_this + this.var_short_int) * bm.var_int_if, this.var_byte_new);
                        if (DuLieuNguoiChoi.boolean_new(n2)) {
                            n2 = var_int_arr_if[1];
                            am2 = aa_0.am_do(var_int_arr_if[21]);
                            if ((fh.var_int_char != var_int_arr_if[18]) && !(fh.var_int_char == var_int_arr_if[19]) || !DuLieuNguoiChoi.boolean_do(aa_0.boolean_do((int)am2.var_byte_if) ? 1 : 0) || (am2.var_byte_if == var_int_arr_if[20])) {
                                am2.cfr_renamed_1(graphics, this.var_int_byte, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, (this.var_byte_int + this.var_byte_case + this.var_byte_this + this.var_short_int) * bm.var_int_if, this.var_byte_new);
                            }
                        }
                    }
                }
                ++n3;
                if (((0x7B ^ 0x3E ^ (0xD9 ^ 0x8D)) & (0x69 ^ 0x48 ^ (0xA5 ^ 0x95) ^ -" ".length())) == 0) continue;
                return;
            }
            if ((!DuLieuNguoiChoi.boolean_new(gA.cfr_renamed_1().mangSoNguyen[var_int_arr_if[1]]) || (this == fh.var_bm_do)) && (fh.var_int_char != var_int_arr_if[18])) {
                this.cfr_renamed_1(graphics, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, (this.var_byte_int + this.var_short_int) * bm.var_int_if - dF.cfr_renamed_7);
            }
            if ((this.fontRenderer != null)) {
                am2 = graphics;
                ar_0 ar_02 = this.fontRenderer;
                n3 = var_int_arr_if[1];
                while ((n3 < var_int_arr_if[5])) {
                    var_cu_0_for.cfr_renamed_1(ar_02.var_byte_arr_if[n3] / var_int_arr_if[5], (ar_02.var_int_if + ar_02.var_int_arr_if[n3]) * dF.cfr_renamed_12, (ar_02.soLuong + ar_02.mangSoNguyen[n3]) * dF.cfr_renamed_12, var_int_arr_if[1], var_int_arr_if[5], (Graphics)am2);
                    ++n3;
                    if ("   ".length() > " ".length()) continue;
                    return;
                }
            }
            if (DuLieuNguoiChoi.boolean_int(this.var_byte_const) && (this.var_int_class == var_int_arr_if[14])) {
                int n4;
                if ((GameCanvas.var_int_goto % var_int_arr_if[17] >= var_int_arr_if[5])) {
                    n4 = var_int_arr_if[1];
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    n4 = var_int_arr_if[2];
                }
                var_cu_0_if.cfr_renamed_1(n4, ((dd_0)this).cfr_renamed_2 * bm.var_int_if, this.var_byte_int * bm.var_int_if - this.var_int_new / var_int_arr_if[4], var_int_arr_if[1], var_int_arr_if[5], graphics);
            }
            super.cfr_renamed_1(graphics);
        }
    }

        public final void void_try(int n) {
        this.mangSoNguyen[DuLieuNguoiChoi.var_int_arr_if[4]] = n;
    }

    public final void cfr_renamed_9() {
        block93: {
            int n;
            block94: {
                block97: {
                    DuLieuNguoiChoi ef2;
                    Object object;
                    block96: {
                        block95: {
                            if (DuLieuNguoiChoi.boolean_try(this.cfr_renamed_17)) {
                                this.cfr_renamed_17 = (short)(var_int_arr_if[11] + hg.int_new(var_int_arr_if[28]) / (this.var_byte_do + var_int_arr_if[2]));
                            }
                            this.cfr_renamed_17 = (short)(this.cfr_renamed_17 - var_int_arr_if[2]);
                            this.var_byte_final = (byte)(this.var_byte_final + var_int_arr_if[2]);
                            if ((this.var_byte_final >= var_int_arr_if[11])) {
                                this.var_byte_final = (byte)var_int_arr_if[1];
                            }
                            if (DuLieuNguoiChoi.boolean_for(((dd_0)this).cfr_renamed_2)) {
                                this.var_int_byte = var_byte_arr_arr_do[var_int_arr_if[1]][this.var_byte_final];
                                if (((0x57 ^ 0x7E) & ~(0x7B ^ 0x52)) != ((0x2A ^ 7) & ~(0x7E ^ 0x53))) {
                                    return;
                                }
                            } else if (DuLieuNguoiChoi.cfr_renamed_5(((dd_0)this).cfr_renamed_2, var_byte_arr_arr_do.length)) {
                                this.var_int_byte = var_byte_arr_arr_do[((dd_0)this).cfr_renamed_2][this.var_byte_final];
                            }
                            if (!DuLieuNguoiChoi.boolean_do(this.var_short_long) || !(this.var_short_final != var_int_arr_if[29]) || !(this.var_short_final != var_int_arr_if[22]) || (this.var_short_final == var_int_arr_if[9])) {
                                if (DuLieuNguoiChoi.boolean_do(this.var_short_long)) {
                                    this.cfr_renamed_7 = this.var_short_final;
                                }
                                this.var_short_long = (short)(this.var_short_long + var_int_arr_if[2]);
                                if ((this.var_short_long % var_int_arr_if[11] > var_int_arr_if[30])) {
                                    if ((this.var_short_long > var_int_arr_if[31])) {
                                        this.var_short_long = (short)var_int_arr_if[1];
                                    }
                                    this.var_short_final = (short)var_int_arr_if[0];
                                    if (-" ".length() >= 0) {
                                        return;
                                    }
                                } else {
                                    this.var_short_final = n = this.cfr_renamed_7;
                                }
                            }
                            if ((this == AngelChip.duLieuNguoiChoi) && DuLieuNguoiChoi.boolean_do(this.var_int_class) && !(GameCanvas.var_en_do == w_0.var_w_0_do) || !DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[11])) break block93;
                            if (!DuLieuNguoiChoi.cfr_renamed_9(hg.cfr_renamed_1(((dd_0)this).cfr_renamed_2, this.var_byte_int + this.var_short_int, ((dd_0)this).cfr_renamed_8, this.var_int_try), this.var_int_case)) break block94;
                            if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0) && DuLieuNguoiChoi.boolean_do(this.cfr_renamed_22)) {
                                this.cfr_renamed_22 = (short)var_int_arr_if[1];
                                ((dd_0)this).cfr_renamed_0 = var_int_arr_if[1];
                                this.var_short_int = (short)var_int_arr_if[1];
                            }
                            if ((this.duLieuNguoiChoi != null) && DuLieuNguoiChoi.boolean_do(this.var_byte_const)) {
                                if ((this.var_int_class == var_int_arr_if[14])) {
                                    this.var_byte_const = (byte)var_int_arr_if[25];
                                    if (-" ".length() < -" ".length()) {
                                        return;
                                    }
                                } else if ((this.var_int_class == var_int_arr_if[29])) {
                                    this.var_byte_const = (byte)var_int_arr_if[10];
                                    this.var_short_final = (short)var_int_arr_if[32];
                                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[32];
                                    this.fontRenderer = new ar_0(((dd_0)this).cfr_renamed_2, this.var_byte_int);
                                }
                            }
                            if ((this.var_int_class == var_int_arr_if[33])) {
                                this.var_byte_long = this.var_byte_new;
                                ((dd_0)this).cfr_renamed_2 = (byte)((dd_0)this).cfr_renamed_8;
                                this.var_byte_int = (byte)this.var_int_try;
                                if (DuLieuNguoiChoi.boolean_try(this.var_int_catch)) {
                                    this.var_int_class = var_int_arr_if[1];
                                }
                                if ((GameCanvas.var_dj_0_do == null)) {
                                    go_0.go_0_do();
                                    go_0.cfr_renamed_1((int)((dd_0)this).cfr_renamed_2, (int)this.var_byte_int, this.var_byte_new, this.var_short_int);
                                }
                                if (DuLieuNguoiChoi.boolean_new(go_0.coTrangThai ? 1 : 0) && DuLieuNguoiChoi.cfr_renamed_4(AngelChip.duLieuNguoiChoi.var_short_goto, ((dd_0)this).cfr_renamed_9)) {
                                    this.var_byte_new = (byte)var_int_arr_if[1];
                                    }
                            } else {
                                if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_9, AngelChip.duLieuNguoiChoi.var_short_goto)) {
                                    ((dd_0)this).cfr_renamed_8 = ((dd_0)this).cfr_renamed_2;
                                    this.var_int_try = this.var_byte_int + this.var_short_int;
                                }
                                if (DuLieuNguoiChoi.boolean_do(this.var_java_util_Vector_for.size())) {
                                    if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2])) {
                                        ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
                                    }
                                    this.var_byte_new = this.var_byte_long;
                                    if ((0x80 ^ 0xC6 ^ (0xC ^ 0x4E)) <= 0) {
                                        return;
                                    }
                                } else {
                                    object = (fs)this.var_java_util_Vector_for.elementAt(var_int_arr_if[1]);
                                    this.void_if(((fs)object).soLuong, ((fs)object).var_int_if + ((fs)object).var_short_do);
                                    this.cfr_renamed_22 = ((fs)object).var_short_do;
                                    if (DuLieuNguoiChoi.boolean_new(((fs)object).var_short_do)) {
                                        ((dd_0)this).cfr_renamed_0 = var_int_arr_if[2];
                                    }
                                    if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_8, var_int_arr_if[3]) && (this.var_int_try == var_int_arr_if[3])) {
                                        ((dd_0)this).cfr_renamed_8 = ((dd_0)this).cfr_renamed_2;
                                        this.var_int_try = this.var_byte_int + this.var_short_int;
                                        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[13])) {
                                            fh.var_short_arr_do[this.var_byte_int / fh.var_int_int * fh.var_short_if + ((dd_0)this).cfr_renamed_2 / fh.var_int_int] = var_int_arr_if[34];
                                        }
                                        ((dd_0)this).cfr_renamed_2 = (byte)((fs)object).cfr_renamed_2;
                                        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[13])) {
                                            this.var_byte_int = (byte)this.var_int_try;
                                            ((dd_0)this).cfr_renamed_2 = (byte)((dd_0)this).cfr_renamed_8;
                                            fh.var_short_arr_do[this.var_byte_int / fh.var_int_int * fh.var_short_if + ((dd_0)this).cfr_renamed_2 / fh.var_int_int] = var_int_arr_if[35];
                                        }
                                        if ((!DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[4]) || !DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, var_int_arr_if[36]) || DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[0])) && DuLieuNguoiChoi.boolean_if(n = (this.var_byte_int - fh.var_int_int) / fh.var_int_int * fh.var_short_if + ((dd_0)this).cfr_renamed_2 / fh.var_int_int) && (n < fh.var_short_arr_do.length)) {
                                            if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[0]) && (fh.var_short_arr_do[n] == var_int_arr_if[37])) {
                                                this.var_byte_this = (byte)var_int_arr_if[38];
                                            }
                                            int n2 = fh.int_do((int)((dd_0)this).cfr_renamed_2, this.var_byte_int - var_int_arr_if[11]);
                                            this.var_int_try = this.var_byte_int;
                                            if ((n2 != var_int_arr_if[3])) {
                                                n = fh.var_short_arr_do[n2];
                                                if ((n == var_int_arr_if[39])) {
                                                    this.var_byte_this = (byte)var_int_arr_if[38];
                                                }
                                                if (!(n != var_int_arr_if[40]) || !(n != var_int_arr_if[39]) || !(n != var_int_arr_if[35]) || (n == var_int_arr_if[41])) {
                                                    fh.var_short_arr_do[n2] = var_int_arr_if[35];
                                                }
                                            }
                                            if (" ".length() <= 0) {
                                                return;
                                            }
                                        }
                                    } else {
                                        this.var_byte_new = this.var_byte_long = (byte)((fs)object).cfr_renamed_2;
                                    }
                                    this.var_java_util_Vector_for.removeElementAt(var_int_arr_if[1]);
                                }
                            }
                            if (!DuLieuNguoiChoi.boolean_new(this.var_int_class) || !(this.var_int_class != var_int_arr_if[33])) break block93;
                            if (!DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_9, this.var_int_const) || !(fh.ef_do(this.var_int_long) == null)) break block95;
                            this.var_int_class = var_int_arr_if[1];
                            this.var_int_long = var_int_arr_if[3];
                            break block93;
                        }
                        if (!(this.var_int_long != var_int_arr_if[3]) || !(this.var_int_const != var_int_arr_if[3])) break block93;
                        object = fh.ef_do(this.var_int_long);
                        ef2 = fh.ef_do(this.var_int_const);
                        if (!(ef2 != null) || !(object != null)) break block96;
                        if (DuLieuNguoiChoi.cfr_renamed_13(ef2.var_short_for, ((DuLieuNguoiChoi)object).var_short_for)) {
                            ef2.var_byte_long = dd_0.var_byte_try;
                            ef2.cfr_renamed_4 = ef2.var_byte_long;
                            int n3 = var_int_arr_if[1];
                            ((DuLieuNguoiChoi)object).var_byte_long = (byte)n3;
                            ((DuLieuNguoiChoi)object).cfr_renamed_4 = n3;
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        } else {
                            int n4 = var_int_arr_if[1];
                            ef2.var_byte_long = (byte)n4;
                            ef2.cfr_renamed_4 = n4;
                            ((DuLieuNguoiChoi)object).var_byte_long = dd_0.var_byte_try;
                            ((DuLieuNguoiChoi)object).cfr_renamed_4 = ((DuLieuNguoiChoi)object).var_byte_long;
                        }
                        if (!DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_9, this.var_int_long)) break block97;
                        if (DuLieuNguoiChoi.boolean_int(this.var_short_try)) {
                            this.var_short_try = (short)(this.var_short_try - var_int_arr_if[2]);
                            } else {
                            switch (this.var_int_class) {
                                case -3: {
                                    if ((fh.var_byte_do == var_int_arr_if[3])) {
                                        ft ft2 = new ft(var_int_arr_if[4], var_int_arr_if[1]);
                                        GameCanvas.var_java_util_Vector_if.addElement(ft2);
                                    }
                                    this.var_int_class = var_int_arr_if[1];
                                    ef2.var_int_class = var_int_arr_if[1];
                                    if (null == null) break;
                                    return;
                                }
                                case 9: {
                                    if ((this == AngelChip.duLieuNguoiChoi)) {
                                        go_0.go_0_do();
                                        go_0.cfr_renamed_0(var_int_arr_if[9]);
                                        if (" ".length() > (0x1C ^ 0x18)) {
                                            return;
                                        }
                                    } else if ((AngelChip.duLieuNguoiChoi.var_int_class == var_int_arr_if[27]) && DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_9, AngelChip.duLieuNguoiChoi.var_int_long)) {
                                        go_0.go_0_do();
                                        go_0.cfr_renamed_0(var_int_arr_if[27]);
                                        AngelChip.duLieuNguoiChoi.var_int_class = var_int_arr_if[1];
                                    }
                                    go_0.go_0_do();
                                    go_0.void_do(ef2);
                                    this.var_int_class = var_int_arr_if[1];
                                    ef2.var_int_class = var_int_arr_if[1];
                                    if ((0x35 ^ 0x31) != 0) break;
                                    return;
                                }
                                case 12: {
                                    ef2.var_int_class = var_int_arr_if[1];
                                    this.var_int_class = var_int_arr_if[1];
                                }
                            }
                            this.var_int_void = var_int_arr_if[3];
                            this.var_int_long = var_int_arr_if[3];
                            this.var_int_const = var_int_arr_if[3];
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        break block93;
                    }
                    if ((object != null)) {
                        ((DuLieuNguoiChoi)object).var_int_class = var_int_arr_if[1];
                        ((DuLieuNguoiChoi)object).soLuong = var_int_arr_if[1];
                    }
                    if ((ef2 != null)) {
                        ef2.var_int_class = var_int_arr_if[1];
                        ef2.soLuong = var_int_arr_if[1];
                    }
                }
                if (((8 + 161 - 80 + 83 ^ 22 + 90 - -13 + 26) & (0x39 ^ 0x1C ^ (0xF ^ 0x11) ^ -" ".length())) == "   ".length()) {
                    return;
                }
                break block93;
            }
            this.var_int_float = hg.int_do(((dd_0)this).cfr_renamed_8 - ((dd_0)this).cfr_renamed_2, -(this.var_int_try - (this.var_byte_int + this.var_short_int)));
            int n5 = this.var_int_case * hg.int_int(this.var_int_float) >> var_int_arr_if[11];
            n = -(this.var_int_case * hg.int_if(this.var_int_float)) >> var_int_arr_if[11];
            if (DuLieuNguoiChoi.boolean_new(this.var_boolean_byte ? 1 : 0) && (this.var_int_class == var_int_arr_if[33]) && DuLieuNguoiChoi.boolean_new(AngelChip.duLieuNguoiChoi.boolean_for(((dd_0)this).cfr_renamed_2 + n5, this.var_byte_int + this.var_short_int + n) ? 1 : 0)) {
                this.cfr_renamed_15();
                this.var_int_new = ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
                } else {
                this.var_int_new = n5;
                ((dd_0)this).cfr_renamed_13 = n;
                this.var_byte_byte = (byte)var_int_arr_if[1];
                this.var_byte_case = (byte)var_int_arr_if[1];
                this.var_byte_this = (byte)var_int_arr_if[1];
                this.cfr_renamed_6(((dd_0)this).cfr_renamed_2 + n5);
                if (DuLieuNguoiChoi.cfr_renamed_8(((dd_0)this).cfr_renamed_2, ((dd_0)this).cfr_renamed_8)) {
                    this.cfr_renamed_13();
                }
                if ((this.var_byte_int + this.var_short_int != this.var_int_try)) {
                    this.cfr_renamed_13();
                }
                ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[2];
            }
        }
        if (DuLieuNguoiChoi.boolean_new(((dd_0)this).cfr_renamed_0 ? 1 : 0)) {
            ((dd_0)this).cfr_renamed_2 = (byte)(((dd_0)this).cfr_renamed_2 + this.var_int_new);
            this.var_short_int = (short)(this.var_short_int + ((dd_0)this).cfr_renamed_13);
            if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_9, AngelChip.duLieuNguoiChoi.var_short_goto) && (this.var_short_int < -this.var_short_do)) {
                this.var_short_int = -this.var_short_do;
                }
        } else {
            ((dd_0)this).cfr_renamed_2 = (byte)(((dd_0)this).cfr_renamed_2 + this.var_int_new);
            this.var_byte_int = (byte)(this.var_byte_int + ((dd_0)this).cfr_renamed_13);
        }
        this.var_byte_case = (byte)(this.var_byte_case + this.var_byte_byte);
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[11])) {
            this.var_byte_byte = (byte)(this.var_byte_byte + var_int_arr_if[2]);
        }
        if (!(Math.abs(this.var_byte_byte) < this.var_byte_int) || (Math.abs(this.var_byte_case) > var_int_arr_if[42])) {
            ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
            this.var_byte_byte = (byte)var_int_arr_if[1];
            this.var_byte_case = (byte)var_int_arr_if[1];
        }
        if ((this.var_int_this != var_int_arr_if[3]) && DuLieuNguoiChoi.boolean_do(((dd_0)this).cfr_renamed_2)) {
            this.var_int_this += var_int_arr_if[2];
            if ((this.var_int_this > this.var_byte_class)) {
                this.var_int_this = var_int_arr_if[3];
                if (((0x2B ^ 0xF) & ~(0xBC ^ 0x98)) > 0) {
                    return;
                }
            } else if (DuLieuNguoiChoi.boolean_do(this.var_int_this % var_int_arr_if[17])) {
                this.cfr_renamed_8();
            }
        }
        if (DuLieuNguoiChoi.boolean_do(((dd_0)this).cfr_renamed_2)) {
            this.var_byte_this = (byte)var_int_arr_if[1];
        }
        if (DuLieuNguoiChoi.cfr_renamed_4(((dd_0)this).cfr_renamed_2, var_int_arr_if[2]) && DuLieuNguoiChoi.boolean_do(this.var_int_new) && DuLieuNguoiChoi.boolean_do(((dd_0)this).cfr_renamed_13)) {
            ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[1];
        }
        this.var_int_new = var_int_arr_if[1];
        ((dd_0)this).cfr_renamed_13 = var_int_arr_if[1];
        if (DuLieuNguoiChoi.boolean_int(this.var_byte_const)) {
            this.var_byte_const = (byte)(this.var_byte_const - var_int_arr_if[2]);
            if (DuLieuNguoiChoi.boolean_do(this.var_byte_const)) {
                if ((this.var_int_class == var_int_arr_if[14])) {
                    this.duLieuNguoiChoi.var_short_for = (short)var_int_arr_if[0];
                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[25];
                    ((dd_0)this).cfr_renamed_2 = (byte)var_int_arr_if[0];
                    this.var_short_final = (short)var_int_arr_if[25];
                    if ("   ".length() <= "  ".length()) {
                        return;
                    }
                } else if ((this.var_int_class == var_int_arr_if[29])) {
                    this.var_short_final = (short)var_int_arr_if[43];
                    this.duLieuNguoiChoi.var_short_final = (short)var_int_arr_if[43];
                }
                this.var_int_class = var_int_arr_if[1];
                this.duLieuNguoiChoi.var_int_class = var_int_arr_if[1];
                this.duLieuNguoiChoi = null;
                this.fontRenderer = null;
            }
        }
        if ((this.var_java_lang_String_arr_do != null)) {
            int n;
            int n6 = var_int_arr_if[23];
            String string = this.var_java_lang_String_arr_do[this.var_int_final / var_int_arr_if[15]];
            if ((this.var_int_long >= var_int_arr_if[44])) {
                n = var_int_arr_if[2];
                if (((10 + 90 - 30 + 88 ^ 155 + 144 - 172 + 39) & (0x24 ^ 0x7B ^ (0x50 ^ 0x37) ^ -" ".length())) == "  ".length()) {
                    return;
                }
            } else {
                n = var_int_arr_if[1];
            }
            this.var_cU_do = new cU(n6, string, (byte)n);
            this.var_int_final += var_int_arr_if[2];
            if ((this.var_int_final >= this.var_java_lang_String_arr_do.length * var_int_arr_if[15])) {
                if (DuLieuNguoiChoi.cfr_renamed_7(((dd_0)this).cfr_renamed_9, var_int_arr_if[44])) {
                    this.var_int_final = var_int_arr_if[1];
                    } else {
                    this.var_java_lang_String_arr_do = null;
                }
            }
        }
        super.void_do();
    }

    public final void cfr_renamed_14() {
        short s2 = fh.var_short_if;
        short s3 = fh.var_short_do;
        this.var_boolean_arr_arr_do = new boolean[s2][s3];
        this.var_short_arr_if = new short[s2 * s3];
        this.var_short_arr_for = new short[s2 * s3];
        this.var_short_arr_do = new short[s2 * s3];
    }

    private static boolean boolean_try(int n) {
        return n <= 0;
    }
}

