package in.dibya.services;


import java.util.List;

import in.dibya.entity.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);
    Customer getCustomer(Long id);
    List<Customer> getAllCustomers();
    void deleteCustomer(Long id);

}
