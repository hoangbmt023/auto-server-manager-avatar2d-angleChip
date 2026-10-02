/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cj
extends dj_0 {
    int[] mangSoNguyen;
    private int var_int_if;
    public static cj var_cj_do;
    private cu_0 var_cu_0_do;
    private static int[] var_int_arr_if;
    int soLuong;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;
    private int cfr_renamed_5;
    private int cfr_renamed_6;

    public final void void_for(int n) {
        switch (n) {
            case 0: {
                GameCanvas.cfr_renamed_1("Bạn có chắc muốn chuyển tiền không ?", new m(this));
                return;
            }
            case 1: {
                GameCanvas.var_dj_0_do = null;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.var_en_do.cfr_renamed_0(var1_1);
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fa_0_do.cfr_renamed_2(var1_1, this.cfr_renamed_4, this.cfr_renamed_2, this.var_int_if, this.cfr_renamed_3);
        var1_1.translate(this.cfr_renamed_4, this.cfr_renamed_2);
        var2_2 = cj.var_int_arr_if[8];
        if ("   ".length() == "   ".length()) ** GOTO lbl21
        return;
lbl-1000:
        // 1 sources

        {
            if (cj.boolean_if(this.soLuong, var2_2)) {
                v0 = cj.var_int_arr_if[10];
                if ("   ".length() < "   ".length()) {
                    return;
                }
            } else {
                v0 = cj.var_int_arr_if[8];
            }
            this.var_cu_0_do.cfr_renamed_1(v0, this.cfr_renamed_6 / cj.var_int_arr_if[0] + var2_2 % cj.var_int_arr_if[4] * this.cfr_renamed_6, this.cfr_renamed_5 / cj.var_int_arr_if[0] + var2_2 / cj.var_int_arr_if[4] * this.cfr_renamed_5, cj.var_int_arr_if[8], cj.var_int_arr_if[4], var1_1);
            GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, String.valueOf(this.mangSoNguyen[var2_2]), this.cfr_renamed_6 / cj.var_int_arr_if[0] + var2_2 % cj.var_int_arr_if[4] * this.cfr_renamed_6, this.cfr_renamed_5 / cj.var_int_arr_if[0] + var2_2 / cj.var_int_arr_if[4] * this.cfr_renamed_5 - dF.cfr_renamed_7 / cj.var_int_arr_if[0], cj.var_int_arr_if[0]);
            ++var2_2;
lbl21:
            // 2 sources

            ** while (!cj.boolean_do((int)var2_2, (int)this.mangSoNguyen.length))
        }
lbl22:
        // 1 sources

        GameCanvas.hienThongBaoPopup(var1_1);
        al_0.cfr_renamed_1(var1_1, this.var_fl_0_try, this.cfr_renamed_3, this.var_fl_0_new);
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_6() {
        block15: {
            super.cfr_renamed_6();
            if (cj.cfr_renamed_1((int)GameCanvas.boolean_do(cj.var_int_arr_if[0]))) {
                if ((this.soLuong / cj.var_int_arr_if[4] > 0)) {
                    this.soLuong -= cj.var_int_arr_if[4];
                    if ((108 + 63 - 115 + 142 ^ 141 + 23 - 80 + 110) == ((46 + 18 - -24 + 48 ^ 16 + 111 - 9 + 17) & (82 + 95 - 162 + 128 ^ 120 + 94 - 204 + 118 ^ -" ".length()))) {
                        return;
                    }
                }
            } else if (cj.cfr_renamed_1((int)GameCanvas.boolean_do(cj.var_int_arr_if[14]))) {
                if ((this.soLuong % cj.var_int_arr_if[4] > 0)) {
                    this.soLuong -= cj.var_int_arr_if[10];
                    if (" ".length() >= (176 ^ 180)) {
                        return;
                    }
                }
            } else if (cj.cfr_renamed_1((int)GameCanvas.boolean_do(cj.var_int_arr_if[18]))) {
                if ((this.soLuong % cj.var_int_arr_if[4] < cj.var_int_arr_if[0])) {
                    this.soLuong += cj.var_int_arr_if[10];
                    if ("  ".length() > "   ".length()) {
                        return;
                    }
                }
            } else if (cj.cfr_renamed_1((int)GameCanvas.boolean_do(cj.var_int_arr_if[22])) && (this.soLuong / cj.var_int_arr_if[4] < cj.var_int_arr_if[0])) {
                this.soLuong += cj.var_int_arr_if[4];
            }
            if (!cj.cfr_renamed_1((int)GameCanvas.coTrangThai)) break block15;
            var1_1 = cj.var_int_arr_if[8];
            if (("  ".length() & ~"  ".length()) == 0) ** GOTO lbl39
            return;
lbl-1000:
            // 1 sources

            {
                if (cj.cfr_renamed_1((int)GameCanvas.boolean_if(this.cfr_renamed_4 + var1_1 % cj.var_int_arr_if[4] * this.cfr_renamed_6, this.cfr_renamed_2 + var1_1 / cj.var_int_arr_if[4] * this.cfr_renamed_5, this.cfr_renamed_6, this.cfr_renamed_5))) {
                    GameCanvas.coTrangThai = cj.var_int_arr_if[8];
                    this.soLuong = var1_1;
                    return;
                }
                ++var1_1;
lbl39:
                // 2 sources

                ** while (!cj.boolean_do((int)var1_1, (int)this.mangSoNguyen.length))
            }
        }
    }

    public final void cfr_renamed_0() {
        block6: {
            cj cj2 = this;
            if (!(cj2.var_cu_0_do == null)) break block6;
            try {
                int n;
                Image image = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/button.png"));
                if (cj.boolean_if(dF.cfr_renamed_12, var_int_arr_if[0])) {
                    n = var_int_arr_if[1];
                    if ("   ".length() >= (0x7D ^ 0x79)) {
                        return;
                    }
                } else {
                    n = var_int_arr_if[2];
                }
                cj2.var_cu_0_do = new cu_0(image, n, var_int_arr_if[3] * dF.cfr_renamed_12);
                }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if ((131 + 104 - 80 + 44 ^ 12 + 150 - 81 + 114) == " ".length()) {
                return;
            }
            cj2.var_int_if = cj2.var_cu_0_do.soLuong * var_int_arr_if[4] + var_int_arr_if[5] * dF.cfr_renamed_12;
            cj2.cfr_renamed_3 = cj2.var_cu_0_do.cfr_renamed_2 * var_int_arr_if[4] + var_int_arr_if[6] * dF.cfr_renamed_12;
            cj2.cfr_renamed_4 = (GameCanvas.soLuongKhoa - cj2.var_int_if) / var_int_arr_if[0];
            cj2.cfr_renamed_2 = (GameCanvas.var_int_case - cj2.cfr_renamed_3) / var_int_arr_if[0];
            cj2.cfr_renamed_5 = cj2.cfr_renamed_3 / var_int_arr_if[4];
            cj2.cfr_renamed_6 = cj2.var_int_if / var_int_arr_if[4];
            int[] nArray = new int[var_int_arr_if[7]];
            nArray[cj.var_int_arr_if[8]] = var_int_arr_if[9];
            nArray[cj.var_int_arr_if[10]] = var_int_arr_if[11];
            nArray[cj.var_int_arr_if[0]] = var_int_arr_if[12];
            nArray[cj.var_int_arr_if[4]] = var_int_arr_if[13];
            nArray[cj.var_int_arr_if[14]] = var_int_arr_if[15];
            nArray[cj.var_int_arr_if[16]] = var_int_arr_if[17];
            nArray[cj.var_int_arr_if[18]] = var_int_arr_if[19];
            nArray[cj.var_int_arr_if[20]] = var_int_arr_if[21];
            nArray[cj.var_int_arr_if[22]] = var_int_arr_if[23];
            cj2.mangSoNguyen = nArray;
            ((dF)cj2).cfr_renamed_3 = new fl_0(MenuChinhAvatar.cT, var_int_arr_if[8], cj2);
            cj2.var_fl_0_new = new fl_0(MenuChinhAvatar.by, var_int_arr_if[10], cj2);
        }
        GameCanvas.var_dj_0_do = this;
    }

    static {
        cj.cfr_renamed_2();
    }

    public final void cfr_renamed_7() {
    }

            private static boolean boolean_do(int n, int n2) {
        return n >= n2;
    }

    private static void cfr_renamed_2() {
        var_int_arr_if = new int[24];
        cj.var_int_arr_if[0] = "  ".length();
        cj.var_int_arr_if[1] = 0x62 ^ 0x12;
        cj.var_int_arr_if[2] = 0x44 ^ 0x1E ^ (0x23 ^ 0x4D);
        cj.var_int_arr_if[3] = 0x26 ^ 0x36;
        cj.var_int_arr_if[4] = "   ".length();
        cj.var_int_arr_if[5] = 0x3E ^ 0x15 ^ (0x81 ^ 0xB4);
        cj.var_int_arr_if[6] = 0x2F ^ 0x56 ^ (0xD3 ^ 0x96);
        cj.var_int_arr_if[7] = 0x77 ^ 0x7E;
        cj.var_int_arr_if[8] = (111 + 76 - 83 + 25 ^ 19 + 102 - 88 + 136) & (0x93 ^ 0xA0 ^ (0x71 ^ 0x6A) ^ -" ".length());
        cj.var_int_arr_if[9] = 59 + 174 - 2 + 9 ^ 52 + 127 - 111 + 80;
        cj.var_int_arr_if[10] = " ".length();
        cj.var_int_arr_if[11] = -(0xFFFF9B78 & 0x6C9F) & (0xFFFFCFFF & 0x3BFF);
        cj.var_int_arr_if[12] = -(0xFFFF8F6E & 0x78FF) & (0xFFFFAF7D & Short.MAX_VALUE);
        cj.var_int_arr_if[13] = 0xFFFFFFD8 & 0xC377;
        cj.var_int_arr_if[14] = 0x65 ^ 0x61;
        cj.var_int_arr_if[15] = 0xFFFF9FEC & 0x1E6B3;
        cj.var_int_arr_if[16] = 0xDF ^ 0x89 ^ (0xE2 ^ 0xB1);
        cj.var_int_arr_if[17] = -(0xFFFFDEB8 & 0x77CF) & (0xFFFFF7A7 & 0x7FFFF);
        cj.var_int_arr_if[18] = 54 + 71 - 75 + 106 ^ 47 + 26 - -76 + 5;
        cj.var_int_arr_if[19] = 0xFFFFF7E2 & 0xF4A5D;
        cj.var_int_arr_if[20] = 0x78 ^ 0x7F;
        cj.var_int_arr_if[21] = -(0xFFFFBCEF & 0x7398) & (0xFFFFFFFF & 0x4C7BC7);
        cj.var_int_arr_if[22] = 0xCB ^ 0x9F ^ (0x64 ^ 0x38);
        cj.var_int_arr_if[23] = 0xFFFF97E1 & 0x98FE9E;
    }

        public static cj cfr_renamed_1() {
        if ((var_cj_do == null)) {
            var_cj_do = new cj();
            return var_cj_do;
        }
        return var_cj_do;
    }

    private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

    }

