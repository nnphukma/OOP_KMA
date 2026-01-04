
package model;

import java.util.ArrayList;


public class QLNhanVienModel {
    public ArrayList<NhanVienBep> listNhanVienBep;
    public ArrayList<NhanVienThuNgan> listNhanVienTn;
    
    public QLNhanVienModel() {
        this.listNhanVienBep = new ArrayList<NhanVienBep>();
        this.listNhanVienTn = new ArrayList<NhanVienThuNgan>();
    }

    public ArrayList<NhanVienBep> getListNhanVienBep() {
        return listNhanVienBep;
    }

    public void setListNhanVienBep(ArrayList<NhanVienBep> listNhanVienBep) {
        this.listNhanVienBep = listNhanVienBep;
    }

    public ArrayList<NhanVienThuNgan> getListNhanVienTn() {
        return listNhanVienTn;
    }

    public void setListNhanVienTn(ArrayList<NhanVienThuNgan> listNhanVienTn) {
        this.listNhanVienTn = listNhanVienTn;
    }
    
    public void insertNVBep(NhanVienBep nhanVienBep){
        this.listNhanVienBep.add(nhanVienBep);
    }
    public void insertNVThuNgan(NhanVienThuNgan nhanVienThuNgan){
        this.listNhanVienTn.add(nhanVienThuNgan);
    }
}
