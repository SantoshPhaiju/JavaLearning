package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        File myFile = new File("myfile.txt");

        System.out.println(System.getProperty("user.dir"));
        try {
        FileWriter fw = new FileWriter("src/filehandling/myfile.txt");
            fw.write("Files in Java might be tricky, but it is fun enough!");
            fw.close();
            System.out.println("Files in Java might be tricky! but written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }



//        try {
//            if(myFile.createNewFile()) {
//                System.out.println("File created: " + myFile.getName());
//            } else {
//                System.out.println("File already exists: " + myFile.getName());
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            e.printStackTrace();
//        }

    }
}
