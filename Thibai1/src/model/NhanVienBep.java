
package model;


public class NhanVienBep extends NhanVien {
    
    private boolean isBepTruong;
    private double thuongChucVu;
    
    
    public NhanVienBep(boolean isBepTruong, double thuongChucVu, String name, int thamnien, String queQuan, double time) {
        super(name, thamnien, queQuan, time);
        this.isBepTruong = isBepTruong;
        this.thuongChucVu = thuongChucVu;
    }

    public NhanVienBep() {
        super(null, 0, null, 0);
    }

    public boolean isIsBepTruong() {
        return isBepTruong;
    }

    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public double getThuongChucVu() {
        return thuongChucVu;
    }

    public void setThuongChucVu(double thuongChucVu) {
        this.thuongChucVu = thuongChucVu;
    }
    
    
    public double tinhLuong(){
        if(isBepTruong){
            return this.getTime()*NhanVien.LUONG_GIO + this.thuongChucVu;
        }
        return this.getTime()*NhanVien.LUONG_GIO;
    }

    @Override
    public String toString() {
        return super.toString() + ", isBepTruong=" + isBepTruong + ", thuongChucVu=" + thuongChucVu + ", Luong: " + tinhLuong()+ '}';
    }
    
    
    
}
