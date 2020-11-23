package task;

import java.util.Scanner;

public class Main {
    public static int choose = 0;
    public static Scanner scanner = new Scanner(System.in);
    private static Manager manager = new Manager();

    public static void menu(){
        do {
            System.out.println("1.Add\n" +
                    "2.Delete\n" +
                    "3.ShowInformation\n" +
                    "4.Search\n" +
                    "5.Exit");
            System.out.println("Input 1-5 : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    manager.delete();
                    break;
                case 3:
                    manager.showInformation();
                    break;
                case 4:
                    manager.searchNameProduct();
                    break;
                case 5:
                    System.exit(5);
                default:
                    System.out.println("fail,Input choose : ");
            }
        } while (choose >= 1 && choose <= 5);
    }

    public static void add(){
        do {
            System.out.println("1.Add Import\n" +
                    "2.Add Export\n" +
                    "3.Back To Menu\n" +
                    "4.Exit.");
            System.out.println("Input Choose 1-4 : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manager.addProductImport();
                    break;
                case 2:
                    manager.addProductExport();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("fail,Input choose :");
            }
        } while (choose >= 1 && choose <= 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
