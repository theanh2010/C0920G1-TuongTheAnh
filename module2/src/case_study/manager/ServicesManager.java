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
import java.util.TreeSet;

public class ServicesManager {
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
    public static TreeSet<String> villaTreeSet = new TreeSet<>();
    public static TreeSet<String> houseTreeSet = new TreeSet<>();
    public static TreeSet<String> roomTreeSet = new TreeSet<>();


    public static List<Villa> getServicesVillaList() {
        return servicesVillaList;
    }

    public static List<House> getServicesHouseList() {
        return servicesHouseList;
    }

    public static List<Room> getServicesRoomList() {
        return servicesRoomList;
    }

    public ServicesManager() {
    }

    public void addNewVilla() {
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
        line = villa.getIdVilla() + COMMA +
                villa.getNameServices() + COMMA +
                villa.getAreaServices() + COMMA +
                villa.getCostServices() + COMMA +
                villa.getQuantityIncluded() + COMMA +
                villa.getRentalType() + COMMA +
                villa.getStandardVilla() + COMMA +
                villa.getComfortableDescriptionVilla() + COMMA +
                villa.getFloorVilla() + COMMA +
                villa.getAreaPoolVilla();
        FileUtils.fileWriter("src/case_study/data/Villa.csv", line, true);
    }


    public void addNewHouse() {
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
                house.getNameServices() + COMMA +
                house.getAreaServices() + COMMA +
                house.getCostServices() + COMMA +
                house.getQuantityIncluded() + COMMA +
                house.getRentalType() + COMMA +
                house.getStandardHouse() + COMMA +
                house.getComfortableDescriptionHouse() + COMMA +
                house.getFloorHouse();
        FileUtils.fileWriter("src/case_study/data/House.csv", line, true);
    }
    public void addNewRoom() {
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
        FileUtils.fileWriter("src/case_study/data/Room.csv", line, true);
    }

    public void showAllVilla(){
        List<String[]> listVilla = FileUtils.readFile("src/case_study/data/Villa.csv");
        System.out.println(listVilla);
        servicesVillaList.clear();
        for (String[] s: listVilla){
            Villa villa = new Villa(s[0], s[1],Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]), s[5], s[6], s[7], Integer.parseInt(s[8]),Integer.parseInt(s[9]));
            servicesVillaList.add(villa);
        }
        if (servicesVillaList.isEmpty()){
            System.out.println("Danh sách trống");
        } else {
            for (Villa villa : servicesVillaList) {
                System.out.println(villa.showInfor());
            }
        }
    }
    public void showAllHouse() {
        List<String[]> listHouse = FileUtils.readFile("src/case_study/data/House.csv");
        System.out.println(listHouse);
        servicesHouseList.clear();
        for (String[] s : listHouse) {
            House house = new House(s[0], s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4]), s[5], s[6], s[7], Integer.parseInt(s[8]));
            servicesHouseList.add(house);
        }
        if (servicesHouseList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (House house : servicesHouseList) {
                System.out.println(house.showInfor());
            }
        }
    }
    public void showAllRoom(){
        List<String[]> listRoom = FileUtils.readFile("src/case_study/data/Room.csv");
        System.out.println(listRoom);
        servicesRoomList.clear();
        for (String[] s: listRoom){
            Room room = new Room(s[0], s[1], Integer.parseInt(s[2]),Integer.parseInt(s[3]),Integer.parseInt(s[4]), s[5],s[6]);
            servicesRoomList.add(room);
        }
        if (servicesRoomList.isEmpty()){
            System.out.println("Danh sách trống");
        } else {
            for (Room room : servicesRoomList) {
                System.out.println(room.showInfor());
            }
        }
    }
    public void showAllNameVillaNotDuplicate(){
        List<String[]> listVilla = FileUtils.readFile("src/case_study/data/Villa.csv");
        for (String[] s : listVilla ){
            villaTreeSet.add(s[0]);
        }
        System.out.println(villaTreeSet);
        System.out.println("-----------------");
    }
    public void showAllNameHouseNotDuplicate(){
        List<String[]> listHouse = FileUtils.readFile("src/case_study/data/House.csv");
        for (String[] s : listHouse ){
            houseTreeSet.add(s[0]);
        }
        System.out.println(houseTreeSet);
        System.out.println("-----------------");
    }
    public void showAllNameRoomNotDuplicate(){
        List<String[]> listRoom = FileUtils.readFile("src/case_study/data/Room.csv");
        for (String[] s : listRoom ){
            roomTreeSet.add(s[0]);
        }
        System.out.println(roomTreeSet);
        System.out.println("-----------------");
    }


    private String inputIdVilla() {
        String idVilla;
        do {
            System.out.println("Input id services : ");
            idVilla = input.nextLine();
        } while (!Validate.isIDVilla(idVilla));
        return idVilla;
    }

    private String inputIdRoom() {
        String idRoom;
        do {
            System.out.println("Input id services : ");
            idRoom = input.nextLine();
        } while (!Validate.isIDRoom(idRoom));
        return idRoom;
    }

    private String inputIdHouse() {
        String idHouse;
        do {
            System.out.println("Input id services : ");
            idHouse = input.nextLine();
        } while (!Validate.isIDHouse(idHouse));
        return idHouse;
    }

    private String inputNameServices() {
        String nameServices;
        do {
            System.out.println("Input name services :  ");
            nameServices = input.nextLine();
        } while (!Validate.isNameServices(nameServices));
        return nameServices;
    }

    private int inputAreaServices() {
        System.out.println("Input area services :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_AREA));
    }

    private int inputCostServices() {
        System.out.println("Input cost services :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_COST));
    }

    private int inputQuantityIncluded() {
        System.out.println("Input Quantity Included :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_QUANTITYINCLUDED));
    }

    private String inputRentalType() {
        String rentalType;
        do {
            System.out.println("Input rental type :  ");
            rentalType = input.nextLine();
        } while (!Validate.isRentalType(rentalType));
        return rentalType;
    }

    private String inputStandardVilla() {
        String standardVilla;
        do {
            System.out.println("Input Standard Room Villa :  ");
            standardVilla = input.nextLine();
        } while (!Validate.isStandardRoom(standardVilla));
        return standardVilla;
    }

    private String inputComfortableDescriptionVilla() {
        System.out.println("Input Comfortable Description Villa :  ");
        return input.nextLine();
    }

    private int inputFloorVilla() {
        System.out.println("Input Floor Villa :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_FLOOR));
    }

    private String inputStandardHouse() {
        String standardHouse;
        do {
            System.out.println("Input Standard Room House :  ");
            standardHouse = input.nextLine();
        } while (!Validate.isStandardRoom(standardHouse));
        return standardHouse;
    }

    private String inputComfortableDescriptionHouse() {
        System.out.println("Input Comfortable Description House :  ");
        return input.nextLine();
    }

    private int inputFloorHouse() {
        System.out.println("Input Floor House :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_FLOOR));
    }

    private int inputAreaPoolVilla() {
        System.out.println("Input pool villa :  ");
        return Integer.parseInt(Validate.regexStr(MainController.input.nextLine(), REGEX_POOL));
    }

    private String inputAccompaniedService() {
        String accompaniedService;
        do {
            System.out.println("Input Accompanied Service :  ");
            accompaniedService = input.nextLine();
        } while (!Validate.isAccompaniedService(accompaniedService));
        return accompaniedService;
    }
}
