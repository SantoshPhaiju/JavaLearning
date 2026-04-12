package CollectionFrameworks.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample {
    public static void main(String[] args) {
        Set<String> myLinkedHashTest = new LinkedHashSet<>();
        myLinkedHashTest.add("Virat Kohli");
        myLinkedHashTest.add("AB Devillers");
        myLinkedHashTest.add("Alexandria");
        myLinkedHashTest.add("chris Gyale");
        myLinkedHashTest.add("Anil Shah");

        Iterator<String> myIterator = myLinkedHashTest.iterator();

        System.out.println();
        System.out.println("Using iterator and while loop");
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }

        System.out.println();
        System.out.println("Using enhanced for loop");
        for (String item : myLinkedHashTest) {
            System.out.println(item);
        }
    }
}
