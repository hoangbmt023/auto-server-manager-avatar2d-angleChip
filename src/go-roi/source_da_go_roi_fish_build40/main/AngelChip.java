/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
package main;

import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public class AngelChip
extends MIDlet {
    public static byte var_byte_do;
    public static String chuoiGiaTri;
    public static int soLuong;
    public static by var_by_do;
    public static AngelChip midlet;
    public static String[][][] var_java_lang_String_arr_arr_arr_do;
    private static final int[] mangSoNguyen;
    public static int[][][] var_int_arr_arr_arr_do;
    public static Vector var_java_util_Vector_do;
    public static GameCanvas gameCanvas;
    public static String tenNhanVat;
    public static String[][][] var_java_lang_String_arr_arr_arr_if;
    public static DuLieuNguoiChoi duLieuNguoiChoi;
    public static String cfr_renamed_2;
    public static int var_int_if;

        public AngelChip() {
        midlet = this;
        gameCanvas = new GameCanvas();
        gameCanvas.void_for();
        duLieuNguoiChoi = new DuLieuNguoiChoi();
        var_by_do = new by();
        br_0.cfr_renamed_1();
        aU.cfr_renamed_1().cfr_renamed_4();
        gameCanvas.sizeChanged(0, 0);
        gameCanvas.cfr_renamed_3();
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)gameCanvas);
        ae.ae_do().cfr_renamed_1(fh_0.fh_0_do());
        String string = hg.java_lang_String_do("avatar");
        if (!AngelChip.cfr_renamed_1((Object)string) || !(string.equals("2.5.8"))) {
            aa_0.cfr_renamed_2();
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[3];
        0 = (168 + 21 - 130 + 123 ^ 123 + 117 - 114 + 14) & (0x42 ^ 0x2C ^ (0xE4 ^ 0xB0) ^ -" ".length());
        1 = " ".length();
        8 = 0x14 ^ 0x1C;
    }

        public static void (String string == 0) {
        try {
            midlet.platformRequest(string);
            midlet.notifyDestroyed();
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            return;
        }
    }

    public void destroyApp(boolean bl) {
        midlet.notifyDestroyed();
    }

    public static void (String string, String string2 == 0) {
        new Thread(new r_0(string2, string)).start();
    }

    protected void startApp() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)gameCanvas);
    }

    static {
        AngelChip.cfr_renamed_0();
        soLuong = 8;
        var_byte_do = (byte)0;
        cfr_renamed_2 = "";
    }

    protected void pauseApp() {
    }

    public static void cfr_renamed_1() {
        try {
            midlet.destroyApp(1);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

