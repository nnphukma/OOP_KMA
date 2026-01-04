
package model;


public class NhanVien {
    private String name;
    private int thamnien;
    private String queQuan;
    private double time;
    public static final double LUONG_GIO = 100000;

    public NhanVien(String name, int thamnien, String queQuan, double time) {
        this.name = name;
        this.thamnien = thamnien;
        this.queQuan = queQuan;
        this.time = time;
    }

    @Override
    public String toString() {
        return "{" + "Ho va ten: " + name + ", Tham Nien: " + thamnien + ", Que Quan:" + queQuan + ", Thoi Gian Lam: " + time + " tieng " ;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    
}
