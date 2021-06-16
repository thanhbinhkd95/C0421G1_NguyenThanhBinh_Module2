package bai7_abstraction.bai_tap.recolor;

import bai7_abstraction.bai_tap.resize.Circle;
import bai7_abstraction.bai_tap.resize.Rectangle;
import bai7_abstraction.bai_tap.resize.Shape;
import bai7_abstraction.bai_tap.resize.Square;

public class RecolorTest {
        public static void main(String[] args) {
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(2, "yellow", false);
            shapes[1] = new Rectangle(4, 3, "infinity", true);
            shapes[2] = new Square(5, "melinda", true);
            for (Shape a : shapes){
                System.out.println(a);

                if (a instanceof Recolor) {
                    Recolor colorable = (Recolor) a;
                    colorable.howToColor();
                }
            }
        }
}
