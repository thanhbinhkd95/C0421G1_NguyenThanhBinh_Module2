package bai6_inheritance.bai_tap.point2d3d;
import java.util.Arrays;
public class Point3D extends Point2D {
    public float z = 0.0f;
 /*   public float[] xyz = new float[3];*/
    public Point3D(){

    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
//        this.xyz= new float[]{this.x, this.y, this.z};
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
     return new float[]{this.x, this.y, this.z};

    }

  /*  public void setXyz(float[] xyz) {
        this.xyz = new float[]{x, y, z};
    }*/


    @Override
    public String toString() {
        return "Point3D{" +
                " x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", xyz=" + Arrays.toString(getXyz()) +
                '}';
    }


        public static void main(String[] args) {
            Point3D point3D = new Point3D();
            System.out.println(point3D);
            Point3D point3D1 = new Point3D(2,3,4);
            point3D1.getXyz();
            System.out.println(point3D1);
    }
}
