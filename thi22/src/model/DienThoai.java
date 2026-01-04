
package model;


public class DienThoai extends HangHoa{
    
    private double giaSimGhep;

    public DienThoai(double giaSimGhep, String name, String code, double giaNhap, double giaBan) {
        super(name, code, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }

    public double getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    @Override
    public String toString() {
        return "Dien Thoai{" + super.toString() + ", Loi Nhuan " + getloiNhuan() + " }";
    }
    @Override
    public double getloiNhuan(){
        double loiNhuan = (this.getGiaBan() - this.getGiaNhap())*(1 - HangHoa.THUONG_BAN_HANG) - giaSimGhep;
        return loiNhuan;
    }
}
