package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mot_Mang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn thêm");
        int x = input.nextInt();
        Scanner inputIndex = new Scanner(System.in);
        System.out.println("Nhập vị trí muốn chèn");
        int index = inputIndex.nextInt();
        if (index <= 1 || index >= array.length) {
            System.out.println("không chèn được");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
        }
        System.out.print("Mảng sau khi thêm: ");
        for (int element : array) {
            System.out.print(element + " ");
        }


    }
}

