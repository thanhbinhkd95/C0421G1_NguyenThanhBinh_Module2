package bai7_abstraction.bai_tap.resize;

public class ResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2, "yellow", false);
        shapes[1] = new Rectangle(4, 3, "infinity", true);
        shapes[2] = new Square(5);
        for (Shape a : shapes) {
            System.out.println(a);
        }
        System.out.println("Sau khi resizeable: ");
        for (Shape a : shapes) {
//            a.resize(100);
            a.resize(Math.random() * 100);
        }
        for (Shape a : shapes) {
            System.out.println(a);
        }
    }
}
