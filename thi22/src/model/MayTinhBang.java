
package model;


public class MayTinhBang extends HangHoa{
    private float screenSize;

    public MayTinhBang(float screenSize, String name, String code, double giaNhap, double giaBan) {
        super(name, code, giaNhap, giaBan);
        this.screenSize = screenSize;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "MayTinhBang {" + super.toString() +  ", Kich Thuoc Man Hinh " + screenSize + '}';
    }
    
    @Override
    public double getloiNhuan(){
        return (this.getGiaBan() - this.getGiaNhap())*(1 - HangHoa.THUONG_BAN_HANG);
    }
}
