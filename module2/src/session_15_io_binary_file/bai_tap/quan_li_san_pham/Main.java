package session_15_io_binary_file.bai_tap.quan_li_san_pham;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String choose = null;
        boolean isExit = false;
        int productId = 0;
        String productName ;
        ProductManager productManager = new ProductManager();
//SHOW MENU
        showMenu();
        while (true) {
            choose = input.nextLine();
            switch (choose){
                case "1" :
                    productManager.add();
                    break;
                case "2" :
                    productId = productManager.inputId();
                    productManager.edit(productId);
                    break;
                case "3" :
                    productId = productManager.inputId();
                    productManager.delete(productId);
                    break;
                case "4" :
                    productId = productManager.inputId();
                    productManager.search(productId);
                    break;
                case "5" :
                    productManager.showInfor();
                    break;
                case "0" :
                    System.out.println("exited!");
                    isExit = true;
                    break;
//                default:
//                    System.out.println("Vui lòng chọn lại");
            }
            if (isExit){
                break;
            }
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Delete product");
        System.out.println("4. Search product");
        System.out.println("5. Show product");
        System.out.println("0. Exit");
        System.out.println("------------------------");
        System.out.println("Please choice again");
    }
}
