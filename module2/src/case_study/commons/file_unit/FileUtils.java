package case_study.commons.file_unit;

import case_study.models.customer.Customer;
import case_study.models.employee.Employee;

import java.io.*;
import java.util.*;

public class FileUtils {
    public static  void fileWriter (String pathFile , String line , boolean append){
        try {
            FileWriter fileWriter = new FileWriter(pathFile,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readDataCustomer() {
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
                        countLine[9],
                        countLine[10]);
                customerList.add(customers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
        public static List<String[]> readFile(String filePath){
        List<String[]> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] elementLine = line.split(",");
                list.add(elementLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static Map<Integer, Employee> readFileEmployee(){
        int count = 1;
        Stack<Employee> employeeStack = new Stack<>();
        Map<Integer, Employee> employeeMap = new TreeMap<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/case_study/data/Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] elementLine = line.split(",");
                Employee employees = new Employee(elementLine[0], elementLine[1], elementLine[2]);
                employeeMap.put(count,employees);
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeMap;
    }

    public static Stack<Employee> readFileEmployeeStack(){
        int count = 1;
        Stack<Employee> employeeStack = new Stack<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/case_study/data/Employee.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] elementLine = line.split(",");
                Employee employees = new Employee(elementLine[0], elementLine[1], elementLine[2]);
                employeeStack.push(employees);
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeStack;
    }

}
