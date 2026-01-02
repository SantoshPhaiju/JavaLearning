package CollectionFrameworkMasterClass.Arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // learning java 8 comparator features for sorting of the elements in the arraylist

        List<Student> students = new ArrayList<>();
        students.add(new Student("Santosh", 3.9));
        students.add(new Student("Ronaldo", 2.2));
        students.add(new Student("Messi", 3.75));
        students.add(new Student("Neymar", 3.4));
        students.add(new Student("Alice", 2.2));

        // using lambda expression
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + " -> " + student.getGpa());
        }

        // using java 8 feature -> it is easy method (method reference is double column operator i.e. (::) )
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);


        for (Student student : students) {
            System.out.println(student.getName() + " -> " + student.getGpa());
        }
    }
}
