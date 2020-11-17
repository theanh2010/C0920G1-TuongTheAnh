package case_study.manager;


import case_study.models.customer.Customer;
import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    public static Scanner input = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Villa> villaList = ServicesManager.getServicesVillaList();
    public static List<House> houseList = ServicesManager.getServicesHouseList();
    public static List<Room> roomList = ServicesManager.getServicesRoomList();
    public CustomerManager(){
    }
    public void  addNewCustomer(){
        int id = (customerList.size() > 0 ) ? (customerList.size() + 1) : 1;
        System.out.println("Customer Id = " + id);
        String nameCustomer  = inputNameCustomer();
        String birthday = inputBirthday();
        String cmnd = inputCmnd();
        String phoneNumber = inputPhoneNumber();
        String email = inputEmail();
        String typeCustomer = inputTypeCustomer();
        String address = inputAddress();
        Services typeServices = null;

        System.out.println("Choose services :" +"\n"+
                "1.Villa" + "\n"+
                "2.House" + "\n"+
                "3.Room");


        switch (input.nextInt()){
            case 1 :{
                System.out.println("Choose Villa :");
                for(int i = 0 ; i < villaList.size(); i++){
                    System.out.println((i+1) + ": " +villaList.get(i).getNameServices());
                }
                typeServices = villaList.get(input.nextInt() - 1);
                break;
            }
            case 2 :
                System.out.println("Choose House :");
                for (int i = 0 ; i < houseList.size();i++){
                    System.out.println((i+1) + ": " +houseList.get(i).getNameServices());
                }
                typeServices = houseList.get(input.nextInt()-1);
                break;
            case 3 :
                System.out.println("Choose Room :");
                for (int i = 0 ; i < roomList.size();i++){
                    System.out.println((i+1) + ": " +roomList.get(i).getNameServices());
                }
                typeServices = roomList.get(input.nextInt()-1);
                break;
        }
       Customer customer = new Customer(id,nameCustomer,birthday,cmnd,phoneNumber,email,typeCustomer,address,typeServices);
       customerList.add(customer);
       showInformationOfCustomer();
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
            System.out.println(customer.showInfor());
        }
    }
}
