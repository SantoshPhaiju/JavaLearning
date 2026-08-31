package strategydesignpattern;

import strategydesignpattern.loose.EmailNotificationService;
import strategydesignpattern.loose.NotificationService;
import strategydesignpattern.loose.SMSNotificationService;
import strategydesignpattern.loose.UserService;

public class LooseDemo {
    public static void main(String[] args) {
        // loose coupling

        NotificationService notificationService;
        notificationService = new SMSNotificationService();
        UserService userService = new UserService(notificationService);
        userService.notify("Hello springboot.");

        notificationService = new EmailNotificationService();
        userService = new UserService(notificationService);

        userService.notify("Hello springboot.");
    }
}
