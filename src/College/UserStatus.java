package College;

import java.util.Scanner;

public class UserStatus
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userStatus = scanner.nextLine();
        Status status = Status.valueOf(userStatus);

        switch (status){
            case ACTIVE:
                System.out.println("User is active");
                break;

            case INACTIVE:
                System.out.println("User is inactive");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
