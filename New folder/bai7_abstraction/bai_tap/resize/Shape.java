package bai7_abstraction.bai_tap.resize;


/*Tạo abs class Shape triển khai interface Resize*/
public abstract class Shape implements Resize {
    private String color = "green";
    private boolean filled = true;


    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(double size, String color, boolean filled) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void printShape(Shape[] shape) {
        for (Shape x : shape) {
            System.out.println(x.toString());
        }
    }
}
/*Tạo class Circle kế thừa từ Abs class Shape*/

/*Tạo class Rectangle kế thừa từ Abs class Shape*/

/*Tạo class Square kế thừa từ Abs class Shape*/

/*}*/
