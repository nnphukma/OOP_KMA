
package model;


public class MonAnThem extends MatHang{
    private boolean canTrinhBay;

    public MonAnThem() {
    }

    public MonAnThem(boolean canTrinhBay, String name, String code, double amount, double giaVon) {
        super(name, code, amount, giaVon);
        this.canTrinhBay = canTrinhBay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    public boolean isCanTrinhBay() {
        return canTrinhBay;
    }

    public void setCanTrinhBay(boolean canTrinhBay) {
        this.canTrinhBay = canTrinhBay;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonAnThem other = (MonAnThem) obj;
        return this.canTrinhBay == other.canTrinhBay;
    }

    @Override
    public String toString() {
        return "MonAnThem{" + super.toString() + ", Trinh Bay:" + canTrinhBay + ", Gia Menu: " + tinhGiaMenu() +  "}";
    }
    
    public double tinhGiaMenu(){
        double gia = (this.getGiaVon())/MatHang.TY_LE_GIA_VON;
        if(canTrinhBay) {
            return gia + 200000;
        } return gia;
    }
}
