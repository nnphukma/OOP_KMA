
package javabaitap;

import java.util.Scanner;


public class BatTapC2Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen bat ki: ");
        int n = scanner.nextInt();
        System.out.print("\nCac uoc cung cua " + n + " la: ");

        for (int i = n; i > 0; i--){
            if (n % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
