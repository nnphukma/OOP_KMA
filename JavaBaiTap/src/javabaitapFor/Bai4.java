
package javabaitapFor;
import java.util.Scanner;


public class Bai4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();

        int[][] a = new int[n][n];

        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right && value <= n * n; i++)
                a[top][i] = value++;
            top++;

            for (int i = top; i <= bottom && value <= n * n; i++)
                a[i][right] = value++;
            right--;

            for (int i = right; i >= left && value <= n * n; i--)
                a[bottom][i] = value++;
            bottom--;

            for (int i = bottom; i >= top && value <= n * n; i--)
                a[i][left] = value++;
            left++;
        }

        System.out.println("\nMa tran xoan oc la:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }
}
