package CollectionFrameworks.Set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> myTreeSet = new TreeSet<>();

        System.out.println("List of great footballers in the history: ");
        myTreeSet.add("Messi");
        myTreeSet.add("ronaldo");
        myTreeSet.add("neymar");
        myTreeSet.add("Lewandwoski");
        myTreeSet.add("alisha sedai");

        Iterator<String> iterator = myTreeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
