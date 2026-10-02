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
    public static int soLuong;
    public static String chuoiGiaTri;
    public static AngelChip midlet;
    public static GameCanvas gameCanvas;
    public static String tenNhanVat;
    public static String cfr_renamed_3;
    public static String[][][] var_java_lang_String_arr_arr_arr_do;
    public static Vector var_java_util_Vector_do;
    private static final int[] mangSoNguyen;
    public static int[][][] var_int_arr_arr_arr_do;
    public static int var_int_if;
    public static ar_0 fontRenderer;
    public static DuLieuNguoiChoi duLieuNguoiChoi;
    public static String[][][] var_java_lang_String_arr_arr_arr_if;
    public static byte var_byte_do;

    public void destroyApp(boolean bl) {
        midlet.notifyDestroyed();
    }

    public static void cfr_renamed_0() {
        try {
            midlet.destroyApp(1);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static {
        AngelChip.cfr_renamed_1();
        var_int_if = 8;
        var_byte_do = (byte)0;
        cfr_renamed_3 = "";
    }

    public AngelChip() {
        midlet = this;
        gameCanvas = new GameCanvas();
        gameCanvas.cfr_renamed_12();
        duLieuNguoiChoi = new DuLieuNguoiChoi();
        fontRenderer = new ar_0();
        bl_0.cfr_renamed_0();
        w.cfr_renamed_0().cfr_renamed_8();
        gameCanvas.sizeChanged(0, 0);
        gameCanvas.void_do();
        i_0.i_0_do().cfr_renamed_0(ee.ee_do());
        String string = gc_0.java_lang_String_do("avatar");
        if (!AngelChip.cfr_renamed_0((Object)string) || !(string.equals("2.5.8"))) {
            ci_0.void_do();
        }
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[3];
        0 = (0x66 ^ 0x68) & ~(0xA8 ^ 0xA6);
        1 = " ".length();
        8 = 80 + 108 - 59 + 11 ^ 81 + 105 - 182 + 128;
    }

    protected void startApp() {
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)gameCanvas);
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

        protected void pauseApp() {
    }

    public static void (String string, String string2 == 0) {
        new Thread(new g(string2, string)).start();
    }
}

