package thi_module2;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {
        System.out.println("------------Menu-------------");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Chỉnh sửa");
        System.out.println("6.Thoát");
        System.out.println("Chọn chức năng : ");
        boolean exit = false;
        while (true) {
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    add();
                    break;
                case "2":
                    delete();
                    break;
                case "3":
//                    show();
                    break;
                case "4":
//                    search();
                    break;
                case "5":
                    edit();
                case "6":
                    System.exit(6);
                    break;
                default:
                    System.out.println("nhập lại");
                    break;
            }
            if (exit) {
                break;
            }
            showMenu();
        }
    }
    public static void add(){
        System.out.println("1.Thêm ");
        System.out.println("2.Thêm ");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        boolean exit = false;
        while (true){
            String choose = input.nextLine();
            switch (choose) {
                case "1" :
                    Manager.add1();
                    break;
                case "2" :
                    Manager.add2();
                    break;
                case "3 ":
                    exit = true;
                    break;
                case "4":
                    System.exit(4);
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
    public static void delete(){
        System.out.println("1.Xóa ");
        System.out.println("2.Xóa ");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        boolean exit = false;
        while (true){
            String choose = input.nextLine();
            switch (choose) {
                case "1" :
                    Manager.delete1();
                    break;
                case "2" :
                    Manager.delete2();
                    break;
                case "3 ":
                    exit = true;
                    break;
                case "4":
                    System.exit(4);
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
    public static void edit(){
        System.out.println("1.Sửa ");
        System.out.println("2.Sửa ");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        boolean exit = false;
        while (true){
            String choose = input.nextLine();
            switch (choose) {
                case "1" :
                    Manager.edit1();
                    break;
                case "2" :
                    Manager.edit2();
                    break;
                case "3 ":
                    exit = true;
                    break;
                case "4":
                    System.exit(4);
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
    public static void search(){
        System.out.println("1.Tìm kiếm ");
        System.out.println("2.Tìm kiếm ");
        System.out.println("3.Quay lại");
        System.out.println("4.Thoát");
        boolean exit = false;
        while (true){
            String choose = input.nextLine();
            switch (choose) {
                case "1" :
                    Manager.search1();
                    break;
                case "2" :
                    Manager.search2();
                    break;
                case "3 ":
                    exit = true;
                    break;
                case "4":
                    System.exit(4);
                    break;
                default:
                    System.out.println("Nhập lại");
            }
            if (exit){
                break;
            }
            showMenu();
        }
    }
}

