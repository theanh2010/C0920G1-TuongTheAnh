package session_05_ke_thua.bai_tap.point2d;

import java.util.Arrays;

public class Point2D {
    private float[] XY =new float[2];
    private float x ;
    private float y ;
    public Point2D(){}
    public Point2D(float x , float y){
        this.x = x;
        this.y = y;
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
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        XY[0] = x;
        XY[1] = y;
        return XY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "XY=" + Arrays.toString(getXY()) +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
