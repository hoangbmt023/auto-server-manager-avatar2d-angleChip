/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Renamed from eR
 */
public final class er_0
extends bb_0 {
    private int var_int_if;
    private static ep var_ep_do;
    private static int cfr_renamed_3;
    private byte var_byte_do;
    private int cfr_renamed_4;
    private static int cfr_renamed_5;
    private static int cfr_renamed_2;
    public int soLuong;
    private static ep var_ep_if;
    private Vector var_java_util_Vector_do;
    private static int[] mangSoNguyen;

    static {
        er_0.cfr_renamed_4();
        cfr_renamed_2 = 5;
        cfr_renamed_5 = gc_0.int_if(1, -1);
    }

    private static int (long l >= long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void cfr_renamed_0() {
        int n = 1;
        if ((GameCanvas.var_int_try % 6 == 3)) {
            n = gc_0.int_do(15);
        }
        if ((n == 0) && (cfr_renamed_2 == 5)) {
            cfr_renamed_2 = 5 + gc_0.int_do(20);
            cfr_renamed_3 = 50 + gc_0.int_do(100);
        }
        if ((cfr_renamed_3 == null)) {
            cfr_renamed_3 -= 1;
        }
        if ((cfr_renamed_3 == 0) && (cfr_renamed_2 > 5) && (GameCanvas.var_int_try % 4 == 2)) {
            cfr_renamed_2 -= 1;
        }
        switch (this.var_byte_do) {
            case 0: {
                er_0 er_02 = this;
                int n2 = 0;
                if (-"   ".length() > 0) {
                    return;
                }
                while (true) {
                    int n3;
                    if ((n2 >= er_02.cfr_renamed_4)) {
                        return;
                    }
                    fa fa2 = (fa)er_02.var_java_util_Vector_do.elementAt(n2);
                    fa2.var_int_if += (fa2.soLuong + 1) * 15 + (3 - fa2.soLuong) * 3;
                    fa2.var_int_new += 1;
                    ((aG)fa2).cfr_renamed_3 += fa2.soLuong + 1 << 2;
                    if (er_0.cfr_renamed_5(fa2.var_int_if / 10, ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.var_int_char - (4 - fa2.soLuong) * 50)) {
                        er_02.cfr_renamed_0(fa2);
                    }
                    if (er_0.cfr_renamed_3(((aG)fa2).cfr_renamed_3 / 10 + (n3 = ek_0.ek_0_do().soLuong * ((2 - fa2.soLuong) * 20) / 120), ek_0.ek_0_do().soLuong - 10)) {
                        ((aG)fa2).cfr_renamed_3 += (GameCanvas.var_int_byte + 20) * 10;
                    }
                    if (er_0.cfr_renamed_5(((aG)fa2).cfr_renamed_3 / 10 + n3, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte + 10)) {
                        ((aG)fa2).cfr_renamed_3 -= (GameCanvas.var_int_byte + 20) * 10;
                    }
                    ++n2;
                }
            }
            case 1: {
                er_0 er_03 = this;
                int n4 = 0;
                while (true) {
                    if ((n4 >= er_03.cfr_renamed_4)) {
                        return;
                    }
                    fa fa3 = (fa)er_03.var_java_util_Vector_do.elementAt(n4);
                    fa3.var_int_if += 10;
                    ((aG)fa3).cfr_renamed_3 += fa3.cfr_renamed_2 * 10 + cfr_renamed_2 * cfr_renamed_5;
                    fa3.cfr_renamed_8 += 1;
                    if ((fa3.cfr_renamed_8 >= fa3.cfr_renamed_11)) {
                        fa3.cfr_renamed_8 = 0;
                    }
                    if ((fa3.var_int_if / 10 > ef_0.var_short_do * ef_0.var_int_if - (4 - fa3.soLuong) * 20)) {
                        er_03.cfr_renamed_0(fa3);
                    }
                    ++n4;
                }
            }
            case 2: {
                int n5;
                er_0 er_04 = this;
                if (er_0.cfr_renamed_1(er_0.cfr_renamed_0(System.currentTimeMillis() / 1000L - (long)er_04.var_int_if, (long)er_04.soLuong))) {
                    er_04.soLuong += 1;
                    n5 = 0;
                    while (!(n5 >= 5)) {
                        er_04.var_java_util_Vector_do.removeElementAt(0);
                        er_04.cfr_renamed_4 = er_04.var_java_util_Vector_do.size();
                        if ((er_04.cfr_renamed_4 == 0)) {
                            super.cfr_renamed_3();
                            return;
                        }
                        ++n5;
                    }
                }
                n5 = 0;
                if (-" ".length() > ((2 ^ 0x3E ^ (0x7C ^ 0x73)) & (0x1A ^ 0x27 ^ (0x7D ^ 0x73) ^ -" ".length()))) {
                    return;
                }
                while (true) {
                    if ((n5 >= er_04.cfr_renamed_4)) {
                        return;
                    }
                    fa fa4 = (fa)er_04.var_java_util_Vector_do.elementAt(n5);
                    fa4.var_int_if += (fa4.soLuong + 2) * 5;
                    ((aG)fa4).cfr_renamed_3 += (fa4.soLuong + 1 << 1) + cfr_renamed_2 * cfr_renamed_5;
                    if ((fa4.var_int_if / 10 > ef_0.var_short_do * ef_0.var_int_if - (4 - fa4.soLuong) * 20)) {
                        er_04.cfr_renamed_0(fa4);
                    }
                    ++n5;
                }
            }
            case 3: {
                er_0 er_05 = this;
                int n6 = 0;
                while (!(n6 >= er_05.cfr_renamed_4)) {
                    fa fa5 = (fa)er_05.var_java_util_Vector_do.elementAt(n6);
                    fa5.var_int_if += (fa5.soLuong + 4) * 3;
                    ((aG)fa5).cfr_renamed_3 += (fa5.soLuong + 1 << 1) + cfr_renamed_2 * cfr_renamed_5;
                    if ((fa5.var_int_if / 10 > ef_0.var_short_do * ef_0.var_int_if - (4 - fa5.soLuong) * 20)) {
                        er_05.cfr_renamed_0(fa5);
                    }
                    ++n6;
                }
                return;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public er_0(int var1_1, int var2_2) {
        block13: {
            super();
            this.var_byte_do = (byte)0;
            this.cfr_renamed_4 = 0;
            this.var_java_util_Vector_do = new Vector<E>();
            this.var_byte_do = (byte)var1_1;
            this.cfr_renamed_4 = var2_2 * 10;
            if ((bn_0.cfr_renamed_6 == 1)) {
                this.cfr_renamed_4 = var2_2 * 5;
            }
            this.var_int_if = (int)(System.currentTimeMillis() / 1000L);
            switch (var1_1) {
                case 0: {
                    this.cfr_renamed_4 = GameCanvas.var_int_byte * GameCanvas.var_int_char / 1000 + 50;
                    if ("  ".length() >= 0) break;
                    throw null;
                }
                case 1: {
                    this.cfr_renamed_4 = 30;
                    if (!(er_0.var_ep_if == null)) break;
                    ap.void_do(MenuChinhAvatar.cq);
                    er_0.var_ep_if = ep.cfr_renamed_0("cobay", 16 * bn_0.cfr_renamed_6, 10 * bn_0.cfr_renamed_6);
                    ap.cfr_renamed_0();
                    if ("   ".length() > "  ".length()) break;
                    throw null;
                }
                case 3: {
                    this.cfr_renamed_4 = GameCanvas.var_int_byte * GameCanvas.var_int_char / 1000;
                    ap.void_do(MenuChinhAvatar.cq);
                    ep.cfr_renamed_0("tuyet", 5 * bn_0.cfr_renamed_6, 5 * bn_0.cfr_renamed_6);
                    ap.cfr_renamed_0();
                    er_0.var_ep_do = er_0.var_ep_if;
                }
            }
            var2_2 = 0;
            if ("  ".length() <= "  ".length()) ** GOTO lbl57
            throw null;
lbl-1000:
            // 1 sources

            {
                var3_3 = new fa(0, (ek_0.ek_0_do().cfr_renamed_3 - (GameCanvas.var_int_char << 1) + gc_0.int_do(GameCanvas.var_int_char << 1)) * 10);
                new fa(0, (ek_0.ek_0_do().cfr_renamed_3 - (GameCanvas.var_int_char << 1) + gc_0.int_do(GameCanvas.var_int_char << 1)) * 10).cfr_renamed_3 = (-GameCanvas.var_int_byte / 2 + gc_0.int_do(ef_0.var_short_if * ef_0.var_int_if + GameCanvas.var_int_byte)) * 10;
                if (!(var1_1 != 3) || (this.var_byte_do == 2)) {
                    var3_3.soLuong = gc_0.int_do(3);
                    if (-" ".length() > 0) {
                        throw null;
                    }
                } else {
                    var3_3.soLuong = gc_0.int_do(4);
                }
                var3_3.cfr_renamed_11 = 16 + (gc_0.int_do(3) << 2);
                var3_3.cfr_renamed_2 = gc_0.int_if(-1, 1);
                var3_3.cfr_renamed_8 = gc_0.int_do(var3_3.cfr_renamed_11);
                var3_3.var_byte_do = (byte)gc_0.int_do(20);
                this.var_java_util_Vector_do.addElement(var3_3);
                ++var2_2;
lbl57:
                // 2 sources

                ** while (!er_0.cfr_renamed_0((int)var2_2, (int)this.cfr_renamed_4))
            }
lbl58:
            // 1 sources

            if (!(var1_1 == 2)) break block13;
            var2_2 = 0;
            if ("  ".length() == "  ".length()) ** GOTO lbl78
            throw null;
lbl-1000:
            // 1 sources

            {
                var3_3 = (fa)this.var_java_util_Vector_do.elementAt(var2_2);
                var1_1 = var2_2 + 1;
                if ((142 + 134 - 241 + 115 ^ 103 + 62 - 25 + 7) > 0) ** GOTO lbl76
                throw null;
lbl-1000:
                // 1 sources

                {
                    var4_4 = (fa)this.var_java_util_Vector_do.elementAt(var1_1);
                    if ((var3_3.soLuong > var4_4.soLuong)) {
                        this.var_java_util_Vector_do.setElementAt(var3_3, var1_1);
                        this.var_java_util_Vector_do.setElementAt(var4_4, var2_2);
                        var3_3 = var4_4;
                    }
                    ++var1_1;
lbl76:
                    // 2 sources

                    ** while (!er_0.cfr_renamed_0((int)var1_1, (int)this.var_java_util_Vector_do.size()))
                }
lbl77:
                // 1 sources

                ++var2_2;
lbl78:
                // 2 sources

                ** while (!er_0.cfr_renamed_0((int)var2_2, (int)(this.var_java_util_Vector_do.size() - 1)))
            }
        }
    }

            public final void cfr_renamed_3() {
        super.cfr_renamed_3();
    }

                    private static void cfr_renamed_4() {
        mangSoNguyen = new int[18];
        5 = 0x4B ^ 0x4E;
        1 = " ".length();
        -1 = -" ".length();
        0 = "  ".length() & ~"  ".length();
        10 = 0x75 ^ 0x1E ^ (0x5E ^ 0x3F);
        1000 = -(0xFFFFDDDC & 0x323B) & (0xFFFFDFFF & 0x33FF);
        50 = 0x4D ^ 0x7F;
        30 = 0x11 ^ 0xF;
        16 = 0x22 ^ 0x32;
        2 = "  ".length();
        3 = "   ".length();
        4 = 0x2D ^ 0x29;
        20 = 2 ^ 0x16;
        14540253 = -(0xFFFFB27F & 0x6FA3) & (0xFFFFFFFF & 0xDDFFFF);
        120 = 0xE1 ^ 0x99;
        6 = 0x67 ^ 0x61;
        15 = 0xF ^ 0;
        100 = 0x5A ^ 0x3E;
    }

            private void (fa fa2 != 0) {
        if ((this.dangChayAuto)) {
            this.var_java_util_Vector_do.removeElement(fa2);
            this.cfr_renamed_4 = this.var_java_util_Vector_do.size();
            if ((this.var_java_util_Vector_do.size() == 0)) {
                super.cfr_renamed_3();
                return;
            }
        } else {
            fa2.var_int_if = (ek_0.ek_0_do().cfr_renamed_3 - GameCanvas.var_int_long + gc_0.int_do(GameCanvas.var_int_char << 1)) * 10;
            ((aG)fa2).cfr_renamed_3 = (-GameCanvas.var_int_byte / 2 + gc_0.int_do(ef_0.var_short_if * ef_0.var_int_if + GameCanvas.var_int_byte)) * 10;
        }
    }

            /*
     * Enabled aggressive block sorting
     */
    public final void (Graphics object != 0) {
        GameCanvas.cfr_renamed_1(object);
        object.translate(-ek_0.ek_0_do().soLuong, -ek_0.ek_0_do().cfr_renamed_3);
        switch (this.var_byte_do) {
            case 0: {
                Object object2 = object;
                er_0 er_02 = this;
                object2.setColor(14540253);
                int n = 0;
                while (true) {
                    if ((n >= er_02.cfr_renamed_4)) {
                        return;
                    }
                    fa fa2 = (fa)er_02.var_java_util_Vector_do.elementAt(n);
                    int n2 = ek_0.ek_0_do().soLuong * ((2 - fa2.soLuong) * 20) / 120;
                    object2.fillRect(n2 + ((aG)fa2).cfr_renamed_3 / 10, fa2.var_int_if / 10, 1, fa2.soLuong + 1);
                    ++n;
                }
            }
            case 1: {
                Object object3 = object;
                er_0 er_03 = this;
                int n = 0;
                while (true) {
                    if ((n >= er_03.cfr_renamed_4)) {
                        return;
                    }
                    fa fa3 = (fa)er_03.var_java_util_Vector_do.elementAt(n);
                    if (er_0.cfr_renamed_5(((aG)fa3).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong) && er_0.cfr_renamed_3(((aG)fa3).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && (fa3.var_int_if * bn_0.cfr_renamed_6 / 10 > ek_0.ek_0_do().cfr_renamed_3)) {
                        var_ep_if.cfr_renamed_0(fa3.cfr_renamed_8 / (fa3.cfr_renamed_11 / 4), ((aG)fa3).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, fa3.var_int_if * bn_0.cfr_renamed_6 / 10, 0, 3, (Graphics)object3);
                    }
                    ++n;
                }
            }
            case 2: {
                if ((this.var_short_do == -1)) {
                    return;
                }
                go_0 go_02 = ci_0.go_0_do(this.var_short_do);
                int n = 0;
                if (" ".length() == 0) {
                    return;
                }
                while (true) {
                    if ((n >= this.cfr_renamed_4)) {
                        return;
                    }
                    fa fa4 = (fa)this.var_java_util_Vector_do.elementAt(n);
                    fa4.cfr_renamed_15 += 1;
                    if (er_0.cfr_renamed_5(((aG)fa4).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong) && er_0.cfr_renamed_3(((aG)fa4).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && (fa4.var_int_if * bn_0.cfr_renamed_6 / 10 > ek_0.ek_0_do().cfr_renamed_3) && (fa4.var_int_if * bn_0.cfr_renamed_6 / 10 < ek_0.ek_0_do().cfr_renamed_3 + GameCanvas.this)) {
                        if ((go_02 != 0)) {
                            if ((fa4.cfr_renamed_15 >= go_02.var_byte_arr_do.length)) {
                                fa4.cfr_renamed_15 = 0;
                            }
                            go_02.cfr_renamed_0((Graphics)object, ((aG)fa4).cfr_renamed_3 / 10, fa4.var_int_if / 10, fa4.cfr_renamed_15);
                        }
                        fa4.var_byte_do = (byte)(fa4.var_byte_do + 1);
                        if ((fa4.var_byte_do >= 20)) {
                            fa4.var_byte_do = (byte)0;
                        }
                    }
                    ++n;
                }
            }
            case 3: {
                int n = 0;
                if ("  ".length() <= 0) {
                    return;
                }
                while (!(n >= this.cfr_renamed_4)) {
                    fa fa5 = (fa)this.var_java_util_Vector_do.elementAt(n);
                    if (er_0.cfr_renamed_5(((aG)fa5).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong) && er_0.cfr_renamed_3(((aG)fa5).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, ek_0.ek_0_do().soLuong + GameCanvas.var_int_byte) && (fa5.var_int_if * bn_0.cfr_renamed_6 / 10 > ek_0.ek_0_do().cfr_renamed_3)) {
                        var_ep_do.cfr_renamed_0(2 - fa5.soLuong, ((aG)fa5).cfr_renamed_3 * bn_0.cfr_renamed_6 / 10, fa5.var_int_if * bn_0.cfr_renamed_6 / 10, 0, (Graphics)object);
                    }
                    ++n;
                }
                return;
            }
        }
    }
}

