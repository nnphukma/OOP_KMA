
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QLCuaHangView;


public class QLCuaHangController implements  ActionListener{

    public QLCuaHangView view;

    public QLCuaHangController(QLCuaHangView view ) {
        this.view = view;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if(cmd.equals("Tìm Kiếm")){
            view.timKiemSelectRow(view.tf_code_timKiem.getText().trim());
        } else if (cmd.equals("Sắp Xếp")){
            view.sapXep();
        }
    }

}
