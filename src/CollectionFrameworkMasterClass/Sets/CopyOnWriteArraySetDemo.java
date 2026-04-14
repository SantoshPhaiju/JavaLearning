package CollectionFrameworkMasterClass.Sets;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // similar as CopyOnWriteArrayList
        // but why se this? why need this?
        // because HashSet, LinkedHashSet, TreeSet, EnumSet are not thread safe, if multiple threads tries to modify the set at the same time then, data corruption will occur, can occur concurrent modification exception
        // but we do have ConcurrentSkipListSet, why to use CopyOnWriteArraySet??? because there in ConcurrentSkipListSet:- we do have the elements stored in sorted form and there is different requirement like: we need sorted elements, need to use range based operations like: larger than this element smaller than this element type of thing. Here elements are stored in skiplist data structure

        // but in CopyOnWriteArraySet:- we do not have the elements stored in sorted form, elements are stored in array internally.
        // Both of them have different use cases

        /**
         *
         * CopyOnWriteArraySet:-
         * Thread-safe
         * Copy-On-Write Mechanism
         * No Duplicate Elements
         * Iterators do no reflects modifications
         *
         */

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("Iterating and modifying CopyOnWriteArraySet: ");
        for (Integer num : copyOnWriteArraySet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set while iterating
            copyOnWriteArraySet.add(6);
            // it doesn't prints 6 because it is not added to the set because it is a copy of the set and not the original set
        }

        System.out.println(copyOnWriteArraySet); // it prints the original set because it is not a copy of the set and also prints 6 because it is added to the set

        System.out.println("Iterating and modifying ConcurrentSkipListSet: ");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // Attempting to modify the set while iterating
            if (num == 5) {
                concurrentSkipListSet.add(6); // now it will not print 6
            }
//            concurrentSkipListSet.add(6); // this will add and print
            // it prints 6 because it is added to the set and it is not using the copy of the set and working on the original set it prints 6 too here, It is called Weakly consistent, because it can reflect the changes while reading or it will not reflect not sure..
        }


        // If we are doing read-intensive tasks we use CopyOnWriteArraySet, because for every write a new copy of the set is made so not so efficient
        // For frequent read and write we use concurrentskiplistSet for balance


    }
}
