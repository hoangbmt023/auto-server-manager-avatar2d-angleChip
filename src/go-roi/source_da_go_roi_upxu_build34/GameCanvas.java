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

/*
 * Renamed from br
 */
public final class GameCanvas
extends a
implements Runnable,
CommandListener {
    public static ew var_ew_do;
    public static h_0 var_h_0_do;
    public static boolean dangChayAuto;
    private static long[] var_long_arr_do;
    public static et_0 var_et_0_do;
    public static eq_0 var_eq_0_do;
    public static int soLuong;
    private static boolean var_boolean_char;
    private int cfr_renamed_17;
    public static boolean coTrangThai;
    public static boolean[] var_boolean_arr_do;
    public static Image var_javax_microedition_lcdui_Image_do;
    private int cfr_renamed_13;
    public static int var_int_if;
    public static ef_0 var_ef_0_do;
    public static boolean coKichHoat;
    public static eq_0[] var_eq_0_arr_do;
    public static ew var_ew_if;
    public static ew var_ew_for;
    public static boolean var_boolean_int;
    public static int soLuongKhoa;
    public static int var_int_int;
    private static Vector var_java_util_Vector_for;
    public static ew var_ew_int;
    public static ew var_ew_new;
    public static int var_int_new;
    public static Vector var_java_util_Vector_do;
    public static boolean var_boolean_new;
    private static Vector var_java_util_Vector_int;
    public static int var_int_try;
    public static ei var_ei_do;
    public static int var_int_byte;
    public static Vector var_java_util_Vector_if;
    public static int var_int_case;
    public static int var_int_char;
    public static int var_int_else;
    public static boolean var_boolean_try;
    public static ew var_ew_try;
    public static int var_int_goto;
    private static Command var_javax_microedition_lcdui_Command_do;
    public static ew var_ew_byte;
    public static GameCanvas gameCanvas;
    public static int var_int_long;
    public static int this;
    public static bt_0 var_bt_0_do;
    public static long soXu;
    public static e_0 var_e_0_do;
    private static int cfr_renamed_30;
    public static dX var_dX_do;
    public static boolean var_boolean_byte;
    private static boolean var_boolean_else;
    public static gj_0 var_gj_0_do;
    private static boolean var_boolean_goto;
    public static int cfr_renamed_16;
    public static ex var_ex_do;
    public static boolean var_boolean_case;
    public static byte var_byte_do;
    private int cfr_renamed_22;
    public static int cfr_renamed_6;
    public static ew var_ew_case;
    private static int cfr_renamed_19;
    private static boolean var_boolean_long;
    public static boolean[] var_boolean_arr_if;
    private static final int[] mangSoNguyen;
    public static boolean[] var_boolean_arr_for;
    public static dZ var_dZ_do;
    public static dL var_dL_do;
    private static Object var_java_lang_Object_do;
    private static Command var_javax_microedition_lcdui_Command_if;
    public static av var_av_do;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        var_boolean_char = 1;
        while ((var_boolean_char)) {
            try {
                long l;
                block108: {
                    int l2;
                    Object object;
                    block109: {
                        block110: {
                            block114: {
                                block113: {
                                    block112: {
                                        block111: {
                                            if ((this.cfr_renamed_17 > 0)) {
                                                this.cfr_renamed_17 -= 1;
                                                if ((this.cfr_renamed_17 == 0)) {
                                                    Display.getDisplay((MIDlet)AngelChip.midlet).vibrate(0);
                                                    }
                                            }
                                            l = System.currentTimeMillis();
                                            if ((var_int_try += 1 > 10000)) {
                                                var_int_try = 0;
                                            }
                                            if ((cfr_renamed_6 != -1)) {
                                                if ((cfr_renamed_6 != 1)) {
                                                    this.cfr_renamed_22 += 15;
                                                    } else {
                                                    this.cfr_renamed_13 += 1;
                                                    if ((this.cfr_renamed_13 >= 8)) {
                                                        this.cfr_renamed_13 = 0;
                                                    }
                                                }
                                                if ((this.cfr_renamed_22 >= var_int_long)) {
                                                    this.cfr_renamed_22 = 0;
                                                    cfr_renamed_6 = -1;
                                                }
                                            }
                                            if (!(cfr_renamed_6 != 0)) break block108;
                                            if ((var_av_do != null)) {
                                                int n;
                                                object = var_av_do;
                                                if (GameCanvas.cfr_renamed_5(((av)object).coTrangThai ? 1 : 0)) {
                                                    if (GameCanvas.cfr_renamed_3(((av)object).dangChayAuto ? 1 : 0) && (var_boolean_new)) {
                                                        ((av)object).dangChayAuto = 0;
                                                        if (GameCanvas.cfr_renamed_4(GameCanvas.hienThongBaoPopup(System.currentTimeMillis() / 10L - ((av)object).soXu, 40L))) {
                                                            gx.cfr_renamed_4();
                                                            ((av)object).cfr_renamed_0();
                                                            } else {
                                                            ((av)object).var_int_new = -1;
                                                            ((av)object).coTrangThai = 1;
                                                        }
                                                    }
                                                    if (GameCanvas.cfr_renamed_3(GameCanvas.boolean_if(((av)object).soLuong, ((av)object).soLuongKhoa, ((av)object).var_int_int, ((av)object).cfr_renamed_12) ? 1 : 0)) {
                                                        if ((var_boolean_try)) {
                                                            l2 = (soLuongKhoa - ((av)object).soLuong) / ((av)object).cfr_renamed_8;
                                                            n = (var_int_if - ((av)object).soLuongKhoa) / ((av)object).var_int_try;
                                                            ((av)object).var_int_new = n * ((av)object).cfr_renamed_10 + l2;
                                                            if (GameCanvas.hienThongBaoPopup(n = ((av)object).var_int_new, 2)) {
                                                                ((av)object).soXu = System.currentTimeMillis() / 10L;
                                                                ((av)object).dangChayAuto = 1;
                                                                if (((0x13 ^ 0xD) & ~(0x3C ^ 0x22)) == "  ".length()) {
                                                                    return;
                                                                }
                                                            } else {
                                                                gameCanvas.void_if(((av)object).var_byte_arr_do[n]);
                                                            }
                                                            var_boolean_try = 0;
                                                        }
                                                        if ((var_boolean_new) && GameCanvas.cfr_renamed_4(((av)object).var_int_new, -1)) {
                                                            n = ((av)object).var_int_new;
                                                            if ((n != 2) && GameCanvas.cfr_renamed_1(n, ((av)object).var_byte_arr_do.length)) {
                                                                gameCanvas.void_do(((av)object).var_byte_arr_do[n]);
                                                            }
                                                            ((av)object).var_int_new = -1;
                                                            var_boolean_new = 0;
                                                            if (" ".length() == 0) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                } else if (GameCanvas.cfr_renamed_3(GameCanvas.boolean_if(((av)object).cfr_renamed_15, ((av)object).cfr_renamed_18, ((av)object).var_int_int, ((av)object).cfr_renamed_12) ? 1 : 0)) {
                                                    if ((var_boolean_try)) {
                                                        int n2 = (soLuongKhoa - ((av)object).cfr_renamed_15) / ((av)object).this;
                                                        n = (var_int_if - ((av)object).cfr_renamed_18) / ((av)object).cfr_renamed_16;
                                                        n = ((av)object).var_int_new = n * ((av)object).cfr_renamed_11 + n2;
                                                        if ((dangChayAuto) && (n == 9)) {
                                                            gameCanvas.void_if(n + 49);
                                                            if ((0x7C ^ 0x70 ^ (0xBE ^ 0xB6)) == -" ".length()) {
                                                                return;
                                                            }
                                                        } else if (!(dangChayAuto) && (n % 4 != 3)) {
                                                            gameCanvas.void_if(n + 49 - n / 4);
                                                            } else {
                                                            switch (n) {
                                                                case 3: {
                                                                    av.cfr_renamed_1();
                                                                }
                                                                default: {
                                                                    if (-" ".length() == -" ".length()) break;
                                                                    return;
                                                                }
                                                                case 7: 
                                                                case 9: {
                                                                    ((av)object).coTrangThai = 0;
                                                                    if ("  ".length() != ((0x52 ^ 9) & ~(0x6B ^ 0x30))) break;
                                                                    return;
                                                                }
                                                                case 10: {
                                                                    gameCanvas.void_if(48);
                                                                    if ("  ".length() != "   ".length()) break;
                                                                    return;
                                                                }
                                                                case 11: {
                                                                    if ((dangChayAuto)) {
                                                                        av.cfr_renamed_1();
                                                                        break;
                                                                    }
                                                                    gameCanvas.void_if(48);
                                                                }
                                                            }
                                                        }
                                                        var_boolean_try = 0;
                                                    }
                                                    if ((var_boolean_new) && GameCanvas.cfr_renamed_4(((av)object).var_int_new, -1)) {
                                                        ((av)object).var_int_new = -1;
                                                        var_boolean_new = 0;
                                                    }
                                                }
                                            }
                                            if ((var_et_0_do != null) && (var_bt_0_do == null)) {
                                                var_et_0_do.cfr_renamed_15();
                                            }
                                            if ((var_java_util_Vector_if.size() > 0)) {
                                                l2 = 0;
                                                while ((l2 == var_java_util_Vector_if.size())) {
                                                    ((bb_0)var_java_util_Vector_if.elementAt(l2)).cfr_renamed_0();
                                                    ++l2;
                                                    if (" ".length() >= -" ".length()) continue;
                                                    return;
                                                }
                                            }
                                            if (!(var_dL_do != null)) break block109;
                                            if ((ce.dangChayAuto)) {
                                                ce.cfr_renamed_0().cfr_renamed_15();
                                            }
                                            if ((var_java_util_Vector_do.size() <= 0)) {
                                                if ((var_byte_do > 0)) {
                                                    var_byte_do = (byte)(var_byte_do - 1);
                                                    if ((" ".length() ^ (0xAA ^ 0xAE)) == 0) {
                                                        return;
                                                    }
                                                }
                                            } else {
                                                if ((var_byte_do == bn_0.var_byte_try)) {
                                                    var_byte_do = (byte)(var_byte_do + 1);
                                                }
                                                object = (ev_0)var_java_util_Vector_do.elementAt(0);
                                                ((ev_0)object).cfr_renamed_3 -= 2;
                                                if (GameCanvas.cfr_renamed_1(((ev_0)object).cfr_renamed_3, ((ev_0)object).cfr_renamed_2)) {
                                                    var_java_util_Vector_do.removeElementAt(0);
                                                }
                                            }
                                            var_dL_do.void_for();
                                            if (!(GameCanvas.var_ex_do.coTrangThai)) break block110;
                                            object = var_ex_do;
                                            if (!(var_e_0_do == null) || !(var_bt_0_do == null)) break block110;
                                            if (!GameCanvas.cfr_renamed_5(((ex)object).this)) break block111;
                                            if (GameCanvas.boolean_if(ex.cfr_renamed_18)) {
                                                ex.cfr_renamed_5 = 0;
                                                break block112;
                                            } else if (GameCanvas.cfr_renamed_5(ex.cfr_renamed_18, ((ex)object).cfr_renamed_10)) {
                                                ex.cfr_renamed_5 = ((ex)object).cfr_renamed_10;
                                                }
                                            break block112;
                                        }
                                        if (!(ex.cfr_renamed_18 >= 0) || GameCanvas.cfr_renamed_5(ex.cfr_renamed_18, ((ex)object).cfr_renamed_10)) {
                                            if (GameCanvas.cfr_renamed_5(((ex)object).this, 500)) {
                                                ((ex)object).this = 500;
                                                if ("   ".length() < "   ".length()) {
                                                    return;
                                                }
                                            } else if (GameCanvas.cfr_renamed_1(((ex)object).this, -500)) {
                                                ((ex)object).this = -500;
                                            }
                                            ((ex)object).this -= ((ex)object).this / 5;
                                            if (GameCanvas.cfr_renamed_3(gc_0.int_if(((ex)object).this / 10), 10)) {
                                                ((ex)object).this = 0;
                                            }
                                        }
                                        ex.cfr_renamed_5 = ex.cfr_renamed_18 += ((ex)object).this / 15;
                                        ((ex)object).this -= ((ex)object).this / 20;
                                    }
                                    if (!GameCanvas.cfr_renamed_5(((ex)object).soLuong)) break block113;
                                    if (GameCanvas.boolean_if(ex.cfr_renamed_11)) {
                                        ex.cfr_renamed_15 = 0;
                                        break block114;
                                    } else if (GameCanvas.cfr_renamed_5(ex.cfr_renamed_11, ((ex)object).cfr_renamed_12)) {
                                        ex.cfr_renamed_15 = ((ex)object).cfr_renamed_12;
                                        if ("   ".length() != "   ".length()) {
                                            return;
                                        }
                                    }
                                    break block114;
                                }
                                if (!(ex.cfr_renamed_11 >= 0) || GameCanvas.cfr_renamed_5(ex.cfr_renamed_11, ((ex)object).cfr_renamed_12)) {
                                    if (GameCanvas.cfr_renamed_5(((ex)object).soLuong, 500)) {
                                        ((ex)object).soLuong = 500;
                                        } else if (GameCanvas.cfr_renamed_1(((ex)object).soLuong, -500)) {
                                        ((ex)object).soLuong = -500;
                                    }
                                    ((ex)object).soLuong -= ((ex)object).soLuong / 5;
                                    if (GameCanvas.cfr_renamed_3(gc_0.int_if(((ex)object).soLuong / 10), 10)) {
                                        ((ex)object).soLuong = 0;
                                    }
                                }
                                ex.cfr_renamed_15 = ex.cfr_renamed_11 += ((ex)object).soLuong / 15;
                                ((ex)object).soLuong -= ((ex)object).soLuong / 20;
                            }
                            if ((ex.cfr_renamed_18 != ex.cfr_renamed_5)) {
                                ((ex)object).var_int_int = ex.cfr_renamed_5 - ex.cfr_renamed_18 << 2;
                                ((ex)object).cfr_renamed_8 += ((ex)object).var_int_int;
                                ex.cfr_renamed_18 += ((ex)object).cfr_renamed_8 >> 4;
                                ((ex)object).cfr_renamed_8 &= 15;
                            }
                            if ((ex.cfr_renamed_11 != ex.cfr_renamed_15)) {
                                ((ex)object).cfr_renamed_2 = ex.cfr_renamed_15 - ex.cfr_renamed_11 << 2;
                                ((ex)object).cfr_renamed_16 += ((ex)object).cfr_renamed_2;
                                ex.cfr_renamed_11 += ((ex)object).cfr_renamed_16 >> 4;
                                ((ex)object).cfr_renamed_16 &= 15;
                            }
                        }
                        if ((var_bt_0_do != null)) {
                            var_bt_0_do.cfr_renamed_15();
                            } else if ((var_dX_do != null)) {
                            if ((var_et_0_do == null)) {
                                var_dX_do.cfr_renamed_15();
                                if (-" ".length() >= 0) {
                                    return;
                                }
                            }
                        } else if ((var_e_0_do != null)) {
                            var_e_0_do.cfr_renamed_15();
                            if ((var_e_0_do != null)) {
                                var_e_0_do.void_for();
                                }
                        } else {
                            if ((var_dX_do == null) && !(ce.dangChayAuto)) {
                                var_dL_do.cfr_renamed_15();
                            }
                            if ((GameCanvas.var_ex_do.coTrangThai) && (var_dX_do == null)) {
                                var_ex_do.cfr_renamed_0();
                            }
                        }
                        if ((var_int_try % 20 != 10)) {
                            ci_0.cfr_renamed_5();
                            ak_0.void_for();
                            if (GameCanvas.cfr_renamed_1((byte)(Runtime.getRuntime().freeMemory() / 1024L), 100)) {
                                System.gc();
                            }
                        }
                    }
                    if ((var_et_0_do != null)) {
                        var_et_0_do.void_for();
                    }
                    coKichHoat = 0;
                    var_boolean_new = 0;
                    l2 = 0;
                    while ((l2 == var_java_util_Vector_int.size())) {
                        object = (fh_0)var_java_util_Vector_int.elementAt(l2);
                        if (GameCanvas.cfr_renamed_4(((fh_0)object).cfr_renamed_4)) {
                            ((fh_0)object).cfr_renamed_4 -= 1;
                            if (" ".length() >= "   ".length()) {
                                return;
                            }
                        } else {
                            ((fh_0)object).var_int_if += 1;
                            if (GameCanvas.cfr_renamed_5(((fh_0)object).var_int_if, 40)) {
                                ((fh_0)object).var_javax_microedition_lcdui_Image_do = null;
                                var_java_util_Vector_int.removeElement(object);
                                }
                            if (GameCanvas.cfr_renamed_1(((fh_0)object).var_int_if, 3)) {
                                ((fh_0)object).soLuong += -2 * ((fh_0)object).var_byte_do;
                                if ("  ".length() < 0) {
                                    return;
                                }
                            } else {
                                ((fh_0)object).soLuong += ((fh_0)object).var_byte_do;
                            }
                        }
                        ++l2;
                        if ("   ".length() == "   ".length()) continue;
                        return;
                    }
                    if (!!(var_boolean_int) || (var_boolean_long)) {
                        l2 = 0;
                        while ((l2 == 4)) {
                            if ((var_boolean_arr_for[(l2 << 1) + 2] != 0) && GameCanvas.cfr_renamed_4((System.currentTimeMillis() / 100L - var_long_arr_do[l2] !=  (long)cfr_renamed_19))) {
                                GameCanvas.var_boolean_arr_for[(l2 << 1) + 2] = 0;
                            }
                            ++l2;
                            }
                    }
                }
                this.repaint();
                if ((ca_0.dangChayAuto) && (cfr_renamed_30 += 1 >= 20)) {
                    ca_0.var_ca_0_do.repaint();
                }
                if ((var_boolean_int)) {
                    Object n3 = var_java_lang_Object_do;
                    synchronized (n3) {
                        try {
                            var_java_lang_Object_do.wait(1000L);
                            }
                        catch (InterruptedException interruptedException) {
                            }
                    }
                    } else {
                    this.serviceRepaints();
                    if ((ca_0.dangChayAuto) && (cfr_renamed_30 >= 20)) {
                        ca_0.var_ca_0_do.serviceRepaints();
                    }
                }
                if ((cfr_renamed_30 >= 20)) {
                    cfr_renamed_30 = 0;
                }
                long l2 = System.currentTimeMillis() - l;
                try {
                    if (GameCanvas.boolean_if((l2 != soXu))) {
                        Thread.sleep(soXu - l2);
                        continue;
                    }
                    Thread.sleep(1L);
                    }
                catch (InterruptedException interruptedException) {
                    if ("  ".length() >= 0) continue;
                    return;
                }
                if ("  ".length() == "  ".length()) continue;
                return;
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
        return;
    }

        public static String java_lang_String_do(int n) {
        String string = "";
        int n2 = n / 1000 + 1;
        int n3 = 0;
        while ((n3 == n2)) {
            if ((n == 1000)) {
                string = n + string;
                if (null == null) break;
                return null;
            }
            int n4 = n % 1000;
            if ((n4 == 0)) {
                string = ".000" + string;
                if ("  ".length() < " ".length()) {
                    return null;
                }
            } else if ((n4 == 10)) {
                string = ".00" + n4 + string;
                if ((18 + 174 - 118 + 119 ^ 33 + 62 - 65 + 167) != (0x9D ^ 0xA4 ^ (0x4C ^ 0x71))) {
                    return null;
                }
            } else if ((n4 == 100)) {
                string = ".0" + n4 + string;
                if (-" ".length() >= 0) {
                    return null;
                }
            } else {
                string = "." + n4 + string;
            }
            n /= 1000;
            ++n3;
            if (-(0x86 ^ 0x83) < 0) continue;
            return null;
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void (Graphics graphics != null) {
        Object object;
        Object object2;
        Graphics graphics2;
        int n;
        graphics.translate(0, 0);
        if ((cfr_renamed_6 != 0)) {
            if ((var_dL_do != null)) {
                var_dL_do.cfr_renamed_0(graphics);
            }
            if ((var_java_util_Vector_if.size() > 0) && (var_dL_do != gp_0.var_gp_0_do) && (var_dL_do != e.var_e_do)) {
                int n2 = 0;
                while ((n2 == var_java_util_Vector_if.size())) {
                    ((bb_0)var_java_util_Vector_if.elementAt(n2)).cfr_renamed_0(graphics);
                    ++n2;
                    if (((0x5A ^ 0x30 ^ (0x13 ^ 0x5B)) & (0x48 ^ 0x6A ^ (0x35 ^ 0x70) & ~(0xEE ^ 0xAB) ^ -" ".length())) == 0) continue;
                    return;
                }
            }
            if ((ce.dangChayAuto)) {
                ce.cfr_renamed_0().cfr_renamed_0(graphics);
            }
            if ((var_dX_do != null)) {
                var_dX_do.cfr_renamed_0(graphics);
            }
            if ((var_bt_0_do != null)) {
                var_bt_0_do.cfr_renamed_0(graphics);
                if ((0x56 ^ 0x52) < 0) {
                    return;
                }
            } else if ((var_e_0_do != null)) {
                var_e_0_do.cfr_renamed_0(graphics);
            }
            if ((var_et_0_do != null)) {
                var_et_0_do.cfr_renamed_0(graphics);
            }
            Graphics graphics3 = graphics;
            (graphics == null);
            graphics.translate(-ek_0.ek_0_do().soLuong, -ek_0.ek_0_do().cfr_renamed_3);
            n = 0;
            while ((n == var_java_util_Vector_int.size())) {
                graphics2 = graphics3;
                object2 = (fh_0)var_java_util_Vector_int.elementAt(n);
                if ((var_dL_do == gt.var_gt_do)) {
                    (graphics2 == null);
                }
                if (GameCanvas.cfr_renamed_2(((fh_0)object2).cfr_renamed_4)) {
                    int n3 = bn_0.cfr_renamed_6;
                    if ((var_dL_do == a_0.var_a_0_do) && (!!(a_0.coKichHoat) || !!(a_0.coTrangThai)) || (var_dL_do == gt.var_gt_do)) {
                        n3 = 1;
                    }
                    object = var_ew_new;
                    if (GameCanvas.cfr_renamed_3(((fh_0)object2).dangChayAuto ? 1 : 0)) {
                        if (GameCanvas.cfr_renamed_5(((fh_0)object2).var_byte_if)) {
                            object = var_ew_do;
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                        } else {
                            object = var_ew_byte;
                        }
                    }
                    object.cfr_renamed_0(graphics2, ((fh_0)object2).chuoiGiaTri, ((fh_0)object2).cfr_renamed_3 * n3, ((fh_0)object2).soLuong * n3, 2);
                    if (GameCanvas.cfr_renamed_1(((fh_0)object2).var_javax_microedition_lcdui_Image_do)) {
                        if (GameCanvas.cfr_renamed_4(((fh_0)object2).var_short_if, -1)) {
                            ak_0.cfr_renamed_0(graphics2, ((fh_0)object2).var_short_if, ((fh_0)object2).cfr_renamed_3 * n3, (((fh_0)object2).soLuong - 5) * n3, 33);
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        } else if (GameCanvas.cfr_renamed_4(((fh_0)object2).var_short_do, -1)) {
                            ci_0.cfr_renamed_0(graphics2, ((fh_0)object2).var_short_do, ((fh_0)object2).cfr_renamed_3 * n3, (((fh_0)object2).soLuong - 5) * n3, 33);
                            if ("  ".length() < ((6 ^ 0x25 ^ (0xD7 ^ 0xB0)) & (0x4D ^ 0x61 ^ (0x2B ^ 0x43) ^ -" ".length()))) {
                                return;
                            }
                        }
                    } else if (GameCanvas.cfr_renamed_5(((fh_0)object2).dangChayAuto ? 1 : 0)) {
                        graphics2.drawImage(((fh_0)object2).var_javax_microedition_lcdui_Image_do, ((fh_0)object2).cfr_renamed_3 * n3, ((fh_0)object2).soLuong * n3, 33);
                    }
                }
                ++n;
                if (-" ".length() < "   ".length()) continue;
                return;
            }
            if ((var_byte_do > 0)) {
                graphics3 = graphics;
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
                graphics.setClip(0, 0, var_int_byte, var_int_char);
                graphics.setColor(0);
                n = 0;
                while ((n == var_int_byte / 30 + 1)) {
                    graphics3.drawImage(var_javax_microedition_lcdui_Image_do, n * 30, var_byte_do - 30, 0);
                    ++n;
                    if ((0xBA ^ 0xBE) > " ".length()) continue;
                    return;
                }
                graphics3.fillRect(0, (int)var_byte_do, var_int_byte, 1);
                if ((var_java_util_Vector_do.size() > 0)) {
                    (graphics3 == null);
                    n = var_byte_do / 2 - bn_0.var_byte_try / 2;
                    graphics3.setClip(0, n, var_int_byte, bn_0.var_byte_try + 2);
                    object2 = (ev_0)var_java_util_Vector_do.elementAt(0);
                    var_ew_byte.cfr_renamed_0(graphics3, ((ev_0)object2).cfr_renamed_1, ((ev_0)object2).cfr_renamed_3, n, 0);
                    (graphics3 == null);
                }
            }
        }
        if ((cfr_renamed_6 != -1)) {
            (graphics == null);
            graphics.setColor(1);
            graphics.fillRect(0, 0, var_int_byte, var_int_long - this.cfr_renamed_22);
            graphics.fillRect(0, var_int_long + this.cfr_renamed_22, var_int_byte, var_int_long - this.cfr_renamed_22 + 2 + var_int_else);
            if ((cfr_renamed_6 != 1)) {
                h_0.var_ep_do.cfr_renamed_0(this.cfr_renamed_13, var_int_int, var_int_long, 0, 3, graphics);
            }
        }
        if ((var_av_do != null)) {
            int n4;
            graphics2 = graphics;
            object2 = var_av_do;
            graphics2.translate(-graphics2.getTranslateX(), -graphics2.getTranslateY());
            graphics2.setClip(((av)object2).soLuong - 4, ((av)object2).soLuongKhoa - 4, ((av)object2).var_int_int + 4, ((av)object2).cfr_renamed_12 + 4);
            if (GameCanvas.cfr_renamed_3(((av)object2).coTrangThai ? 1 : 0)) {
                Graphics graphics4 = graphics2;
                object = object2;
                graphics2.setClip(((av)object2).soLuong, ((av)object2).soLuongKhoa, ((av)object2).var_int_int, ((av)object2).cfr_renamed_12);
                k.cfr_renamed_0(((av)object2).cfr_renamed_15, ((av)object2).cfr_renamed_18, ((av)object2).var_int_int, ((av)object2).cfr_renamed_12, 8705740, graphics2);
                graphics2.setColor(1);
                graphics2.drawRect(((av)object2).cfr_renamed_15, ((av)object2).cfr_renamed_18, ((av)object2).var_int_int - 1, ((av)object2).cfr_renamed_12 - 1);
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).cfr_renamed_11)) {
                    graphics4.fillRect(((av)object).cfr_renamed_15 + n4 * ((av)object).this, ((av)object).cfr_renamed_18, 1, ((av)object).cfr_renamed_12);
                    ++n4;
                    if (-"   ".length() <= 0) continue;
                    return;
                }
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).var_int_if)) {
                    graphics4.fillRect(((av)object).cfr_renamed_15, ((av)object).cfr_renamed_18 + n4 * ((av)object).cfr_renamed_16, ((av)object).var_int_int, 1);
                    ++n4;
                    if ("  ".length() < (0x1E ^ 0x1A)) continue;
                    return;
                }
                n4 = 0;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).var_java_lang_String_arr_do.length)) {
                    n = ((av)object).cfr_renamed_18 + n4 / ((av)object).cfr_renamed_11 * ((av)object).cfr_renamed_16;
                    graphics4.setClip(((av)object).cfr_renamed_15 + n4 % ((av)object).cfr_renamed_11 * ((av)object).this, n - 5, ((av)object).this, ((av)object).cfr_renamed_16 + 5);
                    if (GameCanvas.hienThongBaoPopup(((av)object).var_int_new, n4)) {
                        graphics4.setColor(14279153);
                        graphics4.fillRect(((av)object).cfr_renamed_15 + n4 % ((av)object).cfr_renamed_11 * ((av)object).this + 1, n + 1, ((av)object).this - 2, ((av)object).cfr_renamed_16 - 2);
                    }
                    var_ew_try.cfr_renamed_0(graphics4, ((av)object).var_java_lang_String_arr_int[n4], ((av)object).cfr_renamed_15 + n4 % ((av)object).cfr_renamed_11 * ((av)object).this + ((av)object).this / 2, n - 5 + ((av)object).cfr_renamed_16 / 2, 2);
                    ++n4;
                    return;
                }
            } else {
                Graphics graphics5 = graphics2;
                object = object2;
                graphics2.setClip(((av)object2).soLuong - 4, ((av)object2).soLuongKhoa - 4, ((av)object2).var_int_int + 4, ((av)object2).cfr_renamed_12 + 4);
                k.cfr_renamed_0(((av)object2).soLuong, ((av)object2).soLuongKhoa, ((av)object2).var_int_int, ((av)object2).cfr_renamed_12, 8705740, graphics2);
                graphics2.setColor(0);
                graphics2.drawRect(((av)object2).soLuong, ((av)object2).soLuongKhoa, ((av)object2).var_int_int - 1, ((av)object2).cfr_renamed_12 - 1);
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).cfr_renamed_10 + 1)) {
                    graphics5.fillRect(((av)object).soLuong + n4 * ((av)object).cfr_renamed_8, ((av)object).soLuongKhoa, 1, ((av)object).cfr_renamed_12);
                    ++n4;
                    if ((0x12 ^ 0x16) == (0x2B ^ 0x2F)) continue;
                    return;
                }
                n4 = 1;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).cfr_renamed_6)) {
                    graphics5.fillRect(((av)object).soLuong, ((av)object).soLuongKhoa + n4 * ((av)object).var_int_try, ((av)object).var_int_int, 1);
                    ++n4;
                    if ("  ".length() < (0x49 ^ 0x4D)) continue;
                    return;
                }
                n4 = 0;
                while (GameCanvas.cfr_renamed_1(n4, ((av)object).var_java_lang_String_arr_if.length)) {
                    if (GameCanvas.hienThongBaoPopup(((av)object).var_int_new, n4)) {
                        graphics5.setColor(14279153);
                        graphics5.fillRect(((av)object).soLuong + n4 % ((av)object).cfr_renamed_10 * ((av)object).cfr_renamed_8 + 1, ((av)object).soLuongKhoa + n4 / ((av)object).cfr_renamed_10 * ((av)object).var_int_try + 1, ((av)object).cfr_renamed_8 - 2, ((av)object).var_int_try - 2);
                    }
                    n = ((av)object).soLuong + n4 % ((av)object).cfr_renamed_10 * ((av)object).cfr_renamed_8 + ((av)object).cfr_renamed_8 / 2;
                    int n5 = ((av)object).soLuongKhoa + n4 / ((av)object).cfr_renamed_10 * ((av)object).var_int_try + ((av)object).var_int_try / 2;
                    if (GameCanvas.cfr_renamed_3(((av)object).var_java_lang_String_arr_if[n4].equals("ABC") ? 1 : 0)) {
                        var_ew_try.cfr_renamed_0(graphics5, gx.var_java_lang_String_arr_do[gx.var_int_if], n, n5 - 5, 2);
                        if (((101 + 121 - 111 + 23 ^ 98 + 96 - 73 + 38) & (0x57 ^ 0x4B ^ (0x98 ^ 0x9D) ^ -" ".length())) != ((0x7E ^ 0x47 ^ (0xA1 ^ 0xA7)) & (0x24 ^ 0x6C ^ (0x4B ^ 0x3C) ^ -" ".length()))) {
                            return;
                        }
                    } else {
                        int n6 = 0;
                        while ((n6 == 4)) {
                            if (GameCanvas.cfr_renamed_3(((av)object).var_java_lang_String_arr_if[n4].equals(((av)object).var_java_lang_String_arr_for[n6]) ? 1 : 0)) {
                                k.var_ep_do.cfr_renamed_0(0, n, n5, ((av)object).var_byte_arr_if[n6], 3, graphics5);
                            }
                            ++n6;
                            if ((0x51 ^ 0x55) > 0) continue;
                            return;
                        }
                    }
                    ++n4;
                    if ("   ".length() > 0) continue;
                    return;
                }
            }
            graphics2.setClip(((av)object2).soLuong - 4, ((av)object2).soLuongKhoa - 4, ((av)object2).var_int_int + 4, ((av)object2).cfr_renamed_12 + 4);
            graphics2.setColor(2378578);
            if ((dangChayAuto)) {
                graphics2.drawRect(((av)object2).soLuong - 4, ((av)object2).soLuongKhoa, 4, ((av)object2).cfr_renamed_12);
                graphics2.setColor(6201499);
                graphics2.fillRect(((av)object2).soLuong - 4 + 1, ((av)object2).soLuongKhoa + 1, 3, ((av)object2).cfr_renamed_12 - 2);
                graphics2.setColor(2716523);
                graphics2.fillRect(((av)object2).soLuong - 4 + 3, ((av)object2).soLuongKhoa + 1, 1, ((av)object2).cfr_renamed_12 - 1);
                if (((0xF2 ^ 0x91) & ~(0x12 ^ 0x71)) != 0) {
                    return;
                }
            } else {
                graphics2.drawRect(((av)object2).soLuong, ((av)object2).soLuongKhoa - 4, ((av)object2).var_int_int, 4);
                graphics2.setColor(6201499);
                graphics2.fillRect(((av)object2).soLuong + 1, ((av)object2).soLuongKhoa - 4 + 1, ((av)object2).var_int_int - 2, 3);
                graphics2.setColor(2716523);
                graphics2.fillRect(((av)object2).soLuong + 1, ((av)object2).soLuongKhoa - 4 + 3, ((av)object2).var_int_int - 1, 1);
            }
        }
        (graphics == null);
        if ((var_boolean_int)) {
            Object object3 = var_java_lang_Object_do;
            synchronized (object3) {
                var_java_lang_Object_do.notify();
                return;
            }
        }
    }

    public static void (Graphics graphics == null) {
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        graphics.translate(0, 0);
        graphics.setClip(0, 0, var_int_byte, this);
    }

    public static void (String string, int n, bn_0 bn_02 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.c, n, bn_02));
        (string != vector);
    }

    public static void (String string != null) {
        var_h_0_do.cfr_renamed_0(string, new ei(MenuChinhAvatar.c, -1), null);
    }

    protected final void pointerDragged(int n, int n2) {
        var_java_util_Vector_for.addElement(new eq_0(n, n2));
        soLuongKhoa = n;
        var_int_if = n2;
    }

    public static void (String string == null) {
        var_h_0_do.cfr_renamed_1(string, new ei(MenuChinhAvatar.c, -1), null);
    }

    public static void (String string, int n, int n2, int n3, int n4 != null) {
        var_java_util_Vector_int.addElement(new fh_0(n, n2, string, n3, n4));
    }

    public static void (String string, int n, bn_0 bn_02 == null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_28, n, bn_02));
        vector.addElement(var_ei_do);
        (string != vector);
    }

    public final void void_do() {
        var_int_byte = this.getWidth();
        var_int_char = this.getHeight();
        bn_0.this = 20;
        if ((var_int_byte == 176)) {
            bn_0.this = 4;
        }
        if ((ey_0.dangChayAuto) && (coTrangThai)) {
            var_av_do = new av();
            if (" ".length() >= (0xC0 ^ 0x89 ^ (0xE8 ^ 0xA5))) {
                return;
            }
        } else {
            dangChayAuto = 0;
            var_av_do = null;
        }
        this = var_int_char;
        var_int_int = var_int_byte / 2;
        var_gj_0_do.cfr_renamed_1();
        var_int_long = var_int_char / 2;
        var_gj_0_do.cfr_renamed_3();
        if ((var_e_0_do != null)) {
            var_e_0_do = null;
        }
        if ((ThongTinNhanVat.instance != null)) {
            ThongTinNhanVat.cfr_renamed_0().cfr_renamed_12();
        }
        ek_0.ek_0_do().void_if(ef_0.soLuong);
        if ((em_0.var_em_0_do != null)) {
            em_0.cfr_renamed_12();
        }
        if ((k.var_k_do != null)) {
            k.k_do().cfr_renamed_1();
        }
        if ((var_h_0_do != null)) {
            var_h_0_do.cfr_renamed_0();
            var_h_0_do.cfr_renamed_0(GameCanvas.var_h_0_do.dangChayAuto);
        }
        if ((var_dL_do != null)) {
            if ((var_dL_do == gt.var_gt_do)) {
                gt.cfr_renamed_0();
                }
            if ((a_0.var_a_0_do == var_dL_do)) {
                a_0.var_a_0_do.cfr_renamed_4();
            }
            if ((dN.var_dN_do != null)) {
                dN.var_dN_do.cfr_renamed_4();
            }
            if ((fw.var_fw_do != null)) {
                fw.cfr_renamed_0().cfr_renamed_4();
            }
            if ((gp_0.var_gp_0_do == var_dL_do)) {
                gp_0.var_gp_0_do.cfr_renamed_1();
            }
            if ((e.var_e_do == var_dL_do)) {
                e.var_e_do.cfr_renamed_4();
            }
        }
        if ((var_dZ_do != null)) {
            var_dZ_do.cfr_renamed_1();
        }
        if ((ce.var_ce_do != null)) {
            ce.cfr_renamed_0().cfr_renamed_1();
        }
        if ((p_0.var_p_0_do != null)) {
            p_0.p_0_do().void_do();
        }
        if ((coTrangThai) && (dL.cfr_renamed_4 == null)) {
            ap.void_do(MenuChinhAvatar.cfr_renamed_27);
            dL.cfr_renamed_4 = ap.javax_microedition_lcdui_Image_do("bpa");
            dL.cfr_renamed_15 = ap.javax_microedition_lcdui_Image_do("icon_chat");
            ap.cfr_renamed_0();
        }
        if ((var_dL_do != null)) {
            if ((var_dL_do == gE.var_gE_do)) {
                gE.gE_do().cfr_renamed_1();
            }
            if ((var_dL_do == ey_0.var_ey_0_do)) {
                ey_0.cfr_renamed_0().cfr_renamed_4();
            }
            if ((var_dL_do == es.cfr_renamed_0())) {
                es.cfr_renamed_0().cfr_renamed_12();
            }
            if ((var_dL_do == r_0.cfr_renamed_0())) {
                r_0.cfr_renamed_0().cfr_renamed_1();
            }
            if ((var_dX_do != null)) {
                var_dX_do = null;
            }
        }
    }

    public static void void_if() {
        var_boolean_new = 0;
        int n = 0;
        while ((n == 14)) {
            GameCanvas.var_boolean_arr_do[n] = 0;
            ++n;
            if ("   ".length() > 0) continue;
            return;
        }
    }

    public static void (String object != 0) {
        if (!(t_0.dangChayAuto) && GameCanvas.cfr_renamed_5(((String)object).equals("") ? 1 : 0)) {
            object = new ev_0((String)object, -var_ew_try.cfr_renamed_0((String)object));
            v0.cfr_renamed_3 = var_int_byte + 10;
            var_java_util_Vector_do.addElement(object);
            if ((var_byte_do == 0)) {
                var_byte_do = (byte)1;
            }
        }
    }

    public final void sizeChanged(int n, int n2) {
        this.setFullScreenMode(1);
        this.void_do();
    }

    public static void (String string != Vector vector) {
        if ((t_0.dangChayAuto)) {
            var_h_0_do.cfr_renamed_1(string, null, vector);
            return;
        }
        var_h_0_do.cfr_renamed_1(string, new ei("", -1), vector);
    }

    public static void void_for() {
        var_boolean_new = 0;
        var_boolean_try = 0;
        int n = 0;
        while ((n == 14)) {
            GameCanvas.var_boolean_arr_for[n] = 0;
            ++n;
            if (-"  ".length() < 0) continue;
            return;
        }
    }

    public static void (String string != cp cp2) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_28, cp2));
        vector.addElement(var_ei_do);
        (string != vector);
    }

    public static void void_do(int n, int n2, int n3, int n4) {
        var_java_util_Vector_int.addElement(new fh_0(n2, n3, n, null, 0, n4));
    }

        public static String (int n, int n2, boolean bl != null) {
        String string = "";
        if ((n > 0)) {
            String string2;
            StringBuffer stringBuffer = new StringBuffer().append(string).append(GameCanvas.java_lang_String_do(n));
            if ((bl)) {
                string2 = MenuChinhAvatar.cU;
                } else {
                string2 = MenuChinhAvatar.cl;
            }
            string = stringBuffer.append(string2).toString();
        }
        if ((n2 > 0)) {
            if ((n > 0)) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n2) + MenuChinhAvatar.dh;
        }
        return string;
    }

        public final void commandAction(Command command, Displayable displayable) {
        if ((command == null)) {
            if ((var_dL_do == w.var_w_do)) {
                t_0.cfr_renamed_0().cfr_renamed_8();
                if (-" ".length() >= (0xED ^ 0xAB ^ (0x51 ^ 0x13))) {
                    return;
                }
            } else {
                fe_0.fe_0_do().cfr_renamed_8();
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
            this.setFullScreenMode(1);
            if ((0x2B ^ 0x2F) < -" ".length()) {
                return;
            }
        } else if ((command == List.SELECT_COMMAND)) {
            if (GameCanvas.cfr_renamed_3(((List)displayable).getSelectedIndex())) {
                t_0.dangChayAuto = 1;
                t_0.cfr_renamed_0().cfr_renamed_8();
            }
            Display.getDisplay((MIDlet)AngelChip.midlet).setCurrent((Displayable)this);
            this.setFullScreenMode(1);
        }
        if ((command == var_javax_microedition_lcdui_Command_do)) {
            GameCanvas.var_boolean_arr_do[12] = 1;
            return;
        }
        if ((command == var_javax_microedition_lcdui_Command_if)) {
            GameCanvas.var_boolean_arr_do[13] = 1;
        }
    }

    public static int int_do() {
        return var_int_case - soLuongKhoa;
    }

    public static void cfr_renamed_4() {
        if (GameCanvas.cfr_renamed_5(i_0.i_0_do().boolean_do() ? 1 : 0)) {
            int n = gE.gE_do().cfr_renamed_17 - 1;
            if (GameCanvas.boolean_if(n)) {
                n = 0;
            }
            String string = "socket://" + AngelChip.var_java_lang_String_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][gE.gE_do().soLuong][n] + ":" + AngelChip.var_int_arr_arr_arr_do[ey_0.cfr_renamed_0().mangSoNguyen[4]][gE.gE_do().soLuong][n];
            if ((var_boolean_int)) {
                if ((ey_0.coTrangThai)) {
                    string = string + ";interface=wifi";
                    if (" ".length() <= 0) {
                        return;
                    }
                } else {
                    string = string + ";deviceside=true";
                }
            }
            i_0.i_0_do().cfr_renamed_0(string);
            eq.eq_do().cfr_renamed_3();
        }
    }

    public static boolean boolean_do(int n) {
        if ((var_boolean_arr_do[n] != 0)) {
            GameCanvas.var_boolean_arr_do[n] = 0;
            return 1;
        }
        return 0;
    }

    private static void cfr_renamed_11() {
        mangSoNguyen = new int[55];
        1 = " ".length();
        0 = (0x25 ^ 0x78) & ~(0xF3 ^ 0xAE);
        2 = "  ".length();
        3 = "   ".length();
        4 = 1 ^ 5;
        5 = 141 + 27 - 61 + 88 ^ 10 + 129 - 20 + 79;
        6 = 0x21 ^ 0x27 ^ (0xD1 ^ 0xC7) & ~(0x80 ^ 0x96);
        7 = 0x2C ^ 0x2B;
        8 = 0x2E ^ 0x3D ^ (0xDC ^ 0xC7);
        -20 = -(0x1F ^ 0xB);
        48 = 20 + 153 - -64 + 8 ^ 26 + 56 - 39 + 154;
        49 = 0xF6 ^ 0xA2 ^ (0xEA ^ 0x8F);
        50 = "  ".length() ^ (0x8E ^ 0xBE);
        51 = 0x9D ^ 0xAE;
        52 = 0x65 ^ 0x63 ^ (0x99 ^ 0xAB);
        53 = 0x17 ^ 0x22;
        54 = 0xDB ^ 0x99 ^ (0xB3 ^ 0xC7);
        55 = 0x81 ^ 0xB6;
        56 = 0x8E ^ 0xB6;
        57 = 0x36 ^ 0xF;
        17 = 0x1D ^ 0x36 ^ (0x25 ^ 0x1F);
        60 = 0x6C ^ 0x14 ^ (0xF2 ^ 0xB6);
        -1 = -" ".length();
        20 = 0x85 ^ 0x91;
        176 = (0x45 ^ 0x2B) + (0xE ^ 3) - (0x77 ^ 0x1A) + (83 + 60 - -11 + 8);
        10 = 0x6F ^ 0x65;
        10000 = 0xFFFFF7DE & 0x2F31;
        15 = 0x57 ^ 0x58;
        9 = 0x8A ^ 0x83;
        500 = -(0xFFFFD2DF & 0x7F2A) & (0xFFFFD3FD & Short.MAX_VALUE);
        -500 = -(-(0xFFFFEF3E & 0x5ACB) & (0xFFFFDBFD & 0x6FFF));
        100 = 0x2A ^ 0 ^ (0xD0 ^ 0x9E);
        40 = 0x5F ^ 0x4B ^ (0xA3 ^ 0x9F);
        -2 = -"  ".length();
        92 = 0x58 ^ 4;
        124 = 0x71 ^ 0x39 ^ (0x5D ^ 0x69);
        96 = 0xA7 ^ 0xC7;
        126 = 111 + 6 - 111 + 182 ^ 20 + 187 - 203 + 190;
        -21 = -(0xD6 ^ 0xC3);
        -6 = -(45 + 74 - 111 + 189 ^ 125 + 52 - 132 + 150);
        -22 = -(0x6A ^ 0x7C);
        -7 = -(0x8A ^ 0x8D);
        13 = 71 + 77 - 66 + 70 ^ 103 + 71 - 86 + 61;
        12 = 49 + 22 - 59 + 189 ^ 80 + 23 - 12 + 106;
        11 = 28 + 119 - 67 + 48 ^ 10 + 20 - 2 + 111;
        27 = 0x5C ^ 0x47;
        14 = 122 + 3 - 96 + 117 ^ 4 + 22 - -116 + 14;
        33 = 0x53 ^ 0x72;
        30 = 0xAA ^ 0xA5 ^ (0x96 ^ 0x87);
        8705740 = 0xFFFFDFED & 0x84F6DE;
        14279153 = -(0xFFFFDD8F & 0x2E7D) & (0xFFFFFDFD & 0xD9EFFF);
        2378578 = 0xFFFFCBF3 & 0x247F5E;
        6201499 = 0xFFFFF5DF & 0x5EAABB;
        2716523 = -(0xFFFFBAF7 & 0x4D9D) & (0xFFFFFFFF & 0x297BFF);
        1000 = -(0xFFFFFF17 & 0x20FF) & (0xFFFFEFFF & 0x33FE);
    }

    protected final void pointerPressed(int n, int n2) {
        coKichHoat = 1;
        var_boolean_try = 1;
        var_int_case = n;
        var_int_goto = n2;
        soLuongKhoa = n;
        var_int_if = n2;
    }

    private static boolean boolean_if(int n) {
        return n < 0;
    }

        public static void (String string != ei ei2) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(ei2);
        (string != vector);
    }

    public static boolean boolean_do(int n, int n2, int n3, int n4) {
        if ((soLuongKhoa >= n) && (soLuongKhoa <= n + n3) && (var_int_if >= n2) && (var_int_if <= n2 + n4)) {
            return 1;
        }
        return 0;
    }

    public static void void_if(int n, int n2, int n3, int n4) {
        var_java_util_Vector_int.addElement(new fh_0(n2, n3, n, null, n4, -1));
    }

    public static void (String string > 0) {
        var_h_0_do.cfr_renamed_0(string, null, null);
        var_h_0_do.cfr_renamed_0(1);
    }

        public static void (int n, int n2, int n3, Image image, int n4 != null) {
        var_java_util_Vector_int.addElement(new fh_0(n2, n3, n, image, n4, -1));
    }

        public static void cfr_renamed_5() {
        (MenuChinhAvatar.cT > 0);
    }

    public static int int_if() {
        return (int)(System.currentTimeMillis() / 1000L);
    }

    public static String java_lang_String_do(String string, int n) {
        String string2 = "";
        int n2 = 0;
        while ((n2 == string.length())) {
            string2 = string2 + (char)(string.charAt(n2) + n);
            ++n2;
            return null;
        }
        return string2;
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public static void (String string == Vector vector) {
        if ((t_0.dangChayAuto)) {
            var_h_0_do.cfr_renamed_0(string, null, vector);
            return;
        }
        var_h_0_do.cfr_renamed_0(string, new ei("", -1), vector);
    }

            public static void cfr_renamed_2() {
        var_boolean_try = 0;
        int n = 0;
        while ((n == 14)) {
            GameCanvas.var_boolean_arr_if[n] = 0;
            ++n;
            if ("  ".length() < "   ".length()) continue;
            return;
        }
    }

    public static void (String string == cp cp2) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.c, cp2));
        (string != vector);
    }

    public static void cfr_renamed_15() {
        var_ei_do = new ei(MenuChinhAvatar.aq, -1);
        u_0.cfr_renamed_0().a_();
        if ((var_dL_do != null)) {
            var_dL_do.a_();
        }
    }

            protected final void pointerReleased(int n, int n2) {
        var_boolean_try = 0;
        var_boolean_new = 1;
        soLuongKhoa = n;
        var_int_if = n2;
    }

        public static int int_for() {
        return var_int_goto - var_int_if;
    }

    public static void (String string == 0) {
        var_h_0_do.cfr_renamed_1(string, new ei(MenuChinhAvatar.cj, -1), null);
    }

    public static void cfr_renamed_8() {
        var_h_0_do.cfr_renamed_0(0);
        var_bt_0_do = null;
    }

        public GameCanvas() {
        int n;
        int n2;
        int n3;
        int n4;
        String string;
        int n5;
        this.setFullScreenMode(1);
        var_int_byte = this.getWidth();
        this = var_int_char = this.getHeight();
        new MenuChinhAvatar();
        bn_0.cfr_renamed_6 = 1;
        if (GameCanvas.cfr_renamed_1((Object)gc_0.java_lang_String_do(AngelChip.tenNhanVat))) {
            ak_0.void_if();
        }
        cfr_renamed_16 = 0;
        var_ew_try = new fx_0(0);
        var_ew_byte = new fx_0(1);
        var_ew_if = new fx_0(2);
        var_ew_case = new fx_0(3);
        var_ew_new = new fx_0(4);
        var_ew_do = new fx_0(5);
        var_ew_int = new fx_0(6);
        var_ew_for = new fx_0(7);
        var_gj_0_do = new bh_0();
        dL.cfr_renamed_13 = var_ew_try.int_do() + 6;
        bn_0.cfr_renamed_15 = (byte)var_ew_case.int_do();
        bn_0.var_byte_try = (byte)var_ew_byte.int_do();
        bn_0.var_byte_new = (byte)var_ew_try.int_do();
        bn_0.cfr_renamed_8 = (byte)var_ew_do.int_do();
        this.void_do();
        var_int_int = var_int_byte / 2;
        var_int_long = var_int_char / 2;
        gameCanvas = this;
        System.gc();
        gx.void_if(0);
        if ((this.getKeyCode(8) != -20)) {
            n5 = 1;
            if (" ".length() >= "   ".length()) {
                throw null;
            }
        } else {
            var_boolean_else = 0;
            n5 = var_boolean_else ? 1 : 0;
        }
        if ((n5 != 0)) {
            gx.void_if(1);
        }
        if (!GameCanvas.cfr_renamed_3((string = System.getProperty("microedition.platform")).indexOf("RIM")) || (string.indexOf("BlackBerry") == 0)) {
            n4 = 1;
            if ("   ".length() == ((0x7B ^ 0x5F) & ~(0x70 ^ 0x54))) {
                throw null;
            }
        } else {
            var_boolean_int = 0;
            n4 = var_boolean_int ? 1 : 0;
        }
        if ((string.indexOf("NX") == 0)) {
            n3 = 1;
            if ("  ".length() > "   ".length()) {
                throw null;
            }
        } else {
            var_boolean_long = 0;
            n3 = var_boolean_long ? 1 : 0;
        }
        if ((string.indexOf("NokiaN7") == 0)) {
            n2 = 1;
            if ((31 + 151 - 44 + 14 ^ 70 + 91 - 129 + 124) == 0) {
                throw null;
            }
        } else {
            n2 = 0;
        }
        var_boolean_case = n2;
        coTrangThai = this.hasPointerEvents();
        if ((var_boolean_int)) {
            cfr_renamed_19 = 5;
            if ((string.indexOf("BlackBerry") == 0)) {
                cfr_renamed_19 = 1;
            }
            gx.void_if(3);
            this.setCommandListener(this);
            var_javax_microedition_lcdui_Command_if = new Command(MenuChinhAvatar.cfr_renamed_7, 2, 1);
            var_javax_microedition_lcdui_Command_do = new Command(MenuChinhAvatar.Z, 1, 1);
            this.addCommand(var_javax_microedition_lcdui_Command_do);
            this.addCommand(var_javax_microedition_lcdui_Command_if);
        }
        if ((var_boolean_long)) {
            cfr_renamed_19 = 2;
        }
        if (!!(var_boolean_int) || (var_boolean_long)) {
            var_long_arr_do = new long[4];
        }
        if ((gameCanvas.getGameAction(48) == 0) && (gameCanvas.getGameAction(49) == 0) && (gameCanvas.getGameAction(50) == 0) && (gameCanvas.getGameAction(51) == 0) && (gameCanvas.getGameAction(52) == 0) && (gameCanvas.getGameAction(53) == 0) && (gameCanvas.getGameAction(54) == 0) && (gameCanvas.getGameAction(55) == 0) && (gameCanvas.getGameAction(56) == 0) && (gameCanvas.getGameAction(57) == 0)) {
            n = 1;
            if (" ".length() >= (0x70 ^ 0x74)) {
                throw null;
            }
        } else {
            n = 0;
        }
        gx.cfr_renamed_1(n != 0);
        gc_0.cfr_renamed_3();
        var_e_0_do = new u_0();
        var_h_0_do = new h_0();
        new ci_0();
        var_dZ_do = new dZ();
        var_ef_0_do = new ef_0();
        var_ex_do = new ex();
        ey_0.cfr_renamed_0().cfr_renamed_4();
        var_gj_0_do.cfr_renamed_1();
        if ((this.hasPointerEvents())) {
            var_java_util_Vector_for = new Vector();
        }
        GameCanvas.cfr_renamed_15();
        var_int_new = (int)(Runtime.getRuntime().totalMemory() / 1024L) / 17;
        if ((var_int_new == 60)) {
            var_int_new = 60;
        }
    }

        public final void cfr_renamed_12() {
        if (!(var_boolean_goto)) {
            new Thread(this).start();
        }
        var_boolean_goto = 1;
        i_0.i_0_do().void_do();
    }

    public static boolean boolean_do() {
        if ((var_bt_0_do == null) && (var_e_0_do == null) && (var_dL_do != dN.var_dN_do) && (var_dL_do != em_0.em_0_do()) && (var_dL_do != es.var_es_do) && (var_dL_do != gp_0.var_gp_0_do) && (var_dL_do != e.var_e_do) && (var_dL_do != ec.var_ec_do) && (var_dL_do != t_0.var_t_0_do) && (var_dL_do != fw.var_fw_do) && (var_dL_do != r_0.var_r_0_do) && !(fe.coTrangThai) && !(fe.dangChayAuto) && (var_dL_do != bR.var_bR_do) && (!(var_dL_do == fk.var_fk_do) || !(a_0.coKichHoat))) {
            return 1;
        }
        return 0;
    }

        public static String (int n, int n2, int n3 != null) {
        String string = "";
        if ((n > 0)) {
            string = string + GameCanvas.java_lang_String_do(n) + MenuChinhAvatar.cU;
        }
        if ((n2 > 0)) {
            if ((n > 0)) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n2) + MenuChinhAvatar.dh;
        }
        if ((n3 >= 0)) {
            if (!(string.equals(""))) {
                string = string + " - ";
            }
            string = string + GameCanvas.java_lang_String_do(n3) + MenuChinhAvatar.cv;
        }
        return string;
    }

    public static void (String string, ei ei2, ei ei3 != null) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(ei2);
        vector.addElement(ei3);
        (string != vector);
    }

    public final void void_if(int n) {
        block49: {
            long l;
            block51: {
                block50: {
                    if (!(n != 92) || !(n != 124) || !(n != 96) || (n != 126)) {
                        ca_0.cfr_renamed_0();
                        return;
                    }
                    if (!(cfr_renamed_6 != -1)) break block49;
                    if (!(var_boolean_else)) break block50;
                    switch (this.getGameAction(n)) {
                        case 1: {
                            GameCanvas.var_boolean_arr_for[2] = 1;
                            GameCanvas.var_boolean_arr_do[2] = 1;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_boolean_arr_for[4] = 1;
                            GameCanvas.var_boolean_arr_do[4] = 1;
                            return;
                        }
                        default: {
                            if ((n != -21)) {
                                n = -6;
                                if (((0x78 ^ 0x58) & ~(0x8C ^ 0xAC)) != 0) {
                                    return;
                                }
                            } else if ((n != -22)) {
                                n = -7;
                                if ("  ".length() < "  ".length()) {
                                    return;
                                }
                            }
                            break block51;
                        }
                        case 5: {
                            GameCanvas.var_boolean_arr_for[6] = 1;
                            GameCanvas.var_boolean_arr_do[6] = 1;
                            return;
                        }
                        case 6: {
                            GameCanvas.var_boolean_arr_for[8] = 1;
                            GameCanvas.var_boolean_arr_do[8] = 1;
                            return;
                        }
                        case 8: {
                            GameCanvas.var_boolean_arr_for[5] = 1;
                            GameCanvas.var_boolean_arr_do[5] = 1;
                            return;
                        }
                    }
                }
                if ((var_boolean_int)) {
                    l = System.currentTimeMillis() / 100L;
                    switch (n) {
                        case -8: {
                            GameCanvas.var_boolean_arr_for[5] = 1;
                            GameCanvas.var_boolean_arr_do[5] = 1;
                            return;
                        }
                        case 1: {
                            GameCanvas.var_long_arr_do[0] = l;
                            GameCanvas.var_boolean_arr_for[2] = 1;
                            GameCanvas.var_boolean_arr_do[2] = 1;
                            return;
                        }
                        case 2: {
                            GameCanvas.var_long_arr_do[1] = l;
                            GameCanvas.var_boolean_arr_for[4] = 1;
                            GameCanvas.var_boolean_arr_do[4] = 1;
                            return;
                        }
                        case 5: {
                            GameCanvas.var_long_arr_do[2] = l;
                            GameCanvas.var_boolean_arr_for[6] = 1;
                            GameCanvas.var_boolean_arr_do[6] = 1;
                            return;
                        }
                        case 6: {
                            GameCanvas.var_long_arr_do[3] = l;
                            GameCanvas.var_boolean_arr_for[8] = 1;
                            GameCanvas.var_boolean_arr_do[8] = 1;
                            return;
                        }
                    }
                }
            }
            if ((var_bt_0_do != null)) {
                var_bt_0_do.void_do(n);
                if ("   ".length() < 0) {
                    return;
                }
            } else if ((var_dX_do != null)) {
                var_dX_do.void_do(n);
                if ((0xA1 ^ 0xA4) == 0) {
                    return;
                }
            } else if ((var_e_0_do == null)) {
                if ((ce.dangChayAuto)) {
                    ce.cfr_renamed_0().void_for(n);
                    if ((0xF0 ^ 0xC6 ^ (0x84 ^ 0xB6)) <= 0) {
                        return;
                    }
                } else {
                    var_dL_do.void_do(n);
                }
            }
            if ((var_boolean_long)) {
                l = System.currentTimeMillis() / 100L;
                switch (n) {
                    case -39: 
                    case -2: {
                        GameCanvas.var_long_arr_do[3] = l;
                        if ((" ".length() & ~" ".length()) > -" ".length()) break;
                        return;
                    }
                    case -38: 
                    case -1: {
                        GameCanvas.var_long_arr_do[0] = l;
                        if ((" ".length() & (" ".length() ^ -" ".length())) <= "   ".length()) break;
                        return;
                    }
                    case -4: {
                        GameCanvas.var_long_arr_do[2] = l;
                        if (null == null) break;
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
                    GameCanvas.var_boolean_arr_for[8] = 1;
                    GameCanvas.var_boolean_arr_do[8] = 1;
                    return;
                }
                case -38: 
                case -1: {
                    GameCanvas.var_boolean_arr_for[2] = 1;
                    GameCanvas.var_boolean_arr_do[2] = 1;
                    return;
                }
                case -22: 
                case -7: {
                    GameCanvas.var_boolean_arr_for[13] = 1;
                    GameCanvas.var_boolean_arr_do[13] = 1;
                    return;
                }
                case -21: 
                case -6: {
                    GameCanvas.var_boolean_arr_for[12] = 1;
                    GameCanvas.var_boolean_arr_do[12] = 1;
                    return;
                }
                case -5: 
                case 10: {
                    GameCanvas.var_boolean_arr_for[5] = 1;
                    GameCanvas.var_boolean_arr_do[5] = 1;
                    return;
                }
                case -4: {
                    GameCanvas.var_boolean_arr_for[6] = 1;
                    GameCanvas.var_boolean_arr_do[6] = 1;
                }
                default: {
                    return;
                }
                case -3: {
                    GameCanvas.var_boolean_arr_for[4] = 1;
                    GameCanvas.var_boolean_arr_do[4] = 1;
                    return;
                }
                case 35: {
                    GameCanvas.var_boolean_arr_for[11] = 1;
                    GameCanvas.var_boolean_arr_do[11] = 1;
                    return;
                }
                case 42: 
            }
            GameCanvas.var_boolean_arr_for[10] = 1;
            GameCanvas.var_boolean_arr_do[10] = 1;
        }
    }

    public static boolean boolean_if(int n, int n2, int n3, int n4) {
        if (!(var_boolean_try) && !(var_boolean_new)) {
            return 0;
        }
        return GameCanvas.boolean_do(n, n2, n3, n4);
    }

    public static void (int n, int n2, cp cp2, cp cp3, cp cp4 != null) {
        String string = "";
        Vector<ei> vector = new Vector<ei>();
        if ((n > 0)) {
            String string2;
            if ((n2 <= 0)) {
                string2 = MenuChinhAvatar.cfr_renamed_28;
                if (-(0xE9 ^ 0xA9 ^ (0x65 ^ 0x20)) >= 0) {
                    return;
                }
            } else {
                string2 = MenuChinhAvatar.cU;
            }
            vector.addElement(new ei(string2, cp2));
            string = " " + n + MenuChinhAvatar.cU;
        }
        if ((n2 > 0)) {
            String string3;
            if ((n <= 0)) {
                string3 = MenuChinhAvatar.cfr_renamed_28;
                if (((0x2D ^ 0x77) & ~(0xF8 ^ 0xA2)) >= "  ".length()) {
                    return;
                }
            } else {
                string3 = MenuChinhAvatar.dh;
            }
            vector.addElement(new ei(string3, cp3));
            string = " " + n2 + MenuChinhAvatar.dh;
        }
        if ((vector.size() != 1)) {
            string = MenuChinhAvatar.cfr_renamed_45 + string + " " + MenuChinhAvatar.aq + " ?";
            if (((0x78 ^ 0x53) & ~(7 ^ 0x2C)) != 0) {
                return;
            }
        } else {
            string = MenuChinhAvatar.r + " \n" + n + MenuChinhAvatar.cU + " - " + n2 + " " + MenuChinhAvatar.dh;
        }
        if ((cp4 == null)) {
            vector.addElement(var_ei_do);
            if ("  ".length() < 0) {
                return;
            }
        } else {
            vector.addElement(new ei(MenuChinhAvatar.aq, cp4));
        }
        (string != vector);
    }

    static {
        block2: {
            long l;
            block1: {
                block0: {
                    GameCanvas.cfr_renamed_11();
                    var_boolean_arr_do = new boolean[14];
                    var_boolean_arr_if = new boolean[14];
                    var_boolean_arr_for = new boolean[14];
                    var_int_byte = 0;
                    var_java_util_Vector_if = new Vector();
                    var_java_util_Vector_do = new Vector();
                    coTrangThai = 0;
                    var_boolean_byte = 0;
                    cfr_renamed_6 = -1;
                    var_java_lang_Object_do = new Object();
                    var_int_else = 0;
                    cfr_renamed_16 = 1;
                    var_boolean_goto = 0;
                    var_byte_do = (byte)0;
                    var_java_util_Vector_int = new Vector();
                    var_eq_0_arr_do = new eq_0[3];
                    soXu = 40L;
                    cfr_renamed_30 = 0;
                    int n = QuanLyRMS.int_do("_modspeed");
                    if (!(n > 0)) break block0;
                    l = n;
                    if (" ".length() <= (0x70 ^ 0x74)) break block1;
                    break block2;
                }
                l = 40L;
            }
            soXu = l;
        }
    }

        public final void void_do(int n) {
        block29: {
            block28: {
                if (!(var_boolean_else)) break block28;
                switch (this.getGameAction(n)) {
                    case 1: {
                        GameCanvas.var_boolean_arr_for[2] = 0;
                        return;
                    }
                    case 2: {
                        GameCanvas.var_boolean_arr_for[4] = 0;
                        return;
                    }
                    default: {
                        if ((n != -21)) {
                            n = -6;
                            if (((84 + 52 - 111 + 118 ^ 36 + 28 - -33 + 99) & (135 + 157 - 262 + 201 ^ 119 + 85 - 125 + 93 ^ -" ".length())) > "  ".length()) {
                                return;
                            }
                        } else if ((n != -22)) {
                            n = -7;
                            if ("   ".length() < 0) {
                                return;
                            }
                        }
                        break block29;
                    }
                    case 5: {
                        GameCanvas.var_boolean_arr_for[6] = 0;
                        return;
                    }
                    case 6: {
                        GameCanvas.var_boolean_arr_for[8] = 0;
                        return;
                    }
                    case 8: {
                        GameCanvas.var_boolean_arr_for[5] = 0;
                        return;
                    }
                }
            }
            if ((var_boolean_int) && (n != 27)) {
                n = -7;
            }
        }
        switch (n) {
            case -39: 
            case -2: {
                if (!(var_boolean_long) && !(var_boolean_int)) {
                    GameCanvas.var_boolean_arr_for[8] = 0;
                }
                GameCanvas.var_boolean_arr_if[8] = 1;
                return;
            }
            case -38: 
            case -1: {
                if (!(var_boolean_long) && !(var_boolean_int)) {
                    GameCanvas.var_boolean_arr_for[2] = 0;
                }
                GameCanvas.var_boolean_arr_if[2] = 1;
                return;
            }
            case -22: 
            case -7: {
                GameCanvas.var_boolean_arr_for[13] = 0;
                GameCanvas.var_boolean_arr_if[13] = 1;
                return;
            }
            case -21: 
            case -6: {
                GameCanvas.var_boolean_arr_for[12] = 0;
                GameCanvas.var_boolean_arr_if[12] = 1;
                return;
            }
            case -5: 
            case 10: {
                GameCanvas.var_boolean_arr_for[5] = 0;
                GameCanvas.var_boolean_arr_if[5] = 1;
                return;
            }
            case -4: {
                if (!(var_boolean_long) && !(var_boolean_int)) {
                    GameCanvas.var_boolean_arr_for[6] = 0;
                }
                GameCanvas.var_boolean_arr_if[6] = 1;
            }
            default: {
                return;
            }
            case -3: {
                if (!(var_boolean_long) && !(var_boolean_int)) {
                    GameCanvas.var_boolean_arr_for[4] = 0;
                }
                GameCanvas.var_boolean_arr_if[4] = 1;
                return;
            }
            case 35: {
                GameCanvas.var_boolean_arr_for[11] = 0;
                GameCanvas.var_boolean_arr_if[11] = 1;
                return;
            }
            case 42: 
        }
        GameCanvas.var_boolean_arr_for[10] = 0;
        GameCanvas.var_boolean_arr_if[10] = 1;
    }

    public static void void_do(String string, int n) {
        Vector<ei> vector = new Vector<ei>();
        vector.addElement(new ei(MenuChinhAvatar.cfr_renamed_28, n));
        vector.addElement(var_ei_do);
        (string != vector);
    }
}

