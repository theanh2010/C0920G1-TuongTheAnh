package case_study.manager;

import case_study.commons.file_unit.FileUtils;
import case_study.commons.validate_exeption.Validate;
import case_study.controller.main_controller.MainController;
import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager  {
    public static final String REGEX_AREA = "([3-9][0-9])|([1-9][0-9][0-9])([1-9][0-9][0-9])";
    public static final String REGEX_COST = "^[1-9][0-9]|[0-9]+$";
    public static final String REGEX_QUANTITYINCLUDED = "^[0][1-9]|[1][0-9]|[2][0]$";
    public static final String REGEX_FLOOR = "^[0][1-9]|[1-9][0-9]|[1-9]+$";
    public static final String REGEX_POOL = "^([1-9][0-9][0-9])|([3-9][0-9])|[.][0-9]+$";
    public static String line = null;
    public static final String COMMA = ",";
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
                inputAreaServices(),
                inputCostServices(),
                inputQuantityIncluded(),
                inputRentalType(),
                inputStandardVilla(),
                inputComfortableDescriptionVilla(),
                inputFloorVilla(),
                inputAreaPoolVilla());
        servicesVillaList.add(villa);
        line =  villa.getIdVilla() + COMMA +
                villa.getNameServices() + COMMA +
                villa.getAreaServices() + COMMA +
                villa.getCostServices() + COMMA +
                villa.getQuantityIncluded() + COMMA +
                villa.getRentalType() + COMMA +
                villa.getStandardVilla() + COMMA +
                villa.getComfortableDescriptionVilla() + COMMA +
                villa.getFloorVilla() + COMMA +
                villa.getAreaPoolVilla();
        FileUtils.fileWriter("src/case_study/data/Villa.csv",line,true);
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
        line = house.getIdHouse() + COMMA +
               house.getNameServices()+ COMMA +
               house.getAreaServices()+ COMMA +
               house.getCostServices()+ COMMA +
               house.getQuantityIncluded()+ COMMA +
               house.getRentalType()+ COMMA +
               house.getStandardHouse()+ COMMA +
               house.getComfortableDescriptionHouse()+ COMMA +
               house.getFloorHouse();
        FileUtils.fileWriter("src/case_study/data/House.csv",line,true);
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
        line = room.getIdRoom() + COMMA +
                room.getNameServices() + COMMA +
                room.getAreaServices() + COMMA +
                room.getCostServices() + COMMA +
                room.getQuantityIncluded() + COMMA +
                room.getRentalType() + COMMA +
                room.getAccompaniedService();
        FileUtils.fileWriter("src/case_study/data/Room.csv",line,true);
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
        System.out.println("Input area services :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(),REGEX_AREA));
    }

    private int inputCostServices() {
        System.out.println("Input cost services :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_COST));
    }

    private int inputQuantityIncluded() {
        System.out.println("Input Quantity Included :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(),REGEX_QUANTITYINCLUDED));
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
        System.out.println("Input Floor Villa :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(),REGEX_FLOOR));
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
        System.out.println("Input Floor House :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(),REGEX_FLOOR));
    }
    private int inputAreaPoolVilla() {
        System.out.println("Input pool villa :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(),REGEX_POOL));
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
