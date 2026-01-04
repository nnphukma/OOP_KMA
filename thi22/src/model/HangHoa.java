
package model;


abstract class HangHoa {
    private String name, code;
    private double giaNhap, giaBan;
    public static final double THUONG_BAN_HANG = 0.2;

    public HangHoa(String name, String code, double giaNhap, double giaBan) {
        this.name = name;
        this.code = code;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "Tên " + name + ", Mã SP " + code + ", Giá Nhập " + giaNhap + ", Giá Bán " + giaBan;
    }

    abstract double getloiNhuan();
}
