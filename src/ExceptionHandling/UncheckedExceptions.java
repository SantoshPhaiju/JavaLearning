package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // which exceptions are checked during compile time is checked exception
        // those exceptions which are not checked during compilation is unchecked exception

           try (BufferedReader reader = new BufferedReader(new FileReader("a.txt"))) {
               String line;
               while ((line = reader.readLine()) != null) {
                   System.out.println(line);
               }
           } catch (IOException e) {
               System.out.println(e.getMessage());
           }

    }
}
