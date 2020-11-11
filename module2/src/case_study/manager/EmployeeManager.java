package case_study.manager;

import case_study.models.employee.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeManager {
    public static void showInformationOfEmployee() {
        Employee employee1 = new Employee("Lê Văn A", 11, "Đà Nẵng");
        Employee employee2 = new Employee("Trần Văn C", 12, "Hải Phòng");
        Employee employee3 = new Employee("Lê Tuấn D", 13, "Nam Định");
        Employee employee4 = new Employee("Nguyễn Thị A", 14, "Thái Bình");
        Employee employee5 = new Employee("Trần Thị Z", 15, "Quảng Nam");
        Employee employee6 = new Employee("Nguyễn Văn G", 16, "Quảng Ngãi");
        Employee employee7 = new Employee("Lê Thị C", 17, "Hà Nội");
        Employee employee8 = new Employee("Đặng Văn G", 18, "Hồ Chí Minh");
        Employee employee9 = new Employee("Lê Văn Tê", 19, "Đà Nẵng");
        Employee employee10 = new Employee("Mai Nam Khánh", 20, "Cần Thơ");
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, employee1);
        employeeMap.put(2, employee2);
        employeeMap.put(3, employee3);
        employeeMap.put(4, employee4);
        employeeMap.put(5, employee5);
        employeeMap.put(6, employee6);
        employeeMap.put(7, employee7);
        employeeMap.put(8, employee8);
        employeeMap.put(9, employee9);
        employeeMap.put(10, employee10);

        for (Map.Entry<Integer, Employee> employees : employeeMap.entrySet()) {
            System.out.println(employees.toString());
        }

        boolean check = false;
//        for (Map.Entry<Integer, Employee> employees1 : employeeMap.entrySet()) {
//            for (Map.Entry<Integer, Employee> employees2 : employeeMap.entrySet()) {
//                if (number == employees2.getKey()) {
//                    System.out.println(employees2.toString());
//                    check = true;
//                    break;
//                }
//            }
//            if (!check) {
//                System.out.println("ID không đúng Vui lòng nhập lại: ");
//                number = input.nextInt();
//            }
//        }
       Set<Integer> keys= employeeMap.keySet();
       boolean check1=true;
        Integer number = null;
       do {
           System.out.println("Enter Id Employee : ");
           Scanner input = new Scanner(System.in);
           number = input.nextInt();
           for (Integer i :keys){
               if (i==number){
                   check1=false;
               }
           }
       }while (check1);

        Employee employee = employeeMap.get(number);
        System.out.println(employee.toString());
    }
}
