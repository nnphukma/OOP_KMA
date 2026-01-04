
package model;


public class DoUong extends MatHang{
    private boolean isHotDrink;

    public DoUong() {
    }

    public DoUong(boolean isHotDrink, String name, String code, double amount, double giaVon) {
        super(name, code, amount, giaVon);
        this.isHotDrink = isHotDrink;
    }

    public boolean isIsHotDrink() {
        return isHotDrink;
    }

    public void setIsHotDrink(boolean isHotDrink) {
        this.isHotDrink = isHotDrink;
    }

    @Override
    public String toString() {
        return "DoUong{" + super.toString() + ", Do uong nog:" + isHotDrink + ", Gia Menu: " + tinhGiaMenu() + '}';
    }
    
    public double tinhGiaMenu(){
        double gia = (this.getGiaVon())/MatHang.TY_LE_GIA_VON;
        return gia;
    }
}
