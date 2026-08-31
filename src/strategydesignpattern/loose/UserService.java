package strategydesignpattern.loose;

public class UserService {
    // field injection
    public NotificationService notificationService;

    public UserService() {
    }

    // constructor injection
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.send(message);
    }

    // setter injection
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
