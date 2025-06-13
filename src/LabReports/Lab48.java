package LabReports;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Lab48 {
    public static void main(String[] args) {
        /*
        Write a Java program using FileOutputStream to write the string "Hello Byte Stream" into a file named byte_output.txt, and another program using FileWriter to write "Hello Character Stream" into a file named char_output.txt.
         */

        String byteString = "Hello Byte Stream";
        String charString = "Hello Character Stream";

        try (FileOutputStream fos = new FileOutputStream("byte_output.txt")){
            fos.write(byteString.getBytes());
            System.out.println("Data written to byte_output.txt using FileOutputStream");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter("char_output.txt")) {
            writer.write(charString);
            System.out.println("Data written to char_output.txt using FileWriter");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
