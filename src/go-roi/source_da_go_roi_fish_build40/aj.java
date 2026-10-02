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

public final class aj
extends NhiemVuAutoBase {
    public String chuoiGiaTri;
    public static boolean dangChayAuto;
    public static byte var_byte_do;
    private int var_int_int;
    private boolean cfr_renamed_6;
    private boolean cfr_renamed_7;
    private static aj var_aj_do;
    public static int soLuong;
    private gb_0[][] var_gb_0_arr_arr_do;
    public boolean coTrangThai;
    public static int var_int_if;
    private static final String tenNhanVat;
    public long soXu = 0L;
    public static ax var_ax_do;
    public static boolean coKichHoat;
    public static int soLuongKhoa;
    public static boolean var_boolean_int;
    private long var_long_for;
    public static boolean cfr_renamed_4;
    public long var_long_if;
    private static final int[] mangSoNguyen;
    public static byte var_byte_if;
    public static boolean cfr_renamed_5;

        public final void void_do(int n) {
        this.var_int_int = n;
    }

    private static void cfr_renamed_6() {
        if (aj.boolean_do(coKichHoat ? 1 : 0) && aj.boolean_do(AutoFarm.var_byte_do)) {
            AutoController.cfr_renamed_1(new hn());
            return;
        }
        AutoController.cfr_renamed_1(new AutoFarm());
    }

    private static boolean boolean_do(int n) {
        return n == 0;
    }

                    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        aj.cfr_renamed_7();
        coKichHoat = 1;
        soLuong = 0;
        soLuongKhoa = 0;
        var_ax_do = null;
        int[] nArray = new int[23];
        nArray[0] = 99;
        nArray[1] = 249;
        nArray[2] = 54;
        nArray[3] = 134;
        nArray[4] = 127;
        nArray[5] = 132;
        nArray[6] = 54;
        nArray[7] = 129;
        nArray[8] = 126;
        nArray[9] = 266;
        nArray[10] = 132;
        nArray[11] = 125;
        nArray[12] = 54;
        nArray[13] = 121;
        nArray[14] = 126;
        nArray[15] = 259;
        nArray[16] = 132;
        nArray[17] = 126;
        nArray[18] = 54;
        nArray[19] = 142;
        nArray[20] = 247;
        nArray[21] = 121;
        nArray[22] = 17;
        tenNhanVat = TienIchGame.cfr_renamed_1(nArray);
        cfr_renamed_5 = 1;
        var_int_if = 60;
        dangChayAuto = 1;
        var_boolean_int = 0;
        cfr_renamed_4 = 0;
        var_byte_do = (byte)0;
        var_byte_if = (byte)6;
        Object object = QuanLyRMS.byte_arr_do("DiamondSettings");
        if (!(object != 0)) {
            return;
        }
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            dangChayAuto = dataInputStream.readBoolean();
            var_boolean_int = dataInputStream.readBoolean();
            cfr_renamed_4 = dataInputStream.readBoolean();
            cfr_renamed_5 = dataInputStream.readBoolean();
            var_int_if = dataInputStream.readInt();
            coKichHoat = dataInputStream.readBoolean();
            var_byte_if = dataInputStream.readByte();
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
            if (((124 + 97 - 92 + 3 ^ 37 + 43 - -100 + 14) & (98 + 70 - 157 + 190 ^ 35 + 32 - -20 + 56 ^ -" ".length())) == ((0xA6 ^ 0xA2 ^ (0x81 ^ 0xB6)) & (0x38 ^ 0x4D ^ (0x37 ^ 0x71) ^ -" ".length()))) throw throwable;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeBoolean(dangChayAuto);
            dataOutputStream.writeBoolean(var_boolean_int);
            dataOutputStream.writeBoolean(cfr_renamed_4);
            dataOutputStream.writeBoolean(cfr_renamed_5);
            dataOutputStream.writeInt(var_int_if);
            dataOutputStream.writeBoolean(coKichHoat);
            dataOutputStream.writeByte(var_byte_if);
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            QuanLyRMS.docDuLieu("DiamondSettings", byteArrayOutputStream.toByteArray());
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

    public static aj aj_do() {
        if ((var_aj_do == null)) {
            var_aj_do = new aj();
        }
        return var_aj_do;
    }

    public final void (gb_0[][] gb_0Array == null) {
        this.var_int_int = 3;
        this.var_gb_0_arr_arr_do = gb_0Array;
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_16();
        this.var_int_int = 0;
        this.coTrangThai = 0;
        this.var_long_for = 45000L + (long)(TienIchGame.int_do(0, 45) * 1000);
        this.var_long_if = var_int_if * 60000;
        this.chuoiGiaTri = br_0.java_lang_String_do(br_0.soLuong + 5);
        this.cfr_renamed_6 = 0;
        this.cfr_renamed_7 = 0;
        var_byte_do = (byte)0;
    }

    protected final void d_() {
        if (aj.cfr_renamed_4((System.currentTimeMillis() - this.var_int_int <= 300000L))) {
            TienIchGame.dangXuatTaiKhoan();
            TienIchGame.hienThongBao(16000L);
            return;
        }
        if (!aj.boolean_do(GameCanvas.var_en_do instanceof w_0) || !aj.boolean_do(GameCanvas.var_en_do instanceof gI) || !aj.boolean_do(GameCanvas.var_en_do.boolean_do(w_0.var_w_0_do) ? 1 : 0) || aj.cfr_renamed_0(GameCanvas.var_en_do.boolean_do(gI.gI_do()) ? 1 : 0)) {
            if ((this.coTrangThai) && (!aj.boolean_do(var_boolean_int ? 1 : 0) || (cfr_renamed_4)) && aj.boolean_do(this.cfr_renamed_6 ? 1 : 0)) {
                this.cfr_renamed_6 = 1;
                int n = 0;
                dT.var_java_util_Vector_do = null;
                dT.dangChayAuto = 1;
                ft_0.ft_0_do().cfr_renamed_15(AngelChip.duLieuNguoiChoi.var_short_goto);
                if ((TienIchGame.cfr_renamed_4(5000L)) && (dT.var_java_util_Vector_do != 0)) {
                    int n2 = 0;
                    while ((n2 < dT.var_java_util_Vector_do.size())) {
                        cg cg2 = (cg)dT.var_java_util_Vector_do.elementAt(n2);
                        if ((cg2 != 0)) {
                            if ((var_boolean_int) && (cg2.var_short_do == 2135)) {
                                ++n;
                                ft_0.ft_0_do().void_do(2135, 1);
                                TienIchGame.void_if(50L);
                            }
                            if ((cfr_renamed_4) && (cg2.var_short_do == 2136)) {
                                ++n;
                                ft_0.ft_0_do().void_do(2136, 1);
                                TienIchGame.void_if(50L);
                            }
                        }
                        ++n2;
                        return;
                    }
                }
                dT.dangChayAuto = 0;
                if ((n > 0)) {
                    this.coTrangThai = 0;
                }
            }
            switch (this.var_int_int) {
                case 1: {
                    this.var_int_int = 0;
                    this.var_int_int = (int)System.currentTimeMillis();
                    if ((dangChayAuto) && (this.coTrangThai)) {
                        if ((GameCanvas.var_en_do instanceof ep != 0)) {
                            ep.cfr_renamed_1().cfr_renamed_3();
                        }
                        this.coTrangThai = 0;
                        AutoController.cfr_renamed_1(new c());
                        return;
                    }
                    if ((cfr_renamed_5) && aj.cfr_renamed_4((System.currentTimeMillis() <= this.soXu))) {
                        if ((GameCanvas.var_en_do instanceof ep != 0)) {
                            ep.cfr_renamed_1().cfr_renamed_3();
                        }
                        this.soXu = System.currentTimeMillis() + this.var_long_if;
                        aj.cfr_renamed_6();
                        return;
                    }
                    if (aj.boolean_do(this.cfr_renamed_7 ? 1 : 0)) {
                        this.cfr_renamed_7 = 1;
                        super.int_do(0);
                        }
                    TienIchGame.void_if(1000L);
                    w_0.cfr_renamed_21();
                    return;
                }
                case 2: {
                    this.var_int_int = 0;
                    this.var_int_int = (int)System.currentTimeMillis();
                    if ((dangChayAuto) && (this.coTrangThai)) {
                        if ((GameCanvas.var_en_do instanceof ep != 0)) {
                            ep.cfr_renamed_1().cfr_renamed_3();
                        }
                        this.coTrangThai = 0;
                        AutoController.cfr_renamed_1(new c());
                        return;
                    }
                    if ((cfr_renamed_5) && aj.cfr_renamed_4((System.currentTimeMillis() <= this.soXu))) {
                        if ((GameCanvas.var_en_do instanceof ep != 0)) {
                            ep.cfr_renamed_1().cfr_renamed_3();
                        }
                        this.soXu = System.currentTimeMillis() + this.var_long_if;
                        aj.cfr_renamed_6();
                        return;
                    }
                    if (aj.boolean_do(this.cfr_renamed_7 ? 1 : 0)) {
                        this.cfr_renamed_7 = 1;
                        super.int_do(0);
                        }
                    TienIchGame.void_if(1000L);
                    w_0.var_w_0_do.cfr_renamed_3();
                    return;
                }
                case 4: {
                    this.var_int_int = 0;
                    this.var_int_int = (int)System.currentTimeMillis();
                    TienIchGame.void_if(2000L);
                    gI.gI_do().c_();
                    if ((dangChayAuto) && (this.coTrangThai)) {
                        if ((GameCanvas.var_en_do instanceof ep != 0)) {
                            ep.cfr_renamed_1().cfr_renamed_3();
                        }
                        this.coTrangThai = 0;
                        TienIchGame.void_if(1000L);
                        AutoController.cfr_renamed_1(new c());
                        return;
                    }
                    if (!(cfr_renamed_5) || !aj.cfr_renamed_4((System.currentTimeMillis() <= this.soXu))) break;
                    if ((GameCanvas.var_en_do instanceof ep != 0)) {
                        ep.cfr_renamed_1().cfr_renamed_3();
                    }
                    TienIchGame.void_if(1000L);
                    this.soXu = System.currentTimeMillis() + this.var_long_if;
                    aj.cfr_renamed_6();
                    return;
                }
                case 3: {
                    TienIchGame.void_if(1000L);
                    int[] nArray = this.int_arr_do();
                    gI gI2 = gI.gI_do();
                    if ((nArray[1] != -1)) {
                        gI2.soLuong = nArray[0];
                        gI2.var_int_if = nArray[1];
                        gI2.cfr_renamed_9();
                        if ("   ".length() <= 0) {
                            return;
                        }
                    } else {
                        gI2.cfr_renamed_14();
                    }
                    this.var_int_int = 0;
                    this.var_gb_0_arr_arr_do = null;
                    this.var_int_int = (int)System.currentTimeMillis();
                    return;
                }
                case 5: {
                    this.var_int_int = 0;
                    this.var_int_int = (int)System.currentTimeMillis();
                    TienIchGame.void_if(1000L);
                    w_0.var_w_0_do.void_do(50, -1);
                    return;
                }
                case 6: {
                    this.var_int_int = 0;
                    this.var_int_int = (int)System.currentTimeMillis();
                    TienIchGame.void_if(1000L);
                    dt_0.dt_0_do().cfr_renamed_3(w_0.var_byte_for);
                    return;
                }
                default: {
                    if (!aj.boolean_do(w_0.coKichHoat ? 1 : 0) || !aj.boolean_do(w_0.var_boolean_int ? 1 : 0) || !aj.cfr_renamed_4((System.currentTimeMillis() - this.var_int_int <= this.var_long_for))) break;
                    this.var_long_for = 45000L + (long)(TienIchGame.int_do(0, 45) * 1000);
                    this.var_int_int = (int)System.currentTimeMillis();
                    w_0.var_w_0_do.void_for(0);
                    if (!(TienIchGame.boolean_do(15000L))) break;
                    TienIchGame.void_if(2000L);
                }
            }
            return;
        }
        if ((GameCanvas.var_en_do instanceof ThongTinNhanVat != 0)) {
            return;
        }
        if ((GameCanvas.var_en_do instanceof ep != 0)) {
            ep.cfr_renamed_1().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof fo != 0)) {
            fo.fo_do().void_if();
            return;
        }
        if (!aj.boolean_do(GameCanvas.var_en_do instanceof go_0) || (GameCanvas.var_en_do instanceof gO != 0)) {
            long l;
            if ((GameCanvas.var_en_do instanceof gO != 0) && aj.cfr_renamed_2(aj.cfr_renamed_1(l = System.currentTimeMillis() - ((NhiemVuAutoBase)this).cfr_renamed_4, 2000L))) {
                TienIchGame.void_if(2000L - l);
            }
            if ((cfr_renamed_5) && aj.cfr_renamed_4((System.currentTimeMillis() <= this.soXu))) {
                this.soXu = System.currentTimeMillis() + this.var_long_if;
                aj.cfr_renamed_6();
                return;
            }
            if (aj.boolean_do(TienIchGame.cfr_renamed_0(fh.var_int_char) ? 1 : 0) && aj.boolean_do(TienIchGame.boolean_new() ? 1 : 0)) {
                go_0.go_0_do().cfr_renamed_11();
                TienIchGame.void_if(1000L);
                return;
            }
            var_ax_do = null;
            fh.cfr_renamed_9 = 258;
            fh.var_int_try = 156;
            GameCanvas.cfr_renamed_8();
            go_0.var_byte_if = (byte)1;
            ft_0.ft_0_do().cfr_renamed_2(4);
            if ((TienIchGame.boolean_do(90000L))) {
                if ((var_ax_do != 0)) {
                    var_ax_do.cfr_renamed_0();
                }
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if (!aj.boolean_do(GameCanvas.var_en_do instanceof dR) || !(fh.var_int_char != 24) || (fh.var_int_char == 53)) {
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(1000L);
            return;
        }
        if ((GameCanvas.var_en_do instanceof fm_0 != 0)) {
            if ((var_byte_do < 3)) {
                var_byte_do = (byte)(var_byte_do + 1);
                dt_0.dt_0_do().cfr_renamed_3();
                TienIchGame.boolean_do(5000L);
                return;
            }
            fm_0.fm_0_do().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof p_0 != 0)) {
            if ((var_byte_do < 3)) {
                var_byte_do = (byte)(var_byte_do + 1);
                dt_0.dt_0_do().cfr_renamed_3();
                TienIchGame.boolean_do(5000L);
                return;
            }
            p_0.p_0_do().cfr_renamed_3();
            return;
        }
        if ((GameCanvas.var_en_do instanceof al_0 != 0)) {
            al_0.cfr_renamed_1().cfr_renamed_2();
            if ((TienIchGame.boolean_do(15000L))) {
                TienIchGame.void_if(2000L);
            }
            return;
        }
        if ((fh.var_int_char != -1) && aj.boolean_do(TienIchGame.cfr_renamed_0(fh.var_int_char) ? 1 : 0)) {
            go_0.go_0_do().cfr_renamed_11();
            TienIchGame.void_if(1000L);
            return;
        }
        NhiemVuAutoBase.cfr_renamed_20();
    }

    public final boolean boolean_do(String string) {
        if ((string.equals(MenuChinhAvatar.ci))) {
            this.var_int_int = 5;
            return 1;
        }
        if ((string.equals(MenuChinhAvatar.ag))) {
            this.var_int_int = 6;
            return 1;
        }
        if ((string.equals(tenNhanVat))) {
            TienIchGame.void_if();
            if ((ax.var_byte_do == -1)) {
                return 1;
            }
            return 0;
        }
        return super.boolean_do(string);
    }

    public final String toString() {
        return "Auto kim cương";
    }

        private static void cfr_renamed_7() {
        mangSoNguyen = new int[51];
        0 = (177 + 179 - 355 + 181 ^ 143 + 16 - -6 + 13) & (4 ^ 0x48 ^ (0xF9 ^ 0xB1) ^ -" ".length());
        45 = 0x83 ^ 0xAE;
        1000 = 0xFFFFA3EB & 0x5FFC;
        60000 = -(0xFFFFD17D & 0x3E8B) & (0xFFFFFAE8 & 0xFF7F);
        5 = 8 ^ 0x71 ^ (0x23 ^ 0x5F);
        3 = "   ".length();
        1 = " ".length();
        -1 = -" ".length();
        2135 = -(0xFFFFD7C1 & 0x6F3F) & (0xFFFFEF7F & 0x5FD7);
        2136 = 0xFFFFCE7D & 0x39DA;
        6 = 81 + 65 - 129 + 170 ^ 149 + 50 - 152 + 142;
        64 = 42 + 38 - -27 + 115 ^ 68 + 41 - -23 + 26;
        8 = 0x82 ^ 0x8A;
        2 = "  ".length();
        7 = 0x20 ^ 0x72 ^ (0xC5 ^ 0x90);
        9 = 0x52 ^ 0x5B;
        10 = 64 + 90 - 129 + 110 ^ 41 + 49 - 82 + 133;
        16 = 0xE6 ^ 0x82 ^ (0xD1 ^ 0xA5);
        24 = 0xD3 ^ 0x89 ^ (0x24 ^ 0x66);
        15 = 0x34 ^ 0x77 ^ (0x5A ^ 0x16);
        17 = 0x3C ^ 0x4F ^ (0x66 ^ 4);
        50 = 0x2B ^ 0 ^ (0x6C ^ 0x75);
        258 = 0xFFFFE54A & 0x1BB7;
        156 = (0xF1 ^ 0x8A) + (0x92 ^ 0xBF) - (51 + 30 - -29 + 37) + (17 + 0 - 1 + 119);
        4 = 145 + 117 - 214 + 132 ^ 175 + 79 - 103 + 25;
        53 = 0x4C ^ 0x56 ^ (0xB1 ^ 0x9E);
        23 = 0x1B ^ 0xC;
        99 = 0x1F ^ 0x50 ^ (0xB ^ 0x27);
        249 = (0x79 ^ 0x3E) + (128 + 154 - 134 + 73) - (0xFFFFCD22 & 0x33DF) + (189 + 20 - 189 + 195);
        54 = 75 + 169 - 28 + 25 ^ 198 + 70 - 202 + 133;
        134 = (0xAA ^ 0xBC) + (0x77 ^ 0x12) - (0x5C ^ 0x63) + (0x79 ^ 0x33);
        127 = (0xF6 ^ 0xBD) + (1 ^ 0x1C) - (0x58 ^ 0xB) + (0x29 ^ 0x43);
        132 = (0x16 ^ 0x35) + (0x3A ^ 0xD) - -(7 ^ 0x19) + (0x47 ^ 0x4B);
        129 = (0xB0 ^ 0x8D) + "  ".length() - -(2 ^ 0x40) + ((0x56 ^ 7) & ~(0xDF ^ 0x8E));
        126 = 0x3F ^ 0x62 ^ (0x83 ^ 0xA0);
        266 = 0xFFFFF52F & 0xBDA;
        11 = 0x67 ^ 0x6C;
        125 = 129 + 64 - 177 + 169 ^ 184 + 91 - 202 + 123;
        12 = 95 + 137 - 44 + 1 ^ 153 + 14 - 19 + 29;
        13 = 0x87 ^ 0x8A;
        121 = 0xD8 ^ 0xA1;
        14 = 96 + 0 - 54 + 118 ^ 100 + 120 - 208 + 162;
        259 = -(0xF8 ^ 0xB9) & (0xFFFFA3F7 & 0x5D4B);
        18 = 0x29 ^ 0x3B;
        19 = 0x4F ^ 0x5C;
        142 = 107 + 4 - -22 + 9;
        20 = 0x11 ^ 0 ^ (0x24 ^ 0x21);
        247 = 100 + 234 - 290 + 203;
        21 = 206 + 132 - 249 + 119 ^ 66 + 184 - 155 + 102;
        22 = 0x68 ^ 0x7E;
        60 = 0x38 ^ 0xA ^ (0x2E ^ 0x20);
    }

        private static int (long l <= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    public final void (String string <= String string2) {
        if ((string.equals("admin"))) {
            if ((string2.startsWith("Rương của bạn đã đầy"))) {
                this.coTrangThai = 1;
                return;
            }
            if ((string2.startsWith("Bạn nhận được một"))) {
                if ((string2.indexOf("kim cương xanh") != -1)) {
                    if ((var_boolean_int)) {
                        ft_0.ft_0_do().void_do(2135, 1);
                        return;
                    }
                    soLuong += 1;
                    return;
                }
                if ((string2.indexOf("ngọc huyền bí") != -1)) {
                    if ((cfr_renamed_4)) {
                        ft_0.ft_0_do().void_do(2136, 1);
                        return;
                    }
                    soLuongKhoa += 1;
                }
            }
        }
    }

        private int[] int_arr_do() {
        int n;
        short[] sArray = new short[64];
        int n2 = 0;
        int n3 = 0;
        while ((n3 < 8)) {
            int n4 = 0;
            while ((n4 < 8)) {
                sArray[n2] = this.var_gb_0_arr_arr_do[n3][n4].var_short_do;
                ++n2;
                ++n4;
                if (-" ".length() == -" ".length()) continue;
                return null;
            }
            ++n3;
            if (-" ".length() != ((0x53 ^ 0xA ^ (0xD6 ^ 0xB6)) & (0x21 ^ 0x74 ^ (0x41 ^ 0x2D) ^ -" ".length()))) continue;
            return null;
        }
        int[] nArray = new int[2];
        nArray[0] = -1;
        nArray[1] = -1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[2];
        nArray3[0] = -1;
        nArray3[1] = -1;
        int[] nArray4 = nArray3;
        n2 = 0;
        int n5 = 0;
        while ((n5 < 8)) {
            n = 0;
            while ((n < 8)) {
                int[] nArray5 = new int[2];
                nArray5[0] = -1;
                nArray5[1] = -1;
                int[] nArray6 = nArray5;
                if ((n < 7) && (n2 + 1 < 64) && (sArray[n2] == sArray[n2 + 1])) {
                    if ((n > 1) && (n2 - 2 >= 0) && (sArray[n2] == sArray[n2 - 2])) {
                        nArray6[0] = n2 - 2;
                        nArray6[1] = n2 - 1;
                        } else if ((n < 5) && (n2 + 3 < 64) && (sArray[n2] == sArray[n2 + 3])) {
                        nArray6[0] = n2 + 3;
                        nArray6[1] = n2 + 2;
                    }
                    if ((nArray6[1] == -1) && (n5 > 0)) {
                        if ((n > 0) && (n2 - 9 >= 0) && (sArray[n2] == sArray[n2 - 9])) {
                            nArray6[0] = n2 - 9;
                            nArray6[1] = n2 - 1;
                            if (((93 + 126 - 154 + 81 ^ 60 + 97 - 19 + 44) & (54 + 155 - 125 + 76 ^ 99 + 107 - 138 + 64 ^ -" ".length())) != 0) {
                                return null;
                            }
                        } else if ((n < 6) && (n2 - 6 >= 0) && (sArray[n2] == sArray[n2 - 6])) {
                            nArray6[0] = n2 - 6;
                            nArray6[1] = n2 + 2;
                        }
                    }
                    if ((nArray6[1] == -1) && (n5 < 7)) {
                        if ((n > 0) && (n2 + 7 < 64) && (sArray[n2] == sArray[n2 + 7])) {
                            nArray6[0] = n2 + 7;
                            nArray6[1] = n2 - 1;
                            } else if ((n < 6) && (n2 + 10 < 64) && (sArray[n2] == sArray[n2 + 10])) {
                            nArray6[0] = n2 + 10;
                            nArray6[1] = n2 + 2;
                        }
                    }
                }
                if ((nArray6[1] == -1) && (n < 6) && (n2 + 2 < 64) && (sArray[n2] == sArray[n2 + 2])) {
                    if ((n5 > 0) && (n2 - 7 >= 0) && (sArray[n2] == sArray[n2 - 7])) {
                        nArray6[0] = n2 - 7;
                        nArray6[1] = n2 + 1;
                        if (-"   ".length() > 0) {
                            return null;
                        }
                    } else if ((n5 < 7) && (n2 + 9 < 64) && (sArray[n2] == sArray[n2 + 9])) {
                        nArray6[0] = n2 + 9;
                        nArray6[1] = n2 + 1;
                    }
                }
                if ((nArray6[0] != -1) && (nArray6[1] != -1)) {
                    nArray2 = nArray6;
                    if ((var_byte_if <= 5) && (sArray[n2] == var_byte_if)) {
                        nArray4 = nArray6;
                    }
                }
                ++n2;
                ++n;
                if (-"  ".length() <= 0) continue;
                return null;
            }
            ++n5;
            if (-" ".length() != "   ".length()) continue;
            return null;
        }
        if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
            return nArray4;
        }
        if ((var_byte_if > 5) && (nArray2[0] != -1) && (nArray2[1] != -1)) {
            return nArray2;
        }
        int[] nArray7 = nArray2;
        int[] nArray8 = new int[2];
        nArray8[0] = -1;
        nArray8[1] = -1;
        nArray2 = nArray8;
        int[] nArray9 = new int[2];
        nArray9[0] = -1;
        nArray9[1] = -1;
        nArray4 = nArray9;
        n = 0;
        int n6 = 0;
        n2 = 0;
        while ((n2 < 8)) {
            int n7 = 0;
            while ((n7 < 8)) {
                int[] nArray10 = new int[2];
                nArray10[0] = -1;
                nArray10[1] = -1;
                int[] nArray11 = nArray10;
                if ((n2 < 7) && (n + 8 < 64) && (sArray[n] == sArray[n + 8])) {
                    if ((n2 > 1) && (n - 16 >= 0) && (sArray[n] == sArray[n - 16])) {
                        nArray11[0] = n - 16;
                        nArray11[1] = n - 8;
                        if ((0xF2 ^ 0x9B ^ (0x6D ^ 1)) == 0) {
                            return null;
                        }
                    } else if ((n2 < 5) && (n + 24 < 64) && (sArray[n] == sArray[n + 24])) {
                        nArray11[0] = n + 24;
                        nArray11[1] = n + 16;
                    }
                    if ((nArray11[1] == -1) && (n2 > 0)) {
                        if ((n7 > 0) && (n - 9 >= 0) && (sArray[n] == sArray[n - 9])) {
                            nArray11[0] = n - 9;
                            nArray11[1] = n - 8;
                            } else if ((n7 < 7) && (n - 7 >= 0) && (sArray[n] == sArray[n - 7])) {
                            nArray11[0] = n - 7;
                            nArray11[1] = n - 8;
                        }
                    }
                    if ((nArray11[1] == -1) && (n2 < 6)) {
                        if ((n7 > 0) && (n + 15 < 64) && (sArray[n] == sArray[n + 15])) {
                            nArray11[0] = n + 15;
                            nArray11[1] = n + 16;
                            if (" ".length() == 0) {
                                return null;
                            }
                        } else if ((n7 < 7) && (n + 17 < 64) && (sArray[n] == sArray[n + 17])) {
                            nArray11[0] = n + 17;
                            nArray11[1] = n + 16;
                        }
                    }
                }
                if ((nArray11[1] == -1) && (n2 < 6) && (n + 16 < 64) && (sArray[n] == sArray[n + 16])) {
                    if ((n7 > 0) && (n + 7 < 64) && (sArray[n] == sArray[n + 7])) {
                        nArray11[0] = n + 7;
                        nArray11[1] = n + 8;
                        if (" ".length() <= -" ".length()) {
                            return null;
                        }
                    } else if ((n7 < 7) && (n + 9 < 64) && (sArray[n] == sArray[n + 9])) {
                        nArray11[0] = n + 9;
                        nArray11[1] = n + 8;
                    }
                }
                if ((nArray11[0] != -1) && (nArray11[1] != -1)) {
                    nArray2 = nArray11;
                    if ((var_byte_if <= 5) && (sArray[n] == var_byte_if)) {
                        nArray4 = nArray11;
                    }
                }
                ++n;
                ++n7;
                if (-" ".length() >= -" ".length()) continue;
                return null;
            }
            if ((n6 >= 5)) {
                if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
                    return nArray4;
                }
                if ((var_byte_if > 5) && (nArray2[0] != -1) && (nArray2[1] != -1)) {
                    return nArray2;
                }
            }
            ++n6;
            ++n2;
            return null;
        }
        if ((nArray4[0] != -1) && (nArray4[1] != -1)) {
            return nArray4;
        }
        if ((nArray7[0] != -1) && (nArray7[1] != -1)) {
            return nArray7;
        }
        return nArray2;
    }
}

