package College;

import java.util.Scanner;

public class UserStatus
{

    /**
     * Increases the car's speed by the specified amount.
     *
     * @param amount The amount by which to increase the speed (must be positive).
     * @return The new speed after acceleration.
     * @throws IllegalArgumentException If the amount is negative.
     */
//    public int accelerate(int amount) throws IllegalArgumentException {
//        if (amount < 0) {
//            throw new IllegalArgumentException("Amount must be positive");
//        }
//        this.speed += amount;
//        return this.speed;
//    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String userStatus = scanner.nextLine();
        Status status = Status.valueOf(userStatus);

        /**
         * status used for switching status
         */



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
