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
 * Renamed from dn
 */
public final class dn_0
extends NhiemVuAutoBase {
    private int var_int_if;
    public static int soLuong;
    private int soLuongKhoa;
    public long soXu;
    private static final int[] mangSoNguyen;
    public static boolean dangChayAuto;
    private int cfr_renamed_4;
    private long var_long_for;
    private long cfr_renamed_15;
    public long var_long_if = 0L;
    private int cfr_renamed_5;
    private static dn_0 var_dn_0_do;
    public static byte var_byte_do;
    private int cfr_renamed_2 = 0;

    /*
     * Loose catch block
     */
    static {
        block11: {
            dn_0.cfr_renamed_5();
            soLuong = 60;
            dangChayAuto = 1;
            var_byte_do = (byte)0;
            Object object = QuanLyRMS.byte_arr_do("FreeTimeSettings");
            if (!(object != null)) break block11;
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
                    if (-" ".length() >= 0) {
                        break block11;
                    }
                    throw throwable;
                }
            }
        }
    }

    private static boolean boolean_do(int n) {
        return n < 0;
    }

    public final String toString() {
        return "Treo nick";
    }

        public static dn_0 dn_0_do() {
        if ((var_dn_0_do == null)) {
            var_dn_0_do = new dn_0();
        }
        return var_dn_0_do;
    }

    public final void void_do() {
        if ((var_byte_do != 0) && (TienIchGame.cfr_renamed_2(ef_0.soLuong) ? 1 : 0 == null)) {
            GameCanvas.hienThongBaoPopup("Không thể treo nick ở map này!");
            return;
        }
        super.cfr_renamed_13();
        this.cfr_renamed_5 = ef_0.soLuong;
        this.cfr_renamed_4 = fe_0.var_byte_for;
        this.soLuongKhoa = AngelChip.duLieuNguoiChoi.coKichHoat ? 1 : 0;
        this.var_int_if = AngelChip.duLieuNguoiChoi.var_short_if;
        this.cfr_renamed_15 = System.currentTimeMillis();
        this.soXu = soLuong * 60000;
        if ((this.cfr_renamed_2 != AngelChip.duLieuNguoiChoi.var_short_char)) {
            this.cfr_renamed_2 = AngelChip.duLieuNguoiChoi.var_short_char;
            this.var_long_if = 0L;
        }
        AutoController.cfr_renamed_0(this);
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
            QuanLyRMS.luuDuLieu("FreeTimeSettings", byteArrayOutputStream.toByteArray());
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

    public dn_0() {
        this.var_long_for = TienIchGame.int_do(1, 45) * 1000 + 15000;
    }

    public final void void_for() {
        if (dn_0.cfr_renamed_5((System.currentTimeMillis() - this.cfr_renamed_4 != 180000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.void_if(16000L);
            return;
        }
        if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if (dn_0.cfr_renamed_4((System.currentTimeMillis() != this.var_long_if))) {
            this.var_long_if = System.currentTimeMillis() + this.soXu;
            if ((ef_0.soLuong == 25)) {
                fe_0.fe_0_do().cfr_renamed_21();
                TienIchGame.hienThongBao(2000L);
            }
            if ((dangChayAuto ? 1 : 0 == null) && (AutoFarm.var_byte_if == null)) {
                AutoController.batAuto(new AutoLaiBuon());
                return;
            }
            AutoController.batAuto(new AutoFarm());
            return;
        }
        if ((var_byte_do == null)) {
            if ((GameCanvas.var_dL_do instanceof fw == null)) {
                TienIchGame.hienThongBao(1500L);
                AutoController.controllerInstance.cfr_renamed_4();
                fe_0.fe_0_do().cfr_renamed_21();
                TienIchGame.hienThongBao(1000L);
                fe_0.fe_0_do();
                fe_0.cfr_renamed_6();
                TienIchGame.hienThongBao(1000L);
                GameCanvas.gameCanvas.keyPressed(-5);
                TienIchGame.hienThongBao(250L);
                GameCanvas.gameCanvas.keyReleased(-5);
                TienIchGame.cfr_renamed_8(2000L);
                if (-(0x4A ^ 0x62 ^ (0xA7 ^ 0x8B)) > 0) {
                    return;
                }
            } else {
                TienIchGame.hienThongBao(1500L);
                AutoController.controllerInstance.cfr_renamed_5();
            }
            if ((GameCanvas.var_dL_do instanceof ThongTinNhanVat == null)) {
                fe_0.cfr_renamed_28();
            }
            TienIchGame.void_if(this.var_long_if - System.currentTimeMillis());
            return;
        }
        if ((ef_0.soLuong == this.cfr_renamed_5) && (!(fe_0.var_byte_for != this.cfr_renamed_4) || (this.cfr_renamed_5 == 25))) {
            long l = System.currentTimeMillis();
            if (dn_0.cfr_renamed_5((l - this.cfr_renamed_15 != this.var_long_for))) {
                this.cfr_renamed_15 = l;
                this.cfr_renamed_4 = (int)l;
                this.var_long_for = TienIchGame.int_do(1, 45) * 1000 + 15000;
                AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.var_int_if);
                el_0.el_0_do().cfr_renamed_0(this.soLuongKhoa, this.var_int_if, 2, 0);
                TienIchGame.hienThongBao(1000L);
                fe_0.void_int(10);
            }
            return;
        }
        if ((ef_0.soLuong != this.cfr_renamed_5)) {
            long l;
            if ((!(GameCanvas.var_dL_do instanceof fw == null) || (ef_0.soLuong == -1)) && dn_0.boolean_do(dn_0.cfr_renamed_0(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_2, 2000L))) {
                TienIchGame.hienThongBao(2000L - l);
            }
            if ((TienIchGame.cfr_renamed_3(this.cfr_renamed_5))) {
                if ((fe_0.var_byte_for == this.cfr_renamed_4)) {
                    TienIchGame.hienThongBao(1000L);
                    AngelChip.duLieuNguoiChoi.void_do(this.soLuongKhoa, this.var_int_if);
                    el_0.el_0_do().cfr_renamed_0(this.soLuongKhoa, this.var_int_if, 2, 0);
                    TienIchGame.hienThongBao(1000L);
                    fe_0.void_int(10);
                    this.cfr_renamed_15 = System.currentTimeMillis();
                    return;
                }
                TienIchGame.hienThongBao(3500L);
            }
            return;
        }
        if ((this.cfr_renamed_5 != 25) && (fe_0.var_byte_for != this.cfr_renamed_4)) {
            ef_0.var_int_char = this.soLuongKhoa;
            ef_0.var_int_new = this.var_int_if;
            this.cfr_renamed_15 = System.currentTimeMillis();
            el_0.el_0_do().cfr_renamed_4(this.cfr_renamed_5, this.cfr_renamed_4);
            TienIchGame.cfr_renamed_2(5000L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_22();
    }

                        private static void cfr_renamed_5() {
        mangSoNguyen = new int[12];
        0 = (0x1E ^ 0x1B ^ (0x3E ^ 0x79)) & (6 ^ 0x74 ^ (0x4E ^ 0x7E) ^ -" ".length());
        1 = " ".length();
        45 = 3 ^ 0x2E;
        1000 = -(0xFFFFBFB6 & 0x7C5D) & (0xFFFFBFFF & 0x7FFB);
        15000 = -(0xFFFF9F97 & 0x656E) & (0xFFFFBFDD & 0x7FBF);
        60000 = 0xFFFFFBEA & 0xEE75;
        25 = 0x66 ^ 0x60 ^ (0x6C ^ 0x73);
        -5 = -(70 + 113 - 179 + 129 ^ 68 + 85 - 84 + 59);
        2 = "  ".length();
        10 = 0x13 ^ 0x15 ^ (0x7D ^ 0x71);
        -1 = -" ".length();
        60 = 0xA2 ^ 0x85 ^ (0x2F ^ 0x34);
    }

    }

