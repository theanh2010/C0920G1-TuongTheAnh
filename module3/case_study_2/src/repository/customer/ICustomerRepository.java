package repository.customer;

import model.customer_employee.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer selectCustomer(int customer_id);

    public List<Customer> selectAllCustomer();

    public boolean deleteCustomer(int customer_id) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;

    public Customer getCustomerById(int customer_id);

    public void insertCustomerStore(Customer customer) throws SQLException;
}
