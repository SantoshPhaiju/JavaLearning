package LabReports;

import java.io.File;
import java.io.IOException;

public class Lab47 {
    public static void main(String[] args) {
        /* Write a Java program that:
        Checks if a directory named "MyData" exists in the current working directory.
        If it doesn’t exist, create it.
        Inside the directory, create a new file called "info.txt".
        */

        String currentDir = System.getProperty("user.dir");
        File dir = new File(currentDir + File.separator + "MyData");

        // Check if directory exists
        if (!dir.exists()) {
            dir.mkdir();
        }

        // Create a new file "info.txt" inside the directory
        File file = new File(dir, "info.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File 'info.txt' created inside 'MyData'.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }


    }
}
