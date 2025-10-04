package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Santosh");
        studentsName.add("Messi");

        System.out.println(studentsName);
        studentsName.forEach(student -> {
            System.out.println("Hello " + student);
        });

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        System.out.println(myList);
        myList.remove(2); // removing from index
        System.out.println(myList);
        myList.remove(Integer.valueOf(5)); // removing from value
        System.out.println(myList);
        System.out.println("Size: " + myList.size());
        System.out.println("Index 2: " + myList.get(2));
//        myList.clear();
//        System.out.println("my list is empty" + myList);

        myList.set(2, 100);
        System.out.println(myList);
        System.out.println(myList.contains(50));

        for (Integer integer : myList) {
            System.out.println(integer * 2);
        }

    }
}
