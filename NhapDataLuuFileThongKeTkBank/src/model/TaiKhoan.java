
package model;


abstract class TaiKhoan {
    private String maTk, tenChuTk;
    private double soDu; 

    public TaiKhoan(String maTk, String tenChuTk, double soDu) {
        this.maTk = maTk;
        this.tenChuTk = tenChuTk;
        this.soDu = soDu;
    }

    public String getMaTk() {
        return maTk;
    }

    public void setMaTk(String maTk) {
        this.maTk = maTk;
    }

    public String getTenChuTk() {
        return tenChuTk;
    }

    public void setTenChuTk(String tenChuTk) {
        this.tenChuTk = tenChuTk;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "Ma Tk: " + maTk + ", Ten Chu TK: " + tenChuTk + ", So Du: " + soDu;
    }
    
    
    
}
