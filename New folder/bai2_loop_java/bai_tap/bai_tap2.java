package bai2_loop_java.bai_tap;

import java.util.Scanner;

public class bai_tap2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve tam giac canh tren");
            System.out.println("2. Ve tam giac canh duoi");
            System.out.println("3. Ve hinh chu nhat");
            System.out.println("4. Ve tam giac can");
            System.out.println("0. Thoat");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ve tam giac canh tren");
                    System.out.println("Nhap chieu cao: ");
                    Scanner inputcao1 = new Scanner(System.in);
                    int cao1 = inputcao1.nextInt();
                    for (int i = 0; i < cao1; i++) {
                        for (int j = cao1; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Ve tam giac canh duoi");
                    System.out.println("Nhap chieu cao: ");
                    Scanner inputcao = new Scanner(System.in);
                    int cao = inputcao.nextInt();
                    for (int i = 0; i < cao; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Ve hinh chu nhat");
                    System.out.println("Nhap chieu dai: ");
                    Scanner inputdai = new Scanner(System.in);
                    int dai = inputdai.nextInt();
                    System.out.println("Nhap chieu rong: ");
                    Scanner inputrong = new Scanner(System.in);
                    int rong = inputrong.nextInt();
                    for (int i = 0; i < dai; i++) {
                        for (int j = 0; j < rong; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Ve tam giac can");
                    System.out.println("Nhap chieu cao: ");
                    Scanner inputcaocan = new Scanner(System.in);
                    int cao2 = inputcaocan.nextInt();
                    int rong2 = 2 * cao2 - 1;
                    for (int i = 1; i <= cao2; i++) {
                        for (int j = 0 ; j < rong2/2-i+1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i*2-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
