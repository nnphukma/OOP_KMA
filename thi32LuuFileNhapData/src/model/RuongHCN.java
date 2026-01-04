
package model;


public class RuongHCN extends Ruong{
    private double chieuDai, chieuRong;

    public RuongHCN(double chieuDai, double chieuRong, String maRuong, String chuHo, String loaiCayTrong) {
        super(maRuong, chuHo, loaiCayTrong);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    @Override
    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "Ruong Hinh Chu Nhat {" + super.toString() + ", Chieu Dai: " + chieuDai + ", Chieu Rong: " + chieuRong + ", Dien Tich: " + tinhDienTich() + " }"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}   
