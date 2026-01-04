
package model;


public class RuongHinhVuong extends Ruong{
    private double doDaiCanh;

    public RuongHinhVuong(double doDaiCanh, String maRuong, String chuHo, String loaiCayTrong) {
        super(maRuong, chuHo, loaiCayTrong);
        this.doDaiCanh = doDaiCanh;
    }

    public double getDoDaiCanh() {
        return doDaiCanh;
    }

    public void setDoDaiCanh(double doDaiCanh) {
        this.doDaiCanh = doDaiCanh;
    }
    @Override
    public double tinhDienTich(){
        return doDaiCanh*doDaiCanh;
    }
    
    @Override
    public String toString() {
        return "Ruong Hinh Vuong {" + super.toString() + ", Do dai cannh: " + doDaiCanh + ", Dien Tich: " + tinhDienTich() + " }"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
