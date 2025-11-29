
package javacoban;

import java.util.Scanner;


public class NhapInMaTran {
    public static void main(String[] args) {
        int n, m, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: "); n = sc.nextInt();
        System.out.print("Nhập số cột của ma trận: "); m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Nhập các phần tử của ma trận A:");
        for (i = 0; i < n; i++) 
            for (j = 0; j < m; j++) {
                System.out.print("a" + "[" + i + "] = ") ;
                a[i][j] = sc.nextInt();}
        System.out.println("Ma trận A vừa nhập là:");
        for (i = 0; i < n; i++) { 
            for (j = 0; j < m; j++) 
                System.out.print(a[i][j] + "  ");
            System.out.println();
        }
        System.out.println("In bang for each");
        // In bang for each: 
        for (int[] row : a) { // duyệt từng hàng
            for (int pt : row)  // duyệt từng phần tử trong hàng
                System.out.print(pt + "  ");
            System.out.println();
        }

    }
}
