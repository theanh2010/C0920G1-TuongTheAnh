package case_study.manager;


import case_study.commons.comparator.SortNameCustomer;
import case_study.commons.file_unit.FileUtils;
import case_study.commons.validate_exeption.*;
import case_study.models.customer.Customer;
import case_study.models.house.House;
import case_study.models.room.Room;
import case_study.models.services.Services;
import case_study.models.villa.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    public static String line = null;
    public static final String COMMA = ",";
    public static Scanner input = new Scanner(System.in);
    public static List<Villa> villaList = ServicesManager.getServicesVillaList();
    public static List<House> houseList = ServicesManager.getServicesHouseList();
    public static List<Room> roomList = ServicesManager.getServicesRoomList();

    public CustomerManager() {
    }

    public void addNewCustomer() {
        List<Customer> oldListCustomer = readDataCustomer();
        System.out.println(oldListCustomer.size());
        int id = 1;
        if (oldListCustomer.size() != 0) {
            id = oldListCustomer.get(oldListCustomer.size() - 1).getId() + 1;
        }
        List<Customer> customerList = new ArrayList<>();
        System.out.println("Customer Id = " + id);
        String nameCustomer = inputNameCustomer();
        String gender = inputGender();
        String idCard = inputIdCard();
        String birthday = inputBirthday();
        String cmnd = inputCmnd();
        String phoneNumber = inputPhoneNumber();
        String email = inputEmail();
        String typeCustomer = inputTypeCustomer();
        String address = inputAddress();
//        Services typeServices = null;
//
//        System.out.println("Choose services :" +"\n"+
//                "1.Villa" + "\n"+
//                "2.House" + "\n"+
//                "3.Room");
//
//
//        switch (input.nextInt()){
//            case 1 :{
//                System.out.println("Choose Villa :");
//                for(int i = 0 ; i < villaList.size(); i++){
//                    System.out.println((i+1) + ": " +villaList.get(i).getNameServices());
//                }
//                typeServices = villaList.get(input.nextInt() - 1);
//                break;
//            }
//            case 2 :
//                System.out.println("Choose House :");
//                for (int i = 0 ; i < houseList.size();i++){
//                    System.out.println((i+1) + ": " +houseList.get(i).getNameServices());
//                }
//                typeServices = houseList.get(input.nextInt()-1);
//                break;
//            case 3 :
//                System.out.println("Choose Room :");
//                for (int i = 0 ; i < roomList.size();i++){
//                    System.out.println((i+1) + ": " +roomList.get(i).getNameServices());
//                }
//                typeServices = roomList.get(input.nextInt()-1);
//                break;
//        }
//        FileUtils.writeFile(FILE_CUSTOMER, line, true);

        Customer customer = new Customer(id, nameCustomer, gender, birthday, idCard, cmnd, phoneNumber, email, typeCustomer, address);
        customerList.add(customer);
        line = id + COMMA +
                nameCustomer + COMMA +
                gender + COMMA +
                birthday + COMMA +
                idCard + COMMA +
                cmnd + COMMA +
                phoneNumber + COMMA +
                email + COMMA +
                typeCustomer + COMMA +
                address;
        FileUtils.fileWriter("src/case_study/data/Customer.csv",line,true);

    }

    public List<Customer> readDataCustomer() {
        List<Customer> customerList = new ArrayList<>();
        File file;
        file = new File("src/case_study/data/Customer.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] countLine;
                countLine = line.split(",");

                Customer customers = new Customer(
                        Integer.parseInt(countLine[0]),
                        countLine[1],
                        countLine[2],
                        countLine[3],
                        countLine[4],
                        countLine[5],
                        countLine[6],
                        countLine[7],
                        countLine[8],
                        countLine[9]);
                customerList.add(customers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }


    private String inputNameCustomer() {
        String nameCustomer = null;
        boolean isCheck = false;
        do {
            try {

                System.out.println("Input name customer : ");
                nameCustomer = input.nextLine();
                if (Validate.isNameCustomer(nameCustomer.trim())) {
                    isCheck = true;
                } else {
                    throw new NameException("Customer name must capitalize the first letter in each word");
                }
            } catch (NameException e) {
                System.err.println(e.getMessage());
            }
        } while (!isCheck);
        return nameCustomer;
    }

    private String inputBirthday() {
        String birthday = null;
        boolean isCheck = false;
        do {
            try {
                System.out.println("Input birthday customer : ");
                birthday = input.nextLine();
                if (Validate.isBirthday(birthday)) {
                    isCheck = true;
                } else {
                    throw new BirthdayException("The year of birth must be > 1900 and less than the current year 18 years, in the correct format dd / mm / yyyy");
                }

            } catch (BirthdayException e) {
                System.err.println(e.getMessage());
            }
        } while (!isCheck);
        return birthday;
    }

    private String inputCmnd() {
        String cmnd;
        boolean isCheck = false;
        do {
            System.out.println("Input cmnd :  ");
            cmnd = input.nextLine();
            if (Validate.cmnd(cmnd)) {
                isCheck = true;
            }
        } while (!isCheck);
        return cmnd;
    }

    private String inputPhoneNumber() {
        String phoneNumber;
        boolean isCheck = false;
        do {
            System.out.println("Input phone number : ");
            phoneNumber = input.nextLine();
            if (Validate.phoneNumber(phoneNumber)) {
                isCheck = true;
            }
        } while (!isCheck);
        return phoneNumber;
    }

    private String inputEmail() {
        String email = null;
        boolean isCheck = false;
        do {
            try {
                System.out.println("Input email customer");
                email = input.nextLine();
                if (Validate.emailCustomer(email)) {
                    isCheck = true;
                } else {
                    throw new EmailExeption("Email must be in the correct format abc@abc.abc");
                }
            } catch (EmailExeption e) {
                System.err.println(e.getMessage());
            }
        } while (!isCheck);
        return email;
    }

    private String inputTypeCustomer() {
        System.out.println("Input type customer");
        return input.nextLine();
    }

    private String inputAddress() {
        System.out.println("Input address :  ");
        return input.nextLine();
    }

    private String inputGender() {
        String gender = null;
        boolean isCheck = false;
        do {
            try {
                System.out.println("Input gender customer : ");
                gender = input.nextLine();
                if (Validate.genderCustomer(gender)) {
                    String[] str = (gender.toLowerCase()).split("");
                    StringBuilder genders = new StringBuilder(str[0].toUpperCase());
                    for (int i = 1; i < str.length; i++) {
                        genders.append(str[i]);
                    }
                    gender = genders.toString();
                    isCheck = true;
                } else {
                    throw new GenderException("You entered incorrectly.Please re-enter");
                }

            } catch (GenderException e) {
                System.err.println(e.getMessage());
            }
        } while (!isCheck);
        return gender;
    }

    private String inputIdCard() {
        String idCard = null;
        boolean isCheck = false;
        do {
            try {
                System.out.println("Input Id card : ");
                idCard = input.nextLine();
                if (Validate.idCard(idCard)) {
                    isCheck = true;
                } else {
                    throw new IdCardException("Id Card must have 9 digits and be in format XXX XXX XXX");
                }
            } catch (IdCardException e) {
                System.err.println(e.getMessage());
            }
        } while (!isCheck);
        return idCard;
    }

    public void showInformationOfCustomer() {
        List<Customer> customerList = readDataCustomer();
        Collections.sort(customerList,new SortNameCustomer());
        for (Customer customer : customerList) {
            System.out.println(customer.showInfor());
        }
    }
}
