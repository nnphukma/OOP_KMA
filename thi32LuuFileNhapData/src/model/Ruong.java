
package model;


abstract class Ruong {
    private String maRuong, chuHo, loaiCayTrong;
    public static final double DIEN_TICH_MAX = 100;

    public Ruong(String maRuong, String chuHo, String loaiCayTrong) {
        this.maRuong = maRuong;
        this.chuHo = chuHo;
        this.loaiCayTrong = loaiCayTrong;
    }

    public String getMaRuong() {
        return maRuong;
    }

    public void setMaRuong(String maRuong) {
        this.maRuong = maRuong;
    }

    public String getChuHo() {
        return chuHo;
    }

    public void setChuHo(String chuHo) {
        this.chuHo = chuHo;
    }

    public String getLoaiCayTrong() {
        return loaiCayTrong;
    }

    public void setLoaiCayTrong(String loaiCayTrong) {
        this.loaiCayTrong = loaiCayTrong;
    }
    
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return " Ma ruong: " + maRuong + ", Chu Ho: " + chuHo + ", Loai Cay trong: " + loaiCayTrong;
    }
    
    
    
}
