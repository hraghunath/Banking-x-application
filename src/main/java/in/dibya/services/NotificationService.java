package in.dibya.services;

import java.util.List;

import in.dibya.entity.Notification;

import in.dibya.entity.Customer;

public interface NotificationService {
	Notification createNotification(Notification notification);
    Notification getNotification(Long id);
    List<Notification> getNotificationsByCustomer(Customer customer);


}
