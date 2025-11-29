
package javabaitapkethua;

abstract class HinhHoc {
    String tenHinh;
    double chuVi, dienTich;

    HinhHoc(String tenHinh) {
        this.tenHinh = tenHinh;
    }
    
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    
}

class HinhTron extends HinhHoc {
    double radius;
    HinhTron(String tenHinh, double radius) {
        super(tenHinh);
        this.radius = radius;
    }
    // Triển khai phương thức trừu tượng
    @Override
    public double tinhDienTich() {
        return Math.PI * radius * radius;
    }
    @Override
    public double tinhChuVi(){
        return Math.PI*2*radius;
    }
}

class HinhChuNhat extends HinhHoc {
    double width, height;
    HinhChuNhat(String tenHinh, double width, double height) {
        super(tenHinh);
        this.width = width;
        this.height = height;
    }
    // Triển khai phương thức trừu tượng
    @Override
    public double tinhDienTich() {
        return width * height;
    }
    @Override
    public double tinhChuVi(){
        return 2*width + 2*height;
    }
}

class HinhTamGiac extends HinhHoc {
    double canh1, canh2, canh3;

    public HinhTamGiac(String tenHinh, double canh1, double canh2, double canh3) {
        super(tenHinh);
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    @Override
    public double tinhDienTich() {
        double p = tinhChuVi()/2;
        return Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
    }
    @Override
    public double tinhChuVi(){
        return canh1 + canh2+ canh3;
    }
    
}

public class QLHinhHoc {
    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron("Tron ", 5.0);
        System.out.println("Chu vi hinh tron: " + hinhtron.tinhChuVi());
        System.out.println("Dien tich hinh tron la: " + hinhtron.tinhDienTich());
        
        HinhChuNhat hcn = new HinhChuNhat("Chu nhat ", 2, 4);
        System.out.println("Chu vi hinh Chu nhat la: " + hcn.tinhChuVi());
        System.out.println("Dien tich Chu nhat la: " + hcn.tinhDienTich());
        
        HinhTamGiac htg = new HinhTamGiac("Tam giac ", 3, 4, 5);
        System.out.println("Chu vi hinh Tam giac la: " + htg.tinhChuVi());
        System.out.println("Dien tich Tam giac la: " + htg.tinhDienTich());
    }
}
