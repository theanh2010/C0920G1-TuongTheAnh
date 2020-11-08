package case_study.models.services;

import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.villa.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager extends Services {
    public static Scanner input = new Scanner(System.in);
    public static List<Services> servicesVillaList = new ArrayList<>();
    public static List<Services> servicesHouseList = new ArrayList<>();
    public static List<Services> servicesRoomList = new ArrayList<>();
    public ServicesManager(){}

    public ServicesManager(String nameServices, String areaServices, String costServices, String quantityIncluded, String rentalType) {
        super(nameServices, areaServices, costServices, quantityIncluded, rentalType);
    }
    public void addNewVilla(){
        String nameServices = inputNameServices();
        String areaServices = inputAreaServices();
        String costServices = inputCostServices();
        String quantityIncluded = inputQuantityIncluded();
        String rentalType = inputRentalType();
        String standardVilla = inputStandardVilla();
        String comfortableDescriptionVilla = inputComfortableDescriptionVilla();
        String floorVilla = inputFloorVilla();
        String areaPoolVilla = inputAreaPoolVilla();
        Villa villa = new Villa(nameServices,areaServices,costServices,quantityIncluded,rentalType,standardVilla,comfortableDescriptionVilla,floorVilla,areaPoolVilla);
        servicesVillaList.add(villa);
    }
    public void addNewHouse(){
        String nameServices = inputNameServices();
        String areaServices = inputAreaServices();
        String costServices = inputCostServices();
        String quantityIncluded = inputQuantityIncluded();
        String rentalType = inputRentalType();
        String standardHouse = inputStandardHouse();
        String comfortableDescriptionHouse = inputComfortableDescriptionHouse();
        String floorHouse = inputFloorHouse();
        House house = new House(nameServices,areaServices,costServices,quantityIncluded,rentalType,standardHouse,comfortableDescriptionHouse,floorHouse);
        servicesHouseList.add(house);
    }
    public void addNewRoom(){
        String nameServices = inputNameServices();
        String areaServices = inputAreaServices();
        String costServices = inputCostServices();
        String quantityIncluded = inputQuantityIncluded();
        String rentalType = inputRentalType();
        String accompaniedService = "";
        Room room = new Room(nameServices,areaServices,costServices,quantityIncluded,rentalType,accompaniedService);
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
            System.out.println("Name Services  :" + villa.getNameServices());
            System.out.println("Area Services  :" + villa.getAreaServices());
            System.out.println("Cost Services  " + villa.getCostServices());
            System.out.println("Quantity Included " + villa.getQuantityIncluded());
            System.out.println("Rental Type " + villa.getRentalType());
            System.out.println("Standard Villa "  );
            System.out.println("Comfortable Description Villa " + villa.getNameServices());
            System.out.println("Floor Villa " + villa.getNameServices());
            System.out.println("Area Pool Villa " + villa.getNameServices());
        }
    }
    public void showAllHouse(){
        for (Services house : servicesHouseList){
            System.out.println("Name Services  :" + house.getNameServices());
            System.out.println("Area Services  :" + house.getAreaServices());
            System.out.println("Cost Services  " + house.getCostServices());
            System.out.println("Quantity Included " + house.getQuantityIncluded());
            System.out.println("Rental Type " + house.getRentalType());
        }
    }
    public void showAllRoom(){
        for (Services room : servicesRoomList){
            System.out.println("Name Services  :" + room.getNameServices());
            System.out.println("Area Services  :" + room.getAreaServices());
            System.out.println("Cost Services  " + room.getCostServices());
            System.out.println("Quantity Included " + room.getQuantityIncluded());
            System.out.println("Rental Type " + room.getRentalType());
        }
    }
    @Override
    public String showInfor() {
        return null;
    }
}
