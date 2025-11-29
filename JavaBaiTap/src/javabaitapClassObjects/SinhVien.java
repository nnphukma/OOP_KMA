
package javabaitapClassObjects;

import java.util.Scanner;


public class SinhVien {
    private String maSo;
    private String hoTen;
    private double diemM1, diemM2, diemM3;
    
    public SinhVien(){
        
    }
    
    public void nhap(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap MSSV: ");
        String maSo = scanner.nextLine();
        System.out.print("Nhap hoTen SV: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem M1: ");
        double diemM1 = scanner.nextDouble();
        System.out.print("Nhap diem M2: ");
        double diemM2 = scanner.nextDouble();
        System.out.print("Nhap diem M3: ");
        double diemM3 = scanner.nextDouble();
        
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemM1 = diemM1;
        this.diemM2 = diemM2;
        this.diemM3 = diemM3;
    }
    
    public void hienthi(){
        System.out.println("Ho va ten sinh vien: " + this.hoTen);
        System.out.println("MSSV: " + this.maSo);
        System.out.println("Diem: M1: " + this.diemM1 + ", M2: " + this.diemM2 + ", M3: " + this.diemM3);
        System.out.println("Diem TB 3 mom: " + tinhDiemTrungBinh());
    }
    
    public double tinhDiemTrungBinh(){
        return (this.diemM1 + this.diemM2 + this.diemM3)/3.0;
    }
    
    public void xepLoai(){
        if (tinhDiemTrungBinh() >= 8.0){
            System.out.println("Xep loai GIOI");
        } else if (tinhDiemTrungBinh() >= 6.5){
            System.out.println("Xep loai KHA");
        } else if (tinhDiemTrungBinh() >= 5.0){
            System.out.println("Xep loai TB");
        } else {
            System.out.println("Xep loai YEU");
        }
    }
}
