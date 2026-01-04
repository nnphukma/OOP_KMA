
package model;
import java.util.ArrayList;


public class QLCanBoModel {
    public ArrayList<NhanVien> listNVs ;
    public ArrayList<QuanLy> listQLs;

    public QLCanBoModel() {
        listQLs = new ArrayList<QuanLy>();
        listNVs = new ArrayList<NhanVien>();
    }

    public void addNhanVien(NhanVien nv){
        listNVs.add(nv);
    }
    
    public void addQuanLy(QuanLy ql){
        listQLs.add(ql);
    }
    
}
