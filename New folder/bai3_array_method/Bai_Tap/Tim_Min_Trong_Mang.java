package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Tim_Min_Trong_Mang {
    public static void main(String[] args) {
        Scanner inputSize = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int size = inputSize.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            Scanner inputElement = new Scanner(System.in);
            arr[i] = inputElement.nextInt();
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
