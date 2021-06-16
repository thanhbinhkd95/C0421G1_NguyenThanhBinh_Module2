package bai6_inheritance.bai_tap.point_movable;
import java.util.Arrays;
public class MovablePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;
/*    public float[] Speed = new float[2];*/
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
      return new float[]{this.xSpeed, this.ySpeed};

    }

   /* public void setSpeed(float[] speed) {
        Speed = speed;
    }*/
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "Speed=" + Arrays.toString(getSpeed()) +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(3,4);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2= new MovablePoint(5,6,10,20);
        movablePoint2.getSpeed();
        movablePoint2.move();
        System.out.println(movablePoint2);
    }
}
