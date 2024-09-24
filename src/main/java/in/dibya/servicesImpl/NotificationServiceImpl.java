package in.dibya.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.dibya.entity.Customer;
import in.dibya.entity.Notification;
import in.dibya.repository.NotificationRepository;
import in.dibya.services.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;
    
    @Override
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
    
    @Override
    public Notification getNotification(Long id) {
        return notificationRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Notification> getNotificationsByCustomer(Customer customer) {
        return notificationRepository.findByCustomer(customer);
    }
}

