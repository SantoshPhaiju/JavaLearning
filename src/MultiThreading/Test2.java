package MultiThreading;

public class Test2 {
    public static void main(String[] args) {
        Student engineeringStudent = new EngineeringStudent();
        String santosh = engineeringStudent.getBio("Santosh");
        System.out.println(santosh);
    }
}
