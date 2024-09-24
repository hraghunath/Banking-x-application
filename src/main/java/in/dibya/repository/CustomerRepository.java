package in.dibya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	 Optional<Customer> findByEmail(String email);


}
