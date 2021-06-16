package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử mảng 1");
        Scanner input1 = new Scanner(System.in);
        int length1 = input1.nextInt();

        System.out.println("Nhập số lượng phần tử mảng 2");
        Scanner input2 = new Scanner(System.in);
        int length2 = input2.nextInt();

        int arr1[] = new int[length1];
        int arr2[] = new int[length2];
        int arr3[] = new int[arr1.length + arr2.length];

        System.out.println("Nhập các phần tử mảng 1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 1");
            Scanner input = new Scanner(System.in);
            arr1[i] = input.nextInt();
        }

        System.out.println("Nhập các phần tử mảng 2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng 2");
            Scanner input = new Scanner(System.in);
            arr2[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr2.length; i < arr3.length; i++) {
            arr3[i] = arr2[i - arr2.length];
        }
        System.out.print("Mảng 3 là: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
