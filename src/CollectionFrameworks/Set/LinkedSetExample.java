package CollectionFrameworks.Set;

import java.util.*;

public class LinkedSetExample {
    public static void main(String[] args) {
        Set <String> myLinkedHashTest = new LinkedHashSet<>();
        myLinkedHashTest.add("Virat Kohli");
        myLinkedHashTest.add("AB Devillers");
        myLinkedHashTest.add("Alexandria");
        myLinkedHashTest.add("chris Gyale");
        myLinkedHashTest.add("Anil Shah");

        Iterator <String> myIterator = myLinkedHashTest.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
