package mod.avatar;

import javax.microedition.lcdui.*;

/**
 * FormCaiDatKimCuong (Gỡ rối từ lớp gốc: gl_0 / gL)
 * 
 * GIAO DIỆN CÀI ĐẶT THÔNG SỐ AUTO KIM CƯƠNG (UP XU)
 * -------------------------------------------------------------------
 * Hiển thị form màn hình cho phép người chơi tùy chỉnh:
 * 1. Tùy chọn checkbox: Bán đá khi đầy rương, Tự về chăm farm, Bỏ KCX, Bỏ NHB.
 * 2. Hẹn giờ: Thời gian về farm (phút).
 * 3. Farm thông minh: Thu hoạch đúng giờ.
 * 4. Thứ tự ưu tiên màu sắc kim cương (Vàng, Trắng, Đỏ, Xanh lam, Xanh lá, Tím).
 */
public final class FormCaiDatKimCuong extends Form implements CommandListener {

    private final ChoiceGroup groupTuyChon;
    private final TextField tfThoiGianVeFarm;
    private final ChoiceGroup groupFarmThongMinh;
    private final ChoiceGroup groupUuTienMau;

    private final Command cmdLuu;
    private final Command cmdHuy;

    public FormCaiDatKimCuong() {
        super("Cài đặt Auto KC");

        // 1. Nhóm tùy chọn nhiều lựa chọn (Checkbox)
        String[] optionsTuyChon = new String[]{
            "Bán đá khi đầy rương",  // index 0
            "Tự về chăm farm",       // index 1
            "Tự bỏ KCX",             // index 2
            "Tự bỏ NHB"              // index 3
        };
        this.groupTuyChon = new ChoiceGroup("Tùy chọn", Choice.MULTIPLE, optionsTuyChon, null);
        this.append(this.groupTuyChon);

        // 2. Ô nhập thời gian chu kỳ về nông trại (phút)
        this.tfThoiGianVeFarm = new TextField(
            "T.gian về farm (phút):", 
            String.valueOf(AutoKimCuong.thoiGianVeFarmPhut), 
            4, 
            TextField.NUMERIC
        );
        this.append(this.tfThoiGianVeFarm);

        // 3. Cơ chế Farm thông minh
        String[] optionsFarmTM = new String[]{"Thu hoạch đúng giờ"};
        this.groupFarmThongMinh = new ChoiceGroup("Farm thông minh", Choice.MULTIPLE, optionsFarmTM, null);
        this.append(this.groupFarmThongMinh);

        // 4. Nhóm chọn màu sắc ưu tiên (Radio / Pop-up)
        String[] optionsMau = new String[]{
            "Vàng",
            "Trắng",
            "Đỏ",
            "Xanh lam",
            "Xanh lá",
            "Tím",
            "Mặc định"
        };
        this.groupUuTienMau = new ChoiceGroup("Thứ tự ưu tiên", Choice.EXCLUSIVE, optionsMau, null);
        this.append(this.groupUuTienMau);

        // 5. Nạp giá trị hiện tại lên giao diện
        this.groupTuyChon.setSelectedIndex(0, AutoKimCuong.tuDongBanDaKhiDayRuong);
        this.groupTuyChon.setSelectedIndex(1, AutoKimCuong.tuVeChamFarm);
        this.groupTuyChon.setSelectedIndex(2, AutoKimCuong.boQuaKCX);
        this.groupTuyChon.setSelectedIndex(3, AutoKimCuong.boQuaNHB);

        this.groupFarmThongMinh.setSelectedIndex(0, AutoKimCuong.thuHoachDungGio);
        this.groupUuTienMau.setSelectedIndex(AutoKimCuong.mauUuTien, true);

        // 6. Nút lệnh
        this.cmdLuu = new Command("Lưu", Command.OK, 1);
        this.cmdHuy = new Command("Hủy", Command.CANCEL, 2);
        this.addCommand(this.cmdLuu);
        this.addCommand(this.cmdHuy);
        this.setCommandListener(this);
    }

    @Override
    public void commandAction(Command cmd, Displayable displayable) {
        if (cmd == this.cmdLuu) {
            // Đọc lại các giá trị từ form
            AutoKimCuong.tuDongBanDaKhiDayRuong = this.groupTuyChon.isSelected(0);
            AutoKimCuong.tuVeChamFarm = this.groupTuyChon.isSelected(1);
            AutoKimCuong.boQuaKCX = this.groupTuyChon.isSelected(2);
            AutoKimCuong.boQuaNHB = this.groupTuyChon.isSelected(3);

            AutoKimCuong.thuHoachDungGio = this.groupFarmThongMinh.isSelected(0);
            AutoKimCuong.mauUuTien = (byte) this.groupUuTienMau.getSelectedIndex();

            try {
                int phut = Integer.parseInt(this.tfThoiGianVeFarm.getString().trim());
                if (phut > 0) {
                    AutoKimCuong.thoiGianVeFarmPhut = phut;
                    AutoKimCuong.getInstance().khoangThoiGianVeFarmMs = (long) phut * 60 * 1000L;
                }
            } catch (NumberFormatException ignored) {}

            // Lưu vào RMS
            AutoKimCuong.luuCaiDatRMS();
            System.out.println("Lưu cài đặt Auto KC thành công!");
        }

        // Quay lại màn hình trò chơi chính
        troVeManHinhGame();
    }

    private void troVeManHinhGame() {
        // Display.getDisplay(MIDlet).setCurrent(GameCanvas);
    }
}
