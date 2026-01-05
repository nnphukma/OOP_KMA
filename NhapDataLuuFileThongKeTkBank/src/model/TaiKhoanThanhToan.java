
package model;


public class TaiKhoanThanhToan extends TaiKhoan{

    private String loaiThe;
    private double soGiaoDich;

    public TaiKhoanThanhToan(String loaiThe, double soGiaoDich, String maTk, String tenChuTk, double soDu) {
        super(maTk, tenChuTk, soDu);
        this.loaiThe = loaiThe;
        this.soGiaoDich = soGiaoDich;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }

    public double getSoGiaoDich() {
        return soGiaoDich;
    }

    public void setSoGiaoDich(double soGiaoDich) {
        this.soGiaoDich = soGiaoDich;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{ " + super.toString() + ", Loai The: " + loaiThe + ", So Giao Dich: " + soGiaoDich + " }";
    }
    
    
    
    
}
