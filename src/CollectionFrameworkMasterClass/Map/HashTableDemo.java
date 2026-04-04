package CollectionFrameworkMasterClass.Map;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // hashtable is just like hashmap but it is thread safe

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        // hashtable is synchronized
        // no null key or value allowed
        // legacy class -> nobody uses it now and replaced by ConcurrentHashMap
        // slower than hashmap because of synchronization
        // all the methods of hashtable are synchronized okay
        // it is slower than hashmap so we use concurrent hashmap
        hashtable.put("Santosh", 20);
        hashtable.put("Messi", 25);
        System.out.println(hashtable);
        System.out.println(hashtable.get("Santosh"));
        hashtable.values().forEach(System.out::println);

        // all the methods of hashmap are available in hashtable as well like put, get, remove, containsKey, containsValue, etc. becuase it implements map interface

//        hashtable.put(null, 2); // throws exception
//        hashtable.put("Santosh", null); // throws exception

        // used bucket system as hashmap uses hashcode to find the index

//        HashMap<Integer, String> map = new HashMap<>();
        Hashtable<Integer, String> map = new Hashtable<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // this will not print 2000 when using hashmap because it is not synchronized and not using locks. but print 2000 when using hashtable.
        System.out.println("Final size of map: " + map.size());
    }
}
