package Projects.PasswordGenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class PasswordGenerator {

    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder password = getStringBuilder(uppercase, lowercase);

        // Shuffle characters to avoid predictable patterns
        ArrayList<Character> passwordList = new ArrayList<>();
        for (char c : password.toString().toCharArray()) {
            passwordList.add(c);
        }
        Collections.shuffle(passwordList);

        // Convert shuffled list back to string
        StringBuilder finalPassword = new StringBuilder();
        for (char c : passwordList) {
            finalPassword.append(c);
        }

        System.out.println("Generated Password: " + finalPassword.toString());
    }

    private static StringBuilder getStringBuilder(String uppercase, String lowercase) {
        String digits = "0123456789";
        String specialCharacters = "~`!@#$%^&*()_-+=?/{}[]";
        String allChars = uppercase + lowercase + digits + specialCharacters;

        int length = 15;
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();  // More secure than Random

        // Ensure at least one character from each category
        password.append(uppercase.charAt(random.nextInt(uppercase.length())));
        password.append(lowercase.charAt(random.nextInt(lowercase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Fill remaining length with random characters
        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }
        return password;
    }
}
