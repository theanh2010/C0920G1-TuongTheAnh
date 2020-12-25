package services.customer;

import model.customer_employee.Customer;
import repository.customer.CustomerRepository;
import repository.customer.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.creatCustomer(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepository.getCustomer(id);
    }
}
