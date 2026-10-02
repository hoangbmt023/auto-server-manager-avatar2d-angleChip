/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import main.AngelChip;

/*
 * Renamed from eX
 */
public final class ex_0
extends NhiemVuAutoBase {
    private long var_long_for;
    private int var_int_if;
    public long soXu = 0L;
    private int soLuongKhoa;
    private static final int[] mangSoNguyen;
    public long var_long_if;
    private static ex_0 var_ex_0_do;
    public static boolean dangChayAuto;
    private long cfr_renamed_6;
    public static int soLuong;
    public static byte var_byte_do;
    private int cfr_renamed_3;
    private int cfr_renamed_4 = 0;
    private int cfr_renamed_5;

    public ex_0() {
        this.var_long_for = TienIchGame.int_do(1, 45) * 1000 + 15000;
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    public static ex_0 ex_0_do() {
        if ((var_ex_0_do == null)) {
            var_ex_0_do = new ex_0();
        }
        return var_ex_0_do;
    }

    private static void cfr_renamed_6() {
        mangSoNguyen = new int[12];
        0 = (0x48 ^ 0x54) & ~(0xAA ^ 0xB6);
        1 = " ".length();
        45 = 0xE8 ^ 0xC5;
        1000 = -(0xFFFFBEBD & 0x7543) & (0xFFFFF7FF & 0x3FE8);
        15000 = 0xFFFFBEDC & 0x7BBB;
        60000 = 0xFFFFFFE4 & 0xEA7B;
        25 = 158 + 35 - 61 + 44 ^ 102 + 26 - -37 + 4;
        -5 = -(0x7A ^ 0x44 ^ (0xB9 ^ 0x82));
        2 = "  ".length();
        10 = 0x91 ^ 0xC3 ^ (0x6F ^ 0x37);
        -1 = -" ".length();
        60 = 0xC ^ 0x40 ^ (0x5D ^ 0x2D);
    }

    public final String toString() {
        return "Treo nick";
    }

        public final void cfr_renamed_3() {
        if ((var_byte_do != 0) && !(TienIchGame.cfr_renamed_2(fh.var_int_char))) {
            GameCanvas.hienThongBaoPopup("Không thể treo nick ở map này!");
            return;
        }
        super.cfr_renamed_16();
        this.cfr_renamed_5 = fh.var_int_char;
        this.cfr_renamed_3 = go_0.var_byte_do;
        this.soLuongKhoa = AngelChip.duLieuNguoiChoi.var_short_for;
        this.var_int_if = AngelChip.duLieuNguoiChoi.var_boolean_int ? 1 : 0;
        this.cfr_renamed_6 = System.currentTimeMillis();
        this.var_long_if = soLuong * 60000;
        if ((this.cfr_renamed_4 != AngelChip.duLieuNguoiChoi.var_short_goto)) {
            this.cfr_renamed_4 = AngelChip.duLieuNguoiChoi.var_short_goto;
            this.soXu = 0L;
        }
        AutoController.cfr_renamed_1(this);
    }

        public final void d_() {
        if (ex_0.cfr_renamed_0((System.currentTimeMillis() - this.cfr_renamed_3 != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if (ex_0.cfr_renamed_3((System.currentTimeMillis() != this.soXu))) {
            this.soXu = System.currentTimeMillis() + this.var_long_if;
            if ((fh.var_int_char == 25)) {
                go_0.go_0_do().cfr_renamed_11();
                TienIchGame.void_if(2000L);
            }
            if (!(dangChayAuto) && (AutoFarm.var_byte_do == 0)) {
                AutoController.cfr_renamed_1(new hn());
                return;
            }
            AutoController.cfr_renamed_1(new AutoFarm());
            return;
        }
        if ((var_byte_do == 0)) {
            if ((GameCanvas.var_en_do instanceof gO == 0)) {
                TienIchGame.void_if(1500L);
                AutoController.controllerInstance.cfr_renamed_3();
                go_0.go_0_do().cfr_renamed_11();
                TienIchGame.void_if(1000L);
                go_0.go_0_do();
                go_0.cfr_renamed_22();
                TienIchGame.void_if(1000L);
                GameCanvas.gameCanvas.keyPressed(-5);
                TienIchGame.void_if(250L);
                GameCanvas.gameCanvas.keyReleased(-5);
                TienIchGame.cfr_renamed_3(2000L);
                if ((0x20 ^ 0x25) <= 0) {
                    return;
                }
            } else {
                TienIchGame.void_if(1500L);
                AutoController.controllerInstance.cfr_renamed_0();
            }
            if ((GameCanvas.var_en_do instanceof ThongTinNhanVat == 0)) {
                go_0.cfr_renamed_27();
            }
            TienIchGame.hienThongBao(this.soXu - System.currentTimeMillis());
            return;
        }
        if ((fh.var_int_char == this.cfr_renamed_5) && (!(go_0.var_byte_do != this.cfr_renamed_3) || (this.cfr_renamed_5 == 25))) {
            long l = System.currentTimeMillis();
            if (ex_0.cfr_renamed_0((l - this.cfr_renamed_6 != this.var_long_for))) {
                this.cfr_renamed_6 = l;
                this.cfr_renamed_3 = (int)l;
                this.var_long_for = TienIchGame.int_do(1, 45) * 1000 + 15000;
                AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.var_int_if);
                fn.fn_do().cfr_renamed_1(this.soLuongKhoa, this.var_int_if, 2, 0);
                TienIchGame.void_if(1000L);
                go_0.cfr_renamed_7(10);
            }
            return;
        }
        if ((fh.var_int_char != this.cfr_renamed_5)) {
            long l;
            if ((!(GameCanvas.var_en_do instanceof gO == 0) || (fh.var_int_char == -1)) && ex_0.boolean_do(ex_0.cfr_renamed_1(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_1(this.cfr_renamed_5))) {
                if ((go_0.var_byte_do == this.cfr_renamed_3)) {
                    TienIchGame.void_if(1000L);
                    AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.var_int_if);
                    fn.fn_do().cfr_renamed_1(this.soLuongKhoa, this.var_int_if, 2, 0);
                    TienIchGame.void_if(1000L);
                    go_0.cfr_renamed_7(10);
                    this.cfr_renamed_6 = System.currentTimeMillis();
                    return;
                }
                TienIchGame.void_if(3500L);
            }
            return;
        }
        if ((this.cfr_renamed_5 != 25) && (go_0.var_byte_do != this.cfr_renamed_3)) {
            fh.cfr_renamed_9 = this.soLuongKhoa;
            fh.var_int_try = this.var_int_if;
            this.cfr_renamed_6 = System.currentTimeMillis();
            fn.fn_do().cfr_renamed_3(this.cfr_renamed_5, this.cfr_renamed_3);
            TienIchGame.boolean_do(5000L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_20();
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(var_byte_do);
            dataOutputStream.writeInt(soLuong);
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("FreeTimeSettings", byteArrayOutputStream.toByteArray());
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
                }
            catch (IOException iOException) {
                throw throwable;
            }
            if (" ".length() != 0) throw throwable;
            return;
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

                        /*
     * Loose catch block
     */
    static {
        block11: {
            ex_0.cfr_renamed_6();
            soLuong = 60;
            dangChayAuto = 1;
            var_byte_do = (byte)0;
            Object object = QuanLyRMS.byte_arr_do("FreeTimeSettings");
            if (!(object > 0)) break block11;
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            var_byte_do = dataInputStream.readByte();
            soLuong = dataInputStream.readInt();
            dangChayAuto = dataInputStream.readBoolean();
            try {
                dataInputStream.close();
                ((ByteArrayInputStream)object).close();
            }
            catch (IOException iOException) {
                }
            break block11;
            catch (IOException iOException) {
                QuanLyRMS.void_do("FreeTimeSettings");
                try {
                    dataInputStream.close();
                    ((ByteArrayInputStream)object).close();
                }
                catch (IOException iOException2) {
                    }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                        ((ByteArrayInputStream)object).close();
                        }
                    catch (IOException iOException3) {
                        }
                    if ((0x71 ^ 0x75) < (0x93 ^ 0x97)) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }
}

