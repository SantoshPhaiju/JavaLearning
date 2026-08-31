package strategydesignpattern.loose;

public class UserService {
    NotificationService notificationService;

    public UserService() {
    }

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message) {
        notificationService.send(message);
    }
}
