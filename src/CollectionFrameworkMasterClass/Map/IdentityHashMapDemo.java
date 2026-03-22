package CollectionFrameworkMasterClass.Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        // here in normal map it checks the key, the hashcode of the class okay...
//        Map<String, Integer> map = new HashMap<>(); // this says key1 and key2 are equal right.

        // here identityhashmap deals with the hashcode of the object not the class so when using object they are different and has different hashcode so they are not equal okay.
        Map<String, Integer> map = new IdentityHashMap<>(); // and this says they are not equal.

        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(map);

    }
}
