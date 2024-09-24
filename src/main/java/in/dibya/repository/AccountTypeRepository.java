package in.dibya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.AccountType;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    Optional<AccountType> findByName(String name);
}

