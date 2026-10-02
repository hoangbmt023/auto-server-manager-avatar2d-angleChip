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

public final class o
extends a_0 {
    private static int cfr_renamed_14;
    private boolean var_boolean_try;
    private ei var_ei_byte;
    private Vector cfr_renamed_4 = new Vector();
    public static int soLuong;
    private boolean[] var_boolean_arr_do;
    private ei var_ei_case;
    private byte var_byte_char;
    private Image var_javax_microedition_lcdui_Image_if;
    private byte cfr_renamed_11;
    private byte cfr_renamed_18;
    private Vector cfr_renamed_5 = new Vector();
    private Vector var_java_util_Vector_try;
    public static int var_int_if;
    private int cfr_renamed_23;
    public byte[][] var_byte_arr_arr_do;
    private static int[] var_int_arr_if;
    private byte[] var_byte_arr_do;
    private byte cfr_renamed_10;
    private byte this;
    private byte cfr_renamed_16;
    private ei var_ei_char;
    private int cfr_renamed_24;
    private int[] cfr_renamed_3;
    private Vector var_java_util_Vector_byte;
    private static int cfr_renamed_25;
    private Vector var_java_util_Vector_case;
    private static eq_0[] var_eq_0_arr_if;
    private boolean var_boolean_byte;
    private boolean var_boolean_case;
    public byte var_byte_do;
    public boolean dangChayAuto;
    private Vector var_java_util_Vector_char = new Vector();
    private boolean var_boolean_char;
    private byte cfr_renamed_6;
    private byte cfr_renamed_17;
    private byte cfr_renamed_13;
    public static o var_o_do;

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_1(Graphics var1_1) {
        block39: {
            block41: {
                block40: {
                    block38: {
                        super.cfr_renamed_1(var1_1);
                        if (o.boolean_int((int)a_0.coKichHoat) && !o.cfr_renamed_2((int)a_0.coTrangThai)) break block38;
                        GameCanvas.cfr_renamed_1(var1_1);
                        var2_2 = var1_1;
                        var3_3 = this;
                        if (!o.boolean_do(var3_3.var_java_util_Vector_byte.size())) break block38;
                        if ((var3_3.cfr_renamed_13 != o.var_int_arr_if[1])) {
                            var2_2.setColor(o.var_int_arr_if[29]);
                            if (o.boolean_do(GameCanvas.var_int_try % o.var_int_arr_if[17], o.var_int_arr_if[21])) {
                                var2_2.fillRect(var3_3.cfr_renamed_23 + var3_3.cfr_renamed_13 % o.var_int_arr_if[4] * (o.cfr_renamed_25 + o.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var3_3.cfr_renamed_13 / o.var_int_arr_if[4] * (o.cfr_renamed_14 + o.var_int_arr_if[6]), o.cfr_renamed_25, o.cfr_renamed_14);
                            }
                        }
                        if ((var3_3.cfr_renamed_6 != o.var_int_arr_if[1])) {
                            var2_2.setColor(o.var_int_arr_if[30]);
                            if (o.boolean_do(GameCanvas.var_int_try % o.var_int_arr_if[17], o.var_int_arr_if[21])) {
                                var2_2.fillRect(var3_3.cfr_renamed_23 + var3_3.cfr_renamed_6 % o.var_int_arr_if[4] * (o.cfr_renamed_25 + o.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var3_3.cfr_renamed_6 / o.var_int_arr_if[4] * (o.cfr_renamed_14 + o.var_int_arr_if[6]), o.cfr_renamed_25, o.cfr_renamed_14);
                            }
                        }
                        var4_4 = o.var_int_arr_if[0];
                        if ((35 ^ 38) > 0) ** GOTO lbl40
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var5_6 = (bd)var3_3.var_java_util_Vector_byte.elementAt(var4_4);
                            if (o.boolean_do(GameCanvas.var_int_byte, o.var_int_arr_if[8])) {
                                v0 = o.var_int_arr_if[31];
                                if ("  ".length() <= ((157 ^ 183) & ~(80 ^ 122))) {
                                    return;
                                }
                            } else {
                                v0 = o.var_int_arr_if[32];
                            }
                            if (o.cfr_renamed_2(ci_0.cfr_renamed_1((short)((short)v0)).soLuong, o.var_int_arr_if[1])) {
                                if (o.boolean_do(GameCanvas.var_int_byte, o.var_int_arr_if[8])) {
                                    v1 = o.var_int_arr_if[31];
                                    if (" ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    v1 = o.var_int_arr_if[32];
                                }
                                var2_2.drawRegion(ci_0.cfr_renamed_1((short)((short)v1)).var_javax_microedition_lcdui_Image_do, o.var_int_arr_if[0], var5_6.cfr_renamed_4 * o.cfr_renamed_14, o.cfr_renamed_25, o.cfr_renamed_14, o.var_int_arr_if[0], var3_3.cfr_renamed_23 + var4_4 % o.var_int_arr_if[4] * (o.cfr_renamed_25 + o.var_int_arr_if[21]), var3_3.cfr_renamed_24 + var4_4 / o.var_int_arr_if[4] * (o.cfr_renamed_14 + o.var_int_arr_if[6]), o.var_int_arr_if[0]);
                            }
                            ++var4_4;
lbl40:
                            // 2 sources

                            ** while (!o.boolean_if((int)var4_4, (int)var3_3.var_java_util_Vector_byte.size()))
                        }
                    }
                    this.cfr_renamed_3(var1_1);
                    if (o.boolean_int((int)a_0.coKichHoat) && !o.cfr_renamed_2((int)a_0.coTrangThai)) break block39;
                    GameCanvas.cfr_renamed_1(var1_1);
                    var2_2 = var1_1;
                    var3_3 = this;
                    var4_4 = o.var_int_arr_if[0];
                    if ((85 + 132 - 156 + 105 ^ 148 + 145 - 284 + 153) > 0) ** GOTO lbl59
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var5_6 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var4_4);
                        if (!(var5_6.cfr_renamed_12 != a_0.soLuongKhoa) || (var5_6.cfr_renamed_12 != o.var_int_arr_if[1])) {
                            if (!(var3_3.cfr_renamed_18 == var5_6.cfr_renamed_12) || o.boolean_if(GameCanvas.var_int_try % o.var_int_arr_if[21], o.var_int_arr_if[3])) {
                                GameCanvas.var_ew_int.cfr_renamed_0(var2_2, String.valueOf(var5_6.int_if()) + MenuChinhAvatar.java_lang_String_for(), var5_6.cfr_renamed_3, var5_6.var_int_if + o.var_int_arr_if[3], o.var_int_arr_if[11]);
                            }
                            if (o.cfr_renamed_2(var6_8 = (var3_3.var_java_util_Vector_char, a_0.int_do(var5_6.cfr_renamed_12) == null), o.var_int_arr_if[1]) && o.cfr_renamed_2(ci_0.cfr_renamed_1((short)o.var_int_arr_if[33]).soLuong, o.var_int_arr_if[1])) {
                                var2_2.drawRegion(ci_0.cfr_renamed_1((short)o.var_int_arr_if[33]).var_javax_microedition_lcdui_Image_do, o.var_int_arr_if[0], o.int_if(var6_8) * o.var_int_arr_if[13], o.var_int_arr_if[13], o.var_int_arr_if[13], o.var_int_arr_if[0], var5_6.cfr_renamed_3, var5_6.var_int_if + o.var_int_arr_if[3] + bn_0.cfr_renamed_8, o.var_int_arr_if[34]);
                            }
                        }
                        ++var4_4;
lbl59:
                        // 2 sources

                        ** while (!o.boolean_if((int)var4_4, (int)a_0.var_java_util_Vector_do.size()))
                    }
lbl60:
                    // 1 sources

                    if (!o.boolean_int((int)a_0.coKichHoat) || o.cfr_renamed_2((int)a_0.coTrangThai)) {
                        var7_9 = (int)((long)a_0.cfr_renamed_11 - a_0.var_long_if);
                        if (o.boolean_do(var7_9) && o.boolean_int((int)a_0.var_boolean_int) && o.boolean_new(this.var_java_util_Vector_case.size())) {
                            GameCanvas.var_ew_new.cfr_renamed_0(var1_1, String.valueOf(var7_9), GameCanvas.var_int_int, o.var_int_arr_if[21], o.var_int_arr_if[11]);
                        }
                        if (o.cfr_renamed_2((int)this.var_boolean_char)) {
                            if (o.boolean_for(this.cfr_renamed_11, o.var_int_arr_if[35])) {
                                this.cfr_renamed_11 = (byte)(this.cfr_renamed_11 + o.var_int_arr_if[15]);
                                if (" ".length() < 0) {
                                    return;
                                }
                            } else {
                                this.cfr_renamed_11 = (byte)o.var_int_arr_if[35];
                            }
                            if (o.boolean_for(this.cfr_renamed_11, o.var_int_arr_if[18])) {
                                GameCanvas.var_ew_byte.cfr_renamed_0(var1_1, "Bắt đầu tả", GameCanvas.var_int_int, this.cfr_renamed_24 - o.var_int_arr_if[36], o.var_int_arr_if[11]);
                            }
                        }
                    }
                    if (!o.boolean_do(this.cfr_renamed_4.size())) break block40;
                    var7_9 = o.var_int_arr_if[0];
                    if ("  ".length() == "  ".length()) ** GOTO lbl85
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var3_3 = (fs)this.cfr_renamed_4.elementAt(var7_9);
                        if (o.boolean_do(var3_3.soLuong)) {
                            var3_3.cfr_renamed_0(var1_1);
                        }
                        ++var7_9;
lbl85:
                        // 2 sources

                        ** while (!o.boolean_if((int)var7_9, (int)this.cfr_renamed_4.size()))
                    }
                }
                if (!o.boolean_do(this.cfr_renamed_5.size())) break block41;
                var7_9 = o.var_int_arr_if[0];
                if ((19 ^ 22) > 0) ** GOTO lbl124
                return;
lbl-1000:
                // 1 sources

                {
                    var3_3 = (c_0)this.cfr_renamed_5.elementAt(var7_9);
                    if (o.boolean_do(var3_3.cfr_renamed_3)) {
                        var2_2 = var1_1;
                        if (o.boolean_int((int)var3_3.coTrangThai)) {
                            var4_5 = GameCanvas.var_ew_new;
                            if ((GameCanvas.var_int_byte <= o.var_int_arr_if[8])) {
                                var4_5 = GameCanvas.var_ew_int;
                            }
                            if (o.boolean_do(GameCanvas.cfr_renamed_16)) {
                                var4_5 = GameCanvas.var_ew_try;
                            }
                            var5_7 = var3_3.cfr_renamed_2 + o.cfr_renamed_25 / o.var_int_arr_if[24] + var3_3.cfr_renamed_4 % o.var_int_arr_if[11] * o.cfr_renamed_25 / o.var_int_arr_if[11];
                            var6_8 = var3_3.var_int_if + o.cfr_renamed_14 / o.var_int_arr_if[24] + var3_3.cfr_renamed_4 / o.var_int_arr_if[11] * o.cfr_renamed_14 / o.var_int_arr_if[11];
                            if (o.boolean_do(GameCanvas.var_int_byte, o.var_int_arr_if[8])) {
                                v2 = o.var_int_arr_if[37];
                                if (((35 ^ 102) & ~(10 ^ 79)) > "   ".length()) {
                                    return;
                                }
                            } else {
                                v2 = o.var_int_arr_if[33];
                            }
                            if (o.cfr_renamed_2(ci_0.cfr_renamed_1((short)((short)v2)).soLuong, o.var_int_arr_if[1])) {
                                if (o.boolean_do(GameCanvas.var_int_byte, o.var_int_arr_if[8])) {
                                    v3 = o.var_int_arr_if[37];
                                    if ("  ".length() == 0) {
                                        return;
                                    }
                                } else {
                                    v3 = o.var_int_arr_if[33];
                                }
                                var2_2.drawRegion(ci_0.cfr_renamed_1((short)((short)v3)).var_javax_microedition_lcdui_Image_do, o.var_int_arr_if[0], var3_3.cfr_renamed_4 * o.var_int_if, o.soLuong, o.var_int_if, o.var_int_arr_if[0], var5_7, var6_8, o.var_int_arr_if[4]);
                            }
                            var4_5.cfr_renamed_0(var2_2, String.valueOf(var3_3.cfr_renamed_3), var5_7, var6_8 - var4_5.int_do() / o.var_int_arr_if[11], o.var_int_arr_if[11]);
                        }
                    }
                    ++var7_9;
lbl124:
                    // 2 sources

                    ** while (!o.boolean_if((int)var7_9, (int)this.cfr_renamed_5.size()))
                }
            }
            if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 != a_0.soLuongKhoa) && o.cfr_renamed_2((int)a_0.coKichHoat) && o.boolean_int(this.var_java_util_Vector_case.size())) {
                var1_1.drawImage(this.var_javax_microedition_lcdui_Image_if, this.cfr_renamed_23 + o.cfr_renamed_25 / o.var_int_arr_if[11] + this.cfr_renamed_18 % o.var_int_arr_if[4] * (o.cfr_renamed_25 + o.var_int_arr_if[21]), this.cfr_renamed_24 + o.cfr_renamed_14 / o.var_int_arr_if[11] + this.cfr_renamed_18 / o.var_int_arr_if[4] * (o.cfr_renamed_14 + o.var_int_arr_if[6]) + GameCanvas.var_int_try % o.var_int_arr_if[24] + o.var_int_arr_if[3], o.var_int_arr_if[4]);
            }
            this.cfr_renamed_5(var1_1);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (byte[] var1_1 == null) {
        this.var_byte_arr_do = var1_1;
        var1_1 = new Vector<E>();
        var2_2 = o.var_int_arr_if[0];
        if ("  ".length() > -" ".length()) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = new bd();
            if ((var2_2 == this.var_byte_arr_do[o.var_int_arr_if[0]])) {
                var3_3.cfr_renamed_3 = o.var_int_arr_if[2];
            }
            var1_1.addElement(var3_3);
            ++var2_2;
lbl13:
            // 2 sources

            ** while (!o.boolean_if((int)var2_2, (int)o.var_int_arr_if[2]))
        }
lbl14:
        // 1 sources

        cd_0.cd_0_do().cfr_renamed_0((Vector)var1_1);
        this.cfr_renamed_21();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_20() {
        ((bd)this.var_java_util_Vector_byte.elementAt((int)this.cfr_renamed_18)).cfr_renamed_3 += var_int_arr_if[15];
        o o2 = this;
        int n = var_int_arr_if[0];
        while (!o.boolean_if(n, var_int_arr_if[2])) {
            Object object = (bd)o2.var_java_util_Vector_byte.elementAt(n);
            int n2 = o.cfr_renamed_0(o2.var_java_util_Vector_char, a_0.int_do(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12));
            int n3 = o.int_if(n2);
            int n4 = ((bd)object).cfr_renamed_3;
            int n5 = ((bd)object).cfr_renamed_0 + cfr_renamed_14 / var_int_arr_if[11];
            n2 = ((bd)object).cfr_renamed_1 + cfr_renamed_25 / var_int_arr_if[11];
            object = o2;
            fs fs2 = new fs(n2, n5, n4, n3);
            ((o)object).cfr_renamed_4.addElement(fs2);
            ++n;
        }
    }

    public final void (byte by2 == null) {
        int n = a_0.int_do(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12);
        DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(by2);
        if ((n == by2)) {
            this.var_boolean_arr_do[n] = var_int_arr_if[0];
            this.var_boolean_byte = var_int_arr_if[15];
            this.var_ei_try = null;
            this.this = (byte)var_int_arr_if[11];
            this.dangChayAuto = var_int_arr_if[0];
        }
        ((a_0)this).cfr_renamed_18 = ((bk_0)dd_02).cfr_renamed_12;
        a_0.cfr_renamed_11 = this.var_byte_do;
        a_0.soXu = GameCanvas.int_if();
        if (o.boolean_int(this.var_boolean_char ? 1 : 0)) {
            this.var_boolean_char = var_int_arr_if[15];
        }
        if (o.cfr_renamed_2(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12, a_0.soLuongKhoa) && (n == by2)) {
            o o2 = this;
            this.var_ei_new = a_0.var_ei_if;
            o2.var_ei_new.chuoiGiaTri = "Chọn";
            o2.var_ei_try = o2.var_ei_case;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static int (Vector var0, int var1_1 == null) {
        var2_2 = o.var_int_arr_if[0];
        if (" ".length() == " ".length()) ** GOTO lbl9
        return ("   ".length() ^ (116 ^ 107)) & (230 ^ 192 ^ (5 ^ 63) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            if (o.cfr_renamed_2((int)((String)var0.elementAt(var2_2)).equals(String.valueOf(var1_1)))) {
                return var2_2;
            }
            ++var2_2;
lbl9:
            // 2 sources

            ** while (!o.boolean_if((int)var2_2, (int)var0.size()))
        }
lbl10:
        // 1 sources

        return o.var_int_arr_if[1];
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_14() {
        this.var_java_util_Vector_byte.removeAllElements();
        this.cfr_renamed_23 = GameCanvas.var_int_byte / o.var_int_arr_if[11] - o.cfr_renamed_25 - o.cfr_renamed_25 / o.var_int_arr_if[11] - o.var_int_arr_if[21];
        this.cfr_renamed_24 = GameCanvas.var_int_char / o.var_int_arr_if[11] - o.cfr_renamed_14 - o.var_int_arr_if[13];
        var1_1 = o.var_int_arr_if[0];
        if (((111 ^ 28 ^ (209 ^ 157)) & (132 + 47 - 123 + 100 ^ 77 + 153 - 194 + 127 ^ -" ".length())) <= 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = new bd();
            new bd().cfr_renamed_4 = var1_1;
            var2_2.cfr_renamed_1 = this.cfr_renamed_23 + var1_1 % o.var_int_arr_if[4] * (o.cfr_renamed_25 + o.var_int_arr_if[21]);
            var2_2.cfr_renamed_0 = this.cfr_renamed_24 + var1_1 / o.var_int_arr_if[4] * (o.cfr_renamed_14 + o.var_int_arr_if[6]);
            this.var_java_util_Vector_byte.addElement(var2_2);
            ++var1_1;
lbl15:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)o.var_int_arr_if[2]))
        }
lbl16:
        // 1 sources

    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 7: {
                o.cfr_renamed_25();
                if ("   ".length() == "   ".length()) break;
                return;
            }
            case 8: {
                o o2 = this;
                o2.cfr_renamed_22();
                o2.var_java_util_Vector_try.removeAllElements();
                a_0.var_boolean_int = var_int_arr_if[0];
                a_0.coKichHoat = var_int_arr_if[0];
                a_0.coTrangThai = var_int_arr_if[0];
                ((a_0)o2).cfr_renamed_18 = var_int_arr_if[1];
                o2.cfr_renamed_3 = null;
                o2.cfr_renamed_4.removeAllElements();
                o2.cfr_renamed_5.removeAllElements();
                o2.cfr_renamed_13 = (byte)var_int_arr_if[1];
                o2.cfr_renamed_6 = (byte)var_int_arr_if[1];
                if ((0x71 ^ 0x75) >= 0) break;
                return;
            }
            case 9: {
                o o3 = this;
                if (o.boolean_int(o3.var_boolean_byte ? 1 : 0)) {
                    if (!o.boolean_int(o3.var_boolean_arr_do[a_0.int_do(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)])) break;
                    o3.this = (byte)var_int_arr_if[15];
                    o3.cfr_renamed_23();
                    if (" ".length() == " ".length()) break;
                    return;
                }
                if (!(o3.cfr_renamed_13 != var_int_arr_if[1])) break;
                o3.cfr_renamed_13 = (byte)var_int_arr_if[1];
                o3.var_ei_new.chuoiGiaTri = "Chọn";
                o3.var_ei_try = o3.var_ei_case;
            }
        }
        super.void_do(n, n2);
    }

    public o() {
        this.var_java_util_Vector_case = new Vector();
        this.var_java_util_Vector_byte = new Vector();
        this.cfr_renamed_13 = (byte)var_int_arr_if[1];
        this.cfr_renamed_6 = (byte)var_int_arr_if[1];
        this.var_boolean_arr_do = new boolean[var_int_arr_if[2]];
        this.var_byte_arr_arr_do = new byte[var_int_arr_if[3]][var_int_arr_if[2]];
        this.var_byte_arr_do = new byte[var_int_arr_if[4]];
        this.cfr_renamed_11 = (byte)var_int_arr_if[0];
        this.var_java_util_Vector_try = new Vector();
        try {
            this.var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/p.on"));
            }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (((0x5A ^ 0x12 ^ (0 ^ 0x63)) & (0x71 ^ 0x77 ^ (0xA4 ^ 0x89) ^ -" ".length())) > " ".length()) {
            throw null;
        }
        this.cfr_renamed_24();
        this.cfr_renamed_3 = null;
        this.var_ei_case = new ei(MenuChinhAvatar.ad, var_int_arr_if[5]);
        this.var_ei_byte = new ei(MenuChinhAvatar.C, var_int_arr_if[6]);
        this.var_ei_char = new ei(MenuChinhAvatar.ad, var_int_arr_if[7]);
        if (o.boolean_do(GameCanvas.var_int_byte, var_int_arr_if[8])) {
            soLuong = var_int_if = var_int_arr_if[9];
            cfr_renamed_25 = cfr_renamed_14 = var_int_arr_if[10];
            if ((bn_0.cfr_renamed_6 == var_int_arr_if[11])) {
                cfr_renamed_25 = cfr_renamed_14 = var_int_arr_if[12];
                if (((9 ^ 0x23) & ~(0xA1 ^ 0x8B)) < 0) {
                    throw null;
                }
            }
        } else {
            soLuong = var_int_if = var_int_arr_if[13];
            cfr_renamed_25 = cfr_renamed_14 = var_int_arr_if[14];
        }
        this.cfr_renamed_14();
    }

    private void cfr_renamed_23() {
        a_0.cfr_renamed_13();
        this.dangChayAuto = var_int_arr_if[15];
        cd_0.cd_0_do().cfr_renamed_0(this.var_java_util_Vector_byte);
        this.cfr_renamed_4.removeAllElements();
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        this.cfr_renamed_1(var1_1);
        GameCanvas.cfr_renamed_1(var1_1);
        var2_2 = var1_1;
        var3_3 = this;
        var4_4 = o.var_int_arr_if[0];
        if (((74 ^ 16 ^ (39 ^ 68)) & (112 ^ 82 ^ (159 ^ 132) ^ -" ".length())) <= ((31 + 130 - 7 + 15 ^ 76 + 148 - 162 + 87) & (104 ^ 60 ^ (4 ^ 108) ^ -" ".length()))) ** GOTO lbl14
        return;
lbl-1000:
        // 1 sources

        {
            var5_5 = (fa)var3_3.var_java_util_Vector_try.elementAt(var4_4);
            if (o.boolean_if(var5_5.var_byte_do)) {
                GameCanvas.var_ew_new.cfr_renamed_0(var2_2, "+" + var5_5.cfr_renamed_3, var5_5.cfr_renamed_3, var5_5.var_int_if, o.var_int_arr_if[11]);
            }
            ++var4_4;
lbl14:
            // 2 sources

            ** while (!o.boolean_if((int)var4_4, (int)var3_3.var_java_util_Vector_try.size()))
        }
lbl15:
        // 1 sources

        super.cfr_renamed_0(var1_1);
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_24() {
        var1_1 = o.var_int_arr_if[0];
        if (null == null) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            this.var_byte_arr_do[var1_1] = o.var_int_arr_if[1];
            ++var1_1;
lbl8:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)this.var_byte_arr_do.length))
        }
lbl9:
        // 1 sources

        var1_1 = o.var_int_arr_if[0];
        if (((0 ^ 49) & ~(161 ^ 144)) == 0) ** GOTO lbl16
        return;
lbl-1000:
        // 1 sources

        {
            this.var_boolean_arr_do[var1_1] = o.var_int_arr_if[0];
            ++var1_1;
lbl16:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)this.var_boolean_arr_do.length))
        }
lbl17:
        // 1 sources

        var1_1 = o.var_int_arr_if[0];
        if ("   ".length() >= -" ".length()) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = o.var_int_arr_if[0];
            if ((135 ^ 131) == (111 ^ 107)) ** GOTO lbl29
            return;
lbl-1000:
            // 1 sources

            {
                this.var_byte_arr_arr_do[var1_1][var2_2] = o.var_int_arr_if[0];
                ++var2_2;
lbl29:
                // 2 sources

                ** while (!o.boolean_if((int)var2_2, (int)this.var_byte_arr_arr_do[var1_1].length))
            }
lbl30:
            // 1 sources

            ++var1_1;
lbl31:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)this.var_byte_arr_arr_do.length))
        }
lbl32:
        // 1 sources

    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    private static boolean boolean_if(int n) {
        return n >= 0;
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

    private static void cfr_renamed_25() {
        a_0.cfr_renamed_13();
        a_0.coTrangThai = var_int_arr_if[15];
        cd_0.cd_0_do().cfr_renamed_5();
    }

    public final void void_do() {
        if (o.boolean_int(this.var_boolean_byte ? 1 : 0)) {
            if (o.boolean_int(this.var_boolean_arr_do[a_0.int_do(((bk_0)AngelChip.duLieuNguoiChoi).cfr_renamed_12)])) {
                if (o.boolean_for(this.cfr_renamed_17, var_int_arr_if[2])) {
                    this.cfr_renamed_20();
                }
                this.cfr_renamed_17 = (byte)(this.cfr_renamed_17 + var_int_arr_if[15]);
                return;
            }
        } else if ((this.cfr_renamed_6 == var_int_arr_if[1])) {
            if ((this.cfr_renamed_13 == var_int_arr_if[1])) {
                this.cfr_renamed_13 = this.cfr_renamed_18;
                this.var_ei_new.chuoiGiaTri = "Tả";
                this.cfr_renamed_26();
                return;
            }
            this.cfr_renamed_6 = this.cfr_renamed_18;
            this.cfr_renamed_27();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_5(Graphics graphics) {
        if (o.boolean_do(this.var_java_util_Vector_case.size())) {
            int n = var_int_arr_if[0];
            while (!o.boolean_if(n, this.var_java_util_Vector_case.size())) {
                ((gI)this.var_java_util_Vector_case.elementAt(n)).cfr_renamed_0(graphics);
                ++n;
            }
        }
    }

    private static int int_if(int n) {
        switch (n) {
            case 0: {
                return var_int_arr_if[4];
            }
            case 1: {
                return var_int_arr_if[0];
            }
            case 2: {
                return var_int_arr_if[15];
            }
            case 3: {
                return var_int_arr_if[11];
            }
        }
        return var_int_arr_if[1];
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    private static boolean boolean_int(int n) {
        return n == 0;
    }

    private static boolean boolean_new(int n) {
        return n <= 0;
    }

    /*
     * Unable to fully structure code
     */
    public final void void_for() {
        block31: {
            block33: {
                block32: {
                    super.void_for();
                    if (o.boolean_int((int)a_0.coKichHoat) && !o.cfr_renamed_2((int)a_0.coTrangThai)) break block31;
                    var1_1 = this;
                    a_0.var_long_if = (int)(System.currentTimeMillis() / 1000L - a_0.soXu);
                    if (!o.cfr_renamed_2((int)a_0.coKichHoat) || !o.boolean_int((int)a_0.var_boolean_int) || o.cfr_renamed_2((int)a_0.coTrangThai)) {
                        if (-" ".length() == "   ".length()) {
                            return;
                        }
                    } else if (o.boolean_for(o.cfr_renamed_0((long)a_0.cfr_renamed_11 - a_0.var_long_if, 0L))) {
                        var1_1.dangChayAuto = o.var_int_arr_if[15];
                        if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 != a_0.soLuongKhoa)) {
                            if (o.boolean_int(var1_1.this)) {
                                var1_1.this = (byte)o.var_int_arr_if[15];
                                var1_1.cfr_renamed_23();
                            }
                            if ((var1_1.this == o.var_int_arr_if[11])) {
                                var1_1.this = (byte)o.var_int_arr_if[4];
                                o.cfr_renamed_25();
                            }
                        }
                    }
                    var1_1 = this;
                    if (!o.boolean_do(var1_1.cfr_renamed_5.size()) || !o.boolean_do(var1_1.var_java_util_Vector_byte.size())) break block32;
                    var2_4 = o.var_int_arr_if[0];
                    if (-" ".length() < 0) ** GOTO lbl60
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10 = var3_6 = (c_0)var1_1.cfr_renamed_5.elementAt(var2_4);
                        if ((var3_6.cfr_renamed_2 != var4_10.cfr_renamed_15)) {
                            if (o.boolean_int(var4_10.cfr_renamed_15 - var4_10.cfr_renamed_2 >> o.var_int_arr_if[15])) {
                                var4_10.cfr_renamed_2 = var4_10.cfr_renamed_15;
                                if ("  ".length() < "  ".length()) {
                                    return;
                                }
                            } else {
                                var4_10.cfr_renamed_2 += var4_10.cfr_renamed_15 - var4_10.cfr_renamed_2 >> o.var_int_arr_if[15];
                            }
                        }
                        if ((var4_10.var_int_if != var4_10.soLuong)) {
                            if (o.boolean_int(var4_10.soLuong - var4_10.var_int_if >> o.var_int_arr_if[15])) {
                                var4_10.var_int_if = var4_10.soLuong;
                                if ("   ".length() <= " ".length()) {
                                    return;
                                }
                            } else {
                                var4_10.var_int_if += var4_10.soLuong - var4_10.var_int_if >> o.var_int_arr_if[15];
                            }
                        }
                        if (o.cfr_renamed_2((int)var4_10.dangChayAuto) && (var4_10.cfr_renamed_2 == var4_10.cfr_renamed_15) && (var4_10.var_int_if == var4_10.soLuong)) {
                            var4_10.coTrangThai = o.var_int_arr_if[15];
                        }
                        if (o.cfr_renamed_2((int)var3_6.coTrangThai)) {
                            var1_1.cfr_renamed_5.removeElement(var3_6);
                            var4_10 = var1_1;
                            if (o.cfr_renamed_2((int)var4_10.var_boolean_try)) {
                                var3_6 = (bd)var4_10.var_java_util_Vector_byte.elementAt(var4_10.var_byte_char);
                                var5_13 = (var4_10.var_java_util_Vector_char, (int)var4_10.cfr_renamed_10 == null);
                                super.cfr_renamed_0(var3_6.cfr_renamed_1, var3_6.cfr_renamed_0, var3_6.cfr_renamed_1, var3_6.cfr_renamed_0, var4_10.var_byte_arr_arr_do[var4_10.cfr_renamed_10][var4_10.var_byte_char], o.int_if(var5_13), var4_10.var_byte_char);
                                var4_10.var_boolean_try = o.var_int_arr_if[0];
                            }
                        }
                        ++var2_4;
lbl60:
                        // 2 sources

                        ** while (!o.boolean_if((int)var2_4, (int)var1_1.cfr_renamed_5.size()))
                    }
lbl61:
                    // 1 sources

                    var2_5 = (bd)var1_1.var_java_util_Vector_byte.elementAt(var1_1.var_byte_char);
                    if (!o.cfr_renamed_2((int)var1_1.var_boolean_try)) break block32;
                    var3_7 = o.var_int_arr_if[0];
                    if (-(197 ^ 170 ^ (95 ^ 52)) <= 0) ** GOTO lbl74
                    return;
lbl-1000:
                    // 1 sources

                    {
                        var4_10 = (c_0)var1_1.cfr_renamed_5.elementAt(var3_7);
                        if ((var4_10.cfr_renamed_5 == var1_1.cfr_renamed_16)) {
                            var4_10.cfr_renamed_15 = var2_5.cfr_renamed_1;
                            var4_10.soLuong = var2_5.cfr_renamed_0;
                            var4_10.dangChayAuto = o.var_int_arr_if[15];
                        }
                        ++var3_7;
lbl74:
                        // 2 sources

                        ** while (!o.boolean_if((int)var3_7, (int)var1_1.cfr_renamed_5.size()))
                    }
                }
                if (!o.boolean_do(this.var_java_util_Vector_case.size())) break block33;
                var1_2 = o.var_int_arr_if[0];
                if (((15 ^ 64) & ~(214 ^ 153)) == 0) ** GOTO lbl88
                return;
lbl-1000:
                // 1 sources

                {
                    var2_5 = (gI)this.var_java_util_Vector_case.elementAt(var1_2);
                    var2_5.cfr_renamed_0();
                    if (o.cfr_renamed_2((int)this.var_boolean_case)) {
                        var2_5.soLuong = this.var_byte_arr_do[var1_2];
                        var2_5.dangChayAuto = o.var_int_arr_if[15];
                    }
                    ++var1_2;
lbl88:
                    // 2 sources

                    ** while (!o.boolean_if((int)var1_2, (int)this.var_java_util_Vector_case.size()))
                }
            }
            var1_3 = o.var_int_arr_if[0];
            if (" ".length() < "   ".length()) ** GOTO lbl125
            return;
lbl-1000:
            // 1 sources

            {
                var2_5 = (fa)this.var_java_util_Vector_try.elementAt(var1_3);
                var3_9 = gc_0.int_do(var2_5.var_short_if - var2_5.cfr_renamed_3, -(var2_5.var_short_new - var2_5.var_int_if));
                if (o.boolean_do(gc_0.int_if(var3_9 - var2_5.soLuong), o.var_int_arr_if[21])) {
                    var2_5.soLuong -= var2_5.var_short_int * var2_5.var_byte_if;
                    var2_5.soLuong = gc_0.int_int(var2_5.soLuong);
                    if ("  ".length() < 0) {
                        return;
                    }
                } else {
                    var2_5.soLuong = var3_9;
                    var2_5.var_byte_do = (byte)(var2_5.var_byte_do + o.var_int_arr_if[11]);
                }
                if (o.boolean_if(var2_5.cfr_renamed_8, o.var_int_arr_if[24])) {
                    var2_5.cfr_renamed_8 = o.var_int_arr_if[0];
                }
                var2_5.cfr_renamed_8 += o.var_int_arr_if[15];
                var3_9 = var2_5.var_byte_do * gc_0.int_new(var2_5.soLuong) >> o.var_int_arr_if[21];
                var4_12 = -(var2_5.var_byte_do * gc_0.int_for(var2_5.soLuong)) >> o.var_int_arr_if[21];
                if (o.boolean_if(gc_0.cfr_renamed_0(var2_5.cfr_renamed_3, var2_5.var_int_if, var2_5.var_short_if, var2_5.var_short_new), var2_5.var_byte_do)) {
                    var2_5.cfr_renamed_3 += var3_9;
                    var2_5.var_int_if += var4_12;
                    if (((149 ^ 175 ^ (199 ^ 191)) & (195 ^ 191 ^ (100 ^ 90) ^ -" ".length())) >= "  ".length()) {
                        return;
                    }
                } else {
                    this.var_java_util_Vector_try.removeElement(var2_5);
                    }
                ++var1_3;
lbl125:
                // 2 sources

                ** while (!o.boolean_if((int)var1_3, (int)this.var_java_util_Vector_try.size()))
            }
lbl126:
            // 1 sources

            return;
        }
        this.this();
    }

    public final void cfr_renamed_1(byte by2) {
        this.cfr_renamed_10 = by2;
        this.var_boolean_arr_do[this.cfr_renamed_10] = var_int_arr_if[15];
        this.cfr_renamed_9();
    }

    public final void cfr_renamed_8() {
        this.cfr_renamed_4();
        super.cfr_renamed_8();
    }

    private static boolean boolean_for(int n, int n2) {
        return n < n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_15() {
        block16: {
            block17: {
                super.cfr_renamed_15();
                var1_1 = this;
                if (!o.boolean_int(var1_1.var_boolean_arr_do[a_0.int_do(AngelChip.duLieuNguoiChoi.cfr_renamed_12)]) || !(AngelChip.duLieuNguoiChoi.cfr_renamed_12 != a_0.soLuongKhoa)) break block16;
                var2_2 = var1_1;
                if (!o.boolean_int((int)var2_2.dangChayAuto) || !o.cfr_renamed_2((int)a_0.coKichHoat) || !o.boolean_int((int)a_0.var_boolean_int) || !o.boolean_do(var2_2.var_java_util_Vector_byte.size()) || !o.cfr_renamed_2((int)GameCanvas.coKichHoat)) break block17;
                GameCanvas.coKichHoat = o.var_int_arr_if[0];
                var3_3 = o.var_int_arr_if[0];
                if (((112 + 109 - 158 + 108 ^ 31 + 155 - 49 + 29) & (50 ^ 115 ^ (109 ^ 33) ^ -" ".length())) == ((79 ^ 68 ^ (30 ^ 17)) & (102 ^ 107 ^ (158 ^ 151) ^ -" ".length()))) ** GOTO lbl41
                return;
lbl-1000:
                // 1 sources

                {
                    var4_4 = (bd)var2_2.var_java_util_Vector_byte.elementAt(var3_3);
                    if (o.boolean_if(GameCanvas.soLuongKhoa, var4_4.cfr_renamed_1) && (GameCanvas.soLuongKhoa <= var4_4.cfr_renamed_1 + o.cfr_renamed_25) && o.boolean_if(GameCanvas.var_int_if, var4_4.cfr_renamed_0) && (GameCanvas.var_int_if <= var4_4.cfr_renamed_0 + o.cfr_renamed_14)) {
                        var2_2.cfr_renamed_18 = (byte)var3_3;
                        if (o.boolean_int((int)var2_2.var_boolean_byte)) {
                            if (o.boolean_int(var2_2.var_boolean_arr_do[a_0.int_do(AngelChip.duLieuNguoiChoi.cfr_renamed_12)])) {
                                if (o.boolean_for(var2_2.cfr_renamed_17, o.var_int_arr_if[2])) {
                                    var2_2.cfr_renamed_20();
                                }
                                var2_2.cfr_renamed_17 = (byte)(var2_2.cfr_renamed_17 + o.var_int_arr_if[15]);
                                if (null == null) break;
                                return;
                            }
                        } else if ((var2_2.cfr_renamed_6 == o.var_int_arr_if[1])) {
                            if ((var2_2.cfr_renamed_13 == o.var_int_arr_if[1])) {
                                var2_2.cfr_renamed_13 = var2_2.cfr_renamed_18;
                                var2_2.var_ei_new.chuoiGiaTri = "Tả";
                                var2_2.cfr_renamed_26();
                                if ((245 ^ 157 ^ (41 ^ 68)) > 0) break;
                                return;
                            }
                            var2_2.cfr_renamed_6 = var2_2.cfr_renamed_18;
                            var2_2.cfr_renamed_27();
                        }
                        if ("   ".length() < (39 ^ 95 ^ (18 ^ 110))) break;
                        return;
                    }
                    ++var3_3;
lbl41:
                    // 2 sources

                    ** while (!o.boolean_if((int)var3_3, (int)var2_2.var_java_util_Vector_byte.size()))
                }
            }
            if (o.cfr_renamed_2((int)GameCanvas.boolean_do(o.var_int_arr_if[2]))) {
                var1_1.cfr_renamed_18 = (byte)(var1_1.cfr_renamed_18 + o.var_int_arr_if[15]);
                if (o.boolean_do((int)var1_1.cfr_renamed_18, o.var_int_arr_if[3])) {
                    var1_1.cfr_renamed_18 = (byte)o.var_int_arr_if[0];
                }
                return;
            }
            if (o.cfr_renamed_2((int)GameCanvas.boolean_do(o.var_int_arr_if[24]))) {
                var1_1.cfr_renamed_18 = (byte)(var1_1.cfr_renamed_18 - o.var_int_arr_if[15]);
                if (o.boolean_for(var1_1.cfr_renamed_18)) {
                    var1_1.cfr_renamed_18 = (byte)o.var_int_arr_if[3];
                }
                return;
            }
            if (o.cfr_renamed_2((int)GameCanvas.boolean_do(o.var_int_arr_if[6]))) {
                if (o.boolean_new(var1_1.cfr_renamed_18 / o.var_int_arr_if[4])) {
                    var1_1.cfr_renamed_18 = (byte)(var1_1.cfr_renamed_18 + o.var_int_arr_if[4]);
                    return;
                }
            } else if (o.cfr_renamed_2((int)GameCanvas.boolean_do(o.var_int_arr_if[11])) && o.boolean_do((int)var1_1.cfr_renamed_18, o.var_int_arr_if[11])) {
                var1_1.cfr_renamed_18 = (byte)(var1_1.cfr_renamed_18 - o.var_int_arr_if[4]);
            }
        }
    }

    private void cfr_renamed_27() {
        if (o.boolean_int(this.var_boolean_try ? 1 : 0)) {
            a_0.cfr_renamed_13();
            this.dangChayAuto = var_int_arr_if[15];
            cd_0.cd_0_do().cfr_renamed_0(this.cfr_renamed_13, this.cfr_renamed_6);
            a_0.coTrangThai = var_int_arr_if[15];
            ((a_0)this).cfr_renamed_18 = var_int_arr_if[1];
        }
    }

    private void cfr_renamed_26() {
        this.var_ei_try = this.var_ei_char;
        this.var_ei_try.chuoiGiaTri = "Chọn lại";
    }

            /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_1() {
        var1_1 = o.var_int_arr_if[0];
        if ("   ".length() != 0) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var1_1);
            if ((var2_2.cfr_renamed_12 != o.var_int_arr_if[1])) {
                var2_2.var_byte_else = (byte)o.var_int_arr_if[0];
                var2_2.cfr_renamed_1(o.var_int_arr_if[0]);
                var2_2.void_for(var2_2.cfr_renamed_4);
                var2_2.void_do(o.var_eq_0_arr_if[a_0.mangSoNguyen[var1_1]].var_int_if, o.var_eq_0_arr_if[a_0.mangSoNguyen[var1_1]].soLuong);
                if (!(a_0.mangSoNguyen[var1_1] != o.var_int_arr_if[11]) || !(a_0.mangSoNguyen[var1_1] != o.var_int_arr_if[4]) || (a_0.mangSoNguyen[var1_1] == o.var_int_arr_if[24])) {
                    var2_2.cfr_renamed_3 = var2_2.var_byte_goto = bk_0.var_byte_case;
                    if ((80 ^ 11 ^ (11 ^ 84)) <= "  ".length()) {
                        return;
                    }
                } else {
                    v0 = o.var_int_arr_if[0];
                    var2_2.var_byte_goto = (byte)v0;
                    var2_2.cfr_renamed_3 = (byte)v0;
                }
            }
            ++var1_1;
lbl23:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)a_0.var_int_case))
        }
lbl24:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void (int[] var1_1 == null) {
        this.cfr_renamed_3 = var1_1 /* !! */ ;
        this.var_boolean_case = o.var_int_arr_if[15];
        a_0.var_boolean_int = o.var_int_arr_if[15];
        this.var_ei_try = null;
        this.var_boolean_char = o.var_int_arr_if[0];
        this.cfr_renamed_11 = (byte)o.var_int_arr_if[0];
        this.var_ei_new = this.var_ei_byte;
        var1_1 /* !! */  = (int[])this;
        var2_2 = o.var_int_arr_if[0];
        if (((122 ^ 89) & ~(70 ^ 101)) > -" ".length()) ** GOTO lbl19
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(var2_2);
            if ((var3_3.cfr_renamed_12 != o.var_int_arr_if[1])) {
                a_0.cfr_renamed_0(var3_3.cfr_renamed_12, String.valueOf(var1_1 /* !! */ .cfr_renamed_3[var2_2]));
                var3_3.void_new(var3_3.int_if() + var1_1 /* !! */ .cfr_renamed_3[var2_2]);
            }
            var2_2 = (byte)(var2_2 + o.var_int_arr_if[15]);
lbl19:
            // 2 sources

            ** while (!o.boolean_if((int)var2_2, (int)o.var_int_arr_if[3]))
        }
lbl20:
        // 1 sources

    }

    private void (int n, int n2, int n3, int n4 == null) {
        gI gI2 = new gI(n, n2, n3, n4);
        this.var_java_util_Vector_case.addElement(gI2);
    }

        public static a_0 a_0_do() {
        if ((var_o_do == null)) {
            var_o_do = new o();
            return var_o_do;
        }
        return var_o_do;
    }

    public final void (byte by2, byte by3, int n == null) {
        int n2 = n;
        n = by3;
        by3 = by2;
        o o2 = this;
        if ((n2 != 0)) {
            int n3;
            DuLieuNguoiChoi dd_02 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(by3);
            DuLieuNguoiChoi dd_03 = (DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt(n);
            fa fa2 = new fa(((aG)dd_02).cfr_renamed_3, dd_02.var_int_if);
            new fa(((aG)dd_02).cfr_renamed_3, dd_02.var_int_if).cfr_renamed_3 = (short)n2;
            fa2.cfr_renamed_8 = gc_0.int_do(var_int_arr_if[4]);
            fa2.var_int_new = n3 = gc_0.int_do(((aG)dd_03).cfr_renamed_3 - ((aG)dd_02).cfr_renamed_3, -(((aG)dd_03).cfr_renamed_3 - dd_02.var_int_if));
            fa2.var_byte_if = (byte)gc_0.int_if(var_int_arr_if[1], var_int_arr_if[15]);
            fa2.soLuong = gc_0.int_int(fa2.var_int_new + fa2.var_byte_if * var_int_arr_if[26]);
            n3 = var_int_arr_if[21] * gc_0.int_new(fa2.soLuong) >> var_int_arr_if[21];
            n2 = -(var_int_arr_if[21] * gc_0.int_for(fa2.soLuong)) >> var_int_arr_if[21];
            fa2.var_short_if = (short)((aG)dd_03).cfr_renamed_3;
            fa2.var_short_new = (short)dd_03.var_int_if;
            ((aG)fa2).cfr_renamed_3 += n3;
            fa2.var_int_if += n2;
            fa2.cfr_renamed_8 = var_int_arr_if[0];
            fa2.var_byte_do = (byte)(gc_0.int_do(var_int_arr_if[24]) + var_int_arr_if[11]);
            fa2.var_short_int = (short)(var_int_arr_if[6] + gc_0.int_do(var_int_arr_if[3]));
            o2.var_java_util_Vector_try.addElement(fa2);
        }
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_4();
        if (o.boolean_do(GameCanvas.var_int_byte, var_int_arr_if[16])) {
            eq_0[] eq_0Array = new eq_0[var_int_arr_if[3]];
            eq_0Array[o.var_int_arr_if[0]] = new eq_0(var_int_arr_if[17] * bn_0.cfr_renamed_6, var_int_arr_if[18] + var_int_arr_if[19] * bn_0.cfr_renamed_6, var_int_arr_if[2]);
            eq_0Array[o.var_int_arr_if[15]] = new eq_0(var_int_arr_if[17] * bn_0.cfr_renamed_6, GameCanvas.var_int_long + var_int_arr_if[20], var_int_arr_if[2]);
            eq_0Array[o.var_int_arr_if[11]] = new eq_0(GameCanvas.var_int_int, GameCanvas.this - GameCanvas.var_int_else - var_int_arr_if[21], var_int_arr_if[22]);
            eq_0Array[o.var_int_arr_if[4]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[23] * bn_0.cfr_renamed_6, GameCanvas.var_int_long + var_int_arr_if[20], var_int_arr_if[21]);
            eq_0Array[o.var_int_arr_if[24]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[23] * bn_0.cfr_renamed_6, var_int_arr_if[18] + var_int_arr_if[19] * bn_0.cfr_renamed_6, var_int_arr_if[21]);
            var_eq_0_arr_if = eq_0Array;
            return;
        }
        eq_0[] eq_0Array = new eq_0[var_int_arr_if[3]];
        eq_0Array[o.var_int_arr_if[0]] = new eq_0(var_int_arr_if[17], var_int_arr_if[25], var_int_arr_if[2]);
        eq_0Array[o.var_int_arr_if[15]] = new eq_0(var_int_arr_if[17], GameCanvas.var_int_long - var_int_arr_if[3], var_int_arr_if[2]);
        eq_0Array[o.var_int_arr_if[11]] = new eq_0(GameCanvas.var_int_int, GameCanvas.this - GameCanvas.var_int_else - var_int_arr_if[21], var_int_arr_if[22]);
        eq_0Array[o.var_int_arr_if[4]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[23], GameCanvas.var_int_long - var_int_arr_if[3], var_int_arr_if[21]);
        eq_0Array[o.var_int_arr_if[24]] = new eq_0(GameCanvas.var_int_byte - var_int_arr_if[23], var_int_arr_if[25], var_int_arr_if[21]);
        var_eq_0_arr_if = eq_0Array;
    }

    protected final void cfr_renamed_5() {
        super.cfr_renamed_5();
        if (o.boolean_int(a_0.coKichHoat ? 1 : 0) && o.boolean_int(a_0.coTrangThai ? 1 : 0)) {
            this.cfr_renamed_28();
        }
    }

        /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_12() {
        a_0.coKichHoat = o.var_int_arr_if[0];
        a_0.coTrangThai = o.var_int_arr_if[15];
        this.var_java_util_Vector_char.removeAllElements();
        this.cfr_renamed_1();
        var1_1 = o.var_int_arr_if[0];
        if ("  ".length() == "  ".length()) ** GOTO lbl13
        return;
lbl-1000:
        // 1 sources

        {
            if (o.cfr_renamed_2(((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)var1_1)).cfr_renamed_12, a_0.soLuongKhoa)) {
                this.var_java_util_Vector_char.addElement(String.valueOf(var1_1));
            }
            ++var1_1;
lbl13:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)a_0.var_java_util_Vector_do.size()))
        }
lbl14:
        // 1 sources

        this.cfr_renamed_9();
        this.var_ei_new = a_0.var_ei_do;
    }

    private void (int n, int n2, int n3, int n4, int n5, int n6, int n7 == null) {
        c_0 c_02 = new c_0(n, n2, n3, n4, n5, n6, n7);
        this.cfr_renamed_5.addElement(c_02);
    }

    public final void cfr_renamed_11() {
        this.var_ei_new = a_0.var_ei_if;
        this.var_ei_try = this.var_ei_char;
        this.var_ei_new.chuoiGiaTri = "Đặt";
        this.var_ei_try.chuoiGiaTri = "Xong";
    }

    /*
     * Unable to fully structure code
     */
    private void cfr_renamed_21() {
        block2: {
            block3: {
                if (!o.boolean_new(this.var_java_util_Vector_case.size())) break block2;
                if (!o.boolean_do(GameCanvas.var_int_byte, o.var_int_arr_if[8])) break block3;
                var1_1 = GameCanvas.var_int_byte / o.var_int_arr_if[11] - o.var_int_arr_if[27] * bn_0.cfr_renamed_6;
                var2_3 = o.var_int_arr_if[0];
                if ("   ".length() <= (182 ^ 178)) ** GOTO lbl11
                return;
lbl-1000:
                // 1 sources

                {
                    this.cfr_renamed_0(var1_1 + (var2_3 << o.var_int_arr_if[2]) * bn_0.cfr_renamed_6, o.var_int_arr_if[21], var2_3, var2_3);
                    ++var2_3;
lbl11:
                    // 2 sources

                    ** while (!o.boolean_if((int)var2_3, (int)o.var_int_arr_if[4]))
                }
lbl12:
                // 1 sources

                return;
            }
            var1_2 = GameCanvas.var_int_byte / o.var_int_arr_if[11] - o.var_int_arr_if[28];
            var2_4 = o.var_int_arr_if[0];
            if ((98 + 101 - 53 + 20 ^ 96 + 34 - 109 + 142) != 0) ** GOTO lbl22
            return;
lbl-1000:
            // 1 sources

            {
                this.cfr_renamed_0(var1_2 + var2_4 * o.var_int_arr_if[28], o.var_int_arr_if[0], var2_4, var2_4);
                ++var2_4;
lbl22:
                // 2 sources

                ** while (!o.boolean_if((int)var2_4, (int)o.var_int_arr_if[4]))
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_18() {
        super.cfr_renamed_18();
        this.var_java_util_Vector_char.removeAllElements();
        var1_1 = o.var_int_arr_if[0];
        if (((11 ^ 39) & ~(36 ^ 8)) > -" ".length()) ** GOTO lbl11
        return;
lbl-1000:
        // 1 sources

        {
            if (o.cfr_renamed_2(((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)var1_1)).cfr_renamed_12, a_0.soLuongKhoa)) {
                this.var_java_util_Vector_char.addElement(String.valueOf(var1_1));
            }
            ++var1_1;
lbl11:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)a_0.var_java_util_Vector_do.size()))
        }
lbl12:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_3(byte var1_1) {
        super.cfr_renamed_6();
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_28();
        a_0.cfr_renamed_16();
        this.var_java_util_Vector_char.removeAllElements();
        this.cfr_renamed_1();
        var2_2 = o.var_int_arr_if[0];
        if ((101 + 1 - 8 + 40 ^ 1 + 126 - 2 + 5) == (147 ^ 149 ^ "  ".length())) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            if (o.cfr_renamed_2(((DuLieuNguoiChoi)a_0.var_java_util_Vector_do.elementAt((int)var2_2)).cfr_renamed_12, a_0.soLuongKhoa)) {
                this.var_java_util_Vector_char.addElement(String.valueOf(var2_2));
            }
            ++var2_2;
lbl15:
            // 2 sources

            ** while (!o.boolean_if((int)var2_2, (int)a_0.var_java_util_Vector_do.size()))
        }
lbl16:
        // 1 sources

        if ((AngelChip.duLieuNguoiChoi.cfr_renamed_12 != a_0.soLuongKhoa)) {
            this.cfr_renamed_11();
            if (" ".length() != " ".length()) {
                return;
            }
        } else {
            this.var_ei_new = null;
            this.var_ei_try = null;
        }
        a_0.var_boolean_int = o.var_int_arr_if[0];
        a_0.coKichHoat = o.var_int_arr_if[15];
        a_0.cfr_renamed_11 = var1_1;
        a_0.soXu = GameCanvas.int_if();
    }

    private static void cfr_renamed_29() {
        var_int_arr_if = new int[38];
        o.var_int_arr_if[0] = (0x42 ^ 0x68) & ~(0x1C ^ 0x36);
        o.var_int_arr_if[1] = -" ".length();
        o.var_int_arr_if[2] = 0x21 ^ 0x27;
        o.var_int_arr_if[3] = 0x1B ^ 0x56 ^ (0xFE ^ 0xB6);
        o.var_int_arr_if[4] = "   ".length();
        o.var_int_arr_if[5] = 13 + 149 - 103 + 113 ^ 17 + 107 - -40 + 7;
        o.var_int_arr_if[6] = 0xA1 ^ 0xA9;
        o.var_int_arr_if[7] = 7 + 5 - 9 + 164 ^ 52 + 128 - 105 + 99;
        o.var_int_arr_if[8] = (0x87 ^ 0x8B) + (0x1A ^ 0x44) - (0x27 ^ 0x37) + (0xE6 ^ 0x88);
        o.var_int_arr_if[9] = 0xAD ^ 0xBA;
        o.var_int_arr_if[10] = 0x91 ^ 0xA1;
        o.var_int_arr_if[11] = "  ".length();
        o.var_int_arr_if[12] = 0x4B ^ 0x4D ^ (0xFB ^ 0x9D);
        o.var_int_arr_if[13] = 0x82 ^ 0x8E;
        o.var_int_arr_if[14] = 56 + 131 - 75 + 39 ^ 7 + 23 - -81 + 72;
        o.var_int_arr_if[15] = " ".length();
        o.var_int_arr_if[16] = 68 + 44 - -31 + 7;
        o.var_int_arr_if[17] = 0x52 ^ 0x73 ^ (0x3A ^ 0xF);
        o.var_int_arr_if[18] = 0x80 ^ 0xB2;
        o.var_int_arr_if[19] = 0x20 ^ 0x68 ^ (0x76 ^ 0x20);
        o.var_int_arr_if[20] = 0x8C ^ 0xB0;
        o.var_int_arr_if[21] = 0x54 ^ 0x5E;
        o.var_int_arr_if[22] = 0x67 ^ 0xE ^ (0x29 ^ 0x61);
        o.var_int_arr_if[23] = 0xC9 ^ 0xC7;
        o.var_int_arr_if[24] = 0xBB ^ 0xBF;
        o.var_int_arr_if[25] = 0 ^ 0xD;
        o.var_int_arr_if[26] = 0x36 ^ 0x48 ^ (0xB9 ^ 0x9D);
        o.var_int_arr_if[27] = 0xF9 ^ 0x8C ^ (0xBC ^ 0x89);
        o.var_int_arr_if[28] = 0x18 ^ 0x29;
        o.var_int_arr_if[29] = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        o.var_int_arr_if[30] = -(0xFFFF97EF & 0x6A59) & (0xFFFFFFFD & 0x10FBFE);
        o.var_int_arr_if[31] = 0xFFFFD77E & 0x2BE9;
        o.var_int_arr_if[32] = -(0xFFFFFEA3 & 0x755F) & (0xFFFFFFEF & 0x777B);
        o.var_int_arr_if[33] = -(0xFFFFFF3B & 0x5CDD) & (0xFFFFFFFF & 0x5F7F);
        o.var_int_arr_if[34] = 0xB8 ^ 0xA9;
        o.var_int_arr_if[35] = 0x4D ^ 0x29;
        o.var_int_arr_if[36] = 41 + 43 - 80 + 141 ^ 141 + 136 - 228 + 136;
        o.var_int_arr_if[37] = -(0xFFFFFBF5 & 0x348B) & (0xFFFFF7EF & 0x3BF6);
    }

    static {
        o.cfr_renamed_29();
    }

    public final void (byte by2, byte by3, byte by4 == null) {
        if ((by3 != by4)) {
            this.cfr_renamed_10 = by2;
            this.cfr_renamed_16 = by3;
            this.var_byte_char = by4;
            this.var_boolean_try = var_int_arr_if[15];
            this.this = (byte)var_int_arr_if[4];
        }
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_9() {
        var1_1 = o.var_int_arr_if[0];
        if (((3 ^ 31 ^ (0 ^ 53)) & (21 ^ 81 ^ (103 ^ 10) ^ -" ".length())) > -" ".length()) ** GOTO lbl10
        return;
lbl-1000:
        // 1 sources

        {
            var2_2 = (bd)this.var_java_util_Vector_byte.elementAt(var1_1);
            var3_3 = (this.var_java_util_Vector_char, (int)this.cfr_renamed_10 == null);
            this.cfr_renamed_0(var2_2.cfr_renamed_1, var2_2.cfr_renamed_0, var2_2.cfr_renamed_1, var2_2.cfr_renamed_0, this.var_byte_arr_arr_do[this.cfr_renamed_10][var1_1], o.int_if(var3_3), var1_1);
            ++var1_1;
lbl10:
            // 2 sources

            ** while (!o.boolean_if((int)var1_1, (int)o.var_int_arr_if[2]))
        }
lbl11:
        // 1 sources

    }

    /*
     * Enabled aggressive block sorting
     */
    private void cfr_renamed_28() {
        this.cfr_renamed_13 = (byte)var_int_arr_if[1];
        this.cfr_renamed_6 = (byte)var_int_arr_if[1];
        this.cfr_renamed_16 = (byte)var_int_arr_if[0];
        this.var_byte_char = (byte)var_int_arr_if[0];
        this.cfr_renamed_10 = (byte)var_int_arr_if[0];
        this.var_boolean_byte = var_int_arr_if[0];
        this.var_boolean_try = var_int_arr_if[0];
        this.var_boolean_char = var_int_arr_if[0];
        this.cfr_renamed_11 = (byte)var_int_arr_if[0];
        this.dangChayAuto = var_int_arr_if[0];
        this.cfr_renamed_4.removeAllElements();
        this.cfr_renamed_5.removeAllElements();
        this.var_java_util_Vector_case.removeAllElements();
        this.cfr_renamed_17 = (byte)var_int_arr_if[0];
        this.var_boolean_case = var_int_arr_if[0];
        a_0.coKichHoat = var_int_arr_if[0];
        ((a_0)this).cfr_renamed_18 = var_int_arr_if[1];
        this.this = (byte)var_int_arr_if[0];
        a_0.coTrangThai = var_int_arr_if[0];
        this.cfr_renamed_24();
        int n = var_int_arr_if[0];
        while (!o.boolean_if(n, this.var_java_util_Vector_byte.size())) {
            ((bd)this.var_java_util_Vector_byte.elementAt((int)n)).cfr_renamed_3 = var_int_arr_if[0];
            ++n;
        }
    }
}

