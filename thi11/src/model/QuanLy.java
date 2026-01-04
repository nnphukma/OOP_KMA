package model;


public class QuanLy extends CanBo{
    
    private double hsChucVu;

    public QuanLy() {
    }

    public QuanLy(double hsChucVu, String name, int dateOfBirth, boolean sex, String address, double heSoLuonng) {
        super(name, dateOfBirth, sex, address, heSoLuonng);
        this.hsChucVu = hsChucVu;
    }

    public double getHsChucVu() {
        return hsChucVu;
    }

    public void setHsChucVu(double hsChucVu) {
        this.hsChucVu = hsChucVu;
    }

    

    public double tinhLuong(){
        double luong = this.getHeSoLuonng()*CanBo.LUONG_CO_BAN;
        return luong * (1.0 + this.getHsChucVu());
    }

    @Override
    public String toString() {
        return "Quan Ly {" +  super.toString() + ", He so chuc vu: " + hsChucVu + "Luong: " + tinhLuong() + " }";
    }
    
    
}
