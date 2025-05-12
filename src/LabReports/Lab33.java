package LabReports;

import java.util.ArrayList;
import java.util.Collections;

public class Lab33 {
    public static void main(String[] args) {
        // Write a Java program that stores 5 integers using an ArrayList, sorts them in ascending order using Collections.sort(), and displays the result.

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(26);
        myList.add(33);
        myList.add(12);
        myList.add(5);

        Collections.sort(myList);
        System.out.println(myList);


    }
}
