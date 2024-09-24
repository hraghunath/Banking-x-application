package in.dibya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Account;
import in.dibya.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByFromAccount(Account account);
    List<Transaction> findByToAccount(Account account);


}
