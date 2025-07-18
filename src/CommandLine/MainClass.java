package CommandLine;

public class MainClass {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World");
            int i = 0;
            for (String arg : args) {
                i++;
                System.out.println("Arg: " + i + " " + arg);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
