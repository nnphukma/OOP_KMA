
package model;

import exception.InValidInputExecption;
import java.util.ArrayList;


public class QLTKModel {
    public ArrayList<TaiKhoanTietKiem> listTKTK;
    public ArrayList<TaiKhoanThanhToan> listTKTT;

    public QLTKModel() {
        this.listTKTK = new ArrayList<TaiKhoanTietKiem>();
        this.listTKTT = new ArrayList<TaiKhoanThanhToan>();
    }
    
    public void addTKTK(TaiKhoanTietKiem tktk) throws InValidInputExecption {
    if (isExistMaTK(tktk.getMaTk())) {
        throw new InValidInputExecption("Mã TK đã tồn tại, vui lòng nhập mã khác!");
    }
    listTKTK.add(tktk);
}

public void addTKTT(TaiKhoanThanhToan tktt) throws InValidInputExecption {
    if (isExistMaTK(tktt.getMaTk())) {
        throw new InValidInputExecption("Mã TK đã tồn tại, vui lòng nhập mã khác!");
    }
    listTKTT.add(tktt);
}
    
    public boolean isExistMaTK(String maTK) {
    for (TaiKhoanTietKiem tktk : listTKTK) {
        if (tktk.getMaTk().equalsIgnoreCase(maTK)) {
            return true;
        }
    }
    for (TaiKhoanThanhToan tktt : listTKTT) {
        if (tktt.getMaTk().equalsIgnoreCase(maTK)) {
            return true;
        }
    }
    return false;
}
}
