/*
Bài 3: Quản lý phương tiện giao thông
- Tạo lớp PhuongTien với các thuộc tính cơ bản:
tên, hãng sản xuất, năm sản xuất, vận tốc tối đa 
và phương thức hienThiThongTin().
- Tạo lớp Oto và XeMay kế thừa từ PhuongTien.
- Trong lớp Oto, thêm thuộc tính số chỗ ngồi và loại nhiên liệu.
- Trong lớp XeMay, thêm thuộc tính công suất động cơ.
- Ghi đè phương thức hienThiThongTin() ở các lớp con 
để hiển thị đầy đủ thông tin của từng loại phương tiện.
- Sử dụng tính đa hình bằng cách tạo mảng kiểu PhuongTien để 
trữ các đối tượng Oto và XeMay, duyệt qua mảng để hiển thị thông 
tin của các đối tượng trong mảng.

*/
package javabaitapkethua;

abstract class PhuongTien {
    String name, brand;
    int manufature_date;
    double maxspeed;
    
    public PhuongTien (String name, String brand, int manufature_date, int maxspeed ){
        this.name = name;
        this.brand = brand;
        this.manufature_date = manufature_date;
        this.maxspeed = maxspeed;
    }
    @Override
    public String toString(){
        return "Ten: " + name +
                "\nNam san xuat: " + manufature_date +
                "\nVan toc toi da: " + maxspeed;
    }
}

class Oto extends PhuongTien {
    int seat;
    String fuel_type;
    
    public Oto (String name, String brand, int manufature_date, int maxspeed, int seat, String fuel_type){
        super(name, brand, manufature_date, maxspeed);
        this.seat = seat;
        this.fuel_type = fuel_type;
    }
    @Override
    public String toString(){
        return super.toString() + 
                "\nSo Cho Ngoi: " + seat + 
                "\nLoai nhien lieu: " + fuel_type;
    }
}

class XeMay extends PhuongTien {
    double engine_power;
    
    public XeMay(String name, String brand, int manufature_date, int maxspeed, double engine_power){
        super(name, brand, manufature_date, maxspeed);
        this.engine_power = engine_power;
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                "\nCong suat dong co: " + engine_power;
    }
}
public class QLGiaoThong {
    public static void main(String[] args) {
        PhuongTien[] dSachPhuongTien = new PhuongTien[2];
        dSachPhuongTien[0] = new Oto("Cerato", "KIA", 2023, 100, 4, "Gas Power");
        dSachPhuongTien[1] = new XeMay("Wave 110", "Honda", 2024, 110, 5);
        
        for(PhuongTien pt: dSachPhuongTien){
            System.out.println(pt.toString());
            System.out.println("==============");
        }
        
    }
}
