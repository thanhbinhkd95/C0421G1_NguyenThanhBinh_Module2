package bai_15_exeption_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private double a;
    double b;
    double c;

    public Triangle(double a , double b , double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Không phải là tam giác vì có cạnh nhỏ hơn 0");
        } else if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Không phải tam giác vì tổng 2 cạnh nhỏ hơn 1 cạnh");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;

        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}



