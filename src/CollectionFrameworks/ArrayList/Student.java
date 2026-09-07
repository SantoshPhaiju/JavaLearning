package CollectionFrameworks.ArrayList;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // this thing is called the comparable being done okay
    @Override
    public int compareTo(Student o) {
        System.out.println("Comparing " + this.getName() + " = " + this.getAge() + " and " + " " + o.getName() + " = " + o.getAge());
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + '}';
    }
}
