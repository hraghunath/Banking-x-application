package in.dibya.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.dibya.entity.Account;
import in.dibya.entity.AccountType;
import in.dibya.entity.Customer;
import in.dibya.repository.CustomerRepository;
import in.dibya.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public Customer createCustomer(Customer customer) {
        // Create Current and Savings accounts
        Account currentAccount = new Account(AccountType.CURRENT, 0.0);
        Account savingsAccount = new Account(AccountType.SAVINGS, 500.0);
        customer.getAccounts().add(currentAccount);
        customer.getAccounts().add(savingsAccount);
        return customerRepository.save(customer);
    }
    
    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

