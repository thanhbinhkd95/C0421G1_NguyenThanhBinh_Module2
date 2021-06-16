package bai5_accessmodifiler_staticmethod_property.bai_tap;

public class Bai1 {
    public class Circle {
        private double radius = 1;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return Math.PI * this.radius * this.radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}


