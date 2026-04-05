package CollectionFrameworkMasterClass.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        // in concurrentskiplistmap the data is stored in the skiplist data structure
        // skiplist data structure is a probabilistic data structure that allows for efficient search, insertion and deletion operation. It is similar to a sorted linked list but with multiple layers that "skip" over portions of the list to provide faster access to elements.
        // in the skip list the data is stored in multiple layers of sorted linkedlist, where in each layer certain data is skipped like:
        /*
            layer 3: 1 5 9
            layer 2: 1 3 5 7 9
            layer 1: 1 2 3 4 5 6 7 8 9
         */


        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 1);
        // and all the things are same, and main use case is in concurrent environment when working in multithreaded environment.
    }
}
