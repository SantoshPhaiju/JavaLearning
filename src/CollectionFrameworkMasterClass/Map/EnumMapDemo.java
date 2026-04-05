package CollectionFrameworkMasterClass.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        // it directly implements map interface hehehe

//        Map<Day, String> map = new HashMap<>();

        // enummap is a map which is backed by enum, it is used when we have a fixed set of values or need to work with enums, because it is efficient as the keys are fixed and we already have the hashcode of the enums right sir... and maintains insertion order.

        /**
         * Array of size same as enum
         * [_,"World", _, _, _];
         * no hashing as we have fixed size and we have alreay known index right..
         * ordinal/index is used to get the index of the enum
         * FASTER THAN HASHMAP in case of enums
         * Memory efficient too
         */
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.SUNDAY, "Hello");
        map.put(Day.MONDAY, "World");
        System.out.println(map);
        System.out.println(Day.TUESDAY.ordinal());

    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
