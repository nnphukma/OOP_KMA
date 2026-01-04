package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.NhanVienBep;
import model.NhanVienThuNgan;
import view.QLNhanVienView;
import exception.InvalidNumberException;
import javax.swing.JOptionPane;

public class QLNhanVienController implements ActionListener {

    public QLNhanVienView view;

    public QLNhanVienController(QLNhanVienView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Lưu NV Bếp")) {

            try {
                String name = this.view.nvBep_textField_Name_Input.getText();

                int thamNien = parsePositiveInt(
                        view.nvBep_textField_ThamNien_Input1.getText(),
                        "Thâm niên"
                );

                String queQuan = this.view.nvBep_textField_QueQuan_Input2.getText();
                double times = parsePositiveDouble(
                        view.nvBep_textField_Times_Input3.getText(),
                        "Số giờ làm"
                );

                boolean isBepTruong = false;

                if (this.view.nvBep_radioBtn_YES.isSelected()) {
                    isBepTruong = true;
                }

                double thuong = parsePositiveDouble(
                        view.nvBep_textField_Thuong_Input4.getText(),
                        "Thưởng chức vụ"
                );

                if (isBepTruong == false) {
                    thuong = 0.0;
                }

                NhanVienBep nhanVienBep = new NhanVienBep(isBepTruong, thuong, name, thamNien, queQuan, times);

                view.themNhanVienBep(nhanVienBep);
            } catch (InvalidNumberException ine) {
                JOptionPane.showMessageDialog(view, ine.getMessage(),
                        "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            view.clearNhanVienBep();
        } else if (cmd.equals("Lưu NV Thu Ngân")) {
            try {
                String name = this.view.nvTN_textField_Name_Input1.getText();

                int thamNien = parsePositiveInt(
                        this.view.nvTN_textField_ThamNien_Input2.getText(),
                        "Thâm Niên");

                String queQuan = this.view.nvTn_textField_QueQuan_Input3.getText();

                double times = parsePositiveDouble(
                        this.view.nvTn_textField_Times_Input4.getText(),
                        "Thời Gian Làm ");

                boolean isBietNgoaiNgu = false;

                if (this.view.nvTn_radioBtn_YES.isSelected()) {
                    isBietNgoaiNgu = true;
                }

                NhanVienThuNgan nhanVienThuNgan = new NhanVienThuNgan(isBietNgoaiNgu, name, thamNien, queQuan, times);
                view.themNhanVienThuNgan(nhanVienThuNgan);
                view.clearNhanVienThuNgan();

            } catch (InvalidNumberException ine) {
                JOptionPane.showMessageDialog(view, ine.getMessage(),
                        "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (cmd.equals("Lưu File")) {
            view.luuFile();
        }
    }

    private int parsePositiveInt(String input, String fieldName)
            throws InvalidNumberException {

        if (input == null || input.trim().isEmpty()) {
            throw new InvalidNumberException(fieldName + " không được để trống");
        }

        try {
            int value = Integer.parseInt(input.trim());
            if (value <= 0) {
                throw new InvalidNumberException(fieldName + " phải là số dương");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InvalidNumberException(fieldName + " phải là số nguyên");
        }
    }

    private double parsePositiveDouble(String input, String fieldName)
            throws InvalidNumberException {

        if (input == null || input.trim().isEmpty()) {
            throw new InvalidNumberException(fieldName + " không được để trống");
        }

        try {
            double value = Double.parseDouble(input.trim());
            if (value <= 0) {
                throw new InvalidNumberException(fieldName + " phải là số dương");
            }
            return value;
        } catch (NumberFormatException e) {
            throw new InvalidNumberException(fieldName + " phải là số");
        }
    }

}
