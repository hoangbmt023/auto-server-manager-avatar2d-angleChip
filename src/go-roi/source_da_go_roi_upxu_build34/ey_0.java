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

/*
 * Renamed from eY
 */
public final class ey_0
extends dL {
    private dL var_dL_do;
    public int[] mangSoNguyen;
    public static ey_0 var_ey_0_do;
    private boolean[] var_boolean_arr_do;
    private int var_int_if;
    private int cfr_renamed_3 = var_int_arr_if[0];
    private int cfr_renamed_4;
    public static boolean dangChayAuto;
    private static int[] var_int_arr_if;
    private int cfr_renamed_5;
    public int soLuong;
    private int cfr_renamed_2;
    public static boolean coTrangThai;

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    static {
        ey_0.cfr_renamed_5();
        dangChayAuto = var_int_arr_if[0];
        coTrangThai = var_int_arr_if[0];
    }

    public final void (Graphics graphics == null) {
        this.var_dL_do.cfr_renamed_1(graphics);
        this.cfr_renamed_1(graphics);
        super.cfr_renamed_0(graphics);
    }

    private static boolean boolean_if(int n) {
        return n == 0;
    }

        public ey_0() {
        this.var_int_if = var_int_arr_if[0];
        this.cfr_renamed_4 = var_int_arr_if[1];
        this.soLuong = var_int_arr_if[0];
        this.var_boolean_arr_do = new boolean[this.cfr_renamed_4];
    }

    private static boolean boolean_for(int n) {
        return n < 0;
    }

    private static boolean boolean_if(int n, int n2) {
        return n > n2;
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void void_for(int n) {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        block9: {
            this.soLuong = n;
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(n);
                int n2 = var_int_arr_if[0];
                if (((0x38 ^ 0x10) & ~(0xB8 ^ 0x90)) <= -" ".length()) {
                    return;
                }
                while (true) {
                    if ((n2 >= this.cfr_renamed_4)) {
                        break;
                    }
                    dataOutputStream.writeByte(this.mangSoNguyen[n2]);
                    ++n2;
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                break block9;
            }
            if (" ".length() == 0) {
                return;
            }
        }
        try {
            gc_0.cfr_renamed_0("avatarShowName", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
            }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.cfr_renamed_12();
        dr_0.var_dr_0_do.void_do(n / var_int_arr_if[5]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_15() {
        super.cfr_renamed_15();
        if (ey_0.boolean_do(GameCanvas.boolean_do(var_int_arr_if[6]) ? 1 : 0)) {
            this.cfr_renamed_5(var_int_arr_if[7]);
            } else if (ey_0.boolean_do(GameCanvas.boolean_do(var_int_arr_if[8]) ? 1 : 0)) {
            this.cfr_renamed_5(var_int_arr_if[2]);
            if ((0x40 ^ 0x56 ^ (0x46 ^ 0x54)) <= "   ".length()) {
                return;
            }
        } else if (ey_0.boolean_do(GameCanvas.boolean_do(var_int_arr_if[9]) ? 1 : 0)) {
            this.cfr_renamed_4(var_int_arr_if[7]);
            if (" ".length() == 0) {
                return;
            }
        } else if (ey_0.boolean_do(GameCanvas.boolean_do(var_int_arr_if[10]) ? 1 : 0)) {
            this.cfr_renamed_4(var_int_arr_if[2]);
        }
        if (ey_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0) && ey_0.boolean_do(GameCanvas.boolean_if(k.k_do().cfr_renamed_2, k.k_do().soLuong, k.k_do().cfr_renamed_5, k.k_do().var_int_int) ? 1 : 0)) {
            GameCanvas.coKichHoat = var_int_arr_if[0];
            if (ey_0.boolean_do(GameCanvas.boolean_if(k.k_do().cfr_renamed_2, k.k_do().soLuong, k.k_do().cfr_renamed_5, k.k_do().var_int_int) ? 1 : 0)) {
                int n;
                int n2 = n = (GameCanvas.var_int_if - (k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16)) / this.cfr_renamed_2;
                while (!ey_0.boolean_for(n2)) {
                    if (ey_0.boolean_if(this.var_boolean_arr_do[n2])) {
                        ++n;
                    }
                    --n2;
                }
                if ((n == this.var_int_if)) {
                    if ((this.mangSoNguyen[this.var_int_if] == var_int_arr_if[2])) {
                        this.cfr_renamed_4(var_int_arr_if[7]);
                        if (((0x95 ^ 0xBF) & ~(0x5F ^ 0x75)) >= "  ".length()) {
                            return;
                        }
                    } else {
                        this.cfr_renamed_4(var_int_arr_if[2]);
                    }
                }
                if ((n >= this.cfr_renamed_4)) {
                    n = this.cfr_renamed_4 - var_int_arr_if[2];
                }
                this.var_int_if = n;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_1() {
        this.cfr_renamed_4();
        DataInputStream dataInputStream = ci_0.java_io_DataInputStream_do("avatarShowName");
        dangChayAuto = var_int_arr_if[0];
        if ((dataInputStream == null)) {
            return;
        }
        try {
            this.soLuong = dataInputStream.readByte();
            this.mangSoNguyen = new int[this.cfr_renamed_4];
            int n = var_int_arr_if[0];
            if ((0x91 ^ 0x96 ^ "   ".length()) < "   ".length()) {
                return;
            }
            while (true) {
                if ((n >= this.cfr_renamed_4)) {
                    dataInputStream.close();
                    break;
                }
                this.mangSoNguyen[n] = dataInputStream.readByte();
                if (ey_0.boolean_if(this.mangSoNguyen[n], var_int_arr_if[2])) {
                    this.mangSoNguyen[n] = var_int_arr_if[0];
                }
                ++n;
            }
        }
        catch (Exception exception) {
            ci_0.void_do("avatarShowName");
        }
        this.cfr_renamed_12();
        dr_0.var_dr_0_do.void_do(this.soLuong / var_int_arr_if[5]);
    }

    public final void cfr_renamed_8() {
        this.cfr_renamed_4();
        this.var_dL_do = GameCanvas.var_dL_do;
        super.cfr_renamed_8();
        this.cfr_renamed_1();
    }

        public static ey_0 cfr_renamed_0() {
        if ((var_ey_0_do == null)) {
            var_ey_0_do = new ey_0();
        }
        return var_ey_0_do;
    }

    public final void void_for() {
        this.var_dL_do.void_for();
        if (ey_0.boolean_do(this.cfr_renamed_5)) {
            this.cfr_renamed_5 += -this.cfr_renamed_5 >> var_int_arr_if[2];
            if (ey_0.boolean_for(this.cfr_renamed_5)) {
                this.cfr_renamed_5 = var_int_arr_if[0];
            }
        }
    }

    private static void cfr_renamed_5() {
        var_int_arr_if = new int[18];
        ey_0.var_int_arr_if[0] = (0x3D ^ 0xB ^ (0x38 ^ 0x29)) & (0x52 ^ 0x31 ^ (5 ^ 0x41) ^ -" ".length());
        ey_0.var_int_arr_if[1] = 14 + 126 - 8 + 2 ^ 75 + 47 - 118 + 127;
        ey_0.var_int_arr_if[2] = " ".length();
        ey_0.var_int_arr_if[3] = 3 + 101 - 66 + 138;
        ey_0.var_int_arr_if[4] = "   ".length();
        ey_0.var_int_arr_if[5] = 0x12 ^ 0x18;
        ey_0.var_int_arr_if[6] = "  ".length();
        ey_0.var_int_arr_if[7] = -" ".length();
        ey_0.var_int_arr_if[8] = 0x90 ^ 0x99 ^ " ".length();
        ey_0.var_int_arr_if[9] = 0x1C ^ 0x18;
        ey_0.var_int_arr_if[10] = 0x3B ^ 0x3D;
        ey_0.var_int_arr_if[11] = 0xC4 ^ 0xA0;
        ey_0.var_int_arr_if[12] = 0xC ^ 0x4D;
        ey_0.var_int_arr_if[13] = -(0x6F ^ 0x5D);
        ey_0.var_int_arr_if[14] = 0x49 ^ 0x3A ^ (0x6D ^ 0x2A);
        ey_0.var_int_arr_if[15] = 0x9F ^ 0xAD;
        ey_0.var_int_arr_if[16] = 0x2A ^ 0x25;
        ey_0.var_int_arr_if[17] = 0x1A ^ 3;
    }

    public final void void_do(int n, int n2) {
        switch (n) {
            case 0: {
                ey_0 ey_02 = this;
                ey_02.void_for(ey_02.soLuong);
                ey_02.var_dL_do.cfr_renamed_8();
            }
        }
    }

    private void cfr_renamed_4(int n) {
        if ((this.var_int_if == var_int_arr_if[6])) {
            this.soLuong += n * var_int_arr_if[5];
            if (ey_0.boolean_for(this.soLuong)) {
                this.soLuong = var_int_arr_if[11];
            }
            if (ey_0.boolean_if(this.soLuong, var_int_arr_if[11])) {
                this.soLuong = var_int_arr_if[0];
                return;
            }
        } else {
            if (ey_0.boolean_if(this.mangSoNguyen[this.var_int_if])) {
                this.mangSoNguyen[this.var_int_if] = var_int_arr_if[2];
                return;
            }
            this.mangSoNguyen[this.var_int_if] = var_int_arr_if[0];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics != null) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.translate(var_int_arr_if[0], this.cfr_renamed_5);
        k.k_do().cfr_renamed_0(graphics);
        graphics.translate(GameCanvas.var_int_int - var_int_arr_if[12], k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_16);
        if ((this.cfr_renamed_3 >= var_int_arr_if[9])) {
            this.cfr_renamed_3 = var_int_arr_if[0];
        }
        int n = -bn_0.var_byte_new / var_int_arr_if[6] + this.cfr_renamed_2 / var_int_arr_if[6];
        int n2 = var_int_arr_if[0];
        int n3 = var_int_arr_if[0];
        while (!(n3 >= this.cfr_renamed_4)) {
            if (ey_0.boolean_do(this.var_boolean_arr_do[n3])) {
                GameCanvas.var_ew_try.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][var_int_arr_if[6]], var_int_arr_if[13] * (bn_0.cfr_renamed_6 - var_int_arr_if[2]), n2 + n, var_int_arr_if[0]);
                GameCanvas.var_ew_try.cfr_renamed_0(graphics, MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][this.mangSoNguyen[n3]], var_int_arr_if[14] + var_int_arr_if[15] * bn_0.cfr_renamed_6, n2 + n - var_int_arr_if[2], var_int_arr_if[6]);
                int n4 = var_int_arr_if[0];
                int n5 = GameCanvas.var_ew_try.cfr_renamed_0(MenuChinhAvatar.var_java_lang_String_arr_arr_if[n3][this.mangSoNguyen[n3]]) + var_int_arr_if[5] + var_int_arr_if[16] * (GameCanvas.cfr_renamed_16 + var_int_arr_if[2]) + k.var_ep_do.cfr_renamed_3;
                if (ey_0.boolean_do(n5, var_int_arr_if[17] * bn_0.cfr_renamed_6)) {
                    n5 = var_int_arr_if[17] * bn_0.cfr_renamed_6;
                }
                if ((n3 == this.var_int_if)) {
                    n4 = var_int_arr_if[2];
                }
                int n6 = n2 + n + bn_0.var_byte_new / var_int_arr_if[6] - k.var_ep_do.soLuong / var_int_arr_if[6];
                k.var_ep_do.cfr_renamed_0(n4, var_int_arr_if[14] + var_int_arr_if[15] * bn_0.cfr_renamed_6 - n5 / var_int_arr_if[6], n6, var_int_arr_if[0], graphics);
                k.var_ep_do.cfr_renamed_0(n4, var_int_arr_if[14] + var_int_arr_if[15] * bn_0.cfr_renamed_6 + n5 / var_int_arr_if[6] - k.var_ep_do.cfr_renamed_3, n6, var_int_arr_if[6], graphics);
                n2 += this.cfr_renamed_2;
            }
            ++n3;
        }
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(this.soLuong), var_int_arr_if[14] + var_int_arr_if[15] * bn_0.cfr_renamed_6, var_int_arr_if[6] * this.cfr_renamed_2 + n, var_int_arr_if[6]);
        this.cfr_renamed_3 += var_int_arr_if[2];
    }

    private void cfr_renamed_12() {
        if (ey_0.boolean_do(GameCanvas.var_boolean_int ? 1 : 0)) {
            int n;
            if ((this.mangSoNguyen[var_int_arr_if[4]] == var_int_arr_if[2])) {
                n = var_int_arr_if[2];
                if ("  ".length() <= 0) {
                    return;
                }
            } else {
                n = var_int_arr_if[0];
            }
            coTrangThai = n;
        }
        GameCanvas.cfr_renamed_15();
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_4() {
        block5: {
            this.cfr_renamed_4 = new ei(MenuChinhAvatar.cg, ey_0.var_int_arr_if[0]);
            this.cfr_renamed_2 = dL.cfr_renamed_20;
            this.cfr_renamed_5 = GameCanvas.var_int_char;
            var1_1 = k.var_byte_do + (bn_0.cfr_renamed_16 << ey_0.var_int_arr_if[2]);
            if (!(this.var_boolean_arr_do != null)) break block5;
            var2_2 = ey_0.var_int_arr_if[0];
            if ("   ".length() >= 0) ** GOTO lbl14
            return;
lbl-1000:
            // 1 sources

            {
                if (ey_0.boolean_do(this.var_boolean_arr_do[var2_2])) {
                    var1_1 += this.cfr_renamed_2;
                }
                ++var2_2;
lbl14:
                // 2 sources

                ** while (!ey_0.cfr_renamed_4((int)var2_2, (int)this.var_boolean_arr_do.length))
            }
lbl15:
            // 1 sources

            var2_2 = ey_0.var_int_arr_if[3];
            if (ey_0.boolean_do(GameCanvas.var_int_byte, ey_0.var_int_arr_if[3])) {
                var2_2 = GameCanvas.var_int_byte;
            }
            k.k_do().cfr_renamed_0(MenuChinhAvatar.bN, var2_2 * bn_0.cfr_renamed_6, var1_1, ey_0.var_int_arr_if[2]);
            if (!(GameCanvas.var_dL_do != this)) break block5;
            var1_1 = ey_0.var_int_arr_if[0];
            if ("   ".length() != (166 ^ 176 ^ (138 ^ 152))) ** GOTO lbl27
            return;
lbl-1000:
            // 1 sources

            {
                this.var_boolean_arr_do[var1_1] = ey_0.var_int_arr_if[2];
                ++var1_1;
lbl27:
                // 2 sources

                ** while (!ey_0.cfr_renamed_4((int)var1_1, (int)ey_0.var_int_arr_if[4]))
            }
lbl28:
            // 1 sources

            if (ey_0.boolean_do((int)GameCanvas.var_boolean_int)) {
                this.var_boolean_arr_do[ey_0.var_int_arr_if[4]] = ey_0.var_int_arr_if[2];
            }
            this.mangSoNguyen = new int[this.cfr_renamed_4];
        }
    }

    private void cfr_renamed_5(int n) {
        block3: {
            do {
                this.var_int_if += n;
                if (ey_0.boolean_for(this.var_int_if)) {
                    this.var_int_if = this.cfr_renamed_4 - var_int_arr_if[2];
                }
                if ((this.var_int_if >= this.cfr_renamed_4)) {
                    this.var_int_if = var_int_arr_if[0];
                }
                if (!ey_0.boolean_if(this.var_boolean_arr_do[this.var_int_if])) break block3;
                n /= gc_0.int_if(n);
                } while (((0x2F ^ 0x56 ^ (0x6D ^ 0x42)) & (0x88 ^ 0xA6 ^ (0x17 ^ 0x6F) ^ -" ".length())) == 0);
            return;
        }
    }

    }

