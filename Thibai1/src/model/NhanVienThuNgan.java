
package model;


public class NhanVienThuNgan extends NhanVien{
    
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan(boolean isBietNgoaiNgu, String name, int thamnien, String queQuan, double time) {
        super(name, thamnien, queQuan, time);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }

    public NhanVienThuNgan() {
        super(null, 0, null, 0);
    }

    public boolean isIsBietNgoaiNgu() {
        return isBietNgoaiNgu;
    }

    public void setIsBietNgoaiNgu(boolean isBietNgoaiNgu) {
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }
    
    public double tinhLuong(){
        return this.getTime()*NhanVien.LUONG_GIO;
    }

    @Override
    public String toString() {
        return super.toString() +  ", isBietNgoaiNgu=" + isBietNgoaiNgu + ", Luong: " + tinhLuong()+ '}';
    }
    
    
}
