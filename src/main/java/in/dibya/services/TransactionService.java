package in.dibya.services;

import java.util.List;

import in.dibya.entity.Account;
import in.dibya.entity.Transaction;

public interface TransactionService {

	 Transaction createTransaction(Transaction transaction);
	    Transaction getTransaction(Long id);
	    List<Transaction> getTransactionsByAccount(Account account);
	}

