/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class an
extends InputStream {
    private static final int[] mangSoNguyen;
    private final InputStream var_java_io_InputStream_do;

    public final int read() {
        int n = this.var_java_io_InputStream_do.read();
        if ((n == -1)) {
            return -1;
        }
        return (n ^ -1) & 255;
    }

    static {
        an.cfr_renamed_1();
    }

    public an(InputStream inputStream) {
        this.var_java_io_InputStream_do = inputStream;
    }

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[2];
        -1 = -" ".length();
        255 = (0x1E ^ 0x12) + (37 + 116 - 55 + 145) - (122 + 106 - 202 + 166) + (185 + 166 - 179 + 20);
    }

    }

