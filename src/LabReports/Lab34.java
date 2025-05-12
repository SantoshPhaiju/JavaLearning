package LabReports;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab34 {
    public static void main(String[] args) {
        // Write a Java program to demonstrate. Use of List to store duplicate values. Use of Set to store unique values.Print both collections.

        List<Integer> myList = new ArrayList<Integer>();
        // storing duplicates
        myList.add(14);
        myList.add(34);
        myList.add(12);
        myList.add(14);
        myList.add(14);

        Set<Integer> mySet = new HashSet<>(myList);

        System.out.println("List (allows duplicates): " + myList);
        System.out.println("Set allows (Unique values only): " + mySet);

    }
}
