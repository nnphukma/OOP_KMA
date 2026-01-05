package controller;

import exception.InValidInputExecption;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.QLTKView;

public class QLTKController implements ActionListener {

    public QLTKView view;

    public QLTKController(QLTKView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.equals("Lưu TKTK")) {
                view.showTKTK();
            } else if (cmd.equals("Lưu TKTT")) {
                view.showTKTT();
            } else if (cmd.equals("Thống Kê")) {
                view.showThongKe();
            } else if (cmd.equals("Lưu File")) {
                view.luuFile("taikhoan.txt");
            }
        } catch (InValidInputExecption ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e2) {
            JOptionPane.showMessageDialog(view, "Lỗi Không Xác Định, Vui lòng nhập lại\n" + e2.getMessage());
        }
    }

}
