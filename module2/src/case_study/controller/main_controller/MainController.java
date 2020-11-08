package case_study.controller.main_controller;


import case_study.controller.add_customer.CustomerManager;
import case_study.models.services.ServicesManager;


import java.util.Scanner;

public class MainController {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean isExit = false;
        CustomerManager customerManager = new CustomerManager();
        int customerId;
        showMenu();
        while (true) {
            choose = input.nextLine();
            switch (choose) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    customerManager.addNewCustomer();
                    break;
                case "4":
                    customerManager.showInformationOfCustomer();
                    break;
                case "5":
//                    addNewBooking();
                    break;
                case "6":
//                    showInformationOfEmployee();
                    break;
                case "7":
                    System.out.println("existed !");
                    isExit = true;
                    break;
                default:
                    System.out.println("please choose again");
            }
            if (isExit) {
                break;
            }
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("chọn chức năng");
        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information Of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information Of Employee");
        System.out.println("7. Exit");
        System.out.println("--------------------------------------------------");
    }
    public static void addNewServices() {
        ServicesManager servicesManager = new ServicesManager();
        boolean isExit = false;
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back To Menu");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------------------");
        int choiceServices = input.nextInt();
        while (true) {
            switch (choiceServices) {
                case 1:
                    servicesManager.addNewVilla();
                    break;
                case 2:
                    servicesManager.addNewHouse();
                    break;
                case 3:
                    servicesManager.addNewRoom();
                    break;
                case 4:
                    showMenu();
                    break;
                case 5:
                    System.out.println("existed !");
                    isExit = true;
                    break;
                default:
                    System.out.println("please choose again");
            }
        }
    }
    public static void showServices(){
        ServicesManager servicesManager = new ServicesManager();
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Room Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        System.out.println("---------------------------------------------------");
        int choiceShowServices = input.nextInt();
        while (true)
        switch (choiceShowServices){
            case 1 :
                servicesManager.showAllVilla();
                break;
            case 2 :
                servicesManager.showAllHouse();
                break;
            case 3 :
                servicesManager.showAllRoom();
                break;
            case 4 :
//                showAllNameVillaNotDuplicate();
//            case 5 :
//                showAllNameHouseNotDuplicate();
//            case 6 :
//                showAllNameRoomNotDuplicate();
//            case 7 :
//                backToMenu();
            case 8 :
                break;
        }
    }
//    public static void addNewCustomer(){
//
//    }
//    public static void showInformationOfCustomer(){}
//    public static void addNewBooking(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("1. Booking Villa");
//        System.out.println("2. Booking House");
//        System.out.println("3. Booking Room");
//        int choiceAddNewBooking = input.nextInt();
//        switch (choiceAddNewBooking){
////            case 1:
////                bookingVilla();
////            case 2:
////                bookingHouse();
////            case 3:
////                bookingRoom();
//        }
//    }
//    public static void showInformationOfEmployee(){}
//}
}