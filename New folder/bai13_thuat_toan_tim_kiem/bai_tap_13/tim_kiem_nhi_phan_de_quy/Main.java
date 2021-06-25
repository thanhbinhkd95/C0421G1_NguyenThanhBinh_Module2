package bai13_thuat_toan_tim_kiem.bai_tap_13.tim_kiem_nhi_phan_de_quy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    static int binarySearch(int[] array, int left, int right, int value) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If found at mid, then return it
            if (array[mid] == value)
                return mid;

            // Search the left half
            if (array[mid] > value)
                return binarySearch(array,left, mid-1, value);

            // Search the right half
            return binarySearch(array, mid+1, right, value);
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sắp xếp dãy số theo thứ tự tăng dần
        sortASC(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
        System.out.println("Nhập giá trị cần tìm");
        int value = scanner.nextInt();
        int result = binarySearch(arr,0,n-1,value);
        if(result==-1){
            System.out.println("not found");
        }else {
            System.out.println("found at index: "+result);
        }
    }

}
