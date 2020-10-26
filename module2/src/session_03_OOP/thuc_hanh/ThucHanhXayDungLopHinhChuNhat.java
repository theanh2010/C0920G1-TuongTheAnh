package session_03_OOP.thuc_hanh;

import java.util.Scanner;

public class ThucHanhXayDungLopHinhChuNhat {
    public static class HinhChuNhat {
        double dai;
        double rong;
        public HinhChuNhat(){
        }
        public HinhChuNhat(double dai , double rong ){
            this.dai = dai;
            this.rong = rong;
        }
        public double getChuvi(){
            return (this.dai + this.rong)*2;
        }
        public double getDientich(){
            return this.dai * this.rong;
        }
        public String display(){
            return "HinhChuNhat{" + "dai = " + dai + ", rong = " +rong+"}";
        }
        public static class ChuNhat{
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhap chieu rong");
                double rong =input.nextDouble();
                System.out.println("Nhap chieu dai");
                double dai = input.nextDouble();
                HinhChuNhat hinhChuNhat =new HinhChuNhat(rong,dai);
                System.out.println(hinhChuNhat.display());
                System.out.println("chu vi" + hinhChuNhat.getChuvi());
                System.out.println("dien tich" + hinhChuNhat.getDientich());
            }
        }
    }
}
