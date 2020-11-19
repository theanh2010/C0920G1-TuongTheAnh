package case_study.manager;

import case_study.commons.validate_exeption.Validate;
import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager  {
    public static Scanner input = new Scanner(System.in);
    public static List<Villa> servicesVillaList = new ArrayList<>();
    public static List<House> servicesHouseList = new ArrayList<>();
    public static List<Room> servicesRoomList = new ArrayList<>();


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
        Villa villa = new Villa(
                inputIdVilla(),
                inputNameServices(),
                inputAreaServices(),inputCostServices(),
                inputQuantityIncluded(),
                inputRentalType(),
                inputStandardVilla(),
                inputComfortableDescriptionVilla(),
                inputFloorVilla(),
                inputAreaPoolVilla());
        servicesVillaList.add(villa);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/Villa.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villas : servicesVillaList) {
                bufferedWriter.write(villas.getIdVilla()+","+
                        villas.getNameServices()+","+
                        villas.getAreaServices()+ "," +
                        villas.getCostServices()+ "," +
                        villas.getQuantityIncluded()+ "," +
                        villas.getRentalType()+ "," +
                        villas.getStandardVilla()+ "," +
                        villas.getComfortableDescriptionVilla()+ "," +
                        villas.getFloorVilla()+ "," +
                        villas.getAreaPoolVilla());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readDataVilla(){
        File file;
        file = new File("src/case_study/data/Villa.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                 String[] countLine;
                 countLine = line.split(",");
                 Villa villas = new Villa(
                         countLine[0],
                         countLine[1],
                         Integer.parseInt(countLine[2]),
                         Integer.parseInt(countLine[3]),
                         Integer.parseInt(countLine[4]),
                         countLine[5],
                         countLine[6],
                         countLine[7],
                         Integer.parseInt(countLine[8]),
                         Integer.parseInt(countLine[9]));
                 servicesVillaList.add(villas);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addNewHouse(){
        House house = new House(inputIdHouse(),
                inputNameServices(),
                inputAreaServices(),
                inputCostServices(),
                inputQuantityIncluded(),
                inputRentalType(),
                inputStandardHouse(),
                inputComfortableDescriptionHouse(),
                inputFloorHouse());
        servicesHouseList.add(house);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/House.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House houses : servicesHouseList) {
                bufferedWriter.write(houses.getIdHouse()+","+
                        houses.getNameServices()+","+
                        houses.getAreaServices()+ "," +
                        houses.getCostServices()+ "," +
                        houses.getQuantityIncluded()+ "," +
                        houses.getRentalType()+ "," +
                        houses.getStandardHouse()+ "," +
                        houses.getComfortableDescriptionHouse()+ "," +
                        houses.getFloorHouse());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  readDataHouse(){
        File file;
        file = new File("src/case_study/data/House.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                String[] countLine;
                countLine = line.split(",");
                House houses = new House(
                        countLine[0],
                        countLine[1],
                        Integer.parseInt(countLine[2]),
                        Integer.parseInt(countLine[3]),
                        Integer.parseInt(countLine[4]),
                        countLine[5],
                        countLine[6],
                        countLine[7],
                        Integer.parseInt(countLine[8]));
                servicesHouseList.add(houses);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addNewRoom(){
        Room room = new Room(inputIdRoom(),
                inputNameServices(),
                inputAreaServices(),
                inputCostServices(),
                inputQuantityIncluded(),
                inputRentalType(),
                inputAccompaniedService());
        servicesRoomList.add(room);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/Room.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room rooms : servicesRoomList) {
                bufferedWriter.write(rooms.getIdRoom() +","+
                        rooms.getNameServices()+","+
                        rooms.getAreaServices()+ "," +
                        rooms.getCostServices()+ "," +
                        rooms.getQuantityIncluded()+ "," +
                        rooms.getRentalType()+ "," +
                        rooms.getAccompaniedService());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readDataRoom(){
        File file;
        file = new File("src/case_study/data/Room.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                String[] countLine;
                countLine = line.split(",");
                Room rooms = new Room(
                        countLine[0],
                        countLine[1],
                        Integer.parseInt(countLine[2]),
                        Integer.parseInt(countLine[3]),
                        Integer.parseInt(countLine[4]),
                        countLine[5],
                        countLine[6]);
                servicesRoomList.add(rooms);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String inputIdVilla(){
        String idVilla;
        do {
            System.out.println("Input id services : ");
            idVilla = input.nextLine();
        }while (!Validate.isIDVilla(idVilla));
        return idVilla;
    }
    private String inputIdRoom(){
        String idRoom;
        do {
            System.out.println("Input id services : ");
            idRoom = input.nextLine();
        }while (!Validate.isIDRoom(idRoom));
        return idRoom;
    }
    private String inputIdHouse(){
        String idHouse;
        do {
            System.out.println("Input id services : ");
            idHouse = input.nextLine();
        }while (!Validate.isIDHouse(idHouse));
        return idHouse;
    }
    private String inputNameServices() {
        String nameServices;
        do {
            System.out.println("Input name services :  ");
            nameServices = input.nextLine();
        }while (!Validate.isNameServices(nameServices));
            return nameServices;
    }
    private int inputAreaServices() {
        int areaServices;
        do {
            System.out.println("Input area services :  ");
            areaServices = input.nextInt();
            System.err.println("You entered incorrectly.Please re-enter");
        }while (areaServices < 30);
            return areaServices;

    }
    private int inputCostServices() {
        int costServices;
        do {
            System.out.println("Input cost services :  ");
            costServices = input.nextInt();
            System.err.println("You entered incorrectly.Please re-enter");
        }while (costServices < 0);
            return costServices;
    }
    private int inputQuantityIncluded() {
        int quantityIncluded;
        do {
            System.out.println("Input Quantity Included :  ");
            quantityIncluded = input.nextInt();
            System.err.println("You entered incorrectly.Please re-enter");
        }while (quantityIncluded < 0  &&  quantityIncluded>20);
        return quantityIncluded;
    }
    private String inputRentalType() {
        String rentalType;
        do {
            System.out.println("Input rental type :  ");
            rentalType = input.nextLine();
        }while (!Validate.isRentalType(rentalType));
        return rentalType;
    }
    private String inputStandardVilla() {
        String standardVilla;
        do {
            System.out.println("Input Standard Room Villa :  ");
            standardVilla=input.nextLine();
        }while (!Validate.isStandardRoom(standardVilla));
        return standardVilla;
    }
    private String inputComfortableDescriptionVilla() {
        System.out.println("Input Comfortable Description Villa :  ");
        return input.nextLine();
    }
    private int inputFloorVilla() {
        int floorVilla;
        do {
            System.out.println("Input Floor Villa :  ");
            floorVilla = input.nextInt();
            System.out.println("You entered incorrectly.Please re-enter");
        }while (floorVilla < 0);
        return floorVilla;
    }
    private String inputStandardHouse() {
        String standardHouse;
        do {
            System.out.println("Input Standard Room House :  ");
            standardHouse = input.nextLine();
        }while (!Validate.isStandardRoom(standardHouse));
        return standardHouse;
    }
    private String inputComfortableDescriptionHouse() {
        System.out.println("Input Comfortable Description House :  ");
        return input.nextLine();
    }
    private int inputFloorHouse() {
        int floorHouse;
        do {
            System.out.println("Input Floor House :  ");
            floorHouse = input.nextInt();
            System.out.println("You entered incorrectly.Please re-enter");

        }while (floorHouse < 0);
        return floorHouse;
    }
    private int inputAreaPoolVilla() {
        int areaPoolVilla;
        do {
            System.out.println("Input pool villa :  ");
           areaPoolVilla = input.nextInt();
            System.out.println("You entered incorrectly.Please re-enter");
        }while (areaPoolVilla <30);
            return areaPoolVilla;

    }
    private String inputAccompaniedService(){
        String accompaniedService;
        do {
            System.out.println("Input Accompanied Service :  ");
            accompaniedService = input.nextLine();
        }while (!Validate.isAccompaniedService(accompaniedService));
        return accompaniedService;
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
