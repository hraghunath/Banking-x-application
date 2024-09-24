package in.dibya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.dibya.entity.Account;
import in.dibya.entity.Customer;
import in.dibya.services.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }
    
    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }
    
    @GetMapping("/customer/{customerId}")
    public List<Account> getAccountsByCustomer(@PathVariable Long customerId) {
        return accountService.getAccountsByCustomer(new Customer(customerId));
    }
    
    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
    
    @PostMapping("/deposit")
    public Account deposit(@RequestBody Account account, @RequestParam Double amount) {
        return accountService.deposit(account, amount);
    }
    
    @PostMapping("/withdraw")
    public Account withdraw(@RequestBody Account account, @RequestParam Double amount) {
        return accountService.withdraw(account, amount);
    }
    
    @PostMapping("/transfer")
    public Account transfer(@RequestBody Account fromAccount, @RequestBody Account toAccount, @RequestParam Double amount) {
        return accountService.transfer(fromAccount, toAccount, amount);
        
        
    }
}
