package mod.avatar;

import javax.microedition.lcdui.*;

/**
 * FormCaiDatFarm (Gỡ rối từ lớp gốc: cn.java)
 * 
 * GIAO DIỆN CÀI ĐẶT THÔNG SỐ AUTO NÔNG TRẠI (FARM)
 * -------------------------------------------------------------------
 * Quản lý toàn bộ cấu hình Auto Farm:
 * - Cơ chế farm (Lái buôn hỗ trợ / Farm bình thường)
 * - Tự động thay đổi loại hạt giống trồng khi đạt số lượng mong muốn
 * - Tự động bán nông sản ra thương lái / cửa hàng
 * - Tự động chăm sóc cây khế (nâng cấp lên level chỉ định)
 * - Tự động làm nhiệm vụ ấp rồng, luyện rồng, giao đơn hàng
 * - Tự động chăm sóc em bé (thu hoạch tim, cho ăn, mua sữa, chữa bệnh)
 */
public final class FormCaiDatFarm extends Form implements CommandListener {

    // =========================================================================
    // CÁC THÀNH PHẦN GIAO DIỆN TRÊN MÀN HÌNH
    // =========================================================================

    private final ChoiceGroup groupCoChe;
    private final TextField tfMonAnDuBi;
    private final TextField tfCayTrongDuBi;
    private final TextField tfThayTheCaySoLuong;
    private final TextField tfBanNongSan;
    private final TextField tfNguongBanNongSan;
    private final TextField tfSoLuongBanMoiLan;
    private final ChoiceGroup groupTuyChon;
    private final TextField tfCapCayKheToiDa;
    private final ChoiceGroup groupEmBe;

    private final Command cmdLuu;
    private final Command cmdHuy;

    public FormCaiDatFarm() {
        super("Cài đặt Auto Farm");

        // 1. Cơ chế Auto: Lái buôn hỗ trợ hoặc Farm bình thường
        String[] optionsCoChe = new String[]{"Lái buôn hỗ trợ", "Farm bình thường"};
        this.groupCoChe = new ChoiceGroup("Cơ chế Auto", Choice.EXCLUSIVE, optionsCoChe, null);
        this.append(this.groupCoChe);

        // 2. Món ăn dự bị (nấu bếp)
        this.tfMonAnDuBi = new TextField("Món ăn dự bị (id1,id2,..)", AutoFarm.danhSachMonAnDuBi, 64, TextField.ANY);
        this.append(this.tfMonAnDuBi);

        // 3. Cây trồng dự bị
        this.tfCayTrongDuBi = new TextField("Cây trồng dự bị (id1,id2,..)", AutoFarm.danhSachCayTrongDuBi, 64, TextField.ANY);
        this.append(this.tfCayTrongDuBi);

        // 4. Số lượng nông sản tồn để chuyển đổi cây trồng
        this.tfThayTheCaySoLuong = new TextField("Thay thế cây khi đạt số lượng:", String.valueOf(AutoFarm.soLuongChuyenCay), 6, TextField.NUMERIC);
        this.append(this.tfThayTheCaySoLuong);

        // 5. Cấu hình bán nông sản
        this.tfBanNongSan = new TextField("Bán nông sản: -1 (all) or (id1,id2,...)", AutoFarm.danhSachBanNongSan, 64, TextField.ANY);
        this.append(this.tfBanNongSan);

        this.tfNguongBanNongSan = new TextField("Bán nông sản khi đạt số lượng:", String.valueOf(AutoFarm.nguongBanNongSan), 6, TextField.NUMERIC);
        this.append(this.tfNguongBanNongSan);

        this.tfSoLuongBanMoiLan = new TextField("Số lượng nông sản khi bán:", String.valueOf(AutoFarm.soLuongBanMoiLan), 6, TextField.NUMERIC);
        this.append(this.tfSoLuongBanMoiLan);

        // 6. Nhóm tùy chọn bổ sung
        String[] optionsFarm = new String[]{
            "Báo danh hàng ngày",                             // index 0
            "Nâng cấp cây khế",                               // index 1
            "Nhiệm vụ ấp rồng",                               // index 2
            "Nhiệm vụ luyện rồng",                            // index 3
            "Giao đơn hàng",                                  // index 4
            "Ko tự mua (hạt giống/vật nuôi) dùng lượng"       // index 5
        };
        this.groupTuyChon = new ChoiceGroup("Tùy chọn", Choice.MULTIPLE, optionsFarm, null);
        this.append(this.groupTuyChon);

        // 7. Cấp cây khế tối đa cần nâng
        this.tfCapCayKheToiDa = new TextField("Nâng cây khế đến cấp:", String.valueOf(AutoFarm.capCayKheToiDa), 3, TextField.NUMERIC);
        this.append(this.tfCapCayKheToiDa);

        // 8. Tùy chọn chăm sóc em bé
        String[] optionsBaby = new String[]{
            "Thu hoạch tim",   // index 0
            "Cho em bé ăn",    // index 1
            "Mua sữa em bé",   // index 2
            "Chữa bệnh em bé"  // index 3
        };
        this.groupEmBe = new ChoiceGroup("Chăm em bé", Choice.MULTIPLE, optionsBaby, null);
        this.append(this.groupEmBe);

        // 9. Nạp giá trị hiện tại lên màn hình
        this.groupCoChe.setSelectedIndex(AutoFarm.coCheAutoFarm, true);
        this.groupTuyChon.setSelectedIndex(0, AutoFarm.tuBaoDanhHangNgay);
        this.groupTuyChon.setSelectedIndex(1, AutoFarm.tuNangCapCayKhe);
        this.groupTuyChon.setSelectedIndex(2, AutoFarm.tuLamNhiemVuApRong);
        this.groupTuyChon.setSelectedIndex(3, AutoFarm.tuLamNhiemVuLuyenRong);
        this.groupTuyChon.setSelectedIndex(4, AutoFarm.tuGiaoDonHang);
        this.groupTuyChon.setSelectedIndex(5, AutoFarm.khongMuaBangLuong);

        this.groupEmBe.setSelectedIndex(0, AutoFarm.tuThuHoachTim);
        this.groupEmBe.setSelectedIndex(1, AutoFarm.tuChoEmBeAn);
        this.groupEmBe.setSelectedIndex(2, AutoFarm.tuMuaSuaEmBe);
        this.groupEmBe.setSelectedIndex(3, AutoFarm.tuChuaBenhEmBe);

        // 10. Nút lệnh
        this.cmdLuu = new Command("Lưu", Command.OK, 1);
        this.cmdHuy = new Command("Hủy", Command.CANCEL, 2);
        this.addCommand(this.cmdLuu);
        this.addCommand(this.cmdHuy);
        this.setCommandListener(this);
    }

    @Override
    public void commandAction(Command cmd, Displayable displayable) {
        if (cmd == this.cmdLuu) {
            AutoFarm.coCheAutoFarm = (byte) this.groupCoChe.getSelectedIndex();
            AutoFarm.danhSachMonAnDuBi = this.tfMonAnDuBi.getString().trim();
            AutoFarm.danhSachCayTrongDuBi = this.tfCayTrongDuBi.getString().trim();
            AutoFarm.danhSachBanNongSan = this.tfBanNongSan.getString().trim();

            try {
                AutoFarm.soLuongChuyenCay = Integer.parseInt(this.tfThayTheCaySoLuong.getString().trim());
                AutoFarm.nguongBanNongSan = Integer.parseInt(this.tfNguongBanNongSan.getString().trim());
                AutoFarm.soLuongBanMoiLan = Integer.parseInt(this.tfSoLuongBanMoiLan.getString().trim());
                AutoFarm.capCayKheToiDa = Integer.parseInt(this.tfCapCayKheToiDa.getString().trim());
            } catch (NumberFormatException ignored) {}

            AutoFarm.tuBaoDanhHangNgay = this.groupTuyChon.isSelected(0);
            AutoFarm.tuNangCapCayKhe = this.groupTuyChon.isSelected(1);
            AutoFarm.tuLamNhiemVuApRong = this.groupTuyChon.isSelected(2);
            AutoFarm.tuLamNhiemVuLuyenRong = this.groupTuyChon.isSelected(3);
            AutoFarm.tuGiaoDonHang = this.groupTuyChon.isSelected(4);
            AutoFarm.khongMuaBangLuong = this.groupTuyChon.isSelected(5);

            AutoFarm.tuThuHoachTim = this.groupEmBe.isSelected(0);
            AutoFarm.tuChoEmBeAn = this.groupEmBe.isSelected(1);
            AutoFarm.tuMuaSuaEmBe = this.groupEmBe.isSelected(2);
            AutoFarm.tuChuaBenhEmBe = this.groupEmBe.isSelected(3);

            // Lưu cài đặt vào RMS "FarmSettings"
            AutoFarm.luuCaiDatRMS();
            System.out.println("Lưu cài đặt Auto Farm thành công!");
        }

        troVeManHinhGame();
    }

    private void troVeManHinhGame() {
        // Display.getDisplay(MIDlet).setCurrent(GameCanvas);
    }
}
