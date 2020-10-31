package session_05_ke_thua.bai_tap.point2d;

public class Point3D extends Point2D {
   private float z ;
   public Point3D(){}
   public Point3D(float z){
       this.z = z;
   }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void getXYZ(float x , float y , float z ){
       this.z = z ;
       this.setXY(x,y);
    }
    public float [] getXYZ(){
       return new float[]{super.getX(),super.getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
