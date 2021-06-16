package bai6_inheritance.bai_tap.point_movable;
import java.util.Arrays;

public class Point {
    float x = 0.0f;
    float y = 0.0f;
    float[] xy = {x,y};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        xy = new float[]{this.x, this.y};
        return xy;
    }

    public void setXy(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(4,5);
        point1.getXy();
        System.out.println(point1);
    }
}
