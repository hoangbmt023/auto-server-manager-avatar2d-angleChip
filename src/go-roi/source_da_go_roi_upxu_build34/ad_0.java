/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

/*
 * Renamed from aD
 */
public final class ad_0 {
    ByteArrayOutputStream var_java_io_ByteArrayOutputStream_do = null;
    DataInputStream var_java_io_DataInputStream_do = null;
    public byte var_byte_do;
    private ByteArrayInputStream var_java_io_ByteArrayInputStream_do = null;
    DataOutputStream var_java_io_DataOutputStream_do = null;

    public ad_0() {
    }

    public ad_0(byte by2) {
        this.var_byte_do = by2;
        this.var_java_io_ByteArrayOutputStream_do = new ByteArrayOutputStream();
        this.var_java_io_DataOutputStream_do = new DataOutputStream(this.var_java_io_ByteArrayOutputStream_do);
    }

    public final DataInputStream cfr_renamed_0() {
        return this.var_java_io_DataInputStream_do;
    }

    public ad_0(byte by2, byte[] byArray) {
        this.var_byte_do = by2;
        this.var_java_io_ByteArrayInputStream_do = new ByteArrayInputStream(byArray);
        this.var_java_io_DataInputStream_do = new DataInputStream(this.var_java_io_ByteArrayInputStream_do);
    }
}

