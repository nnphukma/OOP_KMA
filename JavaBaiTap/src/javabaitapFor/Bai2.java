
package javabaitapFor;

import java.util.Scanner;


public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so phan tu trong day can nhap n = ");
        int n = scanner.nextInt();
        
        int []arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + " = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Day so vua nhap la: ");
        printArray(arr);
        
        heapSort(arr);
        
        System.out.println("Day so sau khi HeapSort la: ");
        printArray(arr);
        
    }
    
    // Hàm heapify để duy trì tính chất của heap
    static void heapify(int arr[], int n, int i) {
        int largest = i;        // Gốc
        int left = 2 * i + 1;   // Con trái
        int right = 2 * i + 2;  // Con phải

        // Nếu con trái lớn hơn gốc
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Nếu con phải lớn hơn gốc hiện tại
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Nếu largest không phải là gốc
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Đệ quy heapify lại cây con bị ảnh hưởng
            heapify(arr, n, largest);
        }
    }

    // Thuật toán Heap Sort
    static void heapSort(int arr[]) {
        int n = arr.length;

        // Xây dựng max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Trích xuất từng phần tử khỏi heap
        for (int i = n - 1; i > 0; i--) {
            // Hoán đổi phần tử đầu (lớn nhất) với phần tử cuối
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Gọi heapify cho phần còn lại
            heapify(arr, i, 0);
        }
    }

    // Hàm in mảng
    static void printArray(int arr[]) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
