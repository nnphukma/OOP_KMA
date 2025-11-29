
package javacoban;

import java.util.Scanner;


public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m = ");
        int m = scanner.nextInt();
        System.out.println("Nhap n = ");
        int  n = scanner.nextInt();
        
        Calculator cal = new Calculator();
        System.out.println("Tong n + m = " + cal.add(n, m));
    }
}
