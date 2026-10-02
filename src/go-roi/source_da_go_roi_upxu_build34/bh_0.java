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

/*
 * Renamed from bh
 */
public final class bh_0
implements gj_0 {
    private static ep var_ep_do;
    private static ep var_ep_if;
    private static Image var_javax_microedition_lcdui_Image_do;
    private static Image var_javax_microedition_lcdui_Image_if;
    private static int[] mangSoNguyen;
    private byte var_byte_do;
    private byte var_byte_if;
    private static int soLuong;
    private static ep var_ep_for;
    private static int var_int_if;
    private static ep var_ep_int;
    private static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private static Image var_javax_microedition_lcdui_Image_for;
    private static Image var_javax_microedition_lcdui_Image_int;
    private static int soLuongKhoa;
    private static ep var_ep_new;
    private static Image[] var_javax_microedition_lcdui_Image_arr_if;
    private static ep[] var_ep_arr_do;
    private byte var_byte_for;
    private static byte[][] var_byte_arr_arr_do;
    private static int var_int_int;
    private static int var_int_new;

        /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics == fb fb2) {
        if ((fb2.var_byte_if == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_do, fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
        int n = 0;
        while (!(n >= var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]].length)) {
            int n2;
            if (!bh_0.boolean_do(n2 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++]) || (n2 == 4)) {
                n2 += fb2.cfr_renamed_15;
            }
            if ((fb2.cfr_renamed_15 == null) && (fb2.mangSoNguyen[fb2.cfr_renamed_8] == 11) && (n2 == null)) {
                n2 = 11;
            }
            byte by2 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++];
            byte by3 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++];
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[n2], fb2.cfr_renamed_2 - 27 + by2, fb2.cfr_renamed_5 - 36 + by3, 3);
            if (!(by3 == 30)) continue;
            graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[n2], 0, 0, var_javax_microedition_lcdui_Image_arr_if[n2].getWidth(), var_javax_microedition_lcdui_Image_arr_if[n2].getHeight(), 1, fb2.cfr_renamed_2 + 27 - by2, fb2.cfr_renamed_5 + 36 - by3, 3);
        }
        var_ep_arr_do[fb2.cfr_renamed_4].cfr_renamed_0(fb2.mangSoNguyen[fb2.cfr_renamed_8], fb2.cfr_renamed_2 - 27 + 5, fb2.cfr_renamed_5 - 36 + 7, 0, 3, graphics);
        var_ep_arr_do[fb2.cfr_renamed_4].cfr_renamed_0(fb2.mangSoNguyen[fb2.cfr_renamed_8], fb2.cfr_renamed_2 + 27 - 5, fb2.cfr_renamed_5 + 36 - 7, 3, 3, graphics);
    }

    public final void (Graphics graphics, int n, int n2 != null) {
        graphics.drawImage(bK.var_javax_microedition_lcdui_Image_do, n, n2, 3);
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

        public final void (Graphics graphics != fb fb2) {
        if ((fb2.var_byte_if == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_do, fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
        (graphics != fb2);
    }

    public final void (Graphics graphics != null) {
        graphics.setColor(soLuongKhoa);
        graphics.fillRect(0, GameCanvas.this - GameCanvas.var_int_else + 1, GameCanvas.var_int_byte, GameCanvas.var_int_else);
        graphics.setColor(var_int_int);
        graphics.fillRect(0, GameCanvas.this - GameCanvas.var_int_else, GameCanvas.var_int_byte, 1);
    }

    /*
     * Unable to fully structure code
     */
    public final int int_do() {
        var1_1 = 0;
        if (((29 ^ 75 ^ (236 ^ 140)) & (3 ^ 86 ^ (78 ^ 45) ^ -" ".length())) == 0) ** GOTO lbl9
        return (44 ^ 73 ^ (110 ^ 61)) & (102 ^ 78 ^ (49 ^ 47) ^ -" ".length());
lbl-1000:
        // 1 sources

        {
            if (bh_0.boolean_do((int)GameCanvas.boolean_if(GameCanvas.var_eq_0_arr_do[var1_1].var_int_if, GameCanvas.var_eq_0_arr_do[var1_1].soLuong, dL.cfr_renamed_30, GameCanvas.var_int_else))) {
                return var1_1;
            }
            ++var1_1;
lbl9:
            // 2 sources

            ** while (!bh_0.cfr_renamed_3((int)var1_1, (int)3))
        }
lbl10:
        // 1 sources

        return -1;
    }

            public final void void_do(ei ei2, ei ei3, ei ei4) {
        if (bh_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0)) {
            switch (bh_0.int_do(ei2, ei3, ei4)) {
                case 1: {
                    this.var_byte_for = (byte)1;
                    GameCanvas.coKichHoat = 0;
                    if ("   ".length() == "   ".length()) break;
                    return;
                }
                case 2: {
                    this.var_byte_do = (byte)1;
                    GameCanvas.coKichHoat = 0;
                    if ("  ".length() > 0) break;
                    return;
                }
                case 3: {
                    this.var_byte_if = (byte)1;
                    GameCanvas.coKichHoat = 0;
                }
            }
        }
        if (bh_0.boolean_do(GameCanvas.var_boolean_try ? 1 : 0)) {
            switch (bh_0.int_do(ei2, ei3, ei4)) {
                case 1: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_do = (byte)n;
                    if (null == null) break;
                    return;
                }
                case 2: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_for = (byte)n;
                    if ((0xDD ^ 0xB8 ^ (0x2B ^ 0x4A)) != 0) break;
                    return;
                }
                case 3: {
                    int n = 0;
                    this.var_byte_for = (byte)n;
                    this.var_byte_do = (byte)n;
                    if ("   ".length() == "   ".length()) break;
                    return;
                }
                default: {
                    int n = 0;
                    this.var_byte_if = (byte)n;
                    this.var_byte_for = (byte)n;
                    this.var_byte_do = (byte)n;
                }
            }
        }
        if (bh_0.boolean_do(GameCanvas.var_boolean_new ? 1 : 0)) {
            switch (bh_0.int_do(ei2, ei3, ei4)) {
                case 1: {
                    if (!(this.var_byte_for == 1)) break;
                    ei2.cfr_renamed_1();
                    GameCanvas.var_boolean_new = 0;
                    this.var_byte_for = (byte)0;
                    return;
                }
                case 2: {
                    if (!(this.var_byte_do == 1)) break;
                    this.var_byte_do = (byte)0;
                    ei3.cfr_renamed_1();
                    GameCanvas.var_boolean_new = 0;
                    return;
                }
                case 3: {
                    if (!(this.var_byte_if == 1)) break;
                    this.var_byte_if = (byte)0;
                    ei4.cfr_renamed_1();
                    GameCanvas.var_boolean_new = 0;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public bh_0() {
        super();
        try {
            Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/12Plus.png"));
            }
        catch (IOException v0) {
            v0.printStackTrace();
        }
        if ((120 ^ 124) <= 0) {
            throw null;
        }
        ap.void_do(MenuChinhAvatar.cq);
        DuLieuNguoiChoi.var_ep_do = ep.cfr_renamed_0("5", 50, 48);
        DuLieuNguoiChoi.var_ep_for = ep.cfr_renamed_0("2", 11, 10);
        GameCanvas.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("transtab");
        bq_0.var_javax_microedition_lcdui_Image_arr_do[0] = ap.javax_microedition_lcdui_Image_do("s1");
        bq_0.var_javax_microedition_lcdui_Image_arr_do[1] = ap.javax_microedition_lcdui_Image_do("s2");
        k.var_ep_if = ep.cfr_renamed_0("arrowup", 9, 6);
        h_0.var_ep_do = ep.cfr_renamed_0("busy", 16, 16);
        u_0.var_ep_do = ep.cfr_renamed_0("cmd", 24, 24);
        fe_0.var_javax_microedition_lcdui_Image_do = ap.javax_microedition_lcdui_Image_do("bar");
        fe_0.var_javax_microedition_lcdui_Image_if = ap.javax_microedition_lcdui_Image_do("arF");
        ep.cfr_renamed_0("icon", 17, 19);
        DuLieuNguoiChoi.var_ep_if = new ep(ap.javax_microedition_lcdui_Image_do("dauhoathi"), 9, 9);
        bh_0.var_ep_if = ep.cfr_renamed_0("check", 12, 12);
        gx.var_ep_do = ep.cfr_renamed_0("tb", 4, 19);
        bh_0.var_ep_int = ep.cfr_renamed_0("round", 8, 8);
        k.var_ep_do = ep.cfr_renamed_0("ar2", 4, 6);
        bh_0.var_ep_for = new ep(ap.javax_microedition_lcdui_Image_do("arW"), 6, 11);
        var1_1 = 0;
        if ("   ".length() >= 0) ** GOTO lbl43
        throw null;
lbl-1000:
        // 1 sources

        {
            fw.var_javax_microedition_lcdui_Image_arr_do[var1_1] = ap.javax_microedition_lcdui_Image_do("cl" + var1_1);
            ++var1_1;
lbl43:
            // 2 sources

            ** while (!bh_0.cfr_renamed_3((int)var1_1, (int)2))
        }
lbl44:
        // 1 sources

        ap.cfr_renamed_0();
        try {
            dL.cfr_renamed_2 = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/msg0.on"));
            gp_0.var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/stat.on")), 11, 11);
            return;
        }
        catch (IOException v1) {
            v1.printStackTrace();
            return;
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, gx gx2, boolean bl != null) {
        if (bh_0.boolean_do(bl ? 1 : 0)) {
            gx.var_ep_do.cfr_renamed_0(2, n + 1, n2 + 1, 0, graphics);
            gx.var_ep_do.cfr_renamed_0(3, n + n3 - 5, n2 + 1, 0, graphics);
            k.cfr_renamed_0(n + 4, n2 + 1, n3 - 8, 2, 2716523, graphics);
            graphics.fillRect(n + 4, n2 + 18, n3 - 8, 2);
            k.cfr_renamed_0(n + 4, n2 + 3, n3 - 8, 1, 2704964, graphics);
            k.cfr_renamed_0(n + 4, n2 + 4, n3 - 8, 1, 5014141, graphics);
            k.cfr_renamed_0(n + 4, n2 + 5, n3 - 8, 13, 6201499, graphics);
            if (-" ".length() >= 0) {
                return;
            }
        } else {
            gx.var_ep_do.cfr_renamed_0(0, n + 1, n2 + 1, 0, graphics);
            gx.var_ep_do.cfr_renamed_0(1, n + n3 - 5, n2 + 1, 0, graphics);
            k.cfr_renamed_0(n + 4, n2 + 2, n3 - 9, 1, 11074288, graphics);
            graphics.fillRect(n + 4, n2 + 18, n3 - 9, 1);
            k.cfr_renamed_0(n + 4, n2 + 3, n3 - 9, 1, 2704964, graphics);
            k.cfr_renamed_0(n + 4, n2 + 4, n3 - 9, 1, 5014141, graphics);
            k.cfr_renamed_0(n + 4, n2 + 5, n3 - 9, 13, 6201499, graphics);
        }
        graphics.setClip(n + 3, n2 + 1, n3 - 8, n4 - 2);
        graphics.setColor(0);
        if (bh_0.boolean_do(gx2.tenNhanVat.equals("") ? 1 : 0)) {
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, gx2.chuoiGiaTri, 5 + gx2.soLuong + n, n2 + (n4 - bn_0.cfr_renamed_15) / 2, 0);
            if (-" ".length() > 0) {
                return;
            }
        } else {
            GameCanvas.var_ew_if.cfr_renamed_0(graphics, gx2.tenNhanVat, 5 + gx2.soLuong + n, n2 + (n4 - bn_0.cfr_renamed_15) / 2 + 1, 0);
        }
        if (bh_0.boolean_do(gx2.boolean_do() ? 1 : 0) && (gx2.cfr_renamed_2 == null) && (!(gx2.cfr_renamed_11 <= 0) || (gx2.cfr_renamed_10 / 5 % 2 == null))) {
            graphics.setColor(16777215);
            graphics.fillRect(5 + gx2.soLuong + n + GameCanvas.var_ew_if.cfr_renamed_0(gx2.tenNhanVat.substring(0, gx2.cfr_renamed_18)) - 1 + 1, n2 + (n4 - gx.cfr_renamed_8) / 2 + 2, 1, n4 - 5 * bn_0.cfr_renamed_6);
        }
        if (bh_0.boolean_do(bl ? 1 : 0) && (GameCanvas.int_if() - gx.cfr_renamed_15 == 2)) {
            int n5 = GameCanvas.var_ew_try.cfr_renamed_0(gx.var_java_lang_String_arr_do[gx.var_int_if]);
            graphics.setClip(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char);
            k.cfr_renamed_0(n + n3 - n5 - 4, n2 + 4, n5 + 1, n4 - 6, 8969676, graphics);
            k.cfr_renamed_0(n + n3 - n5 - 4, n2 + 4, n5 + 1, 1, 5614233, graphics);
            GameCanvas.var_ew_try.cfr_renamed_0(graphics, gx.var_java_lang_String_arr_do[gx.var_int_if], n + n3 - 3, n2 + 3, 1);
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3 != null) {
        if ((bn_0.cfr_renamed_6 == 1)) {
            graphics.setColor(soLuongKhoa);
            graphics.fillRect(0, n + 1, n2, n3 - n + 1);
            return;
        }
        graphics.setColor(soLuongKhoa);
        graphics.fillRect(0, n + 1, n2, n3 - n + 2);
    }

    public final void void_do(int n) {
        try {
            if ((n == null)) {
                e.var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgBan2.on")), 60, 46);
                return;
            }
            if ((n == 1)) {
                e.var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgBan4.on")), 60, 46);
                return;
            }
            e.var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgBan5.on")), 60, 46);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void void_do() {
        try {
            var_ep_new = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgDoor.on")), 45, 44);
            new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/trangthai.on")), 11, 4);
            e.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgSelectban.on"));
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

        static {
        bh_0.cfr_renamed_11();
        byte[][] byArrayArray = new byte[13][];
        byte[] byArray = new byte[9];
        byArray[0] = 4;
        byArray[1] = 6;
        byArray[2] = 17;
        byArray[4] = 27;
        byArray[5] = 14;
        byArray[7] = 27;
        byArray[8] = 36;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[9];
        byArray2[0] = 4;
        byArray2[1] = 6;
        byArray2[2] = 17;
        byArray2[4] = 17;
        byArray2[5] = 13;
        byArray2[7] = 37;
        byArray2[8] = 13;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[12];
        byArray3[0] = 4;
        byArray3[1] = 6;
        byArray3[2] = 17;
        byArray3[4] = 17;
        byArray3[5] = 13;
        byArray3[7] = 37;
        byArray3[8] = 13;
        byArray3[10] = 27;
        byArray3[11] = 36;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[15];
        byArray4[0] = 4;
        byArray4[1] = 6;
        byArray4[2] = 17;
        byArray4[4] = 17;
        byArray4[5] = 13;
        byArray4[7] = 37;
        byArray4[8] = 13;
        byArray4[10] = 17;
        byArray4[11] = 36;
        byArray4[13] = 37;
        byArray4[14] = 36;
        byArrayArray[3] = byArray4;
        byte[] byArray5 = new byte[18];
        byArray5[0] = 4;
        byArray5[1] = 6;
        byArray5[2] = 17;
        byArray5[4] = 17;
        byArray5[5] = 13;
        byArray5[7] = 37;
        byArray5[8] = 13;
        byArray5[10] = 17;
        byArray5[11] = 36;
        byArray5[13] = 37;
        byArray5[14] = 36;
        byArray5[16] = 27;
        byArray5[17] = 30;
        byArrayArray[4] = byArray5;
        byte[] byArray6 = new byte[15];
        byArray6[0] = 4;
        byArray6[1] = 6;
        byArray6[2] = 17;
        byArray6[4] = 17;
        byArray6[5] = 13;
        byArray6[7] = 37;
        byArray6[8] = 13;
        byArray6[10] = 17;
        byArray6[11] = 28;
        byArray6[13] = 37;
        byArray6[14] = 28;
        byArrayArray[5] = byArray6;
        byte[] byArray7 = new byte[18];
        byArray7[0] = 4;
        byArray7[1] = 6;
        byArray7[2] = 17;
        byArray7[4] = 17;
        byArray7[5] = 13;
        byArray7[7] = 37;
        byArray7[8] = 13;
        byArray7[10] = 17;
        byArray7[11] = 28;
        byArray7[13] = 37;
        byArray7[14] = 28;
        byArray7[16] = 27;
        byArray7[17] = 36;
        byArrayArray[6] = byArray7;
        byte[] byArray8 = new byte[18];
        byArray8[0] = 4;
        byArray8[1] = 6;
        byArray8[2] = 17;
        byArray8[4] = 17;
        byArray8[5] = 13;
        byArray8[7] = 37;
        byArray8[8] = 13;
        byArray8[10] = 17;
        byArray8[11] = 28;
        byArray8[13] = 37;
        byArray8[14] = 28;
        byArray8[16] = 27;
        byArray8[17] = 20;
        byArrayArray[7] = byArray8;
        byte[] byArray9 = new byte[6];
        byArray9[0] = 4;
        byArray9[1] = 6;
        byArray9[2] = 17;
        byArray9[3] = 8;
        byArray9[4] = 27;
        byArray9[5] = 36;
        byArrayArray[8] = byArray9;
        byte[] byArray10 = new byte[6];
        byArray10[0] = 4;
        byArray10[1] = 6;
        byArray10[2] = 17;
        byArray10[3] = 9;
        byArray10[4] = 27;
        byArray10[5] = 36;
        byArrayArray[9] = byArray10;
        byte[] byArray11 = new byte[6];
        byArray11[0] = 4;
        byArray11[1] = 6;
        byArray11[2] = 17;
        byArray11[3] = 10;
        byArray11[4] = 27;
        byArray11[5] = 36;
        byArrayArray[10] = byArray11;
        byte[] byArray12 = new byte[6];
        byArray12[0] = 4;
        byArray12[1] = 6;
        byArray12[2] = 17;
        byArray12[4] = 27;
        byArray12[5] = 36;
        byArrayArray[11] = byArray12;
        byte[] byArray13 = new byte[6];
        byArray13[0] = 4;
        byArray13[1] = 6;
        byArray13[2] = 17;
        byArray13[4] = 27;
        byArray13[5] = 14;
        byArrayArray[12] = byArray13;
        var_byte_arr_arr_do = byArrayArray;
        int[] nArray = new int[6];
        nArray[0] = 6201499;
        nArray[1] = 2378578;
        nArray[2] = 8705740;
        nArray[3] = 2716523;
        nArray[4] = 16701696;
        nArray[5] = 7042560;
        k.mangSoNguyen = nArray;
        soLuong = 0;
        var_int_new = 35217;
        soLuongKhoa = 32382;
        var_int_if = 23135;
        var_int_int = 14414578;
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, String string, int n8, int n9 != null) {
        int n10 = n % n2 * n3;
        n2 = (n / n2 + 1) * n3;
        n3 = n10 + n3 / 2;
        graphics.setClip(n3 - n4 / 2, n2, n4, n5);
        n10 = (n5 - (bn_0.cfr_renamed_16 << 1)) / 4;
        this.cfr_renamed_0(graphics, n3 - n4 / 2, n2, n4, n5, 0);
        n2 += bn_0.cfr_renamed_16 + 8;
        if ((n6 == 1)) {
            ((ff)ak_0.var_java_util_Vector_if.elementAt(n)).cfr_renamed_0(graphics, n3, n2 + n10 / 2);
            if (-(0x1A ^ 0x1E) > 0) {
                return;
            }
        } else {
            ak_0.var_dY_arr_do[n].cfr_renamed_0(graphics, 7, n3, n2 + n10 / 2, 3);
        }
        GameCanvas.var_ew_byte.cfr_renamed_0(graphics, String.valueOf(n7), n3, n2 + n10 / 2 + n10 - 2, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(string), n3, n2 + n10 / 2 + (n10 << 1), 2);
        n = n2 + n10 / 2 + n10 + bn_0.var_byte_new / 2;
        var_ep_for.cfr_renamed_0(n8 / 3, n3 - 17, n + 1, 2, 3, graphics);
        var_ep_for.cfr_renamed_0(n9 / 3, n3 - 17 + 35, n, 0, 3, graphics);
    }

    public final void cfr_renamed_1() {
        dL.cfr_renamed_20 = GameCanvas.var_int_char / 12;
        dL.cfr_renamed_19 = GameCanvas.var_int_char / 18;
        if ((dL.cfr_renamed_19 == 18)) {
            dL.cfr_renamed_19 = 18;
        }
        if ((dL.cfr_renamed_19 > 45)) {
            dL.cfr_renamed_19 = 45;
        }
        if (bh_0.boolean_do(GameCanvas.coTrangThai ? 1 : 0)) {
            dL.cfr_renamed_19 = 35;
        }
        int n = GameCanvas.var_int_else = dL.cfr_renamed_19;
        if (!(dL.cfr_renamed_20 >= 20) || !(GameCanvas.gameCanvas != null) || (GameCanvas.coTrangThai ? 1 : 0 == null)) {
            dL.cfr_renamed_20 = 20;
        }
        if ((dL.cfr_renamed_20 > 50)) {
            dL.cfr_renamed_20 = 50;
        }
        dL.cfr_renamed_30 = GameCanvas.var_int_byte / 4;
        GameCanvas.var_eq_0_arr_do[0] = new eq_0(2, GameCanvas.var_int_char - n, 2);
        GameCanvas.var_eq_0_arr_do[1] = new eq_0(GameCanvas.var_int_int - dL.cfr_renamed_30 / 2, GameCanvas.var_int_char - n, 2);
        GameCanvas.var_eq_0_arr_do[2] = new eq_0(GameCanvas.var_int_byte - dL.cfr_renamed_30 - 2, GameCanvas.var_int_char - n, 2);
        GameCanvas.var_eq_0_do = new eq_0(GameCanvas.var_int_byte - 2, 1, 1);
    }

        /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int[] var13_13, int[] var14_14, String var15_15 != null) {
        GameCanvas.cfr_renamed_1(var1_1);
        this.cfr_renamed_0(var1_1, var2_2, var3_3, var5_5, var4_4, k.mangSoNguyen[0], k.mangSoNguyen[1], 0);
        var16_16 = var7_7;
        if (-" ".length() == -" ".length()) ** GOTO lbl23
        return;
lbl-1000:
        // 1 sources

        {
            v0 = var16_16;
            var13_13[v0] = var13_13[v0] + 1;
            if ((var13_13[var16_16] > 20)) {
                var13_13[var16_16] = 0;
            }
            var17_17 = var14_14[var16_16];
            if ((k.k_do().var_int_arr_for[var16_16] > 5)) {
                var17_17 = 0;
            }
            var18_18 = var16_16 - var7_7;
            bh_0.var_ep_int.cfr_renamed_0(var17_17 + 4, var2_2 + 3 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            k.cfr_renamed_0(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, var10_10 - 2, k.mangSoNguyen[2 + var17_17 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, var9_9 - 1, var10_10);
            k.cfr_renamed_0(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 1, k.mangSoNguyen[3 + var17_17 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, 1, var10_10 + 1);
            var1_1.fillRect(var2_2 + 2 + var9_9 + var18_18 * var8_8, var3_3 + 11, 1, var10_10 + 1);
            ++var16_16;
lbl23:
            // 2 sources

            ** while (!bh_0.cfr_renamed_3((int)var16_16, (int)var6_6))
        }
lbl24:
        // 1 sources

        var16_16 = var11_11;
        if ((var11_11 >= var12_12)) {
            var16_16 = var12_12 + var7_7;
        }
        var17_17 = var16_16 - 1;
        if (-" ".length() <= -" ".length()) ** GOTO lbl49
        return;
lbl-1000:
        // 1 sources

        {
            v1 = var17_17;
            var13_13[v1] = var13_13[v1] + 1;
            if ((var13_13[var17_17] > 20)) {
                var13_13[var17_17] = 0;
            }
            var11_11 = var14_14[var17_17];
            if ((var13_13[var17_17] > 5)) {
                var11_11 = 0;
            }
            var18_18 = var17_17 - var7_7;
            if ((var17_17 == var6_6)) {
                bh_0.var_ep_int.cfr_renamed_0(var11_11 + 4, var2_2 + 3 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            }
            bh_0.var_ep_int.cfr_renamed_0(var11_11 + 5, var2_2 + 3 + var9_9 - 8 + var18_18 * var8_8, var3_3 + 3, 0, var1_1);
            k.cfr_renamed_0(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 8, k.mangSoNguyen[2 + var11_11 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, var9_9 - 1, 15);
            k.cfr_renamed_0(var2_2 + 11 + var18_18 * var8_8, var3_3 + 3, var9_9 - 16, 1, k.mangSoNguyen[3 + var11_11 / 2], var1_1);
            var1_1.fillRect(var2_2 + 3 + var18_18 * var8_8, var3_3 + 11, 1, 20);
            var1_1.fillRect(var2_2 + 2 + var9_9 + var18_18 * var8_8, var3_3 + 11, 1, 15);
            --var17_17;
lbl49:
            // 2 sources

            ** while (!bh_0.cfr_renamed_0((int)var17_17, (int)var6_6))
        }
lbl50:
        // 1 sources

        this.cfr_renamed_0(var1_1, var2_2 + 3, var3_3 + var10_10, var5_5 - 6, var4_4 - var10_10 - 3, k.mangSoNguyen[2], k.mangSoNguyen[3], 1);
        k.cfr_renamed_0(var2_2 + 4 + (var6_6 - var7_7) * var8_8, var3_3 + var10_10 / 2, var9_9 - 2, var10_10, k.mangSoNguyen[2], var1_1);
        GameCanvas.var_ew_try.cfr_renamed_0(var1_1, var15_15, var2_2 + 3 + var9_9 / 2 + (var6_6 - var7_7) * var8_8, var3_3 + var10_10 / 2 - bn_0.var_byte_new / 2, 2);
    }

    public final void cfr_renamed_3() {
        bn_0.cfr_renamed_16 = 5;
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5 != null) {
        this.cfr_renamed_0(graphics, n, n2, n3, n4, k.mangSoNguyen[n5], k.mangSoNguyen[n5 + 1], 0);
        this.cfr_renamed_0(graphics, n + 3, n2 + 3, n3 - 6, n4 - 6, k.mangSoNguyen[2], k.mangSoNguyen[3], 1);
    }

            /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics, int n, int n2, int n3, boolean bl, int n4, int[] nArray != null) {
        int n5;
        void var7_9;
        int n6;
        void var6_8;
        GameCanvas.var_ew_case.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bZ) + (int)var6_8, GameCanvas.var_int_int, GameCanvas.var_int_long + n * n3 / 2 - 20, 2);
        graphics.translate(GameCanvas.var_int_int - (n * n2 + 10) / 2 + 4, GameCanvas.var_int_long - n * n3 / 2 + 4);
        graphics.setClip(0, 3, n * n2 + 2, n * n3 - 32);
        graphics.translate(1, -ex.cfr_renamed_18);
        if ((bl ? 1 : 0 == null)) {
            GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, (int)(var6_8 % n2 * n), (int)(var6_8 / n2 * n), n, n);
        }
        if (bh_0.cfr_renamed_2(n6 = (n3 = ex.cfr_renamed_18 / n * n2) + n * 7 / n * n2 + n2, ((void)var7_9).length)) {
            n5 = ((void)var7_9).length;
        }
        while (!(n3 >= n5)) {
            gp_0.var_ep_do.cfr_renamed_0((int)var7_9[n3], n3 % n2 * n + n / 2, n3 / n2 * n + n / 2, 0, 3, graphics);
            ++n3;
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 != null) {
        String string;
        graphics.setColor(12442838);
        int n5 = 0;
        int n6 = 30;
        if ((n > 0)) {
            n6 = 50;
            n5 = 40;
        }
        graphics.fillRect(4, k.var_byte_do + 20 + bn_0.cfr_renamed_15 / 2 + n5 - n6 / 2, k.k_do().cfr_renamed_5 - 8, n6);
        if ((n2 == 1)) {
            string = MenuChinhAvatar.var_java_lang_String_arr_void[0];
            if ("   ".length() <= -" ".length()) {
                return;
            }
        } else {
            string = MenuChinhAvatar.var_java_lang_String_arr_void[1];
        }
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, string, k.k_do().cfr_renamed_5 / 2, k.var_byte_do + 20, 2);
        k.var_ep_if.cfr_renamed_0(0, k.k_do().cfr_renamed_5 / 2 - 35 - n3 / 2, k.var_byte_do + 20 + bn_0.cfr_renamed_15 / 2 + n5, 4, 3, graphics);
        k.var_ep_if.cfr_renamed_0(0, k.k_do().cfr_renamed_5 / 2 + 35 + n4 / 2, k.var_byte_do + 20 + bn_0.cfr_renamed_15 / 2 + n5, 7, 3, graphics);
        AngelChip.duLieuNguoiChoi.cfr_renamed_0(graphics, k.k_do().cfr_renamed_5 / 2 + 1, k.var_byte_do + 87, 0);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.bm) + AngelChip.duLieuNguoiChoi.chuoiGiaTri, k.k_do().cfr_renamed_5 / 2, k.var_byte_do + 100, 2);
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.aF) + AngelChip.duLieuNguoiChoi.var_java_lang_String_int, k.k_do().cfr_renamed_5 / 2, k.var_byte_do + 115, 2);
    }

    public final void cfr_renamed_4() {
        int[] nArray = new int[6];
        nArray[0] = 6201499;
        nArray[1] = 2378578;
        nArray[2] = 8705740;
        nArray[3] = 2716523;
        nArray[4] = 16701696;
        nArray[5] = 7042560;
        k.mangSoNguyen = nArray;
        ap.void_do(MenuChinhAvatar.cq);
        var_ep_int = ep.cfr_renamed_0("round", 8, 8);
        ap.cfr_renamed_0();
        var_javax_microedition_lcdui_Image_for = null;
        var_ep_do = null;
        t_0.var_t_0_do = null;
        bB.var_bB_do = null;
        bm.var_bm_do = null;
        bK.var_bK_do = null;
        a_0.var_a_0_do = null;
        al_0.var_a_0_do = null;
    }

        public final void (Graphics graphics, int n, int n2, int n3, int n4 == null) {
        graphics.setColor(14279153);
        graphics.fillRect(n, n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        var2_2 = 0;
        if ("  ".length() > 0) ** GOTO lbl15
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = 0;
            if (" ".length() != 0) ** GOTO lbl13
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_for, var2_2 * 50, var3_3 * 71, 0);
                ++var3_3;
lbl13:
                // 2 sources

                ** while (!bh_0.cfr_renamed_3((int)var3_3, (int)(GameCanvas.this / 71 + 1)))
            }
lbl14:
            // 1 sources

            ++var2_2;
lbl15:
            // 2 sources

            ** while (!bh_0.cfr_renamed_3((int)var2_2, (int)(GameCanvas.var_int_byte / 50 + 1)))
        }
lbl16:
        // 1 sources

    }

    public final void (Graphics graphics, int n, int n2, int n3, boolean bl != null) {
        int n4 = 0;
        if ((n3 == 2)) {
            n4 = 1;
        }
        var_ep_if.cfr_renamed_0(n4, n, n2 + bn_0.var_byte_new / 2, 0, graphics);
        if (bh_0.boolean_do(bl ? 1 : 0)) {
            var_ep_if.cfr_renamed_0(2, n, n2 + bn_0.var_byte_new / 2, 0, graphics);
        }
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, MenuChinhAvatar.cP, n + 15, n2 + bh_0.var_ep_if.soLuong / 2, 0);
    }

    public final void (Graphics graphics, int n, int n2, int n3 == null) {
        graphics.setColor(var_int_new);
        graphics.fillRect(2, n, n2, n3);
    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1, int var2_2, int var3_3, int var4_4, int var5_5 >= 0) {
        block4: {
            var6_6 = bh_0.var_javax_microedition_lcdui_Image_arr_do[0].getWidth();
            var7_7 = bh_0.var_javax_microedition_lcdui_Image_arr_do[0].getHeight();
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[0], var2_2, var3_3, 0);
            var8_8 = 1;
            if (null == null) ** GOTO lbl11
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[1], var2_2 + var6_6 * var8_8, var3_3, 0);
                ++var8_8;
lbl11:
                // 2 sources

                ** while (!bh_0.cfr_renamed_3((int)var8_8, (int)(var4_4 / var6_6 - 1)))
            }
lbl12:
            // 1 sources

            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[1], var2_2 + var4_4 - (var6_6 << 1), var3_3, 0);
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[2], var2_2 + var4_4 - var6_6, var3_3, 0);
            if (!(var5_5 / var7_7 > 2)) break block4;
            var8_8 = 1;
            if (-" ".length() <= 0) ** GOTO lbl23
            return;
lbl-1000:
            // 1 sources

            {
                var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var7_7 * var8_8, 0);
                var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var7_7 * var8_8, 0);
                ++var8_8;
lbl23:
                // 2 sources

                ** while (!bh_0.cfr_renamed_3((int)var8_8, (int)(var5_5 / var7_7)))
            }
lbl24:
            // 1 sources

            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var5_5 - (var7_7 << 1), 0);
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var5_5 - (var7_7 << 1), 0);
        }
        if ((var5_5 >  (var7_7 << 1) - 20) && (var5_5 != var7_7 * 3)) {
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[3], var2_2, var3_3 + var5_5 / 2 - var7_7 / 2, 0);
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[4], var2_2 + var4_4 - var6_6, var3_3 + var5_5 / 2 - var7_7 / 2, 0);
        }
        var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[5], var2_2, var3_3 + var5_5 - var7_7, 0);
        var8_8 = 1;
        if (-" ".length() < ((54 ^ 118) & ~(245 ^ 181))) ** GOTO lbl38
        return;
lbl-1000:
        // 1 sources

        {
            var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[6], var2_2 + var6_6 * var8_8, var3_3 + var5_5 - var7_7, 0);
            ++var8_8;
lbl38:
            // 2 sources

            ** while (!bh_0.cfr_renamed_3((int)var8_8, (int)(var4_4 / var6_6 - 1)))
        }
lbl39:
        // 1 sources

        var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[6], var2_2 + var4_4 - (var6_6 << 1), var3_3 + var5_5 - var7_7, 0);
        var1_1.drawImage(bh_0.var_javax_microedition_lcdui_Image_arr_do[7], var2_2 + var4_4 - var6_6, var3_3 + var5_5 - var7_7, 0);
        var1_1.setColor(bh_0.var_int_if);
        var1_1.fillRect(var2_2 + 10, var3_3 + 10, var4_4 - 20, var5_5 - 20);
    }

    public final void (Graphics graphics >= 0) {
        int n = 0;
        if (!(GameCanvas.var_dL_do != ThongTinNhanVat.instance) || (GameCanvas.var_dL_do == fw.var_fw_do)) {
            n = 14;
        }
        if ((dL.cfr_renamed_22 > 0) && (GameCanvas.var_bt_0_do == null)) {
            graphics.drawImage(dL.cfr_renamed_2, GameCanvas.var_int_byte - 8 * bn_0.cfr_renamed_6 - 2, n + 2, 17);
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, "" + dL.cfr_renamed_22, GameCanvas.var_int_byte - 16 * bn_0.cfr_renamed_6 - 4, 1 + 6 * bn_0.cfr_renamed_6 - bn_0.var_byte_try / 2 + n, 1);
        }
        if ((dL.cfr_renamed_4 != null) && bh_0.boolean_do(GameCanvas.boolean_do() ? 1 : 0)) {
            graphics.drawImage(dL.cfr_renamed_4, 25, 25, 3);
            if ((AngelChip.var_int_if == 9)) {
                graphics.drawImage(dL.cfr_renamed_15, 75, 25, 3);
            }
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3 >= 0) {
        graphics.setColor(15530985);
        graphics.fillRect(0, n, n2, n3);
    }

    public final void (Graphics graphics, String string, int n, int n2, int n3 != null) {
        GameCanvas.var_ew_try.cfr_renamed_0(graphics, string, n, n2, n3);
    }

    public final void cfr_renamed_5() {
        int n = GameCanvas.var_int_char;
        eq_0[] eq_0Array = new eq_0[4];
        eq_0Array[0] = new eq_0(GameCanvas.var_int_int + 5, 5, 0);
        eq_0Array[1] = new eq_0(5, n / 2, 0);
        eq_0Array[2] = new eq_0(GameCanvas.var_int_int + 5, n - 50, 0);
        eq_0Array[3] = new eq_0(GameCanvas.var_int_byte - 5, n / 2, 1);
        eq_0[] eq_0Array2 = new eq_0[4];
        eq_0Array2[0] = new eq_0(GameCanvas.var_int_int, 2, 3);
        eq_0Array2[1] = new eq_0(10, n / 2, 20);
        eq_0Array2[2] = new eq_0(GameCanvas.var_int_int - 10, n - 75 - dL.cfr_renamed_19, 3);
        eq_0Array2[3] = new eq_0(GameCanvas.var_int_byte - 60, n / 2, 3);
        int n2 = GameCanvas.var_int_char - 24;
        n = n - 15 - GameCanvas.var_int_else;
        if ((GameCanvas.var_int_byte == 200)) {
            eq_0[] eq_0Array3 = new eq_0[4];
            eq_0Array3[0] = new eq_0(GameCanvas.var_int_int, a_0.var_int_byte / 2, 0);
            eq_0Array3[1] = new eq_0(a_0.var_int_int / 2, n2 / 2, 0);
            eq_0Array3[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte + 20, 0);
            eq_0Array3[3] = new eq_0(GameCanvas.var_int_byte - a_0.var_int_int / 2 - 3, n2 / 2, 0);
            bm.var_eq_0_arr_for = eq_0Array3;
            eq_0[] eq_0Array4 = new eq_0[4];
            eq_0Array4[0] = new eq_0(GameCanvas.var_int_int, a_0.var_int_byte, 0);
            eq_0Array4[1] = new eq_0(a_0.var_int_int + 3, n2 / 2, 0);
            eq_0Array4[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte / 2 + 20, 0);
            eq_0Array4[3] = new eq_0(GameCanvas.var_int_byte - 3, n2 / 2, 0);
            bm.var_eq_0_arr_int = eq_0Array4;
            eq_0[] eq_0Array5 = new eq_0[4];
            eq_0Array5[0] = new eq_0(GameCanvas.var_int_int, a_0.var_int_byte + a_0.var_int_byte / 2 + 2, 2);
            eq_0Array5[1] = new eq_0(a_0.var_int_int / 4 * 3 + a_0.var_int_int / 2 + 5, n2 / 2, 0);
            eq_0Array5[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte - bn_0.cfr_renamed_8 - 5, 2);
            eq_0Array5[3] = new eq_0(GameCanvas.var_int_byte - a_0.var_int_int - 5, n2 / 2 - 5, 1);
            bm.var_eq_0_arr_if = eq_0Array5;
            return;
        }
        eq_0[] eq_0Array6 = new eq_0[4];
        eq_0Array6[0] = new eq_0(GameCanvas.var_int_int, a_0.var_int_byte / 2, 0);
        eq_0Array6[1] = new eq_0(a_0.var_int_int / 2, n2 / 2, 0);
        eq_0Array6[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte / 2, 0);
        eq_0Array6[3] = new eq_0(GameCanvas.var_int_byte - a_0.var_int_int / 2, n2 / 2, 0);
        bm.var_eq_0_arr_for = eq_0Array6;
        eq_0[] eq_0Array7 = new eq_0[4];
        eq_0Array7[0] = new eq_0(GameCanvas.var_int_int, 0, 0);
        eq_0Array7[1] = new eq_0(a_0.var_int_int / 4 * 3, n2 / 2, 0);
        eq_0Array7[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte / 2 + a_0.var_int_byte / 4, 0);
        eq_0Array7[3] = new eq_0(GameCanvas.var_int_byte - a_0.var_int_int / 4, n2 / 2, 0);
        bm.var_eq_0_arr_int = eq_0Array7;
        eq_0[] eq_0Array8 = new eq_0[4];
        eq_0Array8[0] = new eq_0(GameCanvas.var_int_int, a_0.var_int_byte + 2, 2);
        eq_0Array8[1] = new eq_0(a_0.var_int_int / 4 * 3 + a_0.var_int_int / 2 + 5, n2 / 2 - 10, 0);
        eq_0Array8[2] = new eq_0(GameCanvas.var_int_int, n - a_0.var_int_byte - bn_0.cfr_renamed_8 - 1, 2);
        eq_0Array8[3] = new eq_0(GameCanvas.var_int_byte - a_0.var_int_int - 5, n2 / 2 - 10, 1);
        bm.var_eq_0_arr_if = eq_0Array8;
    }

    public final void (ThongTinNhanVat gO2 != null) {
        int n;
        gO2.var_int_byte = 176;
        if (bh_0.boolean_do(gO2.coKichHoat ? 1 : 0)) {
            gO2.soLuongKhoa = 170;
            if (((0x8A ^ 0x94) & ~(0x66 ^ 0x78)) > ((0x3E ^ 0x7F) & ~(0xC2 ^ 0x83))) {
                return;
            }
        } else {
            gO2.soLuongKhoa = 130;
        }
        if ((gO2.var_int_byte > GameCanvas.var_int_byte)) {
            gO2.var_int_byte = GameCanvas.var_int_byte;
            gO2.soLuongKhoa = 100;
        }
        gO2.var_int_else = (gO2.soLuongKhoa - 20) / 3;
        gO2.soLuong = 10;
        gO2.var_int_case = GameCanvas.var_int_int - gO2.var_int_byte / 2;
        gO2.var_int_int = GameCanvas.var_int_long - gO2.soLuongKhoa / 2 + 5;
        gO2.var_gx_int.soLuongKhoa = n = gO2.var_int_int + 15 + 4;
        gO2.var_gx_for.var_int_new = gO2.var_gx_do.var_int_new = gO2.var_int_try;
        gO2.var_gx_if.var_int_new = gO2.var_gx_do.var_int_new;
        gO2.var_gx_int.var_int_new = gO2.var_gx_do.var_int_new;
        gO2.var_gx_for.cfr_renamed_12 = gO2.var_gx_do.cfr_renamed_12 = gO2.var_int_char;
        gO2.var_gx_if.cfr_renamed_12 = gO2.var_gx_do.cfr_renamed_12;
        gO2.var_gx_int.cfr_renamed_12 = gO2.var_gx_do.cfr_renamed_12;
        gO2.var_gx_if.soLuongKhoa = n += gO2.var_gx_int.var_int_int + 15;
        gO2.var_gx_for.soLuongKhoa = n += gO2.var_gx_int.var_int_int + 15;
        gO2.cfr_renamed_18 = n - 10;
        gO2.var_gx_do.soLuongKhoa = n += gO2.var_gx_int.var_int_int + 15;
        gO2.var_int_new = gO2.var_gx_if.var_int_new - 40;
    }

    public final void (Graphics graphics >= fb fb2) {
        if ((fb2.var_byte_if == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_if, fb2.cfr_renamed_2 - 27, fb2.cfr_renamed_5 - 36, 0);
        (graphics != fb2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics graphics, Vector vector, int n, int n2 != null) {
        int n3;
        GameCanvas.cfr_renamed_1(graphics);
        graphics.translate(0, GameCanvas.var_ex_do.soLuongKhoa);
        graphics.translate(0, -ex.cfr_renamed_18);
        int n4 = (n - bn_0.var_byte_try) / 2;
        int n5 = ex.cfr_renamed_18 / n - 2;
        if ((n5 < 0)) {
            n5 = 0;
        }
        if ((n3 = n5 + (GameCanvas.var_int_char - 40) / n + 3 > vector.size())) {
            n3 = vector.size();
        }
        int n6 = 4 + n5 * n;
        while (!(n5 >= n3)) {
            ej_0 ej_02 = (ej_0)vector.elementAt(n5);
            if ((n5 == n2) && (ej_02.cfr_renamed_1 != -1)) {
                GameCanvas.var_gj_0_do.cfr_renamed_1(graphics, n6, GameCanvas.var_int_byte - 4, n);
            }
            if ((ej_02.cfr_renamed_1 == -1)) {
                int n7;
                String string = MenuChinhAvatar.var_java_lang_String_arr_float[ej_02.cfr_renamed_3];
                int n8 = 15;
                int n9 = n6 + 8;
                if ((GameCanvas.cfr_renamed_16 == null)) {
                    n7 = -4;
                    if (" ".length() <= ((0xFB ^ 0xA9 ^ (0x3D ^ 0x35)) & (0x47 ^ 0x21 ^ (0x8F ^ 0xB3) ^ -" ".length()))) {
                        return;
                    }
                } else {
                    n7 = 0;
                }
                GameCanvas.var_ew_byte.cfr_renamed_0(graphics, string, n8, n9 + n7, 0);
                GameCanvas.var_gj_0_do.cfr_renamed_0(graphics, n6 + 25, GameCanvas.var_int_byte, n6 + 25);
                } else {
                var_ep_new.cfr_renamed_0(0, 22, n6 + n / 2 + 1, 0, 3, graphics);
                GameCanvas.var_ew_if.cfr_renamed_0(graphics, String.valueOf(MenuChinhAvatar.cR) + ej_02.cfr_renamed_1, 50, n6 + n4, 0);
                if ((ej_02.var_byte_do >= 0) && (ej_02.var_byte_do != 2)) {
                    gp_0.var_ep_do.cfr_renamed_0(ej_02.var_byte_do, GameCanvas.var_int_byte - 20, n6 + n / 2, 0, 3, graphics);
                }
            }
            n6 += n;
            ++n5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void (Graphics graphics != fb fb2) {
        int n = 0;
        while (!(n >= 2)) {
            int n2;
            if (!bh_0.boolean_do(n2 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++]) || (n2 == 4)) {
                n2 += fb2.cfr_renamed_15;
            }
            if ((fb2.cfr_renamed_15 == null) && (fb2.mangSoNguyen[fb2.cfr_renamed_8] == 11) && (n2 == null)) {
                n2 = 11;
            }
            byte by2 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++];
            byte by3 = var_byte_arr_arr_do[fb2.mangSoNguyen[fb2.cfr_renamed_8]][n++];
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[n2], fb2.cfr_renamed_2 - 27 + by2, fb2.cfr_renamed_5 - 36 + by3, 3);
        }
        var_ep_arr_do[fb2.cfr_renamed_4].cfr_renamed_0(fb2.mangSoNguyen[fb2.cfr_renamed_8], fb2.cfr_renamed_2 - 27 + 5, fb2.cfr_renamed_5 - 36 + 7, 0, 3, graphics);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5 == null) {
        k.var_ep_do.cfr_renamed_0(n4, n - soLuong / 5, n2 - 3, 0, 3, graphics);
        k.var_ep_do.cfr_renamed_0(n5, n + n3 + soLuong / 5, n2 - 3, 3, 3, graphics);
        if ((soLuong += 1 >= 15)) {
            soLuong = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_2() {
        if ((var_javax_microedition_lcdui_Image_do != null)) {
            return;
        }
        try {
            var_javax_microedition_lcdui_Image_arr_if = new Image[14];
            var_ep_arr_do = new ep[2];
            int n = 0;
            if (" ".length() < " ".length()) {
                return;
            }
            while (true) {
                if ((n >= 14)) {
                    n = var_javax_microedition_lcdui_Image_arr_if[12].getWidth();
                    int n2 = var_javax_microedition_lcdui_Image_arr_if[12].getHeight();
                    Image image = Image.createImage((int)(n << 1), (int)(n2 << 1));
                    Graphics graphics = image.getGraphics();
                    graphics.setColor(-523560);
                    graphics.fillRect(0, 0, n << 1, n2 << 1);
                    graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 2, n, 0, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 1, 0, n2, 0);
                    graphics.drawRegion(var_javax_microedition_lcdui_Image_arr_if[12], 0, 0, n, n2, 3, n, n2, 0);
                    bh_0.var_javax_microedition_lcdui_Image_arr_if[12] = image = gc_0.cfr_renamed_0(image, -65315);
                    bh_0.var_ep_arr_do[0] = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/f.png")), 8, 9);
                    bh_0.var_ep_arr_do[1] = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/g.png")), 8, 9);
                    var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/cb.png"));
                    var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/cb1.png"));
                    var_javax_microedition_lcdui_Image_int = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/cb2.png"));
                    return;
                }
                bh_0.var_javax_microedition_lcdui_Image_arr_if[n] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/card/c" + n + ".png"));
                ++n;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4 <= 0) {
        var_ep_do.cfr_renamed_0(0, n, n2, 0, graphics);
        var_ep_do.cfr_renamed_0(1, n + n3 - 10, n2, 0, graphics);
        var_ep_do.cfr_renamed_0(2, n, n2 + n4 - 10, 0, graphics);
        var_ep_do.cfr_renamed_0(3, n + n3 - 10, n2 + n4 - 10, 0, graphics);
        graphics.setColor(29555);
        graphics.fillRect(n + 10, n2 + 1, n3 - 20, n4 - 2);
        graphics.fillRect(n + 1, n2 + 10, 9, n4 - 20);
        graphics.fillRect(n + n3 - 10, n2 + 10, 9, n4 - 20);
        graphics.setColor(16777215);
        graphics.fillRect(n + 10, n2, n3 - 20, 1);
        graphics.fillRect(n + 10, n2 + n4 - 1, n3 - 20, 1);
        graphics.fillRect(n, n2 + 10, 1, n4 - 20);
        graphics.fillRect(n + n3 - 1, n2 + 10, 1, n4 - 20);
    }

            public final void (Graphics graphics, ei ei2, ei ei3, ei ei4 != null) {
        int n = GameCanvas.this - GameCanvas.var_int_else / 2 - bn_0.var_byte_try / 2;
        if ((ei2 != null) && (ei2.chuoiGiaTri != "")) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei2.chuoiGiaTri, 4, n, 0);
        }
        if ((ei3 != null) && (ei3.chuoiGiaTri != "")) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei3.chuoiGiaTri, GameCanvas.var_int_int, n, 2);
        }
        if ((ei4 != null) && (ei4.chuoiGiaTri != "")) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei4.chuoiGiaTri, GameCanvas.var_int_byte - 4, n, 1);
        }
    }

    public final void (Graphics graphics, fb fb2, boolean bl != null) {
        if ((fb2.var_byte_if == -1)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[12], fb2.cfr_renamed_2 - 13, fb2.cfr_renamed_5 - 16, 0);
            return;
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_int, fb2.cfr_renamed_2 - 13, fb2.cfr_renamed_5 - 16, 0);
        var_ep_arr_do[fb2.cfr_renamed_4].cfr_renamed_0(fb2.mangSoNguyen[fb2.cfr_renamed_8], fb2.cfr_renamed_2 - 13 + 6, fb2.cfr_renamed_5 - 16 + 7, 0, 3, graphics);
        if (bh_0.boolean_do(bl ? 1 : 0)) {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[fb2.cfr_renamed_15 + 4], fb2.cfr_renamed_2 - 13 + 6 + 7, fb2.cfr_renamed_5 - 16 + 7, 3);
            if (" ".length() >= "  ".length()) {
                return;
            }
        } else {
            graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[fb2.cfr_renamed_15 + 4], fb2.cfr_renamed_2 - 13 + 6, fb2.cfr_renamed_5 - 16 + 17, 3);
        }
        graphics.drawImage(var_javax_microedition_lcdui_Image_arr_if[fb2.cfr_renamed_15], fb2.cfr_renamed_2 - 13 + 17, fb2.cfr_renamed_5 - 16 + 17, 3);
    }

    public final void (Graphics graphics, ei ei2, ei ei3, ei ei4 == null) {
        if ((ei2 != null) && (ei2.chuoiGiaTri != null)) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei2.chuoiGiaTri, GameCanvas.var_eq_0_arr_do[0].var_int_if + 2, GameCanvas.var_eq_0_arr_do[0].soLuong + GameCanvas.var_int_else / 2 - bn_0.var_byte_try / 2, 0);
        }
        if ((ei3 != null) && (ei3.chuoiGiaTri != null)) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei3.chuoiGiaTri, GameCanvas.var_eq_0_arr_do[1].var_int_if + dL.cfr_renamed_30 / 2, GameCanvas.var_eq_0_arr_do[1].soLuong + GameCanvas.var_int_else / 2 - bn_0.var_byte_try / 2, 2);
        }
        if ((ei4 != null) && (ei4.chuoiGiaTri != null)) {
            GameCanvas.var_ew_byte.cfr_renamed_0(graphics, ei4.chuoiGiaTri, GameCanvas.var_eq_0_arr_do[2].var_int_if + dL.cfr_renamed_30 - 2, GameCanvas.var_eq_0_arr_do[2].soLuong + GameCanvas.var_int_else / 2 - bn_0.var_byte_try / 2, 1);
        }
    }

        private static int int_do(ei ei2, ei ei3, ei ei4) {
        if ((ei2 != null) && (ei2.chuoiGiaTri.equals("") ? 1 : 0 == null) && bh_0.boolean_do(GameCanvas.boolean_if(0, GameCanvas.this - GameCanvas.var_int_else, 95, GameCanvas.var_int_else) ? 1 : 0)) {
            return 1;
        }
        if ((ei3 != null) && (ei3.chuoiGiaTri.equals("") ? 1 : 0 == null) && bh_0.boolean_do(GameCanvas.boolean_if(GameCanvas.var_int_byte / 2 - 43 - 8, GameCanvas.this - GameCanvas.var_int_else, 95, GameCanvas.var_int_else) ? 1 : 0)) {
            return 2;
        }
        if ((ei4 != null) && (ei4.chuoiGiaTri.equals("") ? 1 : 0 == null) && bh_0.boolean_do(GameCanvas.boolean_if(GameCanvas.var_int_byte - 87 - 8, GameCanvas.this - GameCanvas.var_int_else, 95, GameCanvas.var_int_else) ? 1 : 0)) {
            return 3;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void cfr_renamed_15() {
        try {
            int[] nArray = new int[6];
            nArray[0] = 21080;
            nArray[1] = 12313816;
            nArray[2] = 8703190;
            nArray[3] = 2713971;
            nArray[4] = 5107863;
            nArray[5] = 4559225;
            k.mangSoNguyen = nArray;
            var_ep_int = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/round.on")), 8, 8);
            var_javax_microedition_lcdui_Image_for = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/bg.on"));
            var_javax_microedition_lcdui_Image_arr_do = new Image[8];
            int n = 0;
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (true) {
                if ((n >= 8)) {
                    var_ep_do = new ep(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/barMoney.png")), 10, 10);
                    return;
                }
                bh_0.var_javax_microedition_lcdui_Image_arr_do[n] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_do()) + "/on/imgPopup" + n + ".on"));
                ++n;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public final void (Graphics graphics, String string, String string2, String string3 != null) {
        graphics.setClip(0, 0, GameCanvas.var_int_byte, GameCanvas.var_int_char);
        GameCanvas.var_gj_0_do.cfr_renamed_1(graphics);
        GameCanvas.var_ew_for.cfr_renamed_0(graphics, string, GameCanvas.var_int_int, 2, 2);
        graphics.setColor(6192786);
        graphics.fillRect(0, 25, GameCanvas.var_int_byte, dL.cfr_renamed_13);
        GameCanvas.var_ew_if.cfr_renamed_0(graphics, string2, 10, 28, 0);
        GameCanvas.var_ew_if.cfr_renamed_0(graphics, string3, GameCanvas.var_int_byte - 10, 28, 1);
    }

    public final void (Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7 != null) {
        var_ep_int.cfr_renamed_0(0 + (n7 << 2), n, n2, 0, graphics);
        var_ep_int.cfr_renamed_0(1 + (n7 << 2), n + n3 - 8, n2, 0, graphics);
        var_ep_int.cfr_renamed_0(2 + (n7 << 2), n, n2 + n4 - 8, 0, graphics);
        var_ep_int.cfr_renamed_0(3 + (n7 << 2), n + n3 - 8, n2 + n4 - 8, 0, graphics);
        k.cfr_renamed_0(n + 8, n2, n3 - 16, 8, n5, graphics);
        graphics.fillRect(n + 8, n2 + n4 - 8, n3 - 16, 7);
        graphics.fillRect(n, n2 + 8, n3, n4 - 16);
        k.cfr_renamed_0(n + 8, n2, n3 - 16, 1, n6, graphics);
        graphics.fillRect(n + 8, n2 + n4 - 1, n3 - 16, 1);
        graphics.fillRect(n, n2 + 8, 1, n4 - 16);
        graphics.fillRect(n + n3 - 1, n2 + 8, 1, n4 - 16);
    }

            public final void (Graphics graphics, int n, int n2, int n3, int n4 > 0) {
        this.cfr_renamed_0(graphics, n, n2, n3, n4, 0);
    }

    public final void cfr_renamed_8() {
        if (bh_0.boolean_do(GameCanvas.coKichHoat ? 1 : 0)) {
            if (bh_0.boolean_do(GameCanvas.boolean_do(k.k_do().cfr_renamed_2 + k.k_do().cfr_renamed_5 / 2 - 20, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_15 / 2, 40, 40) ? 1 : 0)) {
                cs_0.cfr_renamed_0().void_for(0);
                GameCanvas.coKichHoat = 0;
                if (-" ".length() > 0) {
                    return;
                }
            } else if (bh_0.boolean_do(GameCanvas.boolean_do(k.k_do().cfr_renamed_2 + k.k_do().cfr_renamed_5 / 2 - 20, k.k_do().soLuong + k.var_byte_do + 95 - AngelChip.duLieuNguoiChoi.var_short_int / 2 - 20, 40, 45) ? 1 : 0)) {
                cs_0.cfr_renamed_0().void_for(1);
                GameCanvas.coKichHoat = 0;
                if ("  ".length() >= (49 + 44 - -29 + 8 ^ 85 + 123 - 157 + 83)) {
                    return;
                }
            } else if (bh_0.boolean_do(GameCanvas.boolean_do(k.k_do().cfr_renamed_2 + k.k_do().cfr_renamed_5 / 2 - 20 - 40, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_15 / 2 + 50 * cs_0.cfr_renamed_0().soLuongKhoa, 40, 40) ? 1 : 0)) {
                cs_0.cfr_renamed_0().void_int(-1);
                cs_0.cfr_renamed_0().soLuong = 6;
                GameCanvas.coKichHoat = 0;
                if ((91 + 8 - -83 + 14 ^ 5 + 16 - -27 + 144) != (0x4E ^ 0x64 ^ (0x37 ^ 0x19))) {
                    return;
                }
            } else if (bh_0.boolean_do(GameCanvas.boolean_do(k.k_do().cfr_renamed_2 + k.k_do().cfr_renamed_5 / 2 - 20 + 40, k.k_do().soLuong + k.var_byte_do + bn_0.cfr_renamed_15 / 2 + 50 * cs_0.cfr_renamed_0().soLuongKhoa, 40, 40) ? 1 : 0)) {
                cs_0.cfr_renamed_0().void_int(1);
                cs_0.cfr_renamed_0().var_int_if = 6;
                GameCanvas.coKichHoat = 0;
            }
        }
        if (bh_0.boolean_do(GameCanvas.boolean_do(2) ? 1 : 0)) {
            cs_0.cfr_renamed_0().void_for(cs_0.cfr_renamed_0().soLuongKhoa - 1);
            return;
        }
        if (bh_0.boolean_do(GameCanvas.boolean_do(4) ? 1 : 0)) {
            cs_0.cfr_renamed_0().void_int(-1);
            cs_0.cfr_renamed_0().soLuong = 6;
            return;
        }
        if (bh_0.boolean_do(GameCanvas.boolean_do(6) ? 1 : 0)) {
            cs_0.cfr_renamed_0().void_int(1);
            cs_0.cfr_renamed_0().var_int_if = 6;
            return;
        }
        if (bh_0.boolean_do(GameCanvas.boolean_do(8) ? 1 : 0)) {
            cs_0.cfr_renamed_0().void_for(cs_0.cfr_renamed_0().soLuongKhoa + 1);
        }
    }

    private static void cfr_renamed_11() {
        mangSoNguyen = new int[80];
        13 = 0x6D ^ 0x72 ^ (0x8E ^ 0x9C);
        0 = (0x3F ^ 0x70 ^ (0xF3 ^ 0xAE)) & ((0xF5 ^ 0xC6) & ~(0x3C ^ 0xF) ^ (0xB5 ^ 0xA7) ^ -" ".length());
        9 = 0x7F ^ 0x6A ^ (0x6D ^ 0x71);
        4 = 0xB7 ^ 0xB3;
        1 = " ".length();
        6 = 0x53 ^ 8 ^ (0x42 ^ 0x1F);
        2 = "  ".length();
        17 = 0xB1 ^ 0xA0;
        27 = 0x2B ^ 0x22 ^ (0xA ^ 0x18);
        5 = 146 + 155 - 131 + 10 ^ 82 + 27 - -58 + 10;
        14 = 0xD ^ 3;
        7 = 0x51 ^ 0x4C ^ (0x78 ^ 0x62);
        8 = 8 ^ 0;
        36 = 0x3F ^ 0x1B;
        37 = 0x12 ^ 0x37;
        12 = 0x45 ^ 0x7C ^ (0xA1 ^ 0x94);
        10 = 0x9A ^ 0x90;
        11 = 0x1A ^ 0x11;
        3 = "   ".length();
        15 = 0x52 ^ 0x5D;
        18 = 0xAC ^ 0x8E ^ (0x66 ^ 0x56);
        16 = 0x81 ^ 0x91;
        30 = 144 + 115 - 62 + 25 ^ 25 + 117 - 72 + 122;
        28 = 98 + 11 - 49 + 78 ^ 121 + 10 - 99 + 118;
        20 = 0x9D ^ 0x89;
        6201499 = 0xFFFFE4FB & 0x5EBB9F;
        2378578 = 0xFFFFCFDF & 0x247B72;
        8705740 = 0xFFFFFFEE & 0x84D6DD;
        2716523 = 0xFFFFF37F & 0x297FEB;
        16701696 = -(0xFFFFBEEF & 0x67B7) & (0xFFFFFFBE & 0xFEFFE7);
        7042560 = -(0xFFFF8FF9 & 0x79A7) & (0xFFFFFFAF & 0x6B7FF0);
        35217 = 0xFFFFBB95 & 0xCDFB;
        32382 = 0xFFFFFEFE & 0x7F7F;
        23135 = -(0xFFFFB591 & 0x6BEF) & (0xFFFFFFDF & 0x7BFF);
        14414578 = -(0xFFFF99ED & 0x6F1F) & (0xFFFFFBFF & 0xDBFFFE);
        50 = 0x55 ^ 0x53 ^ (0x30 ^ 4);
        48 = 73 + 31 - 32 + 71 ^ 12 + 86 - 18 + 111;
        24 = 0x88 ^ 0x90;
        19 = 0x78 ^ 0xB ^ (0x67 ^ 7);
        2704964 = -(0xFFFF93B7 & 0x7DDB) & (0xFFFFF7FE & 0x295FD7);
        5014141 = -(0xFFFFDF17 & 0x7DEB) & (0xFFFFFF7F & 0x4CDFFF);
        11074288 = -(0xFFFFAD9E & 0x576F) & (0xFFFFFFFF & 0xA8FFFD);
        16777215 = -" ".length() & (0xFFFFFFFF & 0xFFFFFF);
        8969676 = 0xFFFFDDFC & 0x88FFCF;
        5614233 = 0xFFFFBB9D & 0x55EEFB;
        -523560 = -(0xFFFFFF6D & 0x7FDBA);
        -65315 = -(-(0x3A ^ 0x27) & (0xFFFFFFFF & 0xFF3F));
        -1 = -" ".length();
        25 = 0x88 ^ 0x91;
        75 = 0xBA ^ 0xA1 ^ (5 ^ 0x55);
        45 = 0x24 ^ 9;
        35 = 0x74 ^ 0x57;
        176 = 108 + 25 - 75 + 118;
        170 = (0xD3 ^ 0x87) + (0xC2 ^ 0xAC) - (0x7B ^ 0x55) + (0xA3 ^ 0xB5);
        130 = 87 + 102 - 84 + 25;
        100 = 59 + 32 - -125 + 0 ^ 64 + 103 - 53 + 74;
        40 = 0xA1 ^ 0x89;
        15530985 = -(0xBF ^ 0xAE) & (0xFFFFFFFB & 0xECFBFD);
        14279153 = -(0xFFFFBFDF & 0x4E23) & (0xFFFFEFF7 & 0xD9FFFB);
        60 = 0x37 ^ 0x4D ^ (0xDF ^ 0x99);
        200 = 101 + 73 - 49 + 75;
        32 = 0xAF ^ 0x8F;
        71 = 0x1A ^ 7 ^ (0x19 ^ 0x43);
        6192786 = -(0x1C ^ 0x71) & (0xFFFFFFFF & 0x5E7EFE);
        46 = 0x42 ^ 0x6C;
        21080 = -(0xFFFFAFA9 & 0x79FE) & (0xFFFFFBFF & Short.MAX_VALUE);
        12313816 = 0xFFFFE6F9 & 0xBBFDDE;
        8703190 = -(0xFFFFBBFF & 0x752A) & (0xFFFFFDFF & 0x84FFFF);
        2713971 = 0xFFFFED7F & 0x297BF3;
        5107863 = 0xFFFFF1B7 & 0x4DFEDF;
        4559225 = -(0xFFFFBF9B & 0x48E7) & (0xFFFF9FFF & 0x45F9FB);
        44 = 0 ^ 0x2C;
        12442838 = -(0xFFFF96DF & 0x6B29) & (0xFFFFDEDF & 0xBDFFFE);
        87 = 0xC8 ^ 0x9F;
        115 = 185 + 84 - 27 + 3 ^ 92 + 46 - 132 + 128;
        95 = 0x30 ^ 0x6F;
        43 = 0x3C ^ 0x17;
        -4 = -(0xD1 ^ 0x9B ^ (0x7B ^ 0x35));
        22 = 0x91 ^ 0x87;
        29555 = -(38 + 131 - 65 + 29) & (0xFFFFF3F7 & Short.MAX_VALUE);
    }

        public final void cfr_renamed_12() {
        gp_0.var_gp_0_do = null;
        e.var_e_do = null;
        a_0.var_a_0_do = null;
        fk.var_fk_do = null;
        o.var_o_do = null;
    }
}

