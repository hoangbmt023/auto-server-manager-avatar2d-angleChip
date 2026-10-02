/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 */
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.io.HttpConnection;

public final class k
extends cR {
    public static boolean dangChayAuto;
    private static final int[] mangSoNguyen;
    private byte[] var_byte_arr_do;

        static {
        k.cfr_renamed_0();
        dangChayAuto = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        int n;
        block38: {
            n = 0;
            if (k.cfr_renamed_1((Object)TienIchGame.chuoiGiaTri) && (TienIchGame.chuoiGiaTri.length() > 0)) {
                FilterInputStream filterInputStream;
                HttpConnection httpConnection;
                block37: {
                    this.var_byte_arr_do = cR.chuoiGiaTri.getBytes();
                    httpConnection = null;
                    filterInputStream = null;
                    try {
                        httpConnection = k.javax_microedition_io_HttpConnection_do(TienIchGame.java_lang_String_if(br_0.java_lang_String_do(br_0.soLuong)));
                        if (((httpConnection != 0))) {
                            n = 0;
                            filterInputStream = httpConnection.openDataInputStream();
                            Object object = filterInputStream;
                            k k2 = this;
                            switch (((DataInputStream)object).readByte()) {
                                case 0: {
                                    object = ((DataInputStream)object).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)k2.var_fl_0_if;
                                    TienIchGame.void_if(1000L);
                                    TienIchGame.cfr_renamed_1((String)object, go_0.go_0_do().var_fl_0_if, k2.var_fl_0_do);
                                    break block37;
                                }
                                case 1: {
                                    int n2 = ((DataInputStream)object).readInt();
                                    AutoCauCa.var_int_arr_arr_arr_arr_do[0] = new int[n2][][];
                                    n2 = 0;
                                    while (k.boolean_do(n2, AutoCauCa.var_int_arr_arr_arr_arr_do[0].length)) {
                                        AutoCauCa.var_int_arr_arr_arr_arr_do[0][n2] = k2.int_arr_arr_do(((DataInputStream)object).readUTF());
                                        ++n2;
                                        if (-" ".length() < "  ".length()) continue;
                                        return;
                                    }
                                    n2 = ((DataInputStream)object).readInt();
                                    AutoCauCa.var_int_arr_arr_arr_arr_do[1] = new int[n2][][];
                                    n2 = 0;
                                    while (k.boolean_do(n2, AutoCauCa.var_int_arr_arr_arr_arr_do[1].length)) {
                                        AutoCauCa.var_int_arr_arr_arr_arr_do[1][n2] = k2.int_arr_arr_do(((DataInputStream)object).readUTF());
                                        ++n2;
                                        if (" ".length() <= " ".length()) continue;
                                        return;
                                    }
                                    n2 = ((DataInputStream)object).readInt();
                                    AutoCauCa.var_int_arr_arr_arr_arr_do[2] = new int[n2][][];
                                    n2 = 0;
                                    while (k.boolean_do(n2, AutoCauCa.var_int_arr_arr_arr_arr_do[2].length)) {
                                        AutoCauCa.var_int_arr_arr_arr_arr_do[2][n2] = k2.int_arr_arr_do(((DataInputStream)object).readUTF());
                                        ++n2;
                                        if ((0xE8 ^ 0x96 ^ (0x26 ^ 0x5C)) > "  ".length()) continue;
                                        return;
                                    }
                                    n2 = ((DataInputStream)object).readInt();
                                    AutoCauCa.var_int_arr_arr_arr_arr_do[3] = new int[n2][][];
                                    n2 = 0;
                                    while (k.boolean_do(n2, AutoCauCa.var_int_arr_arr_arr_arr_do[3].length)) {
                                        AutoCauCa.var_int_arr_arr_arr_arr_do[3][n2] = k2.int_arr_arr_do(((DataInputStream)object).readUTF());
                                        ++n2;
                                        if (-" ".length() >= -" ".length()) continue;
                                        return;
                                    }
                                    AutoCauCa.bs_0_do();
                                    if ((AutoCauCa.boolean_do())) {
                                        TienIchGame.aq_0_do();
                                        TienIchGame.void_for();
                                        ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)k2.var_fl_0_if;
                                        TienIchGame.void_if(1000L);
                                        GameCanvas.cfr_renamed_1(br_0.java_lang_String_do(4), k2.var_fl_0_do);
                                        if (-" ".length() >= ((1 ^ 0x35) & ~(0x9F ^ 0xAB))) {
                                            return;
                                        }
                                        break block37;
                                    } else {
                                        GameCanvas.cfr_renamed_7();
                                        if ("   ".length() < ((0x80 ^ 0xA9) & ~(0x59 ^ 0x70))) {
                                            return;
                                        }
                                    }
                                    break block37;
                                }
                                case -1: {
                                    String string = ((DataInputStream)object).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)k2.var_fl_0_if;
                                    TienIchGame.void_if(1000L);
                                    GameCanvas.cfr_renamed_1(string, k2.var_fl_0_do);
                                    break block37;
                                }
                                case 3: {
                                    String string = ((DataInputStream)object).readUTF();
                                    String string2 = ((DataInputStream)object).readUTF();
                                    TienIchGame.aq_0_do();
                                    TienIchGame.void_for();
                                    ThongTinNhanVat.cfr_renamed_1().chuoiGiaTri = ((DataInputStream)object).readUTF();
                                    ab_0.var_ab_0_do = null;
                                    ab_0.cfr_renamed_1().cfr_renamed_1(new Hashtable(), string, string2, -1);
                                    TienIchGame.void_if(1000L);
                                    GameCanvas.cfr_renamed_7();
                                    GameCanvas.var_ez_do = ab_0.cfr_renamed_1();
                                    ab_0.cfr_renamed_1().cfr_renamed_5 = (int)k2.var_fl_0_if;
                                    ab_0.cfr_renamed_1().cfr_renamed_4 = (int)k2.var_fl_0_do;
                                }
                                default: {
                                    if ("  ".length() != "  ".length()) {
                                        return;
                                    }
                                    break block37;
                                }
                            }
                        }
                        n = 1;
                    }
                    catch (Exception exception) {
                        n = 1;
                        try {
                            if (k.cfr_renamed_1((Object)httpConnection)) {
                                httpConnection.close();
                            }
                            if ((filterInputStream != 0)) {
                                filterInputStream.close();
                            }
                            }
                        catch (IOException iOException) {
                            if (("  ".length() & ~"  ".length()) != 0) {
                                return;
                            }
                            break block38;
                        }
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                        break block38;
                    }
                    catch (Throwable throwable) {
                        try {
                            if ((httpConnection != 0)) {
                                httpConnection.close();
                            }
                            if ((filterInputStream != 0)) {
                                filterInputStream.close();
                            }
                            throw throwable;
                        }
                        catch (IOException iOException) {
                            throw throwable;
                        }
                    }
                }
                try {
                    if (k.cfr_renamed_1((Object)httpConnection)) {
                        httpConnection.close();
                    }
                    if ((filterInputStream != 0)) {
                        filterInputStream.close();
                    }
                    }
                catch (IOException iOException) {
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                    break block38;
                }
                if (((0x78 ^ 9 ^ (0x86 ^ 0xBD)) & (75 + 169 - 29 + 20 ^ 50 + 96 - -6 + 9 ^ -" ".length())) == -" ".length()) {
                    return;
                }
            }
        }
        dangChayAuto = 0;
        System.gc();
        if (!(n != 0)) return;
        if (k.boolean_if(this.cfr_renamed_0, 3)) {
            TienIchGame.aq_0_do();
            TienIchGame.void_for();
            ThongTinNhanVat.cfr_renamed_1().var_int_try = (int)this.var_fl_0_if;
            TienIchGame.void_if(1000L);
            GameCanvas.cfr_renamed_1(br_0.java_lang_String_do(4), this.var_fl_0_do);
            return;
        }
        AutoCauCa.var_int_arr_arr_arr_arr_do = new int[4][][][];
        this.void_do();
    }

            public k() {
        this.cfr_renamed_0 = 0;
    }

    private int[][] int_arr_arr_do(String object) {
        byte[] byArray = eo_0.cfr_renamed_1((String)object);
        object = this;
        int n = ((k)object).var_byte_arr_do.length;
        int n2 = 0;
        while (k.boolean_do(n2, byArray.length)) {
            int n3 = n2;
            byArray[n3] = (byte)(byArray[n3] ^ ((k)object).var_byte_arr_do[n2 % n]);
            ++n2;
            return null;
        }
        return AutoCauCa.cfr_renamed_1(byArray);
    }

    public final void void_do() {
        if ((dangChayAuto)) {
            return;
        }
        AutoCauCa.bs_0_do();
        if ((AutoCauCa.boolean_do())) {
            this.cfr_renamed_0 += 1;
            dangChayAuto = 1;
            AutoCauCa.var_int_arr_arr_arr_arr_do = new int[4][][][];
            new Thread(this).start();
        }
    }

    private static boolean boolean_do(int n, int n2) {
        return n < n2;
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[6];
        0 = (0x49 ^ 0x46 ^ (0x7D ^ 0x29)) & (70 + 90 - 138 + 231 ^ 43 + 10 - -94 + 19 ^ -" ".length());
        1 = " ".length();
        4 = 76 + 45 - 85 + 107 ^ 9 + 3 - -55 + 72;
        2 = "  ".length();
        3 = "   ".length();
        -1 = -" ".length();
    }

    private static boolean boolean_if(int n, int n2) {
        return n >= n2;
    }
}

