package LabReports;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab35 {
    public static void main(String[] args) {
        // Write a Java program that stores a group of names in both HashSet and TreeSet, and prints the result to show the difference in ordering.

        Set<String> names = new HashSet<>();
        names.add("Santosh");
        names.add("Saugat");
        names.add("Alisha");
        names.add("Messi");
        names.add("Ronaldo");

        Set<String> orderedNames = new TreeSet<>(names);

        System.out.println("hash set no ordering " + names);
        System.out.println("tree set with ordering " + orderedNames);

    }
}
