package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        /*Tạo mảng*/
        int[] array = {100, 43, 16, 27, 8, 6, 7, 11, 22, 33};
        System.out.println("Mảng trước khi xóa");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        ;
        System.out.println();

        /*Tạo lớp Scanner nhập xuất dữ liệu*/
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn xóa");
        /*Quét mảng, nhập phần tử muốn xóa có giá trị = x*/
        int x = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = array[i + 1];
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        System.out.println("Mảng sau khi xóa");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
