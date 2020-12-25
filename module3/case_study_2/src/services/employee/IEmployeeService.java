package services.employee;

import model.customer_employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List getAllEmployee();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void saveEdit(Employee employee);

    void deleteEmployee(int id);
}
