package CollectionFrameworks.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GetStudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Santosh Phaiju", 20);
        Student student2 = new Student("Santosh 2", 20);
        Student student3 = new Student("Santosh 3", 20);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Student getStudent = students.getFirst();
        System.out.println(getStudent.getName());

        students.forEach(newStd -> {
            System.out.println(newStd.getName());
        });

        students.remove(student1);

        students.forEach(newStd -> {
            System.out.println("new loops " + newStd.getName());
        });

    }
}
