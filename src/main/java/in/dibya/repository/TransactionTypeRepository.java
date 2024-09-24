package in.dibya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.TransactionType;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Long> {
    Optional<TransactionType> findByName(String name);
}

