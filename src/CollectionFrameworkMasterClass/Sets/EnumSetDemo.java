package CollectionFrameworkMasterClass.Sets;

import enums.Day;

import java.util.*;

class MyNewStudent {
    String name;
    int roll;
    int age;

    public MyNewStudent(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyNewStudent{" + "name=" + name + ", roll=" + roll + ", age=" + age + '}';
    }

    // when adding custom class to the map, remember to create the custom hashcode and equals method
    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        MyNewStudent student = (MyNewStudent) obj;
        return Objects.equals(name, student.name) && roll == student.roll;
    }
}

enum Permissions {
    READ,
    WRITE,
    DELETE,
    MODIFY
}

public class EnumSetDemo {
    public static void main(String[] args) {
        Set<Day> days = EnumSet.allOf(Day.class);
        System.out.println(days.contains(Day.MONDAY));
        System.out.println(days);

        EnumSet<Permissions> permissionsOfUserA = EnumSet.of(Permissions.READ, Permissions.WRITE);
        System.out.println(permissionsOfUserA);

        if (permissionsOfUserA.contains(Permissions.DELETE)) {
            System.out.println("User A has Delete permission");
        } else {
            System.out.println("User A does not have delete permission");
        }

        HashMap<Integer, Day> map = new HashMap<>();
        map.put(1, Day.MONDAY);
        map.put(2, Day.TUESDAY);
        map.put(3, Day.WEDNESDAY);
        System.out.println(map);
        for (Integer day : map.keySet()) {
            System.out.println(day + " -> " + map.get(day));
        }
        for (Map.Entry<Integer, Day> entry : map.entrySet()) {
            System.out.println(entry);
        }

        if (map.containsValue(Day.MONDAY)) {
            System.out.println("Monday is present in the map");
        }

        Map<Day, String> openingTimes = new HashMap<>();
        openingTimes.put(map.get(1), "9:00 AM");
        openingTimes.put(map.get(2), "10:00 AM");
        openingTimes.put(map.get(3), "11:00 AM");
        System.out.println(openingTimes);

        String openingTimeOfTuesday = openingTimes.get(map.get(2)) != null ? "Will be opened on Tuesday!" : "Will be remained closed on Tuesday!";
        System.out.println(openingTimeOfTuesday);

        // Sorry here we did some hashmap type of thing too 😂inside sets hehehe...
        Map<MyNewStudent, Integer> studentMark = new HashMap<>();
        MyNewStudent s1 = new MyNewStudent("Santosh", 1, 21);
        MyNewStudent s2 = new MyNewStudent("Saugat", 2, 21);
        MyNewStudent s3 = new MyNewStudent("Alisha", 3, 21);
        MyNewStudent s4 = new MyNewStudent("Santosh", 1, 21);


        studentMark.put(s1, 99);
        studentMark.put(s2, 98);
        studentMark.put(s3, 97);
        studentMark.put(s4, 100);

        System.out.println(studentMark);
        System.out.println("hashcode of s1: " + s1.hashCode());
        System.out.println("hashcode of s2: " + s2.hashCode());
        System.out.println("hashcode of s3: " + s3.hashCode());
        System.out.println("The mark of the student is: " + studentMark.get(s1));


    }
}
