
package javabaitapClassObjects;
import javabaitapClassObjects.SinhVien;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Class PhanSo
        
        */
        PhanSo ps1 = new PhanSo();
        System.out.print("Nhap tu so: ");
        int tu = scanner.nextInt();
        ps1.setTu(tu);
        System.out.print("Nhap mau so: ");
        int mau = scanner.nextInt();
        while(mau == 0){
            System.out.println("Mau So khong hop le vui long nhap lai");
            System.out.print("Nhap lau mau so: ");
            mau = scanner.nextInt();
        }
        ps1.setMau(mau);
        ps1.printlnPhanSo();
        PhanSo ps2 = new PhanSo(1, 2);
        // cong
        PhanSo cong = ps1.congPhanSo(ps2);
        ps1.hienThiKQ(ps2, "+");
        cong.printlnPhanSo();
        //chia
        PhanSo tru = ps1.truPhanSo(ps2);
        ps1.hienThiKQ(ps2, "-");
        tru.printlnPhanSo();
        // nhan
        PhanSo nhan = ps1.nhanPhanSo(ps2);
        ps1.hienThiKQ(ps2, "*");
        nhan.printlnPhanSo();
        PhanSo chia = ps1.chiaPhanSo(ps2);
        ps1.hienThiKQ(ps2, "/");
        chia.printlnPhanSo();
        /* Class Sinh vien
        SinhVien sv = new SinhVien();
        sv.nhap();
        sv.hienthi();
        sv.xepLoai();
        */
        
    }
}
