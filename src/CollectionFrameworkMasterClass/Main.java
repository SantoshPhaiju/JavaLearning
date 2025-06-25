package CollectionFrameworkMasterClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));

        System.out.println("For loop");
        myArrayList.forEach(System.out::println);

        System.out.println("contains: " + myArrayList.contains(1));
        System.out.println("contains: " + myArrayList.contains(20));

        ArrayList<String> students = new ArrayList<>();
        students.add("Santosh");
        students.add("Ssaugat");
        students.add("Rupesh");
        students.add("Alishan");

        System.out.println(students);
        students.set(1, "Saugat");
//        students.remove(2);
        students.remove(String.valueOf("Rupesh"));
        System.out.println(students.contains("Rupesh"));
        System.out.println(students);

        for (String student : students) {
            System.out.println("Student: " + student);
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + " " + students.get(i));
        }

        students.forEach(item -> {
            System.out.println("Student foreach: " + item);
        });

        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println("Student iterator: " + iterator.next());
        }

    }
}
