
package javaBaiTapWhile;

import java.util.Scanner;


public class Bai1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua day thu nhat: ");
        int n1 = scanner.nextInt();
        int[] a = new int[n1];
        System.out.println("Nhap day thu nhat (tang dan):");
        for (int i = 0; i < n1; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        System.out.print("\nNhap so phan tu cua day thu hai: ");
        int n2 = scanner.nextInt();
        int[] b = new int[n2];
        System.out.println("Nhap day thu hai (tang dan):");
        for (int i = 0; i < n2; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = scanner.nextInt();
        }

        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < n1)
            c[k++] = a[i++];

        while (j < n2)
            c[k++] = b[j++];

        System.out.println("\nDay thu nhat:");
        inMang(a);

        System.out.println("Day thu hai:");
        inMang(b);

        System.out.println("Day sau khi tron (tang dan):");
        inMang(c);
    }

    public static void inMang(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
