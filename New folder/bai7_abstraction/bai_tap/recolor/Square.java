package bai7_abstraction.bai_tap.recolor;

public class Square extends bai7_abstraction.bai_tap.resize.Square implements Recolor {
    public Square(double size, String color, boolean filled) {
        super(size, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");

    }
}
