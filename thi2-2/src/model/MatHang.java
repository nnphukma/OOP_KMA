
package model;


public class MatHang {
    private String name, code;
    private double amount;
    private double giaVon;
    public static final double TY_LE_GIA_VON = 0.4;

    public MatHang() {
    }

    public MatHang(String name, String code, double amount, double giaVon) {
        this.name = name;
        this.code = code;
        this.amount = amount;
        this.giaVon = giaVon;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }

    @Override
    public String toString() {
        return "Ten: " + name + ", Ma MHL " + code + ", So luong: " + amount + ", Gia von" + giaVon ;
    
    }
    
}
