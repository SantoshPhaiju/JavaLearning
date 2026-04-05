package CollectionFrameworkMasterClass.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        // it is not sorted by default
//        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // in java 7 --> it works based on segments based locking --> divided in 16 segments by default --> which are smaller hashmaps
        // in this every segment it has its own independent locking
        // only the segment being written to or read from is locked.
        // read: do not require locking unless there is a write operation happening on the same segment.
        // write: require locking.

        // java 8 --> no segmentation anymore, it is based on lock striping.
        // it works on the compare-and-swap approach --> no locking except resizing or collision
        // Thread A saw --> x = 42
        // Thread A work --> x to 50
        // if x is still 42 change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREADSAFE --> ConcurrentSkipListMap

        map.put("santosh", 99);
        map.put("neha", 98);
        map.put("akshit", 97);
        map.put("shubham", 96);
        map.put("vipul", 95);
        map.put("nitin", 94);
        map.put("sagar", 93);

        System.out.println(map);


    }
}
