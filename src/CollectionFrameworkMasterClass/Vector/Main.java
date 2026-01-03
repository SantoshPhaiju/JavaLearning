package CollectionFrameworkMasterClass.Vector;

import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // it is thread safe unlike arraylist and linkedlist
        // it is same like arraylist

        // it has default capacity of 10 and we can also pass the initial capacity of it in constructor
        Vector<Integer> newVector = new Vector<>(); // initial capacity is 10
//        Vector<Integer> myVector = new Vector<>(5); // initial capacity is 11
        Vector<Integer> myVector = new Vector<>(5, 3); // here this is initial capacity and growth factor, here capacity will increased by 3, 5 + 3 = 8;

        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        System.out.println(myVector.capacity());
        myVector.add(1);

        // here initial capacity is increased by double unlike arraylist where it was 1.5 times.
        // here in vector we can check the capacity too unlike arraylist where we couldn't do that.
        System.out.println(myVector.capacity());  // 5 + 3 = 8;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

//        Vector<Integer> vector1 = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        Vector<Integer> vector1 = new Vector<>(linkedList); // here we are passing collection in constructor
        vector1.add(3);
        System.out.println(vector1);


        //  methods in vector:

        /*
        • add(E e): Adds an element at the end.
        • add(int index, E element): Inserts an element at the specified index.
        • get(int index): Retrieves the element at the specified index.
        • set(int index, E element): Replaces the element at the specified index.
        • remove(Object o): Removes the first occurrence of the specified element.
        • remove(int index): Removes the element at the specified index.
        • size(): Returns the number of elements in the vector.
        • isEmpty(): Checks if the vector is empty.
        • contains(Object o): Checks if the vector contains the specified element.
        • clear(): Removes all elements from the
         */


    }
}
