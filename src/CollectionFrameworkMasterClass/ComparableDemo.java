package CollectionFrameworkMasterClass;

import CollectionFrameworks.ArrayList.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Santosh", 20));
        list.add(new Student("Saugat", 19));
        list.add(new Student("Alisha", 21));
        list.add(new Student("Meghna", 22));
        list.add(new Student("Raj", 20));

//        list.sort(null);
        // using comparator right
//        list.sort((o1, o2) -> o1.getAge() - o2.getAge());
//
//        list.forEach((student -> {
//            System.out.println(student.getName() + " " + student.getAge());
//        }));
//        System.out.println(list);


        // When do we use comparable, when we have to add default sorting in the class, whereas comparator is external sorting, used outside the class (and used when we have to write custom logic and can be multiple) and comparable is internal: used inside the class and used when we need to have a single sorting logic of a class.

        list.sort(null);
        System.out.println(list);

    }
}
