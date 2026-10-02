/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Desktop;
import java.net.URI;
import main.AngelChip;

/*
 * Renamed from aZ
 */
public final class az_0 {
    private final String chuoiGiaTri;
    private static final int[] mangSoNguyen;

    private static void cfr_renamed_1() {
        mangSoNguyen = new int[1];
        0 = (0x10 ^ 0xA ^ (0x81 ^ 0x8E)) & (0xFE ^ 0xC0 ^ (0x52 ^ 0x79) ^ -" ".length());
    }

        public final void cfr_renamed_0() {
        try {
            Class.forName("java.awt.Desktop");
            Class.forName("java.net.URI");
            }
        catch (ClassNotFoundException classNotFoundException) {
            AngelChip.cfr_renamed_0(this.chuoiGiaTri);
            return;
        }
        if (" ".length() == 0) {
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
        AngelChip.cfr_renamed_0(this.chuoiGiaTri);
    }

    public az_0(String string) {
        this.chuoiGiaTri = string;
    }

    static {
        az_0.cfr_renamed_1();
    }
}

