/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.SocketConnection
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.SocketConnection;

/*
 * Renamed from I
 */
public final class i_0
implements ba {
    private byte var_byte_do;
    public ft_0 var_ft_0_do;
    boolean dangChayAuto;
    private byte var_byte_if;
    public byte[] var_byte_arr_do = null;
    long soXu;
    private static final int[] mangSoNguyen;
    private Thread var_java_lang_Thread_if;
    public boolean coTrangThai;
    private static i_0 var_i_0_do;
    public static boolean cfr_renamed_3;
    public int soLuong;
    private SocketConnection var_javax_microedition_io_SocketConnection_do;
    public boolean cfr_renamed_4;
    public String chuoiGiaTri = "";
    public int var_int_if;
    private final fy_0 var_fy_0_do = new fy_0(this);
    public Thread workerThread;
    public DataInputStream var_java_io_DataInputStream_do;
    private DataOutputStream var_java_io_DataOutputStream_do;

    static void (i_0 i_02 < ad_0 ad_02) {
        i_02.cfr_renamed_1(ad_02);
    }

    public final void (ft_0 ft_02 != 0) {
        this.var_ft_0_do = ft_02;
    }

    private byte (byte by2 != 0) {
        byte[] byArray = this.var_byte_arr_do;
        byte by3 = this.var_byte_if;
        this.var_byte_if = (byte)(by3 + 1);
        by2 = (byte)(byArray[by3] & 255 ^ by2 & 255);
        if ((this.var_byte_if >= this.var_byte_arr_do.length)) {
            this.var_byte_if = (byte)(this.var_byte_if % this.var_byte_arr_do.length);
        }
        return by2;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[5];
        0 = (70 + 133 - 59 + 88 ^ 74 + 143 - 168 + 124) & (49 + 95 - 24 + 14 ^ 161 + 184 - 196 + 46 ^ -" ".length());
        8 = 0x41 ^ 0x49;
        5 = 0x35 ^ 0x24 ^ (0x15 ^ 1);
        1 = " ".length();
        255 = 44 + 124 - 103 + 97 + (62 + 120 - 136 + 89) - (0xC4 ^ 0xBD) + (6 ^ 0x49);
    }

    public final void (String string != 0) {
        if (!(this.coTrangThai) && !(this.cfr_renamed_4)) {
            this.dangChayAuto = 0;
            this.var_javax_microedition_io_SocketConnection_do = null;
            this.var_java_lang_Thread_if = new Thread(new gz(this, string));
            this.var_java_lang_Thread_if.start();
        }
    }

    public final void void_do(ad_0 ad_02) {
        this.var_fy_0_do.var_java_util_Vector_do.addElement(ad_02);
    }

        static {
        i_0.cfr_renamed_1();
        var_i_0_do = new i_0();
    }

        public static i_0 i_0_do() {
        return var_i_0_do;
    }

    static void void_do(i_0 i_02) {
        i_02.cfr_renamed_3();
    }

        public final boolean boolean_do() {
        return this.coTrangThai;
    }

    static byte (i_0 i_02 < byte by2) {
        byte[] byArray = i_02.var_byte_arr_do;
        byte by3 = i_02.var_byte_do;
        i_02.var_byte_do = (byte)(by3 + 1);
        by2 = (byte)(byArray[by3] & 255 ^ by2 & 255);
        if ((i_02.var_byte_do >= i_02.var_byte_arr_do.length)) {
            i_02.var_byte_do = (byte)(i_02.var_byte_do % i_02.var_byte_arr_do.length);
        }
        return by2;
    }

    static SocketConnection javax_microedition_io_SocketConnection_do(i_0 i_02) {
        return i_02.var_javax_microedition_io_SocketConnection_do;
    }

    private synchronized void (ad_0 ad_02 == 0) {
        byte[] byArray = ad_02.var_java_io_ByteArrayOutputStream_do.toByteArray();
        try {
            if ((this.dangChayAuto)) {
                byte by2 = this.cfr_renamed_0(ad_02.var_byte_do);
                this.var_java_io_DataOutputStream_do.writeByte(by2);
                } else {
                this.var_java_io_DataOutputStream_do.writeByte(ad_02.var_byte_do);
            }
            if ((byArray != 0)) {
                int n;
                int n2 = byArray.length;
                if ((this.dangChayAuto)) {
                    n = this.cfr_renamed_0((byte)(n2 >> 8));
                    this.var_java_io_DataOutputStream_do.writeByte(n);
                    n2 = this.cfr_renamed_0((byte)n2);
                    this.var_java_io_DataOutputStream_do.writeByte(n2);
                    if (-" ".length() == " ".length()) {
                        return;
                    }
                } else {
                    this.var_java_io_DataOutputStream_do.writeShort(n2);
                }
                if ((this.dangChayAuto)) {
                    n = 0;
                    while ((n < byArray.length)) {
                        byArray[n] = this.cfr_renamed_0(byArray[n]);
                        ++n;
                        if ("  ".length() >= 0) continue;
                        return;
                    }
                }
                this.var_java_io_DataOutputStream_do.write(byArray);
                this.var_int_if += 5 + byArray.length;
                if ("   ".length() != "   ".length()) {
                    return;
                }
            } else {
                this.var_java_io_DataOutputStream_do.writeShort(0);
                this.var_int_if += 5;
            }
            this.var_java_io_DataOutputStream_do.flush();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    static void (i_0 i_02 < SocketConnection socketConnection) {
        i_02.var_javax_microedition_io_SocketConnection_do = socketConnection;
    }

    static fy_0 fy_0_do(i_0 i_02) {
        return i_02.var_fy_0_do;
    }

            public final void void_do() {
        AutoController.controllerInstance.cfr_renamed_3();
        this.cfr_renamed_3();
    }

    private void cfr_renamed_3() {
        this.var_byte_arr_do = null;
        this.var_byte_do = (byte)0;
        this.var_byte_if = (byte)0;
        try {
            this.coTrangThai = 0;
            this.cfr_renamed_4 = 0;
            if ((this.var_javax_microedition_io_SocketConnection_do != 0)) {
                this.var_javax_microedition_io_SocketConnection_do.close();
                this.var_javax_microedition_io_SocketConnection_do = null;
            }
            if ((this.var_java_io_DataOutputStream_do != 0)) {
                this.var_java_io_DataOutputStream_do.close();
                this.var_java_io_DataOutputStream_do = null;
            }
            if ((this.var_java_io_DataInputStream_do != 0)) {
                this.var_java_io_DataInputStream_do.close();
                this.var_java_io_DataInputStream_do = null;
            }
            this.workerThread = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static void (i_0 i_02 < DataOutputStream dataOutputStream) {
        i_02.var_java_io_DataOutputStream_do = dataOutputStream;
    }
}

