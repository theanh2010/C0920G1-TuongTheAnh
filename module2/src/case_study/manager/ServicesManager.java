package case_study.manager;

import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager  {
    public static Scanner input = new Scanner(System.in);
    public static List<Villa> servicesVillaList = new ArrayList<>();
    public static List<House> servicesHouseList = new ArrayList<>();
    public static List<Room> servicesRoomList = new ArrayList<>();
    static {
        servicesVillaList.add(new Villa("Villa 1","1","2","3","4","5","6","7","2"));
        servicesVillaList.add(new Villa("Villa 2","1","2","3","4","5","6","7","2"));
        servicesHouseList.add(new House("House 1","1","2","3","4","5","6",""));
        servicesHouseList.add(new House("House 2","1","2","3","4","5","6","7"));
        servicesRoomList.add(new Room("Room 2","1","2","3","4","5"));
        servicesRoomList.add(new Room("Room 3","1","2","3","4","5"));
    }

    public static List<Villa> getServicesVillaList() {
        return servicesVillaList;
    }

    public static List<House> getServicesHouseList() {
        return servicesHouseList;
    }

    public static List<Room> getServicesRoomList() {
        return servicesRoomList;
    }

    public ServicesManager(){}

    public void addNewVilla(){
        Villa villa = new Villa(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),inputStandardVilla(),inputComfortableDescriptionVilla(),inputFloorVilla(),inputAreaPoolVilla());
        servicesVillaList.add(villa);
    }
    public void addNewHouse(){
        House house = new House(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),inputStandardHouse(),inputComfortableDescriptionHouse(),inputFloorHouse());
        servicesHouseList.add(house);
    }
    public void addNewRoom(){
        Room room = new Room(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),"FREE");
        servicesRoomList.add(room);
    }
    private String inputNameServices() {
        System.out.println("Input name services :  ");
        return input.nextLine();
    }
    private String inputAreaServices() {
        System.out.println("Input area services :  ");
        return input.nextLine();
    }
    private String inputCostServices() {
        System.out.println("Input cost services :  ");
        return input.nextLine();
    }
    private String inputQuantityIncluded() {
        System.out.println("Input Quantity Included :  ");
        return input.nextLine();
    }
    private String inputRentalType() {
        System.out.println("Input rental type :  ");
        return input.nextLine();
    }
    private String inputStandardVilla() {
        System.out.println("Input Standard Villa :  ");
        return input.nextLine();
    }
    private String inputComfortableDescriptionVilla() {
        System.out.println("Input Comfortable Description Villa :  ");
        return input.nextLine();
    }
    private String inputFloorVilla() {
        System.out.println("Input Floor Villa :  ");
        return input.nextLine();
    }
    private String inputStandardHouse() {
        System.out.println("Input Standard House :  ");
        return input.nextLine();
    }
    private String inputComfortableDescriptionHouse() {
        System.out.println("Input Comfortable Description House :  ");
        return input.nextLine();
    }
    private String inputFloorHouse() {
        System.out.println("Input Floor House :  ");
        return input.nextLine();
    }
    private String inputAreaPoolVilla() {
        System.out.println("Input pool villa :  ");
        return input.nextLine();
    }
    public void showAllVilla(){
        for (Services villa : servicesVillaList){
            System.out.println(villa.showInfor());
        }
    }
    public void showAllHouse(){
        for (Services house : servicesHouseList){
            System.out.println(house.showInfor());
        }
    }
    public void showAllRoom(){
        for (Services room : servicesRoomList){
            System.out.println(room.showInfor());
        }
    }
}
