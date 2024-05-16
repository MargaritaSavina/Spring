package ru.gb.example3_sem3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.example3_sem3.domain.User;

@Service
public class RegistrationService {

    @Autowired
    private  DataProcessingService dataProcessingService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
    @Autowired
    UserService userService;
    @Autowired
    NotificationService notificationService;

    public void processRegistration(String name, int age, String email){
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setEmail(email);
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
        notificationService.sendNotification(user.getName()+" add to repository");
    }
}
