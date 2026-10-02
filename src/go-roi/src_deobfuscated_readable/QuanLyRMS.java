package mod.avatar;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 * QuanLyRMS (Gỡ rối từ lớp gốc: el.java)
 * 
 * QUẢN LÝ LƯU TRỮ DỮ LIỆU CỤC BỘ (RMS - RECORD MANAGEMENT SYSTEM)
 * -------------------------------------------------------------------
 * Đọc, ghi và xóa dữ liệu cài đặt của Mod vào bộ nhớ của điện thoại J2ME:
 * - "FarmSettings": Cấu hình Auto Farm
 * - "DiamondSettings": Cấu hình Auto Kim Cương
 * - "_modspeed": Tốc độ game (game speed)
 * - "AutoLogin": Thông tin đăng nhập đã lưu
 */
public final class QuanLyRMS {

    /**
     * Ghi mảng byte dữ liệu vào RecordStore chỉ định
     * 
     * @param recordName Tên bản ghi RMS (VD: "FarmSettings", "DiamondSettings")
     * @param data Dữ liệu byte nhị phân cần lưu
     */
    public static void luuDuLieu(String recordName, byte[] data) {
        RecordStore rs = null;
        try {
            rs = RecordStore.openRecordStore(recordName, true);
            if (rs.getNumRecords() > 0) {
                rs.setRecord(1, data, 0, data.length);
            } else {
                rs.addRecord(data, 0, data.length);
            }
        } catch (RecordStoreException e) {
            System.err.println("[RMS Ghi Lỗi]: " + recordName + " -> " + e.getMessage());
        } finally {
            if (rs != null) {
                try {
                    rs.closeRecordStore();
                } catch (RecordStoreException ignored) {}
            }
        }
    }

    /**
     * Đọc mảng byte dữ liệu từ RecordStore
     * 
     * @param recordName Tên bản ghi RMS cần đọc
     * @return byte[] Mảng dữ liệu đã lưu, hoặc null nếu không tồn tại
     */
    public static byte[] docDuLieu(String recordName) {
        RecordStore rs = null;
        try {
            rs = RecordStore.openRecordStore(recordName, false);
            if (rs != null && rs.getNumRecords() > 0) {
                return rs.getRecord(1);
            }
        } catch (RecordStoreException e) {
            // Không tìm thấy bản ghi hoặc lỗi đọc
        } finally {
            if (rs != null) {
                try {
                    rs.closeRecordStore();
                } catch (RecordStoreException ignored) {}
            }
        }
        return null;
    }

    /**
     * Lưu một số nguyên vào RMS dưới dạng chuỗi đơn giản (VD: lưu tốc độ game `_modspeed`)
     */
    public static void luuSoNguyen(String key, int giaTri) {
        luuDuLieu(key, String.valueOf(giaTri).getBytes());
    }

    /**
     * Đọc một số nguyên từ RMS
     */
    public static int docSoNguyen(String key, int giaTriMacDinh) {
        byte[] b = docDuLieu(key);
        if (b != null && b.length > 0) {
            try {
                return Integer.parseInt(new String(b));
            } catch (NumberFormatException ignored) {}
        }
        return giaTriMacDinh;
    }

    /**
     * Xóa toàn bộ dữ liệu của một bản ghi RMS
     */
    public static void xoaBanGhi(String recordName) {
        try {
            RecordStore.deleteRecordStore(recordName);
        } catch (RecordStoreException ignored) {}
    }
}
