package case_study.manager;

import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;

import java.io.*;
import java.lang.reflect.Array;
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
        Villa villa = new Villa(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),inputStandardVilla(),inputComfortableDescriptionVilla(),inputFloorVilla(),inputAreaPoolVilla());
        servicesVillaList.add(villa);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/Villa.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villas : servicesVillaList) {
                bufferedWriter.write(villas.getNameServices()+","+
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
                         countLine[0],countLine[1],countLine[2],countLine[3],countLine[4],countLine[5],countLine[6],countLine[7],countLine[8]);
                 servicesVillaList.add(villas);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addNewHouse(){
        House house = new House(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),inputStandardHouse(),inputComfortableDescriptionHouse(),inputFloorHouse());
        servicesHouseList.add(house);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/House.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House houses : servicesHouseList) {
                bufferedWriter.write(houses.getNameServices()+","+
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
                        countLine[0],countLine[1],countLine[2],countLine[3],countLine[4],countLine[5],countLine[6],countLine[7]);
                servicesHouseList.add(houses);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addNewRoom(){
        Room room = new Room(inputNameServices(),inputAreaServices(),inputCostServices(),inputQuantityIncluded(),inputRentalType(),"FREE");
        servicesRoomList.add(room);
        try {
            FileWriter fileWriter = new FileWriter("src/case_study/data/Room.csv",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room rooms : servicesRoomList) {
                bufferedWriter.write(rooms.getNameServices()+","+
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
                        countLine[0],countLine[1],countLine[2],countLine[3],countLine[4],countLine[5]);
                servicesRoomList.add(rooms);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
