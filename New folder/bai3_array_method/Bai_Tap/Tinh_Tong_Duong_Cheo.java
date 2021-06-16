package bai3_array_method.Bai_Tap;

import java.util.Scanner;

public class Tinh_Tong_Duong_Cheo {
    public static void main(String[] args) {
        Scanner inputDong = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int dong = inputDong.nextInt();

        int matrix[][] = new int[dong][dong];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Nhập phần tử thứ " + row + " " + column);
                Scanner input = new Scanner(System.in);
                matrix[row][column] = input.nextInt();
            }
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử đường chéo là: " + sum);
    }
}
