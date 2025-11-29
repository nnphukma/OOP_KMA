package javaBaiTapWhile;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do chinh xac Eps = ");
        float eps = scanner.nextFloat();
        System.out.print("Nhap x = ");
        int x = scanner.nextInt();

        float ketqua = 0;
        int cnt = 0;
        float pt = phanTu(cnt, x);

        while (Math.abs(pt) >= eps) {
            if (cnt % 2 == 0) {
                ketqua += pt;
            } else {
                ketqua -= pt;
            }
            cnt++;
            pt = phanTu(cnt, x);
        }

        System.out.println("\nKet qua la S = " + ketqua);
    }

    public static float phanTu(int stt, int x) {
        int mu = 2 * stt + 1;
        return (float) hamMu(x, mu) / giaiThua(mu);
    }

    public static int hamMu(int n, int p) {
        int result = 1;
        while (p > 0) {
            result *= n;
            p--;
        }
        return result;
    }

    public static int giaiThua(int x) {
        int result = 1;
        while (x > 0) {
            result *= x;
            x--;
        }
        return result;
    }
}
