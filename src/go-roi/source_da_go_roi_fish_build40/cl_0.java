/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import java.util.Vector;
import main.AngelChip;

/*
 * Renamed from cL
 */
public final class cl_0
extends NhiemVuAutoBase {
    private int var_int_if;
    private final Vector var_java_util_Vector_do;
    private int cfr_renamed_2;
    private final int[] mangSoNguyen;
    private boolean dangChayAuto;
    private static final int[] var_int_arr_if;
    private int cfr_renamed_3 = var_int_arr_if[0];
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private long soXu;
    private boolean coTrangThai;
    private static final Hashtable var_java_util_Hashtable_do;
    private final Integer var_java_lang_Integer_do;
    public static int soLuong;
    private String chuoiGiaTri;
    private int cfr_renamed_6;
    private int cfr_renamed_7;
    private static Vector var_java_util_Vector_if;
    private int cfr_renamed_8;
    private long var_long_if;

    private void cfr_renamed_3() {
        if (cl_0.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
            try {
                int n;
                String[] stringArray = new an(this.getClass().getResourceAsStream("/witch"));
                Object object = new ByteArrayOutputStream();
                Object object2 = new byte[var_int_arr_if[24]];
                while (cl_0.cfr_renamed_0(n = stringArray.read((byte[])object2), var_int_arr_if[1])) {
                    ((ByteArrayOutputStream)object).write((byte[])object2, var_int_arr_if[0], n);
                    if ("  ".length() == "  ".length()) continue;
                    return;
                }
                stringArray = new String(((ByteArrayOutputStream)object).toByteArray(), "UTF-8");
                object = new Vector();
                object2 = new StringBuffer();
                n = var_int_arr_if[0];
                while ((n < stringArray.length())) {
                    char c2 = stringArray.charAt(n);
                    if ((c2 == var_int_arr_if[25])) {
                        if (cl_0.cfr_renamed_0(((StringBuffer)object2).length())) {
                            ((Vector)object).addElement(((StringBuffer)object2).toString());
                        }
                        ((StringBuffer)object2).setLength(var_int_arr_if[0]);
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    } else if ((c2 != var_int_arr_if[26])) {
                        ((StringBuffer)object2).append(c2);
                        }
                    ++n;
                    if (((9 ^ 0x24) & ~(0x19 ^ 0x34)) >= 0) continue;
                    return;
                }
                if (cl_0.cfr_renamed_0(((StringBuffer)object2).length())) {
                    ((Vector)object).addElement(((StringBuffer)object2).toString());
                }
                n = var_int_arr_if[0];
                while (cl_0.cfr_renamed_4(n, ((Vector)object).size())) {
                    String string = (String)((Vector)object).elementAt(n);
                    if ((string != null) && (string.length() > 0) && cl_0.cfr_renamed_2((stringArray = TienIchGame.java_lang_String_arr_do(string, "|")).length, var_int_arr_if[4])) {
                        var_java_util_Vector_if.addElement(new gm_0(stringArray[var_int_arr_if[0]], stringArray[var_int_arr_if[4]]));
                    }
                    ++n;
                    if (-" ".length() != "  ".length()) continue;
                    return;
                }
                return;
            }
            catch (Exception exception) {
                }
        }
    }

    private void cfr_renamed_4() {
        GameCanvas.cfr_renamed_8();
        this.cfr_renamed_7 = var_int_arr_if[1];
        this.cfr_renamed_2 = (int)null;
        ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
        if (cl_0.boolean_do(TienIchGame.cfr_renamed_4(15000L) ? 1 : 0) && cl_0.cfr_renamed_1((Object)this.cfr_renamed_2)) {
            this.cfr_renamed_7 = var_int_arr_if[0];
            this.cfr_renamed_8 = var_int_arr_if[0];
            this.cfr_renamed_6 = var_int_arr_if[0];
            int n = var_int_arr_if[0];
            while ((n < this.cfr_renamed_2.size())) {
                cg cg2 = (cg)this.cfr_renamed_2.elementAt(n);
                if ((cg2 != null)) {
                    if ((cg2.var_short_do == var_int_arr_if[18])) {
                        this.cfr_renamed_7 += var_int_arr_if[4];
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    } else if ((cg2.var_short_do == var_int_arr_if[19])) {
                        this.cfr_renamed_8 += var_int_arr_if[4];
                        } else if ((cg2.var_short_do == var_int_arr_if[20])) {
                        this.cfr_renamed_6 += var_int_arr_if[4];
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    } else if (!(cg2.var_short_do != var_int_arr_if[21]) || !(cg2.var_short_do != var_int_arr_if[22]) || (cg2.var_short_do == var_int_arr_if[23])) {
                        ft_0.ft_0_do().void_do((int)cg2.var_short_do, var_int_arr_if[4]);
                        TienIchGame.void_if(50L);
                    }
                }
                ++n;
                if ("  ".length() > ((0xB7 ^ 0xAE) & ~(0x40 ^ 0x59))) continue;
                return;
            }
            this.cfr_renamed_2 = (int)null;
        }
        GameCanvas.cfr_renamed_7();
    }

        private static boolean boolean_do(int n) {
        return n != 0;
    }

    public cl_0() {
        this.var_java_util_Vector_do = new Vector();
        this.chuoiGiaTri = null;
        this.cfr_renamed_4 = var_int_arr_if[1];
        this.cfr_renamed_8 = this.cfr_renamed_6 = var_int_arr_if[0];
        this.cfr_renamed_7 = this.cfr_renamed_6;
        this.cfr_renamed_2 = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[2]];
        nArray[cl_0.var_int_arr_if[0]] = var_int_arr_if[3];
        nArray[cl_0.var_int_arr_if[4]] = var_int_arr_if[5];
        nArray[cl_0.var_int_arr_if[6]] = var_int_arr_if[7];
        nArray[cl_0.var_int_arr_if[8]] = var_int_arr_if[0];
        nArray[cl_0.var_int_arr_if[9]] = var_int_arr_if[10];
        nArray[cl_0.var_int_arr_if[10]] = var_int_arr_if[11];
        nArray[cl_0.var_int_arr_if[11]] = var_int_arr_if[12];
        nArray[cl_0.var_int_arr_if[13]] = var_int_arr_if[14];
        this.mangSoNguyen = nArray;
        this.var_long_if = TienIchGame.int_do(var_int_arr_if[4], var_int_arr_if[15]) * var_int_arr_if[16] + var_int_arr_if[17];
        this.soXu = System.currentTimeMillis();
        this.cfr_renamed_5 = var_int_arr_if[1];
        this.dangChayAuto = this.coTrangThai = var_int_arr_if[0];
        this.var_java_lang_Integer_do = new Integer(AngelChip.duLieuNguoiChoi.var_short_goto);
        if (cl_0.boolean_do(var_java_util_Hashtable_do.containsKey(this.var_java_lang_Integer_do) ? 1 : 0)) {
            this.cfr_renamed_3 = (Integer)var_java_util_Hashtable_do.get(this.var_java_lang_Integer_do);
            if (((0x8B ^ 0xB1) & ~(0xFB ^ 0xC1)) < -" ".length()) {
                throw null;
            }
        } else {
            this.cfr_renamed_3 = var_int_arr_if[0];
        }
        this.cfr_renamed_3();
    }

    static {
        cl_0.cfr_renamed_6();
        soLuong = var_int_arr_if[25];
        var_java_util_Vector_if = new Vector();
        var_java_util_Hashtable_do = new Hashtable();
    }

                public final void void_for() {
        super.void_for();
        this.chuoiGiaTri = null;
        this.dangChayAuto = this.coTrangThai = var_int_arr_if[0];
        this.cfr_renamed_2 = var_int_arr_if[0];
        this.soXu = System.currentTimeMillis();
        this.cfr_renamed_5 = var_int_arr_if[1];
        if (!(this.var_java_util_Vector_do.isEmpty())) {
            this.var_java_util_Vector_do.removeAllElements();
        }
    }

        public final String toString() {
        return "Hô Phong Hoán Vũ";
    }

    public final boolean boolean_do(String string) {
        if (cl_0.boolean_do(string.startsWith("Ta không phải") ? 1 : 0)) {
            TienIchGame.cfr_renamed_7();
            return var_int_arr_if[4];
        }
        if (!!(string.startsWith("Đã có người trả lời đúng")) || cl_0.boolean_do(string.startsWith("Ván chơi đã kết thúc") ? 1 : 0)) {
            TienIchGame.cfr_renamed_7();
            ((NhiemVuAutoBase)this).cfr_renamed_3 = System.currentTimeMillis();
            return var_int_arr_if[4];
        }
        if (cl_0.boolean_do(string.startsWith("Rương của ngươi đã đầy") ? 1 : 0) && (this.var_int_if == var_int_arr_if[4])) {
            this.dangChayAuto = var_int_arr_if[4];
            return var_int_arr_if[4];
        }
        if ((string.indexOf("nhận được") != var_int_arr_if[1]) && (string.indexOf("Magic powder") != var_int_arr_if[1])) {
            if ((this.cfr_renamed_7 += var_int_arr_if[4] < soLuong)) {
                GameCanvas.hienThongBaoPopup(string + " (" + this.cfr_renamed_7 + "/" + soLuong + ")");
            }
            return var_int_arr_if[4];
        }
        if ((string.indexOf("trả lời sai rồi") != var_int_arr_if[1])) {
            return var_int_arr_if[4];
        }
        if ((string.indexOf("mua vật phẩm thành công") != var_int_arr_if[1])) {
            TienIchGame.this();
            return var_int_arr_if[4];
        }
        if ((string.indexOf("tạo thuốc thành công") != var_int_arr_if[1])) {
            TienIchGame.cfr_renamed_12();
            return var_int_arr_if[4];
        }
        if (cl_0.boolean_do(string.equals("Rương của bạn đã đầy") ? 1 : 0)) {
            this.coTrangThai = var_int_arr_if[4];
            TienIchGame.this();
            return var_int_arr_if[4];
        }
        if (cl_0.boolean_do(string.startsWith("Bạn cần thuốc tạo đám mây") ? 1 : 0)) {
            this.cfr_renamed_8 = var_int_arr_if[0];
            return var_int_arr_if[4];
        }
        if ((string.indexOf("đã chặn tương tác") != var_int_arr_if[1])) {
            if ((this.chuoiGiaTri != null)) {
                if (!(this.var_java_util_Vector_do.contains(this.chuoiGiaTri))) {
                    this.var_java_util_Vector_do.addElement(this.chuoiGiaTri);
                }
                this.chuoiGiaTri = null;
            }
            TienIchGame.cfr_renamed_12();
            return var_int_arr_if[4];
        }
        return super.boolean_do(string);
    }

        public final int int_do() {
        return this.cfr_renamed_3;
    }

    public static void (String string, int n, byte by2 != null) {
        int n2 = var_int_arr_if[0];
        while ((n2 < var_java_util_Vector_if.size())) {
            gm_0 gm_02 = (gm_0)var_java_util_Vector_if.elementAt(n2);
            if ((gm_02 != null) && (string.indexOf(gm_02.cfr_renamed_1) != var_int_arr_if[1])) {
                ft_0.ft_0_do().cfr_renamed_1(n, by2, gm_02.cfr_renamed_0);
                return;
            }
            ++n2;
            if ("   ".length() >= "   ".length()) continue;
            return;
        }
    }

    private static void cfr_renamed_6() {
        var_int_arr_if = new int[32];
        cl_0.var_int_arr_if[0] = (0x9C ^ 0xBA) & ~(0x8E ^ 0xA8);
        cl_0.var_int_arr_if[1] = -" ".length();
        cl_0.var_int_arr_if[2] = 0xA2 ^ 0xAA;
        cl_0.var_int_arr_if[3] = 0x54 ^ 0x4C ^ (0xB3 ^ 0x92);
        cl_0.var_int_arr_if[4] = " ".length();
        cl_0.var_int_arr_if[5] = 135 + 80 - 169 + 209 ^ 34 + 94 - -63 + 6;
        cl_0.var_int_arr_if[6] = "  ".length();
        cl_0.var_int_arr_if[7] = 12 + 6 - -89 + 52 ^ 93 + 37 - 58 + 76;
        cl_0.var_int_arr_if[8] = "   ".length();
        cl_0.var_int_arr_if[9] = 88 + 92 - 149 + 151 ^ 85 + 24 - -49 + 20;
        cl_0.var_int_arr_if[10] = 0x29 ^ 0x5A ^ (0xD5 ^ 0xA3);
        cl_0.var_int_arr_if[11] = 0xBC ^ 0xB5 ^ (6 ^ 9);
        cl_0.var_int_arr_if[12] = 100 + 123 - 213 + 178 ^ 179 + 93 - 209 + 118;
        cl_0.var_int_arr_if[13] = 0x25 ^ 0x22;
        cl_0.var_int_arr_if[14] = 0x6D ^ 0x7A;
        cl_0.var_int_arr_if[15] = 0x40 ^ 0x74 ^ (0x4B ^ 0x52);
        cl_0.var_int_arr_if[16] = 0xFFFF97FB & 0x6BEC;
        cl_0.var_int_arr_if[17] = -(0xFFFFD769 & 0x6DD7) & (0xFFFFFFFA & 0x7FDD);
        cl_0.var_int_arr_if[18] = 0xFFFFFB7E & 0xDDD;
        cl_0.var_int_arr_if[19] = 0xFFFFFD73 & 0xBED;
        cl_0.var_int_arr_if[20] = -(0xFFFFDDB1 & 0x36CF) & (0xFFFFFDFF & 0x1FDF);
        cl_0.var_int_arr_if[21] = 0xFFFF83BB & 0x7DFF;
        cl_0.var_int_arr_if[22] = 0xFFFFDDFF & 0x23BF;
        cl_0.var_int_arr_if[23] = -(0xFFFF9F37 & 0x6ECF) & (0xFFFFCFEE & 0x3FD7);
        cl_0.var_int_arr_if[24] = -(0xFFFFBB5F & 0x6EBD) & (0xFFFFEEFC & 0x3F1F);
        cl_0.var_int_arr_if[25] = 0x30 ^ 0x3A;
        cl_0.var_int_arr_if[26] = 0xD ^ 0;
        cl_0.var_int_arr_if[27] = 0x4F ^ 0x31 ^ (0x3A ^ 0x6C);
        cl_0.var_int_arr_if[28] = 0xCD ^ 0xC1;
        cl_0.var_int_arr_if[29] = 0xFFFFF6B5 & 0x77359D4A;
        cl_0.var_int_arr_if[30] = 0x44 ^ 0x69 ^ (0xDB ^ 0x92);
        cl_0.var_int_arr_if[31] = 0x49 ^ 0x68;
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

            public final void (int n >= String string) {
        if ((fh.var_int_char != var_int_arr_if[5])) {
            return;
        }
        if (cl_0.boolean_do(string.equals("Trò chơi bắt đầu") ? 1 : 0)) {
            n = var_int_arr_if[9];
            while ((n <= var_int_arr_if[12])) {
                ft_0.ft_0_do().cfr_renamed_2((short)n);
                ++n;
                if ("  ".length() >= ((0x28 ^ 7 ^ (0x23 ^ 0x5A)) & (99 + 32 - 30 + 114 ^ 10 + 30 - -83 + 6 ^ -" ".length()))) continue;
                return;
            }
        }
    }

            /*
     * Enabled aggressive block sorting
     */
    public final void d_() {
        Object object;
        int n;
        cl_0 cl_02;
        block49: {
            long l;
            if (cl_0.cfr_renamed_0(cl_0.cfr_renamed_1(System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_3, 180000L))) {
                TienIchGame.dangXuatTaiKhoan();
                TienIchGame.hienThongBao(16000L);
                return;
            }
            if (cl_0.boolean_do(GameCanvas.var_en_do instanceof ThongTinNhanVat)) {
                return;
            }
            if ((!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == var_int_arr_if[1])) && cl_0.cfr_renamed_3(cl_0.cfr_renamed_1(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            switch (this.var_int_if) {
                case 1: {
                    dd_0 dd_02;
                    if (!(this.cfr_renamed_7 < soLuong) || cl_0.boolean_do(this.dangChayAuto ? 1 : 0)) {
                        this.var_int_if = var_int_arr_if[6];
                        return;
                    }
                    if (!(fh.var_int_char == var_int_arr_if[5])) {
                        this.var_int_if = var_int_arr_if[0];
                        return;
                    }
                    if ((this.cfr_renamed_5 == var_int_arr_if[1]) && (dd_02 = TienIchGame.dd_0_do("bac.thay.phu.thuy") != null)) {
                        this.cfr_renamed_5 = dd_02.cfr_renamed_2 - var_int_arr_if[27];
                        AngelChip.duLieuNguoiChoi.void_do(this.cfr_renamed_5, dd_02.var_byte_int);
                        fn.fn_do().cfr_renamed_1(this.cfr_renamed_5, dd_02.var_byte_int, var_int_arr_if[6], var_int_arr_if[0]);
                    }
                    if (!cl_0.cfr_renamed_0((System.currentTimeMillis() - this.soXu >= this.var_long_if))) return;
                    this.soXu = System.currentTimeMillis();
                    this.var_long_if = TienIchGame.int_do(var_int_arr_if[4], var_int_arr_if[15]) * var_int_arr_if[16] + var_int_arr_if[17];
                    AngelChip.duLieuNguoiChoi.void_do(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0);
                    fn.fn_do().cfr_renamed_1(AngelChip.duLieuNguoiChoi.var_short_for, AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0, var_int_arr_if[6], var_int_arr_if[0]);
                    return;
                }
                case 2: {
                    if ((fh.var_int_char == var_int_arr_if[3])) {
                        dd_0 dd_03;
                        this.cfr_renamed_4();
                        if ((this.cfr_renamed_7 < 0)) {
                            TienIchGame.void_if("Có lỗi xảy ra!");
                            return;
                        }
                        if ((this.cfr_renamed_7 == 0)) {
                            if ((this.cfr_renamed_8 > 0)) {
                                this.cfr_renamed_2 = var_int_arr_if[0];
                                this.var_int_if = var_int_arr_if[8];
                                return;
                            }
                            if (cl_0.boolean_do(this.dangChayAuto ? 1 : 0)) {
                                AutoController.tatAuto();
                                GameCanvas.hienThongBaoPopup("Rương đồ đã đầy!");
                                return;
                            }
                            this.var_int_if = var_int_arr_if[0];
                            return;
                        }
                        if ((AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[0]] < var_int_arr_if[16])) {
                            AutoController.tatAuto();
                            GameCanvas.hienThongBaoPopup("Đã hết xu!");
                            return;
                        }
                        int n2 = this.cfr_renamed_7;
                        if (cl_0.boolean_do(this.dangChayAuto ? 1 : 0)) {
                            if ((this.cfr_renamed_7 < var_int_arr_if[6])) {
                                AutoController.tatAuto();
                                GameCanvas.hienThongBaoPopup("Rương đồ đã đầy!");
                                return;
                            }
                            n2 = this.cfr_renamed_7 / var_int_arr_if[6];
                            int n3 = var_int_arr_if[0];
                            while ((n3 < n2)) {
                                ft_0.ft_0_do().void_do(var_int_arr_if[18], var_int_arr_if[4]);
                                TienIchGame.void_if(50L);
                                ++n3;
                                if ("   ".length() > 0) continue;
                                return;
                            }
                            this.cfr_renamed_7 -= n2;
                        }
                        if ((dd_03 = TienIchGame.dd_0_do("pretty.witch") != null)) {
                            int n4 = dd_03.cfr_renamed_2 + var_int_arr_if[28];
                            AngelChip.duLieuNguoiChoi.void_do(n4, dd_03.var_byte_int);
                            fn.fn_do().cfr_renamed_1(n4, dd_03.var_byte_int, var_int_arr_if[6], var_int_arr_if[0]);
                            TienIchGame.void_if(250L);
                            this.coTrangThai = var_int_arr_if[0];
                            if ((this.cfr_renamed_6 < this.cfr_renamed_7)) {
                                n4 = var_int_arr_if[0];
                                while ((n4 < n2) && (AngelChip.duLieuNguoiChoi.mangSoNguyen[var_int_arr_if[0]] >= var_int_arr_if[16])) {
                                    fn.fn_do().cfr_renamed_1(dd_03.cfr_renamed_9, var_int_arr_if[0], var_int_arr_if[6]);
                                    if (cl_0.boolean_do(TienIchGame.cfr_renamed_3(5000L) ? 1 : 0) && (!!(this.coTrangThai) || !(this.cfr_renamed_6 += var_int_arr_if[4] < this.cfr_renamed_7))) break;
                                    ++n4;
                                    if ("   ".length() != "  ".length()) continue;
                                    return;
                                }
                            }
                            if ((n4 = this.cfr_renamed_6 > 0)) {
                                n2 = var_int_arr_if[0];
                                while ((n2 < n4)) {
                                    fn.fn_do().cfr_renamed_1(dd_03.cfr_renamed_9, var_int_arr_if[0], var_int_arr_if[9]);
                                    if (cl_0.boolean_do(TienIchGame.cfr_renamed_13(5000L) ? 1 : 0)) {
                                        this.cfr_renamed_8 += var_int_arr_if[4];
                                        this.cfr_renamed_6 -= var_int_arr_if[4];
                                        this.cfr_renamed_7 -= var_int_arr_if[4];
                                    }
                                    ++n2;
                                    }
                            }
                        }
                        if (!(this.cfr_renamed_8 > 0)) return;
                        this.cfr_renamed_2 = var_int_arr_if[0];
                        this.var_int_if = var_int_arr_if[8];
                        return;
                    }
                    if (!cl_0.boolean_do(TienIchGame.cfr_renamed_1(var_int_arr_if[3]) ? 1 : 0)) return;
                    TienIchGame.void_if(1000L);
                    return;
                }
                case 3: {
                    if ((this.cfr_renamed_8 <= 0)) {
                        this.var_int_if = var_int_arr_if[0];
                        return;
                    }
                    if ((this.cfr_renamed_2 >= this.mangSoNguyen.length)) {
                        this.cfr_renamed_2 = var_int_arr_if[6];
                    }
                    if ((fh.var_int_char == this.mangSoNguyen[this.cfr_renamed_2])) {
                        cl_02 = this;
                        n = var_int_arr_if[0];
                        break;
                    }
                    if (!cl_0.boolean_do(TienIchGame.cfr_renamed_1(this.mangSoNguyen[this.cfr_renamed_2]) ? 1 : 0)) return;
                    TienIchGame.void_if(3500L);
                    return;
                }
                default: {
                    if (cl_0.boolean_do(var_java_util_Vector_if.isEmpty() ? 1 : 0)) {
                        AutoController.tatAuto();
                        GameCanvas.hienThongBaoPopup("Có lỗi xảy ra!");
                        return;
                    }
                    if ((fh.var_int_char == var_int_arr_if[5])) {
                        this.cfr_renamed_4();
                        if ((this.cfr_renamed_7 < 0)) {
                            TienIchGame.void_if("Có lỗi xảy ra!");
                            return;
                        }
                        if ((this.cfr_renamed_8 > 0)) {
                            this.cfr_renamed_2 = var_int_arr_if[4];
                            this.var_int_if = var_int_arr_if[8];
                            return;
                        }
                        this.cfr_renamed_5 = var_int_arr_if[1];
                        this.dangChayAuto = var_int_arr_if[0];
                        this.var_int_if = var_int_arr_if[4];
                        if ((this.cfr_renamed_4 == var_int_arr_if[1])) {
                            this.cfr_renamed_4 = go_0.var_byte_do;
                            return;
                        }
                        if (!(go_0.var_byte_do != this.cfr_renamed_4)) return;
                        fn.fn_do().cfr_renamed_3(var_int_arr_if[5], this.cfr_renamed_4);
                        TienIchGame.boolean_do(5000L);
                        return;
                    }
                    if (!cl_0.boolean_do(TienIchGame.cfr_renamed_1(var_int_arr_if[5]) ? 1 : 0)) return;
                    TienIchGame.void_if(1000L);
                    return;
                }
            }
            while ((n < fh.var_java_util_Vector_case.size())) {
                bm bm2 = (bm)fh.var_java_util_Vector_case.elementAt(n);
                if ((bm2 != null) && (bm2.var_byte_if == 0) && cl_0.cfr_renamed_4(((DuLieuNguoiChoi)bm2).soLuong) && cl_0.cfr_renamed_1(bm2 = (DuLieuNguoiChoi)fh.var_java_util_Vector_case.elementAt(n)) && cl_0.cfr_renamed_4(((DuLieuNguoiChoi)bm2).var_int_class) && cl_0.cfr_renamed_0(((DuLieuNguoiChoi)bm2).var_short_goto, AngelChip.duLieuNguoiChoi.var_short_goto) && cl_0.cfr_renamed_4(((DuLieuNguoiChoi)bm2).var_short_goto, var_int_arr_if[29]) && cl_0.cfr_renamed_4(cl_02.var_java_util_Vector_do.contains(((DuLieuNguoiChoi)bm2).soLuong) ? 1 : 0)) {
                    object = bm2;
                    break block49;
                }
                ++n;
                if ("   ".length() > "  ".length()) continue;
                return;
            }
            object = cl_02 = null;
        }
        if ((object != null)) {
            if (!cl_0.cfr_renamed_3(Math.abs(AngelChip.duLieuNguoiChoi.var_short_for - ((DuLieuNguoiChoi)((Object)cl_02)).var_short_for), var_int_arr_if[30]) || cl_0.cfr_renamed_2(Math.abs(AngelChip.duLieuNguoiChoi.var_boolean_int - ((DuLieuNguoiChoi)((Object)cl_02)).var_boolean_int), var_int_arr_if[30])) {
                int n5;
                if (cl_0.cfr_renamed_4(AngelChip.duLieuNguoiChoi.var_short_for, ((DuLieuNguoiChoi)((Object)cl_02)).var_short_for)) {
                    n5 = ((DuLieuNguoiChoi)((Object)cl_02)).var_short_for - var_int_arr_if[28];
                    } else {
                    n5 = ((DuLieuNguoiChoi)((Object)cl_02)).var_short_for + var_int_arr_if[28];
                }
                n = n5;
                AngelChip.duLieuNguoiChoi.void_do(n, ((DuLieuNguoiChoi)((Object)cl_02)).var_boolean_int ? 1 : 0);
                fn.fn_do().cfr_renamed_1(n, ((DuLieuNguoiChoi)((Object)cl_02)).var_boolean_int ? 1 : 0, var_int_arr_if[6], var_int_arr_if[0]);
                TienIchGame.void_if(100L);
            }
            this.chuoiGiaTri = (String)((DuLieuNguoiChoi)((Object)cl_02)).soLuong;
            ft_0.ft_0_do().cfr_renamed_2(var_int_arr_if[31], ((DuLieuNguoiChoi)((Object)cl_02)).var_short_goto);
            if (!cl_0.boolean_do(TienIchGame.cfr_renamed_7(5000L) ? 1 : 0)) return;
            this.cfr_renamed_8 -= var_int_arr_if[4];
            ((NhiemVuAutoBase)this).cfr_renamed_3 = System.currentTimeMillis();
            var_java_util_Hashtable_do.put(this.var_java_lang_Integer_do, new Integer(this.cfr_renamed_3 += var_int_arr_if[4]));
            TienIchGame.void_if(1000L);
            return;
        } else {
            if ((this.cfr_renamed_2 < var_int_arr_if[6])) {
                this.cfr_renamed_2 = var_int_arr_if[6];
                return;
            }
            this.cfr_renamed_2 += var_int_arr_if[4];
        }
    }

    }

