/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import main.AngelChip;

final class ck
implements de,
Runnable {
    private final byte var_byte_do;
    private final boolean dangChayAuto;
    private static final int[] mangSoNguyen;

        private static void (hs hs2 < String string) {
        if ((hs2 != null) && (string != null) && (string.equals("") ? 1 : 0 != null)) {
            hs2.var_boolean_arr_do = (boolean[])new cU(50, string, 0);
            hs2.var_boolean_arr_do.void_do(hs2.coKichHoat ? 1 : 0, hs2.cfr_renamed_3 - 45);
        }
    }

                static {
        ck.cfr_renamed_0();
    }

    public final void run() {
        Vector<hs> vector = new Vector<hs>();
        int n = 0;
        while ((n < dR.var_java_util_Vector_byte.size())) {
            hs hs2 = (hs)dR.var_java_util_Vector_byte.elementAt(n);
            if (!(!(hs2 != null) || (hs2.cfr_renamed_9 != this.var_byte_do) && ((hs2.cfr_renamed_9 != 50) && (hs2.cfr_renamed_9 != 52) && (hs2.cfr_renamed_9 != 54) && (hs2.cfr_renamed_9 != 56) && (hs2.cfr_renamed_9 != 58) && (hs2.cfr_renamed_9 != 59) && !(hs2.cfr_renamed_9 == 61) || (this.var_byte_do != -1)) && ((hs2.cfr_renamed_9 != 51) && (hs2.cfr_renamed_9 != 55) && !(hs2.cfr_renamed_9 == 60) || !(this.var_byte_do == -2)))) {
                int n2 = bz.gk_0_do((int)hs2.cfr_renamed_9).soLuong * 60;
                if ((this.dangChayAuto ? 1 : 0 != null) && (hs2.cfr_renamed_15 <= n2)) {
                    (hs2 < "Em còn nhỏ");
                    if (((0xAC ^ 0x87) & ~(0x72 ^ 0x59)) > "   ".length()) {
                        return;
                    }
                } else if ((hs2.cfr_renamed_15 > n2) && (hs2.cfr_renamed_12 < 95)) {
                    (hs2 < "Bơm thuốc bổ đã");
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                } else {
                    vector.addElement(hs2);
                }
            }
            ++n;
            if (" ".length() != 0) continue;
            return;
        }
        n = 0;
        if ((vector.isEmpty() ? 1 : 0 != null)) {
            int n3 = 0;
            while ((n3 < vector.size())) {
                hs hs3 = (hs)vector.elementAt(n3);
                et_0.et_0_do().cfr_renamed_1(dR.var_int_goto, hs3.cfr_renamed_9);
                if ((TienIchGame.boolean_if(5000L))) {
                    ++n;
                    (hs3 < "Bye bye T.T");
                    TienIchGame.void_if(500L);
                }
                ++n3;
                return;
            }
            GameCanvas.hienThongBaoPopup("Số vật nuôi đã bán: " + n);
            return;
        }
        GameCanvas.hienThongBaoPopup("Không có gì để bán!");
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[15];
        50 = 0x7A ^ 0x48;
        0 = (1 ^ 0x57) & ~(0x4D ^ 0x1B);
        45 = 0x84 ^ 0xA9;
        52 = 0x67 ^ 0x53;
        54 = 0xEA ^ 0xAC ^ (0x1F ^ 0x6F);
        56 = 0xE8 ^ 0xAE ^ (0x78 ^ 6);
        58 = 0xD ^ 0x20 ^ (0x63 ^ 0x74);
        59 = 54 + 2 - -9 + 78 ^ 49 + 1 - -122 + 8;
        61 = 52 + 72 - 0 + 24 ^ 37 + 16 - -2 + 114;
        -1 = -" ".length();
        51 = 0x48 ^ 0x7B;
        55 = 0x62 ^ 0x1B ^ (0xDD ^ 0x93);
        60 = 93 + 69 - 146 + 118 ^ 84 + 50 - 101 + 153;
        -2 = -"  ".length();
        95 = 19 + 127 - 67 + 125 ^ 38 + 79 - 115 + 145;
    }

    public ck(int n, boolean bl) {
        this.var_byte_do = (byte)n;
        this.dangChayAuto = bl;
    }

    public final void void_do() {
        if ((dR.var_int_goto != AngelChip.duLieuNguoiChoi.var_short_goto)) {
            return;
        }
        new Thread(this).start();
    }

                }

