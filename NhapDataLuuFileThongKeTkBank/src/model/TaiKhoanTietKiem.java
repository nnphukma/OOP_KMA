
package model;


public class TaiKhoanTietKiem extends TaiKhoan{
    private double laiSuat, kiHan;

    public TaiKhoanTietKiem(double laiSuat, double kiHan, String maTk, String tenChuTk, double soDu) {
        super(maTk, tenChuTk, soDu);
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public double getKiHan() {
        return kiHan;
    }

    public void setKiHan(double kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString() + ", Lai Suat: " + laiSuat + ", Ki han: " + kiHan + " }";
    }
    
    
}
