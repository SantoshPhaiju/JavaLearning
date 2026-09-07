package CollectionFrameworkMasterClass.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheRev<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCacheRev(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }


    public static void main(String[] args) {
        LRUCacheRev<Integer, String> myMap = new LRUCacheRev<>(3);
        myMap.put(1, "A");
        myMap.put(2, "B");
        myMap.put(3, "C");
        myMap.get(1);
        myMap.put(4, "D");
        System.out.println(myMap);
    }
}
