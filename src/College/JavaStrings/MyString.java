package College.JavaStrings;

public class MyString {
    public static void main(String[] args) {
        // write a program to concatenate the strings

        String firstName = "Santosh";
        String lastName = "Phaiju";
        String number = "123456789";
        String number2 = "123456789";
        System.out.println(Integer.parseInt(number) + Integer.parseInt(number2));
        System.out.println(number + number2);

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);

        System.out.println(fullName);
        System.out.println(fullName2);


        try {
            System.out.println(Integer.parseInt(firstName));
        } catch (NumberFormatException e) {
            System.out.println("String characters cannot be converted to an integer:- " + e.getMessage());
        }

    }
}
