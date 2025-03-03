package unit2;

public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // Automatically converts int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);

        // Explicit Type Casting (Narrowing)
        double originalDouble = 99.99;
        int narrowedInt = (int) originalDouble; // Manually converts double to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + originalDouble);
        System.out.println("Converted to int: " + narrowedInt); // Fractional part lost

        // Another Example of Explicit Casting (char to int)
        char letter = 'A';
        int asciiValue = (int) letter; // Explicitly converting char to int

        System.out.println("\nExplicit Casting (char to int):");
        System.out.println("Character: " + letter);
        System.out.println("ASCII Value: " + asciiValue);
    }
}

