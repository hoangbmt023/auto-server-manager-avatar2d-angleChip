/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Desktop;
import java.net.URI;
import main.AngelChip;

/*
 * Renamed from bc
 */
public final class bc_0 {
    private static final int[] mangSoNguyen;
    private final String chuoiGiaTri;

    static {
        bc_0.cfr_renamed_0();
    }

        public bc_0(String string) {
        this.chuoiGiaTri = string;
    }

    public final void cfr_renamed_1() {
        try {
            Class.forName("java.awt.Desktop");
            Class.forName("java.net.URI");
            }
        catch (ClassNotFoundException classNotFoundException) {
            AngelChip.cfr_renamed_1(this.chuoiGiaTri);
            return;
        }
        if (((0x20 ^ 0x13) & ~(0x7E ^ 0x4D)) < 0) {
            return;
        }
        if ((Desktop.isDesktopSupported())) {
            try {
                Desktop.getDesktop().browse(new URI(this.chuoiGiaTri));
                System.exit(0);
                return;
            }
            catch (Exception exception) {
                }
        }
        AngelChip.cfr_renamed_1(this.chuoiGiaTri);
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        0 = (0x61 ^ 0x7C ^ (0x3C ^ 0x37)) & (136 + 16 - 112 + 139 ^ 92 + 117 - 73 + 29 ^ -" ".length());
    }
}

