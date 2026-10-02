# TÀI LIỆU GỠ RỐI TOÀN DIỆN MÃ NGUỒN MOD AVATAR UP XU (BUILD 34)

---

## 1. TỔNG QUAN VỀ DỰ ÁN
File gốc: `avatar_upxu_build34 (1).jar` (Bản mod game Avatar J2ME chuyên cày/up xu, auto nông trại, auto kim cương).

Trước khi gỡ rối, file đã bị mã hóa/làm rối bởi **Allatori Obfuscator**:
- Toàn bộ tên biến, phương thức và lớp bị đổi thành từ khóa cấm của Java (`do`, `if`, `goto`, `char`, `else`...).
- Hơn 1.200 hàm so sánh giả lập (`cfr_renamed_0`, `cfr_renamed_1`...) thay thế cho các toán tử so sánh `==`, `!=`, `>`, `<`, `>=`, `<=`.
- Mảng hằng số giả lập `var_int_arr_do[...]` lưu trữ các giá trị số và ký tự được tính toán bằng phép toán bitwise phức tạp.
- Hàng nghìn lệnh rác chèn vào luồng thực thi: `"".length();`, `if (null != null) { ... }`.
- Tất cả chuỗi tiếng Việt bị chuyển thành mã Unicode escape (`\u0111\u00e3...`).

---

## 2. KẾT QUẢ ĐÃ GỠ RỐI

### A. Thư mục mã nguồn gốc đã làm sạch (421 files Java):
📂 **`c:\Users\hoang\Downloads\t\decompiled_src\`**
- Đã chạy engine gỡ rối tự động trên toàn bộ 421 files.
- Đã giải mã toàn bộ chuỗi tiếng Việt có dấu rõ ràng.
- Đã tính toán và thay thế toàn bộ mảng hằng số `var_int_arr_do`.
- Đã xóa sạch các lệnh rác `"".length();` và các khối điều kiện chết `if (null != null)`.

### B. Thư mục mã nguồn chuẩn hóa dễ đọc (Human-Readable):
📂 **`c:\Users\hoang\Downloads\t\src_deobfuscated_readable\`**
Chứa các lớp cốt lõi nhất của Mod đã được tái cấu trúc, đổi tên biến và hàm theo đúng ngữ nghĩa tiếng Việt chuẩn, kèm docstring chi tiết:

| File đã gỡ rối | Lớp gốc tương ứng | Chức năng chính |
| :--- | :--- | :--- |
| **`AutoController.java`** | `bp_0.java` (`bP`) | Bộ điều phối Auto & xử lý toàn bộ các lệnh Chat (`fa`, `kc`, `tx`, `s<tốc độ>`...) |
| **`AutoKimCuong.java`** | `X.java` | Thuật toán giải cờ Kim Cương (Match-3), bán đá khi đầy rương, hẹn giờ về farm, lưu RMS `DiamondSettings` |
| **`FormCaiDatKimCuong.java`** | `gl_0.java` (`gL`) | Giao diện Form cài đặt Auto Kim Cương (checkbox bán đá, chọn màu ưu tiên, thời gian về farm) |
| **`AutoFarm.java`** | `ac_0.java` (`aC`) | Thuật toán Auto Nông Trại: chăm sóc 48 ô đất, bón phân, tưới nước, diệt sâu, nâng cây khế, chăm em bé, lưu RMS `FarmSettings` |
| **`FormCaiDatFarm.java`** | `cn.java` | Giao diện Form cài đặt Auto Farm (chọn loại cây trồng, cơ chế bán nông sản, tùy chọn em bé) |
| **`ThongTinNhanVat.java`** | `gO.java` | Quản lý Xu, Lượng, Lượng khóa, Tên nhân vật, Đăng nhập Server |
| **`QuanLyRMS.java`** | `el.java` | Quản lý đọc, ghi và xóa dữ liệu RecordStore (RMS) trên bộ nhớ máy |

---

## 3. CHI TIẾT CÁC LỆNH CHAT TRONG GAME (Từ `AutoController`)

Người chơi có thể nhập các lệnh sau trực tiếp vào khung chat trong game:

| Lệnh Chat | Tác dụng | Hàm xử lý |
| :--- | :--- | :--- |
| `fa` | Bật / Tắt Auto Nông Trại (Farm) | `AutoController.batAutoTask("AutoFarm")` |
| `kc` | Bật / Tắt Auto Kim Cương (Up Xu) | `AutoController.batAutoTask("AutoKimCuong")` |
| `tx` | Bật / Tắt Auto Tài Xỉu | `AutoController.batAutoTask("AutoTaiXiu")` |
| `bd` | Bật / Tắt Auto Bán Đá trong rương | `AutoController.batAutoTask("AutoBanDa")` |
| `baby` | Bật / Tắt Auto Chăm Sóc Em Bé | `AutoController.batAutoTask("AutoChamEmBe")` |
| `pe` | Dừng tất cả các loại Auto đang chạy | `AutoController.tatToanBoAuto()` |
| `s` | Đưa tốc độ game về chuẩn (40ms) | `AutoController.datTocDoGame(40)` |
| `s<số>` | Chỉnh tốc độ game (Ví dụ: `s20` nhanh hơn, `s50` chậm hơn) | `AutoController.datTocDoGame(speed)` |
| `snc<số>` | Chỉnh quãng nghỉ giữa các lần nâng cấp đồ (ms) | `AutoController.datQuangNghiNangCap(delay)` |
| `k<số>` / `khu<số>` | Chuyển đến khu vực phòng game chỉ định (Ví dụ: `k5`) | `AutoController.chuyenKhu(khuId)` |
| `m<số>` / `map<số>` | Chuyển sang bản đồ chỉ định | `AutoController.chuyenMap(mapId)` |
| `mn` | Mở menu cài đặt tổng hợp của Mod | `AutoController.moMenuMod()` |
| `npc` | Mở menu nói chuyện với NPC gần nhất | `AutoController.moMenuNPC()` |
| `rd` | Mở rương đồ cá nhân | `AutoController.moRuongDo()` |
| `out` / `dx` | Đăng xuất tài khoản an toàn | `AutoController.dangXuatTaiKhoan()` |

---

## 4. CẤU TRÚC DỮ LIỆU LƯU TRỮ RMS

### Bản ghi `"DiamondSettings"` (Auto Kim Cương):
1. `tuDongBanDaKhiDayRuong` (boolean): Bán đá khi đầy rương
2. `boQuaKCX` (boolean): Không nhặt Kim Cương Xanh
3. `boQuaNHB` (boolean): Không nhặt Ngọc Hồng Bảo
4. `tuVeChamFarm` (boolean): Tự động quay về chăm sóc nông trại
5. `thoiGianVeFarmPhut` (int): Số phút hẹn giờ về farm
6. `thuHoachDungGio` (boolean): Farm thông minh (canh đúng giờ thu hoạch)
7. `mauUuTien` (byte): Thứ tự ưu tiên màu sắc kim cương (0: Vàng, 1: Trắng, 2: Đỏ, 3: Xanh lam, 4: Xanh lá, 5: Tím, 6: Mặc định)

### Bản ghi `"FarmSettings"` (Auto Nông Trại):
1. `coCheAutoFarm` (byte): 0: Lái buôn hỗ trợ, 1: Farm bình thường
2. `danhSachMonAnDuBi` (UTF String): ID các món ăn nấu bếp
3. `danhSachCayTrongDuBi` (UTF String): ID các loại hạt giống trồng dự phòng
4. `soLuongChuyenCay` (int): Ngưỡng số lượng để chuyển sang hạt giống khác
5. `danhSachBanNongSan` (UTF String): Danh sách ID nông sản cần bán (`-1` là bán hết)
6. `nguongBanNongSan` (int): Tồn kho tối thiểu để kích hoạt lệnh bán
7. `soLuongBanMoiLan` (int): Số lượng mỗi đợt bán
8. `tuBaoDanhHangNgay` (boolean): Điểm danh nhận quà
9. `tuNangCapCayKhe` (boolean) & `capCayKheToiDa` (int): Tự nâng cấp khế
10. `tuThuHoachTim`, `tuChoEmBeAn`, `tuMuaSuaEmBe`, `tuChuaBenhEmBe` (boolean): Chăm sóc em bé
