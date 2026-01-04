package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QLNhaHangView;

public class QLNhaHangController implements ActionListener {

    public QLNhaHangView view;

    public QLNhaHangController(QLNhaHangView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.equals("Tìm Kiếm")) {
                String code = view.textField_TimKiemCode.getText();
                view.timKiem(code);
            } else if (cmd.equals("Sắp Xếp")) {
                
                view.sapXep();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

}
