package RecordEx;

public class Demo {

    // record is a class which hold the immutable data
    public record NewUser(String name, int age) {
    }

    public record UserResponse(String name, Long id, String email) {
    }


    public static void main(String[] args) {
        NewUser user = new NewUser("Santosh", 25);
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user.age);

        UserResponse response = new UserResponse("Santosh", 1L, "santoshphaiju@gmail.com");
        System.out.println(response);
    }
}
