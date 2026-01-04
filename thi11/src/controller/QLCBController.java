package controller;

import exception.InvalidNumberException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.QLCanBoView;

public class QLCBController implements ActionListener {

    public QLCanBoView view;

    public QLCBController(QLCanBoView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String cmd = e.getActionCommand();
            if (cmd.equals("Lưu NV")) {
                view.getNhanVien();
            } else if (cmd.equals("Lưu QL")) {
                view.getQuanLy();
            } else if(cmd.equals("Lưu File")){
                view.luuFile();
            }
        } catch (InvalidNumberException ine) {
            JOptionPane.showMessageDialog(view, ine.getMessage(),
                    "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view,
                    "Lỗi khi lưu file: " + ex.getMessage());
        }

    }

}
