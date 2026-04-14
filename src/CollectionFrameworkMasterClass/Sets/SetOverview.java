package CollectionFrameworkMasterClass.Sets;

import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements

        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        //noinspection ExtractMethodRecommender
        SortedSet<Integer> set = new TreeSet<>(); // tree set for sorted order
//        Set<Integer> set = new LinkedHashSet<>(); // linked hash set for maintaining insertion order
//        Set<Integer> set = new HashSet<>();

        // set is same like the keys in Map okay.
//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> integers = map.keySet();
        set.add(12);
        set.add(23);
        set.add(34);
        set.add(34);
        set.add(34);
        set.add(34); // no duplicate entries in set.
        set.add(45);
        set.add(53);
        set.add(645);
        set.add(82);
//        set.remove(3);
        set.add(10);
        set.add(9);
        set.add(7);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(12));
        System.out.println(set.contains(100));
        System.out.println(set.remove(9));


        for (int i : set) {
            System.out.println(i);
        }

//        set.clear();
        System.out.println(set.isEmpty());

        // for thread safety
        // it wraps set in synchronized block externally, every method is wrapped in synchronized block, and every operations are blocking, so basically we don't use this. not recommended
        Set<Integer> integers = Collections.synchronizedSet(set);

        System.out.println(integers);

        // We use concurrentskiplistset instead of collections.synchronizedset() okay sir...
        // it is thread safe and faster than synchronized set. and has built in thread safety.
//        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
//        NavigableSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>(); // it is highly recommended...


//        Set<Integer> syncSet = Collections.synchronizedSet(new TreeSet<>());
//
//        syncSet.add(1);
//        syncSet.add(2);
//        syncSet.add(3);
//
//        synchronized (syncSet) {
//            for (Integer i : syncSet) {
//                // safe iteration
//                System.out.println(i);
//            }
//        }

        // as unmodifiable map we also have unmodifiable set

        Set<Integer> integers1 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12); // in Map.of() we can't have more than 10 entries, but we can have more than 10 entries in Set.of()
        System.out.println(integers1);

        Set<Integer> integers2 = Collections.unmodifiableSet(integers1); // it becomes immutable
        System.out.println(integers2);


    }
}
