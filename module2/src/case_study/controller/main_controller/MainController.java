package case_study.controller.main_controller;


import case_study.manager.CustomerManager;
import case_study.manager.EmployeeManager;
import case_study.manager.ServicesManager;


import java.util.Scanner;

public class MainController {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    showMenu();
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
        String choose ;
        boolean isExit = false;
        CustomerManager customerManager = new CustomerManager();
        int customerId;
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
                    EmployeeManager.showInformationOfEmployee();
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
    public static void addNewServices() {
        ServicesManager servicesManager = new ServicesManager();
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back To Menu");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------------------");

        boolean isExist = false;
        while (true) {
            String choiceServices = input.nextLine();
            switch (choiceServices) {
                case "1":
                    servicesManager.addNewVilla();
                    break;
                case "2":
                    servicesManager.addNewHouse();
                    break;
                case "3":
                    servicesManager.addNewRoom();
                    break;
                case "4":
                    showMenu();
                    break;
                case "5":
                    System.out.println("existed !");
                    isExist = true;
                    break;
                default:
                    System.out.println("please choose again");
            }if (isExist){
               break;
            }
            addNewServices();
        }
    }

    public static void showServices() {
        ServicesManager servicesManager = new ServicesManager();
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show All Name Villa Not Duplicate");
        System.out.println("5. Show All Name House Not Duplicate");
        System.out.println("6. Show All Name Room Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        System.out.println("--------------------------------------------------");
        boolean isExist = false;
        while (true) {
            String choiceShowServices = input.nextLine();
            switch (choiceShowServices) {
                case "1":
                    servicesManager.showAllVilla();
                    break;
                case "2":
                    servicesManager.showAllHouse();
                    break;
                case "3":
                    servicesManager.showAllRoom();
                    break;
                case "4":
//                showAllNameVillaNotDuplicate();
//            case 5 :
//                showAllNameHouseNotDuplicate();
//            case 6 :
//                showAllNameRoomNotDuplicate();
                case "7":
                    showMenu();
                    break;
                case "8":
                    System.out.println("existed !");
                    isExist = true;
                    break;
            }if (!isExist){
                break;
            }
            System.out.println("--------------------------------------------------");
            showServices();
        }
    }
}