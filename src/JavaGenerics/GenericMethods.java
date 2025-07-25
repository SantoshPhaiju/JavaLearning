package JavaGenerics;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        Integer[] myArray = {3, 2, 4, 7};
        String[] stringArray = {"Santosh", "Phaiju"};
        gm.printArray(stringArray);
        gm.printArray(myArray);
        display(55);
        display("Santosh Phaiju");
        display(3.1415);
    }

    public <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println("Element: " + element);
        }
        System.out.println();

    }

    public static <T> void display (T value) {
        System.out.println("Generic Display: " + value);
    }

    public static void display (Integer value) {
        System.out.println("Integer Display: " + value);
    }
}
