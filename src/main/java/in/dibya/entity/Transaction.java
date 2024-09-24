package in.dibya.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Transactions")
public class Transaction {
	
	     @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Date transactionDate;
	    private String transactionType;
	    private Double amount;
	    @ManyToOne
	    @JoinColumn(name = "from_account_id")
	    private Account fromAccount;
	    @ManyToOne
	    @JoinColumn(name = "to_account_id")
	    private Account toAccount;


}
