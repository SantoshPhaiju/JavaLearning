package CollectionFrameworkMasterClass.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        // these are immutable maps.
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("d", 4); // throws exception
        // limits the number of entries in the map to 10
        Map<String, Integer> map3 = Map.of("a", 1, "b", 2, "c", 3);
//        map3.put("d", 4); // throws exception

        // you can keep more than 10 entries here no limitations
        Map<String, Integer> map4 = Map.ofEntries(
                Map.entry("akshit", 1),
                Map.entry("bibek", 2),
                Map.entry("cristiano", 3)
        );
    }
}
