/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.AngelChip;

/*
 * Renamed from eU
 */
public final class eu_0
extends en
implements gl {
    private int soLuong;
    private byte var_byte_int;
    private byte var_byte_char;
    private boolean coTrangThai;
    private short var_short_if;
    private int var_int_if;
    private int soLuongKhoa;
    private int var_int_int;
    private cu_0 var_cu_0_do;
    private int cfr_renamed_4;
    private int var_int_try;
    private cU var_cU_do;
    private fl_0 var_fl_0_if;
    private int[] mangSoNguyen;
    private int var_int_byte;
    private fl_0 var_fl_0_for;
    private fl_0 var_fl_0_byte;
    public static Image var_javax_microedition_lcdui_Image_do;
    private int var_int_case;
    private int var_int_char;
    private int var_int_else;
    private fl_0 var_fl_0_case;
    private cu_0 var_cu_0_if;
    private int var_int_goto;
    private int var_int_long;
    private boolean coKichHoat;
    private boolean var_boolean_int;
    public byte var_byte_do = (byte)var_int_arr_if[0];
    private int cfr_renamed_23;
    public Vector var_java_util_Vector_do;
    private boolean var_boolean_try;
    public byte var_byte_if = (byte)var_int_arr_if[1];
    private int cfr_renamed_24;
    public eb[] var_eb_arr_do;
    private long var_long_if;
    public static Image[] var_javax_microedition_lcdui_Image_arr_do;
    private int cfr_renamed_22;
    public fl_0 var_fl_0_do;
    private int cfr_renamed_17;
    private int cfr_renamed_29;
    public boolean dangChayAuto;
    private cu_0 var_cu_0_for;
    private String chuoiGiaTri;
    private long var_long_for;
    private byte var_byte_else;
    private int cfr_renamed_26;
    private static int[] var_int_arr_if;
    public static eu_0 var_eu_0_do;
    private byte var_byte_goto;
    public byte var_byte_for;
    public static Image var_javax_microedition_lcdui_Image_if;
    public short var_short_do;
    public static byte[][] var_byte_arr_arr_do;
    private cu_0 var_cu_0_int;
    private int cfr_renamed_27;
    private int cfr_renamed_25;
    public a_0 var_a_0_do;
    private byte var_byte_long;
    private boolean var_boolean_byte = var_int_arr_if[0];
    private short var_short_for;
    private byte this;
    private short var_short_int;
    private fl_0 var_fl_0_char;
    public long soXu;
    public static Image[] var_javax_microedition_lcdui_Image_arr_if;
    private long var_long_int;
    private int cfr_renamed_28;

    /*
     * Unable to fully structure code
     */
    public final void (eb[] var1_1, short var2_3, boolean var3_4, boolean var4_5 != null) {
        block19: {
            block20: {
                block18: {
                    block15: {
                        block17: {
                            block16: {
                                block14: {
                                    this.coTrangThai = eu_0.var_int_arr_if[0];
                                    this.var_byte_if = (byte)eu_0.var_int_arr_if[1];
                                    this.cfr_renamed_17 = eu_0.var_int_arr_if[2];
                                    GameCanvas.var_dj_0_do = null;
                                    GameCanvas.var_ez_do = null;
                                    this.var_boolean_byte = eu_0.var_int_arr_if[0];
                                    if (!(eu_0.var_javax_microedition_lcdui_Image_do == null)) break block14;
                                    try {
                                        this.var_cu_0_do = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/popup/tile1.png")), eu_0.var_int_arr_if[31] * dF.cfr_renamed_12, eu_0.var_int_arr_if[31] * dF.cfr_renamed_12);
                                        this.var_cu_0_if = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/popup/bt1.png")), eu_0.var_int_arr_if[32] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12);
                                        this.var_cu_0_for = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/popup/bt0.png")), eu_0.var_int_arr_if[33] * dF.cfr_renamed_12, eu_0.var_int_arr_if[34] * dF.cfr_renamed_12);
                                        this.var_cu_0_int = new cu_0(Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/popup/time.png")), eu_0.var_int_arr_if[35] * dF.cfr_renamed_12, eu_0.var_int_arr_if[35] * dF.cfr_renamed_12);
                                        eu_0.var_javax_microedition_lcdui_Image_do = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/28.png"));
                                        eu_0.var_javax_microedition_lcdui_Image_if = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/29.png"));
                                        eu_0.var_javax_microedition_lcdui_Image_arr_do = new Image[eu_0.var_int_arr_if[12]];
                                        var5_6 = eu_0.var_int_arr_if[0];
                                        if (((117 ^ 109) & ~(146 ^ 138)) == 0) ** GOTO lbl23
                                        return;
lbl-1000:
                                        // 1 sources

                                        {
                                            eu_0.var_javax_microedition_lcdui_Image_arr_do[var5_6] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/bui/d0" + var5_6 + ".png"));
                                            ++var5_6;
lbl23:
                                            // 2 sources

                                            ** while (!eu_0.cfr_renamed_4((int)var5_6, (int)eu_0.var_int_arr_if[12]))
                                        }
lbl24:
                                        // 1 sources

                                        eu_0.var_javax_microedition_lcdui_Image_arr_if = new Image[eu_0.var_int_arr_if[8]];
                                        var5_6 = eu_0.var_int_arr_if[0];
                                        if (((80 ^ 51) & ~(235 ^ 136)) == 0) ** GOTO lbl32
                                        return;
lbl-1000:
                                        // 1 sources

                                        {
                                            eu_0.var_javax_microedition_lcdui_Image_arr_if[var5_6] = Image.createImage((String)(String.valueOf(MenuChinhAvatar.java_lang_String_for()) + "/race/bui/w" + var5_6 + ".png"));
                                            ++var5_6;
lbl32:
                                            // 2 sources

                                            ** while (!eu_0.cfr_renamed_4((int)var5_6, (int)eu_0.var_int_arr_if[8]))
                                        }
lbl33:
                                        // 1 sources

                                        }
                                    catch (Exception v0) {
                                        v0.printStackTrace();
                                    }
                                    if (-" ".length() == " ".length()) {
                                        return;
                                    }
                                }
                                if (!eu_0.cfr_renamed_5((int)var3_4)) break block15;
                                if (!eu_0.boolean_for((int)var4_5)) break block16;
                                var5_6 = eu_0.var_int_arr_if[0];
                                if (((8 ^ 14) & ~(55 ^ 49)) != "  ".length()) ** GOTO lbl52
                                return;
lbl-1000:
                                // 1 sources

                                {
                                    var6_10 = (bm)fh.var_java_util_Vector_case.elementAt(var5_6);
                                    if (eu_0.boolean_if(var6_10.var_byte_if, eu_0.var_int_arr_if[21])) {
                                        fh.cfr_renamed_1(var6_10);
                                    }
                                    ++var5_6;
lbl52:
                                    // 2 sources

                                    ** while (!eu_0.cfr_renamed_4((int)var5_6, (int)fh.var_java_util_Vector_case.size()))
                                }
                            }
                            if ((eu_0.var_eu_0_do != GameCanvas.var_en_do)) {
                                fh.cfr_renamed_1(fh.var_java_util_Vector_case);
                                eu_0.cfr_renamed_1().cfr_renamed_4();
                                fh.var_int_byte = eu_0.var_int_arr_if[2];
                                this.void_do(eu_0.var_int_arr_if[1]);
                                this.void_do(eu_0.var_int_arr_if[6]);
                                GameCanvas.var_fh_do.void_do(eu_0.var_int_arr_if[36]);
                                fh.cfr_renamed_2(AngelChip.duLieuNguoiChoi);
                                var5_7 = eu_0.cfr_renamed_1();
                                fm.fm_do().void_do(fh.var_int_char);
                                var5_7.cfr_renamed_27 = (GameCanvas.soLuongKhoa - var5_7.var_int_byte) / eu_0.var_int_arr_if[6];
                                var5_7.cfr_renamed_23 = (GameCanvas.var_int_case - var5_7.cfr_renamed_28) / eu_0.var_int_arr_if[6];
                                var5_7.var_byte_else = (byte)(eu_0.var_int_arr_if[37] * dF.cfr_renamed_12);
                                if (eu_0.boolean_do(GameCanvas.gameCanvas.getHeight(), eu_0.var_int_arr_if[24])) {
                                    var5_7.var_byte_else = (byte)eu_0.var_int_arr_if[38];
                                    var5_7.cfr_renamed_28 = eu_0.var_int_arr_if[39];
                                    var5_7.var_int_case = var5_7.cfr_renamed_22 = eu_0.var_int_arr_if[40];
                                }
                                fm.dangChayAuto = eu_0.var_int_arr_if[0];
                            }
                            this.var_eb_arr_do = null;
                            this.var_eb_arr_do = var1_1;
                            if (!(var1_1 != null)) break block17;
                            var5_8 = eu_0.var_int_arr_if[0];
                            if ((149 ^ 185 ^ (119 ^ 95)) > 0) ** GOTO lbl87
                            return;
lbl-1000:
                            // 1 sources

                            {
                                this.var_eb_arr_do[var5_8].cfr_renamed_2 = eu_0.var_int_arr_if[31];
                                this.var_eb_arr_do[var5_8].cfr_renamed_3 = eu_0.var_int_arr_if[41] + var5_8 * eu_0.var_int_arr_if[20];
                                fh.var_java_util_Vector_case.addElement(this.var_eb_arr_do[var5_8]);
                                ++var5_8;
lbl87:
                                // 2 sources

                                ** while (!eu_0.cfr_renamed_4((int)var5_8, (int)eu_0.var_int_arr_if[14]))
                            }
lbl88:
                            // 1 sources

                            fm.fm_do().duLieuNguoiChoi = this.var_eb_arr_do[eu_0.var_int_arr_if[6]];
                            this.var_byte_for = (byte)eu_0.var_int_arr_if[8];
                        }
                        AngelChip.duLieuNguoiChoi.cfr_renamed_2 = AngelChip.duLieuNguoiChoi.cfr_renamed_8 = eu_0.var_int_arr_if[0];
                    }
                    AngelChip.duLieuNguoiChoi.cfr_renamed_3 = AngelChip.duLieuNguoiChoi.var_int_try = eu_0.var_int_arr_if[42] * dF.cfr_renamed_12;
                    this.dangChayAuto = var3_4;
                    this.coKichHoat = var4_5;
                    this.var_short_int = var2_3;
                    this.var_long_int = System.currentTimeMillis();
                    if (!eu_0.boolean_for((int)var3_4)) break block18;
                    this.var_byte_do = (byte)eu_0.var_int_arr_if[43];
                    this.cfr_renamed_3 = null;
                    this.var_fl_0_new = this.var_fl_0_char;
                    this.var_fl_0_try = this.var_fl_0_case;
                    if (((168 ^ 166) & ~(47 ^ 33)) > 0) {
                        return;
                    }
                    break block19;
                }
                this.var_fl_0_try = this.var_fl_0_case;
                this.var_fl_0_new = null;
                this.cfr_renamed_3 = null;
                if (!eu_0.cfr_renamed_5((int)var4_5)) break block20;
                this.var_fl_0_new = this.var_fl_0_char;
                var5_9 = eu_0.var_int_arr_if[0];
                if (((252 ^ 162) & ~(21 ^ 75)) == 0) ** GOTO lbl131
                return;
lbl-1000:
                // 1 sources

                {
                    var6_11 = eu_0.var_int_arr_if[0];
                    var1_2 = eu_0.var_int_arr_if[0];
                    if (((137 ^ 169 ^ (123 ^ 72)) & (179 ^ 136 ^ (19 ^ 59) ^ -" ".length())) == 0) ** GOTO lbl129
                    return;
lbl-1000:
                    // 1 sources

                    {
                        this.var_eb_arr_do[var5_9].cfr_renamed_2 += this.var_eb_arr_do[var5_9].var_short_arr_do[var1_2] * this.var_eb_arr_do[var5_9].var_short_arr_if[var1_2];
                        this.var_eb_arr_do[var5_9].cfr_renamed_8 = (byte)(this.var_eb_arr_do[var5_9].cfr_renamed_8 + eu_0.var_int_arr_if[1]);
                        if (!(var6_11 += this.var_eb_arr_do[var5_9].var_short_arr_if[var1_2] <  (var2_3 - eu_0.var_int_arr_if[10]) * eu_0.var_int_arr_if[31])) break;
                        ++var1_2;
lbl129:
                        // 2 sources

                        ** while (!eu_0.cfr_renamed_4((int)var1_2, (int)this.var_eb_arr_do[var5_9].var_short_arr_if.length))
                    }
lbl130:
                    // 2 sources

                    ++var5_9;
lbl131:
                    // 2 sources

                    ** while (!eu_0.cfr_renamed_4((int)var5_9, (int)eu_0.var_int_arr_if[14]))
                }
lbl132:
                // 1 sources

                if ("  ".length() < " ".length()) {
                    return;
                }
                break block19;
            }
            ft_0.ft_0_do().cfr_renamed_21(this.var_eb_arr_do[eu_0.var_int_arr_if[0]].cfr_renamed_9);
            this.cfr_renamed_3 = this.var_fl_0_byte;
        }
        this.var_cU_do = new cU();
    }

    private static boolean boolean_do(int n) {
        return n >= 0;
    }

    static {
        eu_0.cfr_renamed_3();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void (Graphics graphics, int n, int n2, int n3, int n4, cu_0 cu_02, int n5 != null) {
        cu_02.cfr_renamed_0(var_int_arr_if[0], n, n2, var_int_arr_if[0], graphics);
        cu_02.cfr_renamed_0(var_int_arr_if[6], n + n3 - cu_02.soLuong, n2, var_int_arr_if[0], graphics);
        cu_02.cfr_renamed_0(var_int_arr_if[12], n, n2 + n4 - cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
        cu_02.cfr_renamed_0(var_int_arr_if[16], n + n3 - cu_02.soLuong, n2 + n4 - cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
        int n6 = var_int_arr_if[0];
        while (!eu_0.cfr_renamed_4(n6, (n3 - (cu_02.soLuong << var_int_arr_if[1])) / cu_02.soLuong)) {
            cu_02.cfr_renamed_0(var_int_arr_if[1], n + (n6 + var_int_arr_if[1]) * cu_02.soLuong, n2, var_int_arr_if[0], graphics);
            cu_02.cfr_renamed_0(var_int_arr_if[14], n + (n6 + var_int_arr_if[1]) * cu_02.soLuong, n2 + n4 - cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
            ++n6;
        }
        cu_02.cfr_renamed_0(var_int_arr_if[1], n + n3 - (cu_02.soLuong << var_int_arr_if[1]), n2, var_int_arr_if[0], graphics);
        cu_02.cfr_renamed_0(var_int_arr_if[14], n + n3 - (cu_02.soLuong << var_int_arr_if[1]), n2 + n4 - cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
        n6 = var_int_arr_if[0];
        while (!eu_0.cfr_renamed_4(n6, (n4 - (cu_02.cfr_renamed_2 << var_int_arr_if[1])) / cu_02.cfr_renamed_2)) {
            cu_02.cfr_renamed_0(var_int_arr_if[8], n, n2 + (n6 + var_int_arr_if[1]) * cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
            cu_02.cfr_renamed_0(var_int_arr_if[10], n + n3 - cu_02.soLuong, n2 + (n6 + var_int_arr_if[1]) * cu_02.cfr_renamed_2, var_int_arr_if[0], graphics);
            ++n6;
        }
        cu_02.cfr_renamed_0(var_int_arr_if[8], n, n2 + n4 - (cu_02.cfr_renamed_2 << var_int_arr_if[1]), var_int_arr_if[0], graphics);
        cu_02.cfr_renamed_0(var_int_arr_if[10], n + n3 - cu_02.soLuong, n2 + n4 - (cu_02.cfr_renamed_2 << var_int_arr_if[1]), var_int_arr_if[0], graphics);
        if ((n5 != var_int_arr_if[2])) {
            graphics.setColor(n5);
            graphics.fillRect(n + cu_02.soLuong, n2 + cu_02.cfr_renamed_2, n3 - (cu_02.soLuong << var_int_arr_if[1]), n4 - (cu_02.cfr_renamed_2 << var_int_arr_if[1]));
        }
    }

    public final void cfr_renamed_4() {
        super.cfr_renamed_4();
    }

    private static int (long l != long l2) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

        private static boolean boolean_for(int n) {
        return n != 0;
    }

    public final void void_int(int n) {
        cs_0.cfr_renamed_1().cfr_renamed_1(n, this);
        super.void_int(n);
    }

    private static int (long l, long l2 == null) {
        return l == l2 ? 0 : (l < l2 ? -1 : 1);
    }

    private static boolean boolean_do(int n, int n2) {
        return n <= n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void (String string != null) {
        Vector<dd_0> vector = new Vector<dd_0>();
        int n = fm.fm_do().var_int_if;
        if (!!(this.dangChayAuto) || !(this.coKichHoat)) {
            n += GameCanvas.soLuongKhoa / var_int_arr_if[8];
        }
        int n2 = var_int_arr_if[0];
        while (!(n2 >= fh.var_java_util_Vector_case.size())) {
            dd_0 dd_02 = (dd_0)fh.var_java_util_Vector_case.elementAt(n2);
            if (eu_0.boolean_if(dd_02.var_byte_if, var_int_arr_if[3]) && eu_0.cfr_renamed_2(((bm)dd_02).cfr_renamed_2 * dF.cfr_renamed_12, n) && eu_0.cfr_renamed_5(((bm)dd_02).cfr_renamed_2 * dF.cfr_renamed_12, n + GameCanvas.soLuongKhoa)) {
                vector.addElement(dd_02);
            }
            ++n2;
        }
        if ((vector.size() > 0)) {
            n2 = hg.int_new(vector.size());
            ((DuLieuNguoiChoi)vector.elementAt((int)n2)).var_cU_do = new cU(var_int_arr_if[45], string, var_int_arr_if[0]);
        }
    }

    public final void cfr_renamed_2(String object) {
        if (eu_0.boolean_for(((String)object).equals("") ? 1 : 0)) {
            return;
        }
        this.var_cU_do = new cU(var_int_arr_if[45], (String)object, var_int_arr_if[0]);
        this.var_cU_do.cfr_renamed_0 = GameCanvas.cfr_renamed_15;
        this.var_cU_do.soLuong = GameCanvas.var_int_case - this.var_cU_do.cfr_renamed_2 - en.cfr_renamed_10 - cs_0.cfr_renamed_1().var_ey_0_do.var_int_new;
        String string = object;
        object = ft_0.ft_0_do();
        ((bE)object).cfr_renamed_1(var_int_arr_if[3]);
        ((bE)object).cfr_renamed_1(string);
        ((bE)object).cfr_renamed_0();
    }

    public eu_0() {
        this.var_byte_goto = (byte)var_int_arr_if[0];
        this.var_short_do = (short)var_int_arr_if[0];
        this.var_java_util_Vector_do = new Vector();
        this.cfr_renamed_25 = var_int_arr_if[2];
        this.cfr_renamed_26 = var_int_arr_if[0];
        this.cfr_renamed_24 = var_int_arr_if[0];
        this.var_boolean_int = var_int_arr_if[0];
        int[] nArray = new int[var_int_arr_if[3]];
        nArray[eu_0.var_int_arr_if[0]] = var_int_arr_if[4];
        nArray[eu_0.var_int_arr_if[1]] = var_int_arr_if[5];
        nArray[eu_0.var_int_arr_if[6]] = var_int_arr_if[7];
        nArray[eu_0.var_int_arr_if[8]] = var_int_arr_if[9];
        nArray[eu_0.var_int_arr_if[10]] = var_int_arr_if[11];
        nArray[eu_0.var_int_arr_if[12]] = var_int_arr_if[13];
        nArray[eu_0.var_int_arr_if[14]] = var_int_arr_if[15];
        nArray[eu_0.var_int_arr_if[16]] = var_int_arr_if[17];
        nArray[eu_0.var_int_arr_if[18]] = var_int_arr_if[19];
        this.mangSoNguyen = nArray;
        this.var_boolean_try = var_int_arr_if[0];
        byte[][] byArrayArray = new byte[var_int_arr_if[8]][];
        var_byte_arr_arr_do = byArrayArray;
        byte[] byArray = new byte[var_int_arr_if[20]];
        byArray[eu_0.var_int_arr_if[8]] = var_int_arr_if[1];
        byArray[eu_0.var_int_arr_if[10]] = var_int_arr_if[1];
        byArray[eu_0.var_int_arr_if[12]] = var_int_arr_if[1];
        byArray[eu_0.var_int_arr_if[3]] = var_int_arr_if[1];
        byArray[eu_0.var_int_arr_if[21]] = var_int_arr_if[1];
        byArray[eu_0.var_int_arr_if[22]] = var_int_arr_if[1];
        byArrayArray[eu_0.var_int_arr_if[0]] = byArray;
        byte[] byArray2 = new byte[var_int_arr_if[20]];
        byArray2[eu_0.var_int_arr_if[0]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[1]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[6]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[8]] = var_int_arr_if[8];
        byArray2[eu_0.var_int_arr_if[10]] = var_int_arr_if[8];
        byArray2[eu_0.var_int_arr_if[12]] = var_int_arr_if[8];
        byArray2[eu_0.var_int_arr_if[14]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[16]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[18]] = var_int_arr_if[6];
        byArray2[eu_0.var_int_arr_if[3]] = var_int_arr_if[8];
        byArray2[eu_0.var_int_arr_if[21]] = var_int_arr_if[8];
        byArray2[eu_0.var_int_arr_if[22]] = var_int_arr_if[8];
        eu_0.var_byte_arr_arr_do[eu_0.var_int_arr_if[1]] = byArray2;
        byte[] byArray3 = new byte[var_int_arr_if[20]];
        byArray3[eu_0.var_int_arr_if[0]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[1]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[6]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[8]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[10]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[12]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[14]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[16]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[18]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[3]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[21]] = var_int_arr_if[10];
        byArray3[eu_0.var_int_arr_if[22]] = var_int_arr_if[10];
        eu_0.var_byte_arr_arr_do[eu_0.var_int_arr_if[6]] = byArray3;
        this.var_fl_0_char = new fl_0(MenuChinhAvatar.cfr_renamed_43, var_int_arr_if[8], this);
        this.var_fl_0_byte = new fl_0(MenuChinhAvatar.aF, var_int_arr_if[1], this);
        this.var_fl_0_case = new fl_0(MenuChinhAvatar.bR, var_int_arr_if[16], this);
        this.var_fl_0_for = new fl_0(MenuChinhAvatar.ct, var_int_arr_if[14], this);
        this.var_fl_0_if = new fl_0(MenuChinhAvatar.by, var_int_arr_if[18], this);
        this.var_fl_0_do = new fl_0(MenuChinhAvatar.cfr_renamed_34, var_int_arr_if[6], this);
        this.var_int_byte = var_int_arr_if[23] * dF.cfr_renamed_12;
        this.cfr_renamed_28 = var_int_arr_if[24] * dF.cfr_renamed_12;
        this.var_int_if = var_int_arr_if[18] * dF.cfr_renamed_12;
        this.cfr_renamed_29 = this.cfr_renamed_4 = var_int_arr_if[25] * dF.cfr_renamed_12;
        this.var_int_long = var_int_arr_if[26] * dF.cfr_renamed_12;
        this.var_int_case = this.cfr_renamed_22 = var_int_arr_if[27] * dF.cfr_renamed_12;
        this.soLuong = var_int_arr_if[28] * dF.cfr_renamed_12;
        this.var_int_try = this.var_int_byte - this.soLuong - var_int_arr_if[18] * dF.cfr_renamed_12;
        this.var_int_char = var_int_arr_if[29] * dF.cfr_renamed_12 + var_int_arr_if[21] * dF.cfr_renamed_12 + var_int_arr_if[21] * dF.cfr_renamed_12;
        this.var_int_goto = var_int_arr_if[30] * dF.cfr_renamed_12;
        this.var_int_else = (GameCanvas.soLuongKhoa - this.var_int_char) / var_int_arr_if[6];
        this.var_int_int = (GameCanvas.var_int_case - this.var_int_goto) / var_int_arr_if[6];
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_7() {
        block30: {
            block28: {
                block29: {
                    if (eu_0.boolean_do(this.var_byte_int)) {
                        this.var_byte_int = (byte)(this.var_byte_int - eu_0.var_int_arr_if[1]);
                        if ((this.var_byte_int == 0)) {
                            this.cfr_renamed_2();
                        }
                    }
                    if ((!eu_0.cfr_renamed_5((int)this.dangChayAuto) || eu_0.cfr_renamed_5((int)this.coKichHoat)) && eu_0.boolean_do((System.currentTimeMillis() - this.soXu != 1000L))) {
                        this.soXu = System.currentTimeMillis();
                        this.var_short_do = (short)(this.var_short_do - eu_0.var_int_arr_if[1]);
                        if ((this.var_short_do == null)) {
                            this.var_short_do = (short)eu_0.var_int_arr_if[0];
                        }
                    }
                    AngelChip.duLieuNguoiChoi.void_do(fm.fm_do().cfr_renamed_3 + GameCanvas.cfr_renamed_15, fm.fm_do().cfr_renamed_2 + GameCanvas.var_int_case - eu_0.var_int_arr_if[44] * dF.cfr_renamed_12);
                    if (eu_0.boolean_do((System.currentTimeMillis() - this.var_long_int != 1000L))) {
                        this.var_long_int = System.currentTimeMillis();
                        this.var_short_int = (short)(this.var_short_int - eu_0.var_int_arr_if[1]);
                        if ((this.var_short_int == null)) {
                            this.var_short_int = (short)eu_0.var_int_arr_if[0];
                            } else {
                            this.soLuongKhoa += eu_0.var_int_arr_if[1];
                            if (eu_0.boolean_for((int)this.coKichHoat) && eu_0.cfr_renamed_5((int)this.dangChayAuto) && (this.soLuongKhoa > 0)) {
                                this.soLuongKhoa = eu_0.var_int_arr_if[0];
                                if (eu_0.boolean_do(this.cfr_renamed_26) && (this.var_eb_arr_do != null) && (this.cfr_renamed_26 < eu_0.var_int_arr_if[14]) && (this.var_eb_arr_do[this.cfr_renamed_26] != null) && (this.var_eb_arr_do[this.cfr_renamed_26].cfr_renamed_9 != this.cfr_renamed_17)) {
                                    this.cfr_renamed_17 = this.var_eb_arr_do[this.cfr_renamed_26].cfr_renamed_9;
                                    ft_0.ft_0_do().cfr_renamed_21(this.cfr_renamed_17);
                                }
                            }
                        }
                    }
                    if (!(this.var_eb_arr_do != null)) break block28;
                    var1_1 = eu_0.var_int_arr_if[0];
                    var2_2 = eu_0.var_int_arr_if[0];
                    if ("   ".length() > 0) ** GOTO lbl37
                    return;
lbl-1000:
                    // 1 sources

                    {
                        if ((!eu_0.cfr_renamed_5((int)this.dangChayAuto) || eu_0.cfr_renamed_5((int)this.coKichHoat)) && (this.var_eb_arr_do[var2_2].cfr_renamed_8 >= this.var_eb_arr_do[var2_2].var_short_arr_do.length)) {
                            ++var1_1;
                        }
                        ++var2_2;
lbl37:
                        // 2 sources

                        ** while (!eu_0.cfr_renamed_4((int)var2_2, (int)eu_0.var_int_arr_if[14]))
                    }
lbl38:
                    // 1 sources

                    if (!eu_0.cfr_renamed_5((int)this.coTrangThai) || !eu_0.boolean_if(var1_1, eu_0.var_int_arr_if[14])) break block29;
                    this.coTrangThai = eu_0.var_int_arr_if[1];
                    var2_2 = eu_0.var_int_arr_if[0];
                    if (((132 ^ 181) & ~(12 ^ 61)) <= ((171 ^ 158) & ~(115 ^ 70))) ** GOTO lbl47
                    return;
lbl-1000:
                    // 1 sources

                    {
                        fh.cfr_renamed_1(this.var_eb_arr_do[var2_2]);
                        ++var2_2;
lbl47:
                        // 2 sources

                        ** while (!eu_0.cfr_renamed_4((int)var2_2, (int)eu_0.var_int_arr_if[14]))
                    }
                }
                if (eu_0.boolean_for((int)this.coTrangThai) && (this.var_a_0_do != null)) {
                    this.coTrangThai = eu_0.var_int_arr_if[0];
                    GameCanvas.var_ez_do = this.var_a_0_do;
                    v0 = eu_0.var_int_arr_if[0];
                    AngelChip.duLieuNguoiChoi.mangSoNguyen[v0] = AngelChip.duLieuNguoiChoi.mangSoNguyen[v0] + this.var_a_0_do.cfr_renamed_3;
                    GameCanvas.void_do(this.var_a_0_do.cfr_renamed_3, GameCanvas.cfr_renamed_15, GameCanvas.var_int_case - eu_0.var_int_arr_if[38] * dF.cfr_renamed_12, eu_0.var_int_arr_if[2]);
                    this.var_a_0_do = null;
                }
            }
            GameCanvas.var_fh_do.cfr_renamed_2();
            if (eu_0.boolean_for((int)this.dangChayAuto) && (this.var_byte_do > 0)) {
                this.var_byte_do = (byte)(this.var_byte_do - eu_0.var_int_arr_if[1]);
            }
            if ((this.var_cU_do != null) && eu_0.boolean_for((int)this.var_cU_do.boolean_do())) {
                this.var_cU_do.var_java_lang_String_arr_do = null;
            }
            if (eu_0.cfr_renamed_5((int)this.dangChayAuto) && !eu_0.cfr_renamed_5((int)this.coKichHoat)) break block30;
            var1_1 = eu_0.var_int_arr_if[0];
            if ((160 ^ 165) > 0) ** GOTO lbl99
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = (dd_0)fh.var_java_util_Vector_case.elementAt(var1_1);
                if (eu_0.boolean_if(var2_3.var_byte_if, eu_0.var_int_arr_if[3])) {
                    var2_3 = (DuLieuNguoiChoi)var2_3;
                    if (eu_0.cfr_renamed_4(eu_0.cfr_renamed_1(System.currentTimeMillis() / 1000L - (long)var2_3.var_int_break, (long)var2_3.var_short_else))) {
                        var2_3.var_int_break = (int)(System.currentTimeMillis() / 1000L);
                        var2_3.var_short_else = (short)(hg.int_new(eu_0.var_int_arr_if[21]) + eu_0.var_int_arr_if[14]);
                        var3_4 = hg.int_new(eu_0.var_int_arr_if[14]);
                        if (eu_0.boolean_if(var3_4, eu_0.var_int_arr_if[1])) {
                            var2_3.cfr_renamed_1(eu_0.var_int_arr_if[0]);
                            if ((164 ^ 160) <= 0) {
                                return;
                            }
                        } else if (eu_0.boolean_if(var3_4, eu_0.var_int_arr_if[8])) {
                            var2_3.cfr_renamed_1(eu_0.var_int_arr_if[0]);
                            var2_3.cfr_renamed_8();
                            if (-"   ".length() >= 0) {
                                return;
                            }
                        } else if (eu_0.boolean_if(var3_4, eu_0.var_int_arr_if[6])) {
                            var2_3.cfr_renamed_1(eu_0.var_int_arr_if[16]);
                            } else {
                            var2_3.cfr_renamed_1(eu_0.var_int_arr_if[6]);
                        }
                    }
                }
                ++var1_1;
lbl99:
                // 2 sources

                ** while (!eu_0.cfr_renamed_4((int)var1_1, (int)fh.var_java_util_Vector_case.size()))
            }
        }
    }

        public final void void_for(int n) {
        block10: while (true) {
            switch (n) {
                case 0: {
                    ft_0 ft_02 = ft_0.ft_0_do();
                    ft_02.cfr_renamed_1(var_int_arr_if[18]);
                    ft_02.cfr_renamed_0();
                    GameCanvas.cfr_renamed_8();
                    return;
                }
                case 1: {
                    if (!eu_0.boolean_do(this.cfr_renamed_26)) break block10;
                    this.var_boolean_byte = var_int_arr_if[1];
                    ((dF)this).cfr_renamed_3 = this.var_fl_0_for;
                    this.var_fl_0_try = null;
                    this.var_fl_0_new = this.var_fl_0_if;
                    return;
                }
                case 2: {
                    cz cz2 = new cz();
                    if (eu_0.boolean_for(this.dangChayAuto ? 1 : 0)) {
                        GameCanvas.cfr_renamed_1(MenuChinhAvatar.cM, cz2);
                        return;
                    }
                    GameCanvas.cfr_renamed_1(MenuChinhAvatar.W, cz2);
                    return;
                }
                case 3: {
                    byte by2 = this.var_byte_for;
                    this.var_byte_for = (byte)(by2 + var_int_arr_if[1]);
                    fm.fm_do().duLieuNguoiChoi = this.var_eb_arr_do[by2];
                    if (!(this.var_byte_for >= var_int_arr_if[14])) break block10;
                    this.var_byte_for = (byte)var_int_arr_if[0];
                    return;
                }
                case 5: {
                    if (!!(this.dangChayAuto) || !(this.coKichHoat)) {
                        this.var_fl_0_try = this.var_fl_0_char;
                    }
                    this.var_fl_0_new = null;
                    return;
                }
                case 6: {
                    ft_0.ft_0_do().void_if(((dd_0)this.var_eb_arr_do[this.cfr_renamed_26]).cfr_renamed_9, this.mangSoNguyen[this.cfr_renamed_24]);
                    n = var_int_arr_if[18];
                    if (((42 + 193 - 37 + 46 ^ 153 + 34 - 175 + 155) & (0xCD ^ 0x8B ^ (0x81 ^ 0x94) ^ -" ".length())) == ((0x3A ^ 0x68 ^ (0xFB ^ 0xB6)) & (22 + 128 - 17 + 54 ^ 118 + 57 - 85 + 74 ^ -" ".length()))) continue block10;
                    return;
                }
                case 7: {
                    Vector<fl_0> vector = new Vector<fl_0>();
                    vector.addElement(new fl_0(MenuChinhAvatar.aX, var_int_arr_if[0], this));
                    vector.addElement(new fl_0(MenuChinhAvatar.cfr_renamed_34, var_int_arr_if[6], this));
                    aq.cfr_renamed_1().cfr_renamed_1(vector, var_int_arr_if[0]);
                    return;
                }
                case 8: {
                    ((dF)this).cfr_renamed_3 = this.var_fl_0_byte;
                    this.var_fl_0_try = this.var_fl_0_case;
                    this.var_fl_0_new = null;
                    this.var_boolean_byte = var_int_arr_if[0];
                }
            }
            break;
        }
    }

    private static boolean boolean_int(int n) {
        return n <= 0;
    }

    private void cfr_renamed_2() {
        if ((this.cfr_renamed_24 != var_int_arr_if[2])) {
            ft_0.ft_0_do().void_if(((dd_0)this.var_eb_arr_do[this.cfr_renamed_26]).cfr_renamed_9, this.mangSoNguyen[this.cfr_renamed_24]);
            this.cfr_renamed_24 = var_int_arr_if[2];
            this.cfr_renamed_26 = var_int_arr_if[2];
            this.var_boolean_byte = var_int_arr_if[0];
            this.void_for(var_int_arr_if[18]);
            return;
        }
        if ((this.var_byte_goto > 0)) {
            this.var_byte_goto = (byte)var_int_arr_if[0];
            this.var_boolean_byte = var_int_arr_if[0];
            this.cfr_renamed_26 = var_int_arr_if[2];
            return;
        }
        if ((this.cfr_renamed_25 != var_int_arr_if[2])) {
            ft_0.ft_0_do().cfr_renamed_21(((dd_0)this.var_eb_arr_do[this.cfr_renamed_25]).cfr_renamed_9);
            this.cfr_renamed_25 = var_int_arr_if[2];
            return;
        }
        if ((this.cfr_renamed_26 != var_int_arr_if[2])) {
            this.var_boolean_byte = var_int_arr_if[1];
            ((dF)this).cfr_renamed_3 = this.var_fl_0_for;
            this.var_fl_0_try = null;
            this.var_fl_0_new = this.var_fl_0_if;
        }
    }

        private static boolean boolean_if(int n, int n2) {
        return n == n2;
    }

        /*
     * Unable to fully structure code
     */
    private void cfr_renamed_2(Graphics var1_1) {
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.var_int_else, this.var_int_int, this.var_int_char, this.var_int_goto, v_0.var_int_arr_for[eu_0.var_int_arr_if[6]], v_0.var_int_arr_for[eu_0.var_int_arr_if[8]], eu_0.var_int_arr_if[1]);
        var1_1.translate(this.var_int_else, this.var_int_int);
        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, MenuChinhAvatar.aZ, this.var_int_char / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[21] * dF.cfr_renamed_12, eu_0.var_int_arr_if[6]);
        var2_2 = eu_0.var_int_arr_if[0];
        if (" ".length() < "   ".length()) ** GOTO lbl21
        return;
lbl-1000:
        // 1 sources

        {
            if (eu_0.boolean_if(this.cfr_renamed_24, var2_2)) {
                v0 = eu_0.var_int_arr_if[1];
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                v0 = eu_0.var_int_arr_if[0];
            }
            this.var_cu_0_for.cfr_renamed_0(v0, eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + var2_2 % eu_0.var_int_arr_if[8] * (eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + this.var_cu_0_for.soLuong), this.var_int_goto - eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 * eu_0.var_int_arr_if[8] + var2_2 / eu_0.var_int_arr_if[8] * eu_0.var_int_arr_if[46] * dF.cfr_renamed_12, eu_0.var_int_arr_if[0], var1_1);
            GameCanvas.var_fz_0_for.cfr_renamed_1(var1_1, String.valueOf(this.mangSoNguyen[var2_2]), eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + var2_2 % eu_0.var_int_arr_if[8] * (eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + this.var_cu_0_for.soLuong) + this.var_cu_0_for.soLuong / eu_0.var_int_arr_if[6], this.var_int_goto - eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 * eu_0.var_int_arr_if[8] + var2_2 / eu_0.var_int_arr_if[8] * eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 + this.var_cu_0_for.cfr_renamed_2 / eu_0.var_int_arr_if[6] - dF.cfr_renamed_7 / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[6]);
            ++var2_2;
lbl21:
            // 2 sources

            ** while (!eu_0.cfr_renamed_4((int)var2_2, (int)eu_0.var_int_arr_if[3]))
        }
lbl22:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 != null) {
        block19: {
            block18: {
                this.cfr_renamed_0(var1_1);
                GameCanvas.hienThongBaoPopup(var1_1);
                if (!eu_0.boolean_for((int)this.coKichHoat)) break block18;
                GameCanvas.var_fa_0_do.cfr_renamed_1(var1_1, this.cfr_renamed_27, this.cfr_renamed_23, this.var_int_byte, this.cfr_renamed_28, v_0.var_int_arr_for[eu_0.var_int_arr_if[6]], v_0.var_int_arr_for[eu_0.var_int_arr_if[8]], eu_0.var_int_arr_if[1]);
                var1_1.translate(this.cfr_renamed_27, this.cfr_renamed_23);
                GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, MenuChinhAvatar.aF, this.var_int_byte / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[14] * dF.cfr_renamed_12, eu_0.var_int_arr_if[6]);
                (var1_1, this.var_int_if, this.cfr_renamed_29, this.var_int_long, this.var_int_case, this.var_cu_0_do, eu_0.var_int_arr_if[2] != null);
                (var1_1, this.var_int_try, this.cfr_renamed_4, this.soLuong, this.cfr_renamed_22, dv_0.var_cu_0_do, eu_0.var_int_arr_if[50] != null);
                var2_2 = eu_0.var_int_arr_if[0];
                if ("  ".length() == "  ".length()) ** GOTO lbl43
                return;
lbl-1000:
                // 1 sources

                {
                    if (eu_0.boolean_if(this.cfr_renamed_25, var2_2)) {
                        v0 = eu_0.var_int_arr_if[1];
                        if ("   ".length() <= 0) {
                            return;
                        }
                    } else {
                        v0 = eu_0.var_int_arr_if[0];
                    }
                    this.var_cu_0_if.cfr_renamed_1(v0, this.var_int_try + eu_0.var_int_arr_if[48] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6], this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + this.var_byte_else * var2_2 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[0], eu_0.var_int_arr_if[8], var1_1);
                    aa_0.cfr_renamed_1(var1_1, this.var_eb_arr_do[var2_2].var_short_do, this.var_int_try + eu_0.var_int_arr_if[48] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6], this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + this.var_byte_else * var2_2 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[8]);
                    GameCanvas.var_fz_0_if.cfr_renamed_1(var1_1, "x" + this.var_eb_arr_do[var2_2].var_byte_do, this.var_int_try + eu_0.var_int_arr_if[48] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] + this.var_cu_0_if.soLuong / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[12] * dF.cfr_renamed_12, this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + this.var_byte_else * var2_2 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] + this.var_cu_0_if.cfr_renamed_2 / eu_0.var_int_arr_if[6] - dF.var_byte_new, eu_0.var_int_arr_if[6]);
                    if (eu_0.boolean_if(this.cfr_renamed_26, var2_2)) {
                        v1 = eu_0.var_int_arr_if[1];
                        if ((29 + 114 - -45 + 4 ^ 82 + 43 - 70 + 141) != (101 ^ 95 ^ (79 ^ 113))) {
                            return;
                        }
                    } else {
                        v1 = eu_0.var_int_arr_if[0];
                    }
                    this.var_cu_0_for.cfr_renamed_0(v1, this.var_int_try + this.soLuong - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12 - this.var_cu_0_for.soLuong, this.cfr_renamed_4 + eu_0.var_int_arr_if[16] * dF.cfr_renamed_12 + this.var_byte_else * var2_2, eu_0.var_int_arr_if[0], var1_1);
                    if ((this.var_eb_arr_do[var2_2].soLuong > 0)) {
                        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, "" + this.var_eb_arr_do[var2_2].soLuong, this.var_int_try + this.soLuong - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12 - this.var_cu_0_for.soLuong / eu_0.var_int_arr_if[6], this.cfr_renamed_4 + eu_0.var_int_arr_if[16] * dF.cfr_renamed_12 + this.var_byte_else * var2_2 + this.var_cu_0_for.cfr_renamed_2 / eu_0.var_int_arr_if[6] - dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.cfr_renamed_12 - eu_0.var_int_arr_if[1], eu_0.var_int_arr_if[6]);
                        if ("   ".length() < 0) {
                            return;
                        }
                    } else {
                        GameCanvas.var_fz_0_try.cfr_renamed_1(var1_1, MenuChinhAvatar.aF, this.var_int_try + this.soLuong - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12 - this.var_cu_0_for.soLuong / eu_0.var_int_arr_if[6], this.cfr_renamed_4 + eu_0.var_int_arr_if[16] * dF.cfr_renamed_12 + this.var_byte_else * var2_2 + this.var_cu_0_for.cfr_renamed_2 / eu_0.var_int_arr_if[6] - dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.cfr_renamed_12 - eu_0.var_int_arr_if[1], eu_0.var_int_arr_if[6]);
                    }
                    ++var2_2;
lbl43:
                    // 2 sources

                    ** while (!eu_0.cfr_renamed_4((int)var2_2, (int)eu_0.var_int_arr_if[14]))
                }
lbl44:
                // 1 sources

                if (eu_0.boolean_for((int)this.var_boolean_try) && (this.var_eb_arr_do != null)) {
                    var3_5 = var1_1;
                    var2_3 = this;
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, var2_3.chuoiGiaTri, var2_3.var_int_if + var2_3.var_int_long / eu_0.var_int_arr_if[6], var2_3.cfr_renamed_29 + eu_0.var_int_arr_if[14] * dF.cfr_renamed_12, eu_0.var_int_arr_if[6]);
                    aa_0.cfr_renamed_1(var3_5, var2_3.var_short_if, var2_3.var_int_if + var2_3.var_int_long / eu_0.var_int_arr_if[6], var2_3.cfr_renamed_29 + eu_0.var_int_arr_if[44] * dF.cfr_renamed_12, eu_0.var_int_arr_if[8]);
                    var4_7 = var2_3.cfr_renamed_29 + eu_0.var_int_arr_if[51] * dF.cfr_renamed_12;
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, MenuChinhAvatar.aL, var2_3.var_int_if + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12, var4_7, eu_0.var_int_arr_if[0]);
                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_5, var2_3.var_short_for + "%", var2_3.var_int_if + var2_3.var_int_long - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var4_7 + dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.var_byte_new / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[1]);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, MenuChinhAvatar.G, var2_3.var_int_if + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12, var4_7 += dF.var_byte_try, eu_0.var_int_arr_if[0]);
                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_5, "X" + var2_3.var_byte_char, var2_3.var_int_if + var2_3.var_int_long - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var4_7 + dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.var_byte_new / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[1]);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, MenuChinhAvatar.bX, var2_3.var_int_if + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12, var4_7 += dF.var_byte_try, eu_0.var_int_arr_if[0]);
                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_5, MenuChinhAvatar.var_java_lang_String_arr_break[var2_3.this], var2_3.var_int_if + var2_3.var_int_long - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var4_7 + dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.var_byte_new / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[1]);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, MenuChinhAvatar.aG, var2_3.var_int_if + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12, var4_7 += dF.var_byte_try, eu_0.var_int_arr_if[0]);
                    GameCanvas.var_fz_0_case.cfr_renamed_1(var3_5, MenuChinhAvatar.var_java_lang_String_arr_break[var2_3.var_byte_long], var2_3.var_int_if + var2_3.var_int_long - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var4_7 + dF.var_byte_try / eu_0.var_int_arr_if[6] - dF.var_byte_new / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[1]);
                    var2_3.var_cu_0_int.cfr_renamed_1(eu_0.var_int_arr_if[0], var2_3.var_int_if + var2_3.var_cu_0_int.soLuong / eu_0.var_int_arr_if[6] + eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var2_3.cfr_renamed_29 + var2_3.var_int_case - dF.cfr_renamed_6 - var2_3.var_cu_0_int.cfr_renamed_2 - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, eu_0.var_int_arr_if[0], eu_0.var_int_arr_if[8], var3_5);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, String.valueOf(var2_3.var_short_int), var2_3.var_int_if + eu_0.var_int_arr_if[18] * dF.cfr_renamed_12 + var2_3.var_cu_0_int.soLuong + eu_0.var_int_arr_if[6] * dF.cfr_renamed_12, var2_3.cfr_renamed_29 + var2_3.var_int_case - dF.cfr_renamed_6 - var2_3.var_cu_0_int.cfr_renamed_2 - eu_0.var_int_arr_if[18] * dF.cfr_renamed_12 - GameCanvas.var_fz_0_try.int_do() / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[0]);
                    var2_3.var_cu_0_int.cfr_renamed_1(eu_0.var_int_arr_if[1], var2_3.var_int_if + var2_3.var_cu_0_int.soLuong / eu_0.var_int_arr_if[6] + eu_0.var_int_arr_if[18] * dF.cfr_renamed_12, var2_3.cfr_renamed_29 + var2_3.var_int_case - dF.cfr_renamed_6 - dF.cfr_renamed_12, eu_0.var_int_arr_if[0], eu_0.var_int_arr_if[8], var3_5);
                    GameCanvas.var_fz_0_try.cfr_renamed_1(var3_5, String.valueOf(AngelChip.duLieuNguoiChoi.mangSoNguyen[eu_0.var_int_arr_if[0]]), var2_3.var_int_if + eu_0.var_int_arr_if[18] * dF.cfr_renamed_12 + var2_3.var_cu_0_int.soLuong + eu_0.var_int_arr_if[6] * dF.cfr_renamed_12, var2_3.cfr_renamed_29 + var2_3.var_int_case - dF.cfr_renamed_6 - dF.cfr_renamed_12 - dF.var_byte_try / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[0]);
                }
                if (eu_0.boolean_for((int)this.var_boolean_byte)) {
                    this.cfr_renamed_2(var1_1);
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                break block19;
            }
            if (eu_0.boolean_for((int)this.dangChayAuto) && (this.var_byte_do > 0)) {
                var2_4 = aa_0.cfr_renamed_0(eu_0.var_int_arr_if[52]);
                if ((var2_4.soLuong != eu_0.var_int_arr_if[2])) {
                    var3_6 = var2_4.cfr_renamed_0 / eu_0.var_int_arr_if[10];
                    var1_1.drawRegion(var2_4.var_javax_microedition_lcdui_Image_do, eu_0.var_int_arr_if[0], (eu_0.var_int_arr_if[8] - this.var_byte_do / eu_0.var_int_arr_if[20]) * var3_6, (int)var2_4.var_short_do, var3_6, eu_0.var_int_arr_if[0], GameCanvas.soLuongKhoa / eu_0.var_int_arr_if[6], GameCanvas.var_int_case / eu_0.var_int_arr_if[6], eu_0.var_int_arr_if[8]);
                }
            }
        }
        GameCanvas.hienThongBaoPopup(var1_1);
        if ((this.var_cU_do != null) && (this.var_cU_do.var_java_lang_String_arr_do != null)) {
            this.var_cU_do.cfr_renamed_1(var1_1);
        }
        if (!(GameCanvas.var_fv_do != null) || eu_0.cfr_renamed_5((int)fv.dangChayAuto)) {
            super.cfr_renamed_1(var1_1);
        }
        if ((!eu_0.cfr_renamed_5((int)this.dangChayAuto) || eu_0.cfr_renamed_5((int)this.coKichHoat)) && (GameCanvas.var_dj_0_do == null) && eu_0.boolean_for((int)this.coTrangThai)) {
            GameCanvas.var_fz_0_new.cfr_renamed_1(var1_1, String.valueOf(this.var_short_do), GameCanvas.cfr_renamed_15, eu_0.var_int_arr_if[12], eu_0.var_int_arr_if[6]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void void_do(int n) {
        Object object;
        Object object2;
        Vector<Object> vector = new Vector<Object>();
        Vector<Object> vector2 = new Vector<Object>();
        Vector<Object> vector3 = new Vector<Object>();
        Vector<Object> vector4 = new Vector<Object>();
        Vector<Object> vector5 = new Vector<Object>();
        int n2 = var_int_arr_if[0];
        while (!(n2 >= aa_0.var_am_arr_do.length)) {
            object2 = aa_0.var_am_arr_do[n2];
            if (eu_0.boolean_if(((am)object2).cfr_renamed_2, var_int_arr_if[2]) && eu_0.cfr_renamed_5(((am)object2).cfr_renamed_3, var_int_arr_if[9]) && eu_0.cfr_renamed_4(((am)object2).var_byte_do)) {
                object = (cX)object2;
                if (!eu_0.cfr_renamed_3(((cX)object).cfr_renamed_3, n) || eu_0.cfr_renamed_5(((cX)object).cfr_renamed_3)) {
                    if (eu_0.boolean_if(((am)object).var_byte_if, var_int_arr_if[21])) {
                        vector.addElement(object);
                        } else if (eu_0.boolean_if(((am)object2).var_byte_if, var_int_arr_if[31])) {
                        vector2.addElement(object);
                        if (-" ".length() > 0) {
                            return;
                        }
                    } else if (eu_0.boolean_if(((am)object2).var_byte_if, var_int_arr_if[38])) {
                        vector3.addElement(object);
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                    } else if (eu_0.boolean_if(((am)object2).var_byte_if, var_int_arr_if[44])) {
                        vector4.addElement(object);
                        } else if (eu_0.boolean_if(((am)object2).var_byte_if, var_int_arr_if[45])) {
                        vector5.addElement(object);
                    }
                }
            }
            ++n2;
        }
        n2 = var_int_arr_if[0];
        while (!(n2 >= var_int_arr_if[21])) {
            object2 = new DuLieuNguoiChoi();
            new DuLieuNguoiChoi().var_byte_do = (byte)n;
            object = new cg();
            new cg().var_short_do = ((am)vector.elementAt((int)hg.int_new((int)vector.size()))).cfr_renamed_3;
            ((DuLieuNguoiChoi)object2).cfr_renamed_0((cg)object);
            object = new cg();
            new cg().var_short_do = ((am)vector2.elementAt((int)hg.int_new((int)vector2.size()))).cfr_renamed_3;
            ((DuLieuNguoiChoi)object2).cfr_renamed_0((cg)object);
            object = new cg();
            new cg().var_short_do = ((am)vector3.elementAt((int)hg.int_new((int)vector3.size()))).cfr_renamed_3;
            ((DuLieuNguoiChoi)object2).cfr_renamed_0((cg)object);
            object = new cg();
            new cg().var_short_do = ((am)vector4.elementAt((int)hg.int_new((int)vector4.size()))).cfr_renamed_3;
            ((DuLieuNguoiChoi)object2).cfr_renamed_0((cg)object);
            object = new cg();
            new cg().var_short_do = ((am)vector5.elementAt((int)hg.int_new((int)vector5.size()))).cfr_renamed_3;
            ((DuLieuNguoiChoi)object2).cfr_renamed_0((cg)object);
            ((DuLieuNguoiChoi)object2).void_if();
            this.var_java_util_Vector_do.addElement(object2);
            ++n2;
        }
    }

    public final void (short s2, String string, short s3, byte by2, byte by3, byte by4 != null) {
        this.var_boolean_try = var_int_arr_if[1];
        this.var_short_if = s2;
        this.chuoiGiaTri = string;
        this.var_short_for = s3;
        this.var_byte_char = by2;
        this.this = by3;
        this.var_byte_long = by4;
    }

            /*
     * Unable to fully structure code
     */
    public final void (Graphics var1_1 == null) {
        GameCanvas.hienThongBaoPopup(var1_1);
        GameCanvas.var_fh_do.cfr_renamed_2(var1_1);
        var2_2 = eu_0.var_int_arr_if[0];
        if (((37 + 2 - 17 + 226 ^ 47 + 116 - 94 + 102) & (31 + 142 - 146 + 124 ^ 47 + 173 - 77 + 53 ^ -" ".length())) == 0) ** GOTO lbl31
        return;
lbl-1000:
        // 1 sources

        {
            if (eu_0.boolean_do(fm.fm_do().cfr_renamed_3, eu_0.var_int_arr_if[10] * (fh.var_int_int * dF.cfr_renamed_12))) {
                v0 = eu_0.var_int_arr_if[0];
                if ((var2_2 % eu_0.var_int_arr_if[6] == 0)) {
                    v1 = eu_0.var_int_arr_if[6];
                    if ("   ".length() < " ".length()) {
                        return;
                    }
                } else {
                    v1 = eu_0.var_int_arr_if[8];
                }
                fh.var_cu_0_do.cfr_renamed_0(v0, v1, eu_0.var_int_arr_if[8] * (fh.var_int_int * dF.cfr_renamed_12), (var2_2 + eu_0.var_int_arr_if[14]) * fh.var_int_int * dF.cfr_renamed_12, eu_0.var_int_arr_if[0], var1_1);
            }
            if (eu_0.cfr_renamed_4(fm.fm_do().cfr_renamed_3 + GameCanvas.soLuongKhoa, (fh.var_short_if - eu_0.var_int_arr_if[8]) * (fh.var_int_int * dF.cfr_renamed_12))) {
                v2 = eu_0.var_int_arr_if[0];
                if ((var2_2 % eu_0.var_int_arr_if[6] == 0)) {
                    v3 = eu_0.var_int_arr_if[6];
                    if ((7 ^ 2) == 0) {
                        return;
                    }
                } else {
                    v3 = eu_0.var_int_arr_if[8];
                }
                fh.var_cu_0_do.cfr_renamed_0(v2, v3, (fh.var_short_if - eu_0.var_int_arr_if[8]) * (fh.var_int_int * dF.cfr_renamed_12), (var2_2 + eu_0.var_int_arr_if[14]) * fh.var_int_int * dF.cfr_renamed_12, eu_0.var_int_arr_if[0], var1_1);
            }
            ++var2_2;
lbl31:
            // 2 sources

            ** while (!eu_0.cfr_renamed_4((int)var2_2, (int)eu_0.var_int_arr_if[14]))
        }
lbl32:
        // 1 sources

        GameCanvas.var_fh_do.cfr_renamed_3(var1_1);
        GameCanvas.hienThongBaoPopup(var1_1);
    }

    /*
     * Unable to fully structure code
     */
    public final void cfr_renamed_6() {
        block50: {
            block51: {
                block52: {
                    super.cfr_renamed_6();
                    ++this.var_long_for;
                    if (!(GameCanvas.var_fv_do != null) || eu_0.cfr_renamed_5((int)fv.dangChayAuto)) {
                        super.cfr_renamed_6();
                    }
                    if (eu_0.boolean_for((int)GameCanvas.boolean_do(eu_0.var_int_arr_if[6]))) {
                        if (eu_0.boolean_for((int)this.var_boolean_byte)) {
                            if ((this.cfr_renamed_24 / eu_0.var_int_arr_if[8] > 0)) {
                                this.cfr_renamed_24 -= eu_0.var_int_arr_if[8];
                                }
                        } else {
                            this.cfr_renamed_26 -= eu_0.var_int_arr_if[1];
                            if ((this.cfr_renamed_26 == null)) {
                                this.cfr_renamed_26 = eu_0.var_int_arr_if[0];
                                if (" ".length() > "  ".length()) {
                                    return;
                                }
                            }
                        }
                    } else if (eu_0.boolean_for((int)GameCanvas.boolean_do(eu_0.var_int_arr_if[18]))) {
                        if (eu_0.boolean_for((int)this.var_boolean_byte)) {
                            if ((this.cfr_renamed_24 / eu_0.var_int_arr_if[8] < eu_0.var_int_arr_if[6])) {
                                this.cfr_renamed_24 += eu_0.var_int_arr_if[8];
                                if (-"   ".length() >= 0) {
                                    return;
                                }
                            }
                        } else {
                            this.cfr_renamed_26 += eu_0.var_int_arr_if[1];
                            if ((this.cfr_renamed_26 > eu_0.var_int_arr_if[12])) {
                                this.cfr_renamed_26 = eu_0.var_int_arr_if[12];
                                if (-" ".length() > 0) {
                                    return;
                                }
                            }
                        }
                    } else if (eu_0.boolean_for((int)GameCanvas.boolean_do(eu_0.var_int_arr_if[10]))) {
                        if (eu_0.boolean_for((int)this.var_boolean_byte) && (this.cfr_renamed_24 % eu_0.var_int_arr_if[8] > 0)) {
                            this.cfr_renamed_24 -= eu_0.var_int_arr_if[1];
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                        }
                    } else if (eu_0.boolean_for((int)GameCanvas.boolean_do(eu_0.var_int_arr_if[14])) && eu_0.boolean_for((int)this.var_boolean_byte) && (this.cfr_renamed_24 % eu_0.var_int_arr_if[8] < eu_0.var_int_arr_if[6])) {
                        this.cfr_renamed_24 += eu_0.var_int_arr_if[1];
                    }
                    if (!eu_0.boolean_for((int)GameCanvas.coTrangThai) || !(this.var_eb_arr_do != null) || !eu_0.cfr_renamed_5((int)this.dangChayAuto) || !eu_0.boolean_for((int)this.coKichHoat)) break block50;
                    if (!eu_0.boolean_for((int)this.var_boolean_byte)) break block51;
                    if (!eu_0.boolean_for((int)GameCanvas.boolean_if(this.var_int_else + this.var_int_char - eu_0.var_int_arr_if[38] * dF.cfr_renamed_12, this.var_int_int, eu_0.var_int_arr_if[38] * dF.cfr_renamed_12, eu_0.var_int_arr_if[38] * dF.cfr_renamed_12))) break block52;
                    GameCanvas.coTrangThai = eu_0.var_int_arr_if[0];
                    this.var_byte_goto = (byte)eu_0.var_int_arr_if[12];
                    this.var_boolean_int = eu_0.var_int_arr_if[1];
                    this.var_long_if = this.var_long_for;
                    if ((129 ^ 133) == 0) {
                        return;
                    }
                    break block50;
                }
                var1_1 = eu_0.var_int_arr_if[0];
                if (((228 ^ 143 ^ (1 ^ 90)) & (117 ^ 76 ^ (113 ^ 120) ^ -" ".length())) != "   ".length()) ** GOTO lbl78
                return;
lbl-1000:
                // 1 sources

                {
                    if (eu_0.boolean_for((int)GameCanvas.boolean_if(this.var_int_else + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + var1_1 % eu_0.var_int_arr_if[8] * (eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + this.var_cu_0_for.soLuong), this.var_int_int + (this.var_int_goto - eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 * eu_0.var_int_arr_if[8]) + var1_1 / eu_0.var_int_arr_if[8] * eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12, eu_0.var_int_arr_if[33] * dF.cfr_renamed_12, eu_0.var_int_arr_if[47] * dF.cfr_renamed_12))) {
                        this.cfr_renamed_24 = var1_1;
                        GameCanvas.coTrangThai = eu_0.var_int_arr_if[0];
                        this.var_boolean_int = eu_0.var_int_arr_if[1];
                        this.var_long_if = this.var_long_for;
                        if (-(33 ^ 37) >= 0) {
                            return;
                        }
                        break block50;
                    }
                    ++var1_1;
lbl78:
                    // 2 sources

                    ** while (!eu_0.cfr_renamed_4((int)var1_1, (int)eu_0.var_int_arr_if[3]))
                }
lbl79:
                // 1 sources

                break block50;
            }
            var1_2 = eu_0.var_int_arr_if[0];
            if ((41 ^ 109 ^ (69 ^ 5)) >= -" ".length()) ** GOTO lbl109
            return;
lbl-1000:
            // 1 sources

            {
                if (eu_0.boolean_for((int)GameCanvas.boolean_if(this.cfr_renamed_27 + this.var_int_try + eu_0.var_int_arr_if[48] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, this.cfr_renamed_23 + this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + eu_0.var_int_arr_if[37] * dF.cfr_renamed_12 * var1_2 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12))) {
                    this.cfr_renamed_25 = var1_2;
                    this.var_boolean_int = eu_0.var_int_arr_if[1];
                    GameCanvas.coTrangThai = eu_0.var_int_arr_if[0];
                    this.var_long_if = this.var_long_for;
                    if ("   ".length() >= 0) break;
                    return;
                }
                if (eu_0.boolean_for((int)GameCanvas.boolean_if(this.cfr_renamed_27 + this.var_int_try + this.soLuong - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12 - this.var_cu_0_for.soLuong, this.cfr_renamed_23 + this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + eu_0.var_int_arr_if[37] * dF.cfr_renamed_12 * var1_2 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, eu_0.var_int_arr_if[33] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12))) {
                    this.cfr_renamed_26 = var1_2;
                    this.var_boolean_int = eu_0.var_int_arr_if[1];
                    GameCanvas.coTrangThai = eu_0.var_int_arr_if[0];
                    this.var_long_if = this.var_long_for;
                    if ("  ".length() != ((183 ^ 150 ^ (117 ^ 8)) & (5 ^ 120 ^ (42 ^ 11) ^ -" ".length()))) break;
                    return;
                }
                ++var1_2;
lbl109:
                // 2 sources

                ** while (!eu_0.cfr_renamed_4((int)var1_2, (int)eu_0.var_int_arr_if[14]))
            }
        }
        if (eu_0.boolean_for((int)this.var_boolean_int)) {
            if (eu_0.boolean_for((int)GameCanvas.var_boolean_case)) {
                if ((this.cfr_renamed_24 != eu_0.var_int_arr_if[2])) {
                    if (eu_0.cfr_renamed_5((int)GameCanvas.boolean_if(this.var_int_else + eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + this.cfr_renamed_24 % eu_0.var_int_arr_if[8] * (eu_0.var_int_arr_if[12] * dF.cfr_renamed_12 + this.var_cu_0_for.soLuong), this.var_int_int + (this.var_int_goto - eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 * eu_0.var_int_arr_if[8]) + this.cfr_renamed_24 / eu_0.var_int_arr_if[8] * eu_0.var_int_arr_if[46] * dF.cfr_renamed_12 - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12, eu_0.var_int_arr_if[33] * dF.cfr_renamed_12, eu_0.var_int_arr_if[47] * dF.cfr_renamed_12))) {
                        this.cfr_renamed_24 = eu_0.var_int_arr_if[2];
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                } else if (eu_0.boolean_for(this.var_byte_goto)) {
                    if (eu_0.cfr_renamed_5((int)GameCanvas.boolean_if(this.var_int_else + this.var_int_char - eu_0.var_int_arr_if[38] * dF.cfr_renamed_12, this.var_int_int, eu_0.var_int_arr_if[38] * dF.cfr_renamed_12, eu_0.var_int_arr_if[38] * dF.cfr_renamed_12))) {
                        this.var_byte_goto = (byte)eu_0.var_int_arr_if[0];
                        if (" ".length() > "   ".length()) {
                            return;
                        }
                    }
                } else if ((this.cfr_renamed_25 != eu_0.var_int_arr_if[2])) {
                    if (eu_0.cfr_renamed_5((int)GameCanvas.boolean_if(this.cfr_renamed_27 + this.var_int_try + eu_0.var_int_arr_if[48] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, this.cfr_renamed_23 + this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + eu_0.var_int_arr_if[37] * dF.cfr_renamed_12 * this.cfr_renamed_25 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12))) {
                        this.cfr_renamed_25 = eu_0.var_int_arr_if[2];
                        if (" ".length() > "   ".length()) {
                            return;
                        }
                    }
                } else if ((this.cfr_renamed_26 != eu_0.var_int_arr_if[2]) && eu_0.cfr_renamed_5((int)this.var_boolean_byte) && eu_0.cfr_renamed_5((int)GameCanvas.boolean_if(this.cfr_renamed_27 + this.var_int_try + this.soLuong - eu_0.var_int_arr_if[1] * dF.cfr_renamed_12 - this.var_cu_0_for.soLuong, this.cfr_renamed_23 + this.cfr_renamed_4 + eu_0.var_int_arr_if[8] * dF.cfr_renamed_12 + eu_0.var_int_arr_if[37] * dF.cfr_renamed_12 * this.cfr_renamed_26 + eu_0.var_int_arr_if[32] * dF.cfr_renamed_12 / eu_0.var_int_arr_if[6] - eu_0.var_int_arr_if[49] * dF.cfr_renamed_12, eu_0.var_int_arr_if[33] * dF.cfr_renamed_12, eu_0.var_int_arr_if[32] * dF.cfr_renamed_12))) {
                    this.cfr_renamed_26 = eu_0.var_int_arr_if[2];
                }
            }
            if (eu_0.boolean_for((int)GameCanvas.var_boolean_new)) {
                if (eu_0.boolean_int((this.var_long_for - this.var_long_if, 4L == null))) {
                    this.var_byte_int = (byte)eu_0.var_int_arr_if[12];
                    } else {
                    this.cfr_renamed_2();
                }
                this.var_boolean_int = eu_0.var_int_arr_if[0];
                GameCanvas.var_boolean_new = eu_0.var_int_arr_if[0];
            }
        }
        if (!eu_0.cfr_renamed_5((int)this.dangChayAuto) || eu_0.cfr_renamed_5((int)this.coKichHoat)) {
            GameCanvas.var_fh_do.cfr_renamed_1();
        }
    }

        public static eu_0 cfr_renamed_1() {
        if ((var_eu_0_do == null)) {
            var_eu_0_do = new eu_0();
            return var_eu_0_do;
        }
        return var_eu_0_do;
    }

        private static void cfr_renamed_3() {
        var_int_arr_if = new int[53];
        eu_0.var_int_arr_if[0] = (13 + 129 - 52 + 83 ^ 49 + 11 - 30 + 136) & (82 + 88 - 123 + 120 ^ 155 + 61 - 57 + 13 ^ -" ".length());
        eu_0.var_int_arr_if[1] = " ".length();
        eu_0.var_int_arr_if[2] = -" ".length();
        eu_0.var_int_arr_if[3] = 0xA6 ^ 0xAF;
        eu_0.var_int_arr_if[4] = 0x48 ^ 0x2C;
        eu_0.var_int_arr_if[5] = -(0xFFFFBDFB & 0x7A0F) & (0xFFFFFBFE & 0x3DFF);
        eu_0.var_int_arr_if[6] = "  ".length();
        eu_0.var_int_arr_if[7] = 0xFFFFE7F9 & 0x1BEE;
        eu_0.var_int_arr_if[8] = "   ".length();
        eu_0.var_int_arr_if[9] = -(0xFFFFE9AF & 0x567B) & (0xFFFFDFFE & 0x67FB);
        eu_0.var_int_arr_if[10] = 0xA7 ^ 0x80 ^ (0x52 ^ 0x71);
        eu_0.var_int_arr_if[11] = -(0xFFFFE5F7 & 0x7E0F) & (0xFFFFFF8F & 0x77FE);
        eu_0.var_int_arr_if[12] = 0x2D ^ 0x26 ^ (0x16 ^ 0x18);
        eu_0.var_int_arr_if[13] = -(0xFFFF9CBD & 0x7BE3) & (0xFFFFBFB7 & 0x7FF8);
        eu_0.var_int_arr_if[14] = 0xBC ^ 0x90 ^ (0x59 ^ 0x73);
        eu_0.var_int_arr_if[15] = 0xFFFFDE61 & 0x6FBE;
        eu_0.var_int_arr_if[16] = 92 + 147 - 135 + 60 ^ 34 + 129 - 89 + 89;
        eu_0.var_int_arr_if[17] = 0xFFFFF5FD & 0x7F32;
        eu_0.var_int_arr_if[18] = 0 ^ 8;
        eu_0.var_int_arr_if[19] = 0xFFFFEBFF & 0xD750;
        eu_0.var_int_arr_if[20] = 124 + 39 - 116 + 82 ^ 72 + 42 - 27 + 54;
        eu_0.var_int_arr_if[21] = 0x6A ^ 0x10 ^ (0x29 ^ 0x59);
        eu_0.var_int_arr_if[22] = 0x65 ^ 0x6E;
        eu_0.var_int_arr_if[23] = 197 + 26 - 13 + 10;
        eu_0.var_int_arr_if[24] = 165 + 114 - 185 + 146;
        eu_0.var_int_arr_if[25] = 0x7F ^ 0x68;
        eu_0.var_int_arr_if[26] = 171 + 114 - 177 + 116 ^ 87 + 27 - 38 + 61;
        eu_0.var_int_arr_if[27] = 132 + 27 - 155 + 174 + (0xDC ^ 0x8E) - (150 + 157 - 266 + 211) + (55 + 93 - -35 + 20);
        eu_0.var_int_arr_if[28] = 209 + 140 - 209 + 101 ^ 48 + 131 - 164 + 159;
        eu_0.var_int_arr_if[29] = 88 + 142 - 82 + 32;
        eu_0.var_int_arr_if[30] = 36 + 129 - -8 + 81 ^ 121 + 7 - 36 + 52;
        eu_0.var_int_arr_if[31] = 0xA6 ^ 0xB2;
        eu_0.var_int_arr_if[32] = 54 + 161 - 66 + 68 ^ 109 + 110 - 152 + 131;
        eu_0.var_int_arr_if[33] = 0x13 ^ 0x2F;
        eu_0.var_int_arr_if[34] = 0x19 ^ 1;
        eu_0.var_int_arr_if[35] = 126 + 73 - 144 + 75 ^ 25 + 29 - -42 + 44;
        eu_0.var_int_arr_if[36] = 0x17 ^ 0x7B;
        eu_0.var_int_arr_if[37] = 0x84 ^ 0xA7;
        eu_0.var_int_arr_if[38] = (0xDA ^ 0x9D) & ~(0xFA ^ 0xBD) ^ (0xB1 ^ 0xAF);
        eu_0.var_int_arr_if[39] = 69 + 100 - 80 + 58 + (0x51 ^ 4) - (0x7B ^ 0x50) + (0x83 ^ 0x99);
        eu_0.var_int_arr_if[40] = 50 + 21 - -104 + 10;
        eu_0.var_int_arr_if[41] = 19 + 85 - 4 + 119 ^ 44 + 30 - -44 + 21;
        eu_0.var_int_arr_if[42] = 0xD9 ^ 0xB9;
        eu_0.var_int_arr_if[43] = 0x1C ^ 0x11 ^ (0xB9 ^ 0x84);
        eu_0.var_int_arr_if[44] = 0x5A ^ 0x72;
        eu_0.var_int_arr_if[45] = 0x2D ^ 0x1F;
        eu_0.var_int_arr_if[46] = 0x6C ^ 0x40 ^ (0x88 ^ 0xB9);
        eu_0.var_int_arr_if[47] = 0x42 ^ 0x30 ^ (0xC6 ^ 0xAE);
        eu_0.var_int_arr_if[48] = 56 + 72 - 91 + 116 ^ 151 + 73 - 172 + 133;
        eu_0.var_int_arr_if[49] = 0x7E ^ 0x71;
        eu_0.var_int_arr_if[50] = -(0xFFFFBF3D & 0xBC7BFF);
        eu_0.var_int_arr_if[51] = 0x42 ^ 0x4B ^ (0xFB ^ 0xB4);
        eu_0.var_int_arr_if[52] = 0xFFFF8E6D & 0x75BB;
    }

        }

