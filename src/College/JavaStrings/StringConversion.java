package College.JavaStrings;

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to convert to int: ");
        String str = sc.nextLine();

        try {
            System.out.println("Integer value: " + Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }

        String name = "santosh phaiju";
        System.out.println(name.toUpperCase());
        String newName = "Santosh Phaiju HEHE";
        System.out.println(newName.toLowerCase());
        System.out.println("chat at 4 of new name is:- " + newName.charAt(5));
    }
}
