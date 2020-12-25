package repository.employee;

import model.customer_employee.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List getALlEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void saveEdit(Employee employee);
    void deleteEmployee(int id);
//    public void insertEmployee(Employee employee) throws SQLException;
//
//    public Employee selectEmployee(int employee_id);
//
//    public List<Employee> selectAllEmployee();
//
//    public boolean deleteEmployee(int employee_id) throws SQLException;
//
//    public boolean updateEmployee(Employee employee) throws SQLException;
//
//    public Employee getEmployeeById(int employee_id);
//
//    public void insertEmployeeStore(Employee employee) throws Exception;
}
