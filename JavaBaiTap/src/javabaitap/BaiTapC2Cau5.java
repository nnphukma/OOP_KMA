
package javabaitap;

import java.util.Scanner;


public class BaiTapC2Cau5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mon, year;
        do {            
            System.err.print("Nhap vao hai so la ngay va thang: ");
            mon = scanner.nextInt();
            year = scanner.nextInt();
            
            if (mon < 1 || year < 1 || mon > 12 ){
                System.out.println("Nhap sai thang hoac nam r bro :(( Nhap lai di !!!");
            }
        } while (mon < 1 || year < 1 || mon > 12 );
        
        
        switch (mon) {
            case 1,3,5,7,8,10,12: System.out.print("Thang " + mon + " nam " + year + " co 31 ngay"); break;
            case 4,6,9,11: System.out.print("Thang " + mon + " nam " + year + " co 30 ngay"); break;
                
            default: System.out.print("Thang " + mon + " nam " + year + " co 28 ngay"); break;
        }
    }
}
