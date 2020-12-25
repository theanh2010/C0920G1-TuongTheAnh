package repository.customer;

import model.customer_employee.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    List getAllCustomer();

    void creatCustomer(Customer customer);

    Customer getCustomer(int id);
}
