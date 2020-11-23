package Product;

import java.util.Scanner;

public class MainController {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = input.nextLine();
        boolean exit = false;
        showMenu();
        while (true) {
            switch (choose) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    deleteProduct();
                    break;
                case "3":
//                    showProduct();
                    break;
                case "4":
//                    searchProduct();
                    break;
                case "5":
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

    public static void showMenu() {
        System.out.println("------------Menu-------------");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách sản phẩm");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Thoát");
        System.out.println("Chọn chức năng");
    }

    public static void addProduct() {
        System.out.println("1. them xuất khẩu");
        System.out.println("2. thêm nhập khẩu");
        System.out.println("3. exit");
        ProductManager productManager = new ProductManager();
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    productManager.addXuatKhau();
                    break;
                case "2":
                    productManager.addNhapKhau();
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit){
                break;
            }
            addProduct();
        }
    }
    public static void deleteProduct() {
        System.out.println("1. xóa xuất khẩu");
        System.out.println("2. xóa nhập khẩu");
        System.out.println("3. exit");
        ProductManager productManager = new ProductManager();
        String choose = input.nextLine();
        boolean exit = false;
        while (true) {
            switch (choose) {
                case "1":
                    productManager.deleteXuatKhau();
                    break;
                case "2":
                    productManager.deleteNhapKhau();
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("nhap lại");
                    break;

            }
            if (exit){
                break;
            }
            deleteProduct();
        }
    }
}