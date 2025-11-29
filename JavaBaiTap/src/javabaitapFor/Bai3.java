
package javabaitapFor;

import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bac cao nhat cua phuong trinh: n  = ");
        int n = scanner.nextInt();
        System.out.println("Nhap cac he so cua phuong trinh ");
        int []a = new int[n+1];
        for (int i = n; i >= 0; i--){
            System.out.print("a_" + i + " = ");
            a[i] = scanner.nextInt();
        }
        
        System.out.println("Phuong trinh vua nhap la: ");
        for (int i = n; i >= 0; i--){
            if (a[i] == 0){
                continue;
            }
           
            if ((a[i] != 1) && (a[i] != -1)){
                if ( i == n){
                    System.out.print(a[i] + "x" + i + " ");
                } 
                else if ( (i > 1) && (i != n)){
                    heSo(a[i]); System.out.print("x" + i + " ");
                } 
                else if ( i == 1){
                    heSo(a[i]); System.out.print("x ");
                }
                else if ( i == 0){
                    heSo(a[i]);
                }
            } else if (a[i] == 1){ 
                if ( i == n){
                    System.out.print("x" + i + " ");
                } 
                else if ( (i > 1) && (i != n)){
                    System.out.print("+ x" + i + " ");
                } 
                else if ( i == 1){
                    System.out.print("+ x ");
                }
                else if ( i == 0){
                    heSo(a[i]);
                }
            } else if (a[i] == -1){
                if ( i == n){
                    System.out.print("-x" + i + " ");
                } 
                else if ( (i > 1) && (i != n)){
                    System.out.print("- x" + i + " ");
                } 
                else if ( i == 1){
                    System.out.print("- x ");
                }
                else if ( i == 0){
                    System.out.println(a[i]);
                }
            }
            
            
        }
        System.out.println("");
        System.out.print("Nhap gia tri x = ");
        int x = scanner.nextInt();
        int tong = 0;
        for (int i = n; i >= 0; i--){
            tong += a[i]*hamLuyThua(x, i);
        }
        System.out.println("\n Tong cua da thuc la S = " + tong);
        
    }
    
    public static void heSo(int n){
        if (n > 0){
            System.out.print("+ " + n);
        } else{
            System.out.print("- " + (-1*n));
        }
    }
    
    public static int hamLuyThua(int x, int p){
        int result = 1;
        for (int i = 1; i <= p; i++){
            result *= x;
        }
        return result;
    }
}
