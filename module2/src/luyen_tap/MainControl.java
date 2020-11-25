package luyen_tap;

import java.util.Scanner;

public class MainControl {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {showMenu();}
    public static void showMenu() {
        System.out.println("------------Menu-------------");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách sản phẩm");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Chỉnh sửa");
        System.out.println("6.Thoát");
        System.out.println("Chọn chức năng");
        boolean exit = false;
        while (true) {
            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    deleteProduct();
                    break;
                case "3":
                    showProduct();
                    break;
                case "4":
                    searchProduct();
                    break;
                case "5" :
                    editProduct();
                case "6":
                    exit = true;
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

    public static void addProduct() {
        System.out.println("1. them xuất khẩu");
        System.out.println("2. thêm nhập khẩu");
        System.out.println("3. exit");
        ManagerProduct productManager = new ManagerProduct();
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    ManagerProduct.addXuatKhau();
                    break;
                case "2":
                    ManagerProduct.addNhapKhau();
                case "3":
                    showMenu();
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit) {
                break;
            }
            addProduct();
        }
    }

    public static void deleteProduct() {
        System.out.println("1. xóa xuất khẩu");
        System.out.println("2. xóa nhập khẩu");
        System.out.println("3. exit");
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    ManagerProduct.deleteXuatKhau();
                    break;
                case "2":
                    ManagerProduct.deleteNhapKhau();
                    break;
                case "3":
                    showMenu();
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit) {
                break;
            }
            deleteProduct();
        }
    }
    public static void showProduct(){
        System.out.println("1. xem xuất khẩu");
        System.out.println("2. xem nhập khẩu");
        System.out.println("3. exit");
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    ManagerProduct.showXuatKhau();
                    break;
                case "2":
                    ManagerProduct.showNhapkhau();
                    break;
                case "3":
                    showMenu();
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit) {
                break;
            }
            showProduct();
        }
    }
    public static void searchProduct(){
        System.out.println("1. xem xuất khẩu");
        System.out.println("2. xem nhập khẩu");
        System.out.println("3. exit");
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    ManagerProduct.searchXuatKhau();
                    break;
                case "2":
                    ManagerProduct.searchNhapKhau();
                    break;
                case "3":
                    showMenu();
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit) {
                break;
            }
            searchProduct();
        }
    }
    public static void editProduct(){
        System.out.println("1. sửa xuất khẩu");
        System.out.println("2. sửa nhập khẩu");
        System.out.println("3. exit");
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    ManagerProduct.editXuatKhau();
                    break;
                case "2":
                    ManagerProduct.editNhapKhau();
                    break;
                case "3":
                    showMenu();
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit) {
                break;
            }
            searchProduct();
        }
    }
}

