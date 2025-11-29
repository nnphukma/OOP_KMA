
package javabaitap;

import java.util.Scanner;


public class BaiTapC2Cau4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int  n;
        do {
            System.out.print("Nhap so nguyen duong < 1000: ");
            n = scanner.nextInt();
            if (n >= 1000 || n < 0) {
                System.out.println("Nhap sai roi :((( Nho hon 1000 ma. Nhap lai di bro :3");
            }
        } while (n >= 1000 || n < 0);
        
        int temp = n;
        int count = 0;
        if (temp == 0) count = 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        
        int[] arr = new int[count];
        int  soBanDau = n;
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        System.out.println(arr.length);
        
        System.out.print("VietSub so " + soBanDau + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 3) {
                if (i == 0) {
                    beTapDem(arr[i]);
                    System.out.print("Tram ");
                } else if (i == 1) {
                    beTapDem(arr[i]);
                    System.out.print("Muoi ");
                } else {
                    beTapDem(arr[i]);
                }
            } else if (arr.length == 2) {
                if (i == 0) {
                    
                    System.out.print("Muoi ");
                } else {
                    beTapDem(arr[i]);
                }
            } else {
                beTapDem(arr[i]);
            }
        
        }
    }
    public static void beTapDem(int n){
        switch (n) {
            case 1: System.out.print("Mot "); break;
            case 2: System.out.print("Hai "); break;
            case 3: System.out.print("Ba "); break;
            case 4: System.out.print("Bon "); break;
            case 5: System.out.print("Nam "); break;
            case 6: System.out.print("Sau "); break;
            case 7: System.out.print("Bay "); break;
            case 8: System.out.print("Tam "); break;
            case 9: System.out.print("Chin "); break;
            default: System.out.print("Khong");break;
                
        }
    }
    
}
