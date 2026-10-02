/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class bj {
    DataInputStream var_java_io_DataInputStream_do = null;
    ByteArrayOutputStream var_java_io_ByteArrayOutputStream_do = null;
    private ByteArrayInputStream var_java_io_ByteArrayInputStream_do = null;
    DataOutputStream var_java_io_DataOutputStream_do = null;
    public byte var_byte_do;

    public bj() {
    }

    public bj(byte by2, byte[] byArray) {
        this.var_byte_do = by2;
        this.var_java_io_ByteArrayInputStream_do = new ByteArrayInputStream(byArray);
        this.var_java_io_DataInputStream_do = new DataInputStream(this.var_java_io_ByteArrayInputStream_do);
    }

    public final DataInputStream cfr_renamed_1() {
        return this.var_java_io_DataInputStream_do;
    }

    public bj(byte by2) {
        this.var_byte_do = by2;
        this.var_java_io_ByteArrayOutputStream_do = new ByteArrayOutputStream();
        this.var_java_io_DataOutputStream_do = new DataOutputStream(this.var_java_io_ByteArrayOutputStream_do);
    }
}

