package session_03_OOP.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    double a ;
    double b ;
    double c ;
    public PhuongTrinhBac2(){
    }
    public PhuongTrinhBac2(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        double delta;
        return  delta = this.b * 2 - 4 *this.a*this.c;
    }
    public double getNghiem1(){
        double nghiem1;
        return nghiem1 = (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c))/2*this.a;
    }
    public double getNghiem2(){
        double nghiem2;
        return nghiem2 = (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c))/2*this.a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        double a =input.nextDouble();
        System.out.println("nhap b");
        double b = input.nextDouble();
        System.out.println("nhap c");
        double c = input.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a,b,c);
        double delta = phuongTrinhBac2.getDelta();
        if (delta > 0){
            System.out.println("phương trình có 2 nghiệm "+ phuongTrinhBac2.getNghiem1() + " "+phuongTrinhBac2.getNghiem2());
        }else if ( delta == 0){
            System.out.println("phương trình có 1 nghiệm " + phuongTrinhBac2.getNghiem1());
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
