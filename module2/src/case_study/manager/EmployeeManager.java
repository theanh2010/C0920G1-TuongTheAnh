package case_study.manager;

import case_study.commons.file_unit.FileUtils;
import case_study.controller.main_controller.MainController;
import case_study.models.employee.Employee;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class EmployeeManager extends Employee {
    public static void employeeFile(){
            Boolean check = true;
            System.out.println("Nhập tên nhân viên cần tìm!");
            String checkEmployee = MainController.input.nextLine();
            Stack<Employee> employeeStacks = FileUtils.readFileEmployeeStack();
            for (Employee employee : employeeStacks){
                if (employeeStacks.isEmpty()){
                    System.out.println("Không có hồ sơ nào trong stack ");
                    break;
                } else if (checkEmployee.equals(employee.getNameEmployee())){
                    System.out.println("Tìm thấy nhân viên trong stack");
                    System.out.println("Name Employee: "+employee.getNameEmployee() +
                            "\n Address :" + employee.getAddressEmployee() +
                            "\n ID :" + employee.getAgeEmployee());
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("Không tìm thấy nhân viên trong danh sách!");
            }
        }
    public static void showInformationOfEmployee() {
            Map<Integer, Employee> employeeMaps = FileUtils.readFileEmployee();
            for (Map.Entry<Integer, Employee> employees : employeeMaps.entrySet()) {
                System.out.println(employees.toString());
            }
            boolean check = false;
            Set<Integer> keys = employeeMaps.keySet();
            boolean check1 = true;
            Integer number = null;
            do {
                System.out.println("Chọn hành động" +
                        "\n1. Tìm kiếm nhân viên bằng ID" +
                        "\n2. Tìm kiếm nhân viên bằng tên");
                String choose = MainController.input.nextLine();
                switch (choose) {
                    case "1": {
                        System.out.println("Nhập ID: ");
                        number = MainController.input.nextInt();
                        for (Integer i : keys) {
                            if (i == number) {
                                check1 = false;
                            }
                        }
                        break;
                    }
                    case "2": {
                        employeeFile();
                        MainController.showMenu();
                        break;
                    }
                }
            }
            while (check1);
            Employee employee = employeeMaps.get(number);
            System.out.println(employee.toString());
        }
}