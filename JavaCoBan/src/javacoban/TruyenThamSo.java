
package javacoban;


class NhanVien {
    String hoTen;
    int tuoi;

    public NhanVien(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
}

public class TruyenThamSo {

    public static void capNhatNhanVien(NhanVien nv, int tangTuoi) {

        nv.tuoi += tangTuoi;   // thay đổi vào object thật – tham chiếu
        System.out.println("Tuổi mới trong phương thức: " + nv.tuoi);

        tangTuoi += 5;         // chỉ thay đổi bản sao – tham trị
        System.out.println("tangTuoi trong phương thức: " + tangTuoi);
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Phúc", 25);
        int soTuoiTang = 2;

        capNhatNhanVien(nv1, soTuoiTang);

        System.out.println("Tuổi NV1 sau phương thức: " + nv1.tuoi);
        System.out.println("soTuoiTang bên ngoài phương thức: " + soTuoiTang);
    }
}
