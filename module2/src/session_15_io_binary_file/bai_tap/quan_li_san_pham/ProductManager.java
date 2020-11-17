package session_15_io_binary_file.bai_tap.quan_li_san_pham;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager extends Product {
    public static Scanner input = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    public ProductManager() {
    }

    public ProductManager(int id, String nameProduct, String manufacturer, double price, String describe) {
        super(id, nameProduct, manufacturer, price, describe);
    }

    public void  add(){

        try {
            int id = (productList.size() > 0 ? (productList.size()+1) : 1);
            System.out.println("Product Id = " + id);

            Product product = new Product(id,inputName() ,inputManufacturer(),inputPrice(),inputDescribe());
            productList.add(product);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(
                            new File("src/session_15_io_binary_file/bai_tap/quan_li_san_pham/product.csv")));
                            objectOutputStream.writeObject(productList);
                            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String inputDescribe() {
        input.nextLine();
        System.out.print("Input describe :  ");
        return input.nextLine();
    }

    private Double inputPrice() {
        System.out.println("Input price");
        return input.nextDouble();
    }

    private String inputManufacturer() {
        System.out.println(" Input inputManufacturer");
        return input.nextLine();
    }

    private String inputName() {

        System.out.println(" Input name");
        setNameProduct(input.nextLine());
        return getNameProduct() ;
    }


    public void edit(int id){
        boolean isExit = false;
        for (int i = 0 ; i < productList.size() ; i++){
            if (productList.get(i).getId() == id){
                 isExit = true;
                 productList.get(i).setNameProduct(inputName());
                 productList.get(i).setManufacturer(inputManufacturer());
                 productList.get(i).setPrice(inputPrice());
                 productList.get(i).setDescribe(inputDescribe());
                 break;
            }
        }
        if (isExit){
            System.out.println("thoát chương trình");
        }
    }

    public void delete(int id){
        Product product = null;
        for (int i = 0 ; i < productList.size() ; i++){
            if ( productList.get(i).getId() == id){
                product = productList.get(i);
                break;
            }
        }
        if (product != null ){
            productList.remove(product);
        }else {
            System.out.println("id nhập không đúng vui lòng nhập lại");
        }

    }

    public int inputId() {
        System.out.print("Input product ID  :");
        while (true){
            try {
                int id =  Integer.parseInt(input.nextLine());
                return id;
            }catch (NumberFormatException e) {
                input.nextLine();
                System.out.print("Id không đúng vui lòng nhập lại :");
            }
        }
    }
    public void   showInfor(){
        System.out.println("name" + getNameProduct());
    }



    public void search(int id) {
        boolean check = false;
        System.out.println("Input product ID :");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                check = true;
                System.out.println(productList.get(i));
                break;
            }
        }
        if (check) {
            System.out.println("thoát chương trình");
        }

    }

}
