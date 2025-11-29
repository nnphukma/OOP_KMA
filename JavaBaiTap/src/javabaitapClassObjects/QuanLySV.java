package javabaitapClassObjects;

public class QuanLySV {
    static class SinhVien {
        
        String maSV, ten;
        float diem;
        static int soLuongSV = 0;   

        public SinhVien(String maSV, String ten, float diem) {
            this.maSV = maSV;
            this.ten = ten;
            this.diem = diem;
            soLuongSV++;     
        }
    }
    
    static class QLSinhVien {
        static final int MAX_SV = 100;
        SinhVien[] ds = new SinhVien[MAX_SV];
        int soSV = 0;

        public void themSV(SinhVien sv) {
            if (soSV < MAX_SV) {
                ds[soSV] = sv;
                soSV++;
            }
        }

        public static float tinhDiemTB(SinhVien[] ds, int soSV) {
            float tong = 0;
            for (int i = 0; i < soSV; i++) {
                tong += ds[i].diem;
            }
            return tong / soSV;
        }

        public SinhVien timSVMax() {
            int indexMax = 0;
            for (int i = 1; i < soSV; i++) {
                if (ds[i].diem > ds[indexMax].diem) {
                    indexMax = i;
                }
            }
            return ds[indexMax];
        }
    }


    public static void main(String[] args) {

        QLSinhVien ql = new QLSinhVien();

        ql.themSV(new SinhVien("SV01", "Phúc", 7.5f));
        ql.themSV(new SinhVien("SV02", "Huy", 9.0f));
        ql.themSV(new SinhVien("SV03", "Lan", 8.2f));

        System.out.println("Số sinh viên hiện có: " + SinhVien.soLuongSV);

        float diemTB = QLSinhVien.tinhDiemTB(ql.ds, ql.soSV);
        System.out.println("Điểm trung bình: " + diemTB);

        SinhVien max = ql.timSVMax();
        System.out.println("Sinh viên có điểm cao nhất: " + max.ten +
                           " - Điểm: " + max.diem);
    }
}
