package bai4_class_oop_java.Bai_Tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int getSpeed() {
        return this.speed;
    }
    private void setSpeed(int speed){
        this.speed = speed;
    }
    private boolean isOn(){
        return this.on;
    }
    private void setOn(boolean on){
        this.on = on;
    }
    private double getRadius(){
        return radius;
    }
    private void setRadius(double radius){
        this.radius = radius;
    }
    private String getColor(){
        return this.color;
    }
    private void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        if(this.on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + "fan is on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        else {
            return "Fan{" +
                    "on=" + "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow" );
        System.out.println("fan1: "+fan1.toString());
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("fan2: "+fan2.toString());
    }
}
