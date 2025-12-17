package EDJavaMultithreadingMasterClass;

public class Test2 {
    public static void main(String[] args) {
        EngineeringStudent engineeringStudent = new EngineeringStudent();
        String ram = engineeringStudent.getBio("Nabil");
        System.out.println(ram);

//        Student eStudent = (String name) -> {
//            return name + " is an engineering student";
//        };
        Student eStudent = name -> name + " is an engineering student";
        String santosh = eStudent.getBio("Santosh");
        System.out.println(santosh);
    }
}
