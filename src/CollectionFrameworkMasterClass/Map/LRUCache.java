package CollectionFrameworkMasterClass.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("A", 88);
        studentMap.put("B", 93);
        studentMap.put("C", 78);
        studentMap.get("A");
        studentMap.put("D", 58);


        System.out.println(studentMap);

    }
}
