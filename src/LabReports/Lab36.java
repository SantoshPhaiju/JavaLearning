package LabReports;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab36 {
    public static void main(String[] args) {

        // Write a Java program that:Uses an Iterator to access elements of a LinkedList.Prints only the even numbers from a list of integers.

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(37);
        myLinkedList.add(15);
        myLinkedList.add(22);
        myLinkedList.add(33);
        myLinkedList.add(40);

        Iterator<Integer> iterator = myLinkedList.iterator();

        System.out.println("Printing only even from the linkedlist:- ");
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }
}
