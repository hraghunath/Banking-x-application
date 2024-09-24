package in.dibya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dibya.entity.Customer;
import in.dibya.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByCustomer(Customer customer);
}

