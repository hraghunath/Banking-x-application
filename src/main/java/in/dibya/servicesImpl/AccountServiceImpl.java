package in.dibya.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.dibya.entity.Account;
import in.dibya.entity.AccountType;
import in.dibya.entity.Customer;
import in.dibya.repository.AccountRepository;
import in.dibya.services.AccountService;

public class AccountServiceImpl implements AccountService {

	@Autowired
    private AccountRepository accountRepository;
    
    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
    
    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Account> getAccountsByCustomer(Customer customer) {
        return accountRepository.findByCustomer(customer);
    }
    
    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
    
    @Override
    public Account deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
        if (account.getAccountType() == AccountType.SAVINGS) {
            account.setBalance(account.getBalance() + (amount * 0.005));
        }
        return accountRepository.save(account);
    }
    
    @Override
    public Account withdraw(Account account, Double amount) {
        account.setBalance(account.getBalance() - amount);
        account.setBalance(account.getBalance() - (amount * 0.0005));
        return accountRepository.save(account);
    }
    
    @Override
    public Account transfer(Account fromAccount, Account toAccount, Double amount) {
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.save(fromAccount);
        return accountRepository.save(toAccount);
}
}

