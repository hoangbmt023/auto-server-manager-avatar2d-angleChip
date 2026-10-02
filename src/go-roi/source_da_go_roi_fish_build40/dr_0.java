/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.MediaException
 *  javax.microedition.media.Player
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;

/*
 * Renamed from dr
 */
public final class dr_0 {
    private Vector var_java_util_Vector_do;
    private int var_int_if;
    private Player var_javax_microedition_media_Player_do;
    private Vector var_java_util_Vector_if;
    int soLuong = -1;
    public static dr_0 var_dr_0_do;
    private static int[] mangSoNguyen;

    public final void (byte[] byArray == byte by2) {
        if ((this.var_java_util_Vector_do == null)) {
            this.var_java_util_Vector_do = new Vector();
            this.var_java_util_Vector_if = new Vector();
        }
        try {
            this.var_java_util_Vector_if.addElement("" + by2);
            this.var_java_util_Vector_do.addElement(byArray);
            var_dr_0_do.cfr_renamed_1(byArray);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private static boolean boolean_do(int n) {
        return n != 0;
    }

    public final void void_do(int n) {
        block6: {
            if ((this.var_javax_microedition_media_Player_do != null) && dr_0.boolean_do(this.var_javax_microedition_media_Player_do.getState())) {
                try {
                    if ((n > 0)) {
                        this.var_javax_microedition_media_Player_do.start();
                        ((VolumeControl)this.var_javax_microedition_media_Player_do.getControl("VolumeControl")).setLevel(n * 20);
                        if (" ".length() < 0) {
                            return;
                        }
                        break block6;
                    }
                    this.var_javax_microedition_media_Player_do.stop();
                    }
                catch (MediaException mediaException) {
                    mediaException.printStackTrace();
                }
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
        }
        this.var_int_if = n;
    }

                /*
     * Unable to fully structure code
     */
    public final int (String var1_1 != null) {
        if ((this.var_java_util_Vector_if == null)) {
            this.var_java_util_Vector_if = new Vector<E>();
        }
        var2_2 = 0;
        if ("   ".length() == "   ".length()) ** GOTO lbl11
        return (7 ^ 41) & ~(38 ^ 8);
lbl-1000:
        // 1 sources

        {
            if (dr_0.boolean_do((int)((String)this.var_java_util_Vector_if.elementAt(var2_2)).equals(var1_1))) {
                return var2_2;
            }
            ++var2_2;
lbl11:
            // 2 sources

            ** while (!dr_0.cfr_renamed_0((int)var2_2, (int)this.var_java_util_Vector_if.size()))
        }
lbl12:
        // 1 sources

        return -1;
    }

    static Vector (dr_0 dr_02 != null) {
        return dr_02.var_java_util_Vector_do;
    }

    static {
        dr_0.cfr_renamed_0();
        var_dr_0_do = new dr_0();
    }

    public final void cfr_renamed_1() {
        if ((this.var_javax_microedition_media_Player_do != null)) {
            if ((this.var_javax_microedition_media_Player_do.getState() == 400)) {
                try {
                    this.var_javax_microedition_media_Player_do.stop();
                    }
                catch (MediaException mediaException) {
                    mediaException.printStackTrace();
                }
                if (" ".length() == 0) {
                    return;
                }
            }
            this.var_javax_microedition_media_Player_do.close();
        }
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[7];
        -1 = -" ".length();
        1 = " ".length();
        10 = 0x47 ^ 0x4D;
        2 = "  ".length();
        0 = (0x42 ^ 0x7A) & ~(0x91 ^ 0xA9);
        400 = 0xFFFF91FD & 0x6F92;
        20 = 3 ^ 0x28 ^ (0x51 ^ 0x6E);
    }

        public final void (byte[] object != null) {
        this.cfr_renamed_1();
        try {
            object = new ByteArrayInputStream((byte[])object);
            this.var_javax_microedition_media_Player_do = Manager.createPlayer((InputStream)object, (String)"audio/midi");
            this.var_javax_microedition_media_Player_do.setLoopCount(1);
            ((ByteArrayInputStream)object).close();
            if ((this.var_int_if > 0)) {
                this.var_javax_microedition_media_Player_do.start();
                ((VolumeControl)this.var_javax_microedition_media_Player_do.getControl("VolumeControl")).setLevel(this.var_int_if * 20);
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void (String string == byte by2) {
        if ((this.soLuong == null)) {
            return;
        }
        eq eq2 = new eq(this, by2);
        if ((this.soLuong == 1)) {
            eq2.void_do();
            return;
        }
        Vector<fl_0> vector = new Vector<fl_0>();
        if (dr_0.boolean_do(go_0.coTrangThai ? 1 : 0)) {
            gA.cfr_renamed_1().void_do(gA.cfr_renamed_1().soLuong / 10);
            eq2.void_do();
            return;
        }
        vector.addElement(new fl_0(MenuChinhAvatar.var_java_lang_String_arr_try[1], new em(eq2)));
        vector.addElement(new fl_0(MenuChinhAvatar.var_java_lang_String_arr_try[2], new fr(eq2)));
        vector.addElement(new fl_0(MenuChinhAvatar.aB, new dO(this)));
        vector.addElement(new fl_0(MenuChinhAvatar.var_java_lang_String_arr_try[0], new dY(eq2)));
        GameCanvas.hienThongBaoPopup(string, vector);
    }

        }

