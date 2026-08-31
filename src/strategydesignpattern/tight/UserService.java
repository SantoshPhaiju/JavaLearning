package strategydesignpattern.tight;

public class UserService {
    NotificationService notificationService = new NotificationService();

    public void notify(String message) {
        notificationService.send(message);
    }
}
