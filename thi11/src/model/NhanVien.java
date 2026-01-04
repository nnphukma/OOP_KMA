
package model;


public class NhanVien extends CanBo{
    
    private String major;

    public NhanVien() {
    }

    public NhanVien(String major, String name, int dateOfBirth, boolean sex, String address, double heSoLuonng) {
        super(name, dateOfBirth, sex, address, heSoLuonng);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public double tinhLuong(){
        double luong = this.getHeSoLuonng()*CanBo.LUONG_CO_BAN;
        return luong;
    }

    @Override
    public String toString() {
        return "Nhan Vien {" + super.toString() + ", Nganh Dao Tao: " + major + "Luong: " + tinhLuong() +" }";
    }
    
    
}
