package in.dibya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Account;
import in.dibya.entity.Customer;

public interface AccountRepository extends JpaRepository<Account, Long> {

	
	 List<Account> findByCustomer(Customer customer);

}
