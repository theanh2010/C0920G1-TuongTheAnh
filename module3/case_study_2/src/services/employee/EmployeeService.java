package services.employee;

import model.customer_employee.Employee;
import repository.employee.EmployeeRepository;
import repository.employee.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List getAllEmployee() {
        return employeeRepository.getALlEmployee();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.getEmployee(id);
    }

    @Override
    public void saveEdit(Employee employee) {
        employeeRepository.saveEdit(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }
}
