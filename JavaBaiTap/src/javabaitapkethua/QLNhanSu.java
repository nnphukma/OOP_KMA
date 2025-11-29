
package javabaitapkethua;

abstract class Person {
    String name, address;
    int age;
    boolean Sex;

    public Person(String name, String address, int age, boolean Sex) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.Sex = Sex;
    }
    public void getGioiTinh(){
        if(this.Sex == true){
        System.out.println("Nam");
        } else System.out.println("Nu");
    }
    @Override
    public String toString() {
        return "Ten: " + name +
               "\nDia chi: " + address +
               "\nTuoi: " + age +
               "\nGioi tinh: " + (Sex ? "Nam" : "Nu");
    }
}

class Emplpoyee extends Person {
    String maNV;
    double heSoLuong, luongCoBan;

    public Emplpoyee(String maNV, double heSoLuong, double luongCoBan, 
                     String name, String address, int age, boolean Sex) {
        super(name, address, age, Sex);
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }
    
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    } 
    @Override
    public String toString() {
        return super.toString() +
               "\nMa nhan vien: " + maNV +
               "\nHe so luong: " + heSoLuong +
               "\nLuong co ban: " + luongCoBan +
               "\nLuong: " + tinhLuong();
    }
}

class Manager extends Emplpoyee{
    double phuCap;

    public Manager(double phuCap, String maNV, double heSoLuong, double luongCoBan, String name, String address, int age, boolean Sex) {
        super(maNV, heSoLuong, luongCoBan, name, address, age, Sex);
        this.phuCap = phuCap;
    }
    @Override
    public double tinhLuong(){
        return luongCoBan*heSoLuong + phuCap;
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nPhu cap: " + phuCap +
               "\nTong: " + tinhLuong();
    }
}
public class QLNhanSu {
    public static void main(String[] args) {
        Emplpoyee nv1 = new Emplpoyee("NV01", 1.0, 5500, "Nguyen Van B", "HaNoi", 20, true);
        Manager mn2 = new Manager(100, "MN01", 2.0, 5500, "Dep trai", "ha Noi", 20, false);
        System.out.println("Nhan vien");
        System.out.println(nv1);

        System.out.println("\nQuan ly");
        System.out.println(mn2);
        
        
    }
}
