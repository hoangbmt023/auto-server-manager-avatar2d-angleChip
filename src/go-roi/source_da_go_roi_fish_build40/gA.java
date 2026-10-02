/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class gA
extends en {
    private int var_int_if;
    private int cfr_renamed_2;
    public int soLuong;
    public static gA var_gA_do;
    private boolean[] var_boolean_arr_do;
    private int cfr_renamed_3;
    private int cfr_renamed_4 = var_int_arr_if[0];
    public int[] mangSoNguyen;
    private int cfr_renamed_5 = var_int_arr_if[0];
    private static int[] var_int_arr_if;
    private en var_en_do;
    public static boolean dangChayAuto;
    public static boolean coTrangThai;

    private static void cfr_renamed_5() {
        var_int_arr_if = new int[18];
        gA.var_int_arr_if[0] = (0xCF ^ 0x9A) & ~(0xC2 ^ 0x97);
        gA.var_int_arr_if[1] = 0x26 ^ 0x23;
        gA.var_int_arr_if[2] = " ".length();
        gA.var_int_arr_if[3] = (0x2D ^ 0x3D) + (63 + 57 - 76 + 101) - -"  ".length() + (0x51 ^ 0x5C);
        gA.var_int_arr_if[4] = "   ".length();
        gA.var_int_arr_if[5] = 0xB ^ 1;
        gA.var_int_arr_if[6] = "  ".length();
        gA.var_int_arr_if[7] = -" ".length();
        gA.var_int_arr_if[8] = 0x43 ^ 0x4B;
        gA.var_int_arr_if[9] = 0x92 ^ 0x96;
        gA.var_int_arr_if[10] = 0x8A ^ 0x8C;
        gA.var_int_arr_if[11] = 0x52 ^ 0x36;
        gA.var_int_arr_if[12] = "   ".length() ^ (0x75 ^ 0x37);
        gA.var_int_arr_if[13] = -(0x14 ^ 0x26);
        gA.var_int_arr_if[14] = 37 + 1 - -108 + 19 ^ 127 + 118 - 127 + 27;
        gA.var_int_arr_if[15] = 44 + 75 - 91 + 151 ^ 56 + 106 - 78 + 45;
        gA.var_int_arr_if[16] = 0x30 ^ 0x3F;
        gA.var_int_arr_if[17] = 0xF6 ^ 0xBB ^ (0x53 ^ 7);
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                gA gA2 = this;
                gA2.void_do(gA2.soLuong);
                gA2.var_en_do.cfr_renamed_4();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics == null) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.translate(var_int_arr_if[0], this.var_int_if);
        v_0.v_0_do().cfr_renamed_1(graphics);
        graphics.translate(GameCanvas.cfr_renamed_15 - var_int_arr_if[12], v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15);
        if (gA.boolean_if(this.cfr_renamed_4, var_int_arr_if[9])) {
            this.cfr_renamed_4 = var_int_arr_if[0];
        }
        int n = -dF.var_byte_try / var_int_arr_if[6] + this.cfr_renamed_2 / var_int_arr_if[6];
        int n2 = var_int_arr_if[0];
        int n3 = var_int_arr_if[0];
        while (!gA.boolean_if(n3, this.cfr_renamed_3)) {
            if (gA.boolean_do(this.var_boolean_arr_do[n3])) {
                GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][var_int_arr_if[6]], var_int_arr_if[13] * (dF.cfr_renamed_12 - var_int_arr_if[2]), n2 + n, var_int_arr_if[0]);
                GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][this.mangSoNguyen[n3]], var_int_arr_if[14] + var_int_arr_if[15] * dF.cfr_renamed_12, n2 + n - var_int_arr_if[2], var_int_arr_if[6]);
                int n4 = var_int_arr_if[0];
                int n5 = GameCanvas.var_fz_0_try.cfr_renamed_1(MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][this.mangSoNguyen[n3]]) + var_int_arr_if[5] + var_int_arr_if[16] * (GameCanvas.cfr_renamed_12 + var_int_arr_if[2]) + v_0.var_cu_0_if.soLuong;
                if ((n5 < var_int_arr_if[17] * dF.cfr_renamed_12)) {
                    n5 = var_int_arr_if[17] * dF.cfr_renamed_12;
                }
                if ((n3 == this.cfr_renamed_5)) {
                    n4 = var_int_arr_if[2];
                }
                int n6 = n2 + n + dF.var_byte_try / var_int_arr_if[6] - v_0.var_cu_0_if.cfr_renamed_2 / var_int_arr_if[6];
                v_0.var_cu_0_if.cfr_renamed_0(n4, var_int_arr_if[14] + var_int_arr_if[15] * dF.cfr_renamed_12 - n5 / var_int_arr_if[6], n6, var_int_arr_if[0], graphics);
                v_0.var_cu_0_if.cfr_renamed_0(n4, var_int_arr_if[14] + var_int_arr_if[15] * dF.cfr_renamed_12 + n5 / var_int_arr_if[6] - v_0.var_cu_0_if.soLuong, n6, var_int_arr_if[6], graphics);
                n2 += this.cfr_renamed_2;
            }
            ++n3;
        }
        GameCanvas.var_fz_0_try.cfr_renamed_1(graphics, String.valueOf(this.soLuong), var_int_arr_if[14] + var_int_arr_if[15] * dF.cfr_renamed_12, var_int_arr_if[6] * this.cfr_renamed_2 + n, var_int_arr_if[6]);
        this.cfr_renamed_4 += var_int_arr_if[2];
    }

    private void void_if(int n) {
        block3: {
            do {
                this.cfr_renamed_5 += n;
                if (gA.boolean_for(this.cfr_renamed_5)) {
                    this.cfr_renamed_5 = this.cfr_renamed_3 - var_int_arr_if[2];
                }
                if (gA.boolean_if(this.cfr_renamed_5, this.cfr_renamed_3)) {
                    this.cfr_renamed_5 = var_int_arr_if[0];
                }
                if (!gA.boolean_if(this.var_boolean_arr_do[this.cfr_renamed_5])) break block3;
                n /= hg.int_do(n);
                } while (null == null);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_2() {
        block5: {
            this.var_fl_0_try = new fl_0(MenuChinhAvatar.l, gA.var_int_arr_if[0]);
            this.cfr_renamed_2 = en.cfr_renamed_21;
            this.var_int_if = GameCanvas.var_int_case;
            var1_1 = v_0.var_byte_do + (dF.cfr_renamed_15 << gA.var_int_arr_if[2]);
            if (!(this.var_boolean_arr_do != null)) break block5;
            var2_2 = gA.var_int_arr_if[0];
            if (-(51 + 136 - 163 + 151 ^ 134 + 158 - 254 + 133) <= 0) ** GOTO lbl14
            return;
lbl-1000:
            // 1 sources

            {
                if (gA.boolean_do(this.var_boolean_arr_do[var2_2])) {
                    var1_1 += this.cfr_renamed_2;
                }
                ++var2_2;
lbl14:
                // 2 sources

                ** while (!gA.boolean_if((int)var2_2, (int)this.var_boolean_arr_do.length))
            }
lbl15:
            // 1 sources

            var2_2 = gA.var_int_arr_if[3];
            if ((GameCanvas.soLuongKhoa < gA.var_int_arr_if[3])) {
                var2_2 = GameCanvas.soLuongKhoa;
            }
            v_0.v_0_do().cfr_renamed_1(MenuChinhAvatar.bu, var2_2 * dF.cfr_renamed_12, var1_1, gA.var_int_arr_if[2]);
            if (!(GameCanvas.var_en_do != this)) break block5;
            var1_1 = gA.var_int_arr_if[0];
            if (" ".length() <= (85 ^ 59 ^ (171 ^ 193))) ** GOTO lbl27
            return;
lbl-1000:
            // 1 sources

            {
                this.var_boolean_arr_do[var1_1] = gA.var_int_arr_if[2];
                ++var1_1;
lbl27:
                // 2 sources

                ** while (!gA.boolean_if((int)var1_1, (int)gA.var_int_arr_if[4]))
            }
lbl28:
            // 1 sources

            if (gA.boolean_do((int)GameCanvas.dangChayAuto)) {
                this.var_boolean_arr_do[gA.var_int_arr_if[4]] = gA.var_int_arr_if[2];
            }
            this.mangSoNguyen = new int[this.cfr_renamed_3];
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n > n2;
    }

    static {
        gA.cfr_renamed_5();
        coTrangThai = var_int_arr_if[0];
        dangChayAuto = var_int_arr_if[0];
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_do(int n) {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        block8: {
            this.soLuong = n;
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(n);
                int n2 = var_int_arr_if[0];
                while (true) {
                    if (gA.boolean_if(n2, this.cfr_renamed_3)) {
                        break;
                    }
                    dataOutputStream.writeByte(this.mangSoNguyen[n2]);
                    ++n2;
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                break block8;
            }
            if ("  ".length() < ((0x45 ^ 0xE ^ (0x88 ^ 0xA2)) & (0x41 ^ 9 ^ (0x30 ^ 0x19) ^ -" ".length()))) {
                return;
            }
        }
        try {
            hg.cfr_renamed_1("avatarShowName", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.cfr_renamed_8();
        dr_0.var_dr_0_do.void_do(n / var_int_arr_if[5]);
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_3() {
        block8: {
            this.cfr_renamed_2();
            DataInputStream dataInputStream = aa_0.java_io_DataInputStream_do("avatarShowName");
            coTrangThai = var_int_arr_if[0];
            if ((dataInputStream == null)) {
                return;
            }
            try {
                this.soLuong = dataInputStream.readByte();
                this.mangSoNguyen = new int[this.cfr_renamed_3];
                int n = var_int_arr_if[0];
                while (true) {
                    if (gA.boolean_if(n, this.cfr_renamed_3)) {
                        dataInputStream.close();
                        break;
                    }
                    this.mangSoNguyen[n] = dataInputStream.readByte();
                    if (gA.boolean_do(this.mangSoNguyen[n], var_int_arr_if[2])) {
                        this.mangSoNguyen[n] = var_int_arr_if[0];
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                aa_0.void_do("avatarShowName");
                break block8;
            }
            if ("   ".length() <= 0) {
                return;
            }
        }
        this.cfr_renamed_8();
        dr_0.var_dr_0_do.void_do(this.soLuong / var_int_arr_if[5]);
    }

        public final void cfr_renamed_7() {
        this.var_en_do.cfr_renamed_7();
        if (gA.boolean_do(this.var_int_if)) {
            this.var_int_if += -this.var_int_if >> var_int_arr_if[2];
            if (gA.boolean_for(this.var_int_if)) {
                this.var_int_if = var_int_arr_if[0];
            }
        }
    }

    public final void cfr_renamed_4() {
        this.cfr_renamed_2();
        this.var_en_do = GameCanvas.var_en_do;
        super.cfr_renamed_4();
        this.cfr_renamed_3();
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

        /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_6() {
        super.cfr_renamed_6();
        if (gA.boolean_do(GameCanvas.boolean_do(var_int_arr_if[6]) ? 1 : 0)) {
            this.void_if(var_int_arr_if[7]);
            if (((0xEE ^ 0x8D) & ~(0x1F ^ 0x7C)) >= "   ".length()) {
                return;
            }
        } else if (gA.boolean_do(GameCanvas.boolean_do(var_int_arr_if[8]) ? 1 : 0)) {
            this.void_if(var_int_arr_if[2]);
            if (-"  ".length() >= 0) {
                return;
            }
        } else if (gA.boolean_do(GameCanvas.boolean_do(var_int_arr_if[9]) ? 1 : 0)) {
            this.cfr_renamed_4(var_int_arr_if[7]);
            if ("  ".length() <= ((0xE4 ^ 0xB3 ^ (0xFA ^ 0x94)) & (0x68 ^ 0x1B ^ (0x5D ^ 0x17) ^ -" ".length()))) {
                return;
            }
        } else if (gA.boolean_do(GameCanvas.boolean_do(var_int_arr_if[10]) ? 1 : 0)) {
            this.cfr_renamed_4(var_int_arr_if[2]);
        }
        if (gA.boolean_do(GameCanvas.coTrangThai ? 1 : 0) && gA.boolean_do(GameCanvas.boolean_do(v_0.v_0_do().cfr_renamed_5, v_0.v_0_do().cfr_renamed_6, v_0.v_0_do().soLuongKhoa, v_0.v_0_do().var_int_if) ? 1 : 0)) {
            GameCanvas.coTrangThai = var_int_arr_if[0];
            if (gA.boolean_do(GameCanvas.boolean_do(v_0.v_0_do().cfr_renamed_5, v_0.v_0_do().cfr_renamed_6, v_0.v_0_do().soLuongKhoa, v_0.v_0_do().var_int_if) ? 1 : 0)) {
                int n;
                int n2 = n = (GameCanvas.soLuong - (v_0.v_0_do().cfr_renamed_6 + v_0.var_byte_do + dF.cfr_renamed_15)) / this.cfr_renamed_2;
                while (!gA.boolean_for(n2)) {
                    if (gA.boolean_if(this.var_boolean_arr_do[n2])) {
                        ++n;
                    }
                    --n2;
                }
                if ((n == this.cfr_renamed_5)) {
                    if ((this.mangSoNguyen[this.cfr_renamed_5] == var_int_arr_if[2])) {
                        this.cfr_renamed_4(var_int_arr_if[7]);
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_4(var_int_arr_if[2]);
                    }
                }
                if (gA.boolean_if(n, this.cfr_renamed_3)) {
                    n = this.cfr_renamed_3 - var_int_arr_if[2];
                }
                this.cfr_renamed_5 = n;
            }
        }
    }

            private void cfr_renamed_8() {
        if (gA.boolean_do(GameCanvas.dangChayAuto ? 1 : 0)) {
            int n;
            if ((this.mangSoNguyen[var_int_arr_if[4]] == var_int_arr_if[2])) {
                n = var_int_arr_if[2];
                if (-(157 + 169 - 238 + 82 ^ 54 + 150 - 65 + 36) >= 0) {
                    return;
                }
            } else {
                n = var_int_arr_if[0];
            }
            dangChayAuto = n;
        }
        GameCanvas.void_if();
    }

    private void cfr_renamed_4(int n) {
        if ((this.cfr_renamed_5 == var_int_arr_if[6])) {
            this.soLuong += n * var_int_arr_if[5];
            if (gA.boolean_for(this.soLuong)) {
                this.soLuong = var_int_arr_if[11];
            }
            if (gA.boolean_do(this.soLuong, var_int_arr_if[11])) {
                this.soLuong = var_int_arr_if[0];
                return;
            }
        } else {
            if (gA.boolean_if(this.mangSoNguyen[this.cfr_renamed_5])) {
                this.mangSoNguyen[this.cfr_renamed_5] = var_int_arr_if[2];
                return;
            }
            this.mangSoNguyen[this.cfr_renamed_5] = var_int_arr_if[0];
        }
    }

    public final void (Graphics graphics != null) {
        this.var_en_do.cfr_renamed_0(graphics);
        this.cfr_renamed_0(graphics);
        super.cfr_renamed_1(graphics);
    }

    public static gA cfr_renamed_1() {
        if ((var_gA_do == null)) {
            var_gA_do = new gA();
        }
        return var_gA_do;
    }

    public gA() {
        this.cfr_renamed_3 = var_int_arr_if[1];
        this.soLuong = var_int_arr_if[0];
        this.var_boolean_arr_do = new boolean[this.cfr_renamed_3];
    }

    }

