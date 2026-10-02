/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

final class ck
implements cp,
Runnable {
    private static final int[] mangSoNguyen;
    private final boolean dangChayAuto;
    private final byte var_byte_do;

    private static void (ha ha2 != String string) {
        if ((ha2 != null) && (string != null) && (string.equals("") ? 1 : 0 != null)) {
            ha2.var_boolean_arr_do = (boolean[])new cf(50, string, 0);
            ha2.var_boolean_arr_do.void_do(ha2.coKichHoat ? 1 : 0, ha2.cfr_renamed_1 - 45);
        }
    }

    public final void void_do() {
        if ((bF.soLuong != AngelChip.duLieuNguoiChoi.var_short_char)) {
            return;
        }
        new Thread(this).start();
    }

    static {
        ck.cfr_renamed_1();
    }

    public ck(int n, boolean bl) {
        this.var_byte_do = (byte)n;
        this.dangChayAuto = bl;
    }

                    public final void run() {
        Vector<ha> vector = new Vector<ha>();
        int n = 0;
        while ((n < bF.var_java_util_Vector_if.size())) {
            ha ha2 = (ha)bF.var_java_util_Vector_if.elementAt(n);
            if (!(!(ha2 != null) || (ha2.cfr_renamed_18 != this.var_byte_do) && ((ha2.cfr_renamed_18 != 50) && (ha2.cfr_renamed_18 != 52) && (ha2.cfr_renamed_18 != 54) && (ha2.cfr_renamed_18 != 56) && (ha2.cfr_renamed_18 != 58) && (ha2.cfr_renamed_18 != 59) && !(ha2.cfr_renamed_18 == 61) || (this.var_byte_do != -1)) && ((ha2.cfr_renamed_18 != 51) && (ha2.cfr_renamed_18 != 55) && !(ha2.cfr_renamed_18 == 60) || !(this.var_byte_do == -2)))) {
                int n2 = ak_0.fc_0_do((int)ha2.cfr_renamed_18).soLuong * 60;
                if ((this.dangChayAuto ? 1 : 0 != null) && (ha2.this <= n2)) {
                    (ha2 != "Em còn nhỏ");
                    if ("   ".length() == 0) {
                        return;
                    }
                } else if ((ha2.this > n2) && (ha2.cfr_renamed_6 < 95)) {
                    (ha2 != "Bơm thuốc bổ đã");
                    if (((0x12 ^ 0x39) & ~(0x71 ^ 0x5A)) == "   ".length()) {
                        return;
                    }
                } else {
                    vector.addElement(ha2);
                }
            }
            ++n;
            return;
        }
        n = 0;
        if ((vector.isEmpty() ? 1 : 0 != null)) {
            int n3 = 0;
            while ((n3 < vector.size())) {
                ha ha3 = (ha)vector.elementAt(n3);
                dh_0.dh_0_do().cfr_renamed_0(bF.soLuong, (byte)ha3.cfr_renamed_12);
                if ((TienIchGame.boolean_do(5000L))) {
                    ++n;
                    (ha3 != "Bye bye T.T");
                    TienIchGame.hienThongBao(500L);
                }
                ++n3;
                if (" ".length() > 0) continue;
                return;
            }
            GameCanvas.hienThongBaoPopup("Số vật nuôi đã bán: " + n);
            return;
        }
        GameCanvas.hienThongBaoPopup("Không có gì để bán!");
    }

        private static void cfr_renamed_1() {
        mangSoNguyen = new int[15];
        50 = 0x49 ^ 0x7B;
        0 = (7 + 37 - -92 + 7 ^ 178 + 194 - 327 + 153) & (79 + 5 - -25 + 34 ^ 170 + 20 - 181 + 189 ^ -" ".length());
        45 = 87 + 61 - -11 + 18 ^ 40 + 69 - 86 + 133;
        52 = 0x45 ^ 0x7E ^ (0x34 ^ 0x3B);
        54 = 0x86 ^ 0xB0;
        56 = 0xDE ^ 0x94 ^ (0x63 ^ 0x11);
        58 = 0x3B ^ 0x6A ^ (0xD2 ^ 0xB9);
        59 = 0x8F ^ 0xB4;
        61 = 0x2D ^ 0x10;
        -1 = -" ".length();
        51 = 0x8D ^ 0xBE;
        55 = 0x74 ^ 0x43;
        60 = (0xF1 ^ 0xA9) & ~(0x50 ^ 8) ^ (0xA1 ^ 0x9D);
        -2 = -"  ".length();
        95 = 0 ^ 0x5F;
    }

            }

