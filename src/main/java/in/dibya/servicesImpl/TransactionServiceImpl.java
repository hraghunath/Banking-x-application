package in.dibya.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.dibya.entity.Account;
import in.dibya.entity.Transaction;
import in.dibya.repository.TransactionRepository;
import in.dibya.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    
    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    
    @Override
    public Transaction getTransaction(Long id) {
        return transactionRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Transaction> getTransactionsByAccount(Account account) {
        return transactionRepository.findByFromAccount(account);
    }
}


