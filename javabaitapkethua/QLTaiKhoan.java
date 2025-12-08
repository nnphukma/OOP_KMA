
package javabaitapkethua;

abstract class TaiKhoan {
    //soTaiKhoan (String), tenChuTaiKhoan (String), soDu (double).
    String soTaiKhoan, tenChuTaiKhoan;
    double soDu;
    //Tạo các phương thức: napTien(double soTien), rutTien(double soTien),
    //và kiemTraSoDu(). Phương thức rutTien cần kiểm tra xem số dư có đủ không.

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }
    
    public void napTien(double soTien){
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("So Du +" + soTien + ", TKG: " + soDu );
        } else System.out.println("So tien nap vao khong hop le");
    }
    public void rutTien(double soTien){
        if (soTien > 0 && soTien <= soDu){
            soDu -= soTien;
            System.out.println("So tien da duoc rut: -" + soTien);
            kiemTraSoDu();
        }
    }
    public void kiemTraSoDu(){
        System.out.println("So du con lai: " + this.soDu);
    }

}

/*
- Tạo lớp TaiKhoanTietKiem kế thừa từ TaiKhoan,
thêm thuộc tính laiSuat (double) và phương thức tinhLai().
- Tạo lớp TaiKhoanVay cũng kế thừa từ TaiKhoan,
thêm thuộc tính hanMucVay (double). Ghi đè phương thức rutTien để
cho phép rút tiền vượt quá số dư nhưng không vượt quá hạn mức vay.

*/

class TaiKhoanTietKiem extends TaiKhoan {
    double laiSuat;

    public TaiKhoanTietKiem(double laiSuat, String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.laiSuat = laiSuat;
    }
     
     
    public double tinhLai(){
         return soDu*laiSuat;
     }
}
class TaiKhoanVay extends TaiKhoan {
    double hanMucVay;

    public TaiKhoanVay(double hanMucVay, String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        super(soTaiKhoan, tenChuTaiKhoan, soDu);
        this.hanMucVay = hanMucVay;
    }
    @Override
    public void rutTien(double soTien){
        if (soTien > 0 && soTien <= (hanMucVay+soDu)){
            double temp = soDu - soTien;
            soDu -= soTien;
            if (temp < 0){
                hanMucVay += temp;
                soDu = 0;
            }
            
            System.out.println("So tien da duoc rut: -" + soTien);
            kiemTraSoDu();
        }
    }
    @Override
    public void kiemTraSoDu(){
        System.out.println("So du con lai: " + soDu);
        System.out.println("Han Muc Vay: " + hanMucVay);
    }
}
public class QLTaiKhoan {
    public static void main(String[] args) {
        System.out.println("=== KIEM TRA TAI KHOAN TIET KIEM ===");

        TaiKhoanTietKiem tktk = new TaiKhoanTietKiem(
                0.05,                 
                "123456",             
                "Nguyen Van A",       
                1000000               
        );

        tktk.kiemTraSoDu();
        tktk.napTien(500000);
        tktk.rutTien(300000);

        System.out.println("Tien lai nhan duoc: " + tktk.tinhLai() +"/nam");
        System.out.println();
        
        
        System.out.println("=== KIEM TRA TAI KHOAN VAY ===");
        TaiKhoanVay tkv = new TaiKhoanVay(
                2000000,             
                "987654",            
                "Tran Thi B",        
                500000           
        );

        tkv.kiemTraSoDu();
        tkv.rutTien(700000);  // rút vượt số dư nhưng trong hạn mức vay
        tkv.rutTien(1500000); // rút tiếp
        tkv.napTien(300000);
        tkv.kiemTraSoDu();
    }
}
