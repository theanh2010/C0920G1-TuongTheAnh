package session_03_OOP.bai_tap;

public class XayDungLopFan {
    final int SlOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SlOW ;
    private boolean isOn = false;
    private double radius = 3;
    private String color = "Blue";
    public XayDungLopFan (int speed , boolean isOn , double radius , String color){
        this.speed =speed;
        this.isOn = isOn;
        this.radius=radius;
        this.color =color;
    }
    public int getSlOW() {
        return SlOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
    }
    public String getSpeed(){
        String speedStr = "";
        if ( this.isOn == true) {
            if (this.speed == getSlOW()) {
                return speedStr = "SlOW";
            } else if (this.speed == getMEDIUM()) {
                return speedStr = "MEDIUM";
            } else if (this.speed == getFAST()) {
                return speedStr = "FAST";
            }
        }else {
            speedStr = "";
        }
        return speedStr;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public String isOn() {
        String status = "";
        if (isOn == true) {
            status = "Turning ON";
        } else {
            status = "Turning OFF";
        }
        return status;
    }

    @Override
    public String toString() {
        return "XayDungLopFan{" +
                "speed = " + getSpeed() +
                ", isOn = " + isOn() +
                ", radius = " + getRadius() +
                ", color = '" + getColor() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        XayDungLopFan xayDungLopFan = new XayDungLopFan(2,true,5,"red");
        System.out.println(xayDungLopFan.toString());
    }
}
