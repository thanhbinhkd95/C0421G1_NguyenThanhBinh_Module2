package bai1_introduction_java.thuc_hanh_1;

import java.util.Scanner;

public class thuc_hanh_3 {
    public static void main(String[] args) {
        float withd;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        withd = scanner.nextFloat();
        System.out.println("Nhap chieu dai: ");
        height = scanner.nextFloat();
        float area = withd*height;
        System.out.println("S la: " + area + "cm2");
    }
}
