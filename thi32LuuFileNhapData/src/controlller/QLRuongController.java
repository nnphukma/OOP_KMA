package controlller;

import exection.KTKhongHopLeException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.QLRuongView;

public class QLRuongController implements ActionListener {

    public QLRuongView view;

    public QLRuongController(QLRuongView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        try {
            if (cmd.equals("Lưu")) {
                if (view.radioBtn_hv1.isSelected()) {
                    view.themRuongHV();
                } else if (view.radioBtn_hcn.isSelected()){
                    view.themRuongHCN();
                }
            view.showThongTin();
            } else if (cmd.equals("Lưu File")) {
                view.luuFile("ruong.txt");
            }
        } catch (KTKhongHopLeException ktkhle){
            JOptionPane.showMessageDialog(view, ktkhle.getMessage(), "Canh Bao", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            
        }
    }

}
