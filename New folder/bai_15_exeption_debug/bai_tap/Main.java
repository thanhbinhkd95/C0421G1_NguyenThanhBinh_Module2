package bai_15_exeption_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        do {
            try {
                System.out.print("Nhập cạnh a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập cạnh c: ");
                double c = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a , b , c);
                System.out.println(triangle.toString());
                check = false;
            }

            catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                check = true;
            }
            catch (NumberFormatException e){
                System.err.println(e.getMessage());
                check = true;
            }
        }
        while (check);
    }
}

