package case_study.controller.add_customer;

import session_10_tree_map.bai_tap.quan_li_san_pham.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager extends Customer {
    public static Scanner input = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();
    public CustomerManager(){
    }
    public CustomerManager(int id , String nameCustomer, String birthday, String cmnd, String phoneNumber, String email, String typeCustomer, String adress) {
        super(id,nameCustomer, birthday, cmnd, phoneNumber, email, typeCustomer, adress);
    }
    public void  addNewCustomer(){
        int id = (customerList.size() > 0 ) ? (customerList.size() + 1) : 1;
        System.out.println("Product Id = " + id);
        String nameCustomer  = inputNameCustomer();
        String birthday = inputBirthday();
        String cmnd = inputCmnd();
        String phoneNumber = inputPhoneNumber();
        String email = inputEmail();
        String typeCustomer = inputTypeCustomer();
        String address = inputAddress();
       Customer customer = new Customer(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address);
       customerList.add(customer);
    }
    private String inputNameCustomer() {
        System.out.println("Input name customer :  ");
        return input.nextLine();
    }
    private String inputBirthday(){
        System.out.println("Input birthday customer :  ");
        return input.nextLine();
    }
    private String inputCmnd(){
        System.out.println("Input cmnd :  ");
        return input.nextLine();
    }
    private String inputPhoneNumber(){
        System.out.println("Input phone number :  ");
        return input.nextLine();
    }
    private String inputEmail(){
        System.out.println("Input email :  ");
        return  input.nextLine();
    }
    private String inputTypeCustomer(){
        System.out.println("Input type customer");
        return  input.nextLine();
    }
    private String inputAddress(){
        System.out.println("Input address :  ");
        return input.nextLine();
    }
    public void showInformationOfCustomer(){
        for (Customer customer : customerList){
            System.out.println("Name customer : " + customer.getNameCustomer());
            System.out.println("Birthday customer : " + customer.getBirthday());
            System.out.println("Cmnd customer : " + customer.getCmnd());
            System.out.println("Phone number customer : " + customer.getPhoneNumber());
            System.out.println("Email customer : " + customer.getEmail());
            System.out.println("Type customer : " + customer.getTypeCustomer());
            System.out.println("Address customer : " + customer.getAddress());
        }
    }
}
