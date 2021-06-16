package bai4_class_oop_java.Bai_Tap;

import java.util.Scanner;

public class QuadraticEquation {private double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double geta() {
        return this.a;
    }

    private double getb() {
        return this.b;
    }

    private double getc() {
        return this.c;
    }

    private double getDiscriminant() {
        double delta = Math.pow(this.b,2) - 4 * this.a * this.c;
        return delta;
    }
    private double getRoot1(){
        if (this.getDiscriminant()>=0){
            double root1 = (-this.b+Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/(2*this.a);
            return root1;
        }else  {
            return 0;
        }
    }
    private double getRoot2(){
        if (this.getDiscriminant()>=0){
            double root2 = (-this.b-Math.pow(Math.pow(this.b,2)-4*this.a*this.c,0.5))/(2*this.a);
            return root2;
        }else  {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("The quadratic equation 2 ax^2+bx+c=0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();
        System.out.println("a,b,c are: "+a+" "+b+" "+c);
        System.out.println("Equation: "+a+"x^2 + "+b+"x + "+c+" = 0");
        QuadraticEquation QuadraticEquation1 = new QuadraticEquation(a,b,c);
        if(QuadraticEquation1.getDiscriminant()>0){
            System.out.println("Equation has 2 solutions :");
            System.out.println("x1 = "+ QuadraticEquation1.getRoot1());
            System.out.println("x2 = "+ QuadraticEquation1.getRoot2());
        }else if(QuadraticEquation1.getDiscriminant()==0){
            System.out.println("Equation has 1 double solution p:");
            System.out.println("x1 = x2 = "+ QuadraticEquation1.getRoot1());
        }else {
            System.out.println("The equation has no solution");
        }

    }
}
