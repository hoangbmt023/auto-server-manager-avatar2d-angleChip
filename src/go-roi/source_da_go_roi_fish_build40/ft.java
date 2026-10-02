/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ft
extends bR {
    private static int var_int_if;
    public int soLuong;
    private int cfr_renamed_2;
    private static cu_0 var_cu_0_do;
    private static cu_0 var_cu_0_if;
    private int cfr_renamed_3;
    private Vector var_java_util_Vector_do;
    private byte var_byte_do;
    private static int cfr_renamed_4;
    private static int cfr_renamed_5;
    private static int[] mangSoNguyen;

                public final void cfr_renamed_0() {
        super.cfr_renamed_0();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics object == 0) {
        GameCanvas.hienThongBaoPopup(object);
        object.translate(-fm.fm_do().cfr_renamed_3, -fm.fm_do().cfr_renamed_2);
        switch (this.var_byte_do) {
            case 0: {
                Object object2 = object;
                ft ft2 = this;
                object2.setColor(14540253);
                int n = 0;
                if (" ".length() > "  ".length()) {
                    return;
                }
                while (true) {
                    if ((n >= ft2.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_02 = (gb_0)ft2.var_java_util_Vector_do.elementAt(n);
                    int n2 = fm.fm_do().cfr_renamed_3 * ((2 - gb_02.cfr_renamed_6) * 20) / 120;
                    object2.fillRect(n2 + ((bm)gb_02).cfr_renamed_2 / 10, ((bm)gb_02).cfr_renamed_3 / 10, 1, gb_02.cfr_renamed_6 + 1);
                    ++n;
                }
            }
            case 1: {
                Object object3 = object;
                ft ft3 = this;
                int n = 0;
                if ((154 + 67 - 207 + 144 ^ 125 + 137 - 195 + 87) <= " ".length()) {
                    return;
                }
                while (true) {
                    if ((n >= ft3.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_03 = (gb_0)ft3.var_java_util_Vector_do.elementAt(n);
                    if (ft.cfr_renamed_3(((bm)gb_03).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3) && ft.cfr_renamed_1(((bm)gb_03).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && ft.cfr_renamed_3(((bm)gb_03).cfr_renamed_3 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_2)) {
                        var_cu_0_if.cfr_renamed_1(gb_03.soLuong / (gb_03.cfr_renamed_8 / 4), ((bm)gb_03).cfr_renamed_2 * dF.cfr_renamed_12 / 10, ((bm)gb_03).cfr_renamed_3 * dF.cfr_renamed_12 / 10, 0, 3, (Graphics)object3);
                    }
                    ++n;
                }
            }
            case 2: {
                if ((this.var_short_do == -1)) {
                    return;
                }
                hm hm2 = aa_0.hm_do(this.var_short_do);
                int n = 0;
                if ("   ".length() < ((0x32 ^ 0x3B ^ (0x46 ^ 0x4A)) & (1 ^ 0x63 ^ (0x7F ^ 0x18) ^ -" ".length()))) {
                    return;
                }
                while (true) {
                    if ((n >= this.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_04 = (gb_0)this.var_java_util_Vector_do.elementAt(n);
                    gb_04.cfr_renamed_7 += 1;
                    if (ft.cfr_renamed_3(((bm)gb_04).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3) && ft.cfr_renamed_1(((bm)gb_04).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && ft.cfr_renamed_3(((bm)gb_04).cfr_renamed_3 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_2) && ft.cfr_renamed_1(((bm)gb_04).cfr_renamed_3 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_int)) {
                        if ((hm2 == 0)) {
                            if ((gb_04.cfr_renamed_7 >= hm2.var_byte_arr_do.length)) {
                                gb_04.cfr_renamed_7 = 0;
                            }
                            hm2.cfr_renamed_1((Graphics)object, ((bm)gb_04).cfr_renamed_2 / 10, ((bm)gb_04).cfr_renamed_3 / 10, gb_04.cfr_renamed_7);
                        }
                        gb_04.var_byte_do = (byte)(gb_04.var_byte_do + 1);
                        if ((gb_04.var_byte_do >= 20)) {
                            gb_04.var_byte_do = (byte)0;
                        }
                    }
                    ++n;
                }
            }
            case 3: {
                int n = 0;
                while (!(n >= this.cfr_renamed_3)) {
                    gb_0 gb_05 = (gb_0)this.var_java_util_Vector_do.elementAt(n);
                    if (ft.cfr_renamed_3(((bm)gb_05).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3) && ft.cfr_renamed_1(((bm)gb_05).cfr_renamed_2 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa) && ft.cfr_renamed_3(((bm)gb_05).cfr_renamed_3 * dF.cfr_renamed_12 / 10, fm.fm_do().cfr_renamed_2)) {
                        var_cu_0_do.cfr_renamed_0(2 - gb_05.cfr_renamed_6, ((bm)gb_05).cfr_renamed_2 * dF.cfr_renamed_12 / 10, ((bm)gb_05).cfr_renamed_3 * dF.cfr_renamed_12 / 10, 0, (Graphics)object);
                    }
                    ++n;
                }
                return;
            }
        }
    }

        private static int (long l < long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        /*
     * Unable to fully structure code
     */
    public ft(int var1_1, int var2_2) {
        block13: {
            super();
            this.var_byte_do = (byte)0;
            this.cfr_renamed_3 = 0;
            this.var_java_util_Vector_do = new Vector<E>();
            this.var_byte_do = (byte)var1_1;
            this.cfr_renamed_3 = var2_2 * 10;
            if ((dF.cfr_renamed_12 == 1)) {
                this.cfr_renamed_3 = var2_2 * 5;
            }
            this.cfr_renamed_2 = (int)(System.currentTimeMillis() / 1000L);
            switch (var1_1) {
                case 0: {
                    this.cfr_renamed_3 = GameCanvas.soLuongKhoa * GameCanvas.var_int_case / 1000 + 50;
                    if (" ".length() >= -" ".length()) break;
                    throw null;
                }
                case 1: {
                    this.cfr_renamed_3 = 30;
                    if (!(ft.var_cu_0_if == null)) break;
                    e.void_do(MenuChinhAvatar.bE);
                    ft.var_cu_0_if = cu_0.cfr_renamed_1("cobay", 16 * dF.cfr_renamed_12, 10 * dF.cfr_renamed_12);
                    e.cfr_renamed_1();
                    if ("  ".length() >= 0) break;
                    throw null;
                }
                case 3: {
                    this.cfr_renamed_3 = GameCanvas.soLuongKhoa * GameCanvas.var_int_case / 1000;
                    e.void_do(MenuChinhAvatar.bE);
                    cu_0.cfr_renamed_1("tuyet", 5 * dF.cfr_renamed_12, 5 * dF.cfr_renamed_12);
                    e.cfr_renamed_1();
                    ft.var_cu_0_do = ft.var_cu_0_if;
                }
            }
            var2_2 = 0;
            if (-" ".length() != " ".length()) ** GOTO lbl57
            throw null;
lbl-1000:
            // 1 sources

            {
                var3_3 = new gb_0(0, (fm.fm_do().cfr_renamed_2 - (GameCanvas.var_int_case << 1) + hg.int_new(GameCanvas.var_int_case << 1)) * 10);
                new gb_0(0, (fm.fm_do().cfr_renamed_2 - (GameCanvas.var_int_case << 1) + hg.int_new(GameCanvas.var_int_case << 1)) * 10).cfr_renamed_2 = (-GameCanvas.soLuongKhoa / 2 + hg.int_new(fh.var_short_if * fh.var_int_int + GameCanvas.soLuongKhoa)) * 10;
                if (!(var1_1 != 3) || (this.var_byte_do == 2)) {
                    var3_3.cfr_renamed_6 = hg.int_new(3);
                    if (-"   ".length() >= 0) {
                        throw null;
                    }
                } else {
                    var3_3.cfr_renamed_6 = hg.int_new(4);
                }
                var3_3.cfr_renamed_8 = 16 + (hg.int_new(3) << 2);
                var3_3.cfr_renamed_5 = hg.int_if(-1, 1);
                var3_3.soLuong = hg.int_new(var3_3.cfr_renamed_8);
                var3_3.var_byte_do = (byte)hg.int_new(20);
                this.var_java_util_Vector_do.addElement(var3_3);
                ++var2_2;
lbl57:
                // 2 sources

                ** while (!ft.cfr_renamed_0((int)var2_2, (int)this.cfr_renamed_3))
            }
lbl58:
            // 1 sources

            if (!(var1_1 == 2)) break block13;
            var2_2 = 0;
            if ((29 + 59 - -5 + 39 ^ 78 + 43 - 99 + 106) == (89 ^ 39 ^ (200 ^ 178))) ** GOTO lbl78
            throw null;
lbl-1000:
            // 1 sources

            {
                var3_3 = (gb_0)this.var_java_util_Vector_do.elementAt(var2_2);
                var1_1 = var2_2 + 1;
                if (null == null) ** GOTO lbl76
                throw null;
lbl-1000:
                // 1 sources

                {
                    var4_4 = (gb_0)this.var_java_util_Vector_do.elementAt(var1_1);
                    if ((var3_3.cfr_renamed_6 > var4_4.cfr_renamed_6)) {
                        this.var_java_util_Vector_do.setElementAt(var3_3, var1_1);
                        this.var_java_util_Vector_do.setElementAt(var4_4, var2_2);
                        var3_3 = var4_4;
                    }
                    ++var1_1;
lbl76:
                    // 2 sources

                    ** while (!ft.cfr_renamed_0((int)var1_1, (int)this.var_java_util_Vector_do.size()))
                }
lbl77:
                // 1 sources

                ++var2_2;
lbl78:
                // 2 sources

                ** while (!ft.cfr_renamed_0((int)var2_2, (int)(this.var_java_util_Vector_do.size() - 1)))
            }
        }
    }

            static {
        ft.cfr_renamed_3();
        var_int_if = 5;
        cfr_renamed_5 = hg.int_if(1, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_1() {
        int n = 1;
        if ((GameCanvas.var_int_goto % 6 == 3)) {
            n = hg.int_new(15);
        }
        if ((n == 0) && (var_int_if == 5)) {
            var_int_if = 5 + hg.int_new(20);
            cfr_renamed_4 = 50 + hg.int_new(100);
        }
        if ((cfr_renamed_4 > 0)) {
            cfr_renamed_4 -= 1;
        }
        if ((cfr_renamed_4 == 0) && (var_int_if > 5) && (GameCanvas.var_int_goto % 4 == 2)) {
            var_int_if -= 1;
        }
        switch (this.var_byte_do) {
            case 0: {
                ft ft2 = this;
                int n2 = 0;
                while (true) {
                    int n3;
                    if ((n2 >= ft2.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_02 = (gb_0)ft2.var_java_util_Vector_do.elementAt(n2);
                    ((bm)gb_02).cfr_renamed_3 += (gb_02.cfr_renamed_6 + 1) * 15 + (3 - gb_02.cfr_renamed_6) * 3;
                    gb_02.cfr_renamed_13 += 1;
                    ((bm)gb_02).cfr_renamed_2 += gb_02.cfr_renamed_6 + 1 << 2;
                    if (ft.cfr_renamed_3(((bm)gb_02).cfr_renamed_3 / 10, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case - (4 - gb_02.cfr_renamed_6) * 50)) {
                        ft2.cfr_renamed_1(gb_02);
                    }
                    if (ft.cfr_renamed_1(((bm)gb_02).cfr_renamed_2 / 10 + (n3 = fm.fm_do().cfr_renamed_3 * ((2 - gb_02.cfr_renamed_6) * 20) / 120), fm.fm_do().cfr_renamed_3 - 10)) {
                        ((bm)gb_02).cfr_renamed_2 += (GameCanvas.soLuongKhoa + 20) * 10;
                    }
                    if (ft.cfr_renamed_3(((bm)gb_02).cfr_renamed_2 / 10 + n3, fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa + 10)) {
                        ((bm)gb_02).cfr_renamed_2 -= (GameCanvas.soLuongKhoa + 20) * 10;
                    }
                    ++n2;
                }
            }
            case 1: {
                ft ft3 = this;
                int n4 = 0;
                while (true) {
                    if ((n4 >= ft3.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_03 = (gb_0)ft3.var_java_util_Vector_do.elementAt(n4);
                    ((bm)gb_03).cfr_renamed_3 += 10;
                    ((bm)gb_03).cfr_renamed_2 += gb_03.cfr_renamed_5 * 10 + var_int_if * cfr_renamed_5;
                    gb_03.soLuong += 1;
                    if ((gb_03.soLuong >= gb_03.cfr_renamed_8)) {
                        gb_03.soLuong = 0;
                    }
                    if (ft.cfr_renamed_3(((bm)gb_03).cfr_renamed_3 / 10, fh.var_short_do * fh.var_int_int - (4 - gb_03.cfr_renamed_6) * 20)) {
                        ft3.cfr_renamed_1(gb_03);
                    }
                    ++n4;
                }
            }
            case 2: {
                int n5;
                ft ft4 = this;
                if (ft.cfr_renamed_2(ft.cfr_renamed_1(System.currentTimeMillis() / 1000L - (long)ft4.cfr_renamed_2, (long)ft4.soLuong))) {
                    ft4.soLuong += 1;
                    n5 = 0;
                    if (" ".length() >= "   ".length()) {
                        return;
                    }
                    while (!(n5 >= 5)) {
                        ft4.var_java_util_Vector_do.removeElementAt(0);
                        ft4.cfr_renamed_3 = ft4.var_java_util_Vector_do.size();
                        if ((ft4.cfr_renamed_3 == 0)) {
                            super.cfr_renamed_0();
                            return;
                        }
                        ++n5;
                    }
                }
                n5 = 0;
                if (-"  ".length() >= 0) {
                    return;
                }
                while (true) {
                    if ((n5 >= ft4.cfr_renamed_3)) {
                        return;
                    }
                    gb_0 gb_04 = (gb_0)ft4.var_java_util_Vector_do.elementAt(n5);
                    ((bm)gb_04).cfr_renamed_3 += (gb_04.cfr_renamed_6 + 2) * 5;
                    ((bm)gb_04).cfr_renamed_2 += (gb_04.cfr_renamed_6 + 1 << 1) + var_int_if * cfr_renamed_5;
                    if (ft.cfr_renamed_3(((bm)gb_04).cfr_renamed_3 / 10, fh.var_short_do * fh.var_int_int - (4 - gb_04.cfr_renamed_6) * 20)) {
                        ft4.cfr_renamed_1(gb_04);
                    }
                    ++n5;
                }
            }
            case 3: {
                ft ft5 = this;
                int n6 = 0;
                if (" ".length() >= "   ".length()) {
                    return;
                }
                while (!(n6 >= ft5.cfr_renamed_3)) {
                    gb_0 gb_05 = (gb_0)ft5.var_java_util_Vector_do.elementAt(n6);
                    ((bm)gb_05).cfr_renamed_3 += (gb_05.cfr_renamed_6 + 4) * 3;
                    ((bm)gb_05).cfr_renamed_2 += (gb_05.cfr_renamed_6 + 1 << 1) + var_int_if * cfr_renamed_5;
                    if (ft.cfr_renamed_3(((bm)gb_05).cfr_renamed_3 / 10, fh.var_short_do * fh.var_int_int - (4 - gb_05.cfr_renamed_6) * 20)) {
                        ft5.cfr_renamed_1(gb_05);
                    }
                    ++n6;
                }
                return;
            }
        }
    }

    private static void cfr_renamed_3() {
        mangSoNguyen = new int[18];
        5 = 0xA1 ^ 0xA4;
        1 = " ".length();
        -1 = -" ".length();
        0 = (0x72 ^ 0x7D ^ (0x3B ^ 0x17)) & (144 + 43 - 72 + 66 ^ 17 + 0 - -71 + 62 ^ -" ".length());
        10 = 0x5E ^ 0x54;
        1000 = 0xFFFFA7FA & 0x5BED;
        50 = 0x1C ^ 0x2E;
        30 = 0xB ^ 0x15;
        16 = 0x53 ^ 0x43;
        2 = "  ".length();
        3 = "   ".length();
        4 = 0xC4 ^ 0xB7 ^ (0xCF ^ 0xB8);
        20 = 0xAC ^ 0xB8;
        14540253 = -(0xFFFFE0CF & 0x3F33) & (0xFFFFFFFF & 0xDDFDDF);
        120 = 0x46 ^ 0x3E;
        6 = 0x4E ^ 0x48;
        15 = 0x64 ^ 0x46 ^ (0x80 ^ 0xAD);
        100 = 31 + 33 - -35 + 66 ^ 65 + 79 - 30 + 79;
    }

            private void (gb_0 gb_02 == 0) {
        if ((this.dangChayAuto ? 1 : 0 == null)) {
            this.var_java_util_Vector_do.removeElement(gb_02);
            this.cfr_renamed_3 = this.var_java_util_Vector_do.size();
            if ((this.var_java_util_Vector_do.size() == 0)) {
                super.cfr_renamed_0();
                return;
            }
        } else {
            ((bm)gb_02).cfr_renamed_3 = (fm.fm_do().cfr_renamed_2 - GameCanvas.var_int_char + hg.int_new(GameCanvas.var_int_case << 1)) * 10;
            ((bm)gb_02).cfr_renamed_2 = (-GameCanvas.soLuongKhoa / 2 + hg.int_new(fh.var_short_if * fh.var_int_int + GameCanvas.soLuongKhoa)) * 10;
        }
    }

    }

