package CollectionFrameworkMasterClass.StreamMasterClass.StreamsTelusko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Santosh", "Navin", "Harsh", "John", "Kishor");
        List<Student> studentList = new ArrayList<>();
//        for (String name : names) {
//            studentList.add(new Student(name));
//        }

        // constructor reference
        studentList = names.stream()
//                .map(name -> new Student(name))
                .map(Student::new)
                .toList();
        System.out.println(studentList);

//        System.out.println(studentList);

        // Print everything in capital

//        List<String> uNames = names.stream()
//                .map(str -> str.toUpperCase()).toList();

        // method reference
        // syntax: ClassName::MethodName
        List<String> uNames = names.stream()
                .map(String::toUpperCase).toList();

        uNames.forEach(System.out::println); // using method reference
        System.out.println(names);
        System.out.println(uNames);

    }
}
