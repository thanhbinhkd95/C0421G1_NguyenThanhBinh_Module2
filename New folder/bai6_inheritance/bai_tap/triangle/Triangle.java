package bai6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        double s = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return s;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                ", Area= " + this.getArea() +
                ", Perimeter= " + this.getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        double a,b,c;
        String d;
        System.out.println("Nhập màu sắc: ");
        Scanner color = new Scanner(System.in);
        d = color.nextLine();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào các cạnh của tam giác");
            System.out.println("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            c = scanner.nextDouble();
        }
        while (a + b <= c || a + c <= b || b + c <= a);
        Triangle triangle2 = new Triangle(d, a, b, c);
        System.out.println(triangle2);
    }
}
