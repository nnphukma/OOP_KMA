
package javabaitapFor;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        
        float Tong = 0;
        
        for (int i = 1; i <= n; i++){
            Tong += ((float)1/giaiThua(i));
        }
        
        System.out.println("Tong S = " + Tong);
    }
    
    public static int giaiThua(int n){
        int result = 1;
        for (int i = n; i > 0; i--){
            result *=i;
        }
        return result;
    }
}
