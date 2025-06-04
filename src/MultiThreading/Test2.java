package MultiThreading;

public class Test2 {
    public static void main(String[] args) {
        Student engineeringStudent = new Student() {
            @Override
            public String getBio(String name) {
                return name + " is an engineering student";
            }
        };

        String santosh = engineeringStudent.getBio("Santosh");
        System.out.println(santosh);
    }
}
