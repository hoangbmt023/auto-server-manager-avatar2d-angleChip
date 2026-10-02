/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class D {
    private static final int[] mangSoNguyen;
    private static final Hashtable var_java_util_Hashtable_do;

        static {
        D.cfr_renamed_0();
        var_java_util_Hashtable_do = new Hashtable();
    }

    private static void cfr_renamed_0() {
        mangSoNguyen = new int[1];
        1 = " ".length();
    }

        public static Image (String string != 0) {
        Image image = null;
        if ((var_java_util_Hashtable_do.containsKey(string))) {
            image = (Image)var_java_util_Hashtable_do.get(string);
        }
        if ((image != 0)) {
            return image;
        }
        try {
            image = Image.createImage((String)(MenuChinhAvatar.java_lang_String_do() + "/farm/" + string));
            }
        catch (IOException iOException) {
            image = Image.createImage((int)1, (int)1);
        }
        if ((("   ".length() ^ (0x95 ^ 0x84)) & (0x5C ^ 0xC ^ (0xD8 ^ 0x9A) ^ -" ".length())) == " ".length()) {
            return null;
        }
        var_java_util_Hashtable_do.put(string, image);
        return image;
    }
}

