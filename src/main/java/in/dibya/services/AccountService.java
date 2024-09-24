package in.dibya.services;

import java.util.List;

import in.dibya.entity.Account;
import in.dibya.entity.Customer;

public interface AccountService {
	 Account createAccount(Account account);
	    Account getAccount(Long id);
	    List<Account> getAccountsByCustomer(Customer customer);
	    void deleteAccount(Long id);
	    Account deposit(Account account, Double amount);
	    Account withdraw(Account account, Double amount);
	    Account transfer(Account fromAccount, Account toAccount, Double amount);


}
