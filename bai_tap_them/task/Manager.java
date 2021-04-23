package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public List<Product> productListImport = new ArrayList<>();
    public List<Product> productListExport = new ArrayList<>();
    public Validate validate = new Validate();
    public int choose = 0;
    public Scanner scanner = new Scanner(System.in);
    private String codeProduct;
    private String nameProduct;
    private double priceProduct;
    private int amountProduct;
    private String producer;
    private double priceImport;
    private double tax;
    double priceExport;
    String province;
    String country;

    public void addProduct() {
        scanner.nextLine();
        do {
            System.out.println("Input code product : ");
            codeProduct = scanner.nextLine();
        }while (!validate.isName(codeProduct));
        do {
            System.out.println("Input name product : ");
            nameProduct = scanner.nextLine();
        }while (!validate.isName(nameProduct));
        do {
            try {
                System.out.println("Input price product : ");
                priceProduct = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Not Input String, Input double : ");
            }
        }while (!validate.isDouble(String.valueOf(priceProduct)));
        do {
            try {
                System.out.println("Input amount product : ");
                amountProduct = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Not Input String , Input int :");
            }
        }while (!validate.isInt(String.valueOf(amountProduct)));
        do {
            System.out.println("Input producer : ");
            producer = scanner.nextLine();
        }while (!validate.isName(producer));
    }

    public void addProductImport() {
        int idIm = (productListImport.size() > 0) ? productListImport.size() + 1 : 1;
        addProduct();
        do {
            try {
            System.out.println("Input price import : ");
            priceImport = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Not Input String, Input double :");
            }
        }while (!validate.isDouble(String.valueOf(priceImport)));
        do {
            System.out.println("Input province : ");
            province = scanner.nextLine();
        }while (!validate.isName(province));
        do {
            try {
                System.out.println("Input tax : ");
                tax = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Not Input String, Input double :");
            }
        }while (!validate.isDouble(String.valueOf(tax)));
        ProductImport productImport = new ProductImport(idIm, codeProduct, nameProduct, priceProduct, amountProduct, producer, priceImport, province, tax);
        productListImport.add(productImport);
        FileUtils.write(productListImport,FileUtils.FILE);
    }

    public void addProductExport() {
        int idEx = (productListExport.size() > 0) ? productListExport.size() + 1 : 1;
        addProduct();
        do {
            System.out.println("Input price Export : ");
            priceExport = Double.parseDouble(scanner.nextLine());
        }while (!validate.isDouble(String.valueOf(priceExport)));
        do {
            System.out.println("Input country : ");
            country = scanner.nextLine();
        }while (!validate.isName1(country));
        ProductExport productExport = new ProductExport(idEx, codeProduct, nameProduct, priceProduct, amountProduct, producer, priceExport, country);
        productListExport.add(productExport);
        FileUtils.write(productListExport,FileUtils.FILE_1);
    }
    String codeProductDelete;
    public void isYesProductImport(){
        productListImport = FileUtils.read(FileUtils.FILE);
                System.out.println("Input code product Import : ");
                codeProductDelete = scanner.nextLine();
        for (int i = 0; i < productListImport.size(); i++){
            if (productListImport.get(i).getCodeProduct().equals(codeProductDelete)){
                productListImport.remove(i);
            }
//            }else {
//                try {
//                    throw new NameException();
//                }catch (NameException e){
//                    e.printStackTrace();
//                }
//            }
        }
        FileUtils.write(productListImport,FileUtils.FILE);
        for (Product product : productListImport){
            System.out.println(product);
        }
    }

    String codeProductExportDelete;
    public void isYesProductExport(){
        do {
            try {
                System.out.println("Input code product  : ");
                codeProductExportDelete = scanner.nextLine();
            }catch (NumberFormatException e){
                System.out.println("fail.Input :");
            }
        }while (!validate.isName(codeProductDelete));
        for (int i = 0; i < productListImport.size(); i++){
            if (productListImport.get(i).getCodeProduct().equals(codeProductExportDelete)){
                productListImport.remove(i);
                i--;
            }else {
                try {
                    throw new NameException();
                }catch (NameException e){
                    e.printStackTrace();
                }
            }
        }
        FileUtils.write(productListExport,FileUtils.FILE_1);
        for (Product product : productListImport){
            System.out.println(product);
        }
    }
    public void delete(){
        do {
            System.out.println("1.Delete product import\n" +
                    "2.Delete product export\n" +
                    "3.back to menu");
            System.out.println("Input 1 - 3 : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    isYesProductImport();
                    break;
                case 2:
                    isYesProductExport();
                    break;
                case 3:
                    Main.menu();
                    break;
                default:
                    System.out.println("fail,Input choose :");
            }
        }while (choose >= 1 && choose <=3);
    }
    public void showInformation(){
        do {
            System.out.println("1.Show ProductImport\n" +
                    "2.Show ProductExport\n" +
                    "3.back to menu.");
            System.out.println("Input 1 - 3: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    showInformationImport();
                    break;
                case 2:
                    showInformationExport();
                    break;
                case 3:
                    Main.menu();
                    break;
                default:
                    System.out.println("fail,Input choose : ");
            }
        }while (choose >= 1 && choose <= 3);
    }
    public void showInformationImport(){
        productListImport = FileUtils.read(FileUtils.FILE);
        for (Product productImport : productListImport){
            System.out.println(productImport);
        }
    }
    public void showInformationExport(){
        productListExport = FileUtils.read(FileUtils.FILE_1);
        for (Product productExport : productListExport){
            System.out.println(productListExport);
        }
    }
    public void searchNameProduct(){
        do {
            System.out.println("1.Search Name product Import\n" +
                    "2.Search Name product Export.\n" +
                    "3.back to menu");
            System.out.println("Input 1 - 3");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    searchImport();
                    break;
                case 2:
                    searchExport();
                    break;
                case 3:
                    Main.menu();
                    break;
                default:
                    System.out.println("fail,Input choose :");
            }
        } while (choose >= 1 && choose <= 3);
    }
    public void searchImport(){
        productListImport = FileUtils.read(FileUtils.FILE);
        System.out.println("Input Search Product Import :");
        String name = scanner.nextLine();
        for (int i = 0; i < productListImport.size();i++){
            if (productListImport.get(i).getNameProduct().equals(name)){
                System.out.println(productListImport.get(i));
            }
        }
    }
    public void searchExport(){
        productListExport = FileUtils.read(FileUtils.FILE_1);
        System.out.println("Input Search Product Export :");
        String name = scanner.nextLine();
        for (int i = 0; i < productListExport.size();i++){
            if (productListExport.get(i).getNameProduct().equals(name)){
                System.out.println(productListExport.get(i));
            }
        }
    }
}
