package strategydesignpattern;

import strategydesignpattern.tight.UserService;

public class TightDemo {
    public static void main(String[] args) {

        // tight coupling
        UserService userService = new UserService();
        userService.notify("Hello springboot.");
    }
}
