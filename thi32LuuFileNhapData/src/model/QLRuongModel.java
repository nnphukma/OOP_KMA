
package model;

import java.util.ArrayList;


public class QLRuongModel {
    public ArrayList<RuongHinhVuong> listRuongHv;
    public ArrayList<RuongHCN> listRuongHcn;

    public QLRuongModel() {
        this.listRuongHv = new ArrayList<RuongHinhVuong>();
        this.listRuongHcn = new ArrayList<RuongHCN>();
    }
    
    public void addRuongHv (RuongHinhVuong rhv){
        listRuongHv.add(rhv);
    }
    public void addRuongHcn (RuongHCN cN){
        listRuongHcn.add(cN);
    }
}
