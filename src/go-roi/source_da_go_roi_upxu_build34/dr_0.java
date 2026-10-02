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
    private static int[] mangSoNguyen;
    private Vector var_java_util_Vector_if;
    int soLuong = -1;
    public static dr_0 var_dr_0_do;

    public final void void_do(int n) {
        block6: {
            if ((this.var_javax_microedition_media_Player_do != null) && (this.var_javax_microedition_media_Player_do.getState() == null)) {
                try {
                    if (dr_0.boolean_do(n)) {
                        this.var_javax_microedition_media_Player_do.start();
                        ((VolumeControl)this.var_javax_microedition_media_Player_do.getControl("VolumeControl")).setLevel(n * 20);
                        if ((0x7F ^ 0x7B) == " ".length()) {
                            return;
                        }
                        break block6;
                    }
                    this.var_javax_microedition_media_Player_do.stop();
                    }
                catch (MediaException mediaException) {
                    mediaException.printStackTrace();
                }
                if (((0 ^ 0x54 ^ (1 ^ 0xB)) & (0x32 ^ 0x18 ^ (0x35 ^ 0x41) ^ -" ".length())) != 0) {
                    return;
                }
            }
        }
        this.var_int_if = n;
    }

    public final void cfr_renamed_0() {
        if ((this.var_javax_microedition_media_Player_do != null)) {
            if ((this.var_javax_microedition_media_Player_do.getState() == 400)) {
                try {
                    this.var_javax_microedition_media_Player_do.stop();
                    }
                catch (MediaException mediaException) {
                    mediaException.printStackTrace();
                }
                if (((0xEC ^ 0x88 ^ (0xB8 ^ 0xC2)) & (14 + 27 - 2 + 146 ^ 74 + 161 - 138 + 70 ^ -" ".length())) != 0) {
                    return;
                }
            }
            this.var_javax_microedition_media_Player_do.close();
        }
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[7];
        -1 = -" ".length();
        1 = " ".length();
        10 = 0x76 ^ 0x7C;
        2 = "  ".length();
        0 = (0x91 ^ 0x9F) & ~(0x11 ^ 0x1F);
        400 = -(0xFFFFFEAF & 0x3F7C) & (0xFFFFFFBF & 0x3FFB);
        20 = 0x80 ^ 0x94;
    }

    static {
        dr_0.cfr_renamed_1();
        var_dr_0_do = new dr_0();
    }

    private static boolean boolean_do(int n) {
        return n > 0;
    }

    public final void (byte[] object != null) {
        this.cfr_renamed_0();
        try {
            object = new ByteArrayInputStream((byte[])object);
            this.var_javax_microedition_media_Player_do = Manager.createPlayer((InputStream)object, (String)"audio/midi");
            this.var_javax_microedition_media_Player_do.setLoopCount(1);
            ((ByteArrayInputStream)object).close();
            if (dr_0.boolean_do(this.var_int_if)) {
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
        if ((this.soLuong == 0)) {
            return;
        }
        dO dO2 = new dO(this, by2);
        if ((this.soLuong == 1)) {
            dO2.void_do();
            return;
        }
        Vector<ei> vector = new Vector<ei>();
        if ((fe_0.var_boolean_try ? 1 : 0 == null)) {
            ey_0.cfr_renamed_0().void_for(ey_0.cfr_renamed_0().soLuong / 10);
            dO2.void_do();
            return;
        }
        vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_arr_break[1], new dk_0(dO2)));
        vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_arr_break[2], new ep_0(dO2)));
        vector.addElement(new ei(MenuChinhAvatar.aq, new fn(this)));
        vector.addElement(new ei(MenuChinhAvatar.var_java_lang_String_arr_break[0], new fx(dO2)));
        GameCanvas.hienThongBaoPopup(string, vector);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int (String string != null) {
        if ((this.var_java_util_Vector_do == null)) {
            this.var_java_util_Vector_do = new Vector();
        }
        int n = 0;
        while (!(n >= this.var_java_util_Vector_do.size())) {
            if (dr_0.cfr_renamed_1(((String)this.var_java_util_Vector_do.elementAt(n)).equals(string) ? 1 : 0)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

        static Vector (dr_0 dr_02 != null) {
        return dr_02.var_java_util_Vector_if;
    }

    public final void (byte[] byArray == byte by2) {
        if ((this.var_java_util_Vector_if == null)) {
            this.var_java_util_Vector_if = new Vector();
            this.var_java_util_Vector_do = new Vector();
        }
        try {
            this.var_java_util_Vector_do.addElement("" + by2);
            this.var_java_util_Vector_if.addElement(byArray);
            var_dr_0_do.cfr_renamed_0(byArray);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

                }

