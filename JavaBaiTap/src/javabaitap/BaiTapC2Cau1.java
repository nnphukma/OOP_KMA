package javabaitap;

import java.util.Scanner;

public class BaiTapC2Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matran = new int[2][3];
        System.out.println("Nhap cac he so");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matran[i][j] = scanner.nextInt();
            }
                
        }


        System.out.println("\nHe phuong trinh vua nhap:");
        PrintMatrix(matran);

 
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = matran[i][j];
                arr2[i][j] = matran[i][j];
            }
        }


        AugMatrix(arr1, 0); 
        AugMatrix(arr2, 1); 

      
        int det = DetMatrix(matran);
        int det1 = DetMatrix(arr1);
        int det2 = DetMatrix(arr2);

       
        if (det == 0) {
            System.out.println("He phuong trinh vo nghiem hoac vo so nghiem!");
        } else {
            float x = (float) det1 / det;
            float y = (float) det2 / det;
            System.out.println("Nghiem cua he phuong trinh la:");
            System.out.println("x = " + x + ", y = " + y);
        }
    }

   
    public static void PrintMatrix(int[][] arr) {
        System.out.println(arr[0][0] + "x + " + arr[0][1] + "y = " + arr[0][2]);
        System.out.println(arr[1][0] + "x + " + arr[1][1] + "y = " + arr[1][2]);
    }

   
    public static int DetMatrix(int[][] arr) {
        return arr[0][0] * arr[1][1] - arr[1][0] * arr[0][1];
    }

    
    public static void AugMatrix(int[][] arr, int x) {
        if (x == 0) { 
            arr[0][0] = arr[0][2];
            arr[1][0] = arr[1][2];
        }
        if (x == 1) { 
            arr[0][1] = arr[0][2];
            arr[1][1] = arr[1][2];
        }
    }
}
