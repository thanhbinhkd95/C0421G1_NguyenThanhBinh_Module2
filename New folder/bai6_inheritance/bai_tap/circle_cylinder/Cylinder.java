package bai6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 2;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
        Cylinder cylinder1 = new Cylinder(3, 4, "yellow");
        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(6);
        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());

    }
}
