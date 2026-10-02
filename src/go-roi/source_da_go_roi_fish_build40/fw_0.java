/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.midlet.MIDlet
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import main.AngelChip;

/*
 * Renamed from fW
 */
public final class fw_0
implements de,
Runnable {
    private static final int[] mangSoNguyen;
    public static int soLuong;
    private static boolean coTrangThai;
    private static final Object var_java_lang_Object_do;
    private long soXu = 0L;
    private static fw_0 var_fw_0_do;
    public static String chuoiGiaTri;
    private int var_int_if = 0;
    public static boolean dangChayAuto;
    private co[] var_co_arr_do = null;

    public final void void_do() {
        int n;
        if ((dangChayAuto ? 1 : 0 == null)) {
            dangChayAuto = 0;
            fw_0.cfr_renamed_0();
            if (fw_0.cfr_renamed_1(ae.ae_do().boolean_do() ? 1 : 0) && (fh.var_int_char != -1)) {
                TienIchGame.cfr_renamed_1(150, "Tắt auto click");
            }
            GameCanvas.cfr_renamed_3("Tắt auto click");
            return;
        }
        de de2 = P.P_do();
        Object object = Display.getDisplay((MIDlet)AngelChip.midlet).getCurrent();
        if (!(object != de2.var_javax_microedition_lcdui_Form_do) || !(object != de2.var_javax_microedition_lcdui_Form_if) || (object instanceof bo_0 == null)) {
            n = 1;
            if (" ".length() != " ".length()) {
                return;
            }
        } else {
            n = 0;
        }
        if ((n == null)) {
            return;
        }
        if ((chuoiGiaTri.equals("") ? 1 : 0 == null)) {
            GameCanvas.hienThongBaoPopup("AutoClick chưa được cài đặt!");
            return;
        }
        de2 = this;
        object = new Vector();
        String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiGiaTri, ",");
        int n2 = 0;
        while ((n2 != stringArray.length)) {
            block22: {
                String[] stringArray2 = stringArray[n2].trim();
                if (!!(stringArray2.equals(""))) break block22;
                stringArray2 = TienIchGame.java_lang_String_arr_do((String)stringArray2, ":");
                int n3 = 0;
                int n4 = -1;
                int n5 = 0;
                if ((stringArray2.length >= 2)) {
                    block21: {
                        try {
                            n3 = Integer.parseInt(stringArray2[0].trim());
                            n4 = Integer.parseInt(stringArray2[1].trim());
                            if (!(stringArray2.length > 2)) break block21;
                            n5 = Integer.parseInt(stringArray2[2].trim());
                        }
                        catch (NumberFormatException numberFormatException) {
                            n4 = -1;
                        }
                    }
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                if ((n4 >= 0)) {
                    int n6;
                    int n7 = n4 * 1000;
                    if ((n5 != 50)) {
                        n6 = 0;
                        if (" ".length() == -" ".length()) {
                            return;
                        }
                    } else {
                        n6 = n5;
                    }
                    ((Vector)object).addElement(new co(n3, n7, n6));
                }
            }
            ++n2;
            if (-"  ".length() < 0) continue;
            return;
        }
        if (fw_0.cfr_renamed_2(((Vector)object).isEmpty() ? 1 : 0)) {
            ((fw_0)de2).var_co_arr_do = new co[((Vector)object).size()];
            ((Vector)object).copyInto(((fw_0)de2).var_co_arr_do);
            if (-"  ".length() >= 0) {
                return;
            }
        } else {
            ((fw_0)de2).var_co_arr_do = null;
        }
        if ((this.var_co_arr_do == null)) {
            GameCanvas.hienThongBaoPopup("Lỗi cài đặt AutoClick. Vui lòng kiểm tra lại!");
            return;
        }
        this.var_int_if = 0;
        this.soXu = System.currentTimeMillis();
        fw_0.cfr_renamed_0();
        dangChayAuto = 1;
        new Thread(this).start();
        if (fw_0.cfr_renamed_1(ae.ae_do().boolean_do() ? 1 : 0) && (fh.var_int_char != -1)) {
            TienIchGame.cfr_renamed_1(150, "Bật auto click");
        }
        GameCanvas.cfr_renamed_3("Bật auto click");
    }

    public static fw_0 fw_0_do() {
        if ((var_fw_0_do == null)) {
            var_fw_0_do = new fw_0();
        }
        return var_fw_0_do;
    }

                        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        do {
            if (!(dangChayAuto ? 1 : 0 == null)) {
                return;
            }
            if ((this.var_int_if >= this.var_co_arr_do.length)) {
                this.var_int_if = 0;
            }
            if (fw_0.cfr_renamed_3((System.currentTimeMillis() - this.soXu !=  (long)this.var_co_arr_do[this.var_int_if].cfr_renamed_2))) {
                AngelChip.gameCanvas.void_if(this.var_co_arr_do[this.var_int_if].cfr_renamed_0);
                if ((this.var_co_arr_do[this.var_int_if].soLuong > 0)) {
                    block11: {
                        long l = this.var_co_arr_do[this.var_int_if].soLuong;
                        coTrangThai = 1;
                        Object object = var_java_lang_Object_do;
                        synchronized (object) {
                            try {
                                var_java_lang_Object_do.wait(l);
                                }
                            catch (InterruptedException interruptedException) {
                                break block11;
                            }
                            if (" ".length() <= -" ".length()) {
                                return;
                            }
                        }
                    }
                    if (((19 + 105 - -9 + 27 ^ 9 + 10 - -53 + 59) & (89 + 9 - 29 + 71 ^ 47 + 41 - 38 + 125 ^ -" ".length())) != 0) {
                        return;
                    }
                }
                AngelChip.gameCanvas.void_do(this.var_co_arr_do[this.var_int_if].cfr_renamed_0);
                this.soXu = System.currentTimeMillis();
                this.var_int_if += 1;
            }
            TienIchGame.void_if(100L);
            } while ((0xB3 ^ 0xB7) >= "  ".length());
    }

            private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        fw_0.cfr_renamed_3();
        soLuong = 0;
        chuoiGiaTri = "";
        dangChayAuto = 0;
        var_java_lang_Object_do = new Object();
        coTrangThai = 0;
        Object object = QuanLyRMS.byte_arr_do("AutoClickSettings");
        if (!(object > 0)) {
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            soLuong = dataInputStream.readInt();
            chuoiGiaTri = dataInputStream.readUTF();
        }
        catch (IOException iOException) {
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if ("   ".length() != -" ".length()) throw throwable;
            return;
        }
        try {
            dataInputStream.close();
            ((ByteArrayInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_0() {
        if ((coTrangThai ? 1 : 0 == null)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (" ".length() < ((0xD1 ^ 0xC2) & ~(0xD2 ^ 0xC1))) {
                return;
            }
            coTrangThai = 0;
        }
    }

            private static void cfr_renamed_3() {
        mangSoNguyen = new int[7];
        0 = (0x8F ^ 0xB5) & ~(0x5C ^ 0x66);
        -1 = -" ".length();
        150 = 50 + 81 - 73 + 92;
        1 = " ".length();
        2 = "  ".length();
        1000 = 0xFFFFABF8 & 0x57EF;
        50 = 0x80 ^ 0xB2;
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_2() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(soLuong);
            dataOutputStream.writeUTF(chuoiGiaTri);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("AutoClickSettings", byteArrayOutputStream.toByteArray());
        }
        catch (IOException iOException) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                return;
            }
            catch (IOException iOException2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                byteArrayOutputStream.close();
                dataOutputStream.close();
                throw throwable;
            }
            catch (IOException iOException) {
                throw throwable;
            }
        }
        try {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

