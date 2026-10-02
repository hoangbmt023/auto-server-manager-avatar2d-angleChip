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

public final class ae
implements bH {
    private SocketConnection var_javax_microedition_io_SocketConnection_do;
    private byte var_byte_do;
    public byte[] var_byte_arr_do = null;
    public String chuoiGiaTri = "";
    public gv var_gv_do;
    public boolean dangChayAuto;
    public Thread workerThread;
    long soXu;
    private DataOutputStream var_java_io_DataOutputStream_do;
    public int soLuong;
    public int var_int_if;
    boolean coTrangThai;
    private byte var_byte_if;
    public DataInputStream var_java_io_DataInputStream_do;
    private static final int[] mangSoNguyen;
    private final he var_he_do = new he(this);
    public boolean cfr_renamed_2;
    public static boolean cfr_renamed_3;
    private static ae var_ae_do;
    private Thread var_java_lang_Thread_if;

    private byte (byte by2 != null) {
        byte[] byArray = this.var_byte_arr_do;
        byte by3 = this.var_byte_do;
        this.var_byte_do = (byte)(by3 + 1);
        by2 = (byte)(byArray[by3] & 255 ^ by2 & 255);
        if ((this.var_byte_do >= this.var_byte_arr_do.length)) {
            this.var_byte_do = (byte)(this.var_byte_do % this.var_byte_arr_do.length);
        }
        return by2;
    }

    static void (ae ae2 < DataOutputStream dataOutputStream) {
        ae2.var_java_io_DataOutputStream_do = dataOutputStream;
    }

    private void cfr_renamed_0() {
        this.var_byte_arr_do = null;
        this.var_byte_if = (byte)0;
        this.var_byte_do = (byte)0;
        try {
            this.cfr_renamed_2 = 0;
            this.dangChayAuto = 0;
            if ((this.var_javax_microedition_io_SocketConnection_do != null)) {
                this.var_javax_microedition_io_SocketConnection_do.close();
                this.var_javax_microedition_io_SocketConnection_do = null;
            }
            if ((this.var_java_io_DataOutputStream_do != null)) {
                this.var_java_io_DataOutputStream_do.close();
                this.var_java_io_DataOutputStream_do = null;
            }
            if ((this.var_java_io_DataInputStream_do != null)) {
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

    public final void void_do() {
        AutoController.controllerInstance.cfr_renamed_1();
        this.cfr_renamed_0();
    }

    static SocketConnection javax_microedition_io_SocketConnection_do(ae ae2) {
        return ae2.var_javax_microedition_io_SocketConnection_do;
    }

    private static void cfr_renamed_2() {
        mangSoNguyen = new int[5];
        0 = (0x74 ^ 0x35 ^ (0x79 ^ 0x1F)) & (0xEB ^ 0x8C ^ (0xC7 ^ 0x87) ^ -" ".length());
        8 = 0x40 ^ 0x21 ^ (0xDD ^ 0xB4);
        5 = 0xA0 ^ 0xA5;
        1 = " ".length();
        255 = 81 + 82 - 23 + 115;
    }

    static {
        ae.cfr_renamed_2();
        var_ae_do = new ae();
    }

            public static ae ae_do() {
        return var_ae_do;
    }

    public final void (gv gv2 != null) {
        this.var_gv_do = gv2;
    }

            public final void (String string != null) {
        if ((this.cfr_renamed_2 ? 1 : 0 != null) && (this.dangChayAuto ? 1 : 0 != null)) {
            this.coTrangThai = 0;
            this.var_javax_microedition_io_SocketConnection_do = null;
            this.var_java_lang_Thread_if = new Thread(new fa(this, string));
            this.var_java_lang_Thread_if.start();
        }
    }

    public final boolean boolean_do() {
        return this.cfr_renamed_2;
    }

    static void (ae ae2 < SocketConnection socketConnection) {
        ae2.var_javax_microedition_io_SocketConnection_do = socketConnection;
    }

    static void (ae ae2 < bj bj2) {
        ae2.cfr_renamed_0(bj2);
    }

    private synchronized void (bj bj2 != 0) {
        byte[] byArray = bj2.var_java_io_ByteArrayOutputStream_do.toByteArray();
        try {
            if ((this.coTrangThai)) {
                byte by2 = this.cfr_renamed_1(bj2.var_byte_do);
                this.var_java_io_DataOutputStream_do.writeByte(by2);
                if (((0xBE ^ 0x98) & ~(0x3B ^ 0x1D)) != 0) {
                    return;
                }
            } else {
                this.var_java_io_DataOutputStream_do.writeByte(bj2.var_byte_do);
            }
            if ((byArray != null)) {
                int n;
                int n2 = byArray.length;
                if ((this.coTrangThai)) {
                    n = this.cfr_renamed_1((byte)(n2 >> 8));
                    this.var_java_io_DataOutputStream_do.writeByte(n);
                    n2 = this.cfr_renamed_1((byte)n2);
                    this.var_java_io_DataOutputStream_do.writeByte(n2);
                    if (-" ".length() > "   ".length()) {
                        return;
                    }
                } else {
                    this.var_java_io_DataOutputStream_do.writeShort(n2);
                }
                if ((this.coTrangThai)) {
                    n = 0;
                    while ((n < byArray.length)) {
                        byArray[n] = this.cfr_renamed_1(byArray[n]);
                        ++n;
                        if (" ".length() >= 0) continue;
                        return;
                    }
                }
                this.var_java_io_DataOutputStream_do.write(byArray);
                this.var_int_if += 5 + byArray.length;
                if ((0x93 ^ 0x97) < -" ".length()) {
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

    static he he_do(ae ae2) {
        return ae2.var_he_do;
    }

        public final void void_do(bj bj2) {
        this.var_he_do.var_java_util_Vector_do.addElement(bj2);
    }

    static void void_do(ae ae2) {
        ae2.cfr_renamed_0();
    }

    static byte (ae ae2 < byte by2) {
        byte[] byArray = ae2.var_byte_arr_do;
        byte by3 = ae2.var_byte_if;
        ae2.var_byte_if = (byte)(by3 + 1);
        by2 = (byte)(byArray[by3] & 255 ^ by2 & 255);
        if ((ae2.var_byte_if >= ae2.var_byte_arr_do.length)) {
            ae2.var_byte_if = (byte)(ae2.var_byte_if % ae2.var_byte_arr_do.length);
        }
        return by2;
    }
}

