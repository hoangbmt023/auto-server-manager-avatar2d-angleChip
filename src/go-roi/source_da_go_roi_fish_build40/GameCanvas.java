/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.List
 *  javax.microedition.midlet.MIDlet
 */
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

public final class GameCanvas
extends l_0
implements Runnable,
CommandListener {
    public static ca var_ca_do;
    public static fz_0 var_fz_0_do;
    public static int soLuong;
    public static fz_0 var_fz_0_if;
    public static Vector var_java_util_Vector_do;
    public static int var_int_if;
    private static final int[] mangSoNguyen;
    public static int soLuongKhoa;
    public static int var_int_int;
    public static int var_int_new;
    public static boolean[] var_boolean_arr_do;
    private int cfr_renamed_21;
    private static Vector var_java_util_Vector_for;
    private static Object var_java_lang_Object_do;
    public static en var_en_do;
    public static boolean dangChayAuto;
    private static Command var_javax_microedition_lcdui_Command_do;
    private static boolean var_boolean_char;
    public static int var_int_try;
    public static int var_int_byte;
    public static boolean coTrangThai;
    private static Vector var_java_util_Vector_int;
    public static boolean coKichHoat;
    public static cg_0 var_cg_0_do;
    private static Command var_javax_microedition_lcdui_Command_if;
    public static fh var_fh_do;
    public static s var_s_do;
    private int cfr_renamed_10;
    public static boolean[] var_boolean_arr_if;
    public static int var_int_case;
    public static long soXu;
    public static fs[] var_fs_arr_do;
    public static fz_0 var_fz_0_for;
    public static Vector var_java_util_Vector_if;
    public static Image var_javax_microedition_lcdui_Image_do;
    public static ez var_ez_do;
    public static int var_int_char;
    public static boolean var_boolean_int;
    public static int var_int_else;
    public static boolean var_boolean_new;
    public static boolean var_boolean_try;
    public static fs var_fs_do;
    private static long[] var_long_arr_do;
    private static int cfr_renamed_18;
    private static boolean var_boolean_else;
    public static int var_int_goto;
    private static int cfr_renamed_30;
    public static boolean[] var_boolean_arr_for;
    public static fz_0 var_fz_0_int;
    public static int var_int_long;
    public static byte var_byte_do;
    public static aa var_aa_do;
    public static h_0 var_h_0_do;
    public static fl_0 var_fl_0_do;
    private static boolean var_boolean_goto;
    public static GameCanvas gameCanvas;
    public static fv var_fv_do;
    public static fz_0 var_fz_0_new;
    public static boolean var_boolean_byte;
    private static boolean var_boolean_long;
    public static fa_0 var_fa_0_do;
    public static boolean var_boolean_case;
    public static fz_0 var_fz_0_try;
    public static int this;
    public static fz_0 var_fz_0_byte;
    public static fz_0 var_fz_0_case;
    private int cfr_renamed_20;
    public static int cfr_renamed_12;
    public static dj_0 var_dj_0_do;
    public static int cfr_renamed_15;

    public static void (String string, fl_0 fl_02, fl_0 fl_03 == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(fl_02);
        vector.addElement(fl_03);
        (string == vector);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        var_boolean_long = 1;
        while (GameCanvas.boolean_if(var_boolean_long ? 1 : 0)) {
            try {
                long l;
                block112: {
                    block110: {
                        block103: {
                            int l2;
                            Object object;
                            block104: {
                                block105: {
                                    block109: {
                                        block108: {
                                            block107: {
                                                block106: {
                                                    if ((this.cfr_renamed_20 > 0)) {
                                                        this.cfr_renamed_20 -= 1;
                                                        if ((this.cfr_renamed_20 == 0)) {
                                                            Display.getDisplay((MIDlet)AngelChip.midlet).vibrate(0);
                                                            }
                                                    }
                                                    l = System.currentTimeMillis();
                                                    if ((var_int_goto += 1 > 10000)) {
                                                        var_int_goto = 0;
                                                    }
                                                    if ((var_int_byte == -1)) {
                                                        if ((var_int_byte == 1)) {
                                                            this.cfr_renamed_21 += 15;
                                                            if ("  ".length() > (0xF ^ 0xB)) {
                                                                return;
                                                            }
                                                        } else {
                                                            this.cfr_renamed_10 += 1;
                                                            if ((this.cfr_renamed_10 >= 8)) {
                                                                this.cfr_renamed_10 = 0;
                                                            }
                                                        }
                                                        if ((this.cfr_renamed_21 >= var_int_char)) {
                                                            this.cfr_renamed_21 = 0;
                                                            var_int_byte = -1;
                                                        }
                                                    }
                                                    if (!GameCanvas.boolean_if(var_int_byte)) break block103;
                                                    if ((var_h_0_do != null)) {
                                                        int n;
                                                        object = var_h_0_do;
                                                        if (GameCanvas.cfr_renamed_3(((h_0)object).coTrangThai ? 1 : 0)) {
                                                            if (GameCanvas.boolean_if(((h_0)object).dangChayAuto ? 1 : 0) && GameCanvas.boolean_if(var_boolean_new ? 1 : 0)) {
                                                                ((h_0)object).dangChayAuto = 0;
                                                                if (GameCanvas.cfr_renamed_5(GameCanvas.cfr_renamed_1(System.currentTimeMillis() / 10L - ((h_0)object).soXu, 40L))) {
                                                                    ey_0.cfr_renamed_0();
                                                                    ((h_0)object).cfr_renamed_0();
                                                                    } else {
                                                                    ((h_0)object).cfr_renamed_12 = -1;
                                                                    ((h_0)object).coTrangThai = 1;
                                                                }
                                                            }
                                                            if (GameCanvas.boolean_if(GameCanvas.boolean_do(((h_0)object).cfr_renamed_7, ((h_0)object).var_int_new, ((h_0)object).var_int_if, ((h_0)object).cfr_renamed_9) ? 1 : 0)) {
                                                                if (GameCanvas.boolean_if(var_boolean_case ? 1 : 0)) {
                                                                    l2 = (var_int_try - ((h_0)object).cfr_renamed_7) / ((h_0)object).soLuongKhoa;
                                                                    n = (soLuong - ((h_0)object).var_int_new) / ((h_0)object).cfr_renamed_13;
                                                                    ((h_0)object).cfr_renamed_12 = n * ((h_0)object).var_int_try + l2;
                                                                    if (GameCanvas.cfr_renamed_4(n = ((h_0)object).cfr_renamed_12, 2)) {
                                                                        ((h_0)object).soXu = System.currentTimeMillis() / 10L;
                                                                        ((h_0)object).dangChayAuto = 1;
                                                                        } else {
                                                                        gameCanvas.void_if(((h_0)object).var_byte_arr_do[n]);
                                                                    }
                                                                    var_boolean_case = 0;
                                                                }
                                                                if (GameCanvas.boolean_if(var_boolean_new ? 1 : 0) && GameCanvas.hienThongBaoPopup(((h_0)object).cfr_renamed_12, -1)) {
                                                                    n = ((h_0)object).cfr_renamed_12;
                                                                    if ((n == 2) && GameCanvas.cfr_renamed_1(n, ((h_0)object).var_byte_arr_do.length)) {
                                                                        gameCanvas.void_do(((h_0)object).var_byte_arr_do[n]);
                                                                    }
                                                                    ((h_0)object).cfr_renamed_12 = -1;
                                                                    var_boolean_new = 0;
                                                                    if (" ".length() <= 0) {
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        } else if (GameCanvas.boolean_if(GameCanvas.boolean_do(((h_0)object).cfr_renamed_8, ((h_0)object).var_int_int, ((h_0)object).var_int_if, ((h_0)object).cfr_renamed_9) ? 1 : 0)) {
                                                            if (GameCanvas.boolean_if(var_boolean_case ? 1 : 0)) {
                                                                int n2 = (var_int_try - ((h_0)object).cfr_renamed_8) / ((h_0)object).this;
                                                                n = (soLuong - ((h_0)object).var_int_int) / ((h_0)object).cfr_renamed_6;
                                                                n = ((h_0)object).cfr_renamed_12 = n * ((h_0)object).cfr_renamed_14 + n2;
                                                                if (GameCanvas.boolean_if(var_boolean_byte ? 1 : 0) && (n != 9)) {
                                                                    gameCanvas.void_if(n + 49);
                                                                    if ("  ".length() == 0) {
                                                                        return;
                                                                    }
                                                                } else if (!(var_boolean_byte) && (n % 4 == 3)) {
                                                                    gameCanvas.void_if(n + 49 - n / 4);
                                                                    } else {
                                                                    switch (n) {
                                                                        case 3: {
                                                                            h_0.cfr_renamed_1();
                                                                        }
                                                                        default: {
                                                                            if (" ".length() != -" ".length()) break;
                                                                            return;
                                                                        }
                                                                        case 7: 
                                                                        case 9: {
                                                                            ((h_0)object).coTrangThai = 0;
                                                                            if ("  ".length() > 0) break;
                                                                            return;
                                                                        }
                                                                        case 10: {
                                                                            gameCanvas.void_if(48);
                                                                            if (-" ".length() == -" ".length()) break;
                                                                            return;
                                                                        }
                                                                        case 11: {
                                                                            if (GameCanvas.boolean_if(var_boolean_byte ? 1 : 0)) {
                                                                                h_0.cfr_renamed_1();
                                                                                if (-"   ".length() < 0) break;
                                                                                return;
                                                                            }
                                                                            gameCanvas.void_if(48);
                                                                        }
                                                                    }
                                                                }
                                                                var_boolean_case = 0;
                                                            }
                                                            if (GameCanvas.boolean_if(var_boolean_new ? 1 : 0) && GameCanvas.hienThongBaoPopup(((h_0)object).cfr_renamed_12, -1)) {
                                                                ((h_0)object).cfr_renamed_12 = -1;
                                                                var_boolean_new = 0;
                                                            }
                                                        }
                                                    }
                                                    if ((var_fv_do != null) && (var_dj_0_do == null)) {
                                                        var_fv_do.cfr_renamed_6();
                                                    }
                                                    if ((var_java_util_Vector_if.size() > 0)) {
                                                        l2 = 0;
                                                        while ((l2 != var_java_util_Vector_if.size())) {
                                                            ((bR)var_java_util_Vector_if.elementAt(l2)).cfr_renamed_1();
                                                            ++l2;
                                                            if (-"  ".length() < 0) continue;
                                                            return;
                                                        }
                                                    }
                                                    if (!(var_en_do != null)) break block104;
                                                    if (GameCanvas.boolean_if(cs_0.dangChayAuto ? 1 : 0)) {
                                                        cs_0.cfr_renamed_1().cfr_renamed_6();
                                                    }
                                                    if ((var_java_util_Vector_do.size() <= 0)) {
                                                        if ((var_byte_do > 0)) {
                                                            var_byte_do = (byte)(var_byte_do - 1);
                                                            }
                                                    } else {
                                                        if ((var_byte_do !=  (int)dF.cfr_renamed_6)) {
                                                            var_byte_do = (byte)(var_byte_do + 1);
                                                        }
                                                        object = (fx)var_java_util_Vector_do.elementAt(0);
                                                        ((fx)object).cfr_renamed_2 -= 2;
                                                        if (GameCanvas.cfr_renamed_1(((fx)object).cfr_renamed_2, ((fx)object).soLuong)) {
                                                            var_java_util_Vector_do.removeElementAt(0);
                                                        }
                                                    }
                                                    var_en_do.cfr_renamed_7();
                                                    if (!GameCanvas.boolean_if(GameCanvas.var_cg_0_do.coTrangThai ? 1 : 0)) break block105;
                                                    object = var_cg_0_do;
                                                    if (!(var_aa_do == null) || !(var_dj_0_do == null)) break block105;
                                                    if (!GameCanvas.cfr_renamed_3(((cg_0)object).cfr_renamed_4)) break block106;
                                                    if ((cg_0.cfr_renamed_9 < 0)) {
                                                        cg_0.soLuongKhoa = 0;
                                                        if ("  ".length() == 0) {
                                                            return;
                                                        }
                                                        break block107;
                                                    } else if (GameCanvas.cfr_renamed_5(cg_0.cfr_renamed_9, ((cg_0)object).cfr_renamed_12)) {
                                                        cg_0.soLuongKhoa = ((cg_0)object).cfr_renamed_12;
                                                        if (" ".length() <= 0) {
                                                            return;
                                                        }
                                                    }
                                                    break block107;
                                                }
                                                if (!(cg_0.cfr_renamed_9 >= 0) || GameCanvas.cfr_renamed_5(cg_0.cfr_renamed_9, ((cg_0)object).cfr_renamed_12)) {
                                                    if (GameCanvas.cfr_renamed_5(((cg_0)object).cfr_renamed_4, 500)) {
                                                        ((cg_0)object).cfr_renamed_4 = 500;
                                                        } else if (GameCanvas.cfr_renamed_1(((cg_0)object).cfr_renamed_4, -500)) {
                                                        ((cg_0)object).cfr_renamed_4 = -500;
                                                    }
                                                    ((cg_0)object).cfr_renamed_4 -= ((cg_0)object).cfr_renamed_4 / 5;
                                                    if (GameCanvas.cfr_renamed_3(hg.int_do(((cg_0)object).cfr_renamed_4 / 10), 10)) {
                                                        ((cg_0)object).cfr_renamed_4 = 0;
                                                    }
                                                }
                                                cg_0.soLuongKhoa = cg_0.cfr_renamed_9 += ((cg_0)object).cfr_renamed_4 / 15;
                                                ((cg_0)object).cfr_renamed_4 -= ((cg_0)object).cfr_renamed_4 / 20;
                                            }
                                            if (!GameCanvas.cfr_renamed_3(((cg_0)object).cfr_renamed_6)) break block108;
                                            if ((cg_0.cfr_renamed_14 < 0)) {
                                                cg_0.var_int_int = 0;
                                                break block109;
                                            } else if (GameCanvas.cfr_renamed_5(cg_0.cfr_renamed_14, ((cg_0)object).var_int_if)) {
                                                cg_0.var_int_int = ((cg_0)object).var_int_if;
                                                }
                                            break block109;
                                        }
                                        if (!(cg_0.cfr_renamed_14 >= 0) || GameCanvas.cfr_renamed_5(cg_0.cfr_renamed_14, ((cg_0)object).var_int_if)) {
                                            if (GameCanvas.cfr_renamed_5(((cg_0)object).cfr_renamed_6, 500)) {
                                                ((cg_0)object).cfr_renamed_6 = 500;
                                                } else if (GameCanvas.cfr_renamed_1(((cg_0)object).cfr_renamed_6, -500)) {
                                                ((cg_0)object).cfr_renamed_6 = -500;
                                            }
                                            ((cg_0)object).cfr_renamed_6 -= ((cg_0)object).cfr_renamed_6 / 5;
                                            if (GameCanvas.cfr_renamed_3(hg.int_do(((cg_0)object).cfr_renamed_6 / 10), 10)) {
                                                ((cg_0)object).cfr_renamed_6 = 0;
                                            }
                                        }
                                        cg_0.var_int_int = cg_0.cfr_renamed_14 += ((cg_0)object).cfr_renamed_6 / 15;
                                        ((cg_0)object).cfr_renamed_6 -= ((cg_0)object).cfr_renamed_6 / 20;
                                    }
                                    if ((cg_0.cfr_renamed_9 == cg_0.soLuongKhoa)) {
                                        ((cg_0)object).cfr_renamed_7 = cg_0.soLuongKhoa - cg_0.cfr_renamed_9 << 2;
                                        ((cg_0)object).cfr_renamed_5 += ((cg_0)object).cfr_renamed_7;
                                        cg_0.cfr_renamed_9 += ((cg_0)object).cfr_renamed_5 >> 4;
                                        ((cg_0)object).cfr_renamed_5 &= 15;
                                    }
                                    if ((cg_0.cfr_renamed_14 == cg_0.var_int_int)) {
                                        ((cg_0)object).this = cg_0.var_int_int - cg_0.cfr_renamed_14 << 2;
                                        ((cg_0)object).soLuong += ((cg_0)object).this;
                                        cg_0.cfr_renamed_14 += ((cg_0)object).soLuong >> 4;
                                        ((cg_0)object).soLuong &= 15;
                                    }
                                }
                                if ((var_dj_0_do != null)) {
                                    var_dj_0_do.cfr_renamed_6();
                                    } else if ((var_ez_do != null)) {
                                    if ((var_fv_do == null)) {
                                        var_ez_do.cfr_renamed_6();
                                        }
                                } else if ((var_aa_do != null)) {
                                    var_aa_do.cfr_renamed_6();
                                    if ((var_aa_do != null)) {
                                        var_aa_do.cfr_renamed_7();
                                        if (-" ".length() > "  ".length()) {
                                            return;
                                        }
                                    }
                                } else {
                                    if ((var_ez_do == null) && !(cs_0.dangChayAuto)) {
                                        var_en_do.cfr_renamed_6();
                                    }
                                    if (GameCanvas.boolean_if(GameCanvas.var_cg_0_do.coTrangThai ? 1 : 0) && (var_ez_do == null)) {
                                        var_cg_0_do.cfr_renamed_1();
                                    }
                                }
                                if ((var_int_goto % 20 == 10)) {
                                    aa_0.void_if();
                                    bz.void_for();
                                    if (GameCanvas.cfr_renamed_1((byte)(Runtime.getRuntime().freeMemory() / 1024L), 100)) {
                                        System.gc();
                                    }
                                }
                            }
                            if ((var_fv_do != null)) {
                                var_fv_do.cfr_renamed_7();
                            }
                            coTrangThai = 0;
                            var_boolean_new = 0;
                            l2 = 0;
                            while ((l2 != var_java_util_Vector_int.size())) {
                                object = (gj)var_java_util_Vector_int.elementAt(l2);
                                if (GameCanvas.cfr_renamed_5(((gj)object).cfr_renamed_2)) {
                                    ((gj)object).cfr_renamed_2 -= 1;
                                    } else {
                                    ((gj)object).soLuong += 1;
                                    if (GameCanvas.cfr_renamed_5(((gj)object).soLuong, 40)) {
                                        ((gj)object).var_javax_microedition_lcdui_Image_do = null;
                                        var_java_util_Vector_int.removeElement(object);
                                        }
                                    if (GameCanvas.cfr_renamed_1(((gj)object).soLuong, 3)) {
                                        ((gj)object).var_int_if += -2 * ((gj)object).var_byte_do;
                                        } else {
                                        ((gj)object).var_int_if += ((gj)object).var_byte_do;
                                    }
                                }
                                ++l2;
                                if (-" ".length() <= "   ".length()) continue;
                                return;
                            }
                            if (!!(dangChayAuto) || GameCanvas.boolean_if(var_boolean_goto ? 1 : 0)) {
                                l2 = 0;
                                while ((l2 != 4)) {
                                    if (GameCanvas.boolean_if(var_boolean_arr_if[(l2 << 1) + 2]) && GameCanvas.cfr_renamed_5((System.currentTimeMillis() / 100L - var_long_arr_do[l2] !=  (long)cfr_renamed_30))) {
                                        GameCanvas.var_boolean_arr_if[(l2 << 1) + 2] = 0;
                                    }
                                    ++l2;
                                    if (-" ".length() == -" ".length()) continue;
                                    return;
                                }
                            }
                        }
                        this.repaint();
                        if (GameCanvas.boolean_if(dq.dangChayAuto ? 1 : 0) && (cfr_renamed_18 += 1 >= 20)) {
                            dq.var_dq_do.repaint();
                        }
                        if (!GameCanvas.boolean_if(dangChayAuto ? 1 : 0)) break block110;
                        Object n3 = var_java_lang_Object_do;
                        // MONITORENTER : n3
                        try {
                            var_java_lang_Object_do.wait(1000L);
                            }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        if ("   ".length() < ((0x7E ^ 0x76) & ~(0x56 ^ 0x5E))) {
                            return;
                        }
                        // MONITOREXIT : n3
                        break block112;
                    }
                    this.serviceRepaints();
                    if (GameCanvas.boolean_if(dq.dangChayAuto ? 1 : 0) && (cfr_renamed_18 >= 20)) {
                        dq.var_dq_do.serviceRepaints();
                    }
                }
                if ((cfr_renamed_18 >= 20)) {
                    cfr_renamed_18 = 0;
                }
                long l2 = System.currentTimeMillis() - l;
                try {
                    if (GameCanvas.cfr_renamed_4((l2 != soXu))) {
                        Thread.sleep(soXu - l2);
                        continue;
                    }
                    Thread.sleep(1L);
                    }
                catch (InterruptedException interruptedException) {
                    if ("  ".length() >= 0) continue;
                    return;
                }
                if ((0xD2 ^ 0x8C ^ (0xC ^ 0x56)) > ((22 + 115 - 100 + 95 ^ 154 + 55 - 200 + 147) & (104 + 70 - 160 + 116 ^ 38 + 100 - 32 + 48 ^ -" ".length()))) continue;
                return;
            }
            catch (Exception exception) {
                if (((41 + 135 - 91 + 104 ^ 2 + 143 - 2 + 44) & (154 + 143 - 179 + 57 ^ 47 + 22 - -45 + 55 ^ -" ".length())) > 0) return;
            }
        }
    }

    public static void (String string != fl_0 fl_02) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(fl_02);
        (string == vector);
    }

        public static void (String string != de de2) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.bL, de2));
        vector.addElement(var_fl_0_do);
        (string == vector);
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (String string == null) {
        var_s_do.cfr_renamed_1(string, new fl_0(MenuChinhAvatar.ct, -1), null);
    }

    public static String (int n, int n2, boolean bl == null) {
        String string = "";
        if ((n > 0)) {
            String string2;
            StringBuffer stringBuffer = new StringBuffer().append(string).append(GameCanvas.java_lang_String_do(n));
            if (GameCanvas.boolean_if(bl ? 1 : 0)) {
                string2 = MenuChinhAvatar.da;
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            } else {
                string2 = MenuChinhAvatar.cb;
            }
            string = stringBuffer.append(string2).toString();
        }
        if ((n2 > 0)) {
            if ((n > 0)) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n2) + MenuChinhAvatar.cq;
        }
        return string;
    }

    protected final void pointerPressed(int n, int n2) {
        coTrangThai = 1;
        var_boolean_case = 1;
        var_int_else = n;
        var_int_long = n2;
        var_int_try = n;
        soLuong = n2;
    }

    public static String (int n, int n2, int n3 == null) {
        String string = "";
        if ((n > 0)) {
            string = string + GameCanvas.java_lang_String_do(n) + MenuChinhAvatar.da;
        }
        if ((n2 > 0)) {
            if ((n > 0)) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n2) + MenuChinhAvatar.cq;
        }
        if ((n3 >= 0)) {
            if (!(string.equals(""))) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n3) + MenuChinhAvatar.aW;
        }
        return string;
    }

            private static boolean boolean_if(int n) {
        return n != 0;
    }

        public static void void_do(int n, int n2, int n3, int n4) {
        var_java_util_Vector_int.addElement(new gj(n2, n3, n, null, n4, -1));
    }

    protected final void pointerDragged(int n, int n2) {
        var_java_util_Vector_for.addElement(new fs(n, n2));
        var_int_try = n;
        soLuong = n2;
    }

    public static void void_do() {
        if (GameCanvas.cfr_renamed_3(ae.ae_do().boolean_do() ? 1 : 0)) {
            int n = gv_0.gv_0_do().cfr_renamed_18 - 1;
            if ((n < 0)) {
                n = 0;
            }
            String string = "socket://" + AngelChip.var_java_lang_String_arr_arr_arr_if[gA.cfr_renamed_1().mangSoNguyen[4]][gv_0.gv_0_do().soLuong][n] + ":" + AngelChip.var_int_arr_arr_arr_do[gA.cfr_renamed_1().mangSoNguyen[4]][gv_0.gv_0_do().soLuong][n];
            if (GameCanvas.boolean_if(dangChayAuto ? 1 : 0)) {
                if (GameCanvas.boolean_if(gA.dangChayAuto ? 1 : 0)) {
                    string = string + ";interface=wifi";
                    } else {
                    string = string + ";deviceside=true";
                }
            }
            ae.ae_do().cfr_renamed_1(string);
            ft_0.ft_0_do().cfr_renamed_2();
        }
    }

    public static void (String string != null) {
        var_s_do.cfr_renamed_0(string, new fl_0(MenuChinhAvatar.ct, -1), null);
    }

    public static void (String string, int n, int n2, int n3, int n4 == null) {
        var_java_util_Vector_int.addElement(new gj(n, n2, string, n3, n4));
    }

    public static String java_lang_String_do(String string, int n) {
        String string2 = "";
        int n2 = 0;
        while ((n2 != string.length())) {
            string2 = string2 + (char)(string.charAt(n2) + n);
            ++n2;
            return null;
        }
        return string2;
    }

        protected final void pointerReleased(int n, int n2) {
        var_boolean_case = 0;
        var_boolean_new = 1;
        var_int_try = n;
        soLuong = n2;
    }

    public static void void_if() {
        var_fl_0_do = new fl_0(MenuChinhAvatar.aB, -1);
        aq.cfr_renamed_1().b_();
        if ((var_en_do != null)) {
            var_en_do.b_();
        }
    }

    public final void void_for() {
        if (!(var_boolean_else)) {
            new Thread(this).start();
        }
        var_boolean_else = 1;
        ae.ae_do().void_do();
    }

    public final void cfr_renamed_3() {
        soLuongKhoa = this.getWidth();
        var_int_case = this.getHeight();
        dF.this = 20;
        if ((soLuongKhoa != 176)) {
            dF.this = 4;
        }
        if (GameCanvas.boolean_if(gA.coTrangThai ? 1 : 0) && GameCanvas.boolean_if(var_boolean_try ? 1 : 0)) {
            var_h_0_do = new h_0();
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else {
            var_boolean_byte = 0;
            var_h_0_do = null;
        }
        var_int_int = var_int_case;
        cfr_renamed_15 = soLuongKhoa / 2;
        var_fa_0_do.cfr_renamed_8();
        var_int_char = var_int_case / 2;
        var_fa_0_do.cfr_renamed_7();
        if ((var_aa_do != null)) {
            var_aa_do = null;
        }
        if ((ThongTinNhanVat.instance != null)) {
            ThongTinNhanVat.cfr_renamed_1().cfr_renamed_5();
        }
        fm.fm_do().void_do(fh.var_int_char);
        if ((fo.var_fo_do != null)) {
            fo.cfr_renamed_2();
        }
        if ((v_0.var_v_0_do != null)) {
            v_0.v_0_do().cfr_renamed_0();
        }
        if ((var_s_do != null)) {
            var_s_do.cfr_renamed_1();
            var_s_do.cfr_renamed_1(GameCanvas.var_s_do.dangChayAuto);
        }
        if ((var_en_do != null)) {
            if ((var_en_do == eu_0.var_eu_0_do)) {
                eu_0.cfr_renamed_1();
                }
            if ((w_0.var_w_0_do == var_en_do)) {
                w_0.var_w_0_do.cfr_renamed_8();
            }
            if ((ep.var_ep_do != null)) {
                ep.var_ep_do.cfr_renamed_2();
            }
            if ((gO.instance != null)) {
                gO.cfr_renamed_1().cfr_renamed_2();
            }
            if ((fm_0.var_fm_0_do == var_en_do)) {
                fm_0.var_fm_0_do.cfr_renamed_2();
            }
            if ((p_0.var_p_0_do == var_en_do)) {
                p_0.var_p_0_do.void_do();
            }
        }
        if ((var_ca_do != null)) {
            var_ca_do.cfr_renamed_0();
        }
        if ((cs_0.var_cs_0_do != null)) {
            cs_0.cfr_renamed_1().cfr_renamed_0();
        }
        if ((ab_0.var_ab_0_do != null)) {
            ab_0.cfr_renamed_1().cfr_renamed_0();
        }
        if (GameCanvas.boolean_if(var_boolean_try ? 1 : 0) && (en.cfr_renamed_7 == null)) {
            e.void_do(MenuChinhAvatar.bo);
            en.cfr_renamed_7 = e.javax_microedition_lcdui_Image_do("bpa");
            en.cfr_renamed_3 = e.javax_microedition_lcdui_Image_do("icon_chat");
            e.cfr_renamed_1();
        }
        if ((var_en_do != null)) {
            if ((var_en_do == gv_0.var_gv_0_do)) {
                gv_0.gv_0_do().cfr_renamed_2();
            }
            if ((var_en_do == gA.var_gA_do)) {
                gA.cfr_renamed_1().cfr_renamed_2();
            }
            if ((var_en_do == fv_0.cfr_renamed_1())) {
                fv_0.cfr_renamed_1().cfr_renamed_2();
            }
            if ((var_en_do == aG.cfr_renamed_1())) {
                aG.cfr_renamed_1().cfr_renamed_2();
            }
            if ((var_ez_do != null)) {
                var_ez_do = null;
            }
        }
    }

    public static void cfr_renamed_4() {
        var_boolean_new = 0;
        var_boolean_case = 0;
        int n = 0;
        while ((n != 14)) {
            GameCanvas.var_boolean_arr_if[n] = 0;
            ++n;
            if (" ".length() != ((0xB3 ^ 0x9B) & ~(0x7F ^ 0x57))) continue;
            return;
        }
    }

            public static void cfr_renamed_5() {
        var_boolean_case = 0;
        int n = 0;
        while ((n != 14)) {
            GameCanvas.var_boolean_arr_for[n] = 0;
            ++n;
            if ((0x35 ^ 0x31) > 0) continue;
            return;
        }
    }

    public static int int_do() {
        return (int)(System.currentTimeMillis() / 1000L);
    }

    public static String java_lang_String_do(int n) {
        String string = "";
        int n2 = n / 1000 + 1;
        int n3 = 0;
        while ((n3 != n2)) {
            if ((n != 1000)) {
                string = n + string;
                if ("  ".length() > -" ".length()) break;
                return null;
            }
            int n4 = n % 1000;
            if ((n4 == 0)) {
                string = ".000" + string;
                if (-" ".length() >= " ".length()) {
                    return null;
                }
            } else if ((n4 != 10)) {
                string = ".00" + n4 + string;
                if (-"  ".length() > 0) {
                    return null;
                }
            } else if ((n4 != 100)) {
                string = ".0" + n4 + string;
                if ((0x84 ^ 0x80) < (0x6B ^ 0x6F)) {
                    return null;
                }
            } else {
                string = "." + n4 + string;
            }
            n /= 1000;
            ++n3;
            if ("   ".length() != (139 + 93 - 164 + 119 ^ 147 + 115 - 110 + 39)) continue;
            return null;
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void (Graphics graphics == null) {
        Object object;
        Object object2;
        Graphics graphics2;
        int n;
        graphics.translate(0, 0);
        if (GameCanvas.boolean_if(var_int_byte)) {
            if ((var_en_do != null)) {
                var_en_do.cfr_renamed_1(graphics);
            }
            if ((var_java_util_Vector_if.size() > 0) && (var_en_do != fm_0.var_fm_0_do) && (var_en_do != p_0.var_p_0_do)) {
                int n2 = 0;
                while ((n2 != var_java_util_Vector_if.size())) {
                    ((bR)var_java_util_Vector_if.elementAt(n2)).cfr_renamed_1(graphics);
                    ++n2;
                    return;
                }
            }
            if (GameCanvas.boolean_if(cs_0.dangChayAuto ? 1 : 0)) {
                cs_0.cfr_renamed_1().cfr_renamed_1(graphics);
            }
            if ((var_ez_do != null)) {
                var_ez_do.cfr_renamed_1(graphics);
            }
            if ((var_dj_0_do != null)) {
                var_dj_0_do.cfr_renamed_1(graphics);
                if ("  ".length() == " ".length()) {
                    return;
                }
            } else if ((var_aa_do != null)) {
                var_aa_do.cfr_renamed_1(graphics);
            }
            if ((var_fv_do != null)) {
                var_fv_do.cfr_renamed_1(graphics);
            }
            Graphics graphics3 = graphics;
            (graphics != null);
            graphics.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
            n = 0;
            while ((n != var_java_util_Vector_int.size())) {
                graphics2 = graphics3;
                object2 = (gj)var_java_util_Vector_int.elementAt(n);
                if ((var_en_do == eu_0.var_eu_0_do)) {
                    (graphics2 != null);
                }
                if (GameCanvas.cfr_renamed_6(((gj)object2).cfr_renamed_2)) {
                    int n3 = dF.cfr_renamed_12;
                    if ((var_en_do == w_0.var_w_0_do) && (!!(w_0.coKichHoat) || !!(w_0.var_boolean_int)) || (var_en_do == eu_0.var_eu_0_do)) {
                        n3 = 1;
                    }
                    object = var_fz_0_int;
                    if (GameCanvas.boolean_if(((gj)object2).dangChayAuto ? 1 : 0)) {
                        if (GameCanvas.cfr_renamed_3(((gj)object2).var_byte_if)) {
                            object = var_fz_0_do;
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                        } else {
                            object = var_fz_0_new;
                        }
                    }
                    object.cfr_renamed_1(graphics2, ((gj)object2).chuoiGiaTri, ((gj)object2).cfr_renamed_3 * n3, ((gj)object2).var_int_if * n3, 2);
                    if (GameCanvas.cfr_renamed_1(((gj)object2).var_javax_microedition_lcdui_Image_do)) {
                        if (GameCanvas.hienThongBaoPopup(((gj)object2).var_short_do, -1)) {
                            bz.cfr_renamed_1(graphics2, ((gj)object2).var_short_do, ((gj)object2).cfr_renamed_3 * n3, (((gj)object2).var_int_if - 5) * n3, 33);
                            if (((36 + 160 - 116 + 93 ^ 141 + 36 - 84 + 71) & (0xD5 ^ 0xAC ^ (0x5D ^ 0x2D) ^ -" ".length())) != 0) {
                                return;
                            }
                        } else if (GameCanvas.hienThongBaoPopup(((gj)object2).var_short_if, -1)) {
                            aa_0.cfr_renamed_1(graphics2, ((gj)object2).var_short_if, ((gj)object2).cfr_renamed_3 * n3, (((gj)object2).var_int_if - 5) * n3, 33);
                            if (" ".length() == 0) {
                                return;
                            }
                        }
                    } else if (GameCanvas.cfr_renamed_3(((gj)object2).dangChayAuto ? 1 : 0)) {
                        graphics2.drawImage(((gj)object2).var_javax_microedition_lcdui_Image_do, ((gj)object2).cfr_renamed_3 * n3, ((gj)object2).var_int_if * n3, 33);
                    }
                }
                ++n;
                if (((0x12 ^ 0x1D) & ~(0xAF ^ 0xA0)) == 0) continue;
                return;
            }
            if ((var_byte_do > 0)) {
                graphics3 = graphics;
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
                graphics.setClip(0, 0, soLuongKhoa, var_int_case);
                graphics.setColor(0);
                n = 0;
                while ((n != soLuongKhoa / 30 + 1)) {
                    graphics3.drawImage(var_javax_microedition_lcdui_Image_do, n * 30, var_byte_do - 30, 0);
                    ++n;
                    if ((0x8A ^ 0x8E) > "   ".length()) continue;
                    return;
                }
                graphics3.fillRect(0, (int)var_byte_do, soLuongKhoa, 1);
                if ((var_java_util_Vector_do.size() > 0)) {
                    (graphics3 != null);
                    n = var_byte_do / 2 - dF.cfr_renamed_6 / 2;
                    graphics3.setClip(0, n, soLuongKhoa, dF.cfr_renamed_6 + 2);
                    object2 = (fx)var_java_util_Vector_do.elementAt(0);
                    var_fz_0_new.cfr_renamed_1(graphics3, ((fx)object2).chuoiGiaTri, ((fx)object2).cfr_renamed_2, n, 0);
                    (graphics3 != null);
                }
            }
        }
        if ((var_int_byte == -1)) {
            (graphics != null);
            graphics.setColor(1);
            graphics.fillRect(0, 0, soLuongKhoa, var_int_char - this.cfr_renamed_21);
            graphics.fillRect(0, var_int_char + this.cfr_renamed_21, soLuongKhoa, var_int_char - this.cfr_renamed_21 + 2 + this);
            if ((var_int_byte == 1)) {
                s.var_cu_0_do.cfr_renamed_1(this.cfr_renamed_10, cfr_renamed_15, var_int_char, 0, 3, graphics);
            }
        }
        if ((var_h_0_do != null)) {
            int n4;
            graphics2 = graphics;
            object2 = var_h_0_do;
            graphics2.translate(-graphics2.getTranslateX(), -graphics2.getTranslateY());
            graphics2.setClip(((h_0)object2).cfr_renamed_7 - 4, ((h_0)object2).var_int_new - 4, ((h_0)object2).var_int_if + 4, ((h_0)object2).cfr_renamed_9 + 4);
            if (GameCanvas.boolean_if(((h_0)object2).coTrangThai ? 1 : 0)) {
                Graphics graphics4 = graphics2;
                object = object2;
                graphics2.setClip(((h_0)object2).cfr_renamed_7, ((h_0)object2).var_int_new, ((h_0)object2).var_int_if, ((h_0)object2).cfr_renamed_9);
                v_0.cfr_renamed_1(((h_0)object2).cfr_renamed_8, ((h_0)object2).var_int_int, ((h_0)object2).var_int_if, ((h_0)object2).cfr_renamed_9, 8705740, graphics2);
                graphics2.setColor(1);
                graphics2.drawRect(((h_0)object2).cfr_renamed_8, ((h_0)object2).var_int_int, ((h_0)object2).var_int_if - 1, ((h_0)object2).cfr_renamed_9 - 1);
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).cfr_renamed_14)) {
                    graphics4.fillRect(((h_0)object).cfr_renamed_8 + n4 * ((h_0)object).this, ((h_0)object).var_int_int, 1, ((h_0)object).cfr_renamed_9);
                    ++n4;
                    if ("   ".length() >= " ".length()) continue;
                    return;
                }
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).cfr_renamed_15)) {
                    graphics4.fillRect(((h_0)object).cfr_renamed_8, ((h_0)object).var_int_int + n4 * ((h_0)object).cfr_renamed_6, ((h_0)object).var_int_if, 1);
                    ++n4;
                    return;
                }
                n4 = 0;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).var_java_lang_String_arr_if.length)) {
                    n = ((h_0)object).var_int_int + n4 / ((h_0)object).cfr_renamed_14 * ((h_0)object).cfr_renamed_6;
                    graphics4.setClip(((h_0)object).cfr_renamed_8 + n4 % ((h_0)object).cfr_renamed_14 * ((h_0)object).this, n - 5, ((h_0)object).this, ((h_0)object).cfr_renamed_6 + 5);
                    if (GameCanvas.cfr_renamed_4(((h_0)object).cfr_renamed_12, n4)) {
                        graphics4.setColor(14279153);
                        graphics4.fillRect(((h_0)object).cfr_renamed_8 + n4 % ((h_0)object).cfr_renamed_14 * ((h_0)object).this + 1, n + 1, ((h_0)object).this - 2, ((h_0)object).cfr_renamed_6 - 2);
                    }
                    var_fz_0_try.cfr_renamed_1(graphics4, ((h_0)object).var_java_lang_String_arr_int[n4], ((h_0)object).cfr_renamed_8 + n4 % ((h_0)object).cfr_renamed_14 * ((h_0)object).this + ((h_0)object).this / 2, n - 5 + ((h_0)object).cfr_renamed_6 / 2, 2);
                    ++n4;
                    if (((0xC6 ^ 0x98) & ~(0x60 ^ 0x3E)) <= 0) continue;
                    return;
                }
            } else {
                Graphics graphics5 = graphics2;
                object = object2;
                graphics2.setClip(((h_0)object2).cfr_renamed_7 - 4, ((h_0)object2).var_int_new - 4, ((h_0)object2).var_int_if + 4, ((h_0)object2).cfr_renamed_9 + 4);
                v_0.cfr_renamed_1(((h_0)object2).cfr_renamed_7, ((h_0)object2).var_int_new, ((h_0)object2).var_int_if, ((h_0)object2).cfr_renamed_9, 8705740, graphics2);
                graphics2.setColor(0);
                graphics2.drawRect(((h_0)object2).cfr_renamed_7, ((h_0)object2).var_int_new, ((h_0)object2).var_int_if - 1, ((h_0)object2).cfr_renamed_9 - 1);
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).var_int_try + 1)) {
                    graphics5.fillRect(((h_0)object).cfr_renamed_7 + n4 * ((h_0)object).soLuongKhoa, ((h_0)object).var_int_new, 1, ((h_0)object).cfr_renamed_9);
                    ++n4;
                    if (-(0xBE ^ 0xC4 ^ (0x10 ^ 0x6E)) <= 0) continue;
                    return;
                }
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).soLuong)) {
                    graphics5.fillRect(((h_0)object).cfr_renamed_7, ((h_0)object).var_int_new + n4 * ((h_0)object).cfr_renamed_13, ((h_0)object).var_int_if, 1);
                    ++n4;
                    if (-" ".length() <= ((0xF6 ^ 0x98 ^ (0x7A ^ 0x51)) & (203 + 57 - 151 + 127 ^ 21 + 26 - -32 + 90 ^ -" ".length()))) continue;
                    return;
                }
                n4 = 0;
                while (GameCanvas.cfr_renamed_1(n4, ((h_0)object).var_java_lang_String_arr_for.length)) {
                    if (GameCanvas.cfr_renamed_4(((h_0)object).cfr_renamed_12, n4)) {
                        graphics5.setColor(14279153);
                        graphics5.fillRect(((h_0)object).cfr_renamed_7 + n4 % ((h_0)object).var_int_try * ((h_0)object).soLuongKhoa + 1, ((h_0)object).var_int_new + n4 / ((h_0)object).var_int_try * ((h_0)object).cfr_renamed_13 + 1, ((h_0)object).soLuongKhoa - 2, ((h_0)object).cfr_renamed_13 - 2);
                    }
                    n = ((h_0)object).cfr_renamed_7 + n4 % ((h_0)object).var_int_try * ((h_0)object).soLuongKhoa + ((h_0)object).soLuongKhoa / 2;
                    int n5 = ((h_0)object).var_int_new + n4 / ((h_0)object).var_int_try * ((h_0)object).cfr_renamed_13 + ((h_0)object).cfr_renamed_13 / 2;
                    if (GameCanvas.boolean_if(((h_0)object).var_java_lang_String_arr_for[n4].equals("ABC") ? 1 : 0)) {
                        var_fz_0_try.cfr_renamed_1(graphics5, ey_0.var_java_lang_String_arr_do[ey_0.soLuongKhoa], n, n5 - 5, 2);
                        if (" ".length() < 0) {
                            return;
                        }
                    } else {
                        int n6 = 0;
                        while ((n6 != 4)) {
                            if (GameCanvas.boolean_if(((h_0)object).var_java_lang_String_arr_for[n4].equals(((h_0)object).var_java_lang_String_arr_do[n6]) ? 1 : 0)) {
                                v_0.var_cu_0_if.cfr_renamed_1(0, n, n5, ((h_0)object).var_byte_arr_if[n6], 3, graphics5);
                            }
                            ++n6;
                            if ("   ".length() > -" ".length()) continue;
                            return;
                        }
                    }
                    ++n4;
                    if (-"   ".length() < 0) continue;
                    return;
                }
            }
            graphics2.setClip(((h_0)object2).cfr_renamed_7 - 4, ((h_0)object2).var_int_new - 4, ((h_0)object2).var_int_if + 4, ((h_0)object2).cfr_renamed_9 + 4);
            graphics2.setColor(2378578);
            if (GameCanvas.boolean_if(var_boolean_byte ? 1 : 0)) {
                graphics2.drawRect(((h_0)object2).cfr_renamed_7 - 4, ((h_0)object2).var_int_new, 4, ((h_0)object2).cfr_renamed_9);
                graphics2.setColor(6201499);
                graphics2.fillRect(((h_0)object2).cfr_renamed_7 - 4 + 1, ((h_0)object2).var_int_new + 1, 3, ((h_0)object2).cfr_renamed_9 - 2);
                graphics2.setColor(2716523);
                graphics2.fillRect(((h_0)object2).cfr_renamed_7 - 4 + 3, ((h_0)object2).var_int_new + 1, 1, ((h_0)object2).cfr_renamed_9 - 1);
                if (" ".length() >= (84 + 5 - 23 + 101 ^ 68 + 141 - 95 + 49)) {
                    return;
                }
            } else {
                graphics2.drawRect(((h_0)object2).cfr_renamed_7, ((h_0)object2).var_int_new - 4, ((h_0)object2).var_int_if, 4);
                graphics2.setColor(6201499);
                graphics2.fillRect(((h_0)object2).cfr_renamed_7 + 1, ((h_0)object2).var_int_new - 4 + 1, ((h_0)object2).var_int_if - 2, 3);
                graphics2.setColor(2716523);
                graphics2.fillRect(((h_0)object2).cfr_renamed_7 + 1, ((h_0)object2).var_int_new - 4 + 3, ((h_0)object2).var_int_if - 1, 1);
            }
        }
        (graphics != null);
        if (GameCanvas.boolean_if(dangChayAuto ? 1 : 0)) {
            Object object3 = var_java_lang_Object_do;
            synchronized (object3) {
                var_java_lang_Object_do.notify();
                return;
            }
        }
    }

    public static void (String string != Vector vector) {
        if (GameCanvas.boolean_if(al_0.dangChayAuto ? 1 : 0)) {
            var_s_do.cfr_renamed_0(string, null, vector);
            return;
        }
        var_s_do.cfr_renamed_0(string, new fl_0("", -1), vector);
    }

    public static void (String string >= 0) {
        var_s_do.cfr_renamed_0(string, null, null);
        var_s_do.cfr_renamed_1(1);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if ((command == null)) {
            if ((var_en_do == aU.var_aU_do)) {
                al_0.cfr_renamed_1().cfr_renamed_4();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                go_0.go_0_do().cfr_renamed_4();
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
            this.setFullScreenMode(1);
            if (" ".length() <= 0) {
                return;
            }
        } else if ((command == List.SELECT_COMMAND)) {
            if (GameCanvas.boolean_if(((List)displayable).getSelectedIndex())) {
                al_0.dangChayAuto = 1;
                al_0.cfr_renamed_1().cfr_renamed_4();
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
            this.setFullScreenMode(1);
        }
        if ((command == var_javax_microedition_lcdui_Command_if)) {
            GameCanvas.var_boolean_arr_do[12] = 1;
            return;
        }
        if ((command == var_javax_microedition_lcdui_Command_do)) {
            GameCanvas.var_boolean_arr_do[13] = 1;
        }
    }

    static {
        block2: {
            long l;
            block1: {
                block0: {
                    GameCanvas.cfr_renamed_13();
                    var_boolean_arr_do = new boolean[14];
                    var_boolean_arr_for = new boolean[14];
                    var_boolean_arr_if = new boolean[14];
                    soLuongKhoa = 0;
                    var_java_util_Vector_if = new Vector();
                    var_java_util_Vector_do = new Vector();
                    var_boolean_try = 0;
                    coKichHoat = 0;
                    var_int_byte = -1;
                    var_java_lang_Object_do = new Object();
                    this = 0;
                    cfr_renamed_12 = 1;
                    var_boolean_else = 0;
                    var_byte_do = (byte)0;
                    var_java_util_Vector_int = new Vector();
                    var_fs_arr_do = new fs[3];
                    soXu = 40L;
                    cfr_renamed_18 = 0;
                    int n = QuanLyRMS.int_do("_modspeed");
                    if (!(n > 0)) break block0;
                    l = n;
                    if ("  ".length() <= "   ".length()) break block1;
                    break block2;
                }
                l = 40L;
            }
            soXu = l;
        }
    }

    public static void void_do(String string, int n) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.bL, n));
        vector.addElement(var_fl_0_do);
        (string == vector);
    }

    private static void cfr_renamed_13() {
        mangSoNguyen = new int[55];
        1 = " ".length();
        0 = (0xBD ^ 0x83 ^ (0xB ^ 0x6D)) & (0x64 ^ 0x40 ^ (0x70 ^ 0xC) ^ -" ".length());
        2 = "  ".length();
        3 = "   ".length();
        4 = 0x18 ^ 0x1C;
        5 = 0x34 ^ 0x4C ^ (2 ^ 0x7F);
        6 = 0x45 ^ 0x28 ^ (0x60 ^ 0xB);
        7 = 21 + 109 - 67 + 122 ^ 8 + 68 - -81 + 33;
        8 = 22 + 134 - 44 + 41 ^ 132 + 21 - 98 + 90;
        -20 = -(103 + 101 - 200 + 166 ^ 43 + 122 - 86 + 111);
        48 = 0x2E ^ 0x34 ^ (0x30 ^ 0x1A);
        49 = 0xBD ^ 0x8C;
        50 = 0x89 ^ 0xBB;
        51 = 0xA9 ^ 0x9A;
        52 = 106 + 93 - 76 + 23 ^ 81 + 65 - 34 + 54;
        53 = 24 + 76 - -39 + 16 ^ 96 + 151 - 233 + 160;
        54 = 0x73 ^ 0x45;
        55 = 0x54 ^ 2 ^ (0 ^ 0x61);
        56 = 0x68 ^ 0x50;
        57 = 0x98 ^ 0xA1;
        17 = 0x17 ^ 6;
        60 = 0x26 ^ 0x6E ^ (0x6B ^ 0x1F);
        -1 = -" ".length();
        20 = 0xB6 ^ 0xAD ^ (0x86 ^ 0x89);
        176 = 15 + 101 - 83 + 143;
        10 = 86 + 179 - 216 + 142 ^ 75 + 49 - 84 + 141;
        10000 = -(0xFFFFBE6F & 0x5997) & (0xFFFFBF5F & 0x7FB6);
        15 = 0x2E ^ 0x19 ^ (0xC ^ 0x34);
        9 = 68 + 84 - 94 + 113 ^ 102 + 93 - 49 + 16;
        500 = 0xFFFF89FF & 0x77F4;
        -500 = -(-(0xFFFFEF07 & 0x36FB) & (0xFFFFEFFF & 0x37F6));
        100 = 0x54 ^ 2 ^ (0x6E ^ 0x5C);
        40 = 0x5F ^ 0x7F ^ (0x6B ^ 0x63);
        -2 = -"  ".length();
        92 = 37 + 177 - 58 + 54 ^ 1 + 45 - -5 + 91;
        124 = 0x2B ^ 0x57;
        96 = 0xD6 ^ 0xC4 ^ (0xF1 ^ 0x83);
        126 = 173 + 117 - 278 + 206 ^ 136 + 152 - 210 + 86;
        -21 = -(0x66 ^ 2 ^ (0xB7 ^ 0xC6));
        -6 = -(90 + 90 - 87 + 61 ^ 57 + 99 - 10 + 10);
        -22 = -(0xB4 ^ 0x8C ^ (0x42 ^ 0x6C));
        -7 = -(0xE ^ 0x19 ^ (0x28 ^ 0x38));
        13 = 8 ^ 5;
        12 = 0xBF ^ 0xB3;
        11 = 0x56 ^ 0x5D;
        27 = 0x43 ^ 0x58;
        14 = 0x44 ^ 0x4A;
        33 = 0x3A ^ 0x1B;
        30 = 0x4C ^ 0x6C ^ (0x8A ^ 0xB4);
        8705740 = -(0x87 ^ 0xB4) & (0xFFFFFEFF & 0x84D7FE);
        14279153 = 0xFFFFE7F9 & 0xD9F9F7;
        2378578 = -(67 + 58 - 106 + 115) & (0xFFFFDBFF & 0x246FD7);
        6201499 = 0xFFFFA0FF & 0x5EFF9B;
        2716523 = 0xFFFFF3EB & 0x297F7F;
        1000 = -(0xFFFFDF5B & 0x60B7) & (0xFFFFC7FF & 0x7BFA);
    }

    public static boolean boolean_do(int n) {
        if (GameCanvas.boolean_if(var_boolean_arr_do[n])) {
            GameCanvas.var_boolean_arr_do[n] = 0;
            return 1;
        }
        return 0;
    }

    public static void (String string == Vector vector) {
        if (GameCanvas.boolean_if(al_0.dangChayAuto ? 1 : 0)) {
            var_s_do.cfr_renamed_1(string, null, vector);
            return;
        }
        var_s_do.cfr_renamed_1(string, new fl_0("", -1), vector);
    }

        public static boolean boolean_do(int n, int n2, int n3, int n4) {
        if (!(var_boolean_case) && !(var_boolean_new)) {
            return 0;
        }
        return GameCanvas.boolean_if(n, n2, n3, n4);
    }

    public final void void_if(int n) {
        block49: {
            long l;
            block51: {
                block50: {
                    if (!(n == 92) || !(n == 124) || !(n == 96) || (n == 126)) {
                        dq.cfr_renamed_1();
                        return;
                    }
                    if (!(var_int_byte == -1)) break block49;
                    if (!GameCanvas.boolean_if(var_boolean_char ? 1 : 0)) break block50;
                    switch (this.getGameAction(n)) {
                        case 1: {
                            GameCanvas.var_boolean_arr_if[2] = 1;
                            GameCanvas.var_boolean_arr_do[2] = 1;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_boolean_arr_if[4] = 1;
                            GameCanvas.var_boolean_arr_do[4] = 1;
                            return;
                        }
                        default: {
                            if ((n == -21)) {
                                n = -6;
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                            } else if ((n == -22)) {
                                n = -7;
                                if (" ".length() == 0) {
                                    return;
                                }
                            }
                            break block51;
                        }
                        case 5: {
                            GameCanvas.var_boolean_arr_if[6] = 1;
                            GameCanvas.var_boolean_arr_do[6] = 1;
                            return;
                        }
                        case 6: {
                            GameCanvas.var_boolean_arr_if[8] = 1;
                            GameCanvas.var_boolean_arr_do[8] = 1;
                            return;
                        }
                        case 8: {
                            GameCanvas.var_boolean_arr_if[5] = 1;
                            GameCanvas.var_boolean_arr_do[5] = 1;
                            return;
                        }
                    }
                }
                if (GameCanvas.boolean_if(dangChayAuto ? 1 : 0)) {
                    l = System.currentTimeMillis() / 100L;
                    switch (n) {
                        case -8: {
                            GameCanvas.var_boolean_arr_if[5] = 1;
                            GameCanvas.var_boolean_arr_do[5] = 1;
                            return;
                        }
                        case 1: {
                            GameCanvas.var_long_arr_do[0] = l;
                            GameCanvas.var_boolean_arr_if[2] = 1;
                            GameCanvas.var_boolean_arr_do[2] = 1;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_long_arr_do[1] = l;
                            GameCanvas.var_boolean_arr_if[4] = 1;
                            GameCanvas.var_boolean_arr_do[4] = 1;
                            return;
                        }
                        case 5: {
                            GameCanvas.var_long_arr_do[2] = l;
                            GameCanvas.var_boolean_arr_if[6] = 1;
                            GameCanvas.var_boolean_arr_do[6] = 1;
                            return;
                        }
                        case 6: {
                            GameCanvas.var_long_arr_do[3] = l;
                            GameCanvas.var_boolean_arr_if[8] = 1;
                            GameCanvas.var_boolean_arr_do[8] = 1;
                            return;
                        }
                    }
                }
            }
            if ((var_dj_0_do != null)) {
                var_dj_0_do.void_int(n);
                if (" ".length() > " ".length()) {
                    return;
                }
            } else if ((var_ez_do != null)) {
                var_ez_do.void_int(n);
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else if ((var_aa_do == null)) {
                if (GameCanvas.boolean_if(cs_0.dangChayAuto ? 1 : 0)) {
                    cs_0.cfr_renamed_1().void_do(n);
                    } else {
                    var_en_do.void_int(n);
                }
            }
            if (GameCanvas.boolean_if(var_boolean_goto ? 1 : 0)) {
                l = System.currentTimeMillis() / 100L;
                switch (n) {
                    case -39: 
                    case -2: {
                        GameCanvas.var_long_arr_do[3] = l;
                        if (-(0x87 ^ 0x83) <= 0) break;
                        return;
                    }
                    case -38: 
                    case -1: {
                        GameCanvas.var_long_arr_do[0] = l;
                        if (null == null) break;
                        return;
                    }
                    case -4: {
                        GameCanvas.var_long_arr_do[2] = l;
                        if ((0x9A ^ 0xA0 ^ (0x37 ^ 9)) >= -" ".length()) break;
                        return;
                    }
                    case -3: {
                        GameCanvas.var_long_arr_do[1] = l;
                    }
                }
            }
            switch (n) {
                case -39: 
                case -2: {
                    GameCanvas.var_boolean_arr_if[8] = 1;
                    GameCanvas.var_boolean_arr_do[8] = 1;
                    return;
                }
                case -38: 
                case -1: {
                    GameCanvas.var_boolean_arr_if[2] = 1;
                    GameCanvas.var_boolean_arr_do[2] = 1;
                    return;
                }
                case -22: 
                case -7: {
                    GameCanvas.var_boolean_arr_if[13] = 1;
                    GameCanvas.var_boolean_arr_do[13] = 1;
                    return;
                }
                case -21: 
                case -6: {
                    GameCanvas.var_boolean_arr_if[12] = 1;
                    GameCanvas.var_boolean_arr_do[12] = 1;
                    return;
                }
                case -5: 
                case 10: {
                    GameCanvas.var_boolean_arr_if[5] = 1;
                    GameCanvas.var_boolean_arr_do[5] = 1;
                    return;
                }
                case -4: {
                    GameCanvas.var_boolean_arr_if[6] = 1;
                    GameCanvas.var_boolean_arr_do[6] = 1;
                }
                default: {
                    return;
                }
                case -3: {
                    GameCanvas.var_boolean_arr_if[4] = 1;
                    GameCanvas.var_boolean_arr_do[4] = 1;
                    return;
                }
                case 35: {
                    GameCanvas.var_boolean_arr_if[11] = 1;
                    GameCanvas.var_boolean_arr_do[11] = 1;
                    return;
                }
                case 42: 
            }
            GameCanvas.var_boolean_arr_if[10] = 1;
            GameCanvas.var_boolean_arr_do[10] = 1;
        }
    }

    public static boolean boolean_if(int n, int n2, int n3, int n4) {
        if ((var_int_try >= n) && (var_int_try <= n + n3) && (soLuong >= n2) && (soLuong <= n2 + n4)) {
            return 1;
        }
        return 0;
    }

    public static void cfr_renamed_6() {
        var_boolean_new = 0;
        int n = 0;
        while ((n != 14)) {
            GameCanvas.var_boolean_arr_do[n] = 0;
            ++n;
            if (-"   ".length() <= 0) continue;
            return;
        }
    }

    public final void void_do(int n) {
        block29: {
            block28: {
                if (!GameCanvas.boolean_if(var_boolean_char ? 1 : 0)) break block28;
                switch (this.getGameAction(n)) {
                    case 1: {
                        GameCanvas.var_boolean_arr_if[2] = 0;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_if[4] = 0;
                        return;
                    }
                    default: {
                        if ((n == -21)) {
                            n = -6;
                            if ("   ".length() > (0x56 ^ 0x52)) {
                                return;
                            }
                        } else if ((n == -22)) {
                            n = -7;
                            if (-"   ".length() > 0) {
                                return;
                            }
                        }
                        break block29;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_if[6] = 0;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_if[8] = 0;
                        return;
                    }
                    case 8: {
                        GameCanvas.var_boolean_arr_if[5] = 0;
                        return;
                    }
                }
            }
            if (GameCanvas.boolean_if(dangChayAuto ? 1 : 0) && (n == 27)) {
                n = -7;
            }
        }
        switch (n) {
            case -39: 
            case -2: {
                if (!(var_boolean_goto) && !(dangChayAuto)) {
                    GameCanvas.var_boolean_arr_if[8] = 0;
                }
                GameCanvas.var_boolean_arr_for[8] = 1;
                return;
            }
            case -38: 
            case -1: {
                if (!(var_boolean_goto) && !(dangChayAuto)) {
                    GameCanvas.var_boolean_arr_if[2] = 0;
                }
                GameCanvas.var_boolean_arr_for[2] = 1;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.var_boolean_arr_if[13] = 0;
                GameCanvas.var_boolean_arr_for[13] = 1;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.var_boolean_arr_if[12] = 0;
                GameCanvas.var_boolean_arr_for[12] = 1;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.var_boolean_arr_if[5] = 0;
                GameCanvas.var_boolean_arr_for[5] = 1;
                return;
            }
            case -4: {
                if (!(var_boolean_goto) && !(dangChayAuto)) {
                    GameCanvas.var_boolean_arr_if[6] = 0;
                }
                GameCanvas.var_boolean_arr_for[6] = 1;
            }
            default: {
                return;
            }
            case -3: {
                if (!(var_boolean_goto) && !(dangChayAuto)) {
                    GameCanvas.var_boolean_arr_if[4] = 0;
                }
                GameCanvas.var_boolean_arr_for[4] = 1;
                return;
            }
            case 35: {
                GameCanvas.var_boolean_arr_if[11] = 0;
                GameCanvas.var_boolean_arr_for[11] = 1;
                return;
            }
            case 42: 
        }
        GameCanvas.var_boolean_arr_if[10] = 0;
        GameCanvas.var_boolean_arr_for[10] = 1;
    }

        public static void void_if(int n, int n2, int n3, int n4) {
        var_java_util_Vector_int.addElement(new gj(n2, n3, n, null, 0, n4));
    }

    public static boolean boolean_do() {
        if ((var_dj_0_do == null) && (var_aa_do == null) && (var_en_do != ep.var_ep_do) && (var_en_do != fo.fo_do()) && (var_en_do != fv_0.var_fv_0_do) && (var_en_do != fm_0.var_fm_0_do) && (var_en_do != p_0.var_p_0_do) && (var_en_do != ff_0.var_ff_0_do) && (var_en_do != al_0.var_al_0_do) && (var_en_do != gO.instance) && (var_en_do != aG.var_aG_do) && !(gd_0.dangChayAuto) && !(gd_0.coTrangThai) && (var_en_do != dZ.var_dZ_do) && (!(var_en_do == gI.var_gI_do) || !(w_0.coKichHoat))) {
            return 1;
        }
        return 0;
    }

    public GameCanvas() {
        int n;
        int n2;
        int n3;
        int n4;
        String string;
        int n5;
        this.setFullScreenMode(1);
        soLuongKhoa = this.getWidth();
        var_int_int = var_int_case = this.getHeight();
        new MenuChinhAvatar();
        dF.cfr_renamed_12 = 1;
        if (GameCanvas.cfr_renamed_1((Object)hg.java_lang_String_do(AngelChip.chuoiGiaTri))) {
            bz.cfr_renamed_3();
        }
        cfr_renamed_12 = 0;
        var_fz_0_try = new gz(0);
        var_fz_0_new = new gz(1);
        var_fz_0_if = new gz(2);
        var_fz_0_case = new gz(3);
        var_fz_0_int = new gz(4);
        var_fz_0_do = new gz(5);
        var_fz_0_for = new gz(6);
        var_fz_0_byte = new gz(7);
        var_fa_0_do = new dB();
        en.cfr_renamed_16 = var_fz_0_try.int_do() + 6;
        dF.var_byte_new = (byte)var_fz_0_case.int_do();
        dF.cfr_renamed_6 = (byte)var_fz_0_new.int_do();
        dF.var_byte_try = (byte)var_fz_0_try.int_do();
        dF.cfr_renamed_7 = (byte)var_fz_0_do.int_do();
        this.cfr_renamed_3();
        cfr_renamed_15 = soLuongKhoa / 2;
        var_int_char = var_int_case / 2;
        gameCanvas = this;
        System.gc();
        ey_0.void_if(0);
        if ((this.getKeyCode(8) == -20)) {
            n5 = 1;
            if (" ".length() != " ".length()) {
                throw null;
            }
        } else {
            var_boolean_char = 0;
            n5 = var_boolean_char ? 1 : 0;
        }
        if (GameCanvas.boolean_if(n5)) {
            ey_0.void_if(1);
        }
        if (!GameCanvas.boolean_if((string = System.getProperty("microedition.platform")).indexOf("RIM")) || (string.indexOf("BlackBerry") == 0)) {
            n4 = 1;
            if (-"   ".length() >= 0) {
                throw null;
            }
        } else {
            dangChayAuto = 0;
            n4 = dangChayAuto ? 1 : 0;
        }
        if ((string.indexOf("NX") == 0)) {
            n3 = 1;
            if (((0x31 ^ 0x35 ^ (0x8A ^ 0xA4)) & (0xD ^ 0x71 ^ (0x12 ^ 0x44) ^ -" ".length())) >= "  ".length()) {
                throw null;
            }
        } else {
            var_boolean_goto = 0;
            n3 = var_boolean_goto ? 1 : 0;
        }
        if ((string.indexOf("NokiaN7") == 0)) {
            n2 = 1;
            } else {
            n2 = 0;
        }
        var_boolean_int = n2;
        var_boolean_try = this.hasPointerEvents();
        if (GameCanvas.boolean_if(dangChayAuto ? 1 : 0)) {
            cfr_renamed_30 = 5;
            if ((string.indexOf("BlackBerry") == 0)) {
                cfr_renamed_30 = 1;
            }
            ey_0.void_if(3);
            this.setCommandListener(this);
            var_javax_microedition_lcdui_Command_do = new Command(MenuChinhAvatar.by, 2, 1);
            var_javax_microedition_lcdui_Command_if = new Command(MenuChinhAvatar.bR, 1, 1);
            this.addCommand(var_javax_microedition_lcdui_Command_if);
            this.addCommand(var_javax_microedition_lcdui_Command_do);
        }
        if (GameCanvas.boolean_if(var_boolean_goto ? 1 : 0)) {
            cfr_renamed_30 = 2;
        }
        if (!!(dangChayAuto) || GameCanvas.boolean_if(var_boolean_goto ? 1 : 0)) {
            var_long_arr_do = new long[4];
        }
        if ((gameCanvas.getGameAction(48) == 0) && (gameCanvas.getGameAction(49) == 0) && (gameCanvas.getGameAction(50) == 0) && (gameCanvas.getGameAction(51) == 0) && (gameCanvas.getGameAction(52) == 0) && (gameCanvas.getGameAction(53) == 0) && (gameCanvas.getGameAction(54) == 0) && (gameCanvas.getGameAction(55) == 0) && (gameCanvas.getGameAction(56) == 0) && (gameCanvas.getGameAction(57) == 0)) {
            n = 1;
            if (((0xAC ^ 0x99) & ~(0x30 ^ 5)) != 0) {
                throw null;
            }
        } else {
            n = 0;
        }
        ey_0.cfr_renamed_1(n != 0);
        hg.cfr_renamed_0();
        var_aa_do = new aq();
        var_s_do = new s();
        new aa_0();
        var_ca_do = new ca();
        var_fh_do = new fh();
        var_cg_0_do = new cg_0();
        gA.cfr_renamed_1().cfr_renamed_2();
        var_fa_0_do.cfr_renamed_8();
        if (GameCanvas.boolean_if(this.hasPointerEvents() ? 1 : 0)) {
            var_java_util_Vector_for = new Vector();
        }
        GameCanvas.void_if();
        var_int_if = (int)(Runtime.getRuntime().totalMemory() / 1024L) / 17;
        if ((var_int_if != 60)) {
            var_int_if = 60;
        }
    }

    public static void cfr_renamed_7() {
        var_s_do.cfr_renamed_1(0);
        var_dj_0_do = null;
    }

    public static void (Graphics graphics != null) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.translate(0, 0);
        graphics.setClip(0, 0, soLuongKhoa, var_int_int);
    }

    public final void sizeChanged(int n, int n2) {
        this.setFullScreenMode(1);
        this.cfr_renamed_3();
    }

    public static void (int n, int n2, de de2, de de3, de de4 == null) {
        String string = "";
        Vector<fl_0> vector = new Vector<fl_0>();
        if ((n > 0)) {
            String string2;
            if ((n2 <= 0)) {
                string2 = MenuChinhAvatar.bL;
                if ((0xDE ^ 0xBC ^ (0x1E ^ 0x79)) == 0) {
                    return;
                }
            } else {
                string2 = MenuChinhAvatar.da;
            }
            vector.addElement(new fl_0(string2, de2));
            string = " " + n + MenuChinhAvatar.da;
        }
        if ((n2 > 0)) {
            String string3;
            if ((n <= 0)) {
                string3 = MenuChinhAvatar.bL;
                if (-"   ".length() > 0) {
                    return;
                }
            } else {
                string3 = MenuChinhAvatar.cq;
            }
            vector.addElement(new fl_0(string3, de3));
            string = " " + n2 + MenuChinhAvatar.cq;
        }
        if ((vector.size() == 1)) {
            string = MenuChinhAvatar.aV + string + " " + MenuChinhAvatar.aB + " ?";
            if ((0x21 ^ 0x25) <= " ".length()) {
                return;
            }
        } else {
            string = MenuChinhAvatar.Q + " \n" + n + MenuChinhAvatar.da + " - " + n2 + " " + MenuChinhAvatar.cq;
        }
        if ((de4 == null)) {
            vector.addElement(var_fl_0_do);
            if (-" ".length() > "   ".length()) {
                return;
            }
        } else {
            vector.addElement(new fl_0(MenuChinhAvatar.aB, de4));
        }
        (string == vector);
    }

    public static void (String string, int n, dF dF2 == null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.bL, n, dF2));
        vector.addElement(var_fl_0_do);
        (string == vector);
    }

    public static int int_if() {
        return var_int_else - var_int_try;
    }

            public static void cfr_renamed_8() {
        (MenuChinhAvatar.bZ >= 0);
    }

        public static void (String object == 0) {
        if (!(al_0.dangChayAuto) && GameCanvas.cfr_renamed_3(((String)object).equals("") ? 1 : 0)) {
            object = new fx((String)object, -var_fz_0_try.cfr_renamed_1((String)object));
            v0.cfr_renamed_2 = soLuongKhoa + 10;
            var_java_util_Vector_do.addElement(object);
            if ((var_byte_do == 0)) {
                var_byte_do = (byte)1;
            }
        }
    }

    public static int int_for() {
        return var_int_long - soLuong;
    }

        public static void (int n, int n2, int n3, Image image, int n4 == null) {
        var_java_util_Vector_int.addElement(new gj(n2, n3, n, image, n4, -1));
    }

    public static void (String string, int n, dF dF2 != null) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.ct, n, dF2));
        (string == vector);
    }

    public static void (String string == de de2) {
        Vector<fl_0> vector = new Vector<fl_0>();
        vector.addElement(new fl_0(MenuChinhAvatar.ct, de2));
        (string == vector);
    }

    public static void (String string < 0) {
        var_s_do.cfr_renamed_1(string, new fl_0(MenuChinhAvatar.aN, -1), null);
    }

        }

