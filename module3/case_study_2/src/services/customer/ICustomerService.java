package services.customer;

import model.customer_employee.Customer;

import java.util.List;

public interface ICustomerService {
    List getAllCustomer();
    void createCustomer(Customer customer);
    Customer getCustomer(int id);
}
