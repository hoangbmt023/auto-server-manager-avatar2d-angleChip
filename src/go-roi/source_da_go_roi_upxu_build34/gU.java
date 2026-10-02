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

public final class gU
implements cp,
Runnable {
    private static gU var_gU_do;
    public static boolean dangChayAuto;
    public static String chuoiGiaTri;
    private static final int[] mangSoNguyen;
    private static final Object var_java_lang_Object_do;
    public static int soLuong;
    private long soXu = 0L;
    private am[] var_am_arr_do = null;
    private static boolean coTrangThai;
    private int var_int_if = 0;

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
            if ((this.var_int_if >= this.var_am_arr_do.length)) {
                this.var_int_if = 0;
            }
            if (gU.cfr_renamed_3((System.currentTimeMillis() - this.soXu !=  (long)this.var_am_arr_do[this.var_int_if].cfr_renamed_3))) {
                AngelChip.gameCanvas.void_if(this.var_am_arr_do[this.var_int_if].cfr_renamed_1);
                if ((this.var_am_arr_do[this.var_int_if].soLuong > 0)) {
                    block10: {
                        long l = this.var_am_arr_do[this.var_int_if].soLuong;
                        coTrangThai = 1;
                        Object object = var_java_lang_Object_do;
                        synchronized (object) {
                            try {
                                var_java_lang_Object_do.wait(l);
                                }
                            catch (InterruptedException interruptedException) {
                                break block10;
                            }
                            if ((0x7F ^ 0x7B) < "  ".length()) {
                                return;
                            }
                        }
                    }
                    }
                AngelChip.gameCanvas.void_do(this.var_am_arr_do[this.var_int_if].cfr_renamed_1);
                this.soXu = System.currentTimeMillis();
                this.var_int_if += 1;
            }
            TienIchGame.hienThongBao(100L);
            } while ((0x7E ^ 0x7A) > "  ".length());
    }

    public final void void_do() {
        int n;
        if ((dangChayAuto ? 1 : 0 == null)) {
            dangChayAuto = 0;
            gU.cfr_renamed_3();
            if (gU.cfr_renamed_1(i_0.i_0_do().boolean_do() ? 1 : 0) && (ef_0.soLuong != -1)) {
                TienIchGame.cfr_renamed_0(150, "Tắt auto click");
            }
            GameCanvas.cfr_renamed_3("Tắt auto click");
            return;
        }
        cp cp2 = H.H_do();
        Object object = Display.getDisplay((MIDlet)AngelChip.midlet).getCurrent();
        if (!(object != cp2.var_javax_microedition_lcdui_Form_if) || !(object != cp2.var_javax_microedition_lcdui_Form_do) || (object instanceof bi_0 == null)) {
            n = 1;
            if ("  ".length() == -" ".length()) {
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
        cp2 = this;
        object = new Vector();
        String[] stringArray = TienIchGame.java_lang_String_arr_do(chuoiGiaTri, ",");
        int n2 = 0;
        while ((n2 < stringArray.length)) {
            block22: {
                String[] stringArray2 = stringArray[n2].trim();
                if (!(stringArray2.equals("") ? 1 : 0 != null)) break block22;
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
                    if (((0xA5 ^ 0x8D) & ~(0x72 ^ 0x5A)) < ((0x90 ^ 0x80) & ~(0x88 ^ 0x98))) {
                        return;
                    }
                }
                if ((n4 >= 0)) {
                    int n6;
                    int n7 = n4 * 1000;
                    if ((n5 < 50)) {
                        n6 = 0;
                        if (((124 + 95 - 159 + 101 ^ 108 + 118 - 212 + 115) & (0x75 ^ 0x6E ^ (0xB3 ^ 0x88) ^ -" ".length())) != 0) {
                            return;
                        }
                    } else {
                        n6 = n5;
                    }
                    ((Vector)object).addElement(new am(n3, n7, n6));
                }
            }
            ++n2;
            if (" ".length() > 0) continue;
            return;
        }
        if (gU.cfr_renamed_0(((Vector)object).isEmpty() ? 1 : 0)) {
            ((gU)cp2).var_am_arr_do = new am[((Vector)object).size()];
            ((Vector)object).copyInto(((gU)cp2).var_am_arr_do);
            if ("   ".length() <= ((0xA ^ 0x44) & ~(0x55 ^ 0x1B))) {
                return;
            }
        } else {
            ((gU)cp2).var_am_arr_do = null;
        }
        if ((this.var_am_arr_do == null)) {
            GameCanvas.hienThongBaoPopup("Lỗi cài đặt AutoClick. Vui lòng kiểm tra lại!");
            return;
        }
        this.var_int_if = 0;
        this.soXu = System.currentTimeMillis();
        gU.cfr_renamed_3();
        dangChayAuto = 1;
        new Thread(this).start();
        if (gU.cfr_renamed_1(i_0.i_0_do().boolean_do() ? 1 : 0) && (ef_0.soLuong != -1)) {
            TienIchGame.cfr_renamed_0(150, "Bật auto click");
        }
        GameCanvas.cfr_renamed_3("Bật auto click");
    }

            /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        gU.cfr_renamed_4();
        soLuong = 0;
        chuoiGiaTri = "";
        dangChayAuto = 0;
        var_java_lang_Object_do = new Object();
        coTrangThai = 0;
        Object object = QuanLyRMS.byte_arr_do("AutoClickSettings");
        if (!(object != null)) {
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
            if (" ".length() < (0x78 ^ 0x2A ^ (0xE7 ^ 0xB1))) throw throwable;
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

        private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        public static gU gU_do() {
        if ((var_gU_do == null)) {
            var_gU_do = new gU();
        }
        return var_gU_do;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(soLuong);
            dataOutputStream.writeUTF(chuoiGiaTri);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.luuDuLieu("AutoClickSettings", byteArrayOutputStream.toByteArray());
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

            private static void cfr_renamed_4() {
        mangSoNguyen = new int[7];
        0 = (0x6F ^ 0x4F) & ~(0xA ^ 0x2A);
        -1 = -" ".length();
        150 = (0x8B ^ 0x8F) + (0x61 ^ 0x51) - (0x4B ^ 0x67) + (12 + 31 - -99 + 0);
        1 = " ".length();
        2 = "  ".length();
        1000 = -(0xFFFFDAE3 & 0x751F) & (0xFFFFD3FF & 0x7FEA);
        50 = 0x9A ^ 0xA8;
    }

        /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        if ((coTrangThai ? 1 : 0 == null)) {
            Object object = var_java_lang_Object_do;
            synchronized (object) {
                var_java_lang_Object_do.notifyAll();
            }
            if (((0x85 ^ 0xA8 ^ 23 + 88 - 33 + 49) & (0x47 ^ 3 ^ (0x76 ^ 0x60) ^ -" ".length())) != ((1 + 87 - -20 + 20 ^ 134 + 60 - 57 + 26) & (0x17 ^ 0x76 ^ (0xD8 ^ 0x9A) ^ -" ".length()))) {
                return;
            }
            coTrangThai = 0;
        }
    }

        }

